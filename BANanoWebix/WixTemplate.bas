B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Template As WixElement
End Sub

'initialize the header
Public Sub Initialize(sID As String) As WixTemplate
	ID = sID.tolowercase
	Template.Initialize(ID)
	Template.TypeOf = ""
	Return Me
End Sub

'return the item
Sub Item As Map
	Return Template.item
End Sub