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
	Private ourclients As BANanoSQL
	Private Mode As String
End Sub


'controller code for the side menu
Sub ClientHandler(pg As WixPage, menuitem As String)
	Page = pg
	Select Case menuitem
	Case "clients"
		pg.Show("mv_clients")
		SetPage(Page)
		LoadClients
		Page.Clear("formclients")
		Page.ClearValidation("formclients")
		Page.Show("btnnewclient")
		Page.HideMulti(Array("btncancelclient","btnsaveclient","btndeleteclient"))
	End Select
End Sub


Sub SetPage(pg As WixPage)
	Page = pg
	ourclients.OpenWait("ourclients", "ourclients")
End Sub

Sub AddToMultiView(pg As WixPage, mv As WixMultiView)
	Page = pg
	Dim dt1 As WixDataTable = CreateClientsDT
	Dim frm1 As WixForm = CreateClientForm
	
	Dim a As WixElement
	a.Initialize("mv_clients").SetTemplate("Clients").SetTypeLine("")
	Dim r1 As WixElement
	r1.Initialize("r1")
	r1.AddRows(CreateClientsToolBar.item)
	a.AddRows(r1.item)
	'
	Dim r2 As WixElement
	r2.initialize("r2")
	r2.AddColumns(dt1.item)
	r2.AddColumnsResizer("")
	r2.AddColumns(frm1.item)
	a.AddRows(r2.Item)
	'
	mv.AddItem(a.Item)
	SetPage(Page)
End Sub

Sub CreateClientsToolBar As WixToolBar
	Dim toolbar1 As WixToolBar
	toolbar1.Initialize("tlbclientsa")
	'
	toolbar1.CreateLabel("").SetLabel("Clients").Pop
	toolbar1.AddSpacer
	Dim cb As BANanoObject = BANano.CallBack(Me, "printclients_click", Null)
	toolbar1.CreateIcon("totalclients").SetIcon("mdi mdi-account-group").SetBadge("0").Pop
	toolbar1.CreateIcon("printclients").SetIcon("mdi mdi-printer").SetTooltip("Print the clients list").SetClick(cb).Pop
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
		Dim alasql As BANanoAlaSQL
		alasql.Initialize
		Dim rs As AlaSQLResultSet = alasql.SelectWhere("clients", Array("*"), CreateMap("id":eid), Array("id"))
		rs.Result = ourclients.ExecuteWait(rs.query, rs.args)
		If rs.result.Size > 0 Then
			item = rs.result.Get(0)
			RefreshOptions
			Page.SetValues("formclients", item)
			Mode = "E"
			Page.HideMulti(Array("btnnewclient"))
			Page.ShowMulti(Array("btncancelclient","btnsaveclient","btndeleteclient"))
			Page.Focus("clients.id")
		End If
	End If
End Sub

Sub RefreshOptions
	Dim alasql As BANanoAlaSQL
	alasql.Initialize
	Dim rs As AlaSQLResultSet = alasql.SelectAll("positions", Array("id","value"), Array("value"))
	rs.Result = ourclients.ExecuteWait(rs.query, rs.args)
	Page.AddNotSelected(rs.result)
	Page.SetOptions("position", rs.result)
	'
	alasql.Initialize
	Dim rs As AlaSQLResultSet = alasql.SelectAll("cities", Array("id","value"), Array("value"))
	rs.Result = ourclients.ExecuteWait(rs.query, rs.args)
	Page.AddNotSelected(rs.result)
	Page.SetOptions("city", rs.result)
		
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
	Dim alasql As BANanoAlaSQL
	alasql.Initialize
	Dim rs As AlaSQLResultSet = alasql.DeleteWhere("clients", CreateMap("id":did))
	rs.Result = ourclients.ExecuteWait(rs.query, rs.args)
	Page.clear("formclients")
	Page.ClearValidation("formclients")
	Page.Show("btnnewclient")
	Page.HideMulti(Array("btncancelclient", "btnsaveclient", "btndeleteclient"))
	LoadClients
End Sub


