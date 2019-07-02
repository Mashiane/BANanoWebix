package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixsidemenu extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixsidemenu", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixsidemenu.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _sidemenu = null;
public b4j.example.wixelement _body = null;
public anywheresoftware.b4a.objects.collections.List _data = null;
public anywheresoftware.b4a.objects.collections.Map _typeof = null;
public b4j.example.main _main = null;
public b4j.example.pgvideo _pgvideo = null;
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
public b4j.example.pguploader2 _pguploader2 = null;
public b4j.example.pguploader3 _pguploader3 = null;
public b4j.example.wixsidemenu  _additem(String _meid,String _mvalue,String _mhref,String _micon,String _badge,String _target) throws Exception{
anywheresoftware.b4a.objects.collections.Map _mitem = null;
 //BA.debugLineNum = 21;BA.debugLine="Sub AddItem(meID As String, mValue As String, mhre";
 //BA.debugLineNum = 22;BA.debugLine="meID = meID.tolowercase";
_meid = _meid.toLowerCase();
 //BA.debugLineNum = 23;BA.debugLine="Dim mitem As Map = CreateMap()";
_mitem = new anywheresoftware.b4a.objects.collections.Map();
_mitem = __c.createMap(new Object[] {});
 //BA.debugLineNum = 24;BA.debugLine="mitem.Put(\"id\", meID)";
_mitem.Put((Object)("id"),(Object)(_meid));
 //BA.debugLineNum = 25;BA.debugLine="mitem.Put(\"value\", mValue)";
_mitem.Put((Object)("value"),(Object)(_mvalue));
 //BA.debugLineNum = 26;BA.debugLine="mitem.Put(\"href\", mhref)";
_mitem.Put((Object)("href"),(Object)(_mhref));
 //BA.debugLineNum = 27;BA.debugLine="mitem.Put(\"badge\", badge)";
_mitem.Put((Object)("badge"),(Object)(_badge));
 //BA.debugLineNum = 28;BA.debugLine="mitem.Put(\"target\", target)";
_mitem.Put((Object)("target"),(Object)(_target));
 //BA.debugLineNum = 29;BA.debugLine="mitem.Put(\"icon\", mIcon)";
_mitem.Put((Object)("icon"),(Object)(_micon));
 //BA.debugLineNum = 30;BA.debugLine="data.Add(mitem)";
_data.Add((Object)(_mitem.getObject()));
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidemenu)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public SideMenu As WixElement";
_sidemenu = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private body As WixElement";
_body = new b4j.example.wixelement();
 //BA.debugLineNum = 6;BA.debugLine="Private data As List";
_data = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 7;BA.debugLine="Private typeOf As Map";
_typeof = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixsidemenu  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(sid As String) As WixSideMen";
 //BA.debugLineNum = 12;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 13;BA.debugLine="SideMenu.Initialize(sid).SetView(\"sidemenu\")";
_sidemenu._initialize /*b4j.example.wixelement*/ (ba,_sid)._setview /*b4j.example.wixelement*/ ("sidemenu");
 //BA.debugLineNum = 14;BA.debugLine="body.Initialize(ID & \"body\").SetView(\"list\").SetB";
_body._initialize /*b4j.example.wixelement*/ (ba,_id+"body")._setview /*b4j.example.wixelement*/ ("list")._setborderless /*b4j.example.wixelement*/ (__c.True)._setscroll /*b4j.example.wixelement*/ (__c.False)._setselect /*b4j.example.wixelement*/ (__c.True);
 //BA.debugLineNum = 15;BA.debugLine="data.Initialize";
_data.Initialize();
 //BA.debugLineNum = 16;BA.debugLine="typeOf.Initialize";
_typeof.Initialize();
 //BA.debugLineNum = 17;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidemenu)(this);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 36;BA.debugLine="body.SetAttr(\"type\", typeOf)";
_body._setattr /*b4j.example.wixelement*/ ("type",(Object)(_typeof.getObject()));
 //BA.debugLineNum = 37;BA.debugLine="body.SetData(data)";
_body._setdata /*b4j.example.wixelement*/ (_data);
 //BA.debugLineNum = 38;BA.debugLine="SideMenu.SetAttr(\"body\", body.item)";
