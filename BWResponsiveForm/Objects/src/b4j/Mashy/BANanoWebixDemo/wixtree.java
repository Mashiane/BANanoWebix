package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixtree extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixtree", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixtree.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _tree = null;
public anywheresoftware.b4a.objects.collections.Map _scheme = null;
public anywheresoftware.b4a.objects.collections.List _items = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public b4j.Mashy.BANanoWebixDemo.wixtree  _additem(String _parentid,String _meid,String _mvalue,String _mhref,String _micon,String _badge,String _target,boolean _mopen) throws Exception{
anywheresoftware.b4a.objects.collections.Map _mitem = null;
 //BA.debugLineNum = 193;BA.debugLine="Sub AddItem(parentID As String, meID As String, mV";
 //BA.debugLineNum = 194;BA.debugLine="parentID = parentID.tolowercase";
_parentid = _parentid.toLowerCase();
 //BA.debugLineNum = 195;BA.debugLine="meID = meID.tolowercase";
_meid = _meid.toLowerCase();
 //BA.debugLineNum = 196;BA.debugLine="Dim mitem As Map = CreateMap()";
_mitem = new anywheresoftware.b4a.objects.collections.Map();
_mitem = __c.createMap(new Object[] {});
 //BA.debugLineNum = 197;BA.debugLine="mitem.Put(\"id\", meID)";
_mitem.Put((Object)("id"),(Object)(_meid));
 //BA.debugLineNum = 198;BA.debugLine="mitem.Put(\"value\", mValue)";
_mitem.Put((Object)("value"),(Object)(_mvalue));
 //BA.debugLineNum = 199;BA.debugLine="mitem.Put(\"href\", mhref)";
_mitem.Put((Object)("href"),(Object)(_mhref));
 //BA.debugLineNum = 200;BA.debugLine="mitem.Put(\"badge\", badge)";
_mitem.Put((Object)("badge"),(Object)(_badge));
 //BA.debugLineNum = 201;BA.debugLine="mitem.Put(\"target\", target)";
_mitem.Put((Object)("target"),(Object)(_target));
 //BA.debugLineNum = 202;BA.debugLine="mitem.Put(\"icon\", mIcon)";
_mitem.Put((Object)("icon"),(Object)(_micon));
 //BA.debugLineNum = 203;BA.debugLine="mitem.Put(\"open\", mOpen)";
_mitem.Put((Object)("open"),(Object)(_mopen));
 //BA.debugLineNum = 204;BA.debugLine="mitem.Put(\"parentid\", parentID)";
_mitem.Put((Object)("parentid"),(Object)(_parentid));
 //BA.debugLineNum = 205;BA.debugLine="Items.Add(mitem)";
_items.Add((Object)(_mitem.getObject()));
 //BA.debugLineNum = 206;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtree)(this);
 //BA.debugLineNum = 207;BA.debugLine="End Sub";
return null;
}
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 216;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 217;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 218;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 221;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 222;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 223;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 211;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 212;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 213;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Tree As WixElement";
_tree = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private scheme As Map";
_scheme = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 6;BA.debugLine="Private Items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 7;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixtree  _initialize(anywheresoftware.b4a.BA _ba,String _eid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 30;BA.debugLine="Public Sub Initialize(eID As String) As WixTree";
 //BA.debugLineNum = 31;BA.debugLine="ID = eID.tolowercase";
_id = _eid.toLowerCase();
 //BA.debugLineNum = 32;BA.debugLine="Tree.Initialize(ID).SetView(\"tree\")";
_tree._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_id)._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("tree");
 //BA.debugLineNum = 33;BA.debugLine="scheme = CreateMap()";
_scheme = __c.createMap(new Object[] {});
 //BA.debugLineNum = 34;BA.debugLine="Items.Initialize";
_items.Initialize();
 //BA.debugLineNum = 35;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtree)(this);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
anywheresoftware.b4a.objects.collections.List _data = null;
 //BA.debugLineNum = 122;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 123;BA.debugLine="If Items.Size > 0 Then";
if (_items.getSize()>0) { 
 //BA.debugLineNum = 124;BA.debugLine="Dim data As List = modWebix.Unflatten(Items, \"da";
_data = new anywheresoftware.b4a.objects.collections.List();
_data = _modwebix._unflatten /*anywheresoftware.b4a.objects.collections.List*/ (_items,"data");
 //BA.debugLineNum = 125;BA.debugLine="SetData(data)";
_setdata(_data);
 };
 //BA.debugLineNum = 127;BA.debugLine="Tree.SetAttr(\"scheme\", scheme)";
