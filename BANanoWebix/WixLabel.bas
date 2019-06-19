﻿B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Label As WixElement
End Sub

'initialize the input box
Public Sub Initialize(iID As String) As WixLabel
	ID = iID.tolowercase
	Label.Initialize(iID).SetView("label")
	Return Me
End Sub

'return the item
Sub Item As Map
	Return Label.item
End Sub


'set tooltip
Sub SetTooltip(tt As String) As WixLabel
	Label.SetTooltip(tt)
	Return Me
End Sub

'set style
Sub SetStyle(prop As String, val As String) As WixLabel
	Label.SetStyle(prop,val)
	Return Me
End Sub

'set label
Sub SetLabel(l As String) As WixLabel
	Label.Label.Text = l
	Return Me
End Sub


'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub


'set align right
Sub SetAlignRight(r As String) As WixLabel 'ignore
	Label.setAlignright("")
	Return Me
End Sub

'set align center
Sub SetAlignCenter(r As String) As WixLabel 'ignore
	Label.setAligncenter("")
	Return Me
End Sub

'set align left
Sub SetAlignLeft(r As String) As WixLabel 'ignore
	Label.SetAlignleft("")
	Return Me
End Sub