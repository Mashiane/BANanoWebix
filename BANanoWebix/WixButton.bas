B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.5
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Button As WixElement
	Private onClick As BANanoObject
	Private ButtonType As String
	Private ImageURL As String
	Private Icon As String
End Sub

'Initializes the button
Public Sub Initialize(bID As String) As WixButton
	ID = bID.ToLowerCase
	Button.Initialize(ID).SetView("button")
	onClick = Null
	Icon = ""
	Return Me
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'add to toolbar
Sub AddToToolbar(tblB As WixToolBar)
	tblB.ToolBar.AddColumns(Item)
End Sub

'set value
Sub SetValue(v As String) As WixButton
	Button.Value = v
	Return Me
End Sub

'set onclick event
Sub SetClick(e As BANanoObject) As WixButton
	onClick = e
	Return Me
End Sub

'return the item to add
Sub Item As Map
	Button.SetOnContent("icon", Icon)
	Button.SetOnContent("image", ImageURL)
	Button.TypeOf = ButtonType
	If onClick <> Null Then 
		Button.SetAttr("click", onClick)
	End If
	Return Button.item
End Sub

'set the image
Sub SetImage(img As String) As WixButton
	ImageURL = img
	Return Me
End Sub

'set the icon
Sub SetIcon(icn As String) As WixButton
	Icon = icn
	Return Me
End Sub

'set label
Sub SetLabel(lbl As String) As WixButton
	Button.Label.Text = lbl
	Button.value = lbl
	Return Me
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

'set height
Sub SetHeight(h As Int) As WixButton
	Button.Height = h
	Return Me
End Sub

'set width
Sub SetWidth(w As Int) As WixButton
	Button.Width = w
	Return Me
End Sub
