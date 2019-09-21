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
	Public Parent As WixElement
	Private Banano As BANano
End Sub

'initialize the input box
Public Sub Initialize(iID As String) As WixSlider
	ID = iID.tolowercase
	Slider.Initialize(iID).SetView("slider")
	Minimum = 0
	Maximum = 100
	Slider.SetValue(10)
	Stepper = 1
	Slider.SetAttr("title", "#value#")
	Parent = Null
	Return Me
End Sub

'set padding
Sub SetPadding(padding As Object) As WixSlider
	Slider.SetPadding(padding)
	Return Me
End Sub

'set padding
Sub SetMargin(margin As Object) As WixSlider
	Slider.SetMargin(margin)
	Return Me
End Sub

Sub SetAttributes(m As Map) As WixSlider
	For Each k As String In m.Keys
		Dim v As String = m.Get(k)
		Slider.SetAttr(k,v)
	Next
	Return Me
End Sub

Sub SetStyles(m As Map) As WixSlider
	For Each k As String In m.Keys
		Dim v As String = m.Get(k)
		Slider.SetStyle(k,v)
	Next
	Return Me
End Sub

'set css
Sub SetStyle(prop As String, sval As String) As WixSlider
	Slider.SetStyle(prop,sval)
	Return Me
End Sub


'set the parent
Sub SetParent(p As WixElement) As WixSlider
	Parent = p
	Return Me
End Sub


'add tp columns of parent
Sub Pop
	Parent.AddColumns(Item)
End Sub

'use a map object
Sub SetMap(m As Map) As WixSlider
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		Slider.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


Sub SetTemplateHTML(h As UOENowHTML) As WixSlider
	h.SetImportant(False)
	Dim os As String = h.HTML
	Slider.SetTemplate(os)
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
	Slider.SetValue(v)
	Return Me
End Sub

'set label
Sub SetLabel(l As String) As WixSlider
	Slider.SetLabel(l)
	Return Me
End Sub

'set required
Sub SetRequired(b As Boolean) As WixSlider
	Slider.SetRequired(b)
	Return Me
End Sub

'set label align
Sub SetLabelAlign(a As String) As WixSlider
	Slider.SetLabelAlign(a)
	Return Me
End Sub

'set label position
Sub SetLabelPosition(p As String) As WixSlider
	Slider.SetLabelPosition(p)
	Return Me
End Sub

'set label width
Sub SetLabelWidth(w As Int) As WixSlider
	Slider.SetLabelWidth(w)
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

Sub SetAlign(align As Object) As WixSlider
	Slider.SetAttr("align", align)
	Return Me
End Sub

Sub SetAnimate(animate As Boolean) As WixSlider
	Slider.SetAttr("animate", animate)
	Return Me
End Sub

Sub SetBorderless(borderless As Boolean) As WixSlider
	Slider.SetAttr("borderless", borderless)
	Return Me
End Sub

Sub SetBottomLabel(bottomLabel As Object) As WixSlider
	Slider.SetAttr("bottomLabel", bottomLabel)
	Return Me
End Sub

Sub SetBottomPadding(bottomPadding As Object) As WixSlider
	Slider.SetAttr("bottomPadding", bottomPadding)
	Return Me
End Sub

Sub SetClick(click As Object) As WixSlider
	Slider.SetAttr("click", click)
	Return Me
End Sub

Sub SetOnClick(module As Object, methodName As String) As WixSlider
	Dim e As BANanoEvent
	Dim cb As BANanoObject = Banano.CallBack(module, methodName, Array(e))
	Slider.SetClick(cb)
	Return Me
End Sub

Sub SetContainer(container As Object) As WixSlider
	Slider.SetAttr("container", container)
	Return Me
End Sub

Sub SetCss(css As Object) As WixSlider
	Slider.SetAttr("css", css)
	Return Me
End Sub

Sub SetDisabled(disabled As Boolean) As WixSlider
	Slider.SetAttr("disabled", disabled)
	Return Me
End Sub

Sub SetFormat(format As Object) As WixSlider
	Slider.SetAttr("format", format)
	Return Me
End Sub

Sub SetGravity(gravity As Object) As WixSlider
	Slider.SetAttr("gravity", gravity)
	Return Me
End Sub

Sub SetHeight(height As Object) As WixSlider
	Slider.SetAttr("height", height)
	Return Me
End Sub

Sub SetHidden(hidden As Boolean) As WixSlider
	Slider.SetAttr("hidden", hidden)
	Return Me
End Sub

Sub SetHotkey(hotkey As Object) As WixSlider
	Slider.SetAttr("hotkey", hotkey)
	Return Me
End Sub

Sub SetInputAlign(inputAlign As Object) As WixSlider
	Slider.SetAttr("inputAlign", inputAlign)
	Return Me
End Sub

Sub SetInputHeight(inputHeight As Object) As WixSlider
	Slider.SetAttr("inputHeight", inputHeight)
	Return Me
End Sub

Sub SetInputWidth(inputWidth As Object) As WixSlider
	Slider.SetAttr("inputWidth", inputWidth)
	Return Me
End Sub

Sub SetInvalid(invalid As Object) As WixSlider
	Slider.SetAttr("invalid", invalid)
	Return Me
End Sub

Sub SetInvalidMessage(invalidMessage As Object) As WixSlider
	Slider.SetAttr("invalidMessage", invalidMessage)
	Return Me
End Sub

Sub SetMaxHeight(maxHeight As Object) As WixSlider
Slider.SetAttr("maxHeight", maxHeight)
Return Me
End Sub

Sub SetMaxWidth(maxWidth As Object) As WixSlider
Slider.SetAttr("maxWidth", maxWidth)
Return Me
End Sub

Sub SetPlaceholder(placeholder As Object) As WixSlider
Slider.SetAttr("placeholder", placeholder)
Return Me
End Sub

Sub SetPopup(popup As Object) As WixSlider
Slider.SetAttr("popup", popup)
Return Me
End Sub

Sub SetReadonly(readonly As Boolean) As WixSlider
Slider.SetAttr("readonly", readonly)
Return Me
End Sub

Sub SetRelatedAction(relatedAction As Object) As WixSlider
Slider.SetAttr("relatedAction", relatedAction)
Return Me
End Sub

Sub SetRelatedView(relatedView As Object) As WixSlider
Slider.SetAttr("relatedView", relatedView)
Return Me
End Sub

Sub SetSuggest(suggest As Object) As WixSlider
Slider.SetAttr("suggest", suggest)
Return Me
End Sub

Sub SetTitle(title As Object) As WixSlider
Slider.SetAttr("title", title)
Return Me
End Sub

Sub SetType(sType As Object) As WixSlider
Slider.SetAttr("type", sType)
Return Me
End Sub

Sub SetValidate(validate As Object) As WixSlider
Slider.SetAttr("validate", validate)
Return Me
End Sub

Sub SetValidateEvent(validateEvent As Object) As WixSlider
Slider.SetAttr("validateEvent", validateEvent)
Return Me
End Sub

Sub SetWidth(width As Object) As WixSlider
Slider.SetAttr("width", width)
Return Me
End Sub