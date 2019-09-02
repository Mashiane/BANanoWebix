B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public DataTable As WixElement
	Private AutoConfig As Boolean
	Public DT_SORT_INT As String = "int"
	Public DT_SORT_DATE As String = "date"
	Public DT_SORT_STRING As String = "string"
	Public DT_SORT_STRING_STRICT As String = "string_strict"
	Public DT_SORT_TEXT As String = "text"
	Public DT_SORT_SERVER As String = "server"
	Public DT_SORT_RAW As String = "raw"
	'data types
	Public DT_DATA_TYPE_XML As String = "xml"
	Public DT_DATA_TYPE_CSV As String = "csv"
	Public DT_DATA_TYPE_JSARRAY As String = "jsarray"
	Public DT_DATA_TYPE_JSON As String = "json"
	'edit action
	Public DT_EDIT_ACTION_DBLCLICK As String = "dblclick"
	'selection
	Public DT_SELECT_ROW As String = "row"
	Public DT_SELECT_CELL As String = "cell"
	Public DT_SELECT_COLUMN As String = "column"
	'adjust
	Public DT_ADJUST_DATA As String = "data"
	Public DT_ADJUST_HEADER As String = "header"
	Public DT_ADJUST_TRUE As Boolean = True
	Private Rules As Map
End Sub


'set css
Sub SetStyle(prop As String, sval As String) As WixDataTable
	DataTable.SetStyle(prop,sval)
	Return Me
End Sub


Sub SetTemplateHTML(h As UOENowHTML) As WixDataTable
	h.SetImportant(False)
	Dim os As String = h.HTML
	DataTable.SetTemplate(os)
	Return Me
End Sub

'set select row
Sub SetSelectRow(b As Boolean) As WixDataTable  'ignore
	SetSelect(DT_SELECT_ROW)
	Return Me
End Sub

'set select cell
Sub SetSelectCell(b As Boolean) As WixDataTable  'ignore
	SetSelect(DT_SELECT_CELL)
	Return Me
End Sub

'set select column
Sub SetSelectColumn(b As Boolean) As WixDataTable  'ignore
	SetSelect(DT_SELECT_COLUMN)
	Return Me
End Sub

Sub SetHeaderBorders(b As Boolean) As WixDataTable   'ignore
	SetCSS("webix_header_border")
	Return Me
End Sub

'set live validation
Sub SetLiveValidation(b As Boolean) As WixDataTable
	DataTable.SetAttr("liveValidation", b)
	Return Me
End Sub

'set css
Sub SetCSS(c As Object) As WixDataTable
	DataTable.SetAttr("css", c)
	Return Me
End Sub

Sub SetCSSJSON(json As String) As WixDataTable
	DataTable.SetCSSJSON(json)
	Return Me
End Sub

'set name
Sub SetName(n As String) As WixDataTable
	DataTable.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixDataTable
	DataTable.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixDataTable
	DataTable.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixDataTable
	DataTable.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixDataTable
	DataTable.SetMinHeight(h)
	Return Me
End Sub

'set yCount number of items in a column
Sub SetYCount(x As Int) As WixDataTable
	DataTable.SetAttr("yCount", x)
	Return Me
End Sub


'set navigation
Sub SetNavigation(b As Object) As WixDataTable
	DataTable.SetAttr("navigation", b)
	Return Me
End Sub


'set xCount i.e number of items in a row
Sub SetXCount(x As Int) As WixDataTable
	DataTable.SetAttr("xCount", x)
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixDataTable
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		DataTable.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


'set SetPager
Sub SetPager(p As String) As WixDataTable
	p = p.tolowercase
	DataTable.SetAttr("pager", p)
	Return Me
End Sub

'set scrollY
Sub SetScrollY(b As Object) As WixDataTable
	DataTable.SetAttr("scrollY", b)
	Return Me
End Sub

'set scrollX
Sub SetScrollX(b As Object) As WixDataTable
	DataTable.SetAttr("scrollX", b)
	Return Me
End Sub

'set resize row
Sub SetResizeRow(b As Boolean) As WixDataTable
	DataTable.SetAttr("resizeRow", b)
	Return Me
End Sub

'Set resize column
Sub SetResizeColumn(b As Boolean) As WixDataTable
	DataTable.SetAttr("resizeColumn", b)
	Return Me
