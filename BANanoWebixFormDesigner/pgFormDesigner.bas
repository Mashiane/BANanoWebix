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
	Private drawn As BANanoObject
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
	R2.CreateResizer("").AddToColumns(R2.Row)
	
	'
	propBag.Initialize("propbag").SetWidth(300).setnamewidth(150).SetScroll(True)
	Dim frm As WixForm = modPropertyBag.getPropertyBag
	R2.AddColumns(frm.Item)
	R2.CreateResizer("").AddToColumns(R2.Row)
	'	
	Dim formholder As WixRow = modCenter.getCenter
	
	R2.AddColumns(formholder.Item)
	pg.AddRow(R2)
	'
	pg.ui
	'hide some things
	pg.Hide("testconnect")
	pg.Hide("propadd")
	pg.Hide("add_row")
	pg.Hide("add_column")
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

Sub add_row
	sidebar_click("row")
End Sub

Sub add_column
	sidebar_click("column")
End Sub

'test the connection to the database
Sub testconnect
	'get the contents of the property bag
	Dim cm As Map = pg.GetValues("propbag")
	
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
	Dim opt1 As Map = CreateMap("template": "")
	pg.Define("codeit", opt1)
	pg.Refresh("codeit")
End Sub

'refresh the tree whenever an item is saved
Sub RefreshTreeWait
	'clear tree
	pg.ClearAll("tree")
	'
	pg.AddNode("tree", "", "connection", "Database", "", pg.EnumWixIcons.Folder,"","",True)
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
	qry = sqlite.SelectAll("fields", Array("key","tablename"), Array("key"))
	res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
	rs = sqlite.GetResultSet(qry, res)
	For Each fitem As Map In rs.result
		Dim key As String = fitem.Get("key")
		Dim tablename As String = fitem.Get("tablename")
		Dim tblKey As String = $"table.${tablename}"$
		pg.AddNode("tree", tblKey, key, key, "", pg.EnumWixIcons.Folder,"","",True)
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
		pg.AddNode("tree", parentid, itmID, itmID, "", pg.EnumWixIcons.FileIcon, "", "", True)
	Next
	pg.Refresh("tree")
End Sub


Sub AddPrimaryKey
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
	'
	Dim jsonm As Map = CreateMap()
	jsonm.Put("type", ft)
	jsonm.Put("length", "20")
	jsonm.put("id", "field")
	jsonm.put("tablename", tbname)
	jsonm.Put("value", pk)
	'
	Dim json As String = pg.Map2Json(jsonm)
	nf.Put("json", json)
	'
	'replace
	sqlite.Initialize
	sqlite.AddStrings(Array("id"))
	'replace complete record
	qry = sqlite.InsertReplace("fields", nf)
	res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
	'check existence
	sqlite.initialize
	sqlite.AddStrings(Array("id"))
	qry = sqlite.Exists("fields", "key", k)
	res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
	rs = sqlite.GetResultSet(qry,res)
	pg.Message(rs.result.size & " record(s) affected!")
End Sub

Sub CreateTableCode(tblName As String, priKey As String, rsx As SQLiteResultSet) As String
	Dim sb As StringBuilder
	sb.Initialize
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
	sb.Append($"Sub Delete${tblName}"$).Append(CRLF)
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
	Select Case pid
	Case "connection"
		'add a table
		sidebar_click("table")
	Case "table"
		'add a field
		sidebar_click("field")
	Case "field"
		'add a field
		Dim k As String = $"table.${tablename}"$
		'select the table
		pg.SelectItem("tree", k)
		sidebar_click("field")
	Case Else
		'add a textbox	
		sidebar_click("text")
	End Select
End Sub

'save the item
Sub prop_saveWait
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
	Case "field"
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
		'replace complete record
		qry = sqlite.InsertReplace("fields", rec)
		res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
		'check existence
		sqlite.initialize
		sqlite.AddStrings(Array("id"))
		qry = sqlite.Exists("fields", "key", key)
		res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
		rs = sqlite.GetResultSet(qry,res)
		pg.Message(rs.result.size & " record(s) affected!")
	Case "table"
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
		'check existence
		sqlite.initialize
		sqlite.AddStrings(Array("id"))
		qry = sqlite.Exists("tables", "key", key)
		res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
		rs = sqlite.GetResultSet(qry,res)
		pg.Message(rs.result.size & " record(s) affected!")
		'
		'add primary key
		AddPrimaryKey
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
		sqlite.Initialize
		sqlite.AddStrings(Array("id"))
		'new connect record
		rec = CreateMap()
		rec.Put("id", i)
		rec.Put("json", json)
		'replace complete record
		qry = sqlite.InsertReplace("connect", rec)
		res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
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
		Dim formView As Map = CreateView(prop)
		SourceCodePreview1(formView,prop)
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
		SourceCodePreview1(m,prop)
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
	Dim rp As Map = pg.GetValues("propbag")
	delID = rp.Get("id")
	Dim value As String = rp.GetDefault("value", "")
	Dim tablename As String = rp.GetDefault("tablename", "")
	Dim key As String = $"table.${value}"$
	Select Case delID
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
	Dim Q As String = "$"
	Dim v As String = m.GetDefault("view","")
	Dim i As String = m.GetDefault("id","")
	Dim a As String = m.GetDefault("action","")
	v = pg.CStr(v)
	If v = "" Then v = "Element"
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
			sb.Append($"${i}.Set${k}(${q}"${xval}")${q}"$).Append("<br>")
		Else
			sb.Append($"${i}.Set${k}("${strval}")"$).Append("<br>")
		End If
	Next
	If sparentid <> "" Then
		sb.Append(sparentid).Append(".").Append(saddingmethod).Append("(").Append(i).Append(".Item)")
	End If
	Return sb.tostring
