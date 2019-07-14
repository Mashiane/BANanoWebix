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
	Bag.AddTextBox("id", "ID","tabbar1")
	Bag.AddTextBox("localId", "Local ID", "tabbar1")
	Bag.AddLabel("Parent")
	Bag.AddTextBox("parentid","Parent", "form")
	Bag.AddCombo("addingmethod","Adding Method","AddRows", pgFormDesigner.addingmethod)
	Bag.AddTextBox("tabindex", "Tab Index", "0")
	Bag.AddLabel("View")
	Bag.AddCombo("view","View", "tabbar", Page.views)
	Bag.AddLabel("Details")
	Bag.AddTextBox("value", "Value","2")
	Bag.AddTextBox("name", "Name","")
	Bag.AddTextBox("icon", "Icon","")
	Bag.AddTextBox("tooltip", "Tooltip","")
	Bag.AddTextBox("batch", "Batch","")
	Bag.AddCheckBox("multiview", "Multi View","")
	Bag.AddCheckBox("fitBiggest", "Fit Biggest", "")
	Bag.AddCheckBox("bottom", "Bottom", "")
	Bag.AddCheckBox("animate", "Animate", "")
	Bag.AddCheckBox("keepViews", "Keep Views", "")
	Bag.AddLabel("Size")
	Bag.AddTextBox("width","Width","")
	Bag.AddTextBox("height","Height","")
	Bag.AddLabel("Options")
	Bag.AddTextBox("optionsid","IDs", "1,2,3")
	Bag.AddTextBox("optionstext","Values", "One,Two,Three")
	'Bag.AddLabel("Label")
	'Bag.AddTextBox("label","Text","")
	'Bag.AddTextBox("labelWidth","Width","")
	'Bag.AddTextBox("labelHeight","Height","")
	'Bag.AddCombo("labelAlign","Align","",align)
	'Bag.AddCombo("labelPosition","Position","",pos)
	'Bag.AddLabel("Event")
	'Bag.AddTextBox("click","On Click","BANano.CallBack(Me,button1_click,Null)")
	
	Bag.Refresh(Page)
End Sub