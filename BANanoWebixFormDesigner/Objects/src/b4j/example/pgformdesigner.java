package b4j.example;


import anywheresoftware.b4a.BA;

public class pgformdesigner extends Object{
public static pgformdesigner mostCurrent = new pgformdesigner();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.pgformdesigner", null);
		ba.loadHtSubs(pgformdesigner.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.pgformdesigner", ba);
		}
	}
    public static Class<?> getObject() {
		return pgformdesigner.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static b4j.example.wixpage _pg = null;
public static com.ab.banano.BANano _banano = null;
public static b4j.example.uoenowhtml _div = null;
public static String _delid = "";
public static b4j.example.wixhint _hints = null;
public static b4j.example.uoenowhtml _code = null;
public static String _dbname = "";
public static anywheresoftware.b4a.objects.collections.Map _rec = null;
public static String _qry = "";
public static String _res = "";
public static b4j.example.bananosqlite._sqliteresultset _rs = null;
public static String _json = "";
public static b4j.example.bananosqlite _sqlite = null;
public static anywheresoftware.b4a.objects.collections.List _addingmethod = null;
public static b4j.example.wixproperty _propbag = null;
public static com.ab.banano.BANanoObject _winux = null;
public static com.ab.banano.BANanoObject _drawn = null;
public static b4j.example.main _main = null;
public static b4j.example.dbutton _dbutton = null;
public static b4j.example.modcenter _modcenter = null;
public static b4j.example.modsidebar _modsidebar = null;
public static b4j.example.modtoolbar _modtoolbar = null;
public static b4j.example.drow _drow = null;
public static b4j.example.dpager _dpager = null;
public static b4j.example.ddbllist _ddbllist = null;
public static b4j.example.dform _dform = null;
public static b4j.example.dcheckbox _dcheckbox = null;
public static b4j.example.dcolorpicker _dcolorpicker = null;
public static b4j.example.dcombo _dcombo = null;
public static b4j.example.dcounter _dcounter = null;
public static b4j.example.ddatepicker _ddatepicker = null;
public static b4j.example.dicon _dicon = null;
public static b4j.example.dlabel _dlabel = null;
public static b4j.example.dradio _dradio = null;
public static b4j.example.drichselect _drichselect = null;
public static b4j.example.dsearch _dsearch = null;
public static b4j.example.dselect _dselect = null;
public static b4j.example.dsegmented _dsegmented = null;
public static b4j.example.dslider _dslider = null;
public static b4j.example.dswitch _dswitch = null;
public static b4j.example.dtabbar _dtabbar = null;
public static b4j.example.dtext _dtext = null;
public static b4j.example.dtextarea _dtextarea = null;
public static b4j.example.dtoggle _dtoggle = null;
public static b4j.example.duploader _duploader = null;
public static b4j.example.dfieldset _dfieldset = null;
public static b4j.example.dsuggest _dsuggest = null;
public static b4j.example.dcolumn _dcolumn = null;
public static b4j.example.modpropertybag _modpropertybag = null;
public static b4j.example.ddesignerproperty _ddesignerproperty = null;
public static b4j.example.dconnection _dconnection = null;
public static b4j.example.dtable _dtable = null;
public static b4j.example.dfield _dfield = null;
public static b4j.example.modwebix _modwebix = null;
public static String  _add_column() throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Sub add_column";
 //BA.debugLineNum = 123;BA.debugLine="sidebar_click(\"column\")";
_sidebar_click("column");
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return "";
}
public static String  _add_row() throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Sub add_row";
 //BA.debugLineNum = 119;BA.debugLine="sidebar_click(\"row\")";
_sidebar_click("row");
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return "";
}
public static String  _addmulti_elementswait() throws Exception{
String _parentid = "";
boolean _fvalid = false;
String _scontrols = "";
String[] _controls = null;
int _tbindex = 0;
String _ctrl = "";
anywheresoftware.b4a.objects.collections.Map _newctrl = null;
 //BA.debugLineNum = 1219;BA.debugLine="Sub addmulti_elementswait";
 //BA.debugLineNum = 1221;BA.debugLine="Dim parentid As String = pg.GetSelectedID(\"tree\")";
_parentid = _pg._getselectedid /*String*/ ("tree");
 //BA.debugLineNum = 1222;BA.debugLine="If parentid = \"\" Then";
if ((_parentid).equals("")) { 
 //BA.debugLineNum = 1223;BA.debugLine="pg.Message_Error(\"Please select the parent item";
_pg._message_error /*String*/ ("Please select the parent item from the tree first, then select the element you want to add! Remember to click Save in the property bag when done.");
 //BA.debugLineNum = 1224;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 1227;BA.debugLine="Dim fValid As Boolean = pg.Validate(\"frmx\")";
_fvalid = _pg._validate /*boolean*/ ("frmx");
 //BA.debugLineNum = 1228;BA.debugLine="If fValid = False Then";
if (_fvalid==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 1229;BA.debugLine="pg.Message_Error(\"No elements have been entered!";
_pg._message_error /*String*/ ("No elements have been entered!");
 //BA.debugLineNum = 1230;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 1233;BA.debugLine="Dim scontrols As String = pg.GetValue(\"txtmultipl";
_scontrols = _pg._getvalue /*String*/ ("txtmultiplecontrols");
 //BA.debugLineNum = 1234;BA.debugLine="scontrols = scontrols.trim";
_scontrols = _scontrols.trim();
 //BA.debugLineNum = 1237;BA.debugLine="Dim controls() As String = BANano.Split(\",\", scon";
_controls = _banano.Split(",",_scontrols);
 //BA.debugLineNum = 1238;BA.debugLine="Dim tbindex As Int = 0";
_tbindex = (int) (0);
 //BA.debugLineNum = 1239;BA.debugLine="For Each ctrl As String In controls";
{
final String[] group15 = _controls;
final int groupLen15 = group15.length
;int index15 = 0;
;
for (; index15 < groupLen15;index15++){
_ctrl = group15[index15];
 //BA.debugLineNum = 1240;BA.debugLine="tbindex = tbindex + 1";
_tbindex = (int) (_tbindex+1);
 //BA.debugLineNum = 1241;BA.debugLine="ctrl = ctrl.Trim";
_ctrl = _ctrl.trim();
 //BA.debugLineNum = 1242;BA.debugLine="If ctrl <> \"\" Then";
if ((_ctrl).equals("") == false) { 
 //BA.debugLineNum = 1243;BA.debugLine="ctrl = ctrl.ToLowerCase";
_ctrl = _ctrl.toLowerCase();
 //BA.debugLineNum = 1244;BA.debugLine="Dim newctrl As Map = TemporalText";
_newctrl = new anywheresoftware.b4a.objects.collections.Map();
_newctrl = _temporaltext();
 //BA.debugLineNum = 1245;BA.debugLine="newctrl.Put(\"id\", ctrl)";
_newctrl.Put((Object)("id"),(Object)(_ctrl));
 //BA.debugLineNum = 1246;BA.debugLine="newctrl.Put(\"parentid\", parentid)";
_newctrl.Put((Object)("parentid"),(Object)(_parentid));
 //BA.debugLineNum = 1247;BA.debugLine="newctrl.Put(\"localId\", ctrl)";
_newctrl.Put((Object)("localId"),(Object)(_ctrl));
 //BA.debugLineNum = 1248;BA.debugLine="newctrl.Put(\"name\", ctrl)";
_newctrl.Put((Object)("name"),(Object)(_ctrl));
 //BA.debugLineNum = 1249;BA.debugLine="newctrl.Put(\"tabindex\",tbindex)";
_newctrl.Put((Object)("tabindex"),(Object)(_tbindex));
 //BA.debugLineNum = 1250;BA.debugLine="newctrl.Put(\"label\",ctrl)";
_newctrl.Put((Object)("label"),(Object)(_ctrl));
 //BA.debugLineNum = 1252;BA.debugLine="Dim json As String = pg.Map2Json(newctrl)";
_json = _pg._map2json /*String*/ (_newctrl);
 //BA.debugLineNum = 1255;BA.debugLine="sqlite.Initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 1256;BA.debugLine="sqlite.AddStrings(Array(\"id\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 1257;BA.debugLine="Dim rec As Map = CreateMap()";
_rec = new anywheresoftware.b4a.objects.collections.Map();
_rec = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {});
 //BA.debugLineNum = 1258;BA.debugLine="rec.Put(\"id\", ctrl)";
_rec.Put((Object)("id"),(Object)(_ctrl));
 //BA.debugLineNum = 1259;BA.debugLine="rec.put(\"json\", json)";
_rec.Put((Object)("json"),(Object)(_json));
 //BA.debugLineNum = 1260;BA.debugLine="rec.Put(\"tabindex\", tbindex)";
_rec.Put((Object)("tabindex"),(Object)(_tbindex));
 //BA.debugLineNum = 1261;BA.debugLine="rec.Put(\"parentid\", parentid)";
_rec.Put((Object)("parentid"),(Object)(_parentid));
 //BA.debugLineNum = 1262;BA.debugLine="qry = sqlite.Insert(\"items\", rec)";
_qry = _sqlite._insert /*String*/ ("items",_rec);
 //BA.debugLineNum = 1263;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\",";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 1264;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 1265;BA.debugLine="pg.Message_Success(rs.result.size & \" record(s)";
_pg._message_success /*String*/ (BA.NumberToString(_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" record(s) affected!");
 };
 }
};
 //BA.debugLineNum = 1268;BA.debugLine="pg.BoClose(winux)";
_pg._boclose /*String*/ (_winux);
 //BA.debugLineNum = 1269;BA.debugLine="RefreshTreeWait";
_refreshtreewait();
 //BA.debugLineNum = 1270;BA.debugLine="End Sub";
return "";
}
public static String  _addprimarykey() throws Exception{
anywheresoftware.b4a.objects.collections.Map _tb = null;
String _tbname = "";
String _pk = "";
String _ft = "";
String _k = "";
anywheresoftware.b4a.objects.collections.Map _nf = null;
anywheresoftware.b4a.objects.collections.Map _jsonm = null;
 //BA.debugLineNum = 221;BA.debugLine="Sub AddPrimaryKey";
 //BA.debugLineNum = 222;BA.debugLine="Dim tb As Map = pg.GetValues(\"propbag\")";
_tb = new anywheresoftware.b4a.objects.collections.Map();
_tb = _pg._getvalues /*anywheresoftware.b4a.objects.collections.Map*/ ("propbag");
 //BA.debugLineNum = 223;BA.debugLine="Dim tbname As String = tb.GetDefault(\"value\",\"\")";
_tbname = BA.ObjectToString(_tb.GetDefault((Object)("value"),(Object)("")));
 //BA.debugLineNum = 224;BA.debugLine="Dim pk As String = tb.GetDefault(\"primarykey\",\"\")";
_pk = BA.ObjectToString(_tb.GetDefault((Object)("primarykey"),(Object)("")));
 //BA.debugLineNum = 225;BA.debugLine="Dim ft As String = tb.GetDefault(\"type\",\"\")";
_ft = BA.ObjectToString(_tb.GetDefault((Object)("type"),(Object)("")));
 //BA.debugLineNum = 227;BA.debugLine="Dim k As String = $\"field.${tbname}.${pk}\"$";
_k = ("field."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tbname))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_pk))+"");
 //BA.debugLineNum = 229;BA.debugLine="Dim nf As Map = CreateMap()";
_nf = new anywheresoftware.b4a.objects.collections.Map();
_nf = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {});
 //BA.debugLineNum = 230;BA.debugLine="nf.Put(\"key\", k)";
_nf.Put((Object)("key"),(Object)(_k));
 //BA.debugLineNum = 231;BA.debugLine="nf.put(\"id\", \"field\")";
_nf.Put((Object)("id"),(Object)("field"));
 //BA.debugLineNum = 232;BA.debugLine="nf.put(\"tablename\", tbname)";
_nf.Put((Object)("tablename"),(Object)(_tbname));
 //BA.debugLineNum = 233;BA.debugLine="nf.Put(\"value\", pk)";
_nf.Put((Object)("value"),(Object)(_pk));
 //BA.debugLineNum = 235;BA.debugLine="Dim jsonm As Map = CreateMap()";
_jsonm = new anywheresoftware.b4a.objects.collections.Map();
_jsonm = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {});
 //BA.debugLineNum = 236;BA.debugLine="jsonm.Put(\"type\", ft)";
_jsonm.Put((Object)("type"),(Object)(_ft));
 //BA.debugLineNum = 237;BA.debugLine="jsonm.Put(\"length\", \"20\")";
_jsonm.Put((Object)("length"),(Object)("20"));
 //BA.debugLineNum = 238;BA.debugLine="jsonm.put(\"id\", \"field\")";
_jsonm.Put((Object)("id"),(Object)("field"));
 //BA.debugLineNum = 239;BA.debugLine="jsonm.put(\"tablename\", tbname)";
_jsonm.Put((Object)("tablename"),(Object)(_tbname));
 //BA.debugLineNum = 240;BA.debugLine="jsonm.Put(\"value\", pk)";
_jsonm.Put((Object)("value"),(Object)(_pk));
 //BA.debugLineNum = 242;BA.debugLine="Dim json As String = pg.Map2Json(jsonm)";
_json = _pg._map2json /*String*/ (_jsonm);
 //BA.debugLineNum = 243;BA.debugLine="nf.Put(\"json\", json)";
_nf.Put((Object)("json"),(Object)(_json));
 //BA.debugLineNum = 246;BA.debugLine="sqlite.Initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 247;BA.debugLine="sqlite.AddStrings(Array(\"id\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 249;BA.debugLine="qry = sqlite.InsertReplace(\"fields\", nf)";
_qry = _sqlite._insertreplace /*String*/ ("fields",_nf);
 //BA.debugLineNum = 250;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\", Cr";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 252;BA.debugLine="sqlite.initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 253;BA.debugLine="sqlite.AddStrings(Array(\"id\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 254;BA.debugLine="qry = sqlite.Exists(\"fields\", \"key\", k)";
_qry = _sqlite._exists /*String*/ ("fields","key",_k);
 //BA.debugLineNum = 255;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\", Cr";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 256;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 257;BA.debugLine="pg.Message(rs.result.size & \" record(s) affected!";
_pg._message /*String*/ (BA.NumberToString(_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" record(s) affected!");
 //BA.debugLineNum = 258;BA.debugLine="End Sub";
return "";
}
public static String  _capitalize(String _t) throws Exception{
String _s = "";
String _r = "";
String _o = "";
 //BA.debugLineNum = 681;BA.debugLine="Sub Capitalize(t As String) As String";
 //BA.debugLineNum = 682;BA.debugLine="Dim s , r , o As String";
_s = "";
_r = "";
_o = "";
 //BA.debugLineNum = 683;BA.debugLine="s = t.SubString2(0,1)";
_s = _t.substring((int) (0),(int) (1));
 //BA.debugLineNum = 684;BA.debugLine="r = t.SubString2(1, t.Length)";
_r = _t.substring((int) (1),_t.length());
 //BA.debugLineNum = 685;BA.debugLine="o = s.ToUpperCase & r";
_o = _s.toUpperCase()+_r;
 //BA.debugLineNum = 686;BA.debugLine="Return o";
if (true) return _o;
 //BA.debugLineNum = 687;BA.debugLine="End Sub";
return "";
}
public static String  _clearcodeit() throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt1 = null;
 //BA.debugLineNum = 162;BA.debugLine="Sub ClearCodeIT";
 //BA.debugLineNum = 163;BA.debugLine="Dim opt1 As Map = CreateMap(\"template\": \"\")";
_opt1 = new anywheresoftware.b4a.objects.collections.Map();
_opt1 = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("template"),(Object)("")});
 //BA.debugLineNum = 164;BA.debugLine="pg.Define(\"codeit\", opt1)";
_pg._define /*String*/ ("codeit",_opt1);
 //BA.debugLineNum = 165;BA.debugLine="pg.Refresh(\"codeit\")";
_pg._refresh /*String*/ ("codeit");
 //BA.debugLineNum = 166;BA.debugLine="End Sub";
return "";
}
public static String  _clearform() throws Exception{
boolean _confirmresult = false;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 532;BA.debugLine="Sub clearform";
 //BA.debugLineNum = 533;BA.debugLine="Dim confirmresult As Boolean = False";
_confirmresult = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 534;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Me,\"clea";
_cb = (com.ab.banano.BANanoObject)(_banano.CallBack(pgformdesigner.getObject(),"clearform1wait",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_confirmresult)})));
 //BA.debugLineNum = 535;BA.debugLine="pg.Confirm(cb, \"Confirm Delete\", \"Are you sure th";
_pg._confirm /*String*/ (_cb,"Confirm Delete","Are you sure that you want to clear this form? You will not be able to undo your changes. Continue?");
 //BA.debugLineNum = 536;BA.debugLine="End Sub";
