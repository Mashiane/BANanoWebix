﻿B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.5
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Template As String
	Public Columns As List
	Public Width As Int
	Public Height As Int
	Public Rows As List
	Private Element As Map
	Public Value As Object
	Public Elements As List
	Public Name As String
	Private Attributes As Map
	Public TypeOf As String
	Public Container As String
	Public PlaceHolder As String
	Public Align As String
	Type LabelType(Text As String, Width As Int, Position As String, Align As String)
	Public Label As LabelType
	Public inputWidth As Int
	Private HTMLAttributes As Map 
	Public View As String
	Public Gravity As Int
	Public CSS As String
	Public Header As String
	Public Body As String
	Private Styles As Map
	Private Cells As List
	Private elementsConfig As Map
End Sub

'initialize the element
Public Sub Initialize(sID As String) As WixElement
	ID = sID.ToLowerCase
	Template = ""
	Width = 0
	Cells.Initialize 
	elementsConfig.Initialize 
	Height = 0
	Styles.Initialize 
	Element = CreateMap("id":ID)
	Value = ""
	Name = ID
	Container = ""
	Rows.Initialize
	Elements.Initialize
	Columns.Initialize
	Attributes.Initialize
	PlaceHolder = ""
	Align = ""
	TypeOf = ""
	Container = ""
	Label.Initialize 
	Label.Text = ""
	Label.Width = 0
	inputWidth = 0
	Gravity = 0
	Label.Align = ""
	Label.Position = ""
	CSS = ""
	Header = ""
	Body = ""
	HTMLAttributes.Initialize
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
Sub SetDefaultLabelAlign(a As String) As WixElement
	elementsConfig.Put("labelAlign", a)
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

'set visible batch
Sub SetVisibleBatch(b As Int) As WixElement
	SetProperty("visibleBatch", b)
	Return Me
End Sub

'set batch
Sub SetBatch(b As Int) As WixElement
	SetProperty("batch",b)
	Return Me
End Sub

'set animate
Sub SetAnimate(b As Boolean) As WixElement
	SetProperty("animate",b)
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

'set padding
Sub SetPadding(padding As String) As WixElement
	Element.Put("padding", padding)
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

'set property
Sub SetProperty(p As String, v As Object) As WixElement
	Element.Put(p,v)
	Return Me
End Sub

'set data
Sub SetData(d As List) As WixElement
	Element.Put("data", d)
	Return Me
End Sub

'set header
Sub SetHeader(h As String) As WixElement
	Header = h
	Return Me
End Sub

'set body
Sub SetBody(b As String) As WixElement
	Body = b
	Return Me	
End Sub

'set gravity
Sub SetGravity(g As Int) As WixElement
	Gravity = g
	Return Me
End Sub

'set view
Sub SetView(v As String) As WixElement
	View = v
	Return Me
End Sub

'setvalue
Sub SetValue(v As String) As WixElement
	Value = v
	Return Me
End Sub

'set type
Sub SetType(t As String) As WixElement
	TypeOf = t
	Return Me
End Sub

'set height
Sub SetHeight(h As Int) As WixElement
	Height = h
	Return Me
End Sub

'set width
Sub SetWidth(w As Int) As WixElement
	Width = w
	Return Me
End Sub

'set width
Sub SetCSS(cs As String) As WixElement
	CSS = cs
	Return Me
End Sub

'set an attribute
Sub SetAttr(attrName As String, attrValue As Object) As WixElement
	SetOnContent(attrName,attrValue)
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
	SetOnCondition(Height,"height",Height)
	SetOnCondition(Width, "width", Width)
	SetOnContent("body", Body)
	SetOnContent("header", Header)
	SetOnContent("container", Container)
	SetOnContent("type", TypeOf)
	SetOnContent("view", View)
	SetOnContent("name", Name)
	SetOnContent("css", CSS)
	SetOnContent("value", Value)
	SetOnContent("align", Align)
	SetOnContent("template", Template)
	SetOnContent("label", Label.Text)
	SetOnContent("placeholder", PlaceHolder)
	SetOnContent("labelPosition", Label.Position)
	SetOnContent("labelAlign", Label.Align)
	SetOnCondition(Gravity,"gravity", Gravity)
	SetOnCondition(Label.Width,"labelWidth", Label.Width)
	SetOnCondition(Columns.Size,"cols", Columns)
	SetOnCondition(Rows.Size, "rows", Rows)
	SetOnCondition(Elements.Size, "elements", Elements)
	SetOnCondition(Cells.Size, "cells", Cells)
	SetOnCondition(inputWidth,"inputWidth",inputWidth)
	SetOnCondition(HTMLAttributes.Size, "attributes", HTMLAttributes)
	SetOnCondition(elementsConfig.Size, "elementsConfig", elementsConfig)
	SetOnCondition(Styles.Size, "css", Styles)
	Return Element
