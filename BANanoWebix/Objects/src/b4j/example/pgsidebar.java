package b4j.example;


import anywheresoftware.b4a.BA;

public class pgsidebar extends Object{
public static pgsidebar mostCurrent = new pgsidebar();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.pgsidebar", null);
		ba.loadHtSubs(pgsidebar.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.pgsidebar", ba);
		}
	}
    public static Class<?> getObject() {
		return pgsidebar.class;
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
public static b4j.example.pgunitlist _pgunitlist = null;
public static b4j.example.pgpropertysheet _pgpropertysheet = null;
public static b4j.example.pgtreetable _pgtreetable = null;
public static b4j.example.pgcomments _pgcomments = null;
public static b4j.example.pggrouplist _pggrouplist = null;
public static b4j.example.pgcontext _pgcontext = null;
public static b4j.example.pggooglemap _pggooglemap = null;
public static b4j.example.pguploader1 _pguploader1 = null;
public static String  _init() throws Exception{
b4j.example.wixrow _r1 = null;
b4j.example.wixtoolbar _tblbar = null;
b4j.example.wixsidebar _sm = null;
b4j.example.wixrow _r2 = null;
anywheresoftware.b4a.objects.collections.Map _meid = null;
 //BA.debugLineNum = 7;BA.debugLine="Sub Init";
 //BA.debugLineNum = 8;BA.debugLine="pg.Initialize(\"forms\")";
_pg._initialize /*b4j.example.wixpage*/ (ba,"forms");
 //BA.debugLineNum = 9;BA.debugLine="Dim R1 As WixRow";
_r1 = new b4j.example.wixrow();
 //BA.debugLineNum = 10;BA.debugLine="R1.Initialize(\"R1\")";
_r1._initialize /*b4j.example.wixrow*/ (ba,"R1");
 //BA.debugLineNum = 13;BA.debugLine="Dim tblBar As WixToolBar";
_tblbar = new b4j.example.wixtoolbar();
 //BA.debugLineNum = 14;BA.debugLine="tblBar.Initialize(\"tblBar\")";
_tblbar._initialize /*b4j.example.wixtoolbar*/ (ba,"tblBar");
 //BA.debugLineNum = 15;BA.debugLine="tblBar.CreateIcon(\"menuopen\").SetIcon(\"mdi mdi-me";
_tblbar._createicon /*b4j.example.wixicon*/ ("menuopen")._seticon /*b4j.example.wixicon*/ ("mdi mdi-menu")._setclick /*b4j.example.wixicon*/ ((com.ab.banano.BANanoObject)(_banano.CallBack(pgsidebar.getObject(),"OpenMenu",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)))))._pop /*String*/ ();
 //BA.debugLineNum = 16;BA.debugLine="tblBar.CreateLabel(\"heading\").SetLabel(\"Lesson 16";
_tblbar._createlabel /*b4j.example.wixlabel*/ ("heading")._setlabel /*b4j.example.wixlabel*/ ("Lesson 16: Side Bar")._pop /*String*/ ();
 //BA.debugLineNum = 17;BA.debugLine="tblBar.AddSpacer";
_tblbar._addspacer /*b4j.example.wixtoolbar*/ ();
 //BA.debugLineNum = 18;BA.debugLine="tblBar.CreateIcon(\"\").SetIcon(\"mdi mdi-comment\").";
_tblbar._createicon /*b4j.example.wixicon*/ ("")._seticon /*b4j.example.wixicon*/ ("mdi mdi-comment")._setbadge /*b4j.example.wixicon*/ ("4")._pop /*String*/ ();
 //BA.debugLineNum = 19;BA.debugLine="tblBar.CreateIcon(\"\").SetIcon(\"mdi mdi-bell\").Set";
_tblbar._createicon /*b4j.example.wixicon*/ ("")._seticon /*b4j.example.wixicon*/ ("mdi mdi-bell")._setbadge /*b4j.example.wixicon*/ ("10")._pop /*String*/ ();
 //BA.debugLineNum = 20;BA.debugLine="tblBar.setPadding(3)";
_tblbar._setpadding /*b4j.example.wixtoolbar*/ (BA.NumberToString(3));
 //BA.debugLineNum = 23;BA.debugLine="R1.AddRows(tblBar.Item)";
