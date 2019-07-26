B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public RichSelect As WixElement
	Private Options As List
End Sub

'initialize the input box
Public Sub Initialize(iID As String) As WixRichSelect
	ID = iID.tolowercase
	RichSelect.Initialize(iID).SetView("richselect")
	Options.Initialize
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixRichSelect
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		RichSelect.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


Sub SetValidateEvent(e As Object) As WixRichSelect    'ignore
	RichSelect.SetAttr("validateEvent", e)
	Return Me
End Sub

Sub SetValidateEventBlur(b As Boolean) As WixRichSelect    'ignore
	RichSelect.SetAttr("validateEvent", "blur")
	Return Me
End Sub

Sub SetValidateEventKey(b As Boolean) As WixRichSelect     'ignore
	RichSelect.SetAttr("validateEvent", "key")
	Return Me
End Sub

'set validate
Sub SetValidateIsNotEmpty(b As Boolean) As WixRichSelect   'ignore
	RichSelect.SetAttr("validate","isNotEmpty")
	Return Me
End Sub


'set validate
Sub SetValidate(v As Object) As WixRichSelect   'ignore
	RichSelect.SetAttr("validate",v)
	Return Me
End Sub


'set invalid message
Sub SetInvalidMessage(msg As String) As WixRichSelect
	RichSelect.SetAttr("invalidMessage", msg)
	Return Me
End Sub


'set required
Sub SetRequired(b As Boolean) As WixRichSelect
	RichSelect.SetAttr("required", b)
	Return Me
End Sub


'set the placeholder
Sub SetPlaceHolder(ph As String) As WixRichSelect
	RichSelect.SetPlaceHolder(ph)
	Return Me
End Sub

Sub SetTemplateHTML(h As UOENowHTML) As WixRichSelect
	h.SetImportant(False)
	Dim os As String = h.HTML
	RichSelect.SetTemplate(os)
	Return Me
End Sub

'set name
Sub SetName(n As String) As WixRichSelect
	RichSelect.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixRichSelect
	RichSelect.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixRichSelect
	RichSelect.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixRichSelect
	RichSelect.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixRichSelect
	RichSelect.SetMinHeight(h)
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixRichSelect
	RichSelect.SetTooltip(tt)
	Return Me
End Sub

'set style
Sub SetStyle(prop As String, val As String) As WixRichSelect
	RichSelect.SetStyle(prop,val)
	Return Me
End Sub


'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'return the item
Sub Item As Map
	RichSelect.SetAttr("options", Options)
	Return RichSelect.item
End Sub

'set text
Sub SetText(t As String) As WixRichSelect
	RichSelect.SetAttr("text", t)
	Return Me
End Sub

'set options
Sub SetOptions(o As List) As WixRichSelect
	Options = o
	Return Me
End Sub

Sub SetOptionsJSON(json As String) As WixRichSelect
	RichSelect.SetOptionsJSON(json)
	Return Me
End Sub

Sub SetOptionsMAP(m As Map) As WixRichSelect
	For Each mk As String In m.Keys
		Dim mv As Object = m.Get(mk)
		AddOption(mk, mv)
	Next
	Return Me
End Sub

'add an option
Sub AddOption(sID As String, sValue As String) As WixRichSelect
	Dim sug As Map = CreateMap()
	sug.Put("id", sID)
	sug.Put("value", sValue)
	Options.Add(sug)
	Return Me
End Sub

'set value
Sub SetValue(v As String) As WixRichSelect
	RichSelect.SetValue(v)
	Return Me
End Sub

'set label
Sub SetLabel(l As String) As WixRichSelect
	RichSelect.SetLabel(l)
	Return Me
End Sub


'set label align
Sub SetLabelAlign(a As String) As WixRichSelect
	RichSelect.SetLabelAlign(a)
	Return Me
End Sub

'set label position
Sub SetLabelPosition(p As String) As WixRichSelect
	RichSelect.SetLabelPosition(p)
	Return Me
End Sub

'set label width
Sub SetLabelWidth(w As Int) As WixRichSelect
	RichSelect.SetLabelWidth(w)
	Return Me
End Sub


'set align right
Sub SetAlignRight(r As String) As WixRichSelect 'ignore
	RichSelect.setAlignright("")
	Return Me
End Sub

'set align center
Sub SetAlignCenter(r As String) As WixRichSelect 'ignore
	RichSelect.setAligncenter("")
	Return Me
End Sub

