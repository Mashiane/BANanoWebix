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
	Bag.AddTextBox("localId", "Local ID", "pager1")
	Bag.AddLabel("Parent")
	Bag.AddTextBox("parentid","Parent", "form")
	Bag.AddCombo("addingmethod","Adding Method","AddRows", pgFormDesigner.addingmethod)
	Bag.AddTextBox("tabindex", "Tab Index", "0")
	Bag.AddLabel("View")
	Bag.AddCombo("view","View", "pager", Page.views)
	Bag.AddLabel("Details")
	Bag.AddTextBox("name", "Name","")
	Bag.AddTextBox("container", "Container", "")
	Bag.AddTextBox("master", "Master", "")
	Bag.AddTextBox("count", "Count", "20")
	Bag.AddTextBox("group", "Group", "5")
	Bag.AddTextBox("size", "Size", "10")
	Bag.AddCheckBox("animate","Animate","")
	Bag.AddCheckBox("showfirst","Show First","")
	Bag.AddCheckBox("showprev", "Show Prev","")
	Bag.AddCheckBox("showpages", "Show Pages", "")
	Bag.AddCheckBox("shownext", "Show Next", "")
	Bag.AddCheckBox("showlast", "Show Last", "")
	Bag.Refresh(Page)
End Sub