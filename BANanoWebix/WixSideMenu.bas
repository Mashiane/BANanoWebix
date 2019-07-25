B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public SideMenu As WixElement
	Private body As WixElement
	Public Items As List
	Private typeOf As Map
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(sid As String) As WixSideMenu
	ID = sid.tolowercase
	SideMenu.Initialize(sid).SetView("sidemenu")
	body.Initialize(ID & "body").SetView("list").SetBorderLess(True).SetScroll(False).SetSelect(True)
	Items.Initialize 
	typeOf.Initialize
	Return Me
End Sub

'add menu item
Sub AddItem(meID As String, mValue As String, mhref As String, mIcon As String, badge As String, target As String) As WixSideMenu
	meID = meID.tolowercase
	Dim mitem As Map = CreateMap()
	mitem.Put("id", meID)
	mitem.Put("value", mValue)
	mitem.Put("href", mhref)
	mitem.Put("badge", badge)
	mitem.Put("target", target)
	mitem.Put("icon", mIcon)
	Items.Add(mitem)
	Return Me
End Sub

Sub CreateItem(i As String) As WixElement
	Dim ii As WixElement
	ii.Initialize(i)
	Return ii
End Sub

Sub SetTemplateHTML(h As UOENowHTML) As WixSideMenu
	Dim os As String = h.HTML
	SideMenu.SetTemplate(os)
	Return Me
End Sub

'set name
Sub SetName(n As String) As WixSideMenu
	SideMenu.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixSideMenu
	SideMenu.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixSideMenu
	SideMenu.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixSideMenu
	SideMenu.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixSideMenu
	SideMenu.SetMinHeight(h)
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixSideMenu
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		SideMenu.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub



'set scroll
Sub SetScroll(b As Object) As WixSideMenu
	SideMenu.SetAttr("scroll", b)
	Return Me
End Sub

'return menu
Sub Item As Map
	body.SetAttr("type", typeOf)
	If Items.Size > 0 Then body.SetData(Items)
	SideMenu.SetAttr("body", body.item)
	Return SideMenu.item
End Sub

Sub SetData(data As List) As WixSideMenu
	body.SetData(data)
	Return Me
End Sub

'set template
Sub SetTemplate(t As String) As WixSideMenu
	body.SetTemplate(t)
	Return Me
End Sub


'set height
Sub SetHeight(h As Object) As WixSideMenu
	SideMenu.SetAttr("height", h)
	Return Me
End Sub


'set height
Sub SetItemHeight(h As Int) As WixSideMenu
	typeOf.Put("height", h)
	Return Me
End Sub

'set width
Sub SetItemWidth(w As Int) As WixSideMenu
	typeOf.Put("width", w)
	Return Me
End Sub


'set layout x
Sub SetLayoutX(h As Boolean) As WixSideMenu   'ignore
	body.SetAttr("layout", "x")
	Return Me
End Sub


'set width
Sub SetWidth(w As Object) As WixSideMenu
	SideMenu.SetAttr("width", w)
	Return Me
End Sub


'set select enables selection of items
Sub SetSelect(s As Object) As WixSideMenu
	SideMenu.SetAttr("select", s)
	Return Me
End Sub

'set position right
Sub SetPositionRight(c As String) As WixSideMenu  'ignore
	SideMenu.SetAttr("position", "right")
	Return Me
End Sub

'set position left
Sub SetPositionLeft(c As String) As WixSideMenu  'ignore
	SideMenu.SetAttr("position", "left")
	Return Me
End Sub

'set position top
Sub SetPositionTop(c As String) As WixSideMenu  'ignore
	SideMenu.SetAttr("position", "top")
	Return Me
End Sub

'set position top
Sub SetPositionBottom(c As String) As WixSideMenu  'ignore
	SideMenu.SetAttr("position", "bottom")
	Return Me
End Sub


'set position center
Sub SetPosition(c As String) As WixSideMenu
	SideMenu.SetAttr("position", c)
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


Sub SetAnimate(animate As Boolean) As WixSideMenu
	SideMenu.SetAttr("animate", animate)
	Return Me
End Sub

Sub SetAutofit(autofit As Boolean) As WixSideMenu
	SideMenu.SetAttr("autofit", autofit)
	Return Me
End Sub

Sub SetAutofocus(autofocus As Boolean) As WixSideMenu
	SideMenu.SetAttr("autofocus", autofocus)
	Return Me
End Sub

Sub SetBody(xbody As Object) As WixSideMenu
	SideMenu.SetAttr("body", xbody)
	Return Me
End Sub

Sub SetBorderless(borderless As Boolean) As WixSideMenu
	SideMenu.SetAttr("borderless", borderless)
	Return Me
End Sub

Sub SetContainer(container As Object) As WixSideMenu
	SideMenu.SetAttr("container", container)
	Return Me
End Sub

Sub SetCss(css As Object) As WixSideMenu
	SideMenu.SetAttr("css", css)
	Return Me
End Sub

Sub SetDisabled(disabled As Boolean) As WixSideMenu
	SideMenu.SetAttr("disabled", disabled)
	Return Me
End Sub

Sub SetGravity(gravity As Object) As WixSideMenu
	SideMenu.SetAttr("gravity", gravity)
	Return Me
End Sub

Sub SetHead(head As Object) As WixSideMenu
	SideMenu.SetAttr("head", head)
	Return Me
End Sub

Sub SetHeadHeight(headHeight As Object) As WixSideMenu
	SideMenu.SetAttr("headHeight", headHeight)
	Return Me
End Sub

Sub SetLeft(left As Object) As WixSideMenu
SideMenu.SetAttr("left", left)
Return Me
End Sub

Sub SetMaster(master As Object) As WixSideMenu
SideMenu.SetAttr("master", master)
Return Me
End Sub

Sub SetMaxHeight(maxHeight As Object) As WixSideMenu
SideMenu.SetAttr("maxHeight", maxHeight)
Return Me
End Sub

Sub SetMaxWidth(maxWidth As Object) As WixSideMenu
SideMenu.SetAttr("maxWidth", maxWidth)
Return Me
End Sub


Sub SetModal(modal As Boolean) As WixSideMenu
SideMenu.SetAttr("modal", modal)
Return Me
End Sub

Sub SetMove(move As Boolean) As WixSideMenu
SideMenu.SetAttr("move", move)
Return Me
End Sub

Sub SetPadding(padding As Object) As WixSideMenu
SideMenu.SetAttr("padding", padding)
Return Me
End Sub

Sub SetPoint(point As Boolean) As WixSideMenu
SideMenu.SetAttr("point", point)
Return Me
End Sub

Sub SetRelative(relative As Object) As WixSideMenu
SideMenu.SetAttr("relative", relative)
Return Me
End Sub

Sub SetResize(resize As Boolean) As WixSideMenu
SideMenu.SetAttr("resize", resize)
Return Me
End Sub

Sub SetState(state As Object) As WixSideMenu
SideMenu.SetAttr("state", state)
Return Me
End Sub

Sub SetToFront(toFront As Boolean) As WixSideMenu
SideMenu.SetAttr("toFront", toFront)
Return Me
End Sub

Sub SetTop(top As Object) As WixSideMenu
SideMenu.SetAttr("top", top)
Return Me
End Sub

Sub SetZIndex(zIndex As Object) As WixSideMenu
SideMenu.SetAttr("zIndex", zIndex)
Return Me
End Sub
