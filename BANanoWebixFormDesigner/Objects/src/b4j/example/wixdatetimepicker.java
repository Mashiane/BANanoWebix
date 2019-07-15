package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixdatetimepicker extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixdatetimepicker", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixdatetimepicker.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _datetimepicker = null;
public b4j.example.main _main = null;
public b4j.example.pgformdesigner _pgformdesigner = null;
public b4j.example.dbutton _dbutton = null;
public b4j.example.modcenter _modcenter = null;
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
public String  _addtocolumns(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 178;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 179;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 183;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 184;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 185;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.example.wixform _frm) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 88;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 173;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 174;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public DateTimePicker As WixElement";
_datetimepicker = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixdatetimepicker  _initialize(anywheresoftware.b4a.BA _ba,String _bid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize(bID As String) As WixDateTim";
 //BA.debugLineNum = 9;BA.debugLine="ID = bID.ToLowerCase";
_id = _bid.toLowerCase();
 //BA.debugLineNum = 10;BA.debugLine="DateTimePicker.Initialize(ID).SetView(\"datepicker";
_datetimepicker._initialize /*b4j.example.wixelement*/ (ba,_id)._setview /*b4j.example.wixelement*/ ("datepicker");
 //BA.debugLineNum = 11;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatetimepicker)(this);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 100;BA.debugLine="Return DateTimePicker.item";
if (true) return _datetimepicker._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatetimepicker  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 160;BA.debugLine="Sub SetAlignCenter(r As String) As WixDateTimePick";
 //BA.debugLineNum = 161;BA.debugLine="DateTimePicker.setAligncenter(\"\")";
_datetimepicker._setaligncenter /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 162;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatetimepicker)(this);
 //BA.debugLineNum = 163;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatetimepicker  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 166;BA.debugLine="Sub SetAlignLeft(r As String) As WixDateTimePicker";
 //BA.debugLineNum = 167;BA.debugLine="DateTimePicker.SetAlignleft(\"\")";
_datetimepicker._setalignleft /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 168;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatetimepicker)(this);
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatetimepicker  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 154;BA.debugLine="Sub SetAlignRight(r As String) As WixDateTimePicke";
 //BA.debugLineNum = 155;BA.debugLine="DateTimePicker.setAlignright(\"\")";
_datetimepicker._setalignright /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 156;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatetimepicker)(this);
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatetimepicker  _seteditable(boolean _b) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Sub SetEditable(b As Boolean) As WixDateTimePicker";
 //BA.debugLineNum = 76;BA.debugLine="DateTimePicker.SetProperty(\"editable\", b)";
_datetimepicker._setproperty /*b4j.example.wixelement*/ ("editable",(Object)(_b));
 //BA.debugLineNum = 77;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatetimepicker)(this);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatetimepicker  _setformat(Object _f) throws Exception{
 //BA.debugLineNum = 116;BA.debugLine="Sub SetFormat(f As Object) As WixDateTimePicker";
 //BA.debugLineNum = 117;BA.debugLine="DateTimePicker.SetAttr(\"format\", f)";
_datetimepicker._setattr /*b4j.example.wixelement*/ ("format",_f);
 //BA.debugLineNum = 118;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatetimepicker)(this);
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatetimepicker  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Sub SetLabel(l As String) As WixDateTimePicker";
 //BA.debugLineNum = 111;BA.debugLine="DateTimePicker.SetLabel(l)";
_datetimepicker._setlabel /*b4j.example.wixelement*/ (_l);
 //BA.debugLineNum = 112;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatetimepicker)(this);
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatetimepicker  _setlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 135;BA.debugLine="Sub SetLabelAlign(a As String) As WixDateTimePicke";
 //BA.debugLineNum = 136;BA.debugLine="DateTimePicker.SetLabelAlign(a)";
_datetimepicker._setlabelalign /*b4j.example.wixelement*/ (_a);
 //BA.debugLineNum = 137;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatetimepicker)(this);
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatetimepicker  _setlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 141;BA.debugLine="Sub SetLabelPosition(p As String) As WixDateTimePi";
 //BA.debugLineNum = 142;BA.debugLine="DateTimePicker.SetLabelPosition(p)";
