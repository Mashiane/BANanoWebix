package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixform extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixform", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixform.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _form = null;
public String _id = "";
public com.ab.banano.BANanoObject _webix = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public String  _addcolumn(b4j.Mashy.BANanoWebixDemo.wixcolumn _c) throws Exception{
 //BA.debugLineNum = 249;BA.debugLine="Sub AddColumn(c As WixColumn)";
 //BA.debugLineNum = 250;BA.debugLine="Form.AddColumns(c.Item)";
_form._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_c._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 251;BA.debugLine="End Sub";
return "";
}
public String  _addcolumns(anywheresoftware.b4a.objects.collections.Map _i) throws Exception{
 //BA.debugLineNum = 254;BA.debugLine="Sub AddColumns(i As Map)";
 //BA.debugLineNum = 255;BA.debugLine="Form.AddColumns(i)";
_form._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_i);
 //BA.debugLineNum = 256;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixform  _addcolumnsresizer(String _s) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixresizer _r = null;
 //BA.debugLineNum = 96;BA.debugLine="Sub AddColumnsResizer(s As String) As WixForm   'i";
 //BA.debugLineNum = 97;BA.debugLine="Dim r As WixResizer";
_r = new b4j.Mashy.BANanoWebixDemo.wixresizer();
 //BA.debugLineNum = 98;BA.debugLine="r.Initialize(\"\")";
_r._initialize /*b4j.Mashy.BANanoWebixDemo.wixresizer*/ (ba,"");
 //BA.debugLineNum = 99;BA.debugLine="AddColumns(r.Item)";
_addcolumns(_r._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 100;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _addcolumnsspacer(String _b) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixelement _s = null;
 //BA.debugLineNum = 87;BA.debugLine="Sub AddColumnsSpacer(b As String) As WixForm    'i";
 //BA.debugLineNum = 88;BA.debugLine="Dim s As WixElement";
_s = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 89;BA.debugLine="s.Initialize(\"\").SetView(\"spacer\")";
_s._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,"")._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("spacer");
 //BA.debugLineNum = 90;BA.debugLine="AddColumns(s.item)";
_addcolumns(_s._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 91;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return null;
}
public String  _additem(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 291;BA.debugLine="Sub AddItem(itm As Map)";
 //BA.debugLineNum = 292;BA.debugLine="Form.AddItem(itm)";
_form._additem /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_itm);
 //BA.debugLineNum = 293;BA.debugLine="End Sub";
return "";
}
public String  _addrow(b4j.Mashy.BANanoWebixDemo.wixrow _wxel) throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Sub AddRow(wxEL As WixRow)";
 //BA.debugLineNum = 68;BA.debugLine="AddRows(wxEL.Item)";
_addrows(_wxel._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return "";
}
public String  _addrowitems(anywheresoftware.b4a.objects.collections.List _items) throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
 //BA.debugLineNum = 157;BA.debugLine="Sub AddRowItems(items As List)";
 //BA.debugLineNum = 158;BA.debugLine="For Each m As Map In items";
_m = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group1 = _items;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group1.Get(index1)));
 //BA.debugLineNum = 159;BA.debugLine="AddRows(m)";
_addrows(_m);
 }
};
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return "";
}
public String  _addrows(anywheresoftware.b4a.objects.collections.Map _i) throws Exception{
 //BA.debugLineNum = 259;BA.debugLine="Sub AddRows(i As Map)";
 //BA.debugLineNum = 260;BA.debugLine="Form.Rows.Add(i)";
_form._rows /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_i.getObject()));
 //BA.debugLineNum = 261;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixform  _addrowsresizer(String _s) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixresizer _r = null;
 //BA.debugLineNum = 79;BA.debugLine="Sub AddRowsResizer(s As String) As WixForm   'igno";
 //BA.debugLineNum = 80;BA.debugLine="Dim r As WixResizer";
_r = new b4j.Mashy.BANanoWebixDemo.wixresizer();
 //BA.debugLineNum = 81;BA.debugLine="r.Initialize(\"\")";
