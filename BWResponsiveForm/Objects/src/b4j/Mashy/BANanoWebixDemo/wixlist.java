package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixlist extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixlist", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixlist.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _list = null;
public String _id = "";
public anywheresoftware.b4a.objects.collections.Map _typeof = null;
public anywheresoftware.b4a.objects.collections.List _items = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public b4j.Mashy.BANanoWebixDemo.wixlist  _additem(String _ikey,String _ivalue) throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
 //BA.debugLineNum = 67;BA.debugLine="Sub AddItem(iKey As String, iValue As String) As W";
 //BA.debugLineNum = 68;BA.debugLine="Dim m As Map = CreateMap()";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = __c.createMap(new Object[] {});
 //BA.debugLineNum = 69;BA.debugLine="m.Put(\"id\", iKey)";
_m.Put((Object)("id"),(Object)(_ikey));
 //BA.debugLineNum = 70;BA.debugLine="m.Put(\"value\", iValue)";
_m.Put((Object)("value"),(Object)(_ivalue));
 //BA.debugLineNum = 71;BA.debugLine="Items.Add(m)";
_items.Add((Object)(_m.getObject()));
 //BA.debugLineNum = 72;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlist)(this);
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return null;
}
public String  _addtocolumn(b4j.Mashy.BANanoWebixDemo.wixcolumn _c) throws Exception{
 //BA.debugLineNum = 144;BA.debugLine="Sub AddToColumn(c As WixColumn)";
 //BA.debugLineNum = 145;BA.debugLine="c.AddItem(Item)";
_c._additem /*String*/ (_item());
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return "";
}
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 241;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 242;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 243;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 246;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 247;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 248;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.Mashy.BANanoWebixDemo.wixform _frm) throws Exception{
 //BA.debugLineNum = 149;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 150;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 236;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 237;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 238;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public List As WixElement";
_list = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private typeOf As Map";
_typeof = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 6;BA.debugLine="Private Items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 7;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixlist  _initialize(anywheresoftware.b4a.BA _ba,String _lid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 53;BA.debugLine="Public Sub Initialize(lID As String) As WixList";
 //BA.debugLineNum = 54;BA.debugLine="ID = lID.tolowercase";
_id = _lid.toLowerCase();
 //BA.debugLineNum = 55;BA.debugLine="List.Initialize(ID).SetView(\"list\")";
_list._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_id)._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("list");
 //BA.debugLineNum = 56;BA.debugLine="Items.Initialize";
_items.Initialize();
 //BA.debugLineNum = 57;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 58;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlist)(this);
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 191;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 192;BA.debugLine="If Items.Size > 0 Then";
if (_items.getSize()>0) { 
 //BA.debugLineNum = 193;BA.debugLine="SetData(Items)";
_setdata(_items);
 };
 //BA.debugLineNum = 195;BA.debugLine="List.SetAttr(\"type\", typeOf)";
_list._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("type",(Object)(_typeof.getObject()));
 //BA.debugLineNum = 196;BA.debugLine="Return List.item";
