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
public anywheresoftware.b4a.objects.collections.List _options = null;
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
public b4j.example.wixrichselect  _addoption(String _sid,String _svalue) throws Exception{
anywheresoftware.b4a.objects.collections.Map _sug = null;
 //BA.debugLineNum = 113;BA.debugLine="Sub AddOption(sID As String, sValue As String) As";
 //BA.debugLineNum = 114;BA.debugLine="Dim sug As Map = CreateMap()";
_sug = new anywheresoftware.b4a.objects.collections.Map();
_sug = __c.createMap(new Object[] {});
 //BA.debugLineNum = 115;BA.debugLine="sug.Put(\"id\", sID)";
_sug.Put((Object)("id"),(Object)(_sid));
 //BA.debugLineNum = 116;BA.debugLine="sug.Put(\"value\", sValue)";
_sug.Put((Object)("value"),(Object)(_svalue));
 //BA.debugLineNum = 117;BA.debugLine="Options.Add(sug)";
_options.Add((Object)(_sug.getObject()));
 //BA.debugLineNum = 118;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrichselect)(this);
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return null;
}
public String  _addtocolumns(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 185;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 186;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 187;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 190;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 191;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 192;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.example.wixform _frm) throws Exception{
 //BA.debugLineNum = 77;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 78;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 180;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 181;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public RichSelect As WixElement";
_richselect = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private Options As List";
_options = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixrichselect  _initialize(anywheresoftware.b4a.BA _ba,String _iid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(iID As String) As WixRichSel";
 //BA.debugLineNum = 10;BA.debugLine="ID = iID.tolowercase";
_id = _iid.toLowerCase();
 //BA.debugLineNum = 11;BA.debugLine="RichSelect.Initialize(iID).SetView(\"richselect\")";
_richselect._initialize /*b4j.example.wixelement*/ (ba,_iid)._setview /*b4j.example.wixelement*/ ("richselect");
 //BA.debugLineNum = 12;BA.debugLine="Options.Initialize";
_options.Initialize();
 //BA.debugLineNum = 13;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrichselect)(this);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 83;BA.debugLine="RichSelect.SetAttr(\"options\", Options)";
_richselect._setattr /*b4j.example.wixelement*/ ("options",(Object)(_options.getObject()));
 //BA.debugLineNum = 84;BA.debugLine="Return RichSelect.item";
if (true) return _richselect._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrichselect  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 160;BA.debugLine="Sub SetAlignCenter(r As String) As WixRichSelect '";
 //BA.debugLineNum = 161;BA.debugLine="RichSelect.setAligncenter(\"\")";
_richselect._setaligncenter /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 162;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrichselect)(this);
 //BA.debugLineNum = 163;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrichselect  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 166;BA.debugLine="Sub SetAlignLeft(r As String) As WixRichSelect 'ig";
 //BA.debugLineNum = 167;BA.debugLine="RichSelect.SetAlignleft(\"\")";
_richselect._setalignleft /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 168;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrichselect)(this);
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrichselect  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 154;BA.debugLine="Sub SetAlignRight(r As String) As WixRichSelect 'i";
 //BA.debugLineNum = 155;BA.debugLine="RichSelect.setAlignright(\"\")";
_richselect._setalignright /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 156;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrichselect)(this);
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrichselect  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Sub SetLabel(l As String) As WixRichSelect";
 //BA.debugLineNum = 129;BA.debugLine="RichSelect.SetLabel(l)";
_richselect._setlabel /*b4j.example.wixelement*/ (_l);
 //BA.debugLineNum = 130;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrichselect)(this);
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrichselect  _setlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 135;BA.debugLine="Sub SetLabelAlign(a As String) As WixRichSelect";
 //BA.debugLineNum = 136;BA.debugLine="RichSelect.SetLabelAlign(a)";
_richselect._setlabelalign /*b4j.example.wixelement*/ (_a);
 //BA.debugLineNum = 137;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrichselect)(this);
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrichselect  _setlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 141;BA.debugLine="Sub SetLabelPosition(p As String) As WixRichSelect";
 //BA.debugLineNum = 142;BA.debugLine="RichSelect.SetLabelPosition(p)";
_richselect._setlabelposition /*b4j.example.wixelement*/ (_p);
 //BA.debugLineNum = 143;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrichselect)(this);
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrichselect  _setlabelwidth(int _w) throws Exception{
 //BA.debugLineNum = 147;BA.debugLine="Sub SetLabelWidth(w As Int) As WixRichSelect";
 //BA.debugLineNum = 148;BA.debugLine="RichSelect.SetLabelWidth(w)";
_richselect._setlabelwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 149;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrichselect)(this);
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrichselect  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 17;BA.debugLine="Sub SetMap(m As Map) As WixRichSelect";
 //BA.debugLineNum = 18;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 19;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 20;BA.debugLine="RichSelect.SetAttr(strKey,	strVal)";
