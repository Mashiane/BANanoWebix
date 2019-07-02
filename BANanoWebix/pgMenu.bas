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
	Private smUX As BANanoObject
	Private winUX As BANanoObject
	Private win As WixWindow
	Private sm As WixSideMenu
End Sub

Sub CreateWindow
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
	winUX = pg.AddWindow(win)
End Sub

Sub CreateSideMenu
	'*** DO NOT USE SIDE MENU
	sm.Initialize("sm")
	sm.SetSelect(True)
	sm.AddItem("new", "New", "", "mdi mdi-account","2","")
	sm.AddItem("open", "Open", "http://www.b4x.com", "mdi mdi-cube","","")
	sm.AddItem("close", "Close", "", "mdi mdi-database","3","")
	smUX = pg.AddSideMenu(sm)
End Sub

Sub Init
	pg.Initialize("forms")
	'add toolbar
	Dim tblBar As WixToolBar
	tblBar.Initialize("tblBar")
	tblBar.CreateIcon("menuopen").SetIcon("mdi mdi-menu").SetClick(BANano.CallBack(Me, "OpenMenu", Null)).Pop
	tblBar.CreateLabel("heading").SetLabel("Lesson 15: Menus").Pop
	pg.Page.AddRows(tblBar.Item) 
	
	'
	CreateSideMenu	
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
	menu.AddItem("", "mt", "Man Tactical","","","3","")
	menu.AddItem("mt", "mtw", "Worf", "","","","")
	menu.AddItem("mt", "mtd", "Data", "","","","")
	menu.AddSeparator("mt")
	menu.AddItem("mt", "mtr", "Riker", "","","","")
	menu.AddItem("", "fp", "Fire Phasers","","","","")
	menu.AddItem("", "ft", "Fire Torpedoes", "","","","")
	menu.AddItem("", "win", "Window", "","","","")
	menu.AddItem("", "iframe", "iFrame", "","","","")
	'
	Dim data As List = pg.Unflatten(menu.Items,"submenu")
	menu.setdata(data)
	pg.Page.AddRows(menu.Item)
	
	
	'
	pg.Page.AddRows(CreateMap())
	'
	
	Dim menu1 As WixMenu
	menu1.Initialize("menu1")
	'show down arrow
	menu1.SetItemSubSign(True)
	menu1.SetSelect(True)
	menu1.setWidth(180)
	menu1.SetHeight(300)
	'make menu vertical
	menu1.SetLayoutY("")
	menu1.AddItem("", "mt", "Man Tactical","","","3","")
	menu1.AddItem("mt", "mtw", "Worf", "","","","")
	menu1.AddItem("mt", "mtd", "Data", "","","","")
	menu1.AddSeparator("mt")
	menu1.AddItem("mt", "mtr", "Riker", "","","","")
	menu1.AddItem("", "fp", "Fire Phasers","","","","")
	menu1.AddItem("", "ft", "Fire Torpedoes", "","","","")
	menu1.AddItem("", "win", "Window", "","","","")
	menu1.AddItem("", "iframe", "iFrame", "","","","")
	pg.Page.AddRows(menu1.Item)
	
	
	'put menu on side
	
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
	Dim meID As Map
	pg.onMenuItemClick("menu", BANano.CallBack(Me, "itemClick", Array(meID)))
	pg.onMenuItemClick("menu1", BANano.CallBack(Me, "itemClick", Array(meID)))

End Sub

Sub OpenMenu(meid As String)
	'toggle sidemenu
	Dim bVisible As Boolean = pg.IsVisible(smUX)
	If bVisible Then
		pg.Hide(smUX)
	Else
		pg.Show(smUX)
		'assign event
		'Dim meid As String
		'pg.OnAfterSelect("sm", BANano.CallBack(Me, "sideClick", Array(meid)))
	End If
End Sub

Sub sideClick(meid As String)
	pg.Message(meid)
End Sub


Sub windowClick(meID As String)
	Select Case meID
	Case "icnclose"
		pg.Close(winUX)
	Case Else
		pg.Message(meID)
	End Select
End Sub

Sub itemClick(meid As String)
	Select Case meid
	Case "iframe"
	Case "win"
		CreateWindow
		pg.Show(winUX)
		'assign event
		pg.OnItemClick(win.ToolBarID, BANano.CallBack(Me, "windowClick", Array(meid)))
	Case "mt"
		pg.ShowPopUp("I'm loving Webix Intergrations!", 75, 375, "center")
	Case Else
		pg.Message(meid)
	End Select
End Sub