B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.51
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private Page As WixPage
	Public BANano As BANano
End Sub


Sub Init
	Page.Initialize("index", "body").SetResponsive(True)
	'
	Dim tblBar As WixToolBar
	tblBar.Initialize("tblBar")
	tblBar.CreateIcon("menuopen").SetIcon("mdi mdi-menu").SetClick(BANano.CallBack(Me, "OpenMenu", Null)).Pop
	tblBar.CreateLabel("heading").SetLabel("Warehouse Version 1").Pop
	tblBar.AddSpacer
	tblBar.CreateIcon("").SetWidth(100).SetIcon("mdi mdi-help-circle-outline").SetTooltip("Help").SetClick(BANano.CallBack(Me, "help_click", Null)).Pop
	 
	Page.AddRows(tblBar.Item)
	'
	Dim mv As WixMultiView
	mv.Initialize("mymv")
	'
	pgGoDown.AddPage(Page, mv)
	'
	Dim R2 As WixRow
	R2.Initialize("R2")
	R2.AddColumns(mv.item)
	Page.AddRow(R2)
	'
	Page.UI
	'
	pgGoDown.ShowPage(Page)
End Sub