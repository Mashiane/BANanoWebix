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
End Sub

'add page to multi view
Sub AddPage(pg As WixPage, mv As WixMultiView)
	Page = pg
	Dim a As WixElement
	a.Initialize("mv_settings_cities").SetTemplate("Cities").SetTypeLine("")
	'
	Dim r1 As WixLayout
	r1.Initialize("r1")
	r1.AddRows(CreateToolBar.item)
	a.AddRows(r1.item)
	'
	Dim r2 As WixLayout
	r2.initialize("r2")
	r2.AddColumns(CreateDataTable.item)
	r2.AddColumnsResizer("")
	r2.AddColumns(CreateForm.item)
	a.AddRows(r2.Item)
	'
	mv.AddItem(a.Item)
End Sub

'controller code for the side menu
Sub ShowPage(pg As WixPage)
	Page = pg
	pg.Show("mv_settings_cities")
	LoadDataTable
	Page.Clear("formcities")
	Page.ClearValidation("formcities")
	Page.Show("btnnewcity")
	Page.HideMulti(Array("btncancelcity","btnsavecity","btndeletecity"))
End Sub


'double click grid activates edit
Sub dtcities_dblclick(arguements As Object)
	' turn edit on
	Dim item As Map = Page.GetSelectedItem("dtcities",False)
	If item <> Null Then
		Page.SetValues("formcities", item)
		Mode = "E"
		Page.HideMulti(Array("btnnewcity"))
		Page.ShowMulti(Array("btncancelcity","btnsavecity","btndeletecity"))
		Page.Focus("cities.value")
	End If
End Sub

'pressing insert / delete key
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
	Dim sqlite As BANanoSQLite
	sqlite.Initialize
	Dim qry As String = sqlite.DeleteWhere("cities", CreateMap("id":did))
	Dim res As String = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": Main.dbName, "data": qry))
	Dim rs As SQLiteResultSet = sqlite.GetResultSet(qry,res)
	Page.clear("formcities")
	Page.ClearValidation("formcities")
	Page.Show("btnnewcity")
	Page.HideMulti(Array("btncancelcity", "btnsavecity", "btndeletecity"))
	LoadDataTable
End Sub


Sub printcities_click
	Dim wp As WixPrint
	wp.Initialize
	wp.SetHeader(True)
	wp.SetFooter(True)
	wp.SetDocHeader("Cities")
	wp.SetModeLandScape(False)
	wp.SetDataAll(True)
	wp.SetDocFooter("BANanoWebix Multi-Page App")
	wp.SetPaperA4(True)
	Page.Print("dtcities",wp)
End Sub

Sub CreateToolBar As WixToolBar
	Dim toolbar1 As WixToolBar
	toolbar1.Initialize("tblcities").SetPadding(10)
	toolbar1.CreateLabel("lblcities").SetLabel("Cities").Pop
	toolbar1.AddSpacer
	'
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
	
	Dim cb As BANanoObject = BANano.CallBack(Me, "printcities_click", Null)
	toolbar1.CreateIcon("totalcities").SetIcon("mdi mdi-city").SetWidth(100).SetBadge("0").Pop
	toolbar1.CreateIcon("printcities").SetIcon("mdi mdi-printer").SetWidth(100).SetTooltip("Print the cities list").SetClick(cb).Pop
	Return toolbar1
End Sub


Sub CreateForm As WixForm
	Dim form As WixForm
	form.Initialize("formcities")
	form.SetName("formcities")
	form.SetElementsConfigJSON($"{"labelPosition":"top"}"$)
	'
	Dim id As WixText
	id.Initialize("cities.id")
	id.SetName("id")
	id.SetLabel("#")
	id.SetRequired("true")
	id.SetHidden(True)
	form.AddRows(id.Item)

	Dim value As WixText
	value.Initialize("cities.value")
	value.SetName("value")
	value.SetLabel("City Name")
	value.SetRequired("true")
	value.SetValidate("isNotEmpty")
	value.SetInvalidMessage("City name should be specified")
	form.AddRows(value.Item)
	'
	form.AddRowsSpacer("")
	'
	Return form
