package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixicon extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixicon", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixicon.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _icon = null;
public com.ab.banano.BANanoObject _onclick = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 211;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 212;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 213;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 216;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 217;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 218;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.Mashy.BANanoWebixDemo.wixform _frm) throws Exception{
 //BA.debugLineNum = 134;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 135;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 206;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 207;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 208;BA.debugLine="End Sub";
return "";
}
public String  _addtotoolbar(b4j.Mashy.BANanoWebixDemo.wixtoolbar _tblb) throws Exception{
 //BA.debugLineNum = 139;BA.debugLine="Sub AddToToolbar(tblB As WixToolBar)";
 //BA.debugLineNum = 140;BA.debugLine="tblB.Toolbar.AddColumns(Item)";
_tblb._toolbar /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Icon As WixElement";
_icon = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private onClick As BANanoObject";
_onclick = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 6;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixicon  _initialize(anywheresoftware.b4a.BA _ba,String _bid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(bID As String) As WixIcon";
 //BA.debugLineNum = 11;BA.debugLine="ID = bID.ToLowerCase";
_id = _bid.toLowerCase();
 //BA.debugLineNum = 12;BA.debugLine="Icon.Initialize(ID).SetView(\"icon\")";
_icon._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_id)._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("icon");
 //BA.debugLineNum = 13;BA.debugLine="onClick = Null";
_onclick = (com.ab.banano.BANanoObject)(__c.Null);
 //BA.debugLineNum = 14;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 15;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixicon)(this);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 162;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 163;BA.debugLine="If onClick <> Null Then";
if (_onclick!= null) { 
 //BA.debugLineNum = 164;BA.debugLine="Icon.SetAttr(\"click\", onClick)";
_icon._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("click",(Object)(_onclick));
 };
 //BA.debugLineNum = 166;BA.debugLine="Return Icon.item";
if (true) return _icon._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 167;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 62;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixicon  _setalign(Object _a) throws Exception{
 //BA.debugLineNum = 181;BA.debugLine="Sub SetAlign(a As Object) As WixIcon";
 //BA.debugLineNum = 182;BA.debugLine="Icon.SetAlign(a)";
_icon._setalign /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_a));
 //BA.debugLineNum = 183;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixicon)(this);
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixicon  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 193;BA.debugLine="Sub SetAlignCenter(r As String) As WixIcon 'ignore";
 //BA.debugLineNum = 194;BA.debugLine="Icon.setAligncenter(\"\")";
_icon._setaligncenter /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 195;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixicon)(this);
 //BA.debugLineNum = 196;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixicon  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 199;BA.debugLine="Sub SetAlignLeft(r As String) As WixIcon 'ignore";
 //BA.debugLineNum = 200;BA.debugLine="Icon.SetAlignleft(\"\")";
_icon._setalignleft /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 201;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixicon)(this);
 //BA.debugLineNum = 202;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixicon  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 187;BA.debugLine="Sub SetAlignRight(r As String) As WixIcon 'ignore";
 //BA.debugLineNum = 188;BA.debugLine="Icon.setAlignright(\"\")";
_icon._setalignright /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 189;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixicon)(this);
 //BA.debugLineNum = 190;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixicon  _setanimate(boolean _animate) throws Exception{
 //BA.debugLineNum = 220;BA.debugLine="Sub SetAnimate(animate As Boolean) As WixIcon";
 //BA.debugLineNum = 221;BA.debugLine="Icon.SetAttr(\"animate\", animate)";
_icon._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("animate",(Object)(_animate));
 //BA.debugLineNum = 222;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixicon)(this);
 //BA.debugLineNum = 223;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixicon  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 30;BA.debugLine="Sub SetAttributes(m As Map) As WixIcon";
 //BA.debugLineNum = 31;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 32;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 33;BA.debugLine="Icon.SetAttr(k,v)";
