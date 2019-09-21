package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixtext extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixtext", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixtext.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _text = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _xparent) throws Exception{
 //BA.debugLineNum = 430;BA.debugLine="Sub AddToColumns(xParent As WixElement)";
 //BA.debugLineNum = 431;BA.debugLine="xParent.AddColumns(Item)";
_xparent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 432;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _xparent) throws Exception{
 //BA.debugLineNum = 435;BA.debugLine="Sub AddToElements(xParent As WixElement)";
 //BA.debugLineNum = 436;BA.debugLine="xParent.AddElements(Item)";
_xparent._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 437;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.Mashy.BANanoWebixDemo.wixform _frm) throws Exception{
 //BA.debugLineNum = 247;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 248;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 249;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _xparent) throws Exception{
 //BA.debugLineNum = 425;BA.debugLine="Sub AddToRows(xParent As WixElement)";
 //BA.debugLineNum = 426;BA.debugLine="xParent.AddRows(Item)";
_xparent._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 427;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Text As WixElement";
_text = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _initialize(anywheresoftware.b4a.BA _ba,String _tid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(tID As String) As WixText";
 //BA.debugLineNum = 10;BA.debugLine="Text.Initialize(tID).SetView(\"text\")";
_text._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_tid)._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("text");
 //BA.debugLineNum = 11;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 12;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 276;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 277;BA.debugLine="Return Text.Item";
if (true) return _text._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 278;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _makemoney(boolean _b) throws Exception{
 //BA.debugLineNum = 170;BA.debugLine="Sub MakeMoney(b As Boolean) As WixText   'ignore";
 //BA.debugLineNum = 171;BA.debugLine="SetFormat(\"1,111.00\")";
_setformat((Object)("1,111.00"));
 //BA.debugLineNum = 172;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _maketelephone10(boolean _b) throws Exception{
 //BA.debugLineNum = 176;BA.debugLine="Sub MakeTelephone10(b As Boolean) As WixText   'ig";
 //BA.debugLineNum = 177;BA.debugLine="SetFormat(\"111-111-1111\")";
_setformat((Object)("111-111-1111"));
 //BA.debugLineNum = 178;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _onblur(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Sub OnBlur(cb As BANanoObject) As WixText";
 //BA.debugLineNum = 88;BA.debugLine="Text.onblur(cb)";
_text._onblur /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_cb);
 //BA.debugLineNum = 89;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _onchange(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 77;BA.debugLine="Sub OnChange(cb As BANanoObject) As WixText";
 //BA.debugLineNum = 78;BA.debugLine="Text.OnChange(cb)";
_text._onchange /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_cb);
 //BA.debugLineNum = 79;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _onenter(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Sub OnEnter(cb As BANanoObject) As WixText";
 //BA.debugLineNum = 68;BA.debugLine="Text.OnEnter(cb)";
_text._onenter /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_cb);
 //BA.debugLineNum = 69;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _onfocus(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Sub OnFocus(cb As BANanoObject) As WixText";
 //BA.debugLineNum = 83;BA.debugLine="Text.onfocus(cb)";
_text._onfocus /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_cb);
 //BA.debugLineNum = 84;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _onkeypress(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub OnKeyPress(cb As BANanoObject) As WixText";
 //BA.debugLineNum = 62;BA.debugLine="Text.OnKeyPress(cb)";
_text._onkeypress /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_cb);
 //BA.debugLineNum = 63;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _ontimedkeypress(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Sub OnTimedKeypress(cb As BANanoObject) As WixText";
 //BA.debugLineNum = 73;BA.debugLine="Text.OnTimedKeyPress(cb)";
_text._ontimedkeypress /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_cb);
 //BA.debugLineNum = 74;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 58;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setalign(String _a) throws Exception{
 //BA.debugLineNum = 318;BA.debugLine="Sub SetAlign(a As String) As WixText";
 //BA.debugLineNum = 319;BA.debugLine="Text.SetAlign(a)";
_text._setalign /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_a);
 //BA.debugLineNum = 320;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 321;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 406;BA.debugLine="Sub SetAlignCenter(r As String) As WixText 'ignore";
 //BA.debugLineNum = 407;BA.debugLine="Text.setAligncenter(\"\")";
