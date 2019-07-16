B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Text As WixElement
End Sub

'Initializes the element
Public Sub Initialize(tID As String) As WixText
	Text.Initialize(tID).SetView("text")
	Return Me
End Sub

'set invalid message
Sub SetInvalidMessage(msg As String) As WixText
	Text.SetAttr("invalidMessage", msg)
	Return Me
End Sub

'set hidden
Sub SetHidden(b As Boolean) As WixText
	Text.SetHidden(b)
	Return Me
End Sub


Sub SetTemplateHTML(h As UOENowHTML) As WixText
	Dim os As String = h.HTML
	Text.SetTemplate(os)
	Return Me
End Sub

'set localid
Sub SetLocalID(i As String) As WixText
	Text.SetLocalID(i)
	Return Me
End Sub

'set name
Sub SetName(n As String) As WixText
	Text.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixText
	Text.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixText
	Text.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixText
	Text.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixText
	Text.SetMinHeight(h)
	Return Me
End Sub

'set bottom label
Sub SetBottomLabel(f As Object) As WixText
	Text.SetAttr("bottomLabel", f)
	Return Me
End Sub

'set bottom padding
Sub SetBottomPadding(f As Object) As WixText
	Text.SetAttr("bottomPadding", f)
	Return Me
End Sub


'set pattern
Sub SetPattern(f As Object) As WixText
	Text.SetAttr("pattern", f)
	Return Me
End Sub

'set format
Sub SetFormat(f As Object) As WixText
	Text.SetAttr("format", f)
	Return Me
End Sub

'make money
Sub MakeMoney(b As Boolean) As WixText   'ignore
	SetFormat("1,111.00")
	Return Me
End Sub

'make telephone
Sub MakeTelephone10(b As Boolean) As WixText   'ignore
	SetFormat("111-111-1111")
	Return Me
End Sub


'set as password
Sub SetTypePassword(r As String) As WixText  'ignore
	Text.SetType("password")
	Return Me
End Sub

Sub SetTypeURL(r As String) As WixText  'ignore
	Text.SetType("url")
	Return Me
End Sub


'use a map object
Sub SetMap(m As Map) As WixText
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		Text.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub

'set attribute
Sub SetAttr(p As String, v As Object) As WixText  'ignore
	Text.SetAttr(p, v)
	Return Me
End Sub

Sub SetTypeNumber(r As String) As WixText  'ignore
	Text.SetType("number")
	Return Me
End Sub


Sub SetTypeText(r As String) As WixText  'ignore
	Text.SetType("text")
	Return Me
End Sub


'set as email
Sub SetTypeEmail(r As String) As WixText  'ignore
	Text.SetType("email")
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixText
	Text.SetTooltip(tt)
	Return Me
End Sub


'set style
Sub SetStyle(prop As String, val As String) As WixText
	Text.SetStyle(prop,val)
	Return Me
End Sub

'set readonly
Sub SetReadOnly(b As Boolean) As WixText
	Text.SetAttr("readonly",b)
	Return Me
End Sub

'set disabled
Sub SetDisabled(b As Boolean) As WixText
	Text.setattr("disabled",b)
	Return Me
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'set suggest
Sub SetSuggest(s As Object) As WixText
	Text.SetSuggest(s)
	Return Me	
End Sub

'set value
Sub SetValue(v As String) As WixText
	Text.SetValue(v)
	Return Me
End Sub

'set view
Sub SetView(v As String) As WixText
	Text.setview(v)
	Return Me
End Sub

'set type
Sub SetType(t As String) As WixText
	Text.SetType(t)
	Return Me	
End Sub

'return item
Sub Item As Map
	Return Text.Item
End Sub

'set the html attribute
Sub SetMaxLength(imaxlength As Int) As WixText
	Text.SetHTMLAttr("maxlength", imaxlength)
	Return Me
End Sub

'set required
Sub SetRequired(b As Boolean) As WixText
	Text.SetAttr("required", b)
	Return Me
End Sub


'set the placeholder
Sub SetPlaceHolder(ph As String) As WixText
	Text.SetPlaceHolder(ph)
	Return Me
End Sub

'set the label
Sub SetLabel(lbl As String) As WixText
	Text.SetLabel(lbl)
	Return Me
End Sub

'set the width
Sub SetWidth(w As Object) As WixText
	Text.SetWidth(w)
	Return Me
End Sub

'set the height
Sub SetHeight(h As Object) As WixText
	Text.SetHeight(h)
	Return Me
End Sub

'set alignment
Sub SetAlign(a As String) As WixText
	Text.SetAlign(a)
	Return Me
End Sub

'set label align
Sub SetLabelAlign(a As String) As WixText
	Text.SetLabelAlign(a)
	Return Me
End Sub

'set label position
Sub SetLabelPosition(p As String) As WixText
	Text.SetLabelPosition(p)
	Return Me
End Sub

'set label width
Sub SetLabelWidth(w As Int) As WixText
	Text.SetLabelWidth(w)
	Return Me
End Sub

'set validate
Sub SetValidateIsNotEmpty(b As Boolean) As WixText   'ignore
	Text.SetAttr("validate","isNotEmpty")
	Return Me
End Sub


'set validate
Sub SetValidate(v As Object) As WixText   'ignore
	Text.SetAttr("validate",v)
	Return Me
End Sub


Sub SetValidateIsNumber(b As Boolean) As WixText   'ignore
	Text.SetAttr("validate","isNumber")
	Return Me
End Sub

Sub SetValidateIsEmail(b As Boolean) As WixText   'ignore
	Text.SetAttr("validate","isEmail")
	Return Me
End Sub

Sub SetValidateEvent(e As Object) As WixText    'ignore
	Text.SetAttr("validateEvent", e)
	Return Me
End Sub

Sub SetValidateEventBlur(b As Boolean) As WixText    'ignore
	Text.SetAttr("validateEvent", "blur")
	Return Me
End Sub

Sub SetValidateEventKey(b As Boolean) As WixText     'ignore
	Text.SetAttr("validateEvent", "key")
	Return Me
End Sub

'Set input align
Sub SetInputAlignRight(b As Boolean) As WixText  'ignore
	Text.SetAttr("inputAlign", "right")
	Return Me
End Sub

'Set input align
Sub SetInputAlignLeft(b As Boolean) As WixText  'ignore
	Text.SetAttr("inputAlign", "left")
	Return Me
End Sub

'Set input align
Sub SetInputAlign(v As Object) As WixText  'ignore
	Text.SetAttr("inputAlign", v)
	Return Me
End Sub


'set align right
Sub SetAlignRight(r As String) As WixText 'ignore
	Text.setAlignright("")
	Return Me
End Sub

'set align center
Sub SetAlignCenter(r As String) As WixText 'ignore
	Text.setAligncenter("")
	Return Me
End Sub

'set align left
Sub SetAlignLeft(r As String) As WixText 'ignore
	Text.SetAlignleft("")
	Return Me
End Sub

'add to parent rows
Sub AddToRows(parent As WixElement)
	parent.AddRows(Item)
End Sub

'add to parent columns
Sub AddToColumns(parent As WixElement)
	parent.AddColumns(Item)
End Sub

'add to parent elements
Sub AddToElements(parent As WixElement)
	parent.AddElements(Item)
End Sub


