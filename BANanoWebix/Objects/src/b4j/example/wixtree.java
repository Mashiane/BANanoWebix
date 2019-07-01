package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixtree extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixtree", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixtree.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _tree = null;
public anywheresoftware.b4a.objects.collections.Map _scheme = null;
public anywheresoftware.b4a.objects.collections.List _items = null;
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
public b4j.example.wixtree  _additem(String _parentid,String _meid,String _mvalue,String _mhref,String _micon,String _badge,String _target,boolean _mopen) throws Exception{
anywheresoftware.b4a.objects.collections.Map _mitem = null;
 //BA.debugLineNum = 92;BA.debugLine="Sub AddItem(parentID As String, meID As String, mV";
 //BA.debugLineNum = 93;BA.debugLine="parentID = parentID.tolowercase";
_parentid = _parentid.toLowerCase();
 //BA.debugLineNum = 94;BA.debugLine="meID = meID.tolowercase";
_meid = _meid.toLowerCase();
 //BA.debugLineNum = 95;BA.debugLine="Dim mitem As Map = CreateMap()";
_mitem = new anywheresoftware.b4a.objects.collections.Map();
_mitem = __c.createMap(new Object[] {});
 //BA.debugLineNum = 96;BA.debugLine="mitem.Put(\"id\", meID)";
_mitem.Put((Object)("id"),(Object)(_meid));
 //BA.debugLineNum = 97;BA.debugLine="mitem.Put(\"value\", mValue)";
_mitem.Put((Object)("value"),(Object)(_mvalue));
 //BA.debugLineNum = 98;BA.debugLine="mitem.Put(\"href\", mhref)";
_mitem.Put((Object)("href"),(Object)(_mhref));
 //BA.debugLineNum = 99;BA.debugLine="mitem.Put(\"badge\", badge)";
_mitem.Put((Object)("badge"),(Object)(_badge));
 //BA.debugLineNum = 100;BA.debugLine="mitem.Put(\"target\", target)";
_mitem.Put((Object)("target"),(Object)(_target));
 //BA.debugLineNum = 101;BA.debugLine="mitem.Put(\"icon\", mIcon)";
_mitem.Put((Object)("icon"),(Object)(_micon));
 //BA.debugLineNum = 102;BA.debugLine="mitem.Put(\"open\", mOpen)";
_mitem.Put((Object)("open"),(Object)(_mopen));
 //BA.debugLineNum = 103;BA.debugLine="mitem.Put(\"parentid\", parentID)";
_mitem.Put((Object)("parentid"),(Object)(_parentid));
 //BA.debugLineNum = 104;BA.debugLine="Items.Add(mitem)";
_items.Add((Object)(_mitem.getObject()));
 //BA.debugLineNum = 105;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtree)(this);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Tree As WixElement";
_tree = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private scheme As Map";
_scheme = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 6;BA.debugLine="Public Items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixtree  _initialize(anywheresoftware.b4a.BA _ba,String _eid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(eID As String) As WixTree";
 //BA.debugLineNum = 11;BA.debugLine="ID = eID.tolowercase";
_id = _eid.toLowerCase();
 //BA.debugLineNum = 12;BA.debugLine="Tree.Initialize(ID).SetView(\"tree\")";
_tree._initialize /*b4j.example.wixelement*/ (ba,_id)._setview /*b4j.example.wixelement*/ ("tree");
 //BA.debugLineNum = 13;BA.debugLine="scheme = CreateMap()";
_scheme = __c.createMap(new Object[] {});
 //BA.debugLineNum = 14;BA.debugLine="Items.Initialize";
_items.Initialize();
 //BA.debugLineNum = 15;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtree)(this);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 20;BA.debugLine="Tree.SetAttr(\"scheme\", scheme)";
_tree._setattr /*b4j.example.wixelement*/ ("scheme",(Object)(_scheme.getObject()));
 //BA.debugLineNum = 21;BA.debugLine="Return Tree.item";
if (true) return _tree._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtree  _setborderless(boolean _b) throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Sub SetBorderLess(b As Boolean) As WixTree";
 //BA.debugLineNum = 32;BA.debugLine="Tree.SetBorderLess(b)";
_tree._setborderless /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 33;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtree)(this);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtree  _setdata(anywheresoftware.b4a.objects.collections.List _data) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Sub SetData(data As List) As WixTree";
 //BA.debugLineNum = 57;BA.debugLine="Tree.SetData(data)";
_tree._setdata /*b4j.example.wixelement*/ (_data);
 //BA.debugLineNum = 58;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtree)(this);
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtree  _setgroupby(String _g) throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Sub SetGroupBy(g As String) As WixTree";
 //BA.debugLineNum = 26;BA.debugLine="scheme.Put(\"$group\", g)";
_scheme.Put((Object)("$group"),(Object)(_g));
 //BA.debugLineNum = 27;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtree)(this);
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtree  _setheight(int _h) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub SetHeight(h As Int) As WixTree";
 //BA.debugLineNum = 81;BA.debugLine="Tree.SetHeight(h)";
_tree._setheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 82;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtree)(this);
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtree  _setmultiselect(boolean _b) throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Sub SetMultiSelect(b As Boolean) As WixTree";
 //BA.debugLineNum = 44;BA.debugLine="Tree.SetAttr(\"select\", \"multiselect\")";
_tree._setattr /*b4j.example.wixelement*/ ("select",(Object)("multiselect"));
 //BA.debugLineNum = 45;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtree)(this);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtree  _setselect(boolean _b) throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Sub SetSelect(b As Boolean) As WixTree";
 //BA.debugLineNum = 38;BA.debugLine="Tree.SetSelect(b)";
_tree._setselect /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 39;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtree)(this);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtree  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 63;BA.debugLine="Tree.SetStyle(prop,val)";
_tree._setstyle /*b4j.example.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 64;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtree)(this);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtree  _settemplate(Object _t) throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Sub SetTemplate(t As Object) As WixTree";
 //BA.debugLineNum = 69;BA.debugLine="Tree.SetTemplate(t)";
_tree._settemplate /*b4j.example.wixelement*/ (_t);
 //BA.debugLineNum = 70;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtree)(this);
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtree  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Sub SetTooltip(tt As String) As WixTree";
 //BA.debugLineNum = 75;BA.debugLine="Tree.SetTooltip(tt)";
_tree._settooltip /*b4j.example.wixelement*/ (_tt);
 //BA.debugLineNum = 76;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtree)(this);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtree  _settypelinetree() throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Sub SetTypeLineTree As WixTree";
 //BA.debugLineNum = 51;BA.debugLine="Tree.SetType(\"lineTree\")";
_tree._settype /*b4j.example.wixelement*/ ("lineTree");
 //BA.debugLineNum = 52;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtree)(this);
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtree  _setwidth(int _h) throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Sub SetWidth(h As Int) As WixTree";
 //BA.debugLineNum = 87;BA.debugLine="Tree.SetWidth(h)";
_tree._setwidth /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 88;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtree)(this);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
