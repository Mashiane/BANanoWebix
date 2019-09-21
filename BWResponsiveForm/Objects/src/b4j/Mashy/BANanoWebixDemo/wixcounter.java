package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixcounter extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixcounter", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixcounter.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _counter = null;
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
 //BA.debugLineNum = 125;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 126;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 206;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 207;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 208;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Counter As WixElement";
_counter = new b4j.Mashy.BANanoWebixDemo.wixelement();
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
public b4j.Mashy.BANanoWebixDemo.wixcounter  _initialize(anywheresoftware.b4a.BA _ba,String _iid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize(iID As String) As WixCounter";
 //BA.debugLineNum = 13;BA.debugLine="ID = iID.tolowercase";
_id = _iid.toLowerCase();
 //BA.debugLineNum = 14;BA.debugLine="Counter.Initialize(iID).SetView(\"counter\")";
_counter._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_iid)._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("counter");
 //BA.debugLineNum = 15;BA.debugLine="Minimum = 0";
_minimum = (int) (0);
 //BA.debugLineNum = 16;BA.debugLine="Maximum = 100";
_maximum = (int) (100);
 //BA.debugLineNum = 17;BA.debugLine="Counter.SetValue(10)";
_counter._setvalue /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.NumberToString(10));
 //BA.debugLineNum = 18;BA.debugLine="Stepper = 1";
_stepper = (int) (1);
 //BA.debugLineNum = 19;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 20;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcounter)(this);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 130;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 131;BA.debugLine="Counter.SetAttr(\"min\",Minimum)";
_counter._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("min",(Object)(_minimum));
 //BA.debugLineNum = 132;BA.debugLine="Counter.SetAttr(\"max\",Maximum)";
_counter._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("max",(Object)(_maximum));
 //BA.debugLineNum = 133;BA.debugLine="Counter.SetAttr(\"step\", Stepper)";
_counter._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("step",(Object)(_stepper));
 //BA.debugLineNum = 134;BA.debugLine="Return Counter.item";
if (true) return _counter._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 68;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixcounter  _setalign(Object _align) throws Exception{
 //BA.debugLineNum = 220;BA.debugLine="Sub SetAlign(align As Object) As WixCounter";
 //BA.debugLineNum = 221;BA.debugLine="Counter.SetAttr(\"align\", align)";
_counter._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("align",_align);
 //BA.debugLineNum = 222;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcounter)(this);
 //BA.debugLineNum = 223;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcounter  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 193;BA.debugLine="Sub SetAlignCenter(r As String) As WixCounter 'ign";
 //BA.debugLineNum = 194;BA.debugLine="Counter.setAligncenter(\"\")";
_counter._setaligncenter /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 195;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcounter)(this);
 //BA.debugLineNum = 196;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcounter  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 199;BA.debugLine="Sub SetAlignLeft(r As String) As WixCounter 'ignor";
 //BA.debugLineNum = 200;BA.debugLine="Counter.SetAlignleft(\"\")";
_counter._setalignleft /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 201;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcounter)(this);
 //BA.debugLineNum = 202;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcounter  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 187;BA.debugLine="Sub SetAlignRight(r As String) As WixCounter 'igno";
 //BA.debugLineNum = 188;BA.debugLine="Counter.setAlignright(\"\")";
_counter._setalignright /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 189;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcounter)(this);
 //BA.debugLineNum = 190;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcounter  _setanimate(boolean _animate) throws Exception{
 //BA.debugLineNum = 225;BA.debugLine="Sub SetAnimate(animate As Boolean) As WixCounter";
 //BA.debugLineNum = 226;BA.debugLine="Counter.SetAttr(\"animate\", animate)";
_counter._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("animate",(Object)(_animate));
 //BA.debugLineNum = 227;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcounter)(this);
 //BA.debugLineNum = 228;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcounter  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 24;BA.debugLine="Sub SetAttributes(m As Map) As WixCounter";
 //BA.debugLineNum = 25;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 26;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 27;BA.debugLine="Counter.SetAttr(k,v)";
