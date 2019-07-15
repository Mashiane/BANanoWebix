package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixgooglemap extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixgooglemap", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixgooglemap.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _googlemap = null;
public anywheresoftware.b4a.objects.collections.List _markers = null;
public String _map_type_roadmap = "";
public String _map_type_satellite = "";
public String _map_type_hybrid = "";
public String _map_type_terrain = "";
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
public b4j.example.wixgooglemap  _addmarker(String _mid,double _mlat,double _mlng,String _mtitle,boolean _mcandrag,boolean _mhidden) throws Exception{
anywheresoftware.b4a.objects.collections.Map _marker = null;
 //BA.debugLineNum = 69;BA.debugLine="Sub AddMarker(mID As String, mLat As Double, mLng";
 //BA.debugLineNum = 70;BA.debugLine="Dim Marker As Map = CreateMap()";
_marker = new anywheresoftware.b4a.objects.collections.Map();
_marker = __c.createMap(new Object[] {});
 //BA.debugLineNum = 71;BA.debugLine="Marker.Put(\"id\", mID)";
_marker.Put((Object)("id"),(Object)(_mid));
 //BA.debugLineNum = 72;BA.debugLine="Marker.Put(\"lat\", mLat)";
_marker.Put((Object)("lat"),(Object)(_mlat));
 //BA.debugLineNum = 73;BA.debugLine="Marker.Put(\"lng\", mLng)";
_marker.Put((Object)("lng"),(Object)(_mlng));
 //BA.debugLineNum = 74;BA.debugLine="Marker.Put(\"title\", mTitle)";
_marker.Put((Object)("title"),(Object)(_mtitle));
 //BA.debugLineNum = 75;BA.debugLine="Marker.Put(\"label\", mTitle)";
_marker.Put((Object)("label"),(Object)(_mtitle));
 //BA.debugLineNum = 76;BA.debugLine="Marker.Put(\"draggable\", mCanDrag)";
_marker.Put((Object)("draggable"),(Object)(_mcandrag));
 //BA.debugLineNum = 77;BA.debugLine="Marker.Put(\"hidden\", mHidden)";
_marker.Put((Object)("hidden"),(Object)(_mhidden));
 //BA.debugLineNum = 78;BA.debugLine="Markers.Add(Marker)";
_markers.Add((Object)(_marker.getObject()));
 //BA.debugLineNum = 79;BA.debugLine="Return Me";
if (true) return (b4j.example.wixgooglemap)(this);
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return null;
}
public String  _addtocolumns(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 166;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 167;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 171;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 172;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 161;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 162;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 163;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public GoogleMap As WixElement";
_googlemap = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Public Markers As List";
_markers = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 6;BA.debugLine="Public CONST MAP_TYPE_ROADMAP As String = \"ROADMA";
_map_type_roadmap = "ROADMAP";
 //BA.debugLineNum = 7;BA.debugLine="Public const MAP_TYPE_SATELLITE As String = \"SATE";
_map_type_satellite = "SATELLITE";
 //BA.debugLineNum = 8;BA.debugLine="Public const MAP_TYPE_HYBRID As String = \"HYBRID\"";
_map_type_hybrid = "HYBRID";
 //BA.debugLineNum = 9;BA.debugLine="Public const MAP_TYPE_TERRAIN As String = \"TERRAI";
_map_type_terrain = "TERRAIN";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixgooglemap  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize(sid As String) As WixGoogleM";
 //BA.debugLineNum = 14;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 15;BA.debugLine="GoogleMap.Initialize(ID).setview(\"google-map\")";
_googlemap._initialize /*b4j.example.wixelement*/ (ba,_id)._setview /*b4j.example.wixelement*/ ("google-map");
 //BA.debugLineNum = 16;BA.debugLine="Markers.Initialize";
_markers.Initialize();
 //BA.debugLineNum = 17;BA.debugLine="Return Me";
if (true) return (b4j.example.wixgooglemap)(this);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 84;BA.debugLine="GoogleMap.SetData(Markers)";
_googlemap._setdata /*b4j.example.wixelement*/ (_markers);
 //BA.debugLineNum = 85;BA.debugLine="Return GoogleMap.item";
if (true) return _googlemap._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixgooglemap  _setautowidth(boolean _b) throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Sub SetAutoWidth(b As Boolean) As WixGoogleMap";
 //BA.debugLineNum = 115;BA.debugLine="GoogleMap.SetAttr(\"autowidth\", b)";
_googlemap._setattr /*b4j.example.wixelement*/ ("autowidth",(Object)(_b));
 //BA.debugLineNum = 116;BA.debugLine="Return Me";
if (true) return (b4j.example.wixgooglemap)(this);
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixgooglemap  _setborderless(boolean _b) throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Sub SetBorderLess(b As Boolean) As WixGoogleMap";
 //BA.debugLineNum = 97;BA.debugLine="GoogleMap.SetAttr(\"borderless\", b)";
_googlemap._setattr /*b4j.example.wixelement*/ ("borderless",(Object)(_b));
 //BA.debugLineNum = 98;BA.debugLine="Return Me";
if (true) return (b4j.example.wixgooglemap)(this);
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixgooglemap  _setcenter(double _lng,double _lat) throws Exception{
anywheresoftware.b4a.objects.collections.List _center = null;
 //BA.debugLineNum = 150;BA.debugLine="Sub SetCenter(lng As Double, lat As Double) As Wix";
 //BA.debugLineNum = 151;BA.debugLine="Dim center As List";
_center = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 152;BA.debugLine="center.Initialize";
_center.Initialize();
 //BA.debugLineNum = 153;BA.debugLine="center.Add(lng)";
_center.Add((Object)(_lng));
 //BA.debugLineNum = 154;BA.debugLine="center.Add(lat)";
_center.Add((Object)(_lat));
 //BA.debugLineNum = 155;BA.debugLine="GoogleMap.SetAttr(\"center\", center)";
_googlemap._setattr /*b4j.example.wixelement*/ ("center",(Object)(_center.getObject()));
 //BA.debugLineNum = 156;BA.debugLine="Return Me";
if (true) return (b4j.example.wixgooglemap)(this);
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixgooglemap  _setdata(anywheresoftware.b4a.objects.collections.List _d) throws Exception{
 //BA.debugLineNum = 126;BA.debugLine="Sub SetData(d As List) As WixGoogleMap";
 //BA.debugLineNum = 127;BA.debugLine="Markers = d";
_markers = _d;
 //BA.debugLineNum = 128;BA.debugLine="Return Me";
if (true) return (b4j.example.wixgooglemap)(this);
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixgooglemap  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Sub SetHeight(h As Object) As WixGoogleMap";
 //BA.debugLineNum = 103;BA.debugLine="GoogleMap.SetAttr(\"height\", h)";
_googlemap._setattr /*b4j.example.wixelement*/ ("height",_h);
 //BA.debugLineNum = 104;BA.debugLine="Return Me";
if (true) return (b4j.example.wixgooglemap)(this);
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixgooglemap  _setkey(String _key) throws Exception{
 //BA.debugLineNum = 132;BA.debugLine="Sub SetKey(key As String) As WixGoogleMap";
 //BA.debugLineNum = 133;BA.debugLine="GoogleMap.SetAttr(\"key\", key)";
_googlemap._setattr /*b4j.example.wixelement*/ ("key",(Object)(_key));
 //BA.debugLineNum = 134;BA.debugLine="Return Me";
if (true) return (b4j.example.wixgooglemap)(this);
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixgooglemap  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 59;BA.debugLine="Sub SetMap(m As Map) As WixGoogleMap";
 //BA.debugLineNum = 60;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 61;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 62;BA.debugLine="GoogleMap.SetAttr(strKey,	strVal)";
_googlemap._setattr /*b4j.example.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 64;BA.debugLine="Return Me";
if (true) return (b4j.example.wixgooglemap)(this);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixgooglemap  _setmaptype(String _mt) throws Exception{
 //BA.debugLineNum = 144;BA.debugLine="Sub SetMapType(mt As String) As WixGoogleMap";
 //BA.debugLineNum = 145;BA.debugLine="GoogleMap.SetAttr(\"mapType\", mt)";
_googlemap._setattr /*b4j.example.wixelement*/ ("mapType",(Object)(_mt));
 //BA.debugLineNum = 146;BA.debugLine="Return Me";
if (true) return (b4j.example.wixgooglemap)(this);
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixgooglemap  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub SetMinHeight(h As Int) As WixGoogleMap";
 //BA.debugLineNum = 54;BA.debugLine="GoogleMap.SetMinHeight(h)";
_googlemap._setminheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return (b4j.example.wixgooglemap)(this);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixgooglemap  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub SetMinWidth(w As Int) As WixGoogleMap";
 //BA.debugLineNum = 48;BA.debugLine="GoogleMap.SetMinWidth(w)";
_googlemap._setminwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (b4j.example.wixgooglemap)(this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixgooglemap  _setname(String _n) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Sub SetName(n As String) As WixGoogleMap";
 //BA.debugLineNum = 29;BA.debugLine="GoogleMap.SetName(n)";
_googlemap._setname /*b4j.example.wixelement*/ (_n);
 //BA.debugLineNum = 30;BA.debugLine="Return Me";
if (true) return (b4j.example.wixgooglemap)(this);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixgooglemap  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub SetResponsive(b As Object) As WixGoogleMap";
 //BA.debugLineNum = 35;BA.debugLine="GoogleMap.SetResponsive(b)";
_googlemap._setresponsive /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4j.example.wixgooglemap)(this);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixgooglemap  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixGoogleMap";
 //BA.debugLineNum = 41;BA.debugLine="GoogleMap.SetResponsiveCell(b)";
_googlemap._setresponsivecell /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 42;BA.debugLine="Return Me";
if (true) return (b4j.example.wixgooglemap)(this);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixgooglemap  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 90;BA.debugLine="GoogleMap.SetStyle(prop,val)";
_googlemap._setstyle /*b4j.example.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 91;BA.debugLine="Return Me";
if (true) return (b4j.example.wixgooglemap)(this);
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixgooglemap  _settemplate(String _t) throws Exception{
 //BA.debugLineNum = 120;BA.debugLine="Sub SetTemplate(t As String) As WixGoogleMap";
 //BA.debugLineNum = 121;BA.debugLine="GoogleMap.SetAttr(\"template\", t)";
_googlemap._setattr /*b4j.example.wixelement*/ ("template",(Object)(_t));
 //BA.debugLineNum = 122;BA.debugLine="Return Me";
if (true) return (b4j.example.wixgooglemap)(this);
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixgooglemap  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 21;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixGoogleM";
 //BA.debugLineNum = 22;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 23;BA.debugLine="GoogleMap.SetTemplate(os)";
_googlemap._settemplate /*b4j.example.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 24;BA.debugLine="Return Me";
if (true) return (b4j.example.wixgooglemap)(this);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixgooglemap  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Sub SetWidth(w As Object) As WixGoogleMap";
 //BA.debugLineNum = 109;BA.debugLine="GoogleMap.SetAttr(\"width\", w)";
_googlemap._setattr /*b4j.example.wixelement*/ ("width",_w);
 //BA.debugLineNum = 110;BA.debugLine="Return Me";
if (true) return (b4j.example.wixgooglemap)(this);
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixgooglemap  _setzoom(int _z) throws Exception{
 //BA.debugLineNum = 138;BA.debugLine="Sub SetZoom(z As Int) As WixGoogleMap";
 //BA.debugLineNum = 139;BA.debugLine="GoogleMap.SetAttr(\"zoom\", z)";
_googlemap._setattr /*b4j.example.wixelement*/ ("zoom",(Object)(_z));
 //BA.debugLineNum = 140;BA.debugLine="Return Me";
if (true) return (b4j.example.wixgooglemap)(this);
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
