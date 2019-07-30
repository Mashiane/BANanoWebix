B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public FieldSet As WixElement
	Private body As WixElement
	Public Parent As WixElement

End Sub

'Initializes the FieldSet
Public Sub Initialize(sid As String) As WixFieldSet
	ID = sid.tolowercase
	FieldSet.Initialize(ID)
	FieldSet.SetView("fieldset")
	body.Initialize(ID & "body") 
	Parent = Null
	Return Me
End Sub

'set the parent
Sub SetParent(p As WixElement) As WixFieldSet
	Parent = p
	Return Me
End Sub


'add tp columns of parent
Sub Pop
	Parent.AddColumns(Item)
End Sub

Sub SetTemplateHTML(h As UOENowHTML) As WixFieldSet
	h.SetImportant(False)
	Dim os As String = h.HTML
	FieldSet.SetTemplate(os)
	Return Me
End Sub

'set name
Sub SetName(n As String) As WixFieldSet
	FieldSet.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixFieldSet
	FieldSet.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixFieldSet
	FieldSet.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixFieldSet
	FieldSet.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixFieldSet
	FieldSet.SetMinHeight(h)
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixFieldSet
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		FieldSet.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


'set tooltip
Sub SetTooltip(tt As String) As WixFieldSet
	FieldSet.SetTooltip(tt)
	Return Me
End Sub

'add an element
Sub AddItem(itm As Map) As WixFieldSet
	body.AddRows(itm)
	Return Me
End Sub

'add an element
Sub AddRows(itm As Map) As WixFieldSet
	body.AddRows(itm)
	Return Me
End Sub

'return the item
Sub Item As Map
	FieldSet.SetAttr("body", body.item)
	Return FieldSet.item
End Sub

'set label
Sub SetLabel(l As String) As WixFieldSet
	FieldSet.SetLabel(l)
	Return Me
End Sub

'set height
Sub SetHeight(h As Object) As WixFieldSet
	FieldSet.SetHeight(h)
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

Sub SetAnimate(animate As Boolean) As WixFieldSet
	FieldSet.SetAttr("animate", animate)
	Return Me
End Sub

Sub SetBody(xbody As Object) As WixFieldSet
	FieldSet.SetAttr("body", xbody)
	Return Me
End Sub

Sub SetBorderless(borderless As Boolean) As WixFieldSet
	FieldSet.SetAttr("borderless", borderless)
	Return Me
End Sub

Sub SetContainer(container As Object) As WixFieldSet
	FieldSet.SetAttr("container", container)
	Return Me
End Sub

Sub SetCss(css As Object) As WixFieldSet
	FieldSet.SetAttr("css", css)
	Return Me
End Sub

Sub SetDisabled(disabled As Boolean) As WixFieldSet
	FieldSet.SetAttr("disabled", disabled)
	Return Me
End Sub

Sub SetGravity(gravity As Object) As WixFieldSet
	FieldSet.SetAttr("gravity", gravity)
	Return Me
End Sub

Sub SetHidden(hidden As Boolean) As WixFieldSet
FieldSet.SetAttr("hidden", hidden)
Return Me
End Sub

Sub SetMaxHeight(maxHeight As Object) As WixFieldSet
FieldSet.SetAttr("maxHeight", maxHeight)
Return Me
End Sub

Sub SetMaxWidth(maxWidth As Object) As WixFieldSet
FieldSet.SetAttr("maxWidth", maxWidth)
Return Me
End Sub

Sub SetPaddingX(paddingX As Object) As WixFieldSet
FieldSet.SetAttr("paddingX", paddingX)
Return Me
End Sub

Sub SetPaddingY(paddingY As Object) As WixFieldSet
FieldSet.SetAttr("paddingY", paddingY)
Return Me
End Sub

Sub SetWidth(width As Object) As WixFieldSet
FieldSet.SetAttr("width", width)
Return Me
End Sub