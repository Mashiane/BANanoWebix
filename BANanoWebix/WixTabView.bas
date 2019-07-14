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
	Private mv As WixElement
	Private tb As WixElement
End Sub

'Initializes the TabView
Public Sub Initialize(sid As String) As WixTabView
	ID = sid.tolowercase
	TabView.Initialize(ID)
	TabView.SetView("tabview")
	mv.Initialize(ID & "mv")
	tb.Initialize(ID & "tb") 
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixTabView
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		TabView.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


Sub SetTemplateHTML(h As UOENowHTML) As WixTabView
	Dim os As String = h.HTML
	TabView.SetTemplate(os)
	Return Me
End Sub

'set name
Sub SetName(n As String) As WixTabView
	TabView.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixTabView
	TabView.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixTabView
	TabView.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixTabView
	TabView.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixTabView
	TabView.SetMinHeight(h)
	Return Me
End Sub

'set height
Sub SetHeight(h As Object) As WixTabView
	TabView.SetAttr("height", h)
	Return Me
End Sub

'set width
Sub SetWidth(w As Object) As WixTabView
	TabView.SetAttr("width", w)
	Return Me
End Sub

'set multiview animated
Sub SetAnimate(b As Boolean) As WixTabView
	mv.SetAnimate(b)
	Return Me
End Sub

'set tabbar close
Sub SetTabBarClose(b As Boolean) As WixTabView
	tb.SetAttr("close", b)
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixTabView
	TabView.SetTooltip(tt)
	Return Me
End Sub

'return the item
Sub Item As Map
	TabView.SetAttr("tabbar", tb.Item)
	TabView.SetAttr("multiview", mv.Item)
	Return TabView.item
End Sub

'set on bottom
Sub SetTypeBottom(b As Boolean) As WixTabView   'ignore
	TabView.SetType("bottom")
	Return Me
End Sub

'set multiview
Sub SetMultiView(b As Boolean) As WixTabView
	TabView.SetAttr("multiview",b)
	Return Me
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