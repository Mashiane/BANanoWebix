package b4j.Mashy.BANanoWebix;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixvideo extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebix", "b4j.Mashy.BANanoWebix.wixvideo", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebix.wixvideo.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebix.wixelement _video = null;
public anywheresoftware.b4a.objects.collections.List _sources = null;
public b4j.Mashy.BANanoWebix.main _main = null;
public String  _addtoform(b4j.Mashy.BANanoWebix.wixform _frm) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 60;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Video As WixElement";
_video = new b4j.Mashy.BANanoWebix.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private sources As List";
_sources = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebix.wixvideo  _initialize(anywheresoftware.b4a.BA _ba,String _iid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize(iID As String) As WixVideo";
 //BA.debugLineNum = 16;BA.debugLine="ID = iID.tolowercase";
_id = _iid.toLowerCase();
 //BA.debugLineNum = 17;BA.debugLine="Video.Initialize(iID).SetView(\"video\")";
_video._initialize /*b4j.Mashy.BANanoWebix.wixelement*/ (ba,_iid)._setview /*b4j.Mashy.BANanoWebix.wixelement*/ ("video");
 //BA.debugLineNum = 18;BA.debugLine="sources.Initialize";
_sources.Initialize();
 //BA.debugLineNum = 19;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixvideo)(this);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 65;BA.debugLine="Video.SetAttr(\"src\", sources)";
_video._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("src",(Object)(_sources.getObject()));
 //BA.debugLineNum = 66;BA.debugLine="Return Video.item";
if (true) return _video._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixvideo  _setautoplay(boolean _b) throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Sub SetAutoPlay(b As Boolean) As WixVideo";
 //BA.debugLineNum = 36;BA.debugLine="Video.SetAttr(\"autoplay\", b)";
_video._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("autoplay",(Object)(_b));
 //BA.debugLineNum = 37;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixvideo)(this);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixvideo  _setborderless(boolean _b) throws Exception{
 //BA.debugLineNum = 9;BA.debugLine="Sub SetBorderLess(b As Boolean) As WixVideo";
 //BA.debugLineNum = 10;BA.debugLine="Video.SetAttr(\"borderless\", b)";
_video._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("borderless",(Object)(_b));
 //BA.debugLineNum = 11;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixvideo)(this);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixvideo  _setcontrols(boolean _b) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Sub SetControls(b As Boolean) As WixVideo";
 //BA.debugLineNum = 42;BA.debugLine="Video.SetAttr(\"controls\", b)";
_video._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("controls",(Object)(_b));
 //BA.debugLineNum = 43;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixvideo)(this);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixvideo  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub SetHeight(h As Object) As WixVideo";
 //BA.debugLineNum = 48;BA.debugLine="Video.SetAttr(\"height\", h)";
_video._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("height",_h);
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixvideo)(this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixvideo  _setsrc(String _l) throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Sub SetSRC(l As String) As WixVideo";
 //BA.debugLineNum = 77;BA.debugLine="sources.Add(l)";
_sources.Add((Object)(_l));
 //BA.debugLineNum = 78;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixvideo)(this);
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixvideo  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 30;BA.debugLine="Video.SetStyle(prop,val)";
_video._setstyle /*b4j.Mashy.BANanoWebix.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixvideo)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixvideo  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Sub SetTooltip(tt As String) As WixVideo";
 //BA.debugLineNum = 24;BA.debugLine="Video.SetProperty(\"tooltip\", tt)";
_video._setproperty /*b4j.Mashy.BANanoWebix.wixelement*/ ("tooltip",(Object)(_tt));
 //BA.debugLineNum = 25;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixvideo)(this);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixvideo  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub SetValue(v As String) As WixVideo";
 //BA.debugLineNum = 71;BA.debugLine="Video.Value = v";
_video._value /*Object*/  = (Object)(_v);
 //BA.debugLineNum = 72;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixvideo)(this);
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixvideo  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub SetWidth(w As Object) As WixVideo";
 //BA.debugLineNum = 54;BA.debugLine="Video.SetAttr(\"width\", w)";
_video._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("width",_w);
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixvideo)(this);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