_datetimepicker._setlabelposition /*b4j.example.wixelement*/ (_p);
 //BA.debugLineNum = 143;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatetimepicker)(this);
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatetimepicker  _setlabelwidth(int _w) throws Exception{
 //BA.debugLineNum = 147;BA.debugLine="Sub SetLabelWidth(w As Int) As WixDateTimePicker";
 //BA.debugLineNum = 148;BA.debugLine="DateTimePicker.SetLabelWidth(w)";
_datetimepicker._setlabelwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 149;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatetimepicker)(this);
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatetimepicker  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 65;BA.debugLine="Sub SetMap(m As Map) As WixDateTimePicker";
 //BA.debugLineNum = 66;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 67;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 68;BA.debugLine="DateTimePicker.SetAttr(strKey,	strVal)";
_datetimepicker._setattr /*b4j.example.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 70;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatetimepicker)(this);
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatetimepicker  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Sub SetMinHeight(h As Int) As WixDateTimePicker";
 //BA.debugLineNum = 60;BA.debugLine="DateTimePicker.SetMinHeight(h)";
_datetimepicker._setminheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 61;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatetimepicker)(this);
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatetimepicker  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub SetMinWidth(w As Int) As WixDateTimePicker";
 //BA.debugLineNum = 54;BA.debugLine="DateTimePicker.SetMinWidth(w)";
_datetimepicker._setminwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatetimepicker)(this);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatetimepicker  _setname(String _n) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub SetName(n As String) As WixDateTimePicker";
 //BA.debugLineNum = 35;BA.debugLine="DateTimePicker.SetName(n)";
_datetimepicker._setname /*b4j.example.wixelement*/ (_n);
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatetimepicker)(this);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatetimepicker  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Sub SetResponsive(b As Object) As WixDateTimePicke";
 //BA.debugLineNum = 41;BA.debugLine="DateTimePicker.SetResponsive(b)";
_datetimepicker._setresponsive /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 42;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatetimepicker)(this);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatetimepicker  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixDateTimeP";
 //BA.debugLineNum = 47;BA.debugLine="DateTimePicker.SetResponsiveCell(b)";
_datetimepicker._setresponsivecell /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 48;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatetimepicker)(this);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatetimepicker  _setstringresult(boolean _b) throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub SetStringResult(b As Boolean) As WixDateTimePi";
 //BA.debugLineNum = 22;BA.debugLine="DateTimePicker.SetAttr(\"stringResult\", b)";
_datetimepicker._setattr /*b4j.example.wixelement*/ ("stringResult",(Object)(_b));
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatetimepicker)(this);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatetimepicker  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 93;BA.debugLine="DateTimePicker.SetStyle(prop,val)";
_datetimepicker._setstyle /*b4j.example.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 94;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatetimepicker)(this);
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatetimepicker  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 27;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixDateTim";
 //BA.debugLineNum = 28;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 29;BA.debugLine="DateTimePicker.SetTemplate(os)";
_datetimepicker._settemplate /*b4j.example.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 30;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatetimepicker)(this);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatetimepicker  _settimepicker(boolean _t) throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Sub SetTimePicker(t As Boolean) As WixDateTimePick";
 //BA.debugLineNum = 123;BA.debugLine="DateTimePicker.SetAttr(\"timepicker\", t)";
_datetimepicker._setattr /*b4j.example.wixelement*/ ("timepicker",(Object)(_t));
 //BA.debugLineNum = 124;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatetimepicker)(this);
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatetimepicker  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Sub SetTooltip(tt As String) As WixDateTimePicker";
 //BA.debugLineNum = 82;BA.debugLine="DateTimePicker.SetTooltip(tt)";
_datetimepicker._settooltip /*b4j.example.wixelement*/ (_tt);
 //BA.debugLineNum = 83;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatetimepicker)(this);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatetimepicker  _settypetime(boolean _b) throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub SetTypeTime(b As Boolean) As WixDateTimePicker";
 //BA.debugLineNum = 16;BA.debugLine="DateTimePicker.SetProperty(\"type\", \"time\")";
_datetimepicker._setproperty /*b4j.example.wixelement*/ ("type",(Object)("time"));
 //BA.debugLineNum = 17;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatetimepicker)(this);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatetimepicker  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Sub SetValue(v As String) As WixDateTimePicker";
 //BA.debugLineNum = 105;BA.debugLine="DateTimePicker.SetValue(v)";
_datetimepicker._setvalue /*b4j.example.wixelement*/ (_v);
 //BA.debugLineNum = 106;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatetimepicker)(this);
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatetimepicker  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Sub SetWidth(w As Object) As WixDateTimePicker";
 //BA.debugLineNum = 129;BA.debugLine="DateTimePicker.SetWidth(w)";
_datetimepicker._setwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 130;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatetimepicker)(this);
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
