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
	Dim bType As List
	bType.Initialize
	bType.AddAll(Array("","icon", "iconTop","image","imageTop","htmlbutton"))
	'
	Bag.Clear
	Bag.AddTextBox("id", "ID","toggle1")
	Bag.AddTextBox("localId", "Local ID", "")
	Bag.AddLabel("Parent")
	Bag.AddTextBox("parentid","Parent", "form")
	Bag.AddCombo("addingmethod","Adding Method","AddRows", pgFD.addingmethod)
	Bag.AddTextBox("tabindex", "Tab Index", "0")
	Bag.AddCombo("view","View", "toggle", Page.views)
	Bag.AddCombo("type","Type","icon", bType)
	Bag.AddLabel("Details")
	Bag.AddTextBox("value", "Value","")
	Bag.AddTextBox("name", "Name","")
	Bag.AddTextBox("tooltip", "Tooltip","")
	Bag.AddTextBox("icon", "Icon","")
	Bag.AddTextBox("image", "Image","")
	Bag.AddTextBox("batch", "Batch","")
	Bag.AddCombo("align", "Align", "", Array("","left","center","right"))
	Bag.AddCheckBox("animate","Animate", "")
	Bag.AddCheckBox("autowidth","Autowidth", "")
	Bag.AddCheckBox("borderless","Borderless", "")
	Bag.AddTextBox("container","Container", "")
	Bag.AddTextBox("css","Css", "")
	Bag.AddCheckBox("disabled","Disabled", "")
	Bag.AddTextBox("gravity","Gravity", "")
	Bag.AddCheckBox("hidden","Hidden", "")
	Bag.AddTextBox("hotkey","Hotkey", "")
	Bag.AddTextBox("popup","Popup", "")

	'
	Bag.AddLabel("Label")
	Bag.AddTextBox("label","Text","Toggle 1")
	Bag.AddTextBox("labelWidth","Width","")
	Bag.AddTextBox("labelHeight","Height","")
	Bag.AddCombo("labelAlign","Align","",align)
	Bag.AddCombo("labelPosition","Position","",pos)
	Bag.AddLabel("Options")
	Bag.AddTextBox("onLabel","On Label", "ON")
	Bag.addtextbox("offLabel", "Off Label", "OFF")
	Bag.AddTextBox("onIcon","On Icon","mdi mdi-play")
	Bag.AddTextBox("offIcon","Off Icon","mdi mdi-pause")
	
	Bag.AddLabel("Size")
	Bag.AddTextBox("width","Width","100")
	Bag.AddTextBox("height","Height","")
	Bag.AddTextBox("inputHeight","InputHeight", "")
	Bag.AddTextBox("inputWidth","InputWidth", "")
	Bag.AddTextBox("maxHeight","MaxHeight", "")
	Bag.AddTextBox("maxWidth","MaxWidth", "")
	Bag.AddTextBox("minHeight","MinHeight", "")
	Bag.AddTextBox("minWidth","MinWidth", "")

	'
	Bag.AddLabel("Event")
	Bag.AddTextBox("click","Click", "")
	Bag.Refresh(Page)
End Sub
