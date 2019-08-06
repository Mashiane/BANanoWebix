B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Process_Globals
	Private pg As WixPage
	Public BANano As BANano
End Sub

Sub Init(pgContainer As String)
	'create the page
	pg.Initialize("index", pgContainer)
	pg.SetResponsive(True)
	'create a toolbar for the page
	Dim tblBar As WixToolBar
	tblBar.Initialize("tblBar")
	tblBar.CreateIcon("menuopen").SetIcon("mdi mdi-menu").SetClick(BANano.CallBack(Me, "toggle_sidebar", Null)).Pop
	tblBar.CreateLabel("heading").SetLabel("Our Clients").Pop
	tblBar.AddSpacer
	'add toolbar to the row 
	pg.AddRows(tblBar.Item)
	'add sidemenu to column
	Dim R2 As WixRow
	R2.Initialize("R2")
	R2.AddColumns(modSideBar.Create(pg))
	'create a multiview pager
	Dim mv As WixMultiView
	mv.Initialize("mymv")
	'add pages to the multiview pager
	modClients.AddPage(pg, mv)
	modCities.AddPage(pg,mv)
	modPositions.AddPage(pg, mv)
	'add multiview pager to the page
	R2.AddColumns(mv.item)
	pg.AddRow(R2) 
	'build the ui
	pg.UI
	'show the clients page
	modClients.ShowPage(pg)
End Sub

'toggle sidebar when menuopen is clicked
Sub toggle_sidebar()
	pg.Toggle("sb")
End Sub
