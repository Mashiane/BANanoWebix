B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public TabView As WixElement
	Public Parent As WixElement

End Sub

'Initializes the TabView
Public Sub Initialize(sid As String) As WixTabView
	ID = sid.tolowercase
	TabView.Initialize(ID)
	TabView.SetView("tabview")
	Parent = Null
	Return Me
End Sub

'set the parent
Sub SetParent(p As WixElement) As WixTabView
	Parent = p
	Return Me
End Sub

Sub SetAttributes(m As Map) As WixTabView
	For Each k As String In m.Keys
		Dim v As String = m.Get(k)
		TabView.SetAttr(k,v)
	Next
	Return Me
End Sub

Sub SetStyles(m As Map) As WixTabView
	For Each k As String In m.Keys
		Dim v As String = m.Get(k)
		TabView.SetStyle(k,v)
	Next
	Return Me
End Sub

'set css
Sub SetStyle(prop As String, sval As String) As WixTabView
	TabView.SetStyle(prop,sval)
	Return Me
End Sub


'use a map object
Sub SetMap(m As Map) As WixTabView
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		TabView.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub

'add tp columns of parent
Sub Pop
	Parent.AddColumns(Item)
End Sub

Sub SetTemplateHTML(h As UOENowHTML) As WixTabView
	h.SetImportant(False)
	Dim os As String = h.HTML
	TabView.SetTemplate(os)
	Return Me
End Sub

'set name
Sub SetName(n As String) As WixTabView
	TabView.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixTabView
	TabView.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixTabView
	TabView.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixTabView
	TabView.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixTabView
	TabView.SetMinHeight(h)
	Return Me
End Sub

'set height
Sub SetHeight(h As Object) As WixTabView
	TabView.SetAttr("height", h)
	Return Me
End Sub

'set width
Sub SetWidth(w As Object) As WixTabView
	TabView.SetAttr("width", w)
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixTabView
	TabView.SetTooltip(tt)
	Return Me
End Sub

Sub SetTabBar(tb As Map) As WixTabView
	TabView.SetAttr("tabbar", tb)
	Return Me
End Sub

Sub SetMultiview(tb As Map) As WixTabView
	TabView.SetAttr("multiview", tb)
	Return Me
End Sub

'return the item
Sub Item As Map
	Return TabView.item
End Sub

'set on bottom
Sub SetTypeBottom(b As Boolean) As WixTabView   'ignore
	TabView.SetType("bottom")
	Return Me
End Sub

Sub AddItem(ti As WixTabItem)
	TabView.AddCells(ti.Item)
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


Sub SetAnimate(animate As Boolean) As WixTabView
	TabView.SetAttr("animate", animate)
	Return Me
End Sub

Sub SetBorderless(borderless As Boolean) As WixTabView
	TabView.SetAttr("borderless", borderless)
	Return Me
End Sub

Sub SetCells(cells As Object) As WixTabView
	TabView.SetAttr("cells", cells)
	Return Me
End Sub

Sub SetContainer(container As Object) As WixTabView
	TabView.SetAttr("container", container)
	Return Me
End Sub

Sub SetCss(css As Object) As WixTabView
	TabView.SetAttr("css", css)
	Return Me
End Sub

Sub SetDisabled(disabled As Boolean) As WixTabView
	TabView.SetAttr("disabled", disabled)
	Return Me
End Sub

Sub SetGravity(gravity As Object) As WixTabView
	TabView.SetAttr("gravity", gravity)
	Return Me
End Sub

Sub SetHidden(hidden As Boolean) As WixTabView
TabView.SetAttr("hidden", hidden)
Return Me
End Sub

Sub SetMaxHeight(maxHeight As Object) As WixTabView
TabView.SetAttr("maxHeight", maxHeight)
Return Me
End Sub

Sub SetMaxWidth(maxWidth As Object) As WixTabView
TabView.SetAttr("maxWidth", maxWidth)
Return Me
End Sub

Sub SetPadding(padding As Object) As WixTabView
TabView.SetAttr("padding", padding)
Return Me
End Sub

Sub SetPaddingX(paddingX As Object) As WixTabView
TabView.SetAttr("paddingX", paddingX)
Return Me
End Sub

Sub SetPaddingY(paddingY As Object) As WixTabView
TabView.SetAttr("paddingY", paddingY)
Return Me
End Sub

Sub SetType(sType As Object) As WixTabView
TabView.SetAttr("type", sType)
Return Me
End Sub
