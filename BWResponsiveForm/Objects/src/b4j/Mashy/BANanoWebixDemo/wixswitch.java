package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixswitch extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixswitch", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixswitch.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _switch = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 202;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 203;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 204;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 207;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 208;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 209;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.Mashy.BANanoWebixDemo.wixform _frm) throws Exception{
 //BA.debugLineNum = 137;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 138;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 197;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 198;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 199;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Switch As WixElement";
_switch = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _initialize(anywheresoftware.b4a.BA _ba,String _iid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(iID As String) As WixSwitch";
 //BA.debugLineNum = 10;BA.debugLine="ID = iID.tolowercase";
_id = _iid.toLowerCase();
 //BA.debugLineNum = 11;BA.debugLine="Switch.Initialize(iID).SetView(\"switch\")";
_switch._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_iid)._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("switch");
 //BA.debugLineNum = 12;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 13;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 142;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 143;BA.debugLine="Return Switch.item";
if (true) return _switch._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 67;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _setalign(Object _align) throws Exception{
 //BA.debugLineNum = 212;BA.debugLine="Sub SetAlign(align As Object) As WixSwitch";
 //BA.debugLineNum = 213;BA.debugLine="Switch.SetAttr(\"align\", align)";
_switch._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("align",_align);
 //BA.debugLineNum = 214;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 215;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 184;BA.debugLine="Sub SetAlignCenter(r As String) As WixSwitch 'igno";
 //BA.debugLineNum = 185;BA.debugLine="Switch.setAligncenter(\"\")";
_switch._setaligncenter /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 186;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 187;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 190;BA.debugLine="Sub SetAlignLeft(r As String) As WixSwitch 'ignore";
 //BA.debugLineNum = 191;BA.debugLine="Switch.SetAlignleft(\"\")";
_switch._setalignleft /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 192;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 193;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 178;BA.debugLine="Sub SetAlignRight(r As String) As WixSwitch 'ignor";
 //BA.debugLineNum = 179;BA.debugLine="Switch.setAlignright(\"\")";
_switch._setalignright /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 180;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 181;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _setanimate(boolean _animate) throws Exception{
 //BA.debugLineNum = 217;BA.debugLine="Sub SetAnimate(animate As Boolean) As WixSwitch";
 //BA.debugLineNum = 218;BA.debugLine="Switch.SetAttr(\"animate\", animate)";
_switch._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("animate",(Object)(_animate));
 //BA.debugLineNum = 219;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 220;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 28;BA.debugLine="Sub SetAttributes(m As Map) As WixSwitch";
 //BA.debugLineNum = 29;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 30;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 31;BA.debugLine="Switch.SetAttr(k,v)";
_switch._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 33;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _setbadge(Object _badge) throws Exception{
 //BA.debugLineNum = 222;BA.debugLine="Sub SetBadge(badge As Object) As WixSwitch";
 //BA.debugLineNum = 223;BA.debugLine="Switch.SetAttr(\"badge\", badge)";
_switch._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("badge",_badge);
 //BA.debugLineNum = 224;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 225;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _setborderless(boolean _borderless) throws Exception{
 //BA.debugLineNum = 227;BA.debugLine="Sub SetBorderless(borderless As Boolean) As WixSwi";
 //BA.debugLineNum = 228;BA.debugLine="Switch.SetAttr(\"borderless\", borderless)";
_switch._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("borderless",(Object)(_borderless));
 //BA.debugLineNum = 229;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 230;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _setbottomlabel(Object _bottomlabel) throws Exception{
 //BA.debugLineNum = 232;BA.debugLine="Sub SetBottomLabel(bottomLabel As Object) As WixSw";
 //BA.debugLineNum = 233;BA.debugLine="Switch.SetAttr(\"bottomLabel\", bottomLabel)";
_switch._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("bottomLabel",_bottomlabel);
 //BA.debugLineNum = 234;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 235;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _setbottompadding(Object _bottompadding) throws Exception{
 //BA.debugLineNum = 237;BA.debugLine="Sub SetBottomPadding(bottomPadding As Object) As W";
 //BA.debugLineNum = 238;BA.debugLine="Switch.SetAttr(\"bottomPadding\", bottomPadding)";
_switch._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("bottomPadding",_bottompadding);
 //BA.debugLineNum = 239;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 240;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _setcheckvalue(Object _checkvalue) throws Exception{
 //BA.debugLineNum = 242;BA.debugLine="Sub SetCheckValue(checkValue As Object) As WixSwit";
 //BA.debugLineNum = 243;BA.debugLine="Switch.SetAttr(\"checkValue\", checkValue)";
_switch._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("checkValue",_checkvalue);
 //BA.debugLineNum = 244;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 245;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _setclick(Object _click) throws Exception{
 //BA.debugLineNum = 247;BA.debugLine="Sub SetClick(click As Object) As WixSwitch";
 //BA.debugLineNum = 248;BA.debugLine="Switch.SetAttr(\"click\", click)";
_switch._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("click",_click);
 //BA.debugLineNum = 249;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 250;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _setcontainer(Object _container) throws Exception{
 //BA.debugLineNum = 252;BA.debugLine="Sub SetContainer(container As Object) As WixSwitch";
 //BA.debugLineNum = 253;BA.debugLine="Switch.SetAttr(\"container\", container)";
_switch._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("container",_container);
 //BA.debugLineNum = 254;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 255;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _setcss(Object _css) throws Exception{
 //BA.debugLineNum = 257;BA.debugLine="Sub SetCss(css As Object) As WixSwitch";
 //BA.debugLineNum = 258;BA.debugLine="Switch.SetAttr(\"css\", css)";
_switch._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("css",_css);
 //BA.debugLineNum = 259;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 260;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _setcustomcheckbox(Object _customcheckbox) throws Exception{
 //BA.debugLineNum = 262;BA.debugLine="Sub SetCustomCheckbox(customCheckbox As Object) As";
 //BA.debugLineNum = 263;BA.debugLine="Switch.SetAttr(\"customCheckbox\", customCheckbox)";
_switch._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("customCheckbox",_customcheckbox);
 //BA.debugLineNum = 264;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 265;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _setdisabled(boolean _disabled) throws Exception{
 //BA.debugLineNum = 267;BA.debugLine="Sub SetDisabled(disabled As Boolean) As WixSwitch";
 //BA.debugLineNum = 268;BA.debugLine="Switch.SetAttr(\"disabled\", disabled)";
_switch._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("disabled",(Object)(_disabled));
 //BA.debugLineNum = 269;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 270;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _setformat(Object _format) throws Exception{
 //BA.debugLineNum = 272;BA.debugLine="Sub SetFormat(format As Object) As WixSwitch";
 //BA.debugLineNum = 273;BA.debugLine="Switch.SetAttr(\"format\", format)";
_switch._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("format",_format);
 //BA.debugLineNum = 274;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 275;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _setgravity(Object _gravity) throws Exception{
 //BA.debugLineNum = 277;BA.debugLine="Sub SetGravity(gravity As Object) As WixSwitch";
 //BA.debugLineNum = 278;BA.debugLine="Switch.SetAttr(\"gravity\", gravity)";
_switch._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("gravity",_gravity);
 //BA.debugLineNum = 279;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 280;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _setheight(Object _height) throws Exception{
 //BA.debugLineNum = 282;BA.debugLine="Sub SetHeight(height As Object) As WixSwitch";
 //BA.debugLineNum = 283;BA.debugLine="Switch.SetAttr(\"height\", height)";
_switch._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("height",_height);
 //BA.debugLineNum = 284;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 285;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _sethidden(boolean _hidden) throws Exception{
 //BA.debugLineNum = 287;BA.debugLine="Sub SetHidden(hidden As Boolean) As WixSwitch";
 //BA.debugLineNum = 288;BA.debugLine="Switch.SetAttr(\"hidden\", hidden)";
_switch._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hidden",(Object)(_hidden));
 //BA.debugLineNum = 289;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 290;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _seticon(Object _icon) throws Exception{
 //BA.debugLineNum = 292;BA.debugLine="Sub SetIcon(icon As Object) As WixSwitch";
 //BA.debugLineNum = 293;BA.debugLine="Switch.SetAttr(\"icon\", icon)";
_switch._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("icon",_icon);
 //BA.debugLineNum = 294;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 295;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _setimage(Object _image) throws Exception{
 //BA.debugLineNum = 297;BA.debugLine="Sub SetImage(image As Object) As WixSwitch";
 //BA.debugLineNum = 298;BA.debugLine="Switch.SetAttr(\"image\", image)";
_switch._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("image",_image);
 //BA.debugLineNum = 299;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 300;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _setinputalign(Object _inputalign) throws Exception{
 //BA.debugLineNum = 302;BA.debugLine="Sub SetInputAlign(inputAlign As Object) As WixSwit";
 //BA.debugLineNum = 303;BA.debugLine="Switch.SetAttr(\"inputAlign\", inputAlign)";
_switch._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("inputAlign",_inputalign);
 //BA.debugLineNum = 304;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 305;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _setinputheight(Object _inputheight) throws Exception{
 //BA.debugLineNum = 307;BA.debugLine="Sub SetInputHeight(inputHeight As Object) As WixSw";
 //BA.debugLineNum = 308;BA.debugLine="Switch.SetAttr(\"inputHeight\", inputHeight)";
_switch._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("inputHeight",_inputheight);
 //BA.debugLineNum = 309;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 310;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _setinputwidth(Object _inputwidth) throws Exception{
 //BA.debugLineNum = 312;BA.debugLine="Sub SetInputWidth(inputWidth As Object) As WixSwit";
 //BA.debugLineNum = 313;BA.debugLine="Switch.SetAttr(\"inputWidth\", inputWidth)";
_switch._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("inputWidth",_inputwidth);
 //BA.debugLineNum = 314;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 315;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _setinvalid(Object _invalid) throws Exception{
 //BA.debugLineNum = 317;BA.debugLine="Sub SetInvalid(invalid As Object) As WixSwitch";
 //BA.debugLineNum = 318;BA.debugLine="Switch.SetAttr(\"invalid\", invalid)";
_switch._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("invalid",_invalid);
 //BA.debugLineNum = 319;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 320;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _setinvalidmessage(Object _invalidmessage) throws Exception{
 //BA.debugLineNum = 322;BA.debugLine="Sub SetInvalidMessage(invalidMessage As Object) As";
 //BA.debugLineNum = 323;BA.debugLine="Switch.SetAttr(\"invalidMessage\", invalidMessage)";
_switch._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("invalidMessage",_invalidmessage);
 //BA.debugLineNum = 324;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 325;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 153;BA.debugLine="Sub SetLabel(l As String) As WixSwitch";
 //BA.debugLineNum = 154;BA.debugLine="Switch.SetLabel(l)";
_switch._setlabel /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_l);
 //BA.debugLineNum = 155;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 156;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _setlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 159;BA.debugLine="Sub SetLabelAlign(a As String) As WixSwitch";
 //BA.debugLineNum = 160;BA.debugLine="Switch.SetLabelAlign(a)";
_switch._setlabelalign /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_a);
 //BA.debugLineNum = 161;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 162;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _setlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 165;BA.debugLine="Sub SetLabelPosition(p As String) As WixSwitch";
 //BA.debugLineNum = 166;BA.debugLine="Switch.SetLabelPosition(p)";
_switch._setlabelposition /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_p);
 //BA.debugLineNum = 167;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _setlabelright(String _l) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub SetLabelRight(l As String) As WixSwitch";
 //BA.debugLineNum = 53;BA.debugLine="Switch.SetAttr(\"labelRight\", l)";
