B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.51
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private pg As WixPage
End Sub

Sub Init
	pg.Initialize("")

	Dim c As WixCarousel
	c.Initialize("")
	c.Carousel.SetWidth(400)
	c.Carousel.SetHeight(300)
	'c.SetScrollSpeed(300)
	'create slides
	Dim sld1 As WixElement
	sld1.Initialize("")
	sld1.SetTemplate("Gilligan")
	sld1.SetStyle("background-color", "#ff0000")
	sld1.SetStyle("color", "#ffff00")
	sld1.AddToColumns(c.Carousel)
	'
	Dim sld2 As WixElement
	sld2.Initialize("")
	sld2.SetTemplate("Professor")
	sld2.SetStyle("background-color", "#00ff00")
	sld2.SetStyle("color", "#000000")
	c.AddSlide(sld2)
	'
	Dim sld3 As WixElement
	sld3.Initialize("")
	sld3.SetTemplate("Mary Ann")
	sld3.SetStyle("background-color", "#0000ff")
	sld3.SetStyle("color", "#ffffff")
	c.AddSlide(sld3)
	
	pg.Page = c.carousel 
	pg.ui	 
End Sub