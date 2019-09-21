package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixvideo extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixvideo", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixvideo.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _video = null;
public anywheresoftware.b4a.objects.collections.List _sources = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 176;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 177;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 178;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 181;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 182;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 183;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.Mashy.BANanoWebixDemo.wixform _frm) throws Exception{
 //BA.debugLineNum = 147;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 148;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 149;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 171;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 172;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Video As WixElement";
_video = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private sources As List";
_sources = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 6;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixvideo  _initialize(anywheresoftware.b4a.BA _ba,String _iid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 57;BA.debugLine="Public Sub Initialize(iID As String) As WixVideo";
 //BA.debugLineNum = 58;BA.debugLine="ID = iID.tolowercase";
_id = _iid.toLowerCase();
 //BA.debugLineNum = 59;BA.debugLine="Video.Initialize(iID).SetView(\"video\")";
_video._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_iid)._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("video");
 //BA.debugLineNum = 60;BA.debugLine="sources.Initialize";
_sources.Initialize();
 //BA.debugLineNum = 61;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixvideo)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 152;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 153;BA.debugLine="Video.SetAttr(\"src\", sources)";
_video._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("src",(Object)(_sources.getObject()));
 //BA.debugLineNum = 154;BA.debugLine="Return Video.item";
if (true) return _video._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 67;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixvideo  _setanimate(boolean _animate) throws Exception{
 //BA.debugLineNum = 185;BA.debugLine="Sub SetAnimate(animate As Boolean) As WixVideo";
 //BA.debugLineNum = 186;BA.debugLine="Video.SetAttr(\"animate\", animate)";
_video._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("animate",(Object)(_animate));
 //BA.debugLineNum = 187;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixvideo)(this);
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixvideo  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 33;BA.debugLine="Sub SetAttributes(m As Map) As WixVideo";
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
 //BA.debugLineNum = 36;BA.debugLine="Video.SetAttr(k,v)";
_video._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 38;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixvideo)(this);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixvideo  _setautoplay(boolean _b) throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Sub SetAutoPlay(b As Boolean) As WixVideo";
 //BA.debugLineNum = 124;BA.debugLine="Video.SetAttr(\"autoplay\", b)";
_video._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("autoplay",(Object)(_b));
 //BA.debugLineNum = 125;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixvideo)(this);
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixvideo  _setborderless(boolean _b) throws Exception{
 //BA.debugLineNum = 10;BA.debugLine="Sub SetBorderLess(b As Boolean) As WixVideo";
 //BA.debugLineNum = 11;BA.debugLine="Video.SetAttr(\"borderless\", b)";
_video._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("borderless",(Object)(_b));
 //BA.debugLineNum = 12;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixvideo)(this);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixvideo  _setcontainer(Object _container) throws Exception{
 //BA.debugLineNum = 190;BA.debugLine="Sub SetContainer(container As Object) As WixVideo";
 //BA.debugLineNum = 191;BA.debugLine="Video.SetAttr(\"container\", container)";
_video._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("container",_container);
 //BA.debugLineNum = 192;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixvideo)(this);
 //BA.debugLineNum = 193;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixvideo  _setcontrols(boolean _b) throws Exception{
 //BA.debugLineNum = 129;BA.debugLine="Sub SetControls(b As Boolean) As WixVideo";
 //BA.debugLineNum = 130;BA.debugLine="Video.SetAttr(\"controls\", b)";
_video._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("controls",(Object)(_b));
 //BA.debugLineNum = 131;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixvideo)(this);
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixvideo  _setcss(Object _css) throws Exception{
 //BA.debugLineNum = 195;BA.debugLine="Sub SetCss(css As Object) As WixVideo";
 //BA.debugLineNum = 196;BA.debugLine="Video.SetAttr(\"css\", css)";
_video._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("css",_css);
 //BA.debugLineNum = 197;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixvideo)(this);
 //BA.debugLineNum = 198;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixvideo  _setdisabled(boolean _disabled) throws Exception{
 //BA.debugLineNum = 200;BA.debugLine="Sub SetDisabled(disabled As Boolean) As WixVideo";
 //BA.debugLineNum = 201;BA.debugLine="Video.SetAttr(\"disabled\", disabled)";
_video._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("disabled",(Object)(_disabled));
 //BA.debugLineNum = 202;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixvideo)(this);
 //BA.debugLineNum = 203;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixvideo  _setgravity(Object _gravity) throws Exception{
 //BA.debugLineNum = 205;BA.debugLine="Sub SetGravity(gravity As Object) As WixVideo";
 //BA.debugLineNum = 206;BA.debugLine="Video.SetAttr(\"gravity\", gravity)";
_video._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("gravity",_gravity);
 //BA.debugLineNum = 207;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixvideo)(this);
 //BA.debugLineNum = 208;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixvideo  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 135;BA.debugLine="Sub SetHeight(h As Object) As WixVideo";
 //BA.debugLineNum = 136;BA.debugLine="Video.SetAttr(\"height\", h)";
_video._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("height",_h);
 //BA.debugLineNum = 137;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixvideo)(this);
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixvideo  _sethidden(boolean _hidden) throws Exception{
 //BA.debugLineNum = 210;BA.debugLine="Sub SetHidden(hidden As Boolean) As WixVideo";
 //BA.debugLineNum = 211;BA.debugLine="Video.SetAttr(\"hidden\", hidden)";
_video._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hidden",(Object)(_hidden));
 //BA.debugLineNum = 212;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixvideo)(this);
 //BA.debugLineNum = 213;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixvideo  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 108;BA.debugLine="Sub SetMap(m As Map) As WixVideo";
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
 //BA.debugLineNum = 111;BA.debugLine="Video.SetAttr(strKey,	strVal)";
_video._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 113;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixvideo)(this);
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixvideo  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Sub SetMargin(margin As Object) As WixVideo";
 //BA.debugLineNum = 29;BA.debugLine="Video.SetMargin(margin)";
_video._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 30;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixvideo)(this);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixvideo  _setmaxheight(Object _maxheight) throws Exception{
 //BA.debugLineNum = 215;BA.debugLine="Sub SetMaxHeight(maxHeight As Object) As WixVideo";
 //BA.debugLineNum = 216;BA.debugLine="Video.SetAttr(\"maxHeight\", maxHeight)";
_video._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxHeight",_maxheight);
 //BA.debugLineNum = 217;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixvideo)(this);
 //BA.debugLineNum = 218;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixvideo  _setmaxwidth(Object _maxwidth) throws Exception{
 //BA.debugLineNum = 220;BA.debugLine="Sub SetMaxWidth(maxWidth As Object) As WixVideo";
 //BA.debugLineNum = 221;BA.debugLine="Video.SetAttr(\"maxWidth\", maxWidth)";
_video._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxWidth",_maxwidth);
 //BA.debugLineNum = 222;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixvideo)(this);
 //BA.debugLineNum = 223;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixvideo  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Sub SetMinHeight(h As Int) As WixVideo";
 //BA.debugLineNum = 103;BA.debugLine="Video.SetMinHeight(h)";
_video._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 104;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixvideo)(this);
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixvideo  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Sub SetMinWidth(w As Int) As WixVideo";
 //BA.debugLineNum = 97;BA.debugLine="Video.SetMinWidth(w)";
_video._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 98;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixvideo)(this);
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixvideo  _setname(String _n) throws Exception{
 //BA.debugLineNum = 77;BA.debugLine="Sub SetName(n As String) As WixVideo";
 //BA.debugLineNum = 78;BA.debugLine="Video.SetName(n)";
_video._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 79;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixvideo)(this);
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixvideo  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Sub SetPadding(padding As Object) As WixVideo";
 //BA.debugLineNum = 23;BA.debugLine="Video.SetPadding(padding)";
_video._setpadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 24;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixvideo)(this);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixvideo  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Sub SetParent(p As WixElement) As WixVideo";
 //BA.debugLineNum = 17;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 18;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixvideo)(this);
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixvideo  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Sub SetResponsive(b As Object) As WixVideo";
 //BA.debugLineNum = 84;BA.debugLine="Video.SetResponsive(b)";
