B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Video As WixElement
	Private sources As List
	Public Parent As WixElement
End Sub

'set borderless
Sub SetBorderLess(b As Boolean) As WixVideo
	Video.SetAttr("borderless", b)
	Return Me
End Sub

'set the parent
Sub SetParent(p As WixElement) As WixVideo
	Parent = p
	Return Me
End Sub



'set css
Sub SetStyle(prop As String, sval As String) As WixVideo
	Video.SetStyle(prop,sval)
	Return Me
End Sub


'initialize the input box
Public Sub Initialize(iID As String) As WixVideo
	ID = iID.tolowercase
	Video.Initialize(iID).SetView("video")
	sources.Initialize
	Parent = Null
	Return Me
End Sub

'add tp columns of parent
Sub Pop
	Parent.AddColumns(Item)
End Sub

Sub SetTemplateHTML(h As UOENowHTML) As WixVideo
	Dim os As String = h.HTML
	Video.SetTemplate(os)
	Return Me
End Sub

'set name
Sub SetName(n As String) As WixVideo
	Video.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixVideo
	Video.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixVideo
	Video.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixVideo
	Video.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixVideo
	Video.SetMinHeight(h)
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixVideo
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		Video.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixVideo
	Video.SetAttr("tooltip", tt)
	Return Me
End Sub

'set auto play
Sub SetAutoPlay(b As Boolean) As WixVideo
	Video.SetAttr("autoplay", b)
	Return Me
End Sub

'set controls
Sub SetControls(b As Boolean) As WixVideo
	Video.SetAttr("controls", b)
	Return Me
End Sub

'set height
Sub SetHeight(h As Object) As WixVideo
	Video.SetAttr("height", h)
	Return Me
End Sub

'set width
Sub SetWidth(w As Object) As WixVideo
	Video.SetAttr("width", w)
	Return Me
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'return the item
Sub Item As Map
	Video.SetAttr("src", sources)
	Return Video.item
End Sub

'set value
Sub SetValue(v As String) As WixVideo
	Video.SetValue(v)
	Return Me
End Sub

'set label
Sub SetSRC(l As String) As WixVideo
	sources.Add(l)
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

Sub SetAnimate(animate As Boolean) As WixVideo
	Video.SetAttr("animate", animate)
	Return Me
End Sub

Sub SetContainer(container As Object) As WixVideo
Video.SetAttr("container", container)
Return Me
End Sub

Sub SetCss(css As Object) As WixVideo
Video.SetAttr("css", css)
Return Me
End Sub

Sub SetDisabled(disabled As Boolean) As WixVideo
Video.SetAttr("disabled", disabled)
Return Me
End Sub

Sub SetGravity(gravity As Object) As WixVideo
Video.SetAttr("gravity", gravity)
Return Me
End Sub

Sub SetHidden(hidden As Boolean) As WixVideo
Video.SetAttr("hidden", hidden)
Return Me
End Sub

Sub SetMaxHeight(maxHeight As Object) As WixVideo
Video.SetAttr("maxHeight", maxHeight)
Return Me
End Sub

Sub SetMaxWidth(maxWidth As Object) As WixVideo
Video.SetAttr("maxWidth", maxWidth)
Return Me
End Sub
