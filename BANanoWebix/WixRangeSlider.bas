B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public RangeSlider As WixElement
End Sub

'initialize the input box
Public Sub Initialize(iID As String) As WixRangeSlider
	ID = iID.tolowercase
	RangeSlider.Initialize(iID).SetView("rangeslider")
	Return Me
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub


'set tooltip
Sub SetTooltip(tt As String) As WixRangeSlider
	RangeSlider.SetTooltip(tt)
	Return Me
End Sub

'return the item
Sub Item As Map
	Return RangeSlider.item
End Sub

'set style
Sub SetStyle(prop As String, val As String) As WixRangeSlider
	RangeSlider.SetStyle(prop,val)
	Return Me
End Sub


'set value
Sub SetValue(v As String) As WixRangeSlider
	RangeSlider.Value = v
	Return Me
End Sub

'set label
Sub SetLabel(l As String) As WixRangeSlider
	RangeSlider.Label.Text = l
	Return Me
End Sub

'set required
Sub SetRequired(b As Boolean) As WixRangeSlider
	RangeSlider.SetRequired(b)
	Return Me
End Sub

'set label align
Sub SetLabelAlign(a As String) As WixRangeSlider
	RangeSlider.Label.Align = a
	Return Me
End Sub

'set label position
Sub SetLabelPosition(p As String) As WixRangeSlider
	RangeSlider.Label.Position = p
	Return Me
End Sub

'set label width
Sub SetLabelWidth(w As Int) As WixRangeSlider
	RangeSlider.Label.Width = w
	Return Me
End Sub

'set align right
Sub SetAlignRight(r As String) As WixRangeSlider 'ignore
	RangeSlider.setAlignright("")
	Return Me
End Sub

'set align center
Sub SetAlignCenter(r As String) As WixRangeSlider 'ignore
	RangeSlider.setAligncenter("")
	Return Me
End Sub

'set align left
Sub SetAlignLeft(r As String) As WixRangeSlider 'ignore
	RangeSlider.SetAlignleft("")
	Return Me
End Sub