_r._initialize /*b4j.Mashy.BANanoWebixDemo.wixresizer*/ (ba,"");
 //BA.debugLineNum = 82;BA.debugLine="AddRows(r.Item)";
_addrows(_r._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 83;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _addrowsspacer(String _r) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixelement _s = null;
 //BA.debugLineNum = 72;BA.debugLine="Sub AddRowsSpacer(r As String) As WixForm   'ignor";
 //BA.debugLineNum = 73;BA.debugLine="Dim s As WixElement";
_s = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 74;BA.debugLine="s.Initialize(\"\").SetView(\"spacer\")";
_s._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,"")._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("spacer");
 //BA.debugLineNum = 75;BA.debugLine="AddRows(s.item)";
_addrows(_s._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 76;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _addruleischecked(String _eid) throws Exception{
Object _ie = null;
 //BA.debugLineNum = 214;BA.debugLine="Sub AddRuleIsChecked(eID As String) As WixForm";
 //BA.debugLineNum = 215;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 216;BA.debugLine="Dim ie As Object = webix.GetField(\"rules\").GetFie";
_ie = (Object)(_webix.GetField("rules").GetField("isChecked"));
 //BA.debugLineNum = 217;BA.debugLine="Form.Rules.Put(eID, ie)";
_form._rules /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_eid),_ie);
 //BA.debugLineNum = 218;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 219;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _addruleisemail(String _eid) throws Exception{
Object _ie = null;
 //BA.debugLineNum = 200;BA.debugLine="Sub AddRuleIsEmail(eID As String) As WixForm";
 //BA.debugLineNum = 201;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 202;BA.debugLine="Dim ie As Object = webix.GetField(\"rules\").GetFie";
_ie = (Object)(_webix.GetField("rules").GetField("isEmail"));
 //BA.debugLineNum = 203;BA.debugLine="Form.Rules.Put(eID, ie)";
_form._rules /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_eid),_ie);
 //BA.debugLineNum = 204;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 205;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _addruleisemailorblank(String _eid) throws Exception{
Object _ie = null;
 //BA.debugLineNum = 235;BA.debugLine="Sub AddRuleIsEmailOrBlank(eID As String) As WixFor";
 //BA.debugLineNum = 236;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 237;BA.debugLine="Dim ie As Object = webix.GetField(\"rules\").GetFie";
_ie = (Object)(_webix.GetField("rules").GetField("isEmailOrBlank"));
 //BA.debugLineNum = 238;BA.debugLine="Form.Rules.Put(eID, ie)";
_form._rules /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_eid),_ie);
 //BA.debugLineNum = 239;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 240;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _addruleisnotempty(String _eid) throws Exception{
Object _ie = null;
 //BA.debugLineNum = 207;BA.debugLine="Sub AddRuleIsNotEmpty(eID As String) As WixForm";
 //BA.debugLineNum = 208;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 209;BA.debugLine="Dim ie As Object = webix.GetField(\"rules\").GetFie";
_ie = (Object)(_webix.GetField("rules").GetField("isNotEmpty"));
 //BA.debugLineNum = 210;BA.debugLine="Form.Rules.Put(eID, ie)";
_form._rules /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_eid),_ie);
 //BA.debugLineNum = 211;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 212;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _addruleisnumber(String _eid) throws Exception{
Object _ie = null;
 //BA.debugLineNum = 221;BA.debugLine="Sub AddRuleIsNumber(eID As String) As WixForm";
 //BA.debugLineNum = 222;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 223;BA.debugLine="Dim ie As Object = webix.GetField(\"rules\").GetFie";
_ie = (Object)(_webix.GetField("rules").GetField("isNumber"));
 //BA.debugLineNum = 224;BA.debugLine="Form.Rules.Put(eID, ie)";
_form._rules /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_eid),_ie);
 //BA.debugLineNum = 225;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 226;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _addruleisnumberorblank(String _eid) throws Exception{
