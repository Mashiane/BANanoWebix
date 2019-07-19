package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class bananosqlite extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.bananosqlite", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.bananosqlite.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _db_bool = "";
public String _db_int = "";
public String _db_string = "";
public String _db_real = "";
public String _db_date = "";
public String _db_blob = "";
public anywheresoftware.b4a.objects.collections.Map _rectype = null;
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
public static class _sqliteresultset{
public boolean IsInitialized;
public String response;
public anywheresoftware.b4a.objects.collections.List result;
public String command;
public anywheresoftware.b4a.objects.collections.List types;
public anywheresoftware.b4a.objects.collections.List args;
public String query;
public void Initialize() {
IsInitialized = true;
response = "";
result = new anywheresoftware.b4a.objects.collections.List();
command = "";
types = new anywheresoftware.b4a.objects.collections.List();
args = new anywheresoftware.b4a.objects.collections.List();
query = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public b4j.example.bananosqlite  _addblobs(anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
String _strfld = "";
 //BA.debugLineNum = 328;BA.debugLine="Sub AddBlobs(fieldNames As List) As BANanoSQLite";
 //BA.debugLineNum = 329;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 330;BA.debugLine="recType.Put(strfld,\"BLOB\")";
_rectype.Put((Object)(_strfld),(Object)("BLOB"));
 }
};
 //BA.debugLineNum = 332;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlite)(this);
 //BA.debugLineNum = 333;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlite  _addbooleans(anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
String _strfld = "";
 //BA.debugLineNum = 320;BA.debugLine="Sub AddBooleans(fieldNames As List) As BANanoSQLit";
 //BA.debugLineNum = 321;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 322;BA.debugLine="recType.Put(strfld,\"BOOL\")";
_rectype.Put((Object)(_strfld),(Object)("BOOL"));
 }
};
 //BA.debugLineNum = 324;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlite)(this);
 //BA.debugLineNum = 325;BA.debugLine="End Sub";
return null;
}
public String  _addcolumn(String _tblname,anywheresoftware.b4a.objects.collections.Map _flddef) throws Exception{
String _fldname = "";
String _fldtype = "";
String _qry = "";
anywheresoftware.b4a.objects.collections.Map _m = null;
String _res = "";
 //BA.debugLineNum = 526;BA.debugLine="Sub AddColumn(tblName As String, fldDef As Map) As";
 //BA.debugLineNum = 527;BA.debugLine="Dim fldName As String = fldDef.GetKeyAt(0)";
_fldname = BA.ObjectToString(_flddef.GetKeyAt((int) (0)));
 //BA.debugLineNum = 528;BA.debugLine="Dim fldType As String = fldDef.GetValueAt(0)";
_fldtype = BA.ObjectToString(_flddef.GetValueAt((int) (0)));
 //BA.debugLineNum = 529;BA.debugLine="Dim qry As String = $\"ALTER TABLE [${tblName}] AD";
_qry = ("ALTER TABLE ["+__c.SmartStringFormatter("",(Object)(_tblname))+"] ADD COLUMN ["+__c.SmartStringFormatter("",(Object)(_fldname))+"] "+__c.SmartStringFormatter("",(Object)(_fldtype))+"");
 //BA.debugLineNum = 530;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 531;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 532;BA.debugLine="m.Put(\"sql\", qry)";
_m.Put((Object)("sql"),(Object)(_qry));
 //BA.debugLineNum = 533;BA.debugLine="m.Put(\"args\", Null)";
_m.Put((Object)("args"),__c.Null);
 //BA.debugLineNum = 534;BA.debugLine="m.Put(\"types\", Null)";
_m.Put((Object)("types"),__c.Null);
 //BA.debugLineNum = 535;BA.debugLine="m.Put(\"command\", \"addcolumn\")";
_m.Put((Object)("command"),(Object)("addcolumn"));
 //BA.debugLineNum = 536;BA.debugLine="Dim res As String = Map2Json(m)";
_res = _map2json(_m);
 //BA.debugLineNum = 537;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 538;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananosqlite  _adddoubles(anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
String _strfld = "";
 //BA.debugLineNum = 312;BA.debugLine="Sub AddDoubles(fieldNames As List) As BANanoSQLite";
 //BA.debugLineNum = 313;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 314;BA.debugLine="recType.Put(strfld,\"DOUBLE\")";
_rectype.Put((Object)(_strfld),(Object)("DOUBLE"));
 }
};
 //BA.debugLineNum = 316;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlite)(this);
 //BA.debugLineNum = 317;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlite  _addintegers(anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
String _strfld = "";
 //BA.debugLineNum = 304;BA.debugLine="Sub AddIntegers(fieldNames As List) As BANanoSQLit";
 //BA.debugLineNum = 305;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 306;BA.debugLine="recType.Put(strfld,\"INT\")";
_rectype.Put((Object)(_strfld),(Object)("INT"));
 }
};
 //BA.debugLineNum = 308;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlite)(this);
 //BA.debugLineNum = 309;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlite  _addstrings(anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
String _strfld = "";
 //BA.debugLineNum = 296;BA.debugLine="Sub AddStrings(fieldNames As List) As BANanoSQLite";
 //BA.debugLineNum = 297;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 298;BA.debugLine="recType.Put(strfld,\"STRING\")";
_rectype.Put((Object)(_strfld),(Object)("STRING"));
 }
};
 //BA.debugLineNum = 300;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlite)(this);
 //BA.debugLineNum = 301;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public const DB_BOOL As String = \"BOOL\"";
_db_bool = "BOOL";
 //BA.debugLineNum = 4;BA.debugLine="Public const DB_INT As String = \"INT\"";
_db_int = "INT";
 //BA.debugLineNum = 5;BA.debugLine="Public const DB_STRING As String = \"STRING\"";
_db_string = "STRING";
 //BA.debugLineNum = 6;BA.debugLine="Public const DB_REAL As String = \"REAL\"";
_db_real = "REAL";
 //BA.debugLineNum = 7;BA.debugLine="Public const DB_DATE As String = \"DATE\"";
_db_date = "DATE";
 //BA.debugLineNum = 8;BA.debugLine="Public const DB_BLOB As String = \"BLOB\"";
_db_blob = "BLOB";
 //BA.debugLineNum = 9;BA.debugLine="Private recType As Map";
