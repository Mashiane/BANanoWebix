B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.51
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private pg As WixPage
	Private BANano As BANano
	Private propBag As WixProperty
	Private div As UOENowHTML
End Sub

Sub Init()
	pg.Initialize("wp", "body").SetTypeSpace("").SetResponsive(True).SetAppName(Main.AppName)
	'
	Dim tblBar As WixToolBar
	tblBar.Initialize("tblBar")
	tblBar.CreateIcon("menuopen").SetIcon("mdi mdi-menu").SetClick(BANano.CallBack(Me, "OpenMenu", Null)).Pop
	tblBar.CreateLabel("heading").SetLabel("BANanoWebix - Form Designer").Pop
	tblBar.setPadding(3)
	'
	pg.AddToolBar(tblBar)
	'
	Dim sm As WixSideBar
	sm.Initialize("smp").SetCollapsed(False).SetActiveTitle(True).SetScroll(True)
	'
'	sm.AddItem("", "dp", "Data Presentation","","mdi mdi-view-dashboard", "","")
'	sm.AddItem("dp", "datatable", "DataTable","","./assets/datatable.png", "", "")
'	sm.AddItem("dp", "dataview", "DataView","","mdi mdi-view-dashboard", "","")
'	sm.AddItem("dp", "grouplist", "GroupList","","mdi mdi-view-dashboard", "","")
'	sm.AddItem("dp", "list", "List","","mdi mdi-view-dashboard", "","")
'	sm.AddItem("dp", "propertysheet", "Property Sheet","","mdi mdi-view-dashboard", "","")
'	sm.AddItem("dp", "tree", "Tree","","mdi mdi-view-dashboard", "","")
'	sm.AddItem("dp", "treetable", "TreeTable","","mdi mdi-view-dashboard", "","")
'	sm.AddItem("dp", "unitlist", "UnitList","","mdi mdi-view-dashboard", "","")
'	'
'	sm.AddItem("", "vis", "Visualization","","mdi mdi-view-dashboard", "","")
'	sm.AddItem("vis", "chart", "Chart","","mdi mdi-view-dashboard", "","")
'	sm.AddItem("vis", "googlemap", "Google Map","","mdi mdi-view-dashboard", "","")
'	sm.AddItem("vis", "iframe", "IFrame","","mdi mdi-view-dashboard", "","")
'	sm.AddItem("vis", "template", "Template","","mdi mdi-view-dashboard", "","")
'	sm.AddItem("vis", "video", "Video","","mdi mdi-view-dashboard", "","")
'	'
'	sm.AddItem("", "lay", "Layouts","","mdi mdi-view-dashboard", "","")
'	sm.AddItem("lay", "accordion", "Accordion","","mdi mdi-view-dashboard", "","")
'	sm.AddItem("lay", "carousel", "Carousel","","mdi mdi-view-dashboard", "","")
'	sm.AddItem("lay", "comments", "Comments","","mdi mdi-view-dashboard", "","")
'	sm.AddItem("lay", "form", "Form","","mdi mdi-view-dashboard", "","")
'	sm.AddItem("lay", "layout", "Layout","","mdi mdi-view-dashboard", "","")
'	sm.AddItem("lay", "multiview", "MultiView","","mdi mdi-view-dashboard", "","")
'	sm.AddItem("lay", "scrollview", "ScrollView","","mdi mdi-view-dashboard", "","")
'	sm.AddItem("lay", "tabview", "TabView","","mdi mdi-view-dashboard", "","")
'	'
'	sm.AddItem("", "nav", "Navigation","","mdi mdi-view-dashboard", "","")
'	sm.AddItem("nav", "contextmenu", "ContextMenu","","mdi mdi-view-dashboard", "","")
'	sm.AddItem("nav", "menu", "Menu","","mdi mdi-view-dashboard", "","")
'	sm.AddItem("nav", "sidebar", "SideBar","","mdi mdi-view-dashboard", "","")
'	sm.AddItem("nav", "sidemenu", "SideMenu","","mdi mdi-view-dashboard", "","")
'	sm.AddItem("nav", "toolbar", "ToolBar","","mdi mdi-view-dashboard", "","")
'	'
'	sm.AddItem("", "win", "Windows & Popups","","mdi mdi-view-dashboard", "","")
'	sm.AddItem("win", "context", "Context","","mdi mdi-view-dashboard", "","")
'	sm.AddItem("win", "popup", "PopUp","","mdi mdi-view-dashboard", "","")
'	sm.AddItem("win", "window", "Window","","mdi mdi-view-dashboard", "","")
	'
	sm.AddItem("", "con", "Controls","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "button", "Button","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "checkbox", "CheckBox","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "colorpicker", "ColorPicker","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "combo", "Combo","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "counter", "Counter","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "datepicker", "DatePicker","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "doublelist", "DoubleList","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "fieldset", "FieldSet","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "forminput", "FormInput","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "icon", "Icon","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "label", "Label","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "pager", "Pager","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "radio", "Radio","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "richselect", "RichSelect","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "search", "Search","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "segmented", "Segmented","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "select", "Select","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "slider", "Slider","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "suggest", "Suggest","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "switch", "Switch","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "tabbar", "TabBar","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "text", "Text","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "textarea", "TextArea","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "toggle", "Toggle","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "uploader", "Uploader","","mdi mdi-view-dashboard", "","")
	'			
	'
	Dim R2 As WixRow
	R2.Initialize("R2")
	'
	R2.AddColumns(sm.Item)
	'
	'add a tree
	Dim tree As WixTree
	tree.Initialize("tree").SetSelect(True).SetScroll(True).SetWidth(300).SetTypeLineTree(True).SetBorderLess(False)
	'
	tree.AddItem("","form","Form","",pg.EnumWixIcons.Folder,"","",True)
	'tree.AddItem("form", "form.rows", "Rows","","","","",True)
	'tree.AddItem("form", "form.columns", "Columns", "","","","",True)
	  
	R2.AddColumns(tree.Item)
	'add a resizer
	Dim res As WixResizer
	res.Initialize("")
	R2.AddColumns(res.item)
	'
	'form holder
	Dim formHolder As WixRow
	formHolder.Initialize("formholder")
	'
	div.Initialize("views","div").SetStyle("width","100%").SetStyle("height","100%")
	formHolder.SetTemplate(div.html)
	'
	R2.AddColumns(formHolder.Item)
	'
	'add a resizer
	Dim res1 As WixResizer
	res1.Initialize("")
	R2.AddColumns(res1.item)
	'
	Dim frm As WixForm
	frm.Initialize("propform")
	'
	Dim tbl As WixToolBar
	tbl.Initialize("proptbl")
	tbl.AddSpacer
	tbl.CreateIcon("propsave").SetIcon("mdi mdi-content-save").SetTooltip("Save").SetClick(BANano.CallBack(Me,"prop_save",Null)) .Pop
	tbl.CreateIcon("propdelete").SetIcon("mdi mdi-delete-outline").SetTooltip("Delete").SetClick(BANano.CallBack(Me,"prop_delete",Null)).Pop
	'
	
	propBag.Initialize("propbag").SetWidth(300).setnamewidth(150).SetScroll(True)
	'
	frm.AddRows(tbl.Item)
	frm.AddRows(propBag.Item)
	'
	R2.AddColumns(frm.Item)
	 
	'R2C2.SetTemplate(div.HTML)
	'
	'R2.AddColumns(R2C2.item)
	'
	pg.AddRow(R2)
	'
	pg.ui
	'
	'side bar click
	Dim meid As Map
	pg.OnItemClick("smp", BANano.CallBack(Me, "sidebar_click", Array(meid)))
	'tree click
	Dim recid As String
	pg.OnItemClick("tree", BANano.CallBack(Me, "tree_click", Array(recid)))
End Sub

'save the item
Sub prop_save
	'get the property bag
	Dim prop As Map = pg.GetValues("propbag")
	CreateView(prop)
End Sub

'delete the property
Sub prop_delete
	
End Sub

Sub CreateView(properties As Map) As Map
	'get the view
	Dim v As String = properties.Get("view")
	Dim i As String = properties.Get("id")
	'
	Dim view As WixElement
	view.Initialize(i)
	properties.Remove("id")
	
	'get the contents of the property bag
	For Each pkey As String In properties.keys
		Dim pval As Object = properties.Get(pkey)
		Dim cval As String = pg.CStr(pval)
		If cval <> "" Then
			view.SetAttr(pkey, pval)
		End If
	Next
	view.SetAttr("view", v.ToLowerCase)
	view.SetAttr("container", "views")
	'save
	BANano.SetLocalStorage(i, view.Item)
	'clear the formholder
	Dim opt As Map = CreateMap("template": div.HTML)
	pg.Define("formholder", opt)
	pg.Refresh("formholder")
	'create the view
	pg.UX(view.Item)
	'pg.AddNode("tree", CreateMap("id":7, "value":"Mashy","year":1973))
	'pg.AddChildNode("tree","7", CreateMap("id":8,"value":"Ozzie","year":2003))
	'pg.Refresh("tree")
End Sub


Sub tree_click(recid As String)
	Log(recid)
	Select Case recid
	Case "form.rows","form.columns"
		propBag.Clear
		propBag.Refresh(pg)
	Case "form"
		dForm.BuildBag(pg, propBag)
	End Select
End Sub

Sub sidebar_click(meid As String)
	Log(meid)
	Select Case meid
	Case "button"
		dButton.BuildBag(pg, propBag) 	
	End Select
End Sub

Sub OpenMenu()
	pg.Toggle("smp")
End Sub
