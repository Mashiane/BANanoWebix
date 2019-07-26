B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Counter As WixElement
	Private Minimum As Int
	Private Maximum As Int
	Private Stepper As Int
End Sub

'initialize the counter
Public Sub Initialize(iID As String) As WixCounter
	ID = iID.tolowercase
	Counter.Initialize(iID).SetView("counter")
	Minimum = 0
	Maximum = 100
	Counter.SetValue(10)
	Stepper = 1
	Return Me
End Sub


Sub SetTemplateHTML(h As UOENowHTML) As WixCounter
	h.SetImportant(False)
	Dim os As String = h.HTML
	Counter.SetTemplate(os)
	Return Me
End Sub

'set name
Sub SetName(n As String) As WixCounter
	Counter.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixCounter
	Counter.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixCounter
	Counter.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixCounter
	Counter.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixCounter
	Counter.SetMinHeight(h)
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixCounter
	Counter.SetTooltip(tt)
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixCounter
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		Counter.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'set style
Sub SetStyle(prop As String, val As String) As WixCounter
	Counter.SetStyle(prop,val)
	Return Me
End Sub


'return the item
Sub Item As Map
	Counter.SetAttr("min",Minimum)
	Counter.SetAttr("max",Maximum)
	Counter.SetAttr("step", Stepper)
	Return Counter.item
End Sub

'set value
Sub SetValue(v As String) As WixCounter
	Counter.SetValue(v)
	Return Me
End Sub

'set label
Sub SetLabel(l As String) As WixCounter
	Counter.SetLabel(l)
	Return Me
End Sub

'set max
Sub SetMax(m As Int) As WixCounter
	Maximum = m
	Return Me
End Sub

'set min
Sub SetMin(m As Int) As WixCounter
	Minimum = m
	Return Me
End Sub

'set stepper
Sub SetStep(s As Int) As WixCounter
	Stepper = s
	Return Me
End Sub

'set label align
Sub SetLabelAlign(a As String) As WixCounter
	Counter.SetLabelAlign(a)
	Return Me
End Sub

'set label position
Sub SetLabelPosition(p As String) As WixCounter
	Counter.SetLabelPosition(p)
	Return Me
End Sub

'set label width
Sub SetLabelWidth(w As Int) As WixCounter
	Counter.SetLabelWidth(w)
	Return Me
End Sub


'set align right
Sub SetAlignRight(r As String) As WixCounter 'ignore
	Counter.setAlignright("")
	Return Me
End Sub

'set align center
Sub SetAlignCenter(r As String) As WixCounter 'ignore
	Counter.setAligncenter("")
	Return Me
End Sub

'set align left
Sub SetAlignLeft(r As String) As WixCounter 'ignore
	Counter.SetAlignleft("")
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

Sub SetAlign(align As Object) As WixCounter
	Counter.SetAttr("align", align)
	Return Me
End Sub

Sub SetAnimate(animate As Boolean) As WixCounter
	Counter.SetAttr("animate", animate)
	Return Me
End Sub

Sub SetAttributes(attributes As Object) As WixCounter
	Counter.SetAttr("attributes", attributes)
	Return Me
End Sub

Sub SetBorderless(borderless As Boolean) As WixCounter
	Counter.SetAttr("borderless", borderless)
	Return Me
End Sub

Sub SetBottomLabel(bottomLabel As Object) As WixCounter
	Counter.SetAttr("bottomLabel", bottomLabel)
	Return Me
End Sub

Sub SetBottomPadding(bottomPadding As Object) As WixCounter
	Counter.SetAttr("bottomPadding", bottomPadding)
	Return Me
End Sub

Sub SetClick(click As Object) As WixCounter
	Counter.SetAttr("click", click)
	Return Me
End Sub

Sub SetContainer(container As Object) As WixCounter
	Counter.SetAttr("container", container)
	Return Me
End Sub

Sub SetCss(css As Object) As WixCounter
	Counter.SetAttr("css", css)
	Return Me
End Sub

Sub SetDisabled(disabled As Boolean) As WixCounter
	Counter.SetAttr("disabled", disabled)
	Return Me
End Sub

Sub SetFormat(format As Object) As WixCounter
	Counter.SetAttr("format", format)
	Return Me
End Sub

Sub SetGravity(gravity As Object) As WixCounter
	Counter.SetAttr("gravity", gravity)
	Return Me
End Sub

Sub SetHeight(height As Object) As WixCounter
	Counter.SetAttr("height", height)
	Return Me
End Sub

Sub SetHidden(hidden As Boolean) As WixCounter
	Counter.SetAttr("hidden", hidden)
	Return Me
End Sub

Sub SetHotkey(hotkey As Object) As WixCounter
	Counter.SetAttr("hotkey", hotkey)
	Return Me
End Sub

Sub SetInputAlign(inputAlign As Object) As WixCounter
	Counter.SetAttr("inputAlign", inputAlign)
	Return Me
End Sub

Sub SetInputHeight(inputHeight As Object) As WixCounter
	Counter.SetAttr("inputHeight", inputHeight)
	Return Me
End Sub

Sub SetInputWidth(inputWidth As Object) As WixCounter
	Counter.SetAttr("inputWidth", inputWidth)
	Return Me
End Sub

Sub SetInvalidMessage(invalidMessage As Object) As WixCounter
	Counter.SetAttr("invalidMessage", invalidMessage)
	Return Me
End Sub

Sub SetMaxHeight(maxHeight As Object) As WixCounter
Counter.SetAttr("maxHeight", maxHeight)
Return Me
End Sub

Sub SetMaxWidth(maxWidth As Object) As WixCounter
Counter.SetAttr("maxWidth", maxWidth)
Return Me
End Sub

Sub SetPopup(popup As Object) As WixCounter
Counter.SetAttr("popup", popup)
Return Me
End Sub

Sub SetRelatedAction(relatedAction As Object) As WixCounter
Counter.SetAttr("relatedAction", relatedAction)
Return Me
End Sub

Sub SetRelatedView(relatedView As Object) As WixCounter
Counter.SetAttr("relatedView", relatedView)
Return Me
End Sub

Sub SetRequired(required As Boolean) As WixCounter
Counter.SetAttr("required", required)
Return Me
End Sub

Sub SetSuggest(suggest As Object) As WixCounter
Counter.SetAttr("suggest", suggest)
Return Me
End Sub

Sub SetValidate(validate As Object) As WixCounter
Counter.SetAttr("validate", validate)
Return Me
End Sub

Sub SetValidateEvent(validateEvent As Object) As WixCounter
Counter.SetAttr("validateEvent", validateEvent)
Return Me
End Sub

Sub SetWidth(width As Object) As WixCounter
Counter.SetAttr("width", width)
Return Me
End Sub