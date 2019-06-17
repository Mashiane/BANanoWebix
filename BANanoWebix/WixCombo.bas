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
	Private onChange As BANanoObject
	Private Dollar As BANanoObject
End Sub

'initialize the input box
Public Sub Initialize(pg As WixPage, iID As String) As WixCombo
	Dollar = pg.dollar
	ID = iID.tolowercase
	Combo.Initialize(iID).SetView("combo")
	Options.Initialize
	yCount = 0
	onChange = Null
	Return Me
End Sub

'attach events after page is created
Sub AttachOnChangeEvent()
	Dollar.Selector(ID).RunMethod("attachEvent",Array("onChange",onChange))
End Sub

'set on change event
Sub SetOnChange(s As BANanoObject) As WixCombo
	onChange = s
	Return Me
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'set options
Sub SetOptions(o As List) As WixCombo
	Options = o
	Return Me	
End Sub

'set template
Sub SetTemplate(t As String) As WixCombo
	Combo.Template = t
	Return Me	
End Sub

'return the item
Sub Item As Map
	Dim opt As Map = CreateMap()
	If Combo.Template <> "" Then 
		opt.Put("template", Combo.Template)
		Combo.Template = ""
	End If
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

'set the item option life
Sub SetSelected(value As String)
	Dollar.Selector(ID).RunMethod("setValue",Array(value))
End Sub

'get an item value
Sub GetSelected() As String
	Dim res As String
	res = Dollar.Selector(ID).RunMethod("getValue",Null).result
	Return res
End Sub

