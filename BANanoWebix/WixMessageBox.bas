B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public MessageBox As WixElement
	Public ID As String
	Private buttons As List
End Sub

'Initializes the msg box
Public Sub Initialize(sid As String) As WixMessageBox
	ID = sid.ToLowerCase
	MessageBox.Initialize(ID)
	buttons.Initialize 
	Return Me 
End Sub

'set title
Sub SetTitle(t As Object) As WixMessageBox
	MessageBox.SetAttr("title", t)
	Return Me
End Sub


Sub SetTemplateHTML(h As UOENowHTML) As WixMessageBox
	Dim os As String = h.HTML
	MessageBox.SetTemplate(os)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As WixMessageBox
	MessageBox.SetAttr("text", t)
	Return Me
End Sub

'set ok
Sub SetOK(t As Object) As WixMessageBox
	MessageBox.SetAttr("ok", t)
	Return Me
End Sub

'set cancel
Sub SetCANCEL(t As Object) As WixMessageBox
	MessageBox.SetAttr("cancel", t)
	Return Me
End Sub

'set width
Sub SetWidth(t As Object) As WixMessageBox
	MessageBox.SetAttr("width", t)
	Return Me
End Sub


'set height
Sub SetHeight(t As Object) As WixMessageBox
	MessageBox.SetAttr("height", t)
	Return Me
End Sub


'set container
Sub SetContainer(t As Object) As WixMessageBox
	MessageBox.SetAttr("container", t)
	Return Me
End Sub

'set callback
Sub SetCallBack(t As BANanoObject) As WixMessageBox
	MessageBox.SetAttr("callback", t)
	Return Me
End Sub


'set css
Sub SetCSS(t As Object) As WixMessageBox
	MessageBox.SetAttr("css", t)
	Return Me
End Sub

'item
Sub Item As Map
	If buttons.Size > 0 Then
		MessageBox.SetAttr("buttons", buttons)
	End If
	Return MessageBox.item
End Sub

Sub SetTypeConfirmWarning(b As Boolean) As WixMessageBox   'ignore
	MessageBox.SetType("confirm-warning")
	Return Me
End Sub

Sub SetTypeConfirmError(b As Boolean) As WixMessageBox   'ignore
	MessageBox.SetType("confirm-error")
	Return Me
End Sub

Sub SetTypeAlertError(b As Boolean) As WixMessageBox    'ignore
	MessageBox.SetType("alert-error")
	Return Me
End Sub


Sub SetTypeAlertWarning(b As Boolean) As WixMessageBox   'ignore
	MessageBox.SetType("alert-warning")
	Return Me
End Sub

'add button to modalbox
Sub AddButton(btnText As String) As WixMessageBox
	buttons.Add(btnText)
	Return Me
End Sub