_tree._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("scheme",(Object)(_scheme.getObject()));
 //BA.debugLineNum = 128;BA.debugLine="Return Tree.item";
if (true) return _tree._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 71;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixtree  _setanimate(boolean _animate) throws Exception{
 //BA.debugLineNum = 226;BA.debugLine="Sub SetAnimate(animate As Boolean) As WixTree";
 //BA.debugLineNum = 227;BA.debugLine="Tree.SetAttr(\"animate\", animate)";
_tree._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("animate",(Object)(_animate));
 //BA.debugLineNum = 228;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtree)(this);
 //BA.debugLineNum = 229;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtree  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 40;BA.debugLine="Sub SetAttributes(m As Map) As WixTree";
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
 //BA.debugLineNum = 43;BA.debugLine="Tree.SetAttr(k,v)";
_tree._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 45;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtree)(this);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtree  _setborderless(boolean _b) throws Exception{
 //BA.debugLineNum = 138;BA.debugLine="Sub SetBorderLess(b As Boolean) As WixTree";
 //BA.debugLineNum = 139;BA.debugLine="Tree.SetBorderLess(b)";
_tree._setborderless /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 140;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtree)(this);
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtree  _setclick(Object _click) throws Exception{
 //BA.debugLineNum = 231;BA.debugLine="Sub SetClick(click As Object) As WixTree";
 //BA.debugLineNum = 232;BA.debugLine="Tree.SetAttr(\"click\", click)";
_tree._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("click",_click);
 //BA.debugLineNum = 233;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtree)(this);
 //BA.debugLineNum = 234;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtree  _setclipboard(Object _clipboard) throws Exception{
 //BA.debugLineNum = 236;BA.debugLine="Sub SetClipboard(clipboard As Object) As WixTree";
 //BA.debugLineNum = 237;BA.debugLine="Tree.SetAttr(\"clipboard\", clipboard)";
_tree._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("clipboard",_clipboard);
 //BA.debugLineNum = 238;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtree)(this);
 //BA.debugLineNum = 239;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtree  _setcontainer(Object _container) throws Exception{
 //BA.debugLineNum = 241;BA.debugLine="Sub SetContainer(container As Object) As WixTree";
 //BA.debugLineNum = 242;BA.debugLine="Tree.SetAttr(\"container\", container)";
_tree._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("container",_container);
 //BA.debugLineNum = 243;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtree)(this);
 //BA.debugLineNum = 244;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtree  _setcss(Object _css) throws Exception{
 //BA.debugLineNum = 246;BA.debugLine="Sub SetCss(css As Object) As WixTree";
 //BA.debugLineNum = 247;BA.debugLine="Tree.SetAttr(\"css\", css)";
_tree._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("css",_css);
 //BA.debugLineNum = 248;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtree)(this);
 //BA.debugLineNum = 249;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtree  _setdata(anywheresoftware.b4a.objects.collections.List _data) throws Exception{
 //BA.debugLineNum = 163;BA.debugLine="Sub SetData(data As List) As WixTree";
 //BA.debugLineNum = 164;BA.debugLine="Tree.SetData(data)";
_tree._setdata /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_data);
 //BA.debugLineNum = 165;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtree)(this);
 //BA.debugLineNum = 166;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtree  _setdatathrottle(Object _datathrottle) throws Exception{
 //BA.debugLineNum = 251;BA.debugLine="Sub SetDatathrottle(datathrottle As Object) As Wix";
 //BA.debugLineNum = 252;BA.debugLine="Tree.SetAttr(\"datathrottle\", datathrottle)";
_tree._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("datathrottle",_datathrottle);
 //BA.debugLineNum = 253;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtree)(this);
 //BA.debugLineNum = 254;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtree  _setdatatype(Object _datatype) throws Exception{
 //BA.debugLineNum = 256;BA.debugLine="Sub SetDatatype(datatype As Object) As WixTree";
 //BA.debugLineNum = 257;BA.debugLine="Tree.SetAttr(\"datatype\", datatype)";
_tree._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("datatype",_datatype);
 //BA.debugLineNum = 258;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtree)(this);
 //BA.debugLineNum = 259;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtree  _setdisabled(boolean _disabled) throws Exception{
 //BA.debugLineNum = 261;BA.debugLine="Sub SetDisabled(disabled As Boolean) As WixTree";
 //BA.debugLineNum = 262;BA.debugLine="Tree.SetAttr(\"disabled\", disabled)";
