package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixdataview extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixdataview", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixdataview.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _dataview = null;
public com.ab.banano.BANanoObject _onclick = null;
public com.ab.banano.BANanoObject _ondblclick = null;
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
 //BA.debugLineNum = 216;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 217;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 218;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 221;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 222;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 223;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.example.wixform _frm) throws Exception{
 //BA.debugLineNum = 199;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 200;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 201;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 211;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 212;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 213;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public DataView As WixElement";
_dataview = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private onClick As BANanoObject";
_onclick = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 6;BA.debugLine="Private onDblClick As BANanoObject";
_ondblclick = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 7;BA.debugLine="Private typeOf As Map";
_typeof = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixdataview  _initialize(anywheresoftware.b4a.BA _ba,String _tid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(tID As String) As WixDataVie";
 //BA.debugLineNum = 12;BA.debugLine="ID = tID.ToLowerCase";
_id = _tid.toLowerCase();
 //BA.debugLineNum = 13;BA.debugLine="DataView.Initialize(ID).SetView(\"dataview\")";
_dataview._initialize /*b4j.example.wixelement*/ (ba,_id)._setview /*b4j.example.wixelement*/ ("dataview");
 //BA.debugLineNum = 14;BA.debugLine="onClick = Null";
_onclick = (com.ab.banano.BANanoObject)(__c.Null);
 //BA.debugLineNum = 15;BA.debugLine="onDblClick = Null";
_ondblclick = (com.ab.banano.BANanoObject)(__c.Null);
 //BA.debugLineNum = 16;BA.debugLine="typeOf = CreateMap()";
_typeof = __c.createMap(new Object[] {});
 //BA.debugLineNum = 17;BA.debugLine="SetMultiSelect(False)";
_setmultiselect(__c.False);
 //BA.debugLineNum = 18;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdataview)(this);
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 175;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 176;BA.debugLine="DataView.SetAttr(\"type\", typeOf)";
_dataview._setattr /*b4j.example.wixelement*/ ("type",(Object)(_typeof.getObject()));
 //BA.debugLineNum = 177;BA.debugLine="If onClick <> Null Then";
if (_onclick!= null) { 
 //BA.debugLineNum = 178;BA.debugLine="DataView.SetAttr(\"click\", onClick)";
_dataview._setattr /*b4j.example.wixelement*/ ("click",(Object)(_onclick));
 };
 //BA.debugLineNum = 180;BA.debugLine="If onDblClick <> Null Then";
if (_ondblclick!= null) { 
 //BA.debugLineNum = 181;BA.debugLine="DataView.SetAttr(\"dblclick\", onDblClick)";
_dataview._setattr /*b4j.example.wixelement*/ ("dblclick",(Object)(_ondblclick));
 };
 //BA.debugLineNum = 183;BA.debugLine="Return DataView.item";
if (true) return _dataview._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdataview  _setborderless(boolean _b) throws Exception{
 //BA.debugLineNum = 156;BA.debugLine="Sub SetBorderLess(b As Boolean) As WixDataView";
 //BA.debugLineNum = 157;BA.debugLine="DataView.SetAttr(\"borderless\", b)";
_dataview._setattr /*b4j.example.wixelement*/ ("borderless",(Object)(_b));
 //BA.debugLineNum = 158;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdataview)(this);
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdataview  _setclick(com.ab.banano.BANanoObject _e) throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Sub SetClick(e As BANanoObject) As WixDataView";
 //BA.debugLineNum = 108;BA.debugLine="onClick = e";
_onclick = _e;
 //BA.debugLineNum = 109;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdataview)(this);
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdataview  _setdata(anywheresoftware.b4a.objects.collections.List _data) throws Exception{
 //BA.debugLineNum = 204;BA.debugLine="Sub SetData(data As List) As WixDataView";
 //BA.debugLineNum = 205;BA.debugLine="DataView.SetData(data)";
_dataview._setdata /*b4j.example.wixelement*/ (_data);
 //BA.debugLineNum = 206;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdataview)(this);
 //BA.debugLineNum = 207;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdataview  _setdblclick(com.ab.banano.BANanoObject _e) throws Exception{
 //BA.debugLineNum = 113;BA.debugLine="Sub SetDblClick(e As BANanoObject) As WixDataView";
 //BA.debugLineNum = 114;BA.debugLine="onDblClick = e";
_ondblclick = _e;
 //BA.debugLineNum = 115;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdataview)(this);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdataview  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 187;BA.debugLine="Sub SetHeight(h As Object) As WixDataView";
 //BA.debugLineNum = 188;BA.debugLine="DataView.SetHeight(h)";
_dataview._setheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 189;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdataview)(this);
 //BA.debugLineNum = 190;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdataview  _setitemheight(int _h) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Sub SetItemHeight(h As Int) As WixDataView";
 //BA.debugLineNum = 88;BA.debugLine="typeOf.Put(\"height\", h)";
_typeof.Put((Object)("height"),(Object)(_h));
 //BA.debugLineNum = 89;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdataview)(this);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdataview  _setitemwidth(int _h) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub SetItemWidth(h As Int) As WixDataView";
 //BA.debugLineNum = 94;BA.debugLine="typeOf.Put(\"width\", h)";
_typeof.Put((Object)("width"),(Object)(_h));
 //BA.debugLineNum = 95;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdataview)(this);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdataview  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 29;BA.debugLine="Sub SetMap(m As Map) As WixDataView";
 //BA.debugLineNum = 30;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 31;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 32;BA.debugLine="DataView.SetAttr(strKey,	strVal)";
_dataview._setattr /*b4j.example.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 34;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdataview)(this);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdataview  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub SetMinHeight(h As Int) As WixDataView";
 //BA.debugLineNum = 65;BA.debugLine="DataView.SetMinHeight(h)";
_dataview._setminheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 66;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdataview)(this);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdataview  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub SetMinWidth(w As Int) As WixDataView";
 //BA.debugLineNum = 59;BA.debugLine="DataView.SetMinWidth(w)";
_dataview._setminwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 60;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdataview)(this);
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdataview  _setmultiselect(boolean _m) throws Exception{
 //BA.debugLineNum = 125;BA.debugLine="Sub SetMultiSelect(m As Boolean) As WixDataView  '";
 //BA.debugLineNum = 127;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdataview)(this);
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdataview  _setname(String _n) throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Sub SetName(n As String) As WixDataView";
 //BA.debugLineNum = 40;BA.debugLine="DataView.SetName(n)";
_dataview._setname /*b4j.example.wixelement*/ (_n);
 //BA.debugLineNum = 41;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdataview)(this);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdataview  _setnavigation(Object _b) throws Exception{
 //BA.debugLineNum = 150;BA.debugLine="Sub SetNavigation(b As Object) As WixDataView";
 //BA.debugLineNum = 151;BA.debugLine="DataView.SetAttr(\"navigation\", b)";
_dataview._setattr /*b4j.example.wixelement*/ ("navigation",_b);
 //BA.debugLineNum = 152;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdataview)(this);
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdataview  _setpager(String _p) throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Sub SetPager(p As String) As WixDataView";
 //BA.debugLineNum = 101;BA.debugLine="p = p.tolowercase";
_p = _p.toLowerCase();
 //BA.debugLineNum = 102;BA.debugLine="DataView.SetAttr(\"pager\", p)";
_dataview._setattr /*b4j.example.wixelement*/ ("pager",(Object)(_p));
 //BA.debugLineNum = 103;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdataview)(this);
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdataview  _setrank(Object _r) throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Sub SetRank(r As Object) As WixDataView";
 //BA.debugLineNum = 82;BA.debugLine="DataView.SetAttr(\"rank\", r)";
_dataview._setattr /*b4j.example.wixelement*/ ("rank",_r);
 //BA.debugLineNum = 83;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdataview)(this);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdataview  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Sub SetResponsive(b As Object) As WixDataView";
 //BA.debugLineNum = 46;BA.debugLine="DataView.SetResponsive(b)";
_dataview._setresponsive /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 47;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdataview)(this);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdataview  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixDataView";
 //BA.debugLineNum = 52;BA.debugLine="DataView.SetResponsiveCell(b)";
_dataview._setresponsivecell /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 53;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdataview)(this);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdataview  _setscroll(Object _b) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Sub SetScroll(b As Object) As WixDataView";
 //BA.debugLineNum = 76;BA.debugLine="DataView.SetAttr(\"scroll\", b)";
