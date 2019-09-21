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

Sub getPropertyBag(Page As WixPage) As WixForm
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
	
	Dim pmenu As WixPopUp
	pmenu.Initialize("db_popup")
	pmenu.List.OnItemClick(pgFD, "databaseMenu")
	pmenu.List.AddItemIcon("cleardb", "Clear the database", "mdi mdi-database-remove")
	pmenu.List.AddItemIcon("importdb", "Import database to schema","mdi mdi-database-import")
	pmenu.List.AddItemIcon("foreignkeyregister", "Foreign Keys Register","mdi mdi-key-outline")
	pmenu.List.AddItemIcon("importfd", "Import field descriptions", "mdi mdi-folder-key-network-outline")
	pmenu.List.AddItemIcon("importfk", "Import foreign keys","mdi mdi-key-outline")
	Page.UX(pmenu.item)
	tbl.CreateIcon("dbops").SetIcon("mdi mdi-database").SetTooltip("Database Operations").SetPopUp("db_popup").pop
	tbl.CreateIcon("tblprops").SetIcon("mdi mdi-file-table").SetTooltip("Table Schema").SetOnClick(pgFD, "tblprops_click").pop
	
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
