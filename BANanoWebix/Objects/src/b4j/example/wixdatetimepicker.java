package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixdatetimepicker extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixdatetimepicker", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixdatetimepicker.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _datetimepicker = null;
public boolean _timepicker = false;
public String _format = "";
public b4j.example.main _main = null;
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
 //BA.debugLineNum = 18;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 19;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public DateTimePicker As WixElement";
_datetimepicker = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private TimePicker As Boolean";
_timepicker = false;
 //BA.debugLineNum = 6;BA.debugLine="Private Format As String";
_format = "";
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixdatetimepicker  _initialize(anywheresoftware.b4a.BA _ba,String _bid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(bID As String) As WixDateTim";
 //BA.debugLineNum = 11;BA.debugLine="ID = bID.ToLowerCase";
_id = _bid.toLowerCase();
 //BA.debugLineNum = 12;BA.debugLine="DateTimePicker.Initialize(ID).SetView(\"datepicker";
_datetimepicker._initialize /*b4j.example.wixelement*/ (ba,_id)._setview /*b4j.example.wixelement*/ ("datepicker");
 //BA.debugLineNum = 13;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatetimepicker)(this);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 25;BA.debugLine="DateTimePicker.SetOnContent(\"format\", Format)";
_datetimepicker._setoncontent /*b4j.example.wixelement*/ ("format",_format);
 //BA.debugLineNum = 26;BA.debugLine="DateTimePicker.SetAttr(\"timepicker\",TimePicker)";
_datetimepicker._setattr /*b4j.example.wixelement*/ ("timepicker",(Object)(_timepicker));
 //BA.debugLineNum = 27;BA.debugLine="Return DateTimePicker.item";
if (true) return _datetimepicker._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatetimepicker  _setformat(String _f) throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Sub SetFormat(f As String) As WixDateTimePicker";
 //BA.debugLineNum = 44;BA.debugLine="Format = f";
_format = _f;
 //BA.debugLineNum = 45;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatetimepicker)(this);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatetimepicker  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Sub SetLabel(l As String) As WixDateTimePicker";
 //BA.debugLineNum = 38;BA.debugLine="DateTimePicker.Label.Text = l";
_datetimepicker._label /*b4j.example.wixelement._labeltype*/ .Text /*String*/  = _l;
 //BA.debugLineNum = 39;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatetimepicker)(this);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatetimepicker  _setlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Sub SetLabelAlign(a As String) As WixDateTimePicke";
 //BA.debugLineNum = 63;BA.debugLine="DateTimePicker.Label.Align = a";
_datetimepicker._label /*b4j.example.wixelement._labeltype*/ .Align /*String*/  = _a;
 //BA.debugLineNum = 64;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatetimepicker)(this);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatetimepicker  _setlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Sub SetLabelPosition(p As String) As WixDateTimePi";
 //BA.debugLineNum = 69;BA.debugLine="DateTimePicker.Label.Position = p";
_datetimepicker._label /*b4j.example.wixelement._labeltype*/ .Position /*String*/  = _p;
 //BA.debugLineNum = 70;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatetimepicker)(this);
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatetimepicker  _setlabelwidth(int _w) throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Sub SetLabelWidth(w As Int) As WixDateTimePicker";
 //BA.debugLineNum = 75;BA.debugLine="DateTimePicker.Label.Width = w";
_datetimepicker._label /*b4j.example.wixelement._labeltype*/ .Width /*int*/  = _w;
 //BA.debugLineNum = 76;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatetimepicker)(this);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatetimepicker  _settimepicker(boolean _t) throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Sub SetTimePicker(t As Boolean) As WixDateTimePick";
 //BA.debugLineNum = 50;BA.debugLine="TimePicker = t";
_timepicker = _t;
 //BA.debugLineNum = 51;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatetimepicker)(this);
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatetimepicker  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Sub SetValue(v As String) As WixDateTimePicker";
 //BA.debugLineNum = 32;BA.debugLine="DateTimePicker.Value = v";
_datetimepicker._value /*Object*/  = (Object)(_v);
 //BA.debugLineNum = 33;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatetimepicker)(this);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatetimepicker  _setwidth(int _w) throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Sub SetWidth(w As Int) As WixDateTimePicker";
 //BA.debugLineNum = 56;BA.debugLine="DateTimePicker.Width = w";
_datetimepicker._width /*int*/  = _w;
 //BA.debugLineNum = 57;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatetimepicker)(this);
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
