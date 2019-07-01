package b4j.example;


import anywheresoftware.b4a.BA;

public class pgdataview extends Object{
public static pgdataview mostCurrent = new pgdataview();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.pgdataview", null);
		ba.loadHtSubs(pgdataview.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.pgdataview", ba);
		}
	}
    public static Class<?> getObject() {
		return pgdataview.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static b4j.example.wixpage _pg = null;
public static b4j.example.wixform _myform = null;
public static com.ab.banano.BANano _banano = null;
public static b4j.example.main _main = null;
public static b4j.example.pgtabbar _pgtabbar = null;
public static b4j.example.pgtree _pgtree = null;
public static b4j.example.pgmenu _pgmenu = null;
public static b4j.example.pglist _pglist = null;
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
public static b4j.example.pgunitlist _pgunitlist = null;
public static b4j.example.pgpropertysheet _pgpropertysheet = null;
public static b4j.example.pgtreetable _pgtreetable = null;
public static b4j.example.pgsidebar _pgsidebar = null;
public static b4j.example.pgcomments _pgcomments = null;
public static b4j.example.pggrouplist _pggrouplist = null;
public static b4j.example.pgcontext _pgcontext = null;
public static b4j.example.pggooglemap _pggooglemap = null;
public static b4j.example.pguploader1 _pguploader1 = null;
public static String  _dataview_click(anywheresoftware.b4a.objects.collections.List _recs) throws Exception{
String _recid = "";
anywheresoftware.b4a.objects.collections.Map _selitem = null;
 //BA.debugLineNum = 51;BA.debugLine="Sub dataview_click(recs As List)";
 //BA.debugLineNum = 52;BA.debugLine="Dim recid As String = recs.Get(0)";
_recid = BA.ObjectToString(_recs.Get((int) (0)));
 //BA.debugLineNum = 53;BA.debugLine="recid = pg.CStr(recid)";
_recid = _pg._cstr /*String*/ ((Object)(_recid));
 //BA.debugLineNum = 55;BA.debugLine="Dim selItem As Map = pg.getitem(\"dv\",recid)";
_selitem = new anywheresoftware.b4a.objects.collections.Map();
_selitem = _pg._getitem /*anywheresoftware.b4a.objects.collections.Map*/ ("dv",_recid);
 //BA.debugLineNum = 56;BA.debugLine="pg.Message(BANano.ToJson(selItem))";
_pg._message /*String*/ (BA.ObjectToString(_banano.ToJson((Object)(_selitem.getObject()))));
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return "";
}
public static String  _dataview_dblclick(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Sub dataview_dblclick(e As BANanoEvent)";
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return "";
}
public static String  _init() throws Exception{
b4j.example.wixrow _r1 = null;
anywheresoftware.b4a.objects.collections.List _data = null;
b4j.example.wixdataview _dt = null;
b4j.example.uoenowhtml _tmp = null;
anywheresoftware.b4a.objects.collections.List _recs = null;
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Init()";
 //BA.debugLineNum = 10;BA.debugLine="pg.Initialize(\"forms\").SetHeader(\"Lesson 9: DataV";
_pg._initialize /*b4j.example.wixpage*/ (ba,"forms")._setheader /*b4j.example.wixpage*/ ("Lesson 9: DataView");
 //BA.debugLineNum = 12;BA.debugLine="Dim R1 As WixRow";
_r1 = new b4j.example.wixrow();
 //BA.debugLineNum = 13;BA.debugLine="R1.Initialize(\"R1\")";
_r1._initialize /*b4j.example.wixrow*/ (ba,"R1");
 //BA.debugLineNum = 15;BA.debugLine="Dim data As List";
_data = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 16;BA.debugLine="data.Initialize";
_data.Initialize();
 //BA.debugLineNum = 17;BA.debugLine="data.Add(CreateMap(\"title\" : \"Pitfall\", \"year\" :";
_data.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("title"),(Object)("Pitfall"),(Object)("year"),(Object)(1982),(Object)("system"),(Object)("Atari 2600")}).getObject()));
 //BA.debugLineNum = 18;BA.debugLine="data.Add(CreateMap(\"title\" : \"Pick Axe Pete\", \"ye";
_data.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("title"),(Object)("Pick Axe Pete"),(Object)("year"),(Object)(1982),(Object)("system"),(Object)("Odyssey2")}).getObject()));
 //BA.debugLineNum = 19;BA.debugLine="data.Add(CreateMap(\"title\" : \"Ladybug\", \"year\" :";
_data.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("title"),(Object)("Ladybug"),(Object)("year"),(Object)(1981),(Object)("system"),(Object)("Colecovision")}).getObject()));
 //BA.debugLineNum = 20;BA.debugLine="data.Add(CreateMap(\"title\" : \"Altered Beast\", \"ye";