End Sub

'set linked form
Sub SetForm(frmID As String) As WixDataTable
	frmID = frmID.ToLowerCase
	DataTable.SetAttr("form", frmID)
	Return Me
End Sub


'set column width
Sub SetColumnWidth(w As Int) As WixDataTable
	DataTable.SetAttr("columnWidth", w)
	Return Me
End Sub

'add edit/trash
Sub AddEditTrash
	Dim e As WixDataColumn = CreateColumn("edit").SetTemplate("{common.editIcon()}").SetWidth(80).SetAlignCenter(True)
	Dim d As WixDataColumn = CreateColumn("delete").SetTemplate("{common.trashIcon()}").SetWidth(80).SetAlignCenter(True)
	e.SetHeader("Edit")
	d.SetHeader("Delete")
	e.DataColumn.SetStyle("cursor", "pointer")
	d.DataColumn.SetStyle("cursor", "pointer")
	DataTable.AddDataColumn(e.Item)
	DataTable.AddDataColumn(d.item)
End Sub

Sub AddIcon(iconID As String, iconHeader As String, iconName As String) As WixDataTable
	Dim span As UOENowHTML
	span.Initialize(iconID & "_icon","span").SetImportant(False).AddClass("webix_icon").AddClass(iconName)
	iconID = iconID.tolowercase
	Dim e As WixDataColumn = CreateColumn(iconID).SetWidth(80).SetAlignCenter(True).SetTemplateHTML(span)
	e.SetHeader(iconHeader)
	e.DataColumn.SetStyle("cursor", "pointer")
	DataTable.AddDataColumn(e.Item)
	Return Me
End Sub

Sub AddImage(imgID As String, imgHeader As String, imgURL As String, imgWidth As String, imgHeight As String, imgStyles As Map) As WixDataTable
	imgID = imgID.ToLowerCase
	Dim img As UOENowHTML
	img.Initialize(imgID & "_img", "img").SetImportant(False)
	img.SetStyle("cursor", "pointer")
	img.SetStyle("width","100%")
	img.SetStyle("height","100%")
	If imgStyles <> Null Then
		For Each mk As String In imgStyles.Keys
			Dim mv As String = imgStyles.Get(mk)
			img.SetStyle(mk, mv)
		Next
	End If
	img.SetSRC(imgURL,True)
	'
	Dim e As WixDataColumn = CreateColumn(imgID).SetAlignCenter(True).SetTemplateHTML(img)
	If imgWidth <> "" Then e.SetWidth(imgWidth)
	If imgHeight <> "" Then e.SetHeight(imgHeight)
	e.SetHeader(imgHeader)
	e.DataColumn.SetStyle("cursor", "pointer")
	e.DataColumn.SetCSS("form_photo")
	DataTable.AddDataColumn(e.Item)
	Return Me
End Sub

'set hover
Sub SetHover(h As String) As WixDataTable
	DataTable.SetAttr("hover", h)
	Return Me
End Sub

'set right split i.e. columns to freeze on the right
Sub SetRightSplit(r As Int) As WixDataTable
	DataTable.SetAttr("rightSplit", r)
	Return Me
End Sub

'set select enables selection of items
Sub SetSelect(s As Object) As WixDataTable
	DataTable.SetAttr("select", s)
	Return Me
End Sub

'set multi select
Sub SetMultiSelect(s As Object) As WixDataTable
	DataTable.SetAttr("multiselect", s)
	Return Me
End Sub


'set parent container for data table
Sub SetContainer(c As String) As WixDataTable
	DataTable.SetAttr("container", c)
	Return Me
End Sub

'Initializes the data table
Public Sub Initialize(tID As String) As WixDataTable
	ID = tID.ToLowerCase
	DataTable.Initialize(ID).SetView("datatable")
	AutoConfig = False
	Rules.Initialize
	Return Me
End Sub

'add column
Sub AddColumns(c As WixDataColumn)
	DataTable.AddDataColumn(c.Item)
End Sub

Sub AddDataColumns(c As WixDataColumn)
	DataTable.AddDataColumn(c.Item)
End Sub

'set scroll
Sub SetScroll(b As Object) As WixDataTable
	DataTable.SetAttr("scroll", b)
	Return Me
End Sub

Sub SetScrollXY(b As Object) As WixDataTable   'ignore
	DataTable.SetAttr("scroll", "xy")
	Return Me
