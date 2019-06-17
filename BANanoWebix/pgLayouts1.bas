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

Sub Init()
	pg.Initialize("")
	
	Dim acc As WixAccordion
	acc.Initialize("")
	acc.SetHorizontal(False)
		
	acc.AddItem("","Column 1","Hellow from column 1",200,False)
	acc.AddItem("","Column 2","Hellow from column 2",300,True)
	acc.AddItem("","Column 3","Hellow from column 3",0,True)
	'assign accordion to the page
	pg.Page = acc.Accordion
	'
	pg.ui
End Sub