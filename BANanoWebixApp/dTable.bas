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
	Dim fldtypes As List
	fldtypes.Initialize
	fldtypes.AddAll(Array("BOOL", "INT", "INTEGER", "TEXT", "STRING", "REAL", "DATE", "BLOB", "FLOAT"))
	
	Bag.Clear
	Bag.AddTextBox("id", "ID","table")
	Bag.AddTextBox("value", "Table Name","table1")
	Bag.AddTextBox("description", "Description","")
	Bag.AddTextBox("primarykey", "Primary Field", "id")
	Bag.AddCombo("type", "Field Type","INT", fldtypes)
	Bag.AddCheckBox("autoincrement", "Auto Increment", False)
	Bag.Refresh(Page)
End Sub