_counter._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 29;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcounter)(this);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcounter  _setborderless(boolean _borderless) throws Exception{
 //BA.debugLineNum = 230;BA.debugLine="Sub SetBorderless(borderless As Boolean) As WixCou";
 //BA.debugLineNum = 231;BA.debugLine="Counter.SetAttr(\"borderless\", borderless)";
_counter._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("borderless",(Object)(_borderless));
 //BA.debugLineNum = 232;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcounter)(this);
 //BA.debugLineNum = 233;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcounter  _setbottomlabel(Object _bottomlabel) throws Exception{
 //BA.debugLineNum = 235;BA.debugLine="Sub SetBottomLabel(bottomLabel As Object) As WixCo";
 //BA.debugLineNum = 236;BA.debugLine="Counter.SetAttr(\"bottomLabel\", bottomLabel)";
_counter._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("bottomLabel",_bottomlabel);
 //BA.debugLineNum = 237;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcounter)(this);
 //BA.debugLineNum = 238;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcounter  _setbottompadding(Object _bottompadding) throws Exception{
 //BA.debugLineNum = 240;BA.debugLine="Sub SetBottomPadding(bottomPadding As Object) As W";
 //BA.debugLineNum = 241;BA.debugLine="Counter.SetAttr(\"bottomPadding\", bottomPadding)";
_counter._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("bottomPadding",_bottompadding);
 //BA.debugLineNum = 242;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcounter)(this);
 //BA.debugLineNum = 243;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcounter  _setclick(Object _click) throws Exception{
 //BA.debugLineNum = 245;BA.debugLine="Sub SetClick(click As Object) As WixCounter";
 //BA.debugLineNum = 246;BA.debugLine="Counter.SetAttr(\"click\", click)";
_counter._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("click",_click);
 //BA.debugLineNum = 247;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcounter)(this);
 //BA.debugLineNum = 248;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcounter  _setcontainer(Object _container) throws Exception{
 //BA.debugLineNum = 250;BA.debugLine="Sub SetContainer(container As Object) As WixCounte";
 //BA.debugLineNum = 251;BA.debugLine="Counter.SetAttr(\"container\", container)";
_counter._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("container",_container);
 //BA.debugLineNum = 252;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcounter)(this);
 //BA.debugLineNum = 253;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcounter  _setcss(Object _css) throws Exception{
 //BA.debugLineNum = 255;BA.debugLine="Sub SetCss(css As Object) As WixCounter";
 //BA.debugLineNum = 256;BA.debugLine="Counter.SetAttr(\"css\", css)";
_counter._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("css",_css);
 //BA.debugLineNum = 257;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcounter)(this);
 //BA.debugLineNum = 258;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcounter  _setdisabled(boolean _disabled) throws Exception{
 //BA.debugLineNum = 260;BA.debugLine="Sub SetDisabled(disabled As Boolean) As WixCounter";
 //BA.debugLineNum = 261;BA.debugLine="Counter.SetAttr(\"disabled\", disabled)";
_counter._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("disabled",(Object)(_disabled));
 //BA.debugLineNum = 262;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcounter)(this);
 //BA.debugLineNum = 263;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcounter  _setformat(Object _format) throws Exception{
 //BA.debugLineNum = 265;BA.debugLine="Sub SetFormat(format As Object) As WixCounter";
 //BA.debugLineNum = 266;BA.debugLine="Counter.SetAttr(\"format\", format)";
_counter._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("format",_format);
 //BA.debugLineNum = 267;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcounter)(this);
 //BA.debugLineNum = 268;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcounter  _setgravity(Object _gravity) throws Exception{
 //BA.debugLineNum = 270;BA.debugLine="Sub SetGravity(gravity As Object) As WixCounter";
 //BA.debugLineNum = 271;BA.debugLine="Counter.SetAttr(\"gravity\", gravity)";
_counter._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("gravity",_gravity);
 //BA.debugLineNum = 272;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcounter)(this);
 //BA.debugLineNum = 273;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcounter  _setheight(Object _height) throws Exception{
 //BA.debugLineNum = 275;BA.debugLine="Sub SetHeight(height As Object) As WixCounter";
 //BA.debugLineNum = 276;BA.debugLine="Counter.SetAttr(\"height\", height)";
_counter._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("height",_height);
 //BA.debugLineNum = 277;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcounter)(this);
 //BA.debugLineNum = 278;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcounter  _sethidden(boolean _hidden) throws Exception{
 //BA.debugLineNum = 280;BA.debugLine="Sub SetHidden(hidden As Boolean) As WixCounter";
 //BA.debugLineNum = 281;BA.debugLine="Counter.SetAttr(\"hidden\", hidden)";
_counter._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hidden",(Object)(_hidden));
 //BA.debugLineNum = 282;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcounter)(this);
 //BA.debugLineNum = 283;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcounter  _sethotkey(Object _hotkey) throws Exception{
 //BA.debugLineNum = 285;BA.debugLine="Sub SetHotkey(hotkey As Object) As WixCounter";
 //BA.debugLineNum = 286;BA.debugLine="Counter.SetAttr(\"hotkey\", hotkey)";
_counter._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hotkey",_hotkey);
 //BA.debugLineNum = 287;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcounter)(this);
 //BA.debugLineNum = 288;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcounter  _setinputalign(Object _inputalign) throws Exception{
 //BA.debugLineNum = 290;BA.debugLine="Sub SetInputAlign(inputAlign As Object) As WixCoun";
 //BA.debugLineNum = 291;BA.debugLine="Counter.SetAttr(\"inputAlign\", inputAlign)";
_counter._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("inputAlign",_inputalign);
 //BA.debugLineNum = 292;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcounter)(this);
 //BA.debugLineNum = 293;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcounter  _setinputheight(Object _inputheight) throws Exception{
 //BA.debugLineNum = 295;BA.debugLine="Sub SetInputHeight(inputHeight As Object) As WixCo";
 //BA.debugLineNum = 296;BA.debugLine="Counter.SetAttr(\"inputHeight\", inputHeight)";
_counter._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("inputHeight",_inputheight);
 //BA.debugLineNum = 297;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcounter)(this);
 //BA.debugLineNum = 298;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcounter  _setinputwidth(Object _inputwidth) throws Exception{
 //BA.debugLineNum = 300;BA.debugLine="Sub SetInputWidth(inputWidth As Object) As WixCoun";
 //BA.debugLineNum = 301;BA.debugLine="Counter.SetAttr(\"inputWidth\", inputWidth)";
_counter._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("inputWidth",_inputwidth);
 //BA.debugLineNum = 302;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcounter)(this);
 //BA.debugLineNum = 303;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcounter  _setinvalidmessage(Object _invalidmessage) throws Exception{
 //BA.debugLineNum = 305;BA.debugLine="Sub SetInvalidMessage(invalidMessage As Object) As";
 //BA.debugLineNum = 306;BA.debugLine="Counter.SetAttr(\"invalidMessage\", invalidMessage)";
_counter._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("invalidMessage",_invalidmessage);
 //BA.debugLineNum = 307;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcounter)(this);
 //BA.debugLineNum = 308;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcounter  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 144;BA.debugLine="Sub SetLabel(l As String) As WixCounter";
 //BA.debugLineNum = 145;BA.debugLine="Counter.SetLabel(l)";
_counter._setlabel /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_l);
 //BA.debugLineNum = 146;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcounter)(this);
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcounter  _setlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 168;BA.debugLine="Sub SetLabelAlign(a As String) As WixCounter";
 //BA.debugLineNum = 169;BA.debugLine="Counter.SetLabelAlign(a)";