_text._setaligncenter /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 408;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 409;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 412;BA.debugLine="Sub SetAlignLeft(r As String) As WixText 'ignore";
 //BA.debugLineNum = 413;BA.debugLine="Text.SetAlignleft(\"\")";
_text._setalignleft /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 414;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 415;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 400;BA.debugLine="Sub SetAlignRight(r As String) As WixText 'ignore";
 //BA.debugLineNum = 401;BA.debugLine="Text.setAlignright(\"\")";
_text._setalignright /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 402;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 403;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setanimate(boolean _animate) throws Exception{
 //BA.debugLineNum = 439;BA.debugLine="Sub SetAnimate(animate As Boolean) As WixText";
 //BA.debugLineNum = 440;BA.debugLine="Text.SetAttr(\"animate\", animate)";
_text._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("animate",(Object)(_animate));
 //BA.debugLineNum = 441;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 442;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setattr(String _p,Object _v) throws Exception{
 //BA.debugLineNum = 204;BA.debugLine="Sub SetAttr(p As String, v As Object) As WixText";
 //BA.debugLineNum = 205;BA.debugLine="Text.SetAttr(p, v)";
_text._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_p,_v);
 //BA.debugLineNum = 206;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 207;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 33;BA.debugLine="Sub SetAttributes(m As Map) As WixText";
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
 //BA.debugLineNum = 36;BA.debugLine="Text.SetAttr(k,v)";
