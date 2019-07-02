package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixradio extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixradio", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixradio.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _radio = null;
public anywheresoftware.b4a.objects.collections.List _options = null;
public boolean _vertical = false;
public b4j.example.main _main = null;
public b4j.example.pgvideo _pgvideo = null;
public b4j.example.pgtabbar _pgtabbar = null;
public b4j.example.pgtree _pgtree = null;
public b4j.example.pgmenu _pgmenu = null;
public b4j.example.pglist _pglist = null;
public b4j.example.pgdataview _pgdataview = null;
public b4j.example.pgdatatable1 _pgdatatable1 = null;
public b4j.example.pgdatatable _pgdatatable = null;
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
public b4j.example.pglayout _pglayout = null;
public b4j.example.pgunitlist _pgunitlist = null;
public b4j.example.pgpropertysheet _pgpropertysheet = null;
public b4j.example.pgtreetable _pgtreetable = null;
public b4j.example.pgsidebar _pgsidebar = null;
public b4j.example.pgcomments _pgcomments = null;
public b4j.example.pggrouplist _pggrouplist = null;
public b4j.example.pgcontext _pgcontext = null;
public b4j.example.pggooglemap _pggooglemap = null;
public b4j.example.pguploader1 _pguploader1 = null;
public b4j.example.pguploader2 _pguploader2 = null;
public b4j.example.pguploader3 _pguploader3 = null;
public b4j.example.wixradio  _addoption(String _sid,String _svalue) throws Exception{
anywheresoftware.b4a.objects.collections.Map _sug = null;
 //BA.debugLineNum = 50;BA.debugLine="Sub AddOption(sID As String, sValue As String) As";
 //BA.debugLineNum = 51;BA.debugLine="Dim sug As Map = CreateMap()";
_sug = new anywheresoftware.b4a.objects.collections.Map();
_sug = __c.createMap(new Object[] {});
 //BA.debugLineNum = 52;BA.debugLine="sug.Put(\"id\", sID)";
_sug.Put((Object)("id"),(Object)(_sid));
 //BA.debugLineNum = 53;BA.debugLine="sug.Put(\"value\", sValue)";
_sug.Put((Object)("value"),(Object)(_svalue));
 //BA.debugLineNum = 54;BA.debugLine="Options.Add(sug)";
_options.Add((Object)(_sug.getObject()));
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return (b4j.example.wixradio)(this);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public String  _addtoform(b4j.example.wixform _frm) throws Exception{
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
 //BA.debugLineNum = 4;BA.debugLine="Public Radio As WixElement";
_radio = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private Options As List";
_options = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 6;BA.debugLine="Private Vertical As Boolean";
_vertical = false;
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixradio  _initialize(anywheresoftware.b4a.BA _ba,String _iid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(iID As String) As WixRadio";
 //BA.debugLineNum = 11;BA.debugLine="ID = iID.tolowercase";
_id = _iid.toLowerCase();
 //BA.debugLineNum = 12;BA.debugLine="Radio.Initialize(iID).SetView(\"radio\")";
_radio._initialize /*b4j.example.wixelement*/ (ba,_iid)._setview /*b4j.example.wixelement*/ ("radio");
 //BA.debugLineNum = 13;BA.debugLine="Options.Initialize";
_options.Initialize();
 //BA.debugLineNum = 14;BA.debugLine="Vertical = False";
_vertical = __c.False;
 //BA.debugLineNum = 15;BA.debugLine="Return Me";
if (true) return (b4j.example.wixradio)(this);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 27;BA.debugLine="Radio.SetAttr(\"options\", Options)";
_radio._setattr /*b4j.example.wixelement*/ ("options",(Object)(_options.getObject()));
 //BA.debugLineNum = 28;BA.debugLine="Radio.SetAttr(\"vertical\", Vertical)";
_radio._setattr /*b4j.example.wixelement*/ ("vertical",(Object)(_vertical));
 //BA.debugLineNum = 29;BA.debugLine="Return Radio.item";
if (true) return _radio._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixradio  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Sub SetAlignCenter(r As String) As WixRadio 'ignor";
 //BA.debugLineNum = 104;BA.debugLine="Radio.setAligncenter(\"\")";
_radio._setaligncenter /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 105;BA.debugLine="Return Me";
if (true) return (b4j.example.wixradio)(this);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixradio  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Sub SetAlignLeft(r As String) As WixRadio 'ignore";
 //BA.debugLineNum = 110;BA.debugLine="Radio.SetAlignleft(\"\")";
_radio._setalignleft /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 111;BA.debugLine="Return Me";
if (true) return (b4j.example.wixradio)(this);
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixradio  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub SetAlignRight(r As String) As WixRadio 'ignore";
 //BA.debugLineNum = 98;BA.debugLine="Radio.setAlignright(\"\")";
_radio._setalignright /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 99;BA.debugLine="Return Me";
if (true) return (b4j.example.wixradio)(this);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixradio  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Sub SetLabel(l As String) As WixRadio";
 //BA.debugLineNum = 66;BA.debugLine="Radio.Label.Text = l";
_radio._label /*b4j.example.wixelement._labeltype*/ .Text /*String*/  = _l;
 //BA.debugLineNum = 67;BA.debugLine="Return Me";
if (true) return (b4j.example.wixradio)(this);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixradio  _setlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub SetLabelAlign(a As String) As WixRadio";
 //BA.debugLineNum = 79;BA.debugLine="Radio.Label.Align = a";
_radio._label /*b4j.example.wixelement._labeltype*/ .Align /*String*/  = _a;
 //BA.debugLineNum = 80;BA.debugLine="Return Me";
if (true) return (b4j.example.wixradio)(this);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixradio  _setlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub SetLabelPosition(p As String) As WixRadio";
 //BA.debugLineNum = 85;BA.debugLine="Radio.Label.Position = p";
_radio._label /*b4j.example.wixelement._labeltype*/ .Position /*String*/  = _p;
 //BA.debugLineNum = 86;BA.debugLine="Return Me";
if (true) return (b4j.example.wixradio)(this);
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixradio  _setlabelwidth(int _w) throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Sub SetLabelWidth(w As Int) As WixRadio";
 //BA.debugLineNum = 91;BA.debugLine="Radio.Label.Width = w";
_radio._label /*b4j.example.wixelement._labeltype*/ .Width /*int*/  = _w;
 //BA.debugLineNum = 92;BA.debugLine="Return Me";
if (true) return (b4j.example.wixradio)(this);
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixradio  _setoptions(anywheresoftware.b4a.objects.collections.List _opt) throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub SetOptions(opt As List) As WixRadio";
 //BA.debugLineNum = 45;BA.debugLine="Options = opt";
_options = _opt;
 //BA.debugLineNum = 46;BA.debugLine="Return Me";
if (true) return (b4j.example.wixradio)(this);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixradio  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 34;BA.debugLine="Radio.SetStyle(prop,val)";
_radio._setstyle /*b4j.example.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 35;BA.debugLine="Return Me";
if (true) return (b4j.example.wixradio)(this);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixradio  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Sub SetTooltip(tt As String) As WixRadio";
 //BA.debugLineNum = 21;BA.debugLine="Radio.SetTooltip(tt)";
_radio._settooltip /*b4j.example.wixelement*/ (_tt);
 //BA.debugLineNum = 22;BA.debugLine="Return Me";
if (true) return (b4j.example.wixradio)(this);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixradio  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Sub SetValue(v As String) As WixRadio";
 //BA.debugLineNum = 60;BA.debugLine="Radio.Value = v";
_radio._value /*Object*/  = (Object)(_v);
 //BA.debugLineNum = 61;BA.debugLine="Return Me";
if (true) return (b4j.example.wixradio)(this);
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixradio  _setvertical(boolean _b) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Sub SetVertical(b As Boolean) As WixRadio";
 //BA.debugLineNum = 72;BA.debugLine="Vertical = b";
_vertical = _b;
 //BA.debugLineNum = 73;BA.debugLine="Return Me";
if (true) return (b4j.example.wixradio)(this);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
