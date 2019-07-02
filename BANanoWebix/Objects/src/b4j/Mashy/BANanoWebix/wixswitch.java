package b4j.Mashy.BANanoWebix;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixswitch extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebix", "b4j.Mashy.BANanoWebix.wixswitch", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebix.wixswitch.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebix.wixelement _switch = null;
public b4j.Mashy.BANanoWebix.main _main = null;
public String  _addtoform(b4j.Mashy.BANanoWebix.wixform _frm) throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 40;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Switch As WixElement";
_switch = new b4j.Mashy.BANanoWebix.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebix.wixswitch  _initialize(anywheresoftware.b4a.BA _ba,String _iid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize(iID As String) As WixSwitch";
 //BA.debugLineNum = 9;BA.debugLine="ID = iID.tolowercase";
_id = _iid.toLowerCase();
 //BA.debugLineNum = 10;BA.debugLine="Switch.Initialize(iID).SetView(\"switch\")";
_switch._initialize /*b4j.Mashy.BANanoWebix.wixelement*/ (ba,_iid)._setview /*b4j.Mashy.BANanoWebix.wixelement*/ ("switch");
 //BA.debugLineNum = 11;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixswitch)(this);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 45;BA.debugLine="Return Switch.item";
if (true) return _switch._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixswitch  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Sub SetAlignCenter(r As String) As WixSwitch 'igno";
 //BA.debugLineNum = 93;BA.debugLine="Switch.setAligncenter(\"\")";
_switch._setaligncenter /*b4j.Mashy.BANanoWebix.wixelement*/ ("");
 //BA.debugLineNum = 94;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixswitch)(this);
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixswitch  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Sub SetAlignLeft(r As String) As WixSwitch 'ignore";
 //BA.debugLineNum = 99;BA.debugLine="Switch.SetAlignleft(\"\")";
_switch._setalignleft /*b4j.Mashy.BANanoWebix.wixelement*/ ("");
 //BA.debugLineNum = 100;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixswitch)(this);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixswitch  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Sub SetAlignRight(r As String) As WixSwitch 'ignor";
 //BA.debugLineNum = 87;BA.debugLine="Switch.setAlignright(\"\")";
_switch._setalignright /*b4j.Mashy.BANanoWebix.wixelement*/ ("");
 //BA.debugLineNum = 88;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixswitch)(this);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixswitch  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub SetLabel(l As String) As WixSwitch";
 //BA.debugLineNum = 62;BA.debugLine="Switch.Label.Text = l";
_switch._label /*b4j.Mashy.BANanoWebix.wixelement._labeltype*/ .Text /*String*/  = _l;
 //BA.debugLineNum = 63;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixswitch)(this);
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixswitch  _setlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Sub SetLabelAlign(a As String) As WixSwitch";
 //BA.debugLineNum = 68;BA.debugLine="Switch.Label.Align = a";
_switch._label /*b4j.Mashy.BANanoWebix.wixelement._labeltype*/ .Align /*String*/  = _a;
 //BA.debugLineNum = 69;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixswitch)(this);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixswitch  _setlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Sub SetLabelPosition(p As String) As WixSwitch";
 //BA.debugLineNum = 74;BA.debugLine="Switch.Label.Position = p";
_switch._label /*b4j.Mashy.BANanoWebix.wixelement._labeltype*/ .Position /*String*/  = _p;
 //BA.debugLineNum = 75;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixswitch)(this);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixswitch  _setlabelright(String _l) throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub SetLabelRight(l As String) As WixSwitch";
 //BA.debugLineNum = 16;BA.debugLine="Switch.SetAttr(\"labelRight\", l)";
_switch._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("labelRight",(Object)(_l));
 //BA.debugLineNum = 17;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixswitch)(this);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixswitch  _setlabelwidth(int _w) throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Sub SetLabelWidth(w As Int) As WixSwitch";
 //BA.debugLineNum = 80;BA.debugLine="Switch.Label.Width = w";
_switch._label /*b4j.Mashy.BANanoWebix.wixelement._labeltype*/ .Width /*int*/  = _w;
 //BA.debugLineNum = 81;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixswitch)(this);
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixswitch  _setofflabel(String _l) throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Sub SetOffLabel(l As String) As WixSwitch";
 //BA.debugLineNum = 28;BA.debugLine="Switch.SetAttr(\"offLabel\", l)";
_switch._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("offLabel",(Object)(_l));
 //BA.debugLineNum = 29;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixswitch)(this);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixswitch  _setonlabel(String _l) throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub SetOnLabel(l As String) As WixSwitch";
 //BA.debugLineNum = 22;BA.debugLine="Switch.SetAttr(\"onLabel\", l)";
_switch._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("onLabel",(Object)(_l));
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixswitch)(this);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixswitch  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 50;BA.debugLine="Switch.SetStyle(prop,val)";
_switch._setstyle /*b4j.Mashy.BANanoWebix.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 51;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixswitch)(this);
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixswitch  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub SetTooltip(tt As String) As WixSwitch";
 //BA.debugLineNum = 34;BA.debugLine="Switch.SetProperty(\"tooltip\", tt)";
_switch._setproperty /*b4j.Mashy.BANanoWebix.wixelement*/ ("tooltip",(Object)(_tt));
 //BA.debugLineNum = 35;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixswitch)(this);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixswitch  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Sub SetValue(v As String) As WixSwitch";
 //BA.debugLineNum = 56;BA.debugLine="Switch.Value = v";
_switch._value /*Object*/  = (Object)(_v);
 //BA.debugLineNum = 57;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixswitch)(this);
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
