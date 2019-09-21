package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixdatatable extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixdatatable", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixdatatable.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _datatable = null;
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
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public String  _addcolumns(b4j.Mashy.BANanoWebixDemo.wixdatacolumn _c) throws Exception{
 //BA.debugLineNum = 309;BA.debugLine="Sub AddColumns(c As WixDataColumn)";
 //BA.debugLineNum = 310;BA.debugLine="DataTable.AddDataColumn(c.Item)";
_datatable._adddatacolumn /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_c._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 311;BA.debugLine="End Sub";
return "";
}
public String  _adddatacolumns(b4j.Mashy.BANanoWebixDemo.wixdatacolumn _c) throws Exception{
 //BA.debugLineNum = 313;BA.debugLine="Sub AddDataColumns(c As WixDataColumn)";
 //BA.debugLineNum = 314;BA.debugLine="DataTable.AddDataColumn(c.Item)";
_datatable._adddatacolumn /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_c._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 315;BA.debugLine="End Sub";
return "";
}
public String  _addedittrash() throws Exception{
b4j.Mashy.BANanoWebixDemo.wixdatacolumn _e = null;
b4j.Mashy.BANanoWebixDemo.wixdatacolumn _d = null;
 //BA.debugLineNum = 209;BA.debugLine="Sub AddEditTrash";
 //BA.debugLineNum = 210;BA.debugLine="Dim e As WixDataColumn = CreateColumn(\"edit\").Set";
_e = _createcolumn("edit")._settemplate /*b4j.Mashy.BANanoWebixDemo.wixdatacolumn*/ ((Object)("{common.editIcon()}"))._setwidth /*b4j.Mashy.BANanoWebixDemo.wixdatacolumn*/ ((Object)(80))._setaligncenter /*b4j.Mashy.BANanoWebixDemo.wixdatacolumn*/ (__c.True);
 //BA.debugLineNum = 211;BA.debugLine="Dim d As WixDataColumn = CreateColumn(\"delete\").S";
_d = _createcolumn("delete")._settemplate /*b4j.Mashy.BANanoWebixDemo.wixdatacolumn*/ ((Object)("{common.trashIcon()}"))._setwidth /*b4j.Mashy.BANanoWebixDemo.wixdatacolumn*/ ((Object)(80))._setaligncenter /*b4j.Mashy.BANanoWebixDemo.wixdatacolumn*/ (__c.True);
 //BA.debugLineNum = 212;BA.debugLine="e.SetHeader(\"Edit\")";
_e._setheader /*b4j.Mashy.BANanoWebixDemo.wixdatacolumn*/ ((Object)("Edit"));
 //BA.debugLineNum = 213;BA.debugLine="d.SetHeader(\"Delete\")";
_d._setheader /*b4j.Mashy.BANanoWebixDemo.wixdatacolumn*/ ((Object)("Delete"));
 //BA.debugLineNum = 214;BA.debugLine="e.DataColumn.SetStyle(\"cursor\", \"pointer\")";
_e._datacolumn /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("cursor","pointer");
 //BA.debugLineNum = 215;BA.debugLine="d.DataColumn.SetStyle(\"cursor\", \"pointer\")";
_d._datacolumn /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("cursor","pointer");
 //BA.debugLineNum = 216;BA.debugLine="DataTable.AddDataColumn(e.Item)";
_datatable._adddatacolumn /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_e._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 217;BA.debugLine="DataTable.AddDataColumn(d.item)";
_datatable._adddatacolumn /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_d._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 218;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _addicon(String _iconid,String _iconheader,String _iconname) throws Exception{
b4j.Mashy.BANanoWebixDemo.uoenowhtml _span = null;
b4j.Mashy.BANanoWebixDemo.wixdatacolumn _e = null;
 //BA.debugLineNum = 220;BA.debugLine="Sub AddIcon(iconID As String, iconHeader As String";
 //BA.debugLineNum = 221;BA.debugLine="Dim span As UOENowHTML";
_span = new b4j.Mashy.BANanoWebixDemo.uoenowhtml();
 //BA.debugLineNum = 222;BA.debugLine="span.Initialize(iconID & \"_icon\",\"span\").SetImpor";
_span._initialize /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (ba,_iconid+"_icon","span")._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False)._addclass /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ ("webix_icon")._addclass /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (_iconname);
 //BA.debugLineNum = 223;BA.debugLine="iconID = iconID.tolowercase";
_iconid = _iconid.toLowerCase();
 //BA.debugLineNum = 224;BA.debugLine="Dim e As WixDataColumn = CreateColumn(iconID).Set";
_e = _createcolumn(_iconid)._setwidth /*b4j.Mashy.BANanoWebixDemo.wixdatacolumn*/ ((Object)(80))._setaligncenter /*b4j.Mashy.BANanoWebixDemo.wixdatacolumn*/ (__c.True)._settemplatehtml /*b4j.Mashy.BANanoWebixDemo.wixdatacolumn*/ (_span);
 //BA.debugLineNum = 225;BA.debugLine="e.SetHeader(iconHeader)";
_e._setheader /*b4j.Mashy.BANanoWebixDemo.wixdatacolumn*/ ((Object)(_iconheader));
 //BA.debugLineNum = 226;BA.debugLine="e.DataColumn.SetStyle(\"cursor\", \"pointer\")";
_e._datacolumn /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("cursor","pointer");
 //BA.debugLineNum = 227;BA.debugLine="DataTable.AddDataColumn(e.Item)";
_datatable._adddatacolumn /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_e._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 228;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 229;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _addimage(String _imgid,String _imgheader,String _imgurl,String _imgwidth,String _imgheight,anywheresoftware.b4a.objects.collections.Map _imgstyles) throws Exception{
b4j.Mashy.BANanoWebixDemo.uoenowhtml _img = null;
String _mk = "";
String _mv = "";
b4j.Mashy.BANanoWebixDemo.wixdatacolumn _e = null;
 //BA.debugLineNum = 231;BA.debugLine="Sub AddImage(imgID As String, imgHeader As String,";
 //BA.debugLineNum = 232;BA.debugLine="imgID = imgID.ToLowerCase";
_imgid = _imgid.toLowerCase();
 //BA.debugLineNum = 233;BA.debugLine="Dim img As UOENowHTML";
_img = new b4j.Mashy.BANanoWebixDemo.uoenowhtml();
 //BA.debugLineNum = 234;BA.debugLine="img.Initialize(imgID & \"_img\", \"img\").SetImportan";
_img._initialize /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (ba,_imgid+"_img","img")._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 235;BA.debugLine="img.SetStyle(\"cursor\", \"pointer\")";
_img._setstyle /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ ("cursor","pointer");
 //BA.debugLineNum = 236;BA.debugLine="img.SetStyle(\"width\",\"100%\")";
_img._setstyle /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ ("width","100%");
 //BA.debugLineNum = 237;BA.debugLine="img.SetStyle(\"height\",\"100%\")";
_img._setstyle /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ ("height","100%");
 //BA.debugLineNum = 238;BA.debugLine="If imgStyles <> Null Then";
if (_imgstyles!= null) { 
 //BA.debugLineNum = 239;BA.debugLine="For Each mk As String In imgStyles.Keys";
{
final anywheresoftware.b4a.BA.IterableList group8 = _imgstyles.Keys();
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_mk = BA.ObjectToString(group8.Get(index8));
 //BA.debugLineNum = 240;BA.debugLine="Dim mv As String = imgStyles.Get(mk)";
_mv = BA.ObjectToString(_imgstyles.Get((Object)(_mk)));
 //BA.debugLineNum = 241;BA.debugLine="img.SetStyle(mk, mv)";
_img._setstyle /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (_mk,_mv);
 }
};
 };
 //BA.debugLineNum = 244;BA.debugLine="img.SetSRC(imgURL,True)";
_img._setsrc /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (_imgurl,__c.True);
 //BA.debugLineNum = 246;BA.debugLine="Dim e As WixDataColumn = CreateColumn(imgID).SetA";
_e = _createcolumn(_imgid)._setaligncenter /*b4j.Mashy.BANanoWebixDemo.wixdatacolumn*/ (__c.True)._settemplatehtml /*b4j.Mashy.BANanoWebixDemo.wixdatacolumn*/ (_img);
 //BA.debugLineNum = 247;BA.debugLine="If imgWidth <> \"\" Then e.SetWidth(imgWidth)";
if ((_imgwidth).equals("") == false) { 
_e._setwidth /*b4j.Mashy.BANanoWebixDemo.wixdatacolumn*/ ((Object)(_imgwidth));};
 //BA.debugLineNum = 248;BA.debugLine="If imgHeight <> \"\" Then e.SetHeight(imgHeight)";
if ((_imgheight).equals("") == false) { 
_e._setheight /*b4j.Mashy.BANanoWebixDemo.wixdatacolumn*/ ((int)(Double.parseDouble(_imgheight)));};
 //BA.debugLineNum = 249;BA.debugLine="e.SetHeader(imgHeader)";
_e._setheader /*b4j.Mashy.BANanoWebixDemo.wixdatacolumn*/ ((Object)(_imgheader));
 //BA.debugLineNum = 250;BA.debugLine="e.DataColumn.SetStyle(\"cursor\", \"pointer\")";
_e._datacolumn /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("cursor","pointer");
 //BA.debugLineNum = 251;BA.debugLine="e.DataColumn.SetCSS(\"form_photo\")";
_e._datacolumn /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ._setcss /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("form_photo");
 //BA.debugLineNum = 252;BA.debugLine="DataTable.AddDataColumn(e.Item)";
_datatable._adddatacolumn /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_e._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 253;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 254;BA.debugLine="End Sub";
return null;
}
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 474;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 475;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 476;BA.debugLine="End Sub";
return "";
}
public String  _addtodatacolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 478;BA.debugLine="Sub AddToDataColumns(P As WixElement)";
 //BA.debugLineNum = 479;BA.debugLine="P.AddDataColumn(Item)";
