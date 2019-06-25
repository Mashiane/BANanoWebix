package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixdataview extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixdataview", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixdataview.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _dataview = null;
public com.ab.banano.BANanoObject _onclick = null;
public com.ab.banano.BANanoObject _ondblclick = null;
public anywheresoftware.b4a.objects.collections.Map _typeof = null;
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
public String  _addtoform(b4j.example.wixform _frm) throws Exception{
 //BA.debugLineNum = 134;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 135;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public DataView As WixElement";
_dataview = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private onClick As BANanoObject";
_onclick = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 6;BA.debugLine="Private onDblClick As BANanoObject";
_ondblclick = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 7;BA.debugLine="Private typeOf As Map";
_typeof = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixdataview  _initialize(anywheresoftware.b4a.BA _ba,String _tid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(tID As String) As WixDataVie";
 //BA.debugLineNum = 12;BA.debugLine="ID = tID.ToLowerCase";
_id = _tid.toLowerCase();
 //BA.debugLineNum = 13;BA.debugLine="DataView.Initialize(ID).SetView(\"dataview\")";
_dataview._initialize /*b4j.example.wixelement*/ (ba,_id)._setview /*b4j.example.wixelement*/ ("dataview");
 //BA.debugLineNum = 14;BA.debugLine="onClick = Null";
_onclick = (com.ab.banano.BANanoObject)(__c.Null);
 //BA.debugLineNum = 15;BA.debugLine="onDblClick = Null";
_ondblclick = (com.ab.banano.BANanoObject)(__c.Null);
 //BA.debugLineNum = 16;BA.debugLine="typeOf = CreateMap()";
_typeof = __c.createMap(new Object[] {});
 //BA.debugLineNum = 17;BA.debugLine="SetMultiSelect(False)";
_setmultiselect(__c.False);
 //BA.debugLineNum = 18;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdataview)(this);
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 111;BA.debugLine="DataView.SetAttr(\"type\", typeOf)";
_dataview._setattr /*b4j.example.wixelement*/ ("type",(Object)(_typeof.getObject()));
 //BA.debugLineNum = 112;BA.debugLine="If onClick <> Null Then";
if (_onclick!= null) { 
 //BA.debugLineNum = 113;BA.debugLine="DataView.SetAttr(\"click\", onClick)";
_dataview._setattr /*b4j.example.wixelement*/ ("click",(Object)(_onclick));
 };
 //BA.debugLineNum = 115;BA.debugLine="If onDblClick <> Null Then";
if (_ondblclick!= null) { 
 //BA.debugLineNum = 116;BA.debugLine="DataView.SetAttr(\"dblclick\", onDblClick)";
_dataview._setattr /*b4j.example.wixelement*/ ("dblclick",(Object)(_ondblclick));
 };
 //BA.debugLineNum = 118;BA.debugLine="Return DataView.item";
if (true) return _dataview._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdataview  _setborderless(boolean _b) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub SetBorderLess(b As Boolean) As WixDataView";
 //BA.debugLineNum = 92;BA.debugLine="DataView.SetAttr(\"borderless\", b)";
_dataview._setattr /*b4j.example.wixelement*/ ("borderless",(Object)(_b));
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdataview)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdataview  _setclick(com.ab.banano.BANanoObject _e) throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Sub SetClick(e As BANanoObject) As WixDataView";
 //BA.debugLineNum = 49;BA.debugLine="onClick = e";
_onclick = _e;
 //BA.debugLineNum = 50;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdataview)(this);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdataview  _setdata(anywheresoftware.b4a.objects.collections.List _data) throws Exception{
 //BA.debugLineNum = 139;BA.debugLine="Sub SetData(data As List) As WixDataView";
 //BA.debugLineNum = 140;BA.debugLine="DataView.SetData(data)";
_dataview._setdata /*b4j.example.wixelement*/ (_data);
 //BA.debugLineNum = 141;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdataview)(this);
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdataview  _setdblclick(com.ab.banano.BANanoObject _e) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Sub SetDblClick(e As BANanoObject) As WixDataView";
 //BA.debugLineNum = 55;BA.debugLine="onDblClick = e";
_ondblclick = _e;
 //BA.debugLineNum = 56;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdataview)(this);
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdataview  _setheight(int _h) throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Sub SetHeight(h As Int) As WixDataView";
 //BA.debugLineNum = 123;BA.debugLine="DataView.SetHeight(h)";
_dataview._setheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 124;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdataview)(this);
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdataview  _setitemheight(int _h) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Sub SetItemHeight(h As Int) As WixDataView";
 //BA.debugLineNum = 29;BA.debugLine="typeOf.Put(\"height\", h)";
