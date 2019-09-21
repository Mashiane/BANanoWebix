package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixtreetable extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixtreetable", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixtreetable.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _treetable = null;
public String _dt_select_row = "";
public String _dt_select_cell = "";
public String _dt_select_column = "";
public anywheresoftware.b4a.objects.collections.List _items = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public String  _addcolumns(b4j.Mashy.BANanoWebixDemo.wixdatacolumn _c) throws Exception{
 //BA.debugLineNum = 131;BA.debugLine="Sub AddColumns(c As WixDataColumn)";
 //BA.debugLineNum = 132;BA.debugLine="TreeTable.AddDataColumn(c.Item)";
_treetable._adddatacolumn /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_c._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixtreetable  _additem(String _parentid,String _meid,String _mvalue,anywheresoftware.b4a.objects.collections.Map _mdata,boolean _mopen) throws Exception{
anywheresoftware.b4a.objects.collections.Map _mitem = null;
String _mkey = "";
String _mvalue1 = "";
 //BA.debugLineNum = 201;BA.debugLine="Sub AddItem(parentID As String, meID As String, mV";
 //BA.debugLineNum = 202;BA.debugLine="parentID = parentID.tolowercase";
_parentid = _parentid.toLowerCase();
 //BA.debugLineNum = 203;BA.debugLine="meID = meID.tolowercase";
_meid = _meid.toLowerCase();
 //BA.debugLineNum = 204;BA.debugLine="Dim mitem As Map = CreateMap()";
_mitem = new anywheresoftware.b4a.objects.collections.Map();
_mitem = __c.createMap(new Object[] {});
 //BA.debugLineNum = 205;BA.debugLine="mitem.Put(\"id\", meID)";
_mitem.Put((Object)("id"),(Object)(_meid));
 //BA.debugLineNum = 206;BA.debugLine="mitem.Put(\"value\", mValue)";
_mitem.Put((Object)("value"),(Object)(_mvalue));
 //BA.debugLineNum = 207;BA.debugLine="mitem.Put(\"open\", mOpen)";
_mitem.Put((Object)("open"),(Object)(_mopen));
 //BA.debugLineNum = 208;BA.debugLine="mitem.Put(\"parentid\", parentID)";
_mitem.Put((Object)("parentid"),(Object)(_parentid));
 //BA.debugLineNum = 209;BA.debugLine="For Each mKey As String In mData.Keys";
{
final anywheresoftware.b4a.BA.IterableList group8 = _mdata.Keys();
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_mkey = BA.ObjectToString(group8.Get(index8));
 //BA.debugLineNum = 210;BA.debugLine="Dim mValue1 As String = mData.Get(mKey)";
_mvalue1 = BA.ObjectToString(_mdata.Get((Object)(_mkey)));
 //BA.debugLineNum = 211;BA.debugLine="mKey = mKey.tolowercase";
_mkey = _mkey.toLowerCase();
 //BA.debugLineNum = 212;BA.debugLine="mitem.Put(mKey, mValue1)";
_mitem.Put((Object)(_mkey),(Object)(_mvalue1));
 }
};
 //BA.debugLineNum = 214;BA.debugLine="Items.Add(mitem)";
_items.Add((Object)(_mitem.getObject()));
 //BA.debugLineNum = 215;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtreetable)(this);
 //BA.debugLineNum = 216;BA.debugLine="End Sub";
return null;
}
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 225;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 226;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 227;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 230;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 231;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 232;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 220;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 221;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 222;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public TreeTable As WixElement";
_treetable = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 6;BA.debugLine="Public DT_SELECT_ROW As String = \"row\"";
_dt_select_row = "row";
 //BA.debugLineNum = 7;BA.debugLine="Public DT_SELECT_CELL As String = \"cell\"";
_dt_select_cell = "cell";
 //BA.debugLineNum = 8;BA.debugLine="Public DT_SELECT_COLUMN As String = \"column\"";
_dt_select_column = "column";
 //BA.debugLineNum = 9;BA.debugLine="Private Items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 10;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _createcolumn(String _hid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixdatacolumn _hdr = null;
 //BA.debugLineNum = 194;BA.debugLine="Sub CreateColumn(hid As String) As WixDataColumn";
 //BA.debugLineNum = 195;BA.debugLine="Dim hdr As WixDataColumn";
