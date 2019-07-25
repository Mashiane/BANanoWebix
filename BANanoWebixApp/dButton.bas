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
	bType.AddAll(Array("","icon", "iconTop","image", "imageTop", "htmlbutton"))
	'
	Dim css As List
	css.Initialize 
	css.addall(Array("","webix_secondary","webix_primary","webix_danger","webix_transparent"))
	'
	Dim act As List
	act.Initialize 
	act.addall(Array("","new","insert","read", "update", "delete", "getall"))
	'
	Bag.Clear
	Bag.AddTextBox("id", "ID","button1")
	Bag.AddTextBox("localId", "Local ID", "")
	Bag.AddLabel("Parent")
	Bag.AddTextBox("parentid","Parent", "form")
	Bag.AddCombo("addingmethod","Adding Method","AddRows", pgFD.addingmethod)
	Bag.AddTextBox("tabindex", "Tab Index", "0")
	Bag.AddCombo("view","View", "button", Page.Views)
	Bag.AddCombo("type","Type","", bType)
	'
	Bag.AddLabel("Details")
	Bag.AddTextBox("name", "Name","")
	Bag.AddTextBox("value", "Value","")
	
	Bag.AddCombo("align", "Align", "", Array("","left","center","right"))
	Bag.AddCheckBox("animate","Animate", "")
	Bag.AddCheckBox("autowidth","Autowidth", "")
	Bag.AddCombo("action","Action","", act)
	Bag.AddTextBox("container","Container", "")
	Bag.AddCombo("css", "CSS","", css)
	Bag.AddCheckBox("disabled","Disabled", "")
	Bag.AddTextBox("gravity","Gravity", "")
	Bag.AddTextBox("badge", "Badge","")
	Bag.AddCheckBox("borderless","Borderless", "")
	Bag.AddTextBox("tooltip", "Tooltip","")
	Bag.AddTextBox("icon", "Icon","")
	Bag.AddTextBox("image", "Image","")
	Bag.AddTextBox("batch", "Batch","")
	Bag.AddTextBox("popup", "PopUp","")
	Bag.AddTextBox("placeholder","Placeholder", "")
	Bag.AddTextBox("hotkey","Hotkey", "")
	Bag.AddCheckBox("hidden","Hidden", "")
	'
	Bag.AddLabel("Label")
	Bag.AddTextBox("label","Text","Button 1")
	Bag.AddTextBox("labelWidth","Width","")
	Bag.AddTextBox("labelHeight","Height","")
	Bag.AddCombo("labelAlign","Align","",align)
	Bag.AddCombo("labelPosition","Position","",pos)
	Bag.AddLabel("Size")
	Bag.AddTextBox("width","Width","")
	Bag.AddTextBox("height","Height","")
	Bag.AddCheckBox("autowidth", "Auto width ","")
	Bag.AddTextBox("inputHeight","InputHeight", "")
	Bag.AddTextBox("inputWidth","InputWidth", "")
	Bag.AddTextBox("maxHeight","MaxHeight", "")
	Bag.AddTextBox("maxWidth","MaxWidth", "")
	Bag.AddTextBox("minWidth","MinWidth", "")
	'
	Bag.AddLabel("Event")
	Bag.AddTextBox("click","On Click","BANano.CallBack(Me,button1_click,Null)")
	Bag.Refresh(Page)
End Sub