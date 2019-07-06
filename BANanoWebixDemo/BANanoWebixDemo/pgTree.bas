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
	pg.Initialize("wp", pgContainer).SetHeader("Lesson 13: Tree").SetResponsive("master")
	'
	Dim prop As WixTree
	prop.Initialize("tree").SetSelect(True).Setborderless(False)
	prop.SetStyle("margin", "10px")
	prop.SetTypeLineTree(True)
	prop.SetGroupBy("#year#")  ' still buggy...
	
	'load flat data
	Dim data As List
	data.Initialize
	data.Add(CreateMap("id":1, "value":"The Shawshank Redemption", "year":1994, "votes":678790, "rating":9.2, "rank":1))
	data.Add(CreateMap("id":2, "value":"The Godfather", "year":1972, "votes":511495, "rating":9.2, "rank":2))
	data.Add(CreateMap("id":3, "value":"The Godfather: Part II", "year":1974, "votes":319352, "rating":9.0, "rank":3))
	data.Add(CreateMap("id":4, "value":"The Good, the Bad And the Ugly", "year":1966, "votes":213030, "rating":8.9, "rank":4))
	data.Add(CreateMap("id":5, "value":"Pulp fiction", "year":1994, "votes":533848, "rating":8.9, "rank":5))
	data.Add(CreateMap("id":6, "value":"12 Angry Men", "year":1957, "votes":164558, "rating":8.9, "rank":6))
	
	'
	prop.AddItem("","songs","Songs","","","2","",True)
	prop.AddItem("songs", "metallica", "Metallica","","","3","",True)
	prop.AddItem("metallica", "es", "Enter Sandman","","","","",False)
	prop.AddItem("metallica", "rhl", "Ride the Lighning","","","","",False)
	prop.AddItem("metallica", "hero", "Hero of the Day","","","","",False)
	'
	prop.AddItem("songs", "billyjoel", "Billy Joel","","","2","",True)
	prop.AddItem("billyjoel", "mo", "Movin' Out","","","","",False)
	prop.AddItem("billyjoel", "pm", "Piano Man","","","","",False)
	'
	pg.AddRows(prop.Item)
	'
	pg.ui
	'
	pg.AddNode("tree", CreateMap("id":7, "value":"Mashy","year":1973))
	pg.AddChildNode("tree","7", CreateMap("id":8,"value":"Ozzie","year":2003))
	pg.Refresh("tree")
	'
	Dim recid As String
	pg.OnItemClick("tree", BANano.CallBack(Me, "tree_itemclick", Array(recid)))
End Sub

Sub tree_itemclick(recid As String)
	recid = pg.CStr(recid)
	'
	pg.Message(recid)	
End Sub