B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public DataView As WixElement
	Private onClick As BANanoObject
	Private onDblClick As BANanoObject
	Private typeOf As Map
	Public Parent As WixElement

End Sub

'Initializes the data table
Public Sub Initialize(tID As String) As WixDataView
	ID = tID.ToLowerCase
	DataView.Initialize(ID).SetView("dataview")
	onClick = Null
	onDblClick = Null
	typeOf = CreateMap()
	SetMultiSelect(False)
	Parent = Null
	Return Me
End Sub

'set the parent
Sub SetParent(p As WixElement) As WixDataView
	Parent = p
	Return Me
End Sub


'add tp columns of parent
Sub Pop
	Parent.AddColumns(Item)
End Sub

Sub SetTemplateHTML(h As UOENowHTML) As WixDataView
	h.SetImportant(False)
	Dim os As String = h.HTML
	DataView.SetTemplate(os)
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixDataView
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		DataView.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


'set name
Sub SetName(n As String) As WixDataView
	DataView.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixDataView
	DataView.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixDataView
	DataView.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixDataView
	DataView.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixDataView
	DataView.SetMinHeight(h)
	Return Me
End Sub

Sub SetSizeToContent(b As Object) As WixDataView
	DataView.SetAttr("sizeToContent", b)
	Return Me
End Sub

'set scroll
Sub SetScroll(b As Object) As WixDataView
	DataView.SetAttr("scroll", b)
	Return Me
End Sub

'set rank
Sub SetRank(r As Object) As WixDataView
	DataView.SetAttr("rank", r)
	Return Me
End Sub

'set item height
Sub SetItemHeight(h As Int) As WixDataView
	typeOf.Put("height", h)
	Return Me
End Sub

'set item width
Sub SetItemWidth(h As Int) As WixDataView
	typeOf.Put("width", h)
	Return Me
End Sub


'set SetPager
Sub SetPager(p As String) As WixDataView
	p = p.tolowercase
	DataView.SetAttr("pager", p)
	Return Me
End Sub

'set onclick event
Sub SetClick(e As BANanoObject) As WixDataView
	onClick = e
	Return Me
End Sub

'set ondblclick event
Sub SetDblClick(e As BANanoObject) As WixDataView
	onDblClick = e
	Return Me
End Sub

'set template
Sub SetTemplate(t As String) As WixDataView
	DataView.SetTemplate(t)
	Return Me
End Sub

'set multi select
Sub SetMultiSelect(m As Boolean) As WixDataView  'ignore
	'DataView.SetAttr("select", "multiselect")
	Return Me
End Sub


'set select
Sub SetSelect(b As Boolean) As WixDataView   'ignore
	DataView.SetAttr("select", b)
	Return Me
End Sub

'set yCount number of items in a column
Sub SetYCount(x As Int) As WixDataView
	DataView.SetAttr("yCount", x)
	Return Me
End Sub

'set xCount i.e number of items in a row
Sub SetXCount(x As Int) As WixDataView
	DataView.SetAttr("xCount", x)
	Return Me
End Sub

'set navigation
Sub SetNavigation(b As Object) As WixDataView
	DataView.SetAttr("navigation", b)
	Return Me
End Sub

'set borderless
Sub SetBorderLess(b As Boolean) As WixDataView
	DataView.SetAttr("borderless", b)
	Return Me
End Sub


'set style
Sub SetStyle(prop As String, val As String) As WixDataView
	DataView.SetStyle(prop,val)
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixDataView
	DataView.SetTooltip(tt)
	Return Me
End Sub

'return the data table context
Sub Item As Map
	DataView.SetAttr("type", typeOf)
	If onClick <> Null Then
		DataView.SetAttr("click", onClick)
	End If
	If onDblClick <> Null Then
		DataView.SetAttr("dblclick", onDblClick)
	End If
	Return DataView.item
End Sub

'set height
Sub SetHeight(h As Object) As WixDataView
	DataView.SetHeight(h)
	Return Me
End Sub

'set width
Sub SetWidth(h As Object) As WixDataView
	DataView.SetWidth(h)
	Return Me
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'set Data
Sub SetData(data As List) As WixDataView
	DataView.SetData(data)
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


Sub SetAnimate(animate As Boolean) As WixDataView
	DataView.SetAttr("animate", animate)
	Return Me
End Sub

Sub SetAutoheight(autoheight As Boolean) As WixDataView
	DataView.SetAttr("autoheight", autoheight)
	Return Me
End Sub


Sub SetContainer(container As Object) As WixDataView
DataView.SetAttr("container", container)
Return Me
End Sub

Sub SetCss(css As Object) As WixDataView
DataView.SetAttr("css", css)
Return Me
End Sub

Sub SetDatafetch(datafetch As Object) As WixDataView
DataView.SetAttr("datafetch", datafetch)
Return Me
End Sub

Sub SetDatathrottle(datathrottle As Object) As WixDataView
DataView.SetAttr("datathrottle", datathrottle)
Return Me
End Sub

Sub SetDatatype(datatype As Object) As WixDataView
DataView.SetAttr("datatype", datatype)
Return Me
End Sub

Sub SetDisabled(disabled As Boolean) As WixDataView
DataView.SetAttr("disabled", disabled)
Return Me
End Sub

Sub SetDrag(drag As Object) As WixDataView
DataView.SetAttr("drag", drag)
Return Me
End Sub

Sub SetDragscroll(dragscroll As Object) As WixDataView
DataView.SetAttr("dragscroll", dragscroll)
Return Me
End Sub

Sub SetExternalData(externalData As Object) As WixDataView
DataView.SetAttr("externalData", externalData)
Return Me
End Sub

Sub SetGravity(gravity As Object) As WixDataView
DataView.SetAttr("gravity", gravity)
Return Me
End Sub

Sub SetHidden(hidden As Boolean) As WixDataView
DataView.SetAttr("hidden", hidden)
Return Me
End Sub

Sub SetLoadahead(loadahead As Object) As WixDataView
DataView.SetAttr("loadahead", loadahead)
Return Me
End Sub

Sub SetMaxHeight(maxHeight As Object) As WixDataView
DataView.SetAttr("maxHeight", maxHeight)
Return Me
End Sub

Sub SetMaxWidth(maxWidth As Object) As WixDataView
DataView.SetAttr("maxWidth", maxWidth)
Return Me
End Sub

Sub SetReady(ready As Object) As WixDataView
DataView.SetAttr("ready", ready)
Return Me
End Sub

Sub SetRemoveMissed(removeMissed As Boolean) As WixDataView
DataView.SetAttr("removeMissed", removeMissed)
Return Me
End Sub

Sub SetRules(rules As Object) As WixDataView
DataView.SetAttr("rules", rules)
Return Me
End Sub

Sub SetSave(save As Object) As WixDataView
DataView.SetAttr("save", save)
Return Me
End Sub

Sub SetScheme(scheme As Object) As WixDataView
DataView.SetAttr("scheme", scheme)
Return Me
End Sub

Sub SetScrollSpeed(scrollSpeed As Object) As WixDataView
DataView.SetAttr("scrollSpeed", scrollSpeed)
Return Me
End Sub

Sub SetType(sType As Object) As WixDataView
DataView.SetAttr("type", sType)
Return Me
End Sub

Sub SetUrl(url As Object) As WixDataView
DataView.SetAttr("url", url)
Return Me
End Sub

