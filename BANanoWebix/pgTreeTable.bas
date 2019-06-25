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
	pg.Initialize("forms").SetHeader("Lesson 14: Tree Table")
	'
	Dim prop As WixTreeTable
	prop.Initialize("treetable").Setborderless(True)
	prop.SetStyle("margin", "10px").SetWidth(550).SetHeight(300)
	'
	Dim c1 As WixDataColumn
	c1.Initialize1(prop, "id").SetHeader("").Setwidth(50).SetSort("string").pop1
	'
	Dim c2 As WixDataColumn
	c2.Initialize1(prop, "value").Setheader("Candy Bars").Setwidth(300).SetTemplate("{common.treetable()} #value#").Setsort("string").Pop1
	'
	Dim c3 As WixDataColumn
	c3.Initialize1(prop, "nutsOrNot").Setheader("Nuts?").Setwidth(180).SetSort("string").Pop1
	'	
	Dim data As List
	data.Initialize
	'
	Dim dummy As UOENowData
	dummy.Initialize 
	data = dummy.GetRecordsWithStructure(CreateMap("id": "id", "value":"name", "open": dummy.DT_YES_NO, "nutsOrNot": "name"), 10)
	prop.SetData(data)
	
	pg.Page.AddRows(prop.Item)
	'
	pg.ui
End Sub
