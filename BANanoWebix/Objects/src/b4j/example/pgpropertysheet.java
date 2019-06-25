package b4j.example;


import anywheresoftware.b4a.BA;

public class pgpropertysheet extends Object{
public static pgpropertysheet mostCurrent = new pgpropertysheet();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.pgpropertysheet", null);
		ba.loadHtSubs(pgpropertysheet.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.pgpropertysheet", ba);
		}
	}
    public static Class<?> getObject() {
		return pgpropertysheet.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static b4j.example.wixpage _pg = null;
public static com.ab.banano.BANano _banano = null;
public static b4j.example.main _main = null;
public static b4j.example.pgdataview _pgdataview = null;
public static b4j.example.pgdatatable1 _pgdatatable1 = null;
public static b4j.example.pgdatatable _pgdatatable = null;
public static b4j.example.pgcharts _pgcharts = null;
public static b4j.example.pgdataentry _pgdataentry = null;
public static b4j.example.pgforms1 _pgforms1 = null;
public static b4j.example.pgforms _pgforms = null;
public static b4j.example.pgtoolbar _pgtoolbar = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.pgmultiview _pgmultiview = null;
public static b4j.example.pglayouts1 _pglayouts1 = null;
public static b4j.example.pglayouts2 _pglayouts2 = null;
public static b4j.example.pglayouts _pglayouts = null;
public static b4j.example.pglayout _pglayout = null;
public static b4j.example.pglist _pglist = null;
public static b4j.example.pgunitlist _pgunitlist = null;
public static b4j.example.pgtree _pgtree = null;
public static b4j.example.pgtreetable _pgtreetable = null;
public static b4j.example.pgmenu _pgmenu = null;
public static b4j.example.pgsidebar _pgsidebar = null;
public static b4j.example.pgcomments _pgcomments = null;
public static String  _init() throws Exception{
anywheresoftware.b4a.objects.collections.List _color_options = null;
anywheresoftware.b4a.objects.collections.List _position_options = null;
anywheresoftware.b4a.objects.collections.List _load_types = null;
b4j.example.wixproperty _prop = null;
Object _fid = null;
Object _fstate = null;
Object _e = null;
 //BA.debugLineNum = 8;BA.debugLine="Sub Init";
 //BA.debugLineNum = 9;BA.debugLine="pg.Initialize(\"forms\").SetHeader(\"Lesson 12: Prop";
_pg._initialize /*b4j.example.wixpage*/ (ba,"forms")._setheader /*b4j.example.wixpage*/ ("Lesson 12: Property [Sheet]");
 //BA.debugLineNum = 11;BA.debugLine="Dim color_options As List";
_color_options = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 12;BA.debugLine="color_options.Initialize";
_color_options.Initialize();
 //BA.debugLineNum = 13;BA.debugLine="color_options.Add(CreateMap(\"id\":1, \"value\":\"red\"";
_color_options.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(1),(Object)("value"),(Object)("red")}).getObject()));
 //BA.debugLineNum = 14;BA.debugLine="color_options.Add(CreateMap(\"id\":2, \"value\":\"blue";
_color_options.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(2),(Object)("value"),(Object)("blue")}).getObject()));
 //BA.debugLineNum = 15;BA.debugLine="color_options.Add(CreateMap(\"id\":3, \"value\":\"gree";
_color_options.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(3),(Object)("value"),(Object)("green")}).getObject()));
 //BA.debugLineNum = 16;BA.debugLine="color_options.Add(CreateMap(\"id\":4, \"value\":\"oran";
_color_options.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(4),(Object)("value"),(Object)("orange")}).getObject()));
 //BA.debugLineNum = 17;BA.debugLine="color_options.Add(CreateMap(\"id\":5, \"value\":\"grey";
_color_options.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(5),(Object)("value"),(Object)("grey")}).getObject()));
 //BA.debugLineNum = 18;BA.debugLine="color_options.Add(CreateMap(\"id\":6, \"value\":\"yell";
