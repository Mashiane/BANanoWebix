B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.5
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public ToolBar As WixElement
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(sID As String) As WixToolBar
	ID = sID.tolowercase
	ToolBar.Initialize(ID).SetView("toolbar")
	Return Me
End Sub

'return the item
Sub Item As Map
	Return ToolBar.item
End Sub

'add a button
Sub AddButton(btn As WixButton) As WixToolBar
	ToolBar.AddColumns(btn.item)
	Return Me
End Sub

'add a spacer
Sub AddSpacer As WixToolBar
	ToolBar.AddColumnsSpacer
	Return Me 
End Sub

'add a toggle
Sub AddToggle(btn As WixToggle) As WixToolBar
	ToolBar.AddColumns(btn.item)
	Return Me
End Sub
