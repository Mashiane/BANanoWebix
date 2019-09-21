package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixwindow extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixwindow", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixwindow.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _window = null;
public b4j.Mashy.BANanoWebixDemo.wixtoolbar _toolbar = null;
public String _toolbarid = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
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
 //BA.debugLineNum = 4;BA.debugLine="Public Window As WixElement";
_window = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Public ToolBar As WixToolBar";
_toolbar = new b4j.Mashy.BANanoWebixDemo.wixtoolbar();
 //BA.debugLineNum = 6;BA.debugLine="Public ToolBarID As String";
_toolbarid = "";
 //BA.debugLineNum = 7;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixwindow  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(sid As String) As WixWindow";
 //BA.debugLineNum = 12;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 13;BA.debugLine="ToolBarID = ID & \"tblbar\"";
_toolbarid = _id+"tblbar";
 //BA.debugLineNum = 14;BA.debugLine="Window.Initialize(ID).SetView(\"window\")";
_window._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_id)._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("window");
 //BA.debugLineNum = 15;BA.debugLine="ToolBar.Initialize(ToolBarID)";
_toolbar._initialize /*b4j.Mashy.BANanoWebixDemo.wixtoolbar*/ (ba,_toolbarid);
 //BA.debugLineNum = 16;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 17;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixwindow)(this);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 134;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 135;BA.debugLine="Return Window.item";
