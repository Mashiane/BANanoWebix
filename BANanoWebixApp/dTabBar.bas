B4J=true
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
	Bag.AddTextBox("localId", "Local ID", "")
	Bag.AddTextBox("name", "Name","")
	Bag.AddTextBox("value", "Value","2")
	'	
	Bag.AddLabel("Parent")
	Bag.AddTextBox("parentid","Parent", "form")
	Bag.AddCombo("addingmethod","Adding Method","AddRows", pgFD.addingmethod)
	Bag.AddTextBox("tabindex", "Tab Index", "0")
	Bag.AddCombo("view","View", "tabbar", Page.views)
	Bag.AddCombo("type", "Type", "", Array("","bottom"))
	'	
	Bag.AddLabel("Details")
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
	Bag.AddCheckBox("hidden","Hidden", "")
	Bag.AddTextBox("hotkey","Hotkey", "")
	Bag.AddTextBox("moreTemplate","MoreTemplate", "")
	Bag.AddCheckBox("multiview","Multiview", "")
	Bag.AddTextBox("placeholder","Placeholder", "")
	Bag.AddTextBox("popup","Popup", "")
	Bag.AddTextBox("popupTemplate","PopupTemplate", "")
	Bag.AddCheckBox("readonly","Readonly", "")
	Bag.AddTextBox("relatedAction","RelatedAction", "")
	Bag.AddTextBox("relatedView","RelatedView", "")
	Bag.AddTextBox("suggest","Suggest", "")
	Bag.AddTextBox("tabbarPopup","TabbarPopup", "")
	Bag.AddTextBox("tooltip","Tooltip", "")
	Bag.AddTextBox("yCount","YCount", "")
	
	Bag.AddTextBox("icon", "Icon","")
	Bag.AddTextBox("batch", "Batch","")
	Bag.AddCheckBox("fitBiggest", "Fit Biggest", "")
	Bag.AddCheckBox("bottom", "Bottom", "")
	Bag.AddCheckBox("keepViews", "Keep Views", "")
	
	
	Bag.AddLabel("Size")
	Bag.AddTextBox("width","Width","")
	Bag.AddTextBox("height","Height","")
	Bag.AddTextBox("inputHeight","InputHeight", "")
	Bag.AddTextBox("inputWidth","InputWidth", "")
	Bag.AddTextBox("maxHeight","MaxHeight", "")
	Bag.AddTextBox("maxWidth","MaxWidth", "")
	Bag.AddTextBox("minHeight","MinHeight", "")
	Bag.AddTextBox("minWidth","MinWidth", "")
	Bag.AddTextBox("tabMinWidth","TabMinWidth", "")
	Bag.AddTextBox("tabMoreWidth","TabMoreWidth", "")
	Bag.AddTextBox("tabOffset","TabOffset", "")
	Bag.AddTextBox("popupWidth","PopupWidth", "")
	Bag.AddTextBox("tabMargin","TabMargin", "")
	Bag.AddTextBox("topOffset","TopOffset", "")

	Bag.AddLabel("Options")
	Bag.AddTextBox("optionsid","IDs", "1,2,3")
	Bag.AddTextBox("optionstext","Values", "One,Two,Three")
	Bag.AddTextBox("optionWidth","OptionWidth", "")
	'
	Bag.AddLabel("Label")
	Bag.AddTextBox("label","Text","")
	Bag.AddTextBox("labelWidth","Width","")
	Bag.AddTextBox("labelHeight","Height","")
	Bag.AddCombo("labelAlign","Align","",align)
	Bag.AddCombo("labelPosition","Position","",pos)
	'
	Bag.AddLabel("Validation")
	Bag.AddCheckBox("required","Required", "")
	Bag.AddCombo("validate", "Validate", "", Array("","isNotEmpty","isNumber","isEmail"))
	Bag.AddTextBox("invalid","Invalid", "")
	Bag.AddTextBox("invalidMessage","InvalidMessage", "")
	Bag.AddCombo("validateEvent", "ValidateEvent", "", Array("","blur","key"))
	Bag.AddTextBox("bottomLabel","BottomLabel", "")
	Bag.AddTextBox("bottomOffset","BottomOffset", "")
	Bag.AddTextBox("bottomPadding","BottomPadding", "")
	
	Bag.AddLabel("Event")
	Bag.AddTextBox("click","On Click","BANano.CallBack(Me,button1_click,Null)")
	
	Bag.Refresh(Page)
End Sub