Object _ie = null;
 //BA.debugLineNum = 228;BA.debugLine="Sub AddRuleIsNumberOrBlank(eID As String) As WixFo";
 //BA.debugLineNum = 229;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 230;BA.debugLine="Dim ie As Object = webix.GetField(\"rules\").GetFie";
_ie = (Object)(_webix.GetField("rules").GetField("isNumberOrBlank"));
 //BA.debugLineNum = 231;BA.debugLine="Form.Rules.Put(eID, ie)";
_form._rules /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_eid),_ie);
 //BA.debugLineNum = 232;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 233;BA.debugLine="End Sub";
return null;
}
public String  _addtocolumn(b4j.Mashy.BANanoWebixDemo.wixcolumn _c) throws Exception{
 //BA.debugLineNum = 264;BA.debugLine="Sub AddToColumn(c As WixColumn)";
 //BA.debugLineNum = 265;BA.debugLine="c.AddItem(Item)";
_c._additem /*String*/ (_item());
 //BA.debugLineNum = 266;BA.debugLine="End Sub";
return "";
}
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 302;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 303;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 304;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 307;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 308;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 309;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.Mashy.BANanoWebixDemo.wixform _frm) throws Exception{
 //BA.debugLineNum = 269;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 270;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 271;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 297;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 298;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 299;BA.debugLine="End Sub";
return "";
}
public String  _addwixrows(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixrow _i = null;
 //BA.debugLineNum = 164;BA.debugLine="Sub AddWixRows(lst As List)";
 //BA.debugLineNum = 165;BA.debugLine="For Each i As WixRow In lst";
{
final anywheresoftware.b4a.BA.IterableList group1 = _lst;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_i = (b4j.Mashy.BANanoWebixDemo.wixrow)(group1.Get(index1));
 //BA.debugLineNum = 166;BA.debugLine="AddRows(i.Item)";
_addrows(_i._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 }
};
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Form As WixElement";
_form = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private webix As BANanoObject";
_webix = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 6;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixform  _initialize(anywheresoftware.b4a.BA _ba,String _fid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(fID As String) As WixForm";
 //BA.debugLineNum = 12;BA.debugLine="ID = fID.tolowercase";
_id = _fid.toLowerCase();
 //BA.debugLineNum = 13;BA.debugLine="Form.Initialize(fID).SetView(\"form\")";
_form._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_fid)._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("form");
 //BA.debugLineNum = 14;BA.debugLine="webix.Initialize(\"webix\")";
_webix.Initialize((Object)("webix"));
 //BA.debugLineNum = 15;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 16;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 286;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 287;BA.debugLine="Return Form.item";
if (true) return _form._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 288;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 56;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixform  _setanimate(boolean _animate) throws Exception{
 //BA.debugLineNum = 366;BA.debugLine="Sub SetAnimate(animate As Boolean) As WixForm";
 //BA.debugLineNum = 367;BA.debugLine="Form.SetAttr(\"animate\", animate)";
_form._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("animate",(Object)(_animate));
 //BA.debugLineNum = 368;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 369;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 38;BA.debugLine="Sub SetAttributes(m As Map) As WixForm";
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
 //BA.debugLineNum = 41;BA.debugLine="Form.SetAttr(k,v)";
_form._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 43;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _setautoheight(boolean _autoheight) throws Exception{
 //BA.debugLineNum = 371;BA.debugLine="Sub SetAutoheight(autoheight As Boolean) As WixFor";
 //BA.debugLineNum = 372;BA.debugLine="Form.SetAttr(\"autoheight\", autoheight)";
_form._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("autoheight",(Object)(_autoheight));
 //BA.debugLineNum = 373;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 374;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _setborderless(boolean _b) throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Sub SetBorderless(b As Boolean) As WixForm";
 //BA.debugLineNum = 116;BA.debugLine="Form.SetAttr(\"borderless\", b)";
_form._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("borderless",(Object)(_b));
 //BA.debugLineNum = 117;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _setcols(Object _cols) throws Exception{
 //BA.debugLineNum = 376;BA.debugLine="Sub SetCols(cols As Object) As WixForm";
 //BA.debugLineNum = 377;BA.debugLine="Form.SetAttr(\"cols\", cols)";
_form._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("cols",_cols);
 //BA.debugLineNum = 378;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 379;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _setcomplexdata(boolean _b) throws Exception{
 //BA.debugLineNum = 120;BA.debugLine="Sub SetComplexData(b As Boolean) As WixForm";
 //BA.debugLineNum = 121;BA.debugLine="Form.SetAttr(\"complexData\", b)";
_form._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("complexData",(Object)(_b));
 //BA.debugLineNum = 122;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _setcontainer(Object _container) throws Exception{
 //BA.debugLineNum = 381;BA.debugLine="Sub SetContainer(container As Object) As WixForm";
 //BA.debugLineNum = 382;BA.debugLine="Form.SetAttr(\"container\", container)";
_form._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("container",_container);
 //BA.debugLineNum = 383;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 384;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _setcss(Object _css) throws Exception{
 //BA.debugLineNum = 386;BA.debugLine="Sub SetCss(css As Object) As WixForm";
 //BA.debugLineNum = 387;BA.debugLine="Form.SetAttr(\"css\", css)";
_form._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("css",_css);
 //BA.debugLineNum = 388;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 389;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _setdata(Object _data) throws Exception{
 //BA.debugLineNum = 391;BA.debugLine="Sub SetData(data As Object) As WixForm";
 //BA.debugLineNum = 392;BA.debugLine="Form.SetAttr(\"data\", data)";
_form._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("data",_data);
 //BA.debugLineNum = 393;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 394;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _setdatafeed(Object _datafeed) throws Exception{
 //BA.debugLineNum = 396;BA.debugLine="Sub SetDataFeed(dataFeed As Object) As WixForm";
 //BA.debugLineNum = 397;BA.debugLine="Form.SetAttr(\"dataFeed\", dataFeed)";
_form._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("dataFeed",_datafeed);
 //BA.debugLineNum = 398;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 399;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _setdatatype(Object _datatype) throws Exception{
 //BA.debugLineNum = 401;BA.debugLine="Sub SetDatatype(datatype As Object) As WixForm";
 //BA.debugLineNum = 402;BA.debugLine="Form.SetAttr(\"datatype\", datatype)";
_form._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("datatype",_datatype);
 //BA.debugLineNum = 403;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 404;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _setdefaultalign(String _a) throws Exception{
 //BA.debugLineNum = 344;BA.debugLine="Sub SetDefaultAlign(a As String) As WixForm";
 //BA.debugLineNum = 345;BA.debugLine="Form.SetDefaultAlign(a)";
_form._setdefaultalign /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_a);
 //BA.debugLineNum = 346;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 347;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _setdefaultbottompadding(int _w) throws Exception{
 //BA.debugLineNum = 361;BA.debugLine="Sub SetDefaultBottomPadding(w As Int) As WixForm";
 //BA.debugLineNum = 362;BA.debugLine="Form.SetDefaultBottomPadding(w)";
_form._setdefaultbottompadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 363;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 364;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _setdefaultheight(int _h) throws Exception{
 //BA.debugLineNum = 356;BA.debugLine="Sub SetDefaultHeight(h As Int) As WixForm";
 //BA.debugLineNum = 357;BA.debugLine="Form.SetDefaultHeight(h)";
_form._setdefaultheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 358;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 359;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _setdefaultlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 325;BA.debugLine="Sub SetDefaultLabelAlign(a As String) As WixForm";
 //BA.debugLineNum = 326;BA.debugLine="Form.SetDefaultLabelAlign(a)";
_form._setdefaultlabelalign /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_a);
 //BA.debugLineNum = 327;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 328;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _setdefaultlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 338;BA.debugLine="Sub SetDefaultLabelPosition(p As String) As WixFor";
 //BA.debugLineNum = 339;BA.debugLine="Form.SetDefaultLabelPosition(p)";
_form._setdefaultlabelposition /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_p);
 //BA.debugLineNum = 340;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 341;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _setdefaultlabelwidth(int _a) throws Exception{
 //BA.debugLineNum = 331;BA.debugLine="Sub SetDefaultLabelWidth(a As Int) As WixForm";
 //BA.debugLineNum = 332;BA.debugLine="Form.SetDefaultLabelWidth(a)";
_form._setdefaultlabelwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_a);
 //BA.debugLineNum = 333;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 334;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _setdefaulttype(String _a) throws Exception{
 //BA.debugLineNum = 319;BA.debugLine="Sub SetDefaultType(a As String) As WixForm";
 //BA.debugLineNum = 320;BA.debugLine="Form.SetDefaultType(a)";
