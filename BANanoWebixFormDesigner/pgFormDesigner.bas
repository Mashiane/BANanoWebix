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
	Public div As UOENowHTML
	Private delID As String
	Private hints As WixHint
	Public code As UOENowHTML
	Private dbName As String
	Private rec As Map
	Private qry As String
	Private res As String
	Private rs As SQLiteResultSet
	Private json As String
	Private sqlite As BANanoSQLite
	Public addingmethod As List
	Public propBag As WixProperty
	Private winux As BANanoObject
End Sub

Sub Init()
	addingmethod.Initialize
	addingmethod.AddAll(Array("","AddRows","AddColumns","AddElements","AddCols","AddCells"))
	'
	dbName = Main.dbname
	hints.Initialize("hints") 
	'create page
	pg.Initialize("wp", "body").SetTypeSpace("").SetResponsive(True).SetAppName(Main.AppName)
	
'	Dim tv As WixTabView1
'	tv.Initialize("tv").SetTypeBottom(True)
'	'
'	Dim t1 As WixTab
'	t1.Initialize("tv1").SetIcon("mdi mdi-access-point-network").SetClose(True).SetTitle("Home")
'	t1.Body.SetTemplate("Tab 1 Template")
'	tv.AddTab(t1)
'	'
'	Dim t2 As WixTab
'	t2.Initialize("tv2").SetIcon("mdi mdi-camera-front-variant").SetClose(True).SetTitle("Camera")
'	t2.Body.SetTemplate("Tab 2 Template")
'	tv.AddTab(t2)
'	'
'	pg.AddRows(tv.item)
	
	' create the toolbar for the page
	'
	Dim tblBar As WixToolBar = modToolBar.getToolBar
	pg.AddToolBar(tblBar)
	hints.AddStep("heading","Welcome","Welcome to the BANanoWebix - Form Designer","click")
	hints.AddStep("menuopen","Side Bar","You can toggle the side bar menu to access elements that you can design","click")
	hints.AddStep("smp","Side Bar", "This lists all elements that you can design with the BANanoWebix-FD. First you need to create a form. To create a form, select Layouts and select Form, this will add the form properties on the bag.","click")
	hints.AddStep("propform","Property", "The form details will appear here, update the settings you need for the form","click")
	hints.AddStep("propsave","Save Form/Element", "After you have updated the properties of the design element you are working with, select Save here to save the element's properties for later updating.","click")
	hints.AddStep("propdelete","Delete Design", "You can delete a saved design element by selecting this option. You are unable to undo changes if you delete","click")
	hints.AddStep("tree","Tree", "After you save your element in the property bag, it will be listed under the parent element you chose for it here and you can select and update its properties again if you want.","click")
	hints.AddStep("formholder","Preview & Source Code", "The result of your design element during design will be shown here & the source code to use in your BANanoWebix project","click")
	
	hints.AddStep("multi", "Multi Elements", "Select here to add multi elements, you provide the names of the elements separated by a comma","click")
	hints.AddStep("refresh","Refresh","To refresh the tree, select this option","click")
	hints.AddStep("clearform","Clear Form", "To create a new form, first clear any existing form by selecting this option","click")
	hints.AddStep("help","Hints", "You can access the hints from here too","click")
	'hints.AddStep("avatar","Avatar", "Here is your profile picture, you can click to change the settings","click")
	
	
	'
	'Dim mymenu As WixMenu = elementmenu.GetElementsMenu
	'pg.Page.AddRows(mymenu.Item)
	' create the sidebar for the page
	Dim sm As WixSideBar = modSideBar.getSideBar
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
	R2.AddColumns(tree.Item)
	'add a resizer
	Dim res1 As WixResizer
	res1.Initialize("")
	R2.AddColumns(res1.item)
	'
	Dim formholder As WixRow = modCenter.getCenter
	R2.AddColumns(formholder.Item)
	
	'
	'add a resizer
	Dim res1 As WixResizer
	res1.Initialize("")
	R2.AddColumns(res1.item)
	'
	propBag.Initialize("propbag").SetWidth(300).setnamewidth(150).SetScroll(True)
	Dim frm As WixForm = modPropertyBag.getPropertyBag
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
	'propbag
	pg.OnAfterEditStop("propbag", BANano.CallBack(Me, "prop_saveWait", Null))
	pg.OnCheck("propbag",BANano.CallBack(Me, "prop_saveWait", Null))
	'open database
	RefreshTreeWait
	'
	'start hints
	pg.StartHint(hints)
End Sub

