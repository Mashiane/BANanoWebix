B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public ModalBox As WixElement
	Private buttons As List
End Sub

Public Sub Initialize(sid As String) As WixModalBox
	ID = sid.tolowercase
	ModalBox.Initialize(ID) 
	Return Me
End Sub


Sub SetTemplateHTML(h As UOENowHTML) As WixModalBox
	Dim os As String = h.HTML
	ModalBox.SetTemplate(os)
	Return Me
End Sub


'set css
Sub SetCSS(t As Object) As WixModalBox
	ModalBox.SetAttr("css", t)
	Return Me
End Sub


Sub SetCSSJSON(json As String) As WixModalBox
	ModalBox.SetCSSJSON(json)
	Return Me
End Sub


'add button to modalbox
Sub AddButton(btnText As String) As WixModalBox
	buttons.Add(btnText)
	Return Me
End Sub


'set title
Sub SetTitle(t As Object) As WixModalBox
	ModalBox.SetAttr("title", t)
	Return Me
End Sub

'set width
Sub SetContainer(t As Object) As WixModalBox
	ModalBox.SetAttr("container", t)
	Return Me
End Sub

Sub Item As Map
	If buttons.Size > 0 Then
		ModalBox.SetAttr("buttons", buttons)
	End If
	Return ModalBox.item
End Sub

Sub SetWidth(w As Object) As WixModalBox
	ModalBox.SetWidth(w)
	Return Me
End Sub

Sub SetHeight(h As Object) As WixModalBox
	ModalBox.SetHeight(h)
	Return Me
End Sub

Sub SetText(t As Object) As WixModalBox
	ModalBox.SetAttr("text", t)
	Return Me
End Sub

Sub SetCallBack(cb As BANanoObject) As WixModalBox
	ModalBox.SetAttr("callback", cb)
	Return Me
End Sub


Sub SetTypeAlertError(b As Boolean) As WixModalBox    'ignore
	ModalBox.SetType("alert-error")
	Return Me
End Sub


Sub SetTypeAlertWarning(b As Boolean) As WixModalBox   'ignore
	ModalBox.SetType("alert-warning")
	Return Me
End Sub


Sub SetTypeConfirmWarning(b As Boolean) As WixModalBox   'ignore
	ModalBox.SetType("confirm-warning")
	Return Me
End Sub

Sub SetTypeConfirmError(b As Boolean) As WixModalBox   'ignore
	ModalBox.SetType("confirm-error")
	Return Me
End Sub

'show the modal box
Sub Show(Page As WixPage)
	Page.ModalBox(Item)
End Sub