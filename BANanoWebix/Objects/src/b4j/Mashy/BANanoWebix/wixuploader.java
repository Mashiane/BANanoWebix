package b4j.Mashy.BANanoWebix;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixuploader extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebix", "b4j.Mashy.BANanoWebix.wixuploader", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebix.wixuploader.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebix.wixelement _uploader = null;
public b4j.Mashy.BANanoWebix.main _main = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Uploader As WixElement";
_uploader = new b4j.Mashy.BANanoWebix.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebix.wixuploader  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize(sID As String) As WixUploade";
 //BA.debugLineNum = 9;BA.debugLine="ID = sID.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 10;BA.debugLine="Uploader.Initialize(ID).SetView(\"uploader\")";
_uploader._initialize /*b4j.Mashy.BANanoWebix.wixelement*/ (ba,_id)._setview /*b4j.Mashy.BANanoWebix.wixelement*/ ("uploader");
 //BA.debugLineNum = 11;BA.debugLine="SetName(\"upload\")";
_setname("upload");
 //BA.debugLineNum = 12;BA.debugLine="SetInputName(\"upload\")";
_setinputname("upload");
 //BA.debugLineNum = 13;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixuploader)(this);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 86;BA.debugLine="Return Uploader.item";
if (true) return _uploader._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixuploader  _setaccept(String _a) throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub SetAccept(a As String) As WixUploader";
 //BA.debugLineNum = 65;BA.debugLine="Uploader.SetAttr(\"accept\", a)";
_uploader._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("accept",(Object)(_a));
 //BA.debugLineNum = 66;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixuploader)(this);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixuploader  _setapionly(boolean _b) throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Sub SetApiOnly(b As Boolean) As WixUploader";
 //BA.debugLineNum = 27;BA.debugLine="Uploader.SetAttr(\"apiOnly\", b)";
_uploader._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("apiOnly",(Object)(_b));
 //BA.debugLineNum = 28;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixuploader)(this);
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixuploader  _setautosend(boolean _b) throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Sub SetAutoSend(b As Boolean) As WixUploader";
 //BA.debugLineNum = 43;BA.debugLine="Uploader.SetAttr(\"autosend\", b)";
_uploader._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("autosend",(Object)(_b));
 //BA.debugLineNum = 44;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixuploader)(this);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixuploader  _setdatatype(String _d) throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Sub SetDataType(d As String) As WixUploader";
 //BA.debugLineNum = 33;BA.debugLine="Uploader.SetAttr(\"datatype\", d)";
_uploader._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("datatype",(Object)(_d));
 //BA.debugLineNum = 34;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixuploader)(this);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixuploader  _setdirectory(boolean _b) throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub SetDirectory(b As Boolean) As WixUploader";
 //BA.debugLineNum = 59;BA.debugLine="Uploader.SetAttr(\"directory\", b)";
_uploader._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("directory",(Object)(_b));
 //BA.debugLineNum = 60;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixuploader)(this);
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixuploader  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Sub SetHeight(h As Object) As WixUploader";
 //BA.debugLineNum = 76;BA.debugLine="Uploader.SetHeight(h)";
_uploader._setheight /*b4j.Mashy.BANanoWebix.wixelement*/ (_h);
 //BA.debugLineNum = 77;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixuploader)(this);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixuploader  _setinputname(String _n) throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub SetInputName(n As String) As WixUploader";
 //BA.debugLineNum = 22;BA.debugLine="Uploader.SetAttr(\"inputName\", n)";
_uploader._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("inputName",(Object)(_n));
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixuploader)(this);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixuploader  _setlink(String _l) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub SetLink(l As String) As WixUploader";
 //BA.debugLineNum = 54;BA.debugLine="Uploader.SetAttr(\"link\", l)";
_uploader._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("link",(Object)(_l));
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixuploader)(this);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixuploader  _setmultiple(boolean _b) throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Sub SetMultiple(b As Boolean) As WixUploader";
 //BA.debugLineNum = 38;BA.debugLine="Uploader.SetAttr(\"multiple\", b)";
_uploader._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("multiple",(Object)(_b));
 //BA.debugLineNum = 39;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixuploader)(this);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixuploader  _setname(String _n) throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub SetName(n As String) As WixUploader";
 //BA.debugLineNum = 48;BA.debugLine="Uploader.SetAttr(\"name\", n)";
_uploader._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("name",(Object)(_n));
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixuploader)(this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixuploader  _setupload(String _u) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub SetUpload(u As String) As WixUploader";
 //BA.debugLineNum = 71;BA.debugLine="Uploader.SetAttr(\"upload\", u)";
_uploader._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("upload",(Object)(_u));
 //BA.debugLineNum = 72;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixuploader)(this);
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixuploader  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Sub SetValue(v As String) As WixUploader";
 //BA.debugLineNum = 17;BA.debugLine="Uploader.SetValue(v)";
_uploader._setvalue /*b4j.Mashy.BANanoWebix.wixelement*/ (_v);
 //BA.debugLineNum = 18;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixuploader)(this);
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixuploader  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub SetWidth(w As Object) As WixUploader";
 //BA.debugLineNum = 81;BA.debugLine="Uploader.SetWidth(w)";
_uploader._setwidth /*b4j.Mashy.BANanoWebix.wixelement*/ (_w);
 //BA.debugLineNum = 82;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixuploader)(this);
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
