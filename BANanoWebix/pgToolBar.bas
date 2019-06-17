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
	Public BANano As BANano ' ignore
End Sub

Sub Init
	pg.Initialize("")
	'
	'create a header to add to the page
	Dim hdr As WixHeader
	hdr.Initialize("hdr")
	hdr.Header.SetTemplate("Lesson 5: WixToolBar")
	hdr.Header.AddToRows(pg.Page)
	
	'create a toolbar
	Dim tblBar As WixToolBar
	tblBar.Initialize("")
	'set the height of the toolbar and the batch of controls to be visible on init
	tblBar.ToolBar.SetHeight(60).SetVisibleBatch(1)
	'settings to be applied to each element added to the toolbar
	tblBar.ToolBar.SetDefaultWidth(90).SetDefaultTypeIconButton
	'
	tblBar.CreateButton("btnNew").SetLabel("New").SetIcon("file").SetClick(BANano.CallBack(Me,"btnnew_click",Null)).SetBatch(1).Pop
	'
	Dim btnOpen As WixButton
	btnOpen.Initialize("btnOpen").SetLabel("Open").SetIcon("folder-open").SetBatch(2).SetClick(BANano.CallBack(Me,"btnopen_click",Null)).AddToToolbar(tblBar)
'	'
	tblBar.CreateButton("btnClose").SetLabel("Close").SetIcon("window-close").SetBatch(1).SetClick(BANano.CallBack(Me,"btnclose_click",Null)).AddToToolbar(tblBar)
	
	Dim btnSave As WixButton
	btnSave.Initialize("btnSave").SetLabel("Save").SetWidth(90).SetTypeIconButton("").SetIcon("window-close").SetBatch(2).SetClick(BANano.CallBack(Me,"btnsave_click",Null)).AddToToolbar(tblBar)
	'
	tblBar.AddSpacer
	'
	'create toggle buttons
	tblBar.CreateToggle("imgt3").SetTypeIcon("").SetOffIcon("wxi-close").SetOnIcon("wxi-check").SetLabel("Music").Pop
	tblBar.CreateToggle("imgt4").SetTypeIconButtonTop("").SetIcon("wxi-sync").SetOnLabel("Wi-Fi On").SetOffLabel("Wi-Fi Off").Pop
	tblBar.AddSpacer
	tblBar.CreateButton("btnImage").SetLabel("Image").SetTypeImage("").SetWidth(150).SetImage("./assets/icons8-save-as-100.png").Pop
	tblBar.CreateButton("btnImageButton").SetLabel("ImageButton").SetTypeImageButton("").SetImage("./assets/icons8-compose-40.png").SetWidth(40).Pop
	tblBar.CreateButton("btnIcon").SetTypeIcon("").SetIcon("wxi-file").SetWidth(200).SetLabel("File Name").Pop
	'
	tblBar.AddSpacer
	'
	'create icons
	Dim icn As WixIcon
	icn.Initialize("icn").SetIcon("wxi-angle-up").SetClick(BANano.CallBack(Me,"up_click",Null)).AddToToolbar(tblBar)
	'
	tblBar.CreateIcon("icn1").SetIcon("wxi-angle-down").SetClick(BANano.CallBack(Me,"down_click",Null)).Pop
	' 
	tblBar.AddToPage(pg)
	'
	pg.ui
End Sub

Sub Up_click
	pg.Message("up")
End Sub

Sub Down_click
	pg.ToastError("Down!")
End Sub

Sub btnNew_click
	pg.Message("btnNew_click")
End Sub

Sub btnOpen_click
	pg.Message("btnOpen_click")
End Sub

Sub btnSave_click
	pg.Message("btnSave_click")
End Sub

Sub btnClose_click
	Dim result As Boolean = False
	Dim cb As BANanoObject = BANano.CallBack(Me,"closeresult",Array(result))
	pg.Confirm(cb, "Confirm Close", "Are you sure that you want to close?")
End Sub

'callback should be ConfirmResult_{Tag}
Sub closeresult(result As Boolean)
	pg.Message(result)
End Sub
