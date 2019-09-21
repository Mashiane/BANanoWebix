package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixdatepicker extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixdatepicker", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixdatepicker.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _datepicker = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 296;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 297;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 298;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 301;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 302;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 303;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.Mashy.BANanoWebixDemo.wixform _frm) throws Exception{
 //BA.debugLineNum = 211;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 212;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 213;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 291;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 292;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 293;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public DatePicker As WixElement";
_datepicker = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _initialize(anywheresoftware.b4a.BA _ba,String _bid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(bID As String) As WixDatePic";
 //BA.debugLineNum = 10;BA.debugLine="ID = bID.ToLowerCase";
_id = _bid.toLowerCase();
 //BA.debugLineNum = 11;BA.debugLine="DatePicker.Initialize(ID).SetView(\"datepicker\")";
_datepicker._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_id)._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("datepicker");
 //BA.debugLineNum = 12;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 13;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 217;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 218;BA.debugLine="Return DatePicker.item";
if (true) return _datepicker._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 219;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 53;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _setalign(Object _align) throws Exception{
 //BA.debugLineNum = 306;BA.debugLine="Sub SetAlign(align As Object) As WixDatePicker";
 //BA.debugLineNum = 307;BA.debugLine="DatePicker.SetAttr(\"align\", align)";
_datepicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("align",_align);
 //BA.debugLineNum = 308;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 309;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 278;BA.debugLine="Sub SetAlignCenter(r As String) As WixDatePicker '";
 //BA.debugLineNum = 279;BA.debugLine="DatePicker.setAligncenter(\"\")";
_datepicker._setaligncenter /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 280;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 281;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 284;BA.debugLine="Sub SetAlignLeft(r As String) As WixDatePicker 'ig";
 //BA.debugLineNum = 285;BA.debugLine="DatePicker.SetAlignleft(\"\")";
_datepicker._setalignleft /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 286;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 287;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 272;BA.debugLine="Sub SetAlignRight(r As String) As WixDatePicker 'i";
 //BA.debugLineNum = 273;BA.debugLine="DatePicker.setAlignright(\"\")";
_datepicker._setalignright /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 274;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 275;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _setanimate(boolean _animate) throws Exception{
 //BA.debugLineNum = 311;BA.debugLine="Sub SetAnimate(animate As Boolean) As WixDatePicke";
 //BA.debugLineNum = 312;BA.debugLine="DatePicker.SetAttr(\"animate\", animate)";
_datepicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("animate",(Object)(_animate));
 //BA.debugLineNum = 313;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 314;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 17;BA.debugLine="Sub SetAttributes(m As Map) As WixDatePicker";
 //BA.debugLineNum = 18;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 19;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 20;BA.debugLine="DatePicker.SetAttr(k,v)";
_datepicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 22;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _setborderless(boolean _borderless) throws Exception{
 //BA.debugLineNum = 316;BA.debugLine="Sub SetBorderless(borderless As Boolean) As WixDat";
 //BA.debugLineNum = 317;BA.debugLine="DatePicker.SetAttr(\"borderless\", borderless)";
_datepicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("borderless",(Object)(_borderless));
 //BA.debugLineNum = 318;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 319;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _setbottomlabel(Object _bottomlabel) throws Exception{
 //BA.debugLineNum = 321;BA.debugLine="Sub SetBottomLabel(bottomLabel As Object) As WixDa";
 //BA.debugLineNum = 322;BA.debugLine="DatePicker.SetAttr(\"bottomLabel\", bottomLabel)";
_datepicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("bottomLabel",_bottomlabel);
 //BA.debugLineNum = 323;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 324;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _setbottompadding(Object _bottompadding) throws Exception{
 //BA.debugLineNum = 326;BA.debugLine="Sub SetBottomPadding(bottomPadding As Object) As W";
 //BA.debugLineNum = 327;BA.debugLine="DatePicker.SetAttr(\"bottomPadding\", bottomPadding";
_datepicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("bottomPadding",_bottompadding);
 //BA.debugLineNum = 328;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 329;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _setclick(Object _click) throws Exception{
 //BA.debugLineNum = 331;BA.debugLine="Sub SetClick(click As Object) As WixDatePicker";
 //BA.debugLineNum = 332;BA.debugLine="DatePicker.SetAttr(\"click\", click)";
_datepicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("click",_click);
 //BA.debugLineNum = 333;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 334;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _setcontainer(Object _container) throws Exception{
 //BA.debugLineNum = 336;BA.debugLine="Sub SetContainer(container As Object) As WixDatePi";
 //BA.debugLineNum = 337;BA.debugLine="DatePicker.SetAttr(\"container\", container)";
_datepicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("container",_container);
 //BA.debugLineNum = 338;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 339;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _setcss(Object _css) throws Exception{
 //BA.debugLineNum = 341;BA.debugLine="Sub SetCss(css As Object) As WixDatePicker";
 //BA.debugLineNum = 342;BA.debugLine="DatePicker.SetAttr(\"css\", css)";
_datepicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("css",_css);
 //BA.debugLineNum = 343;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 344;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _setdisabled(boolean _disabled) throws Exception{
 //BA.debugLineNum = 346;BA.debugLine="Sub SetDisabled(disabled As Boolean) As WixDatePic";
 //BA.debugLineNum = 347;BA.debugLine="DatePicker.SetAttr(\"disabled\", disabled)";
_datepicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("disabled",(Object)(_disabled));
 //BA.debugLineNum = 348;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 349;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _seteditable(boolean _b) throws Exception{
 //BA.debugLineNum = 199;BA.debugLine="Sub SetEditable(b As Boolean) As WixDatePicker";
 //BA.debugLineNum = 200;BA.debugLine="DatePicker.SetAttr(\"editable\", b)";
_datepicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("editable",(Object)(_b));
 //BA.debugLineNum = 201;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 202;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _setformat(Object _f) throws Exception{
 //BA.debugLineNum = 234;BA.debugLine="Sub SetFormat(f As Object) As WixDatePicker";
 //BA.debugLineNum = 235;BA.debugLine="DatePicker.SetAttr(\"format\", f)";
_datepicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("format",_f);
 //BA.debugLineNum = 236;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 237;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _setgravity(Object _gravity) throws Exception{
 //BA.debugLineNum = 351;BA.debugLine="Sub SetGravity(gravity As Object) As WixDatePicker";
 //BA.debugLineNum = 352;BA.debugLine="DatePicker.SetAttr(\"gravity\", gravity)";
_datepicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("gravity",_gravity);
 //BA.debugLineNum = 353;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 354;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _setheight(Object _height) throws Exception{
 //BA.debugLineNum = 356;BA.debugLine="Sub SetHeight(height As Object) As WixDatePicker";
 //BA.debugLineNum = 357;BA.debugLine="DatePicker.SetAttr(\"height\", height)";
_datepicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("height",_height);
 //BA.debugLineNum = 358;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 359;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _sethidden(boolean _hidden) throws Exception{
 //BA.debugLineNum = 361;BA.debugLine="Sub SetHidden(hidden As Boolean) As WixDatePicker";
 //BA.debugLineNum = 362;BA.debugLine="DatePicker.SetAttr(\"hidden\", hidden)";
_datepicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hidden",(Object)(_hidden));
 //BA.debugLineNum = 363;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 364;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _sethotkey(Object _hotkey) throws Exception{
 //BA.debugLineNum = 366;BA.debugLine="Sub SetHotkey(hotkey As Object) As WixDatePicker";
 //BA.debugLineNum = 367;BA.debugLine="DatePicker.SetAttr(\"hotkey\", hotkey)";
_datepicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hotkey",_hotkey);
 //BA.debugLineNum = 368;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 369;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _seticon(Object _icon) throws Exception{
 //BA.debugLineNum = 371;BA.debugLine="Sub SetIcon(icon As Object) As WixDatePicker";
 //BA.debugLineNum = 372;BA.debugLine="DatePicker.SetAttr(\"icon\", icon)";
_datepicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("icon",_icon);
 //BA.debugLineNum = 373;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 374;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _seticons(Object _icons) throws Exception{
 //BA.debugLineNum = 376;BA.debugLine="Sub SetIcons(icons As Object) As WixDatePicker";
 //BA.debugLineNum = 377;BA.debugLine="DatePicker.SetAttr(\"icons\", icons)";
_datepicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("icons",_icons);
 //BA.debugLineNum = 378;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 379;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _setinputalign(Object _inputalign) throws Exception{
 //BA.debugLineNum = 381;BA.debugLine="Sub SetInputAlign(inputAlign As Object) As WixDate";
 //BA.debugLineNum = 382;BA.debugLine="DatePicker.SetAttr(\"inputAlign\", inputAlign)";
_datepicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("inputAlign",_inputalign);
 //BA.debugLineNum = 383;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 384;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _setinputheight(Object _inputheight) throws Exception{
 //BA.debugLineNum = 386;BA.debugLine="Sub SetInputHeight(inputHeight As Object) As WixDa";
 //BA.debugLineNum = 387;BA.debugLine="DatePicker.SetAttr(\"inputHeight\", inputHeight)";
_datepicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("inputHeight",_inputheight);
 //BA.debugLineNum = 388;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 389;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _setinputwidth(Object _inputwidth) throws Exception{
 //BA.debugLineNum = 391;BA.debugLine="Sub SetInputWidth(inputWidth As Object) As WixDate";
 //BA.debugLineNum = 392;BA.debugLine="DatePicker.SetAttr(\"inputWidth\", inputWidth)";
_datepicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("inputWidth",_inputwidth);
 //BA.debugLineNum = 393;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 394;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _setinvalid(Object _invalid) throws Exception{
 //BA.debugLineNum = 396;BA.debugLine="Sub SetInvalid(invalid As Object) As WixDatePicker";
 //BA.debugLineNum = 397;BA.debugLine="DatePicker.SetAttr(\"invalid\", invalid)";
_datepicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("invalid",_invalid);
 //BA.debugLineNum = 398;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 399;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _setinvalidmessage(String _msg) throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Sub SetInvalidMessage(msg As String) As WixDatePic";
 //BA.debugLineNum = 100;BA.debugLine="DatePicker.SetAttr(\"invalidMessage\", msg)";
_datepicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("invalidMessage",(Object)(_msg));
 //BA.debugLineNum = 101;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 228;BA.debugLine="Sub SetLabel(l As String) As WixDatePicker";
 //BA.debugLineNum = 229;BA.debugLine="DatePicker.SetLabel(l)";
_datepicker._setlabel /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_l);
 //BA.debugLineNum = 230;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 231;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _setlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 253;BA.debugLine="Sub SetLabelAlign(a As String) As WixDatePicker";
 //BA.debugLineNum = 254;BA.debugLine="DatePicker.SetLabelAlign(a)";
_datepicker._setlabelalign /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_a);
 //BA.debugLineNum = 255;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 256;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _setlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 259;BA.debugLine="Sub SetLabelPosition(p As String) As WixDatePicker";
 //BA.debugLineNum = 260;BA.debugLine="DatePicker.SetLabelPosition(p)";
_datepicker._setlabelposition /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_p);
 //BA.debugLineNum = 261;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 262;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _setlabelwidth(int _w) throws Exception{
 //BA.debugLineNum = 265;BA.debugLine="Sub SetLabelWidth(w As Int) As WixDatePicker";
 //BA.debugLineNum = 266;BA.debugLine="DatePicker.SetLabelWidth(w)";