_rectype = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 10;BA.debugLine="Type SQLiteResultSet(response As String, result A";
;
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
public String  _createtable(String _tblname,anywheresoftware.b4a.objects.collections.Map _tblfields,String _pk) throws Exception{
String _fldname = "";
String _fldtype = "";
int _fldtot = 0;
int _fldcnt = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _query = "";
anywheresoftware.b4a.objects.collections.Map _m = null;
String _res = "";
 //BA.debugLineNum = 341;BA.debugLine="public Sub CreateTable(tblName As String, tblField";
 //BA.debugLineNum = 342;BA.debugLine="Dim fldName As String";
_fldname = "";
 //BA.debugLineNum = 343;BA.debugLine="Dim fldType As String";
_fldtype = "";
 //BA.debugLineNum = 344;BA.debugLine="Dim fldTot As Int";
_fldtot = 0;
 //BA.debugLineNum = 345;BA.debugLine="Dim fldCnt As Int";
_fldcnt = 0;
 //BA.debugLineNum = 346;BA.debugLine="fldTot = tblFields.Size - 1";
_fldtot = (int) (_tblfields.getSize()-1);
 //BA.debugLineNum = 347;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 348;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 349;BA.debugLine="sb.Append(\"(\")";
_sb.Append("(");
 //BA.debugLineNum = 350;BA.debugLine="For fldCnt = 0 To fldTot";
{
final int step9 = 1;
final int limit9 = _fldtot;
_fldcnt = (int) (0) ;
for (;_fldcnt <= limit9 ;_fldcnt = _fldcnt + step9 ) {
 //BA.debugLineNum = 351;BA.debugLine="fldName = tblFields.GetKeyAt(fldCnt)";
_fldname = BA.ObjectToString(_tblfields.GetKeyAt(_fldcnt));
 //BA.debugLineNum = 352;BA.debugLine="fldType = tblFields.Get(fldName)";
_fldtype = BA.ObjectToString(_tblfields.Get((Object)(_fldname)));
 //BA.debugLineNum = 353;BA.debugLine="If fldCnt > 0 Then";
if (_fldcnt>0) { 
 //BA.debugLineNum = 354;BA.debugLine="sb.Append(\", \")";
_sb.Append(", ");
 };
 //BA.debugLineNum = 356;BA.debugLine="sb.Append(EscapeField(fldName))";
_sb.Append(_escapefield(_fldname));
 //BA.debugLineNum = 357;BA.debugLine="sb.Append(\" \")";
_sb.Append(" ");
 //BA.debugLineNum = 358;BA.debugLine="sb.Append(fldType)";
_sb.Append(_fldtype);
 //BA.debugLineNum = 359;BA.debugLine="If fldName.EqualsIgnoreCase(PK) Then";
if (_fldname.equalsIgnoreCase(_pk)) { 
 //BA.debugLineNum = 360;BA.debugLine="sb.Append(\" PRIMARY KEY\")";
_sb.Append(" PRIMARY KEY");
 };
 }
};
 //BA.debugLineNum = 363;BA.debugLine="sb.Append(\")\")";
_sb.Append(")");
 //BA.debugLineNum = 365;BA.debugLine="Dim query As String = \"CREATE TABLE IF NOT EXISTS";
_query = "CREATE TABLE IF NOT EXISTS "+_escapefield(_tblname)+" "+_sb.ToString();
 //BA.debugLineNum = 366;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 367;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 368;BA.debugLine="m.Put(\"sql\", query)";
_m.Put((Object)("sql"),(Object)(_query));
 //BA.debugLineNum = 369;BA.debugLine="m.Put(\"args\", Null)";
_m.Put((Object)("args"),__c.Null);
 //BA.debugLineNum = 370;BA.debugLine="m.Put(\"types\", Null)";
_m.Put((Object)("types"),__c.Null);
 //BA.debugLineNum = 371;BA.debugLine="m.Put(\"command\", \"createtable\")";
_m.Put((Object)("command"),(Object)("createtable"));
 //BA.debugLineNum = 372;BA.debugLine="Dim res As String = Map2Json(m)";
_res = _map2json(_m);
 //BA.debugLineNum = 373;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 374;BA.debugLine="End Sub";
return "";
}
public String  _deleteall(String _tblname) throws Exception{
String _sb = "";
anywheresoftware.b4a.objects.collections.Map _m = null;
String _res = "";
 //BA.debugLineNum = 48;BA.debugLine="Sub DeleteAll(tblName As String) As String";
 //BA.debugLineNum = 49;BA.debugLine="Dim sb As String = $\"DELETE FROM ${EscapeField(tb";
_sb = ("DELETE FROM "+__c.SmartStringFormatter("",(Object)(_escapefield(_tblname)))+"");
 //BA.debugLineNum = 50;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 51;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 52;BA.debugLine="m.Put(\"sql\", sb)";
_m.Put((Object)("sql"),(Object)(_sb));
 //BA.debugLineNum = 53;BA.debugLine="m.Put(\"args\", Null)";
_m.Put((Object)("args"),__c.Null);
 //BA.debugLineNum = 54;BA.debugLine="m.Put(\"types\", Null)";
_m.Put((Object)("types"),__c.Null);
 //BA.debugLineNum = 55;BA.debugLine="m.Put(\"command\", \"delete\")";
_m.Put((Object)("command"),(Object)("delete"));
 //BA.debugLineNum = 56;BA.debugLine="Dim res As String = Map2Json(m)";
_res = _map2json(_m);
 //BA.debugLineNum = 57;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return "";
}
public String  _deletewhere(String _tblname,anywheresoftware.b4a.objects.collections.Map _tblwhere) throws Exception{
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
int _iwhere = 0;
String _col = "";
anywheresoftware.b4a.objects.collections.Map _m = null;
String _res = "";
 //BA.debugLineNum = 500;BA.debugLine="Sub DeleteWhere(tblName As String, tblWhere As Map";
 //BA.debugLineNum = 501;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblWhere)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = _getmaptypes(_tblwhere);
 //BA.debugLineNum = 502;BA.debugLine="Dim listOfValues As List = GetMapValues(tblWhere)";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = _getmapvalues(_tblwhere);
 //BA.debugLineNum = 503;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 504;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 505;BA.debugLine="sb.Append($\"DELETE FROM ${EscapeField(tblName)} W";
_sb.Append(("DELETE FROM "+__c.SmartStringFormatter("",(Object)(_escapefield(_tblname)))+" WHERE "));
 //BA.debugLineNum = 506;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 507;BA.debugLine="Dim iWhere As Int = tblWhere.Size - 1";
_iwhere = (int) (_tblwhere.getSize()-1);
 //BA.debugLineNum = 508;BA.debugLine="For i = 0 To iWhere";
{
final int step8 = 1;
final int limit8 = _iwhere;
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
 //BA.debugLineNum = 509;BA.debugLine="If i > 0 Then";
if (_i>0) { 
 //BA.debugLineNum = 510;BA.debugLine="sb.Append(\" AND \")";
_sb.Append(" AND ");
 };
 //BA.debugLineNum = 512;BA.debugLine="Dim col As String = tblWhere.GetKeyAt(i)";
_col = BA.ObjectToString(_tblwhere.GetKeyAt(_i));
 //BA.debugLineNum = 513;BA.debugLine="sb.Append(col)";
_sb.Append(_col);
 //BA.debugLineNum = 514;BA.debugLine="sb.Append(\" = ?\")";
_sb.Append(" = ?");
 }
};
 //BA.debugLineNum = 516;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 517;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 518;BA.debugLine="m.Put(\"sql\", sb.tostring)";
_m.Put((Object)("sql"),(Object)(_sb.ToString()));
 //BA.debugLineNum = 519;BA.debugLine="m.Put(\"args\", listOfValues)";
_m.Put((Object)("args"),(Object)(_listofvalues.getObject()));
 //BA.debugLineNum = 520;BA.debugLine="m.Put(\"types\", listOfTypes)";
_m.Put((Object)("types"),(Object)(_listoftypes.getObject()));
 //BA.debugLineNum = 521;BA.debugLine="m.Put(\"command\", \"deletewhere\")";
_m.Put((Object)("command"),(Object)("deletewhere"));
 //BA.debugLineNum = 522;BA.debugLine="Dim res As String = Map2Json(m)";
