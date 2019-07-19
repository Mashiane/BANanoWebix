package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixrangeslider extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixrangeslider", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixrangeslider.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _rangeslider = null;
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
 //BA.debugLineNum = 145;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 146;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 150;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 151;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.example.wixform _frm) throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 16;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 140;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 141;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public RangeSlider As WixElement";
_rangeslider = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixrangeslider  _initialize(anywheresoftware.b4a.BA _ba,String _iid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize(iID As String) As WixRangeSl";
 //BA.debugLineNum = 9;BA.debugLine="ID = iID.tolowercase";
_id = _iid.toLowerCase();
 //BA.debugLineNum = 10;BA.debugLine="RangeSlider.Initialize(iID).SetView(\"rangeslider\"";
_rangeslider._initialize /*b4j.example.wixelement*/ (ba,_iid)._setview /*b4j.example.wixelement*/ ("rangeslider");
 //BA.debugLineNum = 11;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrangeslider)(this);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 74;BA.debugLine="Return RangeSlider.item";
if (true) return _rangeslider._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrangeslider  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="Sub SetAlignCenter(r As String) As WixRangeSlider";
 //BA.debugLineNum = 128;BA.debugLine="RangeSlider.setAligncenter(\"\")";
_rangeslider._setaligncenter /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 129;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrangeslider)(this);
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrangeslider  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Sub SetAlignLeft(r As String) As WixRangeSlider 'i";
 //BA.debugLineNum = 134;BA.debugLine="RangeSlider.SetAlignleft(\"\")";
_rangeslider._setalignleft /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 135;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrangeslider)(this);
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrangeslider  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 121;BA.debugLine="Sub SetAlignRight(r As String) As WixRangeSlider '";
 //BA.debugLineNum = 122;BA.debugLine="RangeSlider.setAlignright(\"\")";
_rangeslider._setalignright /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 123;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrangeslider)(this);
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrangeslider  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub SetLabel(l As String) As WixRangeSlider";
 //BA.debugLineNum = 92;BA.debugLine="RangeSlider.SetLabel(l)";
_rangeslider._setlabel /*b4j.example.wixelement*/ (_l);
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrangeslider)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrangeslider  _setlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Sub SetLabelAlign(a As String) As WixRangeSlider";
 //BA.debugLineNum = 104;BA.debugLine="RangeSlider.SetLabelAlign(a)";
_rangeslider._setlabelalign /*b4j.example.wixelement*/ (_a);
 //BA.debugLineNum = 105;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrangeslider)(this);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrangeslider  _setlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Sub SetLabelPosition(p As String) As WixRangeSlide";
 //BA.debugLineNum = 110;BA.debugLine="RangeSlider.SetLabelPosition(p)";
_rangeslider._setlabelposition /*b4j.example.wixelement*/ (_p);
 //BA.debugLineNum = 111;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrangeslider)(this);
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrangeslider  _setlabelwidth(int _w) throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Sub SetLabelWidth(w As Int) As WixRangeSlider";
 //BA.debugLineNum = 116;BA.debugLine="RangeSlider.SetLabelWidth(w)";
_rangeslider._setlabelwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 117;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrangeslider)(this);
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrangeslider  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 20;BA.debugLine="Sub SetMap(m As Map) As WixRangeSlider";
 //BA.debugLineNum = 21;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 22;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 23;BA.debugLine="RangeSlider.SetAttr(strKey,	strVal)";
_rangeslider._setattr /*b4j.example.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 25;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrangeslider)(this);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrangeslider  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub SetMinHeight(h As Int) As WixRangeSlider";
 //BA.debugLineNum = 62;BA.debugLine="RangeSlider.SetMinHeight(h)";
_rangeslider._setminheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 63;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrangeslider)(this);
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrangeslider  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Sub SetMinWidth(w As Int) As WixRangeSlider";
 //BA.debugLineNum = 56;BA.debugLine="RangeSlider.SetMinWidth(w)";
_rangeslider._setminwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 57;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrangeslider)(this);
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrangeslider  _setname(String _n) throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Sub SetName(n As String) As WixRangeSlider";
 //BA.debugLineNum = 37;BA.debugLine="RangeSlider.SetName(n)";
_rangeslider._setname /*b4j.example.wixelement*/ (_n);
 //BA.debugLineNum = 38;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrangeslider)(this);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrangeslider  _setrequired(boolean _b) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub SetRequired(b As Boolean) As WixRangeSlider";
 //BA.debugLineNum = 98;BA.debugLine="RangeSlider.SetRequired(b)";
_rangeslider._setrequired /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 99;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrangeslider)(this);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrangeslider  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Sub SetResponsive(b As Object) As WixRangeSlider";
 //BA.debugLineNum = 43;BA.debugLine="RangeSlider.SetResponsive(b)";
_rangeslider._setresponsive /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 44;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrangeslider)(this);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrangeslider  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixRangeSlid";
 //BA.debugLineNum = 49;BA.debugLine="RangeSlider.SetResponsiveCell(b)";
_rangeslider._setresponsivecell /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 50;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrangeslider)(this);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrangeslider  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 79;BA.debugLine="RangeSlider.SetStyle(prop,val)";
_rangeslider._setstyle /*b4j.example.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 80;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrangeslider)(this);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrangeslider  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 29;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixRangeSl";
 //BA.debugLineNum = 30;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 31;BA.debugLine="RangeSlider.SetTemplate(os)";
_rangeslider._settemplate /*b4j.example.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 32;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrangeslider)(this);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrangeslider  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Sub SetTooltip(tt As String) As WixRangeSlider";
 //BA.debugLineNum = 68;BA.debugLine="RangeSlider.SetTooltip(tt)";
_rangeslider._settooltip /*b4j.example.wixelement*/ (_tt);
 //BA.debugLineNum = 69;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrangeslider)(this);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrangeslider  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Sub SetValue(v As String) As WixRangeSlider";
 //BA.debugLineNum = 86;BA.debugLine="RangeSlider.SetValue(v)";
_rangeslider._setvalue /*b4j.example.wixelement*/ (_v);
 //BA.debugLineNum = 87;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrangeslider)(this);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
