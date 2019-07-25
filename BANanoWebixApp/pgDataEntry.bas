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
End Sub

Sub Init(pgContainer As String)
	'initialize the page
	pg.Initialize("wp", pgContainer).SetHeader("Lesson 6: Form Data Entry (pgDataEntry)").SetResponsive("master")
	
	'create a dummy data source
	Dim dataObj As List
	dataObj.Initialize
	dataObj.Add(CreateMap("id" : "1", "value" : "Dream Theater"))
	dataObj.Add(CreateMap("id" : "2", "value" : "Kamelot"))
	dataObj.Add(CreateMap("id" : "3", "value" : "Circus Maximus"))
	
	'create a form
	Dim form1 As WixForm
	form1.Initialize("form1").SetScrollY(True).SetScrollX(True)
	'set border of the form
	'form1.Form.SetStyle("border", "2px solid #000000")
	'set margins of the form
	'form1.Form.SetStyle("margin", "10px")
	'set default configuration, all label widthds should be 120px
	form1.Form.SetDefaultLabelWidth(120)
	'define columns
	Dim C1 As WixColumn
	C1.Initialize("C1").SetWidth(420)
	'add elements to column
	Dim e1 As WixButton
	e1.Initialize("").SetLabel("Button").SetTooltip("This is my tooltip!")
	'add element to the rows collection of the column
	C1.AddRows(e1.Item)
	'
	Dim e2 As WixCheckBox
	e2.Initialize("chk").SetLabel("CheckBox") 
	C1.AddRows(e2.Item)
	pg.SetHint("chk","Check this to agree")
	'
	Dim e3 As WixColorPicker
	e3.Initialize("").SetLabel("ColorPicker")
	C1.AddRows(e3.Item)
	'
	Dim e4 As WixCombo
	e4.Initialize("").SetLabel("Combo").SetValue(2)
	e4.SetOptions(dataObj).SetRequired(True)
	C1.AddRows(e4.Item)
	'
	Dim e5 As WixCounter
	e5.Initialize("cnt").SetLabel("Counter")
	C1.AddRows(e5.Item)
	'
	Dim e6 As WixDatePicker
	e6.Initialize("").SetLabel("Date Time Picker").SetEditable(True).SetTimePicker(True).SetFormat("%d %M %Y at %H:%i")
	C1.AddRows(e6.Item)
	'
	Dim e22 As WixText
	e22.Initialize("pwd").SetTypePassword("").SetLabel("Password").SetValue("Password...").SetLabelPosition("top")
	C1.AddRows(e22.Item)
	pg.SetHint("pwd","Enter your password here...") 
	'
	Dim e7 As WixLabel
	e7.Initialize("").SetLabel("This is a label, and below is an icon")
	C1.AddRows(e7.Item)
	'
	Dim e8 As WixIcon
	e8.Initialize("").SetAlignCenter("").SetIcon("wxi-file")
	C1.AddRows(e8.Item)
	
	Dim st As WixSwitch
	st.Initialize("st").SetLabel("Switch")
	C1.AddRows(st.Item) 
	'
	Dim e20 As WixDBLList
	e20.Initialize("").SetHeight(200).SetValue("1,3").SetStyle("margin-top", "10px!important").SetData(dataObj)
	C1.AddRows(e20.Item)
	'
	Dim e21 As WixFieldSet
	e21.Initialize("").SetLabel("Field-Set")
	C1.AddRows(e21.Item)
	 
	'add column to the form
	form1.AddColumn(C1)
	'
	form1.AddColumnsSpacer("")  'C2
	'
	'define another column
	Dim C3 As WixColumn
	C3.Initialize("C3").SetWidth(520)
	'
	Dim e9 As WixRadio
	e9.Initialize("").SetLabel("Radio").SetValue(1).SetOptions(dataObj) 
	C3.AddRows(e9.Item)
	'
	Dim e10 As WixSegmented
	e10.Initialize("").SetLabel("Segmented").SetValue(3).SetOptions(dataObj)
	C3.AddRows(e10.Item)
	'
	Dim e11 As WixText
	e11.Initialize("myText").SetLabel("Text").SetLabelAlign("right") 
	C3.AddRows(e11.Item)
	'
	Dim e14 As WixRichSelect
	e14.Initialize("").SetLabel("Rich Select").SetValue(2).SetOptions(dataObj) 
	C3.AddRows(e14.Item)
	'
	Dim e15 As WixSelect
	e15.Initialize("").SetLabel("Select").SetValue(1).SetOptions(dataObj) 
	C3.AddRows(e15.Item)
	'
	Dim e17 As WixSearch
	e17.Initialize("").SetLabel("Search")
	C3.AddRows(e17.Item) 
	'
	Dim e18 As WixSlider
	e18.Initialize("").SetLabel("Slider").SetMoveTitle(True)
	C3.AddRows(e18.Item)
	'
	Dim e19 As WixRichText
	e19.Initialize("").SetLabel("Rich Text").Setheight(150)
	C3.AddRows(e19.Item)  
	'
	Dim e12 As WixTextArea
	e12.Initialize("").SetLabel("Text Area").SetHeight(220) 
	C3.AddRows(e12.Item)
	'
	Dim e13 As WixToggle
	e13.Initialize("").SetOnLabel("Toggle ON").SetOffLabel("Toggle OFF").SetWidth(100).SetAlignRight("")
	C3.AddRows(e13.item)
	'
	form1.AddColumn(C3)
	'
	'add a spacer color
	form1.AddColumnsSpacer("")  'C2
	
	'create a form
'	Dim C2 As WixForm
'	C2.Initialize("dataform").SetWidth(600)
'	C2.Form.SetDefaultLabelWidth(120)
'	Dim C2C1 As WixColumn
'	C2C1.Initialize("C2C1").SetWidth(550)
'	'
'	Dim manID As WixText
'	manID.Initialize("manID").SetLabel("Manager ID").SetWidth(300)
'	C2C1.AddRows(manID.Item)
'	
'	'
'	Dim datal As List
'	datal.Initialize
'	datal.Add(CreateMap("name" : "Jack", "position" : "Dillon", "phone" : "111-222-3333"))
'	datal.Add(CreateMap("name" : "Susan", "position" : "Everest", "phone" : "444-555-6666"))
'	datal.Add(CreateMap("name" : "Charlie", "position" : "Jackson", "phone" : "777-888-9999"))
'	'
'	Dim dt As WixDataTable
'	dt.Initialize("").SetHeight(200)
'	'add the headers we wont use auto config
'	dt.AddHeader("name", "Employee Name",0).AddHeader("position", "Position",0).AddHeader("phone", "Phone #",1)
'	'set data
'	dt.SetData(datal).SetAutoConfig(True)
'	'
'	Dim fi As WixFormInput
'	fi.Initialize("").SetLabel("Employees Grid").SetBody(dt.item)
'	C2C1.AddRows(fi.Item)
'	'
'	Dim btnS As WixButton
'	btnS.Initialize("btnS").SetValue("Save").SetInputWidth(200).SetAlignRight("")
'	C2C1.AddRows(btnS.Item)
'	'
'	C2.AddColumn(C2C1)
'	form1.AddColumns(C2.Item)
'	
	 	
	'add form to the rows collection
	pg.AddRows(form1.Item)	
	'draw the user interface
	pg.ui
	pg.Disable("cnt") 
End Sub
