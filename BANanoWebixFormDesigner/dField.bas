﻿B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.51
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private fx As JFX
End Sub

Sub BuildBag(Page As WixPage, Bag As WixProperty)
	Dim types As List
	types.Initialize
	types.AddAll(Array("BOOL", "INT", "STRING", "REAL", "DATE", "BLOB", "FLOAT"))
	'
	Bag.Clear
	Bag.AddTextBox("id", "ID","field")
	Bag.AddTextBox("value", "Field Name","field1")
	Bag.AddCombo("type", "Field Type","STRING", types)
	Bag.AddTextBox("length", "Field Length","20")
	Bag.AddLabel("Parent Table")
	Bag.AddTextBox("tablename", "Table Name", "table")
	Bag.Refresh(Page)
End Sub