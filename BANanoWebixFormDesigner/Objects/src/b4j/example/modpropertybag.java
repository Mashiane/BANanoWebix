package b4j.example;


import anywheresoftware.b4a.BA;

public class modpropertybag extends Object{
public static modpropertybag mostCurrent = new modpropertybag();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modpropertybag", null);
		ba.loadHtSubs(modpropertybag.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modpropertybag", ba);
		}
	}
    public static Class<?> getObject() {
		return modpropertybag.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static com.ab.banano.BANano _banano = null;
public static b4j.example.wixproperty _propbag = null;
public static b4j.example.main _main = null;
public static b4j.example.pgformdesigner _pgformdesigner = null;
public static b4j.example.dbutton _dbutton = null;
public static b4j.example.modcenter _modcenter = null;
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
public static b4j.example.ddesignerproperty _ddesignerproperty = null;
public static b4j.example.dconnection _dconnection = null;
public static b4j.example.dtable _dtable = null;
public static b4j.example.dfield _dfield = null;
public static b4j.example.modwebix _modwebix = null;
public static b4j.example.wixform  _getpropertybag() throws Exception{
b4j.example.wixform _frm = null;
b4j.example.wixtoolbar _tbl = null;
 //BA.debugLineNum = 7;BA.debugLine="Sub getPropertyBag As WixForm";
 //BA.debugLineNum = 8;BA.debugLine="propBag = pgFormDesigner.propBag";
_propbag = _pgformdesigner._propbag /*b4j.example.wixproperty*/ ;
 //BA.debugLineNum = 9;BA.debugLine="Dim frm As WixForm";
_frm = new b4j.example.wixform();
 //BA.debugLineNum = 10;BA.debugLine="frm.Initialize(\"propform\")";
_frm._initialize /*b4j.example.wixform*/ (ba,"propform");
 //BA.debugLineNum = 12;BA.debugLine="Dim tbl As WixToolBar";
_tbl = new b4j.example.wixtoolbar();
 //BA.debugLineNum = 13;BA.debugLine="tbl.Initialize(\"proptbl\")";
_tbl._initialize /*b4j.example.wixtoolbar*/ (ba,"proptbl");
 //BA.debugLineNum = 14;BA.debugLine="tbl.CreateIcon(\"add_row\").SetIcon(\"mdi mdi-table-";
_tbl._createicon /*b4j.example.wixicon*/ ("add_row")._seticon /*b4j.example.wixicon*/ ((Object)("mdi mdi-table-row-plus-after"))._settooltip /*b4j.example.wixicon*/ ("Add Row")._setclick /*b4j.example.wixicon*/ ((com.ab.banano.BANanoObject)(_banano.CallBack((Object)(_pgformdesigner.getObject()),"add_row",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)))))._pop /*String*/ ();
 //BA.debugLineNum = 15;BA.debugLine="tbl.CreateIcon(\"add_column\").SetIcon(\"mdi mdi-tab";
_tbl._createicon /*b4j.example.wixicon*/ ("add_column")._seticon /*b4j.example.wixicon*/ ((Object)("mdi mdi-table-column-plus-after"))._settooltip /*b4j.example.wixicon*/ ("Add Column")._setclick /*b4j.example.wixicon*/ ((com.ab.banano.BANanoObject)(_banano.CallBack((Object)(_pgformdesigner.getObject()),"add_column",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)))))._pop /*String*/ ();
 //BA.debugLineNum = 16;BA.debugLine="tbl.AddSpacer";
_tbl._addspacer /*b4j.example.wixtoolbar*/ ();
 //BA.debugLineNum = 17;BA.debugLine="tbl.CreateIcon(\"propadd\").SetIcon(\"mdi mdi-plus-c";
_tbl._createicon /*b4j.example.wixicon*/ ("propadd")._seticon /*b4j.example.wixicon*/ ((Object)("mdi mdi-plus-circle-outline"))._settooltip /*b4j.example.wixicon*/ ("Add")._setclick /*b4j.example.wixicon*/ ((com.ab.banano.BANanoObject)(_banano.CallBack((Object)(_pgformdesigner.getObject()),"prop_add",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)))))._pop /*String*/ ();
 //BA.debugLineNum = 18;BA.debugLine="tbl.CreateIcon(\"propsave\").SetIcon(\"mdi mdi-conte";
_tbl._createicon /*b4j.example.wixicon*/ ("propsave")._seticon /*b4j.example.wixicon*/ ((Object)("mdi mdi-content-save"))._settooltip /*b4j.example.wixicon*/ ("Save")._setclick /*b4j.example.wixicon*/ ((com.ab.banano.BANanoObject)(_banano.CallBack((Object)(_pgformdesigner.getObject()),"prop_savewait",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)))))._pop /*String*/ ();
 //BA.debugLineNum = 19;BA.debugLine="tbl.CreateIcon(\"testconnect\").SetIcon(\"mdi mdi-da";
_tbl._createicon /*b4j.example.wixicon*/ ("testconnect")._seticon /*b4j.example.wixicon*/ ((Object)("mdi mdi-database-check"))._settooltip /*b4j.example.wixicon*/ ("Test Connection")._setclick /*b4j.example.wixicon*/ ((com.ab.banano.BANanoObject)(_banano.CallBack((Object)(_pgformdesigner.getObject()),"testconnect",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)))))._pop /*String*/ ();
 //BA.debugLineNum = 20;BA.debugLine="tbl.CreateIcon(\"propdelete\").SetIcon(\"mdi mdi-del";
_tbl._createicon /*b4j.example.wixicon*/ ("propdelete")._seticon /*b4j.example.wixicon*/ ((Object)("mdi mdi-delete-outline"))._settooltip /*b4j.example.wixicon*/ ("Delete")._setclick /*b4j.example.wixicon*/ ((com.ab.banano.BANanoObject)(_banano.CallBack((Object)(_pgformdesigner.getObject()),"prop_delete",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)))))._pop /*String*/ ();
 //BA.debugLineNum = 23;BA.debugLine="frm.AddRows(tbl.Item)";
_frm._addrows /*String*/ (_tbl._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 24;BA.debugLine="frm.AddRows(propBag.Item)";
_frm._addrows /*String*/ (_propbag._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 25;BA.debugLine="Return frm";
if (true) return _frm;
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return null;
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private BANano As BANano";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 4;BA.debugLine="Private propBag As WixProperty";
_propbag = new b4j.example.wixproperty();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
}
