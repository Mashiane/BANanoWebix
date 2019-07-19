package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixbutton extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixbutton", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixbutton.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _button = null;
public b4j.example.wixelement _parent = null;
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
public String  _addtocolumns(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 283;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 284;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 285;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 288;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 289;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 290;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.example.wixform _frm) throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 123;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 278;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 279;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 280;BA.debugLine="End Sub";
return "";
}
public String  _addtotoolbar(b4j.example.wixtoolbar _tblb) throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="Sub AddToToolbar(tblB As WixToolBar)";
 //BA.debugLineNum = 128;BA.debugLine="tblB.ToolBar.AddColumns(Item)";
_tblb._toolbar /*b4j.example.wixelement*/ ._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Public Button As WixElement";
_button = new b4j.example.wixelement();
 //BA.debugLineNum = 6;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.example.wixelement();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixbutton  _initialize(anywheresoftware.b4a.BA _ba,String _bid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(bID As String) As WixButton";
 //BA.debugLineNum = 11;BA.debugLine="ID = bID.ToLowerCase";
_id = _bid.toLowerCase();
 //BA.debugLineNum = 12;BA.debugLine="Button.Initialize(ID).SetView(\"button\")";
_button._initialize /*b4j.example.wixelement*/ (ba,_id)._setview /*b4j.example.wixelement*/ ("button");
 //BA.debugLineNum = 13;BA.debugLine="Parent = Null";
_parent = (b4j.example.wixelement)(__c.Null);
 //BA.debugLineNum = 14;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 144;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 145;BA.debugLine="Return Button.item";
if (true) return _button._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 118;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixbutton  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 259;BA.debugLine="Sub SetAlignCenter(r As String) As WixButton 'igno";
 //BA.debugLineNum = 260;BA.debugLine="Button.setAligncenter(\"\")";
_button._setaligncenter /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 261;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 262;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 265;BA.debugLine="Sub SetAlignLeft(r As String) As WixButton 'ignore";
 //BA.debugLineNum = 266;BA.debugLine="Button.SetAlignleft(\"\")";
_button._setalignleft /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 267;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 268;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 253;BA.debugLine="Sub SetAlignRight(r As String) As WixButton 'ignor";
 //BA.debugLineNum = 254;BA.debugLine="Button.setAlignright(\"\")";
