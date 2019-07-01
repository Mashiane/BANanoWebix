package b4j.example;


import anywheresoftware.b4a.BA;

public class pggrouplist extends Object{
public static pggrouplist mostCurrent = new pggrouplist();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.pggrouplist", null);
		ba.loadHtSubs(pggrouplist.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.pggrouplist", ba);
		}
	}
    public static Class<?> getObject() {
		return pggrouplist.class;
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
public static b4j.example.pgcontext _pgcontext = null;
public static b4j.example.pggooglemap _pggooglemap = null;
public static b4j.example.pguploader1 _pguploader1 = null;
public static b4j.example.pguploader2 _pguploader2 = null;
public static b4j.example.pguploader3 _pguploader3 = null;
public static String  _init() throws Exception{
b4j.example.wixgrouplist _gl = null;
anywheresoftware.b4a.objects.collections.List _data = null;
 //BA.debugLineNum = 6;BA.debugLine="Sub Init";
 //BA.debugLineNum = 7;BA.debugLine="pg.Initialize(\"forms\").SetHeader(\"Lesson 18: Grou";
_pg._initialize /*b4j.example.wixpage*/ (ba,"forms")._setheader /*b4j.example.wixpage*/ ("Lesson 18: GroupList");
 //BA.debugLineNum = 9;BA.debugLine="Dim gl As WixGroupList";
_gl = new b4j.example.wixgrouplist();
 //BA.debugLineNum = 10;BA.debugLine="gl.Initialize(\"gl\").SetScroll(True).SetWidth(300)";
_gl._initialize /*b4j.example.wixgrouplist*/ (ba,"gl")._setscroll /*b4j.example.wixgrouplist*/ (anywheresoftware.b4a.keywords.Common.True)._setwidth /*b4j.example.wixgrouplist*/ (BA.NumberToString(300))._setborderless /*b4j.example.wixgrouplist*/ (anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 11;BA.debugLine="gl.SetStyle(\"margin\",\"10px\")";
_gl._setstyle /*b4j.example.wixgrouplist*/ ("margin","10px");
 //BA.debugLineNum = 14;BA.debugLine="gl.AddItem(\"\",\"movies\", \"Movies\",\"\",\"\",\"\",\"\",True";
_gl._additem /*b4j.example.wixgrouplist*/ ("","movies","Movies","","","","",anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 15;BA.debugLine="gl.AddItem(\"movies\", \"startrek\", \"Star Trek\",\"\",\"";
_gl._additem /*b4j.example.wixgrouplist*/ ("movies","startrek","Star Trek","","","","",anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 16;BA.debugLine="gl.AddItem(\"movies\", \"starwars\", \"Star Wars\",\"\",\"";
_gl._additem /*b4j.example.wixgrouplist*/ ("movies","starwars","Star Wars","","","","",anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 18;BA.debugLine="gl.AddItem(\"startrek\", \"tmp\", \"The Motion Picture";
_gl._additem /*b4j.example.wixgrouplist*/ ("startrek","tmp","The Motion Picture","","","","",anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 19;BA.debugLine="gl.AddItem(\"startrek\", \"twk\", \"The Wrath of Khan\"";
_gl._additem /*b4j.example.wixgrouplist*/ ("startrek","twk","The Wrath of Khan","","","","",anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 20;BA.debugLine="gl.AddItem(\"startrek\", \"sfs\", \"The Search for Spo";
_gl._additem /*b4j.example.wixgrouplist*/ ("startrek","sfs","The Search for Spock","","","","",anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 22;BA.debugLine="gl.AddItem(\"starwars\", \"tnh\", \"A New Hope\",\"\",\"\",";
_gl._additem /*b4j.example.wixgrouplist*/ ("starwars","tnh","A New Hope","","","","",anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 23;BA.debugLine="gl.AddItem(\"starwars\", \"tesb\", \"The Empire Strike";
_gl._additem /*b4j.example.wixgrouplist*/ ("starwars","tesb","The Empire Strikes Back","","","","",anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 24;BA.debugLine="gl.AddItem(\"starwars\", \"troj\", \"Return of the Jed";
_gl._additem /*b4j.example.wixgrouplist*/ ("starwars","troj","Return of the Jedi","","","","",anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 26;BA.debugLine="gl.AddItem(\"\",\"books\", \"Books\",\"\",\"\",\"\",\"\",True)";
_gl._additem /*b4j.example.wixgrouplist*/ ("","books","Books","","","","",anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 27;BA.debugLine="gl.AddItem(\"books\",\"hp\", \"Harry Potter\",\"\",\"\",\"\",";
_gl._additem /*b4j.example.wixgrouplist*/ ("books","hp","Harry Potter","","","","",anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 29;BA.debugLine="gl.AddItem(\"hp\",\"tss\", \"The Sorcerer's Stone\",\"\",";
_gl._additem /*b4j.example.wixgrouplist*/ ("hp","tss","The Sorcerer's Stone","","","","",anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 30;BA.debugLine="gl.AddItem(\"hp\",\"tcos\", \"The Chamber of Secrets\",";
_gl._additem /*b4j.example.wixgrouplist*/ ("hp","tcos","The Chamber of Secrets","","","","",anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 31;BA.debugLine="gl.AddItem(\"hp\",\"tpoa\", \"The Prisoner of Azkaban\"";
_gl._additem /*b4j.example.wixgrouplist*/ ("hp","tpoa","The Prisoner of Azkaban","","","","",anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 33;BA.debugLine="gl.AddItem(\"books\",\"dt\", \"The Dark Tower\",\"\",\"\",\"";
_gl._additem /*b4j.example.wixgrouplist*/ ("books","dt","The Dark Tower","","","","",anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 34;BA.debugLine="gl.AddItem(\"dt\",\"tg\", \"The Gunslinger\",\"\",\"\",\"\",\"";
_gl._additem /*b4j.example.wixgrouplist*/ ("dt","tg","The Gunslinger","","","","",anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 35;BA.debugLine="gl.AddItem(\"dt\",\"tdot\", \"The Drawing of the Three";
_gl._additem /*b4j.example.wixgrouplist*/ ("dt","tdot","The Drawing of the Three","","","","",anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 36;BA.debugLine="gl.AddItem(\"dt\",\"twl\", \"The Waste Lands\",\"\",\"\",\"\"";
_gl._additem /*b4j.example.wixgrouplist*/ ("dt","twl","The Waste Lands","","","","",anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 38;BA.debugLine="Dim data As List = pg.Unflatten(gl.items, \"data\")";
_data = new anywheresoftware.b4a.objects.collections.List();
_data = _pg._unflatten /*anywheresoftware.b4a.objects.collections.List*/ (_gl._items /*anywheresoftware.b4a.objects.collections.List*/ ,"data");
 //BA.debugLineNum = 39;BA.debugLine="gl.SetData(data)";
_gl._setdata /*b4j.example.wixgrouplist*/ (_data);
 //BA.debugLineNum = 43;BA.debugLine="pg.Page.AddRows(gl.Item)";
_pg._page /*b4j.example.wixelement*/ ._addrows /*b4j.example.wixelement*/ (_gl._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 44;BA.debugLine="pg.ui";
_pg._ui /*String*/ ();
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
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
