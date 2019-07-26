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
	Bag.AddTextBox("id", "ID","icon1")
	Bag.AddTextBox("localId", "Local ID", "")
	Bag.AddTextBox("name", "Name","")
	Bag.AddTextBox("value", "Value","")
	Bag.AddLabel("Parent")
	Bag.AddTextBox("parentid","Parent", "form")
	Bag.AddCombo("addingmethod","Adding Method","AddRows", pgFD.addingmethod)
	Bag.AddTextBox("tabindex", "Tab Index", "0")
	Bag.AddCombo("view","View", "icon", Page.views)
	Bag.AddLabel("Details")
	Bag.AddTextBox("icon", "Icon","mdi mdi-account")
	Bag.AddTextBox("batch", "Batch","")
	Bag.AddTextBox("badge", "Badge","")
	Bag.AddTextBox("tooltip", "Tooltip","")
	Bag.AddCombo("align","Align", "", Array("","left","center","right"))
	Bag.AddCheckBox("animate","Animate", "")
	Bag.AddCheckBox("autowidth","Auto Width", "")
	Bag.AddCheckBox("borderless","Borderless", "")
	Bag.AddTextBox("container","Container", "")
	Bag.AddTextBox("css","Css", "")
	Bag.AddCheckBox("disabled","Disabled", "")
	Bag.AddTextBox("gravity","Gravity", "")
	Bag.AddCheckBox("hidden","Hidden", "")
	Bag.AddTextBox("hotkey","Hotkey", "")
	Bag.AddTextBox("inputHeight","Input Height", "")
	Bag.AddTextBox("inputWidth","Input Width", "")
	Bag.AddTextBox("maxHeight","Max Height", "")
	Bag.AddTextBox("maxWidth","Max Width", "")
	Bag.AddTextBox("minHeight","Min Height", "")
	Bag.AddTextBox("minWidth","Min Width", "")
	Bag.AddTextBox("popup","Popup", "")
	Bag.AddLabel("Size")
	Bag.AddTextBox("width","Width","")
	Bag.AddTextBox("height","Height","")
	Bag.AddLabel("Event")
	Bag.AddTextBox("click","On Click","BANano.CallBack(Me,button1_click,Null)")
	Bag.Refresh(Page)
End Sub