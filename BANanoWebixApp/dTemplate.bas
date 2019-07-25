B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Process_Globals
End Sub

Sub BuildBag(Page As WixPage, Bag As WixProperty)
	Bag.Clear
	Bag.AddTextBox("id","Id", "template1")
	Bag.AddTextBox("parentid","Parent", "")
	Bag.AddCombo("addingmethod","Adding Method","AddRows", pgFD.addingmethod)
	Bag.AddTextBox("tabindex", "Tab Index", "0")
	Bag.AddLabel("Details")
	Bag.AddCombo("view","View", "template", Page.Views)
	Bag.AddCheckBox("animate","Animate", "")
	Bag.AddCheckBox("autoheight","Autoheight", "")
	Bag.AddCheckBox("borderless","Borderless", "")
	Bag.AddTextBox("container","Container", "")
	Bag.AddTextBox("content","Content", "")
	Bag.AddTextBox("css","Css", "")
	Bag.AddTextBox("data","Data", "")
	Bag.AddCombo("datatype", "Datatype", "", Array("","json","xml","jsarray","csv"))
	Bag.AddCheckBox("disabled","Disabled", "")
	Bag.AddTextBox("gravity","Gravity", "")
	Bag.AddTextBox("height","Height", "")
	Bag.AddCheckBox("hidden","Hidden", "")
	Bag.AddTextBox("maxHeight","MaxHeight", "")
	Bag.AddTextBox("maxWidth","MaxWidth", "")
	Bag.AddTextBox("minHeight","MinHeight", "")
	Bag.AddTextBox("minWidth","MinWidth", "")
	Bag.AddCombo("scroll", "Scroll", "", Array("","x","y","xy","auto","false","true"))
	Bag.AddTextBox("scrollSpeed","ScrollSpeed", "")
	Bag.AddTextBox("src","Src", "")
	Bag.AddTextBox("template","Template", "")
	Bag.AddTextBox("tooltip","Tooltip", "")
	Bag.AddTextBox("type","Type", "")
	Bag.AddTextBox("url","Url", "")
	Bag.AddTextBox("width","Width", "")
	Bag.Refresh(Page)
End Sub

