package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixcontext extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixcontext", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixcontext.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _context = null;
public anywheresoftware.b4a.objects.collections.Map _body = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 140;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 141;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 145;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 146;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 135;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 136;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Context As WixElement";
_context = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private body As Map";
_body = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 6;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixcontext  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(sid As String) As WixContext";
 //BA.debugLineNum = 12;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 13;BA.debugLine="Context.Initialize(ID).setview(\"context\")";
_context._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_id)._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("context");
 //BA.debugLineNum = 14;BA.debugLine="body.Initialize";
_body.Initialize();
 //BA.debugLineNum = 15;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 16;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontext)(this);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 123;BA.debugLine="Context.SetAttr(\"body\", body)";
_context._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("body",(Object)(_body.getObject()));
 //BA.debugLineNum = 124;BA.debugLine="Return Context.item";
if (true) return _context._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 58;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixcontext  _setanimate(boolean _animate) throws Exception{
 //BA.debugLineNum = 150;BA.debugLine="Sub SetAnimate(animate As Boolean) As WixContext";
 //BA.debugLineNum = 151;BA.debugLine="Context.SetAttr(\"animate\", animate)";
_context._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("animate",(Object)(_animate));
 //BA.debugLineNum = 152;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontext)(this);
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontext  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 26;BA.debugLine="Sub SetAttributes(m As Map) As WixContext";
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
 //BA.debugLineNum = 29;BA.debugLine="Context.SetAttr(k,v)";
_context._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontext)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontext  _setautofit(boolean _autofit) throws Exception{
 //BA.debugLineNum = 155;BA.debugLine="Sub SetAutofit(autofit As Boolean) As WixContext";
 //BA.debugLineNum = 156;BA.debugLine="Context.SetAttr(\"autofit\", autofit)";
_context._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("autofit",(Object)(_autofit));
 //BA.debugLineNum = 157;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontext)(this);
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontext  _setautofocus(boolean _autofocus) throws Exception{
 //BA.debugLineNum = 160;BA.debugLine="Sub SetAutofocus(autofocus As Boolean) As WixConte";
 //BA.debugLineNum = 161;BA.debugLine="Context.SetAttr(\"autofocus\", autofocus)";
_context._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("autofocus",(Object)(_autofocus));
 //BA.debugLineNum = 162;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontext)(this);
 //BA.debugLineNum = 163;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontext  _setbody(Object _xbody) throws Exception{
 //BA.debugLineNum = 165;BA.debugLine="Sub SetBody(xbody As Object) As WixContext";
 //BA.debugLineNum = 166;BA.debugLine="Context.SetAttr(\"body\", xbody)";
_context._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("body",_xbody);
 //BA.debugLineNum = 167;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontext)(this);
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontext  _setborderless(boolean _borderless) throws Exception{
 //BA.debugLineNum = 170;BA.debugLine="Sub SetBorderless(borderless As Boolean) As WixCon";
 //BA.debugLineNum = 171;BA.debugLine="Context.SetAttr(\"borderless\", borderless)";
_context._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("borderless",(Object)(_borderless));
 //BA.debugLineNum = 172;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontext)(this);
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontext  _setcontainer(Object _container) throws Exception{
 //BA.debugLineNum = 175;BA.debugLine="Sub SetContainer(container As Object) As WixContex";
 //BA.debugLineNum = 176;BA.debugLine="Context.SetAttr(\"container\", container)";
_context._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("container",_container);
 //BA.debugLineNum = 177;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontext)(this);
 //BA.debugLineNum = 178;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontext  _setcss(Object _css) throws Exception{
 //BA.debugLineNum = 180;BA.debugLine="Sub SetCss(css As Object) As WixContext";
 //BA.debugLineNum = 181;BA.debugLine="Context.SetAttr(\"css\", css)";
_context._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("css",_css);
 //BA.debugLineNum = 182;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontext)(this);
 //BA.debugLineNum = 183;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontext  _setdisabled(boolean _disabled) throws Exception{
 //BA.debugLineNum = 185;BA.debugLine="Sub SetDisabled(disabled As Boolean) As WixContext";
 //BA.debugLineNum = 186;BA.debugLine="Context.SetAttr(\"disabled\", disabled)";
_context._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("disabled",(Object)(_disabled));
 //BA.debugLineNum = 187;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontext)(this);
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontext  _setgravity(Object _gravity) throws Exception{
 //BA.debugLineNum = 190;BA.debugLine="Sub SetGravity(gravity As Object) As WixContext";
 //BA.debugLineNum = 191;BA.debugLine="Context.SetAttr(\"gravity\", gravity)";
_context._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("gravity",_gravity);
 //BA.debugLineNum = 192;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontext)(this);
 //BA.debugLineNum = 193;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontext  _sethead(Object _head) throws Exception{
 //BA.debugLineNum = 195;BA.debugLine="Sub SetHead(head As Object) As WixContext";
 //BA.debugLineNum = 196;BA.debugLine="Context.SetAttr(\"head\", head)";
_context._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("head",_head);
 //BA.debugLineNum = 197;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontext)(this);
 //BA.debugLineNum = 198;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontext  _setheadheight(Object _headheight) throws Exception{
 //BA.debugLineNum = 200;BA.debugLine="Sub SetHeadHeight(headHeight As Object) As WixCont";
 //BA.debugLineNum = 201;BA.debugLine="Context.SetAttr(\"headHeight\", headHeight)";
_context._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("headHeight",_headheight);
 //BA.debugLineNum = 202;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontext)(this);
 //BA.debugLineNum = 203;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontext  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Sub SetHeight(h As Object) As WixContext";
 //BA.debugLineNum = 111;BA.debugLine="Context.SetAttr(\"height\", h)";
_context._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("height",_h);
 //BA.debugLineNum = 112;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontext)(this);
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontext  _sethidden(boolean _hidden) throws Exception{
 //BA.debugLineNum = 205;BA.debugLine="Sub SetHidden(hidden As Boolean) As WixContext";
 //BA.debugLineNum = 206;BA.debugLine="Context.SetAttr(\"hidden\", hidden)";
_context._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hidden",(Object)(_hidden));
 //BA.debugLineNum = 207;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontext)(this);
 //BA.debugLineNum = 208;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontext  _setleft(Object _left) throws Exception{
 //BA.debugLineNum = 210;BA.debugLine="Sub SetLeft(left As Object) As WixContext";
 //BA.debugLineNum = 211;BA.debugLine="Context.SetAttr(\"left\", left)";
_context._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("left",_left);
 //BA.debugLineNum = 212;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontext)(this);
 //BA.debugLineNum = 213;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontext  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 68;BA.debugLine="Sub SetMap(m As Map) As WixContext";
 //BA.debugLineNum = 69;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 70;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 71;BA.debugLine="Context.SetAttr(strKey,	strVal)";
_context._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 73;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontext)(this);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontext  _setmaster(String _pid) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Sub SetMaster(pID As String) As WixContext";
 //BA.debugLineNum = 63;BA.debugLine="Context.SetAttr(\"master\", pID)";
_context._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("master",(Object)(_pid));
 //BA.debugLineNum = 64;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontext)(this);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontext  _setmaxheight(Object _maxheight) throws Exception{
 //BA.debugLineNum = 215;BA.debugLine="Sub SetMaxHeight(maxHeight As Object) As WixContex";
 //BA.debugLineNum = 216;BA.debugLine="Context.SetAttr(\"maxHeight\", maxHeight)";
_context._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxHeight",_maxheight);
 //BA.debugLineNum = 217;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontext)(this);
 //BA.debugLineNum = 218;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontext  _setmaxwidth(Object _maxwidth) throws Exception{
 //BA.debugLineNum = 220;BA.debugLine="Sub SetMaxWidth(maxWidth As Object) As WixContext";
 //BA.debugLineNum = 221;BA.debugLine="Context.SetAttr(\"maxWidth\", maxWidth)";
_context._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxWidth",_maxwidth);
 //BA.debugLineNum = 222;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontext)(this);
 //BA.debugLineNum = 223;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontext  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Sub SetMinHeight(h As Int) As WixContext";
 //BA.debugLineNum = 104;BA.debugLine="Context.SetMinHeight(h)";
_context._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 105;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontext)(this);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontext  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub SetMinWidth(w As Int) As WixContext";
 //BA.debugLineNum = 98;BA.debugLine="Context.SetMinWidth(w)";
_context._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 99;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontext)(this);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontext  _setmodal(boolean _modal) throws Exception{
 //BA.debugLineNum = 225;BA.debugLine="Sub SetModal(modal As Boolean) As WixContext";
 //BA.debugLineNum = 226;BA.debugLine="Context.SetAttr(\"modal\", modal)";
_context._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("modal",(Object)(_modal));
 //BA.debugLineNum = 227;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontext)(this);
 //BA.debugLineNum = 228;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontext  _setmove(boolean _move) throws Exception{
 //BA.debugLineNum = 230;BA.debugLine="Sub SetMove(move As Boolean) As WixContext";
 //BA.debugLineNum = 231;BA.debugLine="Context.SetAttr(\"move\", move)";
_context._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("move",(Object)(_move));
 //BA.debugLineNum = 232;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontext)(this);
 //BA.debugLineNum = 233;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontext  _setname(String _n) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub SetName(n As String) As WixContext";
 //BA.debugLineNum = 79;BA.debugLine="Context.SetName(n)";
_context._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 80;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontext)(this);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontext  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 235;BA.debugLine="Sub SetPadding(padding As Object) As WixContext";
 //BA.debugLineNum = 236;BA.debugLine="Context.SetAttr(\"padding\", padding)";
_context._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("padding",_padding);
 //BA.debugLineNum = 237;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontext)(this);
 //BA.debugLineNum = 238;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontext  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Sub SetParent(p As WixElement) As WixContext";
 //BA.debugLineNum = 44;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 45;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontext)(this);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontext  _setpoint(boolean _point) throws Exception{
 //BA.debugLineNum = 240;BA.debugLine="Sub SetPoint(point As Boolean) As WixContext";
 //BA.debugLineNum = 241;BA.debugLine="Context.SetAttr(\"point\", point)";
_context._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("point",(Object)(_point));
 //BA.debugLineNum = 242;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontext)(this);
 //BA.debugLineNum = 243;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontext  _setposition(Object _position) throws Exception{
 //BA.debugLineNum = 245;BA.debugLine="Sub SetPosition(position As Object) As WixContext";
 //BA.debugLineNum = 246;BA.debugLine="Context.SetAttr(\"position\", position)";
_context._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("position",_position);
 //BA.debugLineNum = 247;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontext)(this);
 //BA.debugLineNum = 248;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontext  _setrelative(Object _relative) throws Exception{
 //BA.debugLineNum = 250;BA.debugLine="Sub SetRelative(relative As Object) As WixContext";
 //BA.debugLineNum = 251;BA.debugLine="Context.SetAttr(\"relative\", relative)";
_context._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("relative",_relative);
 //BA.debugLineNum = 252;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontext)(this);
 //BA.debugLineNum = 253;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontext  _setresize(boolean _resize) throws Exception{
 //BA.debugLineNum = 255;BA.debugLine="Sub SetResize(resize As Boolean) As WixContext";
 //BA.debugLineNum = 256;BA.debugLine="Context.SetAttr(\"resize\", resize)";
_context._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("resize",(Object)(_resize));
 //BA.debugLineNum = 257;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontext)(this);
 //BA.debugLineNum = 258;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontext  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub SetResponsive(b As Object) As WixContext";
 //BA.debugLineNum = 85;BA.debugLine="Context.SetResponsive(b)";
_context._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 86;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontext)(this);
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontext  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixContext";
 //BA.debugLineNum = 91;BA.debugLine="Context.SetResponsiveCell(b)";
_context._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 92;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontext)(this);
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontext  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 22;BA.debugLine="Context.SetStyle(prop,sval)";
_context._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontext)(this);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontext  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 34;BA.debugLine="Sub SetStyles(m As Map) As WixContext";
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
 //BA.debugLineNum = 37;BA.debugLine="Context.SetStyle(k,v)";
