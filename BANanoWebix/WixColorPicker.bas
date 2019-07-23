B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public ColorPicker As WixElement
End Sub

'Initializes the date picker
Public Sub Initialize(bID As String) As WixColorPicker
	ID = bID.ToLowerCase
	ColorPicker.Initialize(ID).SetView("colorpicker")
	Return Me
End Sub

'return the item to add
Sub Item As Map
	Return ColorPicker.item
End Sub


Sub SetValidateEvent(e As Object) As WixColorPicker    'ignore
	ColorPicker.SetAttr("validateEvent", e)
	Return Me
End Sub

Sub SetValidateEventBlur(b As Boolean) As WixColorPicker    'ignore
	ColorPicker.SetAttr("validateEvent", "blur")
	Return Me
End Sub

Sub SetValidateEventKey(b As Boolean) As WixColorPicker     'ignore
	ColorPicker.SetAttr("validateEvent", "key")
	Return Me
End Sub

'set validate
Sub SetValidateIsNotEmpty(b As Boolean) As WixColorPicker   'ignore
	ColorPicker.SetAttr("validate","isNotEmpty")
	Return Me
End Sub


'set validate
Sub SetValidate(v As Object) As WixColorPicker   'ignore
	ColorPicker.SetAttr("validate",v)
	Return Me
End Sub


'set invalid message
Sub SetInvalidMessage(msg As String) As WixColorPicker
	ColorPicker.SetAttr("invalidMessage", msg)
	Return Me
End Sub


'set required
Sub SetRequired(b As Boolean) As WixColorPicker
	ColorPicker.SetAttr("required", b)
	Return Me
End Sub

'set readonly
Sub SetReadOnly(b As Boolean) As WixColorPicker
	ColorPicker.SetAttr("readonly",b)
	Return Me
End Sub

'set disabled
Sub SetDisabled(b As Boolean) As WixColorPicker
	ColorPicker.setattr("disabled",b)
	Return Me
End Sub

Sub SetTemplateHTML(h As UOENowHTML) As WixColorPicker
	Dim os As String = h.HTML
	ColorPicker.SetTemplate(os)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixColorPicker
	ColorPicker.SetResponsive(b)
	Return Me
End Sub


'set name
Sub SetName(n As String) As WixColorPicker
	ColorPicker.SetName(n)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixColorPicker
	ColorPicker.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixColorPicker
	ColorPicker.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixColorPicker
	ColorPicker.SetMinHeight(h)
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixColorPicker
	ColorPicker.SetTooltip(tt)
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixColorPicker
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		ColorPicker.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'set style
Sub SetStyle(prop As String, val As String) As WixColorPicker
	ColorPicker.SetStyle(prop,val)
	Return Me
End Sub


'set value
Sub SetValue(v As String) As WixColorPicker
	ColorPicker.SetValue(v)
	Return Me
End Sub

'set label
Sub SetLabel(l As String) As WixColorPicker
	ColorPicker.SetLabel(l)
	Return Me
End Sub

'set width
Sub SetWidth(w As Object) As WixColorPicker
	ColorPicker.SetWidth(w)
	Return Me
End Sub

'set label align
Sub SetLabelAlign(a As String) As WixColorPicker
	ColorPicker.SetLabelAlign(a)
	Return Me
End Sub

'set label position
Sub SetLabelPosition(p As String) As WixColorPicker
	ColorPicker.SetLabelPosition(p)
	Return Me
End Sub

'set label width
Sub SetLabelWidth(w As Int) As WixColorPicker
	ColorPicker.SetLabelWidth(w)
	Return Me
End Sub


'set align right
Sub SetAlignRight(r As String) As WixColorPicker 'ignore
	ColorPicker.setAlignright("")
	Return Me
End Sub

'set align center
Sub SetAlignCenter(r As String) As WixColorPicker 'ignore
	ColorPicker.setAligncenter("")
	Return Me
End Sub

'set align left
Sub SetAlignLeft(r As String) As WixColorPicker 'ignore
	ColorPicker.SetAlignleft("")
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