B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.51
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private Mode As String
	Private Page As WixPage
	Private BANano As BANano
End Sub

Sub btnnewgodown_click
	'change mode to adding
	Mode = "A"
	'clear the contents of the form
	Page.Clear("formgodown")
	'clear form validation, if any
	Page.ClearValidation("formgodown")
	'disable new and delete buttons
	Page.DisableMulti(Array("btnnewgodown","btndeletegodown"))
	'enable save, cancel
	Page.EnableMulti(Array("btncancelgodown","btnsavegodown"))
	'LoadOptions
	'initialize the bananosql helper class
	Dim mysql As BANanoMySQL1
	mysql.Initialize
	'get the maximum value in the primary field
	Dim rs As MySQLResultSet1 = mysql.GetMax("godown", "wh_no")
	rs.Result = BANano.FromJSON(BANano.CallInlinePHPWait("BANanoMySQL1", mysql.Build(rs)))
	'increment the max value by 1
	Dim nextID As String = mysql.GetNextID("wh_no", rs.result)
	'assign the nextID to the form value
	Page.SetValue("godown.wh_no", nextID)
	'set focus to primary field of form
	Page.Focus("godown.wh_name")
End Sub

'CREATE/UPDATE
Sub btnsavegodown_click
	' this happens on insert / update an existing record!
	'lets validate the form
	Dim bValid As Boolean = Page.Validate("formgodown")
	If bValid = False Then Return
	'Get values from the form
	Dim rec As Map = Page.GetValues("formgodown")
	Select Case Mode
		Case "A"
			Dim mysql As BANanoMySQL1
			mysql.Initialize
			Dim rs As MySQLResultSet1 = mysql.Insert("godown", rec)
			rs.Result = BANano.FromJSON(BANano.CallInlinePHPWait("BANanoMySQL1", mysql.Build(rs)))
		Case "E"
			Dim wh_no As String = rec.Get("wh_no")
			Dim mysql As BANanoMySQL1
			mysql.Initialize
			Dim rs As MySQLResultSet1 = mysql.UpdateWhere("godown", rec, CreateMap("wh_no":wh_no))
			rs.Result = BANano.FromJSON(BANano.CallInlinePHPWait("BANanoMySQL1", mysql.Build(rs)))
	End Select
	Mode = "E"
	Page.EnableMulti(Array("btnnewgodown","btnsavegodown","btndeletegodown"))
	Page.DisableMulti(Array("btncancelgodown"))
	LoadDataTable
End Sub

'READ
Sub Readgodown(wh_no As String)
	Mode = "E"
	Page.EnableMulti(Array("btncancelgodown","btnsavegodown","btndeletegodown"))
	Page.DisableMulti(Array("btnnewgodown"))
	'LoadOptions
	Dim mysql As BANanoMySQL1
	mysql.Initialize
	Dim rs As MySQLResultSet1 = mysql.Read("godown", "wh_no", wh_no)
	rs.Result = BANano.FromJSON(BANano.CallInlinePHPWait("BANanoMySQL1", mysql.Build(rs)))
	'the record was found, set the values to the form
	If rs.result.size > 0 Then
		Dim rec As Map = rs.result.Get(0)
		'set returned map to form
		Page.SetValues("formgodown", rec)
		Page.Focus("godown.wh_name")
	End If
End Sub


'DELETE
Sub btndeletegodown_click
	'draw a confirm dialog
	Dim confirmDelete As Boolean = False
	Dim cb As BANanoObject = BANano.CallBack(Me,"deletegodown",Array(confirmDelete))
	Page.Confirm(cb, "Confirm Delete", "Are you sure that you want to delete this godown record?. You will not be able to undo your changes. Continue?")
End Sub

Sub dtgodown_delete(confirmDelete As Boolean)
	If confirmDelete = False Then Return
	Dim item As Map = Page.GetSelectedItem("dtgodown", False)
	Dim wh_no As String = item.Get("wh_no")
	godown_delete(wh_no)
End Sub

Sub Deletegodown(confirmDelete As Boolean)
	If confirmDelete = False Then Return
	'get the primary key
	Dim wh_no As String = Page.GetValue("godown.wh_no")
	godown_delete(wh_no)
End Sub

Sub godown_delete(did As String)
	Dim mysql As BANanoMySQL1
	mysql.Initialize
	Dim rs As MySQLResultSet1 = mysql.DeleteWhere("godown", CreateMap("wh_no":did))
	rs.Result = BANano.FromJSON(BANano.CallInlinePHPWait("BANanoMySQL1", mysql.Build(rs)))
	Mode = ""
	Page.EnableMulti(Array("btnnewgodown"))
	Page.DisableMulti(Array("btncancelgodown","btnsavegodown","btndeletegodown"))
	Page.Clear("formgodown")
	Page.ClearValidation("formgodown")
	LoadDataTable

End Sub

