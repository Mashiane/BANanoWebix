package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixsidemenu extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixsidemenu", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixsidemenu.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _sidemenu = null;
public b4j.example.wixelement _body = null;
public anywheresoftware.b4a.objects.collections.List _data = null;
public anywheresoftware.b4a.objects.collections.Map _typeof = null;
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
public b4j.example.wixsidemenu  _additem(String _meid,String _mvalue,String _mhref,String _micon,String _badge,String _target) throws Exception{
anywheresoftware.b4a.objects.collections.Map _mitem = null;
 //BA.debugLineNum = 21;BA.debugLine="Sub AddItem(meID As String, mValue As String, mhre";
 //BA.debugLineNum = 22;BA.debugLine="meID = meID.tolowercase";
_meid = _meid.toLowerCase();
 //BA.debugLineNum = 23;BA.debugLine="Dim mitem As Map = CreateMap()";
_mitem = new anywheresoftware.b4a.objects.collections.Map();
_mitem = __c.createMap(new Object[] {});
 //BA.debugLineNum = 24;BA.debugLine="mitem.Put(\"id\", meID)";
_mitem.Put((Object)("id"),(Object)(_meid));
 //BA.debugLineNum = 25;BA.debugLine="mitem.Put(\"value\", mValue)";
_mitem.Put((Object)("value"),(Object)(_mvalue));
 //BA.debugLineNum = 26;BA.debugLine="mitem.Put(\"href\", mhref)";
_mitem.Put((Object)("href"),(Object)(_mhref));
 //BA.debugLineNum = 27;BA.debugLine="mitem.Put(\"badge\", badge)";
_mitem.Put((Object)("badge"),(Object)(_badge));
 //BA.debugLineNum = 28;BA.debugLine="mitem.Put(\"target\", target)";
_mitem.Put((Object)("target"),(Object)(_target));
 //BA.debugLineNum = 29;BA.debugLine="mitem.Put(\"icon\", mIcon)";
_mitem.Put((Object)("icon"),(Object)(_micon));
 //BA.debugLineNum = 30;BA.debugLine="data.Add(mitem)";
_data.Add((Object)(_mitem.getObject()));
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidemenu)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public String  _addtocolumns(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 182;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 183;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 187;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 188;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 189;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 177;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 178;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public SideMenu As WixElement";
_sidemenu = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private body As WixElement";
_body = new b4j.example.wixelement();
 //BA.debugLineNum = 6;BA.debugLine="Private data As List";
_data = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 7;BA.debugLine="Private typeOf As Map";
_typeof = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixsidemenu  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(sid As String) As WixSideMen";
 //BA.debugLineNum = 12;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 13;BA.debugLine="SideMenu.Initialize(sid).SetView(\"sidemenu\")";
_sidemenu._initialize /*b4j.example.wixelement*/ (ba,_sid)._setview /*b4j.example.wixelement*/ ("sidemenu");
 //BA.debugLineNum = 14;BA.debugLine="body.Initialize(ID & \"body\").SetView(\"list\").SetB";
_body._initialize /*b4j.example.wixelement*/ (ba,_id+"body")._setview /*b4j.example.wixelement*/ ("list")._setborderless /*b4j.example.wixelement*/ (__c.True)._setscroll /*b4j.example.wixelement*/ ((Object)(__c.False))._setselect /*b4j.example.wixelement*/ (__c.True);
 //BA.debugLineNum = 15;BA.debugLine="data.Initialize";
_data.Initialize();
 //BA.debugLineNum = 16;BA.debugLine="typeOf.Initialize";
_typeof.Initialize();
 //BA.debugLineNum = 17;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidemenu)(this);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 91;BA.debugLine="body.SetAttr(\"type\", typeOf)";
_body._setattr /*b4j.example.wixelement*/ ("type",(Object)(_typeof.getObject()));
 //BA.debugLineNum = 92;BA.debugLine="body.SetData(data)";
_body._setdata /*b4j.example.wixelement*/ (_data);
 //BA.debugLineNum = 93;BA.debugLine="SideMenu.SetAttr(\"body\", body.item)";
_sidemenu._setattr /*b4j.example.wixelement*/ ("body",(Object)(_body._item /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 94;BA.debugLine="Return SideMenu.item";
if (true) return _sidemenu._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidemenu  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 105;BA.debugLine="Sub SetHeight(h As Object) As WixSideMenu";
 //BA.debugLineNum = 106;BA.debugLine="SideMenu.SetAttr(\"height\", h)";
_sidemenu._setattr /*b4j.example.wixelement*/ ("height",_h);
 //BA.debugLineNum = 107;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidemenu)(this);
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidemenu  _setitemheight(int _h) throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Sub SetItemHeight(h As Int) As WixSideMenu";
 //BA.debugLineNum = 113;BA.debugLine="typeOf.Put(\"height\", h)";
_typeof.Put((Object)("height"),(Object)(_h));
 //BA.debugLineNum = 114;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidemenu)(this);
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidemenu  _setitemwidth(int _w) throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Sub SetItemWidth(w As Int) As WixSideMenu";
 //BA.debugLineNum = 119;BA.debugLine="typeOf.Put(\"width\", w)";
_typeof.Put((Object)("width"),(Object)(_w));
 //BA.debugLineNum = 120;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidemenu)(this);
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidemenu  _setlayoutx(boolean _h) throws Exception{
 //BA.debugLineNum = 125;BA.debugLine="Sub SetLayoutX(h As Boolean) As WixSideMenu   'ign";
 //BA.debugLineNum = 126;BA.debugLine="body.SetAttr(\"layout\", \"x\")";
_body._setattr /*b4j.example.wixelement*/ ("layout",(Object)("x"));
 //BA.debugLineNum = 127;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidemenu)(this);
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidemenu  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 73;BA.debugLine="Sub SetMap(m As Map) As WixSideMenu";
 //BA.debugLineNum = 74;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 75;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 76;BA.debugLine="SideMenu.SetAttr(strKey,	strVal)";
_sidemenu._setattr /*b4j.example.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 78;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidemenu)(this);
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidemenu  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Sub SetMinHeight(h As Int) As WixSideMenu";
 //BA.debugLineNum = 68;BA.debugLine="SideMenu.SetMinHeight(h)";
_sidemenu._setminheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 69;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidemenu)(this);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidemenu  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub SetMinWidth(w As Int) As WixSideMenu";
 //BA.debugLineNum = 62;BA.debugLine="SideMenu.SetMinWidth(w)";
_sidemenu._setminwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 63;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidemenu)(this);
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidemenu  _setname(String _n) throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Sub SetName(n As String) As WixSideMenu";
 //BA.debugLineNum = 43;BA.debugLine="SideMenu.SetName(n)";
_sidemenu._setname /*b4j.example.wixelement*/ (_n);
 //BA.debugLineNum = 44;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidemenu)(this);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidemenu  _setposition(String _c) throws Exception{
 //BA.debugLineNum = 170;BA.debugLine="Sub SetPosition(c As String) As WixSideMenu";
 //BA.debugLineNum = 171;BA.debugLine="SideMenu.SetAttr(\"position\", c)";
_sidemenu._setattr /*b4j.example.wixelement*/ ("position",(Object)(_c));
 //BA.debugLineNum = 172;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidemenu)(this);
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidemenu  _setpositionbottom(String _c) throws Exception{
 //BA.debugLineNum = 163;BA.debugLine="Sub SetPositionBottom(c As String) As WixSideMenu";
 //BA.debugLineNum = 164;BA.debugLine="SideMenu.SetAttr(\"position\", \"bottom\")";
_sidemenu._setattr /*b4j.example.wixelement*/ ("position",(Object)("bottom"));
 //BA.debugLineNum = 165;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidemenu)(this);
 //BA.debugLineNum = 166;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidemenu  _setpositionleft(String _c) throws Exception{
 //BA.debugLineNum = 151;BA.debugLine="Sub SetPositionLeft(c As String) As WixSideMenu  '";
 //BA.debugLineNum = 152;BA.debugLine="SideMenu.SetAttr(\"position\", \"left\")";
_sidemenu._setattr /*b4j.example.wixelement*/ ("position",(Object)("left"));
 //BA.debugLineNum = 153;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidemenu)(this);
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidemenu  _setpositionright(String _c) throws Exception{
 //BA.debugLineNum = 145;BA.debugLine="Sub SetPositionRight(c As String) As WixSideMenu";
 //BA.debugLineNum = 146;BA.debugLine="SideMenu.SetAttr(\"position\", \"right\")";
_sidemenu._setattr /*b4j.example.wixelement*/ ("position",(Object)("right"));
 //BA.debugLineNum = 147;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidemenu)(this);
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidemenu  _setpositiontop(String _c) throws Exception{
 //BA.debugLineNum = 157;BA.debugLine="Sub SetPositionTop(c As String) As WixSideMenu  'i";
 //BA.debugLineNum = 158;BA.debugLine="SideMenu.SetAttr(\"position\", \"top\")";
_sidemenu._setattr /*b4j.example.wixelement*/ ("position",(Object)("top"));
 //BA.debugLineNum = 159;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidemenu)(this);
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidemenu  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Sub SetResponsive(b As Object) As WixSideMenu";
 //BA.debugLineNum = 49;BA.debugLine="SideMenu.SetResponsive(b)";
_sidemenu._setresponsive /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 50;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidemenu)(this);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidemenu  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixSideMenu";
 //BA.debugLineNum = 55;BA.debugLine="SideMenu.SetResponsiveCell(b)";
_sidemenu._setresponsivecell /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 56;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidemenu)(this);
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidemenu  _setscroll(Object _b) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub SetScroll(b As Object) As WixSideMenu";
 //BA.debugLineNum = 85;BA.debugLine="SideMenu.SetAttr(\"scroll\", b)";
_sidemenu._setattr /*b4j.example.wixelement*/ ("scroll",_b);
 //BA.debugLineNum = 86;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidemenu)(this);
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidemenu  _setselect(Object _s) throws Exception{
 //BA.debugLineNum = 139;BA.debugLine="Sub SetSelect(s As Object) As WixSideMenu";
 //BA.debugLineNum = 140;BA.debugLine="SideMenu.SetAttr(\"select\", s)";
_sidemenu._setattr /*b4j.example.wixelement*/ ("select",_s);
 //BA.debugLineNum = 141;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidemenu)(this);
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidemenu  _settemplate(String _t) throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Sub SetTemplate(t As String) As WixSideMenu";
 //BA.debugLineNum = 99;BA.debugLine="body.SetTemplate(t)";
_body._settemplate /*b4j.example.wixelement*/ ((Object)(_t));
 //BA.debugLineNum = 100;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidemenu)(this);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidemenu  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 35;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixSideMen";
 //BA.debugLineNum = 36;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 37;BA.debugLine="SideMenu.SetTemplate(os)";
_sidemenu._settemplate /*b4j.example.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 38;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidemenu)(this);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidemenu  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 132;BA.debugLine="Sub SetWidth(w As Object) As WixSideMenu";
 //BA.debugLineNum = 133;BA.debugLine="SideMenu.SetAttr(\"width\", w)";
_sidemenu._setattr /*b4j.example.wixelement*/ ("width",_w);
 //BA.debugLineNum = 134;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidemenu)(this);
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
