B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.51
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private Page As WixPage
	Private BANano As BANano
	Private Mode As String
End Sub

'controller code for the side menu
Sub ShowPage(pg As WixPage)
	Page = pg
	pg.Show("mv_clients")
	LoadDataTable
	Page.Clear("formclients")
	Page.ClearValidation("formclients")
	Page.Show("btnnewclient")
	Page.HideMulti(Array("btncancelclient","btnsaveclient","btndeleteclient"))
End Sub

Sub AddPage(pg As WixPage, mv As WixMultiView)
	Page = pg
	Dim a As WixElement
	a.Initialize("mv_clients").SetTemplate("Clients").SetTypeLine("")
	Dim r1 As WixElement
	r1.Initialize("r1")
	r1.AddRows(CreateToolBar.item)
	a.AddRows(r1.item)
	'
	Dim r2 As WixElement
	r2.initialize("r2")
	r2.AddColumns(CreateDataTable.item)
	r2.AddColumnsResizer("")
	r2.AddColumns(CreateForm.item)
	a.AddRows(r2.Item)
	'
	mv.AddItem(a.Item)
End Sub

Sub CreateToolBar As WixToolBar
	Dim toolbar1 As WixToolBar
	toolbar1.Initialize("tlbclientsa").SetPadding(10)
	'
	toolbar1.CreateLabel("").SetLabel("Clients").Pop
	toolbar1.AddSpacer
	'
	Dim btnnewclient As WixIcon
	btnnewclient.Initialize("btnnewclient")
	btnnewclient.SetIcon("mdi mdi-plus")
	btnnewclient.SetTooltip("Add a new client")
	btnnewclient.SetWidth("100")
	btnnewclient.SetClick(BANano.callback(Me,"btnnewclient_click",Null))
	toolbar1.AddIcon(btnnewclient)

	Dim btncancelclient As WixIcon
	btncancelclient.Initialize("btncancelclient")
	btncancelclient.SetIcon("mdi mdi-cancel")
	btncancelclient.SetTooltip("Cancel new client")
	btncancelclient.SetWidth("100")
	btncancelclient.SetClick(BANano.CallBack(Me,"btncancelclient_click",Null))
	btncancelclient.SetHidden(True)
	toolbar1.AddIcon(btncancelclient)
	

	Dim btnsaveclient As WixIcon
	btnsaveclient.Initialize("btnsaveclient")
	btnsaveclient.SetIcon("mdi mdi-content-save")
	btnsaveclient.SetTooltip("Save the client")
	btnsaveclient.SetWidth("100")
	btnsaveclient.SetClick(BANano.callback(Me,"btnsaveclient_click",Null))
	btnsaveclient.SetHidden(True)
	toolbar1.AddIcon(btnsaveclient)

	Dim btndeleteclient As WixIcon
	btndeleteclient.Initialize("btndeleteclient")
	btndeleteclient.SetIcon("mdi mdi-trash-can")
	btndeleteclient.SetTooltip("Delete client")
	btndeleteclient.SetWidth("100")
	btndeleteclient.SetClick(BANano.callback(Me,"btndeleteclient_click",Null))
	btndeleteclient.SetHidden(True)
	toolbar1.AddIcon(btndeleteclient)

	Dim cb As BANanoObject = BANano.CallBack(Me, "printclients_click", Null)
	toolbar1.CreateIcon("totalclients").SetIcon("mdi mdi-account-group").SetWidth(100).SetBadge("0").Pop
	toolbar1.CreateIcon("printclients").SetIcon("mdi mdi-printer").SetWidth(100).SetTooltip("Print the clients list").SetClick(cb).Pop
	
	Return toolbar1
End Sub

Sub printclients_click
	Dim wp As WixPrint
	wp.Initialize
	wp.SetHeader(True)
	wp.SetFooter(True)
	wp.SetDocHeader("Clients")
	wp.SetModeLandScape(True)
	wp.SetDataAll(True)
	wp.SetDocFooter("BANanoWebix Multi-Page App")
	wp.SetPaperA4(True)       
	Page.Print("dtclients",wp)
End Sub


Sub dtclients_dblclick(arguements As Object)
	' turn edit on
	Dim item As Map = Page.GetSelectedItem("dtclients",False)
	If item <> Null Then
		Dim eid As String = item.GetDefault("id","0")
		Dim sqlite As BANanoSQLite
		sqlite.Initialize
		Dim qry As String = sqlite.SelectWhere("clients", Array("*"), CreateMap("id":eid), Array("id"))
		Dim res As String = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": Main.dbName, "data": qry))
		Dim rs As SQLiteResultSet = sqlite.GetResultSet(qry,res)
		If rs.result.Size > 0 Then
			item = rs.result.Get(0)
			RefreshOptions
			Page.SetValues("formclients", item)
			Mode = "E"
			Page.HideMulti(Array("btnnewclient"))
			Page.ShowMulti(Array("btncancelclient","btnsaveclient","btndeleteclient"))
			Page.Focus("clients.fname")
		End If
	End If
