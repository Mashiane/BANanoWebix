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
	pg.Initialize("wp", pgContainer).SetHeader("Lesson 3.1. Accordion (pgLayout1)").SetResponsive("master")
	
	Dim acc As WixAccordion
	acc.Initialize("")
		
	acc.AddItem("","Column 1","Hellow from column 1",False,True)
	acc.AddItem("","Column 2","Hellow from column 2",True,True)
	acc.AddItem("","Column 3","Hellow from column 3",True,True)
	'
	Dim R1 As WixRow
	R1.Initialize("R1")
	R1.AddItem(acc.Item)
	'
	pg.AddRow(R1)
	'
	pg.ui
End Sub