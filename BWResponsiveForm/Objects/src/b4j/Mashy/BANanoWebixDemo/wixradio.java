package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixradio extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixradio", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixradio.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _radio = null;
public anywheresoftware.b4a.objects.collections.List _options = null;
public boolean _vertical = false;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public b4j.Mashy.BANanoWebixDemo.wixradio  _addoption(String _sid,String _svalue) throws Exception{
anywheresoftware.b4a.objects.collections.Map _sug = null;
 //BA.debugLineNum = 146;BA.debugLine="Sub AddOption(sID As String, sValue As String) As";
 //BA.debugLineNum = 147;BA.debugLine="Dim sug As Map = CreateMap()";
_sug = new anywheresoftware.b4a.objects.collections.Map();
_sug = __c.createMap(new Object[] {});
 //BA.debugLineNum = 148;BA.debugLine="sug.Put(\"id\", sID)";
_sug.Put((Object)("id"),(Object)(_sid));
 //BA.debugLineNum = 149;BA.debugLine="sug.Put(\"value\", sValue)";
_sug.Put((Object)("value"),(Object)(_svalue));
 //BA.debugLineNum = 150;BA.debugLine="Options.Add(sug)";
_options.Add((Object)(_sug.getObject()));
 //BA.debugLineNum = 151;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixradio)(this);
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return null;
}
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 217;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 218;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 219;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 222;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 223;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 224;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.Mashy.BANanoWebixDemo.wixform _frm) throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 123;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 212;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 213;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 214;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Radio As WixElement";
_radio = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private Options As List";
_options = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 6;BA.debugLine="Private Vertical As Boolean";
_vertical = false;
 //BA.debugLineNum = 7;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixradio  _initialize(anywheresoftware.b4a.BA _ba,String _iid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 51;BA.debugLine="Public Sub Initialize(iID As String) As WixRadio";
 //BA.debugLineNum = 52;BA.debugLine="ID = iID.tolowercase";
_id = _iid.toLowerCase();
 //BA.debugLineNum = 53;BA.debugLine="Radio.Initialize(iID).SetView(\"radio\")";
_radio._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_iid)._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("radio");
 //BA.debugLineNum = 54;BA.debugLine="Options.Initialize";
_options.Initialize();
 //BA.debugLineNum = 55;BA.debugLine="Vertical = False";
_vertical = __c.False;
 //BA.debugLineNum = 56;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 57;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixradio)(this);
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 116;BA.debugLine="Radio.SetAttr(\"options\", Options)";
_radio._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("options",(Object)(_options.getObject()));
 //BA.debugLineNum = 117;BA.debugLine="Radio.SetAttr(\"vertical\", Vertical)";
_radio._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("vertical",(Object)(_vertical));
 //BA.debugLineNum = 118;BA.debugLine="Return Radio.item";
if (true) return _radio._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 11;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 12;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixradio  _setalign(Object _align) throws Exception{
 //BA.debugLineNum = 368;BA.debugLine="Sub SetAlign(align As Object) As WixRadio";
 //BA.debugLineNum = 369;BA.debugLine="Radio.SetAttr(\"align\", align)";
_radio._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("align",_align);
 //BA.debugLineNum = 370;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixradio)(this);
 //BA.debugLineNum = 371;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixradio  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 199;BA.debugLine="Sub SetAlignCenter(r As String) As WixRadio 'ignor";
 //BA.debugLineNum = 200;BA.debugLine="Radio.setAligncenter(\"\")";
_radio._setaligncenter /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 201;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixradio)(this);
 //BA.debugLineNum = 202;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixradio  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 205;BA.debugLine="Sub SetAlignLeft(r As String) As WixRadio 'ignore";
 //BA.debugLineNum = 206;BA.debugLine="Radio.SetAlignleft(\"\")";
_radio._setalignleft /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 207;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixradio)(this);
 //BA.debugLineNum = 208;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixradio  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 193;BA.debugLine="Sub SetAlignRight(r As String) As WixRadio 'ignore";
 //BA.debugLineNum = 194;BA.debugLine="Radio.setAlignright(\"\")";
