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
	Dim align As List
	align.Initialize
	align.AddAll(Array("","left","right"))
	'
	Dim pos As List
	pos.Initialize
	pos.AddAll(Array("","left","top"))
	'
	Bag.Clear
	Bag.AddTextBox("id", "ID","dbllist1")
	Bag.AddTextBox("localId", "Local ID", "")
	Bag.AddLabel("Parent")
	Bag.AddTextBox("parentid","Parent", "form")
	Bag.AddCombo("addingmethod","Adding Method","AddRows", pgFD.addingmethod)
	Bag.AddTextBox("tabindex", "Tab Index", "0")
	Bag.AddCombo("view","View", "dbllist", Page.views)
	Bag.AddCombo("type", "Type", "", Array("","line","clean","wide","space","form"))
	Bag.AddLabel("Details")
	Bag.AddTextBox("value", "Value","1")
	Bag.AddTextBox("name", "Name","")
	Bag.AddTextBox("tooltip", "Tooltip","")
	Bag.AddTextBox("batch", "Batch","")
	Bag.AddCheckBox("animate","Animate", "")
	Bag.AddCheckBox("borderless","Borderless", "")
	Bag.AddTextBox("buttons","Buttons", "")
	Bag.AddTextBox("container","Container", "")
	Bag.AddTextBox("css","Css", "")
	Bag.AddLabel("Data Source")
	Bag.AddTextBox("data","Data", "")
	Bag.AddCombo("datatype", "Datatype", "", Array("","json","xml","jsarray","csv"))
	Bag.AddTextBox("optionsid","IDs", "1,2,3")
	Bag.AddTextBox("optionstext","Values", "One,Two,Three")
	Bag.AddCheckBox("disabled","Disabled", "")
	Bag.AddTextBox("gravity","Gravity", "")
	Bag.AddCheckBox("hidden","Hidden", "")
	Bag.AddTextBox("labelBottomLeft","LabelBottomLeft", "")
	Bag.AddTextBox("labelBottomRight","LabelBottomRight", "")
	Bag.AddTextBox("labelLeft","LabelLeft", "")
	Bag.AddTextBox("labelRight","LabelRight", "")
	Bag.AddTextBox("list","List", "")
	Bag.AddTextBox("padding","Padding", "")
	Bag.AddTextBox("paddingX","PaddingX", "")
	Bag.AddTextBox("paddingY","PaddingY", "")
	Bag.AddTextBox("url","Url", "")

	'
	Bag.AddLabel("Label")
	Bag.AddTextBox("label","Text","DBLList 1")
	Bag.AddTextBox("labelWidth","Width","")
	Bag.AddTextBox("labelHeight","Height","")
	Bag.AddCombo("labelAlign","Align","",align)
	Bag.AddCombo("labelPosition","Position","",pos)
	'
	'
	Bag.AddLabel("Size")
	Bag.AddTextBox("width","Width","")
	Bag.AddTextBox("height","Height","")
	Bag.AddTextBox("maxHeight","MaxHeight", "")
	Bag.AddTextBox("maxWidth","MaxWidth", "")
	Bag.AddTextBox("minHeight","MinHeight", "")
	Bag.AddTextBox("minWidth","MinWidth", "")
	
	Bag.Refresh(Page)
End Sub
