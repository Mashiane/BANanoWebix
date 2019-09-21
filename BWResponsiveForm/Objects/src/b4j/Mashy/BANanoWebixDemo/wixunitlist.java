package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixunitlist extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixunitlist", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixunitlist.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _unitlist = null;
public anywheresoftware.b4a.objects.collections.Map _typeof = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
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
 //BA.debugLineNum = 4;BA.debugLine="Public UnitList As WixElement";
_unitlist = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private typeOf As Map";
_typeof = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 6;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixunitlist  _initialize(anywheresoftware.b4a.BA _ba,String _eid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(eID As String) As WixUnitLis";
 //BA.debugLineNum = 12;BA.debugLine="ID = eID.tolowercase";
_id = _eid.toLowerCase();
 //BA.debugLineNum = 13;BA.debugLine="UnitList.Initialize(ID).SetView(\"unitlist\")";
_unitlist._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_id)._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("unitlist");
 //BA.debugLineNum = 14;BA.debugLine="typeOf = CreateMap()";
_typeof = __c.createMap(new Object[] {});
 //BA.debugLineNum = 15;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 16;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixunitlist)(this);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 116;BA.debugLine="UnitList.SetAttr(\"type\", typeOf)";
_unitlist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("type",(Object)(_typeof.getObject()));
 //BA.debugLineNum = 117;BA.debugLine="Return UnitList.item";
