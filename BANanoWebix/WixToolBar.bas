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

'add an element
Sub AddItem(itm As Map) As WixToolBar
	ToolBar.AddItem(itm)
	Return Me
End Sub

'add a spacer
Sub AddSpacer As WixToolBar
	ToolBar.AddItem(CreateMap())
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

'add to row
Sub AddToRow(r As WixRow)
	r.AddItem(Item) 
End Sub