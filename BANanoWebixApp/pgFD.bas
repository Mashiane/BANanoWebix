B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.51
@EndOfDesignText@
'Static code module
#IgnoreWarnings:12
Sub Process_Globals
	Private pg As WixPage
	Private BANano As BANano  'ignore
	Public div As UOENowHTML
	Private delID As String
	Private hints As WixHint
	Public code As UOENowHTML
	Private dbName As String
	Private rec As Map
	Private json As String
	Public addingmethod As List
	Public propBag As WixProperty
	Private winux As BANanoObject
	Private drawn As BANanoObject
	Private fldWin As BANanoObject
	Private lastcode As String
End Sub

Sub Init()
	
	addingmethod.Initialize
	addingmethod.AddAll(Array("","AddRows","AddColumns","AddElements","AddDataColumns","AddCells","AddButton","AddLabel","AddElement","AddToggle","AddIcon","SetBody"))
	'
	dbName = Main.dbname
	'create page
	pg.Initialize("wp", "body").SetTypeSpace("").SetResponsive(True).SetAppName(Main.AppName)
	
	' create the toolbar for the page
	'
	Dim tblBar As WixToolBar = modToolBar.getToolBar
	pg.AddToolBar(tblBar)
	
	hints.Initialize("hints")
	hints.AddStep("heading","Welcome","Welcome to the BANanoWebix - Form Designer","click")
	hints.AddStep("menuopen","Side Bar","You can toggle the side bar menu to access elements that you can design","click")
	hints.AddStep("smp","Side Bar", "This lists all elements that you can design with the BANanoWebix-FD. First you need to create a form. To create a form, select Layouts and select Form, this will add the form properties on the bag.","click")
	hints.AddStep("propform","Property", "The form details will appear here, update the settings you need for the form","click")
	hints.AddStep("propsave","Save Form/Element", "After you have updated the properties of the design element you are working with, select Save here to save the element's properties for later updating.","click")
	hints.AddStep("propdelete","Delete Design", "You can delete a saved design element by selecting this option. You are unable to undo changes if you delete","click")
	hints.AddStep("tree","Tree", "After you save your element in the property bag, it will be listed under the parent element you chose for it here and you can select and update its properties again if you want.","click")
	hints.AddStep("formholder","Preview & Source Code", "The result of your design element during design will be shown here & the source code to use in your BANanoWebix project","click")
	
	'hints.AddStep("multi", "Multi Elements", "Select here to add multi elements, you provide the names of the elements separated by a comma","click")
	hints.AddStep("refresh","Refresh","To refresh the tree, select this option","click")
	hints.AddStep("clearform1","Trash project", "This empties the project","click")
	hints.AddStep("help","Hints", "You can access the hints from here too","click")
	hints.AddStep("collab","Collaborate", "You can collaborate here when the need arises.", "click")
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
	tree.setdrag(True)
	'
	R2.AddColumns(tree.Item)
	R2.CreateResizer("").AddToColumns(R2.Row)
	
	'
	propBag.Initialize("propbag").SetWidth(400).setnamewidth(150).SetScroll(True)
	Dim frm As WixForm = modPropertyBag.getPropertyBag
	R2.AddColumns(frm.Item)
	R2.CreateResizer("").AddToColumns(R2.Row)
	'
	'Dim formholder As  = modCenter.getCenter
	Dim acc As WixAccordion = modCenter.getCenter
	
	'R2.AddColumns(formholder.Item)
	R2.AddColumns(acc.item)
	pg.AddRow(R2)
	'
	pg.ui
	'
	' register a popup for the property bag
	'pg.RegisterTypePopUp("propbag")
	'
	'hide some things
	pg.Hide("propadd")
	pg.Hide("add_row")
	pg.Hide("add_column")
	pg.Hide("add_fields")
	pg.Hide("download")
	'
	Dim context, e As Object
	pg.onBeforeDrop("tree", BANano.CallBack(Me,"beforedrop", Array(context,e)))
	'side bar click
	Dim meid As Map
	pg.OnItemClick("smp", BANano.CallBack(Me, "sidebar_clickwait", Array(meid)))
	pg.OnItemDblClick("smp", BANano.CallBack(Me, "sidebar_dblclick", Array(meid)))
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
	'pg.StartHint(hints)
End Sub

'cancel the drag and drop but process everything else
Sub beforedrop(context As BANanoObject, e As BANanoEvent) As Boolean
	'get id of source element
	Dim startfrom As Object = context.GetField("start")
	'get the target
	Dim targetto As Object = context.getfield("target")
	'
	startfrom = pg.CStr(startfrom)
	targetto = pg.CStr(targetto)
	Dim starget As String = targetto
	Dim sstart As String = startfrom
	'
	Select Case startfrom
	Case "db"
		'drop the database on the connection
		If targetto <> "connection" Then Return False
		pg.SelectItem("tree","connection")
		tree_clickwait("connection")
	Case "table"
		'drop a table on the connection
		If targetto <> "connection" Then Return False
		pg.SelectItem("tree","connection")
		sidebar_clickwait(startfrom)
	Case "field"
		'drop a field on the able
		If starget.StartsWith("table.") Then
			pg.SelectItem("tree",starget)
			sidebar_clickwait(startfrom)
		Else
			Return False
		End If
	Case "form"
		'dropping a form on the tree
		If starget = "null" Then
			sidebar_clickwait("form")
		End If
	Case "wixsomething"
		If starget = "null" Then
			sidebar_clickwait("wixsomething")
		End If
	Case "property"
		If starget.StartsWith("wixsomething.") Then
			sidebar_clickwait("property")
		End If
	Case Else
		'dropping a field on the form
		If sstart.StartsWith("field.table") Then
			If starget = "form" Then
				'get the field name
				Dim fldname As String = pg.MvField(sstart, 3, ".")
				pg.SelectItem("tree", starget)
				sidebar_clickwait("text")
				Dim pb As Map = pg.getvalues("propbag")
				pb.Put("id", fldname)
				pb.Put("label", fldname)
				SaveElementWait(pb)
				Return False
			End If
		Else
			pg.SelectItem("tree",starget)
			sidebar_clickwait(startfrom)
		End If
	End Select
	Return False 
End Sub

Sub add_row
	sidebar_clickwait("row")
End Sub

Sub add_column
	sidebar_clickwait("column")
End Sub

'show window to add multiple elements
Sub multiels
	'see selected treeitem
	Dim parentid As String = pg.GetSelectedID("tree")
	If parentid = "" Then
		pg.Message_Error("Please select the parent item from the tree first, then select the element you want to add! Remember to click Save in the property bag when done.")
		Return
	End If
	pg.boShow(CreateWindow)
End Sub

Sub showhints
	pg.StartHint(hints)
End Sub

Sub refreshapp
	ClearPreviewIT
	ClearCodeIT
	RefreshTreeWait
End Sub

Sub ClearPreviewIT
	Dim div As UOENowHTML
	div.Initialize("previewit","div").SetStyle("width","100%").SetStyle("height","100%")
	Dim opt As Map = CreateMap("template": div.html)
	pg.Define("previewit", opt)
	pg.Refresh("previewit")
End Sub

Sub ClearCodeIT
	Dim opt1 As Map = CreateMap("template": "No code")
	pg.Define("codeit", opt1)
	pg.Refresh("codeit")
End Sub

'refresh the tree whenever an item is saved
Sub RefreshTreeWait
	'clear tree
	pg.ClearAll("tree")
	'
	pg.AddNode("tree", "", "connection", "Database", "", pg.EnumWixIcons.Folder,"","",True)
	Dim qry As String
	Dim res As String
	Dim rs As SQLiteResultSet
	Dim sqlite As BANanoSQLite
	sqlite.Initialize
	qry = sqlite.SelectAll("wixsomething", Array("name"), Array("name"))
	res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
	rs = sqlite.GetResultSet(qry, res)
	For Each fitem As Map In rs.result
		Dim name As String = fitem.GetDefault("name","")
		If name <> "" Then
			Dim key As String = $"wixsomething.${name}"$
			pg.AddNode("tree", "", key, key, "", pg.EnumWixIcons.Folder,"","",True)
			sqlite.Initialize
			qry = sqlite.SelectWhere("properties", Array("key"), CreateMap("parentid":name), Array("tabindex"))
			res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
			rs = sqlite.GetResultSet(qry, res)
			For Each pitem As Map In rs.result
				Dim k As String = pitem.GetDefault("key","")
				If k <> "" Then
					Dim skey As String = "property." & pitem.Get("key")
					Dim pkey As String = $"wixsomething.${name}"$
					pg.AddNode("tree", pkey, skey, skey, "", pg.EnumWixIcons.Folder,"","",False)
				End If
			Next
		End If
	Next
	'load tables
	sqlite.Initialize
	qry = sqlite.SelectAll("tables", Array("key"), Array("key"))
	res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
	rs = sqlite.GetResultSet(qry, res)
	For Each fitem As Map In rs.result
		Dim key As String = fitem.Get("key")
		pg.AddNode("tree", "connection", key, key, "", pg.EnumWixIcons.Folder,"","",True)
	Next
	'
	'load fields
	sqlite.Initialize
	qry = sqlite.SelectAll("fields", Array("key","tablename"), Array("tabindex"))
	res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
	rs = sqlite.GetResultSet(qry, res)
	For Each fitem As Map In rs.result
		Dim key As String = fitem.Get("key")
		Dim tablename As String = fitem.Get("tablename")
		Dim tblKey As String = $"table.${tablename}"$
		pg.AddNode("tree", tblKey, key, key, "", pg.EnumWixIcons.Folder,"","",False)
	Next
		
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
		pg.AddNode("tree", parentid, itmID, itmID, "", pg.EnumWixIcons.FileIcon, "", "", False)
	Next
	pg.Refresh("tree")
End Sub


