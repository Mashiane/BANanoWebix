B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Section As WixElement
End Sub

'initialize the input box
Public Sub Initialize(iID As String) As WixSection
	ID = iID.tolowercase
	Section.Initialize(iID)
	Section.TypeOf = "section"
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixSection
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		Section.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


'set tooltip
Sub SetTooltip(tt As String) As WixSection
	Section.SetTooltip(tt)
	Return Me
End Sub

'return the item
Sub Item As Map
	Return Section.item
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'add to toolbar
Sub AddToToolbar(tblB As WixToolBar)
	tblB.Toolbar.AddItem(Item)
End Sub
