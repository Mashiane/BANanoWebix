package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixmessagebox extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixmessagebox", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixmessagebox.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.wixelement _messagebox = null;
public String _id = "";
public anywheresoftware.b4a.objects.collections.List _buttons = null;
public b4j.example.main _main = null;
public b4j.example.pgformdesigner _pgformdesigner = null;
public b4j.example.dbutton _dbutton = null;
public b4j.example.modcenter _modcenter = null;
public b4j.example.modsidebar _modsidebar = null;
public b4j.example.modtoolbar _modtoolbar = null;
public b4j.example.drow _drow = null;
public b4j.example.dpager _dpager = null;
public b4j.example.ddbllist _ddbllist = null;
public b4j.example.dform _dform = null;
public b4j.example.dcheckbox _dcheckbox = null;
public b4j.example.dcolorpicker _dcolorpicker = null;
public b4j.example.dcombo _dcombo = null;
public b4j.example.dcounter _dcounter = null;
public b4j.example.ddatepicker _ddatepicker = null;
public b4j.example.dicon _dicon = null;
public b4j.example.dlabel _dlabel = null;
public b4j.example.dradio _dradio = null;
public b4j.example.drichselect _drichselect = null;
public b4j.example.dsearch _dsearch = null;
public b4j.example.dselect _dselect = null;
public b4j.example.dsegmented _dsegmented = null;
public b4j.example.dslider _dslider = null;
public b4j.example.dswitch _dswitch = null;
public b4j.example.dtabbar _dtabbar = null;
public b4j.example.dtext _dtext = null;
public b4j.example.dtextarea _dtextarea = null;
public b4j.example.dtoggle _dtoggle = null;
public b4j.example.duploader _duploader = null;
public b4j.example.dfieldset _dfieldset = null;
public b4j.example.dsuggest _dsuggest = null;
public b4j.example.dcolumn _dcolumn = null;
public b4j.example.modpropertybag _modpropertybag = null;
public b4j.example.ddesignerproperty _ddesignerproperty = null;
public b4j.example.dconnection _dconnection = null;
public b4j.example.dtable _dtable = null;
public b4j.example.dfield _dfield = null;
public b4j.example.modwebix _modwebix = null;
public b4j.example.wixmessagebox  _addbutton(String _btntext) throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Sub AddButton(btnText As String) As WixMessageBox";
 //BA.debugLineNum = 111;BA.debugLine="buttons.Add(btnText)";
_buttons.Add((Object)(_btntext));
 //BA.debugLineNum = 112;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmessagebox)(this);
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public MessageBox As WixElement";
_messagebox = new b4j.example.wixelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private buttons As List";
_buttons = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixmessagebox  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(sid As String) As WixMessage";
 //BA.debugLineNum = 10;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 11;BA.debugLine="MessageBox.Initialize(ID)";
_messagebox._initialize /*b4j.example.wixelement*/ (ba,_id);
 //BA.debugLineNum = 12;BA.debugLine="buttons.Initialize";
_buttons.Initialize();
 //BA.debugLineNum = 13;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmessagebox)(this);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 82;BA.debugLine="If buttons.Size > 0 Then";
if (_buttons.getSize()>0) { 
 //BA.debugLineNum = 83;BA.debugLine="MessageBox.SetAttr(\"buttons\", buttons)";
_messagebox._setattr /*b4j.example.wixelement*/ ("buttons",(Object)(_buttons.getObject()));
 };
 //BA.debugLineNum = 85;BA.debugLine="Return MessageBox.item";
if (true) return _messagebox._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmessagebox  _setcallback(com.ab.banano.BANanoObject _t) throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Sub SetCallBack(t As BANanoObject) As WixMessageBo";
 //BA.debugLineNum = 69;BA.debugLine="MessageBox.SetAttr(\"callback\", t)";
_messagebox._setattr /*b4j.example.wixelement*/ ("callback",(Object)(_t));
 //BA.debugLineNum = 70;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmessagebox)(this);
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmessagebox  _setcancel(Object _t) throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Sub SetCANCEL(t As Object) As WixMessageBox";
 //BA.debugLineNum = 43;BA.debugLine="MessageBox.SetAttr(\"cancel\", t)";
