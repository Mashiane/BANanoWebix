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
	Public myForm As WixForm
	Public BANano As BANano
	Public fu As BANanoObject
	Private upload As WixUploader
End Sub

Sub Init(pgContainer As String)
	pg.Initialize("wp", pgContainer).SetHeader("Lesson 22: File Uploader - Part 1").SetTypeSpace("").SetResponsive("master")
	'
	Dim R1 As WixRow
	R1.Initialize("R1").SetTemplate("<p>Click on any photo to change it</p>").SetHeight(50)
	pg.AddRow(R1)
	'
	Dim R2 As WixRow
	R2.Initialize("R2")
	'
	Dim sPhoto As String
	Dim img As UOENowHTML
	'create the template to show the image
	img.Initialize("img", "img").SetStyle("cursor", "pointer").SetStyle("width", "80px").SetStyle("height", "80px").SetSRC("./assets/#photo#",True)
	sPhoto = img.HTML
		
	Dim dt As WixDataTable
	dt.Initialize("people")
	dt.CreateColumn("photo").SetHeader(" ").SetWidth(100).SetTemplate(sPhoto).AddToColumns(dt.datatable)
	dt.CreateColumn("name").SetHeader("Employee Name").SetWidth(200).AddToColumns(dt.datatable)
	dt.CreateColumn("job").SetHeader("Job Title").SetFillSpace(True).AddToColumns(dt.datatable)
	dt.Setautoheight(True).SetscrollX(False).SetRowHeight(80)
	'
	Dim data As List
	data.Initialize
	data.Add(CreateMap("id":1, "name":"Alex Bret", "job":"Manager", "photo":"2.png"))
	data.Add(CreateMap("id":2, "name":"Ruby Goldberg", "job":"Lead developer", "photo":"1.png"))
	dt.SetData(data)
	
	'
	R2.AddItem(dt.Item)
	'
	pg.AddRow(R2)
	pg.ui
	'
	'add a click event per row
	Dim row As Map
	pg.onitemclick("people", BANano.CallBack(Me,"itemClick",Array(row)))
	
	' create an uploader and add it to the page in run-time
	
	upload.Initialize("upload").SetAccept("image/png, image/gif, image/jpeg").SetDataType("json").SetApiOnly(True)
	upload.SetUpload("./assets/upload.php")
	'
	fu = pg.AddUploader(upload)
	'
	Dim ffile As BANanoObject
	pg.OnFileUploadError("upload", BANano.CallBack(Me, "onFileUploadError", Array(ffile)))
	pg.onFileUpload("upload", BANano.CallBack(Me, "onFileUpload", Array(ffile)))
End Sub


Sub onFileUpload(ffile As BANanoObject)
	Log("onFileUpload")
	'get the status
	Log(ffile)
	Dim status As String = ffile.GetField("status").Result
	Select Case status
	Case "success", "server"
		'get the row id
		Dim rowid As String = pg.GetRowIDFromContext(ffile)
		'get the row object from data-table
		Dim row As Map = pg.GetItem("people", rowid)
		'get the file name
		Dim fname As String = ffile.GetField("name").Result
		'update the row photo
		row.Put("photo", fname)
		'update the data-table
		pg.UpdateItem("people", rowid, row)
	Case Else
		pg.Alert("Error during file upload!")
	End Select
End Sub


Sub OnFileUploadError(ffile As BANanoObject)
	Log("OnFileUploadError")
	Log(ffile)
	pg.Alert("Error during file upload!")
End Sub

Sub itemClick(row As Map)
	Dim rid As String = row.Get("row")
	Dim col As String = row.Get("column")
	rid = pg.CStr(rid)
	col = pg.CStr(col)
	
	Select Case col
	Case "photo"
		'when a photo is selected, show file dialog
		pg.FileDialog("upload", CreateMap("rowid": rid))
	End Select
End Sub