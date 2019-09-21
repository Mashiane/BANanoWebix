package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixsidemenu extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixsidemenu", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixsidemenu.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _sidemenu = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _body = null;
public anywheresoftware.b4a.objects.collections.List _items = null;
public anywheresoftware.b4a.objects.collections.Map _typeof = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public b4j.Mashy.BANanoWebixDemo.wixsidemenu  _additem(String _meid,String _mvalue,String _mhref,String _micon,String _badge,String _target) throws Exception{
anywheresoftware.b4a.objects.collections.Map _mitem = null;
 //BA.debugLineNum = 59;BA.debugLine="Sub AddItem(meID As String, mValue As String, mhre";
 //BA.debugLineNum = 60;BA.debugLine="meID = meID.tolowercase";
_meid = _meid.toLowerCase();
 //BA.debugLineNum = 61;BA.debugLine="Dim mitem As Map = CreateMap()";
_mitem = new anywheresoftware.b4a.objects.collections.Map();
_mitem = __c.createMap(new Object[] {});
 //BA.debugLineNum = 62;BA.debugLine="mitem.Put(\"id\", meID)";
_mitem.Put((Object)("id"),(Object)(_meid));
 //BA.debugLineNum = 63;BA.debugLine="mitem.Put(\"value\", mValue)";
_mitem.Put((Object)("value"),(Object)(_mvalue));
 //BA.debugLineNum = 64;BA.debugLine="mitem.Put(\"href\", mhref)";
_mitem.Put((Object)("href"),(Object)(_mhref));
 //BA.debugLineNum = 65;BA.debugLine="mitem.Put(\"badge\", badge)";
_mitem.Put((Object)("badge"),(Object)(_badge));
 //BA.debugLineNum = 66;BA.debugLine="mitem.Put(\"target\", target)";
_mitem.Put((Object)("target"),(Object)(_target));
 //BA.debugLineNum = 67;BA.debugLine="mitem.Put(\"icon\", mIcon)";
_mitem.Put((Object)("icon"),(Object)(_micon));
 //BA.debugLineNum = 68;BA.debugLine="Items.Add(mitem)";
_items.Add((Object)(_mitem.getObject()));
 //BA.debugLineNum = 69;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidemenu)(this);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return null;
}
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 231;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 232;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 233;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 236;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 237;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 238;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 226;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 227;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 228;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public SideMenu As WixElement";
_sidemenu = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private body As WixElement";
_body = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 6;BA.debugLine="Public Items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 7;BA.debugLine="Private typeOf As Map";
_typeof = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 8;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _createitem(String _i) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixelement _ii = null;
 //BA.debugLineNum = 72;BA.debugLine="Sub CreateItem(i As String) As WixElement";
 //BA.debugLineNum = 73;BA.debugLine="Dim ii As WixElement";
_ii = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 74;BA.debugLine="ii.Initialize(i)";
_ii._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_i);
 //BA.debugLineNum = 75;BA.debugLine="Return ii";
if (true) return _ii;
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidemenu  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize(sid As String) As WixSideMen";
 //BA.debugLineNum = 14;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 15;BA.debugLine="SideMenu.Initialize(sid).SetView(\"sidemenu\")";
_sidemenu._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_sid)._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("sidemenu");
 //BA.debugLineNum = 16;BA.debugLine="body.Initialize(ID & \"body\").SetView(\"list\").SetB";
_body._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_id+"body")._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("list")._setborderless /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (__c.True)._setscroll /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(__c.False))._setselect /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (__c.True);
 //BA.debugLineNum = 17;BA.debugLine="Items.Initialize";
_items.Initialize();
 //BA.debugLineNum = 18;BA.debugLine="typeOf.Initialize";
_typeof.Initialize();
 //BA.debugLineNum = 19;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 20;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidemenu)(this);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 134;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 135;BA.debugLine="body.SetAttr(\"type\", typeOf)";
