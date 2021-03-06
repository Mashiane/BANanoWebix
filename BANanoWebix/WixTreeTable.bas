﻿B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public TreeTable As WixElement
	'selection
	Public DT_SELECT_ROW As String = "row"
	Public DT_SELECT_CELL As String = "cell"
	Public DT_SELECT_COLUMN As String = "column"
	Private Items As List
	Public Parent As WixElement

End Sub

'set the parent
Sub SetParent(p As WixElement) As WixTreeTable
	Parent = p
	Return Me
End Sub

'set padding
Sub SetPadding(padding As Object) As WixTreeTable
	TreeTable.SetPadding(padding)
	Return Me
End Sub

'set padding
Sub SetMargin(margin As Object) As WixTreeTable
	TreeTable.SetMargin(margin)
	Return Me
End Sub

'Initializes the TreeTableTable sheet
Public Sub Initialize(eID As String) As WixTreeTable
	ID = eID.tolowercase
	TreeTable.Initialize(ID).SetView("treetable")
	Items.Initialize
	Parent = Null
	Return Me
End Sub


Sub SetAttributes(m As Map) As WixTreeTable
	For Each k As String In m.Keys
		Dim v As String = m.Get(k)
		TreeTable.SetAttr(k,v)
	Next
	Return Me
End Sub

Sub SetStyles(m As Map) As WixTreeTable
	For Each k As String In m.Keys
		Dim v As String = m.Get(k)
		TreeTable.SetStyle(k,v)
	Next
	Return Me
End Sub

'set css
Sub SetStyle(prop As String, sval As String) As WixTreeTable
	TreeTable.SetStyle(prop,sval)
	Return Me
End Sub


'set name
Sub SetName(n As String) As WixTreeTable
	TreeTable.SetName(n)
	Return Me
End Sub

'add tp columns of parent
Sub Pop
	Parent.AddColumns(Item)
End Sub

Sub SetTemplateHTML(h As UOENowHTML) As WixTreeTable
	h.SetImportant(False)
	Dim os As String = h.HTML
	TreeTable.SetTemplate(os)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixTreeTable
	TreeTable.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixTreeTable
	TreeTable.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixTreeTable
	TreeTable.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixTreeTable
	TreeTable.SetMinHeight(h)
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixTreeTable
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		TreeTable.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub

'set editable
Sub SetEditable(b As Boolean) As WixTreeTable
	TreeTable.SetAttr("editable", b)
	Return Me
End Sub


'set select enables selection of items
Sub SetSelect(s As Object) As WixTreeTable
	TreeTable.SetAttr("select", s)
	Return Me
End Sub

'add column
Sub AddColumns(c As WixDataColumn)
	TreeTable.AddDataColumn(c.Item)
End Sub

'return the item
Sub Item As Map
	If Items.Size > 0 Then
		Dim data As List = modWebix.Unflatten(Items, "data")
		SetData(data)
	End If
	Return TreeTable.item
End Sub

'set borderless
Sub SetBorderLess(b As Boolean) As WixTreeTable
	TreeTable.SetBorderLess(b)
	Return Me
End Sub

'set the data
Sub SetData(data As List) As WixTreeTable
	TreeTable.SetData(data)
	Return Me
End Sub

'set template
Sub SetTemplate(t As Object) As WixTreeTable
	TreeTable.SetTemplate(t)
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixTreeTable
	TreeTable.SetTooltip(tt)
	Return Me
End Sub

'set height
Sub SetHeight(h As Object) As WixTreeTable
	TreeTable.SetHeight(h)
	Return Me
End Sub

'set width
Sub SetWidth(h As Object) As WixTreeTable
	TreeTable.SetWidth(h)
	Return Me
End Sub


'set auto width
Sub SetAutoHeight(b As Boolean) As WixTreeTable
	TreeTable.SetAttr("autoheight", b)
	Return Me
End Sub

'set auto height
Sub SetAutoWidth(b As Boolean) As WixTreeTable
	TreeTable.SetAttr("autowidth", b)
	Return Me
End Sub

'create a header to Pop2
Sub CreateColumn(hid As String) As WixDataColumn
	Dim hdr As WixDataColumn
	hdr.Initialize(hid)
	Return hdr
End Sub

'add item
Sub AddItem(parentID As String, meID As String, mValue As String, mData As Map, mOpen As Boolean) As WixTreeTable
	parentID = parentID.tolowercase
	meID = meID.tolowercase
	Dim mitem As Map = CreateMap()
	mitem.Put("id", meID)
	mitem.Put("value", mValue)
	mitem.Put("open", mOpen)
	mitem.Put("parentid", parentID)
	For Each mKey As String In mData.Keys
		Dim mValue1 As String = mData.Get(mKey)
		mKey = mKey.tolowercase
		mitem.Put(mKey, mValue1)
	Next
	Items.Add(mitem)
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