_context._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 39;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontext)(this);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontext  _settemplate(String _t) throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Sub SetTemplate(t As String) As WixContext";
 //BA.debugLineNum = 129;BA.debugLine="body.put(\"template\", t)";
_body.Put((Object)("template"),(Object)(_t));
 //BA.debugLineNum = 130;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontext)(this);
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontext  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 49;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixContext";
 //BA.debugLineNum = 50;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 51;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 52;BA.debugLine="Context.SetTemplate(os)";
_context._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 53;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontext)(this);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontext  _settofront(boolean _tofront) throws Exception{
 //BA.debugLineNum = 260;BA.debugLine="Sub SetToFront(toFront As Boolean) As WixContext";
 //BA.debugLineNum = 261;BA.debugLine="Context.SetAttr(\"toFront\", toFront)";
_context._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("toFront",(Object)(_tofront));
 //BA.debugLineNum = 262;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontext)(this);
 //BA.debugLineNum = 263;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontext  _settop(Object _top) throws Exception{
 //BA.debugLineNum = 265;BA.debugLine="Sub SetTop(top As Object) As WixContext";
 //BA.debugLineNum = 266;BA.debugLine="Context.SetAttr(\"top\", top)";
_context._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("top",_top);
 //BA.debugLineNum = 267;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontext)(this);
 //BA.debugLineNum = 268;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontext  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 116;BA.debugLine="Sub SetWidth(w As Object) As WixContext";
 //BA.debugLineNum = 117;BA.debugLine="Context.SetAttr(\"width\", w)";
_context._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("width",_w);
 //BA.debugLineNum = 118;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontext)(this);
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontext  _setzindex(Object _zindex) throws Exception{
 //BA.debugLineNum = 270;BA.debugLine="Sub SetZIndex(zIndex As Object) As WixContext";
 //BA.debugLineNum = 271;BA.debugLine="Context.SetAttr(\"zIndex\", zIndex)";
_context._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("zIndex",_zindex);
 //BA.debugLineNum = 272;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcontext)(this);
 //BA.debugLineNum = 273;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
