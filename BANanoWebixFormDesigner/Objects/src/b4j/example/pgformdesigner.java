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
public static com.ab.banano.BANanoObject _fldwin = null;
public static String _lastcode = "";
public static b4j.example.main _main = null;
public static b4j.example.modcenter _modcenter = null;
public static b4j.example.dbutton _dbutton = null;
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
 //BA.debugLineNum = 112;BA.debugLine="Sub add_column";
 //BA.debugLineNum = 113;BA.debugLine="sidebar_click(\"column\")";
_sidebar_click("column");
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return "";
}
public static String  _add_fields() throws Exception{
String _parentid = "";
String _prefix = "";
 //BA.debugLineNum = 1616;BA.debugLine="Sub add_fields";
 //BA.debugLineNum = 1618;BA.debugLine="Dim parentid As String = pg.GetSelectedID(\"tree\")";
_parentid = BA.ObjectToString(_pg._getselectedid /*b4j.example.wixpage._wixselectedid*/ ("tree"));
 //BA.debugLineNum = 1619;BA.debugLine="If parentid = \"\" Then";
if ((_parentid).equals("")) { 
 //BA.debugLineNum = 1620;BA.debugLine="pg.Message_Error(\"Please select the parent from";
_pg._message_error /*String*/ ("Please select the parent from the tree first to add things to.");
 //BA.debugLineNum = 1621;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 1623;BA.debugLine="Dim prefix As String = pg.MvField(parentid,1,\".\")";
_prefix = _pg._mvfield /*String*/ (_parentid,(int) (1),".");
 //BA.debugLineNum = 1624;BA.debugLine="Select Case prefix";
switch (BA.switchObjectToInt(_prefix,"table","connection","form")) {
case 0: 
case 1: {
 //BA.debugLineNum = 1626;BA.debugLine="pg.boShow(CreateWindowFields)";
_pg._boshow /*String*/ (_createwindowfields());
 break; }
case 2: {
 //BA.debugLineNum = 1628;BA.debugLine="pg.BOShow(CreateWindow)";
_pg._boshow /*String*/ (_createwindow());
 break; }
}
;
 //BA.debugLineNum = 1630;BA.debugLine="End Sub";
return "";
}
public static String  _add_row() throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Sub add_row";
 //BA.debugLineNum = 109;BA.debugLine="sidebar_click(\"row\")";
_sidebar_click("row");
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 204;BA.debugLine="Sub AddPrimaryKey";
 //BA.debugLineNum = 205;BA.debugLine="Dim tb As Map = pg.GetValues(\"propbag\")";
_tb = new anywheresoftware.b4a.objects.collections.Map();
_tb = _pg._getvalues /*anywheresoftware.b4a.objects.collections.Map*/ ("propbag");
 //BA.debugLineNum = 206;BA.debugLine="Dim tbname As String = tb.GetDefault(\"value\",\"\")";
_tbname = BA.ObjectToString(_tb.GetDefault((Object)("value"),(Object)("")));
 //BA.debugLineNum = 207;BA.debugLine="Dim pk As String = tb.GetDefault(\"primarykey\",\"\")";
_pk = BA.ObjectToString(_tb.GetDefault((Object)("primarykey"),(Object)("")));
 //BA.debugLineNum = 208;BA.debugLine="Dim ft As String = tb.GetDefault(\"type\",\"\")";
_ft = BA.ObjectToString(_tb.GetDefault((Object)("type"),(Object)("")));
 //BA.debugLineNum = 210;BA.debugLine="Dim k As String = $\"field.${tbname}.${pk}\"$";
_k = ("field."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tbname))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_pk))+"");
 //BA.debugLineNum = 212;BA.debugLine="Dim nf As Map = CreateMap()";
_nf = new anywheresoftware.b4a.objects.collections.Map();
_nf = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {});
 //BA.debugLineNum = 213;BA.debugLine="nf.Put(\"key\", k)";
_nf.Put((Object)("key"),(Object)(_k));
 //BA.debugLineNum = 214;BA.debugLine="nf.put(\"id\", \"field\")";
_nf.Put((Object)("id"),(Object)("field"));
 //BA.debugLineNum = 215;BA.debugLine="nf.put(\"tablename\", tbname)";
_nf.Put((Object)("tablename"),(Object)(_tbname));
 //BA.debugLineNum = 216;BA.debugLine="nf.Put(\"value\", pk)";
_nf.Put((Object)("value"),(Object)(_pk));
 //BA.debugLineNum = 218;BA.debugLine="Dim jsonm As Map = CreateMap()";
_jsonm = new anywheresoftware.b4a.objects.collections.Map();
_jsonm = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {});
 //BA.debugLineNum = 219;BA.debugLine="jsonm.Put(\"type\", ft)";
_jsonm.Put((Object)("type"),(Object)(_ft));
 //BA.debugLineNum = 220;BA.debugLine="jsonm.Put(\"length\", \"20\")";
_jsonm.Put((Object)("length"),(Object)("20"));
 //BA.debugLineNum = 221;BA.debugLine="jsonm.put(\"id\", \"field\")";
_jsonm.Put((Object)("id"),(Object)("field"));
 //BA.debugLineNum = 222;BA.debugLine="jsonm.put(\"tablename\", tbname)";
_jsonm.Put((Object)("tablename"),(Object)(_tbname));
 //BA.debugLineNum = 223;BA.debugLine="jsonm.Put(\"value\", pk)";
_jsonm.Put((Object)("value"),(Object)(_pk));
 //BA.debugLineNum = 225;BA.debugLine="Dim json As String = pg.Map2Json(jsonm)";
_json = _pg._map2json /*String*/ (_jsonm);
 //BA.debugLineNum = 226;BA.debugLine="nf.Put(\"json\", json)";
_nf.Put((Object)("json"),(Object)(_json));
 //BA.debugLineNum = 229;BA.debugLine="sqlite.Initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 230;BA.debugLine="sqlite.AddStrings(Array(\"id\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 232;BA.debugLine="qry = sqlite.InsertReplace(\"fields\", nf)";
_qry = _sqlite._insertreplace /*String*/ ("fields",_nf);
 //BA.debugLineNum = 233;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\", Cr";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 235;BA.debugLine="sqlite.initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 236;BA.debugLine="sqlite.AddStrings(Array(\"id\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 237;BA.debugLine="qry = sqlite.Exists(\"fields\", \"key\", k)";
_qry = _sqlite._exists /*String*/ ("fields","key",_k);
 //BA.debugLineNum = 238;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\", Cr";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 239;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 240;BA.debugLine="pg.Message(rs.result.size & \" record(s) affected!";
_pg._message /*String*/ (BA.NumberToString(_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" record(s) affected!");
 //BA.debugLineNum = 241;BA.debugLine="End Sub";
return "";
}
public static String  _btnmulti_click() throws Exception{
String _parentid = "";
boolean _fvalid = false;
String _scontrols = "";
String[] _controls = null;
int _tbindex = 0;
String _ctrl = "";
anywheresoftware.b4a.objects.collections.Map _newctrl = null;
 //BA.debugLineNum = 1439;BA.debugLine="Sub btnMulti_click";
 //BA.debugLineNum = 1441;BA.debugLine="Dim parentid As String = pg.GetSelectedID(\"tree\")";
_parentid = BA.ObjectToString(_pg._getselectedid /*b4j.example.wixpage._wixselectedid*/ ("tree"));
 //BA.debugLineNum = 1442;BA.debugLine="If parentid = \"\" Then";
if ((_parentid).equals("")) { 
 //BA.debugLineNum = 1443;BA.debugLine="pg.Message_Error(\"Please select the parent item";
_pg._message_error /*String*/ ("Please select the parent item from the tree first, then select the element you want to add! Remember to click Save in the property bag when done.");
 //BA.debugLineNum = 1444;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 1447;BA.debugLine="Dim fValid As Boolean = pg.Validate(\"frmx\")";
_fvalid = _pg._validate /*boolean*/ ("frmx");
 //BA.debugLineNum = 1448;BA.debugLine="If fValid = False Then";
if (_fvalid==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 1449;BA.debugLine="pg.Message_Error(\"No elements have been entered!";
_pg._message_error /*String*/ ("No elements have been entered!");
 //BA.debugLineNum = 1450;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 1453;BA.debugLine="Dim scontrols As String = pg.GetValue(\"txtmultipl";
_scontrols = _pg._getvalue /*String*/ ("txtmultiplecontrols");
 //BA.debugLineNum = 1454;BA.debugLine="scontrols = scontrols.trim";
_scontrols = _scontrols.trim();
 //BA.debugLineNum = 1457;BA.debugLine="Dim controls() As String = BANano.Split(\",\", scon";
_controls = _banano.Split(",",_scontrols);
 //BA.debugLineNum = 1458;BA.debugLine="Dim tbindex As Int = 0";
_tbindex = (int) (0);
 //BA.debugLineNum = 1459;BA.debugLine="For Each ctrl As String In controls";
{
final String[] group15 = _controls;
final int groupLen15 = group15.length
;int index15 = 0;
;
for (; index15 < groupLen15;index15++){
_ctrl = group15[index15];
 //BA.debugLineNum = 1460;BA.debugLine="tbindex = tbindex + 1";
_tbindex = (int) (_tbindex+1);
 //BA.debugLineNum = 1461;BA.debugLine="ctrl = ctrl.Trim";
_ctrl = _ctrl.trim();
 //BA.debugLineNum = 1462;BA.debugLine="If ctrl <> \"\" Then";
if ((_ctrl).equals("") == false) { 
 //BA.debugLineNum = 1463;BA.debugLine="ctrl = ctrl.ToLowerCase";
_ctrl = _ctrl.toLowerCase();
 //BA.debugLineNum = 1464;BA.debugLine="Dim newctrl As Map = TemporalText";
_newctrl = new anywheresoftware.b4a.objects.collections.Map();
_newctrl = _temporaltext();
 //BA.debugLineNum = 1465;BA.debugLine="newctrl.Put(\"id\", ctrl)";
_newctrl.Put((Object)("id"),(Object)(_ctrl));
 //BA.debugLineNum = 1466;BA.debugLine="newctrl.Put(\"parentid\", parentid)";
_newctrl.Put((Object)("parentid"),(Object)(_parentid));
 //BA.debugLineNum = 1467;BA.debugLine="newctrl.Put(\"name\", ctrl)";
_newctrl.Put((Object)("name"),(Object)(_ctrl));
 //BA.debugLineNum = 1468;BA.debugLine="newctrl.Put(\"tabindex\",tbindex)";
_newctrl.Put((Object)("tabindex"),(Object)(_tbindex));
 //BA.debugLineNum = 1469;BA.debugLine="newctrl.Put(\"label\",ctrl)";
_newctrl.Put((Object)("label"),(Object)(_ctrl));
 //BA.debugLineNum = 1471;BA.debugLine="Dim json As String = pg.Map2Json(newctrl)";
_json = _pg._map2json /*String*/ (_newctrl);
 //BA.debugLineNum = 1474;BA.debugLine="sqlite.Initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 1475;BA.debugLine="sqlite.AddStrings(Array(\"id\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 1476;BA.debugLine="Dim rec As Map = CreateMap()";
_rec = new anywheresoftware.b4a.objects.collections.Map();
_rec = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {});
 //BA.debugLineNum = 1477;BA.debugLine="rec.Put(\"id\", ctrl)";
_rec.Put((Object)("id"),(Object)(_ctrl));
 //BA.debugLineNum = 1478;BA.debugLine="rec.put(\"json\", json)";
_rec.Put((Object)("json"),(Object)(_json));
 //BA.debugLineNum = 1479;BA.debugLine="rec.Put(\"tabindex\", tbindex)";
_rec.Put((Object)("tabindex"),(Object)(_tbindex));
 //BA.debugLineNum = 1480;BA.debugLine="rec.Put(\"parentid\", parentid)";
_rec.Put((Object)("parentid"),(Object)(_parentid));
 //BA.debugLineNum = 1481;BA.debugLine="qry = sqlite.Insert(\"items\", rec)";
_qry = _sqlite._insert /*String*/ ("items",_rec);
 //BA.debugLineNum = 1482;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\",";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 1483;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 1484;BA.debugLine="pg.Message_Success(rs.result.size & \" record(s)";
_pg._message_success /*String*/ (BA.NumberToString(_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" record(s) affected!");
 };
 }
};
 //BA.debugLineNum = 1487;BA.debugLine="pg.BoClose(winux)";
_pg._boclose /*String*/ (_winux);
 //BA.debugLineNum = 1488;BA.debugLine="RefreshTreeWait";
_refreshtreewait();
 //BA.debugLineNum = 1489;BA.debugLine="End Sub";
return "";
}
public static String  _btnmulti1_click() throws Exception{
String _parentid = "";
boolean _fvalid = false;
String _scontrols = "";
String _sprefix = "";
String _suffix = "";
String[] _controls = null;
String _ctrl = "";
anywheresoftware.b4a.objects.collections.Map _ntbl = null;
String _k = "";
 //BA.debugLineNum = 1491;BA.debugLine="Sub btnMulti1_click";
 //BA.debugLineNum = 1493;BA.debugLine="Dim parentid As String = pg.GetSelectedID(\"tree\")";
_parentid = BA.ObjectToString(_pg._getselectedid /*b4j.example.wixpage._wixselectedid*/ ("tree"));
 //BA.debugLineNum = 1494;BA.debugLine="If parentid = \"\" Then";
if ((_parentid).equals("")) { 
 //BA.debugLineNum = 1495;BA.debugLine="pg.Message_Error(\"Please select the parent item";
_pg._message_error /*String*/ ("Please select the parent item from the tree first!");
 //BA.debugLineNum = 1496;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 1499;BA.debugLine="Dim fValid As Boolean = pg.Validate(\"frmy\")";
_fvalid = _pg._validate /*boolean*/ ("frmy");
 //BA.debugLineNum = 1500;BA.debugLine="If fValid = False Then";
if (_fvalid==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 1501;BA.debugLine="pg.Message_Error(\"No things have been entered!\")";
_pg._message_error /*String*/ ("No things have been entered!");
 //BA.debugLineNum = 1502;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 1505;BA.debugLine="Dim scontrols As String = pg.GetValue(\"txtmultipl";
_scontrols = _pg._getvalue /*String*/ ("txtmultiplefields");
 //BA.debugLineNum = 1506;BA.debugLine="scontrols = scontrols.trim";
_scontrols = _scontrols.trim();
 //BA.debugLineNum = 1508;BA.debugLine="Dim sprefix As String = pg.MvField(parentid,1,\".\"";
_sprefix = _pg._mvfield /*String*/ (_parentid,(int) (1),".");
 //BA.debugLineNum = 1509;BA.debugLine="Dim suffix As String = pg.MvField(parentid,2,\".\")";
_suffix = _pg._mvfield /*String*/ (_parentid,(int) (2),".");
 //BA.debugLineNum = 1510;BA.debugLine="Select Case sprefix";
switch (BA.switchObjectToInt(_sprefix,"connection","table")) {
case 0: {
 //BA.debugLineNum = 1513;BA.debugLine="Dim controls() As String = BANano.Split(\",\", sco";
_controls = _banano.Split(",",_scontrols);
 //BA.debugLineNum = 1514;BA.debugLine="For Each ctrl As String In controls";
{
final String[] group18 = _controls;
final int groupLen18 = group18.length
;int index18 = 0;
;
for (; index18 < groupLen18;index18++){
_ctrl = group18[index18];
 //BA.debugLineNum = 1515;BA.debugLine="ctrl = ctrl.Trim";
_ctrl = _ctrl.trim();
 //BA.debugLineNum = 1516;BA.debugLine="If ctrl <> \"\" Then";
if ((_ctrl).equals("") == false) { 
 //BA.debugLineNum = 1517;BA.debugLine="ctrl = ctrl.ToLowerCase";
_ctrl = _ctrl.toLowerCase();
 //BA.debugLineNum = 1518;BA.debugLine="Dim ntbl As Map = CreateMap()";
_ntbl = new anywheresoftware.b4a.objects.collections.Map();
_ntbl = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {});
 //BA.debugLineNum = 1519;BA.debugLine="ntbl.Put(\"id\", \"table\")";
_ntbl.Put((Object)("id"),(Object)("table"));
 //BA.debugLineNum = 1520;BA.debugLine="ntbl.Put(\"value\", ctrl)";
_ntbl.Put((Object)("value"),(Object)(_ctrl));
 //BA.debugLineNum = 1521;BA.debugLine="ntbl.Put(\"primarykey\", \"id\")";
_ntbl.Put((Object)("primarykey"),(Object)("id"));
 //BA.debugLineNum = 1522;BA.debugLine="ntbl.put(\"type\", \"INT\")";
_ntbl.Put((Object)("type"),(Object)("INT"));
 //BA.debugLineNum = 1523;BA.debugLine="ntbl.Put(\"autoincrement\", False)";
_ntbl.Put((Object)("autoincrement"),(Object)(anywheresoftware.b4a.keywords.Common.False));
 //BA.debugLineNum = 1524;BA.debugLine="Dim k As String = $\"table.${ctrl}\"$";
_k = ("table."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_ctrl))+"");
 //BA.debugLineNum = 1526;BA.debugLine="Dim json As String = pg.Map2Json(ntbl)";
_json = _pg._map2json /*String*/ (_ntbl);
 //BA.debugLineNum = 1528;BA.debugLine="sqlite.Initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 1529;BA.debugLine="sqlite.AddStrings(Array(\"id\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 1530;BA.debugLine="Dim rec As Map = CreateMap()";
_rec = new anywheresoftware.b4a.objects.collections.Map();
_rec = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {});
 //BA.debugLineNum = 1531;BA.debugLine="rec.Put(\"id\", \"table\")";
_rec.Put((Object)("id"),(Object)("table"));
 //BA.debugLineNum = 1532;BA.debugLine="rec.put(\"value\", ctrl)";
_rec.Put((Object)("value"),(Object)(_ctrl));
 //BA.debugLineNum = 1533;BA.debugLine="rec.put(\"json\", json)";
_rec.Put((Object)("json"),(Object)(_json));
 //BA.debugLineNum = 1534;BA.debugLine="rec.Put(\"key\", k)";
_rec.Put((Object)("key"),(Object)(_k));
 //BA.debugLineNum = 1535;BA.debugLine="qry = sqlite.Insert(\"tables\", rec)";
_qry = _sqlite._insert /*String*/ ("tables",_rec);
 //BA.debugLineNum = 1536;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\",";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 1537;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 };
 }
};
 break; }
case 1: {
 //BA.debugLineNum = 1543;BA.debugLine="Dim controls() As String = BANano.Split(\",\", sco";
_controls = _banano.Split(",",_scontrols);
 //BA.debugLineNum = 1544;BA.debugLine="For Each ctrl As String In controls";
{
final String[] group44 = _controls;
final int groupLen44 = group44.length
;int index44 = 0;
;
for (; index44 < groupLen44;index44++){
_ctrl = group44[index44];
 //BA.debugLineNum = 1545;BA.debugLine="ctrl = ctrl.Trim";
_ctrl = _ctrl.trim();
 //BA.debugLineNum = 1546;BA.debugLine="If ctrl <> \"\" Then";
if ((_ctrl).equals("") == false) { 
 //BA.debugLineNum = 1547;BA.debugLine="ctrl = ctrl.ToLowerCase";
_ctrl = _ctrl.toLowerCase();
 //BA.debugLineNum = 1548;BA.debugLine="Dim k As String = $\"field.${suffix}.${ctrl}\"$";
_k = ("field."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_suffix))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_ctrl))+"");
 //BA.debugLineNum = 1549;BA.debugLine="Dim ntbl As Map = CreateMap()";
_ntbl = new anywheresoftware.b4a.objects.collections.Map();
_ntbl = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {});
 //BA.debugLineNum = 1550;BA.debugLine="ntbl.Put(\"id\", \"field\")";
_ntbl.Put((Object)("id"),(Object)("field"));
 //BA.debugLineNum = 1551;BA.debugLine="ntbl.Put(\"value\", ctrl)";
_ntbl.Put((Object)("value"),(Object)(_ctrl));
 //BA.debugLineNum = 1552;BA.debugLine="ntbl.Put(\"tablename\", suffix)";
_ntbl.Put((Object)("tablename"),(Object)(_suffix));
 //BA.debugLineNum = 1553;BA.debugLine="ntbl.Put(\"key\", k)";
_ntbl.Put((Object)("key"),(Object)(_k));
 //BA.debugLineNum = 1554;BA.debugLine="ntbl.Put(\"type\",\"STRING\")";
_ntbl.Put((Object)("type"),(Object)("STRING"));
 //BA.debugLineNum = 1555;BA.debugLine="ntbl.Put(\"length\",20)";
_ntbl.Put((Object)("length"),(Object)(20));
 //BA.debugLineNum = 1557;BA.debugLine="Dim json As String = pg.Map2Json(ntbl)";
_json = _pg._map2json /*String*/ (_ntbl);
 //BA.debugLineNum = 1559;BA.debugLine="sqlite.Initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 1560;BA.debugLine="sqlite.AddStrings(Array(\"id\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 1561;BA.debugLine="Dim rec As Map = CreateMap()";
_rec = new anywheresoftware.b4a.objects.collections.Map();
_rec = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {});
 //BA.debugLineNum = 1562;BA.debugLine="rec.Put(\"id\", \"field\")";
_rec.Put((Object)("id"),(Object)("field"));
 //BA.debugLineNum = 1563;BA.debugLine="rec.put(\"tablename\", suffix)";
_rec.Put((Object)("tablename"),(Object)(_suffix));
 //BA.debugLineNum = 1564;BA.debugLine="rec.put(\"value\", ctrl)";
_rec.Put((Object)("value"),(Object)(_ctrl));
 //BA.debugLineNum = 1565;BA.debugLine="rec.put(\"json\", json)";
_rec.Put((Object)("json"),(Object)(_json));
 //BA.debugLineNum = 1566;BA.debugLine="rec.Put(\"key\", k)";
_rec.Put((Object)("key"),(Object)(_k));
 //BA.debugLineNum = 1567;BA.debugLine="qry = sqlite.Insert(\"fields\", rec)";
_qry = _sqlite._insert /*String*/ ("fields",_rec);
 //BA.debugLineNum = 1568;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\",";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 1569;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 };
 }
};
 break; }
}
;
 //BA.debugLineNum = 1573;BA.debugLine="pg.BoClose(fldWin)";
_pg._boclose /*String*/ (_fldwin);
 //BA.debugLineNum = 1574;BA.debugLine="RefreshTreeWait";
_refreshtreewait();
 //BA.debugLineNum = 1575;BA.debugLine="End Sub";
