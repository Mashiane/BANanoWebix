package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixpopup extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixpopup", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixpopup.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _popup = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.wixmenu _menu = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 156;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 157;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 161;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 162;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 163;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 151;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 152;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Popup As WixElement";
_popup = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 6;BA.debugLine="Public Menu As WixMenu";
_menu = new b4j.Mashy.BANanoWebixDemo.wixmenu();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixpopup  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(sid As String) As WixPopUp";
 //BA.debugLineNum = 11;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 12;BA.debugLine="Popup.Initialize(ID).setview(\"popup\")";
_popup._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_id)._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("popup");
 //BA.debugLineNum = 13;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 14;BA.debugLine="Menu.Initialize($\"${ID}-menu\"$)";
_menu._initialize /*b4j.Mashy.BANanoWebixDemo.wixmenu*/ (ba,(""+__c.SmartStringFormatter("",(Object)(_id))+"-menu"));
 //BA.debugLineNum = 15;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpopup)(this);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 132;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 133;BA.debugLine="If Menu.HasContent Then";
if (_menu._hascontent /*boolean*/ ) { 
 //BA.debugLineNum = 134;BA.debugLine="Menu.setautoheight(True)";
_menu._setautoheight /*b4j.Mashy.BANanoWebixDemo.wixmenu*/ (__c.True);
 //BA.debugLineNum = 135;BA.debugLine="Menu.SetSelect(True)";
_menu._setselect /*b4j.Mashy.BANanoWebixDemo.wixmenu*/ ((Object)(__c.True));
 //BA.debugLineNum = 136;BA.debugLine="Popup.SetAttr(\"head\", \"Submenu\")";
_popup._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("head",(Object)("Submenu"));
 //BA.debugLineNum = 137;BA.debugLine="Menu.SetLayout(\"y\")";
_menu._setlayout /*b4j.Mashy.BANanoWebixDemo.wixmenu*/ ((Object)("y"));
 //BA.debugLineNum = 138;BA.debugLine="SetBody(Menu.Item)";
_setbody((Object)(_menu._item /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 };
 //BA.debugLineNum = 140;BA.debugLine="Return Popup.item";
if (true) return _popup._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 43;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixpopup  _setanimate(boolean _animate) throws Exception{
 //BA.debugLineNum = 166;BA.debugLine="Sub SetAnimate(animate As Boolean) As WixPopUp";
 //BA.debugLineNum = 167;BA.debugLine="Popup.SetAttr(\"animate\", animate)";
_popup._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("animate",(Object)(_animate));
 //BA.debugLineNum = 168;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpopup)(this);
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpopup  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 19;BA.debugLine="Sub SetAttributes(m As Map) As WixPopUp";
 //BA.debugLineNum = 20;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 21;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 22;BA.debugLine="Popup.SetAttr(k,v)";
_popup._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 24;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpopup)(this);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpopup  _setautofit(boolean _autofit) throws Exception{
 //BA.debugLineNum = 171;BA.debugLine="Sub SetAutofit(autofit As Boolean) As WixPopUp";
 //BA.debugLineNum = 172;BA.debugLine="Popup.SetAttr(\"autofit\", autofit)";
_popup._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("autofit",(Object)(_autofit));
 //BA.debugLineNum = 173;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpopup)(this);
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpopup  _setautofocus(boolean _autofocus) throws Exception{
 //BA.debugLineNum = 176;BA.debugLine="Sub SetAutofocus(autofocus As Boolean) As WixPopUp";
 //BA.debugLineNum = 177;BA.debugLine="Popup.SetAttr(\"autofocus\", autofocus)";
_popup._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("autofocus",(Object)(_autofocus));
 //BA.debugLineNum = 178;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpopup)(this);
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpopup  _setbody(Object _xbody) throws Exception{
 //BA.debugLineNum = 181;BA.debugLine="Sub SetBody(xbody As Object) As WixPopUp";
 //BA.debugLineNum = 182;BA.debugLine="Popup.SetAttr(\"body\", xbody)";
_popup._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("body",_xbody);
 //BA.debugLineNum = 183;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpopup)(this);
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpopup  _setcontainer(Object _container) throws Exception{
 //BA.debugLineNum = 186;BA.debugLine="Sub SetContainer(container As Object) As WixPopUp";
 //BA.debugLineNum = 187;BA.debugLine="Popup.SetAttr(\"container\", container)";
_popup._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("container",_container);
 //BA.debugLineNum = 188;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpopup)(this);
 //BA.debugLineNum = 189;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpopup  _setcss(Object _css) throws Exception{
 //BA.debugLineNum = 191;BA.debugLine="Sub SetCss(css As Object) As WixPopUp";
 //BA.debugLineNum = 192;BA.debugLine="Popup.SetAttr(\"css\", css)";
_popup._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("css",_css);
 //BA.debugLineNum = 193;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpopup)(this);
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpopup  _setdisabled(boolean _disabled) throws Exception{
 //BA.debugLineNum = 196;BA.debugLine="Sub SetDisabled(disabled As Boolean) As WixPopUp";
 //BA.debugLineNum = 197;BA.debugLine="Popup.SetAttr(\"disabled\", disabled)";
_popup._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("disabled",(Object)(_disabled));
 //BA.debugLineNum = 198;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpopup)(this);
 //BA.debugLineNum = 199;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpopup  _setgravity(Object _gravity) throws Exception{
 //BA.debugLineNum = 201;BA.debugLine="Sub SetGravity(gravity As Object) As WixPopUp";
 //BA.debugLineNum = 202;BA.debugLine="Popup.SetAttr(\"gravity\", gravity)";
_popup._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("gravity",_gravity);
 //BA.debugLineNum = 203;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpopup)(this);
 //BA.debugLineNum = 204;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpopup  _sethead(Object _head) throws Exception{
 //BA.debugLineNum = 206;BA.debugLine="Sub SetHead(head As Object) As WixPopUp";
 //BA.debugLineNum = 207;BA.debugLine="Popup.SetAttr(\"head\", head)";
_popup._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("head",_head);
 //BA.debugLineNum = 208;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpopup)(this);
 //BA.debugLineNum = 209;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpopup  _setheadheight(Object _headheight) throws Exception{
 //BA.debugLineNum = 211;BA.debugLine="Sub SetHeadHeight(headHeight As Object) As WixPopU";
 //BA.debugLineNum = 212;BA.debugLine="Popup.SetAttr(\"headHeight\", headHeight)";
_popup._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("headHeight",_headheight);
 //BA.debugLineNum = 213;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpopup)(this);
 //BA.debugLineNum = 214;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpopup  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Sub SetHeight(h As Object) As WixPopUp";
 //BA.debugLineNum = 102;BA.debugLine="Popup.SetAttr(\"height\", h)";
_popup._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("height",_h);
 //BA.debugLineNum = 103;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpopup)(this);
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpopup  _sethidden(boolean _hidden) throws Exception{
 //BA.debugLineNum = 216;BA.debugLine="Sub SetHidden(hidden As Boolean) As WixPopUp";
 //BA.debugLineNum = 217;BA.debugLine="Popup.SetAttr(\"hidden\", hidden)";
_popup._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hidden",(Object)(_hidden));
 //BA.debugLineNum = 218;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpopup)(this);
 //BA.debugLineNum = 219;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpopup  _setleft(Object _left) throws Exception{
 //BA.debugLineNum = 221;BA.debugLine="Sub SetLeft(left As Object) As WixPopUp";
 //BA.debugLineNum = 222;BA.debugLine="Popup.SetAttr(\"left\", left)";
_popup._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("left",_left);
 //BA.debugLineNum = 223;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpopup)(this);
 //BA.debugLineNum = 224;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpopup  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 47;BA.debugLine="Sub SetMap(m As Map) As WixPopUp";
 //BA.debugLineNum = 48;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 49;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 50;BA.debugLine="Popup.SetAttr(strKey,	strVal)";
_popup._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 52;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpopup)(this);
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpopup  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 253;BA.debugLine="Sub SetMargin(margin As Object) As WixPopUp";
 //BA.debugLineNum = 254;BA.debugLine="Popup.SetMargin(margin)";
_popup._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 255;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpopup)(this);
 //BA.debugLineNum = 256;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpopup  _setmaster(Object _master) throws Exception{
 //BA.debugLineNum = 226;BA.debugLine="Sub SetMaster(master As Object) As WixPopUp";
 //BA.debugLineNum = 227;BA.debugLine="Popup.SetAttr(\"master\", master)";
_popup._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("master",_master);
 //BA.debugLineNum = 228;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpopup)(this);
 //BA.debugLineNum = 229;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpopup  _setmaxheight(Object _maxheight) throws Exception{
 //BA.debugLineNum = 231;BA.debugLine="Sub SetMaxHeight(maxHeight As Object) As WixPopUp";
 //BA.debugLineNum = 232;BA.debugLine="Popup.SetAttr(\"maxHeight\", maxHeight)";
_popup._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxHeight",_maxheight);
 //BA.debugLineNum = 233;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpopup)(this);
 //BA.debugLineNum = 234;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpopup  _setmaxwidth(Object _maxwidth) throws Exception{
 //BA.debugLineNum = 236;BA.debugLine="Sub SetMaxWidth(maxWidth As Object) As WixPopUp";
 //BA.debugLineNum = 237;BA.debugLine="Popup.SetAttr(\"maxWidth\", maxWidth)";
_popup._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxWidth",_maxwidth);
 //BA.debugLineNum = 238;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpopup)(this);
 //BA.debugLineNum = 239;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpopup  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub SetMinHeight(h As Int) As WixPopUp";
 //BA.debugLineNum = 90;BA.debugLine="Popup.SetMinHeight(h)";
_popup._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 91;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpopup)(this);
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpopup  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Sub SetMinWidth(w As Int) As WixPopUp";
 //BA.debugLineNum = 84;BA.debugLine="Popup.SetMinWidth(w)";
_popup._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 85;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpopup)(this);
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpopup  _setmodal(boolean _modal) throws Exception{
 //BA.debugLineNum = 242;BA.debugLine="Sub SetModal(modal As Boolean) As WixPopUp";
 //BA.debugLineNum = 243;BA.debugLine="Popup.SetAttr(\"modal\", modal)";
_popup._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("modal",(Object)(_modal));
 //BA.debugLineNum = 244;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpopup)(this);
 //BA.debugLineNum = 245;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpopup  _setmove(boolean _b) throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Sub SetMove(b As Boolean) As WixPopUp";
 //BA.debugLineNum = 96;BA.debugLine="Popup.SetAttr(\"move\", b)";
_popup._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("move",(Object)(_b));
 //BA.debugLineNum = 97;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpopup)(this);
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpopup  _setname(String _n) throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub SetName(n As String) As WixPopUp";
 //BA.debugLineNum = 65;BA.debugLine="Popup.SetName(n)";
_popup._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 66;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpopup)(this);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpopup  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 247;BA.debugLine="Sub SetPadding(padding As Object) As WixPopUp";
 //BA.debugLineNum = 248;BA.debugLine="Popup.SetAttr(\"padding\", padding)";
_popup._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("padding",_padding);
 //BA.debugLineNum = 249;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpopup)(this);
 //BA.debugLineNum = 250;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpopup  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Sub SetParent(p As WixElement) As WixPopUp";
 //BA.debugLineNum = 37;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 38;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpopup)(this);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpopup  _setpoint(boolean _point) throws Exception{
 //BA.debugLineNum = 258;BA.debugLine="Sub SetPoint(point As Boolean) As WixPopUp";
 //BA.debugLineNum = 259;BA.debugLine="Popup.SetAttr(\"point\", point)";
_popup._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("point",(Object)(_point));
 //BA.debugLineNum = 260;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpopup)(this);
 //BA.debugLineNum = 261;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpopup  _setposition(String _c) throws Exception{
 //BA.debugLineNum = 113;BA.debugLine="Sub SetPosition(c As String) As WixPopUp";
 //BA.debugLineNum = 114;BA.debugLine="Popup.SetAttr(\"position\", c)";
_popup._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("position",(Object)(_c));
 //BA.debugLineNum = 115;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpopup)(this);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpopup  _setpositioncenter(String _c) throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Sub SetPositionCenter(c As String) As WixPopUp  'i";
 //BA.debugLineNum = 108;BA.debugLine="Popup.SetAttr(\"position\", \"center\")";
_popup._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("position",(Object)("center"));
 //BA.debugLineNum = 109;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpopup)(this);
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpopup  _setpositionright(String _c) throws Exception{
 //BA.debugLineNum = 120;BA.debugLine="Sub SetPositionRight(c As String) As WixPopUp  'ig";
 //BA.debugLineNum = 121;BA.debugLine="Popup.SetAttr(\"position\", \"right\")";
_popup._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("position",(Object)("right"));
 //BA.debugLineNum = 122;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpopup)(this);
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpopup  _setrelative(Object _relative) throws Exception{
 //BA.debugLineNum = 263;BA.debugLine="Sub SetRelative(relative As Object) As WixPopUp";
 //BA.debugLineNum = 264;BA.debugLine="Popup.SetAttr(\"relative\", relative)";
_popup._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("relative",_relative);
 //BA.debugLineNum = 265;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpopup)(this);
 //BA.debugLineNum = 266;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpopup  _setresize(boolean _resize) throws Exception{
 //BA.debugLineNum = 268;BA.debugLine="Sub SetResize(resize As Boolean) As WixPopUp";
 //BA.debugLineNum = 269;BA.debugLine="Popup.SetAttr(\"resize\", resize)";
_popup._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("resize",(Object)(_resize));
 //BA.debugLineNum = 270;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpopup)(this);
 //BA.debugLineNum = 271;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpopup  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub SetResponsive(b As Object) As WixPopUp";
 //BA.debugLineNum = 71;BA.debugLine="Popup.SetResponsive(b)";
_popup._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 72;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpopup)(this);
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpopup  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixPopUp";
 //BA.debugLineNum = 77;BA.debugLine="Popup.SetResponsiveCell(b)";
_popup._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 78;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpopup)(this);
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpopup  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 27;BA.debugLine="Sub SetStyles(m As Map) As WixPopUp";
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
 //BA.debugLineNum = 30;BA.debugLine="Popup.SetStyle(k,v)";
_popup._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 32;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpopup)(this);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpopup  _settemplate(Object _t) throws Exception{
anywheresoftware.b4a.objects.collections.Map _b = null;
 //BA.debugLineNum = 143;BA.debugLine="Sub SetTemplate(t As Object) As WixPopUp";
 //BA.debugLineNum = 144;BA.debugLine="Dim b As Map = CreateMap()";
_b = new anywheresoftware.b4a.objects.collections.Map();
_b = __c.createMap(new Object[] {});
 //BA.debugLineNum = 145;BA.debugLine="b.Put(\"template\", t)";
_b.Put((Object)("template"),_t);
 //BA.debugLineNum = 146;BA.debugLine="SetBody(b)";
_setbody((Object)(_b.getObject()));
 //BA.debugLineNum = 147;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpopup)(this);
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpopup  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 56;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixPopUp";
 //BA.debugLineNum = 57;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 58;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 59;BA.debugLine="Popup.SetTemplate(os)";
_popup._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 60;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpopup)(this);
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpopup  _settofront(boolean _tofront) throws Exception{
 //BA.debugLineNum = 273;BA.debugLine="Sub SetToFront(toFront As Boolean) As WixPopUp";
 //BA.debugLineNum = 274;BA.debugLine="Popup.SetAttr(\"toFront\", toFront)";
_popup._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("toFront",(Object)(_tofront));
 //BA.debugLineNum = 275;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpopup)(this);
 //BA.debugLineNum = 276;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpopup  _settop(Object _top) throws Exception{
 //BA.debugLineNum = 278;BA.debugLine="Sub SetTop(top As Object) As WixPopUp";
 //BA.debugLineNum = 279;BA.debugLine="Popup.SetAttr(\"top\", top)";
_popup._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("top",_top);
 //BA.debugLineNum = 280;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpopup)(this);
 //BA.debugLineNum = 281;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpopup  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 126;BA.debugLine="Sub SetWidth(w As Object) As WixPopUp";
 //BA.debugLineNum = 127;BA.debugLine="Popup.SetAttr(\"width\", w)";
_popup._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("width",_w);
 //BA.debugLineNum = 128;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpopup)(this);
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpopup  _setzindex(Object _zindex) throws Exception{
 //BA.debugLineNum = 283;BA.debugLine="Sub SetZindex(zindex As Object) As WixPopUp";
 //BA.debugLineNum = 284;BA.debugLine="Popup.SetAttr(\"zindex\", zindex)";
_popup._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("zindex",_zindex);
 //BA.debugLineNum = 285;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpopup)(this);
 //BA.debugLineNum = 286;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
