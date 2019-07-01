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
	Public listView As WixList	
End Sub

Sub Init
	'create a page with a header and set 'space' layout
	pg.Initialize("").SetHeader("Lesson 22: File Uploader - Part 2 (Linked List)")
	pg.Page.SetTypeSpace
	'
	'create a row
	Dim R1 As WixRow
	R1.Initialize("R1")
	'
	'create a form
	myForm.Initialize("myform")
	'
	'create an uploader
	Dim up As WixUploader
	up.Initialize("upload").SetValue("Upload File").SetLink("mylist").SetUpload("./assets/upload.php").SetDataType("json")
	'create the list
	Dim lst As WixList
	lst.Initialize("mylist").SetTypeUploader(True).SetAutoHeight(True).SetBorderLess(True)
	'
	'add uploader to a form row collection
	myForm.AddRows(up.Item)
	'add list to a form row collection
	myForm.AddRows(lst.Item)
	'
	'add form to R1
	R1.AddRows(myForm.Item)
	'add R1 to page
	pg.AddRow(R1)
	'
	'render the page
	pg.ui
	'
	Dim ffile As BANanoObject
	pg.OnFileUploadError("upload", BANano.CallBack(Me, "onFileUploadError", Array(ffile)))
	pg.onFileUpload("upload", BANano.CallBack(Me, "onFileUpload", Array(ffile)))
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

Sub OnFileUploadError(ffile As Object)
	Log("OnFileUploadError")
	pg.Alert("Error during file upload!")
End Sub
