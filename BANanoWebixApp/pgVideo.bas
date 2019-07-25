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
	pg.Initialize("wp", pgContainer).SetHeader("Lesson 23: WixVideo (pgVideo)").SetResponsive("master")
	'
	Dim R1 As WixRow
	R1.Initialize("R1")
	'
	Dim vid As WixVideo
	vid.Initialize("vid").SetWidth(640).SetBorderLess(False).SetStyle("margin", "10px")
	vid.SetSRC("./assets/movie.mp4").SetSRC("./assets/movie.ogv").SetAutoPlay(True)
	
	R1.AddRows(vid.Item)
	'
	pg.AddRow(R1)
	
	pg.ui
End Sub