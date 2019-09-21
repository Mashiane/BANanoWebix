package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixtoggle extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixtoggle", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixtoggle.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _toggle = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 273;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 274;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 275;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 278;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 279;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 280;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.Mashy.BANanoWebixDemo.wixform _frm) throws Exception{
 //BA.debugLineNum = 149;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 150;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 268;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 269;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 270;BA.debugLine="End Sub";
return "";
}
public String  _addtotoolbar(b4j.Mashy.BANanoWebixDemo.wixtoolbar _tblb) throws Exception{
 //BA.debugLineNum = 154;BA.debugLine="Sub AddToToolbar(tblB As WixToolBar)";
 //BA.debugLineNum = 155;BA.debugLine="tblB.ToolBar.AddColumns(Item)";
_tblb._toolbar /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 156;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Public Toggle As WixElement";
_toggle = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 6;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixtoggle  _initialize(anywheresoftware.b4a.BA _ba,String _bid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(bID As String) As WixToggle";
 //BA.debugLineNum = 11;BA.debugLine="ID = bID.ToLowerCase";
_id = _bid.toLowerCase();
 //BA.debugLineNum = 12;BA.debugLine="Toggle.Initialize(ID).SetView(\"toggle\")";
_toggle._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_id)._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("toggle");
 //BA.debugLineNum = 13;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 14;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoggle)(this);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 165;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 166;BA.debugLine="Return Toggle.item";
if (true) return _toggle._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 167;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 31;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixtoggle  _setalign(Object _align) throws Exception{
 //BA.debugLineNum = 282;BA.debugLine="Sub SetAlign(align As Object) As WixToggle";
 //BA.debugLineNum = 283;BA.debugLine="Toggle.SetAttr(\"align\", align)";
_toggle._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("align",_align);
 //BA.debugLineNum = 284;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoggle)(this);
 //BA.debugLineNum = 285;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoggle  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 249;BA.debugLine="Sub SetAlignCenter(r As String) As WixToggle 'igno";
 //BA.debugLineNum = 250;BA.debugLine="Toggle.setAligncenter(\"\")";
_toggle._setaligncenter /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 251;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoggle)(this);
 //BA.debugLineNum = 252;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoggle  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 255;BA.debugLine="Sub SetAlignLeft(r As String) As WixToggle 'ignore";
 //BA.debugLineNum = 256;BA.debugLine="Toggle.SetAlignleft(\"\")";
_toggle._setalignleft /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 257;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoggle)(this);
 //BA.debugLineNum = 258;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoggle  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 243;BA.debugLine="Sub SetAlignRight(r As String) As WixToggle 'ignor";
 //BA.debugLineNum = 244;BA.debugLine="Toggle.setAlignright(\"\")";
_toggle._setalignright /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 245;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoggle)(this);
 //BA.debugLineNum = 246;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoggle  _setanimate(boolean _animate) throws Exception{
 //BA.debugLineNum = 287;BA.debugLine="Sub SetAnimate(animate As Boolean) As WixToggle";
 //BA.debugLineNum = 288;BA.debugLine="Toggle.SetAttr(\"animate\", animate)";
_toggle._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("animate",(Object)(_animate));
 //BA.debugLineNum = 289;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoggle)(this);
 //BA.debugLineNum = 290;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoggle  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 40;BA.debugLine="Sub SetAttributes(m As Map) As WixToggle";
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
 //BA.debugLineNum = 43;BA.debugLine="Toggle.SetAttr(k,v)";
_toggle._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 45;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoggle)(this);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoggle  _setautowidth(boolean _b) throws Exception{
 //BA.debugLineNum = 261;BA.debugLine="Sub SetAutoWidth(b As Boolean) As WixToggle 'ignor";
 //BA.debugLineNum = 262;BA.debugLine="Toggle.SetAutoWidth(b)";
_toggle._setautowidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 263;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoggle)(this);
 //BA.debugLineNum = 264;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoggle  _setbadge(Object _b) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub SetBadge(b As Object) As WixToggle";
 //BA.debugLineNum = 35;BA.debugLine="Toggle.SetAttr(\"badge\", b)";
