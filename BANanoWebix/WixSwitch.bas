B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Switch As WixElement
	Public Parent As WixElement
End Sub

'initialize the input box
Public Sub Initialize(iID As String) As WixSwitch
	ID = iID.tolowercase
	Switch.Initialize(iID).SetView("switch")
	Parent = Null
	Return Me
End Sub


'set css
Sub SetStyle(prop As String, sval As String) As WixSwitch
	Switch.SetStyle(prop,sval)
	Return Me
End Sub


'set label right
Sub SetLabelRight(l As String) As WixSwitch
	Switch.SetAttr("labelRight", l)
	Return Me
End Sub

'set the parent
Sub SetParent(p As WixElement) As WixSwitch
	Parent = p
	Return Me
End Sub



'add tp columns of parent
Sub Pop
	Parent.AddColumns(Item)
End Sub

'use a map object
Sub SetMap(m As Map) As WixSwitch
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		Switch.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


Sub SetTemplateHTML(h As UOENowHTML) As WixSwitch
	h.SetImportant(False)
	Dim os As String = h.HTML
	Switch.SetTemplate(os)
	Return Me
End Sub

'set name
Sub SetName(n As String) As WixSwitch
	Switch.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixSwitch
	Switch.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixSwitch
	Switch.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixSwitch
	Switch.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixSwitch
	Switch.SetMinHeight(h)
	Return Me
End Sub

'set on label
Sub SetOnLabel(l As String) As WixSwitch
	Switch.SetAttr("onLabel", l)
	Return Me
End Sub

'set off label
Sub SetOffLabel(l As String) As WixSwitch
	Switch.SetAttr("offLabel", l)
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixSwitch
	Switch.SetAttr("tooltip", tt)
	Return Me
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'return the item
Sub Item As Map
	Return Switch.item
End Sub

'set value
Sub SetValue(v As String) As WixSwitch
	Switch.SetValue(v)
	Return Me
End Sub

'set label
Sub SetLabel(l As String) As WixSwitch
	Switch.SetLabel(l)
	Return Me
End Sub

'set label align
Sub SetLabelAlign(a As String) As WixSwitch
	Switch.SetLabelAlign(a)
	Return Me
End Sub

'set label position
Sub SetLabelPosition(p As String) As WixSwitch
	Switch.SetLabelPosition(p)
	Return Me
End Sub

'set label width
Sub SetLabelWidth(w As Int) As WixSwitch
	Switch.SetLabelWidth(w)
	Return Me
End Sub


'set align right
Sub SetAlignRight(r As String) As WixSwitch 'ignore
	Switch.setAlignright("")
	Return Me
End Sub

'set align center
Sub SetAlignCenter(r As String) As WixSwitch 'ignore
	Switch.setAligncenter("")
	Return Me
End Sub

'set align left
Sub SetAlignLeft(r As String) As WixSwitch 'ignore
	Switch.SetAlignleft("")
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


Sub SetAlign(align As Object) As WixSwitch
	Switch.SetAttr("align", align)
	Return Me
End Sub

Sub SetAnimate(animate As Boolean) As WixSwitch
	Switch.SetAttr("animate", animate)
	Return Me
End Sub

Sub SetAttributes(attributes As Object) As WixSwitch
	Switch.SetAttr("attributes", attributes)
	Return Me
End Sub

Sub SetBadge(badge As Object) As WixSwitch
	Switch.SetAttr("badge", badge)
	Return Me
End Sub

Sub SetBorderless(borderless As Boolean) As WixSwitch
	Switch.SetAttr("borderless", borderless)
	Return Me
End Sub

Sub SetBottomLabel(bottomLabel As Object) As WixSwitch
	Switch.SetAttr("bottomLabel", bottomLabel)
	Return Me
End Sub

Sub SetBottomPadding(bottomPadding As Object) As WixSwitch
	Switch.SetAttr("bottomPadding", bottomPadding)
	Return Me
End Sub

Sub SetCheckValue(checkValue As Object) As WixSwitch
	Switch.SetAttr("checkValue", checkValue)
	Return Me
End Sub

Sub SetClick(click As Object) As WixSwitch
	Switch.SetAttr("click", click)
	Return Me
End Sub