Sub AddPrimaryKeyWait
	Dim tb As Map = pg.GetValues("propbag")
	Dim tbname As String = tb.GetDefault("value","")
	Dim pk As String = tb.GetDefault("primarykey","")
	Dim ft As String = tb.GetDefault("type","")
	'
	Dim k As String = $"field.${tbname}.${pk}"$
	'
	Dim nf As Map = CreateMap()
	nf.Put("key", k)
	nf.put("id", "field")
	nf.put("tablename", tbname)
	nf.Put("value", pk)
	nf.put("tabindex", "0")
	'
	Dim jsonm As Map = CreateMap()
	jsonm.Put("type", ft)
	jsonm.Put("length", "20")
	jsonm.put("id", "field")
	jsonm.put("tablename", tbname)
	jsonm.Put("value", pk)
	jsonm.Put("tabindex","0")
	'
	Dim json As String = pg.Map2Json(jsonm)
	nf.Put("json", json)
	'
	'replace
	Dim qry As String
	Dim res As String
	Dim rs As SQLiteResultSet
	dim sqlite As BANanoSQLite
	sqlite.Initialize
	sqlite.AddStrings(Array("id"))
	'replace complete record
	qry = sqlite.InsertReplace("fields", nf)
	res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
	rs = sqlite.GetResultSet(qry, res)
	'check existence
	sqlite.initialize
	sqlite.AddStrings(Array("id"))
	qry = sqlite.Exists("fields", "key", k)
	res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
	rs = sqlite.GetResultSet(qry,res)
	pg.Message(rs.result.size & " record(s) affected!")
End Sub

Sub CreateTableCode(tblName As String, priKey As String, rsx As SQLiteResultSet) As String
	Dim sbFields As StringBuilder
	sbFields.Initialize
	
	For Each fldmap As Map In rsx.result
		Dim json As String = fldmap.Get("json")
		Dim fmap As Map = pg.Json2Map(json)
		Dim fldname As String = fmap.Get("value")
		sbFields.Append(fldname).Append(",")
	Next
	Dim flds As String = sbFields.ToString
	flds = pg.RemDelim(flds,",")
	'
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append("'FIELD NAMES").Append(CRLF)
	sb.Append(flds).Append(CRLF).Append(CRLF)
	sb.append("'Copy this code to Main.BANano_Ready").Append(CRLF).Append(CRLF)
	sb.Append("'create the table").Append(CRLF)
	sb.append("Dim newTable As Map = CreateMap()").Append(CRLF)
	'
	For Each fldmap As Map In rsx.result
		Dim json As String = fldmap.Get("json")
		Dim fmap As Map = pg.Json2Map(json)
		Dim fldname As String = fmap.Get("value")
		Dim fldtype As String = fmap.Get("type")
		Dim fldLeng As String = fmap.get("length")
		'
		sb.Append($"newTable.put("${fldname}","${fldtype}")"$).Append(CRLF)
	Next
	sb.append(CRLF)
	sb.append("'initialize the helper class").Append(CRLF)
	sb.Append("Dim alaSQL As BANanoAlaSQL").append(CRLF)
	sb.append("alaSQL.Initialize").append(CRLF)
	sb.Append("'generate the create table sql").Append(CRLF)
	sb.Append($"Dim rs As AlaSQLResultSet = alaSQL.CreateTable("${tblName}", newTable, "${priKey}")"$).Append(CRLF)
	sb.append("'execute the create table command").Append(CRLF)
	sb.append($"rs.Result = db.ExecuteWait(rs.query, rs.args)"$).Append(CRLF).Append(CRLF)
	'
	sb.Append("'This code should be copied to your modules for CRUD").Append(CRLF)
	'
	sb.Append("'NEW").Append(CRLF)
	sb.Append("Sub btnnew_click").Append(CRLF)
	sb.Append("'clear the contents of the form").Append(CRLF)
	sb.append($"pg.Clear("form")"$).Append(CRLF)
	sb.Append("End Sub").Append(CRLF).append(CRLF)
	'
	sb.Append("'CREATE").Append(CRLF)
	sb.Append("Sub btninsert_click").Append(CRLF)
	sb.Append("'lets validate the form").Append(CRLF)
	sb.append($"Dim bValid As Boolean = pg.Validate("form")"$).append(CRLF)
	sb.append("if bValid = False Then Return").Append(CRLF)
	sb.Append("'insert record to table").Append(CRLF)
	sb.Append("Dim alaSQL As BANanoAlaSQL").append(CRLF)
	sb.Append("'initialize the helper class").Append(CRLF)
	sb.append("alaSQL.Initialize").append(CRLF)
	sb.Append("'Get values from the form").Append(CRLF)
	sb.append($"Dim rec As Map = pg.GetValues("form")"$).Append(CRLF)
	sb.Append("'save record to the database").Append(CRLF)
	sb.Append($"Dim rs As AlaSQLResultSet = alaSQL.Insert("${tblName}", rec)"$).Append(CRLF)
	sb.append($"rs.Result = db.ExecuteWait(rs.query, rs.args)"$).Append(CRLF)
	sb.Append("End Sub").Append(CRLF).Append(CRLF)
	'
	sb.Append("'READ").Append(CRLF)
	sb.Append("Sub btnread_click").append(CRLF)
	sb.Append("'get the content of the primary key field").Append(CRLF)
	sb.append($"Dim priValue As String = pg.GetValue("${priKey}")"$).Append(CRLF)
	sb.Append("'read record from table").append(CRLF)
	sb.Append("Dim alaSQL As BANanoAlaSQL").append(CRLF)
	sb.Append("'initialize the helper class").Append(CRLF)
	sb.append("alaSQL.Initialize").append(CRLF)
	sb.Append("'generate the select where statement").append(CRLF)
	sb.Append($"Dim rs As AlaSQLResultSet = alaSQL.Read("${tblName}", "${priKey}", priValue)"$).Append(CRLF)
	sb.append($"rs.result = db.ExecuteWait(rs.query, rs.args)"$).Append(CRLF)
	sb.Append("'the record was found, set the values to the form").Append(CRLF)
	sb.Append("If rs.result.size > 0 then").Append(CRLF)
	sb.Append("Dim rec As Map = rs.result.Get(0)").Append(CRLF)
	sb.Append("'set returned map to form").append(CRLF)
	sb.Append($"pg.SetValues("form", rec)"$).Append(CRLF)
	sb.Append("End If").Append(CRLF)
	sb.append("End Sub").Append(CRLF).Append(CRLF)
	sb.Append("'UPDATE").Append(CRLF)
	sb.Append("Sub btnupdate_click").Append(CRLF)
	sb.Append("'lets validate the form").Append(CRLF)
	sb.append($"Dim bValid As Boolean = pg.Validate("form")"$).append(CRLF)
	sb.append("if bValid = False Then Return").Append(CRLF)
	sb.Append("'Get values from the form").Append(CRLF)
	sb.append($"Dim rec As Map = pg.GetValues("form")"$).Append(CRLF)
	sb.Append("'get the primary key").Append(CRLF)
	sb.append($"Dim priValue As String = pg.GetValue("${priKey}")"$).Append(CRLF)
	sb.Append("Dim alaSQL As BANanoAlaSQL").append(CRLF)
	sb.Append("'initialize the helper class").Append(CRLF)
	sb.append("alaSQL.Initialize").append(CRLF)
	sb.Append("'update record in the table").Append(CRLF)
	sb.Append($"Dim rs As AlaSQLResultSet = alaSQL.UpdateWhere("${tblName}", rec, CreateMap("${priKey}":priValue))"$).Append(CRLF)
	sb.append($"rs.Result = db.ExecuteWait(rs.query, rs.args)"$).Append(CRLF)
	sb.Append("End Sub").Append(CRLF).Append(CRLF)
	sb.Append("'DELETE").Append(CRLF)
	sb.Append("Sub btndelete_click").Append(CRLF)
	sb.Append("'draw a confirm dialog").Append(CRLF)
	sb.Append("Dim confirmDelete As Boolean = False").Append(CRLF)
	sb.append($"Dim cb As BANanoObject = BANano.CallBack(Me,"delete${tblName}",Array(confirmDelete))"$).append(CRLF)
	sb.Append($"pg.Confirm(cb, "Confirm Delete", "Are you sure that you want to delete this record?")"$).append(CRLF)
	sb.Append("End Sub").Append(CRLF).Append(CRLF)
	'
	sb.Append($"Sub Delete${tblName}(confirmDelete As Boolean)"$).Append(CRLF)
	sb.append($"if confirmDelete = False Then Return"$).Append(CRLF)
	sb.Append("'get the primary key").Append(CRLF)
	sb.append($"Dim priValue As String = pg.GetValue("${priKey}")"$).Append(CRLF)
	sb.Append("Dim alaSQL As BANanoAlaSQL").append(CRLF)
	sb.Append("'initialize the helper class").Append(CRLF)
	sb.append("alaSQL.Initialize").append(CRLF)
	sb.Append("'delete record in the table").Append(CRLF)
	sb.Append($"Dim rs As AlaSQLResultSet = alaSQL.DeleteWhere("${tblName}", CreateMap("${priKey}":priValue))"$).Append(CRLF)
	sb.append($"rs.Result = db.ExecuteWait(rs.query, rs.args)"$).Append(CRLF)
	sb.Append("End Sub").Append(CRLF).Append(CRLF)
	
	
	sb.Append("'READ ALL").Append(CRLF)
	sb.Append("Sub btngetall_click").Append(CRLF)
	sb.Append("Dim alaSQL As BANanoAlaSQL").append(CRLF)
	sb.Append("'initialize the helper class").Append(CRLF)
	sb.append("alaSQL.Initialize").append(CRLF)
	sb.Append("'select all records record in the table").Append(CRLF)
	sb.Append($"Dim rs As AlaSQLResultSet = alaSQL.SelectAll("${tblName}", array("*"), array("${priKey}"))"$).Append(CRLF)
	sb.append($"rs.Result = db.ExecuteWait(rs.query, rs.args)"$).Append(CRLF)
	sb.Append("log(rs.Result)").Append(CRLF)
	sb.Append("End Sub").Append(CRLF).Append(CRLF)
	Return sb.tostring
End Sub

