package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixsearch extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixsearch", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixsearch.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _search = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 247;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 248;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 249;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 252;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 253;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 254;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.Mashy.BANanoWebixDemo.wixform _frm) throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 129;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 242;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 243;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 244;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Search As WixElement";
_search = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _initialize(anywheresoftware.b4a.BA _ba,String _iid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(iID As String) As WixSearch";
 //BA.debugLineNum = 10;BA.debugLine="ID = iID.tolowercase";
_id = _iid.toLowerCase();
 //BA.debugLineNum = 11;BA.debugLine="Search.Initialize(iID).SetView(\"search\")";
_search._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_iid)._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("search");
 //BA.debugLineNum = 12;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 13;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 175;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 176;BA.debugLine="Return Search.item";
if (true) return _search._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 177;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 60;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _setalign(Object _align) throws Exception{
 //BA.debugLineNum = 386;BA.debugLine="Sub SetAlign(align As Object) As WixSearch";
 //BA.debugLineNum = 387;BA.debugLine="Search.SetAttr(\"align\", align)";
_search._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("align",_align);
 //BA.debugLineNum = 388;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 389;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 229;BA.debugLine="Sub SetAlignCenter(r As String) As WixSearch 'igno";
 //BA.debugLineNum = 230;BA.debugLine="Search.setAligncenter(\"\")";
_search._setaligncenter /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 231;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 232;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 235;BA.debugLine="Sub SetAlignLeft(r As String) As WixSearch 'ignore";
 //BA.debugLineNum = 236;BA.debugLine="Search.SetAlignleft(\"\")";
_search._setalignleft /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 237;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 238;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 223;BA.debugLine="Sub SetAlignRight(r As String) As WixSearch 'ignor";
 //BA.debugLineNum = 224;BA.debugLine="Search.setAlignright(\"\")";
_search._setalignright /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 225;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 226;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _setanimate(boolean _animate) throws Exception{
 //BA.debugLineNum = 256;BA.debugLine="Sub SetAnimate(animate As Boolean) As WixSearch";
 //BA.debugLineNum = 257;BA.debugLine="Search.SetAttr(\"animate\", animate)";
_search._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("animate",(Object)(_animate));
 //BA.debugLineNum = 258;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 259;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 28;BA.debugLine="Sub SetAttributes(m As Map) As WixSearch";
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
 //BA.debugLineNum = 31;BA.debugLine="Search.SetAttr(k,v)";
_search._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 33;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _setautowidth(boolean _autowidth) throws Exception{
 //BA.debugLineNum = 261;BA.debugLine="Sub SetAutowidth(autowidth As Boolean) As WixSearc";
 //BA.debugLineNum = 262;BA.debugLine="Search.SetAttr(\"autowidth\", autowidth)";
_search._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("autowidth",(Object)(_autowidth));
 //BA.debugLineNum = 263;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 264;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _setborderless(boolean _borderless) throws Exception{
 //BA.debugLineNum = 266;BA.debugLine="Sub SetBorderless(borderless As Boolean) As WixSea";
 //BA.debugLineNum = 267;BA.debugLine="Search.SetAttr(\"borderless\", borderless)";
_search._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("borderless",(Object)(_borderless));
 //BA.debugLineNum = 268;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 269;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _setbottomlabel(Object _f) throws Exception{
 //BA.debugLineNum = 193;BA.debugLine="Sub SetBottomLabel(f As Object) As WixSearch";
 //BA.debugLineNum = 194;BA.debugLine="Search.SetAttr(\"bottomLabel\", f)";
_search._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("bottomLabel",_f);
 //BA.debugLineNum = 195;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 196;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _setbottompadding(Object _f) throws Exception{
 //BA.debugLineNum = 199;BA.debugLine="Sub SetBottomPadding(f As Object) As WixSearch";
 //BA.debugLineNum = 200;BA.debugLine="Search.SetAttr(\"bottomPadding\", f)";
_search._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("bottomPadding",_f);
 //BA.debugLineNum = 201;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 202;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _setclick(Object _click) throws Exception{
 //BA.debugLineNum = 271;BA.debugLine="Sub SetClick(click As Object) As WixSearch";
 //BA.debugLineNum = 272;BA.debugLine="Search.SetAttr(\"click\", click)";
_search._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("click",_click);
 //BA.debugLineNum = 273;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 274;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _setcontainer(Object _container) throws Exception{
 //BA.debugLineNum = 276;BA.debugLine="Sub SetContainer(container As Object) As WixSearch";
 //BA.debugLineNum = 277;BA.debugLine="Search.SetAttr(\"container\", container)";
_search._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("container",_container);
 //BA.debugLineNum = 278;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 279;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _setcss(Object _css) throws Exception{
 //BA.debugLineNum = 281;BA.debugLine="Sub SetCss(css As Object) As WixSearch";
 //BA.debugLineNum = 282;BA.debugLine="Search.SetAttr(\"css\", css)";
_search._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("css",_css);
 //BA.debugLineNum = 283;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 284;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _setdisabled(boolean _disabled) throws Exception{
 //BA.debugLineNum = 286;BA.debugLine="Sub SetDisabled(disabled As Boolean) As WixSearch";
 //BA.debugLineNum = 287;BA.debugLine="Search.SetAttr(\"disabled\", disabled)";
_search._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("disabled",(Object)(_disabled));
 //BA.debugLineNum = 288;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 289;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _setformat(Object _format) throws Exception{
 //BA.debugLineNum = 291;BA.debugLine="Sub SetFormat(format As Object) As WixSearch";
 //BA.debugLineNum = 292;BA.debugLine="Search.SetAttr(\"format\", format)";
_search._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("format",_format);
 //BA.debugLineNum = 293;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 294;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _setgravity(Object _gravity) throws Exception{
 //BA.debugLineNum = 296;BA.debugLine="Sub SetGravity(gravity As Object) As WixSearch";
 //BA.debugLineNum = 297;BA.debugLine="Search.SetAttr(\"gravity\", gravity)";
_search._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("gravity",_gravity);
 //BA.debugLineNum = 298;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 299;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _setheight(Object _height) throws Exception{
 //BA.debugLineNum = 301;BA.debugLine="Sub SetHeight(height As Object) As WixSearch";
 //BA.debugLineNum = 302;BA.debugLine="Search.SetAttr(\"height\", height)";
_search._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("height",_height);
 //BA.debugLineNum = 303;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 304;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _sethidden(boolean _hidden) throws Exception{
 //BA.debugLineNum = 306;BA.debugLine="Sub SetHidden(hidden As Boolean) As WixSearch";
 //BA.debugLineNum = 307;BA.debugLine="Search.SetAttr(\"hidden\", hidden)";
_search._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hidden",(Object)(_hidden));
 //BA.debugLineNum = 308;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 309;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _sethotkey(Object _hotkey) throws Exception{
 //BA.debugLineNum = 311;BA.debugLine="Sub SetHotkey(hotkey As Object) As WixSearch";
 //BA.debugLineNum = 312;BA.debugLine="Search.SetAttr(\"hotkey\", hotkey)";
_search._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hotkey",_hotkey);
 //BA.debugLineNum = 313;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 314;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _seticon(Object _icon) throws Exception{
 //BA.debugLineNum = 316;BA.debugLine="Sub SetIcon(icon As Object) As WixSearch";
 //BA.debugLineNum = 317;BA.debugLine="Search.SetAttr(\"icon\", icon)";
_search._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("icon",_icon);
 //BA.debugLineNum = 318;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 319;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _setinputalign(Object _inputalign) throws Exception{
 //BA.debugLineNum = 391;BA.debugLine="Sub SetInputAlign(inputAlign As Object) As WixSear";
 //BA.debugLineNum = 392;BA.debugLine="Search.SetAttr(\"inputAlign\", inputAlign)";
_search._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("inputAlign",_inputalign);
 //BA.debugLineNum = 393;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 394;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _setinputheight(Object _inputheight) throws Exception{
 //BA.debugLineNum = 321;BA.debugLine="Sub SetInputHeight(inputHeight As Object) As WixSe";
 //BA.debugLineNum = 322;BA.debugLine="Search.SetAttr(\"inputHeight\", inputHeight)";
_search._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("inputHeight",_inputheight);
 //BA.debugLineNum = 323;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 324;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _setinputwidth(Object _inputwidth) throws Exception{
 //BA.debugLineNum = 326;BA.debugLine="Sub SetInputWidth(inputWidth As Object) As WixSear";
 //BA.debugLineNum = 327;BA.debugLine="Search.SetAttr(\"inputWidth\", inputWidth)";
_search._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("inputWidth",_inputwidth);
 //BA.debugLineNum = 328;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 329;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _setinvalid(Object _invalid) throws Exception{
 //BA.debugLineNum = 331;BA.debugLine="Sub SetInvalid(invalid As Object) As WixSearch";
 //BA.debugLineNum = 332;BA.debugLine="Search.SetAttr(\"invalid\", invalid)";
_search._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("invalid",_invalid);
 //BA.debugLineNum = 333;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 334;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _setinvalidmessage(String _msg) throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Sub SetInvalidMessage(msg As String) As WixSearch";
 //BA.debugLineNum = 109;BA.debugLine="Search.SetAttr(\"invalidMessage\", msg)";
_search._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("invalidMessage",(Object)(_msg));
 //BA.debugLineNum = 110;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 186;BA.debugLine="Sub SetLabel(l As String) As WixSearch";
 //BA.debugLineNum = 187;BA.debugLine="Search.SetLabel(l)";
_search._setlabel /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_l);
 //BA.debugLineNum = 188;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 189;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _setlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 205;BA.debugLine="Sub SetLabelAlign(a As String) As WixSearch";
 //BA.debugLineNum = 206;BA.debugLine="Search.SetLabelAlign(a)";
_search._setlabelalign /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_a);
 //BA.debugLineNum = 207;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 208;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _setlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 211;BA.debugLine="Sub SetLabelPosition(p As String) As WixSearch";
 //BA.debugLineNum = 212;BA.debugLine="Search.SetLabelPosition(p)";
_search._setlabelposition /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_p);
 //BA.debugLineNum = 213;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 214;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _setlabelwidth(int _w) throws Exception{
 //BA.debugLineNum = 217;BA.debugLine="Sub SetLabelWidth(w As Int) As WixSearch";
 //BA.debugLineNum = 218;BA.debugLine="Search.SetLabelWidth(w)";
