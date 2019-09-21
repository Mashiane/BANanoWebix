package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixheader extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixheader", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixheader.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _header = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 186;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 187;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 191;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 192;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 193;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 181;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 182;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 183;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Header As WixElement";
_header = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixheader  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 52;BA.debugLine="Public Sub Initialize(sID As String) As WixHeader";
 //BA.debugLineNum = 53;BA.debugLine="ID = sID.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 54;BA.debugLine="Header.Initialize(ID).SetType(\"header\")";
_header._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_id)._settype /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("header");
 //BA.debugLineNum = 55;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 56;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixheader)(this);
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 90;BA.debugLine="Return Header.item";
if (true) return _header._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 48;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixheader  _setalign(Object _r) throws Exception{
 //BA.debugLineNum = 145;BA.debugLine="Sub SetAlign(r As Object) As WixHeader 'ignore";
 //BA.debugLineNum = 146;BA.debugLine="Header.SetAlign(r)";
_header._setalign /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_r));
 //BA.debugLineNum = 147;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixheader)(this);
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixheader  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Sub SetAlignCenter(r As String) As WixHeader 'igno";
 //BA.debugLineNum = 134;BA.debugLine="Header.setAligncenter(\"\")";
_header._setaligncenter /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 135;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixheader)(this);
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixheader  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 139;BA.debugLine="Sub SetAlignLeft(r As String) As WixHeader 'ignore";
 //BA.debugLineNum = 140;BA.debugLine="Header.SetAlignleft(\"\")";
_header._setalignleft /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 141;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixheader)(this);
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixheader  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="Sub SetAlignRight(r As String) As WixHeader 'ignor";
 //BA.debugLineNum = 128;BA.debugLine="Header.setAlignright(\"\")";
_header._setalignright /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 129;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixheader)(this);
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixheader  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 17;BA.debugLine="Sub SetAttributes(m As Map) As WixHeader";
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
 //BA.debugLineNum = 20;BA.debugLine="Header.SetAttr(k,v)";
_header._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 22;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixheader)(this);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixheader  _setborderless(boolean _b) throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Sub SetBorderless(b As Boolean) As WixHeader";
 //BA.debugLineNum = 103;BA.debugLine="Header.SetBorderLess(b)";
_header._setborderless /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 104;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixheader)(this);
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixheader  _setcss(Object _c) throws Exception{
 //BA.debugLineNum = 120;BA.debugLine="Sub SetCSS(c As Object) As WixHeader";
 //BA.debugLineNum = 121;BA.debugLine="Header.SetCSS(c)";
_header._setcss /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_c));
 //BA.debugLineNum = 122;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixheader)(this);
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixheader  _setheight(int _h) throws Exception{
 //BA.debugLineNum = 174;BA.debugLine="Sub SetHeight(h As Int) As WixHeader";
 //BA.debugLineNum = 175;BA.debugLine="Header.SetHeight(h)";
_header._setheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_h));
 //BA.debugLineNum = 176;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixheader)(this);
 //BA.debugLineNum = 177;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixheader  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 94;BA.debugLine="Sub SetMap(m As Map) As WixHeader";
 //BA.debugLineNum = 95;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 96;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 97;BA.debugLine="Header.SetAttr(strKey,	strVal)";
_header._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 99;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixheader)(this);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixheader  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub SetMargin(margin As Object) As WixHeader";
 //BA.debugLineNum = 71;BA.debugLine="Header.SetMargin(margin)";
_header._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 72;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixheader)(this);
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixheader  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 162;BA.debugLine="Sub SetMinHeight(h As Int) As WixHeader";
 //BA.debugLineNum = 163;BA.debugLine="Header.SetMinHeight(h)";
_header._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 164;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixheader)(this);
 //BA.debugLineNum = 165;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixheader  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 156;BA.debugLine="Sub SetMinWidth(w As Int) As WixHeader";
 //BA.debugLineNum = 157;BA.debugLine="Header.SetMinWidth(w)";
_header._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 158;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixheader)(this);
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixheader  _setname(String _n) throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Sub SetName(n As String) As WixHeader";
 //BA.debugLineNum = 84;BA.debugLine="Header.SetName(n)";
_header._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 85;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixheader)(this);
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixheader  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub SetPadding(padding As Object) As WixHeader";
 //BA.debugLineNum = 65;BA.debugLine="Header.SetPadding(padding)";
_header._setpadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 66;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixheader)(this);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixheader  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Sub SetParent(p As WixElement) As WixHeader";
 //BA.debugLineNum = 41;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 42;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixheader)(this);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixheader  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Sub SetResponsive(b As Object) As WixHeader";
 //BA.debugLineNum = 110;BA.debugLine="Header.SetResponsive(b)";
_header._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 111;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixheader)(this);
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixheader  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixHeader";
 //BA.debugLineNum = 116;BA.debugLine="Header.SetResponsiveCell(b)";
_header._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 117;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixheader)(this);
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixheader  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 11;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 12;BA.debugLine="Header.SetStyle(prop,sval)";
_header._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 13;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixheader)(this);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixheader  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 25;BA.debugLine="Sub SetStyles(m As Map) As WixHeader";
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
 //BA.debugLineNum = 28;BA.debugLine="Header.SetStyle(k,v)";
_header._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 30;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixheader)(this);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixheader  _settemplate(Object _t) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Sub SetTemplate(t As Object) As WixHeader";
 //BA.debugLineNum = 60;BA.debugLine="Header.SetTemplate(t)";
_header._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_t);
 //BA.debugLineNum = 61;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixheader)(this);
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixheader  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 75;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixHeader";
 //BA.debugLineNum = 76;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 77;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 78;BA.debugLine="Header.SetTemplate(os)";
_header._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 79;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixheader)(this);
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixheader  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub SetTooltip(tt As String) As WixHeader";
 //BA.debugLineNum = 35;BA.debugLine="Header.SetTooltip(tt)";
_header._settooltip /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_tt);
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixheader)(this);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixheader  _setvalue(Object _value) throws Exception{
 //BA.debugLineNum = 150;BA.debugLine="Sub SetValue(value As Object) As WixHeader";
 //BA.debugLineNum = 151;BA.debugLine="Header.SetAttr(\"value\", value)";
_header._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("value",_value);
 //BA.debugLineNum = 152;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixheader)(this);
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixheader  _setwidth(int _w) throws Exception{
 //BA.debugLineNum = 168;BA.debugLine="Sub SetWidth(w As Int) As WixHeader";
 //BA.debugLineNum = 169;BA.debugLine="Header.SetWidth(w)";
_header._setwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_w));
 //BA.debugLineNum = 170;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixheader)(this);
 //BA.debugLineNum = 171;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
