B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public SideBar As WixElement
	Public Items As List
	Public Parent As WixElement
	Private banano As BANano
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(sid As String) As WixSideBar
	ID = sid.tolowercase
	SideBar.Initialize(sid).SetView("sidebar")
	Items.Initialize
	Parent = Null
	Return Me
End Sub

'set padding
Sub SetPadding(padding As Object) As WixSideBar
	SideBar.SetPadding(padding)
	Return Me
End Sub

'set padding
Sub SetMargin(margin As Object) As WixSideBar
	SideBar.SetMargin(margin)
	Return Me
End Sub

'set css
Sub SetStyle(prop As String, sval As String) As WixSideBar
	SideBar.SetStyle(prop,sval)
	Return Me
End Sub


Sub SetAttributes(m As Map) As WixSideBar
	For Each k As String In m.Keys
		Dim v As String = m.Get(k)
		SideBar.SetAttr(k,v)
	Next
	Return Me
End Sub

Sub SetStyles(m As Map) As WixSideBar
	For Each k As String In m.Keys
		Dim v As String = m.Get(k)
		SideBar.SetStyle(k,v)
	Next
	Return Me
End Sub

'set the parent
Sub SetParent(p As WixElement) As WixSideBar
	Parent = p
	Return Me
End Sub


Sub CreateItem(i As String) As WixElement
	Dim ii As WixElement
	ii.Initialize(i)
	Return ii 
End Sub

'add tp columns of parent
Sub Pop
	Parent.AddColumns(Item)
End Sub

'add item
Sub AddItem(parentID As String, meID As String, mValue As String, mhref As String, mIcon As String, badge As String, target As String) As WixSideBar
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

'set name
Sub SetName(n As String) As WixSideBar
	SideBar.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixSideBar
	SideBar.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixSideBar
	SideBar.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixSideBar
	SideBar.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixSideBar
	SideBar.SetMinHeight(h)
	Return Me
End Sub
'use a map object
Sub SetMap(m As Map) As WixSideBar
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		SideBar.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


'set activeTitle:false 
Sub SetActiveTitle(b As Boolean) As WixSideBar
	SideBar.SetAttr("activeTitle", b)
	Return Me
End Sub

'set multiple open
Sub SetMultipleOpen(b As Boolean) As WixSideBar
	SideBar.setAttr("multipleOpen", b)
	Return Me
End Sub

'set titleHeight
Sub SetTitleHeight(h As Int) As WixSideBar
	SideBar.SetAttr("titleHeight", h)
	Return Me
End Sub

'set data
Sub SetData(d As List) As WixSideBar
	SideBar.SetData(d)
	Return Me
End Sub

'return menu
Sub Item As Map
	If Items.Size > 0 Then
		Dim data As List = modWebix.Unflatten(Items,"data")
		SetData(data)
	End If
	Return SideBar.item
End Sub

'set template
Sub SetTemplate(t As String) As WixSideBar
	SideBar.SetTemplate(t)
	Return Me
End Sub


Sub SetTemplateHTML(h As UOENowHTML) As WixSideBar
	h.SetImportant(False)
	Dim os As String = h.HTML
	SideBar.SetTemplate(os)
	Return Me
End Sub

'set collapsed
Sub SetCollapsed(b As Boolean) As WixSideBar
	SideBar.SetAttr("collapsed", b)
	Return Me
End Sub

'set collapsed width
Sub SetCollapsedWidth(h As Boolean) As WixSideBar
	SideBar.SetAttr("collapsedWidth", h)
	Return Me
End Sub

'set height
Sub SetHeight(h As Object) As WixSideBar
	SideBar.SetAttr("height", h)
	Return Me
End Sub


'set width
Sub SetWidth(w As Object) As WixSideBar
	SideBar.SetAttr("width", w)
	Return Me
End Sub


'set position right
Sub SetPositionRight(c As String) As WixSideBar  'ignore
	SideBar.SetAttr("position", "right")
	Return Me
End Sub

'set position left
Sub SetPositionLeft(c As String) As WixSideBar  'ignore
	SideBar.SetAttr("position", "left")
	Return Me
End Sub

'set position top
Sub SetPositionTop(c As String) As WixSideBar  'ignore
	SideBar.SetAttr("position", "top")
	Return Me
End Sub

'set position top
Sub SetPositionBottom(c As String) As WixSideBar  'ignore
	SideBar.SetAttr("position", "bottom")
	Return Me
End Sub


'set position center
Sub SetPosition(c As String) As WixSideBar
	SideBar.SetAttr("position", c)
	Return Me
