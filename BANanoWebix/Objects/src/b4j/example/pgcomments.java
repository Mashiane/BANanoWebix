package b4j.example;


import anywheresoftware.b4a.BA;

public class pgcomments extends Object{
public static pgcomments mostCurrent = new pgcomments();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.pgcomments", null);
		ba.loadHtSubs(pgcomments.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.pgcomments", ba);
		}
	}
    public static Class<?> getObject() {
		return pgcomments.class;
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
public static b4j.example.pggrouplist _pggrouplist = null;
public static b4j.example.pgcontext _pgcontext = null;
public static b4j.example.pggooglemap _pggooglemap = null;
public static b4j.example.pguploader1 _pguploader1 = null;
public static b4j.example.pguploader2 _pguploader2 = null;
public static b4j.example.pguploader3 _pguploader3 = null;
public static String  _init() throws Exception{
b4j.example.wixrow _r1 = null;
b4j.example.wixtoolbar _tblbar = null;
b4j.example.wixrow _r2 = null;
anywheresoftware.b4a.objects.collections.List _ud = null;
anywheresoftware.b4a.objects.collections.List _cd = null;
b4j.example.wixcomments _comments = null;
 //BA.debugLineNum = 17;BA.debugLine="Sub Init";
 //BA.debugLineNum = 18;BA.debugLine="pg.Initialize(\"forms\")";
_pg._initialize /*b4j.example.wixpage*/ (ba,"forms");
 //BA.debugLineNum = 19;BA.debugLine="Dim R1 As WixRow";
_r1 = new b4j.example.wixrow();
 //BA.debugLineNum = 20;BA.debugLine="R1.Initialize(\"R1\")";
_r1._initialize /*b4j.example.wixrow*/ (ba,"R1");
 //BA.debugLineNum = 23;BA.debugLine="Dim tblBar As WixToolBar";
_tblbar = new b4j.example.wixtoolbar();
 //BA.debugLineNum = 24;BA.debugLine="tblBar.Initialize(\"tblBar\")";
_tblbar._initialize /*b4j.example.wixtoolbar*/ (ba,"tblBar");
 //BA.debugLineNum = 25;BA.debugLine="tblBar.CreateIcon(\"menuopen\").SetIcon(\"mdi mdi-me";
_tblbar._createicon /*b4j.example.wixicon*/ ("menuopen")._seticon /*b4j.example.wixicon*/ ("mdi mdi-menu")._setclick /*b4j.example.wixicon*/ ((com.ab.banano.BANanoObject)(_banano.CallBack(pgcomments.getObject(),"OpenMenu",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)))))._pop /*String*/ ();
 //BA.debugLineNum = 26;BA.debugLine="tblBar.CreateLabel(\"heading\").SetLabel(\"Lesson 17";
_tblbar._createlabel /*b4j.example.wixlabel*/ ("heading")._setlabel /*b4j.example.wixlabel*/ ("Lesson 17: Comments")._pop /*String*/ ();
 //BA.debugLineNum = 27;BA.debugLine="tblBar.AddSpacer";
_tblbar._addspacer /*b4j.example.wixtoolbar*/ ();
 //BA.debugLineNum = 28;BA.debugLine="tblBar.CreateIcon(\"\").SetIcon(\"mdi mdi-comment\").";
_tblbar._createicon /*b4j.example.wixicon*/ ("")._seticon /*b4j.example.wixicon*/ ("mdi mdi-comment")._setbadge /*b4j.example.wixicon*/ ("4")._pop /*String*/ ();
 //BA.debugLineNum = 29;BA.debugLine="tblBar.CreateIcon(\"\").SetIcon(\"mdi mdi-bell\").Set";
_tblbar._createicon /*b4j.example.wixicon*/ ("")._seticon /*b4j.example.wixicon*/ ("mdi mdi-bell")._setbadge /*b4j.example.wixicon*/ ("10")._pop /*String*/ ();
 //BA.debugLineNum = 30;BA.debugLine="tblBar.setPadding(3)";
_tblbar._setpadding /*b4j.example.wixtoolbar*/ (BA.NumberToString(3));
 //BA.debugLineNum = 33;BA.debugLine="R1.AddRows(tblBar.Item)";
_r1._addrows /*b4j.example.wixrow*/ (_tblbar._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 35;BA.debugLine="pg.Page.AddRow(R1)";
_pg._page /*b4j.example.wixelement*/ ._addrow /*String*/ (_r1);
 //BA.debugLineNum = 37;BA.debugLine="Dim R2 As WixRow";
_r2 = new b4j.example.wixrow();
 //BA.debugLineNum = 38;BA.debugLine="R2.Initialize(\"R2\")";
_r2._initialize /*b4j.example.wixrow*/ (ba,"R2");
 //BA.debugLineNum = 40;BA.debugLine="Dim ud As List = BANano.RunJavascriptMethod(\"getU";
_ud = new anywheresoftware.b4a.objects.collections.List();
_ud.setObject((java.util.List)(_banano.RunJavascriptMethod("getUsers",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)))));
 //BA.debugLineNum = 41;BA.debugLine="Dim cd As List = BANano.RunJavascriptMethod(\"getC";
_cd = new anywheresoftware.b4a.objects.collections.List();
_cd.setObject((java.util.List)(_banano.RunJavascriptMethod("getComments",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)))));
 //BA.debugLineNum = 43;BA.debugLine="Dim comments As WixComments";
_comments = new b4j.example.wixcomments();
 //BA.debugLineNum = 44;BA.debugLine="comments.Initialize(\"comments\").SetUsers(ud).SetD";
_comments._initialize /*b4j.example.wixcomments*/ (ba,"comments")._setusers /*b4j.example.wixcomments*/ (_ud)._setdata /*b4j.example.wixcomments*/ (_cd)._setcurrentuser /*b4j.example.wixcomments*/ ((int) (4))._setmentions /*b4j.example.wixcomments*/ (anywheresoftware.b4a.keywords.Common.True)._setmodechat /*b4j.example.wixcomments*/ ("");
 //BA.debugLineNum = 46;BA.debugLine="R2.AddColumns(comments.item)";
_r2._addcolumns /*b4j.example.wixrow*/ (_comments._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 47;BA.debugLine="pg.Page.AddRow(R2)";
_pg._page /*b4j.example.wixelement*/ ._addrow /*String*/ (_r2);
 //BA.debugLineNum = 48;BA.debugLine="pg.ui";
_pg._ui /*String*/ ();
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
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
}
