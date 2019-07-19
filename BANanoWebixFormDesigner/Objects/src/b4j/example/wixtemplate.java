package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixtemplate extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixtemplate", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixtemplate.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _template = null;
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
public String  _addcolumns(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Sub AddColumns(itm As Map)";
 //BA.debugLineNum = 21;BA.debugLine="Template.AddColumns(itm)";
_template._addcolumns /*b4j.example.wixelement*/ (_itm);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixtemplate  _addrow(b4j.example.wixrow _r) throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Sub AddRow(r As WixRow) As WixTemplate";
 //BA.debugLineNum = 69;BA.debugLine="AddRows(r.Item)";
_addrows(_r._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 70;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtemplate)(this);
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return null;
}
public String  _addrowitems(anywheresoftware.b4a.objects.collections.List _items) throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
 //BA.debugLineNum = 85;BA.debugLine="Sub AddRowItems(items As List)";
 //BA.debugLineNum = 86;BA.debugLine="For Each m As Map In items";
_m = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group1 = _items;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group1.Get(index1)));
 //BA.debugLineNum = 87;BA.debugLine="AddRows(m)";
_addrows(_m);
 }
};
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return "";
}
public String  _addrows(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub AddRows(itm As Map)";
 //BA.debugLineNum = 65;BA.debugLine="Template.AddRows(itm)";
_template._addrows /*b4j.example.wixelement*/ (_itm);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return "";
}
public String  _addtocolumns(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 189;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 190;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 191;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 194;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 195;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 196;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 184;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 185;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 186;BA.debugLine="End Sub";
return "";
}
public String  _addwixrows(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
b4j.example.wixrow _i = null;
 //BA.debugLineNum = 92;BA.debugLine="Sub AddWixRows(lst As List)";
 //BA.debugLineNum = 93;BA.debugLine="For Each i As WixRow In lst";
{
final anywheresoftware.b4a.BA.IterableList group1 = _lst;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_i = (b4j.example.wixrow)(group1.Get(index1));
 //BA.debugLineNum = 94;BA.debugLine="AddRow(i)";
_addrow(_i);
 }
};
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Template As WixElement";
_template = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixtemplate  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize(sid As String) As WixTemplat";
 //BA.debugLineNum = 9;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 10;BA.debugLine="Template.Initialize(ID).setview(\"template\")";
_template._initialize /*b4j.example.wixelement*/ (ba,_id)._setview /*b4j.example.wixelement*/ ("template");
 //BA.debugLineNum = 11;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtemplate)(this);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 16;BA.debugLine="Return Template.item";
if (true) return _template._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtemplate  _setautowidth(boolean _b) throws Exception{
 //BA.debugLineNum = 111;BA.debugLine="Sub SetAutoWidth(b As Boolean) As WixTemplate";
 //BA.debugLineNum = 112;BA.debugLine="Template.SetAttr(\"autowidth\", b)";
_template._setattr /*b4j.example.wixelement*/ ("autowidth",(Object)(_b));
 //BA.debugLineNum = 113;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtemplate)(this);
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtemplate  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Sub SetHeight(h As Object) As WixTemplate";
 //BA.debugLineNum = 100;BA.debugLine="Template.SetAttr(\"height\", h)";
_template._setattr /*b4j.example.wixelement*/ ("height",_h);
 //BA.debugLineNum = 101;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtemplate)(this);
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtemplate  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 75;BA.debugLine="Sub SetMap(m As Map) As WixTemplate";
 //BA.debugLineNum = 76;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 77;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 78;BA.debugLine="Template.SetAttr(strKey,	strVal)";
_template._setattr /*b4j.example.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 80;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtemplate)(this);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtemplate  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub SetMinHeight(h As Int) As WixTemplate";
 //BA.debugLineNum = 59;BA.debugLine="Template.SetMinHeight(h)";
_template._setminheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 60;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtemplate)(this);
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtemplate  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub SetMinWidth(w As Int) As WixTemplate";
 //BA.debugLineNum = 53;BA.debugLine="Template.SetMinWidth(w)";
_template._setminwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtemplate)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtemplate  _setname(String _n) throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Sub SetName(n As String) As WixTemplate";
 //BA.debugLineNum = 33;BA.debugLine="Template.SetName(n)";
_template._setname /*b4j.example.wixelement*/ (_n);
 //BA.debugLineNum = 34;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtemplate)(this);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtemplate  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Sub SetResponsive(b As Object) As WixTemplate";
 //BA.debugLineNum = 40;BA.debugLine="Template.SetResponsive(b)";
_template._setresponsive /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 41;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtemplate)(this);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtemplate  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixTemplate";
 //BA.debugLineNum = 46;BA.debugLine="Template.SetResponsiveCell(b)";