_button._setalignright /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 255;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 256;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setautowidth(boolean _b) throws Exception{
 //BA.debugLineNum = 271;BA.debugLine="Sub SetAutoWidth(b As Boolean) As WixButton 'ignor";
 //BA.debugLineNum = 272;BA.debugLine="Button.SetAutoWidth(b)";
_button._setautowidth /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 273;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 274;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setbadge(Object _b) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub SetBadge(b As Object) As WixButton";
 //BA.debugLineNum = 53;BA.debugLine="Button.SetAttr(\"badge\", b)";
_button._setattr /*b4j.example.wixelement*/ ("badge",_b);
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setbatch(int _b) throws Exception{
 //BA.debugLineNum = 155;BA.debugLine="Sub SetBatch(b As Int) As WixButton";
 //BA.debugLineNum = 156;BA.debugLine="Button.SetBatch(b)";
_button._setbatch /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 157;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setclick(com.ab.banano.BANanoObject _e) throws Exception{
 //BA.debugLineNum = 138;BA.debugLine="Sub SetClick(e As BANanoObject) As WixButton";
 //BA.debugLineNum = 139;BA.debugLine="Button.SetAttr(\"click\", e)";
_button._setattr /*b4j.example.wixelement*/ ("click",(Object)(_e));
 //BA.debugLineNum = 140;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setcssdanger(boolean _b) throws Exception{
 //BA.debugLineNum = 185;BA.debugLine="Sub SetCSSDanger(b As Boolean) As WixButton     'i";
 //BA.debugLineNum = 186;BA.debugLine="Button.SetCSS(\"webix_danger\")";
_button._setcss /*b4j.example.wixelement*/ ("webix_danger");
 //BA.debugLineNum = 187;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setcssprimary(boolean _b) throws Exception{
 //BA.debugLineNum = 173;BA.debugLine="Sub SetCSSPrimary(b As Boolean) As WixButton   'ig";
 //BA.debugLineNum = 174;BA.debugLine="Button.SetCSS(\"webix_primary\")";
_button._setcss /*b4j.example.wixelement*/ ("webix_primary");
 //BA.debugLineNum = 175;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setcsssecondary(boolean _b) throws Exception{
 //BA.debugLineNum = 191;BA.debugLine="Sub SetCSSSecondary(b As Boolean) As WixButton";
 //BA.debugLineNum = 192;BA.debugLine="Button.SetCSS(\"webix_secondary\")";
_button._setcss /*b4j.example.wixelement*/ ("webix_secondary");
 //BA.debugLineNum = 193;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setcsstransparent(boolean _b) throws Exception{
 //BA.debugLineNum = 179;BA.debugLine="Sub SetCSSTransparent(b As Boolean) As WixButton";
 //BA.debugLineNum = 180;BA.debugLine="Button.SetCSS(\"webix_transparent\")";
_button._setcss /*b4j.example.wixelement*/ ("webix_transparent");
 //BA.debugLineNum = 181;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setdisabled(boolean _b) throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Sub SetDisabled(b As Boolean) As WixButton";
 //BA.debugLineNum = 36;BA.debugLine="Button.SetAttr(\"disabled\", b)";
_button._setattr /*b4j.example.wixelement*/ ("disabled",(Object)(_b));
 //BA.debugLineNum = 37;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 240;BA.debugLine="Sub SetHeight(h As Object) As WixButton";
 //BA.debugLineNum = 241;BA.debugLine="Button.SetHeight(h)";
_button._setheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 242;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 243;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _sethidden(boolean _b) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Sub SetHidden(b As Boolean) As WixButton";
 //BA.debugLineNum = 31;BA.debugLine="Button.SetAttr(\"hidden\", b)";
_button._setattr /*b4j.example.wixelement*/ ("hidden",(Object)(_b));
 //BA.debugLineNum = 32;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _seticon(String _icn) throws Exception{
 //BA.debugLineNum = 167;BA.debugLine="Sub SetIcon(icn As String) As WixButton";
 //BA.debugLineNum = 168;BA.debugLine="Button.SetAttr(\"icon\", icn)";
_button._setattr /*b4j.example.wixelement*/ ("icon",(Object)(_icn));
 //BA.debugLineNum = 169;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setimage(String _img) throws Exception{
 //BA.debugLineNum = 161;BA.debugLine="Sub SetImage(img As String) As WixButton";
 //BA.debugLineNum = 162;BA.debugLine="Button.SetAttr(\"image\", img)";
_button._setattr /*b4j.example.wixelement*/ ("image",(Object)(_img));
 //BA.debugLineNum = 163;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setinputwidth(int _w) throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Sub SetInputWidth(w As Int) As WixButton";
 //BA.debugLineNum = 100;BA.debugLine="Button.SetInputWidth(w)";
_button._setinputwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 101;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setlabel(String _lbl) throws Exception{
 //BA.debugLineNum = 203;BA.debugLine="Sub SetLabel(lbl As String) As WixButton";
 //BA.debugLineNum = 204;BA.debugLine="Button.SetLabel(lbl)";
_button._setlabel /*b4j.example.wixelement*/ (_lbl);
 //BA.debugLineNum = 205;BA.debugLine="Button.Setvalue(lbl)";
_button._setvalue /*b4j.example.wixelement*/ (_lbl);
 //BA.debugLineNum = 206;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 207;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Sub SetLabelAlign(a As String) As WixButton";
 //BA.debugLineNum = 20;BA.debugLine="Button.SetLabelAlign(a)";
_button._setlabelalign /*b4j.example.wixelement*/ (_a);
 //BA.debugLineNum = 21;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Sub SetLabelPosition(p As String) As WixButton";
 //BA.debugLineNum = 26;BA.debugLine="Button.SetLabelPosition(p)";
_button._setlabelposition /*b4j.example.wixelement*/ (_p);
 //BA.debugLineNum = 27;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setlabelwidth(int _w) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Sub SetLabelWidth(w As Int) As WixButton";
 //BA.debugLineNum = 42;BA.debugLine="Button.SetLabelWidth(w)";
_button._setlabelwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 43;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 89;BA.debugLine="Sub SetMap(m As Map) As WixButton";
 //BA.debugLineNum = 90;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 91;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 92;BA.debugLine="Button.SetAttr(strKey,	strVal)";
_button._setattr /*b4j.example.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 94;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Sub SetMinHeight(h As Int) As WixButton";
 //BA.debugLineNum = 84;BA.debugLine="Button.SetMinHeight(h)";
_button._setminheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 85;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 77;BA.debugLine="Sub SetMinWidth(w As Int) As WixButton";
 //BA.debugLineNum = 78;BA.debugLine="Button.SetMinWidth(w)";
_button._setminwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 79;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setname(String _n) throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub SetName(n As String) As WixButton";
 //BA.debugLineNum = 59;BA.debugLine="Button.SetName(n)";
_button._setname /*b4j.example.wixelement*/ (_n);
 //BA.debugLineNum = 60;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setparent(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 149;BA.debugLine="Sub SetParent(p As WixElement) As WixButton";
 //BA.debugLineNum = 150;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 151;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setpopup(Object _i) throws Exception{
 //BA.debugLineNum = 197;BA.debugLine="Sub SetPopUp(i As Object) As WixButton     'ignore";
 //BA.debugLineNum = 198;BA.debugLine="Button.SetAttr(\"popup\", i)";
_button._setattr /*b4j.example.wixelement*/ ("popup",_i);
 //BA.debugLineNum = 199;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 200;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub SetResponsive(b As Object) As WixButton";
 //BA.debugLineNum = 65;BA.debugLine="Button.SetResponsive(b)";
_button._setresponsive /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 66;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixButton";
 //BA.debugLineNum = 71;BA.debugLine="Button.SetResponsiveCell(b)";
_button._setresponsivecell /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 72;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 111;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 112;BA.debugLine="Button.SetStyle(prop,val)";
_button._setstyle /*b4j.example.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 113;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 46;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixButton";
 //BA.debugLineNum = 47;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 48;BA.debugLine="Button.SetTemplate(os)";
_button._settemplate /*b4j.example.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 105;BA.debugLine="Sub SetTooltip(tt As String) As WixButton";
 //BA.debugLineNum = 106;BA.debugLine="Button.SetAttr(\"tooltip\", tt)";
_button._setattr /*b4j.example.wixelement*/ ("tooltip",(Object)(_tt));
 //BA.debugLineNum = 107;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _settypeicon(String _i) throws Exception{
 //BA.debugLineNum = 216;BA.debugLine="Sub SetTypeIcon(i As String) As WixButton 'ignore";
 //BA.debugLineNum = 217;BA.debugLine="Button.SetAttr(\"type\", \"icon\")";
_button._setattr /*b4j.example.wixelement*/ ("type",(Object)("icon"));
 //BA.debugLineNum = 218;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 219;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _settypeicontop(String _r) throws Exception{
 //BA.debugLineNum = 234;BA.debugLine="Sub SetTypeIconTop(r As String) As WixButton  'ign";
 //BA.debugLineNum = 235;BA.debugLine="Button.SetAttr(\"type\", \"iconTop\")";
_button._setattr /*b4j.example.wixelement*/ ("type",(Object)("iconTop"));
 //BA.debugLineNum = 236;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 237;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _settypeimage(String _r) throws Exception{
 //BA.debugLineNum = 222;BA.debugLine="Sub SetTypeImage(r As String) As WixButton  'ignor";
 //BA.debugLineNum = 223;BA.debugLine="Button.SetAttr(\"type\", \"image\")";
_button._setattr /*b4j.example.wixelement*/ ("type",(Object)("image"));
 //BA.debugLineNum = 224;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 225;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _settypeimagetop(String _r) throws Exception{
 //BA.debugLineNum = 228;BA.debugLine="Sub SetTypeImageTop(r As String) As WixButton  'ig";
 //BA.debugLineNum = 229;BA.debugLine="Button.SetAttr(\"type\", \"imageTop\")";
_button._setattr /*b4j.example.wixelement*/ ("type",(Object)("imageTop"));
 //BA.debugLineNum = 230;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 231;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _settypestandard(String _i) throws Exception{
 //BA.debugLineNum = 210;BA.debugLine="Sub SetTypeStandard(i As String) As WixButton 'ign";
 //BA.debugLineNum = 211;BA.debugLine="Button.SetAttr(\"type\", \"standard\")";
_button._setattr /*b4j.example.wixelement*/ ("type",(Object)("standard"));
 //BA.debugLineNum = 212;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 213;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 132;BA.debugLine="Sub SetValue(v As String) As WixButton";
 //BA.debugLineNum = 133;BA.debugLine="Button.SetValue(v)";
_button._setvalue /*b4j.example.wixelement*/ (_v);
 //BA.debugLineNum = 134;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 246;BA.debugLine="Sub SetWidth(w As Object) As WixButton";
 //BA.debugLineNum = 247;BA.debugLine="Button.SetWidth(w)";
_button._setwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 248;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 249;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
