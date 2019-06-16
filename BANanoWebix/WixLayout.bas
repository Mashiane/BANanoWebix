B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Layout As WixElement
End Sub

'initialize the layout
Public Sub Initialize(sID As String) As WixLayout
	ID = sID.tolowercase
	Layout.Initialize(ID).SetView("layout")
	Return Me
End Sub

'set header layout
Sub SetHeaderLayout As WixLayout
	Layout.SetView("headerlayout")
	Return Me
End Sub

'add item to a column
Sub AddColumns(itm As Map) As WixLayout
	Layout.AddColumns(itm)
	Return Me
End Sub

'add item to elements
Sub AddElements(itm As Map) As WixLayout
	Layout.AddElements(itm)
	Return Me
End Sub

'add item to a row
Sub AddRows(itm As Map) As WixLayout
	Layout.AddRows(itm)
	Return Me
End Sub

'make clean layout
Sub SetClean As WixLayout
	SetType("clean")
	Return Me
End Sub

'make line layout
Sub SetLine As WixLayout
	SetType("line")
	Return Me
End Sub

'make wide layout
Sub SetWide As WixLayout
	SetType("wide")
	Return Me
End Sub

'make space layout
Sub SetSpace As WixLayout
	SetType("space")
	Return Me
End Sub

'make a head layout
Sub SetHead As WixLayout
	SetType("head")
	Return Me
End Sub

'make form layout
Sub SetForm As WixLayout
	SetType("form")
	Return Me
End Sub

'set type Of
Sub SetType(typeof As String) As WixLayout
	Layout.TypeOf = typeof
	Return Me	
End Sub

'return the item
Sub Item As Map
	Return Layout.item
End Sub

'set the template
Sub SetTemplate(t As String) As WixLayout
	Layout.Template = t
	Return Me
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'add to toolbar
Sub AddToToolbar(tblB As WixToolBar)
	tblB.AddItem(Item)
End Sub

'add to row
Sub AddToRow(r As WixRow)
	r.AddItem(Item)
End Sub

'add to rows of parent
Sub AddToRows(prt As WixElement) As WixLayout
	prt.AddRows(Item)
	Return Me
End Sub

'add to columns of parent
Sub AddToColumns(prt As WixElement) As WixLayout
	prt.AddColumns(Item)
	Return Me
End Sub

'add to elements of parent
Sub AddToElements(prt As WixElement) As WixLayout
	prt.AddElements(Item)
	Return Me
End Sub