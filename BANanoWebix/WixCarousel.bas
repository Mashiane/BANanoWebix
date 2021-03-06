﻿B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Carousel As WixElement
	Private nav As WixElement
	Public Parent As WixElement

End Sub

'Initializes the Carousel
Public Sub Initialize(sid As String) As WixCarousel
	ID = sid.tolowercase
	Carousel.Initialize(ID)
	Carousel.SetView("carousel")
	nav.Initialize(ID & "nav")
	Parent = Null
	Return Me
End Sub

'set padding
Sub SetPadding(padding As Object) As WixCarousel
	Carousel.SetPadding(padding)
	Return Me
End Sub

'set padding
Sub SetMargin(margin As Object) As WixCarousel
	Carousel.SetMargin(margin)
	Return Me
End Sub

Sub SetAttributes(m As Map) As WixCarousel
	For Each k As String In m.Keys
		Dim v As String = m.Get(k)
		Carousel.SetAttr(k,v)
	Next
	Return Me
End Sub

Sub SetStyles(m As Map) As WixCarousel
	For Each k As String In m.Keys
		Dim v As String = m.Get(k)
		Carousel.SetStyle(k,v)
	Next
	Return Me
End Sub

'set css
Sub SetStyle(prop As String, sval As String) As WixCarousel
	Carousel.SetStyle(prop,sval)
	Return Me
End Sub


'set the parent
Sub SetParent(p As WixElement) As WixCarousel
	Parent = p
	Return Me
End Sub


'add tp columns of parent
Sub Pop
	Parent.AddColumns(Item)
End Sub

Sub SetTemplateHTML(h As UOENowHTML) As WixCarousel
	h.SetImportant(False)
	Dim os As String = h.HTML
	Carousel.SetTemplate(os)
	Return Me
End Sub

'set name
Sub SetName(n As String) As WixCarousel
	Carousel.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixCarousel
	Carousel.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixCarousel
	Carousel.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixCarousel
	Carousel.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixCarousel
	Carousel.SetMinHeight(h)
	Return Me
End Sub

'set scroll speed
Sub SetScrollSpeed(s As Int) As WixCarousel
	Carousel.SetAttr("scrollSpeed", s)
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixCarousel
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		Carousel.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


'return the item
Sub Item As Map
	Carousel.SetAttr("navigation", nav.Item)
	Return Carousel.item
End Sub

'add slide
Sub AddSlide(sld As WixElement)
	Carousel.AddColumns(sld.Item)
End Sub

'set side navigation
Sub SetNavigationTypeSide(r As String) As WixCarousel  'ignore
	nav.SetAttr("type", "side")
	Return Me
End Sub

'set side navigation items
Sub SetNavigationItems(r As Boolean) As WixCarousel
	nav.SetAttr("items", r)
	Return Me
End Sub

'set side navigation buttons
Sub SetNavigationButtons(r As Boolean) As WixCarousel
	nav.SetAttr("buttons", r)
	Return Me
End Sub


'set side navigation
Sub SetNavigationTypeCorner(r As String) As WixCarousel   'ignore
	nav.SetAttr("type", "corner")
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