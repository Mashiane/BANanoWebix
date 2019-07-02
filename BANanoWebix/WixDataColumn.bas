B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Column As WixElement
	Private dt As WixDataTable
	Private tr As WixTreeTable
End Sub

'Initializes the data column
Public Sub Initialize(dataTable As WixDataTable, cID As String) As WixDataColumn
	ID = cID.tolowercase
	Column.Initialize(ID)
	dt = dataTable
	Return Me 
End Sub

'initialize for treetable
Public Sub Initialize1(treeTable As WixTreeTable, cID As String) As WixDataColumn
	ID = cID.tolowercase
	Column.Initialize(ID)
	tr = treeTable
	Return Me 
End Sub

'Initializes the data column
Public Sub Initialize2(cID As String) As WixDataColumn
	ID = cID.tolowercase
	Column.Initialize(ID)
	Return Me 
End Sub


'add to parent data table
Sub Pop
	Dim Columns As List = dt.columns
	Columns.Add(Item)
End Sub

'add to treetable
Sub Pop1
	Dim columns As List = tr.columns
	columns.add(Item)
End Sub

'add to treetable
Sub Pop2(tbl As WixDataTable)
	Dim columns As List = tbl.columns
	columns.add(Item)
End Sub 

'set options
Sub SetOptions(options As List) As WixDataColumn
	Column.SetAttr("options", options)
	Return Me
End Sub

'set batch
Sub SetBatch(b As Int) As WixDataColumn
	Column.SetAttr("batch", b)
	Return Me
End Sub

'set hidden
Sub SetHiddent(b As Boolean) As WixDataColumn
	Column.SetAttr("hidden", b)
	Return Me
End Sub

'align right
Sub AlignRight As WixDataColumn
	Column.SetStyle("text-align", "right")
	Return Me
End Sub

'align center
Sub AlignCenter As WixDataColumn
	Column.SetStyle("text-align", "center")
	Return Me
End Sub

'set adjust
Sub SetAdjust(a As Object) As WixDataColumn
	Column.SetAttr("adjust", a)
	Return Me
End Sub

'set the header
Sub SetHeader(h As String) As WixDataColumn
	Column.SetAttr("header", h)
	Return Me
End Sub

'set width
Sub SetWidth(w As object) As WixDataColumn
	Column.SetAttr("width", w)
	Return Me
End Sub

'set editor
Sub SetEditor(e As String) As WixDataColumn
	Column.SetAttr("editor", e)
	Return Me
End Sub

'set editor popup
Sub SetEditorPopUp(e As String) As WixDataColumn  'ignore
	SetEditor("popup")
	Return Me
End Sub


'set editor color
Sub SetEditorColor(r As String) As WixDataColumn   'ignore
	SetEditor("color")
	Return Me
End Sub

'set editor text
Sub SetEditorText(r As String) As WixDataColumn    'ignore
	SetEditor("text")
	Return Me
End Sub

'set editor password
Sub SetEditorPassword(r As String) As WixDataColumn    'ignore
	SetEditor("password")
	Return Me
End Sub

'set editor date
Sub SetEditorDate(r As String) As WixDataColumn    'ignore
	SetEditor("date")
	Return Me
End Sub

'set editor inline text
Sub SetEditorInlineText(r As String) As WixDataColumn    'ignore
	SetEditor("inline-text")
	Return Me
End Sub

'set editor select
Sub SetEditorSelect(r As String) As WixDataColumn    'ignore
	SetEditor("select")
	Return Me
End Sub

'set editor combo
Sub SetEditorCombo(r As String) As WixDataColumn    'ignore
	SetEditor("combo")
	Return Me
End Sub

'set editor rich select
Sub SetEditorRichSelect(r As String) As WixDataColumn    'ignore
	SetEditor("richselect")
	Return Me
End Sub

'set editor rich select
Sub SetEditorCheckBox(r As String) As WixDataColumn    'ignore
	SetEditor("checkbox")
	Return Me
End Sub

'set editor inline checkbox
Sub SetEditorInlineCheckBox(r As String) As WixDataColumn    'ignore
	SetEditor("inline-checkbox")
	Return Me
End Sub

'set fill space
Sub SetFillSpace(s As Boolean) As WixDataColumn
	Column.SetAttr("fillspace", s)
	Return Me
End Sub

'set template
Sub SetTemplate(t As Object) As WixDataColumn
	Column.SetTemplate(t)
	Return Me
End Sub

'set sort
Sub SetSort(s As String) As WixDataColumn
	Column.SetAttr("sort", s)
	Return Me
End Sub

'return the item
Sub Item As Map
	Return Column.item
End Sub