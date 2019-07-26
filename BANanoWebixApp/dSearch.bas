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
	Bag.AddTextBox("name", "Name","")
	Bag.AddTextBox("value", "Value","")
	Bag.AddLabel("Parent")
	Bag.AddTextBox("parentid","Parent", "form")
	Bag.AddCombo("addingmethod","Adding Method","AddRows", pgFD.addingmethod)
	Bag.AddTextBox("tabindex", "Tab Index", "0")
	Bag.AddCombo("view","View", "search", Page.views)
	Bag.AddCombo("type", "Type", "", Array("","htmlbutton","image","imageTop","icon","iconTop"))
	Bag.AddLabel("Details")
	Bag.AddTextBox("placeholder", "PlaceHolder","")
	Bag.AddTextBox("tooltip", "Tooltip","")
	Bag.AddTextBox("batch", "Batch","")
	Bag.AddCheckBox("animate","Animate", "")
	Bag.AddCombo("align", "Align", "", Array("","left","center","right"))
	Bag.AddTextBox("attributes","Attributes", "")
	Bag.AddCheckBox("autowidth","Autowidth", "")
	Bag.AddCheckBox("borderless","Borderless", "")
	Bag.AddTextBox("container","Container", "")
	Bag.AddTextBox("css","Css", "")
	Bag.AddCheckBox("disabled","Disabled", "")
	Bag.AddTextBox("format","Format", "")
	Bag.AddTextBox("gravity","Gravity", "")
	Bag.AddCheckBox("hidden","Hidden", "")
	Bag.AddTextBox("hotkey","Hotkey", "")
	Bag.AddTextBox("icon","Icon", "")
	Bag.AddTextBox("pattern","Pattern", "")
	Bag.AddTextBox("popup","Popup", "")
	Bag.AddCheckBox("readonly","Readonly", "")
	Bag.AddTextBox("relatedAction","RelatedAction", "")
	Bag.AddTextBox("relatedView","RelatedView", "")
	Bag.AddCheckBox("required","Required", "")
	Bag.AddTextBox("suggest","Suggest", "")

	Bag.AddLabel("Label")
	Bag.AddTextBox("label","Text","Search 1")
	Bag.AddTextBox("labelWidth","Width","")
	Bag.AddTextBox("labelHeight","Height","")
	Bag.AddCombo("labelAlign","Align","",align)
	Bag.AddCombo("labelPosition","Position","",pos)
	Bag.AddLabel("Size")
	Bag.AddTextBox("width","Width","")
	Bag.AddTextBox("height","Height","")
	Bag.AddTextBox("inputHeight","InputHeight", "")
	Bag.AddTextBox("inputWidth","InputWidth", "")
	Bag.AddCombo("inputAlign", "InputAlign", "", Array("","left","right"))
	Bag.AddTextBox("maxHeight","MaxHeight", "")
	Bag.AddTextBox("maxWidth","MaxWidth", "")
	Bag.AddTextBox("minHeight","MinHeight", "")
	Bag.AddTextBox("minWidth","MinWidth", "")

	Bag.AddLabel("Validation")
	Bag.AddCheckBox("required", "Required", "")
	Bag.AddLabel("Validation")
	Bag.AddCombo("validate", "Validate", "", v)
	Bag.AddTextBox("invalid","Invalid", "")
	Bag.AddTextBox("invalidMessage", "Invalid Message","")
	Bag.AddCombo("validateEvent", "Validate Event", "", ve)
	Bag.AddTextBox("bottomLabel", "Bottom Label", "")
	Bag.AddTextBox("bottomPadding", "Bottom Padding", "")
	Bag.AddLabel("Event")
	Bag.AddTextBox("click","On Click","BANano.CallBack(Me,button1_click,Null)")
	
	Bag.Refresh(Page)
End Sub
