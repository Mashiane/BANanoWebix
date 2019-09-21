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
	tblBar.SetStyles(CreateMap("background": "#ffffff !important"))
	tblBar.CreateIcon("menuopen").SetIcon("mdi mdi-menu").SetStyles(CreateMap("background": "#eeeeee")).SetClick(BANano.CallBack(Me, "OpenMenu", Null)).Pop
	tblBar.CreateHeader("heading").SetBorderless(True).SetTemplate("My Webix App").SetStyles(CreateMap("height":"100%","vertical-align":"middle !important","font-size": "32px !important")).Pop
	tblBar.AddColumns(CreateMap())
	tblBar.CreateImage("logo").SetWidth(150).SetValue("./assets/pexels-photo-2879991.jpeg").pop
	
	Log(pg.Map2JsonPretty(tblBar.Item))
	 
	
	pg.AddRows(tblBar.Item)
	'
	Dim R2 As WixRow
	R2.Initialize("R2")
	R2.AddColumns(modSideBar.Create(pg))
	'master multi page view to host all other pages
	'create a multiview pager
	Dim mv As WixMultiView
	mv.Initialize("mymv")
	modClient.AddPage(pg, mv)
	modArchivi.AddPage(pg, mv)
	
	
	'add multiview pager to the page
	R2.AddColumns(mv.item)
	pg.AddRow(R2)
	'
	'build the ui
	pg.UI
	'
	modClient.showpage(pg)
End Sub

'toggle sidebar when menuopen is clicked
Sub toggle_sidebar()
	pg.Toggle("sb")
End Sub
