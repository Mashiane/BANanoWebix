B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Context As WixElement
	Private body As Map
End Sub

'Initializes the Context, a popup window you can use
Public Sub Initialize(sid As String) As WixContext
	ID = sid.ToLowerCase
	Context.Initialize(ID).setview("context")
	body.Initialize 
	Return Me
End Sub

Sub SetTemplateHTML(h As UOENowHTML) As WixContext
	h.SetImportant(False)
	Dim os As String = h.HTML
	Context.SetTemplate(os)
	Return Me
End Sub

'set master
Sub SetMaster(pID As String) As WixContext
	Context.SetAttr("master", pID)
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixContext
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		Context.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


'set name
Sub SetName(n As String) As WixContext
	Context.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixContext
	Context.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixContext
	Context.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixContext
	Context.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixContext
	Context.SetMinHeight(h)
	Return Me
End Sub


'set height
Sub SetHeight(h As Object) As WixContext
	Context.SetAttr("height", h)
	Return Me
End Sub

'set width
Sub SetWidth(w As Object) As WixContext
	Context.SetAttr("width", w)
	Return Me
End Sub

'return the item
Sub Item As Map
	Context.SetAttr("body", body)
	Return Context.item
End Sub

'set template
Sub SetTemplate(t As String) As WixContext
	body.put("template", t)
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


Sub SetAnimate(animate As Boolean) As WixContext
	Context.SetAttr("animate", animate)
	Return Me
End Sub

Sub SetAutofit(autofit As Boolean) As WixContext
	Context.SetAttr("autofit", autofit)
	Return Me
End Sub

Sub SetAutofocus(autofocus As Boolean) As WixContext
	Context.SetAttr("autofocus", autofocus)
	Return Me
End Sub

Sub SetBody(xbody As Object) As WixContext
	Context.SetAttr("body", xbody)
	Return Me
End Sub

Sub SetBorderless(borderless As Boolean) As WixContext
	Context.SetAttr("borderless", borderless)
	Return Me
End Sub

Sub SetContainer(container As Object) As WixContext
	Context.SetAttr("container", container)
	Return Me
End Sub

Sub SetCss(css As Object) As WixContext
	Context.SetAttr("css", css)
	Return Me
End Sub

Sub SetDisabled(disabled As Boolean) As WixContext
	Context.SetAttr("disabled", disabled)
	Return Me
End Sub

Sub SetGravity(gravity As Object) As WixContext
	Context.SetAttr("gravity", gravity)
	Return Me
End Sub

Sub SetHead(head As Object) As WixContext
	Context.SetAttr("head", head)
	Return Me
End Sub

Sub SetHeadHeight(headHeight As Object) As WixContext
	Context.SetAttr("headHeight", headHeight)
	Return Me
End Sub

Sub SetHidden(hidden As Boolean) As WixContext
Context.SetAttr("hidden", hidden)
Return Me
End Sub

Sub SetLeft(left As Object) As WixContext
Context.SetAttr("left", left)
Return Me
End Sub

Sub SetMaxHeight(maxHeight As Object) As WixContext
Context.SetAttr("maxHeight", maxHeight)
Return Me
End Sub

Sub SetMaxWidth(maxWidth As Object) As WixContext
Context.SetAttr("maxWidth", maxWidth)
Return Me
End Sub

Sub SetModal(modal As Boolean) As WixContext
Context.SetAttr("modal", modal)
Return Me
End Sub

Sub SetMove(move As Boolean) As WixContext
Context.SetAttr("move", move)
Return Me
End Sub

Sub SetPadding(padding As Object) As WixContext
Context.SetAttr("padding", padding)
Return Me
End Sub

Sub SetPoint(point As Boolean) As WixContext
Context.SetAttr("point", point)
Return Me
End Sub

Sub SetPosition(position As Object) As WixContext
Context.SetAttr("position", position)
Return Me
End Sub

Sub SetRelative(relative As Object) As WixContext
Context.SetAttr("relative", relative)
Return Me
End Sub

Sub SetResize(resize As Boolean) As WixContext
Context.SetAttr("resize", resize)
Return Me
End Sub

Sub SetToFront(toFront As Boolean) As WixContext
Context.SetAttr("toFront", toFront)
Return Me
End Sub

Sub SetTop(top As Object) As WixContext
Context.SetAttr("top", top)
Return Me
End Sub

Sub SetZIndex(zIndex As Object) As WixContext
Context.SetAttr("zIndex", zIndex)
Return Me
End Sub
