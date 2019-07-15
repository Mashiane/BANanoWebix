B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public UnitList As WixElement
	Private typeOf As Map
End Sub

'Initializes the unit list
Public Sub Initialize(eID As String) As WixUnitList
	ID = eID.tolowercase
	UnitList.Initialize(ID).SetView("unitlist")
	typeOf = CreateMap()
	Return Me
End Sub

'set item height
Sub SetItemHeight(h As Object) As WixUnitList
	typeOf.Put("height", h)
	Return Me
End Sub


Sub SetTemplateHTML(h As UOENowHTML) As WixUnitList
	Dim os As String = h.HTML
	UnitList.SetTemplate(os)
	Return Me
End Sub

'set name
Sub SetName(n As String) As WixUnitList
	UnitList.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixUnitList
	UnitList.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixUnitList
	UnitList.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixUnitList
	UnitList.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixUnitList
	UnitList.SetMinHeight(h)
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixUnitList
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		UnitList.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub

'set item width
Sub SetItemWidth(w As Object) As WixUnitList
	typeOf.Put("width", w)
	Return Me
End Sub

'return the item
Sub Item As Map
	UnitList.SetAttr("type", typeOf)
	Return UnitList.item
End Sub

'set the data
Sub SetData(data As List) As WixUnitList
	UnitList.SetData(data)
	Return Me
End Sub

'set style
Sub SetStyle(prop As String, val As String) As WixUnitList
	UnitList.SetStyle(prop,val)
	Return Me
End Sub

'set borderless
Sub SetBorderLess(t As Boolean) As WixUnitList
	UnitList.SetAttr("borderless", t)
	Return Me
End Sub


'set template
Sub SetTemplate(t As Object) As WixUnitList
	UnitList.SetTemplate(t)
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixUnitList
	UnitList.SetTooltip(tt)
	Return Me
End Sub

'set height
Sub SetHeight(h As Object) As WixUnitList
	UnitList.SetHeight(h)
	Return Me
End Sub

'set width
Sub SetWidth(h As Object) As WixUnitList
	UnitList.SetWidth(h)
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