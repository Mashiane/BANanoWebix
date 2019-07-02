package b4j.Mashy.BANanoWebix;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixpager extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebix", "b4j.Mashy.BANanoWebix.wixpager", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebix.wixpager.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebix.wixelement _pager = null;
public b4j.Mashy.BANanoWebix.main _main = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Pager As WixElement";
_pager = new b4j.Mashy.BANanoWebix.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebix.wixpager  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize(sID As String) As WixPager";
 //BA.debugLineNum = 9;BA.debugLine="ID = sID.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 10;BA.debugLine="Pager.Initialize(ID).SetView(\"pager\")";
_pager._initialize /*b4j.Mashy.BANanoWebix.wixelement*/ (ba,_id)._setview /*b4j.Mashy.BANanoWebix.wixelement*/ ("pager");
 //BA.debugLineNum = 11;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixpager)(this);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 40;BA.debugLine="Return Pager.item";
if (true) return _pager._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixpager  _setanimate(boolean _b) throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Sub SetAnimate(b As Boolean) As WixPager";
 //BA.debugLineNum = 28;BA.debugLine="Pager.SetAttr(\"animate\", b)";
_pager._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("animate",(Object)(_b));
 //BA.debugLineNum = 29;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixpager)(this);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixpager  _setcontainer(String _cont) throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub SetContainer(cont As String) As WixPager";
 //BA.debugLineNum = 16;BA.debugLine="Pager.SetAttr(\"container\", cont)";
_pager._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("container",(Object)(_cont));
 //BA.debugLineNum = 17;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixpager)(this);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixpager  _setgroup(int _g) throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub SetGroup(g As Int) As WixPager";
 //BA.debugLineNum = 22;BA.debugLine="Pager.SetAttr(\"group\", g)";
_pager._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("group",(Object)(_g));
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixpager)(this);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixpager  _setsize(int _s) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub SetSize(s As Int) As WixPager";
 //BA.debugLineNum = 34;BA.debugLine="Pager.SetAttr(\"size\", s)";
_pager._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("size",(Object)(_s));
 //BA.debugLineNum = 35;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixpager)(this);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
