package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixsidebar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixsidebar", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixsidebar.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _sidebar = null;
public anywheresoftware.b4a.objects.collections.List _items = null;
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
public b4j.example.wixsidebar  _addimage(String _parentid,String _meid,String _mvalue,String _mhref,String _micon,String _badge,String _target) throws Exception{
b4j.example.uoenowhtml _ih = null;
String _icon = "";
anywheresoftware.b4a.objects.collections.Map _mitem = null;
 //BA.debugLineNum = 33;BA.debugLine="Sub AddImage(parentID As String, meID As String, m";
 //BA.debugLineNum = 34;BA.debugLine="Dim ih As UOENowHTML";
_ih = new b4j.example.uoenowhtml();
 //BA.debugLineNum = 35;BA.debugLine="ih.Initialize(\"\",\"img\").SetImportant(False).SetSR";
_ih._initialize /*b4j.example.uoenowhtml*/ (ba,"","img")._setimportant /*b4j.example.uoenowhtml*/ (__c.False)._setsrc /*b4j.example.uoenowhtml*/ (_micon,__c.True)._addclass /*b4j.example.uoenowhtml*/ ("sidebar-icon");
 //BA.debugLineNum = 36;BA.debugLine="Dim icon As String = ih.html";
_icon = _ih._html /*String*/ ();
 //BA.debugLineNum = 37;BA.debugLine="Log(icon)";
__c.Log(_icon);
 //BA.debugLineNum = 38;BA.debugLine="parentID = parentID.tolowercase";
_parentid = _parentid.toLowerCase();
 //BA.debugLineNum = 39;BA.debugLine="meID = meID.tolowercase";
_meid = _meid.toLowerCase();
 //BA.debugLineNum = 40;BA.debugLine="Dim mitem As Map = CreateMap()";
_mitem = new anywheresoftware.b4a.objects.collections.Map();
_mitem = __c.createMap(new Object[] {});
 //BA.debugLineNum = 41;BA.debugLine="mitem.Put(\"id\", meID)";
_mitem.Put((Object)("id"),(Object)(_meid));
 //BA.debugLineNum = 42;BA.debugLine="mitem.Put(\"value\", mValue)";
_mitem.Put((Object)("value"),(Object)(_mvalue));
 //BA.debugLineNum = 43;BA.debugLine="mitem.Put(\"href\", mhref)";
_mitem.Put((Object)("href"),(Object)(_mhref));
 //BA.debugLineNum = 44;BA.debugLine="mitem.Put(\"badge\", badge)";
_mitem.Put((Object)("badge"),(Object)(_badge));
 //BA.debugLineNum = 45;BA.debugLine="mitem.Put(\"target\", target)";
_mitem.Put((Object)("target"),(Object)(_target));
 //BA.debugLineNum = 46;BA.debugLine="mitem.Put(\"icon\", icon)";
_mitem.Put((Object)("icon"),(Object)(_icon));
 //BA.debugLineNum = 47;BA.debugLine="mitem.Put(\"parentid\", parentID)";
_mitem.Put((Object)("parentid"),(Object)(_parentid));
 //BA.debugLineNum = 48;BA.debugLine="Items.Add(mitem)";
_items.Add((Object)(_mitem.getObject()));
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidebar)(this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidebar  _additem(String _parentid,String _meid,String _mvalue,String _mhref,String _micon,String _badge,String _target) throws Exception{
anywheresoftware.b4a.objects.collections.Map _mitem = null;
 //BA.debugLineNum = 17;BA.debugLine="Sub AddItem(parentID As String, meID As String, mV";
 //BA.debugLineNum = 18;BA.debugLine="parentID = parentID.tolowercase";
_parentid = _parentid.toLowerCase();
 //BA.debugLineNum = 19;BA.debugLine="meID = meID.tolowercase";
_meid = _meid.toLowerCase();
 //BA.debugLineNum = 20;BA.debugLine="Dim mitem As Map = CreateMap()";
_mitem = new anywheresoftware.b4a.objects.collections.Map();
_mitem = __c.createMap(new Object[] {});
 //BA.debugLineNum = 21;BA.debugLine="mitem.Put(\"id\", meID)";
_mitem.Put((Object)("id"),(Object)(_meid));
 //BA.debugLineNum = 22;BA.debugLine="mitem.Put(\"value\", mValue)";
_mitem.Put((Object)("value"),(Object)(_mvalue));
 //BA.debugLineNum = 23;BA.debugLine="mitem.Put(\"href\", mhref)";
_mitem.Put((Object)("href"),(Object)(_mhref));
 //BA.debugLineNum = 24;BA.debugLine="mitem.Put(\"badge\", badge)";
_mitem.Put((Object)("badge"),(Object)(_badge));
 //BA.debugLineNum = 25;BA.debugLine="mitem.Put(\"target\", target)";
_mitem.Put((Object)("target"),(Object)(_target));
 //BA.debugLineNum = 26;BA.debugLine="mitem.Put(\"icon\", mIcon)";
_mitem.Put((Object)("icon"),(Object)(_micon));
 //BA.debugLineNum = 27;BA.debugLine="mitem.Put(\"parentid\", parentID)";
_mitem.Put((Object)("parentid"),(Object)(_parentid));
 //BA.debugLineNum = 28;BA.debugLine="Items.Add(mitem)";
_items.Add((Object)(_mitem.getObject()));
 //BA.debugLineNum = 29;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidebar)(this);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public String  _addtocolumns(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 217;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 218;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 219;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 222;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 223;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 224;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 212;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 213;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 214;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public SideBar As WixElement";
_sidebar = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private Items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixsidebar  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(sid As String) As WixSideBar";
 //BA.debugLineNum = 10;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 11;BA.debugLine="SideBar.Initialize(sid).SetView(\"sidebar\")";
_sidebar._initialize /*b4j.example.wixelement*/ (ba,_sid)._setview /*b4j.example.wixelement*/ ("sidebar");
 //BA.debugLineNum = 12;BA.debugLine="Items.Initialize";
_items.Initialize();
 //BA.debugLineNum = 13;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidebar)(this);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
anywheresoftware.b4a.objects.collections.List _data = null;
 //BA.debugLineNum = 118;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 119;BA.debugLine="If Items.Size > 0 Then";
if (_items.getSize()>0) { 
 //BA.debugLineNum = 120;BA.debugLine="Dim data As List = modWebix.Unflatten(Items,\"dat";
_data = new anywheresoftware.b4a.objects.collections.List();
_data = _modwebix._unflatten /*anywheresoftware.b4a.objects.collections.List*/ (_items,"data");
 //BA.debugLineNum = 121;BA.debugLine="SetData(data)";
_setdata(_data);
 };
 //BA.debugLineNum = 123;BA.debugLine="Return SideBar.item";
if (true) return _sidebar._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidebar  _setactivetitle(boolean _b) throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Sub SetActiveTitle(b As Boolean) As WixSideBar";
 //BA.debugLineNum = 95;BA.debugLine="SideBar.SetAttr(\"activeTitle\", b)";
_sidebar._setattr /*b4j.example.wixelement*/ ("activeTitle",(Object)(_b));
 //BA.debugLineNum = 96;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidebar)(this);
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidebar  _setcollapsed(boolean _b) throws Exception{
 //BA.debugLineNum = 140;BA.debugLine="Sub SetCollapsed(b As Boolean) As WixSideBar";
 //BA.debugLineNum = 141;BA.debugLine="SideBar.SetAttr(\"collapsed\", b)";
_sidebar._setattr /*b4j.example.wixelement*/ ("collapsed",(Object)(_b));
 //BA.debugLineNum = 142;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidebar)(this);
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidebar  _setcollapsedwidth(boolean _h) throws Exception{
 //BA.debugLineNum = 146;BA.debugLine="Sub SetCollapsedWidth(h As Boolean) As WixSideBar";
 //BA.debugLineNum = 147;BA.debugLine="SideBar.SetAttr(\"collapsedWidth\", h)";
_sidebar._setattr /*b4j.example.wixelement*/ ("collapsedWidth",(Object)(_h));
 //BA.debugLineNum = 148;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidebar)(this);
 //BA.debugLineNum = 149;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidebar  _setdata(anywheresoftware.b4a.objects.collections.List _d) throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Sub SetData(d As List) As WixSideBar";
 //BA.debugLineNum = 113;BA.debugLine="SideBar.SetData(d)";
_sidebar._setdata /*b4j.example.wixelement*/ (_d);
 //BA.debugLineNum = 114;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidebar)(this);
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidebar  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 152;BA.debugLine="Sub SetHeight(h As Object) As WixSideBar";
 //BA.debugLineNum = 153;BA.debugLine="SideBar.SetAttr(\"height\", h)";
_sidebar._setattr /*b4j.example.wixelement*/ ("height",_h);
 //BA.debugLineNum = 154;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidebar)(this);
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidebar  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 84;BA.debugLine="Sub SetMap(m As Map) As WixSideBar";
 //BA.debugLineNum = 85;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 86;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 87;BA.debugLine="SideBar.SetAttr(strKey,	strVal)";
_sidebar._setattr /*b4j.example.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 89;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidebar)(this);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidebar  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Sub SetMinHeight(h As Int) As WixSideBar";
 //BA.debugLineNum = 80;BA.debugLine="SideBar.SetMinHeight(h)";
_sidebar._setminheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 81;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidebar)(this);
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidebar  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Sub SetMinWidth(w As Int) As WixSideBar";
 //BA.debugLineNum = 74;BA.debugLine="SideBar.SetMinWidth(w)";
_sidebar._setminwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 75;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidebar)(this);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidebar  _setmultipleopen(boolean _b) throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Sub SetMultipleOpen(b As Boolean) As WixSideBar";
 //BA.debugLineNum = 101;BA.debugLine="SideBar.setAttr(\"multipleOpen\", b)";
_sidebar._setattr /*b4j.example.wixelement*/ ("multipleOpen",(Object)(_b));
 //BA.debugLineNum = 102;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidebar)(this);
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidebar  _setname(String _n) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Sub SetName(n As String) As WixSideBar";
 //BA.debugLineNum = 55;BA.debugLine="SideBar.SetName(n)";
_sidebar._setname /*b4j.example.wixelement*/ (_n);
 //BA.debugLineNum = 56;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidebar)(this);
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidebar  _setposition(String _c) throws Exception{
 //BA.debugLineNum = 191;BA.debugLine="Sub SetPosition(c As String) As WixSideBar";
 //BA.debugLineNum = 192;BA.debugLine="SideBar.SetAttr(\"position\", c)";
_sidebar._setattr /*b4j.example.wixelement*/ ("position",(Object)(_c));
 //BA.debugLineNum = 193;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidebar)(this);
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidebar  _setpositionbottom(String _c) throws Exception{
 //BA.debugLineNum = 184;BA.debugLine="Sub SetPositionBottom(c As String) As WixSideBar";
 //BA.debugLineNum = 185;BA.debugLine="SideBar.SetAttr(\"position\", \"bottom\")";
_sidebar._setattr /*b4j.example.wixelement*/ ("position",(Object)("bottom"));
 //BA.debugLineNum = 186;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidebar)(this);
 //BA.debugLineNum = 187;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidebar  _setpositionleft(String _c) throws Exception{
 //BA.debugLineNum = 172;BA.debugLine="Sub SetPositionLeft(c As String) As WixSideBar  'i";
 //BA.debugLineNum = 173;BA.debugLine="SideBar.SetAttr(\"position\", \"left\")";
_sidebar._setattr /*b4j.example.wixelement*/ ("position",(Object)("left"));
 //BA.debugLineNum = 174;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidebar)(this);
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidebar  _setpositionright(String _c) throws Exception{
 //BA.debugLineNum = 166;BA.debugLine="Sub SetPositionRight(c As String) As WixSideBar  '";
 //BA.debugLineNum = 167;BA.debugLine="SideBar.SetAttr(\"position\", \"right\")";
_sidebar._setattr /*b4j.example.wixelement*/ ("position",(Object)("right"));
 //BA.debugLineNum = 168;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidebar)(this);
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidebar  _setpositiontop(String _c) throws Exception{
 //BA.debugLineNum = 178;BA.debugLine="Sub SetPositionTop(c As String) As WixSideBar  'ig";
 //BA.debugLineNum = 179;BA.debugLine="SideBar.SetAttr(\"position\", \"top\")";
_sidebar._setattr /*b4j.example.wixelement*/ ("position",(Object)("top"));
 //BA.debugLineNum = 180;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidebar)(this);
 //BA.debugLineNum = 181;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidebar  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub SetResponsive(b As Object) As WixSideBar";
 //BA.debugLineNum = 61;BA.debugLine="SideBar.SetResponsive(b)";
_sidebar._setresponsive /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidebar)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidebar  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixSideBar";
 //BA.debugLineNum = 67;BA.debugLine="SideBar.SetResponsiveCell(b)";
_sidebar._setresponsivecell /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 68;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidebar)(this);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidebar  _setscroll(Object _b) throws Exception{
 //BA.debugLineNum = 204;BA.debugLine="Sub SetScroll(b As Object) As WixSideBar";
 //BA.debugLineNum = 205;BA.debugLine="SideBar.SetAttr(\"scroll\", b)";
_sidebar._setattr /*b4j.example.wixelement*/ ("scroll",_b);
 //BA.debugLineNum = 206;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidebar)(this);
 //BA.debugLineNum = 207;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidebar  _setselect(boolean _b) throws Exception{
 //BA.debugLineNum = 198;BA.debugLine="Sub SetSelect(b As Boolean) As WixSideBar";
 //BA.debugLineNum = 199;BA.debugLine="SideBar.SetAttr(\"select\", b)";
_sidebar._setattr /*b4j.example.wixelement*/ ("select",(Object)(_b));
 //BA.debugLineNum = 200;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidebar)(this);
 //BA.debugLineNum = 201;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidebar  _settemplate(String _t) throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="Sub SetTemplate(t As String) As WixSideBar";
 //BA.debugLineNum = 128;BA.debugLine="SideBar.SetTemplate(t)";
_sidebar._settemplate /*b4j.example.wixelement*/ ((Object)(_t));
 //BA.debugLineNum = 129;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidebar)(this);
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidebar  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 133;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixSideBar";
 //BA.debugLineNum = 134;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 135;BA.debugLine="SideBar.SetTemplate(os)";
_sidebar._settemplate /*b4j.example.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 136;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidebar)(this);
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidebar  _settitleheight(int _h) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Sub SetTitleHeight(h As Int) As WixSideBar";
 //BA.debugLineNum = 107;BA.debugLine="SideBar.SetAttr(\"titleHeight\", h)";
_sidebar._setattr /*b4j.example.wixelement*/ ("titleHeight",(Object)(_h));
 //BA.debugLineNum = 108;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidebar)(this);
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidebar  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 159;BA.debugLine="Sub SetWidth(w As Object) As WixSideBar";
 //BA.debugLineNum = 160;BA.debugLine="SideBar.SetAttr(\"width\", w)";
_sidebar._setattr /*b4j.example.wixelement*/ ("width",_w);
 //BA.debugLineNum = 161;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidebar)(this);
 //BA.debugLineNum = 162;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
