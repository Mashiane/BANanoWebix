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
			'modPositions.LoadPositions
			'Page.Clear("formpositions")
			'Page.ClearValidation("formpositions")
			'Page.Show("btnnewposition")
			'Page.HideMulti(Array("btncancelposition","btnsaveposition","btndeleteposition"))
	End Select
End Sub


Sub SetPage(pg As WixPage)
	Page = pg
	ourclients.OpenWait("ourclients", "ourclients")
End Sub

Sub AddToMultiView(pg As WixPage, mv As WixMultiView)
	Page = pg
	'Dim dt1 As WixDataTable = modPositions.CreatePositionsDT
	Dim frm1 As WixForm = CreateClientForm
	
	Dim a As WixElement
	a.Initialize("mv_clients").SetTemplate("Clients").SetTypeLine("")
	'a.AddColumns(dt1.item)
	a.AddColumnsResizer("")
	a.AddColumns(frm1.item)
	'
	mv.AddItem(a.Item)
End Sub


Sub CreateClientForm As WixForm
	Dim form As WixForm
	form.Initialize("formclients")
	form.SetElementsConfigJSON($"{"labelPosition":"top"}"$)
	
	Dim hdr As WixHeader
	hdr.Initialize("poshdr").SetTemplate("Clients")
	form.AddRows(hdr.Item)

	Dim r2 As WixElement
	r2.Initialize("r2")
	r2.SetTemplate("r2")
	
	Dim r1c1 As WixElement
	r1c1.Initialize("r1c1").SetMargin(10)
	
	Dim id As WixText
	id.Initialize("clients.id")
	id.SetLocalId("id")
	id.SetName("id")
	id.SetType("text")
	id.SetLabel("#")
	r1c1.AddRows(id.Item)

	Dim fname As WixText
	fname.Initialize("fname")
	fname.SetLocalId("fname")
	fname.SetName("fname")
	fname.SetType("text")
	fname.SetLabel("First Name")
	r1c1.AddRows(fname.Item)

	Dim lname As WixText
	lname.Initialize("lname")
	lname.SetLocalId("lname")
	lname.SetName("lname")
	lname.SetType("text")
	lname.SetLabel("Last Name")
	r1c1.AddRows(lname.Item)

	Dim position As WixCombo
	position.Initialize("position")
	position.SetName("position")
	position.SetLabel("Position")
	r1c1.AddRows(position.Item)

	Dim email As WixText
	email.Initialize("email")
	email.SetLocalId("email")
	email.SetName("email")
	email.SetType("text")
	email.SetLabel("Email")
	r1c1.AddRows(email.Item)

	Dim city As WixCombo
	city.Initialize("city")
	city.SetName("city")
	city.SetLabel("City")
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
	r1c2.AddRows(address.Item)

	Dim birthday As WixDatePicker
	birthday.Initialize("birthday")
	birthday.SetName("birthday")
	birthday.SetType("text")
	birthday.SetLabel("Birthday")
	birthday.SetFormat("%Y-%m-%d")
	r1c2.AddRows(birthday.Item)

	Dim firstrequest As WixDatePicker
	firstrequest.Initialize("firstrequest")
	firstrequest.SetName("firstrequest")
	firstrequest.SetLabel("First Request")
	firstrequest.SetType("text")
	firstrequest.SetFormat("%Y-%m-%d")
	r1c2.AddRows(firstrequest.Item)

	Dim phone As WixText
	phone.Initialize("phone")
	phone.SetLocalId("phone")
	phone.SetName("phone")
	phone.SetType("tel")
	phone.SetLabel("Phone")
	r1c2.AddRows(phone.Item)

	Dim notifications As WixRadio
	notifications.Initialize("notifications")
	notifications.SetName("notifications")
	notifications.SetLabel("Notifications")
	notifications.SetOptionsMAP(CreateMap("agree":"Agree","disagree":"Disagree"))
	r1c2.AddRows(notifications.Item)

	r2.AddColumns(r1c2.Item)
	form.AddRows(r2.Item)
	'
	form.AddRowsSpacer("")
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
	'LoadClients
End Sub

Sub btndeleteclient_click
	'dtclients_keypress(46)
End Sub