return "";
}
public static String  _capitalize(String _t) throws Exception{
String _s = "";
String _r = "";
String _o = "";
 //BA.debugLineNum = 745;BA.debugLine="Sub Capitalize(t As String) As String";
 //BA.debugLineNum = 746;BA.debugLine="Dim s , r , o As String";
_s = "";
_r = "";
_o = "";
 //BA.debugLineNum = 747;BA.debugLine="s = t.SubString2(0,1)";
_s = _t.substring((int) (0),(int) (1));
 //BA.debugLineNum = 748;BA.debugLine="r = t.SubString2(1, t.Length)";
_r = _t.substring((int) (1),_t.length());
 //BA.debugLineNum = 749;BA.debugLine="o = s.ToUpperCase & r";
_o = _s.toUpperCase()+_r;
 //BA.debugLineNum = 750;BA.debugLine="Return o";
if (true) return _o;
 //BA.debugLineNum = 751;BA.debugLine="End Sub";
return "";
}
public static String  _clearcodeit() throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt1 = null;
 //BA.debugLineNum = 145;BA.debugLine="Sub ClearCodeIT";
 //BA.debugLineNum = 146;BA.debugLine="Dim opt1 As Map = CreateMap(\"template\": \"No code\"";
_opt1 = new anywheresoftware.b4a.objects.collections.Map();
_opt1 = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("template"),(Object)("No code")});
 //BA.debugLineNum = 147;BA.debugLine="pg.Define(\"codeit\", opt1)";
_pg._define /*String*/ ("codeit",_opt1);
 //BA.debugLineNum = 148;BA.debugLine="pg.Refresh(\"codeit\")";
_pg._refresh /*String*/ ("codeit");
 //BA.debugLineNum = 149;BA.debugLine="End Sub";
return "";
}
public static String  _clearform() throws Exception{
boolean _confirmresult = false;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 567;BA.debugLine="Sub clearform";
 //BA.debugLineNum = 568;BA.debugLine="Dim confirmresult As Boolean = False";
_confirmresult = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 569;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Me,\"clea";
_cb = (com.ab.banano.BANanoObject)(_banano.CallBack(pgformdesigner.getObject(),"clearform1wait",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_confirmresult)})));
 //BA.debugLineNum = 570;BA.debugLine="pg.Confirm(cb, \"Confirm Delete\", \"Are you sure th";
_pg._confirm /*String*/ (_cb,"Confirm Delete","Are you sure that you want to clear this form? You will not be able to undo your changes. Continue?");
 //BA.debugLineNum = 571;BA.debugLine="End Sub";
return "";
}
public static String  _clearform1wait(boolean _confirmresult) throws Exception{
 //BA.debugLineNum = 573;BA.debugLine="Sub clearform1wait(confirmresult As Boolean)";
 //BA.debugLineNum = 574;BA.debugLine="If confirmresult = False Then Return";
if (_confirmresult==anywheresoftware.b4a.keywords.Common.False) { 
if (true) return "";};
 //BA.debugLineNum = 575;BA.debugLine="sqlite.Initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 576;BA.debugLine="sqlite.AddStrings(Array(\"id\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 577;BA.debugLine="qry = sqlite.DeleteAll(\"items\")";
_qry = _sqlite._deleteall /*String*/ ("items");
 //BA.debugLineNum = 578;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\", Cr";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 579;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 580;BA.debugLine="pg.Message_Success(rs.result.size & \" record(s) a";
_pg._message_success /*String*/ (BA.NumberToString(_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" record(s) affected!");
 //BA.debugLineNum = 581;BA.debugLine="refreshapp";
_refreshapp();
 //BA.debugLineNum = 582;BA.debugLine="End Sub";
return "";
}
public static String  _clearpreviewit() throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 137;BA.debugLine="Sub ClearPreviewIT";
 //BA.debugLineNum = 138;BA.debugLine="Dim div As UOENowHTML";
_div = new b4j.example.uoenowhtml();
 //BA.debugLineNum = 139;BA.debugLine="div.Initialize(\"previewit\",\"div\").SetStyle(\"width";
_div._initialize /*b4j.example.uoenowhtml*/ (ba,"previewit","div")._setstyle /*b4j.example.uoenowhtml*/ ("width","100%")._setstyle /*b4j.example.uoenowhtml*/ ("height","100%");
 //BA.debugLineNum = 140;BA.debugLine="Dim opt As Map = CreateMap(\"template\": div.html)";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("template"),(Object)(_div._html /*String*/ ())});
 //BA.debugLineNum = 141;BA.debugLine="pg.Define(\"previewit\", opt)";
_pg._define /*String*/ ("previewit",_opt);
 //BA.debugLineNum = 142;BA.debugLine="pg.Refresh(\"previewit\")";
_pg._refresh /*String*/ ("previewit");
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return "";
}
public static String  _closewin() throws Exception{
 //BA.debugLineNum = 1607;BA.debugLine="Sub closeWin";
 //BA.debugLineNum = 1608;BA.debugLine="pg.boClose(winux)";
_pg._boclose /*String*/ (_winux);
 //BA.debugLineNum = 1609;BA.debugLine="End Sub";
return "";
}
public static String  _closewin1() throws Exception{
 //BA.debugLineNum = 1611;BA.debugLine="Sub closeWin1";
 //BA.debugLineNum = 1612;BA.debugLine="pg.boClose(fldWin)";
_pg._boclose /*String*/ (_fldwin);
 //BA.debugLineNum = 1613;BA.debugLine="End Sub";
return "";
}
public static String  _collab() throws Exception{
Object _theobject = null;
boolean _isonline = false;
 //BA.debugLineNum = 1068;BA.debugLine="Sub collab";
 //BA.debugLineNum = 1069;BA.debugLine="Dim theObject As Object = Sender";
_theobject = anywheresoftware.b4a.keywords.Common.Sender(ba);
 //BA.debugLineNum = 1070;BA.debugLine="Dim isonline As Boolean = BANano.CheckInternetCon";
_isonline = _banano.CheckInternetConnectionWait();
 //BA.debugLineNum = 1071;BA.debugLine="If isonline Then";
if (_isonline) { 
 //BA.debugLineNum = 1072;BA.debugLine="BANano.RunJavascriptMethod(\"TogetherJS\", Array(t";
_banano.RunJavascriptMethod("TogetherJS",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_theobject}));
 }else {
 //BA.debugLineNum = 1074;BA.debugLine="pg.Message_Debug(\"You dont appear to be connecte";
_pg._message_debug /*String*/ ("You dont appear to be connected to the interweb!");
 };
 //BA.debugLineNum = 1076;BA.debugLine="End Sub";
return "";
}
public static String  _createtablecode(String _tblname,String _prikey,b4j.example.bananosqlite._sqliteresultset _rsx) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.objects.collections.Map _fldmap = null;
anywheresoftware.b4a.objects.collections.Map _fmap = null;
String _fldname = "";
String _fldtype = "";
String _fldleng = "";
 //BA.debugLineNum = 243;BA.debugLine="Sub CreateTableCode(tblName As String, priKey As S";
 //BA.debugLineNum = 244;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 245;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 246;BA.debugLine="sb.append(\"'Copy this code to Main.BANano_Ready\")";
_sb.Append("'Copy this code to Main.BANano_Ready").Append(anywheresoftware.b4a.keywords.Common.CRLF).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 247;BA.debugLine="sb.Append(\"'create the table\").Append(CRLF)";
_sb.Append("'create the table").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 248;BA.debugLine="sb.append(\"Dim newTable As Map = CreateMap()\").Ap";
_sb.Append("Dim newTable As Map = CreateMap()").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 250;BA.debugLine="For Each fldmap As Map In rsx.result";
_fldmap = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group6 = _rsx.result /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_fldmap.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group6.Get(index6)));
 //BA.debugLineNum = 251;BA.debugLine="Dim json As String = fldmap.Get(\"json\")";
_json = BA.ObjectToString(_fldmap.Get((Object)("json")));
 //BA.debugLineNum = 252;BA.debugLine="Dim fmap As Map = pg.Json2Map(json)";
_fmap = new anywheresoftware.b4a.objects.collections.Map();
_fmap = _pg._json2map /*anywheresoftware.b4a.objects.collections.Map*/ (_json);
 //BA.debugLineNum = 253;BA.debugLine="Dim fldname As String = fmap.Get(\"value\")";
_fldname = BA.ObjectToString(_fmap.Get((Object)("value")));
 //BA.debugLineNum = 254;BA.debugLine="Dim fldtype As String = fmap.Get(\"type\")";
_fldtype = BA.ObjectToString(_fmap.Get((Object)("type")));
 //BA.debugLineNum = 255;BA.debugLine="Dim fldLeng As String = fmap.get(\"length\")";
_fldleng = BA.ObjectToString(_fmap.Get((Object)("length")));
 //BA.debugLineNum = 257;BA.debugLine="sb.Append($\"newTable.put(\"${fldname}\",\"${fldtype";
_sb.Append(("newTable.put(\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_fldname))+"\",\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_fldtype))+"\")")).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 }
};
 //BA.debugLineNum = 259;BA.debugLine="sb.append(CRLF)";
_sb.Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 260;BA.debugLine="sb.append(\"'initialize the helper class\").Append(";
_sb.Append("'initialize the helper class").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 261;BA.debugLine="sb.Append(\"Dim alaSQL As BANanoAlaSQL\").append(CR";
_sb.Append("Dim alaSQL As BANanoAlaSQL").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 262;BA.debugLine="sb.append(\"alaSQL.Initialize\").append(CRLF)";
_sb.Append("alaSQL.Initialize").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 263;BA.debugLine="sb.Append(\"'generate the create table sql\").Appen";
_sb.Append("'generate the create table sql").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 264;BA.debugLine="sb.Append($\"Dim rs As AlaSQLResultSet = alaSQL.Cr";
_sb.Append(("Dim rs As AlaSQLResultSet = alaSQL.CreateTable(\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tblname))+"\", newTable, \""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_prikey))+"\")")).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 265;BA.debugLine="sb.append(\"'execute the create table command\").Ap";
_sb.Append("'execute the create table command").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 266;BA.debugLine="sb.append($\"rs.Result = db.ExecuteWait(rs.query,";
_sb.Append(("rs.Result = db.ExecuteWait(rs.query, rs.args)")).Append(anywheresoftware.b4a.keywords.Common.CRLF).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 268;BA.debugLine="sb.Append(\"'This code should be copied to your mo";
_sb.Append("'This code should be copied to your modules for CRUD").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 270;BA.debugLine="sb.Append(\"'NEW\").Append(CRLF)";
_sb.Append("'NEW").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 271;BA.debugLine="sb.Append(\"Sub btnnew_click\").Append(CRLF)";
_sb.Append("Sub btnnew_click").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 272;BA.debugLine="sb.Append(\"'clear the contents of the form\").Appe";
_sb.Append("'clear the contents of the form").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 273;BA.debugLine="sb.append($\"pg.Clear(\"form\")\"$).Append(CRLF)";
_sb.Append(("pg.Clear(\"form\")")).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 274;BA.debugLine="sb.Append(\"End Sub\").Append(CRLF).append(CRLF)";
_sb.Append("End Sub").Append(anywheresoftware.b4a.keywords.Common.CRLF).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 276;BA.debugLine="sb.Append(\"'CREATE\").Append(CRLF)";
_sb.Append("'CREATE").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 277;BA.debugLine="sb.Append(\"Sub btninsert_click\").Append(CRLF)";
_sb.Append("Sub btninsert_click").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 278;BA.debugLine="sb.Append(\"'lets validate the form\").Append(CRLF)";
_sb.Append("'lets validate the form").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 279;BA.debugLine="sb.append($\"Dim bValid As Boolean = pg.Validate(\"";
_sb.Append(("Dim bValid As Boolean = pg.Validate(\"form\")")).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 280;BA.debugLine="sb.append(\"if bValid = False Then Return\").Append";
_sb.Append("if bValid = False Then Return").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 281;BA.debugLine="sb.Append(\"'insert record to table\").Append(CRLF)";
_sb.Append("'insert record to table").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 282;BA.debugLine="sb.Append(\"Dim alaSQL As BANanoAlaSQL\").append(CR";
_sb.Append("Dim alaSQL As BANanoAlaSQL").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 283;BA.debugLine="sb.Append(\"'initialize the helper class\").Append(";
_sb.Append("'initialize the helper class").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 284;BA.debugLine="sb.append(\"alaSQL.Initialize\").append(CRLF)";
_sb.Append("alaSQL.Initialize").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 285;BA.debugLine="sb.Append(\"'Get values from the form\").Append(CRL";
_sb.Append("'Get values from the form").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 286;BA.debugLine="sb.append($\"Dim rec As Map = pg.GetValues(\"form\")";
_sb.Append(("Dim rec As Map = pg.GetValues(\"form\")")).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 287;BA.debugLine="sb.Append(\"'save record to the database\").Append(";
_sb.Append("'save record to the database").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 288;BA.debugLine="sb.Append($\"Dim rs As AlaSQLResultSet = alaSQL.In";
_sb.Append(("Dim rs As AlaSQLResultSet = alaSQL.Insert(\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tblname))+"\", rec)")).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 289;BA.debugLine="sb.append($\"rs.Result = db.ExecuteWait(rs.query,";
_sb.Append(("rs.Result = db.ExecuteWait(rs.query, rs.args)")).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 290;BA.debugLine="sb.Append(\"End Sub\").Append(CRLF).Append(CRLF)";
_sb.Append("End Sub").Append(anywheresoftware.b4a.keywords.Common.CRLF).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 292;BA.debugLine="sb.Append(\"'READ\").Append(CRLF)";
_sb.Append("'READ").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 293;BA.debugLine="sb.Append(\"Sub btnread_click\").append(CRLF)";
_sb.Append("Sub btnread_click").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 294;BA.debugLine="sb.Append(\"'get the content of the primary key fi";
_sb.Append("'get the content of the primary key field").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 295;BA.debugLine="sb.append($\"Dim priValue As String = pg.GetValue(";
_sb.Append(("Dim priValue As String = pg.GetValue(\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_prikey))+"\")")).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 296;BA.debugLine="sb.Append(\"'read record from table\").append(CRLF)";
_sb.Append("'read record from table").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 297;BA.debugLine="sb.Append(\"Dim alaSQL As BANanoAlaSQL\").append(CR";
_sb.Append("Dim alaSQL As BANanoAlaSQL").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 298;BA.debugLine="sb.Append(\"'initialize the helper class\").Append(";
_sb.Append("'initialize the helper class").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 299;BA.debugLine="sb.append(\"alaSQL.Initialize\").append(CRLF)";
_sb.Append("alaSQL.Initialize").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 300;BA.debugLine="sb.Append(\"'generate the select where statement\")";
_sb.Append("'generate the select where statement").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 301;BA.debugLine="sb.Append($\"Dim rs As AlaSQLResultSet = alaSQL.Re";
_sb.Append(("Dim rs As AlaSQLResultSet = alaSQL.Read(\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tblname))+"\", \""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_prikey))+"\", priValue)")).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 302;BA.debugLine="sb.append($\"rs.result = db.ExecuteWait(rs.query,";
_sb.Append(("rs.result = db.ExecuteWait(rs.query, rs.args)")).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 303;BA.debugLine="sb.Append(\"'the record was found, set the values";
_sb.Append("'the record was found, set the values to the form").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 304;BA.debugLine="sb.Append(\"If rs.result.size > 0 then\").Append(CR";
_sb.Append("If rs.result.size > 0 then").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 305;BA.debugLine="sb.Append(\"Dim rec As Map = rs.result.Get(0)\").Ap";
_sb.Append("Dim rec As Map = rs.result.Get(0)").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 306;BA.debugLine="sb.Append(\"'set returned map to form\").append(CRL";
_sb.Append("'set returned map to form").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 307;BA.debugLine="sb.Append($\"pg.SetValues(\"form\", rec)\"$).Append(C";
_sb.Append(("pg.SetValues(\"form\", rec)")).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 308;BA.debugLine="sb.Append(\"End If\").Append(CRLF)";
_sb.Append("End If").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 309;BA.debugLine="sb.append(\"End Sub\").Append(CRLF).Append(CRLF)";
_sb.Append("End Sub").Append(anywheresoftware.b4a.keywords.Common.CRLF).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 310;BA.debugLine="sb.Append(\"'UPDATE\").Append(CRLF)";
_sb.Append("'UPDATE").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 311;BA.debugLine="sb.Append(\"Sub btnupdate_click\").Append(CRLF)";
_sb.Append("Sub btnupdate_click").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 312;BA.debugLine="sb.Append(\"'lets validate the form\").Append(CRLF)";
_sb.Append("'lets validate the form").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 313;BA.debugLine="sb.append($\"Dim bValid As Boolean = pg.Validate(\"";
_sb.Append(("Dim bValid As Boolean = pg.Validate(\"form\")")).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 314;BA.debugLine="sb.append(\"if bValid = False Then Return\").Append";
_sb.Append("if bValid = False Then Return").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 315;BA.debugLine="sb.Append(\"'Get values from the form\").Append(CRL";
_sb.Append("'Get values from the form").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 316;BA.debugLine="sb.append($\"Dim rec As Map = pg.GetValues(\"form\")";
_sb.Append(("Dim rec As Map = pg.GetValues(\"form\")")).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 317;BA.debugLine="sb.Append(\"'get the primary key\").Append(CRLF)";
_sb.Append("'get the primary key").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 318;BA.debugLine="sb.append($\"Dim priValue As String = pg.GetValue(";
_sb.Append(("Dim priValue As String = pg.GetValue(\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_prikey))+"\")")).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 319;BA.debugLine="sb.Append(\"Dim alaSQL As BANanoAlaSQL\").append(CR";
_sb.Append("Dim alaSQL As BANanoAlaSQL").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 320;BA.debugLine="sb.Append(\"'initialize the helper class\").Append(";
_sb.Append("'initialize the helper class").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 321;BA.debugLine="sb.append(\"alaSQL.Initialize\").append(CRLF)";
_sb.Append("alaSQL.Initialize").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 322;BA.debugLine="sb.Append(\"'update record in the table\").Append(C";
_sb.Append("'update record in the table").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 323;BA.debugLine="sb.Append($\"Dim rs As AlaSQLResultSet = alaSQL.Up";
_sb.Append(("Dim rs As AlaSQLResultSet = alaSQL.UpdateWhere(\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tblname))+"\", rec, CreateMap(\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_prikey))+"\":priValue))")).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 324;BA.debugLine="sb.append($\"rs.Result = db.ExecuteWait(rs.query,";
_sb.Append(("rs.Result = db.ExecuteWait(rs.query, rs.args)")).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 325;BA.debugLine="sb.Append(\"End Sub\").Append(CRLF).Append(CRLF)";
_sb.Append("End Sub").Append(anywheresoftware.b4a.keywords.Common.CRLF).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 326;BA.debugLine="sb.Append(\"'DELETE\").Append(CRLF)";
_sb.Append("'DELETE").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 327;BA.debugLine="sb.Append(\"Sub btndelete_click\").Append(CRLF)";
_sb.Append("Sub btndelete_click").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 328;BA.debugLine="sb.Append(\"'draw a confirm dialog\").Append(CRLF)";
_sb.Append("'draw a confirm dialog").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 329;BA.debugLine="sb.Append(\"Dim confirmDelete As Boolean = False\")";
_sb.Append("Dim confirmDelete As Boolean = False").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 330;BA.debugLine="sb.append($\"Dim cb As BANanoObject = BANano.CallB";
_sb.Append(("Dim cb As BANanoObject = BANano.CallBack(Me,\"delete"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tblname))+"\",Array(confirmDelete))")).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 331;BA.debugLine="sb.Append($\"pg.Confirm(cb, \"Confirm Delete\", \"Are";
_sb.Append(("pg.Confirm(cb, \"Confirm Delete\", \"Are you sure that you want to delete this record?\")")).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 332;BA.debugLine="sb.Append(\"End Sub\").Append(CRLF).Append(CRLF)";
_sb.Append("End Sub").Append(anywheresoftware.b4a.keywords.Common.CRLF).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 334;BA.debugLine="sb.Append($\"Sub Delete${tblName}(confirmDelete As";
_sb.Append(("Sub Delete"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tblname))+"(confirmDelete As Boolean)")).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 335;BA.debugLine="sb.append($\"if confirmDelete = False Then Return\"";
_sb.Append(("if confirmDelete = False Then Return")).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 336;BA.debugLine="sb.Append(\"'get the primary key\").Append(CRLF)";
_sb.Append("'get the primary key").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 337;BA.debugLine="sb.append($\"Dim priValue As String = pg.GetValue(";
_sb.Append(("Dim priValue As String = pg.GetValue(\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_prikey))+"\")")).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 338;BA.debugLine="sb.Append(\"Dim alaSQL As BANanoAlaSQL\").append(CR";
_sb.Append("Dim alaSQL As BANanoAlaSQL").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 339;BA.debugLine="sb.Append(\"'initialize the helper class\").Append(";
_sb.Append("'initialize the helper class").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 340;BA.debugLine="sb.append(\"alaSQL.Initialize\").append(CRLF)";
_sb.Append("alaSQL.Initialize").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 341;BA.debugLine="sb.Append(\"'delete record in the table\").Append(C";
_sb.Append("'delete record in the table").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 342;BA.debugLine="sb.Append($\"Dim rs As AlaSQLResultSet = alaSQL.De";
_sb.Append(("Dim rs As AlaSQLResultSet = alaSQL.DeleteWhere(\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tblname))+"\", CreateMap(\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_prikey))+"\":priValue))")).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 343;BA.debugLine="sb.append($\"rs.Result = db.ExecuteWait(rs.query,";
_sb.Append(("rs.Result = db.ExecuteWait(rs.query, rs.args)")).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 344;BA.debugLine="sb.Append(\"End Sub\").Append(CRLF).Append(CRLF)";
_sb.Append("End Sub").Append(anywheresoftware.b4a.keywords.Common.CRLF).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 347;BA.debugLine="sb.Append(\"'READ ALL\").Append(CRLF)";
_sb.Append("'READ ALL").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 348;BA.debugLine="sb.Append(\"Sub btngetall_click\").Append(CRLF)";
_sb.Append("Sub btngetall_click").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 349;BA.debugLine="sb.Append(\"Dim alaSQL As BANanoAlaSQL\").append(CR";
_sb.Append("Dim alaSQL As BANanoAlaSQL").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 350;BA.debugLine="sb.Append(\"'initialize the helper class\").Append(";
_sb.Append("'initialize the helper class").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 351;BA.debugLine="sb.append(\"alaSQL.Initialize\").append(CRLF)";
_sb.Append("alaSQL.Initialize").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 352;BA.debugLine="sb.Append(\"'select all records record in the tabl";
_sb.Append("'select all records record in the table").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 353;BA.debugLine="sb.Append($\"Dim rs As AlaSQLResultSet = alaSQL.Se";
_sb.Append(("Dim rs As AlaSQLResultSet = alaSQL.SelectAll(\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tblname))+"\", array(\"*\"), array(\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_prikey))+"\"))")).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 354;BA.debugLine="sb.append($\"rs.Result = db.ExecuteWait(rs.query,";
_sb.Append(("rs.Result = db.ExecuteWait(rs.query, rs.args)")).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 355;BA.debugLine="sb.Append(\"log(rs.Result)\").Append(CRLF)";
_sb.Append("log(rs.Result)").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 356;BA.debugLine="sb.Append(\"End Sub\").Append(CRLF).Append(CRLF)";
_sb.Append("End Sub").Append(anywheresoftware.b4a.keywords.Common.CRLF).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 357;BA.debugLine="Return sb.tostring";
if (true) return _sb.ToString();
 //BA.debugLineNum = 358;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 650;BA.debugLine="Sub CreateView(properties As Map) As Map";
 //BA.debugLineNum = 652;BA.debugLine="Dim v As String = properties.Get(\"view\")";