_body._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("type",(Object)(_typeof.getObject()));
 //BA.debugLineNum = 136;BA.debugLine="If Items.Size > 0 Then body.SetData(Items)";
if (_items.getSize()>0) { 
_body._setdata /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_items);};
 //BA.debugLineNum = 137;BA.debugLine="SideMenu.SetAttr(\"body\", body.item)";
_sidemenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("body",(Object)(_body._item /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 138;BA.debugLine="Return SideMenu.item";
if (true) return _sidemenu._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 55;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixsidemenu  _setanimate(boolean _animate) throws Exception{
 //BA.debugLineNum = 241;BA.debugLine="Sub SetAnimate(animate As Boolean) As WixSideMenu";
 //BA.debugLineNum = 242;BA.debugLine="SideMenu.SetAttr(\"animate\", animate)";
_sidemenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("animate",(Object)(_animate));
 //BA.debugLineNum = 243;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidemenu)(this);
 //BA.debugLineNum = 244;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidemenu  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 23;BA.debugLine="Sub SetAttributes(m As Map) As WixSideMenu";
 //BA.debugLineNum = 24;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 25;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 26;BA.debugLine="SideMenu.SetAttr(k,v)";
_sidemenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 28;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidemenu)(this);
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidemenu  _setautofit(boolean _autofit) throws Exception{
 //BA.debugLineNum = 246;BA.debugLine="Sub SetAutofit(autofit As Boolean) As WixSideMenu";
 //BA.debugLineNum = 247;BA.debugLine="SideMenu.SetAttr(\"autofit\", autofit)";
_sidemenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("autofit",(Object)(_autofit));
 //BA.debugLineNum = 248;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidemenu)(this);
 //BA.debugLineNum = 249;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidemenu  _setautofocus(boolean _autofocus) throws Exception{
 //BA.debugLineNum = 251;BA.debugLine="Sub SetAutofocus(autofocus As Boolean) As WixSideM";
 //BA.debugLineNum = 252;BA.debugLine="SideMenu.SetAttr(\"autofocus\", autofocus)";
_sidemenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("autofocus",(Object)(_autofocus));
 //BA.debugLineNum = 253;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidemenu)(this);
 //BA.debugLineNum = 254;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidemenu  _setbody(Object _xbody) throws Exception{
 //BA.debugLineNum = 256;BA.debugLine="Sub SetBody(xbody As Object) As WixSideMenu";
 //BA.debugLineNum = 257;BA.debugLine="SideMenu.SetAttr(\"body\", xbody)";
_sidemenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("body",_xbody);
 //BA.debugLineNum = 258;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidemenu)(this);
 //BA.debugLineNum = 259;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidemenu  _setborderless(boolean _borderless) throws Exception{
 //BA.debugLineNum = 261;BA.debugLine="Sub SetBorderless(borderless As Boolean) As WixSid";
 //BA.debugLineNum = 262;BA.debugLine="SideMenu.SetAttr(\"borderless\", borderless)";
_sidemenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("borderless",(Object)(_borderless));
 //BA.debugLineNum = 263;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidemenu)(this);
 //BA.debugLineNum = 264;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidemenu  _setcontainer(Object _container) throws Exception{
 //BA.debugLineNum = 266;BA.debugLine="Sub SetContainer(container As Object) As WixSideMe";
 //BA.debugLineNum = 267;BA.debugLine="SideMenu.SetAttr(\"container\", container)";
_sidemenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("container",_container);
 //BA.debugLineNum = 268;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidemenu)(this);
 //BA.debugLineNum = 269;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidemenu  _setcss(Object _css) throws Exception{
 //BA.debugLineNum = 271;BA.debugLine="Sub SetCss(css As Object) As WixSideMenu";
 //BA.debugLineNum = 272;BA.debugLine="SideMenu.SetAttr(\"css\", css)";
_sidemenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("css",_css);
 //BA.debugLineNum = 273;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidemenu)(this);
 //BA.debugLineNum = 274;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidemenu  _setdata(anywheresoftware.b4a.objects.collections.List _data) throws Exception{
 //BA.debugLineNum = 141;BA.debugLine="Sub SetData(data As List) As WixSideMenu";
 //BA.debugLineNum = 142;BA.debugLine="body.SetData(data)";
_body._setdata /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_data);
 //BA.debugLineNum = 143;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidemenu)(this);
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidemenu  _setdisabled(boolean _disabled) throws Exception{
 //BA.debugLineNum = 276;BA.debugLine="Sub SetDisabled(disabled As Boolean) As WixSideMen";
 //BA.debugLineNum = 277;BA.debugLine="SideMenu.SetAttr(\"disabled\", disabled)";
_sidemenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("disabled",(Object)(_disabled));
 //BA.debugLineNum = 278;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidemenu)(this);
 //BA.debugLineNum = 279;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidemenu  _setgravity(Object _gravity) throws Exception{
 //BA.debugLineNum = 281;BA.debugLine="Sub SetGravity(gravity As Object) As WixSideMenu";
 //BA.debugLineNum = 282;BA.debugLine="SideMenu.SetAttr(\"gravity\", gravity)";
_sidemenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("gravity",_gravity);
 //BA.debugLineNum = 283;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidemenu)(this);
 //BA.debugLineNum = 284;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidemenu  _sethead(Object _head) throws Exception{
 //BA.debugLineNum = 286;BA.debugLine="Sub SetHead(head As Object) As WixSideMenu";
 //BA.debugLineNum = 287;BA.debugLine="SideMenu.SetAttr(\"head\", head)";
_sidemenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("head",_head);
 //BA.debugLineNum = 288;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidemenu)(this);
 //BA.debugLineNum = 289;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidemenu  _setheadheight(Object _headheight) throws Exception{
 //BA.debugLineNum = 291;BA.debugLine="Sub SetHeadHeight(headHeight As Object) As WixSide";
 //BA.debugLineNum = 292;BA.debugLine="SideMenu.SetAttr(\"headHeight\", headHeight)";
_sidemenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("headHeight",_headheight);
 //BA.debugLineNum = 293;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidemenu)(this);
 //BA.debugLineNum = 294;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidemenu  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 154;BA.debugLine="Sub SetHeight(h As Object) As WixSideMenu";
 //BA.debugLineNum = 155;BA.debugLine="SideMenu.SetAttr(\"height\", h)";
_sidemenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("height",_h);
 //BA.debugLineNum = 156;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidemenu)(this);
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidemenu  _setitemheight(int _h) throws Exception{
 //BA.debugLineNum = 161;BA.debugLine="Sub SetItemHeight(h As Int) As WixSideMenu";
 //BA.debugLineNum = 162;BA.debugLine="typeOf.Put(\"height\", h)";
_typeof.Put((Object)("height"),(Object)(_h));
 //BA.debugLineNum = 163;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidemenu)(this);
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidemenu  _setitemwidth(int _w) throws Exception{
 //BA.debugLineNum = 167;BA.debugLine="Sub SetItemWidth(w As Int) As WixSideMenu";
 //BA.debugLineNum = 168;BA.debugLine="typeOf.Put(\"width\", w)";
_typeof.Put((Object)("width"),(Object)(_w));
 //BA.debugLineNum = 169;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidemenu)(this);
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidemenu  _setlayoutx(boolean _h) throws Exception{
 //BA.debugLineNum = 174;BA.debugLine="Sub SetLayoutX(h As Boolean) As WixSideMenu   'ign";
 //BA.debugLineNum = 175;BA.debugLine="body.SetAttr(\"layout\", \"x\")";
_body._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("layout",(Object)("x"));
 //BA.debugLineNum = 176;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidemenu)(this);
 //BA.debugLineNum = 177;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidemenu  _setleft(Object _left) throws Exception{
 //BA.debugLineNum = 296;BA.debugLine="Sub SetLeft(left As Object) As WixSideMenu";
 //BA.debugLineNum = 297;BA.debugLine="SideMenu.SetAttr(\"left\", left)";
_sidemenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("left",_left);
 //BA.debugLineNum = 298;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidemenu)(this);
 //BA.debugLineNum = 299;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidemenu  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 117;BA.debugLine="Sub SetMap(m As Map) As WixSideMenu";
 //BA.debugLineNum = 118;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 119;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 120;BA.debugLine="SideMenu.SetAttr(strKey,	strVal)";
_sidemenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 122;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidemenu)(this);
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidemenu  _setmaster(Object _master) throws Exception{
 //BA.debugLineNum = 301;BA.debugLine="Sub SetMaster(master As Object) As WixSideMenu";
 //BA.debugLineNum = 302;BA.debugLine="SideMenu.SetAttr(\"master\", master)";
_sidemenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("master",_master);
 //BA.debugLineNum = 303;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidemenu)(this);
 //BA.debugLineNum = 304;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidemenu  _setmaxheight(Object _maxheight) throws Exception{
 //BA.debugLineNum = 306;BA.debugLine="Sub SetMaxHeight(maxHeight As Object) As WixSideMe";
 //BA.debugLineNum = 307;BA.debugLine="SideMenu.SetAttr(\"maxHeight\", maxHeight)";
_sidemenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxHeight",_maxheight);
 //BA.debugLineNum = 308;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidemenu)(this);
 //BA.debugLineNum = 309;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidemenu  _setmaxwidth(Object _maxwidth) throws Exception{
 //BA.debugLineNum = 311;BA.debugLine="Sub SetMaxWidth(maxWidth As Object) As WixSideMenu";
 //BA.debugLineNum = 312;BA.debugLine="SideMenu.SetAttr(\"maxWidth\", maxWidth)";
_sidemenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxWidth",_maxwidth);
 //BA.debugLineNum = 313;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidemenu)(this);
 //BA.debugLineNum = 314;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidemenu  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 111;BA.debugLine="Sub SetMinHeight(h As Int) As WixSideMenu";
 //BA.debugLineNum = 112;BA.debugLine="SideMenu.SetMinHeight(h)";
_sidemenu._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 113;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidemenu)(this);
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidemenu  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 105;BA.debugLine="Sub SetMinWidth(w As Int) As WixSideMenu";
 //BA.debugLineNum = 106;BA.debugLine="SideMenu.SetMinWidth(w)";
_sidemenu._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 107;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidemenu)(this);
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidemenu  _setmodal(boolean _modal) throws Exception{
 //BA.debugLineNum = 317;BA.debugLine="Sub SetModal(modal As Boolean) As WixSideMenu";
 //BA.debugLineNum = 318;BA.debugLine="SideMenu.SetAttr(\"modal\", modal)";
_sidemenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("modal",(Object)(_modal));
 //BA.debugLineNum = 319;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidemenu)(this);
 //BA.debugLineNum = 320;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidemenu  _setmove(boolean _move) throws Exception{
 //BA.debugLineNum = 322;BA.debugLine="Sub SetMove(move As Boolean) As WixSideMenu";
 //BA.debugLineNum = 323;BA.debugLine="SideMenu.SetAttr(\"move\", move)";
_sidemenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("move",(Object)(_move));
 //BA.debugLineNum = 324;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidemenu)(this);
 //BA.debugLineNum = 325;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidemenu  _setname(String _n) throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Sub SetName(n As String) As WixSideMenu";
 //BA.debugLineNum = 87;BA.debugLine="SideMenu.SetName(n)";
_sidemenu._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 88;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidemenu)(this);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidemenu  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 327;BA.debugLine="Sub SetPadding(padding As Object) As WixSideMenu";
 //BA.debugLineNum = 328;BA.debugLine="SideMenu.SetAttr(\"padding\", padding)";
_sidemenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("padding",_padding);
 //BA.debugLineNum = 329;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidemenu)(this);
 //BA.debugLineNum = 330;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidemenu  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub SetParent(p As WixElement) As WixSideMenu";
 //BA.debugLineNum = 48;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidemenu)(this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidemenu  _setpoint(boolean _point) throws Exception{
 //BA.debugLineNum = 332;BA.debugLine="Sub SetPoint(point As Boolean) As WixSideMenu";
 //BA.debugLineNum = 333;BA.debugLine="SideMenu.SetAttr(\"point\", point)";
_sidemenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("point",(Object)(_point));
 //BA.debugLineNum = 334;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidemenu)(this);
 //BA.debugLineNum = 335;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidemenu  _setposition(String _c) throws Exception{
 //BA.debugLineNum = 219;BA.debugLine="Sub SetPosition(c As String) As WixSideMenu";
 //BA.debugLineNum = 220;BA.debugLine="SideMenu.SetAttr(\"position\", c)";
_sidemenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("position",(Object)(_c));
 //BA.debugLineNum = 221;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidemenu)(this);
 //BA.debugLineNum = 222;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidemenu  _setpositionbottom(String _c) throws Exception{
 //BA.debugLineNum = 212;BA.debugLine="Sub SetPositionBottom(c As String) As WixSideMenu";
 //BA.debugLineNum = 213;BA.debugLine="SideMenu.SetAttr(\"position\", \"bottom\")";
_sidemenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("position",(Object)("bottom"));
 //BA.debugLineNum = 214;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidemenu)(this);
 //BA.debugLineNum = 215;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidemenu  _setpositionleft(String _c) throws Exception{
 //BA.debugLineNum = 200;BA.debugLine="Sub SetPositionLeft(c As String) As WixSideMenu  '";
 //BA.debugLineNum = 201;BA.debugLine="SideMenu.SetAttr(\"position\", \"left\")";
_sidemenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("position",(Object)("left"));
 //BA.debugLineNum = 202;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidemenu)(this);
 //BA.debugLineNum = 203;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidemenu  _setpositionright(String _c) throws Exception{
 //BA.debugLineNum = 194;BA.debugLine="Sub SetPositionRight(c As String) As WixSideMenu";
 //BA.debugLineNum = 195;BA.debugLine="SideMenu.SetAttr(\"position\", \"right\")";
_sidemenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("position",(Object)("right"));
 //BA.debugLineNum = 196;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidemenu)(this);
 //BA.debugLineNum = 197;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidemenu  _setpositiontop(String _c) throws Exception{
 //BA.debugLineNum = 206;BA.debugLine="Sub SetPositionTop(c As String) As WixSideMenu  'i";
 //BA.debugLineNum = 207;BA.debugLine="SideMenu.SetAttr(\"position\", \"top\")";
_sidemenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("position",(Object)("top"));
 //BA.debugLineNum = 208;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidemenu)(this);
 //BA.debugLineNum = 209;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidemenu  _setrelative(Object _relative) throws Exception{
 //BA.debugLineNum = 337;BA.debugLine="Sub SetRelative(relative As Object) As WixSideMenu";
 //BA.debugLineNum = 338;BA.debugLine="SideMenu.SetAttr(\"relative\", relative)";
_sidemenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("relative",_relative);
 //BA.debugLineNum = 339;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidemenu)(this);
 //BA.debugLineNum = 340;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidemenu  _setresize(boolean _resize) throws Exception{
 //BA.debugLineNum = 342;BA.debugLine="Sub SetResize(resize As Boolean) As WixSideMenu";
 //BA.debugLineNum = 343;BA.debugLine="SideMenu.SetAttr(\"resize\", resize)";
_sidemenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("resize",(Object)(_resize));
 //BA.debugLineNum = 344;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidemenu)(this);
 //BA.debugLineNum = 345;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidemenu  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Sub SetResponsive(b As Object) As WixSideMenu";
 //BA.debugLineNum = 93;BA.debugLine="SideMenu.SetResponsive(b)";
_sidemenu._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 94;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidemenu)(this);
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidemenu  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixSideMenu";
 //BA.debugLineNum = 99;BA.debugLine="SideMenu.SetResponsiveCell(b)";
_sidemenu._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 100;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidemenu)(this);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidemenu  _setscroll(Object _b) throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Sub SetScroll(b As Object) As WixSideMenu";
 //BA.debugLineNum = 129;BA.debugLine="SideMenu.SetAttr(\"scroll\", b)";
_sidemenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("scroll",_b);
 //BA.debugLineNum = 130;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidemenu)(this);
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidemenu  _setselect(Object _s) throws Exception{
 //BA.debugLineNum = 188;BA.debugLine="Sub SetSelect(s As Object) As WixSideMenu";
 //BA.debugLineNum = 189;BA.debugLine="SideMenu.SetAttr(\"select\", s)";
_sidemenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("select",_s);
 //BA.debugLineNum = 190;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidemenu)(this);
 //BA.debugLineNum = 191;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidemenu  _setstate(Object _state) throws Exception{
 //BA.debugLineNum = 347;BA.debugLine="Sub SetState(state As Object) As WixSideMenu";
 //BA.debugLineNum = 348;BA.debugLine="SideMenu.SetAttr(\"state\", state)";
_sidemenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("state",_state);
 //BA.debugLineNum = 349;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidemenu)(this);
 //BA.debugLineNum = 350;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidemenu  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 41;BA.debugLine="SideMenu.SetStyle(prop,sval)";
_sidemenu._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 42;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidemenu)(this);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidemenu  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 31;BA.debugLine="Sub SetStyles(m As Map) As WixSideMenu";
 //BA.debugLineNum = 32;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 33;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 34;BA.debugLine="SideMenu.SetStyle(k,v)";
_sidemenu._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidemenu)(this);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidemenu  _settemplate(String _t) throws Exception{
 //BA.debugLineNum = 147;BA.debugLine="Sub SetTemplate(t As String) As WixSideMenu";
 //BA.debugLineNum = 148;BA.debugLine="body.SetTemplate(t)";
_body._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_t));
 //BA.debugLineNum = 149;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidemenu)(this);
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidemenu  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 78;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixSideMen";
 //BA.debugLineNum = 79;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 80;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 81;BA.debugLine="SideMenu.SetTemplate(os)";