return "";
}
public static String  _clearform1wait() throws Exception{
 //BA.debugLineNum = 538;BA.debugLine="Sub clearform1wait";
 //BA.debugLineNum = 539;BA.debugLine="sqlite.Initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 540;BA.debugLine="sqlite.AddStrings(Array(\"id\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 541;BA.debugLine="qry = sqlite.DeleteAll(\"items\")";
_qry = _sqlite._deleteall /*String*/ ("items");
 //BA.debugLineNum = 542;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\", Cr";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 543;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 544;BA.debugLine="pg.Message_Success(rs.result.size & \" record(s) a";
_pg._message_success /*String*/ (BA.NumberToString(_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" record(s) affected!");
 //BA.debugLineNum = 545;BA.debugLine="refreshapp";
_refreshapp();
 //BA.debugLineNum = 546;BA.debugLine="End Sub";
return "";
}
public static String  _clearpreviewit() throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 154;BA.debugLine="Sub ClearPreviewIT";
 //BA.debugLineNum = 155;BA.debugLine="Dim div As UOENowHTML";
_div = new b4j.example.uoenowhtml();
 //BA.debugLineNum = 156;BA.debugLine="div.Initialize(\"previewit\",\"div\").SetStyle(\"width";
_div._initialize /*b4j.example.uoenowhtml*/ (ba,"previewit","div")._setstyle /*b4j.example.uoenowhtml*/ ("width","100%")._setstyle /*b4j.example.uoenowhtml*/ ("height","100%");
 //BA.debugLineNum = 157;BA.debugLine="Dim opt As Map = CreateMap(\"template\": div.html)";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("template"),(Object)(_div._html /*String*/ ())});
 //BA.debugLineNum = 158;BA.debugLine="pg.Define(\"previewit\", opt)";
_pg._define /*String*/ ("previewit",_opt);
 //BA.debugLineNum = 159;BA.debugLine="pg.Refresh(\"previewit\")";
_pg._refresh /*String*/ ("previewit");
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return "";
}
public static String  _closewin() throws Exception{
 //BA.debugLineNum = 1301;BA.debugLine="Sub closeWin";
 //BA.debugLineNum = 1302;BA.debugLine="pg.boClose(winux)";
_pg._boclose /*String*/ (_winux);
 //BA.debugLineNum = 1303;BA.debugLine="End Sub";
return "";
}
public static String  _createtablecode(String _tblname,String _prikey,b4j.example.bananosqlite._sqliteresultset _rsx) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.objects.collections.Map _fldmap = null;
anywheresoftware.b4a.objects.collections.Map _fmap = null;
String _fldname = "";
String _fldtype = "";
String _fldleng = "";
 //BA.debugLineNum = 260;BA.debugLine="Sub CreateTableCode(tblName As String, priKey As S";
 //BA.debugLineNum = 261;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 262;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 263;BA.debugLine="sb.append(\"'Copy this code to Main.BANano_Ready\")";
_sb.Append("'Copy this code to Main.BANano_Ready").Append(anywheresoftware.b4a.keywords.Common.CRLF).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 264;BA.debugLine="sb.Append(\"'create the table\").Append(CRLF)";
_sb.Append("'create the table").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 265;BA.debugLine="sb.append(\"Dim newTable As Map = CreateMap()\").Ap";
_sb.Append("Dim newTable As Map = CreateMap()").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 267;BA.debugLine="For Each fldmap As Map In rsx.result";
_fldmap = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group6 = _rsx.result /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_fldmap.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group6.Get(index6)));
 //BA.debugLineNum = 268;BA.debugLine="Dim json As String = fldmap.Get(\"json\")";
_json = BA.ObjectToString(_fldmap.Get((Object)("json")));
 //BA.debugLineNum = 269;BA.debugLine="Dim fmap As Map = pg.Json2Map(json)";
_fmap = new anywheresoftware.b4a.objects.collections.Map();
_fmap = _pg._json2map /*anywheresoftware.b4a.objects.collections.Map*/ (_json);
 //BA.debugLineNum = 270;BA.debugLine="Dim fldname As String = fmap.Get(\"value\")";
_fldname = BA.ObjectToString(_fmap.Get((Object)("value")));
 //BA.debugLineNum = 271;BA.debugLine="Dim fldtype As String = fmap.Get(\"type\")";
_fldtype = BA.ObjectToString(_fmap.Get((Object)("type")));
 //BA.debugLineNum = 272;BA.debugLine="Dim fldLeng As String = fmap.get(\"length\")";
_fldleng = BA.ObjectToString(_fmap.Get((Object)("length")));
 //BA.debugLineNum = 274;BA.debugLine="sb.Append($\"newTable.put(\"${fldname}\",\"${fldtype";
_sb.Append(("newTable.put(\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_fldname))+"\",\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_fldtype))+"\")")).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 }
};
 //BA.debugLineNum = 276;BA.debugLine="sb.append(CRLF)";
_sb.Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 277;BA.debugLine="sb.append(\"'initialize the helper class\").Append(";
_sb.Append("'initialize the helper class").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 278;BA.debugLine="sb.Append(\"Dim alaSQL As BANanoAlaSQL\").append(CR";
_sb.Append("Dim alaSQL As BANanoAlaSQL").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 279;BA.debugLine="sb.append(\"alaSQL.Initialize\").append(CRLF)";
_sb.Append("alaSQL.Initialize").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 280;BA.debugLine="sb.Append(\"'generate the create table sql\").Appen";
_sb.Append("'generate the create table sql").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 281;BA.debugLine="sb.Append($\"Dim rs As AlaSQLResultSet = alaSQL.Cr";
_sb.Append(("Dim rs As AlaSQLResultSet = alaSQL.CreateTable(\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tblname))+"\", newTable, \""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_prikey))+"\")")).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 282;BA.debugLine="sb.append(\"'execute the create table command\").Ap";
_sb.Append("'execute the create table command").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 283;BA.debugLine="sb.append($\"rs.Result = db.ExecuteWait(rs.query,";
_sb.Append(("rs.Result = db.ExecuteWait(rs.query, rs.args)")).Append(anywheresoftware.b4a.keywords.Common.CRLF).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 285;BA.debugLine="sb.Append(\"'This code should be copied to your mo";
_sb.Append("'This code should be copied to your modules for CRUD").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 286;BA.debugLine="sb.Append(\"'CREATE\").Append(CRLF)";
_sb.Append("'CREATE").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 287;BA.debugLine="sb.Append(\"Sub btninsert_click\").Append(CRLF)";
_sb.Append("Sub btninsert_click").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 288;BA.debugLine="sb.Append(\"'lets validate the form\").Append(CRLF)";
_sb.Append("'lets validate the form").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 289;BA.debugLine="sb.append($\"Dim bValid As Boolean = pg.Validate(\"";
_sb.Append(("Dim bValid As Boolean = pg.Validate(\"form\")")).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 290;BA.debugLine="sb.append(\"if bValid = False Then Return\").Append";
_sb.Append("if bValid = False Then Return").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 291;BA.debugLine="sb.Append(\"'insert record to table\").Append(CRLF)";
_sb.Append("'insert record to table").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 292;BA.debugLine="sb.Append(\"Dim alaSQL As BANanoAlaSQL\").append(CR";
_sb.Append("Dim alaSQL As BANanoAlaSQL").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 293;BA.debugLine="sb.Append(\"'initialize the helper class\").Append(";
_sb.Append("'initialize the helper class").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 294;BA.debugLine="sb.append(\"alaSQL.Initialize\").append(CRLF)";
_sb.Append("alaSQL.Initialize").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 295;BA.debugLine="sb.Append(\"'Get values from the form\").Append(CRL";
_sb.Append("'Get values from the form").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 296;BA.debugLine="sb.append($\"Dim rec As Map = pg.GetValues(\"form\")";
_sb.Append(("Dim rec As Map = pg.GetValues(\"form\")")).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 297;BA.debugLine="sb.Append(\"'save record to the database\").Append(";
_sb.Append("'save record to the database").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 298;BA.debugLine="sb.Append($\"Dim rs As AlaSQLResultSet = alaSQL.In";
_sb.Append(("Dim rs As AlaSQLResultSet = alaSQL.Insert(\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tblname))+"\", rec)")).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 299;BA.debugLine="sb.append($\"rs.Result = db.ExecuteWait(rs.query,";
_sb.Append(("rs.Result = db.ExecuteWait(rs.query, rs.args)")).Append(anywheresoftware.b4a.keywords.Common.CRLF).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 300;BA.debugLine="sb.Append(\"End Sub\").Append(CRLF).Append(CRLF)";
_sb.Append("End Sub").Append(anywheresoftware.b4a.keywords.Common.CRLF).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 302;BA.debugLine="sb.Append(\"'READ\").Append(CRLF)";
_sb.Append("'READ").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 303;BA.debugLine="sb.Append(\"Sub btnread_click\").append(CRLF)";
_sb.Append("Sub btnread_click").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 304;BA.debugLine="sb.Append(\"'get the content of the primary key fi";
_sb.Append("'get the content of the primary key field").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 305;BA.debugLine="sb.append($\"Dim priValue As String = pg.GetValue(";
_sb.Append(("Dim priValue As String = pg.GetValue(\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_prikey))+"\")")).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 306;BA.debugLine="sb.Append(\"'read record from table\").append(CRLF)";
_sb.Append("'read record from table").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 307;BA.debugLine="sb.Append(\"Dim alaSQL As BANanoAlaSQL\").append(CR";
_sb.Append("Dim alaSQL As BANanoAlaSQL").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 308;BA.debugLine="sb.Append(\"'initialize the helper class\").Append(";
_sb.Append("'initialize the helper class").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 309;BA.debugLine="sb.append(\"alaSQL.Initialize\").append(CRLF)";
_sb.Append("alaSQL.Initialize").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 310;BA.debugLine="sb.Append(\"'generate the select where statement\")";
_sb.Append("'generate the select where statement").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 311;BA.debugLine="sb.Append($\"Dim rs As AlaSQLResultSet = alaSQL.Re";
_sb.Append(("Dim rs As AlaSQLResultSet = alaSQL.Read(\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tblname))+"\", \""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_prikey))+"\", priValue)")).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 312;BA.debugLine="sb.append($\"rs.result = db.ExecuteWait(rs.query,";
_sb.Append(("rs.result = db.ExecuteWait(rs.query, rs.args)")).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 313;BA.debugLine="sb.Append(\"'the record was found, set the values";
_sb.Append("'the record was found, set the values to the form").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 314;BA.debugLine="sb.Append(\"If rs.result.size > 0 then\").Append(CR";
_sb.Append("If rs.result.size > 0 then").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 315;BA.debugLine="sb.Append(\"Dim rec As Map = rs.result.Get(0)\").Ap";
_sb.Append("Dim rec As Map = rs.result.Get(0)").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 316;BA.debugLine="sb.Append(\"'set returned map to form\").append(CRL";
_sb.Append("'set returned map to form").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 317;BA.debugLine="sb.Append($\"pg.SetValues(\"form\", rec)\"$).Append(C";
_sb.Append(("pg.SetValues(\"form\", rec)")).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 318;BA.debugLine="sb.Append(\"End If\").Append(CRLF)";
_sb.Append("End If").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 319;BA.debugLine="sb.append(\"End Sub\").Append(CRLF)";
_sb.Append("End Sub").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 321;BA.debugLine="sb.Append(\"'NEW\").Append(CRLF)";
_sb.Append("'NEW").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 322;BA.debugLine="sb.Append(\"Sub btnnew_click\").Append(CRLF)";
_sb.Append("Sub btnnew_click").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 323;BA.debugLine="sb.Append(\"'clear the contents of the form\").Appe";
_sb.Append("'clear the contents of the form").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 324;BA.debugLine="sb.append($\"pg.Clear(\"form\")\"$).Append(CRLF)";
_sb.Append(("pg.Clear(\"form\")")).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 325;BA.debugLine="sb.Append(\"End Sub\").Append(CRLF).append(CRLF)";
_sb.Append("End Sub").Append(anywheresoftware.b4a.keywords.Common.CRLF).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 326;BA.debugLine="Return sb.tostring";
if (true) return _sb.ToString();
 //BA.debugLineNum = 327;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.Map  _createview(anywheresoftware.b4a.objects.collections.Map _properties) throws Exception{
String _v = "";
String _i = "";
b4j.example.wixelement _view = null;
String _optionsid = "";
String _optionstext = "";
anywheresoftware.b4a.objects.collections.List _options = null;
String[] _ids = null;
String[] _texts = null;
int _idlen = 0;
int _txtlen = 0;
int _x = 0;
String _idx = "";
String _txtx = "";
String _pkey = "";
String _pval = "";
String _cval = "";
 //BA.debugLineNum = 606;BA.debugLine="Sub CreateView(properties As Map) As Map";
 //BA.debugLineNum = 608;BA.debugLine="Dim v As String = properties.Get(\"view\")";
_v = BA.ObjectToString(_properties.Get((Object)("view")));
 //BA.debugLineNum = 609;BA.debugLine="Dim i As String = properties.Get(\"id\")";
_i = BA.ObjectToString(_properties.Get((Object)("id")));
 //BA.debugLineNum = 611;BA.debugLine="Dim view As WixElement";
_view = new b4j.example.wixelement();
 //BA.debugLineNum = 612;BA.debugLine="view.Initialize(i)";
_view._initialize /*b4j.example.wixelement*/ (ba,_i);
 //BA.debugLineNum = 614;BA.debugLine="Dim optionsid As String";
_optionsid = "";
 //BA.debugLineNum = 615;BA.debugLine="Dim optionstext As String";
_optionstext = "";
 //BA.debugLineNum = 616;BA.debugLine="Dim options As List";
_options = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 617;BA.debugLine="options.Initialize";
_options.Initialize();
 //BA.debugLineNum = 618;BA.debugLine="Dim ids() As String";
_ids = new String[(int) (0)];
java.util.Arrays.fill(_ids,"");
 //BA.debugLineNum = 619;BA.debugLine="Dim texts() As String";
_texts = new String[(int) (0)];
java.util.Arrays.fill(_texts,"");
 //BA.debugLineNum = 620;BA.debugLine="Dim idLen As Int";
_idlen = 0;
 //BA.debugLineNum = 621;BA.debugLine="Dim txtLen As Int";
_txtlen = 0;
 //BA.debugLineNum = 623;BA.debugLine="Select Case v";
switch (BA.switchObjectToInt(_v,"combo","richselect","radio","select","segmented","tabbar","dbllist","suggest")) {
case 0: 
case 1: 
case 2: 
case 3: 
case 4: 
case 5: 
case 6: 
case 7: {
 //BA.debugLineNum = 625;BA.debugLine="optionsid = properties.Get(\"optionsid\")";
_optionsid = BA.ObjectToString(_properties.Get((Object)("optionsid")));
 //BA.debugLineNum = 626;BA.debugLine="optionstext = properties.Get(\"optionstext\")";
_optionstext = BA.ObjectToString(_properties.Get((Object)("optionstext")));
 //BA.debugLineNum = 628;BA.debugLine="ids = BANano.Split(\",\",optionsid)";
_ids = _banano.Split(",",_optionsid);
 //BA.debugLineNum = 629;BA.debugLine="texts = BANano.Split(\",\", optionstext)";
_texts = _banano.Split(",",_optionstext);
 //BA.debugLineNum = 630;BA.debugLine="idLen = ids.Length";
_idlen = _ids.length;
 //BA.debugLineNum = 631;BA.debugLine="txtLen = texts.Length";
_txtlen = _texts.length;
 //BA.debugLineNum = 632;BA.debugLine="If idLen <> txtLen Then";
if (_idlen!=_txtlen) { 
 //BA.debugLineNum = 633;BA.debugLine="pg.Message_Error(i & \" options do not tally!\")";
_pg._message_error /*String*/ (_i+" options do not tally!");
 //BA.debugLineNum = 634;BA.debugLine="Return view.Item";
if (true) return _view._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 };
 //BA.debugLineNum = 636;BA.debugLine="Dim x As Int";
_x = 0;
 //BA.debugLineNum = 637;BA.debugLine="For x = 0 To idLen - 1";
{
final int step26 = 1;
final int limit26 = (int) (_idlen-1);
_x = (int) (0) ;
for (;_x <= limit26 ;_x = _x + step26 ) {
 //BA.debugLineNum = 638;BA.debugLine="Dim idx As String = ids(x)";
_idx = _ids[_x];
 //BA.debugLineNum = 639;BA.debugLine="Dim txtx As String = texts(x)";
_txtx = _texts[_x];
 //BA.debugLineNum = 640;BA.debugLine="options.Add(CreateMap(\"id\":idx, \"value\":txtx))";
_options.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(_idx),(Object)("value"),(Object)(_txtx)}).getObject()));
 }
};
 //BA.debugLineNum = 642;BA.debugLine="properties.remove(\"optionsid\")";
_properties.Remove((Object)("optionsid"));
 //BA.debugLineNum = 643;BA.debugLine="properties.remove(\"optionstext\")";
_properties.Remove((Object)("optionstext"));
 //BA.debugLineNum = 644;BA.debugLine="Select Case v";
switch (BA.switchObjectToInt(_v,"dbllist","suggest")) {
case 0: 
case 1: {
 //BA.debugLineNum = 646;BA.debugLine="properties.Put(\"data\", options)";
_properties.Put((Object)("data"),(Object)(_options.getObject()));
 break; }
default: {
 //BA.debugLineNum = 648;BA.debugLine="properties.Put(\"options\", options)";
_properties.Put((Object)("options"),(Object)(_options.getObject()));
 break; }
}
;
 break; }
}
;
 //BA.debugLineNum = 653;BA.debugLine="For Each pkey As String In properties.keys";
{
final anywheresoftware.b4a.BA.IterableList group40 = _properties.Keys();
final int groupLen40 = group40.getSize()
;int index40 = 0;
;
for (; index40 < groupLen40;index40++){
_pkey = BA.ObjectToString(group40.Get(index40));
 //BA.debugLineNum = 654;BA.debugLine="Dim pval As String = properties.Get(pkey)";
_pval = BA.ObjectToString(_properties.Get((Object)(_pkey)));
 //BA.debugLineNum = 655;BA.debugLine="Dim cval As String = pg.CStr(pval)";
_cval = _pg._cstr /*String*/ ((Object)(_pval));
 //BA.debugLineNum = 656;BA.debugLine="If cval <> \"\" Then";
if ((_cval).equals("") == false) { 
 //BA.debugLineNum = 657;BA.debugLine="If pkey = \"view\" And cval.tolowercase = \"row\" T";
if ((_pkey).equals("view") && (_cval.toLowerCase()).equals("row")) { 
if (true) continue;};
 //BA.debugLineNum = 658;BA.debugLine="If pkey = \"view\" And cval.tolowercase = \"column";
if ((_pkey).equals("view") && (_cval.toLowerCase()).equals("column")) { 
if (true) continue;};
 //BA.debugLineNum = 659;BA.debugLine="If pkey = \"addingmethod\" Then Continue";
if ((_pkey).equals("addingmethod")) { 
if (true) continue;};
 //BA.debugLineNum = 660;BA.debugLine="If pkey = \"style.color\" Then";
if ((_pkey).equals("style.color")) { 
 //BA.debugLineNum = 661;BA.debugLine="view.SetStyle(\"color\", cval)";
_view._setstyle /*b4j.example.wixelement*/ ("color",_cval);
 //BA.debugLineNum = 662;BA.debugLine="Continue";
if (true) continue;
 };
 //BA.debugLineNum = 664;BA.debugLine="If pkey = \"style.background\" Then";
if ((_pkey).equals("style.background")) { 
 //BA.debugLineNum = 665;BA.debugLine="view.SetStyle(\"background\", cval)";
_view._setstyle /*b4j.example.wixelement*/ ("background",_cval);
 //BA.debugLineNum = 666;BA.debugLine="Continue";
if (true) continue;
 };
 //BA.debugLineNum = 668;BA.debugLine="view.SetAttr(pkey, pval)";
_view._setattr /*b4j.example.wixelement*/ (_pkey,(Object)(_pval));
 };
 }
};
 //BA.debugLineNum = 672;BA.debugLine="Select Case v.ToLowerCase";
