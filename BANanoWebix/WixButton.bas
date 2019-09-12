B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.5
@EndOfDesignText@
#IgnoreWarnings:12
'icons http://www.entypo.com/
Sub Class_Globals
	Public ID As String
	Public Button As WixElement
	Public Parent As WixElement
End Sub

'Initializes the button
Public Sub Initialize(bID As String) As WixButton
	ID = bID.ToLowerCase
	Button.Initialize(ID).SetView("button")
	Parent = Null
	Return Me
End Sub


'set label align
Sub SetLabelAlign(a As String) As WixButton
	Button.SetLabelAlign(a)
	Return Me
End Sub

'set label position
Sub SetLabelPosition(p As String) As WixButton
	Button.SetLabelPosition(p)
	Return Me
End Sub

Sub SetHidden(b As Boolean) As WixButton
	Button.SetAttr("hidden", b)
	Return Me
End Sub

Sub SetDisabled(b As Boolean) As WixButton
	Button.SetAttr("disabled", b)
	Return Me
End Sub

'set label width
Sub SetLabelWidth(w As Int) As WixButton
	Button.SetLabelWidth(w)
	Return Me
End Sub

Sub SetTemplateHTML(h As UOENowHTML) As WixButton
	h.SetImportant(False)
	Dim os As String = h.HTML
	Button.SetTemplate(os)
	Return Me
End Sub

Sub SetBadge(b As Object) As WixButton
	Button.SetAttr("badge", b)
	Return Me
End Sub

'set name
Sub SetName(n As String) As WixButton
	Button.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixButton
	Button.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixButton
	Button.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixButton
	Button.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixButton
	Button.SetMinHeight(h)
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixButton
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		Button.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub

'sub SetInputWidth
Sub SetInputWidth(w As Int) As WixButton
	Button.SetInputWidth(w)
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixButton
	Button.SetAttr("tooltip", tt)
	Return Me
End Sub

'set style
Sub SetStyle(prop As String, val As String) As WixButton
	Button.SetStyle(prop,val)
	Return Me
End Sub

'add tp columns of parent
Sub Pop
	Parent.AddColumns(Item)
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'add to toolbar
Sub AddToToolbar(tblB As WixToolBar)
	tblB.ToolBar.AddColumns(Item)
End Sub

'set value
Sub SetValue(v As String) As WixButton
	Button.SetValue(v)
	Return Me
End Sub

'set onclick event
Sub SetClick(e As BANanoObject) As WixButton
	Button.SetAttr("click", e)
	Return Me
End Sub

'return the item to add
Sub Item As Map
	Return Button.item
End Sub

'set the parent
Sub SetParent(p As WixElement) As WixButton
	Parent = p
	Return Me
End Sub

'set padding
Sub SetPadding(padding As Object) As WixButton
	Button.SetPadding(padding)
	Return Me
End Sub

'set padding
Sub SetMargin(margin As Object) As WixButton
	Button.SetMargin(margin)
	Return Me
End Sub

'set batch
Sub SetBatch(b As Int) As WixButton
	Button.SetBatch(b)
	Return Me
End Sub

'set the image
Sub SetImage(img As String) As WixButton
	Button.SetAttr("image", img)
	Return Me
End Sub

'set the icon
Sub SetIcon(icn As String) As WixButton
	Button.SetAttr("icon", icn)
	Return Me
End Sub

'set primary
Sub SetCSSPrimary(b As Boolean) As WixButton   'ignore
	Button.SetCSS("webix_primary")
	Return Me
End Sub

'set transparent
Sub SetCSSTransparent(b As Boolean) As WixButton   'ignore
	Button.SetCSS("webix_transparent")
	Return Me
End Sub

'set danger
Sub SetCSSDanger(b As Boolean) As WixButton     'ignore
	Button.SetCSS("webix_danger")
	Return Me
End Sub

'set danger
Sub SetCSSSecondary(b As Boolean) As WixButton     'ignore
	Button.SetCSS("webix_secondary")
	Return Me
End Sub

