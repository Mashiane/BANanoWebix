B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public SideMenu As WixElement
	Private body As WixElement
	Private data As List
	Private typeOf As Map
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(sid As String) As WixSideMenu
	ID = sid.tolowercase
	SideMenu.Initialize(sid).SetView("sidemenu")
	body.Initialize(ID & "body").SetView("list").SetBorderLess(True).SetScroll(False).SetSelect(True)
	data.Initialize 
	typeOf.Initialize 
	Return Me 
End Sub

'add item
Sub AddItem(eID As String, eLabel As String, eIcon As String)
	eID = eID.tolowercase
	Dim itm As WixElement
	itm.Initialize(eID).SetValue(eLabel).SetIcon(eIcon)
	data.Add(itm.Item)
End Sub

'return menu
Sub Item As Map
	body.SetAttr("type", typeOf)
	body.SetData(data)
	SideMenu.SetAttr("body", body.item)
	Return SideMenu.item
End Sub

'set template
Sub SetTemplate(t As String) As WixSideMenu
	body.SetTemplate(t)
	Return Me
End Sub


'set height
Sub SetHeight(h As Int) As WixSideMenu
	SideMenu.SetAttr("height", h)
	Return Me
End Sub


'set height
Sub SetItemHeight(h As Int) As WixSideMenu
	typeOf.Put("height", h)
	Return Me
End Sub

'set width
Sub SetItemWidth(w As Int) As WixSideMenu
	typeOf.Put("width", w)
	Return Me
End Sub


'set layout x
Sub SetLayoutX(h As Boolean) As WixSideMenu
	body.SetAttr("layout", "x")
	Return Me
End Sub


'set width
Sub SetWidth(w As Int) As WixSideMenu
	SideMenu.SetAttr("width", w)
	Return Me
End Sub


'set position right
Sub SetPositionRight(c As String) As WixSideMenu  'ignore
	SideMenu.SetAttr("position", "right")
	Return Me
End Sub

'set position left
Sub SetPositionLeft(c As String) As WixSideMenu  'ignore
	SideMenu.SetAttr("position", "left")
	Return Me
End Sub

'set position top
Sub SetPositionTop(c As String) As WixSideMenu  'ignore
	SideMenu.SetAttr("position", "top")
	Return Me
End Sub

'set position top
Sub SetPositionBottom(c As String) As WixSideMenu  'ignore
	SideMenu.SetAttr("position", "bottom")
	Return Me
End Sub


'set position center
Sub SetPosition(c As String) As WixSideMenu
	SideMenu.SetAttr("position", c)
	Return Me
End Sub
