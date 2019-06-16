package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixcounter extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixcounter", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixcounter.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _counter = null;
public int _minimum = 0;
public int _maximum = 0;
public int _stepper = 0;
public b4j.example.main _main = null;
public b4j.example.pgforms1 _pgforms1 = null;
public b4j.example.pgforms _pgforms = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.pgdatatable _pgdatatable = null;
public b4j.example.pglayout _pglayout = null;
public b4j.example.pglayouts _pglayouts = null;
public String  _addtoform(b4j.example.wixform _frm) throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 24;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return "";
}
public String  _addtotoolbar(b4j.example.wixtoolbar _tblb) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Sub AddToToolbar(tblB As WixToolBar)";
 //BA.debugLineNum = 29;BA.debugLine="tblB.AddItem(Item)";
_tblb._additem /*b4j.example.wixtoolbar*/ (_item());
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Counter As WixElement";
_counter = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private Minimum As Int";
_minimum = 0;
 //BA.debugLineNum = 6;BA.debugLine="Private Maximum As Int";
_maximum = 0;
 //BA.debugLineNum = 7;BA.debugLine="Private Stepper As Int";
_stepper = 0;
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixcounter  _initialize(anywheresoftware.b4a.BA _ba,String _iid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(iID As String) As WixCounter";
 //BA.debugLineNum = 12;BA.debugLine="ID = iID.tolowercase";
_id = _iid.toLowerCase();
 //BA.debugLineNum = 13;BA.debugLine="Counter.Initialize(iID).SetView(\"counter\")";
_counter._initialize /*b4j.example.wixelement*/ (ba,_iid)._setview /*b4j.example.wixelement*/ ("counter");
 //BA.debugLineNum = 14;BA.debugLine="Minimum = 0";
_minimum = (int) (0);
 //BA.debugLineNum = 15;BA.debugLine="Maximum = 100";
_maximum = (int) (100);
 //BA.debugLineNum = 16;BA.debugLine="Counter.Value = 10";
_counter._value /*Object*/  = (Object)(10);
 //BA.debugLineNum = 17;BA.debugLine="Stepper = 1";
_stepper = (int) (1);
 //BA.debugLineNum = 18;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcounter)(this);
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 34;BA.debugLine="Counter.SetAttr(\"min\",Minimum)";
_counter._setattr /*b4j.example.wixelement*/ ("min",(Object)(_minimum));
 //BA.debugLineNum = 35;BA.debugLine="Counter.SetAttr(\"max\",Maximum)";
_counter._setattr /*b4j.example.wixelement*/ ("max",(Object)(_maximum));
 //BA.debugLineNum = 36;BA.debugLine="Counter.SetAttr(\"step\", Stepper)";
_counter._setattr /*b4j.example.wixelement*/ ("step",(Object)(_stepper));
 //BA.debugLineNum = 37;BA.debugLine="Return Counter.item";
if (true) return _counter._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcounter  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub SetLabel(l As String) As WixCounter";
 //BA.debugLineNum = 48;BA.debugLine="Counter.Label.Text = l";
_counter._label /*b4j.example.wixelement._labeltype*/ .Text /*String*/  = _l;
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcounter)(this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcounter  _setlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Sub SetLabelAlign(a As String) As WixCounter";
 //BA.debugLineNum = 73;BA.debugLine="Counter.Label.Align = a";
_counter._label /*b4j.example.wixelement._labeltype*/ .Align /*String*/  = _a;
 //BA.debugLineNum = 74;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcounter)(this);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcounter  _setlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub SetLabelPosition(p As String) As WixCounter";
 //BA.debugLineNum = 79;BA.debugLine="Counter.Label.Position = p";
_counter._label /*b4j.example.wixelement._labeltype*/ .Position /*String*/  = _p;
 //BA.debugLineNum = 80;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcounter)(this);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcounter  _setlabelwidth(int _w) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub SetLabelWidth(w As Int) As WixCounter";
 //BA.debugLineNum = 85;BA.debugLine="Counter.Label.Width = w";
_counter._label /*b4j.example.wixelement._labeltype*/ .Width /*int*/  = _w;
 //BA.debugLineNum = 86;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcounter)(this);
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcounter  _setmax(int _m) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub SetMax(m As Int) As WixCounter";
 //BA.debugLineNum = 54;BA.debugLine="Maximum = m";
_maximum = _m;
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcounter)(this);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcounter  _setmin(int _m) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Sub SetMin(m As Int) As WixCounter";
 //BA.debugLineNum = 60;BA.debugLine="Minimum = m";
_minimum = _m;
 //BA.debugLineNum = 61;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcounter)(this);
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcounter  _setstep(int _s) throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Sub SetStep(s As Int) As WixCounter";
 //BA.debugLineNum = 66;BA.debugLine="Stepper = s";
_stepper = _s;
 //BA.debugLineNum = 67;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcounter)(this);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcounter  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Sub SetValue(v As String) As WixCounter";
 //BA.debugLineNum = 42;BA.debugLine="Counter.Value = v";
_counter._value /*Object*/  = (Object)(_v);
 //BA.debugLineNum = 43;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcounter)(this);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
