package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixchart extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixchart", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixchart.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _chart = null;
public anywheresoftware.b4a.objects.collections.Map _chartitem = null;
public anywheresoftware.b4a.objects.collections.Map _chartline = null;
public anywheresoftware.b4a.objects.collections.Map _yaxis = null;
public anywheresoftware.b4a.objects.collections.Map _xaxis = null;
public anywheresoftware.b4a.objects.collections.Map _tooltip = null;
public anywheresoftware.b4a.objects.collections.Map _padding = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 560;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 561;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 562;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 565;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 566;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 567;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.Mashy.BANanoWebixDemo.wixform _frm) throws Exception{
 //BA.debugLineNum = 392;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 393;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 394;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 555;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 556;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 557;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Chart As WixElement";
_chart = new b4j.Mashy.BANanoWebixDemo.wixelement();
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
 //BA.debugLineNum = 11;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _initialize(anywheresoftware.b4a.BA _ba,String _iid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 45;BA.debugLine="Public Sub Initialize(iID As String) As WixChart";
 //BA.debugLineNum = 46;BA.debugLine="ID = iID.tolowercase";
_id = _iid.toLowerCase();
 //BA.debugLineNum = 47;BA.debugLine="Chart.Initialize(iID).SetView(\"chart\")";
_chart._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_iid)._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("chart");
 //BA.debugLineNum = 48;BA.debugLine="ChartItem.Initialize";
_chartitem.Initialize();
 //BA.debugLineNum = 49;BA.debugLine="ChartLine.Initialize";
_chartline.Initialize();
 //BA.debugLineNum = 50;BA.debugLine="yAxis.Initialize";
_yaxis.Initialize();
 //BA.debugLineNum = 51;BA.debugLine="xAxis.Initialize";
_xaxis.Initialize();
 //BA.debugLineNum = 52;BA.debugLine="Tooltip.Initialize";
_tooltip.Initialize();
 //BA.debugLineNum = 53;BA.debugLine="Padding.Initialize";
_padding.Initialize();
 //BA.debugLineNum = 54;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 454;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 455;BA.debugLine="Chart.SetAttr(\"yAxis\", yAxis)";
_chart._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("yAxis",(Object)(_yaxis.getObject()));
 //BA.debugLineNum = 456;BA.debugLine="Chart.SetAttr(\"xAxis\", xAxis)";
_chart._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("xAxis",(Object)(_xaxis.getObject()));
 //BA.debugLineNum = 457;BA.debugLine="If ChartItem.Size > 0 Then";
if (_chartitem.getSize()>0) { 
 //BA.debugLineNum = 458;BA.debugLine="Chart.SetAttr(\"item\", ChartItem)";
_chart._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("item",(Object)(_chartitem.getObject()));
 };
 //BA.debugLineNum = 460;BA.debugLine="If ChartLine.Size > 0 Then";
if (_chartline.getSize()>0) { 
 //BA.debugLineNum = 461;BA.debugLine="Chart.SetAttr(\"line\", ChartLine)";
_chart._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("line",(Object)(_chartline.getObject()));
 };
 //BA.debugLineNum = 463;BA.debugLine="If Tooltip.Size > 0 Then";
if (_tooltip.getSize()>0) { 
 //BA.debugLineNum = 464;BA.debugLine="Chart.SetAttr(\"tooltip\", Tooltip)";
_chart._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("tooltip",(Object)(_tooltip.getObject()));
 };
 //BA.debugLineNum = 466;BA.debugLine="Return Chart.item";
if (true) return _chart._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 467;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 68;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 530;BA.debugLine="Sub SetAlignCenter(r As String) As WixChart 'ignor";
 //BA.debugLineNum = 531;BA.debugLine="Chart.setAligncenter(\"\")";
_chart._setaligncenter /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 532;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 533;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 536;BA.debugLine="Sub SetAlignLeft(r As String) As WixChart 'ignore";
 //BA.debugLineNum = 537;BA.debugLine="Chart.SetAlignleft(\"\")";
_chart._setalignleft /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 538;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 539;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 524;BA.debugLine="Sub SetAlignRight(r As String) As WixChart 'ignore";
 //BA.debugLineNum = 525;BA.debugLine="Chart.setAlignright(\"\")";
