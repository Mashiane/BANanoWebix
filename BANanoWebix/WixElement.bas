﻿B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.5
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Columns As List
	Public Rows As List
	Private Element As Map
	Public Elements As List
	Private Attributes As Map
	Private HTMLAttributes As Map 
	Private Styles As Map
	Public Cells As List
	Private elementsConfig As Map
	Public Cols As List
	Public Rules As Map
	Private options As List
	Private On As Map
	Public ParentID As String
End Sub


Sub VerticalAlign(b As Boolean) As WixElement   'ignore
	SetStyle("height", "inherit")
	SetStyle("display","flex")
	SetStyle("align-items","center")
	Return Me
End Sub

Sub SetAttributes(m As Map) As WixElement
	For Each k As String In m.Keys
		Dim v As String = m.Get(k)
		SetAttr(k,v)
	Next
	Return Me
End Sub

Sub SetStyles(m As Map) As WixElement
	For Each k As String In m.Keys
		Dim v As String = m.Get(k)
		SetStyle(k,v)
	Next
	Return Me
End Sub

Sub SetLeft(r As Object) As WixElement
	SetAttr("left", r)
	Return Me
End Sub

Sub SetTop(r As Object) As WixElement
	SetAttr("top", r)
	Return Me
End Sub

Sub SetRight(r As Object) As WixElement
	SetAttr("right", r)
	Return Me
End Sub

Sub SetBottom(r As Object) As WixElement
	SetAttr("bottom", r)
	Return Me
End Sub

Sub AddToList(target As List)
	target.Add(Item)
End Sub

Sub SetParent(p As Object) As WixElement
	SetAttr("parentid", p)
	ParentID = p
	Return Me
End Sub

Sub SetOpen(o As Object) As WixElement
	SetAttr("open", o)
	Return Me
End Sub

Sub SetHREF(h As Object) As WixElement
	SetAttr("href", h)
	Return Me
End Sub

Sub SetTarget(h As Object) As WixElement
	SetAttr("target", h)
	Return Me
End Sub

Sub SetSideBarImage(i As Object) As WixElement
	Dim ih As UOENowHTML
	ih.Initialize("","img").SetImportant(False).SetSRC(i,True).AddClass("sidebar-icon")
	Dim icon As String = ih.html
	SetIcon(icon)
	Return Me
End Sub


Sub CreateMessageBox(mbox As String) As WixMessageBox
	Dim out As WixMessageBox
	out.Initialize(mbox)
	Return out
End Sub

public Sub RemoveAttr(sData As String) As WixElement
	sData = sData.tolowercase
	Element.Remove(sData)
	Return Me
End Sub

Sub SetElementsConfigJSON(json As String) As WixElement
	Dim m As Map = Json2Map(json)
	For Each mk As String In m.Keys
		Dim mv As Object = m.Get(mk)
		elementsConfig.Put(mk,mv)
	Next
	Return Me
End Sub


' convert a json string to a list
Sub Json2List(strValue As String) As List
	Dim lst As List
	lst.Initialize
	lst.clear
	If strValue.Length = 0 Then
		Return lst
	End If
	Try
		Dim parser As BANanoJSONParser
		parser.Initialize(strValue)
		Return parser.NextArray
	Catch
		Return lst
	End Try
End Sub

Sub SetOptionsJSON(json As String) As WixElement
	If json.StartsWith("[") Then
		Dim lst As List = Json2List(json)
		For Each rec As Map In lst
			options.Add(rec)
		Next
	Else if json.StartsWith("{") Then	
		Dim m As Map = Json2Map(json)
		For Each mk As String In m.Keys
			Dim mv As Object = m.Get(mk)
			Dim opt As Map = CreateMap()
			opt.Put(mk,mv)
			options.Add(opt)
		Next
	End If
	Return Me
End Sub

'add an option
Sub AddOption(oid As String, oTxt As Object) As WixElement
	Dim opt As Map = CreateMap()
	opt.put("id",oid)
	opt.Put("value",oTxt)
	options.Add(opt)
	Return Me
End Sub

Sub SetOptionsMAP(m As Map) As WixElement
	For Each mk As String In m.Keys
		Dim mv As Object = m.Get(mk)
		AddOption(mk, mv)
	Next
	Return Me
End Sub

Sub CreateResizer(rid As String) As WixResizer
	Dim res1 As WixResizer
	res1.Initialize(rid)
	Return res1
End Sub


'set badge
Sub SetBadge(b As Object) As WixElement
	SetAttr("badge", b)
	Return Me