Sub btncancelgodown_click
	Mode = ""
	Page.EnableMulti(Array("btnnewgodown"))
	Page.DisableMulti(Array("btncancelgodown","btnsavegodown","btndeletegodown"))
	Page.Clear("formgodown")
	Page.ClearValidation("formgodown")
	Page.Focus("godown.wh_name")
End Sub

Sub CreateDataTable As WixDataTable
	Dim dtgodown As WixDataTable
	dtgodown.Initialize("dtgodown")
	dtgodown.SetForm("formgodown")
	dtgodown.SetResizeColumn("true")
	dtgodown.SetScroll("y")
	dtgodown.SetSelect("row")
	'dtgodown.SetEditable(True)
	'dtgodown.SetEditAction("custom")
	'dtgodown.SetNavigation(True)
	dtgodown.SetHeaderBorders(True)
	'add columns
	Dim wh_no As WixDataColumn
	wh_no.Initialize("wh_no")
	wh_no.SetHeaderContent("textFilter")
	wh_no.SetSort("int")
	wh_no.SetAdjust(True)
	wh_no.SetHeader("Wh_No")
	dtgodown.AddDataColumns(wh_no)

	Dim wh_name As WixDataColumn
	wh_name.Initialize("wh_name")
	wh_name.SetHeaderContent("textFilter")
	wh_name.SetSort("string")
	wh_name.SetHeader("Wh_Name")
	wh_name.SetFillSpace(True)
	dtgodown.AddDataColumns(wh_name)


	dtgodown.AddEditTrash

	Dim arguements As Object
	dtgodown.DataTable.OnItemClick(BANano.CallBack(Me,"dtgodown_itemclick",Array(arguements)))
	dtgodown.DataTable.OnItemDblClick(BANano.CallBack(Me,"dtgodown_dblclick",Array(arguements)))
	dtgodown.DataTable.OnKeyPress(BANano.CallBack(Me,"dtgodown_keypress",Array(arguements)))
	Dim state, editor As Object
	dtgodown.DataTable.OnAfterEditStop(BANano.CallBack(Me,"dtgodown_afteredit",Array(state,editor)))
	Return dtgodown
End Sub

Sub dtgodown_dblclick(arguements As Object)
	Dim item As Map = Page.GetSelectedItem("dtgodown",False)
	Dim did As String = item.Get("wh_no")
	Readgodown(did)
	'if grid is editable, uncomment
	'Page.EditRow("dtgodown", did)
End Sub

Sub dtgodown_itemclick(row As Map)
	Dim did As String
	Dim item As Map
	'
	Dim rowid As String = row.Get("row")
	Dim colid As String = row.Get("column")
	Select Case colid
		Case "edit"
			item = Page.GetItem("dtgodown", rowid)
			did = item.Get("wh_no")
			Readgodown(did)
			'if grid is editable
			'Page.EditRow("dtgodown", did)
		Case "delete"
			Dim confirmresult As Boolean = False
			Dim cb As BANanoObject = BANano.CallBack(Me,"dtgodown_delete",Array(confirmresult))
			Page.Confirm(cb, "Confirm Delete", "Are you sure want to delete this godown record? You will not be able to undo your changes. Continue?")
	End Select
End Sub
Sub dtgodown_keypress(arguements As Object)
	'get the code being selected
	Dim kCode As Int = BANano.parseInt(arguements)
	Select Case kCode
		Case 45
			btnnewgodown_click
		Case 46
			Dim confirmresult As Boolean = False
			Dim cb As BANanoObject = BANano.CallBack(Me,"dtgodown_delete",Array(confirmresult))
			Page.Confirm(cb, "Confirm Delete", "Are you sure want to delete this godown record? You will not be able to undo your changes. Continue?")
	End Select
End Sub

Sub dtgodown_afteredit(state As Object, editor As Object)
	'get the current edited item
	Dim item As Map = Page.GetSelectedItem("dtgodown",False)
	'get the id of the record
	Dim wh_no As String = item.Get("wh_no")
	'update record

	Dim mysql As BANanoMySQL1
	mysql.Initialize
	Dim rs As MySQLResultSet1 = mysql.UpdateWhere("godown", item, CreateMap("wh_no":wh_no))
	rs.Result = BANano.CallInlinePHPWait("BANanoMySQL1", mysql.Build(rs))
End Sub





Sub LoadDataTable
	'set the progress bar
	Dim pbx As WixProgressBar
	pbx.Initialize("").SetTypeIcon("")
	Page.SetProgressBar("dtgodown", pbx)
	'clear the grid
	Page.ClearAll("dtgodown")

	Dim mysql As BANanoMySQL1
	mysql.Initialize
	'add the data

	mysql.Initialize
	Dim rsd As MySQLResultSet1 = mysql.SelectAll("godown", Array("*"), Array("wh_no"))
	rsd.Result = BANano.FromJSON(BANano.CallInlinePHPWait("BANanoMySQL1", mysql.Build(rsd)))

	Page.SetData("dtgodown", rsd.result)
	'update the badge
	Page.SetBadge("badgegodown", rsd.result.Size)
	'remove the progress bar
	Page.UnsetProgressBar("dtgodown")
