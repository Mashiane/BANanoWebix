package b4j.example;


import anywheresoftware.b4a.BA;

public class pglist extends Object{
public static pglist mostCurrent = new pglist();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.pglist", null);
		ba.loadHtSubs(pglist.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.pglist", ba);
		}
	}
    public static Class<?> getObject() {
		return pglist.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static b4j.example.wixpage _pg = null;
public static b4j.example.wixform _myform = null;
public static com.ab.banano.BANano _banano = null;
public static b4j.example.main _main = null;
public static b4j.example.pgvideo _pgvideo = null;
public static b4j.example.pgtabbar _pgtabbar = null;
public static b4j.example.pgtree _pgtree = null;
public static b4j.example.pgmenu _pgmenu = null;
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
b4j.example.wixrow _r2 = null;
b4j.example.wixpager _pgr = null;
b4j.example.wixrow _r3 = null;
b4j.example.uoenowdata _dummy = null;
anywheresoftware.b4a.objects.collections.Map _structure = null;
anywheresoftware.b4a.objects.collections.List _big_film_set = null;
b4j.example.wixlist _flist = null;
String _recid = "";
 //BA.debugLineNum = 11;BA.debugLine="Public Sub Init()";
 //BA.debugLineNum = 12;BA.debugLine="pg.Initialize(\"forms\").SetHeader(\"Lesson 10: List";
_pg._initialize /*b4j.example.wixpage*/ (ba,"forms")._setheader /*b4j.example.wixpage*/ ("Lesson 10: List");
 //BA.debugLineNum = 14;BA.debugLine="Dim R1 As WixRow";
_r1 = new b4j.example.wixrow();
 //BA.debugLineNum = 15;BA.debugLine="R1.Initialize(\"R1\").SetHeight(10)";
_r1._initialize /*b4j.example.wixrow*/ (ba,"R1")._setheight /*b4j.example.wixrow*/ ((int) (10));
 //BA.debugLineNum = 16;BA.debugLine="pg.Page.AddRow(R1)";
_pg._page /*b4j.example.wixelement*/ ._addrow /*String*/ (_r1);
 //BA.debugLineNum = 18;BA.debugLine="Dim R2 As WixRow";
_r2 = new b4j.example.wixrow();
 //BA.debugLineNum = 19;BA.debugLine="R2.Initialize(\"R2\")";
_r2._initialize /*b4j.example.wixrow*/ (ba,"R2");
 //BA.debugLineNum = 21;BA.debugLine="R2.AddColumnsSpacer(10)";
_r2._addcolumnsspacer /*b4j.example.wixrow*/ ((int) (10));
 //BA.debugLineNum = 23;BA.debugLine="Private pgr As WixPager";
_pgr = new b4j.example.wixpager();
 //BA.debugLineNum = 24;BA.debugLine="pgr.Initialize(\"moviepager\").SetAnimate(True).Set";
_pgr._initialize /*b4j.example.wixpager*/ (ba,"moviepager")._setanimate /*b4j.example.wixpager*/ (anywheresoftware.b4a.keywords.Common.True)._setsize /*b4j.example.wixpager*/ ((int) (10));
 //BA.debugLineNum = 25;BA.debugLine="R2.AddColumnsItem(pgr.Item)";
_r2._addcolumnsitem /*b4j.example.wixrow*/ (_pgr._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 27;BA.debugLine="R2.AddColumnsSpacer(\"\")";
_r2._addcolumnsspacer /*b4j.example.wixrow*/ ((int)(Double.parseDouble("")));
 //BA.debugLineNum = 29;BA.debugLine="pg.Page.AddRow(R2)";
_pg._page /*b4j.example.wixelement*/ ._addrow /*String*/ (_r2);
 //BA.debugLineNum = 31;BA.debugLine="Dim R3 As WixRow";
_r3 = new b4j.example.wixrow();
 //BA.debugLineNum = 32;BA.debugLine="R3.Initialize(\"R3\")";
_r3._initialize /*b4j.example.wixrow*/ (ba,"R3");
 //BA.debugLineNum = 34;BA.debugLine="R3.AddColumnsSpacer(10)";
_r3._addcolumnsspacer /*b4j.example.wixrow*/ ((int) (10));
 //BA.debugLineNum = 37;BA.debugLine="Dim dummy As UOENowData";
_dummy = new b4j.example.uoenowdata();
 //BA.debugLineNum = 38;BA.debugLine="dummy.Initialize";
_dummy._initialize /*b4j.example.uoenowdata*/ (ba);
 //BA.debugLineNum = 39;BA.debugLine="Dim structure As Map = CreateMap()";
_structure = new anywheresoftware.b4a.objects.collections.Map();
_structure = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {});
 //BA.debugLineNum = 40;BA.debugLine="structure.Put(\"id\", \"id\")";
_structure.Put((Object)("id"),(Object)("id"));
 //BA.debugLineNum = 41;BA.debugLine="structure.Put(\"rank\", \"id\")";
_structure.Put((Object)("rank"),(Object)("id"));
 //BA.debugLineNum = 42;BA.debugLine="structure.Put(\"title\", \"name\")";
_structure.Put((Object)("title"),(Object)("name"));
 //BA.debugLineNum = 43;BA.debugLine="structure.Put(\"year\", \"year\")";
_structure.Put((Object)("year"),(Object)("year"));
 //BA.debugLineNum = 44;BA.debugLine="Dim big_film_set As List = dummy.GetRecordsWithSt";
_big_film_set = new anywheresoftware.b4a.objects.collections.List();
_big_film_set = _dummy._getrecordswithstructure /*anywheresoftware.b4a.objects.collections.List*/ (_structure,(int) (50));
 //BA.debugLineNum = 46;BA.debugLine="Dim fList As WixList";
_flist = new b4j.example.wixlist();
 //BA.debugLineNum = 47;BA.debugLine="fList.Initialize(\"fList\").SetWidth(500).SetHeight";
_flist._initialize /*b4j.example.wixlist*/ (ba,"fList")._setwidth /*b4j.example.wixlist*/ (BA.NumberToString(500))._setheight /*b4j.example.wixlist*/ (BA.NumberToString(360))._setborderless /*b4j.example.wixlist*/ (anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 48;BA.debugLine="fList.SetTemplate(\"#rank#. #title# (#year#)\").Set";
_flist._settemplate /*b4j.example.wixlist*/ ("#rank#. #title# (#year#)")._setselect /*b4j.example.wixlist*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 49;BA.debugLine="fList.SetScroll(False).SetPager(\"moviepager\").Set";
_flist._setscroll /*b4j.example.wixlist*/ (anywheresoftware.b4a.keywords.Common.False)._setpager /*b4j.example.wixlist*/ ("moviepager")._setdata /*b4j.example.wixlist*/ (_big_film_set);
 //BA.debugLineNum = 51;BA.debugLine="R3.AddColumnsItem(fList.item)";
_r3._addcolumnsitem /*b4j.example.wixrow*/ (_flist._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 53;BA.debugLine="pg.Page.AddRow(R3)";
_pg._page /*b4j.example.wixelement*/ ._addrow /*String*/ (_r3);
 //BA.debugLineNum = 55;BA.debugLine="pg.ui";
_pg._ui /*String*/ ();
 //BA.debugLineNum = 57;BA.debugLine="Dim recID As String";
_recid = "";
 //BA.debugLineNum = 58;BA.debugLine="pg.OnAfterSelect(\"fList\", BANano.CallBack(Me, \"mo";
_pg._onafterselect /*String*/ ("fList",(com.ab.banano.BANanoObject)(_banano.CallBack(pglist.getObject(),"movie_selected",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_recid)}))));
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
public static String  _movie_selected(String _recid) throws Exception{
anywheresoftware.b4a.objects.collections.Map _record = null;
 //BA.debugLineNum = 62;BA.debugLine="Sub movie_selected(recID As String)";
 //BA.debugLineNum = 64;BA.debugLine="Dim record As Map = pg.GetItem(\"fList\", recID)";
_record = new anywheresoftware.b4a.objects.collections.Map();
_record = _pg._getitem /*anywheresoftware.b4a.objects.collections.Map*/ ("fList",_recid);
 //BA.debugLineNum = 65;BA.debugLine="pg.Message(BANano.ToJson(record))";
_pg._message /*String*/ (BA.ObjectToString(_banano.ToJson((Object)(_record.getObject()))));
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private pg As WixPage";
_pg = new b4j.example.wixpage();
 //BA.debugLineNum = 5;BA.debugLine="Public myForm As WixForm";
_myform = new b4j.example.wixform();
 //BA.debugLineNum = 6;BA.debugLine="Public BANano As BANano";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
}
