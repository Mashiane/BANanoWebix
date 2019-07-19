package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixtoggle extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixtoggle", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixtoggle.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _toggle = null;
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
 //BA.debugLineNum = 244;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 245;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 246;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 249;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 250;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 251;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.example.wixform _frm) throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 115;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 239;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 240;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 241;BA.debugLine="End Sub";
return "";
}
public String  _addtotoolbar(b4j.example.wixtoolbar _tblb) throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Sub AddToToolbar(tblB As WixToolBar)";
 //BA.debugLineNum = 120;BA.debugLine="tblB.ToolBar.AddColumns(Item)";
_tblb._toolbar /*b4j.example.wixelement*/ ._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Public Toggle As WixElement";
_toggle = new b4j.example.wixelement();
 //BA.debugLineNum = 6;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.example.wixelement();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixtoggle  _initialize(anywheresoftware.b4a.BA _ba,String _bid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(bID As String) As WixToggle";
 //BA.debugLineNum = 11;BA.debugLine="ID = bID.ToLowerCase";
_id = _bid.toLowerCase();
 //BA.debugLineNum = 12;BA.debugLine="Toggle.Initialize(ID).SetView(\"toggle\")";
_toggle._initialize /*b4j.example.wixelement*/ (ba,_id)._setview /*b4j.example.wixelement*/ ("toggle");
 //BA.debugLineNum = 13;BA.debugLine="Parent = Null";
_parent = (b4j.example.wixelement)(__c.Null);
 //BA.debugLineNum = 14;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoggle)(this);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 130;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 131;BA.debugLine="Return Toggle.item";
if (true) return _toggle._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 110;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixtoggle  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 220;BA.debugLine="Sub SetAlignCenter(r As String) As WixToggle 'igno";
 //BA.debugLineNum = 221;BA.debugLine="Toggle.setAligncenter(\"\")";
_toggle._setaligncenter /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 222;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoggle)(this);
 //BA.debugLineNum = 223;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoggle  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 226;BA.debugLine="Sub SetAlignLeft(r As String) As WixToggle 'ignore";
 //BA.debugLineNum = 227;BA.debugLine="Toggle.SetAlignleft(\"\")";
_toggle._setalignleft /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 228;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoggle)(this);
 //BA.debugLineNum = 229;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoggle  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 214;BA.debugLine="Sub SetAlignRight(r As String) As WixToggle 'ignor";
 //BA.debugLineNum = 215;BA.debugLine="Toggle.setAlignright(\"\")";
_toggle._setalignright /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 216;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoggle)(this);
 //BA.debugLineNum = 217;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoggle  _setautowidth(boolean _b) throws Exception{
 //BA.debugLineNum = 232;BA.debugLine="Sub SetAutoWidth(b As Boolean) As WixToggle 'ignor";
 //BA.debugLineNum = 233;BA.debugLine="Toggle.SetAutoWidth(b)";
_toggle._setautowidth /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 234;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoggle)(this);
 //BA.debugLineNum = 235;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoggle  _setbadge(Object _b) throws Exception{
 //BA.debugLineNum = 18;BA.debugLine="Sub SetBadge(b As Object) As WixToggle";
 //BA.debugLineNum = 19;BA.debugLine="Toggle.SetAttr(\"badge\", b)";
_toggle._setattr /*b4j.example.wixelement*/ ("badge",_b);
 //BA.debugLineNum = 20;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoggle)(this);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoggle  _setbatch(int _b) throws Exception{
 //BA.debugLineNum = 141;BA.debugLine="Sub SetBatch(b As Int) As WixToggle";
 //BA.debugLineNum = 142;BA.debugLine="Toggle.SetBatch(b)";
_toggle._setbatch /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 143;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoggle)(this);
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoggle  _setclick(com.ab.banano.BANanoObject _e) throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Sub SetClick(e As BANanoObject) As WixToggle";
 //BA.debugLineNum = 32;BA.debugLine="Toggle.SetAttr(\"click\", e)";
_toggle._setattr /*b4j.example.wixelement*/ ("click",(Object)(_e));
 //BA.debugLineNum = 33;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoggle)(this);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoggle  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 201;BA.debugLine="Sub SetHeight(h As Object) As WixToggle";
 //BA.debugLineNum = 202;BA.debugLine="Toggle.SetHeight(h)";
