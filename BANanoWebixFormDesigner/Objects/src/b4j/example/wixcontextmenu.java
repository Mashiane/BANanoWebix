package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixcontextmenu extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixcontextmenu", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixcontextmenu.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _contextmenu = null;
public anywheresoftware.b4a.objects.collections.List _items = null;
public int _sepcount = 0;
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
public b4j.example.wixcontextmenu  _additem(String _parentid,String _meid,String _mvalue,String _mhref,String _micon,String _badge,String _target) throws Exception{
anywheresoftware.b4a.objects.collections.Map _mitem = null;
 //BA.debugLineNum = 120;BA.debugLine="Sub AddItem(parentID As String, meID As String, mV";
 //BA.debugLineNum = 121;BA.debugLine="parentID = parentID.tolowercase";
_parentid = _parentid.toLowerCase();
 //BA.debugLineNum = 122;BA.debugLine="meID = meID.tolowercase";
_meid = _meid.toLowerCase();
 //BA.debugLineNum = 123;BA.debugLine="Dim mitem As Map = CreateMap()";
_mitem = new anywheresoftware.b4a.objects.collections.Map();
_mitem = __c.createMap(new Object[] {});
 //BA.debugLineNum = 124;BA.debugLine="mitem.Put(\"id\", meID)";
_mitem.Put((Object)("id"),(Object)(_meid));
 //BA.debugLineNum = 125;BA.debugLine="mitem.Put(\"value\", mValue)";
_mitem.Put((Object)("value"),(Object)(_mvalue));
 //BA.debugLineNum = 126;BA.debugLine="mitem.Put(\"href\", mhref)";
_mitem.Put((Object)("href"),(Object)(_mhref));
 //BA.debugLineNum = 127;BA.debugLine="mitem.Put(\"badge\", badge)";
_mitem.Put((Object)("badge"),(Object)(_badge));
 //BA.debugLineNum = 128;BA.debugLine="mitem.Put(\"target\", target)";
_mitem.Put((Object)("target"),(Object)(_target));
 //BA.debugLineNum = 129;BA.debugLine="mitem.Put(\"icon\", mIcon)";
_mitem.Put((Object)("icon"),(Object)(_micon));
 //BA.debugLineNum = 130;BA.debugLine="mitem.Put(\"parentid\", parentID)";
_mitem.Put((Object)("parentid"),(Object)(_parentid));
 //BA.debugLineNum = 131;BA.debugLine="Items.Add(mitem)";
_items.Add((Object)(_mitem.getObject()));
 //BA.debugLineNum = 132;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcontextmenu)(this);
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcontextmenu  _addseparator(String _parentid) throws Exception{
String _meid = "";
anywheresoftware.b4a.objects.collections.Map _mitem = null;
 //BA.debugLineNum = 135;BA.debugLine="Sub AddSeparator(parentID As String) As WixContext";
 //BA.debugLineNum = 136;BA.debugLine="parentID = parentID.tolowercase";
_parentid = _parentid.toLowerCase();
 //BA.debugLineNum = 137;BA.debugLine="sepCount = sepCount + 1";
_sepcount = (int) (_sepcount+1);
 //BA.debugLineNum = 138;BA.debugLine="sepCount = sepCount & \"\"";
_sepcount = (int)(Double.parseDouble(BA.NumberToString(_sepcount)+""));
 //BA.debugLineNum = 139;BA.debugLine="Dim meID As String = \"sep\" & sepCount";
_meid = "sep"+BA.NumberToString(_sepcount);
 //BA.debugLineNum = 140;BA.debugLine="Dim mItem As Map = CreateMap()";
_mitem = new anywheresoftware.b4a.objects.collections.Map();
_mitem = __c.createMap(new Object[] {});
 //BA.debugLineNum = 141;BA.debugLine="mItem.Put(\"id\", meID)";
_mitem.Put((Object)("id"),(Object)(_meid));
 //BA.debugLineNum = 142;BA.debugLine="mItem.Put(\"parentid\", parentID)";
_mitem.Put((Object)("parentid"),(Object)(_parentid));
 //BA.debugLineNum = 143;BA.debugLine="mItem.Put(\"$template\", \"Separator\")";
_mitem.Put((Object)("$template"),(Object)("Separator"));
 //BA.debugLineNum = 144;BA.debugLine="Items.Add(mItem)";
_items.Add((Object)(_mitem.getObject()));
 //BA.debugLineNum = 145;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcontextmenu)(this);
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return null;
}
public String  _addtocolumns(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 167;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 168;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 172;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 173;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 162;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 163;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public ContextMenu As WixElement";
_contextmenu = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private Items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 6;BA.debugLine="Private sepCount As Int";
_sepcount = 0;
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixcontextmenu  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(sid As String) As WixContext";
 //BA.debugLineNum = 11;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 12;BA.debugLine="ContextMenu.Initialize(ID).setview(\"contextmenu\")";
_contextmenu._initialize /*b4j.example.wixelement*/ (ba,_id)._setview /*b4j.example.wixelement*/ ("contextmenu");
 //BA.debugLineNum = 13;BA.debugLine="Items.Initialize";
_items.Initialize();
 //BA.debugLineNum = 14;BA.debugLine="sepCount = 0";
_sepcount = (int) (0);
 //BA.debugLineNum = 15;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcontextmenu)(this);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
anywheresoftware.b4a.objects.collections.List _data = null;
 //BA.debugLineNum = 64;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 65;BA.debugLine="If Items.Size > 0 Then";
if (_items.getSize()>0) { 
 //BA.debugLineNum = 66;BA.debugLine="Dim data As List = modWebix.Unflatten(Items, \"su";
_data = new anywheresoftware.b4a.objects.collections.List();
_data = _modwebix._unflatten /*anywheresoftware.b4a.objects.collections.List*/ (_items,"submenu");
 //BA.debugLineNum = 67;BA.debugLine="SetData(data)";
_setdata(_data);
 };
 //BA.debugLineNum = 69;BA.debugLine="Return ContextMenu.item";
if (true) return _contextmenu._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcontextmenu  _setautowidth(boolean _b) throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Sub SetAutoWidth(b As Boolean) As WixContextMenu";
 //BA.debugLineNum = 109;BA.debugLine="ContextMenu.SetAttr(\"autowidth\", b)";
_contextmenu._setattr /*b4j.example.wixelement*/ ("autowidth",(Object)(_b));
 //BA.debugLineNum = 110;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcontextmenu)(this);
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcontextmenu  _setdata(anywheresoftware.b4a.objects.collections.List _d) throws Exception{
 //BA.debugLineNum = 149;BA.debugLine="Sub SetData(d As List) As WixContextMenu";
 //BA.debugLineNum = 150;BA.debugLine="ContextMenu.SetAttr(\"data\", d)";
_contextmenu._setattr /*b4j.example.wixelement*/ ("data",(Object)(_d.getObject()));
 //BA.debugLineNum = 151;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcontextmenu)(this);
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcontextmenu  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Sub SetHeight(h As Object) As WixContextMenu";
 //BA.debugLineNum = 91;BA.debugLine="ContextMenu.SetAttr(\"height\", h)";
_contextmenu._setattr /*b4j.example.wixelement*/ ("height",_h);
 //BA.debugLineNum = 92;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcontextmenu)(this);
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcontextmenu  _setlayouty(String _r) throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Sub SetLayoutY(r As String) As WixContextMenu  'ig";
 //BA.debugLineNum = 103;BA.debugLine="ContextMenu.SetAttr(\"layout\", \"y\")";
_contextmenu._setattr /*b4j.example.wixelement*/ ("layout",(Object)("y"));
 //BA.debugLineNum = 104;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcontextmenu)(this);
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcontextmenu  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 73;BA.debugLine="Sub SetMap(m As Map) As WixContextMenu";
 //BA.debugLineNum = 74;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 75;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 76;BA.debugLine="ContextMenu.SetAttr(strKey,	strVal)";
_contextmenu._setattr /*b4j.example.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 78;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcontextmenu)(this);
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcontextmenu  _setmaster(String _pid) throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Sub SetMaster(pID As String) As WixContextMenu";
 //BA.debugLineNum = 27;BA.debugLine="ContextMenu.SetAttr(\"master\", pID)";
_contextmenu._setattr /*b4j.example.wixelement*/ ("master",(Object)(_pid));
 //BA.debugLineNum = 28;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcontextmenu)(this);
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcontextmenu  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub SetMinHeight(h As Int) As WixContextMenu";
 //BA.debugLineNum = 59;BA.debugLine="ContextMenu.SetMinHeight(h)";
_contextmenu._setminheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 60;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcontextmenu)(this);
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcontextmenu  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub SetMinWidth(w As Int) As WixContextMenu";
 //BA.debugLineNum = 53;BA.debugLine="ContextMenu.SetMinWidth(w)";
_contextmenu._setminwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcontextmenu)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcontextmenu  _setname(String _n) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub SetName(n As String) As WixContextMenu";
 //BA.debugLineNum = 34;BA.debugLine="ContextMenu.SetName(n)";
_contextmenu._setname /*b4j.example.wixelement*/ (_n);
 //BA.debugLineNum = 35;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcontextmenu)(this);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcontextmenu  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Sub SetResponsive(b As Object) As WixContextMenu";
 //BA.debugLineNum = 40;BA.debugLine="ContextMenu.SetResponsive(b)";
_contextmenu._setresponsive /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 41;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcontextmenu)(this);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcontextmenu  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixContextMe";
 //BA.debugLineNum = 46;BA.debugLine="ContextMenu.SetResponsiveCell(b)";
