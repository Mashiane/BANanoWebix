B4J=true
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
End Sub

'Initializes the accordion
Public Sub Initialize(sid As String) As WixCarousel
	ID = sid.tolowercase
	Carousel.Initialize(ID)
	Carousel.SetView("carousel")
	nav.Initialize(ID & "nav") 
	Return Me
End Sub

'set scroll speed
Sub SetScrollSpeed(s As Int) As WixCarousel
	Carousel.SetProperty("scrollSpeed", s)
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
