package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixproperty extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixproperty", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixproperty.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _property = null;
public anywheresoftware.b4a.objects.collections.List _elements = null;
public anywheresoftware.b4a.objects.collections.Map _maps = null;
public com.ab.banano.BANanoObject _webix = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public b4j.Mashy.BANanoWebixDemo.wixproperty  _addcheckbox(String _eid,String _label,String _value) throws Exception{
 //BA.debugLineNum = 223;BA.debugLine="Sub AddCheckBox(eid As String, label As String, va";
 //BA.debugLineNum = 224;BA.debugLine="elements.Add(El(eid, label, \"checkbox\", value, Nu";
_elements.Add((Object)(_el(_eid,_label,"checkbox",(Object)(_value),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)),__c.Null).getObject()));
 //BA.debugLineNum = 225;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixproperty)(this);
 //BA.debugLineNum = 226;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixproperty  _addcolor(String _eid,String _label,String _value) throws Exception{
 //BA.debugLineNum = 160;BA.debugLine="Sub AddColor(eid As String, label As String, value";
 //BA.debugLineNum = 161;BA.debugLine="elements.Add(El(eid,label, \"color\", value, Null,N";
_elements.Add((Object)(_el(_eid,_label,"color",(Object)(_value),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)),__c.Null).getObject()));
 //BA.debugLineNum = 162;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixproperty)(this);
 //BA.debugLineNum = 163;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixproperty  _addcombo(String _eid,String _label,String _value,anywheresoftware.b4a.objects.collections.List _options) throws Exception{
 //BA.debugLineNum = 211;BA.debugLine="Sub AddCombo(eid As String, label As String, value";
 //BA.debugLineNum = 212;BA.debugLine="AddNotSelected(options)";
_addnotselected(_options);
 //BA.debugLineNum = 213;BA.debugLine="elements.Add(El(eid, label, \"combo\", value, optio";
_elements.Add((Object)(_el(_eid,_label,"combo",(Object)(_value),_options,__c.Null).getObject()));
 //BA.debugLineNum = 214;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixproperty)(this);
 //BA.debugLineNum = 215;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixproperty  _adddate(String _eid,String _label,String _value,Object _format) throws Exception{
 //BA.debugLineNum = 200;BA.debugLine="Sub AddDate(eid As String, label As String, value";
 //BA.debugLineNum = 201;BA.debugLine="elements.Add(El(eid, label, \"date\", value,  Null,";
_elements.Add((Object)(_el(_eid,_label,"date",(Object)(_value),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)),_format).getObject()));
 //BA.debugLineNum = 202;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixproperty)(this);
 //BA.debugLineNum = 203;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixproperty  _addlabel(String _label) throws Exception{
 //BA.debugLineNum = 190;BA.debugLine="Sub AddLabel(label As String) As WixProperty";
 //BA.debugLineNum = 191;BA.debugLine="elements.Add(El(\"\", label, \"label\", \"\", Null,Null";
_elements.Add((Object)(_el("",_label,"label",(Object)(""),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)),__c.Null).getObject()));
 //BA.debugLineNum = 192;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixproperty)(this);
 //BA.debugLineNum = 193;BA.debugLine="End Sub";
