B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Tree As WixElement
	Private scheme As Map
	Private Items As List
End Sub

'Initializes the Tree sheet
Public Sub Initialize(eID As String) As WixTree
	ID = eID.tolowercase
	Tree.Initialize(ID).SetView("tree")
	scheme = CreateMap()
	Items.Initialize
	Return Me
End Sub


'set scroll
Sub SetScroll(b As Object) As WixTree
	Tree.SetAttr("scroll", b)
	Return Me
End Sub


Sub SetTemplateHTML(h As UOENowHTML) As WixTree
	h.SetImportant(False)
	Dim os As String = h.HTML
	Tree.SetTemplate(os)
	Return Me
End Sub

'set name
Sub SetName(n As String) As WixTree
	Tree.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixTree
	Tree.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixTree
	Tree.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixTree
	Tree.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixTree
	Tree.SetMinHeight(h)
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixTree
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		Tree.SetAttr(strKey, strVal)
	Next
	Return Me
End Sub

'return the item
Sub Item As Map
	If Items.Size > 0 Then
		Dim data As List = modWebix.Unflatten(Items, "data")
		SetData(data)
	End If
	Tree.SetAttr("scheme", scheme)
	Return Tree.item
End Sub

'set group by
Sub SetGroupBy(g As String) As WixTree
	scheme.Put("$group", g)
	Return Me
End Sub

'set borderless
Sub SetBorderLess(b As Boolean) As WixTree
	Tree.SetBorderLess(b)
	Return Me
End Sub

'set selectable
Sub SetSelect(b As Boolean) As WixTree
	Tree.SetSelect(b)
	Return Me
End Sub

'set multi select
Sub SetMultiSelect(b As Boolean) As WixTree   'ignore
	Tree.SetAttr("select", "multiselect")
	Return Me
End Sub


'set type line tree
Sub SetTypeLineTree(b As Boolean) As WixTree   'ignore
	Tree.SetType("lineTree")
	Return Me
End Sub

'set the data
Sub SetData(data As List) As WixTree
	Tree.SetData(data)
	Return Me
End Sub

'set style
Sub SetStyle(prop As String, val As String) As WixTree
	Tree.SetStyle(prop,val)
	Return Me
End Sub

'set template
Sub SetTemplate(t As Object) As WixTree
	Tree.SetTemplate(t)
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixTree
	Tree.SetTooltip(tt)
	Return Me
End Sub

'set height
Sub SetHeight(h As Object) As WixTree
	Tree.SetHeight(h)
	Return Me
End Sub

'set width
Sub SetWidth(h As Object) As WixTree
	Tree.SetWidth(h)
	Return Me
End Sub

'add item
Sub AddItem(parentID As String, meID As String, mValue As String, mhref As String, mIcon As String, badge As String, target As String, mOpen As Boolean) As WixTree
	parentID = parentID.tolowercase
	meID = meID.tolowercase
	Dim mitem As Map = CreateMap()
	mitem.Put("id", meID)
	mitem.Put("value", mValue)
	mitem.Put("href", mhref)
	mitem.Put("badge", badge)
	mitem.Put("target", target)
	mitem.Put("icon", mIcon)
	mitem.Put("open", mOpen)
	mitem.Put("parentid", parentID)
	Items.Add(mitem)
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


Sub SetAnimate(animate As Boolean) As WixTree
	Tree.SetAttr("animate", animate)
	Return Me
End Sub

Sub SetClick(click As Object) As WixTree
Tree.SetAttr("click", click)
Return Me
End Sub

Sub SetClipboard(clipboard As Object) As WixTree
Tree.SetAttr("clipboard", clipboard)
Return Me
End Sub

Sub SetContainer(container As Object) As WixTree
Tree.SetAttr("container", container)
Return Me
End Sub

Sub SetCss(css As Object) As WixTree
Tree.SetAttr("css", css)
Return Me
End Sub

Sub SetDatathrottle(datathrottle As Object) As WixTree
Tree.SetAttr("datathrottle", datathrottle)
Return Me
End Sub

Sub SetDatatype(datatype As Object) As WixTree
Tree.SetAttr("datatype", datatype)
Return Me
End Sub

Sub SetDisabled(disabled As Boolean) As WixTree
Tree.SetAttr("disabled", disabled)
Return Me
End Sub

Sub SetDrag(drag As Object) As WixTree
Tree.SetAttr("drag", drag)
Return Me
End Sub

Sub SetDragscroll(dragscroll As Object) As WixTree
Tree.SetAttr("dragscroll", dragscroll)
Return Me
End Sub

Sub SetFilterMode(filterMode As Object) As WixTree
Tree.SetAttr("filterMode", filterMode)
Return Me
End Sub

Sub SetGravity(gravity As Object) As WixTree
Tree.SetAttr("gravity", gravity)
Return Me
End Sub

Sub SetHidden(hidden As Boolean) As WixTree
Tree.SetAttr("hidden", hidden)
Return Me
End Sub

Sub SetMaxHeight(maxHeight As Object) As WixTree
Tree.SetAttr("maxHeight", maxHeight)
Return Me
End Sub

Sub SetMaxWidth(maxWidth As Object) As WixTree
Tree.SetAttr("maxWidth", maxWidth)
Return Me
End Sub

Sub SetNavigation(navigation As Boolean) As WixTree
Tree.SetAttr("navigation", navigation)
Return Me
End Sub

Sub SetReady(ready As Object) As WixTree
Tree.SetAttr("ready", ready)
Return Me
End Sub

Sub SetRemoveMissed(removeMissed As Boolean) As WixTree
Tree.SetAttr("removeMissed", removeMissed)
Return Me
End Sub

Sub SetRules(rules As Object) As WixTree
Tree.SetAttr("rules", rules)
Return Me
End Sub

Sub SetSave(save As Object) As WixTree
Tree.SetAttr("save", save)
Return Me
End Sub

Sub SetScheme(xscheme As Object) As WixTree
Tree.SetAttr("scheme", xscheme)
Return Me
End Sub


Sub SetScrollSpeed(scrollSpeed As Object) As WixTree
Tree.SetAttr("scrollSpeed", scrollSpeed)
Return Me
End Sub

Sub SetThreeState(threeState As Boolean) As WixTree
Tree.SetAttr("threeState", threeState)
Return Me
End Sub

Sub SetType(sType As Object) As WixTree
Tree.SetAttr("type", sType)
Return Me
End Sub

Sub SetUrl(url As Object) As WixTree
Tree.SetAttr("url", url)
Return Me
End Sub