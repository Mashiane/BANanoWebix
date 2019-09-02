B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Label As WixElement
	Public Parent As WixElement
End Sub

'initialize the input box
Public Sub Initialize(iID As String) As WixLabel
	ID = iID.tolowercase
	Label.Initialize(iID).SetView("label")
	Parent = Null
	Return Me
End Sub


'set css
Sub SetStyle(prop As String, sval As String) As WixLabel
	Label.SetStyle(prop,sval)
	Return Me
End Sub


'return the item
Sub Item As Map
	Return Label.item
End Sub

'add tp columns of parent
Sub Pop
	Parent.AddColumns(Item)
End Sub

Sub SetTemplateHTML(h As UOENowHTML) As WixLabel
	h.SetImportant(False)
	Dim os As String = h.HTML
	Label.SetTemplate(os)
	Return Me
End Sub

Sub SetFormat(f As Object) As WixLabel
	Label.SetAttr("format",f)
	Return Me
End Sub

'set name
Sub SetName(n As String) As WixLabel
	Label.SetName(n)
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixLabel
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		Label.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


'set reponsive
Sub SetResponsive(b As Object) As WixLabel
	Label.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixLabel
	Label.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixLabel
	Label.SetMinWidth(w)
	Return Me
End Sub

'set the parent
Sub SetParent(p As WixElement) As WixLabel
	Parent = p
	Return Me
End Sub


'set minheight
Sub SetMinHeight(h As Int) As WixLabel
	Label.SetMinHeight(h)
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixLabel
	Label.SetTooltip(tt)
	Return Me
End Sub

'set label
Sub SetLabel(l As String) As WixLabel
	Label.SetLabel(l)
	Return Me
End Sub

'set align
Sub SetAlign(a As String) As WixLabel
	Label.SetAttr("align", a)
	Return Me
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub


'set align right
Sub SetAlignRight(r As String) As WixLabel 'ignore
	Label.setAlignright("")
	Return Me
End Sub

'set align center
Sub SetAlignCenter(r As String) As WixLabel 'ignore
	Label.setAligncenter("")
	Return Me
End Sub

'set align left
Sub SetAlignLeft(r As String) As WixLabel 'ignore
	Label.SetAlignleft("")
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

Sub SetAnimate(animate As Boolean) As WixLabel
	Label.SetAttr("animate", animate)
	Return Me
End Sub

Sub SetAutowidth(autowidth As Boolean) As WixLabel
	Label.SetAttr("autowidth", autowidth)
	Return Me
End Sub

Sub SetBorderless(borderless As Boolean) As WixLabel
	Label.SetAttr("borderless", borderless)
	Return Me
End Sub

Sub SetClick(click As Object) As WixLabel
	Label.SetAttr("click", click)
	Return Me
End Sub

Sub SetContainer(container As Object) As WixLabel
	Label.SetAttr("container", container)
	Return Me
End Sub

Sub SetCss(css As Object) As WixLabel
	Label.SetAttr("css", css)
	Return Me
End Sub

Sub SetDisabled(disabled As Boolean) As WixLabel
	Label.SetAttr("disabled", disabled)
	Return Me
End Sub

Sub SetGravity(gravity As Object) As WixLabel
	Label.SetAttr("gravity", gravity)
	Return Me
End Sub

Sub SetHeight(height As Object) As WixLabel
	Label.SetAttr("height", height)
	Return Me
End Sub

Sub SetHidden(hidden As Boolean) As WixLabel
	Label.SetAttr("hidden", hidden)
	Return Me
End Sub

Sub SetHotkey(hotkey As Object) As WixLabel
	Label.SetAttr("hotkey", hotkey)
	Return Me
End Sub

Sub SetInputHeight(inputHeight As Object) As WixLabel
	Label.SetAttr("inputHeight", inputHeight)
	Return Me
End Sub

Sub SetInputWidth(inputWidth As Object) As WixLabel
	Label.SetAttr("inputWidth", inputWidth)
	Return Me
End Sub

Sub SetMaxHeight(maxHeight As Object) As WixLabel
Label.SetAttr("maxHeight", maxHeight)
Return Me
End Sub

Sub SetMaxWidth(maxWidth As Object) As WixLabel
Label.SetAttr("maxWidth", maxWidth)
Return Me
End Sub

Sub SetPopup(popup As Object) As WixLabel
Label.SetAttr("popup", popup)
Return Me
End Sub

Sub SetValue(value As Object) As WixLabel
Label.SetAttr("value", value)
Return Me
End Sub

Sub SetWidth(width As Object) As WixLabel
Label.SetAttr("width", width)
Return Me
End Sub