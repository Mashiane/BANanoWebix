package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixcombo extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixcombo", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixcombo.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _combo = null;
public anywheresoftware.b4a.objects.collections.List _options = null;
public int _ycount = 0;
public anywheresoftware.b4a.objects.collections.Map _opt = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public b4j.Mashy.BANanoWebixDemo.wixcombo  _addoption(String _optid,String _optvalue) throws Exception{
 //BA.debugLineNum = 211;BA.debugLine="Sub AddOption(optID As String, optValue As String)";
 //BA.debugLineNum = 212;BA.debugLine="Options.Add(CreateMap(\"id\":optID,\"value\":optValue";
_options.Add((Object)(__c.createMap(new Object[] {(Object)("id"),(Object)(_optid),(Object)("value"),(Object)(_optvalue)}).getObject()));
 //BA.debugLineNum = 213;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 214;BA.debugLine="End Sub";
return null;
}
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 297;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 298;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 299;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 302;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 303;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 304;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.Mashy.BANanoWebixDemo.wixform _frm) throws Exception{
 //BA.debugLineNum = 151;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 152;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 292;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 293;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 294;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Combo As WixElement";
_combo = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private Options As List";
_options = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 6;BA.debugLine="Private yCount As Int";
_ycount = 0;
 //BA.debugLineNum = 7;BA.debugLine="Private opt As Map";
_opt = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 8;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _initialize(anywheresoftware.b4a.BA _ba,String _iid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize(iID As String) As WixCombo";
 //BA.debugLineNum = 13;BA.debugLine="ID = iID.tolowercase";
_id = _iid.toLowerCase();
 //BA.debugLineNum = 14;BA.debugLine="Combo.Initialize(iID).SetView(\"combo\")";
_combo._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_iid)._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("combo");
 //BA.debugLineNum = 15;BA.debugLine="Options.Initialize";
_options.Initialize();
 //BA.debugLineNum = 16;BA.debugLine="yCount = 0";
_ycount = (int) (0);
 //BA.debugLineNum = 17;BA.debugLine="opt = CreateMap()";
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 18;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 19;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 190;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 191;BA.debugLine="opt.Put(\"data\", Options)";
_opt.Put((Object)("data"),(Object)(_options.getObject()));
 //BA.debugLineNum = 192;BA.debugLine="If yCount <> 0 Then opt.Put(\"yCount\",yCount)";
if (_ycount!=0) { 
_opt.Put((Object)("yCount"),(Object)(_ycount));};
 //BA.debugLineNum = 193;BA.debugLine="Combo.SetAttr(\"options\", opt)";
_combo._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("options",(Object)(_opt.getObject()));
 //BA.debugLineNum = 194;BA.debugLine="Return Combo.item";
if (true) return _combo._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 195;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 59;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _setalign(Object _align) throws Exception{
 //BA.debugLineNum = 306;BA.debugLine="Sub SetAlign(align As Object) As WixCombo";
 //BA.debugLineNum = 307;BA.debugLine="Combo.SetAttr(\"align\", align)";
_combo._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("align",_align);
 //BA.debugLineNum = 308;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 309;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 273;BA.debugLine="Sub SetAlignCenter(r As String) As WixCombo 'ignor";
 //BA.debugLineNum = 274;BA.debugLine="Combo.setAligncenter(\"\")";
_combo._setaligncenter /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 275;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 276;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 279;BA.debugLine="Sub SetAlignLeft(r As String) As WixCombo 'ignore";
 //BA.debugLineNum = 280;BA.debugLine="Combo.SetAlignleft(\"\")";
_combo._setalignleft /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 281;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 282;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 267;BA.debugLine="Sub SetAlignRight(r As String) As WixCombo 'ignore";
 //BA.debugLineNum = 268;BA.debugLine="Combo.setAlignright(\"\")";
_combo._setalignright /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 269;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 270;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _setanimate(boolean _animate) throws Exception{
 //BA.debugLineNum = 311;BA.debugLine="Sub SetAnimate(animate As Boolean) As WixCombo";
 //BA.debugLineNum = 312;BA.debugLine="Combo.SetAttr(\"animate\", animate)";
_combo._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("animate",(Object)(_animate));
 //BA.debugLineNum = 313;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 314;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 41;BA.debugLine="Sub SetAttributes(m As Map) As WixCombo";
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
 //BA.debugLineNum = 44;BA.debugLine="Combo.SetAttr(k,v)";
_combo._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 46;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _setborderless(boolean _borderless) throws Exception{
 //BA.debugLineNum = 316;BA.debugLine="Sub SetBorderless(borderless As Boolean) As WixCom";
 //BA.debugLineNum = 317;BA.debugLine="Combo.SetAttr(\"borderless\", borderless)";
_combo._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("borderless",(Object)(_borderless));
 //BA.debugLineNum = 318;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 319;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _setbottomlabel(Object _f) throws Exception{
 //BA.debugLineNum = 236;BA.debugLine="Sub SetBottomLabel(f As Object) As WixCombo";
 //BA.debugLineNum = 237;BA.debugLine="Combo.SetAttr(\"bottomLabel\", f)";
_combo._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("bottomLabel",_f);
 //BA.debugLineNum = 238;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 239;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _setbottompadding(Object _f) throws Exception{
 //BA.debugLineNum = 242;BA.debugLine="Sub SetBottomPadding(f As Object) As WixCombo";
 //BA.debugLineNum = 243;BA.debugLine="Combo.SetAttr(\"bottomPadding\", f)";
_combo._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("bottomPadding",_f);
 //BA.debugLineNum = 244;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 245;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _setclick(Object _click) throws Exception{
 //BA.debugLineNum = 321;BA.debugLine="Sub SetClick(click As Object) As WixCombo";
 //BA.debugLineNum = 322;BA.debugLine="Combo.SetAttr(\"click\", click)";
_combo._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("click",_click);
 //BA.debugLineNum = 323;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 324;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _setcontainer(Object _container) throws Exception{
 //BA.debugLineNum = 326;BA.debugLine="Sub SetContainer(container As Object) As WixCombo";
 //BA.debugLineNum = 327;BA.debugLine="Combo.SetAttr(\"container\", container)";
_combo._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("container",_container);
 //BA.debugLineNum = 328;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 329;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _setcss(Object _css) throws Exception{
 //BA.debugLineNum = 331;BA.debugLine="Sub SetCss(css As Object) As WixCombo";
 //BA.debugLineNum = 332;BA.debugLine="Combo.SetAttr(\"css\", css)";
_combo._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("css",_css);
 //BA.debugLineNum = 333;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 334;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _setdisabled(boolean _disabled) throws Exception{
 //BA.debugLineNum = 336;BA.debugLine="Sub SetDisabled(disabled As Boolean) As WixCombo";
 //BA.debugLineNum = 337;BA.debugLine="Combo.SetAttr(\"disabled\", disabled)";
_combo._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("disabled",(Object)(_disabled));
 //BA.debugLineNum = 338;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 339;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _seteditable(boolean _editable) throws Exception{
 //BA.debugLineNum = 341;BA.debugLine="Sub SetEditable(editable As Boolean) As WixCombo";
 //BA.debugLineNum = 342;BA.debugLine="Combo.SetAttr(\"editable\", editable)";
_combo._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("editable",(Object)(_editable));
 //BA.debugLineNum = 343;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 344;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _setformat(Object _format) throws Exception{
 //BA.debugLineNum = 346;BA.debugLine="Sub SetFormat(format As Object) As WixCombo";
 //BA.debugLineNum = 347;BA.debugLine="Combo.SetAttr(\"format\", format)";
_combo._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("format",_format);
 //BA.debugLineNum = 348;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 349;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _setgravity(Object _gravity) throws Exception{
 //BA.debugLineNum = 351;BA.debugLine="Sub SetGravity(gravity As Object) As WixCombo";
 //BA.debugLineNum = 352;BA.debugLine="Combo.SetAttr(\"gravity\", gravity)";
_combo._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("gravity",_gravity);
 //BA.debugLineNum = 353;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 354;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _setheight(Object _height) throws Exception{
 //BA.debugLineNum = 356;BA.debugLine="Sub SetHeight(height As Object) As WixCombo";
 //BA.debugLineNum = 357;BA.debugLine="Combo.SetAttr(\"height\", height)";
_combo._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("height",_height);
 //BA.debugLineNum = 358;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 359;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _sethidden(boolean _hidden) throws Exception{
 //BA.debugLineNum = 361;BA.debugLine="Sub SetHidden(hidden As Boolean) As WixCombo";
 //BA.debugLineNum = 362;BA.debugLine="Combo.SetAttr(\"hidden\", hidden)";
_combo._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hidden",(Object)(_hidden));
 //BA.debugLineNum = 363;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 364;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _sethotkey(Object _hotkey) throws Exception{
 //BA.debugLineNum = 366;BA.debugLine="Sub SetHotkey(hotkey As Object) As WixCombo";
 //BA.debugLineNum = 367;BA.debugLine="Combo.SetAttr(\"hotkey\", hotkey)";
_combo._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hotkey",_hotkey);
 //BA.debugLineNum = 368;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 369;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _seticon(Object _icon) throws Exception{
 //BA.debugLineNum = 371;BA.debugLine="Sub SetIcon(icon As Object) As WixCombo";
 //BA.debugLineNum = 372;BA.debugLine="Combo.SetAttr(\"icon\", icon)";
_combo._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("icon",_icon);
 //BA.debugLineNum = 373;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 374;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _setinputalign(Object _inputalign) throws Exception{
 //BA.debugLineNum = 376;BA.debugLine="Sub SetInputAlign(inputAlign As Object) As WixComb";
 //BA.debugLineNum = 377;BA.debugLine="Combo.SetAttr(\"inputAlign\", inputAlign)";
_combo._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("inputAlign",_inputalign);
 //BA.debugLineNum = 378;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 379;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _setinputheight(Object _inputheight) throws Exception{
 //BA.debugLineNum = 381;BA.debugLine="Sub SetInputHeight(inputHeight As Object) As WixCo";
 //BA.debugLineNum = 382;BA.debugLine="Combo.SetAttr(\"inputHeight\", inputHeight)";
_combo._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("inputHeight",_inputheight);
 //BA.debugLineNum = 383;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 384;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _setinputwidth(Object _inputwidth) throws Exception{
 //BA.debugLineNum = 386;BA.debugLine="Sub SetInputWidth(inputWidth As Object) As WixComb";
 //BA.debugLineNum = 387;BA.debugLine="Combo.SetAttr(\"inputWidth\", inputWidth)";
_combo._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("inputWidth",_inputwidth);
 //BA.debugLineNum = 388;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 389;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _setinvalid(Object _invalid) throws Exception{
 //BA.debugLineNum = 391;BA.debugLine="Sub SetInvalid(invalid As Object) As WixCombo";
 //BA.debugLineNum = 392;BA.debugLine="Combo.SetAttr(\"invalid\", invalid)";
_combo._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("invalid",_invalid);
 //BA.debugLineNum = 393;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 394;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _setinvalidmessage(String _msg) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Sub SetInvalidMessage(msg As String) As WixCombo";
 //BA.debugLineNum = 93;BA.debugLine="Combo.SetAttr(\"invalidMessage\", msg)";
_combo._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("invalidMessage",(Object)(_msg));
 //BA.debugLineNum = 94;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 229;BA.debugLine="Sub SetLabel(l As String) As WixCombo";
 //BA.debugLineNum = 230;BA.debugLine="Combo.SetLabel(l)";
_combo._setlabel /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_l);
 //BA.debugLineNum = 231;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 232;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _setlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 248;BA.debugLine="Sub SetLabelAlign(a As String) As WixCombo";
 //BA.debugLineNum = 249;BA.debugLine="Combo.SetLabelAlign(a)";
_combo._setlabelalign /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_a);
 //BA.debugLineNum = 250;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 251;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _setlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 254;BA.debugLine="Sub SetLabelPosition(p As String) As WixCombo";
 //BA.debugLineNum = 255;BA.debugLine="Combo.SetLabelPosition(p)";
_combo._setlabelposition /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_p);
 //BA.debugLineNum = 256;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 257;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _setlabelwidth(int _w) throws Exception{
 //BA.debugLineNum = 260;BA.debugLine="Sub SetLabelWidth(w As Int) As WixCombo";
 //BA.debugLineNum = 261;BA.debugLine="Combo.SetLabelWidth(w)";
_combo._setlabelwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 262;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 263;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 162;BA.debugLine="Sub SetMap(m As Map) As WixCombo";
 //BA.debugLineNum = 163;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 164;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 165;BA.debugLine="Combo.SetAttr(strKey,	strVal)";
_combo._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 167;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Sub SetMargin(margin As Object) As WixCombo";
 //BA.debugLineNum = 30;BA.debugLine="Combo.SetMargin(margin)";
_combo._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _setmaxheight(Object _maxheight) throws Exception{
 //BA.debugLineNum = 396;BA.debugLine="Sub SetMaxHeight(maxHeight As Object) As WixCombo";
 //BA.debugLineNum = 397;BA.debugLine="Combo.SetAttr(\"maxHeight\", maxHeight)";
_combo._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxHeight",_maxheight);
 //BA.debugLineNum = 398;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 399;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _setmaxwidth(Object _maxwidth) throws Exception{
 //BA.debugLineNum = 401;BA.debugLine="Sub SetMaxWidth(maxWidth As Object) As WixCombo";
 //BA.debugLineNum = 402;BA.debugLine="Combo.SetAttr(\"maxWidth\", maxWidth)";
_combo._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxWidth",_maxwidth);
 //BA.debugLineNum = 403;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 404;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 145;BA.debugLine="Sub SetMinHeight(h As Int) As WixCombo";
 //BA.debugLineNum = 146;BA.debugLine="Combo.SetMinHeight(h)";
_combo._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 147;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 139;BA.debugLine="Sub SetMinWidth(w As Int) As WixCombo";
 //BA.debugLineNum = 140;BA.debugLine="Combo.SetMinWidth(w)";
_combo._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 141;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _setname(String _n) throws Exception{
 //BA.debugLineNum = 126;BA.debugLine="Sub SetName(n As String) As WixCombo";
 //BA.debugLineNum = 127;BA.debugLine="Combo.SetName(n)";
_combo._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 128;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _setoptions(anywheresoftware.b4a.objects.collections.List _o) throws Exception{
 //BA.debugLineNum = 172;BA.debugLine="Sub SetOptions(o As List) As WixCombo";
 //BA.debugLineNum = 173;BA.debugLine="Options = o";
_options = _o;
 //BA.debugLineNum = 174;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _setoptionsjson(String _json) throws Exception{
 //BA.debugLineNum = 197;BA.debugLine="Sub SetOptionsJSON(json As String) As WixCombo";
 //BA.debugLineNum = 198;BA.debugLine="Combo.SetOptionsJSON(json)";
_combo._setoptionsjson /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_json);
 //BA.debugLineNum = 199;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 200;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _setoptionsmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _mk = "";
Object _mv = null;
 //BA.debugLineNum = 202;BA.debugLine="Sub SetOptionsMAP(m As Map) As WixCombo";
 //BA.debugLineNum = 203;BA.debugLine="For Each mk As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_mk = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 204;BA.debugLine="Dim mv As Object = m.Get(mk)";
_mv = _m.Get((Object)(_mk));
 //BA.debugLineNum = 205;BA.debugLine="AddOption(mk, mv)";
_addoption(_mk,BA.ObjectToString(_mv));
 }
};
 //BA.debugLineNum = 207;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 208;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Sub SetPadding(padding As Object) As WixCombo";
 //BA.debugLineNum = 24;BA.debugLine="Combo.SetPadding(padding)";
_combo._setpadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 25;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Sub SetParent(p As WixElement) As WixCombo";
 //BA.debugLineNum = 36;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 37;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _setplaceholder(String _ph) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Sub SetPlaceHolder(ph As String) As WixCombo";
 //BA.debugLineNum = 107;BA.debugLine="Combo.SetPlaceHolder(ph)";
_combo._setplaceholder /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_ph);
 //BA.debugLineNum = 108;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _setpopup(Object _popup) throws Exception{
 //BA.debugLineNum = 406;BA.debugLine="Sub SetPopup(popup As Object) As WixCombo";
 //BA.debugLineNum = 407;BA.debugLine="Combo.SetAttr(\"popup\", popup)";
