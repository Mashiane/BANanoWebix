package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixchart extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixchart", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixchart.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _chart = null;
public anywheresoftware.b4a.objects.collections.Map _chartitem = null;
public anywheresoftware.b4a.objects.collections.Map _chartline = null;
public anywheresoftware.b4a.objects.collections.Map _yaxis = null;
public anywheresoftware.b4a.objects.collections.Map _xaxis = null;
public anywheresoftware.b4a.objects.collections.Map _tooltip = null;
public anywheresoftware.b4a.objects.collections.Map _padding = null;
public b4j.example.main _main = null;
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
public String  _addtoform(b4j.example.wixform _frm) throws Exception{
 //BA.debugLineNum = 298;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 299;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 300;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Chart As WixElement";
_chart = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private ChartItem As Map";
_chartitem = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 6;BA.debugLine="Private ChartLine As Map";
_chartline = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 7;BA.debugLine="Private yAxis As Map";
_yaxis = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 8;BA.debugLine="Private xAxis As Map";
_xaxis = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 9;BA.debugLine="Private Tooltip As Map";
_tooltip = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 10;BA.debugLine="Private Padding As Map";
_padding = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixchart  _initialize(anywheresoftware.b4a.BA _ba,String _iid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize(iID As String) As WixChart";
 //BA.debugLineNum = 15;BA.debugLine="ID = iID.tolowercase";
_id = _iid.toLowerCase();
 //BA.debugLineNum = 16;BA.debugLine="Chart.Initialize(iID).SetView(\"chart\")";
_chart._initialize /*b4j.example.wixelement*/ (ba,_iid)._setview /*b4j.example.wixelement*/ ("chart");
 //BA.debugLineNum = 17;BA.debugLine="ChartItem.Initialize";
_chartitem.Initialize();
 //BA.debugLineNum = 18;BA.debugLine="ChartLine.Initialize";
_chartline.Initialize();
 //BA.debugLineNum = 19;BA.debugLine="yAxis.Initialize";
_yaxis.Initialize();
 //BA.debugLineNum = 20;BA.debugLine="xAxis.Initialize";
_xaxis.Initialize();
 //BA.debugLineNum = 21;BA.debugLine="Tooltip.Initialize";
_tooltip.Initialize();
 //BA.debugLineNum = 22;BA.debugLine="Padding.Initialize";
_padding.Initialize();
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 360;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 361;BA.debugLine="Chart.SetProperty(\"yAxis\", yAxis)";
_chart._setproperty /*b4j.example.wixelement*/ ("yAxis",(Object)(_yaxis.getObject()));
 //BA.debugLineNum = 362;BA.debugLine="Chart.SetProperty(\"xAxis\", xAxis)";
_chart._setproperty /*b4j.example.wixelement*/ ("xAxis",(Object)(_xaxis.getObject()));
 //BA.debugLineNum = 363;BA.debugLine="If ChartItem.Size > 0 Then";
if (_chartitem.getSize()>0) { 
 //BA.debugLineNum = 364;BA.debugLine="Chart.SetProperty(\"item\", ChartItem)";
_chart._setproperty /*b4j.example.wixelement*/ ("item",(Object)(_chartitem.getObject()));
 };
 //BA.debugLineNum = 366;BA.debugLine="If ChartLine.Size > 0 Then";
if (_chartline.getSize()>0) { 
 //BA.debugLineNum = 367;BA.debugLine="Chart.SetProperty(\"line\", ChartLine)";
_chart._setproperty /*b4j.example.wixelement*/ ("line",(Object)(_chartline.getObject()));
 };
 //BA.debugLineNum = 369;BA.debugLine="If Tooltip.Size > 0 Then";
if (_tooltip.getSize()>0) { 
 //BA.debugLineNum = 370;BA.debugLine="Chart.SetProperty(\"tooltip\", Tooltip)";
_chart._setproperty /*b4j.example.wixelement*/ ("tooltip",(Object)(_tooltip.getObject()));
 };
 //BA.debugLineNum = 372;BA.debugLine="Return Chart.item";
if (true) return _chart._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 373;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 442;BA.debugLine="Sub SetAlignCenter(r As String) As WixChart 'ignor";
 //BA.debugLineNum = 443;BA.debugLine="Chart.setAligncenter(\"\")";
_chart._setaligncenter /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 444;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 445;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 448;BA.debugLine="Sub SetAlignLeft(r As String) As WixChart 'ignore";
 //BA.debugLineNum = 449;BA.debugLine="Chart.SetAlignleft(\"\")";
_chart._setalignleft /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 450;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 451;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 436;BA.debugLine="Sub SetAlignRight(r As String) As WixChart 'ignore";
 //BA.debugLineNum = 437;BA.debugLine="Chart.setAlignright(\"\")";
_chart._setalignright /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 438;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 439;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setalpha(float _a) throws Exception{
 //BA.debugLineNum = 241;BA.debugLine="Sub SetAlpha(a As Float) As WixChart";
 //BA.debugLineNum = 242;BA.debugLine="Chart.SetProperty(\"alpha\", a)";
_chart._setproperty /*b4j.example.wixelement*/ ("alpha",(Object)(_a));
 //BA.debugLineNum = 243;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 244;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setattr(String _prop,Object _val) throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Sub SetAttr(prop As String, val As Object) As WixC";
 //BA.debugLineNum = 46;BA.debugLine="Chart.SetProperty(prop,val)";
_chart._setproperty /*b4j.example.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 47;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setbarwidth(int _w) throws Exception{
 //BA.debugLineNum = 229;BA.debugLine="Sub SetBarWidth(w As Int) As WixChart";
 //BA.debugLineNum = 230;BA.debugLine="Chart.SetProperty(\"barWidth\", w)";
_chart._setproperty /*b4j.example.wixelement*/ ("barWidth",(Object)(_w));
 //BA.debugLineNum = 231;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 232;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setborder(boolean _b) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub SetBorder(b As Boolean) As WixChart";
 //BA.debugLineNum = 34;BA.debugLine="Chart.SetProperty(\"border\", b)";
_chart._setproperty /*b4j.example.wixelement*/ ("border",(Object)(_b));
 //BA.debugLineNum = 35;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setcolor(String _c) throws Exception{
 //BA.debugLineNum = 253;BA.debugLine="Sub SetColor(c As String) As WixChart";
 //BA.debugLineNum = 254;BA.debugLine="Chart.SetProperty(\"color\", c)";
_chart._setproperty /*b4j.example.wixelement*/ ("color",(Object)(_c));
 //BA.debugLineNum = 255;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 256;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setdata(anywheresoftware.b4a.objects.collections.List _d) throws Exception{
 //BA.debugLineNum = 394;BA.debugLine="Sub SetData(d As List) As WixChart";
 //BA.debugLineNum = 395;BA.debugLine="Chart.SetData(d)";
_chart._setdata /*b4j.example.wixelement*/ (_d);
 //BA.debugLineNum = 396;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 397;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setdisablelines(boolean _b) throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Sub SetDisableLines(b As Boolean) As WixChart";
 //BA.debugLineNum = 40;BA.debugLine="Chart.SetProperty(\"disableLines\", b)";
_chart._setproperty /*b4j.example.wixelement*/ ("disableLines",(Object)(_b));
 //BA.debugLineNum = 41;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _seteventradius(int _r) throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Sub SetEventRadius(r As Int) As WixChart";
 //BA.debugLineNum = 28;BA.debugLine="Chart.setproperty(\"eventRadius\", r)";
_chart._setproperty /*b4j.example.wixelement*/ ("eventRadius",(Object)(_r));
 //BA.debugLineNum = 29;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setgradient(String _g) throws Exception{
 //BA.debugLineNum = 292;BA.debugLine="Sub SetGradient(g As String) As WixChart";
 //BA.debugLineNum = 293;BA.debugLine="Chart.SetProperty(\"gradient\", g)";
_chart._setproperty /*b4j.example.wixelement*/ ("gradient",(Object)(_g));
 //BA.debugLineNum = 294;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 295;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setgradientfalling(String _r) throws Exception{
 //BA.debugLineNum = 223;BA.debugLine="Sub SetGradientFalling(r As String) As WixChart  '";
 //BA.debugLineNum = 224;BA.debugLine="Chart.SetProperty(\"gradient\", \"falling\")";
_chart._setproperty /*b4j.example.wixelement*/ ("gradient",(Object)("falling"));
 //BA.debugLineNum = 225;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 226;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setheight(int _h) throws Exception{
 //BA.debugLineNum = 382;BA.debugLine="Sub SetHeight(h As Int) As WixChart";
 //BA.debugLineNum = 383;BA.debugLine="Chart.SetHeight(h)";
_chart._setheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 384;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 385;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setitembordercolor(String _c) throws Exception{
 //BA.debugLineNum = 310;BA.debugLine="Sub SetItemBorderColor(c As String) As WixChart";
 //BA.debugLineNum = 311;BA.debugLine="ChartItem.Put(\"borderColor\", c)";
_chartitem.Put((Object)("borderColor"),(Object)(_c));
 //BA.debugLineNum = 312;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 313;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setitemborderwidth(String _c) throws Exception{
 //BA.debugLineNum = 323;BA.debugLine="Sub SetItemBorderWidth(c As String) As WixChart";
 //BA.debugLineNum = 324;BA.debugLine="ChartItem.Put(\"borderWidth\", c)";
_chartitem.Put((Object)("borderWidth"),(Object)(_c));
 //BA.debugLineNum = 325;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 326;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setitemcolor(String _c) throws Exception{
 //BA.debugLineNum = 354;BA.debugLine="Sub SetItemColor(c As String) As WixChart";
 //BA.debugLineNum = 355;BA.debugLine="ChartItem.Put(\"color\",c)";
_chartitem.Put((Object)("color"),(Object)(_c));
 //BA.debugLineNum = 356;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 357;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setitemradius(int _c) throws Exception{
 //BA.debugLineNum = 348;BA.debugLine="Sub SetItemRadius(c As Int) As WixChart";
 //BA.debugLineNum = 349;BA.debugLine="ChartItem.Put(\"radius\", c)";
_chartitem.Put((Object)("radius"),(Object)(_c));
 //BA.debugLineNum = 350;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 351;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setitemshadow(boolean _c) throws Exception{
 //BA.debugLineNum = 335;BA.debugLine="Sub SetItemShadow(c As Boolean) As WixChart";
 //BA.debugLineNum = 336;BA.debugLine="ChartItem.Put(\"shadow\", c)";
_chartitem.Put((Object)("shadow"),(Object)(_c));
 //BA.debugLineNum = 337;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 338;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setitemtype(String _c) throws Exception{
 //BA.debugLineNum = 329;BA.debugLine="Sub SetItemType(c As String) As WixChart";
 //BA.debugLineNum = 330;BA.debugLine="ChartItem.Put(\"type\", c)";
_chartitem.Put((Object)("type"),(Object)(_c));
 //BA.debugLineNum = 331;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 332;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setitemtypediamond(String _r) throws Exception{
 //BA.debugLineNum = 141;BA.debugLine="Sub SetItemTypeDiamond(r As String) As WixChart  '";
 //BA.debugLineNum = 142;BA.debugLine="ChartItem.Put(\"type\", \"d\")";
_chartitem.Put((Object)("type"),(Object)("d"));
 //BA.debugLineNum = 143;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setitemtyperound(String _r) throws Exception{
 //BA.debugLineNum = 147;BA.debugLine="Sub SetItemTypeRound(r As String) As WixChart 'ign";
 //BA.debugLineNum = 148;BA.debugLine="ChartItem.Put(\"type\", \"r\")";
_chartitem.Put((Object)("type"),(Object)("r"));
 //BA.debugLineNum = 149;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setitemtypesquare(String _r) throws Exception{
 //BA.debugLineNum = 129;BA.debugLine="Sub SetItemTypeSquare(r As String) As WixChart  'i";
 //BA.debugLineNum = 130;BA.debugLine="ChartItem.Put(\"type\", \"s\")";
_chartitem.Put((Object)("type"),(Object)("s"));
 //BA.debugLineNum = 131;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setitemtypetriangle(String _r) throws Exception{
 //BA.debugLineNum = 135;BA.debugLine="Sub SetItemTypeTriangle(r As String) As WixChart '";
 //BA.debugLineNum = 136;BA.debugLine="ChartItem.Put(\"type\", \"t\")";
_chartitem.Put((Object)("type"),(Object)("t"));
 //BA.debugLineNum = 137;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 412;BA.debugLine="Sub SetLabel(l As String) As WixChart";
 //BA.debugLineNum = 413;BA.debugLine="Chart.Label.Text = l";
_chart._label /*b4j.example.wixelement._labeltype*/ .Text /*String*/  = _l;
 //BA.debugLineNum = 414;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 415;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 418;BA.debugLine="Sub SetLabelAlign(a As String) As WixChart";
 //BA.debugLineNum = 419;BA.debugLine="Chart.Label.Align = a";
_chart._label /*b4j.example.wixelement._labeltype*/ .Align /*String*/  = _a;
 //BA.debugLineNum = 420;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 421;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setlabeloffset(int _c) throws Exception{
 //BA.debugLineNum = 316;BA.debugLine="Sub SetLabelOffset(c As Int) As WixChart";
 //BA.debugLineNum = 317;BA.debugLine="ChartItem.Put(\"labelOffset\", c)";
_chartitem.Put((Object)("labelOffset"),(Object)(_c));
 //BA.debugLineNum = 318;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 319;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 424;BA.debugLine="Sub SetLabelPosition(p As String) As WixChart";
 //BA.debugLineNum = 425;BA.debugLine="Chart.Label.Position = p";
_chart._label /*b4j.example.wixelement._labeltype*/ .Position /*String*/  = _p;
 //BA.debugLineNum = 426;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 427;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setlabelwidth(int _w) throws Exception{
 //BA.debugLineNum = 430;BA.debugLine="Sub SetLabelWidth(w As Int) As WixChart";
 //BA.debugLineNum = 431;BA.debugLine="Chart.Label.Width = w";
_chart._label /*b4j.example.wixelement._labeltype*/ .Width /*int*/  = _w;
 //BA.debugLineNum = 432;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 433;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setlegend(int _width,int _align) throws Exception{
anywheresoftware.b4a.objects.collections.Map _l = null;
 //BA.debugLineNum = 216;BA.debugLine="Sub SetLegend(width As Int, align As Int) As WixCh";
 //BA.debugLineNum = 217;BA.debugLine="Dim l As Map = CreateMap(\"width\": width, \"align\"";
_l = new anywheresoftware.b4a.objects.collections.Map();
_l = __c.createMap(new Object[] {(Object)("width"),(Object)(_width),(Object)("align"),(Object)(_align)});
 //BA.debugLineNum = 218;BA.debugLine="Chart.SetProperty(\"legend\", l)";
_chart._setproperty /*b4j.example.wixelement*/ ("legend",(Object)(_l.getObject()));
 //BA.debugLineNum = 219;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 220;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setlinecolor(String _c) throws Exception{
 //BA.debugLineNum = 198;BA.debugLine="Sub SetLineColor(c As String) As WixChart";
 //BA.debugLineNum = 199;BA.debugLine="ChartLine.Put(\"color\", c)";
_chartline.Put((Object)("color"),(Object)(_c));
 //BA.debugLineNum = 200;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 201;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setlineshadow(boolean _w) throws Exception{
 //BA.debugLineNum = 210;BA.debugLine="Sub SetLineShadow(w As Boolean) As WixChart";
 //BA.debugLineNum = 211;BA.debugLine="ChartLine.Put(\"shadow\", w)";
_chartline.Put((Object)("shadow"),(Object)(_w));
 //BA.debugLineNum = 212;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 213;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setlinewidth(int _w) throws Exception{
 //BA.debugLineNum = 204;BA.debugLine="Sub SetLineWidth(w As Int) As WixChart";
 //BA.debugLineNum = 205;BA.debugLine="ChartLine.Put(\"width\", w)";
_chartline.Put((Object)("width"),(Object)(_w));
 //BA.debugLineNum = 206;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 207;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setoffset(int _o) throws Exception{
 //BA.debugLineNum = 304;BA.debugLine="Sub SetOffSet(o As Int) As WixChart";
 //BA.debugLineNum = 305;BA.debugLine="Chart.SetProperty(\"offset\",o)";
_chart._setproperty /*b4j.example.wixelement*/ ("offset",(Object)(_o));
 //BA.debugLineNum = 306;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 307;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setpadding(int _r) throws Exception{
 //BA.debugLineNum = 265;BA.debugLine="Sub SetPadding(r As Int) As WixChart";
 //BA.debugLineNum = 266;BA.debugLine="Padding.Put(\"top\", r)";
_padding.Put((Object)("top"),(Object)(_r));
 //BA.debugLineNum = 267;BA.debugLine="Padding.Put(\"buttom\",r)";
_padding.Put((Object)("buttom"),(Object)(_r));
 //BA.debugLineNum = 268;BA.debugLine="Padding.Put(\"right\", r)";
_padding.Put((Object)("right"),(Object)(_r));
 //BA.debugLineNum = 269;BA.debugLine="Padding.Put(\"left\", r)";
_padding.Put((Object)("left"),(Object)(_r));
 //BA.debugLineNum = 270;BA.debugLine="Chart.setproperty(\"padding\",Padding)";
_chart._setproperty /*b4j.example.wixelement*/ ("padding",(Object)(_padding.getObject()));
 //BA.debugLineNum = 271;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 272;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setpadding1(int _top,int _bottom,int _right,int _left) throws Exception{
 //BA.debugLineNum = 276;BA.debugLine="Sub SetPadding1(top As Int, bottom As Int, right A";
 //BA.debugLineNum = 277;BA.debugLine="Padding.Put(\"top\", top)";
_padding.Put((Object)("top"),(Object)(_top));
 //BA.debugLineNum = 278;BA.debugLine="Padding.Put(\"buttom\",bottom)";
_padding.Put((Object)("buttom"),(Object)(_bottom));
 //BA.debugLineNum = 279;BA.debugLine="Padding.Put(\"right\", right)";
_padding.Put((Object)("right"),(Object)(_right));
 //BA.debugLineNum = 280;BA.debugLine="Padding.Put(\"left\", left)";
_padding.Put((Object)("left"),(Object)(_left));
 //BA.debugLineNum = 281;BA.debugLine="Chart.setproperty(\"padding\",Padding)";
_chart._setproperty /*b4j.example.wixelement*/ ("padding",(Object)(_padding.getObject()));
 //BA.debugLineNum = 282;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 283;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setpieinnertext(String _txt) throws Exception{
 //BA.debugLineNum = 400;BA.debugLine="Sub SetPieInnerText(txt As String) As WixChart";
 //BA.debugLineNum = 401;BA.debugLine="Chart.SetProperty(\"pieInnerText\", txt)";
_chart._setproperty /*b4j.example.wixelement*/ ("pieInnerText",(Object)(_txt));
 //BA.debugLineNum = 402;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 403;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setradius(int _r) throws Exception{
 //BA.debugLineNum = 286;BA.debugLine="Sub SetRadius(r As Int) As WixChart";
 //BA.debugLineNum = 287;BA.debugLine="Chart.SetProperty(\"radius\", r)";
_chart._setproperty /*b4j.example.wixelement*/ ("radius",(Object)(_r));
 //BA.debugLineNum = 288;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 289;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setshadow(int _s) throws Exception{
 //BA.debugLineNum = 259;BA.debugLine="Sub SetShadow(s As Int) As WixChart";
 //BA.debugLineNum = 260;BA.debugLine="Chart.SetProperty(\"shadow\", s)";
_chart._setproperty /*b4j.example.wixelement*/ ("shadow",(Object)(_s));
 //BA.debugLineNum = 261;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 262;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setstackedbarh(String _r) throws Exception{
 //BA.debugLineNum = 159;BA.debugLine="Sub SetStackedBarH(r As String) As WixChart 'ignor";
 //BA.debugLineNum = 160;BA.debugLine="Chart.SetType(\"stackedBarH\")";
_chart._settype /*b4j.example.wixelement*/ ("stackedBarH");
 //BA.debugLineNum = 161;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 162;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 376;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 377;BA.debugLine="Chart.SetStyle(prop,val)";
_chart._setstyle /*b4j.example.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 378;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 379;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _settooltiptemplate(String _t) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub SetTooltipTemplate(t As String) As WixChart";
 //BA.debugLineNum = 52;BA.debugLine="Tooltip.Put(\"template\", t)";
_tooltip.Put((Object)("template"),(Object)(_t));
 //BA.debugLineNum = 53;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _settypearea(String _r) throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Sub SetTypeArea(r As String) As WixChart 'ignore";
 //BA.debugLineNum = 82;BA.debugLine="Chart.SetType(\"area\")";
_chart._settype /*b4j.example.wixelement*/ ("area");
 //BA.debugLineNum = 83;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _settypebar(String _r) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Sub SetTypeBar(r As String) As WixChart 'ignore";
 //BA.debugLineNum = 88;BA.debugLine="Chart.SetType(\"bar\")";
_chart._settype /*b4j.example.wixelement*/ ("bar");
 //BA.debugLineNum = 89;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _settypebarh(String _r) throws Exception{
 //BA.debugLineNum = 235;BA.debugLine="Sub SetTypeBarH(r As String) As WixChart 'ignore";
 //BA.debugLineNum = 236;BA.debugLine="Chart.SetType(\"barH\")";
_chart._settype /*b4j.example.wixelement*/ ("barH");
 //BA.debugLineNum = 237;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 238;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _settypedonut(String _r) throws Exception{
 //BA.debugLineNum = 247;BA.debugLine="Sub SetTypeDonut(r As String) As WixChart 'ignore";
 //BA.debugLineNum = 248;BA.debugLine="Chart.SetType(\"donut\")";
_chart._settype /*b4j.example.wixelement*/ ("donut");
 //BA.debugLineNum = 249;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 250;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _settypeline(String _r) throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Sub SetTypeLine(r As String) As WixChart 'ignore";
 //BA.debugLineNum = 100;BA.debugLine="Chart.SetType(\"line\")";
_chart._settype /*b4j.example.wixelement*/ ("line");
 //BA.debugLineNum = 101;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _settypepie(String _r) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub SetTypePie(r As String) As WixChart 'ignore";
 //BA.debugLineNum = 94;BA.debugLine="Chart.SetType(\"pie\")";
_chart._settype /*b4j.example.wixelement*/ ("pie");
 //BA.debugLineNum = 95;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _settypepie3d(String _r) throws Exception{
 //BA.debugLineNum = 179;BA.debugLine="Sub SetTypePie3D(r As String) As WixChart 'ignore";
 //BA.debugLineNum = 180;BA.debugLine="Chart.SetType(\"pie3D\")";
_chart._settype /*b4j.example.wixelement*/ ("pie3D");
 //BA.debugLineNum = 181;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _settyperadar(String _r) throws Exception{
 //BA.debugLineNum = 191;BA.debugLine="Sub SetTypeRadar(r As String) As WixChart 'ignore";
 //BA.debugLineNum = 192;BA.debugLine="Chart.SetType(\"radar\")";
_chart._settype /*b4j.example.wixelement*/ ("radar");
 //BA.debugLineNum = 193;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _settypescatter(String _r) throws Exception{
 //BA.debugLineNum = 185;BA.debugLine="Sub SetTypeScatter(r As String) As WixChart 'ignor";
 //BA.debugLineNum = 186;BA.debugLine="Chart.SetType(\"scatter\")";
_chart._settype /*b4j.example.wixelement*/ ("scatter");
 //BA.debugLineNum = 187;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _settypespline(String _r) throws Exception{
 //BA.debugLineNum = 105;BA.debugLine="Sub SetTypeSPLine(r As String) As WixChart 'ignore";
 //BA.debugLineNum = 106;BA.debugLine="Chart.SetType(\"spline\")";
_chart._settype /*b4j.example.wixelement*/ ("spline");
 //BA.debugLineNum = 107;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _settypesplinearea(String _r) throws Exception{
 //BA.debugLineNum = 153;BA.debugLine="Sub SetTypeSPLineArea(r As String) As WixChart 'ig";
 //BA.debugLineNum = 154;BA.debugLine="Chart.SetType(\"splineArea\")";
_chart._settype /*b4j.example.wixelement*/ ("splineArea");
 //BA.debugLineNum = 155;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 156;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _settypestackedarea(String _r) throws Exception{
 //BA.debugLineNum = 165;BA.debugLine="Sub SetTypeStackedArea(r As String) As WixChart 'i";
 //BA.debugLineNum = 166;BA.debugLine="Chart.SetType(\"stackedArea\")";
_chart._settype /*b4j.example.wixelement*/ ("stackedArea");
 //BA.debugLineNum = 167;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _settypestackedbar(String _r) throws Exception{
 //BA.debugLineNum = 172;BA.debugLine="Sub SetTypeStackedBar(r As String) As WixChart 'ig";
 //BA.debugLineNum = 173;BA.debugLine="Chart.SetType(\"stackedBar\")";
_chart._settype /*b4j.example.wixelement*/ ("stackedBar");
 //BA.debugLineNum = 174;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 406;BA.debugLine="Sub SetValue(v As String) As WixChart";
 //BA.debugLineNum = 407;BA.debugLine="Chart.Value = v";
_chart._value /*Object*/  = (Object)(_v);
 //BA.debugLineNum = 408;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 409;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setwidth(int _h) throws Exception{
 //BA.debugLineNum = 388;BA.debugLine="Sub SetWidth(h As Int) As WixChart";
 //BA.debugLineNum = 389;BA.debugLine="Chart.SetWidth(h)";
_chart._setwidth /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 390;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 391;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setxaxistemplate(String _t) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub SetXAxisTemplate(t As String) As WixChart";
 //BA.debugLineNum = 58;BA.debugLine="xAxis.Put(\"template\", t)";
_xaxis.Put((Object)("template"),(Object)(_t));
 //BA.debugLineNum = 59;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setxaxistitle(String _t) throws Exception{
 //BA.debugLineNum = 454;BA.debugLine="Sub SetXAxisTitle(t As String) As WixChart";
 //BA.debugLineNum = 455;BA.debugLine="xAxis.Put(\"title\", t)";
_xaxis.Put((Object)("title"),(Object)(_t));
 //BA.debugLineNum = 456;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 457;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setxvalue(String _x) throws Exception{
 //BA.debugLineNum = 342;BA.debugLine="Sub SetXValue(x As String) As WixChart";
 //BA.debugLineNum = 343;BA.debugLine="SetAttr(\"xValue\", x)";
_setattr("xValue",(Object)(_x));
 //BA.debugLineNum = 344;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 345;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setyaxisbg(String _t) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Sub SetYAxisBG(t As String) As WixChart";
 //BA.debugLineNum = 76;BA.debugLine="yAxis.Put(\"bg\", t)";
_yaxis.Put((Object)("bg"),(Object)(_t));
 //BA.debugLineNum = 77;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setyaxisend(int _s) throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Sub SetYAxisEnd(s As Int) As WixChart";
 //BA.debugLineNum = 118;BA.debugLine="yAxis.Put(\"end\", s)";
_yaxis.Put((Object)("end"),(Object)(_s));
 //BA.debugLineNum = 119;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setyaxislineshape(String _t) throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Sub SetYAxisLineShape(t As String) As WixChart";
 //BA.debugLineNum = 70;BA.debugLine="yAxis.Put(\"lineShape\", t)";
_yaxis.Put((Object)("lineShape"),(Object)(_t));
 //BA.debugLineNum = 71;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setyaxisstart(int _s) throws Exception{
 //BA.debugLineNum = 111;BA.debugLine="Sub SetYAxisStart(s As Int) As WixChart";
 //BA.debugLineNum = 112;BA.debugLine="yAxis.Put(\"start\", s)";
_yaxis.Put((Object)("start"),(Object)(_s));
 //BA.debugLineNum = 113;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setyaxisstep(int _s) throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Sub SetYAxisStep(s As Int) As WixChart";
 //BA.debugLineNum = 124;BA.debugLine="yAxis.Put(\"step\", s)";
_yaxis.Put((Object)("step"),(Object)(_s));
 //BA.debugLineNum = 125;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setyaxistemplate(String _t) throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Sub SetYAxisTemplate(t As String) As WixChart";
 //BA.debugLineNum = 64;BA.debugLine="yAxis.Put(\"template\", t)";
_yaxis.Put((Object)("template"),(Object)(_t));
 //BA.debugLineNum = 65;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setyaxistitle(String _t) throws Exception{
 //BA.debugLineNum = 460;BA.debugLine="Sub SetYAxisTitle(t As String) As WixChart";
 //BA.debugLineNum = 461;BA.debugLine="yAxis.Put(\"title\", t)";
_yaxis.Put((Object)("title"),(Object)(_t));
 //BA.debugLineNum = 462;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 463;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
