package b4j.example;


import anywheresoftware.b4a.BA;

public class pguploader2 extends Object{
public static pguploader2 mostCurrent = new pguploader2();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.pguploader2", null);
		ba.loadHtSubs(pguploader2.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.pguploader2", ba);
		}
	}
    public static Class<?> getObject() {
		return pguploader2.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static b4j.example.wixpage _pg = null;
public static b4j.example.wixform _myform = null;
public static com.ab.banano.BANano _banano = null;
public static com.ab.banano.BANanoObject _fu = null;
public static b4j.example.wixlist _listview = null;
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
public static b4j.example.pguploader1 _pguploader1 = null;
public static b4j.example.pguploader3 _pguploader3 = null;
public static String  _init() throws Exception{
b4j.example.wixrow _r1 = null;
b4j.example.wixuploader _up = null;
b4j.example.wixlist _lst = null;
com.ab.banano.BANanoObject _ffile = null;
 //BA.debugLineNum = 10;BA.debugLine="Sub Init";
 //BA.debugLineNum = 12;BA.debugLine="pg.Initialize(\"\").SetHeader(\"Lesson 22: File Uplo";
_pg._initialize /*b4j.example.wixpage*/ (ba,"")._setheader /*b4j.example.wixpage*/ ("Lesson 22: File Uploader - Part 2 (Linked List)");
 //BA.debugLineNum = 13;BA.debugLine="pg.Page.SetTypeSpace";
_pg._page /*b4j.example.wixelement*/ ._settypespace /*b4j.example.wixelement*/ ();
 //BA.debugLineNum = 16;BA.debugLine="Dim R1 As WixRow";
_r1 = new b4j.example.wixrow();
 //BA.debugLineNum = 17;BA.debugLine="R1.Initialize(\"R1\")";
_r1._initialize /*b4j.example.wixrow*/ (ba,"R1");
 //BA.debugLineNum = 20;BA.debugLine="myForm.Initialize(\"myform\")";
_myform._initialize /*b4j.example.wixform*/ (ba,"myform");
 //BA.debugLineNum = 23;BA.debugLine="Dim up As WixUploader";
_up = new b4j.example.wixuploader();
 //BA.debugLineNum = 24;BA.debugLine="up.Initialize(\"upload\").SetValue(\"Upload File\").S";
_up._initialize /*b4j.example.wixuploader*/ (ba,"upload")._setvalue /*b4j.example.wixuploader*/ ("Upload File")._setlink /*b4j.example.wixuploader*/ ("mylist")._setupload /*b4j.example.wixuploader*/ ("./assets/upload.php")._setdatatype /*b4j.example.wixuploader*/ ("json");
 //BA.debugLineNum = 26;BA.debugLine="Dim lst As WixList";
_lst = new b4j.example.wixlist();
 //BA.debugLineNum = 27;BA.debugLine="lst.Initialize(\"mylist\").SetTypeUploader(True).Se";
_lst._initialize /*b4j.example.wixlist*/ (ba,"mylist")._settypeuploader /*b4j.example.wixlist*/ (anywheresoftware.b4a.keywords.Common.True)._setautoheight /*b4j.example.wixlist*/ (anywheresoftware.b4a.keywords.Common.True)._setborderless /*b4j.example.wixlist*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 30;BA.debugLine="myForm.AddRows(up.Item)";
_myform._addrows /*String*/ (_up._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 32;BA.debugLine="myForm.AddRows(lst.Item)";
_myform._addrows /*String*/ (_lst._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 35;BA.debugLine="R1.AddRows(myForm.Item)";
_r1._addrows /*b4j.example.wixrow*/ (_myform._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 37;BA.debugLine="pg.AddRow(R1)";
_pg._addrow /*String*/ (_r1);
 //BA.debugLineNum = 40;BA.debugLine="pg.ui";
_pg._ui /*String*/ ();
 //BA.debugLineNum = 42;BA.debugLine="Dim ffile As BANanoObject";
_ffile = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 43;BA.debugLine="pg.OnFileUploadError(\"upload\", BANano.CallBack(Me";
_pg._onfileuploaderror /*String*/ ("upload",(com.ab.banano.BANanoObject)(_banano.CallBack(pguploader2.getObject(),"onFileUploadError",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_ffile)}))));
 //BA.debugLineNum = 44;BA.debugLine="pg.onFileUpload(\"upload\", BANano.CallBack(Me, \"on";
_pg._onfileupload /*String*/ ("upload",(com.ab.banano.BANanoObject)(_banano.CallBack(pguploader2.getObject(),"onFileUpload",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_ffile)}))));
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return "";
}
public static String  _onfileupload(com.ab.banano.BANanoObject _ffile) throws Exception{
String _status = "";
 //BA.debugLineNum = 47;BA.debugLine="Sub onFileUpload(ffile As BANanoObject)";
 //BA.debugLineNum = 48;BA.debugLine="Log(\"onFileUpload\")";
anywheresoftware.b4a.keywords.Common.Log("onFileUpload");
 //BA.debugLineNum = 49;BA.debugLine="Log(ffile)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(_ffile));
 //BA.debugLineNum = 50;BA.debugLine="Dim status As String = ffile.GetField(\"status\").R";
_status = BA.ObjectToString(_ffile.GetField("status").Result());
 //BA.debugLineNum = 51;BA.debugLine="Select Case status";
switch (BA.switchObjectToInt(_status,"success","server")) {
case 0: 
case 1: {
 break; }
default: {
 //BA.debugLineNum = 54;BA.debugLine="pg.Alert(\"Error during file upload!\")";
_pg._alert /*String*/ ("Error during file upload!");
 break; }
}
;
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return "";
}
public static String  _onfileuploaderror(Object _ffile) throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub OnFileUploadError(ffile As Object)";
 //BA.debugLineNum = 59;BA.debugLine="Log(\"OnFileUploadError\")";
anywheresoftware.b4a.keywords.Common.Log("OnFileUploadError");
 //BA.debugLineNum = 60;BA.debugLine="pg.Alert(\"Error during file upload!\")";
_pg._alert /*String*/ ("Error during file upload!");
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 7;BA.debugLine="Public listView As WixList";
_listview = new b4j.example.wixlist();
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
}