return null;
}
public String  _addnotselected(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
String _q = "";
String _k1 = "";
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 53;BA.debugLine="Sub AddNotSelected(lst As List)";
 //BA.debugLineNum = 54;BA.debugLine="Dim q As String = \"$\"";
_q = "$";
 //BA.debugLineNum = 55;BA.debugLine="Dim k1 As String = q & \"empty\"";
_k1 = _q+"empty";
 //BA.debugLineNum = 56;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 57;BA.debugLine="opt.Put(\"id\", k1)";
_opt.Put((Object)("id"),(Object)(_k1));
 //BA.debugLineNum = 58;BA.debugLine="opt.Put(\"value\", \"-- Not selected --\")";
_opt.Put((Object)("value"),(Object)("-- Not selected --"));
 //BA.debugLineNum = 59;BA.debugLine="opt.Put(k1, True)";
_opt.Put((Object)(_k1),(Object)(__c.True));
 //BA.debugLineNum = 60;BA.debugLine="lst.InsertAt(0, opt)";
_lst.InsertAt((int) (0),(Object)(_opt.getObject()));
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixproperty  _addpassword(String _eid,String _label,String _value) throws Exception{
 //BA.debugLineNum = 195;BA.debugLine="Sub AddPassword(eid As String, label As String, va";
 //BA.debugLineNum = 196;BA.debugLine="elements.Add(El(eid, label, \"password\", value,  N";
_elements.Add((Object)(_el(_eid,_label,"password",(Object)(_value),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)),__c.Null).getObject()));
 //BA.debugLineNum = 197;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixproperty)(this);
 //BA.debugLineNum = 198;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixproperty  _addpopup(String _eid,String _label,String _value) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixtextarea _ta = null;
b4j.Mashy.BANanoWebixDemo.wixpopup _pu = null;
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 170;BA.debugLine="Sub AddPopUp(eid As String, label As String, value";
 //BA.debugLineNum = 171;BA.debugLine="Dim ta As WixTextArea";
_ta = new b4j.Mashy.BANanoWebixDemo.wixtextarea();
 //BA.debugLineNum = 172;BA.debugLine="ta.Initialize(\"\").SetWidth(300).SetHeight(100)";
_ta._initialize /*b4j.Mashy.BANanoWebixDemo.wixtextarea*/ (ba,"")._setwidth /*b4j.Mashy.BANanoWebixDemo.wixtextarea*/ ((Object)(300))._setheight /*b4j.Mashy.BANanoWebixDemo.wixtextarea*/ ((Object)(100));
 //BA.debugLineNum = 174;BA.debugLine="Dim pu As WixPopUp";
_pu = new b4j.Mashy.BANanoWebixDemo.wixpopup();
 //BA.debugLineNum = 175;BA.debugLine="pu.Initialize(eid & \"pu\").SetPoint(True).SetBody(";
