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
	Bag.AddLabel("View")
	Bag.AddTextBox("view","View", "Form") 
	Bag.AddLabel("Details")
	Bag.AddTextBox("id", "ID","form")
	Bag.AddCheckBox("scroll","Scroll","")
	Bag.AddLabel("Size")
	Bag.AddTextBox("width","Width","")
	Bag.AddTextBox("height","Height","")
	Bag.AddLabel("Style")
	Bag.AddTextBox("padding","Padding","")
	Bag.AddTextBox("margin","Margin","")
	Bag.Refresh(Page)
End Sub
