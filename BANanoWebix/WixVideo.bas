B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Video As WixElement
	Private sources As List
End Sub

'set borderless
Sub SetBorderLess(b As Boolean) As WixVideo
	Video.SetAttr("borderless", b)
	Return Me
End Sub

'initialize the input box
Public Sub Initialize(iID As String) As WixVideo
	ID = iID.tolowercase
	Video.Initialize(iID).SetView("video")
	sources.Initialize 
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixVideo
	Video.SetProperty("tooltip", tt)
	Return Me
End Sub

'set style
Sub SetStyle(prop As String, val As String) As WixVideo
	Video.SetStyle(prop,val)
	Return Me
End Sub

'set auto play
Sub SetAutoPlay(b As Boolean) As WixVideo
	Video.SetAttr("autoplay", b)
	Return Me
End Sub

'set controls
Sub SetControls(b As Boolean) As WixVideo
	Video.SetAttr("controls", b)
	Return Me
End Sub

'set height
Sub SetHeight(h As Object) As WixVideo
	Video.SetAttr("height", h)
	Return Me
End Sub

'set width
Sub SetWidth(w As Object) As WixVideo
	Video.SetAttr("width", w)
	Return Me
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'return the item
Sub Item As Map
	Video.SetAttr("src", sources)
	Return Video.item
End Sub

'set value
Sub SetValue(v As String) As WixVideo
	Video.Value = v
	Return Me
End Sub

'set label
Sub SetSRC(l As String) As WixVideo
	sources.Add(l)
	Return Me
End Sub
