package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixiframe extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixiframe", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixiframe.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _iframe = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 156;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 157;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 161;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 162;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 163;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 151;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 152;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public IFrame As WixElement";
_iframe = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixiframe  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 46;BA.debugLine="Public Sub Initialize(sid As String) As WixIFrame";
 //BA.debugLineNum = 47;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 48;BA.debugLine="IFrame.Initialize(ID).SetView(\"iframe\")";
_iframe._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_id)._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("iframe");
 //BA.debugLineNum = 49;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 50;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixiframe)(this);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 72;BA.debugLine="Return IFrame.item";
if (true) return _iframe._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 62;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixiframe  _setanimate(boolean _animate) throws Exception{
 //BA.debugLineNum = 166;BA.debugLine="Sub SetAnimate(animate As Boolean) As WixIFrame";
 //BA.debugLineNum = 167;BA.debugLine="IFrame.SetAttr(\"animate\", animate)";
_iframe._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("animate",(Object)(_animate));
 //BA.debugLineNum = 168;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixiframe)(this);
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixiframe  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 10;BA.debugLine="Sub SetAttributes(m As Map) As WixIFrame";
 //BA.debugLineNum = 11;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 12;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 13;BA.debugLine="IFrame.SetAttr(k,v)";
_iframe._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 15;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixiframe)(this);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixiframe  _setborderless(boolean _borderless) throws Exception{
 //BA.debugLineNum = 171;BA.debugLine="Sub SetBorderless(borderless As Boolean) As WixIFr";
 //BA.debugLineNum = 172;BA.debugLine="IFrame.SetAttr(\"borderless\", borderless)";
_iframe._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("borderless",(Object)(_borderless));
 //BA.debugLineNum = 173;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixiframe)(this);
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixiframe  _setcontainer(String _c) throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Sub SetContainer(c As String) As WixIFrame";
 //BA.debugLineNum = 66;BA.debugLine="IFrame.SetContainer(c)";
_iframe._setcontainer /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_c);
 //BA.debugLineNum = 67;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixiframe)(this);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixiframe  _setcss(Object _css) throws Exception{
 //BA.debugLineNum = 176;BA.debugLine="Sub SetCss(css As Object) As WixIFrame";
 //BA.debugLineNum = 177;BA.debugLine="IFrame.SetAttr(\"css\", css)";
_iframe._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("css",_css);
 //BA.debugLineNum = 178;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixiframe)(this);
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixiframe  _setdisabled(boolean _disabled) throws Exception{
 //BA.debugLineNum = 181;BA.debugLine="Sub SetDisabled(disabled As Boolean) As WixIFrame";
 //BA.debugLineNum = 182;BA.debugLine="IFrame.SetAttr(\"disabled\", disabled)";
_iframe._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("disabled",(Object)(_disabled));
 //BA.debugLineNum = 183;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixiframe)(this);
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixiframe  _setgravity(Object _gravity) throws Exception{
 //BA.debugLineNum = 186;BA.debugLine="Sub SetGravity(gravity As Object) As WixIFrame";
 //BA.debugLineNum = 187;BA.debugLine="IFrame.SetAttr(\"gravity\", gravity)";
_iframe._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("gravity",_gravity);
 //BA.debugLineNum = 188;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixiframe)(this);
 //BA.debugLineNum = 189;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixiframe  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 137;BA.debugLine="Sub SetHeight(h As Object) As WixIFrame";
 //BA.debugLineNum = 138;BA.debugLine="IFrame.SetAttr(\"height\", h)";
_iframe._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("height",_h);
 //BA.debugLineNum = 139;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixiframe)(this);
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixiframe  _sethidden(boolean _hidden) throws Exception{
 //BA.debugLineNum = 191;BA.debugLine="Sub SetHidden(hidden As Boolean) As WixIFrame";
 //BA.debugLineNum = 192;BA.debugLine="IFrame.SetAttr(\"hidden\", hidden)";
_iframe._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hidden",(Object)(_hidden));
 //BA.debugLineNum = 193;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixiframe)(this);
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixiframe  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 90;BA.debugLine="Sub SetMap(m As Map) As WixIFrame";
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
 //BA.debugLineNum = 93;BA.debugLine="IFrame.SetAttr(strKey,	strVal)";
_iframe._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 95;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixiframe)(this);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixiframe  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub SetMargin(margin As Object) As WixIFrame";
 //BA.debugLineNum = 34;BA.debugLine="IFrame.SetMargin(margin)";
_iframe._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 35;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixiframe)(this);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixiframe  _setmaxheight(Object _maxheight) throws Exception{
 //BA.debugLineNum = 196;BA.debugLine="Sub SetMaxHeight(maxHeight As Object) As WixIFrame";
 //BA.debugLineNum = 197;BA.debugLine="IFrame.SetAttr(\"maxHeight\", maxHeight)";
_iframe._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxHeight",_maxheight);
 //BA.debugLineNum = 198;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixiframe)(this);
 //BA.debugLineNum = 199;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixiframe  _setmaxwidth(Object _maxwidth) throws Exception{
 //BA.debugLineNum = 201;BA.debugLine="Sub SetMaxWidth(maxWidth As Object) As WixIFrame";
 //BA.debugLineNum = 202;BA.debugLine="IFrame.SetAttr(\"maxWidth\", maxWidth)";
_iframe._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxWidth",_maxwidth);
 //BA.debugLineNum = 203;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixiframe)(this);
 //BA.debugLineNum = 204;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixiframe  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Sub SetMinHeight(h As Int) As WixIFrame";
 //BA.debugLineNum = 120;BA.debugLine="IFrame.SetMinHeight(h)";
_iframe._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 121;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixiframe)(this);
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixiframe  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 113;BA.debugLine="Sub SetMinWidth(w As Int) As WixIFrame";
 //BA.debugLineNum = 114;BA.debugLine="IFrame.SetMinWidth(w)";
_iframe._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 115;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixiframe)(this);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixiframe  _setname(String _n) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub SetName(n As String) As WixIFrame";
 //BA.debugLineNum = 85;BA.debugLine="IFrame.SetName(n)";
