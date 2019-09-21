package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixgooglemap extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixgooglemap", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixgooglemap.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _googlemap = null;
public anywheresoftware.b4a.objects.collections.List _markers = null;
public String _map_type_roadmap = "";
public String _map_type_satellite = "";
public String _map_type_hybrid = "";
public String _map_type_terrain = "";
public com.ab.banano.BANano _banano = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public b4j.Mashy.BANanoWebixDemo.wixgooglemap  _addmarker(String _mid,double _mlat,double _mlng,String _mtitle,boolean _mcandrag,boolean _mhidden) throws Exception{
anywheresoftware.b4a.objects.collections.Map _marker = null;
 //BA.debugLineNum = 121;BA.debugLine="Sub AddMarker(mID As String, mLat As Double, mLng";
 //BA.debugLineNum = 122;BA.debugLine="Dim Marker As Map = CreateMap()";
_marker = new anywheresoftware.b4a.objects.collections.Map();
_marker = __c.createMap(new Object[] {});
 //BA.debugLineNum = 123;BA.debugLine="Marker.Put(\"id\", mID)";
_marker.Put((Object)("id"),(Object)(_mid));
 //BA.debugLineNum = 124;BA.debugLine="Marker.Put(\"lat\", mLat)";
_marker.Put((Object)("lat"),(Object)(_mlat));
 //BA.debugLineNum = 125;BA.debugLine="Marker.Put(\"lng\", mLng)";
_marker.Put((Object)("lng"),(Object)(_mlng));
 //BA.debugLineNum = 126;BA.debugLine="Marker.Put(\"title\", mTitle)";
_marker.Put((Object)("title"),(Object)(_mtitle));
 //BA.debugLineNum = 127;BA.debugLine="Marker.Put(\"label\", mTitle)";
_marker.Put((Object)("label"),(Object)(_mtitle));
 //BA.debugLineNum = 128;BA.debugLine="Marker.Put(\"draggable\", mCanDrag)";
_marker.Put((Object)("draggable"),(Object)(_mcandrag));
 //BA.debugLineNum = 129;BA.debugLine="Marker.Put(\"hidden\", mHidden)";
_marker.Put((Object)("hidden"),(Object)(_mhidden));
 //BA.debugLineNum = 130;BA.debugLine="Markers.Add(Marker)";
_markers.Add((Object)(_marker.getObject()));
 //BA.debugLineNum = 131;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgooglemap)(this);
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return null;
}
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 217;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 218;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 219;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 222;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 223;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 224;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 212;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 213;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 214;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public GoogleMap As WixElement";
_googlemap = new b4j.Mashy.BANanoWebixDemo.wixelement();
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
 //BA.debugLineNum = 10;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 11;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixgooglemap  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 52;BA.debugLine="Public Sub Initialize(sid As String) As WixGoogleM";
 //BA.debugLineNum = 53;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 54;BA.debugLine="GoogleMap.Initialize(ID).setview(\"google-map\")";
_googlemap._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_id)._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("google-map");
 //BA.debugLineNum = 55;BA.debugLine="Markers.Initialize";
_markers.Initialize();
 //BA.debugLineNum = 56;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 57;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgooglemap)(this);
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 135;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 136;BA.debugLine="GoogleMap.SetData(Markers)";
_googlemap._setdata /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_markers);
 //BA.debugLineNum = 137;BA.debugLine="Return GoogleMap.item";
