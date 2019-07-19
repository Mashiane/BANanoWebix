B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Accordion As WixElement
End Sub

'Initializes the accordion
Public Sub Initialize(sid As String) As WixAccordion
	ID = sid.tolowercase
	Accordion.Initialize(ID).SetView("accordion").SetType("wide")
	Return Me
End Sub


Sub SetTemplateHTML(h As UOENowHTML) As WixAccordion
	Dim os As String = h.HTML
	Accordion.SetTemplate(os)
	Return Me
End Sub

Sub SetTypeLine(b As Boolean) As WixAccordion   'ignore
	Accordion.SetTypeLine("")
	Return Me
End Sub

Sub SetTypeClean(b As Boolean) As WixAccordion  'ignore
	Accordion.SetTypeClean("")
	Return Me
End Sub

Sub SetTypeWide(b As Boolean) As WixAccordion  'ignore
	Accordion.SetTypeWide("")
	Return Me
End Sub

Sub SetTypeSpace(b As Boolean) As WixAccordion   'ignore
	Accordion.SetTypeSpace("")
	Return Me
End Sub

Sub SetTypeForm(b As Boolean) As WixAccordion   'ignore
	Accordion.SetTypeForm("")
	Return Me
End Sub

'set scroll
Sub SetScroll(b As Boolean) As WixAccordion
	Accordion.SetAttr("scroll", b)
	Return Me
End Sub

'set name
Sub SetName(n As String) As WixAccordion
	Accordion.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixAccordion
	Accordion.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixAccordion
	Accordion.SetResponsiveCell(b)
	Return Me
End Sub


'set width
Sub SetWidth(w As Int) As WixAccordion
	Accordion.SetWidth(w)
	Return Me
End Sub

'set height
Sub SetHeight(w As Int) As WixAccordion
	Accordion.SetHeight(w)
	Return Me
End Sub

'set min width
Sub SetMinWidth(w As Int) As WixAccordion
	Accordion.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixAccordion
	Accordion.SetMinHeight(h)
	Return Me
End Sub

'set collapsed
Sub SetCollapsed(b As Boolean) As WixAccordion
	Accordion.SetAttr("collapsed", b)
	Return Me
End Sub

'set multi
Sub SetMulti(b As Object) As WixAccordion
	Accordion.SetAttr("multi", b)
	Return Me
End Sub

Sub SetMultiMixed(b As Object) As WixAccordion   'ignore
	SetMulti("mixed")
	Return Me
End Sub


'return the item
Sub Item As Map
	Return Accordion.item
End Sub

Sub AddAccordionItem(ai As WixAccordionItem, bVertical As Boolean) As WixAccordion
	If bVertical Then
		Accordion.AddColumns(ai.Item)
	Else
		Accordion.AddRows(ai.Item)
	End If
	Return Me
End Sub

'add an item
Sub AddItem(iID As String, header As Object, body As Object, bCollapsed As Boolean,bVertical As Boolean) As WixAccordion
	Dim ai As WixAccordionItem
	ai.Initialize(iID).SetHeader(header).SetCollapsed(bCollapsed)
	ai.SetBody(body)
	If bVertical Then
		Accordion.AddColumns(ai.Item)
	Else
		Accordion.AddRows(ai.Item)
	End If
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixAccordion
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		Accordion.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub
