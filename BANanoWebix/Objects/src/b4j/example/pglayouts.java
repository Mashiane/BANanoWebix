package b4j.example;


import anywheresoftware.b4a.BA;

public class pglayouts extends Object{
public static pglayouts mostCurrent = new pglayouts();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.pglayouts", null);
		ba.loadHtSubs(pglayouts.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.pglayouts", ba);
		}
	}
    public static Class<?> getObject() {
		return pglayouts.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static b4j.example.wixpage _pg = null;
public static b4j.example.main _main = null;
public static b4j.example.pgforms1 _pgforms1 = null;
public static b4j.example.pgforms _pgforms = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.pgdatatable _pgdatatable = null;
public static b4j.example.pglayout _pglayout = null;
public static String  _init() throws Exception{
b4j.example.wixelement _l1 = null;
b4j.example.wixelement _l2 = null;
b4j.example.wixelement _l3 = null;
b4j.example.wixlayout _line = null;
b4j.example.wixlayout _wide = null;
b4j.example.wixelement _w1 = null;
b4j.example.wixelement _w2 = null;
b4j.example.wixelement _w3 = null;
b4j.example.wixlayout _space = null;
b4j.example.wixelement _s1 = null;
b4j.example.wixelement _s2 = null;
b4j.example.wixelement _s3 = null;
b4j.example.wixlayout _head = null;
b4j.example.wixelement _h1 = null;
b4j.example.wixelement _h2 = null;
b4j.example.wixelement _h3 = null;
b4j.example.wixlayout _form = null;
b4j.example.wixelement _f1 = null;
b4j.example.wixelement _f2 = null;
b4j.example.wixelement _f3 = null;
 //BA.debugLineNum = 7;BA.debugLine="Public Sub Init";
 //BA.debugLineNum = 9;BA.debugLine="pg.Initialize(\"\").SetClean";
_pg._initialize /*b4j.example.wixpage*/ (ba,"")._setclean /*b4j.example.wixpage*/ ();
 //BA.debugLineNum = 12;BA.debugLine="Dim l1 As WixElement";
_l1 = new b4j.example.wixelement();
 //BA.debugLineNum = 13;BA.debugLine="l1.Initialize(\"l1\").SetTemplate(\"line-1\")";
_l1._initialize /*b4j.example.wixelement*/ (ba,"l1")._settemplate /*b4j.example.wixelement*/ ("line-1");
 //BA.debugLineNum = 14;BA.debugLine="Dim l2 As WixElement";
_l2 = new b4j.example.wixelement();
 //BA.debugLineNum = 15;BA.debugLine="l2.Initialize(\"l2\").SetTemplate(\"line-2\")";
_l2._initialize /*b4j.example.wixelement*/ (ba,"l2")._settemplate /*b4j.example.wixelement*/ ("line-2");
 //BA.debugLineNum = 16;BA.debugLine="Dim l3 As WixElement";
_l3 = new b4j.example.wixelement();
 //BA.debugLineNum = 17;BA.debugLine="l3.Initialize(\"l3\").SetTemplate(\"line-3\")";
_l3._initialize /*b4j.example.wixelement*/ (ba,"l3")._settemplate /*b4j.example.wixelement*/ ("line-3");
 //BA.debugLineNum = 19;BA.debugLine="Dim line As WixLayout";
_line = new b4j.example.wixlayout();
 //BA.debugLineNum = 20;BA.debugLine="line.Initialize(\"linel\").setline";
_line._initialize /*b4j.example.wixlayout*/ (ba,"linel")._setline /*b4j.example.wixlayout*/ ();
 //BA.debugLineNum = 22;BA.debugLine="line.AddColumns(l1.item)";
_line._addcolumns /*b4j.example.wixlayout*/ (_l1._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 23;BA.debugLine="line.AddColumns(l2.item)";
_line._addcolumns /*b4j.example.wixlayout*/ (_l2._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 24;BA.debugLine="line.AddColumns(l3.item)";
_line._addcolumns /*b4j.example.wixlayout*/ (_l3._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 26;BA.debugLine="line.AddToRows(pg.Page)";
_line._addtorows /*b4j.example.wixlayout*/ (_pg._page /*b4j.example.wixelement*/ );
 //BA.debugLineNum = 29;BA.debugLine="Dim wide As WixLayout";
_wide = new b4j.example.wixlayout();
 //BA.debugLineNum = 30;BA.debugLine="wide.Initialize(\"widel\").SetWide";
_wide._initialize /*b4j.example.wixlayout*/ (ba,"widel")._setwide /*b4j.example.wixlayout*/ ();
 //BA.debugLineNum = 32;BA.debugLine="Dim w1 As WixElement";
_w1 = new b4j.example.wixelement();
 //BA.debugLineNum = 33;BA.debugLine="w1.Initialize(\"w1\").SetTemplate(\"wide-1\").AddToCo";
_w1._initialize /*b4j.example.wixelement*/ (ba,"w1")._settemplate /*b4j.example.wixelement*/ ("wide-1")._addtocolumns /*b4j.example.wixelement*/ (_wide._layout /*b4j.example.wixelement*/ );
 //BA.debugLineNum = 34;BA.debugLine="Dim w2 As WixElement";
_w2 = new b4j.example.wixelement();
 //BA.debugLineNum = 35;BA.debugLine="w2.Initialize(\"w2\").SetTemplate(\"wide-2\").AddToCo";
_w2._initialize /*b4j.example.wixelement*/ (ba,"w2")._settemplate /*b4j.example.wixelement*/ ("wide-2")._addtocolumns /*b4j.example.wixelement*/ (_wide._layout /*b4j.example.wixelement*/ );
 //BA.debugLineNum = 36;BA.debugLine="Dim w3 As WixElement";
_w3 = new b4j.example.wixelement();
 //BA.debugLineNum = 37;BA.debugLine="w3.Initialize(\"w3\").SetTemplate(\"wide-3\").AddToCo";
_w3._initialize /*b4j.example.wixelement*/ (ba,"w3")._settemplate /*b4j.example.wixelement*/ ("wide-3")._addtocolumns /*b4j.example.wixelement*/ (_wide._layout /*b4j.example.wixelement*/ );
 //BA.debugLineNum = 38;BA.debugLine="wide.AddToRows(pg.Page)";
_wide._addtorows /*b4j.example.wixlayout*/ (_pg._page /*b4j.example.wixelement*/ );
 //BA.debugLineNum = 40;BA.debugLine="Dim space As WixLayout";
_space = new b4j.example.wixlayout();
 //BA.debugLineNum = 41;BA.debugLine="space.Initialize(\"spacel\").SetSpace";
_space._initialize /*b4j.example.wixlayout*/ (ba,"spacel")._setspace /*b4j.example.wixlayout*/ ();
 //BA.debugLineNum = 42;BA.debugLine="Dim s1 As WixElement";
_s1 = new b4j.example.wixelement();
 //BA.debugLineNum = 43;BA.debugLine="s1.Initialize(\"s1\").SetTemplate(\"space-1\")";
_s1._initialize /*b4j.example.wixelement*/ (ba,"s1")._settemplate /*b4j.example.wixelement*/ ("space-1");
 //BA.debugLineNum = 44;BA.debugLine="Dim s2 As WixElement";
_s2 = new b4j.example.wixelement();
 //BA.debugLineNum = 45;BA.debugLine="s2.Initialize(\"s2\").SetTemplate(\"space-2\")";
_s2._initialize /*b4j.example.wixelement*/ (ba,"s2")._settemplate /*b4j.example.wixelement*/ ("space-2");
 //BA.debugLineNum = 46;BA.debugLine="Dim s3 As WixElement";
_s3 = new b4j.example.wixelement();
 //BA.debugLineNum = 47;BA.debugLine="s3.Initialize(\"s3\").SetTemplate(\"space-3\")";
_s3._initialize /*b4j.example.wixelement*/ (ba,"s3")._settemplate /*b4j.example.wixelement*/ ("space-3");
 //BA.debugLineNum = 49;BA.debugLine="space.AddColumns(s1.item)";
_space._addcolumns /*b4j.example.wixlayout*/ (_s1._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 50;BA.debugLine="space.AddColumns(s2.item)";
_space._addcolumns /*b4j.example.wixlayout*/ (_s2._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 51;BA.debugLine="space.AddColumns(s3.item)";
_space._addcolumns /*b4j.example.wixlayout*/ (_s3._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 53;BA.debugLine="space.AddToRows(pg.Page)";
_space._addtorows /*b4j.example.wixlayout*/ (_pg._page /*b4j.example.wixelement*/ );
 //BA.debugLineNum = 55;BA.debugLine="Dim head As WixLayout";
_head = new b4j.example.wixlayout();
 //BA.debugLineNum = 56;BA.debugLine="head.Initialize(\"headl\").sethead";
_head._initialize /*b4j.example.wixlayout*/ (ba,"headl")._sethead /*b4j.example.wixlayout*/ ();
 //BA.debugLineNum = 57;BA.debugLine="Dim h1 As WixElement";
_h1 = new b4j.example.wixelement();
 //BA.debugLineNum = 58;BA.debugLine="h1.Initialize(\"h1\").SetTemplate(\"head-1\")";
_h1._initialize /*b4j.example.wixelement*/ (ba,"h1")._settemplate /*b4j.example.wixelement*/ ("head-1");
 //BA.debugLineNum = 59;BA.debugLine="Dim h2 As WixElement";
_h2 = new b4j.example.wixelement();
 //BA.debugLineNum = 60;BA.debugLine="h2.Initialize(\"h2\").SetTemplate(\"head-2\")";
_h2._initialize /*b4j.example.wixelement*/ (ba,"h2")._settemplate /*b4j.example.wixelement*/ ("head-2");
 //BA.debugLineNum = 61;BA.debugLine="Dim h3 As WixElement";
_h3 = new b4j.example.wixelement();
 //BA.debugLineNum = 62;BA.debugLine="h3.Initialize(\"h3\").SetTemplate(\"head-3\")";
_h3._initialize /*b4j.example.wixelement*/ (ba,"h3")._settemplate /*b4j.example.wixelement*/ ("head-3");
 //BA.debugLineNum = 64;BA.debugLine="head.AddColumns(h1.item)";
_head._addcolumns /*b4j.example.wixlayout*/ (_h1._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 65;BA.debugLine="head.AddColumns(h2.item)";
_head._addcolumns /*b4j.example.wixlayout*/ (_h2._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 66;BA.debugLine="head.AddColumns(h3.item)";
_head._addcolumns /*b4j.example.wixlayout*/ (_h3._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 67;BA.debugLine="head.AddToRows(pg.Page)";
_head._addtorows /*b4j.example.wixlayout*/ (_pg._page /*b4j.example.wixelement*/ );
 //BA.debugLineNum = 69;BA.debugLine="Dim form As WixLayout";
_form = new b4j.example.wixlayout();
 //BA.debugLineNum = 70;BA.debugLine="form.Initialize(\"forml\").setform";
_form._initialize /*b4j.example.wixlayout*/ (ba,"forml")._setform /*b4j.example.wixlayout*/ ();
 //BA.debugLineNum = 71;BA.debugLine="Dim f1 As WixElement";
_f1 = new b4j.example.wixelement();
 //BA.debugLineNum = 72;BA.debugLine="f1.Initialize(\"f1\").SetTemplate(\"form-1\").AddToCo";
_f1._initialize /*b4j.example.wixelement*/ (ba,"f1")._settemplate /*b4j.example.wixelement*/ ("form-1")._addtocolumns /*b4j.example.wixelement*/ (_form._layout /*b4j.example.wixelement*/ );
 //BA.debugLineNum = 73;BA.debugLine="Dim f2 As WixElement";
_f2 = new b4j.example.wixelement();
 //BA.debugLineNum = 74;BA.debugLine="f2.Initialize(\"f2\").SetTemplate(\"form-2\").AddToCo";
_f2._initialize /*b4j.example.wixelement*/ (ba,"f2")._settemplate /*b4j.example.wixelement*/ ("form-2")._addtocolumns /*b4j.example.wixelement*/ (_form._layout /*b4j.example.wixelement*/ );
 //BA.debugLineNum = 75;BA.debugLine="Dim f3 As WixElement";
_f3 = new b4j.example.wixelement();
 //BA.debugLineNum = 76;BA.debugLine="f3.Initialize(\"f3\").SetTemplate(\"form-3\").AddToCo";
_f3._initialize /*b4j.example.wixelement*/ (ba,"f3")._settemplate /*b4j.example.wixelement*/ ("form-3")._addtocolumns /*b4j.example.wixelement*/ (_form._layout /*b4j.example.wixelement*/ );
 //BA.debugLineNum = 77;BA.debugLine="form.AddToRows(pg.Page)";
_form._addtorows /*b4j.example.wixlayout*/ (_pg._page /*b4j.example.wixelement*/ );
 //BA.debugLineNum = 79;BA.debugLine="pg.ui";
_pg._ui /*String*/ ();
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
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
