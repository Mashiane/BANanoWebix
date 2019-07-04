﻿B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Segmented As WixElement
	Private Options As List
	Public Cells As List
End Sub

'initialize the input box
Public Sub Initialize(iID As String) As WixSegmented
	ID = iID.tolowercase
	Segmented.Initialize(iID).SetView("segmented")
	Options.Initialize
	Cells.Initialize 
	Return Me
End Sub


'set name
Sub SetName(n As String) As WixSegmented
	Segmented.SetName(n)
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixSegmented
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		Segmented.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


'set reponsive
Sub SetResponsive(b As Object) As WixSegmented
	Segmented.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixSegmented
	Segmented.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixSegmented
	Segmented.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixSegmented
	Segmented.SetMinHeight(h)
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixSegmented
	Segmented.SetTooltip(tt)
	Return Me
End Sub

'set style
Sub SetStyle(prop As String, val As String) As WixSegmented
	Segmented.SetStyle(prop,val)
	Return Me
End Sub

'return the item
Sub Item As Map
	Segmented.SetAttr("options", Options)
	Return Segmented.item
End Sub

'set options
Sub SetOptions(o As List) As WixSegmented
	Options = o
	Return Me
End Sub

'set the label
Sub SetLabel(l As String) As WixSegmented
	Segmented.SetLabel(l)
	Return Me
End Sub

'set the value
Sub SetValue(v As String) As WixSegmented
	Segmented.SetValue(v)
	Return Me
End Sub

'add an option
Sub AddOption(oid As String, oTxt As String, childTemplate As String) As WixSegmented
	Dim opt As Map = CreateMap()
	opt.put("id",oid)
	opt.Put("value",oTxt)
	Options.Add(opt)
	If childTemplate <> "" Then
		Dim Cell As Map = CreateMap()
		Cell.Put("id", oid)
		Cell.Put("template", childTemplate)
		Cells.Add(Cell)
	End If
	Return Me
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub


'set align right
Sub SetAlignRight(r As String) As WixSegmented 'ignore
	Segmented.setAlignright("")
	Return Me
End Sub

'set align center
Sub SetAlignCenter(r As String) As WixSegmented 'ignore
	Segmented.setAligncenter("")
	Return Me
End Sub

'set align left
Sub SetAlignLeft(r As String) As WixSegmented 'ignore
	Segmented.SetAlignleft("")
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
