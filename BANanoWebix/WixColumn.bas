B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.5
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Column As WixElement
	Public ID As String
End Sub

'Initializes the column.
Public Sub Initialize(rID As String)
	ID = rID.tolowercase
	Column.Initialize(ID)
End Sub

'return the item
Sub Item As Map
	Return Column.item
End Sub

'add an item
Sub AddItem(wxEL As Map) 
	Column.AddColumns(wxEL)
End Sub


'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'add to row
Sub AddToRow(r As WixRow)
	r.Row.AddColumns(Item)
End Sub