switch (BA.switchObjectToInt(_v.toLowerCase(),"row","column")) {
case 0: 
case 1: {
 break; }
default: {
 //BA.debugLineNum = 675;BA.debugLine="view.SetAttr(\"view\", v.ToLowerCase)";
_view._setattr /*b4j.example.wixelement*/ ("view",(Object)(_v.toLowerCase()));
 break; }
}
;
 //BA.debugLineNum = 677;BA.debugLine="view.SetAttr(\"container\", \"previewit\")";
_view._setattr /*b4j.example.wixelement*/ ("container",(Object)("previewit"));
 //BA.debugLineNum = 678;BA.debugLine="Return view.Item";
if (true) return _view._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 679;BA.debugLine="End Sub";
return null;
}
public static com.ab.banano.BANanoObject  _createwindow() throws Exception{
b4j.example.wixwindow _win = null;
b4j.example.wixform _frmx = null;
b4j.example.wixtextarea _txtarea = null;
b4j.example.wixbutton _btnsave = null;
 //BA.debugLineNum = 1186;BA.debugLine="Sub CreateWindow As BANanoObject";
 //BA.debugLineNum = 1187;BA.debugLine="Dim win As WixWindow";
_win = new b4j.example.wixwindow();
 //BA.debugLineNum = 1188;BA.debugLine="win.Initialize(\"myWindow\").SetWidth(700).SetHeigh";
_win._initialize /*b4j.example.wixwindow*/ (ba,"myWindow")._setwidth /*b4j.example.wixwindow*/ ((Object)(700))._setheight /*b4j.example.wixwindow*/ ((Object)(400))._setmove /*b4j.example.wixwindow*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1189;BA.debugLine="win.SetPositionCenter(\"\")";
_win._setpositioncenter /*b4j.example.wixwindow*/ (BA.ObjectToBoolean(""));
 //BA.debugLineNum = 1190;BA.debugLine="win.SetModal(True)";
_win._setmodal /*b4j.example.wixwindow*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1191;BA.debugLine="win.ToolBar.SetPadding(10)";
_win._toolbar /*b4j.example.wixtoolbar*/ ._setpadding /*b4j.example.wixtoolbar*/ (BA.NumberToString(10));
 //BA.debugLineNum = 1192;BA.debugLine="win.ToolBar.CreateLabel(\"lbl\").SetLabel(\"Add Mult";
_win._toolbar /*b4j.example.wixtoolbar*/ ._createlabel /*b4j.example.wixlabel*/ ("lbl")._setlabel /*b4j.example.wixlabel*/ ("Add Multiple Controls")._pop /*String*/ ();
 //BA.debugLineNum = 1193;BA.debugLine="win.ToolBar.CreateIcon(\"icnclose\").SetIcon(\"mdi m";
_win._toolbar /*b4j.example.wixtoolbar*/ ._createicon /*b4j.example.wixicon*/ ("icnclose")._seticon /*b4j.example.wixicon*/ ((Object)("mdi mdi-close"))._setclick /*b4j.example.wixicon*/ ((com.ab.banano.BANanoObject)(_banano.CallBack(pgformdesigner.getObject(),"closeWin",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)))))._pop /*String*/ ();
 //BA.debugLineNum = 1195;BA.debugLine="win.SetToolBar(True)";
_win._settoolbar /*b4j.example.wixwindow*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1197;BA.debugLine="Dim frmx As WixForm";
_frmx = new b4j.example.wixform();
 //BA.debugLineNum = 1198;BA.debugLine="frmx.Initialize(\"frmx\").SetBorderless(True)";
_frmx._initialize /*b4j.example.wixform*/ (ba,"frmx")._setborderless /*b4j.example.wixform*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1200;BA.debugLine="Dim txtArea As WixTextArea";
_txtarea = new b4j.example.wixtextarea();
 //BA.debugLineNum = 1201;BA.debugLine="txtArea.Initialize(\"txtmultiplecontrols\").SetLabe";
_txtarea._initialize /*b4j.example.wixtextarea*/ (ba,"txtmultiplecontrols")._setlabel /*b4j.example.wixtextarea*/ ("Enter the names of the multiple controls separated by a comma.");
 //BA.debugLineNum = 1202;BA.debugLine="txtArea.SetLabelPosition(\"top\").SetInvalidMessage";
_txtarea._setlabelposition /*b4j.example.wixtextarea*/ ("top")._setinvalidmessage /*b4j.example.wixtextarea*/ ("No elements have been entered!");
 //BA.debugLineNum = 1203;BA.debugLine="txtArea.SetRequired(True).SetValidateIsNotEmpty(T";
_txtarea._setrequired /*b4j.example.wixtextarea*/ (anywheresoftware.b4a.keywords.Common.True)._setvalidateisnotempty /*b4j.example.wixtextarea*/ (anywheresoftware.b4a.keywords.Common.True)._setvalidateeventblur /*b4j.example.wixtextarea*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1204;BA.debugLine="frmx.AddRows(txtArea.Item)";
_frmx._addrows /*String*/ (_txtarea._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 1206;BA.debugLine="Dim btnSave As WixButton";
_btnsave = new b4j.example.wixbutton();
 //BA.debugLineNum = 1207;BA.debugLine="btnSave.Initialize(\"btnMulti\").SetLabel(\"Apply\").";
_btnsave._initialize /*b4j.example.wixbutton*/ (ba,"btnMulti")._setlabel /*b4j.example.wixbutton*/ ("Apply")._setclick /*b4j.example.wixbutton*/ ((com.ab.banano.BANanoObject)(_banano.CallBack(pgformdesigner.getObject(),"addmulti_elementswait",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)))));
 //BA.debugLineNum = 1208;BA.debugLine="btnSave.SetBadge(\"0\")";
_btnsave._setbadge /*b4j.example.wixbutton*/ ((Object)("0"));
 //BA.debugLineNum = 1209;BA.debugLine="frmx.AddRows(btnSave.Item)";
_frmx._addrows /*String*/ (_btnsave._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 1211;BA.debugLine="win.setbody(frmx.Item)";
_win._setbody /*b4j.example.wixwindow*/ (_frmx._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 1213;BA.debugLine="winux = pg.AddWindow(win)";
_winux = _pg._addwindow /*com.ab.banano.BANanoObject*/ (_win);
 //BA.debugLineNum = 1215;BA.debugLine="pg.OnKeyPress(\"txtmultiplecontrols\", BANano.callb";
_pg._onkeypress /*String*/ ("txtmultiplecontrols",(com.ab.banano.BANanoObject)(_banano.CallBack(pgformdesigner.getObject(),"multichange",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)))));
 //BA.debugLineNum = 1216;BA.debugLine="Return winux";
if (true) return _winux;
 //BA.debugLineNum = 1217;BA.debugLine="End Sub";
return null;
}
public static String  _dbhelp() throws Exception{
b4j.example.wixhint _dbhint = null;
 //BA.debugLineNum = 906;BA.debugLine="Sub dbhelp";
 //BA.debugLineNum = 907;BA.debugLine="Dim dbhint As WixHint";
_dbhint = new b4j.example.wixhint();
 //BA.debugLineNum = 908;BA.debugLine="dbhint.Initialize(\"dbhint\")";
_dbhint._initialize /*b4j.example.wixhint*/ (ba,"dbhint");
 //BA.debugLineNum = 909;BA.debugLine="dbhint.AddStep(\"tree\",\"Database\",\"To store data f";
_dbhint._addstep /*b4j.example.wixhint*/ ("tree","Database","To store data for our forms, we can create a database and tables. Click Database on the tree to do so.","enter");
 //BA.debugLineNum = 910;BA.debugLine="dbhint.AddStep(\"propform\", \"Connection\", \"Specify";
_dbhint._addstep /*b4j.example.wixhint*/ ("propform","Connection","Specify the database name and select with backend to use either BANanoSQL, BANanoSQLite or BANanoMySQL. Each has different connection options.","enter");
 //BA.debugLineNum = 911;BA.debugLine="dbhint.AddStep(\"formholder\", \"Settings\", \"You wil";
_dbhint._addstep /*b4j.example.wixhint*/ ("formholder","Settings","You will be provided with steps to follow to set up your connection here for each back end type.","enter");
 //BA.debugLineNum = 912;BA.debugLine="dbhint.AddStep(\"tree\", \"Tables\", \"The next step i";
_dbhint._addstep /*b4j.example.wixhint*/ ("tree","Tables","The next step is to add tables to the database, select Database from the tree.","enter");
 //BA.debugLineNum = 913;BA.debugLine="dbhint.AddStep(\"propadd\", \"Add Table\", \"Click her";
_dbhint._addstep /*b4j.example.wixhint*/ ("propadd","Add Table","Click here to add a new table and provide its name.","enter");
 //BA.debugLineNum = 914;BA.debugLine="dbhint.AddStep(\"propsave\", \"Save Table\", \"Once yo";
_dbhint._addstep /*b4j.example.wixhint*/ ("propsave","Save Table","Once you have provided the table details, click on save to store the database, now you are ready to add fields to the table.","enter");
 //BA.debugLineNum = 915;BA.debugLine="dbhint.AddStep(\"propdelete\", \"Delete Table\", \"Sho";
_dbhint._addstep /*b4j.example.wixhint*/ ("propdelete","Delete Table","Should you wish to delete a table, you can select the trash here after selecting the table on the tree.","enter");
 //BA.debugLineNum = 916;BA.debugLine="dbhint.AddStep(\"tree\", \"Saved Table\", \"You have s";
_dbhint._addstep /*b4j.example.wixhint*/ ("tree","Saved Table","You have saved the table and now it is listed in the tree, to add fields to it, select the table on the tree.","enter");
 //BA.debugLineNum = 917;BA.debugLine="dbhint.AddStep(\"propadd\", \"Add Field\", \"Click her";
_dbhint._addstep /*b4j.example.wixhint*/ ("propadd","Add Field","Click here to add a new field and provide its name and type.","enter");
 //BA.debugLineNum = 918;BA.debugLine="dbhint.AddStep(\"propsave\", \"Save Field\", \"Once yo";
_dbhint._addstep /*b4j.example.wixhint*/ ("propsave","Save Field","Once you have provided the field details, click on save to store to the database.","enter");
 //BA.debugLineNum = 919;BA.debugLine="dbhint.AddStep(\"propdelete\", \"Delete Field\", \"Sho";
_dbhint._addstep /*b4j.example.wixhint*/ ("propdelete","Delete Field","Should you wish to delete a field, select it on the tree and select the trash here.","enter");
 //BA.debugLineNum = 920;BA.debugLine="dbhint.AddStep(\"tree\", \"Saved Fields\", \"All the f";
_dbhint._addstep /*b4j.example.wixhint*/ ("tree","Saved Fields","All the fields you have created will now be listed on the tree.","enter");
 //BA.debugLineNum = 922;BA.debugLine="pg.StartHint(dbhint)";
_pg._starthint /*String*/ (_dbhint);
 //BA.debugLineNum = 924;BA.debugLine="End Sub";
return "";
}
public static String  _deletepropwait(boolean _confirmresult) throws Exception{
anywheresoftware.b4a.objects.collections.Map _rp = null;
String _value = "";
String _tablename = "";
String _key = "";
 //BA.debugLineNum = 559;BA.debugLine="Sub deletepropwait(confirmresult As Boolean)";
 //BA.debugLineNum = 560;BA.debugLine="If confirmresult = False Then Return";
if (_confirmresult==anywheresoftware.b4a.keywords.Common.False) { 
if (true) return "";};
 //BA.debugLineNum = 561;BA.debugLine="Dim rp As Map = pg.GetValues(\"propbag\")";
_rp = new anywheresoftware.b4a.objects.collections.Map();
_rp = _pg._getvalues /*anywheresoftware.b4a.objects.collections.Map*/ ("propbag");
 //BA.debugLineNum = 562;BA.debugLine="delID = rp.Get(\"id\")";
_delid = BA.ObjectToString(_rp.Get((Object)("id")));
 //BA.debugLineNum = 563;BA.debugLine="Dim value As String = rp.GetDefault(\"value\", \"\")";
_value = BA.ObjectToString(_rp.GetDefault((Object)("value"),(Object)("")));
 //BA.debugLineNum = 564;BA.debugLine="Dim tablename As String = rp.GetDefault(\"tablenam";
_tablename = BA.ObjectToString(_rp.GetDefault((Object)("tablename"),(Object)("")));
 //BA.debugLineNum = 565;BA.debugLine="Dim key As String = $\"table.${value}\"$";
_key = ("table."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_value))+"");
 //BA.debugLineNum = 566;BA.debugLine="Select Case delID";
switch (BA.switchObjectToInt(_delid,"field","table")) {
case 0: {
 //BA.debugLineNum = 568;BA.debugLine="key = $\"field.${tablename}.${value}\"$";
_key = ("field."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tablename))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_value))+"");
 //BA.debugLineNum = 569;BA.debugLine="sqlite.initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 570;BA.debugLine="sqlite.AddStrings(Array(\"key\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("key")}));
 //BA.debugLineNum = 571;BA.debugLine="qry = sqlite.DeleteWhere(\"fields\",CreateMap(\"key";
_qry = _sqlite._deletewhere /*String*/ ("fields",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("key"),(Object)(_key)}));
 //BA.debugLineNum = 572;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\", C";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 573;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 574;BA.debugLine="pg.Message_Success(rs.result.size & \" record(s)";
_pg._message_success /*String*/ (BA.NumberToString(_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" record(s) affected!");
 //BA.debugLineNum = 575;BA.debugLine="refreshapp";
_refreshapp();
 break; }
case 1: {
 //BA.debugLineNum = 578;BA.debugLine="sqlite.initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 579;BA.debugLine="sqlite.AddStrings(Array(\"id\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 580;BA.debugLine="qry = sqlite.DeleteWhere(\"tables\",CreateMap(\"key";
_qry = _sqlite._deletewhere /*String*/ ("tables",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("key"),(Object)(_key)}));
 //BA.debugLineNum = 581;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\", C";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 582;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 584;BA.debugLine="sqlite.Initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 585;BA.debugLine="sqlite.AddStrings(Array(\"tablename\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("tablename")}));
 //BA.debugLineNum = 586;BA.debugLine="qry = sqlite.DeleteWhere(\"fields\",CreateMap(\"tab";
_qry = _sqlite._deletewhere /*String*/ ("fields",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("tablename"),(Object)(_value)}));
 //BA.debugLineNum = 587;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\", C";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 588;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 589;BA.debugLine="pg.Message_Success(rs.result.size & \" record(s)";
_pg._message_success /*String*/ (BA.NumberToString(_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" record(s) affected!");
 //BA.debugLineNum = 590;BA.debugLine="refreshapp";
_refreshapp();
 break; }
default: {
 //BA.debugLineNum = 592;BA.debugLine="sqlite.initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 593;BA.debugLine="sqlite.AddStrings(Array(\"id\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 594;BA.debugLine="qry = sqlite.DeleteWhere(\"items\",CreateMap(\"id\":";
_qry = _sqlite._deletewhere /*String*/ ("items",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(_delid)}));
 //BA.debugLineNum = 595;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\", C";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 596;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 597;BA.debugLine="pg.Message_Success(rs.result.size & \" record(s)";
_pg._message_success /*String*/ (BA.NumberToString(_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" record(s) affected!");
 //BA.debugLineNum = 598;BA.debugLine="refreshapp";
_refreshapp();
 break; }
}
;
 //BA.debugLineNum = 600;BA.debugLine="propBag.Clear";
_propbag._clear /*String*/ ();
 //BA.debugLineNum = 601;BA.debugLine="propBag.Refresh(pg)";
_propbag._refresh /*String*/ (_pg);
 //BA.debugLineNum = 602;BA.debugLine="End Sub";
