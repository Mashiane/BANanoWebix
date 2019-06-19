B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Radio As WixElement
	Private Options As List
	Private Vertical As Boolean
End Sub

'initialize the input box
Public Sub Initialize(iID As String) As WixRadio
	ID = iID.tolowercase
	Radio.Initialize(iID).SetView("radio")
	Options.Initialize 
	Vertical = False
	Return Me
End Sub


'set tooltip
Sub SetTooltip(tt As String) As WixRadio
	Radio.SetTooltip(tt)
	Return Me
End Sub

'return the item
Sub Item As Map
	Radio.SetAttr("options", Options)
	Radio.SetAttr("vertical", Vertical)
	Return Radio.item
End Sub

'set style
Sub SetStyle(prop As String, val As String) As WixRadio
	Radio.SetStyle(prop,val)
	Return Me
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'set options
Sub SetOptions(opt As List) As WixRadio
	Options = opt
	Return Me
End Sub

'add an option
Sub AddOption(sID As String, sValue As String) As WixRadio
	Dim sug As Map = CreateMap()
	sug.Put("id", sID)
	sug.Put("value", sValue)
	Options.Add(sug)
	Return Me
End Sub

'set value
Sub SetValue(v As String) As WixRadio
	Radio.Value = v
	Return Me
End Sub

'set label
Sub SetLabel(l As String) As WixRadio
	Radio.Label.Text = l
	Return Me
End Sub

'set vertical
Sub SetVertical(b As Boolean) As WixRadio
	Vertical = b
	Return Me
End Sub


'set label align
Sub SetLabelAlign(a As String) As WixRadio
	Radio.Label.Align = a
	Return Me
End Sub

'set label position
Sub SetLabelPosition(p As String) As WixRadio
	Radio.Label.Position = p
	Return Me
End Sub

'set label width
Sub SetLabelWidth(w As Int) As WixRadio
	Radio.Label.Width = w
	Return Me
End Sub


'set align right
Sub SetAlignRight(r As String) As WixRadio 'ignore
	Radio.setAlignright("")
	Return Me
End Sub

'set align center
Sub SetAlignCenter(r As String) As WixRadio 'ignore
	Radio.setAligncenter("")
	Return Me
End Sub

'set align left
Sub SetAlignLeft(r As String) As WixRadio 'ignore
	Radio.SetAlignleft("")
	Return Me
End Sub