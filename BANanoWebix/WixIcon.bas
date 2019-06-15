B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Icon As WixElement
	Private onClick As BANanoObject
	Private IconName As String
End Sub

'Initializes the button
Public Sub Initialize(bID As String) As WixIcon
	ID = bID.ToLowerCase
	Icon.Initialize(ID).SetView("icon")
	onClick = Null
	IconName = ""
	Return Me
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'add to toolbar
Sub AddToToolbar(tblB As WixToolBar)
	tblB.AddItem(Item)
End Sub

'set icon
Sub SetIcon(i As String) As WixIcon
	IconName = i
	Return Me
End Sub

'set onclick event
Sub SetClick(e As BANanoObject) As WixIcon
	onClick = e
	Return Me
End Sub

'return the item to add
Sub Item As Map
	Icon.SetOnContent("icon", IconName)
	If onClick <> Null Then
		Icon.SetAttr("click", onClick)
	End If
	Return Icon.item
End Sub

'set label
Sub SetLabel(lbl As String) As WixIcon
	Icon.Label.Text = lbl
	Icon.value = lbl
	Return Me
End Sub

'set height
Sub SetHeight(h As Int) As WixIcon
	Icon.Height = h
	Return Me
End Sub

'set width
Sub SetWidth(w As Int) As WixIcon
	Icon.Width = w
	Return Me
End Sub
