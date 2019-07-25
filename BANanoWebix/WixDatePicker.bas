B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public DatePicker As WixElement
End Sub

'Initializes the date picker
Public Sub Initialize(bID As String) As WixDatePicker
	ID = bID.ToLowerCase
	DatePicker.Initialize(ID).SetView("datepicker")
	Return Me
End Sub

'set time only
Sub SetTypeTime(b As Boolean) As WixDatePicker   'ignore
	DatePicker.SetAttr("type", "time")
	Return Me
End Sub


Sub SetValidateEvent(e As Object) As WixDatePicker    'ignore
	DatePicker.SetAttr("validateEvent", e)
	Return Me
End Sub

Sub SetValidateEventBlur(b As Boolean) As WixDatePicker    'ignore
	DatePicker.SetAttr("validateEvent", "blur")
	Return Me
End Sub

Sub SetValidateEventKey(b As Boolean) As WixDatePicker     'ignore
	DatePicker.SetAttr("validateEvent", "key")
	Return Me
End Sub

'set validate
Sub SetValidateIsNotEmpty(b As Boolean) As WixDatePicker   'ignore
	DatePicker.SetAttr("validate","isNotEmpty")
	Return Me
End Sub


'set validate
Sub SetValidate(v As Object) As WixDatePicker   'ignore
	DatePicker.SetAttr("validate",v)
	Return Me
End Sub


'set invalid message
Sub SetInvalidMessage(msg As String) As WixDatePicker
	DatePicker.SetAttr("invalidMessage", msg)
	Return Me
End Sub


'set required
Sub SetRequired(b As Boolean) As WixDatePicker
	DatePicker.SetAttr("required", b)
	Return Me
End Sub


Sub SetPlaceHolder(b As Object) As WixDatePicker
	DatePicker.SetPlaceHolder(b)
	Return Me
End Sub

Sub SetMultiselect(b As Object) As WixDatePicker
	DatePicker.SetAttr("multiselect",b)
	Return Me
End Sub

'set time only
Sub SetTypeMonth(b As Boolean) As WixDatePicker   'ignore
	DatePicker.SetAttr("type", "month")
	Return Me
End Sub


'set time only
Sub SetTypeYear(b As Boolean) As WixDatePicker   'ignore
	DatePicker.SetAttr("type", "year")
	Return Me
End Sub


'set time only
Sub SetType(b As Object) As WixDatePicker   'ignore
	DatePicker.SetAttr("type", b)
	Return Me
End Sub


'set string result
Sub SetStringResult(b As Boolean) As WixDatePicker
	DatePicker.SetAttr("stringResult", b)
	Return Me
End Sub


Sub SetTemplateHTML(h As UOENowHTML) As WixDatePicker
	Dim os As String = h.HTML
	DatePicker.SetTemplate(os)
	Return Me
End Sub

'set name
Sub SetName(n As String) As WixDatePicker
	DatePicker.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixDatePicker
	DatePicker.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixDatePicker
	DatePicker.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixDatePicker
	DatePicker.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixDatePicker
	DatePicker.SetMinHeight(h)
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixDatePicker
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		DatePicker.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


'editable
Sub SetEditable(b As Boolean) As WixDatePicker
	DatePicker.SetAttr("editable", b)
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixDatePicker
	DatePicker.SetTooltip(tt)
	Return Me
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'set style
Sub SetStyle(prop As String, val As String) As WixDatePicker
	DatePicker.SetStyle(prop,val)
	Return Me
End Sub


'return the item to add
Sub Item As Map
	Return DatePicker.item
End Sub

'set value
Sub SetValue(v As String) As WixDatePicker
	DatePicker.SetValue(v)
	Return Me
End Sub

'set label
Sub SetLabel(l As String) As WixDatePicker
	DatePicker.SetLabel(l)
	Return Me
End Sub

'set format
Sub SetFormat(f As Object) As WixDatePicker
	DatePicker.SetAttr("format", f)
	Return Me
End Sub

'set time picker
Sub SetTimePicker(t As Boolean) As WixDatePicker
	DatePicker.SetAttr("timepicker", t)
	Return Me
End Sub

'set width
Sub SetWidth(w As Object) As WixDatePicker
	DatePicker.SetWidth(w)
	Return Me
End Sub


'set label align
Sub SetLabelAlign(a As String) As WixDatePicker
	DatePicker.SetLabelAlign(a)
	Return Me
End Sub

'set label position
Sub SetLabelPosition(p As String) As WixDatePicker
	DatePicker.SetLabelPosition(p)
	Return Me
End Sub

'set label width
Sub SetLabelWidth(w As Int) As WixDatePicker
	DatePicker.SetLabelWidth(w)
	Return Me
End Sub


'set align right
Sub SetAlignRight(r As String) As WixDatePicker 'ignore
	DatePicker.setAlignright("")
	Return Me
