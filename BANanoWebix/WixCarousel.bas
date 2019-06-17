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
End Sub

'Initializes the accordion
Public Sub Initialize(sid As String) As WixCarousel
	ID = sid.tolowercase
	Carousel.Initialize(ID)
	Carousel.SetView("carousel")
	Return Me
End Sub

'set scroll speed
Sub SetScrollSpeed(s As Int) As WixCarousel
	Carousel.SetProperty("scrollSpeed", s)
	Return Me
End Sub

'return the item
Sub Item As Map
	Return Carousel.item
End Sub

'add slide
Sub AddSlide(sld As WixElement)
	Carousel.AddColumns(sld.Item)
End Sub