package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixtreetable extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixtreetable", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixtreetable.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _treetable = null;
public String _dt_select_row = "";
public String _dt_select_cell = "";
public String _dt_select_column = "";
public anywheresoftware.b4a.objects.collections.List _items = null;
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
public String  _addcolumns(b4j.example.wixdatacolumn _c) throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Sub AddColumns(c As WixDataColumn)";
 //BA.debugLineNum = 82;BA.debugLine="TreeTable.AddDataColumn(c.Item)";
_treetable._adddatacolumn /*b4j.example.wixelement*/ (_c._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixtreetable  _additem(String _parentid,String _meid,String _mvalue,anywheresoftware.b4a.objects.collections.Map _mdata,boolean _mopen) throws Exception{
anywheresoftware.b4a.objects.collections.Map _mitem = null;
String _mkey = "";
String _mvalue1 = "";
 //BA.debugLineNum = 157;BA.debugLine="Sub AddItem(parentID As String, meID As String, mV";
 //BA.debugLineNum = 158;BA.debugLine="parentID = parentID.tolowercase";
_parentid = _parentid.toLowerCase();
 //BA.debugLineNum = 159;BA.debugLine="meID = meID.tolowercase";
_meid = _meid.toLowerCase();
 //BA.debugLineNum = 160;BA.debugLine="Dim mitem As Map = CreateMap()";
_mitem = new anywheresoftware.b4a.objects.collections.Map();
_mitem = __c.createMap(new Object[] {});
 //BA.debugLineNum = 161;BA.debugLine="mitem.Put(\"id\", meID)";
_mitem.Put((Object)("id"),(Object)(_meid));
 //BA.debugLineNum = 162;BA.debugLine="mitem.Put(\"value\", mValue)";
_mitem.Put((Object)("value"),(Object)(_mvalue));
 //BA.debugLineNum = 163;BA.debugLine="mitem.Put(\"open\", mOpen)";
_mitem.Put((Object)("open"),(Object)(_mopen));
 //BA.debugLineNum = 164;BA.debugLine="mitem.Put(\"parentid\", parentID)";
_mitem.Put((Object)("parentid"),(Object)(_parentid));
 //BA.debugLineNum = 165;BA.debugLine="For Each mKey As String In mData.Keys";
{
final anywheresoftware.b4a.BA.IterableList group8 = _mdata.Keys();
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_mkey = BA.ObjectToString(group8.Get(index8));
 //BA.debugLineNum = 166;BA.debugLine="Dim mValue1 As String = mData.Get(mKey)";
_mvalue1 = BA.ObjectToString(_mdata.Get((Object)(_mkey)));
 //BA.debugLineNum = 167;BA.debugLine="mKey = mKey.tolowercase";
_mkey = _mkey.toLowerCase();
 //BA.debugLineNum = 168;BA.debugLine="mitem.Put(mKey, mValue1)";
_mitem.Put((Object)(_mkey),(Object)(_mvalue1));
 }
};
 //BA.debugLineNum = 170;BA.debugLine="Items.Add(mitem)";
_items.Add((Object)(_mitem.getObject()));
 //BA.debugLineNum = 171;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtreetable)(this);
 //BA.debugLineNum = 172;BA.debugLine="End Sub";
return null;
}
public String  _addtocolumns(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 181;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 182;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 183;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 186;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 187;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 176;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 177;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 178;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public TreeTable As WixElement";
_treetable = new b4j.example.wixelement();
 //BA.debugLineNum = 6;BA.debugLine="Public DT_SELECT_ROW As String = \"row\"";
_dt_select_row = "row";
 //BA.debugLineNum = 7;BA.debugLine="Public DT_SELECT_CELL As String = \"cell\"";
_dt_select_cell = "cell";
 //BA.debugLineNum = 8;BA.debugLine="Public DT_SELECT_COLUMN As String = \"column\"";
_dt_select_column = "column";
 //BA.debugLineNum = 9;BA.debugLine="Private Items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixdatacolumn  _createcolumn(String _hid) throws Exception{
b4j.example.wixdatacolumn _hdr = null;
 //BA.debugLineNum = 150;BA.debugLine="Sub CreateColumn(hid As String) As WixDataColumn";
 //BA.debugLineNum = 151;BA.debugLine="Dim hdr As WixDataColumn";
_hdr = new b4j.example.wixdatacolumn();
 //BA.debugLineNum = 152;BA.debugLine="hdr.Initialize(hid)";
_hdr._initialize /*b4j.example.wixdatacolumn*/ (ba,_hid);
 //BA.debugLineNum = 153;BA.debugLine="Return hdr";
if (true) return _hdr;
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtreetable  _initialize(anywheresoftware.b4a.BA _ba,String _eid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize(eID As String) As WixTreeTab";
 //BA.debugLineNum = 14;BA.debugLine="ID = eID.tolowercase";
_id = _eid.toLowerCase();
 //BA.debugLineNum = 15;BA.debugLine="TreeTable.Initialize(ID).SetView(\"treetable\")";
_treetable._initialize /*b4j.example.wixelement*/ (ba,_id)._setview /*b4j.example.wixelement*/ ("treetable");
 //BA.debugLineNum = 16;BA.debugLine="Items.Initialize";
_items.Initialize();
 //BA.debugLineNum = 17;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtreetable)(this);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
anywheresoftware.b4a.objects.collections.List _data = null;
 //BA.debugLineNum = 86;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 87;BA.debugLine="If Items.Size > 0 Then";
if (_items.getSize()>0) { 
 //BA.debugLineNum = 88;BA.debugLine="Dim data As List = modWebix.Unflatten(Items, \"da";
_data = new anywheresoftware.b4a.objects.collections.List();
_data = _modwebix._unflatten /*anywheresoftware.b4a.objects.collections.List*/ (_items,"data");
 //BA.debugLineNum = 89;BA.debugLine="SetData(data)";
_setdata(_data);
 };
 //BA.debugLineNum = 91;BA.debugLine="Return TreeTable.item";
if (true) return _treetable._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtreetable  _setautoheight(boolean _b) throws Exception{
 //BA.debugLineNum = 138;BA.debugLine="Sub SetAutoHeight(b As Boolean) As WixTreeTable";
 //BA.debugLineNum = 139;BA.debugLine="TreeTable.SetAttr(\"autoheight\", b)";
_treetable._setattr /*b4j.example.wixelement*/ ("autoheight",(Object)(_b));
 //BA.debugLineNum = 140;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtreetable)(this);
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtreetable  _setautowidth(boolean _b) throws Exception{
 //BA.debugLineNum = 144;BA.debugLine="Sub SetAutoWidth(b As Boolean) As WixTreeTable";
 //BA.debugLineNum = 145;BA.debugLine="TreeTable.SetAttr(\"autowidth\", b)";
_treetable._setattr /*b4j.example.wixelement*/ ("autowidth",(Object)(_b));
 //BA.debugLineNum = 146;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtreetable)(this);
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtreetable  _setborderless(boolean _b) throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Sub SetBorderLess(b As Boolean) As WixTreeTable";
 //BA.debugLineNum = 96;BA.debugLine="TreeTable.SetBorderLess(b)";
_treetable._setborderless /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 97;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtreetable)(this);
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtreetable  _setdata(anywheresoftware.b4a.objects.collections.List _data) throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Sub SetData(data As List) As WixTreeTable";
 //BA.debugLineNum = 102;BA.debugLine="TreeTable.SetData(data)";
_treetable._setdata /*b4j.example.wixelement*/ (_data);
 //BA.debugLineNum = 103;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtreetable)(this);
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtreetable  _seteditable(boolean _b) throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Sub SetEditable(b As Boolean) As WixTreeTable";
 //BA.debugLineNum = 69;BA.debugLine="TreeTable.SetAttr(\"editable\", b)";
_treetable._setattr /*b4j.example.wixelement*/ ("editable",(Object)(_b));
 //BA.debugLineNum = 70;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtreetable)(this);
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtreetable  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 125;BA.debugLine="Sub SetHeight(h As Object) As WixTreeTable";
 //BA.debugLineNum = 126;BA.debugLine="TreeTable.SetHeight(h)";
_treetable._setheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 127;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtreetable)(this);
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtreetable  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 59;BA.debugLine="Sub SetMap(m As Map) As WixTreeTable";
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
 //BA.debugLineNum = 62;BA.debugLine="TreeTable.SetAttr(strKey,	strVal)";
_treetable._setattr /*b4j.example.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 64;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtreetable)(this);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtreetable  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub SetMinHeight(h As Int) As WixTreeTable";
 //BA.debugLineNum = 54;BA.debugLine="TreeTable.SetMinHeight(h)";
_treetable._setminheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtreetable)(this);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtreetable  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub SetMinWidth(w As Int) As WixTreeTable";
 //BA.debugLineNum = 48;BA.debugLine="TreeTable.SetMinWidth(w)";
_treetable._setminwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtreetable)(this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtreetable  _setname(String _n) throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub SetName(n As String) As WixTreeTable";
 //BA.debugLineNum = 22;BA.debugLine="TreeTable.SetName(n)";
_treetable._setname /*b4j.example.wixelement*/ (_n);
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtreetable)(this);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtreetable  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub SetResponsive(b As Object) As WixTreeTable";
 //BA.debugLineNum = 35;BA.debugLine="TreeTable.SetResponsive(b)";
_treetable._setresponsive /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtreetable)(this);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtreetable  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixTreeTable";
 //BA.debugLineNum = 41;BA.debugLine="TreeTable.SetResponsiveCell(b)";
