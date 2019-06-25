package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixtreetable extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixtreetable", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixtreetable.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _treetable = null;
public anywheresoftware.b4a.objects.collections.List _columns = null;
public String _dt_select_row = "";
public String _dt_select_cell = "";
public String _dt_select_column = "";
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
public String  _addcolumn(b4j.example.wixdatacolumn _c) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub AddColumn(c As WixDataColumn)";
 //BA.debugLineNum = 35;BA.debugLine="Columns.Add(c.Item)";
_columns.Add((Object)(_c._item /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public TreeTable As WixElement";
_treetable = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Public Columns As List";
_columns = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 7;BA.debugLine="Public DT_SELECT_ROW As String = \"row\"";
_dt_select_row = "row";
 //BA.debugLineNum = 8;BA.debugLine="Public DT_SELECT_CELL As String = \"cell\"";
_dt_select_cell = "cell";
 //BA.debugLineNum = 9;BA.debugLine="Public DT_SELECT_COLUMN As String = \"column\"";
_dt_select_column = "column";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixtreetable  _initialize(anywheresoftware.b4a.BA _ba,String _eid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize(eID As String) As WixTreeTab";
 //BA.debugLineNum = 14;BA.debugLine="ID = eID.tolowercase";
_id = _eid.toLowerCase();
 //BA.debugLineNum = 15;BA.debugLine="TreeTable.Initialize(ID).SetView(\"treetable\")";
_treetable._initialize /*b4j.example.wixelement*/ (ba,_id)._setview /*b4j.example.wixelement*/ ("treetable");
 //BA.debugLineNum = 16;BA.debugLine="Columns.Initialize";
_columns.Initialize();
 //BA.debugLineNum = 17;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtreetable)(this);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 40;BA.debugLine="TreeTable.SetAttr(\"columns\", Columns)";
_treetable._setattr /*b4j.example.wixelement*/ ("columns",(Object)(_columns.getObject()));
 //BA.debugLineNum = 41;BA.debugLine="Return TreeTable.item";
if (true) return _treetable._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtreetable  _setautoheight(boolean _b) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Sub SetAutoHeight(b As Boolean) As WixTreeTable";
 //BA.debugLineNum = 89;BA.debugLine="TreeTable.SetAttr(\"autoheight\", b)";
_treetable._setattr /*b4j.example.wixelement*/ ("autoheight",(Object)(_b));
 //BA.debugLineNum = 90;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtreetable)(this);
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtreetable  _setautowidth(boolean _b) throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Sub SetAutoWidth(b As Boolean) As WixTreeTable";
 //BA.debugLineNum = 95;BA.debugLine="TreeTable.SetAttr(\"autowidth\", b)";
_treetable._setattr /*b4j.example.wixelement*/ ("autowidth",(Object)(_b));
 //BA.debugLineNum = 96;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtreetable)(this);
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtreetable  _setborderless(boolean _b) throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Sub SetBorderLess(b As Boolean) As WixTreeTable";
 //BA.debugLineNum = 46;BA.debugLine="TreeTable.SetBorderLess(b)";
_treetable._setborderless /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 47;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtreetable)(this);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtreetable  _setdata(anywheresoftware.b4a.objects.collections.List _data) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub SetData(data As List) As WixTreeTable";
 //BA.debugLineNum = 52;BA.debugLine="TreeTable.SetData(data)";
_treetable._setdata /*b4j.example.wixelement*/ (_data);
 //BA.debugLineNum = 53;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtreetable)(this);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtreetable  _seteditable(boolean _b) throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub SetEditable(b As Boolean) As WixTreeTable";
 //BA.debugLineNum = 22;BA.debugLine="TreeTable.SetAttr(\"editable\", b)";
_treetable._setattr /*b4j.example.wixelement*/ ("editable",(Object)(_b));
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtreetable)(this);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtreetable  _setheight(int _h) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Sub SetHeight(h As Int) As WixTreeTable";
 //BA.debugLineNum = 76;BA.debugLine="TreeTable.SetHeight(h)";
_treetable._setheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 77;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtreetable)(this);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtreetable  _setselect(Object _s) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Sub SetSelect(s As Object) As WixTreeTable";
 //BA.debugLineNum = 29;BA.debugLine="TreeTable.SetAttr(\"select\", s)";
_treetable._setattr /*b4j.example.wixelement*/ ("select",_s);
 //BA.debugLineNum = 30;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtreetable)(this);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtreetable  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 58;BA.debugLine="TreeTable.SetStyle(prop,val)";
_treetable._setstyle /*b4j.example.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 59;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtreetable)(this);
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtreetable  _settemplate(Object _t) throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Sub SetTemplate(t As Object) As WixTreeTable";
 //BA.debugLineNum = 64;BA.debugLine="TreeTable.SetTemplate(t)";
_treetable._settemplate /*b4j.example.wixelement*/ (_t);
 //BA.debugLineNum = 65;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtreetable)(this);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtreetable  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Sub SetTooltip(tt As String) As WixTreeTable";
 //BA.debugLineNum = 70;BA.debugLine="TreeTable.SetTooltip(tt)";
_treetable._settooltip /*b4j.example.wixelement*/ (_tt);
 //BA.debugLineNum = 71;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtreetable)(this);
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtreetable  _setwidth(int _h) throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Sub SetWidth(h As Int) As WixTreeTable";
 //BA.debugLineNum = 82;BA.debugLine="TreeTable.SetWidth(h)";
_treetable._setwidth /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 83;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtreetable)(this);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