_tree._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("disabled",(Object)(_disabled));
 //BA.debugLineNum = 263;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtree)(this);
 //BA.debugLineNum = 264;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtree  _setdrag(Object _drag) throws Exception{
 //BA.debugLineNum = 266;BA.debugLine="Sub SetDrag(drag As Object) As WixTree";
 //BA.debugLineNum = 267;BA.debugLine="Tree.SetAttr(\"drag\", drag)";
_tree._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("drag",_drag);
 //BA.debugLineNum = 268;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtree)(this);
 //BA.debugLineNum = 269;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtree  _setdragscroll(Object _dragscroll) throws Exception{
 //BA.debugLineNum = 271;BA.debugLine="Sub SetDragscroll(dragscroll As Object) As WixTree";
 //BA.debugLineNum = 272;BA.debugLine="Tree.SetAttr(\"dragscroll\", dragscroll)";
_tree._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("dragscroll",_dragscroll);
 //BA.debugLineNum = 273;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtree)(this);
 //BA.debugLineNum = 274;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtree  _setfiltermode(Object _filtermode) throws Exception{
 //BA.debugLineNum = 276;BA.debugLine="Sub SetFilterMode(filterMode As Object) As WixTree";
 //BA.debugLineNum = 277;BA.debugLine="Tree.SetAttr(\"filterMode\", filterMode)";
_tree._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("filterMode",_filtermode);
 //BA.debugLineNum = 278;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtree)(this);
 //BA.debugLineNum = 279;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtree  _setgravity(Object _gravity) throws Exception{
 //BA.debugLineNum = 281;BA.debugLine="Sub SetGravity(gravity As Object) As WixTree";
 //BA.debugLineNum = 282;BA.debugLine="Tree.SetAttr(\"gravity\", gravity)";
_tree._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("gravity",_gravity);
 //BA.debugLineNum = 283;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtree)(this);
 //BA.debugLineNum = 284;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtree  _setgroupby(String _g) throws Exception{
 //BA.debugLineNum = 132;BA.debugLine="Sub SetGroupBy(g As String) As WixTree";
 //BA.debugLineNum = 133;BA.debugLine="scheme.Put(\"$group\", g)";
_scheme.Put((Object)("$group"),(Object)(_g));
 //BA.debugLineNum = 134;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtree)(this);
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtree  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 181;BA.debugLine="Sub SetHeight(h As Object) As WixTree";
 //BA.debugLineNum = 182;BA.debugLine="Tree.SetHeight(h)";
_tree._setheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 183;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtree)(this);
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtree  _sethidden(boolean _hidden) throws Exception{
 //BA.debugLineNum = 286;BA.debugLine="Sub SetHidden(hidden As Boolean) As WixTree";
 //BA.debugLineNum = 287;BA.debugLine="Tree.SetAttr(\"hidden\", hidden)";
_tree._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hidden",(Object)(_hidden));
 //BA.debugLineNum = 288;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtree)(this);
 //BA.debugLineNum = 289;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtree  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 113;BA.debugLine="Sub SetMap(m As Map) As WixTree";
 //BA.debugLineNum = 114;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 115;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 116;BA.debugLine="Tree.SetAttr(strKey, strVal)";
_tree._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 118;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtree)(this);
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtree  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub SetMargin(margin As Object) As WixTree";
 //BA.debugLineNum = 25;BA.debugLine="Tree.SetMargin(margin)";
_tree._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 26;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtree)(this);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtree  _setmaxheight(Object _maxheight) throws Exception{
 //BA.debugLineNum = 291;BA.debugLine="Sub SetMaxHeight(maxHeight As Object) As WixTree";
 //BA.debugLineNum = 292;BA.debugLine="Tree.SetAttr(\"maxHeight\", maxHeight)";
_tree._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxHeight",_maxheight);
 //BA.debugLineNum = 293;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtree)(this);
 //BA.debugLineNum = 294;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtree  _setmaxwidth(Object _maxwidth) throws Exception{
 //BA.debugLineNum = 296;BA.debugLine="Sub SetMaxWidth(maxWidth As Object) As WixTree";
 //BA.debugLineNum = 297;BA.debugLine="Tree.SetAttr(\"maxWidth\", maxWidth)";
_tree._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxWidth",_maxwidth);
 //BA.debugLineNum = 298;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtree)(this);
 //BA.debugLineNum = 299;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtree  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Sub SetMinHeight(h As Int) As WixTree";
 //BA.debugLineNum = 108;BA.debugLine="Tree.SetMinHeight(h)";
_tree._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 109;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtree)(this);
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtree  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Sub SetMinWidth(w As Int) As WixTree";
 //BA.debugLineNum = 102;BA.debugLine="Tree.SetMinWidth(w)";
