package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixtextarea extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixtextarea", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixtextarea.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixtextbox _textarea = null;
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
 //BA.debugLineNum = 34;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 35;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public TextArea As WixTextBox";
_textarea = new b4j.example.wixtextbox();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixtextarea  _initialize(anywheresoftware.b4a.BA _ba,String _tid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize(tID As String) As WixTextAre";
 //BA.debugLineNum = 9;BA.debugLine="TextArea.Initialize(tID)";
_textarea._initialize /*b4j.example.wixtextbox*/ (ba,_tid);
 //BA.debugLineNum = 10;BA.debugLine="TextArea.SetView(\"textarea\")";
_textarea._setview /*b4j.example.wixtextbox*/ ("textarea");
 //BA.debugLineNum = 11;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 40;BA.debugLine="Return TextArea.Item";
if (true) return _textarea._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _setalign(String _a) throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Sub SetAlign(a As String) As WixTextArea";
 //BA.debugLineNum = 75;BA.debugLine="TextArea.SetAlign(a)";
_textarea._setalign /*b4j.example.wixtextbox*/ (_a);
 //BA.debugLineNum = 76;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Sub SetAlignCenter(r As String) As WixTextArea 'ig";
 //BA.debugLineNum = 107;BA.debugLine="TextArea.setAligncenter(\"\")";
_textarea._setaligncenter /*b4j.example.wixtextbox*/ ("");
 //BA.debugLineNum = 108;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Sub SetAlignLeft(r As String) As WixTextArea 'igno";
 //BA.debugLineNum = 113;BA.debugLine="TextArea.SetAlignleft(\"\")";
_textarea._setalignleft /*b4j.example.wixtextbox*/ ("");
 //BA.debugLineNum = 114;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Sub SetAlignRight(r As String) As WixTextArea 'ign";
 //BA.debugLineNum = 101;BA.debugLine="TextArea.setAlignright(\"\")";
_textarea._setalignright /*b4j.example.wixtextbox*/ ("");
 //BA.debugLineNum = 102;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _setheight(int _h) throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Sub SetHeight(h As Int) As WixTextArea";
 //BA.debugLineNum = 69;BA.debugLine="TextArea.SetHeight(h)";
_textarea._setheight /*b4j.example.wixtextbox*/ (_h);
 //BA.debugLineNum = 70;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _setlabel(String _lbl) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Sub SetLabel(lbl As String) As WixTextArea";
 //BA.debugLineNum = 57;BA.debugLine="TextArea.SetLabel(lbl)";
_textarea._setlabel /*b4j.example.wixtextbox*/ (_lbl);
 //BA.debugLineNum = 58;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _setlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Sub SetLabelAlign(a As String) As WixTextArea";
 //BA.debugLineNum = 82;BA.debugLine="TextArea.SetLabelAlign(a)";
_textarea._setlabelalign /*b4j.example.wixtextbox*/ (_a);
 //BA.debugLineNum = 83;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _setlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Sub SetLabelPosition(p As String) As WixTextArea";
 //BA.debugLineNum = 88;BA.debugLine="TextArea.SetLabelPosition(p)";
_textarea._setlabelposition /*b4j.example.wixtextbox*/ (_p);
 //BA.debugLineNum = 89;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _setlabelwidth(int _w) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub SetLabelWidth(w As Int) As WixTextArea";
 //BA.debugLineNum = 94;BA.debugLine="TextArea.SetLabelWidth(w)";
_textarea._setlabelwidth /*b4j.example.wixtextbox*/ (_w);
 //BA.debugLineNum = 95;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _setmaxlength(int _ml) throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub SetMaxLength(ml As Int) As WixTextArea";
 //BA.debugLineNum = 45;BA.debugLine="TextArea.SetMaxLength(ml)";
_textarea._setmaxlength /*b4j.example.wixtextbox*/ (_ml);
 //BA.debugLineNum = 46;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _setplaceholder(String _ph) throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Sub SetPlaceHolder(ph As String) As WixTextArea";
 //BA.debugLineNum = 51;BA.debugLine="TextArea.SetPlaceHolder(ph)";
_textarea._setplaceholder /*b4j.example.wixtextbox*/ (_ph);
 //BA.debugLineNum = 52;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 29;BA.debugLine="TextArea.SetStyle(prop,val)";
_textarea._setstyle /*b4j.example.wixtextbox*/ (_prop,_val);
 //BA.debugLineNum = 30;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Sub SetTooltip(tt As String) As WixTextArea";
 //BA.debugLineNum = 23;BA.debugLine="TextArea.SetTooltip(tt)";
_textarea._settooltip /*b4j.example.wixtextbox*/ (_tt);
 //BA.debugLineNum = 24;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub SetValue(v As String) As WixTextArea";
 //BA.debugLineNum = 16;BA.debugLine="TextArea.Setvalue(v)";
_textarea._setvalue /*b4j.example.wixtextbox*/ (_v);
 //BA.debugLineNum = 17;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _setwidth(int _w) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Sub SetWidth(w As Int) As WixTextArea";
 //BA.debugLineNum = 63;BA.debugLine="TextArea.SetWidth(w)";
_textarea._setwidth /*b4j.example.wixtextbox*/ (_w);
 //BA.debugLineNum = 64;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