_chart._setalignright /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 526;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 527;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setalpha(float _a) throws Exception{
 //BA.debugLineNum = 335;BA.debugLine="Sub SetAlpha(a As Float) As WixChart";
 //BA.debugLineNum = 336;BA.debugLine="Chart.SetAttr(\"alpha\", a)";
_chart._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("alpha",(Object)(_a));
 //BA.debugLineNum = 337;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 338;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setattr(String _prop,Object _val) throws Exception{
 //BA.debugLineNum = 139;BA.debugLine="Sub SetAttr(prop As String, val As Object) As WixC";
 //BA.debugLineNum = 140;BA.debugLine="Chart.SetAttr(prop,val)";
_chart._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 141;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 16;BA.debugLine="Sub SetAttributes(m As Map) As WixChart";
 //BA.debugLineNum = 17;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 18;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 19;BA.debugLine="Chart.SetAttr(k,v)";
_chart._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 21;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setbarwidth(int _w) throws Exception{
 //BA.debugLineNum = 323;BA.debugLine="Sub SetBarWidth(w As Int) As WixChart";
 //BA.debugLineNum = 324;BA.debugLine="Chart.SetAttr(\"barWidth\", w)";
_chart._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("barWidth",(Object)(_w));
 //BA.debugLineNum = 325;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 326;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setborder(boolean _b) throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="Sub SetBorder(b As Boolean) As WixChart";
 //BA.debugLineNum = 128;BA.debugLine="Chart.SetAttr(\"border\", b)";
_chart._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("border",(Object)(_b));
 //BA.debugLineNum = 129;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setcolor(String _c) throws Exception{
 //BA.debugLineNum = 347;BA.debugLine="Sub SetColor(c As String) As WixChart";
 //BA.debugLineNum = 348;BA.debugLine="Chart.SetAttr(\"color\", c)";
_chart._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("color",(Object)(_c));
 //BA.debugLineNum = 349;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 350;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setdata(anywheresoftware.b4a.objects.collections.List _d) throws Exception{
 //BA.debugLineNum = 482;BA.debugLine="Sub SetData(d As List) As WixChart";
 //BA.debugLineNum = 483;BA.debugLine="Chart.SetData(d)";
_chart._setdata /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_d);
 //BA.debugLineNum = 484;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 485;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setdisablelines(boolean _b) throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Sub SetDisableLines(b As Boolean) As WixChart";
 //BA.debugLineNum = 134;BA.debugLine="Chart.SetAttr(\"disableLines\", b)";
_chart._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("disableLines",(Object)(_b));
 //BA.debugLineNum = 135;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _seteventradius(int _r) throws Exception{
 //BA.debugLineNum = 121;BA.debugLine="Sub SetEventRadius(r As Int) As WixChart";
 //BA.debugLineNum = 122;BA.debugLine="Chart.SetAttr(\"eventRadius\", r)";
_chart._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("eventRadius",(Object)(_r));
 //BA.debugLineNum = 123;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setgradient(String _g) throws Exception{
 //BA.debugLineNum = 386;BA.debugLine="Sub SetGradient(g As String) As WixChart";
 //BA.debugLineNum = 387;BA.debugLine="Chart.SetAttr(\"gradient\", g)";
_chart._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("gradient",(Object)(_g));
 //BA.debugLineNum = 388;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 389;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setgradientfalling(String _r) throws Exception{
 //BA.debugLineNum = 317;BA.debugLine="Sub SetGradientFalling(r As String) As WixChart  '";
 //BA.debugLineNum = 318;BA.debugLine="Chart.SetAttr(\"gradient\", \"falling\")";
_chart._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("gradient",(Object)("falling"));
 //BA.debugLineNum = 319;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 320;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 470;BA.debugLine="Sub SetHeight(h As Object) As WixChart";
 //BA.debugLineNum = 471;BA.debugLine="Chart.SetHeight(h)";
_chart._setheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 472;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 473;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setitembordercolor(String _c) throws Exception{
 //BA.debugLineNum = 404;BA.debugLine="Sub SetItemBorderColor(c As String) As WixChart";
 //BA.debugLineNum = 405;BA.debugLine="ChartItem.Put(\"borderColor\", c)";
_chartitem.Put((Object)("borderColor"),(Object)(_c));
 //BA.debugLineNum = 406;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 407;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setitemborderwidth(String _c) throws Exception{
 //BA.debugLineNum = 417;BA.debugLine="Sub SetItemBorderWidth(c As String) As WixChart";
 //BA.debugLineNum = 418;BA.debugLine="ChartItem.Put(\"borderWidth\", c)";
_chartitem.Put((Object)("borderWidth"),(Object)(_c));
 //BA.debugLineNum = 419;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 420;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setitemcolor(String _c) throws Exception{
 //BA.debugLineNum = 448;BA.debugLine="Sub SetItemColor(c As String) As WixChart";
 //BA.debugLineNum = 449;BA.debugLine="ChartItem.Put(\"color\",c)";
_chartitem.Put((Object)("color"),(Object)(_c));
 //BA.debugLineNum = 450;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 451;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setitemradius(int _c) throws Exception{
 //BA.debugLineNum = 442;BA.debugLine="Sub SetItemRadius(c As Int) As WixChart";
 //BA.debugLineNum = 443;BA.debugLine="ChartItem.Put(\"radius\", c)";
_chartitem.Put((Object)("radius"),(Object)(_c));
 //BA.debugLineNum = 444;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 445;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setitemshadow(boolean _c) throws Exception{
 //BA.debugLineNum = 429;BA.debugLine="Sub SetItemShadow(c As Boolean) As WixChart";
 //BA.debugLineNum = 430;BA.debugLine="ChartItem.Put(\"shadow\", c)";
_chartitem.Put((Object)("shadow"),(Object)(_c));
 //BA.debugLineNum = 431;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 432;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setitemtype(String _c) throws Exception{
 //BA.debugLineNum = 423;BA.debugLine="Sub SetItemType(c As String) As WixChart";
 //BA.debugLineNum = 424;BA.debugLine="ChartItem.Put(\"type\", c)";
_chartitem.Put((Object)("type"),(Object)(_c));
 //BA.debugLineNum = 425;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 426;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setitemtypediamond(String _r) throws Exception{
 //BA.debugLineNum = 235;BA.debugLine="Sub SetItemTypeDiamond(r As String) As WixChart  '";
 //BA.debugLineNum = 236;BA.debugLine="ChartItem.Put(\"type\", \"d\")";
_chartitem.Put((Object)("type"),(Object)("d"));
 //BA.debugLineNum = 237;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 238;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setitemtyperound(String _r) throws Exception{
 //BA.debugLineNum = 241;BA.debugLine="Sub SetItemTypeRound(r As String) As WixChart 'ign";
 //BA.debugLineNum = 242;BA.debugLine="ChartItem.Put(\"type\", \"r\")";
_chartitem.Put((Object)("type"),(Object)("r"));
 //BA.debugLineNum = 243;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 244;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setitemtypesquare(String _r) throws Exception{
 //BA.debugLineNum = 223;BA.debugLine="Sub SetItemTypeSquare(r As String) As WixChart  'i";
 //BA.debugLineNum = 224;BA.debugLine="ChartItem.Put(\"type\", \"s\")";
_chartitem.Put((Object)("type"),(Object)("s"));
 //BA.debugLineNum = 225;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 226;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setitemtypetriangle(String _r) throws Exception{
 //BA.debugLineNum = 229;BA.debugLine="Sub SetItemTypeTriangle(r As String) As WixChart '";
 //BA.debugLineNum = 230;BA.debugLine="ChartItem.Put(\"type\", \"t\")";
_chartitem.Put((Object)("type"),(Object)("t"));
 //BA.debugLineNum = 231;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 232;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 500;BA.debugLine="Sub SetLabel(l As String) As WixChart";
 //BA.debugLineNum = 501;BA.debugLine="Chart.SetLabel(l)";
_chart._setlabel /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_l);
 //BA.debugLineNum = 502;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 503;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 506;BA.debugLine="Sub SetLabelAlign(a As String) As WixChart";
 //BA.debugLineNum = 507;BA.debugLine="Chart.SetLabelAlign(a)";
_chart._setlabelalign /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_a);
 //BA.debugLineNum = 508;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 509;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setlabeloffset(int _c) throws Exception{
 //BA.debugLineNum = 410;BA.debugLine="Sub SetLabelOffset(c As Int) As WixChart";
 //BA.debugLineNum = 411;BA.debugLine="ChartItem.Put(\"labelOffset\", c)";
