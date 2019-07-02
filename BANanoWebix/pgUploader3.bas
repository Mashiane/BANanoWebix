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
	Public listView As WixList
End Sub

Sub Init
	'create a page with a header and set 'space' layout
	pg.Initialize("").SetHeader("Lesson 22: File Uploader - Part 3 (DropZone)")
	pg.Page.SetTypeSpace
	'
	Dim R1 As WixRow
	R1.Initialize("R1")
	'
	Dim lst As WixList
	lst.Initialize("mylist").SetTypeUploader(True).SetHeight(600).SetWidth(300).SetScroll(False)
	'
	R1.AddItem(lst.Item)
	'
	pg.AddRow(R1)
	'
	pg.ui
	' create an uploader and add it to the page in run-time
	Dim upload As WixUploader
	upload.Initialize("upload").SetApiOnly(True).SetLink("mylist").SetUpload("./assets/upload.php").SetApiOnly(True)
	'
	fu = pg.AddUploader(upload)
	
	'add event
	Dim ffile As BANanoObject
	pg.OnFileUploadError("upload", BANano.CallBack(Me, "onFileUploadError", Array(ffile)))
	pg.onFileUpload("upload", BANano.CallBack(Me, "onFileUpload", Array(ffile)))
	
	'add a dropzone for uploader linked to the list
	pg.addDropZone("upload", "mylist")
	
End Sub


Sub onFileUpload(ffile As BANanoObject)
	Log("onFileUpload")
	Log(ffile)
	Dim status As String = ffile.GetField("status").Result
	Select Case status
	Case "success", "server"
	Case Else
		pg.Alert("Error during file upload!")
	End Select
End Sub

Sub OnFileUploadError(ffile As BANanoObject)
	Log("OnFileUploadError")
	pg.Alert("Error during file upload!")
End Sub