_template._setresponsivecell /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 47;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtemplate)(this);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtemplate  _setscroll(Object _b) throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Sub SetScroll(b As Object) As WixTemplate";
 //BA.debugLineNum = 124;BA.debugLine="Template.SetAttr(\"scroll\", b)";
_template._setattr /*b4j.example.wixelement*/ ("scroll",_b);
 //BA.debugLineNum = 125;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtemplate)(this);
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtemplate  _setscrollxy(boolean _b) throws Exception{
 //BA.debugLineNum = 129;BA.debugLine="Sub SetScrollXY(b As Boolean) As WixTemplate  'ign";
 //BA.debugLineNum = 130;BA.debugLine="SetScroll(\"xy\")";
_setscroll((Object)("xy"));
 //BA.debugLineNum = 131;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtemplate)(this);
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtemplate  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 141;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 142;BA.debugLine="Template.SetStyle(prop,val)";
_template._setstyle /*b4j.example.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 143;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtemplate)(this);
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtemplate  _settemplate(String _t) throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Sub SetTemplate(t As String) As WixTemplate";
 //BA.debugLineNum = 118;BA.debugLine="Template.SetAttr(\"template\", t)";
_template._setattr /*b4j.example.wixelement*/ ("template",(Object)(_t));
 //BA.debugLineNum = 119;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtemplate)(this);
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtemplate  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 25;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixTemplat";
 //BA.debugLineNum = 26;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 27;BA.debugLine="Template.SetTemplate(os)";
_template._settemplate /*b4j.example.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 28;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtemplate)(this);
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtemplate  _settype(String _t) throws Exception{
 //BA.debugLineNum = 135;BA.debugLine="Sub SetType(t As String) As WixTemplate";
 //BA.debugLineNum = 136;BA.debugLine="Template.SetType(t)";
_template._settype /*b4j.example.wixelement*/ (_t);
 //BA.debugLineNum = 137;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtemplate)(this);
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtemplate  _settypeclean(String _a) throws Exception{
 //BA.debugLineNum = 147;BA.debugLine="Sub SetTypeClean(a As String) As WixTemplate  'ign";
 //BA.debugLineNum = 148;BA.debugLine="SetType(\"clean\")";
_settype("clean");
 //BA.debugLineNum = 149;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtemplate)(this);
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtemplate  _settypeform(String _a) throws Exception{
 //BA.debugLineNum = 177;BA.debugLine="Sub SetTypeForm(a As String) As WixTemplate  'igno";
 //BA.debugLineNum = 178;BA.debugLine="SetType(\"form\")";
_settype("form");
 //BA.debugLineNum = 179;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtemplate)(this);
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtemplate  _settypehead(String _a) throws Exception{
 //BA.debugLineNum = 171;BA.debugLine="Sub SetTypeHead(a As String) As WixTemplate   'ign";
 //BA.debugLineNum = 172;BA.debugLine="SetType(\"head\")";
_settype("head");
 //BA.debugLineNum = 173;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtemplate)(this);
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtemplate  _settypeline(String _a) throws Exception{
 //BA.debugLineNum = 153;BA.debugLine="Sub SetTypeLine(a As String) As WixTemplate   'ign";
 //BA.debugLineNum = 154;BA.debugLine="SetType(\"line\")";
_settype("line");
 //BA.debugLineNum = 155;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtemplate)(this);
 //BA.debugLineNum = 156;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtemplate  _settypespace(String _a) throws Exception{
 //BA.debugLineNum = 165;BA.debugLine="Sub SetTypeSpace(a As String) As WixTemplate   'ig";
 //BA.debugLineNum = 166;BA.debugLine="SetType(\"space\")";
_settype("space");
 //BA.debugLineNum = 167;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtemplate)(this);
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtemplate  _settypewide(String _a) throws Exception{
 //BA.debugLineNum = 159;BA.debugLine="Sub SetTypeWide(a As String) As WixTemplate   'ign";
 //BA.debugLineNum = 160;BA.debugLine="SetType(\"wide\")";
_settype("wide");
 //BA.debugLineNum = 161;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtemplate)(this);
 //BA.debugLineNum = 162;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtemplate  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 105;BA.debugLine="Sub SetWidth(w As Object) As WixTemplate";
 //BA.debugLineNum = 106;BA.debugLine="Template.SetAttr(\"width\", w)";
_template._setattr /*b4j.example.wixelement*/ ("width",_w);
 //BA.debugLineNum = 107;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtemplate)(this);
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
