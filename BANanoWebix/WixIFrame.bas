B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public IFrame As WixElement
End Sub

'Initializes the iframe
Public Sub Initialize(sid As String) As WixIFrame
	ID = sid.tolowercase
	IFrame.Initialize(ID).SetView("iframe")
	Return Me
End Sub

Sub SetContainer(c As String) As WixIFrame
	IFrame.SetContainer(c)
	Return Me
End Sub

'return menu
Sub Item As Map
	Return IFrame.item
End Sub


'set scroll
Sub SetScroll(b As Boolean) As WixIFrame
	IFrame.SetProperty("scroll", b)
	Return Me
End Sub

'set template
Sub SetSRC(t As String) As WixIFrame
	IFrame.SetAttr("src", t)
	Return Me
End Sub

'set height
Sub SetHeight(h As Object) As WixIFrame
	IFrame.SetAttr("height", h)
	Return Me
End Sub


'set width
Sub SetWidth(w As Object) As WixIFrame
	IFrame.SetAttr("width", w)
	Return Me
End Sub
