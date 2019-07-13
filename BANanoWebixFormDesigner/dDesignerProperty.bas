B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.51
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private fx As JFX
End Sub

Sub BuildBag(Page As WixPage, Bag As WixProperty)
	Dim ft As List
	ft.Initialize
	ft.AddAll(Array("","Boolean","Int", "String","Color"))
	'
	Bag.Clear
	Bag.AddTextBox("Key", "Key","")
	Bag.AddLabel("Parent")
	Bag.AddTextBox("parentid","Parent", "form")
	Bag.AddLabel("Designer Property")
	Bag.AddTextBox("DisplayName","Display Name", "")
	Bag.AddCombo("FieldType","Field Type","AddRows", ft)
	Bag.AddTextBox("DefaultValue", "Default Value", "")
	Bag.AddTextBox("MinRange","Min Range", "0")
	Bag.AddTextBox("MaxRange", "Max Range", "100")
	Bag.AddTextBox("List", "List","Sunday|Monday|Tuesday")
	Bag.AddTextBox("Description", "Description","")
	Bag.AddCheckBox("hasSet", "Can Set", True)
	Bag.AddCheckBox("hasGet", "Can Get", True)
	Bag.AddLabel("Links")
	Bag.AddTextBox("attributeName", "Attribute","")
	Bag.AddTextBox("className", "Class","")
	Bag.AddCheckBox("conditional", "Conditional", True)
	Bag.Refresh(Page)
End Sub