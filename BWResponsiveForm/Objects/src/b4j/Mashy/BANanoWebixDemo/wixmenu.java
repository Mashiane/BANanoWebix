package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixmenu extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixmenu", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixmenu.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _menu = null;
public anywheresoftware.b4a.objects.collections.Map _typeof = null;
public anywheresoftware.b4a.objects.collections.List _items = null;
public int _sepcount = 0;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public boolean _hascontent = false;
public com.ab.banano.BANano _banano = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public b4j.Mashy.BANanoWebixDemo.wixmenu  _additem(String _parentid,String _meid,String _mvalue,String _mhref,String _micon,String _badge,String _target) throws Exception{
anywheresoftware.b4a.objects.collections.Map _mitem = null;
 //BA.debugLineNum = 179;BA.debugLine="Sub AddItem(parentID As String, meID As String, mV";
 //BA.debugLineNum = 180;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 181;BA.debugLine="parentID = parentID.tolowercase";
_parentid = _parentid.toLowerCase();
 //BA.debugLineNum = 182;BA.debugLine="meID = meID.tolowercase";
_meid = _meid.toLowerCase();
 //BA.debugLineNum = 183;BA.debugLine="Dim mitem As Map = CreateMap()";
_mitem = new anywheresoftware.b4a.objects.collections.Map();
_mitem = __c.createMap(new Object[] {});
 //BA.debugLineNum = 184;BA.debugLine="mitem.Put(\"id\", meID)";
_mitem.Put((Object)("id"),(Object)(_meid));
 //BA.debugLineNum = 185;BA.debugLine="mitem.Put(\"value\", mValue)";
_mitem.Put((Object)("value"),(Object)(_mvalue));
 //BA.debugLineNum = 186;BA.debugLine="mitem.Put(\"href\", mhref)";
_mitem.Put((Object)("href"),(Object)(_mhref));
 //BA.debugLineNum = 187;BA.debugLine="mitem.Put(\"badge\", badge)";
_mitem.Put((Object)("badge"),(Object)(_badge));
 //BA.debugLineNum = 188;BA.debugLine="mitem.Put(\"target\", target)";
_mitem.Put((Object)("target"),(Object)(_target));
 //BA.debugLineNum = 189;BA.debugLine="mitem.Put(\"icon\", mIcon)";
_mitem.Put((Object)("icon"),(Object)(_micon));
 //BA.debugLineNum = 190;BA.debugLine="mitem.Put(\"parentid\", parentID)";
_mitem.Put((Object)("parentid"),(Object)(_parentid));
 //BA.debugLineNum = 191;BA.debugLine="Items.Add(mitem)";
_items.Add((Object)(_mitem.getObject()));
 //BA.debugLineNum = 192;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmenu)(this);
 //BA.debugLineNum = 193;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmenu  _addseparator(String _parentid) throws Exception{
String _meid = "";
anywheresoftware.b4a.objects.collections.Map _mitem = null;
 //BA.debugLineNum = 195;BA.debugLine="Sub AddSeparator(parentID As String) As WixMenu";
 //BA.debugLineNum = 196;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 197;BA.debugLine="parentID = parentID.tolowercase";
_parentid = _parentid.toLowerCase();
 //BA.debugLineNum = 198;BA.debugLine="sepCount = sepCount + 1";
_sepcount = (int) (_sepcount+1);
 //BA.debugLineNum = 199;BA.debugLine="sepCount = sepCount & \"\"";
_sepcount = (int)(Double.parseDouble(BA.NumberToString(_sepcount)+""));
 //BA.debugLineNum = 200;BA.debugLine="Dim meID As String = \"sep\" & sepCount";
_meid = "sep"+BA.NumberToString(_sepcount);
 //BA.debugLineNum = 201;BA.debugLine="Dim mItem As Map = CreateMap()";
_mitem = new anywheresoftware.b4a.objects.collections.Map();
_mitem = __c.createMap(new Object[] {});
 //BA.debugLineNum = 202;BA.debugLine="mItem.Put(\"id\", meID)";
_mitem.Put((Object)("id"),(Object)(_meid));
 //BA.debugLineNum = 203;BA.debugLine="mItem.Put(\"parentid\", parentID)";
_mitem.Put((Object)("parentid"),(Object)(_parentid));
 //BA.debugLineNum = 204;BA.debugLine="mItem.Put(\"$template\", \"Separator\")";
_mitem.Put((Object)("$template"),(Object)("Separator"));
 //BA.debugLineNum = 205;BA.debugLine="Items.Add(mItem)";
_items.Add((Object)(_mitem.getObject()));
 //BA.debugLineNum = 206;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmenu)(this);
 //BA.debugLineNum = 207;BA.debugLine="End Sub";
return null;
}
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 244;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 245;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 246;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 249;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 250;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 251;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.Mashy.BANanoWebixDemo.wixform _frm) throws Exception{
 //BA.debugLineNum = 210;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 211;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 212;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 239;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 240;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 241;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Menu As WixElement";
_menu = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private typeof As Map";
_typeof = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 6;BA.debugLine="Private Items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 7;BA.debugLine="Private sepCount As Int";
_sepcount = 0;
 //BA.debugLineNum = 8;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 9;BA.debugLine="Public HasContent As Boolean";
_hascontent = false;
 //BA.debugLineNum = 10;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixmenu  _initialize(anywheresoftware.b4a.BA _ba,String _iid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 51;BA.debugLine="Public Sub Initialize(iID As String) As WixMenu";
 //BA.debugLineNum = 52;BA.debugLine="ID = iID.tolowercase";
_id = _iid.toLowerCase();
 //BA.debugLineNum = 53;BA.debugLine="Menu.Initialize(iID).SetView(\"menu\")";
_menu._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_iid)._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("menu");
 //BA.debugLineNum = 54;BA.debugLine="typeof = CreateMap()";
