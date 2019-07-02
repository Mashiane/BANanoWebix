package b4j.Mashy.BANanoWebix;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixgrouplist extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebix", "b4j.Mashy.BANanoWebix.wixgrouplist", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebix.wixgrouplist.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.Mashy.BANanoWebix.wixelement _grouplist = null;
public String _id = "";
public anywheresoftware.b4a.objects.collections.List _items = null;
public b4j.Mashy.BANanoWebix.main _main = null;
public b4j.Mashy.BANanoWebix.wixgrouplist  _additem(String _parentid,String _meid,String _mvalue,String _mhref,String _micon,String _badge,String _target,boolean _mopen) throws Exception{
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
if (true) return (b4j.Mashy.BANanoWebix.wixgrouplist)(this);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return null;
}
public String  _addtocolumn(b4j.Mashy.BANanoWebix.wixcolumn _c) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub AddToColumn(c As WixColumn)";
 //BA.debugLineNum = 47;BA.debugLine="c.AddItem(Item)";
_c._additem /*String*/ (_item());
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.Mashy.BANanoWebix.wixform _frm) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 52;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public GroupList As WixElement";
_grouplist = new b4j.Mashy.BANanoWebix.wixelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Public Items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebix.wixgrouplist  _initialize(anywheresoftware.b4a.BA _ba,String _lid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(lID As String) As WixGroupLi";
 //BA.debugLineNum = 10;BA.debugLine="ID = lID.tolowercase";
_id = _lid.toLowerCase();
 //BA.debugLineNum = 11;BA.debugLine="GroupList.Initialize(ID).SetView(\"grouplist\")";
_grouplist._initialize /*b4j.Mashy.BANanoWebix.wixelement*/ (ba,_id)._setview /*b4j.Mashy.BANanoWebix.wixelement*/ ("grouplist");
 //BA.debugLineNum = 12;BA.debugLine="Items.Initialize";
_items.Initialize();
 //BA.debugLineNum = 13;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixgrouplist)(this);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 94;BA.debugLine="Return GroupList.item";
if (true) return _grouplist._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixgrouplist  _setborderless(boolean _b) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Sub SetBorderLess(b As Boolean) As WixGroupList";
 //BA.debugLineNum = 63;BA.debugLine="GroupList.SetAttr(\"borderless\", b)";
_grouplist._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("borderless",(Object)(_b));
 //BA.debugLineNum = 64;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixgrouplist)(this);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixgrouplist  _setdata(anywheresoftware.b4a.objects.collections.List _d) throws Exception{
 //BA.debugLineNum = 116;BA.debugLine="Sub SetData(d As List) As WixGroupList";
 //BA.debugLineNum = 117;BA.debugLine="GroupList.SetData(d)";
_grouplist._setdata /*b4j.Mashy.BANanoWebix.wixelement*/ (_d);
 //BA.debugLineNum = 118;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixgrouplist)(this);
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixgrouplist  _setheight(String _t) throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Sub SetHeight(t As String) As WixGroupList";
 //BA.debugLineNum = 105;BA.debugLine="GroupList.SetHeight(t)";
_grouplist._setheight /*b4j.Mashy.BANanoWebix.wixelement*/ ((Object)(_t));
 //BA.debugLineNum = 106;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixgrouplist)(this);
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixgrouplist  _setmultiselect(boolean _b) throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Sub SetMultiSelect(b As Boolean) As WixGroupList";
 //BA.debugLineNum = 75;BA.debugLine="GroupList.SetAttr(\"multiselect\", b)";
_grouplist._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("multiselect",(Object)(_b));
 //BA.debugLineNum = 76;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixgrouplist)(this);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixgrouplist  _setpager(String _p) throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Sub SetPager(p As String) As WixGroupList";
 //BA.debugLineNum = 87;BA.debugLine="p = p.tolowercase";
_p = _p.toLowerCase();
 //BA.debugLineNum = 88;BA.debugLine="GroupList.SetAttr(\"pager\", p)";
_grouplist._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("pager",(Object)(_p));
 //BA.debugLineNum = 89;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixgrouplist)(this);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixgrouplist  _setscroll(boolean _b) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub SetScroll(b As Boolean) As WixGroupList";
 //BA.debugLineNum = 81;BA.debugLine="GroupList.SetAttr(\"scroll\", b)";
_grouplist._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("scroll",(Object)(_b));
 //BA.debugLineNum = 82;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixgrouplist)(this);
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixgrouplist  _setselect(boolean _b) throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Sub SetSelect(b As Boolean) As WixGroupList";
 //BA.debugLineNum = 69;BA.debugLine="GroupList.SetAttr(\"select\", b)";
_grouplist._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("select",(Object)(_b));
 //BA.debugLineNum = 70;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixgrouplist)(this);
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixgrouplist  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 35;BA.debugLine="GroupList.SetStyle(prop,val)";
_grouplist._setstyle /*b4j.Mashy.BANanoWebix.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixgrouplist)(this);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixgrouplist  _settemplate(String _t) throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Sub SetTemplate(t As String) As WixGroupList";
 //BA.debugLineNum = 99;BA.debugLine="GroupList.SetTemplate(t)";
_grouplist._settemplate /*b4j.Mashy.BANanoWebix.wixelement*/ ((Object)(_t));
 //BA.debugLineNum = 100;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixgrouplist)(this);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixgrouplist  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Sub SetTooltip(tt As String) As WixGroupList";
 //BA.debugLineNum = 41;BA.debugLine="GroupList.SetTooltip(tt)";
_grouplist._settooltip /*b4j.Mashy.BANanoWebix.wixelement*/ (_tt);
 //BA.debugLineNum = 42;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixgrouplist)(this);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixgrouplist  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Sub SetValue(v As String) As WixGroupList";
 //BA.debugLineNum = 57;BA.debugLine="GroupList.SetValue(v)";
_grouplist._setvalue /*b4j.Mashy.BANanoWebix.wixelement*/ (_v);
 //BA.debugLineNum = 58;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixgrouplist)(this);
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixgrouplist  _setwidth(Object _t) throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Sub SetWidth(t As Object) As WixGroupList";
 //BA.debugLineNum = 111;BA.debugLine="GroupList.SetWidth(t)";
_grouplist._setwidth /*b4j.Mashy.BANanoWebix.wixelement*/ (_t);
 //BA.debugLineNum = 112;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixgrouplist)(this);
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
