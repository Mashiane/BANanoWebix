package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixcolorpicker extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixcolorpicker", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixcolorpicker.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _colorpicker = null;
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
 //BA.debugLineNum = 148;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 149;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 153;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 154;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.example.wixform _frm) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 76;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 143;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 144;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public ColorPicker As WixElement";
_colorpicker = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixcolorpicker  _initialize(anywheresoftware.b4a.BA _ba,String _bid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize(bID As String) As WixColorPi";
 //BA.debugLineNum = 9;BA.debugLine="ID = bID.ToLowerCase";
_id = _bid.toLowerCase();
 //BA.debugLineNum = 10;BA.debugLine="ColorPicker.Initialize(ID).SetView(\"colorpicker\")";
_colorpicker._initialize /*b4j.example.wixelement*/ (ba,_id)._setview /*b4j.example.wixelement*/ ("colorpicker");
 //BA.debugLineNum = 11;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcolorpicker)(this);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 16;BA.debugLine="Return ColorPicker.item";
if (true) return _colorpicker._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcolorpicker  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 130;BA.debugLine="Sub SetAlignCenter(r As String) As WixColorPicker";
 //BA.debugLineNum = 131;BA.debugLine="ColorPicker.setAligncenter(\"\")";
_colorpicker._setaligncenter /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 132;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcolorpicker)(this);
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcolorpicker  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 136;BA.debugLine="Sub SetAlignLeft(r As String) As WixColorPicker 'i";
 //BA.debugLineNum = 137;BA.debugLine="ColorPicker.SetAlignleft(\"\")";
_colorpicker._setalignleft /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 138;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcolorpicker)(this);
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcolorpicker  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 124;BA.debugLine="Sub SetAlignRight(r As String) As WixColorPicker '";
 //BA.debugLineNum = 125;BA.debugLine="ColorPicker.setAlignright(\"\")";
_colorpicker._setalignright /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 126;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcolorpicker)(this);
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcolorpicker  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub SetLabel(l As String) As WixColorPicker";
 //BA.debugLineNum = 94;BA.debugLine="ColorPicker.SetLabel(l)";
_colorpicker._setlabel /*b4j.example.wixelement*/ (_l);
 //BA.debugLineNum = 95;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcolorpicker)(this);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcolorpicker  _setlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 105;BA.debugLine="Sub SetLabelAlign(a As String) As WixColorPicker";
 //BA.debugLineNum = 106;BA.debugLine="ColorPicker.SetLabelAlign(a)";
_colorpicker._setlabelalign /*b4j.example.wixelement*/ (_a);
 //BA.debugLineNum = 107;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcolorpicker)(this);
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcolorpicker  _setlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 111;BA.debugLine="Sub SetLabelPosition(p As String) As WixColorPicke";
 //BA.debugLineNum = 112;BA.debugLine="ColorPicker.SetLabelPosition(p)";
_colorpicker._setlabelposition /*b4j.example.wixelement*/ (_p);
 //BA.debugLineNum = 113;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcolorpicker)(this);
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcolorpicker  _setlabelwidth(int _w) throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Sub SetLabelWidth(w As Int) As WixColorPicker";
 //BA.debugLineNum = 118;BA.debugLine="ColorPicker.SetLabelWidth(w)";
_colorpicker._setlabelwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 119;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcolorpicker)(this);
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcolorpicker  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 65;BA.debugLine="Sub SetMap(m As Map) As WixColorPicker";
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
 //BA.debugLineNum = 68;BA.debugLine="ColorPicker.SetAttr(strKey,	strVal)";
_colorpicker._setattr /*b4j.example.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 70;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcolorpicker)(this);
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcolorpicker  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub SetMinHeight(h As Int) As WixColorPicker";
 //BA.debugLineNum = 54;BA.debugLine="ColorPicker.SetMinHeight(h)";
_colorpicker._setminheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcolorpicker)(this);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcolorpicker  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub SetMinWidth(w As Int) As WixColorPicker";
 //BA.debugLineNum = 48;BA.debugLine="ColorPicker.SetMinWidth(w)";
_colorpicker._setminwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcolorpicker)(this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcolorpicker  _setname(String _n) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub SetName(n As String) As WixColorPicker";
 //BA.debugLineNum = 35;BA.debugLine="ColorPicker.SetName(n)";
_colorpicker._setname /*b4j.example.wixelement*/ (_n);
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcolorpicker)(this);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcolorpicker  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Sub SetResponsive(b As Object) As WixColorPicker";
 //BA.debugLineNum = 28;BA.debugLine="ColorPicker.SetResponsive(b)";
_colorpicker._setresponsive /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 29;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcolorpicker)(this);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcolorpicker  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixColorPick";
 //BA.debugLineNum = 41;BA.debugLine="ColorPicker.SetResponsiveCell(b)";
_colorpicker._setresponsivecell /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 42;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcolorpicker)(this);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcolorpicker  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 81;BA.debugLine="ColorPicker.SetStyle(prop,val)";
_colorpicker._setstyle /*b4j.example.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 82;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcolorpicker)(this);
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcolorpicker  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 20;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixColorPi";
 //BA.debugLineNum = 21;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 22;BA.debugLine="ColorPicker.SetTemplate(os)";
_colorpicker._settemplate /*b4j.example.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcolorpicker)(this);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcolorpicker  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Sub SetTooltip(tt As String) As WixColorPicker";
 //BA.debugLineNum = 60;BA.debugLine="ColorPicker.SetTooltip(tt)";
_colorpicker._settooltip /*b4j.example.wixelement*/ (_tt);
 //BA.debugLineNum = 61;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcolorpicker)(this);
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcolorpicker  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Sub SetValue(v As String) As WixColorPicker";
 //BA.debugLineNum = 88;BA.debugLine="ColorPicker.SetValue(v)";
_colorpicker._setvalue /*b4j.example.wixelement*/ (_v);
 //BA.debugLineNum = 89;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcolorpicker)(this);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcolorpicker  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Sub SetWidth(w As Object) As WixColorPicker";
 //BA.debugLineNum = 100;BA.debugLine="ColorPicker.SetWidth(w)";
_colorpicker._setwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 101;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcolorpicker)(this);
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
