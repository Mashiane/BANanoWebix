B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public MultiView As WixElement
End Sub

'Initializes the MultiView
Public Sub Initialize(sid As String) As WixMultiView
	ID = sid.tolowercase
	MultiView.Initialize(ID)
	MultiView.SetView("multiview")
	Return Me
End Sub

Sub AddItem(i As Map) As WixMultiView
	MultiView.AddCells(i)
	Return Me
End Sub

Sub SetVisibleBatch(v As Object) As WixMultiView
	MultiView.SetAttr("visibleBatch", v)
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixMultiView
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		MultiView.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


Sub SetPadding(p As Object) As WixMultiView
	MultiView.SetPadding(p)
	Return Me
End Sub

Sub SetTemplateHTML(h As UOENowHTML) As WixMultiView
	h.SetImportant(False)
	Dim os As String = h.HTML
	MultiView.SetTemplate(os)
	Return Me
End Sub

'set name
Sub SetName(n As String) As WixMultiView
	MultiView.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixMultiView
	MultiView.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixMultiView
	MultiView.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixMultiView
	MultiView.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixMultiView
	MultiView.SetMinHeight(h)
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixMultiView
	MultiView.SetTooltip(tt)
	Return Me
End Sub


'return the item
Sub Item As Map
	Return MultiView.item
End Sub

'set fitBiggest
Sub SetFitBiggest(b As Boolean) As WixMultiView
	MultiView.SetAttr("fitBiggest", b)
	Return Me
End Sub

'set animate
Sub SetAnimate(b As Boolean) As WixMultiView
	MultiView.SetAttr("animate", b)
	Return Me
End Sub

'set keepViews
Sub SetkeepViews(b As Boolean) As WixMultiView
	MultiView.SetAttr("keepViews", b)
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


Sub SetBorderless(borderless As Boolean) As WixMultiView
MultiView.SetAttr("borderless", borderless)
Return Me
End Sub

Sub SetCells(cells As Object) As WixMultiView
MultiView.SetAttr("cells", cells)
Return Me
End Sub

Sub SetCols(cols As Object) As WixMultiView
MultiView.SetAttr("cols", cols)
Return Me
End Sub

Sub SetContainer(container As Object) As WixMultiView
MultiView.SetAttr("container", container)
Return Me
End Sub

Sub SetCss(css As Object) As WixMultiView
MultiView.SetAttr("css", css)
Return Me
End Sub

Sub SetDisabled(disabled As Boolean) As WixMultiView
MultiView.SetAttr("disabled", disabled)
Return Me
End Sub

Sub SetGravity(gravity As Object) As WixMultiView
MultiView.SetAttr("gravity", gravity)
Return Me
End Sub

Sub SetHeight(height As Object) As WixMultiView
MultiView.SetAttr("height", height)
Return Me
End Sub

Sub SetHidden(hidden As Boolean) As WixMultiView
MultiView.SetAttr("hidden", hidden)
Return Me
End Sub


Sub SetMaxHeight(maxHeight As Object) As WixMultiView
MultiView.SetAttr("maxHeight", maxHeight)
Return Me
End Sub

Sub SetMaxWidth(maxWidth As Object) As WixMultiView
MultiView.SetAttr("maxWidth", maxWidth)
Return Me
End Sub

Sub SetRows(rows As Object) As WixMultiView
MultiView.SetAttr("rows", rows)
Return Me
End Sub

Sub SetWidth(width As Object) As WixMultiView
MultiView.SetAttr("width", width)
Return Me
End Sub
