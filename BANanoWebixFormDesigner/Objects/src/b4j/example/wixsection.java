package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixsection extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixsection", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixsection.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _section = null;
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
 //BA.debugLineNum = 89;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 90;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 95;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.example.wixform _frm) throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 74;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 85;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return "";
}
public String  _addtotoolbar(b4j.example.wixtoolbar _tblb) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub AddToToolbar(tblB As WixToolBar)";
 //BA.debugLineNum = 79;BA.debugLine="tblB.Toolbar.AddItem(Item)";
_tblb._toolbar /*b4j.example.wixelement*/ ._additem /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Section As WixElement";
_section = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixsection  _initialize(anywheresoftware.b4a.BA _ba,String _iid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize(iID As String) As WixSection";
 //BA.debugLineNum = 9;BA.debugLine="ID = iID.tolowercase";
_id = _iid.toLowerCase();
 //BA.debugLineNum = 10;BA.debugLine="Section.Initialize(iID).SetType(\"section\")";
_section._initialize /*b4j.example.wixelement*/ (ba,_iid)._settype /*b4j.example.wixelement*/ ("section");
 //BA.debugLineNum = 11;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsection)(this);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 69;BA.debugLine="Return Section.item";
if (true) return _section._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsection  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 15;BA.debugLine="Sub SetMap(m As Map) As WixSection";
 //BA.debugLineNum = 16;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 17;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 18;BA.debugLine="Section.SetAttr(strKey,	strVal)";
_section._setattr /*b4j.example.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 20;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsection)(this);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsection  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Sub SetMinHeight(h As Int) As WixSection";
 //BA.debugLineNum = 57;BA.debugLine="Section.SetMinHeight(h)";
_section._setminheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 58;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsection)(this);
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsection  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Sub SetMinWidth(w As Int) As WixSection";
 //BA.debugLineNum = 51;BA.debugLine="Section.SetMinWidth(w)";
_section._setminwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 52;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsection)(this);
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsection  _setname(String _n) throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Sub SetName(n As String) As WixSection";
 //BA.debugLineNum = 32;BA.debugLine="Section.SetName(n)";
_section._setname /*b4j.example.wixelement*/ (_n);
 //BA.debugLineNum = 33;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsection)(this);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsection  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Sub SetResponsive(b As Object) As WixSection";
 //BA.debugLineNum = 38;BA.debugLine="Section.SetResponsive(b)";
_section._setresponsive /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 39;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsection)(this);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsection  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixSection";
 //BA.debugLineNum = 44;BA.debugLine="Section.SetResponsiveCell(b)";
_section._setresponsivecell /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 45;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsection)(this);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsection  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 24;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixSection";
 //BA.debugLineNum = 25;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 26;BA.debugLine="Section.SetTemplate(os)";
_section._settemplate /*b4j.example.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 27;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsection)(this);
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsection  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Sub SetTooltip(tt As String) As WixSection";
 //BA.debugLineNum = 63;BA.debugLine="Section.SetTooltip(tt)";
_section._settooltip /*b4j.example.wixelement*/ (_tt);
 //BA.debugLineNum = 64;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsection)(this);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
