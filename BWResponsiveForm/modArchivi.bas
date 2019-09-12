B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Process_Globals
	Private Page As WixPage
	Private BANano As BANano  'ignore
End Sub

Sub CreateForm As WixForm
	Dim formcompanies As WixForm
	formcompanies.Initialize("formcompanies")
	formcompanies.SetResponsive(True)
	formcompanies.SetScroll("y")
	formcompanies.SetName("formcompanies")
	formcompanies.SetResponsive("true")
	formcompanies.SetDefaultLabelWidth("120")
	formcompanies.SetDefaultLabelPosition("top")
	'add elements
	Dim code_company As WixText
	code_company.Initialize("companies.code_company")
	code_company.SetName("code_company")
	code_company.SetType("text")
	code_company.SetLabel("Código Compañía")
	code_company.SetHidden(True)
	formcompanies.AddRows(code_company.Item)

	Dim name_company As WixText
	name_company.Initialize("companies.name_company")
	name_company.SetName("name_company")
	name_company.SetType("text")
	name_company.SetLabel("Nombre Compañía")
	formcompanies.AddRows(name_company.Item)

	Dim code_zone As WixSelect
	code_zone.Initialize("companies.code_zone")
	code_zone.SetName("code_zone")
	code_zone.SetLabel("Zona")
	formcompanies.AddRows(code_zone.Item)

	Dim seqc_company As WixText
	seqc_company.Initialize("companies.seqc_company")
	seqc_company.SetName("seqc_company")
	seqc_company.SetType("text")
	seqc_company.SetFormat("1,111")
	seqc_company.SetLabel("Número de Solicitud Vehiculos")
	formcompanies.AddRows(seqc_company.Item)

	Dim seqv_company As WixText
	seqv_company.Initialize("companies.seqv_company")
	seqv_company.SetName("seqv_company")
	seqv_company.SetType("text")
	seqv_company.SetFormat("1,111")
	seqv_company.SetLabel("Número de Solicitud Visitantes")
	formcompanies.AddRows(seqv_company.Item)

	Dim seqe_company As WixText
	seqe_company.Initialize("companies.seqe_company")
	seqe_company.SetName("seqe_company")
	seqe_company.SetType("text")
	seqe_company.SetFormat("1,111")
	seqe_company.SetLabel("Número Pase de Salida")
	formcompanies.AddRows(seqe_company.Item)

	Dim active As WixSwitch
	active.Initialize("companies.active")
	active.SetName("active")
	active.SetLabel("Activo")
	active.SetCheckValue("1")
	active.setUnCheckValue("0")
	active.SetOffLabel("NO")
	active.SetOnLabel("YES")
	formcompanies.AddRows(active.Item)

	formcompanies.AddRowsSpacer("")
	Return formcompanies
End Sub

Sub AddPage(pg As WixPage, mv As WixMultiView)
	Page = pg
	'create a page
	Dim a As WixLayout
	a.Initialize("mv_companies").SetTemplate("Almacena información de Compañías").SetTypeLine("")
	'add a form to the row
	a.AddRows(CreateForm.Item)
	'add page to multiview
	mv.AddItem(a.Item)
End Sub

Sub ShowPage(pg As WixPage)
	Page = pg
	Page.Show("mv_companies")
	Page.Clear("formcompanies")
	Page.ClearValidation("formcompanies")
End Sub


