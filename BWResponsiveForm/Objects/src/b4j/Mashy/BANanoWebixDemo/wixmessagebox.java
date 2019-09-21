package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixmessagebox extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixmessagebox", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixmessagebox.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _messagebox = null;
public String _id = "";
public anywheresoftware.b4a.objects.collections.List _buttons = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public b4j.Mashy.BANanoWebixDemo.wixmessagebox  _addbutton(String _btntext) throws Exception{
 //BA.debugLineNum = 152;BA.debugLine="Sub AddButton(btnText As String) As WixMessageBox";
 //BA.debugLineNum = 153;BA.debugLine="buttons.Add(btnText)";
_buttons.Add((Object)(_btntext));
 //BA.debugLineNum = 154;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmessagebox)(this);
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public MessageBox As WixElement";
_messagebox = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private buttons As List";
_buttons = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixmessagebox  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(sid As String) As WixMessage";
 //BA.debugLineNum = 10;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 11;BA.debugLine="MessageBox.Initialize(ID)";
_messagebox._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_id);
 //BA.debugLineNum = 12;BA.debugLine="buttons.Initialize";
_buttons.Initialize();
 //BA.debugLineNum = 13;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmessagebox)(this);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 124;BA.debugLine="If buttons.Size > 0 Then";
if (_buttons.getSize()>0) { 
 //BA.debugLineNum = 125;BA.debugLine="MessageBox.SetAttr(\"buttons\", buttons)";
_messagebox._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("buttons",(Object)(_buttons.getObject()));
 };
 //BA.debugLineNum = 127;BA.debugLine="Return MessageBox.item";
if (true) return _messagebox._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmessagebox  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 28;BA.debugLine="Sub SetAttributes(m As Map) As WixMessageBox";
 //BA.debugLineNum = 29;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 30;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 31;BA.debugLine="MessageBox.SetAttr(k,v)";
_messagebox._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 33;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmessagebox)(this);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmessagebox  _setcallback(com.ab.banano.BANanoObject _t) throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Sub SetCallBack(t As BANanoObject) As WixMessageBo";
 //BA.debugLineNum = 105;BA.debugLine="MessageBox.SetAttr(\"callback\", t)";
_messagebox._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("callback",(Object)(_t));
 //BA.debugLineNum = 106;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmessagebox)(this);
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmessagebox  _setcancel(Object _t) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub SetCANCEL(t As Object) As WixMessageBox";
 //BA.debugLineNum = 79;BA.debugLine="MessageBox.SetAttr(\"cancel\", t)";
_messagebox._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("cancel",_t);
 //BA.debugLineNum = 80;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmessagebox)(this);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmessagebox  _setcontainer(Object _t) throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Sub SetContainer(t As Object) As WixMessageBox";
 //BA.debugLineNum = 99;BA.debugLine="MessageBox.SetAttr(\"container\", t)";
_messagebox._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("container",_t);
 //BA.debugLineNum = 100;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmessagebox)(this);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmessagebox  _setcss(Object _t) throws Exception{
 //BA.debugLineNum = 111;BA.debugLine="Sub SetCSS(t As Object) As WixMessageBox";
 //BA.debugLineNum = 112;BA.debugLine="MessageBox.SetAttr(\"css\", t)";
_messagebox._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("css",_t);
 //BA.debugLineNum = 113;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmessagebox)(this);
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmessagebox  _setcssjson(String _json) throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Sub SetCSSJSON(json As String) As WixMessageBox";
 //BA.debugLineNum = 118;BA.debugLine="MessageBox.SetCSSJSON(json)";
_messagebox._setcssjson /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_json);
 //BA.debugLineNum = 119;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmessagebox)(this);
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmessagebox  _setheight(Object _t) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub SetHeight(t As Object) As WixMessageBox";
 //BA.debugLineNum = 92;BA.debugLine="MessageBox.SetAttr(\"height\", t)";
_messagebox._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("height",_t);
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmessagebox)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmessagebox  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Sub SetMargin(margin As Object) As WixMessageBox";
 //BA.debugLineNum = 24;BA.debugLine="MessageBox.SetMargin(margin)";
