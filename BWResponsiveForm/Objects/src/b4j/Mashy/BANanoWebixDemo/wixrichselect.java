package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixrichselect extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixrichselect", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixrichselect.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _richselect = null;
public anywheresoftware.b4a.objects.collections.List _options = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _addoption(String _sid,String _svalue) throws Exception{
anywheresoftware.b4a.objects.collections.Map _sug = null;
 //BA.debugLineNum = 205;BA.debugLine="Sub AddOption(sID As String, sValue As String) As";
 //BA.debugLineNum = 206;BA.debugLine="Dim sug As Map = CreateMap()";
_sug = new anywheresoftware.b4a.objects.collections.Map();
_sug = __c.createMap(new Object[] {});
 //BA.debugLineNum = 207;BA.debugLine="sug.Put(\"id\", sID)";
_sug.Put((Object)("id"),(Object)(_sid));
 //BA.debugLineNum = 208;BA.debugLine="sug.Put(\"value\", sValue)";
_sug.Put((Object)("value"),(Object)(_svalue));
 //BA.debugLineNum = 209;BA.debugLine="Options.Add(sug)";
_options.Add((Object)(_sug.getObject()));
 //BA.debugLineNum = 210;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 211;BA.debugLine="End Sub";
return null;
}
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 277;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 278;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 279;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 282;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 283;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 284;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.Mashy.BANanoWebixDemo.wixform _frm) throws Exception{
 //BA.debugLineNum = 169;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 170;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 171;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 272;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 273;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 274;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public RichSelect As WixElement";
_richselect = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private Options As List";
_options = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 6;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _initialize(anywheresoftware.b4a.BA _ba,String _iid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(iID As String) As WixRichSel";
 //BA.debugLineNum = 11;BA.debugLine="ID = iID.tolowercase";
_id = _iid.toLowerCase();
 //BA.debugLineNum = 12;BA.debugLine="RichSelect.Initialize(iID).SetView(\"richselect\")";
_richselect._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_iid)._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("richselect");
 //BA.debugLineNum = 13;BA.debugLine="Options.Initialize";
_options.Initialize();
 //BA.debugLineNum = 14;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 15;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 174;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 175;BA.debugLine="RichSelect.SetAttr(\"options\", Options)";
_richselect._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("options",(Object)(_options.getObject()));
 //BA.debugLineNum = 176;BA.debugLine="Return RichSelect.item";
if (true) return _richselect._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 177;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 62;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _setalign(Object _align) throws Exception{
 //BA.debugLineNum = 287;BA.debugLine="Sub SetAlign(align As Object) As WixRichSelect";
 //BA.debugLineNum = 288;BA.debugLine="RichSelect.SetAttr(\"align\", align)";
_richselect._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("align",_align);
 //BA.debugLineNum = 289;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 290;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 252;BA.debugLine="Sub SetAlignCenter(r As String) As WixRichSelect '";
 //BA.debugLineNum = 253;BA.debugLine="RichSelect.setAligncenter(\"\")";
_richselect._setaligncenter /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 254;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 255;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 258;BA.debugLine="Sub SetAlignLeft(r As String) As WixRichSelect 'ig";
 //BA.debugLineNum = 259;BA.debugLine="RichSelect.SetAlignleft(\"\")";
_richselect._setalignleft /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 260;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 261;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 246;BA.debugLine="Sub SetAlignRight(r As String) As WixRichSelect 'i";
 //BA.debugLineNum = 247;BA.debugLine="RichSelect.setAlignright(\"\")";
_richselect._setalignright /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 248;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 249;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _setanimate(boolean _animate) throws Exception{
 //BA.debugLineNum = 292;BA.debugLine="Sub SetAnimate(animate As Boolean) As WixRichSelec";
 //BA.debugLineNum = 293;BA.debugLine="RichSelect.SetAttr(\"animate\", animate)";
_richselect._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("animate",(Object)(_animate));
 //BA.debugLineNum = 294;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 295;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 30;BA.debugLine="Sub SetAttributes(m As Map) As WixRichSelect";
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
 //BA.debugLineNum = 33;BA.debugLine="RichSelect.SetAttr(k,v)";
_richselect._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 35;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _setborderless(boolean _borderless) throws Exception{
 //BA.debugLineNum = 297;BA.debugLine="Sub SetBorderless(borderless As Boolean) As WixRic";
 //BA.debugLineNum = 298;BA.debugLine="RichSelect.SetAttr(\"borderless\", borderless)";
_richselect._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("borderless",(Object)(_borderless));
 //BA.debugLineNum = 299;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 300;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _setbottomlabel(Object _bottomlabel) throws Exception{
 //BA.debugLineNum = 302;BA.debugLine="Sub SetBottomLabel(bottomLabel As Object) As WixRi";
 //BA.debugLineNum = 303;BA.debugLine="RichSelect.SetAttr(\"bottomLabel\", bottomLabel)";
_richselect._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("bottomLabel",_bottomlabel);
 //BA.debugLineNum = 304;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 305;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _setbottompadding(Object _bottompadding) throws Exception{
 //BA.debugLineNum = 307;BA.debugLine="Sub SetBottomPadding(bottomPadding As Object) As W";
 //BA.debugLineNum = 308;BA.debugLine="RichSelect.SetAttr(\"bottomPadding\", bottomPadding";
_richselect._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("bottomPadding",_bottompadding);
 //BA.debugLineNum = 309;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 310;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _setclick(Object _click) throws Exception{
 //BA.debugLineNum = 312;BA.debugLine="Sub SetClick(click As Object) As WixRichSelect";
 //BA.debugLineNum = 313;BA.debugLine="RichSelect.SetAttr(\"click\", click)";
_richselect._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("click",_click);
 //BA.debugLineNum = 314;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 315;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _setcontainer(Object _container) throws Exception{
 //BA.debugLineNum = 317;BA.debugLine="Sub SetContainer(container As Object) As WixRichSe";
 //BA.debugLineNum = 318;BA.debugLine="RichSelect.SetAttr(\"container\", container)";
_richselect._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("container",_container);
 //BA.debugLineNum = 319;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 320;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _setcss(Object _css) throws Exception{
 //BA.debugLineNum = 322;BA.debugLine="Sub SetCss(css As Object) As WixRichSelect";
 //BA.debugLineNum = 323;BA.debugLine="RichSelect.SetAttr(\"css\", css)";
_richselect._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("css",_css);
 //BA.debugLineNum = 324;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 325;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _setdisabled(boolean _disabled) throws Exception{
 //BA.debugLineNum = 327;BA.debugLine="Sub SetDisabled(disabled As Boolean) As WixRichSel";
 //BA.debugLineNum = 328;BA.debugLine="RichSelect.SetAttr(\"disabled\", disabled)";
_richselect._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("disabled",(Object)(_disabled));
 //BA.debugLineNum = 329;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 330;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _setformat(Object _format) throws Exception{
 //BA.debugLineNum = 332;BA.debugLine="Sub SetFormat(format As Object) As WixRichSelect";
 //BA.debugLineNum = 333;BA.debugLine="RichSelect.SetAttr(\"format\", format)";
_richselect._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("format",_format);
 //BA.debugLineNum = 334;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 335;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _setgravity(Object _gravity) throws Exception{
 //BA.debugLineNum = 337;BA.debugLine="Sub SetGravity(gravity As Object) As WixRichSelect";
 //BA.debugLineNum = 338;BA.debugLine="RichSelect.SetAttr(\"gravity\", gravity)";
_richselect._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("gravity",_gravity);
 //BA.debugLineNum = 339;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 340;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _setheight(Object _height) throws Exception{
 //BA.debugLineNum = 342;BA.debugLine="Sub SetHeight(height As Object) As WixRichSelect";
 //BA.debugLineNum = 343;BA.debugLine="RichSelect.SetAttr(\"height\", height)";
_richselect._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("height",_height);
 //BA.debugLineNum = 344;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 345;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _sethidden(boolean _hidden) throws Exception{
 //BA.debugLineNum = 347;BA.debugLine="Sub SetHidden(hidden As Boolean) As WixRichSelect";
 //BA.debugLineNum = 348;BA.debugLine="RichSelect.SetAttr(\"hidden\", hidden)";
_richselect._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hidden",(Object)(_hidden));
 //BA.debugLineNum = 349;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 350;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _sethotkey(Object _hotkey) throws Exception{
 //BA.debugLineNum = 352;BA.debugLine="Sub SetHotkey(hotkey As Object) As WixRichSelect";
 //BA.debugLineNum = 353;BA.debugLine="RichSelect.SetAttr(\"hotkey\", hotkey)";
_richselect._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hotkey",_hotkey);
 //BA.debugLineNum = 354;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 355;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _seticon(Object _icon) throws Exception{
 //BA.debugLineNum = 357;BA.debugLine="Sub SetIcon(icon As Object) As WixRichSelect";
 //BA.debugLineNum = 358;BA.debugLine="RichSelect.SetAttr(\"icon\", icon)";
_richselect._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("icon",_icon);
 //BA.debugLineNum = 359;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 360;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _setinputalign(Object _inputalign) throws Exception{
 //BA.debugLineNum = 362;BA.debugLine="Sub SetInputAlign(inputAlign As Object) As WixRich";
 //BA.debugLineNum = 363;BA.debugLine="RichSelect.SetAttr(\"inputAlign\", inputAlign)";
_richselect._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("inputAlign",_inputalign);
 //BA.debugLineNum = 364;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 365;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _setinputheight(Object _inputheight) throws Exception{
 //BA.debugLineNum = 367;BA.debugLine="Sub SetInputHeight(inputHeight As Object) As WixRi";
 //BA.debugLineNum = 368;BA.debugLine="RichSelect.SetAttr(\"inputHeight\", inputHeight)";
_richselect._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("inputHeight",_inputheight);
 //BA.debugLineNum = 369;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 370;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _setinputwidth(Object _inputwidth) throws Exception{
 //BA.debugLineNum = 372;BA.debugLine="Sub SetInputWidth(inputWidth As Object) As WixRich";
 //BA.debugLineNum = 373;BA.debugLine="RichSelect.SetAttr(\"inputWidth\", inputWidth)";
_richselect._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("inputWidth",_inputwidth);
 //BA.debugLineNum = 374;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 375;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _setinvalid(Object _invalid) throws Exception{
 //BA.debugLineNum = 377;BA.debugLine="Sub SetInvalid(invalid As Object) As WixRichSelect";
 //BA.debugLineNum = 378;BA.debugLine="RichSelect.SetAttr(\"invalid\", invalid)";
_richselect._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("invalid",_invalid);
 //BA.debugLineNum = 379;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 380;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _setinvalidmessage(String _msg) throws Exception{
 //BA.debugLineNum = 105;BA.debugLine="Sub SetInvalidMessage(msg As String) As WixRichSel";
 //BA.debugLineNum = 106;BA.debugLine="RichSelect.SetAttr(\"invalidMessage\", msg)";
_richselect._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("invalidMessage",(Object)(_msg));
 //BA.debugLineNum = 107;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 220;BA.debugLine="Sub SetLabel(l As String) As WixRichSelect";
 //BA.debugLineNum = 221;BA.debugLine="RichSelect.SetLabel(l)";
_richselect._setlabel /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_l);
 //BA.debugLineNum = 222;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 223;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _setlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 227;BA.debugLine="Sub SetLabelAlign(a As String) As WixRichSelect";
 //BA.debugLineNum = 228;BA.debugLine="RichSelect.SetLabelAlign(a)";
_richselect._setlabelalign /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_a);
 //BA.debugLineNum = 229;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 230;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _setlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 233;BA.debugLine="Sub SetLabelPosition(p As String) As WixRichSelect";
 //BA.debugLineNum = 234;BA.debugLine="RichSelect.SetLabelPosition(p)";
_richselect._setlabelposition /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_p);
 //BA.debugLineNum = 235;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 236;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _setlabelwidth(int _w) throws Exception{
 //BA.debugLineNum = 239;BA.debugLine="Sub SetLabelWidth(w As Int) As WixRichSelect";
 //BA.debugLineNum = 240;BA.debugLine="RichSelect.SetLabelWidth(w)";
_richselect._setlabelwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 241;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 242;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 66;BA.debugLine="Sub SetMap(m As Map) As WixRichSelect";
 //BA.debugLineNum = 67;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 68;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 69;BA.debugLine="RichSelect.SetAttr(strKey,	strVal)";
_richselect._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 71;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Sub SetMargin(margin As Object) As WixRichSelect";
 //BA.debugLineNum = 26;BA.debugLine="RichSelect.SetMargin(margin)";
_richselect._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 27;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _setmaxheight(Object _maxheight) throws Exception{
 //BA.debugLineNum = 382;BA.debugLine="Sub SetMaxHeight(maxHeight As Object) As WixRichSe";
 //BA.debugLineNum = 383;BA.debugLine="RichSelect.SetAttr(\"maxHeight\", maxHeight)";
_richselect._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxHeight",_maxheight);
 //BA.debugLineNum = 384;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 385;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _setmaxwidth(Object _maxwidth) throws Exception{
 //BA.debugLineNum = 387;BA.debugLine="Sub SetMaxWidth(maxWidth As Object) As WixRichSele";
 //BA.debugLineNum = 388;BA.debugLine="RichSelect.SetAttr(\"maxWidth\", maxWidth)";
_richselect._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxWidth",_maxwidth);
 //BA.debugLineNum = 389;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 390;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 157;BA.debugLine="Sub SetMinHeight(h As Int) As WixRichSelect";
 //BA.debugLineNum = 158;BA.debugLine="RichSelect.SetMinHeight(h)";
_richselect._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 159;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 151;BA.debugLine="Sub SetMinWidth(w As Int) As WixRichSelect";
 //BA.debugLineNum = 152;BA.debugLine="RichSelect.SetMinWidth(w)";
_richselect._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 153;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _setname(String _n) throws Exception{
 //BA.debugLineNum = 132;BA.debugLine="Sub SetName(n As String) As WixRichSelect";
 //BA.debugLineNum = 133;BA.debugLine="RichSelect.SetName(n)";
_richselect._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 134;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _setoptions(anywheresoftware.b4a.objects.collections.List _o) throws Exception{
 //BA.debugLineNum = 186;BA.debugLine="Sub SetOptions(o As List) As WixRichSelect";
 //BA.debugLineNum = 187;BA.debugLine="Options = o";
_options = _o;
 //BA.debugLineNum = 188;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 189;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _setoptionsjson(String _json) throws Exception{
 //BA.debugLineNum = 191;BA.debugLine="Sub SetOptionsJSON(json As String) As WixRichSelec";
 //BA.debugLineNum = 192;BA.debugLine="RichSelect.SetOptionsJSON(json)";
_richselect._setoptionsjson /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_json);
 //BA.debugLineNum = 193;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _setoptionsmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _mk = "";
Object _mv = null;
 //BA.debugLineNum = 196;BA.debugLine="Sub SetOptionsMAP(m As Map) As WixRichSelect";
 //BA.debugLineNum = 197;BA.debugLine="For Each mk As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_mk = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 198;BA.debugLine="Dim mv As Object = m.Get(mk)";
_mv = _m.Get((Object)(_mk));
 //BA.debugLineNum = 199;BA.debugLine="AddOption(mk, mv)";
_addoption(_mk,BA.ObjectToString(_mv));
 }
};
 //BA.debugLineNum = 201;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 202;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Sub SetPadding(padding As Object) As WixRichSelect";
 //BA.debugLineNum = 20;BA.debugLine="RichSelect.SetPadding(padding)";
_richselect._setpadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 21;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Sub SetParent(p As WixElement) As WixRichSelect";
 //BA.debugLineNum = 55;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 56;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _setplaceholder(String _ph) throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Sub SetPlaceHolder(ph As String) As WixRichSelect";
 //BA.debugLineNum = 120;BA.debugLine="RichSelect.SetPlaceHolder(ph)";
_richselect._setplaceholder /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_ph);
 //BA.debugLineNum = 121;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _setpopup(Object _popup) throws Exception{
 //BA.debugLineNum = 392;BA.debugLine="Sub SetPopup(popup As Object) As WixRichSelect";
 //BA.debugLineNum = 393;BA.debugLine="RichSelect.SetAttr(\"popup\", popup)";
