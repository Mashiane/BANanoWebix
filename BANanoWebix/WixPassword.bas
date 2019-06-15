B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Password As WixTextBox
End Sub

'Initializes the element
Public Sub Initialize(tID As String) As WixPassword
	Password.Initialize(tID)
	Password.SetType("password")
	Return Me
End Sub

'return the item
Sub Item As Map
	Return Password.Item
End Sub


'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'add to toolbar
Sub AddToToolbar(tblB As WixToolBar)
	tblB.AddItem(Item)
End Sub


'set the html attribute
Sub SetMaxLength(ml As Int) As WixPassword
	Password.SetMaxLength(ml)
	Return Me
End Sub

'set the placeholder
Sub SetPlaceHolder(ph As String) As WixPassword
	Password.SetPlaceHolder(ph)
	Return Me
End Sub

'set the label
Sub SetLabel(lbl As String) As WixPassword
	Password.SetLabel(lbl)
	Return Me
End Sub

'set the width
Sub SetWidth(w As Int) As WixPassword
	Password.SetWidth(w)
	Return Me
End Sub

'set the height
Sub SetHeight(h As Int) As WixPassword
	Password.SetHeight(h)
	Return Me
End Sub

'set alignment
Sub SetAlign(a As String) As WixPassword
	Password.SetAlign(a)
	Return Me
End Sub


'set label align
Sub SetLabelAlign(a As String) As WixPassword
	Password.SetLabelAlign(a)
	Return Me
End Sub

'set label position
Sub SetLabelPosition(p As String) As WixPassword
	Password.SetLabelPosition(p)
	Return Me
End Sub

'set label width
Sub SetLabelWidth(w As Int) As WixPassword
	Password.SetLabelWidth(w)
	Return Me
End Sub

