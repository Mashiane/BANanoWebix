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
	Bag.AddTextBox("view","View", "richtext")
	Bag.AddTextBox("parentid","Parent ID", "parent")
	Bag.AddCombo("addingmethod","Adding Method","AddRows", pgFD.addingmethod)
	Bag.AddTextBox("tabindex", "Tab Index", "0")
	Bag.AddLabel("Details")
	Bag.AddTextBox("name","Name", "")
	Bag.AddTextBox("label","Label", "")
	Bag.AddTextBox("value","Value", "")
	Bag.AddTextBox("container","Container", "")
	Bag.AddTextBox("placeholder","Place Holder", "")
	Bag.AddCheckBox("required","Required", "")
	Bag.AddTextBox("batch","Batch", "")
	Bag.AddCheckBox("borderless","Borderless", "")
	Bag.AddTextBox("padding","Padding", "")
	Bag.AddTextBox("css","Css", "")
	Bag.addlabel("Label")
	Bag.AddCombo("labelAlign", "Label Align", "", Array("left","right"))
	Bag.AddTextBox("labelWidth","Label Width", "")
	Bag.AddCombo("labelPosition", "Label Position", "", Array("left","top"))
	Bag.AddLabel("Size")
	Bag.AddTextBox("height","Height", "")
	Bag.AddTextBox("width","Width", "")
	Bag.AddCheckBox("autoheight","Auto Height", "")
	Bag.AddCheckBox("autowidth","Auto Width", "")
	Bag.AddCheckBox("responsive","Responsive", "")
	Bag.AddCheckBox("hidden","Hidden", "")
	
	Bag.Refresh(Page)
End Sub

