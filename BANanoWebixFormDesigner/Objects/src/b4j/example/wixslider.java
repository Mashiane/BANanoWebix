package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixslider extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixslider", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixslider.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _slider = null;
public int _minimum = 0;
public int _maximum = 0;
public int _stepper = 0;
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
public String  _addtocolumns(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 185;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 186;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 187;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 190;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 191;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 192;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.example.wixform _frm) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 71;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 180;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 181;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Slider As WixElement";
_slider = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private Minimum As Int";
_minimum = 0;
 //BA.debugLineNum = 6;BA.debugLine="Private Maximum As Int";
_maximum = 0;
 //BA.debugLineNum = 7;BA.debugLine="Private Stepper As Int";
_stepper = 0;
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixslider  _initialize(anywheresoftware.b4a.BA _ba,String _iid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(iID As String) As WixSlider";
 //BA.debugLineNum = 12;BA.debugLine="ID = iID.tolowercase";
_id = _iid.toLowerCase();
 //BA.debugLineNum = 13;BA.debugLine="Slider.Initialize(iID).SetView(\"slider\")";
_slider._initialize /*b4j.example.wixelement*/ (ba,_iid)._setview /*b4j.example.wixelement*/ ("slider");
 //BA.debugLineNum = 14;BA.debugLine="Minimum = 0";
_minimum = (int) (0);
 //BA.debugLineNum = 15;BA.debugLine="Maximum = 100";
_maximum = (int) (100);
 //BA.debugLineNum = 16;BA.debugLine="Slider.SetValue(10)";
_slider._setvalue /*b4j.example.wixelement*/ (BA.NumberToString(10));
 //BA.debugLineNum = 17;BA.debugLine="Stepper = 1";
_stepper = (int) (1);
 //BA.debugLineNum = 18;BA.debugLine="Slider.SetAttr(\"title\", \"#value#\")";
_slider._setattr /*b4j.example.wixelement*/ ("title",(Object)("#value#"));
 //BA.debugLineNum = 19;BA.debugLine="Return Me";
if (true) return (b4j.example.wixslider)(this);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 100;BA.debugLine="Slider.SetAttr(\"min\",Minimum)";
_slider._setattr /*b4j.example.wixelement*/ ("min",(Object)(_minimum));
 //BA.debugLineNum = 101;BA.debugLine="Slider.SetAttr(\"max\",Maximum)";
_slider._setattr /*b4j.example.wixelement*/ ("max",(Object)(_maximum));
 //BA.debugLineNum = 102;BA.debugLine="Slider.SetAttr(\"step\", Stepper)";
_slider._setattr /*b4j.example.wixelement*/ ("step",(Object)(_stepper));
 //BA.debugLineNum = 103;BA.debugLine="Return Slider.item";
if (true) return _slider._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixslider  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 167;BA.debugLine="Sub SetAlignCenter(r As String) As WixSlider 'igno";
 //BA.debugLineNum = 168;BA.debugLine="Slider.setAligncenter(\"\")";
_slider._setaligncenter /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 169;BA.debugLine="Return Me";
if (true) return (b4j.example.wixslider)(this);
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixslider  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 173;BA.debugLine="Sub SetAlignLeft(r As String) As WixSlider 'ignore";
 //BA.debugLineNum = 174;BA.debugLine="Slider.SetAlignleft(\"\")";
_slider._setalignleft /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 175;BA.debugLine="Return Me";
if (true) return (b4j.example.wixslider)(this);
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixslider  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 161;BA.debugLine="Sub SetAlignRight(r As String) As WixSlider 'ignor";
 //BA.debugLineNum = 162;BA.debugLine="Slider.setAlignright(\"\")";
_slider._setalignright /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 163;BA.debugLine="Return Me";
if (true) return (b4j.example.wixslider)(this);
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixslider  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 131;BA.debugLine="Sub SetLabel(l As String) As WixSlider";
 //BA.debugLineNum = 132;BA.debugLine="Slider.SetLabel(l)";
_slider._setlabel /*b4j.example.wixelement*/ (_l);
 //BA.debugLineNum = 133;BA.debugLine="Return Me";
if (true) return (b4j.example.wixslider)(this);
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixslider  _setlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 143;BA.debugLine="Sub SetLabelAlign(a As String) As WixSlider";
 //BA.debugLineNum = 144;BA.debugLine="Slider.SetLabelAlign(a)";
_slider._setlabelalign /*b4j.example.wixelement*/ (_a);
 //BA.debugLineNum = 145;BA.debugLine="Return Me";
if (true) return (b4j.example.wixslider)(this);
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixslider  _setlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 149;BA.debugLine="Sub SetLabelPosition(p As String) As WixSlider";
 //BA.debugLineNum = 150;BA.debugLine="Slider.SetLabelPosition(p)";
_slider._setlabelposition /*b4j.example.wixelement*/ (_p);
 //BA.debugLineNum = 151;BA.debugLine="Return Me";
if (true) return (b4j.example.wixslider)(this);
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixslider  _setlabelwidth(int _w) throws Exception{
 //BA.debugLineNum = 155;BA.debugLine="Sub SetLabelWidth(w As Int) As WixSlider";
 //BA.debugLineNum = 156;BA.debugLine="Slider.SetLabelWidth(w)";
_slider._setlabelwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 157;BA.debugLine="Return Me";
if (true) return (b4j.example.wixslider)(this);
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixslider  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 23;BA.debugLine="Sub SetMap(m As Map) As WixSlider";
 //BA.debugLineNum = 24;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 25;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 26;BA.debugLine="Slider.SetAttr(strKey,	strVal)";
_slider._setattr /*b4j.example.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 28;BA.debugLine="Return Me";
if (true) return (b4j.example.wixslider)(this);
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixslider  _setmax(int _m) throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Sub SetMax(m As Int) As WixSlider";
 //BA.debugLineNum = 108;BA.debugLine="Maximum = m";
_maximum = _m;
 //BA.debugLineNum = 109;BA.debugLine="Return Me";
if (true) return (b4j.example.wixslider)(this);
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixslider  _setmin(int _m) throws Exception{
 //BA.debugLineNum = 113;BA.debugLine="Sub SetMin(m As Int) As WixSlider";
 //BA.debugLineNum = 114;BA.debugLine="Minimum = m";
_minimum = _m;
 //BA.debugLineNum = 115;BA.debugLine="Return Me";
if (true) return (b4j.example.wixslider)(this);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixslider  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub SetMinHeight(h As Int) As WixSlider";
 //BA.debugLineNum = 65;BA.debugLine="Slider.SetMinHeight(h)";
_slider._setminheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 66;BA.debugLine="Return Me";
if (true) return (b4j.example.wixslider)(this);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixslider  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub SetMinWidth(w As Int) As WixSlider";
 //BA.debugLineNum = 59;BA.debugLine="Slider.SetMinWidth(w)";
_slider._setminwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 60;BA.debugLine="Return Me";
if (true) return (b4j.example.wixslider)(this);
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixslider  _setmovetitle(boolean _b) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Sub SetMoveTitle(b As Boolean) As WixSlider";
 //BA.debugLineNum = 76;BA.debugLine="Slider.SetAttr(\"moveTitle\", b)";
_slider._setattr /*b4j.example.wixelement*/ ("moveTitle",(Object)(_b));
 //BA.debugLineNum = 77;BA.debugLine="Return Me";
if (true) return (b4j.example.wixslider)(this);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixslider  _setname(String _n) throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Sub SetName(n As String) As WixSlider";
 //BA.debugLineNum = 40;BA.debugLine="Slider.SetName(n)";
_slider._setname /*b4j.example.wixelement*/ (_n);
 //BA.debugLineNum = 41;BA.debugLine="Return Me";
if (true) return (b4j.example.wixslider)(this);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixslider  _setrequired(boolean _b) throws Exception{
 //BA.debugLineNum = 137;BA.debugLine="Sub SetRequired(b As Boolean) As WixSlider";
 //BA.debugLineNum = 138;BA.debugLine="Slider.SetRequired(b)";
_slider._setrequired /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 139;BA.debugLine="Return Me";
if (true) return (b4j.example.wixslider)(this);
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixslider  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Sub SetResponsive(b As Object) As WixSlider";
 //BA.debugLineNum = 46;BA.debugLine="Slider.SetResponsive(b)";
_slider._setresponsive /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 47;BA.debugLine="Return Me";
if (true) return (b4j.example.wixslider)(this);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixslider  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixSlider";
 //BA.debugLineNum = 52;BA.debugLine="Slider.SetResponsiveCell(b)";
_slider._setresponsivecell /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 53;BA.debugLine="Return Me";
if (true) return (b4j.example.wixslider)(this);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixslider  _setstep(int _s) throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Sub SetStep(s As Int) As WixSlider";
 //BA.debugLineNum = 120;BA.debugLine="Stepper = s";
_stepper = _s;
 //BA.debugLineNum = 121;BA.debugLine="Return Me";
if (true) return (b4j.example.wixslider)(this);
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixslider  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 94;BA.debugLine="Slider.SetStyle(prop,val)";
_slider._setstyle /*b4j.example.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 95;BA.debugLine="Return Me";
if (true) return (b4j.example.wixslider)(this);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixslider  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 32;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixSlider";
 //BA.debugLineNum = 33;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 34;BA.debugLine="Slider.SetTemplate(os)";
_slider._settemplate /*b4j.example.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 35;BA.debugLine="Return Me";
if (true) return (b4j.example.wixslider)(this);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixslider  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Sub SetTooltip(tt As String) As WixSlider";
 //BA.debugLineNum = 88;BA.debugLine="Slider.SetTooltip(tt)";
_slider._settooltip /*b4j.example.wixelement*/ (_tt);
 //BA.debugLineNum = 89;BA.debugLine="Return Me";
if (true) return (b4j.example.wixslider)(this);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixslider  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 125;BA.debugLine="Sub SetValue(v As String) As WixSlider";
 //BA.debugLineNum = 126;BA.debugLine="Slider.SetValue(v)";
_slider._setvalue /*b4j.example.wixelement*/ (_v);
 //BA.debugLineNum = 127;BA.debugLine="Return Me";
if (true) return (b4j.example.wixslider)(this);
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixslider  _setvertical(boolean _b) throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Sub SetVertical(b As Boolean) As WixSlider";
 //BA.debugLineNum = 82;BA.debugLine="Slider.SetAttr(\"vertical\", b)";
_slider._setattr /*b4j.example.wixelement*/ ("vertical",(Object)(_b));
 //BA.debugLineNum = 83;BA.debugLine="Return Me";
if (true) return (b4j.example.wixslider)(this);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
