B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Resizer As WixElement
End Sub

'initialize the input box
Public Sub Initialize(iID As String) As WixResizer
	ID = iID.tolowercase
	Resizer.Initialize(iID).SetView("resizer")
	Return Me
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub


Sub SetTemplateHTML(h As UOENowHTML) As WixResizer
	h.SetImportant(False)
	Dim os As String = h.HTML
	Resizer.SetTemplate(os)
	Return Me
End Sub

'return the item
Sub Item As Map
	Return Resizer.item
End Sub

'add as a column iten
Sub AddToColumns(parent As WixElement)
	parent.AddColumns(Item)
End Sub

'use a map object
Sub SetMap(m As Map) As WixResizer
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		Resizer.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


'add to parent rows
Sub AddToRows(P As WixElement)
	P.AddRows(Item)
End Sub

'add to parent elements
Sub AddToElements(P As WixElement)
	P.AddElements(Item)
End Sub


Sub SetAnimate(animate As Boolean) As WixResizer
	Resizer.SetAttr("animate", animate)
	Return Me
End Sub

Sub SetBorderless(borderless As Boolean) As WixResizer
	Resizer.SetAttr("borderless", borderless)
	Return Me
End Sub

Sub SetContainer(container As Object) As WixResizer
	Resizer.SetAttr("container", container)
	Return Me
End Sub

Sub SetCss(css As Object) As WixResizer
	Resizer.SetAttr("css", css)
	Return Me
End Sub

Sub SetDisabled(disabled As Boolean) As WixResizer
	Resizer.SetAttr("disabled", disabled)
	Return Me
End Sub

Sub SetGravity(gravity As Object) As WixResizer
	Resizer.SetAttr("gravity", gravity)
	Return Me
End Sub

Sub SetHeight(height As Object) As WixResizer
	Resizer.SetAttr("height", height)
	Return Me
End Sub

Sub SetHidden(hidden As Boolean) As WixResizer
	Resizer.SetAttr("hidden", hidden)
	Return Me
End Sub

Sub SetMaxHeight(maxHeight As Object) As WixResizer
	Resizer.SetAttr("maxHeight", maxHeight)
	Return Me
End Sub

Sub SetMaxWidth(maxWidth As Object) As WixResizer
	Resizer.SetAttr("maxWidth", maxWidth)
	Return Me
End Sub

Sub SetMinHeight(minHeight As Object) As WixResizer
	Resizer.SetAttr("minHeight", minHeight)
	Return Me
End Sub

Sub SetMinWidth(minWidth As Object) As WixResizer
	Resizer.SetAttr("minWidth", minWidth)
	Return Me
End Sub

Sub SetWidth(width As Object) As WixResizer
	Resizer.SetAttr("width", width)
	Return Me
End Sub
