B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.51
@EndOfDesignText@
'Static code module
Sub Process_Globals
End Sub

Sub BuildBag(Page As WixPage, Bag As WixProperty)
	Dim types As List
	types.Initialize
	types.AddAll(Array("BOOL", "INT", "STRING", "REAL", "DATE", "BLOB", "FLOAT"))
	'
	Dim formtypes As List
	formtypes.initialize
	formtypes.AddAll(Array("","time","date","htmlbutton","image","imageTop","icon","iconTop", "text","password","email","number","url","tel", "month","year"))
	'
	'
	Dim formatOptions As List
	formatOptions.addall(Array("","1,111.00","111", "11", $"Page.DateToStr("%d-%m-%Y")"$,$"Page.DateToStr("%Y-%m-%d")"$))
	
	'
	Bag.Clear
	Bag.AddTextBox("id", "ID","field")
	Bag.AddTextBox("value", "Field Name","field1")
	Bag.AddTextBox("description", "Description","")
	Bag.AddCombo("type", "Field Type","STRING", types)
	Bag.AddTextBox("length", "Field Length","20")
	Bag.AddCheckBox("isfield", "Is Field",True)
	Bag.AddLabel("Foreign")
	Bag.AddTextBox("foreign_table","Foreign Table","")
	Bag.AddTextBox("foreign_key","Foreign Key","")
	Bag.AddTextBox("foreign_value","Foreign Value","")
	Bag.AddLabel("Form")
	Bag.AddCheckBox("showonform", "On Form","")
	Bag.AddCombo("view","View", "text", Page.Views)
	Bag.AddCombo("addingmethod","Adding Method","AddRows", pgFD.addingmethod)
	Bag.AddCombo("form_type","View Type", "text", formtypes)
	Bag.AddTextBox("optionsid","Options IDs", "1,2,3")
	Bag.AddTextBox("optionstext","Options Values", "One,Two,Three")
	Bag.AddTextBox("form_css","Css", "")
	Bag.AddCombo("form_align", "Align", "", Array("","left","center","right"))
	Bag.AddCombo("form_inputAlign", "Input Align", "", Array("","left","right"))
	Bag.AddCheckBox("form_borderless","Borderless", "")
	Bag.AddCheckBox("form_readonly","Read Only", "")
	Bag.AddCheckBox("form_disabled","Disabled", "")
	Bag.AddTextBox("form_tooltip", "Tooltip","")
	Bag.AddCombo("form_format","Format", "", formatOptions)
	Bag.AddTextBox("form_gravity","Gravity", "")
	Bag.AddCheckBox("form_hidden","Hidden", "")
	Bag.AddCombo("form_labelAlign","Label Align","",Array("","left","center","right"))
	Bag.AddCombo("form_labelPosition","Label Position","",Array("","left","top"))
	Bag.AddTextBox("form_batch", "Batch","")
	Bag.AddTextBox("form_width","Width","")
	Bag.AddTextBox("form_height","Height","")
	Bag.AddTextBox("form_inputWidth","Input Width", "")
	Bag.AddCheckBox("form_editable","Date Editable", True)
	Bag.AddCheckBox("form_stringResult", "Date String Result",True)
	Bag.AddCheckBox("form_required","Required", "")
	Bag.AddCombo("form_validate", "Validate", "", Array("","isNotEmpty","isNumber","isEmail"))
	Bag.AddCombo("form_validateEvent", "Validate Event", "", Array("","blur","key"))
	Bag.AddTextBox("form_bottomLabel","Bottom Label", "")
	Bag.AddTextBox("form_bottomPadding","Bottom Padding", "")
	Bag.AddTextBox("form_invalidMessage","Invalid Message", "")
	'
	Bag.AddLabel("Data Table")
	Bag.AddCheckBox("showongrid", "On Grid","")
	Bag.AddTextBox("grid_header_text","Header Text", "").SetActual("grid_header_text","HeaderText")
	Bag.AddTextBox("grid_header_css","Header CSS", "").SetActual("grid_header_css","HeaderCSS")
	Bag.AddTextBox("grid_header_colspan","Header Col Span", "").SetActual("grid_header_colspan","HeaderColSpan")
	Bag.AddTextBox("grid_header_rowspan","Header Row Span", "").SetActual("grid_header_rowspan","HeaderRowSpan")
	Bag.AddCheckBox("grid_hidden","Header Hidden","").SetActual("grid_hidden","Hidden")
	Bag.AddCombo("grid_header_filter","Header Filter", "",Array("","textFilter","numberFilter","dateFilter","selectFilter","summColumn")).SetActual("grid_header_filter","HeaderContent")
	Bag.addcombo("grid_sort","Sort","", Array("","int","string","string-strict","text","server","raw")).SetActual("grid_sort","Sort")
	Bag.AddCombo("grid_align","Align","",Array("","right","center")).SetActual("grid_align","Align")
	Bag.AddCombo("grid_editor","Editor", "", Array("","text","date","color","popup","password","inline-text","select","combo","richselect","checkbox","inline-checkbox")).SetActual("grid_editor","Editor")
	Bag.AddCombo("grid_format","Format","",formatOptions).SetActual("grid_format","Format")
	Bag.addtextbox("grid_numberformat","NumberFormat","1,111.00").SetActual("grid_numberformat","NumberFormat")

	Bag.AddCombo("grid_adjust","Adjust", "",Array("","true","data","header")).SetActual("grid_adjust","Adjust")
	Bag.AddTextBox("grid_minwidth","Min Width", "").SetActual("grid_minwidth","MinWidth")
	Bag.AddCheckBox("grid_fillspace","Fill Space","").SetActual("grid_fillspace","FillSpace")

	Bag.AddLabel("Parent Table")
	Bag.AddTextBox("tablename", "Table Name", "table")
	Bag.AddTextBox("tabindex","Tab Index", "0")
	Bag.Refresh(Page)
End Sub