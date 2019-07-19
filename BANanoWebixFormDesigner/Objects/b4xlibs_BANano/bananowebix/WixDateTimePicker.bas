B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public DateTimePicker As WixElement
End Sub

'Initializes the date picker
Public Sub Initialize(bID As String) As WixDateTimePicker
	ID = bID.ToLowerCase
	DateTimePicker.Initialize(ID).SetView("datepicker")
	Return Me
End Sub

'set time only
Sub SetTypeTime(b As Boolean) As WixDateTimePicker   'ignore
	DateTimePicker.SetAttr("type", "time")
	Return Me
End Sub


Sub SetPlaceHolder(b As Object) As WixDateTimePicker
	DateTimePicker.SetPlaceHolder(b)
	Return Me
End Sub

Sub SetMultiselect(b As Object) As WixDateTimePicker
	DateTimePicker.SetAttr("multiselect",b)
	Return Me
End Sub

'set time only
Sub SetTypeMonth(b As Boolean) As WixDateTimePicker   'ignore
	DateTimePicker.SetAttr("type", "month")
	Return Me
End Sub


'set time only
Sub SetTypeYear(b As Boolean) As WixDateTimePicker   'ignore
	DateTimePicker.SetAttr("type", "year")
	Return Me
End Sub


'set time only
Sub SetType(b As Object) As WixDateTimePicker   'ignore
	DateTimePicker.SetAttr("type", b)
	Return Me
End Sub


'set string result
Sub SetStringResult(b As Boolean) As WixDateTimePicker
	DateTimePicker.SetAttr("stringResult", b)
	Return Me
End Sub


Sub SetTemplateHTML(h As UOENowHTML) As WixDateTimePicker
	Dim os As String = h.HTML
	DateTimePicker.SetTemplate(os)
	Return Me
End Sub

'set name
Sub SetName(n As String) As WixDateTimePicker
	DateTimePicker.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixDateTimePicker
	DateTimePicker.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixDateTimePicker
	DateTimePicker.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixDateTimePicker
	DateTimePicker.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixDateTimePicker
	DateTimePicker.SetMinHeight(h)
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixDateTimePicker
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		DateTimePicker.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


'editable
Sub SetEditable(b As Boolean) As WixDateTimePicker
	DateTimePicker.SetAttr("editable", b)
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixDateTimePicker
	DateTimePicker.SetTooltip(tt)
	Return Me
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'set style
Sub SetStyle(prop As String, val As String) As WixDateTimePicker
	DateTimePicker.SetStyle(prop,val)
	Return Me
End Sub


'return the item to add
Sub Item As Map
	Return DateTimePicker.item
End Sub

'set value
Sub SetValue(v As String) As WixDateTimePicker
	DateTimePicker.SetValue(v)
	Return Me
End Sub

'set label
Sub SetLabel(l As String) As WixDateTimePicker
	DateTimePicker.SetLabel(l)
	Return Me
End Sub

'set format
Sub SetFormat(f As Object) As WixDateTimePicker
	DateTimePicker.SetAttr("format", f)
	Return Me
End Sub

'set time picker
Sub SetTimePicker(t As Boolean) As WixDateTimePicker
	DateTimePicker.SetAttr("timepicker", t)
	Return Me
End Sub

'set width
Sub SetWidth(w As Object) As WixDateTimePicker
	DateTimePicker.SetWidth(w)
	Return Me
End Sub


'set label align
Sub SetLabelAlign(a As String) As WixDateTimePicker
	DateTimePicker.SetLabelAlign(a)
	Return Me
End Sub

'set label position
Sub SetLabelPosition(p As String) As WixDateTimePicker
	DateTimePicker.SetLabelPosition(p)
	Return Me
End Sub

'set label width
Sub SetLabelWidth(w As Int) As WixDateTimePicker
	DateTimePicker.SetLabelWidth(w)
	Return Me
End Sub


'set align right
Sub SetAlignRight(r As String) As WixDateTimePicker 'ignore
	DateTimePicker.setAlignright("")
	Return Me
End Sub

'set align center
Sub SetAlignCenter(r As String) As WixDateTimePicker 'ignore
	DateTimePicker.setAligncenter("")
	Return Me
End Sub

'set align left
Sub SetAlignLeft(r As String) As WixDateTimePicker 'ignore
	DateTimePicker.SetAlignleft("")
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