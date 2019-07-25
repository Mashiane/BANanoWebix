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
	ft.AddAll(Array("","Boolean","Int", "String","Color","Object","List","Map"))
	'
	Dim pt As List
	pt.Initialize 
	pt.AddAll(Array("","Color","TextBox","Label","Password","Date","Select","Combo","RichSelect","CheckBox"))
	'
	Bag.Clear
	Bag.AddTextBox("id", "ID","property")
	Bag.AddTextBox("name", "Name","")
	Bag.AddTextBox("parentid","Parent", "wixsomething")
	Bag.AddTextBox("DisplayName","Display Name", "")
	Bag.AddCombo("controltype","Control Type","TextBox", pt)
	Bag.AddTextBox("tabindex", "Tab Index", "")
	Bag.AddCombo("FieldType","Field Type","Object", ft)
	Bag.AddTextBox("DefaultValue", "Default Value", "")
	Bag.AddTextBox("MinRange","Min Range", "0")
	Bag.AddTextBox("MaxRange", "Max Range", "100")
	Bag.AddTextBox("List", "List","")
	Bag.AddTextBox("Description", "Description","")
	Bag.AddCheckBox("hasSet", "Can Set", "")
	Bag.AddCheckBox("hasGet", "Can Get", "")
	
	Bag.AddLabel("Links")
	Bag.AddTextBox("attributeName", "Attribute","")
	Bag.AddTextBox("className", "Class","")
	Bag.AddCheckBox("conditional", "Conditional", "")
	Bag.Refresh(Page)
End Sub