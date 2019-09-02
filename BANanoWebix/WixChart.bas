B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Chart As WixElement
	Private ChartItem As Map
	Private ChartLine As Map
	Private yAxis As Map
	Private xAxis As Map
	Private Tooltip As Map
	Private Padding As Map
	Public Parent As WixElement

End Sub

'set the parent
Sub SetParent(p As WixElement) As WixChart
	Parent = p
	Return Me
End Sub

'initialize the input box
Public Sub Initialize(iID As String) As WixChart
	ID = iID.tolowercase
	Chart.Initialize(iID).SetView("chart")
	ChartItem.Initialize
	ChartLine.Initialize 
	yAxis.Initialize 
	xAxis.Initialize 
	Tooltip.Initialize 
	Padding.Initialize
	Parent = Null
	Return Me
End Sub


'set css
Sub SetStyle(prop As String, sval As String) As WixChart
	Chart.SetStyle(prop,sval)
	Return Me
End Sub


'add tp columns of parent
Sub Pop
	Parent.AddColumns(Item)
End Sub

Sub SetTemplateHTML(h As UOENowHTML) As WixChart
	h.SetImportant(False)
	Dim os As String = h.HTML
	Chart.SetTemplate(os)
	Return Me
End Sub

'set name
Sub SetName(n As String) As WixChart
	Chart.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixChart
	Chart.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixChart
	Chart.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixChart
	Chart.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixChart
	Chart.SetMinHeight(h)
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixChart
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		Chart.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub



'set event radius
Sub SetEventRadius(r As Int) As WixChart
	Chart.SetAttr("eventRadius", r)
	Return Me
End Sub

'show a border
Sub SetBorder(b As Boolean) As WixChart
	Chart.SetAttr("border", b)
	Return Me
End Sub

'disable lines
Sub SetDisableLines(b As Boolean) As WixChart
	Chart.SetAttr("disableLines", b)
	Return Me
End Sub

'set attribute for chart
Sub SetAttr(prop As String, val As Object) As WixChart
	Chart.SetAttr(prop,val)
	Return Me
End Sub

'set tooltips template
Sub SetTooltipTemplate(t As String) As WixChart
	Tooltip.Put("template", t)
	Return Me
End Sub

'set xaxis stuff
Sub SetXAxisTemplate(t As String) As WixChart
	xAxis.Put("template", t)
	Return Me
End Sub

'set yaxis stuff
Sub SetYAxisTemplate(t As String) As WixChart
	yAxis.Put("template", t)
	Return Me
End Sub

'set yaxis line shape
Sub SetYAxisLineShape(t As String) As WixChart
	yAxis.Put("lineShape", t)
	Return Me
End Sub

'set yaxis line bg
Sub SetYAxisBG(t As String) As WixChart
	yAxis.Put("bg", t)
	Return Me
End Sub

'set area chart
Sub SetTypeArea(r As String) As WixChart 'ignore
	Chart.SetType("area")
	Return Me
End Sub

'set bar chart
Sub SetTypeBar(r As String) As WixChart 'ignore
	Chart.SetType("bar")
	Return Me
End Sub

'set pie chart
Sub SetTypePie(r As String) As WixChart 'ignore
	Chart.SetType("pie")
	Return Me
End Sub

'set line line
Sub SetTypeLine(r As String) As WixChart 'ignore
	Chart.SetType("line")
	Return Me
End Sub

'set spline chart
Sub SetTypeSPLine(r As String) As WixChart 'ignore
	Chart.SetType("spline")
	Return Me
End Sub

'set yAxis Start
Sub SetYAxisStart(s As Int) As WixChart
	yAxis.Put("start", s)
	Return Me
End Sub

'set yAxis End
Sub SetYAxisEnd(s As Int) As WixChart
	yAxis.Put("end", s)
	Return Me
End Sub

'set yAxis Step
Sub SetYAxisStep(s As Int) As WixChart
	yAxis.Put("step", s)
	Return Me
