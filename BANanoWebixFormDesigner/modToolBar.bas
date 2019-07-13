B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.51
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private BANano As BANano
End Sub

Sub getToolBar As WixToolBar
	Dim tblBar As WixToolBar
	tblBar.Initialize("tblBar").SetHeight(56)
	tblBar.CreateIcon("menuopen").SetIcon("mdi mdi-menu").SetClick(BANano.CallBack(pgFormDesigner, "OpenMenu", Null)).Pop
	tblBar.CreateLabel("heading").SetLabel("BANanoWebix - Form Designer").Pop
	tblBar.AddSpacer
	tblBar.createicon("multi").SetIcon("mdi mdi-share-variant").SetTooltip("Add multiple elements").SetClick(BANano.CallBack(pgFormDesigner,"multiels", Null)).pop
	tblBar.CreateIcon("refresh").SetIcon("mdi mdi-refresh").SetTooltip("Refresh tree").SetClick(BANano.CallBack(pgFormDesigner,"refreshapp", Null)).pop
	tblBar.CreateIcon("clearform").SetIcon("mdi mdi-trash-can").SetTooltip("Clear form").SetClick(BANano.CallBack(pgFormDesigner,"clearform", Null)).pop
	'
	tblBar.CreateIcon("help").SetIcon("mdi mdi-help").SetTooltip("Hints").SetClick(BANano.CallBack(pgFormDesigner,"showhints", Null)).pop
	tblBar.CreateAvatar("avatar", "./assets/3.jpg").SetTooltip("Click here To change settings").AddToColumns(tblBar.ToolBar)
	tblBar.setPadding(3)
	Return tblBar
End Sub