_res = _map2json(_m);
 //BA.debugLineNum = 523;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 524;BA.debugLine="End Sub";
return "";
}
public String  _escapefield(String _f) throws Exception{
 //BA.debugLineNum = 336;BA.debugLine="Private Sub EscapeField(f As String) As String";
 //BA.debugLineNum = 337;BA.debugLine="Return $\"[${f}]\"$";
if (true) return ("["+__c.SmartStringFormatter("",(Object)(_f))+"]");
 //BA.debugLineNum = 338;BA.debugLine="End Sub";
return "";
}
public String  _execute(String _strsql) throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
String _res = "";
 //BA.debugLineNum = 540;BA.debugLine="Sub Execute(strSQL As String) As String";
 //BA.debugLineNum = 541;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 542;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 543;BA.debugLine="m.Put(\"sql\", strSQL)";
_m.Put((Object)("sql"),(Object)(_strsql));
 //BA.debugLineNum = 544;BA.debugLine="m.Put(\"args\", Null)";
_m.Put((Object)("args"),__c.Null);
 //BA.debugLineNum = 545;BA.debugLine="m.Put(\"types\", Null)";
_m.Put((Object)("types"),__c.Null);
 //BA.debugLineNum = 546;BA.debugLine="m.Put(\"command\", \"execute\")";
_m.Put((Object)("command"),(Object)("execute"));
 //BA.debugLineNum = 547;BA.debugLine="Dim res As String = Map2Json(m)";
_res = _map2json(_m);
 //BA.debugLineNum = 548;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 549;BA.debugLine="End Sub";
return "";
}
public String  _exists(String _tblname,String _primarykey,String _primaryvalue) throws Exception{
anywheresoftware.b4a.objects.collections.Map _qw = null;
String _qry = "";
 //BA.debugLineNum = 147;BA.debugLine="Sub Exists(tblName As String, primaryKey As String";
 //BA.debugLineNum = 148;BA.debugLine="Dim qw As Map = CreateMap()";
_qw = new anywheresoftware.b4a.objects.collections.Map();
_qw = __c.createMap(new Object[] {});
 //BA.debugLineNum = 149;BA.debugLine="qw.Put(primaryKey, primaryValue)";
_qw.Put((Object)(_primarykey),(Object)(_primaryvalue));
 //BA.debugLineNum = 150;BA.debugLine="Dim qry As String = SelectWhere(tblName, Array(pr";
_qry = _selectwhere(_tblname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_primarykey)}),_qw,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_primarykey)}));
 //BA.debugLineNum = 151;BA.debugLine="Return qry";
if (true) return _qry;
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _getmapkeys(anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
int _icnt = 0;
int _itot = 0;
String _value = "";
 //BA.debugLineNum = 282;BA.debugLine="private Sub GetMapKeys(sourceMap As Map) As List";
 //BA.debugLineNum = 283;BA.debugLine="Dim listOfValues As List";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 284;BA.debugLine="listOfValues.Initialize";
_listofvalues.Initialize();
 //BA.debugLineNum = 285;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
 //BA.debugLineNum = 286;BA.debugLine="Dim iTot As Int";
_itot = 0;
 //BA.debugLineNum = 287;BA.debugLine="iTot = sourceMap.Size - 1";
_itot = (int) (_sourcemap.getSize()-1);
 //BA.debugLineNum = 288;BA.debugLine="For iCnt = 0 To iTot";
{
final int step6 = 1;
final int limit6 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit6 ;_icnt = _icnt + step6 ) {
 //BA.debugLineNum = 289;BA.debugLine="Dim value As String = sourceMap.GetKeyAt(iCnt)";
_value = BA.ObjectToString(_sourcemap.GetKeyAt(_icnt));
 //BA.debugLineNum = 290;BA.debugLine="listOfValues.Add(value)";
_listofvalues.Add((Object)(_value));
 }
};
 //BA.debugLineNum = 292;BA.debugLine="Return listOfValues";
if (true) return _listofvalues;
 //BA.debugLineNum = 293;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getmaptypes(anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
int _icnt = 0;
int _itot = 0;
String _col = "";
String _coltype = "";
 //BA.debugLineNum = 240;BA.debugLine="private Sub GetMapTypes(sourceMap As Map) As List";
 //BA.debugLineNum = 241;BA.debugLine="Dim listOfTypes As List";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 242;BA.debugLine="listOfTypes.Initialize";
_listoftypes.Initialize();
 //BA.debugLineNum = 243;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
 //BA.debugLineNum = 244;BA.debugLine="Dim iTot As Int";
_itot = 0;
 //BA.debugLineNum = 245;BA.debugLine="iTot = sourceMap.Size - 1";
_itot = (int) (_sourcemap.getSize()-1);
 //BA.debugLineNum = 246;BA.debugLine="For iCnt = 0 To iTot";
{
final int step6 = 1;
final int limit6 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit6 ;_icnt = _icnt + step6 ) {
 //BA.debugLineNum = 247;BA.debugLine="Dim col As String = sourceMap.GetKeyAt(iCnt)";
_col = BA.ObjectToString(_sourcemap.GetKeyAt(_icnt));
 //BA.debugLineNum = 248;BA.debugLine="Dim colType As String = recType.GetDefault(col,\"";
_coltype = BA.ObjectToString(_rectype.GetDefault((Object)(_col),(Object)("STRING")));
 //BA.debugLineNum = 249;BA.debugLine="Select Case colType";
switch (BA.switchObjectToInt(_coltype,"VARCHAR(20)","VARCHAR(10)","VARCHAR(30)","VARCHAR(40)","VARCHAR(50)","VARCHAR(100)","VARCHAR(255)","STRING","VARCHAR","TEXT","DATE","DATETIME","INTEGER","INT","BOOL","BLOB","REAL","FLOAT","DOUBLE")) {
case 0: 
case 1: 
case 2: 
case 3: {
 //BA.debugLineNum = 251;BA.debugLine="listOfTypes.add(\"s\")";
_listoftypes.Add((Object)("s"));
 break; }
case 4: 
case 5: 
case 6: {
 //BA.debugLineNum = 253;BA.debugLine="listOfTypes.add(\"s\")";
_listoftypes.Add((Object)("s"));
 break; }
case 7: 
case 8: 
case 9: 
case 10: 
case 11: {
 //BA.debugLineNum = 255;BA.debugLine="listOfTypes.add(\"s\")";
_listoftypes.Add((Object)("s"));
 break; }
case 12: 
case 13: 
case 14: {
 //BA.debugLineNum = 257;BA.debugLine="listOfTypes.add(\"i\")";
_listoftypes.Add((Object)("i"));
 break; }
case 15: {
 //BA.debugLineNum = 259;BA.debugLine="listOfTypes.add(\"b\")";
_listoftypes.Add((Object)("b"));
 break; }
case 16: 
case 17: 
case 18: {
 //BA.debugLineNum = 261;BA.debugLine="listOfTypes.add(\"d\")";
_listoftypes.Add((Object)("d"));
 break; }
}
;
 }
};
 //BA.debugLineNum = 264;BA.debugLine="Return listOfTypes";
if (true) return _listoftypes;
 //BA.debugLineNum = 265;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getmapvalues(anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
int _icnt = 0;
int _itot = 0;
String _value = "";
 //BA.debugLineNum = 268;BA.debugLine="private Sub GetMapValues(sourceMap As Map) As List";
 //BA.debugLineNum = 269;BA.debugLine="Dim listOfValues As List";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 270;BA.debugLine="listOfValues.Initialize";