return "";
}
public static boolean  _drawpropbag(String _con) throws Exception{
 //BA.debugLineNum = 1090;BA.debugLine="Sub DrawPropBag(con As String) As Boolean";
 //BA.debugLineNum = 1091;BA.debugLine="Select Case con";
switch (BA.switchObjectToInt(_con,"connection","form","row","column","button","checkbox","colorpicker","combo","counter","datepicker","icon","label","radio","richselect","search","select","segmented","slider","switch","tabbar","text","textarea","toggle","uploader","dbllist","fieldset","suggest","forminput","pager")) {
case 0: {
 //BA.debugLineNum = 1093;BA.debugLine="dConnection.BuildBag(pg, propBag)";
_dconnection._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 1094;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
case 1: {
 //BA.debugLineNum = 1096;BA.debugLine="dForm.BuildBag(pg, propBag)";
_dform._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 1097;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
case 2: {
 //BA.debugLineNum = 1099;BA.debugLine="dRow.BuildBag(pg, propBag)";
_drow._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 1100;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
case 3: {
 //BA.debugLineNum = 1102;BA.debugLine="dColumn.BuildBag(pg, propBag)";
_dcolumn._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 1103;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
case 4: {
 //BA.debugLineNum = 1105;BA.debugLine="dButton.BuildBag(pg, propBag)";
_dbutton._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 1106;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
case 5: {
 //BA.debugLineNum = 1108;BA.debugLine="dCheckBox.BuildBag(pg, propBag)";
_dcheckbox._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 1109;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
case 6: {
 //BA.debugLineNum = 1111;BA.debugLine="dColorPicker.BuildBag(pg, propBag)";
_dcolorpicker._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 1112;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
case 7: {
 //BA.debugLineNum = 1114;BA.debugLine="dCombo.BuildBag(pg, propBag)";
_dcombo._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 1115;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
case 8: {
 //BA.debugLineNum = 1117;BA.debugLine="dCounter.BuildBag(pg, propBag)";
_dcounter._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 1118;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
case 9: {
 //BA.debugLineNum = 1120;BA.debugLine="dDatePicker.BuildBag(pg, propBag)";
_ddatepicker._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 1121;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
case 10: {
 //BA.debugLineNum = 1123;BA.debugLine="dIcon.BuildBag(pg, propBag)";
_dicon._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 1124;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
case 11: {
 //BA.debugLineNum = 1126;BA.debugLine="dLabel.BuildBag(pg, propBag)";
_dlabel._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 1127;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
case 12: {
 //BA.debugLineNum = 1129;BA.debugLine="dRadio.BuildBag(pg, propBag)";
_dradio._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 1130;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
case 13: {
 //BA.debugLineNum = 1132;BA.debugLine="dRichSelect.BuildBag(pg, propBag)";
_drichselect._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 1133;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
case 14: {
 //BA.debugLineNum = 1135;BA.debugLine="dSearch.BuildBag(pg, propBag)";
_dsearch._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 1136;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
case 15: {
 //BA.debugLineNum = 1138;BA.debugLine="dSelect.BuildBag(pg, propBag)";
_dselect._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 1139;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
case 16: {
 //BA.debugLineNum = 1141;BA.debugLine="dSegmented.BuildBag(pg, propBag)";
_dsegmented._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 1142;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
case 17: {
 //BA.debugLineNum = 1144;BA.debugLine="dSlider.BuildBag(pg, propBag)";
_dslider._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 1145;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
case 18: {
 //BA.debugLineNum = 1147;BA.debugLine="dSwitch.BuildBag(pg, propBag)";
_dswitch._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 1148;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
case 19: {
 //BA.debugLineNum = 1150;BA.debugLine="dTabBar.BuildBag(pg, propBag)";
_dtabbar._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 1151;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
case 20: {
 //BA.debugLineNum = 1153;BA.debugLine="dText.BuildBag(pg, propBag)";
_dtext._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 1154;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
case 21: {
 //BA.debugLineNum = 1156;BA.debugLine="dTextArea.BuildBag(pg, propBag)";
_dtextarea._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 1157;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
case 22: {
 //BA.debugLineNum = 1159;BA.debugLine="dToggle.BuildBag(pg, propBag)";
_dtoggle._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 1160;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
case 23: {
 //BA.debugLineNum = 1162;BA.debugLine="dUploader.BuildBag(pg, propBag)";
_duploader._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 1163;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
case 24: {
 //BA.debugLineNum = 1165;BA.debugLine="dDBLList.BuildBag(pg, propBag)";
_ddbllist._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 1166;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
case 25: {
 //BA.debugLineNum = 1168;BA.debugLine="dFieldSet.BuildBag(pg, propBag)";
_dfieldset._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 1169;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
case 26: {
 //BA.debugLineNum = 1171;BA.debugLine="dSuggest.BuildBag(pg, propBag)";
_dsuggest._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 1172;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
case 27: {
 break; }
case 28: {
 //BA.debugLineNum = 1175;BA.debugLine="dPager.BuildBag(pg, propBag)";
_dpager._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 1176;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
}
;
 //BA.debugLineNum = 1178;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 1179;BA.debugLine="End Sub";
return false;
}
public static String  _init() throws Exception{
b4j.example.wixtoolbar _tblbar = null;
b4j.example.wixsidebar _sm = null;
b4j.example.wixrow _r2 = null;
b4j.example.wixtree _tree = null;
b4j.example.wixform _frm = null;
b4j.example.wixrow _formholder = null;
anywheresoftware.b4a.objects.collections.Map _meid = null;
String _recid = "";
 //BA.debugLineNum = 22;BA.debugLine="Sub Init()";
 //BA.debugLineNum = 23;BA.debugLine="addingmethod.Initialize";
_addingmethod.Initialize();
 //BA.debugLineNum = 24;BA.debugLine="addingmethod.AddAll(Array(\"\",\"AddRows\",\"AddColumn";
_addingmethod.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(""),(Object)("AddRows"),(Object)("AddColumns"),(Object)("AddElements"),(Object)("AddCols"),(Object)("AddCells")}));
 //BA.debugLineNum = 26;BA.debugLine="dbName = Main.dbname";
_dbname = _main._dbname /*String*/ ;
 //BA.debugLineNum = 27;BA.debugLine="hints.Initialize(\"hints\")";
_hints._initialize /*b4j.example.wixhint*/ (ba,"hints");
 //BA.debugLineNum = 29;BA.debugLine="pg.Initialize(\"wp\", \"body\").SetTypeSpace(\"\").SetR";
_pg._initialize /*b4j.example.wixpage*/ (ba,"wp","body")._settypespace /*b4j.example.wixpage*/ ("")._setresponsive /*b4j.example.wixpage*/ ((Object)(anywheresoftware.b4a.keywords.Common.True))._setappname /*b4j.example.wixpage*/ (_main._appname /*String*/ );
 //BA.debugLineNum = 48;BA.debugLine="Dim tblBar As WixToolBar = modToolBar.getToolBar";
_tblbar = _modtoolbar._gettoolbar /*b4j.example.wixtoolbar*/ ();
 //BA.debugLineNum = 49;BA.debugLine="pg.AddToolBar(tblBar)";
_pg._addtoolbar /*String*/ (_tblbar);
 //BA.debugLineNum = 50;BA.debugLine="hints.AddStep(\"heading\",\"Welcome\",\"Welcome to the";
_hints._addstep /*b4j.example.wixhint*/ ("heading","Welcome","Welcome to the BANanoWebix - Form Designer","click");
 //BA.debugLineNum = 51;BA.debugLine="hints.AddStep(\"menuopen\",\"Side Bar\",\"You can togg";
_hints._addstep /*b4j.example.wixhint*/ ("menuopen","Side Bar","You can toggle the side bar menu to access elements that you can design","click");
 //BA.debugLineNum = 52;BA.debugLine="hints.AddStep(\"smp\",\"Side Bar\", \"This lists all e";
_hints._addstep /*b4j.example.wixhint*/ ("smp","Side Bar","This lists all elements that you can design with the BANanoWebix-FD. First you need to create a form. To create a form, select Layouts and select Form, this will add the form properties on the bag.","click");
 //BA.debugLineNum = 53;BA.debugLine="hints.AddStep(\"propform\",\"Property\", \"The form de";
_hints._addstep /*b4j.example.wixhint*/ ("propform","Property","The form details will appear here, update the settings you need for the form","click");
 //BA.debugLineNum = 54;BA.debugLine="hints.AddStep(\"propsave\",\"Save Form/Element\", \"Af";
_hints._addstep /*b4j.example.wixhint*/ ("propsave","Save Form/Element","After you have updated the properties of the design element you are working with, select Save here to save the element's properties for later updating.","click");
 //BA.debugLineNum = 55;BA.debugLine="hints.AddStep(\"propdelete\",\"Delete Design\", \"You";
_hints._addstep /*b4j.example.wixhint*/ ("propdelete","Delete Design","You can delete a saved design element by selecting this option. You are unable to undo changes if you delete","click");
 //BA.debugLineNum = 56;BA.debugLine="hints.AddStep(\"tree\",\"Tree\", \"After you save your";
_hints._addstep /*b4j.example.wixhint*/ ("tree","Tree","After you save your element in the property bag, it will be listed under the parent element you chose for it here and you can select and update its properties again if you want.","click");
 //BA.debugLineNum = 57;BA.debugLine="hints.AddStep(\"formholder\",\"Preview & Source Code";
_hints._addstep /*b4j.example.wixhint*/ ("formholder","Preview & Source Code","The result of your design element during design will be shown here & the source code to use in your BANanoWebix project","click");
 //BA.debugLineNum = 59;BA.debugLine="hints.AddStep(\"multi\", \"Multi Elements\", \"Select";
_hints._addstep /*b4j.example.wixhint*/ ("multi","Multi Elements","Select here to add multi elements, you provide the names of the elements separated by a comma","click");
 //BA.debugLineNum = 60;BA.debugLine="hints.AddStep(\"refresh\",\"Refresh\",\"To refresh the";
_hints._addstep /*b4j.example.wixhint*/ ("refresh","Refresh","To refresh the tree, select this option","click");
 //BA.debugLineNum = 61;BA.debugLine="hints.AddStep(\"clearform\",\"Clear Form\", \"To creat";
_hints._addstep /*b4j.example.wixhint*/ ("clearform","Clear Form","To create a new form, first clear any existing form by selecting this option","click");
 //BA.debugLineNum = 62;BA.debugLine="hints.AddStep(\"help\",\"Hints\", \"You can access the";
_hints._addstep /*b4j.example.wixhint*/ ("help","Hints","You can access the hints from here too","click");
 //BA.debugLineNum = 70;BA.debugLine="Dim sm As WixSideBar = modSideBar.getSideBar";
_sm = _modsidebar._getsidebar /*b4j.example.wixsidebar*/ ();
 //BA.debugLineNum = 72;BA.debugLine="Dim R2 As WixRow";
_r2 = new b4j.example.wixrow();
 //BA.debugLineNum = 73;BA.debugLine="R2.Initialize(\"R2\")";
_r2._initialize /*b4j.example.wixrow*/ (ba,"R2");
 //BA.debugLineNum = 75;BA.debugLine="R2.AddColumns(sm.Item)";
_r2._addcolumns /*b4j.example.wixrow*/ (_sm._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 78;BA.debugLine="Dim tree As WixTree";
_tree = new b4j.example.wixtree();
 //BA.debugLineNum = 79;BA.debugLine="tree.Initialize(\"tree\").SetSelect(True).SetScroll";
_tree._initialize /*b4j.example.wixtree*/ (ba,"tree")._setselect /*b4j.example.wixtree*/ (anywheresoftware.b4a.keywords.Common.True)._setscroll /*b4j.example.wixtree*/ ((Object)(anywheresoftware.b4a.keywords.Common.True))._setwidth /*b4j.example.wixtree*/ ((Object)(300))._settypelinetree /*b4j.example.wixtree*/ (anywheresoftware.b4a.keywords.Common.True)._setborderless /*b4j.example.wixtree*/ (anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 81;BA.debugLine="R2.AddColumns(tree.Item)";
_r2._addcolumns /*b4j.example.wixrow*/ (_tree._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 82;BA.debugLine="R2.CreateResizer(\"\").AddToColumns(R2.Row)";
_r2._createresizer /*b4j.example.wixresizer*/ ("")._addtocolumns /*String*/ (_r2._row /*b4j.example.wixelement*/ );
 //BA.debugLineNum = 85;BA.debugLine="propBag.Initialize(\"propbag\").SetWidth(300).setna";
_propbag._initialize /*b4j.example.wixproperty*/ (ba,"propbag")._setwidth /*b4j.example.wixproperty*/ ((Object)(300))._setnamewidth /*b4j.example.wixproperty*/ ((int) (150))._setscroll /*b4j.example.wixproperty*/ ((Object)(anywheresoftware.b4a.keywords.Common.True));
 //BA.debugLineNum = 86;BA.debugLine="Dim frm As WixForm = modPropertyBag.getPropertyBa";
_frm = _modpropertybag._getpropertybag /*b4j.example.wixform*/ ();
 //BA.debugLineNum = 87;BA.debugLine="R2.AddColumns(frm.Item)";
_r2._addcolumns /*b4j.example.wixrow*/ (_frm._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 88;BA.debugLine="R2.CreateResizer(\"\").AddToColumns(R2.Row)";
_r2._createresizer /*b4j.example.wixresizer*/ ("")._addtocolumns /*String*/ (_r2._row /*b4j.example.wixelement*/ );
 //BA.debugLineNum = 90;BA.debugLine="Dim formholder As WixRow = modCenter.getCenter";
_formholder = _modcenter._getcenter /*b4j.example.wixrow*/ ();
 //BA.debugLineNum = 92;BA.debugLine="R2.AddColumns(formholder.Item)";
_r2._addcolumns /*b4j.example.wixrow*/ (_formholder._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 93;BA.debugLine="pg.AddRow(R2)";
_pg._addrow /*String*/ (_r2);
 //BA.debugLineNum = 95;BA.debugLine="pg.ui";
_pg._ui /*String*/ ();
 //BA.debugLineNum = 97;BA.debugLine="pg.Hide(\"testconnect\")";
_pg._hide /*String*/ ("testconnect");
 //BA.debugLineNum = 98;BA.debugLine="pg.Hide(\"propadd\")";
_pg._hide /*String*/ ("propadd");
 //BA.debugLineNum = 99;BA.debugLine="pg.Hide(\"add_row\")";
_pg._hide /*String*/ ("add_row");
 //BA.debugLineNum = 100;BA.debugLine="pg.Hide(\"add_column\")";
_pg._hide /*String*/ ("add_column");
 //BA.debugLineNum = 103;BA.debugLine="Dim meid As Map";
_meid = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 104;BA.debugLine="pg.OnItemClick(\"smp\", BANano.CallBack(Me, \"sideba";
_pg._onitemclick /*String*/ ("smp",(com.ab.banano.BANanoObject)(_banano.CallBack(pgformdesigner.getObject(),"sidebar_click",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_meid.getObject())}))));
 //BA.debugLineNum = 106;BA.debugLine="Dim recid As String";
_recid = "";
 //BA.debugLineNum = 107;BA.debugLine="pg.OnItemClick(\"tree\", BANano.CallBack(Me, \"tree_";
_pg._onitemclick /*String*/ ("tree",(com.ab.banano.BANanoObject)(_banano.CallBack(pgformdesigner.getObject(),"tree_clickwait",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_recid)}))));
 //BA.debugLineNum = 109;BA.debugLine="pg.OnAfterEditStop(\"propbag\", BANano.CallBack(Me,";
_pg._onaftereditstop /*String*/ ("propbag",(com.ab.banano.BANanoObject)(_banano.CallBack(pgformdesigner.getObject(),"prop_saveWait",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)))));
 //BA.debugLineNum = 110;BA.debugLine="pg.OnCheck(\"propbag\",BANano.CallBack(Me, \"prop_sa";
_pg._oncheck /*String*/ ("propbag",(com.ab.banano.BANanoObject)(_banano.CallBack(pgformdesigner.getObject(),"prop_saveWait",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)))));
 //BA.debugLineNum = 112;BA.debugLine="RefreshTreeWait";
_refreshtreewait();
 //BA.debugLineNum = 115;BA.debugLine="pg.StartHint(hints)";
_pg._starthint /*String*/ (_hints);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return "";
}
public static String  _multichange() throws Exception{
String _scontrols = "";
int _ccount = 0;
 //BA.debugLineNum = 1274;BA.debugLine="Sub multichange()";
 //BA.debugLineNum = 1275;BA.debugLine="Dim scontrols As String = pg.GetValue(\"txtmultipl";
_scontrols = _pg._getvalue /*String*/ ("txtmultiplecontrols");
 //BA.debugLineNum = 1276;BA.debugLine="scontrols = scontrols.trim";
_scontrols = _scontrols.trim();
 //BA.debugLineNum = 1277;BA.debugLine="If scontrols = \"\" Then";
if ((_scontrols).equals("")) { 
 //BA.debugLineNum = 1278;BA.debugLine="pg.Define(\"btnMulti\", CreateMap(\"badge\":\"0\"))";
_pg._define /*String*/ ("btnMulti",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("badge"),(Object)("0")}));
 //BA.debugLineNum = 1279;BA.debugLine="pg.Refresh(\"btnMulti\")";
_pg._refresh /*String*/ ("btnMulti");
 }else {
 //BA.debugLineNum = 1281;BA.debugLine="Dim cCount As Int = pg.MvCount(scontrols, \",\")";
_ccount = _pg._mvcount /*int*/ (_scontrols,",");
 //BA.debugLineNum = 1282;BA.debugLine="pg.Define(\"btnMulti\", CreateMap(\"badge\":cCount))";
_pg._define /*String*/ ("btnMulti",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("badge"),(Object)(_ccount)}));
 //BA.debugLineNum = 1283;BA.debugLine="pg.Refresh(\"btnMulti\")";
_pg._refresh /*String*/ ("btnMulti");
 };
 //BA.debugLineNum = 1285;BA.debugLine="End Sub";
return "";
}
public static String  _multiels() throws Exception{
String _parentid = "";
 //BA.debugLineNum = 134;BA.debugLine="Sub multiels";
 //BA.debugLineNum = 136;BA.debugLine="Dim parentid As String = pg.GetSelectedID(\"tree\")";
_parentid = _pg._getselectedid /*String*/ ("tree");
 //BA.debugLineNum = 137;BA.debugLine="If parentid = \"\" Then";
if ((_parentid).equals("")) { 
 //BA.debugLineNum = 138;BA.debugLine="pg.Message_Error(\"Please select the parent item";
_pg._message_error /*String*/ ("Please select the parent item from the tree first, then select the element you want to add! Remember to click Save in the property bag when done.");
 //BA.debugLineNum = 139;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 141;BA.debugLine="pg.boShow(CreateWindow)";
_pg._boshow /*String*/ (_createwindow());
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return "";
}
public static String  _openmenu() throws Exception{
 //BA.debugLineNum = 1181;BA.debugLine="Sub OpenMenu()";
 //BA.debugLineNum = 1182;BA.debugLine="pg.Toggle(\"smp\")";
_pg._toggle /*String*/ ("smp");
 //BA.debugLineNum = 1183;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private pg As WixPage";
_pg = new b4j.example.wixpage();
 //BA.debugLineNum = 4;BA.debugLine="Private BANano As BANano";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 5;BA.debugLine="Public div As UOENowHTML";
_div = new b4j.example.uoenowhtml();
 //BA.debugLineNum = 6;BA.debugLine="Private delID As String";
_delid = "";
 //BA.debugLineNum = 7;BA.debugLine="Private hints As WixHint";
_hints = new b4j.example.wixhint();
 //BA.debugLineNum = 8;BA.debugLine="Public code As UOENowHTML";
_code = new b4j.example.uoenowhtml();
 //BA.debugLineNum = 9;BA.debugLine="Private dbName As String";
_dbname = "";
 //BA.debugLineNum = 10;BA.debugLine="Private rec As Map";
_rec = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 11;BA.debugLine="Private qry As String";
_qry = "";
 //BA.debugLineNum = 12;BA.debugLine="Private res As String";
_res = "";
 //BA.debugLineNum = 13;BA.debugLine="Private rs As SQLiteResultSet";
_rs = new b4j.example.bananosqlite._sqliteresultset();
 //BA.debugLineNum = 14;BA.debugLine="Private json As String";
_json = "";
 //BA.debugLineNum = 15;BA.debugLine="Private sqlite As BANanoSQLite";
_sqlite = new b4j.example.bananosqlite();
 //BA.debugLineNum = 16;BA.debugLine="Public addingmethod As List";
_addingmethod = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 17;BA.debugLine="Public propBag As WixProperty";
_propbag = new b4j.example.wixproperty();
 //BA.debugLineNum = 18;BA.debugLine="Private winux As BANanoObject";
_winux = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 19;BA.debugLine="Private drawn As BANanoObject";
_drawn = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return "";
}
public static String  _prop_add() throws Exception{
anywheresoftware.b4a.objects.collections.Map _cm = null;
String _pid = "";
String _value = "";
String _tablename = "";
String _k = "";
 //BA.debugLineNum = 330;BA.debugLine="Sub prop_add";
 //BA.debugLineNum = 331;BA.debugLine="Dim cm As Map = pg.GetValues(\"propbag\")";
_cm = new anywheresoftware.b4a.objects.collections.Map();
_cm = _pg._getvalues /*anywheresoftware.b4a.objects.collections.Map*/ ("propbag");
 //BA.debugLineNum = 332;BA.debugLine="Dim pid As String = cm.GetDefault(\"id\",\"\")";
_pid = BA.ObjectToString(_cm.GetDefault((Object)("id"),(Object)("")));
 //BA.debugLineNum = 333;BA.debugLine="Dim value As String = cm.GetDefault(\"value\",\"\")";
_value = BA.ObjectToString(_cm.GetDefault((Object)("value"),(Object)("")));
 //BA.debugLineNum = 334;BA.debugLine="Dim tablename As String = cm.GetDefault(\"tablenam";
_tablename = BA.ObjectToString(_cm.GetDefault((Object)("tablename"),(Object)("")));
 //BA.debugLineNum = 335;BA.debugLine="Select Case pid";
switch (BA.switchObjectToInt(_pid,"connection","table","field")) {
case 0: {
 //BA.debugLineNum = 338;BA.debugLine="sidebar_click(\"table\")";
_sidebar_click("table");
 break; }
case 1: {
 //BA.debugLineNum = 341;BA.debugLine="sidebar_click(\"field\")";
_sidebar_click("field");
 break; }
case 2: {
 //BA.debugLineNum = 344;BA.debugLine="Dim k As String = $\"table.${tablename}\"$";
_k = ("table."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tablename))+"");
 //BA.debugLineNum = 346;BA.debugLine="pg.SelectItem(\"tree\", k)";
_pg._selectitem /*String*/ ("tree",_k);
 //BA.debugLineNum = 347;BA.debugLine="sidebar_click(\"field\")";
_sidebar_click("field");
 break; }
default: {
 //BA.debugLineNum = 350;BA.debugLine="sidebar_click(\"text\")";
_sidebar_click("text");
 break; }
}
;
 //BA.debugLineNum = 352;BA.debugLine="End Sub";
return "";
}
public static String  _prop_delete() throws Exception{
anywheresoftware.b4a.objects.collections.Map _rp = null;
boolean _confirmresult = false;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 549;BA.debugLine="Sub prop_delete";
 //BA.debugLineNum = 550;BA.debugLine="Dim rp As Map = pg.GetValues(\"propbag\")";
_rp = new anywheresoftware.b4a.objects.collections.Map();
_rp = _pg._getvalues /*anywheresoftware.b4a.objects.collections.Map*/ ("propbag");
 //BA.debugLineNum = 551;BA.debugLine="delID = rp.Get(\"id\")";
_delid = BA.ObjectToString(_rp.Get((Object)("id")));
 //BA.debugLineNum = 552;BA.debugLine="If delID = \"\" Then Return";
if ((_delid).equals("")) { 
if (true) return "";};
 //BA.debugLineNum = 554;BA.debugLine="Dim confirmresult As Boolean = False";
_confirmresult = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 555;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Me,\"dele";
_cb = (com.ab.banano.BANanoObject)(_banano.CallBack(pgformdesigner.getObject(),"deletepropwait",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_confirmresult)})));
 //BA.debugLineNum = 556;BA.debugLine="pg.Confirm(cb, \"Confirm Delete\", \"Are you sure th";
_pg._confirm /*String*/ (_cb,"Confirm Delete","Are you sure that you want to delete this item? You will not be able to undo your changes. Continue?");
 //BA.debugLineNum = 557;BA.debugLine="End Sub";
return "";
}
public static String  _prop_savewait() throws Exception{
anywheresoftware.b4a.objects.collections.Map _prop = null;
String _v = "";
String _i = "";
String _value = "";
String _tablename = "";
String _autoincrement = "";
String _primarykey = "";
String _p = "";
String _idx = "";
String _key = "";
String _tcode = "";
String _ccode = "";
anywheresoftware.b4a.objects.collections.Map _formview = null;
boolean _bexist = false;
anywheresoftware.b4a.objects.collections.Map _m = null;
 //BA.debugLineNum = 355;BA.debugLine="Sub prop_saveWait";
 //BA.debugLineNum = 358;BA.debugLine="Dim prop As Map = pg.GetValues(\"propbag\")";
_prop = new anywheresoftware.b4a.objects.collections.Map();
_prop = _pg._getvalues /*anywheresoftware.b4a.objects.collections.Map*/ ("propbag");
 //BA.debugLineNum = 359;BA.debugLine="Dim v As String = prop.GetDefault(\"view\",\"\")";
_v = BA.ObjectToString(_prop.GetDefault((Object)("view"),(Object)("")));
 //BA.debugLineNum = 360;BA.debugLine="Dim i As String = prop.Get(\"id\")";
_i = BA.ObjectToString(_prop.Get((Object)("id")));
 //BA.debugLineNum = 361;BA.debugLine="Dim value As String = prop.GetDefault(\"value\",\"\")";
_value = BA.ObjectToString(_prop.GetDefault((Object)("value"),(Object)("")));
 //BA.debugLineNum = 362;BA.debugLine="Dim tablename As String = prop.GetDefault(\"tablen";
_tablename = BA.ObjectToString(_prop.GetDefault((Object)("tablename"),(Object)("")));
 //BA.debugLineNum = 363;BA.debugLine="Dim autoincrement As String = prop.GetDefault(\"au";
_autoincrement = BA.ObjectToString(_prop.GetDefault((Object)("autoincrement"),(Object)("")));
 //BA.debugLineNum = 364;BA.debugLine="Dim primarykey As String = prop.GetDefault(\"prima";
_primarykey = BA.ObjectToString(_prop.GetDefault((Object)("primarykey"),(Object)("")));
 //BA.debugLineNum = 367;BA.debugLine="i = i.tolowercase";
_i = _i.toLowerCase();
 //BA.debugLineNum = 368;BA.debugLine="prop.Put(\"id\", i)";
_prop.Put((Object)("id"),(Object)(_i));
 //BA.debugLineNum = 369;BA.debugLine="Dim p As String = prop.GetDefault(\"parentid\",\"\")";
_p = BA.ObjectToString(_prop.GetDefault((Object)("parentid"),(Object)("")));
 //BA.debugLineNum = 370;BA.debugLine="If p <> \"\" Then";
if ((_p).equals("") == false) { 
 //BA.debugLineNum = 371;BA.debugLine="p = p.ToLowerCase";
_p = _p.toLowerCase();
 //BA.debugLineNum = 372;BA.debugLine="prop.Put(\"parentid\", p)";
_prop.Put((Object)("parentid"),(Object)(_p));
 };
 //BA.debugLineNum = 374;BA.debugLine="Dim idx As String = prop.getdefault(\"tabindex\",\"0";
_idx = BA.ObjectToString(_prop.GetDefault((Object)("tabindex"),(Object)("0")));
 //BA.debugLineNum = 376;BA.debugLine="json = BANano.ToJson(prop)";
_json = BA.ObjectToString(_banano.ToJson((Object)(_prop.getObject())));
 //BA.debugLineNum = 378;BA.debugLine="Select Case i";
switch (BA.switchObjectToInt(_i,"field","table","connection","form")) {
case 0: {
 //BA.debugLineNum = 381;BA.debugLine="Dim key As String = $\"field.${tablename}.${value";
_key = ("field."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tablename))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_value))+"");
 //BA.debugLineNum = 382;BA.debugLine="sqlite.Initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 383;BA.debugLine="sqlite.AddStrings(Array(\"id\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 385;BA.debugLine="rec = CreateMap()";
_rec = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {});
 //BA.debugLineNum = 386;BA.debugLine="rec.Put(\"id\", i)";
_rec.Put((Object)("id"),(Object)(_i));
 //BA.debugLineNum = 387;BA.debugLine="rec.Put(\"json\", json)";
_rec.Put((Object)("json"),(Object)(_json));
 //BA.debugLineNum = 388;BA.debugLine="rec.Put(\"key\", key)";
_rec.Put((Object)("key"),(Object)(_key));
 //BA.debugLineNum = 389;BA.debugLine="rec.Put(\"value\", value)";
_rec.Put((Object)("value"),(Object)(_value));
 //BA.debugLineNum = 390;BA.debugLine="rec.Put(\"tablename\", tablename)";
_rec.Put((Object)("tablename"),(Object)(_tablename));
 //BA.debugLineNum = 392;BA.debugLine="qry = sqlite.InsertReplace(\"fields\", rec)";
_qry = _sqlite._insertreplace /*String*/ ("fields",_rec);
 //BA.debugLineNum = 393;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\", C";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 395;BA.debugLine="sqlite.initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 396;BA.debugLine="sqlite.AddStrings(Array(\"id\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 397;BA.debugLine="qry = sqlite.Exists(\"fields\", \"key\", key)";
_qry = _sqlite._exists /*String*/ ("fields","key",_key);
 //BA.debugLineNum = 398;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\", C";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 399;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 400;BA.debugLine="pg.Message(rs.result.size & \" record(s) affected";
_pg._message /*String*/ (BA.NumberToString(_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" record(s) affected!");
 break; }
case 1: {
 //BA.debugLineNum = 402;BA.debugLine="Dim key As String = $\"table.${value}\"$";
_key = ("table."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_value))+"");
 //BA.debugLineNum = 403;BA.debugLine="sqlite.Initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 404;BA.debugLine="sqlite.AddStrings(Array(\"id\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 406;BA.debugLine="rec = CreateMap()";
_rec = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {});
 //BA.debugLineNum = 407;BA.debugLine="rec.Put(\"id\", i)";
_rec.Put((Object)("id"),(Object)(_i));
 //BA.debugLineNum = 408;BA.debugLine="rec.Put(\"json\", json)";
_rec.Put((Object)("json"),(Object)(_json));
 //BA.debugLineNum = 409;BA.debugLine="rec.Put(\"key\", key)";
_rec.Put((Object)("key"),(Object)(_key));
 //BA.debugLineNum = 410;BA.debugLine="rec.Put(\"value\", value)";
_rec.Put((Object)("value"),(Object)(_value));
 //BA.debugLineNum = 412;BA.debugLine="qry = sqlite.InsertReplace(\"tables\", rec)";
_qry = _sqlite._insertreplace /*String*/ ("tables",_rec);
 //BA.debugLineNum = 413;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\", C";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 415;BA.debugLine="sqlite.initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 416;BA.debugLine="sqlite.AddStrings(Array(\"id\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 417;BA.debugLine="qry = sqlite.Exists(\"tables\", \"key\", key)";
_qry = _sqlite._exists /*String*/ ("tables","key",_key);
 //BA.debugLineNum = 418;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\", C";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 419;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 420;BA.debugLine="pg.Message(rs.result.size & \" record(s) affected";
_pg._message /*String*/ (BA.NumberToString(_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" record(s) affected!");
 //BA.debugLineNum = 423;BA.debugLine="AddPrimaryKey";
_addprimarykey();
 //BA.debugLineNum = 425;BA.debugLine="sqlite.initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 426;BA.debugLine="sqlite.AddStrings(Array(\"tablename\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("tablename")}));
 //BA.debugLineNum = 427;BA.debugLine="qry = sqlite.SelectWhere(\"fields\", Array(\"json\")";
_qry = _sqlite._selectwhere /*String*/ ("fields",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("json")}),anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("tablename"),(Object)(_value)}),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("value")}));
 //BA.debugLineNum = 428;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\", C";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 429;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 431;BA.debugLine="Dim tcode As String = CreateTableCode(value,prim";
_tcode = _createtablecode(_value,_primarykey,_rs);
 //BA.debugLineNum = 432;BA.debugLine="SourceCodePreview(tcode)";
_sourcecodepreview(_tcode);
 break; }
case 2: {
 //BA.debugLineNum = 434;BA.debugLine="pg.collapse(\"preview\")";
_pg._collapse /*String*/ ("preview");
 //BA.debugLineNum = 435;BA.debugLine="pg.Expand(\"code\")";
_pg._expand /*String*/ ("code");
 //BA.debugLineNum = 436;BA.debugLine="sqlite.Initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 437;BA.debugLine="sqlite.AddStrings(Array(\"id\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 439;BA.debugLine="rec = CreateMap()";
_rec = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {});
 //BA.debugLineNum = 440;BA.debugLine="rec.Put(\"id\", i)";
_rec.Put((Object)("id"),(Object)(_i));
 //BA.debugLineNum = 441;BA.debugLine="rec.Put(\"json\", json)";
_rec.Put((Object)("json"),(Object)(_json));
 //BA.debugLineNum = 443;BA.debugLine="qry = sqlite.InsertReplace(\"connect\", rec)";
_qry = _sqlite._insertreplace /*String*/ ("connect",_rec);
 //BA.debugLineNum = 444;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\", C";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 446;BA.debugLine="sqlite.initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 447;BA.debugLine="sqlite.AddStrings(Array(\"id\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 448;BA.debugLine="qry = sqlite.Exists(\"connect\", \"id\", \"connection";
_qry = _sqlite._exists /*String*/ ("connect","id","connection");
 //BA.debugLineNum = 449;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\", C";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 450;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 451;BA.debugLine="pg.Message(rs.result.size & \" record(s) affected";
_pg._message /*String*/ (BA.NumberToString(_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" record(s) affected!");
 //BA.debugLineNum = 453;BA.debugLine="Dim ccode As String = dConnection.ConnectionCode";
_ccode = _dconnection._connectioncode /*String*/ (_prop);
 //BA.debugLineNum = 454;BA.debugLine="SourceCodePreview(ccode)";
_sourcecodepreview(_ccode);
 break; }
case 3: {
 //BA.debugLineNum = 456;BA.debugLine="sqlite.initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 457;BA.debugLine="sqlite.AddStrings(Array(\"id\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 458;BA.debugLine="qry = sqlite.SelectWhere(\"forms\", Array(\"*\"), Cr";
_qry = _sqlite._selectwhere /*String*/ ("forms",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("*")}),anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(_i)}),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 459;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\", C";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 460;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 462;BA.debugLine="rec = CreateMap()";
_rec = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {});
 //BA.debugLineNum = 463;BA.debugLine="rec.Put(\"json\", json)";
