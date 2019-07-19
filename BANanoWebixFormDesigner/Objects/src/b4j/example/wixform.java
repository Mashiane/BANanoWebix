package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixform extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixform", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixform.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.wixelement _form = null;
public String _id = "";
public com.ab.banano.BANanoObject _webix = null;
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
public String  _addcolumn(b4j.example.wixcolumn _c) throws Exception{
 //BA.debugLineNum = 183;BA.debugLine="Sub AddColumn(c As WixColumn)";
 //BA.debugLineNum = 184;BA.debugLine="Form.AddColumns(c.Item)";
_form._addcolumns /*b4j.example.wixelement*/ (_c._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 185;BA.debugLine="End Sub";
return "";
}
public String  _addcolumns(anywheresoftware.b4a.objects.collections.Map _i) throws Exception{
 //BA.debugLineNum = 188;BA.debugLine="Sub AddColumns(i As Map)";
 //BA.debugLineNum = 189;BA.debugLine="Form.AddColumns(i)";
_form._addcolumns /*b4j.example.wixelement*/ (_i);
 //BA.debugLineNum = 190;BA.debugLine="End Sub";
return "";
}
public String  _addcolumnsspacer() throws Exception{
 //BA.debugLineNum = 178;BA.debugLine="Sub AddColumnsSpacer()";
 //BA.debugLineNum = 179;BA.debugLine="AddColumns(CreateMap())";
_addcolumns(__c.createMap(new Object[] {}));
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return "";
}
public String  _additem(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 225;BA.debugLine="Sub AddItem(itm As Map)";
 //BA.debugLineNum = 226;BA.debugLine="Form.AddItem(itm)";
_form._additem /*b4j.example.wixelement*/ (_itm);
 //BA.debugLineNum = 227;BA.debugLine="End Sub";
return "";
}
public String  _addrow(b4j.example.wixrow _wxel) throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub AddRow(wxEL As WixRow)";
 //BA.debugLineNum = 18;BA.debugLine="AddRows(wxEL.Item)";
_addrows(_wxel._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
public String  _addrowitems(anywheresoftware.b4a.objects.collections.List _items) throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
 //BA.debugLineNum = 86;BA.debugLine="Sub AddRowItems(items As List)";
 //BA.debugLineNum = 87;BA.debugLine="For Each m As Map In items";
_m = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group1 = _items;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group1.Get(index1)));
 //BA.debugLineNum = 88;BA.debugLine="AddRows(m)";
_addrows(_m);
 }
};
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return "";
}
public String  _addrows(anywheresoftware.b4a.objects.collections.Map _i) throws Exception{
 //BA.debugLineNum = 193;BA.debugLine="Sub AddRows(i As Map)";
 //BA.debugLineNum = 194;BA.debugLine="Form.Rows.Add(i)";
_form._rows /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_i.getObject()));
 //BA.debugLineNum = 195;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixform  _addruleischecked(String _eid) throws Exception{
Object _ie = null;
 //BA.debugLineNum = 143;BA.debugLine="Sub AddRuleIsChecked(eID As String) As WixForm";
 //BA.debugLineNum = 144;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 145;BA.debugLine="Dim ie As Object = webix.GetField(\"rules\").GetFie";
_ie = (Object)(_webix.GetField("rules").GetField("isChecked"));
 //BA.debugLineNum = 146;BA.debugLine="Form.Rules.Put(eID, ie)";
_form._rules /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_eid),_ie);
 //BA.debugLineNum = 147;BA.debugLine="Return Me";
if (true) return (b4j.example.wixform)(this);
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixform  _addruleisemail(String _eid) throws Exception{
Object _ie = null;
 //BA.debugLineNum = 129;BA.debugLine="Sub AddRuleIsEmail(eID As String) As WixForm";
 //BA.debugLineNum = 130;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 131;BA.debugLine="Dim ie As Object = webix.GetField(\"rules\").GetFie";
_ie = (Object)(_webix.GetField("rules").GetField("isEmail"));
 //BA.debugLineNum = 132;BA.debugLine="Form.Rules.Put(eID, ie)";
_form._rules /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_eid),_ie);
 //BA.debugLineNum = 133;BA.debugLine="Return Me";
