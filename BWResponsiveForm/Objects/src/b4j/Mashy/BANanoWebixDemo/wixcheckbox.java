package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixcheckbox extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixcheckbox", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixcheckbox.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _checkbox = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 203;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 204;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 205;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 208;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 209;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 210;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.Mashy.BANanoWebixDemo.wixform _frm) throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 109;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 198;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 199;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 200;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public CheckBox As WixElement";
_checkbox = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixcheckbox  _initialize(anywheresoftware.b4a.BA _ba,String _iid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(iID As String) As WixCheckBo";
 //BA.debugLineNum = 10;BA.debugLine="ID = iID.tolowercase";
_id = _iid.toLowerCase();
 //BA.debugLineNum = 11;BA.debugLine="CheckBox.Initialize(iID).SetView(\"checkbox\")";
_checkbox._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_iid)._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("checkbox");
 //BA.debugLineNum = 12;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 13;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcheckbox)(this);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 142;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 143;BA.debugLine="Return CheckBox.item";
if (true) return _checkbox._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 59;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixcheckbox  _setalign(Object _align) throws Exception{
 //BA.debugLineNum = 213;BA.debugLine="Sub SetAlign(align As Object) As WixCheckBox";
 //BA.debugLineNum = 214;BA.debugLine="CheckBox.SetAttr(\"align\", align)";
_checkbox._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("align",_align);
 //BA.debugLineNum = 215;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcheckbox)(this);
 //BA.debugLineNum = 216;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcheckbox  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 185;BA.debugLine="Sub SetAlignCenter(r As String) As WixCheckBox 'ig";
 //BA.debugLineNum = 186;BA.debugLine="CheckBox.setAligncenter(\"\")";
_checkbox._setaligncenter /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 187;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcheckbox)(this);
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcheckbox  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 191;BA.debugLine="Sub SetAlignLeft(r As String) As WixCheckBox 'igno";
 //BA.debugLineNum = 192;BA.debugLine="CheckBox.SetAlignleft(\"\")";
_checkbox._setalignleft /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 193;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcheckbox)(this);
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcheckbox  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 179;BA.debugLine="Sub SetAlignRight(r As String) As WixCheckBox 'ign";
 //BA.debugLineNum = 180;BA.debugLine="CheckBox.setAlignright(\"\")";
