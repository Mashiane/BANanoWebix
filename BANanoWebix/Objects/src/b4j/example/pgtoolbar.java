package b4j.example;


import anywheresoftware.b4a.BA;

public class pgtoolbar extends Object{
public static pgtoolbar mostCurrent = new pgtoolbar();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.pgtoolbar", null);
		ba.loadHtSubs(pgtoolbar.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.pgtoolbar", ba);
		}
	}
    public static Class<?> getObject() {
		return pgtoolbar.class;
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
public static b4j.example.pgcontext _pgcontext = null;
public static b4j.example.pggooglemap _pggooglemap = null;
public static b4j.example.pguploader1 _pguploader1 = null;
public static b4j.example.pguploader2 _pguploader2 = null;
public static b4j.example.pguploader3 _pguploader3 = null;
public static String  _btnclose_click() throws Exception{
boolean _result = false;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 78;BA.debugLine="Sub btnClose_click";
 //BA.debugLineNum = 79;BA.debugLine="Dim result As Boolean = False";
_result = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 80;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Me,\"clos";
_cb = (com.ab.banano.BANanoObject)(_banano.CallBack(pgtoolbar.getObject(),"closeresult",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_result)})));
 //BA.debugLineNum = 81;BA.debugLine="pg.Confirm(cb, \"Confirm Close\", \"Are you sure tha";
_pg._confirm /*String*/ (_cb,"Confirm Close","Are you sure that you want to close?");
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return "";
}
public static String  _btnnew_click() throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub btnNew_click";
 //BA.debugLineNum = 67;BA.debugLine="pg.Message(\"btnNew_click\")";
_pg._message /*String*/ ("btnNew_click");
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public static String  _btnopen_click() throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub btnOpen_click";
 //BA.debugLineNum = 71;BA.debugLine="pg.Message(\"btnOpen_click\")";
_pg._message /*String*/ ("btnOpen_click");
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return "";
}
public static String  _btnsave_click() throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Sub btnSave_click";
 //BA.debugLineNum = 75;BA.debugLine="pg.Message(\"btnSave_click\")";
_pg._message /*String*/ ("btnSave_click");
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return "";
}
public static String  _closeresult(boolean _result) throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Sub closeresult(result As Boolean)";
 //BA.debugLineNum = 86;BA.debugLine="pg.Message(result)";
_pg._message /*String*/ (BA.ObjectToString(_result));
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return "";
}
public static String  _down_click() throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Sub Down_click";
 //BA.debugLineNum = 63;BA.debugLine="pg.ToastError(\"Down!\")";
_pg._toasterror /*String*/ ("Down!");
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return "";
}
public static String  _init() throws Exception{
b4j.example.wixheader _hdr = null;
b4j.example.wixtoolbar _tblbar = null;
b4j.example.wixbutton _btnopen = null;
b4j.example.wixbutton _btnsave = null;
b4j.example.wixicon _icn = null;
 //BA.debugLineNum = 8;BA.debugLine="Sub Init";
 //BA.debugLineNum = 9;BA.debugLine="pg.Initialize(\"\")";
_pg._initialize /*b4j.example.wixpage*/ (ba,"");
 //BA.debugLineNum = 12;BA.debugLine="Dim hdr As WixHeader";
_hdr = new b4j.example.wixheader();
 //BA.debugLineNum = 13;BA.debugLine="hdr.Initialize(\"hdr\")";
_hdr._initialize /*b4j.example.wixheader*/ (ba,"hdr");
 //BA.debugLineNum = 14;BA.debugLine="hdr.Header.SetTemplate(\"Lesson 5: WixToolBar\")";
_hdr._header /*b4j.example.wixelement*/ ._settemplate /*b4j.example.wixelement*/ ((Object)("Lesson 5: WixToolBar"));
 //BA.debugLineNum = 15;BA.debugLine="hdr.Header.AddToRows(pg.Page)";
_hdr._header /*b4j.example.wixelement*/ ._addtorows /*String*/ (_pg._page /*b4j.example.wixelement*/ );
 //BA.debugLineNum = 18;BA.debugLine="Dim tblBar As WixToolBar";
_tblbar = new b4j.example.wixtoolbar();
 //BA.debugLineNum = 19;BA.debugLine="tblBar.Initialize(\"\")";
_tblbar._initialize /*b4j.example.wixtoolbar*/ (ba,"");
 //BA.debugLineNum = 21;BA.debugLine="tblBar.ToolBar.SetHeight(60).SetVisibleBatch(1)";
_tblbar._toolbar /*b4j.example.wixelement*/ ._setheight /*b4j.example.wixelement*/ ((int) (60))._setvisiblebatch /*b4j.example.wixelement*/ ((int) (1));
 //BA.debugLineNum = 23;BA.debugLine="tblBar.ToolBar.SetDefaultWidth(90).SetDefaultType";
_tblbar._toolbar /*b4j.example.wixelement*/ ._setdefaultwidth /*b4j.example.wixelement*/ ((int) (90))._setdefaulttypeiconbutton /*b4j.example.wixelement*/ ();
 //BA.debugLineNum = 25;BA.debugLine="tblBar.CreateButton(\"btnNew\").SetLabel(\"New\").Set";
_tblbar._createbutton /*b4j.example.wixbutton*/ ("btnNew")._setlabel /*b4j.example.wixbutton*/ ("New")._seticon /*b4j.example.wixbutton*/ ("file")._setclick /*b4j.example.wixbutton*/ ((com.ab.banano.BANanoObject)(_banano.CallBack(pgtoolbar.getObject(),"btnnew_click",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)))))._setbatch /*b4j.example.wixbutton*/ ((int) (1))._pop /*String*/ ();
 //BA.debugLineNum = 27;BA.debugLine="Dim btnOpen As WixButton";