End Sub

'set hidden
Sub SetHidden(b As Boolean) As WixElement
	SetAttr("hidden", b)
	Return Me
End Sub

'set local id
Sub SetLocalID(i As String) As WixElement
	SetAttr("localId", i)
	Return Me
End Sub


'convert a json string to a map
Sub Json2Map(strJSON As String) As Map
	Dim json As BANanoJSONParser
	Dim Map1 As Map
	Map1.Initialize
	Map1.clear
	Try
		If strJSON.length > 0 Then
			json.Initialize(strJSON)
			Map1 = json.NextObject
		End If
		Return Map1
	Catch
		Return Map1
	End Try
End Sub

'create a column
Sub CreateColumn(cid As String) As WixColumn
	Dim c As WixColumn
	c.Initialize(cid)
	Return c
End Sub

'create a row
Sub CreateRow(rid As String) As WixRow
	Dim r As WixRow
	r.Initialize(rid)
	Return r
End Sub

'create texbox
Sub CreateTextBox(eid As String) As WixText
	Dim txtbox As WixText
	txtbox.Initialize(eid)
	Return txtbox 
End Sub

' create a button
Sub CreateButton(eid As String) As WixButton
	Dim btn As WixButton
	btn.Initialize(eid)
	Return btn 	
End Sub

'create a checkbox
Sub CreateCheckBox(eid As String) As WixCheckBox
	Dim chk As WixCheckBox
	chk.Initialize(eid)
	Return chk 
End Sub

'create a color picker
Sub CreateColorPicker(eid As String) As WixColorPicker
	Dim cp As WixColorPicker
	cp.Initialize(eid)
	Return cp
End Sub

'create a combo
Sub CreateCombo(eid As String) As WixCombo
	Dim cp As WixCombo
	cp.Initialize(eid)
	Return cp
End Sub

'add rows
Sub AddWixRows(lst As List)
	For Each i As WixRow In lst
		AddRow(i)
	Next
End Sub

'set height
Sub SetAutoHeight(b As Boolean) As WixElement
	SetAttr("autoheight", b)
	Return Me
End Sub


