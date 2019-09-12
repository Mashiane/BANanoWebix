B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Window As WixElement
	Public ToolBar As WixToolBar
	Public ToolBarID As String
	Public Parent As WixElement
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(sid As String) As WixWindow
	ID = sid.tolowercase
	ToolBarID = ID & "tblbar"
	Window.Initialize(ID).SetView("window")
	ToolBar.Initialize(ToolBarID) 
	Parent = Null
	Return Me
End Sub


Sub SetAttributes(m As Map) As WixWindow
	For Each k As String In m.Keys
		Dim v As String = m.Get(k)
		Window.SetAttr(k,v)
	Next
	Return Me
End Sub

Sub SetStyles(m As Map) As WixWindow
	For Each k As String In m.Keys
		Dim v As String = m.Get(k)
		Window.SetStyle(k,v)
	Next
	Return Me
End Sub

'set css
Sub SetStyle(prop As String, sval As String) As WixWindow
	Window.SetStyle(prop,sval)
	Return Me
End Sub


'set the parent
Sub SetParent(p As WixElement) As WixWindow
	Parent = p
	Return Me
End Sub


'add tp columns of parent
Sub Pop
	Parent.AddColumns(Item)
End Sub

Sub SetTemplateHTML(h As UOENowHTML) As WixWindow
	Dim os As String = h.HTML
	SetTemplate(os)
	Return Me
End Sub

'set name
Sub SetName(n As String) As WixWindow
	Window.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixWindow
	Window.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixWindow
	Window.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixWindow
	Window.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixWindow
	Window.SetMinHeight(h)
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixWindow
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		Window.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub

'set full screen
Sub SetFullScreen(b As Boolean) As WixWindow
	Window.SetAttr("fullscreen", b)
	Return Me
End Sub

'set window position center
Sub SetPositionCenter(b As Boolean) As WixWindow  'ignore
	Window.SetAttr("position", "center")
	Return Me
End Sub


'set modal
Sub SetModal(b As Boolean) As WixWindow
	Window.SetAttr("modal", b)
	Return Me
End Sub

'set heading
Sub SetHead(hdr As String) As WixWindow
	Window.SetAttr("head", hdr)
	Return Me
End Sub

'Set toolbar
Sub SetToolBar(b As Boolean) As WixWindow  'ignore
	Window.SetAttr("head", ToolBar.Item)
	Return Me
End Sub

'return menu
Sub Item As Map
	Return Window.item
End Sub

'set template
Sub SetTemplate(t As Object) As WixWindow
	Dim body As Map = CreateMap()
	body.Put("template", t)
	Window.SetAttr("body", body)
	Return Me
End Sub

'set body
Sub SetBody(b As Object) As WixWindow
	Window.SetAttr("body", b)
	Return Me
End Sub

'set resize
Sub SetResize(t As Boolean) As WixWindow
	Window.SetAttr("resize", t)
	Return Me
End Sub

'set move
Sub SetMove(t As Boolean) As WixWindow
	Window.SetAttr("move", t)
	Return Me
End Sub


'set top
Sub SetTop(t As Int) As WixWindow
	Window.SetAttr("top", t)
	Return Me
End Sub


'set left
Sub SetLeft(t As Int) As WixWindow
	Window.SetAttr("left", t)
	Return Me
End Sub

'set height
Sub SetHeight(h As Object) As WixWindow
	Window.SetAttr("height", h)
	Return Me
End Sub

'set close
Sub SetClose(b As Boolean) As WixWindow
	Window.SetAttr("close", b)
	Return Me
End Sub


'set width
Sub SetWidth(w As Object) As WixWindow
	Window.SetAttr("width", w)
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

Sub SetAnimate(animate As Boolean) As WixWindow
	Window.SetAttr("animate", animate)
	Return Me
End Sub

Sub SetAutofit(autofit As Boolean) As WixWindow
	Window.SetAttr("autofit", autofit)
	Return Me
End Sub

Sub SetAutofocus(autofocus As Boolean) As WixWindow
	Window.SetAttr("autofocus", autofocus)
	Return Me
End Sub

Sub SetBorderless(borderless As Boolean) As WixWindow
Window.SetAttr("borderless", borderless)
Return Me
End Sub

Sub SetContainer(container As Object) As WixWindow
Window.SetAttr("container", container)
Return Me
End Sub

Sub SetCss(css As Object) As WixWindow
Window.SetAttr("css", css)
Return Me
End Sub

Sub SetDisabled(disabled As Boolean) As WixWindow
Window.SetAttr("disabled", disabled)
Return Me
End Sub

Sub SetGravity(gravity As Object) As WixWindow
Window.SetAttr("gravity", gravity)
Return Me
End Sub

Sub SetHeadHeight(headHeight As Object) As WixWindow
Window.SetAttr("headHeight", headHeight)
Return Me
End Sub

Sub SetHidden(hidden As Boolean) As WixWindow
Window.SetAttr("hidden", hidden)
Return Me
End Sub

Sub SetMaster(master As Object) As WixWindow
Window.SetAttr("master", master)
Return Me
End Sub

Sub SetMaxHeight(maxHeight As Object) As WixWindow
Window.SetAttr("maxHeight", maxHeight)
Return Me
End Sub

Sub SetMaxWidth(maxWidth As Object) As WixWindow
Window.SetAttr("maxWidth", maxWidth)
Return Me
End Sub

Sub SetPadding(padding As Object) As WixWindow
Window.SetAttr("padding", padding)
Return Me
End Sub

Sub SetPoint(point As Boolean) As WixWindow
Window.SetAttr("point", point)
Return Me
End Sub


Sub SetPosition(position As Object) As WixWindow
Window.SetAttr("position", position)
Return Me
End Sub

Sub SetRelative(relative As Object) As WixWindow
Window.SetAttr("relative", relative)
Return Me
End Sub

Sub SetToFront(toFront As Boolean) As WixWindow
Window.SetAttr("toFront", toFront)
Return Me
End Sub


Sub SetZindex(zindex As Object) As WixWindow
Window.SetAttr("zindex", zindex)
Return Me
End Sub