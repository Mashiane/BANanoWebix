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
public static b4j.example.pgdataview _pgdataview = null;
public static b4j.example.pglist _pglist = null;
public static b4j.example.pgpropertysheet _pgpropertysheet = null;
public static b4j.example.pgtree _pgtree = null;
public static b4j.example.pgtreetable _pgtreetable = null;
public static String  _init() throws Exception{
b4j.example.wixunitlist _ul = null;
b4j.example.uoenowdata _dummy = null;
anywheresoftware.b4a.objects.collections.List _data = null;
 //BA.debugLineNum = 8;BA.debugLine="Sub Init";
 //BA.debugLineNum = 9;BA.debugLine="pg.Initialize(\"forms\").SetHeader(\"Lesson 11: Unit";
_pg._initialize /*b4j.example.wixpage*/ (ba,"forms")._setheader /*b4j.example.wixpage*/ ("Lesson 11: Unit List");
 //BA.debugLineNum = 11;BA.debugLine="Dim ul As WixUnitList";
_ul = new b4j.example.wixunitlist();
 //BA.debugLineNum = 12;BA.debugLine="ul.Initialize(\"ulx\").Setwidth(300).Setheight(280)";
_ul._initialize /*b4j.example.wixunitlist*/ (ba,"ulx")._setwidth /*b4j.example.wixunitlist*/ ((int) (300))._setheight /*b4j.example.wixunitlist*/ ((int) (280))._settemplate /*b4j.example.wixunitlist*/ ((Object)("#title#"))._setborderless /*b4j.example.wixunitlist*/ (anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 13;BA.debugLine="ul.SetStyle(\"margin\", \"10px\").SetUniteBy(\"title\")";
_ul._setstyle /*b4j.example.wixunitlist*/ ("margin","10px")._setuniteby /*b4j.example.wixunitlist*/ ("title");
 //BA.debugLineNum = 15;BA.debugLine="Dim dummy As UOENowData";
_dummy = new b4j.example.uoenowdata();
 //BA.debugLineNum = 16;BA.debugLine="dummy.Initialize";
_dummy._initialize /*b4j.example.uoenowdata*/ (ba);
 //BA.debugLineNum = 17;BA.debugLine="Dim data As List = dummy.GetRecordsWithStructure(";
_data = new anywheresoftware.b4a.objects.collections.List();
_data = _dummy._getrecordswithstructure /*anywheresoftware.b4a.objects.collections.List*/ (anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)("id"),(Object)("title"),(Object)("name")}),(int) (10));
 //BA.debugLineNum = 18;BA.debugLine="ul.SetData(data)";
_ul._setdata /*b4j.example.wixunitlist*/ (_data);
 //BA.debugLineNum = 20;BA.debugLine="pg.Page.AddRows(ul.Item)";
_pg._page /*b4j.example.wixelement*/ ._addrows /*b4j.example.wixelement*/ (_ul._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 22;BA.debugLine="pg.ui";
_pg._ui /*String*/ ();
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
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