if (true) return _unitlist._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 58;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixunitlist  _setanimate(boolean _animate) throws Exception{
 //BA.debugLineNum = 173;BA.debugLine="Sub SetAnimate(animate As Boolean) As WixUnitList";
 //BA.debugLineNum = 174;BA.debugLine="UnitList.SetAttr(\"animate\", animate)";
_unitlist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("animate",(Object)(_animate));
 //BA.debugLineNum = 175;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixunitlist)(this);
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixunitlist  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 26;BA.debugLine="Sub SetAttributes(m As Map) As WixUnitList";
 //BA.debugLineNum = 27;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 28;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 29;BA.debugLine="UnitList.SetAttr(k,v)";
_unitlist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixunitlist)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixunitlist  _setautoheight(boolean _autoheight) throws Exception{
 //BA.debugLineNum = 178;BA.debugLine="Sub SetAutoheight(autoheight As Boolean) As WixUni";
 //BA.debugLineNum = 179;BA.debugLine="UnitList.SetAttr(\"autoheight\", autoheight)";
_unitlist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("autoheight",(Object)(_autoheight));
 //BA.debugLineNum = 180;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixunitlist)(this);
 //BA.debugLineNum = 181;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixunitlist  _setautowidth(boolean _autowidth) throws Exception{
 //BA.debugLineNum = 183;BA.debugLine="Sub SetAutowidth(autowidth As Boolean) As WixUnitL";
 //BA.debugLineNum = 184;BA.debugLine="UnitList.SetAttr(\"autowidth\", autowidth)";
_unitlist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("autowidth",(Object)(_autowidth));
 //BA.debugLineNum = 185;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixunitlist)(this);
 //BA.debugLineNum = 186;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixunitlist  _setborderless(boolean _t) throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="Sub SetBorderLess(t As Boolean) As WixUnitList";
 //BA.debugLineNum = 128;BA.debugLine="UnitList.SetAttr(\"borderless\", t)";
_unitlist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("borderless",(Object)(_t));
 //BA.debugLineNum = 129;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixunitlist)(this);
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixunitlist  _setclick(Object _click) throws Exception{
 //BA.debugLineNum = 188;BA.debugLine="Sub SetClick(click As Object) As WixUnitList";
 //BA.debugLineNum = 189;BA.debugLine="UnitList.SetAttr(\"click\", click)";
_unitlist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("click",_click);
 //BA.debugLineNum = 190;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixunitlist)(this);
 //BA.debugLineNum = 191;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixunitlist  _setclipboard(Object _clipboard) throws Exception{
 //BA.debugLineNum = 193;BA.debugLine="Sub SetClipboard(clipboard As Object) As WixUnitLi";
 //BA.debugLineNum = 194;BA.debugLine="UnitList.SetAttr(\"clipboard\", clipboard)";
_unitlist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("clipboard",_clipboard);
 //BA.debugLineNum = 195;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixunitlist)(this);
 //BA.debugLineNum = 196;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixunitlist  _setcontainer(Object _container) throws Exception{
 //BA.debugLineNum = 198;BA.debugLine="Sub SetContainer(container As Object) As WixUnitLi";
 //BA.debugLineNum = 199;BA.debugLine="UnitList.SetAttr(\"container\", container)";
_unitlist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("container",_container);
 //BA.debugLineNum = 200;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixunitlist)(this);
 //BA.debugLineNum = 201;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixunitlist  _setcss(Object _css) throws Exception{
 //BA.debugLineNum = 203;BA.debugLine="Sub SetCss(css As Object) As WixUnitList";
 //BA.debugLineNum = 204;BA.debugLine="UnitList.SetAttr(\"css\", css)";
_unitlist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("css",_css);
 //BA.debugLineNum = 205;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixunitlist)(this);
 //BA.debugLineNum = 206;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixunitlist  _setdata(anywheresoftware.b4a.objects.collections.List _data) throws Exception{
 //BA.debugLineNum = 121;BA.debugLine="Sub SetData(data As List) As WixUnitList";
 //BA.debugLineNum = 122;BA.debugLine="UnitList.SetData(data)";
_unitlist._setdata /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_data);
 //BA.debugLineNum = 123;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixunitlist)(this);
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixunitlist  _setdatathrottle(Object _datathrottle) throws Exception{
 //BA.debugLineNum = 208;BA.debugLine="Sub SetDatathrottle(datathrottle As Object) As Wix";
 //BA.debugLineNum = 209;BA.debugLine="UnitList.SetAttr(\"datathrottle\", datathrottle)";
_unitlist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("datathrottle",_datathrottle);
 //BA.debugLineNum = 210;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixunitlist)(this);
 //BA.debugLineNum = 211;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixunitlist  _setdatatype(Object _datatype) throws Exception{
 //BA.debugLineNum = 314;BA.debugLine="Sub SetDatatype(datatype As Object) As WixUnitList";
 //BA.debugLineNum = 315;BA.debugLine="UnitList.SetAttr(\"datatype\", datatype)";
_unitlist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("datatype",_datatype);
 //BA.debugLineNum = 316;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixunitlist)(this);
 //BA.debugLineNum = 317;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixunitlist  _setdisabled(boolean _disabled) throws Exception{
 //BA.debugLineNum = 213;BA.debugLine="Sub SetDisabled(disabled As Boolean) As WixUnitLis";
 //BA.debugLineNum = 214;BA.debugLine="UnitList.SetAttr(\"disabled\", disabled)";
_unitlist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("disabled",(Object)(_disabled));
 //BA.debugLineNum = 215;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixunitlist)(this);
 //BA.debugLineNum = 216;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixunitlist  _setdrag(Object _drag) throws Exception{
 //BA.debugLineNum = 319;BA.debugLine="Sub SetDrag(drag As Object) As WixUnitList";
 //BA.debugLineNum = 320;BA.debugLine="UnitList.SetAttr(\"drag\", drag)";
_unitlist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("drag",_drag);
 //BA.debugLineNum = 321;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixunitlist)(this);
 //BA.debugLineNum = 322;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixunitlist  _setdragscroll(Object _dragscroll) throws Exception{
 //BA.debugLineNum = 324;BA.debugLine="Sub SetDragscroll(dragscroll As Object) As WixUnit";
 //BA.debugLineNum = 325;BA.debugLine="UnitList.SetAttr(\"dragscroll\", dragscroll)";
_unitlist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("dragscroll",_dragscroll);
 //BA.debugLineNum = 326;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixunitlist)(this);
 //BA.debugLineNum = 327;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixunitlist  _setexternaldata(Object _externaldata) throws Exception{
 //BA.debugLineNum = 218;BA.debugLine="Sub SetExternalData(externalData As Object) As Wix";
 //BA.debugLineNum = 219;BA.debugLine="UnitList.SetAttr(\"externalData\", externalData)";
_unitlist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("externalData",_externaldata);
 //BA.debugLineNum = 220;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixunitlist)(this);
 //BA.debugLineNum = 221;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixunitlist  _setgravity(Object _gravity) throws Exception{
 //BA.debugLineNum = 223;BA.debugLine="Sub SetGravity(gravity As Object) As WixUnitList";
 //BA.debugLineNum = 224;BA.debugLine="UnitList.SetAttr(\"gravity\", gravity)";
_unitlist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("gravity",_gravity);
 //BA.debugLineNum = 225;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixunitlist)(this);
 //BA.debugLineNum = 226;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixunitlist  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 146;BA.debugLine="Sub SetHeight(h As Object) As WixUnitList";
 //BA.debugLineNum = 147;BA.debugLine="UnitList.SetHeight(h)";
_unitlist._setheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 148;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixunitlist)(this);
 //BA.debugLineNum = 149;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixunitlist  _sethidden(boolean _hidden) throws Exception{
 //BA.debugLineNum = 229;BA.debugLine="Sub SetHidden(hidden As Boolean) As WixUnitList";
 //BA.debugLineNum = 230;BA.debugLine="UnitList.SetAttr(\"hidden\", hidden)";
_unitlist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hidden",(Object)(_hidden));
 //BA.debugLineNum = 231;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixunitlist)(this);
 //BA.debugLineNum = 232;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixunitlist  _setitemheight(Object _h) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub SetItemHeight(h As Object) As WixUnitList";
 //BA.debugLineNum = 52;BA.debugLine="typeOf.Put(\"height\", h)";
_typeof.Put((Object)("height"),_h);
 //BA.debugLineNum = 53;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixunitlist)(this);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixunitlist  _setitemwidth(Object _w) throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Sub SetItemWidth(w As Object) As WixUnitList";
 //BA.debugLineNum = 110;BA.debugLine="typeOf.Put(\"width\", w)";
_typeof.Put((Object)("width"),_w);
 //BA.debugLineNum = 111;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixunitlist)(this);
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixunitlist  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 100;BA.debugLine="Sub SetMap(m As Map) As WixUnitList";
 //BA.debugLineNum = 101;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 102;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 103;BA.debugLine="UnitList.SetAttr(strKey,	strVal)";
_unitlist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 105;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixunitlist)(this);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixunitlist  _setmaxheight(Object _maxheight) throws Exception{
 //BA.debugLineNum = 234;BA.debugLine="Sub SetMaxHeight(maxHeight As Object) As WixUnitLi";
 //BA.debugLineNum = 235;BA.debugLine="UnitList.SetAttr(\"maxHeight\", maxHeight)";
_unitlist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxHeight",_maxheight);
 //BA.debugLineNum = 236;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixunitlist)(this);
 //BA.debugLineNum = 237;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixunitlist  _setmaxwidth(Object _maxwidth) throws Exception{
 //BA.debugLineNum = 239;BA.debugLine="Sub SetMaxWidth(maxWidth As Object) As WixUnitList";
 //BA.debugLineNum = 240;BA.debugLine="UnitList.SetAttr(\"maxWidth\", maxWidth)";
_unitlist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxWidth",_maxwidth);
 //BA.debugLineNum = 241;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixunitlist)(this);
 //BA.debugLineNum = 242;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixunitlist  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Sub SetMinHeight(h As Int) As WixUnitList";
 //BA.debugLineNum = 95;BA.debugLine="UnitList.SetMinHeight(h)";
_unitlist._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 96;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixunitlist)(this);
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixunitlist  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Sub SetMinWidth(w As Int) As WixUnitList";
 //BA.debugLineNum = 89;BA.debugLine="UnitList.SetMinWidth(w)";
