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
End Sub

Sub Init(pgContainer As String)
	pg.Initialize("index", pgContainer).SetResponsive(True).SetHeader("Hello BANanoWebix")
	pg.UI
End Sub
