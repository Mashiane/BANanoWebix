B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.5
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Input As WixElement
	Public PlaceHolder As String
	Public Width As Int
	Public Align As String
	Public Value As String
	Public Label As String
	Public LabelAlign As String
	Public LabelWidth As Int
	Public LabelPosition As String
	Public TypeOf As String
End Sub

'initialize the input box
Public Sub Initialize(iID As String, iView As String)
	ID = iID.tolowercase
	Input.Initialize(iID,iView)
	TypeOf = "text"
End Sub

'return the item
Sub Item As Map
	Input.Value = Value
	Input.label.Text = Label
	Input.label.Position = LabelPosition
	Input.label.Width = LabelWidth
	Input.placeholder = PlaceHolder
	Input.Label.Align = LabelAlign
	Input.Width = Width
	Input.align = Align
	Input.typeof = TypeOf
	Return Input.item
End Sub