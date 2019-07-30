B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Search As WixElement
	Public Parent As WixElement
End Sub

'initialize the input box
Public Sub Initialize(iID As String) As WixSearch
	ID = iID.tolowercase
	Search.Initialize(iID).SetView("search")
	Parent = Null
	Return Me
End Sub

'set the parent
Sub SetParent(p As WixElement) As WixSearch
	Parent = p
	Return Me
End Sub


'add tp columns of parent
Sub Pop
	Parent.AddColumns(Item)
End Sub

Sub SetTemplateHTML(h As UOENowHTML) As WixSearch
	h.SetImportant(False)
	Dim os As String = h.HTML
	Search.SetTemplate(os)
	Return Me
End Sub


'set the placeholder
Sub SetPlaceHolder(ph As String) As WixSearch
	Search.SetPlaceHolder(ph)
	Return Me
End Sub


Sub SetValidateEvent(e As Object) As WixSearch    'ignore
	Search.SetAttr("validateEvent", e)
	Return Me
End Sub

Sub SetValidateEventBlur(b As Boolean) As WixSearch    'ignore
	Search.SetAttr("validateEvent", "blur")
	Return Me
End Sub

Sub SetValidateEventKey(b As Boolean) As WixSearch     'ignore
	Search.SetAttr("validateEvent", "key")
	Return Me
End Sub

'set validate
Sub SetValidateIsNotEmpty(b As Boolean) As WixSearch   'ignore
	Search.SetAttr("validate","isNotEmpty")
	Return Me
End Sub


'set validate
Sub SetValidate(v As Object) As WixSearch   'ignore
	Search.SetAttr("validate",v)
	Return Me
End Sub


'set invalid message
Sub SetInvalidMessage(msg As String) As WixSearch
	Search.SetAttr("invalidMessage", msg)
	Return Me
End Sub


'set required
Sub SetRequired(b As Boolean) As WixSearch
	Search.SetAttr("required", b)
	Return Me
End Sub


'set name
Sub SetName(n As String) As WixSearch
	Search.SetName(n)
	Return Me
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'use a map object
Sub SetMap(m As Map) As WixSearch
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		Search.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


'set reponsive
Sub SetResponsive(b As Object) As WixSearch
	Search.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixSearch
	Search.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixSearch
	Search.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixSearch
	Search.SetMinHeight(h)
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixSearch
	Search.SetTooltip(tt)
	Return Me
End Sub

'set style
Sub SetStyle(prop As String, val As String) As WixSearch
	Search.SetStyle(prop,val)
	Return Me
End Sub


'return the item
Sub Item As Map
	Return Search.item
End Sub

'set value
Sub SetValue(v As String) As WixSearch
	Search.SetValue(v)
	Return Me
End Sub

'set label
Sub SetLabel(l As String) As WixSearch
	Search.SetLabel(l)
	Return Me
End Sub


'set bottom label
Sub SetBottomLabel(f As Object) As WixSearch
	Search.SetAttr("bottomLabel", f)
	Return Me
End Sub

'set bottom padding
Sub SetBottomPadding(f As Object) As WixSearch
	Search.SetAttr("bottomPadding", f)
	Return Me
End Sub

'set label align
Sub SetLabelAlign(a As String) As WixSearch
	Search.SetLabelAlign(a)
	Return Me
End Sub

'set label position
Sub SetLabelPosition(p As String) As WixSearch
	Search.SetLabelPosition(p)
	Return Me
End Sub

'set label width
Sub SetLabelWidth(w As Int) As WixSearch
	Search.SetLabelWidth(w)
	Return Me
End Sub

'set align right
Sub SetAlignRight(r As String) As WixSearch 'ignore
	Search.setAlignright("")
	Return Me
End Sub

'set align center
Sub SetAlignCenter(r As String) As WixSearch 'ignore
	Search.setAligncenter("")
	Return Me
End Sub

