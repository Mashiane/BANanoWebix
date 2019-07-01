package b4j.example;


import anywheresoftware.b4a.BA;

public class pguploader1 extends Object{
public static pguploader1 mostCurrent = new pguploader1();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.pguploader1", null);
		ba.loadHtSubs(pguploader1.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.pguploader1", ba);
		}
	}
    public static Class<?> getObject() {
		return pguploader1.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static b4j.example.wixpage _pg = null;
public static b4j.example.wixform _myform = null;
public static com.ab.banano.BANano _banano = null;
public static com.ab.banano.BANanoObject _fu = null;
public static b4j.example.wixuploader _upload = null;
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
public static b4j.example.pgcontext _pgcontext = null;
public static b4j.example.pggooglemap _pggooglemap = null;
public static b4j.example.pguploader2 _pguploader2 = null;
public static b4j.example.pguploader3 _pguploader3 = null;
public static String  _init() throws Exception{
b4j.example.wixrow _r1 = null;
b4j.example.wixrow _r2 = null;
String _sphoto = "";
b4j.example.uoenowhtml _img = null;
b4j.example.wixdatatable _dt = null;
anywheresoftware.b4a.objects.collections.List _data = null;
anywheresoftware.b4a.objects.collections.Map _row = null;
com.ab.banano.BANanoObject _ffile = null;
 //BA.debugLineNum = 10;BA.debugLine="Sub Init";
 //BA.debugLineNum = 11;BA.debugLine="pg.Initialize(\"\").SetHeader(\"Lesson 22: File Uplo";
_pg._initialize /*b4j.example.wixpage*/ (ba,"")._setheader /*b4j.example.wixpage*/ ("Lesson 22: File Uploader - Part 1");
 //BA.debugLineNum = 12;BA.debugLine="pg.Page.SetTypeSpace";
_pg._page /*b4j.example.wixelement*/ ._settypespace /*b4j.example.wixelement*/ ();
 //BA.debugLineNum = 14;BA.debugLine="Dim R1 As WixRow";
_r1 = new b4j.example.wixrow();
 //BA.debugLineNum = 15;BA.debugLine="R1.Initialize(\"R1\").SetTemplate(\"<p>Click on any";
_r1._initialize /*b4j.example.wixrow*/ (ba,"R1")._settemplate /*b4j.example.wixrow*/ ("<p>Click on any photo to change it</p>")._setheight /*b4j.example.wixrow*/ ((int) (50));
 //BA.debugLineNum = 16;BA.debugLine="pg.AddRow(R1)";
_pg._addrow /*String*/ (_r1);
 //BA.debugLineNum = 18;BA.debugLine="Dim R2 As WixRow";
_r2 = new b4j.example.wixrow();
 //BA.debugLineNum = 19;BA.debugLine="R2.Initialize(\"R2\")";
_r2._initialize /*b4j.example.wixrow*/ (ba,"R2");
 //BA.debugLineNum = 21;BA.debugLine="Dim sPhoto As String";
_sphoto = "";
 //BA.debugLineNum = 22;BA.debugLine="Dim img As UOENowHTML";
_img = new b4j.example.uoenowhtml();
 //BA.debugLineNum = 24;BA.debugLine="img.Initialize(\"img\", \"img\").SetStyle(\"cursor\", \"";
_img._initialize /*b4j.example.uoenowhtml*/ (ba,"img","img")._setstyle /*b4j.example.uoenowhtml*/ ("cursor","pointer")._setstyle /*b4j.example.uoenowhtml*/ ("width","80px")._setstyle /*b4j.example.uoenowhtml*/ ("height","80px")._setsrc /*b4j.example.uoenowhtml*/ ("./assets/#photo#",anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 25;BA.debugLine="sPhoto = img.HTML";
_sphoto = _img._html /*String*/ ();
 //BA.debugLineNum = 27;BA.debugLine="Dim dt As WixDataTable";
_dt = new b4j.example.wixdatatable();
 //BA.debugLineNum = 28;BA.debugLine="dt.Initialize(\"people\")";
_dt._initialize /*b4j.example.wixdatatable*/ (ba,"people");
 //BA.debugLineNum = 29;BA.debugLine="dt.CreateHeader(\"photo\").SetHeader(\" \").SetWidth(";
_dt._createheader /*b4j.example.wixdatacolumn*/ ("photo")._setheader /*b4j.example.wixdatacolumn*/ (" ")._setwidth /*b4j.example.wixdatacolumn*/ ((int) (100))._settemplate /*b4j.example.wixdatacolumn*/ ((Object)(_sphoto))._pop2 /*String*/ (_dt);
 //BA.debugLineNum = 30;BA.debugLine="dt.CreateHeader(\"name\").SetHeader(\"Employee Name\"";
_dt._createheader /*b4j.example.wixdatacolumn*/ ("name")._setheader /*b4j.example.wixdatacolumn*/ ("Employee Name")._setwidth /*b4j.example.wixdatacolumn*/ ((int) (200))._pop2 /*String*/ (_dt);
 //BA.debugLineNum = 31;BA.debugLine="dt.CreateHeader(\"job\").SetHeader(\"Job Title\").Set";
_dt._createheader /*b4j.example.wixdatacolumn*/ ("job")._setheader /*b4j.example.wixdatacolumn*/ ("Job Title")._setfillspace /*b4j.example.wixdatacolumn*/ (anywheresoftware.b4a.keywords.Common.True)._pop2 /*String*/ (_dt);
 //BA.debugLineNum = 32;BA.debugLine="dt.Setautoheight(True).SetscrollX(False).SetRowHe";
_dt._setautoheight /*b4j.example.wixdatatable*/ (anywheresoftware.b4a.keywords.Common.True)._setscrollx /*b4j.example.wixdatatable*/ (anywheresoftware.b4a.keywords.Common.False)._setrowheight /*b4j.example.wixdatatable*/ ((int) (80));
 //BA.debugLineNum = 34;BA.debugLine="Dim data As List";
_data = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 35;BA.debugLine="data.Initialize";
_data.Initialize();
 //BA.debugLineNum = 36;BA.debugLine="data.Add(CreateMap(\"id\":1, \"name\":\"Alex Bret\", \"j";
_data.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(1),(Object)("name"),(Object)("Alex Bret"),(Object)("job"),(Object)("Manager"),(Object)("photo"),(Object)("2.png")}).getObject()));
 //BA.debugLineNum = 37;BA.debugLine="data.Add(CreateMap(\"id\":2, \"name\":\"Ruby Goldberg\"";
