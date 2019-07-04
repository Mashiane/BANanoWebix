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
	pg.Initialize("wp", pgContainer).SetHeader("Lesson 3.1. Accordion").SetResponsive("master")
	
	Dim acc As WixAccordion
	acc.Initialize("")
	acc.SetHorizontal(False)
		
	acc.AddItem("","Column 1","Hellow from column 1",200,False)
	acc.AddItem("","Column 2","Hellow from column 2",300,True)
	acc.AddItem("","Column 3","Hellow from column 3",0,True)
	'
	Dim R1 As WixRow
	R1.Initialize("R1")
	R1.AddItem(acc.Item)
	'
	pg.AddRow(R1)
	'
	pg.ui
End Sub