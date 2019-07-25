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
	Dim types As List
	types.Initialize
	types.AddAll(Array("BOOL", "INT", "STRING", "REAL", "DATE", "BLOB", "FLOAT"))
	'
	Bag.Clear
	Bag.AddTextBox("id", "ID","field")
	Bag.AddTextBox("value", "Field Name","field1")
	Bag.AddTextBox("description", "Description","")
	Bag.AddCheckBox("showongrid", "On Grid","")
	Bag.AddCombo("view","View", "text", Page.Views)
	Bag.AddCombo("type", "Field Type","STRING", types)
	Bag.AddTextBox("length", "Field Length","20")
	Bag.AddLabel("Parent Table")
	Bag.AddTextBox("tablename", "Table Name", "table")
	Bag.AddTextBox("tabindex","Tab Index", "0")
	Bag.Refresh(Page)
End Sub