_switch._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("labelRight",(Object)(_l));
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _setlabelwidth(int _w) throws Exception{
 //BA.debugLineNum = 171;BA.debugLine="Sub SetLabelWidth(w As Int) As WixSwitch";
 //BA.debugLineNum = 172;BA.debugLine="Switch.SetLabelWidth(w)";
_switch._setlabelwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 173;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 71;BA.debugLine="Sub SetMap(m As Map) As WixSwitch";
 //BA.debugLineNum = 72;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 73;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 74;BA.debugLine="Switch.SetAttr(strKey,	strVal)";
_switch._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 76;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Sub SetMargin(margin As Object) As WixSwitch";
 //BA.debugLineNum = 24;BA.debugLine="Switch.SetMargin(margin)";
_switch._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 25;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _setmaxheight(Object _maxheight) throws Exception{
 //BA.debugLineNum = 327;BA.debugLine="Sub SetMaxHeight(maxHeight As Object) As WixSwitch";
 //BA.debugLineNum = 328;BA.debugLine="Switch.SetAttr(\"maxHeight\", maxHeight)";
_switch._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxHeight",_maxheight);
 //BA.debugLineNum = 329;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 330;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _setmaxwidth(Object _maxwidth) throws Exception{
 //BA.debugLineNum = 332;BA.debugLine="Sub SetMaxWidth(maxWidth As Object) As WixSwitch";
 //BA.debugLineNum = 333;BA.debugLine="Switch.SetAttr(\"maxWidth\", maxWidth)";
_switch._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxWidth",_maxwidth);
 //BA.debugLineNum = 334;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 335;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 113;BA.debugLine="Sub SetMinHeight(h As Int) As WixSwitch";
 //BA.debugLineNum = 114;BA.debugLine="Switch.SetMinHeight(h)";
_switch._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 115;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Sub SetMinWidth(w As Int) As WixSwitch";
 //BA.debugLineNum = 108;BA.debugLine="Switch.SetMinWidth(w)";
_switch._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 109;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _setname(String _n) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Sub SetName(n As String) As WixSwitch";
 //BA.debugLineNum = 89;BA.debugLine="Switch.SetName(n)";
_switch._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 90;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _setofflabel(String _l) throws Exception{
 //BA.debugLineNum = 125;BA.debugLine="Sub SetOffLabel(l As String) As WixSwitch";
 //BA.debugLineNum = 126;BA.debugLine="Switch.SetAttr(\"offLabel\", l)";
_switch._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("offLabel",(Object)(_l));
 //BA.debugLineNum = 127;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _setonlabel(String _l) throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Sub SetOnLabel(l As String) As WixSwitch";
 //BA.debugLineNum = 120;BA.debugLine="Switch.SetAttr(\"onLabel\", l)";
_switch._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("onLabel",(Object)(_l));
 //BA.debugLineNum = 121;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub SetPadding(padding As Object) As WixSwitch";
 //BA.debugLineNum = 18;BA.debugLine="Switch.SetPadding(padding)";
_switch._setpadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 19;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub SetParent(p As WixElement) As WixSwitch";
 //BA.debugLineNum = 59;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 60;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _setpattern(Object _pattern) throws Exception{
 //BA.debugLineNum = 337;BA.debugLine="Sub SetPattern(pattern As Object) As WixSwitch";
 //BA.debugLineNum = 338;BA.debugLine="Switch.SetAttr(\"pattern\", pattern)";
_switch._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("pattern",_pattern);
 //BA.debugLineNum = 339;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 340;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _setplaceholder(Object _placeholder) throws Exception{
 //BA.debugLineNum = 342;BA.debugLine="Sub SetPlaceholder(placeholder As Object) As WixSw";
 //BA.debugLineNum = 343;BA.debugLine="Switch.SetAttr(\"placeholder\", placeholder)";
_switch._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("placeholder",_placeholder);
 //BA.debugLineNum = 344;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 345;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _setpopup(Object _popup) throws Exception{
 //BA.debugLineNum = 347;BA.debugLine="Sub SetPopup(popup As Object) As WixSwitch";
 //BA.debugLineNum = 348;BA.debugLine="Switch.SetAttr(\"popup\", popup)";
_switch._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("popup",_popup);
 //BA.debugLineNum = 349;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 350;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _setreadonly(boolean _readonly) throws Exception{
 //BA.debugLineNum = 352;BA.debugLine="Sub SetReadonly(readonly As Boolean) As WixSwitch";
 //BA.debugLineNum = 353;BA.debugLine="Switch.SetAttr(\"readonly\", readonly)";
_switch._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("readonly",(Object)(_readonly));
 //BA.debugLineNum = 354;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 355;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _setrelatedaction(Object _relatedaction) throws Exception{
 //BA.debugLineNum = 357;BA.debugLine="Sub SetRelatedAction(relatedAction As Object) As W";
 //BA.debugLineNum = 358;BA.debugLine="Switch.SetAttr(\"relatedAction\", relatedAction)";
_switch._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("relatedAction",_relatedaction);
 //BA.debugLineNum = 359;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 360;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _setrelatedview(Object _relatedview) throws Exception{
 //BA.debugLineNum = 362;BA.debugLine="Sub SetRelatedView(relatedView As Object) As WixSw";
 //BA.debugLineNum = 363;BA.debugLine="Switch.SetAttr(\"relatedView\", relatedView)";
_switch._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("relatedView",_relatedview);
 //BA.debugLineNum = 364;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 365;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _setrequired(boolean _required) throws Exception{
 //BA.debugLineNum = 367;BA.debugLine="Sub SetRequired(required As Boolean) As WixSwitch";
 //BA.debugLineNum = 368;BA.debugLine="Switch.SetAttr(\"required\", required)";
_switch._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("required",(Object)(_required));
 //BA.debugLineNum = 369;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 370;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Sub SetResponsive(b As Object) As WixSwitch";
 //BA.debugLineNum = 95;BA.debugLine="Switch.SetResponsive(b)";
_switch._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 96;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixSwitch";
 //BA.debugLineNum = 101;BA.debugLine="Switch.SetResponsiveCell(b)";
_switch._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 102;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 46;BA.debugLine="Switch.SetStyle(prop,sval)";
_switch._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 47;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 36;BA.debugLine="Sub SetStyles(m As Map) As WixSwitch";
 //BA.debugLineNum = 37;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 38;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 39;BA.debugLine="Switch.SetStyle(k,v)";
_switch._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 41;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _setsuggest(Object _suggest) throws Exception{
 //BA.debugLineNum = 372;BA.debugLine="Sub SetSuggest(suggest As Object) As WixSwitch";
 //BA.debugLineNum = 373;BA.debugLine="Switch.SetAttr(\"suggest\", suggest)";
_switch._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("suggest",_suggest);
 //BA.debugLineNum = 374;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 375;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 80;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixSwitch";
 //BA.debugLineNum = 81;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 82;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 83;BA.debugLine="Switch.SetTemplate(os)";
_switch._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 84;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 131;BA.debugLine="Sub SetTooltip(tt As String) As WixSwitch";
 //BA.debugLineNum = 132;BA.debugLine="Switch.SetAttr(\"tooltip\", tt)";
_switch._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("tooltip",(Object)(_tt));
 //BA.debugLineNum = 133;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _settype(Object _stype) throws Exception{
 //BA.debugLineNum = 377;BA.debugLine="Sub SetType(sType As Object) As WixSwitch";
 //BA.debugLineNum = 378;BA.debugLine="Switch.SetAttr(\"type\", sType)";
_switch._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("type",_stype);
 //BA.debugLineNum = 379;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 380;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _setuncheckvalue(Object _uncheckvalue) throws Exception{
 //BA.debugLineNum = 382;BA.debugLine="Sub SetUncheckValue(uncheckValue As Object) As Wix";
 //BA.debugLineNum = 383;BA.debugLine="Switch.SetAttr(\"uncheckValue\", uncheckValue)";
_switch._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("uncheckValue",_uncheckvalue);
 //BA.debugLineNum = 384;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 385;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _setvalidate(Object _validate) throws Exception{
 //BA.debugLineNum = 387;BA.debugLine="Sub SetValidate(validate As Object) As WixSwitch";
 //BA.debugLineNum = 388;BA.debugLine="Switch.SetAttr(\"validate\", validate)";
_switch._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("validate",_validate);
 //BA.debugLineNum = 389;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 390;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _setvalidateevent(Object _validateevent) throws Exception{
 //BA.debugLineNum = 392;BA.debugLine="Sub SetValidateEvent(validateEvent As Object) As W";
 //BA.debugLineNum = 393;BA.debugLine="Switch.SetAttr(\"validateEvent\", validateEvent)";
_switch._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("validateEvent",_validateevent);
 //BA.debugLineNum = 394;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 395;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 147;BA.debugLine="Sub SetValue(v As String) As WixSwitch";
 //BA.debugLineNum = 148;BA.debugLine="Switch.SetValue(v)";
_switch._setvalue /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_v);
 //BA.debugLineNum = 149;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _setwidth(Object _width) throws Exception{
 //BA.debugLineNum = 397;BA.debugLine="Sub SetWidth(width As Object) As WixSwitch";
 //BA.debugLineNum = 398;BA.debugLine="Switch.SetAttr(\"width\", width)";
_switch._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("width",_width);
 //BA.debugLineNum = 399;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixswitch)(this);
 //BA.debugLineNum = 400;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