_richselect._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("popup",_popup);
 //BA.debugLineNum = 394;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 395;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _setpopupwidth(Object _popupwidth) throws Exception{
 //BA.debugLineNum = 397;BA.debugLine="Sub SetPopupWidth(popupWidth As Object) As WixRich";
 //BA.debugLineNum = 398;BA.debugLine="RichSelect.SetAttr(\"popupWidth\", popupWidth)";
_richselect._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("popupWidth",_popupwidth);
 //BA.debugLineNum = 399;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 400;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _setreadonly(boolean _readonly) throws Exception{
 //BA.debugLineNum = 402;BA.debugLine="Sub SetReadonly(readonly As Boolean) As WixRichSel";
 //BA.debugLineNum = 403;BA.debugLine="RichSelect.SetAttr(\"readonly\", readonly)";
_richselect._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("readonly",(Object)(_readonly));
 //BA.debugLineNum = 404;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 405;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _setrelatedaction(Object _relatedaction) throws Exception{
 //BA.debugLineNum = 407;BA.debugLine="Sub SetRelatedAction(relatedAction As Object) As W";
 //BA.debugLineNum = 408;BA.debugLine="RichSelect.SetAttr(\"relatedAction\", relatedAction)";
_richselect._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("relatedAction",_relatedaction);
 //BA.debugLineNum = 409;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 410;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _setrelatedview(Object _relatedview) throws Exception{
 //BA.debugLineNum = 412;BA.debugLine="Sub SetRelatedView(relatedView As Object) As WixRi";
 //BA.debugLineNum = 413;BA.debugLine="RichSelect.SetAttr(\"relatedView\", relatedView)";