Sub SetTemplateHTML(h As UOENowHTML) As WixElement
	h.SetImportant(False)
	Dim os As String = h.HTML
	SetTemplate(os)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixElement
	SetAttr("responsive", b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixElement
	SetAttr("responsiveCell", b)
	Return Me
End Sub

'set width
Sub SetAutoWidth(b As Boolean) As WixElement
	SetAttr("autowidth", b)
	Return Me
End Sub


'set suggest
Sub SetSuggest(s As Object) As WixElement
	SetAttr("suggest", s)
	Return Me
End Sub

'set scroll
Sub SetScroll(c As Object) As WixElement
	SetAttr("scroll", c)
	Return Me
End Sub

'set scrollY
Sub SetScrollY(b As Object) As WixElement
	SetAttr("scrollY", b)
	Return Me
End Sub

'set scrollX
Sub SetScrollX(b As Object) As WixElement
	SetAttr("scrollX", b)
	Return Me
End Sub

'set parent container for element
Sub SetContainer(c As String) As WixElement
	SetAttr("container", c)
	Return Me
End Sub

'set borderless
Sub SetBorderLess(b As Boolean) As WixElement
	SetAttr("borderless", b)
	Return Me
End Sub

'set selectable
Sub SetSelect(b As Boolean) As WixElement
	SetAttr("select", b)
	Return Me
End Sub

'set label height
Sub SetLabelHeight(h As Int) As WixElement
	SetAttr("labelHeight", h)
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixElement
	SetAttr("tooltip", tt)
	Return Me
End Sub

'initialize the element
Public Sub Initialize(sID As String) As WixElement
	ID = sID.ToLowerCase
	Cells.Initialize
	Cols.Initialize  
	elementsConfig.Initialize 
	Styles.Initialize 
	Element = CreateMap("id":ID)
	Rows.Initialize
	Elements.Initialize
	Columns.Initialize
	Attributes.Initialize
	HTMLAttributes.Initialize
	Rules.Initialize
	options.Initialize
	SetLocalID(ID)
	SetName(ID)
	On.Initialize
	ParentID = ""
	Return Me
End Sub

Sub OnMouseMove(cb As BANanoObject) As WixElement
	On.Put("onMouseMove",cb)
	Return Me
End Sub

Sub OnMouseOut(cb As BANanoObject) As WixElement
	On.Put("onMouseOut",cb)
	Return Me
End Sub

Sub OnBlur(cb As BANanoObject) As WixElement
	On.Put("onBlur",cb)
	Return Me
End Sub

Sub OnFocus(cb As BANanoObject) As WixElement
	On.Put("onFocus",cb)
	Return Me
End Sub

Sub OnKeyPress(cb As BANanoObject) As WixElement
	On.Put("onKeyPress",cb)
	Return Me
End Sub

Sub OnBeforeLoad(cb As BANanoObject) As WixElement
	On.Put("onBeforeLoad",cb)
	Return Me
End Sub

Sub OnAfterLoad(cb As BANanoObject) As WixElement
	On.Put("onAfterLoad",cb)
	Return Me
End Sub

Sub OnChange(cb As BANanoObject) As WixElement
	On.Put("onChange",cb)
	Return Me
End Sub

Sub onLongTouch(cb As BANanoObject) As WixElement
	On.Put("onLongTouch",cb)
	Return Me
End Sub


Sub OnEnter(cb As BANanoObject) As WixElement
	On.Put("onEnter",cb)
	Return Me
End Sub

Sub OnLiveEdit(cb As BANanoObject) As WixElement
	On.Put("onLiveEdit",cb)
	Return Me
End Sub

Sub OnTimedKeyPress(cb As BANanoObject) As WixElement
	On.Put("onTimedKeyPress",cb)
	Return Me
End Sub

Sub OnAfterTabClick(cb As BANanoObject) As WixElement
	On.Put("onAfterTabClick",cb)
	Return Me
End Sub

Sub OnCheck(cb As BANanoObject) As WixElement
	On.Put("onCheck",cb)
	Return Me
End Sub

'attach events after page is created
Sub OnSelectChange(cb As BANanoObject) As WixElement
	On.put("onSelectChange",cb)
	Return Me
End Sub


Sub OnUploadComplete(cb As BANanoObject) As WixElement
	On.Put("onUploadComplete",cb)
	Return Me
End Sub

Sub OnAfterFileAdd(cb As BANanoObject) As WixElement
	On.put("onAfterFileAdd",cb)
	Return Me
End Sub

Sub OnBeforeFileAdd(cb As BANanoObject) As WixElement
	On.Put("onBeforeFileAdd",cb)
	Return Me
End Sub

Sub OnFileUploadError(cb As BANanoObject) As WixElement
	On.Put("onFileUploadError",cb)
	Return Me
End Sub


Sub OnFileUpload(cb As BANanoObject) As WixElement
	On.Put("onFileUpload",cb)
	Return Me
End Sub

'on after select event
Sub OnAfterSelect(cb As BANanoObject) As WixElement
	On.Put("onAfterSelect",cb)
	Return Me
End Sub

Sub OnItemClick(cb As BANanoObject) As WixElement
	On.Put("onItemClick",cb)
	Return Me
End Sub

Sub OnItemDblClick(cb As BANanoObject) As WixElement
	On.Put("onItemDblClick",cb)
	Return Me
End Sub


Sub OnAfterEditStart(cb As BANanoObject) As WixElement
	On.Put("onAfterEditStart",cb)
	Return Me
End Sub

Sub OnAfterEditStop(cb As BANanoObject) As WixElement
	On.Put("onAfterEditStop",cb)
	Return Me
End Sub

Sub OnDataUpdate(cb As BANanoObject) As WixElement
	On.Put("onDataUpdate",cb)
	Return Me
End Sub

Sub onBeforeDrop(cb As BANanoObject) As WixElement
	On.Put("onBeforeDrop",cb)
	Return Me
End Sub


Sub OnContext(cb As BANanoObject) As WixElement
	On.Put("onContext",cb)
	Return Me
End Sub

Sub onAfterCollapse(cb As BANanoObject) As WixElement
	On.Put("onAfterCollapse",cb)
	Return Me
End Sub

Sub onAfterExpand(cb As BANanoObject) As WixElement
	On.Put("onAfterExpand",cb)
	Return Me
End Sub

Sub OnDblClick(cb As BANanoObject) As WixElement
	On.Put("onDblClick",cb)
	Return Me
End Sub


Sub OnClick(cb As BANanoObject) As WixElement
	On.Put("onClick",cb)
	Return Me
End Sub

Sub OnMenuItemClick(cb As BANanoObject) As WixElement
	On.Put("onMenuItemClick",cb)
	Return Me
End Sub

'on after unselect event
Sub OnAfterUnSelect(cb As BANanoObject) As WixElement
	On.Put("onAfterUnSelect",cb)
	Return Me
End Sub


Sub SetOptions(o As List) As WixElement
	SetAttr("options", o)
	Return Me
End Sub

'set the state
Sub SetState(s As Object) As WixElement
	SetAttr("state", s)
	Return Me
End Sub

'set the name
Sub SetName(n As String) As WixElement
	SetAttr("name", n)
	Return Me
End Sub

'set required
Sub SetRequired(b As Boolean) As WixElement
	SetAttr("required", b)
	Return Me
End Sub

'set default view
Sub SetDefaultView(a As String) As WixElement
	elementsConfig.Put("view", a)
	Return Me
End Sub

'set default type
Sub SetDefaultType(a As String) As WixElement
	elementsConfig.Put("type", a)
	Return Me
End Sub

'set default label align
Sub SetLabelAlign(a As String) As WixElement
	SetAttr("labelAlign", a)
	Return Me
End Sub

'set default label width
Sub SetLabelWidth(a As Int) As WixElement
	SetAttr("labelWidth", a)
	Return Me
End Sub

'set default label position
Sub SetLabelPosition(p As String) As WixElement
	SetAttr("labelPosition", p)
	Return Me
End Sub

'set default label align
Sub SetDefaultLabelAlign(a As String) As WixElement
	elementsConfig.Put("labelAlign", a)
	Return Me
End Sub

'set default label width
Sub SetDefaultLabelWidth(a As Int) As WixElement
	elementsConfig.Put("labelWidth", a)
	Return Me
End Sub


'set default label position
Sub SetDefaultLabelPosition(p As String) As WixElement
	elementsConfig.Put("labelPosition", p)
	Return Me
End Sub

'set default align
Sub SetDefaultAlign(a As String) As WixElement
	elementsConfig.Put("align", a)
	Return Me
End Sub

'set default width
Sub SetDefaultWidth(w As Int) As WixElement
	elementsConfig.Put("width", w)
	Return Me
End Sub

'set default height
Sub SetDefaultHeight(h As Int) As WixElement
	elementsConfig.Put("height", h)
	Return Me
End Sub

Sub SetDefaultBottomPadding(w As Int) As WixElement
	elementsConfig.Put("bottomPadding", w)
	Return Me
End Sub

'set visible batch
Sub SetVisibleBatch(b As Int) As WixElement
	SetAttr("visibleBatch", b)
	Return Me
End Sub

'set batch
Sub SetBatch(b As Int) As WixElement
	SetAttr("batch",b)
	Return Me
End Sub

'set animate
Sub SetAnimate(b As Boolean) As WixElement
	SetAttr("animate",b)
	Return Me
End Sub

'set style
Sub SetStyle(prop As String, val As String) As WixElement
	Styles.Put(prop,val)
	Return Me
End Sub

'set min width
Sub SetMinWidth(w As Int) As WixElement
	Element.put("minwidth",w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixElement
	Element.Put("minHeight", h)
	Return Me
End Sub

'set max width
Sub SetMaxWidth(w As Int) As WixElement
	Element.Put("maxWidth", w)
	Return Me
End Sub

'set max height
Sub SetMaxHeight(h As Int) As WixElement
	Element.Put("maxHeight", h)
	Return Me
End Sub

'set margins
Sub SetMargin(margin As String) As WixElement
	Element.Put("margin", margin)
	Return Me
End Sub

'SetInputWidth
Sub SetInputWidth(w As Int) As WixElement
	SetAttr("inputWidth", w)
	Return Me
End Sub

'set padding
Sub SetPadding(padding As String) As WixElement
	Element.Put("padding", padding)
	Return Me
End Sub


'set placeholder
Sub SetPlaceHolder(p As String) As WixElement
	Element.Put("placeholder", p)
	Return Me
End Sub

'set paddingX 
Sub SetPaddingX(x As String) As WixElement
	Element.Put("paddingX", x)
	Return Me
End Sub

'set paddingY
Sub SetPaddingY(y As String) As WixElement
	Element.Put("paddingY",y)
	Return Me
End Sub

'set data
Sub SetData(d As List) As WixElement
	Element.Put("data", d)
	Return Me
End Sub

'set header
Sub SetHeader(h As Object) As WixElement
	SetAttr("header", h)
	Return Me
End Sub

'set body
Sub SetBody(b As Object) As WixElement
	SetAttr("body", b)
	Return Me	
End Sub

'set gravity
Sub SetGravity(g As Int) As WixElement
	SetAttr("gravity", g)
	Return Me
End Sub

'set view
Sub SetView(v As String) As WixElement
	SetAttr("view", v)
	Return Me
End Sub

'setvalue
Sub SetValue(v As String) As WixElement
	SetAttr("value", v)
	Return Me
End Sub

'set type
Sub SetType(t As String) As WixElement
	SetAttr("type", t)
	Return Me
End Sub

'set height
Sub SetHeight(h As Object) As WixElement
	SetAttr("height", h)
	Return Me
End Sub

'set width
Sub SetWidth(w As Object) As WixElement
	SetAttr("width", w)
	Return Me
End Sub

'set width
Sub SetCSS(cs As String) As WixElement
	SetAttr("css", cs)
	Return Me
End Sub

Sub SetCSSJSON(json As String) As WixElement
	Dim m As Map = Json2Map(json)
	For Each mk As String In m.Keys
		Dim mv As Object = m.Get(mk)
		SetStyle(mk, mv)
	Next
	Return Me
End Sub

'set an attribute
Sub SetAttr(p As String, v As Object) As WixElement
	Element.Put(p,v)
	Return Me
End Sub

'set a html attribute
Sub SetHTMLAttr(attrName As String, attrValue As Object) As WixElement
	HTMLAttributes.put(attrName,attrValue)
	Return Me
End Sub

'return the object
Sub Item As Map
	For Each attr As String In Attributes.Keys
		Dim strVal As Object = Attributes.Get(attr)
		Element.Put(attr,strVal)
	Next
	SetOnCondition(On.Size,"on", On)
	SetOnCondition(options.Size,"options", options)
	SetOnCondition(Columns.Size,"columns", Columns)
	SetOnCondition(Cols.Size, "cols", Cols)
	SetOnCondition(Rows.Size, "rows", Rows)
	SetOnCondition(Elements.Size, "elements", Elements)
	SetOnCondition(Cells.Size, "cells", Cells)
	SetOnCondition(HTMLAttributes.Size, "attributes", HTMLAttributes)
	SetOnCondition(elementsConfig.Size, "elementsConfig", elementsConfig)
	SetOnCondition(Rules.Size, "rules", Rules)
	SetOnCondition(Styles.Size, "css", Styles)
	Return Element
End Sub

'set multi view
Sub SetMultiView(b As Boolean) As WixElement
	SetAttr("multiview", b)
	Return Me
End Sub

'set icon
Sub SetIcon(i As String) As WixElement
	SetAttr("icon", i)
	Return Me
End Sub

'set label
Sub SetLabel(l As String) As WixElement
	SetAttr("label", l)
	Return Me
End Sub

'set click
Sub SetClick(c As BANanoObject) As WixElement
	Element.Put("click", c)
	Return Me
End Sub

'add resizer
Sub AddResizerToColumns(s As String) As WixElement   'ignore
	Dim r As WixResizer
	r.Initialize("")
	AddColumns(r.Item)
	Return Me
End Sub

Sub AddColumnsResizer(s As String) As WixElement   'ignore
	Dim r As WixResizer
	r.Initialize("")
	AddColumns(r.Item)
	Return Me
End Sub

Sub AddResizerToRows(s As String) As WixElement   'ignore
	Dim r As WixResizer
	r.Initialize("")
	AddRows(r.Item)
	Return Me
End Sub

'set template
Sub SetTemplate(t As Object) As WixElement
	Element.Put("template", t)
	Return Me
End Sub

'add item to a column
Sub AddColumns(itm As Map) As WixElement
	Cols.Add(itm)
	Return Me
End Sub

'add item to a column
Sub AddDataColumn(itm As Map) As WixElement
	Columns.Add(itm)
	Return Me
End Sub

'add item to cells
Sub AddCells(itm As Map) As WixElement
	Cells.Add(itm)
	Return Me
End Sub

'add rows cells
Sub AddRowsCells(mCells As List) As WixElement
	Dim opt As Map = CreateMap()
	opt.Put("cells", mCells)
	AddRows(opt)
	Return Me
End Sub


'add column cells
Sub AddColumnsCells(mCells As List) As WixElement
	Dim opt As Map = CreateMap()
	opt.Put("cells", mCells)
	AddColumns(opt)
	Return Me
End Sub

'add item to elements
Sub AddElements(itm As Map) As WixElement
	Elements.Add(itm)
	Return Me
End Sub

'add item to a row
Sub AddRows(itm As Map) As WixElement
	Rows.Add(itm)
	Return Me
End Sub

'add on elements
Sub AddItem(itm As Map) As WixElement
	Elements.Add(itm)
	Return Me
End Sub

'add a row
Sub AddRow(wxEL As WixRow)
	AddRows(wxEL.Item)
End Sub

'add row items
Sub AddRowItems(items As List)
	For Each m As Map In items
		AddRows(m)
	Next
End Sub

'use a map object
Sub SetMap(m As Map) As WixElement
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


'add to rows of parent
Sub AddToRows(prt As WixElement)
	prt.AddRows(Item)
End Sub

'add a spacer to the rows
Sub AddRowsSpacer(r As String) As WixElement   'ignore
	Dim s As WixElement
	s.Initialize("").SetView("spacer")
	AddRows(s.item)
	Return Me
End Sub

Sub AddRowsResizer(s As String) As WixElement   'ignore
	Dim r As WixResizer
	r.Initialize("")
	AddRows(r.Item)
	Return Me
End Sub

'add a spacer to the columns
Sub AddColumnsSpacer(b As String) As WixElement    'ignore
	Dim s As WixElement
	s.Initialize("").SetView("spacer") 
	AddColumns(s.item)
	Return Me
End Sub

'add to columns of parent
Sub AddToColumns(prt As WixElement) As WixElement
	prt.AddColumns(Item)
	Return Me
End Sub

Sub AddToCells(prt As WixElement) As WixElement
	prt.AddCells(Item)
	Return Me
End Sub


'set align right
Sub SetAlignRight(r As String) As WixElement 'ignore
	SetAlign("right")
	Return Me
End Sub

'set align center
Sub SetAlignCenter(r As String) As WixElement 'ignore
	SetAlign("center") 
	Return Me
End Sub

'set align left
Sub SetAlignLeft(r As String) As WixElement 'ignore
	SetAlign("left")
	Return Me
End Sub

'set align 
Sub SetAlign(r As String) As WixElement 'ignore
	SetAttr("align", r)
	Return Me
End Sub


'add to elements of parent
Sub AddToElements(prt As WixElement) As WixElement
	prt.AddElements(Item)
	Return Me
End Sub

'add a column
Sub AddColumn(wxEL As WixColumn)
	AddColumns(wxEL.Item)
End Sub

'update property when size > 0
Sub SetOnCondition(Condition As Int, Prop As String, PropValue As Object) As WixElement
	If Condition <= 0 Then Return Me
	Element.put(Prop,PropValue)
	Return Me
End Sub

'make clean layout
Sub SetTypeClean(r As String) As WixElement  'ignore
	SetType("clean")
	Return Me
End Sub

'make line layout
Sub SetTypeLine(r As String) As WixElement   'ignore
	SetType("line")
	Return Me
End Sub

'make wide layout
Sub SetTypeWide(r As String) As WixElement   'ignore
	SetType("wide")
	Return Me
End Sub

'make space layout
Sub SetTypeSpace(r As String) As WixElement   'ignore
	SetType("space")
	Return Me
End Sub

'make a head layout
Sub SetTypeHead(r As String) As WixElement		'ignore
	SetType("head")
	Return Me
End Sub

'make form layout
Sub SetTypeForm(r As String) As WixElement		'ignore
	SetType("form")
	Return Me
End Sub


'set header layout
Sub SetViewHeaderLayout(r As String) As WixElement		'ignore
	SetView("headerlayout")
	Return Me
End Sub

'add to row
Sub AddToRow(r As WixRow)
	r.AddItem(Item)
End Sub

'set collapsed
Sub SetCollapsed(c As Boolean) As WixElement
	SetAttr("collapsed", c)
	Return Me
End Sub

'set type icon button
Sub SetDefaultTypeIconButton(r As String) As WixElement		'ignore
	SetDefaultType("iconButton")
	Return Me
End Sub

'set image button
Sub SetDefaultTypeImageButton(r As String) As WixElement  'ignore
	SetDefaultType("imageButton")
	Return Me
End Sub

'button type image	
Sub SetDefaultTypeImage(r As String) As WixElement  'ignore
	SetDefaultType("image")
	Return Me
End Sub

'button type icon
Sub SetDefaultTypeIcon(r As String) As WixElement  'ignore
	SetDefaultType("icon")
	Return Me
End Sub

'button type iconbuttontop
Sub SetDefaultTypeIconButtonTop(r As String) As WixElement  'ignore
	SetDefaultType("iconButtonTop")
	Return Me
End Sub

'add an icon and define it
Sub CreateIcon(sid As String) As WixIcon
	Dim btn As WixIcon
	btn.Initialize(sid)
	Return btn
End Sub

'add a label
Sub CreateLabel(sid As String) As WixLabel
	Dim lbl As WixLabel
	lbl.Initialize(sid)
	Return lbl
End Sub

'add a toggle button and define it
Sub CreateToggle(sid As String) As WixToggle
	Dim btn As WixToggle
	btn.Initialize(sid)
	Return btn
End Sub

Sub CreateAccordion(sid As String) As WixAccordion
	Dim btn As WixAccordion
	btn.Initialize(sid)
	Return btn
End Sub

Sub CreateCarousel(sid As String) As WixCarousel
	Dim btn As WixCarousel
	btn.Initialize(sid)
	Return btn
End Sub

Sub CreateChart(sid As String) As WixChart
	Dim btn As WixChart
	btn.Initialize(sid)
	Return btn
End Sub

Sub CreateComments(sid As String) As WixComments
	Dim btn As WixComments
	btn.Initialize(sid)
	Return btn
End Sub

Sub CreateContext(sid As String) As WixContext
	Dim btn As WixContext
	btn.Initialize(sid)
	Return btn
End Sub

Sub CreateContextMenu(sid As String) As WixContextMenu
	Dim btn As WixContextMenu
	btn.Initialize(sid)
	Return btn
End Sub

Sub CreateCounter(sid As String) As WixCounter
	Dim btn As WixCounter
	btn.Initialize(sid)
	Return btn
End Sub

Sub CreateDataTable(sid As String) As WixDataTable
	Dim btn As WixDataTable
	btn.Initialize(sid)
	Return btn
End Sub


Sub CreateDataView(sid As String) As WixDataView
	Dim btn As WixDataView
	btn.Initialize(sid)
	Return btn
End Sub


Sub CreateDatePicker(sid As String) As WixDatePicker
	Dim btn As WixDatePicker
	btn.Initialize(sid)
	Return btn
End Sub


Sub CreateDBLList(sid As String) As WixDBLList
	Dim btn As WixDBLList
	btn.Initialize(sid)
	Return btn
End Sub



Sub CreateFieldSet(sid As String) As WixFieldSet
	Dim btn As WixFieldSet
	btn.Initialize(sid)
	Return btn
End Sub

Sub CreateFlexLayout(sid As String) As WixFlexLayout
	Dim btn As WixFlexLayout
	btn.Initialize(sid)
	Return btn
End Sub

Sub CreateForm(sid As String) As WixForm
	Dim btn As WixForm
	btn.Initialize(sid)
	Return btn
End Sub


Sub CreateFormInput(sid As String) As WixFormInput
	Dim btn As WixFormInput
	btn.Initialize(sid)
	Return btn
End Sub


Sub CreateGoogleMap(sid As String) As WixGoogleMap
	Dim btn As WixGoogleMap
	btn.Initialize(sid)
	Return btn
End Sub

Sub CreateGroupList(sid As String) As WixGroupList
	Dim btn As WixGroupList
	btn.Initialize(sid)
	Return btn
End Sub

Sub CreateHeader(sid As String) As WixHeader 
	Dim itm As WixHeader 
	itm.Initialize(sid) 
	Return itm 
End Sub

Sub CreateIFrame(sid As String) As WixIFrame 
	Dim itm As WixIFrame 
	itm.Initialize(sid) 
	Return itm 
End Sub

Sub CreateLayout(sid As String) As WixLayout 
	Dim itm As WixLayout 
	itm.Initialize(sid) 
	Return itm 
End Sub

Sub CreateList(sid As String) As WixList 
	Dim itm As WixList 
	itm.Initialize(sid) 
	Return itm 
End Sub

Sub CreateMenu(sid As String) As WixMenu 
	Dim itm As WixMenu 
	itm.Initialize(sid) 
	Return itm 
End Sub

Sub CreateImage(sid As String) As WixImage 
	Dim itm As WixImage
	itm.Initialize(sid) 
	Return itm 
End Sub

Sub CreateMultiView(sid As String) As WixMultiView 
	Dim itm As WixMultiView 
	itm.Initialize(sid) 
	Return itm 
End Sub

Sub CreatePager(sid As String) As WixPager 
	Dim itm As WixPager 
	itm.Initialize(sid) 
	Return itm 
End Sub

Sub CreatePopUp(sid As String) As WixPopUp 
	Dim itm As WixPopUp 
	itm.Initialize(sid) 
	Return itm 
End Sub

Sub CreatePortlet(sid As String) As WixPortlet 
	Dim itm As WixPortlet 
	itm.Initialize(sid) 
	Return itm 
End Sub

Sub CreateProperty(sid As String) As WixProperty 
	Dim itm As WixProperty 
	itm.Initialize(sid) 
	Return itm 
End Sub

Sub CreateRadio(sid As String) As WixRadio 
	Dim itm As WixRadio 
	itm.Initialize(sid) 
	Return itm 
End Sub

Sub CreateRangeSlider(sid As String) As WixRangeSlider 
	Dim itm As WixRangeSlider 
	itm.Initialize(sid) 
	Return itm 
End Sub

Sub CreateRichSelect(sid As String) As WixRichSelect 
	Dim itm As WixRichSelect 
	itm.Initialize(sid) 
	Return itm 
End Sub

Sub CreateRichText(sid As String) As WixRichText 
	Dim itm As WixRichText 
	itm.Initialize(sid) 
	Return itm 
End Sub

Sub CreateScrollView(sid As String) As WixScrollView 
	Dim itm As WixScrollView 
	itm.Initialize(sid) 
	Return itm 
End Sub

Sub CreateSearch(sid As String) As WixSearch 
	Dim itm As WixSearch 
	itm.Initialize(sid) 
	Return itm 
End Sub

Sub CreateSection(sid As String) As WixSection 
	Dim itm As WixSection 
	itm.Initialize(sid) 
	Return itm 
End Sub

Sub CreateSegmented(sid As String) As WixSegmented 
	Dim itm As WixSegmented 
	itm.Initialize(sid) 
	Return itm 
End Sub

Sub CreateSelect(sid As String) As WixSelect 
	Dim itm As WixSelect 
	itm.Initialize(sid) 
	Return itm 
End Sub

Sub CreateSideBar(sid As String) As WixSideBar 
	Dim itm As WixSideBar 
	itm.Initialize(sid) 
	Return itm 
End Sub

Sub CreateSideMenu(sid As String) As WixSideMenu 
	Dim itm As WixSideMenu 
	itm.Initialize(sid) 
	Return itm 
End Sub

Sub CreateSlider(sid As String) As WixSlider 
	Dim itm As WixSlider 
	itm.Initialize(sid) 
	Return itm 
End Sub

Sub CreateSuggest(sid As String) As WixSuggest 
	Dim itm As WixSuggest 
	itm.Initialize(sid) 
	Return itm 
End Sub

Sub CreateSwitch(sid As String) As WixSwitch 
	Dim itm As WixSwitch 
	itm.Initialize(sid) 
	Return itm 
End Sub

Sub CreateTabBar(sid As String) As WixTabBar 
	Dim itm As WixTabBar 
	itm.Initialize(sid) 
	Return itm 
End Sub

Sub CreateTabView(sid As String) As WixTabView 
	Dim itm As WixTabView 
	itm.Initialize(sid) 
	Return itm 
End Sub

Sub CreateTemplate(sid As String) As WixTemplate 
	Dim itm As WixTemplate 
	itm.Initialize(sid) 
	Return itm 
End Sub

Sub CreateText(sid As String) As WixText 
	Dim itm As WixText 
	itm.Initialize(sid) 
	Return itm 
End Sub

Sub CreateTextArea(sid As String) As WixTextArea 
	Dim itm As WixTextArea 
	itm.Initialize(sid) 
	Return itm 
End Sub

Sub CreateToolBar(sid As String) As WixToolBar 
	Dim itm As WixToolBar 
	itm.Initialize(sid) 
	Return itm 
End Sub

Sub CreateTree(sid As String) As WixTree 
	Dim itm As WixTree 
	itm.Initialize(sid) 
	Return itm 
End Sub

Sub CreateTreeTable(sid As String) As WixTreeTable 
	Dim itm As WixTreeTable 
	itm.Initialize(sid) 
	Return itm 
End Sub

Sub CreateUnitList(sid As String) As WixUnitList 
	Dim itm As WixUnitList 
	itm.Initialize(sid) 
	Return itm 
End Sub

Sub CreateUploader(sid As String) As WixUploader 
	Dim itm As WixUploader 
	itm.Initialize(sid) 
	Return itm 
End Sub

Sub CreateVideo(sid As String) As WixVideo 
	Dim itm As WixVideo 
	itm.Initialize(sid) 
	Return itm 
End Sub

Sub CreateWindow(sid As String) As WixWindow 
	Dim itm As WixWindow 
	itm.Initialize(sid) 
	Return itm
End Sub