_icon._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 35;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixicon)(this);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixicon  _setautowidth(boolean _autowidth) throws Exception{
 //BA.debugLineNum = 225;BA.debugLine="Sub SetAutowidth(autowidth As Boolean) As WixIcon";
 //BA.debugLineNum = 226;BA.debugLine="Icon.SetAttr(\"autowidth\", autowidth)";
_icon._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("autowidth",(Object)(_autowidth));
 //BA.debugLineNum = 227;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixicon)(this);
 //BA.debugLineNum = 228;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixicon  _setbadge(String _b) throws Exception{
 //BA.debugLineNum = 150;BA.debugLine="Sub SetBadge(b As String) As WixIcon";
 //BA.debugLineNum = 151;BA.debugLine="Icon.SetAttr(\"badge\", b)";
_icon._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("badge",(Object)(_b));
 //BA.debugLineNum = 152;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixicon)(this);
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixicon  _setborderless(boolean _borderless) throws Exception{
 //BA.debugLineNum = 230;BA.debugLine="Sub SetBorderless(borderless As Boolean) As WixIco";
 //BA.debugLineNum = 231;BA.debugLine="Icon.SetAttr(\"borderless\", borderless)";
_icon._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("borderless",(Object)(_borderless));
 //BA.debugLineNum = 232;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixicon)(this);
 //BA.debugLineNum = 233;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixicon  _setclick(com.ab.banano.BANanoObject _e) throws Exception{
 //BA.debugLineNum = 144;BA.debugLine="Sub SetClick(e As BANanoObject) As WixIcon";
 //BA.debugLineNum = 145;BA.debugLine="onClick = e";
_onclick = _e;
 //BA.debugLineNum = 146;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixicon)(this);
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixicon  _setcontainer(Object _container) throws Exception{
 //BA.debugLineNum = 235;BA.debugLine="Sub SetContainer(container As Object) As WixIcon";
 //BA.debugLineNum = 236;BA.debugLine="Icon.SetAttr(\"container\", container)";
_icon._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("container",_container);
 //BA.debugLineNum = 237;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixicon)(this);
 //BA.debugLineNum = 238;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixicon  _setcss(Object _css) throws Exception{
 //BA.debugLineNum = 240;BA.debugLine="Sub SetCss(css As Object) As WixIcon";
 //BA.debugLineNum = 241;BA.debugLine="Icon.SetAttr(\"css\", css)";
_icon._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("css",_css);
 //BA.debugLineNum = 242;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixicon)(this);
 //BA.debugLineNum = 243;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixicon  _setdisabled(boolean _disabled) throws Exception{
 //BA.debugLineNum = 245;BA.debugLine="Sub SetDisabled(disabled As Boolean) As WixIcon";
 //BA.debugLineNum = 246;BA.debugLine="Icon.SetAttr(\"disabled\", disabled)";
_icon._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("disabled",(Object)(_disabled));
 //BA.debugLineNum = 247;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixicon)(this);
 //BA.debugLineNum = 248;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixicon  _setgravity(Object _gravity) throws Exception{
 //BA.debugLineNum = 250;BA.debugLine="Sub SetGravity(gravity As Object) As WixIcon";
 //BA.debugLineNum = 251;BA.debugLine="Icon.SetAttr(\"gravity\", gravity)";
_icon._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("gravity",_gravity);
 //BA.debugLineNum = 252;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixicon)(this);
 //BA.debugLineNum = 253;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixicon  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 170;BA.debugLine="Sub SetHeight(h As Object) As WixIcon";
 //BA.debugLineNum = 171;BA.debugLine="Icon.SetHeight(h)";
_icon._setheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 172;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixicon)(this);
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixicon  _sethidden(boolean _b) throws Exception{
 //BA.debugLineNum = 156;BA.debugLine="Sub SetHidden(b As Boolean) As WixIcon";
 //BA.debugLineNum = 157;BA.debugLine="Icon.SetAttr(\"hidden\", b)";
_icon._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hidden",(Object)(_b));
 //BA.debugLineNum = 158;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixicon)(this);
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixicon  _sethotkey(Object _hotkey) throws Exception{
 //BA.debugLineNum = 255;BA.debugLine="Sub SetHotkey(hotkey As Object) As WixIcon";
 //BA.debugLineNum = 256;BA.debugLine="Icon.SetAttr(\"hotkey\", hotkey)";
_icon._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hotkey",_hotkey);
 //BA.debugLineNum = 257;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixicon)(this);
 //BA.debugLineNum = 258;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixicon  _seticon(Object _i) throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Sub SetIcon(i As Object) As WixIcon";
 //BA.debugLineNum = 66;BA.debugLine="Icon.SetAttr(\"icon\", i)";
_icon._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("icon",_i);
 //BA.debugLineNum = 67;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixicon)(this);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixicon  _setinputheight(Object _inputheight) throws Exception{
 //BA.debugLineNum = 260;BA.debugLine="Sub SetInputHeight(inputHeight As Object) As WixIc";
 //BA.debugLineNum = 261;BA.debugLine="Icon.SetAttr(\"inputHeight\", inputHeight)";
_icon._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("inputHeight",_inputheight);
 //BA.debugLineNum = 262;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixicon)(this);
 //BA.debugLineNum = 263;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixicon  _setinputwidth(Object _inputwidth) throws Exception{
 //BA.debugLineNum = 265;BA.debugLine="Sub SetInputWidth(inputWidth As Object) As WixIcon";
 //BA.debugLineNum = 266;BA.debugLine="Icon.SetAttr(\"inputWidth\", inputWidth)";
_icon._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("inputWidth",_inputwidth);
 //BA.debugLineNum = 267;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixicon)(this);
 //BA.debugLineNum = 268;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixicon  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 85;BA.debugLine="Sub SetMap(m As Map) As WixIcon";
 //BA.debugLineNum = 86;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 87;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 88;BA.debugLine="Icon.SetAttr(strKey,	strVal)";
_icon._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 90;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixicon)(this);
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixicon  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Sub SetMargin(margin As Object) As WixIcon";
 //BA.debugLineNum = 26;BA.debugLine="Icon.SetMargin(margin)";
_icon._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 27;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixicon)(this);
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixicon  _setmaxheight(Object _maxheight) throws Exception{
 //BA.debugLineNum = 270;BA.debugLine="Sub SetMaxHeight(maxHeight As Object) As WixIcon";
 //BA.debugLineNum = 271;BA.debugLine="Icon.SetAttr(\"maxHeight\", maxHeight)";
_icon._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxHeight",_maxheight);
 //BA.debugLineNum = 272;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixicon)(this);
 //BA.debugLineNum = 273;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixicon  _setmaxwidth(Object _maxwidth) throws Exception{
 //BA.debugLineNum = 275;BA.debugLine="Sub SetMaxWidth(maxWidth As Object) As WixIcon";
 //BA.debugLineNum = 276;BA.debugLine="Icon.SetAttr(\"maxWidth\", maxWidth)";
_icon._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxWidth",_maxwidth);
 //BA.debugLineNum = 277;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixicon)(this);
 //BA.debugLineNum = 278;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixicon  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Sub SetMinHeight(h As Int) As WixIcon";
 //BA.debugLineNum = 115;BA.debugLine="Icon.SetMinHeight(h)";
_icon._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 116;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixicon)(this);
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixicon  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Sub SetMinWidth(w As Int) As WixIcon";
 //BA.debugLineNum = 109;BA.debugLine="Icon.SetMinWidth(w)";
_icon._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 110;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixicon)(this);
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixicon  _setname(String _n) throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Sub SetName(n As String) As WixIcon";
 //BA.debugLineNum = 80;BA.debugLine="Icon.SetName(n)";
_icon._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 81;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixicon)(this);
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixicon  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Sub SetPadding(padding As Object) As WixIcon";
 //BA.debugLineNum = 20;BA.debugLine="Icon.SetPadding(padding)";
