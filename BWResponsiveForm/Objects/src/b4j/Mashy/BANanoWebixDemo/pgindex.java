package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;

public class pgindex extends Object{
public static pgindex mostCurrent = new pgindex();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.pgindex", null);
		ba.loadHtSubs(pgindex.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.Mashy.BANanoWebixDemo.pgindex", ba);
		}
	}
    public static Class<?> getObject() {
		return pgindex.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static b4j.Mashy.BANanoWebixDemo.wixpage _pg = null;
public static com.ab.banano.BANano _banano = null;
public static b4j.Mashy.BANanoWebixDemo.main _main = null;
public static b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public static b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public static b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public static b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public static String  _init(String _pgcontainer) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixtoolbar _tblbar = null;
b4j.Mashy.BANanoWebixDemo.wixrow _r2 = null;
b4j.Mashy.BANanoWebixDemo.wixmultiview _mv = null;
 //BA.debugLineNum = 9;BA.debugLine="Sub Init(pgContainer As String)";
 //BA.debugLineNum = 10;BA.debugLine="pg.Initialize(\"index\", pgContainer)";
_pg._initialize /*b4j.Mashy.BANanoWebixDemo.wixpage*/ (ba,"index",_pgcontainer);
 //BA.debugLineNum = 12;BA.debugLine="Dim tblBar As WixToolBar";
_tblbar = new b4j.Mashy.BANanoWebixDemo.wixtoolbar();
 //BA.debugLineNum = 13;BA.debugLine="tblBar.Initialize(\"tblBar\")";
_tblbar._initialize /*b4j.Mashy.BANanoWebixDemo.wixtoolbar*/ (ba,"tblBar");
 //BA.debugLineNum = 14;BA.debugLine="tblBar.SetHeight(100)";
_tblbar._setheight /*b4j.Mashy.BANanoWebixDemo.wixtoolbar*/ ((int) (100));
 //BA.debugLineNum = 15;BA.debugLine="tblBar.SetStyle(\"background-color\", \"#FF57AB5C\")";
_tblbar._setstyle /*b4j.Mashy.BANanoWebixDemo.wixtoolbar*/ ("background-color","#FF57AB5C");
 //BA.debugLineNum = 17;BA.debugLine="tblBar.CreateIcon(\"menuopen\").SetIcon(\"mdi mdi-me";
_tblbar._createicon /*b4j.Mashy.BANanoWebixDemo.wixicon*/ ("menuopen")._seticon /*b4j.Mashy.BANanoWebixDemo.wixicon*/ ((Object)("mdi mdi-menu"))._setstyles /*b4j.Mashy.BANanoWebixDemo.wixicon*/ (anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("background"),(Object)("#eeeeee")}))._setclick /*b4j.Mashy.BANanoWebixDemo.wixicon*/ ((com.ab.banano.BANanoObject)(_banano.CallBack(pgindex.getObject(),"OpenMenu",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)))))._pop /*String*/ ();
 //BA.debugLineNum = 18;BA.debugLine="tblBar.CreateHeader(\"heading\").SetBorderless(True";
_tblbar._createheader /*b4j.Mashy.BANanoWebixDemo.wixheader*/ ("heading")._setborderless /*b4j.Mashy.BANanoWebixDemo.wixheader*/ (anywheresoftware.b4a.keywords.Common.True)._settemplate /*b4j.Mashy.BANanoWebixDemo.wixheader*/ ((Object)("My Webix App"))._setstyles /*b4j.Mashy.BANanoWebixDemo.wixheader*/ (anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("height"),(Object)("100%"),(Object)("vertical-align"),(Object)("middle !important"),(Object)("font-size"),(Object)("32px !important")}))._pop /*String*/ ();
 //BA.debugLineNum = 19;BA.debugLine="tblBar.AddColumns(CreateMap())";
_tblbar._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixtoolbar*/ (anywheresoftware.b4a.keywords.Common.createMap(new Object[] {}));
 //BA.debugLineNum = 20;BA.debugLine="tblBar.CreateImage(\"logo\").SetWidth(150).SetValue";
_tblbar._createimage /*b4j.Mashy.BANanoWebixDemo.wiximage*/ ("logo")._setwidth /*b4j.Mashy.BANanoWebixDemo.wiximage*/ ((Object)(150))._setvalue /*b4j.Mashy.BANanoWebixDemo.wiximage*/ ((Object)("./assets/pexels-photo-2879991.jpeg"))._pop /*String*/ ();
 //BA.debugLineNum = 22;BA.debugLine="Log(pg.Map2JsonPretty(tblBar.Item))";
anywheresoftware.b4a.keywords.Common.Log(_pg._map2jsonpretty /*String*/ (_tblbar._item /*anywheresoftware.b4a.objects.collections.Map*/ ()));
 //BA.debugLineNum = 25;BA.debugLine="pg.AddRows(tblBar.Item)";
_pg._addrows /*String*/ (_tblbar._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 27;BA.debugLine="Dim R2 As WixRow";
_r2 = new b4j.Mashy.BANanoWebixDemo.wixrow();
 //BA.debugLineNum = 28;BA.debugLine="R2.Initialize(\"R2\")";
_r2._initialize /*b4j.Mashy.BANanoWebixDemo.wixrow*/ (ba,"R2");
 //BA.debugLineNum = 29;BA.debugLine="R2.AddColumns(modSideBar.Create(pg))";
_r2._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixrow*/ (_modsidebar._create /*anywheresoftware.b4a.objects.collections.Map*/ (_pg));
 //BA.debugLineNum = 32;BA.debugLine="Dim mv As WixMultiView";
_mv = new b4j.Mashy.BANanoWebixDemo.wixmultiview();
 //BA.debugLineNum = 33;BA.debugLine="mv.Initialize(\"mymv\")";
_mv._initialize /*b4j.Mashy.BANanoWebixDemo.wixmultiview*/ (ba,"mymv");
 //BA.debugLineNum = 34;BA.debugLine="modClient.AddPage(pg, mv)";
_modclient._addpage /*String*/ (_pg,_mv);
 //BA.debugLineNum = 35;BA.debugLine="modArchivi.AddPage(pg, mv)";
_modarchivi._addpage /*String*/ (_pg,_mv);
 //BA.debugLineNum = 39;BA.debugLine="R2.AddColumns(mv.item)";
_r2._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixrow*/ (_mv._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 40;BA.debugLine="pg.AddRow(R2)";
_pg._addrow /*String*/ (_r2);
 //BA.debugLineNum = 43;BA.debugLine="pg.UI";
_pg._ui /*String*/ ();
 //BA.debugLineNum = 45;BA.debugLine="modClient.showpage(pg)";
_modclient._showpage /*String*/ (_pg);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private pg As WixPage";
_pg = new b4j.Mashy.BANanoWebixDemo.wixpage();
 //BA.debugLineNum = 4;BA.debugLine="Public BANano As BANano";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public static String  _toggle_sidebar() throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Sub toggle_sidebar()";
 //BA.debugLineNum = 50;BA.debugLine="pg.Toggle(\"sb\")";
_pg._toggle /*String*/ ("sb");
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return "";
}
}