_typeof.Put((Object)("height"),(Object)(_h));
 //BA.debugLineNum = 30;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdataview)(this);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdataview  _setitemwidth(int _h) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub SetItemWidth(h As Int) As WixDataView";
 //BA.debugLineNum = 35;BA.debugLine="typeOf.Put(\"width\", h)";
_typeof.Put((Object)("width"),(Object)(_h));
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdataview)(this);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdataview  _setmultiselect(boolean _m) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub SetMultiSelect(m As Boolean) As WixDataView  '";
 //BA.debugLineNum = 68;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdataview)(this);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdataview  _setpager(String _p) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Sub SetPager(p As String) As WixDataView";
 //BA.debugLineNum = 42;BA.debugLine="p = p.tolowercase";
_p = _p.toLowerCase();
 //BA.debugLineNum = 43;BA.debugLine="DataView.SetAttr(\"pager\", p)";
_dataview._setattr /*b4j.example.wixelement*/ ("pager",(Object)(_p));
 //BA.debugLineNum = 44;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdataview)(this);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdataview  _setrank(Object _r) throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Sub SetRank(r As Object) As WixDataView";
 //BA.debugLineNum = 23;BA.debugLine="DataView.SetAttr(\"rank\", r)";
_dataview._setattr /*b4j.example.wixelement*/ ("rank",_r);
 //BA.debugLineNum = 24;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdataview)(this);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdataview  _setselect(boolean _b) throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Sub SetSelect(b As Boolean) As WixDataView   'igno";
 //BA.debugLineNum = 74;BA.debugLine="DataView.SetAttr(\"select\", b)";
_dataview._setattr /*b4j.example.wixelement*/ ("select",(Object)(_b));
 //BA.debugLineNum = 75;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdataview)(this);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdataview  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 99;BA.debugLine="DataView.SetStyle(prop,val)";
_dataview._setstyle /*b4j.example.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 100;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdataview)(this);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdataview  _settemplate(String _t) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub SetTemplate(t As String) As WixDataView";
 //BA.debugLineNum = 61;BA.debugLine="DataView.SetTemplate(t)";
_dataview._settemplate /*b4j.example.wixelement*/ ((Object)(_t));
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdataview)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdataview  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Sub SetTooltip(tt As String) As WixDataView";
 //BA.debugLineNum = 105;BA.debugLine="DataView.SetTooltip(tt)";
_dataview._settooltip /*b4j.example.wixelement*/ (_tt);
 //BA.debugLineNum = 106;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdataview)(this);
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdataview  _setwidth(int _h) throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Sub SetWidth(h As Int) As WixDataView";
 //BA.debugLineNum = 129;BA.debugLine="DataView.SetWidth(h)";
_dataview._setwidth /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 130;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdataview)(this);
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdataview  _setxcount(int _x) throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Sub SetXCount(x As Int) As WixDataView";
 //BA.debugLineNum = 86;BA.debugLine="DataView.SetAttr(\"xCount\", x)";
_dataview._setattr /*b4j.example.wixelement*/ ("xCount",(Object)(_x));
 //BA.debugLineNum = 87;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdataview)(this);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdataview  _setycount(int _x) throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Sub SetYCount(x As Int) As WixDataView";
 //BA.debugLineNum = 80;BA.debugLine="DataView.SetAttr(\"yCount\", x)";
_dataview._setattr /*b4j.example.wixelement*/ ("yCount",(Object)(_x));
 //BA.debugLineNum = 81;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdataview)(this);
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