End Sub

Sub SourceCodePreview(script As String)
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

Sub SourceCodePreview1(m As Map,original As Map)
	ClearPreviewIT
	'get the source code of the item
	Dim elCode As String = SourceCodeItem(m, original)
	'
	Dim sb As StringBuilder
	sb.Initialize 
	sb.Append("<pre>")
	sb.Append(elCode)
	sb.Append("</pre>")
	'
	Dim scode As String = sb.tostring
	pg.Define("codeit", CreateMap("template":scode))
	pg.Refresh("codeit")
	'
	Dim v As String = m.Get("view")
	Log(v)
	If v <> "form" Then 
		drawn = pg.UX(m)
	End If
End Sub

Sub tree_clickwait(recid As String)
	ClearPreviewIT
	ClearCodeIT
	propBag.Clear
	propBag.Refresh(pg)
	pg.Hide("propadd")
	Dim prefix As String = pg.MvField(recid,1,".")
	Dim suffix As String = pg.MvField(recid,2,".")
	pg.Hide("testconnect")
	pg.Hide("propadd")
	pg.Hide("add_row")
	pg.Hide("add_column")
	Select Case prefix
	Case "field"
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
			qry = sqlite.SelectWhere("fields", Array("json"), CreateMap("tablename":suffix),Array("value"))
			res = BANano.CallInlinePHPWait("BANanoSQLite", CreateMap("dbname": dbName, "data": qry))
			rs = sqlite.GetResultSet(qry,res)
			'generate code
			Dim tcode As String = CreateTableCode(suffix,primarykey,rs)
			SourceCodePreview(tcode)
		End If		 
	Case "connection"
		pg.Show("propadd")
		pg.collapse("preview")
		pg.Expand("code")
		dConnection.BuildBag(pg, propBag)
		pg.Show("testconnect")
		pg.Hide("propdelete")
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
		pg.Hide("propdelete")
		pg.Collapse("preview")
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
		SourceCodePreview1(formView,rec)
	Case Else
		pg.Show("propadd")
		pg.Show("propdelete")
		pg.Expand("preview")
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
			SourceCodePreview1(m,rec)
		End If
	End Select
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

'on sidebar click, draw up the property bag
Sub sidebar_click(meid As String)
	pg.Collapse("preview")
	pg.Expand("code")
	ClearPreviewIT
	ClearCodeIT
	propBag.Clear
	propBag.Refresh(pg)
	'
	pg.Hide("testconnect")
	pg.Hide("propadd")
	pg.Hide("add_row")
	pg.Hide("add_column")
	'
	Select Case meid
	Case "con", "hlp", "buttons", "txts", "sels", "choices", "pickers","others","grid", "lay","db"
	Case "downloads"
	Case "b4xlib"
	Case "skeletonapp"
	Case "dbhelp"
		dbhelp
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
			pg.Collapse("preview")
			pg.Expand("code")
			pg.show("propdelete")
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
		If DrawPropBag(meid) Then
			pg.Show("testconnect")
			pg.Hide("propdelete")
		End If
	Case "form"
		pg.Expand("preview")
		pg.Show("add_row")
		pg.Show("add_column")
		pg.Show("propadd")
		If DrawPropBag(meid) Then
			pg.Hide("propdelete")
			rec = pg.GetValues("propbag")
			Dim m As Map = CreateView(rec)
			SourceCodePreview1(m,rec)
		End If
	Case Else
		pg.Expand("preview")
		pg.Show("propadd")
		'see selected treeitem
		Dim parentid As String = pg.GetSelectedID("tree")
		If parentid = "" Then
			pg.Message_Error("Please select the parent item from the tree first, then select the element you want to add! Remember to click Save in the property bag when done.")
			Return
		End If
		pg.Show("propdelete")
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
			pg.SetValues("propbag",rec)
			Dim m As Map = CreateView(rec)
			SourceCodePreview1(m,rec)
		End If
	End Select
End Sub

Sub DrawPropBag(con As String) As Boolean
	Select Case con
		Case "connection"
			dConnection.BuildBag(pg, propBag)
			Return True
		Case "form"
			dForm.BuildBag(pg, propBag)
			Return True
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
	pg.BoClose(winux)
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