_richselect._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("relatedView",_relatedview);
 //BA.debugLineNum = 414;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 415;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _setrequired(boolean _b) throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Sub SetRequired(b As Boolean) As WixRichSelect";
 //BA.debugLineNum = 113;BA.debugLine="RichSelect.SetAttr(\"required\", b)";
_richselect._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("required",(Object)(_b));
 //BA.debugLineNum = 114;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 138;BA.debugLine="Sub SetResponsive(b As Object) As WixRichSelect";
 //BA.debugLineNum = 139;BA.debugLine="RichSelect.SetResponsive(b)";
_richselect._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 140;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 144;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixRichSelec";
 //BA.debugLineNum = 145;BA.debugLine="RichSelect.SetResponsiveCell(b)";
_richselect._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 146;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 48;BA.debugLine="RichSelect.SetStyle(prop,sval)";
_richselect._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 38;BA.debugLine="Sub SetStyles(m As Map) As WixRichSelect";
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
 //BA.debugLineNum = 41;BA.debugLine="RichSelect.SetStyle(k,v)";
_richselect._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 43;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _setsuggest(Object _s) throws Exception{
 //BA.debugLineNum = 265;BA.debugLine="Sub SetSuggest(s As Object) As WixRichSelect";
 //BA.debugLineNum = 266;BA.debugLine="RichSelect.setSuggest(s)";
_richselect._setsuggest /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_s);
 //BA.debugLineNum = 267;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 268;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 124;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixRichSel";
 //BA.debugLineNum = 125;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 126;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 127;BA.debugLine="RichSelect.SetTemplate(os)";
