package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixlabel extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixlabel", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixlabel.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _label = null;
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
 //BA.debugLineNum = 40;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 41;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Label As WixElement";
_label = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixlabel  _initialize(anywheresoftware.b4a.BA _ba,String _iid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize(iID As String) As WixLabel";
 //BA.debugLineNum = 9;BA.debugLine="ID = iID.tolowercase";
_id = _iid.toLowerCase();
 //BA.debugLineNum = 10;BA.debugLine="Label.Initialize(iID).SetView(\"label\")";
_label._initialize /*b4j.example.wixelement*/ (ba,_iid)._setview /*b4j.example.wixelement*/ ("label");
 //BA.debugLineNum = 11;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlabel)(this);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 16;BA.debugLine="Return Label.item";
if (true) return _label._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlabel  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub SetAlignCenter(r As String) As WixLabel 'ignor";
 //BA.debugLineNum = 53;BA.debugLine="Label.setAligncenter(\"\")";
_label._setaligncenter /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlabel)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlabel  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub SetAlignLeft(r As String) As WixLabel 'ignore";
 //BA.debugLineNum = 59;BA.debugLine="Label.SetAlignleft(\"\")";
_label._setalignleft /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 60;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlabel)(this);
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlabel  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub SetAlignRight(r As String) As WixLabel 'ignore";
 //BA.debugLineNum = 47;BA.debugLine="Label.setAlignright(\"\")";
_label._setalignright /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 48;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlabel)(this);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlabel  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub SetLabel(l As String) As WixLabel";
 //BA.debugLineNum = 34;BA.debugLine="Label.Label.Text = l";
_label._label /*b4j.example.wixelement._labeltype*/ .Text /*String*/  = _l;
 //BA.debugLineNum = 35;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlabel)(this);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlabel  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 28;BA.debugLine="Label.SetStyle(prop,val)";
_label._setstyle /*b4j.example.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 29;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlabel)(this);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlabel  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub SetTooltip(tt As String) As WixLabel";
 //BA.debugLineNum = 22;BA.debugLine="Label.SetTooltip(tt)";
_label._settooltip /*b4j.example.wixelement*/ (_tt);
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlabel)(this);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
