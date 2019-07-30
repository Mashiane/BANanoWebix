B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public GroupList As WixElement
	Public ID As String
	Private Items As List
	Public Parent As WixElement

End Sub

'Initializes GroupList object
Public Sub Initialize(lID As String) As WixGroupList
	ID = lID.tolowercase
	GroupList.Initialize(ID).SetView("grouplist")
	Items.Initialize 
	parent = null
	Return Me
End Sub

'add tp columns of parent
Sub Pop
	Parent.AddColumns(Item)
End Sub

'set the parent
Sub SetParent(p As WixElement) As WixGroupList
	Parent = p
	Return Me
End Sub


'add item
Sub AddItem(parentID As String, meID As String, mValue As String, mhref As String, mIcon As String, badge As String, target As String, mOpen As Boolean) As WixGroupList
	parentID = parentID.tolowercase
	meID = meID.tolowercase
	Dim mitem As Map = CreateMap()
	mitem.Put("id", meID)
	mitem.Put("value", mValue)
	mitem.Put("href", mhref)
	mitem.Put("badge", badge)
	mitem.Put("target", target)
	mitem.Put("icon", mIcon)
	mitem.Put("open", mOpen)
	mitem.Put("parentid", parentID)
	Items.Add(mitem)
	Return Me
End Sub


Sub SetTemplateHTML(h As UOENowHTML) As WixGroupList
	h.SetImportant(False)
	Dim os As String = h.HTML
	GroupList.SetTemplate(os)
	Return Me
End Sub

'set name
Sub SetName(n As String) As WixGroupList
	GroupList.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixGroupList
	GroupList.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixGroupList
	GroupList.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixGroupList
	GroupList.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixGroupList
	GroupList.SetMinHeight(h)
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixGroupList
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		GroupList.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


'set style to update css property
Sub SetStyle(prop As String, val As String) As WixGroupList
	GroupList.SetStyle(prop,val)
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixGroupList
	GroupList.SetTooltip(tt)
	Return Me
End Sub

'add to column
Sub AddToColumn(c As WixColumn)
	c.AddItem(Item)
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'set value
Sub SetValue(v As String) As WixGroupList
	GroupList.SetValue(v)
	Return Me
End Sub

'set borderless
Sub SetBorderLess(b As Boolean) As WixGroupList
	GroupList.SetAttr("borderless", b)
	Return Me
End Sub

'set enableselect
Sub SetSelect(b As Boolean) As WixGroupList
	GroupList.SetAttr("select", b)
	Return Me
End Sub

'set mutliselect
Sub SetMultiSelect(b As Boolean) As WixGroupList
	GroupList.SetAttr("multiselect", b)
	Return Me
End Sub

'set SetScroll
Sub SetScroll(b As Object) As WixGroupList
	GroupList.SetAttr("scroll", b)
	Return Me
End Sub

'set SetPager
Sub SetPager(p As String) As WixGroupList
	p = p.tolowercase
	GroupList.SetAttr("pager", p)
	Return Me
End Sub

'return the object
Sub Item As Map
	If Items.Size > 0 Then
		Dim data As List = modWebix.Unflatten(Items, "data")
		SetData(data)
	End If
	Return GroupList.item
End Sub

'set template
Sub SetTemplate(t As String) As WixGroupList
	GroupList.SetTemplate(t)
	Return Me
End Sub

'set height
Sub SetHeight(t As String) As WixGroupList
	GroupList.SetHeight(t)
	Return Me
End Sub

'set width
Sub SetWidth(t As Object) As WixGroupList
	GroupList.SetWidth(t)
	Return Me
End Sub

'set data
Sub SetData(d As List) As WixGroupList
	GroupList.SetData(d)
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