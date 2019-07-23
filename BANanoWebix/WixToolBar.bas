B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.5
@EndOfDesignText@
#IgnoreWarnings:12
'icons: http://www.entypo.com/
Sub Class_Globals
	Public ID As String
	Public ToolBar As WixElement
End Sub

'add to page
Sub AddToPage(pg As WixPage)
	ToolBar.AddToRows(pg.Page)
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(sID As String) As WixToolBar
	ID = sID.tolowercase
	ToolBar.Initialize(ID).SetView("toolbar")
	Return Me
End Sub


Sub SetTemplateHTML(h As UOENowHTML) As WixToolBar
	Dim os As String = h.HTML
	ToolBar.SetTemplate(os)
	Return Me
End Sub

'set name
Sub SetName(n As String) As WixToolBar
	ToolBar.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixToolBar
	ToolBar.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixToolBar
	ToolBar.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixToolBar
	ToolBar.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixToolBar
	ToolBar.SetMinHeight(h)
	Return Me
End Sub

'set height
Sub SetHeight(h As Int) As WixToolBar
	ToolBar.SetHeight(h)
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixToolBar
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		ToolBar.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub

'set padding
Sub SetPadding(p As String) As WixToolBar
	ToolBar.SetAttr("padding", p)
	Return Me
End Sub

'set margin
Sub SetMargin(m As Int) As WixToolBar
	ToolBar.SetAttr("margin", m)
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixToolBar
	ToolBar.SetTooltip(tt)
	Return Me
End Sub

'return the item
Sub Item As Map
	Return ToolBar.item
End Sub

'add a button
Sub AddButton(btn As WixButton) As WixToolBar
	ToolBar.AddColumns(btn.item)
	Return Me
End Sub

Sub AddToggle(btn As WixToggle) As WixToolBar
	ToolBar.AddColumns(btn.item)
	Return Me
End Sub

Sub AddLabel(btn As WixLabel) As WixToolBar
	ToolBar.AddColumns(btn.item)
	Return Me
End Sub

Sub AddElement(btn As WixElement) As WixToolBar
	ToolBar.AddColumns(btn.item)
	Return Me
End Sub

'add a button and define it
Sub CreateButton(sid As String) As WixButton
	Dim btn As WixButton
	btn.Initialize(sid)
	btn.parent = ToolBar
	Return btn
End Sub

'add an icon and define it
Sub CreateIcon(sid As String) As WixIcon
	Dim btn As WixIcon
	btn.Initialize(sid).SetParent(ToolBar)
	Return btn
End Sub

'add a label
Sub CreateLabel(sid As String) As WixLabel
	Dim lbl As WixLabel
	lbl.Initialize(sid).setparent(ToolBar)
	Return lbl
End Sub

'add a label
Sub CreateElement(sid As String) As WixElement
	Dim lbl As WixElement
	lbl.Initialize(sid)
	Return lbl
End Sub

'add a toggle button and define it
Sub CreateToggle(sid As String) As WixToggle
	Dim btn As WixToggle
	btn.Initialize(sid).SetParent(ToolBar)
	Return btn
End Sub



Sub CreateAvatar(sid As String, imgURL As String, statusColor As String, Styles As Map) As WixElement
	Dim img As UOENowHTML
	img.Initialize("","img").SetSRC(imgURL,True).SetStyle("border-radius", "25px").SetStyle("width", "35px").SetStyle("height", "35px")
	img.SetStyle("cursor", "pointer")
	'
	If Styles <> Null Then
		For Each mk As String In Styles.Keys
			Dim mv As String = Styles.Get(mk)
			img.SetStyle(mk,mv)	
		Next
	End If
	'
	Dim span As UOENowHTML
	span.Initialize("","span").AddClass("webix_icon mdi mdi-circle status ").AddClass(statusColor)
	'
	Dim sb As StringBuilder
	sb.Initialize 
	sb.Append(img.HTML).Append(span.HTML)
	
	Dim avatar As WixElement
	avatar.Initialize(sid).SetTemplate(sb.ToString)
	Return avatar
End Sub

'add a spacer
Sub AddSpacer As WixToolBar
	ToolBar.AddColumnsSpacer("")
	Return Me 
End Sub

'add icon
Sub AddIcon(icn As WixIcon) As WixToolBar
	ToolBar.AddColumns(icn.Item)
	Return Me
End Sub

'add elements
Sub AddElements(e As Map) As WixToolBar
	ToolBar.AddElements(e)
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

Sub SetContainer(container As String) As WixToolBar
	ToolBar.SetAttr("container", container)
	Return Me
End Sub

Sub SetBorderless(borderless As Boolean) As WixToolBar
	ToolBar.SetAttr("borderless", borderless)
	Return Me
End Sub

Sub SetGravity(gravity As String) As WixToolBar
	ToolBar.SetAttr("gravity", gravity)
	Return Me
End Sub

Sub SetHidden(hidden As Boolean) As WixToolBar
ToolBar.SetAttr("hidden", hidden)
Return Me
End Sub

Sub SetIsolate(isolate As Boolean) As WixToolBar
ToolBar.SetAttr("isolate", isolate)
Return Me
End Sub

Sub SetMaxHeight(maxHeight As String) As WixToolBar
ToolBar.SetAttr("maxHeight", maxHeight)
Return Me
End Sub

Sub SetMaxWidth(maxWidth As String) As WixToolBar
ToolBar.SetAttr("maxWidth", maxWidth)
Return Me
End Sub

Sub SetPaddingX(paddingX As String) As WixToolBar
ToolBar.SetAttr("paddingX", paddingX)
Return Me
End Sub

Sub SetPaddingY(paddingY As String) As WixToolBar
ToolBar.SetAttr("paddingY", paddingY)
Return Me
End Sub

Sub SetScroll(scroll As String) As WixToolBar
ToolBar.SetAttr("scroll", scroll)
Return Me
End Sub

Sub SetVisibleBatch(visibleBatch As String) As WixToolBar
ToolBar.SetAttr("visibleBatch", visibleBatch)
Return Me
End Sub

Sub SetWidth(width As String) As WixToolBar
ToolBar.SetAttr("width", width)
Return Me
End Sub