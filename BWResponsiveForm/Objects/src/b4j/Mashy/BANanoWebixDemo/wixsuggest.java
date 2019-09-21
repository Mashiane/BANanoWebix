package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixsuggest extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixsuggest", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixsuggest.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _suggest = null;
public anywheresoftware.b4a.objects.collections.List _items = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public b4j.Mashy.BANanoWebixDemo.wixsuggest  _additem(String _sid,String _svalue) throws Exception{
 //BA.debugLineNum = 136;BA.debugLine="Sub AddItem(sID As String, sValue As String) As Wi";
 //BA.debugLineNum = 137;BA.debugLine="AddSuggestion(sID, sValue)";
_addsuggestion(_sid,_svalue);
 //BA.debugLineNum = 138;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsuggest)(this);
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsuggest  _addsuggestion(String _sid,String _svalue) throws Exception{
anywheresoftware.b4a.objects.collections.Map _sug = null;
 //BA.debugLineNum = 127;BA.debugLine="Sub AddSuggestion(sID As String, sValue As String)";
 //BA.debugLineNum = 128;BA.debugLine="Dim sug As Map = CreateMap()";
_sug = new anywheresoftware.b4a.objects.collections.Map();
_sug = __c.createMap(new Object[] {});
 //BA.debugLineNum = 129;BA.debugLine="sug.Put(\"id\", sID)";
_sug.Put((Object)("id"),(Object)(_sid));
 //BA.debugLineNum = 130;BA.debugLine="sug.Put(\"value\", sValue)";
_sug.Put((Object)("value"),(Object)(_svalue));
 //BA.debugLineNum = 131;BA.debugLine="Items.Add(sug)";
_items.Add((Object)(_sug.getObject()));
 //BA.debugLineNum = 132;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsuggest)(this);
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Suggest As WixElement";
_suggest = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private Items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 6;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixsuggest  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(sID As String) As WixSuggest";
 //BA.debugLineNum = 12;BA.debugLine="Suggest.Initialize(sID).SetView(\"suggest\")";
_suggest._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_sid)._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("suggest");
 //BA.debugLineNum = 13;BA.debugLine="Items.Initialize";
_items.Initialize();
 //BA.debugLineNum = 14;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 15;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsuggest)(this);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 121;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 122;BA.debugLine="If Items.Size > 0 Then SetData(Items)";
if (_items.getSize()>0) { 
_setdata(_items);};
 //BA.debugLineNum = 123;BA.debugLine="Return Suggest.Item";
if (true) return _suggest._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 57;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixsuggest  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 19;BA.debugLine="Sub SetAttributes(m As Map) As WixSuggest";
 //BA.debugLineNum = 20;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 21;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 22;BA.debugLine="Suggest.SetAttr(k,v)";
_suggest._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 24;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsuggest)(this);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsuggest  _setdata(anywheresoftware.b4a.objects.collections.List _d) throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Sub SetData(d As List) As WixSuggest";
 //BA.debugLineNum = 51;BA.debugLine="Suggest.SetData(d)";
_suggest._setdata /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_d);
 //BA.debugLineNum = 52;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsuggest)(this);
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsuggest  _setfitmaster(boolean _b) throws Exception{
 //BA.debugLineNum = 162;BA.debugLine="Sub SetFitMaster(b As Boolean) As WixSuggest";
 //BA.debugLineNum = 163;BA.debugLine="Suggest.SetAttr(\"fitMaster\", b)";
_suggest._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("fitMaster",(Object)(_b));
 //BA.debugLineNum = 164;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsuggest)(this);
 //BA.debugLineNum = 165;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsuggest  _setheight(int _h) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Sub SetHeight(h As Int) As WixSuggest";
 //BA.debugLineNum = 104;BA.debugLine="Suggest.SetHeight(h)";
_suggest._setheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_h));
 //BA.debugLineNum = 105;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsuggest)(this);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsuggest  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 61;BA.debugLine="Sub SetMap(m As Map) As WixSuggest";
 //BA.debugLineNum = 62;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 63;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 64;BA.debugLine="Suggest.SetAttr(strKey,	strVal)";
