package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixmultiview extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixmultiview", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixmultiview.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _multiview = null;
public b4j.example.main _main = null;
public b4j.example.pgtabbar _pgtabbar = null;
public b4j.example.pgtree _pgtree = null;
public b4j.example.pgmenu _pgmenu = null;
public b4j.example.pglist _pglist = null;
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
public b4j.example.pgunitlist _pgunitlist = null;
public b4j.example.pgpropertysheet _pgpropertysheet = null;
public b4j.example.pgtreetable _pgtreetable = null;
public b4j.example.pgsidebar _pgsidebar = null;
public b4j.example.pgcomments _pgcomments = null;
public b4j.example.pggrouplist _pggrouplist = null;
public b4j.example.pgcontext _pgcontext = null;
public b4j.example.pggooglemap _pggooglemap = null;
public b4j.example.pguploader1 _pguploader1 = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public MultiView As WixElement";
_multiview = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixmultiview  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize(sid As String) As WixMultiVi";
 //BA.debugLineNum = 9;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 10;BA.debugLine="MultiView.Initialize(ID)";
_multiview._initialize /*b4j.example.wixelement*/ (ba,_id);
 //BA.debugLineNum = 11;BA.debugLine="MultiView.SetView(\"multiview\")";
_multiview._setview /*b4j.example.wixelement*/ ("multiview");
 //BA.debugLineNum = 12;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmultiview)(this);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 25;BA.debugLine="Return MultiView.item";
if (true) return _multiview._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmultiview  _setanimate(boolean _b) throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Sub SetAnimate(b As Boolean) As WixMultiView";
 //BA.debugLineNum = 36;BA.debugLine="MultiView.SetAttr(\"animate\", b)";
_multiview._setattr /*b4j.example.wixelement*/ ("animate",(Object)(_b));
 //BA.debugLineNum = 37;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmultiview)(this);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmultiview  _setfitbiggest(boolean _b) throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Sub SetFitBiggest(b As Boolean) As WixMultiView";
 //BA.debugLineNum = 30;BA.debugLine="MultiView.SetAttr(\"fitBiggest\", b)";
_multiview._setattr /*b4j.example.wixelement*/ ("fitBiggest",(Object)(_b));
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmultiview)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmultiview  _setkeepviews(boolean _b) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Sub SetkeepViews(b As Boolean) As WixMultiView";
 //BA.debugLineNum = 42;BA.debugLine="MultiView.SetAttr(\"keepViews\", b)";
_multiview._setattr /*b4j.example.wixelement*/ ("keepViews",(Object)(_b));
 //BA.debugLineNum = 43;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmultiview)(this);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmultiview  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub SetTooltip(tt As String) As WixMultiView";
 //BA.debugLineNum = 18;BA.debugLine="MultiView.SetTooltip(tt)";
_multiview._settooltip /*b4j.example.wixelement*/ (_tt);
 //BA.debugLineNum = 19;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmultiview)(this);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
