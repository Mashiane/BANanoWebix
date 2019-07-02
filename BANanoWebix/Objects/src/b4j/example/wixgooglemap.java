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
public b4j.example.pgvideo _pgvideo = null;
public b4j.example.pgtabbar _pgtabbar = null;
public b4j.example.pgtree _pgtree = null;
public b4j.example.pgmenu _pgmenu = null;
public b4j.example.pglist _pglist = null;
public b4j.example.pgdataview _pgdataview = null;
public b4j.example.pgdatatable1 _pgdatatable1 = null;
public b4j.example.pgdatatable _pgdatatable = null;
public b4j.example.pgcharts _pgcharts = null;
public b4j.example.pgdataentry _pgdataentry = null;
public b4j.example.pgforms1 _pgforms1 = null;
public b4j.example.pgforms _pgforms = null;
public b4j.example.pgtoolbar _pgtoolbar = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.pgmultiview _pgmultiview = null;
public b4j.example.pglayouts1 _pglayouts1 = null;
public b4j.example.pglayouts2 _pglayouts2 = null;
public b4j.example.pglayouts _pglayouts = null;
public b4j.example.pglayout _pglayout = null;
public b4j.example.pgunitlist _pgunitlist = null;
public b4j.example.pgpropertysheet _pgpropertysheet = null;
public b4j.example.pgtreetable _pgtreetable = null;
public b4j.example.pgsidebar _pgsidebar = null;
public b4j.example.pgcomments _pgcomments = null;
public b4j.example.pggrouplist _pggrouplist = null;
public b4j.example.pgcontext _pgcontext = null;
public b4j.example.pggooglemap _pggooglemap = null;
public b4j.example.pguploader1 _pguploader1 = null;
public b4j.example.pguploader2 _pguploader2 = null;
public b4j.example.pguploader3 _pguploader3 = null;
public b4j.example.wixgooglemap  _addmarker(String _mid,double _mlat,double _mlng,String _mtitle,boolean _mcandrag,boolean _mhidden) throws Exception{
anywheresoftware.b4a.objects.collections.Map _marker = null;
 //BA.debugLineNum = 21;BA.debugLine="Sub AddMarker(mID As String, mLat As Double, mLng";
 //BA.debugLineNum = 22;BA.debugLine="Dim Marker As Map = CreateMap()";
_marker = new anywheresoftware.b4a.objects.collections.Map();
_marker = __c.createMap(new Object[] {});
 //BA.debugLineNum = 23;BA.debugLine="Marker.Put(\"id\", mID)";
_marker.Put((Object)("id"),(Object)(_mid));
 //BA.debugLineNum = 24;BA.debugLine="Marker.Put(\"lat\", mLat)";
_marker.Put((Object)("lat"),(Object)(_mlat));
 //BA.debugLineNum = 25;BA.debugLine="Marker.Put(\"lng\", mLng)";
_marker.Put((Object)("lng"),(Object)(_mlng));
 //BA.debugLineNum = 26;BA.debugLine="Marker.Put(\"title\", mTitle)";
_marker.Put((Object)("title"),(Object)(_mtitle));
 //BA.debugLineNum = 27;BA.debugLine="Marker.Put(\"label\", mTitle)";
_marker.Put((Object)("label"),(Object)(_mtitle));
 //BA.debugLineNum = 28;BA.debugLine="Marker.Put(\"draggable\", mCanDrag)";
_marker.Put((Object)("draggable"),(Object)(_mcandrag));
 //BA.debugLineNum = 29;BA.debugLine="Marker.Put(\"hidden\", mHidden)";
_marker.Put((Object)("hidden"),(Object)(_mhidden));
 //BA.debugLineNum = 30;BA.debugLine="Markers.Add(Marker)";
_markers.Add((Object)(_marker.getObject()));
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.example.wixgooglemap)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
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
 //BA.debugLineNum = 35;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 36;BA.debugLine="GoogleMap.SetData(Markers)";
_googlemap._setdata /*b4j.example.wixelement*/ (_markers);
 //BA.debugLineNum = 37;BA.debugLine="Return GoogleMap.item";
if (true) return _googlemap._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixgooglemap  _setautowidth(boolean _b) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub SetAutoWidth(b As Boolean) As WixGoogleMap";
 //BA.debugLineNum = 67;BA.debugLine="GoogleMap.SetAttr(\"autowidth\", b)";
_googlemap._setattr /*b4j.example.wixelement*/ ("autowidth",(Object)(_b));
 //BA.debugLineNum = 68;BA.debugLine="Return Me";