_data.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(2),(Object)("name"),(Object)("Ruby Goldberg"),(Object)("job"),(Object)("Lead developer"),(Object)("photo"),(Object)("1.png")}).getObject()));
 //BA.debugLineNum = 38;BA.debugLine="dt.SetData(data)";
_dt._setdata /*b4j.example.wixdatatable*/ (_data);
 //BA.debugLineNum = 41;BA.debugLine="R2.AddItem(dt.Item)";
_r2._additem /*b4j.example.wixrow*/ (_dt._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 43;BA.debugLine="pg.AddRow(R2)";
_pg._addrow /*String*/ (_r2);
 //BA.debugLineNum = 44;BA.debugLine="pg.ui";
_pg._ui /*String*/ ();
 //BA.debugLineNum = 47;BA.debugLine="Dim row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 48;BA.debugLine="pg.onitemclick(\"people\", BANano.CallBack(Me,\"item";
_pg._onitemclick /*String*/ ("people",(com.ab.banano.BANanoObject)(_banano.CallBack(pguploader1.getObject(),"itemClick",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_row.getObject())}))));
 //BA.debugLineNum = 52;BA.debugLine="upload.Initialize(\"upload\").SetAccept(\"image/png,";
_upload._initialize /*b4j.example.wixuploader*/ (ba,"upload")._setaccept /*b4j.example.wixuploader*/ ("image/png, image/gif, image/jpeg")._setdatatype /*b4j.example.wixuploader*/ ("json")._setapionly /*b4j.example.wixuploader*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 53;BA.debugLine="upload.SetUpload(\"./assets/upload.php\")";
_upload._setupload /*b4j.example.wixuploader*/ ("./assets/upload.php");
 //BA.debugLineNum = 55;BA.debugLine="fu = pg.AddUploader(upload)";
_fu = _pg._adduploader /*com.ab.banano.BANanoObject*/ (_upload);
 //BA.debugLineNum = 57;BA.debugLine="Dim ffile As BANanoObject";
_ffile = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 58;BA.debugLine="pg.OnFileUploadError(\"upload\", BANano.CallBack(Me";
_pg._onfileuploaderror /*String*/ ("upload",(com.ab.banano.BANanoObject)(_banano.CallBack(pguploader1.getObject(),"onFileUploadError",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_ffile)}))));
 //BA.debugLineNum = 59;BA.debugLine="pg.onFileUpload(\"upload\", BANano.CallBack(Me, \"on";
