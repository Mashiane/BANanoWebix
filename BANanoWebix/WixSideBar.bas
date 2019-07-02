B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public SideBar As WixElement
	Public Items As List
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(sid As String) As WixSideBar
	ID = sid.tolowercase
	SideBar.Initialize(sid).SetView("sidebar")
	Items.Initialize
	Return Me
End Sub

'add item
Sub AddItem(parentID As String, meID As String, mValue As String, mhref As String, mIcon As String, badge As String, target As String) As WixSideBar
	parentID = parentID.tolowercase
	meID = meID.tolowercase
	Dim mitem As Map = CreateMap()
	mitem.Put("id", meID)
	mitem.Put("value", mValue)
	mitem.Put("href", mhref)
	mitem.Put("badge", badge)
	mitem.Put("target", target)
	mitem.Put("icon", mIcon)
	mitem.Put("parentid", parentID)
	Items.Add(mitem)
	Return Me
End Sub

'set activeTitle:false 
Sub SetActiveTitle(b As Boolean) As WixSideBar
	SideBar.SetAttr("activeTitle", b)
	Return Me
End Sub

'set multiple open
Sub SetMultipleOpen(b As Boolean) As WixSideBar
	SideBar.setAttr("multipleOpen", b)
	Return Me
End Sub

'set titleHeight
Sub SetTitleHeight(h As Int) As WixSideBar
	SideBar.SetAttr("titleHeight", h)
	Return Me
End Sub

'set data
Sub SetData(d As List) As WixSideBar
	SideBar.SetData(d)
	Return Me
End Sub

'return menu
Sub Item As Map
	Return SideBar.item
End Sub

'set collapsed
Sub SetCollapsed(b As Boolean) As WixSideBar
	SideBar.SetAttr("collapsed", b)
	Return Me
End Sub

'set collapsed width
Sub SetCollapsedWidth(h As Boolean) As WixSideBar
	SideBar.SetAttr("collapsedWidth", h)
	Return Me
End Sub

'set height
Sub SetHeight(h As Object) As WixSideBar
	SideBar.SetAttr("height", h)
	Return Me
End Sub


'set width
Sub SetWidth(w As Object) As WixSideBar
	SideBar.SetAttr("width", w)
	Return Me
End Sub


'set position right
Sub SetPositionRight(c As String) As WixSideBar  'ignore
	SideBar.SetAttr("position", "right")
	Return Me
End Sub

'set position left
Sub SetPositionLeft(c As String) As WixSideBar  'ignore
	SideBar.SetAttr("position", "left")
	Return Me
End Sub

'set position top
Sub SetPositionTop(c As String) As WixSideBar  'ignore
	SideBar.SetAttr("position", "top")
	Return Me
End Sub

'set position top
Sub SetPositionBottom(c As String) As WixSideBar  'ignore
	SideBar.SetAttr("position", "bottom")
	Return Me
End Sub


'set position center
Sub SetPosition(c As String) As WixSideBar
	SideBar.SetAttr("position", c)
	Return Me
End Sub


'set select
Sub SetSelect(b As Boolean) As WixSideBar
	SideBar.SetProperty("select", b)
	Return Me
End Sub

'set scroll
Sub SetScroll(b As Boolean) As WixSideBar
	SideBar.SetProperty("scroll", b)
	Return Me
End Sub
