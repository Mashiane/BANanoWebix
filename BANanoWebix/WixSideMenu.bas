B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public SideMenu As WixElement
	Private body As WixElement
	Public Items As List
	Private typeOf As Map
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(sid As String) As WixSideMenu
	ID = sid.tolowercase
	SideMenu.Initialize(sid).SetView("sidemenu")
	body.Initialize(ID & "body").SetView("list").SetBorderLess(True).SetScroll(False).SetSelect(True)
	Items.Initialize 
	typeOf.Initialize
	Return Me
End Sub

'add menu item
Sub AddItem(meID As String, mValue As String, mhref As String, mIcon As String, badge As String, target As String) As WixSideMenu
	meID = meID.tolowercase
	Dim mitem As Map = CreateMap()
	mitem.Put("id", meID)
	mitem.Put("value", mValue)
	mitem.Put("href", mhref)
	mitem.Put("badge", badge)
	mitem.Put("target", target)
	mitem.Put("icon", mIcon)
	Items.Add(mitem)
	Return Me
End Sub

Sub CreateItem(i As String) As WixElement
	Dim ii As WixElement
	ii.Initialize(i)
	Return ii
End Sub

Sub SetTemplateHTML(h As UOENowHTML) As WixSideMenu
	Dim os As String = h.HTML
	SideMenu.SetTemplate(os)
	Return Me
End Sub

'set name
Sub SetName(n As String) As WixSideMenu
	SideMenu.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixSideMenu
	SideMenu.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixSideMenu
	SideMenu.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixSideMenu
	SideMenu.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixSideMenu
	SideMenu.SetMinHeight(h)
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixSideMenu
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		SideMenu.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub



'set scroll
Sub SetScroll(b As Object) As WixSideMenu
	SideMenu.SetAttr("scroll", b)
	Return Me
End Sub

'return menu
Sub Item As Map
	body.SetAttr("type", typeOf)
	If Items.Size > 0 Then body.SetData(Items)
	SideMenu.SetAttr("body", body.item)
	Return SideMenu.item
End Sub

Sub SetData(data As List) As WixSideMenu
	body.SetData(data)
	Return Me
End Sub

'set template
Sub SetTemplate(t As String) As WixSideMenu
	body.SetTemplate(t)
	Return Me
End Sub


'set height
Sub SetHeight(h As Object) As WixSideMenu
	SideMenu.SetAttr("height", h)
	Return Me
End Sub


'set height
Sub SetItemHeight(h As Int) As WixSideMenu
	typeOf.Put("height", h)
	Return Me
End Sub

'set width
Sub SetItemWidth(w As Int) As WixSideMenu
	typeOf.Put("width", w)
	Return Me
End Sub


'set layout x
Sub SetLayoutX(h As Boolean) As WixSideMenu   'ignore
	body.SetAttr("layout", "x")
	Return Me
End Sub


'set width
Sub SetWidth(w As Object) As WixSideMenu
	SideMenu.SetAttr("width", w)
	Return Me
End Sub


'set select enables selection of items
Sub SetSelect(s As Object) As WixSideMenu
	SideMenu.SetAttr("select", s)
	Return Me
End Sub

'set position right
Sub SetPositionRight(c As String) As WixSideMenu  'ignore
	SideMenu.SetAttr("position", "right")
	Return Me
End Sub

'set position left
Sub SetPositionLeft(c As String) As WixSideMenu  'ignore
	SideMenu.SetAttr("position", "left")
	Return Me
End Sub

'set position top
Sub SetPositionTop(c As String) As WixSideMenu  'ignore
	SideMenu.SetAttr("position", "top")
	Return Me
End Sub

'set position top
Sub SetPositionBottom(c As String) As WixSideMenu  'ignore
	SideMenu.SetAttr("position", "bottom")
	Return Me
End Sub


'set position center
Sub SetPosition(c As String) As WixSideMenu
	SideMenu.SetAttr("position", c)
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