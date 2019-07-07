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
	'
	Bag.Clear
	Bag.AddLabel("Parent")
	Bag.AddTextBox("parentid","Parent", "form")
	Bag.AddLabel("View")
	Bag.AddTextBox("view","View", "uploader")
	Bag.AddLabel("Details")
	Bag.AddTextBox("id", "ID","upload")
	Bag.AddTextBox("value", "Value","")
	Bag.AddTextBox("name", "Name","upload")
	Bag.AddTextBox("inputName", "Input Name", "upload")
	Bag.AddTextBox("tooltip", "Tooltip","")
	Bag.AddTextBox("batch", "Batch","")
	Bag.AddLabel("Options")
	Bag.AddCheckBox("apiOnly", "API Only", "")
	Bag.AddTextBox("datatype", "Data Type", "json")
	Bag.AddCheckBox("multiple","Multiple", "")
	Bag.AddCheckBox("autosend", "Auto Send", "")
	Bag.AddTextBox("link", "Link","")
	Bag.AddTextBox("accept", "Accept", "")
	Bag.AddTextBox("upload", "Upload", "")
	Bag.AddCheckBox("autowidth", "Auto width ","")
	Bag.AddLabel("Size")
	Bag.AddTextBox("width","Width","")
	Bag.AddTextBox("height","Height","")
	Bag.AddLabel("Label")
	Bag.AddTextBox("label","Text","Uploader 1")
	Bag.AddTextBox("labelWidth","Width","")
	Bag.AddTextBox("labelHeight","Height","")
	Bag.AddCombo("labelAlign","Align","",align)
	Bag.AddCombo("labelPosition","Position","",pos)
	'Bag.AddLabel("Event")
	'Bag.AddTextBox("click","On Click","BANano.CallBack(Me,button1_click,Null)")
	
	Bag.Refresh(Page)
End Sub