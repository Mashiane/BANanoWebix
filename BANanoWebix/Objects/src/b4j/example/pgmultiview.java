package b4j.example;


import anywheresoftware.b4a.BA;

public class pgmultiview extends Object{
public static pgmultiview mostCurrent = new pgmultiview();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.pgmultiview", null);
		ba.loadHtSubs(pgmultiview.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.pgmultiview", ba);
		}
	}
    public static Class<?> getObject() {
		return pgmultiview.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static b4j.example.wixpage _pg = null;
public static b4j.example.main _main = null;
public static b4j.example.pglayouts1 _pglayouts1 = null;
public static b4j.example.pglayouts2 _pglayouts2 = null;
public static b4j.example.pglayouts _pglayouts = null;
public static b4j.example.pgforms1 _pgforms1 = null;
public static b4j.example.pgforms _pgforms = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.pgdatatable _pgdatatable = null;
public static b4j.example.pglayout _pglayout = null;
public static String  _init() throws Exception{
b4j.example.wixcarousel _c = null;
b4j.example.wixelement _sld1 = null;
b4j.example.wixelement _sld2 = null;
b4j.example.wixelement _sld3 = null;
b4j.example.wixsegmented _sg = null;
b4j.example.wixtabview _tb = null;
 //BA.debugLineNum = 6;BA.debugLine="Sub Init";
 //BA.debugLineNum = 7;BA.debugLine="pg.Initialize(\"\")";
_pg._initialize /*b4j.example.wixpage*/ (ba,"");
 //BA.debugLineNum = 8;BA.debugLine="pg.Page.setType(\"clean\")";
_pg._page /*b4j.example.wixelement*/ ._settype /*b4j.example.wixelement*/ ("clean");
 //BA.debugLineNum = 24;BA.debugLine="Dim c As WixCarousel";
_c = new b4j.example.wixcarousel();
 //BA.debugLineNum = 25;BA.debugLine="c.Initialize(\"\")";
_c._initialize /*b4j.example.wixcarousel*/ (ba,"");
 //BA.debugLineNum = 27;BA.debugLine="Dim sld1 As WixElement";
_sld1 = new b4j.example.wixelement();
 //BA.debugLineNum = 28;BA.debugLine="sld1.Initialize(\"\")";
_sld1._initialize /*b4j.example.wixelement*/ (ba,"");
 //BA.debugLineNum = 29;BA.debugLine="sld1.SetTemplate(\"Gilligan\")";
_sld1._settemplate /*b4j.example.wixelement*/ ("Gilligan");
 //BA.debugLineNum = 30;BA.debugLine="sld1.SetStyle(\"background-color\", \"#ff0000\")";
_sld1._setstyle /*b4j.example.wixelement*/ ("background-color","#ff0000");
 //BA.debugLineNum = 31;BA.debugLine="sld1.SetStyle(\"color\", \"#ffff00\")";
_sld1._setstyle /*b4j.example.wixelement*/ ("color","#ffff00");
 //BA.debugLineNum = 32;BA.debugLine="sld1.AddToColumns(c.Carousel)";
_sld1._addtocolumns /*b4j.example.wixelement*/ (_c._carousel /*b4j.example.wixelement*/ );
 //BA.debugLineNum = 34;BA.debugLine="Dim sld2 As WixElement";
_sld2 = new b4j.example.wixelement();
 //BA.debugLineNum = 35;BA.debugLine="sld2.Initialize(\"\")";
_sld2._initialize /*b4j.example.wixelement*/ (ba,"");
 //BA.debugLineNum = 36;BA.debugLine="sld2.SetTemplate(\"Professor\")";
_sld2._settemplate /*b4j.example.wixelement*/ ("Professor");
 //BA.debugLineNum = 37;BA.debugLine="sld2.SetStyle(\"background-color\", \"#00ff00\")";
_sld2._setstyle /*b4j.example.wixelement*/ ("background-color","#00ff00");
 //BA.debugLineNum = 38;BA.debugLine="sld2.SetStyle(\"color\", \"#000000\")";
_sld2._setstyle /*b4j.example.wixelement*/ ("color","#000000");
 //BA.debugLineNum = 39;BA.debugLine="c.AddSlide(sld2)";
_c._addslide /*String*/ (_sld2);
 //BA.debugLineNum = 41;BA.debugLine="Dim sld3 As WixElement";
_sld3 = new b4j.example.wixelement();
 //BA.debugLineNum = 42;BA.debugLine="sld3.Initialize(\"\")";
_sld3._initialize /*b4j.example.wixelement*/ (ba,"");
 //BA.debugLineNum = 43;BA.debugLine="sld3.SetTemplate(\"Mary Ann\")";
_sld3._settemplate /*b4j.example.wixelement*/ ("Mary Ann");
 //BA.debugLineNum = 44;BA.debugLine="sld3.SetStyle(\"background-color\", \"#0000ff\")";
_sld3._setstyle /*b4j.example.wixelement*/ ("background-color","#0000ff");
 //BA.debugLineNum = 45;BA.debugLine="sld3.SetStyle(\"color\", \"#ffffff\")";
_sld3._setstyle /*b4j.example.wixelement*/ ("color","#ffffff");
 //BA.debugLineNum = 46;BA.debugLine="c.AddSlide(sld3)";
_c._addslide /*String*/ (_sld3);
 //BA.debugLineNum = 47;BA.debugLine="pg.Page.AddRows(c.Item)";
_pg._page /*b4j.example.wixelement*/ ._addrows /*b4j.example.wixelement*/ (_c._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 49;BA.debugLine="pg.Page.AddRowsSpacer";
_pg._page /*b4j.example.wixelement*/ ._addrowsspacer /*String*/ ();
 //BA.debugLineNum = 52;BA.debugLine="Dim sg As WixSegmented";
_sg = new b4j.example.wixsegmented();
 //BA.debugLineNum = 53;BA.debugLine="sg.Initialize(\"\")";
_sg._initialize /*b4j.example.wixsegmented*/ (ba,"");
 //BA.debugLineNum = 54;BA.debugLine="sg.Segmented.SetValue(\"left\")";
_sg._segmented /*b4j.example.wixelement*/ ._setvalue /*b4j.example.wixelement*/ ("left");
 //BA.debugLineNum = 55;BA.debugLine="sg.Segmented.SetMultiView(True)";
_sg._segmented /*b4j.example.wixelement*/ ._setmultiview /*b4j.example.wixelement*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 56;BA.debugLine="sg.AddOption(\"rick\", \"Rick\",\"Alcoholic<br>Science";
_sg._addoption /*b4j.example.wixsegmented*/ ("rick","Rick","Alcoholic<br>Science Genius<br>Father of Beth");
 //BA.debugLineNum = 57;BA.debugLine="sg.AddOption(\"morty\", \"Morty\",\"14 years old<br>Mo";
_sg._addoption /*b4j.example.wixsegmented*/ ("morty","Morty","14 years old<br>Mortiest Morty<br>Sidekick");
 //BA.debugLineNum = 59;BA.debugLine="pg.Page.AddRows(sg.Item)";
_pg._page /*b4j.example.wixelement*/ ._addrows /*b4j.example.wixelement*/ (_sg._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 61;BA.debugLine="pg.Page.AddRowsCells(sg.Cells)";
_pg._page /*b4j.example.wixelement*/ ._addrowscells /*b4j.example.wixelement*/ (_sg._cells /*anywheresoftware.b4a.objects.collections.List*/ );
 //BA.debugLineNum = 63;BA.debugLine="pg.Page.AddRowsSpacer";
_pg._page /*b4j.example.wixelement*/ ._addrowsspacer /*String*/ ();
 //BA.debugLineNum = 65;BA.debugLine="Dim tb As WixTabView";
_tb = new b4j.example.wixtabview();
 //BA.debugLineNum = 66;BA.debugLine="tb.Initialize(\"\")";
_tb._initialize /*b4j.example.wixtabview*/ (ba,"");
 //BA.debugLineNum = 67;BA.debugLine="tb.AddItem(\"\",\"Entry\",\"Some form controls here\",C";
_tb._additem /*String*/ ("","Entry","Some form controls here",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("css"),(Object)("entry")}));
 //BA.debugLineNum = 68;BA.debugLine="tb.AddItem(\"\",\"Results\",\"Some results of data ent";
_tb._additem /*String*/ ("","Results","Some results of data entry here",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("css"),(Object)("results")}));
 //BA.debugLineNum = 69;BA.debugLine="pg.Page.AddRows(tb.Item)";
_pg._page /*b4j.example.wixelement*/ ._addrows /*b4j.example.wixelement*/ (_tb._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 72;BA.debugLine="pg.ui";
_pg._ui /*String*/ ();
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
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
