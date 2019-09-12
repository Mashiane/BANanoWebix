B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Radio As WixElement
	Private Options As List
	Private Vertical As Boolean
	Public Parent As WixElement
End Sub

'add tp columns of parent
Sub Pop
	Parent.AddColumns(Item)
End Sub

'set padding
Sub SetPadding(padding As Object) As WixRadio
	Radio.SetPadding(padding)
	Return Me
End Sub

'set padding
Sub SetMargin(margin As Object) As WixRadio
	Radio.SetMargin(margin)
	Return Me
End Sub

Sub SetAttributes(m As Map) As WixRadio
	For Each k As String In m.Keys
		Dim v As String = m.Get(k)
		Radio.SetAttr(k,v)
	Next
	Return Me
End Sub

Sub SetStyles(m As Map) As WixRadio
	For Each k As String In m.Keys
		Dim v As String = m.Get(k)
		Radio.SetStyle(k,v)
	Next
	Return Me
End Sub

'set css
Sub SetStyle(prop As String, sval As String) As WixRadio
	Radio.SetStyle(prop,sval)
	Return Me
End Sub


'initialize the input box
Public Sub Initialize(iID As String) As WixRadio
	ID = iID.tolowercase
	Radio.Initialize(iID).SetView("radio")
	Options.Initialize 
	Vertical = False
	Parent = Null
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixRadio
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		Radio.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


Sub SetTemplateHTML(h As UOENowHTML) As WixRadio
	h.SetImportant(False)
	Dim os As String = h.HTML
	Radio.SetTemplate(os)
	Return Me
End Sub

'set name
Sub SetName(n As String) As WixRadio
	Radio.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixRadio
	Radio.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixRadio
	Radio.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixRadio
	Radio.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixRadio
	Radio.SetMinHeight(h)
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixRadio
	Radio.SetTooltip(tt)
	Return Me
End Sub

'return the item
Sub Item As Map
	Radio.SetAttr("options", Options)
	Radio.SetAttr("vertical", Vertical)
	Return Radio.item
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'set options
Sub SetOptions(opt As List) As WixRadio
	Options = opt
	Return Me
End Sub

Sub SetOptionsJSON(json As String) As WixRadio
	Radio.SetOptionsJSON(json)
	Return Me
End Sub

Sub SetOptionsMAP(m As Map) As WixRadio
	For Each mk As String In m.Keys
		Dim mv As Object = m.Get(mk)
		AddOption(mk, mv)
	Next
	Return Me
End Sub

'add an option
Sub AddOption(sID As String, sValue As String) As WixRadio
	Dim sug As Map = CreateMap()
	sug.Put("id", sID)
	sug.Put("value", sValue)
	Options.Add(sug)
	Return Me
End Sub

'set value
Sub SetValue(v As String) As WixRadio
	Radio.SetValue(v)
	Return Me
End Sub

'set label
Sub SetLabel(l As String) As WixRadio
	Radio.SetLabel(l)
	Return Me
End Sub

'set vertical
Sub SetVertical(b As Boolean) As WixRadio
	Vertical = b
	Return Me
End Sub


'set label align
Sub SetLabelAlign(a As String) As WixRadio
	Radio.SetLabelAlign(a)
	Return Me
End Sub

'set label position
Sub SetLabelPosition(p As String) As WixRadio
	Radio.SetLabelPosition(p)
	Return Me
End Sub

'set label width
Sub SetLabelWidth(w As Int) As WixRadio
	Radio.SetLabelWidth(w)
	Return Me
End Sub


'set align right
Sub SetAlignRight(r As String) As WixRadio 'ignore
	Radio.setAlignright("")
	Return Me
End Sub

'set align center
Sub SetAlignCenter(r As String) As WixRadio 'ignore
	Radio.setAligncenter("")
	Return Me
End Sub

'set align left
Sub SetAlignLeft(r As String) As WixRadio 'ignore
	Radio.SetAlignleft("")
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

Sub SetAnimate(animate As Boolean) As WixRadio
	Radio.SetAttr("animate", animate)
	Return Me
End Sub

Sub SetAutowidth(autowidth As Boolean) As WixRadio
	Radio.SetAttr("autowidth", autowidth)
	Return Me