'set danger
Sub SetPopUp(i As Object) As WixButton     'ignore
	Button.SetAttr("popup", i)
	Return Me
End Sub

'set label
Sub SetLabel(lbl As String) As WixButton
	Button.SetLabel(lbl)
	Button.Setvalue(lbl)
	Return Me
End Sub

'set type icon button
Sub SetTypeStandard(i As String) As WixButton 'ignore
	Button.SetAttr("type", "standard")
	Return Me
End Sub

'set type icon button
Sub SetTypeIcon(i As String) As WixButton 'ignore
	Button.SetAttr("type", "icon")
	Return Me
End Sub

'set image button
Sub SetTypeImage(r As String) As WixButton  'ignore
	Button.SetAttr("type", "image")
	Return Me
End Sub

'set image top
Sub SetTypeImageTop(r As String) As WixButton  'ignore
	Button.SetAttr("type", "imageTop")
	Return Me
End Sub

'button type iconbuttontop
Sub SetTypeIconTop(r As String) As WixButton  'ignore
	Button.SetAttr("type", "iconTop")
	Return Me
End Sub

'set height
Sub SetHeight(h As Object) As WixButton
	Button.SetHeight(h)
	Return Me
End Sub

'set width
Sub SetWidth(w As Object) As WixButton
	Button.SetWidth(w)
	Return Me
End Sub


Sub SetAttributes(m As Map) As WixButton
	For Each k As String In m.Keys
		Dim v As String = m.Get(k)
		Button.SetAttr(k,v)
	Next
	Return Me
End Sub

Sub SetStyles(m As Map) As WixButton
	For Each k As String In m.Keys
		Dim v As String = m.Get(k)
		Button.SetStyle(k,v)
	Next
	Return Me
End Sub

'set align right
Sub SetAlignRight(r As String) As WixButton 'ignore
	Button.setAlignright("")
	Return Me
End Sub

'set align center
Sub SetAlignCenter(r As String) As WixButton 'ignore
	Button.setAligncenter("")
	Return Me
End Sub

'set align left
Sub SetAlignLeft(r As String) As WixButton 'ignore
	Button.SetAlignleft("")
	Return Me
End Sub

'set auto width
Sub SetAutoWidth(b As Boolean) As WixButton 'ignore
	Button.SetAutoWidth(b)
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

Sub SetAlign(align As Object) As WixButton
	Button.SetAttr("align", align)
	Return Me
End Sub

Sub SetAnimate(animate As Boolean) As WixButton
	Button.SetAttr("animate", animate)
	Return Me
End Sub


Sub SetBorderless(borderless As Boolean) As WixButton
Button.SetAttr("borderless", borderless)
Return Me
End Sub


Sub SetContainer(container As Object) As WixButton
Button.SetAttr("container", container)
Return Me
End Sub

Sub SetCss(css As Object) As WixButton
Button.SetAttr("css", css)
Return Me
End Sub


Sub SetGravity(gravity As Object) As WixButton
Button.SetAttr("gravity", gravity)
Return Me
End Sub

Sub SetHotkey(hotkey As Object) As WixButton
Button.SetAttr("hotkey", hotkey)
Return Me
End Sub

Sub SetInputHeight(inputHeight As Object) As WixButton
Button.SetAttr("inputHeight", inputHeight)
Return Me
End Sub

Sub SetMaxHeight(maxHeight As Object) As WixButton
Button.SetAttr("maxHeight", maxHeight)
Return Me
End Sub

Sub SetMaxWidth(maxWidth As Object) As WixButton
Button.SetAttr("maxWidth", maxWidth)
Return Me
End Sub

Sub SetType(sType As Object) As WixButton
Button.SetAttr("type", sType)
Return Me
End Sub

Sub SetFAB(b As Boolean)   'ignore
	Button.SetStyle("border-radius","60px")
	Button.SetStyle("font-size","60px")
	Button.SetStyle("line-height","47px")
	Button.SetWidth(60)
	Button.SetHeight(60)
	Button.SetStyle("position","fixed")
	Button.SetStyle("bottom","1rem")
	Button.SetStyle("right","1rem")
End Sub