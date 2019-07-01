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

'Initializes the accordion
Public Sub Initialize(sid As String) As WixTabBar
	ID = sid.tolowercase
	TabBar.Initialize(ID)
	TabBar.SetView("tabbar")
	options.Initialize 
	Return Me
End Sub

'add item
Sub AddItem(iID As String, iText As String, iIcon As String)
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
Sub SetHeight(h As Int) As WixTabBar
	TabBar.SetAttr("height", h)
	Return Me
End Sub

'set width
Sub SetWidth(w As Int) As WixTabBar
	TabBar.SetAttr("width", w)
	Return Me
End Sub


'set on bottom
Sub SetTypeBottom(b As Boolean) As WixTabBar
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

'set fitBiggest
Sub SetFitBiggest(b As Boolean) As WixTabBar
	TabBar.SetAttr("fitBiggest", b)
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