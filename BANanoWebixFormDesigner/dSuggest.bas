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
	Bag.AddLabel("Parent")
	Bag.AddTextBox("parentid","Parent", "form")
	Bag.AddLabel("View")
	Bag.AddTextBox("view","View", "suggest")
	Bag.AddLabel("Details")
	Bag.AddTextBox("id", "ID","suggest1")
	Bag.AddTextBox("name", "Name","")
	Bag.AddCombo("relative","Relative","",rel)
	Bag.AddCheckBox("fitMaster","Fit Master","")
	Bag.AddTextBox("yCount","Y Count","")
	Bag.AddLabel("Options")
	Bag.AddTextBox("optionsid","IDs", "1,2,3")
	Bag.AddTextBox("optionstext","Values", "One,Two,Three")
	Bag.Refresh(Page)
End Sub