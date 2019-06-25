B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Process_Globals
	Private pg As WixPage
	Public myList As WixList
	Public myForm As WixForm
	Public BANano As BANano
End Sub

Sub Init()
	pg.Initialize("mashy")
	pg.Page.SetType("line")
	'*** define row 1
	'add toolbar
	Dim R1 As WixRow
	R1.Initialize("R1")
	'R1.Template = R1.ID
	
	Dim hdr As WixHeader
	hdr.Initialize("hdr")
	hdr.Header.SetTemplate("My First Webix App")
	hdr.Header.AddToRow(R1)
	
	Dim tblBar As WixToolBar
	tblBar.Initialize("tblBar")
	'
	Dim btnSave As WixButton
	btnSave.Initialize("btnSave").SetLabel("Save").SetTypeForm("").SetWidth(70).SetClick(BANano.CallBack(Me,"save_row",Null)).AddToToolbar(tblBar) 
	'
	Dim btnDelete As WixButton
	btnDelete.Initialize("btnDelete").SetTypeDanger("").SetLabel("Delete").SetWidth(70).SetClick(BANano.CallBack(Me,"delete_row",Null)).AddToToolbar(tblBar)
	'
	Dim btnClear As WixButton
	btnClear.Initialize("btnClear").SetLabel("Clear").SetWidth(100).SetClick(BANano.CallBack(Me,"clear_form",Null)).AddToToolbar(tblBar)
	'
	Dim btnForms As WixButton
	btnForms.Initialize("btnForms").SetLabel("Forms 1").SetWidth(100).SetClick(BANano.CallBack(Me,"webxix_forms",Null)).AddToToolbar(tblBar)
	'
	Dim btnForm1 As WixButton
	btnForm1.Initialize("btnForms1").SetLabel("Forms 2").SetWidth(100).SetClick(BANano.CallBack(Me,"webxix_forms1",Null)).AddToToolbar(tblBar)
	'
	Dim btnDT As WixButton
	btnDT.Initialize("btnDT").SetLabel("DataTable").SetWidth(100).SetClick(BANano.CallBack(Me,"webxix_datatable",Null)).AddToToolbar(tblBar)
	'
	tblBar.AddSpacer
	'
	Dim btnDown As WixIcon
	btnDown.Initialize("btnDown").SetIcon("wxi-angle-down").AddToToolbar(tblBar)
	 
	Dim btnUp As WixIcon
	btnUp.Initialize("btnUp").SetIcon("wxi-angle-up").AddToToolbar(tblBar)
'	
'	Dim prev As WixButton
'	prev.Initialize("btnPrev").IsPrev("").AddToToolbar(tblBar)
'	'
'	Dim bNext As WixButton
'	bNext.Initialize("btnNext").IsNext("").AddToToolbar(tblBar) 
	'
	tblBar.Toolbar.AddToRow(R1)
	'add rows to the page
	R1.AddToPage(pg)
	
	Dim R2 As WixRow
	R2.Initialize("R2")
	
	Dim R2C1 As WixColumn
	R2C1.Initialize("R2C1")
	'R2C1.Template = R2C1.ID
	
	'add form
	myForm.Initialize("myform").SetWidth(500)
	'
	Dim title As WixTextBox
	title.Initialize("title").SetLabel("Title").AddToForm(myForm)
	'
	Dim year As WixTextBox
	year.Initialize("year").SetLabel("Year").AddToForm(myForm)
	'
	myForm.AddToColumn(R2C1)
	'
	R2C1.AddToRow(R2)
	'
	Dim R2C2 As WixColumn
	R2C2.Initialize("R2C2")
	'R2C2.Template = R2C2.id
	'add a list
	
	Dim filmset As List
	filmset.Initialize
	filmset.Add(CreateMap("id":1, "title":"The Shawshank Redemption", "year":1994))
	filmset.Add(CreateMap("id":2, "title":"The Godfather", "year":1972))
	filmset.Add(CreateMap("id":3, "title":"The Godfather: Part II", "year":1974))
	filmset.Add(CreateMap("id":4, "title":"The Good, the Bad and the Ugly", "year":1966))
	filmset.Add(CreateMap("id":5, "title":"My Fair Lady", "year":1964))
	filmset.Add(CreateMap("id":6, "title":"12 Angry Men", "year":1957))
	
			
	Dim recID As String
	myList.Initialize("myList").SetTemplate("#title# - #year#").SetSelect(True).SetHeight(400).SetData(filmset).AddToColumn(R2C2)
	'
	R2C2.AddToRow(R2)
	'
	R2.AddToPage(pg)
	'
	pg.UI
	'attach the select event
	pg.OnAfterSelect("myList", BANano.CallBack(Me,"record_selected",Array(recID)))

End Sub

'show datatable
Sub webxix_datatable()
	pgDataTable.init
End Sub

'show forms
Sub webxix_forms()
	pgForms.Init
End Sub

'show forms 2
Sub webxix_forms1()
	pgForms1.Init
End Sub

'a row is selected from the list
Sub record_selected(id As String)
	'get the record from the list
	Dim record As Map = pg.GetItem("myList", id)
	'assign record to the form
	pg.SetValues("myform", record)
	pg.Message(BANano.ToJson(record))
End Sub

'the toolbar save button is clicked
Sub save_row(e As BANanoEvent)
	'get values from the form
	Dim values As Map = pg.GetValues("myform")
	'read the id for the record
	Dim recID As String = values.GetDefault("id","")
	If recID = "" Then
		'add to the list
		pg.Add("myList", values)
	Else
		'update the list
		pg.UpdateItem("myList", recID, values)
	End If
End Sub

'the toolbar delete button is clicked
Sub delete_row(e As BANanoEvent)
	'get the selected iten
	Dim recID As String = pg.GetSelectedID("myList")
	If recID = "" Then Return
	'remove item from list
	pg.Remove("myList",recID)
	'clear the form
	pg.Clear("myform")
End Sub

'the toolbar clear button is clicked
Sub clear_form
	'clear the form contents
	pg.Clear("myform")
End Sub