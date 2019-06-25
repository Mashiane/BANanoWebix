B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Pager As WixElement
End Sub

'Initializes the pager
Public Sub Initialize(sID As String) As WixPager
	ID = sID.tolowercase
	Pager.Initialize(ID).SetView("pager")
	Return Me 
End Sub

'set container
Sub SetContainer(cont As String) As WixPager
	Pager.SetAttr("container", cont)
	Return Me
End Sub

'set group
Sub SetGroup(g As Int) As WixPager
	Pager.SetAttr("group", g)
	Return Me
End Sub

'animate
Sub SetAnimate(b As Boolean) As WixPager
	Pager.SetAttr("animate", b)
	Return Me
End Sub

'size
Sub SetSize(s As Int) As WixPager
	Pager.SetAttr("size", s)
	Return Me
End Sub

'item
Sub Item As Map
	Return Pager.item
End Sub