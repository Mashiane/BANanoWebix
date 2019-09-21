package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixscrollview extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixscrollview", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixscrollview.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _scrollview = null;
public anywheresoftware.b4a.objects.collections.List _rows = null;
public anywheresoftware.b4a.objects.collections.List _columns = null;
public anywheresoftware.b4a.objects.collections.Map _body = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public String  _addcolumns(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 143;BA.debugLine="Sub AddColumns(itm As Map)";
 //BA.debugLineNum = 144;BA.debugLine="Columns.Add(itm)";
_columns.Add((Object)(_itm.getObject()));
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixscrollview  _addrow(b4j.Mashy.BANanoWebixDemo.wixrow _r) throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Sub AddRow(r As WixRow) As WixScrollView";
 //BA.debugLineNum = 118;BA.debugLine="Rows.Add(r.Item)";
_rows.Add((Object)(_r._item /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 119;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixscrollview)(this);
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return null;
}
public String  _addrowitems(anywheresoftware.b4a.objects.collections.List _items) throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
 //BA.debugLineNum = 129;BA.debugLine="Sub AddRowItems(items As List)";
 //BA.debugLineNum = 130;BA.debugLine="For Each m As Map In items";
_m = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group1 = _items;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group1.Get(index1)));
 //BA.debugLineNum = 131;BA.debugLine="AddRows(m)";
_addrows(_m);
 }
};
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return "";
}
public String  _addrows(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Sub AddRows(itm As Map)";
 //BA.debugLineNum = 124;BA.debugLine="Rows.add(itm)";
_rows.Add((Object)(_itm.getObject()));
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return "";
}
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 241;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 242;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 243;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 246;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 247;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 248;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 236;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 237;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 238;BA.debugLine="End Sub";
return "";
}
public String  _addwixrows(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixrow _i = null;
 //BA.debugLineNum = 136;BA.debugLine="Sub AddWixRows(lst As List)";
 //BA.debugLineNum = 137;BA.debugLine="For Each i As WixRow In lst";
{
final anywheresoftware.b4a.BA.IterableList group1 = _lst;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_i = (b4j.Mashy.BANanoWebixDemo.wixrow)(group1.Get(index1));
 //BA.debugLineNum = 138;BA.debugLine="AddRow(i)";
_addrow(_i);
 }
};
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public ScrollView As WixElement";
_scrollview = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private Rows As List";
_rows = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 6;BA.debugLine="Private Columns As List";
_columns = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 7;BA.debugLine="Private body As Map";
_body = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 8;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixscrollview  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize(sid As String) As WixScrollV";
 //BA.debugLineNum = 14;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 15;BA.debugLine="ScrollView.Initialize(ID).setview(\"scrollview\")";
_scrollview._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_id)._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("scrollview");
 //BA.debugLineNum = 16;BA.debugLine="Rows.Initialize";
_rows.Initialize();
 //BA.debugLineNum = 17;BA.debugLine="Columns.Initialize";
_columns.Initialize();
 //BA.debugLineNum = 18;BA.debugLine="body.Initialize";
_body.Initialize();
 //BA.debugLineNum = 19;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 20;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixscrollview)(this);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 148;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 149;BA.debugLine="If Rows.Size > 0 Then body.Put(\"rows\", Rows)";
if (_rows.getSize()>0) { 
_body.Put((Object)("rows"),(Object)(_rows.getObject()));};
 //BA.debugLineNum = 150;BA.debugLine="If Columns.Size > 0 Then body.Put(\"columns\", Colu";
if (_columns.getSize()>0) { 
_body.Put((Object)("columns"),(Object)(_columns.getObject()));};
 //BA.debugLineNum = 151;BA.debugLine="ScrollView.SetAttr(\"body\", body)";
_scrollview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("body",(Object)(_body.getObject()));
 //BA.debugLineNum = 152;BA.debugLine="Return ScrollView.item";
if (true) return _scrollview._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 67;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixscrollview  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 35;BA.debugLine="Sub SetAttributes(m As Map) As WixScrollView";
 //BA.debugLineNum = 36;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 37;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 38;BA.debugLine="ScrollView.SetAttr(k,v)";