_typeof = __c.createMap(new Object[] {});
 //BA.debugLineNum = 55;BA.debugLine="Items.Initialize";
_items.Initialize();
 //BA.debugLineNum = 56;BA.debugLine="sepCount = 0";
_sepcount = (int) (0);
 //BA.debugLineNum = 57;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 58;BA.debugLine="HasContent = False";
_hascontent = __c.False;
 //BA.debugLineNum = 59;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmenu)(this);
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
anywheresoftware.b4a.objects.collections.List _data = null;
 //BA.debugLineNum = 215;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 216;BA.debugLine="If Items.Size > 0 Then";
if (_items.getSize()>0) { 
 //BA.debugLineNum = 217;BA.debugLine="Dim data As List = modWebix.Unflatten(Items,\"sub";
_data = new anywheresoftware.b4a.objects.collections.List();
_data = _modwebix._unflatten /*anywheresoftware.b4a.objects.collections.List*/ (_items,"submenu");
 //BA.debugLineNum = 218;BA.debugLine="SetData(data)";
_setdata(_data);
 };
 //BA.debugLineNum = 220;BA.debugLine="Menu.SetAttr(\"type\", typeof)";
_menu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("type",(Object)(_typeof.getObject()));
 //BA.debugLineNum = 221;BA.debugLine="Return Menu.item";
if (true) return _menu._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 222;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmenu  _onitemclick(Object _module,String _methodname) throws Exception{
String _menuid = "";
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 271;BA.debugLine="Sub OnItemClick(module As Object, methodName As St";
 //BA.debugLineNum = 272;BA.debugLine="Dim menuID As String";
_menuid = "";
 //BA.debugLineNum = 273;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = (com.ab.banano.BANanoObject)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_menuid)})));
 //BA.debugLineNum = 274;BA.debugLine="Menu.OnItemClick(cb)";
_menu._onitemclick /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_cb);
 //BA.debugLineNum = 275;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmenu)(this);
 //BA.debugLineNum = 276;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 71;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixmenu  _setanimate(boolean _animate) throws Exception{
 //BA.debugLineNum = 253;BA.debugLine="Sub SetAnimate(animate As Boolean) As WixMenu";
 //BA.debugLineNum = 254;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 255;BA.debugLine="Menu.SetAttr(\"animate\", animate)";
