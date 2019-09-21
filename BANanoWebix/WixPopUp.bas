B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Popup As WixElement
	Public Parent As WixElement
	Public Menu As WixMenu
	Public List As WixList
End Sub

'Initializes the popup
Public Sub Initialize(sid As String) As WixPopUp
	ID = sid.ToLowerCase
	Popup.Initialize(ID).setview("popup")
	Parent = Null
	Menu.Initialize($"${ID}-menu"$) 
	List.Initialize($"${ID}-list"$)
	Return Me
End Sub


Sub SetAttributes(m As Map) As WixPopUp
	For Each k As String In m.Keys
		Dim v As String = m.Get(k)
		Popup.SetAttr(k,v)
	Next
	Return Me
End Sub

Sub SetStyles(m As Map) As WixPopUp
	For Each k As String In m.Keys
		Dim v As String = m.Get(k)
		Popup.SetStyle(k,v)
	Next
	Return Me
End Sub

'set the parent
Sub SetParent(p As WixElement) As WixPopUp
	Parent = p
	Return Me
End Sub

'add tp columns of parent
Sub Pop
	Parent.AddColumns(Item)
End Sub

'use a map object
Sub SetMap(m As Map) As WixPopUp
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		Popup.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


Sub SetTemplateHTML(h As UOENowHTML) As WixPopUp
	h.SetImportant(False)
	Dim os As String = h.HTML
	Popup.SetTemplate(os)
	Return Me
End Sub

'set name
Sub SetName(n As String) As WixPopUp
	Popup.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixPopUp
	Popup.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixPopUp
	Popup.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixPopUp
	Popup.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixPopUp
	Popup.SetMinHeight(h)
	Return Me
End Sub

'set move
Sub SetMove(b As Boolean) As WixPopUp
	Popup.SetAttr("move", b)
	Return Me
End Sub

'set height
Sub SetHeight(h As Object) As WixPopUp
	Popup.SetAttr("height", h)
	Return Me
End Sub

'set position center
Sub SetPositionCenter(c As String) As WixPopUp  'ignore
	Popup.SetAttr("position", "center")
	Return Me
End Sub

'set position center
Sub SetPosition(c As String) As WixPopUp
	Popup.SetAttr("position", c)
	Return Me
End Sub


'set position center
Sub SetPositionRight(c As String) As WixPopUp  'ignore
	Popup.SetAttr("position", "right")
	Return Me
End Sub

'set width
Sub SetWidth(w As Object) As WixPopUp
	Popup.SetAttr("width", w)
	Return Me
End Sub

'return the item
Sub Item As Map
	If Menu.HasContent Then
		Menu.setautoheight(True)
		Menu.SetSelect(True)
		Popup.SetAttr("head", "Submenu")
		Menu.SetLayout("y")
		Menu.SetBorderless(True)
		SetBody(Menu.Item)
	End If
	If List.HasContent Then
		List.SetAutoHeight(True)
		List.SetSelect(True)
		Popup.SetAttr("head", "Submenu")
		List.SetMultiSelect(False)
		List.SetBorderLess(True)
		List.SetLayout("y")
		SetBody(List.Item)
	End If
	Return Popup.item
End Sub

Sub SetTemplate(t As Object) As WixPopUp
	Dim b As Map = CreateMap()
	b.Put("template", t)
	SetBody(b)
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


Sub SetAnimate(animate As Boolean) As WixPopUp
	Popup.SetAttr("animate", animate)
	Return Me
End Sub

Sub SetAutofit(autofit As Boolean) As WixPopUp
	Popup.SetAttr("autofit", autofit)
	Return Me
End Sub

Sub SetAutofocus(autofocus As Boolean) As WixPopUp
	Popup.SetAttr("autofocus", autofocus)
	Return Me
End Sub

Sub SetBody(xbody As Object) As WixPopUp
	Popup.SetAttr("body", xbody)
	Return Me
End Sub

Sub SetContainer(container As Object) As WixPopUp
	Popup.SetAttr("container", container)
	Return Me
End Sub

Sub SetCss(css As Object) As WixPopUp
	Popup.SetAttr("css", css)
	Return Me
End Sub

Sub SetDisabled(disabled As Boolean) As WixPopUp
	Popup.SetAttr("disabled", disabled)
	Return Me
End Sub

Sub SetGravity(gravity As Object) As WixPopUp
	Popup.SetAttr("gravity", gravity)
	Return Me
End Sub

Sub SetHead(head As Object) As WixPopUp
	Popup.SetAttr("head", head)
	Return Me
End Sub

Sub SetHeadHeight(headHeight As Object) As WixPopUp
	Popup.SetAttr("headHeight", headHeight)
	Return Me
End Sub

Sub SetHidden(hidden As Boolean) As WixPopUp
Popup.SetAttr("hidden", hidden)
Return Me
End Sub

Sub SetLeft(left As Object) As WixPopUp
Popup.SetAttr("left", left)
Return Me
End Sub

Sub SetMaster(master As Object) As WixPopUp
Popup.SetAttr("master", master)
Return Me
End Sub

Sub SetMaxHeight(maxHeight As Object) As WixPopUp
Popup.SetAttr("maxHeight", maxHeight)
Return Me
End Sub

Sub SetMaxWidth(maxWidth As Object) As WixPopUp
Popup.SetAttr("maxWidth", maxWidth)
Return Me
End Sub


Sub SetModal(modal As Boolean) As WixPopUp
Popup.SetAttr("modal", modal)
Return Me
End Sub

Sub SetPadding(padding As Object) As WixPopUp
Popup.SetAttr("padding", padding)
	Return Me
End Sub

'set padding
Sub SetMargin(margin As Object) As WixPopUp
	Popup.SetMargin(margin)
	Return Me
End Sub

Sub SetPoint(point As Boolean) As WixPopUp
Popup.SetAttr("point", point)
Return Me
End Sub

Sub SetRelative(relative As Object) As WixPopUp
Popup.SetAttr("relative", relative)
Return Me
End Sub

Sub SetResize(resize As Boolean) As WixPopUp
Popup.SetAttr("resize", resize)
Return Me
End Sub

Sub SetToFront(toFront As Boolean) As WixPopUp
Popup.SetAttr("toFront", toFront)
Return Me
End Sub

Sub SetTop(top As Object) As WixPopUp
Popup.SetAttr("top", top)
Return Me
End Sub

Sub SetZindex(zindex As Object) As WixPopUp
Popup.SetAttr("zindex", zindex)
Return Me
End Sub
