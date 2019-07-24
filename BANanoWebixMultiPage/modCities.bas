B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.51
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private BANano As BANano
	Private Mode As String
	Private Page As WixPage
	Private ourclients As BANanoSQL
End Sub

Sub SetPage(pg As WixPage)
	Page = pg
	ourclients.OpenWait("ourclients", "ourclients")
End Sub

Sub dtcities_dblclick(arguements As Object)
	' turn edit on
	Dim item As Map = Page.GetSelectedItem("dtcities",False)
	If item <> Null Then
		Page.SetValues("formcities", item)
		Mode = "E"
		Page.HideMulti(Array("btnnewcity"))
		Page.ShowMulti(Array("btncancelcity","btnsavecity","btndeletecity"))
		Page.Focus("cities.id")
	End If
End Sub

Sub dtcities_keypress(arguements As Object)
	Dim kCode As Int = BANano.parseInt(arguements)
	Select Case kCode
		Case 45
			'insert
			btnnewcity_click
		Case 46
			'delete
			Dim confirmresult As Boolean = False
			Dim cb As BANanoObject = BANano.CallBack(Me,"dtcities_delete",Array(confirmresult))
			Page.Confirm(cb, "Confirm Delete", "Are you sure you want to delete the selected city? You will not be able to undo your changes. Continue?")
	End Select
End Sub

Sub dtcities_delete(confirmresult As Boolean)
	If confirmresult = False Then Return
	Dim item As Map = Page.GetSelectedItem("dtcities",False)
	If item = Null Then Return
	Dim did As String = item.Get("id")
	'
	Dim alasql As BANanoAlaSQL
	alasql.Initialize
	Dim rs As AlaSQLResultSet = alasql.DeleteWhere("cities", CreateMap("id":did))
	rs.Result = ourclients.ExecuteWait(rs.query, rs.args)
	Page.clear("formcities")
	Page.ClearValidation("formcities")
	Page.Show("btnnewcity")
	Page.HideMulti(Array("btncancelcity", "btnsavecity", "btndeletecity"))
	LoadCities
End Sub

Sub CreateCitiesForm As WixForm
	Dim form As WixForm
	form.Initialize("formcities")
	form.SetName("formcities")
	form.SetElementsConfigJSON($"{"labelPosition":"top"}"$)
	
	Dim hdr As WixHeader
	hdr.Initialize("cityhdr").SetTemplate("Cities")
	form.AddRows(hdr.Item)
	
	Dim id As WixText
	id.Initialize("cities.id")
	id.SetLocalId("id")
	id.SetName("id")
	id.SetType("text")
	id.SetLabel("#")
	id.SetRequired("true")
	id.SetHidden(True)
	form.AddRows(id.Item)

	Dim value As WixText
	value.Initialize("cities.value")
	value.SetLocalId("value")
	value.SetName("value")
	value.SetType("text")
	value.SetLabel("City Name")
	value.SetRequired("true")
	value.SetValidate("isNotEmpty")
	value.SetInvalidMessage("City name should be specified")
	form.AddRows(value.Item)
	'
	form.AddRowsSpacer("")
	'
	Dim toolbar1 As WixToolBar
	toolbar1.Initialize("tlbcities")
	'
	Dim btnBack As WixIcon
	btnBack.Initialize("btnback")
	btnBack.SetIcon("mdi mdi-keyboard-backspace")
	btnBack.SetTooltip("Go back")
	btnBack.SetWidth("100")
	btnBack.SetClick(BANano.CallBack(Me,"btnback_click",Null))
	toolbar1.AddIcon(btnBack)
	
	toolbar1.AddSpacer
	 
	Dim btnnewcity As WixIcon
	btnnewcity.Initialize("btnnewcity")
	btnnewcity.SetIcon("mdi mdi-plus")
	btnnewcity.SetTooltip("Add a new city")
	btnnewcity.SetWidth("100")
	btnnewcity.SetClick(BANano.callback(Me,"btnnewcity_click",Null))
	toolbar1.AddIcon(btnnewcity)

	Dim btncancelcity As WixIcon
	btncancelcity.Initialize("btncancelcity")
	btncancelcity.SetIcon("mdi mdi-cancel")
	btncancelcity.SetTooltip("Cancel new city")
	btncancelcity.SetWidth("100")
	btncancelcity.SetClick(BANano.CallBack(Me,"btncancelcity_click",Null))
	btncancelcity.SetHidden(True)
	toolbar1.AddIcon(btncancelcity)
	

	Dim btnsavecity As WixIcon
	btnsavecity.Initialize("btnsavecity")
	btnsavecity.SetIcon("mdi mdi-content-save")
	btnsavecity.SetTooltip("Save the city")
	btnsavecity.SetWidth("100")
	btnsavecity.SetClick(BANano.callback(Me,"btnsavecity_click",Null))
	btnsavecity.SetHidden(True)
	toolbar1.AddIcon(btnsavecity)

	Dim btndeletecity As WixIcon
	btndeletecity.Initialize("btndeletecity")
	btndeletecity.SetIcon("mdi mdi-trash-can")
	btndeletecity.SetTooltip("Delete city")
	btndeletecity.SetWidth("100")
	btndeletecity.SetClick(BANano.callback(Me,"btndeletecity_click",Null))
	btndeletecity.SetHidden(True)
	toolbar1.AddIcon(btndeletecity)

	form.AddRows(toolbar1.Item)
	
	Return form
