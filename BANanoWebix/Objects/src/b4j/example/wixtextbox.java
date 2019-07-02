package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixtextbox extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixtextbox", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixtextbox.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _textbox = null;
public String _suggest = "";
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
 //BA.debugLineNum = 66;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 67;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public TextBox As WixElement";
_textbox = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private Suggest As String";
_suggest = "";
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixtextbox  _initialize(anywheresoftware.b4a.BA _ba,String _tid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(tID As String) As WixTextBox";
 //BA.debugLineNum = 10;BA.debugLine="TextBox.Initialize(tID).SetView(\"text\")";
_textbox._initialize /*b4j.example.wixelement*/ (ba,_tid)._setview /*b4j.example.wixelement*/ ("text");
 //BA.debugLineNum = 11;BA.debugLine="Suggest = \"\"";
_suggest = "";
 //BA.debugLineNum = 12;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextbox)(this);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 96;BA.debugLine="TextBox.SetOnContent(\"suggest\",Suggest)";
_textbox._setoncontent /*b4j.example.wixelement*/ ("suggest",_suggest);
 //BA.debugLineNum = 97;BA.debugLine="Return TextBox.Item";
if (true) return _textbox._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextbox  _setalign(String _a) throws Exception{
 //BA.debugLineNum = 131;BA.debugLine="Sub SetAlign(a As String) As WixTextBox";
 //BA.debugLineNum = 132;BA.debugLine="TextBox.Align = a";
_textbox._align /*String*/  = _a;
 //BA.debugLineNum = 133;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextbox)(this);
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextbox  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 162;BA.debugLine="Sub SetAlignCenter(r As String) As WixTextBox 'ign";
 //BA.debugLineNum = 163;BA.debugLine="TextBox.setAligncenter(\"\")";
_textbox._setaligncenter /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 164;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextbox)(this);
 //BA.debugLineNum = 165;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextbox  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 168;BA.debugLine="Sub SetAlignLeft(r As String) As WixTextBox 'ignor";
 //BA.debugLineNum = 169;BA.debugLine="TextBox.SetAlignleft(\"\")";
_textbox._setalignleft /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 170;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextbox)(this);
 //BA.debugLineNum = 171;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextbox  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 156;BA.debugLine="Sub SetAlignRight(r As String) As WixTextBox 'igno";
 //BA.debugLineNum = 157;BA.debugLine="TextBox.setAlignright(\"\")";
_textbox._setalignright /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 158;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextbox)(this);
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextbox  _setdisabled(boolean _b) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub SetDisabled(b As Boolean) As WixTextBox";
 //BA.debugLineNum = 61;BA.debugLine="TextBox.setattr(\"disabled\",b)";
_textbox._setattr /*b4j.example.wixelement*/ ("disabled",(Object)(_b));
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextbox)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextbox  _setheight(int _h) throws Exception{
 //BA.debugLineNum = 125;BA.debugLine="Sub SetHeight(h As Int) As WixTextBox";
 //BA.debugLineNum = 126;BA.debugLine="TextBox.Height = h";
_textbox._height /*int*/  = _h;
 //BA.debugLineNum = 127;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextbox)(this);
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextbox  _sethidden(boolean _b) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub SetHidden(b As Boolean) As WixTextBox";
 //BA.debugLineNum = 35;BA.debugLine="TextBox.SetAttr(\"hidden\",b)";
_textbox._setattr /*b4j.example.wixelement*/ ("hidden",(Object)(_b));
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextbox)(this);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextbox  _setinvalidmessage(String _msg) throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Sub SetInvalidMessage(msg As String) As WixTextBox";
 //BA.debugLineNum = 17;BA.debugLine="TextBox.SetAttr(\"invalidMessage\", msg)";
