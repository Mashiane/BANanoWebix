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
	Dim bType As List
	bType.Initialize 
	bType.AddAll(Array("","icon", "iconTop","image", "imageTop"))
	'
	Dim css As List
	css.Initialize 
	css.addall(Array("","webix_secondary","webix_primary","webix_danger","webix_transparent"))
	'
	Dim act As List
	act.Initialize 
	act.addall(Array("","new","insert","read", "update", "delete", "getall"))
	'
	Bag.Clear
	Bag.AddTextBox("id", "ID","button1")
	Bag.AddTextBox("localId", "Local ID", "")
	Bag.AddLabel("Parent")
	Bag.AddTextBox("parentid","Parent", "form")
	Bag.AddCombo("addingmethod","Adding Method","AddRows", pgFormDesigner.addingmethod)
	Bag.AddTextBox("tabindex", "Tab Index", "0")
	Bag.AddLabel("Details")
	Bag.AddCombo("view","View", "Button", Page.Views)
	Bag.AddCombo("type","Type","", bType)
	Bag.AddCombo("action","Action","", act)
	Bag.AddCombo("css", "CSS","", css)
	Bag.AddTextBox("name", "Name","")
	Bag.AddTextBox("value", "Value","")
	Bag.AddTextBox("badge", "Badge","")
	Bag.AddTextBox("tooltip", "Tooltip","")
	Bag.AddTextBox("icon", "Icon","")
	Bag.AddTextBox("image", "Image","")
	Bag.AddTextBox("batch", "Batch","")
	Bag.AddTextBox("popup", "PopUp","")
	Bag.AddLabel("Label")
	Bag.AddTextBox("label","Text","Button 1")
	Bag.AddTextBox("labelWidth","Width","")
	Bag.AddTextBox("labelHeight","Height","")
	Bag.AddCombo("labelAlign","Align","",align)
	Bag.AddCombo("labelPosition","Position","",pos)
	Bag.AddLabel("Size")
	Bag.AddTextBox("width","Width","100")
	Bag.AddTextBox("height","Height","")
	Bag.AddCheckBox("autowidth", "Auto width ","")
	
	Bag.AddLabel("Event")
	Bag.AddTextBox("click","On Click","BANano.CallBack(Me,button1_click,Null)")
	Bag.Refresh(Page)
End Sub