_pu._initialize /*b4j.Mashy.BANanoWebixDemo.wixpopup*/ (ba,_eid+"pu")._setpoint /*b4j.Mashy.BANanoWebixDemo.wixpopup*/ (__c.True)._setbody /*b4j.Mashy.BANanoWebixDemo.wixpopup*/ ((Object)(_ta._item /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 177;BA.debugLine="webix.RunMethod(\"ui\", Array(pu.Item))";
_webix.RunMethod("ui",(Object)(new Object[]{(Object)(_pu._item /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject())}));
 //BA.debugLineNum = 179;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 180;BA.debugLine="opt.Put(\"id\", eid)";
_opt.Put((Object)("id"),(Object)(_eid));
 //BA.debugLineNum = 181;BA.debugLine="opt.Put(\"label\", label)";
_opt.Put((Object)("label"),(Object)(_label));
 //BA.debugLineNum = 182;BA.debugLine="opt.Put(\"type\", \"popup\")";
_opt.Put((Object)("type"),(Object)("popup"));
 //BA.debugLineNum = 183;BA.debugLine="opt.Put(\"popup\", eid & \"pu\")";
_opt.Put((Object)("popup"),(Object)(_eid+"pu"));
 //BA.debugLineNum = 184;BA.debugLine="opt.Put(\"value\", value)";
_opt.Put((Object)("value"),(Object)(_value));
 //BA.debugLineNum = 185;BA.debugLine="elements.Add(opt)";
_elements.Add((Object)(_opt.getObject()));
 //BA.debugLineNum = 186;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixproperty)(this);
 //BA.debugLineNum = 187;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixproperty  _addrichselect(String _eid,String _label,String _value,anywheresoftware.b4a.objects.collections.List _options) throws Exception{
 //BA.debugLineNum = 217;BA.debugLine="Sub AddRichSelect(eid As String, label As String,";
 //BA.debugLineNum = 218;BA.debugLine="AddNotSelected(options)";
_addnotselected(_options);
 //BA.debugLineNum = 219;BA.debugLine="elements.Add(El(eid, label, \"richselect\", value,";
_elements.Add((Object)(_el(_eid,_label,"richselect",(Object)(_value),_options,__c.Null).getObject()));
 //BA.debugLineNum = 220;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixproperty)(this);
 //BA.debugLineNum = 221;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixproperty  _addselect(String _eid,String _label,String _value,anywheresoftware.b4a.objects.collections.List _options) throws Exception{
 //BA.debugLineNum = 205;BA.debugLine="Sub AddSelect(eid As String, label As String, valu";
 //BA.debugLineNum = 206;BA.debugLine="AddNotSelected(options)";
_addnotselected(_options);
 //BA.debugLineNum = 207;BA.debugLine="elements.Add(El(eid, label, \"select\", value, opti";
_elements.Add((Object)(_el(_eid,_label,"select",(Object)(_value),_options,__c.Null).getObject()));
 //BA.debugLineNum = 208;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixproperty)(this);
 //BA.debugLineNum = 209;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixproperty  _addtextbox(String _eid,String _label,String _value) throws Exception{
 //BA.debugLineNum = 165;BA.debugLine="Sub AddTextBox(eid As String, label As String, val";
 //BA.debugLineNum = 166;BA.debugLine="elements.Add(El(eid, label, \"text\", value, Null,N";
_elements.Add((Object)(_el(_eid,_label,"text",(Object)(_value),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)),__c.Null).getObject()));
 //BA.debugLineNum = 167;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixproperty)(this);
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return null;
}
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 289;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 290;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 291;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 294;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 295;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 296;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 284;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 285;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 286;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Property As WixElement";
_property = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private elements As List";
_elements = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 6;BA.debugLine="Public Maps As Map";
_maps = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 7;BA.debugLine="Private webix As BANanoObject";
_webix = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 8;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixproperty  _clear() throws Exception{
 //BA.debugLineNum = 228;BA.debugLine="Sub Clear As WixProperty";
 //BA.debugLineNum = 229;BA.debugLine="elements.clear";
_elements.Clear();
 //BA.debugLineNum = 230;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixproperty)(this);
 //BA.debugLineNum = 231;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _el(String _eid,String _label,String _typeof,Object _value,anywheresoftware.b4a.objects.collections.List _options,Object _format) throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 79;BA.debugLine="private Sub El(eid As String, label As String, typ";
 //BA.debugLineNum = 80;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 81;BA.debugLine="opt.Put(\"id\", eid)";
_opt.Put((Object)("id"),(Object)(_eid));
 //BA.debugLineNum = 82;BA.debugLine="opt.Put(\"label\", label)";
_opt.Put((Object)("label"),(Object)(_label));
 //BA.debugLineNum = 83;BA.debugLine="opt.Put(\"type\", typeOf)";
_opt.Put((Object)("type"),(Object)(_typeof));
 //BA.debugLineNum = 84;BA.debugLine="opt.Put(\"value\", value)";
_opt.Put((Object)("value"),_value);
 //BA.debugLineNum = 85;BA.debugLine="If format <> Null Then";
if (_format!= null) { 
 //BA.debugLineNum = 86;BA.debugLine="opt.Put(\"format\", format)";
_opt.Put((Object)("format"),_format);
 };
 //BA.debugLineNum = 88;BA.debugLine="If options <> Null Then";
if (_options!= null) { 
 //BA.debugLineNum = 89;BA.debugLine="opt.Put(\"options\", options)";
_opt.Put((Object)("options"),(Object)(_options.getObject()));
 };
 //BA.debugLineNum = 91;BA.debugLine="Return opt";
if (true) return _opt;
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixproperty  _initialize(anywheresoftware.b4a.BA _ba,String _eid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 69;BA.debugLine="Public Sub Initialize(eID As String) As WixPropert";
 //BA.debugLineNum = 70;BA.debugLine="ID = eID.tolowercase";
_id = _eid.toLowerCase();
 //BA.debugLineNum = 71;BA.debugLine="Property.Initialize(ID).SetView(\"property\")";
_property._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_id)._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("property");
 //BA.debugLineNum = 72;BA.debugLine="elements.Initialize";
_elements.Initialize();
 //BA.debugLineNum = 73;BA.debugLine="Maps.Initialize";
_maps.Initialize();
 //BA.debugLineNum = 74;BA.debugLine="webix.Initialize(\"webix\")";
_webix.Initialize((Object)("webix"));
 //BA.debugLineNum = 75;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 76;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixproperty)(this);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 240;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 241;BA.debugLine="Property.SetAttr(\"elements\", elements)";
_property._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("elements",(Object)(_elements.getObject()));
 //BA.debugLineNum = 242;BA.debugLine="Return Property.item";
if (true) return _property._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 243;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 65;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return "";
}
public String  _refresh(b4j.Mashy.BANanoWebixDemo.wixpage _pg) throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 233;BA.debugLine="Sub Refresh(pg As WixPage)";
 //BA.debugLineNum = 234;BA.debugLine="Dim opt As Map = CreateMap(\"elements\": elements)";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {(Object)("elements"),(Object)(_elements.getObject())});
 //BA.debugLineNum = 235;BA.debugLine="pg.Define(ID, opt)";