_rec.Put((Object)("json"),(Object)(_json));
 //BA.debugLineNum = 464;BA.debugLine="rec.Put(\"id\", i)";
_rec.Put((Object)("id"),(Object)(_i));
 //BA.debugLineNum = 465;BA.debugLine="rec.put(\"parentid\", p)";
_rec.Put((Object)("parentid"),(Object)(_p));
 //BA.debugLineNum = 466;BA.debugLine="If rs.result.size = 0 Then";
if (_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
 //BA.debugLineNum = 467;BA.debugLine="sqlite.Initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 468;BA.debugLine="sqlite.AddStrings(Array(\"id\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 469;BA.debugLine="qry = sqlite.Insert(\"forms\", rec)";
_qry = _sqlite._insert /*String*/ ("forms",_rec);
 //BA.debugLineNum = 470;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\",";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 471;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 473;BA.debugLine="pg.Message_Success(rs.result.size & \" record(s)";
_pg._message_success /*String*/ (BA.NumberToString(_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" record(s) affected!");
 }else {
 //BA.debugLineNum = 476;BA.debugLine="sqlite.Initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 477;BA.debugLine="sqlite.AddStrings(Array(\"id\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 478;BA.debugLine="qry = sqlite.UpdateWhere(\"forms\",rec,CreateMap(";
_qry = _sqlite._updatewhere /*String*/ ("forms",_rec,anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(_i)}));
 //BA.debugLineNum = 479;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\",";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 480;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 481;BA.debugLine="pg.Message_Success(rs.result.size & \" record(s)";
