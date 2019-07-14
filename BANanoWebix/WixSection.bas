B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Section As WixElement
End Sub

'initialize the input box
Public Sub Initialize(iID As String) As WixSection
	ID = iID.tolowercase
	Section.Initialize(iID).SetType("section")
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixSection
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		Section.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


Sub SetTemplateHTML(h As UOENowHTML) As WixSection
	Dim os As String = h.HTML
	Section.SetTemplate(os)
	Return Me
End Sub

'set name
Sub SetName(n As String) As WixSection
	Section.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixSection
	Section.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixSection
	Section.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixSection
	Section.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixSection
	Section.SetMinHeight(h)
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixSection
	Section.SetTooltip(tt)
	Return Me
End Sub

'return the item
Sub Item As Map
	Return Section.item
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'add to toolbar
Sub AddToToolbar(tblB As WixToolBar)
	tblB.Toolbar.AddItem(Item)
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
