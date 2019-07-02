package b4j.Mashy.BANanoWebix;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixcounter extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebix", "b4j.Mashy.BANanoWebix.wixcounter", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebix.wixcounter.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebix.wixelement _counter = null;
public int _minimum = 0;
public int _maximum = 0;
public int _stepper = 0;
public b4j.Mashy.BANanoWebix.main _main = null;
public String  _addtoform(b4j.Mashy.BANanoWebix.wixform _frm) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 29;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Counter As WixElement";
_counter = new b4j.Mashy.BANanoWebix.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private Minimum As Int";
_minimum = 0;
 //BA.debugLineNum = 6;BA.debugLine="Private Maximum As Int";
_maximum = 0;
 //BA.debugLineNum = 7;BA.debugLine="Private Stepper As Int";
_stepper = 0;
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebix.wixcounter  _initialize(anywheresoftware.b4a.BA _ba,String _iid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(iID As String) As WixCounter";
 //BA.debugLineNum = 12;BA.debugLine="ID = iID.tolowercase";
_id = _iid.toLowerCase();
 //BA.debugLineNum = 13;BA.debugLine="Counter.Initialize(iID).SetView(\"counter\")";
_counter._initialize /*b4j.Mashy.BANanoWebix.wixelement*/ (ba,_iid)._setview /*b4j.Mashy.BANanoWebix.wixelement*/ ("counter");
 //BA.debugLineNum = 14;BA.debugLine="Minimum = 0";
_minimum = (int) (0);
 //BA.debugLineNum = 15;BA.debugLine="Maximum = 100";
_maximum = (int) (100);
 //BA.debugLineNum = 16;BA.debugLine="Counter.Value = 10";
_counter._value /*Object*/  = (Object)(10);
 //BA.debugLineNum = 17;BA.debugLine="Stepper = 1";
_stepper = (int) (1);
 //BA.debugLineNum = 18;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixcounter)(this);
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 41;BA.debugLine="Counter.SetAttr(\"min\",Minimum)";
_counter._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("min",(Object)(_minimum));
 //BA.debugLineNum = 42;BA.debugLine="Counter.SetAttr(\"max\",Maximum)";
_counter._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("max",(Object)(_maximum));
 //BA.debugLineNum = 43;BA.debugLine="Counter.SetAttr(\"step\", Stepper)";
_counter._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("step",(Object)(_stepper));
 //BA.debugLineNum = 44;BA.debugLine="Return Counter.item";
if (true) return _counter._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixcounter  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Sub SetAlignCenter(r As String) As WixCounter 'ign";
 //BA.debugLineNum = 104;BA.debugLine="Counter.setAligncenter(\"\")";
_counter._setaligncenter /*b4j.Mashy.BANanoWebix.wixelement*/ ("");
 //BA.debugLineNum = 105;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixcounter)(this);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixcounter  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Sub SetAlignLeft(r As String) As WixCounter 'ignor";
 //BA.debugLineNum = 110;BA.debugLine="Counter.SetAlignleft(\"\")";
_counter._setalignleft /*b4j.Mashy.BANanoWebix.wixelement*/ ("");
 //BA.debugLineNum = 111;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixcounter)(this);
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixcounter  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub SetAlignRight(r As String) As WixCounter 'igno";
 //BA.debugLineNum = 98;BA.debugLine="Counter.setAlignright(\"\")";
_counter._setalignright /*b4j.Mashy.BANanoWebix.wixelement*/ ("");
 //BA.debugLineNum = 99;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixcounter)(this);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixcounter  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Sub SetLabel(l As String) As WixCounter";
 //BA.debugLineNum = 55;BA.debugLine="Counter.Label.Text = l";
_counter._label /*b4j.Mashy.BANanoWebix.wixelement._labeltype*/ .Text /*String*/  = _l;
 //BA.debugLineNum = 56;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixcounter)(this);
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixcounter  _setlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub SetLabelAlign(a As String) As WixCounter";
 //BA.debugLineNum = 79;BA.debugLine="Counter.Label.Align = a";
_counter._label /*b4j.Mashy.BANanoWebix.wixelement._labeltype*/ .Align /*String*/  = _a;
 //BA.debugLineNum = 80;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixcounter)(this);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixcounter  _setlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub SetLabelPosition(p As String) As WixCounter";
 //BA.debugLineNum = 85;BA.debugLine="Counter.Label.Position = p";
_counter._label /*b4j.Mashy.BANanoWebix.wixelement._labeltype*/ .Position /*String*/  = _p;
 //BA.debugLineNum = 86;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixcounter)(this);
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixcounter  _setlabelwidth(int _w) throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Sub SetLabelWidth(w As Int) As WixCounter";
 //BA.debugLineNum = 91;BA.debugLine="Counter.Label.Width = w";
_counter._label /*b4j.Mashy.BANanoWebix.wixelement._labeltype*/ .Width /*int*/  = _w;
 //BA.debugLineNum = 92;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixcounter)(this);
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixcounter  _setmax(int _m) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub SetMax(m As Int) As WixCounter";
 //BA.debugLineNum = 61;BA.debugLine="Maximum = m";
_maximum = _m;
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixcounter)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixcounter  _setmin(int _m) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub SetMin(m As Int) As WixCounter";
 //BA.debugLineNum = 67;BA.debugLine="Minimum = m";
_minimum = _m;
 //BA.debugLineNum = 68;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixcounter)(this);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixcounter  _setstep(int _s) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Sub SetStep(s As Int) As WixCounter";
 //BA.debugLineNum = 73;BA.debugLine="Stepper = s";
_stepper = _s;
 //BA.debugLineNum = 74;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixcounter)(this);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixcounter  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 34;BA.debugLine="Counter.SetStyle(prop,val)";
_counter._setstyle /*b4j.Mashy.BANanoWebix.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 35;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixcounter)(this);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixcounter  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Sub SetTooltip(tt As String) As WixCounter";
 //BA.debugLineNum = 23;BA.debugLine="Counter.SetTooltip(tt)";
_counter._settooltip /*b4j.Mashy.BANanoWebix.wixelement*/ (_tt);
 //BA.debugLineNum = 24;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixcounter)(this);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixcounter  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Sub SetValue(v As String) As WixCounter";
 //BA.debugLineNum = 49;BA.debugLine="Counter.Value = v";
_counter._value /*Object*/  = (Object)(_v);
 //BA.debugLineNum = 50;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixcounter)(this);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