_v = BA.ObjectToString(_properties.Get((Object)("view")));
 //BA.debugLineNum = 653;BA.debugLine="Dim i As String = properties.Get(\"id\")";
_i = BA.ObjectToString(_properties.Get((Object)("id")));
 //BA.debugLineNum = 655;BA.debugLine="Dim view As WixElement";
_view = new b4j.example.wixelement();
 //BA.debugLineNum = 656;BA.debugLine="view.Initialize(i)";
_view._initialize /*b4j.example.wixelement*/ (ba,_i);
 //BA.debugLineNum = 658;BA.debugLine="Dim optionsid As String";
_optionsid = "";
 //BA.debugLineNum = 659;BA.debugLine="Dim optionstext As String";
_optionstext = "";
 //BA.debugLineNum = 660;BA.debugLine="Dim options As List";
_options = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 661;BA.debugLine="options.Initialize";
_options.Initialize();
 //BA.debugLineNum = 662;BA.debugLine="Dim ids() As String";
_ids = new String[(int) (0)];
java.util.Arrays.fill(_ids,"");
 //BA.debugLineNum = 663;BA.debugLine="Dim texts() As String";
_texts = new String[(int) (0)];
java.util.Arrays.fill(_texts,"");
 //BA.debugLineNum = 664;BA.debugLine="Dim idLen As Int";
_idlen = 0;
 //BA.debugLineNum = 665;BA.debugLine="Dim txtLen As Int";
_txtlen = 0;
 //BA.debugLineNum = 667;BA.debugLine="Select Case v";
switch (BA.switchObjectToInt(_v,"combo","richselect","radio","select","segmented","tabbar","dbllist","suggest")) {
case 0: 
case 1: 
case 2: 
case 3: 
case 4: 
case 5: 
case 6: 
case 7: {
 //BA.debugLineNum = 669;BA.debugLine="optionsid = properties.Get(\"optionsid\")";
_optionsid = BA.ObjectToString(_properties.Get((Object)("optionsid")));
 //BA.debugLineNum = 670;BA.debugLine="optionstext = properties.Get(\"optionstext\")";
_optionstext = BA.ObjectToString(_properties.Get((Object)("optionstext")));
 //BA.debugLineNum = 672;BA.debugLine="ids = BANano.Split(\",\",optionsid)";
_ids = _banano.Split(",",_optionsid);
 //BA.debugLineNum = 673;BA.debugLine="texts = BANano.Split(\",\", optionstext)";
_texts = _banano.Split(",",_optionstext);
 //BA.debugLineNum = 674;BA.debugLine="idLen = ids.Length";
_idlen = _ids.length;
 //BA.debugLineNum = 675;BA.debugLine="txtLen = texts.Length";
_txtlen = _texts.length;
 //BA.debugLineNum = 676;BA.debugLine="If idLen <> txtLen Then";
if (_idlen!=_txtlen) { 
 //BA.debugLineNum = 677;BA.debugLine="pg.Message_Error(i & \" options do not tally!\")";
_pg._message_error /*String*/ (_i+" options do not tally!");
 //BA.debugLineNum = 678;BA.debugLine="Return view.Item";
if (true) return _view._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 };
 //BA.debugLineNum = 680;BA.debugLine="Dim x As Int";
_x = 0;
 //BA.debugLineNum = 681;BA.debugLine="For x = 0 To idLen - 1";
{
final int step26 = 1;
final int limit26 = (int) (_idlen-1);
_x = (int) (0) ;
for (;_x <= limit26 ;_x = _x + step26 ) {
 //BA.debugLineNum = 682;BA.debugLine="Dim idx As String = ids(x)";
_idx = _ids[_x];
 //BA.debugLineNum = 683;BA.debugLine="Dim txtx As String = texts(x)";
_txtx = _texts[_x];
 //BA.debugLineNum = 684;BA.debugLine="options.Add(CreateMap(\"id\":idx, \"value\":txtx))";
_options.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(_idx),(Object)("value"),(Object)(_txtx)}).getObject()));
 }
};
 //BA.debugLineNum = 686;BA.debugLine="properties.remove(\"optionsid\")";
_properties.Remove((Object)("optionsid"));
 //BA.debugLineNum = 687;BA.debugLine="properties.remove(\"optionstext\")";
_properties.Remove((Object)("optionstext"));
 //BA.debugLineNum = 688;BA.debugLine="Select Case v";
switch (BA.switchObjectToInt(_v,"dbllist","suggest")) {
case 0: 
case 1: {
 //BA.debugLineNum = 690;BA.debugLine="properties.Put(\"data\", options)";
_properties.Put((Object)("data"),(Object)(_options.getObject()));
 break; }
default: {
 //BA.debugLineNum = 692;BA.debugLine="properties.Put(\"options\", options)";
_properties.Put((Object)("options"),(Object)(_options.getObject()));
 break; }
}
;
 break; }
}
;
 //BA.debugLineNum = 697;BA.debugLine="For Each pkey As String In properties.keys";
{
final anywheresoftware.b4a.BA.IterableList group40 = _properties.Keys();
final int groupLen40 = group40.getSize()
;int index40 = 0;
;
for (; index40 < groupLen40;index40++){
_pkey = BA.ObjectToString(group40.Get(index40));
 //BA.debugLineNum = 698;BA.debugLine="Dim pval As String = properties.Get(pkey)";
_pval = BA.ObjectToString(_properties.Get((Object)(_pkey)));
 //BA.debugLineNum = 699;BA.debugLine="Dim cval As String = pg.CStr(pval)";
_cval = _pg._cstr /*String*/ ((Object)(_pval));
 //BA.debugLineNum = 700;BA.debugLine="If cval <> \"\" Then";
if ((_cval).equals("") == false) { 
 //BA.debugLineNum = 701;BA.debugLine="If pkey = \"view\" And cval.tolowercase = \"row\" T";
if ((_pkey).equals("view") && (_cval.toLowerCase()).equals("row")) { 
if (true) continue;};
 //BA.debugLineNum = 702;BA.debugLine="If pkey = \"view\" And cval.tolowercase = \"column";
if ((_pkey).equals("view") && (_cval.toLowerCase()).equals("column")) { 
if (true) continue;};
 //BA.debugLineNum = 703;BA.debugLine="If pkey = \"addingmethod\" Then Continue";
if ((_pkey).equals("addingmethod")) { 
if (true) continue;};
 //BA.debugLineNum = 704;BA.debugLine="If pkey = \"style.color\" Then";
if ((_pkey).equals("style.color")) { 
 //BA.debugLineNum = 705;BA.debugLine="view.SetStyle(\"color\", cval)";
_view._setstyle /*b4j.example.wixelement*/ ("color",_cval);
 //BA.debugLineNum = 706;BA.debugLine="Continue";
if (true) continue;
 };
 //BA.debugLineNum = 708;BA.debugLine="If pkey = \"style.background\" Then";
if ((_pkey).equals("style.background")) { 
 //BA.debugLineNum = 709;BA.debugLine="view.SetStyle(\"background\", cval)";
_view._setstyle /*b4j.example.wixelement*/ ("background",_cval);
 //BA.debugLineNum = 710;BA.debugLine="Continue";
if (true) continue;
 };
 //BA.debugLineNum = 712;BA.debugLine="Select Case pkey";
switch (BA.switchObjectToInt(_pkey,"DefaultView","DefaultType","DefaultLabelAlign","DefaultLabelWidth","DefaultLabelPosition","DefaultAlign","DefaultWidth","DefaultHeight","DefaultBottomPadding")) {
case 0: {
 //BA.debugLineNum = 714;BA.debugLine="view.SetDefaultView(cval)";
_view._setdefaultview /*b4j.example.wixelement*/ (_cval);
 break; }
case 1: {
 //BA.debugLineNum = 716;BA.debugLine="view.SetDefaultType(cval)";
_view._setdefaulttype /*b4j.example.wixelement*/ (_cval);
 break; }
case 2: {
 //BA.debugLineNum = 718;BA.debugLine="view.setDefaultLabelAlign(cval)";
_view._setdefaultlabelalign /*b4j.example.wixelement*/ (_cval);
 break; }
case 3: {
 //BA.debugLineNum = 720;BA.debugLine="view.setDefaultLabelWidth(cval)";
_view._setdefaultlabelwidth /*b4j.example.wixelement*/ ((int)(Double.parseDouble(_cval)));
 break; }
case 4: {
 //BA.debugLineNum = 722;BA.debugLine="view.setDefaultLabelPosition(cval)";
_view._setdefaultlabelposition /*b4j.example.wixelement*/ (_cval);
 break; }
case 5: {
 //BA.debugLineNum = 724;BA.debugLine="view.setDefaultAlign(cval)";
_view._setdefaultalign /*b4j.example.wixelement*/ (_cval);
 break; }
case 6: {
 //BA.debugLineNum = 726;BA.debugLine="view.setDefaultWidth(cval)";
_view._setdefaultwidth /*b4j.example.wixelement*/ ((int)(Double.parseDouble(_cval)));
 break; }
case 7: {
 //BA.debugLineNum = 728;BA.debugLine="view.setDefaultHeight(cval)";
_view._setdefaultheight /*b4j.example.wixelement*/ ((int)(Double.parseDouble(_cval)));
 break; }
case 8: {
 //BA.debugLineNum = 730;BA.debugLine="view.setDefaultBottomPadding(cval)";
_view._setdefaultbottompadding /*b4j.example.wixelement*/ ((int)(Double.parseDouble(_cval)));
 break; }
default: {
 //BA.debugLineNum = 732;BA.debugLine="view.SetAttr(pkey, pval)";
_view._setattr /*b4j.example.wixelement*/ (_pkey,(Object)(_pval));
 break; }
}
;
 };
 }
};
 //BA.debugLineNum = 737;BA.debugLine="Select Case v.ToLowerCase";
switch (BA.switchObjectToInt(_v.toLowerCase(),"row","column")) {
case 0: 
case 1: {
 break; }
default: {
 //BA.debugLineNum = 740;BA.debugLine="view.SetAttr(\"view\", v.ToLowerCase)";
_view._setattr /*b4j.example.wixelement*/ ("view",(Object)(_v.toLowerCase()));
 break; }
}
;
 //BA.debugLineNum = 742;BA.debugLine="Return view.Item";
if (true) return _view._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 743;BA.debugLine="End Sub";
return null;
}
public static com.ab.banano.BANanoObject  _createwindow() throws Exception{
b4j.example.wixwindow _win = null;
b4j.example.wixform _frmx = null;
b4j.example.wixtextarea _txtarea = null;
b4j.example.wixbutton _btnsave = null;
 //BA.debugLineNum = 1406;BA.debugLine="Sub CreateWindow As BANanoObject";
 //BA.debugLineNum = 1407;BA.debugLine="Dim win As WixWindow";
_win = new b4j.example.wixwindow();
 //BA.debugLineNum = 1408;BA.debugLine="win.Initialize(\"myWindow\").SetWidth(700).SetHeigh";
_win._initialize /*b4j.example.wixwindow*/ (ba,"myWindow")._setwidth /*b4j.example.wixwindow*/ ((Object)(700))._setheight /*b4j.example.wixwindow*/ ((Object)(400))._setmove /*b4j.example.wixwindow*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1409;BA.debugLine="win.SetPositionCenter(\"\")";
_win._setpositioncenter /*b4j.example.wixwindow*/ (BA.ObjectToBoolean(""));
 //BA.debugLineNum = 1410;BA.debugLine="win.SetModal(True)";
_win._setmodal /*b4j.example.wixwindow*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1411;BA.debugLine="win.ToolBar.SetPadding(10)";
_win._toolbar /*b4j.example.wixtoolbar*/ ._setpadding /*b4j.example.wixtoolbar*/ (BA.NumberToString(10));
 //BA.debugLineNum = 1412;BA.debugLine="win.ToolBar.CreateLabel(\"lbl\").SetLabel(\"Add Mult";
_win._toolbar /*b4j.example.wixtoolbar*/ ._createlabel /*b4j.example.wixlabel*/ ("lbl")._setlabel /*b4j.example.wixlabel*/ ("Add Multiple Controls")._pop /*String*/ ();
 //BA.debugLineNum = 1413;BA.debugLine="win.ToolBar.CreateIcon(\"icnclose\").SetIcon(\"mdi m";
_win._toolbar /*b4j.example.wixtoolbar*/ ._createicon /*b4j.example.wixicon*/ ("icnclose")._seticon /*b4j.example.wixicon*/ ((Object)("mdi mdi-close"))._setclick /*b4j.example.wixicon*/ ((com.ab.banano.BANanoObject)(_banano.CallBack(pgformdesigner.getObject(),"closeWin",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)))))._pop /*String*/ ();
 //BA.debugLineNum = 1415;BA.debugLine="win.SetToolBar(True)";
_win._settoolbar /*b4j.example.wixwindow*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1417;BA.debugLine="Dim frmx As WixForm";
_frmx = new b4j.example.wixform();
 //BA.debugLineNum = 1418;BA.debugLine="frmx.Initialize(\"frmx\").SetBorderless(True)";
_frmx._initialize /*b4j.example.wixform*/ (ba,"frmx")._setborderless /*b4j.example.wixform*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1420;BA.debugLine="Dim txtArea As WixTextArea";
_txtarea = new b4j.example.wixtextarea();
 //BA.debugLineNum = 1421;BA.debugLine="txtArea.Initialize(\"txtmultiplecontrols\").SetLabe";
_txtarea._initialize /*b4j.example.wixtextarea*/ (ba,"txtmultiplecontrols")._setlabel /*b4j.example.wixtextarea*/ ("Enter the names of the multiple controls separated by a comma.");
 //BA.debugLineNum = 1422;BA.debugLine="txtArea.SetLabelPosition(\"top\").SetInvalidMessage";
_txtarea._setlabelposition /*b4j.example.wixtextarea*/ ("top")._setinvalidmessage /*b4j.example.wixtextarea*/ ("No elements have been entered!");
 //BA.debugLineNum = 1423;BA.debugLine="txtArea.SetRequired(True).SetValidateIsNotEmpty(T";
_txtarea._setrequired /*b4j.example.wixtextarea*/ (anywheresoftware.b4a.keywords.Common.True)._setvalidateisnotempty /*b4j.example.wixtextarea*/ (anywheresoftware.b4a.keywords.Common.True)._setvalidateeventblur /*b4j.example.wixtextarea*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1424;BA.debugLine="frmx.AddRows(txtArea.Item)";
_frmx._addrows /*String*/ (_txtarea._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 1426;BA.debugLine="Dim btnSave As WixButton";
_btnsave = new b4j.example.wixbutton();
 //BA.debugLineNum = 1427;BA.debugLine="btnSave.Initialize(\"btnMulti\").SetLabel(\"Apply\").";
_btnsave._initialize /*b4j.example.wixbutton*/ (ba,"btnMulti")._setlabel /*b4j.example.wixbutton*/ ("Apply")._setclick /*b4j.example.wixbutton*/ ((com.ab.banano.BANanoObject)(_banano.CallBack(pgformdesigner.getObject(),"btnMulti_click",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)))));
 //BA.debugLineNum = 1428;BA.debugLine="btnSave.SetBadge(\"0\")";
_btnsave._setbadge /*b4j.example.wixbutton*/ ((Object)("0"));
 //BA.debugLineNum = 1429;BA.debugLine="frmx.AddRows(btnSave.Item)";
_frmx._addrows /*String*/ (_btnsave._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 1431;BA.debugLine="win.setbody(frmx.Item)";
_win._setbody /*b4j.example.wixwindow*/ (_frmx._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 1433;BA.debugLine="winux = pg.AddWindow(win)";
_winux = _pg._addwindow /*com.ab.banano.BANanoObject*/ (_win);
 //BA.debugLineNum = 1435;BA.debugLine="pg.OnKeyPress(\"txtmultiplecontrols\", BANano.callb";
_pg._onkeypress /*String*/ ("txtmultiplecontrols",(com.ab.banano.BANanoObject)(_banano.CallBack(pgformdesigner.getObject(),"multichange",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)))));
 //BA.debugLineNum = 1436;BA.debugLine="Return winux";
if (true) return _winux;
 //BA.debugLineNum = 1437;BA.debugLine="End Sub";
return null;
}
public static com.ab.banano.BANanoObject  _createwindowfields() throws Exception{
b4j.example.wixwindow _win = null;
b4j.example.wixform _frmx = null;
b4j.example.wixtextarea _txtarea = null;
b4j.example.wixbutton _btnsave = null;
 //BA.debugLineNum = 1632;BA.debugLine="Sub CreateWindowFields As BANanoObject";
 //BA.debugLineNum = 1633;BA.debugLine="Dim win As WixWindow";
_win = new b4j.example.wixwindow();
 //BA.debugLineNum = 1634;BA.debugLine="win.Initialize(\"fldWindow\").SetWidth(700).SetHeig";
_win._initialize /*b4j.example.wixwindow*/ (ba,"fldWindow")._setwidth /*b4j.example.wixwindow*/ ((Object)(700))._setheight /*b4j.example.wixwindow*/ ((Object)(400))._setmove /*b4j.example.wixwindow*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1635;BA.debugLine="win.SetPositionCenter(\"\")";
_win._setpositioncenter /*b4j.example.wixwindow*/ (BA.ObjectToBoolean(""));
 //BA.debugLineNum = 1636;BA.debugLine="win.SetModal(True)";
_win._setmodal /*b4j.example.wixwindow*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1637;BA.debugLine="win.ToolBar.SetPadding(10)";
_win._toolbar /*b4j.example.wixtoolbar*/ ._setpadding /*b4j.example.wixtoolbar*/ (BA.NumberToString(10));
 //BA.debugLineNum = 1638;BA.debugLine="win.ToolBar.CreateLabel(\"lbl\").SetLabel(\"Add Mult";
_win._toolbar /*b4j.example.wixtoolbar*/ ._createlabel /*b4j.example.wixlabel*/ ("lbl")._setlabel /*b4j.example.wixlabel*/ ("Add Multiple Things")._pop /*String*/ ();
 //BA.debugLineNum = 1639;BA.debugLine="win.ToolBar.CreateIcon(\"icnclose1\").SetIcon(\"mdi";
_win._toolbar /*b4j.example.wixtoolbar*/ ._createicon /*b4j.example.wixicon*/ ("icnclose1")._seticon /*b4j.example.wixicon*/ ((Object)("mdi mdi-close"))._setclick /*b4j.example.wixicon*/ ((com.ab.banano.BANanoObject)(_banano.CallBack(pgformdesigner.getObject(),"closeWin1",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)))))._pop /*String*/ ();
 //BA.debugLineNum = 1641;BA.debugLine="win.SetToolBar(True)";
_win._settoolbar /*b4j.example.wixwindow*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1643;BA.debugLine="Dim frmx As WixForm";
_frmx = new b4j.example.wixform();
 //BA.debugLineNum = 1644;BA.debugLine="frmx.Initialize(\"frmy\").SetBorderless(True)";
_frmx._initialize /*b4j.example.wixform*/ (ba,"frmy")._setborderless /*b4j.example.wixform*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1646;BA.debugLine="Dim txtArea As WixTextArea";
_txtarea = new b4j.example.wixtextarea();
 //BA.debugLineNum = 1647;BA.debugLine="txtArea.Initialize(\"txtmultiplefields\").SetLabel(";
_txtarea._initialize /*b4j.example.wixtextarea*/ (ba,"txtmultiplefields")._setlabel /*b4j.example.wixtextarea*/ ("Enter the names of the multiple things separated by a comma.");
 //BA.debugLineNum = 1648;BA.debugLine="txtArea.SetLabelPosition(\"top\").SetInvalidMessage";
_txtarea._setlabelposition /*b4j.example.wixtextarea*/ ("top")._setinvalidmessage /*b4j.example.wixtextarea*/ ("No things have been entered!");
 //BA.debugLineNum = 1649;BA.debugLine="txtArea.SetRequired(True).SetValidateIsNotEmpty(T";
_txtarea._setrequired /*b4j.example.wixtextarea*/ (anywheresoftware.b4a.keywords.Common.True)._setvalidateisnotempty /*b4j.example.wixtextarea*/ (anywheresoftware.b4a.keywords.Common.True)._setvalidateeventblur /*b4j.example.wixtextarea*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1650;BA.debugLine="frmx.AddRows(txtArea.Item)";
_frmx._addrows /*String*/ (_txtarea._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 1652;BA.debugLine="Dim btnSave As WixButton";
_btnsave = new b4j.example.wixbutton();
 //BA.debugLineNum = 1653;BA.debugLine="btnSave.Initialize(\"btnMulti1\").SetLabel(\"Apply\")";
_btnsave._initialize /*b4j.example.wixbutton*/ (ba,"btnMulti1")._setlabel /*b4j.example.wixbutton*/ ("Apply")._setclick /*b4j.example.wixbutton*/ ((com.ab.banano.BANanoObject)(_banano.CallBack(pgformdesigner.getObject(),"btnMulti1_click",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)))));
 //BA.debugLineNum = 1654;BA.debugLine="btnSave.SetBadge(\"0\")";
_btnsave._setbadge /*b4j.example.wixbutton*/ ((Object)("0"));
 //BA.debugLineNum = 1655;BA.debugLine="frmx.AddRows(btnSave.Item)";
_frmx._addrows /*String*/ (_btnsave._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 1657;BA.debugLine="win.setbody(frmx.Item)";
_win._setbody /*b4j.example.wixwindow*/ (_frmx._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 1659;BA.debugLine="fldWin = pg.AddWindow(win)";
_fldwin = _pg._addwindow /*com.ab.banano.BANanoObject*/ (_win);
 //BA.debugLineNum = 1661;BA.debugLine="pg.OnKeyPress(\"txtmultiplefields\", BANano.callbac";
_pg._onkeypress /*String*/ ("txtmultiplefields",(com.ab.banano.BANanoObject)(_banano.CallBack(pgformdesigner.getObject(),"fieldschange",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)))));
 //BA.debugLineNum = 1662;BA.debugLine="Return fldWin";
if (true) return _fldwin;
 //BA.debugLineNum = 1663;BA.debugLine="End Sub";
