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
public b4j.example.wixselect  _addoption(String _optid,String _optvalue) throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Sub AddOption(optID As String, optValue As String)";
 //BA.debugLineNum = 96;BA.debugLine="Options.Add(CreateMap(\"id\":optID,\"value\":optValue";
_options.Add((Object)(__c.createMap(new Object[] {(Object)("id"),(Object)(_optid),(Object)("value"),(Object)(_optvalue)}).getObject()));
 //BA.debugLineNum = 97;BA.debugLine="Return Me";
if (true) return (b4j.example.wixselect)(this);
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return null;
}
public String  _addtocolumns(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 174;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 175;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 179;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 180;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 181;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.example.wixform _frm) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 79;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 169;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 170;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 171;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 89;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 90;BA.debugLine="DropDown.SetAttr(\"options\", Options)";
_dropdown._setattr /*b4j.example.wixelement*/ ("options",(Object)(_options.getObject()));
 //BA.debugLineNum = 91;BA.debugLine="Return DropDown.item";
if (true) return _dropdown._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixselect  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 156;BA.debugLine="Sub SetAlignCenter(r As String) As WixSelect 'igno";
 //BA.debugLineNum = 157;BA.debugLine="DropDown.setAligncenter(\"\")";
_dropdown._setaligncenter /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 158;BA.debugLine="Return Me";
if (true) return (b4j.example.wixselect)(this);
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixselect  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 162;BA.debugLine="Sub SetAlignLeft(r As String) As WixSelect 'ignore";
 //BA.debugLineNum = 163;BA.debugLine="DropDown.SetAlignleft(\"\")";
_dropdown._setalignleft /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 164;BA.debugLine="Return Me";
if (true) return (b4j.example.wixselect)(this);
 //BA.debugLineNum = 165;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixselect  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 150;BA.debugLine="Sub SetAlignRight(r As String) As WixSelect 'ignor";
 //BA.debugLineNum = 151;BA.debugLine="DropDown.setAlignright(\"\")";
_dropdown._setalignright /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 152;BA.debugLine="Return Me";
if (true) return (b4j.example.wixselect)(this);
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixselect  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 120;BA.debugLine="Sub SetLabel(l As String) As WixSelect";
 //BA.debugLineNum = 121;BA.debugLine="DropDown.SetLabel(l)";
_dropdown._setlabel /*b4j.example.wixelement*/ (_l);
 //BA.debugLineNum = 122;BA.debugLine="Return Me";
if (true) return (b4j.example.wixselect)(this);
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixselect  _setlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 132;BA.debugLine="Sub SetLabelAlign(a As String) As WixSelect";
 //BA.debugLineNum = 133;BA.debugLine="DropDown.SetLabelAlign(a)";
_dropdown._setlabelalign /*b4j.example.wixelement*/ (_a);
 //BA.debugLineNum = 134;BA.debugLine="Return Me";
if (true) return (b4j.example.wixselect)(this);
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixselect  _setlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 138;BA.debugLine="Sub SetLabelPosition(p As String) As WixSelect";
 //BA.debugLineNum = 139;BA.debugLine="DropDown.SetLabelPosition(p)";
_dropdown._setlabelposition /*b4j.example.wixelement*/ (_p);
 //BA.debugLineNum = 140;BA.debugLine="Return Me";
