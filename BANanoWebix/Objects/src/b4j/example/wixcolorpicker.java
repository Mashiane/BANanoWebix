package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixcolorpicker extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixcolorpicker", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixcolorpicker.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _colorpicker = null;
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
 //BA.debugLineNum = 26;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 27;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public ColorPicker As WixElement";
_colorpicker = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixcolorpicker  _initialize(anywheresoftware.b4a.BA _ba,String _bid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize(bID As String) As WixColorPi";
 //BA.debugLineNum = 9;BA.debugLine="ID = bID.ToLowerCase";
_id = _bid.toLowerCase();
 //BA.debugLineNum = 10;BA.debugLine="ColorPicker.Initialize(ID).SetView(\"colorpicker\")";
_colorpicker._initialize /*b4j.example.wixelement*/ (ba,_id)._setview /*b4j.example.wixelement*/ ("colorpicker");
 //BA.debugLineNum = 11;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcolorpicker)(this);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 16;BA.debugLine="Return ColorPicker.item";
if (true) return _colorpicker._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcolorpicker  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Sub SetAlignCenter(r As String) As WixColorPicker";
 //BA.debugLineNum = 82;BA.debugLine="ColorPicker.setAligncenter(\"\")";
_colorpicker._setaligncenter /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 83;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcolorpicker)(this);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcolorpicker  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Sub SetAlignLeft(r As String) As WixColorPicker 'i";
 //BA.debugLineNum = 88;BA.debugLine="ColorPicker.SetAlignleft(\"\")";
_colorpicker._setalignleft /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 89;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcolorpicker)(this);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcolorpicker  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Sub SetAlignRight(r As String) As WixColorPicker '";
 //BA.debugLineNum = 76;BA.debugLine="ColorPicker.setAlignright(\"\")";
_colorpicker._setalignright /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 77;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcolorpicker)(this);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcolorpicker  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub SetLabel(l As String) As WixColorPicker";
 //BA.debugLineNum = 45;BA.debugLine="ColorPicker.Label.Text = l";
_colorpicker._label /*b4j.example.wixelement._labeltype*/ .Text /*String*/  = _l;
 //BA.debugLineNum = 46;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcolorpicker)(this);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcolorpicker  _setlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Sub SetLabelAlign(a As String) As WixColorPicker";
 //BA.debugLineNum = 57;BA.debugLine="ColorPicker.Label.Align = a";
_colorpicker._label /*b4j.example.wixelement._labeltype*/ .Align /*String*/  = _a;
 //BA.debugLineNum = 58;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcolorpicker)(this);
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcolorpicker  _setlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Sub SetLabelPosition(p As String) As WixColorPicke";
 //BA.debugLineNum = 63;BA.debugLine="ColorPicker.Label.Position = p";
_colorpicker._label /*b4j.example.wixelement._labeltype*/ .Position /*String*/  = _p;
 //BA.debugLineNum = 64;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcolorpicker)(this);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcolorpicker  _setlabelwidth(int _w) throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Sub SetLabelWidth(w As Int) As WixColorPicker";
 //BA.debugLineNum = 69;BA.debugLine="ColorPicker.Label.Width = w";
_colorpicker._label /*b4j.example.wixelement._labeltype*/ .Width /*int*/  = _w;
 //BA.debugLineNum = 70;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcolorpicker)(this);
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcolorpicker  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 32;BA.debugLine="ColorPicker.SetStyle(prop,val)";
_colorpicker._setstyle /*b4j.example.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 33;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcolorpicker)(this);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcolorpicker  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Sub SetTooltip(tt As String) As WixColorPicker";
 //BA.debugLineNum = 21;BA.debugLine="ColorPicker.SetTooltip(tt)";
_colorpicker._settooltip /*b4j.example.wixelement*/ (_tt);
 //BA.debugLineNum = 22;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcolorpicker)(this);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcolorpicker  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Sub SetValue(v As String) As WixColorPicker";
 //BA.debugLineNum = 39;BA.debugLine="ColorPicker.Value = v";
_colorpicker._value /*Object*/  = (Object)(_v);
 //BA.debugLineNum = 40;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcolorpicker)(this);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcolorpicker  _setwidth(int _w) throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Sub SetWidth(w As Int) As WixColorPicker";
 //BA.debugLineNum = 51;BA.debugLine="ColorPicker.Width = w";
_colorpicker._width /*int*/  = _w;
 //BA.debugLineNum = 52;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcolorpicker)(this);
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
