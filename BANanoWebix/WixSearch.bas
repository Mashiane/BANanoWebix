B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Search As WixElement
End Sub

'initialize the input box
Public Sub Initialize(iID As String) As WixSearch
	ID = iID.tolowercase
	Search.Initialize(iID).SetView("search")
	Return Me
End Sub


Sub SetTemplateHTML(h As UOENowHTML) As WixSearch
	Dim os As String = h.HTML
	Search.SetTemplate(os)
	Return Me
End Sub


'set the placeholder
Sub SetPlaceHolder(ph As String) As WixSearch
	Search.SetPlaceHolder(ph)
	Return Me
End Sub


Sub SetValidateEvent(e As Object) As WixSearch    'ignore
	Search.SetAttr("validateEvent", e)
	Return Me
End Sub

Sub SetValidateEventBlur(b As Boolean) As WixSearch    'ignore
	Search.SetAttr("validateEvent", "blur")
	Return Me
End Sub

Sub SetValidateEventKey(b As Boolean) As WixSearch     'ignore
	Search.SetAttr("validateEvent", "key")
	Return Me
End Sub

'set validate
Sub SetValidateIsNotEmpty(b As Boolean) As WixSearch   'ignore
	Search.SetAttr("validate","isNotEmpty")
	Return Me
End Sub


'set validate
Sub SetValidate(v As Object) As WixSearch   'ignore
	Search.SetAttr("validate",v)
	Return Me
End Sub


'set invalid message
Sub SetInvalidMessage(msg As String) As WixSearch
	Search.SetAttr("invalidMessage", msg)
	Return Me
End Sub


'set required
Sub SetRequired(b As Boolean) As WixSearch
	Search.SetAttr("required", b)
	Return Me
End Sub


'set name
Sub SetName(n As String) As WixSearch
	Search.SetName(n)
	Return Me
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'use a map object
Sub SetMap(m As Map) As WixSearch
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		Search.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


'set reponsive
Sub SetResponsive(b As Object) As WixSearch
	Search.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixSearch
	Search.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixSearch
	Search.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixSearch
	Search.SetMinHeight(h)
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixSearch
	Search.SetTooltip(tt)
	Return Me
End Sub

'set style
Sub SetStyle(prop As String, val As String) As WixSearch
	Search.SetStyle(prop,val)
	Return Me
End Sub


'return the item
Sub Item As Map
	Return Search.item
End Sub

'set value
Sub SetValue(v As String) As WixSearch
	Search.SetValue(v)
	Return Me
End Sub

'set label
Sub SetLabel(l As String) As WixSearch
	Search.SetLabel(l)
	Return Me
End Sub


'set bottom label
Sub SetBottomLabel(f As Object) As WixSearch
	Search.SetAttr("bottomLabel", f)
	Return Me
End Sub

'set bottom padding
Sub SetBottomPadding(f As Object) As WixSearch
	Search.SetAttr("bottomPadding", f)
	Return Me
End Sub

'set label align
Sub SetLabelAlign(a As String) As WixSearch
	Search.SetLabelAlign(a)
	Return Me
End Sub

'set label position
Sub SetLabelPosition(p As String) As WixSearch
	Search.SetLabelPosition(p)
	Return Me
End Sub

'set label width
Sub SetLabelWidth(w As Int) As WixSearch
	Search.SetLabelWidth(w)
	Return Me
End Sub

'set align right
Sub SetAlignRight(r As String) As WixSearch 'ignore
	Search.setAlignright("")
	Return Me
End Sub

'set align center
Sub SetAlignCenter(r As String) As WixSearch 'ignore
	Search.setAligncenter("")
	Return Me
End Sub

'set align left
Sub SetAlignLeft(r As String) As WixSearch 'ignore
	Search.SetAlignleft("")
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