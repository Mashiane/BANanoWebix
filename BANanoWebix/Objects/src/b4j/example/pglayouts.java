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
public static b4j.example.pglayouts1 _pglayouts1 = null;
public static b4j.example.pglayouts2 _pglayouts2 = null;
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
 //BA.debugLineNum = 9;BA.debugLine="pg.Initialize(\"\")";
_pg._initialize /*b4j.example.wixpage*/ (ba,"");
 //BA.debugLineNum = 10;BA.debugLine="pg.Page.SetTypeClean";
_pg._page /*b4j.example.wixelement*/ ._settypeclean /*b4j.example.wixelement*/ ();
 //BA.debugLineNum = 13;BA.debugLine="Dim l1 As WixElement";
_l1 = new b4j.example.wixelement();
 //BA.debugLineNum = 14;BA.debugLine="l1.Initialize(\"l1\").SetTemplate(\"line-1\")";
_l1._initialize /*b4j.example.wixelement*/ (ba,"l1")._settemplate /*b4j.example.wixelement*/ ("line-1");
 //BA.debugLineNum = 15;BA.debugLine="Dim l2 As WixElement";
_l2 = new b4j.example.wixelement();
 //BA.debugLineNum = 16;BA.debugLine="l2.Initialize(\"l2\").SetTemplate(\"line-2\")";
_l2._initialize /*b4j.example.wixelement*/ (ba,"l2")._settemplate /*b4j.example.wixelement*/ ("line-2");
 //BA.debugLineNum = 17;BA.debugLine="Dim l3 As WixElement";
_l3 = new b4j.example.wixelement();
 //BA.debugLineNum = 18;BA.debugLine="l3.Initialize(\"l3\").SetTemplate(\"line-3\")";
_l3._initialize /*b4j.example.wixelement*/ (ba,"l3")._settemplate /*b4j.example.wixelement*/ ("line-3");
 //BA.debugLineNum = 20;BA.debugLine="Dim line As WixLayout";
_line = new b4j.example.wixlayout();
 //BA.debugLineNum = 21;BA.debugLine="line.Initialize(\"linel\")";
_line._initialize /*b4j.example.wixlayout*/ (ba,"linel");
 //BA.debugLineNum = 22;BA.debugLine="line.Layout.setTypeline";
_line._layout /*b4j.example.wixelement*/ ._settypeline /*b4j.example.wixelement*/ ();
 //BA.debugLineNum = 24;BA.debugLine="line.Layout.AddColumns(l1.item)";