_hdr = new b4j.Mashy.BANanoWebixDemo.wixdatacolumn();
 //BA.debugLineNum = 196;BA.debugLine="hdr.Initialize(hid)";
_hdr._initialize /*b4j.Mashy.BANanoWebixDemo.wixdatacolumn*/ (ba,_hid);
 //BA.debugLineNum = 197;BA.debugLine="Return hdr";
if (true) return _hdr;
 //BA.debugLineNum = 198;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtreetable  _initialize(anywheresoftware.b4a.BA _ba,String _eid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 33;BA.debugLine="Public Sub Initialize(eID As String) As WixTreeTab";
 //BA.debugLineNum = 34;BA.debugLine="ID = eID.tolowercase";
_id = _eid.toLowerCase();
 //BA.debugLineNum = 35;BA.debugLine="TreeTable.Initialize(ID).SetView(\"treetable\")";
_treetable._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_id)._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("treetable");
 //BA.debugLineNum = 36;BA.debugLine="Items.Initialize";
_items.Initialize();
 //BA.debugLineNum = 37;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 38;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtreetable)(this);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
anywheresoftware.b4a.objects.collections.List _data = null;
 //BA.debugLineNum = 136;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 137;BA.debugLine="If Items.Size > 0 Then";
if (_items.getSize()>0) { 
 //BA.debugLineNum = 138;BA.debugLine="Dim data As List = modWebix.Unflatten(Items, \"da";
_data = new anywheresoftware.b4a.objects.collections.List();
_data = _modwebix._unflatten /*anywheresoftware.b4a.objects.collections.List*/ (_items,"data");
 //BA.debugLineNum = 139;BA.debugLine="SetData(data)";
_setdata(_data);
 };
 //BA.debugLineNum = 141;BA.debugLine="Return TreeTable.item";
if (true) return _treetable._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 73;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixtreetable  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 42;BA.debugLine="Sub SetAttributes(m As Map) As WixTreeTable";
 //BA.debugLineNum = 43;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 44;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 45;BA.debugLine="TreeTable.SetAttr(k,v)";
_treetable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 47;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtreetable)(this);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtreetable  _setautoheight(boolean _b) throws Exception{
 //BA.debugLineNum = 182;BA.debugLine="Sub SetAutoHeight(b As Boolean) As WixTreeTable";
 //BA.debugLineNum = 183;BA.debugLine="TreeTable.SetAttr(\"autoheight\", b)";
_treetable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("autoheight",(Object)(_b));
 //BA.debugLineNum = 184;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtreetable)(this);
 //BA.debugLineNum = 185;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtreetable  _setautowidth(boolean _b) throws Exception{
 //BA.debugLineNum = 188;BA.debugLine="Sub SetAutoWidth(b As Boolean) As WixTreeTable";
 //BA.debugLineNum = 189;BA.debugLine="TreeTable.SetAttr(\"autowidth\", b)";
_treetable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("autowidth",(Object)(_b));
 //BA.debugLineNum = 190;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtreetable)(this);
 //BA.debugLineNum = 191;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtreetable  _setborderless(boolean _b) throws Exception{
 //BA.debugLineNum = 145;BA.debugLine="Sub SetBorderLess(b As Boolean) As WixTreeTable";
 //BA.debugLineNum = 146;BA.debugLine="TreeTable.SetBorderLess(b)";
_treetable._setborderless /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 147;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtreetable)(this);
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtreetable  _setdata(anywheresoftware.b4a.objects.collections.List _data) throws Exception{
 //BA.debugLineNum = 151;BA.debugLine="Sub SetData(data As List) As WixTreeTable";
 //BA.debugLineNum = 152;BA.debugLine="TreeTable.SetData(data)";
_treetable._setdata /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_data);
 //BA.debugLineNum = 153;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtreetable)(this);
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtreetable  _seteditable(boolean _b) throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Sub SetEditable(b As Boolean) As WixTreeTable";
 //BA.debugLineNum = 119;BA.debugLine="TreeTable.SetAttr(\"editable\", b)";
_treetable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("editable",(Object)(_b));
 //BA.debugLineNum = 120;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtreetable)(this);
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtreetable  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 169;BA.debugLine="Sub SetHeight(h As Object) As WixTreeTable";
 //BA.debugLineNum = 170;BA.debugLine="TreeTable.SetHeight(h)";
