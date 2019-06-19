package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixcheckbox extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixcheckbox", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixcheckbox.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _checkbox = null;
public boolean _labelonright = false;
public b4j.example.main _main = null;
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
public b4j.example.pgdatatable _pgdatatable = null;
public b4j.example.pglayout _pglayout = null;
public String  _addtoform(b4j.example.wixform _frm) throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 24;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public CheckBox As WixElement";
_checkbox = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private LabelOnRight As Boolean";
_labelonright = false;
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixcheckbox  _initialize(anywheresoftware.b4a.BA _ba,String _iid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(iID As String) As WixCheckBo";
 //BA.debugLineNum = 10;BA.debugLine="ID = iID.tolowercase";
_id = _iid.toLowerCase();
 //BA.debugLineNum = 11;BA.debugLine="CheckBox.Initialize(iID).SetView(\"checkbox\")";
_checkbox._initialize /*b4j.example.wixelement*/ (ba,_iid)._setview /*b4j.example.wixelement*/ ("checkbox");
 //BA.debugLineNum = 12;BA.debugLine="LabelOnRight = False";
_labelonright = __c.False;
 //BA.debugLineNum = 13;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcheckbox)(this);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 29;BA.debugLine="If LabelOnRight Then";
if (_labelonright) { 
 //BA.debugLineNum = 30;BA.debugLine="CheckBox.SetOnContent(\"labelRight\", CheckBox.Lab";
_checkbox._setoncontent /*b4j.example.wixelement*/ ("labelRight",_checkbox._label /*b4j.example.wixelement._labeltype*/ .Text /*String*/ );
 //BA.debugLineNum = 31;BA.debugLine="CheckBox.Label.Text = \"\"";
_checkbox._label /*b4j.example.wixelement._labeltype*/ .Text /*String*/  = "";
 };
 //BA.debugLineNum = 33;BA.debugLine="Return CheckBox.item";
if (true) return _checkbox._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcheckbox  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Sub SetAlignCenter(r As String) As WixCheckBox 'ig";
 //BA.debugLineNum = 88;BA.debugLine="CheckBox.setAligncenter(\"\")";
_checkbox._setaligncenter /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 89;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcheckbox)(this);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcheckbox  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub SetAlignLeft(r As String) As WixCheckBox 'igno";
 //BA.debugLineNum = 94;BA.debugLine="CheckBox.SetAlignleft(\"\")";
_checkbox._setalignleft /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 95;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcheckbox)(this);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcheckbox  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Sub SetAlignRight(r As String) As WixCheckBox 'ign";
 //BA.debugLineNum = 82;BA.debugLine="CheckBox.setAlignright(\"\")";
_checkbox._setalignright /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 83;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcheckbox)(this);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcheckbox  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Sub SetLabel(l As String) As WixCheckBox";
 //BA.debugLineNum = 50;BA.debugLine="CheckBox.Label.Text = l";
_checkbox._label /*b4j.example.wixelement._labeltype*/ .Text /*String*/  = _l;
 //BA.debugLineNum = 51;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcheckbox)(this);
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcheckbox  _setlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Sub SetLabelAlign(a As String) As WixCheckBox";
 //BA.debugLineNum = 63;BA.debugLine="CheckBox.Label.Align = a";
_checkbox._label /*b4j.example.wixelement._labeltype*/ .Align /*String*/  = _a;
 //BA.debugLineNum = 64;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcheckbox)(this);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcheckbox  _setlabelonright(boolean _b) throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Sub SetLabelOnRight(b As Boolean) As WixCheckBox";
 //BA.debugLineNum = 56;BA.debugLine="LabelOnRight = b";
_labelonright = _b;
 //BA.debugLineNum = 57;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcheckbox)(this);
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcheckbox  _setlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Sub SetLabelPosition(p As String) As WixCheckBox";
 //BA.debugLineNum = 69;BA.debugLine="CheckBox.Label.Position = p";
_checkbox._label /*b4j.example.wixelement._labeltype*/ .Position /*String*/  = _p;
 //BA.debugLineNum = 70;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcheckbox)(this);
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcheckbox  _setlabelwidth(int _w) throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Sub SetLabelWidth(w As Int) As WixCheckBox";
 //BA.debugLineNum = 75;BA.debugLine="CheckBox.Label.Width = w";
_checkbox._label /*b4j.example.wixelement._labeltype*/ .Width /*int*/  = _w;
 //BA.debugLineNum = 76;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcheckbox)(this);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcheckbox  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 38;BA.debugLine="CheckBox.SetStyle(prop,val)";
_checkbox._setstyle /*b4j.example.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 39;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcheckbox)(this);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcheckbox  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub SetTooltip(tt As String) As WixCheckBox";
 //BA.debugLineNum = 18;BA.debugLine="CheckBox.SetProperty(\"tooltip\", tt)";
_checkbox._setproperty /*b4j.example.wixelement*/ ("tooltip",(Object)(_tt));
 //BA.debugLineNum = 19;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcheckbox)(this);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcheckbox  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Sub SetValue(v As String) As WixCheckBox";
 //BA.debugLineNum = 44;BA.debugLine="CheckBox.Value = v";
_checkbox._value /*Object*/  = (Object)(_v);
 //BA.debugLineNum = 45;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcheckbox)(this);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
