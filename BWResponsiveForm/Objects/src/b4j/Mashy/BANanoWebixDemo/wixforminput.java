package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixforminput extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixforminput", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixforminput.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _forminput = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 197;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 198;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 199;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 202;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 203;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 204;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.Mashy.BANanoWebixDemo.wixform _frm) throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 59;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 192;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 193;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public FormInput As WixElement";
_forminput = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixforminput  _initialize(anywheresoftware.b4a.BA _ba,String _iid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(iID As String) As WixFormInp";
 //BA.debugLineNum = 11;BA.debugLine="ID = iID.tolowercase";
_id = _iid.toLowerCase();
 //BA.debugLineNum = 12;BA.debugLine="FormInput.Initialize(iID).SetView(\"forminput\")";
_forminput._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_iid)._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("forminput");
 //BA.debugLineNum = 13;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 14;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixforminput)(this);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 132;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 133;BA.debugLine="Return FormInput.item";
if (true) return _forminput._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 54;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixforminput  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 179;BA.debugLine="Sub SetAlignCenter(r As String) As WixFormInput 'i";
 //BA.debugLineNum = 180;BA.debugLine="FormInput.setAligncenter(\"\")";
_forminput._setaligncenter /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 181;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixforminput)(this);
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixforminput  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 185;BA.debugLine="Sub SetAlignLeft(r As String) As WixFormInput 'ign";
 //BA.debugLineNum = 186;BA.debugLine="FormInput.SetAlignleft(\"\")";
_forminput._setalignleft /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 187;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixforminput)(this);
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixforminput  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 173;BA.debugLine="Sub SetAlignRight(r As String) As WixFormInput 'ig";
 //BA.debugLineNum = 174;BA.debugLine="FormInput.setAlignright(\"\")";
_forminput._setalignright /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 175;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixforminput)(this);
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixforminput  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 29;BA.debugLine="Sub SetAttributes(m As Map) As WixFormInput";
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
 //BA.debugLineNum = 32;BA.debugLine="FormInput.SetAttr(k,v)";
_forminput._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 34;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixforminput)(this);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixforminput  _setbody(Object _b) throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Sub SetBody(b As Object) As WixFormInput";
 //BA.debugLineNum = 120;BA.debugLine="FormInput.SetBody(b)";
_forminput._setbody /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 121;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixforminput)(this);
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixforminput  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 143;BA.debugLine="Sub SetLabel(l As String) As WixFormInput";
 //BA.debugLineNum = 144;BA.debugLine="FormInput.SetLabel(l)";
_forminput._setlabel /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_l);
 //BA.debugLineNum = 145;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixforminput)(this);
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixforminput  _setlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 155;BA.debugLine="Sub SetLabelAlign(a As String) As WixFormInput";
 //BA.debugLineNum = 156;BA.debugLine="FormInput.SetLabelAlign(a)";
_forminput._setlabelalign /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_a);
 //BA.debugLineNum = 157;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixforminput)(this);
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixforminput  _setlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 161;BA.debugLine="Sub SetLabelPosition(p As String) As WixFormInput";
 //BA.debugLineNum = 162;BA.debugLine="FormInput.SetLabelPosition(p)";
_forminput._setlabelposition /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_p);
 //BA.debugLineNum = 163;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixforminput)(this);
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixforminput  _setlabelwidth(int _w) throws Exception{
 //BA.debugLineNum = 167;BA.debugLine="Sub SetLabelWidth(w As Int) As WixFormInput";
 //BA.debugLineNum = 168;BA.debugLine="FormInput.SetLabelWidth(w)";
_forminput._setlabelwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 169;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixforminput)(this);
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixforminput  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 78;BA.debugLine="Sub SetMap(m As Map) As WixFormInput";
 //BA.debugLineNum = 79;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 80;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 81;BA.debugLine="FormInput.SetAttr(strKey,	strVal)";
_forminput._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 83;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixforminput)(this);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixforminput  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub SetMargin(margin As Object) As WixFormInput";
 //BA.debugLineNum = 25;BA.debugLine="FormInput.SetMargin(margin)";
_forminput._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 26;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixforminput)(this);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixforminput  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 113;BA.debugLine="Sub SetMinHeight(h As Int) As WixFormInput";
 //BA.debugLineNum = 114;BA.debugLine="FormInput.SetMinHeight(h)";
_forminput._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 115;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixforminput)(this);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixforminput  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Sub SetMinWidth(w As Int) As WixFormInput";
 //BA.debugLineNum = 108;BA.debugLine="FormInput.SetMinWidth(w)";
_forminput._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 109;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixforminput)(this);
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixforminput  _setname(String _n) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Sub SetName(n As String) As WixFormInput";
 //BA.debugLineNum = 89;BA.debugLine="FormInput.SetName(n)";
_forminput._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 90;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixforminput)(this);
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixforminput  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 18;BA.debugLine="Sub SetPadding(padding As Object) As WixFormInput";
 //BA.debugLineNum = 19;BA.debugLine="FormInput.SetPadding(padding)";
_forminput._setpadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 20;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixforminput)(this);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixforminput  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Sub SetParent(p As WixElement) As WixFormInput";
 //BA.debugLineNum = 64;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 65;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixforminput)(this);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixforminput  _setrequired(boolean _b) throws Exception{
 //BA.debugLineNum = 149;BA.debugLine="Sub SetRequired(b As Boolean) As WixFormInput";
 //BA.debugLineNum = 150;BA.debugLine="FormInput.SetRequired(b)";
_forminput._setrequired /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 151;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixforminput)(this);
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixforminput  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Sub SetResponsive(b As Object) As WixFormInput";
 //BA.debugLineNum = 95;BA.debugLine="FormInput.SetResponsive(b)";
_forminput._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 96;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixforminput)(this);
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixforminput  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixFormInput";
 //BA.debugLineNum = 101;BA.debugLine="FormInput.SetResponsiveCell(b)";
_forminput._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 102;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixforminput)(this);
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixforminput  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 47;BA.debugLine="FormInput.SetStyle(prop,sval)";
_forminput._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 48;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixforminput)(this);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixforminput  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 37;BA.debugLine="Sub SetStyles(m As Map) As WixFormInput";
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
 //BA.debugLineNum = 40;BA.debugLine="FormInput.SetStyle(k,v)";
_forminput._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 42;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixforminput)(this);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixforminput  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 70;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixFormInp";
 //BA.debugLineNum = 71;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 72;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 73;BA.debugLine="FormInput.SetTemplate(os)";
_forminput._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 74;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixforminput)(this);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixforminput  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 125;BA.debugLine="Sub SetTooltip(tt As String) As WixFormInput";
 //BA.debugLineNum = 126;BA.debugLine="FormInput.SetTooltip(tt)";
_forminput._settooltip /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_tt);
 //BA.debugLineNum = 127;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixforminput)(this);
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixforminput  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 137;BA.debugLine="Sub SetValue(v As String) As WixFormInput";
 //BA.debugLineNum = 138;BA.debugLine="FormInput.SetValue(v)";
_forminput._setvalue /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_v);
 //BA.debugLineNum = 139;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixforminput)(this);
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
