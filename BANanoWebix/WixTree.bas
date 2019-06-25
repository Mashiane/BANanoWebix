B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Tree As WixElement
End Sub

'Initializes the Tree sheet
Public Sub Initialize(eID As String) As WixTree
	ID = eID.tolowercase
	Tree.Initialize(ID).SetView("tree")
	Return Me
End Sub

'return the item
Sub Item As Map
	Return Tree.item
End Sub

'set borderless
Sub SetBorderLess(b As Boolean) As WixTree
	Tree.SetBorderLess(b)
	Return Me
End Sub

'set selectable
Sub SetSelect(b As Boolean) As WixTree
	Tree.SetSelect(b)
	Return Me
End Sub

'set the data
Sub SetData(data As List) As WixTree
	Tree.SetData(data)
	Return Me
End Sub

'set style
Sub SetStyle(prop As String, val As String) As WixTree
	Tree.SetStyle(prop,val)
	Return Me
End Sub

'set template
Sub SetTemplate(t As Object) As WixTree
	Tree.SetTemplate(t)
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixTree
	Tree.SetTooltip(tt)
	Return Me
End Sub

'set height
Sub SetHeight(h As Int) As WixTree
	Tree.SetHeight(h)
	Return Me
End Sub

'set width
Sub SetWidth(h As Int) As WixTree
	Tree.SetWidth(h)
	Return Me
End Sub
