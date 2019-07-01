package b4j.example;


import anywheresoftware.b4a.BA;

public class pggooglemap extends Object{
public static pggooglemap mostCurrent = new pggooglemap();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.pggooglemap", null);
		ba.loadHtSubs(pggooglemap.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.pggooglemap", ba);
		}
	}
    public static Class<?> getObject() {
		return pggooglemap.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static b4j.example.wixpage _pg = null;
public static b4j.example.wixgooglemap _gmap = null;
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
public static b4j.example.pgunitlist _pgunitlist = null;
public static b4j.example.pgpropertysheet _pgpropertysheet = null;
public static b4j.example.pgtreetable _pgtreetable = null;
public static b4j.example.pgsidebar _pgsidebar = null;
public static b4j.example.pgcomments _pgcomments = null;
public static b4j.example.pggrouplist _pggrouplist = null;
public static b4j.example.pgcontext _pgcontext = null;
public static b4j.example.pguploader1 _pguploader1 = null;
public static String  _init() throws Exception{
b4j.example.wixrow _r1 = null;
String _maid = "";
 //BA.debugLineNum = 8;BA.debugLine="Sub Init";
 //BA.debugLineNum = 9;BA.debugLine="pg.Initialize(\"forms\").SetHeader(\"Lesson 20: Goog";
_pg._initialize /*b4j.example.wixpage*/ (ba,"forms")._setheader /*b4j.example.wixpage*/ ("Lesson 20: Google Map");
 //BA.debugLineNum = 11;BA.debugLine="Dim R1 As WixRow";
_r1 = new b4j.example.wixrow();
 //BA.debugLineNum = 12;BA.debugLine="R1.Initialize(\"R1\")";
_r1._initialize /*b4j.example.wixrow*/ (ba,"R1");
 //BA.debugLineNum = 14;BA.debugLine="gmap.Initialize(\"gmap\").SetWidth(640).SetHeight(4";
_gmap._initialize /*b4j.example.wixgooglemap*/ (ba,"gmap")._setwidth /*b4j.example.wixgooglemap*/ ((int) (640))._setheight /*b4j.example.wixgooglemap*/ ((int) (480))._setborderless /*b4j.example.wixgooglemap*/ (anywheresoftware.b4a.keywords.Common.False)._setstyle /*b4j.example.wixgooglemap*/ ("margin","10px");
 //BA.debugLineNum = 15;BA.debugLine="gmap.SetKey(\"AIzaSyAi0oVNVO-e603aUY8SILdD4v9bVBkm";
_gmap._setkey /*b4j.example.wixgooglemap*/ ("AIzaSyAi0oVNVO-e603aUY8SILdD4v9bVBkmiTg")._setzoom /*b4j.example.wixgooglemap*/ ((int) (6))._setmaptype /*b4j.example.wixgooglemap*/ (_gmap._map_type_roadmap /*String*/ );
 //BA.debugLineNum = 16;BA.debugLine="gmap.SetCenter(25.335, 2.324)";
_gmap._setcenter /*b4j.example.wixgooglemap*/ (25.335,2.324);
 //BA.debugLineNum = 19;BA.debugLine="gmap.AddMarker(\"1\", 25.355, 2.324, \"Point A\", Tru";
_gmap._addmarker /*b4j.example.wixgooglemap*/ ("1",25.355,2.324,"Point A",anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 20;BA.debugLine="gmap.AddMarker(\"2\", 25.444, 5.43, \"Point B\", Fals";
_gmap._addmarker /*b4j.example.wixgooglemap*/ ("2",25.444,5.43,"Point B",anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 21;BA.debugLine="gmap.AddMarker(\"3\", 25.123, 12.375, \"Point C\", Fa";
_gmap._addmarker /*b4j.example.wixgooglemap*/ ("3",25.123,12.375,"Point C",anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 23;BA.debugLine="R1.AddItem(gmap.Item)";
_r1._additem /*b4j.example.wixrow*/ (_gmap._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 25;BA.debugLine="pg.AddRow(R1)";
_pg._addrow /*String*/ (_r1);
 //BA.debugLineNum = 27;BA.debugLine="pg.ui";
_pg._ui /*String*/ ();
 //BA.debugLineNum = 28;BA.debugLine="Dim maID As String";
_maid = "";
 //BA.debugLineNum = 29;BA.debugLine="pg.OnItemClick(\"gmap\", BANano.CallBack(Me,\"marker";
_pg._onitemclick /*String*/ ("gmap",(com.ab.banano.BANanoObject)(_banano.CallBack(pggooglemap.getObject(),"marker_click",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_maid)}))));
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return "";
}
public static String  _marker_click(String _maid) throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
 //BA.debugLineNum = 34;BA.debugLine="Sub marker_click(maid As String)";
 //BA.debugLineNum = 35;BA.debugLine="Dim m As Map = pg.GetMarker(\"gmap\", maid)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = _pg._getmarker /*anywheresoftware.b4a.objects.collections.Map*/ ("gmap",_maid);
 //BA.debugLineNum = 36;BA.debugLine="pg.Message(BANano.ToJson(m))";
_pg._message /*String*/ (BA.ObjectToString(_banano.ToJson((Object)(_m.getObject()))));
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private pg As WixPage";
_pg = new b4j.example.wixpage();
 //BA.debugLineNum = 4;BA.debugLine="Private gmap As WixGoogleMap";
_gmap = new b4j.example.wixgooglemap();
 //BA.debugLineNum = 5;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
}
