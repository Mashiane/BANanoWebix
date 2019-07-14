B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Context As WixElement
	Private body As Map
End Sub

'Initializes the Context, a popup window you can use
Public Sub Initialize(sid As String) As WixContext
	ID = sid.ToLowerCase
	Context.Initialize(ID).setview("context")
	body.Initialize 
	Return Me
End Sub

Sub SetTemplateHTML(h As UOENowHTML) As WixContext
	Dim os As String = h.HTML
	Context.SetTemplate(os)
	Return Me
End Sub

'set master
Sub SetMaster(pID As String) As WixContext
	Context.SetAttr("master", pID)
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixContext
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		Context.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


'set name
Sub SetName(n As String) As WixContext
	Context.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixContext
	Context.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixContext
	Context.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixContext
	Context.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixContext
	Context.SetMinHeight(h)
	Return Me
End Sub


'set height
Sub SetHeight(h As Object) As WixContext
	Context.SetAttr("height", h)
	Return Me
End Sub

'set width
Sub SetWidth(w As Object) As WixContext
	Context.SetAttr("width", w)
	Return Me
End Sub

'return the item
Sub Item As Map
	Context.SetAttr("body", body)
	Return Context.item
End Sub

'set template
Sub SetTemplate(t As String) As WixContext
	body.put("template", t)
	Return Me
End Sub


'add to parent rows
Sub AddToRows(P As WixElement)
	P.AddRows(Item)
End Sub

'add to parent columns
Sub AddToColumns(P As WixElement)
	P.AddColumns(Item)
End Sub

'add to parent elements
Sub AddToElements(P As WixElement)
	P.AddElements(Item)
End Sub