_listofvalues.Initialize();
 //BA.debugLineNum = 271;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
 //BA.debugLineNum = 272;BA.debugLine="Dim iTot As Int";
_itot = 0;
 //BA.debugLineNum = 273;BA.debugLine="iTot = sourceMap.Size - 1";
_itot = (int) (_sourcemap.getSize()-1);
 //BA.debugLineNum = 274;BA.debugLine="For iCnt = 0 To iTot";
{
final int step6 = 1;
final int limit6 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit6 ;_icnt = _icnt + step6 ) {
 //BA.debugLineNum = 275;BA.debugLine="Dim value As String = sourceMap.GetValueAt(iCnt)";
_value = BA.ObjectToString(_sourcemap.GetValueAt(_icnt));
 //BA.debugLineNum = 276;BA.debugLine="listOfValues.Add(value)";
_listofvalues.Add((Object)(_value));
 }
};
 //BA.debugLineNum = 278;BA.debugLine="Return listOfValues";
if (true) return _listofvalues;
 //BA.debugLineNum = 279;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlite._sqliteresultset  _getresultset(String _query,String _res) throws Exception{
anywheresoftware.b4a.objects.collections.List _tt = null;
anywheresoftware.b4a.objects.collections.List _aa = null;
anywheresoftware.b4a.objects.collections.List _datalist = null;
anywheresoftware.b4a.objects.collections.Map _resmap = null;
String _scommand = "";
anywheresoftware.b4a.objects.collections.List _stypes = null;
anywheresoftware.b4a.objects.collections.List _sargs = null;
String _ssql = "";
anywheresoftware.b4a.objects.collections.Map _resmap1 = null;
b4j.example.bananosqlite._sqliteresultset _gr = null;
 //BA.debugLineNum = 22;BA.debugLine="Sub GetResultSet(query As String, res As String) A";
 //BA.debugLineNum = 23;BA.debugLine="Dim tt As List";
_tt = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 24;BA.debugLine="tt.Initialize";
_tt.Initialize();
 //BA.debugLineNum = 25;BA.debugLine="Dim aa As List";
_aa = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 26;BA.debugLine="aa.Initialize";
_aa.Initialize();
 //BA.debugLineNum = 27;BA.debugLine="Dim dataList As List";
_datalist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 28;BA.debugLine="dataList.Initialize";
_datalist.Initialize();
 //BA.debugLineNum = 29;BA.debugLine="Dim resmap As Map = Json2Map(query)";
_resmap = new anywheresoftware.b4a.objects.collections.Map();
_resmap = _json2map(_query);
 //BA.debugLineNum = 30;BA.debugLine="Dim scommand As String = resmap.GetDefault(\"comma";
_scommand = BA.ObjectToString(_resmap.GetDefault((Object)("command"),(Object)("")));
 //BA.debugLineNum = 31;BA.debugLine="Dim stypes As List = resmap.GetDefault(\"types\", t";
_stypes = new anywheresoftware.b4a.objects.collections.List();
_stypes.setObject((java.util.List)(_resmap.GetDefault((Object)("types"),(Object)(_tt.getObject()))));
 //BA.debugLineNum = 32;BA.debugLine="Dim sargs As List = resmap.GetDefault(\"args\", aa)";
_sargs = new anywheresoftware.b4a.objects.collections.List();
_sargs.setObject((java.util.List)(_resmap.GetDefault((Object)("args"),(Object)(_aa.getObject()))));
 //BA.debugLineNum = 33;BA.debugLine="Dim ssql As String = resmap.GetDefault(\"sql\",\"\")";
_ssql = BA.ObjectToString(_resmap.GetDefault((Object)("sql"),(Object)("")));
 //BA.debugLineNum = 35;BA.debugLine="Dim resmap1 As Map = Json2Map(res)";
_resmap1 = new anywheresoftware.b4a.objects.collections.Map();
_resmap1 = _json2map(_res);
 //BA.debugLineNum = 36;BA.debugLine="Dim gr As SQLiteResultSet";
_gr = new b4j.example.bananosqlite._sqliteresultset();
 //BA.debugLineNum = 37;BA.debugLine="gr.Initialize";
_gr.Initialize();
 //BA.debugLineNum = 38;BA.debugLine="gr.query = ssql";
_gr.query /*String*/  = _ssql;
 //BA.debugLineNum = 39;BA.debugLine="gr.args = sargs";
_gr.args /*anywheresoftware.b4a.objects.collections.List*/  = _sargs;
 //BA.debugLineNum = 40;BA.debugLine="gr.command = scommand";
_gr.command /*String*/  = _scommand;
 //BA.debugLineNum = 41;BA.debugLine="gr.types = stypes";
_gr.types /*anywheresoftware.b4a.objects.collections.List*/  = _stypes;
 //BA.debugLineNum = 42;BA.debugLine="gr.response = resmap1.GetDefault(\"response\",\"\")";
_gr.response /*String*/  = BA.ObjectToString(_resmap1.GetDefault((Object)("response"),(Object)("")));
 //BA.debugLineNum = 43;BA.debugLine="gr.result = resmap1.GetDefault(\"data\", dataList)";
_gr.result /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(_resmap1.GetDefault((Object)("data"),(Object)(_datalist.getObject()))));
 //BA.debugLineNum = 44;BA.debugLine="Return gr";
if (true) return _gr;
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlite  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize() As BANanoSQLite";
 //BA.debugLineNum = 16;BA.debugLine="recType.Initialize";
_rectype.Initialize();
 //BA.debugLineNum = 17;BA.debugLine="AddIntegers(Array(\"id\"))";
_addintegers(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 18;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlite)(this);
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return null;
}
public String  _insert(String _tblname,anywheresoftware.b4a.objects.collections.Map _tblfields) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _columns = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _values = null;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
int _icnt = 0;
int _itot = 0;
String _col = "";
anywheresoftware.b4a.objects.collections.Map _m = null;
String _res = "";
 //BA.debugLineNum = 377;BA.debugLine="Sub Insert(tblName As String, tblFields As Map) As";
 //BA.debugLineNum = 378;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 379;BA.debugLine="Dim columns As StringBuilder";
_columns = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 380;BA.debugLine="Dim values As StringBuilder";
_values = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 381;BA.debugLine="Dim listOfValues As List = GetMapValues(tblFields";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = _getmapvalues(_tblfields);
 //BA.debugLineNum = 382;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblFields)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = _getmaptypes(_tblfields);
 //BA.debugLineNum = 383;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
 //BA.debugLineNum = 384;BA.debugLine="Dim iTot As Int";
_itot = 0;
 //BA.debugLineNum = 385;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 386;BA.debugLine="columns.Initialize";
_columns.Initialize();
 //BA.debugLineNum = 387;BA.debugLine="values.Initialize";
_values.Initialize();
 //BA.debugLineNum = 388;BA.debugLine="sb.Append($\"INSERT INTO ${EscapeField(tblName)} (";
_sb.Append(("INSERT INTO "+__c.SmartStringFormatter("",(Object)(_escapefield(_tblname)))+" ("));
 //BA.debugLineNum = 389;BA.debugLine="iTot = tblFields.Size - 1";
