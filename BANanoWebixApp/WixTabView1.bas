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

'Initializes the TabView
Public Sub Initialize(sid As String) As WixTabView1
	ID = sid.tolowercase
	TabView.Initialize(ID)
	TabView.SetView("tabview")
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixTabView1
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		TabView.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub

'set name
Sub SetName(n As String) As WixTabView1
	TabView.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixTabView1
	TabView.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixTabView1
	TabView.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixTabView1
	TabView.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixTabView1
	TabView.SetMinHeight(h)
	Return Me
End Sub

'set height
Sub SetHeight(h As Object) As WixTabView1
	TabView.SetAttr("height", h)
	Return Me
End Sub

'set width
Sub SetWidth(w As Object) As WixTabView1
	TabView.SetAttr("width", w)
	Return Me
End Sub

'set multiview animated
Sub SetAnimate(b As Boolean) As WixTabView1
	TabView.SetAnimate(b)
	Return Me
End Sub

'set tabbar close
Sub SetTabBarClose(b As Boolean) As WixTabView1
	TabView.SetAttr("close", b)
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixTabView1
	TabView.SetTooltip(tt)
	Return Me
End Sub

'return the item
Sub Item As Map
	Return TabView.item
End Sub

'set on bottom
Sub SetTypeBottom(b As Boolean) As WixTabView1   'ignore
	TabView.SetType("bottom")
	Return Me
End Sub

'set multiview
Sub SetMultiView(b As Boolean) As WixTabView1
	TabView.SetAttr("multiview",b)
	Return Me
End Sub

'add an item
Sub AddTab(wt As WixTabItem) As WixTabView1
	TabView.AddCells(wt.Item)
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