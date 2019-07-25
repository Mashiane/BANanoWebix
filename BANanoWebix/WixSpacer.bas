B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Spacer As WixElement
End Sub

'Initializes the spacer
Public Sub Initialize(sid As String) As WixSpacer
	ID = sid.tolowercase
	Spacer.Initialize(ID).SetView("spacer")
	Return Me
End Sub

'return the item
Sub Item As Map
	Return Spacer.item
End Sub

Sub SetAnimate(animate As Boolean) As WixSpacer
	Spacer.SetAttr("animate", animate)
	Return Me
End Sub

Sub SetBorderless(borderless As Boolean) As WixSpacer
	Spacer.SetAttr("borderless", borderless)
	Return Me
End Sub

Sub SetContainer(container As Object) As WixSpacer
	Spacer.SetAttr("container", container)
	Return Me
End Sub

Sub SetCss(css As Object) As WixSpacer
	Spacer.SetAttr("css", css)
	Return Me
End Sub

Sub SetDisabled(disabled As Boolean) As WixSpacer
	Spacer.SetAttr("disabled", disabled)
	Return Me
End Sub

Sub SetGravity(gravity As Object) As WixSpacer
	Spacer.SetAttr("gravity", gravity)
	Return Me
End Sub

Sub SetHeight(height As Object) As WixSpacer
	Spacer.SetAttr("height", height)
	Return Me
End Sub

Sub SetHidden(hidden As Boolean) As WixSpacer
	Spacer.SetAttr("hidden", hidden)
	Return Me
End Sub

Sub SetMaxHeight(maxHeight As Object) As WixSpacer
	Spacer.SetAttr("maxHeight", maxHeight)
	Return Me
End Sub

Sub SetMaxWidth(maxWidth As Object) As WixSpacer
	Spacer.SetAttr("maxWidth", maxWidth)
	Return Me
End Sub

Sub SetMinHeight(minHeight As Object) As WixSpacer
	Spacer.SetAttr("minHeight", minHeight)
	Return Me
End Sub

Sub SetMinWidth(minWidth As Object) As WixSpacer
	Spacer.SetAttr("minWidth", minWidth)
	Return Me
End Sub

Sub SetWidth(width As Object) As WixSpacer
	Spacer.SetAttr("width", width)
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