End Sub

Sub btncancelcity_click
	Mode = ""
	Page.Show("btnnewcity")
	Page.Hide("btncancelcity")
	Page.Hide("btnsavecity")
	Page.Hide("btndeletecity")
	Page.Clear("formcities")
	Page.ClearValidation("formcities")
	Page.Focus("cities.id")
End Sub

Sub btnnewcity_click
	Page.Hide("btnnewcity")
	Page.Show("btncancelcity")
	Page.Show("btnsavecity")
	Page.Hide("btndeletecity")
	
	'clear the form
	Mode = "A"
	Page.Clear("formcities")
	Page.ClearValidation("formcities")
	Page.Focus("cities.id")
	'get next available id
	'initialize the helper class
	Dim alaSQL As BANanoAlaSQL
	alaSQL.Initialize
	'generate the create table sql
	Dim rs As AlaSQLResultSet = alaSQL.GetMax("cities", "id")
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
	Page.SetValue("cities.id", lastID)
End Sub

Sub btnsavecity_click
	'validate the form
	Dim bValidate As Boolean = Page.Validate("formcities")
	If bValidate = False Then
		Page.Message_Error("There are some missing contents for this record, please rectify!")
		Return
	End If
	
	Select Case Mode
		Case "A"
			'adding a new city
			Dim rec As Map = Page.GetValues("formcities")
			Dim alaSQL As BANanoAlaSQL
			alaSQL.Initialize
			Dim rs As AlaSQLResultSet = alaSQL.Insert("cities", rec)
			rs.Result = ourclients.ExecuteWait(rs.query, rs.args)
		Case "E"
			'updating an existing city
			Dim rec As Map = Page.GetValues("formcities")
			Dim eid As String = rec.Get("id")
			Dim alaSQL As BANanoAlaSQL
			alaSQL.Initialize
			Dim rs As AlaSQLResultSet = alaSQL.UpdateWhere("cities", rec, CreateMap("id":eid))
			rs.Result = ourclients.ExecuteWait(rs.query, rs.args)
	End Select
	Mode = ""
	Page.clear("formcities")
	Page.ClearValidation("formcities")
	Page.Show("btnnewcity")
	Page.HideMulti(Array("btncancelcity","btnsavecity","btndeletecity"))
	LoadCities
End Sub

Sub btndeletecity_click
	dtcities_keypress(46)
End Sub


Sub LoadCities()
	Mode = ""
	Page.clearall("dtcities")
	Dim alaSQL As BANanoAlaSQL
	alaSQL.Initialize
	Dim rs As AlaSQLResultSet = alaSQL.SelectAll("cities", Array("id","value"), Array("value"))
	rs.Result = ourclients.ExecuteWait(rs.query, rs.args)
	Page.SetData("dtcities", rs.result)
End Sub


Sub CreateCitiesDT As WixDataTable
	Dim dtcities As WixDataTable
	dtcities.Initialize("dtcities")
	dtcities.SetResizeColumn("true")
	dtcities.SetScroll("y")
	dtcities.SetSelect("row")
	'
	Dim id As WixDataColumn
	id.Initialize("id")
	id.SetHeader("#")
	dtcities.AddDataColumns(id)
	'
	Dim value As WixDataColumn
	value.Initialize("value")
	value.SetHeader("City")
	value.SetSort("string")
	value.SetAdjustData(True)
	dtcities.AddDataColumns(value)
	
	'add events to the dtcities
	Dim arguements As Object
	dtcities.DataTable.OnItemDblClick(BANano.CallBack(Me,"dtcities_dblclick",Array(arguements)))
	dtcities.DataTable.OnKeyPress(BANano.CallBack(Me,"dtcities_keypress",Array(arguements)))
	Return dtcities
End Sub