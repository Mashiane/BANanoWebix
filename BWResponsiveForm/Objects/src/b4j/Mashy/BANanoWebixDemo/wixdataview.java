package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixdataview extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixdataview", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixdataview.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _dataview = null;
public com.ab.banano.BANanoObject _onclick = null;
public com.ab.banano.BANanoObject _ondblclick = null;
public anywheresoftware.b4a.objects.collections.Map _typeof = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 258;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 259;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 260;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 263;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 264;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 265;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.Mashy.BANanoWebixDemo.wixform _frm) throws Exception{
 //BA.debugLineNum = 241;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 242;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 243;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 253;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 254;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 255;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public DataView As WixElement";
_dataview = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private onClick As BANanoObject";
_onclick = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 6;BA.debugLine="Private onDblClick As BANanoObject";
_ondblclick = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 7;BA.debugLine="Private typeOf As Map";
_typeof = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 8;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixdataview  _initialize(anywheresoftware.b4a.BA _ba,String _tid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize(tID As String) As WixDataVie";
 //BA.debugLineNum = 14;BA.debugLine="ID = tID.ToLowerCase";
_id = _tid.toLowerCase();
 //BA.debugLineNum = 15;BA.debugLine="DataView.Initialize(ID).SetView(\"dataview\")";
_dataview._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_id)._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("dataview");
 //BA.debugLineNum = 16;BA.debugLine="onClick = Null";
_onclick = (com.ab.banano.BANanoObject)(__c.Null);
 //BA.debugLineNum = 17;BA.debugLine="onDblClick = Null";
_ondblclick = (com.ab.banano.BANanoObject)(__c.Null);
 //BA.debugLineNum = 18;BA.debugLine="typeOf = CreateMap()";
_typeof = __c.createMap(new Object[] {});
 //BA.debugLineNum = 19;BA.debugLine="SetMultiSelect(False)";
_setmultiselect(__c.False);
 //BA.debugLineNum = 20;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 21;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdataview)(this);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 217;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 218;BA.debugLine="DataView.SetAttr(\"type\", typeOf)";
_dataview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("type",(Object)(_typeof.getObject()));
 //BA.debugLineNum = 219;BA.debugLine="If onClick <> Null Then";
if (_onclick!= null) { 
 //BA.debugLineNum = 220;BA.debugLine="DataView.SetAttr(\"click\", onClick)";
_dataview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("click",(Object)(_onclick));
 };
 //BA.debugLineNum = 222;BA.debugLine="If onDblClick <> Null Then";
if (_ondblclick!= null) { 
 //BA.debugLineNum = 223;BA.debugLine="DataView.SetAttr(\"dblclick\", onDblClick)";
_dataview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("dblclick",(Object)(_ondblclick));
 };
 //BA.debugLineNum = 225;BA.debugLine="Return DataView.item";
if (true) return _dataview._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 226;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 67;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixdataview  _setanimate(boolean _animate) throws Exception{
 //BA.debugLineNum = 268;BA.debugLine="Sub SetAnimate(animate As Boolean) As WixDataView";
 //BA.debugLineNum = 269;BA.debugLine="DataView.SetAttr(\"animate\", animate)";
_dataview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("animate",(Object)(_animate));
 //BA.debugLineNum = 270;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdataview)(this);
 //BA.debugLineNum = 271;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdataview  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 42;BA.debugLine="Sub SetAttributes(m As Map) As WixDataView";
 //BA.debugLineNum = 43;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 44;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 45;BA.debugLine="DataView.SetAttr(k,v)";
_dataview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 47;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdataview)(this);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdataview  _setautoheight(boolean _autoheight) throws Exception{
 //BA.debugLineNum = 273;BA.debugLine="Sub SetAutoheight(autoheight As Boolean) As WixDat";
 //BA.debugLineNum = 274;BA.debugLine="DataView.SetAttr(\"autoheight\", autoheight)";
_dataview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("autoheight",(Object)(_autoheight));
 //BA.debugLineNum = 275;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdataview)(this);
 //BA.debugLineNum = 276;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdataview  _setborderless(boolean _b) throws Exception{
 //BA.debugLineNum = 205;BA.debugLine="Sub SetBorderLess(b As Boolean) As WixDataView";
 //BA.debugLineNum = 206;BA.debugLine="DataView.SetAttr(\"borderless\", b)";
_dataview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("borderless",(Object)(_b));
 //BA.debugLineNum = 207;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdataview)(this);
 //BA.debugLineNum = 208;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdataview  _setclick(com.ab.banano.BANanoObject _e) throws Exception{
 //BA.debugLineNum = 156;BA.debugLine="Sub SetClick(e As BANanoObject) As WixDataView";
 //BA.debugLineNum = 157;BA.debugLine="onClick = e";
_onclick = _e;
 //BA.debugLineNum = 158;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdataview)(this);
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdataview  _setcontainer(Object _container) throws Exception{
 //BA.debugLineNum = 279;BA.debugLine="Sub SetContainer(container As Object) As WixDataVi";
 //BA.debugLineNum = 280;BA.debugLine="DataView.SetAttr(\"container\", container)";
_dataview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("container",_container);
 //BA.debugLineNum = 281;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdataview)(this);
 //BA.debugLineNum = 282;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdataview  _setcss(Object _css) throws Exception{
 //BA.debugLineNum = 284;BA.debugLine="Sub SetCss(css As Object) As WixDataView";
 //BA.debugLineNum = 285;BA.debugLine="DataView.SetAttr(\"css\", css)";
_dataview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("css",_css);
 //BA.debugLineNum = 286;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdataview)(this);
 //BA.debugLineNum = 287;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdataview  _setdata(anywheresoftware.b4a.objects.collections.List _data) throws Exception{
 //BA.debugLineNum = 246;BA.debugLine="Sub SetData(data As List) As WixDataView";
 //BA.debugLineNum = 247;BA.debugLine="DataView.SetData(data)";
_dataview._setdata /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_data);
 //BA.debugLineNum = 248;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdataview)(this);
 //BA.debugLineNum = 249;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdataview  _setdatafetch(Object _datafetch) throws Exception{
 //BA.debugLineNum = 289;BA.debugLine="Sub SetDatafetch(datafetch As Object) As WixDataVi";
 //BA.debugLineNum = 290;BA.debugLine="DataView.SetAttr(\"datafetch\", datafetch)";
_dataview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("datafetch",_datafetch);
 //BA.debugLineNum = 291;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdataview)(this);
 //BA.debugLineNum = 292;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdataview  _setdatathrottle(Object _datathrottle) throws Exception{
 //BA.debugLineNum = 294;BA.debugLine="Sub SetDatathrottle(datathrottle As Object) As Wix";
 //BA.debugLineNum = 295;BA.debugLine="DataView.SetAttr(\"datathrottle\", datathrottle)";
_dataview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("datathrottle",_datathrottle);
 //BA.debugLineNum = 296;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdataview)(this);
 //BA.debugLineNum = 297;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdataview  _setdatatype(Object _datatype) throws Exception{
 //BA.debugLineNum = 299;BA.debugLine="Sub SetDatatype(datatype As Object) As WixDataView";
 //BA.debugLineNum = 300;BA.debugLine="DataView.SetAttr(\"datatype\", datatype)";
_dataview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("datatype",_datatype);
 //BA.debugLineNum = 301;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdataview)(this);
 //BA.debugLineNum = 302;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdataview  _setdblclick(com.ab.banano.BANanoObject _e) throws Exception{
 //BA.debugLineNum = 162;BA.debugLine="Sub SetDblClick(e As BANanoObject) As WixDataView";
 //BA.debugLineNum = 163;BA.debugLine="onDblClick = e";
_ondblclick = _e;
 //BA.debugLineNum = 164;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdataview)(this);
 //BA.debugLineNum = 165;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdataview  _setdisabled(boolean _disabled) throws Exception{
 //BA.debugLineNum = 304;BA.debugLine="Sub SetDisabled(disabled As Boolean) As WixDataVie";
 //BA.debugLineNum = 305;BA.debugLine="DataView.SetAttr(\"disabled\", disabled)";
_dataview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("disabled",(Object)(_disabled));
 //BA.debugLineNum = 306;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdataview)(this);
 //BA.debugLineNum = 307;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdataview  _setdrag(Object _drag) throws Exception{
 //BA.debugLineNum = 309;BA.debugLine="Sub SetDrag(drag As Object) As WixDataView";
 //BA.debugLineNum = 310;BA.debugLine="DataView.SetAttr(\"drag\", drag)";
_dataview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("drag",_drag);
 //BA.debugLineNum = 311;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdataview)(this);
 //BA.debugLineNum = 312;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdataview  _setdragscroll(Object _dragscroll) throws Exception{
 //BA.debugLineNum = 314;BA.debugLine="Sub SetDragscroll(dragscroll As Object) As WixData";
 //BA.debugLineNum = 315;BA.debugLine="DataView.SetAttr(\"dragscroll\", dragscroll)";
_dataview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("dragscroll",_dragscroll);
 //BA.debugLineNum = 316;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdataview)(this);
 //BA.debugLineNum = 317;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdataview  _setexternaldata(Object _externaldata) throws Exception{
 //BA.debugLineNum = 319;BA.debugLine="Sub SetExternalData(externalData As Object) As Wix";
 //BA.debugLineNum = 320;BA.debugLine="DataView.SetAttr(\"externalData\", externalData)";
_dataview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("externalData",_externaldata);
 //BA.debugLineNum = 321;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdataview)(this);
 //BA.debugLineNum = 322;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdataview  _setgravity(Object _gravity) throws Exception{
 //BA.debugLineNum = 324;BA.debugLine="Sub SetGravity(gravity As Object) As WixDataView";
 //BA.debugLineNum = 325;BA.debugLine="DataView.SetAttr(\"gravity\", gravity)";
_dataview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("gravity",_gravity);
 //BA.debugLineNum = 326;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdataview)(this);
 //BA.debugLineNum = 327;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdataview  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 229;BA.debugLine="Sub SetHeight(h As Object) As WixDataView";
 //BA.debugLineNum = 230;BA.debugLine="DataView.SetHeight(h)";
_dataview._setheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 231;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdataview)(this);
 //BA.debugLineNum = 232;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdataview  _sethidden(boolean _hidden) throws Exception{
 //BA.debugLineNum = 329;BA.debugLine="Sub SetHidden(hidden As Boolean) As WixDataView";
 //BA.debugLineNum = 330;BA.debugLine="DataView.SetAttr(\"hidden\", hidden)";
_dataview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hidden",(Object)(_hidden));
 //BA.debugLineNum = 331;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdataview)(this);
 //BA.debugLineNum = 332;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdataview  _setitemheight(int _h) throws Exception{
 //BA.debugLineNum = 136;BA.debugLine="Sub SetItemHeight(h As Int) As WixDataView";
 //BA.debugLineNum = 137;BA.debugLine="typeOf.Put(\"height\", h)";
_typeof.Put((Object)("height"),(Object)(_h));
 //BA.debugLineNum = 138;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdataview)(this);
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdataview  _setitemwidth(int _h) throws Exception{
 //BA.debugLineNum = 142;BA.debugLine="Sub SetItemWidth(h As Int) As WixDataView";
 //BA.debugLineNum = 143;BA.debugLine="typeOf.Put(\"width\", h)";
_typeof.Put((Object)("width"),(Object)(_h));
 //BA.debugLineNum = 144;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdataview)(this);
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdataview  _setloadahead(Object _loadahead) throws Exception{
 //BA.debugLineNum = 334;BA.debugLine="Sub SetLoadahead(loadahead As Object) As WixDataVi";
 //BA.debugLineNum = 335;BA.debugLine="DataView.SetAttr(\"loadahead\", loadahead)";
_dataview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("loadahead",_loadahead);
 //BA.debugLineNum = 336;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdataview)(this);
 //BA.debugLineNum = 337;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdataview  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 78;BA.debugLine="Sub SetMap(m As Map) As WixDataView";
 //BA.debugLineNum = 79;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 80;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 81;BA.debugLine="DataView.SetAttr(strKey,	strVal)";
_dataview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 83;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdataview)(this);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdataview  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Sub SetMargin(margin As Object) As WixDataView";
 //BA.debugLineNum = 38;BA.debugLine="DataView.SetMargin(margin)";
_dataview._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 39;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdataview)(this);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdataview  _setmaxheight(Object _maxheight) throws Exception{
 //BA.debugLineNum = 339;BA.debugLine="Sub SetMaxHeight(maxHeight As Object) As WixDataVi";
 //BA.debugLineNum = 340;BA.debugLine="DataView.SetAttr(\"maxHeight\", maxHeight)";
_dataview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxHeight",_maxheight);
 //BA.debugLineNum = 341;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdataview)(this);
 //BA.debugLineNum = 342;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdataview  _setmaxwidth(Object _maxwidth) throws Exception{
 //BA.debugLineNum = 344;BA.debugLine="Sub SetMaxWidth(maxWidth As Object) As WixDataView";
 //BA.debugLineNum = 345;BA.debugLine="DataView.SetAttr(\"maxWidth\", maxWidth)";
_dataview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxWidth",_maxwidth);
 //BA.debugLineNum = 346;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdataview)(this);
 //BA.debugLineNum = 347;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdataview  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 113;BA.debugLine="Sub SetMinHeight(h As Int) As WixDataView";
 //BA.debugLineNum = 114;BA.debugLine="DataView.SetMinHeight(h)";
_dataview._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 115;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdataview)(this);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdataview  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Sub SetMinWidth(w As Int) As WixDataView";
 //BA.debugLineNum = 108;BA.debugLine="DataView.SetMinWidth(w)";
_dataview._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 109;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdataview)(this);
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdataview  _setmultiselect(boolean _m) throws Exception{
 //BA.debugLineNum = 174;BA.debugLine="Sub SetMultiSelect(m As Boolean) As WixDataView  '";
 //BA.debugLineNum = 176;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdataview)(this);
 //BA.debugLineNum = 177;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdataview  _setname(String _n) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Sub SetName(n As String) As WixDataView";
 //BA.debugLineNum = 89;BA.debugLine="DataView.SetName(n)";
_dataview._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 90;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdataview)(this);
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdataview  _setnavigation(Object _b) throws Exception{
 //BA.debugLineNum = 199;BA.debugLine="Sub SetNavigation(b As Object) As WixDataView";
 //BA.debugLineNum = 200;BA.debugLine="DataView.SetAttr(\"navigation\", b)";
_dataview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("navigation",_b);
 //BA.debugLineNum = 201;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdataview)(this);
 //BA.debugLineNum = 202;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdataview  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Sub SetPadding(padding As Object) As WixDataView";
 //BA.debugLineNum = 32;BA.debugLine="DataView.SetPadding(padding)";
_dataview._setpadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 33;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdataview)(this);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdataview  _setpager(String _p) throws Exception{
 //BA.debugLineNum = 149;BA.debugLine="Sub SetPager(p As String) As WixDataView";
 //BA.debugLineNum = 150;BA.debugLine="p = p.tolowercase";
_p = _p.toLowerCase();
 //BA.debugLineNum = 151;BA.debugLine="DataView.SetAttr(\"pager\", p)";
_dataview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("pager",(Object)(_p));
 //BA.debugLineNum = 152;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdataview)(this);
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdataview  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Sub SetParent(p As WixElement) As WixDataView";
 //BA.debugLineNum = 26;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 27;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdataview)(this);
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdataview  _setrank(Object _r) throws Exception{
 //BA.debugLineNum = 130;BA.debugLine="Sub SetRank(r As Object) As WixDataView";
 //BA.debugLineNum = 131;BA.debugLine="DataView.SetAttr(\"rank\", r)";
_dataview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("rank",_r);
 //BA.debugLineNum = 132;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdataview)(this);
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdataview  _setready(Object _ready) throws Exception{
 //BA.debugLineNum = 349;BA.debugLine="Sub SetReady(ready As Object) As WixDataView";
 //BA.debugLineNum = 350;BA.debugLine="DataView.SetAttr(\"ready\", ready)";
_dataview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("ready",_ready);
 //BA.debugLineNum = 351;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdataview)(this);
 //BA.debugLineNum = 352;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdataview  _setremovemissed(boolean _removemissed) throws Exception{
 //BA.debugLineNum = 354;BA.debugLine="Sub SetRemoveMissed(removeMissed As Boolean) As Wi";
 //BA.debugLineNum = 355;BA.debugLine="DataView.SetAttr(\"removeMissed\", removeMissed)";
_dataview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("removeMissed",(Object)(_removemissed));
 //BA.debugLineNum = 356;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdataview)(this);
 //BA.debugLineNum = 357;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdataview  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Sub SetResponsive(b As Object) As WixDataView";
 //BA.debugLineNum = 95;BA.debugLine="DataView.SetResponsive(b)";
_dataview._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 96;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdataview)(this);
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdataview  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixDataView";
 //BA.debugLineNum = 101;BA.debugLine="DataView.SetResponsiveCell(b)";
_dataview._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 102;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdataview)(this);
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdataview  _setrules(Object _rules) throws Exception{
 //BA.debugLineNum = 359;BA.debugLine="Sub SetRules(rules As Object) As WixDataView";
 //BA.debugLineNum = 360;BA.debugLine="DataView.SetAttr(\"rules\", rules)";
_dataview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("rules",_rules);
 //BA.debugLineNum = 361;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdataview)(this);
 //BA.debugLineNum = 362;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdataview  _setsave(Object _save) throws Exception{
 //BA.debugLineNum = 364;BA.debugLine="Sub SetSave(save As Object) As WixDataView";
 //BA.debugLineNum = 365;BA.debugLine="DataView.SetAttr(\"save\", save)";
_dataview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("save",_save);
 //BA.debugLineNum = 366;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdataview)(this);
 //BA.debugLineNum = 367;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdataview  _setscheme(Object _scheme) throws Exception{
 //BA.debugLineNum = 369;BA.debugLine="Sub SetScheme(scheme As Object) As WixDataView";
 //BA.debugLineNum = 370;BA.debugLine="DataView.SetAttr(\"scheme\", scheme)";
_dataview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("scheme",_scheme);
 //BA.debugLineNum = 371;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdataview)(this);
 //BA.debugLineNum = 372;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdataview  _setscroll(Object _b) throws Exception{
 //BA.debugLineNum = 124;BA.debugLine="Sub SetScroll(b As Object) As WixDataView";
 //BA.debugLineNum = 125;BA.debugLine="DataView.SetAttr(\"scroll\", b)";
_dataview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("scroll",_b);
 //BA.debugLineNum = 126;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdataview)(this);
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdataview  _setscrollspeed(Object _scrollspeed) throws Exception{
 //BA.debugLineNum = 374;BA.debugLine="Sub SetScrollSpeed(scrollSpeed As Object) As WixDa";
 //BA.debugLineNum = 375;BA.debugLine="DataView.SetAttr(\"scrollSpeed\", scrollSpeed)";
_dataview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("scrollSpeed",_scrollspeed);
 //BA.debugLineNum = 376;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdataview)(this);
 //BA.debugLineNum = 377;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdataview  _setselect(boolean _b) throws Exception{
 //BA.debugLineNum = 181;BA.debugLine="Sub SetSelect(b As Boolean) As WixDataView   'igno";
 //BA.debugLineNum = 182;BA.debugLine="DataView.SetAttr(\"select\", b)";
_dataview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("select",(Object)(_b));
 //BA.debugLineNum = 183;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdataview)(this);
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdataview  _setsizetocontent(Object _b) throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Sub SetSizeToContent(b As Object) As WixDataView";
 //BA.debugLineNum = 119;BA.debugLine="DataView.SetAttr(\"sizeToContent\", b)";
_dataview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("sizeToContent",_b);
 //BA.debugLineNum = 120;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdataview)(this);
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdataview  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 60;BA.debugLine="DataView.SetStyle(prop,sval)";
_dataview._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 61;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdataview)(this);
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdataview  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 50;BA.debugLine="Sub SetStyles(m As Map) As WixDataView";
 //BA.debugLineNum = 51;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 52;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 53;BA.debugLine="DataView.SetStyle(k,v)";
_dataview._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdataview)(this);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdataview  _settemplate(String _t) throws Exception{
 //BA.debugLineNum = 168;BA.debugLine="Sub SetTemplate(t As String) As WixDataView";
 //BA.debugLineNum = 169;BA.debugLine="DataView.SetTemplate(t)";
_dataview._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_t));
 //BA.debugLineNum = 170;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdataview)(this);
 //BA.debugLineNum = 171;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdataview  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 70;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixDataVie";
 //BA.debugLineNum = 71;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 72;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 73;BA.debugLine="DataView.SetTemplate(os)";
