B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Hint As WixElement
	Private Items As List
End Sub

'Initializes the hint
Public Sub Initialize(sid As String) As WixHint
	ID = sid.tolowercase
	Hint.Initialize(ID).SetView("hint")
	Items.Initialize 
	Return Me 
End Sub

Sub AddStep(elID As String, stitle As String, stext As String, sevent As String) As WixHint
	elID = elID.tolowercase
	Dim h As Map = CreateMap()
	h.Put("el", elID)
	h.Put("title", stitle)
	h.Put("text", stext)
	h.Put("event", sevent)
	Items.Add(h)
	Return Me
End Sub


Sub SetTemplateHTML(h As UOENowHTML) As WixHint
	Dim os As String = h.HTML
	Hint.SetTemplate(os)
	Return Me
End Sub

Sub SetTop(t As Object) As WixHint
	Hint.SetAttr("top", t)
	Return Me
End Sub

Sub SetLeft(l As Object) As WixHint
	Hint.SetAttr("left", l)
	Return Me
End Sub

Sub Item As Map
	Hint.SetAttr("steps", Items)
	Return Hint.item
End Sub

'set nextButton
Sub SetNextButton(n As Object) As WixHint
	Hint.SetAttr("nextButton", n)
	Return Me
End Sub

'set prevButton
Sub SetPrevButton(b As Object) As WixHint
	Hint.SetAttr("prevButton", b)
	Return Me
End Sub