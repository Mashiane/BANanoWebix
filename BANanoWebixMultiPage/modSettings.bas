B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.51
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private Page As WixPage
End Sub

'controller code for the side menu
Sub SettingsHandler(pg As WixPage, menuitem As String)
	Page = pg
	Select Case menuitem
		Case "settings_positions"
			pg.Show("mv_settings_positions")
		Case "settings_cities"
			pg.Show("mv_settings_cities")
	End Select
End Sub

Sub AddToMultiView(mv As WixMultiView)
	Dim a As WixElement
	a.Initialize("mv_settings_positions").SetTemplate("Positions")
	'
	Dim b As WixElement
	b.Initialize("mv_settings_cities").SetTemplate("Cities")
	'
	mv.AddItem(a.Item)
	mv.AddItem(b.Item)
End Sub