_messagebox._setattr /*b4j.example.wixelement*/ ("cancel",_t);
 //BA.debugLineNum = 44;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmessagebox)(this);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmessagebox  _setcontainer(Object _t) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Sub SetContainer(t As Object) As WixMessageBox";
 //BA.debugLineNum = 63;BA.debugLine="MessageBox.SetAttr(\"container\", t)";
_messagebox._setattr /*b4j.example.wixelement*/ ("container",_t);
 //BA.debugLineNum = 64;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmessagebox)(this);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmessagebox  _setcss(Object _t) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Sub SetCSS(t As Object) As WixMessageBox";
 //BA.debugLineNum = 76;BA.debugLine="MessageBox.SetAttr(\"css\", t)";
_messagebox._setattr /*b4j.example.wixelement*/ ("css",_t);
 //BA.debugLineNum = 77;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmessagebox)(this);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmessagebox  _setheight(Object _t) throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Sub SetHeight(t As Object) As WixMessageBox";
 //BA.debugLineNum = 56;BA.debugLine="MessageBox.SetAttr(\"height\", t)";
_messagebox._setattr /*b4j.example.wixelement*/ ("height",_t);
 //BA.debugLineNum = 57;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmessagebox)(this);
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmessagebox  _setok(Object _t) throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Sub SetOK(t As Object) As WixMessageBox";
 //BA.debugLineNum = 37;BA.debugLine="MessageBox.SetAttr(\"ok\", t)";
_messagebox._setattr /*b4j.example.wixelement*/ ("ok",_t);
 //BA.debugLineNum = 38;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmessagebox)(this);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmessagebox  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 23;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixMessage";
 //BA.debugLineNum = 24;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 25;BA.debugLine="MessageBox.SetTemplate(os)";
_messagebox._settemplate /*b4j.example.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 26;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmessagebox)(this);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmessagebox  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Sub SetText(t As Object) As WixMessageBox";
 //BA.debugLineNum = 31;BA.debugLine="MessageBox.SetAttr(\"text\", t)";
_messagebox._setattr /*b4j.example.wixelement*/ ("text",_t);
 //BA.debugLineNum = 32;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmessagebox)(this);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmessagebox  _settitle(Object _t) throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub SetTitle(t As Object) As WixMessageBox";
 //BA.debugLineNum = 18;BA.debugLine="MessageBox.SetAttr(\"title\", t)";
_messagebox._setattr /*b4j.example.wixelement*/ ("title",_t);
 //BA.debugLineNum = 19;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmessagebox)(this);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmessagebox  _settypealerterror(boolean _b) throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Sub SetTypeAlertError(b As Boolean) As WixMessageB";
 //BA.debugLineNum = 99;BA.debugLine="MessageBox.SetType(\"alert-error\")";
_messagebox._settype /*b4j.example.wixelement*/ ("alert-error");
 //BA.debugLineNum = 100;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmessagebox)(this);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmessagebox  _settypealertwarning(boolean _b) throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Sub SetTypeAlertWarning(b As Boolean) As WixMessag";
 //BA.debugLineNum = 105;BA.debugLine="MessageBox.SetType(\"alert-warning\")";
_messagebox._settype /*b4j.example.wixelement*/ ("alert-warning");
 //BA.debugLineNum = 106;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmessagebox)(this);
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmessagebox  _settypeconfirmerror(boolean _b) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub SetTypeConfirmError(b As Boolean) As WixMessag";
 //BA.debugLineNum = 94;BA.debugLine="MessageBox.SetType(\"confirm-error\")";
_messagebox._settype /*b4j.example.wixelement*/ ("confirm-error");
 //BA.debugLineNum = 95;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmessagebox)(this);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmessagebox  _settypeconfirmwarning(boolean _b) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Sub SetTypeConfirmWarning(b As Boolean) As WixMess";
 //BA.debugLineNum = 89;BA.debugLine="MessageBox.SetType(\"confirm-warning\")";
_messagebox._settype /*b4j.example.wixelement*/ ("confirm-warning");
 //BA.debugLineNum = 90;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmessagebox)(this);
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmessagebox  _setwidth(Object _t) throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Sub SetWidth(t As Object) As WixMessageBox";
 //BA.debugLineNum = 49;BA.debugLine="MessageBox.SetAttr(\"width\", t)";
_messagebox._setattr /*b4j.example.wixelement*/ ("width",_t);
 //BA.debugLineNum = 50;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmessagebox)(this);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
