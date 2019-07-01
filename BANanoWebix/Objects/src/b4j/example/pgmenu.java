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
public static b4j.example.wixwindow _win = null;
public static b4j.example.wixsidemenu _sm = null;
public static b4j.example.main _main = null;
public static b4j.example.pgtabbar _pgtabbar = null;
public static b4j.example.pgtree _pgtree = null;
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
public static b4j.example.pgcontext _pgcontext = null;
public static b4j.example.pggooglemap _pggooglemap = null;
public static b4j.example.pguploader1 _pguploader1 = null;
public static String  _createsidemenu() throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Sub CreateSideMenu";
 //BA.debugLineNum = 30;BA.debugLine="sm.Initialize(\"sm\")";
_sm._initialize /*b4j.example.wixsidemenu*/ (ba,"sm");
 //BA.debugLineNum = 31;BA.debugLine="sm.SetSelect(True)";
_sm._setselect /*b4j.example.wixsidemenu*/ ((Object)(anywheresoftware.b4a.keywords.Common.True));
 //BA.debugLineNum = 32;BA.debugLine="sm.AddItem(\"new\", \"New\", \"\", \"mdi mdi-account\",\"2";
_sm._additem /*b4j.example.wixsidemenu*/ ("new","New","","mdi mdi-account","2","");
 //BA.debugLineNum = 33;BA.debugLine="sm.AddItem(\"open\", \"Open\", \"http://www.b4x.com\",";
_sm._additem /*b4j.example.wixsidemenu*/ ("open","Open","http://www.b4x.com","mdi mdi-cube","","");
 //BA.debugLineNum = 34;BA.debugLine="sm.AddItem(\"close\", \"Close\", \"\", \"mdi mdi-databas";
_sm._additem /*b4j.example.wixsidemenu*/ ("close","Close","","mdi mdi-database","3","");
 //BA.debugLineNum = 35;BA.debugLine="smUX = pg.AddSideMenu(sm)";
