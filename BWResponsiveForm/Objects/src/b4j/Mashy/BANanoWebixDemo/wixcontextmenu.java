package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixcontextmenu extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixcontextmenu", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixcontextmenu.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _contextmenu = null;
public anywheresoftware.b4a.objects.collections.List _items = null;
public int _sepcount = 0;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _additem(String _parentid,String _meid,String _mvalue,String _mhref,String _micon,String _badge,String _target) throws Exception{
anywheresoftware.b4a.objects.collections.Map _mitem = null;
 //BA.debugLineNum = 157;BA.debugLine="Sub AddItem(parentID As String, meID As String, mV";
 //BA.debugLineNum = 158;BA.debugLine="parentID = parentID.tolowercase";
_parentid = _parentid.toLowerCase();
 //BA.debugLineNum = 159;BA.debugLine="meID = meID.tolowercase";
_meid = _meid.toLowerCase();
 //BA.debugLineNum = 160;BA.debugLine="Dim mitem As Map = CreateMap()";
_mitem = new anywheresoftware.b4a.objects.collections.Map();
_mitem = __c.createMap(new Object[] {});
 //BA.debugLineNum = 161;BA.debugLine="mitem.Put(\"id\", meID)";
_mitem.Put((Object)("id"),(Object)(_meid));
 //BA.debugLineNum = 162;BA.debugLine="mitem.Put(\"value\", mValue)";
_mitem.Put((Object)("value"),(Object)(_mvalue));
 //BA.debugLineNum = 163;BA.debugLine="mitem.Put(\"href\", mhref)";
_mitem.Put((Object)("href"),(Object)(_mhref));
 //BA.debugLineNum = 164;BA.debugLine="mitem.Put(\"badge\", badge)";
_mitem.Put((Object)("badge"),(Object)(_badge));
 //BA.debugLineNum = 165;BA.debugLine="mitem.Put(\"target\", target)";
_mitem.Put((Object)("target"),(Object)(_target));
 //BA.debugLineNum = 166;BA.debugLine="mitem.Put(\"icon\", mIcon)";
_mitem.Put((Object)("icon"),(Object)(_micon));
 //BA.debugLineNum = 167;BA.debugLine="mitem.Put(\"parentid\", parentID)";
_mitem.Put((Object)("parentid"),(Object)(_parentid));
 //BA.debugLineNum = 168;BA.debugLine="Items.Add(mitem)";
_items.Add((Object)(_mitem.getObject()));
 //BA.debugLineNum = 169;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _addseparator(String _parentid) throws Exception{
String _meid = "";
anywheresoftware.b4a.objects.collections.Map _mitem = null;
 //BA.debugLineNum = 172;BA.debugLine="Sub AddSeparator(parentID As String) As WixContext";
 //BA.debugLineNum = 173;BA.debugLine="parentID = parentID.tolowercase";
_parentid = _parentid.toLowerCase();
 //BA.debugLineNum = 174;BA.debugLine="sepCount = sepCount + 1";
_sepcount = (int) (_sepcount+1);
 //BA.debugLineNum = 175;BA.debugLine="sepCount = sepCount & \"\"";
_sepcount = (int)(Double.parseDouble(BA.NumberToString(_sepcount)+""));
 //BA.debugLineNum = 176;BA.debugLine="Dim meID As String = \"sep\" & sepCount";
_meid = "sep"+BA.NumberToString(_sepcount);
 //BA.debugLineNum = 177;BA.debugLine="Dim mItem As Map = CreateMap()";
_mitem = new anywheresoftware.b4a.objects.collections.Map();
_mitem = __c.createMap(new Object[] {});
 //BA.debugLineNum = 178;BA.debugLine="mItem.Put(\"id\", meID)";
_mitem.Put((Object)("id"),(Object)(_meid));
 //BA.debugLineNum = 179;BA.debugLine="mItem.Put(\"parentid\", parentID)";
_mitem.Put((Object)("parentid"),(Object)(_parentid));
 //BA.debugLineNum = 180;BA.debugLine="mItem.Put(\"$template\", \"Separator\")";
_mitem.Put((Object)("$template"),(Object)("Separator"));
 //BA.debugLineNum = 181;BA.debugLine="Items.Add(mItem)";
_items.Add((Object)(_mitem.getObject()));
 //BA.debugLineNum = 182;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 183;BA.debugLine="End Sub";
return null;
}
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 204;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 205;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 206;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 209;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 210;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 211;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 199;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 200;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 201;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public ContextMenu As WixElement";
_contextmenu = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private Items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 6;BA.debugLine="Private sepCount As Int";
_sepcount = 0;
 //BA.debugLineNum = 7;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize(sid As String) As WixContext";
 //BA.debugLineNum = 13;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 14;BA.debugLine="ContextMenu.Initialize(ID).setview(\"contextmenu\")";
