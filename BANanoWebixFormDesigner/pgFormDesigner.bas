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
	Private SQL As BANanoSQL
	Private qry As String
	Private args As List
	Private rec As Map
	Private result As List
	Private record As Map
	Private affected As Int
	Private json As String
	Private delID As String
	Private hints As WixHint
End Sub

Sub InitWait()
	hints.Initialize("hints") 
	'create page
	pg.Initialize("wp", "body").SetTypeSpace("").SetResponsive(True).SetAppName(Main.AppName)
	' create the toolbar for the page
	Dim tblBar As WixToolBar
	tblBar.Initialize("tblBar").SetHeight(56)
	tblBar.CreateIcon("menuopen").SetIcon("mdi mdi-menu").SetClick(BANano.CallBack(Me, "OpenMenu", Null)).Pop
	tblBar.CreateLabel("heading").SetLabel("BANanoWebix - Form Designer").Pop
	hints.AddStep("heading","Welcome","Welcome to the BANanoWebix - Form Designer","click") 
	hints.AddStep("menuopen","Side Bar","You can toggle the side bar menu to access elements that you can design","click")
	tblBar.AddSpacer
	tblBar.CreateIcon("refresh").SetIcon("mdi mdi-refresh").SetTooltip("Refresh tree").SetClick(BANano.CallBack(Me,"refreshapp", Null)).pop
	hints.AddStep("refresh","Refresh","To refresh the tree, select this option","click")
	tblBar.CreateIcon("clearform").SetIcon("mdi mdi-trash-can").SetTooltip("Clear form").SetClick(BANano.CallBack(Me,"clearform", Null)).pop
	hints.AddStep("clearform","Clear Form", "To create a new form, first clear any existing form by selecting this option","click")
	'
	tblBar.CreateIcon("help").SetIcon("mdi mdi-help").SetTooltip("Hints").SetClick(BANano.CallBack(Me,"showhints", Null)).pop
	tblBar.CreateAvatar("avatar", "./assets/3.jpg").SetTooltip("Click here To change settings").AddToColumns(tblBar.ToolBar)
	hints.AddStep("avatar","Avatar", "Here is your profile picture, you can click to change the settings","click")
	
	
	tblBar.setPadding(3)
	'
	pg.AddToolBar(tblBar)
	' create the sidebar for the page
	Dim sm As WixSideBar
	sm.Initialize("smp").SetCollapsed(False).SetActiveTitle(True).SetScroll(True).SetSelect(True)
	hints.AddStep("smp","Side Bar", "This lists all elements that you can design with the BANanoWebix-FD","click")
	
	'
	'sm.AddItem("", "dp", "Data Presentation","","mdi mdi-view-dashboard", "","")
	'sm.AddItem("dp", "datatable", "DataTable","","./assets/datatable.png", "", "")
'	sm.AddItem("dp", "dataview", "DataView","","mdi mdi-view-dashboard", "","")
'	sm.AddItem("dp", "grouplist", "GroupList","","mdi mdi-view-dashboard", "","")
	'sm.AddItem("dp", "list", "List","","mdi mdi-view-dashboard", "","")
