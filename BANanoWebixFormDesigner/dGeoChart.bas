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
	Bag.AddTextBox("id","Id", "geochart1")
	Bag.AddTextBox("parentid","Parent ID", "")
	Bag.AddCombo("addingmethod","Adding Method","AddRows", pgFormDesigner.addingmethod)
	Bag.AddTextBox("tabindex", "Tab Index", "0")
	Bag.AddLabel("Details")
	Bag.AddCombo("view","View", "geochart", Page.Views)
	Bag.AddTextBox("name","Name", "")
	Bag.AddTextBox("key","Key", "")
	Bag.AddCombo("datatype", "Data Type", "", Array("json","xml","jsarray","csv"))
	Bag.AddTextBox("columns","Columns", "")
	Bag.AddCombo("ChartDisplayMode", "Chart Display Mode", "", Array("", "auto","regions","markers","text"))
	Bag.AddTextBox("ChartRegion","Chart Region", "")
	Bag.AddTextBox("ChartColorAxis","Chart Color Axis", "")
	Bag.AddTextBox("ChartLegend","Chart Legend", "")
	Bag.AddCombo("ChartResolution", "Chart Resolution", "", Array("","countries","provinces","metros"))
	Bag.AddTextBox("tooltip","Tooltip", "")
	Bag.AddCheckBox("borderless","Borderless", "")
	Bag.AddTextBox("container","Container", "")
	Bag.AddCheckBox("hidden","Hidden", "")
	Bag.AddLabel("Size")
	Bag.AddTextBox("height","Height", "")
	Bag.AddTextBox("width","Width", "")
	Bag.AddTextBox("autoHeight","Auto Height", "")
	Bag.AddTextBox("autoWidth","Auto Width", "")
	Bag.Refresh(Page)
End Sub
