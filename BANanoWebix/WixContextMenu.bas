B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public ContextMenu As WixElement
	Private Items As List
	Private sepCount As Int
End Sub

'Initializes the Context
Public Sub Initialize(sid As String) As WixContextMenu
	ID = sid.ToLowerCase
	ContextMenu.Initialize(ID).setview("contextmenu")
	Items.Initialize 
	sepCount = 0
	Return Me
End Sub


Sub SetTemplateHTML(h As UOENowHTML) As WixContextMenu
	h.SetImportant(False)
	Dim os As String = h.HTML
	ContextMenu.SetTemplate(os)
	Return Me
End Sub

'set master
Sub SetMaster(pID As String) As WixContextMenu
	ContextMenu.SetAttr("master", pID)
	Return Me
End Sub


'set name
Sub SetName(n As String) As WixContextMenu
	ContextMenu.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixContextMenu
	ContextMenu.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixContextMenu
	ContextMenu.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixContextMenu
	ContextMenu.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixContextMenu
	ContextMenu.SetMinHeight(h)
	Return Me
End Sub

'return the item
Sub Item As Map
	If Items.Size > 0 Then
		Dim data As List = modWebix.Unflatten(Items, "submenu")
		SetData(data)
	End If
	Return ContextMenu.item
End Sub

'use a map object
Sub SetMap(m As Map) As WixContextMenu
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		ContextMenu.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


' set menu pos right
Sub SetSubMenuPosRight(r As String) As WixContextMenu   'ignore
	ContextMenu.SetAttr("subMenuPos", "right")
	Return Me
End Sub


'set height
Sub SetHeight(h As Object) As WixContextMenu
	ContextMenu.SetAttr("height", h)
	Return Me
End Sub

'set width
Sub SetWidth(w As Object) As WixContextMenu
	ContextMenu.SetAttr("width", w)
	Return Me
End Sub

'set layout y
Sub SetLayoutY(r As String) As WixContextMenu  'ignore
	ContextMenu.SetAttr("layout", "y")
	Return Me
End Sub

'set auto width
Sub SetAutoWidth(b As Boolean) As WixContextMenu
	ContextMenu.SetAttr("autowidth", b)
	Return Me
End Sub

'set template
Sub SetTemplate(t As String) As WixContextMenu
	ContextMenu.SetAttr("template", t)
	Return Me
End Sub

'add item
Sub AddItem(parentID As String, meID As String, mValue As String, mhref As String, mIcon As String, badge As String, target As String) As WixContextMenu
	parentID = parentID.tolowercase
	meID = meID.tolowercase
	Dim mitem As Map = CreateMap()
	mitem.Put("id", meID)
	mitem.Put("value", mValue)
	mitem.Put("href", mhref)
	mitem.Put("badge", badge)
	mitem.Put("target", target)
	mitem.Put("icon", mIcon)
	mitem.Put("parentid", parentID)
	Items.Add(mitem)
	Return Me
End Sub

Sub AddSeparator(parentID As String) As WixContextMenu
	parentID = parentID.tolowercase
	sepCount = sepCount + 1
	sepCount = sepCount & ""
	Dim meID As String = "sep" & sepCount
	Dim mItem As Map = CreateMap()
	mItem.Put("id", meID)
	mItem.Put("parentid", parentID)
	mItem.Put("$template", "Separator")
	Items.Add(mItem)
	Return Me
End Sub

'set data
Sub SetData(d As List) As WixContextMenu
	ContextMenu.SetAttr("data", d)
	Return Me
End Sub

'set select
Sub SetSelect(b As Boolean) As WixContextMenu
	ContextMenu.SetAttr("select", b)
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

Sub SetAnimate(animate As Boolean) As WixContextMenu
	ContextMenu.SetAttr("animate", animate)
	Return Me
End Sub

Sub SetAutofit(autofit As Boolean) As WixContextMenu
	ContextMenu.SetAttr("autofit", autofit)
	Return Me
End Sub

Sub SetAutofocus(autofocus As Boolean) As WixContextMenu
	ContextMenu.SetAttr("autofocus", autofocus)
	Return Me
End Sub

Sub SetAutoheight(autoheight As Boolean) As WixContextMenu
	ContextMenu.SetAttr("autoheight", autoheight)
	Return Me
End Sub


Sub SetBody(body As Object) As WixContextMenu
ContextMenu.SetAttr("body", body)
Return Me
End Sub

Sub SetBorderless(borderless As Boolean) As WixContextMenu
ContextMenu.SetAttr("borderless", borderless)
Return Me
End Sub

Sub SetClick(click As Object) As WixContextMenu
ContextMenu.SetAttr("click", click)
Return Me
End Sub

Sub SetClipboard(clipboard As Object) As WixContextMenu
ContextMenu.SetAttr("clipboard", clipboard)
Return Me
End Sub

Sub SetContainer(container As Object) As WixContextMenu
ContextMenu.SetAttr("container", container)
Return Me
End Sub

Sub SetCss(css As Object) As WixContextMenu
ContextMenu.SetAttr("css", css)
Return Me
End Sub

Sub SetDatathrottle(datathrottle As Object) As WixContextMenu
ContextMenu.SetAttr("datathrottle", datathrottle)
Return Me
End Sub

Sub SetDatatype(datatype As Object) As WixContextMenu
ContextMenu.SetAttr("datatype", datatype)
Return Me
End Sub

Sub SetDisabled(disabled As Boolean) As WixContextMenu
ContextMenu.SetAttr("disabled", disabled)
Return Me
End Sub

