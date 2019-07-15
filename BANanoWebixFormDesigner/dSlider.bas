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
	Bag.AddTextBox("id", "ID","slider1")
	Bag.AddTextBox("localId", "Local ID", "")
	Bag.AddLabel("Parent")
	Bag.AddTextBox("parentid","Parent", "form")
	Bag.AddCombo("addingmethod","Adding Method","AddRows", pgFormDesigner.addingmethod)
	Bag.AddTextBox("tabindex", "Tab Index", "0")
	Bag.AddLabel("View")
	Bag.AddCombo("view","View", "slider", Page.views)
	Bag.AddLabel("Details")
	Bag.AddTextBox("value", "Value","43")
	Bag.AddTextBox("title", "Title", "#value#")
	Bag.AddTextBox("name", "Name","")
	Bag.AddTextBox("tooltip", "Tooltip","")
	Bag.AddTextBox("batch", "Batch","")
	Bag.AddCheckBox("vertical", "Vertical", "")
	Bag.AddLabel("Label")
	Bag.AddTextBox("label","Text","Slider 1")
	Bag.AddTextBox("labelWidth","Width","")
	Bag.AddTextBox("labelHeight","Height","")
	Bag.AddCombo("labelAlign","Align","",align)
	Bag.AddCombo("labelPosition","Position","",pos)
	Bag.AddLabel("Options")
	Bag.AddTextBox("min","Min", "0")
	Bag.AddTextBox("max","Max", "100")
	Bag.AddTextBox("step","Step", "1")
	
	Bag.AddLabel("Size")
	Bag.AddTextBox("width","Width","200")
	Bag.AddTextBox("height","Height","")
	'Bag.AddLabel("Event")
	'Bag.AddTextBox("click","On Click","BANano.CallBack(Me,button1_click,Null)")
	
	Bag.Refresh(Page)
End Sub