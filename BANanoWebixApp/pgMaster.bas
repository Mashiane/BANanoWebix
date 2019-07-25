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
	Private BANano As BANano
End Sub

Sub formbuilder_click
	pgFD.Init 
End Sub

Sub Init
	Dim shdr As String = "BANanoWebix Demo [" & modSideBar.version & "]"
	pg.Initialize("master", "body").SetTypeSpace("").SetResponsive(True)
	'
	Dim R1 As WixRow
	R1.Initialize("R1")
	'add toolbar
	Dim tblBar As WixToolBar
	tblBar.Initialize("tblBar").SetHeight(60)
	tblBar.CreateIcon("menuopen").SetIcon("mdi mdi-menu").SetClick(BANano.CallBack(Me, "OpenMenu", Null)).Pop
	tblBar.CreateElement("logo").SetStyle("background","url(./assets/webix-logo.svg) 2px -7px no-repeat").SetWidth(100).AddToColumns(tblBar.toolbar)
	tblBar.CreateLabel("heading").SetLabel(shdr).Pop
	tblBar.CreateAvatar("avatar", "./assets/mashy.png", "green",CreateMap("top":"-4px")).SetWidth(60).SetBorderLess(True).AddToColumns(tblBar.ToolBar)
	tblBar.CreateIcon("collab").SetIcon("mdi mdi-wechat").SetTooltip("Collaborate").SetClick(BANano.CallBack(Me,"collab",Null)).pop
	tblBar.setPadding(3)
	R1.AddRows(tblBar.Item)
	'
	Dim sm As WixSideBar
	sm.Initialize("sm").SetPositionRight("").SetCollapsed(False).SetActiveTitle(True).SetScroll(True)
	sm.AddItem("", "formbuilder", "Form Designer","","mdi mdi-language-html5", "","")
	'
	sm.AddItem("", "layouts", "L1-L3 Layouts","","mdi mdi-view-dashboard", "","")
	sm.AddItem("layouts", "lesson1", "Lesson 1","","mdi mdi-view-dashboard", "","")
	sm.AddItem("layouts", "lesson2", "Lesson 2","","mdi mdi-view-dashboard", "","")
	sm.AddItem("layouts", "lesson3_1", "Lesson 3.1","","mdi mdi-view-dashboard", "","")
	sm.AddItem("layouts", "lesson3_2", "Lesson 3.2","","mdi mdi-view-dashboard", "","")
	'
	sm.AddItem("", "multiview", "L4 MultiView","","mdi mdi-view-dashboard", "","")
	sm.AddItem("multiview", "multiview1", "L4.1 MultiView","","mdi mdi-view-dashboard", "","")
	sm.AddItem("multiview", "multiview2", "L4.2 MultiView","","mdi mdi-view-dashboard", "","")
	sm.AddItem("multiview", "multiview3", "L4.3 MultiView","","mdi mdi-view-dashboard", "","")
	sm.AddItem("multiview", "multiview4", "L4.4 MultiView TabBar","","mdi mdi-view-dashboard", "","")
	sm.AddItem("multiview", "tabview", "L4.5 TabView","","mdi mdi-view-dashboard", "","")
	
	
	sm.AddItem("", "toolbar", "L5 ToolBar","","mdi mdi-view-dashboard", "","")
	sm.AddItem("", "dataentry1", "L6 Data Entry","","mdi mdi-view-dashboard", "","")
	sm.AddItem("dataentry1", "dataentry", "L6 Data Entry","","mdi mdi-view-dashboard", "","")
	sm.AddItem("dataentry1", "forms1", "Forms 1","","mdi mdi-view-dashboard", "","")
	sm.AddItem("dataentry1", "forms2", "Forms 2","","mdi mdi-view-dashboard", "","")
	sm.AddItem("dataentry1", "form_validation", "Form Validation","","mdi mdi-view-dashboard", "","")
	'
	sm.AddItem("", "charts", "L7 Charts","","mdi mdi-view-dashboard", "","")
	'
	sm.AddItem("", "datatable", "L8 DataTable","","mdi mdi-view-dashboard", "","")
	sm.AddItem("datatable", "lesson8_1", "Lesson 8.1","","mdi mdi-view-dashboard", "","")
	sm.AddItem("datatable", "lesson8_2", "Lesson 8.2","","mdi mdi-view-dashboard", "","")
	sm.AddItem("datatable", "lesson8_3", "Lesson 8.3","","mdi mdi-view-dashboard", "","")
	sm.AddItem("datatable", "lesson8_4", "Lesson 8.4","","mdi mdi-view-dashboard", "","")
	'
	sm.AddItem("", "dataview", "L9 DataView","","mdi mdi-view-dashboard", "","")
	sm.AddItem("", "lists", "L10-L11 Lists","","mdi mdi-view-dashboard", "","")
	sm.AddItem("lists", "list", "L10 List","","mdi mdi-view-dashboard", "","")
	sm.AddItem("lists", "unitlist", "L11 Unit List","","mdi mdi-view-dashboard", "","")
	'
	sm.AddItem("", "property", "L12 Property Sheet", "", "mdi mdi-table", "","")
	'
	sm.AddItem("", "trees", "L13-L14 Trees","","mdi mdi-view-dashboard", "","")
	sm.AddItem("trees", "treeview", "L13 Tree","","mdi mdi-view-dashboard", "","")
	sm.AddItem("trees", "treedata", "L14 Tree Data","","mdi mdi-view-dashboard", "","")
	'
	sm.AddItem("", "menu", "L15 Menu", "", "mdi mdi-table", "","")
	sm.AddItem("", "sidebar", "L16 Side Bar", "", "mdi mdi-table", "","")
	sm.AddItem("", "comments", "L17 Comments", "", "mdi mdi-table", "","")
	sm.AddItem("", "grouplist", "L18 Group List","","mdi mdi-view-dashboard", "","")
	sm.AddItem("", "context", "L19 Contexts", "", "mdi mdi-table", "","")
	sm.AddItem("", "gmap", "L20 GoogleMap", "", "mdi mdi-table", "","")
	sm.AddItem("", "tabbar", "L21 Tab Bar", "", "mdi mdi-table", "","")
	sm.AddItem("", "uploader", "L22 Uploader", "", "mdi mdi-table", "","")
	sm.AddItem("uploader", "lesson22_1", "L22.1 Upload Grid","","mdi mdi-view-dashboard", "","")
	sm.AddItem("uploader", "lesson22_2", "L22.2 Linked List","","mdi mdi-view-dashboard", "","")
	sm.AddItem("uploader", "lesson22_3", "L22.3 Drop Zone","","mdi mdi-view-dashboard", "","")
	'
	sm.AddItem("", "lesson23", "L23 Video","","mdi mdi-view-dashboard", "","")
	sm.AddItem("", "lesson24", "L24 Scroll View","","mdi mdi-view-dashboard", "","")
	sm.AddItem("", "lesson25", "L25 Template","","mdi mdi-view-dashboard", "","")
	sm.AddItem("", "lesson26", "L26 Responsive","","mdi mdi-view-dashboard", "","")
	sm.AddItem("", "lesson27", "L27 FlexLayout","","mdi mdi-view-dashboard", "","")
	sm.AddItem("", "lesson28", "L28 Suggest","","mdi mdi-view-dashboard", "","")
	sm.AddItem("", "lesson29", "L29 Message Boxes","","mdi mdi-view-dashboard", "","")
	sm.AddItem("", "lesson31", "L31 WixImage","","mdi mdi-view-dashboard", "","")
	'
	Dim R2 As WixRow
	R2.Initialize("R2")
	'
	R2.AddColumns(sm.Item)
	'
	Dim R2C2 As WixElement
	R2C2.Initialize("R2C2")
	Dim div As UOENowHTML
	div.Initialize("r2c2_content","div").SetStyle("width","100%").SetStyle("height","100%")
	R2C2.SetTemplate(div.HTML)
	'
	R2.AddColumns(R2C2.item)
	'
	pg.AddRow(R1)
	pg.AddRow(R2)
	'
	pg.ui
	'
	Dim meid As Map
	pg.OnAfterSelect("sm", BANano.CallBack(Me, "itemClick", Array(meid)))
