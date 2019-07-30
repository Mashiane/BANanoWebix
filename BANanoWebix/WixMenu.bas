B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Menu As WixElement
	Private typeof As Map
	Private Items As List
	Private sepCount As Int
	Public Parent As WixElement
End Sub

'initialize the menu
Public Sub Initialize(iID As String) As WixMenu
	ID = iID.tolowercase
	Menu.Initialize(iID).SetView("menu")
	typeof = CreateMap()
	Items.Initialize
	sepCount = 0
	parent = null
	Return Me
End Sub

'set the parent
Sub SetParent(p As WixElement) As WixMenu
	Parent = p
	Return Me
End Sub

'add tp columns of parent
Sub Pop
	Parent.AddColumns(Item)
End Sub

'use a map object
Sub SetMap(m As Map) As WixMenu
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		Menu.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


Sub SetTemplateHTML(h As UOENowHTML) As WixMenu
	h.SetImportant(False)
	Dim os As String = h.HTML
	Menu.SetTemplate(os)
	Return Me
End Sub

'set name
Sub SetName(n As String) As WixMenu
	Menu.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixMenu
	Menu.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixMenu
	Menu.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixMenu
	Menu.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixMenu
	Menu.SetMinHeight(h)
	Return Me
End Sub

' set menu pos right
Sub SetSubMenuPosRight(r As String) As WixMenu   'ignore
	Menu.SetAttr("subMenuPos", "right")
	Return Me
End Sub

'set item subsign
Sub SetItemSubSign(b As Boolean) As WixMenu
	typeof.Put("subsign", b)
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixMenu
	Menu.SetTooltip(tt)
	Return Me
End Sub

'set height
Sub SetHeight(h As Object) As WixMenu
	Menu.SetAttr("height", h)
	Return Me
End Sub

'set width
Sub SetWidth(w As Object) As WixMenu
	Menu.SetAttr("width", w)
	Return Me
End Sub

'set layout y
Sub SetLayoutY(r As String) As WixMenu  'ignore
	Menu.SetAttr("layout", "y")
	Return Me
End Sub

'set auto width
Sub SetAutoWidth(b As Boolean) As WixMenu
	Menu.SetAttr("autowidth", b)
	Return Me
End Sub

'add item
Sub AddItem(parentID As String, meID As String, mValue As String, mhref As String, mIcon As String, badge As String, target As String) As WixMenu
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

Sub AddSeparator(parentID As String) As WixMenu
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

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'return the item
Sub Item As Map
	If Items.Size > 0 Then
		Dim data As List = modWebix.Unflatten(Items,"submenu")
		SetData(data)
	End If
	Menu.SetAttr("type", typeof)
	Return Menu.item
End Sub

'set select
Sub SetSelect(b As Object) As WixMenu
	Menu.SetAttr("select", b) 
	Return Me
End Sub

Sub SetData(d As List) As WixMenu
	Menu.SetAttr("data", d)
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

Sub SetAnimate(animate As Boolean) As WixMenu
	Menu.SetAttr("animate", animate)
	Return Me
End Sub

Sub SetAutoheight(autoheight As Boolean) As WixMenu
	Menu.SetAttr("autoheight", autoheight)
	Return Me
End Sub

Sub SetBorderless(borderless As Boolean) As WixMenu
Menu.SetAttr("borderless", borderless)
Return Me
End Sub

Sub SetClick(click As Object) As WixMenu
Menu.SetAttr("click", click)
Return Me
End Sub

Sub SetClipboard(clipboard As Object) As WixMenu
Menu.SetAttr("clipboard", clipboard)
Return Me
End Sub

Sub SetContainer(container As Object) As WixMenu
Menu.SetAttr("container", container)
Return Me
End Sub

Sub SetCss(css As Object) As WixMenu
Menu.SetAttr("css", css)
Return Me
End Sub

Sub SetDatathrottle(datathrottle As Object) As WixMenu
Menu.SetAttr("datathrottle", datathrottle)
Return Me
End Sub

Sub SetDisabled(disabled As Boolean) As WixMenu
Menu.SetAttr("disabled", disabled)
Return Me
End Sub

Sub SetExternalData(externalData As Object) As WixMenu
Menu.SetAttr("externalData", externalData)
Return Me
End Sub

Sub SetGravity(gravity As Object) As WixMenu
Menu.SetAttr("gravity", gravity)
Return Me
End Sub

Sub SetHidden(hidden As Boolean) As WixMenu
Menu.SetAttr("hidden", hidden)
Return Me
End Sub

Sub SetLayout(layout As Object) As WixMenu
Menu.SetAttr("layout", layout)
Return Me
End Sub

Sub SetMaxHeight(maxHeight As Object) As WixMenu
Menu.SetAttr("maxHeight", maxHeight)
Return Me
End Sub

Sub SetMaxWidth(maxWidth As Object) As WixMenu
Menu.SetAttr("maxWidth", maxWidth)
Return Me
End Sub

Sub SetMultiselect(multiselect As Boolean) As WixMenu
Menu.SetAttr("multiselect", multiselect)
Return Me
End Sub

Sub SetNavigation(navigation As Boolean) As WixMenu
Menu.SetAttr("navigation", navigation)
Return Me
End Sub

Sub SetPager(pager As Object) As WixMenu
Menu.SetAttr("pager", pager)
Return Me
End Sub

Sub SetReady(ready As Object) As WixMenu
Menu.SetAttr("ready", ready)
Return Me
End Sub

Sub SetRemoveMissed(removeMissed As Boolean) As WixMenu
Menu.SetAttr("removeMissed", removeMissed)
Return Me
End Sub

Sub SetSave(save As Object) As WixMenu
Menu.SetAttr("save", save)
Return Me
End Sub

Sub SetScheme(scheme As Object) As WixMenu
Menu.SetAttr("scheme", scheme)
Return Me
End Sub

Sub SetScrollSpeed(scrollSpeed As Object) As WixMenu
Menu.SetAttr("scrollSpeed", scrollSpeed)
Return Me
End Sub

Sub SetScroll(scroll As Object) As WixMenu
Menu.SetAttr("scroll", scroll)
Return Me
End Sub


Sub SetSubMenuPos(subMenuPos As Object) As WixMenu
Menu.SetAttr("subMenuPos", subMenuPos)
Return Me
End Sub

Sub SetSubmenuConfig(submenuConfig As Object) As WixMenu
Menu.SetAttr("submenuConfig", submenuConfig)
Return Me
End Sub

Sub SetTemplate(template As Object) As WixMenu
Menu.SetAttr("template", template)
Return Me
End Sub

Sub SetType(sType As Boolean) As WixMenu
Menu.SetAttr("type", sType)
Return Me
End Sub

Sub SetUrl(url As Object) As WixMenu
Menu.SetAttr("url", url)
Return Me
End Sub

Sub SetXCount(xCount As Object) As WixMenu
Menu.SetAttr("xCount", xCount)
Return Me
End Sub

Sub SetYCount(yCount As Object) As WixMenu
Menu.SetAttr("yCount", yCount)
Return Me
End Sub