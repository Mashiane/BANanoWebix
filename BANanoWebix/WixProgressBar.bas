B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Progressbar As WixElement
	Public Parent As WixElement

End Sub

'set the parent
Sub SetParent(p As WixElement) As WixProgressBar
	Parent = p
	Return Me
End Sub

'set padding
Sub SetPadding(padding As Object) As WixProgressBar
	Progressbar.SetPadding(padding)
	Return Me
End Sub

'set padding
Sub SetMargin(margin As Object) As WixProgressBar
	Progressbar.SetMargin(margin)
	Return Me
End Sub

Sub SetAttributes(m As Map) As WixProgressBar
	For Each k As String In m.Keys
		Dim v As String = m.Get(k)
		Progressbar.SetAttr(k,v)
	Next
	Return Me
End Sub

Sub SetStyles(m As Map) As WixProgressBar
	For Each k As String In m.Keys
		Dim v As String = m.Get(k)
		Progressbar.SetStyle(k,v)
	Next
	Return Me
End Sub

'set css
Sub SetStyle(prop As String, sval As String) As WixProgressBar
	Progressbar.SetStyle(prop,sval)
	Return Me
End Sub


'Initializes the progressbar
Public Sub Initialize(sid As String) As WixProgressBar
	ID = sid.tolowercase
	Progressbar.Initialize(ID)
	Parent = Null
	Return Me
End Sub

'add tp columns of parent
Sub Pop
	Parent.AddColumns(Item)
End Sub

'return the item
Sub Item As Map
	Return Progressbar.item
End Sub

'set type - top,bottom,icon
Sub SetType(sType As Object) As WixProgressBar
	Progressbar.SetAttr("type", sType)
	Return Me
End Sub

'draw a bar above the view/application
Sub SetTypeTop(typeTop As Object) As WixProgressBar   'ignore
	Progressbar.SetAttr("type", "top")
	Return Me
End Sub

'draws a bar below a view/application
Sub SetTypeBottom(typeBottom As Object) As WixProgressBar   'ignore
	Progressbar.SetAttr("type", "bottom")
	Return Me
End Sub

'draw an icon in the middle of a view/application
Sub SetTypeIcon(typeIcon As Object) As WixProgressBar   'ignore
	Progressbar.SetAttr("type", "icon")
	Return Me
End Sub

'icon name to display from font awesome
Sub SetIcon(icon As Object) As WixProgressBar
	Progressbar.SetAttr("icon", icon)
	Return Me
End Sub

' life time in milliseconds of the progress bar, after which it is hidden (if hide parameter is enabled)
Sub SetDelay(delay As Int) As WixProgressBar
	Progressbar.SetAttr("delay", delay)
	Return Me
End Sub

'specifies whether a progress bar/icon should be hidden after its life time
Sub SetHide(hide As Boolean) As WixProgressBar
	Progressbar.SetAttr("hide", hide)
	Return Me
End Sub

'an optional parameter, true only for the progress bar. Specifies the position of a progress mark on a bar. Varies from 0 to 1.
Sub SetPosition(position As Double) As WixProgressBar
	Progressbar.SetAttr("position", position)
	Return Me
End Sub