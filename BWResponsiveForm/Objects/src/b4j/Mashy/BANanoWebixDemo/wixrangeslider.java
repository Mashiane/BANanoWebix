package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixrangeslider extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixrangeslider", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixrangeslider.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _rangeslider = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
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
public String  _addtoform(b4j.Mashy.BANanoWebixDemo.wixform _frm) throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 66;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 4;BA.debugLine="Public RangeSlider As WixElement";
_rangeslider = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixrangeslider  _initialize(anywheresoftware.b4a.BA _ba,String _iid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(iID As String) As WixRangeSl";
 //BA.debugLineNum = 11;BA.debugLine="ID = iID.tolowercase";
_id = _iid.toLowerCase();
 //BA.debugLineNum = 12;BA.debugLine="RangeSlider.Initialize(iID).SetView(\"rangeslider\"";
_rangeslider._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_iid)._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("rangeslider");
 //BA.debugLineNum = 13;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 14;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrangeslider)(this);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 124;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 125;BA.debugLine="Return RangeSlider.item";
if (true) return _rangeslider._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 61;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixrangeslider  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 172;BA.debugLine="Sub SetAlignCenter(r As String) As WixRangeSlider";
 //BA.debugLineNum = 173;BA.debugLine="RangeSlider.setAligncenter(\"\")";
_rangeslider._setaligncenter /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 174;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrangeslider)(this);
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrangeslider  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 178;BA.debugLine="Sub SetAlignLeft(r As String) As WixRangeSlider 'i";
 //BA.debugLineNum = 179;BA.debugLine="RangeSlider.SetAlignleft(\"\")";
_rangeslider._setalignleft /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 180;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrangeslider)(this);
 //BA.debugLineNum = 181;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrangeslider  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 166;BA.debugLine="Sub SetAlignRight(r As String) As WixRangeSlider '";
 //BA.debugLineNum = 167;BA.debugLine="RangeSlider.setAlignright(\"\")";
_rangeslider._setalignright /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 168;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrangeslider)(this);
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrangeslider  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 29;BA.debugLine="Sub SetAttributes(m As Map) As WixRangeSlider";
 //BA.debugLineNum = 30;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 31;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 32;BA.debugLine="RangeSlider.SetAttr(k,v)";
_rangeslider._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 34;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrangeslider)(this);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrangeslider  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 136;BA.debugLine="Sub SetLabel(l As String) As WixRangeSlider";
 //BA.debugLineNum = 137;BA.debugLine="RangeSlider.SetLabel(l)";
_rangeslider._setlabel /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_l);
 //BA.debugLineNum = 138;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrangeslider)(this);
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrangeslider  _setlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 148;BA.debugLine="Sub SetLabelAlign(a As String) As WixRangeSlider";
 //BA.debugLineNum = 149;BA.debugLine="RangeSlider.SetLabelAlign(a)";
_rangeslider._setlabelalign /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_a);
 //BA.debugLineNum = 150;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrangeslider)(this);
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrangeslider  _setlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 154;BA.debugLine="Sub SetLabelPosition(p As String) As WixRangeSlide";
 //BA.debugLineNum = 155;BA.debugLine="RangeSlider.SetLabelPosition(p)";
_rangeslider._setlabelposition /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_p);
 //BA.debugLineNum = 156;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrangeslider)(this);
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrangeslider  _setlabelwidth(int _w) throws Exception{
 //BA.debugLineNum = 160;BA.debugLine="Sub SetLabelWidth(w As Int) As WixRangeSlider";
 //BA.debugLineNum = 161;BA.debugLine="RangeSlider.SetLabelWidth(w)";
_rangeslider._setlabelwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 162;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrangeslider)(this);
 //BA.debugLineNum = 163;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrangeslider  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 70;BA.debugLine="Sub SetMap(m As Map) As WixRangeSlider";
 //BA.debugLineNum = 71;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 72;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 73;BA.debugLine="RangeSlider.SetAttr(strKey,	strVal)";
_rangeslider._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 75;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrangeslider)(this);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrangeslider  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub SetMargin(margin As Object) As WixRangeSlider";
 //BA.debugLineNum = 25;BA.debugLine="RangeSlider.SetMargin(margin)";
_rangeslider._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 26;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrangeslider)(this);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrangeslider  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Sub SetMinHeight(h As Int) As WixRangeSlider";
 //BA.debugLineNum = 113;BA.debugLine="RangeSlider.SetMinHeight(h)";
_rangeslider._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 114;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrangeslider)(this);
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrangeslider  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Sub SetMinWidth(w As Int) As WixRangeSlider";
 //BA.debugLineNum = 107;BA.debugLine="RangeSlider.SetMinWidth(w)";
_rangeslider._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 108;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrangeslider)(this);
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrangeslider  _setname(String _n) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Sub SetName(n As String) As WixRangeSlider";
 //BA.debugLineNum = 88;BA.debugLine="RangeSlider.SetName(n)";
_rangeslider._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 89;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrangeslider)(this);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrangeslider  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 18;BA.debugLine="Sub SetPadding(padding As Object) As WixRangeSlide";
 //BA.debugLineNum = 19;BA.debugLine="RangeSlider.SetPadding(padding)";
_rangeslider._setpadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 20;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrangeslider)(this);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrangeslider  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub SetParent(p As WixElement) As WixRangeSlider";
 //BA.debugLineNum = 54;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrangeslider)(this);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrangeslider  _setrequired(boolean _b) throws Exception{
 //BA.debugLineNum = 142;BA.debugLine="Sub SetRequired(b As Boolean) As WixRangeSlider";
 //BA.debugLineNum = 143;BA.debugLine="RangeSlider.SetRequired(b)";
_rangeslider._setrequired /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 144;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrangeslider)(this);
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrangeslider  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub SetResponsive(b As Object) As WixRangeSlider";
 //BA.debugLineNum = 94;BA.debugLine="RangeSlider.SetResponsive(b)";
_rangeslider._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 95;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrangeslider)(this);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrangeslider  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixRangeSlid";
 //BA.debugLineNum = 100;BA.debugLine="RangeSlider.SetResponsiveCell(b)";
_rangeslider._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 101;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrangeslider)(this);
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrangeslider  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 47;BA.debugLine="RangeSlider.SetStyle(prop,sval)";
_rangeslider._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 48;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrangeslider)(this);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrangeslider  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 37;BA.debugLine="Sub SetStyles(m As Map) As WixRangeSlider";
 //BA.debugLineNum = 38;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 39;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 40;BA.debugLine="RangeSlider.SetStyle(k,v)";
_rangeslider._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 42;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrangeslider)(this);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrangeslider  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 79;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixRangeSl";
 //BA.debugLineNum = 80;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 81;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 82;BA.debugLine="RangeSlider.SetTemplate(os)";
_rangeslider._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 83;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrangeslider)(this);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrangeslider  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Sub SetTooltip(tt As String) As WixRangeSlider";
 //BA.debugLineNum = 119;BA.debugLine="RangeSlider.SetTooltip(tt)";
_rangeslider._settooltip /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_tt);
 //BA.debugLineNum = 120;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrangeslider)(this);
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrangeslider  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 130;BA.debugLine="Sub SetValue(v As String) As WixRangeSlider";
 //BA.debugLineNum = 131;BA.debugLine="RangeSlider.SetValue(v)";
_rangeslider._setvalue /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_v);
 //BA.debugLineNum = 132;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrangeslider)(this);
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
