package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixcolorpicker extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixcolorpicker", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixcolorpicker.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _colorpicker = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 243;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 244;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 245;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 248;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 249;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 250;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.Mashy.BANanoWebixDemo.wixform _frm) throws Exception{
 //BA.debugLineNum = 170;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 171;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 172;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 238;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 239;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 240;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public ColorPicker As WixElement";
_colorpicker = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _initialize(anywheresoftware.b4a.BA _ba,String _bid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(bID As String) As WixColorPi";
 //BA.debugLineNum = 10;BA.debugLine="ID = bID.ToLowerCase";
_id = _bid.toLowerCase();
 //BA.debugLineNum = 11;BA.debugLine="ColorPicker.Initialize(ID).SetView(\"colorpicker\")";
_colorpicker._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_id)._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("colorpicker");
 //BA.debugLineNum = 12;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 51;BA.debugLine="Return ColorPicker.item";
if (true) return _colorpicker._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 56;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _setalign(Object _align) throws Exception{
 //BA.debugLineNum = 253;BA.debugLine="Sub SetAlign(align As Object) As WixColorPicker";
 //BA.debugLineNum = 254;BA.debugLine="ColorPicker.SetAttr(\"align\", align)";
_colorpicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("align",_align);
 //BA.debugLineNum = 255;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 256;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 225;BA.debugLine="Sub SetAlignCenter(r As String) As WixColorPicker";
 //BA.debugLineNum = 226;BA.debugLine="ColorPicker.setAligncenter(\"\")";
_colorpicker._setaligncenter /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 227;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 228;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 231;BA.debugLine="Sub SetAlignLeft(r As String) As WixColorPicker 'i";
 //BA.debugLineNum = 232;BA.debugLine="ColorPicker.SetAlignleft(\"\")";
_colorpicker._setalignleft /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 233;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 234;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 219;BA.debugLine="Sub SetAlignRight(r As String) As WixColorPicker '";
 //BA.debugLineNum = 220;BA.debugLine="ColorPicker.setAlignright(\"\")";
_colorpicker._setalignright /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 221;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 222;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _setanimate(boolean _animate) throws Exception{
 //BA.debugLineNum = 258;BA.debugLine="Sub SetAnimate(animate As Boolean) As WixColorPick";
 //BA.debugLineNum = 259;BA.debugLine="ColorPicker.SetAttr(\"animate\", animate)";
_colorpicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("animate",(Object)(_animate));
 //BA.debugLineNum = 260;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 261;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 33;BA.debugLine="Sub SetAttributes(m As Map) As WixColorPicker";
 //BA.debugLineNum = 34;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 35;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 36;BA.debugLine="ColorPicker.SetAttr(k,v)";
_colorpicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 38;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _setautowidth(boolean _autowidth) throws Exception{
 //BA.debugLineNum = 263;BA.debugLine="Sub SetAutowidth(autowidth As Boolean) As WixColor";
 //BA.debugLineNum = 264;BA.debugLine="ColorPicker.SetAttr(\"autowidth\", autowidth)";
_colorpicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("autowidth",(Object)(_autowidth));
 //BA.debugLineNum = 265;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 266;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _setborderless(boolean _borderless) throws Exception{
 //BA.debugLineNum = 268;BA.debugLine="Sub SetBorderless(borderless As Boolean) As WixCol";
 //BA.debugLineNum = 269;BA.debugLine="ColorPicker.SetAttr(\"borderless\", borderless)";
_colorpicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("borderless",(Object)(_borderless));
 //BA.debugLineNum = 270;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 271;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _setbottomlabel(Object _bottomlabel) throws Exception{
 //BA.debugLineNum = 273;BA.debugLine="Sub SetBottomLabel(bottomLabel As Object) As WixCo";
 //BA.debugLineNum = 274;BA.debugLine="ColorPicker.SetAttr(\"bottomLabel\", bottomLabel)";
_colorpicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("bottomLabel",_bottomlabel);
 //BA.debugLineNum = 275;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 276;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _setbottompadding(Object _bottompadding) throws Exception{
 //BA.debugLineNum = 278;BA.debugLine="Sub SetBottomPadding(bottomPadding As Object) As W";
 //BA.debugLineNum = 279;BA.debugLine="ColorPicker.SetAttr(\"bottomPadding\", bottomPaddin";
_colorpicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("bottomPadding",_bottompadding);
 //BA.debugLineNum = 280;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 281;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _setclick(Object _click) throws Exception{
 //BA.debugLineNum = 283;BA.debugLine="Sub SetClick(click As Object) As WixColorPicker";
 //BA.debugLineNum = 284;BA.debugLine="ColorPicker.SetAttr(\"click\", click)";
_colorpicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("click",_click);
 //BA.debugLineNum = 285;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 286;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _setcontainer(Object _container) throws Exception{
 //BA.debugLineNum = 288;BA.debugLine="Sub SetContainer(container As Object) As WixColorP";
 //BA.debugLineNum = 289;BA.debugLine="ColorPicker.SetAttr(\"container\", container)";
_colorpicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("container",_container);
 //BA.debugLineNum = 290;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 291;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _setcss(Object _css) throws Exception{
 //BA.debugLineNum = 293;BA.debugLine="Sub SetCss(css As Object) As WixColorPicker";
 //BA.debugLineNum = 294;BA.debugLine="ColorPicker.SetAttr(\"css\", css)";
_colorpicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("css",_css);
 //BA.debugLineNum = 295;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 296;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _setdisabled(boolean _b) throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Sub SetDisabled(b As Boolean) As WixColorPicker";
 //BA.debugLineNum = 110;BA.debugLine="ColorPicker.setattr(\"disabled\",b)";
_colorpicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("disabled",(Object)(_b));
 //BA.debugLineNum = 111;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _seteditable(boolean _editable) throws Exception{
 //BA.debugLineNum = 298;BA.debugLine="Sub SetEditable(editable As Boolean) As WixColorPi";
 //BA.debugLineNum = 299;BA.debugLine="ColorPicker.SetAttr(\"editable\", editable)";
_colorpicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("editable",(Object)(_editable));
 //BA.debugLineNum = 300;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 301;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _setformat(Object _format) throws Exception{
 //BA.debugLineNum = 303;BA.debugLine="Sub SetFormat(format As Object) As WixColorPicker";
 //BA.debugLineNum = 304;BA.debugLine="ColorPicker.SetAttr(\"format\", format)";
_colorpicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("format",_format);
 //BA.debugLineNum = 305;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 306;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _setgravity(Object _gravity) throws Exception{
 //BA.debugLineNum = 308;BA.debugLine="Sub SetGravity(gravity As Object) As WixColorPicke";
 //BA.debugLineNum = 309;BA.debugLine="ColorPicker.SetAttr(\"gravity\", gravity)";
_colorpicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("gravity",_gravity);
 //BA.debugLineNum = 310;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 311;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _setheight(Object _height) throws Exception{
 //BA.debugLineNum = 313;BA.debugLine="Sub SetHeight(height As Object) As WixColorPicker";
 //BA.debugLineNum = 314;BA.debugLine="ColorPicker.SetAttr(\"height\", height)";
_colorpicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("height",_height);
 //BA.debugLineNum = 315;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 316;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _sethidden(boolean _hidden) throws Exception{
 //BA.debugLineNum = 318;BA.debugLine="Sub SetHidden(hidden As Boolean) As WixColorPicker";
 //BA.debugLineNum = 319;BA.debugLine="ColorPicker.SetAttr(\"hidden\", hidden)";
_colorpicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hidden",(Object)(_hidden));
 //BA.debugLineNum = 320;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 321;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _sethotkey(Object _hotkey) throws Exception{
 //BA.debugLineNum = 323;BA.debugLine="Sub SetHotkey(hotkey As Object) As WixColorpicker";
 //BA.debugLineNum = 324;BA.debugLine="Colorpicker.SetAttr(\"hotkey\", hotkey)";
_colorpicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hotkey",_hotkey);
 //BA.debugLineNum = 325;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 326;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _seticons(boolean _icons) throws Exception{
 //BA.debugLineNum = 328;BA.debugLine="Sub SetIcons(icons As Boolean) As WixColorpicker";
 //BA.debugLineNum = 329;BA.debugLine="Colorpicker.SetAttr(\"icons\", icons)";
_colorpicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("icons",(Object)(_icons));
 //BA.debugLineNum = 330;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 331;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _setinputalign(Object _inputalign) throws Exception{
 //BA.debugLineNum = 333;BA.debugLine="Sub SetInputAlign(inputAlign As Object) As WixColo";
 //BA.debugLineNum = 334;BA.debugLine="ColorPicker.SetAttr(\"inputAlign\", inputAlign)";
_colorpicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("inputAlign",_inputalign);
 //BA.debugLineNum = 335;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 336;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _setinputheight(Object _inputheight) throws Exception{
 //BA.debugLineNum = 338;BA.debugLine="Sub SetInputHeight(inputHeight As Object) As WixCo";
 //BA.debugLineNum = 339;BA.debugLine="ColorPicker.SetAttr(\"inputHeight\", inputHeight)";
_colorpicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("inputHeight",_inputheight);
 //BA.debugLineNum = 340;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 341;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _setinputwidth(Object _inputwidth) throws Exception{
 //BA.debugLineNum = 343;BA.debugLine="Sub SetInputWidth(inputWidth As Object) As WixColo";
 //BA.debugLineNum = 344;BA.debugLine="ColorPicker.SetAttr(\"inputWidth\", inputWidth)";
_colorpicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("inputWidth",_inputwidth);
 //BA.debugLineNum = 345;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 346;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _setinvalid(Object _invalid) throws Exception{
 //BA.debugLineNum = 348;BA.debugLine="Sub SetInvalid(invalid As Object) As WixColorPicke";
 //BA.debugLineNum = 349;BA.debugLine="ColorPicker.SetAttr(\"invalid\", invalid)";
_colorpicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("invalid",_invalid);
 //BA.debugLineNum = 350;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 351;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _setinvalidmessage(String _msg) throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Sub SetInvalidMessage(msg As String) As WixColorPi";
 //BA.debugLineNum = 91;BA.debugLine="ColorPicker.SetAttr(\"invalidMessage\", msg)";
_colorpicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("invalidMessage",(Object)(_msg));
 //BA.debugLineNum = 92;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 188;BA.debugLine="Sub SetLabel(l As String) As WixColorPicker";
 //BA.debugLineNum = 189;BA.debugLine="ColorPicker.SetLabel(l)";
_colorpicker._setlabel /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_l);
 //BA.debugLineNum = 190;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 191;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _setlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 200;BA.debugLine="Sub SetLabelAlign(a As String) As WixColorPicker";
 //BA.debugLineNum = 201;BA.debugLine="ColorPicker.SetLabelAlign(a)";
_colorpicker._setlabelalign /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_a);
 //BA.debugLineNum = 202;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 203;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _setlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 206;BA.debugLine="Sub SetLabelPosition(p As String) As WixColorPicke";
 //BA.debugLineNum = 207;BA.debugLine="ColorPicker.SetLabelPosition(p)";
_colorpicker._setlabelposition /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_p);
 //BA.debugLineNum = 208;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 209;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _setlabelwidth(int _w) throws Exception{
 //BA.debugLineNum = 212;BA.debugLine="Sub SetLabelWidth(w As Int) As WixColorPicker";
 //BA.debugLineNum = 213;BA.debugLine="ColorPicker.SetLabelWidth(w)";
