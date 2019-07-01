package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixsidebar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixsidebar", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixsidebar.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _sidebar = null;
public anywheresoftware.b4a.objects.collections.List _data = null;
public anywheresoftware.b4a.objects.collections.Map _menus = null;
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
public b4j.example.wixsidebar  _additem(String _parentid,String _meid,String _mvalue,String _mhref,String _micon,String _badge,String _target) throws Exception{
anywheresoftware.b4a.objects.collections.Map _mitem = null;
anywheresoftware.b4a.objects.collections.List _submenu = null;
anywheresoftware.b4a.objects.collections.Map _oldmenu = null;
anywheresoftware.b4a.objects.collections.List _submenus = null;
 //BA.debugLineNum = 19;BA.debugLine="Sub AddItem(parentID As String, meID As String, mV";
 //BA.debugLineNum = 20;BA.debugLine="parentID = parentID.tolowercase";
_parentid = _parentid.toLowerCase();
 //BA.debugLineNum = 21;BA.debugLine="meID = meID.tolowercase";
_meid = _meid.toLowerCase();
 //BA.debugLineNum = 22;BA.debugLine="Dim mitem As Map = CreateMap()";
_mitem = new anywheresoftware.b4a.objects.collections.Map();
_mitem = __c.createMap(new Object[] {});
 //BA.debugLineNum = 23;BA.debugLine="mitem.Put(\"id\", meID)";
_mitem.Put((Object)("id"),(Object)(_meid));
 //BA.debugLineNum = 24;BA.debugLine="mitem.Put(\"value\", mValue)";
_mitem.Put((Object)("value"),(Object)(_mvalue));
 //BA.debugLineNum = 25;BA.debugLine="mitem.Put(\"href\", mhref)";
_mitem.Put((Object)("href"),(Object)(_mhref));
 //BA.debugLineNum = 26;BA.debugLine="mitem.Put(\"badge\", badge)";
_mitem.Put((Object)("badge"),(Object)(_badge));
 //BA.debugLineNum = 27;BA.debugLine="mitem.Put(\"target\", target)";
_mitem.Put((Object)("target"),(Object)(_target));
 //BA.debugLineNum = 28;BA.debugLine="mitem.Put(\"icon\", mIcon)";
_mitem.Put((Object)("icon"),(Object)(_micon));
 //BA.debugLineNum = 29;BA.debugLine="If parentID = \"\" Then";
if ((_parentid).equals("")) { 
 //BA.debugLineNum = 30;BA.debugLine="Dim submenu As List";
_submenu = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 31;BA.debugLine="submenu.Initialize";
_submenu.Initialize();
 //BA.debugLineNum = 32;BA.debugLine="mitem.Put(\"data\", submenu)";
_mitem.Put((Object)("data"),(Object)(_submenu.getObject()));
 //BA.debugLineNum = 33;BA.debugLine="menus.Put(meID,mitem)";
_menus.Put((Object)(_meid),(Object)(_mitem.getObject()));
 }else {
 //BA.debugLineNum = 36;BA.debugLine="Dim oldmenu As Map = menus.Get(parentID)";
_oldmenu = new anywheresoftware.b4a.objects.collections.Map();
_oldmenu.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_menus.Get((Object)(_parentid))));
 //BA.debugLineNum = 37;BA.debugLine="Dim submenus As List = oldmenu.Get(\"data\")";
_submenus = new anywheresoftware.b4a.objects.collections.List();
_submenus.setObject((java.util.List)(_oldmenu.Get((Object)("data"))));
 //BA.debugLineNum = 38;BA.debugLine="submenus.Add(mitem)";
_submenus.Add((Object)(_mitem.getObject()));
 //BA.debugLineNum = 39;BA.debugLine="oldmenu.Put(\"data\", submenus)";
_oldmenu.Put((Object)("data"),(Object)(_submenus.getObject()));
 //BA.debugLineNum = 40;BA.debugLine="menus.Put(parentID,oldmenu)";
_menus.Put((Object)(_parentid),(Object)(_oldmenu.getObject()));
 };
 //BA.debugLineNum = 42;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidebar)(this);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public SideBar As WixElement";
_sidebar = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private data As List";
_data = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 6;BA.debugLine="Private menus As Map";
_menus = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixsidebar  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(sid As String) As WixSideBar";
 //BA.debugLineNum = 11;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 12;BA.debugLine="SideBar.Initialize(sid).SetView(\"sidebar\")";
_sidebar._initialize /*b4j.example.wixelement*/ (ba,_sid)._setview /*b4j.example.wixelement*/ ("sidebar");
 //BA.debugLineNum = 13;BA.debugLine="data.Initialize";
_data.Initialize();
 //BA.debugLineNum = 14;BA.debugLine="menus.Initialize";
_menus.Initialize();
 //BA.debugLineNum = 15;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidebar)(this);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
anywheresoftware.b4a.objects.collections.Map _menuitem = null;
 //BA.debugLineNum = 64;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 65;BA.debugLine="data.clear";
_data.Clear();
 //BA.debugLineNum = 66;BA.debugLine="For Each menuitem As Map In menus.Values";
_menuitem = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group2 = _menus.Values();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_menuitem.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group2.Get(index2)));
 //BA.debugLineNum = 67;BA.debugLine="data.Add(menuitem)";
