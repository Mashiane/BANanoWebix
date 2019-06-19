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
End Sub

'initialize the form
Public Sub Initialize(fID As String) As WixForm
	ID = fID.tolowercase
	Form.Initialize(fID).SetView("form")
	Elements.Initialize
	Columns.Initialize  
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

'add to column
Sub AddToColumn(c As WixColumn)
	c.AddItem(Item)
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'set width
Sub SetWidth(w As Int) As WixForm
	Form.Width = w
	Return Me
End Sub

'set height
Sub SetHeight(h As Int) As WixForm
	Form.Height = h
	Return Me
End Sub

'return the item
Sub Item As Map
	Dim cols As Map = CreateMap()
	cols.Put("cols", Columns)
	Elements.Add(cols)
	Form.SetProperty("elements", Elements)
	Return Form.item
End Sub

'add an element to the form
Sub AddItem(itm As Map)
	Form.AddItem(itm)
End Sub
