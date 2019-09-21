package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixlabel extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixlabel", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixlabel.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _label = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 178;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 179;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 183;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 184;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 185;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.Mashy.BANanoWebixDemo.wixform _frm) throws Exception{
 //BA.debugLineNum = 148;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 149;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 173;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 174;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Label As WixElement";
_label = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixlabel  _initialize(anywheresoftware.b4a.BA _ba,String _iid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(iID As String) As WixLabel";
 //BA.debugLineNum = 10;BA.debugLine="ID = iID.tolowercase";
_id = _iid.toLowerCase();
 //BA.debugLineNum = 11;BA.debugLine="Label.Initialize(iID).SetView(\"label\")";
_label._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_iid)._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("label");
 //BA.debugLineNum = 12;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 13;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlabel)(this);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 42;BA.debugLine="Return Label.item";
if (true) return _label._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 47;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixlabel  _setalign(String _a) throws Exception{
 //BA.debugLineNum = 142;BA.debugLine="Sub SetAlign(a As String) As WixLabel";
 //BA.debugLineNum = 143;BA.debugLine="Label.SetAttr(\"align\", a)";
_label._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("align",(Object)(_a));
 //BA.debugLineNum = 144;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlabel)(this);
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlabel  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 160;BA.debugLine="Sub SetAlignCenter(r As String) As WixLabel 'ignor";
 //BA.debugLineNum = 161;BA.debugLine="Label.setAligncenter(\"\")";
_label._setaligncenter /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 162;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlabel)(this);
 //BA.debugLineNum = 163;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlabel  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 166;BA.debugLine="Sub SetAlignLeft(r As String) As WixLabel 'ignore";
 //BA.debugLineNum = 167;BA.debugLine="Label.SetAlignleft(\"\")";
_label._setalignleft /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 168;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlabel)(this);
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlabel  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 154;BA.debugLine="Sub SetAlignRight(r As String) As WixLabel 'ignore";
 //BA.debugLineNum = 155;BA.debugLine="Label.setAlignright(\"\")";
