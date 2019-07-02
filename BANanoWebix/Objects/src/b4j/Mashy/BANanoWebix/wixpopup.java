package b4j.Mashy.BANanoWebix;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixpopup extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebix", "b4j.Mashy.BANanoWebix.wixpopup", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebix.wixpopup.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebix.wixelement _popup = null;
public anywheresoftware.b4a.objects.collections.Map _body = null;
public b4j.Mashy.BANanoWebix.main _main = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Popup As WixElement";
_popup = new b4j.Mashy.BANanoWebix.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private body As Map";
_body = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebix.wixpopup  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(sid As String) As WixPopUp";
 //BA.debugLineNum = 10;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 11;BA.debugLine="Popup.Initialize(ID).setview(\"popup\")";
_popup._initialize /*b4j.Mashy.BANanoWebix.wixelement*/ (ba,_id)._setview /*b4j.Mashy.BANanoWebix.wixelement*/ ("popup");
 //BA.debugLineNum = 12;BA.debugLine="body.Initialize";
_body.Initialize();
 //BA.debugLineNum = 13;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixpopup)(this);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 55;BA.debugLine="Popup.SetAttr(\"body\", body)";
_popup._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("body",(Object)(_body.getObject()));
 //BA.debugLineNum = 56;BA.debugLine="Return Popup.item";
if (true) return _popup._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixpopup  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Sub SetHeight(h As Object) As WixPopUp";
 //BA.debugLineNum = 24;BA.debugLine="Popup.SetAttr(\"height\", h)";
_popup._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("height",_h);
 //BA.debugLineNum = 25;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixpopup)(this);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixpopup  _setmove(boolean _b) throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub SetMove(b As Boolean) As WixPopUp";
 //BA.debugLineNum = 18;BA.debugLine="Popup.SetAttr(\"move\", b)";
_popup._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("move",(Object)(_b));
 //BA.debugLineNum = 19;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixpopup)(this);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixpopup  _setposition(String _c) throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Sub SetPosition(c As String) As WixPopUp";
 //BA.debugLineNum = 36;BA.debugLine="Popup.SetAttr(\"position\", c)";
_popup._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("position",(Object)(_c));
 //BA.debugLineNum = 37;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixpopup)(this);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixpopup  _setpositioncenter(String _c) throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Sub SetPositionCenter(c As String) As WixPopUp  'i";
 //BA.debugLineNum = 30;BA.debugLine="Popup.SetAttr(\"position\", \"center\")";
_popup._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("position",(Object)("center"));
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixpopup)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixpopup  _setpositionright(String _c) throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Sub SetPositionRight(c As String) As WixPopUp  'ig";
 //BA.debugLineNum = 43;BA.debugLine="Popup.SetAttr(\"position\", \"right\")";
_popup._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("position",(Object)("right"));
 //BA.debugLineNum = 44;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixpopup)(this);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixpopup  _settemplate(String _t) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub SetTemplate(t As String) As WixPopUp";
 //BA.debugLineNum = 61;BA.debugLine="body.Put(\"template\", t)";
_body.Put((Object)("template"),(Object)(_t));
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixpopup)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixpopup  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Sub SetWidth(w As object) As WixPopUp";
 //BA.debugLineNum = 49;BA.debugLine="Popup.SetAttr(\"width\", w)";
_popup._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("width",_w);
 //BA.debugLineNum = 50;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixpopup)(this);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
