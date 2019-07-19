package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixrow extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixrow", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixrow.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.wixelement _row = null;
public String _id = "";
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
public b4j.example.wixrow  _addcells(anywheresoftware.b4a.objects.collections.Map _i) throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Sub AddCells(i As Map) As WixRow";
 //BA.debugLineNum = 109;BA.debugLine="Row.AddCells(i)";
_row._addcells /*b4j.example.wixelement*/ (_i);
 //BA.debugLineNum = 110;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrow)(this);
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrow  _addcolumn(b4j.example.wixcolumn _wxel) throws Exception{
 //BA.debugLineNum = 151;BA.debugLine="Sub AddColumn(wxEL As WixColumn) As WixRow";
 //BA.debugLineNum = 152;BA.debugLine="Row.AddColumns(wxEL.Item)";
_row._addcolumns /*b4j.example.wixelement*/ (_wxel._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 153;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrow)(this);
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrow  _addcolumns(anywheresoftware.b4a.objects.collections.Map _i) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub AddColumns(i As Map) As WixRow";
 //BA.debugLineNum = 54;BA.debugLine="Row.AddColumns(i)";
_row._addcolumns /*b4j.example.wixelement*/ (_i);
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrow)(this);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrow  _addcolumnsitem(anywheresoftware.b4a.objects.collections.Map _i) throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Sub AddColumnsItem(i As Map) As WixRow";
 //BA.debugLineNum = 116;BA.debugLine="AddColumns(i)";