_menu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("animate",(Object)(_animate));
 //BA.debugLineNum = 256;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmenu)(this);
 //BA.debugLineNum = 257;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmenu  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 14;BA.debugLine="Sub SetAttributes(m As Map) As WixMenu";
 //BA.debugLineNum = 15;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 16;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 17;BA.debugLine="Menu.SetAttr(k,v)";
_menu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 19;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmenu)(this);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmenu  _setautoheight(boolean _autoheight) throws Exception{
 //BA.debugLineNum = 259;BA.debugLine="Sub SetAutoheight(autoheight As Boolean) As WixMen";
 //BA.debugLineNum = 260;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 261;BA.debugLine="Menu.SetAttr(\"autoheight\", autoheight)";
_menu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("autoheight",(Object)(_autoheight));
 //BA.debugLineNum = 262;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmenu)(this);
 //BA.debugLineNum = 263;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmenu  _setautowidth(boolean _b) throws Exception{
 //BA.debugLineNum = 172;BA.debugLine="Sub SetAutoWidth(b As Boolean) As WixMenu";
 //BA.debugLineNum = 173;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 174;BA.debugLine="Menu.SetAttr(\"autowidth\", b)";
_menu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("autowidth",(Object)(_b));
 //BA.debugLineNum = 175;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmenu)(this);
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmenu  _setborderless(boolean _borderless) throws Exception{
 //BA.debugLineNum = 265;BA.debugLine="Sub SetBorderless(borderless As Boolean) As WixMen";
 //BA.debugLineNum = 266;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 267;BA.debugLine="Menu.SetAttr(\"borderless\", borderless)";
_menu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("borderless",(Object)(_borderless));
 //BA.debugLineNum = 268;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmenu)(this);
 //BA.debugLineNum = 269;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmenu  _setclick(Object _click) throws Exception{
 //BA.debugLineNum = 278;BA.debugLine="Sub SetClick(click As Object) As WixMenu";
 //BA.debugLineNum = 279;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 280;BA.debugLine="Menu.SetAttr(\"click\", click)";
_menu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("click",_click);
 //BA.debugLineNum = 281;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmenu)(this);
 //BA.debugLineNum = 282;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmenu  _setclipboard(Object _clipboard) throws Exception{
 //BA.debugLineNum = 284;BA.debugLine="Sub SetClipboard(clipboard As Object) As WixMenu";
 //BA.debugLineNum = 285;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 286;BA.debugLine="Menu.SetAttr(\"clipboard\", clipboard)";
_menu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("clipboard",_clipboard);
 //BA.debugLineNum = 287;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmenu)(this);
 //BA.debugLineNum = 288;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmenu  _setcontainer(Object _container) throws Exception{
 //BA.debugLineNum = 290;BA.debugLine="Sub SetContainer(container As Object) As WixMenu";
 //BA.debugLineNum = 291;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 292;BA.debugLine="Menu.SetAttr(\"container\", container)";
_menu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("container",_container);
 //BA.debugLineNum = 293;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmenu)(this);
 //BA.debugLineNum = 294;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmenu  _setcss(Object _css) throws Exception{
 //BA.debugLineNum = 296;BA.debugLine="Sub SetCss(css As Object) As WixMenu";
 //BA.debugLineNum = 297;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 298;BA.debugLine="Menu.SetAttr(\"css\", css)";
_menu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("css",_css);
 //BA.debugLineNum = 299;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmenu)(this);
 //BA.debugLineNum = 300;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmenu  _setdata(anywheresoftware.b4a.objects.collections.List _d) throws Exception{
 //BA.debugLineNum = 231;BA.debugLine="Sub SetData(d As List) As WixMenu";
 //BA.debugLineNum = 232;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 233;BA.debugLine="Menu.SetAttr(\"data\", d)";
_menu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("data",(Object)(_d.getObject()));
 //BA.debugLineNum = 234;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmenu)(this);
 //BA.debugLineNum = 235;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmenu  _setdatathrottle(Object _datathrottle) throws Exception{
 //BA.debugLineNum = 302;BA.debugLine="Sub SetDatathrottle(datathrottle As Object) As Wix";
 //BA.debugLineNum = 303;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 304;BA.debugLine="Menu.SetAttr(\"datathrottle\", datathrottle)";
_menu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("datathrottle",_datathrottle);
 //BA.debugLineNum = 305;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmenu)(this);
 //BA.debugLineNum = 306;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmenu  _setdisabled(boolean _disabled) throws Exception{
 //BA.debugLineNum = 308;BA.debugLine="Sub SetDisabled(disabled As Boolean) As WixMenu";
 //BA.debugLineNum = 309;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 310;BA.debugLine="Menu.SetAttr(\"disabled\", disabled)";
_menu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("disabled",(Object)(_disabled));
 //BA.debugLineNum = 311;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmenu)(this);
 //BA.debugLineNum = 312;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmenu  _setexternaldata(Object _externaldata) throws Exception{
 //BA.debugLineNum = 314;BA.debugLine="Sub SetExternalData(externalData As Object) As Wix";
 //BA.debugLineNum = 315;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 316;BA.debugLine="Menu.SetAttr(\"externalData\", externalData)";
_menu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("externalData",_externaldata);
 //BA.debugLineNum = 317;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmenu)(this);
 //BA.debugLineNum = 318;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmenu  _setgravity(Object _gravity) throws Exception{
 //BA.debugLineNum = 320;BA.debugLine="Sub SetGravity(gravity As Object) As WixMenu";
 //BA.debugLineNum = 321;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 322;BA.debugLine="Menu.SetAttr(\"gravity\", gravity)";
_menu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("gravity",_gravity);
 //BA.debugLineNum = 323;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmenu)(this);
 //BA.debugLineNum = 324;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmenu  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 151;BA.debugLine="Sub SetHeight(h As Object) As WixMenu";
 //BA.debugLineNum = 152;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 153;BA.debugLine="Menu.SetAttr(\"height\", h)";
_menu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("height",_h);
 //BA.debugLineNum = 154;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmenu)(this);
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmenu  _sethidden(boolean _hidden) throws Exception{
 //BA.debugLineNum = 326;BA.debugLine="Sub SetHidden(hidden As Boolean) As WixMenu";
 //BA.debugLineNum = 327;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 328;BA.debugLine="Menu.SetAttr(\"hidden\", hidden)";
_menu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hidden",(Object)(_hidden));
 //BA.debugLineNum = 329;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmenu)(this);
 //BA.debugLineNum = 330;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmenu  _setitemsubsign(boolean _b) throws Exception{
 //BA.debugLineNum = 137;BA.debugLine="Sub SetItemSubSign(b As Boolean) As WixMenu";
 //BA.debugLineNum = 138;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 139;BA.debugLine="typeof.Put(\"subsign\", b)";
_typeof.Put((Object)("subsign"),(Object)(_b));
 //BA.debugLineNum = 140;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmenu)(this);
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmenu  _setlayout(Object _layout) throws Exception{
 //BA.debugLineNum = 332;BA.debugLine="Sub SetLayout(layout As Object) As WixMenu";
 //BA.debugLineNum = 333;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 334;BA.debugLine="Menu.SetAttr(\"layout\", layout)";
_menu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("layout",_layout);
 //BA.debugLineNum = 335;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmenu)(this);
 //BA.debugLineNum = 336;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmenu  _setlayouty(String _r) throws Exception{
 //BA.debugLineNum = 165;BA.debugLine="Sub SetLayoutY(r As String) As WixMenu  'ignore";
 //BA.debugLineNum = 166;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 167;BA.debugLine="Menu.SetAttr(\"layout\", \"y\")";
_menu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("layout",(Object)("y"));
 //BA.debugLineNum = 168;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmenu)(this);
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmenu  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 75;BA.debugLine="Sub SetMap(m As Map) As WixMenu";
 //BA.debugLineNum = 76;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 77;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _m.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_strkey = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 78;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 79;BA.debugLine="Menu.SetAttr(strKey,	strVal)";
_menu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 81;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmenu)(this);
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmenu  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Sub SetMargin(margin As Object) As WixMenu";
 //BA.debugLineNum = 30;BA.debugLine="Menu.SetMargin(margin)";
_menu._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmenu)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmenu  _setmaxheight(Object _maxheight) throws Exception{
 //BA.debugLineNum = 338;BA.debugLine="Sub SetMaxHeight(maxHeight As Object) As WixMenu";
 //BA.debugLineNum = 339;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 340;BA.debugLine="Menu.SetAttr(\"maxHeight\", maxHeight)";
_menu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxHeight",_maxheight);
 //BA.debugLineNum = 341;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmenu)(this);
 //BA.debugLineNum = 342;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmenu  _setmaxwidth(Object _maxwidth) throws Exception{
 //BA.debugLineNum = 344;BA.debugLine="Sub SetMaxWidth(maxWidth As Object) As WixMenu";
 //BA.debugLineNum = 345;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 346;BA.debugLine="Menu.SetAttr(\"maxWidth\", maxWidth)";
_menu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxWidth",_maxwidth);
 //BA.debugLineNum = 347;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmenu)(this);
 //BA.debugLineNum = 348;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmenu  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Sub SetMinHeight(h As Int) As WixMenu";
 //BA.debugLineNum = 124;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 125;BA.debugLine="Menu.SetMinHeight(h)";
_menu._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 126;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmenu)(this);
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmenu  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 116;BA.debugLine="Sub SetMinWidth(w As Int) As WixMenu";
 //BA.debugLineNum = 117;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 118;BA.debugLine="Menu.SetMinWidth(w)";
_menu._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 119;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmenu)(this);
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmenu  _setmultiselect(boolean _multiselect) throws Exception{
 //BA.debugLineNum = 350;BA.debugLine="Sub SetMultiselect(multiselect As Boolean) As WixM";
 //BA.debugLineNum = 351;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 352;BA.debugLine="Menu.SetAttr(\"multiselect\", multiselect)";
_menu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("multiselect",(Object)(_multiselect));
 //BA.debugLineNum = 353;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmenu)(this);
 //BA.debugLineNum = 354;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmenu  _setname(String _n) throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Sub SetName(n As String) As WixMenu";
 //BA.debugLineNum = 95;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 96;BA.debugLine="Menu.SetName(n)";
_menu._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 97;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmenu)(this);
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmenu  _setnavigation(boolean _navigation) throws Exception{
 //BA.debugLineNum = 356;BA.debugLine="Sub SetNavigation(navigation As Boolean) As WixMen";
 //BA.debugLineNum = 357;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 358;BA.debugLine="Menu.SetAttr(\"navigation\", navigation)";
_menu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("navigation",(Object)(_navigation));
 //BA.debugLineNum = 359;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmenu)(this);
 //BA.debugLineNum = 360;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmenu  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Sub SetPadding(padding As Object) As WixMenu";
 //BA.debugLineNum = 24;BA.debugLine="Menu.SetPadding(padding)";
_menu._setpadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 25;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmenu)(this);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmenu  _setpager(Object _pager) throws Exception{
 //BA.debugLineNum = 362;BA.debugLine="Sub SetPager(pager As Object) As WixMenu";
 //BA.debugLineNum = 363;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 364;BA.debugLine="Menu.SetAttr(\"pager\", pager)";
_menu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("pager",_pager);
 //BA.debugLineNum = 365;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmenu)(this);
 //BA.debugLineNum = 366;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmenu  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Sub SetParent(p As WixElement) As WixMenu";
 //BA.debugLineNum = 64;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 65;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 66;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmenu)(this);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmenu  _setready(Object _ready) throws Exception{
 //BA.debugLineNum = 368;BA.debugLine="Sub SetReady(ready As Object) As WixMenu";
 //BA.debugLineNum = 369;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 370;BA.debugLine="Menu.SetAttr(\"ready\", ready)";
_menu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("ready",_ready);
 //BA.debugLineNum = 371;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmenu)(this);
 //BA.debugLineNum = 372;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmenu  _setremovemissed(boolean _removemissed) throws Exception{
 //BA.debugLineNum = 374;BA.debugLine="Sub SetRemoveMissed(removeMissed As Boolean) As Wi";
 //BA.debugLineNum = 375;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 376;BA.debugLine="Menu.SetAttr(\"removeMissed\", removeMissed)";
_menu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("removeMissed",(Object)(_removemissed));
 //BA.debugLineNum = 377;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmenu)(this);
 //BA.debugLineNum = 378;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmenu  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Sub SetResponsive(b As Object) As WixMenu";
 //BA.debugLineNum = 102;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 103;BA.debugLine="Menu.SetResponsive(b)";
_menu._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 104;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmenu)(this);
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmenu  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixMenu";
 //BA.debugLineNum = 109;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 110;BA.debugLine="Menu.SetResponsiveCell(b)";
_menu._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 111;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmenu)(this);
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmenu  _setsave(Object _save) throws Exception{
 //BA.debugLineNum = 380;BA.debugLine="Sub SetSave(save As Object) As WixMenu";
 //BA.debugLineNum = 381;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 382;BA.debugLine="Menu.SetAttr(\"save\", save)";
_menu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("save",_save);
 //BA.debugLineNum = 383;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmenu)(this);
 //BA.debugLineNum = 384;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmenu  _setscheme(Object _scheme) throws Exception{
 //BA.debugLineNum = 386;BA.debugLine="Sub SetScheme(scheme As Object) As WixMenu";
 //BA.debugLineNum = 387;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 388;BA.debugLine="Menu.SetAttr(\"scheme\", scheme)";
_menu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("scheme",_scheme);
 //BA.debugLineNum = 389;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmenu)(this);
 //BA.debugLineNum = 390;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmenu  _setscroll(Object _scroll) throws Exception{
 //BA.debugLineNum = 398;BA.debugLine="Sub SetScroll(scroll As Object) As WixMenu";
 //BA.debugLineNum = 399;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 400;BA.debugLine="Menu.SetAttr(\"scroll\", scroll)";
_menu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("scroll",_scroll);
 //BA.debugLineNum = 401;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmenu)(this);
 //BA.debugLineNum = 402;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmenu  _setscrollspeed(Object _scrollspeed) throws Exception{
 //BA.debugLineNum = 392;BA.debugLine="Sub SetScrollSpeed(scrollSpeed As Object) As WixMe";
 //BA.debugLineNum = 393;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 394;BA.debugLine="Menu.SetAttr(\"scrollSpeed\", scrollSpeed)";
_menu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("scrollSpeed",_scrollspeed);
 //BA.debugLineNum = 395;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmenu)(this);
 //BA.debugLineNum = 396;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmenu  _setselect(Object _b) throws Exception{
 //BA.debugLineNum = 225;BA.debugLine="Sub SetSelect(b As Object) As WixMenu";
 //BA.debugLineNum = 226;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 227;BA.debugLine="Menu.SetAttr(\"select\", b)";
_menu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("select",_b);
 //BA.debugLineNum = 228;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmenu)(this);
 //BA.debugLineNum = 229;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmenu  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 44;BA.debugLine="Menu.SetStyle(prop,sval)";
_menu._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 45;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 46;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmenu)(this);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmenu  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 34;BA.debugLine="Sub SetStyles(m As Map) As WixMenu";
 //BA.debugLineNum = 35;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 36;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 37;BA.debugLine="Menu.SetStyle(k,v)";
