B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public TextBox As WixElement
	Private Suggest As String
End Sub

'Initializes the element
Public Sub Initialize(tID As String) As WixTextBox
	TextBox.Initialize(tID).SetView("text")
	Suggest = ""
	Return Me
End Sub

'set as password
Sub SetTypePassword(r As String) As WixTextBox  'ignore
	TextBox.SetType("password")
	Return Me
End Sub

'set as email
Sub SetTypeEmail(r As String) As WixTextBox  'ignore
	TextBox.SetType("email")
	Return Me
End Sub

'set hidden
Sub SetHidden(b As Boolean) As WixTextBox
	TextBox.SetAttr("hidden",b)
	Return Me
End Sub


'set tooltip
Sub SetTooltip(tt As String) As WixTextBox
	TextBox.SetTooltip(tt)
	Return Me
End Sub


'set style
Sub SetStyle(prop As String, val As String) As WixTextBox
	TextBox.SetStyle(prop,val)
	Return Me
End Sub

'set readonly
Sub SetReadOnly(b As Boolean) As WixTextBox
	TextBox.SetAttr("readonly",b)
	Return Me
End Sub

'set disabled
Sub SetDisabled(b As Boolean) As WixTextBox
	TextBox.setattr("disabled",b)
	Return Me
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'set suggest
Sub SetSuggest(s As String) As WixTextBox
	Suggest = s
	Return Me	
End Sub

'set value
Sub SetValue(v As String) As WixTextBox
	TextBox.Value = v
	Return Me
End Sub

'set view
Sub SetView(v As String) As WixTextBox
	TextBox.view = v
	Return Me
End Sub

'set type
Sub SetType(t As String) As WixTextBox
	TextBox.TypeOf = t
	Return Me	
End Sub

'return item
Sub Item As Map
	TextBox.SetOnContent("suggest",Suggest)
	Return TextBox.Item
End Sub

'set the html attribute
Sub SetMaxLength(imaxlength As Int) As WixTextBox
	TextBox.SetHTMLAttr("maxlength", imaxlength)
	Return Me
End Sub

'set the placeholder
Sub SetPlaceHolder(ph As String) As WixTextBox
	TextBox.PlaceHolder = ph
	Return Me
End Sub

'set the label
Sub SetLabel(lbl As String) As WixTextBox
	TextBox.Label.Text = lbl
	Return Me
End Sub

'set the width
Sub SetWidth(w As Int) As WixTextBox
	TextBox.Width = w
	Return Me
End Sub

'set the height
Sub SetHeight(h As Int) As WixTextBox
	TextBox.Height = h
	Return Me
End Sub

'set alignment
Sub SetAlign(a As String) As WixTextBox
	TextBox.Align = a
	Return Me
End Sub

'set label align
Sub SetLabelAlign(a As String) As WixTextBox
	TextBox.Label.Align = a
	Return Me
End Sub

'set label position
Sub SetLabelPosition(p As String) As WixTextBox
	TextBox.Label.Position = p
	Return Me
End Sub

'set label width
Sub SetLabelWidth(w As Int) As WixTextBox
	TextBox.Label.Width = w
	Return Me
End Sub


'set align right
Sub SetAlignRight(r As String) As WixTextBox 'ignore
	TextBox.setAlignright("")
	Return Me
End Sub

'set align center
Sub SetAlignCenter(r As String) As WixTextBox 'ignore
	TextBox.setAligncenter("")
	Return Me
End Sub

'set align left
Sub SetAlignLeft(r As String) As WixTextBox 'ignore
	TextBox.SetAlignleft("")
	Return Me
End Sub