_colorpicker._setlabelwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 214;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 215;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 160;BA.debugLine="Sub SetMap(m As Map) As WixColorPicker";
 //BA.debugLineNum = 161;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 162;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 163;BA.debugLine="ColorPicker.SetAttr(strKey,	strVal)";
_colorpicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 165;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 166;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Sub SetMargin(margin As Object) As WixColorPicker";
 //BA.debugLineNum = 29;BA.debugLine="ColorPicker.SetMargin(margin)";
_colorpicker._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 30;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _setmaxheight(Object _maxheight) throws Exception{
 //BA.debugLineNum = 353;BA.debugLine="Sub SetMaxHeight(maxHeight As Object) As WixColorP";
 //BA.debugLineNum = 354;BA.debugLine="ColorPicker.SetAttr(\"maxHeight\", maxHeight)";
_colorpicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxHeight",_maxheight);
 //BA.debugLineNum = 355;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 356;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _setmaxwidth(Object _maxwidth) throws Exception{
 //BA.debugLineNum = 358;BA.debugLine="Sub SetMaxWidth(maxWidth As Object) As WixColorPic";
 //BA.debugLineNum = 359;BA.debugLine="ColorPicker.SetAttr(\"maxWidth\", maxWidth)";
_colorpicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxWidth",_maxwidth);
 //BA.debugLineNum = 360;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 361;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 148;BA.debugLine="Sub SetMinHeight(h As Int) As WixColorPicker";
 //BA.debugLineNum = 149;BA.debugLine="ColorPicker.SetMinHeight(h)";
_colorpicker._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 150;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 142;BA.debugLine="Sub SetMinWidth(w As Int) As WixColorPicker";
 //BA.debugLineNum = 143;BA.debugLine="ColorPicker.SetMinWidth(w)";
_colorpicker._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 144;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _setname(String _n) throws Exception{
 //BA.debugLineNum = 129;BA.debugLine="Sub SetName(n As String) As WixColorPicker";
 //BA.debugLineNum = 130;BA.debugLine="ColorPicker.SetName(n)";
_colorpicker._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 131;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Sub SetPadding(padding As Object) As WixColorPicke";
 //BA.debugLineNum = 23;BA.debugLine="ColorPicker.SetPadding(padding)";
_colorpicker._setpadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 24;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Sub SetParent(p As WixElement) As WixColorPicker";
 //BA.debugLineNum = 17;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 18;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _setplaceholder(Object _placeholder) throws Exception{
 //BA.debugLineNum = 364;BA.debugLine="Sub SetPlaceholder(placeholder As Object) As WixCo";
 //BA.debugLineNum = 365;BA.debugLine="ColorPicker.SetAttr(\"placeholder\", placeholder)";
_colorpicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("placeholder",_placeholder);
 //BA.debugLineNum = 366;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 367;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _setpoint(boolean _point) throws Exception{
 //BA.debugLineNum = 369;BA.debugLine="Sub SetPoint(point As Boolean) As WixColorPicker";
 //BA.debugLineNum = 370;BA.debugLine="ColorPicker.SetAttr(\"point\", point)";
_colorpicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("point",(Object)(_point));
 //BA.debugLineNum = 371;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 372;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _setpopup(Object _popup) throws Exception{
 //BA.debugLineNum = 374;BA.debugLine="Sub SetPopup(popup As Object) As WixColorPicker";
 //BA.debugLineNum = 375;BA.debugLine="ColorPicker.SetAttr(\"popup\", popup)";
_colorpicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("popup",_popup);
 //BA.debugLineNum = 376;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 377;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _setreadonly(boolean _b) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Sub SetReadOnly(b As Boolean) As WixColorPicker";
 //BA.debugLineNum = 104;BA.debugLine="ColorPicker.SetAttr(\"readonly\",b)";
_colorpicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("readonly",(Object)(_b));
 //BA.debugLineNum = 105;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _setrelatedaction(Object _relatedaction) throws Exception{
 //BA.debugLineNum = 379;BA.debugLine="Sub SetRelatedAction(relatedAction As Object) As W";
 //BA.debugLineNum = 380;BA.debugLine="ColorPicker.SetAttr(\"relatedAction\", relatedAction";
_colorpicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("relatedAction",_relatedaction);
 //BA.debugLineNum = 381;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 382;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _setrelatedview(Object _relatedview) throws Exception{
 //BA.debugLineNum = 384;BA.debugLine="Sub SetRelatedView(relatedView As Object) As WixCo";
 //BA.debugLineNum = 385;BA.debugLine="ColorPicker.SetAttr(\"relatedView\", relatedView)";
_colorpicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("relatedView",_relatedview);
 //BA.debugLineNum = 386;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 387;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _setrequired(boolean _b) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub SetRequired(b As Boolean) As WixColorPicker";
 //BA.debugLineNum = 98;BA.debugLine="ColorPicker.SetAttr(\"required\", b)";
_colorpicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("required",(Object)(_b));
 //BA.debugLineNum = 99;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Sub SetResponsive(b As Object) As WixColorPicker";
 //BA.debugLineNum = 123;BA.debugLine="ColorPicker.SetResponsive(b)";
_colorpicker._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 124;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 135;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixColorPick";
 //BA.debugLineNum = 136;BA.debugLine="ColorPicker.SetResponsiveCell(b)";
_colorpicker._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 137;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _setstringresult(Object _stringresult) throws Exception{
 //BA.debugLineNum = 389;BA.debugLine="Sub SetStringResult(stringResult As Object) As Wix";
 //BA.debugLineNum = 390;BA.debugLine="ColorPicker.SetAttr(\"stringResult\", stringResult)";
_colorpicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("stringResult",_stringresult);
 //BA.debugLineNum = 391;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 392;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 175;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 176;BA.debugLine="ColorPicker.SetStyle(prop,val)";
_colorpicker._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 177;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 178;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 41;BA.debugLine="Sub SetStyles(m As Map) As WixColorPicker";
 //BA.debugLineNum = 42;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 43;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 44;BA.debugLine="ColorPicker.SetStyle(k,v)";
_colorpicker._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 46;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _setsuggest(Object _suggest) throws Exception{
 //BA.debugLineNum = 394;BA.debugLine="Sub SetSuggest(suggest As Object) As WixColorPicke";
 //BA.debugLineNum = 395;BA.debugLine="ColorPicker.SetAttr(\"suggest\", suggest)";
_colorpicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("suggest",_suggest);
 //BA.debugLineNum = 396;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 397;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 114;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixColorPi";
 //BA.debugLineNum = 115;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 116;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 117;BA.debugLine="ColorPicker.SetTemplate(os)";
_colorpicker._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 118;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 154;BA.debugLine="Sub SetTooltip(tt As String) As WixColorPicker";
 //BA.debugLineNum = 155;BA.debugLine="ColorPicker.SetTooltip(tt)";
_colorpicker._settooltip /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_tt);
 //BA.debugLineNum = 156;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _setvalidate(Object _v) throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Sub SetValidate(v As Object) As WixColorPicker   '";
 //BA.debugLineNum = 84;BA.debugLine="ColorPicker.SetAttr(\"validate\",v)";
_colorpicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("validate",_v);
 //BA.debugLineNum = 85;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _setvalidateevent(Object _e) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub SetValidateEvent(e As Object) As WixColorPicke";
 //BA.debugLineNum = 61;BA.debugLine="ColorPicker.SetAttr(\"validateEvent\", e)";
_colorpicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("validateEvent",_e);
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _setvalidateeventblur(boolean _b) throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Sub SetValidateEventBlur(b As Boolean) As WixColor";
 //BA.debugLineNum = 66;BA.debugLine="ColorPicker.SetAttr(\"validateEvent\", \"blur\")";
_colorpicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("validateEvent",(Object)("blur"));
 //BA.debugLineNum = 67;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _setvalidateeventkey(boolean _b) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub SetValidateEventKey(b As Boolean) As WixColorP";
 //BA.debugLineNum = 71;BA.debugLine="ColorPicker.SetAttr(\"validateEvent\", \"key\")";
_colorpicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("validateEvent",(Object)("key"));
 //BA.debugLineNum = 72;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _setvalidateisnotempty(boolean _b) throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Sub SetValidateIsNotEmpty(b As Boolean) As WixColo";
 //BA.debugLineNum = 77;BA.debugLine="ColorPicker.SetAttr(\"validate\",\"isNotEmpty\")";
_colorpicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("validate",(Object)("isNotEmpty"));
 //BA.debugLineNum = 78;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 182;BA.debugLine="Sub SetValue(v As String) As WixColorPicker";
 //BA.debugLineNum = 183;BA.debugLine="ColorPicker.SetValue(v)";
_colorpicker._setvalue /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_v);
 //BA.debugLineNum = 184;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 185;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 194;BA.debugLine="Sub SetWidth(w As Object) As WixColorPicker";
 //BA.debugLineNum = 195;BA.debugLine="ColorPicker.SetWidth(w)";
_colorpicker._setwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 196;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorpicker)(this);
 //BA.debugLineNum = 197;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
