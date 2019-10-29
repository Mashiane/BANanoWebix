B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.8
@EndOfDesignText@
'Static code module
#IgnoreWarnings:12
Sub Process_Globals
	Private pg As WixPage
	Private BANano As BANano 'ignore
	
End Sub


Sub Init(pgContainer As String)
	'create page
	pg.Initialize("wp", pgContainer).SetResponsive("master")
	pg.SetLocale("en-US")
	
	'set the date format
	pg.SetDateFormat("%Y-%m-%d")
	pg.SetParseFormat("%Y-%m-%d")
	pg.UpdateLocale
	
	
	'add toolbar
	Dim tblBar As WixToolBar
	tblBar.Initialize("tblBar")
	tblBar.CreateLabel("heading").SetLabel("Lesson 32: WixImage (pgCalendar)").Pop
	pg.AddRows(tblBar.item)
	'
	'
	Dim frm As WixForm
	frm.Initialize("form").SetPadding(24)
	
	Dim isHoliday As BANanoObject = pg.IsHoliday
	Dim df As BANanoObject = pg.NewDate(2016, 3, 16)
	Dim dt As BANanoObject = pg.NewDateTime(2019, 10, 28, 8, 10)
	
	Dim thisDate As Object
	Dim ds As BANanoObject = BANano.CallBack(Me, "onDateSelect", Array(thisDate))
	Dim ds1 As BANanoObject = BANano.CallBack(Me, "onDateSelect1", Array(thisDate))
	
	Dim dp1 As WixCalendar
	dp1.Initialize("dp1").SetTimePicker(True).SetSelect(True).OnDateSelect(ds1).SetWeekHeader(True).SetDate(df)
	dp1.SetEvents(isHoliday).AddToRows(frm.Form)
	'
	Dim dp2 As WixCalendar
	'dp2.initialize("dp2").SetWeekHeader(True).OnDateSelect(ds).SetWeekNumber(True).SetDate(df).SetEvents(isHoliday).SetWidth(290).AddToColumns(frm.Form)
	'
	Dim dp3 As WixCalendar
	'dp3.initialize("dp3").SetDate(df).OnDateSelect(ds).SetEvents(isHoliday).SetTimepicker(True).AddToColumns(frm.Form)
	'
	Dim dp4 As WixCalendar
	'dp4.initialize("dp4").SetDate(dt).OnDateSelect(ds).SetEvents(isHoliday).SetMinuteStep(10).SetTimepicker(True).AddToColumns(frm.Form)
	
	Dim dp5 As WixCalendar
	'dp5.initialize("dp5").SetType("time").OnDateSelect(ds).SetDate(dt).AddToColumns(frm.Form)
	'
	Dim dp6 As WixCalendar
	'dp6.initialize("dp6").SetValue(df).OnDateSelect(ds).SetWeekHeader(True).SetEvents(isHoliday).AddToColumns(frm.Form)
	'
	
	Dim nd As BANanoObject = pg.NewDate(2015, 3, 16)
	Dim md As BANanoObject = pg.NewDate(2015, 4, 20)
	
	Dim dp7 As WixCalendar
	dp7.initialize("dp7").SetWeekHeader(True).SetWeekNumber(True).SetEvents(isHoliday)
	dp7.SetDate(nd)
	dp7.SetMinDate("2015-04-05")
	dp7.SetMaxDate(md)
	dp7.SetWidth(290)
	dp7.SetIcons(True)
	dp7.SetTimePicker(True)
	dp7.SetMultiSelect(True)
	dp7.OnDateSelect(ds)
	dp7.SetSelect(True)
	dp7.AddToRows(frm.Form)
	'
	Dim nt As BANanoObject = pg.newdatetime(2015,6,1,8,30)
	Dim dp8 As WixCalendar
	dp8.initialize("dp8").SetEvents(isHoliday)
	dp8.SetDate(nt)
	dp8.settimepicker(True)
	dp8.SetMinTime("8:00")
	dp8.SetMaxTime("18:30")
	dp8.SetMultiSelect("touch")
	dp8.OnDateSelect(ds)
	'dp8.AddToColumns(frm.Form)
	'
	'Dim dp9 As WixCalendar
	'dp9.initialize("dp9")
	'dp9.SetDate(nt)
	'dp9.SetType("month")
	'dp9.AddToColumns(frm.Form)
	'
	'Dim dp10 As WixCalendar
	'dp10.initialize("dp10")
	'dp10.SetDate(nt)
	'dp10.SetType("year")
	'dp10.AddToColumns(frm.Form)
	
	
	'
	pg.AddRows(frm.item)
	'
	pg.ui
	
	pg.SelectDate("dp1", pg.NewDate(2016, 3, 20), True)
	pg.SelectDates("dp7", Array("2015-04-13", "2015-04-14", "2015-04-15"))
    
End Sub	

Sub onDateSelect(thisDate As Object)
	thisDate = pg.getvalue("dp7")
	Log(thisDate)
	pg.message(thisDate)
	'thisDate = pg.DateFormatStrBO(thisDate)
	'pg.message(thisDate)
End Sub

Sub onDateSelect1(thisDate As Object)
	thisDate = pg.getvalue("dp1")
	Log(thisDate)
	pg.message(thisDate)
	'thisDate = pg.DateFormatStrBO(thisDate)
	'pg.message(thisDate)
End Sub