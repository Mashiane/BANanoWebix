B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Combo As WixElement
	Private Options As List
	Private yCount As Int
	Private opt As Map
End Sub

'initialize the input box
Public Sub Initialize(iID As String) As WixCombo
	ID = iID.tolowercase
	Combo.Initialize(iID).SetView("combo")
	Options.Initialize
	yCount = 0
	opt = CreateMap()
	Return Me
End Sub


Sub SetValidateEvent(e As Object) As WixCombo    'ignore
	Combo.SetAttr("validateEvent", e)
	Return Me
End Sub

Sub SetValidateEventBlur(b As Boolean) As WixCombo    'ignore
	Combo.SetAttr("validateEvent", "blur")
	Return Me
End Sub

Sub SetValidateEventKey(b As Boolean) As WixCombo     'ignore
	Combo.SetAttr("validateEvent", "key")
	Return Me
End Sub

'set validate
Sub SetValidateIsNotEmpty(b As Boolean) As WixCombo   'ignore
	Combo.SetAttr("validate","isNotEmpty")
	Return Me
End Sub


'set validate
Sub SetValidate(v As Object) As WixCombo   'ignore
	Combo.SetAttr("validate",v)
	Return Me
End Sub


'set invalid message
Sub SetInvalidMessage(msg As String) As WixCombo
	Combo.SetAttr("invalidMessage", msg)
	Return Me
End Sub


'set required
Sub SetRequired(b As Boolean) As WixCombo
	Combo.SetAttr("required", b)
	Return Me
End Sub


'set the placeholder
Sub SetPlaceHolder(ph As String) As WixCombo
	Combo.SetPlaceHolder(ph)
	Return Me
End Sub

Sub SetTemplateHTML(h As UOENowHTML) As WixCombo
	h.SetImportant(False)
	Dim os As String = h.HTML
	Combo.SetTemplate(os)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixCombo
	Combo.SetResponsive(b)
	Return Me
End Sub


'set name
Sub SetName(n As String) As WixCombo
	Combo.SetName(n)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixCombo
	Combo.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixCombo
	Combo.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixCombo
	Combo.SetMinHeight(h)
	Return Me
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixCombo
	Combo.SetTooltip(tt)
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixCombo
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		Combo.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


'set options
Sub SetOptions(o As List) As WixCombo
	Options = o
	Return Me	
End Sub

'set style
Sub SetStyle(prop As String, val As String) As WixCombo
	Combo.SetStyle(prop,val)
	Return Me
End Sub

'set template
Sub SetTemplate(t As String) As WixCombo
	opt.Put("template", t)
	Return Me	
End Sub

'return the item
Sub Item As Map
	opt.Put("data", Options)
	If yCount <> 0 Then opt.Put("yCount",yCount)
	Combo.SetAttr("options", opt)
	Return Combo.item
End Sub

Sub SetOptionsJSON(json As String) As WixCombo
	Combo.SetOptionsJSON(json)
	Return Me
End Sub

Sub SetOptionsMAP(m As Map) As WixCombo
	For Each mk As String In m.Keys
		Dim mv As Object = m.Get(mk)
		AddOption(mk, mv)
	Next
	Return Me
End Sub

'add initialization options
Sub AddOption(optID As String, optValue As String) As WixCombo
	Options.Add(CreateMap("id":optID,"value":optValue))
	Return Me
End Sub

'set yCount
Sub SetYCount(y As Int) As WixCombo
	yCount = y
	Return Me
End Sub

'set value
Sub SetValue(v As String) As WixCombo
	Combo.SetValue(v)
	Return Me
End Sub

'set label
Sub SetLabel(l As String) As WixCombo
	Combo.SetLabel(l)
	Return Me
End Sub


'set bottom label
Sub SetBottomLabel(f As Object) As WixCombo
	Combo.SetAttr("bottomLabel", f)
	Return Me
End Sub

'set bottom padding
Sub SetBottomPadding(f As Object) As WixCombo
	Combo.SetAttr("bottomPadding", f)
	Return Me
End Sub

'set label align
Sub SetLabelAlign(a As String) As WixCombo
	Combo.SetLabelAlign(a)
	Return Me
End Sub

'set label position
Sub SetLabelPosition(p As String) As WixCombo
	Combo.SetLabelPosition(p)
	Return Me
End Sub