_text._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 38;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setborderless(boolean _borderless) throws Exception{
 //BA.debugLineNum = 444;BA.debugLine="Sub SetBorderless(borderless As Boolean) As WixTex";
 //BA.debugLineNum = 445;BA.debugLine="Text.SetAttr(\"borderless\", borderless)";
_text._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("borderless",(Object)(_borderless));
 //BA.debugLineNum = 446;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 447;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setbottomlabel(Object _f) throws Exception{
 //BA.debugLineNum = 145;BA.debugLine="Sub SetBottomLabel(f As Object) As WixText";
 //BA.debugLineNum = 146;BA.debugLine="Text.SetAttr(\"bottomLabel\", f)";
_text._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("bottomLabel",_f);
 //BA.debugLineNum = 147;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setbottompadding(Object _f) throws Exception{
 //BA.debugLineNum = 151;BA.debugLine="Sub SetBottomPadding(f As Object) As WixText";
 //BA.debugLineNum = 152;BA.debugLine="Text.SetAttr(\"bottomPadding\", f)";
_text._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("bottomPadding",_f);
 //BA.debugLineNum = 153;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setclick(Object _click) throws Exception{
 //BA.debugLineNum = 449;BA.debugLine="Sub SetClick(click As Object) As WixText";
 //BA.debugLineNum = 450;BA.debugLine="Text.SetAttr(\"click\", click)";
_text._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("click",_click);
 //BA.debugLineNum = 451;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 452;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setcontainer(Object _container) throws Exception{
 //BA.debugLineNum = 454;BA.debugLine="Sub SetContainer(container As Object) As WixText";
 //BA.debugLineNum = 455;BA.debugLine="Text.SetAttr(\"container\", container)";
_text._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("container",_container);
 //BA.debugLineNum = 456;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 457;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setcss(Object _css) throws Exception{
 //BA.debugLineNum = 459;BA.debugLine="Sub SetCss(css As Object) As WixText";
 //BA.debugLineNum = 460;BA.debugLine="Text.SetAttr(\"css\", css)";
_text._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("css",_css);
 //BA.debugLineNum = 461;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 462;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setdisabled(boolean _b) throws Exception{
 //BA.debugLineNum = 241;BA.debugLine="Sub SetDisabled(b As Boolean) As WixText";
 //BA.debugLineNum = 242;BA.debugLine="Text.setattr(\"disabled\",b)";
_text._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("disabled",(Object)(_b));
 //BA.debugLineNum = 243;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 244;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setformat(Object _f) throws Exception{
 //BA.debugLineNum = 164;BA.debugLine="Sub SetFormat(f As Object) As WixText";
 //BA.debugLineNum = 165;BA.debugLine="Text.SetAttr(\"format\", f)";
_text._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("format",_f);
 //BA.debugLineNum = 166;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 167;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setgravity(Object _gravity) throws Exception{
 //BA.debugLineNum = 464;BA.debugLine="Sub SetGravity(gravity As Object) As WixText";
 //BA.debugLineNum = 465;BA.debugLine="Text.SetAttr(\"gravity\", gravity)";
_text._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("gravity",_gravity);
 //BA.debugLineNum = 466;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 467;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 312;BA.debugLine="Sub SetHeight(h As Object) As WixText";
 //BA.debugLineNum = 313;BA.debugLine="Text.SetHeight(h)";
_text._setheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 314;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 315;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _sethidden(boolean _b) throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Sub SetHidden(b As Boolean) As WixText";
 //BA.debugLineNum = 95;BA.debugLine="Text.SetHidden(b)";
_text._sethidden /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 96;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _sethotkey(Object _hotkey) throws Exception{
 //BA.debugLineNum = 469;BA.debugLine="Sub SetHotkey(hotkey As Object) As WixText";
 //BA.debugLineNum = 470;BA.debugLine="Text.SetAttr(\"hotkey\", hotkey)";
_text._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hotkey",_hotkey);
 //BA.debugLineNum = 471;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 472;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _seticon(Object _icon) throws Exception{
 //BA.debugLineNum = 474;BA.debugLine="Sub SetIcon(icon As Object) As WixText";
 //BA.debugLineNum = 475;BA.debugLine="Text.SetAttr(\"icon\", icon)";
_text._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("icon",_icon);
 //BA.debugLineNum = 476;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 477;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setinputalign(Object _v) throws Exception{
 //BA.debugLineNum = 393;BA.debugLine="Sub SetInputAlign(v As Object) As WixText  'ignore";
 //BA.debugLineNum = 394;BA.debugLine="Text.SetAttr(\"inputAlign\", v)";
_text._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("inputAlign",_v);
 //BA.debugLineNum = 395;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 396;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setinputalignleft(boolean _b) throws Exception{
 //BA.debugLineNum = 387;BA.debugLine="Sub SetInputAlignLeft(b As Boolean) As WixText  'i";
 //BA.debugLineNum = 388;BA.debugLine="Text.SetAttr(\"inputAlign\", \"left\")";
_text._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("inputAlign",(Object)("left"));
 //BA.debugLineNum = 389;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 390;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setinputalignright(boolean _b) throws Exception{
 //BA.debugLineNum = 381;BA.debugLine="Sub SetInputAlignRight(b As Boolean) As WixText  '";
 //BA.debugLineNum = 382;BA.debugLine="Text.SetAttr(\"inputAlign\", \"right\")";
_text._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("inputAlign",(Object)("right"));
 //BA.debugLineNum = 383;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 384;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setinputheight(Object _inputheight) throws Exception{
 //BA.debugLineNum = 479;BA.debugLine="Sub SetInputHeight(inputHeight As Object) As WixTe";
 //BA.debugLineNum = 480;BA.debugLine="Text.SetAttr(\"inputHeight\", inputHeight)";
_text._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("inputHeight",_inputheight);
 //BA.debugLineNum = 481;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 482;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setinputwidth(Object _inputwidth) throws Exception{
 //BA.debugLineNum = 484;BA.debugLine="Sub SetInputWidth(inputWidth As Object) As WixText";
 //BA.debugLineNum = 485;BA.debugLine="Text.SetAttr(\"inputWidth\", inputWidth)";
_text._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("inputWidth",_inputwidth);
 //BA.debugLineNum = 486;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 487;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setinvalid(Object _invalid) throws Exception{
 //BA.debugLineNum = 489;BA.debugLine="Sub SetInvalid(invalid As Object) As WixText";
 //BA.debugLineNum = 490;BA.debugLine="Text.SetAttr(\"invalid\", invalid)";
_text._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("invalid",_invalid);
 //BA.debugLineNum = 491;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 492;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setinvalidmessage(String _msg) throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Sub SetInvalidMessage(msg As String) As WixText";
 //BA.debugLineNum = 17;BA.debugLine="Text.SetAttr(\"invalidMessage\", msg)";
_text._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("invalidMessage",(Object)(_msg));
 //BA.debugLineNum = 18;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setlabel(String _lbl) throws Exception{
 //BA.debugLineNum = 300;BA.debugLine="Sub SetLabel(lbl As String) As WixText";
 //BA.debugLineNum = 301;BA.debugLine="Text.SetLabel(lbl)";
_text._setlabel /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_lbl);
 //BA.debugLineNum = 302;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 303;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 324;BA.debugLine="Sub SetLabelAlign(a As String) As WixText";
 //BA.debugLineNum = 325;BA.debugLine="Text.SetLabelAlign(a)";
_text._setlabelalign /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_a);
 //BA.debugLineNum = 326;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 327;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 330;BA.debugLine="Sub SetLabelPosition(p As String) As WixText";
 //BA.debugLineNum = 331;BA.debugLine="Text.SetLabelPosition(p)";