_data.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("title"),(Object)("Altered Beast"),(Object)("year"),(Object)(1988),(Object)("system"),(Object)("Sega Genesis")}).getObject()));
 //BA.debugLineNum = 21;BA.debugLine="data.Add(CreateMap(\"title\" : \"Halo\", \"year\" : 200";
_data.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("title"),(Object)("Halo"),(Object)("year"),(Object)(2001),(Object)("system"),(Object)("Xbox")}).getObject()));
 //BA.debugLineNum = 22;BA.debugLine="data.Add(CreateMap(\"title\" : \"Crash Bandicoot\", \"";
_data.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("title"),(Object)("Crash Bandicoot"),(Object)("year"),(Object)(1996),(Object)("system"),(Object)("Playstation")}).getObject()));
 //BA.debugLineNum = 23;BA.debugLine="data.Add(CreateMap(\"title\" : \"Guitar Hero\", \"year";
_data.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("title"),(Object)("Guitar Hero"),(Object)("year"),(Object)(2005),(Object)("system"),(Object)("Playstation 2")}).getObject()));
 //BA.debugLineNum = 26;BA.debugLine="Dim dt As WixDataView";
_dt = new b4j.example.wixdataview();
 //BA.debugLineNum = 27;BA.debugLine="dt.Initialize(\"dv\")";
_dt._initialize /*b4j.example.wixdataview*/ (ba,"dv");
 //BA.debugLineNum = 28;BA.debugLine="dt.SetxCount(4).Setwidth(640).SetHeight(250).SetB";
_dt._setxcount /*b4j.example.wixdataview*/ ((int) (4))._setwidth /*b4j.example.wixdataview*/ ((int) (640))._setheight /*b4j.example.wixdataview*/ ((int) (250))._setborderless /*b4j.example.wixdataview*/ (anywheresoftware.b4a.keywords.Common.False)._setitemheight /*b4j.example.wixdataview*/ ((int) (100));
 //BA.debugLineNum = 29;BA.debugLine="dt.SetStyle(\"margin\" , \"10px\").SetSelect(True).Se";
_dt._setstyle /*b4j.example.wixdataview*/ ("margin","10px")._setselect /*b4j.example.wixdataview*/ (anywheresoftware.b4a.keywords.Common.True)._setmultiselect /*b4j.example.wixdataview*/ (anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 30;BA.debugLine="Dim tmp As UOENowHTML";
_tmp = new b4j.example.uoenowhtml();
 //BA.debugLineNum = 31;BA.debugLine="tmp.Initialize(\"tmp\", \"div\")";
_tmp._initialize /*b4j.example.uoenowhtml*/ (ba,"tmp","div");
 //BA.debugLineNum = 32;BA.debugLine="tmp.AddStyle(\"background-color\", \"#ffeaea\")";
_tmp._addstyle /*String*/ ("background-color","#ffeaea");
 //BA.debugLineNum = 33;BA.debugLine="tmp.AddClass(\"webix_strong\")";
_tmp._addclass /*b4j.example.uoenowhtml*/ ("webix_strong");
 //BA.debugLineNum = 34;BA.debugLine="tmp.AddContent(\"#title#\")";
_tmp._addcontent /*b4j.example.uoenowhtml*/ ("#title#");
 //BA.debugLineNum = 35;BA.debugLine="tmp.AddContentAfter(\" Year: #year#{BR}System: #sy";
_tmp._addcontentafter /*b4j.example.uoenowhtml*/ (" Year: #year#{BR}System: #system#");
 //BA.debugLineNum = 36;BA.debugLine="dt.SetTemplate(tmp.HTML)";
_dt._settemplate /*b4j.example.wixdataview*/ (_tmp._html /*String*/ ());
 //BA.debugLineNum = 38;BA.debugLine="dt.SetData(data)";
_dt._setdata /*b4j.example.wixdataview*/ (_data);
 //BA.debugLineNum = 40;BA.debugLine="R1.AddItem(dt.Item)";
_r1._additem /*b4j.example.wixrow*/ (_dt._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 42;BA.debugLine="pg.Page.AddRow(R1)";
_pg._page /*b4j.example.wixelement*/ ._addrow /*String*/ (_r1);
 //BA.debugLineNum = 44;BA.debugLine="pg.UI";
_pg._ui /*String*/ ();
 //BA.debugLineNum = 46;BA.debugLine="Dim recs As List";
_recs = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 47;BA.debugLine="pg.OnSelectChange(\"tmp\", BANano.CallBack(Me,\"data";
_pg._onselectchange /*String*/ ("tmp",(com.ab.banano.BANanoObject)(_banano.CallBack(pgdataview.getObject(),"dataview_click",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_recs.getObject())}))));
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private pg As WixPage";
_pg = new b4j.example.wixpage();
 //BA.debugLineNum = 4;BA.debugLine="Public myForm As WixForm";
_myform = new b4j.example.wixform();
 //BA.debugLineNum = 5;BA.debugLine="Public BANano As BANano";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
}
