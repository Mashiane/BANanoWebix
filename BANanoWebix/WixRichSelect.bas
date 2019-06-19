﻿B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public RichSelect As WixElement
	Private Text As Object
	Private Options As List
End Sub

'initialize the input box
Public Sub Initialize(iID As String) As WixRichSelect
	ID = iID.tolowercase
	RichSelect.Initialize(iID).SetView("richselect")
	Options.Initialize
	Text = ""
	Return Me
End Sub


'set tooltip
Sub SetTooltip(tt As String) As WixRichSelect
	RichSelect.SetTooltip(tt)
	Return Me
End Sub

'set style
Sub SetStyle(prop As String, val As String) As WixRichSelect
	RichSelect.SetStyle(prop,val)
	Return Me
End Sub


'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'return the item
Sub Item As Map
	RichSelect.SetOnContent("text",Text)
	RichSelect.SetAttr("options", Options)
	Return RichSelect.item
End Sub

'set text
Sub SetText(t As String) As WixRichSelect
	Text = t
	Return Me
End Sub

'set options
Sub SetOptions(o As List) As WixRichSelect
	Options = o
	Return Me
End Sub

'add an option
Sub AddOption(sID As String, sValue As String) As WixRichSelect
	Dim sug As Map = CreateMap()
	sug.Put("id", sID)
	sug.Put("value", sValue)
	Options.Add(sug)
	Return Me
End Sub

'set value
Sub SetValue(v As String) As WixRichSelect
	RichSelect.Value = v
	Return Me
End Sub

'set label
Sub SetLabel(l As String) As WixRichSelect
	RichSelect.Label.Text = l
	Return Me
End Sub


'set label align
Sub SetLabelAlign(a As String) As WixRichSelect
	RichSelect.Label.Align = a
	Return Me
End Sub

'set label position
Sub SetLabelPosition(p As String) As WixRichSelect
	RichSelect.Label.Position = p
	Return Me
End Sub

'set label width
Sub SetLabelWidth(w As Int) As WixRichSelect
	RichSelect.Label.Width = w
	Return Me
End Sub


'set align right
Sub SetAlignRight(r As String) As WixRichSelect 'ignore
	RichSelect.setAlignright("")
	Return Me
End Sub

'set align center
Sub SetAlignCenter(r As String) As WixRichSelect 'ignore
	RichSelect.setAligncenter("")
	Return Me
End Sub

'set align left
Sub SetAlignLeft(r As String) As WixRichSelect 'ignore
	RichSelect.SetAlignleft("")
	Return Me
End Sub