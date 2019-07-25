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
	Bag.AddTextBox("id", "ID","segmented1")
	Bag.AddTextBox("localId", "Local ID", "")
	Bag.AddLabel("Parent")
	Bag.AddTextBox("parentid","Parent", "form")
	Bag.AddCombo("addingmethod","Adding Method","AddRows", pgFD.addingmethod)
	Bag.AddTextBox("tabindex", "Tab Index", "0")
	Bag.AddCombo("view","View", "segmented", Page.views)
	Bag.AddLabel("Details")
	Bag.AddTextBox("value", "Value","")
	Bag.AddTextBox("name", "Name","")
	Bag.AddTextBox("tooltip", "Tooltip","")
	Bag.AddTextBox("batch", "Batch","")
	Bag.AddCombo("align", "Align", "", Array("","left","center","right"))
	Bag.AddCombo("inputAlign", "InputAlign", "", Array("","left","right"))
	Bag.AddCheckBox("animate","Animate", "")
	Bag.AddTextBox("attributes","Attributes", "")
	Bag.AddCheckBox("borderless","Borderless", "")
	Bag.AddTextBox("container","Container", "")
	Bag.AddTextBox("css","Css", "")
	Bag.AddCheckBox("disabled","Disabled", "")
	Bag.AddTextBox("format","Format", "")
	Bag.AddTextBox("gravity","Gravity", "")
	Bag.AddTextBox("height","Height", "")
	Bag.AddCheckBox("hidden","Hidden", "")
	Bag.AddTextBox("hotkey","Hotkey", "")
	Bag.AddCheckBox("multiview","Multiview", "")
	Bag.AddTextBox("popup","Popup", "")
	Bag.AddTextBox("relatedAction","RelatedAction", "")
	Bag.AddTextBox("relatedView","RelatedView", "")
	Bag.AddCheckBox("required","Required", "")
	Bag.AddTextBox("suggest","Suggest", "")
	
	'
	Bag.AddLabel("Label")
	Bag.AddTextBox("label","Text","")
	Bag.AddTextBox("labelWidth","Width","")
	Bag.AddTextBox("labelHeight","Height","")
	Bag.AddCombo("labelAlign","Align","",align)
	Bag.AddCombo("labelPosition","Position","",pos)
	'
	Bag.AddLabel("Options")
	Bag.AddTextBox("optionsid","IDs", "1,2,3")
	Bag.AddTextBox("optionstext","Values", "One,Two,Three")
	Bag.AddTextBox("optionWidth","OptionWidth", "")

	Bag.AddTextBox("bottomLabel","BottomLabel", "")
	Bag.AddTextBox("bottomPadding","BottomPadding", "")

	Bag.AddLabel("Size")
	Bag.AddTextBox("inputHeight","InputHeight", "")
	Bag.AddTextBox("inputWidth","InputWidth", "")
	Bag.AddTextBox("width","Width","")
	Bag.AddTextBox("height","Height","")
	Bag.AddTextBox("maxHeight","MaxHeight", "")
	Bag.AddTextBox("maxWidth","MaxWidth", "")
	Bag.AddTextBox("minHeight","MinHeight", "")
	Bag.AddTextBox("minWidth","MinWidth", "")
	'
	Bag.AddLabel("Validation")
	Bag.AddCombo("validate", "Validate", "", Array("","isNotEmpty","isNumber","isEmail"))
	Bag.AddCombo("validateEvent", "ValidateEvent", "", Array("","blur","key"))
	Bag.AddTextBox("invalidMessage","InvalidMessage", "")

	Bag.AddLabel("Event")
	Bag.AddTextBox("click","On Click","BANano.CallBack(Me,button1_click,Null)")
	
	Bag.Refresh(Page)
End Sub
