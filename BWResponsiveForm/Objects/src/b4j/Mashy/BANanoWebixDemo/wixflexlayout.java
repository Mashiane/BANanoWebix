package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixflexlayout extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixflexlayout", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixflexlayout.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _flexlayout = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public String  _addcolumns(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Sub AddColumns(itm As Map)";
 //BA.debugLineNum = 73;BA.debugLine="FlexLayout.AddColumns(itm)";
_flexlayout._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_itm);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return "";
}
public String  _addrows(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub AddRows(itm As Map)";
 //BA.debugLineNum = 79;BA.debugLine="FlexLayout.AddRows(itm)";
_flexlayout._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_itm);
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return "";
}
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 190;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 191;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 192;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 195;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 196;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 197;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 185;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 186;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 187;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public FlexLayout As WixElement";
_flexlayout = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixflexlayout  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(sID As String) As WixFlexLay";
 //BA.debugLineNum = 11;BA.debugLine="ID = sID.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 12;BA.debugLine="FlexLayout.Initialize(ID).SetView(\"flexlayout\")";
_flexlayout._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_id)._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("flexlayout");
 //BA.debugLineNum = 13;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 14;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixflexlayout)(this);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 50;BA.debugLine="Return FlexLayout.item";
if (true) return _flexlayout._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 55;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixflexlayout  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 24;BA.debugLine="Sub SetAttributes(m As Map) As WixFlexLayout";
 //BA.debugLineNum = 25;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 26;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 27;BA.debugLine="FlexLayout.SetAttr(k,v)";
_flexlayout._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 29;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixflexlayout)(this);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixflexlayout  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 83;BA.debugLine="Sub SetMap(m As Map) As WixFlexLayout";
 //BA.debugLineNum = 84;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 85;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 86;BA.debugLine="FlexLayout.SetAttr(strKey,	strVal)";
_flexlayout._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 88;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixflexlayout)(this);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixflexlayout  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Sub SetMargin(margin As Object) As WixFlexLayout";
 //BA.debugLineNum = 99;BA.debugLine="FlexLayout.SetMargin(margin)";
_flexlayout._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 100;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixflexlayout)(this);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixflexlayout  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Sub SetMinHeight(h As Int) As WixFlexLayout";
 //BA.debugLineNum = 124;BA.debugLine="FlexLayout.SetMinHeight(h)";
_flexlayout._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 125;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixflexlayout)(this);
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixflexlayout  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Sub SetMinWidth(w As Int) As WixFlexLayout";
 //BA.debugLineNum = 118;BA.debugLine="FlexLayout.SetMinWidth(w)";
_flexlayout._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 119;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixflexlayout)(this);
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixflexlayout  _setname(String _n) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub SetName(n As String) As WixFlexLayout";
 //BA.debugLineNum = 67;BA.debugLine="FlexLayout.SetName(n)";
_flexlayout._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 68;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixflexlayout)(this);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixflexlayout  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Sub SetPadding(padding As Object) As WixFlexLayout";
 //BA.debugLineNum = 93;BA.debugLine="FlexLayout.SetPadding(padding)";
_flexlayout._setpadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 94;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixflexlayout)(this);
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixflexlayout  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 18;BA.debugLine="Sub SetParent(p As WixElement) As WixFlexLayout";
 //BA.debugLineNum = 19;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 20;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixflexlayout)(this);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixflexlayout  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Sub SetResponsive(b As Object) As WixFlexLayout";
 //BA.debugLineNum = 105;BA.debugLine="FlexLayout.SetResponsive(b)";
_flexlayout._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 106;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixflexlayout)(this);
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixflexlayout  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixFlexLayou";
 //BA.debugLineNum = 111;BA.debugLine="FlexLayout.SetResponsiveCell(b)";