_line._layout /*b4j.example.wixelement*/ ._addcolumns /*b4j.example.wixelement*/ (_l1._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 25;BA.debugLine="line.Layout.AddColumns(l2.item)";
_line._layout /*b4j.example.wixelement*/ ._addcolumns /*b4j.example.wixelement*/ (_l2._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 26;BA.debugLine="line.Layout.AddColumns(l3.item)";
_line._layout /*b4j.example.wixelement*/ ._addcolumns /*b4j.example.wixelement*/ (_l3._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 28;BA.debugLine="line.Layout.AddToRows(pg.Page)";
_line._layout /*b4j.example.wixelement*/ ._addtorows /*String*/ (_pg._page /*b4j.example.wixelement*/ );
 //BA.debugLineNum = 31;BA.debugLine="Dim wide As WixLayout";
_wide = new b4j.example.wixlayout();
 //BA.debugLineNum = 32;BA.debugLine="wide.Initialize(\"widel\")";
_wide._initialize /*b4j.example.wixlayout*/ (ba,"widel");
 //BA.debugLineNum = 33;BA.debugLine="wide.Layout.SetTypeWide";
_wide._layout /*b4j.example.wixelement*/ ._settypewide /*b4j.example.wixelement*/ ();
 //BA.debugLineNum = 35;BA.debugLine="Dim w1 As WixElement";
_w1 = new b4j.example.wixelement();
 //BA.debugLineNum = 36;BA.debugLine="w1.Initialize(\"w1\").SetTemplate(\"wide-1\").AddToCo";
_w1._initialize /*b4j.example.wixelement*/ (ba,"w1")._settemplate /*b4j.example.wixelement*/ ("wide-1")._addtocolumns /*b4j.example.wixelement*/ (_wide._layout /*b4j.example.wixelement*/ );
 //BA.debugLineNum = 37;BA.debugLine="Dim w2 As WixElement";
_w2 = new b4j.example.wixelement();
 //BA.debugLineNum = 38;BA.debugLine="w2.Initialize(\"w2\").SetTemplate(\"wide-2\").AddToCo";
_w2._initialize /*b4j.example.wixelement*/ (ba,"w2")._settemplate /*b4j.example.wixelement*/ ("wide-2")._addtocolumns /*b4j.example.wixelement*/ (_wide._layout /*b4j.example.wixelement*/ );
 //BA.debugLineNum = 39;BA.debugLine="Dim w3 As WixElement";
_w3 = new b4j.example.wixelement();
 //BA.debugLineNum = 40;BA.debugLine="w3.Initialize(\"w3\").SetTemplate(\"wide-3\").AddToCo";
_w3._initialize /*b4j.example.wixelement*/ (ba,"w3")._settemplate /*b4j.example.wixelement*/ ("wide-3")._addtocolumns /*b4j.example.wixelement*/ (_wide._layout /*b4j.example.wixelement*/ );
 //BA.debugLineNum = 41;BA.debugLine="wide.Layout.AddToRows(pg.Page)";
_wide._layout /*b4j.example.wixelement*/ ._addtorows /*String*/ (_pg._page /*b4j.example.wixelement*/ );
 //BA.debugLineNum = 43;BA.debugLine="Dim space As WixLayout";
_space = new b4j.example.wixlayout();
 //BA.debugLineNum = 44;BA.debugLine="space.Initialize(\"spacel\")";
_space._initialize /*b4j.example.wixlayout*/ (ba,"spacel");
 //BA.debugLineNum = 45;BA.debugLine="space.Layout.SetTypeSpace";
_space._layout /*b4j.example.wixelement*/ ._settypespace /*b4j.example.wixelement*/ ();
 //BA.debugLineNum = 46;BA.debugLine="Dim s1 As WixElement";
_s1 = new b4j.example.wixelement();
 //BA.debugLineNum = 47;BA.debugLine="s1.Initialize(\"s1\").SetTemplate(\"space-1\")";
_s1._initialize /*b4j.example.wixelement*/ (ba,"s1")._settemplate /*b4j.example.wixelement*/ ("space-1");
 //BA.debugLineNum = 48;BA.debugLine="Dim s2 As WixElement";
_s2 = new b4j.example.wixelement();
 //BA.debugLineNum = 49;BA.debugLine="s2.Initialize(\"s2\").SetTemplate(\"space-2\")";
_s2._initialize /*b4j.example.wixelement*/ (ba,"s2")._settemplate /*b4j.example.wixelement*/ ("space-2");
 //BA.debugLineNum = 50;BA.debugLine="Dim s3 As WixElement";
_s3 = new b4j.example.wixelement();
 //BA.debugLineNum = 51;BA.debugLine="s3.Initialize(\"s3\").SetTemplate(\"space-3\")";
_s3._initialize /*b4j.example.wixelement*/ (ba,"s3")._settemplate /*b4j.example.wixelement*/ ("space-3");
 //BA.debugLineNum = 53;BA.debugLine="space.Layout.AddColumns(s1.item)";
_space._layout /*b4j.example.wixelement*/ ._addcolumns /*b4j.example.wixelement*/ (_s1._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 54;BA.debugLine="space.Layout.AddColumns(s2.item)";
_space._layout /*b4j.example.wixelement*/ ._addcolumns /*b4j.example.wixelement*/ (_s2._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 55;BA.debugLine="space.Layout.AddColumns(s3.item)";
_space._layout /*b4j.example.wixelement*/ ._addcolumns /*b4j.example.wixelement*/ (_s3._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 57;BA.debugLine="space.Layout.AddToRows(pg.Page)";
_space._layout /*b4j.example.wixelement*/ ._addtorows /*String*/ (_pg._page /*b4j.example.wixelement*/ );
 //BA.debugLineNum = 59;BA.debugLine="Dim head As WixLayout";
_head = new b4j.example.wixlayout();
 //BA.debugLineNum = 60;BA.debugLine="head.Initialize(\"headl\")";
_head._initialize /*b4j.example.wixlayout*/ (ba,"headl");
 //BA.debugLineNum = 61;BA.debugLine="head.Layout.setTypehead";
_head._layout /*b4j.example.wixelement*/ ._settypehead /*b4j.example.wixelement*/ ();
 //BA.debugLineNum = 62;BA.debugLine="Dim h1 As WixElement";
_h1 = new b4j.example.wixelement();
 //BA.debugLineNum = 63;BA.debugLine="h1.Initialize(\"h1\").SetTemplate(\"head-1\")";
_h1._initialize /*b4j.example.wixelement*/ (ba,"h1")._settemplate /*b4j.example.wixelement*/ ("head-1");
 //BA.debugLineNum = 64;BA.debugLine="Dim h2 As WixElement";
_h2 = new b4j.example.wixelement();
 //BA.debugLineNum = 65;BA.debugLine="h2.Initialize(\"h2\").SetTemplate(\"head-2\")";
_h2._initialize /*b4j.example.wixelement*/ (ba,"h2")._settemplate /*b4j.example.wixelement*/ ("head-2");
 //BA.debugLineNum = 66;BA.debugLine="Dim h3 As WixElement";
_h3 = new b4j.example.wixelement();
 //BA.debugLineNum = 67;BA.debugLine="h3.Initialize(\"h3\").SetTemplate(\"head-3\")";
_h3._initialize /*b4j.example.wixelement*/ (ba,"h3")._settemplate /*b4j.example.wixelement*/ ("head-3");
 //BA.debugLineNum = 69;BA.debugLine="head.Layout.AddColumns(h1.item)";
_head._layout /*b4j.example.wixelement*/ ._addcolumns /*b4j.example.wixelement*/ (_h1._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 70;BA.debugLine="head.Layout.AddColumns(h2.item)";
_head._layout /*b4j.example.wixelement*/ ._addcolumns /*b4j.example.wixelement*/ (_h2._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 71;BA.debugLine="head.Layout.AddColumns(h3.item)";
_head._layout /*b4j.example.wixelement*/ ._addcolumns /*b4j.example.wixelement*/ (_h3._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 72;BA.debugLine="head.Layout.AddToRows(pg.Page)";
_head._layout /*b4j.example.wixelement*/ ._addtorows /*String*/ (_pg._page /*b4j.example.wixelement*/ );
 //BA.debugLineNum = 74;BA.debugLine="Dim form As WixLayout";
_form = new b4j.example.wixlayout();
 //BA.debugLineNum = 75;BA.debugLine="form.Initialize(\"forml\")";
_form._initialize /*b4j.example.wixlayout*/ (ba,"forml");
 //BA.debugLineNum = 76;BA.debugLine="form.Layout.setTypeform";
_form._layout /*b4j.example.wixelement*/ ._settypeform /*b4j.example.wixelement*/ ();
 //BA.debugLineNum = 77;BA.debugLine="Dim f1 As WixElement";
_f1 = new b4j.example.wixelement();
 //BA.debugLineNum = 78;BA.debugLine="f1.Initialize(\"f1\").SetTemplate(\"form-1\").AddToCo";
_f1._initialize /*b4j.example.wixelement*/ (ba,"f1")._settemplate /*b4j.example.wixelement*/ ("form-1")._addtocolumns /*b4j.example.wixelement*/ (_form._layout /*b4j.example.wixelement*/ );
 //BA.debugLineNum = 79;BA.debugLine="Dim f2 As WixElement";
_f2 = new b4j.example.wixelement();
 //BA.debugLineNum = 80;BA.debugLine="f2.Initialize(\"f2\").SetTemplate(\"form-2\").AddToCo";
_f2._initialize /*b4j.example.wixelement*/ (ba,"f2")._settemplate /*b4j.example.wixelement*/ ("form-2")._addtocolumns /*b4j.example.wixelement*/ (_form._layout /*b4j.example.wixelement*/ );
 //BA.debugLineNum = 81;BA.debugLine="Dim f3 As WixElement";
_f3 = new b4j.example.wixelement();
 //BA.debugLineNum = 82;BA.debugLine="f3.Initialize(\"f3\").SetTemplate(\"form-3\").AddToCo";
_f3._initialize /*b4j.example.wixelement*/ (ba,"f3")._settemplate /*b4j.example.wixelement*/ ("form-3")._addtocolumns /*b4j.example.wixelement*/ (_form._layout /*b4j.example.wixelement*/ );
 //BA.debugLineNum = 83;BA.debugLine="form.Layout.AddToRows(pg.Page)";
_form._layout /*b4j.example.wixelement*/ ._addtorows /*String*/ (_pg._page /*b4j.example.wixelement*/ );
 //BA.debugLineNum = 85;BA.debugLine="pg.ui";
_pg._ui /*String*/ ();
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
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
