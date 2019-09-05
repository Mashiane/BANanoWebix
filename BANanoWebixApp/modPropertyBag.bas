B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.51
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private BANano As BANano  'ignore
	Private propBag As WixProperty
End Sub

Sub getPropertyBag As WixForm
	propBag = pgFD.propBag
	Dim frm As WixForm
	frm.Initialize("propform")
	' toolbar for the property bag
	Dim tbl As WixToolBar
	tbl.Initialize("proptbl")
	tbl.CreateIcon("add_row").SetIcon("mdi mdi-table-row-plus-after").SetTooltip("Add Row").SetClick(BANano.CallBack(pgFD,"add_row",Null)).Pop
	tbl.CreateIcon("add_column").SetIcon("mdi mdi-table-column-plus-after").SetTooltip("Add Column").SetClick(BANano.CallBack(pgFD,"add_column",Null)).Pop
	tbl.CreateIcon("add_fields").SetIcon("mdi mdi-table-of-contents").SetTooltip("Add multiple fields").SetClick(BANano.CallBack(pgFD,"add_fields",Null)).Pop
	tbl.CreateIcon("download").SetIcon("mdi mdi-cloud-download-outline").SetTooltip("Download source code").SetClick(BANano.CallBack(pgFD,"download",Null)).Pop
	tbl.CreateIcon("cleardb").SetIcon("mdi mdi-database-remove").SetTooltip("Clear the database").SetClick(BANano.CallBack(pgFD,"cleardb",Null)).Pop
	tbl.CreateIcon("import").SetIcon("mdi mdi-database-import").SetTooltip("Import database to schema").SetClick(BANano.CallBack(pgFD,"importdb",Null)).Pop
	tbl.CreateIcon("foreignkeys").SetIcon("mdi mdi-key-outline").SetTooltip("Foreign Keys Register").SetClick(BANano.CallBack(pgFD,"foreignkeyregister",Null)).Pop
	tbl.AddSpacer
	tbl.CreateIcon("propadd").SetIcon("mdi mdi-plus-circle-outline").SetTooltip("Add").SetClick(BANano.CallBack(pgFD,"prop_add",Null)).Pop
	tbl.CreateIcon("propsave").SetIcon("mdi mdi-content-save").SetTooltip("Save").SetClick(BANano.CallBack(pgFD,"prop_savewait",Null)).Pop
	tbl.CreateIcon("propdelete").SetIcon("mdi mdi-delete-outline").SetTooltip("Delete").SetClick(BANano.CallBack(pgFD,"prop_delete",Null)).Pop
	tbl.CreateIcon("propmenu").SetIcon("mdi mdi-dots-vertical").SetTooltip("Menu").SetClick(BANano.CallBack(pgFD,"prop_menu",Null)).pop
	'
	'
	frm.AddRows(tbl.Item)
	frm.AddRows(propBag.Item)
	Return frm
End Sub