_radio._setalignright /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 195;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixradio)(this);
 //BA.debugLineNum = 196;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixradio  _setanimate(boolean _animate) throws Exception{
 //BA.debugLineNum = 226;BA.debugLine="Sub SetAnimate(animate As Boolean) As WixRadio";
 //BA.debugLineNum = 227;BA.debugLine="Radio.SetAttr(\"animate\", animate)";
_radio._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("animate",(Object)(_animate));
 //BA.debugLineNum = 228;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixradio)(this);
 //BA.debugLineNum = 229;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixradio  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 27;BA.debugLine="Sub SetAttributes(m As Map) As WixRadio";
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
 //BA.debugLineNum = 30;BA.debugLine="Radio.SetAttr(k,v)";
_radio._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 32;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixradio)(this);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixradio  _setautowidth(boolean _autowidth) throws Exception{
 //BA.debugLineNum = 231;BA.debugLine="Sub SetAutowidth(autowidth As Boolean) As WixRadio";
 //BA.debugLineNum = 232;BA.debugLine="Radio.SetAttr(\"autowidth\", autowidth)";
_radio._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("autowidth",(Object)(_autowidth));
 //BA.debugLineNum = 233;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixradio)(this);
 //BA.debugLineNum = 234;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixradio  _setborderless(boolean _borderless) throws Exception{
 //BA.debugLineNum = 243;BA.debugLine="Sub SetBorderless(borderless As Boolean) As WixRad";
 //BA.debugLineNum = 244;BA.debugLine="Radio.SetAttr(\"borderless\", borderless)";
_radio._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("borderless",(Object)(_borderless));
 //BA.debugLineNum = 245;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixradio)(this);
 //BA.debugLineNum = 246;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixradio  _setbottomlabel(Object _bottomlabel) throws Exception{
 //BA.debugLineNum = 248;BA.debugLine="Sub SetBottomLabel(bottomLabel As Object) As WixRa";
 //BA.debugLineNum = 249;BA.debugLine="Radio.SetAttr(\"bottomLabel\", bottomLabel)";
_radio._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("bottomLabel",_bottomlabel);
 //BA.debugLineNum = 250;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixradio)(this);
 //BA.debugLineNum = 251;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixradio  _setbottompadding(Object _bottompadding) throws Exception{
 //BA.debugLineNum = 253;BA.debugLine="Sub SetBottomPadding(bottomPadding As Object) As W";
 //BA.debugLineNum = 254;BA.debugLine="Radio.SetAttr(\"bottomPadding\", bottomPadding)";
_radio._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("bottomPadding",_bottompadding);
 //BA.debugLineNum = 255;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixradio)(this);
 //BA.debugLineNum = 256;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixradio  _setclick(Object _click) throws Exception{
 //BA.debugLineNum = 258;BA.debugLine="Sub SetClick(click As Object) As WixRadio";
 //BA.debugLineNum = 259;BA.debugLine="Radio.SetAttr(\"click\", click)";
_radio._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("click",_click);
 //BA.debugLineNum = 260;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixradio)(this);
 //BA.debugLineNum = 261;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixradio  _setcontainer(Object _container) throws Exception{
 //BA.debugLineNum = 263;BA.debugLine="Sub SetContainer(container As Object) As WixRadio";
 //BA.debugLineNum = 264;BA.debugLine="Radio.SetAttr(\"container\", container)";
_radio._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("container",_container);
 //BA.debugLineNum = 265;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixradio)(this);
 //BA.debugLineNum = 266;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixradio  _setcss(Object _css) throws Exception{
 //BA.debugLineNum = 268;BA.debugLine="Sub SetCss(css As Object) As WixRadio";
 //BA.debugLineNum = 269;BA.debugLine="Radio.SetAttr(\"css\", css)";
_radio._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("css",_css);
 //BA.debugLineNum = 270;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixradio)(this);
 //BA.debugLineNum = 271;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixradio  _setcustomradio(boolean _customradio) throws Exception{
 //BA.debugLineNum = 273;BA.debugLine="Sub SetCustomRadio(customRadio As Boolean) As WixR";
 //BA.debugLineNum = 274;BA.debugLine="Radio.SetAttr(\"customRadio\", customRadio)";
_radio._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("customRadio",(Object)(_customradio));
 //BA.debugLineNum = 275;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixradio)(this);
 //BA.debugLineNum = 276;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixradio  _setdisabled(boolean _disabled) throws Exception{
 //BA.debugLineNum = 278;BA.debugLine="Sub SetDisabled(disabled As Boolean) As WixRadio";
 //BA.debugLineNum = 279;BA.debugLine="Radio.SetAttr(\"disabled\", disabled)";
_radio._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("disabled",(Object)(_disabled));
 //BA.debugLineNum = 280;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixradio)(this);
 //BA.debugLineNum = 281;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixradio  _setformat(Object _format) throws Exception{
 //BA.debugLineNum = 283;BA.debugLine="Sub SetFormat(format As Object) As WixRadio";
 //BA.debugLineNum = 284;BA.debugLine="Radio.SetAttr(\"format\", format)";
_radio._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("format",_format);
 //BA.debugLineNum = 285;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixradio)(this);
 //BA.debugLineNum = 286;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixradio  _setgravity(Object _gravity) throws Exception{
 //BA.debugLineNum = 288;BA.debugLine="Sub SetGravity(gravity As Object) As WixRadio";
 //BA.debugLineNum = 289;BA.debugLine="Radio.SetAttr(\"gravity\", gravity)";
_radio._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("gravity",_gravity);
 //BA.debugLineNum = 290;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixradio)(this);
 //BA.debugLineNum = 291;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixradio  _setheight(Object _height) throws Exception{
 //BA.debugLineNum = 293;BA.debugLine="Sub SetHeight(height As Object) As WixRadio";
 //BA.debugLineNum = 294;BA.debugLine="Radio.SetAttr(\"height\", height)";
_radio._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("height",_height);
 //BA.debugLineNum = 295;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixradio)(this);
 //BA.debugLineNum = 296;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixradio  _sethidden(boolean _hidden) throws Exception{
 //BA.debugLineNum = 298;BA.debugLine="Sub SetHidden(hidden As Boolean) As WixRadio";
 //BA.debugLineNum = 299;BA.debugLine="Radio.SetAttr(\"hidden\", hidden)";
_radio._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hidden",(Object)(_hidden));
 //BA.debugLineNum = 300;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixradio)(this);
 //BA.debugLineNum = 301;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixradio  _sethotkey(Object _hotkey) throws Exception{
 //BA.debugLineNum = 303;BA.debugLine="Sub SetHotkey(hotkey As Object) As WixRadio";
 //BA.debugLineNum = 304;BA.debugLine="Radio.SetAttr(\"hotkey\", hotkey)";
_radio._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hotkey",_hotkey);
 //BA.debugLineNum = 305;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixradio)(this);
 //BA.debugLineNum = 306;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixradio  _setinputalign(Object _inputalign) throws Exception{
 //BA.debugLineNum = 373;BA.debugLine="Sub SetInputAlign(inputAlign As Object) As WixRadi";
 //BA.debugLineNum = 374;BA.debugLine="Radio.SetAttr(\"inputAlign\", inputAlign)";
_radio._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("inputAlign",_inputalign);
 //BA.debugLineNum = 375;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixradio)(this);
 //BA.debugLineNum = 376;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixradio  _setinputheight(Object _inputheight) throws Exception{
 //BA.debugLineNum = 308;BA.debugLine="Sub SetInputHeight(inputHeight As Object) As WixRa";
 //BA.debugLineNum = 309;BA.debugLine="Radio.SetAttr(\"inputHeight\", inputHeight)";
_radio._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("inputHeight",_inputheight);
 //BA.debugLineNum = 310;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixradio)(this);
 //BA.debugLineNum = 311;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixradio  _setinputwidth(Object _inputwidth) throws Exception{
 //BA.debugLineNum = 313;BA.debugLine="Sub SetInputWidth(inputWidth As Object) As WixRadi";
 //BA.debugLineNum = 314;BA.debugLine="Radio.SetAttr(\"inputWidth\", inputWidth)";
_radio._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("inputWidth",_inputwidth);
 //BA.debugLineNum = 315;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixradio)(this);
 //BA.debugLineNum = 316;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixradio  _setinvalidmessage(Object _invalidmessage) throws Exception{
 //BA.debugLineNum = 318;BA.debugLine="Sub SetInvalidMessage(invalidMessage As Object) As";
 //BA.debugLineNum = 319;BA.debugLine="Radio.SetAttr(\"invalidMessage\", invalidMessage)";
_radio._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("invalidMessage",_invalidmessage);
 //BA.debugLineNum = 320;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixradio)(this);
 //BA.debugLineNum = 321;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixradio  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 161;BA.debugLine="Sub SetLabel(l As String) As WixRadio";
 //BA.debugLineNum = 162;BA.debugLine="Radio.SetLabel(l)";
_radio._setlabel /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_l);
 //BA.debugLineNum = 163;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixradio)(this);
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixradio  _setlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 174;BA.debugLine="Sub SetLabelAlign(a As String) As WixRadio";
 //BA.debugLineNum = 175;BA.debugLine="Radio.SetLabelAlign(a)";
