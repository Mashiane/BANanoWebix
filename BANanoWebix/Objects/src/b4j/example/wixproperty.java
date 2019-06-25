package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixproperty extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixproperty", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixproperty.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _property = null;
public anywheresoftware.b4a.objects.collections.List _elements = null;
public b4j.example.main _main = null;
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
public b4j.example.pglist _pglist = null;
public b4j.example.pgunitlist _pgunitlist = null;
public b4j.example.pgpropertysheet _pgpropertysheet = null;
public b4j.example.pgtree _pgtree = null;
public b4j.example.pgtreetable _pgtreetable = null;
public b4j.example.pgmenu _pgmenu = null;
public b4j.example.pgsidebar _pgsidebar = null;
public b4j.example.pgcomments _pgcomments = null;
public String  _addcheckbox(String _eid,String _label,String _value) throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Sub AddCheckBox(eid As String, label As String, va";
 //BA.debugLineNum = 75;BA.debugLine="elements.Add(El(eid, label, \"checkbox\", value, Nu";
_elements.Add((Object)(_el(_eid,_label,"checkbox",(Object)(_value),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null))).getObject()));
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return "";
}
public String  _addcolor(String _eid,String _label,String _value) throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Sub AddColor(eid As String, label As String, value";
 //BA.debugLineNum = 43;BA.debugLine="elements.Add(El(eid,label, \"color\", value, Null))";
_elements.Add((Object)(_el(_eid,_label,"color",(Object)(_value),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null))).getObject()));
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return "";
}
public String  _addcombo(String _eid,String _label,String _value,anywheresoftware.b4a.objects.collections.List _options) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub AddCombo(eid As String, label As String, value";
 //BA.debugLineNum = 67;BA.debugLine="elements.Add(El(eid, label, \"combo\", value, optio";
_elements.Add((Object)(_el(_eid,_label,"combo",(Object)(_value),_options).getObject()));
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public String  _adddate(String _eid,String _label,String _value) throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub AddDate(eid As String, label As String, value";
 //BA.debugLineNum = 59;BA.debugLine="elements.Add(El(eid, label, \"date\", value,  Null)";
_elements.Add((Object)(_el(_eid,_label,"date",(Object)(_value),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null))).getObject()));
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
public String  _addlabel(String _label) throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Sub AddLabel(label As String)";
 //BA.debugLineNum = 51;BA.debugLine="elements.Add(El(\"\", label, \"label\", \"\", Null))";
_elements.Add((Object)(_el("",_label,"label",(Object)(""),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null))).getObject()));
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return "";
}
public String  _addpassword(String _eid,String _label,String _value) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Sub AddPassword(eid As String, label As String, va";
 //BA.debugLineNum = 55;BA.debugLine="elements.Add(El(eid, label, \"password\", value,  N";
_elements.Add((Object)(_el(_eid,_label,"password",(Object)(_value),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null))).getObject()));
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return "";
}
public String  _addrichselect(String _eid,String _label,String _value,anywheresoftware.b4a.objects.collections.List _options) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub AddRichSelect(eid As String, label As String,";
 //BA.debugLineNum = 71;BA.debugLine="elements.Add(El(eid, label, \"richselect\", value,";
_elements.Add((Object)(_el(_eid,_label,"richselect",(Object)(_value),_options).getObject()));
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return "";
}
public String  _addselect(String _eid,String _label,String _value,anywheresoftware.b4a.objects.collections.List _options) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Sub AddSelect(eid As String, label As String, valu";
 //BA.debugLineNum = 63;BA.debugLine="elements.Add(El(eid, label, \"select\", value, opti";
_elements.Add((Object)(_el(_eid,_label,"select",(Object)(_value),_options).getObject()));
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return "";
}
public String  _addtextbox(String _eid,String _label,String _value) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub AddTextBox(eid As String, label As String, val";
 //BA.debugLineNum = 47;BA.debugLine="elements.Add(El(eid, label, \"text\", value, Null))";
_elements.Add((Object)(_el(_eid,_label,"text",(Object)(_value),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null))).getObject()));
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Property As WixElement";
_property = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private elements As List";
_elements = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _el(String _eid,String _label,String _typeof,Object _value,anywheresoftware.b4a.objects.collections.List _options) throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 16;BA.debugLine="private Sub El(eid As String, label As String, typ";
 //BA.debugLineNum = 17;BA.debugLine="eid = eid.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 18;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 19;BA.debugLine="opt.Put(\"id\", eid)";
_opt.Put((Object)("id"),(Object)(_eid));
 //BA.debugLineNum = 20;BA.debugLine="opt.Put(\"label\", label)";
_opt.Put((Object)("label"),(Object)(_label));
 //BA.debugLineNum = 21;BA.debugLine="opt.Put(\"type\", typeOf)";
