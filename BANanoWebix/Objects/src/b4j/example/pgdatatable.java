package b4j.example;


import anywheresoftware.b4a.BA;

public class pgdatatable extends Object{
public static pgdatatable mostCurrent = new pgdatatable();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.pgdatatable", null);
		ba.loadHtSubs(pgdatatable.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.pgdatatable", ba);
		}
	}
    public static Class<?> getObject() {
		return pgdatatable.class;
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
public static b4j.example.pgdataview _pgdataview = null;
public static b4j.example.pgdatatable1 _pgdatatable1 = null;
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
public static String  _init() throws Exception{
b4j.example.wixrow _r1 = null;
anywheresoftware.b4a.objects.collections.List _filmset = null;
b4j.example.wixdatatable _dt = null;
anywheresoftware.b4a.objects.collections.Map _row = null;
 //BA.debugLineNum = 14;BA.debugLine="Public Sub Init()";
 //BA.debugLineNum = 15;BA.debugLine="pg.Initialize(\"forms\").SetHeader(\"Lesson 8.1: Dat";
_pg._initialize /*b4j.example.wixpage*/ (ba,"forms")._setheader /*b4j.example.wixpage*/ ("Lesson 8.1: DataTable");
 //BA.debugLineNum = 17;BA.debugLine="Dim R1 As WixRow";
_r1 = new b4j.example.wixrow();
 //BA.debugLineNum = 18;BA.debugLine="R1.Initialize(\"R1\")";
_r1._initialize /*b4j.example.wixrow*/ (ba,"R1");
 //BA.debugLineNum = 21;BA.debugLine="Dim filmset As List";
_filmset = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 22;BA.debugLine="filmset.Initialize";
_filmset.Initialize();
 //BA.debugLineNum = 23;BA.debugLine="filmset.Add(CreateMap(\"title\" : \"Star Trek: TOS\",";
_filmset.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("title"),(Object)("Star Trek: TOS"),(Object)("network"),(Object)("CBS"),(Object)("seasons"),(Object)(3)}).getObject()));
 //BA.debugLineNum = 24;BA.debugLine="filmset.Add(CreateMap(\"title\" : \"Firefly\", \"netwo";
_filmset.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("title"),(Object)("Firefly"),(Object)("network"),(Object)("Fox"),(Object)("seasons"),(Object)("TOO FEW!!")}).getObject()));
 //BA.debugLineNum = 25;BA.debugLine="filmset.Add(CreateMap(\"title\" : \"Cheers\", \"networ";
_filmset.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("title"),(Object)("Cheers"),(Object)("network"),(Object)("NBC"),(Object)("seasons"),(Object)(11)}).getObject()));
 //BA.debugLineNum = 26;BA.debugLine="filmset.Add(CreateMap(\"title\" : \"Suits\", \"network";
_filmset.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("title"),(Object)("Suits"),(Object)("network"),(Object)("USA"),(Object)("seasons"),(Object)("7 (And counting)")}).getObject()));
 //BA.debugLineNum = 27;BA.debugLine="filmset.Add(CreateMap(\"title\" : \"Babylon 5\", \"net";
_filmset.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("title"),(Object)("Babylon 5"),(Object)("network"),(Object)("PTN"),(Object)("seasons"),(Object)("5")}).getObject()));
 //BA.debugLineNum = 30;BA.debugLine="Dim dt As WixDataTable";
_dt = new b4j.example.wixdatatable();
 //BA.debugLineNum = 31;BA.debugLine="dt.Initialize(\"dt\")";
_dt._initialize /*b4j.example.wixdatatable*/ (ba,"dt");
 //BA.debugLineNum = 32;BA.debugLine="dt.SetColumnWidth(200)		' set the default column";
_dt._setcolumnwidth /*b4j.example.wixdatatable*/ ((int) (200));
 //BA.debugLineNum = 33;BA.debugLine="dt.SetSelect(dt.DT_SELECT_ROW)	' set selection to";
_dt._setselect /*b4j.example.wixdatatable*/ ((Object)(_dt._dt_select_row /*String*/ ));
 //BA.debugLineNum = 35;BA.debugLine="dt.SetData(filmset)		' set the data";
_dt._setdata /*b4j.example.wixdatatable*/ (_filmset);
 //BA.debugLineNum = 36;BA.debugLine="dt.SetAutoConfig(True)";
_dt._setautoconfig /*b4j.example.wixdatatable*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 37;BA.debugLine="dt.SetHover(\"dthover\")		' set the hovering class";
_dt._sethover /*b4j.example.wixdatatable*/ ("dthover");
 //BA.debugLineNum = 38;BA.debugLine="dt.SetResizeColumn(True)	' enable adjusting colum";
_dt._setresizecolumn /*b4j.example.wixdatatable*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 40;BA.debugLine="R1.AddItem(dt.Item)";
_r1._additem /*b4j.example.wixrow*/ (_dt._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 42;BA.debugLine="pg.Page.AddRow(R1)";
_pg._page /*b4j.example.wixelement*/ ._addrow /*String*/ (_r1);
 //BA.debugLineNum = 44;BA.debugLine="pg.UI";
_pg._ui /*String*/ ();
 //BA.debugLineNum = 46;BA.debugLine="Dim row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 47;BA.debugLine="pg.OnAfterSelect(\"dt\", BANano.CallBack(Me,\"record";
_pg._onafterselect /*String*/ ("dt",(com.ab.banano.BANanoObject)(_banano.CallBack(pgdatatable.getObject(),"record_selected",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_row.getObject())}))));
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
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
public static String  _record_selected(anywheresoftware.b4a.objects.collections.Map _row) throws Exception{
String _rowid = "";
String _cid = "";
anywheresoftware.b4a.objects.collections.Map _record = null;
 //BA.debugLineNum = 50;BA.debugLine="Sub record_selected(row As Map)";
 //BA.debugLineNum = 52;BA.debugLine="Dim rowid As String = row.Get(\"row\")";
_rowid = BA.ObjectToString(_row.Get((Object)("row")));
 //BA.debugLineNum = 54;BA.debugLine="rowid = pg.CStr(rowid)";
_rowid = _pg._cstr /*String*/ ((Object)(_rowid));
 //BA.debugLineNum = 56;BA.debugLine="Dim cID As String = row.Get(\"column\")";
_cid = BA.ObjectToString(_row.Get((Object)("column")));
 //BA.debugLineNum = 58;BA.debugLine="Dim record As Map = pg.GetItem(\"dt\", rowid)";
_record = new anywheresoftware.b4a.objects.collections.Map();
_record = _pg._getitem /*anywheresoftware.b4a.objects.collections.Map*/ ("dt",_rowid);
 //BA.debugLineNum = 60;BA.debugLine="pg.Message(BANano.ToJson(record))";
_pg._message /*String*/ (BA.ObjectToString(_banano.ToJson((Object)(_record.getObject()))));
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return "";
}
}
