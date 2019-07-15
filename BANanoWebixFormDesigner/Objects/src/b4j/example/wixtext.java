package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixtext extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixtext", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixtext.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _text = null;
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
public String  _addtocolumns(b4j.example.wixelement _parent) throws Exception{
 //BA.debugLineNum = 326;BA.debugLine="Sub AddToColumns(parent As WixElement)";
 //BA.debugLineNum = 327;BA.debugLine="parent.AddColumns(Item)";
_parent._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 328;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.example.wixelement _parent) throws Exception{
 //BA.debugLineNum = 331;BA.debugLine="Sub AddToElements(parent As WixElement)";
 //BA.debugLineNum = 332;BA.debugLine="parent.AddElements(Item)";
_parent._addelements /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 333;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.example.wixform _frm) throws Exception{
 //BA.debugLineNum = 162;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 163;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.example.wixelement _parent) throws Exception{
 //BA.debugLineNum = 321;BA.debugLine="Sub AddToRows(parent As WixElement)";
 //BA.debugLineNum = 322;BA.debugLine="parent.AddRows(Item)";
_parent._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 323;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Text As WixElement";
_text = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixtext  _initialize(anywheresoftware.b4a.BA _ba,String _tid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize(tID As String) As WixText";
 //BA.debugLineNum = 9;BA.debugLine="Text.Initialize(tID).SetView(\"text\")";
_text._initialize /*b4j.example.wixelement*/ (ba,_tid)._setview /*b4j.example.wixelement*/ ("text");
 //BA.debugLineNum = 10;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtext)(this);
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 191;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 192;BA.debugLine="Return Text.Item";
if (true) return _text._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 193;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtext  _makemoney(boolean _b) throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Sub MakeMoney(b As Boolean) As WixText   'ignore";
 //BA.debugLineNum = 96;BA.debugLine="SetFormat(\"1,111.00\")";
_setformat((Object)("1,111.00"));
 //BA.debugLineNum = 97;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtext)(this);
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtext  _maketelephone10(boolean _b) throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Sub MakeTelephone10(b As Boolean) As WixText   'ig";
 //BA.debugLineNum = 102;BA.debugLine="SetFormat(\"111-111-1111\")";
_setformat((Object)("111-111-1111"));
 //BA.debugLineNum = 103;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtext)(this);
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtext  _setalign(String _a) throws Exception{
 //BA.debugLineNum = 233;BA.debugLine="Sub SetAlign(a As String) As WixText";
 //BA.debugLineNum = 234;BA.debugLine="Text.SetAlign(a)";
_text._setalign /*b4j.example.wixelement*/ (_a);
 //BA.debugLineNum = 235;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtext)(this);
 //BA.debugLineNum = 236;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtext  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 309;BA.debugLine="Sub SetAlignCenter(r As String) As WixText 'ignore";
 //BA.debugLineNum = 310;BA.debugLine="Text.setAligncenter(\"\")";
_text._setaligncenter /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 311;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtext)(this);
 //BA.debugLineNum = 312;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtext  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 315;BA.debugLine="Sub SetAlignLeft(r As String) As WixText 'ignore";
 //BA.debugLineNum = 316;BA.debugLine="Text.SetAlignleft(\"\")";
_text._setalignleft /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 317;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtext)(this);
 //BA.debugLineNum = 318;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtext  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 303;BA.debugLine="Sub SetAlignRight(r As String) As WixText 'ignore";
 //BA.debugLineNum = 304;BA.debugLine="Text.setAlignright(\"\")";
_text._setalignright /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 305;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtext)(this);
 //BA.debugLineNum = 306;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtext  _setattr(String _p,Object _v) throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Sub SetAttr(p As String, v As Object) As WixText";
 //BA.debugLineNum = 124;BA.debugLine="Text.SetAttr(p, v)";
_text._setattr /*b4j.example.wixelement*/ (_p,_v);
 //BA.debugLineNum = 125;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtext)(this);
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtext  _setbottomlabel(Object _f) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub SetBottomLabel(f As Object) As WixText";
 //BA.debugLineNum = 71;BA.debugLine="Text.SetAttr(\"bottomLabel\", f)";
_text._setattr /*b4j.example.wixelement*/ ("bottomLabel",_f);
 //BA.debugLineNum = 72;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtext)(this);
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtext  _setbottompadding(Object _f) throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Sub SetBottomPadding(f As Object) As WixText";
 //BA.debugLineNum = 77;BA.debugLine="Text.SetAttr(\"bottomPadding\", f)";
