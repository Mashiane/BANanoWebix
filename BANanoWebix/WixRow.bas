B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.5
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Row As WixElement
	Public ID As String
End Sub

'Initializes the row.
Public Sub Initialize(rID As String) As WixRow
	ID = rID.tolowercase
	Row.Initialize(ID)
	Return Me 
End Sub

Sub CreateResizer(rid As String) As WixResizer  
	Dim res1 As WixResizer
	res1.Initialize(rid)
	Return res1
End Sub

'set type wide
Sub SetTypeWide As WixRow
	Row.SetAttr("type", "wide")
	Return Me
End Sub

'set the type
Sub SetType(t As Object) As WixRow
	Row.SetAttr("type", t)
	Return Me	
End Sub

'add rows cells
Sub AddRowsCells(mCells As List) As WixRow
	Dim opt As Map = CreateMap()
	opt.Put("cells", mCells)
	AddRows(opt)
	Return Me
End Sub

' set padding
Sub SetPadding(padding As Object) As WixRow
	Row.SetPadding(padding)
	Return Me
End Sub

' set margin
Sub SetMargin(margin As Object) As WixRow
	Row.SetMargin(margin)
	Return Me
End Sub

'add to columns
Sub AddColumns(i As Map) As WixRow
	Row.AddColumns(i)
	Return Me
End Sub

'set name
Sub SetName(n As String) As WixRow
	Row.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixRow
	Row.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixRow
	Row.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixRow
	Row.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixRow
	Row.SetMinHeight(h)
	Return Me
End Sub

'set auto width
Sub SetAutoWidth(b As Boolean) As WixRow
	Row.SetAttr("autowidth", b)
	Return Me
End Sub

'set auto height
Sub SetAutoHeight(b As Boolean) As WixRow
	Row.SetAttr("autoheight", b)
	Return Me
End Sub

'set scroll
Sub SetScroll(b As Object) As WixRow
	Row.SetAttr("scroll", b)
	Return Me
End Sub

'add to cells
Sub AddCells(i As Map) As WixRow
	Row.AddCells(i)
	Return Me
End Sub


'add to columns
Sub AddColumnsItem(i As Map) As WixRow
	AddColumns(i)
	Return Me
End Sub

'add columns spacer
Sub AddColumnsSpacer(width As Int) As WixRow  'ignore
	Dim itm As Map = CreateMap()
	If width > 0 Then itm.Put("width", width)
	Row.AddColumns(itm)
End Sub

'add to rows
Sub AddRows(i As Map) As WixRow
	Row.AddRows(i)
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixRow
	Row.SetTooltip(tt)
	Return Me
End Sub

'return the item
Sub Item As Map
	Return Row.item
End Sub

'add an item
Sub AddItem(wxEL As Map) As WixRow
	Row.AddRows(wxEL)
	Return Me
End Sub

'add column to a row
Sub AddColumn(wxEL As WixRow) As WixRow
	Row.AddColumns(wxEL.Item)
	Return Me
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'add to page
Sub AddToPage(p As WixPage)
	p.Page.AddRows(Item)
End Sub

'set height
Sub SetHeight(h As Object) As WixRow
	Row.SetHeight(h)
	Return Me
End Sub

'set width
Sub SetWidth(w As Object) As WixRow
	Row.setwidth(w)
	Return Me
End Sub


Sub SetTemplateHTML(h As UOENowHTML) As WixRow
	h.SetImportant(False)
	Dim os As String = h.HTML
	Row.SetTemplate(os)
	Return Me
End Sub

'set template
Sub SetTemplate(t As String) As WixRow
	Row.SetTemplate(t)
	Return Me
End Sub

'add to rows of parent
Sub AddToRows(prt As WixElement)
	prt.AddRows(Item)
End Sub

'add to rows of parent
Sub AddToColumns(prt As WixElement)
	prt.AddColumns(Item)
End Sub

Sub AddToScrollViewRows(sv As WixScrollView)
	sv.AddRows(Item)
End Sub

Sub AddToPageRows(sv As WixPage)
	sv.AddRows(Item)
End Sub

'use a map object
Sub SetMap(m As Map) As WixRow
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		Row.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub

'add to parent elements
Sub AddToElements(P As WixElement)
	P.AddElements(Item)
End Sub

Sub AddResizerToRows(s As String) As WixRow   'ignore
	Row.AddResizerToRows(s)
End Sub

Sub AddResizerToColumns(s As String) As WixRow   'ignore
	Row.AddResizerToColumns(s)
End Sub

'add to row
Sub AddToRow(r As WixRow)
	r.Row.AddColumns(Item)
End Sub

'make clean Column
Sub SetTypeClean(a As String) As WixRow   'ignore
	SetType("clean")
	Return Me
End Sub

'make line Column
Sub SetTypeLine(a As String) As WixRow   'ignore
	SetType("line")
	Return Me
End Sub

'make space Column
Sub SetTypeSpace(a As String) As WixRow   'ignore
	SetType("space")
	Return Me
End Sub

'make a head Column
Sub SetTypeHead(a As String) As WixRow   'ignore
	SetType("head")
	Return Me
End Sub

'make form Column
Sub SetTypeForm(a As String) As WixRow   'ignore
	SetType("form")
	Return Me
End Sub


Sub SetBorderless(borderless As Boolean) As WixRow
	Row.SetAttr("borderless", borderless)
	Return Me
End Sub

Sub SetContainer(container As String) As WixRow
	Row.SetAttr("container", container)
	Return Me
End Sub

Sub SetCss(css As String) As WixRow
	Row.SetAttr("css", css)
	Return Me
End Sub

Sub SetGravity(gravity As String) As WixRow
	Row.SetAttr("gravity", gravity)
	Return Me
End Sub

Sub SetDisabled(disabled As Boolean) As WixRow
	Row.SetAttr("disabled", disabled)
	Return Me
End Sub

Sub SetHidden(hidden As Boolean) As WixRow
	Row.SetAttr("hidden", hidden)
	Return Me
End Sub


Sub SetIsolate(isolate As Boolean) As WixRow
	Row.SetAttr("isolate", isolate)
	Return Me
End Sub

Sub SetMaxHeight(maxHeight As String) As WixRow
	Row.SetAttr("maxHeight", maxHeight)
	Return Me
End Sub


Sub SetMaxWidth(maxWidth As String) As WixRow
Row.SetAttr("maxWidth", maxWidth)
Return Me
End Sub

Sub SetPaddingX(paddingX As String) As WixRow
Row.SetAttr("paddingX", paddingX)
Return Me
End Sub

Sub SetPaddingY(paddingY As String) As WixRow
Row.SetAttr("paddingY", paddingY)
Return Me
End Sub

Sub SetBatch(paddingY As String) As WixRow
	Row.SetAttr("batch", paddingY)
	Return Me
End Sub

'set css
Sub SetStyle(prop As String, val As String) As WixRow
	Row.SetStyle(prop,val)
	Return Me
End Sub

Sub SetVisibleBatch(visibleBatch As String) As WixRow
Row.SetAttr("visibleBatch", visibleBatch)
Return Me
End Sub

Sub SetAnimate(animate As Boolean) As WixRow
	Row.SetAttr("animate", animate)
	Return Me
End Sub

Sub SetCols(cols As Object) As WixRow
Row.SetAttr("cols", cols)
Return Me
End Sub

Sub SetMaxHeght(maxHeght As Object) As WixRow
Row.SetAttr("maxHeght", maxHeght)
Return Me
End Sub

Sub SetRows(rows As Object) As WixRow
Row.SetAttr("rows", rows)
Return Me
End Sub
