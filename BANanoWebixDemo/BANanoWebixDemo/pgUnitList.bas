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

Sub Init(pgContainer As String)
	pg.Initialize("forms", pgContainer).SetHeader("Lesson 11: Unit List")
	'
	Dim ul As WixUnitList
	ul.Initialize("ulx")
	ul.Setheight(500)
	ul.SetTemplate("#title#<br>#year#")
	ul.SetBorderLess(False)
	ul.SetStyle("margin", "10px")
	ul.SetItemHeight(80)
	'
	Dim dummy As UOENowData
	dummy.Initialize 
	Dim data As List = dummy.GetRecordsWithStructure(CreateMap("id": "id", "title": "name", "year": "year") ,10)
	ul.SetData(data)
	'
	pg.AddRows(ul.Item)
	'
	pg.ui
	'
	Dim eID As String
	pg.OnItemClick("ulx", BANano.CallBack(Me, "item_select", Array(eID)))
	' do this after ux
	pg.SetUniteBy("ulx", "title")
End Sub

Sub item_select(eID As String)
	eID = pg.CStr(eID)
	Dim m As Map = pg.GetItem("ulx", eID)
	pg.Message(BANano.ToJson(m))
End Sub