End Sub


Sub itemClick(meID As String)
	Select Case meID
	Case "formbuilder"
		pgFD.init
	Case "lesson31"
		pgCarSales.Init("r2c2_content")
	Case "lesson29"
		pgMessageBoxes.Init("r2c2_content")
	Case "form_validation"
		pgFormValidation.Init("r2c2_content")		
	Case "lesson8_4"
		pgLesson8_4.Init("r2c2_content")
	Case "lesson28"
		pgSuggest.Init("r2c2_content")
	Case "lesson27"
		pgFlexLayout.Init("r2c2_content")
	Case "lesson26"
		pgResponsive.Init("r2c2_content")
	Case "lesson8_3"
		pgLesson8_3.Init("r2c2_content")		
	Case "lesson24"
		pgScrollView.Init("r2c2_content")
	Case "lesson25"
		pgTemplate.Init("r2c2_content")
	Case "forms1"
		pgForms.Init("r2c2_content")
	Case "forms2"		
		pgForms1.Init("r2c2_content")
	Case "lesson23"
		pgVideo.Init("r2c2_content")
	Case "lesson22_1"
		pgUploader1.Init("r2c2_content")
	Case "lesson22_2"
		pgUploader2.Init("r2c2_content")
	Case "lesson22_3"
		pgUploader3.Init("r2c2_content")
	Case "tabbar"
		pgTabBar.Init("r2c2_content")
	Case "gmap"
		pgGoogleMap.Init("r2c2_content")
	Case "context"
		pgContext.Init("r2c2_content")
	Case "comments"
		pgComments.Init("r2c2_content")
	Case "sidebar"
		pgSideBar.Init("r2c2_content")
	Case "menu"
		pgMenu.Init("r2c2_content")
	Case "treeview"
		pgTree.Init("r2c2_content")
	Case "treedata"
		pgTreeTable.Init("r2c2_content")
	Case "property"
		pgPropertySheet.Init("r2c2_content")
	Case "grouplist"
		pgGroupList.Init("r2c2_content")
	Case "unitlist"
		pgUnitList.Init("r2c2_content")
	Case "list"
		pgList.Init("r2c2_content")
	Case "dataview"
		pgDataView.Init("r2c2_content")
	Case "lesson8_1"
		pgDataTable.Init("r2c2_content")
	Case "lesson8_2"
		pgDataTable1.Init("r2c2_content")
	Case "charts"
		pgCharts.Init("r2c2_content")
	Case "lesson1"
		pgLayout.Init("r2c2_content")
	Case "lesson2"
		pgLayouts.Init("r2c2_content")
	Case "lesson3_1"
		pgLayouts1.init("r2c2_content")
	Case "lesson3_2"
		pgLayouts2.init("r2c2_content")
	Case "multiview1"
		pgMultiView.Init("r2c2_content")
	Case "multiview2"
		pgMultiView2.Init("r2c2_content")
	Case "multiview3"
			pgMultiView3.Init("r2c2_content")
	Case "multiview4"
		pgMultiView4.Init("r2c2_content")
	Case "tabview"
		pgTabView.Init("r2c2_content")
	Case "toolbar"
		pgToolBar.Init("r2c2_content")
	Case "dataentry"
		pgDataEntry.Init("r2c2_content")		
	End Select
End Sub

Sub OpenMenu()
	pg.Toggle("sm")
End Sub


Sub collab
	Dim theObject As Object = Sender
	Dim isonline As Boolean = BANano.CheckInternetConnectionWait
	If isonline Then
		BANano.RunJavascriptMethod("TogetherJS", Array(theObject))
	Else
		pg.Message_Debug("You dont appear to be connected to the interweb!")
	End If
End Sub