_text._setlabelposition /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_p);
 //BA.debugLineNum = 332;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 333;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setlabelwidth(int _w) throws Exception{
 //BA.debugLineNum = 336;BA.debugLine="Sub SetLabelWidth(w As Int) As WixText";
 //BA.debugLineNum = 337;BA.debugLine="Text.SetLabelWidth(w)";
_text._setlabelwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 338;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 339;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setlocalid(String _i) throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Sub SetLocalID(i As String) As WixText";
 //BA.debugLineNum = 109;BA.debugLine="Text.SetLocalID(i)";
_text._setlocalid /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_i);
 //BA.debugLineNum = 110;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 195;BA.debugLine="Sub SetMap(m As Map) As WixText";
 //BA.debugLineNum = 196;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 197;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 198;BA.debugLine="Text.SetAttr(strKey,	strVal)";
_text._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 200;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 201;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Sub SetMargin(margin As Object) As WixText";
 //BA.debugLineNum = 29;BA.debugLine="Text.SetMargin(margin)";
_text._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 30;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setmaxheight(Object _maxheight) throws Exception{
 //BA.debugLineNum = 494;BA.debugLine="Sub SetMaxHeight(maxHeight As Object) As WixText";
 //BA.debugLineNum = 495;BA.debugLine="Text.SetAttr(\"maxHeight\", maxHeight)";
_text._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxHeight",_maxheight);
 //BA.debugLineNum = 496;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 497;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setmaxlength(int _imaxlength) throws Exception{
 //BA.debugLineNum = 281;BA.debugLine="Sub SetMaxLength(imaxlength As Int) As WixText";
 //BA.debugLineNum = 282;BA.debugLine="Text.SetHTMLAttr(\"maxlength\", imaxlength)";
_text._sethtmlattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxlength",(Object)(_imaxlength));
 //BA.debugLineNum = 283;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 284;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setmaxwidth(Object _maxwidth) throws Exception{
 //BA.debugLineNum = 499;BA.debugLine="Sub SetMaxWidth(maxWidth As Object) As WixText";
 //BA.debugLineNum = 500;BA.debugLine="Text.SetAttr(\"maxWidth\", maxWidth)";
_text._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxWidth",_maxwidth);
 //BA.debugLineNum = 501;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 502;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 139;BA.debugLine="Sub SetMinHeight(h As Int) As WixText";
 //BA.debugLineNum = 140;BA.debugLine="Text.SetMinHeight(h)";
_text._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 141;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Sub SetMinWidth(w As Int) As WixText";
 //BA.debugLineNum = 134;BA.debugLine="Text.SetMinWidth(w)";
_text._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 135;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setname(String _n) throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Sub SetName(n As String) As WixText";
 //BA.debugLineNum = 115;BA.debugLine="Text.SetName(n)";
_text._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 116;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Sub SetPadding(padding As Object) As WixText";
 //BA.debugLineNum = 23;BA.debugLine="Text.SetPadding(padding)";
_text._setpadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 24;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 418;BA.debugLine="Sub SetParent(p As WixElement) As WixText";
 //BA.debugLineNum = 419;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 420;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 421;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setpattern(Object _f) throws Exception{
 //BA.debugLineNum = 158;BA.debugLine="Sub SetPattern(f As Object) As WixText";
 //BA.debugLineNum = 159;BA.debugLine="Text.SetAttr(\"pattern\", f)";
_text._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("pattern",_f);
 //BA.debugLineNum = 160;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setplaceholder(String _ph) throws Exception{
 //BA.debugLineNum = 294;BA.debugLine="Sub SetPlaceHolder(ph As String) As WixText";
 //BA.debugLineNum = 295;BA.debugLine="Text.SetPlaceHolder(ph)";
_text._setplaceholder /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_ph);
 //BA.debugLineNum = 296;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 297;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setpopup(Object _popup) throws Exception{
 //BA.debugLineNum = 504;BA.debugLine="Sub SetPopup(popup As Object) As WixText";
 //BA.debugLineNum = 505;BA.debugLine="Text.SetAttr(\"popup\", popup)";