_search._setlabelwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 219;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 220;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 133;BA.debugLine="Sub SetMap(m As Map) As WixSearch";
 //BA.debugLineNum = 134;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 135;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 136;BA.debugLine="Search.SetAttr(strKey,	strVal)";
_search._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 138;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Sub SetMargin(margin As Object) As WixSearch";
 //BA.debugLineNum = 24;BA.debugLine="Search.SetMargin(margin)";
_search._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 25;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _setmaxheight(Object _maxheight) throws Exception{
 //BA.debugLineNum = 336;BA.debugLine="Sub SetMaxHeight(maxHeight As Object) As WixSearch";
 //BA.debugLineNum = 337;BA.debugLine="Search.SetAttr(\"maxHeight\", maxHeight)";
_search._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxHeight",_maxheight);
 //BA.debugLineNum = 338;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 339;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _setmaxwidth(Object _maxwidth) throws Exception{
 //BA.debugLineNum = 341;BA.debugLine="Sub SetMaxWidth(maxWidth As Object) As WixSearch";
 //BA.debugLineNum = 342;BA.debugLine="Search.SetAttr(\"maxWidth\", maxWidth)";
_search._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxWidth",_maxwidth);
 //BA.debugLineNum = 343;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 344;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 162;BA.debugLine="Sub SetMinHeight(h As Int) As WixSearch";
 //BA.debugLineNum = 163;BA.debugLine="Search.SetMinHeight(h)";
_search._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 164;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 165;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 156;BA.debugLine="Sub SetMinWidth(w As Int) As WixSearch";
 //BA.debugLineNum = 157;BA.debugLine="Search.SetMinWidth(w)";
_search._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 158;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _setname(String _n) throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Sub SetName(n As String) As WixSearch";
 //BA.debugLineNum = 123;BA.debugLine="Search.SetName(n)";
_search._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 124;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub SetPadding(padding As Object) As WixSearch";
 //BA.debugLineNum = 18;BA.debugLine="Search.SetPadding(padding)";
_search._setpadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 19;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub SetParent(p As WixElement) As WixSearch";
 //BA.debugLineNum = 53;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _setpattern(Object _pattern) throws Exception{
 //BA.debugLineNum = 346;BA.debugLine="Sub SetPattern(pattern As Object) As WixSearch";
 //BA.debugLineNum = 347;BA.debugLine="Search.SetAttr(\"pattern\", pattern)";
_search._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("pattern",_pattern);
 //BA.debugLineNum = 348;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 349;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _setplaceholder(String _ph) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Sub SetPlaceHolder(ph As String) As WixSearch";
 //BA.debugLineNum = 73;BA.debugLine="Search.SetPlaceHolder(ph)";
_search._setplaceholder /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_ph);
 //BA.debugLineNum = 74;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _setpopup(Object _popup) throws Exception{
 //BA.debugLineNum = 351;BA.debugLine="Sub SetPopup(popup As Object) As WixSearch";
 //BA.debugLineNum = 352;BA.debugLine="Search.SetAttr(\"popup\", popup)";