_text._setattr /*b4j.example.wixelement*/ ("bottomPadding",_f);
 //BA.debugLineNum = 78;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtext)(this);
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtext  _setdisabled(boolean _b) throws Exception{
 //BA.debugLineNum = 156;BA.debugLine="Sub SetDisabled(b As Boolean) As WixText";
 //BA.debugLineNum = 157;BA.debugLine="Text.setattr(\"disabled\",b)";
_text._setattr /*b4j.example.wixelement*/ ("disabled",(Object)(_b));
 //BA.debugLineNum = 158;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtext)(this);
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtext  _setformat(Object _f) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub SetFormat(f As Object) As WixText";
 //BA.debugLineNum = 90;BA.debugLine="Text.SetAttr(\"format\", f)";
_text._setattr /*b4j.example.wixelement*/ ("format",_f);
 //BA.debugLineNum = 91;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtext)(this);
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtext  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 227;BA.debugLine="Sub SetHeight(h As Object) As WixText";
 //BA.debugLineNum = 228;BA.debugLine="Text.SetHeight(h)";
_text._setheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 229;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtext)(this);
 //BA.debugLineNum = 230;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtext  _sethidden(boolean _b) throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Sub SetHidden(b As Boolean) As WixText";
 //BA.debugLineNum = 21;BA.debugLine="Text.SetHidden(b)";
_text._sethidden /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 22;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtext)(this);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtext  _setinputalign(Object _v) throws Exception{
 //BA.debugLineNum = 296;BA.debugLine="Sub SetInputAlign(v As Object) As WixText  'ignore";
 //BA.debugLineNum = 297;BA.debugLine="Text.SetAttr(\"inputAlign\", v)";
_text._setattr /*b4j.example.wixelement*/ ("inputAlign",_v);
 //BA.debugLineNum = 298;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtext)(this);
 //BA.debugLineNum = 299;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtext  _setinputalignleft(boolean _b) throws Exception{
 //BA.debugLineNum = 290;BA.debugLine="Sub SetInputAlignLeft(b As Boolean) As WixText  'i";
 //BA.debugLineNum = 291;BA.debugLine="Text.SetAttr(\"inputAlign\", \"left\")";
_text._setattr /*b4j.example.wixelement*/ ("inputAlign",(Object)("left"));
 //BA.debugLineNum = 292;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtext)(this);
 //BA.debugLineNum = 293;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtext  _setinputalignright(boolean _b) throws Exception{
 //BA.debugLineNum = 284;BA.debugLine="Sub SetInputAlignRight(b As Boolean) As WixText  '";
 //BA.debugLineNum = 285;BA.debugLine="Text.SetAttr(\"inputAlign\", \"right\")";
_text._setattr /*b4j.example.wixelement*/ ("inputAlign",(Object)("right"));
 //BA.debugLineNum = 286;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtext)(this);
 //BA.debugLineNum = 287;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtext  _setinvalidmessage(String _msg) throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Sub SetInvalidMessage(msg As String) As WixText";
 //BA.debugLineNum = 15;BA.debugLine="Text.SetAttr(\"invalidMessage\", msg)";
_text._setattr /*b4j.example.wixelement*/ ("invalidMessage",(Object)(_msg));
 //BA.debugLineNum = 16;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtext)(this);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtext  _setlabel(String _lbl) throws Exception{
 //BA.debugLineNum = 215;BA.debugLine="Sub SetLabel(lbl As String) As WixText";
 //BA.debugLineNum = 216;BA.debugLine="Text.SetLabel(lbl)";
_text._setlabel /*b4j.example.wixelement*/ (_lbl);
 //BA.debugLineNum = 217;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtext)(this);
 //BA.debugLineNum = 218;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtext  _setlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 239;BA.debugLine="Sub SetLabelAlign(a As String) As WixText";
 //BA.debugLineNum = 240;BA.debugLine="Text.SetLabelAlign(a)";
_text._setlabelalign /*b4j.example.wixelement*/ (_a);
 //BA.debugLineNum = 241;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtext)(this);
 //BA.debugLineNum = 242;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtext  _setlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 245;BA.debugLine="Sub SetLabelPosition(p As String) As WixText";
 //BA.debugLineNum = 246;BA.debugLine="Text.SetLabelPosition(p)";
_text._setlabelposition /*b4j.example.wixelement*/ (_p);
 //BA.debugLineNum = 247;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtext)(this);
 //BA.debugLineNum = 248;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtext  _setlabelwidth(int _w) throws Exception{
 //BA.debugLineNum = 251;BA.debugLine="Sub SetLabelWidth(w As Int) As WixText";
 //BA.debugLineNum = 252;BA.debugLine="Text.SetLabelWidth(w)";
_text._setlabelwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 253;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtext)(this);
 //BA.debugLineNum = 254;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtext  _setlocalid(String _i) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub SetLocalID(i As String) As WixText";
 //BA.debugLineNum = 34;BA.debugLine="Text.SetLocalID(i)";
