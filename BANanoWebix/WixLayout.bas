B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Layout As WixElement
End Sub

'initialize the layout
Public Sub Initialize(sID As String) As WixLayout
	ID = sID.tolowercase
	Layout.Initialize(ID).SetView("layout")
	Return Me
End Sub

'return the item
Sub Item As Map
	Return Layout.item
End Sub


'set template
Sub SetTemplate(t As String) As WixLayout
	Layout.SetTemplate(t)
	Return Me
End Sub