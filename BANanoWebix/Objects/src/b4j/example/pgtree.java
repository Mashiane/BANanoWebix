package b4j.example;


import anywheresoftware.b4a.BA;

public class pgtree extends Object{
public static pgtree mostCurrent = new pgtree();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.pgtree", null);
		ba.loadHtSubs(pgtree.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.pgtree", ba);
		}
	}
    public static Class<?> getObject() {
		return pgtree.class;
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
public static b4j.example.pgtreetable _pgtreetable = null;
public static b4j.example.pgmenu _pgmenu = null;
public static b4j.example.pgsidebar _pgsidebar = null;
public static b4j.example.pgcomments _pgcomments = null;
public static String  _init() throws Exception{
b4j.example.wixtree _prop = null;
anywheresoftware.b4a.objects.collections.List _data = null;
String _recid = "";
 //BA.debugLineNum = 8;BA.debugLine="Sub Init";
 //BA.debugLineNum = 9;BA.debugLine="pg.Initialize(\"forms\").SetHeader(\"Lesson 13: Tree";
_pg._initialize /*b4j.example.wixpage*/ (ba,"forms")._setheader /*b4j.example.wixpage*/ ("Lesson 13: Tree");
 //BA.debugLineNum = 11;BA.debugLine="Dim prop As WixTree";
_prop = new b4j.example.wixtree();
 //BA.debugLineNum = 12;BA.debugLine="prop.Initialize(\"tree\").SetSelect(True).Setborder";
_prop._initialize /*b4j.example.wixtree*/ (ba,"tree")._setselect /*b4j.example.wixtree*/ (anywheresoftware.b4a.keywords.Common.True)._setborderless /*b4j.example.wixtree*/ (anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 13;BA.debugLine="prop.SetStyle(\"margin\", \"10px\")";
_prop._setstyle /*b4j.example.wixtree*/ ("margin","10px");
 //BA.debugLineNum = 14;BA.debugLine="prop.SetTypeLineTree   ' show the line between it";
_prop._settypelinetree /*b4j.example.wixtree*/ ();
 //BA.debugLineNum = 15;BA.debugLine="prop.SetGroupBy(\"#year#\")  ' still buggy...";
_prop._setgroupby /*b4j.example.wixtree*/ ("#year#");
 //BA.debugLineNum = 18;BA.debugLine="Dim data As List";
_data = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 19;BA.debugLine="data.Initialize";
_data.Initialize();
 //BA.debugLineNum = 20;BA.debugLine="data.Add(CreateMap(\"id\":1, \"value\":\"The Shawshank";
_data.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(1),(Object)("value"),(Object)("The Shawshank Redemption"),(Object)("year"),(Object)(1994),(Object)("votes"),(Object)(678790),(Object)("rating"),(Object)(9.2),(Object)("rank"),(Object)(1)}).getObject()));
 //BA.debugLineNum = 21;BA.debugLine="data.Add(CreateMap(\"id\":2, \"value\":\"The Godfather";
_data.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(2),(Object)("value"),(Object)("The Godfather"),(Object)("year"),(Object)(1972),(Object)("votes"),(Object)(511495),(Object)("rating"),(Object)(9.2),(Object)("rank"),(Object)(2)}).getObject()));
 //BA.debugLineNum = 22;BA.debugLine="data.Add(CreateMap(\"id\":3, \"value\":\"The Godfather";
_data.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(3),(Object)("value"),(Object)("The Godfather: Part II"),(Object)("year"),(Object)(1974),(Object)("votes"),(Object)(319352),(Object)("rating"),(Object)(9.0),(Object)("rank"),(Object)(3)}).getObject()));
 //BA.debugLineNum = 23;BA.debugLine="data.Add(CreateMap(\"id\":4, \"value\":\"The Good, the";
_data.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(4),(Object)("value"),(Object)("The Good, the Bad And the Ugly"),(Object)("year"),(Object)(1966),(Object)("votes"),(Object)(213030),(Object)("rating"),(Object)(8.9),(Object)("rank"),(Object)(4)}).getObject()));
 //BA.debugLineNum = 24;BA.debugLine="data.Add(CreateMap(\"id\":5, \"value\":\"Pulp fiction\"";
_data.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(5),(Object)("value"),(Object)("Pulp fiction"),(Object)("year"),(Object)(1994),(Object)("votes"),(Object)(533848),(Object)("rating"),(Object)(8.9),(Object)("rank"),(Object)(5)}).getObject()));
 //BA.debugLineNum = 25;BA.debugLine="data.Add(CreateMap(\"id\":6, \"value\":\"12 Angry Men\"";
_data.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(6),(Object)("value"),(Object)("12 Angry Men"),(Object)("year"),(Object)(1957),(Object)("votes"),(Object)(164558),(Object)("rating"),(Object)(8.9),(Object)("rank"),(Object)(6)}).getObject()));
 //BA.debugLineNum = 27;BA.debugLine="prop.SetData(data)";
_prop._setdata /*b4j.example.wixtree*/ (_data);
 //BA.debugLineNum = 29;BA.debugLine="pg.Page.AddRows(prop.Item)";
_pg._page /*b4j.example.wixelement*/ ._addrows /*b4j.example.wixelement*/ (_prop._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 32;BA.debugLine="pg.ui";
_pg._ui /*String*/ ();
 //BA.debugLineNum = 34;BA.debugLine="pg.AddNode(\"tree\", CreateMap(\"id\":7, \"value\":\"Mas";
_pg._addnode /*String*/ ("tree",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(7),(Object)("value"),(Object)("Mashy"),(Object)("year"),(Object)(1973)}));
 //BA.debugLineNum = 35;BA.debugLine="pg.AddChildNode(\"tree\",\"7\", CreateMap(\"id\":8,\"val";
_pg._addchildnode /*String*/ ("tree","7",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(8),(Object)("value"),(Object)("Ozzie"),(Object)("year"),(Object)(2003)}));
 //BA.debugLineNum = 36;BA.debugLine="pg.Refresh(\"tree\")";
_pg._refresh /*String*/ ("tree");
 //BA.debugLineNum = 38;BA.debugLine="Dim recid As String";
_recid = "";
 //BA.debugLineNum = 39;BA.debugLine="pg.OnItemClick(\"tree\", BANano.CallBack(Me, \"tree_";
_pg._onitemclick /*String*/ ("tree",(com.ab.banano.BANanoObject)(_banano.CallBack(pgtree.getObject(),"tree_itemclick",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_recid)}))));
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
 //BA.debugLineNum = 42;BA.debugLine="Sub tree_itemclick(recid As String)";
 //BA.debugLineNum = 43;BA.debugLine="recid = pg.CStr(recid)";
_recid = _pg._cstr /*String*/ ((Object)(_recid));
 //BA.debugLineNum = 45;BA.debugLine="pg.Message(recid)";
_pg._message /*String*/ (_recid);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return "";
}
}
