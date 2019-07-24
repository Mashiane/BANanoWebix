B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.51
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private Page As WixPage
	Private BANano As BANano
	Private ourclients As BANanoSQL
End Sub

'controller code for the side menu
Sub SettingsHandler(pg As WixPage, menuitem As String)
	ourclients.OpenWait("ourclients", "ourclients")
	Page = pg
	Select Case menuitem
		Case "settings_positions"
			pg.Show("mv_settings_positions")
			modPositions.SetPage(Page)
			modPositions.LoadPositions
			Page.Clear("formpositions")
			Page.ClearValidation("formpositions")
			Page.Show("btnnewposition")
			Page.HideMulti(Array("btncancelposition","btnsaveposition","btndeleteposition"))
		Case "settings_cities"
			pg.Show("mv_settings_cities")
			modCities.SetPage(Page)
			modCities.LoadCities
			Page.Clear("formcities")
			Page.ClearValidation("formcities")
			Page.Show("btnnewcity")
			Page.HideMulti(Array("btncancelcity","btnsavecity","btndeletecity"))
	End Select
End Sub


Sub AddToMultiView(pg As WixPage, mv As WixMultiView)
	Page = pg
	Dim dt1 As WixDataTable = modPositions.CreatePositionsDT
	Dim frm1 As WixForm = modPositions.CreatePositionsForm
	'
	Dim dt2 As WixDataTable = modCities.CreateCitiesDT
	Dim frm2 As WixForm = modCities.CreateCitiesForm
	
	Dim a As WixElement
	a.Initialize("mv_settings_positions").SetTemplate("Positions").SetTypeLine("")
	a.AddColumns(dt1.item)
	a.AddColumnsResizer("")
	a.AddColumns(frm1.item)
	'
	Dim b As WixElement
	b.Initialize("mv_settings_cities")
	b.AddColumns(dt2.Item)
	b.AddColumnsResizer("")
	b.AddColumns(frm2.Item)
	'
	mv.AddItem(a.Item)
	mv.AddItem(b.Item)
End Sub


Sub btnback_click
	Page.Back("mymv")
	Page.Clear("formpositions")
	Page.ClearValidation("formpositions")
	Page.Clear("formcities")
	Page.ClearValidation("formcities")
	Page.Show("btnnewposition")
	Page.HideMulti(Array("btncancelposition","btnsaveposition","btndeleteposition"))
	Page.Show("btnnewcity")
	Page.HideMulti(Array("btncancelcity","btnsavecity","btndeletecity"))
End Sub



