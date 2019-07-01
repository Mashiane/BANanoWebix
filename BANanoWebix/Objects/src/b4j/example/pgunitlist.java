package b4j.example;


import anywheresoftware.b4a.BA;

public class pgunitlist extends Object{
public static pgunitlist mostCurrent = new pgunitlist();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.pgunitlist", null);
		ba.loadHtSubs(pgunitlist.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.pgunitlist", ba);
		}
	}
    public static Class<?> getObject() {
		return pgunitlist.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static b4j.example.wixpage _pg = null;
public static com.ab.banano.BANano _banano = null;
public static b4j.example.main _main = null;
public static b4j.example.pgtabbar _pgtabbar = null;
public static b4j.example.pgtree _pgtree = null;
public static b4j.example.pgmenu _pgmenu = null;
public static b4j.example.pglist _pglist = null;
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
public static b4j.example.pgpropertysheet _pgpropertysheet = null;
public static b4j.example.pgtreetable _pgtreetable = null;
public static b4j.example.pgsidebar _pgsidebar = null;
public static b4j.example.pgcomments _pgcomments = null;
public static b4j.example.pggrouplist _pggrouplist = null;
public static b4j.example.pgcontext _pgcontext = null;
public static b4j.example.pggooglemap _pggooglemap = null;
public static b4j.example.pguploader1 _pguploader1 = null;
public static b4j.example.pguploader2 _pguploader2 = null;
public static b4j.example.pguploader3 _pguploader3 = null;
public static String  _init() throws Exception{
b4j.example.wixunitlist _ul = null;
b4j.example.uoenowdata _dummy = null;
anywheresoftware.b4a.objects.collections.List _data = null;
String _eid = "";
 //BA.debugLineNum = 8;BA.debugLine="Sub Init";
 //BA.debugLineNum = 9;BA.debugLine="pg.Initialize(\"forms\").SetHeader(\"Lesson 11: Unit";
_pg._initialize /*b4j.example.wixpage*/ (ba,"forms")._setheader /*b4j.example.wixpage*/ ("Lesson 11: Unit List");
 //BA.debugLineNum = 11;BA.debugLine="Dim ul As WixUnitList";
_ul = new b4j.example.wixunitlist();
 //BA.debugLineNum = 12;BA.debugLine="ul.Initialize(\"ulx\")";
_ul._initialize /*b4j.example.wixunitlist*/ (ba,"ulx");
 //BA.debugLineNum = 13;BA.debugLine="ul.Setheight(500)";
_ul._setheight /*b4j.example.wixunitlist*/ ((int) (500));
 //BA.debugLineNum = 14;BA.debugLine="ul.SetTemplate(\"#title#<br>#year#\")";
_ul._settemplate /*b4j.example.wixunitlist*/ ((Object)("#title#<br>#year#"));
 //BA.debugLineNum = 15;BA.debugLine="ul.SetBorderLess(False)";
_ul._setborderless /*b4j.example.wixunitlist*/ (anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 16;BA.debugLine="ul.SetStyle(\"margin\", \"10px\")";
_ul._setstyle /*b4j.example.wixunitlist*/ ("margin","10px");
 //BA.debugLineNum = 17;BA.debugLine="ul.SetItemHeight(80)";
_ul._setitemheight /*b4j.example.wixunitlist*/ ((Object)(80));
 //BA.debugLineNum = 19;BA.debugLine="Dim dummy As UOENowData";
_dummy = new b4j.example.uoenowdata();
 //BA.debugLineNum = 20;BA.debugLine="dummy.Initialize";
_dummy._initialize /*b4j.example.uoenowdata*/ (ba);
 //BA.debugLineNum = 21;BA.debugLine="Dim data As List = dummy.GetRecordsWithStructure(";
_data = new anywheresoftware.b4a.objects.collections.List();
_data = _dummy._getrecordswithstructure /*anywheresoftware.b4a.objects.collections.List*/ (anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)("id"),(Object)("title"),(Object)("name"),(Object)("year"),(Object)("year")}),(int) (10));
 //BA.debugLineNum = 22;BA.debugLine="ul.SetData(data)";
_ul._setdata /*b4j.example.wixunitlist*/ (_data);
 //BA.debugLineNum = 24;BA.debugLine="pg.Page.AddRows(ul.Item)";
_pg._page /*b4j.example.wixelement*/ ._addrows /*b4j.example.wixelement*/ (_ul._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 26;BA.debugLine="pg.ui";
_pg._ui /*String*/ ();
 //BA.debugLineNum = 28;BA.debugLine="Dim eID As String";
_eid = "";
 //BA.debugLineNum = 29;BA.debugLine="pg.OnItemClick(\"ulx\", BANano.CallBack(Me, \"item_s";
_pg._onitemclick /*String*/ ("ulx",(com.ab.banano.BANanoObject)(_banano.CallBack(pgunitlist.getObject(),"item_select",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_eid)}))));
 //BA.debugLineNum = 31;BA.debugLine="pg.SetUniteBy(\"ulx\", \"title\")";
_pg._setuniteby /*String*/ ("ulx","title");
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return "";
}
public static String  _item_select(String _eid) throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
 //BA.debugLineNum = 34;BA.debugLine="Sub item_select(eID As String)";
 //BA.debugLineNum = 35;BA.debugLine="eID = pg.CStr(eID)";
_eid = _pg._cstr /*String*/ ((Object)(_eid));
 //BA.debugLineNum = 36;BA.debugLine="Dim m As Map = pg.GetItem(\"ulx\", eID)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = _pg._getitem /*anywheresoftware.b4a.objects.collections.Map*/ ("ulx",_eid);
 //BA.debugLineNum = 37;BA.debugLine="pg.Message(BANano.ToJson(m))";
_pg._message /*String*/ (BA.ObjectToString(_banano.ToJson((Object)(_m.getObject()))));
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
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
}