_tree._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 103;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtree)(this);
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtree  _setmultiselect(boolean _b) throws Exception{
 //BA.debugLineNum = 150;BA.debugLine="Sub SetMultiSelect(b As Boolean) As WixTree   'ign";
 //BA.debugLineNum = 151;BA.debugLine="Tree.SetAttr(\"select\", \"multiselect\")";
_tree._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("select",(Object)("multiselect"));
 //BA.debugLineNum = 152;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtree)(this);
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtree  _setname(String _n) throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Sub SetName(n As String) As WixTree";
 //BA.debugLineNum = 83;BA.debugLine="Tree.SetName(n)";
_tree._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 84;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtree)(this);
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtree  _setnavigation(boolean _navigation) throws Exception{
 //BA.debugLineNum = 301;BA.debugLine="Sub SetNavigation(navigation As Boolean) As WixTre";
 //BA.debugLineNum = 302;BA.debugLine="Tree.SetAttr(\"navigation\", navigation)";
_tree._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("navigation",(Object)(_navigation));
 //BA.debugLineNum = 303;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtree)(this);
 //BA.debugLineNum = 304;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtree  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 18;BA.debugLine="Sub SetPadding(padding As Object) As WixTree";
 //BA.debugLineNum = 19;BA.debugLine="Tree.SetPadding(padding)";
_tree._setpadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 20;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtree)(this);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtree  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub SetParent(p As WixElement) As WixTree";
 //BA.debugLineNum = 13;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 14;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtree)(this);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtree  _setready(Object _ready) throws Exception{
 //BA.debugLineNum = 306;BA.debugLine="Sub SetReady(ready As Object) As WixTree";
 //BA.debugLineNum = 307;BA.debugLine="Tree.SetAttr(\"ready\", ready)";
_tree._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("ready",_ready);
 //BA.debugLineNum = 308;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtree)(this);
 //BA.debugLineNum = 309;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtree  _setremovemissed(boolean _removemissed) throws Exception{
 //BA.debugLineNum = 311;BA.debugLine="Sub SetRemoveMissed(removeMissed As Boolean) As Wi";
 //BA.debugLineNum = 312;BA.debugLine="Tree.SetAttr(\"removeMissed\", removeMissed)";
_tree._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("removeMissed",(Object)(_removemissed));
 //BA.debugLineNum = 313;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtree)(this);
 //BA.debugLineNum = 314;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtree  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Sub SetResponsive(b As Object) As WixTree";
 //BA.debugLineNum = 89;BA.debugLine="Tree.SetResponsive(b)";
_tree._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 90;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtree)(this);
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtree  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixTree";
 //BA.debugLineNum = 95;BA.debugLine="Tree.SetResponsiveCell(b)";