_pg._define /*String*/ (_id,_opt);
 //BA.debugLineNum = 236;BA.debugLine="pg.Refresh(ID)";
_pg._refresh /*String*/ (_id);
 //BA.debugLineNum = 237;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixproperty  _setactual(String _prop,String _actual) throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Sub SetActual(prop As String, actual As String) As";
 //BA.debugLineNum = 102;BA.debugLine="Maps.Put(prop,actual)";
_maps.Put((Object)(_prop),(Object)(_actual));
 //BA.debugLineNum = 103;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixproperty)(this);
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixproperty  _setanimate(boolean _animate) throws Exception{
 //BA.debugLineNum = 298;BA.debugLine="Sub SetAnimate(animate As Boolean) As WixProperty";
 //BA.debugLineNum = 299;BA.debugLine="Property.SetAttr(\"animate\", animate)";
_property._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("animate",(Object)(_animate));
 //BA.debugLineNum = 300;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixproperty)(this);
 //BA.debugLineNum = 301;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixproperty  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 30;BA.debugLine="Sub SetAttributes(m As Map) As WixProperty";
 //BA.debugLineNum = 31;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 32;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 33;BA.debugLine="Property.SetAttr(k,v)";
_property._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 35;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixproperty)(this);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixproperty  _setautoheight(boolean _autoheight) throws Exception{
 //BA.debugLineNum = 303;BA.debugLine="Sub SetAutoheight(autoheight As Boolean) As WixPro";
 //BA.debugLineNum = 304;BA.debugLine="Property.SetAttr(\"autoheight\", autoheight)";
_property._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("autoheight",(Object)(_autoheight));
 //BA.debugLineNum = 305;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixproperty)(this);
 //BA.debugLineNum = 306;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixproperty  _setborderless(boolean _t) throws Exception{
 //BA.debugLineNum = 252;BA.debugLine="Sub SetBorderLess(t As Boolean) As WixProperty";
 //BA.debugLineNum = 253;BA.debugLine="Property.SetAttr(\"borderless\", t)";
_property._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("borderless",(Object)(_t));
 //BA.debugLineNum = 254;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixproperty)(this);
 //BA.debugLineNum = 255;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixproperty  _setcomplexdata(boolean _b) throws Exception{
 //BA.debugLineNum = 154;BA.debugLine="Sub SetComplexData(b As Boolean) As WixProperty";
 //BA.debugLineNum = 155;BA.debugLine="Property.SetAttr(\"complexData\", b)";
_property._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("complexData",(Object)(_b));
 //BA.debugLineNum = 156;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixproperty)(this);
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixproperty  _setcontainer(Object _container) throws Exception{
 //BA.debugLineNum = 308;BA.debugLine="Sub SetContainer(container As Object) As WixProper";
 //BA.debugLineNum = 309;BA.debugLine="Property.SetAttr(\"container\", container)";
_property._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("container",_container);
 //BA.debugLineNum = 310;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixproperty)(this);
 //BA.debugLineNum = 311;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixproperty  _setcss(Object _css) throws Exception{
 //BA.debugLineNum = 313;BA.debugLine="Sub SetCss(css As Object) As WixProperty";
 //BA.debugLineNum = 314;BA.debugLine="Property.SetAttr(\"css\", css)";
_property._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("css",_css);
 //BA.debugLineNum = 315;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixproperty)(this);
 //BA.debugLineNum = 316;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixproperty  _setdata(anywheresoftware.b4a.objects.collections.List _data) throws Exception{
 //BA.debugLineNum = 246;BA.debugLine="Sub SetData(data As List) As WixProperty";
 //BA.debugLineNum = 247;BA.debugLine="Property.SetData(data)";
_property._setdata /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_data);
 //BA.debugLineNum = 248;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixproperty)(this);
 //BA.debugLineNum = 249;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixproperty  _setdatatype(Object _datatype) throws Exception{
 //BA.debugLineNum = 318;BA.debugLine="Sub SetDatatype(datatype As Object) As WixProperty";
 //BA.debugLineNum = 319;BA.debugLine="Property.SetAttr(\"datatype\", datatype)";
_property._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("datatype",_datatype);
 //BA.debugLineNum = 320;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixproperty)(this);
 //BA.debugLineNum = 321;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixproperty  _setdisabled(boolean _disabled) throws Exception{
 //BA.debugLineNum = 323;BA.debugLine="Sub SetDisabled(disabled As Boolean) As WixPropert";
 //BA.debugLineNum = 324;BA.debugLine="Property.SetAttr(\"disabled\", disabled)";
_property._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("disabled",(Object)(_disabled));
 //BA.debugLineNum = 325;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixproperty)(this);
 //BA.debugLineNum = 326;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixproperty  _seteditable(boolean _editable) throws Exception{
 //BA.debugLineNum = 333;BA.debugLine="Sub SetEditable(editable As Boolean) As WixPropert";
 //BA.debugLineNum = 334;BA.debugLine="Property.SetAttr(\"editable\", editable)";
_property._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("editable",(Object)(_editable));
 //BA.debugLineNum = 335;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixproperty)(this);
 //BA.debugLineNum = 336;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixproperty  _seteditaction(Object _editaction) throws Exception{
 //BA.debugLineNum = 338;BA.debugLine="Sub SetEditaction(editaction As Object) As WixProp";
 //BA.debugLineNum = 339;BA.debugLine="Property.SetAttr(\"editaction\", editaction)";
_property._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("editaction",_editaction);
 //BA.debugLineNum = 340;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixproperty)(this);
 //BA.debugLineNum = 341;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixproperty  _seteditvalue(Object _editvalue) throws Exception{
 //BA.debugLineNum = 328;BA.debugLine="Sub SetEditValue(editValue As Object) As WixProper";
 //BA.debugLineNum = 329;BA.debugLine="Property.SetAttr(\"editValue\", editValue)";
_property._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("editValue",_editvalue);
 //BA.debugLineNum = 330;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixproperty)(this);
 //BA.debugLineNum = 331;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixproperty  _setelements(Object _xelements) throws Exception{
 //BA.debugLineNum = 343;BA.debugLine="Sub SetElements(xelements As Object) As WixPropert";
 //BA.debugLineNum = 344;BA.debugLine="Property.SetAttr(\"elements\", xelements)";
_property._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("elements",_xelements);
 //BA.debugLineNum = 345;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixproperty)(this);
 //BA.debugLineNum = 346;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixproperty  _setform(Object _form) throws Exception{
 //BA.debugLineNum = 348;BA.debugLine="Sub SetForm(form As Object) As WixProperty";
 //BA.debugLineNum = 349;BA.debugLine="Property.SetAttr(\"form\", form)";
_property._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("form",_form);
 //BA.debugLineNum = 350;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixproperty)(this);
 //BA.debugLineNum = 351;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixproperty  _setgravity(Object _gravity) throws Exception{
 //BA.debugLineNum = 353;BA.debugLine="Sub SetGravity(gravity As Object) As WixProperty";
 //BA.debugLineNum = 354;BA.debugLine="Property.SetAttr(\"gravity\", gravity)";
_property._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("gravity",_gravity);
 //BA.debugLineNum = 355;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixproperty)(this);
 //BA.debugLineNum = 356;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixproperty  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 271;BA.debugLine="Sub SetHeight(h As Object) As WixProperty";
 //BA.debugLineNum = 272;BA.debugLine="Property.SetHeight(h)";
_property._setheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 273;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixproperty)(this);
 //BA.debugLineNum = 274;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixproperty  _sethidden(boolean _hidden) throws Exception{
 //BA.debugLineNum = 358;BA.debugLine="Sub SetHidden(hidden As Boolean) As WixProperty";
 //BA.debugLineNum = 359;BA.debugLine="Property.SetAttr(\"hidden\", hidden)";
