package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixcheckbox extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixcheckbox", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixcheckbox.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _checkbox = null;
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
 //BA.debugLineNum = 160;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 161;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 162;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 165;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 166;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 167;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.example.wixform _frm) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 60;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 155;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 156;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public CheckBox As WixElement";
_checkbox = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixcheckbox  _initialize(anywheresoftware.b4a.BA _ba,String _iid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize(iID As String) As WixCheckBo";
 //BA.debugLineNum = 9;BA.debugLine="ID = iID.tolowercase";
_id = _iid.toLowerCase();
 //BA.debugLineNum = 10;BA.debugLine="CheckBox.Initialize(iID).SetView(\"checkbox\")";
_checkbox._initialize /*b4j.example.wixelement*/ (ba,_iid)._setview /*b4j.example.wixelement*/ ("checkbox");
 //BA.debugLineNum = 11;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcheckbox)(this);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 94;BA.debugLine="Return CheckBox.item";
if (true) return _checkbox._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcheckbox  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 142;BA.debugLine="Sub SetAlignCenter(r As String) As WixCheckBox 'ig";
 //BA.debugLineNum = 143;BA.debugLine="CheckBox.setAligncenter(\"\")";
_checkbox._setaligncenter /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 144;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcheckbox)(this);
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcheckbox  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 148;BA.debugLine="Sub SetAlignLeft(r As String) As WixCheckBox 'igno";
 //BA.debugLineNum = 149;BA.debugLine="CheckBox.SetAlignleft(\"\")";
_checkbox._setalignleft /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 150;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcheckbox)(this);
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcheckbox  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 136;BA.debugLine="Sub SetAlignRight(r As String) As WixCheckBox 'ign";
 //BA.debugLineNum = 137;BA.debugLine="CheckBox.setAlignright(\"\")";
_checkbox._setalignright /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 138;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcheckbox)(this);
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcheckbox  _setinvalidmessage(String _msg) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub SetInvalidMessage(msg As String) As WixCheckBo";
 //BA.debugLineNum = 81;BA.debugLine="CheckBox.SetAttr(\"invalidMessage\", msg)";
_checkbox._setattr /*b4j.example.wixelement*/ ("invalidMessage",(Object)(_msg));
 //BA.debugLineNum = 82;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcheckbox)(this);
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcheckbox  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Sub SetLabel(l As String) As WixCheckBox";
 //BA.debugLineNum = 111;BA.debugLine="CheckBox.SetLabel(l)";
_checkbox._setlabel /*b4j.example.wixelement*/ (_l);
 //BA.debugLineNum = 112;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcheckbox)(this);
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcheckbox  _setlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Sub SetLabelAlign(a As String) As WixCheckBox";
 //BA.debugLineNum = 118;BA.debugLine="CheckBox.SetLabelAlign(a)";
_checkbox._setlabelalign /*b4j.example.wixelement*/ (_a);
 //BA.debugLineNum = 119;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcheckbox)(this);
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcheckbox  _setlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Sub SetLabelPosition(p As String) As WixCheckBox";
 //BA.debugLineNum = 124;BA.debugLine="CheckBox.SetLabelPosition(p)";
_checkbox._setlabelposition /*b4j.example.wixelement*/ (_p);
 //BA.debugLineNum = 125;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcheckbox)(this);
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcheckbox  _setlabelright(String _l) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Sub SetLabelRight(l As String) As WixCheckBox";
 //BA.debugLineNum = 88;BA.debugLine="CheckBox.SetAttr(\"labelRight\", l)";
_checkbox._setattr /*b4j.example.wixelement*/ ("labelRight",(Object)(_l));
 //BA.debugLineNum = 89;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcheckbox)(this);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcheckbox  _setlabelwidth(int _w) throws Exception{
 //BA.debugLineNum = 129;BA.debugLine="Sub SetLabelWidth(w As Int) As WixCheckBox";
 //BA.debugLineNum = 130;BA.debugLine="CheckBox.SetLabelWidth(w)";
_checkbox._setlabelwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 131;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcheckbox)(this);
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcheckbox  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 64;BA.debugLine="Sub SetMap(m As Map) As WixCheckBox";
 //BA.debugLineNum = 65;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 66;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 67;BA.debugLine="CheckBox.SetAttr(strKey,	strVal)";
_checkbox._setattr /*b4j.example.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 69;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcheckbox)(this);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcheckbox  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub SetMinHeight(h As Int) As WixCheckBox";
 //BA.debugLineNum = 48;BA.debugLine="CheckBox.SetMinHeight(h)";
_checkbox._setminheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcheckbox)(this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcheckbox  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Sub SetMinWidth(w As Int) As WixCheckBox";
 //BA.debugLineNum = 42;BA.debugLine="CheckBox.SetMinWidth(w)";
_checkbox._setminwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 43;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcheckbox)(this);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcheckbox  _setname(String _n) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Sub SetName(n As String) As WixCheckBox";
 //BA.debugLineNum = 29;BA.debugLine="CheckBox.SetName(n)";
_checkbox._setname /*b4j.example.wixelement*/ (_n);
 //BA.debugLineNum = 30;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcheckbox)(this);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcheckbox  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub SetResponsive(b As Object) As WixCheckBox";
 //BA.debugLineNum = 22;BA.debugLine="CheckBox.SetResponsive(b)";
_checkbox._setresponsive /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcheckbox)(this);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcheckbox  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixCheckBox";
 //BA.debugLineNum = 35;BA.debugLine="CheckBox.SetResponsiveCell(b)";
_checkbox._setresponsivecell /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcheckbox)(this);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcheckbox  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 99;BA.debugLine="CheckBox.SetStyle(prop,val)";
_checkbox._setstyle /*b4j.example.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 100;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcheckbox)(this);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcheckbox  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 14;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixCheckBo";
 //BA.debugLineNum = 15;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 16;BA.debugLine="CheckBox.SetTemplate(os)";
_checkbox._settemplate /*b4j.example.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 17;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcheckbox)(this);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcheckbox  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub SetTooltip(tt As String) As WixCheckBox";
 //BA.debugLineNum = 54;BA.debugLine="CheckBox.SetAttr(\"tooltip\", tt)";
_checkbox._setattr /*b4j.example.wixelement*/ ("tooltip",(Object)(_tt));
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcheckbox)(this);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcheckbox  _setvalidateischecked(boolean _b) throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Sub SetValidateIsChecked(b As Boolean) As WixCheck";
 //BA.debugLineNum = 74;BA.debugLine="CheckBox.SetAttr(\"validate\",\"isChecked\")";
_checkbox._setattr /*b4j.example.wixelement*/ ("validate",(Object)("isChecked"));
 //BA.debugLineNum = 75;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcheckbox)(this);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcheckbox  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Sub SetValue(v As String) As WixCheckBox";
 //BA.debugLineNum = 105;BA.debugLine="CheckBox.SetValue(v)";
_checkbox._setvalue /*b4j.example.wixelement*/ (_v);
 //BA.debugLineNum = 106;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcheckbox)(this);
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