if (true) return _googlemap._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 69;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixgooglemap  _setanimate(boolean _animate) throws Exception{
 //BA.debugLineNum = 227;BA.debugLine="Sub SetAnimate(animate As Boolean) As WixGoogleMap";
 //BA.debugLineNum = 228;BA.debugLine="GoogleMap.SetAttr(\"animate\", animate)";
_googlemap._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("animate",(Object)(_animate));
 //BA.debugLineNum = 229;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgooglemap)(this);
 //BA.debugLineNum = 230;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgooglemap  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 28;BA.debugLine="Sub SetAttributes(m As Map) As WixGoogleMap";
 //BA.debugLineNum = 29;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 30;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 31;BA.debugLine="GoogleMap.SetAttr(k,v)";
_googlemap._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 33;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgooglemap)(this);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgooglemap  _setautowidth(boolean _b) throws Exception{
 //BA.debugLineNum = 160;BA.debugLine="Sub SetAutoWidth(b As Boolean) As WixGoogleMap";
 //BA.debugLineNum = 161;BA.debugLine="GoogleMap.SetAttr(\"autowidth\", b)";
_googlemap._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("autowidth",(Object)(_b));
 //BA.debugLineNum = 162;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgooglemap)(this);
 //BA.debugLineNum = 163;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgooglemap  _setborderless(boolean _b) throws Exception{
 //BA.debugLineNum = 142;BA.debugLine="Sub SetBorderLess(b As Boolean) As WixGoogleMap";
 //BA.debugLineNum = 143;BA.debugLine="GoogleMap.SetAttr(\"borderless\", b)";
_googlemap._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("borderless",(Object)(_b));
 //BA.debugLineNum = 144;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgooglemap)(this);
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgooglemap  _setcenter(double _lng,double _lat) throws Exception{
anywheresoftware.b4a.objects.collections.List _center = null;
 //BA.debugLineNum = 196;BA.debugLine="Sub SetCenter(lng As Double, lat As Double) As Wix";
 //BA.debugLineNum = 197;BA.debugLine="Dim center As List";
_center = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 198;BA.debugLine="center.Initialize";
_center.Initialize();
 //BA.debugLineNum = 199;BA.debugLine="center.Add(lng)";
_center.Add((Object)(_lng));
 //BA.debugLineNum = 200;BA.debugLine="center.Add(lat)";
_center.Add((Object)(_lat));
 //BA.debugLineNum = 201;BA.debugLine="GoogleMap.SetAttr(\"center\", center)";
_googlemap._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("center",(Object)(_center.getObject()));
 //BA.debugLineNum = 202;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgooglemap)(this);
 //BA.debugLineNum = 203;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgooglemap  _setcenterjson(String _json) throws Exception{
anywheresoftware.b4a.objects.collections.List _center = null;
 //BA.debugLineNum = 205;BA.debugLine="Sub SetCenterJSON(json As String) As WixGoogleMap";
 //BA.debugLineNum = 206;BA.debugLine="Dim center As List = BANano.FromJson(json)";
_center = new anywheresoftware.b4a.objects.collections.List();
_center.setObject((java.util.List)(_banano.FromJson((Object)(_json))));
 //BA.debugLineNum = 207;BA.debugLine="GoogleMap.SetAttr(\"center\", center)";
_googlemap._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("center",(Object)(_center.getObject()));
 //BA.debugLineNum = 208;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgooglemap)(this);
 //BA.debugLineNum = 209;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgooglemap  _setcontainer(Object _container) throws Exception{
 //BA.debugLineNum = 232;BA.debugLine="Sub SetContainer(container As Object) As WixGoogle";
 //BA.debugLineNum = 233;BA.debugLine="GoogleMap.SetAttr(\"container\", container)";
_googlemap._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("container",_container);
 //BA.debugLineNum = 234;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgooglemap)(this);
 //BA.debugLineNum = 235;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgooglemap  _setcss(Object _css) throws Exception{
 //BA.debugLineNum = 237;BA.debugLine="Sub SetCss(css As Object) As WixGoogleMap";
 //BA.debugLineNum = 238;BA.debugLine="GoogleMap.SetAttr(\"css\", css)";
_googlemap._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("css",_css);
 //BA.debugLineNum = 239;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgooglemap)(this);
 //BA.debugLineNum = 240;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgooglemap  _setdata(anywheresoftware.b4a.objects.collections.List _d) throws Exception{
 //BA.debugLineNum = 172;BA.debugLine="Sub SetData(d As List) As WixGoogleMap";
 //BA.debugLineNum = 173;BA.debugLine="Markers = d";
_markers = _d;
 //BA.debugLineNum = 174;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgooglemap)(this);
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgooglemap  _setdatafeed(Object _datafeed) throws Exception{
 //BA.debugLineNum = 242;BA.debugLine="Sub SetDataFeed(dataFeed As Object) As WixGoogleMa";
 //BA.debugLineNum = 243;BA.debugLine="GoogleMap.SetAttr(\"dataFeed\", dataFeed)";
_googlemap._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("dataFeed",_datafeed);
 //BA.debugLineNum = 244;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgooglemap)(this);
 //BA.debugLineNum = 245;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgooglemap  _setdatathrottle(Object _datathrottle) throws Exception{
 //BA.debugLineNum = 247;BA.debugLine="Sub SetDatathrottle(datathrottle As Object) As Wix";
 //BA.debugLineNum = 248;BA.debugLine="GoogleMap.SetAttr(\"datathrottle\", datathrottle)";
_googlemap._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("datathrottle",_datathrottle);
 //BA.debugLineNum = 249;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgooglemap)(this);
 //BA.debugLineNum = 250;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgooglemap  _setdatatype(Object _datatype) throws Exception{
 //BA.debugLineNum = 252;BA.debugLine="Sub SetDatatype(datatype As Object) As WixGoogleMa";
 //BA.debugLineNum = 253;BA.debugLine="GoogleMap.SetAttr(\"datatype\", datatype)";
_googlemap._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("datatype",_datatype);
 //BA.debugLineNum = 254;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgooglemap)(this);
 //BA.debugLineNum = 255;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgooglemap  _setdisabled(boolean _disabled) throws Exception{
 //BA.debugLineNum = 257;BA.debugLine="Sub SetDisabled(disabled As Boolean) As WixGoogleM";
 //BA.debugLineNum = 258;BA.debugLine="GoogleMap.SetAttr(\"disabled\", disabled)";
_googlemap._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("disabled",(Object)(_disabled));
 //BA.debugLineNum = 259;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgooglemap)(this);
 //BA.debugLineNum = 260;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgooglemap  _setgravity(Object _gravity) throws Exception{
 //BA.debugLineNum = 262;BA.debugLine="Sub SetGravity(gravity As Object) As WixGoogleMap";
 //BA.debugLineNum = 263;BA.debugLine="GoogleMap.SetAttr(\"gravity\", gravity)";
_googlemap._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("gravity",_gravity);
 //BA.debugLineNum = 264;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgooglemap)(this);
 //BA.debugLineNum = 265;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgooglemap  _setheatmapconfig(Object _heatmapconfig) throws Exception{
 //BA.debugLineNum = 267;BA.debugLine="Sub SetHeatmapConfig(heatmapConfig As Object) As W";
 //BA.debugLineNum = 268;BA.debugLine="GoogleMap.SetAttr(\"heatmapConfig\", heatmapConfig)";
_googlemap._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("heatmapConfig",_heatmapconfig);
 //BA.debugLineNum = 269;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgooglemap)(this);
 //BA.debugLineNum = 270;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgooglemap  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 148;BA.debugLine="Sub SetHeight(h As Object) As WixGoogleMap";
 //BA.debugLineNum = 149;BA.debugLine="GoogleMap.SetAttr(\"height\", h)";
_googlemap._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("height",_h);
 //BA.debugLineNum = 150;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgooglemap)(this);
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgooglemap  _sethidden(boolean _hidden) throws Exception{
 //BA.debugLineNum = 272;BA.debugLine="Sub SetHidden(hidden As Boolean) As WixGoogleMap";
 //BA.debugLineNum = 273;BA.debugLine="GoogleMap.SetAttr(\"hidden\", hidden)";
_googlemap._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hidden",(Object)(_hidden));
 //BA.debugLineNum = 274;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgooglemap)(this);
 //BA.debugLineNum = 275;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgooglemap  _setkey(String _key) throws Exception{
 //BA.debugLineNum = 178;BA.debugLine="Sub SetKey(key As String) As WixGoogleMap";
 //BA.debugLineNum = 179;BA.debugLine="GoogleMap.SetAttr(\"key\", key)";
_googlemap._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("key",(Object)(_key));
 //BA.debugLineNum = 180;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgooglemap)(this);
 //BA.debugLineNum = 181;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgooglemap  _setlayertype(Object _layertype) throws Exception{
 //BA.debugLineNum = 277;BA.debugLine="Sub SetLayerType(layerType As Object) As WixGoogle";
 //BA.debugLineNum = 278;BA.debugLine="GoogleMap.SetAttr(\"layerType\", layerType)";
_googlemap._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("layerType",_layertype);
 //BA.debugLineNum = 279;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgooglemap)(this);
 //BA.debugLineNum = 280;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgooglemap  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 111;BA.debugLine="Sub SetMap(m As Map) As WixGoogleMap";
 //BA.debugLineNum = 112;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 113;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 114;BA.debugLine="GoogleMap.SetAttr(strKey,	strVal)";
_googlemap._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 116;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgooglemap)(this);
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgooglemap  _setmaptype(String _mt) throws Exception{
 //BA.debugLineNum = 190;BA.debugLine="Sub SetMapType(mt As String) As WixGoogleMap";
 //BA.debugLineNum = 191;BA.debugLine="GoogleMap.SetAttr(\"mapType\", mt)";
_googlemap._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("mapType",(Object)(_mt));
 //BA.debugLineNum = 192;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgooglemap)(this);
 //BA.debugLineNum = 193;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgooglemap  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Sub SetMargin(margin As Object) As WixGoogleMap";
 //BA.debugLineNum = 23;BA.debugLine="GoogleMap.SetMargin(margin)";
_googlemap._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 24;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgooglemap)(this);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgooglemap  _setmaxheight(Object _maxheight) throws Exception{
 //BA.debugLineNum = 282;BA.debugLine="Sub SetMaxHeight(maxHeight As Object) As WixGoogle";
 //BA.debugLineNum = 283;BA.debugLine="GoogleMap.SetAttr(\"maxHeight\", maxHeight)";
_googlemap._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxHeight",_maxheight);
 //BA.debugLineNum = 284;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgooglemap)(this);
 //BA.debugLineNum = 285;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgooglemap  _setmaxwidth(Object _maxwidth) throws Exception{
 //BA.debugLineNum = 287;BA.debugLine="Sub SetMaxWidth(maxWidth As Object) As WixGoogleMa";
 //BA.debugLineNum = 288;BA.debugLine="GoogleMap.SetAttr(\"maxWidth\", maxWidth)";
_googlemap._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxWidth",_maxwidth);
 //BA.debugLineNum = 289;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgooglemap)(this);
 //BA.debugLineNum = 290;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgooglemap  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 105;BA.debugLine="Sub SetMinHeight(h As Int) As WixGoogleMap";
 //BA.debugLineNum = 106;BA.debugLine="GoogleMap.SetMinHeight(h)";
_googlemap._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 107;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgooglemap)(this);
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgooglemap  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Sub SetMinWidth(w As Int) As WixGoogleMap";
 //BA.debugLineNum = 100;BA.debugLine="GoogleMap.SetMinWidth(w)";
_googlemap._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 101;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgooglemap)(this);
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgooglemap  _setname(String _n) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub SetName(n As String) As WixGoogleMap";
 //BA.debugLineNum = 81;BA.debugLine="GoogleMap.SetName(n)";
_googlemap._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 82;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgooglemap)(this);
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgooglemap  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Sub SetPadding(padding As Object) As WixGoogleMap";
 //BA.debugLineNum = 17;BA.debugLine="GoogleMap.SetPadding(padding)";
_googlemap._setpadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 18;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgooglemap)(this);
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgooglemap  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub SetParent(p As WixElement) As WixGoogleMap";
 //BA.debugLineNum = 62;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 63;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgooglemap)(this);
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgooglemap  _setready(Object _ready) throws Exception{
 //BA.debugLineNum = 292;BA.debugLine="Sub SetReady(ready As Object) As WixGoogleMap";
 //BA.debugLineNum = 293;BA.debugLine="GoogleMap.SetAttr(\"ready\", ready)";
_googlemap._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("ready",_ready);
 //BA.debugLineNum = 294;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgooglemap)(this);
 //BA.debugLineNum = 295;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgooglemap  _setremovemissed(boolean _removemissed) throws Exception{
 //BA.debugLineNum = 297;BA.debugLine="Sub SetRemoveMissed(removeMissed As Boolean) As Wi";
 //BA.debugLineNum = 298;BA.debugLine="GoogleMap.SetAttr(\"removeMissed\", removeMissed)";
_googlemap._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("removeMissed",(Object)(_removemissed));
 //BA.debugLineNum = 299;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgooglemap)(this);
 //BA.debugLineNum = 300;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgooglemap  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Sub SetResponsive(b As Object) As WixGoogleMap";
 //BA.debugLineNum = 87;BA.debugLine="GoogleMap.SetResponsive(b)";
_googlemap._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 88;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgooglemap)(this);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgooglemap  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixGoogleMap";
 //BA.debugLineNum = 93;BA.debugLine="GoogleMap.SetResponsiveCell(b)";
