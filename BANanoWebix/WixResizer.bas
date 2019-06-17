B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Resizer As WixElement
End Sub

'initialize the input box
Public Sub Initialize(iID As String) As WixResizer
	ID = iID.tolowercase
	Resizer.Initialize(iID).SetView("resizer")
	Return Me
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'return the item
Sub Item As Map
	Return Resizer.item
End Sub

'add as a column iten
Sub AddToColumns(parent As WixElement)
	parent.AddColumns(Item)
End Sub