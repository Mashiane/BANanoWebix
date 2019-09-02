B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public TabBar As WixElement
	Private options As List
	Public Parent As WixElement

End Sub

'Initializes the TabBar
Public Sub Initialize(sid As String) As WixTabBar
	ID = sid.tolowercase
	TabBar.Initialize(ID)
	TabBar.SetView("tabbar")
	options.Initialize 
	Parent = Null
	Return Me
End Sub


'set css
Sub SetStyle(prop As String, sval As String) As WixTabBar
	TabBar.SetStyle(prop,sval)
	Return Me
End Sub


'set the parent
Sub SetParent(p As WixElement) As WixTabBar
	Parent = p
	Return Me
End Sub


'use a map object
Sub SetMap(m As Map) As WixTabBar
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		TabBar.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub

'add tp columns of parent
Sub Pop
	Parent.AddColumns(Item)
End Sub

'set close
Sub SetClose(b As Boolean) As WixTabBar
	TabBar.SetAttr("close", b)
	Return Me
End Sub


'set options
Sub SetOptions(o As List) As WixTabBar
	options = o
	Return Me
End Sub

Sub SetType(w As Object) As WixTabBar
	TabBar.SetAttr("type", w)
	Return Me
End Sub


Sub SetOptionWidth(w As Object) As WixTabBar
	TabBar.SetAttr("optionWidth", w)
	Return Me
End Sub


Sub SetTemplateHTML(h As UOENowHTML) As WixTabBar
	h.SetImportant(False)
	Dim os As String = h.HTML
	TabBar.SetTemplate(os)
	Return Me
End Sub

'set name
Sub SetName(n As String) As WixTabBar
	TabBar.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixTabBar
	TabBar.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixTabBar
	TabBar.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixTabBar
	TabBar.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixTabBar
	TabBar.SetMinHeight(h)
	Return Me
End Sub

Sub AddItem(iID As String, iText As String, iIcon As String)
	AddOption(iID, iText,iIcon)
End Sub

Sub SetOptionsJSON(json As String) As WixTabBar
	TabBar.SetOptionsJSON(json)
	Return Me
End Sub



Sub SetOptionsMAP(m As Map) As WixTabBar
	For Each mk As String In m.Keys
		Dim mv As Object = m.Get(mk)
		AddOption(mk, mv,"")
	Next
	Return Me
End Sub

'add item
Sub AddOption(iID As String, iText As String, iIcon As String)
	iID = iID.tolowercase
	'
	Dim icon As UOENowHTML
	icon.Initialize("","span")
	icon.AddClass("webix_icon")
	icon.AddClass(iIcon)
	'
	Dim text As UOENowHTML
	text.Initialize("","span")
	text.SetStyle("padding-left", "4px")
	text.AddContent(iText)
	'
	Dim sb As StringBuilder
	sb.Initialize 
	sb.Append(icon.HTML)
	sb.Append(text.HTML)
	'
	Dim opt As Map = CreateMap()
	opt.Put("id", iID)
	opt.Put("value", sb.ToString)
	options.Add(opt)
End Sub


'set tooltip
Sub SetTooltip(tt As String) As WixTabBar
	TabBar.SetTooltip(tt)
	Return Me
End Sub


'set height
Sub SetHeight(h As Object) As WixTabBar
	TabBar.SetAttr("height", h)
	Return Me
End Sub

'set width
Sub SetWidth(w As Object) As WixTabBar
	TabBar.SetAttr("width", w)
	Return Me
End Sub


'set on bottom
Sub SetTypeBottom(b As Boolean) As WixTabBar   'ignore
	TabBar.SetType("bottom")
	Return Me
End Sub

'return the item
Sub Item As Map
	TabBar.SetAttr("options", options)
	Return TabBar.item
End Sub

'set multi-view
Sub SetMultiView(b As Boolean) As WixTabBar
	TabBar.SetAttr("multiview", b)
	Return Me
End Sub

'set animate
Sub SetAnimate(b As Boolean) As WixTabBar
	TabBar.SetAttr("animate", b)
	Return Me
End Sub

'set keepViews
Sub SetkeepViews(b As Boolean) As WixTabBar
	TabBar.SetAttr("keepViews", b)
	Return Me
End Sub

'set selected tab
Sub SetValue(v As Object) As WixTabBar
	TabBar.SetAttr("value", v)
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

Sub SetAlign(align As Object) As WixTabBar
	TabBar.SetAttr("align", align)
	Return Me
End Sub

Sub SetAttributes(attributes As Object) As WixTabBar
TabBar.SetAttr("attributes", attributes)
Return Me
End Sub

Sub SetBorderless(borderless As Boolean) As WixTabBar
TabBar.SetAttr("borderless", borderless)
Return Me
End Sub

Sub SetBottomLabel(bottomLabel As Object) As WixTabBar
TabBar.SetAttr("bottomLabel", bottomLabel)
Return Me
End Sub

Sub SetBottomOffset(bottomOffset As Object) As WixTabBar
TabBar.SetAttr("bottomOffset", bottomOffset)
Return Me
End Sub

Sub SetBottomPadding(bottomPadding As Object) As WixTabBar
TabBar.SetAttr("bottomPadding", bottomPadding)
Return Me
End Sub

Sub SetClick(click As Object) As WixTabBar
TabBar.SetAttr("click", click)
Return Me
End Sub

Sub SetContainer(container As Object) As WixTabBar
TabBar.SetAttr("container", container)
Return Me
End Sub

