B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public FlexLayout As WixElement
	Public Parent As WixElement

End Sub

'initialize the FlexLayout
Public Sub Initialize(sID As String) As WixFlexLayout
	ID = sID.tolowercase
	FlexLayout.Initialize(ID).SetView("flexlayout")
	Parent = Null
	Return Me
End Sub

'set the parent
Sub SetParent(p As WixElement) As WixFlexLayout
	Parent = p
	Return Me
End Sub


'set css
Sub SetStyle(prop As String, sval As String) As WixFlexLayout
	FlexLayout.SetStyle(prop,sval)
	Return Me
End Sub


'return the item
Sub Item As Map
	Return FlexLayout.item
End Sub

'add tp columns of parent
Sub Pop
	Parent.AddColumns(Item)
End Sub

Sub SetTemplateHTML(h As UOENowHTML) As WixFlexLayout
	h.SetImportant(False)
	Dim os As String = h.HTML
	FlexLayout.SetTemplate(os)
	Return Me
End Sub

'set name
Sub SetName(n As String) As WixFlexLayout
	FlexLayout.SetName(n)
	Return Me
End Sub

'add item to a column
Sub AddColumns(itm As Map)
	FlexLayout.AddColumns(itm)
End Sub


'add item to a row
Sub AddRows(itm As Map)
	FlexLayout.AddRows(itm)
End Sub

'use a map object
Sub SetMap(m As Map) As WixFlexLayout
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		FlexLayout.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub

' set padding
Sub SetPadding(padding As Object) As WixFlexLayout
	FlexLayout.SetPadding(padding)
	Return Me
End Sub

' set margin
Sub SetMargin(margin As Object) As WixFlexLayout
	FlexLayout.SetMargin(margin)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixFlexLayout
	FlexLayout.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixFlexLayout
	FlexLayout.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixFlexLayout
	FlexLayout.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixFlexLayout
	FlexLayout.SetMinHeight(h)
	Return Me
End Sub

'set scroll
Sub SetScroll(b As Object) As WixFlexLayout
	FlexLayout.SetAttr("scroll", b)
	Return Me
End Sub

'set template
Sub SetTemplate(t As String) As WixFlexLayout
	FlexLayout.SetTemplate(t)
	Return Me
End Sub


'set type
Sub SetType(t As String) As WixFlexLayout
	FlexLayout.SetType(t)
	Return Me
End Sub

'make clean FlexLayout
Sub SetTypeClean(a As String) As WixFlexLayout   'ignore
	SetType("clean")
	Return Me
End Sub

'make line FlexLayout
Sub SetTypeLine(a As String) As WixFlexLayout   'ignore
	SetType("line")
	Return Me
End Sub

'make wide FlexLayout
Sub SetTypeWide(a As String) As WixFlexLayout   'ignore
	SetType("wide")
	Return Me
End Sub

'make space FlexLayout
Sub SetTypeSpace(a As String) As WixFlexLayout   'ignore
	SetType("space")
	Return Me
End Sub

'make a head FlexLayout
Sub SetTypeHead(a As String) As WixFlexLayout   'ignore
	SetType("head")
	Return Me
End Sub

'make form FlexLayout
Sub SetTypeForm(a As String) As WixFlexLayout   'ignore
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