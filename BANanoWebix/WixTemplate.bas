B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Template As WixElement
End Sub

'Initializes the Context
Public Sub Initialize(sid As String) As WixTemplate
	ID = sid.ToLowerCase
	Template.Initialize(ID).setview("template")
	Return Me
End Sub

'return the item
Sub Item As Map
	Return Template.item
End Sub

'add item to a column
Sub AddColumns(itm As Map)
	Template.AddColumns(itm)
End Sub


Sub SetTemplateHTML(h As UOENowHTML) As WixTemplate
	h.SetImportant(False)
	Dim os As String = h.HTML
	Template.SetTemplate(os)
	Return Me
End Sub

'set na
Sub SetName(n As String) As WixTemplate
	Template.SetName(n)
	Return Me
End Sub


'set reponsive
Sub SetResponsive(b As Object) As WixTemplate
	Template.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixTemplate
	Template.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixTemplate
	Template.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixTemplate
	Template.SetMinHeight(h)
	Return Me
End Sub

'add item to a row
Sub AddRows(itm As Map)
	Template.AddRows(itm)
End Sub

Sub AddRow(r As WixRow) As WixTemplate
	AddRows(r.Item)
	Return Me
End Sub


'use a map object
Sub SetMap(m As Map) As WixTemplate
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		Template.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


'add row items
Sub AddRowItems(items As List)
	For Each m As Map In items
		AddRows(m)
	Next
End Sub

'add rows
Sub AddWixRows(lst As List)
	For Each i As WixRow In lst
		AddRow(i)
	Next
End Sub

'set height
Sub SetHeight(h As Object) As WixTemplate
	Template.SetAttr("height", h)
	Return Me
End Sub

'set width
Sub SetWidth(w As Object) As WixTemplate
	Template.SetAttr("width", w)
	Return Me
End Sub

'set auto width
Sub SetAutoWidth(b As Boolean) As WixTemplate
	Template.SetAttr("autowidth", b)
	Return Me
End Sub

'set template
Sub SetTemplate(t As String) As WixTemplate
	Template.SetAttr("template", t)
	Return Me
End Sub

'set scroll
Sub SetScroll(b As Object) As WixTemplate
	Template.SetAttr("scroll", b)
	Return Me
End Sub

'set scroll xy
Sub SetScrollXY(b As Boolean) As WixTemplate  'ignore
	SetScroll("xy")
	Return Me
End Sub

'set type
Sub SetType(t As String) As WixTemplate
	Template.SetType(t)
	Return Me
End Sub

'set css
Sub SetStyle(prop As String, val As String) As WixTemplate
	Template.SetStyle(prop,val)
	Return Me
End Sub

'make clean layout
Sub SetTypeClean(a As String) As WixTemplate  'ignore
	SetType("clean")
	Return Me
End Sub

'make line layout
Sub SetTypeLine(a As String) As WixTemplate   'ignore
	SetType("line")
	Return Me
End Sub

'make wide layout
Sub SetTypeWide(a As String) As WixTemplate   'ignore
	SetType("wide")
	Return Me
End Sub

'make space layout
Sub SetTypeSpace(a As String) As WixTemplate   'ignore
	SetType("space")
	Return Me
End Sub

'make a head layout
Sub SetTypeHead(a As String) As WixTemplate   'ignore
	SetType("head")
	Return Me
End Sub

'make form layout
Sub SetTypeForm(a As String) As WixTemplate  'ignore
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

Sub SetAnimate(animate As Boolean) As WixTemplate
	Template.SetAttr("animate", animate)
	Return Me
End Sub

Sub SetAutoheight(autoheight As Boolean) As WixTemplate
	Template.SetAttr("autoheight", autoheight)
	Return Me
End Sub

Sub SetBorderless(borderless As Boolean) As WixTemplate
	Template.SetAttr("borderless", borderless)
	Return Me
End Sub

Sub SetContainer(container As Object) As WixTemplate
	Template.SetAttr("container", container)
	Return Me
End Sub

Sub SetContent(content As Object) As WixTemplate
	Template.SetAttr("content", content)
	Return Me
End Sub

Sub SetCss(css As Object) As WixTemplate
	Template.SetAttr("css", css)
	Return Me
End Sub

Sub SetData(data As Object) As WixTemplate
	Template.SetAttr("data", data)
	Return Me
End Sub

Sub SetDisabled(disabled As Boolean) As WixTemplate
	Template.SetAttr("disabled", disabled)
	Return Me
End Sub

Sub SetGravity(gravity As Object) As WixTemplate
	Template.SetAttr("gravity", gravity)
	Return Me
End Sub

Sub SetHidden(hidden As Boolean) As WixTemplate
Template.SetAttr("hidden", hidden)
Return Me
End Sub

Sub SetMaxHeight(maxHeight As Object) As WixTemplate
Template.SetAttr("maxHeight", maxHeight)
Return Me
End Sub

Sub SetMaxWidth(maxWidth As Object) As WixTemplate
Template.SetAttr("maxWidth", maxWidth)
Return Me
End Sub

Sub SetScrollSpeed(scrollSpeed As Object) As WixTemplate
Template.SetAttr("scrollSpeed", scrollSpeed)
Return Me
End Sub

Sub SetSrc(src As Object) As WixTemplate
Template.SetAttr("src", src)
Return Me
End Sub

Sub SetTooltip(tooltip As Object) As WixTemplate
Template.SetAttr("tooltip", tooltip)
Return Me
End Sub

Sub SetUrl(url As Object) As WixTemplate
Template.SetAttr("url", url)
Return Me
End Sub

Sub SetDatatype(datatype As Object) As WixTemplate
Template.SetAttr("datatype", datatype)
Return Me
End Sub