_combo._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("popup",_popup);
 //BA.debugLineNum = 408;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 409;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _setpopupwidth(Object _popupwidth) throws Exception{
 //BA.debugLineNum = 411;BA.debugLine="Sub SetPopupWidth(popupWidth As Object) As WixComb";
 //BA.debugLineNum = 412;BA.debugLine="Combo.SetAttr(\"popupWidth\", popupWidth)";
_combo._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("popupWidth",_popupwidth);
 //BA.debugLineNum = 413;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 414;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _setreadonly(boolean _readonly) throws Exception{
 //BA.debugLineNum = 416;BA.debugLine="Sub SetReadonly(readonly As Boolean) As WixCombo";
 //BA.debugLineNum = 417;BA.debugLine="Combo.SetAttr(\"readonly\", readonly)";
_combo._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("readonly",(Object)(_readonly));
 //BA.debugLineNum = 418;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 419;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _setrelatedaction(Object _relatedaction) throws Exception{
 //BA.debugLineNum = 421;BA.debugLine="Sub SetRelatedAction(relatedAction As Object) As W";
 //BA.debugLineNum = 422;BA.debugLine="Combo.SetAttr(\"relatedAction\", relatedAction)";
_combo._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("relatedAction",_relatedaction);
 //BA.debugLineNum = 423;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 424;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _setrelatedview(Object _relatedview) throws Exception{
 //BA.debugLineNum = 426;BA.debugLine="Sub SetRelatedView(relatedView As Object) As WixCo";
 //BA.debugLineNum = 427;BA.debugLine="Combo.SetAttr(\"relatedView\", relatedView)";