End Sub

Sub RefreshOptions
	Dim sqlite As BANanoSQLite
	sqlite.Initialize
	Dim qry As String = sqlite.SelectAll("positions", Array("id","value"), Array("value"))
	Dim res As String = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": Main.dbName, "data": qry))
	Dim rs As SQLiteResultSet = sqlite.GetResultSet(qry,res)
	Page.AddNotSelected(rs.result)
	Page.SetOptions("clients.position", rs.result)
	'
	sqlite.Initialize
	Dim qry As String = sqlite.SelectAll("cities", Array("id","value"), Array("value"))
	Dim res As String = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": Main.dbName, "data": qry))
	Dim rs As SQLiteResultSet = sqlite.GetResultSet(qry,res)
	Page.AddNotSelected(rs.result)
	Page.SetOptions("clients.city", rs.result)
		
End Sub

Sub dtclients_keypress(arguements As Object)
	Dim kCode As Int = BANano.parseInt(arguements)
	Select Case kCode
		Case 45
			'insert
			btnnewclient_click
		Case 46
			'delete
			Dim confirmresult As Boolean = False
			Dim cb As BANanoObject = BANano.CallBack(Me,"dtclients_delete",Array(confirmresult))
			Page.Confirm(cb, "Confirm Delete", "Are you sure you want to delete the selected client? You will not be able to undo your changes. Continue?")
	End Select
End Sub

Sub dtclients_delete(confirmresult As Boolean)
	If confirmresult = False Then Return
	Dim item As Map = Page.GetSelectedItem("dtclients",False)
	If item = Null Then Return
	Dim did As String = item.Get("id")
	'
	Dim sqlite As BANanoSQLite
	sqlite.Initialize
	Dim qry As String = sqlite.DeleteWhere("clients", CreateMap("id":did))
	Dim res As String = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": Main.dbName, "data": qry))
	Dim rs As SQLiteResultSet = sqlite.GetResultSet(qry,res)
	Page.clear("formclients")
	Page.ClearValidation("formclients")
	Page.Show("btnnewclient")
	Page.HideMulti(Array("btncancelclient", "btnsaveclient", "btndeleteclient"))
	LoadDataTable
End Sub


