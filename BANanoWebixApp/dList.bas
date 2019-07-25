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
	Bag.AddTextBox("id","Id", "list1")
	Bag.AddTextBox("parentid","Parentid", "")
	Bag.AddCombo("addingmethod","Adding Method","AddRows", pgFD.addingmethod)
	Bag.AddTextBox("tabindex", "Tab Index", "0")
	Bag.AddLabel("Details")
	Bag.AddCombo("view","View", "list", Page.Views)
	Bag.AddCombo("type","Type", "", Array("","uploader"))
	Bag.AddCheckBox("animate","Animate", "")
	Bag.AddCheckBox("autoheight","Auto Height", "")
	Bag.AddCheckBox("autowidth","Auto Width", "")
	Bag.AddCheckBox("borderless","Borderless", "")
	Bag.AddTextBox("click","Click", "")
	Bag.AddTextBox("container","Container", "")
	Bag.AddTextBox("css","Css", "")
	Bag.AddTextBox("data","Data", "")
	Bag.AddTextBox("dataFeed","Data Feed", "")
	Bag.AddTextBox("datafetch","Data Fetch", "")
	Bag.AddTextBox("datathrottle","Data Throttle", "")
	Bag.AddCombo("datatype","Datatype", "", Array("","json","xml","jsarray","csv"))
	Bag.AddCheckBox("disabled","Disabled", "")
	Bag.AddCombo("drag","Drag", "", Array("","true","order","move","inner","source","target","false"))
	Bag.AddCombo("dragscroll","Drag Scroll", "", Array("","x","y","xy","false","true"))
	Bag.AddCheckBox("dynamic","Dynamic", "")
	Bag.AddTextBox("externalData","External Data", "")
	Bag.AddTextBox("gravity","Gravity", "")
	Bag.AddTextBox("height","Height", "")
	Bag.AddCheckBox("hidden","Hidden", "")
	Bag.AddCombo("layout","Layout", "", Array("","x","y"))
	Bag.AddTextBox("maxHeight","Max Height", "")
	Bag.AddTextBox("maxWidth","Max Width", "")
	Bag.AddTextBox("minHeight","Min Height", "")
	Bag.AddTextBox("minWidth","Min Width", "")
	Bag.AddCheckBox("multiselect","Multi Select", "")
	Bag.AddCheckBox("navigation","Navigation", "")
	Bag.AddTextBox("pager","Pager", "")
	Bag.AddCheckBox("removeMissed","RemoveMissed", "")
	Bag.AddTextBox("save","Save", "")
	Bag.AddCombo("scroll","Scroll", "", Array("","x","y","xy","auto","false","true"))
	Bag.AddTextBox("scrollSpeed","ScrollSpeed", "")
	Bag.AddCheckBox("select","Select", "")
	Bag.AddTextBox("template","Template", "")
	Bag.AddTextBox("tooltip","Tooltip", "")
	Bag.AddTextBox("itemheight","Item Height", "")
	Bag.AddTextBox("url","Url", "")
	Bag.AddTextBox("width","Width", "")
	Bag.AddTextBox("xCount","XCount", "")
	Bag.AddTextBox("yCount","YCount", "")
	Bag.Refresh(Page)
End Sub