_combo._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("relatedView",_relatedview);
 //BA.debugLineNum = 428;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 429;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _setrequired(boolean _b) throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Sub SetRequired(b As Boolean) As WixCombo";
 //BA.debugLineNum = 100;BA.debugLine="Combo.SetAttr(\"required\", b)";
_combo._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("required",(Object)(_b));
 //BA.debugLineNum = 101;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Sub SetResponsive(b As Object) As WixCombo";
 //BA.debugLineNum = 120;BA.debugLine="Combo.SetResponsive(b)";
_combo._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 121;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 132;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixCombo";
 //BA.debugLineNum = 133;BA.debugLine="Combo.SetResponsiveCell(b)";
_combo._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 134;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 178;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 179;BA.debugLine="Combo.SetStyle(prop,val)";
_combo._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 180;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 181;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 49;BA.debugLine="Sub SetStyles(m As Map) As WixCombo";
 //BA.debugLineNum = 50;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 51;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 52;BA.debugLine="Combo.SetStyle(k,v)";
_combo._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _setsuggest(Object _s) throws Exception{
 //BA.debugLineNum = 285;BA.debugLine="Sub SetSuggest(s As Object) As WixCombo";
 //BA.debugLineNum = 286;BA.debugLine="Combo.setSuggest(s)";
_combo._setsuggest /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_s);
 //BA.debugLineNum = 287;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 288;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _settemplate(String _t) throws Exception{
 //BA.debugLineNum = 184;BA.debugLine="Sub SetTemplate(t As String) As WixCombo";
 //BA.debugLineNum = 185;BA.debugLine="opt.Put(\"template\", t)";