_property._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hidden",(Object)(_hidden));
 //BA.debugLineNum = 360;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixproperty)(this);
 //BA.debugLineNum = 361;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixproperty  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 138;BA.debugLine="Sub SetMap(m As Map) As WixProperty";
 //BA.debugLineNum = 139;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 140;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 141;BA.debugLine="Property.SetAttr(strKey,	strVal)";
_property._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 143;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixproperty)(this);
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixproperty  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Sub SetMargin(margin As Object) As WixProperty";
 //BA.debugLineNum = 26;BA.debugLine="Property.SetMargin(margin)";
_property._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 27;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixproperty)(this);
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixproperty  _setmaxheight(Object _maxheight) throws Exception{
 //BA.debugLineNum = 364;BA.debugLine="Sub SetMaxHeight(maxHeight As Object) As WixProper";
 //BA.debugLineNum = 365;BA.debugLine="Property.SetAttr(\"maxHeight\", maxHeight)";
_property._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxHeight",_maxheight);
 //BA.debugLineNum = 366;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixproperty)(this);
 //BA.debugLineNum = 367;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixproperty  _setmaxwidth(Object _maxwidth) throws Exception{
 //BA.debugLineNum = 369;BA.debugLine="Sub SetMaxWidth(maxWidth As Object) As WixProperty";
 //BA.debugLineNum = 370;BA.debugLine="Property.SetAttr(\"maxWidth\", maxWidth)";
_property._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxWidth",_maxwidth);
 //BA.debugLineNum = 371;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixproperty)(this);
 //BA.debugLineNum = 372;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixproperty  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 132;BA.debugLine="Sub SetMinHeight(h As Int) As WixProperty";
 //BA.debugLineNum = 133;BA.debugLine="Property.SetMinHeight(h)";
_property._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 134;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixproperty)(this);
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixproperty  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 126;BA.debugLine="Sub SetMinWidth(w As Int) As WixProperty";
 //BA.debugLineNum = 127;BA.debugLine="Property.SetMinWidth(w)";