Sub SetCss(css As Object) As WixTabBar
TabBar.SetAttr("css", css)
Return Me
End Sub

Sub SetDisabled(disabled As Boolean) As WixTabBar
TabBar.SetAttr("disabled", disabled)
Return Me
End Sub

Sub SetFormat(format As Object) As WixTabBar
TabBar.SetAttr("format", format)
Return Me
End Sub

Sub SetGravity(gravity As Object) As WixTabBar
TabBar.SetAttr("gravity", gravity)
Return Me
End Sub

Sub SetHidden(hidden As Boolean) As WixTabBar
TabBar.SetAttr("hidden", hidden)
Return Me
End Sub

Sub SetHotkey(hotkey As Object) As WixTabBar
TabBar.SetAttr("hotkey", hotkey)
Return Me
End Sub

Sub SetInputAlign(inputAlign As Object) As WixTabBar
TabBar.SetAttr("inputAlign", inputAlign)
Return Me
End Sub

Sub SetInputHeight(inputHeight As Object) As WixTabBar
TabBar.SetAttr("inputHeight", inputHeight)
Return Me
End Sub

Sub SetInputWidth(inputWidth As Object) As WixTabBar
TabBar.SetAttr("inputWidth", inputWidth)
Return Me
End Sub

Sub SetInvalid(invalid As Object) As WixTabBar
TabBar.SetAttr("invalid", invalid)
Return Me
End Sub

Sub SetInvalidMessage(invalidMessage As Object) As WixTabBar
TabBar.SetAttr("invalidMessage", invalidMessage)
Return Me
End Sub

Sub SetLabel(label As Object) As WixTabBar
TabBar.SetAttr("label", label)
Return Me
End Sub

Sub SetLabelAlign(labelAlign As Object) As WixTabBar
TabBar.SetAttr("labelAlign", labelAlign)
Return Me
End Sub

Sub SetLabelPosition(labelPosition As Object) As WixTabBar
TabBar.SetAttr("labelPosition", labelPosition)
Return Me
End Sub

Sub SetLabelWidth(labelWidth As Object) As WixTabBar
TabBar.SetAttr("labelWidth", labelWidth)
Return Me
End Sub

Sub SetMaxHeight(maxHeight As Object) As WixTabBar
TabBar.SetAttr("maxHeight", maxHeight)
Return Me
End Sub

Sub SetMaxWidth(maxWidth As Object) As WixTabBar
TabBar.SetAttr("maxWidth", maxWidth)
Return Me
End Sub

Sub SetMoreTemplate(moreTemplate As Object) As WixTabBar
TabBar.SetAttr("moreTemplate", moreTemplate)
Return Me
End Sub

Sub SetPlaceholder(placeholder As Object) As WixTabBar
TabBar.SetAttr("placeholder", placeholder)
Return Me
End Sub

Sub SetPopup(popup As Object) As WixTabBar
TabBar.SetAttr("popup", popup)
Return Me
End Sub

Sub SetPopupTemplate(popupTemplate As Object) As WixTabBar
TabBar.SetAttr("popupTemplate", popupTemplate)
Return Me
End Sub

Sub SetPopupWidth(popupWidth As Object) As WixTabBar
TabBar.SetAttr("popupWidth", popupWidth)
Return Me
End Sub

Sub SetReadonly(readonly As Boolean) As WixTabBar
TabBar.SetAttr("readonly", readonly)
Return Me
End Sub

Sub SetRelatedAction(relatedAction As Object) As WixTabBar
TabBar.SetAttr("relatedAction", relatedAction)
Return Me
End Sub

Sub SetRelatedView(relatedView As Object) As WixTabBar
TabBar.SetAttr("relatedView", relatedView)
Return Me
End Sub

Sub SetRequired(required As Boolean) As WixTabBar
TabBar.SetAttr("required", required)
Return Me
End Sub

Sub SetSuggest(suggest As Object) As WixTabBar
TabBar.SetAttr("suggest", suggest)
Return Me
End Sub

Sub SetTabMargin(tabMargin As Object) As WixTabBar
TabBar.SetAttr("tabMargin", tabMargin)
Return Me
End Sub

Sub SetTabMinWidth(tabMinWidth As Object) As WixTabBar
TabBar.SetAttr("tabMinWidth", tabMinWidth)
Return Me
End Sub

Sub SetTabMoreWidth(tabMoreWidth As Object) As WixTabBar
TabBar.SetAttr("tabMoreWidth", tabMoreWidth)
Return Me
End Sub

Sub SetTabOffset(tabOffset As Object) As WixTabBar
TabBar.SetAttr("tabOffset", tabOffset)
Return Me
End Sub

Sub SetTabbarPopup(tabbarPopup As Object) As WixTabBar
TabBar.SetAttr("tabbarPopup", tabbarPopup)
Return Me
End Sub

Sub SetTopOffset(topOffset As Object) As WixTabBar
TabBar.SetAttr("topOffset", topOffset)
Return Me
End Sub

Sub SetValidate(validate As Object) As WixTabBar
TabBar.SetAttr("validate", validate)
Return Me
End Sub

Sub SetValidateEvent(validateEvent As Object) As WixTabBar
TabBar.SetAttr("validateEvent", validateEvent)
Return Me
End Sub

Sub SetYCount(yCount As Object) As WixTabBar
TabBar.SetAttr("yCount", yCount)
Return Me
End Sub