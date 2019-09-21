package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixgeochart extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixgeochart", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixgeochart.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _geochart = null;
public anywheresoftware.b4a.objects.collections.Map _chart = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public String  _addcolumns(b4j.Mashy.BANanoWebixDemo.wixdatacolumn _c) throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Sub AddColumns(c As WixDataColumn)";
 //BA.debugLineNum = 74;BA.debugLine="Geochart.AddDataColumn(c.Item)";
_geochart._adddatacolumn /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_c._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return "";
}
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 184;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 185;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 186;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 189;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 190;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 191;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 179;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 180;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 181;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Geochart As WixElement";
_geochart = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private chart As Map";
_chart = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 6;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _createcolumn(String _hid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixdatacolumn _hdr = null;
 //BA.debugLineNum = 66;BA.debugLine="Sub CreateColumn(hid As String) As WixDataColumn";
 //BA.debugLineNum = 67;BA.debugLine="Dim hdr As WixDataColumn";
_hdr = new b4j.Mashy.BANanoWebixDemo.wixdatacolumn();
 //BA.debugLineNum = 68;BA.debugLine="hdr.Initialize(hid)";
_hdr._initialize /*b4j.Mashy.BANanoWebixDemo.wixdatacolumn*/ (ba,_hid);
 //BA.debugLineNum = 69;BA.debugLine="Return hdr";
if (true) return _hdr;
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgeochart  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(sid As String) As WixGeoChar";
 //BA.debugLineNum = 12;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 13;BA.debugLine="Geochart.Initialize(ID).SetView(\"geochart\")";
_geochart._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_id)._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("geochart");
 //BA.debugLineNum = 14;BA.debugLine="chart.Initialize";
_chart.Initialize();
 //BA.debugLineNum = 15;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 16;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgeochart)(this);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 79;BA.debugLine="If chart.Size > 0 Then Geochart.SetAttr(\"chart\",";
if (_chart.getSize()>0) { 
_geochart._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("chart",(Object)(_chart.getObject()));};
 //BA.debugLineNum = 80;BA.debugLine="Return Geochart.item";
if (true) return _geochart._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 62;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixgeochart  _setanimate(boolean _animate) throws Exception{
 //BA.debugLineNum = 193;BA.debugLine="Sub SetAnimate(animate As Boolean) As WixGeoChart";
 //BA.debugLineNum = 194;BA.debugLine="Geochart.SetAttr(\"animate\", animate)";
_geochart._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("animate",(Object)(_animate));
 //BA.debugLineNum = 195;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgeochart)(this);
 //BA.debugLineNum = 196;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgeochart  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 31;BA.debugLine="Sub SetAttributes(m As Map) As WixGeoChart";
 //BA.debugLineNum = 32;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 33;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 34;BA.debugLine="Geochart.SetAttr(k,v)";
_geochart._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgeochart)(this);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgeochart  _setautoheight(String _autoheight) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Sub SetAutoHeight(autoHeight As String) As WixGeoC";
 //BA.debugLineNum = 104;BA.debugLine="Geochart.SetAttr(\"autoheight\", autoHeight)";
_geochart._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("autoheight",(Object)(_autoheight));
 //BA.debugLineNum = 105;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgeochart)(this);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgeochart  _setautowidth(String _autowidth) throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Sub SetAutoWidth(autoWidth As String) As WixGeoCha";
 //BA.debugLineNum = 109;BA.debugLine="Geochart.SetAttr(\"autowidth\", autoWidth)";
