package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixbutton extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixbutton", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixbutton.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _button = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 311;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 312;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 313;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 316;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 317;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 318;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 306;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 307;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 308;BA.debugLine="End Sub";
return "";
}
public String  _addtotoolbar(b4j.Mashy.BANanoWebixDemo.wixtoolbar _tblb) throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="Sub AddToToolbar(tblB As WixToolBar)";
 //BA.debugLineNum = 128;BA.debugLine="tblB.ToolBar.AddColumns(Item)";
_tblb._toolbar /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Public Button As WixElement";
_button = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 6;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixbutton  _initialize(anywheresoftware.b4a.BA _ba,String _bid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(bID As String) As WixButton";
 //BA.debugLineNum = 11;BA.debugLine="ID = bID.ToLowerCase";
_id = _bid.toLowerCase();
 //BA.debugLineNum = 12;BA.debugLine="Button.Initialize(ID).SetView(\"button\")";
_button._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_id)._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("button");
 //BA.debugLineNum = 13;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 14;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixbutton)(this);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 144;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 145;BA.debugLine="Return Button.item";
if (true) return _button._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 118;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixbutton  _setalign(Object _align) throws Exception{
 //BA.debugLineNum = 320;BA.debugLine="Sub SetAlign(align As Object) As WixButton";
 //BA.debugLineNum = 321;BA.debugLine="Button.SetAttr(\"align\", align)";
_button._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("align",_align);
 //BA.debugLineNum = 322;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixbutton)(this);
 //BA.debugLineNum = 323;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixbutton  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 287;BA.debugLine="Sub SetAlignCenter(r As String) As WixButton 'igno";
 //BA.debugLineNum = 288;BA.debugLine="Button.setAligncenter(\"\")";
_button._setaligncenter /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 289;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixbutton)(this);
 //BA.debugLineNum = 290;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixbutton  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 293;BA.debugLine="Sub SetAlignLeft(r As String) As WixButton 'ignore";
 //BA.debugLineNum = 294;BA.debugLine="Button.SetAlignleft(\"\")";
_button._setalignleft /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 295;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixbutton)(this);
 //BA.debugLineNum = 296;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixbutton  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 281;BA.debugLine="Sub SetAlignRight(r As String) As WixButton 'ignor";
 //BA.debugLineNum = 282;BA.debugLine="Button.setAlignright(\"\")";
_button._setalignright /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 283;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixbutton)(this);
 //BA.debugLineNum = 284;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixbutton  _setanimate(boolean _animate) throws Exception{
 //BA.debugLineNum = 325;BA.debugLine="Sub SetAnimate(animate As Boolean) As WixButton";
 //BA.debugLineNum = 326;BA.debugLine="Button.SetAttr(\"animate\", animate)";
_button._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("animate",(Object)(_animate));
 //BA.debugLineNum = 327;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixbutton)(this);
 //BA.debugLineNum = 328;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixbutton  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 264;BA.debugLine="Sub SetAttributes(m As Map) As WixButton";
 //BA.debugLineNum = 265;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 266;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 267;BA.debugLine="Button.SetAttr(k,v)";
_button._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 269;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixbutton)(this);
 //BA.debugLineNum = 270;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixbutton  _setautowidth(boolean _b) throws Exception{
 //BA.debugLineNum = 299;BA.debugLine="Sub SetAutoWidth(b As Boolean) As WixButton 'ignor";
 //BA.debugLineNum = 300;BA.debugLine="Button.SetAutoWidth(b)";
_button._setautowidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 301;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixbutton)(this);
 //BA.debugLineNum = 302;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixbutton  _setbadge(Object _b) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub SetBadge(b As Object) As WixButton";
 //BA.debugLineNum = 54;BA.debugLine="Button.SetAttr(\"badge\", b)";