_datepicker._setlabelwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 267;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 268;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 189;BA.debugLine="Sub SetMap(m As Map) As WixDatePicker";
 //BA.debugLineNum = 190;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 191;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 192;BA.debugLine="DatePicker.SetAttr(strKey,	strVal)";
_datepicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 194;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 195;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Sub SetMargin(margin As Object) As WixDatePicker";
 //BA.debugLineNum = 41;BA.debugLine="DatePicker.SetMargin(margin)";
_datepicker._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 42;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _setmaxheight(Object _maxheight) throws Exception{
 //BA.debugLineNum = 401;BA.debugLine="Sub SetMaxHeight(maxHeight As Object) As WixDatePi";
 //BA.debugLineNum = 402;BA.debugLine="DatePicker.SetAttr(\"maxHeight\", maxHeight)";
_datepicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxHeight",_maxheight);
 //BA.debugLineNum = 403;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 404;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _setmaxwidth(Object _maxwidth) throws Exception{
 //BA.debugLineNum = 406;BA.debugLine="Sub SetMaxWidth(maxWidth As Object) As WixDatePick";
 //BA.debugLineNum = 407;BA.debugLine="DatePicker.SetAttr(\"maxWidth\", maxWidth)";
_datepicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxWidth",_maxwidth);
 //BA.debugLineNum = 408;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 409;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 183;BA.debugLine="Sub SetMinHeight(h As Int) As WixDatePicker";
 //BA.debugLineNum = 184;BA.debugLine="DatePicker.SetMinHeight(h)";
_datepicker._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 185;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 186;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 177;BA.debugLine="Sub SetMinWidth(w As Int) As WixDatePicker";
 //BA.debugLineNum = 178;BA.debugLine="DatePicker.SetMinWidth(w)";
_datepicker._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 179;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _setmultiselect(Object _b) throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Sub SetMultiselect(b As Object) As WixDatePicker";
 //BA.debugLineNum = 118;BA.debugLine="DatePicker.SetAttr(\"multiselect\",b)";
_datepicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("multiselect",_b);
 //BA.debugLineNum = 119;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _setname(String _n) throws Exception{
 //BA.debugLineNum = 158;BA.debugLine="Sub SetName(n As String) As WixDatePicker";
 //BA.debugLineNum = 159;BA.debugLine="DatePicker.SetName(n)";
_datepicker._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 160;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub SetPadding(padding As Object) As WixDatePicker";
 //BA.debugLineNum = 35;BA.debugLine="DatePicker.SetPadding(padding)";
_datepicker._setpadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Sub SetParent(p As WixElement) As WixDatePicker";
 //BA.debugLineNum = 64;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 65;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _setplaceholder(Object _b) throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Sub SetPlaceHolder(b As Object) As WixDatePicker";
 //BA.debugLineNum = 113;BA.debugLine="DatePicker.SetPlaceHolder(b)";
_datepicker._setplaceholder /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_b));
 //BA.debugLineNum = 114;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _setpoint(boolean _point) throws Exception{
 //BA.debugLineNum = 411;BA.debugLine="Sub SetPoint(point As Boolean) As WixDatePicker";
 //BA.debugLineNum = 412;BA.debugLine="DatePicker.SetAttr(\"point\", point)";
_datepicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("point",(Object)(_point));
 //BA.debugLineNum = 413;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 414;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _setpopup(Object _popup) throws Exception{
 //BA.debugLineNum = 416;BA.debugLine="Sub SetPopup(popup As Object) As WixDatePicker";
 //BA.debugLineNum = 417;BA.debugLine="DatePicker.SetAttr(\"popup\", popup)";
_datepicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("popup",_popup);
 //BA.debugLineNum = 418;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 419;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _setreadonly(boolean _readonly) throws Exception{
 //BA.debugLineNum = 421;BA.debugLine="Sub SetReadonly(readonly As Boolean) As WixDatePic";
 //BA.debugLineNum = 422;BA.debugLine="DatePicker.SetAttr(\"readonly\", readonly)";
_datepicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("readonly",(Object)(_readonly));
 //BA.debugLineNum = 423;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 424;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _setrelatedaction(Object _relatedaction) throws Exception{
 //BA.debugLineNum = 426;BA.debugLine="Sub SetRelatedAction(relatedAction As Object) As W";
 //BA.debugLineNum = 427;BA.debugLine="DatePicker.SetAttr(\"relatedAction\", relatedAction)";
_datepicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("relatedAction",_relatedaction);
 //BA.debugLineNum = 428;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 429;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _setrelatedview(Object _relatedview) throws Exception{
 //BA.debugLineNum = 431;BA.debugLine="Sub SetRelatedView(relatedView As Object) As WixDa";
 //BA.debugLineNum = 432;BA.debugLine="DatePicker.SetAttr(\"relatedView\", relatedView)";
_datepicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("relatedView",_relatedview);
 //BA.debugLineNum = 433;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 434;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _setrequired(boolean _b) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Sub SetRequired(b As Boolean) As WixDatePicker";
 //BA.debugLineNum = 107;BA.debugLine="DatePicker.SetAttr(\"required\", b)";
_datepicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("required",(Object)(_b));
 //BA.debugLineNum = 108;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 164;BA.debugLine="Sub SetResponsive(b As Object) As WixDatePicker";
 //BA.debugLineNum = 165;BA.debugLine="DatePicker.SetResponsive(b)";
_datepicker._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 166;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 167;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 170;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixDatePicke";
 //BA.debugLineNum = 171;BA.debugLine="DatePicker.SetResponsiveCell(b)";
_datepicker._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 172;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _setseparator(Object _separator) throws Exception{
 //BA.debugLineNum = 436;BA.debugLine="Sub SetSeparator(separator As Object) As WixDatePi";
 //BA.debugLineNum = 437;BA.debugLine="DatePicker.SetAttr(\"separator\", separator)";
_datepicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("separator",_separator);
 //BA.debugLineNum = 438;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 439;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _setstringresult(boolean _b) throws Exception{
 //BA.debugLineNum = 144;BA.debugLine="Sub SetStringResult(b As Boolean) As WixDatePicker";
 //BA.debugLineNum = 145;BA.debugLine="DatePicker.SetAttr(\"stringResult\", b)";
_datepicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("stringResult",(Object)(_b));
 //BA.debugLineNum = 146;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 47;BA.debugLine="DatePicker.SetStyle(prop,sval)";
_datepicker._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 48;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 25;BA.debugLine="Sub SetStyles(m As Map) As WixDatePicker";
 //BA.debugLineNum = 26;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 27;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 28;BA.debugLine="DatePicker.SetStyle(k,v)";
_datepicker._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 30;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _setsuggest(Object _suggest) throws Exception{
 //BA.debugLineNum = 441;BA.debugLine="Sub SetSuggest(suggest As Object) As WixDatePicker";
 //BA.debugLineNum = 442;BA.debugLine="DatePicker.SetAttr(\"suggest\", suggest)";
_datepicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("suggest",_suggest);
 //BA.debugLineNum = 443;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 444;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 150;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixDatePic";
 //BA.debugLineNum = 151;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 152;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 153;BA.debugLine="DatePicker.SetTemplate(os)";
_datepicker._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 154;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _settimeicon(Object _timeicon) throws Exception{
 //BA.debugLineNum = 446;BA.debugLine="Sub SetTimeIcon(timeIcon As Object) As WixDatePick";
 //BA.debugLineNum = 447;BA.debugLine="DatePicker.SetAttr(\"timeIcon\", timeIcon)";
_datepicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("timeIcon",_timeicon);
 //BA.debugLineNum = 448;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 449;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _settimepicker(boolean _t) throws Exception{
 //BA.debugLineNum = 240;BA.debugLine="Sub SetTimePicker(t As Boolean) As WixDatePicker";
 //BA.debugLineNum = 241;BA.debugLine="DatePicker.SetAttr(\"timepicker\", t)";
_datepicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("timepicker",(Object)(_t));
 //BA.debugLineNum = 242;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 243;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 205;BA.debugLine="Sub SetTooltip(tt As String) As WixDatePicker";
 //BA.debugLineNum = 206;BA.debugLine="DatePicker.SetTooltip(tt)";
_datepicker._settooltip /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_tt);
 //BA.debugLineNum = 207;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 208;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _settype(Object _b) throws Exception{
 //BA.debugLineNum = 137;BA.debugLine="Sub SetType(b As Object) As WixDatePicker   'ignor";
 //BA.debugLineNum = 138;BA.debugLine="DatePicker.SetAttr(\"type\", b)";
_datepicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("type",_b);
 //BA.debugLineNum = 139;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _settypemonth(boolean _b) throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Sub SetTypeMonth(b As Boolean) As WixDatePicker";
 //BA.debugLineNum = 124;BA.debugLine="DatePicker.SetAttr(\"type\", \"month\")";
_datepicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("type",(Object)("month"));
 //BA.debugLineNum = 125;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _settypetime(boolean _b) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub SetTypeTime(b As Boolean) As WixDatePicker   '";
 //BA.debugLineNum = 58;BA.debugLine="DatePicker.SetAttr(\"type\", \"time\")";
_datepicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("type",(Object)("time"));
 //BA.debugLineNum = 59;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _settypeyear(boolean _b) throws Exception{
 //BA.debugLineNum = 130;BA.debugLine="Sub SetTypeYear(b As Boolean) As WixDatePicker   '";
 //BA.debugLineNum = 131;BA.debugLine="DatePicker.SetAttr(\"type\", \"year\")";
_datepicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("type",(Object)("year"));
 //BA.debugLineNum = 132;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _setvalidate(Object _v) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Sub SetValidate(v As Object) As WixDatePicker   'i";
 //BA.debugLineNum = 93;BA.debugLine="DatePicker.SetAttr(\"validate\",v)";
_datepicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("validate",_v);
 //BA.debugLineNum = 94;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _setvalidateevent(Object _e) throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Sub SetValidateEvent(e As Object) As WixDatePicker";
 //BA.debugLineNum = 70;BA.debugLine="DatePicker.SetAttr(\"validateEvent\", e)";
_datepicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("validateEvent",_e);
 //BA.debugLineNum = 71;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _setvalidateeventblur(boolean _b) throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Sub SetValidateEventBlur(b As Boolean) As WixDateP";
 //BA.debugLineNum = 75;BA.debugLine="DatePicker.SetAttr(\"validateEvent\", \"blur\")";
_datepicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("validateEvent",(Object)("blur"));
 //BA.debugLineNum = 76;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _setvalidateeventkey(boolean _b) throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Sub SetValidateEventKey(b As Boolean) As WixDatePi";
 //BA.debugLineNum = 80;BA.debugLine="DatePicker.SetAttr(\"validateEvent\", \"key\")";
_datepicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("validateEvent",(Object)("key"));
 //BA.debugLineNum = 81;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _setvalidateisnotempty(boolean _b) throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Sub SetValidateIsNotEmpty(b As Boolean) As WixDate";
 //BA.debugLineNum = 86;BA.debugLine="DatePicker.SetAttr(\"validate\",\"isNotEmpty\")";
_datepicker._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("validate",(Object)("isNotEmpty"));
 //BA.debugLineNum = 87;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 222;BA.debugLine="Sub SetValue(v As String) As WixDatePicker";
 //BA.debugLineNum = 223;BA.debugLine="DatePicker.SetValue(v)";
_datepicker._setvalue /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_v);
 //BA.debugLineNum = 224;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 225;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 246;BA.debugLine="Sub SetWidth(w As Object) As WixDatePicker";
 //BA.debugLineNum = 247;BA.debugLine="DatePicker.SetWidth(w)";
_datepicker._setwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 248;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatepicker)(this);
 //BA.debugLineNum = 249;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
