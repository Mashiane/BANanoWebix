B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.78
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public apply As String
	Public cancel As String
	Public columns As String
	Public count As String
	Public datepicker As String
	Public fields As String
	Public filters As String
	Public maxLabel As String
	Public multicombo As String
	Public minLabel As String
	Public operationNotDefined As String
	Public pivotMessage As String
	Public rows As String
	Public selectLabel As String
	Public sumLabel As String
	Public text As String
	Public values As String
	Public windowTitle As String
	Public windowMessage As String
	Public bar As String
	Public chart As String
	Public chartType As String
	Public dateLabel  As String
	Public groupBy As String
	Public layoutIncorrect  As String
	Public line As String
	Public logScale As String
	Public popupHeader As String
	Public radar As String
	Public radarArea As String
	Public settings As String
	Public stackedBar As String
	Public totalLabel As String
	Public valuesNotDefined As String
End Sub

'initialize the localte
Public Sub Initialize
	'default to english
	columns = "Columns"
	datepicker = "Date selection"
    count = "count"
    fields = "Fields"
    filters = "Filters"
    maxLabel = "max"
    minLabel = "min"
    operationNotDefined = "Operation is not defined"
    pivotMessage = "[Click to configure]"
    rows = "Rows"
    selectLabel = "select"
    sumLabel = "sum"
    text = "text"
    values = "Values"
    windowTitle = "Pivot Configuration"
	windowMessage = "[move fields into required sector]"
	apply = "Apply"
	cancel = "Cancel"
	multicombo = "multi-select"
	bar = "Bar"
	chart = "Chart"
	chartType = "Chart type"
	dateLabel = "date"
	groupBy = "Group By"
	layoutIncorrect = "pivotLayout should be an Array instance"
	line = "Line"
	logScale = "Logarithmic scale"
	popupHeader = "Pivot Settings"
	radar = "Radar"
	radarArea = "Area Radar"
	settings = "Settings"
	stackedBar = "Stacked Bar"
	totalLabel = "Total"
	valuesNotDefined = "Values or Group field are not defined"
End Sub

'return the locate
Sub Locale As Map
	Dim loc As Map = CreateMap()
	loc.Put("datepicker", datepicker)
	loc.Put("columns", columns)
    loc.Put("count", count)
    loc.Put("fields", fields)
    loc.Put("filters", filters)
    loc.Put("max", maxLabel)
    loc.Put("min", minLabel)
    loc.Put("operationNotDefined", operationNotDefined)
	loc.Put("pivotMessage", pivotMessage)
	loc.Put("rows", rows)
    loc.Put("select", selectLabel)
    loc.Put("sum", sumLabel)
    loc.Put("text", text)
    loc.Put("values", values)
	loc.Put("windowTitle", windowTitle)
	loc.Put("windowMessage", windowMessage)
	loc.Put("apply", apply)
	loc.Put("cancel", cancel)
	loc.Put("multicombo", multicombo)
	loc.Put("bar", bar)
	loc.Put("chart", chart)
	loc.Put("chartType", chartType)
	loc.Put("date", dateLabel)
	loc.Put("groupBy",  groupBy)
	loc.Put("layoutIncorrect",layoutIncorrect)
	loc.Put("line", line)
	loc.Put("logScale", logScale)
	loc.Put("popupHeader",popupHeader)
	loc.Put("radar", radar)
	loc.Put("radarArea",radarArea)
	loc.Put("settings", settings)
	loc.Put("stackedBar", stackedBar)
	loc.Put("total", totalLabel)
	loc.Put("valuesNotDefined", valuesNotDefined)
	Return loc
End Sub