if (true) return (b4j.example.wixform)(this);
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixform  _addruleisemailorblank(String _eid) throws Exception{
Object _ie = null;
 //BA.debugLineNum = 164;BA.debugLine="Sub AddRuleIsEmailOrBlank(eID As String) As WixFor";
 //BA.debugLineNum = 165;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 166;BA.debugLine="Dim ie As Object = webix.GetField(\"rules\").GetFie";
_ie = (Object)(_webix.GetField("rules").GetField("isEmailOrBlank"));
 //BA.debugLineNum = 167;BA.debugLine="Form.Rules.Put(eID, ie)";
_form._rules /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_eid),_ie);
 //BA.debugLineNum = 168;BA.debugLine="Return Me";
if (true) return (b4j.example.wixform)(this);
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixform  _addruleisnotempty(String _eid) throws Exception{
Object _ie = null;
 //BA.debugLineNum = 136;BA.debugLine="Sub AddRuleIsNotEmpty(eID As String) As WixForm";
 //BA.debugLineNum = 137;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 138;BA.debugLine="Dim ie As Object = webix.GetField(\"rules\").GetFie";
_ie = (Object)(_webix.GetField("rules").GetField("isNotEmpty"));
 //BA.debugLineNum = 139;BA.debugLine="Form.Rules.Put(eID, ie)";
_form._rules /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_eid),_ie);
 //BA.debugLineNum = 140;BA.debugLine="Return Me";
if (true) return (b4j.example.wixform)(this);
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixform  _addruleisnumber(String _eid) throws Exception{
Object _ie = null;
 //BA.debugLineNum = 150;BA.debugLine="Sub AddRuleIsNumber(eID As String) As WixForm";
 //BA.debugLineNum = 151;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 152;BA.debugLine="Dim ie As Object = webix.GetField(\"rules\").GetFie";
_ie = (Object)(_webix.GetField("rules").GetField("isNumber"));
 //BA.debugLineNum = 153;BA.debugLine="Form.Rules.Put(eID, ie)";
_form._rules /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_eid),_ie);
 //BA.debugLineNum = 154;BA.debugLine="Return Me";
if (true) return (b4j.example.wixform)(this);
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixform  _addruleisnumberorblank(String _eid) throws Exception{
Object _ie = null;
 //BA.debugLineNum = 157;BA.debugLine="Sub AddRuleIsNumberOrBlank(eID As String) As WixFo";
 //BA.debugLineNum = 158;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 159;BA.debugLine="Dim ie As Object = webix.GetField(\"rules\").GetFie";
_ie = (Object)(_webix.GetField("rules").GetField("isNumberOrBlank"));
 //BA.debugLineNum = 160;BA.debugLine="Form.Rules.Put(eID, ie)";
_form._rules /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_eid),_ie);
 //BA.debugLineNum = 161;BA.debugLine="Return Me";
if (true) return (b4j.example.wixform)(this);
 //BA.debugLineNum = 162;BA.debugLine="End Sub";