'show window to add multiple elements
Sub multiels
	'see selected treeitem
	Dim parentid As String = pg.GetSelectedID("tree")
	If parentid = "" Then
		pg.Message_Error("Please select the parent item from the tree first, then select the element you want to add! Remember to click Save in the property bag when done.")
		Return
	End If
	pg.ShowWindow(CreateWindow)
End Sub

Sub showhints
	pg.StartHint(hints)
End Sub

Sub refreshapp
	'
	ClearPreviewIT
	ClearCodeIT
	RefreshTreeWait
End Sub

Sub ClearPreviewIT
	Dim opt As Map = CreateMap("template": div.HTML)
	pg.Define("previewit", opt)
	pg.Refresh("previewit")
End Sub

Sub ClearCodeIT
	Dim opt1 As Map = CreateMap("template": code.HTML)
	pg.Define("codeit", opt1)
	pg.Refresh("codeit")
End Sub

'refresh the tree whenever an item is saved
Sub RefreshTreeWait
	'clear tree
	pg.ClearAll("tree")
	'load all forms
	sqlite.Initialize
	qry = sqlite.SelectAll("forms", Array("id"), Array("id"))
	res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
	rs = sqlite.GetResultSet(qry, res)
	For Each fitem As Map In rs.result
		Dim fid As String = fitem.Get("id")
		pg.AddNode("tree", "", fid, fid, "", pg.EnumWixIcons.Folder,"","",True)
	Next
	
	'open items and load to the tree
	sqlite.Initialize
	sqlite.AddStrings(Array("id")) 
	qry = sqlite.SelectAll("items", Array("*"), Array("tabindex"))
	res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
	rs = sqlite.GetResultSet(qry, res)
	For Each item As Map In rs.result
		Dim itmID As String = item.Get("id")
		Dim parentid As String = item.Get("parentid")
		pg.AddNode("tree", parentid, itmID, itmID, "", pg.EnumWixIcons.FileIcon, "", "", True)
	Next
	pg.Refresh("tree")
End Sub

'save the item
Sub prop_saveWait
	'get the property bag
	Dim prop As Map = pg.GetValues("propbag")
	Dim v As String = prop.Get("view")
	Dim i As String = prop.Get("id")
	'ensure id is always lowercase
	i = i.tolowercase
	prop.Put("id", i)
	Dim p As String = prop.GetDefault("parentid","")
	If p <> "" Then
		p = p.ToLowerCase
		prop.Put("parentid", p)
	End If
	Dim idx As String = prop.getdefault("tabindex","0")
	'convert property bag to json
	json = BANano.ToJson(prop)
	'
	Select Case i
	Case "form"
		'does the record exist, if not add it
		'preview the item on designer
		Dim m As Map = CreateView(prop)
		Dim m1 As Map = SourceCode(m,prop)
		PreviewCode(m1)
		
		sqlite.initialize
		sqlite.AddStrings(Array("id"))
		qry = sqlite.SelectWhere("forms", Array("*"), CreateMap("id":i),Array("id"))
		res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
		rs = sqlite.GetResultSet(qry,res)
		'new record
		rec = CreateMap()
		rec.Put("json", json)
		rec.Put("id", i)
		rec.put("parentid", p)
		If rs.result.size = 0 Then
			sqlite.Initialize
			sqlite.AddStrings(Array("id"))
			qry = sqlite.Insert("forms", rec)
			res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
			rs = sqlite.GetResultSet(qry,res)
			
			pg.Message_Success(rs.result.size & " record(s) affected!")
		Else
			'update form record	
			sqlite.Initialize 
			sqlite.AddStrings(Array("id"))
			qry = sqlite.UpdateWhere("forms",rec,CreateMap("id":i))
			res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
			rs = sqlite.GetResultSet(qry,res)
			pg.Message_Success(rs.result.size & " record(s) affected!")
		End If
	Case Else
		'check if we have parent on tree
		If p <> "" Then
			Dim bexist As Boolean = pg.Exists("tree", p)
			If bexist = False Then
				pg.Message_Error("The parent id of this element cannot be found!")
				Return
			End If
		End If
	
		'preview the item on designer	
		Dim m As Map = CreateView(prop)
		Dim m1 As Map = SourceCode(m,prop)
		PreView(m,m1)
		'save record to db, does it exist
		sqlite.Initialize 
		sqlite.AddStrings(Array("id"))
		qry = sqlite.SelectWhere("items", Array("*"), CreateMap("id":i), Array("id"))
		res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
		rs = sqlite.GetResultSet(qry,res)
		rec = CreateMap()
		rec.Put("json", json)
		rec.put("parentid", p)
		rec.Put("tabindex", idx)
		rec.Put("id", i)
		If rs.result.Size = 0 Then
			'item does not exist
			sqlite.Initialize 
			sqlite.AddStrings(Array("id"))
			qry = sqlite.Insert("items", rec)
			res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
			rs = sqlite.GetResultSet(qry,res)
			pg.Message_Success(rs.result.size & " record(s) affected!")
		Else
			'item exist, update it
			sqlite.Initialize 
			sqlite.AddStrings(Array("id"))
			qry = sqlite.UpdateWhere("items",rec,CreateMap("id":i))
			res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
			rs = sqlite.GetResultSet(qry,res)
			pg.Message_Success(rs.result.size & " record(s) affected!")
		End If
	End Select
	'refresh tree
	RefreshTreeWait
