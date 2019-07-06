B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.51
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private pg As WixPage
	Private BANano As BANano
End Sub

#if javascript
	function getFilms(){
		return films;
	}
#End If

Sub Init(pgContainer As String)
	'initialize the page and set the container to hold the widgets
	'add a header and set its label
	pg.Initialize("wp", pgContainer).SetHeader("Lesson 8.3 Datatable Pager").SetResponsive("master").SetAppName(Main.AppName)
	'
	'create the list of years
	Dim years As List
	years.Initialize
	For i = 1970 To 2015
		years.Add(CreateMap("id":i, "value":i))
	Next
	
	'create the data-table
	Dim dt As WixDataTable
	dt.Initialize("grida")
	'ensure its a row selection
	dt.SetSelect(dt.DT_SELECT_ROW)
	'number of columns
	dt.SetYCount(10)
	'dont scroll
	dt.SetScroll(False)
	'can use keyboard keys
	dt.SetNavigation(True)
	'set the pager to use
	dt.SetPager("pager")
	'
	'get the records from JSON array
	Dim films As List = BANano.RunJavascriptMethod("getFilms", Null)
	'set data to the grid
	dt.SetData(films).SetEditable(True)
	dt.SetAutoConfig(True)
	Dim grida As Map = dt.Item
	'
	'create the pager
	Dim pgr As WixPager
	'set number of records per page to 10, 5 groups of pages
	'show the first button, show prev button, show pages, show next button, show last page button
	pgr.Initialize("pager").SetSize(10).SetGroup(5).SetShowFirst(True).SetShowPrev(True).SetShowPages(True).SetShowNext(True).SetShowLast(True)
	pgr.SetAnimate(True)
	Dim pager As Map = pgr.Item
	'
	'create a container
	Dim cont As WixElement
	cont.Initialize("cont").SetPadding(10)
	'
	Dim r1 As WixRow
	r1.Initialize("r1").SetTemplate("<b>Static paging</b><br><br>Use the page selector below to choose the desired page.")
	r1.SetHeight(70)
	'
	'add row to page
	pg.AddRow(r1)
	'
	Dim tbl As WixToolBar
	tbl.Initialize("tbl")
	Dim e As BANanoEvent
	tbl.CreateButton("excel").SetLabel("XLSX").SetWidth(100).SetClick(BANano.CallBack(Me,"export_excel",Array(e))).Pop
	tbl.CreateButton("pdf").SetLabel("PDF").SetWidth(100).SetClick(BANano.CallBack(Me,"export_pdf",Array(e))).Pop
	tbl.CreateButton("csv").SetLabel("CSV").SetWidth(100).SetClick(BANano.CallBack(Me,"export_csv",Array(e))).Pop
	tbl.CreateButton("png").SetLabel("PNG").SetWidth(100).SetClick(BANano.CallBack(Me,"export_png",Array(e))).Pop
	 
	'
	pg.AddRows(tbl.Item)
	
	'add grid to page
	pg.AddRows(grida)
	'add pager to page
	pg.AddRows(pager)
	'
	'build the user interface
	pg.ui 
End Sub

Sub export_excel(e As BANanoEvent)
	pg.Export2Excel("grida")
End Sub


Sub export_pdf(e As BANanoEvent)
	pg.Export2pdf("grida")
End Sub


Sub export_csv(e As BANanoEvent)
	pg.Export2csv("grida")
End Sub

Sub export_png(e As BANanoEvent)
	pg.Export2png("grida")
End Sub