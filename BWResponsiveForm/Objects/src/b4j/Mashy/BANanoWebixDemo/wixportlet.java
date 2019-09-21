package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixportlet extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixportlet", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixportlet.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _portlet = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 139;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 140;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 144;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 145;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 134;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 135;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Portlet As WixElement";
_portlet = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixportlet  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(sid As String) As WixPortlet";
 //BA.debugLineNum = 10;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 11;BA.debugLine="Portlet.Initialize(ID)";
_portlet._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_id);
 //BA.debugLineNum = 12;BA.debugLine="Portlet.SetView(\"portlet\")";
_portlet._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("portlet");
 //BA.debugLineNum = 13;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 14;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixportlet)(this);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 120;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 121;BA.debugLine="Return Portlet.item";
if (true) return _portlet._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 61;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixportlet  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 36;BA.debugLine="Sub SetAttributes(m As Map) As WixPortlet";
 //BA.debugLineNum = 37;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 38;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 39;BA.debugLine="Portlet.SetAttr(k,v)";
_portlet._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 41;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixportlet)(this);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixportlet  _setbody(String _b) throws Exception{
anywheresoftware.b4a.objects.collections.Map _tmp = null;
 //BA.debugLineNum = 125;BA.debugLine="Sub SetBody(b As String) As WixPortlet";
 //BA.debugLineNum = 126;BA.debugLine="Dim tmp As Map = CreateMap()";
_tmp = new anywheresoftware.b4a.objects.collections.Map();
_tmp = __c.createMap(new Object[] {});
 //BA.debugLineNum = 127;BA.debugLine="tmp.Put(\"template\", b)";
_tmp.Put((Object)("template"),(Object)(_b));
 //BA.debugLineNum = 128;BA.debugLine="Portlet.SetAttr(\"body\",tmp)";
_portlet._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("body",(Object)(_tmp.getObject()));
 //BA.debugLineNum = 129;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixportlet)(this);
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixportlet  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 66;BA.debugLine="Sub SetMap(m As Map) As WixPortlet";
 //BA.debugLineNum = 67;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 68;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 69;BA.debugLine="Portlet.SetAttr(strKey,	strVal)";
_portlet._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 71;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixportlet)(this);
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixportlet  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub SetMargin(margin As Object) As WixPortlet";
 //BA.debugLineNum = 25;BA.debugLine="Portlet.SetMargin(margin)";
_portlet._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 26;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixportlet)(this);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixportlet  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Sub SetMinHeight(h As Int) As WixPortlet";
 //BA.debugLineNum = 109;BA.debugLine="Portlet.SetMinHeight(h)";
_portlet._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 110;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixportlet)(this);
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixportlet  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Sub SetMinWidth(w As Int) As WixPortlet";
 //BA.debugLineNum = 103;BA.debugLine="Portlet.SetMinWidth(w)";
_portlet._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 104;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixportlet)(this);
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixportlet  _setname(String _n) throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Sub SetName(n As String) As WixPortlet";
 //BA.debugLineNum = 84;BA.debugLine="Portlet.SetName(n)";
_portlet._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 85;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixportlet)(this);
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixportlet  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 18;BA.debugLine="Sub SetPadding(padding As Object) As WixPortlet";
 //BA.debugLineNum = 19;BA.debugLine="Portlet.SetPadding(padding)";
_portlet._setpadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 20;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixportlet)(this);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixportlet  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Sub SetParent(p As WixElement) As WixPortlet";
 //BA.debugLineNum = 31;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 32;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixportlet)(this);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixportlet  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub SetResponsive(b As Object) As WixPortlet";
 //BA.debugLineNum = 90;BA.debugLine="Portlet.SetResponsive(b)";
_portlet._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 91;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixportlet)(this);
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixportlet  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixPortlet";
 //BA.debugLineNum = 96;BA.debugLine="Portlet.SetResponsiveCell(b)";
_portlet._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 97;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixportlet)(this);
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixportlet  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 54;BA.debugLine="Portlet.SetStyle(prop,sval)";
_portlet._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixportlet)(this);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixportlet  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 44;BA.debugLine="Sub SetStyles(m As Map) As WixPortlet";
 //BA.debugLineNum = 45;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 46;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 47;BA.debugLine="Portlet.SetStyle(k,v)";
_portlet._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixportlet)(this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixportlet  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 75;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixPortlet";
 //BA.debugLineNum = 76;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 77;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 78;BA.debugLine="Portlet.SetTemplate(os)";
_portlet._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 79;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixportlet)(this);
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixportlet  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Sub SetTooltip(tt As String) As WixPortlet";
 //BA.debugLineNum = 115;BA.debugLine="Portlet.SetTooltip(tt)";
_portlet._settooltip /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_tt);
 //BA.debugLineNum = 116;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixportlet)(this);
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
