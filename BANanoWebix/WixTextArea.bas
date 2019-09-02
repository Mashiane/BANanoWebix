B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public TextArea As WixText
	Public Parent As WixElement
End Sub

'Initializes the text area
Public Sub Initialize(tID As String) As WixTextArea
	TextArea.Initialize(tID)
	TextArea.SetView("textarea")
	Parent = Null
	Return Me	
End Sub

'set the parent
Sub SetParent(p As WixElement) As WixTextArea
	Parent = p
	Return Me
End Sub

Sub OnKeyPress(cb As BANanoObject) As WixTextArea
	TextArea.OnKeyPress(cb)
	Return Me
End Sub



'set css
Sub SetStyle(prop As String, sval As String) As WixTextArea
	TextArea.SetStyle(prop,sval)
	Return Me
End Sub



Sub OnEnter(cb As BANanoObject) As WixTextArea
	TextArea.OnEnter(cb)
	Return Me
End Sub

Sub OnTimedKeypress(cb As BANanoObject) As WixTextArea
	TextArea.OnTimedKeyPress(cb)
	Return Me
End Sub

Sub OnChange(cb As BANanoObject) As WixTextArea
	TextArea.OnChange(cb)
	Return Me
End Sub

Sub OnFocus(cb As BANanoObject) As WixTextArea
	TextArea.onfocus(cb)
	Return Me
End Sub

Sub OnBlur(cb As BANanoObject) As WixTextArea
	TextArea.onblur(cb)
	Return Me
End Sub


'set value
Sub SetValue(v As String) As WixTextArea
	TextArea.Setvalue(v)
	Return Me
End Sub


'add tp columns of parent
Sub Pop
	Parent.AddColumns(Item)
End Sub

'set localid
Sub SetLocalID(i As String) As WixTextArea
	TextArea.SetLocalID(i)
	Return Me
End Sub


Sub SetTemplateHTML(h As UOENowHTML) As WixTextArea
	h.SetImportant(False)
	Dim os As String = h.HTML
	TextArea.SetAttr("template", os)
	Return Me
End Sub

'set name
Sub SetName(n As String) As WixTextArea
	TextArea.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixTextArea
	TextArea.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixTextArea
	TextArea.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixTextArea
	TextArea.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixTextArea
	TextArea.SetMinHeight(h)
	Return Me
End Sub
'use a map object
Sub SetMap(m As Map) As WixTextArea
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		TextArea.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


'set invalid message
Sub SetInvalidMessage(msg As String) As WixTextArea
	TextArea.SetInvalidMessage(msg)
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixTextArea
	TextArea.SetTooltip(tt)
	Return Me
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'return the item
Sub Item As Map
	Return TextArea.Item 
End Sub

'set the html attribute
Sub SetMaxLength(ml As Int) As WixTextArea
	TextArea.SetMaxLength(ml)
	Return Me
End Sub

'set the placeholder
Sub SetPlaceHolder(ph As String) As WixTextArea
	TextArea.SetPlaceHolder(ph)
	Return Me
End Sub

'set the label
Sub SetLabel(lbl As String) As WixTextArea
	TextArea.SetLabel(lbl)
	Return Me
End Sub

'set the width
Sub SetWidth(w As Object) As WixTextArea
	TextArea.SetWidth(w)
	Return Me
End Sub

'set the height
Sub SetHeight(h As Object) As WixTextArea
	TextArea.SetHeight(h)
	Return Me
End Sub

'set alignment
Sub SetAlign(a As String) As WixTextArea
	TextArea.SetAlign(a)
	Return Me
End Sub


'set label align
Sub SetLabelAlign(a As String) As WixTextArea
	TextArea.SetLabelAlign(a)
	Return Me
End Sub

'set label position
Sub SetLabelPosition(p As String) As WixTextArea
	TextArea.SetLabelPosition(p)
	Return Me
End Sub

'set label width
Sub SetLabelWidth(w As Int) As WixTextArea
	TextArea.SetLabelWidth(w)
	Return Me
End Sub

'set validate
Sub SetValidateIsNotEmpty(b As Boolean) As WixTextArea   'ignore
	TextArea.SetAttr("validate","isNotEmpty")
	Return Me
End Sub

Sub SetValidateIsNumber(b As Boolean) As WixTextArea   'ignore
	TextArea.SetAttr("validate","isNumber")
	Return Me
End Sub

Sub SetValidateIsEmail(b As Boolean) As WixTextArea   'ignore
	TextArea.SetAttr("validate","isEmail")
	Return Me
End Sub


Sub SetValidateEventBlur(b As Boolean) As WixTextArea    'ignore
	TextArea.SetAttr("validateEvent", "blur")
	Return Me
