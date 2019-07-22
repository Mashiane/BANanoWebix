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
	sm.Initialize("sm").SetCollapsed(True).SetActiveTitle(True)
	sm.SideBar.OnAfterSelect(BANano.CallBack(Me, "SideMenu_Click", Array(meid)))
	sm.AddItem("", "clients", "Clients","","mdi mdi-account-group", "","")
	sm.AddItem("", "settings", "Settings","","mdi mdi-settings", "","")
	SettingsMenu
	Return sm.item
End Sub

'when side menu is clicked
Sub SideMenu_Click(smid As String)
	Page.Message(smid)
	'get the prefix and suffix of the selected item
	Dim sprefix As String = Page.MvField(smid,1,"_")
	Select Case sprefix
	Case "settings"
		modSettings.SettingsHandler(Page, smid)
	Case "clients"
	End Select
End Sub

Sub SettingsMenu
	sm.AddItem("settings", "settings_positions", "Positions","","mdi mdi-file-tree", "","")
	sm.AddItem("settings", "settings_cities", "Cities","","mdi mdi-city", "","")
End Sub
