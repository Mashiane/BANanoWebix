﻿B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Spacer As WixElement
	Public Parent As WixElement
End Sub

'Initializes the spacer
Public Sub Initialize(sid As String) As WixSpacer
	ID = sid.tolowercase
	Spacer.Initialize(ID).SetView("spacer")
	Parent = Null
	Return Me
End Sub


'set css
Sub SetStyle(prop As String, sval As String) As WixSpacer
	Spacer.SetStyle(prop,sval)
	Return Me
End Sub

'set padding
Sub SetPadding(padding As Object) As WixSpacer
	Spacer.SetPadding(padding)
	Return Me
End Sub

'set padding
Sub SetMargin(margin As Object) As WixSpacer
	Spacer.SetMargin(margin)
	Return Me
End Sub

Sub SetAttributes(m As Map) As WixSpacer
	For Each k As String In m.Keys
		Dim v As String = m.Get(k)
		Spacer.SetAttr(k,v)
	Next
	Return Me
End Sub

Sub SetStyles(m As Map) As WixSpacer
	For Each k As String In m.Keys
		Dim v As String = m.Get(k)
		Spacer.SetStyle(k,v)
	Next
	Return Me
End Sub

'set the parent
Sub SetParent(p As WixElement) As WixSpacer
	Parent = p
	Return Me
End Sub


'return the item
Sub Item As Map
	Return Spacer.item
End Sub

'add tp columns of parent
Sub Pop
	Parent.AddColumns(Item)
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
