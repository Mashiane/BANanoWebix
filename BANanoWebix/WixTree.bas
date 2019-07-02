B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Tree As WixElement
	Private scheme As Map
	Public Items As List
End Sub

'Initializes the Tree sheet
Public Sub Initialize(eID As String) As WixTree
	ID = eID.tolowercase
	Tree.Initialize(ID).SetView("tree")
	scheme = CreateMap()
	Items.Initialize 
	Return Me
End Sub

'return the item
Sub Item As Map
	Tree.SetAttr("scheme", scheme)
	Return Tree.item
End Sub

'set group by
Sub SetGroupBy(g As String) As WixTree
	scheme.Put("$group", g)
	Return Me
End Sub

'set borderless
Sub SetBorderLess(b As Boolean) As WixTree
	Tree.SetBorderLess(b)
	Return Me
End Sub

'set selectable
Sub SetSelect(b As Boolean) As WixTree
	Tree.SetSelect(b)
	Return Me
End Sub

'set multi select
Sub SetMultiSelect(b As Boolean) As WixTree   'ignore
	Tree.SetAttr("select", "multiselect")
	Return Me
End Sub


'set type line tree
Sub SetTypeLineTree As WixTree
	Tree.SetType("lineTree")
	Return Me
End Sub

'set the data
Sub SetData(data As List) As WixTree
	Tree.SetData(data)
	Return Me
End Sub

'set style
Sub SetStyle(prop As String, val As String) As WixTree
	Tree.SetStyle(prop,val)
	Return Me
End Sub

'set template
Sub SetTemplate(t As Object) As WixTree
	Tree.SetTemplate(t)
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixTree
	Tree.SetTooltip(tt)
	Return Me
End Sub

'set height
Sub SetHeight(h As Object) As WixTree
	Tree.SetHeight(h)
	Return Me
End Sub

'set width
Sub SetWidth(h As object) As WixTree
	Tree.SetWidth(h)
	Return Me
End Sub

'add item
Sub AddItem(parentID As String, meID As String, mValue As String, mhref As String, mIcon As String, badge As String, target As String, mOpen As Boolean) As WixTree
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

