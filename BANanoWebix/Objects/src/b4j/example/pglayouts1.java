package b4j.example;


import anywheresoftware.b4a.BA;

public class pglayouts1 extends Object{
public static pglayouts1 mostCurrent = new pglayouts1();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.pglayouts1", null);
		ba.loadHtSubs(pglayouts1.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.pglayouts1", ba);
		}
	}
    public static Class<?> getObject() {
		return pglayouts1.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static b4j.example.wixpage _pg = null;
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
public static b4j.example.pglayouts2 _pglayouts2 = null;
public static b4j.example.pglayouts _pglayouts = null;
public static b4j.example.pglayout _pglayout = null;
public static b4j.example.pglist _pglist = null;
public static b4j.example.pgunitlist _pgunitlist = null;
public static b4j.example.pgpropertysheet _pgpropertysheet = null;
public static b4j.example.pgtree _pgtree = null;
public static b4j.example.pgtreetable _pgtreetable = null;
public static b4j.example.pgmenu _pgmenu = null;
public static b4j.example.pgsidebar _pgsidebar = null;
public static b4j.example.pgcomments _pgcomments = null;
public static String  _init() throws Exception{
b4j.example.wixaccordion _acc = null;
 //BA.debugLineNum = 7;BA.debugLine="Sub Init()";
 //BA.debugLineNum = 8;BA.debugLine="pg.Initialize(\"\")";
_pg._initialize /*b4j.example.wixpage*/ (ba,"");
 //BA.debugLineNum = 10;BA.debugLine="Dim acc As WixAccordion";
_acc = new b4j.example.wixaccordion();
 //BA.debugLineNum = 11;BA.debugLine="acc.Initialize(\"\")";
_acc._initialize /*b4j.example.wixaccordion*/ (ba,"");
 //BA.debugLineNum = 12;BA.debugLine="acc.SetHorizontal(False)";
_acc._sethorizontal /*b4j.example.wixaccordion*/ (anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 14;BA.debugLine="acc.AddItem(\"\",\"Column 1\",\"Hellow from column 1\",";
_acc._additem /*b4j.example.wixelement*/ ("","Column 1","Hellow from column 1",(int) (200),anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 15;BA.debugLine="acc.AddItem(\"\",\"Column 2\",\"Hellow from column 2\",";
_acc._additem /*b4j.example.wixelement*/ ("","Column 2","Hellow from column 2",(int) (300),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 16;BA.debugLine="acc.AddItem(\"\",\"Column 3\",\"Hellow from column 3\",";
_acc._additem /*b4j.example.wixelement*/ ("","Column 3","Hellow from column 3",(int) (0),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 18;BA.debugLine="pg.Page = acc.Accordion";
_pg._page /*b4j.example.wixelement*/  = _acc._accordion /*b4j.example.wixelement*/ ;
 //BA.debugLineNum = 20;BA.debugLine="pg.ui";
_pg._ui /*String*/ ();
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
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
