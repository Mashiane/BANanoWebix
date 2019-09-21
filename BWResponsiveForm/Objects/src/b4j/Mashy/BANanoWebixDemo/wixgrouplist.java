package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixgrouplist extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixgrouplist", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixgrouplist.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _grouplist = null;
public String _id = "";
public anywheresoftware.b4a.objects.collections.List _items = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public b4j.Mashy.BANanoWebixDemo.wixgrouplist  _additem(String _parentid,String _meid,String _mvalue,String _mhref,String _micon,String _badge,String _target,boolean _mopen) throws Exception{
anywheresoftware.b4a.objects.collections.Map _mitem = null;
 //BA.debugLineNum = 67;BA.debugLine="Sub AddItem(parentID As String, meID As String, mV";
 //BA.debugLineNum = 68;BA.debugLine="parentID = parentID.tolowercase";
_parentid = _parentid.toLowerCase();
 //BA.debugLineNum = 69;BA.debugLine="meID = meID.tolowercase";
_meid = _meid.toLowerCase();
 //BA.debugLineNum = 70;BA.debugLine="Dim mitem As Map = CreateMap()";
_mitem = new anywheresoftware.b4a.objects.collections.Map();
_mitem = __c.createMap(new Object[] {});
 //BA.debugLineNum = 71;BA.debugLine="mitem.Put(\"id\", meID)";
_mitem.Put((Object)("id"),(Object)(_meid));
 //BA.debugLineNum = 72;BA.debugLine="mitem.Put(\"value\", mValue)";
_mitem.Put((Object)("value"),(Object)(_mvalue));
 //BA.debugLineNum = 73;BA.debugLine="mitem.Put(\"href\", mhref)";
_mitem.Put((Object)("href"),(Object)(_mhref));
 //BA.debugLineNum = 74;BA.debugLine="mitem.Put(\"badge\", badge)";
_mitem.Put((Object)("badge"),(Object)(_badge));
 //BA.debugLineNum = 75;BA.debugLine="mitem.Put(\"target\", target)";
_mitem.Put((Object)("target"),(Object)(_target));
 //BA.debugLineNum = 76;BA.debugLine="mitem.Put(\"icon\", mIcon)";
_mitem.Put((Object)("icon"),(Object)(_micon));
 //BA.debugLineNum = 77;BA.debugLine="mitem.Put(\"open\", mOpen)";
_mitem.Put((Object)("open"),(Object)(_mopen));
 //BA.debugLineNum = 78;BA.debugLine="mitem.Put(\"parentid\", parentID)";
_mitem.Put((Object)("parentid"),(Object)(_parentid));
 //BA.debugLineNum = 79;BA.debugLine="Items.Add(mitem)";
_items.Add((Object)(_mitem.getObject()));
 //BA.debugLineNum = 80;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgrouplist)(this);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public String  _addtocolumn(b4j.Mashy.BANanoWebixDemo.wixcolumn _c) throws Exception{
 //BA.debugLineNum = 139;BA.debugLine="Sub AddToColumn(c As WixColumn)";
 //BA.debugLineNum = 140;BA.debugLine="c.AddItem(Item)";
_c._additem /*String*/ (_item());
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return "";
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
public String  _addtoform(b4j.Mashy.BANanoWebixDemo.wixform _frm) throws Exception{
 //BA.debugLineNum = 144;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 145;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 3;BA.debugLine="Public GroupList As WixElement";
_grouplist = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private Items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 6;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixgrouplist  _initialize(anywheresoftware.b4a.BA _ba,String _lid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(lID As String) As WixGroupLi";
 //BA.debugLineNum = 12;BA.debugLine="ID = lID.tolowercase";
_id = _lid.toLowerCase();
 //BA.debugLineNum = 13;BA.debugLine="GroupList.Initialize(ID).SetView(\"grouplist\")";
_grouplist._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_id)._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("grouplist");
 //BA.debugLineNum = 14;BA.debugLine="Items.Initialize";
_items.Initialize();
 //BA.debugLineNum = 15;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 16;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgrouplist)(this);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
anywheresoftware.b4a.objects.collections.List _data = null;
 //BA.debugLineNum = 186;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 187;BA.debugLine="If Items.Size > 0 Then";
if (_items.getSize()>0) { 
 //BA.debugLineNum = 188;BA.debugLine="Dim data As List = modWebix.Unflatten(Items, \"da";
_data = new anywheresoftware.b4a.objects.collections.List();
_data = _modwebix._unflatten /*anywheresoftware.b4a.objects.collections.List*/ (_items,"data");
 //BA.debugLineNum = 189;BA.debugLine="SetData(data)";
_setdata(_data);
 };
 //BA.debugLineNum = 191;BA.debugLine="Return GroupList.item";
if (true) return _grouplist._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 192;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 49;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixgrouplist  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 31;BA.debugLine="Sub SetAttributes(m As Map) As WixGroupList";
 //BA.debugLineNum = 32;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 33;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 34;BA.debugLine="GroupList.SetAttr(k,v)";
_grouplist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgrouplist)(this);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgrouplist  _setborderless(boolean _b) throws Exception{
 //BA.debugLineNum = 155;BA.debugLine="Sub SetBorderLess(b As Boolean) As WixGroupList";
 //BA.debugLineNum = 156;BA.debugLine="GroupList.SetAttr(\"borderless\", b)";
_grouplist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("borderless",(Object)(_b));
 //BA.debugLineNum = 157;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgrouplist)(this);
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgrouplist  _setdata(anywheresoftware.b4a.objects.collections.List _d) throws Exception{
 //BA.debugLineNum = 213;BA.debugLine="Sub SetData(d As List) As WixGroupList";
 //BA.debugLineNum = 214;BA.debugLine="GroupList.SetData(d)";
_grouplist._setdata /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_d);
 //BA.debugLineNum = 215;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgrouplist)(this);
 //BA.debugLineNum = 216;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgrouplist  _setheight(String _t) throws Exception{
 //BA.debugLineNum = 201;BA.debugLine="Sub SetHeight(t As String) As WixGroupList";
 //BA.debugLineNum = 202;BA.debugLine="GroupList.SetHeight(t)";
_grouplist._setheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_t));
 //BA.debugLineNum = 203;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgrouplist)(this);
 //BA.debugLineNum = 204;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgrouplist  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 123;BA.debugLine="Sub SetMap(m As Map) As WixGroupList";
 //BA.debugLineNum = 124;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 125;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 126;BA.debugLine="GroupList.SetAttr(strKey,	strVal)";
