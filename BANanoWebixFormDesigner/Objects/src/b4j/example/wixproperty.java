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
public anywheresoftware.b4a.objects.collections.Map _maps = null;
public b4j.example.main _main = null;
public b4j.example.pgformdesigner _pgformdesigner = null;
public b4j.example.modcenter _modcenter = null;
public b4j.example.dbutton _dbutton = null;
public b4j.example.modsidebar _modsidebar = null;
public b4j.example.modtoolbar _modtoolbar = null;
public b4j.example.drow _drow = null;
public b4j.example.dpager _dpager = null;
public b4j.example.ddbllist _ddbllist = null;
public b4j.example.dform _dform = null;
public b4j.example.dcheckbox _dcheckbox = null;
public b4j.example.dcolorpicker _dcolorpicker = null;
public b4j.example.dcombo _dcombo = null;
public b4j.example.dcounter _dcounter = null;
public b4j.example.ddatepicker _ddatepicker = null;
public b4j.example.dicon _dicon = null;
public b4j.example.dlabel _dlabel = null;
public b4j.example.dradio _dradio = null;
public b4j.example.drichselect _drichselect = null;
public b4j.example.dsearch _dsearch = null;
public b4j.example.dselect _dselect = null;
public b4j.example.dsegmented _dsegmented = null;
public b4j.example.dslider _dslider = null;
public b4j.example.dswitch _dswitch = null;
public b4j.example.dtabbar _dtabbar = null;
public b4j.example.dtext _dtext = null;
public b4j.example.dtextarea _dtextarea = null;
public b4j.example.dtoggle _dtoggle = null;
public b4j.example.duploader _duploader = null;
public b4j.example.dfieldset _dfieldset = null;
public b4j.example.dsuggest _dsuggest = null;
public b4j.example.dcolumn _dcolumn = null;
public b4j.example.modpropertybag _modpropertybag = null;
public b4j.example.ddesignerproperty _ddesignerproperty = null;
public b4j.example.dconnection _dconnection = null;
public b4j.example.dtable _dtable = null;
public b4j.example.dfield _dfield = null;
public b4j.example.modwebix _modwebix = null;
public b4j.example.wixproperty  _addcheckbox(String _eid,String _label,String _value) throws Exception{
 //BA.debugLineNum = 139;BA.debugLine="Sub AddCheckBox(eid As String, label As String, va";
 //BA.debugLineNum = 140;BA.debugLine="elements.Add(El(eid, label, \"checkbox\", value, Nu";
_elements.Add((Object)(_el(_eid,_label,"checkbox",(Object)(_value),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)),__c.Null).getObject()));
 //BA.debugLineNum = 141;BA.debugLine="Return Me";
if (true) return (b4j.example.wixproperty)(this);
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixproperty  _addcolor(String _eid,String _label,String _value) throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Sub AddColor(eid As String, label As String, value";
 //BA.debugLineNum = 100;BA.debugLine="elements.Add(El(eid,label, \"color\", value, Null,N";
_elements.Add((Object)(_el(_eid,_label,"color",(Object)(_value),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)),__c.Null).getObject()));
 //BA.debugLineNum = 101;BA.debugLine="Return Me";
if (true) return (b4j.example.wixproperty)(this);
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixproperty  _addcombo(String _eid,String _label,String _value,anywheresoftware.b4a.objects.collections.List _options) throws Exception{
 //BA.debugLineNum = 129;BA.debugLine="Sub AddCombo(eid As String, label As String, value";
 //BA.debugLineNum = 130;BA.debugLine="elements.Add(El(eid, label, \"combo\", value, optio";
_elements.Add((Object)(_el(_eid,_label,"combo",(Object)(_value),_options,__c.Null).getObject()));
 //BA.debugLineNum = 131;BA.debugLine="Return Me";
if (true) return (b4j.example.wixproperty)(this);
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixproperty  _adddate(String _eid,String _label,String _value,Object _format) throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Sub AddDate(eid As String, label As String, value";
 //BA.debugLineNum = 120;BA.debugLine="elements.Add(El(eid, label, \"date\", value,  Null,";
_elements.Add((Object)(_el(_eid,_label,"date",(Object)(_value),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)),_format).getObject()));
 //BA.debugLineNum = 121;BA.debugLine="Return Me";
