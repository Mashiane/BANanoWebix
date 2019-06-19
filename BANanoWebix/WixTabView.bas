B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public TabView As WixElement
End Sub

'Initializes the accordion
Public Sub Initialize(sid As String) As WixTabView
	ID = sid.tolowercase
	TabView.Initialize(ID)
	TabView.SetView("tabview")
	Return Me
End Sub


'set tooltip
Sub SetTooltip(tt As String) As WixTabView
	TabView.SetTooltip(tt)
	Return Me
End Sub

'return the item
Sub Item As Map
	Return TabView.item
End Sub

'add an item
Sub AddTab(iid As String, header As String, template As String, attributes As Map)
	Dim i As WixElement
	i.Initialize(iid)
	i.SetHeader(header)
	i.SetTemplate(template)
	If attributes <> Null Then
		For Each astr As String In attributes.Keys
			Dim vstr As String = attributes.Get(astr)
			i.SetProperty(astr,vstr)  
		Next
	End If
	TabView.AddCells(i.Item)
End Sub