return null;
}
public static String  _dbhelp() throws Exception{
b4j.example.wixhint _dbhint = null;
 //BA.debugLineNum = 1078;BA.debugLine="Sub dbhelp";
 //BA.debugLineNum = 1079;BA.debugLine="Dim dbhint As WixHint";
_dbhint = new b4j.example.wixhint();
 //BA.debugLineNum = 1080;BA.debugLine="dbhint.Initialize(\"dbhint\")";
_dbhint._initialize /*b4j.example.wixhint*/ (ba,"dbhint");
 //BA.debugLineNum = 1081;BA.debugLine="dbhint.AddStep(\"tree\",\"Database\",\"To store data f";
_dbhint._addstep /*b4j.example.wixhint*/ ("tree","Database","To store data for our forms, we can create a database and tables. Click Database on the tree to do so.","enter");
 //BA.debugLineNum = 1082;BA.debugLine="dbhint.AddStep(\"propform\", \"Connection\", \"Specify";
_dbhint._addstep /*b4j.example.wixhint*/ ("propform","Connection","Specify the database name and select with backend to use either BANanoSQL, BANanoSQLite or BANanoMySQL. Each has different connection options.","enter");
 //BA.debugLineNum = 1083;BA.debugLine="dbhint.AddStep(\"formholder\", \"Settings\", \"You wil";
_dbhint._addstep /*b4j.example.wixhint*/ ("formholder","Settings","You will be provided with steps to follow to set up your connection here for each back end type.","enter");
 //BA.debugLineNum = 1084;BA.debugLine="dbhint.AddStep(\"tree\", \"Tables\", \"The next step i";
_dbhint._addstep /*b4j.example.wixhint*/ ("tree","Tables","The next step is to add tables to the database, select Database from the tree.","enter");
 //BA.debugLineNum = 1085;BA.debugLine="dbhint.AddStep(\"propadd\", \"Add Table\", \"Click her";
_dbhint._addstep /*b4j.example.wixhint*/ ("propadd","Add Table","Click here to add a new table and provide its name.","enter");
 //BA.debugLineNum = 1086;BA.debugLine="dbhint.AddStep(\"propsave\", \"Save Table\", \"Once yo";
_dbhint._addstep /*b4j.example.wixhint*/ ("propsave","Save Table","Once you have provided the table details, click on save to store the database, now you are ready to add fields to the table.","enter");
 //BA.debugLineNum = 1087;BA.debugLine="dbhint.AddStep(\"propdelete\", \"Delete Table\", \"Sho";
_dbhint._addstep /*b4j.example.wixhint*/ ("propdelete","Delete Table","Should you wish to delete a table, you can select the trash here after selecting the table on the tree.","enter");
 //BA.debugLineNum = 1088;BA.debugLine="dbhint.AddStep(\"tree\", \"Saved Table\", \"You have s";
_dbhint._addstep /*b4j.example.wixhint*/ ("tree","Saved Table","You have saved the table and now it is listed in the tree, to add fields to it, select the table on the tree.","enter");
 //BA.debugLineNum = 1089;BA.debugLine="dbhint.AddStep(\"propadd\", \"Add Field\", \"Click her";
_dbhint._addstep /*b4j.example.wixhint*/ ("propadd","Add Field","Click here to add a new field and provide its name and type.","enter");
 //BA.debugLineNum = 1090;BA.debugLine="dbhint.AddStep(\"propsave\", \"Save Field\", \"Once yo";
_dbhint._addstep /*b4j.example.wixhint*/ ("propsave","Save Field","Once you have provided the field details, click on save to store to the database.","enter");
 //BA.debugLineNum = 1091;BA.debugLine="dbhint.AddStep(\"propdelete\", \"Delete Field\", \"Sho";
_dbhint._addstep /*b4j.example.wixhint*/ ("propdelete","Delete Field","Should you wish to delete a field, select it on the tree and select the trash here.","enter");
 //BA.debugLineNum = 1092;BA.debugLine="dbhint.AddStep(\"tree\", \"Saved Fields\", \"All the f";
_dbhint._addstep /*b4j.example.wixhint*/ ("tree","Saved Fields","All the fields you have created will now be listed on the tree.","enter");
 //BA.debugLineNum = 1094;BA.debugLine="pg.StartHint(dbhint)";
_pg._starthint /*String*/ (_dbhint);
 //BA.debugLineNum = 1096;BA.debugLine="End Sub";
return "";
}
public static String  _deletepropwait(boolean _confirmresult) throws Exception{
anywheresoftware.b4a.objects.collections.Map _rp = null;
String _value = "";
String _tablename = "";
String _key = "";
 //BA.debugLineNum = 595;BA.debugLine="Sub deletepropwait(confirmresult As Boolean)";
 //BA.debugLineNum = 596;BA.debugLine="If confirmresult = False Then Return";
if (_confirmresult==anywheresoftware.b4a.keywords.Common.False) { 
if (true) return "";};
 //BA.debugLineNum = 597;BA.debugLine="Dim rp As Map = pg.GetValues(\"propbag\")";
_rp = new anywheresoftware.b4a.objects.collections.Map();
_rp = _pg._getvalues /*anywheresoftware.b4a.objects.collections.Map*/ ("propbag");
 //BA.debugLineNum = 598;BA.debugLine="delID = rp.Get(\"id\")";
_delid = BA.ObjectToString(_rp.Get((Object)("id")));
 //BA.debugLineNum = 599;BA.debugLine="Dim value As String = rp.GetDefault(\"value\", \"\")";
_value = BA.ObjectToString(_rp.GetDefault((Object)("value"),(Object)("")));
 //BA.debugLineNum = 600;BA.debugLine="Dim tablename As String = rp.GetDefault(\"tablenam";
_tablename = BA.ObjectToString(_rp.GetDefault((Object)("tablename"),(Object)("")));
 //BA.debugLineNum = 601;BA.debugLine="Dim key As String = $\"table.${value}\"$";
_key = ("table."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_value))+"");
 //BA.debugLineNum = 602;BA.debugLine="Select Case delID";
switch (BA.switchObjectToInt(_delid,"form","field","table")) {
case 0: {
 //BA.debugLineNum = 604;BA.debugLine="sqlite.Initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 605;BA.debugLine="sqlite.AddStrings(Array(\"id\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 606;BA.debugLine="qry = sqlite.DeleteAll(\"items\")";
_qry = _sqlite._deleteall /*String*/ ("items");
 //BA.debugLineNum = 607;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\", C";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 608;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 609;BA.debugLine="pg.Message_Success(rs.result.size & \" record(s)";
_pg._message_success /*String*/ (BA.NumberToString(_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" record(s) affected!");
 //BA.debugLineNum = 610;BA.debugLine="refreshapp";
_refreshapp();
 break; }
case 1: {
 //BA.debugLineNum = 612;BA.debugLine="key = $\"field.${tablename}.${value}\"$";
_key = ("field."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tablename))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_value))+"");
 //BA.debugLineNum = 613;BA.debugLine="sqlite.initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 614;BA.debugLine="sqlite.AddStrings(Array(\"key\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("key")}));
 //BA.debugLineNum = 615;BA.debugLine="qry = sqlite.DeleteWhere(\"fields\",CreateMap(\"key";
_qry = _sqlite._deletewhere /*String*/ ("fields",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("key"),(Object)(_key)}));
 //BA.debugLineNum = 616;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\", C";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 617;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 618;BA.debugLine="pg.Message_Success(rs.result.size & \" record(s)";
_pg._message_success /*String*/ (BA.NumberToString(_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" record(s) affected!");
 //BA.debugLineNum = 619;BA.debugLine="refreshapp";
_refreshapp();
 break; }
case 2: {
 //BA.debugLineNum = 622;BA.debugLine="sqlite.initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 623;BA.debugLine="sqlite.AddStrings(Array(\"id\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 624;BA.debugLine="qry = sqlite.DeleteWhere(\"tables\",CreateMap(\"key";
_qry = _sqlite._deletewhere /*String*/ ("tables",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("key"),(Object)(_key)}));
 //BA.debugLineNum = 625;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\", C";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 626;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 628;BA.debugLine="sqlite.Initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 629;BA.debugLine="sqlite.AddStrings(Array(\"tablename\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("tablename")}));
 //BA.debugLineNum = 630;BA.debugLine="qry = sqlite.DeleteWhere(\"fields\",CreateMap(\"tab";
_qry = _sqlite._deletewhere /*String*/ ("fields",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("tablename"),(Object)(_value)}));
 //BA.debugLineNum = 631;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\", C";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 632;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 633;BA.debugLine="pg.Message_Success(rs.result.size & \" record(s)";
_pg._message_success /*String*/ (BA.NumberToString(_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" record(s) affected!");
 //BA.debugLineNum = 634;BA.debugLine="refreshapp";
_refreshapp();
 break; }
default: {
 //BA.debugLineNum = 636;BA.debugLine="sqlite.initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 637;BA.debugLine="sqlite.AddStrings(Array(\"id\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 638;BA.debugLine="qry = sqlite.DeleteWhere(\"items\",CreateMap(\"id\":";
_qry = _sqlite._deletewhere /*String*/ ("items",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(_delid)}));
 //BA.debugLineNum = 639;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\", C";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 640;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 641;BA.debugLine="pg.Message_Success(rs.result.size & \" record(s)";
_pg._message_success /*String*/ (BA.NumberToString(_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" record(s) affected!");
 //BA.debugLineNum = 642;BA.debugLine="refreshapp";
_refreshapp();
 break; }
}
;
 //BA.debugLineNum = 644;BA.debugLine="propBag.Clear";
_propbag._clear /*b4j.example.wixproperty*/ ();
 //BA.debugLineNum = 645;BA.debugLine="propBag.Refresh(pg)";
_propbag._refresh /*String*/ (_pg);
 //BA.debugLineNum = 646;BA.debugLine="End Sub";
return "";
}
public static String  _download() throws Exception{
 //BA.debugLineNum = 1061;BA.debugLine="Sub download";
 //BA.debugLineNum = 1062;BA.debugLine="If lastcode <> \"\" Then";
if ((_lastcode).equals("") == false) { 
 //BA.debugLineNum = 1063;BA.debugLine="lastcode = lastcode.Replace(\"<br>\", CRLF)";
_lastcode = _lastcode.replace("<br>",anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 1064;BA.debugLine="pg.SaveText2File(lastcode,\"BWFD.txt\")";
_pg._savetext2file /*String*/ (_lastcode,"BWFD.txt");
 };
 //BA.debugLineNum = 1066;BA.debugLine="End Sub";
return "";
}
public static boolean  _drawpropbag(String _con) throws Exception{
 //BA.debugLineNum = 1310;BA.debugLine="Sub DrawPropBag(con As String) As Boolean";
 //BA.debugLineNum = 1311;BA.debugLine="Select Case con";
switch (BA.switchObjectToInt(_con,"connection","form","row","column","button","checkbox","colorpicker","combo","counter","datepicker","icon","label","radio","richselect","search","select","segmented","slider","switch","tabbar","text","textarea","toggle","uploader","dbllist","fieldset","suggest","forminput","pager")) {
case 0: {
 //BA.debugLineNum = 1313;BA.debugLine="dConnection.BuildBag(pg, propBag)";
_dconnection._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 1314;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
case 1: {
 //BA.debugLineNum = 1316;BA.debugLine="dForm.BuildBag(pg, propBag)";
_dform._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 1317;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
case 2: {
 //BA.debugLineNum = 1319;BA.debugLine="dRow.BuildBag(pg, propBag)";
_drow._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 1320;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
case 3: {
 //BA.debugLineNum = 1322;BA.debugLine="dColumn.BuildBag(pg, propBag)";
_dcolumn._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 1323;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
case 4: {
 //BA.debugLineNum = 1325;BA.debugLine="dButton.BuildBag(pg, propBag)";
_dbutton._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 1326;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
case 5: {
 //BA.debugLineNum = 1328;BA.debugLine="dCheckBox.BuildBag(pg, propBag)";
_dcheckbox._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 1329;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
case 6: {
 //BA.debugLineNum = 1331;BA.debugLine="dColorPicker.BuildBag(pg, propBag)";
_dcolorpicker._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 1332;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
case 7: {
 //BA.debugLineNum = 1334;BA.debugLine="dCombo.BuildBag(pg, propBag)";
_dcombo._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 1335;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
case 8: {
 //BA.debugLineNum = 1337;BA.debugLine="dCounter.BuildBag(pg, propBag)";
_dcounter._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 1338;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
case 9: {
 //BA.debugLineNum = 1340;BA.debugLine="dDatePicker.BuildBag(pg, propBag)";
_ddatepicker._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 1341;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
case 10: {
 //BA.debugLineNum = 1343;BA.debugLine="dIcon.BuildBag(pg, propBag)";
_dicon._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 1344;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
case 11: {
 //BA.debugLineNum = 1346;BA.debugLine="dLabel.BuildBag(pg, propBag)";
_dlabel._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 1347;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
case 12: {
 //BA.debugLineNum = 1349;BA.debugLine="dRadio.BuildBag(pg, propBag)";
_dradio._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 1350;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
case 13: {
 //BA.debugLineNum = 1352;BA.debugLine="dRichSelect.BuildBag(pg, propBag)";
_drichselect._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 1353;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
case 14: {
 //BA.debugLineNum = 1355;BA.debugLine="dSearch.BuildBag(pg, propBag)";
_dsearch._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 1356;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
case 15: {
 //BA.debugLineNum = 1358;BA.debugLine="dSelect.BuildBag(pg, propBag)";
_dselect._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 1359;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
case 16: {
 //BA.debugLineNum = 1361;BA.debugLine="dSegmented.BuildBag(pg, propBag)";
_dsegmented._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 1362;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
case 17: {
 //BA.debugLineNum = 1364;BA.debugLine="dSlider.BuildBag(pg, propBag)";
_dslider._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 1365;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
case 18: {
 //BA.debugLineNum = 1367;BA.debugLine="dSwitch.BuildBag(pg, propBag)";
_dswitch._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 1368;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
case 19: {
 //BA.debugLineNum = 1370;BA.debugLine="dTabBar.BuildBag(pg, propBag)";
_dtabbar._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 1371;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
case 20: {
 //BA.debugLineNum = 1373;BA.debugLine="dText.BuildBag(pg, propBag)";
_dtext._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 1374;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
case 21: {
 //BA.debugLineNum = 1376;BA.debugLine="dTextArea.BuildBag(pg, propBag)";
_dtextarea._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 1377;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
case 22: {
 //BA.debugLineNum = 1379;BA.debugLine="dToggle.BuildBag(pg, propBag)";
_dtoggle._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 1380;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
case 23: {
 //BA.debugLineNum = 1382;BA.debugLine="dUploader.BuildBag(pg, propBag)";
_duploader._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 1383;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
case 24: {
 //BA.debugLineNum = 1385;BA.debugLine="dDBLList.BuildBag(pg, propBag)";
_ddbllist._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 1386;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
case 25: {
 //BA.debugLineNum = 1388;BA.debugLine="dFieldSet.BuildBag(pg, propBag)";
_dfieldset._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 1389;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
case 26: {
 //BA.debugLineNum = 1391;BA.debugLine="dSuggest.BuildBag(pg, propBag)";
_dsuggest._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 1392;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
case 27: {
 break; }
case 28: {
 //BA.debugLineNum = 1395;BA.debugLine="dPager.BuildBag(pg, propBag)";
_dpager._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 1396;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
}
;
 //BA.debugLineNum = 1398;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 1399;BA.debugLine="End Sub";
return false;
}
public static String  _fieldschange() throws Exception{
String _scontrols = "";
int _ccount = 0;
 //BA.debugLineNum = 1665;BA.debugLine="Sub fieldschange()";
 //BA.debugLineNum = 1666;BA.debugLine="Dim scontrols As String = pg.GetValue(\"txtmultipl";
_scontrols = _pg._getvalue /*String*/ ("txtmultiplefields");
 //BA.debugLineNum = 1667;BA.debugLine="scontrols = scontrols.trim";
_scontrols = _scontrols.trim();
 //BA.debugLineNum = 1668;BA.debugLine="If scontrols = \"\" Then";
if ((_scontrols).equals("")) { 
 //BA.debugLineNum = 1669;BA.debugLine="pg.Define(\"btnMulti1\", CreateMap(\"badge\":\"0\"))";
_pg._define /*String*/ ("btnMulti1",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("badge"),(Object)("0")}));
 //BA.debugLineNum = 1670;BA.debugLine="pg.Refresh(\"btnMulti1\")";
_pg._refresh /*String*/ ("btnMulti1");
 }else {
 //BA.debugLineNum = 1672;BA.debugLine="Dim cCount As Int = pg.MvCount(scontrols, \",\")";
_ccount = _pg._mvcount /*int*/ (_scontrols,",");
 //BA.debugLineNum = 1673;BA.debugLine="pg.Define(\"btnMulti1\", CreateMap(\"badge\":cCount)";
_pg._define /*String*/ ("btnMulti1",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("badge"),(Object)(_ccount)}));
 //BA.debugLineNum = 1674;BA.debugLine="pg.Refresh(\"btnMulti1\")";
_pg._refresh /*String*/ ("btnMulti1");
 };
 //BA.debugLineNum = 1676;BA.debugLine="End Sub";
return "";
}
public static String  _formcode(String _id,boolean _bshowpropbag) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _sparentid = "";
String _saddingmethod = "";
anywheresoftware.b4a.objects.collections.List _rows = null;
anywheresoftware.b4a.objects.collections.List _columns = null;
anywheresoftware.b4a.objects.collections.List _elements = null;
anywheresoftware.b4a.objects.collections.List _cols = null;
anywheresoftware.b4a.objects.collections.List _cells = null;
anywheresoftware.b4a.objects.collections.Map _view = null;
String _sc = "";
anywheresoftware.b4a.objects.collections.Map _item = null;
anywheresoftware.b4a.objects.collections.Map _itemmap = null;
anywheresoftware.b4a.objects.collections.Map _view1 = null;
String _childaddingmethod = "";
 //BA.debugLineNum = 950;BA.debugLine="Sub FormCode(id As String, bShowPropBag As Boolean";
 //BA.debugLineNum = 951;BA.debugLine="ClearPreviewIT";
_clearpreviewit();
 //BA.debugLineNum = 952;BA.debugLine="ClearCodeIT";
_clearcodeit();
 //BA.debugLineNum = 953;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 954;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 955;BA.debugLine="rec.initialize";
_rec.Initialize();
 //BA.debugLineNum = 956;BA.debugLine="Select Case id";
switch (BA.switchObjectToInt(_id,"form")) {
case 0: {
 //BA.debugLineNum = 959;BA.debugLine="sqlite.Initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 960;BA.debugLine="sqlite.AddStrings(Array(\"id\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 961;BA.debugLine="qry = sqlite.SelectWhere(\"forms\", Array(\"*\"), Cr";
_qry = _sqlite._selectwhere /*String*/ ("forms",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("*")}),anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)("form")}),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 962;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\", C";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 963;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 964;BA.debugLine="If rs.result.Size = 0 Then";
if (_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
 }else {
 //BA.debugLineNum = 967;BA.debugLine="rec = rs.result.Get(0)";
_rec.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0))));
 //BA.debugLineNum = 968;BA.debugLine="json = rec.Get(\"json\")";
_json = BA.ObjectToString(_rec.Get((Object)("json")));
 //BA.debugLineNum = 969;BA.debugLine="rec = pg.Json2Map(json)";
_rec = _pg._json2map /*anywheresoftware.b4a.objects.collections.Map*/ (_json);
 };
 break; }
default: {
 //BA.debugLineNum = 972;BA.debugLine="sqlite.Initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 973;BA.debugLine="sqlite.AddStrings(Array(\"id\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 974;BA.debugLine="qry = sqlite.SelectWhere(\"items\", Array(\"*\"), Cr";
_qry = _sqlite._selectwhere /*String*/ ("items",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("*")}),anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(_id)}),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 975;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\", C";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 976;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 977;BA.debugLine="If rs.result.Size = 0 Then";
if (_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
 }else {
 //BA.debugLineNum = 980;BA.debugLine="rec = rs.result.Get(0)";
_rec.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0))));
 //BA.debugLineNum = 981;BA.debugLine="json = rec.Get(\"json\")";
_json = BA.ObjectToString(_rec.Get((Object)("json")));
 //BA.debugLineNum = 982;BA.debugLine="rec = pg.Json2Map(json)";
_rec = _pg._json2map /*anywheresoftware.b4a.objects.collections.Map*/ (_json);
 };
 break; }
}
;
 //BA.debugLineNum = 986;BA.debugLine="If bShowPropBag Then";
if (_bshowpropbag) { 
 //BA.debugLineNum = 987;BA.debugLine="rec = pg.Json2Map(json)";
_rec = _pg._json2map /*anywheresoftware.b4a.objects.collections.Map*/ (_json);
 //BA.debugLineNum = 988;BA.debugLine="pg.SetValues(\"propbag\", rec)";
_pg._setvalues /*String*/ ("propbag",_rec);
 };
 //BA.debugLineNum = 991;BA.debugLine="Dim sparentid As String = rec.GetDefault(\"parenti";
_sparentid = BA.ObjectToString(_rec.GetDefault((Object)("parentid"),(Object)("")));
 //BA.debugLineNum = 992;BA.debugLine="Dim saddingmethod As String = rec.GetDefault(\"add";
_saddingmethod = BA.ObjectToString(_rec.GetDefault((Object)("addingmethod"),(Object)("")));
 //BA.debugLineNum = 994;BA.debugLine="sqlite.Initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 995;BA.debugLine="sqlite.AddStrings(Array(\"id\", \"parentid\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id"),(Object)("parentid")}));
 //BA.debugLineNum = 996;BA.debugLine="qry = sqlite.SelectWhere(\"items\", Array(\"*\"), Cre";
_qry = _sqlite._selectwhere /*String*/ ("items",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("*")}),anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("parentid"),(Object)(_id)}),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("tabindex")}));
 //BA.debugLineNum = 997;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\", Cr";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 998;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 1000;BA.debugLine="Dim rows As List";
_rows = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1001;BA.debugLine="rows.initialize";
_rows.Initialize();
 //BA.debugLineNum = 1002;BA.debugLine="Dim columns As List";
_columns = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1003;BA.debugLine="columns.initialize";
_columns.Initialize();
 //BA.debugLineNum = 1004;BA.debugLine="Dim elements As List";
_elements = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1005;BA.debugLine="elements.Initialize";
_elements.Initialize();
 //BA.debugLineNum = 1006;BA.debugLine="Dim cols As List";
_cols = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1007;BA.debugLine="cols.initialize";
_cols.Initialize();
 //BA.debugLineNum = 1008;BA.debugLine="Dim cells As List";
_cells = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1009;BA.debugLine="cells.Initialize";
_cells.Initialize();
 //BA.debugLineNum = 1011;BA.debugLine="rec.Put(\"container\", \"previewit\")";
_rec.Put((Object)("container"),(Object)("previewit"));
 //BA.debugLineNum = 1012;BA.debugLine="Dim view As Map = CreateView(rec)";
_view = new anywheresoftware.b4a.objects.collections.Map();
_view = _createview(_rec);
 //BA.debugLineNum = 1013;BA.debugLine="Dim sc As String = SourceCodeItem(view,Null)";
_sc = _sourcecodeitem(_view,(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(anywheresoftware.b4a.keywords.Common.Null)));
 //BA.debugLineNum = 1015;BA.debugLine="sb.append(sc).Append(CRLF).Append(CRLF)";
_sb.Append(_sc).Append(anywheresoftware.b4a.keywords.Common.CRLF).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 1018;BA.debugLine="For Each item As Map In rs.result";
_item = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group57 = _rs.result /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen57 = group57.getSize()
;int index57 = 0;
;
for (; index57 < groupLen57;index57++){
_item.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group57.Get(index57)));
 //BA.debugLineNum = 1019;BA.debugLine="Dim json As String = item.Get(\"json\")";
_json = BA.ObjectToString(_item.Get((Object)("json")));
 //BA.debugLineNum = 1020;BA.debugLine="Dim itemmap As Map = pg.Json2Map(json)";
_itemmap = new anywheresoftware.b4a.objects.collections.Map();
_itemmap = _pg._json2map /*anywheresoftware.b4a.objects.collections.Map*/ (_json);
 //BA.debugLineNum = 1021;BA.debugLine="Dim view1 As Map = CreateView(itemmap)";
_view1 = new anywheresoftware.b4a.objects.collections.Map();
_view1 = _createview(_itemmap);
 //BA.debugLineNum = 1022;BA.debugLine="Dim sc As String = SourceCodeItem(view1,itemmap)";
_sc = _sourcecodeitem(_view1,_itemmap);
 //BA.debugLineNum = 1023;BA.debugLine="sb.append(sc).append(CRLF).Append(CRLF)";
_sb.Append(_sc).Append(anywheresoftware.b4a.keywords.Common.CRLF).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 1025;BA.debugLine="Dim childaddingmethod As String = itemmap.GetDef";
_childaddingmethod = BA.ObjectToString(_itemmap.GetDefault((Object)("addingmethod"),(Object)("")));
 //BA.debugLineNum = 1026;BA.debugLine="Select Case childaddingmethod";
switch (BA.switchObjectToInt(_childaddingmethod,"AddRows","AddDataColumns","AddElements","AddColumns","AddCells")) {
case 0: {
 //BA.debugLineNum = 1028;BA.debugLine="rows.add(view1)";
_rows.Add((Object)(_view1.getObject()));
 break; }
case 1: {
 //BA.debugLineNum = 1030;BA.debugLine="columns.Add(view1)";
_columns.Add((Object)(_view1.getObject()));
 break; }
case 2: {
 //BA.debugLineNum = 1032;BA.debugLine="elements.Add(view1)";
_elements.Add((Object)(_view1.getObject()));
 break; }
case 3: {
 //BA.debugLineNum = 1034;BA.debugLine="cols.add(view1)";
_cols.Add((Object)(_view1.getObject()));
 break; }
case 4: {
 //BA.debugLineNum = 1036;BA.debugLine="cells.Add(view1)";
_cells.Add((Object)(_view1.getObject()));
 break; }
}
;
 }
};
 //BA.debugLineNum = 1040;BA.debugLine="If rows.size > 0 Then view.put(\"rows\", rows)";
if (_rows.getSize()>0) { 
_view.Put((Object)("rows"),(Object)(_rows.getObject()));};
 //BA.debugLineNum = 1041;BA.debugLine="If columns.size > 0 Then view.put(\"columns\", colu";
if (_columns.getSize()>0) { 
_view.Put((Object)("columns"),(Object)(_columns.getObject()));};
 //BA.debugLineNum = 1042;BA.debugLine="If elements.Size > 0 Then view.put(\"elements\", el";
if (_elements.getSize()>0) { 
_view.Put((Object)("elements"),(Object)(_elements.getObject()));};
 //BA.debugLineNum = 1043;BA.debugLine="If cols.Size > 0 Then view.Put(\"cols\", cols)";
if (_cols.getSize()>0) { 
_view.Put((Object)("cols"),(Object)(_cols.getObject()));};
 //BA.debugLineNum = 1044;BA.debugLine="If cells.Size > 0 Then view.Put(\"cells\", cells)";
if (_cells.getSize()>0) { 
_view.Put((Object)("cells"),(Object)(_cells.getObject()));};
 //BA.debugLineNum = 1046;BA.debugLine="If sparentid <> \"\" Then";
if ((_sparentid).equals("") == false) { 
 //BA.debugLineNum = 1047;BA.debugLine="sb.Append(sparentid).Append(\".\").Append(saddingm";
_sb.Append(_sparentid).Append(".").Append(_saddingmethod).Append("(").Append(_id).Append(".Item)");
 };
 //BA.debugLineNum = 1049;BA.debugLine="SourceCodePreview(sb.ToString)";
_sourcecodepreview(_sb.ToString());
 //BA.debugLineNum = 1051;BA.debugLine="Select Case id";
switch (BA.switchObjectToInt(_id,"form")) {
case 0: {
 //BA.debugLineNum = 1053;BA.debugLine="If rs.result.Size > 0 Then";
if (_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
 //BA.debugLineNum = 1054;BA.debugLine="drawn = pg.UX(view)";
_drawn = _pg._ux /*com.ab.banano.BANanoObject*/ (_view);
 };
 break; }
default: {
 //BA.debugLineNum = 1057;BA.debugLine="drawn = pg.UX(view)";
_drawn = _pg._ux /*com.ab.banano.BANanoObject*/ (_view);
 break; }
}
;
 //BA.debugLineNum = 1059;BA.debugLine="End Sub";
return "";
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
 //BA.debugLineNum = 24;BA.debugLine="Sub Init()";
 //BA.debugLineNum = 25;BA.debugLine="addingmethod.Initialize";
_addingmethod.Initialize();
 //BA.debugLineNum = 26;BA.debugLine="addingmethod.AddAll(Array(\"\",\"AddRows\",\"AddColumn";
_addingmethod.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(""),(Object)("AddRows"),(Object)("AddColumns"),(Object)("AddElements"),(Object)("AddDataColumns"),(Object)("AddCells")}));
 //BA.debugLineNum = 28;BA.debugLine="dbName = Main.dbname";
