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

Sub AddPage(pg As WixPage, mv As WixMultiView)
	Page = pg
	
	Dim a As WixElement
	a.Initialize("mv_settings_positions").SetTemplate("Positions").SetTypeLine("")
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


Sub printpositions_click
	Dim wp As WixPrint
	wp.Initialize
	wp.SetHeader(True)
	wp.SetFooter(True)
	wp.SetDocHeader("Positions")
	wp.SetModeLandScape(False)
	wp.SetDataAll(True)
	wp.SetDocFooter("BANanoWebix Multi-Page App")
	wp.SetPaperA4(True)
	Page.Print("dtpositions",wp)
End Sub


Sub CreateToolBar As WixToolBar
	Dim toolbar1 As WixToolBar
	toolbar1.Initialize("").SetPadding(10)
	toolbar1.CreateLabel("").SetLabel("Positions").Pop
	toolbar1.AddSpacer
	'
	Dim btnnewposition As WixIcon
	btnnewposition.Initialize("btnnewposition")
	btnnewposition.SetIcon("mdi mdi-plus")
	btnnewposition.SetTooltip("Add a new position")
	btnnewposition.SetWidth("100")
	btnnewposition.SetClick(BANano.callback(Me,"btnnewposition_click",Null))
	toolbar1.AddIcon(btnnewposition)

	Dim btncancelposition As WixIcon
	btncancelposition.Initialize("btncancelposition")
	btncancelposition.SetIcon("mdi mdi-cancel")
	btncancelposition.SetTooltip("Cancel new position")
	btncancelposition.SetWidth("100")
	btncancelposition.SetClick(BANano.CallBack(Me,"btncancelposition_click",Null))
	btncancelposition.SetHidden(True)
	toolbar1.AddIcon(btncancelposition)
	

	Dim btnsaveposition As WixIcon
	btnsaveposition.Initialize("btnsaveposition")
	btnsaveposition.SetIcon("mdi mdi-content-save")
	btnsaveposition.SetTooltip("Save the position")
	btnsaveposition.SetWidth("100")
	btnsaveposition.SetClick(BANano.callback(Me,"btnsaveposition_click",Null))
	btnsaveposition.SetHidden(True)
	toolbar1.AddIcon(btnsaveposition)

	Dim btndeleteposition As WixIcon
	btndeleteposition.Initialize("btndeleteposition")
	btndeleteposition.SetIcon("mdi mdi-trash-can")
	btndeleteposition.SetTooltip("Delete position")
	btndeleteposition.SetWidth("100")
	btndeleteposition.SetClick(BANano.callback(Me,"btndeleteposition_click",Null))
	btndeleteposition.SetHidden(True)
	toolbar1.AddIcon(btndeleteposition)
	
	Dim cb As BANanoObject = BANano.CallBack(Me, "printpositions_click", Null)
	toolbar1.CreateIcon("totalpositions").SetIcon("mdi mdi-file-tree").SetWidth(100).SetBadge("0").Pop
	toolbar1.CreateIcon("printpositions").SetIcon("mdi mdi-printer").SetWidth(100).SetTooltip("Print the positions list").SetClick(cb).Pop
	Return toolbar1
End Sub

'controller code for the side menu
Sub ShowPage(pg As WixPage)
	Page = pg
	pg.Show("mv_settings_positions")
	LoadDataTable
	Page.Clear("formpositions")
	Page.ClearValidation("formpositions")
	Page.Show("btnnewposition")
	Page.HideMulti(Array("btncancelposition","btnsaveposition","btndeleteposition"))
End Sub


Sub btnnewposition_click
	Page.Hide("btnnewposition")
	Page.ShowMulti(Array("btncancelposition","btnsaveposition","btndeleteposition"))
	
	'set the mode
	Mode = "A"
	'clear the form
	Page.Clear("formpositions")
	Page.ClearValidation("formpositions")
	'set the focus to element
	Page.Focus("positions.value")
	'get next available id
	'initialize the helper class
	Dim sqlite As BANanoSQLite
	sqlite.Initialize
	'generate the create table sql
	Dim qry As String = sqlite.GetMax("positions", "id")
	Dim res As String = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": Main.dbName, "data": qry))
	Dim rs As SQLiteResultSet = sqlite.GetResultSet(qry,res)
	Dim lastID As String = Page.GetNextID(rs.result)
	Page.SetValue("positions.id", lastID)
End Sub



Sub btncancelposition_click
	Mode = ""
	Page.Show("btnnewposition")
	Page.HideMulti(Array("btncancelposition","btnsaveposition","btndeleteposition"))
	Page.Clear("formpositions")
	Page.ClearValidation("formpositions")
	Page.Focus("positions.value")
End Sub

Sub btnsaveposition_click
	'validate the form
	Dim bValidate As Boolean = Page.Validate("formpositions")
	If bValidate = False Then
		Page.Message_Error("There are some missing contents for this record, please rectify!")
		Return
	End If
	
	Select Case Mode
		Case "A"
			'adding a new position
			Dim rec As Map = Page.GetValues("formpositions")
			Dim sqlite As BANanoSQLite
			sqlite.Initialize
			Dim qry As String = sqlite.Insert("positions", rec)
			Dim res As String = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": Main.dbName, "data": qry))
			Dim rs As SQLiteResultSet = sqlite.GetResultSet(qry,res)
		Case "E"
			'updating an existing position
			Dim rec As Map = Page.GetValues("formpositions")
			Dim eid As String = rec.Get("id")
			Dim sqlite As BANanoSQLite
			sqlite.Initialize
			Dim qry As String = sqlite.UpdateWhere("positions", rec, CreateMap("id":eid))
			Dim res As String = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": Main.dbName, "data": qry))
			Dim rs As SQLiteResultSet = sqlite.GetResultSet(qry,res)
	End Select
	Mode = ""
	Page.clear("formpositions")
	Page.ClearValidation("formpositions")
	Page.Show("btnnewposition")
	Page.HideMulti(Array("btncancelposition","btnsaveposition","btndeleteposition"))
	LoadDataTable