_scrollview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 40;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixscrollview)(this);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixscrollview  _setautowidth(boolean _b) throws Exception{
 //BA.debugLineNum = 168;BA.debugLine="Sub SetAutoWidth(b As Boolean) As WixScrollView";
 //BA.debugLineNum = 169;BA.debugLine="ScrollView.SetAttr(\"autowidth\", b)";
_scrollview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("autowidth",(Object)(_b));
 //BA.debugLineNum = 170;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixscrollview)(this);
 //BA.debugLineNum = 171;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixscrollview  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 156;BA.debugLine="Sub SetHeight(h As Object) As WixScrollView";
 //BA.debugLineNum = 157;BA.debugLine="ScrollView.SetAttr(\"height\", h)";
_scrollview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("height",_h);
 //BA.debugLineNum = 158;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixscrollview)(this);
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixscrollview  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 109;BA.debugLine="Sub SetMap(m As Map) As WixScrollView";
 //BA.debugLineNum = 110;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 111;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 112;BA.debugLine="ScrollView.SetAttr(strKey,	strVal)";
_scrollview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 114;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixscrollview)(this);
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixscrollview  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Sub SetMargin(margin As Object) As WixScrollView";
 //BA.debugLineNum = 31;BA.debugLine="ScrollView.SetMargin(margin)";
_scrollview._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 32;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixscrollview)(this);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixscrollview  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Sub SetMinHeight(h As Int) As WixScrollView";
 //BA.debugLineNum = 104;BA.debugLine="ScrollView.SetMinHeight(h)";
_scrollview._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 105;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixscrollview)(this);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixscrollview  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub SetMinWidth(w As Int) As WixScrollView";
 //BA.debugLineNum = 98;BA.debugLine="ScrollView.SetMinWidth(w)";
_scrollview._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 99;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixscrollview)(this);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixscrollview  _setname(String _n) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub SetName(n As String) As WixScrollView";
 //BA.debugLineNum = 79;BA.debugLine="ScrollView.SetName(n)";
_scrollview._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 80;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixscrollview)(this);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixscrollview  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub SetPadding(padding As Object) As WixScrollView";
 //BA.debugLineNum = 25;BA.debugLine="ScrollView.SetPadding(padding)";
_scrollview._setpadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 26;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixscrollview)(this);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixscrollview  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Sub SetParent(p As WixElement) As WixScrollView";
 //BA.debugLineNum = 60;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 61;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixscrollview)(this);
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixscrollview  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub SetResponsive(b As Object) As WixScrollView";
 //BA.debugLineNum = 85;BA.debugLine="ScrollView.SetResponsive(b)";
_scrollview._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 86;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixscrollview)(this);
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixscrollview  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixScrollVie";
 //BA.debugLineNum = 91;BA.debugLine="ScrollView.SetResponsiveCell(b)";
_scrollview._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 92;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixscrollview)(this);
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixscrollview  _setscroll(Object _b) throws Exception{
 //BA.debugLineNum = 180;BA.debugLine="Sub SetScroll(b As Object) As WixScrollView";
 //BA.debugLineNum = 181;BA.debugLine="ScrollView.SetAttr(\"scroll\", b)";
_scrollview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("scroll",_b);
 //BA.debugLineNum = 182;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixscrollview)(this);
 //BA.debugLineNum = 183;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixscrollview  _setscrollview(String _t) throws Exception{
 //BA.debugLineNum = 174;BA.debugLine="Sub SetScrollView(t As String) As WixScrollView";
 //BA.debugLineNum = 175;BA.debugLine="ScrollView.SetAttr(\"ScrollView\", t)";
_scrollview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("ScrollView",(Object)(_t));
 //BA.debugLineNum = 176;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixscrollview)(this);
 //BA.debugLineNum = 177;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixscrollview  _setscrollxy(boolean _b) throws Exception{
 //BA.debugLineNum = 186;BA.debugLine="Sub SetScrollXY(b As Boolean) As WixScrollView  'i";
 //BA.debugLineNum = 187;BA.debugLine="SetScroll(\"xy\")";
_setscroll((Object)("xy"));
 //BA.debugLineNum = 188;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixscrollview)(this);
 //BA.debugLineNum = 189;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixscrollview  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 53;BA.debugLine="ScrollView.SetStyle(prop,sval)";
_scrollview._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixscrollview)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixscrollview  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 43;BA.debugLine="Sub SetStyles(m As Map) As WixScrollView";
 //BA.debugLineNum = 44;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 45;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 46;BA.debugLine="ScrollView.SetStyle(k,v)";
