B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Layout As WixElement
End Sub

'initialize the layout
Public Sub Initialize(sID As String) As WixLayout
	ID = sID.tolowercase
	Layout.Initialize(ID).SetView("layout")
	Return Me
End Sub

'return the item
Sub Item As Map
	Return Layout.item
End Sub

'use a map object
Sub SetMap(m As Map) As WixLayout
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		Layout.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


'set name
Sub SetName(n As String) As WixLayout
	Layout.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixLayout
	Layout.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixLayout
	Layout.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixLayout
	Layout.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixLayout
	Layout.SetMinHeight(h)
	Return Me
End Sub

'set scroll
Sub SetScroll(b As Object) As WixLayout
	Layout.SetProperty("scroll", b)
	Return Me
End Sub

'set template
Sub SetTemplate(t As String) As WixLayout
	Layout.SetTemplate(t)
	Return Me
End Sub


'set type
Sub SetType(t As String) As WixLayout
	Layout.SetType(t)
	Return Me
End Sub

'make clean layout
Sub SetTypeClean(a As String) As WixLayout   'ignore
	SetType("clean")
	Return Me
End Sub

'make line layout
Sub SetTypeLine(a As String) As WixLayout   'ignore
	SetType("line")
	Return Me
End Sub

'make wide layout
Sub SetTypeWide(a As String) As WixLayout   'ignore
	SetType("wide")
	Return Me
End Sub

'make space layout
Sub SetTypeSpace(a As String) As WixLayout   'ignore
	SetType("space")
	Return Me
End Sub

'make a head layout
Sub SetTypeHead(a As String) As WixLayout   'ignore
	SetType("head")
	Return Me
End Sub

'make form layout
Sub SetTypeForm(a As String) As WixLayout   'ignore
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