_search._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("popup",_popup);
 //BA.debugLineNum = 353;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 354;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _setreadonly(boolean _readonly) throws Exception{
 //BA.debugLineNum = 356;BA.debugLine="Sub SetReadonly(readonly As Boolean) As WixSearch";
 //BA.debugLineNum = 357;BA.debugLine="Search.SetAttr(\"readonly\", readonly)";
_search._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("readonly",(Object)(_readonly));
 //BA.debugLineNum = 358;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 359;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _setrelatedaction(Object _relatedaction) throws Exception{
 //BA.debugLineNum = 361;BA.debugLine="Sub SetRelatedAction(relatedAction As Object) As W";
 //BA.debugLineNum = 362;BA.debugLine="Search.SetAttr(\"relatedAction\", relatedAction)";
_search._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("relatedAction",_relatedaction);
 //BA.debugLineNum = 363;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 364;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _setrelatedview(Object _relatedview) throws Exception{
 //BA.debugLineNum = 366;BA.debugLine="Sub SetRelatedView(relatedView As Object) As WixSe";
 //BA.debugLineNum = 367;BA.debugLine="Search.SetAttr(\"relatedView\", relatedView)";
_search._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("relatedView",_relatedview);
 //BA.debugLineNum = 368;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 369;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _setrequired(boolean _b) throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Sub SetRequired(b As Boolean) As WixSearch";
 //BA.debugLineNum = 116;BA.debugLine="Search.SetAttr(\"required\", b)";
