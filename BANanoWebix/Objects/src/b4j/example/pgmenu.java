package b4j.example;


import anywheresoftware.b4a.BA;

public class pgmenu extends Object{
public static pgmenu mostCurrent = new pgmenu();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.pgmenu", null);
		ba.loadHtSubs(pgmenu.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.pgmenu", ba);
		}
	}
    public static Class<?> getObject() {
		return pgmenu.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static b4j.example.wixpage _pg = null;
public static com.ab.banano.BANano _banano = null;
public static com.ab.banano.BANanoObject _smux = null;
public static com.ab.banano.BANanoObject _winux = null;
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
public static b4j.example.pglayouts1 _pglayouts1 = null;
public static b4j.example.pglayouts2 _pglayouts2 = null;
public static b4j.example.pglayouts _pglayouts = null;
public static b4j.example.pglayout _pglayout = null;
public static b4j.example.pglist _pglist = null;
public static b4j.example.pgunitlist _pgunitlist = null;
public static b4j.example.pgpropertysheet _pgpropertysheet = null;
public static b4j.example.pgtree _pgtree = null;
public static b4j.example.pgtreetable _pgtreetable = null;
public static b4j.example.pgsidebar _pgsidebar = null;
public static b4j.example.pgcomments _pgcomments = null;
public static String  _init() throws Exception{
b4j.example.wixtoolbar _tblbar = null;
b4j.example.wixsidemenu _sm = null;
com.ab.banano.BANanoEvent _e = null;
b4j.example.wixwindow _win = null;
b4j.example.wixmenu _menu = null;
anywheresoftware.b4a.objects.collections.Map _meid = null;
 //BA.debugLineNum = 9;BA.debugLine="Sub Init";
 //BA.debugLineNum = 10;BA.debugLine="pg.Initialize(\"forms\")";
_pg._initialize /*b4j.example.wixpage*/ (ba,"forms");
 //BA.debugLineNum = 13;BA.debugLine="Dim tblBar As WixToolBar";
_tblbar = new b4j.example.wixtoolbar();
 //BA.debugLineNum = 14;BA.debugLine="tblBar.Initialize(\"tblBar\")";
_tblbar._initialize /*b4j.example.wixtoolbar*/ (ba,"tblBar");
 //BA.debugLineNum = 15;BA.debugLine="tblBar.CreateIcon(\"menuopen\").SetIcon(\"mdi mdi-me";
_tblbar._createicon /*b4j.example.wixicon*/ ("menuopen")._seticon /*b4j.example.wixicon*/ ("mdi mdi-menu")._setclick /*b4j.example.wixicon*/ ((com.ab.banano.BANanoObject)(_banano.CallBack(pgmenu.getObject(),"OpenMenu",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)))))._pop /*String*/ ();
 //BA.debugLineNum = 16;BA.debugLine="tblBar.CreateLabel(\"heading\").SetLabel(\"Lesson 15";
_tblbar._createlabel /*b4j.example.wixlabel*/ ("heading")._setlabel /*b4j.example.wixlabel*/ ("Lesson 15: Menus")._pop /*String*/ ();
 //BA.debugLineNum = 17;BA.debugLine="pg.Page.AddRows(tblBar.Item)";
