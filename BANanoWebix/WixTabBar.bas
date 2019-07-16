B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public TabBar As WixElement
	Private options As List
End Sub

'Initializes the TabBar
Public Sub Initialize(sid As String) As WixTabBar
	ID = sid.tolowercase
	TabBar.Initialize(ID)
	TabBar.SetView("tabbar")
	options.Initialize 
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixTabBar
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		TabBar.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


'set close
Sub SetClose(b As Boolean) As WixTabBar
	TabBar.SetAttr("close", b)
	Return Me
End Sub


'set options
Sub SetOptions(o As List) As WixTabBar
	options = o
	Return Me
End Sub

Sub SetType(w As Object) As WixTabBar
	TabBar.SetAttr("type", w)
	Return Me
End Sub


Sub SetOptionWidth(w As Object) As WixTabBar
	TabBar.SetAttr("optionWidth", w)
	Return Me
End Sub


Sub SetTemplateHTML(h As UOENowHTML) As WixTabBar
	Dim os As String = h.HTML
	TabBar.SetTemplate(os)
	Return Me
End Sub

'set name
Sub SetName(n As String) As WixTabBar
	TabBar.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixTabBar
	TabBar.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixTabBar
	TabBar.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixTabBar
	TabBar.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixTabBar
	TabBar.SetMinHeight(h)
	Return Me
End Sub

Sub AddItem(iID As String, iText As String, iIcon As String)
	AddOption(iID, iText,iIcon)
End Sub

'add item
Sub AddOption(iID As String, iText As String, iIcon As String)
	iID = iID.tolowercase
	'
	Dim icon As UOENowHTML
	icon.Initialize("","span")
	icon.AddClass("webix_icon")
	icon.AddClass(iIcon)
	'
	Dim text As UOENowHTML
	text.Initialize("","span")
	text.SetStyle("padding-left", "4px")
	text.AddContent(iText)
	'
	Dim sb As StringBuilder
	sb.Initialize 
	sb.Append(icon.HTML)
	sb.Append(text.HTML)
	'
	Dim opt As Map = CreateMap()
	opt.Put("id", iID)
	opt.Put("value", sb.ToString)
	options.Add(opt)
End Sub


'set tooltip
Sub SetTooltip(tt As String) As WixTabBar
	TabBar.SetTooltip(tt)
	Return Me
End Sub


'set height
Sub SetHeight(h As Object) As WixTabBar
	TabBar.SetAttr("height", h)
	Return Me
End Sub

'set width
Sub SetWidth(w As Object) As WixTabBar
	TabBar.SetAttr("width", w)
	Return Me
End Sub


'set on bottom
Sub SetTypeBottom(b As Boolean) As WixTabBar   'ignore
	TabBar.SetType("bottom")
	Return Me
End Sub

'return the item
Sub Item As Map
	TabBar.SetAttr("options", options)
	Return TabBar.item
End Sub

'set multi-view
Sub SetMultiView(b As Boolean) As WixTabBar
	TabBar.SetAttr("multiview", b)
	Return Me
End Sub

'set animate
Sub SetAnimate(b As Boolean) As WixTabBar
	TabBar.SetAttr("animate", b)
	Return Me
End Sub

'set keepViews
Sub SetkeepViews(b As Boolean) As WixTabBar
	TabBar.SetAttr("keepViews", b)
	Return Me
End Sub

'set selected tab
Sub SetValue(v As Object) As WixTabBar
	TabBar.SetAttr("value", v)
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