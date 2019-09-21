package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixtabbar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixtabbar", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixtabbar.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _tabbar = null;
public anywheresoftware.b4a.objects.collections.List _options = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public String  _additem(String _iid,String _itext,String _iicon) throws Exception{
 //BA.debugLineNum = 139;BA.debugLine="Sub AddItem(iID As String, iText As String, iIcon";
 //BA.debugLineNum = 140;BA.debugLine="AddOption(iID, iText,iIcon)";
_addoption(_iid,_itext,_iicon);
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return "";
}
public String  _addoption(String _iid,String _itext,String _iicon) throws Exception{
b4j.Mashy.BANanoWebixDemo.uoenowhtml _icon = null;
b4j.Mashy.BANanoWebixDemo.uoenowhtml _text = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 159;BA.debugLine="Sub AddOption(iID As String, iText As String, iIco";
 //BA.debugLineNum = 160;BA.debugLine="iID = iID.tolowercase";
_iid = _iid.toLowerCase();
 //BA.debugLineNum = 162;BA.debugLine="Dim icon As UOENowHTML";
_icon = new b4j.Mashy.BANanoWebixDemo.uoenowhtml();
 //BA.debugLineNum = 163;BA.debugLine="icon.Initialize(\"\",\"span\")";
_icon._initialize /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (ba,"","span");
 //BA.debugLineNum = 164;BA.debugLine="icon.AddClass(\"webix_icon\")";
_icon._addclass /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ ("webix_icon");
 //BA.debugLineNum = 165;BA.debugLine="icon.AddClass(iIcon)";
_icon._addclass /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (_iicon);
 //BA.debugLineNum = 167;BA.debugLine="Dim text As UOENowHTML";
_text = new b4j.Mashy.BANanoWebixDemo.uoenowhtml();
 //BA.debugLineNum = 168;BA.debugLine="text.Initialize(\"\",\"span\")";
_text._initialize /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (ba,"","span");
 //BA.debugLineNum = 169;BA.debugLine="text.SetStyle(\"padding-left\", \"4px\")";
_text._setstyle /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ ("padding-left","4px");
 //BA.debugLineNum = 170;BA.debugLine="text.AddContent(iText)";
_text._addcontent /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (_itext);
 //BA.debugLineNum = 172;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 173;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 174;BA.debugLine="sb.Append(icon.HTML)";
_sb.Append(_icon._html /*String*/ ());
 //BA.debugLineNum = 175;BA.debugLine="sb.Append(text.HTML)";
_sb.Append(_text._html /*String*/ ());
 //BA.debugLineNum = 177;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 178;BA.debugLine="opt.Put(\"id\", iID)";
_opt.Put((Object)("id"),(Object)(_iid));
 //BA.debugLineNum = 179;BA.debugLine="opt.Put(\"value\", sb.ToString)";
_opt.Put((Object)("value"),(Object)(_sb.ToString()));
 //BA.debugLineNum = 180;BA.debugLine="options.Add(opt)";
_options.Add((Object)(_opt.getObject()));
 //BA.debugLineNum = 181;BA.debugLine="End Sub";
return "";
}
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 246;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 247;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 248;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 251;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 252;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 253;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 241;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 242;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 243;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public TabBar As WixElement";
_tabbar = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private options As List";
_options = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 6;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(sid As String) As WixTabBar";
 //BA.debugLineNum = 12;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 13;BA.debugLine="TabBar.Initialize(ID)";
_tabbar._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_id);
 //BA.debugLineNum = 14;BA.debugLine="TabBar.SetView(\"tabbar\")";
_tabbar._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("tabbar");
 //BA.debugLineNum = 15;BA.debugLine="options.Initialize";
_options.Initialize();
 //BA.debugLineNum = 16;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 17;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 211;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 212;BA.debugLine="TabBar.SetAttr(\"options\", options)";
_tabbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("options",(Object)(_options.getObject()));
 //BA.debugLineNum = 213;BA.debugLine="Return TabBar.item";
