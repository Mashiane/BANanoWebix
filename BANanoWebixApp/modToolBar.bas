B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.51
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private BANano As BANano 'ignore
End Sub

Sub getToolBar As WixToolBar
	Dim shdr As String = "BANanoWebix Form Designer [" & modSideBar.version & "]"
	Dim tblBar As WixToolBar
	tblBar.Initialize("tblBar").SetHeight(58).setPadding(9)
	tblBar.CreateIcon("menuopen").SetIcon("mdi mdi-menu").SetClick(BANano.CallBack(pgFD, "OpenMenu", Null)).Pop
	tblBar.CreateLabel("heading").SetLabel(shdr).Pop
	tblBar.AddSpacer
	'tblBar.createicon("multi").SetIcon("mdi mdi-share-variant").SetTooltip("Add multiple elements").SetClick(BANano.CallBack(pgFD,"multiels", Null)).pop
	tblBar.CreateIcon("refresh").SetIcon("mdi mdi-refresh").SetTooltip("Refresh tree").SetClick(BANano.CallBack(pgFD,"refreshapp", Null)).pop
	tblBar.CreateIcon("clearform1").SetIcon("mdi mdi-trash-can").SetTooltip("Trash project").SetClick(BANano.CallBack(pgFD,"clearform", Null)).pop
	'
	tblBar.CreateIcon("help").SetIcon("mdi mdi-help").SetTooltip("Hints").SetClick(BANano.CallBack(pgFD,"showhints", Null)).pop
	tblBar.CreateIcon("collab").SetIcon("mdi mdi-wechat").SetTooltip("Collaborate").SetClick(BANano.CallBack(pgFD,"collabwait",Null)).pop
	Return tblBar
End Sub