_smux = _pg._addsidemenu /*com.ab.banano.BANanoObject*/ (_sm);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return "";
}
public static String  _createwindow() throws Exception{
 //BA.debugLineNum = 11;BA.debugLine="Sub CreateWindow";
 //BA.debugLineNum = 12;BA.debugLine="win.Initialize(\"myWindow\").SetWidth(300).SetHeigh";
_win._initialize /*b4j.example.wixwindow*/ (ba,"myWindow")._setwidth /*b4j.example.wixwindow*/ ((int) (300))._setheight /*b4j.example.wixwindow*/ ((int) (200))._setleft /*b4j.example.wixwindow*/ ((int) (100))._settop /*b4j.example.wixwindow*/ ((int) (100))._setmove /*b4j.example.wixwindow*/ (anywheresoftware.b4a.keywords.Common.True)._setresize /*b4j.example.wixwindow*/ (anywheresoftware.b4a.keywords.Common.True)._setclose /*b4j.example.wixwindow*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 13;BA.debugLine="win.SetHead(\"A window unto the world!\")";
_win._sethead /*b4j.example.wixwindow*/ ("A window unto the world!");
 //BA.debugLineNum = 14;BA.debugLine="win.SetPositionCenter(\"\")";
_win._setpositioncenter /*b4j.example.wixwindow*/ (BA.ObjectToBoolean(""));
 //BA.debugLineNum = 16;BA.debugLine="win.ToolBar.SetMargin(-4)";
_win._toolbar /*b4j.example.wixtoolbar*/ ._setmargin /*b4j.example.wixtoolbar*/ ((int) (-4));
 //BA.debugLineNum = 17;BA.debugLine="win.ToolBar.CreateLabel(\"lbl\").SetLabel(\"A window";
_win._toolbar /*b4j.example.wixtoolbar*/ ._createlabel /*b4j.example.wixlabel*/ ("lbl")._setlabel /*b4j.example.wixlabel*/ ("A window unto the world!")._pop /*String*/ ();
 //BA.debugLineNum = 18;BA.debugLine="win.ToolBar.CreateIcon(\"icnback\").SetIcon(\"mdi md";
_win._toolbar /*b4j.example.wixtoolbar*/ ._createicon /*b4j.example.wixicon*/ ("icnback")._seticon /*b4j.example.wixicon*/ ("mdi mdi-arrow-left")._pop /*String*/ ();
 //BA.debugLineNum = 19;BA.debugLine="win.ToolBar.CreateIcon(\"icnclose\").SetIcon(\"mdi m";
_win._toolbar /*b4j.example.wixtoolbar*/ ._createicon /*b4j.example.wixicon*/ ("icnclose")._seticon /*b4j.example.wixicon*/ ("mdi mdi-close")._pop /*String*/ ();
 //BA.debugLineNum = 21;BA.debugLine="win.SetToolBar(True)";
_win._settoolbar /*b4j.example.wixwindow*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 22;BA.debugLine="win.SetTemplate(\"<br>We can show HTML here, or ot";
_win._settemplate /*b4j.example.wixwindow*/ ("<br>We can show HTML here, or other Webix components - we could, in fact, build an entire application UI in a window!");
 //BA.debugLineNum = 25;BA.debugLine="winUX = pg.AddWindow(win)";
_winux = _pg._addwindow /*com.ab.banano.BANanoObject*/ (_win);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return "";
}
public static String  _init() throws Exception{
b4j.example.wixtoolbar _tblbar = null;
b4j.example.wixmenu _menu = null;
anywheresoftware.b4a.objects.collections.List _data = null;
b4j.example.wixmenu _menu1 = null;
anywheresoftware.b4a.objects.collections.Map _meid = null;
 //BA.debugLineNum = 38;BA.debugLine="Sub Init";
 //BA.debugLineNum = 39;BA.debugLine="pg.Initialize(\"forms\")";
_pg._initialize /*b4j.example.wixpage*/ (ba,"forms");
 //BA.debugLineNum = 41;BA.debugLine="Dim tblBar As WixToolBar";
_tblbar = new b4j.example.wixtoolbar();
 //BA.debugLineNum = 42;BA.debugLine="tblBar.Initialize(\"tblBar\")";
_tblbar._initialize /*b4j.example.wixtoolbar*/ (ba,"tblBar");
 //BA.debugLineNum = 43;BA.debugLine="tblBar.CreateIcon(\"menuopen\").SetIcon(\"mdi mdi-me";
_tblbar._createicon /*b4j.example.wixicon*/ ("menuopen")._seticon /*b4j.example.wixicon*/ ("mdi mdi-menu")._setclick /*b4j.example.wixicon*/ ((com.ab.banano.BANanoObject)(_banano.CallBack(pgmenu.getObject(),"OpenMenu",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)))))._pop /*String*/ ();
 //BA.debugLineNum = 44;BA.debugLine="tblBar.CreateLabel(\"heading\").SetLabel(\"Lesson 15";
_tblbar._createlabel /*b4j.example.wixlabel*/ ("heading")._setlabel /*b4j.example.wixlabel*/ ("Lesson 15: Menus")._pop /*String*/ ();
 //BA.debugLineNum = 45;BA.debugLine="pg.Page.AddRows(tblBar.Item)";
