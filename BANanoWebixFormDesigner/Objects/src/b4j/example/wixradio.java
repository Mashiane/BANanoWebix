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
public b4j.example.wixradio  _addoption(String _sid,String _svalue) throws Exception{
anywheresoftware.b4a.objects.collections.Map _sug = null;
 //BA.debugLineNum = 109;BA.debugLine="Sub AddOption(sID As String, sValue As String) As";
 //BA.debugLineNum = 110;BA.debugLine="Dim sug As Map = CreateMap()";
_sug = new anywheresoftware.b4a.objects.collections.Map();
_sug = __c.createMap(new Object[] {});
 //BA.debugLineNum = 111;BA.debugLine="sug.Put(\"id\", sID)";
_sug.Put((Object)("id"),(Object)(_sid));
 //BA.debugLineNum = 112;BA.debugLine="sug.Put(\"value\", sValue)";
_sug.Put((Object)("value"),(Object)(_svalue));
 //BA.debugLineNum = 113;BA.debugLine="Options.Add(sug)";
_options.Add((Object)(_sug.getObject()));
 //BA.debugLineNum = 114;BA.debugLine="Return Me";
if (true) return (b4j.example.wixradio)(this);
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return null;
}
public String  _addtocolumns(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 180;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 181;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 185;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 186;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 187;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.example.wixform _frm) throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 86;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 175;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 176;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 177;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 72;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 73;BA.debugLine="Radio.SetAttr(\"options\", Options)";
_radio._setattr /*b4j.example.wixelement*/ ("options",(Object)(_options.getObject()));
 //BA.debugLineNum = 74;BA.debugLine="Radio.SetAttr(\"vertical\", Vertical)";
_radio._setattr /*b4j.example.wixelement*/ ("vertical",(Object)(_vertical));
 //BA.debugLineNum = 75;BA.debugLine="Return Radio.item";
if (true) return _radio._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixradio  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 162;BA.debugLine="Sub SetAlignCenter(r As String) As WixRadio 'ignor";
 //BA.debugLineNum = 163;BA.debugLine="Radio.setAligncenter(\"\")";
_radio._setaligncenter /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 164;BA.debugLine="Return Me";
if (true) return (b4j.example.wixradio)(this);
 //BA.debugLineNum = 165;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixradio  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 168;BA.debugLine="Sub SetAlignLeft(r As String) As WixRadio 'ignore";
 //BA.debugLineNum = 169;BA.debugLine="Radio.SetAlignleft(\"\")";
_radio._setalignleft /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 170;BA.debugLine="Return Me";
if (true) return (b4j.example.wixradio)(this);
 //BA.debugLineNum = 171;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixradio  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 156;BA.debugLine="Sub SetAlignRight(r As String) As WixRadio 'ignore";
 //BA.debugLineNum = 157;BA.debugLine="Radio.setAlignright(\"\")";
_radio._setalignright /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 158;BA.debugLine="Return Me";
if (true) return (b4j.example.wixradio)(this);
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixradio  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 124;BA.debugLine="Sub SetLabel(l As String) As WixRadio";
 //BA.debugLineNum = 125;BA.debugLine="Radio.SetLabel(l)";
_radio._setlabel /*b4j.example.wixelement*/ (_l);
 //BA.debugLineNum = 126;BA.debugLine="Return Me";
if (true) return (b4j.example.wixradio)(this);
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixradio  _setlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 137;BA.debugLine="Sub SetLabelAlign(a As String) As WixRadio";
 //BA.debugLineNum = 138;BA.debugLine="Radio.SetLabelAlign(a)";
_radio._setlabelalign /*b4j.example.wixelement*/ (_a);
 //BA.debugLineNum = 139;BA.debugLine="Return Me";
if (true) return (b4j.example.wixradio)(this);
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixradio  _setlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 143;BA.debugLine="Sub SetLabelPosition(p As String) As WixRadio";
 //BA.debugLineNum = 144;BA.debugLine="Radio.SetLabelPosition(p)";
_radio._setlabelposition /*b4j.example.wixelement*/ (_p);
 //BA.debugLineNum = 145;BA.debugLine="Return Me";
