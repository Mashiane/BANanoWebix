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
	Private Parent As WixElement
End Sub

'Initializes the Portlet
Public Sub Initialize(sid As String) As WixPortlet
	ID = sid.tolowercase
	Portlet.Initialize(ID)
	Portlet.SetView("portlet")
	Parent = Null
	Return Me
End Sub

'set the parent
Sub SetParent(p As WixElement) As WixPortlet
	Parent = p
	Return Me
End Sub


'set css
Sub SetStyle(prop As String, sval As String) As WixPortlet
	Portlet.SetStyle(prop,sval)
	Return Me
End Sub


'add tp columns of parent
Sub Pop
	Parent.AddColumns(Item)
End Sub


'use a map object
Sub SetMap(m As Map) As WixPortlet
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		Portlet.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


Sub SetTemplateHTML(h As UOENowHTML) As WixPortlet
	h.SetImportant(False)
	Dim os As String = h.HTML
	Portlet.SetTemplate(os)
	Return Me
End Sub

'set name
Sub SetName(n As String) As WixPortlet
	Portlet.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixPortlet
	Portlet.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixPortlet
	Portlet.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixPortlet
	Portlet.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixPortlet
	Portlet.SetMinHeight(h)
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
	Portlet.SetAttr("body",tmp)
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