Sub CreateForm As WixForm
	Dim form As WixForm
	form.Initialize("formclients")
	form.SetElementsConfigJSON($"{"labelPosition":"top"}"$)
	
	Dim r2 As WixElement
	r2.Initialize("r2").SetMargin(10)
	r2.SetTemplate("r2")
	
	Dim r1c1 As WixElement
	r1c1.Initialize("r1c1").SetMargin(10)
	
	Dim id As WixText
	id.Initialize("clients.id")
	id.SetName("id")
	id.SetLabel("#")
	id.SetRequired(True)
	id.SetHidden(True)
	r1c1.AddRows(id.Item)

	Dim fname As WixText
	fname.Initialize("clients.fname")
	fname.SetName("fname")
	fname.SetLabel("First Name")
	fname.SetRequired(True)
	fname.SetValidateIsNotEmpty(True)
	r1c1.AddRows(fname.Item)

	Dim lname As WixText
	lname.Initialize("clients.lname")
	lname.SetName("lname")
	lname.SetLabel("Last Name")
	lname.SetRequired(True)
	lname.SetValidateIsNotEmpty(True)
	r1c1.AddRows(lname.Item)

	Dim position As WixCombo
	position.Initialize("clients.position")
	position.SetName("position")
	position.SetLabel("Position")
	position.SetRequired(True)
	position.SetValidateIsNotEmpty(True)
	r1c1.AddRows(position.Item)

	Dim email As WixText
	email.Initialize("clients.email")
	email.SetName("email")
	email.SetLabel("Email")
	email.SetRequired(True)
	email.SetValidateIsEmail(True)
	r1c1.AddRows(email.Item)

	Dim city As WixCombo
	city.Initialize("clients.city")
	city.SetName("city")
	city.SetLabel("City")
	city.SetRequired(True)
	city.SetValidateIsNotEmpty(True)
	r1c1.AddRows(city.Item)

	r2.AddColumns(r1c1.Item)
	'
	Dim r1c2 As WixElement
	r1c2.Initialize("r1c2")
	r1c2.SetTemplate("column1").SetMargin(10)

	Dim address As WixText
	address.Initialize("clients.address")
	address.SetName("address")
	address.SetLabel("Address")
	address.SetRequired(True)
	address.SetValidateIsNotEmpty(True)
	r1c2.AddRows(address.Item)

	Dim birthday As WixDatePicker
	birthday.Initialize("clients.birthday")
	birthday.SetName("birthday")
	birthday.SetLabel("Birthday")
	birthday.SetFormat("%Y-%m-%d")
	birthday.SetEditable(True)
	birthday.SetStringResult(True)
	birthday.SetRequired(True)
	birthday.SetValidateIsNotEmpty(True)
	r1c2.AddRows(birthday.Item)

	Dim firstrequest As WixDatePicker
	firstrequest.Initialize("clients.firstrequest")
	firstrequest.SetName("firstrequest")
	firstrequest.SetLabel("First Request")
	firstrequest.SetFormat("%Y-%m-%d")
	firstrequest.SetEditable(True)
	firstrequest.SetStringResult(True)
	firstrequest.SetRequired(True)
	firstrequest.SetValidateIsNotEmpty(True)
	r1c2.AddRows(firstrequest.Item)

	Dim phone As WixText
	phone.Initialize("clients.phone")
	phone.SetName("phone")
	phone.SetType("tel")
	phone.SetLabel("Phone")
	phone.SetRequired(True)
	phone.SetValidateIsNotEmpty(True)
	r1c2.AddRows(phone.Item)

	Dim notifications As WixRadio
	notifications.Initialize("clients.notifications")
	notifications.SetName("notifications")
	notifications.SetLabel("Notifications")
	notifications.SetOptionsMAP(CreateMap("Agree":"Agree","Disagree":"Disagree"))
	r1c2.AddRows(notifications.Item)

	r2.AddColumns(r1c2.Item)
	form.AddRows(r2.Item)
	
	Dim r3 As WixElement
	r3.Initialize("r3").SetMargin(10)
	'
	Dim notes As WixTextArea
	notes.Initialize("clients.notes")
	notes.SetName("notes")
	notes.SetLabel("Notes")
	r3.AddRows(notes.Item)
	form.AddRows(r3.Item)
	'
	form.AddRowsSpacer("")
	
	
	Return form
End Sub

Sub btncancelclient_click
	Mode = ""
	Page.Show("btnnewclient")
	Page.Hide("btncancelclient")
	Page.Hide("btnsaveclient")
	Page.Hide("btndeleteclient")
	Page.Clear("formclients")
	Page.ClearValidation("formclients")
	Page.Focus("clients.fname")
End Sub

Sub btnnewclient_click
	Page.Hide("btnnewclient")
	Page.Show("btncancelclient")
	Page.Show("btnsaveclient")
	Page.Hide("btndeleteclient")
	
	'clear the form
	Mode = "A"
	Page.Clear("formclients")
	Page.ClearValidation("formclients")
	Page.Focus("clients.fname")
	'get next available id
	'initialize the helper class
	Dim sqlite As BANanoSQLite
	sqlite.Initialize
	'generate the create table sql
	Dim qry As String = sqlite.GetMax("clients", "id")
	Dim res As String = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": Main.dbName, "data": qry))
	Dim rs As SQLiteResultSet = sqlite.GetResultSet(qry,res)
	Dim lastID As String = Page.GetNextID(rs.result)
	Page.SetValue("clients.id", lastID)
	'
	RefreshOptions
End Sub

Sub btnsaveclient_click
	'validate the form
	Dim bValidate As Boolean = Page.Validate("formclients")
	If bValidate = False Then
		Page.Message_Error("There are some missing contents for this record, please rectify!")
		Return
	End If
	
	Select Case Mode
		Case "A"
			'adding a new city
			Dim rec As Map = Page.GetValues("formclients")
			Dim sqlite As BANanoSQLite
			sqlite.Initialize
			Dim qry As String = sqlite.Insert("clients", rec)
			Dim res As String = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": Main.dbName, "data": qry))
			Dim rs As SQLiteResultSet = sqlite.GetResultSet(qry,res)
		Case "E"
			'updating an existing city
			Dim rec As Map = Page.GetValues("formclients")
			Dim eid As String = rec.Get("id")
			Dim sqlite As BANanoSQLite
			sqlite.Initialize
			Dim qry As String = sqlite.UpdateWhere("clients", rec, CreateMap("id":eid))
			Dim res As String = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": Main.dbName, "data": qry))
			Dim rs As SQLiteResultSet = sqlite.GetResultSet(qry,res)
	End Select
	Mode = ""
	Page.clear("formclients")
	Page.ClearValidation("formclients")
	Page.Show("btnnewclient")
	Page.HideMulti(Array("btncancelclient","btnsaveclient","btndeleteclient"))
	LoadDataTable
