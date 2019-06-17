B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public CheckBox As WixElement
	Private LabelOnRight As Boolean
End Sub

'initialize the input box
Public Sub Initialize(iID As String) As WixCheckBox
	ID = iID.tolowercase
	CheckBox.Initialize(iID).SetView("checkbox")
	LabelOnRight = False
	Return Me
End Sub


'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'return the item
Sub Item As Map
	If LabelOnRight Then
		CheckBox.SetOnContent("labelRight", CheckBox.Label.Text)
		CheckBox.Label.Text = ""
	End If
	Return CheckBox.item
End Sub

'set value
Sub SetValue(v As String) As WixCheckBox
	CheckBox.Value = v
	Return Me
End Sub

'set label
Sub SetLabel(l As String) As WixCheckBox
	CheckBox.Label.Text = l
	Return Me
End Sub

'label on right
Sub SetLabelOnRight(b As Boolean) As WixCheckBox
	LabelOnRight = b
	Return Me
End Sub


'set label align
Sub SetLabelAlign(a As String) As WixCheckBox
	CheckBox.Label.Align = a
	Return Me
End Sub

'set label position
Sub SetLabelPosition(p As String) As WixCheckBox
	CheckBox.Label.Position = p
	Return Me
End Sub

'set label width
Sub SetLabelWidth(w As Int) As WixCheckBox
	CheckBox.Label.Width = w
	Return Me
End Sub
