B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public DropDown As WixElement
	Private Options As List
	Public Parent As WixElement
End Sub

'initialize the input box
Public Sub Initialize(iID As String) As WixSelect
	ID = iID.tolowercase
	DropDown.Initialize(iID).SetView("select")
	Options.Initialize
	Parent = Null
	Return Me
End Sub

'set padding
Sub SetPadding(padding As Object) As WixSelect
	DropDown.SetPadding(padding)
	Return Me
End Sub

'set padding
Sub SetMargin(margin As Object) As WixSelect
	DropDown.SetMargin(margin)
	Return Me
End Sub

'set the parent
Sub SetParent(p As WixElement) As WixSelect
	Parent = p
	Return Me
End Sub


Sub SetAttributes(m As Map) As WixSelect
	For Each k As String In m.Keys
		Dim v As String = m.Get(k)
		DropDown.SetAttr(k,v)
	Next
	Return Me
End Sub

Sub SetStyles(m As Map) As WixSelect
	For Each k As String In m.Keys
		Dim v As String = m.Get(k)
		DropDown.SetStyle(k,v)
	Next
	Return Me
End Sub

'set css
Sub SetStyle(prop As String, sval As String) As WixSelect
	DropDown.SetStyle(prop,sval)
	Return Me
End Sub


'add tp columns of parent
Sub Pop
	Parent.AddColumns(Item)
End Sub


Sub SetTemplateHTML(h As UOENowHTML) As WixSelect
	h.SetImportant(False)
	Dim os As String = h.HTML
	DropDown.SetTemplate(os)
	Return Me
End Sub


Sub SetValidateEvent(e As Object) As WixSelect    'ignore
	DropDown.SetAttr("validateEvent", e)
	Return Me
End Sub

Sub SetValidateEventBlur(b As Boolean) As WixSelect    'ignore
	DropDown.SetAttr("validateEvent", "blur")
	Return Me
End Sub

Sub SetValidateEventKey(b As Boolean) As WixSelect     'ignore
	DropDown.SetAttr("validateEvent", "key")
	Return Me
End Sub

'set validate
Sub SetValidateIsNotEmpty(b As Boolean) As WixSelect   'ignore
	DropDown.SetAttr("validate","isNotEmpty")
	Return Me
End Sub


'set validate
Sub SetValidate(v As Object) As WixSelect   'ignore
	DropDown.SetAttr("validate",v)
	Return Me
End Sub


'set invalid message
Sub SetInvalidMessage(msg As String) As WixSelect
	DropDown.SetAttr("invalidMessage", msg)
	Return Me
End Sub


'set required
Sub SetRequired(b As Boolean) As WixSelect
	DropDown.SetAttr("required", b)
	Return Me
End Sub

'set name
Sub SetName(n As String) As WixSelect
	DropDown.SetName(n)
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixSelect
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		DropDown.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


'set reponsive
Sub SetResponsive(b As Object) As WixSelect
	DropDown.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixSelect
	DropDown.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixSelect
	DropDown.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixSelect
	DropDown.SetMinHeight(h)
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixSelect
	DropDown.SetTooltip(tt)
	Return Me
End Sub


'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'set options
Sub SetOptions(o As List) As WixSelect
	Options = o
	Return Me
End Sub

'return the item
Sub Item As Map
	DropDown.SetAttr("options", Options)
	Return DropDown.item
End Sub

'add initialization options
Sub AddOption(optID As String, optValue As String) As WixSelect
	Options.Add(CreateMap("id":optID,"value":optValue))
	Return Me
End Sub

Sub SetOptionsJSON(json As String) As WixSelect
	DropDown.SetOptionsJSON(json)
	Return Me
End Sub

Sub SetOptionsMAP(m As Map) As WixSelect
	For Each mk As String In m.Keys
		Dim mv As Object = m.Get(mk)
		AddOption(mk, mv)
	Next
	Return Me
End Sub

'set value
Sub SetValue(v As String) As WixSelect
	DropDown.SetValue(v)
	Return Me
End Sub

'set label
Sub SetLabel(l As String) As WixSelect
	DropDown.SetLabel(l)
	Return Me
End Sub


'set bottom label
Sub SetBottomLabel(f As Object) As WixSelect
	DropDown.SetAttr("bottomLabel", f)
	Return Me
End Sub