End Sub


Sub CreateForm As WixForm
	Dim formgodown As WixForm
	formgodown.Initialize("formgodown").SetWidth(650)
	formgodown.SetName("formgodown")
	formgodown.SetResponsive("true")
	formgodown.SetDefaultLabelWidth("120")
	formgodown.SetDefaultLabelPosition("top")
	'add elements
	Dim wh_no As WixText
	wh_no.Initialize("godown.wh_no")
	wh_no.SetName("wh_no")
	wh_no.SetRequired("true")
	wh_no.SetValidate("isNotEmpty")
	wh_no.SetValidateEvent("key")
	wh_no.SetInvalidMessage("No should be specified")
	wh_no.SetLabel("Wh_No")
	formgodown.AddRows(wh_no.Item)

	Dim wh_name As WixText
	wh_name.Initialize("godown.wh_name")
	wh_name.SetName("wh_name")
	wh_name.SetType("text")
	wh_name.SetRequired("true")
	wh_name.SetValidate("isNotEmpty")
	wh_name.SetValidateEvent("key")
	wh_name.SetInvalidMessage("The name should be specified")
	wh_name.SetLabel("Wh_Name")
	formgodown.AddRows(wh_name.Item)

	formgodown.AddRowsSpacer("")
	Return formgodown
End Sub



Sub CreateToolBar As WixToolBar
	Dim tblgodown As WixToolBar
	tblgodown.Initialize("tblgodown").SetPadding(10)
	tblgodown.CreateLabel("lblgodown").SetLabel("Godown").Pop
	tblgodown.AddSpacer
	'
	Dim btnnewgodown As WixIcon
	btnnewgodown.Initialize("btnnewgodown")
	btnnewgodown.SetIcon("mdi mdi-plus")
	btnnewgodown.SetTooltip("Add a new record")
	btnnewgodown.SetWidth("100")
	btnnewgodown.SetClick(BANano.callback(Me,"btnnewgodown_click",Null))
	tblgodown.AddIcon(btnnewgodown)
 
	Dim btncancelgodown As WixIcon
	btncancelgodown.Initialize("btncancelgodown")
	btncancelgodown.SetIcon("mdi mdi-cancel")
	btncancelgodown.SetTooltip("Cancel new record")
	btncancelgodown.SetWidth("100")
	btncancelgodown.SetClick(BANano.CallBack(Me,"btncancelgodown_click",Null))
	btncancelgodown.SetDisabled(True)
	tblgodown.AddIcon(btncancelgodown)
	 
 
	Dim btnsavegodown As WixIcon
	btnsavegodown.Initialize("btnsavegodown")
	btnsavegodown.SetIcon("mdi mdi-content-save")
	btnsavegodown.SetTooltip("Save the record")
	btnsavegodown.SetWidth("100")
	btnsavegodown.SetClick(BANano.callback(Me,"btnsavegodown_click",Null))
	btnsavegodown.SetDisabled(True)
	tblgodown.AddIcon(btnsavegodown)
 
	Dim btndeletegodown As WixIcon
	btndeletegodown.Initialize("btndeletegodown")
	btndeletegodown.SetIcon("mdi mdi-trash-can")
	btndeletegodown.SetTooltip("Delete record")
	btndeletegodown.SetWidth("100")
	btndeletegodown.SetClick(BANano.callback(Me,"btndeletegodown_click",Null))
	btndeletegodown.SetDisabled(True)
	tblgodown.AddIcon(btndeletegodown)
	 
	Dim cb As BANanoObject = BANano.CallBack(Me, "printgodown_click", Null)
	tblgodown.CreateIcon("badgegodown").SetIcon("mdi mdi-city").SetWidth(100).SetBadge("0").Pop
	tblgodown.CreateIcon("printgodown").SetIcon("mdi mdi-printer").SetWidth(100).SetTooltip("Print the list of godown").SetClick(cb).Pop
	Return tblgodown
End Sub

Sub PrintGodown_click
	Dim wp As WixPrint
	wp.Initialize
	wp.SetHeader(True)
	wp.SetFooter(True)
	wp.SetDocHeader("Godown")
	wp.SetModeLandScape(True)
	wp.SetDataAll(True)
	wp.SetDocFooter("BANanoWebix")
	wp.SetPaperA4(True)
	Page.Print("dtgodown",wp)
End Sub


Sub AddPage(pg As WixPage, mv As WixMultiView)
	Page = pg
	'dbName = Main.dbname
	Dim a As WixElement
	a.Initialize("mv_godown").SetTemplate("Godown").SetTypeLine("")
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

Sub ShowPage(pg As WixPage)
	Page = pg
	'dbName = Main.dbname
	pg.Show("mv_godown")
	LoadDataTable
	Page.Clear("formgodown")
	Page.ClearValidation("formgodown")
	Page.Enable("btnnewgodown")
	Page.DisableMulti(Array("btncancelgodown","btnsavegodown","btndeletegodown"))
End Sub