_form._setdefaulttype /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_a);
 //BA.debugLineNum = 321;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 322;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _setdefaultview(String _a) throws Exception{
 //BA.debugLineNum = 313;BA.debugLine="Sub SetDefaultView(a As String) As WixForm";
 //BA.debugLineNum = 314;BA.debugLine="Form.SetDefaultView(a)";
_form._setdefaultview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_a);
 //BA.debugLineNum = 315;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 316;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _setdefaultwidth(int _w) throws Exception{
 //BA.debugLineNum = 350;BA.debugLine="Sub SetDefaultWidth(w As Int) As WixForm";
 //BA.debugLineNum = 351;BA.debugLine="Form.SetDefaultWidth(w)";
_form._setdefaultwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 352;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 353;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _setdisabled(boolean _disabled) throws Exception{
 //BA.debugLineNum = 406;BA.debugLine="Sub SetDisabled(disabled As Boolean) As WixForm";
 //BA.debugLineNum = 407;BA.debugLine="Form.SetAttr(\"disabled\", disabled)";
_form._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("disabled",(Object)(_disabled));
 //BA.debugLineNum = 408;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 409;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _setelements(Object _elements) throws Exception{
 //BA.debugLineNum = 411;BA.debugLine="Sub SetElements(elements As Object) As WixForm";
 //BA.debugLineNum = 412;BA.debugLine="Form.SetAttr(\"elements\", elements)";
_form._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("elements",_elements);
 //BA.debugLineNum = 413;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 414;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _setelementsconfig(Object _elementsconfig) throws Exception{
 //BA.debugLineNum = 416;BA.debugLine="Sub SetElementsConfig(elementsConfig As Object) As";
 //BA.debugLineNum = 417;BA.debugLine="Form.SetAttr(\"elementsConfig\", elementsConfig)";
_form._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("elementsConfig",_elementsconfig);
 //BA.debugLineNum = 418;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 419;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _setelementsconfigjson(String _json) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Sub SetElementsConfigJSON(json As String) As WixFo";
 //BA.debugLineNum = 104;BA.debugLine="Form.SetElementsConfigJSON(json)";
_form._setelementsconfigjson /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_json);
 //BA.debugLineNum = 105;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _setgravity(Object _gravity) throws Exception{
 //BA.debugLineNum = 421;BA.debugLine="Sub SetGravity(gravity As Object) As WixForm";
 //BA.debugLineNum = 422;BA.debugLine="Form.SetAttr(\"gravity\", gravity)";
