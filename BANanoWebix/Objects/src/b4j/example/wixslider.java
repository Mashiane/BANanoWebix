package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixslider extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixslider", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixslider.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _slider = null;
public int _minimum = 0;
public int _maximum = 0;
public int _stepper = 0;
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
 //BA.debugLineNum = 22;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 23;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Slider As WixElement";
_slider = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private Minimum As Int";
_minimum = 0;
 //BA.debugLineNum = 6;BA.debugLine="Private Maximum As Int";
_maximum = 0;
 //BA.debugLineNum = 7;BA.debugLine="Private Stepper As Int";
_stepper = 0;
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixslider  _initialize(anywheresoftware.b4a.BA _ba,String _iid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(iID As String) As WixSlider";
 //BA.debugLineNum = 12;BA.debugLine="ID = iID.tolowercase";
_id = _iid.toLowerCase();
 //BA.debugLineNum = 13;BA.debugLine="Slider.Initialize(iID).SetView(\"slider\")";
_slider._initialize /*b4j.example.wixelement*/ (ba,_iid)._setview /*b4j.example.wixelement*/ ("slider");
 //BA.debugLineNum = 14;BA.debugLine="Minimum = 0";
_minimum = (int) (0);
 //BA.debugLineNum = 15;BA.debugLine="Maximum = 100";
_maximum = (int) (100);
 //BA.debugLineNum = 16;BA.debugLine="Slider.Value = 10";
_slider._value /*Object*/  = (Object)(10);
 //BA.debugLineNum = 17;BA.debugLine="Stepper = 1";
_stepper = (int) (1);
 //BA.debugLineNum = 18;BA.debugLine="Return Me";
if (true) return (b4j.example.wixslider)(this);
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 41;BA.debugLine="Slider.SetAttr(\"min\",Minimum)";
_slider._setattr /*b4j.example.wixelement*/ ("min",(Object)(_minimum));
 //BA.debugLineNum = 42;BA.debugLine="Slider.SetAttr(\"max\",Maximum)";
_slider._setattr /*b4j.example.wixelement*/ ("max",(Object)(_maximum));
 //BA.debugLineNum = 43;BA.debugLine="Slider.SetAttr(\"step\", Stepper)";
_slider._setattr /*b4j.example.wixelement*/ ("step",(Object)(_stepper));
 //BA.debugLineNum = 44;BA.debugLine="Return Slider.item";
if (true) return _slider._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixslider  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Sub SetAlignCenter(r As String) As WixSlider 'igno";
 //BA.debugLineNum = 109;BA.debugLine="Slider.setAligncenter(\"\")";
_slider._setaligncenter /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 110;BA.debugLine="Return Me";
if (true) return (b4j.example.wixslider)(this);
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixslider  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Sub SetAlignLeft(r As String) As WixSlider 'ignore";
 //BA.debugLineNum = 115;BA.debugLine="Slider.SetAlignleft(\"\")";
_slider._setalignleft /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 116;BA.debugLine="Return Me";
if (true) return (b4j.example.wixslider)(this);
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixslider  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Sub SetAlignRight(r As String) As WixSlider 'ignor";
 //BA.debugLineNum = 103;BA.debugLine="Slider.setAlignright(\"\")";
_slider._setalignright /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 104;BA.debugLine="Return Me";
if (true) return (b4j.example.wixslider)(this);
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixslider  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Sub SetLabel(l As String) As WixSlider";
 //BA.debugLineNum = 73;BA.debugLine="Slider.Label.Text = l";
_slider._label /*b4j.example.wixelement._labeltype*/ .Text /*String*/  = _l;
 //BA.debugLineNum = 74;BA.debugLine="Return Me";
if (true) return (b4j.example.wixslider)(this);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixslider  _setlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub SetLabelAlign(a As String) As WixSlider";
 //BA.debugLineNum = 85;BA.debugLine="Slider.Label.Align = a";
_slider._label /*b4j.example.wixelement._labeltype*/ .Align /*String*/  = _a;
 //BA.debugLineNum = 86;BA.debugLine="Return Me";
if (true) return (b4j.example.wixslider)(this);
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixslider  _setlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Sub SetLabelPosition(p As String) As WixSlider";
 //BA.debugLineNum = 91;BA.debugLine="Slider.Label.Position = p";
_slider._label /*b4j.example.wixelement._labeltype*/ .Position /*String*/  = _p;
 //BA.debugLineNum = 92;BA.debugLine="Return Me";
if (true) return (b4j.example.wixslider)(this);
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixslider  _setlabelwidth(int _w) throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Sub SetLabelWidth(w As Int) As WixSlider";
 //BA.debugLineNum = 97;BA.debugLine="Slider.Label.Width = w";
_slider._label /*b4j.example.wixelement._labeltype*/ .Width /*int*/  = _w;
 //BA.debugLineNum = 98;BA.debugLine="Return Me";
if (true) return (b4j.example.wixslider)(this);
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixslider  _setmax(int _m) throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Sub SetMax(m As Int) As WixSlider";
 //BA.debugLineNum = 49;BA.debugLine="Maximum = m";
_maximum = _m;
 //BA.debugLineNum = 50;BA.debugLine="Return Me";
if (true) return (b4j.example.wixslider)(this);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixslider  _setmin(int _m) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Sub SetMin(m As Int) As WixSlider";
 //BA.debugLineNum = 55;BA.debugLine="Minimum = m";
_minimum = _m;
 //BA.debugLineNum = 56;BA.debugLine="Return Me";
if (true) return (b4j.example.wixslider)(this);
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixslider  _setrequired(boolean _b) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub SetRequired(b As Boolean) As WixSlider";
 //BA.debugLineNum = 79;BA.debugLine="Slider.SetRequired(b)";
_slider._setrequired /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 80;BA.debugLine="Return Me";
if (true) return (b4j.example.wixslider)(this);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixslider  _setstep(int _s) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub SetStep(s As Int) As WixSlider";
 //BA.debugLineNum = 61;BA.debugLine="Stepper = s";
_stepper = _s;
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (b4j.example.wixslider)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixslider  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 35;BA.debugLine="Slider.SetStyle(prop,val)";
_slider._setstyle /*b4j.example.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4j.example.wixslider)(this);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixslider  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Sub SetTooltip(tt As String) As WixSlider";
 //BA.debugLineNum = 29;BA.debugLine="Slider.SetTooltip(tt)";
_slider._settooltip /*b4j.example.wixelement*/ (_tt);
 //BA.debugLineNum = 30;BA.debugLine="Return Me";
if (true) return (b4j.example.wixslider)(this);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixslider  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub SetValue(v As String) As WixSlider";
 //BA.debugLineNum = 67;BA.debugLine="Slider.Value = v";
_slider._value /*Object*/  = (Object)(_v);
 //BA.debugLineNum = 68;BA.debugLine="Return Me";
if (true) return (b4j.example.wixslider)(this);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