_text._setlocalid /*b4j.example.wixelement*/ (_i);
 //BA.debugLineNum = 35;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtext)(this);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtext  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 114;BA.debugLine="Sub SetMap(m As Map) As WixText";
 //BA.debugLineNum = 115;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 116;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 117;BA.debugLine="Text.SetAttr(strKey,	strVal)";
_text._setattr /*b4j.example.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 119;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtext)(this);
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtext  _setmaxlength(int _imaxlength) throws Exception{
 //BA.debugLineNum = 196;BA.debugLine="Sub SetMaxLength(imaxlength As Int) As WixText";
 //BA.debugLineNum = 197;BA.debugLine="Text.SetHTMLAttr(\"maxlength\", imaxlength)";
_text._sethtmlattr /*b4j.example.wixelement*/ ("maxlength",(Object)(_imaxlength));
 //BA.debugLineNum = 198;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtext)(this);
 //BA.debugLineNum = 199;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtext  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub SetMinHeight(h As Int) As WixText";
 //BA.debugLineNum = 65;BA.debugLine="Text.SetMinHeight(h)";
_text._setminheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 66;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtext)(this);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtext  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub SetMinWidth(w As Int) As WixText";
 //BA.debugLineNum = 59;BA.debugLine="Text.SetMinWidth(w)";
_text._setminwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 60;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtext)(this);
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtext  _setname(String _n) throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Sub SetName(n As String) As WixText";
 //BA.debugLineNum = 40;BA.debugLine="Text.SetName(n)";
_text._setname /*b4j.example.wixelement*/ (_n);
 //BA.debugLineNum = 41;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtext)(this);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtext  _setpattern(Object _f) throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Sub SetPattern(f As Object) As WixText";
 //BA.debugLineNum = 84;BA.debugLine="Text.SetAttr(\"pattern\", f)";
_text._setattr /*b4j.example.wixelement*/ ("pattern",_f);
 //BA.debugLineNum = 85;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtext)(this);
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtext  _setplaceholder(String _ph) throws Exception{
 //BA.debugLineNum = 209;BA.debugLine="Sub SetPlaceHolder(ph As String) As WixText";
 //BA.debugLineNum = 210;BA.debugLine="Text.SetPlaceHolder(ph)";
_text._setplaceholder /*b4j.example.wixelement*/ (_ph);
 //BA.debugLineNum = 211;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtext)(this);
 //BA.debugLineNum = 212;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtext  _setreadonly(boolean _b) throws Exception{
 //BA.debugLineNum = 150;BA.debugLine="Sub SetReadOnly(b As Boolean) As WixText";
 //BA.debugLineNum = 151;BA.debugLine="Text.SetAttr(\"readonly\",b)";
_text._setattr /*b4j.example.wixelement*/ ("readonly",(Object)(_b));
 //BA.debugLineNum = 152;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtext)(this);
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtext  _setrequired(boolean _b) throws Exception{
 //BA.debugLineNum = 202;BA.debugLine="Sub SetRequired(b As Boolean) As WixText";
 //BA.debugLineNum = 203;BA.debugLine="Text.SetAttr(\"required\", b)";
_text._setattr /*b4j.example.wixelement*/ ("required",(Object)(_b));
 //BA.debugLineNum = 204;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtext)(this);
 //BA.debugLineNum = 205;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtext  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Sub SetResponsive(b As Object) As WixText";
 //BA.debugLineNum = 46;BA.debugLine="Text.SetResponsive(b)";
_text._setresponsive /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 47;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtext)(this);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtext  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixText";
 //BA.debugLineNum = 52;BA.debugLine="Text.SetResponsiveCell(b)";
_text._setresponsivecell /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 53;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtext)(this);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtext  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 144;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 145;BA.debugLine="Text.SetStyle(prop,val)";
_text._setstyle /*b4j.example.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 146;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtext)(this);
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtext  _setsuggest(Object _s) throws Exception{
 //BA.debugLineNum = 167;BA.debugLine="Sub SetSuggest(s As Object) As WixText";
 //BA.debugLineNum = 168;BA.debugLine="Text.SetSuggest(s)";
_text._setsuggest /*b4j.example.wixelement*/ (_s);
 //BA.debugLineNum = 169;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtext)(this);
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtext  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 26;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixText";
 //BA.debugLineNum = 27;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 28;BA.debugLine="Text.SetTemplate(os)";
