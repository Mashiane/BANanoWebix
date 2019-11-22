B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Segmented As WixElement
	Private Options As List
	Public Parent As WixElement
	Private BAnano As BANano  'ignore
End Sub

'initialize the input box
Public Sub Initialize(iID As String) As WixSegmented
	ID = iID.tolowercase
	Segmented.Initialize(iID).SetView("segmented")
	Options.Initialize
	Parent = Null
	Return Me
End Sub

'set padding
Sub SetPadding(padding As Object) As WixSegmented
	Segmented.SetPadding(padding)
	Return Me
End Sub

'set padding
Sub SetMargin(margin As Object) As WixSegmented
	Segmented.SetMargin(margin)
	Return Me
End Sub

'set readonly
Sub SetReadonly(readonly As Boolean) As WixSegmented
	Segmented.SetAttr("readonly", readonly)
	Return Me
End Sub

'set css
Sub SetStyle(prop As String, sval As String) As WixSegmented
	Segmented.SetStyle(prop,sval)
	Return Me
End Sub


'set the parent
Sub SetParent(p As WixElement) As WixSegmented
	Parent = p
	Return Me
End Sub


'add tp columns of parent
Sub Pop
	Parent.AddColumns(Item)
End Sub

Sub SetMultiView(b As Object) As WixSegmented
	Segmented.SetMultiView(b)
	Return Me
End Sub

Sub SetTemplateHTML(h As UOENowHTML) As WixSegmented
	h.SetImportant(False)
	Dim os As String = h.HTML
	Segmented.SetTemplate(os)
	Return Me
End Sub

'set name
Sub SetName(n As String) As WixSegmented
	Segmented.SetName(n)
	Return Me
End Sub


'use a map object
Sub SetMap(m As Map) As WixSegmented
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		Segmented.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


'set reponsive
Sub SetResponsive(b As Object) As WixSegmented
	Segmented.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixSegmented
	Segmented.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixSegmented
	Segmented.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixSegmented
	Segmented.SetMinHeight(h)
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixSegmented
	Segmented.SetTooltip(tt)
	Return Me
End Sub

Sub SetOptionsJSON(json As String) As WixSegmented
	Segmented.SetOptionsJSON(json)
	Return Me
End Sub

Sub SetOptionsMAP(m As Map) As WixSegmented
	For Each mk As String In m.Keys
		Dim mv As Object = m.Get(mk)
		AddOption(mk, mv)
	Next
	Return Me
End Sub

Sub OnItemClick(cb As BANanoObject) As WixSegmented
	Segmented.OnItemClick(cb)
	Return Me
End Sub

Sub OnAfterTabClick(cb As BANanoObject) As WixSegmented
	Segmented.OnAfterTabClick(cb)
	Return Me
End Sub

'return the item
Sub Item As Map
	Segmented.SetAttr("options", Options)
	Return Segmented.item
End Sub

'set options
Sub SetOptions(o As List) As WixSegmented
	Options = o
	Return Me
End Sub

'set the label
Sub SetLabel(l As String) As WixSegmented
	Segmented.SetLabel(l)
	Return Me
End Sub

'set the value
Sub SetValue(v As Object) As WixSegmented
	Segmented.SetValue(v)
	Return Me
End Sub

'add an option
Sub AddOption(oid As String, oTxt As Object) As WixSegmented
	Dim opt As Map = CreateMap()
	opt.put("id",oid)
	opt.Put("value",oTxt)
	Options.Add(opt)
	Return Me
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

Sub SetOptionWidth(w As Object) As WixSegmented
	Segmented.SetAttr("optionWidth", w)
	Return Me
End Sub


'set align right
Sub SetAlignRight(r As String) As WixSegmented 'ignore
	Segmented.setAlignright("")
	Return Me
End Sub

'set align center
Sub SetAlignCenter(r As String) As WixSegmented 'ignore
	Segmented.setAligncenter("")
	Return Me
End Sub

Sub SetAlign(a As Object) As WixSegmented 'ignore
	Segmented.SetAttr("align", a)
	Return Me
End Sub


'set align left
Sub SetAlignLeft(r As String) As WixSegmented 'ignore
	Segmented.SetAlignleft("")
	Return Me
End Sub


'set onclick event
Sub SetClick(e As BANanoObject) As WixSegmented
	Segmented.SetAttr("click", e)
	Return Me
End Sub

