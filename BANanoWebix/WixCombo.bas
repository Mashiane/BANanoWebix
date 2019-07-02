B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Combo As WixElement
	Private Options As List
	Private yCount As Int
	Private opt As Map
End Sub

'initialize the input box
Public Sub Initialize(iID As String) As WixCombo
	ID = iID.tolowercase
	Combo.Initialize(iID).SetView("combo")
	Options.Initialize
	yCount = 0
	opt = CreateMap()
	Return Me
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixCombo
	Combo.SetTooltip(tt)
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixCombo
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		Combo.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


'set options
Sub SetOptions(o As List) As WixCombo
	Options = o
	Return Me	
End Sub

'set style
Sub SetStyle(prop As String, val As String) As WixCombo
	Combo.SetStyle(prop,val)
	Return Me
End Sub

'set template
Sub SetTemplate(t As String) As WixCombo
	opt.Put("template", t)
	Return Me	
End Sub

'return the item
Sub Item As Map
	opt.Put("data", Options)
	If yCount <> 0 Then opt.Put("yCount",yCount)
	Combo.SetAttr("options", opt)
	Return Combo.item
End Sub

'add initialization options
Sub AddOption(optID As String, optValue As String) As WixCombo
	Options.Add(CreateMap("id":optID,"value":optValue))
	Return Me
End Sub

'set yCount
Sub SetYCount(y As Int) As WixCombo
	yCount = y
	Return Me
End Sub

'set value
Sub SetValue(v As String) As WixCombo
	Combo.Value = v
	Return Me
End Sub

'set label
Sub SetLabel(l As String) As WixCombo
	Combo.Label.Text = l
	Return Me
End Sub

'set required
Sub SetRequired(b As Boolean) As WixCombo
	Combo.SetRequired(b)
	Return Me
End Sub

'set label align
Sub SetLabelAlign(a As String) As WixCombo
	Combo.Label.Align = a
	Return Me
End Sub

'set label position
Sub SetLabelPosition(p As String) As WixCombo
	Combo.Label.Position = p
	Return Me
End Sub

'set label width
Sub SetLabelWidth(w As Int) As WixCombo
	Combo.Label.Width = w
	Return Me
End Sub


'set align right
Sub SetAlignRight(r As String) As WixCombo 'ignore
	Combo.setAlignright("")
	Return Me
End Sub

'set align center
Sub SetAlignCenter(r As String) As WixCombo 'ignore
	Combo.setAligncenter("")
	Return Me
End Sub

'set align left
Sub SetAlignLeft(r As String) As WixCombo 'ignore
	Combo.SetAlignleft("")
	Return Me
End Sub