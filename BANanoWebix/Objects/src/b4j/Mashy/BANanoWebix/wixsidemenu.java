package b4j.Mashy.BANanoWebix;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixsidemenu extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebix", "b4j.Mashy.BANanoWebix.wixsidemenu", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebix.wixsidemenu.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebix.wixelement _sidemenu = null;
public b4j.Mashy.BANanoWebix.wixelement _body = null;
public anywheresoftware.b4a.objects.collections.List _data = null;
public anywheresoftware.b4a.objects.collections.Map _typeof = null;
public b4j.Mashy.BANanoWebix.main _main = null;
public b4j.Mashy.BANanoWebix.wixsidemenu  _additem(String _meid,String _mvalue,String _mhref,String _micon,String _badge,String _target) throws Exception{
anywheresoftware.b4a.objects.collections.Map _mitem = null;
 //BA.debugLineNum = 21;BA.debugLine="Sub AddItem(meID As String, mValue As String, mhre";
 //BA.debugLineNum = 22;BA.debugLine="meID = meID.tolowercase";
_meid = _meid.toLowerCase();
 //BA.debugLineNum = 23;BA.debugLine="Dim mitem As Map = CreateMap()";
_mitem = new anywheresoftware.b4a.objects.collections.Map();
_mitem = __c.createMap(new Object[] {});
 //BA.debugLineNum = 24;BA.debugLine="mitem.Put(\"id\", meID)";
_mitem.Put((Object)("id"),(Object)(_meid));
 //BA.debugLineNum = 25;BA.debugLine="mitem.Put(\"value\", mValue)";
_mitem.Put((Object)("value"),(Object)(_mvalue));
 //BA.debugLineNum = 26;BA.debugLine="mitem.Put(\"href\", mhref)";
_mitem.Put((Object)("href"),(Object)(_mhref));
 //BA.debugLineNum = 27;BA.debugLine="mitem.Put(\"badge\", badge)";
_mitem.Put((Object)("badge"),(Object)(_badge));
 //BA.debugLineNum = 28;BA.debugLine="mitem.Put(\"target\", target)";
_mitem.Put((Object)("target"),(Object)(_target));
 //BA.debugLineNum = 29;BA.debugLine="mitem.Put(\"icon\", mIcon)";
_mitem.Put((Object)("icon"),(Object)(_micon));
 //BA.debugLineNum = 30;BA.debugLine="data.Add(mitem)";
_data.Add((Object)(_mitem.getObject()));
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixsidemenu)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public SideMenu As WixElement";
_sidemenu = new b4j.Mashy.BANanoWebix.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private body As WixElement";
_body = new b4j.Mashy.BANanoWebix.wixelement();
 //BA.debugLineNum = 6;BA.debugLine="Private data As List";
_data = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 7;BA.debugLine="Private typeOf As Map";
_typeof = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebix.wixsidemenu  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(sid As String) As WixSideMen";
 //BA.debugLineNum = 12;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 13;BA.debugLine="SideMenu.Initialize(sid).SetView(\"sidemenu\")";
_sidemenu._initialize /*b4j.Mashy.BANanoWebix.wixelement*/ (ba,_sid)._setview /*b4j.Mashy.BANanoWebix.wixelement*/ ("sidemenu");
 //BA.debugLineNum = 14;BA.debugLine="body.Initialize(ID & \"body\").SetView(\"list\").SetB";
_body._initialize /*b4j.Mashy.BANanoWebix.wixelement*/ (ba,_id+"body")._setview /*b4j.Mashy.BANanoWebix.wixelement*/ ("list")._setborderless /*b4j.Mashy.BANanoWebix.wixelement*/ (__c.True)._setscroll /*b4j.Mashy.BANanoWebix.wixelement*/ (__c.False)._setselect /*b4j.Mashy.BANanoWebix.wixelement*/ (__c.True);
 //BA.debugLineNum = 15;BA.debugLine="data.Initialize";
_data.Initialize();
 //BA.debugLineNum = 16;BA.debugLine="typeOf.Initialize";
_typeof.Initialize();
 //BA.debugLineNum = 17;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixsidemenu)(this);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 43;BA.debugLine="body.SetAttr(\"type\", typeOf)";
_body._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("type",(Object)(_typeof.getObject()));
 //BA.debugLineNum = 44;BA.debugLine="body.SetData(data)";
_body._setdata /*b4j.Mashy.BANanoWebix.wixelement*/ (_data);
 //BA.debugLineNum = 45;BA.debugLine="SideMenu.SetAttr(\"body\", body.item)";
