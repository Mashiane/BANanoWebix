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
	Bag.Clear
	Bag.AddTextBox("id", "ID","form")
	Bag.AddTextBox("name","Name", "form")
	Bag.AddTextBox("localId", "Local ID", "")
	Bag.AddLabel("Parent")
	Bag.AddTextBox("parentid","Parent", "pg")
	Bag.AddCombo("addingmethod","Adding Method","AddRows", pgFormDesigner.addingmethod)
	Bag.AddCombo("view","View", "form", Page.views)
	Bag.AddCheckBox("complexData", "Complex Data", False)
	Bag.AddCombo("DefaultView","View","", Page.views)
	Bag.AddTextBox("DefaultType","Type","")
	Bag.AddCombo("DefaultLabelAlign", "Label Align", "", align)
	Bag.AddTextBox("DefaultLabelWidth", "Label Width", "")
	Bag.AddCombo("DefaultLabelPosition", "Label Position", "",pos)
	Bag.AddCombo("DefaultAlign", "Align", "",align)
	Bag.AddTextBox("DefaultWidth","Width","")
	Bag.AddTextBox("DefaultHeight","Height","")
	Bag.AddTextBox("DefaultBottomPadding","Bottom Padding", "")
	
	Bag.AddLabel("Details")
	Bag.AddCheckBox("scroll","Scroll","")
	Bag.AddCheckBox("scrollX", "Scroll X", "")
	Bag.AddCheckBox("scrollY", "Scroll Y","")
	Bag.AddLabel("Size")
	Bag.AddTextBox("width","Width","")
	Bag.AddTextBox("height","Height","")
	Bag.AddLabel("Style")
	Bag.AddTextBox("padding","Padding","")
	Bag.AddTextBox("margin","Margin","")
	Bag.Refresh(Page)
End Sub
