B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.51
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private pg As WixPage
	Public BANano As BANano
End Sub

#if javascript
	function getFilms(){
		return films;
	}
#End If

Sub Init(pgContainer As String)
	pg.Initialize("wp", pgContainer).SetResponsive("master").SetHeader("Lesson 26 Responsiveness (pgResponsive)").SetTypeSpace("")
	
	Dim mlist As WixList
	mlist.Initialize("").SetSelect(True).SetScroll(False).SetMinWidth(150)
	mlist.AddItem("","Users").AddItem("", "Reports").AddItem("", "Settings")
	'
	Dim cont As WixElement
	cont.Initialize("").SetTemplate("Resize the view").SetMinWidth(150)
	'
	Dim dt As WixDataTable
	dt.Initialize("").setminwidth(250)
	dt.CreateColumn("title").SetFillSpace(1).AddToColumns(dt.DataTable)
	dt.CreateColumn("votes").AddToColumns(dt.DataTable)
	'
	Dim films As List = BANano.RunJavascriptMethod("getFilms",Null)
	dt.SetData(films)
	'
	Dim r1 As WixRow
	r1.Initialize("r1")
	r1.AddColumns(mlist.Item)
	r1.AddColumns(cont.Item)
	r1.AddColumns(dt.Item)
	'
	pg.AddRow(r1)
	'
	pg.UI
End Sub