_toggle._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("badge",_b);
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoggle)(this);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoggle  _setbatch(int _b) throws Exception{
 //BA.debugLineNum = 170;BA.debugLine="Sub SetBatch(b As Int) As WixToggle";
 //BA.debugLineNum = 171;BA.debugLine="Toggle.SetBatch(b)";
_toggle._setbatch /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 172;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoggle)(this);
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoggle  _setborderless(boolean _borderless) throws Exception{
 //BA.debugLineNum = 293;BA.debugLine="Sub SetBorderless(borderless As Boolean) As WixTog";
 //BA.debugLineNum = 294;BA.debugLine="Toggle.SetAttr(\"borderless\", borderless)";
_toggle._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("borderless",(Object)(_borderless));
 //BA.debugLineNum = 295;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoggle)(this);
 //BA.debugLineNum = 296;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoggle  _setclick(com.ab.banano.BANanoObject _e) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Sub SetClick(e As BANanoObject) As WixToggle";
 //BA.debugLineNum = 72;BA.debugLine="Toggle.SetAttr(\"click\", e)";
_toggle._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("click",(Object)(_e));
 //BA.debugLineNum = 73;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoggle)(this);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoggle  _setcontainer(Object _container) throws Exception{
 //BA.debugLineNum = 298;BA.debugLine="Sub SetContainer(container As Object) As WixToggle";
 //BA.debugLineNum = 299;BA.debugLine="Toggle.SetAttr(\"container\", container)";
_toggle._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("container",_container);
 //BA.debugLineNum = 300;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoggle)(this);
 //BA.debugLineNum = 301;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoggle  _setcss(Object _css) throws Exception{
 //BA.debugLineNum = 303;BA.debugLine="Sub SetCss(css As Object) As WixToggle";
 //BA.debugLineNum = 304;BA.debugLine="Toggle.SetAttr(\"css\", css)";
_toggle._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("css",_css);
 //BA.debugLineNum = 305;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoggle)(this);
 //BA.debugLineNum = 306;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoggle  _setdisabled(boolean _disabled) throws Exception{
 //BA.debugLineNum = 308;BA.debugLine="Sub SetDisabled(disabled As Boolean) As WixToggle";
 //BA.debugLineNum = 309;BA.debugLine="Toggle.SetAttr(\"disabled\", disabled)";
_toggle._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("disabled",(Object)(_disabled));
 //BA.debugLineNum = 310;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoggle)(this);
 //BA.debugLineNum = 311;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoggle  _setgravity(Object _gravity) throws Exception{
 //BA.debugLineNum = 313;BA.debugLine="Sub SetGravity(gravity As Object) As WixToggle";
 //BA.debugLineNum = 314;BA.debugLine="Toggle.SetAttr(\"gravity\", gravity)";
_toggle._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("gravity",_gravity);
 //BA.debugLineNum = 315;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoggle)(this);
 //BA.debugLineNum = 316;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoggle  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 230;BA.debugLine="Sub SetHeight(h As Object) As WixToggle";
 //BA.debugLineNum = 231;BA.debugLine="Toggle.SetHeight(h)";
_toggle._setheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 232;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoggle)(this);
 //BA.debugLineNum = 233;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoggle  _sethidden(boolean _hidden) throws Exception{
 //BA.debugLineNum = 319;BA.debugLine="Sub SetHidden(hidden As Boolean) As WixToggle";
 //BA.debugLineNum = 320;BA.debugLine="Toggle.SetAttr(\"hidden\", hidden)";
_toggle._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hidden",(Object)(_hidden));
 //BA.debugLineNum = 321;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoggle)(this);
 //BA.debugLineNum = 322;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoggle  _sethotkey(Object _hotkey) throws Exception{
 //BA.debugLineNum = 324;BA.debugLine="Sub SetHotkey(hotkey As Object) As WixToggle";
 //BA.debugLineNum = 325;BA.debugLine="Toggle.SetAttr(\"hotkey\", hotkey)";
_toggle._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hotkey",_hotkey);
 //BA.debugLineNum = 326;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoggle)(this);
 //BA.debugLineNum = 327;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoggle  _seticon(String _icn) throws Exception{
 //BA.debugLineNum = 182;BA.debugLine="Sub SetIcon(icn As String) As WixToggle";
 //BA.debugLineNum = 183;BA.debugLine="Toggle.SetAttr(\"icon\", icn)";
_toggle._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("icon",(Object)(_icn));
 //BA.debugLineNum = 184;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoggle)(this);
 //BA.debugLineNum = 185;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoggle  _setimage(String _img) throws Exception{
 //BA.debugLineNum = 176;BA.debugLine="Sub SetImage(img As String) As WixToggle";
 //BA.debugLineNum = 177;BA.debugLine="Toggle.SetAttr(\"image\", img)";
_toggle._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("image",(Object)(_img));
 //BA.debugLineNum = 178;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoggle)(this);
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoggle  _setinputheight(Object _inputheight) throws Exception{
 //BA.debugLineNum = 329;BA.debugLine="Sub SetInputHeight(inputHeight As Object) As WixTo";
 //BA.debugLineNum = 330;BA.debugLine="Toggle.SetAttr(\"inputHeight\", inputHeight)";
_toggle._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("inputHeight",_inputheight);
 //BA.debugLineNum = 331;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoggle)(this);
 //BA.debugLineNum = 332;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoggle  _setinputwidth(int _w) throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Sub SetInputWidth(w As Int) As WixToggle";
 //BA.debugLineNum = 119;BA.debugLine="Toggle.SetInputWidth(w)";
_toggle._setinputwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 120;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoggle)(this);
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoggle  _setlabel(String _lbl) throws Exception{
 //BA.debugLineNum = 200;BA.debugLine="Sub SetLabel(lbl As String) As WixToggle";
 //BA.debugLineNum = 201;BA.debugLine="Toggle.SetLabel(lbl)";
_toggle._setlabel /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_lbl);
 //BA.debugLineNum = 202;BA.debugLine="Toggle.Setvalue(lbl)";