_googlemap._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 94;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgooglemap)(this);
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgooglemap  _setsave(Object _save) throws Exception{
 //BA.debugLineNum = 302;BA.debugLine="Sub SetSave(save As Object) As WixGoogleMap";
 //BA.debugLineNum = 303;BA.debugLine="GoogleMap.SetAttr(\"save\", save)";
_googlemap._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("save",_save);
 //BA.debugLineNum = 304;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgooglemap)(this);
 //BA.debugLineNum = 305;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgooglemap  _setscheme(Object _scheme) throws Exception{
 //BA.debugLineNum = 307;BA.debugLine="Sub SetScheme(scheme As Object) As WixGoogleMap";
 //BA.debugLineNum = 308;BA.debugLine="GoogleMap.SetAttr(\"scheme\", scheme)";
_googlemap._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("scheme",_scheme);
 //BA.debugLineNum = 309;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgooglemap)(this);
 //BA.debugLineNum = 310;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgooglemap  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 46;BA.debugLine="GoogleMap.SetStyle(prop,sval)";
_googlemap._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 47;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgooglemap)(this);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgooglemap  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 36;BA.debugLine="Sub SetStyles(m As Map) As WixGoogleMap";
 //BA.debugLineNum = 37;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 38;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 39;BA.debugLine="GoogleMap.SetStyle(k,v)";
