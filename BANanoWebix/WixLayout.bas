B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Layout As WixElement
	Public Parent As WixElement

End Sub

'initialize the layout
Public Sub Initialize(sID As String) As WixLayout
	ID = sID.tolowercase
	Layout.Initialize(ID)
	Parent = Null
	Return Me
End Sub


Sub SetAttributes(m As Map) As WixLayout
	For Each k As String In m.Keys
		Dim v As String = m.Get(k)
		Layout.SetAttr(k,v)
	Next
	Return Me
End Sub

Sub SetStyles(m As Map) As WixLayout
	For Each k As String In m.Keys
		Dim v As String = m.Get(k)
		Layout.SetStyle(k,v)
	Next
	Return Me
End Sub

'set css
Sub SetStyle(prop As String, sval As String) As WixLayout
	Layout.SetStyle(prop,sval)
	Return Me
End Sub


'add resizer
Sub AddResizerToColumns(s As String) As WixLayout   'ignore
	Dim r As WixResizer
	r.Initialize("")
	AddColumns(r.Item)
	Return Me
End Sub

Sub AddColumnsResizer(s As String) As WixLayout   'ignore
	Dim r As WixResizer
	r.Initialize("")
	AddColumns(r.Item)
	Return Me
End Sub

'set the parent
Sub SetParent(p As WixElement) As WixLayout
	Parent = p
	Return Me
End Sub

'add a spacer to the rows
Sub AddRowsSpacer()
	Dim s As WixElement
	s.Initialize("").SetView("spacer")
	AddRows(s.item)
End Sub

'add a spacer to the columns
Sub AddColumnsSpacer()
	Dim s As WixElement
	s.Initialize("").SetView("spacer")
	AddColumns(s.item)
End Sub


'add item to a column
Sub AddColumns(itm As Map)
	Layout.AddColumns(itm)
End Sub

'add item to a row
Sub AddRows(itm As Map)
	Layout.AddRows(itm)
End Sub

'return the item
Sub Item As Map
	Return Layout.item
End Sub

'add tp columns of parent
Sub Pop
	Parent.AddColumns(Item)
End Sub

'use a map object
Sub SetMap(m As Map) As WixLayout
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		Layout.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


Sub SetTemplateHTML(h As UOENowHTML) As WixLayout
	h.SetImportant(False)
	Dim os As String = h.HTML
	Layout.SetTemplate(os)
	Return Me
End Sub

'set name
Sub SetName(n As String) As WixLayout
	Layout.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixLayout
	Layout.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixLayout
	Layout.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixLayout
	Layout.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixLayout
	Layout.SetMinHeight(h)
	Return Me
End Sub

'set scroll
Sub SetScroll(b As Object) As WixLayout
	Layout.SetAttr("scroll", b)
	Return Me
End Sub

'set template
Sub SetTemplate(t As String) As WixLayout
	Layout.SetTemplate(t)
	Return Me
End Sub


'set type
Sub SetType(t As String) As WixLayout
	Layout.SetType(t)
	Return Me
End Sub

'make clean layout
Sub SetTypeClean(a As String) As WixLayout   'ignore
	SetType("clean")
	Return Me
End Sub

'make line layout
Sub SetTypeLine(a As String) As WixLayout   'ignore
	SetType("line")
	Return Me
End Sub

'make wide layout
Sub SetTypeWide(a As String) As WixLayout   'ignore
	SetType("wide")
	Return Me
End Sub

'make space layout
Sub SetTypeSpace(a As String) As WixLayout   'ignore
	SetType("space")
	Return Me
End Sub

'make a head layout
Sub SetTypeHead(a As String) As WixLayout   'ignore
	SetType("head")
	Return Me
End Sub

'make form layout
Sub SetTypeForm(a As String) As WixLayout   'ignore
	SetType("form")
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

Sub SetBorderless(borderless As Boolean) As WixLayout
	Layout.SetAttr("borderless", borderless)
	Return Me
End Sub

Sub SetContainer(container As String) As WixLayout
	Layout.SetAttr("container", container)
	Return Me
End Sub

Sub SetCss(css As String) As WixLayout
	Layout.SetAttr("css", css)
	Return Me
End Sub

Sub SetGravity(gravity As String) As WixLayout
	Layout.SetAttr("gravity", gravity)
	Return Me
End Sub

Sub SetDisabled(disabled As Boolean) As WixLayout
	Layout.SetAttr("disabled", disabled)
	Return Me
End Sub

Sub SetHeight(height As String) As WixLayout
	Layout.SetAttr("height", height)
	Return Me
End Sub

Sub SetHidden(hidden As Boolean) As WixLayout
	Layout.SetAttr("hidden", hidden)
	Return Me
End Sub


Sub SetIsolate(isolate As Boolean) As WixLayout
	Layout.SetAttr("isolate", isolate)
	Return Me
End Sub

Sub SetMargin(margin As String) As WixLayout
	Layout.SetAttr("margin", margin)
	Return Me
End Sub

Sub SetMaxHeight(maxHeight As String) As WixLayout
	Layout.SetAttr("maxHeight", maxHeight)
	Return Me
End Sub


Sub SetMaxWidth(maxWidth As String) As WixLayout
Layout.SetAttr("maxWidth", maxWidth)
Return Me
End Sub

Sub SetPadding(padding As String) As WixLayout
Layout.SetAttr("padding", padding)
Return Me
End Sub

Sub SetPaddingX(paddingX As String) As WixLayout
Layout.SetAttr("paddingX", paddingX)
Return Me
End Sub

Sub SetPaddingY(paddingY As String) As WixLayout
Layout.SetAttr("paddingY", paddingY)
Return Me
End Sub

Sub SetBatch(paddingY As String) As WixLayout
	Layout.SetAttr("batch", paddingY)
	Return Me
End Sub


Sub SetVisibleBatch(visibleBatch As String) As WixLayout
Layout.SetAttr("visibleBatch", visibleBatch)
Return Me
End Sub

Sub SetWidth(width As String) As WixLayout
Layout.SetAttr("width", width)
Return Me
End Sub

Sub SetAnimate(animate As Boolean) As WixLayout
	Layout.SetAttr("animate", animate)
	Return Me
End Sub

Sub SetCols(cols As Object) As WixLayout
Layout.SetAttr("cols", cols)
Return Me
End Sub

Sub SetMaxHeght(maxHeght As Object) As WixLayout
Layout.SetAttr("maxHeght", maxHeght)
Return Me
End Sub

Sub SetRows(rows As Object) As WixLayout
Layout.SetAttr("rows", rows)
Return Me
End Sub