_dbname = _main._dbname /*String*/ ;
 //BA.debugLineNum = 30;BA.debugLine="pg.Initialize(\"wp\", \"body\").SetTypeSpace(\"\").SetR";
_pg._initialize /*b4j.example.wixpage*/ (ba,"wp","body")._settypespace /*b4j.example.wixpage*/ ("")._setresponsive /*b4j.example.wixpage*/ ((Object)(anywheresoftware.b4a.keywords.Common.True))._setappname /*b4j.example.wixpage*/ (_main._appname /*String*/ );
 //BA.debugLineNum = 34;BA.debugLine="Dim tblBar As WixToolBar = modToolBar.getToolBar";
_tblbar = _modtoolbar._gettoolbar /*b4j.example.wixtoolbar*/ ();
 //BA.debugLineNum = 35;BA.debugLine="pg.AddToolBar(tblBar)";
_pg._addtoolbar /*String*/ (_tblbar);
 //BA.debugLineNum = 37;BA.debugLine="hints.Initialize(\"hints\")";
_hints._initialize /*b4j.example.wixhint*/ (ba,"hints");
 //BA.debugLineNum = 38;BA.debugLine="hints.AddStep(\"heading\",\"Welcome\",\"Welcome to the";
_hints._addstep /*b4j.example.wixhint*/ ("heading","Welcome","Welcome to the BANanoWebix - Form Designer","click");
 //BA.debugLineNum = 39;BA.debugLine="hints.AddStep(\"menuopen\",\"Side Bar\",\"You can togg";
_hints._addstep /*b4j.example.wixhint*/ ("menuopen","Side Bar","You can toggle the side bar menu to access elements that you can design","click");
 //BA.debugLineNum = 40;BA.debugLine="hints.AddStep(\"smp\",\"Side Bar\", \"This lists all e";
_hints._addstep /*b4j.example.wixhint*/ ("smp","Side Bar","This lists all elements that you can design with the BANanoWebix-FD. First you need to create a form. To create a form, select Layouts and select Form, this will add the form properties on the bag.","click");
 //BA.debugLineNum = 41;BA.debugLine="hints.AddStep(\"propform\",\"Property\", \"The form de";
_hints._addstep /*b4j.example.wixhint*/ ("propform","Property","The form details will appear here, update the settings you need for the form","click");
 //BA.debugLineNum = 42;BA.debugLine="hints.AddStep(\"propsave\",\"Save Form/Element\", \"Af";
_hints._addstep /*b4j.example.wixhint*/ ("propsave","Save Form/Element","After you have updated the properties of the design element you are working with, select Save here to save the element's properties for later updating.","click");
 //BA.debugLineNum = 43;BA.debugLine="hints.AddStep(\"propdelete\",\"Delete Design\", \"You";
_hints._addstep /*b4j.example.wixhint*/ ("propdelete","Delete Design","You can delete a saved design element by selecting this option. You are unable to undo changes if you delete","click");
 //BA.debugLineNum = 44;BA.debugLine="hints.AddStep(\"tree\",\"Tree\", \"After you save your";
_hints._addstep /*b4j.example.wixhint*/ ("tree","Tree","After you save your element in the property bag, it will be listed under the parent element you chose for it here and you can select and update its properties again if you want.","click");
 //BA.debugLineNum = 45;BA.debugLine="hints.AddStep(\"formholder\",\"Preview & Source Code";
_hints._addstep /*b4j.example.wixhint*/ ("formholder","Preview & Source Code","The result of your design element during design will be shown here & the source code to use in your BANanoWebix project","click");
 //BA.debugLineNum = 48;BA.debugLine="hints.AddStep(\"refresh\",\"Refresh\",\"To refresh the";
_hints._addstep /*b4j.example.wixhint*/ ("refresh","Refresh","To refresh the tree, select this option","click");
 //BA.debugLineNum = 50;BA.debugLine="hints.AddStep(\"help\",\"Hints\", \"You can access the";
_hints._addstep /*b4j.example.wixhint*/ ("help","Hints","You can access the hints from here too","click");
 //BA.debugLineNum = 51;BA.debugLine="hints.AddStep(\"collab\",\"Collaborate\", \"You can co";
_hints._addstep /*b4j.example.wixhint*/ ("collab","Collaborate","You can collaborate here when the need arises.","click");
 //BA.debugLineNum = 59;BA.debugLine="Dim sm As WixSideBar = modSideBar.getSideBar";
_sm = _modsidebar._getsidebar /*b4j.example.wixsidebar*/ ();
 //BA.debugLineNum = 61;BA.debugLine="Dim R2 As WixRow";
_r2 = new b4j.example.wixrow();
 //BA.debugLineNum = 62;BA.debugLine="R2.Initialize(\"R2\")";
_r2._initialize /*b4j.example.wixrow*/ (ba,"R2");
 //BA.debugLineNum = 64;BA.debugLine="R2.AddColumns(sm.Item)";
_r2._addcolumns /*b4j.example.wixrow*/ (_sm._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 67;BA.debugLine="Dim tree As WixTree";
_tree = new b4j.example.wixtree();
 //BA.debugLineNum = 68;BA.debugLine="tree.Initialize(\"tree\").SetSelect(True).SetScroll";
_tree._initialize /*b4j.example.wixtree*/ (ba,"tree")._setselect /*b4j.example.wixtree*/ (anywheresoftware.b4a.keywords.Common.True)._setscroll /*b4j.example.wixtree*/ ((Object)(anywheresoftware.b4a.keywords.Common.True))._setwidth /*b4j.example.wixtree*/ ((Object)(300))._settypelinetree /*b4j.example.wixtree*/ (anywheresoftware.b4a.keywords.Common.True)._setborderless /*b4j.example.wixtree*/ (anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 70;BA.debugLine="R2.AddColumns(tree.Item)";
_r2._addcolumns /*b4j.example.wixrow*/ (_tree._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 71;BA.debugLine="R2.CreateResizer(\"\").AddToColumns(R2.Row)";
_r2._createresizer /*b4j.example.wixresizer*/ ("")._addtocolumns /*String*/ (_r2._row /*b4j.example.wixelement*/ );
 //BA.debugLineNum = 74;BA.debugLine="propBag.Initialize(\"propbag\").SetWidth(300).setna";
_propbag._initialize /*b4j.example.wixproperty*/ (ba,"propbag")._setwidth /*b4j.example.wixproperty*/ ((Object)(300))._setnamewidth /*b4j.example.wixproperty*/ ((int) (150))._setscroll /*b4j.example.wixproperty*/ ((Object)(anywheresoftware.b4a.keywords.Common.True));
 //BA.debugLineNum = 75;BA.debugLine="Dim frm As WixForm = modPropertyBag.getPropertyBa";
_frm = _modpropertybag._getpropertybag /*b4j.example.wixform*/ ();
 //BA.debugLineNum = 76;BA.debugLine="R2.AddColumns(frm.Item)";
_r2._addcolumns /*b4j.example.wixrow*/ (_frm._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 77;BA.debugLine="R2.CreateResizer(\"\").AddToColumns(R2.Row)";
_r2._createresizer /*b4j.example.wixresizer*/ ("")._addtocolumns /*String*/ (_r2._row /*b4j.example.wixelement*/ );
 //BA.debugLineNum = 79;BA.debugLine="Dim formholder As WixRow = modCenter.getCenter";
_formholder = _modcenter._getcenter /*b4j.example.wixrow*/ ();
 //BA.debugLineNum = 81;BA.debugLine="R2.AddColumns(formholder.Item)";
_r2._addcolumns /*b4j.example.wixrow*/ (_formholder._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 82;BA.debugLine="pg.AddRow(R2)";
_pg._addrow /*String*/ (_r2);
 //BA.debugLineNum = 84;BA.debugLine="pg.ui";
_pg._ui /*String*/ ();
 //BA.debugLineNum = 86;BA.debugLine="pg.Hide(\"propadd\")";
_pg._hide /*String*/ ("propadd");
 //BA.debugLineNum = 87;BA.debugLine="pg.Hide(\"add_row\")";
_pg._hide /*String*/ ("add_row");
 //BA.debugLineNum = 88;BA.debugLine="pg.Hide(\"add_column\")";
_pg._hide /*String*/ ("add_column");
 //BA.debugLineNum = 89;BA.debugLine="pg.Hide(\"add_fields\")";
_pg._hide /*String*/ ("add_fields");
 //BA.debugLineNum = 90;BA.debugLine="pg.Hide(\"download\")";
_pg._hide /*String*/ ("download");
 //BA.debugLineNum = 93;BA.debugLine="Dim meid As Map";
_meid = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 94;BA.debugLine="pg.OnItemClick(\"smp\", BANano.CallBack(Me, \"sideba";
_pg._onitemclick /*String*/ ("smp",(com.ab.banano.BANanoObject)(_banano.CallBack(pgformdesigner.getObject(),"sidebar_click",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_meid.getObject())}))));
 //BA.debugLineNum = 96;BA.debugLine="Dim recid As String";
_recid = "";
 //BA.debugLineNum = 97;BA.debugLine="pg.OnItemClick(\"tree\", BANano.CallBack(Me, \"tree_";
_pg._onitemclick /*String*/ ("tree",(com.ab.banano.BANanoObject)(_banano.CallBack(pgformdesigner.getObject(),"tree_clickwait",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_recid)}))));
 //BA.debugLineNum = 99;BA.debugLine="pg.OnAfterEditStop(\"propbag\", BANano.CallBack(Me,";
_pg._onaftereditstop /*String*/ ("propbag",(com.ab.banano.BANanoObject)(_banano.CallBack(pgformdesigner.getObject(),"prop_saveWait",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)))));
 //BA.debugLineNum = 100;BA.debugLine="pg.OnCheck(\"propbag\",BANano.CallBack(Me, \"prop_sa";
_pg._oncheck /*String*/ ("propbag",(com.ab.banano.BANanoObject)(_banano.CallBack(pgformdesigner.getObject(),"prop_saveWait",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)))));
 //BA.debugLineNum = 102;BA.debugLine="RefreshTreeWait";
_refreshtreewait();
 //BA.debugLineNum = 105;BA.debugLine="pg.StartHint(hints)";
_pg._starthint /*String*/ (_hints);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return "";
}
public static String  _multichange() throws Exception{
String _scontrols = "";
int _ccount = 0;
 //BA.debugLineNum = 1580;BA.debugLine="Sub multichange()";
 //BA.debugLineNum = 1581;BA.debugLine="Dim scontrols As String = pg.GetValue(\"txtmultipl";
_scontrols = _pg._getvalue /*String*/ ("txtmultiplecontrols");
 //BA.debugLineNum = 1582;BA.debugLine="scontrols = scontrols.trim";
_scontrols = _scontrols.trim();
 //BA.debugLineNum = 1583;BA.debugLine="If scontrols = \"\" Then";
if ((_scontrols).equals("")) { 
 //BA.debugLineNum = 1584;BA.debugLine="pg.Define(\"btnMulti\", CreateMap(\"badge\":\"0\"))";
_pg._define /*String*/ ("btnMulti",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("badge"),(Object)("0")}));
 //BA.debugLineNum = 1585;BA.debugLine="pg.Refresh(\"btnMulti\")";
_pg._refresh /*String*/ ("btnMulti");
 }else {
 //BA.debugLineNum = 1587;BA.debugLine="Dim cCount As Int = pg.MvCount(scontrols, \",\")";
_ccount = _pg._mvcount /*int*/ (_scontrols,",");
 //BA.debugLineNum = 1588;BA.debugLine="pg.Define(\"btnMulti\", CreateMap(\"badge\":cCount))";
_pg._define /*String*/ ("btnMulti",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("badge"),(Object)(_ccount)}));
 //BA.debugLineNum = 1589;BA.debugLine="pg.Refresh(\"btnMulti\")";
_pg._refresh /*String*/ ("btnMulti");
 };
 //BA.debugLineNum = 1591;BA.debugLine="End Sub";
return "";
}
public static String  _multiels() throws Exception{
String _parentid = "";
 //BA.debugLineNum = 117;BA.debugLine="Sub multiels";
 //BA.debugLineNum = 119;BA.debugLine="Dim parentid As String = pg.GetSelectedID(\"tree\")";
_parentid = BA.ObjectToString(_pg._getselectedid /*b4j.example.wixpage._wixselectedid*/ ("tree"));
 //BA.debugLineNum = 120;BA.debugLine="If parentid = \"\" Then";
if ((_parentid).equals("")) { 
 //BA.debugLineNum = 121;BA.debugLine="pg.Message_Error(\"Please select the parent item";
_pg._message_error /*String*/ ("Please select the parent item from the tree first, then select the element you want to add! Remember to click Save in the property bag when done.");
 //BA.debugLineNum = 122;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 124;BA.debugLine="pg.boShow(CreateWindow)";
_pg._boshow /*String*/ (_createwindow());
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return "";
}
public static String  _openmenu() throws Exception{
 //BA.debugLineNum = 1401;BA.debugLine="Sub OpenMenu()";
 //BA.debugLineNum = 1402;BA.debugLine="pg.Toggle(\"smp\")";
_pg._toggle /*String*/ ("smp");
 //BA.debugLineNum = 1403;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 20;BA.debugLine="Private fldWin As BANanoObject";
_fldwin = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 21;BA.debugLine="Private lastcode As String";
_lastcode = "";
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return "";
}
public static String  _prop_add() throws Exception{
anywheresoftware.b4a.objects.collections.Map _cm = null;
String _pid = "";
String _value = "";
String _tablename = "";
String _k = "";
 //BA.debugLineNum = 361;BA.debugLine="Sub prop_add";
 //BA.debugLineNum = 362;BA.debugLine="Dim cm As Map = pg.GetValues(\"propbag\")";
_cm = new anywheresoftware.b4a.objects.collections.Map();
_cm = _pg._getvalues /*anywheresoftware.b4a.objects.collections.Map*/ ("propbag");
 //BA.debugLineNum = 363;BA.debugLine="Dim pid As String = cm.GetDefault(\"id\",\"\")";
_pid = BA.ObjectToString(_cm.GetDefault((Object)("id"),(Object)("")));
 //BA.debugLineNum = 364;BA.debugLine="Dim value As String = cm.GetDefault(\"value\",\"\")";
_value = BA.ObjectToString(_cm.GetDefault((Object)("value"),(Object)("")));
 //BA.debugLineNum = 365;BA.debugLine="Dim tablename As String = cm.GetDefault(\"tablenam";
_tablename = BA.ObjectToString(_cm.GetDefault((Object)("tablename"),(Object)("")));
 //BA.debugLineNum = 366;BA.debugLine="Select Case pid";
switch (BA.switchObjectToInt(_pid,"connection","table","field")) {
case 0: {
 //BA.debugLineNum = 369;BA.debugLine="sidebar_click(\"table\")";
_sidebar_click("table");
 break; }
case 1: {
 //BA.debugLineNum = 372;BA.debugLine="sidebar_click(\"field\")";
_sidebar_click("field");
 break; }
case 2: {
 //BA.debugLineNum = 375;BA.debugLine="Dim k As String = $\"table.${tablename}\"$";
_k = ("table."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tablename))+"");
 //BA.debugLineNum = 377;BA.debugLine="pg.SelectItem(\"tree\", k)";
_pg._selectitem /*String*/ ("tree",_k);
 //BA.debugLineNum = 378;BA.debugLine="sidebar_click(\"field\")";
_sidebar_click("field");
 break; }
default: {
 //BA.debugLineNum = 381;BA.debugLine="sidebar_click(\"text\")";
_sidebar_click("text");
 break; }
}
;
 //BA.debugLineNum = 383;BA.debugLine="End Sub";
return "";
}
public static String  _prop_delete() throws Exception{
anywheresoftware.b4a.objects.collections.Map _rp = null;
boolean _confirmresult = false;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 585;BA.debugLine="Sub prop_delete";
 //BA.debugLineNum = 586;BA.debugLine="Dim rp As Map = pg.GetValues(\"propbag\")";
_rp = new anywheresoftware.b4a.objects.collections.Map();
_rp = _pg._getvalues /*anywheresoftware.b4a.objects.collections.Map*/ ("propbag");
 //BA.debugLineNum = 587;BA.debugLine="delID = rp.Get(\"id\")";
_delid = BA.ObjectToString(_rp.Get((Object)("id")));
 //BA.debugLineNum = 588;BA.debugLine="If delID = \"\" Then Return";
if ((_delid).equals("")) { 
if (true) return "";};
 //BA.debugLineNum = 590;BA.debugLine="Dim confirmresult As Boolean = False";
_confirmresult = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 591;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Me,\"dele";
_cb = (com.ab.banano.BANanoObject)(_banano.CallBack(pgformdesigner.getObject(),"deletepropwait",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_confirmresult)})));
 //BA.debugLineNum = 592;BA.debugLine="pg.Confirm(cb, \"Confirm Delete\", \"Are you sure th";