_unitlist._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 90;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixunitlist)(this);
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixunitlist  _setmultiselect(boolean _multiselect) throws Exception{
 //BA.debugLineNum = 244;BA.debugLine="Sub SetMultiselect(multiselect As Boolean) As WixU";
 //BA.debugLineNum = 245;BA.debugLine="UnitList.SetAttr(\"multiselect\", multiselect)";
_unitlist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("multiselect",(Object)(_multiselect));
 //BA.debugLineNum = 246;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixunitlist)(this);
 //BA.debugLineNum = 247;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixunitlist  _setname(String _n) throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Sub SetName(n As String) As WixUnitList";
 //BA.debugLineNum = 70;BA.debugLine="UnitList.SetName(n)";
_unitlist._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 71;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixunitlist)(this);
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixunitlist  _setnavigation(boolean _navigation) throws Exception{
 //BA.debugLineNum = 249;BA.debugLine="Sub SetNavigation(navigation As Boolean) As WixUni";
 //BA.debugLineNum = 250;BA.debugLine="UnitList.SetAttr(\"navigation\", navigation)";
_unitlist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("navigation",(Object)(_navigation));
 //BA.debugLineNum = 251;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixunitlist)(this);
 //BA.debugLineNum = 252;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixunitlist  _setpager(Object _pager) throws Exception{
 //BA.debugLineNum = 254;BA.debugLine="Sub SetPager(pager As Object) As WixUnitList";
 //BA.debugLineNum = 255;BA.debugLine="UnitList.SetAttr(\"pager\", pager)";
_unitlist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("pager",_pager);
 //BA.debugLineNum = 256;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixunitlist)(this);
 //BA.debugLineNum = 257;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixunitlist  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Sub SetParent(p As WixElement) As WixUnitList";
 //BA.debugLineNum = 21;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 22;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixunitlist)(this);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixunitlist  _setready(Object _ready) throws Exception{
 //BA.debugLineNum = 259;BA.debugLine="Sub SetReady(ready As Object) As WixUnitList";
 //BA.debugLineNum = 260;BA.debugLine="UnitList.SetAttr(\"ready\", ready)";
_unitlist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("ready",_ready);
 //BA.debugLineNum = 261;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixunitlist)(this);
 //BA.debugLineNum = 262;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixunitlist  _setremovemissed(boolean _removemissed) throws Exception{
 //BA.debugLineNum = 329;BA.debugLine="Sub SetRemoveMissed(removeMissed As Boolean) As Wi";
 //BA.debugLineNum = 330;BA.debugLine="UnitList.SetAttr(\"removeMissed\", removeMissed)";
_unitlist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("removeMissed",(Object)(_removemissed));
 //BA.debugLineNum = 331;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixunitlist)(this);
 //BA.debugLineNum = 332;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixunitlist  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Sub SetResponsive(b As Object) As WixUnitList";
 //BA.debugLineNum = 76;BA.debugLine="UnitList.SetResponsive(b)";
_unitlist._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 77;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixunitlist)(this);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixunitlist  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixUnitList";
 //BA.debugLineNum = 82;BA.debugLine="UnitList.SetResponsiveCell(b)";
