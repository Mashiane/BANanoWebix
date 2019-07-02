package b4j.example;


import anywheresoftware.b4a.BA;

public class pgdatatable1 extends Object{
public static pgdatatable1 mostCurrent = new pgdatatable1();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.pgdatatable1", null);
		ba.loadHtSubs(pgdatatable1.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.pgdatatable1", ba);
		}
	}
    public static Class<?> getObject() {
		return pgdatatable1.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static b4j.example.wixpage _pg = null;
public static b4j.example.wixform _myform = null;
public static com.ab.banano.BANano _banano = null;
public static b4j.example.main _main = null;
public static b4j.example.pgvideo _pgvideo = null;
public static b4j.example.pgtabbar _pgtabbar = null;
public static b4j.example.pgtree _pgtree = null;
public static b4j.example.pgmenu _pgmenu = null;
public static b4j.example.pglist _pglist = null;
public static b4j.example.pgdataview _pgdataview = null;
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
public static b4j.example.pguploader2 _pguploader2 = null;
public static b4j.example.pguploader3 _pguploader3 = null;
public static String  _init() throws Exception{
b4j.example.wixrow _r1 = null;
anywheresoftware.b4a.objects.collections.List _filmset = null;
b4j.example.wixdatatable _dt1 = null;
b4j.example.wixdatacolumn _c1 = null;
String _t = "";
b4j.example.wixdatacolumn _c2 = null;
b4j.example.wixdatacolumn _c3 = null;
b4j.example.wixdatacolumn _c4 = null;
anywheresoftware.b4a.objects.collections.Map _row = null;
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Init()";
 //BA.debugLineNum = 10;BA.debugLine="pg.Initialize(\"forms\").SetHeader(\"Lesson 8.2: Dat";
_pg._initialize /*b4j.example.wixpage*/ (ba,"forms")._setheader /*b4j.example.wixpage*/ ("Lesson 8.2: DataTable");
 //BA.debugLineNum = 12;BA.debugLine="Dim R1 As WixRow";
_r1 = new b4j.example.wixrow();
 //BA.debugLineNum = 13;BA.debugLine="R1.Initialize(\"R1\")";
_r1._initialize /*b4j.example.wixrow*/ (ba,"R1");
 //BA.debugLineNum = 15;BA.debugLine="Dim filmset As List";
_filmset = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 16;BA.debugLine="filmset.Initialize";
_filmset.Initialize();
 //BA.debugLineNum = 17;BA.debugLine="filmset.Add(CreateMap(\"marker\" : \"#ff0000\", \"titl";
_filmset.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("marker"),(Object)("#ff0000"),(Object)("title"),(Object)("Star Trek: TOS"),(Object)("network"),(Object)("CBS"),(Object)("seasons"),(Object)(3)}).getObject()));
 //BA.debugLineNum = 18;BA.debugLine="filmset.Add(CreateMap(\"marker\" : \"#00ff00\", \"titl";
_filmset.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("marker"),(Object)("#00ff00"),(Object)("title"),(Object)("Firefly"),(Object)("network"),(Object)("Fox"),(Object)("seasons"),(Object)("TOO FEW!!")}).getObject()));
 //BA.debugLineNum = 19;BA.debugLine="filmset.Add(CreateMap(\"marker\" : \"#0000ff\", \"titl";
_filmset.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("marker"),(Object)("#0000ff"),(Object)("title"),(Object)("Cheers"),(Object)("network"),(Object)("NBC"),(Object)("seasons"),(Object)(11)}).getObject()));
 //BA.debugLineNum = 20;BA.debugLine="filmset.Add(CreateMap(\"marker\" : \"#ffff00\", \"titl";
_filmset.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("marker"),(Object)("#ffff00"),(Object)("title"),(Object)("Suits"),(Object)("network"),(Object)("USA"),(Object)("seasons"),(Object)("7 (And counting)")}).getObject()));
 //BA.debugLineNum = 21;BA.debugLine="filmset.Add(CreateMap(\"marker\" : \"#ff00ff\", \"titl";
_filmset.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("marker"),(Object)("#ff00ff"),(Object)("title"),(Object)("Babylon 5"),(Object)("network"),(Object)("PTN"),(Object)("seasons"),(Object)("5")}).getObject()));
 //BA.debugLineNum = 23;BA.debugLine="Dim dt1 As WixDataTable";
