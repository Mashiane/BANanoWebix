B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public FormInput As WixElement
End Sub

'initialize the input box
Public Sub Initialize(iID As String) As WixFormInput
	ID = iID.tolowercase
	FormInput.Initialize(iID).SetView("forminput")
	Return Me
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub


Sub SetTemplateHTML(h As UOENowHTML) As WixFormInput
	h.SetImportant(False)
	Dim os As String = h.HTML
	FormInput.SetTemplate(os)
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixFormInput
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		FormInput.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


'set name
Sub SetName(n As String) As WixFormInput
	FormInput.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixFormInput
	FormInput.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixFormInput
	FormInput.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixFormInput
	FormInput.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixFormInput
	FormInput.SetMinHeight(h)
	Return Me
End Sub

'set body
Sub SetBody(b As Object) As WixFormInput
	FormInput.SetBody(b)
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixFormInput
	FormInput.SetTooltip(tt)
	Return Me
End Sub

'set style
Sub SetStyle(prop As String, val As String) As WixFormInput
	FormInput.SetStyle(prop,val)
	Return Me
End Sub


'return the item
Sub Item As Map
	Return FormInput.item
End Sub

'set value
Sub SetValue(v As String) As WixFormInput
	FormInput.SetValue(v)
	Return Me
End Sub

'set label
Sub SetLabel(l As String) As WixFormInput
	FormInput.SetLabel(l)
	Return Me
End Sub

'set required
Sub SetRequired(b As Boolean) As WixFormInput
	FormInput.SetRequired(b)
	Return Me
End Sub

'set label align
Sub SetLabelAlign(a As String) As WixFormInput
	FormInput.SetLabelAlign(a)
	Return Me
End Sub

'set label position
Sub SetLabelPosition(p As String) As WixFormInput
	FormInput.SetLabelPosition(p)
	Return Me
End Sub

'set label width
Sub SetLabelWidth(w As Int) As WixFormInput
	FormInput.SetLabelWidth(w)
	Return Me
End Sub

'set align right
Sub SetAlignRight(r As String) As WixFormInput 'ignore
	FormInput.setAlignright("")
	Return Me
End Sub

'set align center
Sub SetAlignCenter(r As String) As WixFormInput 'ignore
	FormInput.setAligncenter("")
	Return Me
End Sub

'set align left
Sub SetAlignLeft(r As String) As WixFormInput 'ignore
	FormInput.SetAlignleft("")
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