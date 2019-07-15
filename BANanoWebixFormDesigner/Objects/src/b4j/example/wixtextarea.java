package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixtextarea extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixtextarea", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixtextarea.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixtext _textarea = null;
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
 //BA.debugLineNum = 233;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 234;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 235;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 238;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 239;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 240;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.example.wixform _frm) throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 87;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 228;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 229;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 230;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public TextArea As WixText";
_textarea = new b4j.example.wixtext();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixtextarea  _initialize(anywheresoftware.b4a.BA _ba,String _tid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize(tID As String) As WixTextAre";
 //BA.debugLineNum = 9;BA.debugLine="TextArea.Initialize(tID)";
_textarea._initialize /*b4j.example.wixtext*/ (ba,_tid);
 //BA.debugLineNum = 10;BA.debugLine="TextArea.SetView(\"textarea\")";
_textarea._setview /*b4j.example.wixtext*/ ("textarea");
 //BA.debugLineNum = 11;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 92;BA.debugLine="Return TextArea.Item";
if (true) return _textarea._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _setalign(String _a) throws Exception{
 //BA.debugLineNum = 126;BA.debugLine="Sub SetAlign(a As String) As WixTextArea";
 //BA.debugLineNum = 127;BA.debugLine="TextArea.SetAlign(a)";
_textarea._setalign /*b4j.example.wixtext*/ (_a);
 //BA.debugLineNum = 128;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 215;BA.debugLine="Sub SetAlignCenter(r As String) As WixTextArea 'ig";
 //BA.debugLineNum = 216;BA.debugLine="TextArea.setAligncenter(\"\")";
_textarea._setaligncenter /*b4j.example.wixtext*/ ("");
 //BA.debugLineNum = 217;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 218;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 221;BA.debugLine="Sub SetAlignLeft(r As String) As WixTextArea 'igno";
 //BA.debugLineNum = 222;BA.debugLine="TextArea.SetAlignleft(\"\")";
_textarea._setalignleft /*b4j.example.wixtext*/ ("");
 //BA.debugLineNum = 223;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 224;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 209;BA.debugLine="Sub SetAlignRight(r As String) As WixTextArea 'ign";
 //BA.debugLineNum = 210;BA.debugLine="TextArea.setAlignright(\"\")";
_textarea._setalignright /*b4j.example.wixtext*/ ("");
 //BA.debugLineNum = 211;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 212;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _setbottomlabel(Object _f) throws Exception{
 //BA.debugLineNum = 197;BA.debugLine="Sub SetBottomLabel(f As Object) As WixTextArea";
 //BA.debugLineNum = 198;BA.debugLine="TextArea.SetAttr(\"bottomLabel\", f)";
_textarea._setattr /*b4j.example.wixtext*/ ("bottomLabel",_f);
 //BA.debugLineNum = 199;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 200;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _setbottompadding(Object _f) throws Exception{
 //BA.debugLineNum = 203;BA.debugLine="Sub SetBottomPadding(f As Object) As WixTextArea";
 //BA.debugLineNum = 204;BA.debugLine="TextArea.SetAttr(\"bottomPadding\", f)";
_textarea._setattr /*b4j.example.wixtext*/ ("bottomPadding",_f);
 //BA.debugLineNum = 205;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 206;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _setdisabled(boolean _b) throws Exception{
 //BA.debugLineNum = 191;BA.debugLine="Sub SetDisabled(b As Boolean) As WixTextArea";
 //BA.debugLineNum = 192;BA.debugLine="TextArea.setattr(\"disabled\",b)";
_textarea._setattr /*b4j.example.wixtext*/ ("disabled",(Object)(_b));
 //BA.debugLineNum = 193;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 120;BA.debugLine="Sub SetHeight(h As Object) As WixTextArea";
 //BA.debugLineNum = 121;BA.debugLine="TextArea.SetHeight(h)";
_textarea._setheight /*b4j.example.wixtext*/ (_h);
 //BA.debugLineNum = 122;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _setinvalidmessage(String _msg) throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Sub SetInvalidMessage(msg As String) As WixTextAre";
 //BA.debugLineNum = 69;BA.debugLine="TextArea.SetInvalidMessage(msg)";
_textarea._setinvalidmessage /*b4j.example.wixtext*/ (_msg);
 //BA.debugLineNum = 70;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _setlabel(String _lbl) throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Sub SetLabel(lbl As String) As WixTextArea";
 //BA.debugLineNum = 109;BA.debugLine="TextArea.SetLabel(lbl)";
_textarea._setlabel /*b4j.example.wixtext*/ (_lbl);
 //BA.debugLineNum = 110;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _setlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Sub SetLabelAlign(a As String) As WixTextArea";
 //BA.debugLineNum = 134;BA.debugLine="TextArea.SetLabelAlign(a)";
_textarea._setlabelalign /*b4j.example.wixtext*/ (_a);
 //BA.debugLineNum = 135;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _setlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 139;BA.debugLine="Sub SetLabelPosition(p As String) As WixTextArea";
 //BA.debugLineNum = 140;BA.debugLine="TextArea.SetLabelPosition(p)";
_textarea._setlabelposition /*b4j.example.wixtext*/ (_p);
 //BA.debugLineNum = 141;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _setlabelwidth(int _w) throws Exception{
 //BA.debugLineNum = 145;BA.debugLine="Sub SetLabelWidth(w As Int) As WixTextArea";
 //BA.debugLineNum = 146;BA.debugLine="TextArea.SetLabelWidth(w)";
_textarea._setlabelwidth /*b4j.example.wixtext*/ (_w);
 //BA.debugLineNum = 147;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 58;BA.debugLine="Sub SetMap(m As Map) As WixTextArea";
 //BA.debugLineNum = 59;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 60;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 61;BA.debugLine="TextArea.SetAttr(strKey,	strVal)";
_textarea._setattr /*b4j.example.wixtext*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 63;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _setmaxlength(int _ml) throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Sub SetMaxLength(ml As Int) As WixTextArea";
 //BA.debugLineNum = 97;BA.debugLine="TextArea.SetMaxLength(ml)";
_textarea._setmaxlength /*b4j.example.wixtext*/ (_ml);
 //BA.debugLineNum = 98;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub SetMinHeight(h As Int) As WixTextArea";
 //BA.debugLineNum = 54;BA.debugLine="TextArea.SetMinHeight(h)";
_textarea._setminheight /*b4j.example.wixtext*/ (_h);
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub SetMinWidth(w As Int) As WixTextArea";
 //BA.debugLineNum = 48;BA.debugLine="TextArea.SetMinWidth(w)";
_textarea._setminwidth /*b4j.example.wixtext*/ (_w);
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _setname(String _n) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Sub SetName(n As String) As WixTextArea";
 //BA.debugLineNum = 29;BA.debugLine="TextArea.SetName(n)";
_textarea._setname /*b4j.example.wixtext*/ (_n);
 //BA.debugLineNum = 30;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _setplaceholder(String _ph) throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Sub SetPlaceHolder(ph As String) As WixTextArea";
 //BA.debugLineNum = 103;BA.debugLine="TextArea.SetPlaceHolder(ph)";
_textarea._setplaceholder /*b4j.example.wixtext*/ (_ph);
 //BA.debugLineNum = 104;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _setreadonly(boolean _b) throws Exception{
 //BA.debugLineNum = 185;BA.debugLine="Sub SetReadOnly(b As Boolean) As WixTextArea";
 //BA.debugLineNum = 186;BA.debugLine="TextArea.SetAttr(\"readonly\",b)";
_textarea._setattr /*b4j.example.wixtext*/ ("readonly",(Object)(_b));
 //BA.debugLineNum = 187;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _setrequired(boolean _b) throws Exception{
 //BA.debugLineNum = 178;BA.debugLine="Sub SetRequired(b As Boolean) As WixTextArea";
 //BA.debugLineNum = 179;BA.debugLine="TextArea.SetAttr(\"required\", b)";
_textarea._setattr /*b4j.example.wixtext*/ ("required",(Object)(_b));
 //BA.debugLineNum = 180;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 181;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub SetResponsive(b As Object) As WixTextArea";
 //BA.debugLineNum = 35;BA.debugLine="TextArea.SetResponsive(b)";
_textarea._setresponsive /*b4j.example.wixtext*/ (_b);
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixTextArea";
 //BA.debugLineNum = 41;BA.debugLine="TextArea.SetResponsiveCell(b)";
_textarea._setresponsivecell /*b4j.example.wixtext*/ (_b);
 //BA.debugLineNum = 42;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 81;BA.debugLine="TextArea.SetStyle(prop,val)";
_textarea._setstyle /*b4j.example.wixtext*/ (_prop,_val);
 //BA.debugLineNum = 82;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 21;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixTextAre";
 //BA.debugLineNum = 22;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 23;BA.debugLine="TextArea.SetAttr(\"template\", os)";
_textarea._setattr /*b4j.example.wixtext*/ ("template",(Object)(_os));
 //BA.debugLineNum = 24;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Sub SetTooltip(tt As String) As WixTextArea";
 //BA.debugLineNum = 75;BA.debugLine="TextArea.SetTooltip(tt)";
_textarea._settooltip /*b4j.example.wixtext*/ (_tt);
 //BA.debugLineNum = 76;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _setvalidateeventblur(boolean _b) throws Exception{
 //BA.debugLineNum = 167;BA.debugLine="Sub SetValidateEventBlur(b As Boolean) As WixTextA";
 //BA.debugLineNum = 168;BA.debugLine="TextArea.SetAttr(\"validateEvent\", \"blur\")";
_textarea._setattr /*b4j.example.wixtext*/ ("validateEvent",(Object)("blur"));
 //BA.debugLineNum = 169;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _setvalidateeventkey(boolean _b) throws Exception{
 //BA.debugLineNum = 172;BA.debugLine="Sub SetValidateEventKey(b As Boolean) As WixTextAr";
 //BA.debugLineNum = 173;BA.debugLine="TextArea.SetAttr(\"validateEvent\", \"key\")";
_textarea._setattr /*b4j.example.wixtext*/ ("validateEvent",(Object)("key"));
 //BA.debugLineNum = 174;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _setvalidateisemail(boolean _b) throws Exception{
 //BA.debugLineNum = 161;BA.debugLine="Sub SetValidateIsEmail(b As Boolean) As WixTextAre";
 //BA.debugLineNum = 162;BA.debugLine="TextArea.SetAttr(\"validate\",\"isEmail\")";
_textarea._setattr /*b4j.example.wixtext*/ ("validate",(Object)("isEmail"));
 //BA.debugLineNum = 163;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _setvalidateisnotempty(boolean _b) throws Exception{
 //BA.debugLineNum = 151;BA.debugLine="Sub SetValidateIsNotEmpty(b As Boolean) As WixText";
 //BA.debugLineNum = 152;BA.debugLine="TextArea.SetAttr(\"validate\",\"isNotEmpty\")";
_textarea._setattr /*b4j.example.wixtext*/ ("validate",(Object)("isNotEmpty"));
 //BA.debugLineNum = 153;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _setvalidateisnumber(boolean _b) throws Exception{
 //BA.debugLineNum = 156;BA.debugLine="Sub SetValidateIsNumber(b As Boolean) As WixTextAr";
 //BA.debugLineNum = 157;BA.debugLine="TextArea.SetAttr(\"validate\",\"isNumber\")";
_textarea._setattr /*b4j.example.wixtext*/ ("validate",(Object)("isNumber"));
 //BA.debugLineNum = 158;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub SetValue(v As String) As WixTextArea";
 //BA.debugLineNum = 16;BA.debugLine="TextArea.Setvalue(v)";
_textarea._setvalue /*b4j.example.wixtext*/ (_v);
 //BA.debugLineNum = 17;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Sub SetWidth(w As Object) As WixTextArea";
 //BA.debugLineNum = 115;BA.debugLine="TextArea.SetWidth(w)";
_textarea._setwidth /*b4j.example.wixtext*/ (_w);
 //BA.debugLineNum = 116;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
