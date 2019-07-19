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
End Sub


Sub Init()
	'create page
	pg.Initialize("wp", "body").SetAppName(Main.AppName)
	dateFormat = pg.DateToStr("%d %M %Y")
	'
	Dim tmp As WixHeader
	tmp.Initialize("").Settemplate("Vehicle sale")
	pg.addrows(tmp.Item)
	'
	Dim frm As WixForm
	frm.Initialize("form").SetPadding(24).SetDefaultLabelAlign("right").SetDefaultLabelWidth(100)
	
	Dim photo As WixImage
	photo.Initialize("photo").SetHeight(260).SetBorderLess(True).AddToElements(frm.Form)
	
	Dim rs1 As WixRichSelect
	rs1.Initialize("make").SetLabel("Make").SetPlaceHolder("Click to select")
	rs1.SetOptionsMAP(CreateMap("transtar": "Transtar", "kasma": "Kasma", "typhon": "Typhon&Co")).AddToElements(frm.Form)
	rs1.RichSelect.OnChange(BANano.CallBack(Me,"getCar",Null))
	
	Dim rs As WixRichSelect
	rs.Initialize("model").SetLabel("Model").SetPlaceHolder("Click to select")
	rs.SetOptionsMAP(CreateMap("coral": "Coral AF-13B72P", "thalos": "Thalos RD-D7N0H8", "pytheas": "Pytheas RY-1M4L1VE")).AddToElements(frm.Form)
	rs.RichSelect.OnChange(BANano.CallBack(Me,"getCar",Null))
	'
	Dim dp As WixDatePicker
	dp.Initialize("produced").SetLabel("Produced").SetPlaceHolder("Click to select").SetFormat(dateFormat).AddToElements(frm.Form)
	
	Dim cp As WixColorPicker
	cp.Initialize("color").SetLabel("Color").AddToElements(frm.Form)
	
	Dim rd As WixRadio
	rd.Initialize("notifications").SetLabel("Notifications").SetValue("Agree").SetOptions(Array("Agree","Disagree")).AddToElements(frm.Form)
	 
	Dim txta As WixTextArea
	txta.Initialize("notes").SetLabel("Notes").SetPlaceHolder("Type text").AddToElements(frm.Form)
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
	Dim make As String = pg.GetValue("make")
	Dim model As String = pg.GetValue("model")
	'form.elements["photo"].setValue(make+"_"+model);
End Sub
