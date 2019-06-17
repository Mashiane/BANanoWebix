B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public TextArea As WixTextBox
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
Sub SetWidth(w As Int) As WixTextArea
	TextArea.SetWidth(w)
	Return Me
End Sub

'set the height
Sub SetHeight(h As Int) As WixTextArea
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

