package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixgrouplist extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixgrouplist", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixgrouplist.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.wixelement _grouplist = null;
public String _id = "";
public anywheresoftware.b4a.objects.collections.List _items = null;
public b4j.example.main _main = null;
public b4j.example.pgformdesigner _pgformdesigner = null;
public b4j.example.modcenter _modcenter = null;
public b4j.example.dbutton _dbutton = null;
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
public b4j.example.wixgrouplist  _additem(String _parentid,String _meid,String _mvalue,String _mhref,String _micon,String _badge,String _target,boolean _mopen) throws Exception{
anywheresoftware.b4a.objects.collections.Map _mitem = null;
 //BA.debugLineNum = 17;BA.debugLine="Sub AddItem(parentID As String, meID As String, mV";
 //BA.debugLineNum = 18;BA.debugLine="parentID = parentID.tolowercase";
_parentid = _parentid.toLowerCase();
 //BA.debugLineNum = 19;BA.debugLine="meID = meID.tolowercase";
_meid = _meid.toLowerCase();
 //BA.debugLineNum = 20;BA.debugLine="Dim mitem As Map = CreateMap()";
_mitem = new anywheresoftware.b4a.objects.collections.Map();
_mitem = __c.createMap(new Object[] {});
 //BA.debugLineNum = 21;BA.debugLine="mitem.Put(\"id\", meID)";
_mitem.Put((Object)("id"),(Object)(_meid));
 //BA.debugLineNum = 22;BA.debugLine="mitem.Put(\"value\", mValue)";
_mitem.Put((Object)("value"),(Object)(_mvalue));
 //BA.debugLineNum = 23;BA.debugLine="mitem.Put(\"href\", mhref)";
_mitem.Put((Object)("href"),(Object)(_mhref));
 //BA.debugLineNum = 24;BA.debugLine="mitem.Put(\"badge\", badge)";
_mitem.Put((Object)("badge"),(Object)(_badge));
 //BA.debugLineNum = 25;BA.debugLine="mitem.Put(\"target\", target)";
_mitem.Put((Object)("target"),(Object)(_target));
 //BA.debugLineNum = 26;BA.debugLine="mitem.Put(\"icon\", mIcon)";
_mitem.Put((Object)("icon"),(Object)(_micon));
 //BA.debugLineNum = 27;BA.debugLine="mitem.Put(\"open\", mOpen)";
_mitem.Put((Object)("open"),(Object)(_mopen));
 //BA.debugLineNum = 28;BA.debugLine="mitem.Put(\"parentid\", parentID)";
_mitem.Put((Object)("parentid"),(Object)(_parentid));
 //BA.debugLineNum = 29;BA.debugLine="Items.Add(mitem)";
_items.Add((Object)(_mitem.getObject()));
 //BA.debugLineNum = 30;BA.debugLine="Return Me";
if (true) return (b4j.example.wixgrouplist)(this);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return null;
}
public String  _addtocolumn(b4j.example.wixcolumn _c) throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Sub AddToColumn(c As WixColumn)";
 //BA.debugLineNum = 95;BA.debugLine="c.AddItem(Item)";
