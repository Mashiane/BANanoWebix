B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.51
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private pg As WixPage
	Public myForm As WixForm
	Public BANano As BANano
	Public fu As BANanoObject
	
End Sub

Sub Init
	pg.Initialize("").SetHeader("Lesson 22: File Uploader - Part 1")
	pg.Page.SetTypeSpace
	'
	Dim R1 As WixRow
	R1.Initialize("R1").SetTemplate("<p>Click on any photo to change it</p>").SetHeight(50)
	pg.AddRow(R1)
	'
	Dim R2 As WixRow
	R2.Initialize("R2")
	'
	Dim dt As WixDataTable
	dt.Initialize("people")
	'
	Dim sPhoto As String
	Dim img As UOENowHTML
	'create the template to show the image
	img.Initialize("img", "img").SetStyle("cursor", "pointer").SetStyle("width", "80px").SetStyle("height", "80px").SetSRC("./assets/#photo#",True)
	sPhoto = img.HTML
	
	dt.CreateHeader("photo").SetHeader(" ").SetWidth(100).SetTemplate(sPhoto).Pop2(dt)
	dt.CreateHeader("name").SetHeader("Employee Name").SetWidth(200).Pop2(dt)
	dt.CreateHeader("job").SetHeader("Job Title").SetFillSpace(True).Pop2(dt)
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
	Dim upload As WixUploader
	upload.Initialize("upload").SetUpload("./assets/upload.php").SetName("uploader").SetApiOnly(True)
	upload.SetAccept("image/png, image/gif, image/jpeg")
	'
	fu = pg.AddUploader(upload)
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