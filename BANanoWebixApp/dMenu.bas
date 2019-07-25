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
	Bag.AddTextBox("id","Id", "menu1")
	Bag.AddTextBox("parentid","Parent ID", "")
	Bag.AddCombo("addingmethod","Adding Method","AddRows", pgFD.addingmethod)
	Bag.AddTextBox("tabindex", "Tab Index", "0")
	Bag.AddLabel("Details")
	Bag.AddCombo("view","View", "menu", Page.Views)
	Bag.AddCheckBox("animate","Animate", "")
	Bag.AddCheckBox("autoheight","Auto Height", "")
	Bag.AddCheckBox("autowidth","Auto Width", "")
	Bag.AddCheckBox("borderless","Borderless", "")
	Bag.AddTextBox("click","Click", "")
	Bag.AddCombo("clipboard","Clipboard", "", Array("","true","modify","inser","custom"))
	Bag.AddTextBox("container","Container", "")
	Bag.AddTextBox("css","Css", "")
	Bag.AddTextBox("data","Data", "")
	Bag.AddTextBox("datathrottle","Datathrottle", "")
	Bag.AddCheckBox("disabled","Disabled", "")
	Bag.AddTextBox("externalData","ExternalData", "")
	Bag.AddTextBox("gravity","Gravity", "")
	Bag.AddTextBox("height","Height", "")
	Bag.AddCheckBox("hidden","Hidden", "")
	Bag.AddCombo("layout","Layout", "", Array("","x","y"))
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
	Bag.AddCombo("scroll","Scroll", "",Array("","x","y","xy","auto","false"))
	Bag.AddTextBox("scrollSpeed","ScrollSpeed", "")
	Bag.AddCombo("select","Select", "", Array("true","false","multiselect"))
	Bag.AddCombo("subMenuPos", "SubMenuPos", "", Array("","top","bottom","right","left"))
	Bag.AddTextBox("submenuConfig","SubmenuConfig", "")
	Bag.AddTextBox("template","Template", "")
	Bag.AddTextBox("tooltip","Tooltip", "")
	Bag.AddCheckBox("type","Type", "")
	Bag.AddTextBox("url","Url", "")
	Bag.AddTextBox("width","Width", "")
	Bag.AddTextBox("xCount","XCount", "")
	Bag.AddTextBox("yCount","YCount", "")
	Bag.Refresh(Page)
End Sub