_itot = (int) (_tblfields.getSize()-1);
 //BA.debugLineNum = 390;BA.debugLine="For iCnt = 0 To iTot";
{
final int step13 = 1;
final int limit13 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit13 ;_icnt = _icnt + step13 ) {
 //BA.debugLineNum = 391;BA.debugLine="Dim col As String = tblFields.GetKeyAt(iCnt)";
_col = BA.ObjectToString(_tblfields.GetKeyAt(_icnt));
 //BA.debugLineNum = 392;BA.debugLine="If iCnt > 0 Then";
if (_icnt>0) { 
 //BA.debugLineNum = 393;BA.debugLine="columns.Append(\", \")";
_columns.Append(", ");
 //BA.debugLineNum = 394;BA.debugLine="values.Append(\", \")";
_values.Append(", ");
 };
 //BA.debugLineNum = 396;BA.debugLine="columns.Append(EscapeField(col))";
_columns.Append(_escapefield(_col));
 //BA.debugLineNum = 397;BA.debugLine="values.Append(\"?\")";
_values.Append("?");
 }
};
 //BA.debugLineNum = 399;BA.debugLine="sb.Append(columns.ToString)";
_sb.Append(_columns.ToString());
 //BA.debugLineNum = 400;BA.debugLine="sb.Append(\") VALUES (\")";
_sb.Append(") VALUES (");
 //BA.debugLineNum = 401;BA.debugLine="sb.Append(values.ToString)";
_sb.Append(_values.ToString());
 //BA.debugLineNum = 402;BA.debugLine="sb.Append(\")\")";
_sb.Append(")");
 //BA.debugLineNum = 403;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 404;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 405;BA.debugLine="m.Put(\"sql\", sb.ToString)";
_m.Put((Object)("sql"),(Object)(_sb.ToString()));
 //BA.debugLineNum = 406;BA.debugLine="m.Put(\"args\", listOfValues)";
_m.Put((Object)("args"),(Object)(_listofvalues.getObject()));
 //BA.debugLineNum = 407;BA.debugLine="m.Put(\"types\", listOfTypes)";
_m.Put((Object)("types"),(Object)(_listoftypes.getObject()));
 //BA.debugLineNum = 408;BA.debugLine="m.Put(\"command\", \"insert\")";
_m.Put((Object)("command"),(Object)("insert"));
 //BA.debugLineNum = 409;BA.debugLine="Dim res As String = Map2Json(m)";
_res = _map2json(_m);
 //BA.debugLineNum = 410;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 411;BA.debugLine="End Sub";
return "";
}
public String  _insertreplace(String _tblname,anywheresoftware.b4a.objects.collections.Map _tblfields) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _columns = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _values = null;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
int _icnt = 0;
int _itot = 0;
String _col = "";
anywheresoftware.b4a.objects.collections.Map _m = null;
String _res = "";
 //BA.debugLineNum = 414;BA.debugLine="Sub InsertReplace(tblName As String, tblFields As";
 //BA.debugLineNum = 415;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 416;BA.debugLine="Dim columns As StringBuilder";
_columns = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 417;BA.debugLine="Dim values As StringBuilder";
_values = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 418;BA.debugLine="Dim listOfValues As List = GetMapValues(tblFields";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = _getmapvalues(_tblfields);
 //BA.debugLineNum = 419;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblFields)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = _getmaptypes(_tblfields);
 //BA.debugLineNum = 420;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
 //BA.debugLineNum = 421;BA.debugLine="Dim iTot As Int";
_itot = 0;
 //BA.debugLineNum = 422;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 423;BA.debugLine="columns.Initialize";
_columns.Initialize();
 //BA.debugLineNum = 424;BA.debugLine="values.Initialize";
_values.Initialize();
 //BA.debugLineNum = 425;BA.debugLine="sb.Append($\"REPLACE INTO ${EscapeField(tblName)}";
_sb.Append(("REPLACE INTO "+__c.SmartStringFormatter("",(Object)(_escapefield(_tblname)))+" ("));
 //BA.debugLineNum = 426;BA.debugLine="iTot = tblFields.Size - 1";
_itot = (int) (_tblfields.getSize()-1);
 //BA.debugLineNum = 427;BA.debugLine="For iCnt = 0 To iTot";
{
final int step13 = 1;
final int limit13 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit13 ;_icnt = _icnt + step13 ) {
 //BA.debugLineNum = 428;BA.debugLine="Dim col As String = tblFields.GetKeyAt(iCnt)";
_col = BA.ObjectToString(_tblfields.GetKeyAt(_icnt));
 //BA.debugLineNum = 429;BA.debugLine="If iCnt > 0 Then";
if (_icnt>0) { 
 //BA.debugLineNum = 430;BA.debugLine="columns.Append(\", \")";
_columns.Append(", ");
 //BA.debugLineNum = 431;BA.debugLine="values.Append(\", \")";
_values.Append(", ");
 };
 //BA.debugLineNum = 433;BA.debugLine="columns.Append(EscapeField(col))";
_columns.Append(_escapefield(_col));
 //BA.debugLineNum = 434;BA.debugLine="values.Append(\"?\")";
_values.Append("?");
 }
};
 //BA.debugLineNum = 436;BA.debugLine="sb.Append(columns.ToString)";
_sb.Append(_columns.ToString());
 //BA.debugLineNum = 437;BA.debugLine="sb.Append(\") VALUES (\")";
_sb.Append(") VALUES (");
 //BA.debugLineNum = 438;BA.debugLine="sb.Append(values.ToString)";
_sb.Append(_values.ToString());
 //BA.debugLineNum = 439;BA.debugLine="sb.Append(\")\")";
_sb.Append(")");
 //BA.debugLineNum = 440;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 441;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 442;BA.debugLine="m.Put(\"sql\", sb.ToString)";
_m.Put((Object)("sql"),(Object)(_sb.ToString()));
 //BA.debugLineNum = 443;BA.debugLine="m.Put(\"args\", listOfValues)";
_m.Put((Object)("args"),(Object)(_listofvalues.getObject()));
 //BA.debugLineNum = 444;BA.debugLine="m.Put(\"types\", listOfTypes)";
_m.Put((Object)("types"),(Object)(_listoftypes.getObject()));
 //BA.debugLineNum = 445;BA.debugLine="m.Put(\"command\", \"replace\")";
_m.Put((Object)("command"),(Object)("replace"));
 //BA.debugLineNum = 446;BA.debugLine="Dim res As String = Map2Json(m)";
_res = _map2json(_m);
 //BA.debugLineNum = 447;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 448;BA.debugLine="End Sub";