'add a child
Sub prop_add
	Dim cm As Map = pg.GetValues("propbag")
	Dim pid As String = cm.GetDefault("id","")
	Dim value As String = cm.GetDefault("value","")
	Dim tablename As String = cm.GetDefault("tablename","")
	Dim sname As String = cm.GetDefault("name","")
	Dim pview As String = cm.GetDefault("view","")
	
	Select Case pview
		Case "datatable"
			sidebar_clickwait("datacolumn")
			Return
	End Select
	
	Select Case pid
		Case "wixsomething"
			'get selected treeview
			sidebar_clickwait("property")
		Case "property"
			Dim k As String = $"wixsomething.${sname}"$
			pg.SelectItem("tree", k)
			sidebar_clickwait("property")
		Case "connection"
			'add a table
			sidebar_clickwait("table")
		Case "table"
			'add a field
			sidebar_clickwait("field")
		Case "field"
			'add a field
			Dim k As String = $"table.${tablename}"$
			'select the table
			pg.SelectItem("tree", k)
			sidebar_clickwait("field")
		Case Else
			'add a textbox
			sidebar_clickwait("text")
	End Select
End Sub

'save the item
Sub prop_saveWait
	Dim qry As String
	Dim res As String
	Dim rs As SQLiteResultSet
	dim sqlite As BANanoSQLite
	Dim pbx As WixProgressBar
	pbx.Initialize("").SetDelay(500).SetHide(True).SetTypeIcon("")
	pg.SetProgressBar("propbag", pbx)
	'get the property bag
	Dim prop As Map = pg.GetValues("propbag")
	Dim v As String = prop.GetDefault("view","")
	Dim i As String = prop.Get("id")
	Dim value As String = prop.GetDefault("value","")
	Dim tablename As String = prop.GetDefault("tablename","")
	Dim autoincrement As String = prop.GetDefault("autoincrement","")
	Dim primarykey As String = prop.GetDefault("primarykey","")
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
		Case "property"
			Dim sname As String = prop.GetDefault("name","")
			If sname = "" Then
				pg.Message_Error("Please enter the name of the property to add!")
				Return
			End If
			FixProperty(sname,prop)
			json = BANano.ToJson(prop)
			pg.SetValues("propbag", prop)
			'
			Dim k As String = $"${p}.${sname}"$
			sqlite.Initialize
			sqlite.AddStrings(Array("id"))
			rec = CreateMap()
			rec.Put("id", i)
			rec.put("tabindex", idx)
			rec.Put("parentid", p)
			rec.Put("json", json)
			rec.Put("key", k)
			rec.Put("name", sname)
			sqlite.Initialize
			sqlite.AddStrings(Array("id"))
			Dim qry As String = sqlite.InsertReplace("properties", rec)
			res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
			rs = sqlite.GetResultSet(qry, res)
		Case "wixsomething"
			Dim sname As String = prop.GetDefault("name","")
			If sname = "" Then
				pg.Message_Error("Please enter the name of the control to create!")
				Return
			End If
			'add to table
			sqlite.Initialize
			sqlite.AddStrings(Array("id,name"))
			'new connect record
			rec = CreateMap()
			rec.Put("name", sname)
			rec.Put("json", json)
			'replace complete record
			qry = sqlite.InsertReplace("wixsomething", rec)
			res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
			rs = sqlite.GetResultSet(qry, res)
		Case "field"
			pg.Collapse("preview")
			'save a field
			Dim key As String = $"field.${tablename}.${value}"$
			sqlite.Initialize
			sqlite.AddStrings(Array("id"))
			'new connect record
			rec = CreateMap()
			rec.Put("id", i)
			rec.Put("json", json)
			rec.Put("key", key)
			rec.Put("value", value)
			rec.Put("tablename", tablename)
			rec.Put("tabindex", idx)
			'replace complete record
			qry = sqlite.InsertReplace("fields", rec)
			res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
			rs = sqlite.GetResultSet(qry, res)
			'check existence
			sqlite.initialize
			sqlite.AddStrings(Array("id"))
			qry = sqlite.Exists("fields", "key", key)
			res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
			rs = sqlite.GetResultSet(qry,res)
			pg.Message(rs.result.size & " record(s) affected!")
		Case "table"
			pg.Collapse("preview")
			pg.Show("download")
			Dim key As String = $"table.${value}"$
			sqlite.Initialize
			sqlite.AddStrings(Array("id"))
			'new connect record
			rec = CreateMap()
			rec.Put("id", i)
			rec.Put("json", json)
			rec.Put("key", key)
			rec.Put("value", value)
			'replace complete record
			qry = sqlite.InsertReplace("tables", rec)
			res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
			rs = sqlite.GetResultSet(qry, res)
			'check existence
			sqlite.initialize
			sqlite.AddStrings(Array("id"))
			qry = sqlite.Exists("tables", "key", key)
			res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
			rs = sqlite.GetResultSet(qry,res)
			pg.Message(rs.result.size & " record(s) affected!")
			'
			'add primary key
			AddPrimaryKeyWait
			'select fields for table
			sqlite.initialize
			sqlite.AddStrings(Array("tablename"))
			qry = sqlite.SelectWhere("fields", Array("json"), CreateMap("tablename":value),Array("value"))
			res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
			rs = sqlite.GetResultSet(qry,res)
			'generate code
			Dim tcode As String = CreateTableCode(value,primarykey,rs)
			SourceCodePreview(tcode)
		Case "connection"
			pg.collapse("preview")
			pg.Expand("code")
			pg.Show("download")
			sqlite.Initialize
			sqlite.AddStrings(Array("id"))
			'new connect record
			rec = CreateMap()
			rec.Put("id", i)
			rec.Put("json", json)
			'replace complete record
			qry = sqlite.InsertReplace("connect", rec)
			res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
			rs = sqlite.GetResultSet(qry, res)
			'check existence
			sqlite.initialize
			sqlite.AddStrings(Array("id"))
			qry = sqlite.Exists("connect", "id", "connection")
			res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
			rs = sqlite.GetResultSet(qry,res)
			pg.Message(rs.result.size & " record(s) affected!")
			'generate the code for the connection
			Dim ccode As String = dConnection.ConnectionCode(prop)
			SourceCodePreview(ccode)
		Case "form"
			pg.expand("preview")
			pg.Show("download")
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
			FormCodeWait("form",True)
		Case Else
			pg.Show("download")
			pg.Expand("preview")
			'check if we have parent on tree
			If p <> "" Then
				Dim bexist As Boolean = pg.Exists("tree", p)
				If bexist = False Then
					pg.Message_Error("The parent id of this element cannot be found!")
					Return
				End If
			End If
	
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
			'preview the item on designer
			FormCodeWait(i,True)
	End Select
	RefreshTreeWait
End Sub

Sub SaveElementWait(prop2save As Map)
	Dim qry As String
	Dim res As String
	Dim rs As SQLiteResultSet
	Dim sqlite As BANanoSQLite
	Dim p As String = prop2save.Get("parentid")
	Dim i As String = prop2save.get("id")
	Dim idx As String = prop2save.Get("tabindex")
	'
	json = BANano.ToJson(prop2save)
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
	RefreshTreeWait
End Sub

Sub clearform1
	Dim confirmresult As Boolean = False
	Dim cb As BANanoObject = BANano.CallBack(Me,"clearform2wait",Array(confirmresult))
	pg.Confirm(cb, "Confirm Delete", "Are you sure that you want to trash this project? You will not be able to undo your changes. Continue?")
End Sub


'clear form
Sub clearform
	Dim confirmresult As Boolean = False
	Dim cb As BANanoObject = BANano.CallBack(Me,"clearform1wait",Array(confirmresult))
	pg.Confirm(cb, "Confirm Delete", "Are you sure that you want to clear this form? You will not be able to undo your changes. Continue?")
End Sub

Sub clearform1wait(confirmresult As Boolean)
	If confirmresult = False Then Return
	Dim qry As String
	Dim res As String
	Dim rs As SQLiteResultSet
	Dim sqlite As BANanoSQLite
	sqlite.Initialize
	sqlite.AddStrings(Array("id"))
	qry = sqlite.DeleteAll("items")
	res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
	rs = sqlite.GetResultSet(qry,res)
	pg.Message_Success(rs.result.size & " record(s) affected!")
	refreshapp
End Sub

Sub clearform2wait(confirmresult As Boolean)
	If confirmresult = False Then Return
	Dim qry As String
	Dim res As String
	Dim rs As SQLiteResultSet
	Dim sqlite As BANanoSQLite
	Dim tbls As List
	tbls.Initialize
	tbls.AddAll(Array("connect","fields","forms","items","properties","tables","wixsomething"))
	For Each strtb As String In tbls
		sqlite.Initialize
		sqlite.AddStrings(Array("id"))
		qry = sqlite.DeleteAll(strtb)
		res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
		rs = sqlite.GetResultSet(qry,res)
	Next
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
	Dim qry As String
	Dim res As String
	Dim rs As SQLiteResultSet
	Dim sqlite As BANanoSQLite
	Dim rp As Map = pg.GetValues("propbag")
	delID = rp.Get("id")
	Dim value As String = rp.GetDefault("value", "")
	Dim tablename As String = rp.GetDefault("tablename", "")
	Dim key As String = $"table.${value}"$
	Select Case delID
		Case "property"
			Dim parentid As String = rp.GetDefault("parentid","")
			Dim name As String = rp.GetDefault("name","")
			Dim k As String = $"${parentid}.${name}"$
			sqlite.Initialize
			sqlite.AddStrings(Array("id"))
			qry = sqlite.DeleteWhere("properties",CreateMap("key":k))
			res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
			rs = sqlite.GetResultSet(qry,res)
			pg.Message_Success(rs.result.size & " record(s) affected!")
			refreshapp
		Case "wixsomething"
			Dim name As String = rp.GetDefault("name","")
			sqlite.Initialize
			sqlite.AddStrings(Array("name"))
			qry = sqlite.DeleteWhere("wixsomething",CreateMap("name":name))
			res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
			rs = sqlite.GetResultSet(qry, res)
			'
			qry = sqlite.DeleteWhere("properties",CreateMap("parentid":name))
			res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
			rs = sqlite.GetResultSet(qry, res)
			refreshapp
		Case "form"
			sqlite.Initialize
			sqlite.AddStrings(Array("id"))
			qry = sqlite.DeleteAll("items")
			res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
			rs = sqlite.GetResultSet(qry,res)
			pg.Message_Success(rs.result.size & " record(s) affected!")
			refreshapp
		Case "field"
			key = $"field.${tablename}.${value}"$
			sqlite.initialize
			sqlite.AddStrings(Array("key"))
			qry = sqlite.DeleteWhere("fields",CreateMap("key":key))
			res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
			rs = sqlite.GetResultSet(qry,res)
			pg.Message_Success(rs.result.size & " record(s) affected!")
			refreshapp
		Case "table"
			'we are deleting a table
			sqlite.initialize
			sqlite.AddStrings(Array("id"))
			qry = sqlite.DeleteWhere("tables",CreateMap("key":key))
			res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
			rs = sqlite.GetResultSet(qry,res)
			'delete fields
			sqlite.Initialize
			sqlite.AddStrings(Array("tablename"))
			qry = sqlite.DeleteWhere("fields",CreateMap("tablename":value))
			res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
			rs = sqlite.GetResultSet(qry,res)
			pg.Message_Success(rs.result.size & " record(s) affected!")
			refreshapp
		Case Else
			sqlite.initialize
			sqlite.AddStrings(Array("id"))
			qry = sqlite.DeleteWhere("items",CreateMap("id":delID))
			res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
			rs = sqlite.GetResultSet(qry,res)
			pg.Message_Success(rs.result.size & " record(s) affected!")
			'
			'delete children
			sqlite.initialize
			sqlite.AddStrings(Array("id","parentid"))
			qry = sqlite.DeleteWhere("items",CreateMap("parentid":delID))
			res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
			rs = sqlite.GetResultSet(qry,res)
			pg.Message_Success(rs.result.size & " record(s) affected!")
			refreshapp
	End Select
	propBag.Clear
	propBag.Refresh(pg)
