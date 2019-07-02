﻿B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Counter As WixElement
	Private Minimum As Int
	Private Maximum As Int
	Private Stepper As Int
End Sub

'initialize the counter
Public Sub Initialize(iID As String) As WixCounter
	ID = iID.tolowercase
	Counter.Initialize(iID).SetView("counter")
	Minimum = 0
	Maximum = 100
	Counter.Value = 10
	Stepper = 1
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixCounter
	Counter.SetTooltip(tt)
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixCounter
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		Counter.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'set style
Sub SetStyle(prop As String, val As String) As WixCounter
	Counter.SetStyle(prop,val)
	Return Me
End Sub


'return the item
Sub Item As Map
	Counter.SetAttr("min",Minimum)
	Counter.SetAttr("max",Maximum)
	Counter.SetAttr("step", Stepper)
	Return Counter.item
End Sub

'set value
Sub SetValue(v As String) As WixCounter
	Counter.Value = v
	Return Me
End Sub

'set label
Sub SetLabel(l As String) As WixCounter
	Counter.Label.Text = l
	Return Me
End Sub

'set max
Sub SetMax(m As Int) As WixCounter
	Maximum = m
	Return Me
End Sub

'set min
Sub SetMin(m As Int) As WixCounter
	Minimum = m
	Return Me
End Sub

'set stepper
Sub SetStep(s As Int) As WixCounter
	Stepper = s
	Return Me
End Sub

'set label align
Sub SetLabelAlign(a As String) As WixCounter
	Counter.Label.Align = a
	Return Me
End Sub

'set label position
Sub SetLabelPosition(p As String) As WixCounter
	Counter.Label.Position = p
	Return Me
End Sub

'set label width
Sub SetLabelWidth(w As Int) As WixCounter
	Counter.Label.Width = w
	Return Me
End Sub


'set align right
Sub SetAlignRight(r As String) As WixCounter 'ignore
	Counter.setAlignright("")
	Return Me
End Sub

'set align center
Sub SetAlignCenter(r As String) As WixCounter 'ignore
	Counter.setAligncenter("")
	Return Me
End Sub

'set align left
Sub SetAlignLeft(r As String) As WixCounter 'ignore
	Counter.SetAlignleft("")
	Return Me
End Sub