_text._settemplate /*b4j.example.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 29;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtext)(this);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtext  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 137;BA.debugLine="Sub SetTooltip(tt As String) As WixText";
 //BA.debugLineNum = 138;BA.debugLine="Text.SetTooltip(tt)";
_text._settooltip /*b4j.example.wixelement*/ (_tt);
 //BA.debugLineNum = 139;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtext)(this);
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtext  _settype(String _t) throws Exception{
 //BA.debugLineNum = 185;BA.debugLine="Sub SetType(t As String) As WixText";
 //BA.debugLineNum = 186;BA.debugLine="Text.SetType(t)";
_text._settype /*b4j.example.wixelement*/ (_t);
 //BA.debugLineNum = 187;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtext)(this);
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtext  _settypeemail(String _r) throws Exception{
 //BA.debugLineNum = 131;BA.debugLine="Sub SetTypeEmail(r As String) As WixText  'ignore";
 //BA.debugLineNum = 132;BA.debugLine="Text.SetType(\"email\")";
_text._settype /*b4j.example.wixelement*/ ("email");
 //BA.debugLineNum = 133;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtext)(this);
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtext  _settypepassword(String _r) throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Sub SetTypePassword(r As String) As WixText  'igno";
 //BA.debugLineNum = 109;BA.debugLine="Text.SetType(\"password\")";
_text._settype /*b4j.example.wixelement*/ ("password");
 //BA.debugLineNum = 110;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtext)(this);
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtext  _setvalidateeventblur(boolean _b) throws Exception{
 //BA.debugLineNum = 273;BA.debugLine="Sub SetValidateEventBlur(b As Boolean) As WixText";
 //BA.debugLineNum = 274;BA.debugLine="Text.SetAttr(\"validateEvent\", \"blur\")";
_text._setattr /*b4j.example.wixelement*/ ("validateEvent",(Object)("blur"));
 //BA.debugLineNum = 275;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtext)(this);
 //BA.debugLineNum = 276;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtext  _setvalidateeventkey(boolean _b) throws Exception{
 //BA.debugLineNum = 278;BA.debugLine="Sub SetValidateEventKey(b As Boolean) As WixText";
 //BA.debugLineNum = 279;BA.debugLine="Text.SetAttr(\"validateEvent\", \"key\")";
_text._setattr /*b4j.example.wixelement*/ ("validateEvent",(Object)("key"));
 //BA.debugLineNum = 280;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtext)(this);
 //BA.debugLineNum = 281;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtext  _setvalidateisemail(boolean _b) throws Exception{
 //BA.debugLineNum = 267;BA.debugLine="Sub SetValidateIsEmail(b As Boolean) As WixText";
 //BA.debugLineNum = 268;BA.debugLine="Text.SetAttr(\"validate\",\"isEmail\")";
_text._setattr /*b4j.example.wixelement*/ ("validate",(Object)("isEmail"));
 //BA.debugLineNum = 269;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtext)(this);
 //BA.debugLineNum = 270;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtext  _setvalidateisnotempty(boolean _b) throws Exception{
 //BA.debugLineNum = 257;BA.debugLine="Sub SetValidateIsNotEmpty(b As Boolean) As WixText";
 //BA.debugLineNum = 258;BA.debugLine="Text.SetAttr(\"validate\",\"isNotEmpty\")";
_text._setattr /*b4j.example.wixelement*/ ("validate",(Object)("isNotEmpty"));
 //BA.debugLineNum = 259;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtext)(this);
 //BA.debugLineNum = 260;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtext  _setvalidateisnumber(boolean _b) throws Exception{
 //BA.debugLineNum = 262;BA.debugLine="Sub SetValidateIsNumber(b As Boolean) As WixText";
 //BA.debugLineNum = 263;BA.debugLine="Text.SetAttr(\"validate\",\"isNumber\")";
_text._setattr /*b4j.example.wixelement*/ ("validate",(Object)("isNumber"));
 //BA.debugLineNum = 264;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtext)(this);
 //BA.debugLineNum = 265;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtext  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 173;BA.debugLine="Sub SetValue(v As String) As WixText";
 //BA.debugLineNum = 174;BA.debugLine="Text.SetValue(v)";
_text._setvalue /*b4j.example.wixelement*/ (_v);
 //BA.debugLineNum = 175;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtext)(this);
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtext  _setview(String _v) throws Exception{
 //BA.debugLineNum = 179;BA.debugLine="Sub SetView(v As String) As WixText";
 //BA.debugLineNum = 180;BA.debugLine="Text.setview(v)";
_text._setview /*b4j.example.wixelement*/ (_v);
 //BA.debugLineNum = 181;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtext)(this);
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtext  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 221;BA.debugLine="Sub SetWidth(w As Object) As WixText";
 //BA.debugLineNum = 222;BA.debugLine="Text.SetWidth(w)";
_text._setwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 223;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtext)(this);
 //BA.debugLineNum = 224;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
