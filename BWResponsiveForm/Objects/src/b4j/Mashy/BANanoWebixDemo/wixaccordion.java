package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixaccordion extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixaccordion", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixaccordion.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _accordion = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public b4j.Mashy.BANanoWebixDemo.wixaccordion  _addaccordionitem(b4j.Mashy.BANanoWebixDemo.wixaccordionitem _ai,boolean _bvertical) throws Exception{
 //BA.debugLineNum = 168;BA.debugLine="Sub AddAccordionItem(ai As WixAccordionItem, bVert";
 //BA.debugLineNum = 169;BA.debugLine="If bVertical Then";
if (_bvertical) { 
 //BA.debugLineNum = 170;BA.debugLine="Accordion.AddColumns(ai.Item)";
_accordion._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_ai._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 }else {
 //BA.debugLineNum = 172;BA.debugLine="Accordion.AddRows(ai.Item)";
_accordion._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_ai._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 };
 //BA.debugLineNum = 174;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixaccordion)(this);
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixaccordion  _additem(String _iid,Object _header,Object _body,boolean _bcollapsed,boolean _bvertical) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixaccordionitem _ai = null;
 //BA.debugLineNum = 178;BA.debugLine="Sub AddItem(iID As String, header As Object, body";
 //BA.debugLineNum = 179;BA.debugLine="Dim ai As WixAccordionItem";
_ai = new b4j.Mashy.BANanoWebixDemo.wixaccordionitem();
 //BA.debugLineNum = 180;BA.debugLine="ai.Initialize(iID).SetHeader(header).SetCollapsed";
_ai._initialize /*b4j.Mashy.BANanoWebixDemo.wixaccordionitem*/ (ba,_iid)._setheader /*b4j.Mashy.BANanoWebixDemo.wixaccordionitem*/ (BA.ObjectToString(_header))._setcollapsed /*b4j.Mashy.BANanoWebixDemo.wixaccordionitem*/ ((Object)(_bcollapsed));
 //BA.debugLineNum = 181;BA.debugLine="ai.SetBody(body)";
_ai._setbody /*b4j.Mashy.BANanoWebixDemo.wixaccordionitem*/ (_body);
 //BA.debugLineNum = 182;BA.debugLine="If bVertical Then";
if (_bvertical) { 
 //BA.debugLineNum = 183;BA.debugLine="Accordion.AddColumns(ai.Item)";
_accordion._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_ai._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 }else {
 //BA.debugLineNum = 185;BA.debugLine="Accordion.AddRows(ai.Item)";
_accordion._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_ai._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 };
 //BA.debugLineNum = 187;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixaccordion)(this);
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Accordion As WixElement";
_accordion = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixaccordion  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(sid As String) As WixAccordi";
 //BA.debugLineNum = 11;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 12;BA.debugLine="Accordion.Initialize(ID).SetView(\"accordion\").Set";
_accordion._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_id)._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("accordion")._settype /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("wide");
 //BA.debugLineNum = 13;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 14;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixaccordion)(this);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 164;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 165;BA.debugLine="Return Accordion.item";
if (true) return _accordion._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 166;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 61;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixaccordion  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 30;BA.debugLine="Sub SetAttributes(m As Map) As WixAccordion";
 //BA.debugLineNum = 31;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 32;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 33;BA.debugLine="Accordion.SetAttr(k,v)";
_accordion._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 35;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixaccordion)(this);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixaccordion  _setcollapsed(boolean _b) throws Exception{
 //BA.debugLineNum = 146;BA.debugLine="Sub SetCollapsed(b As Boolean) As WixAccordion";
 //BA.debugLineNum = 147;BA.debugLine="Accordion.SetAttr(\"collapsed\", b)";
_accordion._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("collapsed",(Object)(_b));
 //BA.debugLineNum = 148;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixaccordion)(this);
 //BA.debugLineNum = 149;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixaccordion  _setheight(int _w) throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Sub SetHeight(w As Int) As WixAccordion";
 //BA.debugLineNum = 129;BA.debugLine="Accordion.SetHeight(w)";
_accordion._setheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_w));
 //BA.debugLineNum = 130;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixaccordion)(this);
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixaccordion  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 191;BA.debugLine="Sub SetMap(m As Map) As WixAccordion";
 //BA.debugLineNum = 192;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 193;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 194;BA.debugLine="Accordion.SetAttr(strKey,	strVal)";
_accordion._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 196;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixaccordion)(this);
 //BA.debugLineNum = 197;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixaccordion  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub SetMargin(margin As Object) As WixAccordion";
 //BA.debugLineNum = 25;BA.debugLine="Accordion.SetMargin(margin)";
_accordion._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 26;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixaccordion)(this);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixaccordion  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 140;BA.debugLine="Sub SetMinHeight(h As Int) As WixAccordion";
 //BA.debugLineNum = 141;BA.debugLine="Accordion.SetMinHeight(h)";