return "";
}
public String  _joinfields(String _delimiter,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
int _i = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _fld = "";
 //BA.debugLineNum = 451;BA.debugLine="private Sub JoinFields(delimiter As String, lst As";
 //BA.debugLineNum = 452;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 453;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 454;BA.debugLine="Dim fld As String";
_fld = "";
 //BA.debugLineNum = 455;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 456;BA.debugLine="fld = lst.Get(0)";
_fld = BA.ObjectToString(_lst.Get((int) (0)));
 //BA.debugLineNum = 457;BA.debugLine="fld = EscapeField(fld)";
_fld = _escapefield(_fld);
 //BA.debugLineNum = 458;BA.debugLine="sb.Append(fld)";
_sb.Append(_fld);
 //BA.debugLineNum = 459;BA.debugLine="For i = 1 To lst.size - 1";
{
final int step8 = 1;
final int limit8 = (int) (_lst.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
 //BA.debugLineNum = 460;BA.debugLine="Dim fld As String = lst.Get(i)";
_fld = BA.ObjectToString(_lst.Get(_i));
 //BA.debugLineNum = 461;BA.debugLine="fld = EscapeField(fld)";
_fld = _escapefield(_fld);
 //BA.debugLineNum = 462;BA.debugLine="sb.Append(delimiter).Append(fld)";
_sb.Append(_delimiter).Append(_fld);
 }
};
 //BA.debugLineNum = 464;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 465;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _json2list(String _strvalue) throws Exception{
anywheresoftware.b4a.objects.collections.List _lst = null;
com.ab.banano.BANanoJSONParser _parser = null;
 //BA.debugLineNum = 93;BA.debugLine="Sub Json2List(strValue As String) As List";
 //BA.debugLineNum = 94;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 95;BA.debugLine="lst.Initialize";
_lst.Initialize();
 //BA.debugLineNum = 96;BA.debugLine="lst.clear";
_lst.Clear();
 //BA.debugLineNum = 97;BA.debugLine="If strValue.Length = 0 Then";
if (_strvalue.length()==0) { 
 //BA.debugLineNum = 98;BA.debugLine="Return lst";
if (true) return _lst;
 };
 //BA.debugLineNum = 100;BA.debugLine="Try";
try { //BA.debugLineNum = 101;BA.debugLine="Dim parser As BANanoJSONParser";
_parser = new com.ab.banano.BANanoJSONParser();
 //BA.debugLineNum = 102;BA.debugLine="parser.Initialize(strValue)";
_parser.Initialize(_strvalue);
 //BA.debugLineNum = 103;BA.debugLine="Return parser.NextArray";
if (true) return _parser.NextArray();
 } 
       catch (Exception e12) {
			ba.setLastException(e12); //BA.debugLineNum = 105;BA.debugLine="Return lst";
if (true) return _lst;
 };
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _json2map(String _strjson) throws Exception{
com.ab.banano.BANanoJSONParser _json = null;
anywheresoftware.b4a.objects.collections.Map _map1 = null;
 //BA.debugLineNum = 76;BA.debugLine="Sub Json2Map(strJSON As String) As Map";
 //BA.debugLineNum = 77;BA.debugLine="Dim json As BANanoJSONParser";
_json = new com.ab.banano.BANanoJSONParser();
 //BA.debugLineNum = 78;BA.debugLine="Dim Map1 As Map";
_map1 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 79;BA.debugLine="Map1.Initialize";
_map1.Initialize();
 //BA.debugLineNum = 80;BA.debugLine="Map1.clear";
_map1.Clear();
 //BA.debugLineNum = 81;BA.debugLine="Try";
try { //BA.debugLineNum = 82;BA.debugLine="If strJSON.length > 0 Then";
if (_strjson.length()>0) { 
 //BA.debugLineNum = 83;BA.debugLine="json.Initialize(strJSON)";
_json.Initialize(_strjson);
 //BA.debugLineNum = 84;BA.debugLine="Map1 = json.NextObject";
_map1 = _json.NextObject();
 };
 //BA.debugLineNum = 86;BA.debugLine="Return Map1";
if (true) return _map1;
 } 
       catch (Exception e12) {
			ba.setLastException(e12); //BA.debugLineNum = 88;BA.debugLine="Return Map1";
if (true) return _map1;
 };
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return null;
}
public String  _list2json(anywheresoftware.b4a.objects.collections.List _mp) throws Exception{
com.ab.banano.BANanoJSONGenerator _json = null;
 //BA.debugLineNum = 68;BA.debugLine="Sub List2Json(mp As List) As String";
 //BA.debugLineNum = 69;BA.debugLine="Dim JSON As BANanoJSONGenerator";
_json = new com.ab.banano.BANanoJSONGenerator();
 //BA.debugLineNum = 70;BA.debugLine="JSON.Initialize2(mp)";
_json.Initialize2(_mp);
 //BA.debugLineNum = 71;BA.debugLine="Return JSON.ToString";
if (true) return _json.ToString();
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return "";
}
public String  _map2json(anywheresoftware.b4a.objects.collections.Map _mp) throws Exception{
com.ab.banano.BANanoJSONGenerator _json = null;
 //BA.debugLineNum = 61;BA.debugLine="Sub Map2Json(mp As Map) As String";
 //BA.debugLineNum = 62;BA.debugLine="Dim JSON As BANanoJSONGenerator";
_json = new com.ab.banano.BANanoJSONGenerator();
 //BA.debugLineNum = 63;BA.debugLine="JSON.Initialize(mp)";
_json.Initialize(_mp);
 //BA.debugLineNum = 64;BA.debugLine="Return JSON.ToString";
if (true) return _json.ToString();
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return "";
}
public String  _read(String _tblname,String _primarykey,String _primaryvalue) throws Exception{
anywheresoftware.b4a.objects.collections.Map _qw = null;
String _qry = "";
 //BA.debugLineNum = 138;BA.debugLine="Sub Read(tblName As String, primaryKey As String,";
 //BA.debugLineNum = 139;BA.debugLine="Dim qw As Map = CreateMap()";
_qw = new anywheresoftware.b4a.objects.collections.Map();
_qw = __c.createMap(new Object[] {});
 //BA.debugLineNum = 140;BA.debugLine="qw.Put(primaryKey, primaryValue)";
_qw.Put((Object)(_primarykey),(Object)(_primaryvalue));
 //BA.debugLineNum = 141;BA.debugLine="Dim qry As String = SelectWhere(tblName, Array(\"*";
_qry = _selectwhere(_tblname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("*")}),_qw,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_primarykey)}));
 //BA.debugLineNum = 142;BA.debugLine="Return qry";