_dataview._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 74;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdataview)(this);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdataview  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 211;BA.debugLine="Sub SetTooltip(tt As String) As WixDataView";
 //BA.debugLineNum = 212;BA.debugLine="DataView.SetTooltip(tt)";
_dataview._settooltip /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_tt);
 //BA.debugLineNum = 213;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdataview)(this);
 //BA.debugLineNum = 214;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdataview  _settype(Object _stype) throws Exception{
 //BA.debugLineNum = 379;BA.debugLine="Sub SetType(sType As Object) As WixDataView";
 //BA.debugLineNum = 380;BA.debugLine="DataView.SetAttr(\"type\", sType)";
_dataview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("type",_stype);
 //BA.debugLineNum = 381;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdataview)(this);
 //BA.debugLineNum = 382;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdataview  _seturl(Object _url) throws Exception{
 //BA.debugLineNum = 384;BA.debugLine="Sub SetUrl(url As Object) As WixDataView";
 //BA.debugLineNum = 385;BA.debugLine="DataView.SetAttr(\"url\", url)";
_dataview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("url",_url);
 //BA.debugLineNum = 386;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdataview)(this);
 //BA.debugLineNum = 387;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdataview  _setwidth(Object _h) throws Exception{
 //BA.debugLineNum = 235;BA.debugLine="Sub SetWidth(h As Object) As WixDataView";
 //BA.debugLineNum = 236;BA.debugLine="DataView.SetWidth(h)";
_dataview._setwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 237;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdataview)(this);
 //BA.debugLineNum = 238;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdataview  _setxcount(int _x) throws Exception{
 //BA.debugLineNum = 193;BA.debugLine="Sub SetXCount(x As Int) As WixDataView";
 //BA.debugLineNum = 194;BA.debugLine="DataView.SetAttr(\"xCount\", x)";
_dataview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("xCount",(Object)(_x));
 //BA.debugLineNum = 195;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdataview)(this);
 //BA.debugLineNum = 196;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdataview  _setycount(int _x) throws Exception{
 //BA.debugLineNum = 187;BA.debugLine="Sub SetYCount(x As Int) As WixDataView";
 //BA.debugLineNum = 188;BA.debugLine="DataView.SetAttr(\"yCount\", x)";
_dataview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("yCount",(Object)(_x));
 //BA.debugLineNum = 189;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdataview)(this);
 //BA.debugLineNum = 190;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