_label._setalignright /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 156;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlabel)(this);
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlabel  _setanimate(boolean _animate) throws Exception{
 //BA.debugLineNum = 187;BA.debugLine="Sub SetAnimate(animate As Boolean) As WixLabel";
 //BA.debugLineNum = 188;BA.debugLine="Label.SetAttr(\"animate\", animate)";
_label._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("animate",(Object)(_animate));
 //BA.debugLineNum = 189;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlabel)(this);
 //BA.debugLineNum = 190;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlabel  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 17;BA.debugLine="Sub SetAttributes(m As Map) As WixLabel";
 //BA.debugLineNum = 18;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 19;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 20;BA.debugLine="Label.SetAttr(k,v)";
_label._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 22;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlabel)(this);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlabel  _setautowidth(boolean _autowidth) throws Exception{
 //BA.debugLineNum = 192;BA.debugLine="Sub SetAutowidth(autowidth As Boolean) As WixLabel";
 //BA.debugLineNum = 193;BA.debugLine="Label.SetAttr(\"autowidth\", autowidth)";
_label._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("autowidth",(Object)(_autowidth));
 //BA.debugLineNum = 194;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlabel)(this);
 //BA.debugLineNum = 195;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlabel  _setborderless(boolean _borderless) throws Exception{
 //BA.debugLineNum = 197;BA.debugLine="Sub SetBorderless(borderless As Boolean) As WixLab";
 //BA.debugLineNum = 198;BA.debugLine="Label.SetAttr(\"borderless\", borderless)";
_label._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("borderless",(Object)(_borderless));
 //BA.debugLineNum = 199;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlabel)(this);
 //BA.debugLineNum = 200;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlabel  _setclick(Object _click) throws Exception{
 //BA.debugLineNum = 202;BA.debugLine="Sub SetClick(click As Object) As WixLabel";
 //BA.debugLineNum = 203;BA.debugLine="Label.SetAttr(\"click\", click)";
_label._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("click",_click);
 //BA.debugLineNum = 204;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlabel)(this);
 //BA.debugLineNum = 205;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlabel  _setcontainer(Object _container) throws Exception{
 //BA.debugLineNum = 207;BA.debugLine="Sub SetContainer(container As Object) As WixLabel";
 //BA.debugLineNum = 208;BA.debugLine="Label.SetAttr(\"container\", container)";
_label._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("container",_container);
 //BA.debugLineNum = 209;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlabel)(this);
 //BA.debugLineNum = 210;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlabel  _setcss(Object _css) throws Exception{
 //BA.debugLineNum = 212;BA.debugLine="Sub SetCss(css As Object) As WixLabel";
 //BA.debugLineNum = 213;BA.debugLine="Label.SetAttr(\"css\", css)";
_label._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("css",_css);
 //BA.debugLineNum = 214;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlabel)(this);
 //BA.debugLineNum = 215;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlabel  _setdisabled(boolean _disabled) throws Exception{
 //BA.debugLineNum = 217;BA.debugLine="Sub SetDisabled(disabled As Boolean) As WixLabel";
 //BA.debugLineNum = 218;BA.debugLine="Label.SetAttr(\"disabled\", disabled)";
_label._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("disabled",(Object)(_disabled));
 //BA.debugLineNum = 219;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlabel)(this);
 //BA.debugLineNum = 220;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlabel  _setformat(Object _f) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub SetFormat(f As Object) As WixLabel";
 //BA.debugLineNum = 58;BA.debugLine="Label.SetAttr(\"format\",f)";
_label._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("format",_f);
 //BA.debugLineNum = 59;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlabel)(this);
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlabel  _setgravity(Object _gravity) throws Exception{
 //BA.debugLineNum = 222;BA.debugLine="Sub SetGravity(gravity As Object) As WixLabel";
 //BA.debugLineNum = 223;BA.debugLine="Label.SetAttr(\"gravity\", gravity)";
_label._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("gravity",_gravity);
 //BA.debugLineNum = 224;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlabel)(this);
 //BA.debugLineNum = 225;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlabel  _setheight(Object _height) throws Exception{
 //BA.debugLineNum = 227;BA.debugLine="Sub SetHeight(height As Object) As WixLabel";
 //BA.debugLineNum = 228;BA.debugLine="Label.SetAttr(\"height\", height)";
_label._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("height",_height);
 //BA.debugLineNum = 229;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlabel)(this);
 //BA.debugLineNum = 230;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlabel  _sethidden(boolean _hidden) throws Exception{
 //BA.debugLineNum = 232;BA.debugLine="Sub SetHidden(hidden As Boolean) As WixLabel";
 //BA.debugLineNum = 233;BA.debugLine="Label.SetAttr(\"hidden\", hidden)";
_label._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hidden",(Object)(_hidden));
 //BA.debugLineNum = 234;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlabel)(this);
 //BA.debugLineNum = 235;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlabel  _sethotkey(Object _hotkey) throws Exception{
 //BA.debugLineNum = 237;BA.debugLine="Sub SetHotkey(hotkey As Object) As WixLabel";
 //BA.debugLineNum = 238;BA.debugLine="Label.SetAttr(\"hotkey\", hotkey)";
_label._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hotkey",_hotkey);
 //BA.debugLineNum = 239;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlabel)(this);
 //BA.debugLineNum = 240;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlabel  _setinputheight(Object _inputheight) throws Exception{
 //BA.debugLineNum = 242;BA.debugLine="Sub SetInputHeight(inputHeight As Object) As WixLa";
 //BA.debugLineNum = 243;BA.debugLine="Label.SetAttr(\"inputHeight\", inputHeight)";
_label._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("inputHeight",_inputheight);
 //BA.debugLineNum = 244;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlabel)(this);
 //BA.debugLineNum = 245;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlabel  _setinputwidth(Object _inputwidth) throws Exception{
 //BA.debugLineNum = 247;BA.debugLine="Sub SetInputWidth(inputWidth As Object) As WixLabe";
 //BA.debugLineNum = 248;BA.debugLine="Label.SetAttr(\"inputWidth\", inputWidth)";
_label._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("inputWidth",_inputwidth);
 //BA.debugLineNum = 249;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlabel)(this);
 //BA.debugLineNum = 250;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlabel  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 136;BA.debugLine="Sub SetLabel(l As String) As WixLabel";
 //BA.debugLineNum = 137;BA.debugLine="Label.SetLabel(l)";
_label._setlabel /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_l);
 //BA.debugLineNum = 138;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlabel)(this);
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlabel  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 69;BA.debugLine="Sub SetMap(m As Map) As WixLabel";
 //BA.debugLineNum = 70;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 71;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 72;BA.debugLine="Label.SetAttr(strKey,	strVal)";
_label._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 74;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlabel)(this);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlabel  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 130;BA.debugLine="Sub SetMargin(margin As Object) As WixLabel";
 //BA.debugLineNum = 131;BA.debugLine="Label.SetMargin(margin)";
