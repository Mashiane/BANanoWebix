package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixlist extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixlist", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixlist.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.wixelement _list = null;
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
public String  _addtocolumn(b4j.example.wixcolumn _c) throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Sub AddToColumn(c As WixColumn)";
 //BA.debugLineNum = 23;BA.debugLine="c.AddItem(Item)";
_c._additem /*String*/ (_item());
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.example.wixform _frm) throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 28;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public List As WixElement";
_list = new b4j.example.wixelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixlist  _initialize(anywheresoftware.b4a.BA _ba,String _lid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize(lID As String) As WixList";
 //BA.debugLineNum = 9;BA.debugLine="ID = lID.tolowercase";
_id = _lid.toLowerCase();
 //BA.debugLineNum = 10;BA.debugLine="List.Initialize(ID).SetView(\"list\")";
_list._initialize /*b4j.example.wixelement*/ (ba,_id)._setview /*b4j.example.wixelement*/ ("list");
 //BA.debugLineNum = 11;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlist)(this);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 70;BA.debugLine="Return List.item";
if (true) return _list._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlist  _setborderless(boolean _b) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Sub SetBorderLess(b As Boolean) As WixList";
 //BA.debugLineNum = 39;BA.debugLine="List.SetAttr(\"borderless\", b)";
_list._setattr /*b4j.example.wixelement*/ ("borderless",(Object)(_b));
 //BA.debugLineNum = 40;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlist)(this);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlist  _setdata(anywheresoftware.b4a.objects.collections.List _t) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Sub SetData(t As List) As WixList";
 //BA.debugLineNum = 93;BA.debugLine="List.SetData(t)";
_list._setdata /*b4j.example.wixelement*/ (_t);
 //BA.debugLineNum = 94;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlist)(this);
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlist  _setheight(String _t) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub SetHeight(t As String) As WixList";
 //BA.debugLineNum = 81;BA.debugLine="List.SetHeight(t)";
_list._setheight /*b4j.example.wixelement*/ ((int)(Double.parseDouble(_t)));
 //BA.debugLineNum = 82;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlist)(this);
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlist  _setmultiselect(boolean _b) throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Sub SetMultiSelect(b As Boolean) As WixList";
 //BA.debugLineNum = 51;BA.debugLine="List.SetAttr(\"multiselect\", b)";
_list._setattr /*b4j.example.wixelement*/ ("multiselect",(Object)(_b));
 //BA.debugLineNum = 52;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlist)(this);
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlist  _setpager(String _p) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Sub SetPager(p As String) As WixList";
 //BA.debugLineNum = 63;BA.debugLine="p = p.tolowercase";
_p = _p.toLowerCase();
 //BA.debugLineNum = 64;BA.debugLine="List.SetAttr(\"pager\", p)";
_list._setattr /*b4j.example.wixelement*/ ("pager",(Object)(_p));
 //BA.debugLineNum = 65;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlist)(this);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlist  _setscroll(boolean _b) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Sub SetScroll(b As Boolean) As WixList";
 //BA.debugLineNum = 57;BA.debugLine="List.SetAttr(\"scroll\", b)";
_list._setattr /*b4j.example.wixelement*/ ("scroll",(Object)(_b));
 //BA.debugLineNum = 58;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlist)(this);
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlist  _setselect(boolean _b) throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub SetSelect(b As Boolean) As WixList";
 //BA.debugLineNum = 45;BA.debugLine="List.SetAttr(\"select\", b)";
_list._setattr /*b4j.example.wixelement*/ ("select",(Object)(_b));
 //BA.debugLineNum = 46;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlist)(this);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlist  _settemplate(String _t) throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Sub SetTemplate(t As String) As WixList";
 //BA.debugLineNum = 75;BA.debugLine="List.SetTemplate(t)";
_list._settemplate /*b4j.example.wixelement*/ ((Object)(_t));
 //BA.debugLineNum = 76;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlist)(this);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlist  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Sub SetTooltip(tt As String) As WixList";
 //BA.debugLineNum = 17;BA.debugLine="List.SetTooltip(tt)";
_list._settooltip /*b4j.example.wixelement*/ (_tt);
 //BA.debugLineNum = 18;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlist)(this);
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlist  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Sub SetValue(v As String) As WixList";
 //BA.debugLineNum = 33;BA.debugLine="List.SetValue(v)";
_list._setvalue /*b4j.example.wixelement*/ (_v);
 //BA.debugLineNum = 34;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlist)(this);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlist  _setwidth(String _t) throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Sub SetWidth(t As String) As WixList";
 //BA.debugLineNum = 87;BA.debugLine="List.SetWidth(t)";
_list._setwidth /*b4j.example.wixelement*/ ((int)(Double.parseDouble(_t)));
 //BA.debugLineNum = 88;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlist)(this);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
