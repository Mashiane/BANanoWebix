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
	Bag.AddTextBox("id","Id", "unitlist1")
	Bag.AddTextBox("parentid","Parent", "")
	Bag.AddCombo("addingmethod","Adding Method","AddRows", pgFD.addingmethod)
	Bag.AddTextBox("tabindex", "Tab Index", "0")
	Bag.AddLabel("Details")
	Bag.AddCombo("view","View", "unitlist", Page.Views)
	Bag.AddCheckBox("animate","Animate", "")
	Bag.AddCheckBox("autoheight","Autoheight", "")
	Bag.AddCheckBox("autowidth","Autowidth", "")
	Bag.AddCheckBox("borderless","Borderless", "")
	Bag.AddTextBox("click","Click", "")
	Bag.AddTextBox("clipboard","Clipboard", "")
	Bag.AddTextBox("container","Container", "")
	Bag.AddTextBox("css","Css", "")
	Bag.AddTextBox("data","Data", "")
	Bag.AddTextBox("datathrottle","Datathrottle", "")
	Bag.AddCheckBox("disabled","Disabled", "")
	Bag.AddCombo("datatype", "Datatype", "", Array("","json","xml","jsarray","csv"))
	Bag.AddCombo("drag", "Drag", "", Array("","true","order","move","inner","source","target","false"))
	Bag.AddCombo("dragscroll", "Dragscroll", "", Array("","x","y","xy","false","true"))

	Bag.AddTextBox("externalData","ExternalData", "")
	Bag.AddTextBox("gravity","Gravity", "")
	Bag.AddTextBox("height","Height", "")
	Bag.AddCheckBox("hidden","Hidden", "")
	Bag.AddTextBox("maxHeight","MaxHeight", "")
	Bag.AddTextBox("maxWidth","MaxWidth", "")
	Bag.AddTextBox("minHeight","MinHeight", "")
	Bag.AddTextBox("minWidth","MinWidth", "")
	Bag.AddCheckBox("multiselect","Multiselect", "")
	Bag.AddCheckBox("navigation","Navigation", "")
	Bag.AddTextBox("pager","Pager", "")
	Bag.AddTextBox("ready","Ready", "")
	Bag.AddCheckBox("removeMissed","RemoveMissed", "")
	Bag.AddTextBox("save","Save", "")
	Bag.AddTextBox("scheme","Scheme", "")
	Bag.AddCombo("scroll", "Scroll", "", Array("","x","y","xy","auto","false","true"))
	Bag.AddTextBox("scrollSpeed","ScrollSpeed", "")
	Bag.AddCombo("select", "Select", "", Array("","true","false","multiselect"))
	Bag.AddTextBox("template","Template", "")
	Bag.AddTextBox("tooltip","Tooltip", "")
	Bag.AddTextBox("type","Type", "")
	Bag.AddTextBox("uniteBy","UniteBy", "")
	Bag.AddTextBox("url","Url", "")
	Bag.AddTextBox("width","Width", "")
	Bag.AddTextBox("xCount","XCount", "")
	Bag.AddTextBox("yCount","YCount", "")
	Bag.Refresh(Page)
End Sub

