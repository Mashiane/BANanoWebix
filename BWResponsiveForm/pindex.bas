B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Process_Globals
	Private pg As WixPage
	Public BANano As BANano
	'Private upload As WixUploader
	'Public fu As BANanoObject
End Sub

Sub Init(pgContainer As String)
	pg.Initialize("index", pgContainer)
	'
	Dim tblBar As WixToolBar
	tblBar.Initialize("tblBar")
	tblBar.SetHeight(100)
	tblBar.SetStyle("background", "#ffffff")
	tblBar.CreateIcon("menuopen").SetIcon("mdi mdi-menu").SetStyle("background", "#eeeeee").SetClick(BANano.CallBack(Me, "OpenMenu", Null)).Pop
	tblBar.CreateLabel("heading").SetLabel("WebApp BS").SetStyle("font-size", "32px").SetStyle("background", "#eeeeee").Pop
	'tblBar.CreateElement("logo").SetStyle("background","url(./assets/logo.png) no-repeat").AddToColumns(tblBar.ToolBar)
	tblBar.CreateImage("logo").SetValue("./assets/logo.png").SetImageStyle("background-color","transparent").pop
	
	tblBar.AddSpacer
	pg.AddRows(tblBar.Item)
	'
	Dim R2 As WixRow
	R2.Initialize("R2")
	R2.AddColumns(modSideBar.Create(pg))
	'master multi page view to host all other pages
	'create a multiview pager
	Dim mv As WixMultiView
	mv.Initialize("mymv")
	
	'leases.AddPage(pg, mv)
	'buildings.AddPage(pg, mv)
	'landlords.AddPage(pg, mv)
	'managers.AddPage(pg, mv)
	'provinces.addpage(pg, mv)
	
	'add multiview pager to the page
	R2.AddColumns(mv.item)
	pg.AddRow(R2)
	'
	'build the ui
	pg.UI
	'pgLeases.ShowPage(pg)
End Sub

'toggle sidebar when menuopen is clicked
Sub toggle_sidebar()
	pg.Toggle("sb")
End Sub