_pg._message_success /*String*/ (BA.NumberToString(_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" record(s) affected!");
 };
 //BA.debugLineNum = 483;BA.debugLine="Dim formView As Map = CreateView(prop)";
_formview = new anywheresoftware.b4a.objects.collections.Map();
_formview = _createview(_prop);
 //BA.debugLineNum = 484;BA.debugLine="SourceCodePreview1(formView,prop)";
_sourcecodepreview1(_formview,_prop);
 break; }
default: {
 //BA.debugLineNum = 487;BA.debugLine="If p <> \"\" Then";
if ((_p).equals("") == false) { 
 //BA.debugLineNum = 488;BA.debugLine="Dim bexist As Boolean = pg.Exists(\"tree\", p)";
_bexist = BA.ObjectToBoolean(_pg._exists /*Object*/ ("tree",_p));
 //BA.debugLineNum = 489;BA.debugLine="If bexist = False Then";
if (_bexist==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 490;BA.debugLine="pg.Message_Error(\"The parent id of this elemen";
_pg._message_error /*String*/ ("The parent id of this element cannot be found!");
 //BA.debugLineNum = 491;BA.debugLine="Return";
if (true) return "";
 };
 };
 //BA.debugLineNum = 496;BA.debugLine="Dim m As Map = CreateView(prop)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = _createview(_prop);
 //BA.debugLineNum = 497;BA.debugLine="SourceCodePreview1(m,prop)";
_sourcecodepreview1(_m,_prop);
 //BA.debugLineNum = 499;BA.debugLine="sqlite.Initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 500;BA.debugLine="sqlite.AddStrings(Array(\"id\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 501;BA.debugLine="qry = sqlite.SelectWhere(\"items\", Array(\"*\"), Cr";
_qry = _sqlite._selectwhere /*String*/ ("items",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("*")}),anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(_i)}),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 502;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\", C";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 503;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 504;BA.debugLine="rec = CreateMap()";
_rec = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {});
 //BA.debugLineNum = 505;BA.debugLine="rec.Put(\"json\", json)";
_rec.Put((Object)("json"),(Object)(_json));
 //BA.debugLineNum = 506;BA.debugLine="rec.put(\"parentid\", p)";
_rec.Put((Object)("parentid"),(Object)(_p));
 //BA.debugLineNum = 507;BA.debugLine="rec.Put(\"tabindex\", idx)";
_rec.Put((Object)("tabindex"),(Object)(_idx));
 //BA.debugLineNum = 508;BA.debugLine="rec.Put(\"id\", i)";
_rec.Put((Object)("id"),(Object)(_i));
 //BA.debugLineNum = 509;BA.debugLine="If rs.result.Size = 0 Then";
if (_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
 //BA.debugLineNum = 511;BA.debugLine="sqlite.Initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 512;BA.debugLine="sqlite.AddStrings(Array(\"id\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 513;BA.debugLine="qry = sqlite.Insert(\"items\", rec)";
_qry = _sqlite._insert /*String*/ ("items",_rec);
 //BA.debugLineNum = 514;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\",";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 515;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 516;BA.debugLine="pg.Message_Success(rs.result.size & \" record(s)";
_pg._message_success /*String*/ (BA.NumberToString(_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" record(s) affected!");
 }else {
 //BA.debugLineNum = 519;BA.debugLine="sqlite.Initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 520;BA.debugLine="sqlite.AddStrings(Array(\"id\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 521;BA.debugLine="qry = sqlite.UpdateWhere(\"items\",rec,CreateMap(";
_qry = _sqlite._updatewhere /*String*/ ("items",_rec,anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(_i)}));
 //BA.debugLineNum = 522;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\",";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 523;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 524;BA.debugLine="pg.Message_Success(rs.result.size & \" record(s)";
_pg._message_success /*String*/ (BA.NumberToString(_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" record(s) affected!");
 };
 break; }
}
;
 //BA.debugLineNum = 528;BA.debugLine="RefreshTreeWait";
_refreshtreewait();
 //BA.debugLineNum = 529;BA.debugLine="End Sub";
return "";
}
public static String  _refreshapp() throws Exception{
 //BA.debugLineNum = 148;BA.debugLine="Sub refreshapp";
 //BA.debugLineNum = 149;BA.debugLine="ClearPreviewIT";
_clearpreviewit();
 //BA.debugLineNum = 150;BA.debugLine="ClearCodeIT";
_clearcodeit();
 //BA.debugLineNum = 151;BA.debugLine="RefreshTreeWait";
_refreshtreewait();
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return "";
}
public static String  _refreshtreewait() throws Exception{
anywheresoftware.b4a.objects.collections.Map _fitem = null;
String _key = "";
String _tablename = "";
String _tblkey = "";
String _fid = "";
anywheresoftware.b4a.objects.collections.Map _item = null;
String _itmid = "";
String _parentid = "";
 //BA.debugLineNum = 169;BA.debugLine="Sub RefreshTreeWait";
 //BA.debugLineNum = 171;BA.debugLine="pg.ClearAll(\"tree\")";
_pg._clearall /*String*/ ("tree");
 //BA.debugLineNum = 173;BA.debugLine="pg.AddNode(\"tree\", \"\", \"connection\", \"Database\",";
_pg._addnode /*b4j.example.wixpage*/ ("tree","","connection","Database","",_pg._enumwixicons /*b4j.example.wixicons*/ ._folder /*String*/ ,"","",anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 175;BA.debugLine="sqlite.Initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 176;BA.debugLine="qry = sqlite.SelectAll(\"tables\", Array(\"key\"), Ar";
_qry = _sqlite._selectall /*String*/ ("tables",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("key")}),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("key")}));
 //BA.debugLineNum = 177;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\", Cr";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 178;BA.debugLine="rs = sqlite.GetResultSet(qry, res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 179;BA.debugLine="For Each fitem As Map In rs.result";
_fitem = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group7 = _rs.result /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_fitem.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group7.Get(index7)));
 //BA.debugLineNum = 180;BA.debugLine="Dim key As String = fitem.Get(\"key\")";
_key = BA.ObjectToString(_fitem.Get((Object)("key")));
 //BA.debugLineNum = 181;BA.debugLine="pg.AddNode(\"tree\", \"connection\", key, key, \"\", p";
_pg._addnode /*b4j.example.wixpage*/ ("tree","connection",_key,_key,"",_pg._enumwixicons /*b4j.example.wixicons*/ ._folder /*String*/ ,"","",anywheresoftware.b4a.keywords.Common.True);
 }
};
 //BA.debugLineNum = 185;BA.debugLine="sqlite.Initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 186;BA.debugLine="qry = sqlite.SelectAll(\"fields\", Array(\"key\",\"tab";
_qry = _sqlite._selectall /*String*/ ("fields",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("key"),(Object)("tablename")}),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("key")}));
 //BA.debugLineNum = 187;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\", Cr";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 188;BA.debugLine="rs = sqlite.GetResultSet(qry, res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 189;BA.debugLine="For Each fitem As Map In rs.result";
_fitem = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group15 = _rs.result /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen15 = group15.getSize()
;int index15 = 0;
;
for (; index15 < groupLen15;index15++){
_fitem.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group15.Get(index15)));
 //BA.debugLineNum = 190;BA.debugLine="Dim key As String = fitem.Get(\"key\")";
_key = BA.ObjectToString(_fitem.Get((Object)("key")));
 //BA.debugLineNum = 191;BA.debugLine="Dim tablename As String = fitem.Get(\"tablename\")";
_tablename = BA.ObjectToString(_fitem.Get((Object)("tablename")));
 //BA.debugLineNum = 192;BA.debugLine="Dim tblKey As String = $\"table.${tablename}\"$";
_tblkey = ("table."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tablename))+"");
 //BA.debugLineNum = 193;BA.debugLine="pg.AddNode(\"tree\", tblKey, key, key, \"\", pg.Enum";
_pg._addnode /*b4j.example.wixpage*/ ("tree",_tblkey,_key,_key,"",_pg._enumwixicons /*b4j.example.wixicons*/ ._folder /*String*/ ,"","",anywheresoftware.b4a.keywords.Common.True);
 }
};
 //BA.debugLineNum = 197;BA.debugLine="sqlite.Initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 198;BA.debugLine="qry = sqlite.SelectAll(\"forms\", Array(\"id\"), Arra";
_qry = _sqlite._selectall /*String*/ ("forms",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 199;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\", Cr";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 200;BA.debugLine="rs = sqlite.GetResultSet(qry, res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 201;BA.debugLine="For Each fitem As Map In rs.result";
_fitem = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group25 = _rs.result /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen25 = group25.getSize()
;int index25 = 0;
;
for (; index25 < groupLen25;index25++){
_fitem.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group25.Get(index25)));
 //BA.debugLineNum = 202;BA.debugLine="Dim fid As String = fitem.Get(\"id\")";
_fid = BA.ObjectToString(_fitem.Get((Object)("id")));
 //BA.debugLineNum = 203;BA.debugLine="pg.AddNode(\"tree\", \"\", fid, fid, \"\", pg.EnumWixI";
_pg._addnode /*b4j.example.wixpage*/ ("tree","",_fid,_fid,"",_pg._enumwixicons /*b4j.example.wixicons*/ ._folder /*String*/ ,"","",anywheresoftware.b4a.keywords.Common.True);
 }
};
 //BA.debugLineNum = 207;BA.debugLine="sqlite.Initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 208;BA.debugLine="sqlite.AddStrings(Array(\"id\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 209;BA.debugLine="qry = sqlite.SelectAll(\"items\", Array(\"*\"), Array";
_qry = _sqlite._selectall /*String*/ ("items",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("*")}),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("tabindex")}));
 //BA.debugLineNum = 210;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\", Cr";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 211;BA.debugLine="rs = sqlite.GetResultSet(qry, res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 212;BA.debugLine="For Each item As Map In rs.result";
_item = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group34 = _rs.result /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen34 = group34.getSize()
;int index34 = 0;
;
for (; index34 < groupLen34;index34++){
_item.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group34.Get(index34)));
 //BA.debugLineNum = 213;BA.debugLine="Dim itmID As String = item.Get(\"id\")";
_itmid = BA.ObjectToString(_item.Get((Object)("id")));
 //BA.debugLineNum = 214;BA.debugLine="Dim parentid As String = item.Get(\"parentid\")";
_parentid = BA.ObjectToString(_item.Get((Object)("parentid")));
 //BA.debugLineNum = 215;BA.debugLine="pg.AddNode(\"tree\", parentid, itmID, itmID, \"\", p";
_pg._addnode /*b4j.example.wixpage*/ ("tree",_parentid,_itmid,_itmid,"",_pg._enumwixicons /*b4j.example.wixicons*/ ._fileicon /*String*/ ,"","",anywheresoftware.b4a.keywords.Common.True);
 }
};
 //BA.debugLineNum = 217;BA.debugLine="pg.Refresh(\"tree\")";
_pg._refresh /*String*/ ("tree");
 //BA.debugLineNum = 218;BA.debugLine="End Sub";
