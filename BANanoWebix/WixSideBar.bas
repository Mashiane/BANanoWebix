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
	Private data As List
	Private menus As Map
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(sid As String) As WixSideBar
	ID = sid.tolowercase
	SideBar.Initialize(sid).SetView("sidebar")
	data.Initialize
	menus.Initialize
	Return Me
End Sub

'add menu item
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
	If parentID = "" Then
		Dim submenu As List
		submenu.Initialize
		mitem.Put("data", submenu)
		menus.Put(meID,mitem)
	Else
		'get existing menu
		Dim oldmenu As Map = menus.Get(parentID)
		Dim submenus As List = oldmenu.Get("data")
		submenus.Add(mitem)
		oldmenu.Put("data", submenus)
		menus.Put(parentID,oldmenu)
	End If
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

'return menu
Sub Item As Map
	data.clear
	For Each menuitem As Map In menus.Values
		data.Add(menuitem)
	Next
	SideBar.SetData(data)
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
Sub SetHeight(h As Int) As WixSideBar
	SideBar.SetAttr("height", h)
	Return Me
End Sub


'set width
Sub SetWidth(w As Int) As WixSideBar
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