_richselect._setattr /*b4j.example.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 22;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrichselect)(this);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrichselect  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub SetMinHeight(h As Int) As WixRichSelect";
 //BA.debugLineNum = 59;BA.debugLine="RichSelect.SetMinHeight(h)";
_richselect._setminheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 60;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrichselect)(this);
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrichselect  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub SetMinWidth(w As Int) As WixRichSelect";
 //BA.debugLineNum = 53;BA.debugLine="RichSelect.SetMinWidth(w)";
_richselect._setminwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrichselect)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrichselect  _setname(String _n) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub SetName(n As String) As WixRichSelect";
 //BA.debugLineNum = 34;BA.debugLine="RichSelect.SetName(n)";
_richselect._setname /*b4j.example.wixelement*/ (_n);
 //BA.debugLineNum = 35;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrichselect)(this);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrichselect  _setoptions(anywheresoftware.b4a.objects.collections.List _o) throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Sub SetOptions(o As List) As WixRichSelect";
 //BA.debugLineNum = 95;BA.debugLine="Options = o";
_options = _o;
 //BA.debugLineNum = 96;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrichselect)(this);
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrichselect  _setoptionsjson(String _json) throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Sub SetOptionsJSON(json As String) As WixRichSelec";
 //BA.debugLineNum = 100;BA.debugLine="RichSelect.SetOptionsJSON(json)";
_richselect._setoptionsjson /*b4j.example.wixelement*/ (_json);
 //BA.debugLineNum = 101;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrichselect)(this);
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrichselect  _setoptionsmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _mk = "";
Object _mv = null;
 //BA.debugLineNum = 104;BA.debugLine="Sub SetOptionsMAP(m As Map) As WixRichSelect";
 //BA.debugLineNum = 105;BA.debugLine="For Each mk As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_mk = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 106;BA.debugLine="Dim mv As Object = m.Get(mk)";
_mv = _m.Get((Object)(_mk));
 //BA.debugLineNum = 107;BA.debugLine="AddOption(mk, mv)";
_addoption(_mk,BA.ObjectToString(_mv));
 }
};
 //BA.debugLineNum = 109;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrichselect)(this);
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrichselect  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Sub SetResponsive(b As Object) As WixRichSelect";
 //BA.debugLineNum = 40;BA.debugLine="RichSelect.SetResponsive(b)";
_richselect._setresponsive /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 41;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrichselect)(this);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrichselect  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixRichSelec";
 //BA.debugLineNum = 46;BA.debugLine="RichSelect.SetResponsiveCell(b)";
_richselect._setresponsivecell /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 47;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrichselect)(this);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrichselect  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 71;BA.debugLine="RichSelect.SetStyle(prop,val)";
_richselect._setstyle /*b4j.example.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 72;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrichselect)(this);
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrichselect  _setsuggest(Object _s) throws Exception{
 //BA.debugLineNum = 173;BA.debugLine="Sub SetSuggest(s As Object) As WixRichSelect";
 //BA.debugLineNum = 174;BA.debugLine="RichSelect.setSuggest(s)";
_richselect._setsuggest /*b4j.example.wixelement*/ (_s);
 //BA.debugLineNum = 175;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrichselect)(this);
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrichselect  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 26;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixRichSel";
 //BA.debugLineNum = 27;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 28;BA.debugLine="RichSelect.SetTemplate(os)";
_richselect._settemplate /*b4j.example.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 29;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrichselect)(this);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrichselect  _settext(String _t) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Sub SetText(t As String) As WixRichSelect";
 //BA.debugLineNum = 89;BA.debugLine="RichSelect.SetAttr(\"text\", t)";
_richselect._setattr /*b4j.example.wixelement*/ ("text",(Object)(_t));
 //BA.debugLineNum = 90;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrichselect)(this);
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrichselect  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub SetTooltip(tt As String) As WixRichSelect";
 //BA.debugLineNum = 65;BA.debugLine="RichSelect.SetTooltip(tt)";
_richselect._settooltip /*b4j.example.wixelement*/ (_tt);
 //BA.debugLineNum = 66;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrichselect)(this);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrichselect  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Sub SetValue(v As String) As WixRichSelect";
 //BA.debugLineNum = 123;BA.debugLine="RichSelect.SetValue(v)";
_richselect._setvalue /*b4j.example.wixelement*/ (_v);
 //BA.debugLineNum = 124;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrichselect)(this);
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