if (true) return (b4j.example.wixradio)(this);
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixradio  _setlabelwidth(int _w) throws Exception{
 //BA.debugLineNum = 149;BA.debugLine="Sub SetLabelWidth(w As Int) As WixRadio";
 //BA.debugLineNum = 150;BA.debugLine="Radio.SetLabelWidth(w)";
_radio._setlabelwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 151;BA.debugLine="Return Me";
if (true) return (b4j.example.wixradio)(this);
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixradio  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 19;BA.debugLine="Sub SetMap(m As Map) As WixRadio";
 //BA.debugLineNum = 20;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 21;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 22;BA.debugLine="Radio.SetAttr(strKey,	strVal)";
_radio._setattr /*b4j.example.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 24;BA.debugLine="Return Me";
if (true) return (b4j.example.wixradio)(this);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixradio  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub SetMinHeight(h As Int) As WixRadio";
 //BA.debugLineNum = 61;BA.debugLine="Radio.SetMinHeight(h)";
_radio._setminheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (b4j.example.wixradio)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixradio  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Sub SetMinWidth(w As Int) As WixRadio";
 //BA.debugLineNum = 55;BA.debugLine="Radio.SetMinWidth(w)";
_radio._setminwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 56;BA.debugLine="Return Me";
if (true) return (b4j.example.wixradio)(this);
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixradio  _setname(String _n) throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Sub SetName(n As String) As WixRadio";
 //BA.debugLineNum = 36;BA.debugLine="Radio.SetName(n)";
_radio._setname /*b4j.example.wixelement*/ (_n);
 //BA.debugLineNum = 37;BA.debugLine="Return Me";
if (true) return (b4j.example.wixradio)(this);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixradio  _setoptions(anywheresoftware.b4a.objects.collections.List _opt) throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Sub SetOptions(opt As List) As WixRadio";
 //BA.debugLineNum = 91;BA.debugLine="Options = opt";
_options = _opt;
 //BA.debugLineNum = 92;BA.debugLine="Return Me";
if (true) return (b4j.example.wixradio)(this);
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixradio  _setoptionsjson(String _json) throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Sub SetOptionsJSON(json As String) As WixRadio";
 //BA.debugLineNum = 96;BA.debugLine="Radio.SetOptionsJSON(json)";
_radio._setoptionsjson /*b4j.example.wixelement*/ (_json);
 //BA.debugLineNum = 97;BA.debugLine="Return Me";
if (true) return (b4j.example.wixradio)(this);
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixradio  _setoptionsmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _mk = "";
Object _mv = null;
 //BA.debugLineNum = 100;BA.debugLine="Sub SetOptionsMAP(m As Map) As WixRadio";
 //BA.debugLineNum = 101;BA.debugLine="For Each mk As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_mk = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 102;BA.debugLine="Dim mv As Object = m.Get(mk)";
_mv = _m.Get((Object)(_mk));
 //BA.debugLineNum = 103;BA.debugLine="AddOption(mk, mv)";
_addoption(_mk,BA.ObjectToString(_mv));
 }
};
 //BA.debugLineNum = 105;BA.debugLine="Return Me";
if (true) return (b4j.example.wixradio)(this);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixradio  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Sub SetResponsive(b As Object) As WixRadio";
 //BA.debugLineNum = 42;BA.debugLine="Radio.SetResponsive(b)";
_radio._setresponsive /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 43;BA.debugLine="Return Me";
if (true) return (b4j.example.wixradio)(this);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixradio  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixRadio";
 //BA.debugLineNum = 48;BA.debugLine="Radio.SetResponsiveCell(b)";
_radio._setresponsivecell /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (b4j.example.wixradio)(this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixradio  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 80;BA.debugLine="Radio.SetStyle(prop,val)";
_radio._setstyle /*b4j.example.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 81;BA.debugLine="Return Me";
if (true) return (b4j.example.wixradio)(this);
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixradio  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 28;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixRadio";
 //BA.debugLineNum = 29;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 30;BA.debugLine="Radio.SetTemplate(os)";
_radio._settemplate /*b4j.example.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.example.wixradio)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixradio  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub SetTooltip(tt As String) As WixRadio";
 //BA.debugLineNum = 67;BA.debugLine="Radio.SetTooltip(tt)";
_radio._settooltip /*b4j.example.wixelement*/ (_tt);
 //BA.debugLineNum = 68;BA.debugLine="Return Me";
if (true) return (b4j.example.wixradio)(this);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixradio  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Sub SetValue(v As String) As WixRadio";
 //BA.debugLineNum = 119;BA.debugLine="Radio.SetValue(v)";
_radio._setvalue /*b4j.example.wixelement*/ (_v);
 //BA.debugLineNum = 120;BA.debugLine="Return Me";
if (true) return (b4j.example.wixradio)(this);
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixradio  _setvertical(boolean _b) throws Exception{
 //BA.debugLineNum = 130;BA.debugLine="Sub SetVertical(b As Boolean) As WixRadio";
 //BA.debugLineNum = 131;BA.debugLine="Vertical = b";
_vertical = _b;
 //BA.debugLineNum = 132;BA.debugLine="Return Me";
if (true) return (b4j.example.wixradio)(this);
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