End Sub


'create the view object from saved / property bag
Sub CreateView(properties As Map) As Map
	'get the view
	Dim v As String = properties.Get("view")
	Dim i As String = properties.Get("id")
	Dim val As String = properties.getdefault("value","")
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
		Case "image"
			Dim img As UOENowHTML
			img.SetImportant(False)
			img.Initialize("","img")
			img.SetStyle("width","100%")
			img.SetStyle("height","100%")
			view.SetCSS("form_photo")
			img.SetSRC(val,True)
			view.SetTemplateHTML(img)
			properties.Remove("value")
		Case "google-map"
			Dim scenter As String = properties.Get("center")
			Dim szoom As String = properties.Get("zoom")
			Dim dlat As String = pg.MvField(scenter,1,",")
			Dim dlng As String = pg.MvField(scenter,2,",")
			dlat = dlat.Trim
			dlng = dlng.Trim
			Dim lzoom As Int = BANano.parseint(szoom)
			Dim points As List
			points.Initialize
			points.Add(BANano.parseFloat(dlat))
			points.Add(BANano.parsefloat(dlng))
			'
			view.SetAttr("center", points)
			view.SetAttr("zoom", lzoom)
			properties.remove("zoom")
			properties.Remove("center")
	End Select
	
	'get the contents of the property bag
	For Each pkey As String In properties.keys
		Dim pval As String = properties.Get(pkey)
		Dim cval As String = pg.CStr(pval)
		
		'do we have a mapped keys
		Select Case pkey
			Case "grid_footer"
				pkey = "Footer"
			Case "grid_footer_filter"
				pkey = "FooterContent"
			Case "grid_footer_text"
				pkey = "FooterText"
			Case "grid_footer_css"
				pkey = "FooterCSS"
			Case "grid_footer_colspan"
				pkey = "FooterColSpan"
			Case "grid_footer_rowspan"
				pkey = "FooterRowSpan"
			Case "grid_footer_rotate"
				pkey = "FooterRotate"
			Case "grid_footer_autoheight"
				pkey = "FooterAutoHeight"
			Case "grid_footer_height"
				pkey = "FooterHeight"
			Case "grid_math"
				pkey = "Math"
			Case "grid_liveedit"
				pkey = "LiveEdit"
			Case "grid_header_rowspan"
				pkey = "HeaderRowSpan"
			Case "grid_header_rotate"
				pkey = "HeaderRotate"
			Case "grid_header_autoheight"
				pkey = "HeaderAutoHeight"
			Case "grid_header_height"
				pkey = "HeaderHeight"
			Case "grid_editaction"
				pkey = "EditAcion"
			Case "grid_header_mastercheckbox"
				pkey = "MasterCheckBox"
			Case "grid_header_filter"
				pkey = "HeaderContent"
			Case "grid_header_text"
				pkey = "HeaderText"
			Case "grid_header_css"
				pkey = "HeaderCSS"
			Case "grid_header_colspan"
				pkey = "HeaderColSpan"
			Case "grid_name"
				pkey = "Name"
			Case "grid_header"
				pkey = "Header"
			Case "grid_fillspace"
				pkey = "FillSpace"
			Case "grid_sort"
				pkey = "Sort"
			Case "grid_template"
				pkey = "Template"
			Case "grid_templatehtml"
				pkey = "TemplateHTML"
			Case "grid_checkbox"
				pkey = "CheckBox"
			Case "grid_radio"
				pkey = "Radio"
			Case "grid_checkvalue"
				pkey = "CheckValue"
			Case "grid_uncheckvalue"
				pkey = "UncheckValue"
			Case "grid_format"
				pkey = "Format"
			Case "grid_suggest"
				pkey = "Suggest"
			Case "grid_batch"
				pkey = "Batch"
			Case "grid_options"
				pkey = "options"
			Case "grid_collection"
				pkey = "Collection"
			Case "grid_hidden"
				pkey = "Hidden"
			Case "grid_responsive"
				pkey = "Responsive"
			Case "grid_align"
				pkey = "Align"
			Case "grid_adjust"
				pkey = "Adjust"
			Case "grid_editor"
				pkey = "Editor"
			Case "grid_css"
				pkey = "CSS"
			Case "grid_width"
				pkey = "Width"
			Case "grid_height"
				pkey = "Height"
			Case "grid_minwidth"
				pkey = "MinWidth"
			Case "grid_minheight"
				pkey = "MinHeight"
			Case "grid_tooltip"
				pkey = "ToolTip"
		End Select
				
		If cval <> "" Then
			If pkey = "view" And cval.tolowercase = "row" Then Continue
			If pkey = "view" And cval.tolowercase = "column" Then Continue
			If pkey = "view" And cval.tolowercase = "layout" Then Continue
			If pkey = "view" And cval.tolowercase = "image" Then Continue
			If pkey = "addingmethod" Then Continue
			If pkey = "style.color" Then
				view.SetStyle("color", cval)
				Continue
			End If
			If pkey = "style.background" Then
				view.SetStyle("background", cval)
				Continue
			End If
			Select Case pkey
				Case "DefaultView"
					view.SetDefaultView(cval)
				Case "DefaultType"
					view.SetDefaultType(cval)
				Case "DefaultLabelAlign"
					view.setDefaultLabelAlign(cval)
				Case "DefaultLabelWidth"
					view.setDefaultLabelWidth(cval)
				Case "DefaultLabelPosition"
					view.setDefaultLabelPosition(cval)
				Case "DefaultAlign"
					view.setDefaultAlign(cval)
				Case "DefaultWidth"
					view.setDefaultWidth(cval)
				Case "DefaultHeight"
					view.setDefaultHeight(cval)
				Case "DefaultBottomPadding"
					view.setDefaultBottomPadding(cval)
				Case Else
					view.SetAttr(pkey, pval)
			End Select
		End If
	Next
	'dont do rows and columns, they dont have views
	Select Case v.ToLowerCase
		Case "row", "column", "layout", "image", "datacolumn"
		Case Else
			view.SetAttr("view", v.ToLowerCase)
	End Select
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
	Dim Q As String = "$"
	Dim v As String = m.GetDefault("view","")
	Dim i As String = m.GetDefault("id","")
	Dim a As String = m.GetDefault("action","")
	v = pg.CStr(v)
	If v = "" Then v = "Element"
	If v = "undefined" Then v = "Element"
	'
	Dim sparentid As String
	Dim saddingmethod As String
	If original <> Null Then
		saddingmethod = original.GetDefault("addingmethod","")
		sparentid = original.GetDefault("parentid","")
	End If
	'
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append($"Dim ${i} As Wix${v}"$).Append("<br>")
	sb.Append($"${i}.Initialize("${i}")"$).Append("<br>")
	For Each strKey As String In m.Keys
		Dim strval As Object = m.Get(strKey)
		If strKey = "id" Then Continue
		If strKey = "view" Then
			If v <> "Element"  Then Continue
		End If
		If strKey = "container" Then Continue
		If strKey = "parentid" Then Continue
		If strKey = "tabindex" Then Continue
		If strKey = "action" Then Continue
		If strKey = "click" Then
			Dim btn As String = $"btn${a}_click"$
			strval = $"BANano.CallBack(Me, "${btn}", Null)"$
		End If
		Dim k As String = Capitalize(strKey)
		If GetType(strval) = "object" Then
			Dim xval As String = pg.Map2Json(strval)
			sb.Append($"${i}.Set${k}JSON(${q}"${xval}"${q})"$).Append("<br>")
		Else
			sb.Append($"${i}.Set${k}("${strval}")"$).Append("<br>")
		End If
	Next
	If sparentid <> "" Then
		sb.Append(sparentid).Append(".").Append(saddingmethod).Append("(").Append(i)
		If v = "datacolumn" Then
		Else
			sb.Append(".Item")
		End If
		sb.Append(")")
	End If
	Return sb.tostring
End Sub

Sub SourceCodePreview(script As String)
	lastcode = script
	script = script.Replace(CRLF,"<br>")
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append("<pre>")
	sb.Append(script)
	sb.Append("</pre>")
	'
	Dim scode As String = sb.tostring
	pg.Define("codeit", CreateMap("template":scode))
	pg.Refresh("codeit")
End Sub

