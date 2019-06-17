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
	'create a wide layout on the page
	pg.Initialize("")
	pg.Page.SetType("wide")
	'
	Dim acc As WixAccordion
	acc.Initialize("va")
	acc.Accordion.SetWidth(300)
	acc.Accordion.SetTypeWide
	acc.AddItem("","Babylon 5","Sheridan<br>Delenn<br>Garibaldi<br>G'Kar<br>Londo",0,False)
	acc.AddItem("","Star Trek","Kirk<br>Sisko<br>Archer<br>Picard<br>Janeway",0,True)
	acc.AddItem("","Stargate SG-1","O'Neill<br>Danial<br>Carter<br>Teal'c",0,True)
	'add the layout to the columns collection of the page
	acc.Accordion.AddToColumns(pg.Page)
	'
	Dim lout As WixLayout
	lout.Initialize("")
	lout.Layout.SetTypeWide 
	Dim r1 As WixElement
	r1.Initialize("").SetTemplate("Row-1").AddToRows(lout.Layout)
	Dim r2 As WixElement
	r2.Initialize("").SetTemplate("Row-2").AddToRows(lout.Layout)
	'
	lout.Layout.AddRowsSpacer
	'
	Dim r3 As WixElement
	r3.Initialize("").SetTemplate("Row-3").AddToRows(lout.Layout)
	Dim r4 As WixElement
	r4.Initialize("").SetTemplate("Row-4").AddToRows(lout.Layout)
	lout.Layout.AddToColumns(pg.Page)
	pg.ui
End Sub
