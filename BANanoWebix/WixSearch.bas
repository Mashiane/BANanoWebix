B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Search As WixElement
End Sub

'initialize the input box
Public Sub Initialize(iID As String) As WixSearch
	ID = iID.tolowercase
	Search.Initialize(iID).SetView("search")
	Return Me
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'use a map object
Sub SetMap(m As Map) As WixSearch
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		Search.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


'set tooltip
Sub SetTooltip(tt As String) As WixSearch
	Search.SetTooltip(tt)
	Return Me
End Sub

'set style
Sub SetStyle(prop As String, val As String) As WixSearch
	Search.SetStyle(prop,val)
	Return Me
End Sub


'return the item
Sub Item As Map
	Return Search.item
End Sub

'set value
Sub SetValue(v As String) As WixSearch
	Search.Value = v
	Return Me
End Sub

'set label
Sub SetLabel(l As String) As WixSearch
	Search.Label.Text = l
	Return Me
End Sub

'set required
Sub SetRequired(b As Boolean) As WixSearch
	Search.SetRequired(b)
	Return Me
End Sub

'set label align
Sub SetLabelAlign(a As String) As WixSearch
	Search.Label.Align = a
	Return Me
End Sub

'set label position
Sub SetLabelPosition(p As String) As WixSearch
	Search.Label.Position = p
	Return Me
End Sub

'set label width
Sub SetLabelWidth(w As Int) As WixSearch
	Search.Label.Width = w
	Return Me
End Sub

'set align right
Sub SetAlignRight(r As String) As WixSearch 'ignore
	Search.setAlignright("")
	Return Me
End Sub

'set align center
Sub SetAlignCenter(r As String) As WixSearch 'ignore
	Search.setAligncenter("")
	Return Me
End Sub

'set align left
Sub SetAlignLeft(r As String) As WixSearch 'ignore
	Search.SetAlignleft("")
	Return Me
End Sub