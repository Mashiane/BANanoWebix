B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.51
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private pg As WixPage
	Public BANano As BANano
End Sub

#if javascript
	function getUsers(){
		return usersData;
	}
	
	function getComments(){
		return commentsData;
	}
#End If

Sub Init
	pg.Initialize("forms")
	Dim R1 As WixRow
	R1.Initialize("R1")
	 
	'add toolbar
	Dim tblBar As WixToolBar
	tblBar.Initialize("tblBar")
	tblBar.CreateIcon("menuopen").SetIcon("mdi mdi-menu").SetClick(BANano.CallBack(Me, "OpenMenu", Null)).Pop
	tblBar.CreateLabel("heading").SetLabel("Lesson 17: Comments").Pop
	tblBar.AddSpacer
	tblBar.CreateIcon("").SetIcon("mdi mdi-comment").SetBadge("4").pop
	tblBar.CreateIcon("").SetIcon("mdi mdi-bell").SetBadge("10").Pop
	tblBar.setPadding(3)

	'pg.Page.AddRows(tblBar.Item)
	R1.AddRows(tblBar.Item)
	
	pg.Page.AddRow(R1)
	'
	Dim R2 As WixRow
	R2.Initialize("R2")
	'
	Dim ud As List = BANano.RunJavascriptMethod("getUsers",Null)
	Dim cd As List = BANano.RunJavascriptMethod("getComments", Null)
	'
	Dim comments As WixComments
	comments.Initialize("comments").SetUsers(ud).SetData(cd).SetCurrentUser(4).SetMentions(True).SetModeChat("")
	
	R2.AddColumns(comments.item) 
	pg.Page.AddRow(R2)
	pg.ui
	
End Sub