_counter._setlabelalign /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_a);
 //BA.debugLineNum = 170;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcounter)(this);
 //BA.debugLineNum = 171;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcounter  _setlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 174;BA.debugLine="Sub SetLabelPosition(p As String) As WixCounter";
 //BA.debugLineNum = 175;BA.debugLine="Counter.SetLabelPosition(p)";
_counter._setlabelposition /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_p);
 //BA.debugLineNum = 176;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcounter)(this);
 //BA.debugLineNum = 177;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcounter  _setlabelwidth(int _w) throws Exception{
 //BA.debugLineNum = 180;BA.debugLine="Sub SetLabelWidth(w As Int) As WixCounter";
 //BA.debugLineNum = 181;BA.debugLine="Counter.SetLabelWidth(w)";
_counter._setlabelwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 182;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcounter)(this);
 //BA.debugLineNum = 183;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcounter  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 116;BA.debugLine="Sub SetMap(m As Map) As WixCounter";
 //BA.debugLineNum = 117;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 118;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 119;BA.debugLine="Counter.SetAttr(strKey,	strVal)";
_counter._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 121;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcounter)(this);
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcounter  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Sub SetMargin(margin As Object) As WixCounter";
 //BA.debugLineNum = 40;BA.debugLine="Counter.SetMargin(margin)";
_counter._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 41;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcounter)(this);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcounter  _setmax(int _m) throws Exception{
 //BA.debugLineNum = 150;BA.debugLine="Sub SetMax(m As Int) As WixCounter";
 //BA.debugLineNum = 151;BA.debugLine="Maximum = m";
_maximum = _m;
 //BA.debugLineNum = 152;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcounter)(this);
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcounter  _setmaxheight(Object _maxheight) throws Exception{
 //BA.debugLineNum = 310;BA.debugLine="Sub SetMaxHeight(maxHeight As Object) As WixCounte";
 //BA.debugLineNum = 311;BA.debugLine="Counter.SetAttr(\"maxHeight\", maxHeight)";
_counter._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxHeight",_maxheight);
 //BA.debugLineNum = 312;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcounter)(this);
 //BA.debugLineNum = 313;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcounter  _setmaxwidth(Object _maxwidth) throws Exception{
 //BA.debugLineNum = 315;BA.debugLine="Sub SetMaxWidth(maxWidth As Object) As WixCounter";
 //BA.debugLineNum = 316;BA.debugLine="Counter.SetAttr(\"maxWidth\", maxWidth)";
_counter._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxWidth",_maxwidth);
 //BA.debugLineNum = 317;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcounter)(this);
 //BA.debugLineNum = 318;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcounter  _setmin(int _m) throws Exception{
 //BA.debugLineNum = 156;BA.debugLine="Sub SetMin(m As Int) As WixCounter";
 //BA.debugLineNum = 157;BA.debugLine="Minimum = m";
_minimum = _m;
 //BA.debugLineNum = 158;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcounter)(this);
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcounter  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Sub SetMinHeight(h As Int) As WixCounter";
 //BA.debugLineNum = 105;BA.debugLine="Counter.SetMinHeight(h)";
_counter._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 106;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcounter)(this);
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcounter  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Sub SetMinWidth(w As Int) As WixCounter";
 //BA.debugLineNum = 99;BA.debugLine="Counter.SetMinWidth(w)";
_counter._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 100;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcounter)(this);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcounter  _setname(String _n) throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Sub SetName(n As String) As WixCounter";
 //BA.debugLineNum = 80;BA.debugLine="Counter.SetName(n)";