_pg._onfileupload /*String*/ ("upload",(com.ab.banano.BANanoObject)(_banano.CallBack(pguploader1.getObject(),"onFileUpload",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_ffile)}))));
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
public static String  _itemclick(anywheresoftware.b4a.objects.collections.Map _row) throws Exception{
String _rid = "";
String _col = "";
 //BA.debugLineNum = 92;BA.debugLine="Sub itemClick(row As Map)";
 //BA.debugLineNum = 93;BA.debugLine="Dim rid As String = row.Get(\"row\")";
_rid = BA.ObjectToString(_row.Get((Object)("row")));
 //BA.debugLineNum = 94;BA.debugLine="Dim col As String = row.Get(\"column\")";
_col = BA.ObjectToString(_row.Get((Object)("column")));
 //BA.debugLineNum = 95;BA.debugLine="rid = pg.CStr(rid)";
_rid = _pg._cstr /*String*/ ((Object)(_rid));
 //BA.debugLineNum = 96;BA.debugLine="col = pg.CStr(col)";
_col = _pg._cstr /*String*/ ((Object)(_col));
 //BA.debugLineNum = 98;BA.debugLine="Select Case col";
switch (BA.switchObjectToInt(_col,"photo")) {
case 0: {
 //BA.debugLineNum = 101;BA.debugLine="pg.FileDialog(\"upload\", CreateMap(\"rowid\": rid))";
_pg._filedialog /*String*/ ("upload",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("rowid"),(Object)(_rid)}));
 break; }
}
;
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return "";
}
public static String  _onfileupload(com.ab.banano.BANanoObject _ffile) throws Exception{
String _status = "";
String _rowid = "";
anywheresoftware.b4a.objects.collections.Map _row = null;
String _fname = "";
 //BA.debugLineNum = 63;BA.debugLine="Sub onFileUpload(ffile As BANanoObject)";
 //BA.debugLineNum = 64;BA.debugLine="Log(\"onFileUpload\")";
anywheresoftware.b4a.keywords.Common.Log("onFileUpload");
 //BA.debugLineNum = 66;BA.debugLine="Log(ffile)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(_ffile));
 //BA.debugLineNum = 67;BA.debugLine="Dim status As String = ffile.GetField(\"status\").R";
_status = BA.ObjectToString(_ffile.GetField("status").Result());
 //BA.debugLineNum = 68;BA.debugLine="Select Case status";
switch (BA.switchObjectToInt(_status,"success","server")) {
case 0: 
case 1: {
 //BA.debugLineNum = 71;BA.debugLine="Dim rowid As String = pg.GetRowIDFromContext(ffi";
_rowid = _pg._getrowidfromcontext /*String*/ (_ffile);
 //BA.debugLineNum = 73;BA.debugLine="Dim row As Map = pg.GetItem(\"people\", rowid)";
_row = new anywheresoftware.b4a.objects.collections.Map();
_row = _pg._getitem /*anywheresoftware.b4a.objects.collections.Map*/ ("people",_rowid);
 //BA.debugLineNum = 75;BA.debugLine="Dim fname As String = ffile.GetField(\"name\").Res";
_fname = BA.ObjectToString(_ffile.GetField("name").Result());
 //BA.debugLineNum = 77;BA.debugLine="row.Put(\"photo\", fname)";
_row.Put((Object)("photo"),(Object)(_fname));
 //BA.debugLineNum = 79;BA.debugLine="pg.UpdateItem(\"people\", rowid, row)";
_pg._updateitem /*String*/ ("people",_rowid,_row);
 break; }
default: {
 //BA.debugLineNum = 81;BA.debugLine="pg.Alert(\"Error during file upload!\")";
_pg._alert /*String*/ ("Error during file upload!");
 break; }
}
;
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return "";
}
public static String  _onfileuploaderror(com.ab.banano.BANanoObject _ffile) throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Sub OnFileUploadError(ffile As BANanoObject)";
 //BA.debugLineNum = 87;BA.debugLine="Log(\"OnFileUploadError\")";
anywheresoftware.b4a.keywords.Common.Log("OnFileUploadError");
 //BA.debugLineNum = 88;BA.debugLine="Log(ffile)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(_ffile));
 //BA.debugLineNum = 89;BA.debugLine="pg.Alert(\"Error during file upload!\")";
_pg._alert /*String*/ ("Error during file upload!");
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 6;BA.debugLine="Public fu As BANanoObject";
_fu = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 7;BA.debugLine="Private upload As WixUploader";
_upload = new b4j.example.wixuploader();
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
}
