package b4j.example;


import anywheresoftware.b4a.BA;

public class pgtabbar extends Object{
public static pgtabbar mostCurrent = new pgtabbar();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.pgtabbar", null);
		ba.loadHtSubs(pgtabbar.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.pgtabbar", ba);
		}
	}
    public static Class<?> getObject() {
		return pgtabbar.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static b4j.example.wixpage _pg = null;
public static b4j.example.main _main = null;
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
b4j.example.wixrow _r2 = null;
b4j.example.wixtabbar _tb = null;
anywheresoftware.b4a.objects.collections.List _data = null;
b4j.example.wixlist _lst = null;
b4j.example.wixlayout _frm = null;
b4j.example.wixelement _l1 = null;
b4j.example.wixlayout _frm1 = null;
b4j.example.wixelement _l2 = null;
 //BA.debugLineNum = 6;BA.debugLine="Sub Init";
 //BA.debugLineNum = 7;BA.debugLine="pg.Initialize(\"\").SetHeader(\"Lesson 21: TabBar\")";
_pg._initialize /*b4j.example.wixpage*/ (ba,"")._setheader /*b4j.example.wixpage*/ ("Lesson 21: TabBar");
 //BA.debugLineNum = 9;BA.debugLine="Dim R1 As WixRow";
_r1 = new b4j.example.wixrow();
 //BA.debugLineNum = 10;BA.debugLine="R1.Initialize(\"R1\")";
_r1._initialize /*b4j.example.wixrow*/ (ba,"R1");
 //BA.debugLineNum = 12;BA.debugLine="Dim R2 As WixRow";
_r2 = new b4j.example.wixrow();
 //BA.debugLineNum = 13;BA.debugLine="R2.Initialize(\"R2\")";
_r2._initialize /*b4j.example.wixrow*/ (ba,"R2");
 //BA.debugLineNum = 16;BA.debugLine="Dim tb As WixTabBar";
_tb = new b4j.example.wixtabbar();
 //BA.debugLineNum = 17;BA.debugLine="tb.Initialize(\"tb\").SetHeight(60).SetTypeBottom(T";
_tb._initialize /*b4j.example.wixtabbar*/ (ba,"tb")._setheight /*b4j.example.wixtabbar*/ ((int) (60))._settypebottom /*b4j.example.wixtabbar*/ (anywheresoftware.b4a.keywords.Common.True)._setmultiview /*b4j.example.wixtabbar*/ (anywheresoftware.b4a.keywords.Common.True)._setanimate /*b4j.example.wixtabbar*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 18;BA.debugLine="tb.AddItem(\"listView\", \"List\", \"wxi-file\")";
_tb._additem /*String*/ ("listView","List","wxi-file");
 //BA.debugLineNum = 19;BA.debugLine="tb.AddItem(\"formView\", \"Form\", \"wxi-columns\")";
_tb._additem /*String*/ ("formView","Form","wxi-columns");
 //BA.debugLineNum = 20;BA.debugLine="tb.AddItem(\"aboutView\", \"About\", \"wxi-alert\")";
_tb._additem /*String*/ ("aboutView","About","wxi-alert");
 //BA.debugLineNum = 23;BA.debugLine="Dim data As List";
_data = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 24;BA.debugLine="data.Initialize";
_data.Initialize();
 //BA.debugLineNum = 25;BA.debugLine="data.Add(CreateMap(\"id\":1, \"value\":\"The Shawshank";
_data.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(1),(Object)("value"),(Object)("The Shawshank Redemption"),(Object)("year"),(Object)(1994),(Object)("votes"),(Object)(678790),(Object)("rating"),(Object)(9.2),(Object)("rank"),(Object)(1)}).getObject()));
 //BA.debugLineNum = 26;BA.debugLine="data.Add(CreateMap(\"id\":2, \"value\":\"The Godfather";
_data.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(2),(Object)("value"),(Object)("The Godfather"),(Object)("year"),(Object)(1972),(Object)("votes"),(Object)(511495),(Object)("rating"),(Object)(9.2),(Object)("rank"),(Object)(2)}).getObject()));
 //BA.debugLineNum = 27;BA.debugLine="data.Add(CreateMap(\"id\":3, \"value\":\"The Godfather";
_data.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(3),(Object)("value"),(Object)("The Godfather: Part II"),(Object)("year"),(Object)(1974),(Object)("votes"),(Object)(319352),(Object)("rating"),(Object)(9.0),(Object)("rank"),(Object)(3)}).getObject()));
 //BA.debugLineNum = 28;BA.debugLine="data.Add(CreateMap(\"id\":4, \"value\":\"The Good, the";
_data.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(4),(Object)("value"),(Object)("The Good, the Bad And the Ugly"),(Object)("year"),(Object)(1966),(Object)("votes"),(Object)(213030),(Object)("rating"),(Object)(8.9),(Object)("rank"),(Object)(4)}).getObject()));
 //BA.debugLineNum = 29;BA.debugLine="data.Add(CreateMap(\"id\":5, \"value\":\"Pulp fiction\"";
