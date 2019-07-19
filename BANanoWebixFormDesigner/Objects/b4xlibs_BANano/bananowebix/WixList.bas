﻿B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.5
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public List As WixElement
	Public ID As String
	Private typeOf As Map
	Private Items As List
End Sub

'Initializes list object
Public Sub Initialize(lID As String) As WixList
	ID = lID.tolowercase
	List.Initialize(ID).SetView("list")
	Items.Initialize 
	Return Me
End Sub

'add an item
Sub AddItem(iKey As String, iValue As String) As WixList
	Dim m As Map = CreateMap()
	m.Put("id", iKey)
	m.Put("value", iValue)
	Items.Add(m)
	Return Me
End Sub


Sub SetTemplateHTML(h As UOENowHTML) As WixList
	Dim os As String = h.HTML
	List.SetTemplate(os)
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixList
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		List.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


'set name
Sub SetName(n As String) As WixList
	List.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixList
	List.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixList
	List.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixList
	List.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixList
	List.SetMinHeight(h)
	Return Me
End Sub

'set item height
Sub SetItemHeight(h As Object) As WixList
	typeOf.Put("height", h)
	Return Me
End Sub

'set item width
Sub SetItemWidth(w As Object) As WixList
	typeOf.Put("width", w)
	Return Me
End Sub


'set tooltip
Sub SetTooltip(tt As String) As WixList
	List.SetTooltip(tt)
	Return Me
End Sub

'add to column
Sub AddToColumn(c As WixColumn)
	c.AddItem(Item)
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'set value
Sub SetValue(v As String) As WixList
	List.SetValue(v)
	Return Me
End Sub

'set borderless
Sub SetBorderLess(b As Boolean) As WixList
	List.SetAttr("borderless", b)
	Return Me
End Sub

'set enableselect
Sub SetSelect(b As Boolean) As WixList
	List.SetAttr("select", b)
	Return Me
End Sub

'set mutliselect
Sub SetMultiSelect(b As Boolean) As WixList
	List.SetAttr("multiselect", b)
	Return Me
End Sub

'set SetScroll
Sub SetScroll(b As Object) As WixList
	List.SetAttr("scroll", b)
	Return Me
End Sub

'set SetPager
Sub SetPager(p As String) As WixList
	p = p.tolowercase
	List.SetAttr("pager", p)
	Return Me
End Sub

'return the object
Sub Item As Map
	If Items.Size > 0 Then
		SetData(Items)
	End If
	List.SetAttr("type", typeOf)
	Return List.item
End Sub

'set template
Sub SetTemplate(t As String) As WixList
	List.SetTemplate(t)
	Return Me
End Sub

'set height
Sub SetHeight(t As Object) As WixList
	List.SetHeight(t)
	Return Me
End Sub

'set height
Sub SetAutoHeight(b As Boolean) As WixList
	List.SetAttr("autoheight", b)
	Return Me
End Sub

Sub SetTypeUploader(b As Boolean) As WixList  'ignore
	List.SetType("uploader")
	Return Me
End Sub

'set width
Sub SetWidth(t As Object) As WixList
	List.SetWidth(t)
	Return Me
End Sub

'set data
Sub SetData(t As List) As WixList
	List.SetData(t)
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