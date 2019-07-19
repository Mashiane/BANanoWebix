package b4j.example;


import anywheresoftware.b4a.BA;

public class dfield extends Object{
public static dfield mostCurrent = new dfield();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.dfield", null);
		ba.loadHtSubs(dfield.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.dfield", ba);
		}
	}
    public static Class<?> getObject() {
		return dfield.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static b4j.example.main _main = null;
public static b4j.example.pgformdesigner _pgformdesigner = null;
public static b4j.example.modcenter _modcenter = null;
public static b4j.example.dbutton _dbutton = null;
public static b4j.example.modsidebar _modsidebar = null;
public static b4j.example.modtoolbar _modtoolbar = null;
public static b4j.example.drow _drow = null;
public static b4j.example.dpager _dpager = null;
public static b4j.example.ddbllist _ddbllist = null;
public static b4j.example.dform _dform = null;
public static b4j.example.dcheckbox _dcheckbox = null;
public static b4j.example.dcolorpicker _dcolorpicker = null;
public static b4j.example.dcombo _dcombo = null;
public static b4j.example.dcounter _dcounter = null;
public static b4j.example.ddatepicker _ddatepicker = null;
public static b4j.example.dicon _dicon = null;
public static b4j.example.dlabel _dlabel = null;
public static b4j.example.dradio _dradio = null;
public static b4j.example.drichselect _drichselect = null;
public static b4j.example.dsearch _dsearch = null;
public static b4j.example.dselect _dselect = null;
public static b4j.example.dsegmented _dsegmented = null;
public static b4j.example.dslider _dslider = null;
public static b4j.example.dswitch _dswitch = null;
public static b4j.example.dtabbar _dtabbar = null;
public static b4j.example.dtext _dtext = null;
public static b4j.example.dtextarea _dtextarea = null;
public static b4j.example.dtoggle _dtoggle = null;
public static b4j.example.duploader _duploader = null;
public static b4j.example.dfieldset _dfieldset = null;
public static b4j.example.dsuggest _dsuggest = null;
public static b4j.example.dcolumn _dcolumn = null;
public static b4j.example.modpropertybag _modpropertybag = null;
public static b4j.example.ddesignerproperty _ddesignerproperty = null;
public static b4j.example.dconnection _dconnection = null;
public static b4j.example.dtable _dtable = null;
public static b4j.example.modwebix _modwebix = null;
public static String  _buildbag(b4j.example.wixpage _page,b4j.example.wixproperty _bag) throws Exception{
anywheresoftware.b4a.objects.collections.List _types = null;
 //BA.debugLineNum = 6;BA.debugLine="Sub BuildBag(Page As WixPage, Bag As WixProperty)";
 //BA.debugLineNum = 7;BA.debugLine="Dim types As List";
_types = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 8;BA.debugLine="types.Initialize";
_types.Initialize();
 //BA.debugLineNum = 9;BA.debugLine="types.AddAll(Array(\"BOOL\", \"INT\", \"STRING\", \"REAL";
_types.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("BOOL"),(Object)("INT"),(Object)("STRING"),(Object)("REAL"),(Object)("DATE"),(Object)("BLOB"),(Object)("FLOAT")}));
 //BA.debugLineNum = 11;BA.debugLine="Bag.Clear";
_bag._clear /*b4j.example.wixproperty*/ ();
 //BA.debugLineNum = 12;BA.debugLine="Bag.AddTextBox(\"id\", \"ID\",\"field\")";
_bag._addtextbox /*b4j.example.wixproperty*/ ("id","ID","field");
 //BA.debugLineNum = 13;BA.debugLine="Bag.AddTextBox(\"value\", \"Field Name\",\"field1\")";
_bag._addtextbox /*b4j.example.wixproperty*/ ("value","Field Name","field1");
 //BA.debugLineNum = 14;BA.debugLine="Bag.AddCombo(\"type\", \"Field Type\",\"STRING\", types";
_bag._addcombo /*b4j.example.wixproperty*/ ("type","Field Type","STRING",_types);
 //BA.debugLineNum = 15;BA.debugLine="Bag.AddTextBox(\"length\", \"Field Length\",\"20\")";
_bag._addtextbox /*b4j.example.wixproperty*/ ("length","Field Length","20");
 //BA.debugLineNum = 16;BA.debugLine="Bag.AddLabel(\"Parent Table\")";
