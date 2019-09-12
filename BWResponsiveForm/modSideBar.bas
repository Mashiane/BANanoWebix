B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.8
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private sm As WixSideBar
	Private Page As WixPage
	Private BANano As BANano  'ignore
End Sub


'create the side menu
Sub Create(pg As WixPage) As Map
	Dim meid As String
	Page = pg
	sm.Initialize("sb")
	sm.SetCollapsed(False)
	sm.SetActiveTitle(True)
	'when an item is selected, fire sm_click passing the id of the element
	sm.SideBar.OnAfterSelect(BANano.CallBack(Me, "sm_click", Array(meid)))
	sm.AddItem("", "archivi", "Archivi","","mdi mdi-database", "","")
	sm.AddItem("archivi", "arc_clienti", "Clienti","","", "","")
	sm.AddItem("archivi", "arc_prodotti", "Prodotti","","", "","")
	sm.AddItem("", "settings", "Settings","","mdi mdi-settings", "","")
	sm.AddItem("settings", "utility_backup", "Backup Files","","", "","")
	sm.AddItem("settings", "utility_restore", "Restore Backup","","", "","")
	Return sm.item
End Sub

Sub sm_click(meid As String)
	Select Case meid
	Case "arc_clienti"
		modClient.ShowPage(Page)
	Case "arc_prodotti"
		modArchivi.ShowPage(Page)
	Case "utility_backup"
	Case "utility_restore"
	End Select
End Sub