_r1._addrows /*b4j.example.wixrow*/ (_tblbar._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 26;BA.debugLine="Dim sm As WixSideBar";
_sm = new b4j.example.wixsidebar();
 //BA.debugLineNum = 27;BA.debugLine="sm.Initialize(\"sm\").SetPositionRight(\"\").SetColla";
_sm._initialize /*b4j.example.wixsidebar*/ (ba,"sm")._setpositionright /*b4j.example.wixsidebar*/ ("")._setcollapsed /*b4j.example.wixsidebar*/ (anywheresoftware.b4a.keywords.Common.True)._setactivetitle /*b4j.example.wixsidebar*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 29;BA.debugLine="sm.AddItem(\"\", \"dashboard\", \"Dashboards\",\"\",\"mdi";
_sm._additem /*b4j.example.wixsidebar*/ ("","dashboard","Dashboards","","mdi mdi-view-dashboard","2","");
 //BA.debugLineNum = 30;BA.debugLine="sm.AddItem(\"dashboard\", \"dashboard1\", \"Dashboard";
_sm._additem /*b4j.example.wixsidebar*/ ("dashboard","dashboard1","Dashboard 1","","mdi mdi-view-dashboard","","");
 //BA.debugLineNum = 31;BA.debugLine="sm.AddItem(\"dashboard\", \"dashboard2\", \"Dashboard";
_sm._additem /*b4j.example.wixsidebar*/ ("dashboard","dashboard2","Dashboard 2","","mdi mdi-view-dashboard","","");
 //BA.debugLineNum = 33;BA.debugLine="sm.AddItem(\"\", \"layouts\", \"Layouts\", \"\", \"mdi mdi";
_sm._additem /*b4j.example.wixsidebar*/ ("","layouts","Layouts","","mdi mdi-view-column","","");
 //BA.debugLineNum = 34;BA.debugLine="sm.AddItem(\"layouts\", \"accordions\", \"Accordions\",";
_sm._additem /*b4j.example.wixsidebar*/ ("layouts","accordions","Accordions","","mdi mdi-view-column","","");
 //BA.debugLineNum = 35;BA.debugLine="sm.AddItem(\"layouts\", \"portlets\", \"Portlets\", \"\",";
_sm._additem /*b4j.example.wixsidebar*/ ("layouts","portlets","Portlets","","mdi mdi-view-column","","");
 //BA.debugLineNum = 37;BA.debugLine="sm.AddItem(\"\", \"tables\", \"Data Tables\", \"\", \"mdi";
_sm._additem /*b4j.example.wixsidebar*/ ("","tables","Data Tables","","mdi mdi-table","","");
 //BA.debugLineNum = 38;BA.debugLine="sm.AddItem(\"\", \"uis\", \"UI Components\", \"\", \"mdi m";
_sm._additem /*b4j.example.wixsidebar*/ ("","uis","UI Components","","mdi mdi-puzzle","","");
 //BA.debugLineNum = 41;BA.debugLine="Dim R2 As WixRow";
_r2 = new b4j.example.wixrow();
 //BA.debugLineNum = 42;BA.debugLine="R2.Initialize(\"R2\")";
_r2._initialize /*b4j.example.wixrow*/ (ba,"R2");
 //BA.debugLineNum = 44;BA.debugLine="R2.AddColumns(sm.Item)";
_r2._addcolumns /*b4j.example.wixrow*/ (_sm._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 45;BA.debugLine="R2.AddColumns(CreateMap())";
_r2._addcolumns /*b4j.example.wixrow*/ (anywheresoftware.b4a.keywords.Common.createMap(new Object[] {}));
 //BA.debugLineNum = 47;BA.debugLine="pg.Page.AddRow(R1)";
_pg._page /*b4j.example.wixelement*/ ._addrow /*String*/ (_r1);
 //BA.debugLineNum = 48;BA.debugLine="pg.Page.AddRow(R2)";
_pg._page /*b4j.example.wixelement*/ ._addrow /*String*/ (_r2);
 //BA.debugLineNum = 50;BA.debugLine="pg.ui";
_pg._ui /*String*/ ();
 //BA.debugLineNum = 52;BA.debugLine="Dim meid As Map";
_meid = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 53;BA.debugLine="pg.OnItemClick(\"sm\", BANano.CallBack(Me, \"itemCli";
_pg._onitemclick /*String*/ ("sm",(com.ab.banano.BANanoObject)(_banano.CallBack(pgsidebar.getObject(),"itemClick",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_meid.getObject())}))));
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return "";
}
public static String  _itemclick(String _meid) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub itemClick(meID As String)";
 //BA.debugLineNum = 58;BA.debugLine="pg.Message(meID)";
_pg._message /*String*/ (_meid);
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return "";
}
public static String  _openmenu() throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub OpenMenu()";
 //BA.debugLineNum = 62;BA.debugLine="pg.Toggle(\"sm\")";
_pg._toggle /*String*/ ("sm");
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private pg As WixPage";
_pg = new b4j.example.wixpage();
 //BA.debugLineNum = 4;BA.debugLine="Public BANano As BANano";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
}
