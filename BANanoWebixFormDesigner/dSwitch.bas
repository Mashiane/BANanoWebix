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
	Bag.AddTextBox("id", "ID","switch1")
	Bag.AddTextBox("localId", "Local ID", "")
	Bag.AddLabel("Parent")
	Bag.AddTextBox("parentid","Parent", "form")
	Bag.AddCombo("addingmethod","Adding Method","AddRows", pgFormDesigner.addingmethod)
	Bag.AddTextBox("tabindex", "Tab Index", "0")
	Bag.AddCombo("view","View", "switch", Page.views)
	Bag.AddLabel("Details")
	Bag.AddTextBox("value", "Value","1")
	Bag.AddTextBox("name", "Name","")
	Bag.AddTextBox("tooltip", "Tooltip","")
	Bag.AddTextBox("batch", "Batch","")
	Bag.AddLabel("Label")
	Bag.AddTextBox("label","Text","Switch")
	Bag.AddTextBox("labelRight","Right Text","")
	Bag.AddTextBox("labelWidth","Width","")
	Bag.AddTextBox("labelHeight","Height","")
	Bag.AddCombo("labelAlign","Align","",align)
	Bag.AddCombo("labelPosition","Position","",pos)
	Bag.AddLabel("Options")
	Bag.AddTextBox("onLabel","On Label", "On")
	Bag.AddTextBox("offLabel","Off Label", "Off")
	
	
	Bag.AddLabel("Size")
	Bag.AddTextBox("width","Width","200")
	Bag.AddTextBox("height","Height","")
	'Bag.AddLabel("Event")
	'Bag.AddTextBox("click","On Click","BANano.CallBack(Me,button1_click,Null)")
	
	Bag.Refresh(Page)
End Sub