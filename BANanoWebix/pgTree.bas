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
	pg.Initialize("forms").SetHeader("Lesson 13: Tree")
	'
	Dim prop As WixTree
	prop.Initialize("tree").SetSelect(True).Setborderless(False)
	prop.SetStyle("margin", "10px").SetWidth(240).SetHeight(200)
	
	Dim data As List
	data.Initialize
	
	Dim dummy As UOENowData
	dummy.Initialize
	data = dummy.GetRecordsWithStructure(CreateMap("id":"id", "value": "name", "open": dummy.DT_YES_NO), 20)
	 
	prop.SetData(data)
	
	pg.Page.AddRows(prop.Item)
	'
	pg.ui
End Sub