End Sub

'clear form
Sub clearform
	Dim confirmresult As Boolean = False
	Dim cb As BANanoObject = BANano.CallBack(Me,"clearform1wait",Array(confirmresult))
	pg.Confirm(cb, "Confirm Delete", "Are you sure that you want to clear this form? You will not be able to undo your changes. Continue?")
End Sub

Sub clearform1wait
	sqlite.Initialize 
	sqlite.AddStrings(Array("id"))
	qry = sqlite.DeleteAll("items")
	res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
	rs = sqlite.GetResultSet(qry,res)
	pg.Message_Success(rs.result.size & " record(s) affected!")
	refreshapp
End Sub

'delete the property
Sub prop_delete
	Dim rp As Map = pg.GetValues("propbag")
	delID = rp.Get("id")
	If delID = "" Then Return
	'
	Dim confirmresult As Boolean = False
	Dim cb As BANanoObject = BANano.CallBack(Me,"deletepropwait",Array(confirmresult))
	pg.Confirm(cb, "Confirm Delete", "Are you sure that you want to delete this item? You will not be able to undo your changes. Continue?")
End Sub

Sub deletepropwait(confirmresult As Boolean)
	If confirmresult = False Then Return
	sqlite.initialize
	sqlite.AddStrings(Array("id"))
	qry = sqlite.DeleteWhere("items",CreateMap("id":delID))
	res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
	rs = sqlite.GetResultSet(qry,res)
	pg.Message_Success(rs.result.size & " record(s) affected!")
	refreshapp
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
		Dim pval As String = properties.Get(pkey)
		Dim cval As String = pg.CStr(pval)
		If cval <> "" Then
			If pkey = "view" And cval.tolowercase = "row" Then Continue
			If pkey = "view" And cval.tolowercase = "column" Then Continue
			If pkey = "addingmethod" Then Continue
			If pkey = "style.color" Then 
				view.SetStyle("color", cval)
				Continue
			End If
			If pkey = "style.background" Then
				view.SetStyle("background", cval)
				Continue
			End If
			view.SetAttr(pkey, pval)
		End If
	Next
	'dont do rows and columns, they dont have views
	Select Case v.ToLowerCase
	Case "row", "column"
	Case Else
		view.SetAttr("view", v.ToLowerCase)
	End Select
	view.SetAttr("container", "previewit")
	Return view.Item
End Sub

Sub Capitalize(t As String) As String
	Dim s , r , o As String
	s = t.SubString2(0,1)
	r = t.SubString2(1, t.Length)
	o = s.ToUpperCase & r
	Return o
End Sub

Sub SourceCodeItem(m As Map, original As Map) As String
	Dim v As String = m.Get("view")
	Dim i As String = m.Get("id")
	v = pg.CStr(v)
	If v = "undefined" Then v = "Element"
	'
	Dim sparentid As String = original.Get("parentid")
	Dim saddingmethod As String = original.Get("addingmethod")
	
	'
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append($"Dim ${i} As Wix${v}"$).Append("<br>")
	sb.Append($"${i}.Initialize("${i}")"$).Append("<br>")
	For Each strKey As String In m.Keys
		If strKey = "id" Then Continue
		'If strKey = "container" Then Continue
		'If strKey = "view" Then Continue
		If strKey = "parentid" Then Continue
		'If strKey = "localId" Then Continue
		If strKey = "tabindex" Then Continue
		Dim strVal As Object = m.Get(strKey)
		Dim k As String = Capitalize(strKey)
		If GetType(strVal) = "object" Then
			Dim xval As String = pg.Map2JsonPretty(strVal)
			sb.Append($"${i}.Set${k}("${xval}")"$).Append("<br>")
		Else
			sb.Append($"${i}.Set${k}("${strVal}")"$).Append("<br>")
		End If
	Next
	If sparentid <> "" Then
		sb.Append(sparentid).Append(".").Append(saddingmethod).Append("(").Append(i).Append(".Item)")
	End If
	Return sb.tostring