if (true) return _list._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 197;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 63;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixlist  _setanimate(Object _animate) throws Exception{
 //BA.debugLineNum = 250;BA.debugLine="Sub SetAnimate(animate As Object) As WixList";
 //BA.debugLineNum = 251;BA.debugLine="List.SetAttr(\"animate\", animate)";
_list._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("animate",_animate);
 //BA.debugLineNum = 252;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlist)(this);
 //BA.debugLineNum = 253;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlist  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 29;BA.debugLine="Sub SetAttributes(m As Map) As WixList";
 //BA.debugLineNum = 30;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 31;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 32;BA.debugLine="List.SetAttr(k,v)";
_list._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 34;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlist)(this);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlist  _setautoheight(boolean _b) throws Exception{
 //BA.debugLineNum = 212;BA.debugLine="Sub SetAutoHeight(b As Boolean) As WixList";
 //BA.debugLineNum = 213;BA.debugLine="List.SetAttr(\"autoheight\", b)";
_list._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("autoheight",(Object)(_b));
 //BA.debugLineNum = 214;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlist)(this);
 //BA.debugLineNum = 215;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlist  _setautowidth(Object _autowidth) throws Exception{
 //BA.debugLineNum = 255;BA.debugLine="Sub SetAutowidth(autowidth As Object) As WixList";
 //BA.debugLineNum = 256;BA.debugLine="List.SetAttr(\"autowidth\", autowidth)";
_list._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("autowidth",_autowidth);
 //BA.debugLineNum = 257;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlist)(this);
 //BA.debugLineNum = 258;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlist  _setborderless(boolean _b) throws Exception{
 //BA.debugLineNum = 160;BA.debugLine="Sub SetBorderLess(b As Boolean) As WixList";
 //BA.debugLineNum = 161;BA.debugLine="List.SetAttr(\"borderless\", b)";
_list._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("borderless",(Object)(_b));
 //BA.debugLineNum = 162;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlist)(this);
 //BA.debugLineNum = 163;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlist  _setclick(com.ab.banano.BANanoObject _click) throws Exception{
 //BA.debugLineNum = 260;BA.debugLine="Sub SetClick(click As BANanoObject) As WixList";
 //BA.debugLineNum = 261;BA.debugLine="List.SetAttr(\"click\", click)";
_list._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("click",(Object)(_click));
 //BA.debugLineNum = 262;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlist)(this);
 //BA.debugLineNum = 263;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlist  _setcontainer(Object _container) throws Exception{
 //BA.debugLineNum = 265;BA.debugLine="Sub SetContainer(container As Object) As WixList";
 //BA.debugLineNum = 266;BA.debugLine="List.SetAttr(\"container\", container)";
_list._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("container",_container);
 //BA.debugLineNum = 267;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlist)(this);
 //BA.debugLineNum = 268;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlist  _setcss(Object _css) throws Exception{
 //BA.debugLineNum = 270;BA.debugLine="Sub SetCss(css As Object) As WixList";
 //BA.debugLineNum = 271;BA.debugLine="List.SetAttr(\"css\", css)";
_list._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("css",_css);
 //BA.debugLineNum = 272;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlist)(this);
 //BA.debugLineNum = 273;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlist  _setdata(anywheresoftware.b4a.objects.collections.List _t) throws Exception{
 //BA.debugLineNum = 229;BA.debugLine="Sub SetData(t As List) As WixList";
 //BA.debugLineNum = 230;BA.debugLine="List.SetData(t)";
_list._setdata /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_t);
 //BA.debugLineNum = 231;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlist)(this);
 //BA.debugLineNum = 232;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlist  _setdatafeed(Object _datafeed) throws Exception{
 //BA.debugLineNum = 275;BA.debugLine="Sub SetDataFeed(dataFeed As Object) As WixList";
 //BA.debugLineNum = 276;BA.debugLine="List.SetAttr(\"dataFeed\", dataFeed)";
_list._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("dataFeed",_datafeed);
 //BA.debugLineNum = 277;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlist)(this);
 //BA.debugLineNum = 278;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlist  _setdatafetch(Object _datafetch) throws Exception{
 //BA.debugLineNum = 280;BA.debugLine="Sub SetDatafetch(datafetch As Object) As WixList";
 //BA.debugLineNum = 281;BA.debugLine="List.SetAttr(\"datafetch\", datafetch)";
_list._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("datafetch",_datafetch);
 //BA.debugLineNum = 282;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlist)(this);
 //BA.debugLineNum = 283;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlist  _setdatathrottle(Object _datathrottle) throws Exception{
 //BA.debugLineNum = 285;BA.debugLine="Sub SetDatathrottle(datathrottle As Object) As Wix";
 //BA.debugLineNum = 286;BA.debugLine="List.SetAttr(\"datathrottle\", datathrottle)";
_list._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("datathrottle",_datathrottle);
 //BA.debugLineNum = 287;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlist)(this);
 //BA.debugLineNum = 288;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlist  _setdatatype(Object _datatype) throws Exception{
 //BA.debugLineNum = 290;BA.debugLine="Sub SetDatatype(datatype As Object) As WixList";
 //BA.debugLineNum = 291;BA.debugLine="List.SetAttr(\"datatype\", datatype)";
_list._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("datatype",_datatype);
 //BA.debugLineNum = 292;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlist)(this);
 //BA.debugLineNum = 293;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlist  _setdisabled(Object _disabled) throws Exception{
 //BA.debugLineNum = 295;BA.debugLine="Sub SetDisabled(disabled As Object) As WixList";
 //BA.debugLineNum = 296;BA.debugLine="List.SetAttr(\"disabled\", disabled)";
_list._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("disabled",_disabled);
 //BA.debugLineNum = 297;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlist)(this);
 //BA.debugLineNum = 298;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlist  _setdrag(Object _drag) throws Exception{
 //BA.debugLineNum = 300;BA.debugLine="Sub SetDrag(drag As Object) As WixList";
 //BA.debugLineNum = 301;BA.debugLine="List.SetAttr(\"drag\", drag)";
