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


Sub SetTemplateHTML(h As UOENowHTML) As WixColumn
	Dim os As String = h.HTML
	Column.SetTemplate(os)
	Return Me
End Sub

' set padding
Sub SetPadding(padding As Object) As WixColumn
	Column.SetPadding(padding)
	Return Me
End Sub


Sub AddResizerToRows(s As String) As WixColumn   'ignore
	Column.AddResizerToRows(s)
End Sub

Sub AddResizerToColumns(s As String) As WixColumn   'ignore
	Column.AddResizerToColumns(s)
End Sub


' set margin
Sub SetMargin(margin As Object) As WixColumn
	Column.SetMargin(margin)
	Return Me
End Sub


'set name
Sub SetName(n As String) As WixColumn
	Column.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixColumn
	Column.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixColumn
	Column.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixColumn
	Column.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixColumn
	Column.SetMinHeight(h)
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixColumn
	Column.SetTooltip(tt)
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixColumn
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		Column.SetAttr(strKey,	strVal)
	Next
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
Sub SetHeight(h As Object) As WixColumn
	Column.SetHeight(h)
	Return Me
End Sub

'set width
Sub SetWidth(w As Object) As WixColumn
	Column.SetWidth(w)
	Return Me
End Sub

'set template
Sub SetTemplate(t As String) As WixColumn
	Column.SetTemplate(t)
	Return Me
End Sub


'add to parent rows
Sub AddToRows(P As WixElement)
	P.AddRows(Item)
End Sub

'add to parent columns
Sub AddToColumns(P As WixElement)
	P.AddColumns(Item)
End Sub

'add to parent elements
Sub AddToElements(P As WixElement)
	P.AddElements(Item)
End Sub