_toggle._setvalue /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_lbl);
 //BA.debugLineNum = 203;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoggle)(this);
 //BA.debugLineNum = 204;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoggle  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 108;BA.debugLine="Sub SetMap(m As Map) As WixToggle";
 //BA.debugLineNum = 109;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 110;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 111;BA.debugLine="Toggle.SetAttr(strKey,	strVal)";
_toggle._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 113;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoggle)(this);
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoggle  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub SetMargin(margin As Object) As WixToggle";
 //BA.debugLineNum = 25;BA.debugLine="Toggle.SetMargin(margin)";
_toggle._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 26;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoggle)(this);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoggle  _setmaxheight(Object _maxheight) throws Exception{
 //BA.debugLineNum = 335;BA.debugLine="Sub SetMaxHeight(maxHeight As Object) As WixToggle";
 //BA.debugLineNum = 336;BA.debugLine="Toggle.SetAttr(\"maxHeight\", maxHeight)";
_toggle._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxHeight",_maxheight);
 //BA.debugLineNum = 337;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoggle)(this);
 //BA.debugLineNum = 338;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoggle  _setmaxwidth(Object _maxwidth) throws Exception{
 //BA.debugLineNum = 340;BA.debugLine="Sub SetMaxWidth(maxWidth As Object) As WixToggle";
 //BA.debugLineNum = 341;BA.debugLine="Toggle.SetAttr(\"maxWidth\", maxWidth)";
_toggle._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxWidth",_maxwidth);
 //BA.debugLineNum = 342;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoggle)(this);
 //BA.debugLineNum = 343;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoggle  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Sub SetMinHeight(h As Int) As WixToggle";
 //BA.debugLineNum = 103;BA.debugLine="Toggle.SetMinHeight(h)";
_toggle._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 104;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoggle)(this);
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoggle  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Sub SetMinWidth(w As Int) As WixToggle";
 //BA.debugLineNum = 97;BA.debugLine="Toggle.SetMinWidth(w)";
_toggle._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 98;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoggle)(this);
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoggle  _setname(String _n) throws Exception{
 //BA.debugLineNum = 77;BA.debugLine="Sub SetName(n As String) As WixToggle";
 //BA.debugLineNum = 78;BA.debugLine="Toggle.SetName(n)";
_toggle._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 79;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoggle)(this);
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoggle  _setofficon(String _icn) throws Exception{
 //BA.debugLineNum = 194;BA.debugLine="Sub SetOffIcon(icn As String) As WixToggle";
 //BA.debugLineNum = 195;BA.debugLine="Toggle.SetAttr(\"offIcon\", icn)";
_toggle._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("offIcon",(Object)(_icn));
 //BA.debugLineNum = 196;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoggle)(this);
 //BA.debugLineNum = 197;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoggle  _setofflabel(String _l) throws Exception{
 //BA.debugLineNum = 137;BA.debugLine="Sub SetOffLabel(l As String) As WixToggle";
 //BA.debugLineNum = 138;BA.debugLine="Toggle.SetAttr(\"offLabel\", l)";
_toggle._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("offLabel",(Object)(_l));
 //BA.debugLineNum = 139;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoggle)(this);
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoggle  _setonicon(String _icn) throws Exception{
 //BA.debugLineNum = 188;BA.debugLine="Sub SetOnIcon(icn As String) As WixToggle";
 //BA.debugLineNum = 189;BA.debugLine="Toggle.SetAttr(\"onIcon\",icn)";
_toggle._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("onIcon",(Object)(_icn));
 //BA.debugLineNum = 190;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoggle)(this);
 //BA.debugLineNum = 191;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoggle  _setonlabel(String _l) throws Exception{
 //BA.debugLineNum = 143;BA.debugLine="Sub SetOnLabel(l As String) As WixToggle";
 //BA.debugLineNum = 144;BA.debugLine="Toggle.SetAttr(\"onLabel\", l)";
_toggle._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("onLabel",(Object)(_l));
 //BA.debugLineNum = 145;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoggle)(this);
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoggle  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 18;BA.debugLine="Sub SetPadding(padding As Object) As WixToggle";
 //BA.debugLineNum = 19;BA.debugLine="Toggle.SetPadding(padding)";
_toggle._setpadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 20;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoggle)(this);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoggle  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 130;BA.debugLine="Sub SetParent(p As WixElement) As WixToggle";
 //BA.debugLineNum = 131;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 132;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoggle)(this);
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoggle  _setpopup(Object _popup) throws Exception{
 //BA.debugLineNum = 345;BA.debugLine="Sub SetPopup(popup As Object) As WixToggle";
 //BA.debugLineNum = 346;BA.debugLine="Toggle.SetAttr(\"popup\", popup)";
_toggle._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("popup",_popup);
 //BA.debugLineNum = 347;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoggle)(this);
 //BA.debugLineNum = 348;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoggle  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Sub SetResponsive(b As Object) As WixToggle";
 //BA.debugLineNum = 84;BA.debugLine="Toggle.SetResponsive(b)";
_toggle._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 85;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoggle)(this);
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoggle  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixToggle";
 //BA.debugLineNum = 90;BA.debugLine="Toggle.SetResponsiveCell(b)";
_toggle._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 91;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoggle)(this);
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoggle  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 58;BA.debugLine="Toggle.SetStyle(prop,sval)";
_toggle._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 59;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoggle)(this);
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoggle  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 48;BA.debugLine="Sub SetStyles(m As Map) As WixToggle";
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
 //BA.debugLineNum = 51;BA.debugLine="Toggle.SetStyle(k,v)";
