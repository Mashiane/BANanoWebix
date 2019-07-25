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
	Bag.AddTextBox("id","Id", "property1")
	Bag.AddTextBox("parentid","Parent", "")
	Bag.AddCombo("addingmethod","Adding Method","AddRows", pgFD.addingmethod)
	Bag.AddTextBox("tabindex", "Tab Index", "0")
	Bag.AddLabel("Details")
	Bag.AddCombo("view","View", "property", Page.Views)
	Bag.AddCheckBox("animate","Animate", "")
	Bag.AddCheckBox("autoheight","Autoheight", "")
	Bag.AddCheckBox("borderless","Borderless", "")
	Bag.AddCheckBox("complexData","ComplexData", "")
	Bag.AddTextBox("container","Container", "")
	Bag.AddTextBox("css","Css", "")
	Bag.AddTextBox("data","Data", "")
	Bag.AddCombo("datatype", "Datatype", "", Array("","json","xml","jsarray","csv"))
	Bag.AddCheckBox("disabled","Disabled", "")
	Bag.AddTextBox("editValue","EditValue", "")
	Bag.AddCheckBox("editable","Editable", "")
	Bag.AddCombo("editaction", "Editaction", "", Array("","click","dblclick","custom"))
	Bag.AddTextBox("elements","Elements", "")
	Bag.AddTextBox("form","Form", "")
	Bag.AddTextBox("gravity","Gravity", "")
	Bag.AddCheckBox("hidden","Hidden", "")
	Bag.AddTextBox("map","Map", "")
	Bag.AddCombo("scroll", "Scroll", "", Array("","x","y","xy","auto","false","true"))
	Bag.AddTextBox("scrollSpeed","ScrollSpeed", "")
	Bag.AddTextBox("template","Template", "")
	Bag.AddTextBox("tooltip","Tooltip", "")
	Bag.AddTextBox("url","Url", "")
	Bag.AddLabel("Sizes")
	Bag.AddTextBox("height","Height", "")
	Bag.AddTextBox("maxHeight","MaxHeight", "")
	Bag.AddTextBox("maxWidth","MaxWidth", "")
	Bag.AddTextBox("minHeight","MinHeight", "")
	Bag.AddTextBox("minWidth","MinWidth", "")
	Bag.AddTextBox("width","Width", "")
	Bag.Refresh(Page)
End Sub

