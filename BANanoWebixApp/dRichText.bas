B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.51
@EndOfDesignText@

Sub Process_Globals
End Sub

Sub BuildBag(Page As WixPage, Bag As WixProperty)
	Bag.Clear
	Bag.AddTextBox("id","Id", "richtext1")
	Bag.AddTextBox("localId","Local Id", "")
	Bag.AddTextBox("name","Name", "")
	Bag.AddTextBox("value","Value", "")
	Bag.addLabel("Parent")
	Bag.AddTextBox("parentid","Parent ID", "parent")
	Bag.AddCombo("addingmethod","Adding Method","AddRows", pgFD.addingmethod)
	Bag.AddTextBox("tabindex", "Tab Index", "0")
	Bag.AddLabel("Details")
	Bag.AddTextBox("view","View", "richtext")
	Bag.AddCombo("type", "Type", "", Array("","line","clean","wide","space","form"))
	Bag.AddCheckBox("animate","Animate", "")
	Bag.AddTextBox("label","Label", "")
	Bag.AddTextBox("container","Container", "")
	Bag.AddTextBox("placeholder","Place Holder", "")
	Bag.AddCheckBox("required","Required", "")
	Bag.AddTextBox("batch","Batch", "")
	Bag.AddCheckBox("borderless","Borderless", "")
	Bag.AddTextBox("padding","Padding", "")
	Bag.AddTextBox("css","Css", "")
	Bag.AddCheckBox("disabled","Disabled", "")
	Bag.AddTextBox("gravity","Gravity", "")
	Bag.AddCheckBox("hidden","Hidden", "")
	Bag.AddTextBox("paddingX","PaddingX", "")
	Bag.AddTextBox("paddingY","PaddingY", "")
	Bag.AddCombo("labelAlign", "Label Align", "", Array("left","right"))
	Bag.AddTextBox("labelWidth","Label Width", "")
	Bag.AddCombo("labelPosition", "Label Position", "", Array("left","top"))
	'
	Bag.AddLabel("Size")
	Bag.AddTextBox("height","Height", "")
	Bag.AddTextBox("width","Width", "")
	Bag.AddTextBox("maxHeight","MaxHeight", "")
	Bag.AddTextBox("maxWidth","MaxWidth", "")
	Bag.AddTextBox("minHeight","MinHeight", "")
	Bag.AddTextBox("minWidth","MinWidth", "")
	'
	Bag.Refresh(Page)
End Sub
