B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public DataColumn As WixElement
	Private hdr As Map
	Private title As Object
	Private Styles As Map
	Private hasFilter As Boolean
	Private foot As Map
	Private hasFooterFilter As Boolean
	Private Footertitle As Object
	Public Parent As WixElement

End Sub

'set the parent
Sub SetParent(p As WixElement) As WixDataColumn
	Parent = p
	Return Me
End Sub


'Initializes the data column
Public Sub Initialize(cID As String) As WixDataColumn
	ID = cID.tolowercase
	DataColumn.Initialize(ID)
	hdr.Initialize
	title = "" 
	Styles.Initialize 
	hasFilter = False
	foot.Initialize 
	hasFooterFilter = False
	Footertitle = ""
	Parent = Null
	Return Me
End Sub

'add tp columns of parent
Sub Pop
	Parent.AddColumns(Item)
End Sub

Sub SetTemplateHTML(h As UOENowHTML) As WixDataColumn
	h.SetImportant(False)
	Dim os As String = h.HTML
	DataColumn.SetTemplate(os)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixDataColumn
	DataColumn.SetResponsive(b)
	Return Me
End Sub

'set style
Sub SetStyle(prop As String, val As String) As WixDataColumn
	Styles.Put(prop,val)
	Return Me
End Sub

'set name
Sub SetName(n As String) As WixDataColumn
	DataColumn.SetName(n)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixDataColumn
	DataColumn.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixDataColumn
	DataColumn.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixDataColumn
	DataColumn.SetMinHeight(h)
	Return Me
End Sub

'set height
Sub SetHeight(h As Int) As WixDataColumn
	DataColumn.SetHeight(h)
	Return Me
End Sub


'use a map object
Sub SetMap(m As Map) As WixDataColumn
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		DataColumn.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub

'set options
Sub SetOptions(options As List) As WixDataColumn
	DataColumn.SetAttr("options", options)
	Return Me
End Sub

'set number format
Sub SetNumberFormat(n As Object) As WixDataColumn
	DataColumn.SetAttr("numberFormat", n)
	Return Me
End Sub

'set batch
Sub SetBatch(b As Int) As WixDataColumn
	DataColumn.SetAttr("batch", b)
	Return Me
End Sub

'set hidden
Sub SetHidden(b As Boolean) As WixDataColumn
	DataColumn.SetAttr("hidden", b)
	Return Me
End Sub

Sub SetAlign(r As Object) As WixDataColumn
	DataColumn.SetStyle("text-align", r)
	Return Me
End Sub

'align right
Sub SetAlignRight(b As Boolean) As WixDataColumn   'ignore
	DataColumn.SetStyle("text-align", "right")
	Return Me
End Sub

'align center
Sub SetAlignCenter(b As Boolean) As WixDataColumn   'ignore
	DataColumn.SetStyle("text-align", "center")
	Return Me
End Sub

'set adjust
Sub SetAdjust(a As Object) As WixDataColumn
	DataColumn.SetAttr("adjust", a)
	Return Me
End Sub


'set live edit
Sub SetLiveEdit(a As Object) As WixDataColumn
	DataColumn.SetAttr("liveEdit", a)
	Return Me
End Sub

'set math
Sub SetMath(a As Object) As WixDataColumn
	DataColumn.SetAttr("math", a)
	Return Me
End Sub

'set adjust header
Sub SetAdjustHeader(b As Boolean) As WixDataColumn  'ignore
	SetAdjust("header")
	Return Me
End Sub

'set adjust data
Sub SetAdjustData(b As Boolean) As WixDataColumn  'ignore
	SetAdjust("data")
	Return Me
End Sub

'set the header title after setting other heading props
Sub SetHeader(h As Object) As WixDataColumn
	title = h
	Return Me
End Sub

'set the header title after setting other heading props
Sub SetFooter(h As Object) As WixDataColumn
	Footertitle = h
	Return Me
End Sub


'set width
Sub SetWidth(w As Object) As WixDataColumn
	DataColumn.SetAttr("width", w)
	Return Me
End Sub

'set editor
Sub SetEditor(e As String) As WixDataColumn
	DataColumn.SetAttr("editor", e)
	Return Me
End Sub

'set edit action
Sub SetEditAction(e As String) As WixDataColumn
	DataColumn.SetAttr("editaction", e)
	Return Me
End Sub

'set edit action
Sub SetEditActionClick(e As Boolean) As WixDataColumn  'ignore
	DataColumn.SetAttr("editaction", "click")
	Return Me
End Sub

'set edit action
Sub SetEditActionCustom(e As Boolean) As WixDataColumn   'ignore
	DataColumn.SetAttr("editaction", "custom")
	Return Me
End Sub


'set edit action
Sub SetEditActionDblClick(e As Boolean) As WixDataColumn   'ignore
	DataColumn.SetAttr("editaction", "dblclick")
	Return Me
End Sub