_googlemap._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 41;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgooglemap)(this);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgooglemap  _settemplate(String _t) throws Exception{
 //BA.debugLineNum = 166;BA.debugLine="Sub SetTemplate(t As String) As WixGoogleMap";
 //BA.debugLineNum = 167;BA.debugLine="GoogleMap.SetAttr(\"template\", t)";
_googlemap._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("template",(Object)(_t));
 //BA.debugLineNum = 168;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgooglemap)(this);
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgooglemap  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 72;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixGoogleM";
 //BA.debugLineNum = 73;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 74;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 75;BA.debugLine="GoogleMap.SetTemplate(os)";
_googlemap._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 76;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgooglemap)(this);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgooglemap  _seturl(Object _url) throws Exception{
 //BA.debugLineNum = 312;BA.debugLine="Sub SetUrl(url As Object) As WixGoogleMap";
 //BA.debugLineNum = 313;BA.debugLine="GoogleMap.SetAttr(\"url\", url)";
_googlemap._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("url",_url);
 //BA.debugLineNum = 314;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgooglemap)(this);
 //BA.debugLineNum = 315;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgooglemap  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 154;BA.debugLine="Sub SetWidth(w As Object) As WixGoogleMap";
 //BA.debugLineNum = 155;BA.debugLine="GoogleMap.SetAttr(\"width\", w)";
_googlemap._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("width",_w);
 //BA.debugLineNum = 156;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgooglemap)(this);
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgooglemap  _setzoom(int _z) throws Exception{
 //BA.debugLineNum = 184;BA.debugLine="Sub SetZoom(z As Int) As WixGoogleMap";
 //BA.debugLineNum = 185;BA.debugLine="GoogleMap.SetAttr(\"zoom\", z)";
_googlemap._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("zoom",(Object)(_z));
 //BA.debugLineNum = 186;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgooglemap)(this);
 //BA.debugLineNum = 187;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