_contextmenu._setresponsivecell /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 47;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcontextmenu)(this);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcontextmenu  _setselect(boolean _b) throws Exception{
 //BA.debugLineNum = 155;BA.debugLine="Sub SetSelect(b As Boolean) As WixContextMenu";
 //BA.debugLineNum = 156;BA.debugLine="ContextMenu.SetProperty(\"select\", b)";
_contextmenu._setproperty /*b4j.example.wixelement*/ ("select",(Object)(_b));
 //BA.debugLineNum = 157;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcontextmenu)(this);
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcontextmenu  _setsubmenuposright(String _r) throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Sub SetSubMenuPosRight(r As String) As WixContextM";
 //BA.debugLineNum = 84;BA.debugLine="ContextMenu.SetAttr(\"subMenuPos\", \"right\")";
_contextmenu._setattr /*b4j.example.wixelement*/ ("subMenuPos",(Object)("right"));
 //BA.debugLineNum = 85;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcontextmenu)(this);
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcontextmenu  _settemplate(String _t) throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Sub SetTemplate(t As String) As WixContextMenu";
 //BA.debugLineNum = 115;BA.debugLine="ContextMenu.SetAttr(\"template\", t)";
_contextmenu._setattr /*b4j.example.wixelement*/ ("template",(Object)(_t));
 //BA.debugLineNum = 116;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcontextmenu)(this);
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcontextmenu  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 19;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixContext";
 //BA.debugLineNum = 20;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 21;BA.debugLine="ContextMenu.SetTemplate(os)";
_contextmenu._settemplate /*b4j.example.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 22;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcontextmenu)(this);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcontextmenu  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Sub SetWidth(w As Object) As WixContextMenu";
 //BA.debugLineNum = 97;BA.debugLine="ContextMenu.SetAttr(\"width\", w)";
_contextmenu._setattr /*b4j.example.wixelement*/ ("width",_w);
 //BA.debugLineNum = 98;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcontextmenu)(this);
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
