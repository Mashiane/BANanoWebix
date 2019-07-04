B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.5
@EndOfDesignText@
#IgnoreWarnings:12
'icons http://www.entypo.com/
Sub Class_Globals
	Public ID As String
	Public Button As WixElement
	Private onClick As BANanoObject
	Private ButtonType As String
	Private ImageURL As String
	Private Icon As String
	Public Parent As WixElement
	Private OnLabel As String
	Private OffLabel As String
	Private onIcon As String
	Private offIcon As String
End Sub

'Initializes the button
Public Sub Initialize(bID As String) As WixButton
	ID = bID.ToLowerCase
	Button.Initialize(ID).SetView("button")
	onClick = Null
	Icon = ""
	Parent = Null
	OffLabel = ""
	OnLabel = ""
	ImageURL = ""
	offIcon = ""
	onIcon = ""
	Return Me
End Sub


'set name
Sub SetName(n As String) As WixButton
	Button.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixButton
	Button.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixButton
	Button.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixButton
	Button.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixButton
	Button.SetMinHeight(h)
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixButton
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		Button.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


'sub SetInputWidth
Sub SetInputWidth(w As Int) As WixButton
	Button.SetInputWidth(w)
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixButton
	Button.SetProperty("tooltip", tt)
	Return Me
End Sub

'set style
Sub SetStyle(prop As String, val As String) As WixButton
	Button.SetStyle(prop,val)
	Return Me
End Sub


'set off label
Sub SetOffLabel(l As String) As WixButton
	OffLabel = l
	Return Me
End Sub

'set on label
Sub SetOnLabel(l As String) As WixButton
	OnLabel = l
	Return Me
End Sub

'set toggle
Sub SetToggle(t As String) As WixButton  'ignore
	Button.SetView("toggle")
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
	Button.SetOnContent("onLabel", OnLabel)
	Button.SetOnContent("offLabel", OffLabel)
	Button.SetOnContent("offIcon", offIcon)
	Button.SetOnContent("onIcon", onIcon)
	Button.SetOnContent("icon", Icon)
	Button.SetOnContent("image", ImageURL)
	Button.TypeOf = ButtonType
	If onClick <> Null Then 
		Button.SetAttr("click", onClick)
	End If
	Return Button.item
End Sub

'set the parent
Sub SetParent(p As WixElement) As WixButton
	Parent = p
	Return Me
End Sub

'set batch
Sub SetBatch(b As Int) As WixButton
	Button.SetBatch(b)
	Return Me
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

'set onicon
Sub SetOnIcon(icn As String) As WixButton
	onIcon = icn
	Return Me
End Sub

'set officon
Sub SetOffIcon(icn As String) As WixButton
	offIcon = icn
	Return Me
End Sub


'set label
Sub SetLabel(lbl As String) As WixButton
	Button.Label.Text = lbl
	Button.value = lbl
	Return Me
End Sub

'set type icon button
Sub SetTypeIconButton(i As String) As WixButton 'ignore
	ButtonType = "iconButton"
	Return Me
End Sub

'set image button
Sub SetTypeImageButton(r As String) As WixButton  'ignore
	ButtonType =  "imageButton"
	Return Me
End Sub

'button type image	
Sub SetTypeImage(r As String) As WixButton  'ignore
	ButtonType = "image"
	Return Me
End Sub

'button type icon
Sub SetTypeIcon(r As String) As WixButton  'ignore
	ButtonType = "icon"
	Return Me
End Sub

'button type iconbuttontop
Sub SetTypeIconButtonTop(r As String) As WixButton  'ignore
	ButtonType = "iconButtonTop"
	Return Me
End Sub

'is danger
Sub SetTypeDanger(r As String) As WixButton  'ignore
	ButtonType = "danger"
	Return Me
End Sub

'is form
Sub SetTypeForm(r As String) As WixButton  'ignore
	ButtonType = "form"
	Return Me
End Sub

'is prev
Sub SetTypePrev(r As String) As WixButton  'ignore
	ButtonType = "prev"
	Return Me
End Sub

'is next
Sub SetTypeNext(r As String) As WixButton  'ignore
	ButtonType = "next"
	Return Me
End Sub

'set height
Sub SetHeight(h As Object) As WixButton
	Button.Height = h
	Return Me
End Sub

'set width
Sub SetWidth(w As Object) As WixButton
	Button.Width = w
	Return Me
End Sub


'set align right
Sub SetAlignRight(r As String) As WixButton 'ignore
	Button.setAlignright("")
	Return Me
End Sub

'set align center
Sub SetAlignCenter(r As String) As WixButton 'ignore
	Button.setAligncenter("")
	Return Me
End Sub

'set align left
Sub SetAlignLeft(r As String) As WixButton 'ignore
	Button.SetAlignleft("")
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