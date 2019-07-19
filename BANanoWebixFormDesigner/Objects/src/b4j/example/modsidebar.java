package b4j.example;


import anywheresoftware.b4a.BA;

public class modsidebar extends Object{
public static modsidebar mostCurrent = new modsidebar();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modsidebar", null);
		ba.loadHtSubs(modsidebar.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modsidebar", ba);
		}
	}
    public static Class<?> getObject() {
		return modsidebar.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static b4j.example.main _main = null;
public static b4j.example.pgformdesigner _pgformdesigner = null;
public static b4j.example.modcenter _modcenter = null;
public static b4j.example.dbutton _dbutton = null;
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
public static b4j.example.dfield _dfield = null;
public static b4j.example.modwebix _modwebix = null;
public static b4j.example.wixsidebar  _getsidebar() throws Exception{
String _sphoto = "";
b4j.example.wixsidebar _sm = null;
 //BA.debugLineNum = 6;BA.debugLine="Sub getSideBar As WixSideBar";
 //BA.debugLineNum = 7;BA.debugLine="Dim sPhoto As String";
_sphoto = "";
 //BA.debugLineNum = 15;BA.debugLine="Dim sm As WixSideBar";
_sm = new b4j.example.wixsidebar();
 //BA.debugLineNum = 16;BA.debugLine="sm.Initialize(\"smp\").SetCollapsed(False).SetActiv";
_sm._initialize /*b4j.example.wixsidebar*/ (ba,"smp")._setcollapsed /*b4j.example.wixsidebar*/ (anywheresoftware.b4a.keywords.Common.False)._setactivetitle /*b4j.example.wixsidebar*/ (anywheresoftware.b4a.keywords.Common.True)._setscroll /*b4j.example.wixsidebar*/ ((Object)(anywheresoftware.b4a.keywords.Common.True))._setselect /*b4j.example.wixsidebar*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 24;BA.debugLine="sm.AddItem(\"\",\"db\",\"Database\",\"\",\"\",\"\",\"\")";
_sm._additem /*b4j.example.wixsidebar*/ ("","db","Database","","","","");
 //BA.debugLineNum = 25;BA.debugLine="sm.AddItem(\"db\", \"dbhelp\", \"Help\",\"\",\"mdi mdi-hel";
_sm._additem /*b4j.example.wixsidebar*/ ("db","dbhelp","Help","","mdi mdi-help-circle-outline","","");
 //BA.debugLineNum = 26;BA.debugLine="sm.AddItem(\"db\", \"table\",\"Table\",\"\",\"mdi mdi-sele";
_sm._additem /*b4j.example.wixsidebar*/ ("db","table","Table","","mdi mdi-selection-ellipse","","");
 //BA.debugLineNum = 27;BA.debugLine="sm.AddItem(\"db\", \"field\",\"Field\",\"\",\"mdi mdi-sele";
_sm._additem /*b4j.example.wixsidebar*/ ("db","field","Field","","mdi mdi-selection-ellipse","","");
 //BA.debugLineNum = 46;BA.debugLine="sm.AddItem(\"\", \"lay\", \"Layouts\",\"\",\"\", \"\",\"\")";
_sm._additem /*b4j.example.wixsidebar*/ ("","lay","Layouts","","","","");
 //BA.debugLineNum = 50;BA.debugLine="sm.AddItem(\"lay\", \"form\", \"Form\",\"\",\"mdi mdi-grou";
_sm._additem /*b4j.example.wixsidebar*/ ("lay","form","Form","","mdi mdi-group","","");
 //BA.debugLineNum = 72;BA.debugLine="sm.AddItem(\"\", \"con\", \"Controls\",\"\",\"\", \"\",\"\")";
_sm._additem /*b4j.example.wixsidebar*/ ("","con","Controls","","","","");
 //BA.debugLineNum = 73;BA.debugLine="sm.AddItem(\"con\", \"grid\", \"Grid\",\"\",\"mdi mdi-grid";
_sm._additem /*b4j.example.wixsidebar*/ ("con","grid","Grid","","mdi mdi-grid","","");
 //BA.debugLineNum = 74;BA.debugLine="sm.AddItem(\"grid\", \"row\", \"Row\",\"\",\"mdi mdi-table";
_sm._additem /*b4j.example.wixsidebar*/ ("grid","row","Row","","mdi mdi-table-row-plus-after","","");
 //BA.debugLineNum = 75;BA.debugLine="sm.AddItem(\"grid\", \"column\", \"Column\",\"\",\"mdi mdi";
_sm._additem /*b4j.example.wixsidebar*/ ("grid","column","Column","","mdi mdi-table-column-plus-after","","");
 //BA.debugLineNum = 78;BA.debugLine="sm.AddItem(\"con\", \"buttons\", \"Buttons\",\"\",\"mdi md";
_sm._additem /*b4j.example.wixsidebar*/ ("con","buttons","Buttons","","mdi mdi-pin","","");
 //BA.debugLineNum = 79;BA.debugLine="sm.AddItem(\"buttons\", \"button\", \"Button\",\"\",\"mdi";
_sm._additem /*b4j.example.wixsidebar*/ ("buttons","button","Button","","mdi mdi-selection-ellipse","","");
 //BA.debugLineNum = 80;BA.debugLine="sm.AddItem(\"buttons\", \"segmented\", \"Segmented\",\"\"";
_sm._additem /*b4j.example.wixsidebar*/ ("buttons","segmented","Segmented","","mdi mdi-selection-ellipse","","");
 //BA.debugLineNum = 81;BA.debugLine="sm.AddItem(\"buttons\", \"toggle\", \"Toggle\",\"\",\"mdi";
_sm._additem /*b4j.example.wixsidebar*/ ("buttons","toggle","Toggle","","mdi mdi-toggle-switch-outline","","");
 //BA.debugLineNum = 83;BA.debugLine="sm.AddItem(\"con\", \"txts\", \"Text Fields\",\"\",\"mdi m";
_sm._additem /*b4j.example.wixsidebar*/ ("con","txts","Text Fields","","mdi mdi-cursor-text","","");
 //BA.debugLineNum = 84;BA.debugLine="sm.AddItem(\"txts\", \"text\", \"Text\",\"\",\"mdi mdi-sel";
_sm._additem /*b4j.example.wixsidebar*/ ("txts","text","Text","","mdi mdi-selection-ellipse","","");
 //BA.debugLineNum = 85;BA.debugLine="sm.AddItem(\"txts\", \"textarea\", \"TextArea\",\"\",\"mdi";
_sm._additem /*b4j.example.wixsidebar*/ ("txts","textarea","TextArea","","mdi mdi-selection-ellipse","","");
 //BA.debugLineNum = 86;BA.debugLine="sm.AddItem(\"txts\", \"richtext\", \"RichText\",\"\",\"mdi";
_sm._additem /*b4j.example.wixsidebar*/ ("txts","richtext","RichText","","mdi mdi-selection-ellipse","","");
 //BA.debugLineNum = 87;BA.debugLine="sm.AddItem(\"txts\", \"search\", \"Search\",\"\",\"mdi mdi";
_sm._additem /*b4j.example.wixsidebar*/ ("txts","search","Search","","mdi mdi-folder-search-outline","","");
 //BA.debugLineNum = 89;BA.debugLine="sm.AddItem(\"con\", \"sels\", \"Selectors\",\"\",\"mdi mdi";
_sm._additem /*b4j.example.wixsidebar*/ ("con","sels","Selectors","","mdi mdi-arrow-down-drop-circle-outline","","");
 //BA.debugLineNum = 90;BA.debugLine="sm.AddItem(\"sels\", \"combo\", \"Combo\",\"\",\"mdi mdi-s";
_sm._additem /*b4j.example.wixsidebar*/ ("sels","combo","Combo","","mdi mdi-selection-ellipse","","");
 //BA.debugLineNum = 91;BA.debugLine="sm.AddItem(\"sels\", \"richselect\", \"RichSelect\",\"\",";
_sm._additem /*b4j.example.wixsidebar*/ ("sels","richselect","RichSelect","","mdi mdi-selection-ellipse","","");
 //BA.debugLineNum = 92;BA.debugLine="sm.AddItem(\"sels\", \"select\", \"Select\",\"\",\"mdi mdi";
_sm._additem /*b4j.example.wixsidebar*/ ("sels","select","Select","","mdi mdi-selection-ellipse","","");
 //BA.debugLineNum = 93;BA.debugLine="sm.AddItem(\"sels\", \"dbllist\", \"DoubleList\",\"\",\"md";
_sm._additem /*b4j.example.wixsidebar*/ ("sels","dbllist","DoubleList","","mdi mdi-selection-ellipse","","");
 //BA.debugLineNum = 95;BA.debugLine="sm.AddItem(\"con\", \"choices\", \"Choices\",\"\",\"mdi md";
_sm._additem /*b4j.example.wixsidebar*/ ("con","choices","Choices","","mdi mdi-check-box-outline","","");
 //BA.debugLineNum = 96;BA.debugLine="sm.AddItem(\"choices\", \"checkbox\", \"CheckBox\",\"\",\"";
_sm._additem /*b4j.example.wixsidebar*/ ("choices","checkbox","CheckBox","","mdi mdi-selection-ellipse","","");
 //BA.debugLineNum = 97;BA.debugLine="sm.AddItem(\"choices\", \"radio\", \"Radio\",\"\",\"mdi md";
_sm._additem /*b4j.example.wixsidebar*/ ("choices","radio","Radio","","mdi mdi-selection-ellipse","","");
 //BA.debugLineNum = 98;BA.debugLine="sm.AddItem(\"choices\", \"switch\", \"Switch\",\"\",\"mdi";
_sm._additem /*b4j.example.wixsidebar*/ ("choices","switch","Switch","","mdi mdi-selection-ellipse","","");
 //BA.debugLineNum = 99;BA.debugLine="sm.AddItem(\"choices\", \"slider\", \"Slider\",\"\",\"mdi";
_sm._additem /*b4j.example.wixsidebar*/ ("choices","slider","Slider","","mdi mdi-selection-ellipse","","");
 //BA.debugLineNum = 100;BA.debugLine="sm.AddItem(\"choices\", \"counter\", \"Counter\",\"\",\"md";
_sm._additem /*b4j.example.wixsidebar*/ ("choices","counter","Counter","","mdi mdi-selection-ellipse","","");
 //BA.debugLineNum = 102;BA.debugLine="sm.AddItem(\"con\", \"pickers\", \"Pickers\",\"\",\"mdi md";
_sm._additem /*b4j.example.wixsidebar*/ ("con","pickers","Pickers","","mdi mdi-calendar-outline","","");
 //BA.debugLineNum = 103;BA.debugLine="sm.AddItem(\"pickers\", \"colorpicker\", \"ColorPicker";
_sm._additem /*b4j.example.wixsidebar*/ ("pickers","colorpicker","ColorPicker","","mdi mdi-selection-ellipse","","");
 //BA.debugLineNum = 104;BA.debugLine="sm.AddItem(\"pickers\", \"datepicker\", \"DatePicker\",";
_sm._additem /*b4j.example.wixsidebar*/ ("pickers","datepicker","DatePicker","","mdi mdi-selection-ellipse","","");
 //BA.debugLineNum = 106;BA.debugLine="sm.AddItem(\"con\", \"others\", \"Others\",\"\",\"mdi mdi-";
_sm._additem /*b4j.example.wixsidebar*/ ("con","others","Others","","mdi mdi-cards-outline","","");
 //BA.debugLineNum = 107;BA.debugLine="sm.AddItem(\"others\", \"icon\", \"Icon\",\"\",\"mdi mdi-s";
_sm._additem /*b4j.example.wixsidebar*/ ("others","icon","Icon","","mdi mdi-selection-ellipse","","");
 //BA.debugLineNum = 108;BA.debugLine="sm.AddItem(\"others\", \"label\", \"Label\",\"\",\"mdi mdi";
_sm._additem /*b4j.example.wixsidebar*/ ("others","label","Label","","mdi mdi-selection-ellipse","","");
 //BA.debugLineNum = 109;BA.debugLine="sm.AddItem(\"others\", \"uploader\", \"Uploader\",\"\",\"m";
_sm._additem /*b4j.example.wixsidebar*/ ("others","uploader","Uploader","","mdi mdi-selection-ellipse","","");
 //BA.debugLineNum = 111;BA.debugLine="sm.AddItem(\"\", \"hlp\", \"Helpers\",\"\",\"\", \"\",\"\")";
_sm._additem /*b4j.example.wixsidebar*/ ("","hlp","Helpers","","","","");
 //BA.debugLineNum = 112;BA.debugLine="sm.AddItem(\"hlp\", \"suggest\", \"Suggest\",\"\",\"mdi md";
_sm._additem /*b4j.example.wixsidebar*/ ("hlp","suggest","Suggest","","mdi mdi-selection-ellipse","","");
 //BA.debugLineNum = 114;BA.debugLine="sm.AddItem(\"hlp\", \"pager\", \"Pager\",\"\",\"mdi mdi-se";
_sm._additem /*b4j.example.wixsidebar*/ ("hlp","pager","Pager","","mdi mdi-selection-ellipse","","");
 //BA.debugLineNum = 115;BA.debugLine="Return sm";
if (true) return _sm;
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="End Sub";
return "";
}
}
