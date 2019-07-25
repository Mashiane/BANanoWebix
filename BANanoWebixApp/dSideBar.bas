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
	Bag.AddTextBox("id","Id", "sidebar1")
	Bag.AddTextBox("parentid","Parent", "")
	Bag.AddCombo("addingmethod","Adding Method","AddColumns", pgFD.addingmethod)
	Bag.AddTextBox("tabindex", "Tab Index", "0")
	Bag.AddLabel("Details")
	Bag.AddCombo("view","View", "sidebar", Page.Views)
	Bag.AddTextBox("activeTitle","ActiveTitle", "")
	Bag.AddCheckBox("animate","Animate", "")
	Bag.AddCheckBox("borderless","Borderless", "")
	Bag.AddTextBox("click","Click", "")
	Bag.AddCombo("clipboard","Clipboard", "", Array("","modify","insert","custom"))
	Bag.AddCheckBox("collapsed","Collapsed", "")
	Bag.AddTextBox("collapsedWidth","CollapsedWidth", "")
	Bag.AddTextBox("container","Container", "")
	Bag.AddTextBox("css","Css", "")
	Bag.AddTextBox("data","Data", "")
	Bag.AddTextBox("dataFeed","DataFeed", "")
	Bag.AddTextBox("datathrottle","Datathrottle", "")
	Bag.AddCombo("datatype", "Datatype", "", Array("","json","xml","jsarray","csv"))
	Bag.AddCheckBox("disabled","Disabled", "")
	Bag.AddCombo("drag", "Drag", "", Array("","true","order","move","inner","source","target","false"))
	Bag.AddCombo("dragscroll", "Dragscroll", "", Array("","x","y","xy","false","true"))
	Bag.AddTextBox("gravity","Gravity", "")
	Bag.AddTextBox("height","Height", "")
	Bag.AddCheckBox("hidden","Hidden", "")
	Bag.AddTextBox("maxHeight","MaxHeight", "")
	Bag.AddTextBox("maxWidth","MaxWidth", "")
	Bag.AddTextBox("minWidth","MinWidth", "")
	Bag.AddTextBox("minHeight","MinHeight", "")
	Bag.AddTextBox("multipleOpen","MultipleOpen", "")
	Bag.AddCheckBox("multiselect","Multiselect", "")
	Bag.AddCheckBox("navigation","Navigation", "")
	Bag.AddTextBox("pager","Pager", "")
	Bag.AddCombo("position", "Position", "", Array("","center","top", "bottom","left","right"))
	Bag.AddTextBox("ready","Ready", "")
	Bag.AddCheckBox("removeMissed","RemoveMissed", "")
	Bag.AddTextBox("save","Save", "")
	Bag.AddTextBox("scheme","Scheme", "")
	Bag.AddCombo("scroll", "Scroll", "", Array("","x","y","xy","auto","false","true"))
	Bag.AddTextBox("scrollSpeed","ScrollSpeed", "")
	Bag.AddCheckBox("select","Select", "")
	Bag.AddTextBox("template","Template", "")
	Bag.AddCheckBox("threeState","ThreeState", "")
	Bag.AddTextBox("titleHeight","TitleHeight", "")
	Bag.AddTextBox("tooltip","Tooltip", "")
	Bag.AddTextBox("type","Type", "")
	Bag.AddTextBox("url","Url", "")
	Bag.AddTextBox("width","Width", "")
	Bag.Refresh(Page)
End Sub

