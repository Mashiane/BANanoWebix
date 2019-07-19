package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixforminput extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixforminput", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixforminput.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _forminput = null;
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
 //BA.debugLineNum = 152;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 153;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 157;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 158;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 147;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 148;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 149;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public FormInput As WixElement";
_forminput = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixforminput  _initialize(anywheresoftware.b4a.BA _ba,String _iid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize(iID As String) As WixFormInp";
 //BA.debugLineNum = 9;BA.debugLine="ID = iID.tolowercase";
_id = _iid.toLowerCase();
 //BA.debugLineNum = 10;BA.debugLine="FormInput.Initialize(iID).SetView(\"forminput\")";
_forminput._initialize /*b4j.example.wixelement*/ (ba,_iid)._setview /*b4j.example.wixelement*/ ("forminput");
 //BA.debugLineNum = 11;BA.debugLine="Return Me";
if (true) return (b4j.example.wixforminput)(this);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 88;BA.debugLine="Return FormInput.item";
if (true) return _forminput._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixforminput  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 134;BA.debugLine="Sub SetAlignCenter(r As String) As WixFormInput 'i";
 //BA.debugLineNum = 135;BA.debugLine="FormInput.setAligncenter(\"\")";
_forminput._setaligncenter /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 136;BA.debugLine="Return Me";
if (true) return (b4j.example.wixforminput)(this);
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixforminput  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 140;BA.debugLine="Sub SetAlignLeft(r As String) As WixFormInput 'ign";
 //BA.debugLineNum = 141;BA.debugLine="FormInput.SetAlignleft(\"\")";
_forminput._setalignleft /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 142;BA.debugLine="Return Me";
if (true) return (b4j.example.wixforminput)(this);
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixforminput  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Sub SetAlignRight(r As String) As WixFormInput 'ig";
 //BA.debugLineNum = 129;BA.debugLine="FormInput.setAlignright(\"\")";
_forminput._setalignright /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 130;BA.debugLine="Return Me";
if (true) return (b4j.example.wixforminput)(this);
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixforminput  _setbody(Object _b) throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Sub SetBody(b As Object) As WixFormInput";
 //BA.debugLineNum = 69;BA.debugLine="FormInput.SetBody(b)";
_forminput._setbody /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 70;BA.debugLine="Return Me";
if (true) return (b4j.example.wixforminput)(this);
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixforminput  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Sub SetLabel(l As String) As WixFormInput";
 //BA.debugLineNum = 99;BA.debugLine="FormInput.SetLabel(l)";
_forminput._setlabel /*b4j.example.wixelement*/ (_l);
 //BA.debugLineNum = 100;BA.debugLine="Return Me";
if (true) return (b4j.example.wixforminput)(this);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixforminput  _setlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Sub SetLabelAlign(a As String) As WixFormInput";
 //BA.debugLineNum = 111;BA.debugLine="FormInput.SetLabelAlign(a)";
_forminput._setlabelalign /*b4j.example.wixelement*/ (_a);
 //BA.debugLineNum = 112;BA.debugLine="Return Me";
if (true) return (b4j.example.wixforminput)(this);
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixforminput  _setlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 116;BA.debugLine="Sub SetLabelPosition(p As String) As WixFormInput";
 //BA.debugLineNum = 117;BA.debugLine="FormInput.SetLabelPosition(p)";
_forminput._setlabelposition /*b4j.example.wixelement*/ (_p);
 //BA.debugLineNum = 118;BA.debugLine="Return Me";
if (true) return (b4j.example.wixforminput)(this);
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixforminput  _setlabelwidth(int _w) throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Sub SetLabelWidth(w As Int) As WixFormInput";
 //BA.debugLineNum = 123;BA.debugLine="FormInput.SetLabelWidth(w)";
_forminput._setlabelwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 124;BA.debugLine="Return Me";
if (true) return (b4j.example.wixforminput)(this);
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixforminput  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 27;BA.debugLine="Sub SetMap(m As Map) As WixFormInput";
 //BA.debugLineNum = 28;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 29;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 30;BA.debugLine="FormInput.SetAttr(strKey,	strVal)";
_forminput._setattr /*b4j.example.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 32;BA.debugLine="Return Me";
if (true) return (b4j.example.wixforminput)(this);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixforminput  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Sub SetMinHeight(h As Int) As WixFormInput";
 //BA.debugLineNum = 63;BA.debugLine="FormInput.SetMinHeight(h)";
_forminput._setminheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 64;BA.debugLine="Return Me";
if (true) return (b4j.example.wixforminput)(this);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixforminput  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Sub SetMinWidth(w As Int) As WixFormInput";
 //BA.debugLineNum = 57;BA.debugLine="FormInput.SetMinWidth(w)";
_forminput._setminwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 58;BA.debugLine="Return Me";
if (true) return (b4j.example.wixforminput)(this);
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixforminput  _setname(String _n) throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Sub SetName(n As String) As WixFormInput";
 //BA.debugLineNum = 38;BA.debugLine="FormInput.SetName(n)";
_forminput._setname /*b4j.example.wixelement*/ (_n);
 //BA.debugLineNum = 39;BA.debugLine="Return Me";
if (true) return (b4j.example.wixforminput)(this);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixforminput  _setrequired(boolean _b) throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Sub SetRequired(b As Boolean) As WixFormInput";
 //BA.debugLineNum = 105;BA.debugLine="FormInput.SetRequired(b)";
_forminput._setrequired /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 106;BA.debugLine="Return Me";
if (true) return (b4j.example.wixforminput)(this);
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixforminput  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Sub SetResponsive(b As Object) As WixFormInput";
 //BA.debugLineNum = 44;BA.debugLine="FormInput.SetResponsive(b)";
_forminput._setresponsive /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 45;BA.debugLine="Return Me";
if (true) return (b4j.example.wixforminput)(this);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixforminput  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixFormInput";
 //BA.debugLineNum = 50;BA.debugLine="FormInput.SetResponsiveCell(b)";
_forminput._setresponsivecell /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 51;BA.debugLine="Return Me";
if (true) return (b4j.example.wixforminput)(this);
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixforminput  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 81;BA.debugLine="FormInput.SetStyle(prop,val)";
_forminput._setstyle /*b4j.example.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 82;BA.debugLine="Return Me";
if (true) return (b4j.example.wixforminput)(this);
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixforminput  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 20;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixFormInp";
 //BA.debugLineNum = 21;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 22;BA.debugLine="FormInput.SetTemplate(os)";
_forminput._settemplate /*b4j.example.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return (b4j.example.wixforminput)(this);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixforminput  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Sub SetTooltip(tt As String) As WixFormInput";
 //BA.debugLineNum = 75;BA.debugLine="FormInput.SetTooltip(tt)";
_forminput._settooltip /*b4j.example.wixelement*/ (_tt);
 //BA.debugLineNum = 76;BA.debugLine="Return Me";
if (true) return (b4j.example.wixforminput)(this);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixforminput  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Sub SetValue(v As String) As WixFormInput";
 //BA.debugLineNum = 93;BA.debugLine="FormInput.SetValue(v)";
_forminput._setvalue /*b4j.example.wixelement*/ (_v);
 //BA.debugLineNum = 94;BA.debugLine="Return Me";
if (true) return (b4j.example.wixforminput)(this);
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