_richselect._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 128;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _settext(String _t) throws Exception{
 //BA.debugLineNum = 180;BA.debugLine="Sub SetText(t As String) As WixRichSelect";
 //BA.debugLineNum = 181;BA.debugLine="RichSelect.SetAttr(\"text\", t)";
_richselect._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("text",(Object)(_t));
 //BA.debugLineNum = 182;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 183;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 163;BA.debugLine="Sub SetTooltip(tt As String) As WixRichSelect";
 //BA.debugLineNum = 164;BA.debugLine="RichSelect.SetTooltip(tt)";
_richselect._settooltip /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_tt);
 //BA.debugLineNum = 165;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 166;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _setvalidate(Object _v) throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Sub SetValidate(v As Object) As WixRichSelect   'i";
 //BA.debugLineNum = 99;BA.debugLine="RichSelect.SetAttr(\"validate\",v)";
_richselect._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("validate",_v);
 //BA.debugLineNum = 100;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _setvalidateevent(Object _e) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Sub SetValidateEvent(e As Object) As WixRichSelect";
 //BA.debugLineNum = 76;BA.debugLine="RichSelect.SetAttr(\"validateEvent\", e)";
_richselect._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("validateEvent",_e);
 //BA.debugLineNum = 77;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _setvalidateeventblur(boolean _b) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub SetValidateEventBlur(b As Boolean) As WixRichS";
 //BA.debugLineNum = 81;BA.debugLine="RichSelect.SetAttr(\"validateEvent\", \"blur\")";
