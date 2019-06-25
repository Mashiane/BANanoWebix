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
End Sub

'Initializes the property sheet
Public Sub Initialize(eID As String) As WixProperty
	ID = eID.tolowercase
	Property.Initialize(ID).SetView("property")
	elements.Initialize 
	Return Me
End Sub

private Sub El(eid As String, label As String, typeOf As String, value As Object, options As List) As Map
	eid = eid.tolowercase
	Dim opt As Map = CreateMap()
	opt.Put("id", eid)
	opt.Put("label", label)
	opt.Put("type", typeOf)
	opt.Put("value", value)
	If options <> Null Then
		opt.Put("options", options)
	End If
	Return opt
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
Sub AddColor(eid As String, label As String, value As String)
	elements.Add(El(eid,label, "color", value, Null))
End Sub

Sub AddTextBox(eid As String, label As String, value As String)
	elements.Add(El(eid, label, "text", value, Null))
End Sub

Sub AddLabel(label As String)
	elements.Add(El("", label, "label", "", Null))
End Sub

Sub AddPassword(eid As String, label As String, value As String)
	elements.Add(El(eid, label, "password", value,  Null))
End Sub

Sub AddDate(eid As String, label As String, value As String)
	elements.Add(El(eid, label, "date", value,  Null))
End Sub

Sub AddSelect(eid As String, label As String, value As String, options As List)
	elements.Add(El(eid, label, "select", value, options))
End Sub

Sub AddCombo(eid As String, label As String, value As String, options As List)
	elements.Add(El(eid, label, "combo", value, options))
End Sub

Sub AddRichSelect(eid As String, label As String, value As String, options As List)
	elements.Add(El(eid, label, "richselect", value, options))
End Sub

Sub AddCheckBox(eid As String, label As String, value As String)
	elements.Add(El(eid, label, "checkbox", value, Null))
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
Sub SetHeight(h As Int) As WixProperty
	Property.SetHeight(h)
	Return Me
End Sub

'set width
Sub SetWidth(h As Int) As WixProperty
	Property.SetWidth(h)
	Return Me
End Sub
