B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public DBLList As WixElement
	Public Parent As WixElement

End Sub

'initialize the input box
Public Sub Initialize(iID As String) As WixDBLList
	ID = iID.tolowercase
	DBLList.Initialize(iID).SetView("dbllist")
	Parent = Null
	Return Me
End Sub


Sub SetAttributes(m As Map) As WixDBLList
	For Each k As String In m.Keys
		Dim v As String = m.Get(k)
		DBLList.SetAttr(k,v)
	Next
	Return Me
End Sub

Sub SetStyles(m As Map) As WixDBLList
	For Each k As String In m.Keys
		Dim v As String = m.Get(k)
		DBLList.SetStyle(k,v)
	Next
	Return Me
End Sub

'set css
Sub SetStyle(prop As String, sval As String) As WixDBLList
	DBLList.SetStyle(prop,sval)
	Return Me
End Sub


'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'add tp columns of parent
Sub Pop
	Parent.AddColumns(Item)
End Sub

'set the parent
Sub SetParent(p As WixElement) As WixDBLList
	Parent = p
	Return Me
End Sub


Sub SetTemplateHTML(h As UOENowHTML) As WixDBLList
	h.SetImportant(False)
	Dim os As String = h.HTML
	DBLList.SetTemplate(os)
	Return Me
End Sub

'set name
Sub SetName(n As String) As WixDBLList
	DBLList.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixDBLList
	DBLList.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixDBLList
	DBLList.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixDBLList
	DBLList.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixDBLList
	DBLList.SetMinHeight(h)
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixDBLList
	DBLList.SetTooltip(tt)
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixDBLList
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		DBLList.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


'return the item
Sub Item As Map
	Return DBLList.item
End Sub


'set height
Sub SetHeight(h As Object) As WixDBLList
	DBLList.SetHeight(h)
	Return Me
End Sub

'set data
Sub SetData(d As List) As WixDBLList
	DBLList.SetData(d)
	Return Me
End Sub

'set value
Sub SetValue(v As String) As WixDBLList
	DBLList.SetValue(v)
	Return Me
End Sub

'set label
Sub SetLabel(l As String) As WixDBLList
	DBLList.SetLabel(l)
	Return Me
End Sub

'set required
Sub SetRequired(b As Boolean) As WixDBLList
	DBLList.SetRequired(b)
	Return Me
End Sub

'set label align
Sub SetLabelAlign(a As String) As WixDBLList
	DBLList.SetLabelAlign(a)
	Return Me
End Sub

'set label position
Sub SetLabelPosition(p As String) As WixDBLList
	DBLList.SetLabelPosition(p)
	Return Me
End Sub

'set label width
Sub SetLabelWidth(w As Int) As WixDBLList
	DBLList.SetLabelWidth(w)
	Return Me
End Sub

'set align right
Sub SetAlignRight(r As String) As WixDBLList 'ignore
	DBLList.setAlignright("")
	Return Me
End Sub

'set align center
Sub SetAlignCenter(r As String) As WixDBLList 'ignore
	DBLList.setAligncenter("")
	Return Me
End Sub

'set align left
Sub SetAlignLeft(r As String) As WixDBLList 'ignore
	DBLList.SetAlignleft("")
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

Sub SetAnimate(animate As Boolean) As WixDbllist
	Dbllist.SetAttr("animate", animate)
	Return Me
End Sub

Sub SetBorderless(borderless As Boolean) As WixDBLList
	DBLList.SetAttr("borderless", borderless)
	Return Me
End Sub

Sub SetButtons(buttons As Object) As WixDBLList
	DBLList.SetAttr("buttons", buttons)
	Return Me
End Sub

Sub SetContainer(container As Object) As WixDBLList
	DBLList.SetAttr("container", container)
	Return Me
End Sub

Sub SetCss(css As Object) As WixDBLList
	DBLList.SetAttr("css", css)
	Return Me
End Sub

Sub SetDatatype(datatype As Object) As WixDBLList
DBLList.SetAttr("datatype", datatype)
Return Me
End Sub

Sub SetDisabled(disabled As Boolean) As WixDBLList
DBLList.SetAttr("disabled", disabled)
Return Me
End Sub

Sub SetGravity(gravity As Object) As WixDBLList
DBLList.SetAttr("gravity", gravity)
Return Me
End Sub

Sub SetHidden(hidden As Boolean) As WixDBLList
DBLList.SetAttr("hidden", hidden)
Return Me
End Sub

Sub SetLabelBottomLeft(labelBottomLeft As Object) As WixDBLList
DBLList.SetAttr("labelBottomLeft", labelBottomLeft)
Return Me
End Sub

Sub SetLabelBottomRight(labelBottomRight As Object) As WixDBLList
DBLList.SetAttr("labelBottomRight", labelBottomRight)
Return Me
End Sub

Sub SetLabelLeft(labelLeft As Object) As WixDBLList
DBLList.SetAttr("labelLeft", labelLeft)
Return Me
End Sub

Sub SetLabelRight(labelRight As Object) As WixDBLList
DBLList.SetAttr("labelRight", labelRight)
Return Me
End Sub

Sub SetList(list As Object) As WixDBLList
DBLList.SetAttr("list", list)
Return Me
End Sub

Sub SetMaxHeight(maxHeight As Object) As WixDBLList
DBLList.SetAttr("maxHeight", maxHeight)
Return Me
End Sub

Sub SetMaxWidth(maxWidth As Object) As WixDBLList
DBLList.SetAttr("maxWidth", maxWidth)
Return Me
End Sub

Sub SetPadding(padding As Object) As WixDBLList
DBLList.SetAttr("padding", padding)
Return Me
End Sub

Sub SetPaddingX(paddingX As Object) As WixDBLList
DBLList.SetAttr("paddingX", paddingX)
Return Me
End Sub

Sub SetPaddingY(paddingY As Object) As WixDBLList
DBLList.SetAttr("paddingY", paddingY)
Return Me
End Sub

Sub SetType(sType As Object) As WixDBLList
DBLList.SetAttr("type", sType)
Return Me
End Sub

Sub SetUrl(url As Object) As WixDBLList
DBLList.SetAttr("url", url)
Return Me
End Sub

Sub SetWidth(width As Object) As WixDBLList
DBLList.SetAttr("width", width)
Return Me
End Sub