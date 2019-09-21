package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixselect extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixselect", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixselect.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _dropdown = null;
public anywheresoftware.b4a.objects.collections.List _options = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public b4j.Mashy.BANanoWebixDemo.wixselect  _addoption(String _optid,String _optvalue) throws Exception{
 //BA.debugLineNum = 182;BA.debugLine="Sub AddOption(optID As String, optValue As String)";
 //BA.debugLineNum = 183;BA.debugLine="Options.Add(CreateMap(\"id\":optID,\"value\":optValue";
_options.Add((Object)(__c.createMap(new Object[] {(Object)("id"),(Object)(_optid),(Object)("value"),(Object)(_optvalue)}).getObject()));
 //BA.debugLineNum = 184;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 185;BA.debugLine="End Sub";
return null;
}
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 268;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 269;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 270;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 273;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 274;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 275;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.Mashy.BANanoWebixDemo.wixform _frm) throws Exception{
 //BA.debugLineNum = 165;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 166;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 167;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 263;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 264;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 265;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public DropDown As WixElement";
_dropdown = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private Options As List";
_options = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 6;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _initialize(anywheresoftware.b4a.BA _ba,String _iid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(iID As String) As WixSelect";
 //BA.debugLineNum = 11;BA.debugLine="ID = iID.tolowercase";
_id = _iid.toLowerCase();
 //BA.debugLineNum = 12;BA.debugLine="DropDown.Initialize(iID).SetView(\"select\")";
_dropdown._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_iid)._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("select");
 //BA.debugLineNum = 13;BA.debugLine="Options.Initialize";
_options.Initialize();
 //BA.debugLineNum = 14;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 15;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 176;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 177;BA.debugLine="DropDown.SetAttr(\"options\", Options)";
_dropdown._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("options",(Object)(_options.getObject()));
 //BA.debugLineNum = 178;BA.debugLine="Return DropDown.item";
if (true) return _dropdown._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 62;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _setalign(Object _align) throws Exception{
 //BA.debugLineNum = 277;BA.debugLine="Sub SetAlign(align As Object) As WixSelect";
 //BA.debugLineNum = 278;BA.debugLine="DropDown.SetAttr(\"align\", align)";
_dropdown._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("align",_align);
 //BA.debugLineNum = 279;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 280;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 250;BA.debugLine="Sub SetAlignCenter(r As String) As WixSelect 'igno";
 //BA.debugLineNum = 251;BA.debugLine="DropDown.setAligncenter(\"\")";
_dropdown._setaligncenter /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 252;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 253;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 256;BA.debugLine="Sub SetAlignLeft(r As String) As WixSelect 'ignore";
 //BA.debugLineNum = 257;BA.debugLine="DropDown.SetAlignleft(\"\")";
_dropdown._setalignleft /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 258;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 259;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 244;BA.debugLine="Sub SetAlignRight(r As String) As WixSelect 'ignor";
 //BA.debugLineNum = 245;BA.debugLine="DropDown.setAlignright(\"\")";
_dropdown._setalignright /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 246;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 247;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _setanimate(boolean _animate) throws Exception{
 //BA.debugLineNum = 282;BA.debugLine="Sub SetAnimate(animate As Boolean) As WixSelect";
 //BA.debugLineNum = 283;BA.debugLine="DropDown.SetAttr(\"animate\", animate)";
_dropdown._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("animate",(Object)(_animate));
 //BA.debugLineNum = 284;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 285;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 37;BA.debugLine="Sub SetAttributes(m As Map) As WixSelect";
 //BA.debugLineNum = 38;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 39;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 40;BA.debugLine="DropDown.SetAttr(k,v)";
_dropdown._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 42;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _setborderless(boolean _borderless) throws Exception{
 //BA.debugLineNum = 287;BA.debugLine="Sub SetBorderless(borderless As Boolean) As WixSel";
 //BA.debugLineNum = 288;BA.debugLine="DropDown.SetAttr(\"borderless\", borderless)";
_dropdown._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("borderless",(Object)(_borderless));
 //BA.debugLineNum = 289;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 290;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _setbottomlabel(Object _f) throws Exception{
 //BA.debugLineNum = 214;BA.debugLine="Sub SetBottomLabel(f As Object) As WixSelect";
 //BA.debugLineNum = 215;BA.debugLine="DropDown.SetAttr(\"bottomLabel\", f)";
_dropdown._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("bottomLabel",_f);
 //BA.debugLineNum = 216;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 217;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _setbottompadding(Object _f) throws Exception{
 //BA.debugLineNum = 220;BA.debugLine="Sub SetBottomPadding(f As Object) As WixSelect";
 //BA.debugLineNum = 221;BA.debugLine="DropDown.SetAttr(\"bottomPadding\", f)";
_dropdown._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("bottomPadding",_f);
 //BA.debugLineNum = 222;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 223;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _setclick(Object _click) throws Exception{
 //BA.debugLineNum = 292;BA.debugLine="Sub SetClick(click As Object) As WixSelect";
 //BA.debugLineNum = 293;BA.debugLine="DropDown.SetAttr(\"click\", click)";
_dropdown._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("click",_click);
 //BA.debugLineNum = 294;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 295;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _setcontainer(Object _container) throws Exception{
 //BA.debugLineNum = 297;BA.debugLine="Sub SetContainer(container As Object) As WixSelect";
 //BA.debugLineNum = 298;BA.debugLine="DropDown.SetAttr(\"container\", container)";
_dropdown._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("container",_container);
 //BA.debugLineNum = 299;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 300;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _setcss(Object _css) throws Exception{
 //BA.debugLineNum = 302;BA.debugLine="Sub SetCss(css As Object) As WixSelect";
 //BA.debugLineNum = 303;BA.debugLine="DropDown.SetAttr(\"css\", css)";
_dropdown._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("css",_css);
 //BA.debugLineNum = 304;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 305;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _setdisabled(boolean _disabled) throws Exception{
 //BA.debugLineNum = 307;BA.debugLine="Sub SetDisabled(disabled As Boolean) As WixSelect";
 //BA.debugLineNum = 308;BA.debugLine="DropDown.SetAttr(\"disabled\", disabled)";
_dropdown._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("disabled",(Object)(_disabled));
 //BA.debugLineNum = 309;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 310;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _setformat(Object _format) throws Exception{
 //BA.debugLineNum = 312;BA.debugLine="Sub SetFormat(format As Object) As WixSelect";
 //BA.debugLineNum = 313;BA.debugLine="DropDown.SetAttr(\"format\", format)";
_dropdown._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("format",_format);
 //BA.debugLineNum = 314;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 315;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _setgravity(Object _gravity) throws Exception{
 //BA.debugLineNum = 317;BA.debugLine="Sub SetGravity(gravity As Object) As WixSelect";
 //BA.debugLineNum = 318;BA.debugLine="DropDown.SetAttr(\"gravity\", gravity)";
_dropdown._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("gravity",_gravity);
 //BA.debugLineNum = 319;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 320;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _setheight(Object _height) throws Exception{
 //BA.debugLineNum = 322;BA.debugLine="Sub SetHeight(height As Object) As WixSelect";
 //BA.debugLineNum = 323;BA.debugLine="DropDown.SetAttr(\"height\", height)";
_dropdown._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("height",_height);
 //BA.debugLineNum = 324;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 325;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _sethidden(boolean _hidden) throws Exception{
 //BA.debugLineNum = 327;BA.debugLine="Sub SetHidden(hidden As Boolean) As WixSelect";
 //BA.debugLineNum = 328;BA.debugLine="DropDown.SetAttr(\"hidden\", hidden)";
_dropdown._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hidden",(Object)(_hidden));
 //BA.debugLineNum = 329;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 330;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _sethotkey(Object _hotkey) throws Exception{
 //BA.debugLineNum = 332;BA.debugLine="Sub SetHotkey(hotkey As Object) As WixSelect";
 //BA.debugLineNum = 333;BA.debugLine="DropDown.SetAttr(\"hotkey\", hotkey)";
_dropdown._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hotkey",_hotkey);
 //BA.debugLineNum = 334;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 335;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _setinputalign(Object _inputalign) throws Exception{
 //BA.debugLineNum = 337;BA.debugLine="Sub SetInputAlign(inputAlign As Object) As WixSele";
 //BA.debugLineNum = 338;BA.debugLine="DropDown.SetAttr(\"inputAlign\", inputAlign)";
_dropdown._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("inputAlign",_inputalign);
 //BA.debugLineNum = 339;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 340;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _setinputheight(Object _inputheight) throws Exception{
 //BA.debugLineNum = 342;BA.debugLine="Sub SetInputHeight(inputHeight As Object) As WixSe";
 //BA.debugLineNum = 343;BA.debugLine="DropDown.SetAttr(\"inputHeight\", inputHeight)";
_dropdown._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("inputHeight",_inputheight);
 //BA.debugLineNum = 344;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 345;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _setinputwidth(Object _inputwidth) throws Exception{
 //BA.debugLineNum = 347;BA.debugLine="Sub SetInputWidth(inputWidth As Object) As WixSele";
 //BA.debugLineNum = 348;BA.debugLine="DropDown.SetAttr(\"inputWidth\", inputWidth)";
_dropdown._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("inputWidth",_inputwidth);
 //BA.debugLineNum = 349;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 350;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _setinvalid(Object _invalid) throws Exception{
 //BA.debugLineNum = 352;BA.debugLine="Sub SetInvalid(invalid As Object) As WixSelect";
 //BA.debugLineNum = 353;BA.debugLine="DropDown.SetAttr(\"invalid\", invalid)";
_dropdown._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("invalid",_invalid);
 //BA.debugLineNum = 354;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 355;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _setinvalidmessage(String _msg) throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Sub SetInvalidMessage(msg As String) As WixSelect";
 //BA.debugLineNum = 105;BA.debugLine="DropDown.SetAttr(\"invalidMessage\", msg)";
_dropdown._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("invalidMessage",(Object)(_msg));
 //BA.debugLineNum = 106;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 207;BA.debugLine="Sub SetLabel(l As String) As WixSelect";
 //BA.debugLineNum = 208;BA.debugLine="DropDown.SetLabel(l)";
_dropdown._setlabel /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_l);
 //BA.debugLineNum = 209;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 210;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _setlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 226;BA.debugLine="Sub SetLabelAlign(a As String) As WixSelect";
 //BA.debugLineNum = 227;BA.debugLine="DropDown.SetLabelAlign(a)";
_dropdown._setlabelalign /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_a);
 //BA.debugLineNum = 228;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 229;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _setlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 232;BA.debugLine="Sub SetLabelPosition(p As String) As WixSelect";
 //BA.debugLineNum = 233;BA.debugLine="DropDown.SetLabelPosition(p)";
_dropdown._setlabelposition /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_p);
 //BA.debugLineNum = 234;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 235;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _setlabelwidth(int _w) throws Exception{
 //BA.debugLineNum = 238;BA.debugLine="Sub SetLabelWidth(w As Int) As WixSelect";
 //BA.debugLineNum = 239;BA.debugLine="DropDown.SetLabelWidth(w)";
_dropdown._setlabelwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 240;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 241;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 123;BA.debugLine="Sub SetMap(m As Map) As WixSelect";
 //BA.debugLineNum = 124;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 125;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 126;BA.debugLine="DropDown.SetAttr(strKey,	strVal)";
_dropdown._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 128;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Sub SetMargin(margin As Object) As WixSelect";
 //BA.debugLineNum = 26;BA.debugLine="DropDown.SetMargin(margin)";
_dropdown._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 27;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _setmaxheight(Object _maxheight) throws Exception{
 //BA.debugLineNum = 357;BA.debugLine="Sub SetMaxHeight(maxHeight As Object) As WixSelect";
 //BA.debugLineNum = 358;BA.debugLine="DropDown.SetAttr(\"maxHeight\", maxHeight)";
_dropdown._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxHeight",_maxheight);
 //BA.debugLineNum = 359;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 360;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _setmaxwidth(Object _maxwidth) throws Exception{
 //BA.debugLineNum = 362;BA.debugLine="Sub SetMaxWidth(maxWidth As Object) As WixSelect";
 //BA.debugLineNum = 363;BA.debugLine="DropDown.SetAttr(\"maxWidth\", maxWidth)";
_dropdown._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxWidth",_maxwidth);
 //BA.debugLineNum = 364;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 365;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 152;BA.debugLine="Sub SetMinHeight(h As Int) As WixSelect";
 //BA.debugLineNum = 153;BA.debugLine="DropDown.SetMinHeight(h)";
_dropdown._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 154;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 146;BA.debugLine="Sub SetMinWidth(w As Int) As WixSelect";
 //BA.debugLineNum = 147;BA.debugLine="DropDown.SetMinWidth(w)";
_dropdown._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 148;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 149;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _setname(String _n) throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Sub SetName(n As String) As WixSelect";
 //BA.debugLineNum = 118;BA.debugLine="DropDown.SetName(n)";
_dropdown._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 119;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _setoptions(anywheresoftware.b4a.objects.collections.List _o) throws Exception{
 //BA.debugLineNum = 170;BA.debugLine="Sub SetOptions(o As List) As WixSelect";
 //BA.debugLineNum = 171;BA.debugLine="Options = o";
_options = _o;
 //BA.debugLineNum = 172;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _setoptionsjson(String _json) throws Exception{
 //BA.debugLineNum = 187;BA.debugLine="Sub SetOptionsJSON(json As String) As WixSelect";
 //BA.debugLineNum = 188;BA.debugLine="DropDown.SetOptionsJSON(json)";
_dropdown._setoptionsjson /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_json);
 //BA.debugLineNum = 189;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 190;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _setoptionsmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _mk = "";
Object _mv = null;
 //BA.debugLineNum = 192;BA.debugLine="Sub SetOptionsMAP(m As Map) As WixSelect";
 //BA.debugLineNum = 193;BA.debugLine="For Each mk As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_mk = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 194;BA.debugLine="Dim mv As Object = m.Get(mk)";
_mv = _m.Get((Object)(_mk));
 //BA.debugLineNum = 195;BA.debugLine="AddOption(mk, mv)";
_addoption(_mk,BA.ObjectToString(_mv));
 }
};
 //BA.debugLineNum = 197;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 198;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Sub SetPadding(padding As Object) As WixSelect";
 //BA.debugLineNum = 20;BA.debugLine="DropDown.SetPadding(padding)";
