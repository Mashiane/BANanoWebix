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
	pg.Initialize("wp", pgContainer).SetHeader("Lesson 14: Tree Table").SetResponsive("master")
	'
	Dim prop As WixTreeTable
	prop.Initialize("treetable").Setborderless(True)
	prop.SetStyle("margin", "10px")
	prop.SetSelect(prop.DT_SELECT_ROW)
	prop.SetAutoWidth(True).SetEditable(True)
	'
	Dim c1 As WixDataColumn
	c1.Initialize("id").SetHeader("#").Setwidth(50).SetSort("string").AddToColumns(prop.TreeTable)
	' 
	Dim c2 As WixDataColumn
	c2.Initialize("value").Setheader("Candy Bars").SetFillSpace(True).SetTemplate("{common.treetable()} #value#").Setwidth(300).Setsort("string").AddToColumns(prop.treeTable)
	'
	Dim c3 As WixDataColumn
	c3.Initialize("nutsornot").Setheader("Nuts?").Setwidth(180).SetSort("string").AddToColumns(prop.treeTable)
	'
	prop.AddItem("", "1", "Hershey", CreateMap(), True)
	prop.AddItem("1", "1.1", "Almond Joy", CreateMap("nutsOrNot" : "Has Nuts"),False)
	prop.AddItem("1", "1.2", "Hershey's Kisses", CreateMap("nutsOrNot" : "No Nuts"), True)
	prop.AddItem("1.2", "1.2.1", "Milk Chocolate With Almonds", CreateMap("nutsOrNot" : "Oh Yeah, Except These"), False)
	'
	Dim items As List = prop.items
	Dim data As List = pg.Unflatten(items, "data")
	prop.SetData(data)
	'
	pg.AddRows(prop.Item)
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