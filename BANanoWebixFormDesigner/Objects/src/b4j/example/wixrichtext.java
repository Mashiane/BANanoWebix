package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixrichtext extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixrichtext", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixrichtext.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _richtext = null;
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
 //BA.debugLineNum = 150;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 151;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 155;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 156;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 145;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 146;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public RichText As WixElement";
_richtext = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixrichtext  _initialize(anywheresoftware.b4a.BA _ba,String _iid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize(iID As String) As WixRichTex";
 //BA.debugLineNum = 9;BA.debugLine="ID = iID.tolowercase";
_id = _iid.toLowerCase();
 //BA.debugLineNum = 10;BA.debugLine="RichText.Initialize(iID).SetView(\"richtext\")";
_richtext._initialize /*b4j.example.wixelement*/ (ba,_iid)._setview /*b4j.example.wixelement*/ ("richtext");
 //BA.debugLineNum = 11;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrichtext)(this);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 80;BA.debugLine="Return RichText.item";
if (true) return _richtext._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrichtext  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 132;BA.debugLine="Sub SetAlignCenter(r As String) As WixRichText 'ig";
 //BA.debugLineNum = 133;BA.debugLine="RichText.setAligncenter(\"\")";
_richtext._setaligncenter /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 134;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrichtext)(this);
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrichtext  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 138;BA.debugLine="Sub SetAlignLeft(r As String) As WixRichText 'igno";
 //BA.debugLineNum = 139;BA.debugLine="RichText.SetAlignleft(\"\")";
_richtext._setalignleft /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 140;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrichtext)(this);
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrichtext  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 126;BA.debugLine="Sub SetAlignRight(r As String) As WixRichText 'ign";
 //BA.debugLineNum = 127;BA.debugLine="RichText.setAlignright(\"\")";
_richtext._setalignright /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 128;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrichtext)(this);
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrichtext  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub SetHeight(h As Object) As WixRichText";
 //BA.debugLineNum = 85;BA.debugLine="RichText.SetHeight(h)";
_richtext._setheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 86;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrichtext)(this);
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrichtext  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Sub SetLabel(l As String) As WixRichText";
 //BA.debugLineNum = 97;BA.debugLine="RichText.SetLabel(l)";
_richtext._setlabel /*b4j.example.wixelement*/ (_l);
 //BA.debugLineNum = 98;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrichtext)(this);
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrichtext  _setlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Sub SetLabelAlign(a As String) As WixRichText";
 //BA.debugLineNum = 109;BA.debugLine="RichText.SetLabelAlign(a)";
_richtext._setlabelalign /*b4j.example.wixelement*/ (_a);
 //BA.debugLineNum = 110;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrichtext)(this);
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrichtext  _setlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Sub SetLabelPosition(p As String) As WixRichText";
 //BA.debugLineNum = 115;BA.debugLine="RichText.SetLabelPosition(p)";
_richtext._setlabelposition /*b4j.example.wixelement*/ (_p);
 //BA.debugLineNum = 116;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrichtext)(this);
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrichtext  _setlabelwidth(int _w) throws Exception{
 //BA.debugLineNum = 120;BA.debugLine="Sub SetLabelWidth(w As Int) As WixRichText";
 //BA.debugLineNum = 121;BA.debugLine="RichText.SetLabelWidth(w)";
_richtext._setlabelwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 122;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrichtext)(this);
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrichtext  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 20;BA.debugLine="Sub SetMap(m As Map) As WixRichText";
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
 //BA.debugLineNum = 23;BA.debugLine="RichText.SetAttr(strKey,	strVal)";
_richtext._setattr /*b4j.example.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 25;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrichtext)(this);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrichtext  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub SetMinHeight(h As Int) As WixRichText";
 //BA.debugLineNum = 62;BA.debugLine="RichText.SetMinHeight(h)";
_richtext._setminheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 63;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrichtext)(this);
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrichtext  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Sub SetMinWidth(w As Int) As WixRichText";
 //BA.debugLineNum = 56;BA.debugLine="RichText.SetMinWidth(w)";
_richtext._setminwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 57;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrichtext)(this);
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrichtext  _setname(String _n) throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Sub SetName(n As String) As WixRichText";
 //BA.debugLineNum = 37;BA.debugLine="RichText.SetName(n)";
_richtext._setname /*b4j.example.wixelement*/ (_n);
 //BA.debugLineNum = 38;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrichtext)(this);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrichtext  _setrequired(boolean _b) throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Sub SetRequired(b As Boolean) As WixRichText";
 //BA.debugLineNum = 103;BA.debugLine="RichText.SetRequired(b)";
_richtext._setrequired /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 104;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrichtext)(this);
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrichtext  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Sub SetResponsive(b As Object) As WixRichText";
 //BA.debugLineNum = 43;BA.debugLine="RichText.SetResponsive(b)";
_richtext._setresponsive /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 44;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrichtext)(this);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrichtext  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixRichText";
 //BA.debugLineNum = 49;BA.debugLine="RichText.SetResponsiveCell(b)";
_richtext._setresponsivecell /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 50;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrichtext)(this);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrichtext  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 74;BA.debugLine="RichText.SetStyle(prop,val)";
_richtext._setstyle /*b4j.example.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 75;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrichtext)(this);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrichtext  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 29;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixRichTex";
 //BA.debugLineNum = 30;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 31;BA.debugLine="RichText.SetTemplate(os)";
_richtext._settemplate /*b4j.example.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 32;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrichtext)(this);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrichtext  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Sub SetTooltip(tt As String) As WixRichText";
 //BA.debugLineNum = 68;BA.debugLine="RichText.SetTooltip(tt)";
_richtext._settooltip /*b4j.example.wixelement*/ (_tt);
 //BA.debugLineNum = 69;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrichtext)(this);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrichtext  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Sub SetValue(v As String) As WixRichText";
 //BA.debugLineNum = 91;BA.debugLine="RichText.SetValue(v)";
_richtext._setvalue /*b4j.example.wixelement*/ (_v);
 //BA.debugLineNum = 92;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrichtext)(this);
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
