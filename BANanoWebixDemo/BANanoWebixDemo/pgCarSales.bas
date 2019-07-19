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
	Private dateFormat As Object
	Dim photo As WixImage
End Sub


Sub Init(pgContainer As String)
	'create page
	pg.Initialize("wp", pgContainer).SetResponsive("master")
	'add toolbar
	Dim tblBar As WixToolBar
	tblBar.Initialize("tblBar")
	tblBar.CreateLabel("heading").SetLabel("Lesson 31: WixImage").Pop
	pg.AddRows(tblBar.item)
	
	'
	dateFormat = pg.DateToStr("%d %M %Y")
	'
	Dim frm As WixForm
	frm.Initialize("form").SetPadding(24).SetDefaultLabelAlign("right").SetDefaultLabelWidth(100).SetWidth(400)
	
	photo.Initialize("photo").SetHeight(260).SetBorderLess(True)
	photo.AddToRows(frm.Form)
	
	Dim rs1 As WixRichSelect
	rs1.Initialize("make").SetName("make").SetLabel("Make").SetPlaceHolder("Click to select")
	rs1.SetOptionsMAP(CreateMap("transtar": "Transtar", "kasma": "Kasma", "typhon": "Typhon&Co"))
	rs1.RichSelect.OnChange(BANano.CallBack(Me,"getCar",Null))
	rs1.AddToRows(frm.Form)
	
	Dim rs As WixRichSelect
	rs.Initialize("model").SetName("model").SetLabel("Model").SetPlaceHolder("Click to select")
	rs.SetOptionsMAP(CreateMap("coral": "Coral AF-13B72P", "thalos": "Thalos RD-D7N0H8", "pytheas": "Pytheas RY-1M4L1VE"))
	rs.RichSelect.OnChange(BANano.CallBack(Me,"getCar",Null))
	rs.AddToRows(frm.Form)
	'
	Dim dp As WixDatePicker
	dp.Initialize("produced").SetName("produced").SetLabel("Produced").SetPlaceHolder("Click to select").SetFormat(dateFormat).AddToRows(frm.Form)
	
	Dim cp As WixColorPicker
	cp.Initialize("color").SetName("color").SetLabel("Color").AddToRows(frm.Form)
	
	Dim rd As WixRadio
	rd.Initialize("notifications").SetName("notifications").SetLabel("Notifications").SetValue("Agree").SetOptions(Array("Agree","Disagree")).AddToRows(frm.Form)
	 
	Dim txta As WixTextArea
	txta.Initialize("notes").SetName("notes").SetLabel("Notes").SetPlaceHolder("Type text").AddToRows(frm.Form)
	'
	pg.AddRows(frm.item)
	'
	pg.ui
	'
	Dim vals As Map = CreateMap()
	vals.Put("make", "kasma")
	vals.Put("model", "coral")
	vals.Put("produced", "2056-05-05")
	vals.Put("color", "#DD0000")
	vals.Put("notifications", "Agree")
	pg.SetValues("form", vals)
End Sub	

Sub getCar
	pg.webix.RunMethod("delay",BANano.CallBack(Me,"getCar1",Null))
End Sub

Sub getCar1
	
	Dim fd As Map = pg.GetValues("form")
	Log(fd)
	Dim make As String = fd.Get("make")
	Dim model As String = fd.Get("model")
	Dim val As String = $"${make}_${model}.jpg"$
	photo.SetValue("./assets/" & val).Refresh(pg)
End Sub