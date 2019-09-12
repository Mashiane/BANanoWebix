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


Sub UtilityHandler(menuitem As String, pgContainer As String)
	Page.Initialize("pa", pgContainer).SetResponsive("index")
	Select Case menuitem
	Case "utility_backup"
	Case "utility_restore"
	End Select
End Sub