_btnopen = new b4j.example.wixbutton();
 //BA.debugLineNum = 28;BA.debugLine="btnOpen.Initialize(\"btnOpen\").SetLabel(\"Open\").Se";
_btnopen._initialize /*b4j.example.wixbutton*/ (ba,"btnOpen")._setlabel /*b4j.example.wixbutton*/ ("Open")._seticon /*b4j.example.wixbutton*/ ("folder-open")._setbatch /*b4j.example.wixbutton*/ ((int) (2))._setclick /*b4j.example.wixbutton*/ ((com.ab.banano.BANanoObject)(_banano.CallBack(pgtoolbar.getObject(),"btnopen_click",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)))))._addtotoolbar /*String*/ (_tblbar);
 //BA.debugLineNum = 30;BA.debugLine="tblBar.CreateButton(\"btnClose\").SetLabel(\"Close\")";
_tblbar._createbutton /*b4j.example.wixbutton*/ ("btnClose")._setlabel /*b4j.example.wixbutton*/ ("Close")._seticon /*b4j.example.wixbutton*/ ("window-close")._setbatch /*b4j.example.wixbutton*/ ((int) (1))._setclick /*b4j.example.wixbutton*/ ((com.ab.banano.BANanoObject)(_banano.CallBack(pgtoolbar.getObject(),"btnclose_click",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)))))._addtotoolbar /*String*/ (_tblbar);
 //BA.debugLineNum = 32;BA.debugLine="Dim btnSave As WixButton";
_btnsave = new b4j.example.wixbutton();
 //BA.debugLineNum = 33;BA.debugLine="btnSave.Initialize(\"btnSave\").SetLabel(\"Save\").Se";
_btnsave._initialize /*b4j.example.wixbutton*/ (ba,"btnSave")._setlabel /*b4j.example.wixbutton*/ ("Save")._setwidth /*b4j.example.wixbutton*/ ((int) (90))._settypeiconbutton /*b4j.example.wixbutton*/ ("")._seticon /*b4j.example.wixbutton*/ ("window-close")._setbatch /*b4j.example.wixbutton*/ ((int) (2))._setclick /*b4j.example.wixbutton*/ ((com.ab.banano.BANanoObject)(_banano.CallBack(pgtoolbar.getObject(),"btnsave_click",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)))))._addtotoolbar /*String*/ (_tblbar);
 //BA.debugLineNum = 35;BA.debugLine="tblBar.AddSpacer";
_tblbar._addspacer /*b4j.example.wixtoolbar*/ ();
 //BA.debugLineNum = 38;BA.debugLine="tblBar.CreateToggle(\"imgt3\").SetTypeIcon(\"\").SetO";
_tblbar._createtoggle /*b4j.example.wixbutton*/ ("imgt3")._settypeicon /*b4j.example.wixbutton*/ ("")._setofficon /*b4j.example.wixbutton*/ ("wxi-close")._setonicon /*b4j.example.wixbutton*/ ("wxi-check")._setlabel /*b4j.example.wixbutton*/ ("Music")._pop /*String*/ ();
 //BA.debugLineNum = 39;BA.debugLine="tblBar.CreateToggle(\"imgt4\").SetTypeIconButtonTop";