_color_options.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(6),(Object)("value"),(Object)("yellow")}).getObject()));
 //BA.debugLineNum = 20;BA.debugLine="Dim position_options As List";
_position_options = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 21;BA.debugLine="position_options.Initialize";
_position_options.Initialize();
 //BA.debugLineNum = 22;BA.debugLine="position_options.Add(CreateMap(\"id\":1, \"value\":\"l";
_position_options.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(1),(Object)("value"),(Object)("left")}).getObject()));
 //BA.debugLineNum = 23;BA.debugLine="position_options.Add(CreateMap(\"id\":2, \"value\":\"r";
_position_options.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(2),(Object)("value"),(Object)("right")}).getObject()));
 //BA.debugLineNum = 24;BA.debugLine="position_options.Add(CreateMap(\"id\":3, \"value\":\"t";
_position_options.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(3),(Object)("value"),(Object)("top")}).getObject()));
 //BA.debugLineNum = 25;BA.debugLine="position_options.Add(CreateMap(\"id\":4, \"value\":\"b";
_position_options.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(4),(Object)("value"),(Object)("bottom")}).getObject()));
 //BA.debugLineNum = 27;BA.debugLine="Dim load_types As List";
_load_types = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 28;BA.debugLine="load_types.Initialize";
_load_types.Initialize();
 //BA.debugLineNum = 29;BA.debugLine="load_types.Add(\"json\")";
_load_types.Add((Object)("json"));
 //BA.debugLineNum = 30;BA.debugLine="load_types.Add(\"xml\")";
_load_types.Add((Object)("xml"));
 //BA.debugLineNum = 31;BA.debugLine="load_types.Add(\"csv\")";
_load_types.Add((Object)("csv"));
 //BA.debugLineNum = 34;BA.debugLine="Dim prop As WixProperty";
_prop = new b4j.example.wixproperty();
 //BA.debugLineNum = 35;BA.debugLine="prop.Initialize(\"prop\").setwidth(300).setnamewidt";
_prop._initialize /*b4j.example.wixproperty*/ (ba,"prop")._setwidth /*b4j.example.wixproperty*/ ((int) (300))._setnamewidth /*b4j.example.wixproperty*/ ((int) (200));
 //BA.debugLineNum = 38;BA.debugLine="prop.AddLabel(\"Layout\")";
_prop._addlabel /*String*/ ("Layout");
 //BA.debugLineNum = 39;BA.debugLine="prop.AddTextBox(\"width\", \"Width\", 250)";
_prop._addtextbox /*String*/ ("width","Width",BA.NumberToString(250));
 //BA.debugLineNum = 40;BA.debugLine="prop.AddTextBox(\"height\", \"Height\", \"\")";
_prop._addtextbox /*String*/ ("height","Height","");
 //BA.debugLineNum = 41;BA.debugLine="prop.AddPassword(\"pass\", \"Password\", \"\")";
_prop._addpassword /*String*/ ("pass","Password","");
 //BA.debugLineNum = 43;BA.debugLine="prop.AddLabel(\"Data loading\")";
_prop._addlabel /*String*/ ("Data loading");
 //BA.debugLineNum = 44;BA.debugLine="prop.AddTextBox(\"url\", \"Data url\", \"http://banano";
_prop._addtextbox /*String*/ ("url","Data url","http://bananowebix.com/data");
 //BA.debugLineNum = 45;BA.debugLine="prop.AddSelect(\"type\", \"Type\",\"\", load_types)";
_prop._addselect /*String*/ ("type","Type","",_load_types);
 //BA.debugLineNum = 46;BA.debugLine="prop.AddSelect(\"position\", \"Position\",\"\", positio";
_prop._addselect /*String*/ ("position","Position","",_position_options);
 //BA.debugLineNum = 47;BA.debugLine="prop.AddDate(\"date\", \"Date\",\"\")";
_prop._adddate /*String*/ ("date","Date","");
 //BA.debugLineNum = 48;BA.debugLine="prop.AddCombo(\"color\", \"Color\",\"\", color_options)";
