B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public DataView As WixElement
	Private onClick As BANanoObject
	Private onDblClick As BANanoObject
End Sub

'Initializes the data table
Public Sub Initialize(tID As String) As WixDataView
	ID = tID.ToLowerCase
	DataView.Initialize(ID).SetView("dataview")
	onClick = Null
	onDblClick = Null
	Return Me
End Sub

'set onclick event
Sub SetClick(e As BANanoObject) As WixDataView
	onClick = e
	Return Me
End Sub


'set ondblclick event
Sub SetDblClick(e As BANanoObject) As WixDataView
	onDblClick = e
	Return Me
End Sub

'set template
Sub SetTemplate(t As String) As WixDataView
	DataView.SetTemplate(t)
	Return Me
End Sub

'set multi select
Sub SetMultiSelect(m As Boolean) As WixDataView
	DataView.SetAttr("multiselect", m)
	Return Me
End Sub


'set select
Sub SetSelect(b As Boolean) As WixDataView
	DataView.SetAttr("select", b)
	Return Me
End Sub

'set yCount
Sub SetYCount(x As Int) As WixDataView
	DataView.SetAttr("yCount", x)
	Return Me
End Sub


'set xCount
Sub SetXCount(x As Int) As WixDataView
	DataView.SetAttr("xCount", x)
	Return Me
End Sub

'set borderless
Sub SetBorderLess(b As Boolean) As WixDataView
	DataView.SetAttr("borderless", b)
	Return Me
End Sub


'set style
Sub SetStyle(prop As String, val As String) As WixDataView
	DataView.SetStyle(prop,val)
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixDataView
	DataView.SetTooltip(tt)
	Return Me
End Sub

'return the data table context
Sub Item As Map
	If onClick <> Null Then
		DataView.SetAttr("click", onClick)
	End If
	If onDblClick <> Null Then
		DataView.SetAttr("dblclick", onDblClick)
	End If
	Return DataView.item
End Sub

'set height
Sub SetHeight(h As Int) As WixDataView
	DataView.SetHeight(h)
	Return Me
End Sub

'set width
Sub SetWidth(h As Int) As WixDataView
	DataView.SetWidth(h)
	Return Me
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'set Data
Sub SetData(data As List) As WixDataView
	DataView.SetData(data)
	Return Me
End Sub