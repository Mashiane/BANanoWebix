B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12

Sub Class_Globals
	Public ID As String
	Public Comments As WixElement
	Private CommentUsers As List
	Private Data As List
	Public USER_ACTIVE As String = "active"
	Public USER_AWAY As String = "away"
	Public USER_BUSY As String = "busy"
	Public USER_NONE As String = "none"
	Public Parent As WixElement

End Sub

'set the parent
Sub SetParent(p As WixElement) As WixComments
	Parent = p
	Return Me
End Sub

'set padding
Sub SetPadding(padding As Object) As WixComments
	Comments.SetPadding(padding)
	Return Me
End Sub

'set padding
Sub SetMargin(margin As Object) As WixComments
	Comments.SetMargin(margin)
	Return Me
End Sub

Sub SetAttributes(m As Map) As WixComments
	For Each k As String In m.Keys
		Dim v As String = m.Get(k)
		Comments.SetAttr(k,v)
	Next
	Return Me
End Sub

Sub SetStyles(m As Map) As WixComments
	For Each k As String In m.Keys
		Dim v As String = m.Get(k)
		Comments.SetStyle(k,v)
	Next
	Return Me
End Sub

'Initializes the Comments object
Public Sub Initialize(sid As String) As WixComments
	ID = sid.tolowercase
	Comments.Initialize(ID).SetView("comments")
	CommentUsers.Initialize
	Data.Initialize
	Parent = Null
	Return Me
End Sub

'add tp columns of parent
Sub Pop
	Parent.AddColumns(Item)
End Sub

Sub SetTemplateHTML(h As UOENowHTML) As WixComments
	h.SetImportant(False)
	Dim os As String = h.HTML
	Comments.SetTemplate(os)
	Return Me
End Sub

'set name
Sub SetName(n As String) As WixComments
	Comments.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixComments
	Comments.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixComments
	Comments.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixComments
	Comments.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixComments
	Comments.SetMinHeight(h)
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixComments
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		Comments.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


'set css
Sub SetStyle(prop As String, sval As String) As WixComments
	Comments.SetStyle(prop,sval)
	Return Me
End Sub


'add a comment
Sub AddComment(cID As String, uID As String, cDate As String, cText As String)
	Dim comment As Map = CreateMap()
	comment.Put("id", cID)
	comment.Put("user_id", uID)
	comment.Put("date", cDate)
	comment.Put("text", cText)
	Data.Add(comment)
End Sub


'add a user
Sub AddUser(uID As String, uName As String, uImage As String, uStatus As String)
	Dim u As Map = CreateMap()
	u.Put("id", uID)
	u.Put("value", uName)
	u.Put("image", uImage)
	u.Put("status", uStatus)
	CommentUsers.Add(u)
End Sub

'set more
Sub SetMore(m As Int) As WixComments
	Comments.SetAttr("more", M)
	Return Me
End Sub


'set Comments
Sub SetCurrentUser(u As Int) As WixComments
	Comments.SetAttr("currentUser", u)
	Return Me
End Sub

'return the item
Sub Item As Map
	Return Comments.item
End Sub

'set mentions
Sub SetMentions(b As Boolean) As WixComments
	Comments.SetAttr("mentions", b)
	Return Me
End Sub

'set more button
Sub SetMoreButton(m As String) As WixComments
	Comments.SetAttr("moreButton", m)
	Return Me
End Sub

'set mode chat
Sub SetModeChat(c As String) As WixComments   'ignore
	Comments.SetAttr("mode", "chat")
	Return Me
End Sub

'set data
Sub SetData(cData As List) As WixComments
	Comments.SetData(cData)
	Return Me
End Sub

'set users
Sub SetUsers(cUsers As List) As WixComments
	Comments.SetAttr("users", cUsers)
	Return Me
End Sub

'set width
Sub SetWidth(w As Object) As WixComments
	Comments.SetAttr("width", w)
	Return Me
End Sub

'set height
Sub SetHeight(h As Object) As WixComments
	Comments.SetAttr("height", h)
	Return Me
End Sub


'add to parent rows
Sub AddToRows(P As WixElement)
	P.AddRows(Item)
End Sub

'add to parent columns
Sub AddToColumns(P As WixElement)
	P.AddColumns(Item)
End Sub

'add to parent elements
Sub AddToElements(P As WixElement)
	P.AddElements(Item)
End Sub