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
public b4j.example.pgtabbar _pgtabbar = null;
public b4j.example.pgtree _pgtree = null;
public b4j.example.pgmenu _pgmenu = null;
public b4j.example.pglist _pglist = null;
public b4j.example.pgdataview _pgdataview = null;
public b4j.example.pgdatatable1 _pgdatatable1 = null;
public b4j.example.pgdatatable _pgdatatable = null;
public b4j.example.pgcharts _pgcharts = null;
public b4j.example.pgdataentry _pgdataentry = null;
public b4j.example.pgforms1 _pgforms1 = null;
public b4j.example.pgforms _pgforms = null;
public b4j.example.pgtoolbar _pgtoolbar = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.pgmultiview _pgmultiview = null;
public b4j.example.pglayouts1 _pglayouts1 = null;
public b4j.example.pglayouts2 _pglayouts2 = null;
public b4j.example.pglayouts _pglayouts = null;
public b4j.example.pglayout _pglayout = null;
public b4j.example.pgunitlist _pgunitlist = null;
public b4j.example.pgpropertysheet _pgpropertysheet = null;
public b4j.example.pgtreetable _pgtreetable = null;
public b4j.example.pgsidebar _pgsidebar = null;
public b4j.example.pgcomments _pgcomments = null;
public b4j.example.pggrouplist _pggrouplist = null;
public b4j.example.pgcontext _pgcontext = null;
public b4j.example.pggooglemap _pggooglemap = null;
public b4j.example.pguploader1 _pguploader1 = null;
public String  _addslide(b4j.example.wixelement _sld) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Sub AddSlide(sld As WixElement)";
 //BA.debugLineNum = 31;BA.debugLine="Carousel.AddColumns(sld.Item)";
_carousel._addcolumns /*b4j.example.wixelement*/ (_sld._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 24;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 25;BA.debugLine="Carousel.SetAttr(\"navigation\", nav.Item)";
_carousel._setattr /*b4j.example.wixelement*/ ("navigation",(Object)(_nav._item /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 26;BA.debugLine="Return Carousel.item";
if (true) return _carousel._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcarousel  _setnavigationbuttons(boolean _r) throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub SetNavigationButtons(r As Boolean) As WixCarou";
 //BA.debugLineNum = 48;BA.debugLine="nav.SetAttr(\"buttons\", r)";
_nav._setattr /*b4j.example.wixelement*/ ("buttons",(Object)(_r));
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcarousel)(this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcarousel  _setnavigationitems(boolean _r) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Sub SetNavigationItems(r As Boolean) As WixCarouse";
 //BA.debugLineNum = 42;BA.debugLine="nav.SetAttr(\"items\", r)";
_nav._setattr /*b4j.example.wixelement*/ ("items",(Object)(_r));
 //BA.debugLineNum = 43;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcarousel)(this);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcarousel  _setnavigationtypecorner(String _r) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Sub SetNavigationTypeCorner(r As String) As WixCar";
 //BA.debugLineNum = 55;BA.debugLine="nav.SetAttr(\"type\", \"corner\")";
_nav._setattr /*b4j.example.wixelement*/ ("type",(Object)("corner"));
 //BA.debugLineNum = 56;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcarousel)(this);
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcarousel  _setnavigationtypeside(String _r) throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Sub SetNavigationTypeSide(r As String) As WixCarou";
 //BA.debugLineNum = 36;BA.debugLine="nav.SetAttr(\"type\", \"side\")";
_nav._setattr /*b4j.example.wixelement*/ ("type",(Object)("side"));
 //BA.debugLineNum = 37;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcarousel)(this);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcarousel  _setscrollspeed(int _s) throws Exception{
 //BA.debugLineNum = 18;BA.debugLine="Sub SetScrollSpeed(s As Int) As WixCarousel";
 //BA.debugLineNum = 19;BA.debugLine="Carousel.SetProperty(\"scrollSpeed\", s)";
_carousel._setproperty /*b4j.example.wixelement*/ ("scrollSpeed",(Object)(_s));
 //BA.debugLineNum = 20;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcarousel)(this);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
