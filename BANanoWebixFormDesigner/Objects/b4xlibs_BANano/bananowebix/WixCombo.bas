﻿B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Combo As WixElement
	Private Options As List
	Private yCount As Int
	Private opt As Map
End Sub

'initialize the input box
Public Sub Initialize(iID As String) As WixCombo
	ID = iID.tolowercase
	Combo.Initialize(iID).SetView("combo")
	Options.Initialize
	yCount = 0
	opt = CreateMap()
	Return Me
End Sub


Sub SetTemplateHTML(h As UOENowHTML) As WixCombo
	Dim os As String = h.HTML
	Combo.SetTemplate(os)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixCombo
	Combo.SetResponsive(b)
	Return Me
End Sub


'set name
Sub SetName(n As String) As WixCombo
	Combo.SetName(n)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixCombo
	Combo.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixCombo
	Combo.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixCombo
	Combo.SetMinHeight(h)
	Return Me
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixCombo
	Combo.SetTooltip(tt)
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixCombo
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		Combo.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


'set options
Sub SetOptions(o As List) As WixCombo
	Options = o
	Return Me	
End Sub

'set style
Sub SetStyle(prop As String, val As String) As WixCombo
	Combo.SetStyle(prop,val)
	Return Me
End Sub

'set template
Sub SetTemplate(t As String) As WixCombo
	opt.Put("template", t)
	Return Me	
End Sub

'return the item
Sub Item As Map
	opt.Put("data", Options)
	If yCount <> 0 Then opt.Put("yCount",yCount)
	Combo.SetAttr("options", opt)
	Return Combo.item
End Sub

Sub SetOptionsJSON(json As String) As WixCombo
	Combo.SetOptionsJSON(json)
	Return Me
End Sub

Sub SetOptionsMAP(m As Map) As WixCombo
	For Each mk As String In m.Keys
		Dim mv As Object = m.Get(mk)
		AddOption(mk, mv)
	Next
	Return Me
End Sub

'add initialization options
Sub AddOption(optID As String, optValue As String) As WixCombo
	Options.Add(CreateMap("id":optID,"value":optValue))
	Return Me
End Sub

'set yCount
Sub SetYCount(y As Int) As WixCombo
	yCount = y
	Return Me
End Sub

'set value
Sub SetValue(v As String) As WixCombo
	Combo.SetValue(v)
	Return Me
End Sub

'set label
Sub SetLabel(l As String) As WixCombo
	Combo.SetLabel(l)
	Return Me
End Sub

'set required
Sub SetRequired(b As Boolean) As WixCombo
	Combo.SetRequired(b)
	Return Me
End Sub

'set label align
Sub SetLabelAlign(a As String) As WixCombo
	Combo.SetLabelAlign(a)
	Return Me
End Sub

'set label position
Sub SetLabelPosition(p As String) As WixCombo
	Combo.SetLabelPosition(p)
	Return Me
End Sub

'set label width
Sub SetLabelWidth(w As Int) As WixCombo
	Combo.SetLabelWidth(w)
	Return Me
End Sub


'set align right
Sub SetAlignRight(r As String) As WixCombo 'ignore
	Combo.setAlignright("")
	Return Me
End Sub

'set align center
Sub SetAlignCenter(r As String) As WixCombo 'ignore
	Combo.setAligncenter("")
	Return Me
End Sub

'set align left
Sub SetAlignLeft(r As String) As WixCombo 'ignore
	Combo.SetAlignleft("")
	Return Me
End Sub

'set suggest
Sub SetSuggest(s As Object) As WixCombo
	Combo.setSuggest(s)
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