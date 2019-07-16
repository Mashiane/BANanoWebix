B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public FieldSet As WixElement
	Private body As Map
	Private Rows As List
End Sub

'Initializes the FieldSet
Public Sub Initialize(sid As String) As WixFieldSet
	ID = sid.tolowercase
	FieldSet.Initialize(ID)
	FieldSet.SetView("fieldset")
	body.Initialize 
	Rows.Initialize
	Return Me
End Sub


Sub SetTemplateHTML(h As UOENowHTML) As WixFieldSet
	Dim os As String = h.HTML
	FieldSet.SetTemplate(os)
	Return Me
End Sub

'set name
Sub SetName(n As String) As WixFieldSet
	FieldSet.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixFieldSet
	FieldSet.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixFieldSet
	FieldSet.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixFieldSet
	FieldSet.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixFieldSet
	FieldSet.SetMinHeight(h)
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixFieldSet
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		FieldSet.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


'set tooltip
Sub SetTooltip(tt As String) As WixFieldSet
	FieldSet.SetTooltip(tt)
	Return Me
End Sub

'add an element
Sub AddItem(itm As Map) As WixFieldSet
	Rows.Add(itm)
	Return Me
End Sub

'return the item
Sub Item As Map
	body.Put("rows", Rows)
	FieldSet.SetProperty("body", body)
	Return FieldSet.item
End Sub

'set label
Sub SetLabel(l As String) As WixFieldSet
	FieldSet.SetLabel(l)
	Return Me
End Sub

'set height
Sub SetHeight(h As Object) As WixFieldSet
	FieldSet.SetHeight(h)
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