B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Process_Globals
	Private pg As WixPage
	Public myForm As WixForm
	Public BANano As BANano  ' ignore
End Sub

Sub Init(pgContainer As String)
	pg.Initialize("wp", pgContainer).SetResponsive("master")
	'
	Dim R1 As WixRow
	R1.Initialize("R1")
	'
	Dim hdr As WixHeader
	hdr.Initialize("hdr")
	hdr.Header.SetTemplate("Webix Forms: 1")
	R1.AddItem(hdr.Item)
	'
	'Dim btnB As WixButton
	'btnB.Initialize("btnB").SetLabel("Back").SetClick(BANano.CallBack(Me,"backtomain",Null))
	'R1.AddItem(btnB.Item)
	'	
	Dim fruit As List
	fruit.Initialize
	fruit.Add(CreateMap("id":1, "value": "Apple"))
	fruit.Add(CreateMap("id":2, "value": "Banana"))
	fruit.Add(CreateMap("id":3, "value": "Kiwi"))
	fruit.Add(CreateMap("id":4, "value": "Pineapple"))
	fruit.Add(CreateMap("id":5, "value": "Grapes"))

	'add form
	myForm.Initialize("mashform").SetWidth(500)
	'
	'combo
	Dim cbo As WixCombo
	cbo.Initialize("cbo").SetLabel("Combo").SetValue(3).SetOptions(fruit).SetTemplate("Fresh #value#").SetYCount(2).SetLabelAlign("right")
	myForm.Form.AddItem(cbo.Item)
	
	'
	Dim txtBox As WixText
	txtBox.Initialize("txtBox").SetLabel("Text Box").SetPlaceHolder("Text Box").SetLabelPosition("top")
	myForm.Form.AddItem(txtBox.Item)
	'
	Dim pwd As WixText
	pwd.Initialize("pwd").SetTypePassword("").SetLabel("Password").SetPlaceHolder("Password").SetMaxLength(10)
	myForm.Form.AddItem(pwd.Item)
		
	'text area
	Dim txta As WixTextArea
	txta.Initialize("ta").SetLabel("Text Area").SetPlaceHolder("Text Area")
	myForm.Form.AddItem(txta.item)
	'checkbox
	Dim cb As WixCheckBox
	cb.Initialize("cb").SetLabel("Checkbox").SetValue(True).SetLabelRight(True) 
	myForm.Form.AddItem(cb.item)
	'
	Dim cb1 As WixCheckBox
	cb1.Initialize("cb1").SetLabel("Checkbox Before")
	myForm.Form.AddItem(cb1.item)
	
	'toggle
	'Dim tgl As WixToggle
	'tgl.Initialize("tgl").SetLabel("Toggle").SetOnLabel("I'm pressed!").SetOffLabel("Press Me!")
	'myForm.Form.AddItem(tgl.Item)
	'radio
	Dim ro As WixRadio
	ro.Initialize("ro").SetLabel("Radio").SetOptions(fruit).SetValue(2).SetVertical(False)
	myForm.Form.AddItem(ro.Item)
	'vertical radio
	Dim ro1 As WixRadio
	ro1.Initialize("ro1").SetLabel("Vertical Radio").SetOptions(fruit).SetValue(2).SetVertical(True)
	myForm.Form.AddItem(ro1.Item)
	
	
	'rich select
	'Dim rs As WixRichSelect
	'rs.Initialize("rs","Rich Select")
	'rs.Options = fruit
	'rs.Text = "Kiwi"
	'myForm.Form.AddItem(rs.Item)
	'counter
	Dim stepon As WixCounter
	stepon.Initialize("stepon").SetLabel("Counter").SetMin(0).SetMax(100).SetValue(12).SetStep(2)
	myForm.Form.AddItem(stepon.Item)
	
	
	R1.AddItem(myForm.Item)
	pg.AddRow(R1)
	
	pg.UI
	'attach combo event
	Dim n, o As String
	Dim cbe As BANanoObject = BANano.CallBack(Me,"cbo_change",Array(n,o))
	pg.OnChange("cbo", cbe)
	
End Sub

Sub cbo_change(newV As String, oldV As String)
	pg.Message($"Combo changed from ${oldV} to ${newV}"$)
End Sub
