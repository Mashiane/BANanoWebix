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
	Bag.AddTextBox("id","Id", "googlemap1")
	Bag.AddTextBox("parentid","Parent", "")
	Bag.AddCombo("addingmethod","Adding Method","AddRows", pgFD.addingmethod)
	Bag.AddTextBox("tabindex", "Tab Index", "0")
	Bag.AddLabel("Details")
	Bag.AddCombo("view","View", "google-map", Page.Views)
	Bag.AddCheckBox("animate","Animate", "")
	Bag.AddCheckBox("borderless","Borderless", "")
	Bag.AddTextBox("key", "Key", "AIzaSyAi0oVNVO-e603aUY8SILdD4v9bVBkmiTg")
	Bag.AddTextBox("center","Center", "48.724, 8.215")
	Bag.AddTextBox("zoom","Zoom", "6")
	Bag.AddTextBox("container","Container", "")
	Bag.AddTextBox("css","Css", "")
	Bag.AddTextBox("data","Data", "")
	Bag.AddTextBox("dataFeed","DataFeed", "")
	Bag.AddTextBox("datathrottle","Datathrottle", "")
	Bag.AddCombo("datatype", "Datatype", "", Array("","json","xml","jsarray","csv"))
	Bag.AddCheckBox("disabled","Disabled", "")
	Bag.AddTextBox("gravity","Gravity", "")
	Bag.AddTextBox("heatmapConfig","HeatmapConfig", "")
	Bag.AddCheckBox("hidden","Hidden", "")
	Bag.AddCombo("layerType", "LayerType", "", Array("","marker","heatmap"))
	Bag.AddCombo("mapType", "MapType", "", Array("","ROADMAP","SATELLITE","HYBRID","TERRAIN"))
	Bag.AddTextBox("ready","Ready", "")
	Bag.AddCheckBox("removeMissed","RemoveMissed", "")
	Bag.AddTextBox("save","Save", "")
	Bag.AddTextBox("scheme","Scheme", "")
	Bag.AddTextBox("url","Url", "")
	Bag.AddLabel("Sizes")
	Bag.AddTextBox("width","Width", "")
	Bag.AddTextBox("height","Height", "")
	Bag.AddTextBox("maxHeight","MaxHeight", "")
	Bag.AddTextBox("maxWidth","MaxWidth", "")
	Bag.AddTextBox("minHeight","MinHeight", "")
	Bag.AddTextBox("minWidth","MinWidth", "")
	Bag.Refresh(Page)
End Sub

