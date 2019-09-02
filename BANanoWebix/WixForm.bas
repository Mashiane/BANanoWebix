B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.5
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Form As WixElement
	Public ID As String
	Private webix As BANanoObject
	Public Parent As WixElement

End Sub

'initialize the form
Public Sub Initialize(fID As String) As WixForm
	ID = fID.tolowercase
	Form.Initialize(fID).SetView("form")
	webix.Initialize("webix") 
	Parent = Null
	Return Me
End Sub


'set css
Sub SetStyle(prop As String, sval As String) As WixForm
	Form.SetStyle(prop,sval)
	Return Me
End Sub


'add tp columns of parent
Sub Pop
	Parent.AddColumns(Item)
End Sub

'set the parent
Sub SetParent(p As WixElement) As WixForm
	Parent = p
	Return Me
End Sub


'add a row
Sub AddRow(wxEL As WixRow)
	AddRows(wxEL.Item)
End Sub

'add a spacer to the rows
Sub AddRowsSpacer(r As String) As WixForm   'ignore
	Dim s As WixElement
	s.Initialize("").SetView("spacer")
	AddRows(s.item)
	Return Me
End Sub

Sub AddRowsResizer(s As String) As WixForm   'ignore
	Dim r As WixResizer
	r.Initialize("")
	AddRows(r.Item)
	Return Me
End Sub

'add a spacer to the columns
Sub AddColumnsSpacer(b As String) As WixForm    'ignore
	Dim s As WixElement
	s.Initialize("").SetView("spacer")
	AddColumns(s.item)
	Return Me
End Sub
 


Sub AddColumnsResizer(s As String) As WixForm   'ignore
	Dim r As WixResizer
	r.Initialize("")
	AddColumns(r.Item)
	Return Me
End Sub

Sub SetElementsConfigJSON(json As String) As WixForm
	Form.SetElementsConfigJSON(json)
	Return Me
End Sub

Sub SetTemplateHTML(h As UOENowHTML) As WixForm
	h.SetImportant(False)
	Dim os As String = h.HTML
	Form.SetTemplate(os)
	Return Me
End Sub

Sub SetBorderless(b As Boolean) As WixForm
	Form.SetAttr("borderless", b)
	Return Me
End Sub

Sub SetComplexData(b As Boolean) As WixForm
	Form.SetAttr("complexData", b)
	Return Me
End Sub

' set padding
Sub SetPadding(padding As Object) As WixForm
	Form.SetPadding(padding)
	Return Me
End Sub

' set margin
Sub SetMargin(margin As Object) As WixForm
	Form.SetMargin(margin)
	Return Me
End Sub

'set name
Sub SetName(n As String) As WixForm
	Form.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixForm
	Form.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixForm
	Form.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixForm
	Form.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixForm
	Form.SetMinHeight(h)
	Return Me
End Sub

'add row items
Sub AddRowItems(items As List)
	For Each m As Map In items
		AddRows(m)
	Next
End Sub

'add rows
Sub AddWixRows(lst As List)
	For Each i As WixRow In lst
		AddRows(i.Item)
	Next
End Sub

'use a map object
Sub SetMap(m As Map) As WixForm
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		Form.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


'set scrollY
Sub SetScrollY(b As Object) As WixForm
	Form.SetAttr("scrollY", b)
	Return Me
End Sub

'set scrollX
Sub SetScrollX(b As Object) As WixForm
	Form.SetAttr("scrollX", b)
	Return Me
End Sub


'set scroll
Sub SetScroll(b As Object) As WixForm
	Form.SetAttr("scroll", b)
	Return Me
End Sub


Sub AddRuleIsEmail(eID As String) As WixForm
	eID = eID.tolowercase
	Dim ie As Object = webix.GetField("rules").GetField("isEmail")
	Form.Rules.Put(eID, ie)
	Return Me
End Sub

Sub AddRuleIsNotEmpty(eID As String) As WixForm
	eID = eID.tolowercase
	Dim ie As Object = webix.GetField("rules").GetField("isNotEmpty")
	Form.Rules.Put(eID, ie)
	Return Me
End Sub

Sub AddRuleIsChecked(eID As String) As WixForm
	eID = eID.tolowercase
	Dim ie As Object = webix.GetField("rules").GetField("isChecked")
	Form.Rules.Put(eID, ie)
	Return Me
End Sub

Sub AddRuleIsNumber(eID As String) As WixForm
	eID = eID.tolowercase
	Dim ie As Object = webix.GetField("rules").GetField("isNumber")
	Form.Rules.Put(eID, ie)
	Return Me
End Sub

Sub AddRuleIsNumberOrBlank(eID As String) As WixForm
	eID = eID.tolowercase
	Dim ie As Object = webix.GetField("rules").GetField("isNumberOrBlank")
	Form.Rules.Put(eID, ie)
	Return Me
End Sub

Sub AddRuleIsEmailOrBlank(eID As String) As WixForm
	eID = eID.tolowercase
	Dim ie As Object = webix.GetField("rules").GetField("isEmailOrBlank")
	Form.Rules.Put(eID, ie)
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixForm
	Form.SetTooltip(tt)
	Return Me
End Sub