_scrollview._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 48;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixscrollview)(this);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixscrollview  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 70;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixScrollV";
 //BA.debugLineNum = 71;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 72;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 73;BA.debugLine="ScrollView.SetTemplate(os)";
_scrollview._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 74;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixscrollview)(this);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixscrollview  _settype(String _t) throws Exception{
 //BA.debugLineNum = 192;BA.debugLine="Sub SetType(t As String) As WixScrollView";
 //BA.debugLineNum = 193;BA.debugLine="ScrollView.SetType(t)";
_scrollview._settype /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_t);
 //BA.debugLineNum = 194;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixscrollview)(this);
 //BA.debugLineNum = 195;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixscrollview  _settypeclean(String _a) throws Exception{
 //BA.debugLineNum = 199;BA.debugLine="Sub SetTypeClean(a As String) As WixScrollView  'i";
 //BA.debugLineNum = 200;BA.debugLine="SetType(\"clean\")";
_settype("clean");
 //BA.debugLineNum = 201;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixscrollview)(this);
 //BA.debugLineNum = 202;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixscrollview  _settypeform(String _a) throws Exception{
 //BA.debugLineNum = 229;BA.debugLine="Sub SetTypeForm(a As String) As WixScrollView  'ig";
 //BA.debugLineNum = 230;BA.debugLine="SetType(\"form\")";
_settype("form");
 //BA.debugLineNum = 231;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixscrollview)(this);
 //BA.debugLineNum = 232;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixscrollview  _settypehead(String _a) throws Exception{
 //BA.debugLineNum = 223;BA.debugLine="Sub SetTypeHead(a As String) As WixScrollView   'i";
 //BA.debugLineNum = 224;BA.debugLine="SetType(\"head\")";
_settype("head");
 //BA.debugLineNum = 225;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixscrollview)(this);
 //BA.debugLineNum = 226;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixscrollview  _settypeline(String _a) throws Exception{
 //BA.debugLineNum = 205;BA.debugLine="Sub SetTypeLine(a As String) As WixScrollView   'i";
 //BA.debugLineNum = 206;BA.debugLine="SetType(\"line\")";
_settype("line");
 //BA.debugLineNum = 207;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixscrollview)(this);
 //BA.debugLineNum = 208;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixscrollview  _settypespace(String _a) throws Exception{
 //BA.debugLineNum = 217;BA.debugLine="Sub SetTypeSpace(a As String) As WixScrollView   '";
 //BA.debugLineNum = 218;BA.debugLine="SetType(\"space\")";
_settype("space");
 //BA.debugLineNum = 219;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixscrollview)(this);
 //BA.debugLineNum = 220;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixscrollview  _settypewide(String _a) throws Exception{
 //BA.debugLineNum = 211;BA.debugLine="Sub SetTypeWide(a As String) As WixScrollView   'i";
 //BA.debugLineNum = 212;BA.debugLine="SetType(\"wide\")";
_settype("wide");
 //BA.debugLineNum = 213;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixscrollview)(this);
 //BA.debugLineNum = 214;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixscrollview  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 162;BA.debugLine="Sub SetWidth(w As Object) As WixScrollView";
 //BA.debugLineNum = 163;BA.debugLine="ScrollView.SetAttr(\"width\", w)";
_scrollview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("width",_w);
 //BA.debugLineNum = 164;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixscrollview)(this);
 //BA.debugLineNum = 165;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
