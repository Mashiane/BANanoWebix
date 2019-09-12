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
	Public pgcont As String
End Sub

Sub AttachEvents
	Dim meid As String
	Page.OnAfterSelect("sm", BANano.CallBack(Me, "SideMenu_Click", Array(meid)))
End Sub

'create the side menu
Sub Create(pg As WixPage) As Map
	Page = pg
	sm.Initialize("sm").SetCollapsed(True).SetActiveTitle(True)
	sm.AddItem("", "archivi", "Archivi","","mdi mdi-database", "","")
	ArchiviMenu
	sm.AddItem("", "settings", "Settings","","mdi mdi-settings", "","")
	UtilityMenu
	Return sm.item
End Sub

'when side menu is clicked
Sub SideMenu_Click(smid As String)
	'Page.Message(smid)
	'get the prefix and suffix of the selected item
	'Dim sprefix As String = Page.MvField(smid,1,"_")
	Dim suffix As String = smid.SubString(4)
	Log(suffix)
	Page.Message(suffix.ToUpperCase)
	Select Case suffix.ToUpperCase
	Case "CLIENTI", "PRODOTTI"
		modArchivi.ArchiviHandler(suffix, pgcont)
	Case "settings"
		modUtility.UtilityHandler(suffix, pgcont)
	End Select
End Sub

Sub UtilityMenu
	sm.AddItem("settings", "utility_backup", "Backup Files","","", "","")
	sm.AddItem("settings", "utility_restore", "Restore Backup","","", "","")
End Sub



Sub ArchiviMenu
	sm.AddItem("archivi", "arc_clienti", "Clienti","","", "","")
	sm.AddItem("archivi", "arc_prodotti", "Prodotti","","", "","")
End Sub