_button._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("badge",_b);
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixbutton)(this);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixbutton  _setbatch(int _b) throws Exception{
 //BA.debugLineNum = 167;BA.debugLine="Sub SetBatch(b As Int) As WixButton";
 //BA.debugLineNum = 168;BA.debugLine="Button.SetBatch(b)";
_button._setbatch /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 169;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixbutton)(this);
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixbutton  _setborderless(boolean _borderless) throws Exception{
 //BA.debugLineNum = 331;BA.debugLine="Sub SetBorderless(borderless As Boolean) As WixBut";
 //BA.debugLineNum = 332;BA.debugLine="Button.SetAttr(\"borderless\", borderless)";
_button._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("borderless",(Object)(_borderless));
 //BA.debugLineNum = 333;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixbutton)(this);
 //BA.debugLineNum = 334;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixbutton  _setclick(com.ab.banano.BANanoObject _e) throws Exception{
 //BA.debugLineNum = 138;BA.debugLine="Sub SetClick(e As BANanoObject) As WixButton";
 //BA.debugLineNum = 139;BA.debugLine="Button.SetAttr(\"click\", e)";
_button._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("click",(Object)(_e));
 //BA.debugLineNum = 140;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixbutton)(this);
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixbutton  _setcontainer(Object _container) throws Exception{
 //BA.debugLineNum = 337;BA.debugLine="Sub SetContainer(container As Object) As WixButton";
 //BA.debugLineNum = 338;BA.debugLine="Button.SetAttr(\"container\", container)";
_button._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("container",_container);
 //BA.debugLineNum = 339;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixbutton)(this);
 //BA.debugLineNum = 340;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixbutton  _setcss(Object _css) throws Exception{
 //BA.debugLineNum = 342;BA.debugLine="Sub SetCss(css As Object) As WixButton";
 //BA.debugLineNum = 343;BA.debugLine="Button.SetAttr(\"css\", css)";
_button._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("css",_css);
 //BA.debugLineNum = 344;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixbutton)(this);
 //BA.debugLineNum = 345;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixbutton  _setcssdanger(boolean _b) throws Exception{
 //BA.debugLineNum = 197;BA.debugLine="Sub SetCSSDanger(b As Boolean) As WixButton     'i";
 //BA.debugLineNum = 198;BA.debugLine="Button.SetCSS(\"webix_danger\")";
_button._setcss /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("webix_danger");
 //BA.debugLineNum = 199;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixbutton)(this);
 //BA.debugLineNum = 200;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixbutton  _setcssprimary(boolean _b) throws Exception{
 //BA.debugLineNum = 185;BA.debugLine="Sub SetCSSPrimary(b As Boolean) As WixButton   'ig";
 //BA.debugLineNum = 186;BA.debugLine="Button.SetCSS(\"webix_primary\")";
_button._setcss /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("webix_primary");
 //BA.debugLineNum = 187;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixbutton)(this);
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixbutton  _setcsssecondary(boolean _b) throws Exception{
 //BA.debugLineNum = 203;BA.debugLine="Sub SetCSSSecondary(b As Boolean) As WixButton";
 //BA.debugLineNum = 204;BA.debugLine="Button.SetCSS(\"webix_secondary\")";
_button._setcss /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("webix_secondary");
 //BA.debugLineNum = 205;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixbutton)(this);
 //BA.debugLineNum = 206;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixbutton  _setcsstransparent(boolean _b) throws Exception{
 //BA.debugLineNum = 191;BA.debugLine="Sub SetCSSTransparent(b As Boolean) As WixButton";
 //BA.debugLineNum = 192;BA.debugLine="Button.SetCSS(\"webix_transparent\")";
_button._setcss /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("webix_transparent");
 //BA.debugLineNum = 193;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixbutton)(this);
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixbutton  _setdisabled(boolean _b) throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Sub SetDisabled(b As Boolean) As WixButton";
 //BA.debugLineNum = 36;BA.debugLine="Button.SetAttr(\"disabled\", b)";
_button._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("disabled",(Object)(_b));
 //BA.debugLineNum = 37;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixbutton)(this);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return null;
}
public String  _setfab(boolean _b) throws Exception{
 //BA.debugLineNum = 378;BA.debugLine="Sub SetFAB(b As Boolean)   'ignore";
 //BA.debugLineNum = 379;BA.debugLine="Button.SetStyle(\"border-radius\",\"60px\")";
_button._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("border-radius","60px");
 //BA.debugLineNum = 380;BA.debugLine="Button.SetStyle(\"font-size\",\"60px\")";
_button._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("font-size","60px");
 //BA.debugLineNum = 381;BA.debugLine="Button.SetStyle(\"line-height\",\"47px\")";
_button._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("line-height","47px");
 //BA.debugLineNum = 382;BA.debugLine="Button.SetWidth(60)";
_button._setwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(60));
 //BA.debugLineNum = 383;BA.debugLine="Button.SetHeight(60)";
_button._setheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(60));
 //BA.debugLineNum = 384;BA.debugLine="Button.SetStyle(\"position\",\"fixed\")";
_button._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("position","fixed");
 //BA.debugLineNum = 385;BA.debugLine="Button.SetStyle(\"bottom\",\"1rem\")";
_button._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("bottom","1rem");
 //BA.debugLineNum = 386;BA.debugLine="Button.SetStyle(\"right\",\"1rem\")";
_button._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("right","1rem");
 //BA.debugLineNum = 387;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixbutton  _setgravity(Object _gravity) throws Exception{
 //BA.debugLineNum = 348;BA.debugLine="Sub SetGravity(gravity As Object) As WixButton";
 //BA.debugLineNum = 349;BA.debugLine="Button.SetAttr(\"gravity\", gravity)";
_button._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("gravity",_gravity);
 //BA.debugLineNum = 350;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixbutton)(this);
 //BA.debugLineNum = 351;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixbutton  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 252;BA.debugLine="Sub SetHeight(h As Object) As WixButton";
 //BA.debugLineNum = 253;BA.debugLine="Button.SetHeight(h)";
_button._setheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 254;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixbutton)(this);
 //BA.debugLineNum = 255;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixbutton  _sethidden(boolean _b) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Sub SetHidden(b As Boolean) As WixButton";
 //BA.debugLineNum = 31;BA.debugLine="Button.SetAttr(\"hidden\", b)";
