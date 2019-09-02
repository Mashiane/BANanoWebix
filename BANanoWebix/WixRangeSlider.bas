B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public RangeSlider As WixElement
	Public Parent As WixElement

End Sub

'initialize the input box
Public Sub Initialize(iID As String) As WixRangeSlider
	ID = iID.tolowercase
	RangeSlider.Initialize(iID).SetView("rangeslider")
	Parent = Null
	Return Me
End Sub


'set css
Sub SetStyle(prop As String, sval As String) As WixRangeSlider
	RangeSlider.SetStyle(prop,sval)
	Return Me
End Sub


'set the parent
Sub SetParent(p As WixElement) As WixRangeSlider
	Parent = p
	Return Me
End Sub


'add tp columns of parent
Sub Pop
	Parent.AddColumns(Item)
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'use a map object
Sub SetMap(m As Map) As WixRangeSlider
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		RangeSlider.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


Sub SetTemplateHTML(h As UOENowHTML) As WixRangeSlider
	h.SetImportant(False)
	Dim os As String = h.HTML
	RangeSlider.SetTemplate(os)
	Return Me
End Sub

'set name
Sub SetName(n As String) As WixRangeSlider
	RangeSlider.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixRangeSlider
	RangeSlider.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixRangeSlider
	RangeSlider.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixRangeSlider
	RangeSlider.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixRangeSlider
	RangeSlider.SetMinHeight(h)
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixRangeSlider
	RangeSlider.SetTooltip(tt)
	Return Me
End Sub

'return the item
Sub Item As Map
	Return RangeSlider.item
End Sub


'set value
Sub SetValue(v As String) As WixRangeSlider
	RangeSlider.SetValue(v)
	Return Me
End Sub

'set label
Sub SetLabel(l As String) As WixRangeSlider
	RangeSlider.SetLabel(l)
	Return Me
End Sub

'set required
Sub SetRequired(b As Boolean) As WixRangeSlider
	RangeSlider.SetRequired(b)
	Return Me
End Sub

'set label align
Sub SetLabelAlign(a As String) As WixRangeSlider
	RangeSlider.SetLabelAlign(a)
	Return Me
End Sub

'set label position
Sub SetLabelPosition(p As String) As WixRangeSlider
	RangeSlider.SetLabelPosition(p)
	Return Me
End Sub

'set label width
Sub SetLabelWidth(w As Int) As WixRangeSlider
	RangeSlider.SetLabelWidth(w)
	Return Me
End Sub

'set align right
Sub SetAlignRight(r As String) As WixRangeSlider 'ignore
	RangeSlider.setAlignright("")
	Return Me
End Sub

'set align center
Sub SetAlignCenter(r As String) As WixRangeSlider 'ignore
	RangeSlider.setAligncenter("")
	Return Me
End Sub

'set align left
Sub SetAlignLeft(r As String) As WixRangeSlider 'ignore
	RangeSlider.SetAlignleft("")
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