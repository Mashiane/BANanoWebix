B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.51
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private pg As WixPage
	Public BANano As BANano
	Private smUX As BANanoObject
	Private winUX As BANanoObject
End Sub

Sub Init
	pg.Initialize("forms")
	'.SetHeader("Lesson 15: Menus")
	'add toolbar
	Dim tblBar As WixToolBar
	tblBar.Initialize("tblBar")
	tblBar.CreateIcon("menuopen").SetIcon("mdi mdi-menu").SetClick(BANano.CallBack(Me, "OpenMenu", Null)).Pop
	tblBar.CreateLabel("heading").SetLabel("Lesson 15: Menus").Pop
	pg.Page.AddRows(tblBar.Item) 
	
	'
	Dim sm As WixSideMenu
	sm.Initialize("sm")
	sm.SetTemplate("<span class='webix_icon mdi mdi-#icon#'></span> #value#")
	'
	sm.AddItem("new", "New", "account")
	sm.AddItem("open", "Open", "cube")
	sm.AddItem("close", "Close", "database")
	'sm.SetPositionTop("").SetLayoutX(True)
	'
	smUX = pg.UX(sm.Item)
	'
	Dim e As BANanoEvent
	Dim win As WixWindow
	win.Initialize("myWindow").SetWidth(300).SetHeight(200).SetLeft(100).SetTop(100).SetMove(True).SetResize(True).SetClose(True)
	win.SetHead("A window unto the world!")
	win.SetPositionCenter("")
	'win.SetModal(True)
	win.ToolBar.SetMargin(-4)
	win.ToolBar.CreateLabel("lbl").SetLabel("A window unto the world!").Pop 
	win.ToolBar.CreateIcon("icnback").SetIcon("mdi mdi-arrow-left").Pop
	win.ToolBar.CreateIcon("icnclose").SetIcon("mdi mdi-close").Pop
	'replace normal header
	win.SetToolBar(True)
	win.SetTemplate("<br>We can show HTML here, or other Webix components - we could, in fact, build an entire application UI in a window!")
	'win.SetFullScreen(True)
	'
	winUX = pg.UX(win.Item)
	
	'
	Dim menu As WixMenu
	menu.Initialize("menu")
	menu.SetSubMenuPosRight("")
	'show down arrow
	'menu.SetItemSubSign(True)
	menu.SetSelect(True)
	menu.setWidth(180)
	menu.SetHeight(300)
	'make menu vertical
	'menu.SetLayoutY("")
	menu.AddItem("", "mt", "Man Tactical", "","","3","")
	menu.AddItem("mt", "mtw", "Worf", "","","","")
	menu.AddItem("mt", "mtd", "Data", "","","","")
	menu.AddSeparator("mt")
	menu.AddItem("mt", "mtr", "Riker", "","","","")
	menu.AddItem("", "fp", "Fire Phasers","","","","")
	menu.AddItem("", "ft", "Fire Torpedoes", "","","","")
	menu.AddItem("", "win", "Window", "","","","")
	menu.AddItem("", "iframe", "iFrame", "","","","")
	
	pg.Page.AddRows(menu.Item)
	'
	'Dim iframe As WixIFrame
	'iframe.Initialize("iframe").SetWidth(800).SetHeight(800).SetContainer("r3")
	'iframe.SetSRC("https://www.b4x.com/android/forum/threads/bananowebix-webix-ux-wrapper-for-banano.106703/#content")
	
	''Dim R3 As WixRow
	'R3.Initialize("R3")
	'R3.AddRows(iframe.Item) 
	'pg.Page.AddRows(R3.Item)
	
	'
	pg.ui
	'
	Dim meid As Map
	pg.OnItemClick("menu", BANano.CallBack(Me, "itemClick", Array(meid)))
	pg.OnItemClick("sm", BANano.CallBack(Me, "itemClick", Array(meid)))

End Sub

Sub win_close(e As BANanoEvent)
	pg.Close(winUX)	
End Sub

Sub OpenMenu(meid As String)
	'toggle sidemenu
	Dim bVisible As Boolean = pg.IsVisible(smUX)
	If bVisible Then
		pg.Hide(smUX)
	Else
		pg.Show(smUX)
	End If
End Sub

Sub itemClick(meid As String)
	Select Case meid
	Case "iframe"
	Case "win"
		pg.Show(winUX)	
	Case "mt"
		pg.ShowPopUp("I'm loving Webix Intergrations!", 75, 375, "center")
	Case Else
		pg.Message(meid)
	End Select
End Sub