'set align left
Sub SetAlignLeft(r As String) As WixRichSelect 'ignore
	RichSelect.SetAlignleft("")
	Return Me
End Sub


'set suggest
Sub SetSuggest(s As Object) As WixRichSelect
	RichSelect.setSuggest(s)
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


Sub SetAlign(align As Object) As WixRichselect
	Richselect.SetAttr("align", align)
	Return Me
End Sub

Sub SetAnimate(animate As Boolean) As WixRichselect
	Richselect.SetAttr("animate", animate)
	Return Me
End Sub

Sub SetAttributes(attributes As Object) As WixRichselect
	Richselect.SetAttr("attributes", attributes)
	Return Me
End Sub

Sub SetBorderless(borderless As Boolean) As WixRichselect
	Richselect.SetAttr("borderless", borderless)
	Return Me
End Sub

Sub SetBottomLabel(bottomLabel As Object) As WixRichselect
	Richselect.SetAttr("bottomLabel", bottomLabel)
	Return Me
End Sub

Sub SetBottomPadding(bottomPadding As Object) As WixRichselect
	Richselect.SetAttr("bottomPadding", bottomPadding)
	Return Me
End Sub

Sub SetClick(click As Object) As WixRichselect
	Richselect.SetAttr("click", click)
	Return Me
End Sub

Sub SetContainer(container As Object) As WixRichselect
	Richselect.SetAttr("container", container)
	Return Me
End Sub

Sub SetCss(css As Object) As WixRichSelect
	RichSelect.SetAttr("css", css)
	Return Me
End Sub

Sub SetDisabled(disabled As Boolean) As WixRichSelect
	RichSelect.SetAttr("disabled", disabled)
	Return Me
End Sub

Sub SetFormat(format As Object) As WixRichSelect
	RichSelect.SetAttr("format", format)
	Return Me
End Sub

Sub SetGravity(gravity As Object) As WixRichSelect
	RichSelect.SetAttr("gravity", gravity)
	Return Me
End Sub

Sub SetHeight(height As Object) As WixRichSelect
	RichSelect.SetAttr("height", height)
	Return Me
End Sub

Sub SetHidden(hidden As Boolean) As WixRichSelect
	RichSelect.SetAttr("hidden", hidden)
	Return Me
End Sub

Sub SetHotkey(hotkey As Object) As WixRichSelect
	RichSelect.SetAttr("hotkey", hotkey)
	Return Me
End Sub

Sub SetIcon(icon As Object) As WixRichSelect
	RichSelect.SetAttr("icon", icon)
	Return Me
End Sub

Sub SetInputAlign(inputAlign As Object) As WixRichSelect
	RichSelect.SetAttr("inputAlign", inputAlign)
	Return Me
End Sub

Sub SetInputHeight(inputHeight As Object) As WixRichSelect
	RichSelect.SetAttr("inputHeight", inputHeight)
	Return Me
End Sub

Sub SetInputWidth(inputWidth As Object) As WixRichSelect
	RichSelect.SetAttr("inputWidth", inputWidth)
	Return Me
End Sub

Sub SetInvalid(invalid As Object) As WixRichSelect
	RichSelect.SetAttr("invalid", invalid)
	Return Me
End Sub

Sub SetMaxHeight(maxHeight As Object) As WixRichSelect
RichSelect.SetAttr("maxHeight", maxHeight)
Return Me
End Sub

Sub SetMaxWidth(maxWidth As Object) As WixRichSelect
RichSelect.SetAttr("maxWidth", maxWidth)
Return Me
End Sub

Sub SetPopup(popup As Object) As WixRichSelect
RichSelect.SetAttr("popup", popup)
Return Me
End Sub

Sub SetPopupWidth(popupWidth As Object) As WixRichSelect
RichSelect.SetAttr("popupWidth", popupWidth)
Return Me
End Sub

Sub SetReadonly(readonly As Boolean) As WixRichSelect
RichSelect.SetAttr("readonly", readonly)
Return Me
End Sub

Sub SetRelatedAction(relatedAction As Object) As WixRichSelect
RichSelect.SetAttr("relatedAction", relatedAction)
Return Me
End Sub

Sub SetRelatedView(relatedView As Object) As WixRichSelect
RichSelect.SetAttr("relatedView", relatedView)
Return Me
End Sub

Sub SetWidth(width As Object) As WixRichSelect
RichSelect.SetAttr("width", width)
Return Me
End Sub