if (true) return (b4j.example.wixselect)(this);
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixselect  _setlabelwidth(int _w) throws Exception{
 //BA.debugLineNum = 144;BA.debugLine="Sub SetLabelWidth(w As Int) As WixSelect";
 //BA.debugLineNum = 145;BA.debugLine="DropDown.SetLabelWidth(w)";
_dropdown._setlabelwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 146;BA.debugLine="Return Me";
if (true) return (b4j.example.wixselect)(this);
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixselect  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 36;BA.debugLine="Sub SetMap(m As Map) As WixSelect";
 //BA.debugLineNum = 37;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 38;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 39;BA.debugLine="DropDown.SetAttr(strKey,	strVal)";
_dropdown._setattr /*b4j.example.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 41;BA.debugLine="Return Me";
if (true) return (b4j.example.wixselect)(this);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixselect  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Sub SetMinHeight(h As Int) As WixSelect";
 //BA.debugLineNum = 66;BA.debugLine="DropDown.SetMinHeight(h)";
_dropdown._setminheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 67;BA.debugLine="Return Me";
if (true) return (b4j.example.wixselect)(this);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixselect  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Sub SetMinWidth(w As Int) As WixSelect";
 //BA.debugLineNum = 60;BA.debugLine="DropDown.SetMinWidth(w)";
_dropdown._setminwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 61;BA.debugLine="Return Me";
if (true) return (b4j.example.wixselect)(this);
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixselect  _setname(String _n) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Sub SetName(n As String) As WixSelect";
 //BA.debugLineNum = 31;BA.debugLine="DropDown.SetName(n)";
_dropdown._setname /*b4j.example.wixelement*/ (_n);
 //BA.debugLineNum = 32;BA.debugLine="Return Me";
if (true) return (b4j.example.wixselect)(this);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixselect  _setoptions(anywheresoftware.b4a.objects.collections.List _o) throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Sub SetOptions(o As List) As WixSelect";
 //BA.debugLineNum = 84;BA.debugLine="Options = o";
_options = _o;
 //BA.debugLineNum = 85;BA.debugLine="Return Me";
if (true) return (b4j.example.wixselect)(this);
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixselect  _setoptionsjson(String _json) throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Sub SetOptionsJSON(json As String) As WixSelect";
 //BA.debugLineNum = 101;BA.debugLine="DropDown.SetOptionsJSON(json)";
_dropdown._setoptionsjson /*b4j.example.wixelement*/ (_json);
 //BA.debugLineNum = 102;BA.debugLine="Return Me";
if (true) return (b4j.example.wixselect)(this);
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixselect  _setoptionsmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _mk = "";
Object _mv = null;
 //BA.debugLineNum = 105;BA.debugLine="Sub SetOptionsMAP(m As Map) As WixSelect";
 //BA.debugLineNum = 106;BA.debugLine="For Each mk As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_mk = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 107;BA.debugLine="Dim mv As Object = m.Get(mk)";
_mv = _m.Get((Object)(_mk));
 //BA.debugLineNum = 108;BA.debugLine="AddOption(mk, mv)";
_addoption(_mk,BA.ObjectToString(_mv));
 }
};
 //BA.debugLineNum = 110;BA.debugLine="Return Me";
if (true) return (b4j.example.wixselect)(this);
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixselect  _setrequired(boolean _b) throws Exception{
 //BA.debugLineNum = 126;BA.debugLine="Sub SetRequired(b As Boolean) As WixSelect";
 //BA.debugLineNum = 127;BA.debugLine="DropDown.SetRequired(b)";
_dropdown._setrequired /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 128;BA.debugLine="Return Me";
if (true) return (b4j.example.wixselect)(this);
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixselect  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub SetResponsive(b As Object) As WixSelect";
 //BA.debugLineNum = 47;BA.debugLine="DropDown.SetResponsive(b)";
_dropdown._setresponsive /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 48;BA.debugLine="Return Me";
if (true) return (b4j.example.wixselect)(this);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixselect  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixSelect";
 //BA.debugLineNum = 53;BA.debugLine="DropDown.SetResponsiveCell(b)";
_dropdown._setresponsivecell /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.example.wixselect)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
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
public b4j.example.wixselect  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 23;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixSelect";
 //BA.debugLineNum = 24;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 25;BA.debugLine="DropDown.SetTemplate(os)";
_dropdown._settemplate /*b4j.example.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 26;BA.debugLine="Return Me";
if (true) return (b4j.example.wixselect)(this);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixselect  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Sub SetTooltip(tt As String) As WixSelect";
 //BA.debugLineNum = 72;BA.debugLine="DropDown.SetTooltip(tt)";
_dropdown._settooltip /*b4j.example.wixelement*/ (_tt);
 //BA.debugLineNum = 73;BA.debugLine="Return Me";
if (true) return (b4j.example.wixselect)(this);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixselect  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Sub SetValue(v As String) As WixSelect";
 //BA.debugLineNum = 115;BA.debugLine="DropDown.SetValue(v)";
_dropdown._setvalue /*b4j.example.wixelement*/ (_v);
 //BA.debugLineNum = 116;BA.debugLine="Return Me";
if (true) return (b4j.example.wixselect)(this);
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
