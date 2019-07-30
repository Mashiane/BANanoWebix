B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Geochart As WixElement
	Private chart As Map
	Public Parent As WixElement

End Sub

'Initializes the geochart
Public Sub Initialize(sid As String) As WixGeoChart
	ID = sid.tolowercase
	Geochart.Initialize(ID).SetView("geochart")
	chart.Initialize 
	Parent = Null
	Return Me
End Sub

'set the parent
Sub SetParent(p As WixElement) As WixGeoChart
	Parent = p
	Return Me
End Sub


'add tp columns of parent
Sub Pop
	Parent.AddColumns(Item)
End Sub


Sub CreateColumn(hid As String) As WixDataColumn
	Dim hdr As WixDataColumn
	hdr.Initialize(hid)
	Return hdr
End Sub

'add column
Sub AddColumns(c As WixDataColumn)
	Geochart.AddDataColumn(c.Item)
End Sub

'return the item
Sub Item As Map
	If chart.Size > 0 Then Geochart.SetAttr("chart", chart)
	Return Geochart.item
End Sub

Sub SetKey(key As String) As WixGeoChart
	Geochart.SetAttr("key", key)
	Return Me
End Sub

Sub SetData(data As List) As WixGeoChart
	Geochart.SetAttr("data", data)
	Return Me
End Sub

Sub SetHeight(height As String) As WixGeoChart
	Geochart.SetAttr("height", height)
	Return Me
End Sub

Sub SetWidth(width As String) As WixGeoChart
	Geochart.SetAttr("width", width)
	Return Me
End Sub

Sub SetAutoHeight(autoHeight As String) As WixGeoChart
	Geochart.SetAttr("autoheight", autoHeight)
	Return Me
End Sub

Sub SetAutoWidth(autoWidth As String) As WixGeoChart
	Geochart.SetAttr("autowidth", autoWidth)
	Return Me
End Sub

Sub SetDataType(datatype As String) As WixGeoChart
	Geochart.SetAttr("datatype", datatype)
	Return Me
End Sub

Sub SetName(name As String) As WixGeoChart
	Geochart.SetAttr("name", name)
	Return Me
End Sub

Sub SetColumns(columns As List) As WixGeoChart
	Geochart.SetAttr("columns", columns)
	Return Me
End Sub

Sub SetChartDisplayMode(ChartDisplayMode As String) As WixGeoChart
	chart.Put("displayMode", ChartDisplayMode)
	Return Me
End Sub

Sub SetChartRegion(ChartRegion As String) As WixGeoChart
	chart.Put("region", ChartRegion)
	Return Me
End Sub

Sub SetChartColorAxis(ChartColorAxis As List) As WixGeoChart
	Dim colorAxis As Map = CreateMap()
	colorAxis.Put("colors", ChartColorAxis)
	chart.Put("colorAxis", colorAxis)
	Return Me
End Sub

Sub SetChartLegend(ChartLegend As Object) As WixGeoChart
	chart.put("legend", ChartLegend)
	Return Me
End Sub


Sub SetChartResolution(ChartResolution As Object) As WixGeoChart
	chart.Put("resolution", ChartResolution)
	Return Me
End Sub

Sub SetTooltip(tooltip As String) As WixGeoChart
	Geochart.SetAttr("tooltip", tooltip)
	Return Me
End Sub


Sub SetBorderless(borderless As Boolean) As WixGeoChart
	Geochart.SetAttr("borderless", borderless)
	Return Me
End Sub

Sub SetContainer(container As String) As WixGeoChart
	Geochart.SetAttr("container", container)
	Return Me
End Sub

Sub SetHidden(hidden As Boolean) As WixGeoChart
	Geochart.SetAttr("hidden", hidden)
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

Sub SetAnimate(animate As Boolean) As WixGeoChart
	Geochart.SetAttr("animate", animate)
	Return Me
End Sub

Sub SetChart(schart As Object) As WixGeoChart
Geochart.SetAttr("chart", schart)
Return Me
End Sub

Sub SetCss(css As Object) As WixGeoChart
Geochart.SetAttr("css", css)
Return Me
End Sub

Sub SetDatathrottle(datathrottle As Object) As WixGeoChart
Geochart.SetAttr("datathrottle", datathrottle)
Return Me
End Sub

Sub SetDisabled(disabled As Boolean) As WixGeoChart
Geochart.SetAttr("disabled", disabled)
Return Me
End Sub

Sub SetGravity(gravity As Object) As WixGeoChart
Geochart.SetAttr("gravity", gravity)
Return Me
End Sub

Sub SetMaxHeight(maxHeight As Object) As WixGeoChart
Geochart.SetAttr("maxHeight", maxHeight)
Return Me
End Sub

Sub SetMaxWidth(maxWidth As Object) As WixGeoChart
Geochart.SetAttr("maxWidth", maxWidth)
Return Me
End Sub

Sub SetMinHeight(minHeight As Object) As WixGeoChart
Geochart.SetAttr("minHeight", minHeight)
Return Me
End Sub

Sub SetMinWidth(minWidth As Object) As WixGeoChart
Geochart.SetAttr("minWidth", minWidth)
Return Me
End Sub

Sub SetReady(ready As Object) As WixGeoChart
Geochart.SetAttr("ready", ready)
Return Me
End Sub

Sub SetRemoveMissed(removeMissed As Boolean) As WixGeoChart
Geochart.SetAttr("removeMissed", removeMissed)
Return Me
End Sub

Sub SetSave(save As Object) As WixGeoChart
Geochart.SetAttr("save", save)
Return Me
End Sub

Sub SetScheme(scheme As Object) As WixGeoChart
Geochart.SetAttr("scheme", scheme)
Return Me
End Sub

Sub SetUrl(url As Object) As WixGeoChart
Geochart.SetAttr("url", url)
Return Me
End Sub
