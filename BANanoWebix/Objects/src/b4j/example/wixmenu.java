package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixmenu extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixmenu", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixmenu.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _menu = null;
public anywheresoftware.b4a.objects.collections.List _data = null;
public anywheresoftware.b4a.objects.collections.Map _typeof = null;
public anywheresoftware.b4a.objects.collections.Map _menus = null;
public int _sepcount = 0;
public b4j.example.main _main = null;
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
public b4j.example.pglist _pglist = null;
public b4j.example.pgunitlist _pgunitlist = null;
public b4j.example.pgpropertysheet _pgpropertysheet = null;
public b4j.example.pgtree _pgtree = null;
public b4j.example.pgtreetable _pgtreetable = null;
public b4j.example.pgmenu _pgmenu = null;
public b4j.example.pgsidebar _pgsidebar = null;
public b4j.example.pgcomments _pgcomments = null;
public b4j.example.wixmenu  _additem(String _parentid,String _meid,String _mvalue,String _mhref,String _micon,String _badge,String _target) throws Exception{
anywheresoftware.b4a.objects.collections.Map _mitem = null;
anywheresoftware.b4a.objects.collections.List _submenu = null;
anywheresoftware.b4a.objects.collections.Map _oldmenu = null;
anywheresoftware.b4a.objects.collections.List _submenus = null;
 //BA.debugLineNum = 65;BA.debugLine="Sub AddItem(parentID As String, meID As String, mV";
 //BA.debugLineNum = 66;BA.debugLine="parentID = parentID.tolowercase";
_parentid = _parentid.toLowerCase();
 //BA.debugLineNum = 67;BA.debugLine="meID = meID.tolowercase";
_meid = _meid.toLowerCase();
 //BA.debugLineNum = 68;BA.debugLine="Dim mitem As Map = CreateMap()";
_mitem = new anywheresoftware.b4a.objects.collections.Map();
_mitem = __c.createMap(new Object[] {});
 //BA.debugLineNum = 69;BA.debugLine="mitem.Put(\"id\", meID)";
_mitem.Put((Object)("id"),(Object)(_meid));
 //BA.debugLineNum = 70;BA.debugLine="mitem.Put(\"value\", mValue)";
_mitem.Put((Object)("value"),(Object)(_mvalue));
 //BA.debugLineNum = 71;BA.debugLine="mitem.Put(\"href\", mhref)";
_mitem.Put((Object)("href"),(Object)(_mhref));
 //BA.debugLineNum = 72;BA.debugLine="mitem.Put(\"badge\", badge)";
_mitem.Put((Object)("badge"),(Object)(_badge));
 //BA.debugLineNum = 73;BA.debugLine="mitem.Put(\"target\", target)";
_mitem.Put((Object)("target"),(Object)(_target));
 //BA.debugLineNum = 74;BA.debugLine="mitem.Put(\"icon\", mIcon)";
_mitem.Put((Object)("icon"),(Object)(_micon));
 //BA.debugLineNum = 75;BA.debugLine="If parentID = \"\" Then";
if ((_parentid).equals("")) { 
 //BA.debugLineNum = 76;BA.debugLine="Dim submenu As List";
_submenu = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 77;BA.debugLine="submenu.Initialize";
_submenu.Initialize();
 //BA.debugLineNum = 78;BA.debugLine="mitem.Put(\"submenu\", submenu)";
_mitem.Put((Object)("submenu"),(Object)(_submenu.getObject()));
 //BA.debugLineNum = 79;BA.debugLine="menus.Put(meID,mitem)";
_menus.Put((Object)(_meid),(Object)(_mitem.getObject()));
 }else {
 //BA.debugLineNum = 82;BA.debugLine="Dim oldmenu As Map = menus.Get(parentID)";
_oldmenu = new anywheresoftware.b4a.objects.collections.Map();
_oldmenu.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_menus.Get((Object)(_parentid))));
 //BA.debugLineNum = 83;BA.debugLine="Dim submenus As List = oldmenu.Get(\"submenu\")";
_submenus = new anywheresoftware.b4a.objects.collections.List();
_submenus.setObject((java.util.List)(_oldmenu.Get((Object)("submenu"))));
 //BA.debugLineNum = 84;BA.debugLine="submenus.Add(mitem)";
_submenus.Add((Object)(_mitem.getObject()));
 //BA.debugLineNum = 85;BA.debugLine="oldmenu.Put(\"submenu\", submenus)";
