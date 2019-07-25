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
	Bag.AddCombo("view","View", "toolbar", Page.Views)
	Bag.AddTextBox("container","Container", "")
	Bag.AddCheckBox("borderless","Borderless", "")
	Bag.AddTextBox("gravity","Gravity", "")
	Bag.AddTextBox("height","Height", "")
	Bag.AddTextBox("width","Width", "")
	Bag.AddTextBox("padding","Padding", "")
	Bag.AddTextBox("margin","Margin", "")
	Bag.AddCheckBox("hidden","Hidden", "")
	Bag.AddCheckBox("isolate","Isolate", "")
	Bag.AddTextBox("maxHeight","Max Height", "")
	Bag.AddTextBox("maxWidth","Max Width", "")
	Bag.AddTextBox("minHeight","Min Height", "")
	Bag.AddTextBox("minWidth","Min Width", "")
	Bag.AddTextBox("paddingX","Padding X", "")
	Bag.AddTextBox("paddingY","Padding Y", "")
	Bag.AddCheckBox("responsive","Responsive", "")
	Bag.AddCombo("scroll", "Scroll", "", Array("","x","y","xy","false"))
	Bag.AddTextBox("visibleBatch","VisibleBatch", "")
	Bag.Refresh(Page)
End Sub