End Sub

Sub btndeleteposition_click
	dtpositions_keypress(46)
End Sub


Sub LoadDataTable()
	Mode = ""
	Page.ClearAll("dtpositions")
	Dim sqlite As BANanoSQLite
	sqlite.Initialize
	Dim qry As String = sqlite.SelectAll("positions", Array("id","value","color"), Array("value"))
	Dim res As String = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": Main.dbName, "data": qry))
	Dim rs As SQLiteResultSet = sqlite.GetResultSet(qry,res)
	Page.SetData("dtpositions", rs.result)
	'
	Dim tc As Int = rs.result.size
	Page.SetBadge("totalpositions", tc)

End Sub


Sub CreateDataTable As WixDataTable
	Dim dtpositions As WixDataTable
	dtpositions.Initialize("dtpositions")
	dtpositions.SetResizeColumn("true")
	dtpositions.SetScrollY("true")
	dtpositions.SetSelect("row")
	dtpositions.SetForm("frmcolors")
	dtpositions.SetHeaderBorders(True)
	dtpositions.SetScroll("y")
	
	Dim id As WixDataColumn
	id.Initialize("id")
	id.SetName("id")
	id.SetHeader("#")
	id.SetAdjust(True)
	id.SetHeaderTextFilter(True)
	dtpositions.AddDataColumns(id)

	Dim value As WixDataColumn
	value.Initialize("value")
	value.SetHeader("Position")
	value.SetSort("string")
	value.SetFillSpace(True)
	value.SetAdjust(True)
	value.SetHeaderTextFilter(True)
	dtpositions.AddDataColumns(value)

	Dim color As WixDataColumn
	color.Initialize("color")
	color.SetHeader("Color")
	color.SetAdjust(True)
	color.SetEditorColor("")
	color.SetHeaderTextFilter(True)
	dtpositions.AddDataColumns(color)
	'
	'add events to the dtpositions
	Dim arguements As Object
	dtpositions.DataTable.OnItemDblClick(BANano.CallBack(Me,"dtpositions_dblclick",Array(arguements)))
	dtpositions.DataTable.OnKeyPress(BANano.CallBack(Me,"dtpositions_keypress",Array(arguements)))
	Return dtpositions
End Sub


Sub dtpositions_dblclick(arguements As Object)
	' turn edit on
	Dim item As Map = Page.GetSelectedItem("dtpositions",False)
	If item <> Null Then
		Page.SetValues("formpositions", item)
		Mode = "E"
		Page.HideMulti(Array("btnnewposition"))
		Page.ShowMulti(Array("btncancelposition","btnsaveposition","btndeleteposition"))
		Page.Focus("positions.value")
	End If
End Sub

Sub dtpositions_keypress(arguements As Object)
	Dim kCode As Int = BANano.parseInt(arguements)
	Select Case kCode
		Case 45
			'insert
			btnnewposition_click
		Case 46
			'delete
			Dim confirmresult As Boolean = False
			Dim cb As BANanoObject = BANano.CallBack(Me,"dtpositions_delete",Array(confirmresult))
			Page.Confirm(cb, "Confirm Delete", "Are you sure you want to delete the selected position? You will not be able to undo your changes. Continue?")
	End Select
End Sub

Sub dtpositions_delete(confirmresult As Boolean)
	If confirmresult = False Then Return
	Dim item As Map = Page.GetSelectedItem("dtpositions",False)
	If item = Null Then Return
	Dim did As String = item.Get("id")
	'
	Dim sqlite As BANanoSQLite
	sqlite.Initialize
	Dim qry As String = sqlite.DeleteWhere("positions", CreateMap("id":did))
	Dim res As String = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": Main.dbName, "data": qry))
	Dim rs As SQLiteResultSet = sqlite.GetResultSet(qry,res)
	'
	Page.clear("formpositions")
	Page.ClearValidation("formpositions")
	Page.Show("btnnewposition")
	Page.HideMulti(Array("btncancelposition", "btnsaveposition", "btndeleteposition"))
	LoadDataTable
End Sub


Sub CreateForm As WixForm
	Dim form As WixForm
	form.Initialize("formpositions")
	form.SetName("formpositions")
	form.SetElementsConfigJSON($"{"labelPosition":"top"}"$)

	Dim id As WixText
	id.Initialize("positions.id")
	id.SetName("id")
	id.SetLabel("#")
	id.SetRequired(True)
	id.SetHidden(True)
	form.AddRows(id.Item)

	Dim value As WixText
	value.Initialize("positions.value")
	value.SetName("value")
	value.SetLabel("Position")
	value.SetRequired(True)
	value.SetValidateIsNotEmpty(True)
	value.SetInvalidMessage("The position should be specified")
	form.AddRows(value.Item)

	Dim color As WixColorPicker
	color.Initialize("positions.color")
	color.SetName("color")
	color.SetLabel("Color")
	color.setrequired(True)
	color.SetInvalidMessage("The color should be specified")
	form.AddRows(color.Item)
	'
	form.AddRowsSpacer("")
	
	Return form
End Sub