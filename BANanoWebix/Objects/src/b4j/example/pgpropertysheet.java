package b4j.example;


import anywheresoftware.b4a.BA;

public class pgpropertysheet extends Object{
public static pgpropertysheet mostCurrent = new pgpropertysheet();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.pgpropertysheet", null);
		ba.loadHtSubs(pgpropertysheet.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.pgpropertysheet", ba);
		}
	}
    public static Class<?> getObject() {
		return pgpropertysheet.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static b4j.example.wixpage _pg = null;
public static com.ab.banano.BANano _banano = null;
public static b4j.example.main _main = null;
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
public static b4j.example.pgdataview _pgdataview = null;
public static b4j.example.pglist _pglist = null;
public static b4j.example.pgunitlist _pgunitlist = null;
public static b4j.example.pgtree _pgtree = null;
public static b4j.example.pgtreetable _pgtreetable = null;
public static String  _init() throws Exception{
b4j.example.wixproperty _prop = null;
 //BA.debugLineNum = 8;BA.debugLine="Sub Init";
 //BA.debugLineNum = 9;BA.debugLine="pg.Initialize(\"forms\").SetHeader(\"Lesson 12: Prop";
_pg._initialize /*b4j.example.wixpage*/ (ba,"forms")._setheader /*b4j.example.wixpage*/ ("Lesson 12: Property [Sheet]");
 //BA.debugLineNum = 11;BA.debugLine="Dim prop As WixProperty";
_prop = new b4j.example.wixproperty();
 //BA.debugLineNum = 12;BA.debugLine="prop.Initialize(\"prop\").setwidth(260).Setheight(1";
_prop._initialize /*b4j.example.wixproperty*/ (ba,"prop")._setwidth /*b4j.example.wixproperty*/ ((int) (260))._setheight /*b4j.example.wixproperty*/ ((int) (112))._setnamewidth /*b4j.example.wixproperty*/ ((int) (120))._setborderless /*b4j.example.wixproperty*/ (anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 13;BA.debugLine="prop.SetStyle(\"margin\", \"10px\")";
_prop._setstyle /*b4j.example.wixproperty*/ ("margin","10px");
 //BA.debugLineNum = 15;BA.debugLine="prop.AddLabel(\"Baseball Player\")";
_prop._addlabel /*String*/ ("Baseball Player");
 //BA.debugLineNum = 16;BA.debugLine="prop.AddTextBox(\"Name\")";
_prop._addtextbox /*String*/ ("Name");
 //BA.debugLineNum = 17;BA.debugLine="prop.AddSelect(\"Position\", Array(\"1B\", \"2B\", \"3B\"";
_prop._addselect /*String*/ ("Position",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("1B"),(Object)("2B"),(Object)("3B"),(Object)("LF"),(Object)("CF"),(Object)("RF"),(Object)("SS"),(Object)("C"),(Object)("P")}));
 //BA.debugLineNum = 18;BA.debugLine="prop.AddCheckBox(\"Injured?\")";
_prop._addcheckbox /*String*/ ("Injured?");
 //BA.debugLineNum = 20;BA.debugLine="pg.Page.AddRows(prop.Item)";
_pg._page /*b4j.example.wixelement*/ ._addrows /*b4j.example.wixelement*/ (_prop._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 22;BA.debugLine="pg.ui";
_pg._ui /*String*/ ();
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
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
}
