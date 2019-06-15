B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Section As WixElement
End Sub

'initialize the input box
Public Sub Initialize(iID As String) As WixSection
	ID = iID.tolowercase
	Section.Initialize(iID)
	Section.TypeOf = "section"
	Return Me
End Sub

'return the item
Sub Item As Map
	Return Section.item
End Sub

'set template
Sub SetTemplate(t As String) As WixSection
	Section.Template = t
	Return Me
End Sub

'set value
Sub SetValue(v As String) As WixSection
	Section.Value = v
	Return Me
End Sub

'set label
Sub SetLabel(l As String) As WixSection
	Section.Label.Text = l
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