_counter._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 81;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcounter)(this);
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcounter  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub SetPadding(padding As Object) As WixCounter";
 //BA.debugLineNum = 34;BA.debugLine="Counter.SetPadding(padding)";
_counter._setpadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 35;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcounter)(this);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcounter  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub SetParent(p As WixElement) As WixCounter";
 //BA.debugLineNum = 61;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcounter)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcounter  _setpopup(Object _popup) throws Exception{
 //BA.debugLineNum = 320;BA.debugLine="Sub SetPopup(popup As Object) As WixCounter";
 //BA.debugLineNum = 321;BA.debugLine="Counter.SetAttr(\"popup\", popup)";
_counter._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("popup",_popup);
 //BA.debugLineNum = 322;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcounter)(this);
 //BA.debugLineNum = 323;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcounter  _setrelatedaction(Object _relatedaction) throws Exception{
 //BA.debugLineNum = 325;BA.debugLine="Sub SetRelatedAction(relatedAction As Object) As W";
 //BA.debugLineNum = 326;BA.debugLine="Counter.SetAttr(\"relatedAction\", relatedAction)";
_counter._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("relatedAction",_relatedaction);
 //BA.debugLineNum = 327;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcounter)(this);
 //BA.debugLineNum = 328;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcounter  _setrelatedview(Object _relatedview) throws Exception{
 //BA.debugLineNum = 330;BA.debugLine="Sub SetRelatedView(relatedView As Object) As WixCo";
 //BA.debugLineNum = 331;BA.debugLine="Counter.SetAttr(\"relatedView\", relatedView)";
