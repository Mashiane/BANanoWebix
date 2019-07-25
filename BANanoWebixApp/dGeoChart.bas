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
	Bag.AddTextBox("id","Id", "geochart1")
	Bag.AddTextBox("parentid","Parent ID", "")
	Bag.AddCombo("addingmethod","Adding Method","AddRows", pgFD.addingmethod)
	Bag.AddTextBox("tabindex", "Tab Index", "0")
	Bag.AddLabel("Details")
	Bag.AddCombo("view","View", "geochart", Page.Views)
	Bag.AddTextBox("name","Name", "")
	Bag.AddTextBox("key","Key", "")
	Bag.AddCheckBox("animate","Animate", "")
	Bag.AddCheckBox("borderless","Borderless", "")
	Bag.AddTextBox("chart","Chart", "")
	Bag.AddTextBox("columns","Columns", "")
	Bag.AddTextBox("container","Container", "")
	Bag.AddTextBox("css","Css", "")
	Bag.AddTextBox("data","Data", "")
	Bag.AddTextBox("datathrottle","Datathrottle", "")
	Bag.AddCombo("datatype", "Data Type", "", Array("json","xml","jsarray","csv"))
	Bag.AddCheckBox("disabled","Disabled", "")
	Bag.AddTextBox("gravity","Gravity", "")
	Bag.AddCheckBox("hidden","Hidden", "")
	Bag.AddTextBox("ready","Ready", "")
	Bag.AddCheckBox("removeMissed","RemoveMissed", "")
	Bag.AddTextBox("save","Save", "")
	Bag.AddTextBox("scheme","Scheme", "")
	Bag.AddTextBox("tooltip","Tooltip", "")
	Bag.AddTextBox("url","Url", "")
	
	Bag.AddCombo("ChartDisplayMode", "Chart Display Mode", "", Array("", "auto","regions","markers","text"))
	Bag.AddTextBox("ChartRegion","Chart Region", "")
	Bag.AddTextBox("ChartColorAxis","Chart Color Axis", "")
	Bag.AddTextBox("ChartLegend","Chart Legend", "")
	Bag.AddCombo("ChartResolution", "Chart Resolution", "", Array("","countries","provinces","metros"))
	'
	Bag.AddLabel("Size")
	Bag.AddTextBox("height","Height", "")
	Bag.AddTextBox("width","Width", "")
	Bag.AddTextBox("maxHeight","MaxHeight", "")
	Bag.AddTextBox("maxWidth","MaxWidth", "")
	Bag.AddTextBox("minHeight","MinHeight", "")
	Bag.AddTextBox("minWidth","MinWidth", "")
	Bag.AddTextBox("autoheight","Auto Height", "")
	Bag.AddTextBox("autowidth","Auto Width", "")
	Bag.Refresh(Page)
End Sub