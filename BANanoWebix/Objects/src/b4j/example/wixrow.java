package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixrow extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixrow", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixrow.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.wixelement _row = null;
public String _id = "";
public b4j.example.main _main = null;
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
public b4j.example.pgdataview _pgdataview = null;
public b4j.example.pglist _pglist = null;
public b4j.example.pgunitlist _pgunitlist = null;
public b4j.example.pgpropertysheet _pgpropertysheet = null;
public b4j.example.pgtree _pgtree = null;
public b4j.example.pgtreetable _pgtreetable = null;
public b4j.example.wixrow  _addcolumn(b4j.example.wixcolumn _wxel) throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Sub AddColumn(wxEL As WixColumn) As WixRow";
 //BA.debugLineNum = 64;BA.debugLine="Row.AddColumns(wxEL.Item)";
_row._addcolumns /*b4j.example.wixelement*/ (_wxel._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 65;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrow)(this);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrow  _addcolumns(anywheresoftware.b4a.objects.collections.Map _i) throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub AddColumns(i As Map) As WixRow";
 //BA.debugLineNum = 22;BA.debugLine="Row.AddColumns(i)";
_row._addcolumns /*b4j.example.wixelement*/ (_i);
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrow)(this);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrow  _addcolumnsitem(anywheresoftware.b4a.objects.collections.Map _i) throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Sub AddColumnsItem(i As Map) As WixRow";
 //BA.debugLineNum = 28;BA.debugLine="AddColumns(i)";
_addcolumns(_i);
 //BA.debugLineNum = 29;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrow)(this);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrow  _addcolumnsspacer(int _width) throws Exception{
anywheresoftware.b4a.objects.collections.Map _itm = null;
 //BA.debugLineNum = 33;BA.debugLine="Sub AddColumnsSpacer(width As Int) As WixRow  'ign";
 //BA.debugLineNum = 34;BA.debugLine="Dim itm As Map = CreateMap()";
_itm = new anywheresoftware.b4a.objects.collections.Map();
_itm = __c.createMap(new Object[] {});
 //BA.debugLineNum = 35;BA.debugLine="If width > 0 Then itm.Put(\"width\", width)";
if (_width>0) { 
_itm.Put((Object)("width"),(Object)(_width));};
 //BA.debugLineNum = 36;BA.debugLine="Row.AddColumns(itm)";
_row._addcolumns /*b4j.example.wixelement*/ (_itm);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrow  _additem(anywheresoftware.b4a.objects.collections.Map _wxel) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub AddItem(wxEL As Map) As WixRow";
 //BA.debugLineNum = 58;BA.debugLine="Row.AddRows(wxEL)";
_row._addrows /*b4j.example.wixelement*/ (_wxel);
 //BA.debugLineNum = 59;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrow)(this);
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrow  _addrows(anywheresoftware.b4a.objects.collections.Map _i) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Sub AddRows(i As Map) As WixRow";
 //BA.debugLineNum = 41;BA.debugLine="Row.AddRows(i)";
_row._addrows /*b4j.example.wixelement*/ (_i);
 //BA.debugLineNum = 42;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrow)(this);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public String  _addtoform(b4j.example.wixform _frm) throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 70;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return "";
}
public String  _addtopage(b4j.example.wixpage _p) throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Sub AddToPage(p As WixPage)";
 //BA.debugLineNum = 75;BA.debugLine="p.Page.AddRows(Item)";
_p._page /*b4j.example.wixelement*/ ._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Row As WixElement";
_row = new b4j.example.wixelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixrow  _initialize(anywheresoftware.b4a.BA _ba,String _rid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize(rID As String) As WixRow";
 //BA.debugLineNum = 9;BA.debugLine="ID = rID.tolowercase";
_id = _rid.toLowerCase();
 //BA.debugLineNum = 10;BA.debugLine="Row.Initialize(ID)";
_row._initialize /*b4j.example.wixelement*/ (ba,_id);
 //BA.debugLineNum = 11;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrow)(this);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 53;BA.debugLine="Return Row.item";
if (true) return _row._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrow  _setheight(int _h) throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Sub SetHeight(h As Int) As WixRow";
 //BA.debugLineNum = 80;BA.debugLine="Row.SetHeight(h)";
_row._setheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 81;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrow)(this);
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrow  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub SetTooltip(tt As String) As WixRow";
 //BA.debugLineNum = 47;BA.debugLine="Row.SetTooltip(tt)";
_row._settooltip /*b4j.example.wixelement*/ (_tt);
 //BA.debugLineNum = 48;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrow)(this);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrow  _settypewide() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub SetTypeWide As WixRow";
 //BA.debugLineNum = 16;BA.debugLine="Row.SetAttr(\"type\", \"wide\")";
_row._setattr /*b4j.example.wixelement*/ ("type",(Object)("wide"));
 //BA.debugLineNum = 17;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrow)(this);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrow  _setwidth(int _w) throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Sub SetWidth(w As Int) As WixRow";
 //BA.debugLineNum = 86;BA.debugLine="Row.setwidth(w)";
_row._setwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 87;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrow)(this);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
