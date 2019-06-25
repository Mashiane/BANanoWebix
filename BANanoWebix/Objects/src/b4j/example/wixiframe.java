package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixiframe extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixiframe", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixiframe.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _iframe = null;
public b4j.example.main _main = null;
public b4j.example.pgdataview _pgdataview = null;
public b4j.example.pgdatatable1 _pgdatatable1 = null;
public b4j.example.pgdatatable _pgdatatable = null;
public b4j.example.pgcharts _pgcharts = null;
public b4j.example.pgdataentry _pgdataentry = null;
public b4j.example.pgforms1 _pgforms1 = null;
public b4j.example.pgforms _pgforms = null;
public b4j.example.pgtoolbar _pgtoolbar = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.pgmultiview _pgmultiview = null;
public b4j.example.pglayouts1 _pglayouts1 = null;
public b4j.example.pglayouts2 _pglayouts2 = null;
public b4j.example.pglayouts _pglayouts = null;
public b4j.example.pglayout _pglayout = null;
public b4j.example.pglist _pglist = null;
public b4j.example.pgunitlist _pgunitlist = null;
public b4j.example.pgpropertysheet _pgpropertysheet = null;
public b4j.example.pgtree _pgtree = null;
public b4j.example.pgtreetable _pgtreetable = null;
public b4j.example.pgmenu _pgmenu = null;
public b4j.example.pgsidebar _pgsidebar = null;
public b4j.example.pgcomments _pgcomments = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public IFrame As WixElement";
_iframe = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixiframe  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize(sid As String) As WixIFrame";
 //BA.debugLineNum = 9;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 10;BA.debugLine="IFrame.Initialize(ID).SetView(\"iframe\")";
_iframe._initialize /*b4j.example.wixelement*/ (ba,_id)._setview /*b4j.example.wixelement*/ ("iframe");
 //BA.debugLineNum = 11;BA.debugLine="Return Me";
if (true) return (b4j.example.wixiframe)(this);
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
public b4j.example.wixiframe  _setcontainer(String _c) throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Sub SetContainer(c As String) As WixIFrame";
 //BA.debugLineNum = 15;BA.debugLine="IFrame.SetContainer(c)";
_iframe._setcontainer /*b4j.example.wixelement*/ (_c);
 //BA.debugLineNum = 16;BA.debugLine="Return Me";
if (true) return (b4j.example.wixiframe)(this);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixiframe  _setheight(int _h) throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Sub SetHeight(h As Int) As WixIFrame";
 //BA.debugLineNum = 32;BA.debugLine="IFrame.SetAttr(\"height\", h)";
_iframe._setattr /*b4j.example.wixelement*/ ("height",(Object)(_h));
 //BA.debugLineNum = 33;BA.debugLine="Return Me";
if (true) return (b4j.example.wixiframe)(this);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixiframe  _setsrc(String _t) throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Sub SetSRC(t As String) As WixIFrame";
 //BA.debugLineNum = 26;BA.debugLine="IFrame.SetAttr(\"src\", t)";
_iframe._setattr /*b4j.example.wixelement*/ ("src",(Object)(_t));
 //BA.debugLineNum = 27;BA.debugLine="Return Me";
if (true) return (b4j.example.wixiframe)(this);
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixiframe  _setwidth(int _w) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Sub SetWidth(w As Int) As WixIFrame";
 //BA.debugLineNum = 39;BA.debugLine="IFrame.SetAttr(\"width\", w)";
_iframe._setattr /*b4j.example.wixelement*/ ("width",(Object)(_w));
 //BA.debugLineNum = 40;BA.debugLine="Return Me";
if (true) return (b4j.example.wixiframe)(this);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