_checkbox._setalignright /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 181;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcheckbox)(this);
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcheckbox  _setanimate(boolean _animate) throws Exception{
 //BA.debugLineNum = 218;BA.debugLine="Sub SetAnimate(animate As Boolean) As WixCheckBox";
 //BA.debugLineNum = 219;BA.debugLine="CheckBox.SetAttr(\"animate\", animate)";
_checkbox._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("animate",(Object)(_animate));
 //BA.debugLineNum = 220;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcheckbox)(this);
 //BA.debugLineNum = 221;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcheckbox  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 34;BA.debugLine="Sub SetAttributes(m As Map) As WixCheckBox";
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
 //BA.debugLineNum = 37;BA.debugLine="CheckBox.SetAttr(k,v)";
_checkbox._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 39;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcheckbox)(this);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcheckbox  _setborderless(boolean _borderless) throws Exception{
 //BA.debugLineNum = 224;BA.debugLine="Sub SetBorderless(borderless As Boolean) As WixChe";
 //BA.debugLineNum = 225;BA.debugLine="CheckBox.SetAttr(\"borderless\", borderless)";
_checkbox._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("borderless",(Object)(_borderless));
 //BA.debugLineNum = 226;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcheckbox)(this);
 //BA.debugLineNum = 227;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcheckbox  _setbottomlabel(Object _bottomlabel) throws Exception{
 //BA.debugLineNum = 229;BA.debugLine="Sub SetBottomLabel(bottomLabel As Object) As WixCh";
 //BA.debugLineNum = 230;BA.debugLine="CheckBox.SetAttr(\"bottomLabel\", bottomLabel)";
_checkbox._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("bottomLabel",_bottomlabel);
 //BA.debugLineNum = 231;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcheckbox)(this);
 //BA.debugLineNum = 232;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcheckbox  _setbottompadding(Object _bottompadding) throws Exception{
 //BA.debugLineNum = 234;BA.debugLine="Sub SetBottomPadding(bottomPadding As Object) As W";
 //BA.debugLineNum = 235;BA.debugLine="CheckBox.SetAttr(\"bottomPadding\", bottomPadding)";
_checkbox._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("bottomPadding",_bottompadding);
 //BA.debugLineNum = 236;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcheckbox)(this);
 //BA.debugLineNum = 237;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcheckbox  _setcheckvalue(Object _checkvalue) throws Exception{
 //BA.debugLineNum = 239;BA.debugLine="Sub SetCheckValue(checkValue As Object) As WixChec";
 //BA.debugLineNum = 240;BA.debugLine="CheckBox.SetAttr(\"checkValue\", checkValue)";
_checkbox._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("checkValue",_checkvalue);
 //BA.debugLineNum = 241;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcheckbox)(this);
 //BA.debugLineNum = 242;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcheckbox  _setclick(Object _click) throws Exception{
 //BA.debugLineNum = 244;BA.debugLine="Sub SetClick(click As Object) As WixCheckBox";
 //BA.debugLineNum = 245;BA.debugLine="CheckBox.SetAttr(\"click\", click)";
_checkbox._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("click",_click);
 //BA.debugLineNum = 246;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcheckbox)(this);
 //BA.debugLineNum = 247;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcheckbox  _setcontainer(Object _container) throws Exception{
 //BA.debugLineNum = 249;BA.debugLine="Sub SetContainer(container As Object) As WixCheckB";
 //BA.debugLineNum = 250;BA.debugLine="CheckBox.SetAttr(\"container\", container)";
_checkbox._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("container",_container);
 //BA.debugLineNum = 251;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcheckbox)(this);
 //BA.debugLineNum = 252;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcheckbox  _setcss(Object _css) throws Exception{
 //BA.debugLineNum = 254;BA.debugLine="Sub SetCss(css As Object) As WixCheckBox";
 //BA.debugLineNum = 255;BA.debugLine="CheckBox.SetAttr(\"css\", css)";
_checkbox._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("css",_css);
 //BA.debugLineNum = 256;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcheckbox)(this);
 //BA.debugLineNum = 257;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcheckbox  _setcustomcheckbox(Object _customcheckbox) throws Exception{
 //BA.debugLineNum = 259;BA.debugLine="Sub SetCustomCheckbox(customCheckbox As Object) As";
 //BA.debugLineNum = 260;BA.debugLine="CheckBox.SetAttr(\"customCheckbox\", customCheckbox";
_checkbox._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("customCheckbox",_customcheckbox);
 //BA.debugLineNum = 261;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcheckbox)(this);
 //BA.debugLineNum = 262;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcheckbox  _setdisabled(boolean _disabled) throws Exception{
 //BA.debugLineNum = 264;BA.debugLine="Sub SetDisabled(disabled As Boolean) As WixCheckBo";
 //BA.debugLineNum = 265;BA.debugLine="CheckBox.SetAttr(\"disabled\", disabled)";
_checkbox._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("disabled",(Object)(_disabled));
 //BA.debugLineNum = 266;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcheckbox)(this);
 //BA.debugLineNum = 267;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcheckbox  _setformat(Object _format) throws Exception{
 //BA.debugLineNum = 269;BA.debugLine="Sub SetFormat(format As Object) As WixCheckBox";
 //BA.debugLineNum = 270;BA.debugLine="CheckBox.SetAttr(\"format\", format)";
_checkbox._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("format",_format);
 //BA.debugLineNum = 271;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcheckbox)(this);
 //BA.debugLineNum = 272;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcheckbox  _setgravity(Object _gravity) throws Exception{
 //BA.debugLineNum = 274;BA.debugLine="Sub SetGravity(gravity As Object) As WixCheckBox";
 //BA.debugLineNum = 275;BA.debugLine="CheckBox.SetAttr(\"gravity\", gravity)";
_checkbox._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("gravity",_gravity);
 //BA.debugLineNum = 276;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcheckbox)(this);
 //BA.debugLineNum = 277;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcheckbox  _setheight(Object _height) throws Exception{
 //BA.debugLineNum = 279;BA.debugLine="Sub SetHeight(height As Object) As WixCheckBox";
 //BA.debugLineNum = 280;BA.debugLine="CheckBox.SetAttr(\"height\", height)";
_checkbox._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("height",_height);
 //BA.debugLineNum = 281;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcheckbox)(this);
 //BA.debugLineNum = 282;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcheckbox  _sethidden(boolean _hidden) throws Exception{
 //BA.debugLineNum = 284;BA.debugLine="Sub SetHidden(hidden As Boolean) As WixCheckBox";
 //BA.debugLineNum = 285;BA.debugLine="CheckBox.SetAttr(\"hidden\", hidden)";
_checkbox._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hidden",(Object)(_hidden));
 //BA.debugLineNum = 286;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcheckbox)(this);
 //BA.debugLineNum = 287;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcheckbox  _sethotkey(Object _hotkey) throws Exception{
 //BA.debugLineNum = 289;BA.debugLine="Sub SetHotkey(hotkey As Object) As WixCheckBox";
 //BA.debugLineNum = 290;BA.debugLine="CheckBox.SetAttr(\"hotkey\", hotkey)";
_checkbox._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hotkey",_hotkey);
 //BA.debugLineNum = 291;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcheckbox)(this);
 //BA.debugLineNum = 292;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcheckbox  _setinputalign(Object _inputalign) throws Exception{
 //BA.debugLineNum = 294;BA.debugLine="Sub SetInputAlign(inputAlign As Object) As WixChec";
 //BA.debugLineNum = 295;BA.debugLine="CheckBox.SetAttr(\"inputAlign\", inputAlign)";
_checkbox._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("inputAlign",_inputalign);
 //BA.debugLineNum = 296;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcheckbox)(this);
 //BA.debugLineNum = 297;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcheckbox  _setinputwidth(Object _inputwidth) throws Exception{
 //BA.debugLineNum = 299;BA.debugLine="Sub SetInputWidth(inputWidth As Object) As WixChec";
 //BA.debugLineNum = 300;BA.debugLine="CheckBox.SetAttr(\"inputWidth\", inputWidth)";
_checkbox._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("inputWidth",_inputwidth);
 //BA.debugLineNum = 301;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcheckbox)(this);
 //BA.debugLineNum = 302;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcheckbox  _setinvalidmessage(String _msg) throws Exception{
 //BA.debugLineNum = 129;BA.debugLine="Sub SetInvalidMessage(msg As String) As WixCheckBo";
 //BA.debugLineNum = 130;BA.debugLine="CheckBox.SetAttr(\"invalidMessage\", msg)";
_checkbox._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("invalidMessage",(Object)(_msg));
 //BA.debugLineNum = 131;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcheckbox)(this);
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcheckbox  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 153;BA.debugLine="Sub SetLabel(l As String) As WixCheckBox";
 //BA.debugLineNum = 154;BA.debugLine="CheckBox.SetLabel(l)";
_checkbox._setlabel /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_l);
 //BA.debugLineNum = 155;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcheckbox)(this);
 //BA.debugLineNum = 156;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcheckbox  _setlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 160;BA.debugLine="Sub SetLabelAlign(a As String) As WixCheckBox";
 //BA.debugLineNum = 161;BA.debugLine="CheckBox.SetLabelAlign(a)";