End Sub

Sub SetValidateEventKey(b As Boolean) As WixTextArea     'ignore
	TextArea.SetAttr("validateEvent", "key")
	Return Me
End Sub

'set required
Sub SetRequired(b As Boolean) As WixTextArea
	TextArea.SetAttr("required", b)
	Return Me
End Sub


'set readonly
Sub SetReadOnly(b As Boolean) As WixTextArea
	TextArea.SetAttr("readonly",b)
	Return Me
End Sub

'set disabled
Sub SetDisabled(b As Boolean) As WixTextArea
	TextArea.setattr("disabled",b)
	Return Me
End Sub

'set bottom label
Sub SetBottomLabel(f As Object) As WixTextArea
	TextArea.SetAttr("bottomLabel", f)
	Return Me
End Sub

'set bottom padding
Sub SetBottomPadding(f As Object) As WixTextArea
	TextArea.SetAttr("bottomPadding", f)
	Return Me
End Sub

'set align right
Sub SetAlignRight(r As String) As WixTextArea 'ignore
	TextArea.setAlignright("")
	Return Me
End Sub

'set align center
Sub SetAlignCenter(r As String) As WixTextArea 'ignore
	TextArea.setAligncenter("")
	Return Me
End Sub

'set align left
Sub SetAlignLeft(r As String) As WixTextArea 'ignore
	TextArea.SetAlignleft("")
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


Sub SetAnimate(animate As Boolean) As WixTextArea
TextArea.SetAttr("animate", animate)
Return Me
End Sub

Sub SetAttributes(attributes As Object) As WixTextArea
TextArea.SetAttr("attributes", attributes)
Return Me
End Sub

Sub SetBorderless(borderless As Boolean) As WixTextArea
TextArea.SetAttr("borderless", borderless)
Return Me
End Sub

Sub SetClick(click As Object) As WixTextArea
TextArea.SetAttr("click", click)
Return Me
End Sub

Sub SetContainer(container As Object) As WixTextArea
TextArea.SetAttr("container", container)
Return Me
End Sub

Sub SetCss(css As Object) As WixTextArea
TextArea.SetAttr("css", css)
Return Me
End Sub

Sub SetFormat(format As Object) As WixTextArea
TextArea.SetAttr("format", format)
Return Me
End Sub

Sub SetGravity(gravity As Object) As WixTextArea
TextArea.SetAttr("gravity", gravity)
Return Me
End Sub

Sub SetHidden(hidden As Boolean) As WixTextArea
TextArea.SetAttr("hidden", hidden)
Return Me
End Sub

Sub SetHotkey(hotkey As Object) As WixTextArea
TextArea.SetAttr("hotkey", hotkey)
Return Me
End Sub

Sub SetInputAlign(inputAlign As Object) As WixTextArea
TextArea.SetAttr("inputAlign", inputAlign)
Return Me
End Sub

Sub SetInputHeight(inputHeight As Object) As WixTextArea
TextArea.SetAttr("inputHeight", inputHeight)
Return Me
End Sub

Sub SetInputWidth(inputWidth As Object) As WixTextArea
TextArea.SetAttr("inputWidth", inputWidth)
Return Me
End Sub

Sub SetInvalid(invalid As Object) As WixTextArea
TextArea.SetAttr("invalid", invalid)
Return Me
End Sub

Sub SetMaxHeight(maxHeight As Object) As WixTextArea
TextArea.SetAttr("maxHeight", maxHeight)
Return Me
End Sub

Sub SetMaxWidth(maxWidth As Object) As WixTextArea
TextArea.SetAttr("maxWidth", maxWidth)
Return Me
End Sub

Sub SetPattern(pattern As Object) As WixTextArea
TextArea.SetAttr("pattern", pattern)
Return Me
End Sub


Sub SetPopup(popup As Object) As WixTextArea
TextArea.SetAttr("popup", popup)
Return Me
End Sub

Sub SetRelatedAction(relatedAction As Object) As WixTextArea
TextArea.SetAttr("relatedAction", relatedAction)
Return Me
End Sub

Sub SetElatedView(elatedView As Object) As WixTextArea
TextArea.SetAttr("elatedView", elatedView)
Return Me
End Sub

Sub SetSuggest(suggest As Object) As WixTextArea
TextArea.SetAttr("suggest", suggest)
Return Me
End Sub

Sub SetValidate(validate As Object) As WixTextArea
TextArea.SetAttr("validate", validate)
Return Me
End Sub

Sub SetValidateEvent(validateEvent As Object) As WixTextArea
TextArea.SetAttr("validateEvent", validateEvent)
Return Me
End Sub