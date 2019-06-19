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
Public Sub Initialize(rID As String) As WixColumn
	ID = rID.tolowercase
	Column.Initialize(ID)
	Return Me
End Sub

'add to rows collection of the column
Sub AddRows(itm As Map) As WixColumn
	Column.AddRows(itm)
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixColumn
	Column.SetTooltip(tt)
	Return Me
End Sub

'add to columns collection of the column
Sub AddColumns(itm As Map) As WixColumn
	Column.AddColumns(itm)
	Return Me
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

'set height
Sub SetHeight(h As Int) As WixColumn
	Column.SetHeight(h)
	Return Me
End Sub

'set width
Sub SetWidth(w As Int) As WixColumn
	Column.SetWidth(w)
	Return Me
End Sub