_radio._setlabelalign /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_a);
 //BA.debugLineNum = 176;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixradio)(this);
 //BA.debugLineNum = 177;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixradio  _setlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 180;BA.debugLine="Sub SetLabelPosition(p As String) As WixRadio";
 //BA.debugLineNum = 181;BA.debugLine="Radio.SetLabelPosition(p)";
_radio._setlabelposition /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_p);
 //BA.debugLineNum = 182;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixradio)(this);
 //BA.debugLineNum = 183;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixradio  _setlabelwidth(int _w) throws Exception{
 //BA.debugLineNum = 186;BA.debugLine="Sub SetLabelWidth(w As Int) As WixRadio";
 //BA.debugLineNum = 187;BA.debugLine="Radio.SetLabelWidth(w)";
_radio._setlabelwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 188;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixradio)(this);
 //BA.debugLineNum = 189;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixradio  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 61;BA.debugLine="Sub SetMap(m As Map) As WixRadio";
 //BA.debugLineNum = 62;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 63;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 64;BA.debugLine="Radio.SetAttr(strKey,	strVal)";
_radio._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 66;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixradio)(this);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixradio  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Sub SetMargin(margin As Object) As WixRadio";
 //BA.debugLineNum = 23;BA.debugLine="Radio.SetMargin(margin)";