End Sub

'set item types square
Sub SetItemTypeSquare(r As String) As WixChart  'ignore
	ChartItem.Put("type", "s")
	Return Me
End Sub
	
'set item types triangle
Sub SetItemTypeTriangle(r As String) As WixChart 'ignore
	ChartItem.Put("type", "t")
	Return Me
End Sub

'set item types - diamond
Sub SetItemTypeDiamond(r As String) As WixChart  'ignore
	ChartItem.Put("type", "d")
	Return Me
End Sub

'set item types round
Sub SetItemTypeRound(r As String) As WixChart 'ignore
	ChartItem.Put("type", "r")
	Return Me
End Sub

'set spline areachart
Sub SetTypeSPLineArea(r As String) As WixChart 'ignore
	Chart.SetType("splineArea")
	Return Me
End Sub

'set stackedBarH
Sub SetStackedBarH(r As String) As WixChart 'ignore
	Chart.SetType("stackedBarH")
	Return Me
End Sub

'set stackedArea
Sub SetTypeStackedArea(r As String) As WixChart 'ignore
	Chart.SetType("stackedArea")
	Return Me
End Sub


'set stackedBar
Sub SetTypeStackedBar(r As String) As WixChart 'ignore
	Chart.SetType("stackedBar")
	Return Me
End Sub


'set pie3D
Sub SetTypePie3D(r As String) As WixChart 'ignore
	Chart.SetType("pie3D")
	Return Me
End Sub

'set scatter
Sub SetTypeScatter(r As String) As WixChart 'ignore
	Chart.SetType("scatter")
	Return Me
End Sub

'set radar
Sub SetTypeRadar(r As String) As WixChart 'ignore
	Chart.SetType("radar")
	Return Me
End Sub


'set line color
Sub SetLineColor(c As String) As WixChart
	ChartLine.Put("color", c)
	Return Me
End Sub

'set line width
Sub SetLineWidth(w As Int) As WixChart
	ChartLine.Put("width", w)
	Return Me
End Sub

'set line shadow
Sub SetLineShadow(w As Boolean) As WixChart
	ChartLine.Put("shadow", w)
	Return Me
End Sub

'set legend
Sub SetLegend(width As Int, align As Int) As WixChart
	Dim l As Map = CreateMap("width": width, "align" : align)
	Chart.SetAttr("legend", l)
	Return Me
End Sub

'set gradient falling
Sub SetGradientFalling(r As String) As WixChart  'ignore
	Chart.SetAttr("gradient", "falling")
	Return Me
End Sub

'set bar width
Sub SetBarWidth(w As Int) As WixChart
	Chart.SetAttr("barWidth", w)
	Return Me
End Sub

'set barH chart
Sub SetTypeBarH(r As String) As WixChart 'ignore
	Chart.SetType("barH")
	Return Me
End Sub

'set alpha
Sub SetAlpha(a As Float) As WixChart
	Chart.SetAttr("alpha", a)
	Return Me
End Sub

'set donut chart
Sub SetTypeDonut(r As String) As WixChart 'ignore
	Chart.SetType("donut")
	Return Me
End Sub

'set color
Sub SetColor(c As String) As WixChart
	Chart.SetAttr("color", c)
	Return Me
End Sub

'set shadow
Sub SetShadow(s As Int) As WixChart
	Chart.SetAttr("shadow", s)
	Return Me
End Sub
	
'set padding apply all areas
Sub SetPadding(r As Int) As WixChart
	Padding.Put("top", r)
	Padding.Put("buttom",r)
	Padding.Put("right", r)
	Padding.Put("left", r)
	Chart.SetAttr("padding",Padding)
	Return Me
End Sub


'set padding indicate each area
Sub SetPadding1(top As Int, bottom As Int, right As Int, left As Int) As WixChart
	Padding.Put("top", top)
	Padding.Put("buttom",bottom)
	Padding.Put("right", right)
	Padding.Put("left", left)
	Chart.SetAttr("padding",Padding)
	Return Me
