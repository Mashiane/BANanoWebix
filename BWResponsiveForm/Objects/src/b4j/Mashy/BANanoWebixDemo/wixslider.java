package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixslider extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixslider", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixslider.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _slider = null;
public int _minimum = 0;
public int _maximum = 0;
public int _stepper = 0;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 229;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 230;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 231;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 234;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 235;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 236;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.Mashy.BANanoWebixDemo.wixform _frm) throws Exception{
 //BA.debugLineNum = 120;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 121;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 224;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 225;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 226;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Slider As WixElement";
_slider = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private Minimum As Int";
_minimum = 0;
 //BA.debugLineNum = 6;BA.debugLine="Private Maximum As Int";
_maximum = 0;
 //BA.debugLineNum = 7;BA.debugLine="Private Stepper As Int";
_stepper = 0;
 //BA.debugLineNum = 8;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _initialize(anywheresoftware.b4a.BA _ba,String _iid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize(iID As String) As WixSlider";
 //BA.debugLineNum = 13;BA.debugLine="ID = iID.tolowercase";
_id = _iid.toLowerCase();
 //BA.debugLineNum = 14;BA.debugLine="Slider.Initialize(iID).SetView(\"slider\")";
_slider._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_iid)._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("slider");
 //BA.debugLineNum = 15;BA.debugLine="Minimum = 0";
_minimum = (int) (0);
 //BA.debugLineNum = 16;BA.debugLine="Maximum = 100";
_maximum = (int) (100);
 //BA.debugLineNum = 17;BA.debugLine="Slider.SetValue(10)";
_slider._setvalue /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.NumberToString(10));
 //BA.debugLineNum = 18;BA.debugLine="Stepper = 1";
_stepper = (int) (1);
 //BA.debugLineNum = 19;BA.debugLine="Slider.SetAttr(\"title\", \"#value#\")";
_slider._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("title",(Object)("#value#"));
 //BA.debugLineNum = 20;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 21;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 143;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 144;BA.debugLine="Slider.SetAttr(\"min\",Minimum)";
_slider._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("min",(Object)(_minimum));
 //BA.debugLineNum = 145;BA.debugLine="Slider.SetAttr(\"max\",Maximum)";
_slider._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("max",(Object)(_maximum));
 //BA.debugLineNum = 146;BA.debugLine="Slider.SetAttr(\"step\", Stepper)";
_slider._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("step",(Object)(_stepper));
 //BA.debugLineNum = 147;BA.debugLine="Return Slider.item";