_bag._addlabel /*b4j.example.wixproperty*/ ("Parent Table");
 //BA.debugLineNum = 17;BA.debugLine="Bag.AddTextBox(\"tablename\", \"Table Name\", \"table\"";
_bag._addtextbox /*b4j.example.wixproperty*/ ("tablename","Table Name","table");
 //BA.debugLineNum = 18;BA.debugLine="Bag.AddLabel(\"Grid\")";
_bag._addlabel /*b4j.example.wixproperty*/ ("Grid");
 //BA.debugLineNum = 19;BA.debugLine="Bag.AddCheckBox(\"grid_on\",\"On Grid\",\"\")";
_bag._addcheckbox /*b4j.example.wixproperty*/ ("grid_on","On Grid","");
 //BA.debugLineNum = 20;BA.debugLine="Bag.AddLabel(\"Header\")";
_bag._addlabel /*b4j.example.wixproperty*/ ("Header");
 //BA.debugLineNum = 21;BA.debugLine="Bag.AddCheckBox(\"grid_header_mastercheckbox\",\"Mas";
_bag._addcheckbox /*b4j.example.wixproperty*/ ("grid_header_mastercheckbox","Master Checkbox","");
 //BA.debugLineNum = 22;BA.debugLine="Bag.AddCombo(\"grid_header_filter\",\"Filter\", \"\",Ar";
_bag._addcombo /*b4j.example.wixproperty*/ ("grid_header_filter","Filter","",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(""),(Object)("textFilter"),(Object)("numberFilter"),(Object)("dateFilter"),(Object)("selectFilter")}));
 //BA.debugLineNum = 23;BA.debugLine="Bag.SetActual(\"grid_header_filter\",\"Content\")";
_bag._setactual /*b4j.example.wixproperty*/ ("grid_header_filter","Content");
 //BA.debugLineNum = 24;BA.debugLine="Bag.AddTextBox(\"grid_header_text\",\"Text\", \"\").Set";
_bag._addtextbox /*b4j.example.wixproperty*/ ("grid_header_text","Text","")._setactual /*b4j.example.wixproperty*/ ("grid_header_text","HeaderText");
 //BA.debugLineNum = 25;BA.debugLine="Bag.AddTextBox(\"grid_header_css\",\"CSS\", \"\").SetAc";
_bag._addtextbox /*b4j.example.wixproperty*/ ("grid_header_css","CSS","")._setactual /*b4j.example.wixproperty*/ ("grid_header_css","HeaderCSS");
 //BA.debugLineNum = 26;BA.debugLine="Bag.AddTextBox(\"grid_header_colspan\",\"Col Span\",";
_bag._addtextbox /*b4j.example.wixproperty*/ ("grid_header_colspan","Col Span","")._setactual /*b4j.example.wixproperty*/ ("grid_header_colspan","HeaderColSpan");
 //BA.debugLineNum = 27;BA.debugLine="Bag.AddLabel(\"Details\")";
_bag._addlabel /*b4j.example.wixproperty*/ ("Details");
 //BA.debugLineNum = 28;BA.debugLine="Bag.AddTextBox(\"grid_name\",\"Name\", \"\").SetActual(";
_bag._addtextbox /*b4j.example.wixproperty*/ ("grid_name","Name","")._setactual /*b4j.example.wixproperty*/ ("grid_name","Name");
 //BA.debugLineNum = 29;BA.debugLine="Bag.AddTextBox(\"grid_header\",\"Header\", \"\").SetAct";
_bag._addtextbox /*b4j.example.wixproperty*/ ("grid_header","Header","")._setactual /*b4j.example.wixproperty*/ ("grid_header","Header");
 //BA.debugLineNum = 30;BA.debugLine="Bag.AddCheckBox(\"grid_fillspace\",\"Fill Space\",\"\")";
_bag._addcheckbox /*b4j.example.wixproperty*/ ("grid_fillspace","Fill Space","")._setactual /*b4j.example.wixproperty*/ ("grid_fillspace","FillSpace");
 //BA.debugLineNum = 31;BA.debugLine="Bag.addcombo(\"grid_sort\",\"Sort\",\"\", Array(\"\",\"int";
