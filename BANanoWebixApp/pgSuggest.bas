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
	pg.Initialize("wp", pgContainer).SetResponsive("master").SetHeader("Lesson 28 Suggest (pgSuggest)").SetTypeSpace("")
	'
	Dim sugg As WixSuggest
	sugg.Initialize("suggest1") 
	sugg.AddItem(1, "Apple")
	sugg.AddItem(2, "Banana")
	sugg.AddItem(3, "Kiwi")
	sugg.AddItem(4, "Melon")
	'add to page
	pg.AddSuggestion(sugg)
	'
	'create a toolbar
	Dim t As WixToolBar
	t.Initialize("")
	'
	Dim rs As WixRichSelect
	rs.Initialize("").SetSuggest("suggest1")
	'add to toolbar
	t.AddElements(rs.item)
	' 
	'add toolbar to page
	pg.AddRows(t.Item)
	
	'create a form
	Dim form1 As WixForm
	form1.Initialize("form1").SetWidth(300).SetScroll(False)
	'create a textbox
	Dim txt As WixText = form1.Form.CreateTextBox("").SetName("country").SetLabel("Country").SetValue("Belarus").SetSuggest("suggest1")
	'create a callback
	Dim cb As BANanoObject = BANano.CallBack(Me, "clickit", Null)
	'create a button
	Dim btn As WixButton = form1.Form.CreateButton("").SetValue("Submit data").SetClick(cb)
	'
	'add elements to form rows
	form1.AddRows(txt.Item)
	form1.AddRows(btn.Item)
	'add form to page
	pg.AddRows(form1.Item)
	'
	pg.ui
	'add to page
End Sub

Sub clickit
	'get the form data
	Dim formd As Map = pg.GetValues("form1")
	'display it
	pg.Message(BANano.ToJson(formd))
End Sub