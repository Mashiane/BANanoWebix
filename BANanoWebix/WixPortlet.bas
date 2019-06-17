B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Portlet As WixElement
End Sub

'Initializes the accordion
Public Sub Initialize(sid As String) As WixPortlet
	ID = sid.tolowercase
	Portlet.Initialize(ID)
	Portlet.SetView("portlet")
	Return Me
End Sub

'return the item
Sub Item As Map
	Return Portlet.item
End Sub

'set body
Sub SetBody(b As String) As WixPortlet
	Dim tmp As Map = CreateMap()
	tmp.Put("template", b)
	Portlet.SetProperty("body",tmp)
	Return Me
End Sub