_oldmenu.Put((Object)("submenu"),(Object)(_submenus.getObject()));
 //BA.debugLineNum = 86;BA.debugLine="menus.Put(parentID,oldmenu)";
_menus.Put((Object)(_parentid),(Object)(_oldmenu.getObject()));
 };
 //BA.debugLineNum = 88;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmenu)(this);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmenu  _addseparator(String _parentid) throws Exception{
String _meid = "";
anywheresoftware.b4a.objects.collections.Map _mitem = null;
anywheresoftware.b4a.objects.collections.List _submenu = null;
anywheresoftware.b4a.objects.collections.Map _oldmenu = null;
anywheresoftware.b4a.objects.collections.List _submenus = null;
 //BA.debugLineNum = 91;BA.debugLine="Sub AddSeparator(parentID As String) As WixMenu";
 //BA.debugLineNum = 92;BA.debugLine="parentID = parentID.tolowercase";
_parentid = _parentid.toLowerCase();
 //BA.debugLineNum = 93;BA.debugLine="sepCount = sepCount + 1";
_sepcount = (int) (_sepcount+1);
 //BA.debugLineNum = 94;BA.debugLine="sepCount = sepCount & \"\"";
_sepcount = (int)(Double.parseDouble(BA.NumberToString(_sepcount)+""));
 //BA.debugLineNum = 95;BA.debugLine="Dim meID As String = \"sep\" & sepCount";
_meid = "sep"+BA.NumberToString(_sepcount);
 //BA.debugLineNum = 96;BA.debugLine="Dim mItem As Map = CreateMap()";
_mitem = new anywheresoftware.b4a.objects.collections.Map();
_mitem = __c.createMap(new Object[] {});
 //BA.debugLineNum = 97;BA.debugLine="mItem.Put(\"$template\", \"Separator\")";
_mitem.Put((Object)("$template"),(Object)("Separator"));
 //BA.debugLineNum = 98;BA.debugLine="If parentID = \"\" Then";
if ((_parentid).equals("")) { 
 //BA.debugLineNum = 99;BA.debugLine="Dim submenu As List";
_submenu = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 100;BA.debugLine="submenu.Initialize";
_submenu.Initialize();
 //BA.debugLineNum = 101;BA.debugLine="mItem.Put(\"submenu\", submenu)";
_mitem.Put((Object)("submenu"),(Object)(_submenu.getObject()));
 //BA.debugLineNum = 102;BA.debugLine="menus.Put(meID,mItem)";
_menus.Put((Object)(_meid),(Object)(_mitem.getObject()));
 }else {
 //BA.debugLineNum = 105;BA.debugLine="Dim oldmenu As Map = menus.Get(parentID)";
_oldmenu = new anywheresoftware.b4a.objects.collections.Map();
_oldmenu.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_menus.Get((Object)(_parentid))));
 //BA.debugLineNum = 106;BA.debugLine="Dim submenus As List = oldmenu.Get(\"submenu\")";
_submenus = new anywheresoftware.b4a.objects.collections.List();
_submenus.setObject((java.util.List)(_oldmenu.Get((Object)("submenu"))));
 //BA.debugLineNum = 107;BA.debugLine="submenus.Add(mItem)";
_submenus.Add((Object)(_mitem.getObject()));
 //BA.debugLineNum = 108;BA.debugLine="oldmenu.Put(\"submenu\", submenus)";
_oldmenu.Put((Object)("submenu"),(Object)(_submenus.getObject()));
 //BA.debugLineNum = 109;BA.debugLine="menus.Put(parentID,oldmenu)";
