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
	'
	'define data table
	Dim dt As WixDataView
	dt.Initialize("dv")
	dt.SetxCount(4).Setwidth(640).SetHeight(250).SetBorderless(False).SetItemHeight(100)
	dt.SetStyle("margin" , "10px").SetSelect(True).SetMultiSelect(False)
	Dim tmp As UOENowHTML
	tmp.Initialize("tmp", "div")
	tmp.AddStyle("background-color", "#ffeaea")
	tmp.AddClass("webix_strong")
	tmp.AddContent("#title#")
	tmp.AddContentAfter(" Year: #year#{BR}System: #system#")
	dt.SetTemplate(tmp.HTML)
	
	dt.SetData(data)
	'
	R1.AddItem(dt.Item)
	'
	pg.Page.AddRow(R1)
	'
	pg.UI
	'
	Dim recs As List
	pg.OnSelectChange("tmp", BANano.CallBack(Me,"dataview_click", Array(recs)))
	
End Sub

Sub dataview_click(recs As List)
	Dim recid As String = recs.Get(0)
	recid = pg.CStr(recid)
	'find selected
	Dim selItem As Map = pg.getitem("dv",recid)
	pg.Message(BANano.ToJson(selItem))
End Sub

Sub dataview_dblclick(e As BANanoEvent)
	'Dim selItem As Object = pg.GetSelected("dv")
	'pg.Message(selItem)
End Sub