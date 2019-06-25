﻿B4J=true
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
	FormInput.Value = v
	Return Me
End Sub

'set label
Sub SetLabel(l As String) As WixFormInput
	FormInput.Label.Text = l
	Return Me
End Sub

'set required
Sub SetRequired(b As Boolean) As WixFormInput
	FormInput.SetRequired(b)
	Return Me
End Sub

'set label align
Sub SetLabelAlign(a As String) As WixFormInput
	FormInput.Label.Align = a
	Return Me
End Sub

'set label position
Sub SetLabelPosition(p As String) As WixFormInput
	FormInput.Label.Position = p
	Return Me
End Sub

'set label width
Sub SetLabelWidth(w As Int) As WixFormInput
	FormInput.Label.Width = w
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