_addcolumns(_i);
 //BA.debugLineNum = 117;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrow)(this);
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrow  _addcolumnsspacer(int _width) throws Exception{
anywheresoftware.b4a.objects.collections.Map _itm = null;
 //BA.debugLineNum = 121;BA.debugLine="Sub AddColumnsSpacer(width As Int) As WixRow  'ign";
 //BA.debugLineNum = 122;BA.debugLine="Dim itm As Map = CreateMap()";
_itm = new anywheresoftware.b4a.objects.collections.Map();
_itm = __c.createMap(new Object[] {});
 //BA.debugLineNum = 123;BA.debugLine="If width > 0 Then itm.Put(\"width\", width)";
if (_width>0) { 
_itm.Put((Object)("width"),(Object)(_width));};
 //BA.debugLineNum = 124;BA.debugLine="Row.AddColumns(itm)";
_row._addcolumns /*b4j.example.wixelement*/ (_itm);
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrow  _additem(anywheresoftware.b4a.objects.collections.Map _wxel) throws Exception{
 //BA.debugLineNum = 145;BA.debugLine="Sub AddItem(wxEL As Map) As WixRow";
 //BA.debugLineNum = 146;BA.debugLine="Row.AddRows(wxEL)";
_row._addrows /*b4j.example.wixelement*/ (_wxel);
 //BA.debugLineNum = 147;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrow)(this);
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrow  _addresizertocolumns(String _s) throws Exception{
 //BA.debugLineNum = 227;BA.debugLine="Sub AddResizerToColumns(s As String) As WixRow   '";
 //BA.debugLineNum = 228;BA.debugLine="Row.AddResizerToColumns(s)";
_row._addresizertocolumns /*b4j.example.wixelement*/ (_s);
 //BA.debugLineNum = 229;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrow  _addresizertorows(String _s) throws Exception{
 //BA.debugLineNum = 223;BA.debugLine="Sub AddResizerToRows(s As String) As WixRow   'ign";
 //BA.debugLineNum = 224;BA.debugLine="Row.AddResizerToRows(s)";
_row._addresizertorows /*b4j.example.wixelement*/ (_s);
 //BA.debugLineNum = 225;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrow  _addrows(anywheresoftware.b4a.objects.collections.Map _i) throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Sub AddRows(i As Map) As WixRow";
 //BA.debugLineNum = 129;BA.debugLine="Row.AddRows(i)";
_row._addrows /*b4j.example.wixelement*/ (_i);
 //BA.debugLineNum = 130;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrow)(this);
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrow  _addrowscells(anywheresoftware.b4a.objects.collections.List _mcells) throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 33;BA.debugLine="Sub AddRowsCells(mCells As List) As WixRow";
 //BA.debugLineNum = 34;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 35;BA.debugLine="opt.Put(\"cells\", mCells)";
_opt.Put((Object)("cells"),(Object)(_mcells.getObject()));
 //BA.debugLineNum = 36;BA.debugLine="AddRows(opt)";
_addrows(_opt);
 //BA.debugLineNum = 37;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrow)(this);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return null;
}
public String  _addtocolumns(b4j.example.wixelement _prt) throws Exception{
 //BA.debugLineNum = 197;BA.debugLine="Sub AddToColumns(prt As WixElement)";
 //BA.debugLineNum = 198;BA.debugLine="prt.AddColumns(Item)";
_prt._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 199;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 219;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 220;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 221;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.example.wixform _frm) throws Exception{
 //BA.debugLineNum = 157;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 158;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return "";
}
public String  _addtopage(b4j.example.wixpage _p) throws Exception{
 //BA.debugLineNum = 162;BA.debugLine="Sub AddToPage(p As WixPage)";
 //BA.debugLineNum = 163;BA.debugLine="p.Page.AddRows(Item)";
_p._page /*b4j.example.wixelement*/ ._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return "";
}
public String  _addtopagerows(b4j.example.wixpage _sv) throws Exception{
 //BA.debugLineNum = 205;BA.debugLine="Sub AddToPageRows(sv As WixPage)";
 //BA.debugLineNum = 206;BA.debugLine="sv.AddRows(Item)";
_sv._addrows /*String*/ (_item());
 //BA.debugLineNum = 207;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.example.wixelement _prt) throws Exception{
 //BA.debugLineNum = 192;BA.debugLine="Sub AddToRows(prt As WixElement)";
 //BA.debugLineNum = 193;BA.debugLine="prt.AddRows(Item)";
_prt._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return "";
}
public String  _addtoscrollviewrows(b4j.example.wixscrollview _sv) throws Exception{
 //BA.debugLineNum = 201;BA.debugLine="Sub AddToScrollViewRows(sv As WixScrollView)";
 //BA.debugLineNum = 202;BA.debugLine="sv.AddRows(Item)";
_sv._addrows /*String*/ (_item());
 //BA.debugLineNum = 203;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Row As WixElement";
_row = new b4j.example.wixelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixresizer  _createresizer(String _rid) throws Exception{
b4j.example.wixresizer _res1 = null;
 //BA.debugLineNum = 14;BA.debugLine="Sub CreateResizer(rid As String) As WixResizer";
 //BA.debugLineNum = 15;BA.debugLine="Dim res1 As WixResizer";
_res1 = new b4j.example.wixresizer();
 //BA.debugLineNum = 16;BA.debugLine="res1.Initialize(rid)";
_res1._initialize /*b4j.example.wixresizer*/ (ba,_rid);
 //BA.debugLineNum = 17;BA.debugLine="Return res1";
if (true) return _res1;
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrow  _initialize(anywheresoftware.b4a.BA _ba,String _rid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize(rID As String) As WixRow";
 //BA.debugLineNum = 9;BA.debugLine="ID = rID.tolowercase";
_id = _rid.toLowerCase();
 //BA.debugLineNum = 10;BA.debugLine="Row.Initialize(ID)";
_row._initialize /*b4j.example.wixelement*/ (ba,_id);
 //BA.debugLineNum = 11;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrow)(this);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 140;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 141;BA.debugLine="Return Row.item";
if (true) return _row._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrow  _setautoheight(boolean _b) throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Sub SetAutoHeight(b As Boolean) As WixRow";
 //BA.debugLineNum = 97;BA.debugLine="Row.SetAttr(\"autoheight\", b)";
_row._setattr /*b4j.example.wixelement*/ ("autoheight",(Object)(_b));
 //BA.debugLineNum = 98;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrow)(this);
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrow  _setautowidth(boolean _b) throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Sub SetAutoWidth(b As Boolean) As WixRow";
 //BA.debugLineNum = 91;BA.debugLine="Row.SetAttr(\"autowidth\", b)";
_row._setattr /*b4j.example.wixelement*/ ("autowidth",(Object)(_b));
 //BA.debugLineNum = 92;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrow)(this);
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrow  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 167;BA.debugLine="Sub SetHeight(h As Object) As WixRow";
 //BA.debugLineNum = 168;BA.debugLine="Row.SetHeight(h)";
_row._setheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 169;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrow)(this);
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrow  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 210;BA.debugLine="Sub SetMap(m As Map) As WixRow";
 //BA.debugLineNum = 211;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 212;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 213;BA.debugLine="Row.SetAttr(strKey,	strVal)";
_row._setattr /*b4j.example.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 215;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrow)(this);
 //BA.debugLineNum = 216;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrow  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub SetMargin(margin As Object) As WixRow";
 //BA.debugLineNum = 48;BA.debugLine="Row.SetMargin(margin)";
_row._setmargin /*b4j.example.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrow)(this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrow  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub SetMinHeight(h As Int) As WixRow";
 //BA.debugLineNum = 85;BA.debugLine="Row.SetMinHeight(h)";
_row._setminheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 86;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrow)(this);
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrow  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub SetMinWidth(w As Int) As WixRow";
 //BA.debugLineNum = 79;BA.debugLine="Row.SetMinWidth(w)";
_row._setminwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 80;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrow)(this);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrow  _setname(String _n) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Sub SetName(n As String) As WixRow";
 //BA.debugLineNum = 60;BA.debugLine="Row.SetName(n)";
_row._setname /*b4j.example.wixelement*/ (_n);
 //BA.debugLineNum = 61;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrow)(this);
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrow  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Sub SetPadding(padding As Object) As WixRow";
 //BA.debugLineNum = 42;BA.debugLine="Row.SetPadding(padding)";
_row._setpadding /*b4j.example.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 43;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrow)(this);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrow  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Sub SetResponsive(b As Object) As WixRow";
 //BA.debugLineNum = 66;BA.debugLine="Row.SetResponsive(b)";
_row._setresponsive /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 67;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrow)(this);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrow  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixRow";
 //BA.debugLineNum = 72;BA.debugLine="Row.SetResponsiveCell(b)";
_row._setresponsivecell /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 73;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrow)(this);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrow  _setscroll(Object _b) throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Sub SetScroll(b As Object) As WixRow";
 //BA.debugLineNum = 103;BA.debugLine="Row.SetAttr(\"scroll\", b)";
_row._setattr /*b4j.example.wixelement*/ ("scroll",_b);
 //BA.debugLineNum = 104;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrow)(this);
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrow  _settemplate(String _t) throws Exception{
 //BA.debugLineNum = 186;BA.debugLine="Sub SetTemplate(t As String) As WixRow";
 //BA.debugLineNum = 187;BA.debugLine="Row.SetTemplate(t)";
_row._settemplate /*b4j.example.wixelement*/ ((Object)(_t));
 //BA.debugLineNum = 188;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrow)(this);
 //BA.debugLineNum = 189;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrow  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 179;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixRow";
 //BA.debugLineNum = 180;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 181;BA.debugLine="Row.SetTemplate(os)";
_row._settemplate /*b4j.example.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 182;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrow)(this);
 //BA.debugLineNum = 183;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrow  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 134;BA.debugLine="Sub SetTooltip(tt As String) As WixRow";
 //BA.debugLineNum = 135;BA.debugLine="Row.SetTooltip(tt)";
_row._settooltip /*b4j.example.wixelement*/ (_tt);
 //BA.debugLineNum = 136;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrow)(this);
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrow  _settype(Object _t) throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Sub SetType(t As Object) As WixRow";
 //BA.debugLineNum = 28;BA.debugLine="Row.SetAttr(\"type\", t)";
_row._setattr /*b4j.example.wixelement*/ ("type",_t);
 //BA.debugLineNum = 29;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrow)(this);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrow  _settypewide() throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub SetTypeWide As WixRow";
 //BA.debugLineNum = 22;BA.debugLine="Row.SetAttr(\"type\", \"wide\")";
_row._setattr /*b4j.example.wixelement*/ ("type",(Object)("wide"));
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrow)(this);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrow  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 173;BA.debugLine="Sub SetWidth(w As Object) As WixRow";
 //BA.debugLineNum = 174;BA.debugLine="Row.setwidth(w)";
_row._setwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 175;BA.debugLine="Return Me";
if (true) return (b4j.example.wixrow)(this);
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
