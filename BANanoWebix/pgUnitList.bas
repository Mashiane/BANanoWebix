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
	pg.Initialize("forms").SetHeader("Lesson 11: Unit List")
	'
	Dim ul As WixUnitList
	ul.Initialize("ulx").Setwidth(300).Setheight(280).SetTemplate("#title#").SetBorderLess(False)
	ul.SetStyle("margin", "10px").SetUniteBy("title")
	'
	Dim dummy As UOENowData
	dummy.Initialize 
	Dim data As List = dummy.GetRecordsWithStructure(CreateMap("id": "id", "title": "name") ,10)
	ul.SetData(data)
	'
	pg.Page.AddRows(ul.Item)
	'
	pg.ui	
End Sub
