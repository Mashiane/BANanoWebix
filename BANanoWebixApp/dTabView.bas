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
	Bag.AddTextBox("id","Id", "tabview1")
	Bag.AddTextBox("parentid","Parent", "")
	Bag.AddCombo("addingmethod","Adding Method","AddRows", pgFD.addingmethod)
	Bag.AddTextBox("tabindex", "Tab Index", "0")
	Bag.AddLabel("Details")
	Bag.AddCombo("view","View", "tabview", Page.Views)
	Bag.AddCombo("type", "Type", "", Array("","line","clean","wide","space","form"))
	Bag.AddCheckBox("animate","Animate", "")
	Bag.AddCheckBox("borderless","Borderless", "")
	Bag.AddTextBox("cells","Cells", "")
	Bag.AddTextBox("container","Container", "")
	Bag.AddTextBox("css","Css", "")
	Bag.AddCheckBox("disabled","Disabled", "")
	Bag.AddTextBox("gravity","Gravity", "")
	Bag.AddCheckBox("hidden","Hidden", "")
	Bag.AddTextBox("multiview","Multiview", "")
	Bag.AddTextBox("tabbar","Tabbar", "")
	Bag.AddLabel("Sizes")
	Bag.AddTextBox("height","Height", "")
	Bag.AddTextBox("width","Width", "")
	Bag.AddTextBox("maxHeight","MaxHeight", "")
	Bag.AddTextBox("maxWidth","MaxWidth", "")
	Bag.AddTextBox("minHeight","MinHeight", "")
	Bag.AddTextBox("minWidth","MinWidth", "")
	Bag.AddTextBox("padding","Padding", "")
	Bag.AddTextBox("paddingX","PaddingX", "")
	Bag.AddTextBox("paddingY","PaddingY", "")
	Bag.Refresh(Page)
End Sub