_grouplist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 128;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgrouplist)(this);
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgrouplist  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Sub SetMargin(margin As Object) As WixGroupList";
 //BA.debugLineNum = 27;BA.debugLine="GroupList.SetMargin(margin)";
_grouplist._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 28;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgrouplist)(this);
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgrouplist  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Sub SetMinHeight(h As Int) As WixGroupList";
 //BA.debugLineNum = 118;BA.debugLine="GroupList.SetMinHeight(h)";
_grouplist._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 119;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgrouplist)(this);
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgrouplist  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 111;BA.debugLine="Sub SetMinWidth(w As Int) As WixGroupList";
 //BA.debugLineNum = 112;BA.debugLine="GroupList.SetMinWidth(w)";
_grouplist._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 113;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgrouplist)(this);
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgrouplist  _setmultiselect(boolean _b) throws Exception{
 //BA.debugLineNum = 167;BA.debugLine="Sub SetMultiSelect(b As Boolean) As WixGroupList";
 //BA.debugLineNum = 168;BA.debugLine="GroupList.SetAttr(\"multiselect\", b)";
_grouplist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("multiselect",(Object)(_b));
 //BA.debugLineNum = 169;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgrouplist)(this);
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgrouplist  _setname(String _n) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Sub SetName(n As String) As WixGroupList";
 //BA.debugLineNum = 93;BA.debugLine="GroupList.SetName(n)";
_grouplist._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 94;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgrouplist)(this);
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgrouplist  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Sub SetPadding(padding As Object) As WixGroupList";
 //BA.debugLineNum = 21;BA.debugLine="GroupList.SetPadding(padding)";
