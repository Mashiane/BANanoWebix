package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixcarousel extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixcarousel", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixcarousel.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _carousel = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _nav = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public String  _addslide(b4j.Mashy.BANanoWebixDemo.wixelement _sld) throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Sub AddSlide(sld As WixElement)";
 //BA.debugLineNum = 129;BA.debugLine="Carousel.AddColumns(sld.Item)";
_carousel._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_sld._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return "";
}
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 164;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 165;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 166;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 169;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 170;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 171;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 159;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 160;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Carousel As WixElement";
_carousel = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private nav As WixElement";
_nav = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 6;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixcarousel  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(sid As String) As WixCarouse";
 //BA.debugLineNum = 12;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 13;BA.debugLine="Carousel.Initialize(ID)";
_carousel._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_id);
 //BA.debugLineNum = 14;BA.debugLine="Carousel.SetView(\"carousel\")";
_carousel._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("carousel");
 //BA.debugLineNum = 15;BA.debugLine="nav.Initialize(ID & \"nav\")";
_nav._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_id+"nav");
 //BA.debugLineNum = 16;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 17;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcarousel)(this);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 123;BA.debugLine="Carousel.SetAttr(\"navigation\", nav.Item)";
_carousel._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("navigation",(Object)(_nav._item /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 124;BA.debugLine="Return Carousel.item";
if (true) return _carousel._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 64;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixcarousel  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 32;BA.debugLine="Sub SetAttributes(m As Map) As WixCarousel";
 //BA.debugLineNum = 33;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 34;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 35;BA.debugLine="Carousel.SetAttr(k,v)";
_carousel._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 37;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcarousel)(this);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcarousel  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 112;BA.debugLine="Sub SetMap(m As Map) As WixCarousel";
 //BA.debugLineNum = 113;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 114;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 115;BA.debugLine="Carousel.SetAttr(strKey,	strVal)";
_carousel._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 117;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcarousel)(this);
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcarousel  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Sub SetMargin(margin As Object) As WixCarousel";
 //BA.debugLineNum = 28;BA.debugLine="Carousel.SetMargin(margin)";
_carousel._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 29;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcarousel)(this);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcarousel  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Sub SetMinHeight(h As Int) As WixCarousel";
 //BA.debugLineNum = 101;BA.debugLine="Carousel.SetMinHeight(h)";
_carousel._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 102;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcarousel)(this);
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcarousel  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Sub SetMinWidth(w As Int) As WixCarousel";
 //BA.debugLineNum = 95;BA.debugLine="Carousel.SetMinWidth(w)";
_carousel._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 96;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcarousel)(this);
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcarousel  _setname(String _n) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Sub SetName(n As String) As WixCarousel";
 //BA.debugLineNum = 76;BA.debugLine="Carousel.SetName(n)";
_carousel._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 77;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcarousel)(this);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcarousel  _setnavigationbuttons(boolean _r) throws Exception{
 //BA.debugLineNum = 145;BA.debugLine="Sub SetNavigationButtons(r As Boolean) As WixCarou";
 //BA.debugLineNum = 146;BA.debugLine="nav.SetAttr(\"buttons\", r)";
_nav._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("buttons",(Object)(_r));
 //BA.debugLineNum = 147;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcarousel)(this);
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcarousel  _setnavigationitems(boolean _r) throws Exception{
 //BA.debugLineNum = 139;BA.debugLine="Sub SetNavigationItems(r As Boolean) As WixCarouse";
 //BA.debugLineNum = 140;BA.debugLine="nav.SetAttr(\"items\", r)";
_nav._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("items",(Object)(_r));
 //BA.debugLineNum = 141;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcarousel)(this);
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcarousel  _setnavigationtypecorner(String _r) throws Exception{
 //BA.debugLineNum = 152;BA.debugLine="Sub SetNavigationTypeCorner(r As String) As WixCar";
 //BA.debugLineNum = 153;BA.debugLine="nav.SetAttr(\"type\", \"corner\")";
_nav._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("type",(Object)("corner"));
 //BA.debugLineNum = 154;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcarousel)(this);
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcarousel  _setnavigationtypeside(String _r) throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Sub SetNavigationTypeSide(r As String) As WixCarou";
 //BA.debugLineNum = 134;BA.debugLine="nav.SetAttr(\"type\", \"side\")";
_nav._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("type",(Object)("side"));
 //BA.debugLineNum = 135;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcarousel)(this);
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcarousel  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub SetPadding(padding As Object) As WixCarousel";
 //BA.debugLineNum = 22;BA.debugLine="Carousel.SetPadding(padding)";
_carousel._setpadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcarousel)(this);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcarousel  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Sub SetParent(p As WixElement) As WixCarousel";
 //BA.debugLineNum = 57;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 58;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcarousel)(this);
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcarousel  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Sub SetResponsive(b As Object) As WixCarousel";
 //BA.debugLineNum = 82;BA.debugLine="Carousel.SetResponsive(b)";
_carousel._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 83;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcarousel)(this);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcarousel  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixCarousel";
 //BA.debugLineNum = 88;BA.debugLine="Carousel.SetResponsiveCell(b)";
_carousel._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 89;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcarousel)(this);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcarousel  _setscrollspeed(int _s) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Sub SetScrollSpeed(s As Int) As WixCarousel";
 //BA.debugLineNum = 107;BA.debugLine="Carousel.SetAttr(\"scrollSpeed\", s)";
_carousel._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("scrollSpeed",(Object)(_s));
 //BA.debugLineNum = 108;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcarousel)(this);
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcarousel  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 50;BA.debugLine="Carousel.SetStyle(prop,sval)";
_carousel._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 51;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcarousel)(this);
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcarousel  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 40;BA.debugLine="Sub SetStyles(m As Map) As WixCarousel";
 //BA.debugLineNum = 41;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 42;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 43;BA.debugLine="Carousel.SetStyle(k,v)";
_carousel._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 45;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcarousel)(this);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcarousel  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 67;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixCarouse";
 //BA.debugLineNum = 68;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 69;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 70;BA.debugLine="Carousel.SetTemplate(os)";
_carousel._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 71;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcarousel)(this);
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
