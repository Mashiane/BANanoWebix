B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.51
@EndOfDesignText@
'Static code module
#IgnoreWarnings:12
Sub Process_Globals
    Private pg As WixPage
	Private BANano As BANano 'ignore
    Dim dt As WixDataTable
    Dim pgr As WixPager
    Dim lista As List
End Sub

Sub Cargar(pgContainer As String)
    'initialize the page and set the container to hold the widgets
    'add a header and set its label
    pg.Initialize("", pgContainer).SetResponsive(True)
    pg.SetLocale("es-ES")
    
    Dim Formulario As WixForm
    Formulario.Initialize("Formulario").SetWidth(BANano.Window.InnerWidth-300)
    Formulario.Form.SetDefaultLabelWidth(70)
    
    'define columns
    Dim C1 As WixColumn
    C1.Initialize("C1").SetWidth(250)
    'add elements to column
    
    Dim dtpDesde As WixDatePicker
	dtpDesde.Initialize("dtpdesde").SetLabel("Desde").SetEditable(False).SetTimePicker(False).SetFormat("%Y-%m-%d").SetName("dtpdesde")
	dtpDesde.SetStringResult(True)
    C1.AddRows(dtpDesde.Item)
    
    Dim dtpHasta As WixDatePicker
	dtpHasta.Initialize("dtphasta").SetLabel("Hasta").SetEditable(False).SetTimePicker(False).SetFormat("%Y-%m-%d").SetName("dtphasta")
	dtpHasta.SetStringResult(True)
    C1.AddRows(dtpHasta.Item)
    Formulario.AddColumn(C1)
    '
    Dim C2 As WixColumn
    C2.Initialize("C2").SetWidth(100)
    Formulario.AddColumn(C2)
    
    Dim C3 As WixColumn
    C3.Initialize("C3").SetWidth(250)
    
    Dim txtBuscar As WixSearch
    txtBuscar.Initialize("").SetLabel("Buscar")
    C3.AddRows(txtBuscar.Item)
    
    Dim btnConsultar As WixButton
    btnConsultar.Initialize("btnconsultar").SetLabel("Consultar").SetWidth("180").SetAlignRight("True").SetClick(BANano.CallBack(Me,"consultar_datos",Null))
    
    'add element to the rows collection of the column
    C3.AddRows(btnConsultar.Item)
    Formulario.AddColumn(C3)
    pg.AddRows(Formulario.Item)

    'create the pager
    'set number of records per page to 10, 5 groups of pages
    'show the first button, show prev button, show pages, show next button, show last page button
    pgr.Initialize("pager").SetSize(10).SetGroup(5).SetShowFirst(True).SetShowPrev(True).SetShowPages(True).SetShowNext(True).SetShowLast(True)
    pgr.SetAnimate(True)
    Dim pager As Map = pgr.Item
    lista.Initialize 
	dt.Initialize("grilla")
    dt.SetBlockSelect(True)
    dt.SetResizeColumn(True)
    dt.SetResizeRow(True)
    dt.SetHover("dthover")
    dt.SetSelect(dt.DT_SELECT_ROW)
    dt.SetYCount(10)
    dt.SetScroll(True)
    dt.SetNavigation(True)
    dt.SetPager("pager")
	dt.SetEditable(True)
    dt.SetData(lista)
	dt.SetAutoConfig(True)
    Dim grida As Map = dt.Item
    pg.AddRows(grida)

    pg.AddRows(pager)
	pg.ui
	'
	UpdateList1("","")
End Sub

Sub UpdateList1(Desde As String, Hasta As String)
	'IMPORTANT: clear the contents of the grid
	pg.clearAll("grilla")
	If Desde = "" Then Desde = "2019-06-01"
	If Hasta = "" Then Hasta = "2019-06-30"
	'get the records
	Dim body As String = BANano.ToJson(CreateMap("q":"Reporte_Unico_Totales","p":Array(8,Desde,Hasta),"l":0))
	Dim headers As Map = CreateMap("Content-Type": "application/json")
	Dim data As String = BANano.CallAjaxWait("http://s.rocas.co/tmx","POST", "json", body ,False, headers)
	Dim Columnas() As String = BANano.Split("~", data.SubString2(0,data.IndexOf("<|>")))
	Dim Filas() As String = BANano.Split("|*", data.SubString(data.IndexOf("<|>")+3))
	lista.Initialize
	For i = 0 To Filas.Length-1
		Dim Celdas() As String = BANano.Split("~", Filas(i))
		Dim mFila As Map
		mFila.Initialize
		mFila.Put("id",i)
		For j = 0 To Filas.Length-1
			mFila.Put(Columnas(j), Celdas(j))
		Next
		lista.Add(mFila)
	Next
	'REFRESH THE GRID
	pg.SetData("grilla", lista)
End Sub

Sub UpdateList()
    Dim Desde As String = pg.GetValue("dtpdesde")
    Dim Hasta As String = pg.GetValue("dtpHasta")
    	
    Dim response As BANanoFetchResponse
    Dim data As String
    Dim fo As BANanoFetchOptions
    fo.Initialize
    fo.Method = "POST"
    fo.Body = BANano.ToJson(CreateMap("q":"Reporte_Unico_Totales","p":Array(8,Desde,Hasta),"l":0))
    'fo.Body = BANano.ToJson(CreateMap("q":"Reporte_Unico_Totales","p":Array(8,"2019-01-01","2019-06-30"),"l":0))
    Dim fetch As BANanoFetch
    fetch.Initialize("http://s.rocas.co/tmx",fo)
    fetch.Then(response)
    fetch.Return(response.Text)
    fetch.Then(data)

    Dim Columnas() As String = BANano.Split("~", data.SubString2(0,data.IndexOf("<|>")))
    Dim Filas() As String = BANano.Split("|*", data.SubString(data.IndexOf("<|>")+3))
    lista.Initialize
    For i = 0 To Filas.Length-1
        Dim Celdas() As String = BANano.Split("~", Filas(i))
        Dim mFila As Map
        mFila.Initialize
        mFila.Put("id",i)
        For j = 0 To Filas.Length-1
            mFila.Put(Columnas(j), Celdas(j))
        Next
        lista.Add(mFila)
		Log(mFila)
	Next
	fetch.End
End Sub

Sub consultar_datos(e As BANanoEvent)
	Dim Desde As String = pg.GetValue("dtpdesde")
	Dim Hasta As String = pg.GetValue("dtpHasta")
	UpdateList1(Desde,Hasta)
	Log("Update")
End Sub