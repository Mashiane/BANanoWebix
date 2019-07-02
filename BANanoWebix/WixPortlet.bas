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

'use a map object
Sub SetMap(m As Map) As WixPortlet
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		Portlet.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


'set tooltip
Sub SetTooltip(tt As String) As WixPortlet
	Portlet.SetTooltip(tt)
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