_dropdown._setpadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 21;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Sub SetParent(p As WixElement) As WixSelect";
 //BA.debugLineNum = 32;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 33;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _setplaceholder(Object _placeholder) throws Exception{
 //BA.debugLineNum = 367;BA.debugLine="Sub SetPlaceholder(placeholder As Object) As WixSe";
 //BA.debugLineNum = 368;BA.debugLine="DropDown.SetAttr(\"placeholder\", placeholder)";
_dropdown._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("placeholder",_placeholder);
 //BA.debugLineNum = 369;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 370;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _setpopup(Object _popup) throws Exception{
 //BA.debugLineNum = 372;BA.debugLine="Sub SetPopup(popup As Object) As WixSelect";
 //BA.debugLineNum = 373;BA.debugLine="DropDown.SetAttr(\"popup\", popup)";
_dropdown._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("popup",_popup);
 //BA.debugLineNum = 374;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 375;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _setreadonly(boolean _readonly) throws Exception{
 //BA.debugLineNum = 377;BA.debugLine="Sub SetReadonly(readonly As Boolean) As WixSelect";
 //BA.debugLineNum = 378;BA.debugLine="DropDown.SetAttr(\"readonly\", readonly)";
_dropdown._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("readonly",(Object)(_readonly));
 //BA.debugLineNum = 379;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 380;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _setrelatedaction(Object _relatedaction) throws Exception{
 //BA.debugLineNum = 382;BA.debugLine="Sub SetRelatedAction(relatedAction As Object) As W";
 //BA.debugLineNum = 383;BA.debugLine="DropDown.SetAttr(\"relatedAction\", relatedAction)";
