B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.51
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private pg As WixPage
	Public BANano As BANano
End Sub

Sub Init
	pg.Initialize("forms").SetHeader("Lesson 16: PopUp")
	
	
	pg.ui
End Sub