_text._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("popup",_popup);
 //BA.debugLineNum = 506;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 507;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setreadonly(boolean _b) throws Exception{
 //BA.debugLineNum = 235;BA.debugLine="Sub SetReadOnly(b As Boolean) As WixText";
 //BA.debugLineNum = 236;BA.debugLine="Text.SetAttr(\"readonly\",b)";
_text._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("readonly",(Object)(_b));
 //BA.debugLineNum = 237;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 238;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setrelatedaction(Object _relatedaction) throws Exception{
 //BA.debugLineNum = 509;BA.debugLine="Sub SetRelatedAction(relatedAction As Object) As W";
 //BA.debugLineNum = 510;BA.debugLine="Text.SetAttr(\"relatedAction\", relatedAction)";
_text._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("relatedAction",_relatedaction);
 //BA.debugLineNum = 511;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 512;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setrelatedview(Object _relatedview) throws Exception{
 //BA.debugLineNum = 514;BA.debugLine="Sub SetRelatedView(relatedView As Object) As WixTe";
 //BA.debugLineNum = 515;BA.debugLine="Text.SetAttr(\"relatedView\", relatedView)";
_text._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("relatedView",_relatedview);
 //BA.debugLineNum = 516;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 517;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setrequired(boolean _b) throws Exception{
 //BA.debugLineNum = 287;BA.debugLine="Sub SetRequired(b As Boolean) As WixText";
 //BA.debugLineNum = 288;BA.debugLine="Text.SetAttr(\"required\", b)";
_text._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("required",(Object)(_b));
 //BA.debugLineNum = 289;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 290;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 120;BA.debugLine="Sub SetResponsive(b As Object) As WixText";
 //BA.debugLineNum = 121;BA.debugLine="Text.SetResponsive(b)";
_text._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 122;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 126;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixText";
 //BA.debugLineNum = 127;BA.debugLine="Text.SetResponsiveCell(b)";
_text._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 128;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 51;BA.debugLine="Text.SetStyle(prop,sval)";
_text._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 52;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 41;BA.debugLine="Sub SetStyles(m As Map) As WixText";
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
 //BA.debugLineNum = 44;BA.debugLine="Text.SetStyle(k,v)";
_text._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 46;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setsuggest(Object _s) throws Exception{
 //BA.debugLineNum = 252;BA.debugLine="Sub SetSuggest(s As Object) As WixText";
 //BA.debugLineNum = 253;BA.debugLine="Text.SetSuggest(s)";
_text._setsuggest /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_s);
 //BA.debugLineNum = 254;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 255;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 100;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixText";
 //BA.debugLineNum = 101;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 102;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 103;BA.debugLine="Text.SetTemplate(os)";
_text._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 104;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 228;BA.debugLine="Sub SetTooltip(tt As String) As WixText";
 //BA.debugLineNum = 229;BA.debugLine="Text.SetTooltip(tt)";
_text._settooltip /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_tt);
 //BA.debugLineNum = 230;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 231;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _settype(String _t) throws Exception{
 //BA.debugLineNum = 270;BA.debugLine="Sub SetType(t As String) As WixText";
 //BA.debugLineNum = 271;BA.debugLine="Text.SetType(t)";
_text._settype /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_t);
 //BA.debugLineNum = 272;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 273;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _settypeemail(String _r) throws Exception{
 //BA.debugLineNum = 222;BA.debugLine="Sub SetTypeEmail(r As String) As WixText  'ignore";
 //BA.debugLineNum = 223;BA.debugLine="Text.SetType(\"email\")";
_text._settype /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("email");
 //BA.debugLineNum = 224;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 225;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _settypenumber(String _r) throws Exception{
 //BA.debugLineNum = 209;BA.debugLine="Sub SetTypeNumber(r As String) As WixText  'ignore";
 //BA.debugLineNum = 210;BA.debugLine="Text.SetType(\"number\")";
_text._settype /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("number");
 //BA.debugLineNum = 211;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 212;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _settypepassword(String _r) throws Exception{
 //BA.debugLineNum = 183;BA.debugLine="Sub SetTypePassword(r As String) As WixText  'igno";
 //BA.debugLineNum = 184;BA.debugLine="Text.SetType(\"password\")";
