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
	pg.Initialize("wp", pgContainer).SetHeader("Lesson 21: TabBar").SetResponsive("master")
	'
	Dim R1 As WixRow
	R1.Initialize("R1")
	
	Dim R2 As WixRow
	R2.Initialize("R2")
	
	'
	Dim tb As WixTabBar
	tb.Initialize("tb").SetHeight(60).SetTypeBottom(True).SetMultiView(True).SetAnimate(True)
	tb.AddItem("listView", "List", "wxi-file")
	tb.AddItem("formView", "Form", "wxi-columns")
	tb.AddItem("aboutView", "About", "wxi-alert")
	'
	'load flat data
	Dim data As List
	data.Initialize
	data.Add(CreateMap("id":1, "value":"The Shawshank Redemption", "year":1994, "votes":678790, "rating":9.2, "rank":1))
	data.Add(CreateMap("id":2, "value":"The Godfather", "year":1972, "votes":511495, "rating":9.2, "rank":2))
	data.Add(CreateMap("id":3, "value":"The Godfather: Part II", "year":1974, "votes":319352, "rating":9.0, "rank":3))
	data.Add(CreateMap("id":4, "value":"The Good, the Bad And the Ugly", "year":1966, "votes":213030, "rating":8.9, "rank":4))
	data.Add(CreateMap("id":5, "value":"Pulp fiction", "year":1994, "votes":533848, "rating":8.9, "rank":5))
	data.Add(CreateMap("id":6, "value":"12 Angry Men", "year":1957, "votes":164558, "rating":8.9, "rank":6))
	
	Dim lst As WixList
	lst.Initialize("listView").SetItemHeight(60)
	lst.SetTemplate("#rank#. #value# <div style='padding-left:18px'> Year:#year#, votes:#votes# </div>")
	lst.SetSelect(True).SetData(data)
	'
	Dim frm As WixLayout
	frm.Initialize("formView")
	Dim l1 As WixElement
	l1.Initialize("l1").SetTemplate("Put form contents here...")
	frm.Layout.SetTypeWide("")
	frm.Layout.AddColumns(l1.item)
	'
	Dim frm1 As WixLayout
	frm1.Initialize("aboutView")
	Dim l2 As WixElement
	l2.Initialize("l2").SetTemplate("About TabBar...")
	frm1.Layout.SetTypeWide("")
	frm1.Layout.AddColumns(l2.item)
	'
	R1.AddCells(lst.Item)
	R1.AddCells(frm.Item)
	R1.AddCells(frm1.Item)
	
	'
	R2.AddItem(tb.Item)
	'
	pg.AddRow(R1)
	pg.AddRow(R2)
	'
	pg.ui
End Sub