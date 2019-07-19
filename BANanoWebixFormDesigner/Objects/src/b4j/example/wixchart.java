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
 //BA.debugLineNum = 521;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 522;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 523;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 526;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 527;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 528;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.example.wixform _frm) throws Exception{
 //BA.debugLineNum = 347;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 348;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 349;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 516;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 517;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 518;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 409;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 410;BA.debugLine="Chart.SetAttr(\"yAxis\", yAxis)";
_chart._setattr /*b4j.example.wixelement*/ ("yAxis",(Object)(_yaxis.getObject()));
 //BA.debugLineNum = 411;BA.debugLine="Chart.SetAttr(\"xAxis\", xAxis)";
_chart._setattr /*b4j.example.wixelement*/ ("xAxis",(Object)(_xaxis.getObject()));
 //BA.debugLineNum = 412;BA.debugLine="If ChartItem.Size > 0 Then";
if (_chartitem.getSize()>0) { 
 //BA.debugLineNum = 413;BA.debugLine="Chart.SetAttr(\"item\", ChartItem)";
_chart._setattr /*b4j.example.wixelement*/ ("item",(Object)(_chartitem.getObject()));
 };
 //BA.debugLineNum = 415;BA.debugLine="If ChartLine.Size > 0 Then";
if (_chartline.getSize()>0) { 
 //BA.debugLineNum = 416;BA.debugLine="Chart.SetAttr(\"line\", ChartLine)";
_chart._setattr /*b4j.example.wixelement*/ ("line",(Object)(_chartline.getObject()));
 };
 //BA.debugLineNum = 418;BA.debugLine="If Tooltip.Size > 0 Then";
if (_tooltip.getSize()>0) { 
 //BA.debugLineNum = 419;BA.debugLine="Chart.SetAttr(\"tooltip\", Tooltip)";
_chart._setattr /*b4j.example.wixelement*/ ("tooltip",(Object)(_tooltip.getObject()));
 };
 //BA.debugLineNum = 421;BA.debugLine="Return Chart.item";
if (true) return _chart._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 422;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 491;BA.debugLine="Sub SetAlignCenter(r As String) As WixChart 'ignor";
 //BA.debugLineNum = 492;BA.debugLine="Chart.setAligncenter(\"\")";
_chart._setaligncenter /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 493;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 494;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 497;BA.debugLine="Sub SetAlignLeft(r As String) As WixChart 'ignore";
 //BA.debugLineNum = 498;BA.debugLine="Chart.SetAlignleft(\"\")";
_chart._setalignleft /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 499;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 500;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 485;BA.debugLine="Sub SetAlignRight(r As String) As WixChart 'ignore";
 //BA.debugLineNum = 486;BA.debugLine="Chart.setAlignright(\"\")";
