package b4j.Mashy.BANanoWebix;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixdatetimepicker extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebix", "b4j.Mashy.BANanoWebix.wixdatetimepicker", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebix.wixdatetimepicker.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebix.wixelement _datetimepicker = null;
public boolean _timepicker = false;
public String _format = "";
public b4j.Mashy.BANanoWebix.main _main = null;
public String  _addtoform(b4j.Mashy.BANanoWebix.wixform _frm) throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 36;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public DateTimePicker As WixElement";
_datetimepicker = new b4j.Mashy.BANanoWebix.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private TimePicker As Boolean";
_timepicker = false;
 //BA.debugLineNum = 6;BA.debugLine="Private Format As String";
_format = "";
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebix.wixdatetimepicker  _initialize(anywheresoftware.b4a.BA _ba,String _bid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(bID As String) As WixDateTim";
 //BA.debugLineNum = 11;BA.debugLine="ID = bID.ToLowerCase";
_id = _bid.toLowerCase();
 //BA.debugLineNum = 12;BA.debugLine="DateTimePicker.Initialize(ID).SetView(\"datepicker";
_datetimepicker._initialize /*b4j.Mashy.BANanoWebix.wixelement*/ (ba,_id)._setview /*b4j.Mashy.BANanoWebix.wixelement*/ ("datepicker");
 //BA.debugLineNum = 13;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixdatetimepicker)(this);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 48;BA.debugLine="DateTimePicker.SetOnContent(\"format\", Format)";
_datetimepicker._setoncontent /*b4j.Mashy.BANanoWebix.wixelement*/ ("format",_format);
 //BA.debugLineNum = 49;BA.debugLine="DateTimePicker.SetAttr(\"timepicker\",TimePicker)";
_datetimepicker._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("timepicker",(Object)(_timepicker));
 //BA.debugLineNum = 50;BA.debugLine="Return DateTimePicker.item";
if (true) return _datetimepicker._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixdatetimepicker  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Sub SetAlignCenter(r As String) As WixDateTimePick";
 //BA.debugLineNum = 111;BA.debugLine="DateTimePicker.setAligncenter(\"\")";
_datetimepicker._setaligncenter /*b4j.Mashy.BANanoWebix.wixelement*/ ("");
 //BA.debugLineNum = 112;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixdatetimepicker)(this);
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixdatetimepicker  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 116;BA.debugLine="Sub SetAlignLeft(r As String) As WixDateTimePicker";
 //BA.debugLineNum = 117;BA.debugLine="DateTimePicker.SetAlignleft(\"\")";
_datetimepicker._setalignleft /*b4j.Mashy.BANanoWebix.wixelement*/ ("");
 //BA.debugLineNum = 118;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixdatetimepicker)(this);
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixdatetimepicker  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Sub SetAlignRight(r As String) As WixDateTimePicke";
 //BA.debugLineNum = 105;BA.debugLine="DateTimePicker.setAlignright(\"\")";
_datetimepicker._setalignright /*b4j.Mashy.BANanoWebix.wixelement*/ ("");
 //BA.debugLineNum = 106;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixdatetimepicker)(this);
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixdatetimepicker  _seteditable(boolean _b) throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Sub SetEditable(b As Boolean) As WixDateTimePicker";
 //BA.debugLineNum = 24;BA.debugLine="DateTimePicker.SetProperty(\"editable\", b)";
_datetimepicker._setproperty /*b4j.Mashy.BANanoWebix.wixelement*/ ("editable",(Object)(_b));
 //BA.debugLineNum = 25;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixdatetimepicker)(this);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixdatetimepicker  _setformat(String _f) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub SetFormat(f As String) As WixDateTimePicker";
 //BA.debugLineNum = 67;BA.debugLine="Format = f";
_format = _f;
 //BA.debugLineNum = 68;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixdatetimepicker)(this);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixdatetimepicker  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub SetLabel(l As String) As WixDateTimePicker";
 //BA.debugLineNum = 61;BA.debugLine="DateTimePicker.Label.Text = l";
_datetimepicker._label /*b4j.Mashy.BANanoWebix.wixelement._labeltype*/ .Text /*String*/  = _l;
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixdatetimepicker)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixdatetimepicker  _setlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Sub SetLabelAlign(a As String) As WixDateTimePicke";
 //BA.debugLineNum = 86;BA.debugLine="DateTimePicker.Label.Align = a";
_datetimepicker._label /*b4j.Mashy.BANanoWebix.wixelement._labeltype*/ .Align /*String*/  = _a;
 //BA.debugLineNum = 87;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixdatetimepicker)(this);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixdatetimepicker  _setlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub SetLabelPosition(p As String) As WixDateTimePi";
 //BA.debugLineNum = 92;BA.debugLine="DateTimePicker.Label.Position = p";
_datetimepicker._label /*b4j.Mashy.BANanoWebix.wixelement._labeltype*/ .Position /*String*/  = _p;
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixdatetimepicker)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixdatetimepicker  _setlabelwidth(int _w) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub SetLabelWidth(w As Int) As WixDateTimePicker";
 //BA.debugLineNum = 98;BA.debugLine="DateTimePicker.Label.Width = w";
_datetimepicker._label /*b4j.Mashy.BANanoWebix.wixelement._labeltype*/ .Width /*int*/  = _w;
 //BA.debugLineNum = 99;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixdatetimepicker)(this);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixdatetimepicker  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 41;BA.debugLine="DateTimePicker.SetStyle(prop,val)";
_datetimepicker._setstyle /*b4j.Mashy.BANanoWebix.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 42;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixdatetimepicker)(this);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixdatetimepicker  _settimepicker(boolean _t) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Sub SetTimePicker(t As Boolean) As WixDateTimePick";
 //BA.debugLineNum = 73;BA.debugLine="TimePicker = t";
_timepicker = _t;
 //BA.debugLineNum = 74;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixdatetimepicker)(this);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixdatetimepicker  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Sub SetTooltip(tt As String) As WixDateTimePicker";
 //BA.debugLineNum = 30;BA.debugLine="DateTimePicker.SetTooltip(tt)";
_datetimepicker._settooltip /*b4j.Mashy.BANanoWebix.wixelement*/ (_tt);
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixdatetimepicker)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixdatetimepicker  _settypetime(boolean _b) throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub SetTypeTime(b As Boolean) As WixDateTimePicker";
 //BA.debugLineNum = 18;BA.debugLine="DateTimePicker.SetProperty(\"type\", \"time\")";
_datetimepicker._setproperty /*b4j.Mashy.BANanoWebix.wixelement*/ ("type",(Object)("time"));
 //BA.debugLineNum = 19;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixdatetimepicker)(this);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixdatetimepicker  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Sub SetValue(v As String) As WixDateTimePicker";
 //BA.debugLineNum = 55;BA.debugLine="DateTimePicker.Value = v";
_datetimepicker._value /*Object*/  = (Object)(_v);
 //BA.debugLineNum = 56;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixdatetimepicker)(this);
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixdatetimepicker  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub SetWidth(w As Object) As WixDateTimePicker";
 //BA.debugLineNum = 79;BA.debugLine="DateTimePicker.Width = w";
_datetimepicker._width /*Object*/  = _w;
 //BA.debugLineNum = 80;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixdatetimepicker)(this);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