_checkbox._setlabelalign /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_a);
 //BA.debugLineNum = 162;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcheckbox)(this);
 //BA.debugLineNum = 163;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcheckbox  _setlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 166;BA.debugLine="Sub SetLabelPosition(p As String) As WixCheckBox";
 //BA.debugLineNum = 167;BA.debugLine="CheckBox.SetLabelPosition(p)";
_checkbox._setlabelposition /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_p);
 //BA.debugLineNum = 168;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcheckbox)(this);
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcheckbox  _setlabelright(String _l) throws Exception{
 //BA.debugLineNum = 136;BA.debugLine="Sub SetLabelRight(l As String) As WixCheckBox";
 //BA.debugLineNum = 137;BA.debugLine="CheckBox.SetAttr(\"labelRight\", l)";
_checkbox._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("labelRight",(Object)(_l));
 //BA.debugLineNum = 138;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcheckbox)(this);
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcheckbox  _setlabelwidth(int _w) throws Exception{
 //BA.debugLineNum = 172;BA.debugLine="Sub SetLabelWidth(w As Int) As WixCheckBox";
 //BA.debugLineNum = 173;BA.debugLine="CheckBox.SetLabelWidth(w)";
_checkbox._setlabelwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 174;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcheckbox)(this);
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcheckbox  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 113;BA.debugLine="Sub SetMap(m As Map) As WixCheckBox";
 //BA.debugLineNum = 114;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 115;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 116;BA.debugLine="CheckBox.SetAttr(strKey,	strVal)";
_checkbox._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 118;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcheckbox)(this);
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcheckbox  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Sub SetMargin(margin As Object) As WixCheckBox";
 //BA.debugLineNum = 30;BA.debugLine="CheckBox.SetMargin(margin)";