_button._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hidden",(Object)(_b));
 //BA.debugLineNum = 32;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixbutton)(this);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixbutton  _sethotkey(Object _hotkey) throws Exception{
 //BA.debugLineNum = 353;BA.debugLine="Sub SetHotkey(hotkey As Object) As WixButton";
 //BA.debugLineNum = 354;BA.debugLine="Button.SetAttr(\"hotkey\", hotkey)";
_button._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hotkey",_hotkey);
 //BA.debugLineNum = 355;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixbutton)(this);
 //BA.debugLineNum = 356;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixbutton  _seticon(String _icn) throws Exception{
 //BA.debugLineNum = 179;BA.debugLine="Sub SetIcon(icn As String) As WixButton";
 //BA.debugLineNum = 180;BA.debugLine="Button.SetAttr(\"icon\", icn)";
_button._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("icon",(Object)(_icn));
 //BA.debugLineNum = 181;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixbutton)(this);
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixbutton  _setimage(String _img) throws Exception{
 //BA.debugLineNum = 173;BA.debugLine="Sub SetImage(img As String) As WixButton";
 //BA.debugLineNum = 174;BA.debugLine="Button.SetAttr(\"image\", img)";
_button._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("image",(Object)(_img));
 //BA.debugLineNum = 175;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixbutton)(this);
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixbutton  _setinputheight(Object _inputheight) throws Exception{
 //BA.debugLineNum = 358;BA.debugLine="Sub SetInputHeight(inputHeight As Object) As WixBu";
 //BA.debugLineNum = 359;BA.debugLine="Button.SetAttr(\"inputHeight\", inputHeight)";
_button._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("inputHeight",_inputheight);
 //BA.debugLineNum = 360;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixbutton)(this);
 //BA.debugLineNum = 361;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixbutton  _setinputwidth(int _w) throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Sub SetInputWidth(w As Int) As WixButton";
 //BA.debugLineNum = 100;BA.debugLine="Button.SetInputWidth(w)";
_button._setinputwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 101;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixbutton)(this);
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixbutton  _setlabel(String _lbl) throws Exception{
 //BA.debugLineNum = 215;BA.debugLine="Sub SetLabel(lbl As String) As WixButton";
 //BA.debugLineNum = 216;BA.debugLine="Button.SetLabel(lbl)";
_button._setlabel /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_lbl);
 //BA.debugLineNum = 217;BA.debugLine="Button.Setvalue(lbl)";
_button._setvalue /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_lbl);
 //BA.debugLineNum = 218;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixbutton)(this);
 //BA.debugLineNum = 219;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixbutton  _setlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Sub SetLabelAlign(a As String) As WixButton";
 //BA.debugLineNum = 20;BA.debugLine="Button.SetLabelAlign(a)";