End Sub

'set align center
Sub SetAlignCenter(r As String) As WixDatePicker 'ignore
	DatePicker.setAligncenter("")
	Return Me
End Sub

'set align left
Sub SetAlignLeft(r As String) As WixDatePicker 'ignore
	DatePicker.SetAlignleft("")
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


Sub SetAlign(align As Object) As WixDatePicker
	DatePicker.SetAttr("align", align)
	Return Me
End Sub

Sub SetAnimate(animate As Boolean) As WixDatePicker
	DatePicker.SetAttr("animate", animate)
	Return Me
End Sub

Sub SetAttributes(attributes As Object) As WixDatePicker
	DatePicker.SetAttr("attributes", attributes)
	Return Me
End Sub

Sub SetBorderless(borderless As Boolean) As WixDatePicker
	DatePicker.SetAttr("borderless", borderless)
	Return Me
End Sub

Sub SetBottomLabel(bottomLabel As Object) As WixDatePicker
	DatePicker.SetAttr("bottomLabel", bottomLabel)
	Return Me
End Sub

Sub SetBottomPadding(bottomPadding As Object) As WixDatePicker
	DatePicker.SetAttr("bottomPadding", bottomPadding)
	Return Me
End Sub

Sub SetClick(click As Object) As WixDatePicker
	DatePicker.SetAttr("click", click)
	Return Me
End Sub

Sub SetContainer(container As Object) As WixDatePicker
	DatePicker.SetAttr("container", container)
	Return Me
End Sub

Sub SetCss(css As Object) As WixDatePicker
	DatePicker.SetAttr("css", css)
	Return Me
End Sub

Sub SetDisabled(disabled As Boolean) As WixDatePicker
	DatePicker.SetAttr("disabled", disabled)
	Return Me
End Sub

Sub SetGravity(gravity As Object) As WixDatePicker
DatePicker.SetAttr("gravity", gravity)
Return Me
End Sub

Sub SetHeight(height As Object) As WixDatePicker
DatePicker.SetAttr("height", height)
Return Me
End Sub

Sub SetHidden(hidden As Boolean) As WixDatePicker
DatePicker.SetAttr("hidden", hidden)
Return Me
End Sub

Sub SetHotkey(hotkey As Object) As WixDatePicker
DatePicker.SetAttr("hotkey", hotkey)
Return Me
End Sub

Sub SetIcon(icon As Object) As WixDatePicker
DatePicker.SetAttr("icon", icon)
Return Me
End Sub

Sub SetIcons(icons As Object) As WixDatePicker
DatePicker.SetAttr("icons", icons)
Return Me
End Sub

Sub SetInputAlign(inputAlign As Object) As WixDatePicker
DatePicker.SetAttr("inputAlign", inputAlign)
Return Me
End Sub

Sub SetInputHeight(inputHeight As Object) As WixDatePicker
DatePicker.SetAttr("inputHeight", inputHeight)
Return Me
End Sub

Sub SetInputWidth(inputWidth As Object) As WixDatePicker
DatePicker.SetAttr("inputWidth", inputWidth)
Return Me
End Sub

Sub SetInvalid(invalid As Object) As WixDatePicker
DatePicker.SetAttr("invalid", invalid)
Return Me
End Sub

Sub SetMaxHeight(maxHeight As Object) As WixDatePicker
DatePicker.SetAttr("maxHeight", maxHeight)
Return Me
End Sub

Sub SetMaxWidth(maxWidth As Object) As WixDatePicker
DatePicker.SetAttr("maxWidth", maxWidth)
Return Me
End Sub

Sub SetPoint(point As Boolean) As WixDatePicker
DatePicker.SetAttr("point", point)
Return Me
End Sub

Sub SetPopup(popup As Object) As WixDatePicker
DatePicker.SetAttr("popup", popup)
Return Me
End Sub

Sub SetReadonly(readonly As Boolean) As WixDatePicker
DatePicker.SetAttr("readonly", readonly)
Return Me
End Sub

Sub SetRelatedAction(relatedAction As Object) As WixDatePicker
DatePicker.SetAttr("relatedAction", relatedAction)
Return Me
End Sub

Sub SetRelatedView(relatedView As Object) As WixDatePicker
DatePicker.SetAttr("relatedView", relatedView)
Return Me
End Sub

Sub SetSeparator(separator As Object) As WixDatePicker
DatePicker.SetAttr("separator", separator)
Return Me
End Sub

Sub SetSuggest(suggest As Object) As WixDatePicker
DatePicker.SetAttr("suggest", suggest)
Return Me
End Sub

Sub SetTimeIcon(timeIcon As Object) As WixDatePicker
DatePicker.SetAttr("timeIcon", timeIcon)
Return Me
End Sub