_checkbox._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcheckbox)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcheckbox  _setmaxheight(Object _maxheight) throws Exception{
 //BA.debugLineNum = 304;BA.debugLine="Sub SetMaxHeight(maxHeight As Object) As WixCheckB";
 //BA.debugLineNum = 305;BA.debugLine="CheckBox.SetAttr(\"maxHeight\", maxHeight)";
_checkbox._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxHeight",_maxheight);
 //BA.debugLineNum = 306;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcheckbox)(this);
 //BA.debugLineNum = 307;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcheckbox  _setmaxwidth(Object _maxwidth) throws Exception{
 //BA.debugLineNum = 309;BA.debugLine="Sub SetMaxWidth(maxWidth As Object) As WixCheckBox";
 //BA.debugLineNum = 310;BA.debugLine="CheckBox.SetAttr(\"maxWidth\", maxWidth)";
_checkbox._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxWidth",_maxwidth);
 //BA.debugLineNum = 311;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcheckbox)(this);
 //BA.debugLineNum = 312;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcheckbox  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Sub SetMinHeight(h As Int) As WixCheckBox";
 //BA.debugLineNum = 97;BA.debugLine="CheckBox.SetMinHeight(h)";
_checkbox._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 98;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcheckbox)(this);
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcheckbox  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Sub SetMinWidth(w As Int) As WixCheckBox";
 //BA.debugLineNum = 91;BA.debugLine="CheckBox.SetMinWidth(w)";
_checkbox._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 92;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcheckbox)(this);
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcheckbox  _setname(String _n) throws Exception{
 //BA.debugLineNum = 77;BA.debugLine="Sub SetName(n As String) As WixCheckBox";
 //BA.debugLineNum = 78;BA.debugLine="CheckBox.SetName(n)";
_checkbox._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 79;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcheckbox)(this);
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcheckbox  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Sub SetPadding(padding As Object) As WixCheckBox";
 //BA.debugLineNum = 24;BA.debugLine="CheckBox.SetPadding(padding)";
_checkbox._setpadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 25;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcheckbox)(this);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcheckbox  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub SetParent(p As WixElement) As WixCheckBox";
 //BA.debugLineNum = 18;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 19;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcheckbox)(this);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcheckbox  _setpopup(Object _popup) throws Exception{
 //BA.debugLineNum = 314;BA.debugLine="Sub SetPopup(popup As Object) As WixCheckBox";
 //BA.debugLineNum = 315;BA.debugLine="CheckBox.SetAttr(\"popup\", popup)";
_checkbox._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("popup",_popup);
 //BA.debugLineNum = 316;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcheckbox)(this);
 //BA.debugLineNum = 317;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcheckbox  _setrelatedaction(Object _relatedaction) throws Exception{
 //BA.debugLineNum = 319;BA.debugLine="Sub SetRelatedAction(relatedAction As Object) As W";
 //BA.debugLineNum = 320;BA.debugLine="CheckBox.SetAttr(\"relatedAction\", relatedAction)";
_checkbox._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("relatedAction",_relatedaction);
 //BA.debugLineNum = 321;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcheckbox)(this);
 //BA.debugLineNum = 322;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcheckbox  _setrelatedview(Object _relatedview) throws Exception{
 //BA.debugLineNum = 324;BA.debugLine="Sub SetRelatedView(relatedView As Object) As WixCh";
 //BA.debugLineNum = 325;BA.debugLine="CheckBox.SetAttr(\"relatedView\", relatedView)";
_checkbox._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("relatedView",_relatedview);
 //BA.debugLineNum = 326;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcheckbox)(this);
 //BA.debugLineNum = 327;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcheckbox  _setrequired(boolean _required) throws Exception{
 //BA.debugLineNum = 329;BA.debugLine="Sub SetRequired(required As Boolean) As WixCheckBo";
 //BA.debugLineNum = 330;BA.debugLine="CheckBox.SetAttr(\"required\", required)";
_checkbox._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("required",(Object)(_required));
 //BA.debugLineNum = 331;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcheckbox)(this);
 //BA.debugLineNum = 332;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcheckbox  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub SetResponsive(b As Object) As WixCheckBox";
 //BA.debugLineNum = 71;BA.debugLine="CheckBox.SetResponsive(b)";
