B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.51
@EndOfDesignText@
'Static code module
#IgnoreWarnings:12
Sub Process_Globals
	Private pg As WixPage
	Public BANano As BANano
End Sub

Sub Init(pgContainer As String)
	pg.Initialize("wp", pgContainer).SetHeader("Lesson 12: Property [Sheet]").SetResponsive("master")
	'
	Dim color_options As List
	color_options.Initialize 
	color_options.Add(CreateMap("id":1, "value":"red"))
	color_options.Add(CreateMap("id":2, "value":"blue"))
	color_options.Add(CreateMap("id":3, "value":"green"))
	color_options.Add(CreateMap("id":4, "value":"orange"))
	color_options.Add(CreateMap("id":5, "value":"grey"))
	color_options.Add(CreateMap("id":6, "value":"yellow"))
	'
	Dim position_options As List
	position_options.Initialize
	position_options.Add(CreateMap("id":1, "value":"left"))
	position_options.Add(CreateMap("id":2, "value":"right"))
	position_options.Add(CreateMap("id":3, "value":"top"))
	position_options.Add(CreateMap("id":4, "value":"bottom"))
	'
	Dim load_types As List
	load_types.Initialize
	load_types.Add("json")
	load_types.Add("xml")
	load_types.Add("csv")
	'
	
	Dim prop As WixProperty
	prop.Initialize("prop").setwidth(500).setnamewidth(200)
	'prop.SetComplexData(True)
	
	prop.AddLabel("Layout")
	prop.AddTextBox("width", "Width", 250)
	prop.AddTextBox("height", "Height", "")
	prop.AddPassword("pass", "Password", "")
	'
	prop.AddLabel("Data loading")
	prop.AddTextBox("url", "Data url", "http://bananowebix.com/data")
	prop.AddSelect("type", "Type","", load_types)
	prop.AddSelect("position", "Position","", position_options)
	prop.AddDate("date", "Date","",pg.LocaleLongDateFormat)
	prop.AddCombo("color", "Color","", color_options)
	prop.AddCheckBox("jsonp", "Use JSONP", "")
	prop.AddColor("bg","Background","")
	
	pg.AddRows(prop.Item)
	'
	pg.ui
	'attach events
	Dim fid, fstate As Object
	pg.OnCheck("prop", BANano.CallBack(Me, "prop_change", Array(fid, fstate)))
	
	Dim e As Object
	'pg.onTimedKeyPress("prop", BANano.CallBack(Me, "prop_keypress", Array(e)))
	
	Dim e As Object
	pg.onEnter("prop", BANano.CallBack(Me, "prop_onenter", Array(e)))
	
End Sub

Sub prop_onenter(e As Object)
	'get everything
	Dim rec As Map = pg.GetValues("prop")
	'
	pg.Message(BANano.ToJson(rec))
End Sub

Sub prop_keypress(e As Object)
	Log(e)
End Sub

Sub prop_change(fid As String, fstate As Boolean)
	Log(fid)
	Log(fstate)
	
	'get everything
	Dim rec As Map = pg.GetValues("prop")
	'
	pg.Message(BANano.ToJson(rec))
	
End Sub