_dt1 = new b4j.example.wixdatatable();
 //BA.debugLineNum = 24;BA.debugLine="dt1.Initialize(\"dt1\").Seteditable(True)";
_dt1._initialize /*b4j.example.wixdatatable*/ (ba,"dt1")._seteditable /*b4j.example.wixdatatable*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 25;BA.debugLine="dt1.SetSelect(dt1.DT_SELECT_ROW)	' set selection";
_dt1._setselect /*b4j.example.wixdatatable*/ ((Object)(_dt1._dt_select_row /*String*/ ));
 //BA.debugLineNum = 26;BA.debugLine="dt1.SetAutoWidth(True)  'adjust width of columns";
_dt1._setautowidth /*b4j.example.wixdatatable*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 27;BA.debugLine="dt1.SetStyle(\"margin\", \"10px\").SetBorderLess(Fals";
_dt1._setstyle /*b4j.example.wixdatatable*/ ("margin","10px")._setborderless /*b4j.example.wixdatatable*/ (anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 29;BA.debugLine="Dim c1 As WixDataColumn";
_c1 = new b4j.example.wixdatacolumn();
 //BA.debugLineNum = 30;BA.debugLine="Dim t As String = MarkerColor";
_t = _markercolor();
 //BA.debugLineNum = 31;BA.debugLine="c1.Initialize(dt1, \"marker\").SetHeader(\" \").SetWi";
_c1._initialize /*b4j.example.wixdatacolumn*/ (ba,_dt1,"marker")._setheader /*b4j.example.wixdatacolumn*/ (" ")._setwidth /*b4j.example.wixdatacolumn*/ ((int) (38))._settemplate /*b4j.example.wixdatacolumn*/ ((Object)(_t))._seteditor /*b4j.example.wixdatacolumn*/ ("color")._pop /*String*/ ();
 //BA.debugLineNum = 33;BA.debugLine="Dim c2 As WixDataColumn";
_c2 = new b4j.example.wixdatacolumn();
 //BA.debugLineNum = 34;BA.debugLine="c2.Initialize(dt1, \"title\").Setheader(\"Show title";
_c2._initialize /*b4j.example.wixdatacolumn*/ (ba,_dt1,"title")._setheader /*b4j.example.wixdatacolumn*/ ("Show title")._setwidth /*b4j.example.wixdatacolumn*/ ((int) (140))._setsort /*b4j.example.wixdatacolumn*/ ("string")._pop /*String*/ ();
 //BA.debugLineNum = 36;BA.debugLine="Dim c3 As WixDataColumn";
_c3 = new b4j.example.wixdatacolumn();
 //BA.debugLineNum = 37;BA.debugLine="c3.Initialize(dt1, \"network\").SetHeader(\"Network\"";
_c3._initialize /*b4j.example.wixdatacolumn*/ (ba,_dt1,"network")._setheader /*b4j.example.wixdatacolumn*/ ("Network")._setwidth /*b4j.example.wixdatacolumn*/ ((int) (100))._seteditor /*b4j.example.wixdatacolumn*/ ("text")._pop /*String*/ ();
 //BA.debugLineNum = 39;BA.debugLine="Dim c4 As WixDataColumn";
_c4 = new b4j.example.wixdatacolumn();
 //BA.debugLineNum = 40;BA.debugLine="c4.Initialize(dt1, \"seasons\").SetHeader(\"Seasons\"";
_c4._initialize /*b4j.example.wixdatacolumn*/ (ba,_dt1,"seasons")._setheader /*b4j.example.wixdatacolumn*/ ("Seasons")._setfillspace /*b4j.example.wixdatacolumn*/ (anywheresoftware.b4a.keywords.Common.True)._pop /*String*/ ();
 //BA.debugLineNum = 42;BA.debugLine="dt1.AddEditTrash";
_dt1._addedittrash /*String*/ ();
 //BA.debugLineNum = 44;BA.debugLine="dt1.SetData(filmset)";
_dt1._setdata /*b4j.example.wixdatatable*/ (_filmset);
 //BA.debugLineNum = 46;BA.debugLine="R1.AddItem(dt1.Item)";
_r1._additem /*b4j.example.wixrow*/ (_dt1._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 48;BA.debugLine="pg.Page.AddRow(R1)";
_pg._page /*b4j.example.wixelement*/ ._addrow /*String*/ (_r1);
 //BA.debugLineNum = 50;BA.debugLine="pg.UI";
_pg._ui /*String*/ ();
 //BA.debugLineNum = 52;BA.debugLine="Dim row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 53;BA.debugLine="pg.OnItemClick(\"dt1\", BANano.CallBack(Me, \"itemCl";
_pg._onitemclick /*String*/ ("dt1",(com.ab.banano.BANanoObject)(_banano.CallBack(pgdatatable1.getObject(),"itemClick",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_row.getObject())}))));
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return "";
}
public static String  _itemclick(anywheresoftware.b4a.objects.collections.Map _row) throws Exception{
String _rowid = "";
String _cid = "";
anywheresoftware.b4a.objects.collections.Map _record = null;
boolean _resp = false;
 //BA.debugLineNum = 56;BA.debugLine="Sub itemClick(row As Map)";
 //BA.debugLineNum = 58;BA.debugLine="Dim rowid As String = row.Get(\"row\")";
_rowid = BA.ObjectToString(_row.Get((Object)("row")));
 //BA.debugLineNum = 59;BA.debugLine="rowid = pg.CStr(rowid)";
_rowid = _pg._cstr /*String*/ ((Object)(_rowid));
 //BA.debugLineNum = 61;BA.debugLine="Dim cID As String = row.Get(\"column\")";
_cid = BA.ObjectToString(_row.Get((Object)("column")));
 //BA.debugLineNum = 63;BA.debugLine="Dim record As Map = pg.GetItem(\"dt1\", rowid)";
_record = new anywheresoftware.b4a.objects.collections.Map();
_record = _pg._getitem /*anywheresoftware.b4a.objects.collections.Map*/ ("dt1",_rowid);
 //BA.debugLineNum = 64;BA.debugLine="Select Case cID";
switch (BA.switchObjectToInt(_cid,"edit","delete")) {
case 0: {
 //BA.debugLineNum = 67;BA.debugLine="pg.Message(BANano.ToJson(record))";
_pg._message /*String*/ (BA.ObjectToString(_banano.ToJson((Object)(_record.getObject()))));
 break; }
case 1: {
 //BA.debugLineNum = 70;BA.debugLine="Dim resp As Boolean = BANano.Window.Confirm(\"Are";
_resp = _banano.Window().Confirm("Are you sure you want to delete this record?");
 //BA.debugLineNum = 71;BA.debugLine="If resp Then";
if (_resp) { 
 //BA.debugLineNum = 72;BA.debugLine="pg.Remove(\"dt1\", rowid)";
_pg._remove /*String*/ ("dt1",_rowid);
 };
 break; }
}
;
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return "";
}
public static String  _markercolor() throws Exception{
b4j.example.uoenowhtml _sout = null;
 //BA.debugLineNum = 79;BA.debugLine="Sub MarkerColor As String";
 //BA.debugLineNum = 80;BA.debugLine="Dim sout As UOENowHTML";
_sout = new b4j.example.uoenowhtml();
 //BA.debugLineNum = 81;BA.debugLine="sout.Initialize(\"\",\"span\")";
_sout._initialize /*b4j.example.uoenowhtml*/ (ba,"","span");
 //BA.debugLineNum = 82;BA.debugLine="sout.IsImportant = False";
_sout._isimportant /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 83;BA.debugLine="sout.AddStyle(\"background-color\", \"#marker#\")";
_sout._addstyle /*String*/ ("background-color","#marker#");
 //BA.debugLineNum = 84;BA.debugLine="sout.AddStyle(\"border-radius\", \"20px\")";
_sout._addstyle /*String*/ ("border-radius","20px");
 //BA.debugLineNum = 85;BA.debugLine="sout.AddStyle(\"padding-right\", \"10px\")";
_sout._addstyle /*String*/ ("padding-right","10px");
 //BA.debugLineNum = 86;BA.debugLine="sout.AddContent(\"&nbsp&nbsp\")";
_sout._addcontent /*b4j.example.uoenowhtml*/ ("&nbsp&nbsp");
 //BA.debugLineNum = 87;BA.debugLine="Return sout.html";
if (true) return _sout._html /*String*/ ();
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
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