End Sub

'set the radius
Sub SetRadius(r As Int) As WixChart
	Chart.SetAttr("radius", r)
	Return Me
End Sub

'set the gradient
Sub SetGradient(g As String) As WixChart
	Chart.SetAttr("gradient", g)
	Return Me
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub


'set offset
Sub SetOffSet(o As Int) As WixChart
	Chart.SetAttr("offset",o)
	Return Me
End Sub

'set line border color
Sub SetItemBorderColor(c As String) As WixChart
	ChartItem.Put("borderColor", c)
	Return Me
End Sub

'set label offset
Sub SetLabelOffset(c As Int) As WixChart
	ChartItem.Put("labelOffset", c)
	Return Me
End Sub


'set line border width
Sub SetItemBorderWidth(c As String) As WixChart
	ChartItem.Put("borderWidth", c)
	Return Me
End Sub

'set item type
Sub SetItemType(c As String) As WixChart
	ChartItem.Put("type", c)
	Return Me
End Sub

'set item shadown
Sub SetItemShadow(c As Boolean) As WixChart
	ChartItem.Put("shadow", c)
	Return Me
End Sub


'set x value
Sub SetXValue(x As String) As WixChart
	SetAttr("xValue", x)
	Return Me
End Sub

'set line border radius
Sub SetItemRadius(c As Int) As WixChart
	ChartItem.Put("radius", c)
	Return Me
End Sub

'set item color
Sub SetItemColor(c As String) As WixChart
	ChartItem.Put("color",c)
	Return Me
End Sub

'return the item
Sub Item As Map
	Chart.SetAttr("yAxis", yAxis)
	Chart.SetAttr("xAxis", xAxis)
	If ChartItem.Size > 0 Then
		Chart.SetAttr("item", ChartItem)
	End If
	If ChartLine.Size > 0 Then
		Chart.SetAttr("line", ChartLine)
	End If
	If Tooltip.Size > 0 Then
		Chart.SetAttr("tooltip", Tooltip)
	End If
	Return Chart.item
End Sub

'set height
Sub SetHeight(h As Object) As WixChart
	Chart.SetHeight(h)
	Return Me
End Sub

'set width
Sub SetWidth(h As Object) As WixChart
	Chart.SetWidth(h)
	Return Me
End Sub

'set data
Sub SetData(d As List) As WixChart
	Chart.SetData(d)
	Return Me
End Sub

'set pieInnerText
Sub SetPieInnerText(txt As String) As WixChart
	Chart.SetAttr("pieInnerText", txt)
	Return Me
End Sub

'set value
Sub SetValue(v As String) As WixChart
	Chart.SetValue(v)
	Return Me
End Sub

'set label
Sub SetLabel(l As String) As WixChart
	Chart.SetLabel(l)
	Return Me
End Sub

'set label align
Sub SetLabelAlign(a As String) As WixChart
	Chart.SetLabelAlign(a)
	Return Me
End Sub

'set label position
Sub SetLabelPosition(p As String) As WixChart
	Chart.SetLabelPosition(p)
	Return Me
End Sub

'set label width
Sub SetLabelWidth(w As Int) As WixChart
	Chart.SetLabelWidth(w)
	Return Me
End Sub

'set align right
Sub SetAlignRight(r As String) As WixChart 'ignore
	Chart.setAlignright("")
	Return Me
End Sub

'set align center
Sub SetAlignCenter(r As String) As WixChart 'ignore
	Chart.setAligncenter("")
	Return Me
End Sub

'set align left
Sub SetAlignLeft(r As String) As WixChart 'ignore
	Chart.SetAlignleft("")
	Return Me
End Sub

'set xAxis titles
Sub SetXAxisTitle(t As String) As WixChart
	xAxis.Put("title", t)
	Return Me
End Sub

'set yAxis title
Sub SetYAxisTitle(t As String) As WixChart
	yAxis.Put("title", t)
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