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
	Public Parent As WixElement
End Sub

'Initializes the date picker
Public Sub Initialize(bID As String) As WixColorPicker
	ID = bID.ToLowerCase
	ColorPicker.Initialize(ID).SetView("colorpicker")
	Return Me
End Sub

'set the parent
Sub SetParent(p As WixElement) As WixColorPicker
	Parent = p
	Return Me
End Sub


'return the item to add
Sub Item As Map
	Return ColorPicker.item
End Sub

'add tp columns of parent
Sub Pop
	Parent.AddColumns(Item)
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
	h.SetImportant(False)
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


Sub SetAlign(align As Object) As WixColorpicker
	Colorpicker.SetAttr("align", align)
	Return Me
End Sub

Sub SetAnimate(animate As Boolean) As WixColorpicker
	Colorpicker.SetAttr("animate", animate)
	Return Me
End Sub

Sub SetAttributes(attributes As Object) As WixColorpicker
	Colorpicker.SetAttr("attributes", attributes)
	Return Me
End Sub

Sub SetAutowidth(autowidth As Boolean) As WixColorpicker
	Colorpicker.SetAttr("autowidth", autowidth)
	Return Me
End Sub

Sub SetBorderless(borderless As Boolean) As WixColorpicker
	Colorpicker.SetAttr("borderless", borderless)
	Return Me
End Sub

Sub SetBottomLabel(bottomLabel As Object) As WixColorpicker
	Colorpicker.SetAttr("bottomLabel", bottomLabel)
	Return Me
End Sub

Sub SetBottomPadding(bottomPadding As Object) As WixColorPicker
	ColorPicker.SetAttr("bottomPadding", bottomPadding)
	Return Me
End Sub

Sub SetClick(click As Object) As WixColorPicker
	ColorPicker.SetAttr("click", click)
	Return Me
End Sub

Sub SetContainer(container As Object) As WixColorPicker
	ColorPicker.SetAttr("container", container)
	Return Me
End Sub

Sub SetCss(css As Object) As WixColorPicker
	ColorPicker.SetAttr("css", css)
	Return Me
End Sub

Sub SetEditable(editable As Boolean) As WixColorPicker
ColorPicker.SetAttr("editable", editable)
Return Me
End Sub

Sub SetFormat(format As Object) As WixColorPicker
ColorPicker.SetAttr("format", format)
Return Me
End Sub

Sub SetGravity(gravity As Object) As WixColorPicker
ColorPicker.SetAttr("gravity", gravity)
Return Me
End Sub

Sub SetHeight(height As Object) As WixColorPicker
ColorPicker.SetAttr("height", height)
Return Me
End Sub

Sub SetHidden(hidden As Boolean) As WixColorPicker
ColorPicker.SetAttr("hidden", hidden)
Return Me
End Sub

Sub SetHotkey(hotkey As Object) As WixColorpicker
Colorpicker.SetAttr("hotkey", hotkey)
Return Me
End Sub

Sub SetIcons(icons As Boolean) As WixColorpicker
Colorpicker.SetAttr("icons", icons)
Return Me
End Sub

Sub SetInputAlign(inputAlign As Object) As WixColorPicker
ColorPicker.SetAttr("inputAlign", inputAlign)
Return Me
End Sub

Sub SetInputHeight(inputHeight As Object) As WixColorPicker
ColorPicker.SetAttr("inputHeight", inputHeight)
Return Me
End Sub

Sub SetInputWidth(inputWidth As Object) As WixColorPicker
ColorPicker.SetAttr("inputWidth", inputWidth)
Return Me
End Sub

Sub SetInvalid(invalid As Object) As WixColorPicker
ColorPicker.SetAttr("invalid", invalid)
Return Me
End Sub

Sub SetMaxHeight(maxHeight As Object) As WixColorPicker
ColorPicker.SetAttr("maxHeight", maxHeight)
Return Me
End Sub

Sub SetMaxWidth(maxWidth As Object) As WixColorPicker
ColorPicker.SetAttr("maxWidth", maxWidth)
Return Me
End Sub


Sub SetPlaceholder(placeholder As Object) As WixColorPicker
ColorPicker.SetAttr("placeholder", placeholder)
Return Me
End Sub

Sub SetPoint(point As Boolean) As WixColorPicker
ColorPicker.SetAttr("point", point)
Return Me
End Sub

Sub SetPopup(popup As Object) As WixColorPicker
ColorPicker.SetAttr("popup", popup)
Return Me
End Sub

Sub SetRelatedAction(relatedAction As Object) As WixColorPicker
ColorPicker.SetAttr("relatedAction", relatedAction)
Return Me
End Sub

Sub SetRelatedView(relatedView As Object) As WixColorPicker
ColorPicker.SetAttr("relatedView", relatedView)
Return Me
End Sub

Sub SetStringResult(stringResult As Object) As WixColorPicker
ColorPicker.SetAttr("stringResult", stringResult)
Return Me
End Sub

Sub SetSuggest(suggest As Object) As WixColorPicker
ColorPicker.SetAttr("suggest", suggest)
Return Me
End Sub

