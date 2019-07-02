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
End Sub

Sub Init(pgContainer As String)
	pg.Initialize("",pgContainer)
	pg.SetHeader("Lesson 7: WixCharts")
	'define chart data
	Dim chartData As List
	chartData.Initialize
	chartData.Add(CreateMap("count" : 65, "dollars" : 130, "color" : "#ff0000", "type" : "AA"))
	chartData.Add(CreateMap("count" : 120, "dollars" : 280, "color" : "#00ff00", "type" : "BB"))
	chartData.Add(CreateMap("count" : 50, "dollars" : 98, "color" : "#0000ff", "type" : "CC" ))
	chartData.Add(CreateMap("count" : 90, "dollars" : 110, "color" : "#ffff00", "type" : "DD"))
	
	pg.AddRows(CreateMap("height":10))
	'
	Dim R1 As WixRow
	R1.Initialize("")
	'
	'area chart
	R1.AddColumns(CreateMap("width":10))
	Dim wchart As WixChart
	wchart.Initialize("")
	wchart.SetTypeSpLineArea("")
	wchart.SetValue("#count#")
	wchart.SetLabel("#count#")
	wchart.SetWidth(300)
	wchart.SetHeight(200)
	wchart.SetData(chartData)
	wchart.SetColor("#36abee")
	wchart.SetAlpha(0.8)
	wchart.SetXAxisTemplate("#type#")
	wchart.SetTooltipTemplate("#count#")
	wchart.SetBorder(True)
	R1.AddColumns(wchart.Item)
	'
	'bar chart
	R1.AddColumns(CreateMap("width":10))
	Dim w1 As WixChart
	w1.Initialize("")
	w1.SetTypeBar("")
	w1.SetValue("#count#")
	w1.SetLabel("#count#")
	w1.SetWidth(300)
	w1.SetHeight(200)
	w1.SetData(chartData)
	w1.SetBarWidth(35)
	w1.SetRadius(0)
	w1.SetGradientFalling("")
	w1.SetXAxisTemplate("#type#")
	'.SetGradient("3d")
	R1.AddColumns(w1.Item)
	'
	'horizontal bar
	R1.AddColumns(CreateMap("width":10))
	Dim w2 As WixChart
	w2.Initialize("")
	w2.SetTypeBarH("")
	w2.SetValue("#count#")
	w2.SetLabel("#count#")
	w2.SetWidth(300)
	w2.SetHeight(200)
	w2.SetData(chartData)
	w2.SetBarWidth(20)
	w2.SetRadius(10)
	w2.SetGradient("falling")
	w2.SetPadding(40)
	w2.SetYAxisTemplate("#type#")
	R1.AddColumns(w2.Item)
	'
	'radar chart
	R1.AddColumns(CreateMap("width":10))
	Dim wa As WixChart
	wa.Initialize("")
	wa.SetTypeRadar("")
	wa.SetValue("#count#")
	wa.SetWidth(300)
	wa.SetHeight(200)
	wa.SetData(chartData)
	wa.SetDisableLines(True)
	wa.SetXAxisTemplate("#type#")
	wa.SetYAxisLineShape("arc")
	wa.SetYAxisBG("#fffbf4")
	wa.SetTooltipTemplate("#count#")
	wa.SetItemBorderWidth(0)
	wa.SetItemColor("#3a838e")
	wa.SetItemRadius(2)
	R1.AddColumns(wa.Item)
	R1.AddColumns(CreateMap())
		
	'
	pg.AddRow(R1)
	'
	pg.AddRows(CreateMap("height":10))
	Dim R2 As WixRow
	R2.Initialize("")
	'
	'donut chart
	R2.AddColumns(CreateMap("width":10))
	Dim w3 As WixChart
	w3.Initialize("")
	w3.SetTypeDonut("")
	w3.SetValue("#count#")
	w3.SetColor("#color#")
	w3.SetLabel("#type#")
	w3.SetData(chartData)
	w3.SetShadow(20)
	w3.SetWidth(300)
	w3.SetHeight(200)
	w3.SetPieInnerText("#count#")
	R2.AddColumns(w3.Item)
	'
	'line chart
	R2.AddColumns(CreateMap("width":10))
	Dim w4 As WixChart
	w4.Initialize("")
	w4.SetTypeLine("")
	w4.SetValue("#count#")
	w4.SetLabel("#count#")
	w4.SetWidth(300)
	w4.SetHeight(200)
	w4.SetData(chartData)
	w4.SetLineColor("#ffa0d0")
	w4.SetLineWidth(10)
	w4.SetXAxisTemplate("#type#")
	w4.SetOffSet(0)
	w4.SetItemBorderColor("#1293f8")
	w4.SetItemColor("#ffffff")
	R2.AddColumns(w4.Item)
	'
	'pie chart
	R2.AddColumns(CreateMap("width":10))
	Dim w5 As WixChart
	w5.Initialize("")
	w5.SetTypePie("")
	w5.SetValue("#count#")
	w5.SetPieInnerText("#count#")
	w5.SetLabel("#type#")
	w5.SetColor("#color#")
	w5.SetWidth(300)
	w5.SetHeight(200)
	w5.SetData(chartData)
	'w5.SetShadow(20).SetLegend(90,"right")
	R2.AddColumns(w5.Item)
	'
	'scatter chart
	R2.AddColumns(CreateMap("width":10))
	Dim wb As WixChart
	wb.Initialize("")
	wb.SetTypeScatter("")
	wb.SetValue("#dollars#")
	wb.SetXValue("#count#")
	wb.SetWidth(300)
	wb.SetHeight(200)
	wb.SetData(chartData)
	wb.SetXAxisTitle("Count")
	wb.SetYAxisTitle("Dollars")
	wb.SetItemBorderColor("#f38f00")
	wb.SetItemBorderWidth(1)
	wb.SetItemRadius(5)
	wb.SetItemTypeDiamond("")
	wb.SetItemColor("#ff9600")
	wb.SetItemShadow(True)
	R2.AddColumns(wb.Item)
	R2.AddColumns(CreateMap())
	
	'
	pg.AddRow(R2)
	pg.AddRows(CreateMap("height":10))
	
	'pie3D chart
	Dim R3 As WixRow
	R3.Initialize("")
	R3.AddColumns(CreateMap("width":10))
	Dim w6 As WixChart
	w6.Initialize("")
	w6.SetTypePie3D("")
	w6.SetValue("#count#")
	w6.SetLabel("#type#")
	w6.SetColor("#color#")
	w6.SetWidth(300)
	w6.SetHeight(200)
	w6.SetData(chartData)
	w6.SetPieInnerText("#count#")
	R3.AddColumns(w6.Item)
	'
	'stacked area
	R3.AddColumns(CreateMap("width":10))
	Dim w7 As WixChart
	w7.Initialize("")
	w7.SetTypeStackedArea("")
	w7.SetValue("#count#")
	w7.SetLabel("#count#")
	w7.SetColor("#color#")
	w7.SetWidth(300)
	w7.SetHeight(200)
	w7.SetData(chartData)
	w7.SetXAxisTemplate("#type#")
	R3.AddColumns(w7.Item)
	'
	'spline chart
	R3.AddColumns(CreateMap("width":10))
	Dim w8 As WixChart
	w8.Initialize("")
	w8.SetTypeSpline("")
	w8.SetValue("#count#")
	w8.SetLabel("#count#")
	w8.SetColor("#color#")
	w8.SetWidth(300)
	w8.SetHeight(200)
	w8.SetData(chartData)
	w8.SetXAxisTemplate("#type#")
	R3.AddColumns(w8.Item)
	'
	'
	'stacked horizontal bar
	R3.AddColumns(CreateMap("width":10))
	Dim w9 As WixChart
	w9.Initialize("")
	w9.SetStackedBarH("")
	w9.SetValue("#count#")
	w9.SetLabel("#count#")
	w9.SetColor("#color#")
	w9.SetWidth(300)
	w9.SetHeight(200)
	w9.SetData(chartData)
	w9.SetRadius(10)
	w9.SetShadow("falling")
	w9.SetYAxisTemplate("#type#")
	R3.AddColumns(w9.Item)
	R3.AddColumns(CreateMap())
	'
	pg.AddRow(R3)
	pg.AddRows(CreateMap("height":10))
	 
	'generate ui
	pg.ui 
End Sub