End Sub

Sub btncancelcity_click
	Mode = ""
	Page.Show("btnnewcity")
	Page.HideMulti(Array("btncancelcity","btnsavecity","btndeletecity"))
	Page.Clear("formcities")
	Page.ClearValidation("formcities")
	Page.Focus("cities.value")
End Sub

Sub btnnewcity_click
	Page.Hide("btnnewcity")
	Page.ShowMulti(Array("btncancelcity","btnsavecity","btndeletecity"))
	
	'clear the form
	Mode = "A"
	Page.Clear("formcities")
	Page.ClearValidation("formcities")
	Page.Focus("cities.value")
	'get next available id
	'initialize the helper class
	Dim sqlite As BANanoSQLite
	sqlite.Initialize
	'generate the create table sql
	Dim qry As String = sqlite.GetMax("cities", "id")
	'execute the create table command
	Dim res As String = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": Main.dbName, "data": qry))
	Dim rs As SQLiteResultSet = sqlite.GetResultSet(qry,res)
	Dim lastID As String = Page.GetNextID(rs.result)
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
			Dim sqlite As BANanoSQLite
			sqlite.Initialize
			Dim qry As String = sqlite.Insert("cities", rec)
			Dim res As String = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": Main.dbName, "data": qry))
			Dim rs As SQLiteResultSet = sqlite.GetResultSet(qry,res)
		Case "E"
			'updating an existing city
			Dim rec As Map = Page.GetValues("formcities")
			Dim eid As String = rec.Get("id")
			Dim sqlite As BANanoSQLite
			sqlite.Initialize
			Dim qry As String = sqlite.UpdateWhere("cities", rec, CreateMap("id":eid))
			Dim res As String = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": Main.dbName, "data": qry))
			Dim rs As SQLiteResultSet = sqlite.GetResultSet(qry,res)
	End Select
	Mode = ""
	Page.clear("formcities")
	Page.ClearValidation("formcities")
	Page.Show("btnnewcity")
	Page.HideMulti(Array("btncancelcity","btnsavecity","btndeletecity"))
	LoadDataTable
End Sub

Sub btndeletecity_click
	dtcities_keypress(46)
End Sub


Sub LoadDataTable
	Mode = ""
	Page.clearall("dtcities")
	Dim sqlite As BANanoSQLite
	sqlite.Initialize
	Dim qry As String = sqlite.SelectAll("cities", Array("id","value"), Array("value"))
	Dim res As String = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": Main.dbName, "data": qry))
	Dim rs As SQLiteResultSet = sqlite.GetResultSet(qry,res)
	Page.SetData("dtcities", rs.result)'
	
	Dim tc As Int = rs.result.size
	Page.SetBadge("totalcities", tc)

End Sub


Sub CreateDataTable As WixDataTable
	Dim dtcities As WixDataTable
	dtcities.Initialize("dtcities")
	dtcities.SetResizeColumn("true")
	dtcities.SetScroll("y")
	dtcities.SetHeaderBorders(True) 
	dtcities.SetSelect("row")
	'
	Dim id As WixDataColumn
	id.Initialize("id")
	id.SetHeader("#")
	id.SetAdjust(True)
	id.SetHeaderTextFilter(True)
	dtcities.AddDataColumns(id)
	'
	Dim value As WixDataColumn
	value.Initialize("value")
	value.SetHeader("City")
	value.SetSort("string")
	value.SetFillSpace(True)
	value.SetHeaderTextFilter(True)
	dtcities.AddDataColumns(value)
	
	'add events to the dtcities
	Dim arguements As Object
	dtcities.DataTable.OnItemDblClick(BANano.CallBack(Me,"dtcities_dblclick",Array(arguements)))
	dtcities.DataTable.OnKeyPress(BANano.CallBack(Me,"dtcities_keypress",Array(arguements)))
	Return dtcities
End Sub