_flexlayout._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 112;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixflexlayout)(this);
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixflexlayout  _setscroll(Object _b) throws Exception{
 //BA.debugLineNum = 129;BA.debugLine="Sub SetScroll(b As Object) As WixFlexLayout";
 //BA.debugLineNum = 130;BA.debugLine="FlexLayout.SetAttr(\"scroll\", b)";
_flexlayout._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("scroll",_b);
 //BA.debugLineNum = 131;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixflexlayout)(this);
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixflexlayout  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 43;BA.debugLine="FlexLayout.SetStyle(prop,sval)";
_flexlayout._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 44;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixflexlayout)(this);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixflexlayout  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 32;BA.debugLine="Sub SetStyles(m As Map) As WixFlexLayout";
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
 //BA.debugLineNum = 35;BA.debugLine="FlexLayout.SetStyle(k,v)";
_flexlayout._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 37;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixflexlayout)(this);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixflexlayout  _settemplate(String _t) throws Exception{
 //BA.debugLineNum = 135;BA.debugLine="Sub SetTemplate(t As String) As WixFlexLayout";
 //BA.debugLineNum = 136;BA.debugLine="FlexLayout.SetTemplate(t)";
_flexlayout._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_t));
 //BA.debugLineNum = 137;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixflexlayout)(this);
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixflexlayout  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 58;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixFlexLay";
 //BA.debugLineNum = 59;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 60;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 61;BA.debugLine="FlexLayout.SetTemplate(os)";
_flexlayout._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixflexlayout)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixflexlayout  _settype(String _t) throws Exception{
 //BA.debugLineNum = 142;BA.debugLine="Sub SetType(t As String) As WixFlexLayout";
 //BA.debugLineNum = 143;BA.debugLine="FlexLayout.SetType(t)";
_flexlayout._settype /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_t);
 //BA.debugLineNum = 144;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixflexlayout)(this);
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixflexlayout  _settypeclean(String _a) throws Exception{
 //BA.debugLineNum = 148;BA.debugLine="Sub SetTypeClean(a As String) As WixFlexLayout   '";
 //BA.debugLineNum = 149;BA.debugLine="SetType(\"clean\")";
_settype("clean");
 //BA.debugLineNum = 150;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixflexlayout)(this);
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixflexlayout  _settypeform(String _a) throws Exception{
 //BA.debugLineNum = 178;BA.debugLine="Sub SetTypeForm(a As String) As WixFlexLayout   'i";
 //BA.debugLineNum = 179;BA.debugLine="SetType(\"form\")";
_settype("form");
 //BA.debugLineNum = 180;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixflexlayout)(this);
 //BA.debugLineNum = 181;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixflexlayout  _settypehead(String _a) throws Exception{
 //BA.debugLineNum = 172;BA.debugLine="Sub SetTypeHead(a As String) As WixFlexLayout   'i";
 //BA.debugLineNum = 173;BA.debugLine="SetType(\"head\")";
_settype("head");
 //BA.debugLineNum = 174;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixflexlayout)(this);
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixflexlayout  _settypeline(String _a) throws Exception{
 //BA.debugLineNum = 154;BA.debugLine="Sub SetTypeLine(a As String) As WixFlexLayout   'i";
 //BA.debugLineNum = 155;BA.debugLine="SetType(\"line\")";
_settype("line");
 //BA.debugLineNum = 156;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixflexlayout)(this);
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixflexlayout  _settypespace(String _a) throws Exception{
 //BA.debugLineNum = 166;BA.debugLine="Sub SetTypeSpace(a As String) As WixFlexLayout   '";
 //BA.debugLineNum = 167;BA.debugLine="SetType(\"space\")";
_settype("space");
 //BA.debugLineNum = 168;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixflexlayout)(this);
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixflexlayout  _settypewide(String _a) throws Exception{
 //BA.debugLineNum = 160;BA.debugLine="Sub SetTypeWide(a As String) As WixFlexLayout   'i";
 //BA.debugLineNum = 161;BA.debugLine="SetType(\"wide\")";
_settype("wide");
 //BA.debugLineNum = 162;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixflexlayout)(this);
 //BA.debugLineNum = 163;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
