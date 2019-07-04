B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Label As WixElement
	Public Parent As WixElement
End Sub

'initialize the input box
Public Sub Initialize(iID As String) As WixLabel
	ID = iID.tolowercase
	Label.Initialize(iID).SetView("label")
	Parent = Null
	Return Me
End Sub

'return the item
Sub Item As Map
	Return Label.item
End Sub


'set name
Sub SetName(n As String) As WixLabel
	Label.SetName(n)
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixLabel
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		Label.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


'set reponsive
Sub SetResponsive(b As Object) As WixLabel
	Label.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixLabel
	Label.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixLabel
	Label.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixLabel
	Label.SetMinHeight(h)
	Return Me
End Sub

'set the parent
Sub SetParent(p As WixElement) As WixLabel
	Parent = p
	Return Me
End Sub

'add tp columns of parent
Sub Pop
	Parent.AddColumns(Item)
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixLabel
	Label.SetTooltip(tt)
	Return Me
End Sub

'set style
Sub SetStyle(prop As String, val As String) As WixLabel
	Label.SetStyle(prop,val)
	Return Me
End Sub

'set label
Sub SetLabel(l As String) As WixLabel
	Label.Label.Text = l
	Return Me
End Sub

'set align
Sub SetAlign(a As String) As WixLabel
	Label.SetAttr("align", a)
	Return Me
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub


'set align right
Sub SetAlignRight(r As String) As WixLabel 'ignore
	Label.setAlignright("")
	Return Me
End Sub

'set align center
Sub SetAlignCenter(r As String) As WixLabel 'ignore
	Label.setAligncenter("")
	Return Me
End Sub

'set align left
Sub SetAlignLeft(r As String) As WixLabel 'ignore
	Label.SetAlignleft("")
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