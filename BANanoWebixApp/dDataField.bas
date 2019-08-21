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
	Bag.Clear
	Bag.AddTextBox("id", "ID","field")
	Bag.AddTextBox("localId", "Local ID", "")
	Bag.AddTextBox("grid_name","Name", "").SetActual("grid_name","Name")
	Bag.AddTextBox("view","View", "datacolumn")
	Bag.AddLabel("Parent")
	Bag.AddTextBox("parentid","Parent", "datatable")
	Bag.AddTextBox("addingmethod","Adding Method","AddDataColumns")
	Bag.AddTextBox("tabindex","Tab Index", "0")
	Bag.AddLabel("Header")
	Bag.AddTextBox("grid_header","Title", "").SetActual("grid_header","Header")
	Bag.AddTextBox("grid_header_text","Text", "").SetActual("grid_header_text","HeaderText")
	Bag.AddCheckBox("grid_keepsequence","Keep Sequence", "").SetActual("grid_keepsequence","KeepSequence")
	Bag.AddCheckBox("grid_header_mastercheckbox","Master Checkbox","").SetActual("grid_header_mastercheckbox","MasterCheckBox")
	Bag.AddCombo("grid_header_filter","Filter", "",Array("","textFilter","numberFilter","dateFilter","selectFilter","summColumn"))
	Bag.SetActual("grid_header_filter","HeaderContent")
	Bag.AddTextBox("grid_header_css","CSS", "").SetActual("grid_header_css","HeaderCSS")
	Bag.AddTextBox("grid_header_colspan","Col Span", "").SetActual("grid_header_colspan","HeaderColSpan")
	Bag.AddTextBox("grid_header_rowspan","Row Span", "").SetActual("grid_header_rowspan","HeaderRowSpan")
	'Bag.AddCheckBox("grid_header_rotate","Rotate", "").SetActual("grid_header_rotate","HeaderRotate")
	Bag.AddCheckBox("grid_header_autoheight","Auto Height", "").SetActual("grid_header_autoheight","HeaderAutoHeight")
	Bag.AddCheckBox("grid_header_height","Height", "").SetActual("grid_header_height","HeaderHeight")
	Bag.AddLabel("Footer")
	Bag.AddTextBox("grid_footer","Footer", "").SetActual("grid_footer","Footer")
	Bag.AddCombo("grid_footer_filter","Filter", "",Array("","textFilter","numberFilter","dateFilter","selectFilter","summColumn"))
	Bag.SetActual("grid_footer_filter","FooterContent")
	Bag.AddTextBox("grid_footer_text","Text", "").SetActual("grid_footer_text","FooterText")
	Bag.AddTextBox("grid_footer_css","CSS", "").SetActual("grid_footer_css","FooterCSS")
	Bag.AddTextBox("grid_footer_colspan","Col Span", "").SetActual("grid_footer_colspan","FooterColSpan")
	Bag.AddTextBox("grid_footer_rowspan","Row Span", "").SetActual("grid_footer_rowspan","FooterRowSpan")
	'Bag.AddCheckBox("grid_footer_rotate","Rotate", "").SetActual("grid_footer_rotate","FooterRotate")
	Bag.AddCheckBox("grid_footer_autoheight","Auto Height", "").SetActual("grid_footer_autoheight","FooterAutoHeight")
	Bag.AddCheckBox("grid_footer_height","Height", "").SetActual("grid_footer_height","FooterHeight")
	Bag.AddLabel("Details")	
	Bag.AddTextBox("grid_css","CSS", "").SetActual("grid_css","CSS")
	Bag.AddCheckBox("grid_fillspace","Fill Space","").SetActual("grid_fillspace","FillSpace")
	Bag.addcombo("grid_sort","Sort","", Array("","int","string","string-strict","text","server","raw"))
	Bag.SetActual("grid_sort","Sort")
	Bag.AddTextBox("grid_template","Template","").SetActual("grid_template","Template")
	Bag.AddTextBox("grid_templatehtml","Template HTML","").SetActual("grid_templatehtml","TemplateHTML")
	Bag.AddCheckBox("grid_checkbox","Checkbox","").SetActual("grid_checkbox","CheckBox")
	Bag.AddCheckBox("grid_radio","Radio","").SetActual("grid_radio","Radio")
	Bag.AddTextBox("grid_checkvalue","Check Value", "").SetActual("grid_checkvalue","CheckValue")
	Bag.AddTextBox("grid_uncheckvalue","Uncheck Value", "").SetActual("grid_uncheckvalue","UncheckValue")
	Bag.addtextbox("grid_format","Format","").SetActual("grid_format","Format")
	Bag.addtextbox("grid_numberformat","NumberFormat","").SetActual("grid_numberformat","NumberFormat")
	Bag.addtextbox("grid_suggest","Suggest","").SetActual("grid_suggest","Suggest")
	Bag.AddTextBox("grid_batch","Batch","").SetActual("grid_batch","Batch")
	Bag.AddTextBox("grid_options","Options","").SetActual("grid_options","options")
	Bag.AddTextBox("grid_collection","Collection","").SetActual("grid_collection","Collection")
	Bag.AddCheckBox("grid_hidden","Hidden","").SetActual("grid_hidden","Hidden")
	Bag.AddCheckBox("grid_responsive","Responsive","").SetActual("grid_responsive","Responsive")
	Bag.AddCombo("grid_align","Align","",Array("","right","center")).SetActual("grid_align","Align")
	Bag.AddCombo("grid_adjust","Adjust", "",Array("","true","data","header")).SetActual("grid_adjust","Adjust")
	Bag.AddCombo("grid_editor","Editor", "", Array("","text","date","color","popup","password","inline-text","select","combo","richselect","checkbox","inline-checkbox"))
	Bag.SetActual("grid_editor","Editor")
	Bag.AddCombo("grid_editaction","Edit Action", "", Array("","dblclick","click","custom"))
	Bag.SetActual("grid_editaction","EditAcion")
	Bag.AddCheckBox("grid_liveedit","Live Edit", "").SetActual("grid_liveedit","LiveEdit")
	Bag.AddTextBox("grid_math","Math", "").SetActual("grid_math","Math")
	Bag.AddTextBox("grid_minwidth","Min Width", "").SetActual("grid_minwidth","MinWidth")
	Bag.AddTextBox("grid_width","Width", "").SetActual("grid_width","Width")
	Bag.AddTextBox("grid_minheight","Height", "").SetActual("grid_minheight","MinHeight")
	Bag.AddTextBox("grid_height","Height", "").SetActual("grid_height","Height")
	Bag.AddTextBox("grid_tooltip","Tooltip", "").SetActual("grid_tooltip","ToolTip")
	Bag.Refresh(Page)
	'
	'Dim sb As StringBuilder
	'sb.initialize
	'Dim mks As Map
	'mks = Bag.Maps
	'For Each mk As String In mks.Keys
'		Dim mv As String = mks.Get(mk)
'		Dim strline As String = $"case "${mk}""$
'		sb.Append(strline).Append(CRLF)
'		strline = $"pkey = "${mv}""$
'		sb.append(strline).Append(CRLF)
'	Next
'	Log(sb.ToString)
	
End Sub