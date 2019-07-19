package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixmenu extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixmenu", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixmenu.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _menu = null;
public anywheresoftware.b4a.objects.collections.Map _typeof = null;
public anywheresoftware.b4a.objects.collections.List _items = null;
public int _sepcount = 0;
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
public b4j.example.wixmenu  _additem(String _parentid,String _meid,String _mvalue,String _mhref,String _micon,String _badge,String _target) throws Exception{
anywheresoftware.b4a.objects.collections.Map _mitem = null;
 //BA.debugLineNum = 110;BA.debugLine="Sub AddItem(parentID As String, meID As String, mV";
 //BA.debugLineNum = 111;BA.debugLine="parentID = parentID.tolowercase";
_parentid = _parentid.toLowerCase();
 //BA.debugLineNum = 112;BA.debugLine="meID = meID.tolowercase";
_meid = _meid.toLowerCase();
 //BA.debugLineNum = 113;BA.debugLine="Dim mitem As Map = CreateMap()";
_mitem = new anywheresoftware.b4a.objects.collections.Map();
_mitem = __c.createMap(new Object[] {});
 //BA.debugLineNum = 114;BA.debugLine="mitem.Put(\"id\", meID)";
_mitem.Put((Object)("id"),(Object)(_meid));
 //BA.debugLineNum = 115;BA.debugLine="mitem.Put(\"value\", mValue)";
_mitem.Put((Object)("value"),(Object)(_mvalue));
 //BA.debugLineNum = 116;BA.debugLine="mitem.Put(\"href\", mhref)";
_mitem.Put((Object)("href"),(Object)(_mhref));
 //BA.debugLineNum = 117;BA.debugLine="mitem.Put(\"badge\", badge)";
_mitem.Put((Object)("badge"),(Object)(_badge));
 //BA.debugLineNum = 118;BA.debugLine="mitem.Put(\"target\", target)";
_mitem.Put((Object)("target"),(Object)(_target));
 //BA.debugLineNum = 119;BA.debugLine="mitem.Put(\"icon\", mIcon)";
_mitem.Put((Object)("icon"),(Object)(_micon));
 //BA.debugLineNum = 120;BA.debugLine="mitem.Put(\"parentid\", parentID)";
_mitem.Put((Object)("parentid"),(Object)(_parentid));
 //BA.debugLineNum = 121;BA.debugLine="Items.Add(mitem)";
_items.Add((Object)(_mitem.getObject()));
 //BA.debugLineNum = 122;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmenu)(this);
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmenu  _addseparator(String _parentid) throws Exception{
String _meid = "";
anywheresoftware.b4a.objects.collections.Map _mitem = null;
 //BA.debugLineNum = 125;BA.debugLine="Sub AddSeparator(parentID As String) As WixMenu";
 //BA.debugLineNum = 126;BA.debugLine="parentID = parentID.tolowercase";
_parentid = _parentid.toLowerCase();
 //BA.debugLineNum = 127;BA.debugLine="sepCount = sepCount + 1";
_sepcount = (int) (_sepcount+1);
 //BA.debugLineNum = 128;BA.debugLine="sepCount = sepCount & \"\"";
_sepcount = (int)(Double.parseDouble(BA.NumberToString(_sepcount)+""));
 //BA.debugLineNum = 129;BA.debugLine="Dim meID As String = \"sep\" & sepCount";
_meid = "sep"+BA.NumberToString(_sepcount);
 //BA.debugLineNum = 130;BA.debugLine="Dim mItem As Map = CreateMap()";
_mitem = new anywheresoftware.b4a.objects.collections.Map();
_mitem = __c.createMap(new Object[] {});
 //BA.debugLineNum = 131;BA.debugLine="mItem.Put(\"id\", meID)";
_mitem.Put((Object)("id"),(Object)(_meid));
 //BA.debugLineNum = 132;BA.debugLine="mItem.Put(\"parentid\", parentID)";
_mitem.Put((Object)("parentid"),(Object)(_parentid));
 //BA.debugLineNum = 133;BA.debugLine="mItem.Put(\"$template\", \"Separator\")";
_mitem.Put((Object)("$template"),(Object)("Separator"));
 //BA.debugLineNum = 134;BA.debugLine="Items.Add(mItem)";
_items.Add((Object)(_mitem.getObject()));
 //BA.debugLineNum = 135;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmenu)(this);
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return null;
}
public String  _addtocolumns(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 171;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 172;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 176;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 177;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 178;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.example.wixform _frm) throws Exception{
 //BA.debugLineNum = 139;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 140;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 166;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 167;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Menu As WixElement";
_menu = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private typeof As Map";
_typeof = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 6;BA.debugLine="Private Items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 7;BA.debugLine="Private sepCount As Int";
_sepcount = 0;
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixmenu  _initialize(anywheresoftware.b4a.BA _ba,String _iid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(iID As String) As WixMenu";
 //BA.debugLineNum = 12;BA.debugLine="ID = iID.tolowercase";
_id = _iid.toLowerCase();
 //BA.debugLineNum = 13;BA.debugLine="Menu.Initialize(iID).SetView(\"menu\")";
_menu._initialize /*b4j.example.wixelement*/ (ba,_iid)._setview /*b4j.example.wixelement*/ ("menu");
 //BA.debugLineNum = 14;BA.debugLine="typeof = CreateMap()";
_typeof = __c.createMap(new Object[] {});
 //BA.debugLineNum = 15;BA.debugLine="Items.Initialize";
_items.Initialize();
 //BA.debugLineNum = 16;BA.debugLine="sepCount = 0";
_sepcount = (int) (0);
 //BA.debugLineNum = 17;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmenu)(this);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
anywheresoftware.b4a.objects.collections.List _data = null;
 //BA.debugLineNum = 144;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 145;BA.debugLine="If Items.Size > 0 Then";
if (_items.getSize()>0) { 
 //BA.debugLineNum = 146;BA.debugLine="Dim data As List = modWebix.Unflatten(Items,\"sub";
_data = new anywheresoftware.b4a.objects.collections.List();
_data = _modwebix._unflatten /*anywheresoftware.b4a.objects.collections.List*/ (_items,"submenu");
 //BA.debugLineNum = 147;BA.debugLine="SetData(data)";
_setdata(_data);
 };
 //BA.debugLineNum = 149;BA.debugLine="Menu.SetAttr(\"type\", typeof)";
_menu._setattr /*b4j.example.wixelement*/ ("type",(Object)(_typeof.getObject()));
 //BA.debugLineNum = 150;BA.debugLine="Return Menu.item";
if (true) return _menu._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmenu  _setautowidth(boolean _b) throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Sub SetAutoWidth(b As Boolean) As WixMenu";
 //BA.debugLineNum = 105;BA.debugLine="Menu.SetAttr(\"autowidth\", b)";
_menu._setattr /*b4j.example.wixelement*/ ("autowidth",(Object)(_b));
 //BA.debugLineNum = 106;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmenu)(this);
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmenu  _setdata(anywheresoftware.b4a.objects.collections.List _d) throws Exception{
 //BA.debugLineNum = 159;BA.debugLine="Sub SetData(d As List) As WixMenu";
 //BA.debugLineNum = 160;BA.debugLine="Menu.SetAttr(\"data\", d)";
_menu._setattr /*b4j.example.wixelement*/ ("data",(Object)(_d.getObject()));
 //BA.debugLineNum = 161;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmenu)(this);
 //BA.debugLineNum = 162;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmenu  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Sub SetHeight(h As Object) As WixMenu";
 //BA.debugLineNum = 87;BA.debugLine="Menu.SetAttr(\"height\", h)";
_menu._setattr /*b4j.example.wixelement*/ ("height",_h);
 //BA.debugLineNum = 88;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmenu)(this);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmenu  _setitemsubsign(boolean _b) throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Sub SetItemSubSign(b As Boolean) As WixMenu";
 //BA.debugLineNum = 75;BA.debugLine="typeof.Put(\"subsign\", b)";
_typeof.Put((Object)("subsign"),(Object)(_b));
 //BA.debugLineNum = 76;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmenu)(this);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmenu  _setlayouty(String _r) throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Sub SetLayoutY(r As String) As WixMenu  'ignore";
 //BA.debugLineNum = 99;BA.debugLine="Menu.SetAttr(\"layout\", \"y\")";
_menu._setattr /*b4j.example.wixelement*/ ("layout",(Object)("y"));
 //BA.debugLineNum = 100;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmenu)(this);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmenu  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 21;BA.debugLine="Sub SetMap(m As Map) As WixMenu";
 //BA.debugLineNum = 22;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 23;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 24;BA.debugLine="Menu.SetAttr(strKey,	strVal)";
_menu._setattr /*b4j.example.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 26;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmenu)(this);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmenu  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Sub SetMinHeight(h As Int) As WixMenu";
 //BA.debugLineNum = 63;BA.debugLine="Menu.SetMinHeight(h)";
_menu._setminheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 64;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmenu)(this);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmenu  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Sub SetMinWidth(w As Int) As WixMenu";
 //BA.debugLineNum = 57;BA.debugLine="Menu.SetMinWidth(w)";
_menu._setminwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 58;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmenu)(this);
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmenu  _setname(String _n) throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Sub SetName(n As String) As WixMenu";
 //BA.debugLineNum = 38;BA.debugLine="Menu.SetName(n)";
_menu._setname /*b4j.example.wixelement*/ (_n);
 //BA.debugLineNum = 39;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmenu)(this);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmenu  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Sub SetResponsive(b As Object) As WixMenu";
 //BA.debugLineNum = 44;BA.debugLine="Menu.SetResponsive(b)";
_menu._setresponsive /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 45;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmenu)(this);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmenu  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixMenu";
 //BA.debugLineNum = 50;BA.debugLine="Menu.SetResponsiveCell(b)";
_menu._setresponsivecell /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 51;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmenu)(this);
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmenu  _setselect(boolean _b) throws Exception{
 //BA.debugLineNum = 154;BA.debugLine="Sub SetSelect(b As Boolean) As WixMenu";
 //BA.debugLineNum = 155;BA.debugLine="Menu.SetAttr(\"select\", b)";
_menu._setattr /*b4j.example.wixelement*/ ("select",(Object)(_b));
 //BA.debugLineNum = 156;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmenu)(this);
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmenu  _setsubmenuposright(String _r) throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Sub SetSubMenuPosRight(r As String) As WixMenu   '";
 //BA.debugLineNum = 69;BA.debugLine="Menu.SetAttr(\"subMenuPos\", \"right\")";
_menu._setattr /*b4j.example.wixelement*/ ("subMenuPos",(Object)("right"));
 //BA.debugLineNum = 70;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmenu)(this);
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmenu  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 30;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixMenu";
 //BA.debugLineNum = 31;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 32;BA.debugLine="Menu.SetTemplate(os)";
_menu._settemplate /*b4j.example.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 33;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmenu)(this);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmenu  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub SetTooltip(tt As String) As WixMenu";
 //BA.debugLineNum = 81;BA.debugLine="Menu.SetTooltip(tt)";
_menu._settooltip /*b4j.example.wixelement*/ (_tt);
 //BA.debugLineNum = 82;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmenu)(this);
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmenu  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Sub SetWidth(w As Object) As WixMenu";
 //BA.debugLineNum = 93;BA.debugLine="Menu.SetAttr(\"width\", w)";
_menu._setattr /*b4j.example.wixelement*/ ("width",_w);
 //BA.debugLineNum = 94;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmenu)(this);
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