_dataview._setattr /*b4j.example.wixelement*/ ("scroll",_b);
 //BA.debugLineNum = 77;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdataview)(this);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdataview  _setselect(boolean _b) throws Exception{
 //BA.debugLineNum = 132;BA.debugLine="Sub SetSelect(b As Boolean) As WixDataView   'igno";
 //BA.debugLineNum = 133;BA.debugLine="DataView.SetAttr(\"select\", b)";
_dataview._setattr /*b4j.example.wixelement*/ ("select",(Object)(_b));
 //BA.debugLineNum = 134;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdataview)(this);
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdataview  _setsizetocontent(Object _b) throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Sub SetSizeToContent(b As Object) As WixDataView";
 //BA.debugLineNum = 70;BA.debugLine="DataView.SetAttr(\"sizeToContent\", b)";
_dataview._setattr /*b4j.example.wixelement*/ ("sizeToContent",_b);
 //BA.debugLineNum = 71;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdataview)(this);
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdataview  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 163;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 164;BA.debugLine="DataView.SetStyle(prop,val)";
_dataview._setstyle /*b4j.example.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 165;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdataview)(this);
 //BA.debugLineNum = 166;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdataview  _settemplate(String _t) throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Sub SetTemplate(t As String) As WixDataView";
 //BA.debugLineNum = 120;BA.debugLine="DataView.SetTemplate(t)";
_dataview._settemplate /*b4j.example.wixelement*/ ((Object)(_t));
 //BA.debugLineNum = 121;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdataview)(this);
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdataview  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 22;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixDataVie";
 //BA.debugLineNum = 23;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 24;BA.debugLine="DataView.SetTemplate(os)";
