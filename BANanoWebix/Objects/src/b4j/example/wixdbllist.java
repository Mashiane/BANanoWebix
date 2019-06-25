package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixdbllist extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixdbllist", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixdbllist.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _dbllist = null;
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
public String  _addtoform(b4j.example.wixform _frm) throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 16;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public DBLList As WixElement";
_dbllist = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixdbllist  _initialize(anywheresoftware.b4a.BA _ba,String _iid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize(iID As String) As WixDBLList";
 //BA.debugLineNum = 9;BA.debugLine="ID = iID.tolowercase";
_id = _iid.toLowerCase();
 //BA.debugLineNum = 10;BA.debugLine="DBLList.Initialize(iID).SetView(\"dbllist\")";
_dbllist._initialize /*b4j.example.wixelement*/ (ba,_iid)._setview /*b4j.example.wixelement*/ ("dbllist");
 //BA.debugLineNum = 11;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdbllist)(this);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 29;BA.debugLine="Return DBLList.item";
if (true) return _dbllist._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdbllist  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub SetAlignCenter(r As String) As WixDBLList 'ign";
 //BA.debugLineNum = 94;BA.debugLine="DBLList.setAligncenter(\"\")";
_dbllist._setaligncenter /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 95;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdbllist)(this);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdbllist  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Sub SetAlignLeft(r As String) As WixDBLList 'ignor";
 //BA.debugLineNum = 100;BA.debugLine="DBLList.SetAlignleft(\"\")";
_dbllist._setalignleft /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 101;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdbllist)(this);
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdbllist  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Sub SetAlignRight(r As String) As WixDBLList 'igno";
 //BA.debugLineNum = 88;BA.debugLine="DBLList.setAlignright(\"\")";
_dbllist._setalignright /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 89;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdbllist)(this);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdbllist  _setdata(anywheresoftware.b4a.objects.collections.List _d) throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Sub SetData(d As List) As WixDBLList";
 //BA.debugLineNum = 46;BA.debugLine="DBLList.SetData(d)";
_dbllist._setdata /*b4j.example.wixelement*/ (_d);
 //BA.debugLineNum = 47;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdbllist)(this);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdbllist  _setheight(int _h) throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Sub SetHeight(h As Int) As WixDBLList";
 //BA.debugLineNum = 40;BA.debugLine="DBLList.SetHeight(h)";
_dbllist._setheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 41;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdbllist)(this);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdbllist  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub SetLabel(l As String) As WixDBLList";
 //BA.debugLineNum = 58;BA.debugLine="DBLList.Label.Text = l";
_dbllist._label /*b4j.example.wixelement._labeltype*/ .Text /*String*/  = _l;
 //BA.debugLineNum = 59;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdbllist)(this);
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdbllist  _setlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Sub SetLabelAlign(a As String) As WixDBLList";
 //BA.debugLineNum = 70;BA.debugLine="DBLList.Label.Align = a";
_dbllist._label /*b4j.example.wixelement._labeltype*/ .Align /*String*/  = _a;
 //BA.debugLineNum = 71;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdbllist)(this);
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdbllist  _setlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Sub SetLabelPosition(p As String) As WixDBLList";
 //BA.debugLineNum = 76;BA.debugLine="DBLList.Label.Position = p";
_dbllist._label /*b4j.example.wixelement._labeltype*/ .Position /*String*/  = _p;
 //BA.debugLineNum = 77;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdbllist)(this);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdbllist  _setlabelwidth(int _w) throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Sub SetLabelWidth(w As Int) As WixDBLList";
 //BA.debugLineNum = 82;BA.debugLine="DBLList.Label.Width = w";
_dbllist._label /*b4j.example.wixelement._labeltype*/ .Width /*int*/  = _w;
 //BA.debugLineNum = 83;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdbllist)(this);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdbllist  _setrequired(boolean _b) throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Sub SetRequired(b As Boolean) As WixDBLList";
 //BA.debugLineNum = 64;BA.debugLine="DBLList.SetRequired(b)";
_dbllist._setrequired /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 65;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdbllist)(this);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdbllist  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 34;BA.debugLine="DBLList.SetStyle(prop,val)";
_dbllist._setstyle /*b4j.example.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 35;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdbllist)(this);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdbllist  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub SetTooltip(tt As String) As WixDBLList";
 //BA.debugLineNum = 22;BA.debugLine="DBLList.SetTooltip(tt)";
_dbllist._settooltip /*b4j.example.wixelement*/ (_tt);
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdbllist)(this);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdbllist  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub SetValue(v As String) As WixDBLList";
 //BA.debugLineNum = 52;BA.debugLine="DBLList.Value = v";
_dbllist._value /*Object*/  = (Object)(_v);
 //BA.debugLineNum = 53;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdbllist)(this);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
