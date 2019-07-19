package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixaccordion extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixaccordion", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixaccordion.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _accordion = null;
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
public b4j.example.wixaccordion  _addaccordionitem(b4j.example.wixaccordionitem _ai,boolean _bvertical) throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Sub AddAccordionItem(ai As WixAccordionItem, bVert";
 //BA.debugLineNum = 119;BA.debugLine="If bVertical Then";
if (_bvertical) { 
 //BA.debugLineNum = 120;BA.debugLine="Accordion.AddColumns(ai.Item)";
_accordion._addcolumns /*b4j.example.wixelement*/ (_ai._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 }else {
 //BA.debugLineNum = 122;BA.debugLine="Accordion.AddRows(ai.Item)";
_accordion._addrows /*b4j.example.wixelement*/ (_ai._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 };
 //BA.debugLineNum = 124;BA.debugLine="Return Me";
if (true) return (b4j.example.wixaccordion)(this);
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixaccordion  _additem(String _iid,Object _header,Object _body,boolean _bcollapsed,boolean _bvertical) throws Exception{
b4j.example.wixaccordionitem _ai = null;
 //BA.debugLineNum = 128;BA.debugLine="Sub AddItem(iID As String, header As Object, body";
 //BA.debugLineNum = 129;BA.debugLine="Dim ai As WixAccordionItem";
_ai = new b4j.example.wixaccordionitem();
 //BA.debugLineNum = 130;BA.debugLine="ai.Initialize(iID).SetHeader(header).SetCollapsed";
_ai._initialize /*b4j.example.wixaccordionitem*/ (ba,_iid)._setheader /*b4j.example.wixaccordionitem*/ (BA.ObjectToString(_header))._setcollapsed /*b4j.example.wixaccordionitem*/ ((Object)(_bcollapsed));
 //BA.debugLineNum = 131;BA.debugLine="ai.SetBody(body)";
_ai._setbody /*b4j.example.wixaccordionitem*/ (_body);
 //BA.debugLineNum = 132;BA.debugLine="If bVertical Then";
if (_bvertical) { 
 //BA.debugLineNum = 133;BA.debugLine="Accordion.AddColumns(ai.Item)";
_accordion._addcolumns /*b4j.example.wixelement*/ (_ai._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 }else {
 //BA.debugLineNum = 135;BA.debugLine="Accordion.AddRows(ai.Item)";
_accordion._addrows /*b4j.example.wixelement*/ (_ai._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 };
 //BA.debugLineNum = 137;BA.debugLine="Return Me";
if (true) return (b4j.example.wixaccordion)(this);
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Accordion As WixElement";
_accordion = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixaccordion  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize(sid As String) As WixAccordi";
 //BA.debugLineNum = 9;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 10;BA.debugLine="Accordion.Initialize(ID).SetView(\"accordion\").Set";
_accordion._initialize /*b4j.example.wixelement*/ (ba,_id)._setview /*b4j.example.wixelement*/ ("accordion")._settype /*b4j.example.wixelement*/ ("wide");
 //BA.debugLineNum = 11;BA.debugLine="Return Me";
if (true) return (b4j.example.wixaccordion)(this);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 115;BA.debugLine="Return Accordion.item";
if (true) return _accordion._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixaccordion  _setcollapsed(boolean _b) throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Sub SetCollapsed(b As Boolean) As WixAccordion";
 //BA.debugLineNum = 97;BA.debugLine="Accordion.SetAttr(\"collapsed\", b)";
_accordion._setattr /*b4j.example.wixelement*/ ("collapsed",(Object)(_b));
 //BA.debugLineNum = 98;BA.debugLine="Return Me";
if (true) return (b4j.example.wixaccordion)(this);
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixaccordion  _setheight(int _w) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub SetHeight(w As Int) As WixAccordion";
 //BA.debugLineNum = 79;BA.debugLine="Accordion.SetHeight(w)";
_accordion._setheight /*b4j.example.wixelement*/ ((Object)(_w));
 //BA.debugLineNum = 80;BA.debugLine="Return Me";
if (true) return (b4j.example.wixaccordion)(this);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixaccordion  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 141;BA.debugLine="Sub SetMap(m As Map) As WixAccordion";
 //BA.debugLineNum = 142;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 143;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 144;BA.debugLine="Accordion.SetAttr(strKey,	strVal)";
_accordion._setattr /*b4j.example.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 146;BA.debugLine="Return Me";
if (true) return (b4j.example.wixaccordion)(this);
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixaccordion  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Sub SetMinHeight(h As Int) As WixAccordion";
 //BA.debugLineNum = 91;BA.debugLine="Accordion.SetMinHeight(h)";
_accordion._setminheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 92;BA.debugLine="Return Me";
if (true) return (b4j.example.wixaccordion)(this);
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixaccordion  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub SetMinWidth(w As Int) As WixAccordion";
 //BA.debugLineNum = 85;BA.debugLine="Accordion.SetMinWidth(w)";
_accordion._setminwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 86;BA.debugLine="Return Me";
if (true) return (b4j.example.wixaccordion)(this);
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixaccordion  _setmulti(Object _b) throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Sub SetMulti(b As Object) As WixAccordion";
 //BA.debugLineNum = 103;BA.debugLine="Accordion.SetAttr(\"multi\", b)";
_accordion._setattr /*b4j.example.wixelement*/ ("multi",_b);
 //BA.debugLineNum = 104;BA.debugLine="Return Me";
if (true) return (b4j.example.wixaccordion)(this);
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixaccordion  _setmultimixed(Object _b) throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Sub SetMultiMixed(b As Object) As WixAccordion   '";
 //BA.debugLineNum = 108;BA.debugLine="SetMulti(\"mixed\")";
_setmulti((Object)("mixed"));
 //BA.debugLineNum = 109;BA.debugLine="Return Me";
if (true) return (b4j.example.wixaccordion)(this);
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixaccordion  _setname(String _n) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub SetName(n As String) As WixAccordion";
 //BA.debugLineNum = 54;BA.debugLine="Accordion.SetName(n)";
_accordion._setname /*b4j.example.wixelement*/ (_n);
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return (b4j.example.wixaccordion)(this);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixaccordion  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Sub SetResponsive(b As Object) As WixAccordion";
 //BA.debugLineNum = 60;BA.debugLine="Accordion.SetResponsive(b)";
_accordion._setresponsive /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 61;BA.debugLine="Return Me";
if (true) return (b4j.example.wixaccordion)(this);
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixaccordion  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixAccordion";
 //BA.debugLineNum = 66;BA.debugLine="Accordion.SetResponsiveCell(b)";
_accordion._setresponsivecell /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 67;BA.debugLine="Return Me";
if (true) return (b4j.example.wixaccordion)(this);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixaccordion  _setscroll(boolean _b) throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub SetScroll(b As Boolean) As WixAccordion";
 //BA.debugLineNum = 48;BA.debugLine="Accordion.SetAttr(\"scroll\", b)";
_accordion._setattr /*b4j.example.wixelement*/ ("scroll",(Object)(_b));
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (b4j.example.wixaccordion)(this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixaccordion  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 15;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixAccordi";
 //BA.debugLineNum = 16;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 17;BA.debugLine="Accordion.SetTemplate(os)";
_accordion._settemplate /*b4j.example.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 18;BA.debugLine="Return Me";
if (true) return (b4j.example.wixaccordion)(this);
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixaccordion  _settypeclean(boolean _b) throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Sub SetTypeClean(b As Boolean) As WixAccordion  'i";
 //BA.debugLineNum = 27;BA.debugLine="Accordion.SetTypeClean(\"\")";
_accordion._settypeclean /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 28;BA.debugLine="Return Me";
if (true) return (b4j.example.wixaccordion)(this);
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixaccordion  _settypeform(boolean _b) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Sub SetTypeForm(b As Boolean) As WixAccordion   'i";
 //BA.debugLineNum = 42;BA.debugLine="Accordion.SetTypeForm(\"\")";
_accordion._settypeform /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 43;BA.debugLine="Return Me";
if (true) return (b4j.example.wixaccordion)(this);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixaccordion  _settypeline(boolean _b) throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub SetTypeLine(b As Boolean) As WixAccordion   'i";
 //BA.debugLineNum = 22;BA.debugLine="Accordion.SetTypeLine(\"\")";
_accordion._settypeline /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return (b4j.example.wixaccordion)(this);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixaccordion  _settypespace(boolean _b) throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Sub SetTypeSpace(b As Boolean) As WixAccordion   '";
 //BA.debugLineNum = 37;BA.debugLine="Accordion.SetTypeSpace(\"\")";
_accordion._settypespace /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 38;BA.debugLine="Return Me";
if (true) return (b4j.example.wixaccordion)(this);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixaccordion  _settypewide(boolean _b) throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Sub SetTypeWide(b As Boolean) As WixAccordion  'ig";
 //BA.debugLineNum = 32;BA.debugLine="Accordion.SetTypeWide(\"\")";
_accordion._settypewide /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 33;BA.debugLine="Return Me";
if (true) return (b4j.example.wixaccordion)(this);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixaccordion  _setwidth(int _w) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Sub SetWidth(w As Int) As WixAccordion";
 //BA.debugLineNum = 73;BA.debugLine="Accordion.SetWidth(w)";
_accordion._setwidth /*b4j.example.wixelement*/ ((Object)(_w));
 //BA.debugLineNum = 74;BA.debugLine="Return Me";
if (true) return (b4j.example.wixaccordion)(this);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
