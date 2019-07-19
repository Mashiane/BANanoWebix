package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixtree extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixtree", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixtree.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _tree = null;
public anywheresoftware.b4a.objects.collections.Map _scheme = null;
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
public b4j.example.wixtree  _additem(String _parentid,String _meid,String _mvalue,String _mhref,String _micon,String _badge,String _target,boolean _mopen) throws Exception{
anywheresoftware.b4a.objects.collections.Map _mitem = null;
 //BA.debugLineNum = 150;BA.debugLine="Sub AddItem(parentID As String, meID As String, mV";
 //BA.debugLineNum = 151;BA.debugLine="parentID = parentID.tolowercase";
_parentid = _parentid.toLowerCase();
 //BA.debugLineNum = 152;BA.debugLine="meID = meID.tolowercase";
_meid = _meid.toLowerCase();
 //BA.debugLineNum = 153;BA.debugLine="Dim mitem As Map = CreateMap()";
_mitem = new anywheresoftware.b4a.objects.collections.Map();
_mitem = __c.createMap(new Object[] {});
 //BA.debugLineNum = 154;BA.debugLine="mitem.Put(\"id\", meID)";
_mitem.Put((Object)("id"),(Object)(_meid));
 //BA.debugLineNum = 155;BA.debugLine="mitem.Put(\"value\", mValue)";
_mitem.Put((Object)("value"),(Object)(_mvalue));
 //BA.debugLineNum = 156;BA.debugLine="mitem.Put(\"href\", mhref)";
_mitem.Put((Object)("href"),(Object)(_mhref));
 //BA.debugLineNum = 157;BA.debugLine="mitem.Put(\"badge\", badge)";
_mitem.Put((Object)("badge"),(Object)(_badge));
 //BA.debugLineNum = 158;BA.debugLine="mitem.Put(\"target\", target)";
_mitem.Put((Object)("target"),(Object)(_target));
 //BA.debugLineNum = 159;BA.debugLine="mitem.Put(\"icon\", mIcon)";
_mitem.Put((Object)("icon"),(Object)(_micon));
 //BA.debugLineNum = 160;BA.debugLine="mitem.Put(\"open\", mOpen)";
_mitem.Put((Object)("open"),(Object)(_mopen));
 //BA.debugLineNum = 161;BA.debugLine="mitem.Put(\"parentid\", parentID)";
_mitem.Put((Object)("parentid"),(Object)(_parentid));
 //BA.debugLineNum = 162;BA.debugLine="Items.Add(mitem)";
_items.Add((Object)(_mitem.getObject()));
 //BA.debugLineNum = 163;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtree)(this);
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return null;
}
public String  _addtocolumns(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 173;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 174;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 178;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 179;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 168;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 169;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Tree As WixElement";
_tree = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private scheme As Map";
_scheme = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 6;BA.debugLine="Private Items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixtree  _initialize(anywheresoftware.b4a.BA _ba,String _eid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(eID As String) As WixTree";
 //BA.debugLineNum = 11;BA.debugLine="ID = eID.tolowercase";
_id = _eid.toLowerCase();
 //BA.debugLineNum = 12;BA.debugLine="Tree.Initialize(ID).SetView(\"tree\")";
_tree._initialize /*b4j.example.wixelement*/ (ba,_id)._setview /*b4j.example.wixelement*/ ("tree");
 //BA.debugLineNum = 13;BA.debugLine="scheme = CreateMap()";
_scheme = __c.createMap(new Object[] {});
 //BA.debugLineNum = 14;BA.debugLine="Items.Initialize";
_items.Initialize();
 //BA.debugLineNum = 15;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtree)(this);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
anywheresoftware.b4a.objects.collections.List _data = null;
 //BA.debugLineNum = 73;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 74;BA.debugLine="If Items.Size > 0 Then";
if (_items.getSize()>0) { 
 //BA.debugLineNum = 75;BA.debugLine="Dim data As List = modWebix.Unflatten(Items, \"da";
_data = new anywheresoftware.b4a.objects.collections.List();
_data = _modwebix._unflatten /*anywheresoftware.b4a.objects.collections.List*/ (_items,"data");
 //BA.debugLineNum = 76;BA.debugLine="SetData(data)";
_setdata(_data);
 };
 //BA.debugLineNum = 78;BA.debugLine="Tree.SetAttr(\"scheme\", scheme)";
_tree._setattr /*b4j.example.wixelement*/ ("scheme",(Object)(_scheme.getObject()));
 //BA.debugLineNum = 79;BA.debugLine="Return Tree.item";
if (true) return _tree._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtree  _setborderless(boolean _b) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub SetBorderLess(b As Boolean) As WixTree";
 //BA.debugLineNum = 90;BA.debugLine="Tree.SetBorderLess(b)";
_tree._setborderless /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 91;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtree)(this);
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtree  _setdata(anywheresoftware.b4a.objects.collections.List _data) throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Sub SetData(data As List) As WixTree";
 //BA.debugLineNum = 115;BA.debugLine="Tree.SetData(data)";
