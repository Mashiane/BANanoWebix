package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixscrollview extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixscrollview", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixscrollview.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _scrollview = null;
public anywheresoftware.b4a.objects.collections.List _rows = null;
public anywheresoftware.b4a.objects.collections.List _columns = null;
public anywheresoftware.b4a.objects.collections.Map _body = null;
public b4j.example.main _main = null;
public b4j.example.pgformdesigner _pgformdesigner = null;
public b4j.example.dbutton _dbutton = null;
public b4j.example.modcenter _modcenter = null;
public b4j.example.modsidebar _modsidebar = null;
public b4j.example.modtoolbar _modtoolbar = null;
public b4j.example.drow _drow = null;
public b4j.example.dpager _dpager = null;
public b4j.example.ddbllist _ddbllist = null;
public b4j.example.dform _dform = null;
public b4j.example.dcheckbox _dcheckbox = null;
public b4j.example.dcolorpicker _dcolorpicker = null;
public b4j.example.dcombo _dcombo = null;
public b4j.example.dcounter _dcounter = null;
public b4j.example.ddatepicker _ddatepicker = null;
public b4j.example.dicon _dicon = null;
public b4j.example.dlabel _dlabel = null;
public b4j.example.dradio _dradio = null;
public b4j.example.drichselect _drichselect = null;
public b4j.example.dsearch _dsearch = null;
public b4j.example.dselect _dselect = null;
public b4j.example.dsegmented _dsegmented = null;
public b4j.example.dslider _dslider = null;
public b4j.example.dswitch _dswitch = null;
public b4j.example.dtabbar _dtabbar = null;
public b4j.example.dtext _dtext = null;
public b4j.example.dtextarea _dtextarea = null;
public b4j.example.dtoggle _dtoggle = null;
public b4j.example.duploader _duploader = null;
public b4j.example.dfieldset _dfieldset = null;
public b4j.example.dsuggest _dsuggest = null;
public b4j.example.dcolumn _dcolumn = null;
public b4j.example.modpropertybag _modpropertybag = null;
public b4j.example.ddesignerproperty _ddesignerproperty = null;
public b4j.example.dconnection _dconnection = null;
public b4j.example.dtable _dtable = null;
public b4j.example.dfield _dfield = null;
public b4j.example.modwebix _modwebix = null;
public String  _addcolumns(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub AddColumns(itm As Map)";
 //BA.debugLineNum = 94;BA.debugLine="Columns.Add(itm)";
_columns.Add((Object)(_itm.getObject()));
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixscrollview  _addrow(b4j.example.wixrow _r) throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Sub AddRow(r As WixRow) As WixScrollView";
 //BA.debugLineNum = 68;BA.debugLine="Rows.Add(r.Item)";
_rows.Add((Object)(_r._item /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 69;BA.debugLine="Return Me";
if (true) return (b4j.example.wixscrollview)(this);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return null;
}
public String  _addrowitems(anywheresoftware.b4a.objects.collections.List _items) throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
 //BA.debugLineNum = 79;BA.debugLine="Sub AddRowItems(items As List)";
 //BA.debugLineNum = 80;BA.debugLine="For Each m As Map In items";
_m = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group1 = _items;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group1.Get(index1)));
 //BA.debugLineNum = 81;BA.debugLine="AddRows(m)";
_addrows(_m);
 }
};
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return "";
}
public String  _addrows(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Sub AddRows(itm As Map)";
 //BA.debugLineNum = 74;BA.debugLine="Rows.add(itm)";
_rows.Add((Object)(_itm.getObject()));
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return "";
}
public String  _addtocolumns(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 197;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 198;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 199;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 202;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 203;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 204;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 192;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 193;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return "";
}
public String  _addwixrows(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
b4j.example.wixrow _i = null;
 //BA.debugLineNum = 86;BA.debugLine="Sub AddWixRows(lst As List)";
 //BA.debugLineNum = 87;BA.debugLine="For Each i As WixRow In lst";
{
final anywheresoftware.b4a.BA.IterableList group1 = _lst;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_i = (b4j.example.wixrow)(group1.Get(index1));
 //BA.debugLineNum = 88;BA.debugLine="AddRow(i)";
_addrow(_i);
 }
};
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public ScrollView As WixElement";
_scrollview = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private Rows As List";
_rows = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 6;BA.debugLine="Private Columns As List";
_columns = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 7;BA.debugLine="Private body As Map";
_body = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixscrollview  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(sid As String) As WixScrollV";
 //BA.debugLineNum = 12;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 13;BA.debugLine="ScrollView.Initialize(ID).setview(\"scrollview\")";
_scrollview._initialize /*b4j.example.wixelement*/ (ba,_id)._setview /*b4j.example.wixelement*/ ("scrollview");
 //BA.debugLineNum = 14;BA.debugLine="Rows.Initialize";
