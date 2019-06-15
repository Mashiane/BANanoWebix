B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public DatePicker As WixElement
	Public TimePicker As Boolean
	Public Format As String
End Sub

'Initializes the date picker
Public Sub Initialize(bID As String)
	ID = bID.ToLowerCase
	DatePicker.Initialize(ID,"datepicker")
End Sub

'return the item to add
Sub Item As Map
	DatePicker.SetOnContent("format", Format)
	DatePicker.SetAttr("timepicker",TimePicker)
	Return DatePicker.item
End Sub