_p._adddatacolumn /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 480;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 483;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 484;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 485;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.Mashy.BANanoWebixDemo.wixform _frm) throws Exception{
 //BA.debugLineNum = 442;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 443;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 444;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 469;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 470;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 471;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public DataTable As WixElement";
_datatable = new b4j.Mashy.BANanoWebixDemo.wixelement();
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
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _createcolumn(String _hid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixdatacolumn _hdr = null;
 //BA.debugLineNum = 359;BA.debugLine="Sub CreateColumn(hid As String) As WixDataColumn";
 //BA.debugLineNum = 360;BA.debugLine="Dim hdr As WixDataColumn";
_hdr = new b4j.Mashy.BANanoWebixDemo.wixdatacolumn();
 //BA.debugLineNum = 361;BA.debugLine="hdr.Initialize(hid)";
_hdr._initialize /*b4j.Mashy.BANanoWebixDemo.wixdatacolumn*/ (ba,_hid);
 //BA.debugLineNum = 362;BA.debugLine="Return hdr";
if (true) return _hdr;
 //BA.debugLineNum = 363;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _initialize(anywheresoftware.b4a.BA _ba,String _tid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 300;BA.debugLine="Public Sub Initialize(tID As String) As WixDataTab";
 //BA.debugLineNum = 301;BA.debugLine="ID = tID.ToLowerCase";
_id = _tid.toLowerCase();
 //BA.debugLineNum = 302;BA.debugLine="DataTable.Initialize(ID).SetView(\"datatable\")";
_datatable._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_id)._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("datatable");
 //BA.debugLineNum = 303;BA.debugLine="AutoConfig = False";
_autoconfig = __c.False;
 //BA.debugLineNum = 304;BA.debugLine="Rules.Initialize";
_rules.Initialize();
 //BA.debugLineNum = 305;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 306;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 415;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 416;BA.debugLine="If Rules.Size > 0 Then";
if (_rules.getSize()>0) { 
 //BA.debugLineNum = 417;BA.debugLine="DataTable.SetAttr(\"rules\", Rules)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("rules",(Object)(_rules.getObject()));
 };
 //BA.debugLineNum = 419;BA.debugLine="DataTable.SetAttr(\"autoConfig\", AutoConfig)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("autoConfig",(Object)(_autoconfig));
 //BA.debugLineNum = 420;BA.debugLine="Return DataTable.item";
if (true) return _datatable._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 421;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setanimate(Object _animate) throws Exception{
 //BA.debugLineNum = 492;BA.debugLine="Sub SetAnimate(animate As Object) As WixDataTable";
 //BA.debugLineNum = 493;BA.debugLine="DataTable.SetAttr(\"animate\", animate)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("animate",_animate);
 //BA.debugLineNum = 494;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 495;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setareaselect(boolean _areaselect) throws Exception{
 //BA.debugLineNum = 487;BA.debugLine="Sub SetAreaSelect(areaselect As Boolean) As WixDat";
 //BA.debugLineNum = 488;BA.debugLine="DataTable.SetAttr(\"areaselect\", areaselect)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("areaselect",(Object)(_areaselect));
 //BA.debugLineNum = 489;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 490;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 32;BA.debugLine="Sub SetAttributes(m As Map) As WixDataTable";
 //BA.debugLineNum = 33;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 34;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 35;BA.debugLine="DataTable.SetAttr(k,v)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 37;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setautoconfig(boolean _a) throws Exception{
 //BA.debugLineNum = 424;BA.debugLine="Sub SetAutoConfig(a As Boolean) As WixDataTable";
 //BA.debugLineNum = 425;BA.debugLine="AutoConfig = a";
_autoconfig = _a;
 //BA.debugLineNum = 426;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 427;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setautoheight(boolean _b) throws Exception{
 //BA.debugLineNum = 347;BA.debugLine="Sub SetAutoHeight(b As Boolean) As WixDataTable";
 //BA.debugLineNum = 348;BA.debugLine="DataTable.SetAttr(\"autoheight\", b)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("autoheight",(Object)(_b));
 //BA.debugLineNum = 349;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 350;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setautowidth(boolean _b) throws Exception{
 //BA.debugLineNum = 353;BA.debugLine="Sub SetAutoWidth(b As Boolean) As WixDataTable";
 //BA.debugLineNum = 354;BA.debugLine="DataTable.SetAttr(\"autowidth\", b)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("autowidth",(Object)(_b));
 //BA.debugLineNum = 355;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 356;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setblockselect(boolean _b) throws Exception{
 //BA.debugLineNum = 384;BA.debugLine="Sub SetBlockSelect(b As Boolean) As WixDataTable";
 //BA.debugLineNum = 385;BA.debugLine="DataTable.SetAttr(\"blockselect\", b)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("blockselect",(Object)(_b));
 //BA.debugLineNum = 386;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 387;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setborderless(boolean _b) throws Exception{
 //BA.debugLineNum = 396;BA.debugLine="Sub SetBorderLess(b As Boolean) As WixDataTable";
 //BA.debugLineNum = 397;BA.debugLine="DataTable.SetAttr(\"borderless\", b)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("borderless",(Object)(_b));
 //BA.debugLineNum = 398;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 399;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setcheckboxrefresh(boolean _checkboxrefresh) throws Exception{
 //BA.debugLineNum = 497;BA.debugLine="Sub SetCheckboxRefresh(checkboxRefresh As Boolean)";
 //BA.debugLineNum = 498;BA.debugLine="DataTable.SetAttr(\"checkboxRefresh\", checkboxRefre";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("checkboxRefresh",(Object)(_checkboxrefresh));
 //BA.debugLineNum = 499;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 500;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setclipboard(String _clipboard) throws Exception{
 //BA.debugLineNum = 502;BA.debugLine="Sub SetClipboard(clipboard As String) As WixDataTa";
 //BA.debugLineNum = 503;BA.debugLine="DataTable.SetAttr(\"clipboard\", clipboard)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("clipboard",(Object)(_clipboard));
 //BA.debugLineNum = 504;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 505;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setcolumnwidth(int _w) throws Exception{
 //BA.debugLineNum = 203;BA.debugLine="Sub SetColumnWidth(w As Int) As WixDataTable";
 //BA.debugLineNum = 204;BA.debugLine="DataTable.SetAttr(\"columnWidth\", w)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("columnWidth",(Object)(_w));
 //BA.debugLineNum = 205;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 206;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setcontainer(String _c) throws Exception{
 //BA.debugLineNum = 294;BA.debugLine="Sub SetContainer(c As String) As WixDataTable";
 //BA.debugLineNum = 295;BA.debugLine="DataTable.SetAttr(\"container\", c)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("container",(Object)(_c));
 //BA.debugLineNum = 296;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 297;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setcss(Object _c) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Sub SetCSS(c As Object) As WixDataTable";
 //BA.debugLineNum = 93;BA.debugLine="DataTable.SetAttr(\"css\", c)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("css",_c);
 //BA.debugLineNum = 94;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setcssjson(String _json) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub SetCSSJSON(json As String) As WixDataTable";
 //BA.debugLineNum = 98;BA.debugLine="DataTable.SetCSSJSON(json)";
_datatable._setcssjson /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_json);
 //BA.debugLineNum = 99;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setdata(anywheresoftware.b4a.objects.collections.List _data) throws Exception{
 //BA.debugLineNum = 462;BA.debugLine="Sub SetData(data As List) As WixDataTable";
 //BA.debugLineNum = 463;BA.debugLine="DataTable.SetData(data)";
_datatable._setdata /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_data);
 //BA.debugLineNum = 464;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 465;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setdatafeed(String _datafeed) throws Exception{
 //BA.debugLineNum = 507;BA.debugLine="Sub SetDataFeed(dataFeed As String) As WixDataTabl";
 //BA.debugLineNum = 508;BA.debugLine="DataTable.SetAttr(\"dataFeed\", dataFeed)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("dataFeed",(Object)(_datafeed));
 //BA.debugLineNum = 509;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 510;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setdatafetch(int _i) throws Exception{
 //BA.debugLineNum = 446;BA.debugLine="Sub SetDataFetch(i As Int) As WixDataTable";
 //BA.debugLineNum = 447;BA.debugLine="DataTable.SetAttr(\"datafetch\", i)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("datafetch",(Object)(_i));
 //BA.debugLineNum = 448;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 449;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setdatathrottle(int _d) throws Exception{
 //BA.debugLineNum = 456;BA.debugLine="Sub SetDataThrottle(d As Int) As WixDataTable";
 //BA.debugLineNum = 457;BA.debugLine="DataTable.SetAttr(\"datathrottle\", d)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("datathrottle",(Object)(_d));
 //BA.debugLineNum = 458;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 459;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setdatatype(String _t) throws Exception{
 //BA.debugLineNum = 329;BA.debugLine="Sub SetDataType(t As String) As WixDataTable";
 //BA.debugLineNum = 330;BA.debugLine="DataTable.SetAttr(\"datatype\", t)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("datatype",(Object)(_t));
 //BA.debugLineNum = 331;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 332;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setdelimiter(Object _delimiter) throws Exception{
 //BA.debugLineNum = 512;BA.debugLine="Sub SetDelimiter(delimiter As Object) As WixDataTa";
 //BA.debugLineNum = 513;BA.debugLine="DataTable.SetAttr(\"delimiter\", delimiter)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("delimiter",_delimiter);
 //BA.debugLineNum = 514;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 515;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setdisabled(boolean _disabled) throws Exception{
 //BA.debugLineNum = 517;BA.debugLine="Sub SetDisabled(disabled As Boolean) As WixDataTab";
 //BA.debugLineNum = 518;BA.debugLine="DataTable.SetAttr(\"disabled\", disabled)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("disabled",(Object)(_disabled));
 //BA.debugLineNum = 519;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 520;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setdrag(String _drag) throws Exception{
 //BA.debugLineNum = 522;BA.debugLine="Sub SetDrag(drag As String) As WixDataTable";
 //BA.debugLineNum = 523;BA.debugLine="DataTable.SetAttr(\"drag\", drag)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("drag",(Object)(_drag));
 //BA.debugLineNum = 524;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 525;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setdragcolumn(String _dragcolumn) throws Exception{
 //BA.debugLineNum = 527;BA.debugLine="Sub SetDragColumn(dragColumn As String) As WixData";
 //BA.debugLineNum = 528;BA.debugLine="DataTable.SetAttr(\"dragColumn\", dragColumn)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("dragColumn",(Object)(_dragcolumn));
 //BA.debugLineNum = 529;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 530;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setdragscroll(String _dragscroll) throws Exception{
 //BA.debugLineNum = 532;BA.debugLine="Sub SetDragscroll(dragscroll As String) As WixData";
 //BA.debugLineNum = 533;BA.debugLine="DataTable.SetAttr(\"dragscroll\", dragscroll)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("dragscroll",(Object)(_dragscroll));
 //BA.debugLineNum = 534;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 535;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _seteditable(boolean _b) throws Exception{
 //BA.debugLineNum = 403;BA.debugLine="Sub SetEditable(b As Boolean) As WixDataTable";
 //BA.debugLineNum = 404;BA.debugLine="DataTable.SetAttr(\"editable\", b)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("editable",(Object)(_b));
 //BA.debugLineNum = 405;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 406;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _seteditaction(String _a) throws Exception{
 //BA.debugLineNum = 390;BA.debugLine="Sub SetEditAction(a As String) As WixDataTable";
 //BA.debugLineNum = 391;BA.debugLine="DataTable.SetAttr(\"editaction\", a)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("editaction",(Object)(_a));
 //BA.debugLineNum = 392;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 393;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _seteditmath(boolean _editmath) throws Exception{
 //BA.debugLineNum = 537;BA.debugLine="Sub SetEditMath(editMath As Boolean) As WixDataTab";
 //BA.debugLineNum = 538;BA.debugLine="DataTable.SetAttr(\"editMath\", editMath)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("editMath",(Object)(_editmath));
 //BA.debugLineNum = 539;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 540;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _seteditvalue(String _editvalue) throws Exception{
 //BA.debugLineNum = 542;BA.debugLine="Sub SetEditValue(editValue As String) As WixDataTa";
 //BA.debugLineNum = 543;BA.debugLine="DataTable.SetAttr(\"editValue\", editValue)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("editValue",(Object)(_editvalue));
 //BA.debugLineNum = 544;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 545;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setfiltermode(String _filtermode) throws Exception{
 //BA.debugLineNum = 547;BA.debugLine="Sub SetFilterMode(filterMode As String) As WixData";
 //BA.debugLineNum = 548;BA.debugLine="DataTable.SetAttr(\"filterMode\", filterMode)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("filterMode",(Object)(_filtermode));
 //BA.debugLineNum = 549;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 550;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setfixedrowheight(boolean _fixedrowheight) throws Exception{
 //BA.debugLineNum = 552;BA.debugLine="Sub SetFixedRowHeight(fixedRowHeight As Boolean) A";
 //BA.debugLineNum = 553;BA.debugLine="DataTable.SetAttr(\"fixedRowHeight\", fixedRowHeight";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("fixedRowHeight",(Object)(_fixedrowheight));
 //BA.debugLineNum = 554;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 555;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setfooter(boolean _footer) throws Exception{
 //BA.debugLineNum = 557;BA.debugLine="Sub SetFooter(footer As Boolean) As WixDataTable";
 //BA.debugLineNum = 558;BA.debugLine="DataTable.SetAttr(\"footer\", footer)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("footer",(Object)(_footer));
 //BA.debugLineNum = 559;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 560;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setform(String _frmid) throws Exception{
 //BA.debugLineNum = 195;BA.debugLine="Sub SetForm(frmID As String) As WixDataTable";
 //BA.debugLineNum = 196;BA.debugLine="frmID = frmID.ToLowerCase";