_chart._setalignright /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 487;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 488;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setalpha(float _a) throws Exception{
 //BA.debugLineNum = 290;BA.debugLine="Sub SetAlpha(a As Float) As WixChart";
 //BA.debugLineNum = 291;BA.debugLine="Chart.SetAttr(\"alpha\", a)";
_chart._setattr /*b4j.example.wixelement*/ ("alpha",(Object)(_a));
 //BA.debugLineNum = 292;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 293;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setattr(String _prop,Object _val) throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Sub SetAttr(prop As String, val As Object) As WixC";
 //BA.debugLineNum = 95;BA.debugLine="Chart.SetAttr(prop,val)";
_chart._setattr /*b4j.example.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 96;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setbarwidth(int _w) throws Exception{
 //BA.debugLineNum = 278;BA.debugLine="Sub SetBarWidth(w As Int) As WixChart";
 //BA.debugLineNum = 279;BA.debugLine="Chart.SetAttr(\"barWidth\", w)";
_chart._setattr /*b4j.example.wixelement*/ ("barWidth",(Object)(_w));
 //BA.debugLineNum = 280;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 281;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setborder(boolean _b) throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Sub SetBorder(b As Boolean) As WixChart";
 //BA.debugLineNum = 83;BA.debugLine="Chart.SetAttr(\"border\", b)";
_chart._setattr /*b4j.example.wixelement*/ ("border",(Object)(_b));
 //BA.debugLineNum = 84;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setcolor(String _c) throws Exception{
 //BA.debugLineNum = 302;BA.debugLine="Sub SetColor(c As String) As WixChart";
 //BA.debugLineNum = 303;BA.debugLine="Chart.SetAttr(\"color\", c)";
_chart._setattr /*b4j.example.wixelement*/ ("color",(Object)(_c));
 //BA.debugLineNum = 304;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 305;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setdata(anywheresoftware.b4a.objects.collections.List _d) throws Exception{
 //BA.debugLineNum = 443;BA.debugLine="Sub SetData(d As List) As WixChart";
 //BA.debugLineNum = 444;BA.debugLine="Chart.SetData(d)";
_chart._setdata /*b4j.example.wixelement*/ (_d);
 //BA.debugLineNum = 445;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 446;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setdisablelines(boolean _b) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Sub SetDisableLines(b As Boolean) As WixChart";
 //BA.debugLineNum = 89;BA.debugLine="Chart.SetAttr(\"disableLines\", b)";
_chart._setattr /*b4j.example.wixelement*/ ("disableLines",(Object)(_b));
 //BA.debugLineNum = 90;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _seteventradius(int _r) throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Sub SetEventRadius(r As Int) As WixChart";
 //BA.debugLineNum = 77;BA.debugLine="Chart.SetAttr(\"eventRadius\", r)";
_chart._setattr /*b4j.example.wixelement*/ ("eventRadius",(Object)(_r));
 //BA.debugLineNum = 78;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setgradient(String _g) throws Exception{
 //BA.debugLineNum = 341;BA.debugLine="Sub SetGradient(g As String) As WixChart";
 //BA.debugLineNum = 342;BA.debugLine="Chart.SetAttr(\"gradient\", g)";
_chart._setattr /*b4j.example.wixelement*/ ("gradient",(Object)(_g));
 //BA.debugLineNum = 343;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 344;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setgradientfalling(String _r) throws Exception{
 //BA.debugLineNum = 272;BA.debugLine="Sub SetGradientFalling(r As String) As WixChart  '";
 //BA.debugLineNum = 273;BA.debugLine="Chart.SetAttr(\"gradient\", \"falling\")";
_chart._setattr /*b4j.example.wixelement*/ ("gradient",(Object)("falling"));
 //BA.debugLineNum = 274;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 275;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 431;BA.debugLine="Sub SetHeight(h As Object) As WixChart";
 //BA.debugLineNum = 432;BA.debugLine="Chart.SetHeight(h)";
_chart._setheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 433;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 434;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setitembordercolor(String _c) throws Exception{
 //BA.debugLineNum = 359;BA.debugLine="Sub SetItemBorderColor(c As String) As WixChart";
 //BA.debugLineNum = 360;BA.debugLine="ChartItem.Put(\"borderColor\", c)";
_chartitem.Put((Object)("borderColor"),(Object)(_c));
 //BA.debugLineNum = 361;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 362;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setitemborderwidth(String _c) throws Exception{
 //BA.debugLineNum = 372;BA.debugLine="Sub SetItemBorderWidth(c As String) As WixChart";
 //BA.debugLineNum = 373;BA.debugLine="ChartItem.Put(\"borderWidth\", c)";
_chartitem.Put((Object)("borderWidth"),(Object)(_c));
 //BA.debugLineNum = 374;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 375;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setitemcolor(String _c) throws Exception{
 //BA.debugLineNum = 403;BA.debugLine="Sub SetItemColor(c As String) As WixChart";
 //BA.debugLineNum = 404;BA.debugLine="ChartItem.Put(\"color\",c)";
_chartitem.Put((Object)("color"),(Object)(_c));
 //BA.debugLineNum = 405;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 406;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setitemradius(int _c) throws Exception{
 //BA.debugLineNum = 397;BA.debugLine="Sub SetItemRadius(c As Int) As WixChart";
 //BA.debugLineNum = 398;BA.debugLine="ChartItem.Put(\"radius\", c)";
_chartitem.Put((Object)("radius"),(Object)(_c));
 //BA.debugLineNum = 399;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 400;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setitemshadow(boolean _c) throws Exception{
 //BA.debugLineNum = 384;BA.debugLine="Sub SetItemShadow(c As Boolean) As WixChart";
 //BA.debugLineNum = 385;BA.debugLine="ChartItem.Put(\"shadow\", c)";
_chartitem.Put((Object)("shadow"),(Object)(_c));
 //BA.debugLineNum = 386;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 387;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setitemtype(String _c) throws Exception{
 //BA.debugLineNum = 378;BA.debugLine="Sub SetItemType(c As String) As WixChart";
 //BA.debugLineNum = 379;BA.debugLine="ChartItem.Put(\"type\", c)";
_chartitem.Put((Object)("type"),(Object)(_c));
 //BA.debugLineNum = 380;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 381;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setitemtypediamond(String _r) throws Exception{
 //BA.debugLineNum = 190;BA.debugLine="Sub SetItemTypeDiamond(r As String) As WixChart  '";
 //BA.debugLineNum = 191;BA.debugLine="ChartItem.Put(\"type\", \"d\")";
_chartitem.Put((Object)("type"),(Object)("d"));
 //BA.debugLineNum = 192;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 193;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setitemtyperound(String _r) throws Exception{
 //BA.debugLineNum = 196;BA.debugLine="Sub SetItemTypeRound(r As String) As WixChart 'ign";
 //BA.debugLineNum = 197;BA.debugLine="ChartItem.Put(\"type\", \"r\")";
_chartitem.Put((Object)("type"),(Object)("r"));
 //BA.debugLineNum = 198;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 199;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setitemtypesquare(String _r) throws Exception{
 //BA.debugLineNum = 178;BA.debugLine="Sub SetItemTypeSquare(r As String) As WixChart  'i";
 //BA.debugLineNum = 179;BA.debugLine="ChartItem.Put(\"type\", \"s\")";
_chartitem.Put((Object)("type"),(Object)("s"));
 //BA.debugLineNum = 180;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 181;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setitemtypetriangle(String _r) throws Exception{
 //BA.debugLineNum = 184;BA.debugLine="Sub SetItemTypeTriangle(r As String) As WixChart '";
 //BA.debugLineNum = 185;BA.debugLine="ChartItem.Put(\"type\", \"t\")";
_chartitem.Put((Object)("type"),(Object)("t"));
 //BA.debugLineNum = 186;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 187;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 461;BA.debugLine="Sub SetLabel(l As String) As WixChart";
 //BA.debugLineNum = 462;BA.debugLine="Chart.SetLabel(l)";
_chart._setlabel /*b4j.example.wixelement*/ (_l);
 //BA.debugLineNum = 463;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 464;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 467;BA.debugLine="Sub SetLabelAlign(a As String) As WixChart";
 //BA.debugLineNum = 468;BA.debugLine="Chart.SetLabelAlign(a)";
_chart._setlabelalign /*b4j.example.wixelement*/ (_a);
 //BA.debugLineNum = 469;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 470;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setlabeloffset(int _c) throws Exception{
 //BA.debugLineNum = 365;BA.debugLine="Sub SetLabelOffset(c As Int) As WixChart";
 //BA.debugLineNum = 366;BA.debugLine="ChartItem.Put(\"labelOffset\", c)";
_chartitem.Put((Object)("labelOffset"),(Object)(_c));
 //BA.debugLineNum = 367;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 368;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 473;BA.debugLine="Sub SetLabelPosition(p As String) As WixChart";
 //BA.debugLineNum = 474;BA.debugLine="Chart.SetLabelPosition(p)";
_chart._setlabelposition /*b4j.example.wixelement*/ (_p);
 //BA.debugLineNum = 475;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 476;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setlabelwidth(int _w) throws Exception{
 //BA.debugLineNum = 479;BA.debugLine="Sub SetLabelWidth(w As Int) As WixChart";
 //BA.debugLineNum = 480;BA.debugLine="Chart.SetLabelWidth(w)";
_chart._setlabelwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 481;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 482;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setlegend(int _width,int _align) throws Exception{
anywheresoftware.b4a.objects.collections.Map _l = null;
 //BA.debugLineNum = 265;BA.debugLine="Sub SetLegend(width As Int, align As Int) As WixCh";
 //BA.debugLineNum = 266;BA.debugLine="Dim l As Map = CreateMap(\"width\": width, \"align\"";
_l = new anywheresoftware.b4a.objects.collections.Map();
_l = __c.createMap(new Object[] {(Object)("width"),(Object)(_width),(Object)("align"),(Object)(_align)});
 //BA.debugLineNum = 267;BA.debugLine="Chart.SetAttr(\"legend\", l)";
_chart._setattr /*b4j.example.wixelement*/ ("legend",(Object)(_l.getObject()));
 //BA.debugLineNum = 268;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 269;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setlinecolor(String _c) throws Exception{
 //BA.debugLineNum = 247;BA.debugLine="Sub SetLineColor(c As String) As WixChart";
 //BA.debugLineNum = 248;BA.debugLine="ChartLine.Put(\"color\", c)";
_chartline.Put((Object)("color"),(Object)(_c));
 //BA.debugLineNum = 249;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 250;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setlineshadow(boolean _w) throws Exception{
 //BA.debugLineNum = 259;BA.debugLine="Sub SetLineShadow(w As Boolean) As WixChart";
 //BA.debugLineNum = 260;BA.debugLine="ChartLine.Put(\"shadow\", w)";
_chartline.Put((Object)("shadow"),(Object)(_w));
 //BA.debugLineNum = 261;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 262;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setlinewidth(int _w) throws Exception{
 //BA.debugLineNum = 253;BA.debugLine="Sub SetLineWidth(w As Int) As WixChart";
 //BA.debugLineNum = 254;BA.debugLine="ChartLine.Put(\"width\", w)";
_chartline.Put((Object)("width"),(Object)(_w));
 //BA.debugLineNum = 255;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 256;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 65;BA.debugLine="Sub SetMap(m As Map) As WixChart";
 //BA.debugLineNum = 66;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 67;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 68;BA.debugLine="Chart.SetAttr(strKey,	strVal)";
_chart._setattr /*b4j.example.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 70;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Sub SetMinHeight(h As Int) As WixChart";
 //BA.debugLineNum = 60;BA.debugLine="Chart.SetMinHeight(h)";
_chart._setminheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 61;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub SetMinWidth(w As Int) As WixChart";
 //BA.debugLineNum = 54;BA.debugLine="Chart.SetMinWidth(w)";
_chart._setminwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setname(String _n) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub SetName(n As String) As WixChart";
 //BA.debugLineNum = 35;BA.debugLine="Chart.SetName(n)";
_chart._setname /*b4j.example.wixelement*/ (_n);
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setoffset(int _o) throws Exception{
 //BA.debugLineNum = 353;BA.debugLine="Sub SetOffSet(o As Int) As WixChart";
 //BA.debugLineNum = 354;BA.debugLine="Chart.SetAttr(\"offset\",o)";
_chart._setattr /*b4j.example.wixelement*/ ("offset",(Object)(_o));
 //BA.debugLineNum = 355;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 356;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setpadding(int _r) throws Exception{
 //BA.debugLineNum = 314;BA.debugLine="Sub SetPadding(r As Int) As WixChart";
 //BA.debugLineNum = 315;BA.debugLine="Padding.Put(\"top\", r)";
_padding.Put((Object)("top"),(Object)(_r));
 //BA.debugLineNum = 316;BA.debugLine="Padding.Put(\"buttom\",r)";
_padding.Put((Object)("buttom"),(Object)(_r));
 //BA.debugLineNum = 317;BA.debugLine="Padding.Put(\"right\", r)";
_padding.Put((Object)("right"),(Object)(_r));
 //BA.debugLineNum = 318;BA.debugLine="Padding.Put(\"left\", r)";
_padding.Put((Object)("left"),(Object)(_r));
 //BA.debugLineNum = 319;BA.debugLine="Chart.SetAttr(\"padding\",Padding)";
_chart._setattr /*b4j.example.wixelement*/ ("padding",(Object)(_padding.getObject()));
 //BA.debugLineNum = 320;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 321;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setpadding1(int _top,int _bottom,int _right,int _left) throws Exception{
 //BA.debugLineNum = 325;BA.debugLine="Sub SetPadding1(top As Int, bottom As Int, right A";
 //BA.debugLineNum = 326;BA.debugLine="Padding.Put(\"top\", top)";
_padding.Put((Object)("top"),(Object)(_top));
 //BA.debugLineNum = 327;BA.debugLine="Padding.Put(\"buttom\",bottom)";
_padding.Put((Object)("buttom"),(Object)(_bottom));
 //BA.debugLineNum = 328;BA.debugLine="Padding.Put(\"right\", right)";
_padding.Put((Object)("right"),(Object)(_right));
 //BA.debugLineNum = 329;BA.debugLine="Padding.Put(\"left\", left)";
_padding.Put((Object)("left"),(Object)(_left));
 //BA.debugLineNum = 330;BA.debugLine="Chart.SetAttr(\"padding\",Padding)";
_chart._setattr /*b4j.example.wixelement*/ ("padding",(Object)(_padding.getObject()));
 //BA.debugLineNum = 331;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 332;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setpieinnertext(String _txt) throws Exception{
 //BA.debugLineNum = 449;BA.debugLine="Sub SetPieInnerText(txt As String) As WixChart";
 //BA.debugLineNum = 450;BA.debugLine="Chart.SetAttr(\"pieInnerText\", txt)";
_chart._setattr /*b4j.example.wixelement*/ ("pieInnerText",(Object)(_txt));
 //BA.debugLineNum = 451;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 452;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setradius(int _r) throws Exception{
 //BA.debugLineNum = 335;BA.debugLine="Sub SetRadius(r As Int) As WixChart";
 //BA.debugLineNum = 336;BA.debugLine="Chart.SetAttr(\"radius\", r)";
_chart._setattr /*b4j.example.wixelement*/ ("radius",(Object)(_r));
 //BA.debugLineNum = 337;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 338;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Sub SetResponsive(b As Object) As WixChart";
 //BA.debugLineNum = 41;BA.debugLine="Chart.SetResponsive(b)";
_chart._setresponsive /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 42;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixChart";
 //BA.debugLineNum = 47;BA.debugLine="Chart.SetResponsiveCell(b)";
_chart._setresponsivecell /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 48;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setshadow(int _s) throws Exception{
 //BA.debugLineNum = 308;BA.debugLine="Sub SetShadow(s As Int) As WixChart";
 //BA.debugLineNum = 309;BA.debugLine="Chart.SetAttr(\"shadow\", s)";
_chart._setattr /*b4j.example.wixelement*/ ("shadow",(Object)(_s));
 //BA.debugLineNum = 310;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 311;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setstackedbarh(String _r) throws Exception{
 //BA.debugLineNum = 208;BA.debugLine="Sub SetStackedBarH(r As String) As WixChart 'ignor";
 //BA.debugLineNum = 209;BA.debugLine="Chart.SetType(\"stackedBarH\")";
_chart._settype /*b4j.example.wixelement*/ ("stackedBarH");
 //BA.debugLineNum = 210;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 211;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 425;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 426;BA.debugLine="Chart.SetStyle(prop,val)";
_chart._setstyle /*b4j.example.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 427;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 428;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 27;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixChart";
 //BA.debugLineNum = 28;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 29;BA.debugLine="Chart.SetTemplate(os)";
_chart._settemplate /*b4j.example.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 30;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _settooltiptemplate(String _t) throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Sub SetTooltipTemplate(t As String) As WixChart";
 //BA.debugLineNum = 101;BA.debugLine="Tooltip.Put(\"template\", t)";
_tooltip.Put((Object)("template"),(Object)(_t));
 //BA.debugLineNum = 102;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _settypearea(String _r) throws Exception{
 //BA.debugLineNum = 130;BA.debugLine="Sub SetTypeArea(r As String) As WixChart 'ignore";
 //BA.debugLineNum = 131;BA.debugLine="Chart.SetType(\"area\")";
_chart._settype /*b4j.example.wixelement*/ ("area");
 //BA.debugLineNum = 132;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _settypebar(String _r) throws Exception{
 //BA.debugLineNum = 136;BA.debugLine="Sub SetTypeBar(r As String) As WixChart 'ignore";
 //BA.debugLineNum = 137;BA.debugLine="Chart.SetType(\"bar\")";
_chart._settype /*b4j.example.wixelement*/ ("bar");
 //BA.debugLineNum = 138;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _settypebarh(String _r) throws Exception{
 //BA.debugLineNum = 284;BA.debugLine="Sub SetTypeBarH(r As String) As WixChart 'ignore";
 //BA.debugLineNum = 285;BA.debugLine="Chart.SetType(\"barH\")";
_chart._settype /*b4j.example.wixelement*/ ("barH");
 //BA.debugLineNum = 286;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 287;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _settypedonut(String _r) throws Exception{
 //BA.debugLineNum = 296;BA.debugLine="Sub SetTypeDonut(r As String) As WixChart 'ignore";
 //BA.debugLineNum = 297;BA.debugLine="Chart.SetType(\"donut\")";
_chart._settype /*b4j.example.wixelement*/ ("donut");
 //BA.debugLineNum = 298;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 299;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _settypeline(String _r) throws Exception{
 //BA.debugLineNum = 148;BA.debugLine="Sub SetTypeLine(r As String) As WixChart 'ignore";
 //BA.debugLineNum = 149;BA.debugLine="Chart.SetType(\"line\")";
_chart._settype /*b4j.example.wixelement*/ ("line");
 //BA.debugLineNum = 150;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _settypepie(String _r) throws Exception{
 //BA.debugLineNum = 142;BA.debugLine="Sub SetTypePie(r As String) As WixChart 'ignore";
 //BA.debugLineNum = 143;BA.debugLine="Chart.SetType(\"pie\")";
_chart._settype /*b4j.example.wixelement*/ ("pie");
 //BA.debugLineNum = 144;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _settypepie3d(String _r) throws Exception{
 //BA.debugLineNum = 228;BA.debugLine="Sub SetTypePie3D(r As String) As WixChart 'ignore";
 //BA.debugLineNum = 229;BA.debugLine="Chart.SetType(\"pie3D\")";
_chart._settype /*b4j.example.wixelement*/ ("pie3D");
 //BA.debugLineNum = 230;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 231;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _settyperadar(String _r) throws Exception{
 //BA.debugLineNum = 240;BA.debugLine="Sub SetTypeRadar(r As String) As WixChart 'ignore";
 //BA.debugLineNum = 241;BA.debugLine="Chart.SetType(\"radar\")";
_chart._settype /*b4j.example.wixelement*/ ("radar");
 //BA.debugLineNum = 242;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 243;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _settypescatter(String _r) throws Exception{
 //BA.debugLineNum = 234;BA.debugLine="Sub SetTypeScatter(r As String) As WixChart 'ignor";
 //BA.debugLineNum = 235;BA.debugLine="Chart.SetType(\"scatter\")";
_chart._settype /*b4j.example.wixelement*/ ("scatter");
 //BA.debugLineNum = 236;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 237;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _settypespline(String _r) throws Exception{
 //BA.debugLineNum = 154;BA.debugLine="Sub SetTypeSPLine(r As String) As WixChart 'ignore";
 //BA.debugLineNum = 155;BA.debugLine="Chart.SetType(\"spline\")";
_chart._settype /*b4j.example.wixelement*/ ("spline");
 //BA.debugLineNum = 156;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _settypesplinearea(String _r) throws Exception{
 //BA.debugLineNum = 202;BA.debugLine="Sub SetTypeSPLineArea(r As String) As WixChart 'ig";
 //BA.debugLineNum = 203;BA.debugLine="Chart.SetType(\"splineArea\")";
_chart._settype /*b4j.example.wixelement*/ ("splineArea");
 //BA.debugLineNum = 204;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 205;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _settypestackedarea(String _r) throws Exception{
 //BA.debugLineNum = 214;BA.debugLine="Sub SetTypeStackedArea(r As String) As WixChart 'i";
 //BA.debugLineNum = 215;BA.debugLine="Chart.SetType(\"stackedArea\")";
_chart._settype /*b4j.example.wixelement*/ ("stackedArea");
 //BA.debugLineNum = 216;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 217;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _settypestackedbar(String _r) throws Exception{
 //BA.debugLineNum = 221;BA.debugLine="Sub SetTypeStackedBar(r As String) As WixChart 'ig";
 //BA.debugLineNum = 222;BA.debugLine="Chart.SetType(\"stackedBar\")";
_chart._settype /*b4j.example.wixelement*/ ("stackedBar");
 //BA.debugLineNum = 223;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 224;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 455;BA.debugLine="Sub SetValue(v As String) As WixChart";
 //BA.debugLineNum = 456;BA.debugLine="Chart.SetValue(v)";
_chart._setvalue /*b4j.example.wixelement*/ (_v);
 //BA.debugLineNum = 457;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 458;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setwidth(Object _h) throws Exception{
 //BA.debugLineNum = 437;BA.debugLine="Sub SetWidth(h As Object) As WixChart";
 //BA.debugLineNum = 438;BA.debugLine="Chart.SetWidth(h)";
_chart._setwidth /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 439;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 440;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setxaxistemplate(String _t) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Sub SetXAxisTemplate(t As String) As WixChart";
 //BA.debugLineNum = 107;BA.debugLine="xAxis.Put(\"template\", t)";
_xaxis.Put((Object)("template"),(Object)(_t));
 //BA.debugLineNum = 108;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setxaxistitle(String _t) throws Exception{
 //BA.debugLineNum = 503;BA.debugLine="Sub SetXAxisTitle(t As String) As WixChart";
 //BA.debugLineNum = 504;BA.debugLine="xAxis.Put(\"title\", t)";
_xaxis.Put((Object)("title"),(Object)(_t));
 //BA.debugLineNum = 505;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 506;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setxvalue(String _x) throws Exception{
 //BA.debugLineNum = 391;BA.debugLine="Sub SetXValue(x As String) As WixChart";
 //BA.debugLineNum = 392;BA.debugLine="SetAttr(\"xValue\", x)";
_setattr("xValue",(Object)(_x));
 //BA.debugLineNum = 393;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 394;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setyaxisbg(String _t) throws Exception{
 //BA.debugLineNum = 124;BA.debugLine="Sub SetYAxisBG(t As String) As WixChart";
 //BA.debugLineNum = 125;BA.debugLine="yAxis.Put(\"bg\", t)";
_yaxis.Put((Object)("bg"),(Object)(_t));
 //BA.debugLineNum = 126;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setyaxisend(int _s) throws Exception{
 //BA.debugLineNum = 166;BA.debugLine="Sub SetYAxisEnd(s As Int) As WixChart";
 //BA.debugLineNum = 167;BA.debugLine="yAxis.Put(\"end\", s)";
_yaxis.Put((Object)("end"),(Object)(_s));
 //BA.debugLineNum = 168;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setyaxislineshape(String _t) throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Sub SetYAxisLineShape(t As String) As WixChart";
 //BA.debugLineNum = 119;BA.debugLine="yAxis.Put(\"lineShape\", t)";
_yaxis.Put((Object)("lineShape"),(Object)(_t));
 //BA.debugLineNum = 120;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setyaxisstart(int _s) throws Exception{
 //BA.debugLineNum = 160;BA.debugLine="Sub SetYAxisStart(s As Int) As WixChart";
 //BA.debugLineNum = 161;BA.debugLine="yAxis.Put(\"start\", s)";
_yaxis.Put((Object)("start"),(Object)(_s));
 //BA.debugLineNum = 162;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 163;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setyaxisstep(int _s) throws Exception{
 //BA.debugLineNum = 172;BA.debugLine="Sub SetYAxisStep(s As Int) As WixChart";
 //BA.debugLineNum = 173;BA.debugLine="yAxis.Put(\"step\", s)";
_yaxis.Put((Object)("step"),(Object)(_s));
 //BA.debugLineNum = 174;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setyaxistemplate(String _t) throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Sub SetYAxisTemplate(t As String) As WixChart";
 //BA.debugLineNum = 113;BA.debugLine="yAxis.Put(\"template\", t)";
_yaxis.Put((Object)("template"),(Object)(_t));
 //BA.debugLineNum = 114;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setyaxistitle(String _t) throws Exception{
 //BA.debugLineNum = 509;BA.debugLine="Sub SetYAxisTitle(t As String) As WixChart";
 //BA.debugLineNum = 510;BA.debugLine="yAxis.Put(\"title\", t)";
_yaxis.Put((Object)("title"),(Object)(_t));
 //BA.debugLineNum = 511;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 512;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