_prop._addcombo /*String*/ ("color","Color","",_color_options);
 //BA.debugLineNum = 49;BA.debugLine="prop.AddCheckBox(\"jsonp\", \"Use JSONP\", \"\")";
_prop._addcheckbox /*String*/ ("jsonp","Use JSONP","");
 //BA.debugLineNum = 50;BA.debugLine="prop.AddColor(\"bg\",\"Background\",\"\")";
_prop._addcolor /*String*/ ("bg","Background","");
 //BA.debugLineNum = 52;BA.debugLine="pg.Page.AddRows(prop.Item)";
_pg._page /*b4j.example.wixelement*/ ._addrows /*b4j.example.wixelement*/ (_prop._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 54;BA.debugLine="pg.ui";
_pg._ui /*String*/ ();
 //BA.debugLineNum = 56;BA.debugLine="Dim fid, fstate As Object";
_fid = new Object();
_fstate = new Object();
 //BA.debugLineNum = 57;BA.debugLine="pg.OnCheck(\"prop\", BANano.CallBack(Me, \"prop_chan";
_pg._oncheck /*String*/ ("prop",(com.ab.banano.BANanoObject)(_banano.CallBack(pgpropertysheet.getObject(),"prop_change",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_fid,_fstate}))));
 //BA.debugLineNum = 59;BA.debugLine="Dim e As Object";
_e = new Object();
 //BA.debugLineNum = 62;BA.debugLine="Dim e As Object";
_e = new Object();
 //BA.debugLineNum = 63;BA.debugLine="pg.onEnter(\"prop\", BANano.CallBack(Me, \"prop_onen";
_pg._onenter /*String*/ ("prop",(com.ab.banano.BANanoObject)(_banano.CallBack(pgpropertysheet.getObject(),"prop_onenter",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_e}))));
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private pg As WixPage";
_pg = new b4j.example.wixpage();
 //BA.debugLineNum = 5;BA.debugLine="Public BANano As BANano";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public static String  _prop_change(String _fid,boolean _fstate) throws Exception{
anywheresoftware.b4a.objects.collections.Map _rec = null;
 //BA.debugLineNum = 78;BA.debugLine="Sub prop_change(fid As String, fstate As Boolean)";
 //BA.debugLineNum = 79;BA.debugLine="Log(fid)";
anywheresoftware.b4a.keywords.Common.Log(_fid);
 //BA.debugLineNum = 80;BA.debugLine="Log(fstate)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(_fstate));
 //BA.debugLineNum = 83;BA.debugLine="Dim rec As Map = pg.GetValues(\"prop\")";
_rec = new anywheresoftware.b4a.objects.collections.Map();
_rec = _pg._getvalues /*anywheresoftware.b4a.objects.collections.Map*/ ("prop");
 //BA.debugLineNum = 85;BA.debugLine="pg.Message(BANano.ToJson(rec))";
_pg._message /*String*/ (BA.ObjectToString(_banano.ToJson((Object)(_rec.getObject()))));
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return "";
}
public static String  _prop_keypress(Object _e) throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Sub prop_keypress(e As Object)";
 //BA.debugLineNum = 75;BA.debugLine="Log(e)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(_e));
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return "";
}
public static String  _prop_onenter(Object _e) throws Exception{
anywheresoftware.b4a.objects.collections.Map _rec = null;
 //BA.debugLineNum = 67;BA.debugLine="Sub prop_onenter(e As Object)";
 //BA.debugLineNum = 69;BA.debugLine="Dim rec As Map = pg.GetValues(\"prop\")";
_rec = new anywheresoftware.b4a.objects.collections.Map();
_rec = _pg._getvalues /*anywheresoftware.b4a.objects.collections.Map*/ ("prop");
 //BA.debugLineNum = 71;BA.debugLine="pg.Message(BANano.ToJson(rec))";
_pg._message /*String*/ (BA.ObjectToString(_banano.ToJson((Object)(_rec.getObject()))));
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return "";
}
}
