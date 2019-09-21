package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;

public class modclient extends Object{
public static modclient mostCurrent = new modclient();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.modclient", null);
		ba.loadHtSubs(modclient.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.Mashy.BANanoWebixDemo.modclient", ba);
		}
	}
    public static Class<?> getObject() {
		return modclient.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static b4j.Mashy.BANanoWebixDemo.wixpage _page = null;
public static com.ab.banano.BANano _banano = null;
public static b4j.Mashy.BANanoWebixDemo.main _main = null;
public static b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public static b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public static b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public static b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public static String  _addpage(b4j.Mashy.BANanoWebixDemo.wixpage _pg,b4j.Mashy.BANanoWebixDemo.wixmultiview _mv) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixlayout _a = null;
 //BA.debugLineNum = 7;BA.debugLine="Sub AddPage(pg As WixPage, mv As WixMultiView)";
 //BA.debugLineNum = 8;BA.debugLine="Page = pg";
_page = _pg;
 //BA.debugLineNum = 10;BA.debugLine="Dim a As WixLayout";
_a = new b4j.Mashy.BANanoWebixDemo.wixlayout();
 //BA.debugLineNum = 11;BA.debugLine="a.Initialize(\"mv_welcome\").SetTemplate(\"Welcome\")";
_a._initialize /*b4j.Mashy.BANanoWebixDemo.wixlayout*/ (ba,"mv_welcome")._settemplate /*b4j.Mashy.BANanoWebixDemo.wixlayout*/ ("Welcome")._settypeline /*b4j.Mashy.BANanoWebixDemo.wixlayout*/ ("");
 //BA.debugLineNum = 13;BA.debugLine="mv.AddItem(a.Item)";
_mv._additem /*b4j.Mashy.BANanoWebixDemo.wixmultiview*/ (_a._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private Page As WixPage";
_page = new b4j.Mashy.BANanoWebixDemo.wixpage();
 //BA.debugLineNum = 4;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public static String  _showpage(b4j.Mashy.BANanoWebixDemo.wixpage _pg) throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Sub ShowPage(pg As WixPage)";
 //BA.debugLineNum = 17;BA.debugLine="Page = pg";
_page = _pg;
 //BA.debugLineNum = 18;BA.debugLine="Page.Show(\"mv_welcome\")";
_page._show /*String*/ ("mv_welcome");
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
}
