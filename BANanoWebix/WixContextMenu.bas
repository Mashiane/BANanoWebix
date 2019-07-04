B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public ContextMenu As WixElement
	Public Items As List
	Private sepCount As Int
End Sub

'Initializes the Context
Public Sub Initialize(sid As String) As WixContextMenu
	ID = sid.ToLowerCase
	ContextMenu.Initialize(ID).setview("contextmenu")
	Items.Initialize 
	sepCount = 0
	Return Me
End Sub

'set master
Sub SetMaster(pID As String) As WixContextMenu
	ContextMenu.SetAttr("master", pID)
	Return Me
End Sub


'set name
Sub SetName(n As String) As WixContextMenu
	ContextMenu.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixContextMenu
	ContextMenu.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixContextMenu
	ContextMenu.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixContextMenu
	ContextMenu.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixContextMenu
	ContextMenu.SetMinHeight(h)
	Return Me
End Sub

'return the item
Sub Item As Map
	Return ContextMenu.item
End Sub

'use a map object
Sub SetMap(m As Map) As WixContextMenu
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		ContextMenu.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


' set menu pos right
Sub SetSubMenuPosRight(r As String) As WixContextMenu   'ignore
	ContextMenu.SetAttr("subMenuPos", "right")
	Return Me
End Sub


'set height
Sub SetHeight(h As Object) As WixContextMenu
	ContextMenu.SetAttr("height", h)
	Return Me
End Sub

'set width
Sub SetWidth(w As Object) As WixContextMenu
	ContextMenu.SetAttr("width", w)
	Return Me
End Sub

'set layout y
Sub SetLayoutY(r As String) As WixContextMenu  'ignore
	ContextMenu.SetAttr("layout", "y")
	Return Me
End Sub

'set auto width
Sub SetAutoWidth(b As Boolean) As WixContextMenu
	ContextMenu.SetAttr("autowidth", b)
	Return Me
End Sub

'set template
Sub SetTemplate(t As String) As WixContextMenu
	ContextMenu.SetAttr("template", t)
	Return Me
End Sub

'add item
Sub AddItem(parentID As String, meID As String, mValue As String, mhref As String, mIcon As String, badge As String, target As String) As WixContextMenu
	parentID = parentID.tolowercase
	meID = meID.tolowercase
	Dim mitem As Map = CreateMap()
	mitem.Put("id", meID)
	mitem.Put("value", mValue)
	mitem.Put("href", mhref)
	mitem.Put("badge", badge)
	mitem.Put("target", target)
	mitem.Put("icon", mIcon)
	mitem.Put("parentid", parentID)
	Items.Add(mitem)
	Return Me
End Sub

Sub AddSeparator(parentID As String) As WixContextMenu
	parentID = parentID.tolowercase
	sepCount = sepCount + 1
	sepCount = sepCount & ""
	Dim meID As String = "sep" & sepCount
	Dim mItem As Map = CreateMap()
	mItem.Put("id", meID)
	mItem.Put("parentid", parentID)
	mItem.Put("$template", "Separator")
	Items.Add(mItem)
	Return Me
End Sub

'set data
Sub SetData(d As List) As WixContextMenu
	ContextMenu.SetAttr("data", d)
	Return Me
End Sub

'set select
Sub SetSelect(b As Boolean) As WixContextMenu
	ContextMenu.SetProperty("select", b)
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