_icon._setpadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 21;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixicon)(this);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixicon  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Sub SetParent(p As WixElement) As WixIcon";
 //BA.debugLineNum = 55;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 56;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixicon)(this);
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixicon  _setpopup(String _popupid) throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="Sub SetPopUp(popupID As String) As WixIcon";
 //BA.debugLineNum = 128;BA.debugLine="popupID = popupID.ToLowerCase";
_popupid = _popupid.toLowerCase();
 //BA.debugLineNum = 129;BA.debugLine="Icon.SetAttr(\"popup\", popupID)";
_icon._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("popup",(Object)(_popupid));
 //BA.debugLineNum = 130;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixicon)(this);
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixicon  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Sub SetResponsive(b As Object) As WixIcon";
 //BA.debugLineNum = 96;BA.debugLine="Icon.SetResponsive(b)";
_icon._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 97;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixicon)(this);
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixicon  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixIcon";
 //BA.debugLineNum = 102;BA.debugLine="Icon.SetResponsiveCell(b)";
_icon._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 103;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixicon)(this);
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixicon  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 48;BA.debugLine="Icon.SetStyle(prop,sval)";
_icon._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixicon)(this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixicon  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 38;BA.debugLine="Sub SetStyles(m As Map) As WixIcon";
 //BA.debugLineNum = 39;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 40;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 41;BA.debugLine="Icon.SetStyle(k,v)";
_icon._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 43;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixicon)(this);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixicon  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 71;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixIcon";
 //BA.debugLineNum = 72;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 73;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 74;BA.debugLine="Icon.SetTemplate(os)";
_icon._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 75;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixicon)(this);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixicon  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 120;BA.debugLine="Sub SetTooltip(tt As String) As WixIcon";
 //BA.debugLineNum = 121;BA.debugLine="Icon.SetTooltip(tt)";
_icon._settooltip /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_tt);
 //BA.debugLineNum = 122;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixicon)(this);
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixicon  _setvalue(Object _value) throws Exception{
 //BA.debugLineNum = 280;BA.debugLine="Sub SetValue(value As Object) As WixIcon";
 //BA.debugLineNum = 281;BA.debugLine="Icon.SetAttr(\"value\", value)";
_icon._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("value",_value);
 //BA.debugLineNum = 282;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixicon)(this);
 //BA.debugLineNum = 283;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixicon  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 176;BA.debugLine="Sub SetWidth(w As Object) As WixIcon";
 //BA.debugLineNum = 177;BA.debugLine="Icon.SetWidth(w)";
_icon._setwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 178;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixicon)(this);
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
