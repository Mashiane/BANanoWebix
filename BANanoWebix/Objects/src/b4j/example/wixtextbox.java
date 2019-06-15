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
public b4j.example.pgforms1 _pgforms1 = null;
public b4j.example.pgforms _pgforms = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.pgdatatable _pgdatatable = null;
public b4j.example.pglayout _pglayout = null;
public String  _addtoform(b4j.example.wixform _frm) throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 40;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return "";
}
public String  _addtotoolbar(b4j.example.wixtoolbar _tblb) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub AddToToolbar(tblB As WixToolBar)";
 //BA.debugLineNum = 35;BA.debugLine="tblB.AddItem(Item)";
_tblb._additem /*b4j.example.wixtoolbar*/ (_item());
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 68;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 69;BA.debugLine="TextBox.SetOnContent(\"suggest\",Suggest)";
_textbox._setoncontent /*String*/ ("suggest",_suggest);
 //BA.debugLineNum = 70;BA.debugLine="Return TextBox.Item";
if (true) return _textbox._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextbox  _setalign(String _a) throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Sub SetAlign(a As String) As WixTextBox";
 //BA.debugLineNum = 105;BA.debugLine="TextBox.Align = a";
_textbox._align /*String*/  = _a;
 //BA.debugLineNum = 106;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextbox)(this);
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextbox  _setdisabled(boolean _b) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Sub SetDisabled(b As Boolean) As WixTextBox";
 //BA.debugLineNum = 29;BA.debugLine="TextBox.setattr(\"disabled\",b)";
_textbox._setattr /*b4j.example.wixelement*/ ("disabled",(Object)(_b));
 //BA.debugLineNum = 30;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextbox)(this);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextbox  _setheight(int _h) throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Sub SetHeight(h As Int) As WixTextBox";
 //BA.debugLineNum = 99;BA.debugLine="TextBox.Height = h";
_textbox._height /*int*/  = _h;
 //BA.debugLineNum = 100;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextbox)(this);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextbox  _sethidden(boolean _b) throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Sub SetHidden(b As Boolean) As WixTextBox";
 //BA.debugLineNum = 17;BA.debugLine="TextBox.SetAttr(\"hidden\",b)";
_textbox._setattr /*b4j.example.wixelement*/ ("hidden",(Object)(_b));
 //BA.debugLineNum = 18;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextbox)(this);
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextbox  _setlabel(String _lbl) throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Sub SetLabel(lbl As String) As WixTextBox";
 //BA.debugLineNum = 87;BA.debugLine="TextBox.Label.Text = lbl";
_textbox._label /*b4j.example.wixelement._labeltype*/ .Text /*String*/  = _lbl;
 //BA.debugLineNum = 88;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextbox)(this);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextbox  _setlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Sub SetLabelAlign(a As String) As WixTextBox";
 //BA.debugLineNum = 111;BA.debugLine="TextBox.Label.Align = a";
_textbox._label /*b4j.example.wixelement._labeltype*/ .Align /*String*/  = _a;
 //BA.debugLineNum = 112;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextbox)(this);
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextbox  _setlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 116;BA.debugLine="Sub SetLabelPosition(p As String) As WixTextBox";
 //BA.debugLineNum = 117;BA.debugLine="TextBox.Label.Position = p";
_textbox._label /*b4j.example.wixelement._labeltype*/ .Position /*String*/  = _p;
 //BA.debugLineNum = 118;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextbox)(this);
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextbox  _setlabelwidth(int _w) throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Sub SetLabelWidth(w As Int) As WixTextBox";
 //BA.debugLineNum = 123;BA.debugLine="TextBox.Label.Width = w";
_textbox._label /*b4j.example.wixelement._labeltype*/ .Width /*int*/  = _w;
 //BA.debugLineNum = 124;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextbox)(this);
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextbox  _setmaxlength(int _imaxlength) throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Sub SetMaxLength(imaxlength As Int) As WixTextBox";
 //BA.debugLineNum = 75;BA.debugLine="TextBox.SetHTMLAttr(\"maxlength\", imaxlength)";
_textbox._sethtmlattr /*b4j.example.wixelement*/ ("maxlength",(Object)(_imaxlength));
 //BA.debugLineNum = 76;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextbox)(this);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextbox  _setplaceholder(String _ph) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub SetPlaceHolder(ph As String) As WixTextBox";
 //BA.debugLineNum = 81;BA.debugLine="TextBox.PlaceHolder = ph";
_textbox._placeholder /*String*/  = _ph;
 //BA.debugLineNum = 82;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextbox)(this);
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextbox  _setreadonly(boolean _b) throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Sub SetReadOnly(b As Boolean) As WixTextBox";
 //BA.debugLineNum = 23;BA.debugLine="TextBox.SetAttr(\"readonly\",b)";
_textbox._setattr /*b4j.example.wixelement*/ ("readonly",(Object)(_b));
 //BA.debugLineNum = 24;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextbox)(this);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextbox  _setsuggest(String _s) throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub SetSuggest(s As String) As WixTextBox";
 //BA.debugLineNum = 45;BA.debugLine="Suggest = s";
_suggest = _s;
 //BA.debugLineNum = 46;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextbox)(this);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextbox  _settype(String _t) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Sub SetType(t As String) As WixTextBox";
 //BA.debugLineNum = 63;BA.debugLine="TextBox.TypeOf = t";
_textbox._typeof /*String*/  = _t;
 //BA.debugLineNum = 64;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextbox)(this);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextbox  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Sub SetValue(v As String) As WixTextBox";
 //BA.debugLineNum = 51;BA.debugLine="TextBox.Value = v";
_textbox._value /*Object*/  = (Object)(_v);
 //BA.debugLineNum = 52;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextbox)(this);
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextbox  _setview(String _v) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Sub SetView(v As String) As WixTextBox";
 //BA.debugLineNum = 57;BA.debugLine="TextBox.view = v";
_textbox._view /*String*/  = _v;
 //BA.debugLineNum = 58;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextbox)(this);
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextbox  _setwidth(int _w) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Sub SetWidth(w As Int) As WixTextBox";
 //BA.debugLineNum = 93;BA.debugLine="TextBox.Width = w";
_textbox._width /*int*/  = _w;
 //BA.debugLineNum = 94;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextbox)(this);
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