_dropdown._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("relatedAction",_relatedaction);
 //BA.debugLineNum = 384;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 385;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _setrelatedview(Object _relatedview) throws Exception{
 //BA.debugLineNum = 387;BA.debugLine="Sub SetRelatedView(relatedView As Object) As WixSe";
 //BA.debugLineNum = 388;BA.debugLine="DropDown.SetAttr(\"relatedView\", relatedView)";
_dropdown._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("relatedView",_relatedview);
 //BA.debugLineNum = 389;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 390;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _setrequired(boolean _b) throws Exception{
 //BA.debugLineNum = 111;BA.debugLine="Sub SetRequired(b As Boolean) As WixSelect";
 //BA.debugLineNum = 112;BA.debugLine="DropDown.SetAttr(\"required\", b)";
_dropdown._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("required",(Object)(_b));
 //BA.debugLineNum = 113;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Sub SetResponsive(b As Object) As WixSelect";
 //BA.debugLineNum = 134;BA.debugLine="DropDown.SetResponsive(b)";
_dropdown._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 135;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 139;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixSelect";
 //BA.debugLineNum = 140;BA.debugLine="DropDown.SetResponsiveCell(b)";
_dropdown._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 141;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 55;BA.debugLine="DropDown.SetStyle(prop,sval)";
_dropdown._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 56;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 45;BA.debugLine="Sub SetStyles(m As Map) As WixSelect";
 //BA.debugLineNum = 46;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 47;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 48;BA.debugLine="DropDown.SetStyle(k,v)";
