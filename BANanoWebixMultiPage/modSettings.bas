B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.51
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private Page As WixPage
End Sub

'controller code for the side menu
Sub SettingsHandler(pg As WixPage, menuitem As String)
	Page = pg
	Select Case menuitem
		Case "settings_positions"
			pg.Show("mv_settings_positions")
		Case "settings_cities"
			pg.Show("mv_settings_cities")
	End Select
End Sub

Sub AddToMultiView(mv As WixMultiView)
	Dim a As WixElement
	a.Initialize("mv_settings_positions").SetTemplate("Positions").SetTypeLine("")
	a.AddColumns(CreatePositions.item)
	a.AddColumnsResizer("")
	a.AddColumns(CreatePositionsForm.Item)
	'
	Dim b As WixElement
	b.Initialize("mv_settings_cities")
	b.AddColumns(CreateCities.Item)
	b.AddColumnsResizer("")
	b.AddColumns(CreateCitiesForm.Item)
	'
	mv.AddItem(a.Item)
	mv.AddItem(b.Item)
End Sub


Sub CreatePositions As WixDataTable
	Dim dtpositions As WixDataTable
	dtpositions.Initialize("dtpositions")
	dtpositions.SetResizeColumn("true")
	dtpositions.SetScrollY("true")
	dtpositions.SetSelect("row")
	dtpositions.SetForm("frmcolors")
	dtpositions.SetScroll("y")
	
	Dim id As WixDataColumn
	id.Initialize("id")
	id.SetName("id")
	id.SetHeader("#")
	dtpositions.AddDataColumns(id)

	Dim value As WixDataColumn
	value.Initialize("value")
	value.SetHeader("Position")
	value.SetSort("string")
	dtpositions.AddDataColumns(value)

	Dim color As WixDataColumn
	color.Initialize("color")
	color.SetHeader("Color")
	dtpositions.AddDataColumns(color)
	Return dtpositions
End Sub

Sub CreatePositionsForm As WixForm
	Dim form As WixForm
	form.Initialize("formcolors")
	form.SetName("formcolors")
	form.SetElementsConfigJSON($"{"labelPosition":"top"}"$)

	Dim id As WixText
	id.Initialize("id")
	id.SetName("id")
	id.SetType("text")
	id.SetLabel("#")
	form.AddRows(id.Item)

	Dim value As WixText
	value.Initialize("value")
	value.SetLocalId("value")
	value.SetName("value")
	value.SetType("text")
	value.SetLabel("Position")
	form.AddRows(value.Item)

	Dim color As WixColorPicker
	color.Initialize("color")
	color.SetName("color")
	color.SetLabel("Color")
	form.AddRows(color.Item)
	Return form
End Sub

Sub CreateCities As WixDataTable
	Dim dtcities As WixDataTable
	dtcities.Initialize("dtcities")
	dtcities.SetResizeColumn("true")
	dtcities.SetScroll("y")
	dtcities.SetSelect("row")
	'
	Dim id As WixDataColumn
	id.Initialize("id")
	id.SetHeader("#")
	dtcities.AddDataColumns(id)
	'
	Dim value As WixDataColumn
	value.Initialize("value")
	value.SetHeader("City")
	value.SetSort("string")
	dtcities.AddDataColumns(value)
	Return dtcities
End Sub

Sub CreateCitiesForm As WixForm
	Dim form As WixForm
	form.Initialize("formcities")
	form.SetName("formcities")
	form.SetElementsConfigJSON($"{"labelPosition":"top"}"$)


	Dim id As WixText
	id.Initialize("id")
	id.SetLocalId("id")
	id.SetName("id")
	id.SetType("text")
	id.SetLabel("#")
	id.SetRequired("true")
	form.AddRows(id.Item)

	Dim value As WixText
	value.Initialize("value")
	value.SetLocalId("value")
	value.SetName("value")
	value.SetType("text")
	value.SetLabel("City Name")
	value.SetRequired("true")
	value.SetValidate("isNotEmpty")
	value.SetInvalidMessage("City name should be specified")
	form.AddRows(value.Item)
	Return form
End Sub