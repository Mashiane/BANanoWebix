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
	pg.Initialize("wp", pgContainer).SetResponsive("master").SetHeader("Lesson 27 FlexLayout").SetTypeSpace("")
	'
	Dim fl As WixFlexLayout
	fl.Initialize("").SetPadding(0).SetMargin(10).SetTypeWide("")	
	'
	Dim mlist As WixList
	mlist.Initialize("").SetMinWidth(250).SetSelect(True)
	mlist.AddItem("", "Albert Brown").AddItem("", "Mono Delorini").AddItem("", "Sergey Bobrovski")
	'
	fl.AddColumns(mlist.Item)
	'
	Dim mlist1 As WixList
	mlist1.Initialize("").SetMinWidth(250).SetSelect(True)
	mlist1.AddItem("", "Accounts").AddItem("", "History").AddItem("", "Settings")
	'
	fl.AddColumns(mlist1.Item)
	'
	Dim cont As WixElement
	cont.Initialize("").SetMinWidth(350).SetMinHeight(200).SetTemplate("Try to resize screen, or open this sample on a mobile device")
	'
	fl.AddColumns(cont.Item)
	'
	Dim cont1 As WixElement
	cont1.Initialize("").SetMinWidth(350).SetMinHeight(200).SetTemplate("Column 3")
	'
	fl.AddColumns(cont1.item)
	'
	Dim r1 As WixRow
	r1.Initialize("r1")
	r1.AddRows(fl.Item)
	'
	pg.AddRow(r1)
	'
	pg.UI
End Sub