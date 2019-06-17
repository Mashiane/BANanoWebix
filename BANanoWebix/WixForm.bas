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
	Private Dollar As BANanoObject
	Private Page As WixPage
End Sub

'initialize the form
Public Sub Initialize(pg As WixPage, fID As String) As WixForm
	Page = pg
	ID = fID.tolowercase
	Form.Initialize(fID).SetView("form")
	Dollar = Page.dollar
	Return Me
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

'return the item
Sub Item As Map
	Return Form.item
End Sub

'get the form contents
Sub GetValues() As Map
	Dim values As Map = Dollar.Selector(ID).RunMethod("getValues",Null).result
	Return values
End Sub

'clear the form
Sub Clear
	Dollar.Selector(ID).RunMethod("clear",Null)
End Sub

'set values
Sub SetValues(values As Map)
	Dollar.Selector(ID).RunMethod("setValues",Array(values))
End Sub	

'add an element to the form
Sub AddItem(itm As Map)
	Form.AddItem(itm)
End Sub