_c._additem /*String*/ (_item());
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return "";
}
public String  _addtocolumns(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 180;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 181;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 185;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 186;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 187;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.example.wixform _frm) throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 100;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 175;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 176;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 177;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public GroupList As WixElement";
_grouplist = new b4j.example.wixelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private Items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixgrouplist  _initialize(anywheresoftware.b4a.BA _ba,String _lid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(lID As String) As WixGroupLi";
 //BA.debugLineNum = 10;BA.debugLine="ID = lID.tolowercase";
_id = _lid.toLowerCase();
 //BA.debugLineNum = 11;BA.debugLine="GroupList.Initialize(ID).SetView(\"grouplist\")";
_grouplist._initialize /*b4j.example.wixelement*/ (ba,_id)._setview /*b4j.example.wixelement*/ ("grouplist");
 //BA.debugLineNum = 12;BA.debugLine="Items.Initialize";
_items.Initialize();
 //BA.debugLineNum = 13;BA.debugLine="Return Me";
if (true) return (b4j.example.wixgrouplist)(this);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
anywheresoftware.b4a.objects.collections.List _data = null;
 //BA.debugLineNum = 141;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 142;BA.debugLine="If Items.Size > 0 Then";
if (_items.getSize()>0) { 
 //BA.debugLineNum = 143;BA.debugLine="Dim data As List = modWebix.Unflatten(Items, \"da";
_data = new anywheresoftware.b4a.objects.collections.List();
_data = _modwebix._unflatten /*anywheresoftware.b4a.objects.collections.List*/ (_items,"data");
 //BA.debugLineNum = 144;BA.debugLine="SetData(data)";
_setdata(_data);
 };
 //BA.debugLineNum = 146;BA.debugLine="Return GroupList.item";
if (true) return _grouplist._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixgrouplist  _setborderless(boolean _b) throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Sub SetBorderLess(b As Boolean) As WixGroupList";
 //BA.debugLineNum = 111;BA.debugLine="GroupList.SetAttr(\"borderless\", b)";
_grouplist._setattr /*b4j.example.wixelement*/ ("borderless",(Object)(_b));
 //BA.debugLineNum = 112;BA.debugLine="Return Me";
if (true) return (b4j.example.wixgrouplist)(this);
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixgrouplist  _setdata(anywheresoftware.b4a.objects.collections.List _d) throws Exception{
 //BA.debugLineNum = 168;BA.debugLine="Sub SetData(d As List) As WixGroupList";
 //BA.debugLineNum = 169;BA.debugLine="GroupList.SetData(d)";
_grouplist._setdata /*b4j.example.wixelement*/ (_d);
 //BA.debugLineNum = 170;BA.debugLine="Return Me";
if (true) return (b4j.example.wixgrouplist)(this);
 //BA.debugLineNum = 171;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixgrouplist  _setheight(String _t) throws Exception{
 //BA.debugLineNum = 156;BA.debugLine="Sub SetHeight(t As String) As WixGroupList";
 //BA.debugLineNum = 157;BA.debugLine="GroupList.SetHeight(t)";
_grouplist._setheight /*b4j.example.wixelement*/ ((Object)(_t));
 //BA.debugLineNum = 158;BA.debugLine="Return Me";
if (true) return (b4j.example.wixgrouplist)(this);
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixgrouplist  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 72;BA.debugLine="Sub SetMap(m As Map) As WixGroupList";
 //BA.debugLineNum = 73;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 74;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 75;BA.debugLine="GroupList.SetAttr(strKey,	strVal)";
_grouplist._setattr /*b4j.example.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 77;BA.debugLine="Return Me";
if (true) return (b4j.example.wixgrouplist)(this);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixgrouplist  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub SetMinHeight(h As Int) As WixGroupList";
 //BA.debugLineNum = 67;BA.debugLine="GroupList.SetMinHeight(h)";
_grouplist._setminheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 68;BA.debugLine="Return Me";
if (true) return (b4j.example.wixgrouplist)(this);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixgrouplist  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub SetMinWidth(w As Int) As WixGroupList";
 //BA.debugLineNum = 61;BA.debugLine="GroupList.SetMinWidth(w)";
_grouplist._setminwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (b4j.example.wixgrouplist)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixgrouplist  _setmultiselect(boolean _b) throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Sub SetMultiSelect(b As Boolean) As WixGroupList";
 //BA.debugLineNum = 123;BA.debugLine="GroupList.SetAttr(\"multiselect\", b)";
_grouplist._setattr /*b4j.example.wixelement*/ ("multiselect",(Object)(_b));
 //BA.debugLineNum = 124;BA.debugLine="Return Me";
if (true) return (b4j.example.wixgrouplist)(this);
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixgrouplist  _setname(String _n) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Sub SetName(n As String) As WixGroupList";
 //BA.debugLineNum = 42;BA.debugLine="GroupList.SetName(n)";
_grouplist._setname /*b4j.example.wixelement*/ (_n);
 //BA.debugLineNum = 43;BA.debugLine="Return Me";
if (true) return (b4j.example.wixgrouplist)(this);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixgrouplist  _setpager(String _p) throws Exception{
 //BA.debugLineNum = 134;BA.debugLine="Sub SetPager(p As String) As WixGroupList";
 //BA.debugLineNum = 135;BA.debugLine="p = p.tolowercase";
_p = _p.toLowerCase();
 //BA.debugLineNum = 136;BA.debugLine="GroupList.SetAttr(\"pager\", p)";
_grouplist._setattr /*b4j.example.wixelement*/ ("pager",(Object)(_p));
 //BA.debugLineNum = 137;BA.debugLine="Return Me";
if (true) return (b4j.example.wixgrouplist)(this);
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixgrouplist  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub SetResponsive(b As Object) As WixGroupList";
 //BA.debugLineNum = 48;BA.debugLine="GroupList.SetResponsive(b)";
_grouplist._setresponsive /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (b4j.example.wixgrouplist)(this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixgrouplist  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixGroupList";
 //BA.debugLineNum = 54;BA.debugLine="GroupList.SetResponsiveCell(b)";
_grouplist._setresponsivecell /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return (b4j.example.wixgrouplist)(this);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixgrouplist  _setscroll(Object _b) throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Sub SetScroll(b As Object) As WixGroupList";
 //BA.debugLineNum = 129;BA.debugLine="GroupList.SetAttr(\"scroll\", b)";
_grouplist._setattr /*b4j.example.wixelement*/ ("scroll",_b);
 //BA.debugLineNum = 130;BA.debugLine="Return Me";
if (true) return (b4j.example.wixgrouplist)(this);
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixgrouplist  _setselect(boolean _b) throws Exception{
 //BA.debugLineNum = 116;BA.debugLine="Sub SetSelect(b As Boolean) As WixGroupList";
 //BA.debugLineNum = 117;BA.debugLine="GroupList.SetAttr(\"select\", b)";
_grouplist._setattr /*b4j.example.wixelement*/ ("select",(Object)(_b));
 //BA.debugLineNum = 118;BA.debugLine="Return Me";
if (true) return (b4j.example.wixgrouplist)(this);
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixgrouplist  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 83;BA.debugLine="GroupList.SetStyle(prop,val)";
_grouplist._setstyle /*b4j.example.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 84;BA.debugLine="Return Me";
if (true) return (b4j.example.wixgrouplist)(this);
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixgrouplist  _settemplate(String _t) throws Exception{
 //BA.debugLineNum = 150;BA.debugLine="Sub SetTemplate(t As String) As WixGroupList";
 //BA.debugLineNum = 151;BA.debugLine="GroupList.SetTemplate(t)";
_grouplist._settemplate /*b4j.example.wixelement*/ ((Object)(_t));
 //BA.debugLineNum = 152;BA.debugLine="Return Me";
if (true) return (b4j.example.wixgrouplist)(this);
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixgrouplist  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 34;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixGroupLi";
 //BA.debugLineNum = 35;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 36;BA.debugLine="GroupList.SetTemplate(os)";
_grouplist._settemplate /*b4j.example.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 37;BA.debugLine="Return Me";
if (true) return (b4j.example.wixgrouplist)(this);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixgrouplist  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Sub SetTooltip(tt As String) As WixGroupList";
 //BA.debugLineNum = 89;BA.debugLine="GroupList.SetTooltip(tt)";
_grouplist._settooltip /*b4j.example.wixelement*/ (_tt);
 //BA.debugLineNum = 90;BA.debugLine="Return Me";
if (true) return (b4j.example.wixgrouplist)(this);
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixgrouplist  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Sub SetValue(v As String) As WixGroupList";
 //BA.debugLineNum = 105;BA.debugLine="GroupList.SetValue(v)";
_grouplist._setvalue /*b4j.example.wixelement*/ (_v);
 //BA.debugLineNum = 106;BA.debugLine="Return Me";
if (true) return (b4j.example.wixgrouplist)(this);
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixgrouplist  _setwidth(Object _t) throws Exception{
 //BA.debugLineNum = 162;BA.debugLine="Sub SetWidth(t As Object) As WixGroupList";
 //BA.debugLineNum = 163;BA.debugLine="GroupList.SetWidth(t)";
_grouplist._setwidth /*b4j.example.wixelement*/ (_t);
 //BA.debugLineNum = 164;BA.debugLine="Return Me";
if (true) return (b4j.example.wixgrouplist)(this);
 //BA.debugLineNum = 165;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
