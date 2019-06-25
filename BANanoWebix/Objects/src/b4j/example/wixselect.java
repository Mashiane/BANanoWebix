package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixselect extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixselect", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixselect.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _dropdown = null;
public anywheresoftware.b4a.objects.collections.List _options = null;
public b4j.example.main _main = null;
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
public b4j.example.pgdataview _pgdataview = null;
public b4j.example.pglist _pglist = null;
public b4j.example.pgunitlist _pgunitlist = null;
public b4j.example.pgpropertysheet _pgpropertysheet = null;
public b4j.example.pgtree _pgtree = null;
public b4j.example.pgtreetable _pgtreetable = null;
public b4j.example.wixselect  _addoption(String _optid,String _optvalue) throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Sub AddOption(optID As String, optValue As String)";
 //BA.debugLineNum = 49;BA.debugLine="Options.Add(CreateMap(\"id\":optID,\"value\":optValue";
_options.Add((Object)(__c.createMap(new Object[] {(Object)("id"),(Object)(_optid),(Object)("value"),(Object)(_optvalue)}).getObject()));
 //BA.debugLineNum = 50;BA.debugLine="Return Me";
if (true) return (b4j.example.wixselect)(this);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public String  _addtoform(b4j.example.wixform _frm) throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 32;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public DropDown As WixElement";
_dropdown = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private Options As List";
_options = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixselect  _initialize(anywheresoftware.b4a.BA _ba,String _iid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(iID As String) As WixSelect";
 //BA.debugLineNum = 10;BA.debugLine="ID = iID.tolowercase";
_id = _iid.toLowerCase();
 //BA.debugLineNum = 11;BA.debugLine="DropDown.Initialize(iID).SetView(\"select\")";
_dropdown._initialize /*b4j.example.wixelement*/ (ba,_iid)._setview /*b4j.example.wixelement*/ ("select");
 //BA.debugLineNum = 12;BA.debugLine="Options.Initialize";
_options.Initialize();
 //BA.debugLineNum = 13;BA.debugLine="Return Me";
if (true) return (b4j.example.wixselect)(this);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 43;BA.debugLine="DropDown.SetAttr(\"options\", Options)";
_dropdown._setattr /*b4j.example.wixelement*/ ("options",(Object)(_options.getObject()));
 //BA.debugLineNum = 44;BA.debugLine="Return DropDown.item";
if (true) return _dropdown._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixselect  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Sub SetAlignCenter(r As String) As WixSelect 'igno";
 //BA.debugLineNum = 97;BA.debugLine="DropDown.setAligncenter(\"\")";
_dropdown._setaligncenter /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 98;BA.debugLine="Return Me";
if (true) return (b4j.example.wixselect)(this);
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixselect  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Sub SetAlignLeft(r As String) As WixSelect 'ignore";
 //BA.debugLineNum = 103;BA.debugLine="DropDown.SetAlignleft(\"\")";
_dropdown._setalignleft /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 104;BA.debugLine="Return Me";
if (true) return (b4j.example.wixselect)(this);
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixselect  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Sub SetAlignRight(r As String) As WixSelect 'ignor";
 //BA.debugLineNum = 91;BA.debugLine="DropDown.setAlignright(\"\")";
_dropdown._setalignright /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 92;BA.debugLine="Return Me";
if (true) return (b4j.example.wixselect)(this);
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixselect  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub SetLabel(l As String) As WixSelect";
 //BA.debugLineNum = 61;BA.debugLine="DropDown.Label.Text = l";
_dropdown._label /*b4j.example.wixelement._labeltype*/ .Text /*String*/  = _l;
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (b4j.example.wixselect)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixselect  _setlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Sub SetLabelAlign(a As String) As WixSelect";
 //BA.debugLineNum = 73;BA.debugLine="DropDown.Label.Align = a";
_dropdown._label /*b4j.example.wixelement._labeltype*/ .Align /*String*/  = _a;
 //BA.debugLineNum = 74;BA.debugLine="Return Me";
if (true) return (b4j.example.wixselect)(this);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixselect  _setlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub SetLabelPosition(p As String) As WixSelect";
 //BA.debugLineNum = 79;BA.debugLine="DropDown.Label.Position = p";
_dropdown._label /*b4j.example.wixelement._labeltype*/ .Position /*String*/  = _p;
 //BA.debugLineNum = 80;BA.debugLine="Return Me";
if (true) return (b4j.example.wixselect)(this);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixselect  _setlabelwidth(int _w) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub SetLabelWidth(w As Int) As WixSelect";
 //BA.debugLineNum = 85;BA.debugLine="DropDown.Label.Width = w";
_dropdown._label /*b4j.example.wixelement._labeltype*/ .Width /*int*/  = _w;
 //BA.debugLineNum = 86;BA.debugLine="Return Me";
if (true) return (b4j.example.wixselect)(this);
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixselect  _setoptions(anywheresoftware.b4a.objects.collections.List _o) throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Sub SetOptions(o As List) As WixSelect";
 //BA.debugLineNum = 37;BA.debugLine="Options = o";
_options = _o;
 //BA.debugLineNum = 38;BA.debugLine="Return Me";
if (true) return (b4j.example.wixselect)(this);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixselect  _setrequired(boolean _b) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub SetRequired(b As Boolean) As WixSelect";
 //BA.debugLineNum = 67;BA.debugLine="DropDown.SetRequired(b)";
_dropdown._setrequired /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 68;BA.debugLine="Return Me";
if (true) return (b4j.example.wixselect)(this);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixselect  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 18;BA.debugLine="DropDown.SetStyle(prop,val)";
_dropdown._setstyle /*b4j.example.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 19;BA.debugLine="Return Me";
if (true) return (b4j.example.wixselect)(this);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixselect  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub SetTooltip(tt As String) As WixSelect";
 //BA.debugLineNum = 25;BA.debugLine="DropDown.SetTooltip(tt)";
_dropdown._settooltip /*b4j.example.wixelement*/ (_tt);
 //BA.debugLineNum = 26;BA.debugLine="Return Me";
if (true) return (b4j.example.wixselect)(this);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixselect  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Sub SetValue(v As String) As WixSelect";
 //BA.debugLineNum = 55;BA.debugLine="DropDown.Value = v";
_dropdown._value /*Object*/  = (Object)(_v);
 //BA.debugLineNum = 56;BA.debugLine="Return Me";
if (true) return (b4j.example.wixselect)(this);
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
