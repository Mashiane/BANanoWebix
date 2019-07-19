package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixdatacolumn extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixdatacolumn", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixdatacolumn.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _datacolumn = null;
public anywheresoftware.b4a.objects.collections.Map _hdr = null;
public Object _title = null;
public anywheresoftware.b4a.objects.collections.Map _styles = null;
public boolean _hasfilter = false;
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
 //BA.debugLineNum = 429;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 430;BA.debugLine="P.AddDataColumn(Item)";
_p._adddatacolumn /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 431;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 434;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 435;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 436;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 424;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 425;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 426;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public DataColumn As WixElement";
_datacolumn = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private hdr As Map";
_hdr = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 6;BA.debugLine="Private title As Object";
_title = new Object();
 //BA.debugLineNum = 7;BA.debugLine="Private Styles As Map";
_styles = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 8;BA.debugLine="Private hasFilter As Boolean";
_hasfilter = false;
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixdatacolumn  _initialize(anywheresoftware.b4a.BA _ba,String _cid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize(cID As String) As WixDataCol";
 //BA.debugLineNum = 13;BA.debugLine="ID = cID.tolowercase";
_id = _cid.toLowerCase();
 //BA.debugLineNum = 14;BA.debugLine="DataColumn.Initialize(ID)";
_datacolumn._initialize /*b4j.example.wixelement*/ (ba,_id);
 //BA.debugLineNum = 15;BA.debugLine="hdr.Initialize";
_hdr.Initialize();
 //BA.debugLineNum = 16;BA.debugLine="title = \"\"";
_title = (Object)("");
 //BA.debugLineNum = 17;BA.debugLine="Styles.Initialize";
_styles.Initialize();
 //BA.debugLineNum = 18;BA.debugLine="hasFilter = False";
_hasfilter = __c.False;
 //BA.debugLineNum = 19;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
anywheresoftware.b4a.objects.collections.List _lst = null;
 //BA.debugLineNum = 400;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 401;BA.debugLine="If Styles.Size > 0 Then";
if (_styles.getSize()>0) { 
 //BA.debugLineNum = 402;BA.debugLine="hdr.Put(\"css\", Styles)";
_hdr.Put((Object)("css"),(Object)(_styles.getObject()));
 };
 //BA.debugLineNum = 404;BA.debugLine="If hdr.Size > 0 Then";
if (_hdr.getSize()>0) { 
 //BA.debugLineNum = 405;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 406;BA.debugLine="lst.Initialize";
_lst.Initialize();
 //BA.debugLineNum = 407;BA.debugLine="If hasFilter Then";
if (_hasfilter) { 
 //BA.debugLineNum = 408;BA.debugLine="lst.Add(title)";
_lst.Add(_title);
 //BA.debugLineNum = 409;BA.debugLine="lst.Add(hdr)";
_lst.Add((Object)(_hdr.getObject()));
 }else {
 //BA.debugLineNum = 411;BA.debugLine="lst.Add(hdr)";
_lst.Add((Object)(_hdr.getObject()));
 //BA.debugLineNum = 412;BA.debugLine="lst.Add(title)";
_lst.Add(_title);
 };
 //BA.debugLineNum = 414;BA.debugLine="DataColumn.SetAttr(\"header\", lst)";
_datacolumn._setattr /*b4j.example.wixelement*/ ("header",(Object)(_lst.getObject()));
 }else {
 //BA.debugLineNum = 416;BA.debugLine="DataColumn.SetAttr(\"header\", title)";
_datacolumn._setattr /*b4j.example.wixelement*/ ("header",_title);
 };
 //BA.debugLineNum = 419;BA.debugLine="Return DataColumn.item";
if (true) return _datacolumn._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 420;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _setadjust(Object _a) throws Exception{
 //BA.debugLineNum = 124;BA.debugLine="Sub SetAdjust(a As Object) As WixDataColumn";
 //BA.debugLineNum = 125;BA.debugLine="DataColumn.SetAttr(\"adjust\", a)";
_datacolumn._setattr /*b4j.example.wixelement*/ ("adjust",_a);
 //BA.debugLineNum = 126;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _setadjustdata(boolean _b) throws Exception{
 //BA.debugLineNum = 136;BA.debugLine="Sub SetAdjustData(b As Boolean) As WixDataColumn";
 //BA.debugLineNum = 137;BA.debugLine="SetAdjust(\"data\")";
_setadjust((Object)("data"));
 //BA.debugLineNum = 138;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _setadjustheader(boolean _b) throws Exception{
 //BA.debugLineNum = 130;BA.debugLine="Sub SetAdjustHeader(b As Boolean) As WixDataColumn";
 //BA.debugLineNum = 131;BA.debugLine="SetAdjust(\"header\")";
_setadjust((Object)("header"));
 //BA.debugLineNum = 132;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _setalign(Object _r) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Sub SetAlign(r As Object) As WixDataColumn";
 //BA.debugLineNum = 107;BA.debugLine="DataColumn.SetStyle(\"text-align\", r)";
_datacolumn._setstyle /*b4j.example.wixelement*/ ("text-align",BA.ObjectToString(_r));
 //BA.debugLineNum = 108;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _setaligncenter(boolean _b) throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Sub SetAlignCenter(b As Boolean) As WixDataColumn";
 //BA.debugLineNum = 119;BA.debugLine="DataColumn.SetStyle(\"text-align\", \"center\")";
_datacolumn._setstyle /*b4j.example.wixelement*/ ("text-align","center");
 //BA.debugLineNum = 120;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _setalignright(boolean _b) throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Sub SetAlignRight(b As Boolean) As WixDataColumn";
 //BA.debugLineNum = 113;BA.debugLine="DataColumn.SetStyle(\"text-align\", \"right\")";
_datacolumn._setstyle /*b4j.example.wixelement*/ ("text-align","right");
 //BA.debugLineNum = 114;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _setbatch(int _b) throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Sub SetBatch(b As Int) As WixDataColumn";
 //BA.debugLineNum = 96;BA.debugLine="DataColumn.SetAttr(\"batch\", b)";
_datacolumn._setattr /*b4j.example.wixelement*/ ("batch",(Object)(_b));
 //BA.debugLineNum = 97;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _setcheckbox(boolean _b) throws Exception{
 //BA.debugLineNum = 271;BA.debugLine="Sub SetCheckBox(b As Boolean) As WixDataColumn		'i";
 //BA.debugLineNum = 272;BA.debugLine="SetTemplate(\"{common.checkbox()}\")";
_settemplate((Object)("{common.checkbox()}"));
 //BA.debugLineNum = 273;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 274;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _setcheckvalue(Object _v) throws Exception{
 //BA.debugLineNum = 252;BA.debugLine="Sub SetCheckValue(v As Object) As WixDataColumn";
 //BA.debugLineNum = 253;BA.debugLine="DataColumn.SetAttr(\"checkValue\", v)";
_datacolumn._setattr /*b4j.example.wixelement*/ ("checkValue",_v);
 //BA.debugLineNum = 254;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 255;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _setcollection(Object _s) throws Exception{
 //BA.debugLineNum = 331;BA.debugLine="Sub SetCollection(s As Object) As WixDataColumn";
 //BA.debugLineNum = 332;BA.debugLine="DataColumn.SetAttr(\"collection\", s)";
_datacolumn._setattr /*b4j.example.wixelement*/ ("collection",_s);
 //BA.debugLineNum = 333;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 334;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _setcontent(Object _c) throws Exception{
 //BA.debugLineNum = 294;BA.debugLine="Sub SetContent(c As Object) As WixDataColumn";
 //BA.debugLineNum = 295;BA.debugLine="hdr.Put(\"content\", c)";
_hdr.Put((Object)("content"),_c);
 //BA.debugLineNum = 296;BA.debugLine="hasFilter = True";
_hasfilter = __c.True;
 //BA.debugLineNum = 297;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 298;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _setcss(Object _c) throws Exception{
 //BA.debugLineNum = 221;BA.debugLine="Sub SetCSS(c As Object) As WixDataColumn";
 //BA.debugLineNum = 222;BA.debugLine="DataColumn.SetAttr(\"css\", c)";
_datacolumn._setattr /*b4j.example.wixelement*/ ("css",_c);
 //BA.debugLineNum = 223;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 224;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _setcssjson(String _json) throws Exception{
 //BA.debugLineNum = 227;BA.debugLine="Sub SetCSSJSON(json As String) As WixDataColumn";
 //BA.debugLineNum = 228;BA.debugLine="DataColumn.SetCSSJSON(json)";
_datacolumn._setcssjson /*b4j.example.wixelement*/ (_json);
 //BA.debugLineNum = 229;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 230;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _setdatefilter(boolean _b) throws Exception{
 //BA.debugLineNum = 308;BA.debugLine="Sub SetDateFilter(b As Boolean) As WixDataColumn";
 //BA.debugLineNum = 309;BA.debugLine="hdr.Put(\"content\", \"dateFilter\")";
_hdr.Put((Object)("content"),(Object)("dateFilter"));
 //BA.debugLineNum = 310;BA.debugLine="hasFilter = True";
_hasfilter = __c.True;
 //BA.debugLineNum = 311;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 312;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _seteditor(String _e) throws Exception{
 //BA.debugLineNum = 154;BA.debugLine="Sub SetEditor(e As String) As WixDataColumn";
 //BA.debugLineNum = 155;BA.debugLine="DataColumn.SetAttr(\"editor\", e)";
_datacolumn._setattr /*b4j.example.wixelement*/ ("editor",(Object)(_e));
 //BA.debugLineNum = 156;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _seteditorcheckbox(String _r) throws Exception{
 //BA.debugLineNum = 215;BA.debugLine="Sub SetEditorCheckBox(r As String) As WixDataColum";
 //BA.debugLineNum = 216;BA.debugLine="SetEditor(\"checkbox\")";
_seteditor("checkbox");
 //BA.debugLineNum = 217;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 218;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _seteditorcolor(String _r) throws Exception{
 //BA.debugLineNum = 167;BA.debugLine="Sub SetEditorColor(r As String) As WixDataColumn";
 //BA.debugLineNum = 168;BA.debugLine="SetEditor(\"color\")";
_seteditor("color");
 //BA.debugLineNum = 169;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _seteditorcombo(String _r) throws Exception{
 //BA.debugLineNum = 203;BA.debugLine="Sub SetEditorCombo(r As String) As WixDataColumn";
 //BA.debugLineNum = 204;BA.debugLine="SetEditor(\"combo\")";
_seteditor("combo");
 //BA.debugLineNum = 205;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 206;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _seteditordate(String _r) throws Exception{
 //BA.debugLineNum = 185;BA.debugLine="Sub SetEditorDate(r As String) As WixDataColumn";
 //BA.debugLineNum = 186;BA.debugLine="SetEditor(\"date\")";
_seteditor("date");
 //BA.debugLineNum = 187;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _seteditorinlinecheckbox(String _r) throws Exception{
 //BA.debugLineNum = 234;BA.debugLine="Sub SetEditorInlineCheckBox(r As String) As WixDat";
 //BA.debugLineNum = 235;BA.debugLine="SetEditor(\"inline-checkbox\")";
_seteditor("inline-checkbox");
 //BA.debugLineNum = 236;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 237;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _seteditorinlinetext(String _r) throws Exception{
 //BA.debugLineNum = 191;BA.debugLine="Sub SetEditorInlineText(r As String) As WixDataCol";
 //BA.debugLineNum = 192;BA.debugLine="SetEditor(\"inline-text\")";
_seteditor("inline-text");
 //BA.debugLineNum = 193;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _seteditorpassword(String _r) throws Exception{
 //BA.debugLineNum = 179;BA.debugLine="Sub SetEditorPassword(r As String) As WixDataColum";
 //BA.debugLineNum = 180;BA.debugLine="SetEditor(\"password\")";
_seteditor("password");
 //BA.debugLineNum = 181;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _seteditorpopup(String _e) throws Exception{
 //BA.debugLineNum = 160;BA.debugLine="Sub SetEditorPopUp(e As String) As WixDataColumn";
 //BA.debugLineNum = 161;BA.debugLine="SetEditor(\"popup\")";
_seteditor("popup");
 //BA.debugLineNum = 162;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 163;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _seteditorrichselect(String _r) throws Exception{
 //BA.debugLineNum = 209;BA.debugLine="Sub SetEditorRichSelect(r As String) As WixDataCol";
 //BA.debugLineNum = 210;BA.debugLine="SetEditor(\"richselect\")";
_seteditor("richselect");
 //BA.debugLineNum = 211;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 212;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _seteditorselect(String _r) throws Exception{
 //BA.debugLineNum = 197;BA.debugLine="Sub SetEditorSelect(r As String) As WixDataColumn";
 //BA.debugLineNum = 198;BA.debugLine="SetEditor(\"select\")";
_seteditor("select");
 //BA.debugLineNum = 199;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 200;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _seteditortext(String _r) throws Exception{
 //BA.debugLineNum = 173;BA.debugLine="Sub SetEditorText(r As String) As WixDataColumn";
 //BA.debugLineNum = 174;BA.debugLine="SetEditor(\"text\")";
_seteditor("text");
 //BA.debugLineNum = 175;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _setfillspace(Object _s) throws Exception{
 //BA.debugLineNum = 240;BA.debugLine="Sub SetFillSpace(s As Object) As WixDataColumn";
 //BA.debugLineNum = 241;BA.debugLine="DataColumn.SetAttr(\"fillspace\", s)";
_datacolumn._setattr /*b4j.example.wixelement*/ ("fillspace",_s);
 //BA.debugLineNum = 242;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 243;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _setformat(Object _s) throws Exception{
 //BA.debugLineNum = 369;BA.debugLine="Sub SetFormat(s As Object) As WixDataColumn";
 //BA.debugLineNum = 370;BA.debugLine="DataColumn.SetAttr(\"format\", s)";
_datacolumn._setattr /*b4j.example.wixelement*/ ("format",_s);
 //BA.debugLineNum = 371;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 372;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _setheader(Object _h) throws Exception{
 //BA.debugLineNum = 142;BA.debugLine="Sub SetHeader(h As Object) As WixDataColumn";
 //BA.debugLineNum = 143;BA.debugLine="title = h";
_title = _h;
 //BA.debugLineNum = 144;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _setheadercolspan(Object _c) throws Exception{
 //BA.debugLineNum = 394;BA.debugLine="Sub SetHeaderColSpan(c As Object) As WixDataColumn";
 //BA.debugLineNum = 395;BA.debugLine="hdr.Put(\"colspan\", c)";
_hdr.Put((Object)("colspan"),_c);
 //BA.debugLineNum = 396;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 397;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _setheadercss(Object _c) throws Exception{
 //BA.debugLineNum = 388;BA.debugLine="Sub SetHeaderCSS(c As Object) As WixDataColumn";
 //BA.debugLineNum = 389;BA.debugLine="hdr.put(\"css\", c)";
_hdr.Put((Object)("css"),_c);
 //BA.debugLineNum = 390;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 391;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _setheadertext(Object _t) throws Exception{
 //BA.debugLineNum = 382;BA.debugLine="Sub SetHeaderText(t As Object) As WixDataColumn";
 //BA.debugLineNum = 383;BA.debugLine="hdr.Put(\"text\", t)";
_hdr.Put((Object)("text"),_t);
 //BA.debugLineNum = 384;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 385;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _setheight(int _h) throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Sub SetHeight(h As Int) As WixDataColumn";
 //BA.debugLineNum = 68;BA.debugLine="DataColumn.SetHeight(h)";
_datacolumn._setheight /*b4j.example.wixelement*/ ((Object)(_h));
 //BA.debugLineNum = 69;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _sethidden(boolean _b) throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Sub SetHidden(b As Boolean) As WixDataColumn";
 //BA.debugLineNum = 102;BA.debugLine="DataColumn.SetAttr(\"hidden\", b)";
_datacolumn._setattr /*b4j.example.wixelement*/ ("hidden",(Object)(_b));
 //BA.debugLineNum = 103;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 74;BA.debugLine="Sub SetMap(m As Map) As WixDataColumn";
 //BA.debugLineNum = 75;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 76;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 77;BA.debugLine="DataColumn.SetAttr(strKey,	strVal)";
_datacolumn._setattr /*b4j.example.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 79;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _setmastercheckbox(boolean _b) throws Exception{
 //BA.debugLineNum = 282;BA.debugLine="Sub SetMasterCheckBox(b As Boolean) As WixDataColu";
 //BA.debugLineNum = 283;BA.debugLine="hdr.Put(\"content\", \"masterCheckbox\")";
_hdr.Put((Object)("content"),(Object)("masterCheckbox"));
 //BA.debugLineNum = 284;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 285;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub SetMinHeight(h As Int) As WixDataColumn";
 //BA.debugLineNum = 62;BA.debugLine="DataColumn.SetMinHeight(h)";
_datacolumn._setminheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 63;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Sub SetMinWidth(w As Int) As WixDataColumn";
 //BA.debugLineNum = 56;BA.debugLine="DataColumn.SetMinWidth(w)";
_datacolumn._setminwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 57;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _setname(String _n) throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Sub SetName(n As String) As WixDataColumn";
 //BA.debugLineNum = 43;BA.debugLine="DataColumn.SetName(n)";
_datacolumn._setname /*b4j.example.wixelement*/ (_n);
 //BA.debugLineNum = 44;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _setnumberfilter(boolean _b) throws Exception{
 //BA.debugLineNum = 301;BA.debugLine="Sub SetNumberFilter(b As Boolean) As WixDataColumn";
 //BA.debugLineNum = 302;BA.debugLine="hdr.Put(\"content\", \"numberFilter\")";
_hdr.Put((Object)("content"),(Object)("numberFilter"));
 //BA.debugLineNum = 303;BA.debugLine="hasFilter = True";
_hasfilter = __c.True;
 //BA.debugLineNum = 304;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 305;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _setnumberformat(Object _n) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub SetNumberFormat(n As Object) As WixDataColumn";
 //BA.debugLineNum = 90;BA.debugLine="DataColumn.SetAttr(\"numberFormat\", n)";
_datacolumn._setattr /*b4j.example.wixelement*/ ("numberFormat",_n);
 //BA.debugLineNum = 91;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _setoptions(anywheresoftware.b4a.objects.collections.List _options) throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Sub SetOptions(options As List) As WixDataColumn";
 //BA.debugLineNum = 84;BA.debugLine="DataColumn.SetAttr(\"options\", options)";
_datacolumn._setattr /*b4j.example.wixelement*/ ("options",(Object)(_options.getObject()));
 //BA.debugLineNum = 85;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _setradio(boolean _b) throws Exception{
 //BA.debugLineNum = 277;BA.debugLine="Sub SetRadio(b As Boolean) As WixDataColumn			'ign";
 //BA.debugLineNum = 278;BA.debugLine="SetTemplate(\"{common.radio()}\")";
_settemplate((Object)("{common.radio()}"));
 //BA.debugLineNum = 279;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 280;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Sub SetResponsive(b As Object) As WixDataColumn";
 //BA.debugLineNum = 31;BA.debugLine="DataColumn.SetResponsive(b)";
_datacolumn._setresponsive /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 32;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixDataColum";
 //BA.debugLineNum = 49;BA.debugLine="DataColumn.SetResponsiveCell(b)";
_datacolumn._setresponsivecell /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 50;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _setselectfilter(boolean _b) throws Exception{
 //BA.debugLineNum = 316;BA.debugLine="Sub SetSelectFilter(b As Boolean) As WixDataColumn";
 //BA.debugLineNum = 317;BA.debugLine="hdr.Put(\"content\", \"selectFilter\")";
_hdr.Put((Object)("content"),(Object)("selectFilter"));
 //BA.debugLineNum = 318;BA.debugLine="hasFilter = True";
_hasfilter = __c.True;
 //BA.debugLineNum = 319;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 320;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _setsort(Object _s) throws Exception{
 //BA.debugLineNum = 324;BA.debugLine="Sub SetSort(s As Object) As WixDataColumn";
 //BA.debugLineNum = 325;BA.debugLine="DataColumn.SetAttr(\"sort\", s)";
_datacolumn._setattr /*b4j.example.wixelement*/ ("sort",_s);
 //BA.debugLineNum = 326;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 327;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _setsortdate(boolean _b) throws Exception{
 //BA.debugLineNum = 355;BA.debugLine="Sub SetSortDate(b As Boolean) As WixDataColumn   '";
 //BA.debugLineNum = 356;BA.debugLine="SetSort(\"date\")";
_setsort((Object)("date"));
 //BA.debugLineNum = 357;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 358;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _setsortint(boolean _b) throws Exception{
 //BA.debugLineNum = 337;BA.debugLine="Sub SetSortInt(b As Boolean) As WixDataColumn   'i";
 //BA.debugLineNum = 338;BA.debugLine="SetSort(\"int\")";
_setsort((Object)("int"));
 //BA.debugLineNum = 339;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 340;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _setsortstring(boolean _b) throws Exception{
 //BA.debugLineNum = 343;BA.debugLine="Sub SetSortString(b As Boolean) As WixDataColumn";
 //BA.debugLineNum = 344;BA.debugLine="SetSort(\"string\")";
_setsort((Object)("string"));
 //BA.debugLineNum = 345;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 346;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _setsortstringstrict(boolean _b) throws Exception{
 //BA.debugLineNum = 349;BA.debugLine="Sub SetSortStringStrict(b As Boolean) As WixDataCo";
 //BA.debugLineNum = 350;BA.debugLine="SetSort(\"string_strict\")";
_setsort((Object)("string_strict"));
 //BA.debugLineNum = 351;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 352;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _setsorttext(boolean _b) throws Exception{
 //BA.debugLineNum = 362;BA.debugLine="Sub SetSortText(b As Boolean) As WixDataColumn   '";
 //BA.debugLineNum = 363;BA.debugLine="SetSort(\"text\")";
_setsort((Object)("text"));
 //BA.debugLineNum = 364;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 365;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 37;BA.debugLine="Styles.Put(prop,val)";
_styles.Put((Object)(_prop),(Object)(_val));
 //BA.debugLineNum = 38;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _setsuggest(Object _s) throws Exception{
 //BA.debugLineNum = 376;BA.debugLine="Sub SetSuggest(s As Object) As WixDataColumn";
 //BA.debugLineNum = 377;BA.debugLine="DataColumn.SetAttr(\"suggest\", s)";
_datacolumn._setattr /*b4j.example.wixelement*/ ("suggest",_s);
 //BA.debugLineNum = 378;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 379;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _settemplate(Object _t) throws Exception{
 //BA.debugLineNum = 246;BA.debugLine="Sub SetTemplate(t As Object) As WixDataColumn";
 //BA.debugLineNum = 247;BA.debugLine="DataColumn.SetTemplate(t)";
_datacolumn._settemplate /*b4j.example.wixelement*/ (_t);
 //BA.debugLineNum = 248;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 249;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 23;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixDataCol";
 //BA.debugLineNum = 24;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 25;BA.debugLine="DataColumn.SetTemplate(os)";
_datacolumn._settemplate /*b4j.example.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 26;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _settextfilter(boolean _b) throws Exception{
 //BA.debugLineNum = 288;BA.debugLine="Sub SetTextFilter(b As Boolean) As WixDataColumn";
 //BA.debugLineNum = 289;BA.debugLine="hdr.Put(\"content\", \"textFilter\")";
_hdr.Put((Object)("content"),(Object)("textFilter"));
 //BA.debugLineNum = 290;BA.debugLine="hasFilter = True";
_hasfilter = __c.True;
 //BA.debugLineNum = 291;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 292;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _settooltip(Object _v) throws Exception{
 //BA.debugLineNum = 258;BA.debugLine="Sub SetToolTip(v As Object) As WixDataColumn";
 //BA.debugLineNum = 259;BA.debugLine="DataColumn.SetAttr(\"tooltip\", v)";
_datacolumn._setattr /*b4j.example.wixelement*/ ("tooltip",_v);
 //BA.debugLineNum = 260;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 261;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _setuncheckvalue(Object _v) throws Exception{
 //BA.debugLineNum = 265;BA.debugLine="Sub SetUncheckValue(v As Object) As WixDataColumn";
 //BA.debugLineNum = 266;BA.debugLine="DataColumn.SetAttr(\"uncheckValue\", v)";
_datacolumn._setattr /*b4j.example.wixelement*/ ("uncheckValue",_v);
 //BA.debugLineNum = 267;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 268;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 148;BA.debugLine="Sub SetWidth(w As Object) As WixDataColumn";
 //BA.debugLineNum = 149;BA.debugLine="DataColumn.SetAttr(\"width\", w)";
_datacolumn._setattr /*b4j.example.wixelement*/ ("width",_w);
 //BA.debugLineNum = 150;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