_property._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 128;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixproperty)(this);
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixproperty  _setname(String _n) throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Sub SetName(n As String) As WixProperty";
 //BA.debugLineNum = 108;BA.debugLine="Property.SetName(n)";
_property._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 109;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixproperty)(this);
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixproperty  _setnamewidth(int _w) throws Exception{
 //BA.debugLineNum = 148;BA.debugLine="Sub SetNameWidth(w As Int) As WixProperty";
 //BA.debugLineNum = 149;BA.debugLine="Property.SetAttr(\"nameWidth\", w)";
_property._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("nameWidth",(Object)(_w));
 //BA.debugLineNum = 150;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixproperty)(this);
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixproperty  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Sub SetPadding(padding As Object) As WixProperty";
 //BA.debugLineNum = 20;BA.debugLine="Property.SetPadding(padding)";
_property._setpadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 21;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixproperty)(this);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixproperty  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub SetParent(p As WixElement) As WixProperty";
 //BA.debugLineNum = 14;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 15;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixproperty)(this);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixproperty  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 113;BA.debugLine="Sub SetResponsive(b As Object) As WixProperty";
 //BA.debugLineNum = 114;BA.debugLine="Property.SetResponsive(b)";
_property._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 115;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixproperty)(this);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixproperty  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixProperty";
 //BA.debugLineNum = 120;BA.debugLine="Property.SetResponsiveCell(b)";
