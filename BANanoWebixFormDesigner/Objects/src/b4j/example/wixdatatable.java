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
public anywheresoftware.b4a.objects.collections.Map _rules = null;
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
public String  _addcolumns(b4j.example.wixdatacolumn _c) throws Exception{
 //BA.debugLineNum = 233;BA.debugLine="Sub AddColumns(c As WixDataColumn)";
 //BA.debugLineNum = 234;BA.debugLine="DataTable.AddDataColumn(c.Item)";
_datatable._adddatacolumn /*b4j.example.wixelement*/ (_c._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 235;BA.debugLine="End Sub";
return "";
}
public String  _addedittrash() throws Exception{
b4j.example.wixdatacolumn _e = null;
b4j.example.wixdatacolumn _d = null;
 //BA.debugLineNum = 185;BA.debugLine="Sub AddEditTrash";
 //BA.debugLineNum = 186;BA.debugLine="Dim e As WixDataColumn = CreateColumn(\"edit\").Set";
_e = _createcolumn("edit")._setheader /*b4j.example.wixdatacolumn*/ ((Object)("Edit"))._settemplate /*b4j.example.wixdatacolumn*/ ((Object)("{common.editIcon()}"))._setwidth /*b4j.example.wixdatacolumn*/ ((Object)(100));
 //BA.debugLineNum = 187;BA.debugLine="Dim d As WixDataColumn = CreateColumn(\"delete\").S";
_d = _createcolumn("delete")._setheader /*b4j.example.wixdatacolumn*/ ((Object)("Delete"))._settemplate /*b4j.example.wixdatacolumn*/ ((Object)("{common.trashIcon()}"))._setwidth /*b4j.example.wixdatacolumn*/ ((Object)(100));
 //BA.debugLineNum = 188;BA.debugLine="DataTable.AddDataColumn(e.Item)";
_datatable._adddatacolumn /*b4j.example.wixelement*/ (_e._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 189;BA.debugLine="DataTable.AddDataColumn(d.item)";
_datatable._adddatacolumn /*b4j.example.wixelement*/ (_d._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 190;BA.debugLine="End Sub";
return "";
}
public String  _addtocolumns(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 396;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 397;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 398;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 401;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 402;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 403;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.example.wixform _frm) throws Exception{
 //BA.debugLineNum = 364;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 365;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 366;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 391;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 392;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 393;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 28;BA.debugLine="Private Rules As Map";
_rules = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixdatacolumn  _createcolumn(String _hid) throws Exception{
b4j.example.wixdatacolumn _hdr = null;
 //BA.debugLineNum = 275;BA.debugLine="Sub CreateColumn(hid As String) As WixDataColumn";
 //BA.debugLineNum = 276;BA.debugLine="Dim hdr As WixDataColumn";
_hdr = new b4j.example.wixdatacolumn();
 //BA.debugLineNum = 277;BA.debugLine="hdr.Initialize(hid)";
_hdr._initialize /*b4j.example.wixdatacolumn*/ (ba,_hid);
 //BA.debugLineNum = 278;BA.debugLine="Return hdr";
if (true) return _hdr;
 //BA.debugLineNum = 279;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _initialize(anywheresoftware.b4a.BA _ba,String _tid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 224;BA.debugLine="Public Sub Initialize(tID As String) As WixDataTab";
 //BA.debugLineNum = 225;BA.debugLine="ID = tID.ToLowerCase";
_id = _tid.toLowerCase();
 //BA.debugLineNum = 226;BA.debugLine="DataTable.Initialize(ID).SetView(\"datatable\")";
_datatable._initialize /*b4j.example.wixelement*/ (ba,_id)._setview /*b4j.example.wixelement*/ ("datatable");
 //BA.debugLineNum = 227;BA.debugLine="AutoConfig = False";
_autoconfig = __c.False;
 //BA.debugLineNum = 228;BA.debugLine="Rules.Initialize";
_rules.Initialize();
 //BA.debugLineNum = 229;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 230;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 337;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 338;BA.debugLine="If Rules.Size > 0 Then";
if (_rules.getSize()>0) { 
 //BA.debugLineNum = 339;BA.debugLine="DataTable.SetAttr(\"rules\", Rules)";
_datatable._setattr /*b4j.example.wixelement*/ ("rules",(Object)(_rules.getObject()));
 };
 //BA.debugLineNum = 341;BA.debugLine="DataTable.SetAttr(\"autoConfig\", AutoConfig)";
_datatable._setattr /*b4j.example.wixelement*/ ("autoConfig",(Object)(_autoconfig));
 //BA.debugLineNum = 342;BA.debugLine="Return DataTable.item";
if (true) return _datatable._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 343;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setautoconfig(boolean _a) throws Exception{
 //BA.debugLineNum = 346;BA.debugLine="Sub SetAutoConfig(a As Boolean) As WixDataTable";
 //BA.debugLineNum = 347;BA.debugLine="AutoConfig = a";
_autoconfig = _a;
 //BA.debugLineNum = 348;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 349;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setautoheight(boolean _b) throws Exception{
 //BA.debugLineNum = 263;BA.debugLine="Sub SetAutoHeight(b As Boolean) As WixDataTable";
 //BA.debugLineNum = 264;BA.debugLine="DataTable.SetAttr(\"autoheight\", b)";
_datatable._setattr /*b4j.example.wixelement*/ ("autoheight",(Object)(_b));
 //BA.debugLineNum = 265;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 266;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setautowidth(boolean _b) throws Exception{
 //BA.debugLineNum = 269;BA.debugLine="Sub SetAutoWidth(b As Boolean) As WixDataTable";
 //BA.debugLineNum = 270;BA.debugLine="DataTable.SetAttr(\"autowidth\", b)";
_datatable._setattr /*b4j.example.wixelement*/ ("autowidth",(Object)(_b));
 //BA.debugLineNum = 271;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 272;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setblockselect(boolean _b) throws Exception{
 //BA.debugLineNum = 300;BA.debugLine="Sub SetBlockSelect(b As Boolean) As WixDataTable";
 //BA.debugLineNum = 301;BA.debugLine="DataTable.SetAttr(\"blockselect\", b)";
_datatable._setattr /*b4j.example.wixelement*/ ("blockselect",(Object)(_b));
 //BA.debugLineNum = 302;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 303;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setborderless(boolean _b) throws Exception{
 //BA.debugLineNum = 312;BA.debugLine="Sub SetBorderLess(b As Boolean) As WixDataTable";
 //BA.debugLineNum = 313;BA.debugLine="DataTable.SetAttr(\"borderless\", b)";
_datatable._setattr /*b4j.example.wixelement*/ ("borderless",(Object)(_b));
 //BA.debugLineNum = 314;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 315;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setcolumnwidth(int _w) throws Exception{
 //BA.debugLineNum = 179;BA.debugLine="Sub SetColumnWidth(w As Int) As WixDataTable";
 //BA.debugLineNum = 180;BA.debugLine="DataTable.SetAttr(\"columnWidth\", w)";
_datatable._setattr /*b4j.example.wixelement*/ ("columnWidth",(Object)(_w));
 //BA.debugLineNum = 181;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setcontainer(String _c) throws Exception{
 //BA.debugLineNum = 218;BA.debugLine="Sub SetContainer(c As String) As WixDataTable";
 //BA.debugLineNum = 219;BA.debugLine="DataTable.SetAttr(\"container\", c)";
_datatable._setattr /*b4j.example.wixelement*/ ("container",(Object)(_c));
 //BA.debugLineNum = 220;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 221;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setcss(Object _c) throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Sub SetCSS(c As Object) As WixDataTable";
 //BA.debugLineNum = 69;BA.debugLine="DataTable.SetAttr(\"css\", c)";
_datatable._setattr /*b4j.example.wixelement*/ ("css",_c);
 //BA.debugLineNum = 70;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setcssjson(String _json) throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Sub SetCSSJSON(json As String) As WixDataTable";
 //BA.debugLineNum = 74;BA.debugLine="DataTable.SetCSSJSON(json)";
_datatable._setcssjson /*b4j.example.wixelement*/ (_json);
 //BA.debugLineNum = 75;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setdata(anywheresoftware.b4a.objects.collections.List _data) throws Exception{
 //BA.debugLineNum = 384;BA.debugLine="Sub SetData(data As List) As WixDataTable";
 //BA.debugLineNum = 385;BA.debugLine="DataTable.SetData(data)";
_datatable._setdata /*b4j.example.wixelement*/ (_data);
 //BA.debugLineNum = 386;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 387;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setdatafetch(int _i) throws Exception{
 //BA.debugLineNum = 368;BA.debugLine="Sub SetDataFetch(i As Int) As WixDataTable";
 //BA.debugLineNum = 369;BA.debugLine="DataTable.SetAttr(\"datafetch\", i)";
_datatable._setattr /*b4j.example.wixelement*/ ("datafetch",(Object)(_i));
 //BA.debugLineNum = 370;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 371;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setdatathrottle(int _d) throws Exception{
 //BA.debugLineNum = 378;BA.debugLine="Sub SetDataThrottle(d As Int) As WixDataTable";
 //BA.debugLineNum = 379;BA.debugLine="DataTable.SetAttr(\"datathrottle\", d)";
_datatable._setattr /*b4j.example.wixelement*/ ("datathrottle",(Object)(_d));
 //BA.debugLineNum = 380;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 381;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setdatatype(String _t) throws Exception{
 //BA.debugLineNum = 245;BA.debugLine="Sub SetDataType(t As String) As WixDataTable";
 //BA.debugLineNum = 246;BA.debugLine="DataTable.SetAttr(\"datatype\", t)";
_datatable._setattr /*b4j.example.wixelement*/ ("datatype",(Object)(_t));
 //BA.debugLineNum = 247;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 248;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _seteditable(boolean _b) throws Exception{
 //BA.debugLineNum = 325;BA.debugLine="Sub SetEditable(b As Boolean) As WixDataTable";
 //BA.debugLineNum = 326;BA.debugLine="DataTable.SetAttr(\"editable\", b)";
_datatable._setattr /*b4j.example.wixelement*/ ("editable",(Object)(_b));
 //BA.debugLineNum = 327;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 328;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _seteditaction(String _a) throws Exception{
 //BA.debugLineNum = 306;BA.debugLine="Sub SetEditAction(a As String) As WixDataTable";
 //BA.debugLineNum = 307;BA.debugLine="DataTable.SetAttr(\"editaction\", a)";
_datatable._setattr /*b4j.example.wixelement*/ ("editaction",(Object)(_a));
 //BA.debugLineNum = 308;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 309;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setform(String _frmid) throws Exception{
 //BA.debugLineNum = 171;BA.debugLine="Sub SetForm(frmID As String) As WixDataTable";
 //BA.debugLineNum = 172;BA.debugLine="frmID = frmID.ToLowerCase";
_frmid = _frmid.toLowerCase();
 //BA.debugLineNum = 173;BA.debugLine="DataTable.SetAttr(\"form\", frmID)";
_datatable._setattr /*b4j.example.wixelement*/ ("form",(Object)(_frmid));
 //BA.debugLineNum = 174;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setheaderborders(boolean _b) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Sub SetHeaderBorders(b As Boolean) As WixDataTable";
 //BA.debugLineNum = 57;BA.debugLine="SetCSS(\"webix_header_border\")";
_setcss((Object)("webix_header_border"));
 //BA.debugLineNum = 58;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 352;BA.debugLine="Sub SetHeight(h As Object) As WixDataTable";
 //BA.debugLineNum = 353;BA.debugLine="DataTable.SetHeight(h)";
_datatable._setheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 354;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 355;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _sethover(String _h) throws Exception{
 //BA.debugLineNum = 193;BA.debugLine="Sub SetHover(h As String) As WixDataTable";
 //BA.debugLineNum = 194;BA.debugLine="DataTable.SetAttr(\"hover\", h)";
_datatable._setattr /*b4j.example.wixelement*/ ("hover",(Object)(_h));
 //BA.debugLineNum = 195;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 196;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setleftsplit(int _c) throws Exception{
 //BA.debugLineNum = 294;BA.debugLine="Sub SetLeftSplit(c As Int) As WixDataTable";
 //BA.debugLineNum = 295;BA.debugLine="DataTable.SetAttr(\"leftSplit\", c)";
_datatable._setattr /*b4j.example.wixelement*/ ("leftSplit",(Object)(_c));
 //BA.debugLineNum = 296;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 297;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setlivevalidation(boolean _b) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Sub SetLiveValidation(b As Boolean) As WixDataTabl";
 //BA.debugLineNum = 63;BA.debugLine="DataTable.SetAttr(\"liveValidation\", b)";
_datatable._setattr /*b4j.example.wixelement*/ ("liveValidation",(Object)(_b));
 //BA.debugLineNum = 64;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setloadahead(int _l) throws Exception{
 //BA.debugLineNum = 373;BA.debugLine="Sub SetLoadAhead(l As Int) As WixDataTable";
 //BA.debugLineNum = 374;BA.debugLine="DataTable.SetAttr(\"loadahead\", l)";
_datatable._setattr /*b4j.example.wixelement*/ ("loadahead",(Object)(_l));
 //BA.debugLineNum = 375;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 376;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 130;BA.debugLine="Sub SetMap(m As Map) As WixDataTable";
 //BA.debugLineNum = 131;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 132;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 133;BA.debugLine="DataTable.SetAttr(strKey,	strVal)";
_datatable._setattr /*b4j.example.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 135;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Sub SetMinHeight(h As Int) As WixDataTable";
 //BA.debugLineNum = 105;BA.debugLine="DataTable.SetMinHeight(h)";
_datatable._setminheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 106;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Sub SetMinWidth(w As Int) As WixDataTable";
 //BA.debugLineNum = 99;BA.debugLine="DataTable.SetMinWidth(w)";
_datatable._setminwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 100;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setmultiselect(Object _s) throws Exception{
 //BA.debugLineNum = 211;BA.debugLine="Sub SetMultiSelect(s As Object) As WixDataTable";
 //BA.debugLineNum = 212;BA.debugLine="DataTable.SetAttr(\"multiselect\", s)";
_datatable._setattr /*b4j.example.wixelement*/ ("multiselect",_s);
 //BA.debugLineNum = 213;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 214;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setname(String _n) throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Sub SetName(n As String) As WixDataTable";
 //BA.debugLineNum = 80;BA.debugLine="DataTable.SetName(n)";
_datatable._setname /*b4j.example.wixelement*/ (_n);
 //BA.debugLineNum = 81;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setnavigation(Object _b) throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Sub SetNavigation(b As Object) As WixDataTable";
 //BA.debugLineNum = 118;BA.debugLine="DataTable.SetAttr(\"navigation\", b)";
_datatable._setattr /*b4j.example.wixelement*/ ("navigation",_b);
 //BA.debugLineNum = 119;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setpager(String _p) throws Exception{
 //BA.debugLineNum = 140;BA.debugLine="Sub SetPager(p As String) As WixDataTable";
 //BA.debugLineNum = 141;BA.debugLine="p = p.tolowercase";
_p = _p.toLowerCase();
 //BA.debugLineNum = 142;BA.debugLine="DataTable.SetAttr(\"pager\", p)";
_datatable._setattr /*b4j.example.wixelement*/ ("pager",(Object)(_p));
 //BA.debugLineNum = 143;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setresizecolumn(boolean _b) throws Exception{
 //BA.debugLineNum = 165;BA.debugLine="Sub SetResizeColumn(b As Boolean) As WixDataTable";
 //BA.debugLineNum = 166;BA.debugLine="DataTable.SetAttr(\"resizeColumn\", b)";
_datatable._setattr /*b4j.example.wixelement*/ ("resizeColumn",(Object)(_b));
 //BA.debugLineNum = 167;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setresizerow(boolean _b) throws Exception{
 //BA.debugLineNum = 159;BA.debugLine="Sub SetResizeRow(b As Boolean) As WixDataTable";
 //BA.debugLineNum = 160;BA.debugLine="DataTable.SetAttr(\"resizeRow\", b)";
_datatable._setattr /*b4j.example.wixelement*/ ("resizeRow",(Object)(_b));
 //BA.debugLineNum = 161;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 162;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Sub SetResponsive(b As Object) As WixDataTable";
 //BA.debugLineNum = 86;BA.debugLine="DataTable.SetResponsive(b)";
_datatable._setresponsive /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 87;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixDataTable";
 //BA.debugLineNum = 92;BA.debugLine="DataTable.SetResponsiveCell(b)";
_datatable._setresponsivecell /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setrightsplit(int _r) throws Exception{
 //BA.debugLineNum = 199;BA.debugLine="Sub SetRightSplit(r As Int) As WixDataTable";
 //BA.debugLineNum = 200;BA.debugLine="DataTable.SetAttr(\"rightSplit\", r)";
_datatable._setattr /*b4j.example.wixelement*/ ("rightSplit",(Object)(_r));
 //BA.debugLineNum = 201;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 202;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setrowheight(int _h) throws Exception{
 //BA.debugLineNum = 282;BA.debugLine="Sub SetRowHeight(h As Int) As WixDataTable";
 //BA.debugLineNum = 283;BA.debugLine="DataTable.SetAttr(\"rowHeight\", h)";
_datatable._setattr /*b4j.example.wixelement*/ ("rowHeight",(Object)(_h));
 //BA.debugLineNum = 284;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 285;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setscroll(Object _b) throws Exception{
 //BA.debugLineNum = 239;BA.debugLine="Sub SetScroll(b As Object) As WixDataTable";
 //BA.debugLineNum = 240;BA.debugLine="DataTable.SetAttr(\"scroll\", b)";
_datatable._setattr /*b4j.example.wixelement*/ ("scroll",_b);
 //BA.debugLineNum = 241;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 242;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setscrollx(Object _b) throws Exception{
 //BA.debugLineNum = 153;BA.debugLine="Sub SetScrollX(b As Object) As WixDataTable";
 //BA.debugLineNum = 154;BA.debugLine="DataTable.SetAttr(\"scrollX\", b)";
_datatable._setattr /*b4j.example.wixelement*/ ("scrollX",_b);
 //BA.debugLineNum = 155;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 156;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setscrolly(Object _b) throws Exception{
 //BA.debugLineNum = 147;BA.debugLine="Sub SetScrollY(b As Object) As WixDataTable";
 //BA.debugLineNum = 148;BA.debugLine="DataTable.SetAttr(\"scrollY\", b)";
_datatable._setattr /*b4j.example.wixelement*/ ("scrollY",_b);
 //BA.debugLineNum = 149;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setselect(Object _s) throws Exception{
 //BA.debugLineNum = 205;BA.debugLine="Sub SetSelect(s As Object) As WixDataTable";
 //BA.debugLineNum = 206;BA.debugLine="DataTable.SetAttr(\"select\", s)";
_datatable._setattr /*b4j.example.wixelement*/ ("select",_s);
 //BA.debugLineNum = 207;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 208;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setselectcell(boolean _b) throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Sub SetSelectCell(b As Boolean) As WixDataTable  '";
 //BA.debugLineNum = 46;BA.debugLine="SetSelect(DT_SELECT_CELL)";
_setselect((Object)(_dt_select_cell));
 //BA.debugLineNum = 47;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setselectcolumn(boolean _b) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub SetSelectColumn(b As Boolean) As WixDataTable";
 //BA.debugLineNum = 52;BA.debugLine="SetSelect(DT_SELECT_COLUMN)";
_setselect((Object)(_dt_select_column));
 //BA.debugLineNum = 53;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setselectrow(boolean _b) throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Sub SetSelectRow(b As Boolean) As WixDataTable  'i";
 //BA.debugLineNum = 40;BA.debugLine="SetSelect(DT_SELECT_ROW)";
_setselect((Object)(_dt_select_row));
 //BA.debugLineNum = 41;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 319;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 320;BA.debugLine="DataTable.SetStyle(prop,val)";
_datatable._setstyle /*b4j.example.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 321;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 322;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 32;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixDataTab";
 //BA.debugLineNum = 33;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 34;BA.debugLine="DataTable.SetTemplate(os)";
_datatable._settemplate /*b4j.example.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 35;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 331;BA.debugLine="Sub SetTooltip(tt As String) As WixDataTable";
 //BA.debugLineNum = 332;BA.debugLine="DataTable.SetTooltip(tt)";
_datatable._settooltip /*b4j.example.wixelement*/ (_tt);
 //BA.debugLineNum = 333;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 334;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _settopsplit(int _r) throws Exception{
 //BA.debugLineNum = 288;BA.debugLine="Sub SetTopSplit(r As Int) As WixDataTable";
 //BA.debugLineNum = 289;BA.debugLine="DataTable.SetAttr(\"topSplit\", r)";
_datatable._setattr /*b4j.example.wixelement*/ ("topSplit",(Object)(_r));
 //BA.debugLineNum = 290;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 291;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _seturl(String _u) throws Exception{
 //BA.debugLineNum = 257;BA.debugLine="Sub SetURL(u As String) As WixDataTable";
 //BA.debugLineNum = 258;BA.debugLine="DataTable.SetAttr(\"url\", u)";
_datatable._setattr /*b4j.example.wixelement*/ ("url",(Object)(_u));
 //BA.debugLineNum = 259;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 260;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setvisiblebatch(int _b) throws Exception{
 //BA.debugLineNum = 251;BA.debugLine="Sub SetVisibleBatch(b As Int) As WixDataTable";
 //BA.debugLineNum = 252;BA.debugLine="DataTable.SetAttr(\"visibleBatch\", b)";
_datatable._setattr /*b4j.example.wixelement*/ ("visibleBatch",(Object)(_b));
 //BA.debugLineNum = 253;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 254;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setwidth(Object _h) throws Exception{
 //BA.debugLineNum = 358;BA.debugLine="Sub SetWidth(h As Object) As WixDataTable";
 //BA.debugLineNum = 359;BA.debugLine="DataTable.SetWidth(h)";
_datatable._setwidth /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 360;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 361;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setxcount(int _x) throws Exception{
 //BA.debugLineNum = 124;BA.debugLine="Sub SetXCount(x As Int) As WixDataTable";
 //BA.debugLineNum = 125;BA.debugLine="DataTable.SetAttr(\"xCount\", x)";
_datatable._setattr /*b4j.example.wixelement*/ ("xCount",(Object)(_x));
 //BA.debugLineNum = 126;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setycount(int _x) throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Sub SetYCount(x As Int) As WixDataTable";
 //BA.debugLineNum = 111;BA.debugLine="DataTable.SetAttr(\"yCount\", x)";
_datatable._setattr /*b4j.example.wixelement*/ ("yCount",(Object)(_x));
 //BA.debugLineNum = 112;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