_toggle._setheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 203;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoggle)(this);
 //BA.debugLineNum = 204;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoggle  _seticon(String _icn) throws Exception{
 //BA.debugLineNum = 153;BA.debugLine="Sub SetIcon(icn As String) As WixToggle";
 //BA.debugLineNum = 154;BA.debugLine="Toggle.SetAttr(\"icon\", icn)";
_toggle._setattr /*b4j.example.wixelement*/ ("icon",(Object)(_icn));
 //BA.debugLineNum = 155;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoggle)(this);
 //BA.debugLineNum = 156;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoggle  _setimage(String _img) throws Exception{
 //BA.debugLineNum = 147;BA.debugLine="Sub SetImage(img As String) As WixToggle";
 //BA.debugLineNum = 148;BA.debugLine="Toggle.SetAttr(\"image\", img)";
_toggle._setattr /*b4j.example.wixelement*/ ("image",(Object)(_img));
 //BA.debugLineNum = 149;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoggle)(this);
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoggle  _setinputwidth(int _w) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub SetInputWidth(w As Int) As WixToggle";
 //BA.debugLineNum = 79;BA.debugLine="Toggle.SetInputWidth(w)";
_toggle._setinputwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 80;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoggle)(this);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoggle  _setlabel(String _lbl) throws Exception{
 //BA.debugLineNum = 171;BA.debugLine="Sub SetLabel(lbl As String) As WixToggle";
 //BA.debugLineNum = 172;BA.debugLine="Toggle.SetLabel(lbl)";
_toggle._setlabel /*b4j.example.wixelement*/ (_lbl);
 //BA.debugLineNum = 173;BA.debugLine="Toggle.Setvalue(lbl)";
_toggle._setvalue /*b4j.example.wixelement*/ (_lbl);
 //BA.debugLineNum = 174;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoggle)(this);
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoggle  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 68;BA.debugLine="Sub SetMap(m As Map) As WixToggle";
 //BA.debugLineNum = 69;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 70;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 71;BA.debugLine="Toggle.SetAttr(strKey,	strVal)";
_toggle._setattr /*b4j.example.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 73;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoggle)(this);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoggle  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Sub SetMinHeight(h As Int) As WixToggle";
 //BA.debugLineNum = 63;BA.debugLine="Toggle.SetMinHeight(h)";
_toggle._setminheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 64;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoggle)(this);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoggle  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Sub SetMinWidth(w As Int) As WixToggle";
 //BA.debugLineNum = 57;BA.debugLine="Toggle.SetMinWidth(w)";
_toggle._setminwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 58;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoggle)(this);
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoggle  _setname(String _n) throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Sub SetName(n As String) As WixToggle";
 //BA.debugLineNum = 38;BA.debugLine="Toggle.SetName(n)";
_toggle._setname /*b4j.example.wixelement*/ (_n);
 //BA.debugLineNum = 39;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoggle)(this);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoggle  _setofficon(String _icn) throws Exception{
 //BA.debugLineNum = 165;BA.debugLine="Sub SetOffIcon(icn As String) As WixToggle";
 //BA.debugLineNum = 166;BA.debugLine="Toggle.SetAttr(\"offIcon\", icn)";
_toggle._setattr /*b4j.example.wixelement*/ ("offIcon",(Object)(_icn));
 //BA.debugLineNum = 167;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoggle)(this);
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoggle  _setofflabel(String _l) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub SetOffLabel(l As String) As WixToggle";
 //BA.debugLineNum = 98;BA.debugLine="Toggle.SetAttr(\"offLabel\", l)";
_toggle._setattr /*b4j.example.wixelement*/ ("offLabel",(Object)(_l));
 //BA.debugLineNum = 99;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoggle)(this);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoggle  _setonicon(String _icn) throws Exception{
 //BA.debugLineNum = 159;BA.debugLine="Sub SetOnIcon(icn As String) As WixToggle";
 //BA.debugLineNum = 160;BA.debugLine="Toggle.SetAttr(\"onIcon\",icn)";
_toggle._setattr /*b4j.example.wixelement*/ ("onIcon",(Object)(_icn));
 //BA.debugLineNum = 161;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoggle)(this);
 //BA.debugLineNum = 162;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoggle  _setonlabel(String _l) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Sub SetOnLabel(l As String) As WixToggle";
 //BA.debugLineNum = 104;BA.debugLine="Toggle.SetAttr(\"onLabel\", l)";
_toggle._setattr /*b4j.example.wixelement*/ ("onLabel",(Object)(_l));
 //BA.debugLineNum = 105;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoggle)(this);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoggle  _setparent(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 135;BA.debugLine="Sub SetParent(p As WixElement) As WixToggle";
 //BA.debugLineNum = 136;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 137;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoggle)(this);
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoggle  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Sub SetResponsive(b As Object) As WixToggle";
 //BA.debugLineNum = 44;BA.debugLine="Toggle.SetResponsive(b)";
_toggle._setresponsive /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 45;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoggle)(this);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoggle  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixToggle";
 //BA.debugLineNum = 50;BA.debugLine="Toggle.SetResponsiveCell(b)";
