B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Suggest As WixElement
	Private Data As List
	Private Page As WixPage
End Sub

'Initializes the element
Public Sub Initialize(pg As WixPage, sID As String) As WixSuggest
	Suggest.Initialize(sID).SetView("suggest")
	Data.Initialize
	Page = pg 
	Return Me
End Sub

'set data
Sub SetData(d As List) As WixSuggest
	Data = d
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixSuggest
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		Suggest.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


'return the item
private Sub Item As Map
	Suggest.SetAttr("data", Data)
	Return Suggest.Item
End Sub

'add to parent COMPULSORY
Sub UI()
	Dim webix As BANanoObject = Page.webix 
	webix.RunMethod("ui",Item)
End Sub

'add a suggestion
Sub AddSuggestion(sID As String, sValue As String) As WixSuggest
	Dim sug As Map = CreateMap()
	sug.Put("id", sID)
	sug.Put("value", sValue)
	Data.Add(sug)
	Return Me
End Sub