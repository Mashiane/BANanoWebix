B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Uploader As WixElement
	Public Parent As WixElement
End Sub

'Initializes the uploader
Public Sub Initialize(sID As String) As WixUploader
	ID = sID.ToLowerCase
	Uploader.Initialize(ID).SetView("uploader")
	SetName("upload")
	SetInputName("upload")
	Parent = Null
	Return Me
End Sub

Sub SetValue(v As String) As WixUploader
	Uploader.SetValue(v)
	Return Me
End Sub

'set padding
Sub SetPadding(padding As Object) As WixUploader
	Uploader.SetPadding(padding)
	Return Me
End Sub

'set padding
Sub SetMargin(margin As Object) As WixUploader
	Uploader.SetMargin(margin)
	Return Me
End Sub

Sub SetTemplateHTML(h As UOENowHTML) As WixUploader
	h.SetImportant(False)
	Dim os As String = h.HTML
	Uploader.SetTemplate(os)
	Return Me
End Sub


Sub SetAttributes(m As Map) As WixUploader
	For Each k As String In m.Keys
		Dim v As String = m.Get(k)
		Uploader.SetAttr(k,v)
	Next
	Return Me
End Sub

Sub SetStyles(m As Map) As WixUploader
	For Each k As String In m.Keys
		Dim v As String = m.Get(k)
		Uploader.SetStyle(k,v)
	Next
	Return Me
End Sub


'set css
Sub SetStyle(prop As String, sval As String) As WixUploader
	Uploader.SetStyle(prop,sval)
	Return Me
End Sub


'set name
Sub SetName(n As String) As WixUploader
	Uploader.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixUploader
	Uploader.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixUploader
	Uploader.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixUploader
	Uploader.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixUploader
	Uploader.SetMinHeight(h)
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixUploader
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		Uploader.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub

Sub SetInputName(n As String) As WixUploader
	Uploader.SetAttr("inputName", n)
	Return Me
End Sub

Sub SetApiOnly(b As Boolean) As WixUploader
	Uploader.SetAttr("apiOnly", b)
	Return Me
End Sub

'the type of a server-side response. Optional, json by default
Sub SetDataType(d As String) As WixUploader
	Uploader.SetAttr("datatype", d)
	Return Me
End Sub

Sub SetMultiple(b As Boolean) As WixUploader
	Uploader.SetAttr("multiple", b)
	Return Me
End Sub

Sub SetAutoSend(b As Boolean) As WixUploader
	Uploader.SetAttr("autosend", b)
	Return Me
End Sub

'the ID of a component that will display values of chosen files
Sub SetLink(l As String) As WixUploader
	Uploader.SetAttr("link", l)
	Return Me
End Sub

Sub SetDirectory(b As Boolean) As WixUploader
	Uploader.SetAttr("directory", b)
	Return Me
End Sub


Sub SetAccept(a As String) As WixUploader
	Uploader.SetAttr("accept", a)
	Return Me
End Sub

'a path to a script file that will handle uploading
Sub SetUpload(u As String) As WixUploader
	Uploader.SetAttr("upload", u)
	Return Me
End Sub

Sub SetHeight(h As Object) As WixUploader
	Uploader.SetHeight(h)
	Return Me
End Sub

Sub SetWidth(w As Object) As WixUploader
	Uploader.SetWidth(w)
	Return Me
End Sub

Sub Item As Map
	Return Uploader.item
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

Sub SetAnimate(animate As Boolean) As WixUploader
Uploader.SetAttr("animate", animate)
Return Me
End Sub

Sub SetAutowidth(autowidth As Boolean) As WixUploader
Uploader.SetAttr("autowidth", autowidth)
Return Me
End Sub

Sub SetBorderless(borderless As Boolean) As WixUploader
Uploader.SetAttr("borderless", borderless)
Return Me
End Sub

Sub SetClick(click As Object) As WixUploader
Uploader.SetAttr("click", click)
Return Me
End Sub

'set the parent
Sub SetParent(p As WixElement) As WixUploader
	Parent = p
	Return Me
End Sub


Sub SetContainer(container As Object) As WixUploader
Uploader.SetAttr("container", container)
Return Me
End Sub

Sub SetCss(css As Object) As WixUploader
Uploader.SetAttr("css", css)
Return Me
End Sub

'add tp columns of parent
Sub Pop
	Parent.AddColumns(Item)
End Sub

Sub SetDisabled(disabled As Boolean) As WixUploader
Uploader.SetAttr("disabled", disabled)
Return Me
End Sub

Sub SetFormData(formData As Object) As WixUploader
Uploader.SetAttr("formData", formData)
Return Me
End Sub

Sub SetGravity(gravity As Object) As WixUploader
Uploader.SetAttr("gravity", gravity)
Return Me
End Sub

Sub SetHidden(hidden As Boolean) As WixUploader
Uploader.SetAttr("hidden", hidden)
Return Me
End Sub

Sub SetHotkey(hotkey As Object) As WixUploader
Uploader.SetAttr("hotkey", hotkey)
Return Me
End Sub

Sub SetInputHeight(inputHeight As Object) As WixUploader
Uploader.SetAttr("inputHeight", inputHeight)
Return Me
End Sub


Sub SetInputWidth(inputWidth As Object) As WixUploader
Uploader.SetAttr("inputWidth", inputWidth)
Return Me
End Sub

Sub SetLabel(label As Object) As WixUploader
Uploader.SetAttr("label", label)
Return Me
End Sub

Sub SetMaxHeight(maxHeight As Object) As WixUploader
Uploader.SetAttr("maxHeight", maxHeight)
Return Me
End Sub

Sub SetMaxWidth(maxWidth As Object) As WixUploader
Uploader.SetAttr("maxWidth", maxWidth)
Return Me
End Sub

Sub SetPopup(popup As Object) As WixUploader
Uploader.SetAttr("popup", popup)
Return Me
End Sub

Sub SetTooltip(tooltip As Object) As WixUploader
Uploader.SetAttr("tooltip", tooltip)
Return Me
End Sub

Sub SetType(sType As Object) As WixUploader
Uploader.SetAttr("type", sType)
Return Me
End Sub

Sub SetUrlData(urlData As Object) As WixUploader
Uploader.SetAttr("urlData", urlData)
Return Me
End Sub