_sidemenu._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("body",(Object)(_body._item /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 46;BA.debugLine="Return SideMenu.item";
if (true) return _sidemenu._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixsidemenu  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub SetHeight(h As Object) As WixSideMenu";
 //BA.debugLineNum = 58;BA.debugLine="SideMenu.SetAttr(\"height\", h)";
_sidemenu._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("height",_h);
 //BA.debugLineNum = 59;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixsidemenu)(this);
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixsidemenu  _setitemheight(int _h) throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub SetItemHeight(h As Int) As WixSideMenu";
 //BA.debugLineNum = 65;BA.debugLine="typeOf.Put(\"height\", h)";
_typeof.Put((Object)("height"),(Object)(_h));
 //BA.debugLineNum = 66;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixsidemenu)(this);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixsidemenu  _setitemwidth(int _w) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub SetItemWidth(w As Int) As WixSideMenu";
 //BA.debugLineNum = 71;BA.debugLine="typeOf.Put(\"width\", w)";
_typeof.Put((Object)("width"),(Object)(_w));
 //BA.debugLineNum = 72;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixsidemenu)(this);
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixsidemenu  _setlayoutx(boolean _h) throws Exception{
 //BA.debugLineNum = 77;BA.debugLine="Sub SetLayoutX(h As Boolean) As WixSideMenu   'ign";
 //BA.debugLineNum = 78;BA.debugLine="body.SetAttr(\"layout\", \"x\")";
_body._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("layout",(Object)("x"));
 //BA.debugLineNum = 79;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixsidemenu)(this);
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixsidemenu  _setposition(String _c) throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Sub SetPosition(c As String) As WixSideMenu";
 //BA.debugLineNum = 123;BA.debugLine="SideMenu.SetAttr(\"position\", c)";
_sidemenu._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("position",(Object)(_c));
 //BA.debugLineNum = 124;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixsidemenu)(this);
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixsidemenu  _setpositionbottom(String _c) throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Sub SetPositionBottom(c As String) As WixSideMenu";
 //BA.debugLineNum = 116;BA.debugLine="SideMenu.SetAttr(\"position\", \"bottom\")";
_sidemenu._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("position",(Object)("bottom"));
 //BA.debugLineNum = 117;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixsidemenu)(this);
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixsidemenu  _setpositionleft(String _c) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Sub SetPositionLeft(c As String) As WixSideMenu  '";
 //BA.debugLineNum = 104;BA.debugLine="SideMenu.SetAttr(\"position\", \"left\")";
_sidemenu._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("position",(Object)("left"));
 //BA.debugLineNum = 105;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixsidemenu)(this);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixsidemenu  _setpositionright(String _c) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub SetPositionRight(c As String) As WixSideMenu";
 //BA.debugLineNum = 98;BA.debugLine="SideMenu.SetAttr(\"position\", \"right\")";
_sidemenu._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("position",(Object)("right"));
 //BA.debugLineNum = 99;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixsidemenu)(this);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixsidemenu  _setpositiontop(String _c) throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Sub SetPositionTop(c As String) As WixSideMenu  'i";
 //BA.debugLineNum = 110;BA.debugLine="SideMenu.SetAttr(\"position\", \"top\")";
_sidemenu._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("position",(Object)("top"));
 //BA.debugLineNum = 111;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixsidemenu)(this);
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixsidemenu  _setscroll(boolean _b) throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Sub SetScroll(b As Boolean) As WixSideMenu";
 //BA.debugLineNum = 37;BA.debugLine="SideMenu.SetProperty(\"scroll\", b)";
_sidemenu._setproperty /*b4j.Mashy.BANanoWebix.wixelement*/ ("scroll",(Object)(_b));
 //BA.debugLineNum = 38;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixsidemenu)(this);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixsidemenu  _setselect(Object _s) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub SetSelect(s As Object) As WixSideMenu";
 //BA.debugLineNum = 92;BA.debugLine="SideMenu.SetAttr(\"select\", s)";
_sidemenu._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("select",_s);
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixsidemenu)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixsidemenu  _settemplate(String _t) throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Sub SetTemplate(t As String) As WixSideMenu";
 //BA.debugLineNum = 51;BA.debugLine="body.SetTemplate(t)";
_body._settemplate /*b4j.Mashy.BANanoWebix.wixelement*/ ((Object)(_t));
 //BA.debugLineNum = 52;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixsidemenu)(this);
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixsidemenu  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub SetWidth(w As Object) As WixSideMenu";
 //BA.debugLineNum = 85;BA.debugLine="SideMenu.SetAttr(\"width\", w)";
_sidemenu._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("width",_w);
 //BA.debugLineNum = 86;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixsidemenu)(this);
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
