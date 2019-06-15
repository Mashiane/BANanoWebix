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

'add to rows of parent
Sub AddToRows(parent As WixElement)
	parent.AddRows(Item)
End Sub

'set the template
Sub SetTemplate(t As String) As WixTemplate
	Template.Template = t
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