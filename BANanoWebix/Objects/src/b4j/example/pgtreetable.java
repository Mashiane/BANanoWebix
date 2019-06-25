package b4j.example;


import anywheresoftware.b4a.BA;

public class pgtreetable extends Object{
public static pgtreetable mostCurrent = new pgtreetable();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.pgtreetable", null);
		ba.loadHtSubs(pgtreetable.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.pgtreetable", ba);
		}
	}
    public static Class<?> getObject() {
		return pgtreetable.class;
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
public static b4j.example.pgpropertysheet _pgpropertysheet = null;
public static b4j.example.pgtree _pgtree = null;
public static b4j.example.pgmenu _pgmenu = null;
public static b4j.example.pgsidebar _pgsidebar = null;
public static b4j.example.pgcomments _pgcomments = null;
public static String  _init() throws Exception{
b4j.example.wixtreetable _prop = null;
b4j.example.wixdatacolumn _c1 = null;
b4j.example.wixdatacolumn _c2 = null;
b4j.example.wixdatacolumn _c3 = null;
anywheresoftware.b4a.objects.collections.List _data = null;
b4j.example.uoenowdata _dummy = null;
String _recid = "";
 //BA.debugLineNum = 8;BA.debugLine="Sub Init";
 //BA.debugLineNum = 9;BA.debugLine="pg.Initialize(\"forms\").SetHeader(\"Lesson 14: Tree";
_pg._initialize /*b4j.example.wixpage*/ (ba,"forms")._setheader /*b4j.example.wixpage*/ ("Lesson 14: Tree Table");
 //BA.debugLineNum = 11;BA.debugLine="Dim prop As WixTreeTable";
_prop = new b4j.example.wixtreetable();
 //BA.debugLineNum = 12;BA.debugLine="prop.Initialize(\"treetable\").Setborderless(True)";
_prop._initialize /*b4j.example.wixtreetable*/ (ba,"treetable")._setborderless /*b4j.example.wixtreetable*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 13;BA.debugLine="prop.SetStyle(\"margin\", \"10px\")";
_prop._setstyle /*b4j.example.wixtreetable*/ ("margin","10px");
 //BA.debugLineNum = 14;BA.debugLine="prop.SetSelect(prop.DT_SELECT_ROW)";
_prop._setselect /*b4j.example.wixtreetable*/ ((Object)(_prop._dt_select_row /*String*/ ));
 //BA.debugLineNum = 15;BA.debugLine="prop.SetAutoWidth(True).SetEditable(True)";
_prop._setautowidth /*b4j.example.wixtreetable*/ (anywheresoftware.b4a.keywords.Common.True)._seteditable /*b4j.example.wixtreetable*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 17;BA.debugLine="Dim c1 As WixDataColumn";
_c1 = new b4j.example.wixdatacolumn();
 //BA.debugLineNum = 18;BA.debugLine="c1.Initialize1(prop, \"id\").SetHeader(\" \").Setwidt";
_c1._initialize1 /*b4j.example.wixdatacolumn*/ (_prop,"id")._setheader /*b4j.example.wixdatacolumn*/ (" ")._setwidth /*b4j.example.wixdatacolumn*/ ((int) (50))._setsort /*b4j.example.wixdatacolumn*/ ("string")._pop1 /*String*/ ();
 //BA.debugLineNum = 20;BA.debugLine="Dim c2 As WixDataColumn";
_c2 = new b4j.example.wixdatacolumn();
 //BA.debugLineNum = 21;BA.debugLine="c2.Initialize1(prop, \"value\").Setheader(\"Candy Ba";
_c2._initialize1 /*b4j.example.wixdatacolumn*/ (_prop,"value")._setheader /*b4j.example.wixdatacolumn*/ ("Candy Bars")._settemplate /*b4j.example.wixdatacolumn*/ ((Object)("{common.treetable()} #value#"))._setwidth /*b4j.example.wixdatacolumn*/ ((int) (300))._setsort /*b4j.example.wixdatacolumn*/ ("string")._pop1 /*String*/ ();
 //BA.debugLineNum = 23;BA.debugLine="Dim c3 As WixDataColumn";
_c3 = new b4j.example.wixdatacolumn();
 //BA.debugLineNum = 24;BA.debugLine="c3.Initialize1(prop, \"nutsornot\").Setheader(\"Nuts";
_c3._initialize1 /*b4j.example.wixdatacolumn*/ (_prop,"nutsornot")._setheader /*b4j.example.wixdatacolumn*/ ("Nuts?")._setwidth /*b4j.example.wixdatacolumn*/ ((int) (180))._setsort /*b4j.example.wixdatacolumn*/ ("string")._pop1 /*String*/ ();
 //BA.debugLineNum = 26;BA.debugLine="Dim data As List";
_data = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 27;BA.debugLine="data.Initialize";
_data.Initialize();
 //BA.debugLineNum = 29;BA.debugLine="Dim dummy As UOENowData";
_dummy = new b4j.example.uoenowdata();
 //BA.debugLineNum = 30;BA.debugLine="dummy.Initialize";
_dummy._initialize /*b4j.example.uoenowdata*/ (ba);
 //BA.debugLineNum = 31;BA.debugLine="data = dummy.GetRecordsWithStructure(CreateMap(\"i";
_data = _dummy._getrecordswithstructure /*anywheresoftware.b4a.objects.collections.List*/ (anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)("id"),(Object)("value"),(Object)("name"),(Object)("open"),(Object)(_dummy._dt_yes_no /*String*/ ),(Object)("nutsornot"),(Object)("name")}),(int) (10));
 //BA.debugLineNum = 32;BA.debugLine="prop.SetData(data)";
_prop._setdata /*b4j.example.wixtreetable*/ (_data);
 //BA.debugLineNum = 34;BA.debugLine="pg.Page.AddRows(prop.Item)";
_pg._page /*b4j.example.wixelement*/ ._addrows /*b4j.example.wixelement*/ (_prop._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 36;BA.debugLine="pg.ui";
_pg._ui /*String*/ ();
 //BA.debugLineNum = 37;BA.debugLine="Dim recid As String";
_recid = "";
 //BA.debugLineNum = 38;BA.debugLine="pg.OnItemClick(\"treetable\", BANano.CallBack(Me, \"";
_pg._onitemclick /*String*/ ("treetable",(com.ab.banano.BANanoObject)(_banano.CallBack(pgtreetable.getObject(),"tree_itemclick",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_recid)}))));
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
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
public static String  _tree_itemclick(String _recid) throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Sub tree_itemclick(recid As String)";
 //BA.debugLineNum = 44;BA.debugLine="recid = pg.CStr(recid)";
_recid = _pg._cstr /*String*/ ((Object)(_recid));
 //BA.debugLineNum = 46;BA.debugLine="pg.Message(recid)";
_pg._message /*String*/ (_recid);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return "";
}
}