_radio._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 24;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixradio)(this);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixradio  _setmaxheight(Object _maxheight) throws Exception{
 //BA.debugLineNum = 323;BA.debugLine="Sub SetMaxHeight(maxHeight As Object) As WixRadio";
 //BA.debugLineNum = 324;BA.debugLine="Radio.SetAttr(\"maxHeight\", maxHeight)";
_radio._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxHeight",_maxheight);
 //BA.debugLineNum = 325;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixradio)(this);
 //BA.debugLineNum = 326;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixradio  _setmaxwidth(Object _maxwidth) throws Exception{
 //BA.debugLineNum = 328;BA.debugLine="Sub SetMaxWidth(maxWidth As Object) As WixRadio";
 //BA.debugLineNum = 329;BA.debugLine="Radio.SetAttr(\"maxWidth\", maxWidth)";
_radio._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxWidth",_maxwidth);
 //BA.debugLineNum = 330;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixradio)(this);
 //BA.debugLineNum = 331;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixradio  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Sub SetMinHeight(h As Int) As WixRadio";
 //BA.debugLineNum = 104;BA.debugLine="Radio.SetMinHeight(h)";
_radio._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 105;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixradio)(this);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixradio  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub SetMinWidth(w As Int) As WixRadio";
 //BA.debugLineNum = 98;BA.debugLine="Radio.SetMinWidth(w)";