_sidemenu._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 82;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidemenu)(this);
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidemenu  _settofront(boolean _tofront) throws Exception{
 //BA.debugLineNum = 352;BA.debugLine="Sub SetToFront(toFront As Boolean) As WixSideMenu";
 //BA.debugLineNum = 353;BA.debugLine="SideMenu.SetAttr(\"toFront\", toFront)";
_sidemenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("toFront",(Object)(_tofront));
 //BA.debugLineNum = 354;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidemenu)(this);
 //BA.debugLineNum = 355;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidemenu  _settop(Object _top) throws Exception{
 //BA.debugLineNum = 357;BA.debugLine="Sub SetTop(top As Object) As WixSideMenu";
 //BA.debugLineNum = 358;BA.debugLine="SideMenu.SetAttr(\"top\", top)";
_sidemenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("top",_top);
 //BA.debugLineNum = 359;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidemenu)(this);
 //BA.debugLineNum = 360;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidemenu  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 181;BA.debugLine="Sub SetWidth(w As Object) As WixSideMenu";
 //BA.debugLineNum = 182;BA.debugLine="SideMenu.SetAttr(\"width\", w)";
_sidemenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("width",_w);
 //BA.debugLineNum = 183;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidemenu)(this);
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidemenu  _setzindex(Object _zindex) throws Exception{
 //BA.debugLineNum = 362;BA.debugLine="Sub SetZIndex(zIndex As Object) As WixSideMenu";
 //BA.debugLineNum = 363;BA.debugLine="SideMenu.SetAttr(\"zIndex\", zIndex)";
_sidemenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("zIndex",_zindex);
 //BA.debugLineNum = 364;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsidemenu)(this);
 //BA.debugLineNum = 365;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
