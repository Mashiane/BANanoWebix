B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.51
@EndOfDesignText@
Sub Process_Globals
End Sub

Sub BuildBag(Page As WixPage, Bag As WixProperty)
	Bag.Clear
	Bag.AddTextBox("id","Id", "calendar1")
	Bag.AddTextBox("view","View", "calendar")
	Bag.AddTextBox("parentid","Parentid", "")
	Bag.AddCombo("addingmethod","Adding Method","AddRows", pgFormDesigner.addingmethod)
	Bag.AddTextBox("tabindex", "Tab Index", "0")
	Bag.AddCombo("view","View", "Calendar", Page.Views)
	Bag.AddLabel("Details")
	Bag.AddTextBox("date","Date", "")
	Bag.AddCheckBox("weekHeader","WeekHeader", "")
	Bag.AddCheckBox("weekNumber","Week Number", "")
	Bag.AddTextBox("calendarWeekHeader","Calendar Week Header", "")
	Bag.AddTextBox("calendarTime","Calendar Time", "")
	Bag.AddTextBox("headerHeight","Header Height", "")
	Bag.AddTextBox("dayTemplate","Day Template", "")
	Bag.AddTextBox("CSS","CSS", "")
	Bag.AddTextBox("container","Container", "")
	Bag.AddTextBox("cellHeight","Cell Height", "")
	Bag.AddTextBox("calendarHeader","Calendar Header", "")
	Bag.AddTextBox("icons","Icons", "")
	Bag.AddCheckBox("timepicker","Time Picker", "")
	Bag.AddCheckBox("multiselect","Multi Select", "")
	Bag.AddCombo("type", "Type", "", Array("","time","month","year"))
	Bag.AddTextBox("events","Events", "")
	Bag.AddTextBox("timepickerHeight","Time Picker Height", "")
	Bag.AddTextBox("minDate","Min Date", "")
	Bag.AddTextBox("maxDate","Max Date", "")
	Bag.AddTextBox("blockDates","Block Dates", "")
	Bag.AddTextBox("minTime","Min Time", "")
	Bag.AddTextBox("maxTime","Max Time", "")
	Bag.AddTextBox("blockTime","Block Time", "")
	Bag.AddTextBox("minuteStep","Minute Step", "")
	Bag.AddCheckBox("monthHeader","Month Header", "")
	Bag.AddCheckBox("monthSelect","Month Select", "")
	Bag.AddCheckBox("skipEmptyWeeks","Skip EmptyWeeks", "")
	Bag.AddCheckBox("select","Select", "")
	Bag.AddCheckBox("hidden","Hidden", "")
	Bag.AddLabel("Size")
	Bag.AddTextBox("width","Width", "")
	Bag.AddTextBox("height","Height", "")
	Bag.Refresh(Page)
End Sub