_radio._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 99;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixradio)(this);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixradio  _setname(String _n) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub SetName(n As String) As WixRadio";
 //BA.debugLineNum = 79;BA.debugLine="Radio.SetName(n)";
_radio._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 80;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixradio)(this);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixradio  _setoptionheight(Object _optionheight) throws Exception{
 //BA.debugLineNum = 333;BA.debugLine="Sub SetOptionHeight(optionHeight As Object) As Wix";
 //BA.debugLineNum = 334;BA.debugLine="Radio.SetAttr(\"optionHeight\", optionHeight)";
_radio._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("optionHeight",_optionheight);
 //BA.debugLineNum = 335;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixradio)(this);
 //BA.debugLineNum = 336;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixradio  _setoptions(anywheresoftware.b4a.objects.collections.List _opt) throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="Sub SetOptions(opt As List) As WixRadio";
 //BA.debugLineNum = 128;BA.debugLine="Options = opt";
_options = _opt;
 //BA.debugLineNum = 129;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixradio)(this);
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixradio  _setoptionsjson(String _json) throws Exception{
 //BA.debugLineNum = 132;BA.debugLine="Sub SetOptionsJSON(json As String) As WixRadio";
 //BA.debugLineNum = 133;BA.debugLine="Radio.SetOptionsJSON(json)";
_radio._setoptionsjson /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_json);
 //BA.debugLineNum = 134;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixradio)(this);
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixradio  _setoptionsmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _mk = "";
Object _mv = null;
 //BA.debugLineNum = 137;BA.debugLine="Sub SetOptionsMAP(m As Map) As WixRadio";
 //BA.debugLineNum = 138;BA.debugLine="For Each mk As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_mk = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 139;BA.debugLine="Dim mv As Object = m.Get(mk)";
_mv = _m.Get((Object)(_mk));
 //BA.debugLineNum = 140;BA.debugLine="AddOption(mk, mv)";
_addoption(_mk,BA.ObjectToString(_mv));
 }
};
 //BA.debugLineNum = 142;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixradio)(this);
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixradio  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Sub SetPadding(padding As Object) As WixRadio";
 //BA.debugLineNum = 17;BA.debugLine="Radio.SetPadding(padding)";
_radio._setpadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 18;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixradio)(this);
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixradio  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 237;BA.debugLine="Sub SetParent(p As WixElement) As WixRadio";
 //BA.debugLineNum = 238;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 239;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixradio)(this);
 //BA.debugLineNum = 240;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixradio  _setpopup(Object _popup) throws Exception{
 //BA.debugLineNum = 338;BA.debugLine="Sub SetPopup(popup As Object) As WixRadio";
 //BA.debugLineNum = 339;BA.debugLine="Radio.SetAttr(\"popup\", popup)";
_radio._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("popup",_popup);
 //BA.debugLineNum = 340;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixradio)(this);
 //BA.debugLineNum = 341;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixradio  _setrelatedaction(Object _relatedaction) throws Exception{
 //BA.debugLineNum = 343;BA.debugLine="Sub SetRelatedAction(relatedAction As Object) As W";
 //BA.debugLineNum = 344;BA.debugLine="Radio.SetAttr(\"relatedAction\", relatedAction)";
_radio._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("relatedAction",_relatedaction);
 //BA.debugLineNum = 345;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixradio)(this);
 //BA.debugLineNum = 346;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixradio  _setrelatedview(Object _relatedview) throws Exception{
 //BA.debugLineNum = 348;BA.debugLine="Sub SetRelatedView(relatedView As Object) As WixRa";
 //BA.debugLineNum = 349;BA.debugLine="Radio.SetAttr(\"relatedView\", relatedView)";
