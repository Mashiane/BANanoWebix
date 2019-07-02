package b4j.Mashy.BANanoWebix;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixwindow extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebix", "b4j.Mashy.BANanoWebix.wixwindow", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebix.wixwindow.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebix.wixelement _window = null;
public b4j.Mashy.BANanoWebix.wixtoolbar _toolbar = null;
public b4j.Mashy.BANanoWebix.wixelement _body = null;
public String _toolbarid = "";
public b4j.Mashy.BANanoWebix.main _main = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Window As WixElement";
_window = new b4j.Mashy.BANanoWebix.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Public ToolBar As WixToolBar";
_toolbar = new b4j.Mashy.BANanoWebix.wixtoolbar();
 //BA.debugLineNum = 6;BA.debugLine="Private body As WixElement";
_body = new b4j.Mashy.BANanoWebix.wixelement();
 //BA.debugLineNum = 7;BA.debugLine="Public ToolBarID As String";
_toolbarid = "";
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebix.wixwindow  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(sid As String) As WixWindow";
 //BA.debugLineNum = 12;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 13;BA.debugLine="ToolBarID = ID & \"tblbar\"";
_toolbarid = _id+"tblbar";
 //BA.debugLineNum = 14;BA.debugLine="Window.Initialize(ID).SetView(\"window\")";
_window._initialize /*b4j.Mashy.BANanoWebix.wixelement*/ (ba,_id)._setview /*b4j.Mashy.BANanoWebix.wixelement*/ ("window");
 //BA.debugLineNum = 15;BA.debugLine="ToolBar.Initialize(ToolBarID)";
_toolbar._initialize /*b4j.Mashy.BANanoWebix.wixtoolbar*/ (ba,_toolbarid);
 //BA.debugLineNum = 16;BA.debugLine="body.Initialize(ID & \"body\")";
_body._initialize /*b4j.Mashy.BANanoWebix.wixelement*/ (ba,_id+"body");
 //BA.debugLineNum = 17;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixwindow)(this);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 55;BA.debugLine="Window.SetAttr(\"body\", body.Item)";
_window._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("body",(Object)(_body._item /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 56;BA.debugLine="Return Window.item";
if (true) return _window._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixwindow  _setclose(boolean _b) throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Sub SetClose(b As Boolean) As WixWindow";
 //BA.debugLineNum = 100;BA.debugLine="Window.SetAttr(\"close\", b)";
_window._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("close",(Object)(_b));
 //BA.debugLineNum = 101;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixwindow)(this);
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixwindow  _setfullscreen(boolean _b) throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub SetFullScreen(b As Boolean) As WixWindow";
 //BA.debugLineNum = 22;BA.debugLine="Window.SetAttr(\"fullscreen\", b)";
_window._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("fullscreen",(Object)(_b));
 //BA.debugLineNum = 23;BA.debugLine="Window.SetAttr(\"top\", 0)";
_window._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("top",(Object)(0));
 //BA.debugLineNum = 24;BA.debugLine="Window.SetAttr(\"left\", 0)";
_window._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("left",(Object)(0));
 //BA.debugLineNum = 25;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixwindow)(this);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixwindow  _sethead(String _hdr) throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Sub SetHead(hdr As String) As WixWindow";
 //BA.debugLineNum = 43;BA.debugLine="Window.SetAttr(\"head\", hdr)";
_window._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("head",(Object)(_hdr));
 //BA.debugLineNum = 44;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixwindow)(this);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixwindow  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub SetHeight(h As Object) As WixWindow";
 //BA.debugLineNum = 94;BA.debugLine="Window.SetAttr(\"height\", h)";
_window._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("height",_h);
 //BA.debugLineNum = 95;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixwindow)(this);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixwindow  _setleft(int _t) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Sub SetLeft(t As Int) As WixWindow";
 //BA.debugLineNum = 88;BA.debugLine="Window.SetAttr(\"left\", t)";
_window._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("left",(Object)(_t));
 //BA.debugLineNum = 89;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixwindow)(this);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixwindow  _setmodal(boolean _b) throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Sub SetModal(b As Boolean) As WixWindow";
 //BA.debugLineNum = 37;BA.debugLine="Window.SetAttr(\"modal\", b)";
_window._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("modal",(Object)(_b));
 //BA.debugLineNum = 38;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixwindow)(this);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixwindow  _setmove(boolean _t) throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Sub SetMove(t As Boolean) As WixWindow";
 //BA.debugLineNum = 74;BA.debugLine="Window.SetAttr(\"move\", t)";
_window._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("move",(Object)(_t));
 //BA.debugLineNum = 75;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixwindow)(this);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixwindow  _setpositioncenter(boolean _b) throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Sub SetPositionCenter(b As Boolean) As WixWindow";
 //BA.debugLineNum = 30;BA.debugLine="Window.SetAttr(\"position\", \"center\")";
_window._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("position",(Object)("center"));
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixwindow)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixwindow  _setresize(boolean _t) throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Sub SetResize(t As Boolean) As WixWindow";
 //BA.debugLineNum = 68;BA.debugLine="Window.SetAttr(\"resize\", t)";
_window._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("resize",(Object)(_t));
 //BA.debugLineNum = 69;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixwindow)(this);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixwindow  _settemplate(String _t) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub SetTemplate(t As String) As WixWindow";
 //BA.debugLineNum = 61;BA.debugLine="body.SetTemplate(t)";
_body._settemplate /*b4j.Mashy.BANanoWebix.wixelement*/ ((Object)(_t));
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixwindow)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixwindow  _settoolbar(boolean _b) throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Sub SetToolBar(b As Boolean) As WixWindow  'ignore";
 //BA.debugLineNum = 49;BA.debugLine="Window.SetAttr(\"head\", ToolBar.Item)";
_window._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("head",(Object)(_toolbar._item /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 50;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixwindow)(this);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixwindow  _settop(int _t) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub SetTop(t As Int) As WixWindow";
 //BA.debugLineNum = 81;BA.debugLine="Window.SetAttr(\"top\", t)";
_window._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("top",(Object)(_t));
 //BA.debugLineNum = 82;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixwindow)(this);
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixwindow  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Sub SetWidth(w As object) As WixWindow";
 //BA.debugLineNum = 107;BA.debugLine="Window.SetAttr(\"width\", w)";
_window._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("width",_w);
 //BA.debugLineNum = 108;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixwindow)(this);
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
