﻿B4J=true
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


'set reponsive
Sub SetResponsive(b As Object) As WixCheckBox
	CheckBox.SetResponsive(b)
	Return Me
End Sub


'set name
Sub SetName(n As String) As WixCheckBox
	CheckBox.SetName(n)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixCheckBox
	CheckBox.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixCheckBox
	CheckBox.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixCheckBox
	CheckBox.SetMinHeight(h)
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixCheckBox
	CheckBox.SetProperty("tooltip", tt)
	Return Me
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'use a map object
Sub SetMap(m As Map) As WixCheckBox
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		CheckBox.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


Sub SetValidateIsChecked(b As Boolean) As WixCheckBox   'ignore
	CheckBox.SetAttr("validate","isChecked")
	Return Me
End Sub


'set invalid message
Sub SetInvalidMessage(msg As String) As WixCheckBox
	CheckBox.SetAttr("invalidMessage", msg)
	Return Me
End Sub


'set label right
Sub SetLabelRight(l As String) As WixCheckBox
	CheckBox.SetAttr("labelRight", l)
	Return Me
End Sub

'return the item
Sub Item As Map
	If LabelOnRight Then
		CheckBox.SetOnContent("labelRight", CheckBox.Label.Text)
		CheckBox.Label.Text = ""
	End If
	Return CheckBox.item
End Sub

'set style
Sub SetStyle(prop As String, val As String) As WixCheckBox
	CheckBox.SetStyle(prop,val)
	Return Me
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


'set align right
Sub SetAlignRight(r As String) As WixCheckBox 'ignore
	CheckBox.setAlignright("")
	Return Me
End Sub

'set align center
Sub SetAlignCenter(r As String) As WixCheckBox 'ignore
	CheckBox.setAligncenter("")
	Return Me
End Sub

'set align left
Sub SetAlignLeft(r As String) As WixCheckBox 'ignore
	CheckBox.SetAlignleft("")
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