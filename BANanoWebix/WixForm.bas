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
	Private Elements As List
	Private Columns As List
	Private Rules As Map
	Private webix As BANanoObject
	Private Rows As List
End Sub

'initialize the form
Public Sub Initialize(fID As String) As WixForm
	ID = fID.tolowercase
	Form.Initialize(fID).SetView("form")
	Elements.Initialize
	Columns.Initialize  
	Rules.Initialize 
	webix.Initialize("webix") 
	Rows.Initialize
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
	Form.SetProperty("scroll", b)
	Return Me
End Sub

Sub AddRuleIsEmail(eID As String) As WixForm
	eID = eID.tolowercase
	Dim ie As String = webix.GetField("rules").GetField("isEmail").result
	Rules.Put(eID, ie)
	Return Me
End Sub

Sub AddRuleIsNotEmpty(eID As String) As WixForm
	eID = eID.tolowercase
	Dim ie As String = webix.GetField("rules").GetField("isNotEmpty").result
	Rules.Put(eID, ie)
	Return Me
End Sub

Sub AddRuleIsChecked(eID As String) As WixForm
	eID = eID.tolowercase
	Dim ie As String = webix.GetField("rules").GetField("isChecked").result
	Rules.Put(eID, ie)
	Return Me
End Sub

Sub AddRuleIsNumber(eID As String) As WixForm
	eID = eID.tolowercase
	Dim ie As String = webix.GetField("rules").GetField("isNumber").result
	Rules.Put(eID, ie)
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixForm
	Form.SetTooltip(tt)
	Return Me
End Sub

'add a spacer To the Columns
Sub AddColumnsSpacer()
	Columns.Add(CreateMap())
End Sub

'add a column
Sub AddColumn(c As WixColumn)
	Columns.Add(c.Item)
End Sub

'add an item to the columns
Sub AddColumns(i As Map)
	Columns.Add(i)
End Sub

'add an item to the rows
Sub AddRows(i As Map)
	Rows.Add(i)
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
	Form.Width = w
	Return Me
End Sub

'set height
Sub SetHeight(h As Object) As WixForm
	Form.Height = h
	Return Me
End Sub

'return the item
Sub Item As Map
	If Columns.Size > 0 Then
		Dim cols As Map = CreateMap()
		cols.Put("cols", Columns)
		Elements.Add(cols)
	End If
	If Elements.Size > 0 Then
		Form.SetProperty("elements", Elements)
	End If
	If Rules.Size > 0 Then
		Form.SetProperty("rules", Rules)
	End If
	If Rows.Size > 0 Then
		Form.SetAttr("rows", Rows)
	End If
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