_unitlist._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 83;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixunitlist)(this);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixunitlist  _setsave(Object _save) throws Exception{
 //BA.debugLineNum = 264;BA.debugLine="Sub SetSave(save As Object) As WixUnitList";
 //BA.debugLineNum = 265;BA.debugLine="UnitList.SetAttr(\"save\", save)";
_unitlist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("save",_save);
 //BA.debugLineNum = 266;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixunitlist)(this);
 //BA.debugLineNum = 267;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixunitlist  _setscheme(Object _scheme) throws Exception{
 //BA.debugLineNum = 269;BA.debugLine="Sub SetScheme(scheme As Object) As WixUnitList";
 //BA.debugLineNum = 270;BA.debugLine="UnitList.SetAttr(\"scheme\", scheme)";
_unitlist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("scheme",_scheme);
 //BA.debugLineNum = 271;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixunitlist)(this);
 //BA.debugLineNum = 272;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixunitlist  _setscroll(Object _scroll) throws Exception{
 //BA.debugLineNum = 304;BA.debugLine="Sub SetScroll(scroll As Object) As WixUnitList";
 //BA.debugLineNum = 305;BA.debugLine="UnitList.SetAttr(\"scroll\", scroll)";
_unitlist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("scroll",_scroll);
 //BA.debugLineNum = 306;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixunitlist)(this);
 //BA.debugLineNum = 307;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixunitlist  _setscrollspeed(Object _scrollspeed) throws Exception{
 //BA.debugLineNum = 274;BA.debugLine="Sub SetScrollSpeed(scrollSpeed As Object) As WixUn";
 //BA.debugLineNum = 275;BA.debugLine="UnitList.SetAttr(\"scrollSpeed\", scrollSpeed)";
_unitlist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("scrollSpeed",_scrollspeed);
 //BA.debugLineNum = 276;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixunitlist)(this);
 //BA.debugLineNum = 277;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixunitlist  _setselect(boolean _bselect) throws Exception{
 //BA.debugLineNum = 279;BA.debugLine="Sub SetSelect(bSelect As Boolean) As WixUnitList";
 //BA.debugLineNum = 280;BA.debugLine="UnitList.SetAttr(\"select\", bSelect)";
_unitlist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("select",(Object)(_bselect));
 //BA.debugLineNum = 281;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixunitlist)(this);
 //BA.debugLineNum = 282;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixunitlist  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 45;BA.debugLine="UnitList.SetStyle(prop,sval)";
_unitlist._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 46;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixunitlist)(this);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixunitlist  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 34;BA.debugLine="Sub SetStyles(m As Map) As WixUnitList";
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
 //BA.debugLineNum = 37;BA.debugLine="UnitList.SetStyle(k,v)";