_list._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("drag",_drag);
 //BA.debugLineNum = 302;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlist)(this);
 //BA.debugLineNum = 303;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlist  _setdragscroll(Object _dragscroll) throws Exception{
 //BA.debugLineNum = 305;BA.debugLine="Sub SetDragscroll(dragscroll As Object) As WixList";
 //BA.debugLineNum = 306;BA.debugLine="List.SetAttr(\"dragscroll\", dragscroll)";
_list._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("dragscroll",_dragscroll);
 //BA.debugLineNum = 307;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlist)(this);
 //BA.debugLineNum = 308;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlist  _setdynamic(Object _dynamic) throws Exception{
 //BA.debugLineNum = 310;BA.debugLine="Sub SetDynamic(dynamic As Object) As WixList";
 //BA.debugLineNum = 311;BA.debugLine="List.SetAttr(\"dynamic\", dynamic)";
_list._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("dynamic",_dynamic);
 //BA.debugLineNum = 312;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlist)(this);
 //BA.debugLineNum = 313;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlist  _setexternaldata(Object _externaldata) throws Exception{
 //BA.debugLineNum = 315;BA.debugLine="Sub SetExternalData(externalData As Object) As Wix";
 //BA.debugLineNum = 316;BA.debugLine="List.SetAttr(\"externalData\", externalData)";
_list._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("externalData",_externaldata);
 //BA.debugLineNum = 317;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlist)(this);
 //BA.debugLineNum = 318;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlist  _setgravity(Object _gravity) throws Exception{
 //BA.debugLineNum = 320;BA.debugLine="Sub SetGravity(gravity As Object) As WixList";
 //BA.debugLineNum = 321;BA.debugLine="List.SetAttr(\"gravity\", gravity)";
_list._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("gravity",_gravity);
 //BA.debugLineNum = 322;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlist)(this);
 //BA.debugLineNum = 323;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlist  _setheight(Object _t) throws Exception{
 //BA.debugLineNum = 206;BA.debugLine="Sub SetHeight(t As Object) As WixList";
 //BA.debugLineNum = 207;BA.debugLine="List.SetHeight(t)";
_list._setheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_t);
 //BA.debugLineNum = 208;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlist)(this);
 //BA.debugLineNum = 209;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlist  _sethidden(Object _hidden) throws Exception{
 //BA.debugLineNum = 325;BA.debugLine="Sub SetHidden(hidden As Object) As WixList";
 //BA.debugLineNum = 326;BA.debugLine="List.SetAttr(\"hidden\", hidden)";
_list._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hidden",_hidden);
 //BA.debugLineNum = 327;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlist)(this);
 //BA.debugLineNum = 328;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlist  _setitemheight(Object _h) throws Exception{
 //BA.debugLineNum = 125;BA.debugLine="Sub SetItemHeight(h As Object) As WixList";
 //BA.debugLineNum = 126;BA.debugLine="typeOf.Put(\"height\", h)";
_typeof.Put((Object)("height"),_h);
 //BA.debugLineNum = 127;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlist)(this);
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlist  _setitemwidth(Object _w) throws Exception{
 //BA.debugLineNum = 131;BA.debugLine="Sub SetItemWidth(w As Object) As WixList";
 //BA.debugLineNum = 132;BA.debugLine="typeOf.Put(\"width\", w)";
_typeof.Put((Object)("width"),_w);
 //BA.debugLineNum = 133;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlist)(this);
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlist  _setlayout(Object _layout) throws Exception{
 //BA.debugLineNum = 330;BA.debugLine="Sub SetLayout(layout As Object) As WixList";
 //BA.debugLineNum = 331;BA.debugLine="List.SetAttr(\"layout\", layout)";
_list._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("layout",_layout);
 //BA.debugLineNum = 332;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlist)(this);
 //BA.debugLineNum = 333;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlist  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 84;BA.debugLine="Sub SetMap(m As Map) As WixList";
 //BA.debugLineNum = 85;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 86;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 87;BA.debugLine="List.SetAttr(strKey,	strVal)";
_list._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 89;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlist)(this);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlist  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub SetMargin(margin As Object) As WixList";
 //BA.debugLineNum = 25;BA.debugLine="List.SetMargin(margin)";
_list._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 26;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlist)(this);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlist  _setmaxheight(Object _maxheight) throws Exception{
 //BA.debugLineNum = 335;BA.debugLine="Sub SetMaxHeight(maxHeight As Object) As WixList";
 //BA.debugLineNum = 336;BA.debugLine="List.SetAttr(\"maxHeight\", maxHeight)";
_list._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxHeight",_maxheight);
 //BA.debugLineNum = 337;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlist)(this);
 //BA.debugLineNum = 338;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlist  _setmaxwidth(Object _maxwidth) throws Exception{
 //BA.debugLineNum = 340;BA.debugLine="Sub SetMaxWidth(maxWidth As Object) As WixList";
 //BA.debugLineNum = 341;BA.debugLine="List.SetAttr(\"maxWidth\", maxWidth)";
_list._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxWidth",_maxwidth);
 //BA.debugLineNum = 342;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlist)(this);
 //BA.debugLineNum = 343;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlist  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Sub SetMinHeight(h As Int) As WixList";
 //BA.debugLineNum = 120;BA.debugLine="List.SetMinHeight(h)";
_list._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 121;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlist)(this);
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlist  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 113;BA.debugLine="Sub SetMinWidth(w As Int) As WixList";
 //BA.debugLineNum = 114;BA.debugLine="List.SetMinWidth(w)";