Sub tree_clickwait(recid As String)
	Dim qry As String
	Dim res As String
	Dim rs As SQLiteResultSet
	Dim sqlite As BANanoSQLite
	Dim pbx As WixProgressBar
	pbx.Initialize("").SetDelay(500).SetHide(True).SetTypeIcon("")
	pg.SetProgressBar("propbag", pbx)
	ClearPreviewIT
	ClearCodeIT
	propBag.Clear
	propBag.Refresh(pg)
	Dim prefix As String = pg.MvField(recid,1,".")
	Dim suffix As String = pg.MvField(recid,2,".")
	pg.Hide("propadd")
	pg.Hide("add_row")
	pg.Hide("add_column")
	pg.Hide("add_fields")
	pg.Hide("propdelete")
	pg.Hide("download")
	pg.Hide("propmenu")
			
	Select Case prefix
		Case "property"
			Dim itm3 As String = pg.MvField(recid,3,".")
			pg.Collapse("preview")
			pg.hide("propadd")
			pg.Expand("code")
			pg.show("propdelete")
			dDesignerProperty.BuildBag(pg,propBag)
			Dim k As String = $"${suffix}.${itm3}"$
			sqlite.Initialize
			sqlite.AddStrings(Array("key"))
			qry = sqlite.Read("properties","key",k)
			res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
			rs = sqlite.GetResultSet(qry,res)
			If rs.result.Size = 0 Then
			Else
				rec = rs.result.get(0)
				json = rec.Get("json")
				rec = pg.Json2Map(json)
				pg.SetValues("propbag", rec)
			End If
		Case "wixsomething"
			pg.Collapse("preview")
			pg.Show("propadd")
			pg.Show("add_fields")
			pg.Show("propdelete")
			pg.Show("download")
	
			dWixSomething.BuildBag(pg, propBag)
			sqlite.Initialize
			sqlite.AddStrings(Array("name"))
			qry = sqlite.Read("wixsomething","name",suffix)
			res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
			rs = sqlite.GetResultSet(qry,res)
			Dim ws As Map = Null
			If rs.result.Size = 0 Then
			Else
				rec = rs.result.get(0)
				ws = rs.result.Get(0)
				json = rec.Get("json")
				rec = pg.Json2Map(json)
				pg.SetValues("propbag", rec)
			End If
			'get properties
			sqlite.Initialize
			qry = sqlite.SelectWhere("properties", Array("*"), CreateMap("parentid":suffix), Array("tabindex"))
			res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
			rs = sqlite.GetResultSet(qry, res)
			Dim props As List = rs.result
			Dim ccode As String = BuildClass(suffix,ws,props)
			SourceCodePreview(ccode)
		Case "field"
			pg.Show("add_fields")
			pg.Collapse("preview")
			pg.Show("propadd")
			pg.Expand("code")
			pg.show("propdelete")
			dField.BuildBag(pg,propBag)
			'
			sqlite.Initialize
			sqlite.AddStrings(Array("key"))
			qry = sqlite.Read("fields","key",recid)
			res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
			rs = sqlite.GetResultSet(qry,res)
			If rs.result.Size = 0 Then
			Else
				rec = rs.result.get(0)
				json = rec.Get("json")
				rec = pg.Json2Map(json)
				pg.SetValues("propbag", rec)
			End If
		Case "table"
			pg.Show("propadd")
			pg.Collapse("preview")
			pg.Expand("code")
			pg.show("propdelete")
			pg.Show("add_fields")
			pg.Show("download")
			dTable.BuildBag(pg,propBag)
			'get the table definition
			sqlite.Initialize
			sqlite.AddStrings(Array("key"))
			qry = sqlite.Read("tables","key",recid)
			res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
			rs = sqlite.GetResultSet(qry,res)
			If rs.result.Size = 0 Then
			Else
				rec = rs.result.get(0)
				json = rec.Get("json")
				rec = pg.Json2Map(json)
				pg.SetValues("propbag", rec)
				Dim primarykey As String = rec.Get("primarykey")
				'
				'select fields for table
				sqlite.initialize
				sqlite.AddStrings(Array("tablename"))
				qry = sqlite.SelectWhere("fields", Array("json"), CreateMap("tablename":suffix),Array("tabindex"))
				res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
				rs = sqlite.GetResultSet(qry,res)
				'generate code
				Dim tcode As String = CreateTableCode(suffix,primarykey,rs)
				SourceCodePreview(tcode)
			End If
		Case "connection"
			pg.Show("propadd")
			pg.Show("add_fields")
			pg.collapse("preview")
			pg.Expand("code")
			pg.Show("download")
			dConnection.BuildBag(pg, propBag)
			'read settings from db
			sqlite.Initialize
			'our id field is a string
			sqlite.AddStrings(Array("id"))
			qry = sqlite.Read("connect","id","connection")
			res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
			rs = sqlite.GetResultSet(qry,res)
			If rs.result.Size = 0 Then
			Else
				'read from db and update property bag
				rec = rs.result.Get(0)
				json = rec.Get("json")
				rec = pg.Json2Map(json)
				pg.SetValues("propbag",rec)
				'generate the code for the connection
				Dim ccode As String = dConnection.ConnectionCode(rec)
				SourceCodePreview(ccode)
			End If
		Case "form"
			pg.Show("add_row")
			pg.Show("add_column")
			pg.Show("propadd")
			pg.Expand("preview")
			pg.Show("add_fields")
			pg.Show("propdelete")
			pg.Show("download")
			'we have clicked a form
			dForm.BuildBag(pg, propBag)
			FormCodeWait("form",True)
		Case Else
			pg.Show("add_row")
			pg.Show("add_column")
			pg.Show("propadd")
			pg.Expand("preview")
			pg.Show("add_fields")
			pg.Show("propdelete")
			pg.Show("download")
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
				FormCodeWait(recid,True)
				Select Case v
					Case "toolbar"
						pg.Show("propmenu")
						pg.hide("add_row")
						pg.hide("add_column")
					Case "list", "datatable"
						pg.hide("add_row")
						pg.hide("add_column")
					Case "datacolumn"
						pg.hide("add_row")
						pg.hide("add_column")
						pg.hide("propadd")
						pg.Hide("add_fields")
				End Select
			End If
	End Select
End Sub

Sub FormCodeWait(id As String, bShowPropBag As Boolean)
	Dim qry As String
	Dim res As String
	Dim rs As SQLiteResultSet
	Dim sqlite As BANanoSQLite
	
	ClearPreviewIT
	ClearCodeIT
	Dim sb As StringBuilder
	sb.Initialize
	rec.initialize
	Select Case id
		Case "form"
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
			End If
		Case Else
			sqlite.Initialize
			sqlite.AddStrings(Array("id"))
			qry = sqlite.SelectWhere("items", Array("*"), CreateMap("id":id),Array("id"))
			res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
			rs = sqlite.GetResultSet(qry,res)
			If rs.result.Size = 0 Then
			Else
				'read from db and update property bag
				rec = rs.result.Get(0)
				json = rec.Get("json")
				rec = pg.Json2Map(json)
			End If
	End Select
	'
	If bShowPropBag Then
		rec = pg.Json2Map(json)
		pg.SetValues("propbag", rec)
	End If
		
	Dim sparentid As String = rec.GetDefault("parentid","")
	Dim saddingmethod As String = rec.GetDefault("addingmethod","")
	'get the children of the form
	sqlite.Initialize
	sqlite.AddStrings(Array("id", "parentid"))
	qry = sqlite.SelectWhere("items", Array("*"), CreateMap("parentid":id), Array("tabindex"))
	res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
	rs = sqlite.GetResultSet(qry,res)
	'
	Dim rows As List
	rows.initialize
	Dim columns As List
	columns.initialize
	Dim elements As List
	elements.Initialize
	Dim cols As List
	cols.initialize
	Dim cells As List
	cells.Initialize
	
	rec.Put("container", "previewit")
	Dim view As Map = CreateView(rec)
	Dim sc As String = SourceCodeItem(view,Null)
	'
	sb.append(sc).Append(CRLF).Append(CRLF)
	
	'lets store the form element
	For Each item As Map In rs.result
		Dim json As String = item.Get("json")
		Dim itemmap As Map = pg.Json2Map(json)
		Dim view1 As Map = CreateView(itemmap)
		Dim sc As String = SourceCodeItem(view1,itemmap)
		sb.append(sc).append(CRLF).Append(CRLF)
		'
		Dim childaddingmethod As String = itemmap.GetDefault("addingmethod","")
		Select Case childaddingmethod
			Case "AddRows"
				rows.add(view1)
			Case "AddDataColumns"
				columns.Add(view1)
			Case "AddElements"
				elements.Add(view1)
			Case "AddColumns"
				cols.add(view1)
			Case "AddCells"
				cells.Add(view1)
			Case "AddButton", "AddLabel", "AddElement", "AddToggle", "AddIcon"
				cols.add(view1)
		End Select
	Next
	'
	If rows.size > 0 Then view.put("rows", rows)
	If columns.size > 0 Then view.put("columns", columns)
	If elements.Size > 0 Then view.put("elements", elements)
	If cols.Size > 0 Then view.Put("cols", cols)
	If cells.Size > 0 Then view.Put("cells", cells)
	'
	If sparentid <> "" Then
		sb.Append(sparentid).Append(".").Append(saddingmethod).Append("(").Append(id).Append(".Item)")
	End If
	SourceCodePreview(sb.ToString)
	'
	Select Case id
		Case "form"
			If rs.result.Size > 0 Then
				drawn = pg.UX(view)
			End If
		Case Else
			drawn = pg.UX(view)
	End Select
End Sub

Sub download
	If lastcode <> "" Then
		lastcode = lastcode.Replace("<br>", CRLF)
		pg.SaveText2File(lastcode,"BWFD.txt")
	End If
End Sub

Sub collabwait
	Dim theObject As Object = Sender
	Dim isonline As Boolean = BANano.CheckInternetConnectionWait
	If isonline Then
		BANano.RunJavascriptMethod("TogetherJS", Array(theObject))
	Else
		pg.Message_Debug("You dont appear to be connected to the interweb!")
	End If
End Sub