if (true) return _qry;
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return "";
}
public String  _selectall(String _tblname,anywheresoftware.b4a.objects.collections.List _tblfields,anywheresoftware.b4a.objects.collections.List _orderby) throws Exception{
String _fld1 = "";
String _selfields = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _stro = "";
anywheresoftware.b4a.objects.collections.Map _m = null;
String _res = "";
 //BA.debugLineNum = 469;BA.debugLine="Sub SelectAll(tblName As String, tblfields As List";
 //BA.debugLineNum = 471;BA.debugLine="Dim fld1 As String = tblfields.Get(0)";
_fld1 = BA.ObjectToString(_tblfields.Get((int) (0)));
 //BA.debugLineNum = 472;BA.debugLine="Dim selFIelds As String = \"\"";
_selfields = "";
 //BA.debugLineNum = 473;BA.debugLine="Select Case fld1";
switch (BA.switchObjectToInt(_fld1,"*")) {
case 0: {
 //BA.debugLineNum = 475;BA.debugLine="selFIelds = \"*\"";
_selfields = "*";
 break; }
default: {
 //BA.debugLineNum = 477;BA.debugLine="selFIelds = JoinFields(\",\", tblfields)";
_selfields = _joinfields(",",_tblfields);
 break; }
}
;
 //BA.debugLineNum = 479;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 480;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 481;BA.debugLine="sb.Append($\"SELECT ${selFIelds} FROM ${EscapeFiel";
_sb.Append(("SELECT "+__c.SmartStringFormatter("",(Object)(_selfields))+" FROM "+__c.SmartStringFormatter("",(Object)(_escapefield(_tblname)))+""));
 //BA.debugLineNum = 482;BA.debugLine="If orderBy <> Null Then";
if (_orderby!= null) { 
 //BA.debugLineNum = 484;BA.debugLine="Dim stro As String = JoinFields(\",\", orderBy)";
_stro = _joinfields(",",_orderby);
 //BA.debugLineNum = 485;BA.debugLine="If stro.Length > 0 Then";
if (_stro.length()>0) { 
 //BA.debugLineNum = 486;BA.debugLine="sb.Append(\" ORDER BY \").Append(stro)";
_sb.Append(" ORDER BY ").Append(_stro);
 };
 };
 //BA.debugLineNum = 489;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 490;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 491;BA.debugLine="m.Put(\"sql\", sb.tostring)";
_m.Put((Object)("sql"),(Object)(_sb.ToString()));
 //BA.debugLineNum = 492;BA.debugLine="m.Put(\"args\", Null)";
_m.Put((Object)("args"),__c.Null);
 //BA.debugLineNum = 493;BA.debugLine="m.Put(\"types\", Null)";
_m.Put((Object)("types"),__c.Null);
 //BA.debugLineNum = 494;BA.debugLine="m.Put(\"command\", \"select\")";
_m.Put((Object)("command"),(Object)("select"));
 //BA.debugLineNum = 495;BA.debugLine="Dim res As String = Map2Json(m)";
_res = _map2json(_m);
 //BA.debugLineNum = 496;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 497;BA.debugLine="End Sub";
return "";
}
public String  _selectwhere(String _tblname,anywheresoftware.b4a.objects.collections.List _tblfields,anywheresoftware.b4a.objects.collections.Map _tblwhere,anywheresoftware.b4a.objects.collections.List _orderby) throws Exception{
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
String _fld1 = "";
String _selfields = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
int _iwhere = 0;
String _col = "";
String _stro = "";
anywheresoftware.b4a.objects.collections.Map _m = null;
String _res = "";
 //BA.debugLineNum = 155;BA.debugLine="Sub SelectWhere(tblName As String, tblfields As Li";
 //BA.debugLineNum = 156;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblWhere)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = _getmaptypes(_tblwhere);
 //BA.debugLineNum = 157;BA.debugLine="Dim listOfValues As List = GetMapValues(tblWhere)";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = _getmapvalues(_tblwhere);
 //BA.debugLineNum = 159;BA.debugLine="Dim fld1 As String = tblfields.Get(0)";
_fld1 = BA.ObjectToString(_tblfields.Get((int) (0)));
 //BA.debugLineNum = 160;BA.debugLine="Dim selFIelds As String = \"\"";
_selfields = "";
 //BA.debugLineNum = 161;BA.debugLine="Select Case fld1";
switch (BA.switchObjectToInt(_fld1,"*")) {
case 0: {
 //BA.debugLineNum = 163;BA.debugLine="selFIelds = \"*\"";
_selfields = "*";
 break; }
default: {
 //BA.debugLineNum = 165;BA.debugLine="selFIelds = JoinFields(\",\", tblfields)";
_selfields = _joinfields(",",_tblfields);
 break; }
}
;
 //BA.debugLineNum = 167;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 168;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 169;BA.debugLine="sb.Append($\"SELECT ${selFIelds} FROM ${EscapeFiel";
_sb.Append(("SELECT "+__c.SmartStringFormatter("",(Object)(_selfields))+" FROM "+__c.SmartStringFormatter("",(Object)(_escapefield(_tblname)))+" WHERE "));
 //BA.debugLineNum = 170;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 171;BA.debugLine="Dim iWhere As Int = tblWhere.Size - 1";
_iwhere = (int) (_tblwhere.getSize()-1);
 //BA.debugLineNum = 172;BA.debugLine="For i = 0 To iWhere";
{
final int step16 = 1;
final int limit16 = _iwhere;
_i = (int) (0) ;
for (;_i <= limit16 ;_i = _i + step16 ) {
 //BA.debugLineNum = 173;BA.debugLine="If i > 0 Then";
if (_i>0) { 
 //BA.debugLineNum = 174;BA.debugLine="sb.Append(\" AND \")";
_sb.Append(" AND ");
 };
 //BA.debugLineNum = 176;BA.debugLine="Dim col As String = tblWhere.GetKeyAt(i)";
_col = BA.ObjectToString(_tblwhere.GetKeyAt(_i));
 //BA.debugLineNum = 177;BA.debugLine="sb.Append(col)";
_sb.Append(_col);
 //BA.debugLineNum = 178;BA.debugLine="sb.Append(\" = ?\")";
_sb.Append(" = ?");
 }
};
 //BA.debugLineNum = 180;BA.debugLine="If orderBy <> Null Then";
if (_orderby!= null) { 
 //BA.debugLineNum = 182;BA.debugLine="Dim stro As String = JoinFields(\",\", orderBy)";
_stro = _joinfields(",",_orderby);
 //BA.debugLineNum = 183;BA.debugLine="If stro.Length > 0 Then";
if (_stro.length()>0) { 
 //BA.debugLineNum = 184;BA.debugLine="sb.Append(\" ORDER BY \").Append(stro)";
_sb.Append(" ORDER BY ").Append(_stro);
 };
 };
 //BA.debugLineNum = 187;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 188;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 189;BA.debugLine="m.Put(\"sql\", sb.tostring)";
_m.Put((Object)("sql"),(Object)(_sb.ToString()));
 //BA.debugLineNum = 190;BA.debugLine="m.Put(\"args\", listOfValues)";
_m.Put((Object)("args"),(Object)(_listofvalues.getObject()));
 //BA.debugLineNum = 191;BA.debugLine="m.Put(\"types\", listOfTypes)";
_m.Put((Object)("types"),(Object)(_listoftypes.getObject()));
 //BA.debugLineNum = 192;BA.debugLine="m.Put(\"command\", \"selectwhere\")";
_m.Put((Object)("command"),(Object)("selectwhere"));
 //BA.debugLineNum = 193;BA.debugLine="Dim res As String = Map2Json(m)";
_res = _map2json(_m);
 //BA.debugLineNum = 194;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 195;BA.debugLine="End Sub";
return "";
}
public String  _updateall(String _tblname,anywheresoftware.b4a.objects.collections.Map _tblfields) throws Exception{
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
anywheresoftware.b4a.objects.collections.List _args = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
int _itot = 0;
String _col = "";
anywheresoftware.b4a.objects.collections.Map _m = null;
String _res = "";
 //BA.debugLineNum = 110;BA.debugLine="Sub UpdateAll(tblName As String, tblFields As Map)";
 //BA.debugLineNum = 111;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblFields)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = _getmaptypes(_tblfields);
 //BA.debugLineNum = 112;BA.debugLine="Dim args As List = GetMapValues(tblFields)";
_args = new anywheresoftware.b4a.objects.collections.List();
_args = _getmapvalues(_tblfields);
 //BA.debugLineNum = 113;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 114;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 115;BA.debugLine="sb.Append($\"UPDATE ${EscapeField(tblName)} SET \"$";
_sb.Append(("UPDATE "+__c.SmartStringFormatter("",(Object)(_escapefield(_tblname)))+" SET "));
 //BA.debugLineNum = 116;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 117;BA.debugLine="Dim iTot As Int = tblFields.Size - 1";
_itot = (int) (_tblfields.getSize()-1);
 //BA.debugLineNum = 118;BA.debugLine="For i = 0 To iTot";
{
final int step8 = 1;
final int limit8 = _itot;
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
 //BA.debugLineNum = 119;BA.debugLine="Dim col As String = tblFields.GetKeyAt(i)";
_col = BA.ObjectToString(_tblfields.GetKeyAt(_i));
 //BA.debugLineNum = 120;BA.debugLine="sb.Append(col)";
_sb.Append(_col);
 //BA.debugLineNum = 121;BA.debugLine="If i <> iTot Then";
if (_i!=_itot) { 
 //BA.debugLineNum = 122;BA.debugLine="sb.Append(\" = ?,\")";
_sb.Append(" = ?,");
 }else {
 //BA.debugLineNum = 124;BA.debugLine="sb.Append(\" = ?\")";
_sb.Append(" = ?");
 };
 }
};
 //BA.debugLineNum = 127;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 128;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 129;BA.debugLine="m.Put(\"sql\", sb.tostring)";