_sidemenu._setattr /*b4j.example.wixelement*/ ("body",(Object)(_body._item /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 39;BA.debugLine="Return SideMenu.item";
if (true) return _sidemenu._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidemenu  _setheight(int _h) throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Sub SetHeight(h As Int) As WixSideMenu";
 //BA.debugLineNum = 51;BA.debugLine="SideMenu.SetAttr(\"height\", h)";
_sidemenu._setattr /*b4j.example.wixelement*/ ("height",(Object)(_h));
 //BA.debugLineNum = 52;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidemenu)(this);
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidemenu  _setitemheight(int _h) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub SetItemHeight(h As Int) As WixSideMenu";
 //BA.debugLineNum = 58;BA.debugLine="typeOf.Put(\"height\", h)";
_typeof.Put((Object)("height"),(Object)(_h));
 //BA.debugLineNum = 59;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidemenu)(this);
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidemenu  _setitemwidth(int _w) throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Sub SetItemWidth(w As Int) As WixSideMenu";
 //BA.debugLineNum = 64;BA.debugLine="typeOf.Put(\"width\", w)";
_typeof.Put((Object)("width"),(Object)(_w));
 //BA.debugLineNum = 65;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidemenu)(this);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidemenu  _setlayoutx(boolean _h) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub SetLayoutX(h As Boolean) As WixSideMenu";
 //BA.debugLineNum = 71;BA.debugLine="body.SetAttr(\"layout\", \"x\")";
_body._setattr /*b4j.example.wixelement*/ ("layout",(Object)("x"));
 //BA.debugLineNum = 72;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidemenu)(this);
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidemenu  _setposition(String _c) throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Sub SetPosition(c As String) As WixSideMenu";
 //BA.debugLineNum = 116;BA.debugLine="SideMenu.SetAttr(\"position\", c)";
_sidemenu._setattr /*b4j.example.wixelement*/ ("position",(Object)(_c));
 //BA.debugLineNum = 117;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidemenu)(this);
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidemenu  _setpositionbottom(String _c) throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Sub SetPositionBottom(c As String) As WixSideMenu";
 //BA.debugLineNum = 109;BA.debugLine="SideMenu.SetAttr(\"position\", \"bottom\")";
_sidemenu._setattr /*b4j.example.wixelement*/ ("position",(Object)("bottom"));
 //BA.debugLineNum = 110;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidemenu)(this);
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidemenu  _setpositionleft(String _c) throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Sub SetPositionLeft(c As String) As WixSideMenu  '";
 //BA.debugLineNum = 97;BA.debugLine="SideMenu.SetAttr(\"position\", \"left\")";
_sidemenu._setattr /*b4j.example.wixelement*/ ("position",(Object)("left"));
 //BA.debugLineNum = 98;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidemenu)(this);
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidemenu  _setpositionright(String _c) throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Sub SetPositionRight(c As String) As WixSideMenu";
 //BA.debugLineNum = 91;BA.debugLine="SideMenu.SetAttr(\"position\", \"right\")";
_sidemenu._setattr /*b4j.example.wixelement*/ ("position",(Object)("right"));
 //BA.debugLineNum = 92;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidemenu)(this);
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidemenu  _setpositiontop(String _c) throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Sub SetPositionTop(c As String) As WixSideMenu  'i";
 //BA.debugLineNum = 103;BA.debugLine="SideMenu.SetAttr(\"position\", \"top\")";
_sidemenu._setattr /*b4j.example.wixelement*/ ("position",(Object)("top"));
 //BA.debugLineNum = 104;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidemenu)(this);
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidemenu  _setselect(Object _s) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub SetSelect(s As Object) As WixSideMenu";
 //BA.debugLineNum = 85;BA.debugLine="SideMenu.SetAttr(\"select\", s)";
_sidemenu._setattr /*b4j.example.wixelement*/ ("select",_s);
 //BA.debugLineNum = 86;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidemenu)(this);
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidemenu  _settemplate(String _t) throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Sub SetTemplate(t As String) As WixSideMenu";
 //BA.debugLineNum = 44;BA.debugLine="body.SetTemplate(t)";
_body._settemplate /*b4j.example.wixelement*/ ((Object)(_t));
 //BA.debugLineNum = 45;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidemenu)(this);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidemenu  _setwidth(int _w) throws Exception{
 //BA.debugLineNum = 77;BA.debugLine="Sub SetWidth(w As Int) As WixSideMenu";
 //BA.debugLineNum = 78;BA.debugLine="SideMenu.SetAttr(\"width\", w)";
_sidemenu._setattr /*b4j.example.wixelement*/ ("width",(Object)(_w));
 //BA.debugLineNum = 79;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidemenu)(this);
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
