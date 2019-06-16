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
	Private Data As List
End Sub

'initialize the menu
Public Sub Initialize(iID As String) As WixMenu
	ID = iID.tolowercase
	Menu.Initialize(iID).SetView("menu")
	Data.Initialize 
	Return Me
End Sub

'add menu item
Sub AddMenuItem(mID As String, mValue As String, mhref As String) As WixMenu
	Dim mitem As Map = CreateMap()
	mitem.Put("id", mID)
	mitem.Put("value", mValue)
	mitem.Put("href", mhref)
	Data.Add(mitem)
	Return Me
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'add to toolbar
Sub AddToToolbar(tblB As WixToolBar)
	tblB.AddItem(Item)
End Sub

'return the item
Sub Item As Map
	Return Menu.item
End Sub

'set select
Sub SetSelect(b As Boolean) As WixMenu
	Menu.SetProperty("select", b) 
	Return Me
End Sub

'set template
Sub SetTemplate(l As String) As WixMenu
	Menu.SetTemplate(l)
	Return Me
End Sub

'set data
Sub SetData(d As List) As WixMenu
	Menu.setData(d)
	Return Me
End Sub
