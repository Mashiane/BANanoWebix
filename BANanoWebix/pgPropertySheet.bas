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
	Public BANano As BANano
End Sub

Sub Init
	pg.Initialize("forms").SetHeader("Lesson 12: Property [Sheet]")
	'
	Dim prop As WixProperty
	prop.Initialize("prop").setwidth(260).Setheight(112).SetNameWidth(120).Setborderless(False)
	prop.SetStyle("margin", "10px")
	'
	prop.AddLabel("Baseball Player")
	prop.AddTextBox("Name")
	prop.AddSelect("Position", Array("1B", "2B", "3B", "LF", "CF", "RF", "SS", "C", "P"))
	prop.AddCheckBox("Injured?")
	'
	pg.Page.AddRows(prop.Item)
	'
	pg.ui
End Sub
