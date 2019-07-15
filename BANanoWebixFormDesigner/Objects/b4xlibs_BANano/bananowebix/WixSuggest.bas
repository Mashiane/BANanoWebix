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
	Private Items As List
End Sub

'Initializes the element
Public Sub Initialize(sID As String) As WixSuggest
	Suggest.Initialize(sID).SetView("suggest")
	Items.Initialize  
	Return Me
End Sub

'set data
Sub SetData(d As List) As WixSuggest
	Suggest.SetData(d)
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


Sub SetTemplateHTML(h As UOENowHTML) As WixSuggest
	Dim os As String = h.HTML
	Suggest.SetTemplate(os)
	Return Me
End Sub

'set name
Sub SetName(n As String) As WixSuggest
	Suggest.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixSuggest
	Suggest.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixSuggest
	Suggest.SetResponsiveCell(b)
	Return Me
End Sub


'set width
Sub SetWidth(w As Int) As WixSuggest
	Suggest.SetWidth(w)
	Return Me
End Sub

'set minheight
Sub SetHeight(h As Int) As WixSuggest
	Suggest.SetHeight(h)
	Return Me
End Sub

'set min width
Sub SetMinWidth(w As Int) As WixSuggest
	Suggest.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixSuggest
	Suggest.SetMinHeight(h)
	Return Me
End Sub

'return the item
Sub Item As Map
	If Items.Size > 0 Then SetData(Items)
	Return Suggest.Item
End Sub

'add a suggestion
Sub AddSuggestion(sID As String, sValue As String) As WixSuggest
	Dim sug As Map = CreateMap()
	sug.Put("id", sID)
	sug.Put("value", sValue)
	Items.Add(sug)
	Return Me
End Sub

'add a suggestion
Sub AddItem(sID As String, sValue As String) As WixSuggest
	AddSuggestion(sID, sValue)
	Return Me
End Sub

'set relative top
Sub SetRelativeTop(b As Boolean) As WixSuggest   'ignore
	Suggest.SetAttr("relative", "top")
	Return Me
End Sub


'set relative left
Sub SetRelativeLeft(b As Boolean) As WixSuggest  'ignore
	Suggest.SetAttr("relative", "left")
	Return Me
End Sub


'set relative right
Sub SetRelativeRight(b As Boolean) As WixSuggest   'ignore
	Suggest.SetAttr("relative", "right")
	Return Me
End Sub

'set fit master
Sub SetFitMaster(b As Boolean) As WixSuggest
	Suggest.SetAttr("fitMaster", b)
	Return Me
End Sub

'set ycount
Sub SetYCount(y As Object) As WixSuggest
	Suggest.SetAttr("yCount", y)
	Return Me
End Sub