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
	Private BANano As BANano 'ignore
End Sub

#if javascript
	function getFilms() {
		return big_film_set;
	}
#End If

Sub Init(pgContainer As String)
	pg.Initialize("wp", pgContainer).SetHeader("Lesson 4.3: MultiView (pgMultiView4)").SetResponsive("master").SetTypeClean("")
	'
	Dim seg As WixTabBar
	seg.Initialize("tabbar").Setvalue("view1").SetMultiview(True).SetTypeBottom(True).SetHeight(50)
	seg.AddOption("listview", "List","mdi mdi-file-video")
	seg.AddOption("formview", "Form","mdi mdi-comment")
	seg.AddOption("aboutview", "About","mdi mdi-help-circle")
	'
	Dim bfl As List = BANano.RunJavascriptMethod("getFilms", Null)
	'
	Dim lv As WixList
	lv.Initialize("listview").SetTemplate("#rank#. #title# <div style='padding-left:18px'> Year:#year#, votes:#votes# </div>")
	lv.SetItemHeight(60).SetSelect(True).SetData(bfl)
	'
	Dim frm As WixForm
	frm.Initialize("formview")
	frm.Form.CreateText("title").SetLabel("Title").SetName("title").AddToRows(frm.Form)
	frm.Form.CreateText("year").SetLabel("Year").SetName("year").AddToRows(frm.Form)
	frm.Form.CreateText("rank").SetLabel("Rank").SetName("rank").AddToRows(frm.Form)
	'
	Dim fr4 As WixRow
	fr4.Initialize("fr4").SetMargin(4)
	fr4.Row.CreateButton("").SetValue("Cancel").SetClick(BANano.CallBack(Me,"cancel_click",Null)).AddToColumns(fr4.Row)
	fr4.Row.CreateButton("").SetCSSPrimary(True).SetValue("Save").SetClick(BANano.CallBack(Me,"save_click",Null)).AddToColumns(fr4.Row)
	'
	frm.Form.AddRows(fr4.Item)
	frm.Form.AddRows(CreateMap())
'
	Dim av As WixElement
	av.Initialize("aboutview").SetTemplate("<i>Select an item in List to edit it in Form</i>").SetPadding(5)
	
	Dim mv As WixMultiView
	mv.Initialize("mv")
	mv.AddItem(lv.Item)
	mv.AddItem(frm.Item)
	mv.AddItem(av.Item)
	'
	pg.AddRows(mv.Item)
	pg.AddRows(seg.item)
	
'
	pg.ui
	'bind form to listview
	pg.BOBind("formview", "listview")
	pg.OnItemClick("listview", BANano.CallBack(Me,"showForm",Null))
	
End Sub

Sub showForm
	pg.Show("formview")
End Sub

Sub cancel_click
	pg.Back("mv")
End Sub

Sub save_click
	pg.Save("formview")
	pg.Back("mv")
End Sub