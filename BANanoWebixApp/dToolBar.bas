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
	Bag.AddTextBox("id","Id", "toolbar1")
	Bag.AddTextBox("parentid","Parentid", "")
	Bag.AddCombo("addingmethod","Adding Method","AddRows", pgFD.addingmethod)
	Bag.AddTextBox("tabindex", "Tab Index", "0")
	Bag.AddLabel("Details")
	Bag.AddCombo("view","View", "toolbar", Page.Views)
	Bag.AddCombo("type", "Type", "", Array("","line","clean","wide","space","form"))
	Bag.AddCheckBox("animate","Animate", "")
	Bag.AddCheckBox("borderless","Borderless", "")
	Bag.AddTextBox("cols","Cols", "")
	Bag.AddTextBox("rows","Rows", "")
	Bag.AddCheckBox("complexData","ComplexData", "")
	Bag.AddTextBox("container","Container", "")
	Bag.AddTextBox("css","Css", "")
	Bag.AddTextBox("data","Data", "")
	Bag.AddTextBox("dataFeed","DataFeed", "")
	Bag.AddCombo("datatype", "Datatype", "", Array("","json","xml","jsarray","csv"))
	Bag.AddCheckBox("disabled","Disabled", "")
	Bag.AddTextBox("elements","Elements", "")
	Bag.AddCheckBox("hidden","Hidden", "")
	Bag.AddCheckBox("isolate","Isolate", "")
	Bag.AddTextBox("margin","Margin", "")
	Bag.AddCheckBox("responsive","Responsive", "")
	Bag.AddCombo("scroll", "Scroll", "", Array("","x","y","xy","false"))
	Bag.AddTextBox("visibleBatch","VisibleBatch", "")
	Bag.AddCombo("scroll", "Scroll", "", Array("","x","y","xy","auto","false","true"))
	Bag.AddTextBox("scrollSpeed","ScrollSpeed", "")
	Bag.AddTextBox("url","Url", "")
	Bag.AddTextBox("gravity","Gravity", "")
	Bag.AddTextBox("padding","Padding", "")
	'
	Bag.addlabel("Sizes")
	Bag.AddTextBox("height","Height", "")
	Bag.AddTextBox("width","Width", "")
	Bag.AddTextBox("maxHeight","Max Height", "")
	Bag.AddTextBox("maxWidth","Max Width", "")
	Bag.AddTextBox("minHeight","Min Height", "")
	Bag.AddTextBox("minWidth","Min Width", "")
	Bag.AddTextBox("paddingX","Padding X", "")
	Bag.AddTextBox("paddingY","Padding Y", "")
	Bag.Refresh(Page)
End Sub