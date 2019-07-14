B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public TextArea As WixText
End Sub

'Initializes the text area
Public Sub Initialize(tID As String) As WixTextArea
	TextArea.Initialize(tID)
	TextArea.SetView("textarea")
	Return Me	
End Sub

'set value
Sub SetValue(v As String) As WixTextArea
	TextArea.Setvalue(v)
	Return Me
End Sub


Sub SetTemplateHTML(h As UOENowHTML) As WixTextArea
	Dim os As String = h.HTML
	TextArea.SetAttr("template", os)
	Return Me
End Sub

'set name
Sub SetName(n As String) As WixTextArea
	TextArea.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixTextArea
	TextArea.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixTextArea
	TextArea.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixTextArea
	TextArea.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixTextArea
	TextArea.SetMinHeight(h)
	Return Me
End Sub
'use a map object
Sub SetMap(m As Map) As WixTextArea
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		TextArea.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


'set invalid message
Sub SetInvalidMessage(msg As String) As WixTextArea
	TextArea.SetInvalidMessage(msg)
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixTextArea
	TextArea.SetTooltip(tt)
	Return Me
End Sub

'set style
Sub SetStyle(prop As String, val As String) As WixTextArea
	TextArea.SetStyle(prop,val)
	Return Me
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'return the item
Sub Item As Map
	Return TextArea.Item 
End Sub

'set the html attribute
Sub SetMaxLength(ml As Int) As WixTextArea
	TextArea.SetMaxLength(ml)
	Return Me
End Sub

'set the placeholder
Sub SetPlaceHolder(ph As String) As WixTextArea
	TextArea.SetPlaceHolder(ph)
	Return Me
End Sub

'set the label
Sub SetLabel(lbl As String) As WixTextArea
	TextArea.SetLabel(lbl)
	Return Me
End Sub

'set the width
Sub SetWidth(w As Object) As WixTextArea
	TextArea.SetWidth(w)
	Return Me
End Sub

'set the height
Sub SetHeight(h As Object) As WixTextArea
	TextArea.SetHeight(h)
	Return Me
End Sub

'set alignment
Sub SetAlign(a As String) As WixTextArea
	TextArea.SetAlign(a)
	Return Me
End Sub


'set label align
Sub SetLabelAlign(a As String) As WixTextArea
	TextArea.SetLabelAlign(a)
	Return Me
End Sub

'set label position
Sub SetLabelPosition(p As String) As WixTextArea
	TextArea.SetLabelPosition(p)
	Return Me
End Sub

'set label width
Sub SetLabelWidth(w As Int) As WixTextArea
	TextArea.SetLabelWidth(w)
	Return Me
End Sub

'set validate
Sub SetValidateIsNotEmpty(b As Boolean) As WixTextArea   'ignore
	TextArea.SetAttr("validate","isNotEmpty")
	Return Me
End Sub

Sub SetValidateIsNumber(b As Boolean) As WixTextArea   'ignore
	TextArea.SetAttr("validate","isNumber")
	Return Me
End Sub

Sub SetValidateIsEmail(b As Boolean) As WixTextArea   'ignore
	TextArea.SetAttr("validate","isEmail")
	Return Me
End Sub


Sub SetValidateEventBlur(b As Boolean) As WixTextArea    'ignore
	TextArea.SetAttr("validateEvent", "blur")
	Return Me
End Sub

Sub SetValidateEventKey(b As Boolean) As WixTextArea     'ignore
	TextArea.SetAttr("validateEvent", "key")
	Return Me
End Sub

'set required
Sub SetRequired(b As Boolean) As WixTextArea
	TextArea.SetAttr("required", b)
	Return Me
End Sub


'set readonly
Sub SetReadOnly(b As Boolean) As WixTextArea
	TextArea.SetAttr("readonly",b)
	Return Me
End Sub

'set disabled
Sub SetDisabled(b As Boolean) As WixTextArea
	TextArea.setattr("disabled",b)
	Return Me
End Sub

'set bottom label
Sub SetBottomLabel(f As Object) As WixTextArea
	TextArea.SetAttr("bottomLabel", f)
	Return Me
End Sub

'set bottom padding
Sub SetBottomPadding(f As Object) As WixTextArea
	TextArea.SetAttr("bottomPadding", f)
	Return Me
End Sub

'set align right
Sub SetAlignRight(r As String) As WixTextArea 'ignore
	TextArea.setAlignright("")
	Return Me
End Sub

'set align center
Sub SetAlignCenter(r As String) As WixTextArea 'ignore
	TextArea.setAligncenter("")
	Return Me
End Sub

'set align left
Sub SetAlignLeft(r As String) As WixTextArea 'ignore
	TextArea.SetAlignleft("")
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