_pg._page /*b4j.example.wixelement*/ ._addrows /*b4j.example.wixelement*/ (_tblbar._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 20;BA.debugLine="Dim sm As WixSideMenu";
_sm = new b4j.example.wixsidemenu();
 //BA.debugLineNum = 21;BA.debugLine="sm.Initialize(\"sm\")";
_sm._initialize /*b4j.example.wixsidemenu*/ (ba,"sm");
 //BA.debugLineNum = 22;BA.debugLine="sm.SetTemplate(\"<span class='webix_icon mdi mdi-#";
_sm._settemplate /*b4j.example.wixsidemenu*/ ("<span class='webix_icon mdi mdi-#icon#'></span> #value#");
 //BA.debugLineNum = 24;BA.debugLine="sm.AddItem(\"new\", \"New\", \"account\")";
_sm._additem /*String*/ ("new","New","account");
 //BA.debugLineNum = 25;BA.debugLine="sm.AddItem(\"open\", \"Open\", \"cube\")";
_sm._additem /*String*/ ("open","Open","cube");
 //BA.debugLineNum = 26;BA.debugLine="sm.AddItem(\"close\", \"Close\", \"database\")";
_sm._additem /*String*/ ("close","Close","database");
 //BA.debugLineNum = 29;BA.debugLine="smUX = pg.UX(sm.Item)";
_smux = _pg._ux /*com.ab.banano.BANanoObject*/ (_sm._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 31;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 32;BA.debugLine="Dim win As WixWindow";
_win = new b4j.example.wixwindow();
 //BA.debugLineNum = 33;BA.debugLine="win.Initialize(\"myWindow\").SetWidth(300).SetHeigh";
_win._initialize /*b4j.example.wixwindow*/ (ba,"myWindow")._setwidth /*b4j.example.wixwindow*/ ((int) (300))._setheight /*b4j.example.wixwindow*/ ((int) (200))._setleft /*b4j.example.wixwindow*/ ((int) (100))._settop /*b4j.example.wixwindow*/ ((int) (100))._setmove /*b4j.example.wixwindow*/ (anywheresoftware.b4a.keywords.Common.True)._setresize /*b4j.example.wixwindow*/ (anywheresoftware.b4a.keywords.Common.True)._setclose /*b4j.example.wixwindow*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 34;BA.debugLine="win.SetHead(\"A window unto the world!\")";
_win._sethead /*b4j.example.wixwindow*/ ("A window unto the world!");
 //BA.debugLineNum = 35;BA.debugLine="win.SetPositionCenter(\"\")";
_win._setpositioncenter /*b4j.example.wixwindow*/ (BA.ObjectToBoolean(""));
 //BA.debugLineNum = 37;BA.debugLine="win.ToolBar.SetMargin(-4)";
_win._toolbar /*b4j.example.wixtoolbar*/ ._setmargin /*b4j.example.wixtoolbar*/ ((int) (-4));
 //BA.debugLineNum = 38;BA.debugLine="win.ToolBar.CreateLabel(\"lbl\").SetLabel(\"A window";
_win._toolbar /*b4j.example.wixtoolbar*/ ._createlabel /*b4j.example.wixlabel*/ ("lbl")._setlabel /*b4j.example.wixlabel*/ ("A window unto the world!")._pop /*String*/ ();
 //BA.debugLineNum = 39;BA.debugLine="win.ToolBar.CreateIcon(\"icnback\").SetIcon(\"mdi md";
_win._toolbar /*b4j.example.wixtoolbar*/ ._createicon /*b4j.example.wixicon*/ ("icnback")._seticon /*b4j.example.wixicon*/ ("mdi mdi-arrow-left")._pop /*String*/ ();
 //BA.debugLineNum = 40;BA.debugLine="win.ToolBar.CreateIcon(\"icnclose\").SetIcon(\"mdi m";
_win._toolbar /*b4j.example.wixtoolbar*/ ._createicon /*b4j.example.wixicon*/ ("icnclose")._seticon /*b4j.example.wixicon*/ ("mdi mdi-close")._pop /*String*/ ();
 //BA.debugLineNum = 42;BA.debugLine="win.SetToolBar(True)";
_win._settoolbar /*b4j.example.wixwindow*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 43;BA.debugLine="win.SetTemplate(\"<br>We can show HTML here, or ot";
_win._settemplate /*b4j.example.wixwindow*/ ("<br>We can show HTML here, or other Webix components - we could, in fact, build an entire application UI in a window!");
 //BA.debugLineNum = 46;BA.debugLine="winUX = pg.UX(win.Item)";
_winux = _pg._ux /*com.ab.banano.BANanoObject*/ (_win._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 49;BA.debugLine="Dim menu As WixMenu";
_menu = new b4j.example.wixmenu();
 //BA.debugLineNum = 50;BA.debugLine="menu.Initialize(\"menu\")";
_menu._initialize /*b4j.example.wixmenu*/ (ba,"menu");
 //BA.debugLineNum = 51;BA.debugLine="menu.SetSubMenuPosRight(\"\")";
_menu._setsubmenuposright /*b4j.example.wixmenu*/ ("");
 //BA.debugLineNum = 54;BA.debugLine="menu.SetSelect(True)";
_menu._setselect /*b4j.example.wixmenu*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 55;BA.debugLine="menu.setWidth(180)";
_menu._setwidth /*b4j.example.wixmenu*/ ((int) (180));
 //BA.debugLineNum = 56;BA.debugLine="menu.SetHeight(300)";
_menu._setheight /*b4j.example.wixmenu*/ ((int) (300));
 //BA.debugLineNum = 59;BA.debugLine="menu.AddItem(\"\", \"mt\", \"Man Tactical\", \"\",\"\",\"3\",";
_menu._additem /*b4j.example.wixmenu*/ ("","mt","Man Tactical","","","3","");
 //BA.debugLineNum = 60;BA.debugLine="menu.AddItem(\"mt\", \"mtw\", \"Worf\", \"\",\"\",\"\",\"\")";
_menu._additem /*b4j.example.wixmenu*/ ("mt","mtw","Worf","","","","");
 //BA.debugLineNum = 61;BA.debugLine="menu.AddItem(\"mt\", \"mtd\", \"Data\", \"\",\"\",\"\",\"\")";
_menu._additem /*b4j.example.wixmenu*/ ("mt","mtd","Data","","","","");
 //BA.debugLineNum = 62;BA.debugLine="menu.AddSeparator(\"mt\")";
_menu._addseparator /*b4j.example.wixmenu*/ ("mt");
 //BA.debugLineNum = 63;BA.debugLine="menu.AddItem(\"mt\", \"mtr\", \"Riker\", \"\",\"\",\"\",\"\")";
_menu._additem /*b4j.example.wixmenu*/ ("mt","mtr","Riker","","","","");
 //BA.debugLineNum = 64;BA.debugLine="menu.AddItem(\"\", \"fp\", \"Fire Phasers\",\"\",\"\",\"\",\"\"";
_menu._additem /*b4j.example.wixmenu*/ ("","fp","Fire Phasers","","","","");
 //BA.debugLineNum = 65;BA.debugLine="menu.AddItem(\"\", \"ft\", \"Fire Torpedoes\", \"\",\"\",\"\"";
_menu._additem /*b4j.example.wixmenu*/ ("","ft","Fire Torpedoes","","","","");
 //BA.debugLineNum = 66;BA.debugLine="menu.AddItem(\"\", \"win\", \"Window\", \"\",\"\",\"\",\"\")";
_menu._additem /*b4j.example.wixmenu*/ ("","win","Window","","","","");
 //BA.debugLineNum = 67;BA.debugLine="menu.AddItem(\"\", \"iframe\", \"iFrame\", \"\",\"\",\"\",\"\")";
_menu._additem /*b4j.example.wixmenu*/ ("","iframe","iFrame","","","","");
 //BA.debugLineNum = 69;BA.debugLine="pg.Page.AddRows(menu.Item)";
_pg._page /*b4j.example.wixelement*/ ._addrows /*b4j.example.wixelement*/ (_menu._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 81;BA.debugLine="pg.ui";
_pg._ui /*String*/ ();
 //BA.debugLineNum = 83;BA.debugLine="Dim meid As Map";
_meid = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 84;BA.debugLine="pg.OnItemClick(\"menu\", BANano.CallBack(Me, \"itemC";
_pg._onitemclick /*String*/ ("menu",(com.ab.banano.BANanoObject)(_banano.CallBack(pgmenu.getObject(),"itemClick",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_meid.getObject())}))));
 //BA.debugLineNum = 85;BA.debugLine="pg.OnItemClick(\"sm\", BANano.CallBack(Me, \"itemCli";
_pg._onitemclick /*String*/ ("sm",(com.ab.banano.BANanoObject)(_banano.CallBack(pgmenu.getObject(),"itemClick",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_meid.getObject())}))));
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return "";
}
public static String  _itemclick(String _meid) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Sub itemClick(meid As String)";
 //BA.debugLineNum = 104;BA.debugLine="Select Case meid";
