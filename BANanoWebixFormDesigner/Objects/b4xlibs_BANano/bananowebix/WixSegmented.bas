B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Segmented As WixElement
	Private Options As List
End Sub

'initialize the input box
Public Sub Initialize(iID As String) As WixSegmented
	ID = iID.tolowercase
	Segmented.Initialize(iID).SetView("segmented")
	Options.Initialize
	Return Me
End Sub

Sub SetMultiView(b As Object) As WixSegmented
	Segmented.SetMultiView(b)
	Return Me
End Sub

Sub SetTemplateHTML(h As UOENowHTML) As WixSegmented
	Dim os As String = h.HTML
	Segmented.SetTemplate(os)
	Return Me
End Sub

'set name
Sub SetName(n As String) As WixSegmented
	Segmented.SetName(n)
	Return Me
End Sub

'set name
Sub SetPadding(p As Object) As WixSegmented
	Segmented.SetPadding(p)
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixSegmented
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		Segmented.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


'set reponsive
Sub SetResponsive(b As Object) As WixSegmented
	Segmented.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixSegmented
	Segmented.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixSegmented
	Segmented.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixSegmented
	Segmented.SetMinHeight(h)
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixSegmented
	Segmented.SetTooltip(tt)
	Return Me
End Sub

Sub SetOptionsJSON(json As String) As WixSegmented
	Segmented.SetOptionsJSON(json)
	Return Me
End Sub

Sub SetOptionsMAP(m As Map) As WixSegmented
	For Each mk As String In m.Keys
		Dim mv As Object = m.Get(mk)
		AddOption(mk, mv)
	Next
	Return Me
End Sub

'set style
Sub SetStyle(prop As String, val As String) As WixSegmented
	Segmented.SetStyle(prop,val)
	Return Me
End Sub

'return the item
Sub Item As Map
	Segmented.SetAttr("options", Options)
	Return Segmented.item
End Sub

'set options
Sub SetOptions(o As List) As WixSegmented
	Options = o
	Return Me
End Sub

'set the label
Sub SetLabel(l As String) As WixSegmented
	Segmented.SetLabel(l)
	Return Me
End Sub

'set the value
Sub SetValue(v As Object) As WixSegmented
	Segmented.SetValue(v)
	Return Me
End Sub

'add an option
Sub AddOption(oid As String, oTxt As Object) As WixSegmented
	Dim opt As Map = CreateMap()
	opt.put("id",oid)
	opt.Put("value",oTxt)
	Options.Add(opt)
	Return Me
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

Sub SetOptionWidth(w As Object) As WixSegmented
	Segmented.SetAttr("optionWidth", w)
	Return Me
End Sub


'set align right
Sub SetAlignRight(r As String) As WixSegmented 'ignore
	Segmented.setAlignright("")
	Return Me
End Sub

'set align center
Sub SetAlignCenter(r As String) As WixSegmented 'ignore
	Segmented.setAligncenter("")
	Return Me
End Sub

Sub SetAlign(a As Object) As WixSegmented 'ignore
	Segmented.SetAttr("align", a)
	Return Me
End Sub


'set align left
Sub SetAlignLeft(r As String) As WixSegmented 'ignore
	Segmented.SetAlignleft("")
	Return Me
End Sub


'set onclick event
Sub SetClick(e As BANanoObject) As WixSegmented
	Segmented.SetAttr("click", e)
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