_accordion._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 142;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixaccordion)(this);
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixaccordion  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 134;BA.debugLine="Sub SetMinWidth(w As Int) As WixAccordion";
 //BA.debugLineNum = 135;BA.debugLine="Accordion.SetMinWidth(w)";
_accordion._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 136;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixaccordion)(this);
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixaccordion  _setmulti(Object _b) throws Exception{
 //BA.debugLineNum = 152;BA.debugLine="Sub SetMulti(b As Object) As WixAccordion";
 //BA.debugLineNum = 153;BA.debugLine="Accordion.SetAttr(\"multi\", b)";
_accordion._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("multi",_b);
 //BA.debugLineNum = 154;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixaccordion)(this);
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixaccordion  _setmultimixed(Object _b) throws Exception{
 //BA.debugLineNum = 157;BA.debugLine="Sub SetMultiMixed(b As Object) As WixAccordion   '";
 //BA.debugLineNum = 158;BA.debugLine="SetMulti(\"mixed\")";
_setmulti((Object)("mixed"));
 //BA.debugLineNum = 159;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixaccordion)(this);
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixaccordion  _setname(String _n) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Sub SetName(n As String) As WixAccordion";
 //BA.debugLineNum = 104;BA.debugLine="Accordion.SetName(n)";
_accordion._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 105;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixaccordion)(this);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixaccordion  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 18;BA.debugLine="Sub SetPadding(padding As Object) As WixAccordion";
 //BA.debugLineNum = 19;BA.debugLine="Accordion.SetPadding(padding)";
_accordion._setpadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 20;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixaccordion)(this);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixaccordion  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub SetParent(p As WixElement) As WixAccordion";
 //BA.debugLineNum = 48;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixaccordion)(this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixaccordion  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Sub SetResponsive(b As Object) As WixAccordion";
 //BA.debugLineNum = 110;BA.debugLine="Accordion.SetResponsive(b)";
_accordion._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 111;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixaccordion)(this);
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixaccordion  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixAccordion";
 //BA.debugLineNum = 116;BA.debugLine="Accordion.SetResponsiveCell(b)";
_accordion._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 117;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixaccordion)(this);
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixaccordion  _setscroll(boolean _b) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub SetScroll(b As Boolean) As WixAccordion";
 //BA.debugLineNum = 98;BA.debugLine="Accordion.SetAttr(\"scroll\", b)";
_accordion._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("scroll",(Object)(_b));
 //BA.debugLineNum = 99;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixaccordion)(this);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixaccordion  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 55;BA.debugLine="Accordion.SetStyle(prop,sval)";
_accordion._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 56;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixaccordion)(this);
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixaccordion  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 38;BA.debugLine="Sub SetStyles(m As Map) As WixAccordion";
 //BA.debugLineNum = 39;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 40;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 41;BA.debugLine="Accordion.SetStyle(k,v)";
_accordion._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 43;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixaccordion)(this);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixaccordion  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 64;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixAccordi";
 //BA.debugLineNum = 65;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 66;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 67;BA.debugLine="Accordion.SetTemplate(os)";
_accordion._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 68;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixaccordion)(this);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixaccordion  _settypeclean(boolean _b) throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Sub SetTypeClean(b As Boolean) As WixAccordion  'i";
 //BA.debugLineNum = 77;BA.debugLine="Accordion.SetTypeClean(\"\")";
_accordion._settypeclean /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 78;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixaccordion)(this);
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixaccordion  _settypeform(boolean _b) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub SetTypeForm(b As Boolean) As WixAccordion   'i";
 //BA.debugLineNum = 92;BA.debugLine="Accordion.SetTypeForm(\"\")";
_accordion._settypeform /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixaccordion)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixaccordion  _settypeline(boolean _b) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Sub SetTypeLine(b As Boolean) As WixAccordion   'i";
 //BA.debugLineNum = 72;BA.debugLine="Accordion.SetTypeLine(\"\")";
_accordion._settypeline /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 73;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixaccordion)(this);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixaccordion  _settypespace(boolean _b) throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Sub SetTypeSpace(b As Boolean) As WixAccordion   '";
 //BA.debugLineNum = 87;BA.debugLine="Accordion.SetTypeSpace(\"\")";
_accordion._settypespace /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 88;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixaccordion)(this);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixaccordion  _settypewide(boolean _b) throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Sub SetTypeWide(b As Boolean) As WixAccordion  'ig";
 //BA.debugLineNum = 82;BA.debugLine="Accordion.SetTypeWide(\"\")";
_accordion._settypewide /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 83;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixaccordion)(this);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixaccordion  _setwidth(int _w) throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Sub SetWidth(w As Int) As WixAccordion";
 //BA.debugLineNum = 123;BA.debugLine="Accordion.SetWidth(w)";
_accordion._setwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_w));
 //BA.debugLineNum = 124;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixaccordion)(this);
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