_list._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 115;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlist)(this);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlist  _setmultiselect(boolean _b) throws Exception{
 //BA.debugLineNum = 172;BA.debugLine="Sub SetMultiSelect(b As Boolean) As WixList";
 //BA.debugLineNum = 173;BA.debugLine="List.SetAttr(\"multiselect\", b)";
_list._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("multiselect",(Object)(_b));
 //BA.debugLineNum = 174;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlist)(this);
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlist  _setname(String _n) throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Sub SetName(n As String) As WixList";
 //BA.debugLineNum = 95;BA.debugLine="List.SetName(n)";
_list._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 96;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlist)(this);
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlist  _setnavigation(Object _navigation) throws Exception{
 //BA.debugLineNum = 345;BA.debugLine="Sub SetNavigation(navigation As Object) As WixList";
 //BA.debugLineNum = 346;BA.debugLine="List.SetAttr(\"navigation\", navigation)";
_list._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("navigation",_navigation);
 //BA.debugLineNum = 347;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlist)(this);
 //BA.debugLineNum = 348;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlist  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 18;BA.debugLine="Sub SetPadding(padding As Object) As WixList";
 //BA.debugLineNum = 19;BA.debugLine="List.SetPadding(padding)";
_list._setpadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 20;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlist)(this);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlist  _setpager(String _p) throws Exception{
 //BA.debugLineNum = 184;BA.debugLine="Sub SetPager(p As String) As WixList";
 //BA.debugLineNum = 185;BA.debugLine="p = p.tolowercase";
_p = _p.toLowerCase();
 //BA.debugLineNum = 186;BA.debugLine="List.SetAttr(\"pager\", p)";
_list._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("pager",(Object)(_p));
 //BA.debugLineNum = 187;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlist)(this);
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlist  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub SetParent(p As WixElement) As WixList";
 //BA.debugLineNum = 13;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 14;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlist)(this);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlist  _setremovemissed(Object _removemissed) throws Exception{
 //BA.debugLineNum = 350;BA.debugLine="Sub SetRemoveMissed(removeMissed As Object) As Wix";
 //BA.debugLineNum = 351;BA.debugLine="List.SetAttr(\"removeMissed\", removeMissed)";
_list._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("removeMissed",_removemissed);
 //BA.debugLineNum = 352;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlist)(this);
 //BA.debugLineNum = 353;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlist  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Sub SetResponsive(b As Object) As WixList";
 //BA.debugLineNum = 101;BA.debugLine="List.SetResponsive(b)";
_list._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 102;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlist)(this);
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlist  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixList";
 //BA.debugLineNum = 107;BA.debugLine="List.SetResponsiveCell(b)";
