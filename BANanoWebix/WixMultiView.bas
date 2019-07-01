B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public MultiView As WixElement
End Sub

'Initializes the accordion
Public Sub Initialize(sid As String) As WixMultiView
	ID = sid.tolowercase
	MultiView.Initialize(ID)
	MultiView.SetView("multiview")
	Return Me
End Sub


'set tooltip
Sub SetTooltip(tt As String) As WixMultiView
	MultiView.SetTooltip(tt)
	Return Me
End Sub


'return the item
Sub Item As Map
	Return MultiView.item
End Sub

'set fitBiggest
Sub SetFitBiggest(b As Boolean) As WixMultiView
	MultiView.SetAttr("fitBiggest", b)
	Return Me
End Sub

'set animate
Sub SetAnimate(b As Boolean) As WixMultiView
	MultiView.SetAttr("animate", b)
	Return Me
End Sub

'set keepViews
Sub SetkeepViews(b As Boolean) As WixMultiView
	MultiView.SetAttr("keepViews", b)
	Return Me
End Sub