_pg._page /*b4j.example.wixelement*/ ._addrows /*b4j.example.wixelement*/ (_tblbar._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 48;BA.debugLine="CreateSideMenu";
_createsidemenu();
 //BA.debugLineNum = 50;BA.debugLine="Dim menu As WixMenu";
_menu = new b4j.example.wixmenu();
 //BA.debugLineNum = 51;BA.debugLine="menu.Initialize(\"menu\")";
_menu._initialize /*b4j.example.wixmenu*/ (ba,"menu");
 //BA.debugLineNum = 52;BA.debugLine="menu.SetSubMenuPosRight(\"\")";
_menu._setsubmenuposright /*b4j.example.wixmenu*/ ("");
 //BA.debugLineNum = 55;BA.debugLine="menu.SetSelect(True)";
_menu._setselect /*b4j.example.wixmenu*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 56;BA.debugLine="menu.setWidth(180)";
_menu._setwidth /*b4j.example.wixmenu*/ ((int) (180));
 //BA.debugLineNum = 57;BA.debugLine="menu.SetHeight(300)";
_menu._setheight /*b4j.example.wixmenu*/ ((int) (300));
 //BA.debugLineNum = 59;BA.debugLine="menu.AddItem(\"\", \"mt\", \"Man Tactical\",\"\",\"\",\"3\",\"";
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
 //BA.debugLineNum = 69;BA.debugLine="Dim data As List = pg.Unflatten(menu.Items,\"subme";
_data = new anywheresoftware.b4a.objects.collections.List();
_data = _pg._unflatten /*anywheresoftware.b4a.objects.collections.List*/ (_menu._items /*anywheresoftware.b4a.objects.collections.List*/ ,"submenu");
 //BA.debugLineNum = 70;BA.debugLine="menu.setdata(data)";
_menu._setdata /*b4j.example.wixmenu*/ (_data);
 //BA.debugLineNum = 71;BA.debugLine="pg.Page.AddRows(menu.Item)";
_pg._page /*b4j.example.wixelement*/ ._addrows /*b4j.example.wixelement*/ (_menu._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 75;BA.debugLine="pg.Page.AddRows(CreateMap())";
_pg._page /*b4j.example.wixelement*/ ._addrows /*b4j.example.wixelement*/ (anywheresoftware.b4a.keywords.Common.createMap(new Object[] {}));
 //BA.debugLineNum = 78;BA.debugLine="Dim menu1 As WixMenu";
_menu1 = new b4j.example.wixmenu();
 //BA.debugLineNum = 79;BA.debugLine="menu1.Initialize(\"menu1\")";
_menu1._initialize /*b4j.example.wixmenu*/ (ba,"menu1");
 //BA.debugLineNum = 81;BA.debugLine="menu1.SetItemSubSign(True)";
_menu1._setitemsubsign /*b4j.example.wixmenu*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 82;BA.debugLine="menu1.SetSelect(True)";
_menu1._setselect /*b4j.example.wixmenu*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 83;BA.debugLine="menu1.setWidth(180)";
_menu1._setwidth /*b4j.example.wixmenu*/ ((int) (180));
 //BA.debugLineNum = 84;BA.debugLine="menu1.SetHeight(300)";
_menu1._setheight /*b4j.example.wixmenu*/ ((int) (300));
 //BA.debugLineNum = 86;BA.debugLine="menu1.SetLayoutY(\"\")";
_menu1._setlayouty /*b4j.example.wixmenu*/ ("");
 //BA.debugLineNum = 87;BA.debugLine="menu1.AddItem(\"\", \"mt\", \"Man Tactical\",\"\",\"\",\"3\",";
_menu1._additem /*b4j.example.wixmenu*/ ("","mt","Man Tactical","","","3","");
 //BA.debugLineNum = 88;BA.debugLine="menu1.AddItem(\"mt\", \"mtw\", \"Worf\", \"\",\"\",\"\",\"\")";
_menu1._additem /*b4j.example.wixmenu*/ ("mt","mtw","Worf","","","","");
 //BA.debugLineNum = 89;BA.debugLine="menu1.AddItem(\"mt\", \"mtd\", \"Data\", \"\",\"\",\"\",\"\")";
_menu1._additem /*b4j.example.wixmenu*/ ("mt","mtd","Data","","","","");
 //BA.debugLineNum = 90;BA.debugLine="menu1.AddSeparator(\"mt\")";
_menu1._addseparator /*b4j.example.wixmenu*/ ("mt");
 //BA.debugLineNum = 91;BA.debugLine="menu1.AddItem(\"mt\", \"mtr\", \"Riker\", \"\",\"\",\"\",\"\")";
_menu1._additem /*b4j.example.wixmenu*/ ("mt","mtr","Riker","","","","");
 //BA.debugLineNum = 92;BA.debugLine="menu1.AddItem(\"\", \"fp\", \"Fire Phasers\",\"\",\"\",\"\",\"";
_menu1._additem /*b4j.example.wixmenu*/ ("","fp","Fire Phasers","","","","");
 //BA.debugLineNum = 93;BA.debugLine="menu1.AddItem(\"\", \"ft\", \"Fire Torpedoes\", \"\",\"\",\"";
_menu1._additem /*b4j.example.wixmenu*/ ("","ft","Fire Torpedoes","","","","");
 //BA.debugLineNum = 94;BA.debugLine="menu1.AddItem(\"\", \"win\", \"Window\", \"\",\"\",\"\",\"\")";
_menu1._additem /*b4j.example.wixmenu*/ ("","win","Window","","","","");
 //BA.debugLineNum = 95;BA.debugLine="menu1.AddItem(\"\", \"iframe\", \"iFrame\", \"\",\"\",\"\",\"\"";
_menu1._additem /*b4j.example.wixmenu*/ ("","iframe","iFrame","","","","");
 //BA.debugLineNum = 96;BA.debugLine="pg.Page.AddRows(menu1.Item)";
_pg._page /*b4j.example.wixelement*/ ._addrows /*b4j.example.wixelement*/ (_menu1._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 112;BA.debugLine="pg.ui";
_pg._ui /*String*/ ();
 //BA.debugLineNum = 114;BA.debugLine="Dim meID As Map";
_meid = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 115;BA.debugLine="pg.onMenuItemClick(\"menu\", BANano.CallBack(Me, \"i";
_pg._onmenuitemclick /*String*/ ("menu",(com.ab.banano.BANanoObject)(_banano.CallBack(pgmenu.getObject(),"itemClick",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_meid.getObject())}))));
 //BA.debugLineNum = 116;BA.debugLine="pg.onMenuItemClick(\"menu1\", BANano.CallBack(Me, \"";
