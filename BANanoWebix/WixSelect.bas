B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public DropDown As WixElement
	Private Options As List
End Sub

'initialize the input box
Public Sub Initialize(iID As String) As WixSelect
	ID = iID.tolowercase
	DropDown.Initialize(iID).SetView("select")
	Options.Initialize
	Return Me
End Sub

'set style
Sub SetStyle(prop As String, val As String) As WixSelect
	DropDown.SetStyle(prop,val)
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixSelect
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		DropDown.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


'set tooltip
Sub SetTooltip(tt As String) As WixSelect
	DropDown.SetTooltip(tt)
	Return Me
End Sub


'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'set options
Sub SetOptions(o As List) As WixSelect
	Options = o
	Return Me
End Sub

'return the item
Sub Item As Map
	DropDown.SetAttr("options", Options)
	Return DropDown.item
End Sub

'add initialization options
Sub AddOption(optID As String, optValue As String) As WixSelect
	Options.Add(CreateMap("id":optID,"value":optValue))
	Return Me
End Sub

'set value
Sub SetValue(v As String) As WixSelect
	DropDown.Value = v
	Return Me
End Sub

'set label
Sub SetLabel(l As String) As WixSelect
	DropDown.Label.Text = l
	Return Me
End Sub

'set required
Sub SetRequired(b As Boolean) As WixSelect
	DropDown.SetRequired(b)
	Return Me
End Sub

'set label align
Sub SetLabelAlign(a As String) As WixSelect
	DropDown.Label.Align = a
	Return Me
End Sub

'set label position
Sub SetLabelPosition(p As String) As WixSelect
	DropDown.Label.Position = p
	Return Me
End Sub

'set label width
Sub SetLabelWidth(w As Int) As WixSelect
	DropDown.Label.Width = w
	Return Me
End Sub

'set align right
Sub SetAlignRight(r As String) As WixSelect 'ignore
	DropDown.setAlignright("")
	Return Me
End Sub

'set align center
Sub SetAlignCenter(r As String) As WixSelect 'ignore
	DropDown.setAligncenter("")
	Return Me
End Sub

'set align left
Sub SetAlignLeft(r As String) As WixSelect 'ignore
	DropDown.SetAlignleft("")
	Return Me
End Sub