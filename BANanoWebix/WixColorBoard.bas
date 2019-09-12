B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Colorboard As WixElement
	Public Parent As WixElement
End Sub

'Initializes the colorboard
Public Sub Initialize(sid As String) As WixColorBoard
	ID = sid.tolowercase
	Colorboard.Initialize(ID).SetView("colorboard")
	Parent = Null
	Return Me
End Sub

'set the parent
Sub SetParent(p As WixElement) As WixColorBoard
	Parent = p
	Return Me
End Sub

'set padding
Sub SetPadding(padding As Object) As WixColorBoard
	Colorboard.SetPadding(padding)
	Return Me
End Sub

'set padding
Sub SetMargin(margin As Object) As WixColorBoard
	Colorboard.SetMargin(margin)
	Return Me
End Sub

Sub SetAttributes(m As Map) As WixColorBoard
	For Each k As String In m.Keys
		Dim v As String = m.Get(k)
		Colorboard.SetAttr(k,v)
	Next
	Return Me
End Sub

Sub SetStyles(m As Map) As WixColorBoard
	For Each k As String In m.Keys
		Dim v As String = m.Get(k)
		Colorboard.SetStyle(k,v)
	Next
	Return Me
End Sub

'set css
Sub SetStyle(prop As String, sval As String) As WixColorBoard
	Colorboard.SetStyle(prop,sval)
	Return Me
End Sub

'add tp columns of parent
Sub Pop
	Parent.AddColumns(Item)
End Sub

'return the item
Sub Item As Map
	Return Colorboard.item
End Sub

Sub SetAnimate(animate As Boolean) As WixColorBoard
	Colorboard.SetAttr("animate", animate)
	Return Me
End Sub

Sub SetBorderless(borderless As Boolean) As WixColorBoard
	Colorboard.SetAttr("borderless", borderless)
	Return Me
End Sub

Sub SetCols(cols As Object) As WixColorBoard
	Colorboard.SetAttr("cols", cols)
	Return Me
End Sub

Sub SetContainer(container As Object) As WixColorBoard
	Colorboard.SetAttr("container", container)
	Return Me
End Sub

Sub SetCss(css As Object) As WixColorBoard
	Colorboard.SetAttr("css", css)
	Return Me
End Sub

Sub SetDisabled(disabled As Boolean) As WixColorBoard
	Colorboard.SetAttr("disabled", disabled)
	Return Me
End Sub

Sub SetGravity(gravity As Object) As WixColorBoard
	Colorboard.SetAttr("gravity", gravity)
	Return Me
End Sub

Sub SetHeight(height As Object) As WixColorBoard
	Colorboard.SetAttr("height", height)
	Return Me
End Sub

Sub SetHidden(hidden As Boolean) As WixColorBoard
	Colorboard.SetAttr("hidden", hidden)
	Return Me
End Sub

Sub SetMaxHeight(maxHeight As Object) As WixColorBoard
	Colorboard.SetAttr("maxHeight", maxHeight)
	Return Me
End Sub

Sub SetMaxLightness(maxLightness As Object) As WixColorBoard
	Colorboard.SetAttr("maxLightness", maxLightness)
	Return Me
End Sub

Sub SetMaxWidth(maxWidth As Object) As WixColorBoard
	Colorboard.SetAttr("maxWidth", maxWidth)
	Return Me
End Sub

Sub SetMinHeight(minHeight As Object) As WixColorBoard
	Colorboard.SetAttr("minHeight", minHeight)
	Return Me
End Sub

Sub SetMinLightness(minLightness As Object) As WixColorBoard
	Colorboard.SetAttr("minLightness", minLightness)
	Return Me
End Sub

Sub SetMinWidth(minWidth As Object) As WixColorBoard
	Colorboard.SetAttr("minWidth", minWidth)
	Return Me
End Sub

Sub SetNavigation(navigation As Boolean) As WixColorBoard
	Colorboard.SetAttr("navigation", navigation)
	Return Me
End Sub

Sub SetPalette(palette As Object) As WixColorBoard
	Colorboard.SetAttr("palette", palette)
	Return Me
End Sub

Sub SetRows(rows As Object) As WixColorBoard
	Colorboard.SetAttr("rows", rows)
	Return Me
End Sub

Sub SetTemplate(template As Object) As WixColorBoard
	Colorboard.SetAttr("template", template)
	Return Me
End Sub

Sub SetValue(value As Object) As WixColorBoard
	Colorboard.SetAttr("value", value)
	Return Me
End Sub

Sub SetWidth(width As Object) As WixColorBoard
	Colorboard.SetAttr("width", width)
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