_pg._confirm /*String*/ (_cb,"Confirm Delete","Are you sure that you want to delete this item? You will not be able to undo your changes. Continue?");
 //BA.debugLineNum = 593;BA.debugLine="End Sub";
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
boolean _bexist = false;
 //BA.debugLineNum = 386;BA.debugLine="Sub prop_saveWait";
 //BA.debugLineNum = 388;BA.debugLine="Dim prop As Map = pg.GetValues(\"propbag\")";
_prop = new anywheresoftware.b4a.objects.collections.Map();
_prop = _pg._getvalues /*anywheresoftware.b4a.objects.collections.Map*/ ("propbag");
 //BA.debugLineNum = 389;BA.debugLine="Dim v As String = prop.GetDefault(\"view\",\"\")";
_v = BA.ObjectToString(_prop.GetDefault((Object)("view"),(Object)("")));
 //BA.debugLineNum = 390;BA.debugLine="Dim i As String = prop.Get(\"id\")";
_i = BA.ObjectToString(_prop.Get((Object)("id")));
 //BA.debugLineNum = 391;BA.debugLine="Dim value As String = prop.GetDefault(\"value\",\"\")";
_value = BA.ObjectToString(_prop.GetDefault((Object)("value"),(Object)("")));
 //BA.debugLineNum = 392;BA.debugLine="Dim tablename As String = prop.GetDefault(\"tablen";
_tablename = BA.ObjectToString(_prop.GetDefault((Object)("tablename"),(Object)("")));
 //BA.debugLineNum = 393;BA.debugLine="Dim autoincrement As String = prop.GetDefault(\"au";
_autoincrement = BA.ObjectToString(_prop.GetDefault((Object)("autoincrement"),(Object)("")));
 //BA.debugLineNum = 394;BA.debugLine="Dim primarykey As String = prop.GetDefault(\"prima";
_primarykey = BA.ObjectToString(_prop.GetDefault((Object)("primarykey"),(Object)("")));
 //BA.debugLineNum = 397;BA.debugLine="i = i.tolowercase";
_i = _i.toLowerCase();
 //BA.debugLineNum = 398;BA.debugLine="prop.Put(\"id\", i)";
_prop.Put((Object)("id"),(Object)(_i));
 //BA.debugLineNum = 399;BA.debugLine="Dim p As String = prop.GetDefault(\"parentid\",\"\")";
_p = BA.ObjectToString(_prop.GetDefault((Object)("parentid"),(Object)("")));
 //BA.debugLineNum = 400;BA.debugLine="If p <> \"\" Then";
if ((_p).equals("") == false) { 
 //BA.debugLineNum = 401;BA.debugLine="p = p.ToLowerCase";
_p = _p.toLowerCase();
 //BA.debugLineNum = 402;BA.debugLine="prop.Put(\"parentid\", p)";
_prop.Put((Object)("parentid"),(Object)(_p));
 };
 //BA.debugLineNum = 404;BA.debugLine="Dim idx As String = prop.getdefault(\"tabindex\",\"0";
_idx = BA.ObjectToString(_prop.GetDefault((Object)("tabindex"),(Object)("0")));
 //BA.debugLineNum = 406;BA.debugLine="json = BANano.ToJson(prop)";
_json = BA.ObjectToString(_banano.ToJson((Object)(_prop.getObject())));
 //BA.debugLineNum = 408;BA.debugLine="Select Case i";
switch (BA.switchObjectToInt(_i,"field","table","connection","form")) {
case 0: {
 //BA.debugLineNum = 410;BA.debugLine="pg.Collapse(\"preview\")";
_pg._collapse /*String*/ ("preview");
 //BA.debugLineNum = 412;BA.debugLine="Dim key As String = $\"field.${tablename}.${value";
_key = ("field."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tablename))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_value))+"");
 //BA.debugLineNum = 413;BA.debugLine="sqlite.Initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 414;BA.debugLine="sqlite.AddStrings(Array(\"id\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 416;BA.debugLine="rec = CreateMap()";
_rec = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {});
 //BA.debugLineNum = 417;BA.debugLine="rec.Put(\"id\", i)";
_rec.Put((Object)("id"),(Object)(_i));
 //BA.debugLineNum = 418;BA.debugLine="rec.Put(\"json\", json)";
_rec.Put((Object)("json"),(Object)(_json));
 //BA.debugLineNum = 419;BA.debugLine="rec.Put(\"key\", key)";
_rec.Put((Object)("key"),(Object)(_key));
 //BA.debugLineNum = 420;BA.debugLine="rec.Put(\"value\", value)";
_rec.Put((Object)("value"),(Object)(_value));
 //BA.debugLineNum = 421;BA.debugLine="rec.Put(\"tablename\", tablename)";
_rec.Put((Object)("tablename"),(Object)(_tablename));
 //BA.debugLineNum = 423;BA.debugLine="qry = sqlite.InsertReplace(\"fields\", rec)";
_qry = _sqlite._insertreplace /*String*/ ("fields",_rec);
 //BA.debugLineNum = 424;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\", C";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 426;BA.debugLine="sqlite.initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 427;BA.debugLine="sqlite.AddStrings(Array(\"id\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 428;BA.debugLine="qry = sqlite.Exists(\"fields\", \"key\", key)";
_qry = _sqlite._exists /*String*/ ("fields","key",_key);
 //BA.debugLineNum = 429;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\", C";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 430;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 431;BA.debugLine="pg.Message(rs.result.size & \" record(s) affected";
_pg._message /*String*/ (BA.NumberToString(_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" record(s) affected!");
 break; }
case 1: {
 //BA.debugLineNum = 433;BA.debugLine="pg.Collapse(\"preview\")";
_pg._collapse /*String*/ ("preview");
 //BA.debugLineNum = 434;BA.debugLine="pg.Show(\"download\")";
_pg._show /*String*/ ("download");
 //BA.debugLineNum = 435;BA.debugLine="Dim key As String = $\"table.${value}\"$";
_key = ("table."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_value))+"");
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
 //BA.debugLineNum = 442;BA.debugLine="rec.Put(\"key\", key)";
_rec.Put((Object)("key"),(Object)(_key));
 //BA.debugLineNum = 443;BA.debugLine="rec.Put(\"value\", value)";
_rec.Put((Object)("value"),(Object)(_value));
 //BA.debugLineNum = 445;BA.debugLine="qry = sqlite.InsertReplace(\"tables\", rec)";
_qry = _sqlite._insertreplace /*String*/ ("tables",_rec);
 //BA.debugLineNum = 446;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\", C";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 448;BA.debugLine="sqlite.initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 449;BA.debugLine="sqlite.AddStrings(Array(\"id\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 450;BA.debugLine="qry = sqlite.Exists(\"tables\", \"key\", key)";
_qry = _sqlite._exists /*String*/ ("tables","key",_key);
 //BA.debugLineNum = 451;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\", C";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 452;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 453;BA.debugLine="pg.Message(rs.result.size & \" record(s) affected";
_pg._message /*String*/ (BA.NumberToString(_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" record(s) affected!");
 //BA.debugLineNum = 456;BA.debugLine="AddPrimaryKey";
_addprimarykey();
 //BA.debugLineNum = 458;BA.debugLine="sqlite.initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 459;BA.debugLine="sqlite.AddStrings(Array(\"tablename\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("tablename")}));
 //BA.debugLineNum = 460;BA.debugLine="qry = sqlite.SelectWhere(\"fields\", Array(\"json\")";
_qry = _sqlite._selectwhere /*String*/ ("fields",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("json")}),anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("tablename"),(Object)(_value)}),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("value")}));
 //BA.debugLineNum = 461;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\", C";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 462;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 464;BA.debugLine="Dim tcode As String = CreateTableCode(value,prim";
_tcode = _createtablecode(_value,_primarykey,_rs);
 //BA.debugLineNum = 465;BA.debugLine="SourceCodePreview(tcode)";
_sourcecodepreview(_tcode);
 break; }
case 2: {
 //BA.debugLineNum = 467;BA.debugLine="pg.collapse(\"preview\")";
_pg._collapse /*String*/ ("preview");
 //BA.debugLineNum = 468;BA.debugLine="pg.Expand(\"code\")";
_pg._expand /*String*/ ("code");
 //BA.debugLineNum = 469;BA.debugLine="pg.Show(\"download\")";
_pg._show /*String*/ ("download");
 //BA.debugLineNum = 470;BA.debugLine="sqlite.Initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 471;BA.debugLine="sqlite.AddStrings(Array(\"id\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 473;BA.debugLine="rec = CreateMap()";
_rec = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {});
 //BA.debugLineNum = 474;BA.debugLine="rec.Put(\"id\", i)";
_rec.Put((Object)("id"),(Object)(_i));
 //BA.debugLineNum = 475;BA.debugLine="rec.Put(\"json\", json)";
_rec.Put((Object)("json"),(Object)(_json));
 //BA.debugLineNum = 477;BA.debugLine="qry = sqlite.InsertReplace(\"connect\", rec)";
_qry = _sqlite._insertreplace /*String*/ ("connect",_rec);
 //BA.debugLineNum = 478;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\", C";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 480;BA.debugLine="sqlite.initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 481;BA.debugLine="sqlite.AddStrings(Array(\"id\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 482;BA.debugLine="qry = sqlite.Exists(\"connect\", \"id\", \"connection";
_qry = _sqlite._exists /*String*/ ("connect","id","connection");
 //BA.debugLineNum = 483;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\", C";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 484;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 485;BA.debugLine="pg.Message(rs.result.size & \" record(s) affected";
_pg._message /*String*/ (BA.NumberToString(_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" record(s) affected!");
 //BA.debugLineNum = 487;BA.debugLine="Dim ccode As String = dConnection.ConnectionCode";
_ccode = _dconnection._connectioncode /*String*/ (_prop);
 //BA.debugLineNum = 488;BA.debugLine="SourceCodePreview(ccode)";
_sourcecodepreview(_ccode);
 break; }
case 3: {
 //BA.debugLineNum = 490;BA.debugLine="pg.expand(\"preview\")";
_pg._expand /*String*/ ("preview");
 //BA.debugLineNum = 491;BA.debugLine="pg.Show(\"download\")";
_pg._show /*String*/ ("download");
 //BA.debugLineNum = 492;BA.debugLine="sqlite.initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 493;BA.debugLine="sqlite.AddStrings(Array(\"id\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 494;BA.debugLine="qry = sqlite.SelectWhere(\"forms\", Array(\"*\"), Cr";
_qry = _sqlite._selectwhere /*String*/ ("forms",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("*")}),anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(_i)}),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 495;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\", C";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 496;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 498;BA.debugLine="rec = CreateMap()";
_rec = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {});
 //BA.debugLineNum = 499;BA.debugLine="rec.Put(\"json\", json)";
_rec.Put((Object)("json"),(Object)(_json));
 //BA.debugLineNum = 500;BA.debugLine="rec.Put(\"id\", i)";
_rec.Put((Object)("id"),(Object)(_i));
 //BA.debugLineNum = 501;BA.debugLine="rec.put(\"parentid\", p)";
_rec.Put((Object)("parentid"),(Object)(_p));
 //BA.debugLineNum = 502;BA.debugLine="If rs.result.size = 0 Then";
if (_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
 //BA.debugLineNum = 503;BA.debugLine="sqlite.Initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 504;BA.debugLine="sqlite.AddStrings(Array(\"id\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 505;BA.debugLine="qry = sqlite.Insert(\"forms\", rec)";
_qry = _sqlite._insert /*String*/ ("forms",_rec);
 //BA.debugLineNum = 506;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\",";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 507;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 508;BA.debugLine="pg.Message_Success(rs.result.size & \" record(s)";
_pg._message_success /*String*/ (BA.NumberToString(_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" record(s) affected!");
 }else {
 //BA.debugLineNum = 511;BA.debugLine="sqlite.Initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 512;BA.debugLine="sqlite.AddStrings(Array(\"id\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 513;BA.debugLine="qry = sqlite.UpdateWhere(\"forms\",rec,CreateMap(";
_qry = _sqlite._updatewhere /*String*/ ("forms",_rec,anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(_i)}));
 //BA.debugLineNum = 514;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\",";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 515;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 516;BA.debugLine="pg.Message_Success(rs.result.size & \" record(s)";
_pg._message_success /*String*/ (BA.NumberToString(_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" record(s) affected!");
 };
 //BA.debugLineNum = 518;BA.debugLine="FormCode(\"form\",True)";
_formcode("form",anywheresoftware.b4a.keywords.Common.True);
 break; }
default: {
 //BA.debugLineNum = 520;BA.debugLine="pg.Show(\"download\")";
_pg._show /*String*/ ("download");
 //BA.debugLineNum = 521;BA.debugLine="pg.Expand(\"preview\")";
_pg._expand /*String*/ ("preview");
 //BA.debugLineNum = 523;BA.debugLine="If p <> \"\" Then";
if ((_p).equals("") == false) { 
 //BA.debugLineNum = 524;BA.debugLine="Dim bexist As Boolean = pg.Exists(\"tree\", p)";
_bexist = BA.ObjectToBoolean(_pg._exists /*Object*/ ("tree",_p));
 //BA.debugLineNum = 525;BA.debugLine="If bexist = False Then";
if (_bexist==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 526;BA.debugLine="pg.Message_Error(\"The parent id of this elemen";
_pg._message_error /*String*/ ("The parent id of this element cannot be found!");
 //BA.debugLineNum = 527;BA.debugLine="Return";
if (true) return "";
 };
 };
 //BA.debugLineNum = 532;BA.debugLine="sqlite.Initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 533;BA.debugLine="sqlite.AddStrings(Array(\"id\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 534;BA.debugLine="qry = sqlite.SelectWhere(\"items\", Array(\"*\"), Cr";
_qry = _sqlite._selectwhere /*String*/ ("items",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("*")}),anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(_i)}),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 535;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\", C";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 536;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 537;BA.debugLine="rec = CreateMap()";
_rec = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {});
 //BA.debugLineNum = 538;BA.debugLine="rec.Put(\"json\", json)";
_rec.Put((Object)("json"),(Object)(_json));
 //BA.debugLineNum = 539;BA.debugLine="rec.put(\"parentid\", p)";
_rec.Put((Object)("parentid"),(Object)(_p));
 //BA.debugLineNum = 540;BA.debugLine="rec.Put(\"tabindex\", idx)";
_rec.Put((Object)("tabindex"),(Object)(_idx));
 //BA.debugLineNum = 541;BA.debugLine="rec.Put(\"id\", i)";
_rec.Put((Object)("id"),(Object)(_i));
 //BA.debugLineNum = 542;BA.debugLine="If rs.result.Size = 0 Then";
if (_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
 //BA.debugLineNum = 544;BA.debugLine="sqlite.Initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 545;BA.debugLine="sqlite.AddStrings(Array(\"id\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 546;BA.debugLine="qry = sqlite.Insert(\"items\", rec)";
_qry = _sqlite._insert /*String*/ ("items",_rec);
 //BA.debugLineNum = 547;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\",";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 548;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 549;BA.debugLine="pg.Message_Success(rs.result.size & \" record(s)";
_pg._message_success /*String*/ (BA.NumberToString(_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" record(s) affected!");
 }else {
 //BA.debugLineNum = 552;BA.debugLine="sqlite.Initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 553;BA.debugLine="sqlite.AddStrings(Array(\"id\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 554;BA.debugLine="qry = sqlite.UpdateWhere(\"items\",rec,CreateMap(";
_qry = _sqlite._updatewhere /*String*/ ("items",_rec,anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(_i)}));
 //BA.debugLineNum = 555;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\",";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 556;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 557;BA.debugLine="pg.Message_Success(rs.result.size & \" record(s)";
_pg._message_success /*String*/ (BA.NumberToString(_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" record(s) affected!");
 };
 //BA.debugLineNum = 560;BA.debugLine="FormCode(i,True)";
_formcode(_i,anywheresoftware.b4a.keywords.Common.True);
 break; }
}
;
 //BA.debugLineNum = 563;BA.debugLine="RefreshTreeWait";
_refreshtreewait();
 //BA.debugLineNum = 564;BA.debugLine="End Sub";
return "";
}
public static String  _refreshapp() throws Exception{
 //BA.debugLineNum = 131;BA.debugLine="Sub refreshapp";
 //BA.debugLineNum = 132;BA.debugLine="ClearPreviewIT";
_clearpreviewit();
 //BA.debugLineNum = 133;BA.debugLine="ClearCodeIT";
_clearcodeit();
 //BA.debugLineNum = 134;BA.debugLine="RefreshTreeWait";
_refreshtreewait();
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 152;BA.debugLine="Sub RefreshTreeWait";
 //BA.debugLineNum = 154;BA.debugLine="pg.ClearAll(\"tree\")";
_pg._clearall /*String*/ ("tree");
 //BA.debugLineNum = 156;BA.debugLine="pg.AddNode(\"tree\", \"\", \"connection\", \"Database\",";
_pg._addnode /*b4j.example.wixpage*/ ("tree","","connection","Database","",_pg._enumwixicons /*b4j.example.wixicons*/ ._folder /*String*/ ,"","",anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 158;BA.debugLine="sqlite.Initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 159;BA.debugLine="qry = sqlite.SelectAll(\"tables\", Array(\"key\"), Ar";
_qry = _sqlite._selectall /*String*/ ("tables",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("key")}),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("key")}));
 //BA.debugLineNum = 160;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\", Cr";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 161;BA.debugLine="rs = sqlite.GetResultSet(qry, res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 162;BA.debugLine="For Each fitem As Map In rs.result";
_fitem = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group7 = _rs.result /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_fitem.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group7.Get(index7)));
 //BA.debugLineNum = 163;BA.debugLine="Dim key As String = fitem.Get(\"key\")";
_key = BA.ObjectToString(_fitem.Get((Object)("key")));
 //BA.debugLineNum = 164;BA.debugLine="pg.AddNode(\"tree\", \"connection\", key, key, \"\", p";
_pg._addnode /*b4j.example.wixpage*/ ("tree","connection",_key,_key,"",_pg._enumwixicons /*b4j.example.wixicons*/ ._folder /*String*/ ,"","",anywheresoftware.b4a.keywords.Common.True);
 }
};
 //BA.debugLineNum = 168;BA.debugLine="sqlite.Initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 169;BA.debugLine="qry = sqlite.SelectAll(\"fields\", Array(\"key\",\"tab";
_qry = _sqlite._selectall /*String*/ ("fields",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("key"),(Object)("tablename")}),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("key")}));
 //BA.debugLineNum = 170;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\", Cr";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 171;BA.debugLine="rs = sqlite.GetResultSet(qry, res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 172;BA.debugLine="For Each fitem As Map In rs.result";
_fitem = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group15 = _rs.result /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen15 = group15.getSize()
;int index15 = 0;
;
for (; index15 < groupLen15;index15++){
_fitem.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group15.Get(index15)));
 //BA.debugLineNum = 173;BA.debugLine="Dim key As String = fitem.Get(\"key\")";
_key = BA.ObjectToString(_fitem.Get((Object)("key")));
 //BA.debugLineNum = 174;BA.debugLine="Dim tablename As String = fitem.Get(\"tablename\")";
_tablename = BA.ObjectToString(_fitem.Get((Object)("tablename")));
 //BA.debugLineNum = 175;BA.debugLine="Dim tblKey As String = $\"table.${tablename}\"$";
_tblkey = ("table."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tablename))+"");
 //BA.debugLineNum = 176;BA.debugLine="pg.AddNode(\"tree\", tblKey, key, key, \"\", pg.Enum";
_pg._addnode /*b4j.example.wixpage*/ ("tree",_tblkey,_key,_key,"",_pg._enumwixicons /*b4j.example.wixicons*/ ._folder /*String*/ ,"","",anywheresoftware.b4a.keywords.Common.True);
 }
};
 //BA.debugLineNum = 180;BA.debugLine="sqlite.Initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 181;BA.debugLine="qry = sqlite.SelectAll(\"forms\", Array(\"id\"), Arra";
_qry = _sqlite._selectall /*String*/ ("forms",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 182;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\", Cr";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 183;BA.debugLine="rs = sqlite.GetResultSet(qry, res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 184;BA.debugLine="For Each fitem As Map In rs.result";
_fitem = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group25 = _rs.result /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen25 = group25.getSize()
;int index25 = 0;
;
for (; index25 < groupLen25;index25++){
_fitem.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group25.Get(index25)));
 //BA.debugLineNum = 185;BA.debugLine="Dim fid As String = fitem.Get(\"id\")";
_fid = BA.ObjectToString(_fitem.Get((Object)("id")));
 //BA.debugLineNum = 186;BA.debugLine="pg.AddNode(\"tree\", \"\", fid, fid, \"\", pg.EnumWixI";
_pg._addnode /*b4j.example.wixpage*/ ("tree","",_fid,_fid,"",_pg._enumwixicons /*b4j.example.wixicons*/ ._folder /*String*/ ,"","",anywheresoftware.b4a.keywords.Common.True);
 }
};
 //BA.debugLineNum = 190;BA.debugLine="sqlite.Initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 191;BA.debugLine="sqlite.AddStrings(Array(\"id\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 192;BA.debugLine="qry = sqlite.SelectAll(\"items\", Array(\"*\"), Array";
_qry = _sqlite._selectall /*String*/ ("items",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("*")}),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("tabindex")}));
 //BA.debugLineNum = 193;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\", Cr";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 194;BA.debugLine="rs = sqlite.GetResultSet(qry, res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 195;BA.debugLine="For Each item As Map In rs.result";
_item = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group34 = _rs.result /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen34 = group34.getSize()
;int index34 = 0;
;
for (; index34 < groupLen34;index34++){
_item.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group34.Get(index34)));
 //BA.debugLineNum = 196;BA.debugLine="Dim itmID As String = item.Get(\"id\")";
_itmid = BA.ObjectToString(_item.Get((Object)("id")));
 //BA.debugLineNum = 197;BA.debugLine="Dim parentid As String = item.Get(\"parentid\")";
_parentid = BA.ObjectToString(_item.Get((Object)("parentid")));
 //BA.debugLineNum = 198;BA.debugLine="pg.AddNode(\"tree\", parentid, itmID, itmID, \"\", p";
_pg._addnode /*b4j.example.wixpage*/ ("tree",_parentid,_itmid,_itmid,"",_pg._enumwixicons /*b4j.example.wixicons*/ ._fileicon /*String*/ ,"","",anywheresoftware.b4a.keywords.Common.True);
 }
};
 //BA.debugLineNum = 200;BA.debugLine="pg.Refresh(\"tree\")";
_pg._refresh /*String*/ ("tree");
 //BA.debugLineNum = 201;BA.debugLine="End Sub";
return "";
}
public static String  _showhints() throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="Sub showhints";
 //BA.debugLineNum = 128;BA.debugLine="pg.StartHint(hints)";
