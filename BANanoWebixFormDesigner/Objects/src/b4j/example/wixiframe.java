package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixiframe extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixiframe", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixiframe.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _iframe = null;
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
 //BA.debugLineNum = 104;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 105;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 110;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 100;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public IFrame As WixElement";
_iframe = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixiframe  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize(sid As String) As WixIFrame";
 //BA.debugLineNum = 9;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 10;BA.debugLine="IFrame.Initialize(ID).SetView(\"iframe\")";
_iframe._initialize /*b4j.example.wixelement*/ (ba,_id)._setview /*b4j.example.wixelement*/ ("iframe");
 //BA.debugLineNum = 11;BA.debugLine="Return Me";
if (true) return (b4j.example.wixiframe)(this);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 21;BA.debugLine="Return IFrame.item";
if (true) return _iframe._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixiframe  _setcontainer(String _c) throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Sub SetContainer(c As String) As WixIFrame";
 //BA.debugLineNum = 15;BA.debugLine="IFrame.SetContainer(c)";
_iframe._setcontainer /*b4j.example.wixelement*/ (_c);
 //BA.debugLineNum = 16;BA.debugLine="Return Me";
if (true) return (b4j.example.wixiframe)(this);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixiframe  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Sub SetHeight(h As Object) As WixIFrame";
 //BA.debugLineNum = 86;BA.debugLine="IFrame.SetAttr(\"height\", h)";
_iframe._setattr /*b4j.example.wixelement*/ ("height",_h);
 //BA.debugLineNum = 87;BA.debugLine="Return Me";
if (true) return (b4j.example.wixiframe)(this);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixiframe  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 38;BA.debugLine="Sub SetMap(m As Map) As WixIFrame";
 //BA.debugLineNum = 39;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 40;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 41;BA.debugLine="IFrame.SetAttr(strKey,	strVal)";
_iframe._setattr /*b4j.example.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 43;BA.debugLine="Return Me";
if (true) return (b4j.example.wixiframe)(this);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixiframe  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Sub SetMinHeight(h As Int) As WixIFrame";
 //BA.debugLineNum = 68;BA.debugLine="IFrame.SetMinHeight(h)";
_iframe._setminheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 69;BA.debugLine="Return Me";
if (true) return (b4j.example.wixiframe)(this);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixiframe  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub SetMinWidth(w As Int) As WixIFrame";
 //BA.debugLineNum = 62;BA.debugLine="IFrame.SetMinWidth(w)";
_iframe._setminwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 63;BA.debugLine="Return Me";
if (true) return (b4j.example.wixiframe)(this);
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixiframe  _setname(String _n) throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Sub SetName(n As String) As WixIFrame";
 //BA.debugLineNum = 33;BA.debugLine="IFrame.SetName(n)";
_iframe._setname /*b4j.example.wixelement*/ (_n);
 //BA.debugLineNum = 34;BA.debugLine="Return Me";
if (true) return (b4j.example.wixiframe)(this);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixiframe  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Sub SetResponsive(b As Object) As WixIFrame";
 //BA.debugLineNum = 49;BA.debugLine="IFrame.SetResponsive(b)";
_iframe._setresponsive /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 50;BA.debugLine="Return Me";
if (true) return (b4j.example.wixiframe)(this);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixiframe  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixIFrame";
 //BA.debugLineNum = 55;BA.debugLine="IFrame.SetResponsiveCell(b)";
_iframe._setresponsivecell /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 56;BA.debugLine="Return Me";
if (true) return (b4j.example.wixiframe)(this);
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixiframe  _setscroll(Object _b) throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Sub SetScroll(b As Object) As WixIFrame";
 //BA.debugLineNum = 74;BA.debugLine="IFrame.SetProperty(\"scroll\", b)";
_iframe._setproperty /*b4j.example.wixelement*/ ("scroll",_b);
 //BA.debugLineNum = 75;BA.debugLine="Return Me";
if (true) return (b4j.example.wixiframe)(this);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixiframe  _setsrc(String _t) throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Sub SetSRC(t As String) As WixIFrame";
 //BA.debugLineNum = 80;BA.debugLine="IFrame.SetAttr(\"src\", t)";
_iframe._setattr /*b4j.example.wixelement*/ ("src",(Object)(_t));
 //BA.debugLineNum = 81;BA.debugLine="Return Me";
if (true) return (b4j.example.wixiframe)(this);
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixiframe  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 25;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixIFrame";
 //BA.debugLineNum = 26;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 27;BA.debugLine="IFrame.SetTemplate(os)";
_iframe._settemplate /*b4j.example.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 28;BA.debugLine="Return Me";
if (true) return (b4j.example.wixiframe)(this);
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixiframe  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Sub SetWidth(w As Object) As WixIFrame";
 //BA.debugLineNum = 93;BA.debugLine="IFrame.SetAttr(\"width\", w)";
_iframe._setattr /*b4j.example.wixelement*/ ("width",_w);
 //BA.debugLineNum = 94;BA.debugLine="Return Me";
if (true) return (b4j.example.wixiframe)(this);
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
