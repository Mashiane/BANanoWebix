B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Header As WixElement
End Sub


'set tooltip
Sub SetTooltip(tt As String) As WixHeader
	Header.SetTooltip(tt)
	Return Me
End Sub

'initialize the header
Public Sub Initialize(sID As String) As WixHeader
	ID = sID.tolowercase
	Header.Initialize(ID).SetType("header")
	Return Me
End Sub

Sub SetTemplate(t As Object) As WixHeader
	Header.SetTemplate(t)
	Return Me
End Sub

Sub SetTemplateHTML(h As UOENowHTML) As WixHeader
	h.SetImportant(False)
	Dim os As String = h.HTML
	Header.SetTemplate(os)
	Return Me
End Sub

'set name
Sub SetName(n As String) As WixHeader
	Header.SetName(n)
	Return Me
End Sub

'return the item
Sub Item As Map
	Return Header.item
End Sub

'use a map object
Sub SetMap(m As Map) As WixHeader
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		Header.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub

Sub SetBorderless(b As Boolean) As WixHeader
	Header.SetBorderLess(b)
	Return Me
End Sub


'set reponsive
Sub SetResponsive(b As Object) As WixHeader
	Header.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixHeader
	Header.SetResponsiveCell(b)
	Return Me
End Sub

Sub SetCSS(c As Object) As WixHeader
	Header.SetCSS(c)
	Return Me
End Sub

'set css
Sub SetStyle(prop As String, val As String) As WixHeader
	Header.SetStyle(prop,val)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixHeader
	Header.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixHeader
	Header.SetMinHeight(h)
	Return Me
End Sub

'set width
Sub SetWidth(w As Int) As WixHeader
	Header.SetWidth(w)
	Return Me
End Sub

'set height
Sub SetHeight(h As Int) As WixHeader
	Header.SetHeight(h)
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