_search._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("required",(Object)(_b));
 //BA.debugLineNum = 117;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 143;BA.debugLine="Sub SetResponsive(b As Object) As WixSearch";
 //BA.debugLineNum = 144;BA.debugLine="Search.SetResponsive(b)";
_search._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 145;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 149;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixSearch";
 //BA.debugLineNum = 150;BA.debugLine="Search.SetResponsiveCell(b)";
_search._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 151;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 46;BA.debugLine="Search.SetStyle(prop,sval)";
_search._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 47;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 36;BA.debugLine="Sub SetStyles(m As Map) As WixSearch";
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
 //BA.debugLineNum = 39;BA.debugLine="Search.SetStyle(k,v)";
_search._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 41;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _setsuggest(Object _suggest) throws Exception{
 //BA.debugLineNum = 371;BA.debugLine="Sub SetSuggest(suggest As Object) As WixSearch";
 //BA.debugLineNum = 372;BA.debugLine="Search.SetAttr(\"suggest\", suggest)";
_search._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("suggest",_suggest);
 //BA.debugLineNum = 373;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 374;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 63;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixSearch";
 //BA.debugLineNum = 64;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 65;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 66;BA.debugLine="Search.SetTemplate(os)";
_search._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 67;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 168;BA.debugLine="Sub SetTooltip(tt As String) As WixSearch";
 //BA.debugLineNum = 169;BA.debugLine="Search.SetTooltip(tt)";
_search._settooltip /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_tt);
 //BA.debugLineNum = 170;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 171;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _settype(Object _stype) throws Exception{
 //BA.debugLineNum = 376;BA.debugLine="Sub SetType(sType As Object) As WixSearch";
 //BA.debugLineNum = 377;BA.debugLine="Search.SetAttr(\"type\", sType)";
_search._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("type",_stype);
 //BA.debugLineNum = 378;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 379;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _setvalidate(Object _v) throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Sub SetValidate(v As Object) As WixSearch   'ignor";
 //BA.debugLineNum = 102;BA.debugLine="Search.SetAttr(\"validate\",v)";
_search._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("validate",_v);
 //BA.debugLineNum = 103;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _setvalidateevent(Object _e) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub SetValidateEvent(e As Object) As WixSearch";
 //BA.debugLineNum = 79;BA.debugLine="Search.SetAttr(\"validateEvent\", e)";
_search._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("validateEvent",_e);
 //BA.debugLineNum = 80;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _setvalidateeventblur(boolean _b) throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Sub SetValidateEventBlur(b As Boolean) As WixSearc";
 //BA.debugLineNum = 84;BA.debugLine="Search.SetAttr(\"validateEvent\", \"blur\")";
_search._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("validateEvent",(Object)("blur"));
 //BA.debugLineNum = 85;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _setvalidateeventkey(boolean _b) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Sub SetValidateEventKey(b As Boolean) As WixSearch";
 //BA.debugLineNum = 89;BA.debugLine="Search.SetAttr(\"validateEvent\", \"key\")";
_search._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("validateEvent",(Object)("key"));
 //BA.debugLineNum = 90;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _setvalidateisnotempty(boolean _b) throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Sub SetValidateIsNotEmpty(b As Boolean) As WixSear";
 //BA.debugLineNum = 95;BA.debugLine="Search.SetAttr(\"validate\",\"isNotEmpty\")";
_search._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("validate",(Object)("isNotEmpty"));
 //BA.debugLineNum = 96;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 180;BA.debugLine="Sub SetValue(v As String) As WixSearch";
 //BA.debugLineNum = 181;BA.debugLine="Search.SetValue(v)";
_search._setvalue /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_v);
 //BA.debugLineNum = 182;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 183;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _setwidth(Object _width) throws Exception{
 //BA.debugLineNum = 381;BA.debugLine="Sub SetWidth(width As Object) As WixSearch";
 //BA.debugLineNum = 382;BA.debugLine="Search.SetAttr(\"width\", width)";
_search._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("width",_width);
 //BA.debugLineNum = 383;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsearch)(this);
 //BA.debugLineNum = 384;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