_tblbar._createtoggle /*b4j.example.wixbutton*/ ("imgt4")._settypeiconbuttontop /*b4j.example.wixbutton*/ ("")._seticon /*b4j.example.wixbutton*/ ("wxi-sync")._setonlabel /*b4j.example.wixbutton*/ ("Wi-Fi On")._setofflabel /*b4j.example.wixbutton*/ ("Wi-Fi Off")._pop /*String*/ ();
 //BA.debugLineNum = 40;BA.debugLine="tblBar.AddSpacer";
_tblbar._addspacer /*b4j.example.wixtoolbar*/ ();
 //BA.debugLineNum = 41;BA.debugLine="tblBar.CreateButton(\"btnImage\").SetLabel(\"Image\")";
_tblbar._createbutton /*b4j.example.wixbutton*/ ("btnImage")._setlabel /*b4j.example.wixbutton*/ ("Image")._settypeimage /*b4j.example.wixbutton*/ ("")._setwidth /*b4j.example.wixbutton*/ ((int) (150))._setimage /*b4j.example.wixbutton*/ ("./assets/icons8-save-as-100.png")._pop /*String*/ ();
 //BA.debugLineNum = 42;BA.debugLine="tblBar.CreateButton(\"btnImageButton\").SetLabel(\"I";
_tblbar._createbutton /*b4j.example.wixbutton*/ ("btnImageButton")._setlabel /*b4j.example.wixbutton*/ ("ImageButton")._settypeimagebutton /*b4j.example.wixbutton*/ ("")._setimage /*b4j.example.wixbutton*/ ("./assets/icons8-compose-40.png")._setwidth /*b4j.example.wixbutton*/ ((int) (40))._pop /*String*/ ();
 //BA.debugLineNum = 43;BA.debugLine="tblBar.CreateButton(\"btnIcon\").SetTypeIcon(\"\").Se";
_tblbar._createbutton /*b4j.example.wixbutton*/ ("btnIcon")._settypeicon /*b4j.example.wixbutton*/ ("")._seticon /*b4j.example.wixbutton*/ ("wxi-file")._setwidth /*b4j.example.wixbutton*/ ((int) (200))._setlabel /*b4j.example.wixbutton*/ ("File Name")._pop /*String*/ ();
 //BA.debugLineNum = 45;BA.debugLine="tblBar.AddSpacer";
_tblbar._addspacer /*b4j.example.wixtoolbar*/ ();
 //BA.debugLineNum = 48;BA.debugLine="Dim icn As WixIcon";
_icn = new b4j.example.wixicon();
 //BA.debugLineNum = 49;BA.debugLine="icn.Initialize(\"icn\").SetIcon(\"wxi-angle-up\").Set";
_icn._initialize /*b4j.example.wixicon*/ (ba,"icn")._seticon /*b4j.example.wixicon*/ ("wxi-angle-up")._setclick /*b4j.example.wixicon*/ ((com.ab.banano.BANanoObject)(_banano.CallBack(pgtoolbar.getObject(),"up_click",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)))))._addtotoolbar /*String*/ (_tblbar);
 //BA.debugLineNum = 51;BA.debugLine="tblBar.CreateIcon(\"icn1\").SetIcon(\"wxi-angle-down";
_tblbar._createicon /*b4j.example.wixicon*/ ("icn1")._seticon /*b4j.example.wixicon*/ ("wxi-angle-down")._setclick /*b4j.example.wixicon*/ ((com.ab.banano.BANanoObject)(_banano.CallBack(pgtoolbar.getObject(),"down_click",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)))))._pop /*String*/ ();
 //BA.debugLineNum = 53;BA.debugLine="tblBar.AddToPage(pg)";
_tblbar._addtopage /*String*/ (_pg);
 //BA.debugLineNum = 55;BA.debugLine="pg.ui";
_pg._ui /*String*/ ();
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private pg As WixPage";
_pg = new b4j.example.wixpage();
 //BA.debugLineNum = 5;BA.debugLine="Public BANano As BANano ' ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public static String  _up_click() throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub Up_click";
 //BA.debugLineNum = 59;BA.debugLine="pg.Message(\"up\")";
_pg._message /*String*/ ("up");
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
}