_messagebox._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 25;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmessagebox)(this);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmessagebox  _setok(Object _t) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Sub SetOK(t As Object) As WixMessageBox";
 //BA.debugLineNum = 73;BA.debugLine="MessageBox.SetAttr(\"ok\", t)";
_messagebox._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("ok",_t);
 //BA.debugLineNum = 74;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmessagebox)(this);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmessagebox  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub SetPadding(padding As Object) As WixMessageBox";
 //BA.debugLineNum = 18;BA.debugLine="MessageBox.SetPadding(padding)";
_messagebox._setpadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 19;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmessagebox)(this);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmessagebox  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 46;BA.debugLine="MessageBox.SetStyle(prop,sval)";
_messagebox._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 47;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmessagebox)(this);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmessagebox  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 36;BA.debugLine="Sub SetStyles(m As Map) As WixMessageBox";
 //BA.debugLineNum = 37;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 38;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 39;BA.debugLine="MessageBox.SetStyle(k,v)";
_messagebox._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 41;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmessagebox)(this);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmessagebox  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 58;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixMessage";
 //BA.debugLineNum = 59;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 60;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 61;BA.debugLine="MessageBox.SetTemplate(os)";
_messagebox._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmessagebox)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmessagebox  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub SetText(t As Object) As WixMessageBox";
 //BA.debugLineNum = 67;BA.debugLine="MessageBox.SetAttr(\"text\", t)";
_messagebox._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("text",_t);
 //BA.debugLineNum = 68;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmessagebox)(this);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmessagebox  _settitle(Object _t) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub SetTitle(t As Object) As WixMessageBox";
 //BA.debugLineNum = 53;BA.debugLine="MessageBox.SetAttr(\"title\", t)";
_messagebox._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("title",_t);
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmessagebox)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmessagebox  _settypealerterror(boolean _b) throws Exception{
 //BA.debugLineNum = 140;BA.debugLine="Sub SetTypeAlertError(b As Boolean) As WixMessageB";
 //BA.debugLineNum = 141;BA.debugLine="MessageBox.SetType(\"alert-error\")";
_messagebox._settype /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("alert-error");
 //BA.debugLineNum = 142;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmessagebox)(this);
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmessagebox  _settypealertwarning(boolean _b) throws Exception{
 //BA.debugLineNum = 146;BA.debugLine="Sub SetTypeAlertWarning(b As Boolean) As WixMessag";
 //BA.debugLineNum = 147;BA.debugLine="MessageBox.SetType(\"alert-warning\")";
_messagebox._settype /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("alert-warning");
 //BA.debugLineNum = 148;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmessagebox)(this);
 //BA.debugLineNum = 149;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmessagebox  _settypeconfirmerror(boolean _b) throws Exception{
 //BA.debugLineNum = 135;BA.debugLine="Sub SetTypeConfirmError(b As Boolean) As WixMessag";
 //BA.debugLineNum = 136;BA.debugLine="MessageBox.SetType(\"confirm-error\")";
_messagebox._settype /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("confirm-error");
 //BA.debugLineNum = 137;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmessagebox)(this);
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmessagebox  _settypeconfirmwarning(boolean _b) throws Exception{
 //BA.debugLineNum = 130;BA.debugLine="Sub SetTypeConfirmWarning(b As Boolean) As WixMess";
 //BA.debugLineNum = 131;BA.debugLine="MessageBox.SetType(\"confirm-warning\")";
_messagebox._settype /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("confirm-warning");
 //BA.debugLineNum = 132;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmessagebox)(this);
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmessagebox  _setwidth(Object _t) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub SetWidth(t As Object) As WixMessageBox";
 //BA.debugLineNum = 85;BA.debugLine="MessageBox.SetAttr(\"width\", t)";
_messagebox._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("width",_t);
 //BA.debugLineNum = 86;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmessagebox)(this);
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return null;
}
public String  _show(b4j.Mashy.BANanoWebixDemo.wixpage _page) throws Exception{
 //BA.debugLineNum = 159;BA.debugLine="Sub Show(Page As WixPage)";
 //BA.debugLineNum = 160;BA.debugLine="Page.ModalBox(Item)";
_page._modalbox /*String*/ (_item());
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
