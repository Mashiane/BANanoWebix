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
	Dim rel As List
	rel.Initialize
	rel.AddAll(Array("","top","left","right"))
	Bag.Clear
	Bag.AddTextBox("id", "ID","pager1")
	Bag.AddTextBox("localId", "Local ID", "")
	Bag.AddLabel("Parent")
	Bag.AddTextBox("parentid","Parent", "form")
	Bag.AddCombo("addingmethod","Adding Method","AddRows", pgFD.addingmethod)
	Bag.AddTextBox("tabindex", "Tab Index", "0")
	Bag.AddLabel("Details")
	Bag.AddCombo("view","View", "pager", Page.views)
	Bag.AddTextBox("name", "Name","")
	Bag.AddTextBox("container", "Container", "")
	Bag.AddCheckBox("animate","Animate", "")
	Bag.AddCheckBox("apiOnly","ApiOnly", "")
	Bag.AddCheckBox("borderless","Borderless", "")
	Bag.AddTextBox("count", "Count", "20")
	Bag.AddTextBox("css","Css", "")
	Bag.AddCheckBox("disabled","Disabled", "")
	Bag.AddTextBox("gravity","Gravity", "")
	Bag.AddTextBox("group", "Group", "5")
	Bag.AddCheckBox("hidden","Hidden", "")
	Bag.AddTextBox("level","Level", "")
	Bag.AddTextBox("limit","Limit", "")
	Bag.AddTextBox("master", "Master", "")
	Bag.AddTextBox("size", "Size", "10")
	Bag.AddTextBox("page","Page", "")
	Bag.AddCheckBox("showfirst","Show First","")
	Bag.AddCheckBox("showprev", "Show Prev","")
	Bag.AddCheckBox("showpages", "Show Pages", "")
	Bag.AddCheckBox("shownext", "Show Next", "")
	Bag.AddCheckBox("showlast", "Show Last", "")
	Bag.AddTextBox("maxHeight","MaxHeight", "")
	Bag.AddTextBox("maxWidth","MaxWidth", "")
	Bag.AddTextBox("minHeight","MinHeight", "")
	Bag.AddTextBox("minWidth","MinWidth", "")
	Bag.AddTextBox("template","Template", "")
	Bag.AddTextBox("height","Height", "")
	Bag.AddTextBox("width","Width", "")
	Bag.Refresh(Page)
End Sub