Sub dbhelp
	Dim dbhint As WixHint
	dbhint.Initialize("dbhint")
	dbhint.AddStep("tree","Database","To store data for our forms, we can create a database and tables. Click Database on the tree to do so.","enter")
	dbhint.AddStep("propform", "Connection", "Specify the database name and select with backend to use either BANanoSQL, BANanoSQLite or BANanoMySQL. Each has different connection options.","enter")
	dbhint.AddStep("formholder", "Settings", "You will be provided with steps to follow to set up your connection here for each back end type.","enter")
	dbhint.AddStep("tree", "Tables", "The next step is to add tables to the database, select Database from the tree.","enter")
	dbhint.AddStep("propadd", "Add Table", "Click here to add a new table and provide its name.","enter")
	dbhint.AddStep("propsave", "Save Table", "Once you have provided the table details, click on save to store the database, now you are ready to add fields to the table.","enter")
	dbhint.AddStep("propdelete", "Delete Table", "Should you wish to delete a table, you can select the trash here after selecting the table on the tree.","enter")
	dbhint.AddStep("tree", "Saved Table", "You have saved the table and now it is listed in the tree, to add fields to it, select the table on the tree.","enter")
	dbhint.AddStep("propadd", "Add Field", "Click here to add a new field and provide its name and type.","enter")
	dbhint.AddStep("propsave", "Save Field", "Once you have provided the field details, click on save to store to the database.","enter")
	dbhint.AddStep("propdelete", "Delete Field", "Should you wish to delete a field, select it on the tree and select the trash here.","enter")
	dbhint.AddStep("tree", "Saved Fields", "All the fields you have created will now be listed on the tree.","enter")
	
	pg.StartHint(dbhint)
	
End Sub

Sub sidebar_dblclick(meid As String)
	sidebar_clickwait(meid)
End Sub

'on sidebar click, draw up the property bag
Sub sidebar_clickwait(meid As String)
	Dim qry As String
	Dim res As String
	Dim rs As SQLiteResultSet
	Dim sqlite As BANanoSQLite
	
	pg.Collapse("preview")
	pg.Expand("code")
	ClearPreviewIT
	ClearCodeIT
	propBag.Clear
	propBag.Refresh(pg)
	'
	pg.Hide("add_row")
	pg.Hide("add_column")
	pg.Hide("add_fields")
	pg.Hide("propadd")
	pg.Hide("propdelete")
	pg.Hide("download")
	pg.Hide("propmenu")
	'
	Select Case meid
		Case "con", "hlp", "buttons", "txts", "sels", "choices", "pickers","others","grid", "lay","db"
		Case "vis", "dp", "nav"	, "win"
		Case "downloads"
		Case "b4xlib"
		Case "skeletonapp"
		Case "demoapp"
			pgMaster.init
		Case "wixsomething"
			dWixSomething.BuildBag(pg, propBag)
		Case "dbhelp"
			pg.Show("propadd")
			pg.show("propdelete")
			dbhelp
		Case "property"
			pg.show("propadd")
			pg.Collapse("preview")
			pg.Expand("code")
			pg.show("propdelete")
			'see selected treeitem
			Dim parentid As String = pg.GetSelectedID("tree")
			If parentid = "" Then
				pg.Message_Error("Please select the element to add the property to first!")
				Return
			End If
			dDesignerProperty.BuildBag(pg, propBag)
			Dim prefix As String = pg.MvField(parentid,1,".")
			Dim suffix As String = pg.MvField(parentid,2,".")
			Select Case prefix
				Case "wixsomething"
					'get next field id
					sqlite.Initialize
					qry = sqlite.Execute($"select max(tabindex) as nid from properties where parentid = '${suffix}'"$)
					res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
					rs = sqlite.GetResultSet(qry,res)
					Dim nrec As Map = rs.result.get(0)
					Dim nid As String = nrec.GetDefault("nid","0")
					nid = BANano.parseInt(nid) + 1
					Dim kFind As String = pg.CStr(nid)
					Dim p As Map = pg.GetValues("propbag")
					p.Put("parentid", suffix)
					p.Put("tabindex", kFind)
					pg.SetValues("propbag",p)
				Case Else
					pg.Message_Error("Please select the element to add the property to first!")
					Return
			End Select
		Case "field"
			pg.show("propadd")
			pg.Collapse("preview")
			pg.Expand("code")
			pg.show("propdelete")
			'see selected treeitem
			Dim parentid As String = pg.GetSelectedID("tree")
			If parentid = "" Then
				pg.Message_Error("Please select the table to add the field to first!")
				Return
			End If
			Dim prefix As String = pg.MvField(parentid,1,".")
			Dim suffix As String = pg.MvField(parentid,2,".")
			Select Case prefix
				Case "table"
					dField.BuildBag(pg,propBag)
					'get next field id
					prefix = $"field.${suffix}.field"$
					Dim startPoint As Int = 0
					Dim pBoolean As Boolean = True
					Dim kFind As String = ""
					Do While pBoolean = True
						startPoint = startPoint + 1
						kFind = prefix & pg.cstr(startPoint)
						sqlite.initialize
						sqlite.AddStrings(Array("id"))
						qry = sqlite.Exists("fields", "key", kFind)
						res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
						rs = sqlite.GetResultSet(qry,res)
						'not found
						If rs.result.Size = 0 Then
							pBoolean = False
							Exit
						Else
							pBoolean = True
						End If
					Loop
					kFind = pg.MvField(kFind,3,".")
					Dim p As Map = pg.GetValues("propbag")
					p.Put("tablename", suffix)
					p.Put("value", kFind)
					p.Put("tabindex", startPoint)
					pg.SetValues("propbag",p)
				Case Else
					pg.Message_Error("Please select the table to add the field to first!")
					Return
			End Select
		Case "table"
			pg.show("propadd")
			pg.Collapse("preview")
			pg.Expand("code")
			pg.show("propdelete")
			dTable.BuildBag(pg,propBag)
			'get next field id
			prefix = $"table.table"$
			Dim startPoint As Int = 0
			Dim pBoolean As Boolean = True
			Dim kFind As String = ""
			Do While pBoolean = True
				startPoint = startPoint + 1
				kFind = prefix & pg.cstr(startPoint)
				sqlite.initialize
				sqlite.AddStrings(Array("id"))
				qry = sqlite.Exists("tables", "key", kFind)
				res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
				rs = sqlite.GetResultSet(qry,res)
				'not found
				If rs.result.Size = 0 Then
					pBoolean = False
					Exit
				Else
					pBoolean = True
				End If
			Loop
			kFind = pg.MvField(kFind,2,".")
			Dim p As Map = pg.GetValues("propbag")
			p.Put("value", kFind)
			pg.SetValues("propbag",p)
		Case "connection"
			'database connectivity
			pg.show("propadd")
			DrawPropBag(meid)
		Case "form"
			pg.Expand("preview")
			pg.Show("add_row")
			pg.Show("add_column")
			pg.Show("propadd")
			DrawPropBag(meid)
		Case Else
			pg.Expand("preview")
			pg.Show("propadd")
			pg.Show("propdelete")
			'see selected treeitem
			Dim parentid As String = pg.GetSelectedID("tree")
			If parentid = "" Then
				pg.Message_Error("Please select the parent item from the tree first, then select the element you want to add! Remember to click Save in the property bag when done.")
				Return
			End If
			If DrawPropBag(meid) Then
				'update the parentid
				rec = pg.GetValues("propbag")
				'get the next available sequence number
				Dim startPoint As Int = 0
				Dim pBoolean As Boolean = True
				Dim kFind As String = ""
				prefix = meid
				Do While pBoolean = True
					startPoint = startPoint + 1
					kFind = prefix & pg.cstr(startPoint)
					sqlite.initialize
					sqlite.AddStrings(Array("id"))
					qry = sqlite.Exists("items", "id", kFind)
					res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
					rs = sqlite.GetResultSet(qry,res)
					'not found
					If rs.result.Size = 0 Then
						pBoolean = False
						Exit
					Else
						pBoolean = True
					End If
				Loop
				'lets find the next available child for the parent
				'get the tab index of the parent
				sqlite.Initialize
				sqlite.AddStrings(Array("id"))
				qry = sqlite.SelectWhere("items", Array("tabindex"), CreateMap("id":parentid), Array("tabindex"))
				res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
				rs = sqlite.GetResultSet(qry,res)
				Dim parentTabIndex As String = ""
				If rs.result.Size > 0 Then
					Dim tt As Map = rs.result.Get(0)
					parentTabIndex = tt.GetDefault("tabindex","")
					parentTabIndex = pg.CStr(parentTabIndex)
				End If
				'we create the tabindex
				sqlite.Initialize
				sqlite.AddStrings(Array("parentid"))
				'select all tabindex for the parent order by tabindex, we will get the last item
				qry = sqlite.SelectWhere("items", Array("tabindex"), CreateMap("parentid":parentid), Array("tabindex"))
				res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
				rs = sqlite.GetResultSet(qry,res)
				Dim newtabindex As String = ""
				If rs.result.Size > 0 Then
					Dim nitems As Int = rs.result.size - 1
					Dim ti As Map = rs.result.Get(nitems)
					Dim cti As String = ti.GetDefault("tabindex","0")
					cti = pg.CStr(cti)
					'do we have a dot
					Dim dotPos As Int = cti.IndexOf(".")
					If dotPos = -1 Then
						Dim nti As Int = BANano.parseInt(cti)
						nti = nti + 1
						newtabindex = pg.CStr(nti)
						If parentTabIndex <> "" Then
							newtabindex = $"${parentTabIndex}.${newtabindex}"$
						End If
					Else
						'increment the last dot
						Dim getLast As String = pg.MvField(cti, -1, ".")
						Dim nti As Int = BANano.parseInt(getLast)
						nti = nti + 1
						newtabindex = pg.CStr(nti)
						If parentTabIndex <> "" Then
							newtabindex = $"${parentTabIndex}.${newtabindex}"$
						End If
					End If
				Else
					newtabindex = "1"
					If parentTabIndex <> "" Then
						newtabindex = $"${parentTabIndex}.${newtabindex}"$
					End If
				End If
			
				
				rec.Put("parentid", parentid)
				rec.Put("id", kFind)
				rec.Put("template", kFind)
				rec.Put("tabindex", newtabindex)
				rec.Put("label", kFind)
				pg.SetValues("propbag",rec)
			End If
	End Select
End Sub

