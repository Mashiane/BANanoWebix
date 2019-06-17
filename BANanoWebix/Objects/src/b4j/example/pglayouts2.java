package b4j.example;


import anywheresoftware.b4a.BA;

public class pglayouts2 extends Object{
public static pglayouts2 mostCurrent = new pglayouts2();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.pglayouts2", null);
		ba.loadHtSubs(pglayouts2.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.pglayouts2", ba);
		}
	}
    public static Class<?> getObject() {
		return pglayouts2.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static b4j.example.wixpage _pg = null;
public static b4j.example.main _main = null;
public static b4j.example.pgforms1 _pgforms1 = null;
public static b4j.example.pgforms _pgforms = null;
public static b4j.example.pgtoolbar _pgtoolbar = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.pgmultiview _pgmultiview = null;
public static b4j.example.pglayouts1 _pglayouts1 = null;
public static b4j.example.pglayouts _pglayouts = null;
public static b4j.example.pgdatatable _pgdatatable = null;
public static b4j.example.pglayout _pglayout = null;
public static String  _init() throws Exception{
b4j.example.wixaccordion _acc = null;
b4j.example.wixlayout _lout = null;
b4j.example.wixelement _r1 = null;
b4j.example.wixelement _r2 = null;
b4j.example.wixelement _r3 = null;
b4j.example.wixelement _r4 = null;
 //BA.debugLineNum = 7;BA.debugLine="Sub Init()";
 //BA.debugLineNum = 9;BA.debugLine="pg.Initialize(\"\")";
_pg._initialize /*b4j.example.wixpage*/ (ba,"");
 //BA.debugLineNum = 10;BA.debugLine="pg.Page.SetType(\"wide\")";
_pg._page /*b4j.example.wixelement*/ ._settype /*b4j.example.wixelement*/ ("wide");
 //BA.debugLineNum = 12;BA.debugLine="Dim acc As WixAccordion";
_acc = new b4j.example.wixaccordion();
 //BA.debugLineNum = 13;BA.debugLine="acc.Initialize(\"va\")";
_acc._initialize /*b4j.example.wixaccordion*/ (ba,"va");
 //BA.debugLineNum = 14;BA.debugLine="acc.Accordion.SetWidth(300)";
_acc._accordion /*b4j.example.wixelement*/ ._setwidth /*b4j.example.wixelement*/ ((int) (300));
 //BA.debugLineNum = 15;BA.debugLine="acc.Accordion.SetTypeWide";
_acc._accordion /*b4j.example.wixelement*/ ._settypewide /*b4j.example.wixelement*/ ();
 //BA.debugLineNum = 16;BA.debugLine="acc.AddItem(\"\",\"Babylon 5\",\"Sheridan<br>Delenn<br";
_acc._additem /*b4j.example.wixelement*/ ("","Babylon 5","Sheridan<br>Delenn<br>Garibaldi<br>G'Kar<br>Londo",(int) (0),anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 17;BA.debugLine="acc.AddItem(\"\",\"Star Trek\",\"Kirk<br>Sisko<br>Arch";
_acc._additem /*b4j.example.wixelement*/ ("","Star Trek","Kirk<br>Sisko<br>Archer<br>Picard<br>Janeway",(int) (0),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 18;BA.debugLine="acc.AddItem(\"\",\"Stargate SG-1\",\"O'Neill<br>Danial";
_acc._additem /*b4j.example.wixelement*/ ("","Stargate SG-1","O'Neill<br>Danial<br>Carter<br>Teal'c",(int) (0),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 20;BA.debugLine="acc.Accordion.AddToColumns(pg.Page)";
_acc._accordion /*b4j.example.wixelement*/ ._addtocolumns /*b4j.example.wixelement*/ (_pg._page /*b4j.example.wixelement*/ );
 //BA.debugLineNum = 22;BA.debugLine="Dim lout As WixLayout";
_lout = new b4j.example.wixlayout();
 //BA.debugLineNum = 23;BA.debugLine="lout.Initialize(\"\")";
_lout._initialize /*b4j.example.wixlayout*/ (ba,"");
 //BA.debugLineNum = 24;BA.debugLine="lout.Layout.SetTypeWide";
_lout._layout /*b4j.example.wixelement*/ ._settypewide /*b4j.example.wixelement*/ ();
 //BA.debugLineNum = 25;BA.debugLine="Dim r1 As WixElement";
_r1 = new b4j.example.wixelement();
 //BA.debugLineNum = 26;BA.debugLine="r1.Initialize(\"\").SetTemplate(\"Row-1\").AddToRows(";
_r1._initialize /*b4j.example.wixelement*/ (ba,"")._settemplate /*b4j.example.wixelement*/ ("Row-1")._addtorows /*String*/ (_lout._layout /*b4j.example.wixelement*/ );
 //BA.debugLineNum = 27;BA.debugLine="Dim r2 As WixElement";
_r2 = new b4j.example.wixelement();
 //BA.debugLineNum = 28;BA.debugLine="r2.Initialize(\"\").SetTemplate(\"Row-2\").AddToRows(";
_r2._initialize /*b4j.example.wixelement*/ (ba,"")._settemplate /*b4j.example.wixelement*/ ("Row-2")._addtorows /*String*/ (_lout._layout /*b4j.example.wixelement*/ );
 //BA.debugLineNum = 30;BA.debugLine="lout.Layout.AddRowsSpacer";
_lout._layout /*b4j.example.wixelement*/ ._addrowsspacer /*String*/ ();
 //BA.debugLineNum = 32;BA.debugLine="Dim r3 As WixElement";
_r3 = new b4j.example.wixelement();
 //BA.debugLineNum = 33;BA.debugLine="r3.Initialize(\"\").SetTemplate(\"Row-3\").AddToRows(";
_r3._initialize /*b4j.example.wixelement*/ (ba,"")._settemplate /*b4j.example.wixelement*/ ("Row-3")._addtorows /*String*/ (_lout._layout /*b4j.example.wixelement*/ );
 //BA.debugLineNum = 34;BA.debugLine="Dim r4 As WixElement";
_r4 = new b4j.example.wixelement();
 //BA.debugLineNum = 35;BA.debugLine="r4.Initialize(\"\").SetTemplate(\"Row-4\").AddToRows(";
_r4._initialize /*b4j.example.wixelement*/ (ba,"")._settemplate /*b4j.example.wixelement*/ ("Row-4")._addtorows /*String*/ (_lout._layout /*b4j.example.wixelement*/ );
 //BA.debugLineNum = 36;BA.debugLine="lout.Layout.AddToColumns(pg.Page)";
_lout._layout /*b4j.example.wixelement*/ ._addtocolumns /*b4j.example.wixelement*/ (_pg._page /*b4j.example.wixelement*/ );
 //BA.debugLineNum = 37;BA.debugLine="pg.ui";
_pg._ui /*String*/ ();
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private pg As WixPage";
_pg = new b4j.example.wixpage();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
}