'set editor popup
Sub SetEditorPopUp(e As String) As WixDataColumn  'ignore
	SetEditor("popup")
	Return Me
End Sub

'set editor color
Sub SetEditorColor(r As String) As WixDataColumn   'ignore
	SetEditor("color")
	Return Me
End Sub

'set editor text
Sub SetEditorText(r As String) As WixDataColumn    'ignore
	SetEditor("text")
	Return Me
End Sub

'set editor password
Sub SetEditorPassword(r As String) As WixDataColumn    'ignore
	SetEditor("password")
	Return Me
End Sub

'set editor date
Sub SetEditorDate(r As String) As WixDataColumn    'ignore
	SetEditor("date")
	Return Me
End Sub

'set editor inline text
Sub SetEditorInlineText(r As String) As WixDataColumn    'ignore
	SetEditor("inline-text")
	Return Me
End Sub

'set editor select
Sub SetEditorSelect(r As String) As WixDataColumn    'ignore
	SetEditor("select")
	Return Me
End Sub

'set editor combo
Sub SetEditorCombo(r As String) As WixDataColumn    'ignore
	SetEditor("combo")
	Return Me
End Sub

'set editor rich select
Sub SetEditorRichSelect(r As String) As WixDataColumn    'ignore
	SetEditor("richselect")
	Return Me
End Sub

'set editor rich select
Sub SetEditorCheckBox(r As String) As WixDataColumn    'ignore
	SetEditor("checkbox")
	Return Me
End Sub

'set css
Sub SetCSS(c As Object) As WixDataColumn
	DataColumn.SetAttr("css", c)
	Return Me
End Sub

'set type
Sub SetType(c As Object) As WixDataColumn
	DataColumn.SetAttr("type", c)
	Return Me
End Sub

'set label
Sub SetLabel(c As Object) As WixDataColumn
	DataColumn.SetAttr("label", c)
	Return Me
End Sub


Sub SetCSSJSON(json As String) As WixDataColumn
	DataColumn.SetCSSJSON(json)
	Return Me
End Sub


'set editor inline checkbox
Sub SetEditorInlineCheckBox(r As String) As WixDataColumn    'ignore
	SetEditor("inline-checkbox")
	Return Me
End Sub

'set fill space
Sub SetFillSpace(s As Object) As WixDataColumn
	DataColumn.SetAttr("fillspace", s)
	Return Me
End Sub

'set template
Sub SetTemplate(t As Object) As WixDataColumn
	DataColumn.SetTemplate(t)
	Return Me
End Sub

'set check value
Sub SetCheckValue(v As Object) As WixDataColumn
	DataColumn.SetAttr("checkValue", v)
	Return Me
End Sub

'set tooltip
Sub SetToolTip(v As Object) As WixDataColumn
	DataColumn.SetAttr("tooltip", v)
	Return Me
End Sub


'set uncheck value
Sub SetUncheckValue(v As Object) As WixDataColumn
	DataColumn.SetAttr("uncheckValue", v)
	Return Me
End Sub

' set template checkbox
Sub SetCheckBox(b As Boolean) As WixDataColumn		'ignore
	SetTemplate("{common.checkbox()}")
	Return Me
End Sub

'set template radio
Sub SetRadio(b As Boolean) As WixDataColumn			'ignore
	SetTemplate("{common.radio()}")
	Return Me
End Sub

Sub SetMasterCheckBox(b As Boolean) As WixDataColumn    'ignore
	hdr.Put("content", "masterCheckbox")
	Return Me
End Sub

'set text filter
Sub SetHeaderTextFilter(b As Boolean) As WixDataColumn     'ignore
	hdr.Put("content", "textFilter")
	hasFilter = True
	Return Me
End Sub

Sub SetFooterTextFilter(b As Boolean) As WixDataColumn     'ignore
	foot.Put("content", "textFilter")
	hasFooterFilter = True
	Return Me
End Sub


Sub SetHeaderContent(c As Object) As WixDataColumn
	hdr.Put("content", c)
	hasFilter = True
	Return Me
End Sub

Sub SetFooterContent(c As Object) As WixDataColumn
	foot.Put("content", c)
	hasFooterFilter = True
	Return Me
End Sub


'set number filter
Sub SetHeaderNumberFilter(b As Boolean) As WixDataColumn     'ignore
	hdr.Put("content", "numberFilter")
	hasFilter = True
	Return Me
End Sub

Sub SetFooterNumberFilter(b As Boolean) As WixDataColumn     'ignore
	foot.Put("content", "numberFilter")
	hasFooterFilter = True
	Return Me
End Sub


'set date filter
Sub SetHeaderDateFilter(b As Boolean) As WixDataColumn     'ignore
	hdr.Put("content", "dateFilter")
	hasFilter = True
	Return Me
End Sub

Sub SetFooterDateFilter(b As Boolean) As WixDataColumn     'ignore
	foot.Put("content", "dateFilter")
	hasFooterFilter = True
	Return Me
End Sub

