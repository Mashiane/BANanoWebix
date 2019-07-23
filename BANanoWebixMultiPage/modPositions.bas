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

Sub btnnewposition_click
	Page.Hide("btnnewposition")
	Page.Show("btncancelposition")
	Page.Show("btnsaveposition")
	Page.Hide("btndeleteposition")
	
	'set the mode
	Mode = "A"
	'clear the form
	Page.Clear("formpositions")
	Page.ClearValidation("formpositions")
	'set the focus to element
	Page.Focus("positions.id")
	'get next available id
	'initialize the helper class
	Dim alaSQL As BANanoAlaSQL
	alaSQL.Initialize
	'generate the create table sql
	Dim rs As AlaSQLResultSet = alaSQL.GetMax("positions", "id")
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
	Page.SetValue("positions.id", lastID)
End Sub



Sub btncancelposition_click
	Mode = ""
	Page.Show("btnnewposition")
	Page.Hide("btncancelposition")
	Page.Hide("btnsaveposition")
	Page.Hide("btndeleteposition")
	Page.Clear("formpositions")
	Page.ClearValidation("formpositions")
	Page.Focus("positions.id")
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
			Dim alaSQL As BANanoAlaSQL
			alaSQL.Initialize
			Dim rs As AlaSQLResultSet = alaSQL.Insert("positions", rec)
			rs.Result = ourclients.ExecuteWait(rs.query, rs.args)
		Case "E"
			'updating an existing position
			Dim rec As Map = Page.GetValues("formpositions")
			Dim eid As String = rec.Get("id")
			Dim alaSQL As BANanoAlaSQL
			alaSQL.Initialize
			Dim rs As AlaSQLResultSet = alaSQL.UpdateWhere("positions", rec, CreateMap("id":eid))
			rs.Result = ourclients.ExecuteWait(rs.query, rs.args)
	End Select
	Mode = ""
	Page.clear("formpositions")
	Page.ClearValidation("formpositions")
	Page.Show("btnnewposition")
	Page.Hide("btncancelposition")
	Page.Hide("btnsaveposition")
	Page.Hide("btndeleteposition")
	LoadPositions
End Sub

Sub btndeleteposition_click
	dtpositions_keypress(46)
End Sub


Sub LoadPositions()
	Mode = ""
	Page.ClearAll("dtpositions")
	Dim alaSQL As BANanoAlaSQL
	alaSQL.Initialize
	Dim rs As AlaSQLResultSet = alaSQL.SelectAll("positions", Array("id","value","color"), Array("value"))
	rs.Result = ourclients.ExecuteWait(rs.query, rs.args)
	Page.SetData("dtpositions", rs.result)
End Sub


Sub CreatePositionsDT As WixDataTable
	Dim dtpositions As WixDataTable
	dtpositions.Initialize("dtpositions")
	dtpositions.SetResizeColumn("true")
	dtpositions.SetScrollY("true")
	dtpositions.SetSelect("row")
	dtpositions.SetForm("frmcolors")
	dtpositions.SetScroll("y")
	
	Dim id As WixDataColumn
	id.Initialize("id")
	id.SetName("id")
	id.SetHeader("#")
	dtpositions.AddDataColumns(id)

	Dim value As WixDataColumn
	value.Initialize("value")
	value.SetHeader("Position")
	value.SetSort("string")
	value.SetAdjustData(True)
	dtpositions.AddDataColumns(value)

	Dim color As WixDataColumn
	color.Initialize("color")
	color.SetHeader("Color")
	color.SetAdjustData(True)
	dtpositions.AddDataColumns(color)
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
		Page.Focus("positions.id")
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
			Page.Confirm(cb, "Confirm Delete", "Are you Sure Want to delete the selected position? You will not be able to undo your changes. Continue?")
	End Select
End Sub

Sub dtpositions_delete(confirmresult As Boolean)
	If confirmresult = False Then Return
	Dim item As Map = Page.GetSelectedItem("dtpositions",False)
	If item = Null Then Return
	Dim did As String = item.Get("id")
	'
	Dim alasql As BANanoAlaSQL
	alasql.Initialize
	Dim rs As AlaSQLResultSet = alasql.DeleteWhere("positions", CreateMap("id":did))
	rs.Result = ourclients.ExecuteWait(rs.query, rs.args)
	Page.clear("formpositions")
	Page.ClearValidation("formpositions")
	Page.Show("btnnewposition")
	Page.HideMulti(Array("btncancelposition", "btnsaveposition", "btndeleteposition"))
	LoadPositions
End Sub


Sub CreatePositionsForm As WixForm
	Dim form As WixForm
	form.Initialize("formpositions")
	form.SetName("formpositions")
	form.SetElementsConfigJSON($"{"labelPosition":"top"}"$)

	Dim hdr As WixHeader
	hdr.Initialize("poshdr").SetTemplate("Positions")
	form.AddRows(hdr.Item)
	

	Dim id As WixText
	id.Initialize("positions.id")
	id.SetName("id")
	id.SetType("text")
	id.SetLabel("#")
	id.SetRequired(True)
	form.AddRows(id.Item)

	Dim value As WixText
	value.Initialize("positions.value")
	value.SetLocalId("value")
	value.SetName("value")
	value.SetType("text")
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
	'
	Dim toolbar1 As WixToolBar
	toolbar1.Initialize("tlbpos")
	
	Dim btnBack As WixIcon
	btnBack.Initialize("btnback")
	btnBack.SetIcon("mdi mdi-keyboard-backspace")
	btnBack.SetTooltip("Go back")
	btnBack.SetWidth("100")
	btnBack.SetClick(BANano.CallBack(Me,"btnback_click",Null))
	toolbar1.AddIcon(btnBack)
	
	toolbar1.AddSpacer
		 
	Dim btnnewposition As WixIcon
	btnnewposition.Initialize("btnnewposition")
	btnnewposition.SetIcon("mdi mdi-plus")
	btnnewposition.SetTooltip("Add a new position")
	btnnewposition.SetWidth("100")
	btnnewposition.SetClick(BANano.CallBack(Me,"btnnewposition_click",Null))
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
	btnsaveposition.SetClick(BANano.CallBack(Me,"btnsaveposition_click",Null))
	btnsaveposition.SetHidden(True)
	toolbar1.AddIcon(btnsaveposition)

	Dim btndeleteposition As WixIcon
	btndeleteposition.Initialize("btndeleteposition")
	btndeleteposition.SetIcon("mdi mdi-trash-can")
	btndeleteposition.SetTooltip("Delete position")
	btndeleteposition.SetWidth("100")
	btndeleteposition.SetClick(BANano.CallBack(Me,"btndeleteposition_click",Null))
	btndeleteposition.SetHidden(True)
	toolbar1.AddIcon(btndeleteposition)

	form.AddRows(toolbar1.Item)
	
	Return form
End Sub