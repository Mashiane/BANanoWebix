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
	Private Body As WixElement
	Public ToolBarID As String
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(sid As String) As WixWindow
	ID = sid.tolowercase
	ToolBarID = ID & "tblbar"
	Window.Initialize(ID).SetView("window")
	ToolBar.Initialize(ToolBarID) 
	Body.Initialize(ID & "body")
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
Sub SetTemplate(t As String) As WixWindow
	Body.SetTemplate(t)
	Window.SetAttr("body", Body.Item)
	Return Me
End Sub

'set body
Sub SetBody(b As Map) As WixWindow
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