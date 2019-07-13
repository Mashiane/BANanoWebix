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
	Private Element As WixElement
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(sid As String) As WixTab
	ID = sid.ToLowerCase
	Element.Initialize(ID & "tab")
	Body.Initialize(ID & "body") 
	Return Me
End Sub

'set close
Sub SetClose(b As Boolean) As WixTab
	Element.SetAttr("close", b)
	Return Me
End Sub

'set body
Sub SetBody(b As WixElement) As WixTab
	Body = b
	Return Me
End Sub

'set header
Sub SetTitle(T As String) As WixTab 
	vTitle = T
	Return Me	
End Sub

'set icon
Sub SetIcon(i As String) As WixTab
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
	Element.SetHeader(sb.ToString)
	Element.SetBody(Body.Item)
	Return Element.item
End Sub