_opt.Put((Object)("template"),(Object)(_t));
 //BA.debugLineNum = 186;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 187;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 111;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixCombo";
 //BA.debugLineNum = 112;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 113;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 114;BA.debugLine="Combo.SetTemplate(os)";
_combo._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 115;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 156;BA.debugLine="Sub SetTooltip(tt As String) As WixCombo";
 //BA.debugLineNum = 157;BA.debugLine="Combo.SetTooltip(tt)";
_combo._settooltip /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_tt);
 //BA.debugLineNum = 158;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _settype(Object _stype) throws Exception{
 //BA.debugLineNum = 431;BA.debugLine="Sub SetType(sType As Object) As WixCombo";
 //BA.debugLineNum = 432;BA.debugLine="Combo.SetAttr(\"type\", sType)";
_combo._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("type",_stype);
 //BA.debugLineNum = 433;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 434;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _setvalidate(Object _v) throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Sub SetValidate(v As Object) As WixCombo   'ignore";
 //BA.debugLineNum = 86;BA.debugLine="Combo.SetAttr(\"validate\",v)";
_combo._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("validate",_v);
 //BA.debugLineNum = 87;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _setvalidateevent(Object _e) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Sub SetValidateEvent(e As Object) As WixCombo    '";
 //BA.debugLineNum = 63;BA.debugLine="Combo.SetAttr(\"validateEvent\", e)";