switch (BA.switchObjectToInt(_meid,"iframe","win","mt")) {
case 0: {
 break; }
case 1: {
 //BA.debugLineNum = 107;BA.debugLine="pg.Show(winUX)";
_pg._show /*String*/ (_winux);
 break; }
case 2: {
 //BA.debugLineNum = 109;BA.debugLine="pg.ShowPopUp(\"I'm loving Webix Intergrations!\",";
_pg._showpopup /*String*/ ("I'm loving Webix Intergrations!",(int) (75),(int) (375),"center");
 break; }
default: {
 //BA.debugLineNum = 111;BA.debugLine="pg.Message(meid)";
_pg._message /*String*/ (_meid);
 break; }
}
;
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return "";
}
public static String  _openmenu(String _meid) throws Exception{
boolean _bvisible = false;
 //BA.debugLineNum = 93;BA.debugLine="Sub OpenMenu(meid As String)";
 //BA.debugLineNum = 95;BA.debugLine="Dim bVisible As Boolean = pg.IsVisible(smUX)";
_bvisible = _pg._isvisible /*boolean*/ (_smux);
 //BA.debugLineNum = 96;BA.debugLine="If bVisible Then";
if (_bvisible) { 
 //BA.debugLineNum = 97;BA.debugLine="pg.Hide(smUX)";
_pg._hide /*String*/ (_smux);
 }else {
 //BA.debugLineNum = 99;BA.debugLine="pg.Show(smUX)";
_pg._show /*String*/ (_smux);
 };
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private pg As WixPage";
_pg = new b4j.example.wixpage();
 //BA.debugLineNum = 4;BA.debugLine="Public BANano As BANano";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 5;BA.debugLine="Private smUX As BANanoObject";
_smux = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 6;BA.debugLine="Private winUX As BANanoObject";
_winux = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public static String  _win_close(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub win_close(e As BANanoEvent)";
 //BA.debugLineNum = 90;BA.debugLine="pg.Close(winUX)";
_pg._close /*String*/ (_winux);
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return "";
}
}