End Sub

'set data type (xml, csv, jsarray, json)
Sub SetDataType(t As String) As WixDataTable
	DataTable.SetAttr("datatype", t)
	Return Me
End Sub

'set visible batch
Sub SetVisibleBatch(b As Int) As WixDataTable
	DataTable.SetAttr("visibleBatch", b)
	Return Me
End Sub

'set url to load json data
Sub SetURL(u As String) As WixDataTable
	DataTable.SetAttr("url", u)
	Return Me
End Sub

'set auto width
Sub SetAutoHeight(b As Boolean) As WixDataTable
	DataTable.SetAttr("autoheight", b)
	Return Me
End Sub

'set auto height
Sub SetAutoWidth(b As Boolean) As WixDataTable
	DataTable.SetAttr("autowidth", b)
	Return Me
End Sub

'create a header to Pop2
Sub CreateColumn(hid As String) As WixDataColumn
	Dim hdr As WixDataColumn
	hdr.Initialize(hid)
	Return hdr	
End Sub

'set RowHeight
Sub SetRowHeight(h As Int) As WixDataTable
	DataTable.SetAttr("rowHeight", h)
	Return Me
End Sub

'set rows to freeze
Sub SetTopSplit(r As Int) As WixDataTable
	DataTable.SetAttr("topSplit", r)
	Return Me
End Sub

'set columns to freeze
Sub SetLeftSplit(c As Int) As WixDataTable
	DataTable.SetAttr("leftSplit", c)
	Return Me
End Sub

'set block select
Sub SetBlockSelect(b As Boolean) As WixDataTable
	DataTable.SetAttr("blockselect", b)
	Return Me
End Sub

'set edit action
Sub SetEditAction(a As String) As WixDataTable
	DataTable.SetAttr("editaction", a)
	Return Me
End Sub

'set borderless
Sub SetBorderLess(b As Boolean) As WixDataTable
	DataTable.SetAttr("borderless", b)
	Return Me
End Sub


'set editable
Sub SetEditable(b As Boolean) As WixDataTable
	DataTable.SetAttr("editable", b)
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixDataTable
	DataTable.SetTooltip(tt)
	Return Me
End Sub

'return the data table context
Sub Item As Map
	If Rules.Size > 0 Then
		DataTable.SetAttr("rules", Rules)
	End If
	DataTable.SetAttr("autoConfig", AutoConfig)
	Return DataTable.item
End Sub

'set autoConfig
Sub SetAutoConfig(a As Boolean) As WixDataTable
	AutoConfig = a
	Return Me
End Sub

'set height
Sub SetHeight(h As Object) As WixDataTable
	DataTable.SetHeight(h)
	Return Me
End Sub

'set width
Sub SetWidth(h As Object) As WixDataTable
	DataTable.SetWidth(h)
	Return Me
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub
	
Sub SetDataFetch(i As Int) As WixDataTable
	DataTable.SetAttr("datafetch", i)
	Return Me
End Sub

Sub SetLoadAhead(l As Int) As WixDataTable
	DataTable.SetAttr("loadahead", l)
	Return Me
End Sub

Sub SetDataThrottle(d As Int) As WixDataTable
	DataTable.SetAttr("datathrottle", d)
	Return Me
End Sub

'set Data
Sub SetData(data As List) As WixDataTable
	DataTable.SetData(data)
	Return Me
End Sub


'add to parent rows
Sub AddToRows(P As WixElement)
	P.AddRows(Item)
End Sub

'add to parent columns
Sub AddToColumns(P As WixElement)
	P.AddColumns(Item)
End Sub

Sub AddToDataColumns(P As WixElement)
	P.AddDataColumn(Item)
End Sub

'add to parent elements
Sub AddToElements(P As WixElement)
	P.AddElements(Item)
End Sub

Sub SetAreaSelect(areaselect As Boolean) As WixDataTable
	DataTable.SetAttr("areaselect", areaselect)
	Return Me
End Sub

Sub SetAnimate(animate As Object) As WixDataTable
	DataTable.SetAttr("animate", animate)
	Return Me
End Sub

Sub SetCheckboxRefresh(checkboxRefresh As Boolean) As WixDataTable
DataTable.SetAttr("checkboxRefresh", checkboxRefresh)
Return Me
End Sub

