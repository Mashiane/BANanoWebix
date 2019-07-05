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

Sub Init(pgContainer As String)
	'initialize the page
	pg.Initialize("wp", pgContainer).SetHeader("Lesson 6.4: Form Data Validation").SetResponsive("master")
	'
	Dim form1 As WixForm
	'initialize form and make it accept names with dots (.)
	form1.Initialize("form1").SetComplexData(True).SetScroll(False)
	form1.SetWidth(350).SetMargin(3)
	'set default settings
	form1.Form.SetDefaultLabelPosition("top")   'labels on top
	form1.Form.SetDefaultLabelWidth(140)        'fix label width
	form1.Form.SetDefaultBottomPadding(18)      'padding at bottom for msg
	'
	form1.Form.CreateTextBox("").SetLabel("Username").SetRequired(True).SetBottomLabel("* spaces are allowed").SetName("user.name").SetPlaceHolder("e.g. John Smith)").SetValidateIsNotEmpty(True).SetInvalidMessage("Login cannot be empty").AddToRows(form1.Form)
	form1.Form.CreateTextBox("").SetLabel("Email address").SetRequired(True).SetName("user.email").SetPlaceHolder("(e.g. john@some.com)").SetValidateIsEmail(True).SetInvalidMessage("Incorrect email address").AddToRows(form1.Form)
	form1.Form.CreateTextBox("").SetLabel("Password").SetTypePassword("").SetRequired(True).SetName("user.password").SetBottomLabel("* The password must have at least 6 characters").SetValidateIsNotEmpty(True).SetInvalidMessage("Password cannot be empty").AddToRows(form1.Form)
	form1.Form.CreateTextBox("").SetLabel("OTP").SetRequired(True).SetName("user.otp").SetValidateIsNumber(True).SetInvalidMessage("OTP should be a number").AddToRows(form1.Form)
	form1.Form.CreateCheckBox("").SetLabelRight("I accept terms of use").SetName("user.accept").SetValidateIsChecked(True).SetInvalidMessage("Must be checked").AddToRows(form1.Form)
	'
	Dim cb As BANanoObject = BANano.CallBack(Me, "form_validate", Null)
	form1.Form.CreateButton("").SetValue("Submit").SetAlignCenter("").SetWidth(150).SetClick(cb).AddToRows(form1.Form)
	'
	pg.AddRows(form1.Item)
	'
	pg.ui
End Sub

Sub form_validate()
	Dim bv As Boolean = pg.Validate("form1")
	If bv Then
		pg.Message_Success("Perfect!")
		Dim fd As Map = pg.GetValues("form1")
		Log(BANano.ToJson(fd))
	Else
		pg.Message_Error("Invalid form!")
	End If
End Sub