return null;
}
public String  _addtocolumn(b4j.example.wixcolumn _c) throws Exception{
 //BA.debugLineNum = 198;BA.debugLine="Sub AddToColumn(c As WixColumn)";
 //BA.debugLineNum = 199;BA.debugLine="c.AddItem(Item)";
_c._additem /*String*/ (_item());
 //BA.debugLineNum = 200;BA.debugLine="End Sub";
return "";
}
public String  _addtocolumns(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 236;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 237;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 238;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 241;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 242;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 243;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.example.wixform _frm) throws Exception{
 //BA.debugLineNum = 203;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 204;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 205;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 231;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 232;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 233;BA.debugLine="End Sub";
return "";
}
public String  _addwixrows(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
b4j.example.wixrow _i = null;
 //BA.debugLineNum = 93;BA.debugLine="Sub AddWixRows(lst As List)";
 //BA.debugLineNum = 94;BA.debugLine="For Each i As WixRow In lst";
{
final anywheresoftware.b4a.BA.IterableList group1 = _lst;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_i = (b4j.example.wixrow)(group1.Get(index1));
 //BA.debugLineNum = 95;BA.debugLine="AddRows(i.Item)";
_addrows(_i._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 }
};
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Form As WixElement";
_form = new b4j.example.wixelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private webix As BANanoObject";
_webix = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixform  _initialize(anywheresoftware.b4a.BA _ba,String _fid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(fID As String) As WixForm";
 //BA.debugLineNum = 10;BA.debugLine="ID = fID.tolowercase";
_id = _fid.toLowerCase();
 //BA.debugLineNum = 11;BA.debugLine="Form.Initialize(fID).SetView(\"form\")";
_form._initialize /*b4j.example.wixelement*/ (ba,_fid)._setview /*b4j.example.wixelement*/ ("form");
 //BA.debugLineNum = 12;BA.debugLine="webix.Initialize(\"webix\")";
_webix.Initialize((Object)("webix"));
 //BA.debugLineNum = 13;BA.debugLine="Return Me";
if (true) return (b4j.example.wixform)(this);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 220;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 221;BA.debugLine="Return Form.item";
if (true) return _form._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 222;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixform  _setborderless(boolean _b) throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Sub SetBorderless(b As Boolean) As WixForm";
 //BA.debugLineNum = 33;BA.debugLine="Form.SetAttr(\"borderless\", b)";
_form._setattr /*b4j.example.wixelement*/ ("borderless",(Object)(_b));
 //BA.debugLineNum = 34;BA.debugLine="Return Me";
if (true) return (b4j.example.wixform)(this);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixform  _setcomplexdata(boolean _b) throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Sub SetComplexData(b As Boolean) As WixForm";
 //BA.debugLineNum = 38;BA.debugLine="Form.SetAttr(\"complexData\", b)";
_form._setattr /*b4j.example.wixelement*/ ("complexData",(Object)(_b));
 //BA.debugLineNum = 39;BA.debugLine="Return Me";
if (true) return (b4j.example.wixform)(this);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixform  _setdefaultalign(String _a) throws Exception{
 //BA.debugLineNum = 278;BA.debugLine="Sub SetDefaultAlign(a As String) As WixForm";
 //BA.debugLineNum = 279;BA.debugLine="Form.SetDefaultAlign(a)";
_form._setdefaultalign /*b4j.example.wixelement*/ (_a);
 //BA.debugLineNum = 280;BA.debugLine="Return Me";
if (true) return (b4j.example.wixform)(this);
 //BA.debugLineNum = 281;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixform  _setdefaultbottompadding(int _w) throws Exception{
 //BA.debugLineNum = 296;BA.debugLine="Sub SetDefaultBottomPadding(w As Int) As WixForm";
 //BA.debugLineNum = 297;BA.debugLine="Form.SetDefaultBottomPadding(w)";
_form._setdefaultbottompadding /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 298;BA.debugLine="Return Me";
if (true) return (b4j.example.wixform)(this);
 //BA.debugLineNum = 299;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixform  _setdefaultheight(int _h) throws Exception{
 //BA.debugLineNum = 290;BA.debugLine="Sub SetDefaultHeight(h As Int) As WixForm";
 //BA.debugLineNum = 291;BA.debugLine="Form.SetDefaultHeight(h)";
_form._setdefaultheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 292;BA.debugLine="Return Me";
if (true) return (b4j.example.wixform)(this);
 //BA.debugLineNum = 293;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixform  _setdefaultlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 259;BA.debugLine="Sub SetDefaultLabelAlign(a As String) As WixForm";
 //BA.debugLineNum = 260;BA.debugLine="Form.SetDefaultLabelAlign(a)";
_form._setdefaultlabelalign /*b4j.example.wixelement*/ (_a);
 //BA.debugLineNum = 261;BA.debugLine="Return Me";
if (true) return (b4j.example.wixform)(this);
 //BA.debugLineNum = 262;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixform  _setdefaultlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 272;BA.debugLine="Sub SetDefaultLabelPosition(p As String) As WixFor";
 //BA.debugLineNum = 273;BA.debugLine="Form.SetDefaultLabelPosition(p)";
_form._setdefaultlabelposition /*b4j.example.wixelement*/ (_p);
 //BA.debugLineNum = 274;BA.debugLine="Return Me";
if (true) return (b4j.example.wixform)(this);
 //BA.debugLineNum = 275;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixform  _setdefaultlabelwidth(int _a) throws Exception{
 //BA.debugLineNum = 265;BA.debugLine="Sub SetDefaultLabelWidth(a As Int) As WixForm";
 //BA.debugLineNum = 266;BA.debugLine="Form.SetDefaultLabelWidth(a)";
_form._setdefaultlabelwidth /*b4j.example.wixelement*/ (_a);
 //BA.debugLineNum = 267;BA.debugLine="Return Me";
if (true) return (b4j.example.wixform)(this);
 //BA.debugLineNum = 268;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixform  _setdefaulttype(String _a) throws Exception{
 //BA.debugLineNum = 253;BA.debugLine="Sub SetDefaultType(a As String) As WixForm";
 //BA.debugLineNum = 254;BA.debugLine="Form.SetDefaultType(a)";
_form._setdefaulttype /*b4j.example.wixelement*/ (_a);
 //BA.debugLineNum = 255;BA.debugLine="Return Me";
if (true) return (b4j.example.wixform)(this);
 //BA.debugLineNum = 256;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixform  _setdefaultview(String _a) throws Exception{
 //BA.debugLineNum = 247;BA.debugLine="Sub SetDefaultView(a As String) As WixForm";
 //BA.debugLineNum = 248;BA.debugLine="Form.SetDefaultView(a)";
_form._setdefaultview /*b4j.example.wixelement*/ (_a);
 //BA.debugLineNum = 249;BA.debugLine="Return Me";
if (true) return (b4j.example.wixform)(this);
 //BA.debugLineNum = 250;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixform  _setdefaultwidth(int _w) throws Exception{
 //BA.debugLineNum = 284;BA.debugLine="Sub SetDefaultWidth(w As Int) As WixForm";
 //BA.debugLineNum = 285;BA.debugLine="Form.SetDefaultWidth(w)";
_form._setdefaultwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 286;BA.debugLine="Return Me";
if (true) return (b4j.example.wixform)(this);
 //BA.debugLineNum = 287;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixform  _setelementsconfigjson(String _json) throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub SetElementsConfigJSON(json As String) As WixFo";
 //BA.debugLineNum = 22;BA.debugLine="Form.SetElementsConfigJSON(json)";
_form._setelementsconfigjson /*b4j.example.wixelement*/ (_json);
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return (b4j.example.wixform)(this);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixform  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 214;BA.debugLine="Sub SetHeight(h As Object) As WixForm";
 //BA.debugLineNum = 215;BA.debugLine="Form.SetHeight(h)";
_form._setheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 216;BA.debugLine="Return Me";
if (true) return (b4j.example.wixform)(this);
 //BA.debugLineNum = 217;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixform  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 100;BA.debugLine="Sub SetMap(m As Map) As WixForm";
 //BA.debugLineNum = 101;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 102;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 103;BA.debugLine="Form.SetAttr(strKey,	strVal)";
_form._setattr /*b4j.example.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 105;BA.debugLine="Return Me";
if (true) return (b4j.example.wixform)(this);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixform  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Sub SetMargin(margin As Object) As WixForm";
 //BA.debugLineNum = 50;BA.debugLine="Form.SetMargin(margin)";
_form._setmargin /*b4j.example.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 51;BA.debugLine="Return Me";
if (true) return (b4j.example.wixform)(this);
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixform  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub SetMinHeight(h As Int) As WixForm";
 //BA.debugLineNum = 81;BA.debugLine="Form.SetMinHeight(h)";
_form._setminheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 82;BA.debugLine="Return Me";
if (true) return (b4j.example.wixform)(this);
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixform  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Sub SetMinWidth(w As Int) As WixForm";
 //BA.debugLineNum = 75;BA.debugLine="Form.SetMinWidth(w)";
_form._setminwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 76;BA.debugLine="Return Me";
if (true) return (b4j.example.wixform)(this);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixform  _setname(String _n) throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Sub SetName(n As String) As WixForm";
 //BA.debugLineNum = 56;BA.debugLine="Form.SetName(n)";
_form._setname /*b4j.example.wixelement*/ (_n);
 //BA.debugLineNum = 57;BA.debugLine="Return Me";
if (true) return (b4j.example.wixform)(this);
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixform  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Sub SetPadding(padding As Object) As WixForm";
 //BA.debugLineNum = 44;BA.debugLine="Form.SetPadding(padding)";
_form._setpadding /*b4j.example.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 45;BA.debugLine="Return Me";
if (true) return (b4j.example.wixform)(this);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixform  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub SetResponsive(b As Object) As WixForm";
 //BA.debugLineNum = 62;BA.debugLine="Form.SetResponsive(b)";
_form._setresponsive /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 63;BA.debugLine="Return Me";
if (true) return (b4j.example.wixform)(this);
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixform  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixForm";
 //BA.debugLineNum = 68;BA.debugLine="Form.SetResponsiveCell(b)";
_form._setresponsivecell /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 69;BA.debugLine="Return Me";
if (true) return (b4j.example.wixform)(this);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixform  _setscroll(Object _b) throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Sub SetScroll(b As Object) As WixForm";
 //BA.debugLineNum = 124;BA.debugLine="Form.SetAttr(\"scroll\", b)";
_form._setattr /*b4j.example.wixelement*/ ("scroll",_b);
 //BA.debugLineNum = 125;BA.debugLine="Return Me";
if (true) return (b4j.example.wixform)(this);
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixform  _setscrollx(Object _b) throws Exception{
 //BA.debugLineNum = 116;BA.debugLine="Sub SetScrollX(b As Object) As WixForm";
 //BA.debugLineNum = 117;BA.debugLine="Form.SetAttr(\"scrollX\", b)";
_form._setattr /*b4j.example.wixelement*/ ("scrollX",_b);
 //BA.debugLineNum = 118;BA.debugLine="Return Me";
if (true) return (b4j.example.wixform)(this);
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixform  _setscrolly(Object _b) throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Sub SetScrollY(b As Object) As WixForm";
 //BA.debugLineNum = 111;BA.debugLine="Form.SetAttr(\"scrollY\", b)";
_form._setattr /*b4j.example.wixelement*/ ("scrollY",_b);
 //BA.debugLineNum = 112;BA.debugLine="Return Me";
if (true) return (b4j.example.wixform)(this);
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixform  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 26;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixForm";
 //BA.debugLineNum = 27;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 28;BA.debugLine="Form.SetTemplate(os)";
_form._settemplate /*b4j.example.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 29;BA.debugLine="Return Me";
if (true) return (b4j.example.wixform)(this);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixform  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 172;BA.debugLine="Sub SetTooltip(tt As String) As WixForm";
 //BA.debugLineNum = 173;BA.debugLine="Form.SetTooltip(tt)";
_form._settooltip /*b4j.example.wixelement*/ (_tt);
 //BA.debugLineNum = 174;BA.debugLine="Return Me";
if (true) return (b4j.example.wixform)(this);
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixform  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 208;BA.debugLine="Sub SetWidth(w As Object) As WixForm";
 //BA.debugLineNum = 209;BA.debugLine="Form.SetWidth(w)";
_form._setwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 210;BA.debugLine="Return Me";
if (true) return (b4j.example.wixform)(this);
 //BA.debugLineNum = 211;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