_suggest._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 66;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsuggest)(this);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsuggest  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Sub SetMinHeight(h As Int) As WixSuggest";
 //BA.debugLineNum = 116;BA.debugLine="Suggest.SetMinHeight(h)";
_suggest._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 117;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsuggest)(this);
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsuggest  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Sub SetMinWidth(w As Int) As WixSuggest";
 //BA.debugLineNum = 110;BA.debugLine="Suggest.SetMinWidth(w)";
_suggest._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 111;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsuggest)(this);
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsuggest  _setname(String _n) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub SetName(n As String) As WixSuggest";
 //BA.debugLineNum = 79;BA.debugLine="Suggest.SetName(n)";
_suggest._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 80;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsuggest)(this);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsuggest  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Sub SetParent(p As WixElement) As WixSuggest";
 //BA.debugLineNum = 44;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 45;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsuggest)(this);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsuggest  _setrelativeleft(boolean _b) throws Exception{
 //BA.debugLineNum = 149;BA.debugLine="Sub SetRelativeLeft(b As Boolean) As WixSuggest  '";
 //BA.debugLineNum = 150;BA.debugLine="Suggest.SetAttr(\"relative\", \"left\")";
_suggest._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("relative",(Object)("left"));
 //BA.debugLineNum = 151;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsuggest)(this);
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsuggest  _setrelativeright(boolean _b) throws Exception{
 //BA.debugLineNum = 156;BA.debugLine="Sub SetRelativeRight(b As Boolean) As WixSuggest";
 //BA.debugLineNum = 157;BA.debugLine="Suggest.SetAttr(\"relative\", \"right\")";
_suggest._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("relative",(Object)("right"));
 //BA.debugLineNum = 158;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsuggest)(this);
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsuggest  _setrelativetop(boolean _b) throws Exception{
 //BA.debugLineNum = 142;BA.debugLine="Sub SetRelativeTop(b As Boolean) As WixSuggest   '";
 //BA.debugLineNum = 143;BA.debugLine="Suggest.SetAttr(\"relative\", \"top\")";
_suggest._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("relative",(Object)("top"));
 //BA.debugLineNum = 144;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsuggest)(this);
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsuggest  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub SetResponsive(b As Object) As WixSuggest";
 //BA.debugLineNum = 85;BA.debugLine="Suggest.SetResponsive(b)";
_suggest._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 86;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsuggest)(this);
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsuggest  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixSuggest";
 //BA.debugLineNum = 91;BA.debugLine="Suggest.SetResponsiveCell(b)";
_suggest._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 92;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsuggest)(this);
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsuggest  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 37;BA.debugLine="Suggest.SetStyle(prop,sval)";
_suggest._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 38;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsuggest)(this);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsuggest  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 27;BA.debugLine="Sub SetStyles(m As Map) As WixSuggest";
 //BA.debugLineNum = 28;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 29;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 30;BA.debugLine="Suggest.SetStyle(k,v)";
_suggest._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 32;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsuggest)(this);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsuggest  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 70;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixSuggest";
 //BA.debugLineNum = 71;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 72;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 73;BA.debugLine="Suggest.SetTemplate(os)";
_suggest._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 74;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsuggest)(this);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsuggest  _setwidth(int _w) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub SetWidth(w As Int) As WixSuggest";
 //BA.debugLineNum = 98;BA.debugLine="Suggest.SetWidth(w)";
_suggest._setwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_w));
 //BA.debugLineNum = 99;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsuggest)(this);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsuggest  _setycount(Object _y) throws Exception{
 //BA.debugLineNum = 168;BA.debugLine="Sub SetYCount(y As Object) As WixSuggest";
 //BA.debugLineNum = 169;BA.debugLine="Suggest.SetAttr(\"yCount\", y)";
_suggest._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("yCount",_y);
 //BA.debugLineNum = 170;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsuggest)(this);
 //BA.debugLineNum = 171;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