_frmid = _frmid.toLowerCase();
 //BA.debugLineNum = 197;BA.debugLine="DataTable.SetAttr(\"form\", frmID)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("form",(Object)(_frmid));
 //BA.debugLineNum = 198;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 199;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setgravity(String _gravity) throws Exception{
 //BA.debugLineNum = 562;BA.debugLine="Sub SetGravity(gravity As String) As WixDataTable";
 //BA.debugLineNum = 563;BA.debugLine="DataTable.SetAttr(\"gravity\", gravity)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("gravity",(Object)(_gravity));
 //BA.debugLineNum = 564;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 565;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setheader(boolean _header) throws Exception{
 //BA.debugLineNum = 567;BA.debugLine="Sub SetHeader(header As Boolean) As WixDataTable";
 //BA.debugLineNum = 568;BA.debugLine="DataTable.SetAttr(\"header\", header)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("header",(Object)(_header));
 //BA.debugLineNum = 569;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 570;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setheaderborders(boolean _b) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub SetHeaderBorders(b As Boolean) As WixDataTable";
 //BA.debugLineNum = 81;BA.debugLine="SetCSS(\"webix_header_border\")";
_setcss((Object)("webix_header_border"));
 //BA.debugLineNum = 82;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setheadermenu(boolean _headermenu) throws Exception{
 //BA.debugLineNum = 577;BA.debugLine="Sub SetHeaderMenu(headermenu As Boolean) As WixDat";
 //BA.debugLineNum = 578;BA.debugLine="DataTable.SetAttr(\"headermenu\", headermenu)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("headermenu",(Object)(_headermenu));
 //BA.debugLineNum = 579;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 580;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setheaderrowheight(String _headerrowheight) throws Exception{
 //BA.debugLineNum = 572;BA.debugLine="Sub SetHeaderRowHeight(headerRowHeight As String)";
 //BA.debugLineNum = 573;BA.debugLine="DataTable.SetAttr(\"headerRowHeight\", headerRowHeig";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("headerRowHeight",(Object)(_headerrowheight));
 //BA.debugLineNum = 574;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 575;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 430;BA.debugLine="Sub SetHeight(h As Object) As WixDataTable";
 //BA.debugLineNum = 431;BA.debugLine="DataTable.SetHeight(h)";