if (true) return _slider._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 68;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _setalign(Object _align) throws Exception{
 //BA.debugLineNum = 238;BA.debugLine="Sub SetAlign(align As Object) As WixSlider";
 //BA.debugLineNum = 239;BA.debugLine="Slider.SetAttr(\"align\", align)";
_slider._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("align",_align);
 //BA.debugLineNum = 240;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 241;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 211;BA.debugLine="Sub SetAlignCenter(r As String) As WixSlider 'igno";
 //BA.debugLineNum = 212;BA.debugLine="Slider.setAligncenter(\"\")";
_slider._setaligncenter /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 213;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 214;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 217;BA.debugLine="Sub SetAlignLeft(r As String) As WixSlider 'ignore";
 //BA.debugLineNum = 218;BA.debugLine="Slider.SetAlignleft(\"\")";
_slider._setalignleft /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 219;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 220;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 205;BA.debugLine="Sub SetAlignRight(r As String) As WixSlider 'ignor";
 //BA.debugLineNum = 206;BA.debugLine="Slider.setAlignright(\"\")";
_slider._setalignright /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 207;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 208;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _setanimate(boolean _animate) throws Exception{
 //BA.debugLineNum = 243;BA.debugLine="Sub SetAnimate(animate As Boolean) As WixSlider";
 //BA.debugLineNum = 244;BA.debugLine="Slider.SetAttr(\"animate\", animate)";
_slider._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("animate",(Object)(_animate));
 //BA.debugLineNum = 245;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 246;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 36;BA.debugLine="Sub SetAttributes(m As Map) As WixSlider";
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
 //BA.debugLineNum = 39;BA.debugLine="Slider.SetAttr(k,v)";
_slider._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 41;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _setborderless(boolean _borderless) throws Exception{
 //BA.debugLineNum = 248;BA.debugLine="Sub SetBorderless(borderless As Boolean) As WixSli";
 //BA.debugLineNum = 249;BA.debugLine="Slider.SetAttr(\"borderless\", borderless)";
_slider._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("borderless",(Object)(_borderless));
 //BA.debugLineNum = 250;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 251;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _setbottomlabel(Object _bottomlabel) throws Exception{
 //BA.debugLineNum = 253;BA.debugLine="Sub SetBottomLabel(bottomLabel As Object) As WixSl";
 //BA.debugLineNum = 254;BA.debugLine="Slider.SetAttr(\"bottomLabel\", bottomLabel)";
_slider._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("bottomLabel",_bottomlabel);
 //BA.debugLineNum = 255;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 256;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _setbottompadding(Object _bottompadding) throws Exception{
 //BA.debugLineNum = 258;BA.debugLine="Sub SetBottomPadding(bottomPadding As Object) As W";
 //BA.debugLineNum = 259;BA.debugLine="Slider.SetAttr(\"bottomPadding\", bottomPadding)";
_slider._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("bottomPadding",_bottompadding);
 //BA.debugLineNum = 260;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 261;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _setclick(Object _click) throws Exception{
 //BA.debugLineNum = 263;BA.debugLine="Sub SetClick(click As Object) As WixSlider";
 //BA.debugLineNum = 264;BA.debugLine="Slider.SetAttr(\"click\", click)";
_slider._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("click",_click);
 //BA.debugLineNum = 265;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 266;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _setcontainer(Object _container) throws Exception{
 //BA.debugLineNum = 268;BA.debugLine="Sub SetContainer(container As Object) As WixSlider";
 //BA.debugLineNum = 269;BA.debugLine="Slider.SetAttr(\"container\", container)";
_slider._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("container",_container);
 //BA.debugLineNum = 270;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 271;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _setcss(Object _css) throws Exception{
 //BA.debugLineNum = 273;BA.debugLine="Sub SetCss(css As Object) As WixSlider";
 //BA.debugLineNum = 274;BA.debugLine="Slider.SetAttr(\"css\", css)";
_slider._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("css",_css);
 //BA.debugLineNum = 275;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 276;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _setdisabled(boolean _disabled) throws Exception{
 //BA.debugLineNum = 278;BA.debugLine="Sub SetDisabled(disabled As Boolean) As WixSlider";
 //BA.debugLineNum = 279;BA.debugLine="Slider.SetAttr(\"disabled\", disabled)";
_slider._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("disabled",(Object)(_disabled));
 //BA.debugLineNum = 280;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 281;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _setformat(Object _format) throws Exception{
 //BA.debugLineNum = 283;BA.debugLine="Sub SetFormat(format As Object) As WixSlider";
 //BA.debugLineNum = 284;BA.debugLine="Slider.SetAttr(\"format\", format)";
_slider._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("format",_format);
 //BA.debugLineNum = 285;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 286;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _setgravity(Object _gravity) throws Exception{
 //BA.debugLineNum = 288;BA.debugLine="Sub SetGravity(gravity As Object) As WixSlider";
 //BA.debugLineNum = 289;BA.debugLine="Slider.SetAttr(\"gravity\", gravity)";
_slider._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("gravity",_gravity);
 //BA.debugLineNum = 290;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 291;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _setheight(Object _height) throws Exception{
 //BA.debugLineNum = 293;BA.debugLine="Sub SetHeight(height As Object) As WixSlider";
 //BA.debugLineNum = 294;BA.debugLine="Slider.SetAttr(\"height\", height)";
_slider._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("height",_height);
 //BA.debugLineNum = 295;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 296;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _sethidden(boolean _hidden) throws Exception{
 //BA.debugLineNum = 298;BA.debugLine="Sub SetHidden(hidden As Boolean) As WixSlider";
 //BA.debugLineNum = 299;BA.debugLine="Slider.SetAttr(\"hidden\", hidden)";
_slider._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hidden",(Object)(_hidden));
 //BA.debugLineNum = 300;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 301;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _sethotkey(Object _hotkey) throws Exception{
 //BA.debugLineNum = 303;BA.debugLine="Sub SetHotkey(hotkey As Object) As WixSlider";
 //BA.debugLineNum = 304;BA.debugLine="Slider.SetAttr(\"hotkey\", hotkey)";
_slider._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hotkey",_hotkey);
 //BA.debugLineNum = 305;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 306;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _setinputalign(Object _inputalign) throws Exception{
 //BA.debugLineNum = 308;BA.debugLine="Sub SetInputAlign(inputAlign As Object) As WixSlid";
 //BA.debugLineNum = 309;BA.debugLine="Slider.SetAttr(\"inputAlign\", inputAlign)";
_slider._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("inputAlign",_inputalign);
 //BA.debugLineNum = 310;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 311;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _setinputheight(Object _inputheight) throws Exception{
 //BA.debugLineNum = 313;BA.debugLine="Sub SetInputHeight(inputHeight As Object) As WixSl";
 //BA.debugLineNum = 314;BA.debugLine="Slider.SetAttr(\"inputHeight\", inputHeight)";
_slider._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("inputHeight",_inputheight);
 //BA.debugLineNum = 315;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 316;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _setinputwidth(Object _inputwidth) throws Exception{
 //BA.debugLineNum = 318;BA.debugLine="Sub SetInputWidth(inputWidth As Object) As WixSlid";
 //BA.debugLineNum = 319;BA.debugLine="Slider.SetAttr(\"inputWidth\", inputWidth)";
_slider._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("inputWidth",_inputwidth);
 //BA.debugLineNum = 320;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 321;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _setinvalid(Object _invalid) throws Exception{
 //BA.debugLineNum = 323;BA.debugLine="Sub SetInvalid(invalid As Object) As WixSlider";
 //BA.debugLineNum = 324;BA.debugLine="Slider.SetAttr(\"invalid\", invalid)";
_slider._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("invalid",_invalid);
 //BA.debugLineNum = 325;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 326;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _setinvalidmessage(Object _invalidmessage) throws Exception{
 //BA.debugLineNum = 328;BA.debugLine="Sub SetInvalidMessage(invalidMessage As Object) As";
 //BA.debugLineNum = 329;BA.debugLine="Slider.SetAttr(\"invalidMessage\", invalidMessage)";
_slider._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("invalidMessage",_invalidmessage);
 //BA.debugLineNum = 330;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 331;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 175;BA.debugLine="Sub SetLabel(l As String) As WixSlider";
 //BA.debugLineNum = 176;BA.debugLine="Slider.SetLabel(l)";
_slider._setlabel /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_l);
 //BA.debugLineNum = 177;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 178;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _setlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 187;BA.debugLine="Sub SetLabelAlign(a As String) As WixSlider";
 //BA.debugLineNum = 188;BA.debugLine="Slider.SetLabelAlign(a)";
_slider._setlabelalign /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_a);
 //BA.debugLineNum = 189;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 190;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _setlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 193;BA.debugLine="Sub SetLabelPosition(p As String) As WixSlider";
 //BA.debugLineNum = 194;BA.debugLine="Slider.SetLabelPosition(p)";
_slider._setlabelposition /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_p);
 //BA.debugLineNum = 195;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 196;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _setlabelwidth(int _w) throws Exception{
 //BA.debugLineNum = 199;BA.debugLine="Sub SetLabelWidth(w As Int) As WixSlider";
 //BA.debugLineNum = 200;BA.debugLine="Slider.SetLabelWidth(w)";
