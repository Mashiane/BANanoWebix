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
	c1.Initialize1(prop, "id").SetHeader("#").Setwidth(50).SetSort("string").pop1
	' 
	Dim c2 As WixDataColumn
	c2.Initialize1(prop, "value").Setheader("Candy Bars").SetTemplate("{common.treetable()} #value#").Setwidth(300).Setsort("string").Pop1
	'
	Dim c3 As WixDataColumn
	c3.Initialize1(prop, "nutsornot").Setheader("Nuts?").Setwidth(180).SetSort("string").Pop1
	'
	prop.AddItem("", "1", "Hershey", CreateMap(), True)
	prop.AddItem("1", "1.1", "Almond Joy", CreateMap("nutsOrNot" : "Has Nuts"),False)
	prop.AddItem("1", "1.2", "Hershey's Kisses", CreateMap("nutsOrNot" : "No Nuts"), True)
	prop.AddItem("1.2", "1.2.1", "Milk Chocolate With Almonds", CreateMap("nutsOrNot" : "Oh Yeah, Except These"), False)
	'
	Dim data As List = pg.Unflatten(prop.Items, "data")
	prop.SetData(data)
	'
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