_rows.Initialize();
 //BA.debugLineNum = 15;BA.debugLine="Columns.Initialize";
_columns.Initialize();
 //BA.debugLineNum = 16;BA.debugLine="body.Initialize";
_body.Initialize();
 //BA.debugLineNum = 17;BA.debugLine="Return Me";
if (true) return (b4j.example.wixscrollview)(this);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 99;BA.debugLine="If Rows.Size > 0 Then body.Put(\"rows\", Rows)";
if (_rows.getSize()>0) { 
_body.Put((Object)("rows"),(Object)(_rows.getObject()));};
 //BA.debugLineNum = 100;BA.debugLine="If Columns.Size > 0 Then body.Put(\"columns\", Colu";
if (_columns.getSize()>0) { 
_body.Put((Object)("columns"),(Object)(_columns.getObject()));};
 //BA.debugLineNum = 101;BA.debugLine="ScrollView.SetAttr(\"body\", body)";
_scrollview._setattr /*b4j.example.wixelement*/ ("body",(Object)(_body.getObject()));
 //BA.debugLineNum = 102;BA.debugLine="Return ScrollView.item";
if (true) return _scrollview._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixscrollview  _setautowidth(boolean _b) throws Exception{
 //BA.debugLineNum = 124;BA.debugLine="Sub SetAutoWidth(b As Boolean) As WixScrollView";
 //BA.debugLineNum = 125;BA.debugLine="ScrollView.SetAttr(\"autowidth\", b)";
_scrollview._setattr /*b4j.example.wixelement*/ ("autowidth",(Object)(_b));
 //BA.debugLineNum = 126;BA.debugLine="Return Me";
if (true) return (b4j.example.wixscrollview)(this);
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixscrollview  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Sub SetHeight(h As Object) As WixScrollView";
 //BA.debugLineNum = 113;BA.debugLine="ScrollView.SetAttr(\"height\", h)";
_scrollview._setattr /*b4j.example.wixelement*/ ("height",_h);
 //BA.debugLineNum = 114;BA.debugLine="Return Me";
if (true) return (b4j.example.wixscrollview)(this);
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixscrollview  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 59;BA.debugLine="Sub SetMap(m As Map) As WixScrollView";
 //BA.debugLineNum = 60;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 61;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 62;BA.debugLine="ScrollView.SetAttr(strKey,	strVal)";
_scrollview._setattr /*b4j.example.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 64;BA.debugLine="Return Me";
if (true) return (b4j.example.wixscrollview)(this);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixscrollview  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub SetMinHeight(h As Int) As WixScrollView";
 //BA.debugLineNum = 54;BA.debugLine="ScrollView.SetMinHeight(h)";
_scrollview._setminheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return (b4j.example.wixscrollview)(this);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixscrollview  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub SetMinWidth(w As Int) As WixScrollView";
 //BA.debugLineNum = 48;BA.debugLine="ScrollView.SetMinWidth(w)";
_scrollview._setminwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (b4j.example.wixscrollview)(this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixscrollview  _setname(String _n) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Sub SetName(n As String) As WixScrollView";
 //BA.debugLineNum = 29;BA.debugLine="ScrollView.SetName(n)";
_scrollview._setname /*b4j.example.wixelement*/ (_n);
 //BA.debugLineNum = 30;BA.debugLine="Return Me";
if (true) return (b4j.example.wixscrollview)(this);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixscrollview  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub SetResponsive(b As Object) As WixScrollView";
 //BA.debugLineNum = 35;BA.debugLine="ScrollView.SetResponsive(b)";
_scrollview._setresponsive /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4j.example.wixscrollview)(this);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixscrollview  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixScrollVie";
 //BA.debugLineNum = 41;BA.debugLine="ScrollView.SetResponsiveCell(b)";
