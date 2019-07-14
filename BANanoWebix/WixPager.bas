B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Pager As WixElement
	Private sb As StringBuilder
End Sub

'Initializes the pager
Public Sub Initialize(sID As String) As WixPager
	ID = sID.tolowercase
	Pager.Initialize(ID).SetView("pager")
	sb.Initialize 
	Return Me 
End Sub

'show first
Sub SetShowFirst(b As Boolean) As WixPager
	If b Then
		sb.Append("{common.first()} ")
	End If
	Return Me
End Sub


Sub SetTemplateHTML(h As UOENowHTML) As WixPager
	Dim os As String = h.HTML
	pager.SetTemplate(os)
	Return Me
End Sub

'set name
Sub SetName(n As String) As WixPager
	Pager.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixPager
	Pager.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixPager
	Pager.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixPager
	Pager.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixPager
	Pager.SetMinHeight(h)
	Return Me
End Sub

'show previous
Sub SetShowPrev(b As Boolean) As WixPager
	If b Then
		sb.Append("{common.prev()} ")
	End If
	Return Me
End Sub

'show pages
Sub SetShowPages(b As Boolean) As WixPager
	If b Then
		sb.Append("{common.pages()} ")
	End If
	Return Me
End Sub

'show next
Sub SetShowNext(b As Boolean) As WixPager
	If b Then
		sb.Append("{common.next()} ")
	End If
	Return Me
End Sub

'show last
Sub SetShowLast(b As Boolean) As WixPager
	If b Then
		sb.Append("{common.last()}")
	End If
	Return Me
End Sub

'set container
Sub SetContainer(cont As String) As WixPager
	Pager.SetAttr("container", cont)
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixPager
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		Pager.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub

'set master
Sub SetMaster(m As Object) As WixPager
	Pager.SetAttr("master", m)
	Return Me
End Sub

'set count
Sub SetCount(c As Object) As WixPager
	Pager.SetAttr("count", c)
	Return Me
End Sub

'the number of pages in the pager
Sub SetGroup(g As Int) As WixPager
	Pager.SetAttr("group", g)
	Return Me
End Sub

'animate
Sub SetAnimate(b As Boolean) As WixPager
	Pager.SetAttr("animate", b)
	Return Me
End Sub

'the number of records per a page
Sub SetSize(s As Int) As WixPager
	Pager.SetAttr("size", s)
	Return Me
End Sub

'item
Sub Item As Map
	Dim tt As String = sb.ToString
	tt = tt.trim
	If tt <> "" Then
		Pager.SetTemplate(sb.ToString)
	End If
	Return Pager.item
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