_iframe._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 86;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixiframe)(this);
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixiframe  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Sub SetPadding(padding As Object) As WixIFrame";
 //BA.debugLineNum = 28;BA.debugLine="IFrame.SetPadding(padding)";
_iframe._setpadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 29;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixiframe)(this);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixiframe  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Sub SetParent(p As WixElement) As WixIFrame";
 //BA.debugLineNum = 55;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 56;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixiframe)(this);
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixiframe  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Sub SetResponsive(b As Object) As WixIFrame";
 //BA.debugLineNum = 101;BA.debugLine="IFrame.SetResponsive(b)";
_iframe._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 102;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixiframe)(this);
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixiframe  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixIFrame";
 //BA.debugLineNum = 107;BA.debugLine="IFrame.SetResponsiveCell(b)";
_iframe._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 108;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixiframe)(this);
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixiframe  _setscroll(Object _b) throws Exception{
 //BA.debugLineNum = 125;BA.debugLine="Sub SetScroll(b As Object) As WixIFrame";
 //BA.debugLineNum = 126;BA.debugLine="IFrame.SetAttr(\"scroll\", b)";
_iframe._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("scroll",_b);
 //BA.debugLineNum = 127;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixiframe)(this);
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixiframe  _setsrc(String _t) throws Exception{
 //BA.debugLineNum = 131;BA.debugLine="Sub SetSRC(t As String) As WixIFrame";
 //BA.debugLineNum = 132;BA.debugLine="IFrame.SetAttr(\"src\", t)";
_iframe._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("src",(Object)(_t));
 //BA.debugLineNum = 133;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixiframe)(this);
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixiframe  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 40;BA.debugLine="IFrame.SetStyle(prop,sval)";
_iframe._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 41;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixiframe)(this);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixiframe  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 18;BA.debugLine="Sub SetStyles(m As Map) As WixIFrame";
 //BA.debugLineNum = 19;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 20;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 21;BA.debugLine="IFrame.SetStyle(k,v)";
_iframe._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixiframe)(this);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixiframe  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 76;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixIFrame";
 //BA.debugLineNum = 77;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 78;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 79;BA.debugLine="IFrame.SetTemplate(os)";
_iframe._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 80;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixiframe)(this);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixiframe  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 144;BA.debugLine="Sub SetWidth(w As Object) As WixIFrame";
 //BA.debugLineNum = 145;BA.debugLine="IFrame.SetAttr(\"width\", w)";
_iframe._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("width",_w);
 //BA.debugLineNum = 146;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixiframe)(this);
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
