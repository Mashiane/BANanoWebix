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
public b4j.example.pglayouts1 _pglayouts1 = null;
public b4j.example.pglayouts2 _pglayouts2 = null;
public b4j.example.pglayouts _pglayouts = null;
public b4j.example.pgforms1 _pgforms1 = null;
public b4j.example.pgforms _pgforms = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.pgdatatable _pgdatatable = null;
public b4j.example.pglayout _pglayout = null;
public String  _addtoform(b4j.example.wixform _frm) throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 22;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return "";
}
public String  _addtotoolbar(b4j.example.wixtoolbar _tblb) throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Sub AddToToolbar(tblB As WixToolBar)";
 //BA.debugLineNum = 27;BA.debugLine="tblB.AddItem(Item)";
_tblb._additem /*b4j.example.wixtoolbar*/ (_item());
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
public b4j.example.wixcolorpicker  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Sub SetLabel(l As String) As WixColorPicker";
 //BA.debugLineNum = 38;BA.debugLine="ColorPicker.Label.Text = l";
_colorpicker._label /*b4j.example.wixelement._labeltype*/ .Text /*String*/  = _l;
 //BA.debugLineNum = 39;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcolorpicker)(this);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcolorpicker  _setlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Sub SetLabelAlign(a As String) As WixColorPicker";
 //BA.debugLineNum = 50;BA.debugLine="ColorPicker.Label.Align = a";
_colorpicker._label /*b4j.example.wixelement._labeltype*/ .Align /*String*/  = _a;
 //BA.debugLineNum = 51;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcolorpicker)(this);
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcolorpicker  _setlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Sub SetLabelPosition(p As String) As WixColorPicke";
 //BA.debugLineNum = 56;BA.debugLine="ColorPicker.Label.Position = p";
_colorpicker._label /*b4j.example.wixelement._labeltype*/ .Position /*String*/  = _p;
 //BA.debugLineNum = 57;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcolorpicker)(this);
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcolorpicker  _setlabelwidth(int _w) throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub SetLabelWidth(w As Int) As WixColorPicker";
 //BA.debugLineNum = 62;BA.debugLine="ColorPicker.Label.Width = w";
_colorpicker._label /*b4j.example.wixelement._labeltype*/ .Width /*int*/  = _w;
 //BA.debugLineNum = 63;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcolorpicker)(this);
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcolorpicker  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Sub SetValue(v As String) As WixColorPicker";
 //BA.debugLineNum = 32;BA.debugLine="ColorPicker.Value = v";
_colorpicker._value /*Object*/  = (Object)(_v);
 //BA.debugLineNum = 33;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcolorpicker)(this);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcolorpicker  _setwidth(int _w) throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Sub SetWidth(w As Int) As WixColorPicker";
 //BA.debugLineNum = 44;BA.debugLine="ColorPicker.Width = w";
_colorpicker._width /*int*/  = _w;
 //BA.debugLineNum = 45;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcolorpicker)(this);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
