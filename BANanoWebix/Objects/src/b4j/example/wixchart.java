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
public b4j.example.main _main = null;
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
public b4j.example.pgdatatable _pgdatatable = null;
public b4j.example.pglayout _pglayout = null;
public String  _addtoform(b4j.example.wixform _frm) throws Exception{
 //BA.debugLineNum = 125;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 126;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Chart As WixElement";
_chart = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixchart  _initialize(anywheresoftware.b4a.BA _ba,String _iid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize(iID As String) As WixChart";
 //BA.debugLineNum = 9;BA.debugLine="ID = iID.tolowercase";
_id = _iid.toLowerCase();
 //BA.debugLineNum = 10;BA.debugLine="Chart.Initialize(iID).SetView(\"chart\")";
_chart._initialize /*b4j.example.wixelement*/ (ba,_iid)._setview /*b4j.example.wixelement*/ ("chart");
 //BA.debugLineNum = 11;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 138;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 139;BA.debugLine="Return Chart.item";
if (true) return _chart._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 209;BA.debugLine="Sub SetAlignCenter(r As String) As WixChart 'ignor";
 //BA.debugLineNum = 210;BA.debugLine="Chart.setAligncenter(\"\")";
_chart._setaligncenter /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 211;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 212;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 215;BA.debugLine="Sub SetAlignLeft(r As String) As WixChart 'ignore";
 //BA.debugLineNum = 216;BA.debugLine="Chart.SetAlignleft(\"\")";
_chart._setalignleft /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 217;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 218;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 203;BA.debugLine="Sub SetAlignRight(r As String) As WixChart 'ignore";
 //BA.debugLineNum = 204;BA.debugLine="Chart.setAlignright(\"\")";
_chart._setalignright /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 205;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 206;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setbarwidth(int _w) throws Exception{
 //BA.debugLineNum = 77;BA.debugLine="Sub SetBarWidth(w As Int) As WixChart";
 //BA.debugLineNum = 78;BA.debugLine="Chart.SetProperty(\"barWidth\", w)";
_chart._setproperty /*b4j.example.wixelement*/ ("barWidth",(Object)(_w));
 //BA.debugLineNum = 79;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setcolor(String _c) throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Sub SetColor(c As String) As WixChart";
 //BA.debugLineNum = 96;BA.debugLine="Chart.SetProperty(\"color\", c)";
_chart._setproperty /*b4j.example.wixelement*/ ("color",(Object)(_c));
 //BA.debugLineNum = 97;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setdata(anywheresoftware.b4a.objects.collections.List _d) throws Exception{
 //BA.debugLineNum = 161;BA.debugLine="Sub SetData(d As List) As WixChart";
 //BA.debugLineNum = 162;BA.debugLine="Chart.SetData(d)";
_chart._setdata /*b4j.example.wixelement*/ (_d);
 //BA.debugLineNum = 163;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setgradient(String _g) throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Sub SetGradient(g As String) As WixChart";
 //BA.debugLineNum = 120;BA.debugLine="Chart.SetProperty(\"gradient\", g)";
_chart._setproperty /*b4j.example.wixelement*/ ("gradient",(Object)(_g));
 //BA.debugLineNum = 121;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setheight(int _h) throws Exception{
 //BA.debugLineNum = 149;BA.debugLine="Sub SetHeight(h As Int) As WixChart";
 //BA.debugLineNum = 150;BA.debugLine="Chart.SetHeight(h)";
_chart._setheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 151;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 179;BA.debugLine="Sub SetLabel(l As String) As WixChart";
 //BA.debugLineNum = 180;BA.debugLine="Chart.Label.Text = l";
_chart._label /*b4j.example.wixelement._labeltype*/ .Text /*String*/  = _l;
 //BA.debugLineNum = 181;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 185;BA.debugLine="Sub SetLabelAlign(a As String) As WixChart";
 //BA.debugLineNum = 186;BA.debugLine="Chart.Label.Align = a";
_chart._label /*b4j.example.wixelement._labeltype*/ .Align /*String*/  = _a;
 //BA.debugLineNum = 187;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 191;BA.debugLine="Sub SetLabelPosition(p As String) As WixChart";
 //BA.debugLineNum = 192;BA.debugLine="Chart.Label.Position = p";
_chart._label /*b4j.example.wixelement._labeltype*/ .Position /*String*/  = _p;
 //BA.debugLineNum = 193;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setlabelwidth(int _w) throws Exception{
 //BA.debugLineNum = 197;BA.debugLine="Sub SetLabelWidth(w As Int) As WixChart";
 //BA.debugLineNum = 198;BA.debugLine="Chart.Label.Width = w";
_chart._label /*b4j.example.wixelement._labeltype*/ .Width /*int*/  = _w;
 //BA.debugLineNum = 199;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 200;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setlegend(int _width,int _align) throws Exception{
anywheresoftware.b4a.objects.collections.Map _l = null;
 //BA.debugLineNum = 70;BA.debugLine="Sub SetLegend(width As Int, align As Int) As WixCh";
 //BA.debugLineNum = 71;BA.debugLine="Dim l As Map = CreateMap(\"width\": width, \"align\"";
_l = new anywheresoftware.b4a.objects.collections.Map();
_l = __c.createMap(new Object[] {(Object)("width"),(Object)(_width),(Object)("align"),(Object)(_align)});
 //BA.debugLineNum = 72;BA.debugLine="Chart.SetProperty(\"legend\", l)";
_chart._setproperty /*b4j.example.wixelement*/ ("legend",(Object)(_l.getObject()));
 //BA.debugLineNum = 73;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setline(String _linecolor,int _linewidth) throws Exception{
anywheresoftware.b4a.objects.collections.Map _l = null;
 //BA.debugLineNum = 63;BA.debugLine="Sub SetLine(LineColor As String, LineWidth As Int)";
 //BA.debugLineNum = 64;BA.debugLine="Dim l As Map = CreateMap(\"color\": LineColor, \"wid";
_l = new anywheresoftware.b4a.objects.collections.Map();
_l = __c.createMap(new Object[] {(Object)("color"),(Object)(_linecolor),(Object)("width"),(Object)(_linewidth)});
 //BA.debugLineNum = 65;BA.debugLine="Chart.SetProperty(\"line\", l)";
_chart._setproperty /*b4j.example.wixelement*/ ("line",(Object)(_l.getObject()));
 //BA.debugLineNum = 66;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setpadding(int _r) throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Sub SetPadding(r As Int) As WixChart";
 //BA.debugLineNum = 108;BA.debugLine="Chart.setproperty(\"padding\",r)";
_chart._setproperty /*b4j.example.wixelement*/ ("padding",(Object)(_r));
 //BA.debugLineNum = 109;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setpieinnertext(String _txt) throws Exception{
 //BA.debugLineNum = 167;BA.debugLine="Sub SetPieInnerText(txt As String) As WixChart";
 //BA.debugLineNum = 168;BA.debugLine="Chart.SetProperty(\"pieInnerText\", txt)";
_chart._setproperty /*b4j.example.wixelement*/ ("pieInnerText",(Object)(_txt));
 //BA.debugLineNum = 169;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setradius(int _r) throws Exception{
 //BA.debugLineNum = 113;BA.debugLine="Sub SetRadius(r As Int) As WixChart";
 //BA.debugLineNum = 114;BA.debugLine="Chart.SetProperty(\"radius\", r)";
_chart._setproperty /*b4j.example.wixelement*/ ("radius",(Object)(_r));
 //BA.debugLineNum = 115;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setshadow(int _s) throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Sub SetShadow(s As Int) As WixChart";
 //BA.debugLineNum = 102;BA.debugLine="Chart.SetProperty(\"shadow\", s)";
_chart._setproperty /*b4j.example.wixelement*/ ("shadow",(Object)(_s));
 //BA.debugLineNum = 103;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setstackedbarh(String _r) throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Sub SetStackedBarH(r As String) As WixChart 'ignor";
 //BA.debugLineNum = 46;BA.debugLine="Chart.SetType(\"stackedBarH\")";
_chart._settype /*b4j.example.wixelement*/ ("stackedBarH");
 //BA.debugLineNum = 47;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 143;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 144;BA.debugLine="Chart.SetStyle(prop,val)";
_chart._setstyle /*b4j.example.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 145;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 131;BA.debugLine="Sub SetTooltip(tt As String) As WixChart";
 //BA.debugLineNum = 132;BA.debugLine="Chart.SetTooltip(tt)";
_chart._settooltip /*b4j.example.wixelement*/ (_tt);
 //BA.debugLineNum = 133;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _settypearea(String _r) throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub SetTypeArea(r As String) As WixChart 'ignore";
 //BA.debugLineNum = 16;BA.debugLine="Chart.SetType(\"area\")";
_chart._settype /*b4j.example.wixelement*/ ("area");
 //BA.debugLineNum = 17;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _settypebar(String _r) throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub SetTypeBar(r As String) As WixChart 'ignore";
 //BA.debugLineNum = 22;BA.debugLine="Chart.SetType(\"bar\")";
_chart._settype /*b4j.example.wixelement*/ ("bar");
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _settypebarh(String _r) throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Sub SetTypeBarH(r As String) As WixChart 'ignore";
 //BA.debugLineNum = 84;BA.debugLine="Chart.SetType(\"barH\")";
_chart._settype /*b4j.example.wixelement*/ ("barH");
 //BA.debugLineNum = 85;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _settypedonut(String _r) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub SetTypeDonut(r As String) As WixChart 'ignore";
 //BA.debugLineNum = 90;BA.debugLine="Chart.SetType(\"donut\")";
_chart._settype /*b4j.example.wixelement*/ ("donut");
 //BA.debugLineNum = 91;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _settypeline(String _r) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub SetTypeLine(r As String) As WixChart 'ignore";
 //BA.debugLineNum = 34;BA.debugLine="Chart.SetType(\"line\")";
_chart._settype /*b4j.example.wixelement*/ ("line");
 //BA.debugLineNum = 35;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _settypepie(String _r) throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Sub SetTypePie(r As String) As WixChart 'ignore";
 //BA.debugLineNum = 28;BA.debugLine="Chart.SetType(\"pie\")";
_chart._settype /*b4j.example.wixelement*/ ("pie");
 //BA.debugLineNum = 29;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _settypepie3d(String _r) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub SetTypePie3D(r As String) As WixChart 'ignore";
 //BA.debugLineNum = 58;BA.debugLine="Chart.SetType(\"pie3D\")";
_chart._settype /*b4j.example.wixelement*/ ("pie3D");
 //BA.debugLineNum = 59;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _settypespline(String _r) throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Sub SetTypeSPLine(r As String) As WixChart 'ignore";
 //BA.debugLineNum = 40;BA.debugLine="Chart.SetType(\"spline\")";
_chart._settype /*b4j.example.wixelement*/ ("spline");
 //BA.debugLineNum = 41;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _settypestackedarea(String _r) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub SetTypeStackedArea(r As String) As WixChart 'i";
 //BA.debugLineNum = 52;BA.debugLine="Chart.SetType(\"stackedArea\")";
_chart._settype /*b4j.example.wixelement*/ ("stackedArea");
 //BA.debugLineNum = 53;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 173;BA.debugLine="Sub SetValue(v As String) As WixChart";
 //BA.debugLineNum = 174;BA.debugLine="Chart.Value = v";
_chart._value /*Object*/  = (Object)(_v);
 //BA.debugLineNum = 175;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _setwidth(int _h) throws Exception{
 //BA.debugLineNum = 155;BA.debugLine="Sub SetWidth(h As Int) As WixChart";
 //BA.debugLineNum = 156;BA.debugLine="Chart.SetWidth(h)";
_chart._setwidth /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 157;BA.debugLine="Return Me";
if (true) return (b4j.example.wixchart)(this);
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