_dropdown._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 50;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _setsuggest(Object _suggest) throws Exception{
 //BA.debugLineNum = 392;BA.debugLine="Sub SetSuggest(suggest As Object) As WixSelect";
 //BA.debugLineNum = 393;BA.debugLine="DropDown.SetAttr(\"suggest\", suggest)";
_dropdown._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("suggest",_suggest);
 //BA.debugLineNum = 394;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 395;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 66;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixSelect";
 //BA.debugLineNum = 67;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 68;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 69;BA.debugLine="DropDown.SetTemplate(os)";
_dropdown._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 70;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 158;BA.debugLine="Sub SetTooltip(tt As String) As WixSelect";
 //BA.debugLineNum = 159;BA.debugLine="DropDown.SetTooltip(tt)";
_dropdown._settooltip /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_tt);
 //BA.debugLineNum = 160;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _setvalidate(Object _v) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub SetValidate(v As Object) As WixSelect   'ignor";
 //BA.debugLineNum = 98;BA.debugLine="DropDown.SetAttr(\"validate\",v)";
_dropdown._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("validate",_v);
 //BA.debugLineNum = 99;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _setvalidateevent(Object _e) throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Sub SetValidateEvent(e As Object) As WixSelect";
 //BA.debugLineNum = 75;BA.debugLine="DropDown.SetAttr(\"validateEvent\", e)";