if (true) return (b4j.example.wixproperty)(this);
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixproperty  _addlabel(String _label) throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Sub AddLabel(label As String) As WixProperty";
 //BA.debugLineNum = 110;BA.debugLine="elements.Add(El(\"\", label, \"label\", \"\", Null,Null";
_elements.Add((Object)(_el("",_label,"label",(Object)(""),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)),__c.Null).getObject()));
 //BA.debugLineNum = 111;BA.debugLine="Return Me";
if (true) return (b4j.example.wixproperty)(this);
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixproperty  _addpassword(String _eid,String _label,String _value) throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Sub AddPassword(eid As String, label As String, va";
 //BA.debugLineNum = 115;BA.debugLine="elements.Add(El(eid, label, \"password\", value,  N";
_elements.Add((Object)(_el(_eid,_label,"password",(Object)(_value),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)),__c.Null).getObject()));
 //BA.debugLineNum = 116;BA.debugLine="Return Me";
if (true) return (b4j.example.wixproperty)(this);
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixproperty  _addrichselect(String _eid,String _label,String _value,anywheresoftware.b4a.objects.collections.List _options) throws Exception{
 //BA.debugLineNum = 134;BA.debugLine="Sub AddRichSelect(eid As String, label As String,";
 //BA.debugLineNum = 135;BA.debugLine="elements.Add(El(eid, label, \"richselect\", value,";
_elements.Add((Object)(_el(_eid,_label,"richselect",(Object)(_value),_options,__c.Null).getObject()));
 //BA.debugLineNum = 136;BA.debugLine="Return Me";
if (true) return (b4j.example.wixproperty)(this);
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixproperty  _addselect(String _eid,String _label,String _value,anywheresoftware.b4a.objects.collections.List _options) throws Exception{
 //BA.debugLineNum = 124;BA.debugLine="Sub AddSelect(eid As String, label As String, valu";
 //BA.debugLineNum = 125;BA.debugLine="elements.Add(El(eid, label, \"select\", value, opti";
_elements.Add((Object)(_el(_eid,_label,"select",(Object)(_value),_options,__c.Null).getObject()));
 //BA.debugLineNum = 126;BA.debugLine="Return Me";
if (true) return (b4j.example.wixproperty)(this);
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixproperty  _addtextbox(String _eid,String _label,String _value) throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Sub AddTextBox(eid As String, label As String, val";
 //BA.debugLineNum = 105;BA.debugLine="elements.Add(El(eid, label, \"text\", value, Null,N";
_elements.Add((Object)(_el(_eid,_label,"text",(Object)(_value),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)),__c.Null).getObject()));
 //BA.debugLineNum = 106;BA.debugLine="Return Me";
if (true) return (b4j.example.wixproperty)(this);
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return null;
}
public String  _addtocolumns(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 211;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 212;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 213;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 216;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 217;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 218;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 206;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 207;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 208;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 6;BA.debugLine="Private maps As Map";
_maps = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixproperty  _clear() throws Exception{
 //BA.debugLineNum = 144;BA.debugLine="Sub Clear As WixProperty";
 //BA.debugLineNum = 145;BA.debugLine="elements.clear";
_elements.Clear();
 //BA.debugLineNum = 146;BA.debugLine="Return Me";
if (true) return (b4j.example.wixproperty)(this);
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _el(String _eid,String _label,String _typeof,Object _value,anywheresoftware.b4a.objects.collections.List _options,Object _format) throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 18;BA.debugLine="private Sub El(eid As String, label As String, typ";
 //BA.debugLineNum = 19;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 20;BA.debugLine="opt.Put(\"id\", eid)";
_opt.Put((Object)("id"),(Object)(_eid));
 //BA.debugLineNum = 21;BA.debugLine="opt.Put(\"label\", label)";
_opt.Put((Object)("label"),(Object)(_label));
 //BA.debugLineNum = 22;BA.debugLine="opt.Put(\"type\", typeOf)";
_opt.Put((Object)("type"),(Object)(_typeof));
 //BA.debugLineNum = 23;BA.debugLine="opt.Put(\"value\", value)";
_opt.Put((Object)("value"),_value);
 //BA.debugLineNum = 24;BA.debugLine="If format <> Null Then";
if (_format!= null) { 
 //BA.debugLineNum = 25;BA.debugLine="opt.Put(\"format\", format)";
_opt.Put((Object)("format"),_format);
 };
 //BA.debugLineNum = 27;BA.debugLine="If options <> Null Then";
if (_options!= null) { 
 //BA.debugLineNum = 28;BA.debugLine="opt.Put(\"options\", options)";
_opt.Put((Object)("options"),(Object)(_options.getObject()));
 };
 //BA.debugLineNum = 30;BA.debugLine="Return opt";
if (true) return _opt;
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixproperty  _initialize(anywheresoftware.b4a.BA _ba,String _eid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(eID As String) As WixPropert";
 //BA.debugLineNum = 11;BA.debugLine="ID = eID.tolowercase";
_id = _eid.toLowerCase();
 //BA.debugLineNum = 12;BA.debugLine="Property.Initialize(ID).SetView(\"property\")";
_property._initialize /*b4j.example.wixelement*/ (ba,_id)._setview /*b4j.example.wixelement*/ ("property");
 //BA.debugLineNum = 13;BA.debugLine="elements.Initialize";
_elements.Initialize();
 //BA.debugLineNum = 14;BA.debugLine="maps.Initialize";
_maps.Initialize();
 //BA.debugLineNum = 15;BA.debugLine="Return Me";
if (true) return (b4j.example.wixproperty)(this);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 156;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 157;BA.debugLine="Property.SetAttr(\"elements\", elements)";
_property._setattr /*b4j.example.wixelement*/ ("elements",(Object)(_elements.getObject()));
 //BA.debugLineNum = 158;BA.debugLine="Return Property.item";
if (true) return _property._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return null;
}
public String  _refresh(b4j.example.wixpage _pg) throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 149;BA.debugLine="Sub Refresh(pg As WixPage)";
 //BA.debugLineNum = 150;BA.debugLine="Dim opt As Map = CreateMap(\"elements\": elements)";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {(Object)("elements"),(Object)(_elements.getObject())});
 //BA.debugLineNum = 151;BA.debugLine="pg.Define(ID, opt)";
_pg._define /*String*/ (_id,_opt);
 //BA.debugLineNum = 152;BA.debugLine="pg.Refresh(ID)";
_pg._refresh /*String*/ (_id);
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixproperty  _setactual(String _prop,String _actual) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Sub SetActual(prop As String, actual As String) As";
 //BA.debugLineNum = 41;BA.debugLine="maps.Put(prop,actual)";
_maps.Put((Object)(_prop),(Object)(_actual));
 //BA.debugLineNum = 42;BA.debugLine="Return Me";
if (true) return (b4j.example.wixproperty)(this);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixproperty  _setborderless(boolean _t) throws Exception{
 //BA.debugLineNum = 174;BA.debugLine="Sub SetBorderLess(t As Boolean) As WixProperty";
 //BA.debugLineNum = 175;BA.debugLine="Property.SetAttr(\"borderless\", t)";
_property._setattr /*b4j.example.wixelement*/ ("borderless",(Object)(_t));
 //BA.debugLineNum = 176;BA.debugLine="Return Me";
if (true) return (b4j.example.wixproperty)(this);
 //BA.debugLineNum = 177;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixproperty  _setcomplexdata(boolean _b) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub SetComplexData(b As Boolean) As WixProperty";
 //BA.debugLineNum = 94;BA.debugLine="Property.SetAttr(\"complexData\", b)";
_property._setattr /*b4j.example.wixelement*/ ("complexData",(Object)(_b));
 //BA.debugLineNum = 95;BA.debugLine="Return Me";
if (true) return (b4j.example.wixproperty)(this);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixproperty  _setdata(anywheresoftware.b4a.objects.collections.List _data) throws Exception{
 //BA.debugLineNum = 162;BA.debugLine="Sub SetData(data As List) As WixProperty";
 //BA.debugLineNum = 163;BA.debugLine="Property.SetData(data)";
_property._setdata /*b4j.example.wixelement*/ (_data);
 //BA.debugLineNum = 164;BA.debugLine="Return Me";
if (true) return (b4j.example.wixproperty)(this);
 //BA.debugLineNum = 165;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixproperty  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 193;BA.debugLine="Sub SetHeight(h As Object) As WixProperty";
 //BA.debugLineNum = 194;BA.debugLine="Property.SetHeight(h)";
_property._setheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 195;BA.debugLine="Return Me";
if (true) return (b4j.example.wixproperty)(this);
 //BA.debugLineNum = 196;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixproperty  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 77;BA.debugLine="Sub SetMap(m As Map) As WixProperty";
 //BA.debugLineNum = 78;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 79;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 80;BA.debugLine="Property.SetAttr(strKey,	strVal)";
_property._setattr /*b4j.example.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 82;BA.debugLine="Return Me";
if (true) return (b4j.example.wixproperty)(this);
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixproperty  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Sub SetMinHeight(h As Int) As WixProperty";
 //BA.debugLineNum = 72;BA.debugLine="Property.SetMinHeight(h)";
_property._setminheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 73;BA.debugLine="Return Me";
if (true) return (b4j.example.wixproperty)(this);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixproperty  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Sub SetMinWidth(w As Int) As WixProperty";
 //BA.debugLineNum = 66;BA.debugLine="Property.SetMinWidth(w)";
_property._setminwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 67;BA.debugLine="Return Me";
if (true) return (b4j.example.wixproperty)(this);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixproperty  _setname(String _n) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub SetName(n As String) As WixProperty";
 //BA.debugLineNum = 47;BA.debugLine="Property.SetName(n)";
_property._setname /*b4j.example.wixelement*/ (_n);
 //BA.debugLineNum = 48;BA.debugLine="Return Me";
if (true) return (b4j.example.wixproperty)(this);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixproperty  _setnamewidth(int _w) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Sub SetNameWidth(w As Int) As WixProperty";
 //BA.debugLineNum = 88;BA.debugLine="Property.SetAttr(\"nameWidth\", w)";
_property._setattr /*b4j.example.wixelement*/ ("nameWidth",(Object)(_w));
 //BA.debugLineNum = 89;BA.debugLine="Return Me";
if (true) return (b4j.example.wixproperty)(this);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixproperty  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub SetResponsive(b As Object) As WixProperty";
 //BA.debugLineNum = 53;BA.debugLine="Property.SetResponsive(b)";
_property._setresponsive /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.example.wixproperty)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixproperty  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixProperty";
 //BA.debugLineNum = 59;BA.debugLine="Property.SetResponsiveCell(b)";
_property._setresponsivecell /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 60;BA.debugLine="Return Me";
if (true) return (b4j.example.wixproperty)(this);
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixproperty  _setscroll(Object _c) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub SetScroll(c As Object) As WixProperty";
 //BA.debugLineNum = 35;BA.debugLine="Property.SetAttr(\"scroll\", c)";
_property._setattr /*b4j.example.wixelement*/ ("scroll",_c);
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4j.example.wixproperty)(this);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixproperty  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 168;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 169;BA.debugLine="Property.SetStyle(prop,val)";
_property._setstyle /*b4j.example.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 170;BA.debugLine="Return Me";
if (true) return (b4j.example.wixproperty)(this);
 //BA.debugLineNum = 171;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixproperty  _settemplate(Object _t) throws Exception{
 //BA.debugLineNum = 181;BA.debugLine="Sub SetTemplate(t As Object) As WixProperty";
 //BA.debugLineNum = 182;BA.debugLine="Property.SetTemplate(t)";
_property._settemplate /*b4j.example.wixelement*/ (_t);
 //BA.debugLineNum = 183;BA.debugLine="Return Me";
if (true) return (b4j.example.wixproperty)(this);
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixproperty  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 187;BA.debugLine="Sub SetTooltip(tt As String) As WixProperty";
 //BA.debugLineNum = 188;BA.debugLine="Property.SetTooltip(tt)";
_property._settooltip /*b4j.example.wixelement*/ (_tt);
 //BA.debugLineNum = 189;BA.debugLine="Return Me";
if (true) return (b4j.example.wixproperty)(this);
 //BA.debugLineNum = 190;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixproperty  _setwidth(Object _h) throws Exception{
 //BA.debugLineNum = 199;BA.debugLine="Sub SetWidth(h As Object) As WixProperty";
 //BA.debugLineNum = 200;BA.debugLine="Property.SetWidth(h)";
_property._setwidth /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 201;BA.debugLine="Return Me";
if (true) return (b4j.example.wixproperty)(this);
 //BA.debugLineNum = 202;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}