package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixuploader extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixuploader", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixuploader.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _uploader = null;
public b4j.example.main _main = null;
public b4j.example.pgtabbar _pgtabbar = null;
public b4j.example.pgtree _pgtree = null;
public b4j.example.pgmenu _pgmenu = null;
public b4j.example.pglist _pglist = null;
public b4j.example.pgdataview _pgdataview = null;
public b4j.example.pgdatatable1 _pgdatatable1 = null;
public b4j.example.pgdatatable _pgdatatable = null;
public b4j.example.pgcharts _pgcharts = null;
public b4j.example.pgdataentry _pgdataentry = null;
public b4j.example.pgforms1 _pgforms1 = null;
public b4j.example.pgforms _pgforms = null;
public b4j.example.pgtoolbar _pgtoolbar = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.pgmultiview _pgmultiview = null;
public b4j.example.pglayouts1 _pglayouts1 = null;
public b4j.example.pglayouts2 _pglayouts2 = null;
public b4j.example.pglayouts _pglayouts = null;
public b4j.example.pglayout _pglayout = null;
public b4j.example.pgunitlist _pgunitlist = null;
public b4j.example.pgpropertysheet _pgpropertysheet = null;
public b4j.example.pgtreetable _pgtreetable = null;
public b4j.example.pgsidebar _pgsidebar = null;
public b4j.example.pgcomments _pgcomments = null;
public b4j.example.pggrouplist _pggrouplist = null;
public b4j.example.pgcontext _pgcontext = null;
public b4j.example.pggooglemap _pggooglemap = null;
public b4j.example.pguploader1 _pguploader1 = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Uploader As WixElement";
_uploader = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixuploader  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize(sID As String) As WixUploade";
 //BA.debugLineNum = 9;BA.debugLine="ID = sID.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 10;BA.debugLine="Uploader.Initialize(ID).SetView(\"uploader\")";
_uploader._initialize /*b4j.example.wixelement*/ (ba,_id)._setview /*b4j.example.wixelement*/ ("uploader");
 //BA.debugLineNum = 11;BA.debugLine="Uploader.SetAttr(\"name\", \"uploader\")";
_uploader._setattr /*b4j.example.wixelement*/ ("name",(Object)("uploader"));
 //BA.debugLineNum = 12;BA.debugLine="Return Me";
if (true) return (b4j.example.wixuploader)(this);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 76;BA.debugLine="Return Uploader.item";
if (true) return _uploader._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixuploader  _setaccept(String _a) throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Sub SetAccept(a As String) As WixUploader";
 //BA.debugLineNum = 56;BA.debugLine="Uploader.SetAttr(\"accept\", a)";
_uploader._setattr /*b4j.example.wixelement*/ ("accept",(Object)(_a));
 //BA.debugLineNum = 57;BA.debugLine="Return Me";
if (true) return (b4j.example.wixuploader)(this);
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixuploader  _setapionly(boolean _b) throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Sub SetApiOnly(b As Boolean) As WixUploader";
 //BA.debugLineNum = 26;BA.debugLine="Uploader.SetAttr(\"apiOnly\", b)";
_uploader._setattr /*b4j.example.wixelement*/ ("apiOnly",(Object)(_b));
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixuploader  _setautosend(boolean _b) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub SetAutoSend(b As Boolean) As WixUploader";
 //BA.debugLineNum = 35;BA.debugLine="Uploader.SetAttr(\"autosend\", b)";
_uploader._setattr /*b4j.example.wixelement*/ ("autosend",(Object)(_b));
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4j.example.wixuploader)(this);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixuploader  _setdirectory(boolean _b) throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Sub SetDirectory(b As Boolean) As WixUploader";
 //BA.debugLineNum = 50;BA.debugLine="Uploader.SetAttr(\"directory\", b)";
_uploader._setattr /*b4j.example.wixelement*/ ("directory",(Object)(_b));
 //BA.debugLineNum = 51;BA.debugLine="Return Me";
if (true) return (b4j.example.wixuploader)(this);
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixuploader  _setheight(int _h) throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Sub SetHeight(h As Int) As WixUploader";
 //BA.debugLineNum = 66;BA.debugLine="Uploader.SetHeight(h)";
_uploader._setheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 67;BA.debugLine="Return Me";
if (true) return (b4j.example.wixuploader)(this);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixuploader  _setinputname(String _n) throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Sub SetinputName(n As String) As WixUploader";
 //BA.debugLineNum = 21;BA.debugLine="Uploader.SetAttr(\"inputName\", n)";
_uploader._setattr /*b4j.example.wixelement*/ ("inputName",(Object)(_n));
 //BA.debugLineNum = 22;BA.debugLine="Return Me";
if (true) return (b4j.example.wixuploader)(this);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixuploader  _setlink(String _l) throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub SetLink(l As String) As WixUploader";
 //BA.debugLineNum = 45;BA.debugLine="Uploader.SetAttr(\"link\", l)";
_uploader._setattr /*b4j.example.wixelement*/ ("link",(Object)(_l));
 //BA.debugLineNum = 46;BA.debugLine="Return Me";
if (true) return (b4j.example.wixuploader)(this);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixuploader  _setmultiple(boolean _b) throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Sub SetMultiple(b As Boolean) As WixUploader";
 //BA.debugLineNum = 30;BA.debugLine="Uploader.SetAttr(\"multiple\", b)";
_uploader._setattr /*b4j.example.wixelement*/ ("multiple",(Object)(_b));
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.example.wixuploader)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixuploader  _setname(String _n) throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Sub SetName(n As String) As WixUploader";
 //BA.debugLineNum = 40;BA.debugLine="Uploader.SetAttr(\"name\", n)";
_uploader._setattr /*b4j.example.wixelement*/ ("name",(Object)(_n));
 //BA.debugLineNum = 41;BA.debugLine="Return Me";
if (true) return (b4j.example.wixuploader)(this);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixuploader  _setupload(String _u) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub SetUpload(u As String) As WixUploader";
 //BA.debugLineNum = 61;BA.debugLine="Uploader.SetAttr(\"upload\", u)";
_uploader._setattr /*b4j.example.wixelement*/ ("upload",(Object)(_u));
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (b4j.example.wixuploader)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixuploader  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub SetValue(v As String) As WixUploader";
 //BA.debugLineNum = 16;BA.debugLine="Uploader.SetValue(v)";
_uploader._setvalue /*b4j.example.wixelement*/ (_v);
 //BA.debugLineNum = 17;BA.debugLine="Return Me";
if (true) return (b4j.example.wixuploader)(this);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixuploader  _setwidth(int _w) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub SetWidth(w As Int) As WixUploader";
 //BA.debugLineNum = 71;BA.debugLine="Uploader.SetWidth(w)";
_uploader._setwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 72;BA.debugLine="Return Me";
if (true) return (b4j.example.wixuploader)(this);
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