_dataview._settemplate /*b4j.example.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 25;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdataview)(this);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdataview  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 169;BA.debugLine="Sub SetTooltip(tt As String) As WixDataView";
 //BA.debugLineNum = 170;BA.debugLine="DataView.SetTooltip(tt)";
_dataview._settooltip /*b4j.example.wixelement*/ (_tt);
 //BA.debugLineNum = 171;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdataview)(this);
 //BA.debugLineNum = 172;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdataview  _setwidth(Object _h) throws Exception{
 //BA.debugLineNum = 193;BA.debugLine="Sub SetWidth(h As Object) As WixDataView";
 //BA.debugLineNum = 194;BA.debugLine="DataView.SetWidth(h)";
_dataview._setwidth /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 195;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdataview)(this);
 //BA.debugLineNum = 196;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdataview  _setxcount(int _x) throws Exception{
 //BA.debugLineNum = 144;BA.debugLine="Sub SetXCount(x As Int) As WixDataView";
 //BA.debugLineNum = 145;BA.debugLine="DataView.SetAttr(\"xCount\", x)";
_dataview._setattr /*b4j.example.wixelement*/ ("xCount",(Object)(_x));
 //BA.debugLineNum = 146;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdataview)(this);
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdataview  _setycount(int _x) throws Exception{
 //BA.debugLineNum = 138;BA.debugLine="Sub SetYCount(x As Int) As WixDataView";
 //BA.debugLineNum = 139;BA.debugLine="DataView.SetAttr(\"yCount\", x)";
_dataview._setattr /*b4j.example.wixelement*/ ("yCount",(Object)(_x));
 //BA.debugLineNum = 140;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdataview)(this);
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
