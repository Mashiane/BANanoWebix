B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.51
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private pg As WixPage
	Private BANano As BANano
End Sub

Sub Init(pgContainer As String)
	pg.Initialize("wp", pgContainer).SetResponsive("master")
	'
	Dim tblBar As WixToolBar
	tblBar.Initialize("tblBar")
	tblBar.CreateIcon("menuopen").SetIcon("mdi mdi-menu").SetClick(BANano.CallBack(Me, "OpenMenu", Null)).Pop
	tblBar.CreateLabel("heading").SetLabel("Form Designer").Pop
	tblBar.setPadding(3)
	'
	pg.AddToolBar(tblBar)
	'
	Dim sm As WixSideBar
	sm.Initialize("smp").SetPositionRight("").SetCollapsed(False).SetActiveTitle(True).SetScroll(True)
	Dim items As List = sm.Items
	Dim data As List = pg.Unflatten(items,"data")
	sm.SetData(data)
	'
	Dim R2 As WixRow
	R2.Initialize("R2")
	'
	R2.AddColumns(sm.Item)
	
	Dim R2C2 As WixElement
	R2C2.Initialize("R2C2")
	Dim div As UOENowHTML
	div.Initialize("r2c2_content","div").SetStyle("width","100%").SetStyle("height","100%")
	R2C2.SetTemplate(div.HTML)
	'
	R2.AddColumns(R2C2.item)
	'
	pg.AddRow(R2)
	'
	pg.ui
	'
	Dim meid As Map
	pg.OnItemClick("smp", BANano.CallBack(Me, "itemClick", Array(meid)))
End Sub

Sub OpenMenu()
	pg.Toggle("smp")
End Sub
