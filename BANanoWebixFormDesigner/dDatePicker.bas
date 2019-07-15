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
	Dim typ As List
	typ.Initialize 
	typ.AddAll(Array("time","date"))
	'
	Bag.Clear
	Bag.AddTextBox("id", "ID","datepicker1")
	Bag.AddTextBox("localId", "Local ID", "")
	Bag.AddLabel("Parent")
	Bag.AddTextBox("parentid","Parent", "form")
	Bag.AddCombo("addingmethod","Adding Method","AddRows", pgFormDesigner.addingmethod)
	Bag.AddTextBox("tabindex", "Tab Index", "0")
	Bag.AddLabel("View")
	Bag.AddCombo("view","View", "datepicker", Page.views)
	Bag.AddLabel("Details")
	Bag.AddTextBox("value", "Value","")
	Bag.AddTextBox("name", "Name","")
	Bag.AddTextBox("placeholder", "PlaceHolder","")
	Bag.AddTextBox("icon", "Icon","")
	Bag.AddTextBox("tooltip", "Tooltip","")
	Bag.AddTextBox("batch", "Batch","")
	Bag.AddLabel("Label")
	Bag.AddTextBox("label","Text","DatePicker 1")
	Bag.AddTextBox("labelWidth","Width","")
	Bag.AddTextBox("labelHeight","Height","")
	Bag.AddCombo("labelAlign","Align","",align)
	Bag.AddCombo("labelPosition","Position","",pos)
	Bag.AddLabel("Size")
	Bag.AddTextBox("width","Width","")
	Bag.AddTextBox("height","Height","")
	Bag.AddLabel("Options")
	Bag.AddCheckBox("timepicker","Time Picker", "")
	Bag.AddCombo("type","Type", "date", typ)
	Bag.AddTextBox("format","Format", "%Y-%m-%d")
	'Bag.AddLabel("Event")
	'Bag.AddTextBox("click","On Click","BANano.CallBack(Me,button1_click,Null)")
	
	Bag.Refresh(Page)
End Sub