B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public ScrollView As WixElement
	Private Rows As List
	Private Columns As List
	Private body As Map
End Sub

'Initializes the Context
Public Sub Initialize(sid As String) As WixScrollView
	ID = sid.ToLowerCase
	ScrollView.Initialize(ID).setview("scrollview")
	Rows.Initialize 
	Columns.Initialize
	body.Initialize
	Return Me
End Sub


'set name
Sub SetName(n As String) As WixScrollView
	ScrollView.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixScrollView
	ScrollView.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixScrollView
	ScrollView.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixScrollView
	ScrollView.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixScrollView
	ScrollView.SetMinHeight(h)
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixScrollView
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		ScrollView.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub

Sub AddRow(r As WixRow) As WixScrollView
	Rows.Add(r.Item)
	Return Me
End Sub

'add item to a row
Sub AddRows(itm As Map)
	Rows.add(itm)
End Sub


'add row items
Sub AddRowItems(items As List)
	For Each m As Map In items
		AddRows(m)
	Next
End Sub

'add rows
Sub AddWixRows(lst As List)
	For Each i As WixRow In lst
		AddRow(i)
	Next
End Sub

'add item to a column
Sub AddColumns(itm As Map)
	Columns.Add(itm)
End Sub

'return the item
Sub Item As Map
	If Rows.Size > 0 Then body.Put("rows", Rows)
	If Columns.Size > 0 Then body.Put("columns", Columns)
	ScrollView.SetAttr("body", body)
	Return ScrollView.item
End Sub

'set css
Sub SetStyle(prop As String, val As String) As WixScrollView
	ScrollView.SetStyle(prop,val)
	Return Me
End Sub

'set height
Sub SetHeight(h As Object) As WixScrollView
	ScrollView.SetAttr("height", h)
	Return Me
End Sub

'set width
Sub SetWidth(w As Object) As WixScrollView
	ScrollView.SetAttr("width", w)
	Return Me
End Sub

'set auto width
Sub SetAutoWidth(b As Boolean) As WixScrollView
	ScrollView.SetAttr("autowidth", b)
	Return Me
End Sub

'set ScrollView
Sub SetScrollView(t As String) As WixScrollView
	ScrollView.SetAttr("ScrollView", t)
	Return Me
End Sub

'set scroll
Sub SetScroll(b As Object) As WixScrollView
	ScrollView.SetProperty("scroll", b)
	Return Me
End Sub

'set scroll xy
Sub SetScrollXY(b As Boolean) As WixScrollView  'ignore
	SetScroll("xy")
	Return Me
End Sub

'set type
Sub SetType(t As String) As WixScrollView
	ScrollView.SetType(t)
	Return Me
End Sub


'make clean layout
Sub SetTypeClean(a As String) As WixScrollView  'ignore
	SetType("clean")
	Return Me
End Sub

'make line layout
Sub SetTypeLine(a As String) As WixScrollView   'ignore
	SetType("line")
	Return Me
End Sub

'make wide layout
Sub SetTypeWide(a As String) As WixScrollView   'ignore
	SetType("wide")
	Return Me
End Sub

'make space layout
Sub SetTypeSpace(a As String) As WixScrollView   'ignore
	SetType("space")
	Return Me
End Sub

'make a head layout
Sub SetTypeHead(a As String) As WixScrollView   'ignore
	SetType("head")
	Return Me
End Sub

'make form layout
Sub SetTypeForm(a As String) As WixScrollView  'ignore
	SetType("form")
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