Sub SetContainer(container As Object) As WixSwitch
	Switch.SetAttr("container", container)
	Return Me
End Sub

Sub SetCss(css As Object) As WixSwitch
	Switch.SetAttr("css", css)
	Return Me
End Sub

Sub SetCustomCheckbox(customCheckbox As Object) As WixSwitch
	Switch.SetAttr("customCheckbox", customCheckbox)
	Return Me
End Sub

Sub SetDisabled(disabled As Boolean) As WixSwitch
	Switch.SetAttr("disabled", disabled)
	Return Me
End Sub

Sub SetFormat(format As Object) As WixSwitch
	Switch.SetAttr("format", format)
	Return Me
End Sub

Sub SetGravity(gravity As Object) As WixSwitch
	Switch.SetAttr("gravity", gravity)
	Return Me
End Sub

Sub SetHeight(height As Object) As WixSwitch
	Switch.SetAttr("height", height)
	Return Me
End Sub

Sub SetHidden(hidden As Boolean) As WixSwitch
	Switch.SetAttr("hidden", hidden)
	Return Me
End Sub

Sub SetIcon(icon As Object) As WixSwitch
	Switch.SetAttr("icon", icon)
	Return Me
End Sub

Sub SetImage(image As Object) As WixSwitch
	Switch.SetAttr("image", image)
	Return Me
End Sub

Sub SetInputAlign(inputAlign As Object) As WixSwitch
	Switch.SetAttr("inputAlign", inputAlign)
	Return Me
End Sub

Sub SetInputHeight(inputHeight As Object) As WixSwitch
	Switch.SetAttr("inputHeight", inputHeight)
	Return Me
End Sub

Sub SetInputWidth(inputWidth As Object) As WixSwitch
	Switch.SetAttr("inputWidth", inputWidth)
	Return Me
End Sub

Sub SetInvalid(invalid As Object) As WixSwitch
	Switch.SetAttr("invalid", invalid)
	Return Me
End Sub

Sub SetInvalidMessage(invalidMessage As Object) As WixSwitch
	Switch.SetAttr("invalidMessage", invalidMessage)
	Return Me
End Sub

Sub SetMaxHeight(maxHeight As Object) As WixSwitch
Switch.SetAttr("maxHeight", maxHeight)
Return Me
End Sub

Sub SetMaxWidth(maxWidth As Object) As WixSwitch
Switch.SetAttr("maxWidth", maxWidth)
Return Me
End Sub

Sub SetPattern(pattern As Object) As WixSwitch
Switch.SetAttr("pattern", pattern)
Return Me
End Sub

Sub SetPlaceholder(placeholder As Object) As WixSwitch
Switch.SetAttr("placeholder", placeholder)
Return Me
End Sub

Sub SetPopup(popup As Object) As WixSwitch
Switch.SetAttr("popup", popup)
Return Me
End Sub

Sub SetReadonly(readonly As Boolean) As WixSwitch
Switch.SetAttr("readonly", readonly)
Return Me
End Sub

Sub SetRelatedAction(relatedAction As Object) As WixSwitch
Switch.SetAttr("relatedAction", relatedAction)
Return Me
End Sub

Sub SetRelatedView(relatedView As Object) As WixSwitch
Switch.SetAttr("relatedView", relatedView)
Return Me
End Sub

Sub SetRequired(required As Boolean) As WixSwitch
Switch.SetAttr("required", required)
Return Me
End Sub

Sub SetSuggest(suggest As Object) As WixSwitch
Switch.SetAttr("suggest", suggest)
Return Me
End Sub

Sub SetType(sType As Object) As WixSwitch
Switch.SetAttr("type", sType)
Return Me
End Sub

Sub SetUncheckValue(uncheckValue As Object) As WixSwitch
Switch.SetAttr("uncheckValue", uncheckValue)
Return Me
End Sub

Sub SetValidate(validate As Object) As WixSwitch
Switch.SetAttr("validate", validate)
Return Me
End Sub

Sub SetValidateEvent(validateEvent As Object) As WixSwitch
Switch.SetAttr("validateEvent", validateEvent)
Return Me
End Sub

Sub SetWidth(width As Object) As WixSwitch
Switch.SetAttr("width", width)
Return Me
End Sub