_checkbox._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 72;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcheckbox)(this);
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcheckbox  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixCheckBox";
 //BA.debugLineNum = 84;BA.debugLine="CheckBox.SetResponsiveCell(b)";
_checkbox._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 85;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcheckbox)(this);
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcheckbox  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 52;BA.debugLine="CheckBox.SetStyle(prop,sval)";
_checkbox._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 53;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcheckbox)(this);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcheckbox  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 42;BA.debugLine="Sub SetStyles(m As Map) As WixCheckBox";
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
 //BA.debugLineNum = 45;BA.debugLine="CheckBox.SetStyle(k,v)";
_checkbox._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 47;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcheckbox)(this);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcheckbox  _setsuggest(Object _suggest) throws Exception{
 //BA.debugLineNum = 334;BA.debugLine="Sub SetSuggest(suggest As Object) As WixCheckBox";
 //BA.debugLineNum = 335;BA.debugLine="CheckBox.SetAttr(\"suggest\", suggest)";
_checkbox._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("suggest",_suggest);
 //BA.debugLineNum = 336;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcheckbox)(this);
 //BA.debugLineNum = 337;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcheckbox  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 62;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixCheckBo";
 //BA.debugLineNum = 63;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 64;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 65;BA.debugLine="CheckBox.SetTemplate(os)";
_checkbox._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 66;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcheckbox)(this);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcheckbox  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Sub SetTooltip(tt As String) As WixCheckBox";
 //BA.debugLineNum = 103;BA.debugLine="CheckBox.SetAttr(\"tooltip\", tt)";
_checkbox._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("tooltip",(Object)(_tt));
 //BA.debugLineNum = 104;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcheckbox)(this);
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcheckbox  _setuncheckvalue(Object _uncheckvalue) throws Exception{
 //BA.debugLineNum = 340;BA.debugLine="Sub SetUncheckValue(uncheckValue As Object) As Wix";
 //BA.debugLineNum = 341;BA.debugLine="CheckBox.SetAttr(\"uncheckValue\", uncheckValue)";
_checkbox._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("uncheckValue",_uncheckvalue);
 //BA.debugLineNum = 342;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcheckbox)(this);
 //BA.debugLineNum = 343;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcheckbox  _setvalidate(Object _validate) throws Exception{
 //BA.debugLineNum = 345;BA.debugLine="Sub SetValidate(validate As Object) As WixCheckBox";
 //BA.debugLineNum = 346;BA.debugLine="CheckBox.SetAttr(\"validate\", validate)";
_checkbox._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("validate",_validate);
 //BA.debugLineNum = 347;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcheckbox)(this);
 //BA.debugLineNum = 348;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcheckbox  _setvalidateevent(Object _validateevent) throws Exception{
 //BA.debugLineNum = 350;BA.debugLine="Sub SetValidateEvent(validateEvent As Object) As W";
 //BA.debugLineNum = 351;BA.debugLine="CheckBox.SetAttr(\"validateEvent\", validateEvent)";
_checkbox._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("validateEvent",_validateevent);
 //BA.debugLineNum = 352;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcheckbox)(this);
 //BA.debugLineNum = 353;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcheckbox  _setvalidateischecked(boolean _b) throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Sub SetValidateIsChecked(b As Boolean) As WixCheck";
 //BA.debugLineNum = 123;BA.debugLine="CheckBox.SetAttr(\"validate\",\"isChecked\")";
_checkbox._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("validate",(Object)("isChecked"));
 //BA.debugLineNum = 124;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcheckbox)(this);
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcheckbox  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 147;BA.debugLine="Sub SetValue(v As String) As WixCheckBox";
 //BA.debugLineNum = 148;BA.debugLine="CheckBox.SetValue(v)";
_checkbox._setvalue /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_v);
 //BA.debugLineNum = 149;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcheckbox)(this);
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcheckbox  _setwidth(Object _width) throws Exception{
 //BA.debugLineNum = 355;BA.debugLine="Sub SetWidth(width As Object) As WixCheckBox";
 //BA.debugLineNum = 356;BA.debugLine="CheckBox.SetAttr(\"width\", width)";
_checkbox._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("width",_width);
 //BA.debugLineNum = 357;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcheckbox)(this);
 //BA.debugLineNum = 358;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
