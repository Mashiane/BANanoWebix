package b4j.example;


import anywheresoftware.b4a.BA;

public class pglayout extends Object{
public static pglayout mostCurrent = new pglayout();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.pglayout", null);
		ba.loadHtSubs(pglayout.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.pglayout", ba);
		}
	}
    public static Class<?> getObject() {
		return pglayout.class;
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
public static b4j.example.pglist _pglist = null;
public static b4j.example.pgunitlist _pgunitlist = null;
public static b4j.example.pgpropertysheet _pgpropertysheet = null;
public static b4j.example.pgtree _pgtree = null;
public static b4j.example.pgtreetable _pgtreetable = null;
public static b4j.example.pgmenu _pgmenu = null;
public static b4j.example.pgsidebar _pgsidebar = null;
public static b4j.example.pgcomments _pgcomments = null;
public static String  _init() throws Exception{
com.ab.banano.BANanoEvent _e = null;
b4j.example.wixelement _r1 = null;
b4j.example.wixelement _r2 = null;
b4j.example.wixelement _r3 = null;
b4j.example.wixelement _r3c1 = null;
b4j.example.wixelement _r3c2 = null;
b4j.example.wixelement _r3c3 = null;
b4j.example.wixelement _r4 = null;
b4j.example.wixelement _r5 = null;
b4j.example.wixelement _r5c1 = null;
b4j.example.wixelement _r5c2 = null;
 //BA.debugLineNum = 14;BA.debugLine="Public Sub Init()";
 //BA.debugLineNum = 15;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 17;BA.debugLine="pg.Initialize(\"mylay\")";
_pg._initialize /*b4j.example.wixpage*/ (ba,"mylay");
 //BA.debugLineNum = 18;BA.debugLine="pg.Page.SetView(\"layout\")";
_pg._page /*b4j.example.wixelement*/ ._setview /*b4j.example.wixelement*/ ("layout");
 //BA.debugLineNum = 19;BA.debugLine="pg.Page.SetType(\"wide\")";
_pg._page /*b4j.example.wixelement*/ ._settype /*b4j.example.wixelement*/ ("wide");
 //BA.debugLineNum = 22;BA.debugLine="Dim R1 As WixElement";
_r1 = new b4j.example.wixelement();
 //BA.debugLineNum = 23;BA.debugLine="R1.Initialize(\"R1\").SetType(\"header\").SetTemplate";
_r1._initialize /*b4j.example.wixelement*/ (ba,"R1")._settype /*b4j.example.wixelement*/ ("header")._settemplate /*b4j.example.wixelement*/ ((Object)("R1: Hello"))._addtorows /*String*/ (_pg._page /*b4j.example.wixelement*/ );
 //BA.debugLineNum = 25;BA.debugLine="Dim R2 As WixElement";
_r2 = new b4j.example.wixelement();
 //BA.debugLineNum = 26;BA.debugLine="R2.Initialize(\"R2\").SetTemplate(\"R2: Greetings, h";
_r2._initialize /*b4j.example.wixelement*/ (ba,"R2")._settemplate /*b4j.example.wixelement*/ ((Object)("R2: Greetings, human!"))._addtorows /*String*/ (_pg._page /*b4j.example.wixelement*/ );
 //BA.debugLineNum = 28;BA.debugLine="Dim R3 As WixElement";
_r3 = new b4j.example.wixelement();
 //BA.debugLineNum = 29;BA.debugLine="R3.Initialize(\"R3\").SetGravity(2)";
_r3._initialize /*b4j.example.wixelement*/ (ba,"R3")._setgravity /*b4j.example.wixelement*/ ((int) (2));
 //BA.debugLineNum = 31;BA.debugLine="Dim R3C1 As WixElement";
_r3c1 = new b4j.example.wixelement();
 //BA.debugLineNum = 32;BA.debugLine="R3C1.Initialize(\"R3C1\").SetCSS(\"col1\").SetTemplat";
_r3c1._initialize /*b4j.example.wixelement*/ (ba,"R3C1")._setcss /*b4j.example.wixelement*/ ("col1")._settemplate /*b4j.example.wixelement*/ ((Object)("R3C1: Webix"))._addtocolumns /*b4j.example.wixelement*/ (_r3);
 //BA.debugLineNum = 34;BA.debugLine="R3.AddResizerToColumns";
_r3._addresizertocolumns /*b4j.example.wixelement*/ ();
 //BA.debugLineNum = 36;BA.debugLine="Dim R3C2 As WixElement";
_r3c2 = new b4j.example.wixelement();
 //BA.debugLineNum = 37;BA.debugLine="R3C2.Initialize(\"R3C2\").SetCSS(\"col2\").SetTemplat";
_r3c2._initialize /*b4j.example.wixelement*/ (ba,"R3C2")._setcss /*b4j.example.wixelement*/ ("col2")._settemplate /*b4j.example.wixelement*/ ((Object)("R3C2: Is"))._addtocolumns /*b4j.example.wixelement*/ (_r3);
 //BA.debugLineNum = 39;BA.debugLine="R3.AddResizerToColumns";
_r3._addresizertocolumns /*b4j.example.wixelement*/ ();
 //BA.debugLineNum = 41;BA.debugLine="Dim R3C3 As WixElement";
_r3c3 = new b4j.example.wixelement();
 //BA.debugLineNum = 42;BA.debugLine="R3C3.Initialize(\"R3C3\").SetCSS(\"col3\").SetTemplat";
_r3c3._initialize /*b4j.example.wixelement*/ (ba,"R3C3")._setcss /*b4j.example.wixelement*/ ("col3")._settemplate /*b4j.example.wixelement*/ ((Object)("R3C3: Cool"))._addtocolumns /*b4j.example.wixelement*/ (_r3);
 //BA.debugLineNum = 44;BA.debugLine="R3.AddToRows(pg.Page)";
_r3._addtorows /*String*/ (_pg._page /*b4j.example.wixelement*/ );
 //BA.debugLineNum = 46;BA.debugLine="Dim R4 As WixElement";
_r4 = new b4j.example.wixelement();
 //BA.debugLineNum = 47;BA.debugLine="R4.Initialize(\"R4\").SetType(\"header\").SetTemplate";
_r4._initialize /*b4j.example.wixelement*/ (ba,"R4")._settype /*b4j.example.wixelement*/ ("header")._settemplate /*b4j.example.wixelement*/ ((Object)("R4: Goodbye"))._addtorows /*String*/ (_pg._page /*b4j.example.wixelement*/ );
 //BA.debugLineNum = 49;BA.debugLine="Dim r5 As WixElement";
_r5 = new b4j.example.wixelement();
 //BA.debugLineNum = 50;BA.debugLine="r5.Initialize(\"R5\").SetHeight(50)";
_r5._initialize /*b4j.example.wixelement*/ (ba,"R5")._setheight /*b4j.example.wixelement*/ ((int) (50));
 //BA.debugLineNum = 52;BA.debugLine="Dim R5C1 As WixElement";
_r5c1 = new b4j.example.wixelement();
 //BA.debugLineNum = 53;BA.debugLine="R5C1.Initialize(\"R5C1\").SetTemplate(\"Fare thee we";
_r5c1._initialize /*b4j.example.wixelement*/ (ba,"R5C1")._settemplate /*b4j.example.wixelement*/ ((Object)("Fare thee well!"))._addtocolumns /*b4j.example.wixelement*/ (_r5);
 //BA.debugLineNum = 55;BA.debugLine="Dim r5c2 As WixElement";
_r5c2 = new b4j.example.wixelement();
 //BA.debugLineNum = 56;BA.debugLine="r5c2.Initialize(\"R5C2\").SetView(\"button\").SetWidt";
_r5c2._initialize /*b4j.example.wixelement*/ (ba,"R5C2")._setview /*b4j.example.wixelement*/ ("button")._setwidth /*b4j.example.wixelement*/ ((int) (150))._settype /*b4j.example.wixelement*/ ("iconButton")._seticon /*b4j.example.wixelement*/ ("users")._setlabel /*b4j.example.wixelement*/ ("Click for fun");
 //BA.debugLineNum = 57;BA.debugLine="r5c2.SetClick(BANano.CallBack(Me,\"r5c2_click\",e))";
_r5c2._setclick /*b4j.example.wixelement*/ ((com.ab.banano.BANanoObject)(_banano.CallBack(pglayout.getObject(),"r5c2_click",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
 //BA.debugLineNum = 58;BA.debugLine="r5c2.AddToColumns(r5)";
_r5c2._addtocolumns /*b4j.example.wixelement*/ (_r5);
 //BA.debugLineNum = 60;BA.debugLine="r5.AddToRows(pg.Page)";
_r5._addtorows /*String*/ (_pg._page /*b4j.example.wixelement*/ );
 //BA.debugLineNum = 62;BA.debugLine="pg.ui";
_pg._ui /*String*/ ();
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
public static String  _r5c2_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Sub r5c2_click(e As BANanoEvent)";
 //BA.debugLineNum = 66;BA.debugLine="pg.ToastError(\"See?<br><br>Wasn't that fun?!\")";
_pg._toasterror /*String*/ ("See?<br><br>Wasn't that fun?!");
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return "";
}
}