_tree._setdata /*b4j.example.wixelement*/ (_data);
 //BA.debugLineNum = 116;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtree)(this);
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtree  _setgroupby(String _g) throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Sub SetGroupBy(g As String) As WixTree";
 //BA.debugLineNum = 84;BA.debugLine="scheme.Put(\"$group\", g)";
_scheme.Put((Object)("$group"),(Object)(_g));
 //BA.debugLineNum = 85;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtree)(this);
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtree  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 138;BA.debugLine="Sub SetHeight(h As Object) As WixTree";
 //BA.debugLineNum = 139;BA.debugLine="Tree.SetHeight(h)";
_tree._setheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 140;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtree)(this);
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtree  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 64;BA.debugLine="Sub SetMap(m As Map) As WixTree";
 //BA.debugLineNum = 65;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 66;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 67;BA.debugLine="Tree.SetAttr(strKey, strVal)";
_tree._setattr /*b4j.example.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 69;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtree)(this);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtree  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub SetMinHeight(h As Int) As WixTree";
 //BA.debugLineNum = 59;BA.debugLine="Tree.SetMinHeight(h)";
_tree._setminheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 60;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtree)(this);
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtree  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub SetMinWidth(w As Int) As WixTree";
 //BA.debugLineNum = 53;BA.debugLine="Tree.SetMinWidth(w)";
_tree._setminwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtree)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtree  _setmultiselect(boolean _b) throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Sub SetMultiSelect(b As Boolean) As WixTree   'ign";
 //BA.debugLineNum = 102;BA.debugLine="Tree.SetAttr(\"select\", \"multiselect\")";
_tree._setattr /*b4j.example.wixelement*/ ("select",(Object)("multiselect"));
 //BA.debugLineNum = 103;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtree)(this);
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtree  _setname(String _n) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub SetName(n As String) As WixTree";
 //BA.debugLineNum = 34;BA.debugLine="Tree.SetName(n)";
_tree._setname /*b4j.example.wixelement*/ (_n);
 //BA.debugLineNum = 35;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtree)(this);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtree  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Sub SetResponsive(b As Object) As WixTree";
 //BA.debugLineNum = 40;BA.debugLine="Tree.SetResponsive(b)";
_tree._setresponsive /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 41;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtree)(this);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtree  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixTree";
 //BA.debugLineNum = 46;BA.debugLine="Tree.SetResponsiveCell(b)";
_tree._setresponsivecell /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 47;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtree)(this);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtree  _setscroll(Object _b) throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Sub SetScroll(b As Object) As WixTree";
 //BA.debugLineNum = 21;BA.debugLine="Tree.SetAttr(\"scroll\", b)";
_tree._setattr /*b4j.example.wixelement*/ ("scroll",_b);
 //BA.debugLineNum = 22;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtree)(this);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtree  _setselect(boolean _b) throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Sub SetSelect(b As Boolean) As WixTree";
 //BA.debugLineNum = 96;BA.debugLine="Tree.SetSelect(b)";
_tree._setselect /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 97;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtree)(this);
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtree  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 120;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 121;BA.debugLine="Tree.SetStyle(prop,val)";
_tree._setstyle /*b4j.example.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 122;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtree)(this);
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtree  _settemplate(Object _t) throws Exception{
 //BA.debugLineNum = 126;BA.debugLine="Sub SetTemplate(t As Object) As WixTree";
 //BA.debugLineNum = 127;BA.debugLine="Tree.SetTemplate(t)";
_tree._settemplate /*b4j.example.wixelement*/ (_t);
 //BA.debugLineNum = 128;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtree)(this);
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtree  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 26;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixTree";
 //BA.debugLineNum = 27;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 28;BA.debugLine="Tree.SetTemplate(os)";
_tree._settemplate /*b4j.example.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 29;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtree)(this);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtree  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 132;BA.debugLine="Sub SetTooltip(tt As String) As WixTree";
 //BA.debugLineNum = 133;BA.debugLine="Tree.SetTooltip(tt)";
_tree._settooltip /*b4j.example.wixelement*/ (_tt);
 //BA.debugLineNum = 134;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtree)(this);
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtree  _settypelinetree(boolean _b) throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Sub SetTypeLineTree(b As Boolean) As WixTree   'ig";
 //BA.debugLineNum = 109;BA.debugLine="Tree.SetType(\"lineTree\")";
_tree._settype /*b4j.example.wixelement*/ ("lineTree");
 //BA.debugLineNum = 110;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtree)(this);
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtree  _setwidth(Object _h) throws Exception{
 //BA.debugLineNum = 144;BA.debugLine="Sub SetWidth(h As Object) As WixTree";
 //BA.debugLineNum = 145;BA.debugLine="Tree.SetWidth(h)";
_tree._setwidth /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 146;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtree)(this);
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