_grouplist._setpadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 22;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgrouplist)(this);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgrouplist  _setpager(String _p) throws Exception{
 //BA.debugLineNum = 179;BA.debugLine="Sub SetPager(p As String) As WixGroupList";
 //BA.debugLineNum = 180;BA.debugLine="p = p.tolowercase";
_p = _p.toLowerCase();
 //BA.debugLineNum = 181;BA.debugLine="GroupList.SetAttr(\"pager\", p)";
_grouplist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("pager",(Object)(_p));
 //BA.debugLineNum = 182;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgrouplist)(this);
 //BA.debugLineNum = 183;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgrouplist  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub SetParent(p As WixElement) As WixGroupList";
 //BA.debugLineNum = 54;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgrouplist)(this);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgrouplist  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Sub SetResponsive(b As Object) As WixGroupList";
 //BA.debugLineNum = 99;BA.debugLine="GroupList.SetResponsive(b)";
_grouplist._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 100;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgrouplist)(this);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgrouplist  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixGroupList";
 //BA.debugLineNum = 105;BA.debugLine="GroupList.SetResponsiveCell(b)";
_grouplist._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 106;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgrouplist)(this);
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgrouplist  _setscroll(Object _b) throws Exception{
 //BA.debugLineNum = 173;BA.debugLine="Sub SetScroll(b As Object) As WixGroupList";
 //BA.debugLineNum = 174;BA.debugLine="GroupList.SetAttr(\"scroll\", b)";
_grouplist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("scroll",_b);
 //BA.debugLineNum = 175;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgrouplist)(this);
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgrouplist  _setselect(boolean _b) throws Exception{
 //BA.debugLineNum = 161;BA.debugLine="Sub SetSelect(b As Boolean) As WixGroupList";
 //BA.debugLineNum = 162;BA.debugLine="GroupList.SetAttr(\"select\", b)";
_grouplist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("select",(Object)(_b));
 //BA.debugLineNum = 163;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgrouplist)(this);
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgrouplist  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 61;BA.debugLine="GroupList.SetStyle(prop,sval)";
_grouplist._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgrouplist)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgrouplist  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 39;BA.debugLine="Sub SetStyles(m As Map) As WixGroupList";
 //BA.debugLineNum = 40;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 41;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 42;BA.debugLine="GroupList.SetStyle(k,v)";
_grouplist._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 44;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgrouplist)(this);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgrouplist  _settemplate(String _t) throws Exception{
 //BA.debugLineNum = 195;BA.debugLine="Sub SetTemplate(t As String) As WixGroupList";
 //BA.debugLineNum = 196;BA.debugLine="GroupList.SetTemplate(t)";
_grouplist._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_t));
 //BA.debugLineNum = 197;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgrouplist)(this);
 //BA.debugLineNum = 198;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgrouplist  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 84;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixGroupLi";
 //BA.debugLineNum = 85;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 86;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 87;BA.debugLine="GroupList.SetTemplate(os)";
_grouplist._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 88;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgrouplist)(this);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgrouplist  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Sub SetTooltip(tt As String) As WixGroupList";
 //BA.debugLineNum = 134;BA.debugLine="GroupList.SetTooltip(tt)";
_grouplist._settooltip /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_tt);
 //BA.debugLineNum = 135;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgrouplist)(this);
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgrouplist  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 149;BA.debugLine="Sub SetValue(v As String) As WixGroupList";
 //BA.debugLineNum = 150;BA.debugLine="GroupList.SetValue(v)";
_grouplist._setvalue /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_v);
 //BA.debugLineNum = 151;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgrouplist)(this);
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgrouplist  _setwidth(Object _t) throws Exception{
 //BA.debugLineNum = 207;BA.debugLine="Sub SetWidth(t As Object) As WixGroupList";
 //BA.debugLineNum = 208;BA.debugLine="GroupList.SetWidth(t)";
_grouplist._setwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_t);
 //BA.debugLineNum = 209;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixgrouplist)(this);
 //BA.debugLineNum = 210;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
