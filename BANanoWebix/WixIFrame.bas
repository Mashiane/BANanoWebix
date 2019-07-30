B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public IFrame As WixElement
	Public Parent As WixElement

End Sub

'Initializes the iframe
Public Sub Initialize(sid As String) As WixIFrame
	ID = sid.tolowercase
	IFrame.Initialize(ID).SetView("iframe")
	parent = null
	Return Me
End Sub

'set the parent
Sub SetParent(p As WixElement) As WixIFrame
	Parent = p
	Return Me
End Sub


'add tp columns of parent
Sub Pop
	Parent.AddColumns(Item)
End Sub

Sub SetContainer(c As String) As WixIFrame
	IFrame.SetContainer(c)
	Return Me
End Sub

'return menu
Sub Item As Map
	Return IFrame.item
End Sub


Sub SetTemplateHTML(h As UOENowHTML) As WixIFrame
	h.SetImportant(False)
	Dim os As String = h.HTML
	IFrame.SetTemplate(os)
	Return Me
End Sub

'set name
Sub SetName(n As String) As WixIFrame
	IFrame.SetName(n)
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixIFrame
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		IFrame.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


'set reponsive
Sub SetResponsive(b As Object) As WixIFrame
	IFrame.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixIFrame
	IFrame.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixIFrame
	IFrame.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixIFrame
	IFrame.SetMinHeight(h)
	Return Me
End Sub

'set scroll
Sub SetScroll(b As Object) As WixIFrame
	IFrame.SetAttr("scroll", b)
	Return Me
End Sub

'set template
Sub SetSRC(t As String) As WixIFrame
	IFrame.SetAttr("src", t)
	Return Me
End Sub

'set height
Sub SetHeight(h As Object) As WixIFrame
	IFrame.SetAttr("height", h)
	Return Me
End Sub


'set width
Sub SetWidth(w As Object) As WixIFrame
	IFrame.SetAttr("width", w)
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


Sub SetAnimate(animate As Boolean) As WixIFrame
	IFrame.SetAttr("animate", animate)
	Return Me
End Sub

Sub SetBorderless(borderless As Boolean) As WixIFrame
	IFrame.SetAttr("borderless", borderless)
	Return Me
End Sub

Sub SetCss(css As Object) As WixIFrame
IFrame.SetAttr("css", css)
Return Me
End Sub

Sub SetDisabled(disabled As Boolean) As WixIFrame
IFrame.SetAttr("disabled", disabled)
Return Me
End Sub

Sub SetGravity(gravity As Object) As WixIFrame
IFrame.SetAttr("gravity", gravity)
Return Me
End Sub

Sub SetHidden(hidden As Boolean) As WixIFrame
IFrame.SetAttr("hidden", hidden)
Return Me
End Sub

Sub SetMaxHeight(maxHeight As Object) As WixIFrame
IFrame.SetAttr("maxHeight", maxHeight)
Return Me
End Sub

Sub SetMaxWidth(maxWidth As Object) As WixIFrame
IFrame.SetAttr("maxWidth", maxWidth)
Return Me
End Sub