﻿B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
'icons http://www.entypo.com/
Sub Class_Globals
	Public ID As String
	Public Toggle As WixElement
	Public Parent As WixElement
End Sub

'Initializes the Toggle
Public Sub Initialize(bID As String) As WixToggle
	ID = bID.ToLowerCase
	Toggle.Initialize(ID).SetView("toggle")
	Parent = Null
	Return Me
End Sub


Sub SetBadge(b As Object) As WixToggle
	Toggle.SetAttr("badge", b)
	Return Me
End Sub

'set onclick event
Sub SetClick(e As BANanoObject) As WixToggle
	Toggle.SetAttr("click", e)
	Return Me
End Sub

'set name
Sub SetName(n As String) As WixToggle
	Toggle.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixToggle
	Toggle.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixToggle
	Toggle.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixToggle
	Toggle.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixToggle
	Toggle.SetMinHeight(h)
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixToggle
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		Toggle.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


'sub SetInputWidth
Sub SetInputWidth(w As Int) As WixToggle
	Toggle.SetInputWidth(w)
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixToggle
	Toggle.SetProperty("tooltip", tt)
	Return Me
End Sub

'set style
Sub SetStyle(prop As String, val As String) As WixToggle
	Toggle.SetStyle(prop,val)
	Return Me
End Sub


'set off label
Sub SetOffLabel(l As String) As WixToggle
	Toggle.SetAttr("offLabel", l)
	Return Me
End Sub

'set on label
Sub SetOnLabel(l As String) As WixToggle
	Toggle.SetAttr("onLabel", l)
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
Sub SetValue(v As String) As WixToggle
	Toggle.Value = v
	Return Me
End Sub

'return the item to add
Sub Item As Map
	Return Toggle.item
End Sub

'set the parent
Sub SetParent(p As WixElement) As WixToggle
	Parent = p
	Return Me
End Sub

'set batch
Sub SetBatch(b As Int) As WixToggle
	Toggle.SetBatch(b)
	Return Me
End Sub

'set the image
Sub SetImage(img As String) As WixToggle
	Toggle.SetAttr("image", img)
	Return Me
End Sub

'set the icon
Sub SetIcon(icn As String) As WixToggle
	Toggle.SetAttr("icon", icn)
	Return Me
End Sub

'set onicon
Sub SetOnIcon(icn As String) As WixToggle
	Toggle.SetAttr("onIcon",icn)
	Return Me
End Sub

'set officon
Sub SetOffIcon(icn As String) As WixToggle
	Toggle.SetAttr("offIcon", icn)
	Return Me
End Sub

'set label
Sub SetLabel(lbl As String) As WixToggle
	Toggle.Label.Text = lbl
	Toggle.value = lbl
	Return Me
End Sub

'set type icon Toggle
Sub SetTypeIcon(i As String) As WixToggle 'ignore
	Toggle.SetAttr("type","icon")
	Return Me
End Sub

'Toggle type image	
Sub SetTypeImage(r As String) As WixToggle  'ignore
	Toggle.SetAttr("type","image")
	Return Me
End Sub

'Toggle type iconToggletop
Sub SetTypeIconTop(r As String) As WixToggle  'ignore
	Toggle.SetAttr("type","iconTop")
	Return Me
End Sub

Sub SetTypeImageTop(r As String) As WixToggle  'ignore
	Toggle.SetAttr("type","imageTop")
	Return Me
End Sub

'set height
Sub SetHeight(h As Object) As WixToggle
	Toggle.Height = h
	Return Me
End Sub

'set width
Sub SetWidth(w As Object) As WixToggle
	Toggle.Width = w
	Return Me
End Sub


'set align right
Sub SetAlignRight(r As String) As WixToggle 'ignore
	Toggle.setAlignright("")
	Return Me
End Sub

'set align center
Sub SetAlignCenter(r As String) As WixToggle 'ignore
	Toggle.setAligncenter("")
	Return Me
End Sub

'set align left
Sub SetAlignLeft(r As String) As WixToggle 'ignore
	Toggle.SetAlignleft("")
	Return Me
End Sub

'set auto width
Sub SetAutoWidth(b As Boolean) As WixToggle 'ignore
	Toggle.SetAutoWidth(b)
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