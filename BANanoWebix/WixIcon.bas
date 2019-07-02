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
	Public Parent As WixElement
End Sub

'Initializes the button
Public Sub Initialize(bID As String) As WixIcon
	ID = bID.ToLowerCase
	Icon.Initialize(ID).SetView("icon")
	onClick = Null
	IconName = ""
	Parent = Null
	Return Me
End Sub

'add tp columns of parent
Sub Pop
	Parent.AddColumns(Item)
End Sub


'set tooltip
Sub SetTooltip(tt As String) As WixIcon
	Icon.SetTooltip(tt)
	Return Me
End Sub


'set popup id
Sub SetPopUp(popupID As String) As WixIcon
	popupID = popupID.ToLowerCase
	Icon.SetProperty("popup", popupID)
	Return Me
End Sub

'set style
Sub SetStyle(prop As String, val As String) As WixIcon
	Icon.SetStyle(prop,val)
	Return Me
End Sub

'set the parent
Sub SetParent(p As WixElement) As WixIcon
	Parent = p
	Return Me
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'add to toolbar
Sub AddToToolbar(tblB As WixToolBar)
	tblB.Toolbar.AddColumns(Item)
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

'set badge
Sub SetBadge(b As String) As WixIcon
	Icon.SetAttr("badge", b)
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

'set height
Sub SetHeight(h As Object) As WixIcon
	Icon.Height = h
	Return Me
End Sub

'set width
Sub SetWidth(w As Object) As WixIcon
	Icon.Width = w
	Return Me
End Sub


'set align right
Sub SetAlignRight(r As String) As WixIcon 'ignore
	Icon.setAlignright("")
	Return Me
End Sub

'set align center
Sub SetAlignCenter(r As String) As WixIcon 'ignore
	Icon.setAligncenter("")
	Return Me
End Sub

'set align left
Sub SetAlignLeft(r As String) As WixIcon 'ignore
	Icon.SetAlignleft("")
	Return Me
End Sub
