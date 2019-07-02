package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixtabview extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixtabview", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixtabview.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _tabview = null;
public b4j.example.wixelement _mv = null;
public b4j.example.wixelement _tb = null;
public b4j.example.main _main = null;
public b4j.example.pgvideo _pgvideo = null;
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
public b4j.example.pguploader2 _pguploader2 = null;
public b4j.example.pguploader3 _pguploader3 = null;
public String  _addtab(String _iid,String _header,String _template,anywheresoftware.b4a.objects.collections.Map _attributes) throws Exception{
b4j.example.wixelement _i = null;
String _astr = "";
String _vstr = "";
 //BA.debugLineNum = 69;BA.debugLine="Sub AddTab(iid As String, header As String, templa";
 //BA.debugLineNum = 70;BA.debugLine="Dim i As WixElement";
_i = new b4j.example.wixelement();
 //BA.debugLineNum = 71;BA.debugLine="i.Initialize(iid)";
_i._initialize /*b4j.example.wixelement*/ (ba,_iid);
 //BA.debugLineNum = 72;BA.debugLine="i.SetHeader(header)";
_i._setheader /*b4j.example.wixelement*/ (_header);
 //BA.debugLineNum = 73;BA.debugLine="i.SetTemplate(template)";
_i._settemplate /*b4j.example.wixelement*/ ((Object)(_template));
 //BA.debugLineNum = 74;BA.debugLine="If attributes <> Null Then";
if (_attributes!= null) { 
 //BA.debugLineNum = 75;BA.debugLine="For Each astr As String In attributes.Keys";
{
final anywheresoftware.b4a.BA.IterableList group6 = _attributes.Keys();
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_astr = BA.ObjectToString(group6.Get(index6));
 //BA.debugLineNum = 76;BA.debugLine="Dim vstr As String = attributes.Get(astr)";
_vstr = BA.ObjectToString(_attributes.Get((Object)(_astr)));
 //BA.debugLineNum = 77;BA.debugLine="i.SetProperty(astr,vstr)";
_i._setproperty /*b4j.example.wixelement*/ (_astr,(Object)(_vstr));
 }
};
 };
 //BA.debugLineNum = 80;BA.debugLine="TabView.AddCells(i.Item)";
_tabview._addcells /*b4j.example.wixelement*/ (_i._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public TabView As WixElement";
_tabview = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private mv As WixElement";
_mv = new b4j.example.wixelement();
 //BA.debugLineNum = 6;BA.debugLine="Private tb As WixElement";
_tb = new b4j.example.wixelement();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixtabview  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(sid As String) As WixTabView";
 //BA.debugLineNum = 11;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 12;BA.debugLine="TabView.Initialize(ID)";
_tabview._initialize /*b4j.example.wixelement*/ (ba,_id);
 //BA.debugLineNum = 13;BA.debugLine="TabView.SetView(\"tabview\")";
_tabview._setview /*b4j.example.wixelement*/ ("tabview");
 //BA.debugLineNum = 14;BA.debugLine="mv.Initialize(ID & \"mv\")";
_mv._initialize /*b4j.example.wixelement*/ (ba,_id+"mv");
 //BA.debugLineNum = 15;BA.debugLine="tb.Initialize(ID & \"tb\")";
_tb._initialize /*b4j.example.wixelement*/ (ba,_id+"tb");
 //BA.debugLineNum = 16;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtabview)(this);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 51;BA.debugLine="TabView.SetAttr(\"tabbar\", tb.Item)";
_tabview._setattr /*b4j.example.wixelement*/ ("tabbar",(Object)(_tb._item /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 52;BA.debugLine="TabView.SetAttr(\"multiview\", mv.Item)";
_tabview._setattr /*b4j.example.wixelement*/ ("multiview",(Object)(_mv._item /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 53;BA.debugLine="Return TabView.item";
if (true) return _tabview._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtabview  _setanimate(boolean _b) throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Sub SetAnimate(b As Boolean) As WixTabView";
 //BA.debugLineNum = 33;BA.debugLine="mv.SetAnimate(b)";
_mv._setanimate /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 34;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtabview)(this);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtabview  _setheight(int _h) throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Sub SetHeight(h As Int) As WixTabView";
 //BA.debugLineNum = 21;BA.debugLine="TabView.SetAttr(\"height\", h)";
_tabview._setattr /*b4j.example.wixelement*/ ("height",(Object)(_h));
 //BA.debugLineNum = 22;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtabview)(this);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtabview  _setmultiview(boolean _b) throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Sub SetMultiView(b As Boolean) As WixTabView";
 //BA.debugLineNum = 64;BA.debugLine="TabView.SetAttr(\"multiview\",b)";
_tabview._setattr /*b4j.example.wixelement*/ ("multiview",(Object)(_b));
 //BA.debugLineNum = 65;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtabview)(this);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtabview  _settabbarclose(boolean _b) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Sub SetTabBarClose(b As Boolean) As WixTabView";
 //BA.debugLineNum = 39;BA.debugLine="tb.SetAttr(\"close\", b)";
_tb._setattr /*b4j.example.wixelement*/ ("close",(Object)(_b));
 //BA.debugLineNum = 40;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtabview)(this);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtabview  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub SetTooltip(tt As String) As WixTabView";
 //BA.debugLineNum = 45;BA.debugLine="TabView.SetTooltip(tt)";
_tabview._settooltip /*b4j.example.wixelement*/ (_tt);
 //BA.debugLineNum = 46;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtabview)(this);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtabview  _settypebottom(boolean _b) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub SetTypeBottom(b As Boolean) As WixTabView";
 //BA.debugLineNum = 58;BA.debugLine="TabView.SetType(\"bottom\")";
_tabview._settype /*b4j.example.wixelement*/ ("bottom");
 //BA.debugLineNum = 59;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtabview)(this);
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtabview  _setwidth(int _w) throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Sub SetWidth(w As Int) As WixTabView";
 //BA.debugLineNum = 27;BA.debugLine="TabView.SetAttr(\"width\", w)";
_tabview._setattr /*b4j.example.wixelement*/ ("width",(Object)(_w));
 //BA.debugLineNum = 28;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtabview)(this);
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