Sub DrawPropBag(con As String) As Boolean
	Select Case con
		Case "iframe"
			dIFrame.BuildBag(pg, propBag)
			Return True
		Case "google-map"
			dGoogleMap.BuildBag(pg, propBag)
			Return True
		Case "geochart"
			dGeoChart.BuildBag(pg, propBag)
			Return True
		Case "template"
			dTemplate.BuildBag(pg, propBag)
			Return True
		Case "window"
			dWindow.BuildBag(pg, propBag)
			Return True
		Case "multiview"
			dMultiView.BuildBag(pg, propBag)
			Return True
		Case "tabview"
			dTabView.BuildBag(pg, propBag)
			Return True
		Case "fieldset"
			dFieldSet.BuildBag(pg, propBag)
			Return True
		Case "menu"
			dMenu.BuildBag(pg, propBag)
			Return True
		Case "contextmenu"
			dContextMenu.BuildBag(pg, propBag)
			Return True
		Case "context"
			dContext.BuildBag(pg, propBag)
			Return True
		Case "popup"
			dPopUp.BuildBag(pg, propBag)
			Return True
		Case "dataview"
			dDataView.BuildBag(pg, propBag)
			Return True
		Case "propertysheet","property"
			dPropertySheet.BuildBag(pg,propBag)
			Return True
		Case "tree"
			dTree.BuildBag(pg, propBag)
			Return True
		Case "unitlist"
			dUnitList.BuildBag(pg, propBag)
			Return True
		Case "list"
			dList.BuildBag(pg, propBag)
			Return True
		Case "sidebar"
			dSideBar.BuildBag(pg, propBag)
			Return True
		Case "sidemenu"
			dSideMenu.BuildBag(pg, propBag)
			Return True
		Case "toolbar"
			dToolBar.BuildBag(pg, propBag)
			Return True
		Case "datacolumn"
			dDataField.BuildBag(pg, propBag)
			Return True
		Case "datatable"
			dDataTable.BuildBag(pg, propBag)
			Return Me
		Case "video"
			dVideo.BuildBag(pg,propBag)
			Return True
		Case "image"
			dImage.BuildBag(pg, propBag)
			Return True
		Case "connection"
			dConnection.BuildBag(pg, propBag)
			Return True
		Case "form"
			dForm.BuildBag(pg, propBag)
			Return True
		Case "row"
			dRow.BuildBag(pg, propBag)
			Return True
		Case "layout"
			dLayout.BuildBag(pg, propBag)
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
		Case "colorboard"
			dColorBoard.BuildBag(pg, propBag)
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
		Case "calendar"
			dCalendar.BuildBag(pg, propBag)
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
		Case "richtext"
			dRichText.BuildBag(pg, propBag)
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
		Case "resizer"
			dResizer.BuildBag(pg, propBag)
			Return True
		Case "spacer"
			dSpacer.BuildBag(pg, propBag)
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
	btnSave.Initialize("btnMulti").SetLabel("Apply").SetClick(BANano.callback(Me,"btnMulti_clickwait",Null))
	btnSave.SetBadge("0")
	frmx.AddRows(btnSave.Item)
	 
	win.setbody(frmx.Item)
	'win.SetFullScreen(True)
	winux = pg.AddWindow(win)
	'detect change event
	pg.OnKeyPress("txtmultiplecontrols", BANano.callback(Me, "multichange", Null))
	Return winux
End Sub

Sub btnMulti_clickwait
	Dim qry As String
	Dim res As String
	Dim rs As SQLiteResultSet
	Dim sqlite As BANanoSQLite
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
	'check parent view
	Dim pb As Map = pg.GetValues("propbag")
	Dim view As String = pb.GetDefault("view","")
	Select Case view
		Case "row", "column"
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
					newctrl.Put("name", ctrl)
					newctrl.Put("tabindex",tbindex)
					newctrl.Put("label",Capitalize(ctrl))
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
				End If
			Next
			pg.BoClose(winux)
			RefreshTreeWait
			Return
		Case "datatable"
			'add data columns
			'split the controls so we get each
			Dim controls() As String = BANano.Split(",", scontrols)
			Dim tbindex As Int = 0
			For Each ctrl As String In controls
				tbindex = tbindex + 1
				ctrl = ctrl.Trim
				If ctrl <> "" Then
					ctrl = ctrl.ToLowerCase
					Dim newctrl As Map = CreateMap()
					newctrl.Put("id", ctrl)
					newctrl.Put("view", "datacolumn")
					newctrl.Put("parentid", parentid)
					newctrl.Put("addingmethod","AddDataColumns")
					newctrl.Put("tabindex",tbindex)
					newctrl.Put("grid_header",ctrl)
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
				End If
			Next
			pg.BoClose(winux)
			RefreshTreeWait
			Return
	End Select
		
	'
	Dim prefix As String = pg.MvField(parentid,1,".")
	Dim suffix As String = pg.MvField(parentid,2,".")
	Select Case prefix
		Case "wixsomething"
			Dim controls() As String = BANano.Split(",", scontrols)
			Dim tbindex As Int = 0
			For Each ctrl As String In controls
				tbindex = tbindex + 1
				ctrl = ctrl.Trim
				If ctrl <> "" Then
					Dim prop As Map = CreateMap()
					prop.Put("id", "property")
					prop.Put("name", ctrl)
					prop.put("parentid", suffix)
					prop.put("controltype","TextBox")
					prop.Put("tabindex", tbindex)
					prop.Put("FieldType", "Object")
					FixProperty(ctrl, prop)
					Dim k As String = $"${suffix}.${ctrl}"$
					prop.Put("key", k)
					json = pg.Map2Json(prop)
					prop.put("json", json)
					prop.Remove("controltype")
					prop.remove("FieldType")
					prop.remove("List")
					sqlite.initialize
					sqlite.AddStrings(Array("id"))
					qry = sqlite.InsertReplace("properties", prop)
					res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
					rs = sqlite.GetResultSet(qry, res)
				End If
			Next
		Case Else
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
					newctrl.Put("name", ctrl)
					newctrl.Put("tabindex",tbindex)
					newctrl.Put("label",Capitalize(ctrl))
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
				End If
			Next
	End Select
	pg.BoClose(winux)
	RefreshTreeWait
End Sub

Sub FixProperty(key As String, prop As Map)
	Select Case key
		Case "animate","autoheight","autowidth","borderless","disabled","dynamic","hidden","multiselect","navigation","autofit","autofocus","close","fullscreen","modal","move","point","resize", _
			"toFront","controls","apiOnly","directory","autosend", "autoconfig","removemissed","removeMissed","required","isolate","responsive","readonly","autoConfig","editable","prerender", _
			"scrollx","scrolly","complexdata", "resizerow", "resizecolumn","resizeColumn","resizeRow","scrollX","scrollY","undo","complexData","vertical","multiple"
			prop.put("controltype","CheckBox")
			prop.Put("FieldType", "Boolean")
		Case "collapsed", "stringResult","threeState"
			prop.put("controltype","CheckBox")
			prop.Put("FieldType", "Boolean")
		Case "clipboard"
			prop.put("controltype","Combo")
			prop.Put("List", "|modify|true|insert|custom")
		Case "select"
			prop.put("controltype","Combo")
			prop.Put("List", "|true|false|multiselect")
		Case "position"
			prop.put("controltype","Combo")
			prop.Put("List", "|center|top|bottom|left|right")
		Case "relative"
			prop.put("controltype","Combo")
			prop.Put("List", "|left|right")
		Case "align"
			prop.put("controltype","Combo")
			prop.Put("List", "|left|center|right")
		Case "datatype"
			prop.put("controltype","Combo")
			prop.Put("List", "|json|xml|jsarray|csv")
		Case "drag"
			prop.put("controltype","Combo")
			prop.Put("List", "|true|order|move|inner|source|target|false")
		Case "dragscroll"
			prop.put("controltype","Combo")
			prop.Put("List", "|x|y|xy|false|true")
		Case "scroll"
			prop.put("controltype","Combo")
			prop.Put("List", "|x|y|xy|auto|false|true")
		Case  "labelAlign", "labelalign", "inputAlign","inputalign"
			prop.put("controltype","Combo")
			prop.Put("List", "|left|right")
		Case "labelPosition","labelposition"
			prop.put("controltype","Combo")
			prop.Put("List", "|left|top")
		Case "layout"
			prop.put("controltype","Combo")
			prop.Put("List", "|x|y")
		Case "validate"
			prop.put("controltype","Combo")
			prop.Put("List", "|isNotEmpty|isNumber|isEmail")
		Case "validateEvent","validateevent"
			prop.put("controltype","Combo")
			prop.Put("List", "|blur|key")
		Case "blockselect"
			prop.put("controltype","Combo")
			prop.Put("List", "|true|box|select|false")
	End Select
End Sub

Sub btnMulti1_clickwait
	'see selected treeitem
	Dim qry As String, res As String, rs As SQLiteResultSet, sqlite As BANanoSQLite
	
	Dim parentid As String = pg.GetSelectedID("tree")
	If parentid = "" Then
		pg.Message_Error("Please select the parent item from the tree first!")
		Return
	End If
	'validate the form
	Dim fValid As Boolean = pg.Validate("frmy")
	If fValid = False Then
		pg.Message_Error("No things have been entered!")
		Return
	End If
	'get the contents of the form
	Dim scontrols As String = pg.GetValue("txtmultiplefields")
	scontrols = scontrols.trim
	'
	Dim sprefix As String = pg.MvField(parentid,1,".")
	Dim suffix As String = pg.MvField(parentid,2,".")
	Select Case sprefix
		Case "connection"
			'split the controls so we get each
			Dim controls() As String = BANano.Split(",", scontrols)
			For Each ctrl As String In controls
				ctrl = ctrl.Trim
				If ctrl <> "" Then
					ctrl = ctrl.ToLowerCase
					Dim ntbl As Map = CreateMap()
					ntbl.Put("id", "table")
					ntbl.Put("value", ctrl)
					ntbl.Put("primarykey", "id")
					ntbl.put("type", "INT")
					ntbl.Put("autoincrement", False)
					Dim k As String = $"table.${ctrl}"$
					'convert to json
					Dim json As String = pg.Map2Json(ntbl)
					'insert the record to elements
					sqlite.Initialize
					sqlite.AddStrings(Array("id"))
					Dim rec As Map = CreateMap()
					rec.Put("id", "table")
					rec.put("value", ctrl)
					rec.put("json", json)
					rec.Put("key", k)
					qry = sqlite.Insert("tables", rec)
					res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
					rs = sqlite.GetResultSet(qry,res)
				End If
			Next
		Case "table"
			'add fields
			'split the controls so we get each
			Dim tabindex As Int = 0
			Dim controls() As String = BANano.Split(",", scontrols)
			For Each ctrl As String In controls
				tabindex = tabindex + 1
				ctrl = ctrl.Trim
				If ctrl <> "" Then
					ctrl = ctrl.ToLowerCase
					Dim k As String = $"field.${suffix}.${ctrl}"$
					Dim ntbl As Map = CreateMap()
					ntbl.Put("id", "field")
					ntbl.Put("value", ctrl)
					ntbl.Put("tablename", suffix)
					ntbl.Put("key", k)
					ntbl.Put("type","STRING")
					ntbl.Put("length",20)
					ntbl.Put("tabindex", tabindex)
					'convert to json
					Dim json As String = pg.Map2Json(ntbl)
					'insert the record to elements
					sqlite.Initialize
					sqlite.AddStrings(Array("id"))
					Dim rec As Map = CreateMap()
					rec.Put("id", "field")
					rec.put("tablename", suffix)
					rec.put("value", ctrl)
					rec.put("json", json)
					rec.Put("key", k)
					rec.Put("tabindex", tabindex)
					qry = sqlite.Insert("fields", rec)
					res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
					rs = sqlite.GetResultSet(qry,res)
				End If
			Next
	End Select
	pg.BoClose(fldWin)
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
	t.Put("localId","")
	t.Put("parentid","form")
	t.Put("addingmethod","AddRows")
	t.Put("tabindex","0")
	t.Put("view","text")
	t.Put("type","text")
	t.Put("inputAlign","")
	t.Put("label","Text 1")
	Return t