End Sub

Sub btndeleteclient_click
	dtclients_keypress(46)
End Sub


Sub LoadDataTable
	Mode = ""
	Page.clearall("dtclients")
	Dim sqlite As BANanoSQLite
	sqlite.Initialize
	Dim qry As String = sqlite.SelectAll("clients", Array("*"), Array("fname","lname"))
	Dim res As String = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": Main.dbName, "data": qry))
	Dim rs As SQLiteResultSet = sqlite.GetResultSet(qry,res)
	Page.SetData("dtclients", rs.result)
	'
	Dim tc As Int = rs.result.size
	Page.SetBadge("totalclients", tc)
End Sub

Sub CreateDataTable As WixDataTable
	Dim dtclients As WixDataTable
	dtclients.Initialize("dtclients")
	dtclients.SetForm("formclients")
	dtclients.SetResizeColumn("true")
	dtclients.SetScroll("xy")
	dtclients.SetSelect("row")
	dtclients.SetHeaderBorders(True)


	Dim id As WixDataColumn
	id.Initialize("id")
	id.SetName("id")
	id.SetHeader("#")
	id.SetAdjust(True)
	id.SetHeaderTextFilter(True)
	dtclients.AddDataColumns(id)

	Dim fname As WixDataColumn
	fname.Initialize("fname")
	fname.SetHeader("First Name")
	fname.SetSort("string")
	fname.SetAdjust(True)
	fname.SetHeaderTextFilter(True)
	dtclients.AddDataColumns(fname)

	Dim lname As WixDataColumn
	lname.Initialize("lname")
	lname.SetHeader("Last Name")
	lname.SetSort("string")
	lname.SetAdjust(True)
	lname.SetHeaderTextFilter(True)
	dtclients.AddDataColumns(lname)

	Dim position As WixDataColumn
	position.Initialize("position")
	position.SetHeader("Position")
	position.SetSort("string")
	position.SetAdjust(True)
	position.SetHeaderTextFilter(True)
	'dtclients.AddDataColumns(position)

	Dim email As WixDataColumn
	email.Initialize("email")
	email.SetHeader("Email")
	email.SetSort("string")
	email.SetAdjust(True)
	email.SetHeaderTextFilter(True)
	dtclients.AddDataColumns(email)

	Dim city As WixDataColumn
	city.Initialize("city")
	city.SetHeader("City")
	city.SetSort("string")
	city.SetAdjust(True)
	city.SetHeaderTextFilter(True)
	'dtclients.AddDataColumns(city)

	Dim address As WixDataColumn
	address.Initialize("address")
	address.SetHeader("Address")
	address.SetSort("string")
	address.SetAdjust(True)
	address.SetHeaderTextFilter(True)
	dtclients.AddDataColumns(address)

	Dim birthday As WixDataColumn
	birthday.Initialize("birthday")
	birthday.SetHeader("Birth Day")
	birthday.SetSort("string")
	birthday.SetAdjust(True)
	birthday.SetFormat(Page.DateToStr("%Y-%m-%d"))
	birthday.SetHeaderDateFilter(True)
	dtclients.AddDataColumns(birthday)

	Dim firstrequest As WixDataColumn
	firstrequest.Initialize("firstrequest")
	firstrequest.SetHeader("First Request")
	firstrequest.SetSort("string")
	firstrequest.SetAdjust(True)
	firstrequest.SetFormat(Page.DateToStr("%Y-%m-%d"))
	firstrequest.SetHeaderDateFilter(True)
	dtclients.AddDataColumns(firstrequest)

	Dim phone As WixDataColumn
	phone.Initialize("phone")
	phone.SetHeader("Phone")
	phone.SetSort("string")
	phone.SetAdjust(True)
	phone.SetHeaderDateFilter(True)
	dtclients.AddDataColumns(phone)

	Dim notifications As WixDataColumn
	notifications.Initialize("notifications")
	notifications.SetHeader("Notifications")
	notifications.SetSort("string")
	notifications.SetAdjust(True)
	notifications.SetHeaderDateFilter(True)
	dtclients.AddDataColumns(notifications)
	'add events to the dtcities
	Dim arguements As Object
	dtclients.DataTable.OnItemDblClick(BANano.CallBack(Me,"dtclients_dblclick",Array(arguements)))
	dtclients.DataTable.OnKeyPress(BANano.CallBack(Me,"dtclients_keypress",Array(arguements)))
	Return dtclients
End Sub
