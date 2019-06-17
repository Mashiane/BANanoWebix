package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixcombo extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixcombo", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixcombo.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _combo = null;
public anywheresoftware.b4a.objects.collections.List _options = null;
public int _ycount = 0;
public com.ab.banano.BANanoObject _onchange = null;
public com.ab.banano.BANanoObject _dollar = null;
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
public b4j.example.wixcombo  _addoption(String _optid,String _optvalue) throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub AddOption(optID As String, optValue As String)";
 //BA.debugLineNum = 65;BA.debugLine="Options.Add(CreateMap(\"id\":optID,\"value\":optValue";
_options.Add((Object)(__c.createMap(new Object[] {(Object)("id"),(Object)(_optid),(Object)("value"),(Object)(_optvalue)}).getObject()));
 //BA.debugLineNum = 66;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcombo)(this);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return null;
}
public String  _addtoform(b4j.example.wixform _frm) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 35;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return "";
}
public String  _attachonchangeevent() throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Sub AttachOnChangeEvent()";
 //BA.debugLineNum = 24;BA.debugLine="Dollar.Selector(ID).RunMethod(\"attachEvent\",Array";
_dollar.Selector((Object)(_id)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onChange"),(Object)(_onchange)}));
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Combo As WixElement";
_combo = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private Options As List";
_options = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 6;BA.debugLine="Private yCount As Int";
_ycount = 0;
 //BA.debugLineNum = 7;BA.debugLine="Private onChange As BANanoObject";
_onchange = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 8;BA.debugLine="Private Dollar As BANanoObject";
_dollar = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public String  _getselected() throws Exception{
String _res = "";
 //BA.debugLineNum = 112;BA.debugLine="Sub GetSelected() As String";
 //BA.debugLineNum = 113;BA.debugLine="Dim res As String";
_res = "";
 //BA.debugLineNum = 114;BA.debugLine="res = Dollar.Selector(ID).RunMethod(\"getValue\",Nu";
_res = BA.ObjectToString(_dollar.Selector((Object)(_id)).RunMethod("getValue",__c.Null).Result());
 //BA.debugLineNum = 115;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixcombo  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.wixpage _pg,String _iid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize(pg As WixPage, iID As String";
 //BA.debugLineNum = 13;BA.debugLine="Dollar = pg.dollar";
_dollar = _pg._dollar /*com.ab.banano.BANanoObject*/ ;
 //BA.debugLineNum = 14;BA.debugLine="ID = iID.tolowercase";
_id = _iid.toLowerCase();
 //BA.debugLineNum = 15;BA.debugLine="Combo.Initialize(iID).SetView(\"combo\")";
_combo._initialize /*b4j.example.wixelement*/ (ba,_iid)._setview /*b4j.example.wixelement*/ ("combo");
 //BA.debugLineNum = 16;BA.debugLine="Options.Initialize";
_options.Initialize();
 //BA.debugLineNum = 17;BA.debugLine="yCount = 0";
_ycount = (int) (0);
 //BA.debugLineNum = 18;BA.debugLine="onChange = Null";
_onchange = (com.ab.banano.BANanoObject)(__c.Null);
 //BA.debugLineNum = 19;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcombo)(this);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 51;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 52;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 53;BA.debugLine="If Combo.Template <> \"\" Then";
if ((_combo._template /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 54;BA.debugLine="opt.Put(\"template\", Combo.Template)";
_opt.Put((Object)("template"),(Object)(_combo._template /*String*/ ));
 //BA.debugLineNum = 55;BA.debugLine="Combo.Template = \"\"";
_combo._template /*String*/  = "";
 };
 //BA.debugLineNum = 57;BA.debugLine="opt.Put(\"data\", Options)";
_opt.Put((Object)("data"),(Object)(_options.getObject()));
 //BA.debugLineNum = 58;BA.debugLine="If yCount <> 0 Then opt.Put(\"yCount\",yCount)";
if (_ycount!=0) { 
_opt.Put((Object)("yCount"),(Object)(_ycount));};
 //BA.debugLineNum = 59;BA.debugLine="Combo.SetAttr(\"options\", opt)";
_combo._setattr /*b4j.example.wixelement*/ ("options",(Object)(_opt.getObject()));
 //BA.debugLineNum = 60;BA.debugLine="Return Combo.item";
if (true) return _combo._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcombo  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Sub SetLabel(l As String) As WixCombo";
 //BA.debugLineNum = 83;BA.debugLine="Combo.Label.Text = l";
_combo._label /*b4j.example.wixelement._labeltype*/ .Text /*String*/  = _l;
 //BA.debugLineNum = 84;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcombo)(this);
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcombo  _setlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub SetLabelAlign(a As String) As WixCombo";
 //BA.debugLineNum = 90;BA.debugLine="Combo.Label.Align = a";
_combo._label /*b4j.example.wixelement._labeltype*/ .Align /*String*/  = _a;
 //BA.debugLineNum = 91;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcombo)(this);
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcombo  _setlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Sub SetLabelPosition(p As String) As WixCombo";
 //BA.debugLineNum = 96;BA.debugLine="Combo.Label.Position = p";
_combo._label /*b4j.example.wixelement._labeltype*/ .Position /*String*/  = _p;
 //BA.debugLineNum = 97;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcombo)(this);
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcombo  _setlabelwidth(int _w) throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Sub SetLabelWidth(w As Int) As WixCombo";
 //BA.debugLineNum = 102;BA.debugLine="Combo.Label.Width = w";
_combo._label /*b4j.example.wixelement._labeltype*/ .Width /*int*/  = _w;
 //BA.debugLineNum = 103;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcombo)(this);
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcombo  _setonchange(com.ab.banano.BANanoObject _s) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Sub SetOnChange(s As BANanoObject) As WixCombo";
 //BA.debugLineNum = 29;BA.debugLine="onChange = s";
_onchange = _s;
 //BA.debugLineNum = 30;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcombo)(this);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcombo  _setoptions(anywheresoftware.b4a.objects.collections.List _o) throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Sub SetOptions(o As List) As WixCombo";
 //BA.debugLineNum = 40;BA.debugLine="Options = o";
_options = _o;
 //BA.debugLineNum = 41;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcombo)(this);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public String  _setselected(String _value) throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Sub SetSelected(value As String)";
 //BA.debugLineNum = 108;BA.debugLine="Dollar.Selector(ID).RunMethod(\"setValue\",Array(va";
_dollar.Selector((Object)(_id)).RunMethod("setValue",(Object)(new Object[]{(Object)(_value)}));
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixcombo  _settemplate(String _t) throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Sub SetTemplate(t As String) As WixCombo";
 //BA.debugLineNum = 46;BA.debugLine="Combo.Template = t";
_combo._template /*String*/  = _t;
 //BA.debugLineNum = 47;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcombo)(this);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcombo  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Sub SetValue(v As String) As WixCombo";
 //BA.debugLineNum = 77;BA.debugLine="Combo.Value = v";
_combo._value /*Object*/  = (Object)(_v);
 //BA.debugLineNum = 78;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcombo)(this);
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcombo  _setycount(int _y) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub SetYCount(y As Int) As WixCombo";
 //BA.debugLineNum = 71;BA.debugLine="yCount = y";
_ycount = _y;
 //BA.debugLineNum = 72;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcombo)(this);
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