'set bottom padding
Sub SetBottomPadding(f As Object) As WixSelect
	DropDown.SetAttr("bottomPadding", f)
	Return Me
End Sub

'set label align
Sub SetLabelAlign(a As String) As WixSelect
	DropDown.SetLabelAlign(a)
	Return Me
End Sub

'set label position
Sub SetLabelPosition(p As String) As WixSelect
	DropDown.SetLabelPosition(p)
	Return Me
End Sub

'set label width
Sub SetLabelWidth(w As Int) As WixSelect
	DropDown.SetLabelWidth(w)
	Return Me
End Sub

'set align right
Sub SetAlignRight(r As String) As WixSelect 'ignore
	DropDown.setAlignright("")
	Return Me
End Sub

'set align center
Sub SetAlignCenter(r As String) As WixSelect 'ignore
	DropDown.setAligncenter("")
	Return Me
End Sub

'set align left
Sub SetAlignLeft(r As String) As WixSelect 'ignore
	DropDown.SetAlignleft("")
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

Sub SetAlign(align As Object) As WixSelect
	DropDown.SetAttr("align", align)
	Return Me
End Sub

Sub SetAnimate(animate As Boolean) As WixSelect
	DropDown.SetAttr("animate", animate)
	Return Me
End Sub

Sub SetBorderless(borderless As Boolean) As WixSelect
	DropDown.SetAttr("borderless", borderless)
	Return Me
End Sub

Sub SetClick(click As Object) As WixSelect
DropDown.SetAttr("click", click)
Return Me
End Sub

Sub SetContainer(container As Object) As WixSelect
DropDown.SetAttr("container", container)
Return Me
End Sub

Sub SetCss(css As Object) As WixSelect
DropDown.SetAttr("css", css)
Return Me
End Sub

Sub SetDisabled(disabled As Boolean) As WixSelect
DropDown.SetAttr("disabled", disabled)
Return Me
End Sub

Sub SetFormat(format As Object) As WixSelect
DropDown.SetAttr("format", format)
Return Me
End Sub

Sub SetGravity(gravity As Object) As WixSelect
DropDown.SetAttr("gravity", gravity)
Return Me
End Sub

Sub SetHeight(height As Object) As WixSelect
DropDown.SetAttr("height", height)
Return Me
End Sub

Sub SetHidden(hidden As Boolean) As WixSelect
DropDown.SetAttr("hidden", hidden)
Return Me
End Sub

Sub SetHotkey(hotkey As Object) As WixSelect
DropDown.SetAttr("hotkey", hotkey)
Return Me
End Sub

Sub SetInputAlign(inputAlign As Object) As WixSelect
DropDown.SetAttr("inputAlign", inputAlign)
Return Me
End Sub

Sub SetInputHeight(inputHeight As Object) As WixSelect
DropDown.SetAttr("inputHeight", inputHeight)
Return Me
End Sub

Sub SetInputWidth(inputWidth As Object) As WixSelect
DropDown.SetAttr("inputWidth", inputWidth)
Return Me
End Sub

Sub SetInvalid(invalid As Object) As WixSelect
DropDown.SetAttr("invalid", invalid)
Return Me
End Sub

Sub SetMaxHeight(maxHeight As Object) As WixSelect
DropDown.SetAttr("maxHeight", maxHeight)
Return Me
End Sub

Sub SetMaxWidth(maxWidth As Object) As WixSelect
DropDown.SetAttr("maxWidth", maxWidth)
Return Me
End Sub

Sub SetPlaceholder(placeholder As Object) As WixSelect
DropDown.SetAttr("placeholder", placeholder)
Return Me
End Sub

Sub SetPopup(popup As Object) As WixSelect
DropDown.SetAttr("popup", popup)
Return Me
End Sub

Sub SetReadonly(readonly As Boolean) As WixSelect
DropDown.SetAttr("readonly", readonly)
Return Me
End Sub

Sub SetRelatedAction(relatedAction As Object) As WixSelect
DropDown.SetAttr("relatedAction", relatedAction)
Return Me
End Sub

Sub SetRelatedView(relatedView As Object) As WixSelect
DropDown.SetAttr("relatedView", relatedView)
Return Me
End Sub

Sub SetSuggest(suggest As Object) As WixSelect
DropDown.SetAttr("suggest", suggest)
Return Me
End Sub

Sub SetWidth(width As Object) As WixSelect
DropDown.SetAttr("width", width)
Return Me
End Sub