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


' set padding
Sub SetPadding(padding As Object) As WixRow
	Row.SetPadding(padding)
	Return Me
End Sub

' set margin
Sub SetMargin(margin As Object) As WixRow
	Row.SetMargin(margin)
	Return Me
End Sub

'add to columns
Sub AddColumns(i As Map) As WixRow
	Row.AddColumns(i)
	Return Me
End Sub


'set name
Sub SetName(n As String) As WixRow
	Row.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixRow
	Row.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixRow
	Row.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixRow
	Row.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixRow
	Row.SetMinHeight(h)
	Return Me
End Sub

'set auto width
Sub SetAutoWidth(b As Boolean) As WixRow
	Row.SetAttr("autowidth", b)
	Return Me
End Sub


'set auto height
Sub SetAutoHeight(b As Boolean) As WixRow
	Row.SetAttr("autoheight", b)
	Return Me
End Sub

'set scroll
Sub SetScroll(b As Object) As WixRow
	Row.SetProperty("scroll", b)
	Return Me
End Sub

'add to cells
Sub AddCells(i As Map) As WixRow
	Row.AddCells(i)
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
Sub SetHeight(h As Object) As WixRow
	Row.SetHeight(h)
	Return Me
End Sub

'set width
Sub SetWidth(w As Object) As WixRow
	Row.setwidth(w)
	Return Me
End Sub

'set template
Sub SetTemplate(t As String) As WixRow
	Row.SetTemplate(t)
	Return Me
End Sub

'add to rows of parent
Sub AddToRows(prt As WixElement)
	prt.AddRows(Item)
End Sub

'add to rows of parent
Sub AddToColumns(prt As WixElement)
	prt.AddColumns(Item)
End Sub

Sub AddToScrollViewRows(sv As WixScrollView)
	sv.AddRows(Item)
End Sub

Sub AddToPageRows(sv As WixPage)
	sv.AddRows(Item)
End Sub

'use a map object
Sub SetMap(m As Map) As WixRow
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		Row.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub

'add to parent elements
Sub AddToElements(P As WixElement)
	P.AddElements(Item)
End Sub
