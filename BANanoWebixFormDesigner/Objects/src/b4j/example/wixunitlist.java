package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixunitlist extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixunitlist", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixunitlist.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _unitlist = null;
public anywheresoftware.b4a.objects.collections.Map _typeof = null;
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
public String  _addtocolumns(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 131;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 132;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 136;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 137;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 126;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 127;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public UnitList As WixElement";
_unitlist = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private typeOf As Map";
_typeof = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixunitlist  _initialize(anywheresoftware.b4a.BA _ba,String _eid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(eID As String) As WixUnitLis";
 //BA.debugLineNum = 10;BA.debugLine="ID = eID.tolowercase";
_id = _eid.toLowerCase();
 //BA.debugLineNum = 11;BA.debugLine="UnitList.Initialize(ID).SetView(\"unitlist\")";
_unitlist._initialize /*b4j.example.wixelement*/ (ba,_id)._setview /*b4j.example.wixelement*/ ("unitlist");
 //BA.debugLineNum = 12;BA.debugLine="typeOf = CreateMap()";
_typeof = __c.createMap(new Object[] {});
 //BA.debugLineNum = 13;BA.debugLine="Return Me";
if (true) return (b4j.example.wixunitlist)(this);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 77;BA.debugLine="UnitList.SetAttr(\"type\", typeOf)";
_unitlist._setattr /*b4j.example.wixelement*/ ("type",(Object)(_typeof.getObject()));
 //BA.debugLineNum = 78;BA.debugLine="Return UnitList.item";
if (true) return _unitlist._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixunitlist  _setborderless(boolean _t) throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Sub SetBorderLess(t As Boolean) As WixUnitList";
 //BA.debugLineNum = 95;BA.debugLine="UnitList.SetAttr(\"borderless\", t)";
_unitlist._setattr /*b4j.example.wixelement*/ ("borderless",(Object)(_t));
 //BA.debugLineNum = 96;BA.debugLine="Return Me";
if (true) return (b4j.example.wixunitlist)(this);
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixunitlist  _setdata(anywheresoftware.b4a.objects.collections.List _data) throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Sub SetData(data As List) As WixUnitList";
 //BA.debugLineNum = 83;BA.debugLine="UnitList.SetData(data)";
_unitlist._setdata /*b4j.example.wixelement*/ (_data);
 //BA.debugLineNum = 84;BA.debugLine="Return Me";
if (true) return (b4j.example.wixunitlist)(this);
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixunitlist  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 113;BA.debugLine="Sub SetHeight(h As Object) As WixUnitList";
 //BA.debugLineNum = 114;BA.debugLine="UnitList.SetHeight(h)";
_unitlist._setheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 115;BA.debugLine="Return Me";
if (true) return (b4j.example.wixunitlist)(this);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixunitlist  _setitemheight(Object _h) throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub SetItemHeight(h As Object) As WixUnitList";
 //BA.debugLineNum = 18;BA.debugLine="typeOf.Put(\"height\", h)";
_typeof.Put((Object)("height"),_h);
 //BA.debugLineNum = 19;BA.debugLine="Return Me";
if (true) return (b4j.example.wixunitlist)(this);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixunitlist  _setitemwidth(Object _w) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub SetItemWidth(w As Object) As WixUnitList";
 //BA.debugLineNum = 71;BA.debugLine="typeOf.Put(\"width\", w)";
_typeof.Put((Object)("width"),_w);
 //BA.debugLineNum = 72;BA.debugLine="Return Me";
if (true) return (b4j.example.wixunitlist)(this);
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixunitlist  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 61;BA.debugLine="Sub SetMap(m As Map) As WixUnitList";
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
 //BA.debugLineNum = 64;BA.debugLine="UnitList.SetAttr(strKey,	strVal)";
_unitlist._setattr /*b4j.example.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 66;BA.debugLine="Return Me";
if (true) return (b4j.example.wixunitlist)(this);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixunitlist  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Sub SetMinHeight(h As Int) As WixUnitList";
 //BA.debugLineNum = 56;BA.debugLine="UnitList.SetMinHeight(h)";
_unitlist._setminheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 57;BA.debugLine="Return Me";
if (true) return (b4j.example.wixunitlist)(this);
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixunitlist  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Sub SetMinWidth(w As Int) As WixUnitList";
 //BA.debugLineNum = 50;BA.debugLine="UnitList.SetMinWidth(w)";
_unitlist._setminwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 51;BA.debugLine="Return Me";
if (true) return (b4j.example.wixunitlist)(this);
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixunitlist  _setname(String _n) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Sub SetName(n As String) As WixUnitList";
 //BA.debugLineNum = 31;BA.debugLine="UnitList.SetName(n)";
_unitlist._setname /*b4j.example.wixelement*/ (_n);
 //BA.debugLineNum = 32;BA.debugLine="Return Me";
if (true) return (b4j.example.wixunitlist)(this);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixunitlist  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Sub SetResponsive(b As Object) As WixUnitList";
 //BA.debugLineNum = 37;BA.debugLine="UnitList.SetResponsive(b)";
_unitlist._setresponsive /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 38;BA.debugLine="Return Me";
if (true) return (b4j.example.wixunitlist)(this);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixunitlist  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixUnitList";
 //BA.debugLineNum = 43;BA.debugLine="UnitList.SetResponsiveCell(b)";
_unitlist._setresponsivecell /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 44;BA.debugLine="Return Me";
if (true) return (b4j.example.wixunitlist)(this);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixunitlist  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 89;BA.debugLine="UnitList.SetStyle(prop,val)";
_unitlist._setstyle /*b4j.example.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 90;BA.debugLine="Return Me";
if (true) return (b4j.example.wixunitlist)(this);
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixunitlist  _settemplate(Object _t) throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Sub SetTemplate(t As Object) As WixUnitList";
 //BA.debugLineNum = 102;BA.debugLine="UnitList.SetTemplate(t)";
_unitlist._settemplate /*b4j.example.wixelement*/ (_t);
 //BA.debugLineNum = 103;BA.debugLine="Return Me";
if (true) return (b4j.example.wixunitlist)(this);
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixunitlist  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 23;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixUnitLis";
 //BA.debugLineNum = 24;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 25;BA.debugLine="UnitList.SetTemplate(os)";
_unitlist._settemplate /*b4j.example.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 26;BA.debugLine="Return Me";
if (true) return (b4j.example.wixunitlist)(this);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixunitlist  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Sub SetTooltip(tt As String) As WixUnitList";
 //BA.debugLineNum = 108;BA.debugLine="UnitList.SetTooltip(tt)";
_unitlist._settooltip /*b4j.example.wixelement*/ (_tt);
 //BA.debugLineNum = 109;BA.debugLine="Return Me";
if (true) return (b4j.example.wixunitlist)(this);
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixunitlist  _setwidth(Object _h) throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Sub SetWidth(h As Object) As WixUnitList";
 //BA.debugLineNum = 120;BA.debugLine="UnitList.SetWidth(h)";
_unitlist._setwidth /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 121;BA.debugLine="Return Me";
if (true) return (b4j.example.wixunitlist)(this);
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
