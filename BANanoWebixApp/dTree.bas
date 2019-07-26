﻿B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.51
@EndOfDesignText@

Sub Process_Globals
End Sub

Sub BuildBag(Page As WixPage, Bag As WixProperty)
	Bag.Clear
	Bag.AddTextBox("id","Id", "tree1")
	Bag.AddTextBox("parentid","Parent", "")
	Bag.AddCombo("addingmethod","Adding Method","AddRows", pgFD.addingmethod)
	Bag.AddTextBox("tabindex", "Tab Index", "0")
	Bag.AddLabel("Details")
	Bag.AddCombo("view","View", "tree", Page.Views)
	Bag.AddCheckBox("animate","Animate", "")
	Bag.AddCheckBox("borderless","Borderless", "")
	Bag.AddTextBox("click","Click", "")
	Bag.AddCombo("clipboard", "Clipboard", "", Array("","modify","true","insert","custom"))
	Bag.AddTextBox("container","Container", "")
	Bag.AddTextBox("css","Css", "")
	Bag.AddTextBox("url","Url", "")
	Bag.AddTextBox("data","Data", "")
	Bag.AddTextBox("datathrottle","Datathrottle", "")
	Bag.AddCombo("datatype", "Datatype", "", Array("","json","xml","jsarray","csv"))
	Bag.AddCheckBox("disabled","Disabled", "")
	Bag.AddCombo("drag", "Drag", "", Array("","true","order","move","inner","source","target","false"))
	Bag.AddCombo("dragscroll", "Dragscroll", "", Array("","x","y","xy","false","true"))
	Bag.AddTextBox("filterMode","FilterMode", "")
	Bag.AddTextBox("gravity","Gravity", "")
	Bag.AddCheckBox("hidden","Hidden", "")
	Bag.AddCheckBox("multiselect","Multiselect", "")
	Bag.AddCheckBox("navigation","Navigation", "")
	Bag.AddTextBox("ready","Ready", "")
	Bag.AddCheckBox("removeMissed","RemoveMissed", "")
	Bag.AddTextBox("save","Save", "")
	Bag.AddTextBox("scheme","Scheme", "")
	Bag.AddCombo("scroll", "Scroll", "", Array("","x","y","xy","auto","false","true"))
	Bag.AddTextBox("scrollSpeed","ScrollSpeed", "")
	Bag.AddCheckBox("select","Select", "")
	Bag.AddTextBox("template","Template", "")
	Bag.AddCheckBox("threeState","ThreeState", "")
	Bag.AddTextBox("tooltip","Tooltip", "")
	'
	Bag.AddLabel("Sizes")
	Bag.AddTextBox("width","Width", "")
	Bag.AddTextBox("height","Height", "")
	Bag.AddTextBox("maxHeight","MaxHeight", "")
	Bag.AddTextBox("maxWidth","MaxWidth", "")
	Bag.AddTextBox("minWidth","MinWidth", "")
	
	Bag.Refresh(Page)
End Sub