_toggle._setresponsivecell /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 51;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoggle)(this);
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoggle  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 91;BA.debugLine="Toggle.SetStyle(prop,val)";
_toggle._setstyle /*b4j.example.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 92;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoggle)(this);
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoggle  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 24;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixToggle";
 //BA.debugLineNum = 25;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 26;BA.debugLine="Toggle.SetTemplate(os)";
_toggle._settemplate /*b4j.example.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 27;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoggle)(this);
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoggle  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub SetTooltip(tt As String) As WixToggle";
 //BA.debugLineNum = 85;BA.debugLine="Toggle.SetAttr(\"tooltip\", tt)";
_toggle._setattr /*b4j.example.wixelement*/ ("tooltip",(Object)(_tt));
 //BA.debugLineNum = 86;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoggle)(this);
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoggle  _settypeicon(String _i) throws Exception{
 //BA.debugLineNum = 178;BA.debugLine="Sub SetTypeIcon(i As String) As WixToggle 'ignore";
 //BA.debugLineNum = 179;BA.debugLine="Toggle.SetAttr(\"type\",\"icon\")";
_toggle._setattr /*b4j.example.wixelement*/ ("type",(Object)("icon"));
 //BA.debugLineNum = 180;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoggle)(this);
 //BA.debugLineNum = 181;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoggle  _settypeicontop(String _r) throws Exception{
 //BA.debugLineNum = 190;BA.debugLine="Sub SetTypeIconTop(r As String) As WixToggle  'ign";
 //BA.debugLineNum = 191;BA.debugLine="Toggle.SetAttr(\"type\",\"iconTop\")";
_toggle._setattr /*b4j.example.wixelement*/ ("type",(Object)("iconTop"));
 //BA.debugLineNum = 192;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoggle)(this);
 //BA.debugLineNum = 193;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoggle  _settypeimage(String _r) throws Exception{
 //BA.debugLineNum = 184;BA.debugLine="Sub SetTypeImage(r As String) As WixToggle  'ignor";
 //BA.debugLineNum = 185;BA.debugLine="Toggle.SetAttr(\"type\",\"image\")";
_toggle._setattr /*b4j.example.wixelement*/ ("type",(Object)("image"));
 //BA.debugLineNum = 186;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoggle)(this);
 //BA.debugLineNum = 187;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoggle  _settypeimagetop(String _r) throws Exception{
 //BA.debugLineNum = 195;BA.debugLine="Sub SetTypeImageTop(r As String) As WixToggle  'ig";
 //BA.debugLineNum = 196;BA.debugLine="Toggle.SetAttr(\"type\",\"imageTop\")";
_toggle._setattr /*b4j.example.wixelement*/ ("type",(Object)("imageTop"));
 //BA.debugLineNum = 197;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoggle)(this);
 //BA.debugLineNum = 198;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoggle  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 124;BA.debugLine="Sub SetValue(v As String) As WixToggle";
 //BA.debugLineNum = 125;BA.debugLine="Toggle.SetValue(v)";
_toggle._setvalue /*b4j.example.wixelement*/ (_v);
 //BA.debugLineNum = 126;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoggle)(this);
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoggle  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 207;BA.debugLine="Sub SetWidth(w As Object) As WixToggle";
 //BA.debugLineNum = 208;BA.debugLine="Toggle.SetWidth(w)";
_toggle._setwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 209;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoggle)(this);
 //BA.debugLineNum = 210;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
