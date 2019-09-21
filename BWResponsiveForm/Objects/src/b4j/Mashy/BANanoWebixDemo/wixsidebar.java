package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixsidebar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixsidebar", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixsidebar.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _sidebar = null;
public anywheresoftware.b4a.objects.collections.List _items = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _additem(String _parentid,String _meid,String _mvalue,String _mhref,String _micon,String _badge,String _target) throws Exception{
anywheresoftware.b4a.objects.collections.Map _mitem = null;
 //BA.debugLineNum = 73;BA.debugLine="Sub AddItem(parentID As String, meID As String, mV";
 //BA.debugLineNum = 74;BA.debugLine="parentID = parentID.tolowercase";
_parentid = _parentid.toLowerCase();
 //BA.debugLineNum = 75;BA.debugLine="meID = meID.tolowercase";
_meid = _meid.toLowerCase();
 //BA.debugLineNum = 76;BA.debugLine="Dim mitem As Map = CreateMap()";
_mitem = new anywheresoftware.b4a.objects.collections.Map();
_mitem = __c.createMap(new Object[] {});
 //BA.debugLineNum = 77;BA.debugLine="mitem.Put(\"id\", meID)";
_mitem.Put((Object)("id"),(Object)(_meid));
 //BA.debugLineNum = 78;BA.debugLine="mitem.Put(\"value\", mValue)";
_mitem.Put((Object)("value"),(Object)(_mvalue));
 //BA.debugLineNum = 79;BA.debugLine="mitem.Put(\"href\", mhref)";
_mitem.Put((Object)("href"),(Object)(_mhref));
 //BA.debugLineNum = 80;BA.debugLine="mitem.Put(\"badge\", badge)";
_mitem.Put((Object)("badge"),(Object)(_badge));
 //BA.debugLineNum = 81;BA.debugLine="mitem.Put(\"target\", target)";
_mitem.Put((Object)("target"),(Object)(_target));
 //BA.debugLineNum = 82;BA.debugLine="mitem.Put(\"icon\", mIcon)";
_mitem.Put((Object)("icon"),(Object)(_micon));
 //BA.debugLineNum = 83;BA.debugLine="mitem.Put(\"parentid\", parentID)";
_mitem.Put((Object)("parentid"),(Object)(_parentid));
 //BA.debugLineNum = 84;BA.debugLine="Items.Add(mitem)";
_items.Add((Object)(_mitem.getObject()));
 //BA.debugLineNum = 85;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return null;
}
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 253;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 254;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 255;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 258;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 259;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 260;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 248;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 249;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 250;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public SideBar As WixElement";
_sidebar = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Public Items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 6;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _createitem(String _i) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixelement _ii = null;
 //BA.debugLineNum = 61;BA.debugLine="Sub CreateItem(i As String) As WixElement";
 //BA.debugLineNum = 62;BA.debugLine="Dim ii As WixElement";
_ii = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 63;BA.debugLine="ii.Initialize(i)";
_ii._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_i);
 //BA.debugLineNum = 64;BA.debugLine="Return ii";
if (true) return _ii;
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(sid As String) As WixSideBar";
 //BA.debugLineNum = 12;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 13;BA.debugLine="SideBar.Initialize(sid).SetView(\"sidebar\")";
_sidebar._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_sid)._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("sidebar");
 //BA.debugLineNum = 14;BA.debugLine="Items.Initialize";
_items.Initialize();
 //BA.debugLineNum = 15;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 16;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
anywheresoftware.b4a.objects.collections.List _data = null;
 //BA.debugLineNum = 153;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 154;BA.debugLine="If Items.Size > 0 Then";
if (_items.getSize()>0) { 
 //BA.debugLineNum = 155;BA.debugLine="Dim data As List = modWebix.Unflatten(Items,\"dat";
_data = new anywheresoftware.b4a.objects.collections.List();
_data = _modwebix._unflatten /*anywheresoftware.b4a.objects.collections.List*/ (_items,"data");
 //BA.debugLineNum = 156;BA.debugLine="SetData(data)";
_setdata(_data);
 };
 //BA.debugLineNum = 158;BA.debugLine="Return SideBar.item";