_button._setlabelalign /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_a);
 //BA.debugLineNum = 21;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixbutton)(this);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixbutton  _setlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Sub SetLabelPosition(p As String) As WixButton";
 //BA.debugLineNum = 26;BA.debugLine="Button.SetLabelPosition(p)";
_button._setlabelposition /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_p);
 //BA.debugLineNum = 27;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixbutton)(this);
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixbutton  _setlabelwidth(int _w) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Sub SetLabelWidth(w As Int) As WixButton";
 //BA.debugLineNum = 42;BA.debugLine="Button.SetLabelWidth(w)";
_button._setlabelwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 43;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixbutton)(this);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixbutton  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 90;BA.debugLine="Sub SetMap(m As Map) As WixButton";
 //BA.debugLineNum = 91;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 92;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 93;BA.debugLine="Button.SetAttr(strKey,	strVal)";
_button._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 95;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixbutton)(this);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixbutton  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 161;BA.debugLine="Sub SetMargin(margin As Object) As WixButton";
 //BA.debugLineNum = 162;BA.debugLine="Button.SetMargin(margin)";
_button._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 163;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixbutton)(this);
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixbutton  _setmaxheight(Object _maxheight) throws Exception{
 //BA.debugLineNum = 363;BA.debugLine="Sub SetMaxHeight(maxHeight As Object) As WixButton";
 //BA.debugLineNum = 364;BA.debugLine="Button.SetAttr(\"maxHeight\", maxHeight)";
_button._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxHeight",_maxheight);
 //BA.debugLineNum = 365;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixbutton)(this);
 //BA.debugLineNum = 366;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixbutton  _setmaxwidth(Object _maxwidth) throws Exception{
 //BA.debugLineNum = 368;BA.debugLine="Sub SetMaxWidth(maxWidth As Object) As WixButton";
 //BA.debugLineNum = 369;BA.debugLine="Button.SetAttr(\"maxWidth\", maxWidth)";
_button._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxWidth",_maxwidth);
 //BA.debugLineNum = 370;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixbutton)(this);
 //BA.debugLineNum = 371;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixbutton  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub SetMinHeight(h As Int) As WixButton";
 //BA.debugLineNum = 85;BA.debugLine="Button.SetMinHeight(h)";
_button._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 86;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixbutton)(this);
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixbutton  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub SetMinWidth(w As Int) As WixButton";
 //BA.debugLineNum = 79;BA.debugLine="Button.SetMinWidth(w)";
_button._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 80;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixbutton)(this);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixbutton  _setname(String _n) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Sub SetName(n As String) As WixButton";
 //BA.debugLineNum = 60;BA.debugLine="Button.SetName(n)";
_button._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 61;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixbutton)(this);
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixbutton  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 155;BA.debugLine="Sub SetPadding(padding As Object) As WixButton";
 //BA.debugLineNum = 156;BA.debugLine="Button.SetPadding(padding)";
_button._setpadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 157;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixbutton)(this);
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixbutton  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 149;BA.debugLine="Sub SetParent(p As WixElement) As WixButton";
 //BA.debugLineNum = 150;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 151;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixbutton)(this);
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixbutton  _setpopup(Object _i) throws Exception{
 //BA.debugLineNum = 209;BA.debugLine="Sub SetPopUp(i As Object) As WixButton     'ignore";
 //BA.debugLineNum = 210;BA.debugLine="Button.SetAttr(\"popup\", i)";
_button._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("popup",_i);
 //BA.debugLineNum = 211;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixbutton)(this);
 //BA.debugLineNum = 212;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixbutton  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Sub SetResponsive(b As Object) As WixButton";
 //BA.debugLineNum = 66;BA.debugLine="Button.SetResponsive(b)";
_button._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 67;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixbutton)(this);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixbutton  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixButton";
 //BA.debugLineNum = 72;BA.debugLine="Button.SetResponsiveCell(b)";
