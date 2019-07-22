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
	Bag.AddTextBox("id", "ID","wixsomething")
	Bag.AddTextBox("name", "Name","")
	Bag.AddTextBox("view", "View","")
	Bag.Refresh(Page)
End Sub