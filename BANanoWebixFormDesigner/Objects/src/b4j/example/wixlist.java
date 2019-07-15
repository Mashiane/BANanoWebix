package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixlist extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixlist", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixlist.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.wixelement _list = null;
public String _id = "";
public anywheresoftware.b4a.objects.collections.Map _typeof = null;
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
public b4j.example.wixlist  _additem(String _ikey,String _ivalue) throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
 //BA.debugLineNum = 18;BA.debugLine="Sub AddItem(iKey As String, iValue As String) As W";
 //BA.debugLineNum = 19;BA.debugLine="Dim m As Map = CreateMap()";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = __c.createMap(new Object[] {});
 //BA.debugLineNum = 20;BA.debugLine="m.Put(\"id\", iKey)";
_m.Put((Object)("id"),(Object)(_ikey));
 //BA.debugLineNum = 21;BA.debugLine="m.Put(\"value\", iValue)";
_m.Put((Object)("value"),(Object)(_ivalue));
 //BA.debugLineNum = 22;BA.debugLine="Items.Add(m)";
_items.Add((Object)(_m.getObject()));
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlist)(this);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 191;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 192;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 193;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 196;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 197;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 198;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 186;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 187;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public List As WixElement";
_list = new b4j.example.wixelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private typeOf As Map";
_typeof = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 6;BA.debugLine="Private Items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixlist  _initialize(anywheresoftware.b4a.BA _ba,String _lid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(lID As String) As WixList";
 //BA.debugLineNum = 11;BA.debugLine="ID = lID.tolowercase";
_id = _lid.toLowerCase();
 //BA.debugLineNum = 12;BA.debugLine="List.Initialize(ID).SetView(\"list\")";
_list._initialize /*b4j.example.wixelement*/ (ba,_id)._setview /*b4j.example.wixelement*/ ("list");
 //BA.debugLineNum = 13;BA.debugLine="Items.Initialize";
_items.Initialize();
 //BA.debugLineNum = 14;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlist)(this);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 141;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 142;BA.debugLine="If Items.Size > 0 Then";
if (_items.getSize()>0) { 
 //BA.debugLineNum = 143;BA.debugLine="SetData(Items)";
_setdata(_items);
 };
 //BA.debugLineNum = 145;BA.debugLine="List.SetAttr(\"type\", typeOf)";
_list._setattr /*b4j.example.wixelement*/ ("type",(Object)(_typeof.getObject()));
 //BA.debugLineNum = 146;BA.debugLine="Return List.item";