_contextmenu._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_id)._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("contextmenu");
 //BA.debugLineNum = 15;BA.debugLine="Items.Initialize";
_items.Initialize();
 //BA.debugLineNum = 16;BA.debugLine="sepCount = 0";
_sepcount = (int) (0);
 //BA.debugLineNum = 17;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 18;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
anywheresoftware.b4a.objects.collections.List _data = null;
 //BA.debugLineNum = 101;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 102;BA.debugLine="If Items.Size > 0 Then";
if (_items.getSize()>0) { 
 //BA.debugLineNum = 103;BA.debugLine="Dim data As List = modWebix.Unflatten(Items, \"su";
_data = new anywheresoftware.b4a.objects.collections.List();
_data = _modwebix._unflatten /*anywheresoftware.b4a.objects.collections.List*/ (_items,"submenu");
 //BA.debugLineNum = 104;BA.debugLine="SetData(data)";
_setdata(_data);
 };
 //BA.debugLineNum = 106;BA.debugLine="Return ContextMenu.item";
if (true) return _contextmenu._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 52;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setanimate(boolean _animate) throws Exception{
 //BA.debugLineNum = 213;BA.debugLine="Sub SetAnimate(animate As Boolean) As WixContextMe";
 //BA.debugLineNum = 214;BA.debugLine="ContextMenu.SetAttr(\"animate\", animate)";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("animate",(Object)(_animate));
 //BA.debugLineNum = 215;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 216;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 27;BA.debugLine="Sub SetAttributes(m As Map) As WixContextMenu";
 //BA.debugLineNum = 28;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 29;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 30;BA.debugLine="ContextMenu.SetAttr(k,v)";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 32;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setautofit(boolean _autofit) throws Exception{
 //BA.debugLineNum = 218;BA.debugLine="Sub SetAutofit(autofit As Boolean) As WixContextMe";
 //BA.debugLineNum = 219;BA.debugLine="ContextMenu.SetAttr(\"autofit\", autofit)";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("autofit",(Object)(_autofit));
 //BA.debugLineNum = 220;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 221;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setautofocus(boolean _autofocus) throws Exception{
 //BA.debugLineNum = 223;BA.debugLine="Sub SetAutofocus(autofocus As Boolean) As WixConte";
 //BA.debugLineNum = 224;BA.debugLine="ContextMenu.SetAttr(\"autofocus\", autofocus)";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("autofocus",(Object)(_autofocus));
 //BA.debugLineNum = 225;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 226;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setautoheight(boolean _autoheight) throws Exception{
 //BA.debugLineNum = 228;BA.debugLine="Sub SetAutoheight(autoheight As Boolean) As WixCon";
 //BA.debugLineNum = 229;BA.debugLine="ContextMenu.SetAttr(\"autoheight\", autoheight)";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("autoheight",(Object)(_autoheight));
 //BA.debugLineNum = 230;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 231;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setautowidth(boolean _b) throws Exception{
 //BA.debugLineNum = 145;BA.debugLine="Sub SetAutoWidth(b As Boolean) As WixContextMenu";
 //BA.debugLineNum = 146;BA.debugLine="ContextMenu.SetAttr(\"autowidth\", b)";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("autowidth",(Object)(_b));
 //BA.debugLineNum = 147;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setbody(Object _body) throws Exception{
 //BA.debugLineNum = 234;BA.debugLine="Sub SetBody(body As Object) As WixContextMenu";
 //BA.debugLineNum = 235;BA.debugLine="ContextMenu.SetAttr(\"body\", body)";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("body",_body);
 //BA.debugLineNum = 236;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 237;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setborderless(boolean _borderless) throws Exception{
 //BA.debugLineNum = 239;BA.debugLine="Sub SetBorderless(borderless As Boolean) As WixCon";
 //BA.debugLineNum = 240;BA.debugLine="ContextMenu.SetAttr(\"borderless\", borderless)";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("borderless",(Object)(_borderless));
 //BA.debugLineNum = 241;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 242;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setclick(Object _click) throws Exception{
 //BA.debugLineNum = 244;BA.debugLine="Sub SetClick(click As Object) As WixContextMenu";
 //BA.debugLineNum = 245;BA.debugLine="ContextMenu.SetAttr(\"click\", click)";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("click",_click);
 //BA.debugLineNum = 246;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 247;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setclipboard(Object _clipboard) throws Exception{
 //BA.debugLineNum = 249;BA.debugLine="Sub SetClipboard(clipboard As Object) As WixContex";
 //BA.debugLineNum = 250;BA.debugLine="ContextMenu.SetAttr(\"clipboard\", clipboard)";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("clipboard",_clipboard);
 //BA.debugLineNum = 251;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 252;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setcontainer(Object _container) throws Exception{
 //BA.debugLineNum = 254;BA.debugLine="Sub SetContainer(container As Object) As WixContex";
 //BA.debugLineNum = 255;BA.debugLine="ContextMenu.SetAttr(\"container\", container)";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("container",_container);
 //BA.debugLineNum = 256;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 257;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setcss(Object _css) throws Exception{
 //BA.debugLineNum = 259;BA.debugLine="Sub SetCss(css As Object) As WixContextMenu";
 //BA.debugLineNum = 260;BA.debugLine="ContextMenu.SetAttr(\"css\", css)";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("css",_css);
 //BA.debugLineNum = 261;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 262;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setdata(anywheresoftware.b4a.objects.collections.List _d) throws Exception{
 //BA.debugLineNum = 186;BA.debugLine="Sub SetData(d As List) As WixContextMenu";
 //BA.debugLineNum = 187;BA.debugLine="ContextMenu.SetAttr(\"data\", d)";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("data",(Object)(_d.getObject()));
 //BA.debugLineNum = 188;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 189;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setdatathrottle(Object _datathrottle) throws Exception{
 //BA.debugLineNum = 264;BA.debugLine="Sub SetDatathrottle(datathrottle As Object) As Wix";
 //BA.debugLineNum = 265;BA.debugLine="ContextMenu.SetAttr(\"datathrottle\", datathrottle)";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("datathrottle",_datathrottle);
 //BA.debugLineNum = 266;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 267;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setdatatype(Object _datatype) throws Exception{
 //BA.debugLineNum = 269;BA.debugLine="Sub SetDatatype(datatype As Object) As WixContextM";
 //BA.debugLineNum = 270;BA.debugLine="ContextMenu.SetAttr(\"datatype\", datatype)";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("datatype",_datatype);
 //BA.debugLineNum = 271;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 272;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setdisabled(boolean _disabled) throws Exception{
 //BA.debugLineNum = 274;BA.debugLine="Sub SetDisabled(disabled As Boolean) As WixContext";
 //BA.debugLineNum = 275;BA.debugLine="ContextMenu.SetAttr(\"disabled\", disabled)";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("disabled",(Object)(_disabled));
 //BA.debugLineNum = 276;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 277;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setdrag(Object _drag) throws Exception{
 //BA.debugLineNum = 279;BA.debugLine="Sub SetDrag(drag As Object) As WixContextMenu";
 //BA.debugLineNum = 280;BA.debugLine="ContextMenu.SetAttr(\"drag\", drag)";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("drag",_drag);
 //BA.debugLineNum = 281;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 282;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setdragscroll(Object _dragscroll) throws Exception{
 //BA.debugLineNum = 284;BA.debugLine="Sub SetDragscroll(dragscroll As Object) As WixCont";
 //BA.debugLineNum = 285;BA.debugLine="ContextMenu.SetAttr(\"dragscroll\", dragscroll)";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("dragscroll",_dragscroll);
 //BA.debugLineNum = 286;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 287;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setexternaldata(Object _externaldata) throws Exception{
 //BA.debugLineNum = 289;BA.debugLine="Sub SetExternalData(externalData As Object) As Wix";
 //BA.debugLineNum = 290;BA.debugLine="ContextMenu.SetAttr(\"externalData\", externalData)";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("externalData",_externaldata);
 //BA.debugLineNum = 291;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 292;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setgravity(Object _gravity) throws Exception{
 //BA.debugLineNum = 294;BA.debugLine="Sub SetGravity(gravity As Object) As WixContextMen";
 //BA.debugLineNum = 295;BA.debugLine="ContextMenu.SetAttr(\"gravity\", gravity)";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("gravity",_gravity);
 //BA.debugLineNum = 296;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 297;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _sethead(Object _head) throws Exception{
 //BA.debugLineNum = 299;BA.debugLine="Sub SetHead(head As Object) As WixContextMenu";
 //BA.debugLineNum = 300;BA.debugLine="ContextMenu.SetAttr(\"head\", head)";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("head",_head);
 //BA.debugLineNum = 301;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 302;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setheadheight(Object _headheight) throws Exception{
 //BA.debugLineNum = 304;BA.debugLine="Sub SetHeadHeight(headHeight As Object) As WixCont";
 //BA.debugLineNum = 305;BA.debugLine="ContextMenu.SetAttr(\"headHeight\", headHeight)";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("headHeight",_headheight);
 //BA.debugLineNum = 306;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 307;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="Sub SetHeight(h As Object) As WixContextMenu";
 //BA.debugLineNum = 128;BA.debugLine="ContextMenu.SetAttr(\"height\", h)";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("height",_h);
 //BA.debugLineNum = 129;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _sethidden(boolean _hidden) throws Exception{
 //BA.debugLineNum = 309;BA.debugLine="Sub SetHidden(hidden As Boolean) As WixContextMenu";
 //BA.debugLineNum = 310;BA.debugLine="ContextMenu.SetAttr(\"hidden\", hidden)";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hidden",(Object)(_hidden));
 //BA.debugLineNum = 311;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 312;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setlayout(Object _layout) throws Exception{
 //BA.debugLineNum = 314;BA.debugLine="Sub SetLayout(layout As Object) As WixContextMenu";
 //BA.debugLineNum = 315;BA.debugLine="ContextMenu.SetAttr(\"layout\", layout)";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("layout",_layout);
 //BA.debugLineNum = 316;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 317;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setlayouty(String _r) throws Exception{
 //BA.debugLineNum = 139;BA.debugLine="Sub SetLayoutY(r As String) As WixContextMenu  'ig";
 //BA.debugLineNum = 140;BA.debugLine="ContextMenu.SetAttr(\"layout\", \"y\")";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("layout",(Object)("y"));
 //BA.debugLineNum = 141;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setleft(Object _left) throws Exception{
 //BA.debugLineNum = 319;BA.debugLine="Sub SetLeft(left As Object) As WixContextMenu";
 //BA.debugLineNum = 320;BA.debugLine="ContextMenu.SetAttr(\"left\", left)";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("left",_left);
 //BA.debugLineNum = 321;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 322;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 110;BA.debugLine="Sub SetMap(m As Map) As WixContextMenu";
 //BA.debugLineNum = 111;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 112;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 113;BA.debugLine="ContextMenu.SetAttr(strKey,	strVal)";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 115;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setmaster(String _pid) throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Sub SetMaster(pID As String) As WixContextMenu";
 //BA.debugLineNum = 64;BA.debugLine="ContextMenu.SetAttr(\"master\", pID)";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("master",(Object)(_pid));
 //BA.debugLineNum = 65;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setmaxheight(Object _maxheight) throws Exception{
 //BA.debugLineNum = 324;BA.debugLine="Sub SetMaxHeight(maxHeight As Object) As WixContex";
 //BA.debugLineNum = 325;BA.debugLine="ContextMenu.SetAttr(\"maxHeight\", maxHeight)";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxHeight",_maxheight);
 //BA.debugLineNum = 326;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 327;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setmaxwidth(Object _maxwidth) throws Exception{
 //BA.debugLineNum = 329;BA.debugLine="Sub SetMaxWidth(maxWidth As Object) As WixContextM";
 //BA.debugLineNum = 330;BA.debugLine="ContextMenu.SetAttr(\"maxWidth\", maxWidth)";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxWidth",_maxwidth);
 //BA.debugLineNum = 331;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 332;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Sub SetMinHeight(h As Int) As WixContextMenu";
 //BA.debugLineNum = 96;BA.debugLine="ContextMenu.SetMinHeight(h)";
_contextmenu._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 97;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub SetMinWidth(w As Int) As WixContextMenu";
 //BA.debugLineNum = 90;BA.debugLine="ContextMenu.SetMinWidth(w)";
_contextmenu._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 91;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setmodal(boolean _modal) throws Exception{
 //BA.debugLineNum = 334;BA.debugLine="Sub SetModal(modal As Boolean) As WixContextMenu";
 //BA.debugLineNum = 335;BA.debugLine="ContextMenu.SetAttr(\"modal\", modal)";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("modal",(Object)(_modal));
 //BA.debugLineNum = 336;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 337;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setmove(boolean _move) throws Exception{
 //BA.debugLineNum = 339;BA.debugLine="Sub SetMove(move As Boolean) As WixContextMenu";
 //BA.debugLineNum = 340;BA.debugLine="ContextMenu.SetAttr(\"move\", move)";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("move",(Object)(_move));
 //BA.debugLineNum = 341;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 342;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setmultiselect(boolean _multiselect) throws Exception{
 //BA.debugLineNum = 344;BA.debugLine="Sub SetMultiselect(multiselect As Boolean) As WixC";
 //BA.debugLineNum = 345;BA.debugLine="ContextMenu.SetAttr(\"multiselect\", multiselect)";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("multiselect",(Object)(_multiselect));
 //BA.debugLineNum = 346;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 347;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setname(String _n) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub SetName(n As String) As WixContextMenu";
 //BA.debugLineNum = 71;BA.debugLine="ContextMenu.SetName(n)";
_contextmenu._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 72;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setnavigation(boolean _navigation) throws Exception{
 //BA.debugLineNum = 349;BA.debugLine="Sub SetNavigation(navigation As Boolean) As WixCon";
 //BA.debugLineNum = 350;BA.debugLine="ContextMenu.SetAttr(\"navigation\", navigation)";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("navigation",(Object)(_navigation));
 //BA.debugLineNum = 351;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 352;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 354;BA.debugLine="Sub SetPadding(padding As Object) As WixContextMen";
 //BA.debugLineNum = 355;BA.debugLine="ContextMenu.SetAttr(\"padding\", padding)";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("padding",_padding);
 //BA.debugLineNum = 356;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 357;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setpager(Object _pager) throws Exception{
 //BA.debugLineNum = 359;BA.debugLine="Sub SetPager(pager As Object) As WixContextmenu";
 //BA.debugLineNum = 360;BA.debugLine="Contextmenu.SetAttr(\"pager\", pager)";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("pager",_pager);
 //BA.debugLineNum = 361;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 362;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Sub SetParent(p As WixElement) As WixContextMenu";
 //BA.debugLineNum = 23;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 24;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setpoint(boolean _point) throws Exception{
 //BA.debugLineNum = 364;BA.debugLine="Sub SetPoint(point As Boolean) As WixContextmenu";
 //BA.debugLineNum = 365;BA.debugLine="Contextmenu.SetAttr(\"point\", point)";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("point",(Object)(_point));
 //BA.debugLineNum = 366;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 367;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setposition(Object _position) throws Exception{
 //BA.debugLineNum = 369;BA.debugLine="Sub SetPosition(position As Object) As WixContextm";
 //BA.debugLineNum = 370;BA.debugLine="Contextmenu.SetAttr(\"position\", position)";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("position",_position);
 //BA.debugLineNum = 371;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 372;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setready(Object _ready) throws Exception{
 //BA.debugLineNum = 374;BA.debugLine="Sub SetReady(ready As Object) As WixContextmenu";
 //BA.debugLineNum = 375;BA.debugLine="Contextmenu.SetAttr(\"ready\", ready)";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("ready",_ready);
 //BA.debugLineNum = 376;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 377;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setrelative(Object _relative) throws Exception{
 //BA.debugLineNum = 379;BA.debugLine="Sub SetRelative(relative As Object) As WixContextm";
 //BA.debugLineNum = 380;BA.debugLine="Contextmenu.SetAttr(\"relative\", relative)";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("relative",_relative);
 //BA.debugLineNum = 381;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 382;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setremovemissed(boolean _removemissed) throws Exception{
 //BA.debugLineNum = 384;BA.debugLine="Sub SetRemoveMissed(removeMissed As Boolean) As Wi";
 //BA.debugLineNum = 385;BA.debugLine="Contextmenu.SetAttr(\"removeMissed\", removeMissed)";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("removeMissed",(Object)(_removemissed));
 //BA.debugLineNum = 386;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 387;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setresize(boolean _resize) throws Exception{
 //BA.debugLineNum = 389;BA.debugLine="Sub SetResize(resize As Boolean) As WixContextmenu";
 //BA.debugLineNum = 390;BA.debugLine="Contextmenu.SetAttr(\"resize\", resize)";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("resize",(Object)(_resize));
 //BA.debugLineNum = 391;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 392;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Sub SetResponsive(b As Object) As WixContextMenu";
 //BA.debugLineNum = 77;BA.debugLine="ContextMenu.SetResponsive(b)";
_contextmenu._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 78;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixContextMe";
 //BA.debugLineNum = 83;BA.debugLine="ContextMenu.SetResponsiveCell(b)";
_contextmenu._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 84;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setrules(Object _rules) throws Exception{
 //BA.debugLineNum = 394;BA.debugLine="Sub SetRules(rules As Object) As WixContextmenu";
 //BA.debugLineNum = 395;BA.debugLine="Contextmenu.SetAttr(\"rules\", rules)";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("rules",_rules);
 //BA.debugLineNum = 396;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 397;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setsave(Object _save) throws Exception{
 //BA.debugLineNum = 399;BA.debugLine="Sub SetSave(save As Object) As WixContextMenu";
 //BA.debugLineNum = 400;BA.debugLine="ContextMenu.SetAttr(\"save\", save)";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("save",_save);
 //BA.debugLineNum = 401;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 402;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setscheme(Object _scheme) throws Exception{
 //BA.debugLineNum = 404;BA.debugLine="Sub SetScheme(scheme As Object) As WixContextMenu";
 //BA.debugLineNum = 405;BA.debugLine="ContextMenu.SetAttr(\"scheme\", scheme)";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("scheme",_scheme);
 //BA.debugLineNum = 406;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 407;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setscroll(Object _scroll) throws Exception{
 //BA.debugLineNum = 409;BA.debugLine="Sub SetScroll(scroll As Object) As WixContextMenu";
 //BA.debugLineNum = 410;BA.debugLine="ContextMenu.SetAttr(\"scroll\", scroll)";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("scroll",_scroll);
 //BA.debugLineNum = 411;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 412;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setscrollspeed(Object _scrollspeed) throws Exception{
 //BA.debugLineNum = 414;BA.debugLine="Sub SetScrollSpeed(scrollSpeed As Object) As WixCo";
 //BA.debugLineNum = 415;BA.debugLine="ContextMenu.SetAttr(\"scrollSpeed\", scrollSpeed)";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("scrollSpeed",_scrollspeed);
 //BA.debugLineNum = 416;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 417;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setselect(boolean _b) throws Exception{
 //BA.debugLineNum = 192;BA.debugLine="Sub SetSelect(b As Boolean) As WixContextMenu";
 //BA.debugLineNum = 193;BA.debugLine="ContextMenu.SetAttr(\"select\", b)";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("select",(Object)(_b));
 //BA.debugLineNum = 194;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 195;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 45;BA.debugLine="ContextMenu.SetStyle(prop,sval)";
_contextmenu._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 46;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 35;BA.debugLine="Sub SetStyles(m As Map) As WixContextMenu";
 //BA.debugLineNum = 36;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 37;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 38;BA.debugLine="ContextMenu.SetStyle(k,v)";
_contextmenu._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 40;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setsubmenuconfig(Object _submenuconfig) throws Exception{
 //BA.debugLineNum = 424;BA.debugLine="Sub SetSubmenuConfig(submenuConfig As Object) As W";
 //BA.debugLineNum = 425;BA.debugLine="ContextMenu.SetAttr(\"submenuConfig\", submenuConfig";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("submenuConfig",_submenuconfig);
 //BA.debugLineNum = 426;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 427;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setsubmenupos(Object _submenupos) throws Exception{
 //BA.debugLineNum = 419;BA.debugLine="Sub SetSubMenuPos(subMenuPos As Object) As WixCont";
 //BA.debugLineNum = 420;BA.debugLine="ContextMenu.SetAttr(\"subMenuPos\", subMenuPos)";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("subMenuPos",_submenupos);
 //BA.debugLineNum = 421;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 422;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setsubmenuposright(String _r) throws Exception{
 //BA.debugLineNum = 120;BA.debugLine="Sub SetSubMenuPosRight(r As String) As WixContextM";
 //BA.debugLineNum = 121;BA.debugLine="ContextMenu.SetAttr(\"subMenuPos\", \"right\")";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("subMenuPos",(Object)("right"));
 //BA.debugLineNum = 122;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _settemplate(String _t) throws Exception{
 //BA.debugLineNum = 151;BA.debugLine="Sub SetTemplate(t As String) As WixContextMenu";
 //BA.debugLineNum = 152;BA.debugLine="ContextMenu.SetAttr(\"template\", t)";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("template",(Object)(_t));
 //BA.debugLineNum = 153;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 55;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixContext";
 //BA.debugLineNum = 56;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 57;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 58;BA.debugLine="ContextMenu.SetTemplate(os)";
_contextmenu._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 59;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _settofront(boolean _tofront) throws Exception{
 //BA.debugLineNum = 429;BA.debugLine="Sub SetToFront(toFront As Boolean) As WixContextMe";
 //BA.debugLineNum = 430;BA.debugLine="ContextMenu.SetAttr(\"toFront\", toFront)";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("toFront",(Object)(_tofront));
 //BA.debugLineNum = 431;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 432;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _settooltip(Object _tooltip) throws Exception{
 //BA.debugLineNum = 434;BA.debugLine="Sub SetTooltip(tooltip As Object) As WixContextMen";
 //BA.debugLineNum = 435;BA.debugLine="ContextMenu.SetAttr(\"tooltip\", tooltip)";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("tooltip",_tooltip);
 //BA.debugLineNum = 436;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 437;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _settop(Object _top) throws Exception{
 //BA.debugLineNum = 439;BA.debugLine="Sub SetTop(top As Object) As WixContextMenu";
 //BA.debugLineNum = 440;BA.debugLine="ContextMenu.SetAttr(\"top\", top)";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("top",_top);
 //BA.debugLineNum = 441;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 442;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _settype(Object _stype) throws Exception{
 //BA.debugLineNum = 444;BA.debugLine="Sub SetType(sType As Object) As WixContextMenu";
 //BA.debugLineNum = 445;BA.debugLine="ContextMenu.SetAttr(\"type\", sType)";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("type",_stype);
 //BA.debugLineNum = 446;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 447;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _seturl(Object _url) throws Exception{
 //BA.debugLineNum = 449;BA.debugLine="Sub SetUrl(url As Object) As WixContextMenu";
 //BA.debugLineNum = 450;BA.debugLine="ContextMenu.SetAttr(\"url\", url)";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("url",_url);
 //BA.debugLineNum = 451;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 452;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Sub SetWidth(w As Object) As WixContextMenu";
 //BA.debugLineNum = 134;BA.debugLine="ContextMenu.SetAttr(\"width\", w)";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("width",_w);
 //BA.debugLineNum = 135;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setxcount(Object _xcount) throws Exception{
 //BA.debugLineNum = 454;BA.debugLine="Sub SetXCount(xCount As Object) As WixContextMenu";
 //BA.debugLineNum = 455;BA.debugLine="ContextMenu.SetAttr(\"xCount\", xCount)";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("xCount",_xcount);
 //BA.debugLineNum = 456;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 457;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setycount(Object _ycount) throws Exception{
 //BA.debugLineNum = 459;BA.debugLine="Sub SetYCount(yCount As Object) As WixContextMenu";
 //BA.debugLineNum = 460;BA.debugLine="ContextMenu.SetAttr(\"yCount\", yCount)";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("yCount",_ycount);
 //BA.debugLineNum = 461;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 462;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _setzindex(Object _zindex) throws Exception{
 //BA.debugLineNum = 464;BA.debugLine="Sub SetZIndex(zIndex As Object) As WixContextMenu";
 //BA.debugLineNum = 465;BA.debugLine="ContextMenu.SetAttr(\"zIndex\", zIndex)";
_contextmenu._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("zIndex",_zindex);
 //BA.debugLineNum = 466;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontextmenu)(this);
 //BA.debugLineNum = 467;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
