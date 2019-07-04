B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public MultiView As WixElement
End Sub

'Initializes the MultiView
Public Sub Initialize(sid As String) As WixMultiView
	ID = sid.tolowercase
	MultiView.Initialize(ID)
	MultiView.SetView("multiview")
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixMultiView
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		MultiView.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


'set name
Sub SetName(n As String) As WixMultiView
	MultiView.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixMultiView
	MultiView.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixMultiView
	MultiView.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixMultiView
	MultiView.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixMultiView
	MultiView.SetMinHeight(h)
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixMultiView
	MultiView.SetTooltip(tt)
	Return Me
End Sub


'return the item
Sub Item As Map
	Return MultiView.item
End Sub

'set fitBiggest
Sub SetFitBiggest(b As Boolean) As WixMultiView
	MultiView.SetAttr("fitBiggest", b)
	Return Me
End Sub

'set animate
Sub SetAnimate(b As Boolean) As WixMultiView
	MultiView.SetAttr("animate", b)
	Return Me
End Sub

'set keepViews
Sub SetkeepViews(b As Boolean) As WixMultiView
	MultiView.SetAttr("keepViews", b)
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