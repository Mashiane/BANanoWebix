B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Calendar As WixElement
	Private On As Map
	Public Parent As WixElement

End Sub

'Initializes the calendar
Public Sub Initialize(sid As String) As WixCalendar
ID = sid.tolowercase
Calendar.Initialize(ID).SetView("calendar")
On.Initialize 
	Parent = Null
	Return Me
End Sub

'set padding
Sub SetPadding(padding As Object) As WixCalendar
	Calendar.SetPadding(padding)
	Return Me
End Sub

'set padding
Sub SetMargin(margin As Object) As WixCalendar
	Calendar.SetMargin(margin)
	Return Me
End Sub

Sub SetAttributes(m As Map) As WixCalendar
	For Each k As String In m.Keys
		Dim v As String = m.Get(k)
		Calendar.SetAttr(k,v)
	Next
	Return Me
End Sub

Sub SetStyles(m As Map) As WixCalendar
	For Each k As String In m.Keys
		Dim v As String = m.Get(k)
		Calendar.SetStyle(k,v)
	Next
	Return Me
End Sub

'set css
Sub SetStyle(prop As String, sval As String) As WixCalendar
	Calendar.SetStyle(prop,sval)
	Return Me
End Sub

'set the parent
Sub SetParent(p As WixElement) As WixCalendar
	Parent = p
	Return Me
End Sub

'add tp columns of parent
Sub Pop
	Parent.AddColumns(Item)
End Sub

Sub OnAfterDateSelect(cb As BANanoObject) As WixCalendar
	On.Put("onAfterDateSelect",cb)
	Return Me
End Sub

Sub OnAfterMonthChange(cb As BANanoObject) As WixCalendar
	On.Put("onAfterMonthChange", cb)
	Return Me
End Sub

Sub OnDateClear(cb As BANanoObject) As WixCalendar
	On.Put("onDateClear", cb)
	Return Me
End Sub

Sub OnDateSelect(cb As BANanoObject) As WixCalendar
	On.Put("onDateSelect", cb)
	Return Me
End Sub

Sub OnTodaySet(cb As BANanoObject) As WixCalendar
	On.Put("onTodaySet", cb)
	Return Me
End Sub

'return the item
Sub Item As Map
	If On.Size > 0 Then 
		Calendar.SetAttr("on", On)
	End If
	Return Calendar.item
End Sub

Sub SetValue(value As Object) As WixCalendar
	Calendar.SetValue(value)
	Return Me
End Sub

Sub SetDate(sdate As Object) As WixCalendar
	Calendar.SetAttr("date", sdate)
	Return Me
End Sub

Sub SetEvents(sevents As Object) As WixCalendar
	Calendar.SetAttr("events", sevents)
	Return Me
End Sub

Sub SetWeekHeader(weekHeader As Boolean) As WixCalendar
Calendar.SetAttr("weekHeader", weekHeader)
Return Me
End Sub

Sub SetWidth(width As String) As WixCalendar
Calendar.SetAttr("width", width)
Return Me
End Sub

Sub SetHeight(height As String) As WixCalendar
Calendar.SetAttr("height", height)
Return Me
End Sub

Sub SetWeekNumber(weekNumber As Boolean) As WixCalendar
Calendar.SetAttr("weekNumber", weekNumber)
Return Me
End Sub

Sub SetIcons(icons As Object) As WixCalendar
Calendar.SetAttr("icons", icons)
Return Me
End Sub

Sub SetTimepicker(timepicker As Boolean) As WixCalendar
Calendar.SetAttr("timepicker", timepicker)
Return Me
End Sub

Sub SetMultiselect(multiselect As Boolean) As WixCalendar
Calendar.SetAttr("multiselect", multiselect)
Return Me
End Sub

Sub SetType(sType As String) As WixCalendar
Calendar.SetAttr("type", sType)
Return Me
End Sub

Sub SetTimepickerHeight(timepickerHeight As String) As WixCalendar
Calendar.SetAttr("timepickerHeight", timepickerHeight)
Return Me
End Sub

Sub SetMinDate(minDate As Object) As WixCalendar
Calendar.SetAttr("minDate", minDate)
Return Me
End Sub

Sub SetMaxDate(maxDate As Object) As WixCalendar
Calendar.SetAttr("maxDate", maxDate)
Return Me
End Sub

