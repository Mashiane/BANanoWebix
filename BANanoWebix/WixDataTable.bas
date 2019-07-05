﻿B4J=true
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
	Dim e As WixDataColumn = CreateColumn("edit").SetHeader("Edit").SetTemplate("{common.editIcon()}").SetWidth(100)
	Dim d As WixDataColumn = CreateColumn("delete").SetHeader("Delete").SetTemplate("{common.trashIcon()}").SetWidth(100)
	DataTable.AddDataColumn(e.Item)
	DataTable.AddDataColumn(d.item)
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


'set scroll
Sub SetScroll(b As Object) As WixDataTable
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
	If Rules.Size > 0 Then
		DataTable.SetProperty("rules", Rules)
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

'add to parent elements
Sub AddToElements(P As WixElement)
	P.AddElements(Item)
End Sub