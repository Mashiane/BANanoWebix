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
public anywheresoftware.b4a.objects.collections.Map _rules = null;
public anywheresoftware.b4a.objects.collections.List _options = null;
public anywheresoftware.b4a.objects.collections.Map _on = null;
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
public b4j.example.wixelement  _addcells(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 707;BA.debugLine="Sub AddCells(itm As Map) As WixElement";
 //BA.debugLineNum = 708;BA.debugLine="Cells.Add(itm)";
_cells.Add((Object)(_itm.getObject()));
 //BA.debugLineNum = 709;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 710;BA.debugLine="End Sub";
return null;
}
public String  _addcolumn(b4j.example.wixcolumn _wxel) throws Exception{
 //BA.debugLineNum = 832;BA.debugLine="Sub AddColumn(wxEL As WixColumn)";
 //BA.debugLineNum = 833;BA.debugLine="AddColumns(wxEL.Item)";
_addcolumns(_wxel._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 834;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixelement  _addcolumns(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 695;BA.debugLine="Sub AddColumns(itm As Map) As WixElement";
 //BA.debugLineNum = 696;BA.debugLine="Cols.Add(itm)";
_cols.Add((Object)(_itm.getObject()));
 //BA.debugLineNum = 697;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 698;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _addcolumnscells(anywheresoftware.b4a.objects.collections.List _mcells) throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 722;BA.debugLine="Sub AddColumnsCells(mCells As List) As WixElement";
 //BA.debugLineNum = 723;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 724;BA.debugLine="opt.Put(\"cells\", mCells)";
_opt.Put((Object)("cells"),(Object)(_mcells.getObject()));
 //BA.debugLineNum = 725;BA.debugLine="AddColumns(opt)";
_addcolumns(_opt);
 //BA.debugLineNum = 726;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 727;BA.debugLine="End Sub";
return null;
}
public String  _addcolumnsspacer() throws Exception{
b4j.example.wixelement _s = null;
 //BA.debugLineNum = 782;BA.debugLine="Sub AddColumnsSpacer()";
 //BA.debugLineNum = 783;BA.debugLine="Dim s As WixElement";
_s = new b4j.example.wixelement();
 //BA.debugLineNum = 784;BA.debugLine="s.Initialize(\"\").SetView(\"spacer\")";
_s._initialize /*b4j.example.wixelement*/ (ba,"")._setview /*b4j.example.wixelement*/ ("spacer");
 //BA.debugLineNum = 785;BA.debugLine="AddColumns(s.item)";
_addcolumns(_s._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 786;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixelement  _adddatacolumn(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 701;BA.debugLine="Sub AddDataColumn(itm As Map) As WixElement";
 //BA.debugLineNum = 702;BA.debugLine="Columns.Add(itm)";
_columns.Add((Object)(_itm.getObject()));
 //BA.debugLineNum = 703;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 704;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _addelements(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 730;BA.debugLine="Sub AddElements(itm As Map) As WixElement";
 //BA.debugLineNum = 731;BA.debugLine="Elements.Add(itm)";
_elements.Add((Object)(_itm.getObject()));
 //BA.debugLineNum = 732;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 733;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _additem(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 742;BA.debugLine="Sub AddItem(itm As Map) As WixElement";
 //BA.debugLineNum = 743;BA.debugLine="Elements.Add(itm)";
_elements.Add((Object)(_itm.getObject()));
 //BA.debugLineNum = 744;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 745;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _addoption(String _oid,Object _otxt) throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 41;BA.debugLine="Sub AddOption(oid As String, oTxt As Object) As Wi";
 //BA.debugLineNum = 42;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 43;BA.debugLine="opt.put(\"id\",oid)";
_opt.Put((Object)("id"),(Object)(_oid));
 //BA.debugLineNum = 44;BA.debugLine="opt.Put(\"value\",oTxt)";
_opt.Put((Object)("value"),_otxt);
 //BA.debugLineNum = 45;BA.debugLine="options.Add(opt)";
_options.Add((Object)(_opt.getObject()));
 //BA.debugLineNum = 46;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _addresizertocolumns(String _s) throws Exception{
b4j.example.wixresizer _r = null;
 //BA.debugLineNum = 674;BA.debugLine="Sub AddResizerToColumns(s As String) As WixElement";
 //BA.debugLineNum = 675;BA.debugLine="Dim r As WixResizer";
_r = new b4j.example.wixresizer();
 //BA.debugLineNum = 676;BA.debugLine="r.Initialize(\"\")";
_r._initialize /*b4j.example.wixresizer*/ (ba,"");
 //BA.debugLineNum = 677;BA.debugLine="AddColumns(r.Item)";
_addcolumns(_r._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 678;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 679;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _addresizertorows(String _s) throws Exception{
b4j.example.wixresizer _r = null;
 //BA.debugLineNum = 681;BA.debugLine="Sub AddResizerToRows(s As String) As WixElement";
 //BA.debugLineNum = 682;BA.debugLine="Dim r As WixResizer";
_r = new b4j.example.wixresizer();
 //BA.debugLineNum = 683;BA.debugLine="r.Initialize(\"\")";
_r._initialize /*b4j.example.wixresizer*/ (ba,"");
 //BA.debugLineNum = 684;BA.debugLine="AddRows(r.Item)";
_addrows(_r._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 685;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 686;BA.debugLine="End Sub";
return null;
}
public String  _addrow(b4j.example.wixrow _wxel) throws Exception{
 //BA.debugLineNum = 748;BA.debugLine="Sub AddRow(wxEL As WixRow)";
 //BA.debugLineNum = 749;BA.debugLine="AddRows(wxEL.Item)";
_addrows(_wxel._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 750;BA.debugLine="End Sub";
return "";
}
public String  _addrowitems(anywheresoftware.b4a.objects.collections.List _items) throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
 //BA.debugLineNum = 753;BA.debugLine="Sub AddRowItems(items As List)";
 //BA.debugLineNum = 754;BA.debugLine="For Each m As Map In items";
_m = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group1 = _items;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group1.Get(index1)));
 //BA.debugLineNum = 755;BA.debugLine="AddRows(m)";
_addrows(_m);
 }
};
 //BA.debugLineNum = 757;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixelement  _addrows(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 736;BA.debugLine="Sub AddRows(itm As Map) As WixElement";
 //BA.debugLineNum = 737;BA.debugLine="Rows.Add(itm)";
_rows.Add((Object)(_itm.getObject()));
 //BA.debugLineNum = 738;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 739;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _addrowscells(anywheresoftware.b4a.objects.collections.List _mcells) throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 713;BA.debugLine="Sub AddRowsCells(mCells As List) As WixElement";
 //BA.debugLineNum = 714;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 715;BA.debugLine="opt.Put(\"cells\", mCells)";
_opt.Put((Object)("cells"),(Object)(_mcells.getObject()));
 //BA.debugLineNum = 716;BA.debugLine="AddRows(opt)";
_addrows(_opt);
 //BA.debugLineNum = 717;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 718;BA.debugLine="End Sub";
return null;
}
public String  _addrowsspacer() throws Exception{
b4j.example.wixelement _s = null;
 //BA.debugLineNum = 775;BA.debugLine="Sub AddRowsSpacer()";
 //BA.debugLineNum = 776;BA.debugLine="Dim s As WixElement";
_s = new b4j.example.wixelement();
 //BA.debugLineNum = 777;BA.debugLine="s.Initialize(\"\").SetView(\"spacer\")";
_s._initialize /*b4j.example.wixelement*/ (ba,"")._setview /*b4j.example.wixelement*/ ("spacer");
 //BA.debugLineNum = 778;BA.debugLine="AddRows(s.item)";
_addrows(_s._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 779;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixelement  _addtocells(b4j.example.wixelement _prt) throws Exception{
 //BA.debugLineNum = 794;BA.debugLine="Sub AddToCells(prt As WixElement) As WixElement";
 //BA.debugLineNum = 795;BA.debugLine="prt.AddCells(Item)";
_prt._addcells /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 796;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 797;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _addtocolumns(b4j.example.wixelement _prt) throws Exception{
 //BA.debugLineNum = 789;BA.debugLine="Sub AddToColumns(prt As WixElement) As WixElement";
 //BA.debugLineNum = 790;BA.debugLine="prt.AddColumns(Item)";
_prt._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 791;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 792;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _addtoelements(b4j.example.wixelement _prt) throws Exception{
 //BA.debugLineNum = 826;BA.debugLine="Sub AddToElements(prt As WixElement) As WixElement";
 //BA.debugLineNum = 827;BA.debugLine="prt.AddElements(Item)";
_prt._addelements /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 828;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 829;BA.debugLine="End Sub";
return null;
}
public String  _addtorow(b4j.example.wixrow _r) throws Exception{
 //BA.debugLineNum = 887;BA.debugLine="Sub AddToRow(r As WixRow)";
 //BA.debugLineNum = 888;BA.debugLine="r.AddItem(Item)";
_r._additem /*b4j.example.wixrow*/ (_item());
 //BA.debugLineNum = 889;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.example.wixelement _prt) throws Exception{
 //BA.debugLineNum = 770;BA.debugLine="Sub AddToRows(prt As WixElement)";
 //BA.debugLineNum = 771;BA.debugLine="prt.AddRows(Item)";
_prt._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 772;BA.debugLine="End Sub";
return "";
}
public String  _addwixrows(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
b4j.example.wixrow _i = null;
 //BA.debugLineNum = 143;BA.debugLine="Sub AddWixRows(lst As List)";
 //BA.debugLineNum = 144;BA.debugLine="For Each i As WixRow In lst";
{
final anywheresoftware.b4a.BA.IterableList group1 = _lst;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_i = (b4j.example.wixrow)(group1.Get(index1));
 //BA.debugLineNum = 145;BA.debugLine="AddRow(i)";
_addrow(_i);
 }
};
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 14;BA.debugLine="Public Rules As Map";
_rules = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 15;BA.debugLine="Private options As List";
_options = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 16;BA.debugLine="Private On As Map";
_on = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixaccordion  _createaccordion(String _sid) throws Exception{
b4j.example.wixaccordion _btn = null;
 //BA.debugLineNum = 948;BA.debugLine="Sub CreateAccordion(sid As String) As WixAccordion";
 //BA.debugLineNum = 949;BA.debugLine="Dim btn As WixAccordion";
_btn = new b4j.example.wixaccordion();
 //BA.debugLineNum = 950;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.example.wixaccordion*/ (ba,_sid);
 //BA.debugLineNum = 951;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 952;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _createbutton(String _eid) throws Exception{
b4j.example.wixbutton _btn = null;
 //BA.debugLineNum = 115;BA.debugLine="Sub CreateButton(eid As String) As WixButton";
 //BA.debugLineNum = 116;BA.debugLine="Dim btn As WixButton";
_btn = new b4j.example.wixbutton();
 //BA.debugLineNum = 117;BA.debugLine="btn.Initialize(eid)";
_btn._initialize /*b4j.example.wixbutton*/ (ba,_eid);
 //BA.debugLineNum = 118;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcarousel  _createcarousel(String _sid) throws Exception{
b4j.example.wixcarousel _btn = null;
 //BA.debugLineNum = 954;BA.debugLine="Sub CreateCarousel(sid As String) As WixCarousel";
 //BA.debugLineNum = 955;BA.debugLine="Dim btn As WixCarousel";
_btn = new b4j.example.wixcarousel();
 //BA.debugLineNum = 956;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.example.wixcarousel*/ (ba,_sid);
 //BA.debugLineNum = 957;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 958;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixchart  _createchart(String _sid) throws Exception{
b4j.example.wixchart _btn = null;
 //BA.debugLineNum = 960;BA.debugLine="Sub CreateChart(sid As String) As WixChart";
 //BA.debugLineNum = 961;BA.debugLine="Dim btn As WixChart";
_btn = new b4j.example.wixchart();
 //BA.debugLineNum = 962;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.example.wixchart*/ (ba,_sid);
 //BA.debugLineNum = 963;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 964;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcheckbox  _createcheckbox(String _eid) throws Exception{
b4j.example.wixcheckbox _chk = null;
 //BA.debugLineNum = 122;BA.debugLine="Sub CreateCheckBox(eid As String) As WixCheckBox";
 //BA.debugLineNum = 123;BA.debugLine="Dim chk As WixCheckBox";
_chk = new b4j.example.wixcheckbox();
 //BA.debugLineNum = 124;BA.debugLine="chk.Initialize(eid)";
_chk._initialize /*b4j.example.wixcheckbox*/ (ba,_eid);
 //BA.debugLineNum = 125;BA.debugLine="Return chk";
if (true) return _chk;
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcolorpicker  _createcolorpicker(String _eid) throws Exception{
b4j.example.wixcolorpicker _cp = null;
 //BA.debugLineNum = 129;BA.debugLine="Sub CreateColorPicker(eid As String) As WixColorPi";
 //BA.debugLineNum = 130;BA.debugLine="Dim cp As WixColorPicker";
_cp = new b4j.example.wixcolorpicker();
 //BA.debugLineNum = 131;BA.debugLine="cp.Initialize(eid)";
_cp._initialize /*b4j.example.wixcolorpicker*/ (ba,_eid);
 //BA.debugLineNum = 132;BA.debugLine="Return cp";
if (true) return _cp;
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcolumn  _createcolumn(String _cid) throws Exception{
b4j.example.wixcolumn _c = null;
 //BA.debugLineNum = 94;BA.debugLine="Sub CreateColumn(cid As String) As WixColumn";
 //BA.debugLineNum = 95;BA.debugLine="Dim c As WixColumn";
_c = new b4j.example.wixcolumn();
 //BA.debugLineNum = 96;BA.debugLine="c.Initialize(cid)";
_c._initialize /*b4j.example.wixcolumn*/ (ba,_cid);
 //BA.debugLineNum = 97;BA.debugLine="Return c";
if (true) return _c;
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcombo  _createcombo(String _eid) throws Exception{
b4j.example.wixcombo _cp = null;
 //BA.debugLineNum = 136;BA.debugLine="Sub CreateCombo(eid As String) As WixCombo";
 //BA.debugLineNum = 137;BA.debugLine="Dim cp As WixCombo";
_cp = new b4j.example.wixcombo();
 //BA.debugLineNum = 138;BA.debugLine="cp.Initialize(eid)";
_cp._initialize /*b4j.example.wixcombo*/ (ba,_eid);
 //BA.debugLineNum = 139;BA.debugLine="Return cp";
if (true) return _cp;
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcomments  _createcomments(String _sid) throws Exception{
b4j.example.wixcomments _btn = null;
 //BA.debugLineNum = 966;BA.debugLine="Sub CreateComments(sid As String) As WixComments";
 //BA.debugLineNum = 967;BA.debugLine="Dim btn As WixComments";
_btn = new b4j.example.wixcomments();
 //BA.debugLineNum = 968;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.example.wixcomments*/ (ba,_sid);
 //BA.debugLineNum = 969;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 970;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcontext  _createcontext(String _sid) throws Exception{
b4j.example.wixcontext _btn = null;
 //BA.debugLineNum = 972;BA.debugLine="Sub CreateContext(sid As String) As WixContext";
 //BA.debugLineNum = 973;BA.debugLine="Dim btn As WixContext";
_btn = new b4j.example.wixcontext();
 //BA.debugLineNum = 974;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.example.wixcontext*/ (ba,_sid);
 //BA.debugLineNum = 975;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 976;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcontextmenu  _createcontextmenu(String _sid) throws Exception{
b4j.example.wixcontextmenu _btn = null;
 //BA.debugLineNum = 978;BA.debugLine="Sub CreateContextMenu(sid As String) As WixContext";
 //BA.debugLineNum = 979;BA.debugLine="Dim btn As WixContextMenu";
_btn = new b4j.example.wixcontextmenu();
 //BA.debugLineNum = 980;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.example.wixcontextmenu*/ (ba,_sid);
 //BA.debugLineNum = 981;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 982;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcounter  _createcounter(String _sid) throws Exception{
b4j.example.wixcounter _btn = null;
 //BA.debugLineNum = 984;BA.debugLine="Sub CreateCounter(sid As String) As WixCounter";
 //BA.debugLineNum = 985;BA.debugLine="Dim btn As WixCounter";
_btn = new b4j.example.wixcounter();
 //BA.debugLineNum = 986;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.example.wixcounter*/ (ba,_sid);
 //BA.debugLineNum = 987;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 988;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _createdatatable(String _sid) throws Exception{
b4j.example.wixdatatable _btn = null;
 //BA.debugLineNum = 990;BA.debugLine="Sub CreateDataTable(sid As String) As WixDataTable";
 //BA.debugLineNum = 991;BA.debugLine="Dim btn As WixDataTable";
_btn = new b4j.example.wixdatatable();
 //BA.debugLineNum = 992;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.example.wixdatatable*/ (ba,_sid);
 //BA.debugLineNum = 993;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 994;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdataview  _createdataview(String _sid) throws Exception{
b4j.example.wixdataview _btn = null;
 //BA.debugLineNum = 997;BA.debugLine="Sub CreateDataView(sid As String) As WixDataView";
 //BA.debugLineNum = 998;BA.debugLine="Dim btn As WixDataView";
_btn = new b4j.example.wixdataview();
 //BA.debugLineNum = 999;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.example.wixdataview*/ (ba,_sid);
 //BA.debugLineNum = 1000;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 1001;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatetimepicker  _createdatetimepicker(String _sid) throws Exception{
b4j.example.wixdatetimepicker _btn = null;
 //BA.debugLineNum = 1004;BA.debugLine="Sub CreateDateTimePicker(sid As String) As WixDate";
 //BA.debugLineNum = 1005;BA.debugLine="Dim btn As WixDateTimePicker";
_btn = new b4j.example.wixdatetimepicker();
 //BA.debugLineNum = 1006;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.example.wixdatetimepicker*/ (ba,_sid);
 //BA.debugLineNum = 1007;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 1008;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdbllist  _createdbllist(String _sid) throws Exception{
b4j.example.wixdbllist _btn = null;
 //BA.debugLineNum = 1011;BA.debugLine="Sub CreateDBLList(sid As String) As WixDBLList";
 //BA.debugLineNum = 1012;BA.debugLine="Dim btn As WixDBLList";
_btn = new b4j.example.wixdbllist();
 //BA.debugLineNum = 1013;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.example.wixdbllist*/ (ba,_sid);
 //BA.debugLineNum = 1014;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 1015;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixfieldset  _createfieldset(String _sid) throws Exception{
b4j.example.wixfieldset _btn = null;
 //BA.debugLineNum = 1019;BA.debugLine="Sub CreateFieldSet(sid As String) As WixFieldSet";
 //BA.debugLineNum = 1020;BA.debugLine="Dim btn As WixFieldSet";
_btn = new b4j.example.wixfieldset();
 //BA.debugLineNum = 1021;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.example.wixfieldset*/ (ba,_sid);
 //BA.debugLineNum = 1022;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 1023;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixflexlayout  _createflexlayout(String _sid) throws Exception{
b4j.example.wixflexlayout _btn = null;
 //BA.debugLineNum = 1025;BA.debugLine="Sub CreateFlexLayout(sid As String) As WixFlexLayo";
 //BA.debugLineNum = 1026;BA.debugLine="Dim btn As WixFlexLayout";
_btn = new b4j.example.wixflexlayout();
 //BA.debugLineNum = 1027;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.example.wixflexlayout*/ (ba,_sid);
 //BA.debugLineNum = 1028;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 1029;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixform  _createform(String _sid) throws Exception{
b4j.example.wixform _btn = null;
 //BA.debugLineNum = 1031;BA.debugLine="Sub CreateForm(sid As String) As WixForm";
 //BA.debugLineNum = 1032;BA.debugLine="Dim btn As WixForm";
_btn = new b4j.example.wixform();
 //BA.debugLineNum = 1033;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.example.wixform*/ (ba,_sid);
 //BA.debugLineNum = 1034;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 1035;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixforminput  _createforminput(String _sid) throws Exception{
b4j.example.wixforminput _btn = null;
 //BA.debugLineNum = 1038;BA.debugLine="Sub CreateFormInput(sid As String) As WixFormInput";
 //BA.debugLineNum = 1039;BA.debugLine="Dim btn As WixFormInput";
_btn = new b4j.example.wixforminput();
 //BA.debugLineNum = 1040;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.example.wixforminput*/ (ba,_sid);
 //BA.debugLineNum = 1041;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 1042;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixgooglemap  _creategooglemap(String _sid) throws Exception{
b4j.example.wixgooglemap _btn = null;
 //BA.debugLineNum = 1045;BA.debugLine="Sub CreateGoogleMap(sid As String) As WixGoogleMap";
 //BA.debugLineNum = 1046;BA.debugLine="Dim btn As WixGoogleMap";
_btn = new b4j.example.wixgooglemap();
 //BA.debugLineNum = 1047;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.example.wixgooglemap*/ (ba,_sid);
 //BA.debugLineNum = 1048;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 1049;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixgrouplist  _creategrouplist(String _sid) throws Exception{
b4j.example.wixgrouplist _btn = null;
 //BA.debugLineNum = 1051;BA.debugLine="Sub CreateGroupList(sid As String) As WixGroupList";
 //BA.debugLineNum = 1052;BA.debugLine="Dim btn As WixGroupList";
_btn = new b4j.example.wixgrouplist();
 //BA.debugLineNum = 1053;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.example.wixgrouplist*/ (ba,_sid);
 //BA.debugLineNum = 1054;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 1055;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixheader  _createheader(String _sid) throws Exception{
b4j.example.wixheader _itm = null;
 //BA.debugLineNum = 1057;BA.debugLine="Sub CreateHeader(sid As String) As WixHeader";
 //BA.debugLineNum = 1058;BA.debugLine="Dim itm As WixHeader";
_itm = new b4j.example.wixheader();
 //BA.debugLineNum = 1059;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixheader*/ (ba,_sid);
 //BA.debugLineNum = 1060;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1061;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixicon  _createicon(String _sid) throws Exception{
b4j.example.wixicon _btn = null;
 //BA.debugLineNum = 928;BA.debugLine="Sub CreateIcon(sid As String) As WixIcon";
 //BA.debugLineNum = 929;BA.debugLine="Dim btn As WixIcon";
_btn = new b4j.example.wixicon();
 //BA.debugLineNum = 930;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.example.wixicon*/ (ba,_sid);
 //BA.debugLineNum = 931;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 932;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixiframe  _createiframe(String _sid) throws Exception{
b4j.example.wixiframe _itm = null;
 //BA.debugLineNum = 1063;BA.debugLine="Sub CreateIFrame(sid As String) As WixIFrame";
 //BA.debugLineNum = 1064;BA.debugLine="Dim itm As WixIFrame";
_itm = new b4j.example.wixiframe();
 //BA.debugLineNum = 1065;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixiframe*/ (ba,_sid);
 //BA.debugLineNum = 1066;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1067;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlabel  _createlabel(String _sid) throws Exception{
b4j.example.wixlabel _lbl = null;
 //BA.debugLineNum = 935;BA.debugLine="Sub CreateLabel(sid As String) As WixLabel";
 //BA.debugLineNum = 936;BA.debugLine="Dim lbl As WixLabel";
_lbl = new b4j.example.wixlabel();
 //BA.debugLineNum = 937;BA.debugLine="lbl.Initialize(sid)";
_lbl._initialize /*b4j.example.wixlabel*/ (ba,_sid);
 //BA.debugLineNum = 938;BA.debugLine="Return lbl";
if (true) return _lbl;
 //BA.debugLineNum = 939;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlayout  _createlayout(String _sid) throws Exception{
b4j.example.wixlayout _itm = null;
 //BA.debugLineNum = 1069;BA.debugLine="Sub CreateLayout(sid As String) As WixLayout";
 //BA.debugLineNum = 1070;BA.debugLine="Dim itm As WixLayout";
_itm = new b4j.example.wixlayout();
 //BA.debugLineNum = 1071;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixlayout*/ (ba,_sid);
 //BA.debugLineNum = 1072;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1073;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlist  _createlist(String _sid) throws Exception{
b4j.example.wixlist _itm = null;
 //BA.debugLineNum = 1075;BA.debugLine="Sub CreateList(sid As String) As WixList";
 //BA.debugLineNum = 1076;BA.debugLine="Dim itm As WixList";
_itm = new b4j.example.wixlist();
 //BA.debugLineNum = 1077;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixlist*/ (ba,_sid);
 //BA.debugLineNum = 1078;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1079;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmenu  _createmenu(String _sid) throws Exception{
b4j.example.wixmenu _itm = null;
 //BA.debugLineNum = 1081;BA.debugLine="Sub CreateMenu(sid As String) As WixMenu";
 //BA.debugLineNum = 1082;BA.debugLine="Dim itm As WixMenu";
_itm = new b4j.example.wixmenu();
 //BA.debugLineNum = 1083;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixmenu*/ (ba,_sid);
 //BA.debugLineNum = 1084;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1085;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmessagebox  _createmessagebox(String _sid) throws Exception{
b4j.example.wixmessagebox _itm = null;
 //BA.debugLineNum = 1087;BA.debugLine="Sub CreateMessageBox(sid As String) As WixMessageB";
 //BA.debugLineNum = 1088;BA.debugLine="Dim itm As WixMessageBox";
_itm = new b4j.example.wixmessagebox();
 //BA.debugLineNum = 1089;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixmessagebox*/ (ba,_sid);
 //BA.debugLineNum = 1090;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1091;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmultiview  _createmultiview(String _sid) throws Exception{
b4j.example.wixmultiview _itm = null;
 //BA.debugLineNum = 1093;BA.debugLine="Sub CreateMultiView(sid As String) As WixMultiView";
 //BA.debugLineNum = 1094;BA.debugLine="Dim itm As WixMultiView";
_itm = new b4j.example.wixmultiview();
 //BA.debugLineNum = 1095;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixmultiview*/ (ba,_sid);
 //BA.debugLineNum = 1096;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1097;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixpager  _createpager(String _sid) throws Exception{
b4j.example.wixpager _itm = null;
 //BA.debugLineNum = 1099;BA.debugLine="Sub CreatePager(sid As String) As WixPager";
 //BA.debugLineNum = 1100;BA.debugLine="Dim itm As WixPager";
_itm = new b4j.example.wixpager();
 //BA.debugLineNum = 1101;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixpager*/ (ba,_sid);
 //BA.debugLineNum = 1102;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1103;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixpopup  _createpopup(String _sid) throws Exception{
b4j.example.wixpopup _itm = null;
 //BA.debugLineNum = 1105;BA.debugLine="Sub CreatePopUp(sid As String) As WixPopUp";
 //BA.debugLineNum = 1106;BA.debugLine="Dim itm As WixPopUp";
_itm = new b4j.example.wixpopup();
 //BA.debugLineNum = 1107;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixpopup*/ (ba,_sid);
 //BA.debugLineNum = 1108;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1109;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixportlet  _createportlet(String _sid) throws Exception{
b4j.example.wixportlet _itm = null;
 //BA.debugLineNum = 1111;BA.debugLine="Sub CreatePortlet(sid As String) As WixPortlet";
 //BA.debugLineNum = 1112;BA.debugLine="Dim itm As WixPortlet";
_itm = new b4j.example.wixportlet();
 //BA.debugLineNum = 1113;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixportlet*/ (ba,_sid);
 //BA.debugLineNum = 1114;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1115;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixproperty  _createproperty(String _sid) throws Exception{
b4j.example.wixproperty _itm = null;
 //BA.debugLineNum = 1117;BA.debugLine="Sub CreateProperty(sid As String) As WixProperty";
 //BA.debugLineNum = 1118;BA.debugLine="Dim itm As WixProperty";
_itm = new b4j.example.wixproperty();
 //BA.debugLineNum = 1119;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixproperty*/ (ba,_sid);
 //BA.debugLineNum = 1120;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1121;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixradio  _createradio(String _sid) throws Exception{
b4j.example.wixradio _itm = null;
 //BA.debugLineNum = 1123;BA.debugLine="Sub CreateRadio(sid As String) As WixRadio";
 //BA.debugLineNum = 1124;BA.debugLine="Dim itm As WixRadio";
_itm = new b4j.example.wixradio();
 //BA.debugLineNum = 1125;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixradio*/ (ba,_sid);
 //BA.debugLineNum = 1126;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1127;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrangeslider  _createrangeslider(String _sid) throws Exception{
b4j.example.wixrangeslider _itm = null;
 //BA.debugLineNum = 1129;BA.debugLine="Sub CreateRangeSlider(sid As String) As WixRangeSl";
 //BA.debugLineNum = 1130;BA.debugLine="Dim itm As WixRangeSlider";
_itm = new b4j.example.wixrangeslider();
 //BA.debugLineNum = 1131;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixrangeslider*/ (ba,_sid);
 //BA.debugLineNum = 1132;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1133;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixresizer  _createresizer(String _rid) throws Exception{
b4j.example.wixresizer _res1 = null;
 //BA.debugLineNum = 57;BA.debugLine="Sub CreateResizer(rid As String) As WixResizer";
 //BA.debugLineNum = 58;BA.debugLine="Dim res1 As WixResizer";
_res1 = new b4j.example.wixresizer();
 //BA.debugLineNum = 59;BA.debugLine="res1.Initialize(rid)";
_res1._initialize /*b4j.example.wixresizer*/ (ba,_rid);
 //BA.debugLineNum = 60;BA.debugLine="Return res1";
if (true) return _res1;
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrichselect  _createrichselect(String _sid) throws Exception{
b4j.example.wixrichselect _itm = null;
 //BA.debugLineNum = 1135;BA.debugLine="Sub CreateRichSelect(sid As String) As WixRichSele";
 //BA.debugLineNum = 1136;BA.debugLine="Dim itm As WixRichSelect";
_itm = new b4j.example.wixrichselect();
 //BA.debugLineNum = 1137;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixrichselect*/ (ba,_sid);
 //BA.debugLineNum = 1138;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1139;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrichtext  _createrichtext(String _sid) throws Exception{
b4j.example.wixrichtext _itm = null;
 //BA.debugLineNum = 1141;BA.debugLine="Sub CreateRichText(sid As String) As WixRichText";
 //BA.debugLineNum = 1142;BA.debugLine="Dim itm As WixRichText";
_itm = new b4j.example.wixrichtext();
 //BA.debugLineNum = 1143;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixrichtext*/ (ba,_sid);
 //BA.debugLineNum = 1144;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1145;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixrow  _createrow(String _rid) throws Exception{
b4j.example.wixrow _r = null;
 //BA.debugLineNum = 101;BA.debugLine="Sub CreateRow(rid As String) As WixRow";
 //BA.debugLineNum = 102;BA.debugLine="Dim r As WixRow";
_r = new b4j.example.wixrow();
 //BA.debugLineNum = 103;BA.debugLine="r.Initialize(rid)";
_r._initialize /*b4j.example.wixrow*/ (ba,_rid);
 //BA.debugLineNum = 104;BA.debugLine="Return r";
if (true) return _r;
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixscrollview  _createscrollview(String _sid) throws Exception{
b4j.example.wixscrollview _itm = null;
 //BA.debugLineNum = 1147;BA.debugLine="Sub CreateScrollView(sid As String) As WixScrollVi";
 //BA.debugLineNum = 1148;BA.debugLine="Dim itm As WixScrollView";
_itm = new b4j.example.wixscrollview();
 //BA.debugLineNum = 1149;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixscrollview*/ (ba,_sid);
 //BA.debugLineNum = 1150;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1151;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsearch  _createsearch(String _sid) throws Exception{
b4j.example.wixsearch _itm = null;
 //BA.debugLineNum = 1153;BA.debugLine="Sub CreateSearch(sid As String) As WixSearch";
 //BA.debugLineNum = 1154;BA.debugLine="Dim itm As WixSearch";
_itm = new b4j.example.wixsearch();
 //BA.debugLineNum = 1155;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixsearch*/ (ba,_sid);
 //BA.debugLineNum = 1156;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1157;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsection  _createsection(String _sid) throws Exception{
b4j.example.wixsection _itm = null;
 //BA.debugLineNum = 1159;BA.debugLine="Sub CreateSection(sid As String) As WixSection";
 //BA.debugLineNum = 1160;BA.debugLine="Dim itm As WixSection";
_itm = new b4j.example.wixsection();
 //BA.debugLineNum = 1161;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixsection*/ (ba,_sid);
 //BA.debugLineNum = 1162;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1163;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsegmented  _createsegmented(String _sid) throws Exception{
b4j.example.wixsegmented _itm = null;
 //BA.debugLineNum = 1165;BA.debugLine="Sub CreateSegmented(sid As String) As WixSegmented";
 //BA.debugLineNum = 1166;BA.debugLine="Dim itm As WixSegmented";
_itm = new b4j.example.wixsegmented();
 //BA.debugLineNum = 1167;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixsegmented*/ (ba,_sid);
 //BA.debugLineNum = 1168;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1169;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixselect  _createselect(String _sid) throws Exception{
b4j.example.wixselect _itm = null;
 //BA.debugLineNum = 1171;BA.debugLine="Sub CreateSelect(sid As String) As WixSelect";
 //BA.debugLineNum = 1172;BA.debugLine="Dim itm As WixSelect";
_itm = new b4j.example.wixselect();
 //BA.debugLineNum = 1173;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixselect*/ (ba,_sid);
 //BA.debugLineNum = 1174;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1175;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidebar  _createsidebar(String _sid) throws Exception{
b4j.example.wixsidebar _itm = null;
 //BA.debugLineNum = 1177;BA.debugLine="Sub CreateSideBar(sid As String) As WixSideBar";
 //BA.debugLineNum = 1178;BA.debugLine="Dim itm As WixSideBar";
_itm = new b4j.example.wixsidebar();
 //BA.debugLineNum = 1179;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixsidebar*/ (ba,_sid);
 //BA.debugLineNum = 1180;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1181;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsidemenu  _createsidemenu(String _sid) throws Exception{
b4j.example.wixsidemenu _itm = null;
 //BA.debugLineNum = 1183;BA.debugLine="Sub CreateSideMenu(sid As String) As WixSideMenu";
 //BA.debugLineNum = 1184;BA.debugLine="Dim itm As WixSideMenu";
_itm = new b4j.example.wixsidemenu();
 //BA.debugLineNum = 1185;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixsidemenu*/ (ba,_sid);
 //BA.debugLineNum = 1186;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1187;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixslider  _createslider(String _sid) throws Exception{
b4j.example.wixslider _itm = null;
 //BA.debugLineNum = 1189;BA.debugLine="Sub CreateSlider(sid As String) As WixSlider";
 //BA.debugLineNum = 1190;BA.debugLine="Dim itm As WixSlider";
_itm = new b4j.example.wixslider();
 //BA.debugLineNum = 1191;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixslider*/ (ba,_sid);
 //BA.debugLineNum = 1192;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1193;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsuggest  _createsuggest(String _sid) throws Exception{
b4j.example.wixsuggest _itm = null;
 //BA.debugLineNum = 1195;BA.debugLine="Sub CreateSuggest(sid As String) As WixSuggest";
 //BA.debugLineNum = 1196;BA.debugLine="Dim itm As WixSuggest";
_itm = new b4j.example.wixsuggest();
 //BA.debugLineNum = 1197;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixsuggest*/ (ba,_sid);
 //BA.debugLineNum = 1198;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1199;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixswitch  _createswitch(String _sid) throws Exception{
b4j.example.wixswitch _itm = null;
 //BA.debugLineNum = 1201;BA.debugLine="Sub CreateSwitch(sid As String) As WixSwitch";
 //BA.debugLineNum = 1202;BA.debugLine="Dim itm As WixSwitch";
_itm = new b4j.example.wixswitch();
 //BA.debugLineNum = 1203;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixswitch*/ (ba,_sid);
 //BA.debugLineNum = 1204;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1205;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtabbar  _createtabbar(String _sid) throws Exception{
b4j.example.wixtabbar _itm = null;
 //BA.debugLineNum = 1207;BA.debugLine="Sub CreateTabBar(sid As String) As WixTabBar";
 //BA.debugLineNum = 1208;BA.debugLine="Dim itm As WixTabBar";
_itm = new b4j.example.wixtabbar();
 //BA.debugLineNum = 1209;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixtabbar*/ (ba,_sid);
 //BA.debugLineNum = 1210;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1211;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtabview  _createtabview(String _sid) throws Exception{
b4j.example.wixtabview _itm = null;
 //BA.debugLineNum = 1213;BA.debugLine="Sub CreateTabView(sid As String) As WixTabView";
 //BA.debugLineNum = 1214;BA.debugLine="Dim itm As WixTabView";
_itm = new b4j.example.wixtabview();
 //BA.debugLineNum = 1215;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixtabview*/ (ba,_sid);
 //BA.debugLineNum = 1216;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1217;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtemplate  _createtemplate(String _sid) throws Exception{
b4j.example.wixtemplate _itm = null;
 //BA.debugLineNum = 1219;BA.debugLine="Sub CreateTemplate(sid As String) As WixTemplate";
 //BA.debugLineNum = 1220;BA.debugLine="Dim itm As WixTemplate";
_itm = new b4j.example.wixtemplate();
 //BA.debugLineNum = 1221;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixtemplate*/ (ba,_sid);
 //BA.debugLineNum = 1222;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1223;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtext  _createtext(String _sid) throws Exception{
b4j.example.wixtext _itm = null;
 //BA.debugLineNum = 1225;BA.debugLine="Sub CreateText(sid As String) As WixText";
 //BA.debugLineNum = 1226;BA.debugLine="Dim itm As WixText";
_itm = new b4j.example.wixtext();
 //BA.debugLineNum = 1227;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixtext*/ (ba,_sid);
 //BA.debugLineNum = 1228;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1229;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _createtextarea(String _sid) throws Exception{
b4j.example.wixtextarea _itm = null;
 //BA.debugLineNum = 1231;BA.debugLine="Sub CreateTextArea(sid As String) As WixTextArea";
 //BA.debugLineNum = 1232;BA.debugLine="Dim itm As WixTextArea";
_itm = new b4j.example.wixtextarea();
 //BA.debugLineNum = 1233;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixtextarea*/ (ba,_sid);
 //BA.debugLineNum = 1234;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1235;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtext  _createtextbox(String _eid) throws Exception{
b4j.example.wixtext _txtbox = null;
 //BA.debugLineNum = 108;BA.debugLine="Sub CreateTextBox(eid As String) As WixText";
 //BA.debugLineNum = 109;BA.debugLine="Dim txtbox As WixText";
_txtbox = new b4j.example.wixtext();
 //BA.debugLineNum = 110;BA.debugLine="txtbox.Initialize(eid)";
_txtbox._initialize /*b4j.example.wixtext*/ (ba,_eid);
 //BA.debugLineNum = 111;BA.debugLine="Return txtbox";
if (true) return _txtbox;
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoggle  _createtoggle(String _sid) throws Exception{
b4j.example.wixtoggle _btn = null;
 //BA.debugLineNum = 942;BA.debugLine="Sub CreateToggle(sid As String) As WixToggle";
 //BA.debugLineNum = 943;BA.debugLine="Dim btn As WixToggle";
_btn = new b4j.example.wixtoggle();
 //BA.debugLineNum = 944;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.example.wixtoggle*/ (ba,_sid);
 //BA.debugLineNum = 945;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 946;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoolbar  _createtoolbar(String _sid) throws Exception{
b4j.example.wixtoolbar _itm = null;
 //BA.debugLineNum = 1237;BA.debugLine="Sub CreateToolBar(sid As String) As WixToolBar";
 //BA.debugLineNum = 1238;BA.debugLine="Dim itm As WixToolBar";
_itm = new b4j.example.wixtoolbar();
 //BA.debugLineNum = 1239;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixtoolbar*/ (ba,_sid);
 //BA.debugLineNum = 1240;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1241;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtree  _createtree(String _sid) throws Exception{
b4j.example.wixtree _itm = null;
 //BA.debugLineNum = 1243;BA.debugLine="Sub CreateTree(sid As String) As WixTree";
 //BA.debugLineNum = 1244;BA.debugLine="Dim itm As WixTree";
_itm = new b4j.example.wixtree();
 //BA.debugLineNum = 1245;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixtree*/ (ba,_sid);
 //BA.debugLineNum = 1246;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1247;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtreetable  _createtreetable(String _sid) throws Exception{
b4j.example.wixtreetable _itm = null;
 //BA.debugLineNum = 1249;BA.debugLine="Sub CreateTreeTable(sid As String) As WixTreeTable";
 //BA.debugLineNum = 1250;BA.debugLine="Dim itm As WixTreeTable";
_itm = new b4j.example.wixtreetable();
 //BA.debugLineNum = 1251;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixtreetable*/ (ba,_sid);
 //BA.debugLineNum = 1252;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1253;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixunitlist  _createunitlist(String _sid) throws Exception{
b4j.example.wixunitlist _itm = null;
 //BA.debugLineNum = 1255;BA.debugLine="Sub CreateUnitList(sid As String) As WixUnitList";
 //BA.debugLineNum = 1256;BA.debugLine="Dim itm As WixUnitList";
_itm = new b4j.example.wixunitlist();
 //BA.debugLineNum = 1257;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixunitlist*/ (ba,_sid);
 //BA.debugLineNum = 1258;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1259;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixuploader  _createuploader(String _sid) throws Exception{
b4j.example.wixuploader _itm = null;
 //BA.debugLineNum = 1261;BA.debugLine="Sub CreateUploader(sid As String) As WixUploader";
 //BA.debugLineNum = 1262;BA.debugLine="Dim itm As WixUploader";
_itm = new b4j.example.wixuploader();
 //BA.debugLineNum = 1263;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixuploader*/ (ba,_sid);
 //BA.debugLineNum = 1264;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1265;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixvideo  _createvideo(String _sid) throws Exception{
b4j.example.wixvideo _itm = null;
 //BA.debugLineNum = 1267;BA.debugLine="Sub CreateVideo(sid As String) As WixVideo";
 //BA.debugLineNum = 1268;BA.debugLine="Dim itm As WixVideo";
_itm = new b4j.example.wixvideo();
 //BA.debugLineNum = 1269;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixvideo*/ (ba,_sid);
 //BA.debugLineNum = 1270;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1271;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixwindow  _createwindow(String _sid) throws Exception{
b4j.example.wixwindow _itm = null;
 //BA.debugLineNum = 1273;BA.debugLine="Sub CreateWindow(sid As String) As WixWindow";
 //BA.debugLineNum = 1274;BA.debugLine="Dim itm As WixWindow";
_itm = new b4j.example.wixwindow();
 //BA.debugLineNum = 1275;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.example.wixwindow*/ (ba,_sid);
 //BA.debugLineNum = 1276;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1277;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 236;BA.debugLine="Public Sub Initialize(sID As String) As WixElement";
 //BA.debugLineNum = 237;BA.debugLine="ID = sID.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 238;BA.debugLine="Cells.Initialize";
_cells.Initialize();
 //BA.debugLineNum = 239;BA.debugLine="Cols.Initialize";
_cols.Initialize();
 //BA.debugLineNum = 240;BA.debugLine="elementsConfig.Initialize";
_elementsconfig.Initialize();
 //BA.debugLineNum = 241;BA.debugLine="Styles.Initialize";
_styles.Initialize();
 //BA.debugLineNum = 242;BA.debugLine="Element = CreateMap(\"id\":ID)";
_element = __c.createMap(new Object[] {(Object)("id"),(Object)(_id)});
 //BA.debugLineNum = 243;BA.debugLine="Rows.Initialize";
_rows.Initialize();
 //BA.debugLineNum = 244;BA.debugLine="Elements.Initialize";
_elements.Initialize();
 //BA.debugLineNum = 245;BA.debugLine="Columns.Initialize";
_columns.Initialize();
 //BA.debugLineNum = 246;BA.debugLine="Attributes.Initialize";
_attributes.Initialize();
 //BA.debugLineNum = 247;BA.debugLine="HTMLAttributes.Initialize";
_htmlattributes.Initialize();
 //BA.debugLineNum = 248;BA.debugLine="Rules.Initialize";
_rules.Initialize();
 //BA.debugLineNum = 249;BA.debugLine="options.Initialize";
_options.Initialize();
 //BA.debugLineNum = 250;BA.debugLine="SetLocalID(ID)";
_setlocalid(_id);
 //BA.debugLineNum = 251;BA.debugLine="On.Initialize";
_on.Initialize();
 //BA.debugLineNum = 252;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 253;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
String _attr = "";
Object _strval = null;
 //BA.debugLineNum = 630;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 631;BA.debugLine="For Each attr As String In Attributes.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attributes.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_attr = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 632;BA.debugLine="Dim strVal As Object = Attributes.Get(attr)";
_strval = _attributes.Get((Object)(_attr));
 //BA.debugLineNum = 633;BA.debugLine="Element.Put(attr,strVal)";
_element.Put((Object)(_attr),_strval);
 }
};
 //BA.debugLineNum = 635;BA.debugLine="SetOnCondition(On.Size,\"on\", On)";
_setoncondition(_on.getSize(),"on",(Object)(_on.getObject()));
 //BA.debugLineNum = 636;BA.debugLine="SetOnCondition(options.Size,\"options\", options)";
_setoncondition(_options.getSize(),"options",(Object)(_options.getObject()));
 //BA.debugLineNum = 637;BA.debugLine="SetOnCondition(Columns.Size,\"columns\", Columns)";
_setoncondition(_columns.getSize(),"columns",(Object)(_columns.getObject()));
 //BA.debugLineNum = 638;BA.debugLine="SetOnCondition(Cols.Size, \"cols\", Cols)";
_setoncondition(_cols.getSize(),"cols",(Object)(_cols.getObject()));
 //BA.debugLineNum = 639;BA.debugLine="SetOnCondition(Rows.Size, \"rows\", Rows)";
_setoncondition(_rows.getSize(),"rows",(Object)(_rows.getObject()));
 //BA.debugLineNum = 640;BA.debugLine="SetOnCondition(Elements.Size, \"elements\", Element";
_setoncondition(_elements.getSize(),"elements",(Object)(_elements.getObject()));
 //BA.debugLineNum = 641;BA.debugLine="SetOnCondition(Cells.Size, \"cells\", Cells)";
_setoncondition(_cells.getSize(),"cells",(Object)(_cells.getObject()));
 //BA.debugLineNum = 642;BA.debugLine="SetOnCondition(HTMLAttributes.Size, \"attributes\",";
_setoncondition(_htmlattributes.getSize(),"attributes",(Object)(_htmlattributes.getObject()));
 //BA.debugLineNum = 643;BA.debugLine="SetOnCondition(elementsConfig.Size, \"elementsConf";
_setoncondition(_elementsconfig.getSize(),"elementsConfig",(Object)(_elementsconfig.getObject()));
 //BA.debugLineNum = 644;BA.debugLine="SetOnCondition(Rules.Size, \"rules\", Rules)";
_setoncondition(_rules.getSize(),"rules",(Object)(_rules.getObject()));
 //BA.debugLineNum = 645;BA.debugLine="SetOnCondition(Styles.Size, \"css\", Styles)";
_setoncondition(_styles.getSize(),"css",(Object)(_styles.getObject()));
 //BA.debugLineNum = 646;BA.debugLine="Return Element";
if (true) return _element;
 //BA.debugLineNum = 647;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _json2map(String _strjson) throws Exception{
com.ab.banano.BANanoJSONParser _json = null;
anywheresoftware.b4a.objects.collections.Map _map1 = null;
 //BA.debugLineNum = 77;BA.debugLine="Sub Json2Map(strJSON As String) As Map";
 //BA.debugLineNum = 78;BA.debugLine="Dim json As BANanoJSONParser";
_json = new com.ab.banano.BANanoJSONParser();
 //BA.debugLineNum = 79;BA.debugLine="Dim Map1 As Map";
_map1 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 80;BA.debugLine="Map1.Initialize";
_map1.Initialize();
 //BA.debugLineNum = 81;BA.debugLine="Map1.clear";
_map1.Clear();
 //BA.debugLineNum = 82;BA.debugLine="Try";
try { //BA.debugLineNum = 83;BA.debugLine="If strJSON.length > 0 Then";
if (_strjson.length()>0) { 
 //BA.debugLineNum = 84;BA.debugLine="json.Initialize(strJSON)";
_json.Initialize(_strjson);
 //BA.debugLineNum = 85;BA.debugLine="Map1 = json.NextObject";
_map1 = _json.NextObject();
 };
 //BA.debugLineNum = 87;BA.debugLine="Return Map1";
if (true) return _map1;
 } 
       catch (Exception e12) {
			ba.setLastException(e12); //BA.debugLineNum = 89;BA.debugLine="Return Map1";
if (true) return _map1;
 };
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _onaftereditstart(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 340;BA.debugLine="Sub OnAfterEditStart(cb As BANanoObject) As WixEle";
 //BA.debugLineNum = 341;BA.debugLine="On.Put(\"onAfterEditStart\",cb)";
_on.Put((Object)("onAfterEditStart"),(Object)(_cb));
 //BA.debugLineNum = 342;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 343;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _onaftereditstop(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 345;BA.debugLine="Sub OnAfterEditStop(cb As BANanoObject) As WixElem";
 //BA.debugLineNum = 346;BA.debugLine="On.Put(\"onAfterEditStop\",cb)";
_on.Put((Object)("onAfterEditStop"),(Object)(_cb));
 //BA.debugLineNum = 347;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 348;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _onafterload(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 265;BA.debugLine="Sub OnAfterLoad(cb As BANanoObject) As WixElement";
 //BA.debugLineNum = 266;BA.debugLine="On.Put(\"onAfterLoad\",cb)";
_on.Put((Object)("onAfterLoad"),(Object)(_cb));
 //BA.debugLineNum = 267;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 268;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _onafterselect(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 324;BA.debugLine="Sub OnAfterSelect(cb As BANanoObject) As WixElemen";
 //BA.debugLineNum = 325;BA.debugLine="On.Put(\"onAfterSelect\",cb)";
_on.Put((Object)("onAfterSelect"),(Object)(_cb));
 //BA.debugLineNum = 326;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 327;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _onaftertabclick(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 290;BA.debugLine="Sub OnAfterTabClick(cb As BANanoObject) As WixElem";
 //BA.debugLineNum = 291;BA.debugLine="On.Put(\"onAfterTabClick\",cb)";
_on.Put((Object)("onAfterTabClick"),(Object)(_cb));
 //BA.debugLineNum = 292;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 293;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _onafterunselect(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 362;BA.debugLine="Sub OnAfterUnSelect(cb As BANanoObject) As WixElem";
 //BA.debugLineNum = 363;BA.debugLine="On.Put(\"onAfterUnSelect\",cb)";
_on.Put((Object)("onAfterUnSelect"),(Object)(_cb));
 //BA.debugLineNum = 364;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 365;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _onbeforeload(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 260;BA.debugLine="Sub OnBeforeLoad(cb As BANanoObject) As WixElement";
 //BA.debugLineNum = 261;BA.debugLine="On.Put(\"onBeforeLoad\",cb)";
_on.Put((Object)("onBeforeLoad"),(Object)(_cb));
 //BA.debugLineNum = 262;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 263;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _onchange(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 270;BA.debugLine="Sub OnChange(cb As BANanoObject) As WixElement";
 //BA.debugLineNum = 271;BA.debugLine="On.Put(\"onChange\",cb)";
_on.Put((Object)("onChange"),(Object)(_cb));
 //BA.debugLineNum = 272;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 273;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _oncheck(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 295;BA.debugLine="Sub OnCheck(cb As BANanoObject) As WixElement";
 //BA.debugLineNum = 296;BA.debugLine="On.Put(\"onCheck\",cb)";
_on.Put((Object)("onCheck"),(Object)(_cb));
 //BA.debugLineNum = 297;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 298;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _onclick(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 351;BA.debugLine="Sub OnClick(cb As BANanoObject) As WixElement";
 //BA.debugLineNum = 352;BA.debugLine="On.Put(\"onClick\",cb)";
_on.Put((Object)("onClick"),(Object)(_cb));
 //BA.debugLineNum = 353;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 354;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _onenter(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 275;BA.debugLine="Sub OnEnter(cb As BANanoObject) As WixElement";
 //BA.debugLineNum = 276;BA.debugLine="On.Put(\"onEnter\",cb)";
_on.Put((Object)("onEnter"),(Object)(_cb));
 //BA.debugLineNum = 277;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 278;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _onfileupload(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 318;BA.debugLine="Sub OnFileUpload(cb As BANanoObject) As WixElement";
 //BA.debugLineNum = 319;BA.debugLine="On.Put(\"onFileUpload\",cb)";
_on.Put((Object)("onFileUpload"),(Object)(_cb));
 //BA.debugLineNum = 320;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 321;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _onfileuploaderror(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 312;BA.debugLine="Sub OnFileUploadError(cb As BANanoObject) As WixEl";
 //BA.debugLineNum = 313;BA.debugLine="On.Put(\"onFileUploadError\",cb)";
_on.Put((Object)("onFileUploadError"),(Object)(_cb));
 //BA.debugLineNum = 314;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 315;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _onitemclick(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 329;BA.debugLine="Sub OnItemClick(cb As BANanoObject) As WixElement";
 //BA.debugLineNum = 330;BA.debugLine="On.Put(\"onItemClick\",cb)";
_on.Put((Object)("onItemClick"),(Object)(_cb));
 //BA.debugLineNum = 331;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 332;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _onitemdblclick(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 334;BA.debugLine="Sub OnItemDblClick(cb As BANanoObject) As WixEleme";
 //BA.debugLineNum = 335;BA.debugLine="On.Put(\"onItemDblClick\",cb)";
_on.Put((Object)("onItemDblClick"),(Object)(_cb));
 //BA.debugLineNum = 336;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 337;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _onkeypress(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 255;BA.debugLine="Sub OnKeyPress(cb As BANanoObject) As WixElement";
 //BA.debugLineNum = 256;BA.debugLine="On.Put(\"onKeyPress\",cb)";
_on.Put((Object)("onKeyPress"),(Object)(_cb));
 //BA.debugLineNum = 257;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 258;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _onliveedit(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 280;BA.debugLine="Sub OnLiveEdit(cb As BANanoObject) As WixElement";
 //BA.debugLineNum = 281;BA.debugLine="On.Put(\"onLiveEdit\",cb)";
_on.Put((Object)("onLiveEdit"),(Object)(_cb));
 //BA.debugLineNum = 282;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 283;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _onmenuitemclick(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 356;BA.debugLine="Sub OnMenuItemClick(cb As BANanoObject) As WixElem";
 //BA.debugLineNum = 357;BA.debugLine="On.Put(\"onMenuItemClick\",cb)";
_on.Put((Object)("onMenuItemClick"),(Object)(_cb));
 //BA.debugLineNum = 358;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 359;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _onselectchange(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 301;BA.debugLine="Sub OnSelectChange(cb As BANanoObject) As WixEleme";
 //BA.debugLineNum = 302;BA.debugLine="On.put(\"onSelectChange\",cb)";
_on.Put((Object)("onSelectChange"),(Object)(_cb));
 //BA.debugLineNum = 303;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 304;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _ontimedkeypress(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 285;BA.debugLine="Sub OnTimedKeyPress(cb As BANanoObject) As WixElem";
 //BA.debugLineNum = 286;BA.debugLine="On.Put(\"onTimedKeyPress\",cb)";
_on.Put((Object)("onTimedKeyPress"),(Object)(_cb));
 //BA.debugLineNum = 287;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 288;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _onuploadcomplete(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 307;BA.debugLine="Sub OnUploadComplete(cb As BANanoObject) As WixEle";
 //BA.debugLineNum = 308;BA.debugLine="On.Put(\"onUploadComplete\",cb)";
_on.Put((Object)("onUploadComplete"),(Object)(_cb));
 //BA.debugLineNum = 309;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 310;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setalign(String _r) throws Exception{
 //BA.debugLineNum = 819;BA.debugLine="Sub SetAlign(r As String) As WixElement 'ignore";
 //BA.debugLineNum = 820;BA.debugLine="SetAttr(\"align\", r)";
_setattr("align",(Object)(_r));
 //BA.debugLineNum = 821;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 822;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 807;BA.debugLine="Sub SetAlignCenter(r As String) As WixElement 'ign";
 //BA.debugLineNum = 808;BA.debugLine="SetAlign(\"center\")";
_setalign("center");
 //BA.debugLineNum = 809;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 810;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 813;BA.debugLine="Sub SetAlignLeft(r As String) As WixElement 'ignor";
 //BA.debugLineNum = 814;BA.debugLine="SetAlign(\"left\")";
_setalign("left");
 //BA.debugLineNum = 815;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 816;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 801;BA.debugLine="Sub SetAlignRight(r As String) As WixElement 'igno";
 //BA.debugLineNum = 802;BA.debugLine="SetAlign(\"right\")";
_setalign("right");
 //BA.debugLineNum = 803;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 804;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setanimate(boolean _b) throws Exception{
 //BA.debugLineNum = 476;BA.debugLine="Sub SetAnimate(b As Boolean) As WixElement";
 //BA.debugLineNum = 477;BA.debugLine="SetAttr(\"animate\",b)";
_setattr("animate",(Object)(_b));
 //BA.debugLineNum = 478;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 479;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setattr(String _p,Object _v) throws Exception{
 //BA.debugLineNum = 618;BA.debugLine="Sub SetAttr(p As String, v As Object) As WixElemen";
 //BA.debugLineNum = 619;BA.debugLine="Element.Put(p,v)";
_element.Put((Object)(_p),_v);
 //BA.debugLineNum = 620;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 621;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setautoheight(boolean _b) throws Exception{
 //BA.debugLineNum = 150;BA.debugLine="Sub SetAutoHeight(b As Boolean) As WixElement";
 //BA.debugLineNum = 151;BA.debugLine="SetAttr(\"autoheight\", b)";
_setattr("autoheight",(Object)(_b));
 //BA.debugLineNum = 152;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setautowidth(boolean _b) throws Exception{
 //BA.debugLineNum = 175;BA.debugLine="Sub SetAutoWidth(b As Boolean) As WixElement";
 //BA.debugLineNum = 176;BA.debugLine="SetAttr(\"autowidth\", b)";
_setattr("autowidth",(Object)(_b));
 //BA.debugLineNum = 177;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 178;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setbatch(int _b) throws Exception{
 //BA.debugLineNum = 470;BA.debugLine="Sub SetBatch(b As Int) As WixElement";
 //BA.debugLineNum = 471;BA.debugLine="SetAttr(\"batch\",b)";
_setattr("batch",(Object)(_b));
 //BA.debugLineNum = 472;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 473;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setbody(Object _b) throws Exception{
 //BA.debugLineNum = 561;BA.debugLine="Sub SetBody(b As Object) As WixElement";
 //BA.debugLineNum = 562;BA.debugLine="SetAttr(\"body\", b)";
_setattr("body",_b);
 //BA.debugLineNum = 563;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 564;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setborderless(boolean _b) throws Exception{
 //BA.debugLineNum = 212;BA.debugLine="Sub SetBorderLess(b As Boolean) As WixElement";
 //BA.debugLineNum = 213;BA.debugLine="SetAttr(\"borderless\", b)";
_setattr("borderless",(Object)(_b));
 //BA.debugLineNum = 214;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 215;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setclick(com.ab.banano.BANanoObject _c) throws Exception{
 //BA.debugLineNum = 668;BA.debugLine="Sub SetClick(c As BANanoObject) As WixElement";
 //BA.debugLineNum = 669;BA.debugLine="Element.Put(\"click\", c)";
_element.Put((Object)("click"),(Object)(_c));
 //BA.debugLineNum = 670;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 671;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setcollapsed(boolean _c) throws Exception{
 //BA.debugLineNum = 892;BA.debugLine="Sub SetCollapsed(c As Boolean) As WixElement";
 //BA.debugLineNum = 893;BA.debugLine="SetAttr(\"collapsed\", c)";
_setattr("collapsed",(Object)(_c));
 //BA.debugLineNum = 894;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 895;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setcontainer(String _c) throws Exception{
 //BA.debugLineNum = 206;BA.debugLine="Sub SetContainer(c As String) As WixElement";
 //BA.debugLineNum = 207;BA.debugLine="SetAttr(\"container\", c)";
_setattr("container",(Object)(_c));
 //BA.debugLineNum = 208;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 209;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setcss(String _cs) throws Exception{
 //BA.debugLineNum = 603;BA.debugLine="Sub SetCSS(cs As String) As WixElement";
 //BA.debugLineNum = 604;BA.debugLine="SetAttr(\"css\", cs)";
_setattr("css",(Object)(_cs));
 //BA.debugLineNum = 605;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 606;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setcssjson(String _json) throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
String _mk = "";
Object _mv = null;
 //BA.debugLineNum = 608;BA.debugLine="Sub SetCSSJSON(json As String) As WixElement";
 //BA.debugLineNum = 609;BA.debugLine="Dim m As Map = Json2Map(json)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = _json2map(_json);
 //BA.debugLineNum = 610;BA.debugLine="For Each mk As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _m.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_mk = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 611;BA.debugLine="Dim mv As Object = m.Get(mk)";
_mv = _m.Get((Object)(_mk));
 //BA.debugLineNum = 612;BA.debugLine="SetStyle(mk, mv)";
_setstyle(_mk,BA.ObjectToString(_mv));
 }
};
 //BA.debugLineNum = 614;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 615;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setdata(anywheresoftware.b4a.objects.collections.List _d) throws Exception{
 //BA.debugLineNum = 549;BA.debugLine="Sub SetData(d As List) As WixElement";
 //BA.debugLineNum = 550;BA.debugLine="Element.Put(\"data\", d)";
_element.Put((Object)("data"),(Object)(_d.getObject()));
 //BA.debugLineNum = 551;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 552;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setdefaultalign(String _a) throws Exception{
 //BA.debugLineNum = 441;BA.debugLine="Sub SetDefaultAlign(a As String) As WixElement";
 //BA.debugLineNum = 442;BA.debugLine="elementsConfig.Put(\"align\", a)";
_elementsconfig.Put((Object)("align"),(Object)(_a));
 //BA.debugLineNum = 443;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 444;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setdefaultbottompadding(int _w) throws Exception{
 //BA.debugLineNum = 458;BA.debugLine="Sub SetDefaultBottomPadding(w As Int) As WixElemen";
 //BA.debugLineNum = 459;BA.debugLine="elementsConfig.Put(\"bottomPadding\", w)";
_elementsconfig.Put((Object)("bottomPadding"),(Object)(_w));
 //BA.debugLineNum = 460;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 461;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setdefaultheight(int _h) throws Exception{
 //BA.debugLineNum = 453;BA.debugLine="Sub SetDefaultHeight(h As Int) As WixElement";
 //BA.debugLineNum = 454;BA.debugLine="elementsConfig.Put(\"height\", h)";
_elementsconfig.Put((Object)("height"),(Object)(_h));
 //BA.debugLineNum = 455;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 456;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setdefaultlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 422;BA.debugLine="Sub SetDefaultLabelAlign(a As String) As WixElemen";
 //BA.debugLineNum = 423;BA.debugLine="elementsConfig.Put(\"labelAlign\", a)";
_elementsconfig.Put((Object)("labelAlign"),(Object)(_a));
 //BA.debugLineNum = 424;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 425;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setdefaultlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 435;BA.debugLine="Sub SetDefaultLabelPosition(p As String) As WixEle";
 //BA.debugLineNum = 436;BA.debugLine="elementsConfig.Put(\"labelPosition\", p)";
_elementsconfig.Put((Object)("labelPosition"),(Object)(_p));
 //BA.debugLineNum = 437;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 438;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setdefaultlabelwidth(int _a) throws Exception{
 //BA.debugLineNum = 428;BA.debugLine="Sub SetDefaultLabelWidth(a As Int) As WixElement";
 //BA.debugLineNum = 429;BA.debugLine="elementsConfig.Put(\"labelWidth\", a)";
_elementsconfig.Put((Object)("labelWidth"),(Object)(_a));
 //BA.debugLineNum = 430;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 431;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setdefaulttype(String _a) throws Exception{
 //BA.debugLineNum = 398;BA.debugLine="Sub SetDefaultType(a As String) As WixElement";
 //BA.debugLineNum = 399;BA.debugLine="elementsConfig.Put(\"type\", a)";
_elementsconfig.Put((Object)("type"),(Object)(_a));
 //BA.debugLineNum = 400;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 401;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setdefaulttypeicon(String _r) throws Exception{
 //BA.debugLineNum = 916;BA.debugLine="Sub SetDefaultTypeIcon(r As String) As WixElement";
 //BA.debugLineNum = 917;BA.debugLine="SetDefaultType(\"icon\")";
_setdefaulttype("icon");
 //BA.debugLineNum = 918;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 919;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setdefaulttypeiconbutton(String _r) throws Exception{
 //BA.debugLineNum = 898;BA.debugLine="Sub SetDefaultTypeIconButton(r As String) As WixEl";
 //BA.debugLineNum = 899;BA.debugLine="SetDefaultType(\"iconButton\")";
_setdefaulttype("iconButton");
 //BA.debugLineNum = 900;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 901;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setdefaulttypeiconbuttontop(String _r) throws Exception{
 //BA.debugLineNum = 922;BA.debugLine="Sub SetDefaultTypeIconButtonTop(r As String) As Wi";
 //BA.debugLineNum = 923;BA.debugLine="SetDefaultType(\"iconButtonTop\")";
_setdefaulttype("iconButtonTop");
 //BA.debugLineNum = 924;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 925;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setdefaulttypeimage(String _r) throws Exception{
 //BA.debugLineNum = 910;BA.debugLine="Sub SetDefaultTypeImage(r As String) As WixElement";
 //BA.debugLineNum = 911;BA.debugLine="SetDefaultType(\"image\")";
_setdefaulttype("image");
 //BA.debugLineNum = 912;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 913;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setdefaulttypeimagebutton(String _r) throws Exception{
 //BA.debugLineNum = 904;BA.debugLine="Sub SetDefaultTypeImageButton(r As String) As WixE";
 //BA.debugLineNum = 905;BA.debugLine="SetDefaultType(\"imageButton\")";
_setdefaulttype("imageButton");
 //BA.debugLineNum = 906;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 907;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setdefaultview(String _a) throws Exception{
 //BA.debugLineNum = 392;BA.debugLine="Sub SetDefaultView(a As String) As WixElement";
 //BA.debugLineNum = 393;BA.debugLine="elementsConfig.Put(\"view\", a)";
_elementsconfig.Put((Object)("view"),(Object)(_a));
 //BA.debugLineNum = 394;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 395;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setdefaultwidth(int _w) throws Exception{
 //BA.debugLineNum = 447;BA.debugLine="Sub SetDefaultWidth(w As Int) As WixElement";
 //BA.debugLineNum = 448;BA.debugLine="elementsConfig.Put(\"width\", w)";
_elementsconfig.Put((Object)("width"),(Object)(_w));
 //BA.debugLineNum = 449;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 450;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setelementsconfigjson(String _json) throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
String _mk = "";
Object _mv = null;
 //BA.debugLineNum = 19;BA.debugLine="Sub SetElementsConfigJSON(json As String) As WixEl";
 //BA.debugLineNum = 20;BA.debugLine="Dim m As Map = Json2Map(json)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = _json2map(_json);
 //BA.debugLineNum = 21;BA.debugLine="For Each mk As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _m.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_mk = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 22;BA.debugLine="Dim mv As Object = m.Get(mk)";
_mv = _m.Get((Object)(_mk));
 //BA.debugLineNum = 23;BA.debugLine="elementsConfig.Put(mk,mv)";
_elementsconfig.Put((Object)(_mk),_mv);
 }
};
 //BA.debugLineNum = 25;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setgravity(int _g) throws Exception{
 //BA.debugLineNum = 567;BA.debugLine="Sub SetGravity(g As Int) As WixElement";
 //BA.debugLineNum = 568;BA.debugLine="SetAttr(\"gravity\", g)";
_setattr("gravity",(Object)(_g));
 //BA.debugLineNum = 569;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 570;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setheader(Object _h) throws Exception{
 //BA.debugLineNum = 555;BA.debugLine="Sub SetHeader(h As Object) As WixElement";
 //BA.debugLineNum = 556;BA.debugLine="SetAttr(\"header\", h)";
_setattr("header",_h);
 //BA.debugLineNum = 557;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 558;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 591;BA.debugLine="Sub SetHeight(h As Object) As WixElement";
 //BA.debugLineNum = 592;BA.debugLine="SetAttr(\"height\", h)";
_setattr("height",_h);
 //BA.debugLineNum = 593;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 594;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _sethidden(boolean _b) throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub SetHidden(b As Boolean) As WixElement";
 //BA.debugLineNum = 65;BA.debugLine="SetAttr(\"hidden\", b)";
_setattr("hidden",(Object)(_b));
 //BA.debugLineNum = 66;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _sethtmlattr(String _attrname,Object _attrvalue) throws Exception{
 //BA.debugLineNum = 624;BA.debugLine="Sub SetHTMLAttr(attrName As String, attrValue As O";
 //BA.debugLineNum = 625;BA.debugLine="HTMLAttributes.put(attrName,attrValue)";
_htmlattributes.Put((Object)(_attrname),_attrvalue);
 //BA.debugLineNum = 626;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 627;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _seticon(String _i) throws Exception{
 //BA.debugLineNum = 656;BA.debugLine="Sub SetIcon(i As String) As WixElement";
 //BA.debugLineNum = 657;BA.debugLine="SetAttr(\"icon\", i)";
_setattr("icon",(Object)(_i));
 //BA.debugLineNum = 658;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 659;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setinputwidth(int _w) throws Exception{
 //BA.debugLineNum = 518;BA.debugLine="Sub SetInputWidth(w As Int) As WixElement";
 //BA.debugLineNum = 519;BA.debugLine="SetAttr(\"inputWidth\", w)";
_setattr("inputWidth",(Object)(_w));
 //BA.debugLineNum = 520;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 521;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 662;BA.debugLine="Sub SetLabel(l As String) As WixElement";
 //BA.debugLineNum = 663;BA.debugLine="SetAttr(\"label\", l)";
_setattr("label",(Object)(_l));
 //BA.debugLineNum = 664;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 665;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 404;BA.debugLine="Sub SetLabelAlign(a As String) As WixElement";
 //BA.debugLineNum = 405;BA.debugLine="SetAttr(\"labelAlign\", a)";
_setattr("labelAlign",(Object)(_a));
 //BA.debugLineNum = 406;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 407;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setlabelheight(int _h) throws Exception{
 //BA.debugLineNum = 224;BA.debugLine="Sub SetLabelHeight(h As Int) As WixElement";
 //BA.debugLineNum = 225;BA.debugLine="SetAttr(\"labelHeight\", h)";
_setattr("labelHeight",(Object)(_h));
 //BA.debugLineNum = 226;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 227;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 416;BA.debugLine="Sub SetLabelPosition(p As String) As WixElement";
 //BA.debugLineNum = 417;BA.debugLine="SetAttr(\"labelPosition\", p)";
_setattr("labelPosition",(Object)(_p));
 //BA.debugLineNum = 418;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 419;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setlabelwidth(int _a) throws Exception{
 //BA.debugLineNum = 410;BA.debugLine="Sub SetLabelWidth(a As Int) As WixElement";
 //BA.debugLineNum = 411;BA.debugLine="SetAttr(\"labelWidth\", a)";
_setattr("labelWidth",(Object)(_a));
 //BA.debugLineNum = 412;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 413;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setlocalid(String _i) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub SetLocalID(i As String) As WixElement";
 //BA.debugLineNum = 71;BA.debugLine="SetAttr(\"localId\", i)";
_setattr("localId",(Object)(_i));
 //BA.debugLineNum = 72;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 760;BA.debugLine="Sub SetMap(m As Map) As WixElement";
 //BA.debugLineNum = 761;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 762;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 763;BA.debugLine="SetAttr(strKey,	strVal)";
_setattr(_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 765;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 766;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setmargin(String _margin) throws Exception{
 //BA.debugLineNum = 512;BA.debugLine="Sub SetMargin(margin As String) As WixElement";
 //BA.debugLineNum = 513;BA.debugLine="Element.Put(\"margin\", margin)";
_element.Put((Object)("margin"),(Object)(_margin));
 //BA.debugLineNum = 514;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 515;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setmaxheight(int _h) throws Exception{
 //BA.debugLineNum = 506;BA.debugLine="Sub SetMaxHeight(h As Int) As WixElement";
 //BA.debugLineNum = 507;BA.debugLine="Element.Put(\"maxHeight\", h)";
_element.Put((Object)("maxHeight"),(Object)(_h));
 //BA.debugLineNum = 508;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 509;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setmaxwidth(int _w) throws Exception{
 //BA.debugLineNum = 500;BA.debugLine="Sub SetMaxWidth(w As Int) As WixElement";
 //BA.debugLineNum = 501;BA.debugLine="Element.Put(\"maxWidth\", w)";
_element.Put((Object)("maxWidth"),(Object)(_w));
 //BA.debugLineNum = 502;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 503;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 494;BA.debugLine="Sub SetMinHeight(h As Int) As WixElement";
 //BA.debugLineNum = 495;BA.debugLine="Element.Put(\"minHeight\", h)";
_element.Put((Object)("minHeight"),(Object)(_h));
 //BA.debugLineNum = 496;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 497;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 488;BA.debugLine="Sub SetMinWidth(w As Int) As WixElement";
 //BA.debugLineNum = 489;BA.debugLine="Element.put(\"minwidth\",w)";
_element.Put((Object)("minwidth"),(Object)(_w));
 //BA.debugLineNum = 490;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 491;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setmultiview(boolean _b) throws Exception{
 //BA.debugLineNum = 650;BA.debugLine="Sub SetMultiView(b As Boolean) As WixElement";
 //BA.debugLineNum = 651;BA.debugLine="SetAttr(\"multiview\", b)";
_setattr("multiview",(Object)(_b));
 //BA.debugLineNum = 652;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 653;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setname(String _n) throws Exception{
 //BA.debugLineNum = 380;BA.debugLine="Sub SetName(n As String) As WixElement";
 //BA.debugLineNum = 381;BA.debugLine="SetAttr(\"name\", n)";
_setattr("name",(Object)(_n));
 //BA.debugLineNum = 382;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 383;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setoncondition(int _condition,String _prop,Object _propvalue) throws Exception{
 //BA.debugLineNum = 837;BA.debugLine="Sub SetOnCondition(Condition As Int, Prop As Strin";
 //BA.debugLineNum = 838;BA.debugLine="If Condition <= 0 Then Return Me";
if (_condition<=0) { 
if (true) return (b4j.example.wixelement)(this);};
 //BA.debugLineNum = 839;BA.debugLine="Element.put(Prop,PropValue)";
_element.Put((Object)(_prop),_propvalue);
 //BA.debugLineNum = 840;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 841;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setoptions(anywheresoftware.b4a.objects.collections.List _o) throws Exception{
 //BA.debugLineNum = 368;BA.debugLine="Sub SetOptions(o As List) As WixElement";
 //BA.debugLineNum = 369;BA.debugLine="SetAttr(\"options\", o)";
_setattr("options",(Object)(_o.getObject()));
 //BA.debugLineNum = 370;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 371;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setoptionsjson(String _json) throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
String _mk = "";
Object _mv = null;
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 28;BA.debugLine="Sub SetOptionsJSON(json As String) As WixElement";
 //BA.debugLineNum = 29;BA.debugLine="Dim m As Map = Json2Map(json)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = _json2map(_json);
 //BA.debugLineNum = 30;BA.debugLine="For Each mk As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _m.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_mk = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 31;BA.debugLine="Dim mv As Object = m.Get(mk)";
_mv = _m.Get((Object)(_mk));
 //BA.debugLineNum = 32;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 33;BA.debugLine="opt.Put(mk,mv)";
_opt.Put((Object)(_mk),_mv);
 //BA.debugLineNum = 34;BA.debugLine="options.Add(opt)";
_options.Add((Object)(_opt.getObject()));
 }
};
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setoptionsmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _mk = "";
Object _mv = null;
 //BA.debugLineNum = 49;BA.debugLine="Sub SetOptionsMAP(m As Map) As WixElement";
 //BA.debugLineNum = 50;BA.debugLine="For Each mk As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_mk = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 51;BA.debugLine="Dim mv As Object = m.Get(mk)";
_mv = _m.Get((Object)(_mk));
 //BA.debugLineNum = 52;BA.debugLine="AddOption(mk, mv)";
_addoption(_mk,_mv);
 }
};
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setpadding(String _padding) throws Exception{
 //BA.debugLineNum = 524;BA.debugLine="Sub SetPadding(padding As String) As WixElement";
 //BA.debugLineNum = 525;BA.debugLine="Element.Put(\"padding\", padding)";
_element.Put((Object)("padding"),(Object)(_padding));
 //BA.debugLineNum = 526;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 527;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setpaddingx(String _x) throws Exception{
 //BA.debugLineNum = 537;BA.debugLine="Sub SetPaddingX(x As String) As WixElement";
 //BA.debugLineNum = 538;BA.debugLine="Element.Put(\"paddingX\", x)";
_element.Put((Object)("paddingX"),(Object)(_x));
 //BA.debugLineNum = 539;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 540;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setpaddingy(String _y) throws Exception{
 //BA.debugLineNum = 543;BA.debugLine="Sub SetPaddingY(y As String) As WixElement";
 //BA.debugLineNum = 544;BA.debugLine="Element.Put(\"paddingY\",y)";
_element.Put((Object)("paddingY"),(Object)(_y));
 //BA.debugLineNum = 545;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 546;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setplaceholder(String _p) throws Exception{
 //BA.debugLineNum = 531;BA.debugLine="Sub SetPlaceHolder(p As String) As WixElement";
 //BA.debugLineNum = 532;BA.debugLine="Element.Put(\"placeHolder\", p)";
_element.Put((Object)("placeHolder"),(Object)(_p));
 //BA.debugLineNum = 533;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 534;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setrequired(boolean _b) throws Exception{
 //BA.debugLineNum = 386;BA.debugLine="Sub SetRequired(b As Boolean) As WixElement";
 //BA.debugLineNum = 387;BA.debugLine="SetAttr(\"required\", b)";
_setattr("required",(Object)(_b));
 //BA.debugLineNum = 388;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 389;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 163;BA.debugLine="Sub SetResponsive(b As Object) As WixElement";
 //BA.debugLineNum = 164;BA.debugLine="SetAttr(\"responsive\", b)";
_setattr("responsive",_b);
 //BA.debugLineNum = 165;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 166;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 169;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixElement";
 //BA.debugLineNum = 170;BA.debugLine="SetAttr(\"responsiveCell\", b)";
_setattr("responsiveCell",_b);
 //BA.debugLineNum = 171;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 172;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setscroll(Object _c) throws Exception{
 //BA.debugLineNum = 188;BA.debugLine="Sub SetScroll(c As Object) As WixElement";
 //BA.debugLineNum = 189;BA.debugLine="SetAttr(\"scroll\", c)";
_setattr("scroll",_c);
 //BA.debugLineNum = 190;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 191;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setscrollx(Object _b) throws Exception{
 //BA.debugLineNum = 200;BA.debugLine="Sub SetScrollX(b As Object) As WixElement";
 //BA.debugLineNum = 201;BA.debugLine="SetAttr(\"scrollX\", b)";
_setattr("scrollX",_b);
 //BA.debugLineNum = 202;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 203;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setscrolly(Object _b) throws Exception{
 //BA.debugLineNum = 194;BA.debugLine="Sub SetScrollY(b As Object) As WixElement";
 //BA.debugLineNum = 195;BA.debugLine="SetAttr(\"scrollY\", b)";
_setattr("scrollY",_b);
 //BA.debugLineNum = 196;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 197;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setselect(boolean _b) throws Exception{
 //BA.debugLineNum = 218;BA.debugLine="Sub SetSelect(b As Boolean) As WixElement";
 //BA.debugLineNum = 219;BA.debugLine="SetAttr(\"select\", b)";
_setattr("select",(Object)(_b));
 //BA.debugLineNum = 220;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 221;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setstate(Object _s) throws Exception{
 //BA.debugLineNum = 374;BA.debugLine="Sub SetState(s As Object) As WixElement";
 //BA.debugLineNum = 375;BA.debugLine="SetAttr(\"state\", s)";
_setattr("state",_s);
 //BA.debugLineNum = 376;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 377;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 482;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 483;BA.debugLine="Styles.Put(prop,val)";
_styles.Put((Object)(_prop),(Object)(_val));
 //BA.debugLineNum = 484;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 485;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setsuggest(Object _s) throws Exception{
 //BA.debugLineNum = 182;BA.debugLine="Sub SetSuggest(s As Object) As WixElement";
 //BA.debugLineNum = 183;BA.debugLine="SetAttr(\"suggest\", s)";
_setattr("suggest",_s);
 //BA.debugLineNum = 184;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 185;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _settemplate(Object _t) throws Exception{
 //BA.debugLineNum = 689;BA.debugLine="Sub SetTemplate(t As Object) As WixElement";
 //BA.debugLineNum = 690;BA.debugLine="Element.Put(\"template\", t)";
_element.Put((Object)("template"),_t);
 //BA.debugLineNum = 691;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 692;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 156;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixElement";
 //BA.debugLineNum = 157;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 158;BA.debugLine="SetTemplate(os)";
_settemplate((Object)(_os));
 //BA.debugLineNum = 159;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 230;BA.debugLine="Sub SetTooltip(tt As String) As WixElement";
 //BA.debugLineNum = 231;BA.debugLine="SetAttr(\"tooltip\", tt)";
_setattr("tooltip",(Object)(_tt));
 //BA.debugLineNum = 232;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 233;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _settype(String _t) throws Exception{
 //BA.debugLineNum = 585;BA.debugLine="Sub SetType(t As String) As WixElement";
 //BA.debugLineNum = 586;BA.debugLine="SetAttr(\"type\", t)";
_setattr("type",(Object)(_t));
 //BA.debugLineNum = 587;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 588;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _settypeclean(String _r) throws Exception{
 //BA.debugLineNum = 844;BA.debugLine="Sub SetTypeClean(r As String) As WixElement  'igno";
 //BA.debugLineNum = 845;BA.debugLine="SetType(\"clean\")";
_settype("clean");
 //BA.debugLineNum = 846;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 847;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _settypeform(String _r) throws Exception{
 //BA.debugLineNum = 874;BA.debugLine="Sub SetTypeForm(r As String) As WixElement		'ignor";
 //BA.debugLineNum = 875;BA.debugLine="SetType(\"form\")";
_settype("form");
 //BA.debugLineNum = 876;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 877;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _settypehead(String _r) throws Exception{
 //BA.debugLineNum = 868;BA.debugLine="Sub SetTypeHead(r As String) As WixElement		'ignor";
 //BA.debugLineNum = 869;BA.debugLine="SetType(\"head\")";
_settype("head");
 //BA.debugLineNum = 870;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 871;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _settypeline(String _r) throws Exception{
 //BA.debugLineNum = 850;BA.debugLine="Sub SetTypeLine(r As String) As WixElement   'igno";
 //BA.debugLineNum = 851;BA.debugLine="SetType(\"line\")";
_settype("line");
 //BA.debugLineNum = 852;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 853;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _settypespace(String _r) throws Exception{
 //BA.debugLineNum = 862;BA.debugLine="Sub SetTypeSpace(r As String) As WixElement   'ign";
 //BA.debugLineNum = 863;BA.debugLine="SetType(\"space\")";
_settype("space");
 //BA.debugLineNum = 864;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 865;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _settypewide(String _r) throws Exception{
 //BA.debugLineNum = 856;BA.debugLine="Sub SetTypeWide(r As String) As WixElement   'igno";
 //BA.debugLineNum = 857;BA.debugLine="SetType(\"wide\")";
_settype("wide");
 //BA.debugLineNum = 858;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 859;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 579;BA.debugLine="Sub SetValue(v As String) As WixElement";
 //BA.debugLineNum = 580;BA.debugLine="SetAttr(\"value\", v)";
_setattr("value",(Object)(_v));
 //BA.debugLineNum = 581;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 582;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setview(String _v) throws Exception{
 //BA.debugLineNum = 573;BA.debugLine="Sub SetView(v As String) As WixElement";
 //BA.debugLineNum = 574;BA.debugLine="SetAttr(\"view\", v)";
_setattr("view",(Object)(_v));
 //BA.debugLineNum = 575;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 576;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setviewheaderlayout(String _r) throws Exception{
 //BA.debugLineNum = 881;BA.debugLine="Sub SetViewHeaderLayout(r As String) As WixElement";
 //BA.debugLineNum = 882;BA.debugLine="SetView(\"headerlayout\")";
_setview("headerlayout");
 //BA.debugLineNum = 883;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 884;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setvisiblebatch(int _b) throws Exception{
 //BA.debugLineNum = 464;BA.debugLine="Sub SetVisibleBatch(b As Int) As WixElement";
 //BA.debugLineNum = 465;BA.debugLine="SetAttr(\"visibleBatch\", b)";
_setattr("visibleBatch",(Object)(_b));
 //BA.debugLineNum = 466;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 467;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 597;BA.debugLine="Sub SetWidth(w As Object) As WixElement";
 //BA.debugLineNum = 598;BA.debugLine="SetAttr(\"width\", w)";
_setattr("width",_w);
 //BA.debugLineNum = 599;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 600;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
