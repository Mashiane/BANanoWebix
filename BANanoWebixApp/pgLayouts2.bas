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
	'create a wide layout on the page
	pg.Initialize("wp", pgContainer).SetHeader("Lesson 3.2 Accordion (pgLayouts2)").SetType("wide").SetResponsive("master")
	'
	Dim R0 As WixRow
	R0.Initialize("R0") 
	'
	Dim acc As WixAccordion
	acc.Initialize("va")
	acc.Accordion.SetWidth(300)
	acc.Accordion.SetTypeWide("")
	acc.SetMulti(True)
	acc.AddItem("","Babylon 5","Sheridan<br>Delenn<br>Garibaldi<br>G'Kar<br>Londo",False,False)
	acc.AddItem("","Star Trek","Kirk<br>Sisko<br>Archer<br>Picard<br>Janeway",True,False)
	acc.AddItem("","Stargate SG-1","O'Neill<br>Danial<br>Carter<br>Teal'c",True,False)
	'add the layout to the columns collection of the page
	acc.Accordion.AddToColumns(R0.Row)
	'
	Dim lout As WixLayout
	lout.Initialize("")
	lout.Layout.SetTypeWide("")
	Dim R1 As WixElement
	R1.Initialize("").SetTemplate("Row-1").AddToRows(lout.Layout)
	Dim r2 As WixElement
	r2.Initialize("").SetTemplate("Row-2").AddToRows(lout.Layout)
	'
	lout.Layout.AddRowsSpacer("")
	'
	Dim r3 As WixElement
	r3.Initialize("").SetTemplate("Row-3").AddToRows(lout.Layout)
	Dim r4 As WixElement
	r4.Initialize("").SetTemplate("Row-4").AddToRows(lout.Layout)
	lout.Layout.AddToColumns(R0.Row)
	'
	pg.AddRow(R0)
	
	pg.ui
End Sub
