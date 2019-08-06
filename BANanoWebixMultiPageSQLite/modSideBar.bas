B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.51
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private sm As WixSideBar
	Private Page As WixPage
	Private BANano As BANano
End Sub


'create the side menu
Sub Create(pg As WixPage) As Map
	Dim meid As String
	Page = pg
	sm.Initialize("sb")
	sm.SetCollapsed(True)
	sm.SetActiveTitle(True)
	'when an item is selected, fire sm_click passing the id of the element
	sm.SideBar.OnAfterSelect(BANano.CallBack(Me, "sm_click", Array(meid)))
	sm.AddItem("", "clients", "Clients","","mdi mdi-account-group", "","")
	sm.AddItem("", "settings", "Settings","","mdi mdi-settings", "","")
	sm.AddItem("settings", "settings_positions", "Positions","","mdi mdi-file-tree", "","")
	sm.AddItem("settings", "settings_cities", "Cities","","mdi mdi-city", "","")
	Return sm.item
End Sub

'when side menu is clicked
Sub sm_click(smid As String)
	Select Case smid
	Case "settings_positions"
		modPositions.ShowPage(Page)
	Case "settings_cities"
		modCities.ShowPage(Page)
	Case "clients"
		modClients.ShowPage(Page)
	End Select
End Sub