_menus.Put((Object)(_parentid),(Object)(_oldmenu.getObject()));
 };
 //BA.debugLineNum = 111;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmenu)(this);
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return null;
}
public String  _addtoform(b4j.example.wixform _frm) throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 116;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Menu As WixElement";
_menu = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private Data As List";
_data = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 6;BA.debugLine="Private typeof As Map";
_typeof = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 7;BA.debugLine="Private menus As Map";
_menus = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 8;BA.debugLine="Private sepCount As Int";
_sepcount = 0;
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixmenu  _initialize(anywheresoftware.b4a.BA _ba,String _iid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize(iID As String) As WixMenu";
 //BA.debugLineNum = 13;BA.debugLine="ID = iID.tolowercase";
_id = _iid.toLowerCase();
 //BA.debugLineNum = 14;BA.debugLine="Menu.Initialize(iID).SetView(\"menu\")";
_menu._initialize /*b4j.example.wixelement*/ (ba,_iid)._setview /*b4j.example.wixelement*/ ("menu");
 //BA.debugLineNum = 15;BA.debugLine="Data.Initialize";
_data.Initialize();
 //BA.debugLineNum = 16;BA.debugLine="typeof = CreateMap()";
_typeof = __c.createMap(new Object[] {});
 //BA.debugLineNum = 17;BA.debugLine="menus.Initialize";
_menus.Initialize();
 //BA.debugLineNum = 18;BA.debugLine="sepCount = 0";
_sepcount = (int) (0);
 //BA.debugLineNum = 19;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmenu)(this);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
anywheresoftware.b4a.objects.collections.Map _menuitem = null;
 //BA.debugLineNum = 120;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 121;BA.debugLine="Data.clear";
_data.Clear();
 //BA.debugLineNum = 122;BA.debugLine="For Each menuitem As Map In menus.Values";
_menuitem = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group2 = _menus.Values();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_menuitem.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group2.Get(index2)));
 //BA.debugLineNum = 123;BA.debugLine="Data.Add(menuitem)";
_data.Add((Object)(_menuitem.getObject()));
 }
};
 //BA.debugLineNum = 125;BA.debugLine="Menu.SetData(Data)";
_menu._setdata /*b4j.example.wixelement*/ (_data);
 //BA.debugLineNum = 126;BA.debugLine="Menu.SetAttr(\"type\", typeof)";
_menu._setattr /*b4j.example.wixelement*/ ("type",(Object)(_typeof.getObject()));
 //BA.debugLineNum = 127;BA.debugLine="Return Menu.item";
if (true) return _menu._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmenu  _setautowidth(boolean _b) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Sub SetAutoWidth(b As Boolean) As WixMenu";
 //BA.debugLineNum = 60;BA.debugLine="Menu.SetAttr(\"autowidth\", b)";
_menu._setattr /*b4j.example.wixelement*/ ("autowidth",(Object)(_b));
 //BA.debugLineNum = 61;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmenu)(this);
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmenu  _setheight(int _h) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Sub SetHeight(h As Int) As WixMenu";
 //BA.debugLineNum = 42;BA.debugLine="Menu.SetAttr(\"height\", h)";
_menu._setattr /*b4j.example.wixelement*/ ("height",(Object)(_h));
 //BA.debugLineNum = 43;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmenu)(this);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmenu  _setitemsubsign(boolean _b) throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Sub SetItemSubSign(b As Boolean) As WixMenu";
 //BA.debugLineNum = 30;BA.debugLine="typeof.Put(\"subsign\", b)";
_typeof.Put((Object)("subsign"),(Object)(_b));
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmenu)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmenu  _setlayouty(String _r) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub SetLayoutY(r As String) As WixMenu  'ignore";
 //BA.debugLineNum = 54;BA.debugLine="Menu.SetAttr(\"layout\", \"y\")";
_menu._setattr /*b4j.example.wixelement*/ ("layout",(Object)("y"));
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmenu)(this);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmenu  _setselect(boolean _b) throws Exception{
 //BA.debugLineNum = 131;BA.debugLine="Sub SetSelect(b As Boolean) As WixMenu";
 //BA.debugLineNum = 132;BA.debugLine="Menu.SetProperty(\"select\", b)";
_menu._setproperty /*b4j.example.wixelement*/ ("select",(Object)(_b));
 //BA.debugLineNum = 133;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmenu)(this);
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmenu  _setsubmenuposright(String _r) throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Sub SetSubMenuPosRight(r As String) As WixMenu";
 //BA.debugLineNum = 24;BA.debugLine="Menu.SetAttr(\"subMenuPos\", \"right\")";
_menu._setattr /*b4j.example.wixelement*/ ("subMenuPos",(Object)("right"));
 //BA.debugLineNum = 25;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmenu)(this);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmenu  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Sub SetTooltip(tt As String) As WixMenu";
 //BA.debugLineNum = 36;BA.debugLine="Menu.SetTooltip(tt)";
_menu._settooltip /*b4j.example.wixelement*/ (_tt);
 //BA.debugLineNum = 37;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmenu)(this);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmenu  _setwidth(int _w) throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub SetWidth(w As Int) As WixMenu";
 //BA.debugLineNum = 48;BA.debugLine="Menu.SetAttr(\"width\", w)";
_menu._setattr /*b4j.example.wixelement*/ ("width",(Object)(_w));
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmenu)(this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