_label._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 132;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlabel)(this);
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlabel  _setmaxheight(Object _maxheight) throws Exception{
 //BA.debugLineNum = 252;BA.debugLine="Sub SetMaxHeight(maxHeight As Object) As WixLabel";
 //BA.debugLineNum = 253;BA.debugLine="Label.SetAttr(\"maxHeight\", maxHeight)";
_label._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxHeight",_maxheight);
 //BA.debugLineNum = 254;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlabel)(this);
 //BA.debugLineNum = 255;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlabel  _setmaxwidth(Object _maxwidth) throws Exception{
 //BA.debugLineNum = 257;BA.debugLine="Sub SetMaxWidth(maxWidth As Object) As WixLabel";
 //BA.debugLineNum = 258;BA.debugLine="Label.SetAttr(\"maxWidth\", maxWidth)";
_label._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxWidth",_maxwidth);
 //BA.debugLineNum = 259;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlabel)(this);
 //BA.debugLineNum = 260;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlabel  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 105;BA.debugLine="Sub SetMinHeight(h As Int) As WixLabel";
 //BA.debugLineNum = 106;BA.debugLine="Label.SetMinHeight(h)";
_label._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 107;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlabel)(this);
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlabel  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Sub SetMinWidth(w As Int) As WixLabel";
 //BA.debugLineNum = 93;BA.debugLine="Label.SetMinWidth(w)";
_label._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 94;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlabel)(this);
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlabel  _setname(String _n) throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Sub SetName(n As String) As WixLabel";
 //BA.debugLineNum = 64;BA.debugLine="Label.SetName(n)";
_label._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 65;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlabel)(this);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlabel  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 124;BA.debugLine="Sub SetPadding(padding As Object) As WixLabel";
 //BA.debugLineNum = 125;BA.debugLine="Label.SetPadding(padding)";
_label._setpadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 126;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlabel)(this);
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlabel  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Sub SetParent(p As WixElement) As WixLabel";
 //BA.debugLineNum = 99;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 100;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlabel)(this);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlabel  _setpopup(Object _popup) throws Exception{
 //BA.debugLineNum = 262;BA.debugLine="Sub SetPopup(popup As Object) As WixLabel";
 //BA.debugLineNum = 263;BA.debugLine="Label.SetAttr(\"popup\", popup)";
_label._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("popup",_popup);
 //BA.debugLineNum = 264;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlabel)(this);
 //BA.debugLineNum = 265;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlabel  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Sub SetResponsive(b As Object) As WixLabel";
 //BA.debugLineNum = 80;BA.debugLine="Label.SetResponsive(b)";
_label._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 81;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlabel)(this);
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlabel  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixLabel";
 //BA.debugLineNum = 86;BA.debugLine="Label.SetResponsiveCell(b)";
_label._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 87;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlabel)(this);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlabel  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 35;BA.debugLine="Label.SetStyle(prop,sval)";
_label._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlabel)(this);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlabel  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 25;BA.debugLine="Sub SetStyles(m As Map) As WixLabel";
 //BA.debugLineNum = 26;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 27;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 28;BA.debugLine="Label.SetStyle(k,v)";
_label._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 30;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlabel)(this);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlabel  _settemplate(Object _t) throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Sub SetTemplate(t As Object) As WixLabel";
 //BA.debugLineNum = 119;BA.debugLine="Label.SetTemplate(t)";
_label._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_t);
 //BA.debugLineNum = 120;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlabel)(this);
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlabel  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 50;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixLabel";
 //BA.debugLineNum = 51;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 52;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 53;BA.debugLine="Label.SetTemplate(os)";
_label._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlabel)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlabel  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 111;BA.debugLine="Sub SetTooltip(tt As String) As WixLabel";
 //BA.debugLineNum = 112;BA.debugLine="Label.SetTooltip(tt)";
_label._settooltip /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_tt);
 //BA.debugLineNum = 113;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlabel)(this);
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlabel  _setvalue(Object _value) throws Exception{
 //BA.debugLineNum = 267;BA.debugLine="Sub SetValue(value As Object) As WixLabel";
 //BA.debugLineNum = 268;BA.debugLine="Label.SetAttr(\"value\", value)";
_label._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("value",_value);
 //BA.debugLineNum = 269;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlabel)(this);
 //BA.debugLineNum = 270;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlabel  _setwidth(Object _width) throws Exception{
 //BA.debugLineNum = 272;BA.debugLine="Sub SetWidth(width As Object) As WixLabel";
 //BA.debugLineNum = 273;BA.debugLine="Label.SetAttr(\"width\", width)";
_label._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("width",_width);
 //BA.debugLineNum = 274;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlabel)(this);
 //BA.debugLineNum = 275;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
