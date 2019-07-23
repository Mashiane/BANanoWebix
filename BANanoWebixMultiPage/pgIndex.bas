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
	Private ourclients As BANanoSQL
End Sub

Sub Init(pgContainer As String)
	ourclients.OpenWait("ourclients", "ourclients")

	pg.Initialize("index", pgContainer).SetResponsive(True)
	'
	Dim tblBar As WixToolBar
	tblBar.Initialize("tblBar")
	tblBar.CreateIcon("menuopen").SetIcon("mdi mdi-menu").SetClick(BANano.CallBack(Me, "OpenMenu", Null)).Pop
	tblBar.CreateLabel("heading").SetLabel("Our Clients").Pop
	tblBar.AddSpacer
	 
	pg.AddRows(tblBar.Item)
	'
	Dim R2 As WixRow
	R2.Initialize("R2")
	R2.AddColumns(modSideMenu.Create(pg))
	'
	Dim mv As WixMultiView
	mv.Initialize("mymv")
	'
	modSettings.AddToMultiView(mv)
	'
	R2.AddColumns(mv.item)
	pg.AddRow(R2) 
	'
	pg.UI
	'
	pg.Show("mv_settings_positions")
End Sub


Sub OpenMenu()
	pg.Toggle("sm")
End Sub