End Sub

'set multi view
Sub SetMultiView(b As Boolean) As WixElement
	SetProperty("multiview", b)
	Return Me
End Sub

'set icon
Sub SetIcon(i As String) As WixElement
	SetOnContent("icon", i)
	Return Me
End Sub

'set label
Sub SetLabel(l As String) As WixElement
	SetOnContent("label", l)
	Return Me
End Sub

'set click
Sub SetClick(c As BANanoObject) As WixElement
	Element.Put("click", c)
	Return Me
End Sub

'add resizer
Sub AddResizerToColumns As WixElement
	Dim r As WixResizer
	r.Initialize("")
	AddColumns(r.Item)
	Return Me
End Sub

'set template
Sub SetTemplate(t As String) As WixElement
	Template = t
	Return Me
End Sub

'add item to a column
Sub AddColumns(itm As Map) As WixElement
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

'add to rows of parent
Sub AddToRows(prt As WixElement)
	prt.AddRows(Item)
End Sub

'add a spacer to the rows
Sub AddRowsSpacer()
	Dim s As WixElement
	s.Initialize("").SetView("spacer")
	AddRows(s.item)
End Sub

'add a spacer to the columns
Sub AddColumnsSpacer()
	Dim s As WixElement
	s.Initialize("").SetView("spacer") 
	AddColumns(s.item)
End Sub

'add to columns of parent
Sub AddToColumns(prt As WixElement) As WixElement
	prt.AddColumns(Item)
	Return Me
End Sub

'set align right
Sub SetAlignRight() As WixElement
	Align = "right"
	Return Me
End Sub

'set align center
Sub SetAlignCenter() As WixElement
	Align = "center"
	Return Me
End Sub

'set align left
Sub SetAlignLeft() As WixElement
	Align = "left"
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

'update property when not blank
Sub SetOnContent(Prop As String, PropValue As String) As WixElement
	If PropValue = "" Then Return Me
	Element.put(Prop,PropValue)
	Return Me
End Sub

'update property when size > 0
Sub SetOnCondition(Condition As Int, Prop As String, PropValue As Object) As WixElement
	If Condition <= 0 Then Return Me
	Element.put(Prop,PropValue)
	Return Me
End Sub

'make clean layout
Sub SetTypeClean As WixElement
	SetType("clean")
	Return Me
End Sub

'make line layout
Sub SetTypeLine As WixElement
	SetType("line")
	Return Me
End Sub

'make wide layout
Sub SetTypeWide As WixElement
	SetType("wide")
	Return Me
End Sub

'make space layout
Sub SetTypeSpace As WixElement
	SetType("space")
	Return Me
End Sub

'make a head layout
Sub SetTypeHead As WixElement
	SetType("head")
	Return Me
End Sub

'make form layout
Sub SetTypeForm As WixElement
	SetType("form")
	Return Me
End Sub


'set header layout
Sub SetViewHeaderLayout As WixElement
	SetView("headerlayout")
	Return Me
End Sub

'add to row
Sub AddToRow(r As WixRow)
	r.AddItem(Item)
End Sub

'set collapsed
Sub SetCollapsed(c As Boolean) As WixElement
	SetProperty("collapsed", c)
	Return Me
End Sub

'set type icon button
Sub SetDefaultTypeIconButton() As WixElement
	TypeOf = "iconButton"
	Return Me
End Sub

'set image button
Sub SetDefaultTypeImageButton(r As String) As WixElement  'ignore
	TypeOf =  "imageButton"
	Return Me
End Sub

'button type image	
Sub SetDefaultTypeImage(r As String) As WixElement  'ignore
	TypeOf = "image"
	Return Me
End Sub

'button type icon
Sub SetDefaultTypeIcon(r As String) As WixElement  'ignore
	TypeOf = "icon"
	Return Me
End Sub

'button type iconbuttontop
Sub SetDefaultTypeIconButtonTop(r As String) As WixElement  'ignore
	TypeOf = "iconButtonTop"
	Return Me
End Sub
