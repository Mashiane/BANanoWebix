package b4j.Mashy.BANanoWebix;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixcontext extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebix", "b4j.Mashy.BANanoWebix.wixcontext", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebix.wixcontext.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebix.wixelement _context = null;
public anywheresoftware.b4a.objects.collections.Map _body = null;
public b4j.Mashy.BANanoWebix.main _main = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Context As WixElement";
_context = new b4j.Mashy.BANanoWebix.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private body As Map";
_body = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebix.wixcontext  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(sid As String) As WixContext";
 //BA.debugLineNum = 10;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 11;BA.debugLine="Context.Initialize(ID).setview(\"context\")";
_context._initialize /*b4j.Mashy.BANanoWebix.wixelement*/ (ba,_id)._setview /*b4j.Mashy.BANanoWebix.wixelement*/ ("context");
 //BA.debugLineNum = 12;BA.debugLine="body.Initialize";
_body.Initialize();
 //BA.debugLineNum = 13;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixcontext)(this);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 36;BA.debugLine="Context.SetAttr(\"body\", body)";
_context._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("body",(Object)(_body.getObject()));
 //BA.debugLineNum = 37;BA.debugLine="Return Context.item";
if (true) return _context._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixcontext  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Sub SetHeight(h As Object) As WixContext";
 //BA.debugLineNum = 24;BA.debugLine="Context.SetAttr(\"height\", h)";
_context._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("height",_h);
 //BA.debugLineNum = 25;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixcontext)(this);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixcontext  _setmaster(String _pid) throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub SetMaster(pID As String) As WixContext";
 //BA.debugLineNum = 18;BA.debugLine="Context.SetAttr(\"master\", pID)";
_context._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("master",(Object)(_pid));
 //BA.debugLineNum = 19;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixcontext)(this);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixcontext  _settemplate(String _t) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Sub SetTemplate(t As String) As WixContext";
 //BA.debugLineNum = 42;BA.debugLine="body.put(\"template\", t)";
_body.Put((Object)("template"),(Object)(_t));
 //BA.debugLineNum = 43;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixcontext)(this);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixcontext  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Sub SetWidth(w As Object) As WixContext";
 //BA.debugLineNum = 30;BA.debugLine="Context.SetAttr(\"width\", w)";
_context._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("width",_w);
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixcontext)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