_scrollview._setresponsivecell /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 42;BA.debugLine="Return Me";
if (true) return (b4j.example.wixscrollview)(this);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixscrollview  _setscroll(Object _b) throws Exception{
 //BA.debugLineNum = 136;BA.debugLine="Sub SetScroll(b As Object) As WixScrollView";
 //BA.debugLineNum = 137;BA.debugLine="ScrollView.SetProperty(\"scroll\", b)";
_scrollview._setproperty /*b4j.example.wixelement*/ ("scroll",_b);
 //BA.debugLineNum = 138;BA.debugLine="Return Me";
if (true) return (b4j.example.wixscrollview)(this);
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixscrollview  _setscrollview(String _t) throws Exception{
 //BA.debugLineNum = 130;BA.debugLine="Sub SetScrollView(t As String) As WixScrollView";
 //BA.debugLineNum = 131;BA.debugLine="ScrollView.SetAttr(\"ScrollView\", t)";
_scrollview._setattr /*b4j.example.wixelement*/ ("ScrollView",(Object)(_t));
 //BA.debugLineNum = 132;BA.debugLine="Return Me";
if (true) return (b4j.example.wixscrollview)(this);
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixscrollview  _setscrollxy(boolean _b) throws Exception{
 //BA.debugLineNum = 142;BA.debugLine="Sub SetScrollXY(b As Boolean) As WixScrollView  'i";
 //BA.debugLineNum = 143;BA.debugLine="SetScroll(\"xy\")";
_setscroll((Object)("xy"));
 //BA.debugLineNum = 144;BA.debugLine="Return Me";
if (true) return (b4j.example.wixscrollview)(this);
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixscrollview  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 107;BA.debugLine="ScrollView.SetStyle(prop,val)";
_scrollview._setstyle /*b4j.example.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 108;BA.debugLine="Return Me";
if (true) return (b4j.example.wixscrollview)(this);
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixscrollview  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 21;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixScrollV";
 //BA.debugLineNum = 22;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 23;BA.debugLine="ScrollView.SetTemplate(os)";
_scrollview._settemplate /*b4j.example.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 24;BA.debugLine="Return Me";
if (true) return (b4j.example.wixscrollview)(this);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixscrollview  _settype(String _t) throws Exception{
 //BA.debugLineNum = 148;BA.debugLine="Sub SetType(t As String) As WixScrollView";
 //BA.debugLineNum = 149;BA.debugLine="ScrollView.SetType(t)";
_scrollview._settype /*b4j.example.wixelement*/ (_t);
 //BA.debugLineNum = 150;BA.debugLine="Return Me";
if (true) return (b4j.example.wixscrollview)(this);
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixscrollview  _settypeclean(String _a) throws Exception{
 //BA.debugLineNum = 155;BA.debugLine="Sub SetTypeClean(a As String) As WixScrollView  'i";
 //BA.debugLineNum = 156;BA.debugLine="SetType(\"clean\")";
_settype("clean");
 //BA.debugLineNum = 157;BA.debugLine="Return Me";
if (true) return (b4j.example.wixscrollview)(this);
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixscrollview  _settypeform(String _a) throws Exception{
 //BA.debugLineNum = 185;BA.debugLine="Sub SetTypeForm(a As String) As WixScrollView  'ig";
 //BA.debugLineNum = 186;BA.debugLine="SetType(\"form\")";
_settype("form");
 //BA.debugLineNum = 187;BA.debugLine="Return Me";
if (true) return (b4j.example.wixscrollview)(this);
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixscrollview  _settypehead(String _a) throws Exception{
 //BA.debugLineNum = 179;BA.debugLine="Sub SetTypeHead(a As String) As WixScrollView   'i";
 //BA.debugLineNum = 180;BA.debugLine="SetType(\"head\")";
_settype("head");
 //BA.debugLineNum = 181;BA.debugLine="Return Me";
if (true) return (b4j.example.wixscrollview)(this);
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixscrollview  _settypeline(String _a) throws Exception{
 //BA.debugLineNum = 161;BA.debugLine="Sub SetTypeLine(a As String) As WixScrollView   'i";
 //BA.debugLineNum = 162;BA.debugLine="SetType(\"line\")";
_settype("line");
 //BA.debugLineNum = 163;BA.debugLine="Return Me";
if (true) return (b4j.example.wixscrollview)(this);
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixscrollview  _settypespace(String _a) throws Exception{
 //BA.debugLineNum = 173;BA.debugLine="Sub SetTypeSpace(a As String) As WixScrollView   '";
 //BA.debugLineNum = 174;BA.debugLine="SetType(\"space\")";
_settype("space");
 //BA.debugLineNum = 175;BA.debugLine="Return Me";
if (true) return (b4j.example.wixscrollview)(this);
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixscrollview  _settypewide(String _a) throws Exception{
 //BA.debugLineNum = 167;BA.debugLine="Sub SetTypeWide(a As String) As WixScrollView   'i";
 //BA.debugLineNum = 168;BA.debugLine="SetType(\"wide\")";
_settype("wide");
 //BA.debugLineNum = 169;BA.debugLine="Return Me";
if (true) return (b4j.example.wixscrollview)(this);
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixscrollview  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Sub SetWidth(w As Object) As WixScrollView";
 //BA.debugLineNum = 119;BA.debugLine="ScrollView.SetAttr(\"width\", w)";
_scrollview._setattr /*b4j.example.wixelement*/ ("width",_w);
 //BA.debugLineNum = 120;BA.debugLine="Return Me";
if (true) return (b4j.example.wixscrollview)(this);
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