'set select filter
Sub SetHeaderSelectFilter(b As Boolean) As WixDataColumn     'ignore
	hdr.Put("content", "selectFilter")
	hasFilter = True
	Return Me
End Sub

Sub SetFooterSelectFilter(b As Boolean) As WixDataColumn     'ignore
	foot.Put("content", "selectFilter")
	hasFooterFilter = true
	Return Me
End Sub


'set sort
Sub SetSort(s As Object) As WixDataColumn
	DataColumn.SetAttr("sort", s)
	Return Me
End Sub


'set collection
Sub SetCollection(s As Object) As WixDataColumn
	DataColumn.SetAttr("collection", s)
	Return Me
End Sub

'set sort int
Sub SetSortInt(b As Boolean) As WixDataColumn   'ignore
	SetSort("int")
	Return Me
End Sub

'set sort string
Sub SetSortString(b As Boolean) As WixDataColumn   'ignore
	SetSort("string")
	Return Me
End Sub

'set sort string_strict
Sub SetSortStringStrict(b As Boolean) As WixDataColumn   'ignore
	SetSort("string_strict")
	Return Me
End Sub

'set sort date
Sub SetSortDate(b As Boolean) As WixDataColumn   'ignore
	SetSort("date")
	Return Me
End Sub


'set sort text
Sub SetSortText(b As Boolean) As WixDataColumn   'ignore
	SetSort("text")
	Return Me
End Sub


'set format
Sub SetFormat(s As Object) As WixDataColumn
	DataColumn.SetAttr("format", s)
	Return Me
End Sub


'set suggestion
Sub SetSuggest(s As Object) As WixDataColumn
	DataColumn.SetAttr("suggest", s)
	Return Me
End Sub

'set header text
Sub SetHeaderText(t As Object) As WixDataColumn
	hdr.Put("text", t)
	Return Me
End Sub

Sub SetFooterText(t As Object) As WixDataColumn
	foot.Put("text", t)
	Return Me
End Sub

'set css
Sub SetHeaderCSS(c As Object) As WixDataColumn
	hdr.put("css", c)
	Return Me
End Sub

Sub SetFooterCSS(c As Object) As WixDataColumn
	foot.put("css", c)
	Return Me
End Sub


'set header colspan
Sub SetHeaderColSpan(c As Object) As WixDataColumn
	hdr.Put("colspan", c)
	Return Me
End Sub

Sub SetFooterColSpan(c As Object) As WixDataColumn
	foot.Put("colspan", c)
	Return Me
End Sub


'set header rowspan
Sub SetHeaderRowSpan(c As Object) As WixDataColumn
	hdr.Put("rowspan", c)
	Return Me
End Sub

Sub SetFooterRowSpan(c As Object) As WixDataColumn
	foot.Put("rowspan", c)
	Return Me
End Sub


Sub SetHeaderRotate(c As Object) As WixDataColumn
	hdr.Put("rotate", c)
	Return Me
End Sub

Sub SetFooterRotate(c As Object) As WixDataColumn
	foot.Put("rotate", c)
	Return Me
End Sub


Sub SetHeaderAutoHeight(c As Object) As WixDataColumn
	hdr.Put("autoheight", c)
	Return Me
End Sub

Sub SetFooterAutoHeight(c As Object) As WixDataColumn
	foot.Put("autoheight", c)
	Return Me
End Sub


Sub SetHeaderHeight(c As Object) As WixDataColumn
	hdr.Put("height", c)
	Return Me
End Sub

Sub SetFooterHeight(c As Object) As WixDataColumn
	foot.Put("height", c)
	Return Me
End Sub

'return the item
Sub Item As Map
	If Styles.Size > 0 Then
		hdr.Put("css", Styles)
	End If
	If hdr.Size > 0 Then
		Dim lst As List
		lst.Initialize
		If hasFilter Then
			lst.Add(title)
			lst.Add(hdr)
		Else
			lst.Add(hdr)
			lst.Add(title)
		End If
		DataColumn.SetAttr("header", lst)
	Else
		DataColumn.SetAttr("header", title)
	End If
	'
	If foot.Size > 0 Then
		Dim lst As List
		lst.Initialize
		If hasFooterFilter Then
			lst.Add(Footertitle)
			lst.Add(foot)
		Else
			lst.Add(foot)
			lst.Add(Footertitle)
		End If
		DataColumn.SetAttr("footer", lst)
	Else
		DataColumn.SetAttr("footer", Footertitle)
	End If
	Return DataColumn.item
End Sub


'add to parent rows
Sub AddToRows(P As WixElement)
	P.AddRows(Item)
End Sub

'add to parent columns
Sub AddToColumns(P As WixElement)
	P.AddDataColumn(Item)
End Sub

Sub AddToDataColumns(P As WixElement)
	P.AddDataColumn(Item)
End Sub


'add to parent elements
Sub AddToElements(P As WixElement)
	P.AddElements(Item)
End Sub