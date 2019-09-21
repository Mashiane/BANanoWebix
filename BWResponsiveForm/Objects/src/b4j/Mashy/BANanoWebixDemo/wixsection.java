package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixsection extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixsection", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixsection.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _section = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 140;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 141;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 145;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 146;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.Mashy.BANanoWebixDemo.wixform _frm) throws Exception{
 //BA.debugLineNum = 124;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 125;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 135;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 136;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return "";
}
public String  _addtotoolbar(b4j.Mashy.BANanoWebixDemo.wixtoolbar _tblb) throws Exception{
 //BA.debugLineNum = 129;BA.debugLine="Sub AddToToolbar(tblB As WixToolBar)";
 //BA.debugLineNum = 130;BA.debugLine="tblB.Toolbar.AddItem(Item)";
_tblb._toolbar /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ._additem /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Section As WixElement";
_section = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixsection  _initialize(anywheresoftware.b4a.BA _ba,String _iid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(iID As String) As WixSection";
 //BA.debugLineNum = 11;BA.debugLine="ID = iID.tolowercase";
_id = _iid.toLowerCase();
 //BA.debugLineNum = 12;BA.debugLine="Section.Initialize(iID).SetType(\"section\")";
_section._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_iid)._settype /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("section");
 //BA.debugLineNum = 13;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 14;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsection)(this);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 120;BA.debugLine="Return Section.item";
if (true) return _section._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 61;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixsection  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 36;BA.debugLine="Sub SetAttributes(m As Map) As WixSection";
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
 //BA.debugLineNum = 39;BA.debugLine="Section.SetAttr(k,v)";
_section._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 41;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsection)(this);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsection  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 65;BA.debugLine="Sub SetMap(m As Map) As WixSection";
 //BA.debugLineNum = 66;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 67;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 68;BA.debugLine="Section.SetAttr(strKey,	strVal)";
_section._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 70;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsection)(this);
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsection  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub SetMargin(margin As Object) As WixSection";
 //BA.debugLineNum = 25;BA.debugLine="Section.SetMargin(margin)";
_section._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 26;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsection)(this);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsection  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Sub SetMinHeight(h As Int) As WixSection";
 //BA.debugLineNum = 108;BA.debugLine="Section.SetMinHeight(h)";
_section._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 109;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsection)(this);
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsection  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Sub SetMinWidth(w As Int) As WixSection";
 //BA.debugLineNum = 102;BA.debugLine="Section.SetMinWidth(w)";
_section._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 103;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsection)(this);
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsection  _setname(String _n) throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Sub SetName(n As String) As WixSection";
 //BA.debugLineNum = 83;BA.debugLine="Section.SetName(n)";
_section._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 84;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsection)(this);
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsection  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 18;BA.debugLine="Sub SetPadding(padding As Object) As WixSection";
 //BA.debugLineNum = 19;BA.debugLine="Section.SetPadding(padding)";
_section._setpadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 20;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsection)(this);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsection  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Sub SetParent(p As WixElement) As WixSection";
 //BA.debugLineNum = 31;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 32;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsection)(this);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsection  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Sub SetResponsive(b As Object) As WixSection";
 //BA.debugLineNum = 89;BA.debugLine="Section.SetResponsive(b)";
_section._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 90;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsection)(this);
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsection  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixSection";
 //BA.debugLineNum = 95;BA.debugLine="Section.SetResponsiveCell(b)";
_section._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 96;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsection)(this);
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsection  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 54;BA.debugLine="Section.SetStyle(prop,sval)";
_section._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsection)(this);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsection  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 44;BA.debugLine="Sub SetStyles(m As Map) As WixSection";
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
 //BA.debugLineNum = 47;BA.debugLine="Section.SetStyle(k,v)";
_section._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsection)(this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsection  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 74;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixSection";
 //BA.debugLineNum = 75;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 76;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 77;BA.debugLine="Section.SetTemplate(os)";
_section._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 78;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsection)(this);
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsection  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 113;BA.debugLine="Sub SetTooltip(tt As String) As WixSection";
 //BA.debugLineNum = 114;BA.debugLine="Section.SetTooltip(tt)";
_section._settooltip /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_tt);
 //BA.debugLineNum = 115;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsection)(this);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