_data.Add((Object)(_menuitem.getObject()));
 }
};
 //BA.debugLineNum = 69;BA.debugLine="SideBar.SetData(data)";
_sidebar._setdata /*b4j.example.wixelement*/ (_data);
 //BA.debugLineNum = 70;BA.debugLine="Return SideBar.item";
if (true) return _sidebar._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidebar  _setactivetitle(boolean _b) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub SetActiveTitle(b As Boolean) As WixSideBar";
 //BA.debugLineNum = 47;BA.debugLine="SideBar.SetAttr(\"activeTitle\", b)";
_sidebar._setattr /*b4j.example.wixelement*/ ("activeTitle",(Object)(_b));
 //BA.debugLineNum = 48;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidebar)(this);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidebar  _setcollapsed(boolean _b) throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Sub SetCollapsed(b As Boolean) As WixSideBar";
 //BA.debugLineNum = 75;BA.debugLine="SideBar.SetAttr(\"collapsed\", b)";
_sidebar._setattr /*b4j.example.wixelement*/ ("collapsed",(Object)(_b));
 //BA.debugLineNum = 76;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidebar)(this);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidebar  _setcollapsedwidth(boolean _h) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub SetCollapsedWidth(h As Boolean) As WixSideBar";
 //BA.debugLineNum = 81;BA.debugLine="SideBar.SetAttr(\"collapsedWidth\", h)";
_sidebar._setattr /*b4j.example.wixelement*/ ("collapsedWidth",(Object)(_h));
 //BA.debugLineNum = 82;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidebar)(this);
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidebar  _setheight(int _h) throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Sub SetHeight(h As Int) As WixSideBar";
 //BA.debugLineNum = 87;BA.debugLine="SideBar.SetAttr(\"height\", h)";
_sidebar._setattr /*b4j.example.wixelement*/ ("height",(Object)(_h));
 //BA.debugLineNum = 88;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidebar)(this);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidebar  _setmultipleopen(boolean _b) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub SetMultipleOpen(b As Boolean) As WixSideBar";
 //BA.debugLineNum = 53;BA.debugLine="SideBar.setAttr(\"multipleOpen\", b)";
_sidebar._setattr /*b4j.example.wixelement*/ ("multipleOpen",(Object)(_b));
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidebar)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidebar  _setposition(String _c) throws Exception{
 //BA.debugLineNum = 125;BA.debugLine="Sub SetPosition(c As String) As WixSideBar";
 //BA.debugLineNum = 126;BA.debugLine="SideBar.SetAttr(\"position\", c)";
_sidebar._setattr /*b4j.example.wixelement*/ ("position",(Object)(_c));
 //BA.debugLineNum = 127;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidebar)(this);
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidebar  _setpositionbottom(String _c) throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Sub SetPositionBottom(c As String) As WixSideBar";
 //BA.debugLineNum = 119;BA.debugLine="SideBar.SetAttr(\"position\", \"bottom\")";
_sidebar._setattr /*b4j.example.wixelement*/ ("position",(Object)("bottom"));
 //BA.debugLineNum = 120;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidebar)(this);
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidebar  _setpositionleft(String _c) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Sub SetPositionLeft(c As String) As WixSideBar  'i";
 //BA.debugLineNum = 107;BA.debugLine="SideBar.SetAttr(\"position\", \"left\")";
_sidebar._setattr /*b4j.example.wixelement*/ ("position",(Object)("left"));
 //BA.debugLineNum = 108;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidebar)(this);
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidebar  _setpositionright(String _c) throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Sub SetPositionRight(c As String) As WixSideBar  '";
 //BA.debugLineNum = 101;BA.debugLine="SideBar.SetAttr(\"position\", \"right\")";
_sidebar._setattr /*b4j.example.wixelement*/ ("position",(Object)("right"));
 //BA.debugLineNum = 102;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidebar)(this);
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidebar  _setpositiontop(String _c) throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Sub SetPositionTop(c As String) As WixSideBar  'ig";
 //BA.debugLineNum = 113;BA.debugLine="SideBar.SetAttr(\"position\", \"top\")";
_sidebar._setattr /*b4j.example.wixelement*/ ("position",(Object)("top"));
 //BA.debugLineNum = 114;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidebar)(this);
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidebar  _setselect(boolean _b) throws Exception{
 //BA.debugLineNum = 132;BA.debugLine="Sub SetSelect(b As Boolean) As WixSideBar";
 //BA.debugLineNum = 133;BA.debugLine="SideBar.SetProperty(\"select\", b)";
_sidebar._setproperty /*b4j.example.wixelement*/ ("select",(Object)(_b));
 //BA.debugLineNum = 134;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidebar)(this);
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidebar  _settitleheight(int _h) throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub SetTitleHeight(h As Int) As WixSideBar";
 //BA.debugLineNum = 59;BA.debugLine="SideBar.SetAttr(\"titleHeight\", h)";
_sidebar._setattr /*b4j.example.wixelement*/ ("titleHeight",(Object)(_h));
 //BA.debugLineNum = 60;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidebar)(this);
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidebar  _setwidth(int _w) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub SetWidth(w As Int) As WixSideBar";
 //BA.debugLineNum = 94;BA.debugLine="SideBar.SetAttr(\"width\", w)";
_sidebar._setattr /*b4j.example.wixelement*/ ("width",(Object)(_w));
 //BA.debugLineNum = 95;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsidebar)(this);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
