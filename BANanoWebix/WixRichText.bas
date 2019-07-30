B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public RichText As WixElement
	Public Parent As WixElement
End Sub

'initialize the input box
Public Sub Initialize(iID As String) As WixRichText
	ID = iID.tolowercase
	RichText.Initialize(iID).SetView("richtext")
	Parent = Null
	Return Me
End Sub

'add tp columns of parent
Sub Pop
	Parent.AddColumns(Item)
End Sub

'set the parent
Sub SetParent(p As WixElement) As WixRichText
	Parent = p
	Return Me
End Sub


'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub


Sub SetValidateEvent(e As Object) As WixRichText    'ignore
	RichText.SetAttr("validateEvent", e)
	Return Me
End Sub

Sub SetValidateEventBlur(b As Boolean) As WixRichText    'ignore
	RichText.SetAttr("validateEvent", "blur")
	Return Me
End Sub

Sub SetValidateEventKey(b As Boolean) As WixRichText     'ignore
	RichText.SetAttr("validateEvent", "key")
	Return Me
End Sub

'set validate
Sub SetValidateIsNotEmpty(b As Boolean) As WixRichText   'ignore
	RichText.SetAttr("validate","isNotEmpty")
	Return Me
End Sub


'set validate
Sub SetValidate(v As Object) As WixRichText   'ignore
	RichText.SetAttr("validate",v)
	Return Me
End Sub


'set invalid message
Sub SetInvalidMessage(msg As String) As WixRichText
	RichText.SetAttr("invalidMessage", msg)
	Return Me
End Sub


'set required
Sub SetRequired(b As Boolean) As WixRichText
	RichText.SetAttr("required", b)
	Return Me
End Sub


'use a map object
Sub SetMap(m As Map) As WixRichText
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		RichText.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


'set the placeholder
Sub SetPlaceHolder(ph As String) As WixRichText
	RichText.SetPlaceHolder(ph)
	Return Me
End Sub

Sub SetTemplateHTML(h As UOENowHTML) As WixRichText
	h.SetImportant(False)
	Dim os As String = h.HTML
	RichText.SetTemplate(os)
	Return Me
End Sub

'set name
Sub SetName(n As String) As WixRichText
	RichText.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixRichText
	RichText.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixRichText
	RichText.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixRichText
	RichText.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixRichText
	RichText.SetMinHeight(h)
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixRichText
	RichText.SetTooltip(tt)
	Return Me
End Sub

'set style
Sub SetStyle(prop As String, val As String) As WixRichText
	RichText.SetStyle(prop,val)
	Return Me
End Sub

'return the item
Sub Item As Map
	Return RichText.item
End Sub

'set height
Sub SetHeight(h As Object) As WixRichText
	RichText.SetHeight(h)
	Return Me
End Sub

'set value
Sub SetValue(v As String) As WixRichText
	RichText.SetValue(v)
	Return Me
End Sub

'set label
Sub SetLabel(l As String) As WixRichText
	RichText.SetLabel(l)
	Return Me
End Sub


'set bottom label
Sub SetBottomLabel(f As Object) As WixRichText
	RichText.SetAttr("bottomLabel", f)
	Return Me
End Sub

'set bottom padding
Sub SetBottomPadding(f As Object) As WixRichText
	RichText.SetAttr("bottomPadding", f)
	Return Me
End Sub

'set label align
Sub SetLabelAlign(a As String) As WixRichText
	RichText.SetLabelAlign(a)
	Return Me
End Sub

'set label position
Sub SetLabelPosition(p As String) As WixRichText
	RichText.SetLabelPosition(p)
	Return Me
End Sub

'set label width
Sub SetLabelWidth(w As Int) As WixRichText
	RichText.SetLabelWidth(w)
	Return Me
End Sub

'set align right
Sub SetAlignRight(r As String) As WixRichText 'ignore
	RichText.setAlignright("")
	Return Me
End Sub

'set align center
Sub SetAlignCenter(r As String) As WixRichText 'ignore
	RichText.setAligncenter("")
	Return Me
End Sub

'set align left
Sub SetAlignLeft(r As String) As WixRichText 'ignore
	RichText.SetAlignleft("")
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


Sub SetAnimate(animate As Boolean) As WixRichtext
	Richtext.SetAttr("animate", animate)
	Return Me
End Sub

Sub SetBorderless(borderless As Boolean) As WixRichtext
	Richtext.SetAttr("borderless", borderless)
	Return Me
End Sub

Sub SetContainer(container As Object) As WixRichText
	RichText.SetAttr("container", container)
	Return Me
End Sub

Sub SetCss(css As Object) As WixRichText
	RichText.SetAttr("css", css)
	Return Me
End Sub

Sub SetDisabled(disabled As Boolean) As WixRichText
	RichText.SetAttr("disabled", disabled)
	Return Me
End Sub

Sub SetGravity(gravity As Object) As WixRichText
	RichText.SetAttr("gravity", gravity)
	Return Me
End Sub

Sub SetHidden(hidden As Boolean) As WixRichText
RichText.SetAttr("hidden", hidden)
Return Me
End Sub

Sub SetMaxHeight(maxHeight As Object) As WixRichText
RichText.SetAttr("maxHeight", maxHeight)
Return Me
End Sub

Sub SetMaxWidth(maxWidth As Object) As WixRichText
RichText.SetAttr("maxWidth", maxWidth)
Return Me
End Sub

Sub SetPadding(padding As Object) As WixRichText
RichText.SetAttr("padding", padding)
Return Me
End Sub

Sub SetPaddingX(paddingX As Object) As WixRichText
RichText.SetAttr("paddingX", paddingX)
Return Me
End Sub

Sub SetPaddingY(paddingY As Object) As WixRichText
RichText.SetAttr("paddingY", paddingY)
Return Me
End Sub

Sub SetType(sType As Object) As WixRichText
RichText.SetAttr("type", sType)
Return Me
End Sub

Sub SetWidth(width As Object) As WixRichText
RichText.SetAttr("width", width)
Return Me
End Sub