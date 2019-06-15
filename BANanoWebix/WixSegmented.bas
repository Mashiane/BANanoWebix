B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Segmented As WixElement
	Private Options As List
End Sub

'initialize the input box
Public Sub Initialize(iID As String) As WixSegmented
	ID = iID.tolowercase
	Segmented.Initialize(iID).SetView("segmented")
	Options.Initialize
	Return Me
End Sub

'return the item
Sub Item As Map
	Segmented.SetAttr("options", Options)
	Return Segmented.item
End Sub

'set options
Sub SetOptions(o As List) As WixSegmented
	Options = o
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
