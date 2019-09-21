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
	Public Parent As WixElement

End Sub


'set css
Sub SetStyle(prop As String, sval As String) As WixHeader
	Header.SetStyle(prop,sval)
	Return Me
End Sub

Sub VerticalAlign(b As Boolean) As WixHeader   'ignore
	SetStyle("height", "inherit")
	SetStyle("display","flex")
	SetStyle("align-items","center")
	Return Me
End Sub

Sub SetAttributes(m As Map) As WixHeader
	For Each k As String In m.Keys
		Dim v As String = m.Get(k)
		Header.SetAttr(k,v)
	Next
	Return Me
End Sub

Sub SetStyles(m As Map) As WixHeader
	For Each k As String In m.Keys
		Dim v As String = m.Get(k)
		Header.SetStyle(k,v)
	Next
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixHeader
	Header.SetTooltip(tt)
	Return Me
End Sub

'set the parent
Sub SetParent(p As WixElement) As WixHeader
	Parent = p
	Return Me
End Sub


'add tp columns of parent
Sub Pop
	Parent.AddColumns(Item)
End Sub

'initialize the header
Public Sub Initialize(sID As String) As WixHeader
	ID = sID.tolowercase
	Header.Initialize(ID).SetType("header")
	Parent = Null
	Return Me
End Sub

Sub SetTemplate(t As Object) As WixHeader
	Header.SetTemplate(t)
	Return Me
End Sub
'set padding
Sub SetPadding(padding As Object) As WixHeader
	Header.SetPadding(padding)
	Return Me
End Sub

'set padding
Sub SetMargin(margin As Object) As WixHeader
	Header.SetMargin(margin)
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


'set align right
Sub SetAlignRight(r As String) As WixHeader 'ignore
	Header.setAlignright("")
	Return Me
End Sub

'set align center
Sub SetAlignCenter(r As String) As WixHeader 'ignore
	Header.setAligncenter("")
	Return Me
End Sub

'set align left
Sub SetAlignLeft(r As String) As WixHeader 'ignore
	Header.SetAlignleft("")
	Return Me
End Sub

'set align
Sub SetAlign(r As Object) As WixHeader 'ignore
	Header.SetAlign(r)
	Return Me
End Sub

Sub SetValue(value As Object) As WixHeader
	Header.SetAttr("value", value)
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