_chartitem.Put((Object)("labelOffset"),(Object)(_c));
 //BA.debugLineNum = 412;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 413;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 512;BA.debugLine="Sub SetLabelPosition(p As String) As WixChart";
 //BA.debugLineNum = 513;BA.debugLine="Chart.SetLabelPosition(p)";
_chart._setlabelposition /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_p);
 //BA.debugLineNum = 514;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 515;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setlabelwidth(int _w) throws Exception{
 //BA.debugLineNum = 518;BA.debugLine="Sub SetLabelWidth(w As Int) As WixChart";
 //BA.debugLineNum = 519;BA.debugLine="Chart.SetLabelWidth(w)";
_chart._setlabelwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 520;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 521;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setlegend(int _width,int _align) throws Exception{
anywheresoftware.b4a.objects.collections.Map _l = null;
 //BA.debugLineNum = 310;BA.debugLine="Sub SetLegend(width As Int, align As Int) As WixCh";
 //BA.debugLineNum = 311;BA.debugLine="Dim l As Map = CreateMap(\"width\": width, \"align\"";
_l = new anywheresoftware.b4a.objects.collections.Map();
_l = __c.createMap(new Object[] {(Object)("width"),(Object)(_width),(Object)("align"),(Object)(_align)});
 //BA.debugLineNum = 312;BA.debugLine="Chart.SetAttr(\"legend\", l)";
_chart._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("legend",(Object)(_l.getObject()));
 //BA.debugLineNum = 313;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 314;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setlinecolor(String _c) throws Exception{
 //BA.debugLineNum = 292;BA.debugLine="Sub SetLineColor(c As String) As WixChart";
 //BA.debugLineNum = 293;BA.debugLine="ChartLine.Put(\"color\", c)";
_chartline.Put((Object)("color"),(Object)(_c));
 //BA.debugLineNum = 294;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 295;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setlineshadow(boolean _w) throws Exception{
 //BA.debugLineNum = 304;BA.debugLine="Sub SetLineShadow(w As Boolean) As WixChart";
 //BA.debugLineNum = 305;BA.debugLine="ChartLine.Put(\"shadow\", w)";
_chartline.Put((Object)("shadow"),(Object)(_w));
 //BA.debugLineNum = 306;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 307;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setlinewidth(int _w) throws Exception{
 //BA.debugLineNum = 298;BA.debugLine="Sub SetLineWidth(w As Int) As WixChart";
 //BA.debugLineNum = 299;BA.debugLine="ChartLine.Put(\"width\", w)";
_chartline.Put((Object)("width"),(Object)(_w));
 //BA.debugLineNum = 300;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 301;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 110;BA.debugLine="Sub SetMap(m As Map) As WixChart";
 //BA.debugLineNum = 111;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 112;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 113;BA.debugLine="Chart.SetAttr(strKey,	strVal)";
_chart._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 115;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Sub SetMargin(margin As Object) As WixChart";
 //BA.debugLineNum = 26;BA.debugLine="Chart.SetMargin(margin)";
_chart._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 27;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Sub SetMinHeight(h As Int) As WixChart";
 //BA.debugLineNum = 105;BA.debugLine="Chart.SetMinHeight(h)";
_chart._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 106;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Sub SetMinWidth(w As Int) As WixChart";
 //BA.debugLineNum = 99;BA.debugLine="Chart.SetMinWidth(w)";
_chart._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 100;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setname(String _n) throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Sub SetName(n As String) As WixChart";
 //BA.debugLineNum = 80;BA.debugLine="Chart.SetName(n)";
_chart._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 81;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setoffset(int _o) throws Exception{
 //BA.debugLineNum = 398;BA.debugLine="Sub SetOffSet(o As Int) As WixChart";
 //BA.debugLineNum = 399;BA.debugLine="Chart.SetAttr(\"offset\",o)";
_chart._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("offset",(Object)(_o));
 //BA.debugLineNum = 400;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 401;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setpadding(int _r) throws Exception{
 //BA.debugLineNum = 359;BA.debugLine="Sub SetPadding(r As Int) As WixChart";
 //BA.debugLineNum = 360;BA.debugLine="Padding.Put(\"top\", r)";
_padding.Put((Object)("top"),(Object)(_r));
 //BA.debugLineNum = 361;BA.debugLine="Padding.Put(\"buttom\",r)";
_padding.Put((Object)("buttom"),(Object)(_r));
 //BA.debugLineNum = 362;BA.debugLine="Padding.Put(\"right\", r)";
_padding.Put((Object)("right"),(Object)(_r));
 //BA.debugLineNum = 363;BA.debugLine="Padding.Put(\"left\", r)";
_padding.Put((Object)("left"),(Object)(_r));
 //BA.debugLineNum = 364;BA.debugLine="Chart.SetAttr(\"padding\",Padding)";
_chart._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("padding",(Object)(_padding.getObject()));
 //BA.debugLineNum = 365;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 366;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setpadding1(int _top,int _bottom,int _right,int _left) throws Exception{
 //BA.debugLineNum = 370;BA.debugLine="Sub SetPadding1(top As Int, bottom As Int, right A";
 //BA.debugLineNum = 371;BA.debugLine="Padding.Put(\"top\", top)";
_padding.Put((Object)("top"),(Object)(_top));
 //BA.debugLineNum = 372;BA.debugLine="Padding.Put(\"buttom\",bottom)";
_padding.Put((Object)("buttom"),(Object)(_bottom));
 //BA.debugLineNum = 373;BA.debugLine="Padding.Put(\"right\", right)";
_padding.Put((Object)("right"),(Object)(_right));
 //BA.debugLineNum = 374;BA.debugLine="Padding.Put(\"left\", left)";
_padding.Put((Object)("left"),(Object)(_left));
 //BA.debugLineNum = 375;BA.debugLine="Chart.SetAttr(\"padding\",Padding)";
_chart._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("padding",(Object)(_padding.getObject()));
 //BA.debugLineNum = 376;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 377;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Sub SetParent(p As WixElement) As WixChart";
 //BA.debugLineNum = 40;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 41;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setpieinnertext(String _txt) throws Exception{
 //BA.debugLineNum = 488;BA.debugLine="Sub SetPieInnerText(txt As String) As WixChart";
 //BA.debugLineNum = 489;BA.debugLine="Chart.SetAttr(\"pieInnerText\", txt)";
_chart._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("pieInnerText",(Object)(_txt));
 //BA.debugLineNum = 490;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 491;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setradius(int _r) throws Exception{
 //BA.debugLineNum = 380;BA.debugLine="Sub SetRadius(r As Int) As WixChart";
 //BA.debugLineNum = 381;BA.debugLine="Chart.SetAttr(\"radius\", r)";
_chart._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("radius",(Object)(_r));
 //BA.debugLineNum = 382;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 383;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Sub SetResponsive(b As Object) As WixChart";
 //BA.debugLineNum = 86;BA.debugLine="Chart.SetResponsive(b)";
_chart._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 87;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixChart";
 //BA.debugLineNum = 92;BA.debugLine="Chart.SetResponsiveCell(b)";
_chart._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setshadow(int _s) throws Exception{
 //BA.debugLineNum = 353;BA.debugLine="Sub SetShadow(s As Int) As WixChart";
 //BA.debugLineNum = 354;BA.debugLine="Chart.SetAttr(\"shadow\", s)";
_chart._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("shadow",(Object)(_s));
 //BA.debugLineNum = 355;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 356;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setstackedbarh(String _r) throws Exception{
 //BA.debugLineNum = 253;BA.debugLine="Sub SetStackedBarH(r As String) As WixChart 'ignor";
 //BA.debugLineNum = 254;BA.debugLine="Chart.SetType(\"stackedBarH\")";
_chart._settype /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("stackedBarH");
 //BA.debugLineNum = 255;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 256;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 61;BA.debugLine="Chart.SetStyle(prop,sval)";
_chart._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 30;BA.debugLine="Sub SetStyles(m As Map) As WixChart";
 //BA.debugLineNum = 31;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 32;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 33;BA.debugLine="Chart.SetStyle(k,v)";
_chart._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 35;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 71;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixChart";
 //BA.debugLineNum = 72;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 73;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 74;BA.debugLine="Chart.SetTemplate(os)";
_chart._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 75;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _settooltiptemplate(String _t) throws Exception{
 //BA.debugLineNum = 145;BA.debugLine="Sub SetTooltipTemplate(t As String) As WixChart";
 //BA.debugLineNum = 146;BA.debugLine="Tooltip.Put(\"template\", t)";
_tooltip.Put((Object)("template"),(Object)(_t));
 //BA.debugLineNum = 147;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _settypearea(String _r) throws Exception{
 //BA.debugLineNum = 175;BA.debugLine="Sub SetTypeArea(r As String) As WixChart 'ignore";
 //BA.debugLineNum = 176;BA.debugLine="Chart.SetType(\"area\")";
_chart._settype /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("area");
 //BA.debugLineNum = 177;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 178;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _settypebar(String _r) throws Exception{
 //BA.debugLineNum = 181;BA.debugLine="Sub SetTypeBar(r As String) As WixChart 'ignore";
 //BA.debugLineNum = 182;BA.debugLine="Chart.SetType(\"bar\")";
_chart._settype /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("bar");
 //BA.debugLineNum = 183;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _settypebarh(String _r) throws Exception{
 //BA.debugLineNum = 329;BA.debugLine="Sub SetTypeBarH(r As String) As WixChart 'ignore";
 //BA.debugLineNum = 330;BA.debugLine="Chart.SetType(\"barH\")";
_chart._settype /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("barH");
 //BA.debugLineNum = 331;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 332;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _settypedonut(String _r) throws Exception{
 //BA.debugLineNum = 341;BA.debugLine="Sub SetTypeDonut(r As String) As WixChart 'ignore";
 //BA.debugLineNum = 342;BA.debugLine="Chart.SetType(\"donut\")";
_chart._settype /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("donut");
 //BA.debugLineNum = 343;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 344;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _settypeline(String _r) throws Exception{
 //BA.debugLineNum = 193;BA.debugLine="Sub SetTypeLine(r As String) As WixChart 'ignore";
 //BA.debugLineNum = 194;BA.debugLine="Chart.SetType(\"line\")";
_chart._settype /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("line");
 //BA.debugLineNum = 195;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 196;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _settypepie(String _r) throws Exception{
 //BA.debugLineNum = 187;BA.debugLine="Sub SetTypePie(r As String) As WixChart 'ignore";
 //BA.debugLineNum = 188;BA.debugLine="Chart.SetType(\"pie\")";
_chart._settype /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("pie");
 //BA.debugLineNum = 189;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 190;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _settypepie3d(String _r) throws Exception{
 //BA.debugLineNum = 273;BA.debugLine="Sub SetTypePie3D(r As String) As WixChart 'ignore";
 //BA.debugLineNum = 274;BA.debugLine="Chart.SetType(\"pie3D\")";
_chart._settype /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("pie3D");
 //BA.debugLineNum = 275;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 276;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _settyperadar(String _r) throws Exception{
 //BA.debugLineNum = 285;BA.debugLine="Sub SetTypeRadar(r As String) As WixChart 'ignore";
 //BA.debugLineNum = 286;BA.debugLine="Chart.SetType(\"radar\")";
_chart._settype /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("radar");
 //BA.debugLineNum = 287;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 288;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _settypescatter(String _r) throws Exception{
 //BA.debugLineNum = 279;BA.debugLine="Sub SetTypeScatter(r As String) As WixChart 'ignor";
 //BA.debugLineNum = 280;BA.debugLine="Chart.SetType(\"scatter\")";
_chart._settype /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("scatter");
 //BA.debugLineNum = 281;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 282;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _settypespline(String _r) throws Exception{
 //BA.debugLineNum = 199;BA.debugLine="Sub SetTypeSPLine(r As String) As WixChart 'ignore";
 //BA.debugLineNum = 200;BA.debugLine="Chart.SetType(\"spline\")";
_chart._settype /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("spline");
 //BA.debugLineNum = 201;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 202;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _settypesplinearea(String _r) throws Exception{
 //BA.debugLineNum = 247;BA.debugLine="Sub SetTypeSPLineArea(r As String) As WixChart 'ig";
 //BA.debugLineNum = 248;BA.debugLine="Chart.SetType(\"splineArea\")";
_chart._settype /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("splineArea");
 //BA.debugLineNum = 249;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 250;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _settypestackedarea(String _r) throws Exception{
 //BA.debugLineNum = 259;BA.debugLine="Sub SetTypeStackedArea(r As String) As WixChart 'i";
 //BA.debugLineNum = 260;BA.debugLine="Chart.SetType(\"stackedArea\")";
_chart._settype /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("stackedArea");
 //BA.debugLineNum = 261;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 262;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _settypestackedbar(String _r) throws Exception{
 //BA.debugLineNum = 266;BA.debugLine="Sub SetTypeStackedBar(r As String) As WixChart 'ig";
 //BA.debugLineNum = 267;BA.debugLine="Chart.SetType(\"stackedBar\")";
_chart._settype /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("stackedBar");
 //BA.debugLineNum = 268;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 269;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 494;BA.debugLine="Sub SetValue(v As String) As WixChart";
 //BA.debugLineNum = 495;BA.debugLine="Chart.SetValue(v)";
_chart._setvalue /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_v);
 //BA.debugLineNum = 496;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 497;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setwidth(Object _h) throws Exception{
 //BA.debugLineNum = 476;BA.debugLine="Sub SetWidth(h As Object) As WixChart";
 //BA.debugLineNum = 477;BA.debugLine="Chart.SetWidth(h)";
_chart._setwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 478;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 479;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setxaxistemplate(String _t) throws Exception{
 //BA.debugLineNum = 151;BA.debugLine="Sub SetXAxisTemplate(t As String) As WixChart";
 //BA.debugLineNum = 152;BA.debugLine="xAxis.Put(\"template\", t)";
_xaxis.Put((Object)("template"),(Object)(_t));
 //BA.debugLineNum = 153;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setxaxistitle(String _t) throws Exception{
 //BA.debugLineNum = 542;BA.debugLine="Sub SetXAxisTitle(t As String) As WixChart";
 //BA.debugLineNum = 543;BA.debugLine="xAxis.Put(\"title\", t)";
_xaxis.Put((Object)("title"),(Object)(_t));
 //BA.debugLineNum = 544;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 545;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setxvalue(String _x) throws Exception{
 //BA.debugLineNum = 436;BA.debugLine="Sub SetXValue(x As String) As WixChart";
 //BA.debugLineNum = 437;BA.debugLine="SetAttr(\"xValue\", x)";
_setattr("xValue",(Object)(_x));
 //BA.debugLineNum = 438;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 439;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setyaxisbg(String _t) throws Exception{
 //BA.debugLineNum = 169;BA.debugLine="Sub SetYAxisBG(t As String) As WixChart";
 //BA.debugLineNum = 170;BA.debugLine="yAxis.Put(\"bg\", t)";
_yaxis.Put((Object)("bg"),(Object)(_t));
 //BA.debugLineNum = 171;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 172;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setyaxisend(int _s) throws Exception{
 //BA.debugLineNum = 211;BA.debugLine="Sub SetYAxisEnd(s As Int) As WixChart";
 //BA.debugLineNum = 212;BA.debugLine="yAxis.Put(\"end\", s)";
_yaxis.Put((Object)("end"),(Object)(_s));
 //BA.debugLineNum = 213;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 214;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setyaxislineshape(String _t) throws Exception{
 //BA.debugLineNum = 163;BA.debugLine="Sub SetYAxisLineShape(t As String) As WixChart";
 //BA.debugLineNum = 164;BA.debugLine="yAxis.Put(\"lineShape\", t)";
_yaxis.Put((Object)("lineShape"),(Object)(_t));
 //BA.debugLineNum = 165;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 166;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setyaxisstart(int _s) throws Exception{
 //BA.debugLineNum = 205;BA.debugLine="Sub SetYAxisStart(s As Int) As WixChart";
 //BA.debugLineNum = 206;BA.debugLine="yAxis.Put(\"start\", s)";
_yaxis.Put((Object)("start"),(Object)(_s));
 //BA.debugLineNum = 207;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 208;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setyaxisstep(int _s) throws Exception{
 //BA.debugLineNum = 217;BA.debugLine="Sub SetYAxisStep(s As Int) As WixChart";
 //BA.debugLineNum = 218;BA.debugLine="yAxis.Put(\"step\", s)";
_yaxis.Put((Object)("step"),(Object)(_s));
 //BA.debugLineNum = 219;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 220;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setyaxistemplate(String _t) throws Exception{
 //BA.debugLineNum = 157;BA.debugLine="Sub SetYAxisTemplate(t As String) As WixChart";
 //BA.debugLineNum = 158;BA.debugLine="yAxis.Put(\"template\", t)";
_yaxis.Put((Object)("template"),(Object)(_t));
 //BA.debugLineNum = 159;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _setyaxistitle(String _t) throws Exception{
 //BA.debugLineNum = 548;BA.debugLine="Sub SetYAxisTitle(t As String) As WixChart";
 //BA.debugLineNum = 549;BA.debugLine="yAxis.Put(\"title\", t)";
_yaxis.Put((Object)("title"),(Object)(_t));
 //BA.debugLineNum = 550;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixchart)(this);
 //BA.debugLineNum = 551;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
