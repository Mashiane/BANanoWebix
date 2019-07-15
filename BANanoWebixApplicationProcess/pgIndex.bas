B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Process_Globals
	Private pg As WixPage
	Public BANano As BANano
	Private db As BANanoSQL
End Sub

Sub Init(pgContainer As String)
	db.OpenWait("db", "db")
	pg.Initialize("index", pgContainer).SetResponsive(True).SetHeader("Hello BANanoWebix")
	'lets create a form
	Dim form As WixForm
	form.Initialize("form").SetName("form").SetDefaultLabelPosition("top")
	
	Dim id As WixText
	id.Initialize("id").SetType("text").SetLabel("ID").SetName("id")
	form.AddRows(id.Item)
	
	Dim field1 As WixText
	field1.Initialize("field1").SetType("text").SetLabel("Field 1").SetNAme("field1")
	form.AddRows(field1.Item)
	
	Dim field2 As WixText
	field2.Initialize("field2").SetType("text").SetLabel("Field 2").SetName("field2")
	form.AddRows(field2.Item)
	
	Dim field3 As WixText
	field3.Initialize("field3").SetType("text").SetLabel("Field 3").SetName("field3")
	form.AddRows(field3.Item)
	'
	Dim r1 As WixElement
	r1.Initialize("r1")
	'
	Dim r1c1 As WixElement
	r1c1.Initialize("r1c1")
	'
	Dim btnnew As WixButton
	btnnew.Initialize("btnnew").SetLabel("Clear")
	btnnew.SetClick(BANano.CallBack(Me,"btnnew_click",Null))
	r1c1.AddColumns(btnnew.Item)
	
	Dim btninsert As WixButton
	btninsert.Initialize("btninsert").SetLabel("Create")
	btninsert.SetClick(BANano.CallBack(Me,"btninsert_click",Null))
	r1c1.AddColumns(btninsert.Item)
	
	Dim btnread As WixButton
	btnread.Initialize("btnread").SetLabel("Read")
	btnread.SetClick(BANano.CallBack(Me,"btnread_click",Null))
	r1c1.AddColumns(btnread.Item)
	
	Dim btnupdate As WixButton
	btnupdate.Initialize("btnupdate").SetLabel("Update")
	btnupdate.SetClick(BANano.CallBack(Me,"btnupdate_click",Null))
	r1c1.AddColumns(btnupdate.Item)
		
	Dim btndelete As WixButton
	btndelete.Initialize("btndelete").SetLabel("Delete")
	btndelete.SetClick(BANano.CallBack(Me,"btndelete_click",Null))
	r1c1.AddColumns(btndelete.Item)
	
	Dim btngetall As WixButton
	btngetall.Initialize("btngetall").SetLabel("Get All")
	btngetall.SetClick(BANano.CallBack(Me,"btngetall_click",Null))
	r1c1.AddColumns(btngetall.Item)
	
	r1.AddRows(r1c1.Item)
	form.AddRows(r1.Item)
	'
	pg.AddRows(form.Item)
	
	pg.UI
	
End Sub



Sub btninsert_click
	'lets validate the form
	Dim bValid As Boolean = pg.Validate("form")
	If bValid = False Then Return
	'insert record to table
	Dim alaSQL As BANanoAlaSQL
	'initialize the helper class
	alaSQL.Initialize
	'Get values from the form
	Dim rec As Map = pg.GetValues("form")
	'save record to the database
	Dim rs As AlaSQLResultSet = alaSQL.Insert("table1", rec)
	rs.Result = db.ExecuteWait(rs.query, rs.args)
End Sub

Sub btnread_click
	'get the content of the primary key field
	Dim priValue As String = pg.GetValue("id")
	'read record from table
	Dim alaSQL As BANanoAlaSQL
	'initialize the helper class
	alaSQL.Initialize
	'generate the select where statement
	Dim rs As AlaSQLResultSet = alaSQL.Read("table1", "id", priValue)
	rs.result = db.ExecuteWait(rs.query, rs.args)
	'the record was found, set the values to the form
	If rs.result.size > 0 Then
		Dim rec As Map = rs.result.Get(0)
		'set returned map to form
		pg.SetValues("form", rec)
	End If
End Sub

Sub btnnew_click
	'clear the contents of the form
	pg.Clear("form")
End Sub

Sub btnupdate_click
	'lets validate the form
	Dim bValid As Boolean = pg.Validate("form")
	If bValid = False Then Return
	'Get values from the form
	Dim rec As Map = pg.GetValues("form")
	'get the primary key
	Dim priValue As String = pg.GetValue("id")
	Dim alaSQL As BANanoAlaSQL
	'initialize the helper class
	alaSQL.Initialize
	'update record in the table
	Dim rs As AlaSQLResultSet = alaSQL.UpdateWhere("table1", rec, CreateMap("id":priValue))
	rs.Result = db.ExecuteWait(rs.query, rs.args)
End Sub

Sub btndelete_click
	'draw a confirm dialog
	Dim confirmDelete As Boolean = False
	Dim cb As BANanoObject = BANano.CallBack(Me,"deletetable1",Array(confirmDelete))
	pg.Confirm(cb, "Confirm Delete", "Are you sure that you want to delete this record?")
End Sub

Sub Deletetable1
	'get the primary key
	Dim priValue As String = pg.GetValue("id")
	Dim alaSQL As BANanoAlaSQL
	'initialize the helper class
	alaSQL.Initialize
	'delete record in the table
	Dim rs As AlaSQLResultSet = alaSQL.DeleteWhere("table1", CreateMap("id":priValue))
	rs.Result = db.ExecuteWait(rs.query, rs.args)
End Sub

Sub btngetall_click
	Dim alaSQL As BANanoAlaSQL
	'initialize the helper class
	alaSQL.Initialize
	'update record in the table
	Dim rs As AlaSQLResultSet = alaSQL.SelectAll("table1", Array("*"), Array("id"))
	rs.Result = db.ExecuteWait(rs.query, rs.args)
	Dim json As String = BANano.ToJson(rs.result)
	pg.Message(json)
End Sub