_geochart._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("autowidth",(Object)(_autowidth));
 //BA.debugLineNum = 110;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgeochart)(this);
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgeochart  _setborderless(boolean _borderless) throws Exception{
 //BA.debugLineNum = 162;BA.debugLine="Sub SetBorderless(borderless As Boolean) As WixGeo";
 //BA.debugLineNum = 163;BA.debugLine="Geochart.SetAttr(\"borderless\", borderless)";
_geochart._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("borderless",(Object)(_borderless));
 //BA.debugLineNum = 164;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgeochart)(this);
 //BA.debugLineNum = 165;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgeochart  _setchart(Object _schart) throws Exception{
 //BA.debugLineNum = 198;BA.debugLine="Sub SetChart(schart As Object) As WixGeoChart";
 //BA.debugLineNum = 199;BA.debugLine="Geochart.SetAttr(\"chart\", schart)";
_geochart._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("chart",_schart);
 //BA.debugLineNum = 200;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgeochart)(this);
 //BA.debugLineNum = 201;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgeochart  _setchartcoloraxis(anywheresoftware.b4a.objects.collections.List _chartcoloraxis) throws Exception{
anywheresoftware.b4a.objects.collections.Map _coloraxis = null;
 //BA.debugLineNum = 138;BA.debugLine="Sub SetChartColorAxis(ChartColorAxis As List) As W";
 //BA.debugLineNum = 139;BA.debugLine="Dim colorAxis As Map = CreateMap()";
_coloraxis = new anywheresoftware.b4a.objects.collections.Map();
_coloraxis = __c.createMap(new Object[] {});
 //BA.debugLineNum = 140;BA.debugLine="colorAxis.Put(\"colors\", ChartColorAxis)";
_coloraxis.Put((Object)("colors"),(Object)(_chartcoloraxis.getObject()));
 //BA.debugLineNum = 141;BA.debugLine="chart.Put(\"colorAxis\", colorAxis)";
_chart.Put((Object)("colorAxis"),(Object)(_coloraxis.getObject()));
 //BA.debugLineNum = 142;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgeochart)(this);
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgeochart  _setchartdisplaymode(String _chartdisplaymode) throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Sub SetChartDisplayMode(ChartDisplayMode As String";
 //BA.debugLineNum = 129;BA.debugLine="chart.Put(\"displayMode\", ChartDisplayMode)";
_chart.Put((Object)("displayMode"),(Object)(_chartdisplaymode));
 //BA.debugLineNum = 130;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgeochart)(this);
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgeochart  _setchartlegend(Object _chartlegend) throws Exception{
 //BA.debugLineNum = 145;BA.debugLine="Sub SetChartLegend(ChartLegend As Object) As WixGe";
 //BA.debugLineNum = 146;BA.debugLine="chart.put(\"legend\", ChartLegend)";
_chart.Put((Object)("legend"),_chartlegend);
 //BA.debugLineNum = 147;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgeochart)(this);
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgeochart  _setchartregion(String _chartregion) throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Sub SetChartRegion(ChartRegion As String) As WixGe";
 //BA.debugLineNum = 134;BA.debugLine="chart.Put(\"region\", ChartRegion)";
_chart.Put((Object)("region"),(Object)(_chartregion));
 //BA.debugLineNum = 135;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgeochart)(this);
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgeochart  _setchartresolution(Object _chartresolution) throws Exception{
 //BA.debugLineNum = 151;BA.debugLine="Sub SetChartResolution(ChartResolution As Object)";
 //BA.debugLineNum = 152;BA.debugLine="chart.Put(\"resolution\", ChartResolution)";
_chart.Put((Object)("resolution"),_chartresolution);
 //BA.debugLineNum = 153;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgeochart)(this);
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgeochart  _setcolumns(anywheresoftware.b4a.objects.collections.List _columns) throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Sub SetColumns(columns As List) As WixGeoChart";
 //BA.debugLineNum = 124;BA.debugLine="Geochart.SetAttr(\"columns\", columns)";
_geochart._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("columns",(Object)(_columns.getObject()));
 //BA.debugLineNum = 125;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgeochart)(this);
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgeochart  _setcontainer(String _container) throws Exception{
 //BA.debugLineNum = 167;BA.debugLine="Sub SetContainer(container As String) As WixGeoCha";
 //BA.debugLineNum = 168;BA.debugLine="Geochart.SetAttr(\"container\", container)";
_geochart._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("container",(Object)(_container));
 //BA.debugLineNum = 169;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgeochart)(this);
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgeochart  _setcss(Object _css) throws Exception{
 //BA.debugLineNum = 203;BA.debugLine="Sub SetCss(css As Object) As WixGeoChart";
 //BA.debugLineNum = 204;BA.debugLine="Geochart.SetAttr(\"css\", css)";
_geochart._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("css",_css);
 //BA.debugLineNum = 205;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgeochart)(this);
 //BA.debugLineNum = 206;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgeochart  _setdata(anywheresoftware.b4a.objects.collections.List _data) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Sub SetData(data As List) As WixGeoChart";
 //BA.debugLineNum = 89;BA.debugLine="Geochart.SetAttr(\"data\", data)";
_geochart._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("data",(Object)(_data.getObject()));
 //BA.debugLineNum = 90;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgeochart)(this);
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgeochart  _setdatathrottle(Object _datathrottle) throws Exception{
 //BA.debugLineNum = 208;BA.debugLine="Sub SetDatathrottle(datathrottle As Object) As Wix";
 //BA.debugLineNum = 209;BA.debugLine="Geochart.SetAttr(\"datathrottle\", datathrottle)";
_geochart._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("datathrottle",_datathrottle);
 //BA.debugLineNum = 210;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgeochart)(this);
 //BA.debugLineNum = 211;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgeochart  _setdatatype(String _datatype) throws Exception{
 //BA.debugLineNum = 113;BA.debugLine="Sub SetDataType(datatype As String) As WixGeoChart";
 //BA.debugLineNum = 114;BA.debugLine="Geochart.SetAttr(\"datatype\", datatype)";
_geochart._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("datatype",(Object)(_datatype));
 //BA.debugLineNum = 115;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgeochart)(this);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgeochart  _setdisabled(boolean _disabled) throws Exception{
 //BA.debugLineNum = 213;BA.debugLine="Sub SetDisabled(disabled As Boolean) As WixGeoChar";
 //BA.debugLineNum = 214;BA.debugLine="Geochart.SetAttr(\"disabled\", disabled)";
_geochart._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("disabled",(Object)(_disabled));
 //BA.debugLineNum = 215;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgeochart)(this);
 //BA.debugLineNum = 216;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgeochart  _setgravity(Object _gravity) throws Exception{
 //BA.debugLineNum = 218;BA.debugLine="Sub SetGravity(gravity As Object) As WixGeoChart";
 //BA.debugLineNum = 219;BA.debugLine="Geochart.SetAttr(\"gravity\", gravity)";
_geochart._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("gravity",_gravity);
 //BA.debugLineNum = 220;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgeochart)(this);
 //BA.debugLineNum = 221;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgeochart  _setheight(String _height) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub SetHeight(height As String) As WixGeoChart";
 //BA.debugLineNum = 94;BA.debugLine="Geochart.SetAttr(\"height\", height)";
_geochart._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("height",(Object)(_height));
 //BA.debugLineNum = 95;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgeochart)(this);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgeochart  _sethidden(boolean _hidden) throws Exception{
 //BA.debugLineNum = 172;BA.debugLine="Sub SetHidden(hidden As Boolean) As WixGeoChart";
 //BA.debugLineNum = 173;BA.debugLine="Geochart.SetAttr(\"hidden\", hidden)";
_geochart._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hidden",(Object)(_hidden));
 //BA.debugLineNum = 174;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgeochart)(this);
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgeochart  _setkey(String _key) throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Sub SetKey(key As String) As WixGeoChart";
 //BA.debugLineNum = 84;BA.debugLine="Geochart.SetAttr(\"key\", key)";
_geochart._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("key",(Object)(_key));
 //BA.debugLineNum = 85;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgeochart)(this);
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgeochart  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Sub SetMargin(margin As Object) As WixGeoChart";
 //BA.debugLineNum = 27;BA.debugLine="Geochart.SetMargin(margin)";
_geochart._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 28;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgeochart)(this);
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgeochart  _setmaxheight(Object _maxheight) throws Exception{
 //BA.debugLineNum = 223;BA.debugLine="Sub SetMaxHeight(maxHeight As Object) As WixGeoCha";
 //BA.debugLineNum = 224;BA.debugLine="Geochart.SetAttr(\"maxHeight\", maxHeight)";
_geochart._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxHeight",_maxheight);
 //BA.debugLineNum = 225;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgeochart)(this);
 //BA.debugLineNum = 226;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgeochart  _setmaxwidth(Object _maxwidth) throws Exception{
 //BA.debugLineNum = 228;BA.debugLine="Sub SetMaxWidth(maxWidth As Object) As WixGeoChart";
 //BA.debugLineNum = 229;BA.debugLine="Geochart.SetAttr(\"maxWidth\", maxWidth)";
_geochart._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxWidth",_maxwidth);
 //BA.debugLineNum = 230;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgeochart)(this);
 //BA.debugLineNum = 231;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgeochart  _setminheight(Object _minheight) throws Exception{
 //BA.debugLineNum = 233;BA.debugLine="Sub SetMinHeight(minHeight As Object) As WixGeoCha";
 //BA.debugLineNum = 234;BA.debugLine="Geochart.SetAttr(\"minHeight\", minHeight)";
_geochart._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("minHeight",_minheight);
 //BA.debugLineNum = 235;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgeochart)(this);
 //BA.debugLineNum = 236;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgeochart  _setminwidth(Object _minwidth) throws Exception{
 //BA.debugLineNum = 238;BA.debugLine="Sub SetMinWidth(minWidth As Object) As WixGeoChart";
 //BA.debugLineNum = 239;BA.debugLine="Geochart.SetAttr(\"minWidth\", minWidth)";
_geochart._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("minWidth",_minwidth);
 //BA.debugLineNum = 240;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgeochart)(this);
 //BA.debugLineNum = 241;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgeochart  _setname(String _name) throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Sub SetName(name As String) As WixGeoChart";
 //BA.debugLineNum = 119;BA.debugLine="Geochart.SetAttr(\"name\", name)";
_geochart._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("name",(Object)(_name));
 //BA.debugLineNum = 120;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgeochart)(this);
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgeochart  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Sub SetPadding(padding As Object) As WixGeoChart";
 //BA.debugLineNum = 21;BA.debugLine="Geochart.SetPadding(padding)";
_geochart._setpadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 22;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgeochart)(this);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgeochart  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Sub SetParent(p As WixElement) As WixGeoChart";
 //BA.debugLineNum = 55;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 56;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgeochart)(this);
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgeochart  _setready(Object _ready) throws Exception{
 //BA.debugLineNum = 243;BA.debugLine="Sub SetReady(ready As Object) As WixGeoChart";
 //BA.debugLineNum = 244;BA.debugLine="Geochart.SetAttr(\"ready\", ready)";
_geochart._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("ready",_ready);
 //BA.debugLineNum = 245;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgeochart)(this);
 //BA.debugLineNum = 246;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgeochart  _setremovemissed(boolean _removemissed) throws Exception{
 //BA.debugLineNum = 248;BA.debugLine="Sub SetRemoveMissed(removeMissed As Boolean) As Wi";
 //BA.debugLineNum = 249;BA.debugLine="Geochart.SetAttr(\"removeMissed\", removeMissed)";
_geochart._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("removeMissed",(Object)(_removemissed));
 //BA.debugLineNum = 250;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgeochart)(this);
 //BA.debugLineNum = 251;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgeochart  _setsave(Object _save) throws Exception{
 //BA.debugLineNum = 253;BA.debugLine="Sub SetSave(save As Object) As WixGeoChart";
 //BA.debugLineNum = 254;BA.debugLine="Geochart.SetAttr(\"save\", save)";
_geochart._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("save",_save);
 //BA.debugLineNum = 255;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgeochart)(this);
 //BA.debugLineNum = 256;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgeochart  _setscheme(Object _scheme) throws Exception{
 //BA.debugLineNum = 258;BA.debugLine="Sub SetScheme(scheme As Object) As WixGeoChart";
 //BA.debugLineNum = 259;BA.debugLine="Geochart.SetAttr(\"scheme\", scheme)";
_geochart._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("scheme",_scheme);
 //BA.debugLineNum = 260;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgeochart)(this);
 //BA.debugLineNum = 261;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgeochart  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 49;BA.debugLine="Geochart.SetStyle(prop,sval)";
_geochart._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 50;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgeochart)(this);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgeochart  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 39;BA.debugLine="Sub SetStyles(m As Map) As WixGeoChart";
 //BA.debugLineNum = 40;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 41;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 42;BA.debugLine="Geochart.SetStyle(k,v)";
_geochart._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 44;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgeochart)(this);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgeochart  _settooltip(String _tooltip) throws Exception{
 //BA.debugLineNum = 156;BA.debugLine="Sub SetTooltip(tooltip As String) As WixGeoChart";
 //BA.debugLineNum = 157;BA.debugLine="Geochart.SetAttr(\"tooltip\", tooltip)";
_geochart._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("tooltip",(Object)(_tooltip));
 //BA.debugLineNum = 158;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgeochart)(this);
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgeochart  _seturl(Object _url) throws Exception{
 //BA.debugLineNum = 263;BA.debugLine="Sub SetUrl(url As Object) As WixGeoChart";
 //BA.debugLineNum = 264;BA.debugLine="Geochart.SetAttr(\"url\", url)";
_geochart._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("url",_url);
 //BA.debugLineNum = 265;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgeochart)(this);
 //BA.debugLineNum = 266;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgeochart  _setwidth(String _width) throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Sub SetWidth(width As String) As WixGeoChart";
 //BA.debugLineNum = 99;BA.debugLine="Geochart.SetAttr(\"width\", width)";
_geochart._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("width",(Object)(_width));
 //BA.debugLineNum = 100;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgeochart)(this);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
