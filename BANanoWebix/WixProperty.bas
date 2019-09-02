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
	Public Maps As Map
	Private webix As BANanoObject
	Public Parent As WixElement

End Sub

'set the parent
Sub SetParent(p As WixElement) As WixProperty
	Parent = p
	Return Me
End Sub


'set css
Sub SetStyle(prop As String, sval As String) As WixProperty
	Property.SetStyle(prop,sval)
	Return Me
End Sub


Sub AddNotSelected(lst As List)
	Dim q As String = "$"
	Dim k1 As String = q & "empty"
	Dim opt As Map = CreateMap()
	opt.Put("id", k1)
	opt.Put("value", "-- Not selected --")
	opt.Put(k1, True)
	lst.InsertAt(0, opt)
End Sub

'add tp columns of parent
Sub Pop
	Parent.AddColumns(Item)
End Sub

'Initializes the property sheet
Public Sub Initialize(eID As String) As WixProperty
	ID = eID.tolowercase
	Property.Initialize(ID).SetView("property")
	elements.Initialize 
	Maps.Initialize 
	webix.Initialize("webix") 
	Parent = Null
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
	Maps.Put(prop,actual)
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

Sub AddPopUp(eid As String, label As String, value As String) As WixProperty
	Dim ta As WixTextArea
	ta.Initialize("").SetWidth(300).SetHeight(100)
	' 
	Dim pu As WixPopUp
	pu.Initialize(eid & "pu").SetPoint(True).SetBody(ta.Item)
	'
	webix.RunMethod("ui", Array(pu.Item))
	'
	Dim opt As Map = CreateMap()
	opt.Put("id", eid)
	opt.Put("label", label)
	opt.Put("type", "popup")
	opt.Put("popup", eid & "pu")
	opt.Put("value", value)
	elements.Add(opt)
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
	AddNotSelected(options)
	elements.Add(El(eid, label, "select", value, options, Null))
	Return Me
End Sub

Sub AddCombo(eid As String, label As String, value As String, options As List) As WixProperty
	AddNotSelected(options)
	elements.Add(El(eid, label, "combo", value, options, Null))
	Return Me
End Sub

Sub AddRichSelect(eid As String, label As String, value As String, options As List) As WixProperty
	AddNotSelected(options)
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

Sub SetAnimate(animate As Boolean) As WixProperty
	Property.SetAttr("animate", animate)
	Return Me
End Sub

Sub SetAutoheight(autoheight As Boolean) As WixProperty
	Property.SetAttr("autoheight", autoheight)
	Return Me
End Sub

Sub SetContainer(container As Object) As WixProperty
Property.SetAttr("container", container)
Return Me
End Sub

Sub SetCss(css As Object) As WixProperty
Property.SetAttr("css", css)
Return Me
End Sub

Sub SetDatatype(datatype As Object) As WixProperty
Property.SetAttr("datatype", datatype)
Return Me
End Sub

Sub SetDisabled(disabled As Boolean) As WixProperty
Property.SetAttr("disabled", disabled)
Return Me
End Sub

Sub SetEditValue(editValue As Object) As WixProperty
Property.SetAttr("editValue", editValue)
Return Me
End Sub

Sub SetEditable(editable As Boolean) As WixProperty
Property.SetAttr("editable", editable)
Return Me
End Sub

Sub SetEditaction(editaction As Object) As WixProperty
Property.SetAttr("editaction", editaction)
Return Me
End Sub

Sub SetElements(xelements As Object) As WixProperty
Property.SetAttr("elements", xelements)
Return Me
End Sub

Sub SetForm(form As Object) As WixProperty
Property.SetAttr("form", form)
Return Me
End Sub

Sub SetGravity(gravity As Object) As WixProperty
Property.SetAttr("gravity", gravity)
Return Me
End Sub

Sub SetHidden(hidden As Boolean) As WixProperty
Property.SetAttr("hidden", hidden)
Return Me
End Sub


Sub SetMaxHeight(maxHeight As Object) As WixProperty
Property.SetAttr("maxHeight", maxHeight)
Return Me
End Sub

Sub SetMaxWidth(maxWidth As Object) As WixProperty
Property.SetAttr("maxWidth", maxWidth)
Return Me
End Sub

Sub SetScrollSpeed(scrollSpeed As Object) As WixProperty
Property.SetAttr("scrollSpeed", scrollSpeed)
Return Me
End Sub

Sub SetUrl(url As Object) As WixProperty
Property.SetAttr("url", url)
Return Me
End Sub