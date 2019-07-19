B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Modal As WixElement
	Private buttons As List
End Sub

Public Sub Initialize(sid As String) As WixModal
	ID = sid.tolowercase
	Modal.Initialize(ID) 
	Return Me
End Sub


'set title
Sub SetTitle(t As Object) As WixModal
	Modal.SetAttr("title", t)
	Return Me
End Sub

'set width
Sub SetContainer(t As Object) As WixModal
	Modal.SetAttr("container", t)
	Return Me
End Sub

Sub Item As Map
	Return Modal.item
End Sub

Sub SetWidth(w As Object) As WixModal
	Modal.SetWidth(w)
	Return Me
End Sub

Sub SetHeight(h As Object) As WixModal
	Modal.SetHeight(h)
	Return Me
End Sub

Sub SetText(t As Object) As WixModal
	Modal.SetAttr("text", t)
	Return Me
End Sub

Sub SetCallBack(cb As BANanoObject) As WixModal
	Modal.SetAttr("callback", cb)
	Return Me
End Sub


Sub SetTypeAlertError(b As Boolean) As WixModal    'ignore
	Modal.SetType("alert-error")
	Return Me
End Sub


Sub SetTypeAlertWarning(b As Boolean) As WixModal   'ignore
	Modal.SetType("alert-warning")
	Return Me
End Sub


Sub SetTypeConfirmWarning(b As Boolean) As WixModal   'ignore
	Modal.SetType("confirm-warning")
	Return Me
End Sub

Sub SetTypeConfirmError(b As Boolean) As WixModal   'ignore
	Modal.SetType("confirm-error")
	Return Me
End Sub

'show the modal box
Sub Show(Page As WixPage)
	Page.ModalBox(Item)
End Sub