_counter._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("relatedView",_relatedview);
 //BA.debugLineNum = 332;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcounter)(this);
 //BA.debugLineNum = 333;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcounter  _setrequired(boolean _required) throws Exception{
 //BA.debugLineNum = 335;BA.debugLine="Sub SetRequired(required As Boolean) As WixCounter";
 //BA.debugLineNum = 336;BA.debugLine="Counter.SetAttr(\"required\", required)";
_counter._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("required",(Object)(_required));
 //BA.debugLineNum = 337;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcounter)(this);
 //BA.debugLineNum = 338;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcounter  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Sub SetResponsive(b As Object) As WixCounter";
 //BA.debugLineNum = 86;BA.debugLine="Counter.SetResponsive(b)";
_counter._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 87;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcounter)(this);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcounter  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixCounter";
 //BA.debugLineNum = 92;BA.debugLine="Counter.SetResponsiveCell(b)";
_counter._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcounter)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcounter  _setstep(int _s) throws Exception{
 //BA.debugLineNum = 162;BA.debugLine="Sub SetStep(s As Int) As WixCounter";
 //BA.debugLineNum = 163;BA.debugLine="Stepper = s";
_stepper = _s;
 //BA.debugLineNum = 164;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcounter)(this);
 //BA.debugLineNum = 165;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcounter  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 54;BA.debugLine="Counter.SetStyle(prop,sval)";
_counter._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcounter)(this);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcounter  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 44;BA.debugLine="Sub SetStyles(m As Map) As WixCounter";
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
 //BA.debugLineNum = 47;BA.debugLine="Counter.SetStyle(k,v)";
_counter._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcounter)(this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcounter  _setsuggest(Object _suggest) throws Exception{
 //BA.debugLineNum = 340;BA.debugLine="Sub SetSuggest(suggest As Object) As WixCounter";
 //BA.debugLineNum = 341;BA.debugLine="Counter.SetAttr(\"suggest\", suggest)";
_counter._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("suggest",_suggest);
 //BA.debugLineNum = 342;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcounter)(this);
 //BA.debugLineNum = 343;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcounter  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 71;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixCounter";
 //BA.debugLineNum = 72;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 73;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 74;BA.debugLine="Counter.SetTemplate(os)";
_counter._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 75;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcounter)(this);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcounter  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Sub SetTooltip(tt As String) As WixCounter";
 //BA.debugLineNum = 111;BA.debugLine="Counter.SetTooltip(tt)";
_counter._settooltip /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_tt);
 //BA.debugLineNum = 112;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcounter)(this);
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcounter  _setvalidate(Object _validate) throws Exception{
 //BA.debugLineNum = 345;BA.debugLine="Sub SetValidate(validate As Object) As WixCounter";
 //BA.debugLineNum = 346;BA.debugLine="Counter.SetAttr(\"validate\", validate)";
_counter._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("validate",_validate);
 //BA.debugLineNum = 347;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcounter)(this);
 //BA.debugLineNum = 348;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcounter  _setvalidateevent(Object _validateevent) throws Exception{
 //BA.debugLineNum = 350;BA.debugLine="Sub SetValidateEvent(validateEvent As Object) As W";
 //BA.debugLineNum = 351;BA.debugLine="Counter.SetAttr(\"validateEvent\", validateEvent)";
_counter._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("validateEvent",_validateevent);
 //BA.debugLineNum = 352;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcounter)(this);
 //BA.debugLineNum = 353;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcounter  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 138;BA.debugLine="Sub SetValue(v As String) As WixCounter";
 //BA.debugLineNum = 139;BA.debugLine="Counter.SetValue(v)";
_counter._setvalue /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_v);
 //BA.debugLineNum = 140;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcounter)(this);
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcounter  _setwidth(Object _width) throws Exception{
 //BA.debugLineNum = 355;BA.debugLine="Sub SetWidth(width As Object) As WixCounter";
 //BA.debugLineNum = 356;BA.debugLine="Counter.SetAttr(\"width\", width)";
_counter._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("width",_width);
 //BA.debugLineNum = 357;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcounter)(this);
 //BA.debugLineNum = 358;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
