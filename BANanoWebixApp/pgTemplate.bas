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

Sub Init(pgContainer As String)
	pg.Initialize("wp", pgContainer).SetHeader("Lesson 25: Template (pgTemplate)").SetResponsive("master")
	'
	Dim we As WixElement
	we.Initialize("we").SetPadding(40)
	'
	Dim t1 As WixTemplate
	t1.Initialize("t1").SetType("section").SetTemplate("Snarky Greeting")
	'
	Dim t2 As WixTemplate
	t2.Initialize("t2").SetTypeClean("").SetTemplate("Hello there, ugly bag of mostly water!")
	'
	we.AddRowItems(Array(t1.Item, t2.Item))
	'
	Dim pr1 As WixRow
	pr1.Initialize("pr1").SetAutoWidth(True).AddRows(we.Item)
	pr1.AddRows(CreateMap())
	'
	pg.AddRow(pr1)
	'
	pg.ui
End Sub