_treetable._setheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 171;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtreetable)(this);
 //BA.debugLineNum = 172;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtreetable  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 109;BA.debugLine="Sub SetMap(m As Map) As WixTreeTable";
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
 //BA.debugLineNum = 112;BA.debugLine="TreeTable.SetAttr(strKey,	strVal)";
_treetable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 114;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtreetable)(this);
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtreetable  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Sub SetMargin(margin As Object) As WixTreeTable";
 //BA.debugLineNum = 28;BA.debugLine="TreeTable.SetMargin(margin)";
_treetable._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 29;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtreetable)(this);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtreetable  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Sub SetMinHeight(h As Int) As WixTreeTable";
 //BA.debugLineNum = 104;BA.debugLine="TreeTable.SetMinHeight(h)";
_treetable._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 105;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtreetable)(this);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtreetable  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub SetMinWidth(w As Int) As WixTreeTable";
 //BA.debugLineNum = 98;BA.debugLine="TreeTable.SetMinWidth(w)";
_treetable._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 99;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtreetable)(this);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtreetable  _setname(String _n) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub SetName(n As String) As WixTreeTable";
 //BA.debugLineNum = 67;BA.debugLine="TreeTable.SetName(n)";
_treetable._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 68;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtreetable)(this);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtreetable  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub SetPadding(padding As Object) As WixTreeTable";
 //BA.debugLineNum = 22;BA.debugLine="TreeTable.SetPadding(padding)";
_treetable._setpadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtreetable)(this);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtreetable  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub SetParent(p As WixElement) As WixTreeTable";
 //BA.debugLineNum = 16;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 17;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtreetable)(this);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtreetable  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub SetResponsive(b As Object) As WixTreeTable";
 //BA.debugLineNum = 85;BA.debugLine="TreeTable.SetResponsive(b)";
_treetable._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 86;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtreetable)(this);
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtreetable  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixTreeTable";
 //BA.debugLineNum = 91;BA.debugLine="TreeTable.SetResponsiveCell(b)";
_treetable._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 92;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtreetable)(this);
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtreetable  _setselect(Object _s) throws Exception{
 //BA.debugLineNum = 125;BA.debugLine="Sub SetSelect(s As Object) As WixTreeTable";
 //BA.debugLineNum = 126;BA.debugLine="TreeTable.SetAttr(\"select\", s)";
_treetable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("select",_s);
 //BA.debugLineNum = 127;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtreetable)(this);
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtreetable  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 60;BA.debugLine="TreeTable.SetStyle(prop,sval)";
_treetable._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 61;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtreetable)(this);
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtreetable  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 50;BA.debugLine="Sub SetStyles(m As Map) As WixTreeTable";
 //BA.debugLineNum = 51;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 52;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 53;BA.debugLine="TreeTable.SetStyle(k,v)";
_treetable._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtreetable)(this);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtreetable  _settemplate(Object _t) throws Exception{
 //BA.debugLineNum = 157;BA.debugLine="Sub SetTemplate(t As Object) As WixTreeTable";
 //BA.debugLineNum = 158;BA.debugLine="TreeTable.SetTemplate(t)";
_treetable._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_t);
 //BA.debugLineNum = 159;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtreetable)(this);
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtreetable  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 76;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixTreeTab";
 //BA.debugLineNum = 77;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 78;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 79;BA.debugLine="TreeTable.SetTemplate(os)";
_treetable._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 80;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtreetable)(this);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtreetable  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 163;BA.debugLine="Sub SetTooltip(tt As String) As WixTreeTable";
 //BA.debugLineNum = 164;BA.debugLine="TreeTable.SetTooltip(tt)";
_treetable._settooltip /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_tt);
 //BA.debugLineNum = 165;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtreetable)(this);
 //BA.debugLineNum = 166;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtreetable  _setwidth(Object _h) throws Exception{
 //BA.debugLineNum = 175;BA.debugLine="Sub SetWidth(h As Object) As WixTreeTable";
 //BA.debugLineNum = 176;BA.debugLine="TreeTable.SetWidth(h)";
_treetable._setwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 177;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtreetable)(this);
 //BA.debugLineNum = 178;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
