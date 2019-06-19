B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public ColorPicker As WixElement
End Sub

'Initializes the date picker
Public Sub Initialize(bID As String) As WixColorPicker
	ID = bID.ToLowerCase
	ColorPicker.Initialize(ID).SetView("colorpicker")
	Return Me
End Sub

'return the item to add
Sub Item As Map
	Return ColorPicker.item
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixColorPicker
	ColorPicker.SetTooltip(tt)
	Return Me
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'set style
Sub SetStyle(prop As String, val As String) As WixColorPicker
	ColorPicker.SetStyle(prop,val)
	Return Me
End Sub


'set value
Sub SetValue(v As String) As WixColorPicker
	ColorPicker.Value = v
	Return Me
End Sub

'set label
Sub SetLabel(l As String) As WixColorPicker
	ColorPicker.Label.Text = l
	Return Me
End Sub

'set width
Sub SetWidth(w As Int) As WixColorPicker
	ColorPicker.Width = w
	Return Me
End Sub

'set label align
Sub SetLabelAlign(a As String) As WixColorPicker
	ColorPicker.Label.Align = a
	Return Me
End Sub

'set label position
Sub SetLabelPosition(p As String) As WixColorPicker
	ColorPicker.Label.Position = p
	Return Me
End Sub

'set label width
Sub SetLabelWidth(w As Int) As WixColorPicker
	ColorPicker.Label.Width = w
	Return Me
End Sub


'set align right
Sub SetAlignRight(r As String) As WixColorPicker 'ignore
	ColorPicker.setAlignright("")
	Return Me
End Sub

'set align center
Sub SetAlignCenter(r As String) As WixColorPicker 'ignore
	ColorPicker.setAligncenter("")
	Return Me
End Sub

'set align left
Sub SetAlignLeft(r As String) As WixColorPicker 'ignore
	ColorPicker.SetAlignleft("")
	Return Me
End Sub