_opt.Put((Object)("type"),(Object)(_typeof));
 //BA.debugLineNum = 22;BA.debugLine="opt.Put(\"value\", value)";
_opt.Put((Object)("value"),_value);
 //BA.debugLineNum = 23;BA.debugLine="If options <> Null Then";
if (_options!= null) { 
 //BA.debugLineNum = 24;BA.debugLine="opt.Put(\"options\", options)";
_opt.Put((Object)("options"),(Object)(_options.getObject()));
 };
 //BA.debugLineNum = 26;BA.debugLine="Return opt";
if (true) return _opt;
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixproperty  _initialize(anywheresoftware.b4a.BA _ba,String _eid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(eID As String) As WixPropert";
 //BA.debugLineNum = 10;BA.debugLine="ID = eID.tolowercase";
_id = _eid.toLowerCase();
 //BA.debugLineNum = 11;BA.debugLine="Property.Initialize(ID).SetView(\"property\")";
_property._initialize /*b4j.example.wixelement*/ (ba,_id)._setview /*b4j.example.wixelement*/ ("property");
 //BA.debugLineNum = 12;BA.debugLine="elements.Initialize";
_elements.Initialize();
 //BA.debugLineNum = 13;BA.debugLine="Return Me";
if (true) return (b4j.example.wixproperty)(this);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 80;BA.debugLine="Property.SetAttr(\"elements\", elements)";
_property._setattr /*b4j.example.wixelement*/ ("elements",(Object)(_elements.getObject()));
 //BA.debugLineNum = 81;BA.debugLine="Return Property.item";
if (true) return _property._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixproperty  _setborderless(boolean _t) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub SetBorderLess(t As Boolean) As WixProperty";
 //BA.debugLineNum = 98;BA.debugLine="Property.SetAttr(\"borderless\", t)";
_property._setattr /*b4j.example.wixelement*/ ("borderless",(Object)(_t));
 //BA.debugLineNum = 99;BA.debugLine="Return Me";
if (true) return (b4j.example.wixproperty)(this);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixproperty  _setcomplexdata(boolean _b) throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Sub SetComplexData(b As Boolean) As WixProperty";
 //BA.debugLineNum = 37;BA.debugLine="Property.SetAttr(\"complexData\", b)";
_property._setattr /*b4j.example.wixelement*/ ("complexData",(Object)(_b));
 //BA.debugLineNum = 38;BA.debugLine="Return Me";
if (true) return (b4j.example.wixproperty)(this);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixproperty  _setdata(anywheresoftware.b4a.objects.collections.List _data) throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Sub SetData(data As List) As WixProperty";
 //BA.debugLineNum = 86;BA.debugLine="Property.SetData(data)";
_property._setdata /*b4j.example.wixelement*/ (_data);
 //BA.debugLineNum = 87;BA.debugLine="Return Me";
if (true) return (b4j.example.wixproperty)(this);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixproperty  _setheight(int _h) throws Exception{
 //BA.debugLineNum = 116;BA.debugLine="Sub SetHeight(h As Int) As WixProperty";
 //BA.debugLineNum = 117;BA.debugLine="Property.SetHeight(h)";
_property._setheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 118;BA.debugLine="Return Me";
if (true) return (b4j.example.wixproperty)(this);
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixproperty  _setnamewidth(int _w) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Sub SetNameWidth(w As Int) As WixProperty";
 //BA.debugLineNum = 31;BA.debugLine="Property.SetAttr(\"nameWidth\", w)";
_property._setattr /*b4j.example.wixelement*/ ("nameWidth",(Object)(_w));
 //BA.debugLineNum = 32;BA.debugLine="Return Me";
if (true) return (b4j.example.wixproperty)(this);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixproperty  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 92;BA.debugLine="Property.SetStyle(prop,val)";
_property._setstyle /*b4j.example.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.example.wixproperty)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixproperty  _settemplate(Object _t) throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Sub SetTemplate(t As Object) As WixProperty";
 //BA.debugLineNum = 105;BA.debugLine="Property.SetTemplate(t)";
_property._settemplate /*b4j.example.wixelement*/ (_t);
 //BA.debugLineNum = 106;BA.debugLine="Return Me";
if (true) return (b4j.example.wixproperty)(this);
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixproperty  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Sub SetTooltip(tt As String) As WixProperty";
 //BA.debugLineNum = 111;BA.debugLine="Property.SetTooltip(tt)";
_property._settooltip /*b4j.example.wixelement*/ (_tt);
 //BA.debugLineNum = 112;BA.debugLine="Return Me";
if (true) return (b4j.example.wixproperty)(this);
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixproperty  _setwidth(int _h) throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Sub SetWidth(h As Int) As WixProperty";
 //BA.debugLineNum = 123;BA.debugLine="Property.SetWidth(h)";
_property._setwidth /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 124;BA.debugLine="Return Me";
if (true) return (b4j.example.wixproperty)(this);
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
