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
	Public Parent As WixElement

End Sub


'set css
Sub SetStyle(prop As String, sval As String) As WixHint
	Hint.SetStyle(prop,sval)
	Return Me
End Sub

'set padding
Sub SetPadding(padding As Object) As WixHint
	Hint.SetPadding(padding)
	Return Me
End Sub

'set padding
Sub SetMargin(margin As Object) As WixHint
	Hint.SetMargin(margin)
	Return Me
End Sub

Sub SetAttributes(m As Map) As WixHint
	For Each k As String In m.Keys
		Dim v As String = m.Get(k)
		Hint.SetAttr(k,v)
	Next
	Return Me
End Sub

Sub SetStyles(m As Map) As WixHint
	For Each k As String In m.Keys
		Dim v As String = m.Get(k)
		Hint.SetStyle(k,v)
	Next
	Return Me
End Sub

'Initializes the hint
Public Sub Initialize(sid As String) As WixHint
	ID = sid.tolowercase
	Hint.Initialize(ID).SetView("hint")
	Items.Initialize 
	Parent = Null
	Return Me 
End Sub

'add tp columns of parent
Sub Pop
	Parent.AddColumns(Item)
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
	h.SetImportant(False)
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