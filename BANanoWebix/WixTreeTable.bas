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
End Sub

'Initializes the TreeTableTable sheet
Public Sub Initialize(eID As String) As WixTreeTable
	ID = eID.tolowercase
	TreeTable.Initialize(ID).SetView("treetable")
	Return Me
End Sub

'add column
Sub AddColumn(c As WixDataColumn)
	TreeTable.AddColumns(c.Item)
End Sub

'return the item
Sub Item As Map
	Return TreeTable.item
End Sub

'set borderless
Sub SetBorderLess(b As Boolean) As WixTreeTable
	TreeTable.SetBorderLess(b)
	Return Me
End Sub

'set selectable
Sub SetSelect(b As Boolean) As WixTreeTable
	TreeTable.SetSelect(b)
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
Sub SetHeight(h As Int) As WixTreeTable
	TreeTable.SetHeight(h)
	Return Me
End Sub

'set width
Sub SetWidth(h As Int) As WixTreeTable
	TreeTable.SetWidth(h)
	Return Me
End Sub