_richselect._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("validateEvent",(Object)("blur"));
 //BA.debugLineNum = 82;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _setvalidateeventkey(boolean _b) throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Sub SetValidateEventKey(b As Boolean) As WixRichSe";
 //BA.debugLineNum = 86;BA.debugLine="RichSelect.SetAttr(\"validateEvent\", \"key\")";
_richselect._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("validateEvent",(Object)("key"));
 //BA.debugLineNum = 87;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _setvalidateisnotempty(boolean _b) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub SetValidateIsNotEmpty(b As Boolean) As WixRich";
 //BA.debugLineNum = 92;BA.debugLine="RichSelect.SetAttr(\"validate\",\"isNotEmpty\")";
_richselect._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("validate",(Object)("isNotEmpty"));
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 214;BA.debugLine="Sub SetValue(v As String) As WixRichSelect";
 //BA.debugLineNum = 215;BA.debugLine="RichSelect.SetValue(v)";
_richselect._setvalue /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_v);
 //BA.debugLineNum = 216;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 217;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _setwidth(Object _width) throws Exception{
 //BA.debugLineNum = 417;BA.debugLine="Sub SetWidth(width As Object) As WixRichSelect";
 //BA.debugLineNum = 418;BA.debugLine="RichSelect.SetAttr(\"width\", width)";
_richselect._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("width",_width);
 //BA.debugLineNum = 419;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichselect)(this);
 //BA.debugLineNum = 420;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