End Sub

Sub SourceCode(m As Map,original As Map) As Map
	'get the source code of the item
	Dim elCode As String = SourceCodeItem(m, original)
	'
	Dim sb As StringBuilder
	sb.Initialize 
	sb.Append("<pre>")
	sb.Append(elCode)
	sb.Append("</pre>")
	'
	Dim eout As WixElement
	eout.Initialize("")
	eout.SetAttr("container", "codeit")
	'
	eout.SetTemplate(sb.ToString)
	Return eout.Item
End Sub

'preview the item from saved map / property bag
Sub PreView(m As Map, m1 As Map)
	ClearPreviewIT
	ClearCodeIT
	'create the view
	pg.UX(m)
	pg.UX(m1)
End Sub

Sub PreviewCode(sc As Map)
	ClearCodeIT
	pg.UX(sc)
End Sub

Sub tree_clickwait(recid As String)
	Select Case recid
	Case "form"
		'we have clicked a form
		dForm.BuildBag(pg, propBag)
		' read record from db
		sqlite.Initialize 
		sqlite.AddStrings(Array("id"))
		qry = sqlite.SelectWhere("forms", Array("*"), CreateMap("id":"form"),Array("id"))
		res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
		rs = sqlite.GetResultSet(qry,res)
		If rs.result.Size = 0 Then
		Else
			'read from db and update property bag
			rec = rs.result.Get(0)
			json = rec.Get("json")
			rec = pg.Json2Map(json)
			pg.SetValues("propbag", rec)
		End If
		'update parents
		sqlite.Initialize
		sqlite.AddStrings(Array("id"))
		qry = sqlite.SelectAll("items", Array("*"), Array("id"))
		res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
		rs = sqlite.GetResultSet(qry,res)
		Dim formView As Map = CreateView(rec)
		Dim m1 As Map = SourceCode(formView,rec)
		PreviewCode(m1)
	Case Else
		sqlite.Initialize 
		sqlite.AddStrings(Array("id"))
		qry = sqlite.SelectWhere("items", Array("*"), CreateMap("id":recid),Array("id"))
		res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
		rs = sqlite.GetResultSet(qry,res)
		If rs.result.Size = 0 Then
		Else	
			'read record to assign to property bag
			rec = rs.result.Get(0)
			json = rec.get("json")
			rec = pg.Json2Map(json)
			Dim v As String = rec.get("view")
			v = pg.CStr(v)
			If v = "" Or v = "undefined" Then 
				v = "Element"
				rec.Put("view", "Element")
			End If
			v = v.ToLowerCase
			DrawPropBag(v)
			pg.SetValues("propbag", rec)
			Dim m As Map = CreateView(rec)
			Dim m1 As Map = SourceCode(m,rec)
			PreView(m,m1)
		End If
	End Select
End Sub

'on sidebar click, draw up the property bag
Sub sidebar_click(meid As String)
	Select Case meid
		Case "con", "hlp", "buttons", "txts", "sels", "choices", "pickers","others","grid", "lay"
	Case "form"
		If DrawPropBag(meid) Then
			rec = pg.GetValues("propbag")
			Dim m As Map = CreateView(rec)
			Dim m1 As Map = SourceCode(m,rec)
			PreView(m,m1)
		End If
	Case Else
		'see selected treeitem
		Dim parentid As String = pg.GetSelectedID("tree")
		If parentid = "" Then
			pg.Message_Error("Please select the parent item from the tree first, then select the element you want to add! Remember to click Save in the property bag when done.")
			Return
		End If
		If DrawPropBag(meid) Then
			'update the parentid
			pg.Define("propbag", CreateMap("parentid":parentid))
			pg.Refresh("propbag")
			rec = pg.GetValues("propbag")
			Dim m As Map = CreateView(rec)
			Dim m1 As Map = SourceCode(m,rec)
			PreView(m,m1)
		End If
	End Select
End Sub

Sub DrawPropBag(con As String) As Boolean
	Select Case con
		Case "form"
			dForm.BuildBag(pg, propBag)
		Case "row"
			dRow.BuildBag(pg, propBag)
			Return True
		Case "column"
			dColumn.BuildBag(pg, propBag)
			Return True
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