'set label width
Sub SetLabelWidth(w As Int) As WixCombo
	Combo.SetLabelWidth(w)
	Return Me
End Sub


'set align right
Sub SetAlignRight(r As String) As WixCombo 'ignore
	Combo.setAlignright("")
	Return Me
End Sub

'set align center
Sub SetAlignCenter(r As String) As WixCombo 'ignore
	Combo.setAligncenter("")
	Return Me
End Sub

'set align left
Sub SetAlignLeft(r As String) As WixCombo 'ignore
	Combo.SetAlignleft("")
	Return Me
End Sub

'set suggest
Sub SetSuggest(s As Object) As WixCombo
	Combo.setSuggest(s)
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

Sub SetAlign(align As Object) As WixCombo
	Combo.SetAttr("align", align)
	Return Me
End Sub

Sub SetAnimate(animate As Boolean) As WixCombo
	Combo.SetAttr("animate", animate)
	Return Me
End Sub

Sub SetAttributes(attributes As Object) As WixCombo
	Combo.SetAttr("attributes", attributes)
	Return Me
End Sub

Sub SetBorderless(borderless As Boolean) As WixCombo
	Combo.SetAttr("borderless", borderless)
	Return Me
End Sub

Sub SetClick(click As Object) As WixCombo
Combo.SetAttr("click", click)
Return Me
End Sub

Sub SetContainer(container As Object) As WixCombo
Combo.SetAttr("container", container)
Return Me
End Sub

Sub SetCss(css As Object) As WixCombo
Combo.SetAttr("css", css)
Return Me
End Sub

Sub SetDisabled(disabled As Boolean) As WixCombo
Combo.SetAttr("disabled", disabled)
Return Me
End Sub

Sub SetEditable(editable As Boolean) As WixCombo
Combo.SetAttr("editable", editable)
Return Me
End Sub

Sub SetFormat(format As Object) As WixCombo
Combo.SetAttr("format", format)
Return Me
End Sub

Sub SetGravity(gravity As Object) As WixCombo
Combo.SetAttr("gravity", gravity)
Return Me
End Sub

Sub SetHeight(height As Object) As WixCombo
Combo.SetAttr("height", height)
Return Me
End Sub

Sub SetHidden(hidden As Boolean) As WixCombo
Combo.SetAttr("hidden", hidden)
Return Me
End Sub

Sub SetHotkey(hotkey As Object) As WixCombo
Combo.SetAttr("hotkey", hotkey)
Return Me
End Sub

Sub SetIcon(icon As Object) As WixCombo
Combo.SetAttr("icon", icon)
Return Me
End Sub

Sub SetInputAlign(inputAlign As Object) As WixCombo
Combo.SetAttr("inputAlign", inputAlign)
Return Me
End Sub

Sub SetInputHeight(inputHeight As Object) As WixCombo
Combo.SetAttr("inputHeight", inputHeight)
Return Me
End Sub

Sub SetInputWidth(inputWidth As Object) As WixCombo
Combo.SetAttr("inputWidth", inputWidth)
Return Me
End Sub

Sub SetInvalid(invalid As Object) As WixCombo
Combo.SetAttr("invalid", invalid)
Return Me
End Sub

Sub SetMaxHeight(maxHeight As Object) As WixCombo
Combo.SetAttr("maxHeight", maxHeight)
Return Me
End Sub

Sub SetMaxWidth(maxWidth As Object) As WixCombo
Combo.SetAttr("maxWidth", maxWidth)
Return Me
End Sub

Sub SetPopup(popup As Object) As WixCombo
Combo.SetAttr("popup", popup)
Return Me
End Sub

Sub SetPopupWidth(popupWidth As Object) As WixCombo
Combo.SetAttr("popupWidth", popupWidth)
Return Me
End Sub

Sub SetReadonly(readonly As Boolean) As WixCombo
Combo.SetAttr("readonly", readonly)
Return Me
End Sub

Sub SetRelatedAction(relatedAction As Object) As WixCombo
Combo.SetAttr("relatedAction", relatedAction)
Return Me
End Sub

Sub SetRelatedView(relatedView As Object) As WixCombo
Combo.SetAttr("relatedView", relatedView)
Return Me
End Sub

Sub SetType(sType As Object) As WixCombo
Combo.SetAttr("type", sType)
Return Me
End Sub

Sub SetWidth(width As Object) As WixCombo
Combo.SetAttr("width", width)
Return Me
End Sub