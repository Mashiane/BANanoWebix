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

'set padding
Sub SetPadding(padding As Object) As WixMessageBox
	MessageBox.SetPadding(padding)
	Return Me
End Sub

'set padding
Sub SetMargin(margin As Object) As WixMessageBox
	MessageBox.SetMargin(margin)
	Return Me
End Sub

Sub SetAttributes(m As Map) As WixMessageBox
	For Each k As String In m.Keys
		Dim v As String = m.Get(k)
		MessageBox.SetAttr(k,v)
	Next
	Return Me
End Sub

Sub SetStyles(m As Map) As WixMessageBox
	For Each k As String In m.Keys
		Dim v As String = m.Get(k)
		MessageBox.SetStyle(k,v)
	Next
	Return Me
End Sub

'set css
Sub SetStyle(prop As String, sval As String) As WixMessageBox
	MessageBox.SetStyle(prop,sval)
	Return Me
End Sub


'set title
Sub SetTitle(t As Object) As WixMessageBox
	MessageBox.SetAttr("title", t)
	Return Me
End Sub


Sub SetTemplateHTML(h As UOENowHTML) As WixMessageBox
	h.SetImportant(False)
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


Sub SetCSSJSON(json As String) As WixMessageBox
	MessageBox.SetCSSJSON(json)
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


'show the modal box
Sub Show(Page As WixPage)
	Page.ModalBox(Item)
End Sub