_pg._starthint /*String*/ (_hints);
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
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
String _parenttabindex = "";
anywheresoftware.b4a.objects.collections.Map _tt = null;
String _newtabindex = "";
int _nitems = 0;
anywheresoftware.b4a.objects.collections.Map _ti = null;
String _cti = "";
int _dotpos = 0;
int _nti = 0;
String _getlast = "";
 //BA.debugLineNum = 1099;BA.debugLine="Sub sidebar_click(meid As String)";
 //BA.debugLineNum = 1100;BA.debugLine="pg.Collapse(\"preview\")";
_pg._collapse /*String*/ ("preview");
 //BA.debugLineNum = 1101;BA.debugLine="pg.Expand(\"code\")";
_pg._expand /*String*/ ("code");
 //BA.debugLineNum = 1102;BA.debugLine="ClearPreviewIT";
_clearpreviewit();
 //BA.debugLineNum = 1103;BA.debugLine="ClearCodeIT";
_clearcodeit();
 //BA.debugLineNum = 1104;BA.debugLine="propBag.Clear";
_propbag._clear /*b4j.example.wixproperty*/ ();
 //BA.debugLineNum = 1105;BA.debugLine="propBag.Refresh(pg)";
_propbag._refresh /*String*/ (_pg);
 //BA.debugLineNum = 1107;BA.debugLine="pg.Hide(\"add_row\")";
_pg._hide /*String*/ ("add_row");
 //BA.debugLineNum = 1108;BA.debugLine="pg.Hide(\"add_column\")";
_pg._hide /*String*/ ("add_column");
 //BA.debugLineNum = 1109;BA.debugLine="pg.Hide(\"add_fields\")";
_pg._hide /*String*/ ("add_fields");
 //BA.debugLineNum = 1110;BA.debugLine="pg.Hide(\"propadd\")";
_pg._hide /*String*/ ("propadd");
 //BA.debugLineNum = 1111;BA.debugLine="pg.Hide(\"propdelete\")";
_pg._hide /*String*/ ("propdelete");
 //BA.debugLineNum = 1112;BA.debugLine="pg.Hide(\"download\")";
_pg._hide /*String*/ ("download");
 //BA.debugLineNum = 1114;BA.debugLine="Select Case meid";
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
 //BA.debugLineNum = 1120;BA.debugLine="pg.Show(\"propadd\")";
_pg._show /*String*/ ("propadd");
 //BA.debugLineNum = 1121;BA.debugLine="pg.show(\"propdelete\")";
_pg._show /*String*/ ("propdelete");
 //BA.debugLineNum = 1122;BA.debugLine="dbhelp";
_dbhelp();
 break; }
case 15: {
 //BA.debugLineNum = 1124;BA.debugLine="pg.show(\"propadd\")";
_pg._show /*String*/ ("propadd");
 //BA.debugLineNum = 1125;BA.debugLine="pg.Collapse(\"preview\")";
_pg._collapse /*String*/ ("preview");
 //BA.debugLineNum = 1126;BA.debugLine="pg.Expand(\"code\")";
_pg._expand /*String*/ ("code");
 //BA.debugLineNum = 1127;BA.debugLine="pg.show(\"propdelete\")";
_pg._show /*String*/ ("propdelete");
 //BA.debugLineNum = 1129;BA.debugLine="Dim parentid As String = pg.GetSelectedID(\"tree\"";
_parentid = BA.ObjectToString(_pg._getselectedid /*b4j.example.wixpage._wixselectedid*/ ("tree"));
 //BA.debugLineNum = 1130;BA.debugLine="If parentid = \"\" Then";
if ((_parentid).equals("")) { 
 //BA.debugLineNum = 1131;BA.debugLine="pg.Message_Error(\"Please select the table to ad";
_pg._message_error /*String*/ ("Please select the table to add the field to first!");
 //BA.debugLineNum = 1132;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 1134;BA.debugLine="Dim prefix As String = pg.MvField(parentid,1,\".\"";
_prefix = _pg._mvfield /*String*/ (_parentid,(int) (1),".");
 //BA.debugLineNum = 1135;BA.debugLine="Dim suffix As String = pg.MvField(parentid,2,\".\"";
_suffix = _pg._mvfield /*String*/ (_parentid,(int) (2),".");
 //BA.debugLineNum = 1136;BA.debugLine="Select Case prefix";
switch (BA.switchObjectToInt(_prefix,"table")) {
case 0: {
 //BA.debugLineNum = 1138;BA.debugLine="pg.Collapse(\"preview\")";
_pg._collapse /*String*/ ("preview");
 //BA.debugLineNum = 1139;BA.debugLine="pg.Expand(\"code\")";
_pg._expand /*String*/ ("code");
 //BA.debugLineNum = 1140;BA.debugLine="pg.show(\"propdelete\")";
_pg._show /*String*/ ("propdelete");
 //BA.debugLineNum = 1141;BA.debugLine="dField.BuildBag(pg,propBag)";
_dfield._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 1143;BA.debugLine="prefix = $\"field.${suffix}.field\"$";
_prefix = ("field."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_suffix))+".field");
 //BA.debugLineNum = 1144;BA.debugLine="Dim startPoint As Int = 0";
_startpoint = (int) (0);
 //BA.debugLineNum = 1145;BA.debugLine="Dim pBoolean As Boolean = True";
_pboolean = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 1146;BA.debugLine="Dim kFind As String = \"\"";
_kfind = "";
 //BA.debugLineNum = 1147;BA.debugLine="Do While pBoolean = True";
while (_pboolean==anywheresoftware.b4a.keywords.Common.True) {
 //BA.debugLineNum = 1148;BA.debugLine="startPoint = startPoint + 1";
_startpoint = (int) (_startpoint+1);
 //BA.debugLineNum = 1149;BA.debugLine="kFind = prefix & pg.cstr(startPoint)";
_kfind = _prefix+_pg._cstr /*String*/ ((Object)(_startpoint));
 //BA.debugLineNum = 1150;BA.debugLine="sqlite.initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 1151;BA.debugLine="sqlite.AddStrings(Array(\"id\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 1152;BA.debugLine="qry = sqlite.Exists(\"fields\", \"key\", kFind)";
_qry = _sqlite._exists /*String*/ ("fields","key",_kfind);
 //BA.debugLineNum = 1153;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\",";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 1154;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 1156;BA.debugLine="If rs.result.Size = 0 Then";
if (_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
 //BA.debugLineNum = 1157;BA.debugLine="pBoolean = False";
_pboolean = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 1158;BA.debugLine="Exit";
if (true) break;
 }else {
 //BA.debugLineNum = 1160;BA.debugLine="pBoolean = True";
_pboolean = anywheresoftware.b4a.keywords.Common.True;
 };
 }
;
 //BA.debugLineNum = 1163;BA.debugLine="kFind = pg.MvField(kFind,3,\".\")";
_kfind = _pg._mvfield /*String*/ (_kfind,(int) (3),".");
 //BA.debugLineNum = 1164;BA.debugLine="Dim p As Map = pg.GetValues(\"propbag\")";
_p = new anywheresoftware.b4a.objects.collections.Map();
_p = _pg._getvalues /*anywheresoftware.b4a.objects.collections.Map*/ ("propbag");
 //BA.debugLineNum = 1165;BA.debugLine="p.Put(\"tablename\", suffix)";
_p.Put((Object)("tablename"),(Object)(_suffix));
 //BA.debugLineNum = 1166;BA.debugLine="p.Put(\"value\", kFind)";
_p.Put((Object)("value"),(Object)(_kfind));
 //BA.debugLineNum = 1167;BA.debugLine="pg.SetValues(\"propbag\",p)";
_pg._setvalues /*String*/ ("propbag",_p);
 break; }
default: {
 //BA.debugLineNum = 1169;BA.debugLine="pg.Message_Error(\"Please select the table to ad";
_pg._message_error /*String*/ ("Please select the table to add the field to first!");
 //BA.debugLineNum = 1170;BA.debugLine="Return";
if (true) return "";
 break; }
}
;
 break; }
case 16: {
 //BA.debugLineNum = 1173;BA.debugLine="pg.show(\"propadd\")";
_pg._show /*String*/ ("propadd");
 //BA.debugLineNum = 1174;BA.debugLine="pg.Collapse(\"preview\")";
_pg._collapse /*String*/ ("preview");
 //BA.debugLineNum = 1175;BA.debugLine="pg.Expand(\"code\")";
_pg._expand /*String*/ ("code");
 //BA.debugLineNum = 1176;BA.debugLine="pg.show(\"propdelete\")";
_pg._show /*String*/ ("propdelete");
 //BA.debugLineNum = 1177;BA.debugLine="dTable.BuildBag(pg,propBag)";
_dtable._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 1179;BA.debugLine="prefix = $\"table.table\"$";
_prefix = ("table.table");
 //BA.debugLineNum = 1180;BA.debugLine="Dim startPoint As Int = 0";
_startpoint = (int) (0);
 //BA.debugLineNum = 1181;BA.debugLine="Dim pBoolean As Boolean = True";
_pboolean = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 1182;BA.debugLine="Dim kFind As String = \"\"";
_kfind = "";
 //BA.debugLineNum = 1183;BA.debugLine="Do While pBoolean = True";
while (_pboolean==anywheresoftware.b4a.keywords.Common.True) {
 //BA.debugLineNum = 1184;BA.debugLine="startPoint = startPoint + 1";
_startpoint = (int) (_startpoint+1);
 //BA.debugLineNum = 1185;BA.debugLine="kFind = prefix & pg.cstr(startPoint)";
_kfind = _prefix+_pg._cstr /*String*/ ((Object)(_startpoint));
 //BA.debugLineNum = 1186;BA.debugLine="sqlite.initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 1187;BA.debugLine="sqlite.AddStrings(Array(\"id\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 1188;BA.debugLine="qry = sqlite.Exists(\"tables\", \"key\", kFind)";
_qry = _sqlite._exists /*String*/ ("tables","key",_kfind);
 //BA.debugLineNum = 1189;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\",";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 1190;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 1192;BA.debugLine="If rs.result.Size = 0 Then";
if (_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
 //BA.debugLineNum = 1193;BA.debugLine="pBoolean = False";
_pboolean = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 1194;BA.debugLine="Exit";
if (true) break;
 }else {
 //BA.debugLineNum = 1196;BA.debugLine="pBoolean = True";
_pboolean = anywheresoftware.b4a.keywords.Common.True;
 };
 }
;
 //BA.debugLineNum = 1199;BA.debugLine="kFind = pg.MvField(kFind,2,\".\")";
_kfind = _pg._mvfield /*String*/ (_kfind,(int) (2),".");
 //BA.debugLineNum = 1200;BA.debugLine="Dim p As Map = pg.GetValues(\"propbag\")";
_p = new anywheresoftware.b4a.objects.collections.Map();
_p = _pg._getvalues /*anywheresoftware.b4a.objects.collections.Map*/ ("propbag");
 //BA.debugLineNum = 1201;BA.debugLine="p.Put(\"value\", kFind)";
_p.Put((Object)("value"),(Object)(_kfind));
 //BA.debugLineNum = 1202;BA.debugLine="pg.SetValues(\"propbag\",p)";
_pg._setvalues /*String*/ ("propbag",_p);
 break; }
case 17: {
 //BA.debugLineNum = 1205;BA.debugLine="pg.show(\"propadd\")";
_pg._show /*String*/ ("propadd");
 //BA.debugLineNum = 1206;BA.debugLine="DrawPropBag(meid)";
_drawpropbag(_meid);
 break; }
case 18: {
 //BA.debugLineNum = 1208;BA.debugLine="pg.Expand(\"preview\")";
_pg._expand /*String*/ ("preview");
 //BA.debugLineNum = 1209;BA.debugLine="pg.Show(\"add_row\")";
_pg._show /*String*/ ("add_row");
 //BA.debugLineNum = 1210;BA.debugLine="pg.Show(\"add_column\")";
_pg._show /*String*/ ("add_column");
 //BA.debugLineNum = 1211;BA.debugLine="pg.Show(\"propadd\")";
_pg._show /*String*/ ("propadd");
 //BA.debugLineNum = 1212;BA.debugLine="DrawPropBag(meid)";
_drawpropbag(_meid);
 break; }
default: {
 //BA.debugLineNum = 1214;BA.debugLine="pg.Expand(\"preview\")";
_pg._expand /*String*/ ("preview");
 //BA.debugLineNum = 1215;BA.debugLine="pg.Show(\"propadd\")";
_pg._show /*String*/ ("propadd");
 //BA.debugLineNum = 1216;BA.debugLine="pg.Show(\"propdelete\")";
_pg._show /*String*/ ("propdelete");
 //BA.debugLineNum = 1218;BA.debugLine="Dim parentid As String = pg.GetSelectedID(\"tree\"";
_parentid = BA.ObjectToString(_pg._getselectedid /*b4j.example.wixpage._wixselectedid*/ ("tree"));
 //BA.debugLineNum = 1219;BA.debugLine="If parentid = \"\" Then";
if ((_parentid).equals("")) { 
 //BA.debugLineNum = 1220;BA.debugLine="pg.Message_Error(\"Please select the parent item";
_pg._message_error /*String*/ ("Please select the parent item from the tree first, then select the element you want to add! Remember to click Save in the property bag when done.");
 //BA.debugLineNum = 1221;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 1223;BA.debugLine="If DrawPropBag(meid) Then";
if (_drawpropbag(_meid)) { 
 //BA.debugLineNum = 1225;BA.debugLine="rec = pg.GetValues(\"propbag\")";
_rec = _pg._getvalues /*anywheresoftware.b4a.objects.collections.Map*/ ("propbag");
 //BA.debugLineNum = 1227;BA.debugLine="Dim startPoint As Int = 0";
_startpoint = (int) (0);
 //BA.debugLineNum = 1228;BA.debugLine="Dim pBoolean As Boolean = True";
_pboolean = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 1229;BA.debugLine="Dim kFind As String = \"\"";
_kfind = "";
 //BA.debugLineNum = 1230;BA.debugLine="prefix = meid";
_prefix = _meid;
 //BA.debugLineNum = 1231;BA.debugLine="Do While pBoolean = True";
while (_pboolean==anywheresoftware.b4a.keywords.Common.True) {
 //BA.debugLineNum = 1232;BA.debugLine="startPoint = startPoint + 1";
_startpoint = (int) (_startpoint+1);
 //BA.debugLineNum = 1233;BA.debugLine="kFind = prefix & pg.cstr(startPoint)";
_kfind = _prefix+_pg._cstr /*String*/ ((Object)(_startpoint));
 //BA.debugLineNum = 1234;BA.debugLine="sqlite.initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 1235;BA.debugLine="sqlite.AddStrings(Array(\"id\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 1236;BA.debugLine="qry = sqlite.Exists(\"items\", \"id\", kFind)";
_qry = _sqlite._exists /*String*/ ("items","id",_kfind);
 //BA.debugLineNum = 1237;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\",";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 1238;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 1240;BA.debugLine="If rs.result.Size = 0 Then";
if (_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
 //BA.debugLineNum = 1241;BA.debugLine="pBoolean = False";
_pboolean = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 1242;BA.debugLine="Exit";
if (true) break;
 }else {
 //BA.debugLineNum = 1244;BA.debugLine="pBoolean = True";
_pboolean = anywheresoftware.b4a.keywords.Common.True;
 };
 }
;
 //BA.debugLineNum = 1249;BA.debugLine="sqlite.Initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 1250;BA.debugLine="sqlite.AddStrings(Array(\"id\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 1251;BA.debugLine="qry = sqlite.SelectWhere(\"items\", Array(\"tabind";
_qry = _sqlite._selectwhere /*String*/ ("items",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("tabindex")}),anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(_parentid)}),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("tabindex")}));
 //BA.debugLineNum = 1252;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\",";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 1253;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 1254;BA.debugLine="Dim parentTabIndex As String = \"\"";
_parenttabindex = "";
 //BA.debugLineNum = 1255;BA.debugLine="If rs.result.Size > 0 Then";
if (_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
 //BA.debugLineNum = 1256;BA.debugLine="Dim tt As Map = rs.result.Get(0)";
_tt = new anywheresoftware.b4a.objects.collections.Map();
_tt.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0))));
 //BA.debugLineNum = 1257;BA.debugLine="parentTabIndex = tt.GetDefault(\"tabindex\",\"\")";
_parenttabindex = BA.ObjectToString(_tt.GetDefault((Object)("tabindex"),(Object)("")));
 //BA.debugLineNum = 1258;BA.debugLine="parentTabIndex = pg.CStr(parentTabIndex)";
_parenttabindex = _pg._cstr /*String*/ ((Object)(_parenttabindex));
 };
 //BA.debugLineNum = 1261;BA.debugLine="sqlite.Initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 1262;BA.debugLine="sqlite.AddStrings(Array(\"parentid\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("parentid")}));
 //BA.debugLineNum = 1264;BA.debugLine="qry = sqlite.SelectWhere(\"items\", Array(\"tabind";
_qry = _sqlite._selectwhere /*String*/ ("items",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("tabindex")}),anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("parentid"),(Object)(_parentid)}),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("tabindex")}));
 //BA.debugLineNum = 1265;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\",";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 1266;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 1267;BA.debugLine="Dim newtabindex As String = \"\"";
_newtabindex = "";
 //BA.debugLineNum = 1268;BA.debugLine="If rs.result.Size > 0 Then";
if (_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
 //BA.debugLineNum = 1269;BA.debugLine="Dim nitems As Int = rs.result.size - 1";
_nitems = (int) (_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
 //BA.debugLineNum = 1270;BA.debugLine="Dim ti As Map = rs.result.Get(nitems)";
_ti = new anywheresoftware.b4a.objects.collections.Map();
_ti.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .Get(_nitems)));
 //BA.debugLineNum = 1271;BA.debugLine="Dim cti As String = ti.GetDefault(\"tabindex\",\"";
_cti = BA.ObjectToString(_ti.GetDefault((Object)("tabindex"),(Object)("0")));
 //BA.debugLineNum = 1272;BA.debugLine="cti = pg.CStr(cti)";
_cti = _pg._cstr /*String*/ ((Object)(_cti));
 //BA.debugLineNum = 1274;BA.debugLine="Dim dotPos As Int = cti.IndexOf(\".\")";
_dotpos = _cti.indexOf(".");
 //BA.debugLineNum = 1275;BA.debugLine="If dotPos = -1 Then";
if (_dotpos==-1) { 
 //BA.debugLineNum = 1276;BA.debugLine="Dim nti As Int = BANano.parseInt(cti)";
_nti = _banano.parseInt((Object)(_cti));
 //BA.debugLineNum = 1277;BA.debugLine="nti = nti + 1";
_nti = (int) (_nti+1);
 //BA.debugLineNum = 1278;BA.debugLine="newtabindex = pg.CStr(nti)";
_newtabindex = _pg._cstr /*String*/ ((Object)(_nti));
 //BA.debugLineNum = 1279;BA.debugLine="If parentTabIndex <> \"\" Then";
if ((_parenttabindex).equals("") == false) { 
 //BA.debugLineNum = 1280;BA.debugLine="newtabindex = $\"${parentTabIndex}.${newtabin";
_newtabindex = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_parenttabindex))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newtabindex))+"");
 };
 }else {
 //BA.debugLineNum = 1284;BA.debugLine="Dim getLast As String = pg.MvField(cti, -1, \"";
_getlast = _pg._mvfield /*String*/ (_cti,(int) (-1),".");
 //BA.debugLineNum = 1285;BA.debugLine="Dim nti As Int = BANano.parseInt(getLast)";
_nti = _banano.parseInt((Object)(_getlast));
 //BA.debugLineNum = 1286;BA.debugLine="nti = nti + 1";
_nti = (int) (_nti+1);
 //BA.debugLineNum = 1287;BA.debugLine="newtabindex = pg.CStr(nti)";
_newtabindex = _pg._cstr /*String*/ ((Object)(_nti));
 //BA.debugLineNum = 1288;BA.debugLine="If parentTabIndex <> \"\" Then";
if ((_parenttabindex).equals("") == false) { 
 //BA.debugLineNum = 1289;BA.debugLine="newtabindex = $\"${parentTabIndex}.${newtabin";
_newtabindex = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_parenttabindex))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newtabindex))+"");
 };
 };
 }else {
 //BA.debugLineNum = 1293;BA.debugLine="newtabindex = \"1\"";
_newtabindex = "1";
 //BA.debugLineNum = 1294;BA.debugLine="If parentTabIndex <> \"\" Then";
if ((_parenttabindex).equals("") == false) { 
 //BA.debugLineNum = 1295;BA.debugLine="newtabindex = $\"${parentTabIndex}.${newtabind";
_newtabindex = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_parenttabindex))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newtabindex))+"");
 };
 };
 //BA.debugLineNum = 1300;BA.debugLine="rec.Put(\"parentid\", parentid)";
_rec.Put((Object)("parentid"),(Object)(_parentid));
 //BA.debugLineNum = 1301;BA.debugLine="rec.Put(\"id\", kFind)";
_rec.Put((Object)("id"),(Object)(_kfind));
 //BA.debugLineNum = 1302;BA.debugLine="rec.Put(\"template\", kFind)";
_rec.Put((Object)("template"),(Object)(_kfind));
 //BA.debugLineNum = 1303;BA.debugLine="rec.Put(\"tabindex\", newtabindex)";
_rec.Put((Object)("tabindex"),(Object)(_newtabindex));
 //BA.debugLineNum = 1304;BA.debugLine="rec.Put(\"label\", kFind)";
_rec.Put((Object)("label"),(Object)(_kfind));
 //BA.debugLineNum = 1305;BA.debugLine="pg.SetValues(\"propbag\",rec)";
_pg._setvalues /*String*/ ("propbag",_rec);
 };
 break; }
}
;
 //BA.debugLineNum = 1308;BA.debugLine="End Sub";
