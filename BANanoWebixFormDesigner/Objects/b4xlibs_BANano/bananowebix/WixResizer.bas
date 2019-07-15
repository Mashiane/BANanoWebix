B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Resizer As WixElement
End Sub

'initialize the input box
Public Sub Initialize(iID As String) As WixResizer
	ID = iID.tolowercase
	Resizer.Initialize(iID).SetView("resizer")
	Return Me
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub


Sub SetTemplateHTML(h As UOENowHTML) As WixResizer
	Dim os As String = h.HTML
	Resizer.SetTemplate(os)
	Return Me
End Sub

'return the item
Sub Item As Map
	Return Resizer.item
End Sub

'add as a column iten
Sub AddToColumns(parent As WixElement)
	parent.AddColumns(Item)
End Sub

'use a map object
Sub SetMap(m As Map) As WixResizer
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		Resizer.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


'add to parent rows
Sub AddToRows(P As WixElement)
	P.AddRows(Item)
End Sub

'add to parent elements
Sub AddToElements(P As WixElement)
	P.AddElements(Item)
End Sub