if (true) return _list._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlist  _setautoheight(boolean _b) throws Exception{
 //BA.debugLineNum = 162;BA.debugLine="Sub SetAutoHeight(b As Boolean) As WixList";
 //BA.debugLineNum = 163;BA.debugLine="List.SetAttr(\"autoheight\", b)";
_list._setattr /*b4j.example.wixelement*/ ("autoheight",(Object)(_b));
 //BA.debugLineNum = 164;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlist)(this);
 //BA.debugLineNum = 165;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlist  _setborderless(boolean _b) throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Sub SetBorderLess(b As Boolean) As WixList";
 //BA.debugLineNum = 111;BA.debugLine="List.SetAttr(\"borderless\", b)";
_list._setattr /*b4j.example.wixelement*/ ("borderless",(Object)(_b));
 //BA.debugLineNum = 112;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlist)(this);
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlist  _setdata(anywheresoftware.b4a.objects.collections.List _t) throws Exception{
 //BA.debugLineNum = 179;BA.debugLine="Sub SetData(t As List) As WixList";
 //BA.debugLineNum = 180;BA.debugLine="List.SetData(t)";
_list._setdata /*b4j.example.wixelement*/ (_t);
 //BA.debugLineNum = 181;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlist)(this);
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlist  _setheight(Object _t) throws Exception{
 //BA.debugLineNum = 156;BA.debugLine="Sub SetHeight(t As Object) As WixList";
 //BA.debugLineNum = 157;BA.debugLine="List.SetHeight(t)";
_list._setheight /*b4j.example.wixelement*/ (_t);
 //BA.debugLineNum = 158;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlist)(this);
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlist  _setitemheight(Object _h) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Sub SetItemHeight(h As Object) As WixList";
 //BA.debugLineNum = 76;BA.debugLine="typeOf.Put(\"height\", h)";
_typeof.Put((Object)("height"),_h);
 //BA.debugLineNum = 77;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlist)(this);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlist  _setitemwidth(Object _w) throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Sub SetItemWidth(w As Object) As WixList";
 //BA.debugLineNum = 82;BA.debugLine="typeOf.Put(\"width\", w)";
_typeof.Put((Object)("width"),_w);
 //BA.debugLineNum = 83;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlist)(this);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlist  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 34;BA.debugLine="Sub SetMap(m As Map) As WixList";
 //BA.debugLineNum = 35;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 36;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 37;BA.debugLine="List.SetAttr(strKey,	strVal)";
_list._setattr /*b4j.example.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 39;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlist)(this);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlist  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Sub SetMinHeight(h As Int) As WixList";
 //BA.debugLineNum = 70;BA.debugLine="List.SetMinHeight(h)";
_list._setminheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 71;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlist)(this);
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlist  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Sub SetMinWidth(w As Int) As WixList";
 //BA.debugLineNum = 64;BA.debugLine="List.SetMinWidth(w)";
_list._setminwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 65;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlist)(this);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlist  _setmultiselect(boolean _b) throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Sub SetMultiSelect(b As Boolean) As WixList";
 //BA.debugLineNum = 123;BA.debugLine="List.SetAttr(\"multiselect\", b)";
_list._setattr /*b4j.example.wixelement*/ ("multiselect",(Object)(_b));
 //BA.debugLineNum = 124;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlist)(this);
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlist  _setname(String _n) throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub SetName(n As String) As WixList";
 //BA.debugLineNum = 45;BA.debugLine="List.SetName(n)";
_list._setname /*b4j.example.wixelement*/ (_n);
 //BA.debugLineNum = 46;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlist)(this);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlist  _setpager(String _p) throws Exception{
 //BA.debugLineNum = 134;BA.debugLine="Sub SetPager(p As String) As WixList";
 //BA.debugLineNum = 135;BA.debugLine="p = p.tolowercase";
_p = _p.toLowerCase();
 //BA.debugLineNum = 136;BA.debugLine="List.SetAttr(\"pager\", p)";
_list._setattr /*b4j.example.wixelement*/ ("pager",(Object)(_p));
 //BA.debugLineNum = 137;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlist)(this);
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlist  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Sub SetResponsive(b As Object) As WixList";
 //BA.debugLineNum = 51;BA.debugLine="List.SetResponsive(b)";
_list._setresponsive /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 52;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlist)(this);
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlist  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixList";
 //BA.debugLineNum = 57;BA.debugLine="List.SetResponsiveCell(b)";
_list._setresponsivecell /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 58;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlist)(this);
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlist  _setscroll(Object _b) throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Sub SetScroll(b As Object) As WixList";
 //BA.debugLineNum = 129;BA.debugLine="List.SetAttr(\"scroll\", b)";
_list._setattr /*b4j.example.wixelement*/ ("scroll",_b);
 //BA.debugLineNum = 130;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlist)(this);
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlist  _setselect(boolean _b) throws Exception{
 //BA.debugLineNum = 116;BA.debugLine="Sub SetSelect(b As Boolean) As WixList";
 //BA.debugLineNum = 117;BA.debugLine="List.SetAttr(\"select\", b)";
_list._setattr /*b4j.example.wixelement*/ ("select",(Object)(_b));
 //BA.debugLineNum = 118;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlist)(this);
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlist  _settemplate(String _t) throws Exception{
 //BA.debugLineNum = 150;BA.debugLine="Sub SetTemplate(t As String) As WixList";
 //BA.debugLineNum = 151;BA.debugLine="List.SetTemplate(t)";
_list._settemplate /*b4j.example.wixelement*/ ((Object)(_t));
 //BA.debugLineNum = 152;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlist)(this);
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlist  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 27;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixList";
 //BA.debugLineNum = 28;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 29;BA.debugLine="List.SetTemplate(os)";
_list._settemplate /*b4j.example.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 30;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlist)(this);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlist  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Sub SetTooltip(tt As String) As WixList";
 //BA.debugLineNum = 89;BA.debugLine="List.SetTooltip(tt)";
_list._settooltip /*b4j.example.wixelement*/ (_tt);
 //BA.debugLineNum = 90;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlist)(this);
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlist  _settypeuploader(boolean _b) throws Exception{
 //BA.debugLineNum = 167;BA.debugLine="Sub SetTypeUploader(b As Boolean) As WixList  'ign";
 //BA.debugLineNum = 168;BA.debugLine="List.SetType(\"uploader\")";
_list._settype /*b4j.example.wixelement*/ ("uploader");
 //BA.debugLineNum = 169;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlist)(this);
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlist  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Sub SetValue(v As String) As WixList";
 //BA.debugLineNum = 105;BA.debugLine="List.SetValue(v)";
_list._setvalue /*b4j.example.wixelement*/ (_v);
 //BA.debugLineNum = 106;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlist)(this);
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlist  _setwidth(Object _t) throws Exception{
 //BA.debugLineNum = 173;BA.debugLine="Sub SetWidth(t As Object) As WixList";
 //BA.debugLineNum = 174;BA.debugLine="List.SetWidth(t)";
_list._setwidth /*b4j.example.wixelement*/ (_t);
 //BA.debugLineNum = 175;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlist)(this);
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