if (true) return _sidebar._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 69;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _setactivetitle(boolean _b) throws Exception{
 //BA.debugLineNum = 129;BA.debugLine="Sub SetActiveTitle(b As Boolean) As WixSideBar";
 //BA.debugLineNum = 130;BA.debugLine="SideBar.SetAttr(\"activeTitle\", b)";
_sidebar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("activeTitle",(Object)(_b));
 //BA.debugLineNum = 131;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _setanimate(boolean _animate) throws Exception{
 //BA.debugLineNum = 262;BA.debugLine="Sub SetAnimate(animate As Boolean) As WixSideBar";
 //BA.debugLineNum = 263;BA.debugLine="SideBar.SetAttr(\"animate\", animate)";
_sidebar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("animate",(Object)(_animate));
 //BA.debugLineNum = 264;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 265;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 38;BA.debugLine="Sub SetAttributes(m As Map) As WixSideBar";
 //BA.debugLineNum = 39;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 40;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 41;BA.debugLine="SideBar.SetAttr(k,v)";
_sidebar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 43;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _setborderless(boolean _borderless) throws Exception{
 //BA.debugLineNum = 267;BA.debugLine="Sub SetBorderless(borderless As Boolean) As WixSid";
 //BA.debugLineNum = 268;BA.debugLine="SideBar.SetAttr(\"borderless\", borderless)";
_sidebar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("borderless",(Object)(_borderless));
 //BA.debugLineNum = 269;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 270;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _setclick(Object _click) throws Exception{
 //BA.debugLineNum = 272;BA.debugLine="Sub SetClick(click As Object) As WixSideBar";
 //BA.debugLineNum = 273;BA.debugLine="SideBar.SetAttr(\"click\", click)";
_sidebar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("click",_click);
 //BA.debugLineNum = 274;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 275;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _setclipboard(Object _clipboard) throws Exception{
 //BA.debugLineNum = 277;BA.debugLine="Sub SetClipboard(clipboard As Object) As WixSideBa";
 //BA.debugLineNum = 278;BA.debugLine="SideBar.SetAttr(\"clipboard\", clipboard)";
_sidebar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("clipboard",_clipboard);
 //BA.debugLineNum = 279;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 280;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _setcollapsed(boolean _b) throws Exception{
 //BA.debugLineNum = 176;BA.debugLine="Sub SetCollapsed(b As Boolean) As WixSideBar";
 //BA.debugLineNum = 177;BA.debugLine="SideBar.SetAttr(\"collapsed\", b)";
_sidebar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("collapsed",(Object)(_b));
 //BA.debugLineNum = 178;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _setcollapsedwidth(boolean _h) throws Exception{
 //BA.debugLineNum = 182;BA.debugLine="Sub SetCollapsedWidth(h As Boolean) As WixSideBar";
 //BA.debugLineNum = 183;BA.debugLine="SideBar.SetAttr(\"collapsedWidth\", h)";
_sidebar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("collapsedWidth",(Object)(_h));
 //BA.debugLineNum = 184;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 185;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _setcontainer(Object _container) throws Exception{
 //BA.debugLineNum = 283;BA.debugLine="Sub SetContainer(container As Object) As WixSideBa";
 //BA.debugLineNum = 284;BA.debugLine="SideBar.SetAttr(\"container\", container)";
_sidebar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("container",_container);
 //BA.debugLineNum = 285;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 286;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _setcss(Object _css) throws Exception{
 //BA.debugLineNum = 288;BA.debugLine="Sub SetCss(css As Object) As WixSideBar";
 //BA.debugLineNum = 289;BA.debugLine="SideBar.SetAttr(\"css\", css)";
_sidebar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("css",_css);
 //BA.debugLineNum = 290;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 291;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _setdata(anywheresoftware.b4a.objects.collections.List _d) throws Exception{
 //BA.debugLineNum = 147;BA.debugLine="Sub SetData(d As List) As WixSideBar";
 //BA.debugLineNum = 148;BA.debugLine="SideBar.SetData(d)";
_sidebar._setdata /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_d);
 //BA.debugLineNum = 149;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _setdatafeed(Object _datafeed) throws Exception{
 //BA.debugLineNum = 293;BA.debugLine="Sub SetDataFeed(dataFeed As Object) As WixSideBar";
 //BA.debugLineNum = 294;BA.debugLine="SideBar.SetAttr(\"dataFeed\", dataFeed)";
_sidebar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("dataFeed",_datafeed);
 //BA.debugLineNum = 295;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 296;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _setdatathrottle(Object _datathrottle) throws Exception{
 //BA.debugLineNum = 298;BA.debugLine="Sub SetDatathrottle(datathrottle As Object) As Wix";
 //BA.debugLineNum = 299;BA.debugLine="SideBar.SetAttr(\"datathrottle\", datathrottle)";
_sidebar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("datathrottle",_datathrottle);
 //BA.debugLineNum = 300;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 301;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _setdatatype(Object _datatype) throws Exception{
 //BA.debugLineNum = 303;BA.debugLine="Sub SetDatatype(datatype As Object) As WixSideBar";
 //BA.debugLineNum = 304;BA.debugLine="SideBar.SetAttr(\"datatype\", datatype)";
_sidebar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("datatype",_datatype);
 //BA.debugLineNum = 305;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 306;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _setdisabled(boolean _disabled) throws Exception{
 //BA.debugLineNum = 308;BA.debugLine="Sub SetDisabled(disabled As Boolean) As WixSideBar";
 //BA.debugLineNum = 309;BA.debugLine="SideBar.SetAttr(\"disabled\", disabled)";
_sidebar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("disabled",(Object)(_disabled));
 //BA.debugLineNum = 310;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 311;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _setdrag(Object _drag) throws Exception{
 //BA.debugLineNum = 313;BA.debugLine="Sub SetDrag(drag As Object) As WixSideBar";
 //BA.debugLineNum = 314;BA.debugLine="SideBar.SetAttr(\"drag\", drag)";
_sidebar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("drag",_drag);
 //BA.debugLineNum = 315;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 316;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _setdragscroll(Object _dragscroll) throws Exception{
 //BA.debugLineNum = 318;BA.debugLine="Sub SetDragscroll(dragscroll As Object) As WixSide";
 //BA.debugLineNum = 319;BA.debugLine="SideBar.SetAttr(\"dragscroll\", dragscroll)";
_sidebar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("dragscroll",_dragscroll);
 //BA.debugLineNum = 320;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 321;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _setfiltermode(Object _filtermode) throws Exception{
 //BA.debugLineNum = 323;BA.debugLine="Sub SetFilterMode(filterMode As Object) As WixSide";
 //BA.debugLineNum = 324;BA.debugLine="SideBar.SetAttr(\"filterMode\", filterMode)";
_sidebar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("filterMode",_filtermode);
 //BA.debugLineNum = 325;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 326;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _setgravity(Object _gravity) throws Exception{
 //BA.debugLineNum = 328;BA.debugLine="Sub SetGravity(gravity As Object) As WixSideBar";
 //BA.debugLineNum = 329;BA.debugLine="SideBar.SetAttr(\"gravity\", gravity)";
_sidebar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("gravity",_gravity);
 //BA.debugLineNum = 330;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 331;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 188;BA.debugLine="Sub SetHeight(h As Object) As WixSideBar";
 //BA.debugLineNum = 189;BA.debugLine="SideBar.SetAttr(\"height\", h)";
_sidebar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("height",_h);
 //BA.debugLineNum = 190;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 191;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _sethidden(boolean _hidden) throws Exception{
 //BA.debugLineNum = 333;BA.debugLine="Sub SetHidden(hidden As Boolean) As WixSideBar";
 //BA.debugLineNum = 334;BA.debugLine="SideBar.SetAttr(\"hidden\", hidden)";
_sidebar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hidden",(Object)(_hidden));
 //BA.debugLineNum = 335;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 336;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 119;BA.debugLine="Sub SetMap(m As Map) As WixSideBar";
 //BA.debugLineNum = 120;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 121;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 122;BA.debugLine="SideBar.SetAttr(strKey,	strVal)";
_sidebar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 124;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Sub SetMargin(margin As Object) As WixSideBar";
 //BA.debugLineNum = 27;BA.debugLine="SideBar.SetMargin(margin)";
_sidebar._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 28;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _setmaxheight(Object _maxheight) throws Exception{
 //BA.debugLineNum = 338;BA.debugLine="Sub SetMaxHeight(maxHeight As Object) As WixSideBa";
 //BA.debugLineNum = 339;BA.debugLine="SideBar.SetAttr(\"maxHeight\", maxHeight)";
_sidebar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxHeight",_maxheight);
 //BA.debugLineNum = 340;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 341;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _setmaxwidth(Object _maxwidth) throws Exception{
 //BA.debugLineNum = 343;BA.debugLine="Sub SetMaxWidth(maxWidth As Object) As WixSideBar";
 //BA.debugLineNum = 344;BA.debugLine="SideBar.SetAttr(\"maxWidth\", maxWidth)";
_sidebar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxWidth",_maxwidth);
 //BA.debugLineNum = 345;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 346;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Sub SetMinHeight(h As Int) As WixSideBar";
 //BA.debugLineNum = 115;BA.debugLine="SideBar.SetMinHeight(h)";
_sidebar._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 116;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Sub SetMinWidth(w As Int) As WixSideBar";
 //BA.debugLineNum = 109;BA.debugLine="SideBar.SetMinWidth(w)";
_sidebar._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 110;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _setmultipleopen(boolean _b) throws Exception{
 //BA.debugLineNum = 135;BA.debugLine="Sub SetMultipleOpen(b As Boolean) As WixSideBar";
 //BA.debugLineNum = 136;BA.debugLine="SideBar.setAttr(\"multipleOpen\", b)";
_sidebar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("multipleOpen",(Object)(_b));
 //BA.debugLineNum = 137;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _setmultiselect(boolean _multiselect) throws Exception{
 //BA.debugLineNum = 348;BA.debugLine="Sub SetMultiselect(multiselect As Boolean) As WixS";
 //BA.debugLineNum = 349;BA.debugLine="SideBar.SetAttr(\"multiselect\", multiselect)";
_sidebar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("multiselect",(Object)(_multiselect));
 //BA.debugLineNum = 350;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 351;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _setname(String _n) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub SetName(n As String) As WixSideBar";
 //BA.debugLineNum = 90;BA.debugLine="SideBar.SetName(n)";
_sidebar._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 91;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _setnavigation(boolean _navigation) throws Exception{
 //BA.debugLineNum = 353;BA.debugLine="Sub SetNavigation(navigation As Boolean) As WixSid";
 //BA.debugLineNum = 354;BA.debugLine="SideBar.SetAttr(\"navigation\", navigation)";
_sidebar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("navigation",(Object)(_navigation));
 //BA.debugLineNum = 355;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 356;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Sub SetPadding(padding As Object) As WixSideBar";
 //BA.debugLineNum = 21;BA.debugLine="SideBar.SetPadding(padding)";
_sidebar._setpadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 22;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _setpager(Object _pager) throws Exception{
 //BA.debugLineNum = 358;BA.debugLine="Sub SetPager(pager As Object) As WixSideBar";
 //BA.debugLineNum = 359;BA.debugLine="SideBar.SetAttr(\"pager\", pager)";
_sidebar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("pager",_pager);
 //BA.debugLineNum = 360;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 361;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Sub SetParent(p As WixElement) As WixSideBar";
 //BA.debugLineNum = 56;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 57;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _setposition(String _c) throws Exception{
 //BA.debugLineNum = 227;BA.debugLine="Sub SetPosition(c As String) As WixSideBar";
 //BA.debugLineNum = 228;BA.debugLine="SideBar.SetAttr(\"position\", c)";
_sidebar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("position",(Object)(_c));
 //BA.debugLineNum = 229;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 230;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _setpositionbottom(String _c) throws Exception{
 //BA.debugLineNum = 220;BA.debugLine="Sub SetPositionBottom(c As String) As WixSideBar";
 //BA.debugLineNum = 221;BA.debugLine="SideBar.SetAttr(\"position\", \"bottom\")";
_sidebar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("position",(Object)("bottom"));
 //BA.debugLineNum = 222;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 223;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _setpositionleft(String _c) throws Exception{
 //BA.debugLineNum = 208;BA.debugLine="Sub SetPositionLeft(c As String) As WixSideBar  'i";
 //BA.debugLineNum = 209;BA.debugLine="SideBar.SetAttr(\"position\", \"left\")";
_sidebar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("position",(Object)("left"));
 //BA.debugLineNum = 210;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 211;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _setpositionright(String _c) throws Exception{
 //BA.debugLineNum = 202;BA.debugLine="Sub SetPositionRight(c As String) As WixSideBar  '";
 //BA.debugLineNum = 203;BA.debugLine="SideBar.SetAttr(\"position\", \"right\")";
_sidebar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("position",(Object)("right"));
 //BA.debugLineNum = 204;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 205;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _setpositiontop(String _c) throws Exception{
 //BA.debugLineNum = 214;BA.debugLine="Sub SetPositionTop(c As String) As WixSideBar  'ig";
 //BA.debugLineNum = 215;BA.debugLine="SideBar.SetAttr(\"position\", \"top\")";
_sidebar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("position",(Object)("top"));
 //BA.debugLineNum = 216;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 217;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _setready(Object _ready) throws Exception{
 //BA.debugLineNum = 363;BA.debugLine="Sub SetReady(ready As Object) As WixSideBar";
 //BA.debugLineNum = 364;BA.debugLine="SideBar.SetAttr(\"ready\", ready)";
_sidebar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("ready",_ready);
 //BA.debugLineNum = 365;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 366;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _setremovemissed(boolean _removemissed) throws Exception{
 //BA.debugLineNum = 368;BA.debugLine="Sub SetRemoveMissed(removeMissed As Boolean) As Wi";
 //BA.debugLineNum = 369;BA.debugLine="SideBar.SetAttr(\"removeMissed\", removeMissed)";
_sidebar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("removeMissed",(Object)(_removemissed));
 //BA.debugLineNum = 370;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 371;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Sub SetResponsive(b As Object) As WixSideBar";
 //BA.debugLineNum = 96;BA.debugLine="SideBar.SetResponsive(b)";
_sidebar._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 97;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixSideBar";
 //BA.debugLineNum = 102;BA.debugLine="SideBar.SetResponsiveCell(b)";
_sidebar._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 103;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _setsave(Object _save) throws Exception{
 //BA.debugLineNum = 373;BA.debugLine="Sub SetSave(save As Object) As WixSideBar";
 //BA.debugLineNum = 374;BA.debugLine="SideBar.SetAttr(\"save\", save)";
_sidebar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("save",_save);
 //BA.debugLineNum = 375;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 376;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _setscheme(Object _scheme) throws Exception{
 //BA.debugLineNum = 378;BA.debugLine="Sub SetScheme(scheme As Object) As WixSideBar";
 //BA.debugLineNum = 379;BA.debugLine="SideBar.SetAttr(\"scheme\", scheme)";
_sidebar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("scheme",_scheme);
 //BA.debugLineNum = 380;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 381;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _setscroll(Object _b) throws Exception{
 //BA.debugLineNum = 240;BA.debugLine="Sub SetScroll(b As Object) As WixSideBar";
 //BA.debugLineNum = 241;BA.debugLine="SideBar.SetAttr(\"scroll\", b)";
_sidebar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("scroll",_b);
 //BA.debugLineNum = 242;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 243;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _setscrollspeed(Object _scrollspeed) throws Exception{
 //BA.debugLineNum = 383;BA.debugLine="Sub SetScrollSpeed(scrollSpeed As Object) As WixSi";
 //BA.debugLineNum = 384;BA.debugLine="SideBar.SetAttr(\"scrollSpeed\", scrollSpeed)";
_sidebar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("scrollSpeed",_scrollspeed);
 //BA.debugLineNum = 385;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 386;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _setselect(boolean _b) throws Exception{
 //BA.debugLineNum = 234;BA.debugLine="Sub SetSelect(b As Boolean) As WixSideBar";
 //BA.debugLineNum = 235;BA.debugLine="SideBar.SetAttr(\"select\", b)";
_sidebar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("select",(Object)(_b));
 //BA.debugLineNum = 236;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 237;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 33;BA.debugLine="SideBar.SetStyle(prop,sval)";
_sidebar._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 34;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 46;BA.debugLine="Sub SetStyles(m As Map) As WixSideBar";
 //BA.debugLineNum = 47;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 48;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 49;BA.debugLine="SideBar.SetStyle(k,v)";
_sidebar._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 51;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _settemplate(String _t) throws Exception{
 //BA.debugLineNum = 162;BA.debugLine="Sub SetTemplate(t As String) As WixSideBar";
 //BA.debugLineNum = 163;BA.debugLine="SideBar.SetTemplate(t)";
_sidebar._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_t));
 //BA.debugLineNum = 164;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 165;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 168;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixSideBar";
 //BA.debugLineNum = 169;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 170;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 171;BA.debugLine="SideBar.SetTemplate(os)";
_sidebar._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 172;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _setthreestate(boolean _threestate) throws Exception{
 //BA.debugLineNum = 389;BA.debugLine="Sub SetThreeState(threeState As Boolean) As WixSid";
 //BA.debugLineNum = 390;BA.debugLine="SideBar.SetAttr(\"threeState\", threeState)";
_sidebar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("threeState",(Object)(_threestate));
 //BA.debugLineNum = 391;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 392;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _settitleheight(int _h) throws Exception{
 //BA.debugLineNum = 141;BA.debugLine="Sub SetTitleHeight(h As Int) As WixSideBar";
 //BA.debugLineNum = 142;BA.debugLine="SideBar.SetAttr(\"titleHeight\", h)";
_sidebar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("titleHeight",(Object)(_h));
 //BA.debugLineNum = 143;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _settooltip(Object _tooltip) throws Exception{
 //BA.debugLineNum = 394;BA.debugLine="Sub SetTooltip(tooltip As Object) As WixSideBar";
 //BA.debugLineNum = 395;BA.debugLine="SideBar.SetAttr(\"tooltip\", tooltip)";
_sidebar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("tooltip",_tooltip);
 //BA.debugLineNum = 396;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 397;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _settype(Object _stype) throws Exception{
 //BA.debugLineNum = 399;BA.debugLine="Sub SetType(sType As Object) As WixSideBar";
 //BA.debugLineNum = 400;BA.debugLine="SideBar.SetAttr(\"type\", sType)";
_sidebar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("type",_stype);
 //BA.debugLineNum = 401;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 402;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _seturl(Object _url) throws Exception{
 //BA.debugLineNum = 404;BA.debugLine="Sub SetUrl(url As Object) As WixSideBar";
 //BA.debugLineNum = 405;BA.debugLine="SideBar.SetAttr(\"url\", url)";
_sidebar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("url",_url);
 //BA.debugLineNum = 406;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 407;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 195;BA.debugLine="Sub SetWidth(w As Object) As WixSideBar";
 //BA.debugLineNum = 196;BA.debugLine="SideBar.SetAttr(\"width\", w)";
_sidebar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("width",_w);
 //BA.debugLineNum = 197;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidebar)(this);
 //BA.debugLineNum = 198;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
