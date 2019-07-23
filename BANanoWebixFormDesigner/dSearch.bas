﻿B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.51
@EndOfDesignText@
'Static code module
Sub Process_Globals
End Sub

Sub BuildBag(Page As WixPage, Bag As WixProperty)
	Dim align As List
	align.Initialize
	align.AddAll(Array("","left","right"))
	'
	Dim pos As List
	pos.Initialize
	pos.AddAll(Array("","left","top"))
	
	Dim ve As List
	ve.Initialize
	ve.AddAll(Array("","blur", "key"))
	'
	Dim v As List
	v.Initialize
	v.AddAll(Array("isNotEmpty","isNumber","isEmail"))
	'
	Bag.Clear
	Bag.AddTextBox("id", "ID","search1")
	Bag.AddTextBox("localId", "Local ID", "")
	Bag.AddLabel("Parent")
	Bag.AddTextBox("parentid","Parent", "form")
	Bag.AddCombo("addingmethod","Adding Method","AddRows", pgFormDesigner.addingmethod)
	Bag.AddTextBox("tabindex", "Tab Index", "0")
	Bag.AddCombo("view","View", "search", Page.views)
	Bag.AddLabel("Details")
	Bag.AddTextBox("value", "Value","")
	Bag.AddTextBox("name", "Name","")
	Bag.AddTextBox("placeholder", "PlaceHolder","")
	Bag.AddTextBox("tooltip", "Tooltip","")
	Bag.AddTextBox("batch", "Batch","")
	Bag.AddLabel("Label")
	Bag.AddTextBox("label","Text","Search 1")
	Bag.AddTextBox("labelWidth","Width","")
	Bag.AddTextBox("labelHeight","Height","")
	Bag.AddCombo("labelAlign","Align","",align)
	Bag.AddCombo("labelPosition","Position","",pos)
	Bag.AddLabel("Size")
	Bag.AddTextBox("width","Width","")
	Bag.AddTextBox("height","Height","")
	Bag.AddLabel("Validation")
	Bag.AddCheckBox("required", "Required", "")
	Bag.AddCombo("validate", "Validate", "", v)
	Bag.AddTextBox("invalidMessage", "Invalid Message","")
	Bag.AddCombo("validateEvent", "Validate Event", "", ve)
	Bag.AddTextBox("bottomLabel", "Bottom Label", "")
	Bag.AddTextBox("bottomPadding", "Bottom Padding", "")
	'Bag.AddLabel("Event")
	'Bag.AddTextBox("click","On Click","BANano.CallBack(Me,button1_click,Null)")
	
	Bag.Refresh(Page)
End Sub