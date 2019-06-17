B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public MultiView As WixElement
End Sub

'Initializes the accordion
Public Sub Initialize(sid As String) As WixMultiView
	ID = sid.tolowercase
	MultiView.Initialize(ID)
	MultiView.SetView("multiview")
	Return Me
End Sub

'return the item
Sub Item As Map
	Return MultiView.item
End Sub
