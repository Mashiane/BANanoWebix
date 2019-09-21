B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.5
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Column As WixElement
	Public ID As String
	Public Parent As WixElement

End Sub

'Initializes the column.
Public Sub Initialize(rID As String) As WixColumn
	ID = rID.tolowercase
	Column.Initialize(ID)
	Parent = Null
	Return Me
End Sub

'set the parent
Sub SetParent(p As WixElement) As WixColumn
	Parent = p
	Return Me
End Sub

'set padding
Sub SetPadding(padding As Object) As WixColumn
	Column.SetPadding(padding)
	Return Me
End Sub

'set padding
Sub SetMargin(margin As Object) As WixColumn
	Column.SetMargin(margin)
	Return Me
End Sub

Sub SetAttributes(m As Map) As WixColumn
	For Each k As String In m.Keys
		Dim v As String = m.Get(k)
		Column.SetAttr(k,v)
	Next
	Return Me
End Sub

Sub SetStyles(m As Map) As WixColumn
	For Each k As String In m.Keys
		Dim v As String = m.Get(k)
		Column.SetStyle(k,v)
	Next
	Return Me
End Sub

'add to rows collection of the column
Sub AddRows(itm As Map) As WixColumn
	Column.AddRows(itm)
	Return Me
End Sub

'add tp columns of parent
Sub Pop
	Parent.AddColumns(Item)
End Sub

Sub SetTemplateHTML(h As UOENowHTML) As WixColumn
	h.SetImportant(False)
	Dim os As String = h.HTML
	Column.SetTemplate(os)
	Return Me
End Sub


Sub AddResizerToRows(s As String) As WixColumn   'ignore
	Column.AddResizerToRows(s)
End Sub

Sub AddResizerToColumns(s As String) As WixColumn   'ignore
	Column.AddResizerToColumns(s)
End Sub


'set name
Sub SetName(n As String) As WixColumn
	Column.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixColumn
	Column.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixColumn
	Column.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixColumn
	Column.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixColumn
	Column.SetMinHeight(h)
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixColumn
	Column.SetTooltip(tt)
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixColumn
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		Column.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


'add to columns collection of the column
Sub AddColumns(itm As Map) As WixColumn
	Column.AddColumns(itm)
	Return Me
End Sub

'return the item
Sub Item As Map
	Return Column.item
End Sub

'add an item
Sub AddItem(wxEL As Map) 
	Column.AddColumns(wxEL)
End Sub


'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'add to row
Sub AddToRow(r As WixRow)
	r.Row.AddColumns(Item)
End Sub

'set height
Sub SetHeight(h As Object) As WixColumn
	Column.SetHeight(h)
	Return Me
End Sub

'set width
Sub SetWidth(w As Object) As WixColumn
	Column.SetWidth(w)
	Return Me
End Sub

'set template
Sub SetTemplate(t As String) As WixColumn
	Column.SetTemplate(t)
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


'set scroll
Sub SetScroll(b As Object) As WixColumn
	Column.SetAttr("scroll", b)
	Return Me
End Sub


'set type
Sub SetType(t As String) As WixColumn
	Column.SetType(t)
	Return Me
End Sub

'make clean Column
Sub SetTypeClean(a As String) As WixColumn   'ignore
	SetType("clean")
	Return Me
End Sub

'make line Column
Sub SetTypeLine(a As String) As WixColumn   'ignore
	SetType("line")
	Return Me
End Sub

'make wide Column
Sub SetTypeWide(a As String) As WixColumn   'ignore
	SetType("wide")
	Return Me
End Sub

'make space Column
Sub SetTypeSpace(a As String) As WixColumn   'ignore
	SetType("space")
	Return Me
End Sub

'make a head Column
Sub SetTypeHead(a As String) As WixColumn   'ignore
	SetType("head")
	Return Me
End Sub

'make form Column
Sub SetTypeForm(a As String) As WixColumn   'ignore
	SetType("form")
	Return Me
End Sub


Sub SetBorderless(borderless As Boolean) As WixColumn
	Column.SetAttr("borderless", borderless)
	Return Me
End Sub

Sub SetContainer(container As String) As WixColumn
	Column.SetAttr("container", container)
	Return Me
End Sub

Sub SetCss(css As String) As WixColumn
	Column.SetAttr("css", css)
	Return Me
End Sub

Sub SetGravity(gravity As String) As WixColumn
	Column.SetAttr("gravity", gravity)
	Return Me
End Sub

Sub SetDisabled(disabled As Boolean) As WixColumn
	Column.SetAttr("disabled", disabled)
	Return Me
End Sub

Sub SetHidden(hidden As Boolean) As WixColumn
	Column.SetAttr("hidden", hidden)
	Return Me
End Sub


Sub SetIsolate(isolate As Boolean) As WixColumn
	Column.SetAttr("isolate", isolate)
	Return Me
End Sub

Sub SetMaxHeight(maxHeight As String) As WixColumn
	Column.SetAttr("maxHeight", maxHeight)
	Return Me
End Sub


Sub SetMaxWidth(maxWidth As String) As WixColumn
Column.SetAttr("maxWidth", maxWidth)
Return Me
End Sub

Sub SetPaddingX(paddingX As String) As WixColumn
Column.SetAttr("paddingX", paddingX)
Return Me
End Sub

Sub SetPaddingY(paddingY As String) As WixColumn
Column.SetAttr("paddingY", paddingY)
Return Me
End Sub

Sub SetBatch(paddingY As String) As WixColumn
	Column.SetAttr("batch", paddingY)
	Return Me
End Sub

'set css
Sub SetStyle(prop As String, val As String) As WixColumn
	Column.SetStyle(prop,val)
	Return Me
End Sub

Sub SetVisibleBatch(visibleBatch As String) As WixColumn
Column.SetAttr("visibleBatch", visibleBatch)
Return Me
End Sub

Sub SetAnimate(animate As Boolean) As WixColumn
	Column.SetAttr("animate", animate)
	Return Me
End Sub

Sub SetCols(cols As Object) As WixColumn
Column.SetAttr("cols", cols)
Return Me
End Sub

Sub SetMaxHeght(maxHeght As Object) As WixColumn
Column.SetAttr("maxHeght", maxHeght)
Return Me
End Sub

Sub SetRows(rows As Object) As WixColumn
Column.SetAttr("rows", rows)
Return Me
End Sub