_form._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("gravity",_gravity);
 //BA.debugLineNum = 423;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 424;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 280;BA.debugLine="Sub SetHeight(h As Object) As WixForm";
 //BA.debugLineNum = 281;BA.debugLine="Form.SetHeight(h)";
_form._setheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 282;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 283;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _sethidden(boolean _hidden) throws Exception{
 //BA.debugLineNum = 426;BA.debugLine="Sub SetHidden(hidden As Boolean) As WixForm";
 //BA.debugLineNum = 427;BA.debugLine="Form.SetAttr(\"hidden\", hidden)";
_form._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hidden",(Object)(_hidden));
 //BA.debugLineNum = 428;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 429;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _setisolate(boolean _isolate) throws Exception{
 //BA.debugLineNum = 431;BA.debugLine="Sub SetIsolate(isolate As Boolean) As WixForm";
 //BA.debugLineNum = 432;BA.debugLine="Form.SetAttr(\"isolate\", isolate)";
_form._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("isolate",(Object)(_isolate));
 //BA.debugLineNum = 433;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 434;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 171;BA.debugLine="Sub SetMap(m As Map) As WixForm";
 //BA.debugLineNum = 172;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 173;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 174;BA.debugLine="Form.SetAttr(strKey,	strVal)";
_form._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 176;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 177;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Sub SetMargin(margin As Object) As WixForm";
 //BA.debugLineNum = 27;BA.debugLine="Form.SetMargin(margin)";
_form._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 28;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _setmaxheight(Object _maxheight) throws Exception{
 //BA.debugLineNum = 436;BA.debugLine="Sub SetMaxHeight(maxHeight As Object) As WixForm";
 //BA.debugLineNum = 437;BA.debugLine="Form.SetAttr(\"maxHeight\", maxHeight)";
_form._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxHeight",_maxheight);
 //BA.debugLineNum = 438;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 439;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _setmaxwidth(Object _maxwidth) throws Exception{
 //BA.debugLineNum = 441;BA.debugLine="Sub SetMaxWidth(maxWidth As Object) As WixForm";
 //BA.debugLineNum = 442;BA.debugLine="Form.SetAttr(\"maxWidth\", maxWidth)";
_form._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxWidth",_maxwidth);
 //BA.debugLineNum = 443;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 444;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 151;BA.debugLine="Sub SetMinHeight(h As Int) As WixForm";
 //BA.debugLineNum = 152;BA.debugLine="Form.SetMinHeight(h)";
_form._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 153;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 145;BA.debugLine="Sub SetMinWidth(w As Int) As WixForm";
 //BA.debugLineNum = 146;BA.debugLine="Form.SetMinWidth(w)";
_form._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 147;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _setname(String _n) throws Exception{
 //BA.debugLineNum = 126;BA.debugLine="Sub SetName(n As String) As WixForm";
 //BA.debugLineNum = 127;BA.debugLine="Form.SetName(n)";
_form._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 128;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Sub SetPadding(padding As Object) As WixForm";
 //BA.debugLineNum = 21;BA.debugLine="Form.SetPadding(padding)";
_form._setpadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 22;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _setpaddingx(Object _paddingx) throws Exception{
 //BA.debugLineNum = 446;BA.debugLine="Sub SetPaddingX(paddingX As Object) As WixForm";
 //BA.debugLineNum = 447;BA.debugLine="Form.SetAttr(\"paddingX\", paddingX)";
_form._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("paddingX",_paddingx);
 //BA.debugLineNum = 448;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 449;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _setpaddingy(Object _paddingy) throws Exception{
 //BA.debugLineNum = 451;BA.debugLine="Sub SetPaddingY(paddingY As Object) As WixForm";
 //BA.debugLineNum = 452;BA.debugLine="Form.SetAttr(\"paddingY\", paddingY)";
_form._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("paddingY",_paddingy);
 //BA.debugLineNum = 453;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 454;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub SetParent(p As WixElement) As WixForm";
 //BA.debugLineNum = 61;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 132;BA.debugLine="Sub SetResponsive(b As Object) As WixForm";
 //BA.debugLineNum = 133;BA.debugLine="Form.SetResponsive(b)";
_form._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 134;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 138;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixForm";
 //BA.debugLineNum = 139;BA.debugLine="Form.SetResponsiveCell(b)";
_form._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 140;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _setrows(Object _rows) throws Exception{
 //BA.debugLineNum = 456;BA.debugLine="Sub SetRows(rows As Object) As WixForm";
 //BA.debugLineNum = 457;BA.debugLine="Form.SetAttr(\"rows\", rows)";
_form._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("rows",_rows);
 //BA.debugLineNum = 458;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 459;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _setrules(Object _rules) throws Exception{
 //BA.debugLineNum = 461;BA.debugLine="Sub SetRules(rules As Object) As WixForm";
 //BA.debugLineNum = 462;BA.debugLine="Form.SetAttr(\"rules\", rules)";
_form._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("rules",_rules);
 //BA.debugLineNum = 463;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 464;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _setscroll(Object _b) throws Exception{
 //BA.debugLineNum = 194;BA.debugLine="Sub SetScroll(b As Object) As WixForm";
 //BA.debugLineNum = 195;BA.debugLine="Form.SetAttr(\"scroll\", b)";
_form._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("scroll",_b);
 //BA.debugLineNum = 196;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 197;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _setscrollspeed(Object _scrollspeed) throws Exception{
 //BA.debugLineNum = 466;BA.debugLine="Sub SetScrollSpeed(scrollSpeed As Object) As WixFo";
 //BA.debugLineNum = 467;BA.debugLine="Form.SetAttr(\"scrollSpeed\", scrollSpeed)";
_form._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("scrollSpeed",_scrollspeed);
 //BA.debugLineNum = 468;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 469;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _setscrollx(Object _b) throws Exception{
 //BA.debugLineNum = 187;BA.debugLine="Sub SetScrollX(b As Object) As WixForm";
 //BA.debugLineNum = 188;BA.debugLine="Form.SetAttr(\"scrollX\", b)";
_form._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("scrollX",_b);
 //BA.debugLineNum = 189;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 190;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _setscrolly(Object _b) throws Exception{
 //BA.debugLineNum = 181;BA.debugLine="Sub SetScrollY(b As Object) As WixForm";
 //BA.debugLineNum = 182;BA.debugLine="Form.SetAttr(\"scrollY\", b)";
_form._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("scrollY",_b);
 //BA.debugLineNum = 183;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 33;BA.debugLine="Form.SetStyle(prop,sval)";
_form._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 34;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 46;BA.debugLine="Sub SetStyles(m As Map) As WixForm";
 //BA.debugLineNum = 47;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 48;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 49;BA.debugLine="Form.SetStyle(k,v)";
_form._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 51;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 108;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixForm";
 //BA.debugLineNum = 109;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 110;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 111;BA.debugLine="Form.SetTemplate(os)";
_form._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 112;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 243;BA.debugLine="Sub SetTooltip(tt As String) As WixForm";
 //BA.debugLineNum = 244;BA.debugLine="Form.SetTooltip(tt)";
_form._settooltip /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_tt);
 //BA.debugLineNum = 245;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 246;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _settype(Object _stype) throws Exception{
 //BA.debugLineNum = 471;BA.debugLine="Sub SetType(sType As Object) As WixForm";
 //BA.debugLineNum = 472;BA.debugLine="Form.SetAttr(\"type\", sType)";
_form._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("type",_stype);
 //BA.debugLineNum = 473;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 474;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _seturl(Object _url) throws Exception{
 //BA.debugLineNum = 476;BA.debugLine="Sub SetUrl(url As Object) As WixForm";
 //BA.debugLineNum = 477;BA.debugLine="Form.SetAttr(\"url\", url)";
_form._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("url",_url);
 //BA.debugLineNum = 478;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 479;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _setvisiblebatch(Object _visiblebatch) throws Exception{
 //BA.debugLineNum = 481;BA.debugLine="Sub SetVisibleBatch(visibleBatch As Object) As Wix";
 //BA.debugLineNum = 482;BA.debugLine="Form.SetAttr(\"visibleBatch\", visibleBatch)";
_form._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("visibleBatch",_visiblebatch);
 //BA.debugLineNum = 483;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 484;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 274;BA.debugLine="Sub SetWidth(w As Object) As WixForm";
 //BA.debugLineNum = 275;BA.debugLine="Form.SetWidth(w)";
_form._setwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 276;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixform)(this);
 //BA.debugLineNum = 277;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
