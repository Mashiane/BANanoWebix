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
	prop.SetStyle("margin", "10px")
	prop.SetSelect(prop.DT_SELECT_ROW)
	prop.SetAutoWidth(True).SetEditable(True)
	'
	Dim c1 As WixDataColumn
	c1.Initialize1(prop, "id").SetHeader(" ").Setwidth(50).SetSort("string").pop1
	' 
	Dim c2 As WixDataColumn
	c2.Initialize1(prop, "value").Setheader("Candy Bars").SetTemplate("{common.treetable()} #value#").Setwidth(300).Setsort("string").Pop1
	'
	Dim c3 As WixDataColumn
	c3.Initialize1(prop, "nutsornot").Setheader("Nuts?").Setwidth(180).SetSort("string").Pop1
	'	
	Dim data As List
	data.Initialize
	'
	Dim dummy As UOENowData
	dummy.Initialize 
	data = dummy.GetRecordsWithStructure(CreateMap("id": "id", "value":"name", "open": dummy.DT_YES_NO, "nutsornot": "name"), 10)
	prop.SetData(data)
	
	pg.Page.AddRows(prop.Item)
	'
	pg.ui
	Dim recid As String
	pg.OnItemClick("treetable", BANano.CallBack(Me, "tree_itemclick", Array(recid)))

End Sub


Sub tree_itemclick(recid As String)
	recid = pg.CStr(recid)
	'
	pg.Message(recid)
End Sub