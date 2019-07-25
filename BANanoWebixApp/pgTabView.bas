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
	Private BANano As BANano
End Sub

#if javascript
	function getFilms() {
		return big_film_set;
	}
#End If

Sub Init(pgContainer As String)
	pg.Initialize("wp", pgContainer).SetHeader("Lesson 4.5: TabView (pgTabView)").SetResponsive("master").SetTypeClean("")
	'
	Dim tv As WixTabView
	tv.Initialize("tv")
	'
	Dim i1 As WixTabItem
	i1.Initialize("i1").SetClose(True).SetTitle("Movies").SetIcon("mdi mdi-cordova")
	i1.Body.SetTemplate("Movies to watch")
	 
	Dim i2 As WixTabItem
	i2.Initialize("i2").SetClose(True).SetTitle("Recipes").SetIcon("mdi mdi-hubspot")
	i2.Body.SetTemplate("Recipes to cook")
	
	Dim i3 As WixTabItem
	i3.Initialize("i3").SetClose(True).SetTitle("Books").SetIcon("mdi mdi-book-open-outline")
	i3.Body.SetTemplate("Books to read")
	'
	tv.AddItem(i1)
	tv.AddItem(i2)
	tv.AddItem(i3)
	'
	pg.AddRows(tv.Item) 	
	'
	pg.ui
End Sub
