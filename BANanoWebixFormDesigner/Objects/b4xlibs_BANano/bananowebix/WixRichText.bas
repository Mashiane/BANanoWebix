B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public RichText As WixElement
End Sub

'initialize the input box
Public Sub Initialize(iID As String) As WixRichText
	ID = iID.tolowercase
	RichText.Initialize(iID).SetView("richtext")
	Return Me
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'use a map object
Sub SetMap(m As Map) As WixRichText
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		RichText.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


Sub SetTemplateHTML(h As UOENowHTML) As WixRichText
	Dim os As String = h.HTML
	RichText.SetTemplate(os)
	Return Me
End Sub

'set name
Sub SetName(n As String) As WixRichText
	RichText.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixRichText
	RichText.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixRichText
	RichText.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixRichText
	RichText.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixRichText
	RichText.SetMinHeight(h)
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixRichText
	RichText.SetTooltip(tt)
	Return Me
End Sub

'set style
Sub SetStyle(prop As String, val As String) As WixRichText
	RichText.SetStyle(prop,val)
	Return Me
End Sub

'return the item
Sub Item As Map
	Return RichText.item
End Sub

'set height
Sub SetHeight(h As Object) As WixRichText
	RichText.SetHeight(h)
	Return Me
End Sub

'set value
Sub SetValue(v As String) As WixRichText
	RichText.SetValue(v)
	Return Me
End Sub

'set label
Sub SetLabel(l As String) As WixRichText
	RichText.SetLabel(l)
	Return Me
End Sub

'set required
Sub SetRequired(b As Boolean) As WixRichText
	RichText.SetRequired(b)
	Return Me
End Sub

'set label align
Sub SetLabelAlign(a As String) As WixRichText
	RichText.SetLabelAlign(a)
	Return Me
End Sub

'set label position
Sub SetLabelPosition(p As String) As WixRichText
	RichText.SetLabelPosition(p)
	Return Me
End Sub

'set label width
Sub SetLabelWidth(w As Int) As WixRichText
	RichText.SetLabelWidth(w)
	Return Me
End Sub

'set align right
Sub SetAlignRight(r As String) As WixRichText 'ignore
	RichText.setAlignright("")
	Return Me
End Sub

'set align center
Sub SetAlignCenter(r As String) As WixRichText 'ignore
	RichText.setAligncenter("")
	Return Me
End Sub

'set align left
Sub SetAlignLeft(r As String) As WixRichText 'ignore
	RichText.SetAlignleft("")
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