'	sm.AddItem("dp", "propertysheet", "Property Sheet","","mdi mdi-view-dashboard", "","")
'	sm.AddItem("dp", "tree", "Tree","","mdi mdi-view-dashboard", "","")
'	sm.AddItem("dp", "treetable", "TreeTable","","mdi mdi-view-dashboard", "","")
	'sm.AddItem("dp", "unitlist", "UnitList","","mdi mdi-view-dashboard", "","")
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
	'add control elements
	sm.AddItem("", "con", "Controls","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "button", "Button","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "checkbox", "CheckBox","","mdi mdi-checkbox-marked", "","")
	sm.AddItem("con", "colorpicker", "ColorPicker","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "combo", "Combo","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "counter", "Counter","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "datepicker", "DatePicker","","mdi mdi-calendar-outline", "","")
	sm.AddItem("con", "icon", "Icon","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "label", "Label","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "radio", "Radio","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "richselect", "RichSelect","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "search", "Search","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "select", "Select","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "segmented", "Segmented","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "slider", "Slider","","fas fa-sliders-h", "","")
	sm.AddItem("con", "switch", "Switch","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "tabbar", "TabBar","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "text", "Text","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "textarea", "TextArea","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "toggle", "Toggle","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "uploader", "Uploader","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "dbllist", "DoubleList","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "fieldset", "FieldSet","","mdi mdi-view-dashboard", "","")
	'
	sm.AddItem("", "hlp", "Helpers","","mdi mdi-view-dashboard", "","")
	sm.AddItem("hlp", "suggest", "Suggest","","mdi mdi-view-dashboard", "","")
	'sm.AddItem("con", "forminput", "FormInput","","mdi mdi-view-dashboard", "","")
	sm.AddItem("hlp", "pager", "Pager","","mdi mdi-view-dashboard", "","")
	'
	Dim R2 As WixRow
	R2.Initialize("R2")
	'
	R2.AddColumns(sm.Item)
	'
	'add a tree
	Dim tree As WixTree
	tree.Initialize("tree").SetSelect(True).SetScroll(True).SetWidth(300).SetTypeLineTree(True).SetBorderLess(False)
	hints.AddStep("tree","Tree", "After you save your element, it will be listed under the Form node here and you can select and update its properties","click")
	
	'
		  
	R2.AddColumns(tree.Item)
	'add a resizer
	Dim res As WixResizer
	res.Initialize("")
	R2.AddColumns(res.item)
	'
	'form holder (property bag)
	Dim formHolder As WixRow
	formHolder.Initialize("formholder")
	' container to show elements
	div.Initialize("views","div").SetStyle("width","100%").SetStyle("height","100%")
	hints.AddStep("views","Views", "The result of your design or element during design will be shown here","click")
	
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
	hints.AddStep("propform","Property", "For each element, you design it by specifying its properties here","click")
	' toolbar for the property bag
	Dim tbl As WixToolBar
	tbl.Initialize("proptbl")
	tbl.AddSpacer
	tbl.CreateIcon("propsave").SetIcon("mdi mdi-content-save").SetTooltip("Save").SetClick(BANano.CallBack(Me,"prop_savewait",Null)) .Pop
	hints.AddStep("propsave","Save Design", "After you have updated the properties of the design element you are working with, select Save here to save the element's properties for later updating.","click")
	tbl.CreateIcon("propdelete").SetIcon("mdi mdi-delete-outline").SetTooltip("Delete").SetClick(BANano.CallBack(Me,"prop_delete",Null)).Pop
	hints.AddStep("propdelete","Delete Design", "You can delete a saved design element by selecting this option. You are unable to undo changes if you delete","click")
	'
	propBag.Initialize("propbag").SetWidth(300).setnamewidth(150).SetScroll(True)
	'
	frm.AddRows(tbl.Item)
	frm.AddRows(propBag.Item)
	'
	R2.AddColumns(frm.Item)
	pg.AddRow(R2)
	'
	pg.ui
	'
	'side bar click
	Dim meid As Map
	pg.OnItemClick("smp", BANano.CallBack(Me, "sidebar_click", Array(meid)))
	'tree click
	Dim recid As String
	pg.OnItemClick("tree", BANano.CallBack(Me, "tree_clickwait", Array(recid)))
	'open database
	SQL.OpenWait("fd","fd")
	RefreshTree
	'
	'start hints
	pg.StartHint(hints)
End Sub

Sub SetImage(pID As String, itmID As String, imgURL As String)
	'return "<span class='webix_icon webix_sidebar_icon'>
	'<img src='https://docs.webix.com/samples/17_datatree/03_styles/icons/"+obj.icon+".png'></span>";
	Dim img As UOENowHTML
	img.Initialize("","img").SetSRC(imgURL,True)
	'
	Dim icon As UOENowHTML
	icon.Initialize("","span").SetImportant(False).AddClass("webix_icon").addclass("webix_sidebar_icon")
	'
	icon.AddContent(img.HTML)
	'
	Dim icons As String = icon.HTML
	'
	Dim opt As Map = CreateMap("template":icons)
	pg.UpdateItem(pID,itmID, opt)
End Sub

Sub showhints
	pg.StartHint(hints)
End Sub

Sub refreshapp
	'clear the formholder
	Dim opt As Map = CreateMap("template": div.HTML)
	pg.Define("formholder", opt)
	pg.Refresh("formholder")
	RefreshTree
End Sub

'refresh the tree whenever an item is saved
Sub RefreshTree
	'clear tree
	pg.ClearAll("tree")
	'add form element
	pg.AddNode("tree", "", "form", "Form", "", pg.EnumWixIcons.Folder,"","",True)
	'open items and load to the tree
	rec = BANanoSQLUtils.SelectWhere("items", Array("*"), CreateMap("parentid":"form"), Array("id"))
	qry = rec.Get("sql")
	args = rec.Get("args")
	result = SQL.ExecuteWait(qry,args)
	For Each item As Map In result
		Dim itmID As String = item.Get("id")
		pg.AddNode("tree", "form", itmID, itmID, "", pg.EnumWixIcons.FileIcon,"","",False)
	Next
	pg.Refresh("tree")
End Sub

'save the item
Sub prop_saveWait
	'get the property bag
	Dim prop As Map = pg.GetValues("propbag")
	Dim v As String = prop.Get("view")
	Dim i As String = prop.Get("id")
	Dim p As String = prop.GetDefault("parentid","")
	Dim idx As String = prop.getdefault("tabindex","0")
	json = BANano.ToJson(prop)
	'
	i = i.tolowercase
	'
	Select Case v
	Case "Form", "form"
		'does the record exist, if not add it
		rec = BANanoSQLUtils.SelectWhere("forms", Array("*"), CreateMap("id":i),Array("id"))
		qry = rec.Get("sql")
		args = rec.get("args")
		result = SQL.ExecuteWait(qry,args)
		'new record
		rec = CreateMap()
		rec.Put("json", json)
		rec.Put("id", i)
		If result.size = 0 Then
			record = BANanoSQLUtils.Insert("forms", rec)
			qry = record.Get("sql")
			args = record.Get("args")
			affected = SQL.ExecuteWait(qry,args)
			pg.Message_Success(affected & " record(s) affected!")
		Else
			'update form record	
			record = BANanoSQLUtils.UpdateWhere("forms",rec,CreateMap("id":i))
			qry = record.Get("sql")
			args = record.Get("args")
			affected = SQL.ExecuteWait(qry,args)
			pg.Message_Success(affected & " record(s) affected!")
		End If
	Case Else
		'preview the item on designer	
		Dim m As Map = CreateView(prop)
		PreView(m)
		'save record to db, does it exist
		rec = BANanoSQLUtils.SelectWhere("items", Array("*"), CreateMap("id":i), Array("id"))
		qry = rec.Get("sql")
		args = rec.Get("args")
		result = SQL.ExecuteWait(qry,args)
		rec = CreateMap()
		rec.Put("json", json)
		rec.put("parentid", p)
		rec.Put("tabindex", idx)
		rec.Put("id", i)
		If result.Size = 0 Then
			'item does not exist
			record = BANanoSQLUtils.Insert("items", rec)
			qry = record.Get("sql")
			args = record.Get("args")
			affected = SQL.ExecuteWait(qry,args)
			pg.Message_Success(affected & " record(s) affected!")
		Else
			'item exist, update it
			record = BANanoSQLUtils.UpdateWhere("items",rec,CreateMap("id":i))
			qry = record.Get("sql")
			args = record.Get("args")
			affected = SQL.ExecuteWait(qry,args)
			pg.Message_Success(affected & " record(s) affected!")
		End If
	End Select
	'refresh tree
	RefreshTree
End Sub

'clear form
Sub clearform
	Dim confirmresult As Boolean = False
	Dim cb As BANanoObject = BANano.CallBack(Me,"clearform1wait",Array(confirmresult))
	pg.Confirm(cb, "Confirm Delete", "Are you sure that you want to clear this form? You will not be able to undo your changes. Continue?")
End Sub

Sub clearform1wait
	qry = BANanoSQLUtils.DeleteAll("items")
	affected = SQL.ExecuteWait(qry, Null)
	pg.Message_Success(affected & " record(s) affected!")
	RefreshTree
End Sub


'delete the property
Sub prop_delete
	Dim rp As Map = pg.GetValues("propbag")
	delID = rp.Get("id")
	If delID = "" Then Return
	'
	Dim confirmresult As Boolean = False
	Dim cb As BANanoObject = BANano.CallBack(Me,"deleteprop",Array(confirmresult))
	pg.Confirm(cb, "Confirm Delete", "Are you sure that you want to delete this item? You will not be able to undo your changes. Continue?")
End Sub

Sub deleteprop(confirmresult As Boolean)
	If confirmresult = False Then Return
	Dim delmap As Map = BANanoSQLUtils.DeleteWhere("items",CreateMap("id":delID))
	qry = delmap.Get("sql")
	args = delmap.Get("args")
	affected = SQL.ExecuteWait(qry, args) 
	pg.Message_Success(affected & " record(s) affected!")
	RefreshTree
End Sub

'create the view object from saved / property bag
Sub CreateView(properties As Map) As Map
	'get the view
	Dim v As String = properties.Get("view")
	Dim i As String = properties.Get("id")
	'
	Dim view As WixElement
	view.Initialize(i)
	'
	Dim optionsid As String
	Dim optionstext As String
	Dim options As List
	options.Initialize
	Dim ids() As String
	Dim texts() As String
	Dim idLen As Int
	Dim txtLen As Int
	' 
	Select Case v
	Case "combo", "richselect", "radio", "select", "segmented", "tabbar","dbllist","suggest"
		optionsid = properties.Get("optionsid")
		optionstext = properties.Get("optionstext")
		Log(optionsid)
		Log(optionstext)
		
		ids = BANano.Split(",",optionsid)
		texts = BANano.Split(",", optionstext)
		idLen = ids.Length
		txtLen = texts.Length
		If idLen <> txtLen Then
			pg.Message_Error(i & " options do not tally!")
			Return view.Item
		End If
		Dim x As Int
		For x = 0 To idLen - 1
			Dim idx As String = ids(x)
			Dim txtx As String = texts(x)
			options.Add(CreateMap("id":idx, "value":txtx))
		Next
		properties.remove("optionsid")
		properties.remove("optionstext")
		Select Case v
		Case "dbllist","suggest"
			properties.Put("data", options)
		Case Else
			properties.Put("options", options)
		End Select
	End Select
	
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
	Return view.Item
End Sub

'preview the item from saved map / property bag
Sub PreView(m As Map)
	'clear the formholder
	Dim opt As Map = CreateMap("template": div.HTML)
	pg.Define("formholder", opt)
	pg.Refresh("formholder")
	'create the view
	pg.UX(m)
End Sub

Sub tree_clickwait(recid As String)
	Select Case recid
	Case "form"
		'we have clicked a form
		dForm.BuildBag(pg, propBag)
		' read record from db
		rec = BANanoSQLUtils.SelectWhere("forms", Array("*"), CreateMap("id":"form"),Array("id"))
		qry = rec.Get("sql")
		args = rec.get("args")
		result = SQL.ExecuteWait(qry,args)
		If result.Size = 0 Then
		Else
			'read from db and update property bag
			record = result.Get(0)
			json = record.Get("json")
			rec = pg.Json2Map(json)
			pg.SetValues("propbag", rec)
		End If
		
		'Dim m As Map = BANano.GetSessionStorage("form")
	Case Else
		rec = BANanoSQLUtils.SelectWhere("items", Array("*"), CreateMap("id":recid),Array("id"))
		qry = rec.Get("sql")
		args = rec.Get("args")
		result = SQL.ExecuteWait(qry,args)
		If result.Size = 0 Then
		Else	
			'read record to assign to property bag
			record = result.Get(0)
			json = record.get("json")
			rec = pg.Json2Map(json)
			Dim v As String = rec.get("view")
			v = v.ToLowerCase
			DrawPropBag(v)
			pg.SetValues("propbag", rec)
			Dim m As Map = CreateView(rec)
			PreView(m)
		End If
	End Select
End Sub

'on sidebar click, draw up the property bag
Sub sidebar_click(meid As String)
	If DrawPropBag(meid) Then
		rec = pg.GetValues("propbag")
		Dim m As Map = CreateView(rec)
		PreView(m)
	End If
End Sub

Sub DrawPropBag(con As String) As Boolean
	Select Case con
		Case "button"
			dButton.BuildBag(pg, propBag)
			Return True
		Case "checkbox"
			dCheckBox.BuildBag(pg, propBag)
			Return True
		Case "colorpicker"
			dColorPicker.BuildBag(pg, propBag)
			Return True
		Case "combo"
			dCombo.BuildBag(pg, propBag)
			Return True
		Case "counter"
			dCounter.BuildBag(pg, propBag)
			Return True
		Case "datepicker"
			dDatePicker.BuildBag(pg, propBag)
			Return True
		Case "icon"
			dIcon.BuildBag(pg, propBag)
			Return True
		Case "label"
			dLabel.BuildBag(pg, propBag)
			Return True
		Case "radio"
			dRadio.BuildBag(pg, propBag)
			Return True
		Case "richselect"
			dRichSelect.BuildBag(pg, propBag)
			Return True
		Case "search"
			dSearch.BuildBag(pg, propBag)
			Return True
		Case "select"
			dSelect.BuildBag(pg, propBag)
			Return True
		Case "segmented"
			dSegmented.BuildBag(pg, propBag)
			Return True
		Case "slider"
			dSlider.BuildBag(pg, propBag)
			Return True
		Case "switch"
			dSwitch.BuildBag(pg, propBag)
			Return True
		Case "tabbar"
			dTabBar.BuildBag(pg, propBag)
			Return True
		Case "text"
			dText.BuildBag(pg, propBag)
			Return True
		Case "textarea"
			dTextArea.BuildBag(pg, propBag)
			Return True
		Case "toggle"
			dToggle.BuildBag(pg, propBag)
			Return True
		Case "uploader"
			dUploader.BuildBag(pg, propBag)
			Return True
		Case "dbllist"
			dDBLList.BuildBag(pg, propBag)
			Return True
		Case "fieldset"
			dFieldSet.BuildBag(pg, propBag)
			Return True
		Case "suggest"
			dSuggest.BuildBag(pg, propBag)
			Return True
		Case "forminput"
		Case "pager"
			dPager.BuildBag(pg, propBag)
			Return True
	End Select
	Return False
End Sub

Sub OpenMenu()
	pg.Toggle("smp")
End Sub
