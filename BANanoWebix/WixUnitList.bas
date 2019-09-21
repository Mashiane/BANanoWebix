B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public UnitList As WixElement
	Private typeOf As Map
	Public Parent As WixElement
	Private banano As BANano
End Sub

'Initializes the unit list
Public Sub Initialize(eID As String) As WixUnitList
	ID = eID.tolowercase
	UnitList.Initialize(ID).SetView("unitlist")
	typeOf = CreateMap()
	Parent = Null
	Return Me
End Sub

'set the parent
Sub SetParent(p As WixElement) As WixUnitList
	Parent = p
	Return Me
End Sub


Sub SetAttributes(m As Map) As WixUnitList
	For Each k As String In m.Keys
		Dim v As String = m.Get(k)
		UnitList.SetAttr(k,v)
	Next
	Return Me
End Sub

Sub SetStyles(m As Map) As WixUnitList
	For Each k As String In m.Keys
		Dim v As String = m.Get(k)
		UnitList.SetStyle(k,v)
	Next
	Return Me
End Sub


'set css
Sub SetStyle(prop As String, sval As String) As WixUnitList
	UnitList.SetStyle(prop,sval)
	Return Me
End Sub


'set item height
Sub SetItemHeight(h As Object) As WixUnitList
	typeOf.Put("height", h)
	Return Me
End Sub

'add tp columns of parent
Sub Pop
	Parent.AddColumns(Item)
End Sub

Sub SetTemplateHTML(h As UOENowHTML) As WixUnitList
	h.SetImportant(False)
	Dim os As String = h.HTML
	UnitList.SetTemplate(os)
	Return Me
End Sub

'set name
Sub SetName(n As String) As WixUnitList
	UnitList.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixUnitList
	UnitList.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixUnitList
	UnitList.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixUnitList
	UnitList.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixUnitList
	UnitList.SetMinHeight(h)
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixUnitList
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		UnitList.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub

'set item width
Sub SetItemWidth(w As Object) As WixUnitList
	typeOf.Put("width", w)
	Return Me
End Sub

'return the item
Sub Item As Map
	UnitList.SetAttr("type", typeOf)
	Return UnitList.item
End Sub

'set the data
Sub SetData(data As List) As WixUnitList
	UnitList.SetData(data)
	Return Me
End Sub

'set borderless
Sub SetBorderLess(t As Boolean) As WixUnitList
	UnitList.SetAttr("borderless", t)
	Return Me
End Sub


'set template
Sub SetTemplate(t As Object) As WixUnitList
	UnitList.SetTemplate(t)
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixUnitList
	UnitList.SetTooltip(tt)
	Return Me
End Sub

'set height
Sub SetHeight(h As Object) As WixUnitList
	UnitList.SetHeight(h)
	Return Me
End Sub

'set width
Sub SetWidth(h As Object) As WixUnitList
	UnitList.SetWidth(h)
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

Sub SetAnimate(animate As Boolean) As WixUnitList
	UnitList.SetAttr("animate", animate)
	Return Me
End Sub

Sub SetAutoheight(autoheight As Boolean) As WixUnitList
	UnitList.SetAttr("autoheight", autoheight)
	Return Me
End Sub

Sub SetAutowidth(autowidth As Boolean) As WixUnitList
	UnitList.SetAttr("autowidth", autowidth)
	Return Me
End Sub

Sub SetClick(click As Object) As WixUnitList
UnitList.SetAttr("click", click)
Return Me
End Sub

Sub SetOnClick(module As Object, methodName As String) As WixUnitList
	Dim e As BANanoEvent
	Dim cb As BANanoObject = banano.CallBack(module, methodName, Array(e))
	UnitList.SetClick(cb)
	Return Me
End Sub

Sub SetClipboard(clipboard As Object) As WixUnitList
UnitList.SetAttr("clipboard", clipboard)
Return Me
End Sub

Sub SetContainer(container As Object) As WixUnitList
UnitList.SetAttr("container", container)
Return Me
End Sub

Sub SetCss(css As Object) As WixUnitList
UnitList.SetAttr("css", css)
Return Me
End Sub

Sub SetDatathrottle(datathrottle As Object) As WixUnitList
UnitList.SetAttr("datathrottle", datathrottle)
Return Me
End Sub

Sub SetDisabled(disabled As Boolean) As WixUnitList
UnitList.SetAttr("disabled", disabled)
Return Me
End Sub

Sub SetExternalData(externalData As Object) As WixUnitList
UnitList.SetAttr("externalData", externalData)
Return Me
End Sub

Sub SetGravity(gravity As Object) As WixUnitList
UnitList.SetAttr("gravity", gravity)
Return Me
End Sub


Sub SetHidden(hidden As Boolean) As WixUnitList
UnitList.SetAttr("hidden", hidden)
Return Me
End Sub

Sub SetMaxHeight(maxHeight As Object) As WixUnitList
UnitList.SetAttr("maxHeight", maxHeight)
Return Me
End Sub

Sub SetMaxWidth(maxWidth As Object) As WixUnitList
UnitList.SetAttr("maxWidth", maxWidth)
Return Me
End Sub

Sub SetMultiselect(multiselect As Boolean) As WixUnitList
UnitList.SetAttr("multiselect", multiselect)
Return Me
End Sub

Sub SetNavigation(navigation As Boolean) As WixUnitList
UnitList.SetAttr("navigation", navigation)
Return Me
End Sub

Sub SetPager(pager As Object) As WixUnitList
UnitList.SetAttr("pager", pager)
Return Me
End Sub

Sub SetReady(ready As Object) As WixUnitList
UnitList.SetAttr("ready", ready)
Return Me
End Sub

Sub SetSave(save As Object) As WixUnitList
UnitList.SetAttr("save", save)
Return Me
End Sub

Sub SetScheme(scheme As Object) As WixUnitList
UnitList.SetAttr("scheme", scheme)
Return Me
End Sub

Sub SetScrollSpeed(scrollSpeed As Object) As WixUnitList
UnitList.SetAttr("scrollSpeed", scrollSpeed)
Return Me
End Sub

Sub SetSelect(bSelect As Boolean) As WixUnitList
UnitList.SetAttr("select", bSelect)
Return Me
End Sub

Sub SetType(bType As Object) As WixUnitList
UnitList.SetAttr("type", bType)
Return Me
End Sub

Sub SetUniteBy(uniteBy As Object) As WixUnitList
UnitList.SetAttr("uniteBy", uniteBy)
Return Me
End Sub

Sub SetUrl(url As Object) As WixUnitList
UnitList.SetAttr("url", url)
Return Me
End Sub

Sub SetXCount(xCount As Object) As WixUnitList
UnitList.SetAttr("xCount", xCount)
Return Me
End Sub

Sub SetScroll(scroll As Object) As WixUnitList
	UnitList.SetAttr("scroll", scroll)
	Return Me
End Sub

Sub SetYCount(yCount As Object) As WixUnitList
UnitList.SetAttr("yCount", yCount)
Return Me
End Sub

Sub SetDatatype(datatype As Object) As WixUnitList
UnitList.SetAttr("datatype", datatype)
Return Me
End Sub

Sub SetDrag(drag As Object) As WixUnitList
UnitList.SetAttr("drag", drag)
Return Me
End Sub

Sub SetDragscroll(dragscroll As Object) As WixUnitList
UnitList.SetAttr("dragscroll", dragscroll)
Return Me
End Sub

Sub SetRemoveMissed(removeMissed As Boolean) As WixUnitList
UnitList.SetAttr("removeMissed", removeMissed)
Return Me
End Sub