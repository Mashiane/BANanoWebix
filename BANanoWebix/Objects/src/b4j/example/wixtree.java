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
 //BA.debugLineNum = 4;BA.debugLine="Public Tree As WixElement";
_tree = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private scheme As Map";
_scheme = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixtree  _initialize(anywheresoftware.b4a.BA _ba,String _eid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(eID As String) As WixTree";
 //BA.debugLineNum = 10;BA.debugLine="ID = eID.tolowercase";
_id = _eid.toLowerCase();
 //BA.debugLineNum = 11;BA.debugLine="Tree.Initialize(ID).SetView(\"tree\")";
_tree._initialize /*b4j.example.wixelement*/ (ba,_id)._setview /*b4j.example.wixelement*/ ("tree");
 //BA.debugLineNum = 12;BA.debugLine="scheme = CreateMap()";
_scheme = __c.createMap(new Object[] {});
 //BA.debugLineNum = 13;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtree)(this);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 18;BA.debugLine="Tree.SetAttr(\"scheme\", scheme)";
_tree._setattr /*b4j.example.wixelement*/ ("scheme",(Object)(_scheme.getObject()));
 //BA.debugLineNum = 19;BA.debugLine="Return Tree.item";
if (true) return _tree._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtree  _setborderless(boolean _b) throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Sub SetBorderLess(b As Boolean) As WixTree";
 //BA.debugLineNum = 30;BA.debugLine="Tree.SetBorderLess(b)";
_tree._setborderless /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtree)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtree  _setdata(anywheresoftware.b4a.objects.collections.List _data) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Sub SetData(data As List) As WixTree";
 //BA.debugLineNum = 55;BA.debugLine="Tree.SetData(data)";
_tree._setdata /*b4j.example.wixelement*/ (_data);
 //BA.debugLineNum = 56;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtree)(this);
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtree  _setgroupby(String _g) throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Sub SetGroupBy(g As String) As WixTree";
 //BA.debugLineNum = 24;BA.debugLine="scheme.Put(\"$group\", g)";
_scheme.Put((Object)("$group"),(Object)(_g));
 //BA.debugLineNum = 25;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtree)(this);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtree  _setheight(int _h) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub SetHeight(h As Int) As WixTree";
 //BA.debugLineNum = 79;BA.debugLine="Tree.SetHeight(h)";
_tree._setheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 80;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtree)(this);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtree  _setmultiselect(boolean _b) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Sub SetMultiSelect(b As Boolean) As WixTree";
 //BA.debugLineNum = 42;BA.debugLine="Tree.SetAttr(\"select\", \"multiselect\")";
_tree._setattr /*b4j.example.wixelement*/ ("select",(Object)("multiselect"));
 //BA.debugLineNum = 43;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtree)(this);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtree  _setselect(boolean _b) throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Sub SetSelect(b As Boolean) As WixTree";
 //BA.debugLineNum = 36;BA.debugLine="Tree.SetSelect(b)";
_tree._setselect /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 37;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtree)(this);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtree  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 61;BA.debugLine="Tree.SetStyle(prop,val)";
_tree._setstyle /*b4j.example.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtree)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtree  _settemplate(Object _t) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub SetTemplate(t As Object) As WixTree";
 //BA.debugLineNum = 67;BA.debugLine="Tree.SetTemplate(t)";
_tree._settemplate /*b4j.example.wixelement*/ (_t);
 //BA.debugLineNum = 68;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtree)(this);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtree  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Sub SetTooltip(tt As String) As WixTree";
 //BA.debugLineNum = 73;BA.debugLine="Tree.SetTooltip(tt)";
_tree._settooltip /*b4j.example.wixelement*/ (_tt);
 //BA.debugLineNum = 74;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtree)(this);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtree  _settypelinetree() throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Sub SetTypeLineTree As WixTree";
 //BA.debugLineNum = 49;BA.debugLine="Tree.SetType(\"lineTree\")";
_tree._settype /*b4j.example.wixelement*/ ("lineTree");
 //BA.debugLineNum = 50;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtree)(this);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtree  _setwidth(int _h) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub SetWidth(h As Int) As WixTree";
 //BA.debugLineNum = 85;BA.debugLine="Tree.SetWidth(h)";
_tree._setwidth /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 86;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtree)(this);
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