_tree._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 96;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtree)(this);
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtree  _setrules(Object _rules) throws Exception{
 //BA.debugLineNum = 316;BA.debugLine="Sub SetRules(rules As Object) As WixTree";
 //BA.debugLineNum = 317;BA.debugLine="Tree.SetAttr(\"rules\", rules)";
_tree._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("rules",_rules);
 //BA.debugLineNum = 318;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtree)(this);
 //BA.debugLineNum = 319;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtree  _setsave(Object _save) throws Exception{
 //BA.debugLineNum = 321;BA.debugLine="Sub SetSave(save As Object) As WixTree";
 //BA.debugLineNum = 322;BA.debugLine="Tree.SetAttr(\"save\", save)";
_tree._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("save",_save);
 //BA.debugLineNum = 323;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtree)(this);
 //BA.debugLineNum = 324;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtree  _setscheme(Object _xscheme) throws Exception{
 //BA.debugLineNum = 326;BA.debugLine="Sub SetScheme(xscheme As Object) As WixTree";
 //BA.debugLineNum = 327;BA.debugLine="Tree.SetAttr(\"scheme\", xscheme)";
_tree._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("scheme",_xscheme);
 //BA.debugLineNum = 328;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtree)(this);
 //BA.debugLineNum = 329;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtree  _setscroll(Object _b) throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub SetScroll(b As Object) As WixTree";
 //BA.debugLineNum = 65;BA.debugLine="Tree.SetAttr(\"scroll\", b)";
_tree._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("scroll",_b);
 //BA.debugLineNum = 66;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtree)(this);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtree  _setscrollspeed(Object _scrollspeed) throws Exception{
 //BA.debugLineNum = 332;BA.debugLine="Sub SetScrollSpeed(scrollSpeed As Object) As WixTr";
 //BA.debugLineNum = 333;BA.debugLine="Tree.SetAttr(\"scrollSpeed\", scrollSpeed)";
_tree._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("scrollSpeed",_scrollspeed);
 //BA.debugLineNum = 334;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtree)(this);
 //BA.debugLineNum = 335;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtree  _setselect(boolean _b) throws Exception{
 //BA.debugLineNum = 144;BA.debugLine="Sub SetSelect(b As Boolean) As WixTree";
 //BA.debugLineNum = 145;BA.debugLine="Tree.SetSelect(b)";
_tree._setselect /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 146;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtree)(this);
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtree  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 58;BA.debugLine="Tree.SetStyle(prop,sval)";
_tree._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 59;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtree)(this);
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtree  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 48;BA.debugLine="Sub SetStyles(m As Map) As WixTree";
 //BA.debugLineNum = 49;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 50;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 51;BA.debugLine="Tree.SetStyle(k,v)";
_tree._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 53;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtree)(this);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtree  _settemplate(Object _t) throws Exception{
 //BA.debugLineNum = 169;BA.debugLine="Sub SetTemplate(t As Object) As WixTree";
 //BA.debugLineNum = 170;BA.debugLine="Tree.SetTemplate(t)";
_tree._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_t);
 //BA.debugLineNum = 171;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtree)(this);
 //BA.debugLineNum = 172;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtree  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 74;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixTree";
 //BA.debugLineNum = 75;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 76;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 77;BA.debugLine="Tree.SetTemplate(os)";
_tree._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 78;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtree)(this);
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtree  _setthreestate(boolean _threestate) throws Exception{
 //BA.debugLineNum = 337;BA.debugLine="Sub SetThreeState(threeState As Boolean) As WixTre";
 //BA.debugLineNum = 338;BA.debugLine="Tree.SetAttr(\"threeState\", threeState)";
_tree._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("threeState",(Object)(_threestate));
 //BA.debugLineNum = 339;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtree)(this);
 //BA.debugLineNum = 340;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtree  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 175;BA.debugLine="Sub SetTooltip(tt As String) As WixTree";
 //BA.debugLineNum = 176;BA.debugLine="Tree.SetTooltip(tt)";
_tree._settooltip /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_tt);
 //BA.debugLineNum = 177;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtree)(this);
 //BA.debugLineNum = 178;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtree  _settype(Object _stype) throws Exception{
 //BA.debugLineNum = 342;BA.debugLine="Sub SetType(sType As Object) As WixTree";
 //BA.debugLineNum = 343;BA.debugLine="Tree.SetAttr(\"type\", sType)";
_tree._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("type",_stype);
 //BA.debugLineNum = 344;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtree)(this);
 //BA.debugLineNum = 345;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtree  _settypelinetree(boolean _b) throws Exception{
 //BA.debugLineNum = 157;BA.debugLine="Sub SetTypeLineTree(b As Boolean) As WixTree   'ig";
 //BA.debugLineNum = 158;BA.debugLine="Tree.SetType(\"lineTree\")";
_tree._settype /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("lineTree");
 //BA.debugLineNum = 159;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtree)(this);
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtree  _seturl(Object _url) throws Exception{
 //BA.debugLineNum = 347;BA.debugLine="Sub SetUrl(url As Object) As WixTree";
 //BA.debugLineNum = 348;BA.debugLine="Tree.SetAttr(\"url\", url)";
_tree._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("url",_url);
 //BA.debugLineNum = 349;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtree)(this);
 //BA.debugLineNum = 350;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtree  _setwidth(Object _h) throws Exception{
 //BA.debugLineNum = 187;BA.debugLine="Sub SetWidth(h As Object) As WixTree";
 //BA.debugLineNum = 188;BA.debugLine="Tree.SetWidth(h)";
_tree._setwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 189;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtree)(this);
 //BA.debugLineNum = 190;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