_toggle._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 53;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoggle)(this);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoggle  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 63;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixToggle";
 //BA.debugLineNum = 64;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 65;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 66;BA.debugLine="Toggle.SetTemplate(os)";
_toggle._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 67;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoggle)(this);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoggle  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 124;BA.debugLine="Sub SetTooltip(tt As String) As WixToggle";
 //BA.debugLineNum = 125;BA.debugLine="Toggle.SetAttr(\"tooltip\", tt)";
_toggle._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("tooltip",(Object)(_tt));
 //BA.debugLineNum = 126;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoggle)(this);
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoggle  _settype(Object _stype) throws Exception{
 //BA.debugLineNum = 350;BA.debugLine="Sub SetType(sType As Object) As WixToggle";
 //BA.debugLineNum = 351;BA.debugLine="Toggle.SetAttr(\"type\", sType)";
_toggle._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("type",_stype);
 //BA.debugLineNum = 352;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoggle)(this);
 //BA.debugLineNum = 353;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoggle  _settypeicon(String _i) throws Exception{
 //BA.debugLineNum = 207;BA.debugLine="Sub SetTypeIcon(i As String) As WixToggle 'ignore";
 //BA.debugLineNum = 208;BA.debugLine="Toggle.SetAttr(\"type\",\"icon\")";
_toggle._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("type",(Object)("icon"));
 //BA.debugLineNum = 209;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoggle)(this);
 //BA.debugLineNum = 210;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoggle  _settypeicontop(String _r) throws Exception{
 //BA.debugLineNum = 219;BA.debugLine="Sub SetTypeIconTop(r As String) As WixToggle  'ign";
 //BA.debugLineNum = 220;BA.debugLine="Toggle.SetAttr(\"type\",\"iconTop\")";
_toggle._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("type",(Object)("iconTop"));
 //BA.debugLineNum = 221;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoggle)(this);
 //BA.debugLineNum = 222;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoggle  _settypeimage(String _r) throws Exception{
 //BA.debugLineNum = 213;BA.debugLine="Sub SetTypeImage(r As String) As WixToggle  'ignor";
 //BA.debugLineNum = 214;BA.debugLine="Toggle.SetAttr(\"type\",\"image\")";
_toggle._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("type",(Object)("image"));
 //BA.debugLineNum = 215;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoggle)(this);
 //BA.debugLineNum = 216;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoggle  _settypeimagetop(String _r) throws Exception{
 //BA.debugLineNum = 224;BA.debugLine="Sub SetTypeImageTop(r As String) As WixToggle  'ig";
 //BA.debugLineNum = 225;BA.debugLine="Toggle.SetAttr(\"type\",\"imageTop\")";
_toggle._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("type",(Object)("imageTop"));
 //BA.debugLineNum = 226;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoggle)(this);
 //BA.debugLineNum = 227;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoggle  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 159;BA.debugLine="Sub SetValue(v As String) As WixToggle";
 //BA.debugLineNum = 160;BA.debugLine="Toggle.SetValue(v)";
_toggle._setvalue /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_v);
 //BA.debugLineNum = 161;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoggle)(this);
 //BA.debugLineNum = 162;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoggle  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 236;BA.debugLine="Sub SetWidth(w As Object) As WixToggle";
 //BA.debugLineNum = 237;BA.debugLine="Toggle.SetWidth(w)";
_toggle._setwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 238;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoggle)(this);
 //BA.debugLineNum = 239;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
