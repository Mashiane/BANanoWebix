B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public CheckBox As WixElement
	Public Parent As WixElement
End Sub

'initialize the input box
Public Sub Initialize(iID As String) As WixCheckBox
	ID = iID.tolowercase
	CheckBox.Initialize(iID).SetView("checkbox")
	Parent = Null
	Return Me
End Sub

'set the parent
Sub SetParent(p As WixElement) As WixCheckBox
	Parent = p
	Return Me
End Sub


'add tp columns of parent
Sub Pop
	Parent.AddColumns(Item)
End Sub

Sub SetTemplateHTML(h As UOENowHTML) As WixCheckBox
	h.SetImportant(False)
	Dim os As String = h.HTML
	CheckBox.SetTemplate(os)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixCheckBox
	CheckBox.SetResponsive(b)
	Return Me
End Sub


'set name
Sub SetName(n As String) As WixCheckBox
	CheckBox.SetName(n)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixCheckBox
	CheckBox.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixCheckBox
	CheckBox.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixCheckBox
	CheckBox.SetMinHeight(h)
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixCheckBox
	CheckBox.SetAttr("tooltip", tt)
	Return Me
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'use a map object
Sub SetMap(m As Map) As WixCheckBox
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		CheckBox.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


Sub SetValidateIsChecked(b As Boolean) As WixCheckBox   'ignore
	CheckBox.SetAttr("validate","isChecked")
	Return Me
End Sub


'set invalid message
Sub SetInvalidMessage(msg As String) As WixCheckBox
	CheckBox.SetAttr("invalidMessage", msg)
	Return Me
End Sub


'set label right
Sub SetLabelRight(l As String) As WixCheckBox
	CheckBox.SetAttr("labelRight", l)
	Return Me
End Sub

'return the item
Sub Item As Map
	Return CheckBox.item
End Sub

'set style
Sub SetStyle(prop As String, val As String) As WixCheckBox
	CheckBox.SetStyle(prop,val)
	Return Me
End Sub

'set value
Sub SetValue(v As String) As WixCheckBox
	CheckBox.SetValue(v)
	Return Me
End Sub

'set label
Sub SetLabel(l As String) As WixCheckBox
	CheckBox.SetLabel(l)
	Return Me
End Sub


'set label align
Sub SetLabelAlign(a As String) As WixCheckBox
	CheckBox.SetLabelAlign(a)
	Return Me
End Sub

'set label position
Sub SetLabelPosition(p As String) As WixCheckBox
	CheckBox.SetLabelPosition(p)
	Return Me
End Sub

'set label width
Sub SetLabelWidth(w As Int) As WixCheckBox
	CheckBox.SetLabelWidth(w)
	Return Me
End Sub


'set align right
Sub SetAlignRight(r As String) As WixCheckBox 'ignore
	CheckBox.setAlignright("")
	Return Me
End Sub

'set align center
Sub SetAlignCenter(r As String) As WixCheckBox 'ignore
	CheckBox.setAligncenter("")
	Return Me
End Sub

'set align left
Sub SetAlignLeft(r As String) As WixCheckBox 'ignore
	CheckBox.SetAlignleft("")
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


Sub SetAlign(align As Object) As WixCheckBox
	CheckBox.SetAttr("align", align)
	Return Me
End Sub

Sub SetAnimate(animate As Boolean) As WixCheckBox
	CheckBox.SetAttr("animate", animate)
	Return Me
End Sub

Sub SetAttributes(attributes As Object) As WixCheckBox
	CheckBox.SetAttr("attributes", attributes)
	Return Me
End Sub

Sub SetBorderless(borderless As Boolean) As WixCheckBox
	CheckBox.SetAttr("borderless", borderless)
	Return Me
End Sub

Sub SetBottomLabel(bottomLabel As Object) As WixCheckBox
	CheckBox.SetAttr("bottomLabel", bottomLabel)
	Return Me
End Sub

Sub SetBottomPadding(bottomPadding As Object) As WixCheckBox
	CheckBox.SetAttr("bottomPadding", bottomPadding)
	Return Me
End Sub

Sub SetCheckValue(checkValue As Object) As WixCheckBox
	CheckBox.SetAttr("checkValue", checkValue)
	Return Me
End Sub

Sub SetClick(click As Object) As WixCheckBox
	CheckBox.SetAttr("click", click)
	Return Me
End Sub

Sub SetContainer(container As Object) As WixCheckBox
	CheckBox.SetAttr("container", container)
	Return Me
End Sub

Sub SetCss(css As Object) As WixCheckBox
	CheckBox.SetAttr("css", css)
	Return Me
End Sub

Sub SetCustomCheckbox(customCheckbox As Object) As WixCheckBox
	CheckBox.SetAttr("customCheckbox", customCheckbox)
	Return Me
End Sub

Sub SetDisabled(disabled As Boolean) As WixCheckBox
	CheckBox.SetAttr("disabled", disabled)
	Return Me
End Sub

Sub SetFormat(format As Object) As WixCheckBox
	CheckBox.SetAttr("format", format)
	Return Me
End Sub

Sub SetGravity(gravity As Object) As WixCheckBox
	CheckBox.SetAttr("gravity", gravity)
	Return Me
End Sub

Sub SetHeight(height As Object) As WixCheckBox
	CheckBox.SetAttr("height", height)
	Return Me
End Sub

Sub SetHidden(hidden As Boolean) As WixCheckBox
	CheckBox.SetAttr("hidden", hidden)
	Return Me
End Sub

Sub SetHotkey(hotkey As Object) As WixCheckBox
	CheckBox.SetAttr("hotkey", hotkey)
	Return Me
End Sub

Sub SetInputAlign(inputAlign As Object) As WixCheckBox
	CheckBox.SetAttr("inputAlign", inputAlign)
	Return Me
End Sub

Sub SetInputWidth(inputWidth As Object) As WixCheckBox
	CheckBox.SetAttr("inputWidth", inputWidth)
	Return Me
End Sub

Sub SetMaxHeight(maxHeight As Object) As WixCheckBox
CheckBox.SetAttr("maxHeight", maxHeight)
Return Me
End Sub

Sub SetMaxWidth(maxWidth As Object) As WixCheckBox
CheckBox.SetAttr("maxWidth", maxWidth)
Return Me
End Sub

Sub SetPopup(popup As Object) As WixCheckBox
CheckBox.SetAttr("popup", popup)
Return Me
End Sub

Sub SetRelatedAction(relatedAction As Object) As WixCheckBox
CheckBox.SetAttr("relatedAction", relatedAction)
Return Me
End Sub

Sub SetRelatedView(relatedView As Object) As WixCheckBox
CheckBox.SetAttr("relatedView", relatedView)
Return Me
End Sub

Sub SetRequired(required As Boolean) As WixCheckBox
CheckBox.SetAttr("required", required)
Return Me
End Sub

Sub SetSuggest(suggest As Object) As WixCheckBox
CheckBox.SetAttr("suggest", suggest)
Return Me
End Sub


Sub SetUncheckValue(uncheckValue As Object) As WixCheckBox
CheckBox.SetAttr("uncheckValue", uncheckValue)
Return Me
End Sub

Sub SetValidate(validate As Object) As WixCheckBox
CheckBox.SetAttr("validate", validate)
Return Me
End Sub

Sub SetValidateEvent(validateEvent As Object) As WixCheckBox
CheckBox.SetAttr("validateEvent", validateEvent)
Return Me
End Sub

Sub SetWidth(width As Object) As WixCheckBox
CheckBox.SetAttr("width", width)
Return Me
End Sub