'add a column
Sub AddColumn(c As WixColumn)
	Form.AddColumns(c.Item)
End Sub

'add an item to the columns
Sub AddColumns(i As Map)
	Form.AddColumns(i)
End Sub

'add an item to the rows
Sub AddRows(i As Map)
	Form.Rows.Add(i)
End Sub

'add to column
Sub AddToColumn(c As WixColumn)
	c.AddItem(Item)
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'set width
Sub SetWidth(w As Object) As WixForm
	Form.SetWidth(w)
	Return Me
End Sub

'set height
Sub SetHeight(h As Object) As WixForm
	Form.SetHeight(h)
	Return Me
End Sub

'return the item
Sub Item As Map
	Return Form.item
End Sub

'add an element to the form
Sub AddItem(itm As Map)
	Form.AddItem(itm)
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


'set default view
Sub SetDefaultView(a As String) As WixForm
	Form.SetDefaultView(a)
	Return Me
End Sub

'set default type
Sub SetDefaultType(a As String) As WixForm
	Form.SetDefaultType(a)
	Return Me
End Sub

'set default label align
Sub SetDefaultLabelAlign(a As String) As WixForm
	Form.SetDefaultLabelAlign(a)
	Return Me
End Sub

'set default label width
Sub SetDefaultLabelWidth(a As Int) As WixForm
	Form.SetDefaultLabelWidth(a)
	Return Me
End Sub


'set default label position
Sub SetDefaultLabelPosition(p As String) As WixForm
	Form.SetDefaultLabelPosition(p)
	Return Me
End Sub

'set default align
Sub SetDefaultAlign(a As String) As WixForm
	Form.SetDefaultAlign(a)
	Return Me
End Sub

'set default width
Sub SetDefaultWidth(w As Int) As WixForm
	Form.SetDefaultWidth(w)
	Return Me
End Sub

'set default height
Sub SetDefaultHeight(h As Int) As WixForm
	Form.SetDefaultHeight(h)
	Return Me
End Sub

Sub SetDefaultBottomPadding(w As Int) As WixForm
	Form.SetDefaultBottomPadding(w)
	Return Me
End Sub

Sub SetAnimate(animate As Boolean) As WixForm
	Form.SetAttr("animate", animate)
	Return Me
End Sub

Sub SetAutoheight(autoheight As Boolean) As WixForm
	Form.SetAttr("autoheight", autoheight)
	Return Me
End Sub

Sub SetCols(cols As Object) As WixForm
Form.SetAttr("cols", cols)
Return Me
End Sub

Sub SetContainer(container As Object) As WixForm
Form.SetAttr("container", container)
Return Me
End Sub

Sub SetCss(css As Object) As WixForm
Form.SetAttr("css", css)
Return Me
End Sub

Sub SetData(data As Object) As WixForm
Form.SetAttr("data", data)
Return Me
End Sub

Sub SetDataFeed(dataFeed As Object) As WixForm
Form.SetAttr("dataFeed", dataFeed)
Return Me
End Sub

Sub SetDatatype(datatype As Object) As WixForm
Form.SetAttr("datatype", datatype)
Return Me
End Sub

Sub SetDisabled(disabled As Boolean) As WixForm
Form.SetAttr("disabled", disabled)
Return Me
End Sub

Sub SetElements(elements As Object) As WixForm
Form.SetAttr("elements", elements)
Return Me
End Sub

Sub SetElementsConfig(elementsConfig As Object) As WixForm
Form.SetAttr("elementsConfig", elementsConfig)
Return Me
End Sub

Sub SetGravity(gravity As Object) As WixForm
Form.SetAttr("gravity", gravity)
Return Me
End Sub

Sub SetHidden(hidden As Boolean) As WixForm
Form.SetAttr("hidden", hidden)
Return Me
End Sub

Sub SetIsolate(isolate As Boolean) As WixForm
Form.SetAttr("isolate", isolate)
Return Me
End Sub

Sub SetMaxHeight(maxHeight As Object) As WixForm
Form.SetAttr("maxHeight", maxHeight)
Return Me
End Sub

Sub SetMaxWidth(maxWidth As Object) As WixForm
Form.SetAttr("maxWidth", maxWidth)
Return Me
End Sub

Sub SetPaddingX(paddingX As Object) As WixForm
Form.SetAttr("paddingX", paddingX)
Return Me
End Sub

Sub SetPaddingY(paddingY As Object) As WixForm
Form.SetAttr("paddingY", paddingY)
Return Me
End Sub

Sub SetRows(rows As Object) As WixForm
Form.SetAttr("rows", rows)
Return Me
End Sub

Sub SetRules(rules As Object) As WixForm
Form.SetAttr("rules", rules)
Return Me
End Sub

Sub SetScrollSpeed(scrollSpeed As Object) As WixForm
Form.SetAttr("scrollSpeed", scrollSpeed)
Return Me
End Sub

Sub SetType(sType As Object) As WixForm
Form.SetAttr("type", sType)
Return Me
End Sub

Sub SetUrl(url As Object) As WixForm
Form.SetAttr("url", url)
Return Me
End Sub

Sub SetVisibleBatch(visibleBatch As Object) As WixForm
Form.SetAttr("visibleBatch", visibleBatch)
Return Me
End Sub