B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.51
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private pg As WixPage
End Sub

Sub Init
	pg.Initialize("").SetHeader("Lesson 5.1 Bottom MultiView")
	'
	Dim R1 As WixRow
	R1.Initialize("R1")
	
	'
	Dim mv As WixTabView
	mv.Initialize("mv").SetHeight(60).SetTypeBottom(True)
	'
	R1.AddItem(mv.Item)
	'
	pg.AddRow(R1)
	' 
	pg.ui
End Sub