_combo._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("validateEvent",_e);
 //BA.debugLineNum = 64;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _setvalidateeventblur(boolean _b) throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Sub SetValidateEventBlur(b As Boolean) As WixCombo";
 //BA.debugLineNum = 68;BA.debugLine="Combo.SetAttr(\"validateEvent\", \"blur\")";
_combo._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("validateEvent",(Object)("blur"));
 //BA.debugLineNum = 69;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _setvalidateeventkey(boolean _b) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Sub SetValidateEventKey(b As Boolean) As WixCombo";
 //BA.debugLineNum = 73;BA.debugLine="Combo.SetAttr(\"validateEvent\", \"key\")";
_combo._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("validateEvent",(Object)("key"));
 //BA.debugLineNum = 74;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _setvalidateisnotempty(boolean _b) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub SetValidateIsNotEmpty(b As Boolean) As WixComb";
 //BA.debugLineNum = 79;BA.debugLine="Combo.SetAttr(\"validate\",\"isNotEmpty\")";
_combo._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("validate",(Object)("isNotEmpty"));
 //BA.debugLineNum = 80;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 223;BA.debugLine="Sub SetValue(v As String) As WixCombo";
 //BA.debugLineNum = 224;BA.debugLine="Combo.SetValue(v)";
_combo._setvalue /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_v);
 //BA.debugLineNum = 225;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 226;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _setwidth(Object _width) throws Exception{
 //BA.debugLineNum = 436;BA.debugLine="Sub SetWidth(width As Object) As WixCombo";
 //BA.debugLineNum = 437;BA.debugLine="Combo.SetAttr(\"width\", width)";
_combo._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("width",_width);
 //BA.debugLineNum = 438;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 439;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _setycount(int _y) throws Exception{
 //BA.debugLineNum = 217;BA.debugLine="Sub SetYCount(y As Int) As WixCombo";
 //BA.debugLineNum = 218;BA.debugLine="yCount = y";
_ycount = _y;
 //BA.debugLineNum = 219;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcombo)(this);
 //BA.debugLineNum = 220;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