End Sub


'set select
Sub SetSelect(b As Boolean) As WixSideBar
	SideBar.SetAttr("select", b)
	Return Me
End Sub

'set scroll
Sub SetScroll(b As Object) As WixSideBar
	SideBar.SetAttr("scroll", b)
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

Sub SetAnimate(animate As Boolean) As WixSideBar
SideBar.SetAttr("animate", animate)
Return Me
End Sub

Sub SetBorderless(borderless As Boolean) As WixSideBar
SideBar.SetAttr("borderless", borderless)
Return Me
End Sub

Sub SetClick(click As Object) As WixSideBar
SideBar.SetAttr("click", click)
Return Me
End Sub

Sub SetOnClick(module As Object, methodName As String) As WixSideBar
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, Array(e))
	SideBar.SetClick(cb)
	Return Me
End Sub

Sub SetClipboard(clipboard As Object) As WixSideBar
SideBar.SetAttr("clipboard", clipboard)
Return Me
End Sub


Sub SetContainer(container As Object) As WixSideBar
SideBar.SetAttr("container", container)
Return Me
End Sub

Sub SetCss(css As Object) As WixSideBar
SideBar.SetAttr("css", css)
Return Me
End Sub

Sub SetDataFeed(dataFeed As Object) As WixSideBar
SideBar.SetAttr("dataFeed", dataFeed)
Return Me
End Sub

Sub SetDatathrottle(datathrottle As Object) As WixSideBar
SideBar.SetAttr("datathrottle", datathrottle)
Return Me
End Sub

Sub SetDatatype(datatype As Object) As WixSideBar
SideBar.SetAttr("datatype", datatype)
Return Me
End Sub

Sub SetDisabled(disabled As Boolean) As WixSideBar
SideBar.SetAttr("disabled", disabled)
Return Me
End Sub

Sub SetDrag(drag As Object) As WixSideBar
SideBar.SetAttr("drag", drag)
Return Me
End Sub

Sub SetDragscroll(dragscroll As Object) As WixSideBar
SideBar.SetAttr("dragscroll", dragscroll)
Return Me
End Sub

Sub SetFilterMode(filterMode As Object) As WixSideBar
SideBar.SetAttr("filterMode", filterMode)
Return Me
End Sub

Sub SetGravity(gravity As Object) As WixSideBar
SideBar.SetAttr("gravity", gravity)
Return Me
End Sub

Sub SetHidden(hidden As Boolean) As WixSideBar
SideBar.SetAttr("hidden", hidden)
Return Me
End Sub

Sub SetMaxHeight(maxHeight As Object) As WixSideBar
SideBar.SetAttr("maxHeight", maxHeight)
Return Me
End Sub

Sub SetMaxWidth(maxWidth As Object) As WixSideBar
SideBar.SetAttr("maxWidth", maxWidth)
Return Me
End Sub

Sub SetMultiselect(multiselect As Boolean) As WixSideBar
SideBar.SetAttr("multiselect", multiselect)
Return Me
End Sub

Sub SetNavigation(navigation As Boolean) As WixSideBar
SideBar.SetAttr("navigation", navigation)
Return Me
End Sub

Sub SetPager(pager As Object) As WixSideBar
SideBar.SetAttr("pager", pager)
Return Me
End Sub

Sub SetReady(ready As Object) As WixSideBar
SideBar.SetAttr("ready", ready)
Return Me
End Sub

Sub SetRemoveMissed(removeMissed As Boolean) As WixSideBar
SideBar.SetAttr("removeMissed", removeMissed)
Return Me
End Sub

Sub SetSave(save As Object) As WixSideBar
SideBar.SetAttr("save", save)
Return Me
End Sub

Sub SetScheme(scheme As Object) As WixSideBar
SideBar.SetAttr("scheme", scheme)
Return Me
End Sub

Sub SetScrollSpeed(scrollSpeed As Object) As WixSideBar
SideBar.SetAttr("scrollSpeed", scrollSpeed)
Return Me
End Sub


Sub SetThreeState(threeState As Boolean) As WixSideBar
SideBar.SetAttr("threeState", threeState)
Return Me
End Sub

Sub SetTooltip(tooltip As Object) As WixSideBar
SideBar.SetAttr("tooltip", tooltip)
Return Me
End Sub

Sub SetType(sType As Object) As WixSideBar
SideBar.SetAttr("type", sType)
Return Me
End Sub

Sub SetUrl(url As Object) As WixSideBar
SideBar.SetAttr("url", url)
Return Me
End Sub
