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
	Bag.AddTextBox("id","Id", "layout1")
	Bag.AddTextBox("parentid","Parentid", "")
	Bag.AddCombo("addingmethod","Adding Method","AddRows", pgFD.addingmethod)
	Bag.AddTextBox("tabindex", "Tab Index", "0")
	Bag.AddLabel("Details")
	Bag.AddCombo("view","View", "layout", Page.Views)
	Bag.AddCombo("type", "Type", "", Array("","line","clean","wide","space","form"))
	Bag.AddCheckBox("animate","Animate", "")
	Bag.AddCheckBox("borderless","Borderless", "")
	Bag.AddTextBox("container","Container", "")
	Bag.AddTextBox("css","Css", "")
	Bag.AddTextBox("gravity","Gravity", "")
	Bag.AddCheckBox("disabled","Disabled", "")
	Bag.AddCheckBox("hidden","Hidden", "")
	Bag.AddCheckBox("isolate","Isolate", "")
	Bag.AddTextBox("margin","Margin", "")
	Bag.AddTextBox("padding","Padding", "")
	Bag.AddCheckBox("responsive","Responsive", "")
	Bag.AddTextBox("visibleBatch","VisibleBatch", "")
	Bag.AddLabel("Size")
	Bag.AddTextBox("height","Height", "")
	Bag.AddTextBox("width","Width", "")
	Bag.AddTextBox("maxHeight","MaxHeight", "")
	Bag.AddTextBox("minHeight","MinHeight", "")
	Bag.AddTextBox("minWidth","MinWidth", "")
	Bag.AddTextBox("maxWidth","MaxWidth", "")
	Bag.AddTextBox("paddingX","PaddingX", "")
	Bag.AddTextBox("paddingY","PaddingY", "")
	Bag.Refresh(Page)
End Sub

