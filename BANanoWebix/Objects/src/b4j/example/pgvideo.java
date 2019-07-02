package b4j.example;


import anywheresoftware.b4a.BA;

public class pgvideo extends Object{
public static pgvideo mostCurrent = new pgvideo();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.pgvideo", null);
		ba.loadHtSubs(pgvideo.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.pgvideo", ba);
		}
	}
    public static Class<?> getObject() {
		return pgvideo.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static b4j.example.wixpage _pg = null;
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
public static b4j.example.pggooglemap _pggooglemap = null;
public static b4j.example.pguploader1 _pguploader1 = null;
public static b4j.example.pguploader2 _pguploader2 = null;
public static b4j.example.pguploader3 _pguploader3 = null;
public static String  _init() throws Exception{
b4j.example.wixrow _r1 = null;
b4j.example.wixvideo _vid = null;
 //BA.debugLineNum = 6;BA.debugLine="Sub Init";
 //BA.debugLineNum = 7;BA.debugLine="pg.Initialize(\"\").SetHeader(\"Lesson 23: WixVideo\"";
_pg._initialize /*b4j.example.wixpage*/ (ba,"")._setheader /*b4j.example.wixpage*/ ("Lesson 23: WixVideo");
 //BA.debugLineNum = 9;BA.debugLine="Dim R1 As WixRow";
_r1 = new b4j.example.wixrow();
 //BA.debugLineNum = 10;BA.debugLine="R1.Initialize(\"R1\")";
_r1._initialize /*b4j.example.wixrow*/ (ba,"R1");
 //BA.debugLineNum = 12;BA.debugLine="Dim vid As WixVideo";
_vid = new b4j.example.wixvideo();
 //BA.debugLineNum = 13;BA.debugLine="vid.Initialize(\"vid\").SetWidth(640).SetBorderLess";
_vid._initialize /*b4j.example.wixvideo*/ (ba,"vid")._setwidth /*b4j.example.wixvideo*/ ((int) (640))._setborderless /*b4j.example.wixvideo*/ (anywheresoftware.b4a.keywords.Common.False)._setstyle /*b4j.example.wixvideo*/ ("margin","10px");
 //BA.debugLineNum = 14;BA.debugLine="vid.SetSRC(\"./assets/movie.mp4\").SetSRC(\"./assets";
_vid._setsrc /*b4j.example.wixvideo*/ ("./assets/movie.mp4")._setsrc /*b4j.example.wixvideo*/ ("./assets/movie.ogv")._setautoplay /*b4j.example.wixvideo*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 16;BA.debugLine="R1.AddRows(vid.Item)";
_r1._addrows /*b4j.example.wixrow*/ (_vid._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 18;BA.debugLine="pg.AddRow(R1)";
_pg._addrow /*String*/ (_r1);
 //BA.debugLineNum = 20;BA.debugLine="pg.ui";
_pg._ui /*String*/ ();
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private pg As WixPage";
_pg = new b4j.example.wixpage();
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return "";
}
}