'set align left
Sub SetAlignLeft(r As String) As WixSearch 'ignore
	Search.SetAlignleft("")
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

Sub SetAnimate(animate As Boolean) As WixSearch
	Search.SetAttr("animate", animate)
	Return Me
End Sub

Sub SetAttributes(attributes As Object) As WixSearch
	Search.SetAttr("attributes", attributes)
	Return Me
End Sub

Sub SetAutowidth(autowidth As Boolean) As WixSearch
	Search.SetAttr("autowidth", autowidth)
	Return Me
End Sub

Sub SetBorderless(borderless As Boolean) As WixSearch
	Search.SetAttr("borderless", borderless)
	Return Me
End Sub

Sub SetClick(click As Object) As WixSearch
Search.SetAttr("click", click)
Return Me
End Sub

Sub SetContainer(container As Object) As WixSearch
Search.SetAttr("container", container)
Return Me
End Sub

Sub SetCss(css As Object) As WixSearch
Search.SetAttr("css", css)
Return Me
End Sub

Sub SetDisabled(disabled As Boolean) As WixSearch
Search.SetAttr("disabled", disabled)
Return Me
End Sub

Sub SetFormat(format As Object) As WixSearch
Search.SetAttr("format", format)
Return Me
End Sub

Sub SetGravity(gravity As Object) As WixSearch
Search.SetAttr("gravity", gravity)
Return Me
End Sub

Sub SetHeight(height As Object) As WixSearch
Search.SetAttr("height", height)
Return Me
End Sub

Sub SetHidden(hidden As Boolean) As WixSearch
Search.SetAttr("hidden", hidden)
Return Me
End Sub

Sub SetHotkey(hotkey As Object) As WixSearch
Search.SetAttr("hotkey", hotkey)
Return Me
End Sub

Sub SetIcon(icon As Object) As WixSearch
Search.SetAttr("icon", icon)
Return Me
End Sub

Sub SetInputHeight(inputHeight As Object) As WixSearch
Search.SetAttr("inputHeight", inputHeight)
Return Me
End Sub

Sub SetInputWidth(inputWidth As Object) As WixSearch
Search.SetAttr("inputWidth", inputWidth)
Return Me
End Sub

Sub SetInvalid(invalid As Object) As WixSearch
Search.SetAttr("invalid", invalid)
Return Me
End Sub

Sub SetMaxHeight(maxHeight As Object) As WixSearch
Search.SetAttr("maxHeight", maxHeight)
Return Me
End Sub

Sub SetMaxWidth(maxWidth As Object) As WixSearch
Search.SetAttr("maxWidth", maxWidth)
Return Me
End Sub

Sub SetPattern(pattern As Object) As WixSearch
Search.SetAttr("pattern", pattern)
Return Me
End Sub

Sub SetPopup(popup As Object) As WixSearch
Search.SetAttr("popup", popup)
Return Me
End Sub

Sub SetReadonly(readonly As Boolean) As WixSearch
Search.SetAttr("readonly", readonly)
Return Me
End Sub

Sub SetRelatedAction(relatedAction As Object) As WixSearch
Search.SetAttr("relatedAction", relatedAction)
Return Me
End Sub

Sub SetRelatedView(relatedView As Object) As WixSearch
Search.SetAttr("relatedView", relatedView)
Return Me
End Sub

Sub SetSuggest(suggest As Object) As WixSearch
Search.SetAttr("suggest", suggest)
Return Me
End Sub

Sub SetType(sType As Object) As WixSearch
Search.SetAttr("type", sType)
Return Me
End Sub

Sub SetWidth(width As Object) As WixSearch
Search.SetAttr("width", width)
Return Me
End Sub

Sub SetAlign(align As Object) As WixSearch
Search.SetAttr("align", align)
Return Me
End Sub

Sub SetInputAlign(inputAlign As Object) As WixSearch
Search.SetAttr("inputAlign", inputAlign)
Return Me
End Sub