Sub CreateWindow As BANanoObject
	Dim win As WixWindow
	win.Initialize("myWindow").SetWidth(700).SetHeight(400).SetMove(True)
	win.SetPositionCenter("")
	win.SetModal(True)
	win.ToolBar.SetPadding(10)
	win.ToolBar.CreateLabel("lbl").SetLabel("Add Multiple Controls").Pop
	win.ToolBar.CreateIcon("icnclose").SetIcon("mdi mdi-close").SetClick(BANano.CallBack(Me,"closeWin",Null)).pop
	'replace normal header
	win.SetToolBar(True)
	'
	Dim frmx As WixForm
	frmx.Initialize("frmx").SetBorderless(True)
	' 
	Dim txtArea As WixTextArea
	txtArea.Initialize("txtmultiplecontrols").SetLabel("Enter the names of the multiple controls separated by a comma.")
	txtArea.SetLabelPosition("top").SetInvalidMessage("No elements have been entered!")
	txtArea.SetRequired(True).SetValidateIsNotEmpty(True).SetValidateEventBlur(True)
	frmx.AddRows(txtArea.Item)
	'
	Dim btnSave As WixButton
	btnSave.Initialize("btnMulti").SetLabel("Apply").SetClick(BANano.callback(Me,"addmulti_elementswait",Null))
	btnSave.SetBadge("0")
	frmx.AddRows(btnSave.Item)
	 
	win.setbody(frmx.Item)
	'win.SetFullScreen(True)
	winux = pg.AddWindow(win)
	'detect change event
	pg.OnKeyPress("txtmultiplecontrols", BANano.callback(Me, "multichange", Null))
	Return winux
End Sub

Sub addmulti_elementswait
	'see selected treeitem
	Dim parentid As String = pg.GetSelectedID("tree")
	If parentid = "" Then
		pg.Message_Error("Please select the parent item from the tree first, then select the element you want to add! Remember to click Save in the property bag when done.")
		Return
	End If
	'validate the form
	Dim fValid As Boolean = pg.Validate("frmx")
	If fValid = False Then
		pg.Message_Error("No elements have been entered!")
		Return
	End If
	'get the contents of the form
	Dim scontrols As String = pg.GetValue("txtmultiplecontrols")
	scontrols = scontrols.trim
	'
	'split the controls so we get each
	Dim controls() As String = BANano.Split(",", scontrols)
	Dim tbindex As Int = 0
	For Each ctrl As String In controls
		tbindex = tbindex + 1
		ctrl = ctrl.Trim
		If ctrl <> "" Then
			ctrl = ctrl.ToLowerCase
			Dim newctrl As Map = TemporalText
			newctrl.Put("id", ctrl)
			newctrl.Put("parentid", parentid)
			newctrl.Put("localId", ctrl)
			newctrl.Put("name", ctrl)
			newctrl.Put("tabindex",tbindex)
			newctrl.Put("label",ctrl)
			'convert to json
			Dim json As String = pg.Map2Json(newctrl)
			'insert the record to elements
			'item does not exist
			sqlite.Initialize
			sqlite.AddStrings(Array("id"))
			Dim rec As Map = CreateMap()
			rec.Put("id", ctrl)
			rec.put("json", json)
			rec.Put("tabindex", tbindex)
			rec.Put("parentid", parentid)
			qry = sqlite.Insert("items", rec)
			res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
			rs = sqlite.GetResultSet(qry,res)
			pg.Message_Success(rs.result.size & " record(s) affected!")
		End If
	Next
	pg.Close(winux)
	RefreshTreeWait
End Sub

'when the txtarea changes, update the badge on the button
'to reflect the number of items to add
Sub multichange()
	Dim scontrols As String = pg.GetValue("txtmultiplecontrols")
	scontrols = scontrols.trim
	If scontrols = "" Then
		pg.Define("btnMulti", CreateMap("badge":"0"))
		pg.Refresh("btnMulti")
	Else	
		Dim cCount As Int = pg.MvCount(scontrols, ",")
		pg.Define("btnMulti", CreateMap("badge":cCount))
		pg.Refresh("btnMulti")
	End If
End Sub

Sub TemporalText() As Map
	Dim t As Map = CreateMap()
	t.Put("id","text1")
	t.Put("localId","text1")
	t.Put("parentid","form")
	t.Put("addingmethod","AddRows")
	t.Put("tabindex","0")
	t.Put("view","text")
	t.Put("type","text")
	t.Put("inputAlign","left")
	t.Put("label","Text 1")
	Return t
End Sub

Sub closeWin
	pg.Close(winux)
End Sub
