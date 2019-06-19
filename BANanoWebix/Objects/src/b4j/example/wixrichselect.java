package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixrichselect extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixrichselect", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixrichselect.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _richselect = null;
public Object _text = null;
public anywheresoftware.b4a.objects.collections.List _options = null;
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
public b4j.example.wixrichselect  _addoption(String _sid,String _svalue) throws Exception{
anywheresoftware.b4a.objects.collections.Map _sug = null;
 //BA.debugLineNum = 57;BA.debugLine="Sub AddOption(sID As String, sValue As String) As";
 //BA.debugLineNum = 58;BA.debugLine="Dim sug As Map = CreateMap()";
_sug = new anywheresoftware.b4a.objects.collections.Map();
_sug = __c.createMap(new Object[] {});
 //BA.debugLineNum = 59;BA.debugLine="sug.Put(\"id\", sID)";
_sug.Put((Object)("id"),(Object)(_sid));
 //BA.debugLineNum = 60;BA.debugLine="sug.Put(\"value\", sValue)";
_sug.Put((Object)("value"),(Object)(_svalue));
 //BA.debugLineNum = 61;BA.debugLine="Options.Add(sug)";
_options.Add((Object)(_sug.getObject()));
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrichselect)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public String  _addtoform(b4j.example.wixform _frm) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 34;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public RichSelect As WixElement";
_richselect = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private Text As Object";
_text = new Object();
 //BA.debugLineNum = 6;BA.debugLine="Private Options As List";
_options = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixrichselect  _initialize(anywheresoftware.b4a.BA _ba,String _iid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(iID As String) As WixRichSel";
 //BA.debugLineNum = 11;BA.debugLine="ID = iID.tolowercase";
_id = _iid.toLowerCase();
 //BA.debugLineNum = 12;BA.debugLine="RichSelect.Initialize(iID).SetView(\"richselect\")";
_richselect._initialize /*b4j.example.wixelement*/ (ba,_iid)._setview /*b4j.example.wixelement*/ ("richselect");
 //BA.debugLineNum = 13;BA.debugLine="Options.Initialize";
_options.Initialize();
 //BA.debugLineNum = 14;BA.debugLine="Text = \"\"";
_text = (Object)("");
 //BA.debugLineNum = 15;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrichselect)(this);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 39;BA.debugLine="RichSelect.SetOnContent(\"text\",Text)";
_richselect._setoncontent /*b4j.example.wixelement*/ ("text",BA.ObjectToString(_text));
 //BA.debugLineNum = 40;BA.debugLine="RichSelect.SetAttr(\"options\", Options)";
_richselect._setattr /*b4j.example.wixelement*/ ("options",(Object)(_options.getObject()));
 //BA.debugLineNum = 41;BA.debugLine="Return RichSelect.item";
if (true) return _richselect._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrichselect  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Sub SetAlignCenter(r As String) As WixRichSelect '";
 //BA.debugLineNum = 105;BA.debugLine="RichSelect.setAligncenter(\"\")";
_richselect._setaligncenter /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 106;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrichselect)(this);
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrichselect  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Sub SetAlignLeft(r As String) As WixRichSelect 'ig";
 //BA.debugLineNum = 111;BA.debugLine="RichSelect.SetAlignleft(\"\")";
_richselect._setalignleft /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 112;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrichselect)(this);
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrichselect  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Sub SetAlignRight(r As String) As WixRichSelect 'i";
 //BA.debugLineNum = 99;BA.debugLine="RichSelect.setAlignright(\"\")";
_richselect._setalignright /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 100;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrichselect)(this);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrichselect  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Sub SetLabel(l As String) As WixRichSelect";
 //BA.debugLineNum = 73;BA.debugLine="RichSelect.Label.Text = l";
_richselect._label /*b4j.example.wixelement._labeltype*/ .Text /*String*/  = _l;
 //BA.debugLineNum = 74;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrichselect)(this);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrichselect  _setlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Sub SetLabelAlign(a As String) As WixRichSelect";
 //BA.debugLineNum = 80;BA.debugLine="RichSelect.Label.Align = a";
_richselect._label /*b4j.example.wixelement._labeltype*/ .Align /*String*/  = _a;
 //BA.debugLineNum = 81;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrichselect)(this);
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrichselect  _setlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Sub SetLabelPosition(p As String) As WixRichSelect";
 //BA.debugLineNum = 86;BA.debugLine="RichSelect.Label.Position = p";
_richselect._label /*b4j.example.wixelement._labeltype*/ .Position /*String*/  = _p;
 //BA.debugLineNum = 87;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrichselect)(this);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrichselect  _setlabelwidth(int _w) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub SetLabelWidth(w As Int) As WixRichSelect";
 //BA.debugLineNum = 92;BA.debugLine="RichSelect.Label.Width = w";
_richselect._label /*b4j.example.wixelement._labeltype*/ .Width /*int*/  = _w;
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrichselect)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrichselect  _setoptions(anywheresoftware.b4a.objects.collections.List _o) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub SetOptions(o As List) As WixRichSelect";
 //BA.debugLineNum = 52;BA.debugLine="Options = o";
_options = _o;
 //BA.debugLineNum = 53;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrichselect)(this);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrichselect  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 27;BA.debugLine="RichSelect.SetStyle(prop,val)";
_richselect._setstyle /*b4j.example.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 28;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrichselect)(this);
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrichselect  _settext(String _t) throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Sub SetText(t As String) As WixRichSelect";
 //BA.debugLineNum = 46;BA.debugLine="Text = t";
_text = (Object)(_t);
 //BA.debugLineNum = 47;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrichselect)(this);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrichselect  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Sub SetTooltip(tt As String) As WixRichSelect";
 //BA.debugLineNum = 21;BA.debugLine="RichSelect.SetTooltip(tt)";
_richselect._settooltip /*b4j.example.wixelement*/ (_tt);
 //BA.debugLineNum = 22;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrichselect)(this);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrichselect  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub SetValue(v As String) As WixRichSelect";
 //BA.debugLineNum = 67;BA.debugLine="RichSelect.Value = v";
_richselect._value /*Object*/  = (Object)(_v);
 //BA.debugLineNum = 68;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrichselect)(this);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
