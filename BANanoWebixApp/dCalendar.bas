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
	Bag.AddCombo("addingmethod","Adding Method","AddRows", pgFD.addingmethod)
	Bag.AddTextBox("tabindex", "Tab Index", "0")
	Bag.AddCombo("view","View", "Calendar", Page.Views)
	Bag.AddCombo("type", "Type", "", Array("","time","month","year"))
	Bag.AddLabel("Details")
	Bag.AddCheckBox("animate","Animate", "")
	Bag.AddTextBox("date","Date", "")
	Bag.AddCheckBox("stringresult", "String Result",True)
	Bag.AddCheckBox("weekHeader","WeekHeader", "")
	Bag.AddCheckBox("weekNumber","Week Number", "")
	Bag.AddTextBox("calendarWeekHeader","Calendar Week Header", "")
	Bag.AddTextBox("calendarTime","Calendar Time", "")
	Bag.AddTextBox("headerHeight","Header Height", "")
	Bag.AddTextBox("dayTemplate","Day Template", "")
	Bag.AddCheckBox("disabled","Disabled", "")
	Bag.AddTextBox("CSS","CSS", "")
	Bag.AddTextBox("container","Container", "")
	Bag.AddTextBox("cellHeight","Cell Height", "")
	Bag.AddTextBox("calendarHeader","Calendar Header", "")
	Bag.AddTextBox("icons","Icons", "")
	Bag.AddCheckBox("timepicker","Time Picker", "")
	Bag.AddTextBox("timepickerHeight","Time Picker Height", "")
	
	Bag.AddTextBox("events","Events", "")
	Bag.AddTextBox("gravity","Gravity", "")
	Bag.AddTextBox("minDate","Min Date", "")
	Bag.AddTextBox("maxDate","Max Date", "")
	Bag.AddTextBox("minTime","Min Time", "")
	Bag.AddTextBox("maxTime","Max Time", "")
	Bag.AddTextBox("blockDates","Block Dates", "")
	Bag.AddTextBox("blockTime","Block Time", "")
	Bag.AddCheckBox("borderless","Borderless", "")
	Bag.AddTextBox("minuteStep","Minute Step", "")
	Bag.AddCheckBox("monthHeader","Month Header", "")
	Bag.AddCheckBox("monthSelect","Month Select", "")
	Bag.AddCheckBox("multiselect","Multi Select", "")
	Bag.AddCheckBox("navigation","Navigation", "")

	Bag.AddCheckBox("skipEmptyWeeks","Skip EmptyWeeks", "")
	Bag.AddCheckBox("select","Select", "")
	Bag.AddTextBox("timeIcon","TimeIcon", "")

	Bag.AddCheckBox("hidden","Hidden", "")
	Bag.AddLabel("Size")
	Bag.AddTextBox("width","Width", "")
	Bag.AddTextBox("height","Height", "")
	Bag.AddTextBox("maxHeight","MaxHeight", "")
	Bag.AddTextBox("maxWidth","MaxWidth", "")
	Bag.AddTextBox("minHeight","MinHeight", "")
	Bag.AddTextBox("minWidth","MinWidth", "")
	Bag.Refresh(Page)
End Sub