_slider._setlabelwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 201;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 202;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 72;BA.debugLine="Sub SetMap(m As Map) As WixSlider";
 //BA.debugLineNum = 73;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 74;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 75;BA.debugLine="Slider.SetAttr(strKey,	strVal)";
_slider._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 77;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Sub SetMargin(margin As Object) As WixSlider";
 //BA.debugLineNum = 32;BA.debugLine="Slider.SetMargin(margin)";
_slider._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 33;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _setmax(int _m) throws Exception{
 //BA.debugLineNum = 151;BA.debugLine="Sub SetMax(m As Int) As WixSlider";
 //BA.debugLineNum = 152;BA.debugLine="Maximum = m";
_maximum = _m;
 //BA.debugLineNum = 153;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _setmaxheight(Object _maxheight) throws Exception{
 //BA.debugLineNum = 333;BA.debugLine="Sub SetMaxHeight(maxHeight As Object) As WixSlider";
 //BA.debugLineNum = 334;BA.debugLine="Slider.SetAttr(\"maxHeight\", maxHeight)";
_slider._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxHeight",_maxheight);
 //BA.debugLineNum = 335;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 336;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _setmaxwidth(Object _maxwidth) throws Exception{
 //BA.debugLineNum = 338;BA.debugLine="Sub SetMaxWidth(maxWidth As Object) As WixSlider";
 //BA.debugLineNum = 339;BA.debugLine="Slider.SetAttr(\"maxWidth\", maxWidth)";
_slider._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxWidth",_maxwidth);
 //BA.debugLineNum = 340;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 341;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _setmin(int _m) throws Exception{
 //BA.debugLineNum = 157;BA.debugLine="Sub SetMin(m As Int) As WixSlider";
 //BA.debugLineNum = 158;BA.debugLine="Minimum = m";
_minimum = _m;
 //BA.debugLineNum = 159;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Sub SetMinHeight(h As Int) As WixSlider";
 //BA.debugLineNum = 115;BA.debugLine="Slider.SetMinHeight(h)";
_slider._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 116;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Sub SetMinWidth(w As Int) As WixSlider";
 //BA.debugLineNum = 109;BA.debugLine="Slider.SetMinWidth(w)";
_slider._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 110;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _setmovetitle(boolean _b) throws Exception{
 //BA.debugLineNum = 125;BA.debugLine="Sub SetMoveTitle(b As Boolean) As WixSlider";
 //BA.debugLineNum = 126;BA.debugLine="Slider.SetAttr(\"moveTitle\", b)";
_slider._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("moveTitle",(Object)(_b));
 //BA.debugLineNum = 127;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _setname(String _n) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub SetName(n As String) As WixSlider";
 //BA.debugLineNum = 90;BA.debugLine="Slider.SetName(n)";
_slider._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 91;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Sub SetPadding(padding As Object) As WixSlider";
 //BA.debugLineNum = 26;BA.debugLine="Slider.SetPadding(padding)";
_slider._setpadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 27;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub SetParent(p As WixElement) As WixSlider";
 //BA.debugLineNum = 61;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _setplaceholder(Object _placeholder) throws Exception{
 //BA.debugLineNum = 343;BA.debugLine="Sub SetPlaceholder(placeholder As Object) As WixSl";
 //BA.debugLineNum = 344;BA.debugLine="Slider.SetAttr(\"placeholder\", placeholder)";
_slider._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("placeholder",_placeholder);
 //BA.debugLineNum = 345;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 346;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _setpopup(Object _popup) throws Exception{
 //BA.debugLineNum = 348;BA.debugLine="Sub SetPopup(popup As Object) As WixSlider";
 //BA.debugLineNum = 349;BA.debugLine="Slider.SetAttr(\"popup\", popup)";
_slider._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("popup",_popup);
 //BA.debugLineNum = 350;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 351;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _setreadonly(boolean _readonly) throws Exception{
 //BA.debugLineNum = 353;BA.debugLine="Sub SetReadonly(readonly As Boolean) As WixSlider";
 //BA.debugLineNum = 354;BA.debugLine="Slider.SetAttr(\"readonly\", readonly)";
_slider._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("readonly",(Object)(_readonly));
 //BA.debugLineNum = 355;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 356;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _setrelatedaction(Object _relatedaction) throws Exception{
 //BA.debugLineNum = 358;BA.debugLine="Sub SetRelatedAction(relatedAction As Object) As W";
 //BA.debugLineNum = 359;BA.debugLine="Slider.SetAttr(\"relatedAction\", relatedAction)";
_slider._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("relatedAction",_relatedaction);
 //BA.debugLineNum = 360;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 361;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _setrelatedview(Object _relatedview) throws Exception{
 //BA.debugLineNum = 363;BA.debugLine="Sub SetRelatedView(relatedView As Object) As WixSl";
 //BA.debugLineNum = 364;BA.debugLine="Slider.SetAttr(\"relatedView\", relatedView)";
_slider._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("relatedView",_relatedview);
 //BA.debugLineNum = 365;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 366;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _setrequired(boolean _b) throws Exception{
 //BA.debugLineNum = 181;BA.debugLine="Sub SetRequired(b As Boolean) As WixSlider";
 //BA.debugLineNum = 182;BA.debugLine="Slider.SetRequired(b)";
_slider._setrequired /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 183;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Sub SetResponsive(b As Object) As WixSlider";
 //BA.debugLineNum = 96;BA.debugLine="Slider.SetResponsive(b)";
_slider._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 97;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixSlider";
 //BA.debugLineNum = 102;BA.debugLine="Slider.SetResponsiveCell(b)";
_slider._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 103;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _setstep(int _s) throws Exception{
 //BA.debugLineNum = 163;BA.debugLine="Sub SetStep(s As Int) As WixSlider";
 //BA.debugLineNum = 164;BA.debugLine="Stepper = s";
_stepper = _s;
 //BA.debugLineNum = 165;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 166;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 54;BA.debugLine="Slider.SetStyle(prop,sval)";
_slider._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 44;BA.debugLine="Sub SetStyles(m As Map) As WixSlider";
 //BA.debugLineNum = 45;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 46;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 47;BA.debugLine="Slider.SetStyle(k,v)";
_slider._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _setsuggest(Object _suggest) throws Exception{
 //BA.debugLineNum = 368;BA.debugLine="Sub SetSuggest(suggest As Object) As WixSlider";
 //BA.debugLineNum = 369;BA.debugLine="Slider.SetAttr(\"suggest\", suggest)";
_slider._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("suggest",_suggest);
 //BA.debugLineNum = 370;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 371;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 81;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixSlider";
 //BA.debugLineNum = 82;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 83;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 84;BA.debugLine="Slider.SetTemplate(os)";
_slider._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 85;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _settitle(Object _title) throws Exception{
 //BA.debugLineNum = 373;BA.debugLine="Sub SetTitle(title As Object) As WixSlider";
 //BA.debugLineNum = 374;BA.debugLine="Slider.SetAttr(\"title\", title)";
_slider._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("title",_title);
 //BA.debugLineNum = 375;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 376;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 137;BA.debugLine="Sub SetTooltip(tt As String) As WixSlider";
 //BA.debugLineNum = 138;BA.debugLine="Slider.SetTooltip(tt)";
_slider._settooltip /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_tt);
 //BA.debugLineNum = 139;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _settype(Object _stype) throws Exception{
 //BA.debugLineNum = 378;BA.debugLine="Sub SetType(sType As Object) As WixSlider";
 //BA.debugLineNum = 379;BA.debugLine="Slider.SetAttr(\"type\", sType)";
_slider._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("type",_stype);
 //BA.debugLineNum = 380;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 381;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _setvalidate(Object _validate) throws Exception{
 //BA.debugLineNum = 383;BA.debugLine="Sub SetValidate(validate As Object) As WixSlider";
 //BA.debugLineNum = 384;BA.debugLine="Slider.SetAttr(\"validate\", validate)";
_slider._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("validate",_validate);
 //BA.debugLineNum = 385;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 386;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _setvalidateevent(Object _validateevent) throws Exception{
 //BA.debugLineNum = 388;BA.debugLine="Sub SetValidateEvent(validateEvent As Object) As W";
 //BA.debugLineNum = 389;BA.debugLine="Slider.SetAttr(\"validateEvent\", validateEvent)";
_slider._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("validateEvent",_validateevent);
 //BA.debugLineNum = 390;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 391;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 169;BA.debugLine="Sub SetValue(v As String) As WixSlider";
 //BA.debugLineNum = 170;BA.debugLine="Slider.SetValue(v)";
_slider._setvalue /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_v);
 //BA.debugLineNum = 171;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 172;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _setvertical(boolean _b) throws Exception{
 //BA.debugLineNum = 131;BA.debugLine="Sub SetVertical(b As Boolean) As WixSlider";
 //BA.debugLineNum = 132;BA.debugLine="Slider.SetAttr(\"vertical\", b)";
_slider._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("vertical",(Object)(_b));
 //BA.debugLineNum = 133;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _setwidth(Object _width) throws Exception{
 //BA.debugLineNum = 393;BA.debugLine="Sub SetWidth(width As Object) As WixSlider";
 //BA.debugLineNum = 394;BA.debugLine="Slider.SetAttr(\"width\", width)";
_slider._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("width",_width);
 //BA.debugLineNum = 395;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixslider)(this);
 //BA.debugLineNum = 396;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
