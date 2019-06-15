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

'initialize the header
Public Sub Initialize(sID As String) As WixLayout
	ID = sID.tolowercase
	Layout.Initialize(ID).SetView("layout")
	Return Me
End Sub

'add item to row
Sub AddRows(itm As Map) As WixLayout
	Layout.AddRows(itm)
	Return Me 
End Sub

'set type Of
Sub SetType(typeof As String) As WixLayout
	Layout.TypeOf = typeof
	Return Me	
End Sub

'return the item
Sub Item As Map
	Return Layout.item
End Sub

'set the template
Sub SetTemplate(t As String) As WixLayout
	Layout.Template = t
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