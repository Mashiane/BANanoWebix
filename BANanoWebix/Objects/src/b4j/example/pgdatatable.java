package b4j.example;


import anywheresoftware.b4a.BA;

public class pgdatatable extends Object{
public static pgdatatable mostCurrent = new pgdatatable();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.pgdatatable", null);
		ba.loadHtSubs(pgdatatable.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.pgdatatable", ba);
		}
	}
    public static Class<?> getObject() {
		return pgdatatable.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static b4j.example.wixpage _pg = null;
public static b4j.example.wixform _myform = null;
public static com.ab.banano.BANano _banano = null;
public static b4j.example.main _main = null;
public static b4j.example.pgforms1 _pgforms1 = null;
public static b4j.example.pgforms _pgforms = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.pglayout _pglayout = null;
public static String  _backtomain() throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Sub backtomain()";
 //BA.debugLineNum = 44;BA.debugLine="pgIndex.Init";
_pgindex._init /*String*/ ();
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return "";
}
public static String  _init() throws Exception{
b4j.example.wixrow _r1 = null;
b4j.example.wixheader _hdr = null;
b4j.example.wixbutton _btnb = null;
anywheresoftware.b4a.objects.collections.List _filmset = null;
b4j.example.wixdatatable _dt = null;
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Init()";
 //BA.debugLineNum = 10;BA.debugLine="pg.Initialize(\"forms\")";
_pg._initialize /*b4j.example.wixpage*/ (ba,"forms");
 //BA.debugLineNum = 12;BA.debugLine="Dim R1 As WixRow";
_r1 = new b4j.example.wixrow();
 //BA.debugLineNum = 13;BA.debugLine="R1.Initialize(\"R1\")";
_r1._initialize /*b4j.example.wixrow*/ (ba,"R1");
 //BA.debugLineNum = 14;BA.debugLine="Dim hdr As WixHeader";
_hdr = new b4j.example.wixheader();
 //BA.debugLineNum = 15;BA.debugLine="hdr.Initialize(\"hdr\").SetTemplate(\"Webix DataTabl";
_hdr._initialize /*b4j.example.wixheader*/ (ba,"hdr")._settemplate /*b4j.example.wixheader*/ ("Webix DataTable");
 //BA.debugLineNum = 16;BA.debugLine="R1.AddItem(hdr.Item)";
_r1._additem /*b4j.example.wixrow*/ (_hdr._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 18;BA.debugLine="Dim btnB As WixButton";
_btnb = new b4j.example.wixbutton();
 //BA.debugLineNum = 19;BA.debugLine="btnB.Initialize(\"btnB\").SetLabel(\"Back\").SetClick";
_btnb._initialize /*b4j.example.wixbutton*/ (ba,"btnB")._setlabel /*b4j.example.wixbutton*/ ("Back")._setclick /*b4j.example.wixbutton*/ ((com.ab.banano.BANanoObject)(_banano.CallBack(pgdatatable.getObject(),"backtomain",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)))));
 //BA.debugLineNum = 20;BA.debugLine="R1.AddItem(btnB.Item)";
_r1._additem /*b4j.example.wixrow*/ (_btnb._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 23;BA.debugLine="Dim filmset As List";
_filmset = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 24;BA.debugLine="filmset.Initialize";
_filmset.Initialize();
 //BA.debugLineNum = 25;BA.debugLine="filmset.Add(CreateMap(\"id\":1, \"title\":\"The Shawsh";
_filmset.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(1),(Object)("title"),(Object)("The Shawshank Redemption"),(Object)("year"),(Object)(1994)}).getObject()));
 //BA.debugLineNum = 26;BA.debugLine="filmset.Add(CreateMap(\"id\":2, \"title\":\"The Godfat";
_filmset.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(2),(Object)("title"),(Object)("The Godfather"),(Object)("year"),(Object)(1972)}).getObject()));
 //BA.debugLineNum = 27;BA.debugLine="filmset.Add(CreateMap(\"id\":3, \"title\":\"The Godfat";
_filmset.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(3),(Object)("title"),(Object)("The Godfather: Part II"),(Object)("year"),(Object)(1974)}).getObject()));
 //BA.debugLineNum = 28;BA.debugLine="filmset.Add(CreateMap(\"id\":4, \"title\":\"The Good,";
_filmset.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(4),(Object)("title"),(Object)("The Good, the Bad and the Ugly"),(Object)("year"),(Object)(1966)}).getObject()));
 //BA.debugLineNum = 29;BA.debugLine="filmset.Add(CreateMap(\"id\":5, \"title\":\"My Fair La";
_filmset.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(5),(Object)("title"),(Object)("My Fair Lady"),(Object)("year"),(Object)(1964)}).getObject()));
 //BA.debugLineNum = 30;BA.debugLine="filmset.Add(CreateMap(\"id\":6, \"title\":\"12 Angry M";
_filmset.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(6),(Object)("title"),(Object)("12 Angry Men"),(Object)("year"),(Object)(1957)}).getObject()));
 //BA.debugLineNum = 33;BA.debugLine="Dim dt As WixDataTable";
_dt = new b4j.example.wixdatatable();
 //BA.debugLineNum = 34;BA.debugLine="dt.Initialize(\"dt\").SetAutoConfig(True).SetData(f";
_dt._initialize /*b4j.example.wixdatatable*/ (ba,"dt")._setautoconfig /*b4j.example.wixdatatable*/ (anywheresoftware.b4a.keywords.Common.True)._setdata /*b4j.example.wixdatatable*/ (_filmset);
 //BA.debugLineNum = 35;BA.debugLine="R1.AddItem(dt.Item)";
_r1._additem /*b4j.example.wixrow*/ (_dt._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 37;BA.debugLine="pg.Page.AddRow(R1)";
_pg._page /*b4j.example.wixelement*/ ._addrow /*String*/ (_r1);
 //BA.debugLineNum = 39;BA.debugLine="pg.UI";
_pg._ui /*String*/ ();
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private pg As WixPage";
_pg = new b4j.example.wixpage();
 //BA.debugLineNum = 4;BA.debugLine="Public myForm As WixForm";
_myform = new b4j.example.wixform();
 //BA.debugLineNum = 5;BA.debugLine="Public BANano As BANano";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
}