if (true) return (b4j.example.wixgooglemap)(this);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixgooglemap  _setborderless(boolean _b) throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Sub SetBorderLess(b As Boolean) As WixGoogleMap";
 //BA.debugLineNum = 49;BA.debugLine="GoogleMap.SetAttr(\"borderless\", b)";
_googlemap._setattr /*b4j.example.wixelement*/ ("borderless",(Object)(_b));
 //BA.debugLineNum = 50;BA.debugLine="Return Me";
if (true) return (b4j.example.wixgooglemap)(this);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixgooglemap  _setcenter(double _lng,double _lat) throws Exception{
anywheresoftware.b4a.objects.collections.List _center = null;
 //BA.debugLineNum = 102;BA.debugLine="Sub SetCenter(lng As Double, lat As Double) As Wix";
 //BA.debugLineNum = 103;BA.debugLine="Dim center As List";
_center = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 104;BA.debugLine="center.Initialize";
_center.Initialize();
 //BA.debugLineNum = 105;BA.debugLine="center.Add(lng)";
_center.Add((Object)(_lng));
 //BA.debugLineNum = 106;BA.debugLine="center.Add(lat)";
_center.Add((Object)(_lat));
 //BA.debugLineNum = 107;BA.debugLine="GoogleMap.SetAttr(\"center\", center)";
_googlemap._setattr /*b4j.example.wixelement*/ ("center",(Object)(_center.getObject()));
 //BA.debugLineNum = 108;BA.debugLine="Return Me";
if (true) return (b4j.example.wixgooglemap)(this);
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixgooglemap  _setdata(anywheresoftware.b4a.objects.collections.List _d) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub SetData(d As List) As WixGoogleMap";
 //BA.debugLineNum = 79;BA.debugLine="Markers = d";
_markers = _d;
 //BA.debugLineNum = 80;BA.debugLine="Return Me";
if (true) return (b4j.example.wixgooglemap)(this);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixgooglemap  _setheight(int _h) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Sub SetHeight(h As Int) As WixGoogleMap";
 //BA.debugLineNum = 55;BA.debugLine="GoogleMap.SetAttr(\"height\", h)";
_googlemap._setattr /*b4j.example.wixelement*/ ("height",(Object)(_h));
 //BA.debugLineNum = 56;BA.debugLine="Return Me";
if (true) return (b4j.example.wixgooglemap)(this);
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixgooglemap  _setkey(String _key) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub SetKey(key As String) As WixGoogleMap";
 //BA.debugLineNum = 85;BA.debugLine="GoogleMap.SetAttr(\"key\", key)";
_googlemap._setattr /*b4j.example.wixelement*/ ("key",(Object)(_key));
 //BA.debugLineNum = 86;BA.debugLine="Return Me";
if (true) return (b4j.example.wixgooglemap)(this);
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixgooglemap  _setmaptype(String _mt) throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Sub SetMapType(mt As String) As WixGoogleMap";
 //BA.debugLineNum = 97;BA.debugLine="GoogleMap.SetAttr(\"mapType\", mt)";
_googlemap._setattr /*b4j.example.wixelement*/ ("mapType",(Object)(_mt));
 //BA.debugLineNum = 98;BA.debugLine="Return Me";
if (true) return (b4j.example.wixgooglemap)(this);
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixgooglemap  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 42;BA.debugLine="GoogleMap.SetStyle(prop,val)";
_googlemap._setstyle /*b4j.example.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 43;BA.debugLine="Return Me";
if (true) return (b4j.example.wixgooglemap)(this);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixgooglemap  _settemplate(String _t) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Sub SetTemplate(t As String) As WixGoogleMap";
 //BA.debugLineNum = 73;BA.debugLine="GoogleMap.SetAttr(\"template\", t)";
_googlemap._setattr /*b4j.example.wixelement*/ ("template",(Object)(_t));
 //BA.debugLineNum = 74;BA.debugLine="Return Me";
if (true) return (b4j.example.wixgooglemap)(this);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixgooglemap  _setwidth(int _w) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub SetWidth(w As Int) As WixGoogleMap";
 //BA.debugLineNum = 61;BA.debugLine="GoogleMap.SetAttr(\"width\", w)";
_googlemap._setattr /*b4j.example.wixelement*/ ("width",(Object)(_w));
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (b4j.example.wixgooglemap)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixgooglemap  _setzoom(int _z) throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Sub SetZoom(z As Int) As WixGoogleMap";
 //BA.debugLineNum = 91;BA.debugLine="GoogleMap.SetAttr(\"zoom\", z)";
_googlemap._setattr /*b4j.example.wixelement*/ ("zoom",(Object)(_z));
 //BA.debugLineNum = 92;BA.debugLine="Return Me";
if (true) return (b4j.example.wixgooglemap)(this);
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