Sub CreateClientForm As WixForm
	Dim form As WixForm
	form.Initialize("formclients")
	form.SetElementsConfigJSON($"{"labelPosition":"top"}"$)
	
	Dim hdr As WixHeader
	hdr.Initialize("poshdr").SetTemplate("Clients")
	form.AddRows(hdr.Item)

	Dim r2 As WixElement
	r2.Initialize("r2").SetMargin(10)
	r2.SetTemplate("r2")
	
	Dim r1c1 As WixElement
	r1c1.Initialize("r1c1").SetMargin(10)
	
	Dim id As WixText
	id.Initialize("clients.id")
	id.SetLocalId("id")
	id.SetName("id")
	id.SetType("text")
	id.SetLabel("#")
	id.SetRequired(True)
	id.SetHidden(True)
	r1c1.AddRows(id.Item)

	Dim fname As WixText
	fname.Initialize("fname")
	fname.SetLocalId("fname")
	fname.SetName("fname")
	fname.SetType("text")
	fname.SetLabel("First Name")
	fname.SetRequired(True)
	fname.SetValidateIsNotEmpty(True)
	r1c1.AddRows(fname.Item)

	Dim lname As WixText
	lname.Initialize("lname")
	lname.SetLocalId("lname")
	lname.SetName("lname")
	lname.SetType("text")
	lname.SetLabel("Last Name")
	lname.SetRequired(True)
	lname.SetValidateIsNotEmpty(True)
	r1c1.AddRows(lname.Item)

	Dim position As WixCombo
	position.Initialize("position")
	position.SetName("position")
	position.SetLabel("Position")
	position.SetRequired(True)
	position.SetValidateIsNotEmpty(True)
	r1c1.AddRows(position.Item)

	Dim email As WixText
	email.Initialize("email")
	email.SetLocalId("email")
	email.SetName("email")
	email.SetType("text")
	email.SetLabel("Email")
	email.SetRequired(True)
	email.SetValidateIsEmail(True)
	r1c1.AddRows(email.Item)

	Dim city As WixCombo
	city.Initialize("city")
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
	address.Initialize("address")
	address.SetLocalId("address")
	address.SetName("address")
	address.SetType("text")
	address.SetLabel("Address")
	address.SetRequired(True)
	address.SetValidateIsNotEmpty(True)
	r1c2.AddRows(address.Item)

	Dim birthday As WixDatePicker
	birthday.Initialize("birthday")
	birthday.SetName("birthday")
	birthday.SetLabel("Birthday")
	birthday.SetFormat("%Y-%m-%d")
	birthday.SetStringResult(True)
	birthday.SetRequired(True)
	birthday.SetValidateIsNotEmpty(True)
	r1c2.AddRows(birthday.Item)

	Dim firstrequest As WixDatePicker
	firstrequest.Initialize("firstrequest")
	firstrequest.SetName("firstrequest")
	firstrequest.SetLabel("First Request")
	firstrequest.SetFormat("%Y-%m-%d")
	firstrequest.SetStringResult(True)
	firstrequest.SetRequired(True)
	firstrequest.SetValidateIsNotEmpty(True)
	r1c2.AddRows(firstrequest.Item)

	Dim phone As WixText
	phone.Initialize("phone")
	phone.SetLocalId("phone")
	phone.SetName("phone")
	phone.SetType("tel")
	phone.SetLabel("Phone")
	phone.SetRequired(True)
	phone.SetValidateIsNotEmpty(True)
	r1c2.AddRows(phone.Item)

	Dim notifications As WixRadio
	notifications.Initialize("notifications")
	notifications.SetName("notifications")
	notifications.SetLabel("Notifications")
	notifications.SetOptionsMAP(CreateMap("agree":"Agree","disagree":"Disagree"))
	r1c2.AddRows(notifications.Item)

	r2.AddColumns(r1c2.Item)
	form.AddRows(r2.Item)
	
	Dim r3 As WixElement
	r3.Initialize("r3").SetMargin(10)
	'
	Dim notes As WixTextArea
	notes.Initialize("notes")
	notes.SetName("notes")
	notes.SetLabel("Notes")
	notes.SetLocalId("notes")
	r3.AddRows(notes.Item)
	form.AddRows(r3.Item)
	'
	'form.AddRowsSpacer("")
	'
	Dim toolbar1 As WixToolBar
	toolbar1.Initialize("tlbclients")
	'
	Dim btnBack As WixIcon
	btnBack.Initialize("btnback")
	btnBack.SetIcon("mdi mdi-keyboard-backspace")
	btnBack.SetTooltip("Go back")
	btnBack.SetWidth("100")
	btnBack.SetClick(BANano.CallBack(Me,"btnback_click",Null))
	toolbar1.AddIcon(btnBack)
	
	toolbar1.AddSpacer
	 
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

	form.AddRows(toolbar1.Item)
	
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
	Page.Focus("clients.id")
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
	Page.Focus("clients.id")
	'get next available id
	'initialize the helper class
	Dim alaSQL As BANanoAlaSQL
	alaSQL.Initialize
	'generate the create table sql
	Dim rs As AlaSQLResultSet = alaSQL.GetMax("clients", "id")
	'execute the create table command
	rs.Result = ourclients.ExecuteWait(rs.query, rs.args)
	Dim lastID As Int
	If rs.result.Size = 0 Then
		lastID = 0
	Else
		'get the record
		Dim rec As Map = rs.result.get(0)
		Dim lID As String = rec.GetDefault("id","0")
		lastID = BANano.parseint(lID)
	End If
	lastID = lastID + 1
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
			Dim alaSQL As BANanoAlaSQL
			alaSQL.Initialize
			Dim rs As AlaSQLResultSet = alaSQL.Insert("clients", rec)
			rs.Result = ourclients.ExecuteWait(rs.query, rs.args)
		Case "E"
			'updating an existing city
			Dim rec As Map = Page.GetValues("formclients")
			Dim eid As String = rec.Get("id")
			Dim alaSQL As BANanoAlaSQL
			alaSQL.Initialize
			Dim rs As AlaSQLResultSet = alaSQL.UpdateWhere("clients", rec, CreateMap("id":eid))
			rs.Result = ourclients.ExecuteWait(rs.query, rs.args)
	End Select
	Mode = ""
	Page.clear("formclients")
	Page.ClearValidation("formclients")
	Page.Show("btnnewclient")
	Page.HideMulti(Array("btncancelclient","btnsaveclient","btndeleteclient"))
	LoadClients
