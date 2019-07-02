package b4j.Mashy.BANanoWebix;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixsidebar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebix", "b4j.Mashy.BANanoWebix.wixsidebar", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebix.wixsidebar.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebix.wixelement _sidebar = null;
public anywheresoftware.b4a.objects.collections.List _items = null;
public b4j.Mashy.BANanoWebix.main _main = null;
public b4j.Mashy.BANanoWebix.wixsidebar  _additem(String _parentid,String _meid,String _mvalue,String _mhref,String _micon,String _badge,String _target) throws Exception{
anywheresoftware.b4a.objects.collections.Map _mitem = null;
 //BA.debugLineNum = 17;BA.debugLine="Sub AddItem(parentID As String, meID As String, mV";
 //BA.debugLineNum = 18;BA.debugLine="parentID = parentID.tolowercase";
_parentid = _parentid.toLowerCase();
 //BA.debugLineNum = 19;BA.debugLine="meID = meID.tolowercase";
_meid = _meid.toLowerCase();
 //BA.debugLineNum = 20;BA.debugLine="Dim mitem As Map = CreateMap()";
_mitem = new anywheresoftware.b4a.objects.collections.Map();
_mitem = __c.createMap(new Object[] {});
 //BA.debugLineNum = 21;BA.debugLine="mitem.Put(\"id\", meID)";
_mitem.Put((Object)("id"),(Object)(_meid));
 //BA.debugLineNum = 22;BA.debugLine="mitem.Put(\"value\", mValue)";
_mitem.Put((Object)("value"),(Object)(_mvalue));
 //BA.debugLineNum = 23;BA.debugLine="mitem.Put(\"href\", mhref)";
_mitem.Put((Object)("href"),(Object)(_mhref));
 //BA.debugLineNum = 24;BA.debugLine="mitem.Put(\"badge\", badge)";
_mitem.Put((Object)("badge"),(Object)(_badge));
 //BA.debugLineNum = 25;BA.debugLine="mitem.Put(\"target\", target)";
_mitem.Put((Object)("target"),(Object)(_target));
 //BA.debugLineNum = 26;BA.debugLine="mitem.Put(\"icon\", mIcon)";
_mitem.Put((Object)("icon"),(Object)(_micon));
 //BA.debugLineNum = 27;BA.debugLine="mitem.Put(\"parentid\", parentID)";
_mitem.Put((Object)("parentid"),(Object)(_parentid));
 //BA.debugLineNum = 28;BA.debugLine="Items.Add(mitem)";
_items.Add((Object)(_mitem.getObject()));
 //BA.debugLineNum = 29;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixsidebar)(this);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public SideBar As WixElement";
_sidebar = new b4j.Mashy.BANanoWebix.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Public Items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebix.wixsidebar  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(sid As String) As WixSideBar";
 //BA.debugLineNum = 10;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 11;BA.debugLine="SideBar.Initialize(sid).SetView(\"sidebar\")";
_sidebar._initialize /*b4j.Mashy.BANanoWebix.wixelement*/ (ba,_sid)._setview /*b4j.Mashy.BANanoWebix.wixelement*/ ("sidebar");
 //BA.debugLineNum = 12;BA.debugLine="Items.Initialize";
_items.Initialize();
 //BA.debugLineNum = 13;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixsidebar)(this);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 58;BA.debugLine="Return SideBar.item";
if (true) return _sidebar._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixsidebar  _setactivetitle(boolean _b) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub SetActiveTitle(b As Boolean) As WixSideBar";
 //BA.debugLineNum = 34;BA.debugLine="SideBar.SetAttr(\"activeTitle\", b)";
_sidebar._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("activeTitle",(Object)(_b));
 //BA.debugLineNum = 35;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixsidebar)(this);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixsidebar  _setcollapsed(boolean _b) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Sub SetCollapsed(b As Boolean) As WixSideBar";
 //BA.debugLineNum = 63;BA.debugLine="SideBar.SetAttr(\"collapsed\", b)";
_sidebar._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("collapsed",(Object)(_b));
 //BA.debugLineNum = 64;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixsidebar)(this);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixsidebar  _setcollapsedwidth(boolean _h) throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Sub SetCollapsedWidth(h As Boolean) As WixSideBar";
 //BA.debugLineNum = 69;BA.debugLine="SideBar.SetAttr(\"collapsedWidth\", h)";
_sidebar._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("collapsedWidth",(Object)(_h));
 //BA.debugLineNum = 70;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixsidebar)(this);
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixsidebar  _setdata(anywheresoftware.b4a.objects.collections.List _d) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub SetData(d As List) As WixSideBar";
 //BA.debugLineNum = 52;BA.debugLine="SideBar.SetData(d)";
_sidebar._setdata /*b4j.Mashy.BANanoWebix.wixelement*/ (_d);
 //BA.debugLineNum = 53;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixsidebar)(this);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixsidebar  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Sub SetHeight(h As Object) As WixSideBar";
 //BA.debugLineNum = 75;BA.debugLine="SideBar.SetAttr(\"height\", h)";
_sidebar._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("height",_h);
 //BA.debugLineNum = 76;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixsidebar)(this);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixsidebar  _setmultipleopen(boolean _b) throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Sub SetMultipleOpen(b As Boolean) As WixSideBar";
 //BA.debugLineNum = 40;BA.debugLine="SideBar.setAttr(\"multipleOpen\", b)";
_sidebar._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("multipleOpen",(Object)(_b));
 //BA.debugLineNum = 41;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixsidebar)(this);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixsidebar  _setposition(String _c) throws Exception{
 //BA.debugLineNum = 113;BA.debugLine="Sub SetPosition(c As String) As WixSideBar";
 //BA.debugLineNum = 114;BA.debugLine="SideBar.SetAttr(\"position\", c)";
_sidebar._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("position",(Object)(_c));
 //BA.debugLineNum = 115;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixsidebar)(this);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixsidebar  _setpositionbottom(String _c) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Sub SetPositionBottom(c As String) As WixSideBar";
 //BA.debugLineNum = 107;BA.debugLine="SideBar.SetAttr(\"position\", \"bottom\")";
_sidebar._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("position",(Object)("bottom"));
 //BA.debugLineNum = 108;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixsidebar)(this);
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixsidebar  _setpositionleft(String _c) throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Sub SetPositionLeft(c As String) As WixSideBar  'i";
 //BA.debugLineNum = 95;BA.debugLine="SideBar.SetAttr(\"position\", \"left\")";
_sidebar._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("position",(Object)("left"));
 //BA.debugLineNum = 96;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixsidebar)(this);
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixsidebar  _setpositionright(String _c) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Sub SetPositionRight(c As String) As WixSideBar  '";
 //BA.debugLineNum = 89;BA.debugLine="SideBar.SetAttr(\"position\", \"right\")";
_sidebar._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("position",(Object)("right"));
 //BA.debugLineNum = 90;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixsidebar)(this);
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixsidebar  _setpositiontop(String _c) throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Sub SetPositionTop(c As String) As WixSideBar  'ig";
 //BA.debugLineNum = 101;BA.debugLine="SideBar.SetAttr(\"position\", \"top\")";
_sidebar._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("position",(Object)("top"));
 //BA.debugLineNum = 102;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixsidebar)(this);
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixsidebar  _setscroll(boolean _b) throws Exception{
 //BA.debugLineNum = 126;BA.debugLine="Sub SetScroll(b As Boolean) As WixSideBar";
 //BA.debugLineNum = 127;BA.debugLine="SideBar.SetProperty(\"scroll\", b)";
_sidebar._setproperty /*b4j.Mashy.BANanoWebix.wixelement*/ ("scroll",(Object)(_b));
 //BA.debugLineNum = 128;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixsidebar)(this);
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixsidebar  _setselect(boolean _b) throws Exception{
 //BA.debugLineNum = 120;BA.debugLine="Sub SetSelect(b As Boolean) As WixSideBar";
 //BA.debugLineNum = 121;BA.debugLine="SideBar.SetProperty(\"select\", b)";
_sidebar._setproperty /*b4j.Mashy.BANanoWebix.wixelement*/ ("select",(Object)(_b));
 //BA.debugLineNum = 122;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixsidebar)(this);
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixsidebar  _settitleheight(int _h) throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Sub SetTitleHeight(h As Int) As WixSideBar";
 //BA.debugLineNum = 46;BA.debugLine="SideBar.SetAttr(\"titleHeight\", h)";
_sidebar._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("titleHeight",(Object)(_h));
 //BA.debugLineNum = 47;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixsidebar)(this);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixsidebar  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Sub SetWidth(w As Object) As WixSideBar";
 //BA.debugLineNum = 82;BA.debugLine="SideBar.SetAttr(\"width\", w)";
_sidebar._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("width",_w);
 //BA.debugLineNum = 83;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixsidebar)(this);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