Sub SetOnClick(module As Object, methodName As String) As WixSegmented
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, Array(e))
	Segmented.SetClick(cb)
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

Sub SetAnimate(animate As Boolean) As WixSegmented
Segmented.SetAttr("animate", animate)
Return Me
End Sub

Sub SetAttributes(attributes As Object) As WixSegmented
Segmented.SetAttr("attributes", attributes)
Return Me
End Sub

Sub SetBorderless(borderless As Boolean) As WixSegmented
Segmented.SetAttr("borderless", borderless)
Return Me
End Sub

Sub SetBottomLabel(bottomLabel As Object) As WixSegmented
Segmented.SetAttr("bottomLabel", bottomLabel)
Return Me
End Sub

Sub SetBottomPadding(bottomPadding As Object) As WixSegmented
Segmented.SetAttr("bottomPadding", bottomPadding)
Return Me
End Sub

Sub SetContainer(container As Object) As WixSegmented
Segmented.SetAttr("container", container)
Return Me
End Sub

Sub SetCss(css As Object) As WixSegmented
Segmented.SetAttr("css", css)
Return Me
End Sub

Sub SetDisabled(disabled As Boolean) As WixSegmented
Segmented.SetAttr("disabled", disabled)
Return Me
End Sub

Sub SetFormat(format As Object) As WixSegmented
Segmented.SetAttr("format", format)
Return Me
End Sub

Sub SetGravity(gravity As Object) As WixSegmented
Segmented.SetAttr("gravity", gravity)
Return Me
End Sub

Sub SetHeight(height As Object) As WixSegmented
Segmented.SetAttr("height", height)
Return Me
End Sub

Sub SetHidden(hidden As Boolean) As WixSegmented
Segmented.SetAttr("hidden", hidden)
Return Me
End Sub

Sub SetHotkey(hotkey As Object) As WixSegmented
Segmented.SetAttr("hotkey", hotkey)
Return Me
End Sub

Sub SetInputAlign(inputAlign As Object) As WixSegmented
Segmented.SetAttr("inputAlign", inputAlign)
Return Me
End Sub

Sub SetInputHeight(inputHeight As Object) As WixSegmented
Segmented.SetAttr("inputHeight", inputHeight)
Return Me
End Sub

Sub SetInputWidth(inputWidth As Object) As WixSegmented
Segmented.SetAttr("inputWidth", inputWidth)
Return Me
End Sub

Sub SetInvalidMessage(invalidMessage As Object) As WixSegmented
Segmented.SetAttr("invalidMessage", invalidMessage)
Return Me
End Sub

Sub SetLabelAlign(labelAlign As Object) As WixSegmented
Segmented.SetAttr("labelAlign", labelAlign)
Return Me
End Sub

Sub SetLabelPosition(labelPosition As Object) As WixSegmented
Segmented.SetAttr("labelPosition", labelPosition)
Return Me
End Sub

Sub SetLabelWidth(labelWidth As Object) As WixSegmented
Segmented.SetAttr("labelWidth", labelWidth)
Return Me
End Sub

Sub SetMaxHeight(maxHeight As Object) As WixSegmented
Segmented.SetAttr("maxHeight", maxHeight)
Return Me
End Sub

Sub SetMaxWidth(maxWidth As Object) As WixSegmented
Segmented.SetAttr("maxWidth", maxWidth)
Return Me
End Sub

Sub SetPopup(popup As Object) As WixSegmented
Segmented.SetAttr("popup", popup)
Return Me
End Sub

Sub SetRelatedAction(relatedAction As Object) As WixSegmented
Segmented.SetAttr("relatedAction", relatedAction)
Return Me
End Sub

Sub SetRelatedView(relatedView As Object) As WixSegmented
Segmented.SetAttr("relatedView", relatedView)
Return Me
End Sub

Sub SetRequired(required As Boolean) As WixSegmented
Segmented.SetAttr("required", required)
Return Me
End Sub

Sub SetSuggest(suggest As Object) As WixSegmented
Segmented.SetAttr("suggest", suggest)
Return Me
End Sub

Sub SetValidate(validate As Object) As WixSegmented
Segmented.SetAttr("validate", validate)
Return Me
End Sub

Sub SetValidateEvent(validateEvent As Object) As WixSegmented
Segmented.SetAttr("validateEvent", validateEvent)
Return Me
End Sub

Sub SetWidth(width As Object) As WixSegmented
Segmented.SetAttr("width", width)
Return Me
End Sub
