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
End Sub

Sub Init(pgContainer As String)
	pg.Initialize("wp", pgContainer).SetHeader("Lesson 4.2: MultiView (pgMultiView2)").SetResponsive("master").SetTypeClean("")
	'
	Dim R1 As WixRow
	R1.Initialize("r1")
	'
	Dim seg As WixSegmented
	seg.Initialize("tabbar").Setvalue("view1").SetMultiview(True)
	seg.AddOption("view1", "Form")
	seg.AddOption("view2", "Info")
	'
	Dim mv As WixMultiView
	mv.Initialize("mymv")
	'
	Dim v1 As WixElement
	v1.Initialize("view1").SetTemplate("Form Content")
	mv.AddItem(v1.Item)
	'
	Dim v2 As WixElement
	v2.Initialize("view2").Settemplate("<i>Info about the Form</i>")
	mv.AddItem(v2.Item)
	
	'
	R1.AddRows(seg.Item)
	R1.AddRows(mv.Item)
	
	'
	pg.AddRow(R1)
	'
	pg.ui
End Sub