_dropdown._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("validateEvent",_e);
 //BA.debugLineNum = 76;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _setvalidateeventblur(boolean _b) throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Sub SetValidateEventBlur(b As Boolean) As WixSelec";
 //BA.debugLineNum = 80;BA.debugLine="DropDown.SetAttr(\"validateEvent\", \"blur\")";
_dropdown._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("validateEvent",(Object)("blur"));
 //BA.debugLineNum = 81;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _setvalidateeventkey(boolean _b) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub SetValidateEventKey(b As Boolean) As WixSelect";
 //BA.debugLineNum = 85;BA.debugLine="DropDown.SetAttr(\"validateEvent\", \"key\")";
_dropdown._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("validateEvent",(Object)("key"));
 //BA.debugLineNum = 86;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _setvalidateisnotempty(boolean _b) throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Sub SetValidateIsNotEmpty(b As Boolean) As WixSele";
 //BA.debugLineNum = 91;BA.debugLine="DropDown.SetAttr(\"validate\",\"isNotEmpty\")";
_dropdown._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("validate",(Object)("isNotEmpty"));
 //BA.debugLineNum = 92;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 201;BA.debugLine="Sub SetValue(v As String) As WixSelect";
 //BA.debugLineNum = 202;BA.debugLine="DropDown.SetValue(v)";
_dropdown._setvalue /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_v);
 //BA.debugLineNum = 203;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 204;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _setwidth(Object _width) throws Exception{
 //BA.debugLineNum = 397;BA.debugLine="Sub SetWidth(width As Object) As WixSelect";
 //BA.debugLineNum = 398;BA.debugLine="DropDown.SetAttr(\"width\", width)";
_dropdown._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("width",_width);
 //BA.debugLineNum = 399;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixselect)(this);
 //BA.debugLineNum = 400;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
