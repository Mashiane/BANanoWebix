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
	pg.Initialize("").SetHeader("Lesson 7: WixCharts")
	'define chart data
	Dim chartData As List
	chartData.Initialize
	chartData.Add(CreateMap("count" : 65, "dollars" : 130, "color" : "#ff0000", "type" : "AA"))
	chartData.Add(CreateMap("count" : 120, "dollars" : 280, "color" : "#00ff00", "type" : "BB"))
	chartData.Add(CreateMap("count" : 50, "dollars" : 98, "color" : "#0000ff", "type" : "CC" ))
	chartData.Add(CreateMap("count" : 90, "dollars" : 110, "color" : "#ffff00", "type" : "DD"))
	
	pg.Page.AddRows(CreateMap("height":10))
	'
	Dim R1 As WixRow
	R1.Initialize("")
	'
	R1.AddColumns(CreateMap("width":10))
	Dim wchart As WixChart
	wchart.Initialize("").SetTypeArea("").SetValue("#count#").SetLabel("#count#").SetWidth(300).SetHeight(200).SetData(chartData)
	R1.AddColumns(wchart.Item)
	'
	R1.AddColumns(CreateMap("width":10))
	Dim w1 As WixChart
	w1.Initialize("").SetTypeBar("").SetValue("#count#").SetLabel("#count#").SetWidth(300).SetHeight(200).SetData(chartData)
	w1.SetBarWidth(100).SetRadius(10).SetGradient("3d")
	R1.AddColumns(w1.Item)
	'
	R1.AddColumns(CreateMap("width":10))
	Dim w2 As WixChart
	w2.Initialize("").SetTypeBarH("").SetValue("#count#").SetLabel("#count#").SetWidth(300).SetHeight(200).SetData(chartData)
	w2.SetBarWidth(20).SetRadius(10).SetGradient("falling").SetPadding(40)
	R1.AddColumns(w2.Item)
	R1.AddColumns(CreateMap())
	'
	pg.Page.AddRow(R1)
	'
	pg.Page.AddRows(CreateMap("height":10))
	Dim R2 As WixRow
	R2.Initialize("")
	'
	R2.AddColumns(CreateMap("width":10))
	Dim w3 As WixChart
	w3.Initialize("").SetTypeDonut("").SetValue("#count#").SetColor("#color#").SetLabel("#count#").SetData(chartData).SetShadow(20)
	w3.SetWidth(300).SetHeight(200)
	'.SetPieInnerText($""<span style=\"color:#82c0ff;font-weight:bold;padding:10px;\">#type#</span>""$)
	R2.AddColumns(w3.Item)
	'
	R2.AddColumns(CreateMap("width":10))
	Dim w4 As WixChart
	w4.Initialize("").SetTypeLine("").SetValue("#count#").SetLabel("#count#").SetWidth(300).SetHeight(200).SetData(chartData)
	w4.SetLine("#ffa0d0",10)
	R2.AddColumns(w4.Item)
	'
	R2.AddColumns(CreateMap("width":10))
	Dim w5 As WixChart
	w5.Initialize("").SetTypePie("").SetValue("#count#").SetLabel("#count#").SetColor("#color#").SetWidth(300).SetHeight(200).SetData(chartData)
	w5.SetShadow(20).SetLegend(90,"right")
	R2.AddColumns(w5.Item)
	R2.AddColumns(CreateMap())
	'
	pg.Page.AddRow(R2)
	pg.Page.AddRows(CreateMap("height":10))
	
	Dim R3 As WixRow
	R3.Initialize("")
	R3.AddColumns(CreateMap("width":10))
	Dim w6 As WixChart
	w6.Initialize("").SetTypePie3D("").SetValue("#count#").SetLabel("#count#").SetColor("#color#").SetWidth(300).SetHeight(200).SetData(chartData)
	R3.AddColumns(w6.Item)
	'
	R3.AddColumns(CreateMap("width":10))
	Dim w7 As WixChart
	w7.Initialize("").SetTypeStackedArea("").SetValue("#count#").SetLabel("#count#").SetColor("#color#").SetWidth(300).SetHeight(200).SetData(chartData)
	R3.AddColumns(w7.Item)
	'
	R3.AddColumns(CreateMap("width":10))
	Dim w8 As WixChart
	w8.Initialize("").SetTypeSpline("").SetValue("#count#").SetLabel("#count#").SetColor("#color#").SetWidth(300).SetHeight(200).SetData(chartData)
	R3.AddColumns(w8.Item)
	'
	'
	R3.AddColumns(CreateMap("width":10))
	Dim w9 As WixChart
	w9.Initialize("").SetStackedBarH("").SetValue("#count#").SetLabel("#count#").SetColor("#color#").SetWidth(300).SetHeight(200).SetData(chartData)
	w9.SetRadius(10).SetShadow("falling")
	R3.AddColumns(w9.Item)
	R3.AddColumns(CreateMap())
	'
	pg.Page.AddRow(R3)
	pg.Page.AddRows(CreateMap("height":10))
	 
	'generate ui
	pg.ui 
End Sub