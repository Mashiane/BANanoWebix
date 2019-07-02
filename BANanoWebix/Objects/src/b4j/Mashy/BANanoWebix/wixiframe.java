package b4j.Mashy.BANanoWebix;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixiframe extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebix", "b4j.Mashy.BANanoWebix.wixiframe", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebix.wixiframe.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebix.wixelement _iframe = null;
public b4j.Mashy.BANanoWebix.main _main = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public IFrame As WixElement";
_iframe = new b4j.Mashy.BANanoWebix.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebix.wixiframe  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize(sid As String) As WixIFrame";
 //BA.debugLineNum = 9;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 10;BA.debugLine="IFrame.Initialize(ID).SetView(\"iframe\")";
_iframe._initialize /*b4j.Mashy.BANanoWebix.wixelement*/ (ba,_id)._setview /*b4j.Mashy.BANanoWebix.wixelement*/ ("iframe");
 //BA.debugLineNum = 11;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixiframe)(this);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 21;BA.debugLine="Return IFrame.item";
if (true) return _iframe._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixiframe  _setcontainer(String _c) throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Sub SetContainer(c As String) As WixIFrame";
 //BA.debugLineNum = 15;BA.debugLine="IFrame.SetContainer(c)";
_iframe._setcontainer /*b4j.Mashy.BANanoWebix.wixelement*/ (_c);
 //BA.debugLineNum = 16;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixiframe)(this);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixiframe  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Sub SetHeight(h As Object) As WixIFrame";
 //BA.debugLineNum = 39;BA.debugLine="IFrame.SetAttr(\"height\", h)";
_iframe._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("height",_h);
 //BA.debugLineNum = 40;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixiframe)(this);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixiframe  _setscroll(boolean _b) throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Sub SetScroll(b As Boolean) As WixIFrame";
 //BA.debugLineNum = 27;BA.debugLine="IFrame.SetProperty(\"scroll\", b)";
_iframe._setproperty /*b4j.Mashy.BANanoWebix.wixelement*/ ("scroll",(Object)(_b));
 //BA.debugLineNum = 28;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixiframe)(this);
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixiframe  _setsrc(String _t) throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Sub SetSRC(t As String) As WixIFrame";
 //BA.debugLineNum = 33;BA.debugLine="IFrame.SetAttr(\"src\", t)";
_iframe._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("src",(Object)(_t));
 //BA.debugLineNum = 34;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixiframe)(this);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixiframe  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Sub SetWidth(w As Object) As WixIFrame";
 //BA.debugLineNum = 46;BA.debugLine="IFrame.SetAttr(\"width\", w)";
_iframe._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("width",_w);
 //BA.debugLineNum = 47;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixiframe)(this);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
