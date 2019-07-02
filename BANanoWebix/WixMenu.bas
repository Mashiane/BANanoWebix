B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Menu As WixElement
	Private typeof As Map
	Public Items As List
	Private sepCount As Int
End Sub

'initialize the menu
Public Sub Initialize(iID As String) As WixMenu
	ID = iID.tolowercase
	Menu.Initialize(iID).SetView("menu")
	typeof = CreateMap()
	Items.Initialize
	sepCount = 0
	Return Me
End Sub

' set menu pos right
Sub SetSubMenuPosRight(r As String) As WixMenu   'ignore
	Menu.SetAttr("subMenuPos", "right")
	Return Me
End Sub

'set item subsign
Sub SetItemSubSign(b As Boolean) As WixMenu
	typeof.Put("subsign", b)
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixMenu
	Menu.SetTooltip(tt)
	Return Me
End Sub

'set height
Sub SetHeight(h As Object) As WixMenu
	Menu.SetAttr("height", h)
	Return Me
End Sub

'set width
Sub SetWidth(w As Object) As WixMenu
	Menu.SetAttr("width", w)
	Return Me
End Sub

'set layout y
Sub SetLayoutY(r As String) As WixMenu  'ignore
	Menu.SetAttr("layout", "y")
	Return Me
End Sub

'set auto width
Sub SetAutoWidth(b As Boolean) As WixMenu
	Menu.SetAttr("autowidth", b)
	Return Me
End Sub

'add item
Sub AddItem(parentID As String, meID As String, mValue As String, mhref As String, mIcon As String, badge As String, target As String) As WixMenu
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

Sub AddSeparator(parentID As String) As WixMenu
	parentID = parentID.tolowercase
	sepCount = sepCount + 1
	sepCount = sepCount & ""
	Dim meID As String = "sep" & sepCount
	Dim mItem As Map = CreateMap()
	mItem.Put("id", meID)
	mItem.Put("parentid", parentID)
	mItem.Put("$template", "Separator")
	Items.Add(mItem)
	Return Me	
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'return the item
Sub Item As Map
	Menu.SetAttr("type", typeof)
	Return Menu.item
End Sub

'set select
Sub SetSelect(b As Boolean) As WixMenu
	Menu.SetProperty("select", b) 
	Return Me
End Sub

Sub SetData(d As List) As WixMenu
	Menu.SetAttr("data", d)
	Return Me
End Sub