Sub SetDrag(drag As Object) As WixContextMenu
ContextMenu.SetAttr("drag", drag)
Return Me
End Sub

Sub SetDragscroll(dragscroll As Object) As WixContextMenu
ContextMenu.SetAttr("dragscroll", dragscroll)
Return Me
End Sub

Sub SetExternalData(externalData As Object) As WixContextMenu
ContextMenu.SetAttr("externalData", externalData)
Return Me
End Sub

Sub SetGravity(gravity As Object) As WixContextMenu
ContextMenu.SetAttr("gravity", gravity)
Return Me
End Sub

Sub SetHead(head As Object) As WixContextMenu
ContextMenu.SetAttr("head", head)
Return Me
End Sub

Sub SetHeadHeight(headHeight As Object) As WixContextMenu
ContextMenu.SetAttr("headHeight", headHeight)
Return Me
End Sub

Sub SetHidden(hidden As Boolean) As WixContextMenu
ContextMenu.SetAttr("hidden", hidden)
Return Me
End Sub

Sub SetLayout(layout As Object) As WixContextMenu
ContextMenu.SetAttr("layout", layout)
Return Me
End Sub

Sub SetLeft(left As Object) As WixContextMenu
ContextMenu.SetAttr("left", left)
Return Me
End Sub

Sub SetMaxHeight(maxHeight As Object) As WixContextMenu
ContextMenu.SetAttr("maxHeight", maxHeight)
Return Me
End Sub

Sub SetMaxWidth(maxWidth As Object) As WixContextMenu
ContextMenu.SetAttr("maxWidth", maxWidth)
Return Me
End Sub

Sub SetModal(modal As Boolean) As WixContextMenu
ContextMenu.SetAttr("modal", modal)
Return Me
End Sub

Sub SetMove(move As Boolean) As WixContextMenu
ContextMenu.SetAttr("move", move)
Return Me
End Sub

Sub SetMultiselect(multiselect As Boolean) As WixContextMenu
ContextMenu.SetAttr("multiselect", multiselect)
Return Me
End Sub

Sub SetNavigation(navigation As Boolean) As WixContextMenu
ContextMenu.SetAttr("navigation", navigation)
Return Me
End Sub

Sub SetPadding(padding As Object) As WixContextMenu
ContextMenu.SetAttr("padding", padding)
Return Me
End Sub

Sub SetPager(pager As Object) As WixContextmenu
Contextmenu.SetAttr("pager", pager)
Return Me
End Sub

Sub SetPoint(point As Boolean) As WixContextmenu
Contextmenu.SetAttr("point", point)
Return Me
End Sub

Sub SetPosition(position As Object) As WixContextmenu
Contextmenu.SetAttr("position", position)
Return Me
End Sub

Sub SetReady(ready As Object) As WixContextmenu
Contextmenu.SetAttr("ready", ready)
Return Me
End Sub

Sub SetRelative(relative As Object) As WixContextmenu
Contextmenu.SetAttr("relative", relative)
Return Me
End Sub

Sub SetRemoveMissed(removeMissed As Boolean) As WixContextmenu
Contextmenu.SetAttr("removeMissed", removeMissed)
Return Me
End Sub

Sub SetResize(resize As Boolean) As WixContextmenu
Contextmenu.SetAttr("resize", resize)
Return Me
End Sub

Sub SetRules(rules As Object) As WixContextmenu
Contextmenu.SetAttr("rules", rules)
Return Me
End Sub

Sub SetSave(save As Object) As WixContextMenu
ContextMenu.SetAttr("save", save)
Return Me
End Sub

Sub SetScheme(scheme As Object) As WixContextMenu
ContextMenu.SetAttr("scheme", scheme)
Return Me
End Sub

Sub SetScroll(scroll As Object) As WixContextMenu
ContextMenu.SetAttr("scroll", scroll)
Return Me
End Sub

Sub SetScrollSpeed(scrollSpeed As Object) As WixContextMenu
ContextMenu.SetAttr("scrollSpeed", scrollSpeed)
Return Me
End Sub

Sub SetSubMenuPos(subMenuPos As Object) As WixContextMenu
ContextMenu.SetAttr("subMenuPos", subMenuPos)
Return Me
End Sub

Sub SetSubmenuConfig(submenuConfig As Object) As WixContextMenu
ContextMenu.SetAttr("submenuConfig", submenuConfig)
Return Me
End Sub

Sub SetToFront(toFront As Boolean) As WixContextMenu
ContextMenu.SetAttr("toFront", toFront)
Return Me
End Sub

Sub SetTooltip(tooltip As Object) As WixContextMenu
ContextMenu.SetAttr("tooltip", tooltip)
Return Me
End Sub

Sub SetTop(top As Object) As WixContextMenu
ContextMenu.SetAttr("top", top)
Return Me
End Sub

Sub SetType(sType As Object) As WixContextMenu
ContextMenu.SetAttr("type", sType)
Return Me
End Sub

Sub SetUrl(url As Object) As WixContextMenu
ContextMenu.SetAttr("url", url)
Return Me
End Sub

Sub SetXCount(xCount As Object) As WixContextMenu
ContextMenu.SetAttr("xCount", xCount)
Return Me
End Sub

Sub SetYCount(yCount As Object) As WixContextMenu
ContextMenu.SetAttr("yCount", yCount)
Return Me
End Sub

Sub SetZIndex(zIndex As Object) As WixContextMenu
ContextMenu.SetAttr("zIndex", zIndex)
Return Me
End Sub
