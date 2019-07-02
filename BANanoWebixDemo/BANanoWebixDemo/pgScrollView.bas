B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.51
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private pg As WixPage
End Sub

Sub Init(pgContainer As String)
	pg.Initialize("", pgContainer).SetHeader("Lesson 24: ScrollView")
	'
	Dim sv As WixScrollView
	sv.Initialize("sv").Setscroll("xy").Setheight(200).Setwidth(200).SetStyle("border", "2px solid #ff0000")
	'
	Dim r1 As WixRow
	r1.Initialize("r1").Setwidth(500).Setheight(26).SetTemplate("2001: A Space Odyssey")
	'
	Dim r2 As WixRow
	r2.Initialize("r2").Setwidth(500).Setheight(26).Settemplate("Rambo: First Blood Part II")
	'
	Dim r3 As WixRow
	r3.Initialize("r3").SetMap(CreateMap("width" : 500, "height" : 26, "template" : "Doctor Strangelove or: How I Learned To Stop Worrying And Love The Bomb"))
	'
	Dim r4 As WixRow
	r4.Initialize("r4").SetMap(CreateMap("width" : 500, "height" : 26, "template" : "The Godfather"))
	'
	Dim r5 As WixRow
	r5.Initialize("r5").SetMap(CreateMap("width" : 500, "height" : 26, "template" : "Thor: The Dark World"))
	'
	Dim r6 As WixRow
	r6.Initialize("r6").SetMap(CreateMap("width" : 500, "height" : 26, "template" : "Guardians Of The Galaxy"))
	'
	Dim r7 As WixRow
	r7.Initialize("r7").SetMap(CreateMap("width" : 500, "height" : 26, "template" : "Die Hard"))
	'
	Dim r8 As WixRow
	r8.Initialize("r8").SetMap(CreateMap("width" : 500, "height" : 26, "template" : "Star Wars"))
	'
	Dim r9 As WixRow
	r9.Initialize("r9").SetMap(CreateMap("width" : 500, "height" : 26, "template" : "Real Genius"))
	'
	sv.AddWixRows(Array(r1, r2, r3, r4, r5, r6, r7, r8, r9))
	'
	Dim pr1 As WixRow
	pr1.Initialize("pr1").AddRows(sv.Item) 
	'
	pg.AddRow(pr1)
	'
	pg.ui
End Sub