if (true) return _window._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 53;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixwindow  _setanimate(boolean _animate) throws Exception{
 //BA.debugLineNum = 213;BA.debugLine="Sub SetAnimate(animate As Boolean) As WixWindow";
 //BA.debugLineNum = 214;BA.debugLine="Window.SetAttr(\"animate\", animate)";
_window._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("animate",(Object)(_animate));
 //BA.debugLineNum = 215;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixwindow)(this);
 //BA.debugLineNum = 216;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixwindow  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 21;BA.debugLine="Sub SetAttributes(m As Map) As WixWindow";
 //BA.debugLineNum = 22;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 23;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 24;BA.debugLine="Window.SetAttr(k,v)";
_window._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 26;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixwindow)(this);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixwindow  _setautofit(boolean _autofit) throws Exception{
 //BA.debugLineNum = 218;BA.debugLine="Sub SetAutofit(autofit As Boolean) As WixWindow";
 //BA.debugLineNum = 219;BA.debugLine="Window.SetAttr(\"autofit\", autofit)";
_window._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("autofit",(Object)(_autofit));
 //BA.debugLineNum = 220;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixwindow)(this);
 //BA.debugLineNum = 221;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixwindow  _setautofocus(boolean _autofocus) throws Exception{
 //BA.debugLineNum = 223;BA.debugLine="Sub SetAutofocus(autofocus As Boolean) As WixWindo";
 //BA.debugLineNum = 224;BA.debugLine="Window.SetAttr(\"autofocus\", autofocus)";
_window._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("autofocus",(Object)(_autofocus));
 //BA.debugLineNum = 225;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixwindow)(this);
 //BA.debugLineNum = 226;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixwindow  _setbody(Object _b) throws Exception{
 //BA.debugLineNum = 147;BA.debugLine="Sub SetBody(b As Object) As WixWindow";
 //BA.debugLineNum = 148;BA.debugLine="Window.SetAttr(\"body\", b)";
_window._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("body",_b);
 //BA.debugLineNum = 149;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixwindow)(this);
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixwindow  _setborderless(boolean _borderless) throws Exception{
 //BA.debugLineNum = 228;BA.debugLine="Sub SetBorderless(borderless As Boolean) As WixWin";
 //BA.debugLineNum = 229;BA.debugLine="Window.SetAttr(\"borderless\", borderless)";
_window._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("borderless",(Object)(_borderless));
 //BA.debugLineNum = 230;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixwindow)(this);
 //BA.debugLineNum = 231;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixwindow  _setclose(boolean _b) throws Exception{
 //BA.debugLineNum = 185;BA.debugLine="Sub SetClose(b As Boolean) As WixWindow";
 //BA.debugLineNum = 186;BA.debugLine="Window.SetAttr(\"close\", b)";
_window._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("close",(Object)(_b));
 //BA.debugLineNum = 187;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixwindow)(this);
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixwindow  _setcontainer(Object _container) throws Exception{
 //BA.debugLineNum = 233;BA.debugLine="Sub SetContainer(container As Object) As WixWindow";
 //BA.debugLineNum = 234;BA.debugLine="Window.SetAttr(\"container\", container)";
_window._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("container",_container);
 //BA.debugLineNum = 235;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixwindow)(this);
 //BA.debugLineNum = 236;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixwindow  _setcss(Object _css) throws Exception{
 //BA.debugLineNum = 238;BA.debugLine="Sub SetCss(css As Object) As WixWindow";
 //BA.debugLineNum = 239;BA.debugLine="Window.SetAttr(\"css\", css)";
_window._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("css",_css);
 //BA.debugLineNum = 240;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixwindow)(this);
 //BA.debugLineNum = 241;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixwindow  _setdisabled(boolean _disabled) throws Exception{
 //BA.debugLineNum = 243;BA.debugLine="Sub SetDisabled(disabled As Boolean) As WixWindow";
 //BA.debugLineNum = 244;BA.debugLine="Window.SetAttr(\"disabled\", disabled)";
_window._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("disabled",(Object)(_disabled));
 //BA.debugLineNum = 245;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixwindow)(this);
 //BA.debugLineNum = 246;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixwindow  _setfullscreen(boolean _b) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Sub SetFullScreen(b As Boolean) As WixWindow";
 //BA.debugLineNum = 104;BA.debugLine="Window.SetAttr(\"fullscreen\", b)";
_window._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("fullscreen",(Object)(_b));
 //BA.debugLineNum = 105;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixwindow)(this);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixwindow  _setgravity(Object _gravity) throws Exception{
 //BA.debugLineNum = 248;BA.debugLine="Sub SetGravity(gravity As Object) As WixWindow";
 //BA.debugLineNum = 249;BA.debugLine="Window.SetAttr(\"gravity\", gravity)";
_window._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("gravity",_gravity);
 //BA.debugLineNum = 250;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixwindow)(this);
 //BA.debugLineNum = 251;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixwindow  _sethead(String _hdr) throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Sub SetHead(hdr As String) As WixWindow";
 //BA.debugLineNum = 123;BA.debugLine="Window.SetAttr(\"head\", hdr)";
_window._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("head",(Object)(_hdr));
 //BA.debugLineNum = 124;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixwindow)(this);
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixwindow  _setheadheight(Object _headheight) throws Exception{
 //BA.debugLineNum = 253;BA.debugLine="Sub SetHeadHeight(headHeight As Object) As WixWind";
 //BA.debugLineNum = 254;BA.debugLine="Window.SetAttr(\"headHeight\", headHeight)";
_window._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("headHeight",_headheight);
 //BA.debugLineNum = 255;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixwindow)(this);
 //BA.debugLineNum = 256;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixwindow  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 179;BA.debugLine="Sub SetHeight(h As Object) As WixWindow";
 //BA.debugLineNum = 180;BA.debugLine="Window.SetAttr(\"height\", h)";
_window._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("height",_h);
 //BA.debugLineNum = 181;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixwindow)(this);
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixwindow  _sethidden(boolean _hidden) throws Exception{
 //BA.debugLineNum = 258;BA.debugLine="Sub SetHidden(hidden As Boolean) As WixWindow";
 //BA.debugLineNum = 259;BA.debugLine="Window.SetAttr(\"hidden\", hidden)";
_window._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hidden",(Object)(_hidden));
 //BA.debugLineNum = 260;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixwindow)(this);
 //BA.debugLineNum = 261;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixwindow  _setleft(int _t) throws Exception{
 //BA.debugLineNum = 173;BA.debugLine="Sub SetLeft(t As Int) As WixWindow";
 //BA.debugLineNum = 174;BA.debugLine="Window.SetAttr(\"left\", t)";
_window._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("left",(Object)(_t));
 //BA.debugLineNum = 175;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixwindow)(this);
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixwindow  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 94;BA.debugLine="Sub SetMap(m As Map) As WixWindow";
 //BA.debugLineNum = 95;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 96;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 97;BA.debugLine="Window.SetAttr(strKey,	strVal)";
_window._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 99;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixwindow)(this);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixwindow  _setmaster(Object _master) throws Exception{
 //BA.debugLineNum = 263;BA.debugLine="Sub SetMaster(master As Object) As WixWindow";
 //BA.debugLineNum = 264;BA.debugLine="Window.SetAttr(\"master\", master)";
_window._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("master",_master);
 //BA.debugLineNum = 265;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixwindow)(this);
 //BA.debugLineNum = 266;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixwindow  _setmaxheight(Object _maxheight) throws Exception{
 //BA.debugLineNum = 268;BA.debugLine="Sub SetMaxHeight(maxHeight As Object) As WixWindow";
 //BA.debugLineNum = 269;BA.debugLine="Window.SetAttr(\"maxHeight\", maxHeight)";
_window._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxHeight",_maxheight);
 //BA.debugLineNum = 270;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixwindow)(this);
 //BA.debugLineNum = 271;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixwindow  _setmaxwidth(Object _maxwidth) throws Exception{
 //BA.debugLineNum = 273;BA.debugLine="Sub SetMaxWidth(maxWidth As Object) As WixWindow";
 //BA.debugLineNum = 274;BA.debugLine="Window.SetAttr(\"maxWidth\", maxWidth)";
_window._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxWidth",_maxwidth);
 //BA.debugLineNum = 275;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixwindow)(this);
 //BA.debugLineNum = 276;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixwindow  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Sub SetMinHeight(h As Int) As WixWindow";
 //BA.debugLineNum = 89;BA.debugLine="Window.SetMinHeight(h)";
_window._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 90;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixwindow)(this);
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixwindow  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Sub SetMinWidth(w As Int) As WixWindow";
 //BA.debugLineNum = 83;BA.debugLine="Window.SetMinWidth(w)";
_window._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 84;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixwindow)(this);
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixwindow  _setmodal(boolean _b) throws Exception{
 //BA.debugLineNum = 116;BA.debugLine="Sub SetModal(b As Boolean) As WixWindow";
 //BA.debugLineNum = 117;BA.debugLine="Window.SetAttr(\"modal\", b)";
_window._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("modal",(Object)(_b));
 //BA.debugLineNum = 118;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixwindow)(this);
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixwindow  _setmove(boolean _t) throws Exception{
 //BA.debugLineNum = 159;BA.debugLine="Sub SetMove(t As Boolean) As WixWindow";
 //BA.debugLineNum = 160;BA.debugLine="Window.SetAttr(\"move\", t)";
_window._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("move",(Object)(_t));
 //BA.debugLineNum = 161;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixwindow)(this);
 //BA.debugLineNum = 162;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixwindow  _setname(String _n) throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Sub SetName(n As String) As WixWindow";
 //BA.debugLineNum = 64;BA.debugLine="Window.SetName(n)";
_window._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 65;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixwindow)(this);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixwindow  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 278;BA.debugLine="Sub SetPadding(padding As Object) As WixWindow";
 //BA.debugLineNum = 279;BA.debugLine="Window.SetAttr(\"padding\", padding)";
_window._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("padding",_padding);
 //BA.debugLineNum = 280;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixwindow)(this);
 //BA.debugLineNum = 281;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixwindow  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Sub SetParent(p As WixElement) As WixWindow";
 //BA.debugLineNum = 46;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 47;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixwindow)(this);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixwindow  _setpoint(boolean _point) throws Exception{
 //BA.debugLineNum = 283;BA.debugLine="Sub SetPoint(point As Boolean) As WixWindow";
 //BA.debugLineNum = 284;BA.debugLine="Window.SetAttr(\"point\", point)";
_window._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("point",(Object)(_point));
 //BA.debugLineNum = 285;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixwindow)(this);
 //BA.debugLineNum = 286;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixwindow  _setposition(Object _position) throws Exception{
 //BA.debugLineNum = 289;BA.debugLine="Sub SetPosition(position As Object) As WixWindow";
 //BA.debugLineNum = 290;BA.debugLine="Window.SetAttr(\"position\", position)";
_window._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("position",_position);
 //BA.debugLineNum = 291;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixwindow)(this);
 //BA.debugLineNum = 292;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixwindow  _setpositioncenter(boolean _b) throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Sub SetPositionCenter(b As Boolean) As WixWindow";
 //BA.debugLineNum = 110;BA.debugLine="Window.SetAttr(\"position\", \"center\")";
_window._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("position",(Object)("center"));
 //BA.debugLineNum = 111;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixwindow)(this);
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixwindow  _setrelative(Object _relative) throws Exception{
 //BA.debugLineNum = 294;BA.debugLine="Sub SetRelative(relative As Object) As WixWindow";
 //BA.debugLineNum = 295;BA.debugLine="Window.SetAttr(\"relative\", relative)";
_window._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("relative",_relative);
 //BA.debugLineNum = 296;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixwindow)(this);
 //BA.debugLineNum = 297;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixwindow  _setresize(boolean _t) throws Exception{
 //BA.debugLineNum = 153;BA.debugLine="Sub SetResize(t As Boolean) As WixWindow";
 //BA.debugLineNum = 154;BA.debugLine="Window.SetAttr(\"resize\", t)";
_window._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("resize",(Object)(_t));
 //BA.debugLineNum = 155;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixwindow)(this);
 //BA.debugLineNum = 156;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixwindow  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Sub SetResponsive(b As Object) As WixWindow";
 //BA.debugLineNum = 70;BA.debugLine="Window.SetResponsive(b)";
_window._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 71;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixwindow)(this);
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixwindow  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixWindow";
 //BA.debugLineNum = 76;BA.debugLine="Window.SetResponsiveCell(b)";
_window._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 77;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixwindow)(this);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixwindow  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 39;BA.debugLine="Window.SetStyle(prop,sval)";
_window._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 40;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixwindow)(this);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixwindow  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 29;BA.debugLine="Sub SetStyles(m As Map) As WixWindow";
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
 //BA.debugLineNum = 32;BA.debugLine="Window.SetStyle(k,v)";
_window._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 34;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixwindow)(this);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixwindow  _settemplate(Object _t) throws Exception{
anywheresoftware.b4a.objects.collections.Map _body = null;
 //BA.debugLineNum = 139;BA.debugLine="Sub SetTemplate(t As Object) As WixWindow";
 //BA.debugLineNum = 140;BA.debugLine="Dim body As Map = CreateMap()";
_body = new anywheresoftware.b4a.objects.collections.Map();
_body = __c.createMap(new Object[] {});
 //BA.debugLineNum = 141;BA.debugLine="body.Put(\"template\", t)";
_body.Put((Object)("template"),_t);
 //BA.debugLineNum = 142;BA.debugLine="Window.SetAttr(\"body\", body)";
_window._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("body",(Object)(_body.getObject()));
 //BA.debugLineNum = 143;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixwindow)(this);
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixwindow  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 56;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixWindow";
 //BA.debugLineNum = 57;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 58;BA.debugLine="SetTemplate(os)";
_settemplate((Object)(_os));
 //BA.debugLineNum = 59;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixwindow)(this);
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixwindow  _settofront(boolean _tofront) throws Exception{
 //BA.debugLineNum = 299;BA.debugLine="Sub SetToFront(toFront As Boolean) As WixWindow";
 //BA.debugLineNum = 300;BA.debugLine="Window.SetAttr(\"toFront\", toFront)";
_window._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("toFront",(Object)(_tofront));
 //BA.debugLineNum = 301;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixwindow)(this);
 //BA.debugLineNum = 302;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixwindow  _settoolbar(boolean _b) throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Sub SetToolBar(b As Boolean) As WixWindow  'ignore";
 //BA.debugLineNum = 129;BA.debugLine="Window.SetAttr(\"head\", ToolBar.Item)";
_window._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("head",(Object)(_toolbar._item /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 130;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixwindow)(this);
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixwindow  _settop(int _t) throws Exception{
 //BA.debugLineNum = 166;BA.debugLine="Sub SetTop(t As Int) As WixWindow";
 //BA.debugLineNum = 167;BA.debugLine="Window.SetAttr(\"top\", t)";
_window._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("top",(Object)(_t));
 //BA.debugLineNum = 168;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixwindow)(this);
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixwindow  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 192;BA.debugLine="Sub SetWidth(w As Object) As WixWindow";
 //BA.debugLineNum = 193;BA.debugLine="Window.SetAttr(\"width\", w)";
_window._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("width",_w);
 //BA.debugLineNum = 194;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixwindow)(this);
 //BA.debugLineNum = 195;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixwindow  _setzindex(Object _zindex) throws Exception{
 //BA.debugLineNum = 305;BA.debugLine="Sub SetZindex(zindex As Object) As WixWindow";
 //BA.debugLineNum = 306;BA.debugLine="Window.SetAttr(\"zindex\", zindex)";
_window._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("zindex",_zindex);
 //BA.debugLineNum = 307;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixwindow)(this);
 //BA.debugLineNum = 308;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