Sub SetBlockDates(blockDates As Object) As WixCalendar
Calendar.SetAttr("blockDates", blockDates)
Return Me
End Sub

Sub SetMinTime(minTime As String) As WixCalendar
Calendar.SetAttr("minTime", minTime)
Return Me
End Sub

Sub SetMaxTime(maxTime As String) As WixCalendar
Calendar.SetAttr("maxTime", maxTime)
Return Me
End Sub

Sub SetBlockTime(blockTime As String) As WixCalendar
Calendar.SetAttr("blockTime", blockTime)
Return Me
End Sub

Sub SetMinuteStep(minuteStep As String) As WixCalendar
Calendar.SetAttr("minuteStep", minuteStep)
Return Me
End Sub

Sub SetMonthHeader(monthHeader As Boolean) As WixCalendar
Calendar.SetAttr("monthHeader", monthHeader)
Return Me
End Sub

Sub SetMonthSelect(monthSelect As Boolean) As WixCalendar
Calendar.SetAttr("monthSelect", monthSelect)
Return Me
End Sub

Sub SetSkipEmptyWeeks(skipEmptyWeeks As Boolean) As WixCalendar
Calendar.SetAttr("skipEmptyWeeks", skipEmptyWeeks)
Return Me
End Sub

Sub SetSelect(sSelect As Boolean) As WixCalendar
Calendar.SetAttr("select", sSelect)
Return Me
End Sub

Sub SetHidden(hidden As Boolean) As WixCalendar
Calendar.SetAttr("hidden", hidden)
Return Me
End Sub

Sub SetHeaderHeight(headerHeight As String) As WixCalendar
Calendar.SetAttr("headerHeight", headerHeight)
Return Me
End Sub

Sub SetDayTemplate(dayTemplate As String) As WixCalendar
Calendar.SetAttr("dayTemplate", dayTemplate)
Return Me
End Sub

Sub SetCSS(CSS As String) As WixCalendar
Calendar.SetAttr("CSS", CSS)
Return Me
End Sub

Sub SetContainer(container As String) As WixCalendar
Calendar.SetAttr("container", container)
Return Me
End Sub

Sub SetCellHeight(cellHeight As String) As WixCalendar
Calendar.SetAttr("cellHeight", cellHeight)
Return Me
End Sub

Sub SetCalendarWeekHeader(calendarWeekHeader As String) As WixCalendar
Calendar.SetAttr("calendarWeekHeader", calendarWeekHeader)
Return Me
End Sub

Sub SetCalendarTime(calendarTime As Object) As WixCalendar
Calendar.SetAttr("calendarTime", calendarTime)
Return Me
End Sub

Sub SetCalendarHeader(calendarHeader As Object) As WixCalendar
Calendar.SetAttr("calendarHeader", calendarHeader)
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


Sub SetAnimate(animate As Boolean) As WixCalendar
	Calendar.SetAttr("animate", animate)
	Return Me
End Sub


Sub SetBorderless(borderless As Boolean) As WixCalendar
Calendar.SetAttr("borderless", borderless)
Return Me
End Sub

Sub SetDisabled(disabled As Boolean) As WixCalendar
Calendar.SetAttr("disabled", disabled)
Return Me
End Sub

Sub SetGravity(gravity As Object) As WixCalendar
Calendar.SetAttr("gravity", gravity)
Return Me
End Sub

Sub SetMaxHeight(maxHeight As Object) As WixCalendar
Calendar.SetAttr("maxHeight", maxHeight)
Return Me
End Sub

Sub SetMaxWidth(maxWidth As Object) As WixCalendar
Calendar.SetAttr("maxWidth", maxWidth)
Return Me
End Sub

Sub SetMinHeight(minHeight As Object) As WixCalendar
Calendar.SetAttr("minHeight", minHeight)
Return Me
End Sub

Sub SetMinWidth(minWidth As Object) As WixCalendar
Calendar.SetAttr("minWidth", minWidth)
Return Me
End Sub

Sub SetNavigation(navigation As Boolean) As WixCalendar
Calendar.SetAttr("navigation", navigation)
Return Me
End Sub

Sub SetTimeIcon(timeIcon As Object) As WixCalendar
Calendar.SetAttr("timeIcon", timeIcon)
Return Me
End Sub