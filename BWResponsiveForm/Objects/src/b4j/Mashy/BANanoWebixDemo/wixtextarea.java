package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixtextarea extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixtextarea", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixtextarea.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixtext _textarea = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 316;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 317;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 318;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 321;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 322;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 323;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 311;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 312;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 313;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public TextArea As WixText";
_textarea = new b4j.Mashy.BANanoWebixDemo.wixtext();
 //BA.debugLineNum = 5;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _initialize(anywheresoftware.b4a.BA _ba,String _tid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(tID As String) As WixTextAre";
 //BA.debugLineNum = 10;BA.debugLine="TextArea.Initialize(tID)";
_textarea._initialize /*b4j.Mashy.BANanoWebixDemo.wixtext*/ (ba,_tid);
 //BA.debugLineNum = 11;BA.debugLine="TextArea.SetView(\"textarea\")";
_textarea._setview /*b4j.Mashy.BANanoWebixDemo.wixtext*/ ("textarea");
 //BA.debugLineNum = 12;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 13;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 174;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 175;BA.debugLine="Return TextArea.Item";
if (true) return _textarea._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _onblur(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub OnBlur(cb As BANanoObject) As WixTextArea";
 //BA.debugLineNum = 85;BA.debugLine="TextArea.onblur(cb)";
_textarea._onblur /*b4j.Mashy.BANanoWebixDemo.wixtext*/ (_cb);
 //BA.debugLineNum = 86;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _onchange(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Sub OnChange(cb As BANanoObject) As WixTextArea";
 //BA.debugLineNum = 75;BA.debugLine="TextArea.OnChange(cb)";
_textarea._onchange /*b4j.Mashy.BANanoWebixDemo.wixtext*/ (_cb);
 //BA.debugLineNum = 76;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _onenter(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub OnEnter(cb As BANanoObject) As WixTextArea";
 //BA.debugLineNum = 65;BA.debugLine="TextArea.OnEnter(cb)";
_textarea._onenter /*b4j.Mashy.BANanoWebixDemo.wixtext*/ (_cb);
 //BA.debugLineNum = 66;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _onfocus(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Sub OnFocus(cb As BANanoObject) As WixTextArea";
 //BA.debugLineNum = 80;BA.debugLine="TextArea.onfocus(cb)";
_textarea._onfocus /*b4j.Mashy.BANanoWebixDemo.wixtext*/ (_cb);
 //BA.debugLineNum = 81;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _onkeypress(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub OnKeyPress(cb As BANanoObject) As WixTextArea";
 //BA.debugLineNum = 35;BA.debugLine="TextArea.OnKeyPress(cb)";
_textarea._onkeypress /*b4j.Mashy.BANanoWebixDemo.wixtext*/ (_cb);
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _ontimedkeypress(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Sub OnTimedKeypress(cb As BANanoObject) As WixText";
 //BA.debugLineNum = 70;BA.debugLine="TextArea.OnTimedKeyPress(cb)";
_textarea._ontimedkeypress /*b4j.Mashy.BANanoWebixDemo.wixtext*/ (_cb);
 //BA.debugLineNum = 71;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 99;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _setalign(String _a) throws Exception{
 //BA.debugLineNum = 209;BA.debugLine="Sub SetAlign(a As String) As WixTextArea";
 //BA.debugLineNum = 210;BA.debugLine="TextArea.SetAlign(a)";
_textarea._setalign /*b4j.Mashy.BANanoWebixDemo.wixtext*/ (_a);
 //BA.debugLineNum = 211;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 212;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 298;BA.debugLine="Sub SetAlignCenter(r As String) As WixTextArea 'ig";
 //BA.debugLineNum = 299;BA.debugLine="TextArea.setAligncenter(\"\")";
_textarea._setaligncenter /*b4j.Mashy.BANanoWebixDemo.wixtext*/ ("");
 //BA.debugLineNum = 300;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 301;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 304;BA.debugLine="Sub SetAlignLeft(r As String) As WixTextArea 'igno";
 //BA.debugLineNum = 305;BA.debugLine="TextArea.SetAlignleft(\"\")";
_textarea._setalignleft /*b4j.Mashy.BANanoWebixDemo.wixtext*/ ("");
 //BA.debugLineNum = 306;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 307;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 292;BA.debugLine="Sub SetAlignRight(r As String) As WixTextArea 'ign";
 //BA.debugLineNum = 293;BA.debugLine="TextArea.setAlignright(\"\")";
_textarea._setalignright /*b4j.Mashy.BANanoWebixDemo.wixtext*/ ("");
 //BA.debugLineNum = 294;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 295;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _setanimate(boolean _animate) throws Exception{
 //BA.debugLineNum = 326;BA.debugLine="Sub SetAnimate(animate As Boolean) As WixTextArea";
 //BA.debugLineNum = 327;BA.debugLine="TextArea.SetAttr(\"animate\", animate)";
_textarea._setattr /*b4j.Mashy.BANanoWebixDemo.wixtext*/ ("animate",(Object)(_animate));
 //BA.debugLineNum = 328;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 329;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 40;BA.debugLine="Sub SetAttributes(m As Map) As WixTextArea";
 //BA.debugLineNum = 41;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 42;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 43;BA.debugLine="TextArea.SetAttr(k,v)";
_textarea._setattr /*b4j.Mashy.BANanoWebixDemo.wixtext*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 45;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _setborderless(boolean _borderless) throws Exception{
 //BA.debugLineNum = 331;BA.debugLine="Sub SetBorderless(borderless As Boolean) As WixTex";
 //BA.debugLineNum = 332;BA.debugLine="TextArea.SetAttr(\"borderless\", borderless)";
_textarea._setattr /*b4j.Mashy.BANanoWebixDemo.wixtext*/ ("borderless",(Object)(_borderless));
 //BA.debugLineNum = 333;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 334;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _setbottomlabel(Object _f) throws Exception{
 //BA.debugLineNum = 280;BA.debugLine="Sub SetBottomLabel(f As Object) As WixTextArea";
 //BA.debugLineNum = 281;BA.debugLine="TextArea.SetAttr(\"bottomLabel\", f)";
_textarea._setattr /*b4j.Mashy.BANanoWebixDemo.wixtext*/ ("bottomLabel",_f);
 //BA.debugLineNum = 282;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 283;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _setbottompadding(Object _f) throws Exception{
 //BA.debugLineNum = 286;BA.debugLine="Sub SetBottomPadding(f As Object) As WixTextArea";
 //BA.debugLineNum = 287;BA.debugLine="TextArea.SetAttr(\"bottomPadding\", f)";
_textarea._setattr /*b4j.Mashy.BANanoWebixDemo.wixtext*/ ("bottomPadding",_f);
 //BA.debugLineNum = 288;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 289;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _setclick(Object _click) throws Exception{
 //BA.debugLineNum = 336;BA.debugLine="Sub SetClick(click As Object) As WixTextArea";
 //BA.debugLineNum = 337;BA.debugLine="TextArea.SetAttr(\"click\", click)";
_textarea._setattr /*b4j.Mashy.BANanoWebixDemo.wixtext*/ ("click",_click);
 //BA.debugLineNum = 338;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 339;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _setcontainer(Object _container) throws Exception{
 //BA.debugLineNum = 341;BA.debugLine="Sub SetContainer(container As Object) As WixTextAr";
 //BA.debugLineNum = 342;BA.debugLine="TextArea.SetAttr(\"container\", container)";
_textarea._setattr /*b4j.Mashy.BANanoWebixDemo.wixtext*/ ("container",_container);
 //BA.debugLineNum = 343;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 344;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _setcss(Object _css) throws Exception{
 //BA.debugLineNum = 346;BA.debugLine="Sub SetCss(css As Object) As WixTextArea";
 //BA.debugLineNum = 347;BA.debugLine="TextArea.SetAttr(\"css\", css)";
_textarea._setattr /*b4j.Mashy.BANanoWebixDemo.wixtext*/ ("css",_css);
 //BA.debugLineNum = 348;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 349;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _setdisabled(boolean _b) throws Exception{
 //BA.debugLineNum = 274;BA.debugLine="Sub SetDisabled(b As Boolean) As WixTextArea";
 //BA.debugLineNum = 275;BA.debugLine="TextArea.setattr(\"disabled\",b)";
_textarea._setattr /*b4j.Mashy.BANanoWebixDemo.wixtext*/ ("disabled",(Object)(_b));
 //BA.debugLineNum = 276;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 277;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _setelatedview(Object _elatedview) throws Exception{
 //BA.debugLineNum = 417;BA.debugLine="Sub SetElatedView(elatedView As Object) As WixText";
 //BA.debugLineNum = 418;BA.debugLine="TextArea.SetAttr(\"elatedView\", elatedView)";
_textarea._setattr /*b4j.Mashy.BANanoWebixDemo.wixtext*/ ("elatedView",_elatedview);
 //BA.debugLineNum = 419;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 420;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _setformat(Object _format) throws Exception{
 //BA.debugLineNum = 351;BA.debugLine="Sub SetFormat(format As Object) As WixTextArea";
 //BA.debugLineNum = 352;BA.debugLine="TextArea.SetAttr(\"format\", format)";
_textarea._setattr /*b4j.Mashy.BANanoWebixDemo.wixtext*/ ("format",_format);
 //BA.debugLineNum = 353;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 354;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _setgravity(Object _gravity) throws Exception{
 //BA.debugLineNum = 356;BA.debugLine="Sub SetGravity(gravity As Object) As WixTextArea";
 //BA.debugLineNum = 357;BA.debugLine="TextArea.SetAttr(\"gravity\", gravity)";
_textarea._setattr /*b4j.Mashy.BANanoWebixDemo.wixtext*/ ("gravity",_gravity);
 //BA.debugLineNum = 358;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 359;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 203;BA.debugLine="Sub SetHeight(h As Object) As WixTextArea";
 //BA.debugLineNum = 204;BA.debugLine="TextArea.SetHeight(h)";
_textarea._setheight /*b4j.Mashy.BANanoWebixDemo.wixtext*/ (_h);
 //BA.debugLineNum = 205;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 206;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _sethidden(boolean _hidden) throws Exception{
 //BA.debugLineNum = 361;BA.debugLine="Sub SetHidden(hidden As Boolean) As WixTextArea";
 //BA.debugLineNum = 362;BA.debugLine="TextArea.SetAttr(\"hidden\", hidden)";
_textarea._setattr /*b4j.Mashy.BANanoWebixDemo.wixtext*/ ("hidden",(Object)(_hidden));
 //BA.debugLineNum = 363;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 364;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _sethotkey(Object _hotkey) throws Exception{
 //BA.debugLineNum = 366;BA.debugLine="Sub SetHotkey(hotkey As Object) As WixTextArea";
 //BA.debugLineNum = 367;BA.debugLine="TextArea.SetAttr(\"hotkey\", hotkey)";
_textarea._setattr /*b4j.Mashy.BANanoWebixDemo.wixtext*/ ("hotkey",_hotkey);
 //BA.debugLineNum = 368;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 369;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _setinputalign(Object _inputalign) throws Exception{
 //BA.debugLineNum = 371;BA.debugLine="Sub SetInputAlign(inputAlign As Object) As WixText";
 //BA.debugLineNum = 372;BA.debugLine="TextArea.SetAttr(\"inputAlign\", inputAlign)";
_textarea._setattr /*b4j.Mashy.BANanoWebixDemo.wixtext*/ ("inputAlign",_inputalign);
 //BA.debugLineNum = 373;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 374;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _setinputheight(Object _inputheight) throws Exception{
 //BA.debugLineNum = 376;BA.debugLine="Sub SetInputHeight(inputHeight As Object) As WixTe";
 //BA.debugLineNum = 377;BA.debugLine="TextArea.SetAttr(\"inputHeight\", inputHeight)";
_textarea._setattr /*b4j.Mashy.BANanoWebixDemo.wixtext*/ ("inputHeight",_inputheight);
 //BA.debugLineNum = 378;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 379;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _setinputwidth(Object _inputwidth) throws Exception{
 //BA.debugLineNum = 381;BA.debugLine="Sub SetInputWidth(inputWidth As Object) As WixText";
 //BA.debugLineNum = 382;BA.debugLine="TextArea.SetAttr(\"inputWidth\", inputWidth)";
_textarea._setattr /*b4j.Mashy.BANanoWebixDemo.wixtext*/ ("inputWidth",_inputwidth);
 //BA.debugLineNum = 383;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 384;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _setinvalid(Object _invalid) throws Exception{
 //BA.debugLineNum = 386;BA.debugLine="Sub SetInvalid(invalid As Object) As WixTextArea";
 //BA.debugLineNum = 387;BA.debugLine="TextArea.SetAttr(\"invalid\", invalid)";
_textarea._setattr /*b4j.Mashy.BANanoWebixDemo.wixtext*/ ("invalid",_invalid);
 //BA.debugLineNum = 388;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 389;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _setinvalidmessage(String _msg) throws Exception{
 //BA.debugLineNum = 157;BA.debugLine="Sub SetInvalidMessage(msg As String) As WixTextAre";
 //BA.debugLineNum = 158;BA.debugLine="TextArea.SetInvalidMessage(msg)";
_textarea._setinvalidmessage /*b4j.Mashy.BANanoWebixDemo.wixtext*/ (_msg);
 //BA.debugLineNum = 159;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _setlabel(String _lbl) throws Exception{
 //BA.debugLineNum = 191;BA.debugLine="Sub SetLabel(lbl As String) As WixTextArea";
 //BA.debugLineNum = 192;BA.debugLine="TextArea.SetLabel(lbl)";
_textarea._setlabel /*b4j.Mashy.BANanoWebixDemo.wixtext*/ (_lbl);
 //BA.debugLineNum = 193;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _setlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 216;BA.debugLine="Sub SetLabelAlign(a As String) As WixTextArea";
 //BA.debugLineNum = 217;BA.debugLine="TextArea.SetLabelAlign(a)";
_textarea._setlabelalign /*b4j.Mashy.BANanoWebixDemo.wixtext*/ (_a);
 //BA.debugLineNum = 218;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 219;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _setlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 222;BA.debugLine="Sub SetLabelPosition(p As String) As WixTextArea";
 //BA.debugLineNum = 223;BA.debugLine="TextArea.SetLabelPosition(p)";
_textarea._setlabelposition /*b4j.Mashy.BANanoWebixDemo.wixtext*/ (_p);
 //BA.debugLineNum = 224;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 225;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _setlabelwidth(int _w) throws Exception{
 //BA.debugLineNum = 228;BA.debugLine="Sub SetLabelWidth(w As Int) As WixTextArea";
 //BA.debugLineNum = 229;BA.debugLine="TextArea.SetLabelWidth(w)";
_textarea._setlabelwidth /*b4j.Mashy.BANanoWebixDemo.wixtext*/ (_w);
 //BA.debugLineNum = 230;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 231;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _setlocalid(String _i) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Sub SetLocalID(i As String) As WixTextArea";
 //BA.debugLineNum = 104;BA.debugLine="TextArea.SetLocalID(i)";
_textarea._setlocalid /*b4j.Mashy.BANanoWebixDemo.wixtext*/ (_i);
 //BA.debugLineNum = 105;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 147;BA.debugLine="Sub SetMap(m As Map) As WixTextArea";
 //BA.debugLineNum = 148;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 149;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 150;BA.debugLine="TextArea.SetAttr(strKey,	strVal)";
_textarea._setattr /*b4j.Mashy.BANanoWebixDemo.wixtext*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 152;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Sub SetMargin(margin As Object) As WixTextArea";
 //BA.debugLineNum = 30;BA.debugLine="TextArea.SetMargin(margin)";
_textarea._setmargin /*b4j.Mashy.BANanoWebixDemo.wixtext*/ (_margin);
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _setmaxheight(Object _maxheight) throws Exception{
 //BA.debugLineNum = 391;BA.debugLine="Sub SetMaxHeight(maxHeight As Object) As WixTextAr";
 //BA.debugLineNum = 392;BA.debugLine="TextArea.SetAttr(\"maxHeight\", maxHeight)";
_textarea._setattr /*b4j.Mashy.BANanoWebixDemo.wixtext*/ ("maxHeight",_maxheight);
 //BA.debugLineNum = 393;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 394;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _setmaxlength(int _ml) throws Exception{
 //BA.debugLineNum = 179;BA.debugLine="Sub SetMaxLength(ml As Int) As WixTextArea";
 //BA.debugLineNum = 180;BA.debugLine="TextArea.SetMaxLength(ml)";
_textarea._setmaxlength /*b4j.Mashy.BANanoWebixDemo.wixtext*/ (_ml);
 //BA.debugLineNum = 181;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _setmaxwidth(Object _maxwidth) throws Exception{
 //BA.debugLineNum = 396;BA.debugLine="Sub SetMaxWidth(maxWidth As Object) As WixTextArea";
 //BA.debugLineNum = 397;BA.debugLine="TextArea.SetAttr(\"maxWidth\", maxWidth)";
_textarea._setattr /*b4j.Mashy.BANanoWebixDemo.wixtext*/ ("maxWidth",_maxwidth);
 //BA.debugLineNum = 398;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 399;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 142;BA.debugLine="Sub SetMinHeight(h As Int) As WixTextArea";
 //BA.debugLineNum = 143;BA.debugLine="TextArea.SetMinHeight(h)";
_textarea._setminheight /*b4j.Mashy.BANanoWebixDemo.wixtext*/ (_h);
 //BA.debugLineNum = 144;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 136;BA.debugLine="Sub SetMinWidth(w As Int) As WixTextArea";
 //BA.debugLineNum = 137;BA.debugLine="TextArea.SetMinWidth(w)";
_textarea._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixtext*/ (_w);
 //BA.debugLineNum = 138;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _setname(String _n) throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Sub SetName(n As String) As WixTextArea";
 //BA.debugLineNum = 118;BA.debugLine="TextArea.SetName(n)";
_textarea._setname /*b4j.Mashy.BANanoWebixDemo.wixtext*/ (_n);
 //BA.debugLineNum = 119;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Sub SetPadding(padding As Object) As WixTextArea";
 //BA.debugLineNum = 24;BA.debugLine="TextArea.SetPadding(padding)";
_textarea._setpadding /*b4j.Mashy.BANanoWebixDemo.wixtext*/ (_padding);
 //BA.debugLineNum = 25;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub SetParent(p As WixElement) As WixTextArea";
 //BA.debugLineNum = 18;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 19;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _setpattern(Object _pattern) throws Exception{
 //BA.debugLineNum = 401;BA.debugLine="Sub SetPattern(pattern As Object) As WixTextArea";
 //BA.debugLineNum = 402;BA.debugLine="TextArea.SetAttr(\"pattern\", pattern)";
_textarea._setattr /*b4j.Mashy.BANanoWebixDemo.wixtext*/ ("pattern",_pattern);
 //BA.debugLineNum = 403;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 404;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _setplaceholder(String _ph) throws Exception{
 //BA.debugLineNum = 185;BA.debugLine="Sub SetPlaceHolder(ph As String) As WixTextArea";
 //BA.debugLineNum = 186;BA.debugLine="TextArea.SetPlaceHolder(ph)";
_textarea._setplaceholder /*b4j.Mashy.BANanoWebixDemo.wixtext*/ (_ph);
 //BA.debugLineNum = 187;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _setpopup(Object _popup) throws Exception{
 //BA.debugLineNum = 407;BA.debugLine="Sub SetPopup(popup As Object) As WixTextArea";
 //BA.debugLineNum = 408;BA.debugLine="TextArea.SetAttr(\"popup\", popup)";
_textarea._setattr /*b4j.Mashy.BANanoWebixDemo.wixtext*/ ("popup",_popup);
 //BA.debugLineNum = 409;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 410;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _setreadonly(boolean _b) throws Exception{
 //BA.debugLineNum = 268;BA.debugLine="Sub SetReadOnly(b As Boolean) As WixTextArea";
 //BA.debugLineNum = 269;BA.debugLine="TextArea.SetAttr(\"readonly\",b)";
_textarea._setattr /*b4j.Mashy.BANanoWebixDemo.wixtext*/ ("readonly",(Object)(_b));
 //BA.debugLineNum = 270;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 271;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _setrelatedaction(Object _relatedaction) throws Exception{
 //BA.debugLineNum = 412;BA.debugLine="Sub SetRelatedAction(relatedAction As Object) As W";
 //BA.debugLineNum = 413;BA.debugLine="TextArea.SetAttr(\"relatedAction\", relatedAction)";
_textarea._setattr /*b4j.Mashy.BANanoWebixDemo.wixtext*/ ("relatedAction",_relatedaction);
 //BA.debugLineNum = 414;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 415;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _setrequired(boolean _b) throws Exception{
 //BA.debugLineNum = 261;BA.debugLine="Sub SetRequired(b As Boolean) As WixTextArea";
 //BA.debugLineNum = 262;BA.debugLine="TextArea.SetAttr(\"required\", b)";
_textarea._setattr /*b4j.Mashy.BANanoWebixDemo.wixtext*/ ("required",(Object)(_b));
 //BA.debugLineNum = 263;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 264;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Sub SetResponsive(b As Object) As WixTextArea";
 //BA.debugLineNum = 124;BA.debugLine="TextArea.SetResponsive(b)";
_textarea._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixtext*/ (_b);
 //BA.debugLineNum = 125;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 129;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixTextArea";
 //BA.debugLineNum = 130;BA.debugLine="TextArea.SetResponsiveCell(b)";
_textarea._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixtext*/ (_b);
 //BA.debugLineNum = 131;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 58;BA.debugLine="TextArea.SetStyle(prop,sval)";
_textarea._setstyle /*b4j.Mashy.BANanoWebixDemo.wixtext*/ (_prop,_sval);
 //BA.debugLineNum = 59;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 48;BA.debugLine="Sub SetStyles(m As Map) As WixTextArea";
 //BA.debugLineNum = 49;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 50;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 51;BA.debugLine="TextArea.SetStyle(k,v)";
_textarea._setstyle /*b4j.Mashy.BANanoWebixDemo.wixtext*/ (_k,_v);
 }
};
 //BA.debugLineNum = 53;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _setsuggest(Object _suggest) throws Exception{
 //BA.debugLineNum = 422;BA.debugLine="Sub SetSuggest(suggest As Object) As WixTextArea";
 //BA.debugLineNum = 423;BA.debugLine="TextArea.SetAttr(\"suggest\", suggest)";
_textarea._setattr /*b4j.Mashy.BANanoWebixDemo.wixtext*/ ("suggest",_suggest);
 //BA.debugLineNum = 424;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 425;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 109;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixTextAre";
 //BA.debugLineNum = 110;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 111;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 112;BA.debugLine="TextArea.SetAttr(\"template\", os)";
_textarea._setattr /*b4j.Mashy.BANanoWebixDemo.wixtext*/ ("template",(Object)(_os));
 //BA.debugLineNum = 113;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 163;BA.debugLine="Sub SetTooltip(tt As String) As WixTextArea";
 //BA.debugLineNum = 164;BA.debugLine="TextArea.SetTooltip(tt)";
_textarea._settooltip /*b4j.Mashy.BANanoWebixDemo.wixtext*/ (_tt);
 //BA.debugLineNum = 165;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 166;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _setvalidate(Object _validate) throws Exception{
 //BA.debugLineNum = 427;BA.debugLine="Sub SetValidate(validate As Object) As WixTextArea";
 //BA.debugLineNum = 428;BA.debugLine="TextArea.SetAttr(\"validate\", validate)";
_textarea._setattr /*b4j.Mashy.BANanoWebixDemo.wixtext*/ ("validate",_validate);
 //BA.debugLineNum = 429;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 430;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _setvalidateevent(Object _validateevent) throws Exception{
 //BA.debugLineNum = 432;BA.debugLine="Sub SetValidateEvent(validateEvent As Object) As W";
 //BA.debugLineNum = 433;BA.debugLine="TextArea.SetAttr(\"validateEvent\", validateEvent)";
_textarea._setattr /*b4j.Mashy.BANanoWebixDemo.wixtext*/ ("validateEvent",_validateevent);
 //BA.debugLineNum = 434;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 435;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _setvalidateeventblur(boolean _b) throws Exception{
 //BA.debugLineNum = 250;BA.debugLine="Sub SetValidateEventBlur(b As Boolean) As WixTextA";
 //BA.debugLineNum = 251;BA.debugLine="TextArea.SetAttr(\"validateEvent\", \"blur\")";
_textarea._setattr /*b4j.Mashy.BANanoWebixDemo.wixtext*/ ("validateEvent",(Object)("blur"));
 //BA.debugLineNum = 252;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 253;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _setvalidateeventkey(boolean _b) throws Exception{
 //BA.debugLineNum = 255;BA.debugLine="Sub SetValidateEventKey(b As Boolean) As WixTextAr";
 //BA.debugLineNum = 256;BA.debugLine="TextArea.SetAttr(\"validateEvent\", \"key\")";
_textarea._setattr /*b4j.Mashy.BANanoWebixDemo.wixtext*/ ("validateEvent",(Object)("key"));
 //BA.debugLineNum = 257;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 258;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _setvalidateisemail(boolean _b) throws Exception{
 //BA.debugLineNum = 244;BA.debugLine="Sub SetValidateIsEmail(b As Boolean) As WixTextAre";
 //BA.debugLineNum = 245;BA.debugLine="TextArea.SetAttr(\"validate\",\"isEmail\")";
_textarea._setattr /*b4j.Mashy.BANanoWebixDemo.wixtext*/ ("validate",(Object)("isEmail"));
 //BA.debugLineNum = 246;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 247;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _setvalidateisnotempty(boolean _b) throws Exception{
 //BA.debugLineNum = 234;BA.debugLine="Sub SetValidateIsNotEmpty(b As Boolean) As WixText";
 //BA.debugLineNum = 235;BA.debugLine="TextArea.SetAttr(\"validate\",\"isNotEmpty\")";
_textarea._setattr /*b4j.Mashy.BANanoWebixDemo.wixtext*/ ("validate",(Object)("isNotEmpty"));
 //BA.debugLineNum = 236;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 237;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _setvalidateisnumber(boolean _b) throws Exception{
 //BA.debugLineNum = 239;BA.debugLine="Sub SetValidateIsNumber(b As Boolean) As WixTextAr";
 //BA.debugLineNum = 240;BA.debugLine="TextArea.SetAttr(\"validate\",\"isNumber\")";
_textarea._setattr /*b4j.Mashy.BANanoWebixDemo.wixtext*/ ("validate",(Object)("isNumber"));
 //BA.debugLineNum = 241;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 242;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub SetValue(v As String) As WixTextArea";
 //BA.debugLineNum = 92;BA.debugLine="TextArea.Setvalue(v)";
_textarea._setvalue /*b4j.Mashy.BANanoWebixDemo.wixtext*/ (_v);
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 197;BA.debugLine="Sub SetWidth(w As Object) As WixTextArea";
 //BA.debugLineNum = 198;BA.debugLine="TextArea.SetWidth(w)";
_textarea._setwidth /*b4j.Mashy.BANanoWebixDemo.wixtext*/ (_w);
 //BA.debugLineNum = 199;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtextarea)(this);
 //BA.debugLineNum = 200;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