_data.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(5),(Object)("value"),(Object)("Pulp fiction"),(Object)("year"),(Object)(1994),(Object)("votes"),(Object)(533848),(Object)("rating"),(Object)(8.9),(Object)("rank"),(Object)(5)}).getObject()));
 //BA.debugLineNum = 30;BA.debugLine="data.Add(CreateMap(\"id\":6, \"value\":\"12 Angry Men\"";
_data.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(6),(Object)("value"),(Object)("12 Angry Men"),(Object)("year"),(Object)(1957),(Object)("votes"),(Object)(164558),(Object)("rating"),(Object)(8.9),(Object)("rank"),(Object)(6)}).getObject()));
 //BA.debugLineNum = 32;BA.debugLine="Dim lst As WixList";
_lst = new b4j.example.wixlist();
 //BA.debugLineNum = 33;BA.debugLine="lst.Initialize(\"listView\").SetItemHeight(60)";
_lst._initialize /*b4j.example.wixlist*/ (ba,"listView")._setitemheight /*b4j.example.wixlist*/ ((Object)(60));
 //BA.debugLineNum = 34;BA.debugLine="lst.SetTemplate(\"#rank#. #value# <div style='padd";
_lst._settemplate /*b4j.example.wixlist*/ ("#rank#. #value# <div style='padding-left:18px'> Year:#year#, votes:#votes# </div>");
 //BA.debugLineNum = 35;BA.debugLine="lst.SetSelect(True).SetData(data)";
_lst._setselect /*b4j.example.wixlist*/ (anywheresoftware.b4a.keywords.Common.True)._setdata /*b4j.example.wixlist*/ (_data);
 //BA.debugLineNum = 37;BA.debugLine="Dim frm As WixLayout";
_frm = new b4j.example.wixlayout();
 //BA.debugLineNum = 38;BA.debugLine="frm.Initialize(\"formView\")";
_frm._initialize /*b4j.example.wixlayout*/ (ba,"formView");
 //BA.debugLineNum = 39;BA.debugLine="Dim l1 As WixElement";
_l1 = new b4j.example.wixelement();
 //BA.debugLineNum = 40;BA.debugLine="l1.Initialize(\"l1\").SetTemplate(\"Put form content";
_l1._initialize /*b4j.example.wixelement*/ (ba,"l1")._settemplate /*b4j.example.wixelement*/ ((Object)("Put form contents here..."));
 //BA.debugLineNum = 41;BA.debugLine="frm.Layout.SetTypeWide";
_frm._layout /*b4j.example.wixelement*/ ._settypewide /*b4j.example.wixelement*/ ();
 //BA.debugLineNum = 42;BA.debugLine="frm.Layout.AddColumns(l1.item)";
_frm._layout /*b4j.example.wixelement*/ ._addcolumns /*b4j.example.wixelement*/ (_l1._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 44;BA.debugLine="Dim frm1 As WixLayout";
_frm1 = new b4j.example.wixlayout();
 //BA.debugLineNum = 45;BA.debugLine="frm1.Initialize(\"aboutView\")";
_frm1._initialize /*b4j.example.wixlayout*/ (ba,"aboutView");
 //BA.debugLineNum = 46;BA.debugLine="Dim l2 As WixElement";
_l2 = new b4j.example.wixelement();
 //BA.debugLineNum = 47;BA.debugLine="l2.Initialize(\"l2\").SetTemplate(\"About TabBar...\"";
_l2._initialize /*b4j.example.wixelement*/ (ba,"l2")._settemplate /*b4j.example.wixelement*/ ((Object)("About TabBar..."));
 //BA.debugLineNum = 48;BA.debugLine="frm1.Layout.SetTypeWide";
_frm1._layout /*b4j.example.wixelement*/ ._settypewide /*b4j.example.wixelement*/ ();
 //BA.debugLineNum = 49;BA.debugLine="frm1.Layout.AddColumns(l2.item)";
_frm1._layout /*b4j.example.wixelement*/ ._addcolumns /*b4j.example.wixelement*/ (_l2._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 51;BA.debugLine="R1.AddCells(lst.Item)";
_r1._addcells /*b4j.example.wixrow*/ (_lst._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 52;BA.debugLine="R1.AddCells(frm.Item)";
_r1._addcells /*b4j.example.wixrow*/ (_frm._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 53;BA.debugLine="R1.AddCells(frm1.Item)";
_r1._addcells /*b4j.example.wixrow*/ (_frm1._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 56;BA.debugLine="R2.AddItem(tb.Item)";
_r2._additem /*b4j.example.wixrow*/ (_tb._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 58;BA.debugLine="pg.AddRow(R1)";
_pg._addrow /*String*/ (_r1);
 //BA.debugLineNum = 59;BA.debugLine="pg.AddRow(R2)";
_pg._addrow /*String*/ (_r2);
 //BA.debugLineNum = 61;BA.debugLine="pg.ui";
_pg._ui /*String*/ ();
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
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
