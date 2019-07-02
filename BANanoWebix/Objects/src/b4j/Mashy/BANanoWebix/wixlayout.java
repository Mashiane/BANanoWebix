package b4j.Mashy.BANanoWebix;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixlayout extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebix", "b4j.Mashy.BANanoWebix.wixlayout", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebix.wixlayout.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebix.wixelement _layout = null;
public b4j.Mashy.BANanoWebix.main _main = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Layout As WixElement";
_layout = new b4j.Mashy.BANanoWebix.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebix.wixlayout  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize(sID As String) As WixLayout";
 //BA.debugLineNum = 9;BA.debugLine="ID = sID.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 10;BA.debugLine="Layout.Initialize(ID).SetView(\"layout\")";
_layout._initialize /*b4j.Mashy.BANanoWebix.wixelement*/ (ba,_id)._setview /*b4j.Mashy.BANanoWebix.wixelement*/ ("layout");
 //BA.debugLineNum = 11;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixlayout)(this);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 16;BA.debugLine="Return Layout.item";
if (true) return _layout._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixlayout  _setscroll(boolean _b) throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub SetScroll(b As Boolean) As WixLayout";
 //BA.debugLineNum = 22;BA.debugLine="Layout.SetProperty(\"scroll\", b)";
_layout._setproperty /*b4j.Mashy.BANanoWebix.wixelement*/ ("scroll",(Object)(_b));
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixlayout)(this);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixlayout  _settemplate(String _t) throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Sub SetTemplate(t As String) As WixLayout";
 //BA.debugLineNum = 28;BA.debugLine="Layout.SetTemplate(t)";
_layout._settemplate /*b4j.Mashy.BANanoWebix.wixelement*/ ((Object)(_t));
 //BA.debugLineNum = 29;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixlayout)(this);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixlayout  _settype(String _t) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub SetType(t As String) As WixLayout";
 //BA.debugLineNum = 35;BA.debugLine="Layout.SetType(t)";
_layout._settype /*b4j.Mashy.BANanoWebix.wixelement*/ (_t);
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixlayout)(this);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixlayout  _settypeclean(String _a) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Sub SetTypeClean(a As String) As WixLayout   'igno";
 //BA.debugLineNum = 41;BA.debugLine="SetType(\"clean\")";
_settype("clean");
 //BA.debugLineNum = 42;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixlayout)(this);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixlayout  _settypeform(String _a) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub SetTypeForm(a As String) As WixLayout   'ignor";
 //BA.debugLineNum = 71;BA.debugLine="SetType(\"form\")";
_settype("form");
 //BA.debugLineNum = 72;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixlayout)(this);
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixlayout  _settypehead(String _a) throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub SetTypeHead(a As String) As WixLayout   'ignor";
 //BA.debugLineNum = 65;BA.debugLine="SetType(\"head\")";
_settype("head");
 //BA.debugLineNum = 66;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixlayout)(this);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixlayout  _settypeline(String _a) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub SetTypeLine(a As String) As WixLayout   'ignor";
 //BA.debugLineNum = 47;BA.debugLine="SetType(\"line\")";
_settype("line");
 //BA.debugLineNum = 48;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixlayout)(this);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixlayout  _settypespace(String _a) throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub SetTypeSpace(a As String) As WixLayout   'igno";
 //BA.debugLineNum = 59;BA.debugLine="SetType(\"space\")";
_settype("space");
 //BA.debugLineNum = 60;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixlayout)(this);
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixlayout  _settypewide(String _a) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub SetTypeWide(a As String) As WixLayout   'ignor";
 //BA.debugLineNum = 53;BA.debugLine="SetType(\"wide\")";
_settype("wide");
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixlayout)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
