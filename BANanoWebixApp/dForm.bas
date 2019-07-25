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
	Bag.AddCombo("addingmethod","Adding Method","AddRows", pgFD.addingmethod)
	Bag.AddCombo("view","View", "form", Page.views)
	Bag.AddCombo("type", "Type", "", Array("","line","clean","wide","space","form"))
	Bag.AddCheckBox("animate","Animate", "")
	Bag.AddCheckBox("autoheight","Autoheight", "")
	Bag.AddCheckBox("borderless","Borderless", "")
	Bag.AddCheckBox("complexData", "Complex Data", False)
	Bag.AddTextBox("container","Container", "")
	Bag.AddTextBox("css","Css", "")
	Bag.AddTextBox("data","Data", "")
	Bag.AddTextBox("cols","Cols", "")
	Bag.AddTextBox("dataFeed","DataFeed", "")
	Bag.AddCombo("datatype", "Datatype", "", Array("","json","xml","jsarray","csv"))
	Bag.AddCheckBox("disabled","Disabled", "")
	Bag.AddTextBox("elements","Elements", "")
	Bag.AddTextBox("gravity","Gravity", "")
	Bag.AddCheckBox("hidden","Hidden", "")
	Bag.AddCheckBox("isolate","Isolate", "")
	Bag.AddCheckBox("responsive","Responsive", "")
	Bag.AddTextBox("rows","Rows", "")
	Bag.AddCombo("scroll", "Scroll", "", Array("","x","y","xy","auto","false","true"))
	Bag.AddTextBox("scrollSpeed","ScrollSpeed", "")
	Bag.AddTextBox("url","Url", "")
	Bag.AddTextBox("visibleBatch","VisibleBatch", "")

	'
	Bag.AddLabel("Elements Config")
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
	'
	Bag.AddLabel("Size")
	Bag.AddTextBox("width","Width","")
	Bag.AddTextBox("height","Height","")
	Bag.AddTextBox("maxHeight","MaxHeight", "")
	Bag.AddTextBox("maxWidth","MaxWidth", "")
	Bag.AddTextBox("minHeight","MinHeight", "")
	Bag.AddTextBox("minWidth","MinWidth", "")

	'
	Bag.AddLabel("Style")
	Bag.AddTextBox("padding","Padding","")
	Bag.AddTextBox("margin","Margin","")
	Bag.AddTextBox("paddingX","PaddingX", "")
	Bag.AddTextBox("paddingY","PaddingY", "")
	Bag.Refresh(Page)
End Sub