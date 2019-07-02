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
	Public Columns As List
End Sub


'set SetPager
Sub SetPager(p As String) As WixDataTable
	p = p.tolowercase
	DataTable.SetAttr("pager", p)
	Return Me
End Sub

'set scrollY
Sub SetScrollY(b As Boolean) As WixDataTable
	DataTable.SetAttr("scrollY", b)
	Return Me
End Sub

'set scrollX
Sub SetScrollX(b As Boolean) As WixDataTable
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
	Dim e As WixDataColumn
	e.Initialize2("edit").SetHeader("Edit").SetTemplate("{common.editIcon()}").SetWidth(100)
	Dim d As WixDataColumn
	d.Initialize2("delete").SetHeader("Delete").SetTemplate("{common.trashIcon()}").SetWidth(100)
	Columns.Add(e.item)
	Columns.Add(d.item)
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
	Columns.Initialize 
	Return Me
End Sub

'add header
Sub AddHeader(sid As String, sheader As String, iFillSpace As Int) As WixDataTable
	Dim col As Map = CreateMap()
	col.Put("id", sid)
	col.Put("header", sheader)
	If iFillSpace > 0 Then 
		col.Put("fillspace", iFillSpace)
	End If
	Columns.Add(col)
	Return Me
End Sub

'set scroll
Sub SetScroll(b As Boolean) As WixDataTable
	DataTable.SetAttr("scroll", b)
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

'add header from definition
Sub AddHeader1(hdr As WixDataColumn)
	Columns.Add(hdr.Item)
End Sub

Sub CreateHeader(hid As String) As WixDataColumn
	Dim hdr As WixDataColumn
	hdr.Initialize2(hid)
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


'set style to update css property
Sub SetStyle(prop As String, val As String) As WixDataTable
	DataTable.SetStyle(prop,val)
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
	DataTable.SetAttr("columns", Columns)
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
Sub SetWidth(h As object) As WixDataTable
	DataTable.SetWidth(h)
	Return Me
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'set Data
Sub SetData(data As List) As WixDataTable
	DataTable.SetData(data)
	Return Me
End Sub