_radio._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("relatedView",_relatedview);
 //BA.debugLineNum = 350;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixradio)(this);
 //BA.debugLineNum = 351;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixradio  _setrequired(boolean _required) throws Exception{
 //BA.debugLineNum = 353;BA.debugLine="Sub SetRequired(required As Boolean) As WixRadio";
 //BA.debugLineNum = 354;BA.debugLine="Radio.SetAttr(\"required\", required)";
_radio._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("required",(Object)(_required));
 //BA.debugLineNum = 355;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixradio)(this);
 //BA.debugLineNum = 356;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixradio  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub SetResponsive(b As Object) As WixRadio";
 //BA.debugLineNum = 85;BA.debugLine="Radio.SetResponsive(b)";
_radio._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 86;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixradio)(this);
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixradio  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixRadio";
 //BA.debugLineNum = 91;BA.debugLine="Radio.SetResponsiveCell(b)";
_radio._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 92;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixradio)(this);
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixradio  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 45;BA.debugLine="Radio.SetStyle(prop,sval)";
_radio._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 46;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixradio)(this);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixradio  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 35;BA.debugLine="Sub SetStyles(m As Map) As WixRadio";
 //BA.debugLineNum = 36;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 37;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 38;BA.debugLine="Radio.SetStyle(k,v)";
_radio._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 40;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixradio)(this);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixradio  _setsuggest(Object _suggest) throws Exception{
 //BA.debugLineNum = 358;BA.debugLine="Sub SetSuggest(suggest As Object) As WixRadio";
 //BA.debugLineNum = 359;BA.debugLine="Radio.SetAttr(\"suggest\", suggest)";
_radio._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("suggest",_suggest);
 //BA.debugLineNum = 360;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixradio)(this);
 //BA.debugLineNum = 361;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixradio  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 70;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixRadio";
 //BA.debugLineNum = 71;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 72;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 73;BA.debugLine="Radio.SetTemplate(os)";
_radio._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 74;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixradio)(this);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixradio  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Sub SetTooltip(tt As String) As WixRadio";
 //BA.debugLineNum = 110;BA.debugLine="Radio.SetTooltip(tt)";
_radio._settooltip /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_tt);
 //BA.debugLineNum = 111;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixradio)(this);
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixradio  _setvalidate(Object _v) throws Exception{
 //BA.debugLineNum = 378;BA.debugLine="Sub SetValidate(v As Object) As WixRadio";
 //BA.debugLineNum = 379;BA.debugLine="Radio.SetAttr(\"validate\", v)";
_radio._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("validate",_v);
 //BA.debugLineNum = 380;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixradio)(this);
 //BA.debugLineNum = 381;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixradio  _setvalidateevent(Object _e) throws Exception{
 //BA.debugLineNum = 383;BA.debugLine="Sub SetValidateEvent(e As Object) As WixRadio";
 //BA.debugLineNum = 384;BA.debugLine="Radio.SetAttr(\"validateEvent\", e)";
_radio._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("validateEvent",_e);
 //BA.debugLineNum = 385;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixradio)(this);
 //BA.debugLineNum = 386;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixradio  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 155;BA.debugLine="Sub SetValue(v As String) As WixRadio";
 //BA.debugLineNum = 156;BA.debugLine="Radio.SetValue(v)";
_radio._setvalue /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_v);
 //BA.debugLineNum = 157;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixradio)(this);
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixradio  _setvertical(boolean _b) throws Exception{
 //BA.debugLineNum = 167;BA.debugLine="Sub SetVertical(b As Boolean) As WixRadio";
 //BA.debugLineNum = 168;BA.debugLine="Vertical = b";
_vertical = _b;
 //BA.debugLineNum = 169;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixradio)(this);
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixradio  _setwidth(Object _width) throws Exception{
 //BA.debugLineNum = 363;BA.debugLine="Sub SetWidth(width As Object) As WixRadio";
 //BA.debugLineNum = 364;BA.debugLine="Radio.SetAttr(\"width\", width)";
_radio._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("width",_width);
 //BA.debugLineNum = 365;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixradio)(this);
 //BA.debugLineNum = 366;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