End Sub

'set the parent
Sub SetParent(p As WixElement) As WixRadio
	Parent = p
	Return Me
End Sub


Sub SetBorderless(borderless As Boolean) As WixRadio
	Radio.SetAttr("borderless", borderless)
	Return Me
End Sub

Sub SetBottomLabel(bottomLabel As Object) As WixRadio
	Radio.SetAttr("bottomLabel", bottomLabel)
	Return Me
End Sub

Sub SetBottomPadding(bottomPadding As Object) As WixRadio
	Radio.SetAttr("bottomPadding", bottomPadding)
	Return Me
End Sub

Sub SetClick(click As Object) As WixRadio
	Radio.SetAttr("click", click)
	Return Me
End Sub

Sub SetContainer(container As Object) As WixRadio
	Radio.SetAttr("container", container)
	Return Me
End Sub

Sub SetCss(css As Object) As WixRadio
	Radio.SetAttr("css", css)
	Return Me
End Sub

Sub SetCustomRadio(customRadio As Boolean) As WixRadio
	Radio.SetAttr("customRadio", customRadio)
	Return Me
End Sub

Sub SetDisabled(disabled As Boolean) As WixRadio
	Radio.SetAttr("disabled", disabled)
	Return Me
End Sub

Sub SetFormat(format As Object) As WixRadio
	Radio.SetAttr("format", format)
	Return Me
End Sub

Sub SetGravity(gravity As Object) As WixRadio
	Radio.SetAttr("gravity", gravity)
	Return Me
End Sub

Sub SetHeight(height As Object) As WixRadio
	Radio.SetAttr("height", height)
	Return Me
End Sub

Sub SetHidden(hidden As Boolean) As WixRadio
	Radio.SetAttr("hidden", hidden)
	Return Me
End Sub

Sub SetHotkey(hotkey As Object) As WixRadio
	Radio.SetAttr("hotkey", hotkey)
	Return Me
End Sub

Sub SetInputHeight(inputHeight As Object) As WixRadio
	Radio.SetAttr("inputHeight", inputHeight)
	Return Me
End Sub

Sub SetInputWidth(inputWidth As Object) As WixRadio
	Radio.SetAttr("inputWidth", inputWidth)
	Return Me
End Sub

Sub SetInvalidMessage(invalidMessage As Object) As WixRadio
	Radio.SetAttr("invalidMessage", invalidMessage)
	Return Me
End Sub

Sub SetMaxHeight(maxHeight As Object) As WixRadio
Radio.SetAttr("maxHeight", maxHeight)
Return Me
End Sub

Sub SetMaxWidth(maxWidth As Object) As WixRadio
Radio.SetAttr("maxWidth", maxWidth)
Return Me
End Sub

Sub SetOptionHeight(optionHeight As Object) As WixRadio
Radio.SetAttr("optionHeight", optionHeight)
Return Me
End Sub

Sub SetPopup(popup As Object) As WixRadio
Radio.SetAttr("popup", popup)
Return Me
End Sub

Sub SetRelatedAction(relatedAction As Object) As WixRadio
Radio.SetAttr("relatedAction", relatedAction)
Return Me
End Sub

Sub SetRelatedView(relatedView As Object) As WixRadio
Radio.SetAttr("relatedView", relatedView)
Return Me
End Sub

Sub SetRequired(required As Boolean) As WixRadio
Radio.SetAttr("required", required)
Return Me
End Sub

Sub SetSuggest(suggest As Object) As WixRadio
Radio.SetAttr("suggest", suggest)
Return Me
End Sub

Sub SetWidth(width As Object) As WixRadio
Radio.SetAttr("width", width)
Return Me
End Sub

Sub SetAlign(align As Object) As WixRadio
Radio.SetAttr("align", align)
Return Me
End Sub

Sub SetInputAlign(inputAlign As Object) As WixRadio
Radio.SetAttr("inputAlign", inputAlign)
Return Me
End Sub

Sub SetValidate(v As Object) As WixRadio
Radio.SetAttr("validate", v)
Return Me
End Sub

Sub SetValidateEvent(e As Object) As WixRadio
Radio.SetAttr("validateEvent", e)
Return Me
End Sub