_button._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 73;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixbutton)(this);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixbutton  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 111;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 112;BA.debugLine="Button.SetStyle(prop,val)";
_button._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 113;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixbutton)(this);
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixbutton  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 272;BA.debugLine="Sub SetStyles(m As Map) As WixButton";
 //BA.debugLineNum = 273;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 274;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 275;BA.debugLine="Button.SetStyle(k,v)";
_button._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 277;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixbutton)(this);
 //BA.debugLineNum = 278;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixbutton  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 46;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixButton";
 //BA.debugLineNum = 47;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 48;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 49;BA.debugLine="Button.SetTemplate(os)";
_button._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 50;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixbutton)(this);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixbutton  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 105;BA.debugLine="Sub SetTooltip(tt As String) As WixButton";
 //BA.debugLineNum = 106;BA.debugLine="Button.SetAttr(\"tooltip\", tt)";
_button._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("tooltip",(Object)(_tt));
 //BA.debugLineNum = 107;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixbutton)(this);
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixbutton  _settype(Object _stype) throws Exception{
 //BA.debugLineNum = 373;BA.debugLine="Sub SetType(sType As Object) As WixButton";
 //BA.debugLineNum = 374;BA.debugLine="Button.SetAttr(\"type\", sType)";
_button._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("type",_stype);
 //BA.debugLineNum = 375;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixbutton)(this);
 //BA.debugLineNum = 376;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixbutton  _settypeicon(String _i) throws Exception{
 //BA.debugLineNum = 228;BA.debugLine="Sub SetTypeIcon(i As String) As WixButton 'ignore";
 //BA.debugLineNum = 229;BA.debugLine="Button.SetAttr(\"type\", \"icon\")";
_button._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("type",(Object)("icon"));
 //BA.debugLineNum = 230;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixbutton)(this);
 //BA.debugLineNum = 231;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixbutton  _settypeicontop(String _r) throws Exception{
 //BA.debugLineNum = 246;BA.debugLine="Sub SetTypeIconTop(r As String) As WixButton  'ign";
 //BA.debugLineNum = 247;BA.debugLine="Button.SetAttr(\"type\", \"iconTop\")";
_button._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("type",(Object)("iconTop"));
 //BA.debugLineNum = 248;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixbutton)(this);
 //BA.debugLineNum = 249;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixbutton  _settypeimage(String _r) throws Exception{
 //BA.debugLineNum = 234;BA.debugLine="Sub SetTypeImage(r As String) As WixButton  'ignor";
 //BA.debugLineNum = 235;BA.debugLine="Button.SetAttr(\"type\", \"image\")";
_button._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("type",(Object)("image"));
 //BA.debugLineNum = 236;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixbutton)(this);
 //BA.debugLineNum = 237;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixbutton  _settypeimagetop(String _r) throws Exception{
 //BA.debugLineNum = 240;BA.debugLine="Sub SetTypeImageTop(r As String) As WixButton  'ig";
 //BA.debugLineNum = 241;BA.debugLine="Button.SetAttr(\"type\", \"imageTop\")";
_button._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("type",(Object)("imageTop"));
 //BA.debugLineNum = 242;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixbutton)(this);
 //BA.debugLineNum = 243;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixbutton  _settypestandard(String _i) throws Exception{
 //BA.debugLineNum = 222;BA.debugLine="Sub SetTypeStandard(i As String) As WixButton 'ign";
 //BA.debugLineNum = 223;BA.debugLine="Button.SetAttr(\"type\", \"standard\")";
_button._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("type",(Object)("standard"));
 //BA.debugLineNum = 224;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixbutton)(this);
 //BA.debugLineNum = 225;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixbutton  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 132;BA.debugLine="Sub SetValue(v As String) As WixButton";
 //BA.debugLineNum = 133;BA.debugLine="Button.SetValue(v)";
_button._setvalue /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_v);
 //BA.debugLineNum = 134;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixbutton)(this);
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixbutton  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 258;BA.debugLine="Sub SetWidth(w As Object) As WixButton";
 //BA.debugLineNum = 259;BA.debugLine="Button.SetWidth(w)";
_button._setwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 260;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixbutton)(this);
 //BA.debugLineNum = 261;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