_property._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 121;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixproperty)(this);
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixproperty  _setscroll(Object _c) throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Sub SetScroll(c As Object) As WixProperty";
 //BA.debugLineNum = 96;BA.debugLine="Property.SetAttr(\"scroll\", c)";
_property._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("scroll",_c);
 //BA.debugLineNum = 97;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixproperty)(this);
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixproperty  _setscrollspeed(Object _scrollspeed) throws Exception{
 //BA.debugLineNum = 374;BA.debugLine="Sub SetScrollSpeed(scrollSpeed As Object) As WixPr";
 //BA.debugLineNum = 375;BA.debugLine="Property.SetAttr(\"scrollSpeed\", scrollSpeed)";
_property._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("scrollSpeed",_scrollspeed);
 //BA.debugLineNum = 376;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixproperty)(this);
 //BA.debugLineNum = 377;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixproperty  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 48;BA.debugLine="Property.SetStyle(prop,sval)";
_property._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixproperty)(this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixproperty  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 38;BA.debugLine="Sub SetStyles(m As Map) As WixProperty";
 //BA.debugLineNum = 39;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 40;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 41;BA.debugLine="Property.SetStyle(k,v)";
_property._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 43;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixproperty)(this);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixproperty  _settemplate(Object _t) throws Exception{
 //BA.debugLineNum = 259;BA.debugLine="Sub SetTemplate(t As Object) As WixProperty";
 //BA.debugLineNum = 260;BA.debugLine="Property.SetTemplate(t)";
_property._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_t);
 //BA.debugLineNum = 261;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixproperty)(this);
 //BA.debugLineNum = 262;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixproperty  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 265;BA.debugLine="Sub SetTooltip(tt As String) As WixProperty";
 //BA.debugLineNum = 266;BA.debugLine="Property.SetTooltip(tt)";
_property._settooltip /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_tt);
 //BA.debugLineNum = 267;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixproperty)(this);
 //BA.debugLineNum = 268;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixproperty  _seturl(Object _url) throws Exception{
 //BA.debugLineNum = 379;BA.debugLine="Sub SetUrl(url As Object) As WixProperty";
 //BA.debugLineNum = 380;BA.debugLine="Property.SetAttr(\"url\", url)";
_property._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("url",_url);
 //BA.debugLineNum = 381;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixproperty)(this);
 //BA.debugLineNum = 382;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixproperty  _setwidth(Object _h) throws Exception{
 //BA.debugLineNum = 277;BA.debugLine="Sub SetWidth(h As Object) As WixProperty";
 //BA.debugLineNum = 278;BA.debugLine="Property.SetWidth(h)";
_property._setwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 279;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixproperty)(this);
 //BA.debugLineNum = 280;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
