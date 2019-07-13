B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.51
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private BANano As BANano
	Private propBag As WixProperty
End Sub

Sub getPropertyBag As WixForm
	propBag = pgFormDesigner.propBag
	Dim frm As WixForm
	frm.Initialize("propform")
	' toolbar for the property bag
	Dim tbl As WixToolBar
	tbl.Initialize("proptbl")
	tbl.AddSpacer
	tbl.CreateIcon("propsave").SetIcon("mdi mdi-content-save").SetTooltip("Save").SetClick(BANano.CallBack(pgFormDesigner,"prop_savewait",Null)) .Pop
	tbl.CreateIcon("propdelete").SetIcon("mdi mdi-delete-outline").SetTooltip("Delete").SetClick(BANano.CallBack(pgFormDesigner,"prop_delete",Null)).Pop
	'
	'
	frm.AddRows(tbl.Item)
	frm.AddRows(propBag.Item)
	Return frm
End Sub