_textbox._setattr /*b4j.example.wixelement*/ ("invalidMessage",(Object)(_msg));
 //BA.debugLineNum = 18;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextbox)(this);
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextbox  _setlabel(String _lbl) throws Exception{
 //BA.debugLineNum = 113;BA.debugLine="Sub SetLabel(lbl As String) As WixTextBox";
 //BA.debugLineNum = 114;BA.debugLine="TextBox.Label.Text = lbl";
_textbox._label /*b4j.example.wixelement._labeltype*/ .Text /*String*/  = _lbl;
 //BA.debugLineNum = 115;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextbox)(this);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextbox  _setlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 137;BA.debugLine="Sub SetLabelAlign(a As String) As WixTextBox";
 //BA.debugLineNum = 138;BA.debugLine="TextBox.Label.Align = a";
_textbox._label /*b4j.example.wixelement._labeltype*/ .Align /*String*/  = _a;
 //BA.debugLineNum = 139;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextbox)(this);
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextbox  _setlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 143;BA.debugLine="Sub SetLabelPosition(p As String) As WixTextBox";
 //BA.debugLineNum = 144;BA.debugLine="TextBox.Label.Position = p";
_textbox._label /*b4j.example.wixelement._labeltype*/ .Position /*String*/  = _p;
 //BA.debugLineNum = 145;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextbox)(this);
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextbox  _setlabelwidth(int _w) throws Exception{
 //BA.debugLineNum = 149;BA.debugLine="Sub SetLabelWidth(w As Int) As WixTextBox";
 //BA.debugLineNum = 150;BA.debugLine="TextBox.Label.Width = w";
_textbox._label /*b4j.example.wixelement._labeltype*/ .Width /*int*/  = _w;
 //BA.debugLineNum = 151;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextbox)(this);
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextbox  _setmaxlength(int _imaxlength) throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Sub SetMaxLength(imaxlength As Int) As WixTextBox";
 //BA.debugLineNum = 102;BA.debugLine="TextBox.SetHTMLAttr(\"maxlength\", imaxlength)";
_textbox._sethtmlattr /*b4j.example.wixelement*/ ("maxlength",(Object)(_imaxlength));
 //BA.debugLineNum = 103;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextbox)(this);
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextbox  _setplaceholder(String _ph) throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Sub SetPlaceHolder(ph As String) As WixTextBox";
 //BA.debugLineNum = 108;BA.debugLine="TextBox.PlaceHolder = ph";
_textbox._placeholder /*String*/  = _ph;
 //BA.debugLineNum = 109;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextbox)(this);
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextbox  _setreadonly(boolean _b) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Sub SetReadOnly(b As Boolean) As WixTextBox";
 //BA.debugLineNum = 55;BA.debugLine="TextBox.SetAttr(\"readonly\",b)";
_textbox._setattr /*b4j.example.wixelement*/ ("readonly",(Object)(_b));
 //BA.debugLineNum = 56;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextbox)(this);
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextbox  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 49;BA.debugLine="TextBox.SetStyle(prop,val)";
_textbox._setstyle /*b4j.example.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 50;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextbox)(this);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextbox  _setsuggest(String _s) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Sub SetSuggest(s As String) As WixTextBox";
 //BA.debugLineNum = 72;BA.debugLine="Suggest = s";
_suggest = _s;
 //BA.debugLineNum = 73;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextbox)(this);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextbox  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Sub SetTooltip(tt As String) As WixTextBox";
 //BA.debugLineNum = 42;BA.debugLine="TextBox.SetTooltip(tt)";
_textbox._settooltip /*b4j.example.wixelement*/ (_tt);
 //BA.debugLineNum = 43;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextbox)(this);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextbox  _settype(String _t) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub SetType(t As String) As WixTextBox";
 //BA.debugLineNum = 90;BA.debugLine="TextBox.TypeOf = t";
_textbox._typeof /*String*/  = _t;
 //BA.debugLineNum = 91;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextbox)(this);
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextbox  _settypeemail(String _r) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Sub SetTypeEmail(r As String) As WixTextBox  'igno";
 //BA.debugLineNum = 29;BA.debugLine="TextBox.SetType(\"email\")";
_textbox._settype /*b4j.example.wixelement*/ ("email");
 //BA.debugLineNum = 30;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextbox)(this);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextbox  _settypepassword(String _r) throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Sub SetTypePassword(r As String) As WixTextBox  'i";
 //BA.debugLineNum = 23;BA.debugLine="TextBox.SetType(\"password\")";
_textbox._settype /*b4j.example.wixelement*/ ("password");
 //BA.debugLineNum = 24;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextbox)(this);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextbox  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 77;BA.debugLine="Sub SetValue(v As String) As WixTextBox";
 //BA.debugLineNum = 78;BA.debugLine="TextBox.Value = v";
_textbox._value /*Object*/  = (Object)(_v);
 //BA.debugLineNum = 79;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextbox)(this);
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextbox  _setview(String _v) throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Sub SetView(v As String) As WixTextBox";
 //BA.debugLineNum = 84;BA.debugLine="TextBox.view = v";
_textbox._view /*String*/  = _v;
 //BA.debugLineNum = 85;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextbox)(this);
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextbox  _setwidth(int _w) throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Sub SetWidth(w As Int) As WixTextBox";
 //BA.debugLineNum = 120;BA.debugLine="TextBox.Width = w";
_textbox._width /*int*/  = _w;
 //BA.debugLineNum = 121;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextbox)(this);
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
