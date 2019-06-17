﻿B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Toggle As WixElement
	Private OnLabel As String
	Private OffLabel As String
	Private ButtonType As String
	Private ImageURL As String
	Private Icon As String
	Private onIcon As String
	Private offIcon As String
	Public Parent As WixElement

End Sub

'initialize the element
Public Sub Initialize(iID As String) As WixToggle
	ID = iID.tolowercase
	Toggle.Initialize(iID).SetView("toggle")
	Toggle.Value = False
	OffLabel = ""
	OnLabel = ""
	Icon = ""
	ImageURL = ""
	offIcon = ""
	onIcon = ""
	Parent = Null
	Return Me
End Sub

'set the parent
Sub SetParent(p As WixElement) As WixButton
	Parent = p
	Return Me
End Sub

'set batch
Sub SetBatch(b As Int) As WixButton
	Toggle.SetBatch(b)
	Return Me
End Sub


'add tp columns of parent
Sub Pop
	Parent.AddColumns(Item)
End Sub


'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'add to toolbar
Sub AddToToolbar(tblB As WixToolBar)
	tblB.ToolBar.AddColumns(Item)
End Sub

'set off label
Sub SetOffLabel(l As String) As WixToggle
	OffLabel = l
	Return Me
End Sub

'set on label
Sub SetOnLabel(l As String) As WixToggle
	OnLabel = l
	Return Me
End Sub

'set the image
Sub SetImage(img As String) As WixToggle
	ImageURL = img
	Return Me
End Sub

'set the icon
Sub SetIcon(icn As String) As WixToggle
	Icon = icn
	Return Me
End Sub

'set onicon
Sub SetOnIcon(icn As String) As WixToggle
	onIcon = icn
	Return Me
End Sub

'set officon
Sub SetOffIcon(icn As String) As WixToggle
	offIcon = icn
	Return Me
End Sub

'set label
Sub SetLabel(lbl As String) As WixToggle
	Toggle.Label.Text = lbl
	Return Me
End Sub

'set image button
Sub SetTypeImageButton(r As String) As WixToggle
	ButtonType =  "imageButton"
	Return Me
End Sub

'button type image	
Sub SetTypeImage(r As String) As WixToggle
	ButtonType = "image"
	Return Me
End Sub

'button type icon
Sub SetTypeIcon(r As String) As WixToggle
	ButtonType = "icon"
	Return Me
End Sub

'button type icon button top
Sub SetTypeIconButtonTop(r As String) As WixToggle
	ButtonType = "iconButtonTop"
	Return Me
End Sub

'set height
Sub SetHeight(h As Int) As WixToggle
	Toggle.Height = h
	Return Me
End Sub

'set width
Sub SetWidth(w As Int) As WixToggle
	Toggle.Width = w
	Return Me
End Sub

'return the item
Sub Item As Map
	Toggle.SetOnContent("icon", Icon)
	Toggle.SetOnContent("image", ImageURL)
	Toggle.TypeOf = ButtonType
	Toggle.SetOnContent("onLabel", OnLabel)
	Toggle.SetOnContent("offLabel", OffLabel)
	Toggle.SetOnContent("offIcon", offIcon)
	Toggle.SetOnContent("onIcon", onIcon)
	Return Toggle.item
End Sub


'set type icon button
Sub SetTypeIconButton(i As String) As WixButton
	ButtonType = "iconButton"
	Return Me
End Sub

'set image button
Sub SetTypeImageButton(r As String) As WixButton
	ButtonType =  "imageButton"
	Return Me
End Sub

'button type image	
Sub SetTypeImage(r As String) As WixButton
	ButtonType = "image"
	Return Me
End Sub

'button type icon
Sub SetTypeIcon(r As String) As WixButton
	ButtonType = "icon"
	Return Me
End Sub

'button type iconbuttontop
Sub SetTypeIconButtonTop(r As String) As WixButton
	ButtonType = "iconButtonTop"
	Return Me
End Sub

'is danger
Sub SetTypeDanger(r As String) As WixButton
	ButtonType = "danger"
	Return Me
End Sub

'is form
Sub SetTypeForm(r As String) As WixButton
	ButtonType = "form"
	Return Me
End Sub

'is prev
Sub SetTypePrev(r As String) As WixButton
	ButtonType = "prev"
	Return Me
End Sub

'is next
Sub SetTypeNext(r As String) As WixButton
	ButtonType = "next"
	Return Me
End Sub