_pg._onmenuitemclick /*String*/ ("menu1",(com.ab.banano.BANanoObject)(_banano.CallBack(pgmenu.getObject(),"itemClick",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_meid.getObject())}))));
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return "";
}
public static String  _itemclick(String _meid) throws Exception{
 //BA.debugLineNum = 147;BA.debugLine="Sub itemClick(meid As String)";
 //BA.debugLineNum = 148;BA.debugLine="Select Case meid";
switch (BA.switchObjectToInt(_meid,"iframe","win","mt")) {
case 0: {
 break; }
case 1: {
 //BA.debugLineNum = 151;BA.debugLine="CreateWindow";
_createwindow();
 //BA.debugLineNum = 152;BA.debugLine="pg.Show(winUX)";
_pg._show /*String*/ (_winux);
 //BA.debugLineNum = 154;BA.debugLine="pg.OnItemClick(win.ToolBarID, BANano.CallBack(Me";
_pg._onitemclick /*String*/ (_win._toolbarid /*String*/ ,(com.ab.banano.BANanoObject)(_banano.CallBack(pgmenu.getObject(),"windowClick",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_meid)}))));
 break; }
case 2: {
 //BA.debugLineNum = 156;BA.debugLine="pg.ShowPopUp(\"I'm loving Webix Intergrations!\",";
_pg._showpopup /*String*/ ("I'm loving Webix Intergrations!",(int) (75),(int) (375),"center");
 break; }
default: {
 //BA.debugLineNum = 158;BA.debugLine="pg.Message(meid)";
_pg._message /*String*/ (_meid);
 break; }
}
;
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return "";
}
public static String  _openmenu(String _meid) throws Exception{
boolean _bvisible = false;
 //BA.debugLineNum = 120;BA.debugLine="Sub OpenMenu(meid As String)";
 //BA.debugLineNum = 122;BA.debugLine="Dim bVisible As Boolean = pg.IsVisible(smUX)";
_bvisible = _pg._isvisible /*boolean*/ (_smux);
 //BA.debugLineNum = 123;BA.debugLine="If bVisible Then";
if (_bvisible) { 
 //BA.debugLineNum = 124;BA.debugLine="pg.Hide(smUX)";
_pg._hide /*String*/ (_smux);
 }else {
 //BA.debugLineNum = 126;BA.debugLine="pg.Show(smUX)";
_pg._show /*String*/ (_smux);
 };
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 7;BA.debugLine="Private win As WixWindow";
_win = new b4j.example.wixwindow();
 //BA.debugLineNum = 8;BA.debugLine="Private sm As WixSideMenu";
_sm = new b4j.example.wixsidemenu();
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public static String  _sideclick(String _meid) throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Sub sideClick(meid As String)";
 //BA.debugLineNum = 134;BA.debugLine="pg.Message(meid)";
_pg._message /*String*/ (_meid);
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return "";
}
public static String  _windowclick(String _meid) throws Exception{
 //BA.debugLineNum = 138;BA.debugLine="Sub windowClick(meID As String)";
 //BA.debugLineNum = 139;BA.debugLine="Select Case meID";
switch (BA.switchObjectToInt(_meid,"icnclose")) {
case 0: {
 //BA.debugLineNum = 141;BA.debugLine="pg.Close(winUX)";
_pg._close /*String*/ (_winux);
 break; }
default: {
 //BA.debugLineNum = 143;BA.debugLine="pg.Message(meID)";
_pg._message /*String*/ (_meid);
 break; }
}
;
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return "";
}
}
