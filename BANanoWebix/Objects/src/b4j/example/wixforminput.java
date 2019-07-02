package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixforminput extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixforminput", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixforminput.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _forminput = null;
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
 //BA.debugLineNum = 4;BA.debugLine="Public FormInput As WixElement";
_forminput = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixforminput  _initialize(anywheresoftware.b4a.BA _ba,String _iid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize(iID As String) As WixFormInp";
 //BA.debugLineNum = 9;BA.debugLine="ID = iID.tolowercase";
_id = _iid.toLowerCase();
 //BA.debugLineNum = 10;BA.debugLine="FormInput.Initialize(iID).SetView(\"forminput\")";
_forminput._initialize /*b4j.example.wixelement*/ (ba,_iid)._setview /*b4j.example.wixelement*/ ("forminput");
 //BA.debugLineNum = 11;BA.debugLine="Return Me";
if (true) return (b4j.example.wixforminput)(this);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 40;BA.debugLine="Return FormInput.item";
if (true) return _forminput._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixforminput  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Sub SetAlignCenter(r As String) As WixFormInput 'i";
 //BA.debugLineNum = 87;BA.debugLine="FormInput.setAligncenter(\"\")";
_forminput._setaligncenter /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 88;BA.debugLine="Return Me";
if (true) return (b4j.example.wixforminput)(this);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixforminput  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Sub SetAlignLeft(r As String) As WixFormInput 'ign";
 //BA.debugLineNum = 93;BA.debugLine="FormInput.SetAlignleft(\"\")";
_forminput._setalignleft /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 94;BA.debugLine="Return Me";
if (true) return (b4j.example.wixforminput)(this);
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixforminput  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub SetAlignRight(r As String) As WixFormInput 'ig";
 //BA.debugLineNum = 81;BA.debugLine="FormInput.setAlignright(\"\")";
_forminput._setalignright /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 82;BA.debugLine="Return Me";
if (true) return (b4j.example.wixforminput)(this);
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixforminput  _setbody(Object _b) throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Sub SetBody(b As Object) As WixFormInput";
 //BA.debugLineNum = 21;BA.debugLine="FormInput.SetBody(b)";
_forminput._setbody /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 22;BA.debugLine="Return Me";
if (true) return (b4j.example.wixforminput)(this);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixforminput  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Sub SetLabel(l As String) As WixFormInput";
 //BA.debugLineNum = 51;BA.debugLine="FormInput.Label.Text = l";
_forminput._label /*b4j.example.wixelement._labeltype*/ .Text /*String*/  = _l;
 //BA.debugLineNum = 52;BA.debugLine="Return Me";
if (true) return (b4j.example.wixforminput)(this);
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixforminput  _setlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Sub SetLabelAlign(a As String) As WixFormInput";
 //BA.debugLineNum = 63;BA.debugLine="FormInput.Label.Align = a";
_forminput._label /*b4j.example.wixelement._labeltype*/ .Align /*String*/  = _a;
 //BA.debugLineNum = 64;BA.debugLine="Return Me";
if (true) return (b4j.example.wixforminput)(this);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixforminput  _setlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Sub SetLabelPosition(p As String) As WixFormInput";
 //BA.debugLineNum = 69;BA.debugLine="FormInput.Label.Position = p";
_forminput._label /*b4j.example.wixelement._labeltype*/ .Position /*String*/  = _p;
 //BA.debugLineNum = 70;BA.debugLine="Return Me";
if (true) return (b4j.example.wixforminput)(this);
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixforminput  _setlabelwidth(int _w) throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Sub SetLabelWidth(w As Int) As WixFormInput";
 //BA.debugLineNum = 75;BA.debugLine="FormInput.Label.Width = w";
_forminput._label /*b4j.example.wixelement._labeltype*/ .Width /*int*/  = _w;
 //BA.debugLineNum = 76;BA.debugLine="Return Me";
if (true) return (b4j.example.wixforminput)(this);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixforminput  _setrequired(boolean _b) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Sub SetRequired(b As Boolean) As WixFormInput";
 //BA.debugLineNum = 57;BA.debugLine="FormInput.SetRequired(b)";
_forminput._setrequired /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 58;BA.debugLine="Return Me";
if (true) return (b4j.example.wixforminput)(this);
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixforminput  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 33;BA.debugLine="FormInput.SetStyle(prop,val)";
_forminput._setstyle /*b4j.example.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 34;BA.debugLine="Return Me";
if (true) return (b4j.example.wixforminput)(this);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixforminput  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Sub SetTooltip(tt As String) As WixFormInput";
 //BA.debugLineNum = 27;BA.debugLine="FormInput.SetTooltip(tt)";
_forminput._settooltip /*b4j.example.wixelement*/ (_tt);
 //BA.debugLineNum = 28;BA.debugLine="Return Me";
if (true) return (b4j.example.wixforminput)(this);
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixforminput  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub SetValue(v As String) As WixFormInput";
 //BA.debugLineNum = 45;BA.debugLine="FormInput.Value = v";
_forminput._value /*Object*/  = (Object)(_v);
 //BA.debugLineNum = 46;BA.debugLine="Return Me";
if (true) return (b4j.example.wixforminput)(this);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