return "";
}
public static String  _showhints() throws Exception{
 //BA.debugLineNum = 144;BA.debugLine="Sub showhints";
 //BA.debugLineNum = 145;BA.debugLine="pg.StartHint(hints)";
_pg._starthint /*String*/ (_hints);
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return "";
}
public static String  _sidebar_click(String _meid) throws Exception{
String _parentid = "";
String _prefix = "";
String _suffix = "";
int _startpoint = 0;
boolean _pboolean = false;
String _kfind = "";
anywheresoftware.b4a.objects.collections.Map _p = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
 //BA.debugLineNum = 927;BA.debugLine="Sub sidebar_click(meid As String)";
 //BA.debugLineNum = 928;BA.debugLine="pg.Collapse(\"preview\")";
_pg._collapse /*String*/ ("preview");
 //BA.debugLineNum = 929;BA.debugLine="pg.Expand(\"code\")";
_pg._expand /*String*/ ("code");
 //BA.debugLineNum = 930;BA.debugLine="ClearPreviewIT";
_clearpreviewit();
 //BA.debugLineNum = 931;BA.debugLine="ClearCodeIT";
_clearcodeit();
 //BA.debugLineNum = 932;BA.debugLine="propBag.Clear";
_propbag._clear /*String*/ ();
 //BA.debugLineNum = 933;BA.debugLine="propBag.Refresh(pg)";
_propbag._refresh /*String*/ (_pg);
 //BA.debugLineNum = 935;BA.debugLine="pg.Hide(\"testconnect\")";
_pg._hide /*String*/ ("testconnect");
 //BA.debugLineNum = 936;BA.debugLine="pg.Hide(\"propadd\")";
_pg._hide /*String*/ ("propadd");
 //BA.debugLineNum = 937;BA.debugLine="pg.Hide(\"add_row\")";
_pg._hide /*String*/ ("add_row");
 //BA.debugLineNum = 938;BA.debugLine="pg.Hide(\"add_column\")";
_pg._hide /*String*/ ("add_column");
 //BA.debugLineNum = 940;BA.debugLine="Select Case meid";
switch (BA.switchObjectToInt(_meid,"con","hlp","buttons","txts","sels","choices","pickers","others","grid","lay","db","downloads","b4xlib","skeletonapp","dbhelp","field","table","connection","form")) {
case 0: 
case 1: 
case 2: 
case 3: 
case 4: 
case 5: 
case 6: 
case 7: 
case 8: 
case 9: 
case 10: {
 break; }
case 11: {
 break; }
case 12: {
 break; }
case 13: {
 break; }
case 14: {
 //BA.debugLineNum = 946;BA.debugLine="dbhelp";
_dbhelp();
 break; }
case 15: {
 //BA.debugLineNum = 948;BA.debugLine="pg.show(\"propadd\")";
_pg._show /*String*/ ("propadd");
 //BA.debugLineNum = 949;BA.debugLine="pg.Collapse(\"preview\")";
_pg._collapse /*String*/ ("preview");
 //BA.debugLineNum = 950;BA.debugLine="pg.Expand(\"code\")";
_pg._expand /*String*/ ("code");
 //BA.debugLineNum = 951;BA.debugLine="pg.show(\"propdelete\")";
_pg._show /*String*/ ("propdelete");
 //BA.debugLineNum = 953;BA.debugLine="Dim parentid As String = pg.GetSelectedID(\"tree\"";
_parentid = _pg._getselectedid /*String*/ ("tree");
 //BA.debugLineNum = 954;BA.debugLine="If parentid = \"\" Then";
if ((_parentid).equals("")) { 
 //BA.debugLineNum = 955;BA.debugLine="pg.Message_Error(\"Please select the table to ad";
_pg._message_error /*String*/ ("Please select the table to add the field to first!");
 //BA.debugLineNum = 956;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 958;BA.debugLine="Dim prefix As String = pg.MvField(parentid,1,\".\"";
_prefix = _pg._mvfield /*String*/ (_parentid,(int) (1),".");
 //BA.debugLineNum = 959;BA.debugLine="Dim suffix As String = pg.MvField(parentid,2,\".\"";
_suffix = _pg._mvfield /*String*/ (_parentid,(int) (2),".");
 //BA.debugLineNum = 960;BA.debugLine="Select Case prefix";
switch (BA.switchObjectToInt(_prefix,"table")) {
case 0: {
 //BA.debugLineNum = 962;BA.debugLine="pg.Collapse(\"preview\")";
_pg._collapse /*String*/ ("preview");
 //BA.debugLineNum = 963;BA.debugLine="pg.Expand(\"code\")";
_pg._expand /*String*/ ("code");
 //BA.debugLineNum = 964;BA.debugLine="pg.show(\"propdelete\")";
_pg._show /*String*/ ("propdelete");
 //BA.debugLineNum = 965;BA.debugLine="dField.BuildBag(pg,propBag)";
_dfield._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 967;BA.debugLine="prefix = $\"field.${suffix}.field\"$";
_prefix = ("field."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_suffix))+".field");
 //BA.debugLineNum = 968;BA.debugLine="Dim startPoint As Int = 0";
_startpoint = (int) (0);
 //BA.debugLineNum = 969;BA.debugLine="Dim pBoolean As Boolean = True";
_pboolean = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 970;BA.debugLine="Dim kFind As String = \"\"";
_kfind = "";
 //BA.debugLineNum = 971;BA.debugLine="Do While pBoolean = True";
while (_pboolean==anywheresoftware.b4a.keywords.Common.True) {
 //BA.debugLineNum = 972;BA.debugLine="startPoint = startPoint + 1";
_startpoint = (int) (_startpoint+1);
 //BA.debugLineNum = 973;BA.debugLine="kFind = prefix & pg.cstr(startPoint)";
_kfind = _prefix+_pg._cstr /*String*/ ((Object)(_startpoint));
 //BA.debugLineNum = 974;BA.debugLine="sqlite.initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 975;BA.debugLine="sqlite.AddStrings(Array(\"id\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 976;BA.debugLine="qry = sqlite.Exists(\"fields\", \"key\", kFind)";
_qry = _sqlite._exists /*String*/ ("fields","key",_kfind);
 //BA.debugLineNum = 977;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\",";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 978;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 980;BA.debugLine="If rs.result.Size = 0 Then";
if (_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
 //BA.debugLineNum = 981;BA.debugLine="pBoolean = False";
_pboolean = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 982;BA.debugLine="Exit";
if (true) break;
 }else {
 //BA.debugLineNum = 984;BA.debugLine="pBoolean = True";
_pboolean = anywheresoftware.b4a.keywords.Common.True;
 };
 }
;
 //BA.debugLineNum = 987;BA.debugLine="kFind = pg.MvField(kFind,3,\".\")";
_kfind = _pg._mvfield /*String*/ (_kfind,(int) (3),".");
 //BA.debugLineNum = 988;BA.debugLine="Dim p As Map = pg.GetValues(\"propbag\")";
_p = new anywheresoftware.b4a.objects.collections.Map();
_p = _pg._getvalues /*anywheresoftware.b4a.objects.collections.Map*/ ("propbag");
 //BA.debugLineNum = 989;BA.debugLine="p.Put(\"tablename\", suffix)";
_p.Put((Object)("tablename"),(Object)(_suffix));
 //BA.debugLineNum = 990;BA.debugLine="p.Put(\"value\", kFind)";
_p.Put((Object)("value"),(Object)(_kfind));
 //BA.debugLineNum = 991;BA.debugLine="pg.SetValues(\"propbag\",p)";
_pg._setvalues /*String*/ ("propbag",_p);
 break; }
default: {
 //BA.debugLineNum = 993;BA.debugLine="pg.Message_Error(\"Please select the table to ad";
_pg._message_error /*String*/ ("Please select the table to add the field to first!");
 //BA.debugLineNum = 994;BA.debugLine="Return";
if (true) return "";
 break; }
}
;
 break; }
case 16: {
 //BA.debugLineNum = 997;BA.debugLine="pg.show(\"propadd\")";
_pg._show /*String*/ ("propadd");
 //BA.debugLineNum = 998;BA.debugLine="pg.Collapse(\"preview\")";
_pg._collapse /*String*/ ("preview");
 //BA.debugLineNum = 999;BA.debugLine="pg.Expand(\"code\")";
_pg._expand /*String*/ ("code");
 //BA.debugLineNum = 1000;BA.debugLine="pg.show(\"propdelete\")";
_pg._show /*String*/ ("propdelete");
 //BA.debugLineNum = 1001;BA.debugLine="dTable.BuildBag(pg,propBag)";
_dtable._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 1003;BA.debugLine="prefix = $\"table.table\"$";
_prefix = ("table.table");
 //BA.debugLineNum = 1004;BA.debugLine="Dim startPoint As Int = 0";
_startpoint = (int) (0);
 //BA.debugLineNum = 1005;BA.debugLine="Dim pBoolean As Boolean = True";
_pboolean = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 1006;BA.debugLine="Dim kFind As String = \"\"";
_kfind = "";
 //BA.debugLineNum = 1007;BA.debugLine="Do While pBoolean = True";
while (_pboolean==anywheresoftware.b4a.keywords.Common.True) {
 //BA.debugLineNum = 1008;BA.debugLine="startPoint = startPoint + 1";
_startpoint = (int) (_startpoint+1);
 //BA.debugLineNum = 1009;BA.debugLine="kFind = prefix & pg.cstr(startPoint)";
_kfind = _prefix+_pg._cstr /*String*/ ((Object)(_startpoint));
 //BA.debugLineNum = 1010;BA.debugLine="sqlite.initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 1011;BA.debugLine="sqlite.AddStrings(Array(\"id\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 1012;BA.debugLine="qry = sqlite.Exists(\"tables\", \"key\", kFind)";
_qry = _sqlite._exists /*String*/ ("tables","key",_kfind);
 //BA.debugLineNum = 1013;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\",";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 1014;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 1016;BA.debugLine="If rs.result.Size = 0 Then";
if (_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
 //BA.debugLineNum = 1017;BA.debugLine="pBoolean = False";
_pboolean = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 1018;BA.debugLine="Exit";
if (true) break;
 }else {
 //BA.debugLineNum = 1020;BA.debugLine="pBoolean = True";
_pboolean = anywheresoftware.b4a.keywords.Common.True;
 };
 }
;
 //BA.debugLineNum = 1023;BA.debugLine="kFind = pg.MvField(kFind,2,\".\")";
_kfind = _pg._mvfield /*String*/ (_kfind,(int) (2),".");
 //BA.debugLineNum = 1024;BA.debugLine="Dim p As Map = pg.GetValues(\"propbag\")";
_p = new anywheresoftware.b4a.objects.collections.Map();
_p = _pg._getvalues /*anywheresoftware.b4a.objects.collections.Map*/ ("propbag");
 //BA.debugLineNum = 1025;BA.debugLine="p.Put(\"value\", kFind)";
_p.Put((Object)("value"),(Object)(_kfind));
 //BA.debugLineNum = 1026;BA.debugLine="pg.SetValues(\"propbag\",p)";
_pg._setvalues /*String*/ ("propbag",_p);
 break; }
case 17: {
 //BA.debugLineNum = 1029;BA.debugLine="pg.show(\"propadd\")";
_pg._show /*String*/ ("propadd");
 //BA.debugLineNum = 1030;BA.debugLine="If DrawPropBag(meid) Then";
if (_drawpropbag(_meid)) { 
 //BA.debugLineNum = 1031;BA.debugLine="pg.Show(\"testconnect\")";
_pg._show /*String*/ ("testconnect");
 //BA.debugLineNum = 1032;BA.debugLine="pg.Hide(\"propdelete\")";
_pg._hide /*String*/ ("propdelete");
 };
 break; }
case 18: {
 //BA.debugLineNum = 1035;BA.debugLine="pg.Expand(\"preview\")";
_pg._expand /*String*/ ("preview");
 //BA.debugLineNum = 1036;BA.debugLine="pg.Show(\"add_row\")";
_pg._show /*String*/ ("add_row");
 //BA.debugLineNum = 1037;BA.debugLine="pg.Show(\"add_column\")";
_pg._show /*String*/ ("add_column");
 //BA.debugLineNum = 1038;BA.debugLine="pg.Show(\"propadd\")";
_pg._show /*String*/ ("propadd");
 //BA.debugLineNum = 1039;BA.debugLine="If DrawPropBag(meid) Then";
if (_drawpropbag(_meid)) { 
 //BA.debugLineNum = 1040;BA.debugLine="pg.Hide(\"propdelete\")";
_pg._hide /*String*/ ("propdelete");
 //BA.debugLineNum = 1041;BA.debugLine="rec = pg.GetValues(\"propbag\")";
_rec = _pg._getvalues /*anywheresoftware.b4a.objects.collections.Map*/ ("propbag");
 };
 break; }
default: {
 //BA.debugLineNum = 1046;BA.debugLine="pg.Expand(\"preview\")";
_pg._expand /*String*/ ("preview");
 //BA.debugLineNum = 1047;BA.debugLine="pg.Show(\"propadd\")";
_pg._show /*String*/ ("propadd");
 //BA.debugLineNum = 1049;BA.debugLine="Dim parentid As String = pg.GetSelectedID(\"tree\"";
_parentid = _pg._getselectedid /*String*/ ("tree");
 //BA.debugLineNum = 1050;BA.debugLine="If parentid = \"\" Then";
if ((_parentid).equals("")) { 
 //BA.debugLineNum = 1051;BA.debugLine="pg.Message_Error(\"Please select the parent item";
_pg._message_error /*String*/ ("Please select the parent item from the tree first, then select the element you want to add! Remember to click Save in the property bag when done.");
 //BA.debugLineNum = 1052;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 1054;BA.debugLine="pg.Show(\"propdelete\")";
_pg._show /*String*/ ("propdelete");
 //BA.debugLineNum = 1055;BA.debugLine="If DrawPropBag(meid) Then";
if (_drawpropbag(_meid)) { 
 //BA.debugLineNum = 1057;BA.debugLine="rec = pg.GetValues(\"propbag\")";
_rec = _pg._getvalues /*anywheresoftware.b4a.objects.collections.Map*/ ("propbag");
 //BA.debugLineNum = 1058;BA.debugLine="Dim startPoint As Int = 0";
_startpoint = (int) (0);
 //BA.debugLineNum = 1059;BA.debugLine="Dim pBoolean As Boolean = True";
_pboolean = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 1060;BA.debugLine="Dim kFind As String = \"\"";
_kfind = "";
 //BA.debugLineNum = 1061;BA.debugLine="prefix = meid";
_prefix = _meid;
 //BA.debugLineNum = 1062;BA.debugLine="Do While pBoolean = True";
while (_pboolean==anywheresoftware.b4a.keywords.Common.True) {
 //BA.debugLineNum = 1063;BA.debugLine="startPoint = startPoint + 1";
_startpoint = (int) (_startpoint+1);
 //BA.debugLineNum = 1064;BA.debugLine="kFind = prefix & pg.cstr(startPoint)";
_kfind = _prefix+_pg._cstr /*String*/ ((Object)(_startpoint));
 //BA.debugLineNum = 1065;BA.debugLine="sqlite.initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 1066;BA.debugLine="sqlite.AddStrings(Array(\"id\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 1067;BA.debugLine="qry = sqlite.Exists(\"items\", \"id\", kFind)";
_qry = _sqlite._exists /*String*/ ("items","id",_kfind);
 //BA.debugLineNum = 1068;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\",";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 1069;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 1071;BA.debugLine="If rs.result.Size = 0 Then";
if (_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
 //BA.debugLineNum = 1072;BA.debugLine="pBoolean = False";
_pboolean = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 1073;BA.debugLine="Exit";
if (true) break;
 }else {
 //BA.debugLineNum = 1075;BA.debugLine="pBoolean = True";
_pboolean = anywheresoftware.b4a.keywords.Common.True;
 };
 }
;
 //BA.debugLineNum = 1078;BA.debugLine="rec.Put(\"parentid\", parentid)";
_rec.Put((Object)("parentid"),(Object)(_parentid));
 //BA.debugLineNum = 1079;BA.debugLine="rec.Put(\"id\", kFind)";
_rec.Put((Object)("id"),(Object)(_kfind));
 //BA.debugLineNum = 1080;BA.debugLine="rec.Put(\"template\", kFind)";
_rec.Put((Object)("template"),(Object)(_kfind));
 //BA.debugLineNum = 1081;BA.debugLine="rec.Put(\"localId\", kFind)";
_rec.Put((Object)("localId"),(Object)(_kfind));
 //BA.debugLineNum = 1082;BA.debugLine="pg.SetValues(\"propbag\",rec)";
_pg._setvalues /*String*/ ("propbag",_rec);
 //BA.debugLineNum = 1084;BA.debugLine="Dim m As Map = CreateView(rec)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = _createview(_rec);
 //BA.debugLineNum = 1085;BA.debugLine="SourceCodePreview1(m,rec)";
_sourcecodepreview1(_m,_rec);
 };
 break; }
}
;
 //BA.debugLineNum = 1088;BA.debugLine="End Sub";
return "";
}
public static String  _sourcecodeitem(anywheresoftware.b4a.objects.collections.Map _m,anywheresoftware.b4a.objects.collections.Map _original) throws Exception{
String _v = "";
String _i = "";
String _sparentid = "";
String _saddingmethod = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _strkey = "";
Object _strval = null;
String _k = "";
String _xval = "";
 //BA.debugLineNum = 689;BA.debugLine="Sub SourceCodeItem(m As Map, original As Map) As S";
 //BA.debugLineNum = 690;BA.debugLine="Dim v As String = m.Get(\"view\")";
_v = BA.ObjectToString(_m.Get((Object)("view")));
 //BA.debugLineNum = 691;BA.debugLine="Dim i As String = m.Get(\"id\")";
_i = BA.ObjectToString(_m.Get((Object)("id")));
 //BA.debugLineNum = 692;BA.debugLine="v = pg.CStr(v)";
_v = _pg._cstr /*String*/ ((Object)(_v));
 //BA.debugLineNum = 693;BA.debugLine="If v = \"undefined\" Then v = \"Element\"";
if ((_v).equals("undefined")) { 
_v = "Element";};
 //BA.debugLineNum = 695;BA.debugLine="Dim sparentid As String = original.Get(\"parentid\"";
_sparentid = BA.ObjectToString(_original.Get((Object)("parentid")));
 //BA.debugLineNum = 696;BA.debugLine="Dim saddingmethod As String = original.Get(\"addin";
_saddingmethod = BA.ObjectToString(_original.Get((Object)("addingmethod")));
 //BA.debugLineNum = 699;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 700;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 701;BA.debugLine="sb.Append($\"Dim ${i} As Wix${v}\"$).Append(\"<br>\")";
_sb.Append(("Dim "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+" As Wix"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_v))+"")).Append("<br>");
 //BA.debugLineNum = 702;BA.debugLine="sb.Append($\"${i}.Initialize(\"${i}\")\"$).Append(\"<b";
_sb.Append((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+".Initialize(\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+"\")")).Append("<br>");
 //BA.debugLineNum = 703;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group11 = _m.Keys();
final int groupLen11 = group11.getSize()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_strkey = BA.ObjectToString(group11.Get(index11));
 //BA.debugLineNum = 704;BA.debugLine="If strKey = \"id\" Then Continue";
if ((_strkey).equals("id")) { 
if (true) continue;};
 //BA.debugLineNum = 705;BA.debugLine="If strKey = \"container\" Then Continue";
if ((_strkey).equals("container")) { 
if (true) continue;};
 //BA.debugLineNum = 706;BA.debugLine="If strKey = \"view\" Then Continue";
if ((_strkey).equals("view")) { 
if (true) continue;};
 //BA.debugLineNum = 707;BA.debugLine="If strKey = \"parentid\" Then Continue";
if ((_strkey).equals("parentid")) { 
if (true) continue;};
 //BA.debugLineNum = 708;BA.debugLine="If strKey = \"localId\" Then Continue";
if ((_strkey).equals("localId")) { 
if (true) continue;};
 //BA.debugLineNum = 709;BA.debugLine="If strKey = \"tabindex\" Then Continue";
if ((_strkey).equals("tabindex")) { 
if (true) continue;};
 //BA.debugLineNum = 710;BA.debugLine="Dim strVal As Object = m.Get(strKey)";
_strval = _m.Get((Object)(_strkey));
 //BA.debugLineNum = 711;BA.debugLine="Dim k As String = Capitalize(strKey)";
_k = _capitalize(_strkey);
 //BA.debugLineNum = 712;BA.debugLine="If GetType(strVal) = \"object\" Then";
if ((anywheresoftware.b4a.keywords.Common.GetType(_strval)).equals("object")) { 
 //BA.debugLineNum = 713;BA.debugLine="Dim xval As String = pg.Map2JsonPretty(strVal)";
_xval = _pg._map2jsonpretty /*String*/ ((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_strval)));
 //BA.debugLineNum = 714;BA.debugLine="sb.Append($\"${i}.Set${k}(\"${xval}\")\"$).Append(\"";
_sb.Append((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+".Set"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_k))+"(\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_xval))+"\")")).Append("<br>");
 }else {
 //BA.debugLineNum = 716;BA.debugLine="sb.Append($\"${i}.Set${k}(\"${strVal}\")\"$).Append";
_sb.Append((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+".Set"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_k))+"(\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",_strval)+"\")")).Append("<br>");
 };
 }
};
 //BA.debugLineNum = 719;BA.debugLine="If sparentid <> \"\" Then";
if ((_sparentid).equals("") == false) { 
 //BA.debugLineNum = 720;BA.debugLine="sb.Append(sparentid).Append(\".\").Append(saddingm";
_sb.Append(_sparentid).Append(".").Append(_saddingmethod).Append("(").Append(_i).Append(".Item)");
 };
 //BA.debugLineNum = 722;BA.debugLine="Return sb.tostring";
if (true) return _sb.ToString();
 //BA.debugLineNum = 723;BA.debugLine="End Sub";
return "";
}
public static String  _sourcecodepreview(String _script) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _scode = "";
 //BA.debugLineNum = 725;BA.debugLine="Sub SourceCodePreview(script As String)";
 //BA.debugLineNum = 726;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 727;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 728;BA.debugLine="sb.Append(\"<pre>\")";
_sb.Append("<pre>");
 //BA.debugLineNum = 729;BA.debugLine="sb.Append(script)";
_sb.Append(_script);
 //BA.debugLineNum = 730;BA.debugLine="sb.Append(\"</pre>\")";
_sb.Append("</pre>");
 //BA.debugLineNum = 732;BA.debugLine="Dim scode As String = sb.tostring";
_scode = _sb.ToString();
 //BA.debugLineNum = 733;BA.debugLine="pg.Define(\"codeit\", CreateMap(\"template\":scode))";
_pg._define /*String*/ ("codeit",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("template"),(Object)(_scode)}));
 //BA.debugLineNum = 734;BA.debugLine="pg.Refresh(\"codeit\")";
_pg._refresh /*String*/ ("codeit");
 //BA.debugLineNum = 735;BA.debugLine="End Sub";
return "";
}
public static String  _sourcecodepreview1(anywheresoftware.b4a.objects.collections.Map _m,anywheresoftware.b4a.objects.collections.Map _original) throws Exception{
String _elcode = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _scode = "";
String _v = "";
 //BA.debugLineNum = 737;BA.debugLine="Sub SourceCodePreview1(m As Map,original As Map)";
 //BA.debugLineNum = 738;BA.debugLine="ClearPreviewIT";
_clearpreviewit();
 //BA.debugLineNum = 740;BA.debugLine="Dim elCode As String = SourceCodeItem(m, original";
_elcode = _sourcecodeitem(_m,_original);
 //BA.debugLineNum = 742;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 743;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 744;BA.debugLine="sb.Append(\"<pre>\")";
_sb.Append("<pre>");
 //BA.debugLineNum = 745;BA.debugLine="sb.Append(elCode)";
_sb.Append(_elcode);
 //BA.debugLineNum = 746;BA.debugLine="sb.Append(\"</pre>\")";
_sb.Append("</pre>");
 //BA.debugLineNum = 748;BA.debugLine="Dim scode As String = sb.tostring";
_scode = _sb.ToString();
 //BA.debugLineNum = 749;BA.debugLine="pg.Define(\"codeit\", CreateMap(\"template\":scode))";
_pg._define /*String*/ ("codeit",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("template"),(Object)(_scode)}));
 //BA.debugLineNum = 750;BA.debugLine="pg.Refresh(\"codeit\")";
