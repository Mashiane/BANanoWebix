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
	types.AddAll(Array("BOOL", "INT", "STRING", "BLOB"))
	
	Bag.Clear
	Bag.AddTextBox("id", "ID","table")
	Bag.AddTextBox("value", "Table Name","table1")
	Bag.AddTextBox("primarykey", "Primary Field", "id")
	Bag.AddCombo("type", "Field Type","INT", types)
	Bag.AddCheckBox("autoincrement", "Auto Increment", False)
	Bag.Refresh(Page)
End Sub
