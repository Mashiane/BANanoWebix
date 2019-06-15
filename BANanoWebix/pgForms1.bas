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
	Public myForm As WixForm
	Public BANano As BANano  ' ignore
End Sub

Sub Init()
	pg.Initialize("forms1")
	'
	Dim R1 As WixRow
	R1.Initialize("R1")
	'
	Dim hdr As WixHeader
	hdr.Initialize("hdr").SetTemplate("Webix Form 2")
	R1.AddItem(hdr.Item)
	'
	Dim tblBar As WixToolBar
	tblBar.Initialize("tblBar")
	'
	Dim btnBack As WixButton
	btnBack.Initialize("btnBack").SetLabel("Back").SetWidth(100).SetClick(BANano.CallBack(Me,"backtomain",Null))
	tblBar.AddItem(btnBack.Item)
	'
	Dim btnImage As WixButton
	btnImage.Initialize("btnImage").SetLabel("Image").IsImage("").SetWidth(150).SetHeight(40).SetImage("./assets/icons8-save-as-100.png")
	tblBar.AddItem(btnImage.Item)
	'
	Dim btnImage1 As WixButton
	btnImage1.Initialize("btnImageButton").SetLabel("ImageButton").IsImageButton("").SetImage("./assets/icons8-compose-40.png").SetWidth(40).SetHeight(40)
	tblBar.AddItem(btnImage1.Item)
	'
	Dim btnIcon As WixButton
	btnIcon.Initialize("btnIcon").IsIcon("").SetIcon("wxi-file").SetWidth(200).SetLabel("File Name")
	tblBar.AddItem(btnIcon.Item)
	'
	Dim btnIBT As WixButton
	btnIBT.Initialize("btnIBT").SetWidth(100).SetHeight(80).SetIcon("wxi-download").IsIconButtonTop("").SetLabel("Hide")
	btnIBT.SetClick( BANano.CallBack(Me, "hideit",Null)  ).AddToToolbar(tblBar)
	'
	Dim btnShow As WixButton
	btnShow.Initialize("btnShow").SetWidth(100).SetHeight(80).SetIcon("wxi-download").IsIconButtonTop("").SetLabel("Show")
	btnShow.SetClick( BANano.CallBack(Me, "showit",Null)  ).AddToToolbar(tblBar)
	'
	tblBar.AddSpacer
	'
	Dim imgt1 As WixToggle
	imgt1.Initialize("imgt1").IsImageButton("").SetImage("./assets/icons8-add-row-40.png").SetLabel("Add Row").SetWidth(150)
	tblBar.AddItem(imgt1.Item)
	
	Dim imgt2 As WixToggle
	imgt2.Initialize("imgt2").IsImage("").SetImage("./assets/icons8-save-close-40.png").SetLabel("Save").SetHeight(50).SetWidth(150).AddToToolbar(tblBar)
	
	Dim imgt3 As WixToggle
	imgt3.Initialize("imgt3").IsIcon("").SetOffIcon("wxi-close").SetOnIcon("wxi-check").SetLabel("Music").SetHeight(60).SetWidth(150).AddToToolbar(tblBar)
	
	Dim imgt4 As WixToggle
	imgt4.Initialize("imgt4").IsIconButtonTop("").SetIcon("wxi-sync").SetLabel("Wi-Fi").SetHeight(60).SetWidth(100).AddToToolbar(tblBar)
	
	
	R1.AddItem(tblBar.Item)
	'
	Dim fruit As List
	fruit.Initialize
	fruit.Add(CreateMap("id":1, "value": "Apple"))
	fruit.Add(CreateMap("id":2, "value": "Banana"))
	fruit.Add(CreateMap("id":3, "value": "Kiwi"))
	fruit.Add(CreateMap("id":4, "value": "Pineapple"))
	fruit.Add(CreateMap("id":5, "value": "Grapes"))
	
	' for suggestions
	Dim countries As List
	countries.Initialize 
	countries.add(CreateMap("id":1, "value": "Albania"))
	countries.Add(CreateMap("id":2, "value": "Bhutan"))
	countries.Add(CreateMap("id":3, "value": "Colombia"))
	countries.Add(CreateMap("id":4, "value": "Denmark"))
	countries.Add(CreateMap("id":5, "value": "Germany"))
	countries.Add(CreateMap("id":6, "value": "Moldova"))
	'
	Dim suggest As WixSuggest
	suggest.Initialize(pg, "countries").SetData(countries)
	suggest.UI
	
	'add form
	myForm.Initialize(pg, "mashform1").SetWidth(500)
	'
	Dim btnB As WixButton
	btnB.Initialize("btnB").SetLabel("Back").SetClick(BANano.CallBack(Me,"backtomain",Null))
	myForm.AddItem(btnB.Item)
	'	
	Dim sect As WixSection
	sect.Initialize("sect").SetTemplate("This is my section")
	myForm.AddItem(sect.Item)
	'
	Dim lbl As WixLabel
	lbl.Initialize("lbl").SetLabel("This is my label")
	myForm.AddItem(lbl.Item)
	'segmented
	Dim seg As WixSegmented
	seg.Initialize("seq").SetOptions(fruit)
	myForm.AddItem(seg.Item)
	'date picker
	Dim dt As WixDateTimePicker
	dt.Initialize("dt").SetLabel("Date Picker").SetTimePicker(True).SetFormat("%d %M %Y at %H:%i").SetLabelWidth(100)
	myForm.AddItem(dt.Item)
	'color picker
	Dim cp As WixColorPicker
	cp.Initialize("cp").SetLabel("Color Picker").SetValue("#0000ff").SetLabelWidth(100)
	myForm.AddItem(cp.Item)
	'
	Dim txtcountries As WixTextBox
	txtcountries.Initialize("txtCountries").SetSuggest("countries").SetLabel("Countries")
	myForm.AddItem(txtcountries.Item)
	
	R1.AddItem(myForm.Item)
	pg.Page.AddRow(R1)
	
	pg.UI
End Sub


Sub showit()
	pg.ShowIt("sect")
End Sub

Sub hideit()
	pg.HideIt("sect")
End Sub

Sub backtomain
	pgIndex.Init
End Sub