return "";
}
public static String  _sourcecodeitem(anywheresoftware.b4a.objects.collections.Map _m,anywheresoftware.b4a.objects.collections.Map _original) throws Exception{
String _q = "";
String _v = "";
String _i = "";
String _a = "";
String _sparentid = "";
String _saddingmethod = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _strkey = "";
Object _strval = null;
String _btn = "";
String _k = "";
String _xval = "";
 //BA.debugLineNum = 753;BA.debugLine="Sub SourceCodeItem(m As Map, original As Map) As S";
 //BA.debugLineNum = 754;BA.debugLine="Dim Q As String = \"$\"";
_q = "$";
 //BA.debugLineNum = 755;BA.debugLine="Dim v As String = m.GetDefault(\"view\",\"\")";
_v = BA.ObjectToString(_m.GetDefault((Object)("view"),(Object)("")));
 //BA.debugLineNum = 756;BA.debugLine="Dim i As String = m.GetDefault(\"id\",\"\")";
_i = BA.ObjectToString(_m.GetDefault((Object)("id"),(Object)("")));
 //BA.debugLineNum = 757;BA.debugLine="Dim a As String = m.GetDefault(\"action\",\"\")";
_a = BA.ObjectToString(_m.GetDefault((Object)("action"),(Object)("")));
 //BA.debugLineNum = 758;BA.debugLine="v = pg.CStr(v)";
_v = _pg._cstr /*String*/ ((Object)(_v));
 //BA.debugLineNum = 759;BA.debugLine="If v = \"\" Then v = \"Element\"";
if ((_v).equals("")) { 
_v = "Element";};
 //BA.debugLineNum = 760;BA.debugLine="If v = \"undefined\" Then v = \"Element\"";
if ((_v).equals("undefined")) { 
_v = "Element";};
 //BA.debugLineNum = 762;BA.debugLine="Dim sparentid As String";
_sparentid = "";
 //BA.debugLineNum = 763;BA.debugLine="Dim saddingmethod As String";
_saddingmethod = "";
 //BA.debugLineNum = 764;BA.debugLine="If original <> Null Then";
if (_original!= null) { 
 //BA.debugLineNum = 765;BA.debugLine="saddingmethod = original.GetDefault(\"addingmetho";
_saddingmethod = BA.ObjectToString(_original.GetDefault((Object)("addingmethod"),(Object)("")));
 //BA.debugLineNum = 766;BA.debugLine="sparentid = original.GetDefault(\"parentid\",\"\")";
_sparentid = BA.ObjectToString(_original.GetDefault((Object)("parentid"),(Object)("")));
 };
 //BA.debugLineNum = 769;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 770;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 771;BA.debugLine="sb.Append($\"Dim ${i} As Wix${v}\"$).Append(\"<br>\")";
_sb.Append(("Dim "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+" As Wix"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_v))+"")).Append("<br>");
 //BA.debugLineNum = 772;BA.debugLine="sb.Append($\"${i}.Initialize(\"${i}\")\"$).Append(\"<b";
_sb.Append((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+".Initialize(\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+"\")")).Append("<br>");
 //BA.debugLineNum = 773;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group18 = _m.Keys();
final int groupLen18 = group18.getSize()
;int index18 = 0;
;
for (; index18 < groupLen18;index18++){
_strkey = BA.ObjectToString(group18.Get(index18));
 //BA.debugLineNum = 774;BA.debugLine="Dim strval As Object = m.Get(strKey)";
_strval = _m.Get((Object)(_strkey));
 //BA.debugLineNum = 775;BA.debugLine="If strKey = \"id\" Then Continue";
if ((_strkey).equals("id")) { 
if (true) continue;};
 //BA.debugLineNum = 776;BA.debugLine="If strKey = \"view\" Then";
if ((_strkey).equals("view")) { 
 //BA.debugLineNum = 777;BA.debugLine="If v <> \"Element\"  Then Continue";
if ((_v).equals("Element") == false) { 
if (true) continue;};
 };
 //BA.debugLineNum = 779;BA.debugLine="If strKey = \"container\" Then Continue";
if ((_strkey).equals("container")) { 
if (true) continue;};
 //BA.debugLineNum = 780;BA.debugLine="If strKey = \"parentid\" Then Continue";
if ((_strkey).equals("parentid")) { 
if (true) continue;};
 //BA.debugLineNum = 781;BA.debugLine="If strKey = \"tabindex\" Then Continue";
if ((_strkey).equals("tabindex")) { 
if (true) continue;};
 //BA.debugLineNum = 782;BA.debugLine="If strKey = \"action\" Then Continue";
if ((_strkey).equals("action")) { 
if (true) continue;};
 //BA.debugLineNum = 783;BA.debugLine="If strKey = \"click\" Then";
if ((_strkey).equals("click")) { 
 //BA.debugLineNum = 784;BA.debugLine="Dim btn As String = $\"btn${a}_click\"$";
_btn = ("btn"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_a))+"_click");
 //BA.debugLineNum = 785;BA.debugLine="strval = $\"BANano.CallBack(Me, \"${btn}\", Null)\"";
_strval = (Object)(("BANano.CallBack(Me, \""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_btn))+"\", Null)"));
 };
 //BA.debugLineNum = 787;BA.debugLine="Dim k As String = Capitalize(strKey)";
_k = _capitalize(_strkey);
 //BA.debugLineNum = 788;BA.debugLine="If GetType(strval) = \"object\" Then";
if ((anywheresoftware.b4a.keywords.Common.GetType(_strval)).equals("object")) { 
 //BA.debugLineNum = 789;BA.debugLine="Dim xval As String = pg.Map2Json(strval)";
_xval = _pg._map2json /*String*/ ((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_strval)));
 //BA.debugLineNum = 790;BA.debugLine="sb.Append($\"${i}.Set${k}JSON(${q}\"${xval}\"${q})";
_sb.Append((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+".Set"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_k))+"JSON("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_q))+"\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_xval))+"\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_q))+")")).Append("<br>");
 }else {
 //BA.debugLineNum = 792;BA.debugLine="sb.Append($\"${i}.Set${k}(\"${strval}\")\"$).Append";
_sb.Append((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+".Set"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_k))+"(\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",_strval)+"\")")).Append("<br>");
 };
 }
};
 //BA.debugLineNum = 795;BA.debugLine="If sparentid <> \"\" Then";
if ((_sparentid).equals("") == false) { 
 //BA.debugLineNum = 796;BA.debugLine="sb.Append(sparentid).Append(\".\").Append(saddingm";
_sb.Append(_sparentid).Append(".").Append(_saddingmethod).Append("(").Append(_i).Append(".Item)");
 };
 //BA.debugLineNum = 798;BA.debugLine="Return sb.tostring";
if (true) return _sb.ToString();
 //BA.debugLineNum = 799;BA.debugLine="End Sub";
return "";
}
public static String  _sourcecodepreview(String _script) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _scode = "";
 //BA.debugLineNum = 801;BA.debugLine="Sub SourceCodePreview(script As String)";
 //BA.debugLineNum = 802;BA.debugLine="lastcode = script";
_lastcode = _script;
 //BA.debugLineNum = 803;BA.debugLine="script = script.Replace(CRLF,\"<br>\")";
_script = _script.replace(anywheresoftware.b4a.keywords.Common.CRLF,"<br>");
 //BA.debugLineNum = 804;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 805;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 806;BA.debugLine="sb.Append(\"<pre>\")";
_sb.Append("<pre>");
 //BA.debugLineNum = 807;BA.debugLine="sb.Append(script)";
_sb.Append(_script);
 //BA.debugLineNum = 808;BA.debugLine="sb.Append(\"</pre>\")";
_sb.Append("</pre>");
 //BA.debugLineNum = 810;BA.debugLine="Dim scode As String = sb.tostring";
_scode = _sb.ToString();
 //BA.debugLineNum = 811;BA.debugLine="pg.Define(\"codeit\", CreateMap(\"template\":scode))";
_pg._define /*String*/ ("codeit",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("template"),(Object)(_scode)}));
 //BA.debugLineNum = 812;BA.debugLine="pg.Refresh(\"codeit\")";
_pg._refresh /*String*/ ("codeit");
 //BA.debugLineNum = 813;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.Map  _temporaltext() throws Exception{
anywheresoftware.b4a.objects.collections.Map _t = null;
 //BA.debugLineNum = 1593;BA.debugLine="Sub TemporalText() As Map";
 //BA.debugLineNum = 1594;BA.debugLine="Dim t As Map = CreateMap()";
_t = new anywheresoftware.b4a.objects.collections.Map();
_t = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {});
 //BA.debugLineNum = 1595;BA.debugLine="t.Put(\"id\",\"text1\")";
_t.Put((Object)("id"),(Object)("text1"));
 //BA.debugLineNum = 1596;BA.debugLine="t.Put(\"localId\",\"\")";
_t.Put((Object)("localId"),(Object)(""));
 //BA.debugLineNum = 1597;BA.debugLine="t.Put(\"parentid\",\"form\")";
_t.Put((Object)("parentid"),(Object)("form"));
 //BA.debugLineNum = 1598;BA.debugLine="t.Put(\"addingmethod\",\"AddRows\")";
_t.Put((Object)("addingmethod"),(Object)("AddRows"));
 //BA.debugLineNum = 1599;BA.debugLine="t.Put(\"tabindex\",\"0\")";
_t.Put((Object)("tabindex"),(Object)("0"));
 //BA.debugLineNum = 1600;BA.debugLine="t.Put(\"view\",\"text\")";
_t.Put((Object)("view"),(Object)("text"));
 //BA.debugLineNum = 1601;BA.debugLine="t.Put(\"type\",\"text\")";
_t.Put((Object)("type"),(Object)("text"));
 //BA.debugLineNum = 1602;BA.debugLine="t.Put(\"inputAlign\",\"\")";
_t.Put((Object)("inputAlign"),(Object)(""));
 //BA.debugLineNum = 1603;BA.debugLine="t.Put(\"label\",\"Text 1\")";
_t.Put((Object)("label"),(Object)("Text 1"));
 //BA.debugLineNum = 1604;BA.debugLine="Return t";
if (true) return _t;
 //BA.debugLineNum = 1605;BA.debugLine="End Sub";
return null;
}
public static String  _tree_clickwait(String _recid) throws Exception{
String _prefix = "";
String _suffix = "";
String _primarykey = "";
String _tcode = "";
String _ccode = "";
String _v = "";
 //BA.debugLineNum = 815;BA.debugLine="Sub tree_clickwait(recid As String)";
 //BA.debugLineNum = 816;BA.debugLine="ClearPreviewIT";
_clearpreviewit();
 //BA.debugLineNum = 817;BA.debugLine="ClearCodeIT";
_clearcodeit();
 //BA.debugLineNum = 818;BA.debugLine="propBag.Clear";
_propbag._clear /*b4j.example.wixproperty*/ ();
 //BA.debugLineNum = 819;BA.debugLine="propBag.Refresh(pg)";
_propbag._refresh /*String*/ (_pg);
 //BA.debugLineNum = 820;BA.debugLine="Dim prefix As String = pg.MvField(recid,1,\".\")";
_prefix = _pg._mvfield /*String*/ (_recid,(int) (1),".");
 //BA.debugLineNum = 821;BA.debugLine="Dim suffix As String = pg.MvField(recid,2,\".\")";
_suffix = _pg._mvfield /*String*/ (_recid,(int) (2),".");
 //BA.debugLineNum = 822;BA.debugLine="pg.Hide(\"propadd\")";
_pg._hide /*String*/ ("propadd");
 //BA.debugLineNum = 823;BA.debugLine="pg.Hide(\"add_row\")";
_pg._hide /*String*/ ("add_row");
 //BA.debugLineNum = 824;BA.debugLine="pg.Hide(\"add_column\")";
_pg._hide /*String*/ ("add_column");
 //BA.debugLineNum = 825;BA.debugLine="pg.Hide(\"add_fields\")";
_pg._hide /*String*/ ("add_fields");
 //BA.debugLineNum = 826;BA.debugLine="pg.Hide(\"propdelete\")";
_pg._hide /*String*/ ("propdelete");
 //BA.debugLineNum = 827;BA.debugLine="pg.Hide(\"download\")";
_pg._hide /*String*/ ("download");
 //BA.debugLineNum = 829;BA.debugLine="Select Case prefix";
switch (BA.switchObjectToInt(_prefix,"field","table","connection","form")) {
case 0: {
 //BA.debugLineNum = 831;BA.debugLine="pg.Show(\"add_fields\")";
_pg._show /*String*/ ("add_fields");
 //BA.debugLineNum = 832;BA.debugLine="pg.Collapse(\"preview\")";
_pg._collapse /*String*/ ("preview");
 //BA.debugLineNum = 833;BA.debugLine="pg.Show(\"propadd\")";
_pg._show /*String*/ ("propadd");
 //BA.debugLineNum = 834;BA.debugLine="pg.Expand(\"code\")";
_pg._expand /*String*/ ("code");
 //BA.debugLineNum = 835;BA.debugLine="pg.show(\"propdelete\")";
_pg._show /*String*/ ("propdelete");
 //BA.debugLineNum = 836;BA.debugLine="dField.BuildBag(pg,propBag)";
_dfield._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 838;BA.debugLine="sqlite.Initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 839;BA.debugLine="sqlite.AddStrings(Array(\"key\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("key")}));
 //BA.debugLineNum = 840;BA.debugLine="qry = sqlite.Read(\"fields\",\"key\",recid)";
_qry = _sqlite._read /*String*/ ("fields","key",_recid);
 //BA.debugLineNum = 841;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\", C";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 842;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 843;BA.debugLine="If rs.result.Size = 0 Then";
if (_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
 }else {
 //BA.debugLineNum = 845;BA.debugLine="rec = rs.result.get(0)";
_rec.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0))));
 //BA.debugLineNum = 846;BA.debugLine="json = rec.Get(\"json\")";
_json = BA.ObjectToString(_rec.Get((Object)("json")));
 //BA.debugLineNum = 847;BA.debugLine="rec = pg.Json2Map(json)";
_rec = _pg._json2map /*anywheresoftware.b4a.objects.collections.Map*/ (_json);
 //BA.debugLineNum = 848;BA.debugLine="pg.SetValues(\"propbag\", rec)";
_pg._setvalues /*String*/ ("propbag",_rec);
 };
 break; }
case 1: {
 //BA.debugLineNum = 851;BA.debugLine="pg.Show(\"propadd\")";
_pg._show /*String*/ ("propadd");
 //BA.debugLineNum = 852;BA.debugLine="pg.Collapse(\"preview\")";
_pg._collapse /*String*/ ("preview");
 //BA.debugLineNum = 853;BA.debugLine="pg.Expand(\"code\")";
_pg._expand /*String*/ ("code");
 //BA.debugLineNum = 854;BA.debugLine="pg.show(\"propdelete\")";
_pg._show /*String*/ ("propdelete");
 //BA.debugLineNum = 855;BA.debugLine="pg.Show(\"add_fields\")";
_pg._show /*String*/ ("add_fields");
 //BA.debugLineNum = 856;BA.debugLine="pg.Show(\"download\")";
_pg._show /*String*/ ("download");
 //BA.debugLineNum = 857;BA.debugLine="dTable.BuildBag(pg,propBag)";
_dtable._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 859;BA.debugLine="sqlite.Initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 860;BA.debugLine="sqlite.AddStrings(Array(\"key\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("key")}));
 //BA.debugLineNum = 861;BA.debugLine="qry = sqlite.Read(\"tables\",\"key\",recid)";
_qry = _sqlite._read /*String*/ ("tables","key",_recid);
 //BA.debugLineNum = 862;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\", C";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 863;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 864;BA.debugLine="If rs.result.Size = 0 Then";
if (_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
 }else {
 //BA.debugLineNum = 866;BA.debugLine="rec = rs.result.get(0)";
_rec.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0))));
 //BA.debugLineNum = 867;BA.debugLine="json = rec.Get(\"json\")";
_json = BA.ObjectToString(_rec.Get((Object)("json")));
 //BA.debugLineNum = 868;BA.debugLine="rec = pg.Json2Map(json)";
_rec = _pg._json2map /*anywheresoftware.b4a.objects.collections.Map*/ (_json);
 //BA.debugLineNum = 869;BA.debugLine="pg.SetValues(\"propbag\", rec)";
_pg._setvalues /*String*/ ("propbag",_rec);
 //BA.debugLineNum = 870;BA.debugLine="Dim primarykey As String = rec.Get(\"primarykey\"";
_primarykey = BA.ObjectToString(_rec.Get((Object)("primarykey")));
 //BA.debugLineNum = 873;BA.debugLine="sqlite.initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 874;BA.debugLine="sqlite.AddStrings(Array(\"tablename\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("tablename")}));
 //BA.debugLineNum = 875;BA.debugLine="qry = sqlite.SelectWhere(\"fields\", Array(\"json\"";
_qry = _sqlite._selectwhere /*String*/ ("fields",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("json")}),anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("tablename"),(Object)(_suffix)}),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("value")}));
 //BA.debugLineNum = 876;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\",";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 877;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 879;BA.debugLine="Dim tcode As String = CreateTableCode(suffix,pr";
_tcode = _createtablecode(_suffix,_primarykey,_rs);
 //BA.debugLineNum = 880;BA.debugLine="SourceCodePreview(tcode)";
_sourcecodepreview(_tcode);
 };
 break; }
case 2: {
 //BA.debugLineNum = 883;BA.debugLine="pg.Show(\"propadd\")";
_pg._show /*String*/ ("propadd");
 //BA.debugLineNum = 884;BA.debugLine="pg.Show(\"add_fields\")";
_pg._show /*String*/ ("add_fields");
 //BA.debugLineNum = 885;BA.debugLine="pg.collapse(\"preview\")";
_pg._collapse /*String*/ ("preview");
 //BA.debugLineNum = 886;BA.debugLine="pg.Expand(\"code\")";
_pg._expand /*String*/ ("code");
 //BA.debugLineNum = 887;BA.debugLine="pg.Show(\"download\")";
_pg._show /*String*/ ("download");
 //BA.debugLineNum = 888;BA.debugLine="dConnection.BuildBag(pg, propBag)";
_dconnection._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 890;BA.debugLine="sqlite.Initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 892;BA.debugLine="sqlite.AddStrings(Array(\"id\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 893;BA.debugLine="qry = sqlite.Read(\"connect\",\"id\",\"connection\")";
_qry = _sqlite._read /*String*/ ("connect","id","connection");
 //BA.debugLineNum = 894;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\", C";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 895;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 896;BA.debugLine="If rs.result.Size = 0 Then";
if (_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
 }else {
 //BA.debugLineNum = 899;BA.debugLine="rec = rs.result.Get(0)";
_rec.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0))));
 //BA.debugLineNum = 900;BA.debugLine="json = rec.Get(\"json\")";
_json = BA.ObjectToString(_rec.Get((Object)("json")));
 //BA.debugLineNum = 901;BA.debugLine="rec = pg.Json2Map(json)";
_rec = _pg._json2map /*anywheresoftware.b4a.objects.collections.Map*/ (_json);
 //BA.debugLineNum = 902;BA.debugLine="pg.SetValues(\"propbag\",rec)";
_pg._setvalues /*String*/ ("propbag",_rec);
 //BA.debugLineNum = 904;BA.debugLine="Dim ccode As String = dConnection.ConnectionCod";
_ccode = _dconnection._connectioncode /*String*/ (_rec);
 //BA.debugLineNum = 905;BA.debugLine="SourceCodePreview(ccode)";
_sourcecodepreview(_ccode);
 };
 break; }
case 3: {
 //BA.debugLineNum = 908;BA.debugLine="pg.Show(\"add_row\")";
_pg._show /*String*/ ("add_row");
 //BA.debugLineNum = 909;BA.debugLine="pg.Show(\"add_column\")";
_pg._show /*String*/ ("add_column");
 //BA.debugLineNum = 910;BA.debugLine="pg.Show(\"propadd\")";
_pg._show /*String*/ ("propadd");
 //BA.debugLineNum = 911;BA.debugLine="pg.Expand(\"preview\")";
_pg._expand /*String*/ ("preview");
 //BA.debugLineNum = 912;BA.debugLine="pg.Show(\"add_fields\")";
_pg._show /*String*/ ("add_fields");
 //BA.debugLineNum = 913;BA.debugLine="pg.Show(\"propdelete\")";
_pg._show /*String*/ ("propdelete");
 //BA.debugLineNum = 914;BA.debugLine="pg.Show(\"download\")";
_pg._show /*String*/ ("download");
 //BA.debugLineNum = 916;BA.debugLine="dForm.BuildBag(pg, propBag)";
_dform._buildbag /*String*/ (_pg,_propbag);
 //BA.debugLineNum = 917;BA.debugLine="FormCode(\"form\",True)";
_formcode("form",anywheresoftware.b4a.keywords.Common.True);
 break; }
default: {
 //BA.debugLineNum = 919;BA.debugLine="pg.Show(\"add_row\")";
_pg._show /*String*/ ("add_row");
 //BA.debugLineNum = 920;BA.debugLine="pg.Show(\"add_column\")";
_pg._show /*String*/ ("add_column");
 //BA.debugLineNum = 921;BA.debugLine="pg.Show(\"propadd\")";
_pg._show /*String*/ ("propadd");
 //BA.debugLineNum = 922;BA.debugLine="pg.Expand(\"preview\")";
_pg._expand /*String*/ ("preview");
 //BA.debugLineNum = 923;BA.debugLine="pg.Show(\"add_fields\")";
_pg._show /*String*/ ("add_fields");
 //BA.debugLineNum = 924;BA.debugLine="pg.Show(\"propdelete\")";
_pg._show /*String*/ ("propdelete");
 //BA.debugLineNum = 925;BA.debugLine="pg.Show(\"download\")";
_pg._show /*String*/ ("download");
 //BA.debugLineNum = 926;BA.debugLine="sqlite.Initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 927;BA.debugLine="sqlite.AddStrings(Array(\"id\"))";
_sqlite._addstrings /*b4j.example.bananosqlite*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 928;BA.debugLine="qry = sqlite.SelectWhere(\"items\", Array(\"*\"), Cr";
_qry = _sqlite._selectwhere /*String*/ ("items",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("*")}),anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(_recid)}),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 929;BA.debugLine="res = BANano.CallInlinePHPWait(\"BANanoSQLite\", C";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 930;BA.debugLine="rs = sqlite.GetResultSet(qry,res)";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 931;BA.debugLine="If rs.result.Size = 0 Then";
if (_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
 }else {
 //BA.debugLineNum = 934;BA.debugLine="rec = rs.result.Get(0)";
_rec.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0))));
 //BA.debugLineNum = 935;BA.debugLine="json = rec.get(\"json\")";
_json = BA.ObjectToString(_rec.Get((Object)("json")));
 //BA.debugLineNum = 936;BA.debugLine="rec = pg.Json2Map(json)";
_rec = _pg._json2map /*anywheresoftware.b4a.objects.collections.Map*/ (_json);
 //BA.debugLineNum = 937;BA.debugLine="Dim v As String = rec.get(\"view\")";
_v = BA.ObjectToString(_rec.Get((Object)("view")));
 //BA.debugLineNum = 938;BA.debugLine="v = pg.CStr(v)";
_v = _pg._cstr /*String*/ ((Object)(_v));
 //BA.debugLineNum = 939;BA.debugLine="If v = \"\" Or v = \"undefined\" Then";
if ((_v).equals("") || (_v).equals("undefined")) { 
 //BA.debugLineNum = 940;BA.debugLine="v = \"Element\"";
_v = "Element";
 //BA.debugLineNum = 941;BA.debugLine="rec.Put(\"view\", \"Element\")";
_rec.Put((Object)("view"),(Object)("Element"));
 };
 //BA.debugLineNum = 943;BA.debugLine="v = v.ToLowerCase";
_v = _v.toLowerCase();
 //BA.debugLineNum = 944;BA.debugLine="DrawPropBag(v)";
_drawpropbag(_v);
 //BA.debugLineNum = 945;BA.debugLine="FormCode(recid,True)";
_formcode(_recid,anywheresoftware.b4a.keywords.Common.True);
 };
 break; }
}
;
 //BA.debugLineNum = 948;BA.debugLine="End Sub";
return "";
}
}