if (true) return _tabbar._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 214;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 73;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _setalign(Object _align) throws Exception{
 //BA.debugLineNum = 255;BA.debugLine="Sub SetAlign(align As Object) As WixTabBar";
 //BA.debugLineNum = 256;BA.debugLine="TabBar.SetAttr(\"align\", align)";
_tabbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("align",_align);
 //BA.debugLineNum = 257;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 258;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _setanimate(boolean _b) throws Exception{
 //BA.debugLineNum = 223;BA.debugLine="Sub SetAnimate(b As Boolean) As WixTabBar";
 //BA.debugLineNum = 224;BA.debugLine="TabBar.SetAttr(\"animate\", b)";
_tabbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("animate",(Object)(_b));
 //BA.debugLineNum = 225;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 226;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 32;BA.debugLine="Sub SetAttributes(m As Map) As WixTabBar";
 //BA.debugLineNum = 33;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 34;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 35;BA.debugLine="TabBar.SetAttr(k,v)";
_tabbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 37;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _setborderless(boolean _borderless) throws Exception{
 //BA.debugLineNum = 260;BA.debugLine="Sub SetBorderless(borderless As Boolean) As WixTab";
 //BA.debugLineNum = 261;BA.debugLine="TabBar.SetAttr(\"borderless\", borderless)";
_tabbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("borderless",(Object)(_borderless));
 //BA.debugLineNum = 262;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 263;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _setbottomlabel(Object _bottomlabel) throws Exception{
 //BA.debugLineNum = 265;BA.debugLine="Sub SetBottomLabel(bottomLabel As Object) As WixTa";
 //BA.debugLineNum = 266;BA.debugLine="TabBar.SetAttr(\"bottomLabel\", bottomLabel)";
_tabbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("bottomLabel",_bottomlabel);
 //BA.debugLineNum = 267;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 268;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _setbottomoffset(Object _bottomoffset) throws Exception{
 //BA.debugLineNum = 270;BA.debugLine="Sub SetBottomOffset(bottomOffset As Object) As Wix";
 //BA.debugLineNum = 271;BA.debugLine="TabBar.SetAttr(\"bottomOffset\", bottomOffset)";
_tabbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("bottomOffset",_bottomoffset);
 //BA.debugLineNum = 272;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 273;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _setbottompadding(Object _bottompadding) throws Exception{
 //BA.debugLineNum = 275;BA.debugLine="Sub SetBottomPadding(bottomPadding As Object) As W";
 //BA.debugLineNum = 276;BA.debugLine="TabBar.SetAttr(\"bottomPadding\", bottomPadding)";
_tabbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("bottomPadding",_bottompadding);
 //BA.debugLineNum = 277;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 278;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _setclick(Object _click) throws Exception{
 //BA.debugLineNum = 280;BA.debugLine="Sub SetClick(click As Object) As WixTabBar";
 //BA.debugLineNum = 281;BA.debugLine="TabBar.SetAttr(\"click\", click)";
_tabbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("click",_click);
 //BA.debugLineNum = 282;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 283;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _setclose(boolean _b) throws Exception{
 //BA.debugLineNum = 77;BA.debugLine="Sub SetClose(b As Boolean) As WixTabBar";
 //BA.debugLineNum = 78;BA.debugLine="TabBar.SetAttr(\"close\", b)";
_tabbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("close",(Object)(_b));
 //BA.debugLineNum = 79;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _setcontainer(Object _container) throws Exception{
 //BA.debugLineNum = 285;BA.debugLine="Sub SetContainer(container As Object) As WixTabBar";
 //BA.debugLineNum = 286;BA.debugLine="TabBar.SetAttr(\"container\", container)";
_tabbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("container",_container);
 //BA.debugLineNum = 287;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 288;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _setcss(Object _css) throws Exception{
 //BA.debugLineNum = 290;BA.debugLine="Sub SetCss(css As Object) As WixTabBar";
 //BA.debugLineNum = 291;BA.debugLine="TabBar.SetAttr(\"css\", css)";
_tabbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("css",_css);
 //BA.debugLineNum = 292;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 293;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _setdisabled(boolean _disabled) throws Exception{
 //BA.debugLineNum = 295;BA.debugLine="Sub SetDisabled(disabled As Boolean) As WixTabBar";
 //BA.debugLineNum = 296;BA.debugLine="TabBar.SetAttr(\"disabled\", disabled)";
_tabbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("disabled",(Object)(_disabled));
 //BA.debugLineNum = 297;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 298;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _setformat(Object _format) throws Exception{
 //BA.debugLineNum = 300;BA.debugLine="Sub SetFormat(format As Object) As WixTabBar";
 //BA.debugLineNum = 301;BA.debugLine="TabBar.SetAttr(\"format\", format)";
_tabbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("format",_format);
 //BA.debugLineNum = 302;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 303;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _setgravity(Object _gravity) throws Exception{
 //BA.debugLineNum = 305;BA.debugLine="Sub SetGravity(gravity As Object) As WixTabBar";
 //BA.debugLineNum = 306;BA.debugLine="TabBar.SetAttr(\"gravity\", gravity)";
_tabbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("gravity",_gravity);
 //BA.debugLineNum = 307;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 308;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 192;BA.debugLine="Sub SetHeight(h As Object) As WixTabBar";
 //BA.debugLineNum = 193;BA.debugLine="TabBar.SetAttr(\"height\", h)";
_tabbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("height",_h);
 //BA.debugLineNum = 194;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 195;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _sethidden(boolean _hidden) throws Exception{
 //BA.debugLineNum = 310;BA.debugLine="Sub SetHidden(hidden As Boolean) As WixTabBar";
 //BA.debugLineNum = 311;BA.debugLine="TabBar.SetAttr(\"hidden\", hidden)";
_tabbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hidden",(Object)(_hidden));
 //BA.debugLineNum = 312;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 313;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _sethotkey(Object _hotkey) throws Exception{
 //BA.debugLineNum = 315;BA.debugLine="Sub SetHotkey(hotkey As Object) As WixTabBar";
 //BA.debugLineNum = 316;BA.debugLine="TabBar.SetAttr(\"hotkey\", hotkey)";
_tabbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hotkey",_hotkey);
 //BA.debugLineNum = 317;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 318;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _setinputalign(Object _inputalign) throws Exception{
 //BA.debugLineNum = 320;BA.debugLine="Sub SetInputAlign(inputAlign As Object) As WixTabB";
 //BA.debugLineNum = 321;BA.debugLine="TabBar.SetAttr(\"inputAlign\", inputAlign)";
_tabbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("inputAlign",_inputalign);
 //BA.debugLineNum = 322;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 323;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _setinputheight(Object _inputheight) throws Exception{
 //BA.debugLineNum = 325;BA.debugLine="Sub SetInputHeight(inputHeight As Object) As WixTa";
 //BA.debugLineNum = 326;BA.debugLine="TabBar.SetAttr(\"inputHeight\", inputHeight)";
_tabbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("inputHeight",_inputheight);
 //BA.debugLineNum = 327;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 328;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _setinputwidth(Object _inputwidth) throws Exception{
 //BA.debugLineNum = 330;BA.debugLine="Sub SetInputWidth(inputWidth As Object) As WixTabB";
 //BA.debugLineNum = 331;BA.debugLine="TabBar.SetAttr(\"inputWidth\", inputWidth)";
_tabbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("inputWidth",_inputwidth);
 //BA.debugLineNum = 332;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 333;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _setinvalid(Object _invalid) throws Exception{
 //BA.debugLineNum = 335;BA.debugLine="Sub SetInvalid(invalid As Object) As WixTabBar";
 //BA.debugLineNum = 336;BA.debugLine="TabBar.SetAttr(\"invalid\", invalid)";
_tabbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("invalid",_invalid);
 //BA.debugLineNum = 337;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 338;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _setinvalidmessage(Object _invalidmessage) throws Exception{
 //BA.debugLineNum = 340;BA.debugLine="Sub SetInvalidMessage(invalidMessage As Object) As";
 //BA.debugLineNum = 341;BA.debugLine="TabBar.SetAttr(\"invalidMessage\", invalidMessage)";
_tabbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("invalidMessage",_invalidmessage);
 //BA.debugLineNum = 342;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 343;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _setkeepviews(boolean _b) throws Exception{
 //BA.debugLineNum = 229;BA.debugLine="Sub SetkeepViews(b As Boolean) As WixTabBar";
 //BA.debugLineNum = 230;BA.debugLine="TabBar.SetAttr(\"keepViews\", b)";
_tabbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("keepViews",(Object)(_b));
 //BA.debugLineNum = 231;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 232;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _setlabel(Object _label) throws Exception{
 //BA.debugLineNum = 345;BA.debugLine="Sub SetLabel(label As Object) As WixTabBar";
 //BA.debugLineNum = 346;BA.debugLine="TabBar.SetAttr(\"label\", label)";
_tabbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("label",_label);
 //BA.debugLineNum = 347;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 348;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _setlabelalign(Object _labelalign) throws Exception{
 //BA.debugLineNum = 350;BA.debugLine="Sub SetLabelAlign(labelAlign As Object) As WixTabB";
 //BA.debugLineNum = 351;BA.debugLine="TabBar.SetAttr(\"labelAlign\", labelAlign)";
_tabbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("labelAlign",_labelalign);
 //BA.debugLineNum = 352;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 353;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _setlabelposition(Object _labelposition) throws Exception{
 //BA.debugLineNum = 355;BA.debugLine="Sub SetLabelPosition(labelPosition As Object) As W";
 //BA.debugLineNum = 356;BA.debugLine="TabBar.SetAttr(\"labelPosition\", labelPosition)";
_tabbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("labelPosition",_labelposition);
 //BA.debugLineNum = 357;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 358;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _setlabelwidth(Object _labelwidth) throws Exception{
 //BA.debugLineNum = 360;BA.debugLine="Sub SetLabelWidth(labelWidth As Object) As WixTabB";
 //BA.debugLineNum = 361;BA.debugLine="TabBar.SetAttr(\"labelWidth\", labelWidth)";
_tabbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("labelWidth",_labelwidth);
 //BA.debugLineNum = 362;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 363;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 63;BA.debugLine="Sub SetMap(m As Map) As WixTabBar";
 //BA.debugLineNum = 64;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 65;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 66;BA.debugLine="TabBar.SetAttr(strKey,	strVal)";
_tabbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 68;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Sub SetMargin(margin As Object) As WixTabBar";
 //BA.debugLineNum = 28;BA.debugLine="TabBar.SetMargin(margin)";
_tabbar._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 29;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _setmaxheight(Object _maxheight) throws Exception{
 //BA.debugLineNum = 365;BA.debugLine="Sub SetMaxHeight(maxHeight As Object) As WixTabBar";
 //BA.debugLineNum = 366;BA.debugLine="TabBar.SetAttr(\"maxHeight\", maxHeight)";
_tabbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxHeight",_maxheight);
 //BA.debugLineNum = 367;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 368;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _setmaxwidth(Object _maxwidth) throws Exception{
 //BA.debugLineNum = 370;BA.debugLine="Sub SetMaxWidth(maxWidth As Object) As WixTabBar";
 //BA.debugLineNum = 371;BA.debugLine="TabBar.SetAttr(\"maxWidth\", maxWidth)";
_tabbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxWidth",_maxwidth);
 //BA.debugLineNum = 372;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 373;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 134;BA.debugLine="Sub SetMinHeight(h As Int) As WixTabBar";
 //BA.debugLineNum = 135;BA.debugLine="TabBar.SetMinHeight(h)";
_tabbar._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 136;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Sub SetMinWidth(w As Int) As WixTabBar";
 //BA.debugLineNum = 129;BA.debugLine="TabBar.SetMinWidth(w)";
_tabbar._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 130;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _setmoretemplate(Object _moretemplate) throws Exception{
 //BA.debugLineNum = 375;BA.debugLine="Sub SetMoreTemplate(moreTemplate As Object) As Wix";
 //BA.debugLineNum = 376;BA.debugLine="TabBar.SetAttr(\"moreTemplate\", moreTemplate)";
_tabbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("moreTemplate",_moretemplate);
 //BA.debugLineNum = 377;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 378;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _setmultiview(boolean _b) throws Exception{
 //BA.debugLineNum = 217;BA.debugLine="Sub SetMultiView(b As Boolean) As WixTabBar";
 //BA.debugLineNum = 218;BA.debugLine="TabBar.SetAttr(\"multiview\", b)";
_tabbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("multiview",(Object)(_b));
 //BA.debugLineNum = 219;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 220;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _setname(String _n) throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Sub SetName(n As String) As WixTabBar";
 //BA.debugLineNum = 110;BA.debugLine="TabBar.SetName(n)";
_tabbar._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 111;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _setoptions(anywheresoftware.b4a.objects.collections.List _o) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub SetOptions(o As List) As WixTabBar";
 //BA.debugLineNum = 85;BA.debugLine="options = o";
_options = _o;
 //BA.debugLineNum = 86;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _setoptionsjson(String _json) throws Exception{
 //BA.debugLineNum = 143;BA.debugLine="Sub SetOptionsJSON(json As String) As WixTabBar";
 //BA.debugLineNum = 144;BA.debugLine="TabBar.SetOptionsJSON(json)";
_tabbar._setoptionsjson /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_json);
 //BA.debugLineNum = 145;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _setoptionsmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _mk = "";
Object _mv = null;
 //BA.debugLineNum = 150;BA.debugLine="Sub SetOptionsMAP(m As Map) As WixTabBar";
 //BA.debugLineNum = 151;BA.debugLine="For Each mk As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_mk = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 152;BA.debugLine="Dim mv As Object = m.Get(mk)";
_mv = _m.Get((Object)(_mk));
 //BA.debugLineNum = 153;BA.debugLine="AddOption(mk, mv,\"\")";
_addoption(_mk,BA.ObjectToString(_mv),"");
 }
};
 //BA.debugLineNum = 155;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 156;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _setoptionwidth(Object _w) throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Sub SetOptionWidth(w As Object) As WixTabBar";
 //BA.debugLineNum = 96;BA.debugLine="TabBar.SetAttr(\"optionWidth\", w)";
_tabbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("optionWidth",_w);
 //BA.debugLineNum = 97;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub SetPadding(padding As Object) As WixTabBar";
 //BA.debugLineNum = 22;BA.debugLine="TabBar.SetPadding(padding)";
_tabbar._setpadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Sub SetParent(p As WixElement) As WixTabBar";
 //BA.debugLineNum = 57;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 58;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _setplaceholder(Object _placeholder) throws Exception{
 //BA.debugLineNum = 380;BA.debugLine="Sub SetPlaceholder(placeholder As Object) As WixTa";
 //BA.debugLineNum = 381;BA.debugLine="TabBar.SetAttr(\"placeholder\", placeholder)";
_tabbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("placeholder",_placeholder);
 //BA.debugLineNum = 382;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 383;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _setpopup(Object _popup) throws Exception{
 //BA.debugLineNum = 385;BA.debugLine="Sub SetPopup(popup As Object) As WixTabBar";
 //BA.debugLineNum = 386;BA.debugLine="TabBar.SetAttr(\"popup\", popup)";
_tabbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("popup",_popup);
 //BA.debugLineNum = 387;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 388;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _setpopuptemplate(Object _popuptemplate) throws Exception{
 //BA.debugLineNum = 390;BA.debugLine="Sub SetPopupTemplate(popupTemplate As Object) As W";
 //BA.debugLineNum = 391;BA.debugLine="TabBar.SetAttr(\"popupTemplate\", popupTemplate)";
_tabbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("popupTemplate",_popuptemplate);
 //BA.debugLineNum = 392;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 393;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _setpopupwidth(Object _popupwidth) throws Exception{
 //BA.debugLineNum = 395;BA.debugLine="Sub SetPopupWidth(popupWidth As Object) As WixTabB";
 //BA.debugLineNum = 396;BA.debugLine="TabBar.SetAttr(\"popupWidth\", popupWidth)";
_tabbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("popupWidth",_popupwidth);
 //BA.debugLineNum = 397;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 398;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _setreadonly(boolean _readonly) throws Exception{
 //BA.debugLineNum = 400;BA.debugLine="Sub SetReadonly(readonly As Boolean) As WixTabBar";
 //BA.debugLineNum = 401;BA.debugLine="TabBar.SetAttr(\"readonly\", readonly)";
_tabbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("readonly",(Object)(_readonly));
 //BA.debugLineNum = 402;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 403;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _setrelatedaction(Object _relatedaction) throws Exception{
 //BA.debugLineNum = 405;BA.debugLine="Sub SetRelatedAction(relatedAction As Object) As W";
 //BA.debugLineNum = 406;BA.debugLine="TabBar.SetAttr(\"relatedAction\", relatedAction)";
_tabbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("relatedAction",_relatedaction);
 //BA.debugLineNum = 407;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 408;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _setrelatedview(Object _relatedview) throws Exception{
 //BA.debugLineNum = 410;BA.debugLine="Sub SetRelatedView(relatedView As Object) As WixTa";
 //BA.debugLineNum = 411;BA.debugLine="TabBar.SetAttr(\"relatedView\", relatedView)";
_tabbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("relatedView",_relatedview);
 //BA.debugLineNum = 412;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 413;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _setrequired(boolean _required) throws Exception{
 //BA.debugLineNum = 415;BA.debugLine="Sub SetRequired(required As Boolean) As WixTabBar";
 //BA.debugLineNum = 416;BA.debugLine="TabBar.SetAttr(\"required\", required)";
_tabbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("required",(Object)(_required));
 //BA.debugLineNum = 417;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 418;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Sub SetResponsive(b As Object) As WixTabBar";
 //BA.debugLineNum = 116;BA.debugLine="TabBar.SetResponsive(b)";
_tabbar._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 117;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 121;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixTabBar";
 //BA.debugLineNum = 122;BA.debugLine="TabBar.SetResponsiveCell(b)";
_tabbar._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 123;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 50;BA.debugLine="TabBar.SetStyle(prop,sval)";
_tabbar._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 51;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 40;BA.debugLine="Sub SetStyles(m As Map) As WixTabBar";
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
 //BA.debugLineNum = 43;BA.debugLine="TabBar.SetStyle(k,v)";
_tabbar._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 45;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _setsuggest(Object _suggest) throws Exception{
 //BA.debugLineNum = 420;BA.debugLine="Sub SetSuggest(suggest As Object) As WixTabBar";
 //BA.debugLineNum = 421;BA.debugLine="TabBar.SetAttr(\"suggest\", suggest)";
_tabbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("suggest",_suggest);
 //BA.debugLineNum = 422;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 423;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _settabbarpopup(Object _tabbarpopup) throws Exception{
 //BA.debugLineNum = 445;BA.debugLine="Sub SetTabbarPopup(tabbarPopup As Object) As WixTa";
 //BA.debugLineNum = 446;BA.debugLine="TabBar.SetAttr(\"tabbarPopup\", tabbarPopup)";
_tabbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("tabbarPopup",_tabbarpopup);
 //BA.debugLineNum = 447;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 448;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _settabmargin(Object _tabmargin) throws Exception{
 //BA.debugLineNum = 425;BA.debugLine="Sub SetTabMargin(tabMargin As Object) As WixTabBar";
 //BA.debugLineNum = 426;BA.debugLine="TabBar.SetAttr(\"tabMargin\", tabMargin)";
_tabbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("tabMargin",_tabmargin);
 //BA.debugLineNum = 427;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 428;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _settabminwidth(Object _tabminwidth) throws Exception{
 //BA.debugLineNum = 430;BA.debugLine="Sub SetTabMinWidth(tabMinWidth As Object) As WixTa";
 //BA.debugLineNum = 431;BA.debugLine="TabBar.SetAttr(\"tabMinWidth\", tabMinWidth)";
_tabbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("tabMinWidth",_tabminwidth);
 //BA.debugLineNum = 432;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 433;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _settabmorewidth(Object _tabmorewidth) throws Exception{
 //BA.debugLineNum = 435;BA.debugLine="Sub SetTabMoreWidth(tabMoreWidth As Object) As Wix";
 //BA.debugLineNum = 436;BA.debugLine="TabBar.SetAttr(\"tabMoreWidth\", tabMoreWidth)";
_tabbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("tabMoreWidth",_tabmorewidth);
 //BA.debugLineNum = 437;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 438;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _settaboffset(Object _taboffset) throws Exception{
 //BA.debugLineNum = 440;BA.debugLine="Sub SetTabOffset(tabOffset As Object) As WixTabBar";
 //BA.debugLineNum = 441;BA.debugLine="TabBar.SetAttr(\"tabOffset\", tabOffset)";
_tabbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("tabOffset",_taboffset);
 //BA.debugLineNum = 442;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 443;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 101;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixTabBar";
 //BA.debugLineNum = 102;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 103;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 104;BA.debugLine="TabBar.SetTemplate(os)";
_tabbar._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 105;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 185;BA.debugLine="Sub SetTooltip(tt As String) As WixTabBar";
 //BA.debugLineNum = 186;BA.debugLine="TabBar.SetTooltip(tt)";
_tabbar._settooltip /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_tt);
 //BA.debugLineNum = 187;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _settopoffset(Object _topoffset) throws Exception{
 //BA.debugLineNum = 450;BA.debugLine="Sub SetTopOffset(topOffset As Object) As WixTabBar";
 //BA.debugLineNum = 451;BA.debugLine="TabBar.SetAttr(\"topOffset\", topOffset)";
_tabbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("topOffset",_topoffset);
 //BA.debugLineNum = 452;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 453;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _settype(Object _w) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub SetType(w As Object) As WixTabBar";
 //BA.debugLineNum = 90;BA.debugLine="TabBar.SetAttr(\"type\", w)";
_tabbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("type",_w);
 //BA.debugLineNum = 91;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _settypebottom(boolean _b) throws Exception{
 //BA.debugLineNum = 205;BA.debugLine="Sub SetTypeBottom(b As Boolean) As WixTabBar   'ig";
 //BA.debugLineNum = 206;BA.debugLine="TabBar.SetType(\"bottom\")";
_tabbar._settype /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("bottom");
 //BA.debugLineNum = 207;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 208;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _setvalidate(Object _validate) throws Exception{
 //BA.debugLineNum = 455;BA.debugLine="Sub SetValidate(validate As Object) As WixTabBar";
 //BA.debugLineNum = 456;BA.debugLine="TabBar.SetAttr(\"validate\", validate)";
_tabbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("validate",_validate);
 //BA.debugLineNum = 457;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 458;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _setvalidateevent(Object _validateevent) throws Exception{
 //BA.debugLineNum = 460;BA.debugLine="Sub SetValidateEvent(validateEvent As Object) As W";
 //BA.debugLineNum = 461;BA.debugLine="TabBar.SetAttr(\"validateEvent\", validateEvent)";
_tabbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("validateEvent",_validateevent);
 //BA.debugLineNum = 462;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 463;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _setvalue(Object _v) throws Exception{
 //BA.debugLineNum = 235;BA.debugLine="Sub SetValue(v As Object) As WixTabBar";
 //BA.debugLineNum = 236;BA.debugLine="TabBar.SetAttr(\"value\", v)";
_tabbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("value",_v);
 //BA.debugLineNum = 237;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 238;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 198;BA.debugLine="Sub SetWidth(w As Object) As WixTabBar";
 //BA.debugLineNum = 199;BA.debugLine="TabBar.SetAttr(\"width\", w)";
_tabbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("width",_w);
 //BA.debugLineNum = 200;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 201;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _setycount(Object _ycount) throws Exception{
 //BA.debugLineNum = 465;BA.debugLine="Sub SetYCount(yCount As Object) As WixTabBar";
 //BA.debugLineNum = 466;BA.debugLine="TabBar.SetAttr(\"yCount\", yCount)";
_tabbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("yCount",_ycount);
 //BA.debugLineNum = 467;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabbar)(this);
 //BA.debugLineNum = 468;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
