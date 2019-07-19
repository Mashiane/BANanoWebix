B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Popup As WixElement
	Private body As Map
End Sub

'Initializes the popup
Public Sub Initialize(sid As String) As WixPopUp
	ID = sid.ToLowerCase
	Popup.Initialize(ID).setview("popup")
	body.Initialize 
	Return Me 
End Sub

'use a map object
Sub SetMap(m As Map) As WixPopUp
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		Popup.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


Sub SetTemplateHTML(h As UOENowHTML) As WixPopUp
	Dim os As String = h.HTML
	Popup.SetTemplate(os)
	Return Me
End Sub

'set name
Sub SetName(n As String) As WixPopUp
	Popup.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixPopUp
	Popup.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixPopUp
	Popup.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixPopUp
	Popup.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixPopUp
	Popup.SetMinHeight(h)
	Return Me
End Sub

'set move
Sub SetMove(b As Boolean) As WixPopUp
	Popup.SetAttr("move", b)
	Return Me
End Sub

'set height
Sub SetHeight(h As Object) As WixPopUp
	Popup.SetAttr("height", h)
	Return Me
End Sub

'set position center
Sub SetPositionCenter(c As String) As WixPopUp  'ignore
	Popup.SetAttr("position", "center")
	Return Me
End Sub

'set position center
Sub SetPosition(c As String) As WixPopUp
	Popup.SetAttr("position", c)
	Return Me
End Sub


'set position center
Sub SetPositionRight(c As String) As WixPopUp  'ignore
	Popup.SetAttr("position", "right")
	Return Me
End Sub

'set width
Sub SetWidth(w As Object) As WixPopUp
	Popup.SetAttr("width", w)
	Return Me
End Sub

'return the item
Sub Item As Map
	Popup.SetAttr("body", body)
	Return Popup.item
End Sub

'set template
Sub SetTemplate(t As String) As WixPopUp
	body.Put("template", t)
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