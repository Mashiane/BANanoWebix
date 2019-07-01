B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Uploader As WixElement
End Sub

'Initializes the uploader
Public Sub Initialize(sID As String) As WixUploader
	ID = sID.ToLowerCase
	Uploader.Initialize(ID).SetView("uploader")
	Uploader.SetAttr("name", "uploader")
	Return Me
End Sub

Sub SetValue(v As String) As WixUploader
	Uploader.SetValue(v)
	Return Me
End Sub

Sub SetinputName(n As String) As WixUploader
	Uploader.SetAttr("inputName", n)
	Return Me
End Sub

Sub SetApiOnly(b As Boolean) As WixUploader
	Uploader.SetAttr("apiOnly", b)
End Sub

Sub SetMultiple(b As Boolean) As WixUploader
	Uploader.SetAttr("multiple", b)
	Return Me
End Sub

Sub SetAutoSend(b As Boolean) As WixUploader
	Uploader.SetAttr("autosend", b)
	Return Me
End Sub

Sub SetName(n As String) As WixUploader
	Uploader.SetAttr("name", n)
	Return Me
End Sub

Sub SetLink(l As String) As WixUploader
	Uploader.SetAttr("link", l)
	Return Me
End Sub

Sub SetDirectory(b As Boolean) As WixUploader
	Uploader.SetAttr("directory", b)
	Return Me
End Sub


Sub SetAccept(a As String) As WixUploader
	Uploader.SetAttr("accept", a)
	Return Me
End Sub

Sub SetUpload(u As String) As WixUploader
	Uploader.SetAttr("upload", u)
	Return Me
End Sub

Sub SetHeight(h As Int) As WixUploader
	Uploader.SetHeight(h)
	Return Me
End Sub

Sub SetWidth(w As Int) As WixUploader
	Uploader.SetWidth(w)
	Return Me
End Sub

Sub Item As Map
	Return Uploader.item
End Sub