_menu._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 39;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmenu)(this);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmenu  _setsubmenuconfig(Object _submenuconfig) throws Exception{
 //BA.debugLineNum = 411;BA.debugLine="Sub SetSubmenuConfig(submenuConfig As Object) As W";
 //BA.debugLineNum = 412;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 413;BA.debugLine="Menu.SetAttr(\"submenuConfig\", submenuConfig)";
_menu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("submenuConfig",_submenuconfig);
 //BA.debugLineNum = 414;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmenu)(this);
 //BA.debugLineNum = 415;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmenu  _setsubmenupos(Object _submenupos) throws Exception{
 //BA.debugLineNum = 405;BA.debugLine="Sub SetSubMenuPos(subMenuPos As Object) As WixMenu";
 //BA.debugLineNum = 406;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 407;BA.debugLine="Menu.SetAttr(\"subMenuPos\", subMenuPos)";
_menu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("subMenuPos",_submenupos);
 //BA.debugLineNum = 408;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmenu)(this);
 //BA.debugLineNum = 409;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmenu  _setsubmenuposright(String _r) throws Exception{
 //BA.debugLineNum = 130;BA.debugLine="Sub SetSubMenuPosRight(r As String) As WixMenu   '";
 //BA.debugLineNum = 131;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 132;BA.debugLine="Menu.SetAttr(\"subMenuPos\", \"right\")";
_menu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("subMenuPos",(Object)("right"));
 //BA.debugLineNum = 133;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmenu)(this);
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmenu  _settemplate(Object _template) throws Exception{
 //BA.debugLineNum = 417;BA.debugLine="Sub SetTemplate(template As Object) As WixMenu";
 //BA.debugLineNum = 418;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 419;BA.debugLine="Menu.SetAttr(\"template\", template)";
_menu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("template",_template);
 //BA.debugLineNum = 420;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmenu)(this);
 //BA.debugLineNum = 421;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmenu  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 85;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixMenu";
 //BA.debugLineNum = 86;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 87;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 88;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 89;BA.debugLine="Menu.SetTemplate(os)";
_menu._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 90;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmenu)(this);
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmenu  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 144;BA.debugLine="Sub SetTooltip(tt As String) As WixMenu";
 //BA.debugLineNum = 145;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 146;BA.debugLine="Menu.SetTooltip(tt)";
_menu._settooltip /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_tt);
 //BA.debugLineNum = 147;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmenu)(this);
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmenu  _settype(boolean _stype) throws Exception{
 //BA.debugLineNum = 423;BA.debugLine="Sub SetType(sType As Boolean) As WixMenu";
 //BA.debugLineNum = 424;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 425;BA.debugLine="Menu.SetAttr(\"type\", sType)";
_menu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("type",(Object)(_stype));
 //BA.debugLineNum = 426;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmenu)(this);
 //BA.debugLineNum = 427;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmenu  _seturl(Object _url) throws Exception{
 //BA.debugLineNum = 429;BA.debugLine="Sub SetUrl(url As Object) As WixMenu";
 //BA.debugLineNum = 430;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 431;BA.debugLine="Menu.SetAttr(\"url\", url)";
_menu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("url",_url);
 //BA.debugLineNum = 432;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmenu)(this);
 //BA.debugLineNum = 433;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmenu  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 158;BA.debugLine="Sub SetWidth(w As Object) As WixMenu";
 //BA.debugLineNum = 159;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 160;BA.debugLine="Menu.SetAttr(\"width\", w)";
_menu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("width",_w);
 //BA.debugLineNum = 161;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmenu)(this);
 //BA.debugLineNum = 162;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmenu  _setxcount(Object _xcount) throws Exception{
 //BA.debugLineNum = 435;BA.debugLine="Sub SetXCount(xCount As Object) As WixMenu";
 //BA.debugLineNum = 436;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 437;BA.debugLine="Menu.SetAttr(\"xCount\", xCount)";
_menu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("xCount",_xcount);
 //BA.debugLineNum = 438;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmenu)(this);
 //BA.debugLineNum = 439;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmenu  _setycount(Object _ycount) throws Exception{
 //BA.debugLineNum = 441;BA.debugLine="Sub SetYCount(yCount As Object) As WixMenu";
 //BA.debugLineNum = 442;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 443;BA.debugLine="Menu.SetAttr(\"yCount\", yCount)";
_menu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("yCount",_ycount);
 //BA.debugLineNum = 444;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmenu)(this);
 //BA.debugLineNum = 445;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