_unitlist._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 39;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixunitlist)(this);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixunitlist  _settemplate(Object _t) throws Exception{
 //BA.debugLineNum = 134;BA.debugLine="Sub SetTemplate(t As Object) As WixUnitList";
 //BA.debugLineNum = 135;BA.debugLine="UnitList.SetTemplate(t)";
_unitlist._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_t);
 //BA.debugLineNum = 136;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixunitlist)(this);
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixunitlist  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 61;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixUnitLis";
 //BA.debugLineNum = 62;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 63;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 64;BA.debugLine="UnitList.SetTemplate(os)";
_unitlist._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 65;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixunitlist)(this);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixunitlist  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 140;BA.debugLine="Sub SetTooltip(tt As String) As WixUnitList";
 //BA.debugLineNum = 141;BA.debugLine="UnitList.SetTooltip(tt)";
_unitlist._settooltip /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_tt);
 //BA.debugLineNum = 142;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixunitlist)(this);
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixunitlist  _settype(Object _btype) throws Exception{
 //BA.debugLineNum = 284;BA.debugLine="Sub SetType(bType As Object) As WixUnitList";
 //BA.debugLineNum = 285;BA.debugLine="UnitList.SetAttr(\"type\", bType)";
_unitlist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("type",_btype);
 //BA.debugLineNum = 286;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixunitlist)(this);
 //BA.debugLineNum = 287;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixunitlist  _setuniteby(Object _uniteby) throws Exception{
 //BA.debugLineNum = 289;BA.debugLine="Sub SetUniteBy(uniteBy As Object) As WixUnitList";
 //BA.debugLineNum = 290;BA.debugLine="UnitList.SetAttr(\"uniteBy\", uniteBy)";
_unitlist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("uniteBy",_uniteby);
 //BA.debugLineNum = 291;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixunitlist)(this);
 //BA.debugLineNum = 292;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixunitlist  _seturl(Object _url) throws Exception{
 //BA.debugLineNum = 294;BA.debugLine="Sub SetUrl(url As Object) As WixUnitList";
 //BA.debugLineNum = 295;BA.debugLine="UnitList.SetAttr(\"url\", url)";
_unitlist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("url",_url);
 //BA.debugLineNum = 296;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixunitlist)(this);
 //BA.debugLineNum = 297;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixunitlist  _setwidth(Object _h) throws Exception{
 //BA.debugLineNum = 152;BA.debugLine="Sub SetWidth(h As Object) As WixUnitList";
 //BA.debugLineNum = 153;BA.debugLine="UnitList.SetWidth(h)";
_unitlist._setwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 154;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixunitlist)(this);
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixunitlist  _setxcount(Object _xcount) throws Exception{
 //BA.debugLineNum = 299;BA.debugLine="Sub SetXCount(xCount As Object) As WixUnitList";
 //BA.debugLineNum = 300;BA.debugLine="UnitList.SetAttr(\"xCount\", xCount)";
_unitlist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("xCount",_xcount);
 //BA.debugLineNum = 301;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixunitlist)(this);
 //BA.debugLineNum = 302;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixunitlist  _setycount(Object _ycount) throws Exception{
 //BA.debugLineNum = 309;BA.debugLine="Sub SetYCount(yCount As Object) As WixUnitList";
 //BA.debugLineNum = 310;BA.debugLine="UnitList.SetAttr(\"yCount\", yCount)";
_unitlist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("yCount",_ycount);
 //BA.debugLineNum = 311;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixunitlist)(this);
 //BA.debugLineNum = 312;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
