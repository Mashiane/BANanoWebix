package b4j.example;


import anywheresoftware.b4a.BA;

public class pgcontext extends Object{
public static pgcontext mostCurrent = new pgcontext();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.pgcontext", null);
		ba.loadHtSubs(pgcontext.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.pgcontext", ba);
		}
	}
    public static Class<?> getObject() {
		return pgcontext.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static b4j.example.wixpage _pg = null;
public static com.ab.banano.BANano _banano = null;
public static b4j.example.main _main = null;
public static b4j.example.pgtabbar _pgtabbar = null;
public static b4j.example.pgtree _pgtree = null;
public static b4j.example.pgmenu _pgmenu = null;
public static b4j.example.pglist _pglist = null;
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
public static b4j.example.pglayout _pglayout = null;
public static b4j.example.pgunitlist _pgunitlist = null;
public static b4j.example.pgpropertysheet _pgpropertysheet = null;
public static b4j.example.pgtreetable _pgtreetable = null;
public static b4j.example.pgsidebar _pgsidebar = null;
public static b4j.example.pgcomments _pgcomments = null;
public static b4j.example.pggrouplist _pggrouplist = null;
public static b4j.example.pggooglemap _pggooglemap = null;
public static b4j.example.pguploader1 _pguploader1 = null;
public static String  _init() throws Exception{
b4j.example.wixrow _r1 = null;
b4j.example.uoenowhtml _div1 = null;
b4j.example.uoenowhtml _div2 = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
b4j.example.wixcontext _context = null;
b4j.example.wixcontextmenu _contextmenu = null;
anywheresoftware.b4a.objects.collections.List _data = null;
anywheresoftware.b4a.objects.collections.Map _meid = null;
 //BA.debugLineNum = 7;BA.debugLine="Sub Init";
 //BA.debugLineNum = 8;BA.debugLine="pg.Initialize(\"forms\").SetHeader(\"Lesson 19: Cont";
_pg._initialize /*b4j.example.wixpage*/ (ba,"forms")._setheader /*b4j.example.wixpage*/ ("Lesson 19: Context Menus");
 //BA.debugLineNum = 10;BA.debugLine="Dim R1 As WixRow";
_r1 = new b4j.example.wixrow();
 //BA.debugLineNum = 11;BA.debugLine="R1.Initialize(\"R1\")";
_r1._initialize /*b4j.example.wixrow*/ (ba,"R1");
 //BA.debugLineNum = 14;BA.debugLine="Dim div1 As UOENowHTML";
_div1 = new b4j.example.uoenowhtml();
 //BA.debugLineNum = 15;BA.debugLine="div1.Initialize(\"div1\", \"div\").SetStyle(\"backgrou";
_div1._initialize /*b4j.example.uoenowhtml*/ (ba,"div1","div")._setstyle /*b4j.example.uoenowhtml*/ ("background-color","#ff0000");
 //BA.debugLineNum = 16;BA.debugLine="div1.SetStyle(\"width\", \"200px\").SetStyle(\"height\"";
_div1._setstyle /*b4j.example.uoenowhtml*/ ("width","200px")._setstyle /*b4j.example.uoenowhtml*/ ("height","200px");
 //BA.debugLineNum = 18;BA.debugLine="Dim div2 As UOENowHTML";
_div2 = new b4j.example.uoenowhtml();
 //BA.debugLineNum = 19;BA.debugLine="div2.Initialize(\"div2\", \"div\").SetStyle(\"backgrou";
_div2._initialize /*b4j.example.uoenowhtml*/ (ba,"div2","div")._setstyle /*b4j.example.uoenowhtml*/ ("background-color","#00ff00");
 //BA.debugLineNum = 20;BA.debugLine="div2.SetStyle(\"width\", \"200px\").SetStyle(\"height\"";
_div2._setstyle /*b4j.example.uoenowhtml*/ ("width","200px")._setstyle /*b4j.example.uoenowhtml*/ ("height","200px");
 //BA.debugLineNum = 23;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 24;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 25;BA.debugLine="sb.Append(div1.HTML)";
_sb.Append(_div1._html /*String*/ ());
 //BA.debugLineNum = 26;BA.debugLine="sb.Append(\"<br>\")";
_sb.Append("<br>");
 //BA.debugLineNum = 27;BA.debugLine="sb.Append(div2.html)";
_sb.Append(_div2._html /*String*/ ());
 //BA.debugLineNum = 29;BA.debugLine="R1.SetTemplate(sb.ToString)";
_r1._settemplate /*b4j.example.wixrow*/ (_sb.ToString());
 //BA.debugLineNum = 32;BA.debugLine="pg.AddRow(R1)";
_pg._addrow /*String*/ (_r1);
 //BA.debugLineNum = 34;BA.debugLine="pg.ui";
_pg._ui /*String*/ ();
 //BA.debugLineNum = 37;BA.debugLine="Dim context As WixContext '(popup)";
_context = new b4j.example.wixcontext();
 //BA.debugLineNum = 38;BA.debugLine="context.Initialize(\"context\").SetMaster(\"div1\").S";
_context._initialize /*b4j.example.wixcontext*/ (ba,"context")._setmaster /*b4j.example.wixcontext*/ ("div1")._setwidth /*b4j.example.wixcontext*/ ((int) (250))._setheight /*b4j.example.wixcontext*/ ((int) (150));
 //BA.debugLineNum = 39;BA.debugLine="context.SetTemplate(\"Exterminate the Doctor! Exte";
_context._settemplate /*b4j.example.wixcontext*/ ("Exterminate the Doctor! Exterminate! Exterminate!");
 //BA.debugLineNum = 41;BA.debugLine="pg.AddContext(context)";
_pg._addcontext /*com.ab.banano.BANanoObject*/ (_context);
 //BA.debugLineNum = 43;BA.debugLine="Dim contextmenu As WixContextMenu";
_contextmenu = new b4j.example.wixcontextmenu();
 //BA.debugLineNum = 44;BA.debugLine="contextmenu.Initialize(\"contextmenu\").SetMaster(\"";
_contextmenu._initialize /*b4j.example.wixcontextmenu*/ (ba,"contextmenu")._setmaster /*b4j.example.wixcontextmenu*/ ("div2")._setselect /*b4j.example.wixcontextmenu*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 45;BA.debugLine="contextmenu.AddItem(\"\",\"sendto\",\"Send To...\",\"\",\"";
_contextmenu._additem /*b4j.example.wixcontextmenu*/ ("","sendto","Send To...","","","","");
 //BA.debugLineNum = 46;BA.debugLine="contextmenu.AddItem(\"sendto\", \"clara\", \"Clara\",\"\"";
_contextmenu._additem /*b4j.example.wixcontextmenu*/ ("sendto","clara","Clara","","","","");
 //BA.debugLineNum = 47;BA.debugLine="contextmenu.AddItem(\"sendto\", \"billie\", \"Billie\",";
_contextmenu._additem /*b4j.example.wixcontextmenu*/ ("sendto","billie","Billie","","","","");
 //BA.debugLineNum = 48;BA.debugLine="contextmenu.AddItem(\"sendto\", \"rose\", \"Rose\",\"\",\"";
_contextmenu._additem /*b4j.example.wixcontextmenu*/ ("sendto","rose","Rose","","","","");
 //BA.debugLineNum = 49;BA.debugLine="contextmenu.AddItem(\"\",\"addcompanion\",\"Add Compan";
_contextmenu._additem /*b4j.example.wixcontextmenu*/ ("","addcompanion","Add Companion","","","","");
 //BA.debugLineNum = 50;BA.debugLine="Dim data As List = pg.Unflatten(contextmenu.Items";
_data = new anywheresoftware.b4a.objects.collections.List();
_data = _pg._unflatten /*anywheresoftware.b4a.objects.collections.List*/ (_contextmenu._items /*anywheresoftware.b4a.objects.collections.List*/ ,"submenu");
 //BA.debugLineNum = 51;BA.debugLine="contextmenu.SetData(data)";
_contextmenu._setdata /*b4j.example.wixcontextmenu*/ (_data);
 //BA.debugLineNum = 53;BA.debugLine="pg.AddContextMenu(contextmenu)";
_pg._addcontextmenu /*com.ab.banano.BANanoObject*/ (_contextmenu);
 //BA.debugLineNum = 55;BA.debugLine="Dim meID As Map";
_meid = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 56;BA.debugLine="pg.onMenuItemClick(\"contextmenu\", BANano.CallBack";
_pg._onmenuitemclick /*String*/ ("contextmenu",(com.ab.banano.BANanoObject)(_banano.CallBack(pgcontext.getObject(),"itemClick",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_meid.getObject())}))));
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return "";
}
public static String  _itemclick(String _meid) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub itemClick(meid As String)";
 //BA.debugLineNum = 61;BA.debugLine="pg.Message(meid)";
_pg._message /*String*/ (_meid);
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private pg As WixPage";
_pg = new b4j.example.wixpage();
 //BA.debugLineNum = 4;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
}
