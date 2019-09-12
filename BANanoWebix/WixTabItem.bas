B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Private vTitle As String
	Private vIcon As String
	Public Body As WixElement
	Public TabItem As WixElement
	Public Parent As WixElement

End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(sid As String) As WixTabItem
	ID = sid.ToLowerCase
	TabItem.Initialize(ID & "tab")
	Body.Initialize(ID & "body")
	Parent = Null
	Return Me
End Sub

'set padding
Sub SetPadding(padding As Object) As WixTabItem
	TabItem.SetPadding(padding)
	Return Me
End Sub

'set padding
Sub SetMargin(margin As Object) As WixTabItem
	TabItem.SetMargin(margin)
	Return Me
End Sub

Sub SetAttributes(m As Map) As WixTabItem
	For Each k As String In m.Keys
		Dim v As String = m.Get(k)
		TabItem.SetAttr(k,v)
	Next
	Return Me
End Sub

Sub SetStyles(m As Map) As WixTabItem
	For Each k As String In m.Keys
		Dim v As String = m.Get(k)
		TabItem.SetStyle(k,v)
	Next
	Return Me
End Sub

'set css
Sub SetStyle(prop As String, sval As String) As WixTabItem
	TabItem.SetStyle(prop,sval)
	Return Me
End Sub


'set the parent
Sub SetParent(p As WixElement) As WixTabItem
	Parent = p
	Return Me
End Sub


'set close
Sub SetClose(b As Boolean) As WixTabItem
	TabItem.SetAttr("close", b)
	Return Me
End Sub

'add tp columns of parent
Sub Pop
	Parent.AddColumns(Item)
End Sub

Sub SetTemplateHTML(h As UOENowHTML) As WixTabItem
	h.SetImportant(False)
	Dim os As String = h.HTML
	TabItem.SetTemplate(os)
	Return Me
End Sub

'set body
Sub SetBody(b As WixElement) As WixTabItem
	Body = b
	Return Me
End Sub

'set header
Sub SetTitle(T As String) As WixTabItem
	vTitle = T
	Return Me
End Sub

'set icon
Sub SetIcon(i As String) As WixTabItem
	vIcon = i
	Return Me
End Sub

'return the item
Sub Item As Map
	Dim sb As StringBuilder
	sb.Initialize
	If vIcon <> "" Then
		sb.Append($"<span class='webix_icon ${vIcon}'></span>"$)
	End If
	If vTitle <> "" Then
		sb.Append(vTitle)
	End If
	TabItem.SetHeader(sb.ToString)
	TabItem.SetBody(Body.Item)
	Return TabItem.item
End Sub


'use a map object
Sub SetMap(m As Map) As WixTabItem
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		TabItem.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub
