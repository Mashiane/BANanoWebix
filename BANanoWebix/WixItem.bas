B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Item As WixElement
	Public ParentID As Object
End Sub

Public Sub Initialize(sid As String) As WixItem
	ID = sid.tolowercase
	Item.Initialize(ID)
	ParentID = ""
	Return Me 
End Sub

Sub SetTemplate(t As Object) As WixItem
	Item.SetTemplate(t)
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixItem
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		Item.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


Sub SetTemplateHTML(h As UOENowHTML) As WixItem
	Dim out As String = h.HTML 
	SetTemplate(out)
	Return Me
End Sub

Sub SetValue(v As Object) As WixItem
	Item.SetValue(v)
	Return Me
End Sub

Sub SetBadge(b As Object) As WixItem
	Item.SetBadge(b)
	Return Me
End Sub

Sub SetIcon(i As Object) As WixItem
	Item.SetIcon(i)
	Return Me
End Sub

Sub SetOpen(o As Object) As WixItem
	Item.SetAttr("open", o)
	Return Me
End Sub	

Sub SetHREF(h As Object) As WixItem
	Item.SetAttr("href", h)
	Return Me
End Sub

Sub SetTarget(h As Object) As WixItem
	Item.SetAttr("target", h)
	Return Me
End Sub


Sub SetSideBarImage(i As Object) As WixItem
	Dim ih As UOENowHTML
	ih.Initialize("","img").SetImportant(False).SetSRC(i,True).AddClass("sidebar-icon")
	Dim icon As String = ih.html
	SetIcon(icon)
	Return Me
End Sub

Sub SetParent(p As Object) As WixItem
	Item.SetAttr("parentid", p)
	ParentID = p
	Return Me
End Sub
	
Sub Entity As Map
	Return Item.Item 
End Sub

Sub AddToItems(target As List)
	target.Add(Entity)
End Sub

