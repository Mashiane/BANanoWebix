B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Template As WixElement
End Sub

'Initializes the Context
Public Sub Initialize(sid As String) As WixTemplate
	ID = sid.ToLowerCase
	Template.Initialize(ID).setview("template")
	Return Me
End Sub

'return the item
Sub Item As Map
	Return Template.item
End Sub

'add item to a column
Sub AddColumns(itm As Map)
	Template.AddColumns(itm)
End Sub


Sub SetTemplateHTML(h As UOENowHTML) As WixTemplate
	Dim os As String = h.HTML
	Template.SetTemplate(os)
	Return Me
End Sub

'set na
Sub SetName(n As String) As WixTemplate
	Template.SetName(n)
	Return Me
End Sub


'set reponsive
Sub SetResponsive(b As Object) As WixTemplate
	Template.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixTemplate
	Template.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixTemplate
	Template.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixTemplate
	Template.SetMinHeight(h)
	Return Me
End Sub

'add item to a row
Sub AddRows(itm As Map)
	Template.AddRows(itm)
End Sub

Sub AddRow(r As WixRow) As WixTemplate
	AddRows(r.Item)
	Return Me
End Sub


'use a map object
Sub SetMap(m As Map) As WixTemplate
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		Template.SetAttr(strKey,	strVal)
	Next
	Return Me
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

'set height
Sub SetHeight(h As Object) As WixTemplate
	Template.SetAttr("height", h)
	Return Me
End Sub

'set width
Sub SetWidth(w As Object) As WixTemplate
	Template.SetAttr("width", w)
	Return Me
End Sub

'set auto width
Sub SetAutoWidth(b As Boolean) As WixTemplate
	Template.SetAttr("autowidth", b)
	Return Me
End Sub

'set template
Sub SetTemplate(t As String) As WixTemplate
	Template.SetAttr("template", t)
	Return Me
End Sub

'set scroll
Sub SetScroll(b As Object) As WixTemplate
	Template.SetProperty("scroll", b)
	Return Me
End Sub

'set scroll xy
Sub SetScrollXY(b As Boolean) As WixTemplate  'ignore
	SetScroll("xy")
	Return Me
End Sub

'set type
Sub SetType(t As String) As WixTemplate
	Template.SetType(t)
	Return Me
End Sub

'set css
Sub SetStyle(prop As String, val As String) As WixTemplate
	Template.SetStyle(prop,val)
	Return Me
End Sub

'make clean layout
Sub SetTypeClean(a As String) As WixTemplate  'ignore
	SetType("clean")
	Return Me
End Sub

'make line layout
Sub SetTypeLine(a As String) As WixTemplate   'ignore
	SetType("line")
	Return Me
End Sub

'make wide layout
Sub SetTypeWide(a As String) As WixTemplate   'ignore
	SetType("wide")
	Return Me
End Sub

'make space layout
Sub SetTypeSpace(a As String) As WixTemplate   'ignore
	SetType("space")
	Return Me
End Sub

'make a head layout
Sub SetTypeHead(a As String) As WixTemplate   'ignore
	SetType("head")
	Return Me
End Sub

'make form layout
Sub SetTypeForm(a As String) As WixTemplate  'ignore
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