_bag._addcombo /*b4j.example.wixproperty*/ ("grid_sort","Sort","",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(""),(Object)("int"),(Object)("string"),(Object)("string-strict"),(Object)("text"),(Object)("server"),(Object)("raw")}));
 //BA.debugLineNum = 32;BA.debugLine="Bag.SetActual(\"grid_sort\",\"Sort\")";
_bag._setactual /*b4j.example.wixproperty*/ ("grid_sort","Sort");
 //BA.debugLineNum = 33;BA.debugLine="Bag.AddTextBox(\"grid_template\",\"Template\",\"\").Set";
_bag._addtextbox /*b4j.example.wixproperty*/ ("grid_template","Template","")._setactual /*b4j.example.wixproperty*/ ("grid_template","Template");
 //BA.debugLineNum = 34;BA.debugLine="Bag.AddTextBox(\"grid_templatehtml\",\"Template HTML";
_bag._addtextbox /*b4j.example.wixproperty*/ ("grid_templatehtml","Template HTML","")._setactual /*b4j.example.wixproperty*/ ("grid_templatehtml","TemplateHTML");
 //BA.debugLineNum = 35;BA.debugLine="Bag.AddCheckBox(\"grid_checkbox\",\"Checkbox\",\"\").Se";
_bag._addcheckbox /*b4j.example.wixproperty*/ ("grid_checkbox","Checkbox","")._setactual /*b4j.example.wixproperty*/ ("grid_checkbox","CheckBox");
 //BA.debugLineNum = 36;BA.debugLine="Bag.AddCheckBox(\"grid_radio\",\"Radio\",\"\").SetActua";
_bag._addcheckbox /*b4j.example.wixproperty*/ ("grid_radio","Radio","")._setactual /*b4j.example.wixproperty*/ ("grid_radio","Radio");
 //BA.debugLineNum = 37;BA.debugLine="Bag.AddTextBox(\"grid_checkvalue\",\"Check Value\", \"";
_bag._addtextbox /*b4j.example.wixproperty*/ ("grid_checkvalue","Check Value","")._setactual /*b4j.example.wixproperty*/ ("grid_checkvalue","CheckValue");
 //BA.debugLineNum = 38;BA.debugLine="Bag.AddTextBox(\"grid_uncheckvalue\",\"Uncheck Value";
_bag._addtextbox /*b4j.example.wixproperty*/ ("grid_uncheckvalue","Uncheck Value","")._setactual /*b4j.example.wixproperty*/ ("grid_uncheckvalue","UncheckValue");
 //BA.debugLineNum = 39;BA.debugLine="Bag.addtextbox(\"grid_numberformat\",\"Number Format";
_bag._addtextbox /*b4j.example.wixproperty*/ ("grid_numberformat","Number Format","");
 //BA.debugLineNum = 40;BA.debugLine="Bag.addtextbox(\"grid_format\",\"Format\",\"\").SetActu";
_bag._addtextbox /*b4j.example.wixproperty*/ ("grid_format","Format","")._setactual /*b4j.example.wixproperty*/ ("grid_format","Format");
 //BA.debugLineNum = 41;BA.debugLine="Bag.addtextbox(\"grid_suggest\",\"Suggest\",\"\").SetAc";
_bag._addtextbox /*b4j.example.wixproperty*/ ("grid_suggest","Suggest","")._setactual /*b4j.example.wixproperty*/ ("grid_suggest","Suggest");
 //BA.debugLineNum = 42;BA.debugLine="Bag.AddTextBox(\"grid_batch\",\"Batch\",\"\").SetActual";
_bag._addtextbox /*b4j.example.wixproperty*/ ("grid_batch","Batch","")._setactual /*b4j.example.wixproperty*/ ("grid_batch","Batch");
 //BA.debugLineNum = 43;BA.debugLine="Bag.AddTextBox(\"grid_options\",\"Options\",\"\").SetAc";
_bag._addtextbox /*b4j.example.wixproperty*/ ("grid_options","Options","")._setactual /*b4j.example.wixproperty*/ ("grid_options","options");
 //BA.debugLineNum = 44;BA.debugLine="Bag.AddTextBox(\"grid_collection\",\"Collection\",\"\")";
_bag._addtextbox /*b4j.example.wixproperty*/ ("grid_collection","Collection","")._setactual /*b4j.example.wixproperty*/ ("grid_collection","Collection");
 //BA.debugLineNum = 45;BA.debugLine="Bag.AddCheckBox(\"grid_hidden\",\"Hidden\",\"\").SetAct";
