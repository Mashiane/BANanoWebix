B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public TreeTable As WixElement
	Public Columns As List
	'selection
	Public DT_SELECT_ROW As String = "row"
	Public DT_SELECT_CELL As String = "cell"
	Public DT_SELECT_COLUMN As String = "column"
	Public Items As List
End Sub

'Initializes the TreeTableTable sheet
Public Sub Initialize(eID As String) As WixTreeTable
	ID = eID.tolowercase
	TreeTable.Initialize(ID).SetView("treetable")
	Columns.Initialize 
	Items.Initialize 
	Return Me
End Sub


'use a map object
Sub SetMap(m As Map) As WixTreeTable
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		TreeTable.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub

'set editable
Sub SetEditable(b As Boolean) As WixTreeTable
	TreeTable.SetAttr("editable", b)
	Return Me
End Sub


'set select enables selection of items
Sub SetSelect(s As Object) As WixTreeTable
	TreeTable.SetAttr("select", s)
	Return Me
End Sub

'add column
Sub AddColumn(c As WixDataColumn)
	Columns.Add(c.Item)
End Sub

'return the item
Sub Item As Map
	TreeTable.SetAttr("columns", Columns)
	Return TreeTable.item
End Sub

'set borderless
Sub SetBorderLess(b As Boolean) As WixTreeTable
	TreeTable.SetBorderLess(b)
	Return Me
End Sub

'set the data
Sub SetData(data As List) As WixTreeTable
	TreeTable.SetData(data)
	Return Me
End Sub

'set style
Sub SetStyle(prop As String, val As String) As WixTreeTable
	TreeTable.SetStyle(prop,val)
	Return Me
End Sub

'set template
Sub SetTemplate(t As Object) As WixTreeTable
	TreeTable.SetTemplate(t)
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixTreeTable
	TreeTable.SetTooltip(tt)
	Return Me
End Sub

'set height
Sub SetHeight(h As Object) As WixTreeTable
	TreeTable.SetHeight(h)
	Return Me
End Sub

'set width
Sub SetWidth(h As object) As WixTreeTable
	TreeTable.SetWidth(h)
	Return Me
End Sub


'set auto width
Sub SetAutoHeight(b As Boolean) As WixTreeTable
	TreeTable.SetAttr("autoheight", b)
	Return Me
End Sub

'set auto height
Sub SetAutoWidth(b As Boolean) As WixTreeTable
	TreeTable.SetAttr("autowidth", b)
	Return Me
End Sub


'add item
Sub AddItem(parentID As String, meID As String, mValue As String, mData As Map, mOpen As Boolean) As WixTreeTable
	parentID = parentID.tolowercase
	meID = meID.tolowercase
	Dim mitem As Map = CreateMap()
	mitem.Put("id", meID)
	mitem.Put("value", mValue)
	mitem.Put("open", mOpen)
	mitem.Put("parentid", parentID)
	For Each mKey As String In mData.Keys
		Dim mValue1 As String = mData.Get(mKey)
		mKey = mKey.tolowercase
		mitem.Put(mKey, mValue1)
	Next
	Items.Add(mitem)
	Return Me
End Sub