_video._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 85;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixvideo)(this);
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixvideo  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixVideo";
 //BA.debugLineNum = 90;BA.debugLine="Video.SetResponsiveCell(b)";
_video._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 91;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixvideo)(this);
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixvideo  _setsrc(String _l) throws Exception{
 //BA.debugLineNum = 164;BA.debugLine="Sub SetSRC(l As String) As WixVideo";
 //BA.debugLineNum = 165;BA.debugLine="sources.Add(l)";
_sources.Add((Object)(_l));
 //BA.debugLineNum = 166;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixvideo)(this);
 //BA.debugLineNum = 167;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixvideo  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 51;BA.debugLine="Video.SetStyle(prop,sval)";
_video._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 52;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixvideo)(this);
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixvideo  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 41;BA.debugLine="Sub SetStyles(m As Map) As WixVideo";
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
 //BA.debugLineNum = 44;BA.debugLine="Video.SetStyle(k,v)";
_video._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 46;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixvideo)(this);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixvideo  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 70;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixVideo";
 //BA.debugLineNum = 71;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 72;BA.debugLine="Video.SetTemplate(os)";
_video._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 73;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixvideo)(this);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixvideo  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Sub SetTooltip(tt As String) As WixVideo";
 //BA.debugLineNum = 118;BA.debugLine="Video.SetAttr(\"tooltip\", tt)";
_video._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("tooltip",(Object)(_tt));
 //BA.debugLineNum = 119;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixvideo)(this);
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixvideo  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 158;BA.debugLine="Sub SetValue(v As String) As WixVideo";
 //BA.debugLineNum = 159;BA.debugLine="Video.SetValue(v)";
_video._setvalue /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_v);
 //BA.debugLineNum = 160;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixvideo)(this);
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixvideo  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 141;BA.debugLine="Sub SetWidth(w As Object) As WixVideo";
 //BA.debugLineNum = 142;BA.debugLine="Video.SetAttr(\"width\", w)";
_video._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("width",_w);
 //BA.debugLineNum = 143;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixvideo)(this);
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
