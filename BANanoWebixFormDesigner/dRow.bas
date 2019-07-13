B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.51
@EndOfDesignText@
'Static code module
Sub Process_Globals
End Sub

Sub BuildBag(Page As WixPage, Bag As WixProperty)
	Bag.Clear
	Bag.AddTextBox("id", "ID","r1")
	Bag.AddTextBox("localId", "Local ID", "r1")
	Bag.AddLabel("Parent")
	Bag.AddTextBox("parentid","Parent", "form")
	Bag.AddCombo("addingmethod","Adding Method","AddRows", pgFormDesigner.addingmethod)
	Bag.AddTextBox("tabindex", "Tab Index", "0")	
	Bag.AddLabel("View")
	Bag.AddCombo("view","View", "row", Page.views)
	Bag.AddTextBox("type","Type","")
	Bag.AddLabel("Details")
	Bag.AddTextBox("value", "Value","")
	Bag.AddTextBox("name", "Name","")
	Bag.AddTextBox("template","Template","r1")
	Bag.AddTextBox("batch", "Batch","")
	Bag.AddCheckBox("autoWidth", "Auto width ","")
	Bag.AddCheckBox("autoHeight", "Auto Height ","")
	Bag.AddLabel("Style")
	Bag.AddTextBox("css", "CSS","")
	Bag.AddColor("style.color", "Color","")
	Bag.AddColor("style.background", "Background","")
	Bag.AddLabel("Size")
	Bag.AddTextBox("width","Width","")
	Bag.AddTextBox("height","Height","")
	Bag.Refresh(Page)
End Sub