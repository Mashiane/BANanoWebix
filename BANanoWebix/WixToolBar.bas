B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.5
@EndOfDesignText@
#IgnoreWarnings:12
'icons: http://www.entypo.com/
Sub Class_Globals
	Public ID As String
	Public ToolBar As WixElement
End Sub

'add to page
Sub AddToPage(pg As WixPage)
	ToolBar.AddToRows(pg.Page)
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(sID As String) As WixToolBar
	ID = sID.tolowercase
	ToolBar.Initialize(ID).SetView("toolbar")
	Return Me
End Sub


'set tooltip
Sub SetTooltip(tt As String) As WixToolBar
	ToolBar.SetTooltip(tt)
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

'add a button and define it
Sub CreateButton(sid As String) As WixButton
	Dim btn As WixButton
	btn.Initialize(sid)
	btn.parent = ToolBar
	Return btn
End Sub

'add an icon and define it
Sub CreateIcon(sid As String) As WixIcon
	Dim btn As WixIcon
	btn.Initialize(sid).SetParent(ToolBar)
	Return btn
End Sub


'add a toggle button and define it
Sub CreateToggle(sid As String) As WixButton
	Dim btn As WixButton
	btn.Initialize(sid).SetToggle("").SetParent(ToolBar)
	Return btn
End Sub

'add a spacer
Sub AddSpacer As WixToolBar
	ToolBar.AddColumnsSpacer
	Return Me 
End Sub

'add icon
Sub AddIcon(icn As WixIcon) As WixToolBar
	ToolBar.AddColumns(icn.Item)
	Return Me
End Sub