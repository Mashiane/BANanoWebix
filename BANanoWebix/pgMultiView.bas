﻿B4J=true
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
	pg.Page.setType("clean")
'	Dim tblBar As WixToolBar
'	tblBar.Initialize("")
'	tblBar.ToolBar.SetHeight(50)
'	'
'	Dim btnNew As WixButton
'	btnNew.Initialize("btnNew").SetLabel("New").SetWidth(90).SetTypeIconButton("").SetIcon("file").AddToToolbar(tblBar)
'	'
'	Dim btnOpen As WixButton
'	btnOpen.Initialize("btnOpen").SetLabel("Open").SetWidth(90).SetTypeIconButton("").SetIcon("folder-open").AddToToolbar(tblBar)
'	'
'	Dim btnClose As WixButton
'	btnClose.Initialize("btnClose").SetLabel("Close").SetWidth(90).SetTypeIconButton("").SetIcon("window-close").AddToToolbar(tblBar)
'	'
'	pg.Page.AddRows(tblBar.Item)
'	'
	Dim c As WixCarousel
	c.Initialize("")
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
	pg.Page.AddRows(c.Item)
	'
	pg.Page.AddRowsSpacer
	'
	'add segment
	Dim sg As WixSegmented
	sg.Initialize("") 
	sg.Segmented.SetValue("left")
	sg.Segmented.SetMultiView(True)
	sg.AddOption("rick", "Rick","Alcoholic<br>Science Genius<br>Father of Beth")
	sg.AddOption("morty", "Morty","14 years old<br>Mortiest Morty<br>Sidekick")
	'
	pg.Page.AddRows(sg.Item)
	'IMPORTANT
	pg.Page.AddRowsCells(sg.Cells)
	'
	pg.Page.AddRowsSpacer
	'
	Dim tb As WixTabView
	tb.Initialize("")
	tb.AddItem("","Entry","Some form controls here",CreateMap("css":"entry"))
	tb.AddItem("","Results","Some results of data entry here",CreateMap("css":"results"))
	pg.Page.AddRows(tb.Item)
	
	'
	pg.ui
End Sub