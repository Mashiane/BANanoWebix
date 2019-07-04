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
	Private gmap As WixGoogleMap
	Private BANano As BANano  'ignore
End Sub

Sub Init(pgContainer As String)
	pg.Initialize("wp", pgContainer).SetHeader("Lesson 20: Google Map").SetResponsive("master")
	'
	Dim R1 As WixRow
	R1.Initialize("R1")
	'
	gmap.Initialize("gmap").SetHeight(480).SetBorderLess(False).SetStyle("margin", "10px")
	gmap.SetKey("AIzaSyAi0oVNVO-e603aUY8SILdD4v9bVBkmiTg").SetZoom(6).SetMapType(gmap.MAP_TYPE_ROADMAP)
	gmap.SetCenter(25.335, 2.324)
	'
	'add markers
	gmap.AddMarker("1", 25.355, 2.324, "Point A", True, False)
	gmap.AddMarker("2", 25.444, 5.43, "Point B", False, False)
	gmap.AddMarker("3", 25.123, 12.375, "Point C", False, False)
	'
	R1.AddItem(gmap.Item)
	
	pg.AddRow(R1)
	'
	pg.ui
	Dim maID As String
	pg.OnItemClick("gmap", BANano.CallBack(Me,"marker_click", Array(maID)))
	
End Sub


Sub marker_click(maid As String)
	Dim m As Map = pg.GetMarker("gmap", maid)
	pg.Message(BANano.ToJson(m))
End Sub