_list._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 108;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlist)(this);
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlist  _setsave(Object _save) throws Exception{
 //BA.debugLineNum = 355;BA.debugLine="Sub SetSave(save As Object) As WixList";
 //BA.debugLineNum = 356;BA.debugLine="List.SetAttr(\"save\", save)";
_list._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("save",_save);
 //BA.debugLineNum = 357;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlist)(this);
 //BA.debugLineNum = 358;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlist  _setscroll(Object _b) throws Exception{
 //BA.debugLineNum = 178;BA.debugLine="Sub SetScroll(b As Object) As WixList";
 //BA.debugLineNum = 179;BA.debugLine="List.SetAttr(\"scroll\", b)";
_list._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("scroll",_b);
 //BA.debugLineNum = 180;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlist)(this);
 //BA.debugLineNum = 181;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlist  _setscrollspeed(Object _scrollspeed) throws Exception{
 //BA.debugLineNum = 360;BA.debugLine="Sub SetScrollSpeed(scrollSpeed As Object) As WixLi";
 //BA.debugLineNum = 361;BA.debugLine="List.SetAttr(\"scrollSpeed\", scrollSpeed)";
_list._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("scrollSpeed",_scrollspeed);
 //BA.debugLineNum = 362;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlist)(this);
 //BA.debugLineNum = 363;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlist  _setselect(boolean _b) throws Exception{
 //BA.debugLineNum = 166;BA.debugLine="Sub SetSelect(b As Boolean) As WixList";
 //BA.debugLineNum = 167;BA.debugLine="List.SetAttr(\"select\", b)";
_list._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("select",(Object)(_b));
 //BA.debugLineNum = 168;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlist)(this);
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlist  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 47;BA.debugLine="List.SetStyle(prop,sval)";
_list._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 48;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlist)(this);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlist  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 37;BA.debugLine="Sub SetStyles(m As Map) As WixList";
 //BA.debugLineNum = 38;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 39;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 40;BA.debugLine="List.SetStyle(k,v)";
_list._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 42;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlist)(this);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlist  _settemplate(String _t) throws Exception{
 //BA.debugLineNum = 200;BA.debugLine="Sub SetTemplate(t As String) As WixList";
 //BA.debugLineNum = 201;BA.debugLine="List.SetTemplate(t)";
_list._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_t));
 //BA.debugLineNum = 202;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlist)(this);
 //BA.debugLineNum = 203;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlist  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 76;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixList";
 //BA.debugLineNum = 77;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 78;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 79;BA.debugLine="List.SetTemplate(os)";
_list._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 80;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlist)(this);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlist  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 138;BA.debugLine="Sub SetTooltip(tt As String) As WixList";
 //BA.debugLineNum = 139;BA.debugLine="List.SetTooltip(tt)";
_list._settooltip /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_tt);
 //BA.debugLineNum = 140;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlist)(this);
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlist  _settype(Object _stype) throws Exception{
 //BA.debugLineNum = 365;BA.debugLine="Sub SetType(sType As Object) As WixList";
 //BA.debugLineNum = 366;BA.debugLine="List.SetAttr(\"type\", sType)";
_list._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("type",_stype);
 //BA.debugLineNum = 367;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlist)(this);
 //BA.debugLineNum = 368;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlist  _settypeuploader(boolean _b) throws Exception{
 //BA.debugLineNum = 217;BA.debugLine="Sub SetTypeUploader(b As Boolean) As WixList  'ign";
 //BA.debugLineNum = 218;BA.debugLine="List.SetType(\"uploader\")";
_list._settype /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("uploader");
 //BA.debugLineNum = 219;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlist)(this);
 //BA.debugLineNum = 220;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlist  _seturl(Object _url) throws Exception{
 //BA.debugLineNum = 370;BA.debugLine="Sub SetUrl(url As Object) As WixList";
 //BA.debugLineNum = 371;BA.debugLine="List.SetAttr(\"url\", url)";
_list._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("url",_url);
 //BA.debugLineNum = 372;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlist)(this);
 //BA.debugLineNum = 373;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlist  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 154;BA.debugLine="Sub SetValue(v As String) As WixList";
 //BA.debugLineNum = 155;BA.debugLine="List.SetValue(v)";
_list._setvalue /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_v);
 //BA.debugLineNum = 156;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlist)(this);
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlist  _setwidth(Object _t) throws Exception{
 //BA.debugLineNum = 223;BA.debugLine="Sub SetWidth(t As Object) As WixList";
 //BA.debugLineNum = 224;BA.debugLine="List.SetWidth(t)";
_list._setwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_t);
 //BA.debugLineNum = 225;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlist)(this);
 //BA.debugLineNum = 226;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlist  _setxcount(Object _xcount) throws Exception{
 //BA.debugLineNum = 375;BA.debugLine="Sub SetXCount(xCount As Object) As WixList";
 //BA.debugLineNum = 376;BA.debugLine="List.SetAttr(\"xCount\", xCount)";
_list._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("xCount",_xcount);
 //BA.debugLineNum = 377;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlist)(this);
 //BA.debugLineNum = 378;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlist  _setycount(Object _ycount) throws Exception{
 //BA.debugLineNum = 380;BA.debugLine="Sub SetYCount(yCount As Object) As WixList";
 //BA.debugLineNum = 381;BA.debugLine="List.SetAttr(\"yCount\", yCount)";
_list._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("yCount",_ycount);
 //BA.debugLineNum = 382;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlist)(this);
 //BA.debugLineNum = 383;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