_m.Put((Object)("sql"),(Object)(_sb.ToString()));
 //BA.debugLineNum = 130;BA.debugLine="m.Put(\"args\", args)";
_m.Put((Object)("args"),(Object)(_args.getObject()));
 //BA.debugLineNum = 131;BA.debugLine="m.Put(\"types\", listOfTypes)";
_m.Put((Object)("types"),(Object)(_listoftypes.getObject()));
 //BA.debugLineNum = 132;BA.debugLine="m.Put(\"command\", \"update\")";
_m.Put((Object)("command"),(Object)("update"));
 //BA.debugLineNum = 133;BA.debugLine="Dim res As String = Map2Json(m)";
_res = _map2json(_m);
 //BA.debugLineNum = 134;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return "";
}
public String  _updatewhere(String _tblname,anywheresoftware.b4a.objects.collections.Map _tblfields,anywheresoftware.b4a.objects.collections.Map _tblwhere) throws Exception{
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
anywheresoftware.b4a.objects.collections.List _listoftypes1 = null;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
anywheresoftware.b4a.objects.collections.List _listofvalues1 = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
int _itot = 0;
String _col = "";
int _iwhere = 0;
anywheresoftware.b4a.objects.collections.Map _m = null;
String _res = "";
 //BA.debugLineNum = 198;BA.debugLine="Sub UpdateWhere(tblName As String, tblfields As Ma";
 //BA.debugLineNum = 199;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblfields)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = _getmaptypes(_tblfields);
 //BA.debugLineNum = 200;BA.debugLine="Dim listOfTypes1 As List = GetMapTypes(tblWhere)";
_listoftypes1 = new anywheresoftware.b4a.objects.collections.List();
_listoftypes1 = _getmaptypes(_tblwhere);
 //BA.debugLineNum = 201;BA.debugLine="listOfTypes.AddAll(listOfTypes1)";
_listoftypes.AddAll(_listoftypes1);
 //BA.debugLineNum = 202;BA.debugLine="Dim listOfValues As List = GetMapValues(tblfields";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = _getmapvalues(_tblfields);
 //BA.debugLineNum = 203;BA.debugLine="Dim listOfValues1 As List = GetMapValues(tblWhere";
_listofvalues1 = new anywheresoftware.b4a.objects.collections.List();
_listofvalues1 = _getmapvalues(_tblwhere);
 //BA.debugLineNum = 204;BA.debugLine="listOfValues.AddAll(listOfValues1)";
_listofvalues.AddAll(_listofvalues1);
 //BA.debugLineNum = 205;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 206;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 207;BA.debugLine="sb.Append($\"UPDATE ${EscapeField(tblName)} SET \"$";
_sb.Append(("UPDATE "+__c.SmartStringFormatter("",(Object)(_escapefield(_tblname)))+" SET "));
 //BA.debugLineNum = 208;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 209;BA.debugLine="Dim iTot As Int = tblfields.Size - 1";
_itot = (int) (_tblfields.getSize()-1);
 //BA.debugLineNum = 210;BA.debugLine="For i = 0 To iTot";
{
final int step12 = 1;
final int limit12 = _itot;
_i = (int) (0) ;
for (;_i <= limit12 ;_i = _i + step12 ) {
 //BA.debugLineNum = 211;BA.debugLine="Dim col As String = tblfields.GetKeyAt(i)";
_col = BA.ObjectToString(_tblfields.GetKeyAt(_i));
 //BA.debugLineNum = 212;BA.debugLine="sb.Append(EscapeField(col))";
_sb.Append(_escapefield(_col));
 //BA.debugLineNum = 213;BA.debugLine="If i <> iTot Then";
if (_i!=_itot) { 
 //BA.debugLineNum = 214;BA.debugLine="sb.Append(\"= ?,\")";
_sb.Append("= ?,");
 }else {
 //BA.debugLineNum = 216;BA.debugLine="sb.Append(\"= ?\")";
_sb.Append("= ?");
 };
 }
};
 //BA.debugLineNum = 219;BA.debugLine="sb.Append($\" WHERE \"$)";
_sb.Append((" WHERE "));
 //BA.debugLineNum = 220;BA.debugLine="Dim iWhere As Int = tblWhere.Size - 1";
_iwhere = (int) (_tblwhere.getSize()-1);
 //BA.debugLineNum = 221;BA.debugLine="For i = 0 To iWhere";
{
final int step23 = 1;
final int limit23 = _iwhere;
_i = (int) (0) ;
for (;_i <= limit23 ;_i = _i + step23 ) {
 //BA.debugLineNum = 222;BA.debugLine="If i > 0 Then";
if (_i>0) { 
 //BA.debugLineNum = 223;BA.debugLine="sb.Append(\" AND \")";
_sb.Append(" AND ");
 };
 //BA.debugLineNum = 225;BA.debugLine="Dim col As String = tblWhere.GetKeyAt(i)";
_col = BA.ObjectToString(_tblwhere.GetKeyAt(_i));
 //BA.debugLineNum = 226;BA.debugLine="sb.Append(EscapeField(col))";
_sb.Append(_escapefield(_col));
 //BA.debugLineNum = 227;BA.debugLine="sb.Append(\" = ?\")";
_sb.Append(" = ?");
 }
};
 //BA.debugLineNum = 229;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 230;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 231;BA.debugLine="m.Put(\"sql\", sb.tostring)";
_m.Put((Object)("sql"),(Object)(_sb.ToString()));
 //BA.debugLineNum = 232;BA.debugLine="m.Put(\"args\", listOfValues)";
_m.Put((Object)("args"),(Object)(_listofvalues.getObject()));
 //BA.debugLineNum = 233;BA.debugLine="m.Put(\"types\", listOfTypes)";
_m.Put((Object)("types"),(Object)(_listoftypes.getObject()));
 //BA.debugLineNum = 234;BA.debugLine="m.Put(\"command\", \"updatewhere\")";
_m.Put((Object)("command"),(Object)("updatewhere"));
 //BA.debugLineNum = 235;BA.debugLine="Dim res As String = Map2Json(m)";
_res = _map2json(_m);
 //BA.debugLineNum = 236;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 237;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