End Sub

Sub closeWin
	pg.boClose(winux)
End Sub

Sub closeWin1
	pg.boClose(fldWin)
End Sub


Sub add_fields
	'see selected treeitem
	Dim parentid As String = pg.GetSelectedID("tree")
	If parentid = "" Then
		pg.Message_Error("Please select the parent from the tree first to add things to.")
		Return
	End If
	Dim prefix As String = pg.MvField(parentid,1,".")
	Dim pb As Map = pg.GetValues("propbag")
	Dim view As String = pb.GetDefault("view","")
	Select Case view
		Case "datatable", "row", "column"
			pg.BOShow(CreateWindow)
			Return
	End Select
	Select Case prefix
		Case "table", "connection"
			pg.boShow(CreateWindowFields)
		Case "form", "wixsomething"
			pg.BOShow(CreateWindow)
	End Select
End Sub

Sub CreateWindowFields As BANanoObject
	Dim win As WixWindow
	win.Initialize("fldWindow").SetWidth(700).SetHeight(400).SetMove(True)
	win.SetPositionCenter("")
	win.SetModal(True)
	win.ToolBar.SetPadding(10)
	win.ToolBar.CreateLabel("lbl").SetLabel("Add Multiple Things").Pop
	win.ToolBar.CreateIcon("icnclose1").SetIcon("mdi mdi-close").SetClick(BANano.CallBack(Me,"closeWin1",Null)).pop
	'replace normal header
	win.SetToolBar(True)
	'
	Dim frmx As WixForm
	frmx.Initialize("frmy").SetBorderless(True)
	'
	Dim txtArea As WixTextArea
	txtArea.Initialize("txtmultiplefields").SetLabel("Enter the names of the multiple things separated by a comma.")
	txtArea.SetLabelPosition("top").SetInvalidMessage("No things have been entered!")
	txtArea.SetRequired(True).SetValidateIsNotEmpty(True).SetValidateEventBlur(True)
	frmx.AddRows(txtArea.Item)
	'
	Dim btnSave As WixButton
	btnSave.Initialize("btnMulti1").SetLabel("Apply").SetClick(BANano.callback(Me,"btnMulti1_clickwait",Null))
	btnSave.SetBadge("0")
	frmx.AddRows(btnSave.Item)
	 
	win.setbody(frmx.Item)
	'win.SetFullScreen(True)
	fldWin = pg.AddWindow(win)
	'detect change event
	pg.OnKeyPress("txtmultiplefields", BANano.callback(Me, "fieldschange", Null))
	Return fldWin
End Sub

Sub fieldschange()
	Dim scontrols As String = pg.GetValue("txtmultiplefields")
	scontrols = scontrols.trim
	If scontrols = "" Then
		pg.Define("btnMulti1", CreateMap("badge":"0"))
		pg.Refresh("btnMulti1")
	Else
		Dim cCount As Int = pg.MvCount(scontrols, ",")
		pg.Define("btnMulti1", CreateMap("badge":cCount))
		pg.Refresh("btnMulti1")
	End If
End Sub

Sub BuildClass(somethingName As String, ws As Map, props As List) As String
	Dim cc As String = Capitalize(somethingName)
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append($"'CREATE A CLASS CALLED Wix${cc}"$).Append(CRLF)
	sb.Append("#IgnoreWarnings:12").append(CRLF)
	sb.Append("Sub Class_Globals").append(CRLF)
	sb.Append("Public ID As String").Append(CRLF)
	sb.Append($"Public ${cc} As WixElement"$).Append(CRLF)
	sb.Append("End Sub").append(CRLF).Append(CRLF)
	
	'get the view
	json = ws.Get("json")
	rec = pg.Json2Map(json)
	Dim v As String = rec.Get("view")
	'
	sb.Append($"'Initializes the ${somethingName}"$).Append(CRLF)
	sb.append($"Public Sub Initialize(sid As String) As Wix${cc}"$).Append(CRLF)
	sb.Append("ID = sid.tolowercase").Append(CRLF)
	sb.Append($"${cc}.Initialize(ID).SetView("${v}")"$).Append(CRLF)
	sb.append("Return Me").Append(CRLF)
	sb.Append("End Sub").append(CRLF).append(CRLF)
	'
	sb.Append("'return the item").Append(CRLF)
	sb.append("Sub Item As Map").Append(CRLF)
	sb.append($"Return ${cc}.item"$).append(CRLF)
	sb.append("End Sub").append(CRLF).append(CRLF)
	'
	For Each prop As Map In props
		json = prop.getdefault("json", "")
		rec = pg.Json2Map(json)
		Dim sname As String = rec.GetDefault("name","")
		Dim sFieldType As String = rec.GetDefault("FieldType","")
		Dim cname As String = Capitalize(sname)
		'
		sb.append($"Sub Set${cname}(${sname} As ${sFieldType}) As Wix${cc}"$).append(CRLF)
		sb.Append($"${cc}.SetAttr("${sname}", ${sname})"$).Append(CRLF)
		sb.append("Return Me").Append(CRLF)
		sb.Append("End Sub").Append(CRLF).append(CRLF)
	Next
	'
	sb.Append("'add to parent rows").Append(CRLF)
	sb.Append("Sub AddToRows(P As WixElement)").Append(CRLF)
	sb.append("P.AddRows(Item)").Append(CRLF)
	sb.Append("End Sub").Append(CRLF).Append(CRLF)

	sb.Append("'add to parent columns").Append(CRLF)
	sb.append("Sub AddToColumns(P As WixElement)").Append(CRLF)
	sb.append("P.AddColumns(Item)").Append(CRLF)
	sb.Append("End Sub").Append(CRLF).Append(CRLF)

	sb.Append("'add to parent elements").Append(CRLF)
	sb.Append("Sub AddToElements(P As WixElement)").Append(CRLF)
	sb.append("P.AddElements(Item)").Append(CRLF)
	sb.Append("End Sub").Append(CRLF).Append(CRLF)
	'
	'build property bag
	sb.Append($"'CREATE A CODE MODULE named d${cc}"$).append(CRLF).append(CRLF)
	sb.Append("Sub Process_Globals").append(CRLF)
	sb.append("End Sub").Append(CRLF).append(CRLF)
	'
	sb.Append("Sub BuildBag(Page As WixPage, Bag As WixProperty)").append(CRLF)
	sb.append("Bag.Clear").Append(CRLF)
	sb.Append($"Bag.AddTextBox("id","Id", "${somethingName}1")"$).Append(CRLF)
	sb.Append($"Bag.AddTextBox("parentid","Parent", "")"$).Append(CRLF)
	sb.Append($"Bag.AddCombo("addingmethod","Adding Method","AddRows", pgFD.addingmethod)"$).Append(CRLF)
	sb.Append($"Bag.AddTextBox("tabindex", "Tab Index", "0")"$).append(CRLF)
	sb.Append($"Bag.AddLabel("Details")"$).Append(CRLF)
	sb.append($"Bag.AddCombo("view","View", "${somethingName}", Page.Views)"$).Append(CRLF)
		
	For Each prop As Map In props
		json = prop.getdefault("json", "")
		rec = pg.Json2Map(json)
		Dim sname As String = rec.GetDefault("name","")
		Dim scontroltype As String = rec.GetDefault("controltype","")
		Dim cname As String = Capitalize(sname)
		Dim sDefaultValue As String = rec.GetDefault("DefaultValue","")
		Dim sList As String = rec.getdefault("List","")
		sList = sList.Replace("|", ",")
		sList = QuoteList(sList, ",")
		'
		Select Case scontroltype
			Case "Combo", "RichSelect", "Select"
				sb.Append($"Bag.Add${scontroltype}("${sname}", "${cname}", "${sDefaultValue}", array(${sList}))"$).Append(CRLF)
			Case Else
				sb.append($"Bag.Add${scontroltype}("${sname}","${cname}", "${sDefaultValue}")"$).Append(CRLF)
		End Select
	Next
	'
	sb.Append("Bag.Refresh(Page)").Append(CRLF)
	sb.append("End Sub").append(CRLF).append(CRLF)
	
	Return sb.tostring
End Sub


Sub QuoteList(lst As String, delim As String) As String
	Dim sb As StringBuilder
	sb.Initialize
	Dim spvalues() As String = BANano.Split(delim, lst)
	For Each sval As String In spvalues
		Dim oval As String = $""${sval}""$
		sb.Append(oval).Append(delim)
	Next
	Dim xout As String = sb.ToString
	xout = pg.RemDelim(xout,delim)
	Return xout
End Sub