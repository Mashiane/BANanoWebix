package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixdatatable extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixdatatable", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixdatatable.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _datatable = null;
public boolean _autoconfig = false;
public String _dt_sort_int = "";
public String _dt_sort_date = "";
public String _dt_sort_string = "";
public String _dt_sort_string_strict = "";
public String _dt_sort_text = "";
public String _dt_sort_server = "";
public String _dt_sort_raw = "";
public String _dt_data_type_xml = "";
public String _dt_data_type_csv = "";
public String _dt_data_type_jsarray = "";
public String _dt_data_type_json = "";
public String _dt_edit_action_dblclick = "";
public String _dt_select_row = "";
public String _dt_select_cell = "";
public String _dt_select_column = "";
public String _dt_adjust_data = "";
public String _dt_adjust_header = "";
public boolean _dt_adjust_true = false;
public anywheresoftware.b4a.objects.collections.List _columns = null;
public b4j.example.main _main = null;
public b4j.example.pgtabbar _pgtabbar = null;
public b4j.example.pgtree _pgtree = null;
public b4j.example.pgmenu _pgmenu = null;
public b4j.example.pglist _pglist = null;
public b4j.example.pgdataview _pgdataview = null;
public b4j.example.pgdatatable1 _pgdatatable1 = null;
public b4j.example.pgdatatable _pgdatatable = null;
public b4j.example.pgcharts _pgcharts = null;
public b4j.example.pgdataentry _pgdataentry = null;
public b4j.example.pgforms1 _pgforms1 = null;
public b4j.example.pgforms _pgforms = null;
public b4j.example.pgtoolbar _pgtoolbar = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.pgmultiview _pgmultiview = null;
public b4j.example.pglayouts1 _pglayouts1 = null;
public b4j.example.pglayouts2 _pglayouts2 = null;
public b4j.example.pglayouts _pglayouts = null;
public b4j.example.pglayout _pglayout = null;
public b4j.example.pgunitlist _pgunitlist = null;
public b4j.example.pgpropertysheet _pgpropertysheet = null;
public b4j.example.pgtreetable _pgtreetable = null;
public b4j.example.pgsidebar _pgsidebar = null;
public b4j.example.pgcomments _pgcomments = null;
public b4j.example.pggrouplist _pggrouplist = null;
public b4j.example.pgcontext _pgcontext = null;
public b4j.example.pggooglemap _pggooglemap = null;
public b4j.example.pguploader1 _pguploader1 = null;
public b4j.example.pguploader2 _pguploader2 = null;
public b4j.example.pguploader3 _pguploader3 = null;
public String  _addedittrash() throws Exception{
b4j.example.wixdatacolumn _e = null;
b4j.example.wixdatacolumn _d = null;
 //BA.debugLineNum = 78;BA.debugLine="Sub AddEditTrash";
 //BA.debugLineNum = 79;BA.debugLine="Dim e As WixDataColumn";
_e = new b4j.example.wixdatacolumn();
 //BA.debugLineNum = 80;BA.debugLine="e.Initialize2(\"edit\").SetHeader(\"Edit\").SetTempla";
_e._initialize2 /*b4j.example.wixdatacolumn*/ ("edit")._setheader /*b4j.example.wixdatacolumn*/ ("Edit")._settemplate /*b4j.example.wixdatacolumn*/ ((Object)("{common.editIcon()}"))._setwidth /*b4j.example.wixdatacolumn*/ ((int) (100));
 //BA.debugLineNum = 81;BA.debugLine="Dim d As WixDataColumn";
_d = new b4j.example.wixdatacolumn();
 //BA.debugLineNum = 82;BA.debugLine="d.Initialize2(\"delete\").SetHeader(\"Delete\").SetTe";
_d._initialize2 /*b4j.example.wixdatacolumn*/ ("delete")._setheader /*b4j.example.wixdatacolumn*/ ("Delete")._settemplate /*b4j.example.wixdatacolumn*/ ((Object)("{common.trashIcon()}"))._setwidth /*b4j.example.wixdatacolumn*/ ((int) (100));
 //BA.debugLineNum = 83;BA.debugLine="Columns.Add(e.item)";
_columns.Add((Object)(_e._item /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 84;BA.debugLine="Columns.Add(d.item)";
_columns.Add((Object)(_d._item /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixdatatable  _addheader(String _sid,String _sheader,int _ifillspace) throws Exception{
anywheresoftware.b4a.objects.collections.Map _col = null;
 //BA.debugLineNum = 128;BA.debugLine="Sub AddHeader(sid As String, sheader As String, iF";
 //BA.debugLineNum = 129;BA.debugLine="Dim col As Map = CreateMap()";
_col = new anywheresoftware.b4a.objects.collections.Map();
_col = __c.createMap(new Object[] {});
 //BA.debugLineNum = 130;BA.debugLine="col.Put(\"id\", sid)";
_col.Put((Object)("id"),(Object)(_sid));
 //BA.debugLineNum = 131;BA.debugLine="col.Put(\"header\", sheader)";
_col.Put((Object)("header"),(Object)(_sheader));
 //BA.debugLineNum = 132;BA.debugLine="If iFillSpace > 0 Then";
if (_ifillspace>0) { 
 //BA.debugLineNum = 133;BA.debugLine="col.Put(\"fillspace\", iFillSpace)";
_col.Put((Object)("fillspace"),(Object)(_ifillspace));
 };
 //BA.debugLineNum = 135;BA.debugLine="Columns.Add(col)";
_columns.Add((Object)(_col.getObject()));
 //BA.debugLineNum = 136;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return null;
}
public String  _addheader1(b4j.example.wixdatacolumn _hdr) throws Exception{
 //BA.debugLineNum = 176;BA.debugLine="Sub AddHeader1(hdr As WixDataColumn)";
 //BA.debugLineNum = 177;BA.debugLine="Columns.Add(hdr.Item)";
_columns.Add((Object)(_hdr._item /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 178;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.example.wixform _frm) throws Exception{
 //BA.debugLineNum = 267;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 268;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 269;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public DataTable As WixElement";
_datatable = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private AutoConfig As Boolean";
_autoconfig = false;
 //BA.debugLineNum = 6;BA.debugLine="Public DT_SORT_INT As String = \"int\"";
_dt_sort_int = "int";
 //BA.debugLineNum = 7;BA.debugLine="Public DT_SORT_DATE As String = \"date\"";
_dt_sort_date = "date";
 //BA.debugLineNum = 8;BA.debugLine="Public DT_SORT_STRING As String = \"string\"";
_dt_sort_string = "string";
 //BA.debugLineNum = 9;BA.debugLine="Public DT_SORT_STRING_STRICT As String = \"string_";
_dt_sort_string_strict = "string_strict";
 //BA.debugLineNum = 10;BA.debugLine="Public DT_SORT_TEXT As String = \"text\"";
_dt_sort_text = "text";
 //BA.debugLineNum = 11;BA.debugLine="Public DT_SORT_SERVER As String = \"server\"";
_dt_sort_server = "server";
 //BA.debugLineNum = 12;BA.debugLine="Public DT_SORT_RAW As String = \"raw\"";
_dt_sort_raw = "raw";
 //BA.debugLineNum = 14;BA.debugLine="Public DT_DATA_TYPE_XML As String = \"xml\"";
_dt_data_type_xml = "xml";
 //BA.debugLineNum = 15;BA.debugLine="Public DT_DATA_TYPE_CSV As String = \"csv\"";
_dt_data_type_csv = "csv";
 //BA.debugLineNum = 16;BA.debugLine="Public DT_DATA_TYPE_JSARRAY As String = \"jsarray\"";
_dt_data_type_jsarray = "jsarray";
 //BA.debugLineNum = 17;BA.debugLine="Public DT_DATA_TYPE_JSON As String = \"json\"";
_dt_data_type_json = "json";
 //BA.debugLineNum = 19;BA.debugLine="Public DT_EDIT_ACTION_DBLCLICK As String = \"dblcl";
_dt_edit_action_dblclick = "dblclick";
 //BA.debugLineNum = 21;BA.debugLine="Public DT_SELECT_ROW As String = \"row\"";
_dt_select_row = "row";
 //BA.debugLineNum = 22;BA.debugLine="Public DT_SELECT_CELL As String = \"cell\"";
_dt_select_cell = "cell";
 //BA.debugLineNum = 23;BA.debugLine="Public DT_SELECT_COLUMN As String = \"column\"";
_dt_select_column = "column";
 //BA.debugLineNum = 25;BA.debugLine="Public DT_ADJUST_DATA As String = \"data\"";
_dt_adjust_data = "data";
 //BA.debugLineNum = 26;BA.debugLine="Public DT_ADJUST_HEADER As String = \"header\"";
_dt_adjust_header = "header";
 //BA.debugLineNum = 27;BA.debugLine="Public DT_ADJUST_TRUE As Boolean = True";
_dt_adjust_true = __c.True;
 //BA.debugLineNum = 28;BA.debugLine="Public Columns As List";
_columns = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixdatacolumn  _createheader(String _hid) throws Exception{
b4j.example.wixdatacolumn _hdr = null;
 //BA.debugLineNum = 180;BA.debugLine="Sub CreateHeader(hid As String) As WixDataColumn";
 //BA.debugLineNum = 181;BA.debugLine="Dim hdr As WixDataColumn";
_hdr = new b4j.example.wixdatacolumn();
 //BA.debugLineNum = 182;BA.debugLine="hdr.Initialize2(hid)";
_hdr._initialize2 /*b4j.example.wixdatacolumn*/ (_hid);
 //BA.debugLineNum = 183;BA.debugLine="Return hdr";
if (true) return _hdr;
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _initialize(anywheresoftware.b4a.BA _ba,String _tid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 119;BA.debugLine="Public Sub Initialize(tID As String) As WixDataTab";
 //BA.debugLineNum = 120;BA.debugLine="ID = tID.ToLowerCase";
_id = _tid.toLowerCase();
 //BA.debugLineNum = 121;BA.debugLine="DataTable.Initialize(ID).SetView(\"datatable\")";
_datatable._initialize /*b4j.example.wixelement*/ (ba,_id)._setview /*b4j.example.wixelement*/ ("datatable");
 //BA.debugLineNum = 122;BA.debugLine="AutoConfig = False";
_autoconfig = __c.False;
 //BA.debugLineNum = 123;BA.debugLine="Columns.Initialize";
_columns.Initialize();
 //BA.debugLineNum = 124;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 242;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 243;BA.debugLine="DataTable.SetAttr(\"columns\", Columns)";
_datatable._setattr /*b4j.example.wixelement*/ ("columns",(Object)(_columns.getObject()));
 //BA.debugLineNum = 244;BA.debugLine="DataTable.SetAttr(\"autoConfig\", AutoConfig)";
_datatable._setattr /*b4j.example.wixelement*/ ("autoConfig",(Object)(_autoconfig));
 //BA.debugLineNum = 245;BA.debugLine="Return DataTable.item";
if (true) return _datatable._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 246;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setautoconfig(boolean _a) throws Exception{
 //BA.debugLineNum = 249;BA.debugLine="Sub SetAutoConfig(a As Boolean) As WixDataTable";
 //BA.debugLineNum = 250;BA.debugLine="AutoConfig = a";
_autoconfig = _a;
 //BA.debugLineNum = 251;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 252;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setautoheight(boolean _b) throws Exception{
 //BA.debugLineNum = 164;BA.debugLine="Sub SetAutoHeight(b As Boolean) As WixDataTable";
 //BA.debugLineNum = 165;BA.debugLine="DataTable.SetAttr(\"autoheight\", b)";
_datatable._setattr /*b4j.example.wixelement*/ ("autoheight",(Object)(_b));
 //BA.debugLineNum = 166;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 167;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setautowidth(boolean _b) throws Exception{
 //BA.debugLineNum = 170;BA.debugLine="Sub SetAutoWidth(b As Boolean) As WixDataTable";
 //BA.debugLineNum = 171;BA.debugLine="DataTable.SetAttr(\"autowidth\", b)";
_datatable._setattr /*b4j.example.wixelement*/ ("autowidth",(Object)(_b));
 //BA.debugLineNum = 172;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setblockselect(boolean _b) throws Exception{
 //BA.debugLineNum = 205;BA.debugLine="Sub SetBlockSelect(b As Boolean) As WixDataTable";
 //BA.debugLineNum = 206;BA.debugLine="DataTable.SetAttr(\"blockselect\", b)";
_datatable._setattr /*b4j.example.wixelement*/ ("blockselect",(Object)(_b));
 //BA.debugLineNum = 207;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 208;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setborderless(boolean _b) throws Exception{
 //BA.debugLineNum = 217;BA.debugLine="Sub SetBorderLess(b As Boolean) As WixDataTable";
 //BA.debugLineNum = 218;BA.debugLine="DataTable.SetAttr(\"borderless\", b)";
_datatable._setattr /*b4j.example.wixelement*/ ("borderless",(Object)(_b));
 //BA.debugLineNum = 219;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 220;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setcolumnwidth(int _w) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Sub SetColumnWidth(w As Int) As WixDataTable";
 //BA.debugLineNum = 73;BA.debugLine="DataTable.SetAttr(\"columnWidth\", w)";
_datatable._setattr /*b4j.example.wixelement*/ ("columnWidth",(Object)(_w));
 //BA.debugLineNum = 74;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setcontainer(String _c) throws Exception{
 //BA.debugLineNum = 113;BA.debugLine="Sub SetContainer(c As String) As WixDataTable";
 //BA.debugLineNum = 114;BA.debugLine="DataTable.SetAttr(\"container\", c)";
_datatable._setattr /*b4j.example.wixelement*/ ("container",(Object)(_c));
 //BA.debugLineNum = 115;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setdata(anywheresoftware.b4a.objects.collections.List _data) throws Exception{
 //BA.debugLineNum = 272;BA.debugLine="Sub SetData(data As List) As WixDataTable";
 //BA.debugLineNum = 273;BA.debugLine="DataTable.SetData(data)";
_datatable._setdata /*b4j.example.wixelement*/ (_data);
 //BA.debugLineNum = 274;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 275;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setdatatype(String _t) throws Exception{
 //BA.debugLineNum = 146;BA.debugLine="Sub SetDataType(t As String) As WixDataTable";
 //BA.debugLineNum = 147;BA.debugLine="DataTable.SetAttr(\"datatype\", t)";
_datatable._setattr /*b4j.example.wixelement*/ ("datatype",(Object)(_t));
 //BA.debugLineNum = 148;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 149;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _seteditable(boolean _b) throws Exception{
 //BA.debugLineNum = 230;BA.debugLine="Sub SetEditable(b As Boolean) As WixDataTable";
 //BA.debugLineNum = 231;BA.debugLine="DataTable.SetAttr(\"editable\", b)";
_datatable._setattr /*b4j.example.wixelement*/ ("editable",(Object)(_b));
 //BA.debugLineNum = 232;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 233;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _seteditaction(String _a) throws Exception{
 //BA.debugLineNum = 211;BA.debugLine="Sub SetEditAction(a As String) As WixDataTable";
 //BA.debugLineNum = 212;BA.debugLine="DataTable.SetAttr(\"editaction\", a)";
_datatable._setattr /*b4j.example.wixelement*/ ("editaction",(Object)(_a));
 //BA.debugLineNum = 213;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 214;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setform(String _frmid) throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub SetForm(frmID As String) As WixDataTable";
 //BA.debugLineNum = 65;BA.debugLine="frmID = frmID.ToLowerCase";
_frmid = _frmid.toLowerCase();
 //BA.debugLineNum = 66;BA.debugLine="DataTable.SetAttr(\"form\", frmID)";
_datatable._setattr /*b4j.example.wixelement*/ ("form",(Object)(_frmid));
 //BA.debugLineNum = 67;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setheight(int _h) throws Exception{
 //BA.debugLineNum = 255;BA.debugLine="Sub SetHeight(h As Int) As WixDataTable";
 //BA.debugLineNum = 256;BA.debugLine="DataTable.SetHeight(h)";
_datatable._setheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 257;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 258;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _sethover(String _h) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Sub SetHover(h As String) As WixDataTable";
 //BA.debugLineNum = 89;BA.debugLine="DataTable.SetAttr(\"hover\", h)";
_datatable._setattr /*b4j.example.wixelement*/ ("hover",(Object)(_h));
 //BA.debugLineNum = 90;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setleftsplit(int _c) throws Exception{
 //BA.debugLineNum = 199;BA.debugLine="Sub SetLeftSplit(c As Int) As WixDataTable";
 //BA.debugLineNum = 200;BA.debugLine="DataTable.SetAttr(\"leftSplit\", c)";
_datatable._setattr /*b4j.example.wixelement*/ ("leftSplit",(Object)(_c));
 //BA.debugLineNum = 201;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 202;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setmultiselect(Object _s) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Sub SetMultiSelect(s As Object) As WixDataTable";
 //BA.debugLineNum = 107;BA.debugLine="DataTable.SetAttr(\"multiselect\", s)";
_datatable._setattr /*b4j.example.wixelement*/ ("multiselect",_s);
 //BA.debugLineNum = 108;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setpager(String _p) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub SetPager(p As String) As WixDataTable";
 //BA.debugLineNum = 34;BA.debugLine="p = p.tolowercase";
_p = _p.toLowerCase();
 //BA.debugLineNum = 35;BA.debugLine="DataTable.SetAttr(\"pager\", p)";
_datatable._setattr /*b4j.example.wixelement*/ ("pager",(Object)(_p));
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setresizecolumn(boolean _b) throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub SetResizeColumn(b As Boolean) As WixDataTable";
 //BA.debugLineNum = 59;BA.debugLine="DataTable.SetAttr(\"resizeColumn\", b)";
_datatable._setattr /*b4j.example.wixelement*/ ("resizeColumn",(Object)(_b));
 //BA.debugLineNum = 60;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setresizerow(boolean _b) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub SetResizeRow(b As Boolean) As WixDataTable";
 //BA.debugLineNum = 53;BA.debugLine="DataTable.SetAttr(\"resizeRow\", b)";
_datatable._setattr /*b4j.example.wixelement*/ ("resizeRow",(Object)(_b));
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setrightsplit(int _r) throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Sub SetRightSplit(r As Int) As WixDataTable";
 //BA.debugLineNum = 95;BA.debugLine="DataTable.SetAttr(\"rightSplit\", r)";
_datatable._setattr /*b4j.example.wixelement*/ ("rightSplit",(Object)(_r));
 //BA.debugLineNum = 96;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setrowheight(int _h) throws Exception{
 //BA.debugLineNum = 187;BA.debugLine="Sub SetRowHeight(h As Int) As WixDataTable";
 //BA.debugLineNum = 188;BA.debugLine="DataTable.SetAttr(\"rowHeight\", h)";
_datatable._setattr /*b4j.example.wixelement*/ ("rowHeight",(Object)(_h));
 //BA.debugLineNum = 189;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 190;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setscroll(boolean _b) throws Exception{
 //BA.debugLineNum = 140;BA.debugLine="Sub SetScroll(b As Boolean) As WixDataTable";
 //BA.debugLineNum = 141;BA.debugLine="DataTable.SetAttr(\"scroll\", b)";
_datatable._setattr /*b4j.example.wixelement*/ ("scroll",(Object)(_b));
 //BA.debugLineNum = 142;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setscrollx(boolean _b) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub SetScrollX(b As Boolean) As WixDataTable";
 //BA.debugLineNum = 47;BA.debugLine="DataTable.SetAttr(\"scrollX\", b)";
_datatable._setattr /*b4j.example.wixelement*/ ("scrollX",(Object)(_b));
 //BA.debugLineNum = 48;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setscrolly(boolean _b) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Sub SetScrollY(b As Boolean) As WixDataTable";
 //BA.debugLineNum = 41;BA.debugLine="DataTable.SetAttr(\"scrollY\", b)";
_datatable._setattr /*b4j.example.wixelement*/ ("scrollY",(Object)(_b));
 //BA.debugLineNum = 42;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setselect(Object _s) throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Sub SetSelect(s As Object) As WixDataTable";
 //BA.debugLineNum = 101;BA.debugLine="DataTable.SetAttr(\"select\", s)";
_datatable._setattr /*b4j.example.wixelement*/ ("select",_s);
 //BA.debugLineNum = 102;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 224;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 225;BA.debugLine="DataTable.SetStyle(prop,val)";
_datatable._setstyle /*b4j.example.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 226;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 227;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 236;BA.debugLine="Sub SetTooltip(tt As String) As WixDataTable";
 //BA.debugLineNum = 237;BA.debugLine="DataTable.SetTooltip(tt)";
_datatable._settooltip /*b4j.example.wixelement*/ (_tt);
 //BA.debugLineNum = 238;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 239;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _settopsplit(int _r) throws Exception{
 //BA.debugLineNum = 193;BA.debugLine="Sub SetTopSplit(r As Int) As WixDataTable";
 //BA.debugLineNum = 194;BA.debugLine="DataTable.SetAttr(\"topSplit\", r)";
_datatable._setattr /*b4j.example.wixelement*/ ("topSplit",(Object)(_r));
 //BA.debugLineNum = 195;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 196;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _seturl(String _u) throws Exception{
 //BA.debugLineNum = 158;BA.debugLine="Sub SetURL(u As String) As WixDataTable";
 //BA.debugLineNum = 159;BA.debugLine="DataTable.SetAttr(\"url\", u)";
_datatable._setattr /*b4j.example.wixelement*/ ("url",(Object)(_u));
 //BA.debugLineNum = 160;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setvisiblebatch(int _b) throws Exception{
 //BA.debugLineNum = 152;BA.debugLine="Sub SetVisibleBatch(b As Int) As WixDataTable";
 //BA.debugLineNum = 153;BA.debugLine="DataTable.SetAttr(\"visibleBatch\", b)";
_datatable._setattr /*b4j.example.wixelement*/ ("visibleBatch",(Object)(_b));
 //BA.debugLineNum = 154;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setwidth(int _h) throws Exception{
 //BA.debugLineNum = 261;BA.debugLine="Sub SetWidth(h As Int) As WixDataTable";
 //BA.debugLineNum = 262;BA.debugLine="DataTable.SetWidth(h)";
_datatable._setwidth /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 263;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 264;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
