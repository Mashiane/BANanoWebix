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
	pg.Initialize("wp", pgContainer).SetHeader("Lesson 18: GroupList").SetResponsive("master")
	'
	Dim gl As WixGroupList
	gl.Initialize("gl").SetScroll(True).SetWidth(300).SetBorderLess(False)
	gl.SetStyle("margin","10px")
	'
	'add items
	gl.AddItem("","movies", "Movies","","","","",True)
	gl.AddItem("movies", "startrek", "Star Trek","","","","",False)
	gl.AddItem("movies", "starwars", "Star Wars","","","","",False)
	'
	gl.AddItem("startrek", "tmp", "The Motion Picture","","","","",False)
	gl.AddItem("startrek", "twk", "The Wrath of Khan","","","","",False)
	gl.AddItem("startrek", "sfs", "The Search for Spock","","","","",False)
	'
	gl.AddItem("starwars", "tnh", "A New Hope","","","","",False)
	gl.AddItem("starwars", "tesb", "The Empire Strikes Back","","","","",False)
	gl.AddItem("starwars", "troj", "Return of the Jedi","","","","",False)
	'
	gl.AddItem("","books", "Books","","","","",True)
	gl.AddItem("books","hp", "Harry Potter","","","","",False)
	'
	gl.AddItem("hp","tss", "The Sorcerer's Stone","","","","",False)
	gl.AddItem("hp","tcos", "The Chamber of Secrets","","","","",False)
	gl.AddItem("hp","tpoa", "The Prisoner of Azkaban","","","","",False)
	'
	gl.AddItem("books","dt", "The Dark Tower","","","","",False)
	gl.AddItem("dt","tg", "The Gunslinger","","","","",False)
	gl.AddItem("dt","tdot", "The Drawing of the Three","","","","",False)
	gl.AddItem("dt","twl", "The Waste Lands","","","","",False)
	'
	Dim items As List = gl.items
	Dim data As List = pg.Unflatten(items, "data")
	gl.SetData(data)
	
	'
	'add group list to the rows collection
	pg.AddRows(gl.Item)
	pg.ui
End Sub

