B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.5
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Row As WixElement
	Public ID As String
End Sub

'Initializes the row.
Public Sub Initialize(rID As String) As WixRow
	ID = rID.tolowercase
	Row.Initialize(ID)
	Return Me 
End Sub

'set type wide
Sub SetTypeWide As WixRow
	Row.SetAttr("type", "wide")
	Return Me
End Sub

'add to columns
Sub AddColumns(i As Map) As WixRow
	Row.AddColumns(i)
	Return Me
End Sub

'add to columns
Sub AddColumnsItem(i As Map) As WixRow
	AddColumns(i)
	Return Me
End Sub

'add columns spacer
Sub AddColumnsSpacer(width As Int) As WixRow  'ignore
	Dim itm As Map = CreateMap()
	If width > 0 Then itm.Put("width", width)
	Row.AddColumns(itm)
End Sub

'add to rows
Sub AddRows(i As Map) As WixRow
	Row.AddRows(i)
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixRow
	Row.SetTooltip(tt)
	Return Me
End Sub

'return the item
Sub Item As Map
	Return Row.item
End Sub

'add an item
Sub AddItem(wxEL As Map) As WixRow
	Row.AddRows(wxEL)
	Return Me
End Sub

'add column to a row
Sub AddColumn(wxEL As WixColumn) As WixRow
	Row.AddColumns(wxEL.Item)
	Return Me
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'add to page
Sub AddToPage(p As WixPage)
	p.Page.AddRows(Item)
End Sub

'set height
Sub SetHeight(h As Int) As WixRow
	Row.SetHeight(h)
	Return Me
End Sub

'set width
Sub SetWidth(w As Int) As WixRow
	Row.setwidth(w)
	Return Me
End Sub
