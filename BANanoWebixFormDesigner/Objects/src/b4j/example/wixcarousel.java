package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixcarousel extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixcarousel", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixcarousel.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _carousel = null;
public b4j.example.wixelement _nav = null;
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
public String  _addslide(b4j.example.wixelement _sld) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub AddSlide(sld As WixElement)";
 //BA.debugLineNum = 79;BA.debugLine="Carousel.AddColumns(sld.Item)";
_carousel._addcolumns /*b4j.example.wixelement*/ (_sld._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return "";
}
public String  _addtocolumns(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 115;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 120;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 110;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Carousel As WixElement";
_carousel = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private nav As WixElement";
_nav = new b4j.example.wixelement();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixcarousel  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(sid As String) As WixCarouse";
 //BA.debugLineNum = 10;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 11;BA.debugLine="Carousel.Initialize(ID)";
_carousel._initialize /*b4j.example.wixelement*/ (ba,_id);
 //BA.debugLineNum = 12;BA.debugLine="Carousel.SetView(\"carousel\")";
_carousel._setview /*b4j.example.wixelement*/ ("carousel");
 //BA.debugLineNum = 13;BA.debugLine="nav.Initialize(ID & \"nav\")";
_nav._initialize /*b4j.example.wixelement*/ (ba,_id+"nav");
 //BA.debugLineNum = 14;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcarousel)(this);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 73;BA.debugLine="Carousel.SetAttr(\"navigation\", nav.Item)";
_carousel._setattr /*b4j.example.wixelement*/ ("navigation",(Object)(_nav._item /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 74;BA.debugLine="Return Carousel.item";
if (true) return _carousel._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcarousel  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 62;BA.debugLine="Sub SetMap(m As Map) As WixCarousel";
 //BA.debugLineNum = 63;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 64;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 65;BA.debugLine="Carousel.SetAttr(strKey,	strVal)";
_carousel._setattr /*b4j.example.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 67;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcarousel)(this);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcarousel  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Sub SetMinHeight(h As Int) As WixCarousel";
 //BA.debugLineNum = 51;BA.debugLine="Carousel.SetMinHeight(h)";
_carousel._setminheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 52;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcarousel)(this);
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcarousel  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub SetMinWidth(w As Int) As WixCarousel";
 //BA.debugLineNum = 45;BA.debugLine="Carousel.SetMinWidth(w)";
_carousel._setminwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 46;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcarousel)(this);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcarousel  _setname(String _n) throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Sub SetName(n As String) As WixCarousel";
 //BA.debugLineNum = 26;BA.debugLine="Carousel.SetName(n)";
_carousel._setname /*b4j.example.wixelement*/ (_n);
 //BA.debugLineNum = 27;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcarousel)(this);
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcarousel  _setnavigationbuttons(boolean _r) throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Sub SetNavigationButtons(r As Boolean) As WixCarou";
 //BA.debugLineNum = 96;BA.debugLine="nav.SetAttr(\"buttons\", r)";
_nav._setattr /*b4j.example.wixelement*/ ("buttons",(Object)(_r));
 //BA.debugLineNum = 97;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcarousel)(this);
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcarousel  _setnavigationitems(boolean _r) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub SetNavigationItems(r As Boolean) As WixCarouse";
 //BA.debugLineNum = 90;BA.debugLine="nav.SetAttr(\"items\", r)";
_nav._setattr /*b4j.example.wixelement*/ ("items",(Object)(_r));
 //BA.debugLineNum = 91;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcarousel)(this);
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcarousel  _setnavigationtypecorner(String _r) throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Sub SetNavigationTypeCorner(r As String) As WixCar";
 //BA.debugLineNum = 103;BA.debugLine="nav.SetAttr(\"type\", \"corner\")";
_nav._setattr /*b4j.example.wixelement*/ ("type",(Object)("corner"));
 //BA.debugLineNum = 104;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcarousel)(this);
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcarousel  _setnavigationtypeside(String _r) throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Sub SetNavigationTypeSide(r As String) As WixCarou";
 //BA.debugLineNum = 84;BA.debugLine="nav.SetAttr(\"type\", \"side\")";
_nav._setattr /*b4j.example.wixelement*/ ("type",(Object)("side"));
 //BA.debugLineNum = 85;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcarousel)(this);
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcarousel  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Sub SetResponsive(b As Object) As WixCarousel";
 //BA.debugLineNum = 32;BA.debugLine="Carousel.SetResponsive(b)";
_carousel._setresponsive /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 33;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcarousel)(this);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcarousel  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixCarousel";
 //BA.debugLineNum = 38;BA.debugLine="Carousel.SetResponsiveCell(b)";
_carousel._setresponsivecell /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 39;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcarousel)(this);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcarousel  _setscrollspeed(int _s) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Sub SetScrollSpeed(s As Int) As WixCarousel";
 //BA.debugLineNum = 57;BA.debugLine="Carousel.SetProperty(\"scrollSpeed\", s)";
_carousel._setproperty /*b4j.example.wixelement*/ ("scrollSpeed",(Object)(_s));
 //BA.debugLineNum = 58;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcarousel)(this);
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcarousel  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 18;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixCarouse";
 //BA.debugLineNum = 19;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 20;BA.debugLine="Carousel.SetTemplate(os)";
_carousel._settemplate /*b4j.example.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 21;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcarousel)(this);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
