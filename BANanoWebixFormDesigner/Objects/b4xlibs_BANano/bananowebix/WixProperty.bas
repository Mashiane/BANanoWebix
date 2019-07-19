B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Property As WixElement
	Private elements As List
	Private maps As Map
End Sub

'Initializes the property sheet
Public Sub Initialize(eID As String) As WixProperty
	ID = eID.tolowercase
	Property.Initialize(ID).SetView("property")
	elements.Initialize 
	maps.Initialize 
	Return Me
End Sub

private Sub El(eid As String, label As String, typeOf As String, value As Object, options As List, format As Object) As Map
	Dim opt As Map = CreateMap()
	opt.Put("id", eid)
	opt.Put("label", label)
	opt.Put("type", typeOf)
	opt.Put("value", value)
	If format <> Null Then
		opt.Put("format", format)
	End If
	If options <> Null Then
		opt.Put("options", options)
	End If
	Return opt
End Sub

'set scroll
Sub SetScroll(c As Object) As WixProperty
	Property.SetAttr("scroll", c)
	Return Me
End Sub

'set the actual key
Sub SetActual(prop As String, actual As String) As WixProperty
	maps.Put(prop,actual)
	Return Me
End Sub

'set name
Sub SetName(n As String) As WixProperty
	Property.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixProperty
	Property.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixProperty
	Property.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixProperty
	Property.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixProperty
	Property.SetMinHeight(h)
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixProperty
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		Property.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


'set name width
Sub SetNameWidth(w As Int) As WixProperty
	Property.SetAttr("nameWidth", w)
	Return Me
End Sub

'set complex data
Sub SetComplexData(b As Boolean) As WixProperty
	Property.SetAttr("complexData", b)
	Return Me
End Sub

'add color
Sub AddColor(eid As String, label As String, value As String) As WixProperty
	elements.Add(El(eid,label, "color", value, Null,Null))
	Return Me
End Sub

Sub AddTextBox(eid As String, label As String, value As String) As WixProperty
	elements.Add(El(eid, label, "text", value, Null,Null))
	Return Me
End Sub

Sub AddLabel(label As String) As WixProperty
	elements.Add(El("", label, "label", "", Null,Null))
	Return Me
End Sub

Sub AddPassword(eid As String, label As String, value As String) As WixProperty
	elements.Add(El(eid, label, "password", value,  Null, Null))
	Return Me
End Sub

Sub AddDate(eid As String, label As String, value As String, format As Object) As WixProperty
	elements.Add(El(eid, label, "date", value,  Null, format))
	Return Me
End Sub

Sub AddSelect(eid As String, label As String, value As String, options As List) As WixProperty
	elements.Add(El(eid, label, "select", value, options, Null))
	Return Me
End Sub

Sub AddCombo(eid As String, label As String, value As String, options As List) As WixProperty
	elements.Add(El(eid, label, "combo", value, options, Null))
	Return Me
End Sub

Sub AddRichSelect(eid As String, label As String, value As String, options As List) As WixProperty
	elements.Add(El(eid, label, "richselect", value, options, Null))
	Return Me
End Sub

Sub AddCheckBox(eid As String, label As String, value As String) As WixProperty
	elements.Add(El(eid, label, "checkbox", value, Null, Null))
	Return Me
End Sub

Sub Clear As WixProperty
	elements.clear
	Return Me
End Sub

Sub Refresh(pg As WixPage)
	Dim opt As Map = CreateMap("elements": elements)
	pg.Define(ID, opt)
	pg.Refresh(ID)
End Sub

'return the item
Sub Item As Map
	Property.SetAttr("elements", elements)
	Return Property.item
End Sub

'set the data
Sub SetData(data As List) As WixProperty
	Property.SetData(data)
	Return Me
End Sub

'set style
Sub SetStyle(prop As String, val As String) As WixProperty
	Property.SetStyle(prop,val)
	Return Me
End Sub

'set borderless
Sub SetBorderLess(t As Boolean) As WixProperty
	Property.SetAttr("borderless", t)
	Return Me
End Sub


'set template
Sub SetTemplate(t As Object) As WixProperty
	Property.SetTemplate(t)
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixProperty
	Property.SetTooltip(tt)
	Return Me
End Sub

'set height
Sub SetHeight(h As Object) As WixProperty
	Property.SetHeight(h)
	Return Me
End Sub

'set width
Sub SetWidth(h As Object) As WixProperty
	Property.SetWidth(h)
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