_text._settype /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("password");
 //BA.debugLineNum = 185;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 186;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _settypetext(String _r) throws Exception{
 //BA.debugLineNum = 215;BA.debugLine="Sub SetTypeText(r As String) As WixText  'ignore";
 //BA.debugLineNum = 216;BA.debugLine="Text.SetType(\"text\")";
_text._settype /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("text");
 //BA.debugLineNum = 217;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 218;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _settypeurl(String _r) throws Exception{
 //BA.debugLineNum = 188;BA.debugLine="Sub SetTypeURL(r As String) As WixText  'ignore";
 //BA.debugLineNum = 189;BA.debugLine="Text.SetType(\"url\")";
_text._settype /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("url");
 //BA.debugLineNum = 190;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 191;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setvalidate(Object _v) throws Exception{
 //BA.debugLineNum = 349;BA.debugLine="Sub SetValidate(v As Object) As WixText   'ignore";
 //BA.debugLineNum = 350;BA.debugLine="Text.SetAttr(\"validate\",v)";
_text._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("validate",_v);
 //BA.debugLineNum = 351;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 352;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setvalidateevent(Object _e) throws Exception{
 //BA.debugLineNum = 365;BA.debugLine="Sub SetValidateEvent(e As Object) As WixText    'i";
 //BA.debugLineNum = 366;BA.debugLine="Text.SetAttr(\"validateEvent\", e)";
_text._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("validateEvent",_e);
 //BA.debugLineNum = 367;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 368;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setvalidateeventblur(boolean _b) throws Exception{
 //BA.debugLineNum = 370;BA.debugLine="Sub SetValidateEventBlur(b As Boolean) As WixText";
 //BA.debugLineNum = 371;BA.debugLine="Text.SetAttr(\"validateEvent\", \"blur\")";
_text._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("validateEvent",(Object)("blur"));
 //BA.debugLineNum = 372;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 373;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setvalidateeventkey(boolean _b) throws Exception{
 //BA.debugLineNum = 375;BA.debugLine="Sub SetValidateEventKey(b As Boolean) As WixText";
 //BA.debugLineNum = 376;BA.debugLine="Text.SetAttr(\"validateEvent\", \"key\")";
_text._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("validateEvent",(Object)("key"));
 //BA.debugLineNum = 377;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 378;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setvalidateisemail(boolean _b) throws Exception{
 //BA.debugLineNum = 360;BA.debugLine="Sub SetValidateIsEmail(b As Boolean) As WixText";
 //BA.debugLineNum = 361;BA.debugLine="Text.SetAttr(\"validate\",\"isEmail\")";
_text._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("validate",(Object)("isEmail"));
 //BA.debugLineNum = 362;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 363;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setvalidateisnotempty(boolean _b) throws Exception{
 //BA.debugLineNum = 342;BA.debugLine="Sub SetValidateIsNotEmpty(b As Boolean) As WixText";
 //BA.debugLineNum = 343;BA.debugLine="Text.SetAttr(\"validate\",\"isNotEmpty\")";
_text._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("validate",(Object)("isNotEmpty"));
 //BA.debugLineNum = 344;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 345;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setvalidateisnumber(boolean _b) throws Exception{
 //BA.debugLineNum = 355;BA.debugLine="Sub SetValidateIsNumber(b As Boolean) As WixText";
 //BA.debugLineNum = 356;BA.debugLine="Text.SetAttr(\"validate\",\"isNumber\")";
_text._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("validate",(Object)("isNumber"));
 //BA.debugLineNum = 357;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 358;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 258;BA.debugLine="Sub SetValue(v As String) As WixText";
 //BA.debugLineNum = 259;BA.debugLine="Text.SetValue(v)";
_text._setvalue /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_v);
 //BA.debugLineNum = 260;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 261;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setview(String _v) throws Exception{
 //BA.debugLineNum = 264;BA.debugLine="Sub SetView(v As String) As WixText";
 //BA.debugLineNum = 265;BA.debugLine="Text.setview(v)";
_text._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_v);
 //BA.debugLineNum = 266;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 267;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 306;BA.debugLine="Sub SetWidth(w As Object) As WixText";
 //BA.debugLineNum = 307;BA.debugLine="Text.SetWidth(w)";
_text._setwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 308;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtext)(this);
 //BA.debugLineNum = 309;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
