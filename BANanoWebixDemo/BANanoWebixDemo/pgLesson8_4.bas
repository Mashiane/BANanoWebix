B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.51
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private pg As WixPage
	Private BANano As BANano
End Sub

#if javascript
	function getFilms(){
		return films;
	}
#End If

#if css
	.highlight{
		background-color:#FFAAAA;
	}
	
	.noPadding .webix_cell{
		padding: 0px;
		line-height:100%;
	}
#End If

Sub Init(pgContainer As String)
	'initialize the page and set the container to hold the widgets
	'add a header and set its label
	pg.Initialize("wp", pgContainer).SetHeader("Lesson 8.4 Editable Datatable (Use Tab)").SetResponsive("master")
	pg.SetLocale("ru-RU")
	'
	'create the list of years
	Dim years As List
	years.Initialize
	For i = 1970 To 2015
		years.Add(CreateMap("id":i, "value":i))
	Next
	
	'create the data-table
	Dim dt As WixDataTable
	dt.Initialize("grida").SetEditable(True).SetLeftSplit(2).SetRightSplit(1).SetWidth(850).SetRowHeight(100)
	dt.setcss("webix_header_border").SetSelect("cell")
	'
	'create columns
	dt.CreateColumn("ch1").SetMasterCheckBox(True).SetCheckValue("on").SetUncheckValue("off").SetCheckBox(True).SetWidth(40).AddToColumns(dt.DataTable)
	dt.CreateColumn("ra1").SetHeader(" ").SetcheckValue("on").SetUncheckValue("off").SetRadio(True).SetWidth(40).AddToColumns(dt.DataTable)
	
	Dim ix As UOENowHTML
	ix.Initialize("","img").SetSRC("./assets/#id#.jpg",True).SetImportant(False)
	Dim img As String = ix.html
	'
	dt.CreateColumn("").SetHeader("Shot").SetTemplate(img).SetWidth(100).SetCSS("noPadding").AddToColumns(dt.DataTable)
	dt.CreateColumn("rank").SetHeader("#").SetWidth(50).AddToColumns(dt.DataTable)
	'
	Dim lnk As UOENowHTML
	lnk.Initialize("","a").SetHREF("//google.com?q=#title#").AddContent("#title#")
	Dim l As String = lnk.HTML
	dt.CreateColumn("title").SetTextFilter(True).SetSortString(True).SetAdjustHeader(True).SetTemplate(l).SetHeader("Film Title").SetEditorText("").SetWidth(200).AddToColumns(dt.DataTable)
	'
	dt.CreateColumn("year").SetSelectFilter(True).SetSortInt(True).SetAdjustData(True).SetEditorCombo("").SetHeader("Released").SetWidth(160).SetOptions(years).AddToColumns(dt.DataTable)
	'
	Dim obj As Map
	Dim tmp As BANanoObject = BANano.CallBack(Me,"DoVotes", Array(obj))
	dt.CreateColumn("votes").SetEditorText("").SetNumberFormat("1,111").SetTemplate(tmp).SetHeader("Votes").SetWidth(100).AddToColumns(dt.DataTable)
	'
	Dim df As Object = pg.LocateDateFormat
	dt.CreateColumn("start").SetEditorDate("").SetHeader("Start").SetWidth(100).SetFormat(df).AddToColumns(dt.DataTable)
	Dim ct As UOENowHTML
	ct.Initialize("","span").SetImportant(False).SetStyle("background-color","#value#").SetStyle("border-radius", "4px").SetStyle("padding-right","10px").AddContent("&nbsp&nbsp").AddContentAfter("#value#")
	Dim cts As String = ct.html
	dt.CreateColumn("color").SetEditorColor("").SetHeader("Color").SetWidth(100).SetTemplate(cts).AddToColumns(dt.DataTable)
	dt.CreateColumn("rating").SetEditorPopUp("").SetNumberFormat("1.111,0").SetHeader("Rating").SetWidth(100).AddToColumns(dt.DataTable)
	'
	'get the records from JSON array
	Dim films As List = BANano.RunJavascriptMethod("getFilms", Null)
	'set data to the grid
	dt.SetData(films)
	'
	'add row to page
	pg.AddRows(dt.item)
	'
	'build the user interface
	pg.ui
	'
	'on item click
	Dim arguements As Object
	pg.OnItemClick("grida", BANano.CallBack(Me, "grida_itemclick", Array(arguements)))
	pg.OnAfterSelect("grida", BANano.CallBack(Me, "grida_afterselect", Array(arguements)))
	pg.OnAfterEditStart("grida", BANano.CallBack(Me, "grida_editstart", Array(arguements)))
	pg.OnAfterEditStop("grida", BANano.CallBack(Me, "grida_editstop", Array(arguements)))
End Sub

Sub grida_editstop(args As Object)
	Log("editstop")
	Log(args)
End Sub


Sub grida_editstart(args As Object)
	Log("editstart")
	Log(args)
End Sub


Sub grida_itemclick(args As Object)
	Log("itemclick")
	Log(args)
End Sub

Sub grida_afterselect(args As Object)
	Log("afterselect")
	Log(args)
End Sub



Sub DoVotes(obj As Map) As Object
	'read the votes
	Dim v As Int = obj.Get("votes")
	
	Dim green As UOENowHTML
	green.Initialize("","span").SetStyle("color","green").AddContent(v)
	Dim g As String = green.HTML
	'
	Dim red As UOENowHTML
	red.Initialize("","span").SetStyle("color","red").AddContent(v)
	Dim r As String = red.HTML
	
	If v > 500 Then
		Return g
	Else
		Return r
	End If
End Sub