_bag._addcheckbox /*b4j.example.wixproperty*/ ("grid_hidden","Hidden","")._setactual /*b4j.example.wixproperty*/ ("grid_hidden","Hidden");
 //BA.debugLineNum = 46;BA.debugLine="Bag.AddCheckBox(\"grid_responsive\",\"Responsive\",\"\"";
_bag._addcheckbox /*b4j.example.wixproperty*/ ("grid_responsive","Responsive","")._setactual /*b4j.example.wixproperty*/ ("grid_responsive","Responsive");
 //BA.debugLineNum = 47;BA.debugLine="Bag.AddCombo(\"grid_align\",\"Align\",\"\",Array(\"\",\"ri";
_bag._addcombo /*b4j.example.wixproperty*/ ("grid_align","Align","",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(""),(Object)("right"),(Object)("center")}))._setactual /*b4j.example.wixproperty*/ ("grid_align","Align");
 //BA.debugLineNum = 48;BA.debugLine="Bag.AddCombo(\"grid_adjust\",\"Adjust\", \"\",Array(\"\",";
_bag._addcombo /*b4j.example.wixproperty*/ ("grid_adjust","Adjust","",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(""),(Object)("data"),(Object)("header")}))._setactual /*b4j.example.wixproperty*/ ("grid_adjust","Adjust");
 //BA.debugLineNum = 49;BA.debugLine="Bag.AddCombo(\"grid_editor\",\"Editor\", \"\", Array(\"\"";
_bag._addcombo /*b4j.example.wixproperty*/ ("grid_editor","Editor","",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(""),(Object)("text"),(Object)("date"),(Object)("color"),(Object)("popup"),(Object)("password"),(Object)("inline-text"),(Object)("select"),(Object)("combo"),(Object)("richselect"),(Object)("checkbox"),(Object)("inline-checkbox")}));
 //BA.debugLineNum = 50;BA.debugLine="Bag.SetActual(\"grid_editor\",\"Editor\")";
_bag._setactual /*b4j.example.wixproperty*/ ("grid_editor","Editor");
 //BA.debugLineNum = 51;BA.debugLine="Bag.AddTextBox(\"grid_css\",\"CSS\", \"\").SetActual(\"g";
_bag._addtextbox /*b4j.example.wixproperty*/ ("grid_css","CSS","")._setactual /*b4j.example.wixproperty*/ ("grid_css","CSS");
 //BA.debugLineNum = 52;BA.debugLine="Bag.AddTextBox(\"grid_width\",\"Width\", \"\").SetActua";
_bag._addtextbox /*b4j.example.wixproperty*/ ("grid_width","Width","")._setactual /*b4j.example.wixproperty*/ ("grid_width","Width");
 //BA.debugLineNum = 53;BA.debugLine="Bag.AddTextBox(\"grid_height\",\"Height\", \"\").SetAct";
_bag._addtextbox /*b4j.example.wixproperty*/ ("grid_height","Height","")._setactual /*b4j.example.wixproperty*/ ("grid_height","Height");
 //BA.debugLineNum = 54;BA.debugLine="Bag.AddTextBox(\"grid_minwidth\",\"Min Width\", \"\").S";
_bag._addtextbox /*b4j.example.wixproperty*/ ("grid_minwidth","Min Width","")._setactual /*b4j.example.wixproperty*/ ("grid_minwidth","MinWidth");
 //BA.debugLineNum = 55;BA.debugLine="Bag.AddTextBox(\"grid_minheight\",\"Height\", \"\").Set";
_bag._addtextbox /*b4j.example.wixproperty*/ ("grid_minheight","Height","")._setactual /*b4j.example.wixproperty*/ ("grid_minheight","MinHeight");
 //BA.debugLineNum = 56;BA.debugLine="Bag.AddTextBox(\"grid_tooltip\",\"Tooltip\", \"\").SetA";
_bag._addtextbox /*b4j.example.wixproperty*/ ("grid_tooltip","Tooltip","")._setactual /*b4j.example.wixproperty*/ ("grid_tooltip","ToolTip");
 //BA.debugLineNum = 57;BA.debugLine="Bag.Refresh(Page)";
_bag._refresh /*String*/ (_page);
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return "";
}
}
