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
	Bag.AddTextBox("id","Id", "image1")
	Bag.AddCombo("view","View", "image", Page.Views)
	Bag.AddTextBox("parentid","Parent ID", "")
	Bag.AddCombo("addingmethod","Adding Method","AddRows", pgFD.addingmethod)
	Bag.AddTextBox("tabindex", "Tab Index", "0")
	Bag.AddLabel("Details")
	Bag.AddTextBox("value","Value", "")
	Bag.AddTextBox("container","Container", "")
	Bag.AddTextBox("width","Width", "")
	Bag.AddTextBox("height","Height", "")
	Bag.AddCheckBox("borderless","Borderless", "")
	Bag.Refresh(Page)
End Sub