Sub SetClipboard(clipboard As String) As WixDataTable
DataTable.SetAttr("clipboard", clipboard)
Return Me
End Sub

Sub SetDataFeed(dataFeed As String) As WixDataTable
DataTable.SetAttr("dataFeed", dataFeed)
Return Me
End Sub

Sub SetDelimiter(delimiter As Object) As WixDataTable
DataTable.SetAttr("delimiter", delimiter)
Return Me
End Sub

Sub SetDisabled(disabled As Boolean) As WixDataTable
DataTable.SetAttr("disabled", disabled)
Return Me
End Sub

Sub SetDrag(drag As String) As WixDataTable
DataTable.SetAttr("drag", drag)
Return Me
End Sub

Sub SetDragColumn(dragColumn As String) As WixDataTable
DataTable.SetAttr("dragColumn", dragColumn)
Return Me
End Sub

Sub SetDragscroll(dragscroll As String) As WixDataTable
DataTable.SetAttr("dragscroll", dragscroll)
Return Me
End Sub

Sub SetEditMath(editMath As Boolean) As WixDataTable
DataTable.SetAttr("editMath", editMath)
Return Me
End Sub

Sub SetEditValue(editValue As String) As WixDataTable
DataTable.SetAttr("editValue", editValue)
Return Me
End Sub

Sub SetFilterMode(filterMode As String) As WixDataTable
DataTable.SetAttr("filterMode", filterMode)
Return Me
End Sub

Sub SetFixedRowHeight(fixedRowHeight As Boolean) As WixDataTable
DataTable.SetAttr("fixedRowHeight", fixedRowHeight)
Return Me
End Sub

Sub SetFooter(footer As Boolean) As WixDataTable
DataTable.SetAttr("footer", footer)
Return Me
End Sub

Sub SetGravity(gravity As String) As WixDataTable
DataTable.SetAttr("gravity", gravity)
Return Me
End Sub

Sub SetHeader(header As Boolean) As WixDataTable
DataTable.SetAttr("header", header)
Return Me
End Sub

Sub SetHeaderRowHeight(headerRowHeight As String) As WixDataTable
DataTable.SetAttr("headerRowHeight", headerRowHeight)
Return Me
End Sub

Sub SetHeaderMenu(headermenu As Boolean) As WixDataTable
DataTable.SetAttr("headermenu", headermenu)
Return Me
End Sub

Sub SetHidden(hidden As Boolean) As WixDataTable
DataTable.SetAttr("hidden", hidden)
Return Me
End Sub

Sub SetLineValidation(lineValidation As Boolean) As WixDataTable
DataTable.SetAttr("lineValidation", lineValidation)
Return Me
End Sub

Sub SetMath(math As Boolean) As WixDataTable
DataTable.SetAttr("math", math)
Return Me
End Sub

Sub SetMaxHeight(maxHeight As String) As WixDataTable
DataTable.SetAttr("maxHeight", maxHeight)
Return Me
End Sub

Sub SetMaxWidth(maxWidth As String) As WixDataTable
DataTable.SetAttr("maxWidth", maxWidth)
Return Me
End Sub

Sub SetMinColumnWidth(minColumnWidth As String) As WixDataTable
DataTable.SetAttr("minColumnWidth", minColumnWidth)
Return Me
End Sub

Sub SetMinRowHeight(minRowHeight As String) As WixDataTable
DataTable.SetAttr("minRowHeight", minRowHeight)
Return Me
End Sub

Sub SetPrerender(prerender As Boolean) As WixDataTable
DataTable.SetAttr("prerender", prerender)
Return Me
End Sub

Sub SetRowLineHeight(rowLineHeight As String) As WixDataTable
DataTable.SetAttr("rowLineHeight", rowLineHeight)
Return Me
End Sub

Sub SetSave(save As String) As WixDataTable
DataTable.SetAttr("save", save)
Return Me
End Sub

Sub SetScrollAlignY(scrollAlignY As Boolean) As WixDataTable
DataTable.SetAttr("scrollAlignY", scrollAlignY)
Return Me
End Sub


Sub SetType(sType As String) As WixDataTable
DataTable.SetAttr("type", sType)
Return Me
End Sub

Sub SetUndo(undo As Boolean) As WixDataTable
DataTable.SetAttr("undo", undo)
Return Me
End Sub