End Sub

Sub btndeleteclient_click
	dtclients_keypress(46)
End Sub


Sub LoadClients()
	Mode = ""
	Page.clearall("dtclients")
	Dim alaSQL As BANanoAlaSQL
	alaSQL.Initialize
	Dim rs As AlaSQLResultSet = alaSQL.SelectAll("clients", Array("*"), Array("fname","lname"))
	rs.Result = ourclients.ExecuteWait(rs.query, rs.args)
	Page.SetData("dtclients", rs.result)
	'
	Dim tc As Int = rs.result.size
	Page.SetBadge("totalclients", tc)
End Sub

Sub CreateClientsDT As WixDataTable
	Dim dtclients As WixDataTable
	dtclients.Initialize("dtclients")
	dtclients.SetForm("formclients")
	dtclients.SetResizeColumn("true")
	dtclients.SetScroll("xy")
	dtclients.SetSelect("row")


	Dim id As WixDataColumn
	id.Initialize("id")
	id.SetName("id")
	id.SetHeader("#")
	dtclients.AddDataColumns(id)

	Dim fname As WixDataColumn
	fname.Initialize("fname")
	fname.SetHeader("First Name")
	fname.SetSort("string")
	fname.SetAdjust("data")
	dtclients.AddDataColumns(fname)

	Dim lname As WixDataColumn
	lname.Initialize("lname")
	lname.SetHeader("Last Name")
	lname.SetSort("string")
	lname.SetAdjust("data")
	dtclients.AddDataColumns(lname)

	Dim position As WixDataColumn
	position.Initialize("position")
	position.SetHeader("Position")
	position.SetSort("string")
	position.SetAdjust("data")
	'dtclients.AddDataColumns(position)

	Dim email As WixDataColumn
	email.Initialize("email")
	email.SetHeader("Email")
	email.SetSort("string")
	email.SetAdjust("data")
	dtclients.AddDataColumns(email)

	Dim city As WixDataColumn
	city.Initialize("city")
	city.SetHeader("City")
	city.SetSort("string")
	city.SetAdjust("data")
	'dtclients.AddDataColumns(city)

	Dim address As WixDataColumn
	address.Initialize("address")
	address.SetHeader("Address")
	address.SetAdjust("data")
	'dtclients.AddDataColumns(address)

	Dim birthday As WixDataColumn
	birthday.Initialize("birthday")
	birthday.SetHeader("Birth Day")
	birthday.SetSort("string")
	birthday.SetAdjust("data")
	birthday.SetFormat("%Y-%m-%d")
	dtclients.AddDataColumns(birthday)

	Dim firstrequest As WixDataColumn
	firstrequest.Initialize("firstrequest")
	firstrequest.SetHeader("First Request")
	firstrequest.SetSort("string")
	firstrequest.SetAdjust("data")
	firstrequest.SetFormat("%Y-%m-%d")
	dtclients.AddDataColumns(firstrequest)

	Dim phone As WixDataColumn
	phone.Initialize("phone")
	phone.SetHeader("Phone")
	phone.SetSort("string")
	phone.SetAdjust("data")
	dtclients.AddDataColumns(phone)

	Dim notifications As WixDataColumn
	notifications.Initialize("notifications")
	notifications.SetHeader("Notifications")
	notifications.SetSort("string")
	notifications.SetAdjust("data")
	'dtclients.AddDataColumns(notifications)
	'add events to the dtcities
	Dim arguements As Object
	dtclients.DataTable.OnItemDblClick(BANano.CallBack(Me,"dtclients_dblclick",Array(arguements)))
	dtclients.DataTable.OnKeyPress(BANano.CallBack(Me,"dtclients_keypress",Array(arguements)))
	Return dtclients
End Sub
