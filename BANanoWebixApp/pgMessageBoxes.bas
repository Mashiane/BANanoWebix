B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.51
@EndOfDesignText@
'Static code module
#IgnoreWarnings: 12
Sub Process_Globals
	Private fx As JFX
	Private pg As WixPage
	Private BANano As BANano 'ignore
End Sub

Sub Init(pgContainer As String)
	pg.Initialize("wp", pgContainer).SetHeader("Lesson 29: Message Boxes (pgMessageBoxes)").SetResponsive("master")
	'
	Dim form1 As WixForm
	'initialize form and make it accept names with dots (.)
	form1.Initialize("form1").SetScroll(False)
	form1.SetWidth(500).SetMargin(3)
	'
	form1.Form.CreateButton("").SetLabel("Success").SetClick(BANano.CallBack(Me,"success_click", Null)).AddToRows(form1.Form)
	form1.Form.CreateButton("").SetLabel("Error").SetClick(BANano.CallBack(Me,"error_click", Null)).AddToRows(form1.Form)
	form1.Form.CreateButton("").SetLabel("Default").SetClick(BANano.CallBack(Me,"default_click", Null)).AddToRows(form1.Form)
	form1.Form.CreateButton("").SetLabel("Debug").SetClick(BANano.CallBack(Me,"debug_click", Null)).AddToRows(form1.Form)
	form1.Form.CreateButton("").SetLabel("Alert").SetClick(BANano.CallBack(Me,"alert_click", Null)).AddToRows(form1.Form)
	form1.Form.CreateButton("").SetLabel("Confirm").SetClick(BANano.CallBack(Me,"confirm_click", Null)).AddToRows(form1.Form)
	form1.Form.CreateButton("").SetLabel("Confirm Warning").SetClick(BANano.CallBack(Me,"confirmwarning_click", Null)).AddToRows(form1.Form)
	form1.Form.CreateButton("").SetLabel("Alert Error").SetClick(BANano.CallBack(Me,"alerterror_click", Null)).AddToRows(form1.Form)
	form1.Form.CreateButton("").SetLabel("Modal Box").SetClick(BANano.CallBack(Me,"modalbox_click", Null)).AddToRows(form1.Form)
	
	'
	'
	pg.AddRows(form1.Item)
	'
	pg.ui
End Sub

Sub modalbox_click
	Dim result As Object
	Dim cb As BANanoObject = BANano.callback(Me, "modalresult", Array(result))
	'
	Dim mb As WixMessageBox
	mb.Initialize("mb").SetTitle("Custom title").AddButton("Yes").AddButton("No").AddButton("Maybe")
	mb.SetWidth(400).SetText("Any html content here").SetCallBack(cb)
	'
	pg.ModalBox(mb.Item)
End Sub

Sub modalresult(result As Object)
	pg.Message(result)	
End Sub

Sub alerterror_click
	Dim ae As WixMessageBox
	ae.Initialize("ae").SetTypeAlertError(True).SetTitle("Alert Error").SetText("That's It!")
	pg.Alert(ae.Item)
End Sub

Sub confirmwarning_click
	Dim result As Boolean = False
	Dim cb As BANanoObject = BANano.CallBack(Me,"confirmed",Array(result))
	'
	Dim cw As WixMessageBox
	cw.Initialize("cw").SetTypeConfirmWarning(True).SetOK("Warning").SetCANCEL("Stop it!").SetTitle("Confirm Warning").SetText("I dunno!")
	cw.SetCallBack(cb)
	pg.Confirm1(cw.Item)
End Sub


Sub confirm_click
	Dim result As Boolean = False
	Dim cb As BANanoObject = BANano.CallBack(Me,"confirmed",Array(result))
	pg.Confirm(cb, "Confirm", "Can you confirm?")
End Sub

Sub confirmed(result As Boolean)
	pg.Message(result)
End Sub

Sub alert_click
	pg.Alert("Alert!")
End Sub

Sub success_click
	pg.Message_Success("Success!")
End Sub

Sub error_click
	pg.Message_Error("Error!")
End Sub

Sub default_click
	pg.Message("Default")
End Sub

Sub debug_click
	pg.Message_Debug("Debug")
End Sub

