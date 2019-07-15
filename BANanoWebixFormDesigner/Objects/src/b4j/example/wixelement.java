package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixelement extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixelement", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixelement.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public anywheresoftware.b4a.objects.collections.List _columns = null;
public anywheresoftware.b4a.objects.collections.List _rows = null;
public anywheresoftware.b4a.objects.collections.Map _element = null;
public anywheresoftware.b4a.objects.collections.List _elements = null;
public anywheresoftware.b4a.objects.collections.Map _attributes = null;
public anywheresoftware.b4a.objects.collections.Map _htmlattributes = null;
public anywheresoftware.b4a.objects.collections.Map _styles = null;
public anywheresoftware.b4a.objects.collections.List _cells = null;
public anywheresoftware.b4a.objects.collections.Map _elementsconfig = null;
public anywheresoftware.b4a.objects.collections.List _cols = null;
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
public b4j.example.wixelement  _addcells(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 514;BA.debugLine="Sub AddCells(itm As Map) As WixElement";
 //BA.debugLineNum = 515;BA.debugLine="Cells.Add(itm)";
_cells.Add((Object)(_itm.getObject()));
 //BA.debugLineNum = 516;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 517;BA.debugLine="End Sub";
return null;
}
public String  _addcolumn(b4j.example.wixcolumn _wxel) throws Exception{
 //BA.debugLineNum = 633;BA.debugLine="Sub AddColumn(wxEL As WixColumn)";
 //BA.debugLineNum = 634;BA.debugLine="AddColumns(wxEL.Item)";
_addcolumns(_wxel._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 635;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixelement  _addcolumns(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 502;BA.debugLine="Sub AddColumns(itm As Map) As WixElement";
 //BA.debugLineNum = 503;BA.debugLine="Cols.Add(itm)";
_cols.Add((Object)(_itm.getObject()));
 //BA.debugLineNum = 504;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 505;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _addcolumnscells(anywheresoftware.b4a.objects.collections.List _mcells) throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 529;BA.debugLine="Sub AddColumnsCells(mCells As List) As WixElement";
 //BA.debugLineNum = 530;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 531;BA.debugLine="opt.Put(\"cells\", mCells)";
_opt.Put((Object)("cells"),(Object)(_mcells.getObject()));
 //BA.debugLineNum = 532;BA.debugLine="AddColumns(opt)";
_addcolumns(_opt);
 //BA.debugLineNum = 533;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 534;BA.debugLine="End Sub";
return null;
}
public String  _addcolumnsspacer() throws Exception{
b4j.example.wixelement _s = null;
 //BA.debugLineNum = 589;BA.debugLine="Sub AddColumnsSpacer()";
 //BA.debugLineNum = 590;BA.debugLine="Dim s As WixElement";
_s = new b4j.example.wixelement();
 //BA.debugLineNum = 591;BA.debugLine="s.Initialize(\"\").SetView(\"spacer\")";
_s._initialize /*b4j.example.wixelement*/ (ba,"")._setview /*b4j.example.wixelement*/ ("spacer");
 //BA.debugLineNum = 592;BA.debugLine="AddColumns(s.item)";
_addcolumns(_s._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 593;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixelement  _adddatacolumn(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 508;BA.debugLine="Sub AddDataColumn(itm As Map) As WixElement";
 //BA.debugLineNum = 509;BA.debugLine="Columns.Add(itm)";
_columns.Add((Object)(_itm.getObject()));
 //BA.debugLineNum = 510;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 511;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _addelements(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 537;BA.debugLine="Sub AddElements(itm As Map) As WixElement";
 //BA.debugLineNum = 538;BA.debugLine="Elements.Add(itm)";
_elements.Add((Object)(_itm.getObject()));
 //BA.debugLineNum = 539;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 540;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _additem(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 549;BA.debugLine="Sub AddItem(itm As Map) As WixElement";
 //BA.debugLineNum = 550;BA.debugLine="Elements.Add(itm)";
_elements.Add((Object)(_itm.getObject()));
 //BA.debugLineNum = 551;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 552;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _addresizertocolumns(String _s) throws Exception{
b4j.example.wixresizer _r = null;
 //BA.debugLineNum = 488;BA.debugLine="Sub AddResizerToColumns(s As String) As WixElement";
 //BA.debugLineNum = 489;BA.debugLine="Dim r As WixResizer";
_r = new b4j.example.wixresizer();
 //BA.debugLineNum = 490;BA.debugLine="r.Initialize(\"\")";
_r._initialize /*b4j.example.wixresizer*/ (ba,"");
 //BA.debugLineNum = 491;BA.debugLine="AddColumns(r.Item)";
_addcolumns(_r._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 492;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 493;BA.debugLine="End Sub";
return null;
}
public String  _addrow(b4j.example.wixrow _wxel) throws Exception{
 //BA.debugLineNum = 555;BA.debugLine="Sub AddRow(wxEL As WixRow)";
 //BA.debugLineNum = 556;BA.debugLine="AddRows(wxEL.Item)";
_addrows(_wxel._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 557;BA.debugLine="End Sub";
return "";
}
public String  _addrowitems(anywheresoftware.b4a.objects.collections.List _items) throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
 //BA.debugLineNum = 560;BA.debugLine="Sub AddRowItems(items As List)";
 //BA.debugLineNum = 561;BA.debugLine="For Each m As Map In items";
_m = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group1 = _items;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group1.Get(index1)));
 //BA.debugLineNum = 562;BA.debugLine="AddRows(m)";
_addrows(_m);
 }
};
 //BA.debugLineNum = 564;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixelement  _addrows(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 543;BA.debugLine="Sub AddRows(itm As Map) As WixElement";
 //BA.debugLineNum = 544;BA.debugLine="Rows.Add(itm)";
_rows.Add((Object)(_itm.getObject()));
 //BA.debugLineNum = 545;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 546;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _addrowscells(anywheresoftware.b4a.objects.collections.List _mcells) throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 520;BA.debugLine="Sub AddRowsCells(mCells As List) As WixElement";
 //BA.debugLineNum = 521;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 522;BA.debugLine="opt.Put(\"cells\", mCells)";
_opt.Put((Object)("cells"),(Object)(_mcells.getObject()));
 //BA.debugLineNum = 523;BA.debugLine="AddRows(opt)";
_addrows(_opt);
 //BA.debugLineNum = 524;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 525;BA.debugLine="End Sub";
return null;
}
public String  _addrowsspacer() throws Exception{
b4j.example.wixelement _s = null;
 //BA.debugLineNum = 582;BA.debugLine="Sub AddRowsSpacer()";
 //BA.debugLineNum = 583;BA.debugLine="Dim s As WixElement";
_s = new b4j.example.wixelement();
 //BA.debugLineNum = 584;BA.debugLine="s.Initialize(\"\").SetView(\"spacer\")";
_s._initialize /*b4j.example.wixelement*/ (ba,"")._setview /*b4j.example.wixelement*/ ("spacer");
 //BA.debugLineNum = 585;BA.debugLine="AddRows(s.item)";
_addrows(_s._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 586;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixelement  _addtocolumns(b4j.example.wixelement _prt) throws Exception{
 //BA.debugLineNum = 596;BA.debugLine="Sub AddToColumns(prt As WixElement) As WixElement";
 //BA.debugLineNum = 597;BA.debugLine="prt.AddColumns(Item)";
_prt._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 598;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 599;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _addtoelements(b4j.example.wixelement _prt) throws Exception{
 //BA.debugLineNum = 627;BA.debugLine="Sub AddToElements(prt As WixElement) As WixElement";
 //BA.debugLineNum = 628;BA.debugLine="prt.AddElements(Item)";
_prt._addelements /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 629;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 630;BA.debugLine="End Sub";
return null;
}
public String  _addtorow(b4j.example.wixrow _r) throws Exception{
 //BA.debugLineNum = 688;BA.debugLine="Sub AddToRow(r As WixRow)";
 //BA.debugLineNum = 689;BA.debugLine="r.AddItem(Item)";
_r._additem /*b4j.example.wixrow*/ (_item());
 //BA.debugLineNum = 690;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.example.wixelement _prt) throws Exception{
 //BA.debugLineNum = 577;BA.debugLine="Sub AddToRows(prt As WixElement)";
 //BA.debugLineNum = 578;BA.debugLine="prt.AddRows(Item)";
_prt._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 579;BA.debugLine="End Sub";
return "";
}
public String  _addwixrows(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
b4j.example.wixrow _i = null;
 //BA.debugLineNum = 84;BA.debugLine="Sub AddWixRows(lst As List)";
 //BA.debugLineNum = 85;BA.debugLine="For Each i As WixRow In lst";
{
final anywheresoftware.b4a.BA.IterableList group1 = _lst;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_i = (b4j.example.wixrow)(group1.Get(index1));
 //BA.debugLineNum = 86;BA.debugLine="AddRow(i)";
_addrow(_i);
 }
};
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Columns As List";
_columns = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 5;BA.debugLine="Public Rows As List";
_rows = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 6;BA.debugLine="Private Element As Map";
_element = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 7;BA.debugLine="Public Elements As List";
_elements = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 8;BA.debugLine="Private Attributes As Map";
_attributes = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 9;BA.debugLine="Private HTMLAttributes As Map";
_htmlattributes = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 10;BA.debugLine="Private Styles As Map";
_styles = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 11;BA.debugLine="Public Cells As List";
_cells = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 12;BA.debugLine="Private elementsConfig As Map";
_elementsconfig = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 13;BA.debugLine="Public Cols As List";
_cols = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixaccordion  _createaccordion(String _sid) throws Exception{
b4j.example.wixaccordion _btn = null;
 //BA.debugLineNum = 749;BA.debugLine="Sub CreateAccordion(sid As String) As WixAccordion";
 //BA.debugLineNum = 750;BA.debugLine="Dim btn As WixAccordion";
_btn = new b4j.example.wixaccordion();
 //BA.debugLineNum = 751;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.example.wixaccordion*/ (ba,_sid);
 //BA.debugLineNum = 752;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 753;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _createbutton(String _eid) throws Exception{
b4j.example.wixbutton _btn = null;
 //BA.debugLineNum = 56;BA.debugLine="Sub CreateButton(eid As String) As WixButton";
 //BA.debugLineNum = 57;BA.debugLine="Dim btn As WixButton";
_btn = new b4j.example.wixbutton();
 //BA.debugLineNum = 58;BA.debugLine="btn.Initialize(eid)";
_btn._initialize /*b4j.example.wixbutton*/ (ba,_eid);
 //BA.debugLineNum = 59;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcarousel  _createcarousel(String _sid) throws Exception{
b4j.example.wixcarousel _btn = null;
 //BA.debugLineNum = 755;BA.debugLine="Sub CreateCarousel(sid As String) As WixCarousel";
 //BA.debugLineNum = 756;BA.debugLine="Dim btn As WixCarousel";
_btn = new b4j.example.wixcarousel();
 //BA.debugLineNum = 757;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.example.wixcarousel*/ (ba,_sid);
 //BA.debugLineNum = 758;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 759;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _createchart(String _sid) throws Exception{
b4j.example.wixchart _btn = null;
 //BA.debugLineNum = 761;BA.debugLine="Sub CreateChart(sid As String) As WixChart";
 //BA.debugLineNum = 762;BA.debugLine="Dim btn As WixChart";
_btn = new b4j.example.wixchart();
 //BA.debugLineNum = 763;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.example.wixchart*/ (ba,_sid);
 //BA.debugLineNum = 764;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 765;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcheckbox  _createcheckbox(String _eid) throws Exception{
b4j.example.wixcheckbox _chk = null;
 //BA.debugLineNum = 63;BA.debugLine="Sub CreateCheckBox(eid As String) As WixCheckBox";
 //BA.debugLineNum = 64;BA.debugLine="Dim chk As WixCheckBox";
_chk = new b4j.example.wixcheckbox();
 //BA.debugLineNum = 65;BA.debugLine="chk.Initialize(eid)";
_chk._initialize /*b4j.example.wixcheckbox*/ (ba,_eid);
 //BA.debugLineNum = 66;BA.debugLine="Return chk";
if (true) return _chk;
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcolorpicker  _createcolorpicker(String _eid) throws Exception{
b4j.example.wixcolorpicker _cp = null;
 //BA.debugLineNum = 70;BA.debugLine="Sub CreateColorPicker(eid As String) As WixColorPi";
 //BA.debugLineNum = 71;BA.debugLine="Dim cp As WixColorPicker";
_cp = new b4j.example.wixcolorpicker();
 //BA.debugLineNum = 72;BA.debugLine="cp.Initialize(eid)";
_cp._initialize /*b4j.example.wixcolorpicker*/ (ba,_eid);
 //BA.debugLineNum = 73;BA.debugLine="Return cp";
if (true) return _cp;
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcolumn  _createcolumn(String _cid) throws Exception{
b4j.example.wixcolumn _c = null;
 //BA.debugLineNum = 35;BA.debugLine="Sub CreateColumn(cid As String) As WixColumn";
 //BA.debugLineNum = 36;BA.debugLine="Dim c As WixColumn";
_c = new b4j.example.wixcolumn();
 //BA.debugLineNum = 37;BA.debugLine="c.Initialize(cid)";
_c._initialize /*b4j.example.wixcolumn*/ (ba,_cid);
 //BA.debugLineNum = 38;BA.debugLine="Return c";
if (true) return _c;
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcombo  _createcombo(String _eid) throws Exception{
b4j.example.wixcombo _cp = null;
 //BA.debugLineNum = 77;BA.debugLine="Sub CreateCombo(eid As String) As WixCombo";
 //BA.debugLineNum = 78;BA.debugLine="Dim cp As WixCombo";
_cp = new b4j.example.wixcombo();
 //BA.debugLineNum = 79;BA.debugLine="cp.Initialize(eid)";
_cp._initialize /*b4j.example.wixcombo*/ (ba,_eid);
 //BA.debugLineNum = 80;BA.debugLine="Return cp";
if (true) return _cp;
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcomments  _createcomments(String _sid) throws Exception{
b4j.example.wixcomments _btn = null;
 //BA.debugLineNum = 767;BA.debugLine="Sub CreateComments(sid As String) As WixComments";
 //BA.debugLineNum = 768;BA.debugLine="Dim btn As WixComments";
_btn = new b4j.example.wixcomments();
 //BA.debugLineNum = 769;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.example.wixcomments*/ (ba,_sid);
 //BA.debugLineNum = 770;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 771;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcontext  _createcontext(String _sid) throws Exception{
b4j.example.wixcontext _btn = null;
 //BA.debugLineNum = 773;BA.debugLine="Sub CreateContext(sid As String) As WixContext";
 //BA.debugLineNum = 774;BA.debugLine="Dim btn As WixContext";
_btn = new b4j.example.wixcontext();
 //BA.debugLineNum = 775;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.example.wixcontext*/ (ba,_sid);
 //BA.debugLineNum = 776;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 777;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcontextmenu  _createcontextmenu(String _sid) throws Exception{
b4j.example.wixcontextmenu _btn = null;
 //BA.debugLineNum = 779;BA.debugLine="Sub CreateContextMenu(sid As String) As WixContext";
 //BA.debugLineNum = 780;BA.debugLine="Dim btn As WixContextMenu";
_btn = new b4j.example.wixcontextmenu();
 //BA.debugLineNum = 781;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.example.wixcontextmenu*/ (ba,_sid);
 //BA.debugLineNum = 782;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 783;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcounter  _createcounter(String _sid) throws Exception{
b4j.example.wixcounter _btn = null;
 //BA.debugLineNum = 785;BA.debugLine="Sub CreateCounter(sid As String) As WixCounter";
 //BA.debugLineNum = 786;BA.debugLine="Dim btn As WixCounter";
_btn = new b4j.example.wixcounter();
 //BA.debugLineNum = 787;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.example.wixcounter*/ (ba,_sid);
 //BA.debugLineNum = 788;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 789;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _createdatatable(String _sid) throws Exception{
b4j.example.wixdatatable _btn = null;
 //BA.debugLineNum = 791;BA.debugLine="Sub CreateDataTable(sid As String) As WixDataTable";
 //BA.debugLineNum = 792;BA.debugLine="Dim btn As WixDataTable";
_btn = new b4j.example.wixdatatable();
 //BA.debugLineNum = 793;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.example.wixdatatable*/ (ba,_sid);
 //BA.debugLineNum = 794;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 795;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdataview  _createdataview(String _sid) throws Exception{
b4j.example.wixdataview _btn = null;
 //BA.debugLineNum = 798;BA.debugLine="Sub CreateDataView(sid As String) As WixDataView";
 //BA.debugLineNum = 799;BA.debugLine="Dim btn As WixDataView";
_btn = new b4j.example.wixdataview();
 //BA.debugLineNum = 800;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.example.wixdataview*/ (ba,_sid);
 //BA.debugLineNum = 801;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 802;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatetimepicker  _createdatetimepicker(String _sid) throws Exception{
b4j.example.wixdatetimepicker _btn = null;
 //BA.debugLineNum = 805;BA.debugLine="Sub CreateDateTimePicker(sid As String) As WixDate";
 //BA.debugLineNum = 806;BA.debugLine="Dim btn As WixDateTimePicker";
_btn = new b4j.example.wixdatetimepicker();
 //BA.debugLineNum = 807;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.example.wixdatetimepicker*/ (ba,_sid);
 //BA.debugLineNum = 808;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 809;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdbllist  _createdbllist(String _sid) throws Exception{
b4j.example.wixdbllist _btn = null;
 //BA.debugLineNum = 812;BA.debugLine="Sub CreateDBLList(sid As String) As WixDBLList";
 //BA.debugLineNum = 813;BA.debugLine="Dim btn As WixDBLList";
_btn = new b4j.example.wixdbllist();
 //BA.debugLineNum = 814;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.example.wixdbllist*/ (ba,_sid);
 //BA.debugLineNum = 815;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 816;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixfieldset  _createfieldset(String _sid) throws Exception{
b4j.example.wixfieldset _btn = null;
 //BA.debugLineNum = 820;BA.debugLine="Sub CreateFieldSet(sid As String) As WixFieldSet";
 //BA.debugLineNum = 821;BA.debugLine="Dim btn As WixFieldSet";
_btn = new b4j.example.wixfieldset();
 //BA.debugLineNum = 822;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.example.wixfieldset*/ (ba,_sid);
 //BA.debugLineNum = 823;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 824;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixflexlayout  _createflexlayout(String _sid) throws Exception{
b4j.example.wixflexlayout _btn = null;
 //BA.debugLineNum = 826;BA.debugLine="Sub CreateFlexLayout(sid As String) As WixFlexLayo";
 //BA.debugLineNum = 827;BA.debugLine="Dim btn As WixFlexLayout";
_btn = new b4j.example.wixflexlayout();
 //BA.debugLineNum = 828;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.example.wixflexlayout*/ (ba,_sid);
 //BA.debugLineNum = 829;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 830;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixform  _createform(String _sid) throws Exception{
b4j.example.wixform _btn = null;
 //BA.debugLineNum = 832;BA.debugLine="Sub CreateForm(sid As String) As WixForm";
 //BA.debugLineNum = 833;BA.debugLine="Dim btn As WixForm";
_btn = new b4j.example.wixform();
 //BA.debugLineNum = 834;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.example.wixform*/ (ba,_sid);
 //BA.debugLineNum = 835;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 836;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixforminput  _createforminput(String _sid) throws Exception{
b4j.example.wixforminput _btn = null;
 //BA.debugLineNum = 839;BA.debugLine="Sub CreateFormInput(sid As String) As WixFormInput";
 //BA.debugLineNum = 840;BA.debugLine="Dim btn As WixFormInput";
_btn = new b4j.example.wixforminput();
 //BA.debugLineNum = 841;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.example.wixforminput*/ (ba,_sid);
 //BA.debugLineNum = 842;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 843;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixgooglemap  _creategooglemap(String _sid) throws Exception{
b4j.example.wixgooglemap _btn = null;
 //BA.debugLineNum = 846;BA.debugLine="Sub CreateGoogleMap(sid As String) As WixGoogleMap";
 //BA.debugLineNum = 847;BA.debugLine="Dim btn As WixGoogleMap";
_btn = new b4j.example.wixgooglemap();
 //BA.debugLineNum = 848;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.example.wixgooglemap*/ (ba,_sid);
 //BA.debugLineNum = 849;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 850;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixgrouplist  _creategrouplist(String _sid) throws Exception{
b4j.example.wixgrouplist _btn = null;
 //BA.debugLineNum = 852;BA.debugLine="Sub CreateGroupList(sid As String) As WixGroupList";
 //BA.debugLineNum = 853;BA.debugLine="Dim btn As WixGroupList";
_btn = new b4j.example.wixgrouplist();
 //BA.debugLineNum = 854;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.example.wixgrouplist*/ (ba,_sid);
 //BA.debugLineNum = 855;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 856;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixheader  _createheader(String _sid) throws Exception{
b4j.example.wixheader _itm = null;
 //BA.debugLineNum = 858;BA.debugLine="Sub CreateHeader(sid As String) As WixHeader";
 //BA.debugLineNum = 859;BA.debugLine="Dim itm As WixHeader";
_itm = new b4j.example.wixheader();
 //BA.debugLineNum = 860;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixheader*/ (ba,_sid);
 //BA.debugLineNum = 861;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 862;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixicon  _createicon(String _sid) throws Exception{
b4j.example.wixicon _btn = null;
 //BA.debugLineNum = 729;BA.debugLine="Sub CreateIcon(sid As String) As WixIcon";
 //BA.debugLineNum = 730;BA.debugLine="Dim btn As WixIcon";
_btn = new b4j.example.wixicon();
 //BA.debugLineNum = 731;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.example.wixicon*/ (ba,_sid);
 //BA.debugLineNum = 732;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 733;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixiframe  _createiframe(String _sid) throws Exception{
b4j.example.wixiframe _itm = null;
 //BA.debugLineNum = 864;BA.debugLine="Sub CreateIFrame(sid As String) As WixIFrame";
 //BA.debugLineNum = 865;BA.debugLine="Dim itm As WixIFrame";
_itm = new b4j.example.wixiframe();
 //BA.debugLineNum = 866;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixiframe*/ (ba,_sid);
 //BA.debugLineNum = 867;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 868;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlabel  _createlabel(String _sid) throws Exception{
b4j.example.wixlabel _lbl = null;
 //BA.debugLineNum = 736;BA.debugLine="Sub CreateLabel(sid As String) As WixLabel";
 //BA.debugLineNum = 737;BA.debugLine="Dim lbl As WixLabel";
_lbl = new b4j.example.wixlabel();
 //BA.debugLineNum = 738;BA.debugLine="lbl.Initialize(sid)";
_lbl._initialize /*b4j.example.wixlabel*/ (ba,_sid);
 //BA.debugLineNum = 739;BA.debugLine="Return lbl";
if (true) return _lbl;
 //BA.debugLineNum = 740;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlayout  _createlayout(String _sid) throws Exception{
b4j.example.wixlayout _itm = null;
 //BA.debugLineNum = 870;BA.debugLine="Sub CreateLayout(sid As String) As WixLayout";
 //BA.debugLineNum = 871;BA.debugLine="Dim itm As WixLayout";
_itm = new b4j.example.wixlayout();
 //BA.debugLineNum = 872;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixlayout*/ (ba,_sid);
 //BA.debugLineNum = 873;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 874;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlist  _createlist(String _sid) throws Exception{
b4j.example.wixlist _itm = null;
 //BA.debugLineNum = 876;BA.debugLine="Sub CreateList(sid As String) As WixList";
 //BA.debugLineNum = 877;BA.debugLine="Dim itm As WixList";
_itm = new b4j.example.wixlist();
 //BA.debugLineNum = 878;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixlist*/ (ba,_sid);
 //BA.debugLineNum = 879;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 880;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmenu  _createmenu(String _sid) throws Exception{
b4j.example.wixmenu _itm = null;
 //BA.debugLineNum = 882;BA.debugLine="Sub CreateMenu(sid As String) As WixMenu";
 //BA.debugLineNum = 883;BA.debugLine="Dim itm As WixMenu";
_itm = new b4j.example.wixmenu();
 //BA.debugLineNum = 884;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixmenu*/ (ba,_sid);
 //BA.debugLineNum = 885;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 886;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmessagebox  _createmessagebox(String _sid) throws Exception{
b4j.example.wixmessagebox _itm = null;
 //BA.debugLineNum = 888;BA.debugLine="Sub CreateMessageBox(sid As String) As WixMessageB";
 //BA.debugLineNum = 889;BA.debugLine="Dim itm As WixMessageBox";
_itm = new b4j.example.wixmessagebox();
 //BA.debugLineNum = 890;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixmessagebox*/ (ba,_sid);
 //BA.debugLineNum = 891;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 892;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmultiview  _createmultiview(String _sid) throws Exception{
b4j.example.wixmultiview _itm = null;
 //BA.debugLineNum = 894;BA.debugLine="Sub CreateMultiView(sid As String) As WixMultiView";
 //BA.debugLineNum = 895;BA.debugLine="Dim itm As WixMultiView";
_itm = new b4j.example.wixmultiview();
 //BA.debugLineNum = 896;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixmultiview*/ (ba,_sid);
 //BA.debugLineNum = 897;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 898;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixpager  _createpager(String _sid) throws Exception{
b4j.example.wixpager _itm = null;
 //BA.debugLineNum = 900;BA.debugLine="Sub CreatePager(sid As String) As WixPager";
 //BA.debugLineNum = 901;BA.debugLine="Dim itm As WixPager";
_itm = new b4j.example.wixpager();
 //BA.debugLineNum = 902;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixpager*/ (ba,_sid);
 //BA.debugLineNum = 903;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 904;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixpopup  _createpopup(String _sid) throws Exception{
b4j.example.wixpopup _itm = null;
 //BA.debugLineNum = 906;BA.debugLine="Sub CreatePopUp(sid As String) As WixPopUp";
 //BA.debugLineNum = 907;BA.debugLine="Dim itm As WixPopUp";
_itm = new b4j.example.wixpopup();
 //BA.debugLineNum = 908;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixpopup*/ (ba,_sid);
 //BA.debugLineNum = 909;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 910;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixportlet  _createportlet(String _sid) throws Exception{
b4j.example.wixportlet _itm = null;
 //BA.debugLineNum = 912;BA.debugLine="Sub CreatePortlet(sid As String) As WixPortlet";
 //BA.debugLineNum = 913;BA.debugLine="Dim itm As WixPortlet";
_itm = new b4j.example.wixportlet();
 //BA.debugLineNum = 914;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixportlet*/ (ba,_sid);
 //BA.debugLineNum = 915;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 916;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixproperty  _createproperty(String _sid) throws Exception{
b4j.example.wixproperty _itm = null;
 //BA.debugLineNum = 918;BA.debugLine="Sub CreateProperty(sid As String) As WixProperty";
 //BA.debugLineNum = 919;BA.debugLine="Dim itm As WixProperty";
_itm = new b4j.example.wixproperty();
 //BA.debugLineNum = 920;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixproperty*/ (ba,_sid);
 //BA.debugLineNum = 921;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 922;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixradio  _createradio(String _sid) throws Exception{
b4j.example.wixradio _itm = null;
 //BA.debugLineNum = 924;BA.debugLine="Sub CreateRadio(sid As String) As WixRadio";
 //BA.debugLineNum = 925;BA.debugLine="Dim itm As WixRadio";
_itm = new b4j.example.wixradio();
 //BA.debugLineNum = 926;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixradio*/ (ba,_sid);
 //BA.debugLineNum = 927;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 928;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrangeslider  _createrangeslider(String _sid) throws Exception{
b4j.example.wixrangeslider _itm = null;
 //BA.debugLineNum = 930;BA.debugLine="Sub CreateRangeSlider(sid As String) As WixRangeSl";
 //BA.debugLineNum = 931;BA.debugLine="Dim itm As WixRangeSlider";
_itm = new b4j.example.wixrangeslider();
 //BA.debugLineNum = 932;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixrangeslider*/ (ba,_sid);
 //BA.debugLineNum = 933;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 934;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixresizer  _createresizer(String _rid) throws Exception{
b4j.example.wixresizer _res1 = null;
 //BA.debugLineNum = 16;BA.debugLine="Sub CreateResizer(rid As String) As WixResizer";
 //BA.debugLineNum = 17;BA.debugLine="Dim res1 As WixResizer";
_res1 = new b4j.example.wixresizer();
 //BA.debugLineNum = 18;BA.debugLine="res1.Initialize(rid)";
_res1._initialize /*b4j.example.wixresizer*/ (ba,_rid);
 //BA.debugLineNum = 19;BA.debugLine="Return res1";
if (true) return _res1;
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrichselect  _createrichselect(String _sid) throws Exception{
b4j.example.wixrichselect _itm = null;
 //BA.debugLineNum = 936;BA.debugLine="Sub CreateRichSelect(sid As String) As WixRichSele";
 //BA.debugLineNum = 937;BA.debugLine="Dim itm As WixRichSelect";
_itm = new b4j.example.wixrichselect();
 //BA.debugLineNum = 938;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixrichselect*/ (ba,_sid);
 //BA.debugLineNum = 939;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 940;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrichtext  _createrichtext(String _sid) throws Exception{
b4j.example.wixrichtext _itm = null;
 //BA.debugLineNum = 942;BA.debugLine="Sub CreateRichText(sid As String) As WixRichText";
 //BA.debugLineNum = 943;BA.debugLine="Dim itm As WixRichText";
_itm = new b4j.example.wixrichtext();
 //BA.debugLineNum = 944;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixrichtext*/ (ba,_sid);
 //BA.debugLineNum = 945;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 946;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrow  _createrow(String _rid) throws Exception{
b4j.example.wixrow _r = null;
 //BA.debugLineNum = 42;BA.debugLine="Sub CreateRow(rid As String) As WixRow";
 //BA.debugLineNum = 43;BA.debugLine="Dim r As WixRow";
_r = new b4j.example.wixrow();
 //BA.debugLineNum = 44;BA.debugLine="r.Initialize(rid)";
_r._initialize /*b4j.example.wixrow*/ (ba,_rid);
 //BA.debugLineNum = 45;BA.debugLine="Return r";
if (true) return _r;
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixscrollview  _createscrollview(String _sid) throws Exception{
b4j.example.wixscrollview _itm = null;
 //BA.debugLineNum = 948;BA.debugLine="Sub CreateScrollView(sid As String) As WixScrollVi";
 //BA.debugLineNum = 949;BA.debugLine="Dim itm As WixScrollView";
_itm = new b4j.example.wixscrollview();
 //BA.debugLineNum = 950;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixscrollview*/ (ba,_sid);
 //BA.debugLineNum = 951;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 952;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsearch  _createsearch(String _sid) throws Exception{
b4j.example.wixsearch _itm = null;
 //BA.debugLineNum = 954;BA.debugLine="Sub CreateSearch(sid As String) As WixSearch";
 //BA.debugLineNum = 955;BA.debugLine="Dim itm As WixSearch";
_itm = new b4j.example.wixsearch();
 //BA.debugLineNum = 956;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixsearch*/ (ba,_sid);
 //BA.debugLineNum = 957;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 958;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsection  _createsection(String _sid) throws Exception{
b4j.example.wixsection _itm = null;
 //BA.debugLineNum = 960;BA.debugLine="Sub CreateSection(sid As String) As WixSection";
 //BA.debugLineNum = 961;BA.debugLine="Dim itm As WixSection";
_itm = new b4j.example.wixsection();
 //BA.debugLineNum = 962;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixsection*/ (ba,_sid);
 //BA.debugLineNum = 963;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 964;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsegmented  _createsegmented(String _sid) throws Exception{
b4j.example.wixsegmented _itm = null;
 //BA.debugLineNum = 966;BA.debugLine="Sub CreateSegmented(sid As String) As WixSegmented";
 //BA.debugLineNum = 967;BA.debugLine="Dim itm As WixSegmented";
_itm = new b4j.example.wixsegmented();
 //BA.debugLineNum = 968;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixsegmented*/ (ba,_sid);
 //BA.debugLineNum = 969;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 970;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixselect  _createselect(String _sid) throws Exception{
b4j.example.wixselect _itm = null;
 //BA.debugLineNum = 972;BA.debugLine="Sub CreateSelect(sid As String) As WixSelect";
 //BA.debugLineNum = 973;BA.debugLine="Dim itm As WixSelect";
_itm = new b4j.example.wixselect();
 //BA.debugLineNum = 974;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixselect*/ (ba,_sid);
 //BA.debugLineNum = 975;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 976;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidebar  _createsidebar(String _sid) throws Exception{
b4j.example.wixsidebar _itm = null;
 //BA.debugLineNum = 978;BA.debugLine="Sub CreateSideBar(sid As String) As WixSideBar";
 //BA.debugLineNum = 979;BA.debugLine="Dim itm As WixSideBar";
_itm = new b4j.example.wixsidebar();
 //BA.debugLineNum = 980;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixsidebar*/ (ba,_sid);
 //BA.debugLineNum = 981;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 982;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidemenu  _createsidemenu(String _sid) throws Exception{
b4j.example.wixsidemenu _itm = null;
 //BA.debugLineNum = 984;BA.debugLine="Sub CreateSideMenu(sid As String) As WixSideMenu";
 //BA.debugLineNum = 985;BA.debugLine="Dim itm As WixSideMenu";
_itm = new b4j.example.wixsidemenu();
 //BA.debugLineNum = 986;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixsidemenu*/ (ba,_sid);
 //BA.debugLineNum = 987;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 988;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixslider  _createslider(String _sid) throws Exception{
b4j.example.wixslider _itm = null;
 //BA.debugLineNum = 990;BA.debugLine="Sub CreateSlider(sid As String) As WixSlider";
 //BA.debugLineNum = 991;BA.debugLine="Dim itm As WixSlider";
_itm = new b4j.example.wixslider();
 //BA.debugLineNum = 992;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixslider*/ (ba,_sid);
 //BA.debugLineNum = 993;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 994;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsuggest  _createsuggest(String _sid) throws Exception{
b4j.example.wixsuggest _itm = null;
 //BA.debugLineNum = 996;BA.debugLine="Sub CreateSuggest(sid As String) As WixSuggest";
 //BA.debugLineNum = 997;BA.debugLine="Dim itm As WixSuggest";
_itm = new b4j.example.wixsuggest();
 //BA.debugLineNum = 998;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixsuggest*/ (ba,_sid);
 //BA.debugLineNum = 999;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1000;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixswitch  _createswitch(String _sid) throws Exception{
b4j.example.wixswitch _itm = null;
 //BA.debugLineNum = 1002;BA.debugLine="Sub CreateSwitch(sid As String) As WixSwitch";
 //BA.debugLineNum = 1003;BA.debugLine="Dim itm As WixSwitch";
_itm = new b4j.example.wixswitch();
 //BA.debugLineNum = 1004;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixswitch*/ (ba,_sid);
 //BA.debugLineNum = 1005;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1006;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtabbar  _createtabbar(String _sid) throws Exception{
b4j.example.wixtabbar _itm = null;
 //BA.debugLineNum = 1008;BA.debugLine="Sub CreateTabBar(sid As String) As WixTabBar";
 //BA.debugLineNum = 1009;BA.debugLine="Dim itm As WixTabBar";
_itm = new b4j.example.wixtabbar();
 //BA.debugLineNum = 1010;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixtabbar*/ (ba,_sid);
 //BA.debugLineNum = 1011;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1012;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtabview  _createtabview(String _sid) throws Exception{
b4j.example.wixtabview _itm = null;
 //BA.debugLineNum = 1014;BA.debugLine="Sub CreateTabView(sid As String) As WixTabView";
 //BA.debugLineNum = 1015;BA.debugLine="Dim itm As WixTabView";
_itm = new b4j.example.wixtabview();
 //BA.debugLineNum = 1016;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixtabview*/ (ba,_sid);
 //BA.debugLineNum = 1017;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1018;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtemplate  _createtemplate(String _sid) throws Exception{
b4j.example.wixtemplate _itm = null;
 //BA.debugLineNum = 1020;BA.debugLine="Sub CreateTemplate(sid As String) As WixTemplate";
 //BA.debugLineNum = 1021;BA.debugLine="Dim itm As WixTemplate";
_itm = new b4j.example.wixtemplate();
 //BA.debugLineNum = 1022;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixtemplate*/ (ba,_sid);
 //BA.debugLineNum = 1023;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1024;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtext  _createtext(String _sid) throws Exception{
b4j.example.wixtext _itm = null;
 //BA.debugLineNum = 1026;BA.debugLine="Sub CreateText(sid As String) As WixText";
 //BA.debugLineNum = 1027;BA.debugLine="Dim itm As WixText";
_itm = new b4j.example.wixtext();
 //BA.debugLineNum = 1028;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixtext*/ (ba,_sid);
 //BA.debugLineNum = 1029;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1030;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _createtextarea(String _sid) throws Exception{
b4j.example.wixtextarea _itm = null;
 //BA.debugLineNum = 1032;BA.debugLine="Sub CreateTextArea(sid As String) As WixTextArea";
 //BA.debugLineNum = 1033;BA.debugLine="Dim itm As WixTextArea";
_itm = new b4j.example.wixtextarea();
 //BA.debugLineNum = 1034;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixtextarea*/ (ba,_sid);
 //BA.debugLineNum = 1035;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1036;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtext  _createtextbox(String _eid) throws Exception{
b4j.example.wixtext _txtbox = null;
 //BA.debugLineNum = 49;BA.debugLine="Sub CreateTextBox(eid As String) As WixText";
 //BA.debugLineNum = 50;BA.debugLine="Dim txtbox As WixText";
_txtbox = new b4j.example.wixtext();
 //BA.debugLineNum = 51;BA.debugLine="txtbox.Initialize(eid)";
_txtbox._initialize /*b4j.example.wixtext*/ (ba,_eid);
 //BA.debugLineNum = 52;BA.debugLine="Return txtbox";
if (true) return _txtbox;
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoggle  _createtoggle(String _sid) throws Exception{
b4j.example.wixtoggle _btn = null;
 //BA.debugLineNum = 743;BA.debugLine="Sub CreateToggle(sid As String) As WixToggle";
 //BA.debugLineNum = 744;BA.debugLine="Dim btn As WixToggle";
_btn = new b4j.example.wixtoggle();
 //BA.debugLineNum = 745;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.example.wixtoggle*/ (ba,_sid);
 //BA.debugLineNum = 746;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 747;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoolbar  _createtoolbar(String _sid) throws Exception{
b4j.example.wixtoolbar _itm = null;
 //BA.debugLineNum = 1038;BA.debugLine="Sub CreateToolBar(sid As String) As WixToolBar";
 //BA.debugLineNum = 1039;BA.debugLine="Dim itm As WixToolBar";
_itm = new b4j.example.wixtoolbar();
 //BA.debugLineNum = 1040;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixtoolbar*/ (ba,_sid);
 //BA.debugLineNum = 1041;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1042;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtree  _createtree(String _sid) throws Exception{
b4j.example.wixtree _itm = null;
 //BA.debugLineNum = 1044;BA.debugLine="Sub CreateTree(sid As String) As WixTree";
 //BA.debugLineNum = 1045;BA.debugLine="Dim itm As WixTree";
_itm = new b4j.example.wixtree();
 //BA.debugLineNum = 1046;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixtree*/ (ba,_sid);
 //BA.debugLineNum = 1047;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1048;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtreetable  _createtreetable(String _sid) throws Exception{
b4j.example.wixtreetable _itm = null;
 //BA.debugLineNum = 1050;BA.debugLine="Sub CreateTreeTable(sid As String) As WixTreeTable";
 //BA.debugLineNum = 1051;BA.debugLine="Dim itm As WixTreeTable";
_itm = new b4j.example.wixtreetable();
 //BA.debugLineNum = 1052;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixtreetable*/ (ba,_sid);
 //BA.debugLineNum = 1053;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1054;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixunitlist  _createunitlist(String _sid) throws Exception{
b4j.example.wixunitlist _itm = null;
 //BA.debugLineNum = 1056;BA.debugLine="Sub CreateUnitList(sid As String) As WixUnitList";
 //BA.debugLineNum = 1057;BA.debugLine="Dim itm As WixUnitList";
_itm = new b4j.example.wixunitlist();
 //BA.debugLineNum = 1058;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixunitlist*/ (ba,_sid);
 //BA.debugLineNum = 1059;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1060;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixuploader  _createuploader(String _sid) throws Exception{
b4j.example.wixuploader _itm = null;
 //BA.debugLineNum = 1062;BA.debugLine="Sub CreateUploader(sid As String) As WixUploader";
 //BA.debugLineNum = 1063;BA.debugLine="Dim itm As WixUploader";
_itm = new b4j.example.wixuploader();
 //BA.debugLineNum = 1064;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixuploader*/ (ba,_sid);
 //BA.debugLineNum = 1065;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1066;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixvideo  _createvideo(String _sid) throws Exception{
b4j.example.wixvideo _itm = null;
 //BA.debugLineNum = 1068;BA.debugLine="Sub CreateVideo(sid As String) As WixVideo";
 //BA.debugLineNum = 1069;BA.debugLine="Dim itm As WixVideo";
_itm = new b4j.example.wixvideo();
 //BA.debugLineNum = 1070;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixvideo*/ (ba,_sid);
 //BA.debugLineNum = 1071;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1072;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixwindow  _createwindow(String _sid) throws Exception{
b4j.example.wixwindow _itm = null;
 //BA.debugLineNum = 1074;BA.debugLine="Sub CreateWindow(sid As String) As WixWindow";
 //BA.debugLineNum = 1075;BA.debugLine="Dim itm As WixWindow";
_itm = new b4j.example.wixwindow();
 //BA.debugLineNum = 1076;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixwindow*/ (ba,_sid);
 //BA.debugLineNum = 1077;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1078;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 177;BA.debugLine="Public Sub Initialize(sID As String) As WixElement";
 //BA.debugLineNum = 178;BA.debugLine="ID = sID.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 179;BA.debugLine="Cells.Initialize";
_cells.Initialize();
 //BA.debugLineNum = 180;BA.debugLine="Cols.Initialize";
_cols.Initialize();
 //BA.debugLineNum = 181;BA.debugLine="elementsConfig.Initialize";
_elementsconfig.Initialize();
 //BA.debugLineNum = 182;BA.debugLine="Styles.Initialize";
_styles.Initialize();
 //BA.debugLineNum = 183;BA.debugLine="Element = CreateMap(\"id\":ID)";
_element = __c.createMap(new Object[] {(Object)("id"),(Object)(_id)});
 //BA.debugLineNum = 184;BA.debugLine="Rows.Initialize";
_rows.Initialize();
 //BA.debugLineNum = 185;BA.debugLine="Elements.Initialize";
_elements.Initialize();
 //BA.debugLineNum = 186;BA.debugLine="Columns.Initialize";
_columns.Initialize();
 //BA.debugLineNum = 187;BA.debugLine="Attributes.Initialize";
_attributes.Initialize();
 //BA.debugLineNum = 188;BA.debugLine="HTMLAttributes.Initialize";
_htmlattributes.Initialize();
 //BA.debugLineNum = 189;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 190;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
String _attr = "";
Object _strval = null;
 //BA.debugLineNum = 447;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 448;BA.debugLine="For Each attr As String In Attributes.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attributes.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_attr = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 449;BA.debugLine="Dim strVal As Object = Attributes.Get(attr)";
_strval = _attributes.Get((Object)(_attr));
 //BA.debugLineNum = 450;BA.debugLine="Element.Put(attr,strVal)";
_element.Put((Object)(_attr),_strval);
 }
};
 //BA.debugLineNum = 452;BA.debugLine="SetOnCondition(Columns.Size,\"columns\", Columns)";
_setoncondition(_columns.getSize(),"columns",(Object)(_columns.getObject()));
 //BA.debugLineNum = 453;BA.debugLine="SetOnCondition(Cols.Size, \"cols\", Cols)";
_setoncondition(_cols.getSize(),"cols",(Object)(_cols.getObject()));
 //BA.debugLineNum = 454;BA.debugLine="SetOnCondition(Rows.Size, \"rows\", Rows)";
_setoncondition(_rows.getSize(),"rows",(Object)(_rows.getObject()));
 //BA.debugLineNum = 455;BA.debugLine="SetOnCondition(Elements.Size, \"elements\", Element";
_setoncondition(_elements.getSize(),"elements",(Object)(_elements.getObject()));
 //BA.debugLineNum = 456;BA.debugLine="SetOnCondition(Cells.Size, \"cells\", Cells)";
_setoncondition(_cells.getSize(),"cells",(Object)(_cells.getObject()));
 //BA.debugLineNum = 457;BA.debugLine="SetOnCondition(HTMLAttributes.Size, \"attributes\",";
_setoncondition(_htmlattributes.getSize(),"attributes",(Object)(_htmlattributes.getObject()));
 //BA.debugLineNum = 458;BA.debugLine="SetOnCondition(elementsConfig.Size, \"elementsConf";
_setoncondition(_elementsconfig.getSize(),"elementsConfig",(Object)(_elementsconfig.getObject()));
 //BA.debugLineNum = 459;BA.debugLine="SetOnCondition(Styles.Size, \"css\", Styles)";
_setoncondition(_styles.getSize(),"css",(Object)(_styles.getObject()));
 //BA.debugLineNum = 460;BA.debugLine="Return Element";
if (true) return _element;
 //BA.debugLineNum = 461;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setalign(String _r) throws Exception{
 //BA.debugLineNum = 620;BA.debugLine="Sub SetAlign(r As String) As WixElement 'ignore";
 //BA.debugLineNum = 621;BA.debugLine="SetAttr(\"align\", r)";
_setattr("align",(Object)(_r));
 //BA.debugLineNum = 622;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 623;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 608;BA.debugLine="Sub SetAlignCenter(r As String) As WixElement 'ign";
 //BA.debugLineNum = 609;BA.debugLine="SetAlign(\"center\")";
_setalign("center");
 //BA.debugLineNum = 610;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 611;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 614;BA.debugLine="Sub SetAlignLeft(r As String) As WixElement 'ignor";
 //BA.debugLineNum = 615;BA.debugLine="SetAlign(\"left\")";
_setalign("left");
 //BA.debugLineNum = 616;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 617;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 602;BA.debugLine="Sub SetAlignRight(r As String) As WixElement 'igno";
 //BA.debugLineNum = 603;BA.debugLine="SetAlign(\"right\")";
_setalign("right");
 //BA.debugLineNum = 604;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 605;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setanimate(boolean _b) throws Exception{
 //BA.debugLineNum = 296;BA.debugLine="Sub SetAnimate(b As Boolean) As WixElement";
 //BA.debugLineNum = 297;BA.debugLine="SetProperty(\"animate\",b)";
_setproperty("animate",(Object)(_b));
 //BA.debugLineNum = 298;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 299;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setattr(String _p,Object _v) throws Exception{
 //BA.debugLineNum = 435;BA.debugLine="Sub SetAttr(p As String, v As Object) As WixElemen";
 //BA.debugLineNum = 436;BA.debugLine="Element.Put(p,v)";
_element.Put((Object)(_p),_v);
 //BA.debugLineNum = 437;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 438;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setautoheight(boolean _b) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub SetAutoHeight(b As Boolean) As WixElement";
 //BA.debugLineNum = 92;BA.debugLine="SetAttr(\"autoheight\", b)";
_setattr("autoheight",(Object)(_b));
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setautowidth(boolean _b) throws Exception{
 //BA.debugLineNum = 116;BA.debugLine="Sub SetAutoWidth(b As Boolean) As WixElement";
 //BA.debugLineNum = 117;BA.debugLine="SetAttr(\"autowidth\", b)";
_setattr("autowidth",(Object)(_b));
 //BA.debugLineNum = 118;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setbatch(int _b) throws Exception{
 //BA.debugLineNum = 290;BA.debugLine="Sub SetBatch(b As Int) As WixElement";
 //BA.debugLineNum = 291;BA.debugLine="SetProperty(\"batch\",b)";
_setproperty("batch",(Object)(_b));
 //BA.debugLineNum = 292;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 293;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setbody(Object _b) throws Exception{
 //BA.debugLineNum = 387;BA.debugLine="Sub SetBody(b As Object) As WixElement";
 //BA.debugLineNum = 388;BA.debugLine="SetAttr(\"body\", b)";
_setattr("body",_b);
 //BA.debugLineNum = 389;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 390;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setborderless(boolean _b) throws Exception{
 //BA.debugLineNum = 153;BA.debugLine="Sub SetBorderLess(b As Boolean) As WixElement";
 //BA.debugLineNum = 154;BA.debugLine="SetProperty(\"borderless\", b)";
_setproperty("borderless",(Object)(_b));
 //BA.debugLineNum = 155;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 156;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setclick(com.ab.banano.BANanoObject _c) throws Exception{
 //BA.debugLineNum = 482;BA.debugLine="Sub SetClick(c As BANanoObject) As WixElement";
 //BA.debugLineNum = 483;BA.debugLine="Element.Put(\"click\", c)";
_element.Put((Object)("click"),(Object)(_c));
 //BA.debugLineNum = 484;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 485;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setcollapsed(boolean _c) throws Exception{
 //BA.debugLineNum = 693;BA.debugLine="Sub SetCollapsed(c As Boolean) As WixElement";
 //BA.debugLineNum = 694;BA.debugLine="SetProperty(\"collapsed\", c)";
_setproperty("collapsed",(Object)(_c));
 //BA.debugLineNum = 695;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 696;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setcontainer(String _c) throws Exception{
 //BA.debugLineNum = 147;BA.debugLine="Sub SetContainer(c As String) As WixElement";
 //BA.debugLineNum = 148;BA.debugLine="SetAttr(\"container\", c)";
_setattr("container",(Object)(_c));
 //BA.debugLineNum = 149;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setcss(String _cs) throws Exception{
 //BA.debugLineNum = 429;BA.debugLine="Sub SetCSS(cs As String) As WixElement";
 //BA.debugLineNum = 430;BA.debugLine="SetAttr(\"css\", cs)";
_setattr("css",(Object)(_cs));
 //BA.debugLineNum = 431;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 432;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setdata(anywheresoftware.b4a.objects.collections.List _d) throws Exception{
 //BA.debugLineNum = 375;BA.debugLine="Sub SetData(d As List) As WixElement";
 //BA.debugLineNum = 376;BA.debugLine="Element.Put(\"data\", d)";
_element.Put((Object)("data"),(Object)(_d.getObject()));
 //BA.debugLineNum = 377;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 378;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setdefaultalign(String _a) throws Exception{
 //BA.debugLineNum = 261;BA.debugLine="Sub SetDefaultAlign(a As String) As WixElement";
 //BA.debugLineNum = 262;BA.debugLine="elementsConfig.Put(\"align\", a)";
_elementsconfig.Put((Object)("align"),(Object)(_a));
 //BA.debugLineNum = 263;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 264;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setdefaultbottompadding(int _w) throws Exception{
 //BA.debugLineNum = 278;BA.debugLine="Sub SetDefaultBottomPadding(w As Int) As WixElemen";
 //BA.debugLineNum = 279;BA.debugLine="elementsConfig.Put(\"bottomPadding\", w)";
_elementsconfig.Put((Object)("bottomPadding"),(Object)(_w));
 //BA.debugLineNum = 280;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 281;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setdefaultheight(int _h) throws Exception{
 //BA.debugLineNum = 273;BA.debugLine="Sub SetDefaultHeight(h As Int) As WixElement";
 //BA.debugLineNum = 274;BA.debugLine="elementsConfig.Put(\"height\", h)";
_elementsconfig.Put((Object)("height"),(Object)(_h));
 //BA.debugLineNum = 275;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 276;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setdefaultlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 242;BA.debugLine="Sub SetDefaultLabelAlign(a As String) As WixElemen";
 //BA.debugLineNum = 243;BA.debugLine="elementsConfig.Put(\"labelAlign\", a)";
_elementsconfig.Put((Object)("labelAlign"),(Object)(_a));
 //BA.debugLineNum = 244;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 245;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setdefaultlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 255;BA.debugLine="Sub SetDefaultLabelPosition(p As String) As WixEle";
 //BA.debugLineNum = 256;BA.debugLine="elementsConfig.Put(\"labelPosition\", p)";
_elementsconfig.Put((Object)("labelPosition"),(Object)(_p));
 //BA.debugLineNum = 257;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 258;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setdefaultlabelwidth(int _a) throws Exception{
 //BA.debugLineNum = 248;BA.debugLine="Sub SetDefaultLabelWidth(a As Int) As WixElement";
 //BA.debugLineNum = 249;BA.debugLine="elementsConfig.Put(\"labelWidth\", a)";
_elementsconfig.Put((Object)("labelWidth"),(Object)(_a));
 //BA.debugLineNum = 250;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 251;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setdefaulttype(String _a) throws Exception{
 //BA.debugLineNum = 218;BA.debugLine="Sub SetDefaultType(a As String) As WixElement";
 //BA.debugLineNum = 219;BA.debugLine="elementsConfig.Put(\"type\", a)";
_elementsconfig.Put((Object)("type"),(Object)(_a));
 //BA.debugLineNum = 220;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 221;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setdefaulttypeicon(String _r) throws Exception{
 //BA.debugLineNum = 717;BA.debugLine="Sub SetDefaultTypeIcon(r As String) As WixElement";
 //BA.debugLineNum = 718;BA.debugLine="SetDefaultType(\"icon\")";
_setdefaulttype("icon");
 //BA.debugLineNum = 719;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 720;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setdefaulttypeiconbutton(String _r) throws Exception{
 //BA.debugLineNum = 699;BA.debugLine="Sub SetDefaultTypeIconButton(r As String) As WixEl";
 //BA.debugLineNum = 700;BA.debugLine="SetDefaultType(\"iconButton\")";
_setdefaulttype("iconButton");
 //BA.debugLineNum = 701;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 702;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setdefaulttypeiconbuttontop(String _r) throws Exception{
 //BA.debugLineNum = 723;BA.debugLine="Sub SetDefaultTypeIconButtonTop(r As String) As Wi";
 //BA.debugLineNum = 724;BA.debugLine="SetDefaultType(\"iconButtonTop\")";
_setdefaulttype("iconButtonTop");
 //BA.debugLineNum = 725;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 726;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setdefaulttypeimage(String _r) throws Exception{
 //BA.debugLineNum = 711;BA.debugLine="Sub SetDefaultTypeImage(r As String) As WixElement";
 //BA.debugLineNum = 712;BA.debugLine="SetDefaultType(\"image\")";
_setdefaulttype("image");
 //BA.debugLineNum = 713;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 714;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setdefaulttypeimagebutton(String _r) throws Exception{
 //BA.debugLineNum = 705;BA.debugLine="Sub SetDefaultTypeImageButton(r As String) As WixE";
 //BA.debugLineNum = 706;BA.debugLine="SetDefaultType(\"imageButton\")";
_setdefaulttype("imageButton");
 //BA.debugLineNum = 707;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 708;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setdefaultview(String _a) throws Exception{
 //BA.debugLineNum = 212;BA.debugLine="Sub SetDefaultView(a As String) As WixElement";
 //BA.debugLineNum = 213;BA.debugLine="elementsConfig.Put(\"view\", a)";
_elementsconfig.Put((Object)("view"),(Object)(_a));
 //BA.debugLineNum = 214;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 215;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setdefaultwidth(int _w) throws Exception{
 //BA.debugLineNum = 267;BA.debugLine="Sub SetDefaultWidth(w As Int) As WixElement";
 //BA.debugLineNum = 268;BA.debugLine="elementsConfig.Put(\"width\", w)";
_elementsconfig.Put((Object)("width"),(Object)(_w));
 //BA.debugLineNum = 269;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 270;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setgravity(int _g) throws Exception{
 //BA.debugLineNum = 393;BA.debugLine="Sub SetGravity(g As Int) As WixElement";
 //BA.debugLineNum = 394;BA.debugLine="SetAttr(\"gravity\", g)";
_setattr("gravity",(Object)(_g));
 //BA.debugLineNum = 395;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 396;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setheader(Object _h) throws Exception{
 //BA.debugLineNum = 381;BA.debugLine="Sub SetHeader(h As Object) As WixElement";
 //BA.debugLineNum = 382;BA.debugLine="SetAttr(\"header\", h)";
_setattr("header",_h);
 //BA.debugLineNum = 383;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 384;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 417;BA.debugLine="Sub SetHeight(h As Object) As WixElement";
 //BA.debugLineNum = 418;BA.debugLine="SetAttr(\"height\", h)";
_setattr("height",_h);
 //BA.debugLineNum = 419;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 420;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _sethidden(boolean _b) throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Sub SetHidden(b As Boolean) As WixElement";
 //BA.debugLineNum = 24;BA.debugLine="SetAttr(\"hidden\", b)";
_setattr("hidden",(Object)(_b));
 //BA.debugLineNum = 25;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _sethtmlattr(String _attrname,Object _attrvalue) throws Exception{
 //BA.debugLineNum = 441;BA.debugLine="Sub SetHTMLAttr(attrName As String, attrValue As O";
 //BA.debugLineNum = 442;BA.debugLine="HTMLAttributes.put(attrName,attrValue)";
_htmlattributes.Put((Object)(_attrname),_attrvalue);
 //BA.debugLineNum = 443;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 444;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _seticon(String _i) throws Exception{
 //BA.debugLineNum = 470;BA.debugLine="Sub SetIcon(i As String) As WixElement";
 //BA.debugLineNum = 471;BA.debugLine="SetAttr(\"icon\", i)";
_setattr("icon",(Object)(_i));
 //BA.debugLineNum = 472;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 473;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setinputwidth(int _w) throws Exception{
 //BA.debugLineNum = 338;BA.debugLine="Sub SetInputWidth(w As Int) As WixElement";
 //BA.debugLineNum = 339;BA.debugLine="SetProperty(\"inputWidth\", w)";
_setproperty("inputWidth",(Object)(_w));
 //BA.debugLineNum = 340;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 341;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 476;BA.debugLine="Sub SetLabel(l As String) As WixElement";
 //BA.debugLineNum = 477;BA.debugLine="SetAttr(\"label\", l)";
_setattr("label",(Object)(_l));
 //BA.debugLineNum = 478;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 479;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 224;BA.debugLine="Sub SetLabelAlign(a As String) As WixElement";
 //BA.debugLineNum = 225;BA.debugLine="SetAttr(\"labelAlign\", a)";
_setattr("labelAlign",(Object)(_a));
 //BA.debugLineNum = 226;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 227;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setlabelheight(int _h) throws Exception{
 //BA.debugLineNum = 165;BA.debugLine="Sub SetLabelHeight(h As Int) As WixElement";
 //BA.debugLineNum = 166;BA.debugLine="SetProperty(\"labelHeight\", h)";
_setproperty("labelHeight",(Object)(_h));
 //BA.debugLineNum = 167;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 236;BA.debugLine="Sub SetLabelPosition(p As String) As WixElement";
 //BA.debugLineNum = 237;BA.debugLine="SetAttr(\"labelPosition\", p)";
_setattr("labelPosition",(Object)(_p));
 //BA.debugLineNum = 238;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 239;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setlabelwidth(int _a) throws Exception{
 //BA.debugLineNum = 230;BA.debugLine="Sub SetLabelWidth(a As Int) As WixElement";
 //BA.debugLineNum = 231;BA.debugLine="SetAttr(\"labelWidth\", a)";
_setattr("labelWidth",(Object)(_a));
 //BA.debugLineNum = 232;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 233;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setlocalid(String _i) throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Sub SetLocalID(i As String) As WixElement";
 //BA.debugLineNum = 30;BA.debugLine="SetAttr(\"localId\", i)";
_setattr("localId",(Object)(_i));
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 567;BA.debugLine="Sub SetMap(m As Map) As WixElement";
 //BA.debugLineNum = 568;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 569;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 570;BA.debugLine="SetAttr(strKey,	strVal)";
_setattr(_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 572;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 573;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setmargin(String _margin) throws Exception{
 //BA.debugLineNum = 332;BA.debugLine="Sub SetMargin(margin As String) As WixElement";
 //BA.debugLineNum = 333;BA.debugLine="Element.Put(\"margin\", margin)";
_element.Put((Object)("margin"),(Object)(_margin));
 //BA.debugLineNum = 334;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 335;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setmaxheight(int _h) throws Exception{
 //BA.debugLineNum = 326;BA.debugLine="Sub SetMaxHeight(h As Int) As WixElement";
 //BA.debugLineNum = 327;BA.debugLine="Element.Put(\"maxHeight\", h)";
_element.Put((Object)("maxHeight"),(Object)(_h));
 //BA.debugLineNum = 328;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 329;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setmaxwidth(int _w) throws Exception{
 //BA.debugLineNum = 320;BA.debugLine="Sub SetMaxWidth(w As Int) As WixElement";
 //BA.debugLineNum = 321;BA.debugLine="Element.Put(\"maxWidth\", w)";
_element.Put((Object)("maxWidth"),(Object)(_w));
 //BA.debugLineNum = 322;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 323;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 314;BA.debugLine="Sub SetMinHeight(h As Int) As WixElement";
 //BA.debugLineNum = 315;BA.debugLine="Element.Put(\"minHeight\", h)";
_element.Put((Object)("minHeight"),(Object)(_h));
 //BA.debugLineNum = 316;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 317;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 308;BA.debugLine="Sub SetMinWidth(w As Int) As WixElement";
 //BA.debugLineNum = 309;BA.debugLine="Element.put(\"minwidth\",w)";
_element.Put((Object)("minwidth"),(Object)(_w));
 //BA.debugLineNum = 310;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 311;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setmultiview(boolean _b) throws Exception{
 //BA.debugLineNum = 464;BA.debugLine="Sub SetMultiView(b As Boolean) As WixElement";
 //BA.debugLineNum = 465;BA.debugLine="SetProperty(\"multiview\", b)";
_setproperty("multiview",(Object)(_b));
 //BA.debugLineNum = 466;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 467;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setname(String _n) throws Exception{
 //BA.debugLineNum = 200;BA.debugLine="Sub SetName(n As String) As WixElement";
 //BA.debugLineNum = 201;BA.debugLine="SetProperty(\"name\", n)";
_setproperty("name",(Object)(_n));
 //BA.debugLineNum = 202;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 203;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setoncondition(int _condition,String _prop,Object _propvalue) throws Exception{
 //BA.debugLineNum = 638;BA.debugLine="Sub SetOnCondition(Condition As Int, Prop As Strin";
 //BA.debugLineNum = 639;BA.debugLine="If Condition <= 0 Then Return Me";
if (_condition<=0) { 
if (true) return (b4j.example.wixelement)(this);};
 //BA.debugLineNum = 640;BA.debugLine="Element.put(Prop,PropValue)";
_element.Put((Object)(_prop),_propvalue);
 //BA.debugLineNum = 641;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 642;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setpadding(String _padding) throws Exception{
 //BA.debugLineNum = 344;BA.debugLine="Sub SetPadding(padding As String) As WixElement";
 //BA.debugLineNum = 345;BA.debugLine="Element.Put(\"padding\", padding)";
_element.Put((Object)("padding"),(Object)(_padding));
 //BA.debugLineNum = 346;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 347;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setpaddingx(String _x) throws Exception{
 //BA.debugLineNum = 357;BA.debugLine="Sub SetPaddingX(x As String) As WixElement";
 //BA.debugLineNum = 358;BA.debugLine="Element.Put(\"paddingX\", x)";
_element.Put((Object)("paddingX"),(Object)(_x));
 //BA.debugLineNum = 359;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 360;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setpaddingy(String _y) throws Exception{
 //BA.debugLineNum = 363;BA.debugLine="Sub SetPaddingY(y As String) As WixElement";
 //BA.debugLineNum = 364;BA.debugLine="Element.Put(\"paddingY\",y)";
_element.Put((Object)("paddingY"),(Object)(_y));
 //BA.debugLineNum = 365;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 366;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setplaceholder(String _p) throws Exception{
 //BA.debugLineNum = 351;BA.debugLine="Sub SetPlaceHolder(p As String) As WixElement";
 //BA.debugLineNum = 352;BA.debugLine="Element.Put(\"placeHolder\", p)";
_element.Put((Object)("placeHolder"),(Object)(_p));
 //BA.debugLineNum = 353;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 354;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setproperty(String _p,Object _v) throws Exception{
 //BA.debugLineNum = 369;BA.debugLine="Sub SetProperty(p As String, v As Object) As WixEl";
 //BA.debugLineNum = 370;BA.debugLine="Element.Put(p,v)";
_element.Put((Object)(_p),_v);
 //BA.debugLineNum = 371;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 372;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setrequired(boolean _b) throws Exception{
 //BA.debugLineNum = 206;BA.debugLine="Sub SetRequired(b As Boolean) As WixElement";
 //BA.debugLineNum = 207;BA.debugLine="SetProperty(\"required\", b)";
_setproperty("required",(Object)(_b));
 //BA.debugLineNum = 208;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 209;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Sub SetResponsive(b As Object) As WixElement";
 //BA.debugLineNum = 105;BA.debugLine="SetAttr(\"responsive\", b)";
_setattr("responsive",_b);
 //BA.debugLineNum = 106;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixElement";
 //BA.debugLineNum = 111;BA.debugLine="SetAttr(\"responsiveCell\", b)";
_setattr("responsiveCell",_b);
 //BA.debugLineNum = 112;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setscroll(Object _c) throws Exception{
 //BA.debugLineNum = 129;BA.debugLine="Sub SetScroll(c As Object) As WixElement";
 //BA.debugLineNum = 130;BA.debugLine="SetAttr(\"scroll\", c)";
_setattr("scroll",_c);
 //BA.debugLineNum = 131;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setscrollx(Object _b) throws Exception{
 //BA.debugLineNum = 141;BA.debugLine="Sub SetScrollX(b As Object) As WixElement";
 //BA.debugLineNum = 142;BA.debugLine="SetAttr(\"scrollX\", b)";
_setattr("scrollX",_b);
 //BA.debugLineNum = 143;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setscrolly(Object _b) throws Exception{
 //BA.debugLineNum = 135;BA.debugLine="Sub SetScrollY(b As Object) As WixElement";
 //BA.debugLineNum = 136;BA.debugLine="SetAttr(\"scrollY\", b)";
_setattr("scrollY",_b);
 //BA.debugLineNum = 137;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setselect(boolean _b) throws Exception{
 //BA.debugLineNum = 159;BA.debugLine="Sub SetSelect(b As Boolean) As WixElement";
 //BA.debugLineNum = 160;BA.debugLine="SetProperty(\"select\", b)";
_setproperty("select",(Object)(_b));
 //BA.debugLineNum = 161;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 162;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setstate(Object _s) throws Exception{
 //BA.debugLineNum = 194;BA.debugLine="Sub SetState(s As Object) As WixElement";
 //BA.debugLineNum = 195;BA.debugLine="SetAttr(\"state\", s)";
_setattr("state",_s);
 //BA.debugLineNum = 196;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 197;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 302;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 303;BA.debugLine="Styles.Put(prop,val)";
_styles.Put((Object)(_prop),(Object)(_val));
 //BA.debugLineNum = 304;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 305;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setsuggest(Object _s) throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Sub SetSuggest(s As Object) As WixElement";
 //BA.debugLineNum = 124;BA.debugLine="SetAttr(\"suggest\", s)";
_setattr("suggest",_s);
 //BA.debugLineNum = 125;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _settemplate(Object _t) throws Exception{
 //BA.debugLineNum = 496;BA.debugLine="Sub SetTemplate(t As Object) As WixElement";
 //BA.debugLineNum = 497;BA.debugLine="Element.Put(\"template\", t)";
_element.Put((Object)("template"),_t);
 //BA.debugLineNum = 498;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 499;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 97;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixElement";
 //BA.debugLineNum = 98;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 99;BA.debugLine="SetTemplate(os)";
_settemplate((Object)(_os));
 //BA.debugLineNum = 100;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 171;BA.debugLine="Sub SetTooltip(tt As String) As WixElement";
 //BA.debugLineNum = 172;BA.debugLine="SetProperty(\"tooltip\", tt)";
_setproperty("tooltip",(Object)(_tt));
 //BA.debugLineNum = 173;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _settype(String _t) throws Exception{
 //BA.debugLineNum = 411;BA.debugLine="Sub SetType(t As String) As WixElement";
 //BA.debugLineNum = 412;BA.debugLine="SetAttr(\"type\", t)";
_setattr("type",(Object)(_t));
 //BA.debugLineNum = 413;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 414;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _settypeclean(String _r) throws Exception{
 //BA.debugLineNum = 645;BA.debugLine="Sub SetTypeClean(r As String) As WixElement  'igno";
 //BA.debugLineNum = 646;BA.debugLine="SetType(\"clean\")";
_settype("clean");
 //BA.debugLineNum = 647;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 648;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _settypeform(String _r) throws Exception{
 //BA.debugLineNum = 675;BA.debugLine="Sub SetTypeForm(r As String) As WixElement		'ignor";
 //BA.debugLineNum = 676;BA.debugLine="SetType(\"form\")";
_settype("form");
 //BA.debugLineNum = 677;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 678;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _settypehead(String _r) throws Exception{
 //BA.debugLineNum = 669;BA.debugLine="Sub SetTypeHead(r As String) As WixElement		'ignor";
 //BA.debugLineNum = 670;BA.debugLine="SetType(\"head\")";
_settype("head");
 //BA.debugLineNum = 671;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 672;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _settypeline(String _r) throws Exception{
 //BA.debugLineNum = 651;BA.debugLine="Sub SetTypeLine(r As String) As WixElement   'igno";
 //BA.debugLineNum = 652;BA.debugLine="SetType(\"line\")";
_settype("line");
 //BA.debugLineNum = 653;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 654;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _settypespace(String _r) throws Exception{
 //BA.debugLineNum = 663;BA.debugLine="Sub SetTypeSpace(r As String) As WixElement   'ign";
 //BA.debugLineNum = 664;BA.debugLine="SetType(\"space\")";
_settype("space");
 //BA.debugLineNum = 665;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 666;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _settypewide(String _r) throws Exception{
 //BA.debugLineNum = 657;BA.debugLine="Sub SetTypeWide(r As String) As WixElement   'igno";
 //BA.debugLineNum = 658;BA.debugLine="SetType(\"wide\")";
_settype("wide");
 //BA.debugLineNum = 659;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 660;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 405;BA.debugLine="Sub SetValue(v As String) As WixElement";
 //BA.debugLineNum = 406;BA.debugLine="SetAttr(\"value\", v)";
_setattr("value",(Object)(_v));
 //BA.debugLineNum = 407;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 408;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setview(String _v) throws Exception{
 //BA.debugLineNum = 399;BA.debugLine="Sub SetView(v As String) As WixElement";
 //BA.debugLineNum = 400;BA.debugLine="SetAttr(\"view\", v)";
_setattr("view",(Object)(_v));
 //BA.debugLineNum = 401;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 402;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setviewheaderlayout(String _r) throws Exception{
 //BA.debugLineNum = 682;BA.debugLine="Sub SetViewHeaderLayout(r As String) As WixElement";
 //BA.debugLineNum = 683;BA.debugLine="SetView(\"headerlayout\")";
_setview("headerlayout");
 //BA.debugLineNum = 684;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 685;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setvisiblebatch(int _b) throws Exception{
 //BA.debugLineNum = 284;BA.debugLine="Sub SetVisibleBatch(b As Int) As WixElement";
 //BA.debugLineNum = 285;BA.debugLine="SetProperty(\"visibleBatch\", b)";
_setproperty("visibleBatch",(Object)(_b));
 //BA.debugLineNum = 286;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 287;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 423;BA.debugLine="Sub SetWidth(w As Object) As WixElement";
 //BA.debugLineNum = 424;BA.debugLine="SetAttr(\"width\", w)";
_setattr("width",_w);
 //BA.debugLineNum = 425;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 426;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
