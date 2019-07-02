B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.51
@EndOfDesignText@
'Static code module
#IgnoreWarnings:12
Sub Process_Globals
	Private pg As WixPage
	Public BANano As BANano
End Sub

Sub Init
	pg.Initialize("forms")
	Dim R1 As WixRow
	R1.Initialize("R1")
	 
	'add toolbar
	Dim tblBar As WixToolBar
	tblBar.Initialize("tblBar")
	tblBar.CreateIcon("menuopen").SetIcon("mdi mdi-menu").SetClick(BANano.CallBack(Me, "OpenMenu", Null)).Pop
	tblBar.CreateLabel("heading").SetLabel("Lesson 16: Side Bar").Pop
	tblBar.AddSpacer
	tblBar.CreateIcon("").SetIcon("mdi mdi-comment").SetBadge("4").pop
	tblBar.CreateIcon("").SetIcon("mdi mdi-bell").SetBadge("10").Pop
	tblBar.setPadding(3)

	'pg.Page.AddRows(tblBar.Item)
	R1.AddRows(tblBar.Item)
	
	'
	Dim sm As WixSideBar
	sm.Initialize("sm").SetPositionRight("").SetCollapsed(True).SetActiveTitle(True)
	'
	sm.AddItem("", "dashboard", "Dashboards","","mdi mdi-view-dashboard", "2","")
	sm.AddItem("dashboard", "dashboard1", "Dashboard 1","","mdi mdi-view-dashboard", "","")
	sm.AddItem("dashboard", "dashboard2", "Dashboard 2","","mdi mdi-view-dashboard", "","")
	'	
	sm.AddItem("", "layouts", "Layouts", "", "mdi mdi-view-column", "","")
	sm.AddItem("layouts", "accordions", "Accordions", "", "mdi mdi-view-column", "","")
	sm.AddItem("layouts", "portlets", "Portlets", "", "mdi mdi-view-column", "","")
	'
	sm.AddItem("", "tables", "Data Tables", "", "mdi mdi-table", "","")
	sm.AddItem("", "uis", "UI Components", "", "mdi mdi-puzzle", "","")
	
	'
	Dim R2 As WixRow
	R2.Initialize("R2")
	' 
	R2.AddColumns(sm.Item)
	R2.AddColumns(CreateMap())
	'
	pg.Page.AddRow(R1)
	pg.Page.AddRow(R2)
	'
	pg.ui
	'
	Dim meid As Map
	pg.OnItemClick("sm", BANano.CallBack(Me, "itemClick", Array(meid)))

End Sub

Sub itemClick(meID As String)
	pg.Message(meID)
End Sub

Sub OpenMenu()
	pg.Toggle("sm")
End Sub