_datatable._setheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 432;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 433;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _sethidden(boolean _hidden) throws Exception{
 //BA.debugLineNum = 582;BA.debugLine="Sub SetHidden(hidden As Boolean) As WixDataTable";
 //BA.debugLineNum = 583;BA.debugLine="DataTable.SetAttr(\"hidden\", hidden)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hidden",(Object)(_hidden));
 //BA.debugLineNum = 584;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 585;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _sethover(String _h) throws Exception{
 //BA.debugLineNum = 269;BA.debugLine="Sub SetHover(h As String) As WixDataTable";
 //BA.debugLineNum = 270;BA.debugLine="DataTable.SetAttr(\"hover\", h)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hover",(Object)(_h));
 //BA.debugLineNum = 271;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 272;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setleftsplit(int _c) throws Exception{
 //BA.debugLineNum = 378;BA.debugLine="Sub SetLeftSplit(c As Int) As WixDataTable";
 //BA.debugLineNum = 379;BA.debugLine="DataTable.SetAttr(\"leftSplit\", c)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("leftSplit",(Object)(_c));
 //BA.debugLineNum = 380;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 381;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setlinevalidation(boolean _linevalidation) throws Exception{
 //BA.debugLineNum = 587;BA.debugLine="Sub SetLineValidation(lineValidation As Boolean) A";
 //BA.debugLineNum = 588;BA.debugLine="DataTable.SetAttr(\"lineValidation\", lineValidation";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("lineValidation",(Object)(_linevalidation));
 //BA.debugLineNum = 589;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 590;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setlivevalidation(boolean _b) throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Sub SetLiveValidation(b As Boolean) As WixDataTabl";
 //BA.debugLineNum = 87;BA.debugLine="DataTable.SetAttr(\"liveValidation\", b)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("liveValidation",(Object)(_b));
 //BA.debugLineNum = 88;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setloadahead(int _l) throws Exception{
 //BA.debugLineNum = 451;BA.debugLine="Sub SetLoadAhead(l As Int) As WixDataTable";
 //BA.debugLineNum = 452;BA.debugLine="DataTable.SetAttr(\"loadahead\", l)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("loadahead",(Object)(_l));
 //BA.debugLineNum = 453;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 454;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 154;BA.debugLine="Sub SetMap(m As Map) As WixDataTable";
 //BA.debugLineNum = 155;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 156;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 157;BA.debugLine="DataTable.SetAttr(strKey,	strVal)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 159;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 263;BA.debugLine="Sub SetMargin(margin As Object) As WixDataTable";
 //BA.debugLineNum = 264;BA.debugLine="DataTable.SetMargin(margin)";
_datatable._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 265;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 266;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setmath(boolean _math) throws Exception{
 //BA.debugLineNum = 592;BA.debugLine="Sub SetMath(math As Boolean) As WixDataTable";
 //BA.debugLineNum = 593;BA.debugLine="DataTable.SetAttr(\"math\", math)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("math",(Object)(_math));
 //BA.debugLineNum = 594;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 595;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setmaxheight(String _maxheight) throws Exception{
 //BA.debugLineNum = 597;BA.debugLine="Sub SetMaxHeight(maxHeight As String) As WixDataTa";
 //BA.debugLineNum = 598;BA.debugLine="DataTable.SetAttr(\"maxHeight\", maxHeight)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxHeight",(Object)(_maxheight));
 //BA.debugLineNum = 599;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 600;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setmaxwidth(String _maxwidth) throws Exception{
 //BA.debugLineNum = 602;BA.debugLine="Sub SetMaxWidth(maxWidth As String) As WixDataTabl";
 //BA.debugLineNum = 603;BA.debugLine="DataTable.SetAttr(\"maxWidth\", maxWidth)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxWidth",(Object)(_maxwidth));
 //BA.debugLineNum = 604;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 605;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setmincolumnwidth(String _mincolumnwidth) throws Exception{
 //BA.debugLineNum = 607;BA.debugLine="Sub SetMinColumnWidth(minColumnWidth As String) As";
 //BA.debugLineNum = 608;BA.debugLine="DataTable.SetAttr(\"minColumnWidth\", minColumnWidth";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("minColumnWidth",(Object)(_mincolumnwidth));
 //BA.debugLineNum = 609;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 610;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Sub SetMinHeight(h As Int) As WixDataTable";
 //BA.debugLineNum = 129;BA.debugLine="DataTable.SetMinHeight(h)";
_datatable._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 130;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setminrowheight(String _minrowheight) throws Exception{
 //BA.debugLineNum = 612;BA.debugLine="Sub SetMinRowHeight(minRowHeight As String) As Wix";
 //BA.debugLineNum = 613;BA.debugLine="DataTable.SetAttr(\"minRowHeight\", minRowHeight)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("minRowHeight",(Object)(_minrowheight));
 //BA.debugLineNum = 614;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 615;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Sub SetMinWidth(w As Int) As WixDataTable";
 //BA.debugLineNum = 123;BA.debugLine="DataTable.SetMinWidth(w)";
_datatable._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 124;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setmultiselect(Object _s) throws Exception{
 //BA.debugLineNum = 287;BA.debugLine="Sub SetMultiSelect(s As Object) As WixDataTable";
 //BA.debugLineNum = 288;BA.debugLine="DataTable.SetAttr(\"multiselect\", s)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("multiselect",_s);
 //BA.debugLineNum = 289;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 290;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setname(String _n) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Sub SetName(n As String) As WixDataTable";
 //BA.debugLineNum = 104;BA.debugLine="DataTable.SetName(n)";
_datatable._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 105;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setnavigation(Object _b) throws Exception{
 //BA.debugLineNum = 141;BA.debugLine="Sub SetNavigation(b As Object) As WixDataTable";
 //BA.debugLineNum = 142;BA.debugLine="DataTable.SetAttr(\"navigation\", b)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("navigation",_b);
 //BA.debugLineNum = 143;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 257;BA.debugLine="Sub SetPadding(padding As Object) As WixDataTable";
 //BA.debugLineNum = 258;BA.debugLine="DataTable.SetPadding(padding)";
_datatable._setpadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 259;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 260;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setpager(String _p) throws Exception{
 //BA.debugLineNum = 164;BA.debugLine="Sub SetPager(p As String) As WixDataTable";
 //BA.debugLineNum = 165;BA.debugLine="p = p.tolowercase";
_p = _p.toLowerCase();
 //BA.debugLineNum = 166;BA.debugLine="DataTable.SetAttr(\"pager\", p)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("pager",(Object)(_p));
 //BA.debugLineNum = 167;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setprerender(boolean _prerender) throws Exception{
 //BA.debugLineNum = 617;BA.debugLine="Sub SetPrerender(prerender As Boolean) As WixDataT";
 //BA.debugLineNum = 618;BA.debugLine="DataTable.SetAttr(\"prerender\", prerender)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("prerender",(Object)(_prerender));
 //BA.debugLineNum = 619;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 620;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setresizecolumn(boolean _b) throws Exception{
 //BA.debugLineNum = 189;BA.debugLine="Sub SetResizeColumn(b As Boolean) As WixDataTable";
 //BA.debugLineNum = 190;BA.debugLine="DataTable.SetAttr(\"resizeColumn\", b)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("resizeColumn",(Object)(_b));
 //BA.debugLineNum = 191;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 192;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setresizerow(boolean _b) throws Exception{
 //BA.debugLineNum = 183;BA.debugLine="Sub SetResizeRow(b As Boolean) As WixDataTable";
 //BA.debugLineNum = 184;BA.debugLine="DataTable.SetAttr(\"resizeRow\", b)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("resizeRow",(Object)(_b));
 //BA.debugLineNum = 185;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 186;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Sub SetResponsive(b As Object) As WixDataTable";
 //BA.debugLineNum = 110;BA.debugLine="DataTable.SetResponsive(b)";
_datatable._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 111;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixDataTable";
 //BA.debugLineNum = 116;BA.debugLine="DataTable.SetResponsiveCell(b)";
_datatable._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 117;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setrightsplit(int _r) throws Exception{
 //BA.debugLineNum = 275;BA.debugLine="Sub SetRightSplit(r As Int) As WixDataTable";
 //BA.debugLineNum = 276;BA.debugLine="DataTable.SetAttr(\"rightSplit\", r)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("rightSplit",(Object)(_r));
 //BA.debugLineNum = 277;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 278;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setrowheight(int _h) throws Exception{
 //BA.debugLineNum = 366;BA.debugLine="Sub SetRowHeight(h As Int) As WixDataTable";
 //BA.debugLineNum = 367;BA.debugLine="DataTable.SetAttr(\"rowHeight\", h)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("rowHeight",(Object)(_h));
 //BA.debugLineNum = 368;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 369;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setrowlineheight(String _rowlineheight) throws Exception{
 //BA.debugLineNum = 622;BA.debugLine="Sub SetRowLineHeight(rowLineHeight As String) As W";
 //BA.debugLineNum = 623;BA.debugLine="DataTable.SetAttr(\"rowLineHeight\", rowLineHeight)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("rowLineHeight",(Object)(_rowlineheight));
 //BA.debugLineNum = 624;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 625;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setsave(String _save) throws Exception{
 //BA.debugLineNum = 627;BA.debugLine="Sub SetSave(save As String) As WixDataTable";
 //BA.debugLineNum = 628;BA.debugLine="DataTable.SetAttr(\"save\", save)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("save",(Object)(_save));
 //BA.debugLineNum = 629;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 630;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setscroll(Object _b) throws Exception{
 //BA.debugLineNum = 318;BA.debugLine="Sub SetScroll(b As Object) As WixDataTable";
 //BA.debugLineNum = 319;BA.debugLine="DataTable.SetAttr(\"scroll\", b)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("scroll",_b);
 //BA.debugLineNum = 320;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 321;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setscrollaligny(boolean _scrollaligny) throws Exception{
 //BA.debugLineNum = 632;BA.debugLine="Sub SetScrollAlignY(scrollAlignY As Boolean) As Wi";
 //BA.debugLineNum = 633;BA.debugLine="DataTable.SetAttr(\"scrollAlignY\", scrollAlignY)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("scrollAlignY",(Object)(_scrollaligny));
 //BA.debugLineNum = 634;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 635;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setscrollx(Object _b) throws Exception{
 //BA.debugLineNum = 177;BA.debugLine="Sub SetScrollX(b As Object) As WixDataTable";
 //BA.debugLineNum = 178;BA.debugLine="DataTable.SetAttr(\"scrollX\", b)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("scrollX",_b);
 //BA.debugLineNum = 179;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setscrollxy(Object _b) throws Exception{
 //BA.debugLineNum = 323;BA.debugLine="Sub SetScrollXY(b As Object) As WixDataTable   'ig";
 //BA.debugLineNum = 324;BA.debugLine="DataTable.SetAttr(\"scroll\", \"xy\")";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("scroll",(Object)("xy"));
 //BA.debugLineNum = 325;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 326;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setscrolly(Object _b) throws Exception{
 //BA.debugLineNum = 171;BA.debugLine="Sub SetScrollY(b As Object) As WixDataTable";
 //BA.debugLineNum = 172;BA.debugLine="DataTable.SetAttr(\"scrollY\", b)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("scrollY",_b);
 //BA.debugLineNum = 173;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setselect(Object _s) throws Exception{
 //BA.debugLineNum = 281;BA.debugLine="Sub SetSelect(s As Object) As WixDataTable";
 //BA.debugLineNum = 282;BA.debugLine="DataTable.SetAttr(\"select\", s)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("select",_s);
 //BA.debugLineNum = 283;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 284;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setselectcell(boolean _b) throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Sub SetSelectCell(b As Boolean) As WixDataTable  '";
 //BA.debugLineNum = 70;BA.debugLine="SetSelect(DT_SELECT_CELL)";
_setselect((Object)(_dt_select_cell));
 //BA.debugLineNum = 71;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setselectcolumn(boolean _b) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Sub SetSelectColumn(b As Boolean) As WixDataTable";
 //BA.debugLineNum = 76;BA.debugLine="SetSelect(DT_SELECT_COLUMN)";
_setselect((Object)(_dt_select_column));
 //BA.debugLineNum = 77;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setselectrow(boolean _b) throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Sub SetSelectRow(b As Boolean) As WixDataTable  'i";
 //BA.debugLineNum = 64;BA.debugLine="SetSelect(DT_SELECT_ROW)";
_setselect((Object)(_dt_select_row));
 //BA.debugLineNum = 65;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 50;BA.debugLine="DataTable.SetStyle(prop,sval)";
_datatable._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 51;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 40;BA.debugLine="Sub SetStyles(m As Map) As WixDataTable";
 //BA.debugLineNum = 41;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 42;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 43;BA.debugLine="DataTable.SetStyle(k,v)";
_datatable._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 45;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 55;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixDataTab";
 //BA.debugLineNum = 56;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 57;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 58;BA.debugLine="DataTable.SetTemplate(os)";
_datatable._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 59;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 409;BA.debugLine="Sub SetTooltip(tt As String) As WixDataTable";
 //BA.debugLineNum = 410;BA.debugLine="DataTable.SetTooltip(tt)";
_datatable._settooltip /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_tt);
 //BA.debugLineNum = 411;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 412;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _settopsplit(int _r) throws Exception{
 //BA.debugLineNum = 372;BA.debugLine="Sub SetTopSplit(r As Int) As WixDataTable";
 //BA.debugLineNum = 373;BA.debugLine="DataTable.SetAttr(\"topSplit\", r)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("topSplit",(Object)(_r));
 //BA.debugLineNum = 374;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 375;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _settype(String _stype) throws Exception{
 //BA.debugLineNum = 638;BA.debugLine="Sub SetType(sType As String) As WixDataTable";
 //BA.debugLineNum = 639;BA.debugLine="DataTable.SetAttr(\"type\", sType)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("type",(Object)(_stype));
 //BA.debugLineNum = 640;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 641;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setundo(boolean _undo) throws Exception{
 //BA.debugLineNum = 643;BA.debugLine="Sub SetUndo(undo As Boolean) As WixDataTable";
 //BA.debugLineNum = 644;BA.debugLine="DataTable.SetAttr(\"undo\", undo)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("undo",(Object)(_undo));
 //BA.debugLineNum = 645;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 646;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _seturl(String _u) throws Exception{
 //BA.debugLineNum = 341;BA.debugLine="Sub SetURL(u As String) As WixDataTable";
 //BA.debugLineNum = 342;BA.debugLine="DataTable.SetAttr(\"url\", u)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("url",(Object)(_u));
 //BA.debugLineNum = 343;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 344;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setvisiblebatch(int _b) throws Exception{
 //BA.debugLineNum = 335;BA.debugLine="Sub SetVisibleBatch(b As Int) As WixDataTable";
 //BA.debugLineNum = 336;BA.debugLine="DataTable.SetAttr(\"visibleBatch\", b)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("visibleBatch",(Object)(_b));
 //BA.debugLineNum = 337;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 338;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setwidth(Object _h) throws Exception{
 //BA.debugLineNum = 436;BA.debugLine="Sub SetWidth(h As Object) As WixDataTable";
 //BA.debugLineNum = 437;BA.debugLine="DataTable.SetWidth(h)";
_datatable._setwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 438;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 439;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setxcount(int _x) throws Exception{
 //BA.debugLineNum = 148;BA.debugLine="Sub SetXCount(x As Int) As WixDataTable";
 //BA.debugLineNum = 149;BA.debugLine="DataTable.SetAttr(\"xCount\", x)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("xCount",(Object)(_x));
 //BA.debugLineNum = 150;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _setycount(int _x) throws Exception{
 //BA.debugLineNum = 134;BA.debugLine="Sub SetYCount(x As Int) As WixDataTable";
 //BA.debugLineNum = 135;BA.debugLine="DataTable.SetAttr(\"yCount\", x)";
_datatable._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("yCount",(Object)(_x));
 //BA.debugLineNum = 136;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatatable)(this);
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
