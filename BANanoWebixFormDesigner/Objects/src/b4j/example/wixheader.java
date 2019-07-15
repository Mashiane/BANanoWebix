package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixheader extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixheader", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixheader.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _header = null;
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
 //BA.debugLineNum = 81;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 82;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 87;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 77;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Header As WixElement";
_header = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixheader  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize(sID As String) As WixHeader";
 //BA.debugLineNum = 16;BA.debugLine="ID = sID.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 17;BA.debugLine="Header.Initialize(ID).SetView(\"template\").SetType";
_header._initialize /*b4j.example.wixelement*/ (ba,_id)._setview /*b4j.example.wixelement*/ ("template")._settype /*b4j.example.wixelement*/ ("header");
 //BA.debugLineNum = 18;BA.debugLine="Return Me";
if (true) return (b4j.example.wixheader)(this);
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 36;BA.debugLine="Return Header.item";
if (true) return _header._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixheader  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 40;BA.debugLine="Sub SetMap(m As Map) As WixHeader";
 //BA.debugLineNum = 41;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 42;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 43;BA.debugLine="Header.SetAttr(strKey,	strVal)";
_header._setattr /*b4j.example.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 45;BA.debugLine="Return Me";
if (true) return (b4j.example.wixheader)(this);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixheader  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Sub SetMinHeight(h As Int) As WixHeader";
 //BA.debugLineNum = 70;BA.debugLine="Header.SetMinHeight(h)";
_header._setminheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 71;BA.debugLine="Return Me";
if (true) return (b4j.example.wixheader)(this);
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixheader  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Sub SetMinWidth(w As Int) As WixHeader";
 //BA.debugLineNum = 64;BA.debugLine="Header.SetMinWidth(w)";
_header._setminwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 65;BA.debugLine="Return Me";
if (true) return (b4j.example.wixheader)(this);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixheader  _setname(String _n) throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Sub SetName(n As String) As WixHeader";
 //BA.debugLineNum = 30;BA.debugLine="Header.SetName(n)";
_header._setname /*b4j.example.wixelement*/ (_n);
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.example.wixheader)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixheader  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Sub SetResponsive(b As Object) As WixHeader";
 //BA.debugLineNum = 51;BA.debugLine="Header.SetResponsive(b)";
_header._setresponsive /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 52;BA.debugLine="Return Me";
if (true) return (b4j.example.wixheader)(this);
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixheader  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixHeader";
 //BA.debugLineNum = 57;BA.debugLine="Header.SetResponsiveCell(b)";
_header._setresponsivecell /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 58;BA.debugLine="Return Me";
if (true) return (b4j.example.wixheader)(this);
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixheader  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 22;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixHeader";
 //BA.debugLineNum = 23;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 24;BA.debugLine="Header.SetTemplate(os)";
_header._settemplate /*b4j.example.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 25;BA.debugLine="Return Me";
if (true) return (b4j.example.wixheader)(this);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixheader  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 9;BA.debugLine="Sub SetTooltip(tt As String) As WixHeader";
 //BA.debugLineNum = 10;BA.debugLine="Header.SetTooltip(tt)";
_header._settooltip /*b4j.example.wixelement*/ (_tt);
 //BA.debugLineNum = 11;BA.debugLine="Return Me";
if (true) return (b4j.example.wixheader)(this);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