_treetable._setresponsivecell /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 42;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtreetable)(this);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtreetable  _setselect(Object _s) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Sub SetSelect(s As Object) As WixTreeTable";
 //BA.debugLineNum = 76;BA.debugLine="TreeTable.SetAttr(\"select\", s)";
_treetable._setattr /*b4j.example.wixelement*/ ("select",_s);
 //BA.debugLineNum = 77;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtreetable)(this);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtreetable  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 108;BA.debugLine="TreeTable.SetStyle(prop,val)";
_treetable._setstyle /*b4j.example.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 109;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtreetable)(this);
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtreetable  _settemplate(Object _t) throws Exception{
 //BA.debugLineNum = 113;BA.debugLine="Sub SetTemplate(t As Object) As WixTreeTable";
 //BA.debugLineNum = 114;BA.debugLine="TreeTable.SetTemplate(t)";
_treetable._settemplate /*b4j.example.wixelement*/ (_t);
 //BA.debugLineNum = 115;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtreetable)(this);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtreetable  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 27;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixTreeTab";
 //BA.debugLineNum = 28;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 29;BA.debugLine="TreeTable.SetTemplate(os)";
_treetable._settemplate /*b4j.example.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 30;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtreetable)(this);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtreetable  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Sub SetTooltip(tt As String) As WixTreeTable";
 //BA.debugLineNum = 120;BA.debugLine="TreeTable.SetTooltip(tt)";
_treetable._settooltip /*b4j.example.wixelement*/ (_tt);
 //BA.debugLineNum = 121;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtreetable)(this);
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtreetable  _setwidth(Object _h) throws Exception{
 //BA.debugLineNum = 131;BA.debugLine="Sub SetWidth(h As Object) As WixTreeTable";
 //BA.debugLineNum = 132;BA.debugLine="TreeTable.SetWidth(h)";
_treetable._setwidth /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 133;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtreetable)(this);
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
