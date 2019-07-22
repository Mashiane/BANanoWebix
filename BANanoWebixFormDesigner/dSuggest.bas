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
	Bag.AddTextBox("id", "ID","suggest1")
	Bag.AddTextBox("localId", "Local ID", "")
	Bag.AddLabel("Parent")
	Bag.AddTextBox("parentid","Parent", "form")
	Bag.AddCombo("addingmethod","Adding Method","AddRows", pgFormDesigner.addingmethod)
	Bag.AddTextBox("tabindex", "Tab Index", "0")
	Bag.AddCombo("view","View", "suggest", Page.views)
	Bag.AddLabel("Details")
	Bag.AddTextBox("name", "Name","")
	Bag.AddCombo("relative","Relative","",rel)
	Bag.AddCheckBox("fitMaster","Fit Master","")
	Bag.AddTextBox("yCount","Y Count","")
	Bag.AddLabel("Options")
	Bag.AddTextBox("optionsid","IDs", "1,2,3")
	Bag.AddTextBox("optionstext","Values", "One,Two,Three")
	Bag.Refresh(Page)
End Sub