B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Process_Globals
	Private pg As WixPage
	Public myForm As WixForm
	Public BANano As BANano
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Init()
	pg.Initialize("forms").SetHeader("Lesson 9: DataView")
	
	Dim R1 As WixRow
	R1.Initialize("R1")
		
	'define data table
	Dim dt As WixDataView
	dt.Initialize("dv")
	dt.SetxCount(4).Setwidth(640).SetHeight(250).SetBorderless(False)
	dt.SetStyle("margin" , "10px").SetSelect(True).SetMultiselect(True)
	'
	Dim tmp As UOENowHTML
	tmp.Initialize("tmp", "div")
	tmp.AddStyle("background-color", "#ffeaea")
	tmp.AddClass("webix_strong")
	tmp.AddContent("#title#")
	tmp.AddContentAfter(" Year: #year#{BR}System: #system#")
	dt.SetTemplate(tmp.HTML)
	'
	Dim data As List
	data.Initialize
	data.Add(CreateMap("title" : "Pitfall", "year" : 1982, "system" : "Atari 2600"))
	data.Add(CreateMap("title" : "Pick Axe Pete", "year" : 1982, "system" : "Odyssey2"))
	data.Add(CreateMap("title" : "Ladybug", "year" : 1981, "system" : "Colecovision"))
	data.Add(CreateMap("title" : "Altered Beast", "year" : 1988, "system" : "Sega Genesis"))
	data.Add(CreateMap("title" : "Halo", "year" : 2001, "system" : "Xbox"))
	data.Add(CreateMap("title" : "Crash Bandicoot", "year" : 1996, "system" : "Playstation"))
	data.Add(CreateMap("title" : "Guitar Hero", "year" : 2005, "system" : "Playstation 2"))
	dt.SetData(data)
	Dim e As BANanoEvent
	dt.SetClick(BANano.CallBack(Me,"dataview_click", Array(e)))
	'dt.SetDblClick(BANano.CallBack(Me,"dataview_dblclick", Array(e)))
	'
	R1.AddItem(dt.Item)
	'
	pg.Page.AddRow(R1)
	'
	pg.UI
End Sub

Sub dataview_click(e As BANanoEvent)
	'find selected
	Dim selItem As Object = pg.GetSelected("dv")
	Log(selItem)
End Sub

Sub dataview_dblclick(e As BANanoEvent)
	Log(e)
End Sub