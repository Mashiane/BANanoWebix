B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Slider As WixElement
	Private Minimum As Int
	Private Maximum As Int
	Private Stepper As Int
End Sub

'initialize the input box
Public Sub Initialize(iID As String) As WixSlider
	ID = iID.tolowercase
	Slider.Initialize(iID).SetView("slider")
	Minimum = 0
	Maximum = 100
	Slider.Value = 10
	Stepper = 1
	Slider.SetAttr("title", "#value#")
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixSlider
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		Slider.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


'set name
Sub SetName(n As String) As WixSlider
	Slider.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixSlider
	Slider.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixSlider
	Slider.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixSlider
	Slider.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixSlider
	Slider.SetMinHeight(h)
	Return Me
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'set move title
Sub SetMoveTitle(b As Boolean) As WixSlider
	Slider.SetAttr("moveTitle", b)
	Return Me
End Sub

'set sertical
Sub SetVertical(b As Boolean) As WixSlider
	Slider.SetAttr("vertical", b)
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixSlider
	Slider.SetTooltip(tt)
	Return Me
End Sub

'set style
Sub SetStyle(prop As String, val As String) As WixSlider
	Slider.SetStyle(prop,val)
	Return Me
End Sub

'return the item
Sub Item As Map
	Slider.SetAttr("min",Minimum)
	Slider.SetAttr("max",Maximum)
	Slider.SetAttr("step", Stepper)
	Return Slider.item
End Sub

'set max
Sub SetMax(m As Int) As WixSlider
	Maximum = m
	Return Me
End Sub

'set min
Sub SetMin(m As Int) As WixSlider
	Minimum = m
	Return Me
End Sub

'set stepper
Sub SetStep(s As Int) As WixSlider
	Stepper = s
	Return Me
End Sub

'set value
Sub SetValue(v As String) As WixSlider
	Slider.Value = v
	Return Me
End Sub

'set label
Sub SetLabel(l As String) As WixSlider
	Slider.Label.Text = l
	Return Me
End Sub

'set required
Sub SetRequired(b As Boolean) As WixSlider
	Slider.SetRequired(b)
	Return Me
End Sub

'set label align
Sub SetLabelAlign(a As String) As WixSlider
	Slider.Label.Align = a
	Return Me
End Sub

'set label position
Sub SetLabelPosition(p As String) As WixSlider
	Slider.Label.Position = p
	Return Me
End Sub

'set label width
Sub SetLabelWidth(w As Int) As WixSlider
	Slider.Label.Width = w
	Return Me
End Sub

'set align right
Sub SetAlignRight(r As String) As WixSlider 'ignore
	Slider.setAlignright("")
	Return Me
End Sub

'set align center
Sub SetAlignCenter(r As String) As WixSlider 'ignore
	Slider.setAligncenter("")
	Return Me
End Sub

'set align left
Sub SetAlignLeft(r As String) As WixSlider 'ignore
	Slider.SetAlignleft("")
	Return Me
End Sub


'add to parent rows
Sub AddToRows(P As WixElement)
	P.AddRows(Item)
End Sub

'add to parent columns
Sub AddToColumns(P As WixElement)
	P.AddColumns(Item)
End Sub

'add to parent elements
Sub AddToElements(P As WixElement)
	P.AddElements(Item)
End Sub