_pg._refresh /*String*/ ("codeit");
 //BA.debugLineNum = 752;BA.debugLine="Dim v As String = m.Get(\"view\")";
_v = BA.ObjectToString(_m.Get((Object)("view")));
 //BA.debugLineNum = 753;BA.debugLine="Log(v)";
anywheresoftware.b4a.keywords.Common.Log(_v);
 //BA.debugLineNum = 754;BA.debugLine="If v <> \"form\" Then";
if ((_v).equals("form") == false) { 
 //BA.debugLineNum = 755;BA.debugLine="drawn = pg.UX(m)";
_drawn = _pg._ux /*com.ab.banano.BANanoObject*/ (_m);
 };
 //BA.debugLineNum = 757;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.Map  _temporaltext() throws Exception{
anywheresoftware.b4a.objects.collections.Map _t = null;
 //BA.debugLineNum = 1287;BA.debugLine="Sub TemporalText() As Map";
 //BA.debugLineNum = 1288;BA.debugLine="Dim t As Map = CreateMap()";
_t = new anywheresoftware.b4a.objects.collections.Map();
_t = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {});
 //BA.debugLineNum = 1289;BA.debugLine="t.Put(\"id\",\"text1\")";
_t.Put((Object)("id"),(Object)("text1"));
 //BA.debugLineNum = 1290;BA.debugLine="t.Put(\"localId\",\"text1\")";
_t.Put((Object)("localId"),(Object)("text1"));
 //BA.debugLineNum = 1291;BA.debugLine="t.Put(\"parentid\",\"form\")";
_t.Put((Object)("parentid"),(Object)("form"));
 //BA.debugLineNum = 1292;BA.debugLine="t.Put(\"addingmethod\",\"AddRows\")";
_t.Put((Object)("addingmethod"),(Object)("AddRows"));
 //BA.debugLineNum = 1293;BA.debugLine="t.Put(\"tabindex\",\"0\")";
_t.Put((Object)("tabindex"),(Object)("0"));
 //BA.debugLineNum = 1294;BA.debugLine="t.Put(\"view\",\"text\")";
_t.Put((Object)("view"),(Object)("text"));
 //BA.debugLineNum = 1295;BA.debugLine="t.Put(\"type\",\"text\")";
_t.Put((Object)("type"),(Object)("text"));
 //BA.debugLineNum = 1296;BA.debugLine="t.Put(\"inputAlign\",\"\")";
_t.Put((Object)("inputAlign"),(Object)(""));
 //BA.debugLineNum = 1297;BA.debugLine="t.Put(\"label\",\"Text 1\")";
_t.Put((Object)("label"),(Object)("Text 1"));
 //BA.debugLineNum = 1298;BA.debugLine="Return t";
if (true) return _t;
 //BA.debugLineNum = 1299;BA.debugLine="End Sub";
return null;
}
public static String  _testconnect() throws Exception{
anywheresoftware.b4a.objects.collections.Map _cm = null;
 //BA.debugLineNum = 127;BA.debugLine="Sub testconnect";
 //BA.debugLineNum = 129;BA.debugLine="Dim cm As Map = pg.GetValues(\"propbag\")";
_cm = new anywheresoftware.b4a.objects.collections.Map();
_cm = _pg._getvalues /*anywheresoftware.b4a.objects.collections.Map*/ ("propbag");
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return "";
}
public static String  _tree_clickwait(String _recid) throws Exception{
String _prefix = "";
String _suffix = "";
String _primarykey = "";
String _tcode = "";
String _ccode = "";
anywheresoftware.b4a.objects.collections.Map _formview = null;
String _v = "";
anywheresoftware.b4a.objects.collections.Map _m = null;
 //BA.debugLineNum = 759;BA.debugLine="Sub tree_clickwait(recid As String)";
 //BA.debugLineNum = 760;BA.debugLine="ClearPreviewIT";
_clearpreviewit();
 //BA.debugLineNum = 761;BA.debugLine="ClearCodeIT";
_clearcodeit();
 //BA.debugLineNum = 762;BA.debugLine="propBag.Clear";
_propbag._clear /*String*/ ();
 //BA.debugLineNum = 763;BA.debugLine="propBag.Refresh(pg)";
_propbag._refresh /*String*/ (_pg);
 //BA.debugLineNum = 764;BA.debugLine="pg.Hide(\"propadd\")";
_pg._hide /*String*/ ("propadd");
 //BA.debugLineNum = 765;BA.debugLine="Dim prefix As String = pg.MvField(recid,1,\".\")";
_prefix = _pg._mvfield /*String*/ (_recid,(int) (1),".");
 //BA.debugLineNum = 766;BA.debugLine="Dim suffix As String = pg.MvField(recid,2,\".\")";
_suffix = _pg._mvfield /*String*/ (_recid,(int) (2),".");
 //BA.debugLineNum = 767;BA.debugLine="pg.Hide(\"testconnect\")";
_pg._hide /*String*/ ("testconnect");
 //BA.debugLineNum = 768;BA.debugLine="pg.Hide(\"propadd\")";
_pg._hide /*String*/ ("propadd");
 //BA.debugLineNum = 769;BA.debugLine="pg.Hide(\"add_row\")";
_pg._hide /*String*/ ("add_row");
 //BA.debugLineNum = 770;BA.debugLine="pg.Hide(\"add_column\")";
_pg._hide /*String*/ ("add_column");
 //BA.debugLineNum = 771;BA.debugLine="Select Case prefix";
switch (BA.switchObjectToInt(_prefix,"field","table","connection","form")) {
case 0: {
 //BA.debugLineNum = 773;BA.debugLine="pg.Collapse(\"preview\")";
_pg._collapse /*String*/ ("preview");
 //BA.debugLineNum = 774;BA.debugLine="pg.Show(\"propadd\")";
_pg._show /*String*/ ("propadd");
 //BA.debugLineNum = 775;BA.debugLine="pg.Expand(\"code\")";
_pg._expand /*String*/ ("code");
 //BA.debugLineNum = 776;BA.debugLine="pg.show(\"propdelete\")";
_pg._show /*String*/ ("propdelete");
 //BA.debugLineNum = 777;BA.debugLine="dField.BuildBag(pg,propBag)";
_dfield._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 779;BA.debugLine="sqlite.Initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 780;BA.debugLine="sqlite.AddStrings(Array(\"key\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("key")}));
 //BA.debugLineNum = 781;BA.debugLine="qry = sqlite.Read(\"fields\",\"key\",recid)";
_qry = _sqlite._read /*String*/ ("fields","key",_recid);
 //BA.debugLineNum = 782;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\", C";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 783;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 784;BA.debugLine="If rs.result.Size = 0 Then";
if (_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
 }else {
 //BA.debugLineNum = 786;BA.debugLine="rec = rs.result.get(0)";
_rec.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0))));
 //BA.debugLineNum = 787;BA.debugLine="json = rec.Get(\"json\")";
_json = BA.ObjectToString(_rec.Get((Object)("json")));
 //BA.debugLineNum = 788;BA.debugLine="rec = pg.Json2Map(json)";
_rec = _pg._json2map /*anywheresoftware.b4a.objects.collections.Map*/ (_json);
 //BA.debugLineNum = 789;BA.debugLine="pg.SetValues(\"propbag\", rec)";
_pg._setvalues /*String*/ ("propbag",_rec);
 };
 break; }
case 1: {
 //BA.debugLineNum = 792;BA.debugLine="pg.Show(\"propadd\")";
_pg._show /*String*/ ("propadd");
 //BA.debugLineNum = 793;BA.debugLine="pg.Collapse(\"preview\")";
_pg._collapse /*String*/ ("preview");
 //BA.debugLineNum = 794;BA.debugLine="pg.Expand(\"code\")";
_pg._expand /*String*/ ("code");
 //BA.debugLineNum = 795;BA.debugLine="pg.show(\"propdelete\")";
_pg._show /*String*/ ("propdelete");
 //BA.debugLineNum = 796;BA.debugLine="dTable.BuildBag(pg,propBag)";
_dtable._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 798;BA.debugLine="sqlite.Initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 799;BA.debugLine="sqlite.AddStrings(Array(\"key\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("key")}));
 //BA.debugLineNum = 800;BA.debugLine="qry = sqlite.Read(\"tables\",\"key\",recid)";
_qry = _sqlite._read /*String*/ ("tables","key",_recid);
 //BA.debugLineNum = 801;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\", C";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 802;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 803;BA.debugLine="If rs.result.Size = 0 Then";
if (_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
 }else {
 //BA.debugLineNum = 805;BA.debugLine="rec = rs.result.get(0)";
_rec.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0))));
 //BA.debugLineNum = 806;BA.debugLine="json = rec.Get(\"json\")";
_json = BA.ObjectToString(_rec.Get((Object)("json")));
 //BA.debugLineNum = 807;BA.debugLine="rec = pg.Json2Map(json)";
_rec = _pg._json2map /*anywheresoftware.b4a.objects.collections.Map*/ (_json);
 //BA.debugLineNum = 808;BA.debugLine="pg.SetValues(\"propbag\", rec)";
_pg._setvalues /*String*/ ("propbag",_rec);
 //BA.debugLineNum = 809;BA.debugLine="Dim primarykey As String = rec.Get(\"primarykey\"";
_primarykey = BA.ObjectToString(_rec.Get((Object)("primarykey")));
 //BA.debugLineNum = 812;BA.debugLine="sqlite.initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 813;BA.debugLine="sqlite.AddStrings(Array(\"tablename\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("tablename")}));
 //BA.debugLineNum = 814;BA.debugLine="qry = sqlite.SelectWhere(\"fields\", Array(\"json\"";
_qry = _sqlite._selectwhere /*String*/ ("fields",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("json")}),anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("tablename"),(Object)(_suffix)}),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("value")}));
 //BA.debugLineNum = 815;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\",";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 816;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 818;BA.debugLine="Dim tcode As String = CreateTableCode(suffix,pr";
_tcode = _createtablecode(_suffix,_primarykey,_rs);
 //BA.debugLineNum = 819;BA.debugLine="SourceCodePreview(tcode)";
_sourcecodepreview(_tcode);
 };
 break; }
case 2: {
 //BA.debugLineNum = 822;BA.debugLine="pg.Show(\"propadd\")";
_pg._show /*String*/ ("propadd");
 //BA.debugLineNum = 823;BA.debugLine="pg.collapse(\"preview\")";
_pg._collapse /*String*/ ("preview");
 //BA.debugLineNum = 824;BA.debugLine="pg.Expand(\"code\")";
_pg._expand /*String*/ ("code");
 //BA.debugLineNum = 825;BA.debugLine="dConnection.BuildBag(pg, propBag)";
_dconnection._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 826;BA.debugLine="pg.Show(\"testconnect\")";
_pg._show /*String*/ ("testconnect");
 //BA.debugLineNum = 827;BA.debugLine="pg.Hide(\"propdelete\")";
_pg._hide /*String*/ ("propdelete");
 //BA.debugLineNum = 829;BA.debugLine="sqlite.Initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 831;BA.debugLine="sqlite.AddStrings(Array(\"id\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 832;BA.debugLine="qry = sqlite.Read(\"connect\",\"id\",\"connection\")";
_qry = _sqlite._read /*String*/ ("connect","id","connection");
 //BA.debugLineNum = 833;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\", C";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 834;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 835;BA.debugLine="If rs.result.Size = 0 Then";
if (_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
 }else {
 //BA.debugLineNum = 838;BA.debugLine="rec = rs.result.Get(0)";
_rec.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0))));
 //BA.debugLineNum = 839;BA.debugLine="json = rec.Get(\"json\")";
_json = BA.ObjectToString(_rec.Get((Object)("json")));
 //BA.debugLineNum = 840;BA.debugLine="rec = pg.Json2Map(json)";
_rec = _pg._json2map /*anywheresoftware.b4a.objects.collections.Map*/ (_json);
 //BA.debugLineNum = 841;BA.debugLine="pg.SetValues(\"propbag\",rec)";
_pg._setvalues /*String*/ ("propbag",_rec);
 //BA.debugLineNum = 843;BA.debugLine="Dim ccode As String = dConnection.ConnectionCod";
_ccode = _dconnection._connectioncode /*String*/ (_rec);
 //BA.debugLineNum = 844;BA.debugLine="SourceCodePreview(ccode)";
_sourcecodepreview(_ccode);
 };
 break; }
case 3: {
 //BA.debugLineNum = 847;BA.debugLine="pg.Show(\"add_row\")";
_pg._show /*String*/ ("add_row");
 //BA.debugLineNum = 848;BA.debugLine="pg.Show(\"add_column\")";
_pg._show /*String*/ ("add_column");
 //BA.debugLineNum = 849;BA.debugLine="pg.Show(\"propadd\")";
_pg._show /*String*/ ("propadd");
 //BA.debugLineNum = 850;BA.debugLine="pg.Hide(\"propdelete\")";
_pg._hide /*String*/ ("propdelete");
 //BA.debugLineNum = 851;BA.debugLine="pg.Expand(\"preview\")";
_pg._expand /*String*/ ("preview");
 //BA.debugLineNum = 853;BA.debugLine="dForm.BuildBag(pg, propBag)";
_dform._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 855;BA.debugLine="sqlite.Initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 856;BA.debugLine="sqlite.AddStrings(Array(\"id\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 857;BA.debugLine="qry = sqlite.SelectWhere(\"forms\", Array(\"*\"), Cr";
_qry = _sqlite._selectwhere /*String*/ ("forms",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("*")}),anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)("form")}),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 858;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\", C";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 859;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 860;BA.debugLine="If rs.result.Size = 0 Then";
if (_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
 }else {
 //BA.debugLineNum = 863;BA.debugLine="rec = rs.result.Get(0)";
_rec.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0))));
 //BA.debugLineNum = 864;BA.debugLine="json = rec.Get(\"json\")";
_json = BA.ObjectToString(_rec.Get((Object)("json")));
 //BA.debugLineNum = 865;BA.debugLine="rec = pg.Json2Map(json)";
_rec = _pg._json2map /*anywheresoftware.b4a.objects.collections.Map*/ (_json);
 //BA.debugLineNum = 866;BA.debugLine="pg.SetValues(\"propbag\", rec)";
_pg._setvalues /*String*/ ("propbag",_rec);
 };
 //BA.debugLineNum = 869;BA.debugLine="sqlite.Initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 870;BA.debugLine="sqlite.AddStrings(Array(\"id\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 871;BA.debugLine="qry = sqlite.SelectAll(\"items\", Array(\"*\"), Arra";
_qry = _sqlite._selectall /*String*/ ("items",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("*")}),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 872;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\", C";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 873;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 874;BA.debugLine="Dim formView As Map = CreateView(rec)";
_formview = new anywheresoftware.b4a.objects.collections.Map();
_formview = _createview(_rec);
 //BA.debugLineNum = 875;BA.debugLine="SourceCodePreview1(formView,rec)";
_sourcecodepreview1(_formview,_rec);
 break; }
default: {
 //BA.debugLineNum = 877;BA.debugLine="pg.Show(\"propadd\")";
_pg._show /*String*/ ("propadd");
 //BA.debugLineNum = 878;BA.debugLine="pg.Show(\"propdelete\")";
_pg._show /*String*/ ("propdelete");
 //BA.debugLineNum = 879;BA.debugLine="pg.Expand(\"preview\")";
_pg._expand /*String*/ ("preview");
 //BA.debugLineNum = 880;BA.debugLine="sqlite.Initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 881;BA.debugLine="sqlite.AddStrings(Array(\"id\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 882;BA.debugLine="qry = sqlite.SelectWhere(\"items\", Array(\"*\"), Cr";
_qry = _sqlite._selectwhere /*String*/ ("items",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("*")}),anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(_recid)}),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 883;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\", C";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 884;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 885;BA.debugLine="If rs.result.Size = 0 Then";
if (_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
 }else {
 //BA.debugLineNum = 888;BA.debugLine="rec = rs.result.Get(0)";
_rec.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0))));
 //BA.debugLineNum = 889;BA.debugLine="json = rec.get(\"json\")";
_json = BA.ObjectToString(_rec.Get((Object)("json")));
 //BA.debugLineNum = 890;BA.debugLine="rec = pg.Json2Map(json)";
_rec = _pg._json2map /*anywheresoftware.b4a.objects.collections.Map*/ (_json);
 //BA.debugLineNum = 891;BA.debugLine="Dim v As String = rec.get(\"view\")";
_v = BA.ObjectToString(_rec.Get((Object)("view")));
 //BA.debugLineNum = 892;BA.debugLine="v = pg.CStr(v)";
_v = _pg._cstr /*String*/ ((Object)(_v));
 //BA.debugLineNum = 893;BA.debugLine="If v = \"\" Or v = \"undefined\" Then";
if ((_v).equals("") || (_v).equals("undefined")) { 
 //BA.debugLineNum = 894;BA.debugLine="v = \"Element\"";
_v = "Element";
 //BA.debugLineNum = 895;BA.debugLine="rec.Put(\"view\", \"Element\")";
_rec.Put((Object)("view"),(Object)("Element"));
 };
 //BA.debugLineNum = 897;BA.debugLine="v = v.ToLowerCase";
_v = _v.toLowerCase();
 //BA.debugLineNum = 898;BA.debugLine="DrawPropBag(v)";
_drawpropbag(_v);
 //BA.debugLineNum = 899;BA.debugLine="pg.SetValues(\"propbag\", rec)";
_pg._setvalues /*String*/ ("propbag",_rec);
 //BA.debugLineNum = 900;BA.debugLine="Dim m As Map = CreateView(rec)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = _createview(_rec);
 //BA.debugLineNum = 901;BA.debugLine="SourceCodePreview1(m,rec)";
_sourcecodepreview1(_m,_rec);
 };
 break; }
}
;
 //BA.debugLineNum = 904;BA.debugLine="End Sub";
return "";
}
}
