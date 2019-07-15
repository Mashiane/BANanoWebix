B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Switch As WixElement
End Sub

'initialize the input box
Public Sub Initialize(iID As String) As WixSwitch
	ID = iID.tolowercase
	Switch.Initialize(iID).SetView("switch")
	Return Me
End Sub

'set label right
Sub SetLabelRight(l As String) As WixSwitch
	Switch.SetAttr("labelRight", l)
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixSwitch
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		Switch.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


Sub SetTemplateHTML(h As UOENowHTML) As WixSwitch
	Dim os As String = h.HTML
	Switch.SetTemplate(os)
	Return Me
End Sub

'set name
Sub SetName(n As String) As WixSwitch
	Switch.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixSwitch
	Switch.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixSwitch
	Switch.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixSwitch
	Switch.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixSwitch
	Switch.SetMinHeight(h)
	Return Me
End Sub

'set on label
Sub SetOnLabel(l As String) As WixSwitch
	Switch.SetAttr("onLabel", l)
	Return Me
End Sub

'set off label
Sub SetOffLabel(l As String) As WixSwitch
	Switch.SetAttr("offLabel", l)
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixSwitch
	Switch.SetProperty("tooltip", tt)
	Return Me
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'return the item
Sub Item As Map
	Return Switch.item
End Sub

'set style
Sub SetStyle(prop As String, val As String) As WixSwitch
	Switch.SetStyle(prop,val)
	Return Me
End Sub

'set value
Sub SetValue(v As String) As WixSwitch
	Switch.SetValue(v)
	Return Me
End Sub

'set label
Sub SetLabel(l As String) As WixSwitch
	Switch.SetLabel(l)
	Return Me
End Sub

'set label align
Sub SetLabelAlign(a As String) As WixSwitch
	Switch.SetLabelAlign(a)
	Return Me
End Sub

'set label position
Sub SetLabelPosition(p As String) As WixSwitch
	Switch.SetLabelPosition(p)
	Return Me
End Sub

'set label width
Sub SetLabelWidth(w As Int) As WixSwitch
	Switch.SetLabelWidth(w)
	Return Me
End Sub


'set align right
Sub SetAlignRight(r As String) As WixSwitch 'ignore
	Switch.setAlignright("")
	Return Me
End Sub

'set align center
Sub SetAlignCenter(r As String) As WixSwitch 'ignore
	Switch.setAligncenter("")
	Return Me
End Sub

'set align left
Sub SetAlignLeft(r As String) As WixSwitch 'ignore
	Switch.SetAlignleft("")
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
