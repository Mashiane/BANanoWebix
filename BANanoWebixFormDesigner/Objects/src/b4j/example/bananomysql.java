package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class bananomysql extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.bananomysql", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.bananomysql.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.collections.Map _rectype = null;
public String _db_varchar_20 = "";
public String _db_varchar_10 = "";
public String _db_varchar_30 = "";
public String _db_varchar_40 = "";
public String _db_varchar_50 = "";
public String _db_varchar_100 = "";
public String _db_varchar_255 = "";
public String _db_string = "";
public String _db_int = "";
public String _db_float = "";
public String _db_blob = "";
public String _db_bool = "";
public String _db_real = "";
public String _db_date = "";
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
public static class _mysqlresultset{
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
public b4j.example.bananomysql  _addblobs(anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
String _strfld = "";
 //BA.debugLineNum = 103;BA.debugLine="Sub AddBlobs(fieldNames As List) As BANanoMySQL";
 //BA.debugLineNum = 104;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 105;BA.debugLine="recType.Put(strfld,\"BLOB\")";
_rectype.Put((Object)(_strfld),(Object)("BLOB"));
 }
};
 //BA.debugLineNum = 107;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _adddoubles(anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
String _strfld = "";
 //BA.debugLineNum = 95;BA.debugLine="Sub AddDoubles(fieldNames As List) As BANanoMySQL";
 //BA.debugLineNum = 96;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 97;BA.debugLine="recType.Put(strfld,\"DOUBLE\")";
_rectype.Put((Object)(_strfld),(Object)("DOUBLE"));
 }
};
 //BA.debugLineNum = 99;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _addintegers(anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
String _strfld = "";
 //BA.debugLineNum = 87;BA.debugLine="Sub AddIntegers(fieldNames As List) As BANanoMySQL";
 //BA.debugLineNum = 88;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 89;BA.debugLine="recType.Put(strfld,\"INT\")";
_rectype.Put((Object)(_strfld),(Object)("INT"));
 }
};
 //BA.debugLineNum = 91;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _addstrings(anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
String _strfld = "";
 //BA.debugLineNum = 79;BA.debugLine="Sub AddStrings(fieldNames As List) As BANanoMySQL";
 //BA.debugLineNum = 80;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 81;BA.debugLine="recType.Put(strfld,\"STRING\")";
_rectype.Put((Object)(_strfld),(Object)("STRING"));
 }
};
 //BA.debugLineNum = 83;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private recType As Map";
_rectype = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 4;BA.debugLine="Public DB_VARCHAR_20 As String = \"VARCHAR(20)\"";
_db_varchar_20 = "VARCHAR(20)";
 //BA.debugLineNum = 5;BA.debugLine="Public DB_VARCHAR_10 As String = \"VARCHAR(10)\"";
_db_varchar_10 = "VARCHAR(10)";
 //BA.debugLineNum = 6;BA.debugLine="Public DB_VARCHAR_30 As String = \"VARCHAR(30)\"";
_db_varchar_30 = "VARCHAR(30)";
 //BA.debugLineNum = 7;BA.debugLine="Public DB_VARCHAR_40 As String = \"VARCHAR(40)\"";
_db_varchar_40 = "VARCHAR(40)";
 //BA.debugLineNum = 8;BA.debugLine="Public DB_VARCHAR_50 As String = \"VARCHAR(50)\"";
_db_varchar_50 = "VARCHAR(50)";
 //BA.debugLineNum = 9;BA.debugLine="Public DB_VARCHAR_100 As String = \"VARCHAR(100)\"";
_db_varchar_100 = "VARCHAR(100)";
 //BA.debugLineNum = 10;BA.debugLine="Public DB_VARCHAR_255 As String = \"VARCHAR(255)\"";
_db_varchar_255 = "VARCHAR(255)";
 //BA.debugLineNum = 11;BA.debugLine="Public DB_STRING As String = \"TEXT\"";
_db_string = "TEXT";
 //BA.debugLineNum = 12;BA.debugLine="Public DB_INT As String = \"INT\"";
_db_int = "INT";
 //BA.debugLineNum = 13;BA.debugLine="Public DB_FLOAT As String = \"FLOAT\"";
_db_float = "FLOAT";
 //BA.debugLineNum = 14;BA.debugLine="Public DB_BLOB As String = \"BLOB\"";
_db_blob = "BLOB";
 //BA.debugLineNum = 15;BA.debugLine="Public DB_BOOL As String = \"BOOL\"";
_db_bool = "BOOL";
 //BA.debugLineNum = 16;BA.debugLine="Public DB_REAL As String = \"REAL\"";
_db_real = "REAL";
 //BA.debugLineNum = 17;BA.debugLine="Public DB_DATE As String = \"DATE\"";
_db_date = "DATE";
 //BA.debugLineNum = 18;BA.debugLine="Type MySQLResultSet(response As String, result As";
;
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
public String  _createdatabase(String _dbname) throws Exception{
String _sql = "";
anywheresoftware.b4a.objects.collections.Map _m = null;
String _res = "";
 //BA.debugLineNum = 128;BA.debugLine="Sub CreateDatabase(dbName As String) As String";
 //BA.debugLineNum = 129;BA.debugLine="Dim SQL As String = $\"CREATE DATABASE IF NOT EXIS";
_sql = ("CREATE DATABASE IF NOT EXISTS "+__c.SmartStringFormatter("",(Object)(_escapefield(_dbname)))+" DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci");
 //BA.debugLineNum = 130;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 131;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 132;BA.debugLine="m.Put(\"sql\", SQL)";
_m.Put((Object)("sql"),(Object)(_sql));
 //BA.debugLineNum = 133;BA.debugLine="m.Put(\"args\", Null)";
_m.Put((Object)("args"),__c.Null);
 //BA.debugLineNum = 134;BA.debugLine="m.Put(\"types\", Null)";
_m.Put((Object)("types"),__c.Null);
 //BA.debugLineNum = 135;BA.debugLine="m.Put(\"command\", \"createdb\")";
_m.Put((Object)("command"),(Object)("createdb"));
 //BA.debugLineNum = 136;BA.debugLine="Dim res As String = Map2Json(m)";
_res = _map2json(_m);
 //BA.debugLineNum = 137;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
return "";
}
public String  _createtable(String _tblname,anywheresoftware.b4a.objects.collections.Map _tblfields,String _pk,String _auto) throws Exception{
String _fldname = "";
String _fldtype = "";
int _fldtot = 0;
int _fldcnt = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _query = "";
anywheresoftware.b4a.objects.collections.Map _m = null;
String _res = "";
 //BA.debugLineNum = 166;BA.debugLine="public Sub CreateTable(tblName As String, tblField";
 //BA.debugLineNum = 167;BA.debugLine="Dim fldName As String";
_fldname = "";
 //BA.debugLineNum = 168;BA.debugLine="Dim fldType As String";
_fldtype = "";
 //BA.debugLineNum = 169;BA.debugLine="Dim fldTot As Int";
_fldtot = 0;
 //BA.debugLineNum = 170;BA.debugLine="Dim fldCnt As Int";
_fldcnt = 0;
 //BA.debugLineNum = 171;BA.debugLine="fldTot = tblFields.Size - 1";
_fldtot = (int) (_tblfields.getSize()-1);
 //BA.debugLineNum = 172;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 173;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 174;BA.debugLine="sb.Append(\"(\")";
_sb.Append("(");
 //BA.debugLineNum = 175;BA.debugLine="For fldCnt = 0 To fldTot";
{
final int step9 = 1;
final int limit9 = _fldtot;
_fldcnt = (int) (0) ;
for (;_fldcnt <= limit9 ;_fldcnt = _fldcnt + step9 ) {
 //BA.debugLineNum = 176;BA.debugLine="fldName = tblFields.GetKeyAt(fldCnt)";
_fldname = BA.ObjectToString(_tblfields.GetKeyAt(_fldcnt));
 //BA.debugLineNum = 177;BA.debugLine="fldType = tblFields.Get(fldName)";
_fldtype = BA.ObjectToString(_tblfields.Get((Object)(_fldname)));
 //BA.debugLineNum = 178;BA.debugLine="If fldCnt > 0 Then";
if (_fldcnt>0) { 
 //BA.debugLineNum = 179;BA.debugLine="sb.Append(\", \")";
_sb.Append(", ");
 };
 //BA.debugLineNum = 181;BA.debugLine="sb.Append(EscapeField(fldName))";
_sb.Append(_escapefield(_fldname));
 //BA.debugLineNum = 182;BA.debugLine="sb.Append(\" \")";
_sb.Append(" ");
 //BA.debugLineNum = 183;BA.debugLine="sb.Append(fldType)";
_sb.Append(_fldtype);
 //BA.debugLineNum = 184;BA.debugLine="If fldName.EqualsIgnoreCase(PK) Then";
if (_fldname.equalsIgnoreCase(_pk)) { 
 //BA.debugLineNum = 185;BA.debugLine="sb.Append(\" NOT NULL PRIMARY KEY\")";
_sb.Append(" NOT NULL PRIMARY KEY");
 };
 //BA.debugLineNum = 187;BA.debugLine="If fldName.EqualsIgnoreCase(Auto) Then";
if (_fldname.equalsIgnoreCase(_auto)) { 
 //BA.debugLineNum = 188;BA.debugLine="sb.Append(\" AUTO_INCREMENT\")";
_sb.Append(" AUTO_INCREMENT");
 };
 }
};
 //BA.debugLineNum = 191;BA.debugLine="sb.Append(\")\")";
_sb.Append(")");
 //BA.debugLineNum = 193;BA.debugLine="Dim query As String = \"CREATE TABLE IF NOT EXISTS";
_query = "CREATE TABLE IF NOT EXISTS "+_escapefield(_tblname)+" "+_sb.ToString();
 //BA.debugLineNum = 194;BA.debugLine="query = query & \" ENGINE=MyISAM CHARACTER SET utf";
_query = _query+" ENGINE=MyISAM CHARACTER SET utf8 COLLATE utf8_unicode_ci";
 //BA.debugLineNum = 195;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 196;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 197;BA.debugLine="m.Put(\"sql\", query)";
_m.Put((Object)("sql"),(Object)(_query));
 //BA.debugLineNum = 198;BA.debugLine="m.Put(\"args\", Null)";
_m.Put((Object)("args"),__c.Null);
 //BA.debugLineNum = 199;BA.debugLine="m.Put(\"types\", Null)";
_m.Put((Object)("types"),__c.Null);
 //BA.debugLineNum = 200;BA.debugLine="m.Put(\"command\", \"createtable\")";
_m.Put((Object)("command"),(Object)("createtable"));
 //BA.debugLineNum = 201;BA.debugLine="Dim res As String = Map2Json(m)";
_res = _map2json(_m);
 //BA.debugLineNum = 202;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 203;BA.debugLine="End Sub";
return "";
}
public String  _deleteall(String _tblname) throws Exception{
String _sb = "";
anywheresoftware.b4a.objects.collections.Map _m = null;
String _res = "";
 //BA.debugLineNum = 405;BA.debugLine="Sub DeleteAll(tblName As String) As String";
 //BA.debugLineNum = 406;BA.debugLine="Dim sb As String = $\"DELETE FROM ${EscapeField(tb";
_sb = ("DELETE FROM "+__c.SmartStringFormatter("",(Object)(_escapefield(_tblname)))+"");
 //BA.debugLineNum = 407;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 408;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 409;BA.debugLine="m.Put(\"sql\", sb)";
_m.Put((Object)("sql"),(Object)(_sb));
 //BA.debugLineNum = 410;BA.debugLine="m.Put(\"args\", Null)";
_m.Put((Object)("args"),__c.Null);
 //BA.debugLineNum = 411;BA.debugLine="m.Put(\"types\", Null)";
_m.Put((Object)("types"),__c.Null);
 //BA.debugLineNum = 412;BA.debugLine="m.Put(\"command\", \"delete\")";
_m.Put((Object)("command"),(Object)("delete"));
 //BA.debugLineNum = 413;BA.debugLine="Dim res As String = Map2Json(m)";
_res = _map2json(_m);
 //BA.debugLineNum = 414;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 415;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 418;BA.debugLine="Sub DeleteWhere(tblName As String, tblWhere As Map";
 //BA.debugLineNum = 419;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblWhere)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = _getmaptypes(_tblwhere);
 //BA.debugLineNum = 420;BA.debugLine="Dim listOfValues As List = GetMapValues(tblWhere)";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = _getmapvalues(_tblwhere);
 //BA.debugLineNum = 421;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 422;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 423;BA.debugLine="sb.Append($\"DELETE FROM ${EscapeField(tblName)} W";
_sb.Append(("DELETE FROM "+__c.SmartStringFormatter("",(Object)(_escapefield(_tblname)))+" WHERE "));
 //BA.debugLineNum = 424;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 425;BA.debugLine="Dim iWhere As Int = tblWhere.Size - 1";
_iwhere = (int) (_tblwhere.getSize()-1);
 //BA.debugLineNum = 426;BA.debugLine="For i = 0 To iWhere";
{
final int step8 = 1;
final int limit8 = _iwhere;
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
 //BA.debugLineNum = 427;BA.debugLine="If i > 0 Then";
if (_i>0) { 
 //BA.debugLineNum = 428;BA.debugLine="sb.Append(\" AND \")";
_sb.Append(" AND ");
 };
 //BA.debugLineNum = 430;BA.debugLine="Dim col As String = tblWhere.GetKeyAt(i)";
_col = BA.ObjectToString(_tblwhere.GetKeyAt(_i));
 //BA.debugLineNum = 431;BA.debugLine="sb.Append(EscapeField(col))";
_sb.Append(_escapefield(_col));
 //BA.debugLineNum = 432;BA.debugLine="sb.Append(\" = ?\")";
_sb.Append(" = ?");
 }
};
 //BA.debugLineNum = 434;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 435;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 436;BA.debugLine="m.Put(\"sql\", sb.tostring)";
_m.Put((Object)("sql"),(Object)(_sb.ToString()));
 //BA.debugLineNum = 437;BA.debugLine="m.Put(\"args\", listOfValues)";
_m.Put((Object)("args"),(Object)(_listofvalues.getObject()));
 //BA.debugLineNum = 438;BA.debugLine="m.Put(\"types\", listOfTypes)";
_m.Put((Object)("types"),(Object)(_listoftypes.getObject()));
 //BA.debugLineNum = 439;BA.debugLine="m.Put(\"command\", \"deletewhere\")";
_m.Put((Object)("command"),(Object)("deletewhere"));
 //BA.debugLineNum = 440;BA.debugLine="Dim res As String = Map2Json(m)";
_res = _map2json(_m);
 //BA.debugLineNum = 441;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 442;BA.debugLine="End Sub";
return "";
}
public String  _dropdatabase(String _dbname) throws Exception{
String _sql = "";
anywheresoftware.b4a.objects.collections.Map _m = null;
String _res = "";
 //BA.debugLineNum = 141;BA.debugLine="Sub DropDataBase(dbName As String) As String";
 //BA.debugLineNum = 142;BA.debugLine="Dim SQL As String = $\"DROP DATABASE ${EscapeField";
_sql = ("DROP DATABASE "+__c.SmartStringFormatter("",(Object)(_escapefield(_dbname)))+"");
 //BA.debugLineNum = 143;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 144;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 145;BA.debugLine="m.Put(\"sql\", SQL)";
_m.Put((Object)("sql"),(Object)(_sql));
 //BA.debugLineNum = 146;BA.debugLine="m.Put(\"args\", Null)";
_m.Put((Object)("args"),__c.Null);
 //BA.debugLineNum = 147;BA.debugLine="m.Put(\"types\", Null)";
_m.Put((Object)("types"),__c.Null);
 //BA.debugLineNum = 148;BA.debugLine="m.Put(\"command\", \"dropdb\")";
_m.Put((Object)("command"),(Object)("dropdb"));
 //BA.debugLineNum = 149;BA.debugLine="Dim res As String = Map2Json(m)";
_res = _map2json(_m);
 //BA.debugLineNum = 150;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return "";
}
public String  _droptable(String _tblname) throws Exception{
String _query = "";
anywheresoftware.b4a.objects.collections.Map _m = null;
String _res = "";
 //BA.debugLineNum = 206;BA.debugLine="public Sub DropTable(tblName As String) As String";
 //BA.debugLineNum = 208;BA.debugLine="Dim query As String = \"DROP TABLE \" & EscapeField";
_query = "DROP TABLE "+_escapefield(_tblname);
 //BA.debugLineNum = 209;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 210;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 211;BA.debugLine="m.Put(\"sql\", query)";
_m.Put((Object)("sql"),(Object)(_query));
 //BA.debugLineNum = 212;BA.debugLine="m.Put(\"args\", Null)";
_m.Put((Object)("args"),__c.Null);
 //BA.debugLineNum = 213;BA.debugLine="m.Put(\"types\", Null)";
_m.Put((Object)("types"),__c.Null);
 //BA.debugLineNum = 214;BA.debugLine="m.Put(\"command\", \"droptable\")";
_m.Put((Object)("command"),(Object)("droptable"));
 //BA.debugLineNum = 215;BA.debugLine="Dim res As String = Map2Json(m)";
_res = _map2json(_m);
 //BA.debugLineNum = 216;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 217;BA.debugLine="End Sub";
return "";
}
public String  _escapefield(String _f) throws Exception{
 //BA.debugLineNum = 111;BA.debugLine="Private Sub EscapeField(f As String) As String";
 //BA.debugLineNum = 112;BA.debugLine="Return $\"`${f}`\"$";
if (true) return ("`"+__c.SmartStringFormatter("",(Object)(_f))+"`");
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return "";
}
public String  _execute(String _strsql) throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
String _res = "";
 //BA.debugLineNum = 154;BA.debugLine="Sub Execute(strSQL As String) As String";
 //BA.debugLineNum = 155;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 156;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 157;BA.debugLine="m.Put(\"sql\", strSQL)";
_m.Put((Object)("sql"),(Object)(_strsql));
 //BA.debugLineNum = 158;BA.debugLine="m.Put(\"args\", Null)";
_m.Put((Object)("args"),__c.Null);
 //BA.debugLineNum = 159;BA.debugLine="m.Put(\"types\", Null)";
_m.Put((Object)("types"),__c.Null);
 //BA.debugLineNum = 160;BA.debugLine="m.Put(\"command\", \"execute\")";
_m.Put((Object)("command"),(Object)("execute"));
 //BA.debugLineNum = 161;BA.debugLine="Dim res As String = Map2Json(m)";
_res = _map2json(_m);
 //BA.debugLineNum = 162;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 163;BA.debugLine="End Sub";
return "";
}
public String  _exists(String _tblname,String _primarykey,String _primaryvalue) throws Exception{
anywheresoftware.b4a.objects.collections.Map _qw = null;
String _qry = "";
 //BA.debugLineNum = 354;BA.debugLine="Sub Exists(tblName As String, primaryKey As String";
 //BA.debugLineNum = 355;BA.debugLine="Dim qw As Map = CreateMap()";
_qw = new anywheresoftware.b4a.objects.collections.Map();
_qw = __c.createMap(new Object[] {});
 //BA.debugLineNum = 356;BA.debugLine="qw.Put(primaryKey, primaryValue)";
_qw.Put((Object)(_primarykey),(Object)(_primaryvalue));
 //BA.debugLineNum = 357;BA.debugLine="Dim qry As String = SelectWhere(tblName, Array(pr";
_qry = _selectwhere(_tblname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_primarykey)}),_qw,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_primarykey)}));
 //BA.debugLineNum = 358;BA.debugLine="Return qry";
if (true) return _qry;
 //BA.debugLineNum = 359;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _getmapkeys(anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
int _icnt = 0;
int _itot = 0;
String _value = "";
 //BA.debugLineNum = 262;BA.debugLine="private Sub GetMapKeys(sourceMap As Map) As List";
 //BA.debugLineNum = 263;BA.debugLine="Dim listOfValues As List";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 264;BA.debugLine="listOfValues.Initialize";
_listofvalues.Initialize();
 //BA.debugLineNum = 265;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
 //BA.debugLineNum = 266;BA.debugLine="Dim iTot As Int";
_itot = 0;
 //BA.debugLineNum = 267;BA.debugLine="iTot = sourceMap.Size - 1";
_itot = (int) (_sourcemap.getSize()-1);
 //BA.debugLineNum = 268;BA.debugLine="For iCnt = 0 To iTot";
{
final int step6 = 1;
final int limit6 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit6 ;_icnt = _icnt + step6 ) {
 //BA.debugLineNum = 269;BA.debugLine="Dim value As String = sourceMap.GetKeyAt(iCnt)";
_value = BA.ObjectToString(_sourcemap.GetKeyAt(_icnt));
 //BA.debugLineNum = 270;BA.debugLine="listOfValues.Add(value)";
_listofvalues.Add((Object)(_value));
 }
};
 //BA.debugLineNum = 272;BA.debugLine="Return listOfValues";
if (true) return _listofvalues;
 //BA.debugLineNum = 273;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getmaptypes(anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
int _icnt = 0;
int _itot = 0;
String _col = "";
String _coltype = "";
 //BA.debugLineNum = 220;BA.debugLine="private Sub GetMapTypes(sourceMap As Map) As List";
 //BA.debugLineNum = 221;BA.debugLine="Dim listOfTypes As List";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 222;BA.debugLine="listOfTypes.Initialize";
_listoftypes.Initialize();
 //BA.debugLineNum = 223;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
 //BA.debugLineNum = 224;BA.debugLine="Dim iTot As Int";
_itot = 0;
 //BA.debugLineNum = 225;BA.debugLine="iTot = sourceMap.Size - 1";
_itot = (int) (_sourcemap.getSize()-1);
 //BA.debugLineNum = 226;BA.debugLine="For iCnt = 0 To iTot";
{
final int step6 = 1;
final int limit6 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit6 ;_icnt = _icnt + step6 ) {
 //BA.debugLineNum = 227;BA.debugLine="Dim col As String = sourceMap.GetKeyAt(iCnt)";
_col = BA.ObjectToString(_sourcemap.GetKeyAt(_icnt));
 //BA.debugLineNum = 228;BA.debugLine="Dim colType As String = recType.GetDefault(col,\"";
_coltype = BA.ObjectToString(_rectype.GetDefault((Object)(_col),(Object)("STRING")));
 //BA.debugLineNum = 229;BA.debugLine="Select Case colType";
switch (BA.switchObjectToInt(_coltype,"VARCHAR(20)","VARCHAR(10)","VARCHAR(30)","VARCHAR(40)","VARCHAR(50)","VARCHAR(100)","VARCHAR(255)","STRING","VARCHAR","TEXT","DATE","DATETIME","INTEGER","INT","BOOL","REAL","FLOAT","DOUBLE","BLOB")) {
case 0: 
case 1: 
case 2: 
case 3: {
 //BA.debugLineNum = 231;BA.debugLine="listOfTypes.add(\"s\")";
_listoftypes.Add((Object)("s"));
 break; }
case 4: 
case 5: 
case 6: {
 //BA.debugLineNum = 233;BA.debugLine="listOfTypes.add(\"s\")";
_listoftypes.Add((Object)("s"));
 break; }
case 7: 
case 8: 
case 9: 
case 10: 
case 11: {
 //BA.debugLineNum = 235;BA.debugLine="listOfTypes.add(\"s\")";
_listoftypes.Add((Object)("s"));
 break; }
case 12: 
case 13: 
case 14: {
 //BA.debugLineNum = 237;BA.debugLine="listOfTypes.add(\"i\")";
_listoftypes.Add((Object)("i"));
 break; }
case 15: 
case 16: 
case 17: {
 //BA.debugLineNum = 239;BA.debugLine="listOfTypes.add(\"d\")";
_listoftypes.Add((Object)("d"));
 break; }
case 18: {
 //BA.debugLineNum = 241;BA.debugLine="listOfTypes.Add(\"b\")";
_listoftypes.Add((Object)("b"));
 break; }
}
;
 }
};
 //BA.debugLineNum = 244;BA.debugLine="Return listOfTypes";
if (true) return _listoftypes;
 //BA.debugLineNum = 245;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getmapvalues(anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
int _icnt = 0;
int _itot = 0;
String _value = "";
 //BA.debugLineNum = 248;BA.debugLine="private Sub GetMapValues(sourceMap As Map) As List";
 //BA.debugLineNum = 249;BA.debugLine="Dim listOfValues As List";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 250;BA.debugLine="listOfValues.Initialize";
_listofvalues.Initialize();
 //BA.debugLineNum = 251;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
 //BA.debugLineNum = 252;BA.debugLine="Dim iTot As Int";
_itot = 0;
 //BA.debugLineNum = 253;BA.debugLine="iTot = sourceMap.Size - 1";
_itot = (int) (_sourcemap.getSize()-1);
 //BA.debugLineNum = 254;BA.debugLine="For iCnt = 0 To iTot";
{
final int step6 = 1;
final int limit6 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit6 ;_icnt = _icnt + step6 ) {
 //BA.debugLineNum = 255;BA.debugLine="Dim value As String = sourceMap.GetValueAt(iCnt)";
_value = BA.ObjectToString(_sourcemap.GetValueAt(_icnt));
 //BA.debugLineNum = 256;BA.debugLine="listOfValues.Add(value)";
_listofvalues.Add((Object)(_value));
 }
};
 //BA.debugLineNum = 258;BA.debugLine="Return listOfValues";
if (true) return _listofvalues;
 //BA.debugLineNum = 259;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql._mysqlresultset  _getresultset(String _query,String _res) throws Exception{
anywheresoftware.b4a.objects.collections.List _tt = null;
anywheresoftware.b4a.objects.collections.List _aa = null;
anywheresoftware.b4a.objects.collections.List _datalist = null;
anywheresoftware.b4a.objects.collections.Map _resmap = null;
String _scommand = "";
anywheresoftware.b4a.objects.collections.List _stypes = null;
anywheresoftware.b4a.objects.collections.List _sargs = null;
String _ssql = "";
anywheresoftware.b4a.objects.collections.Map _resmap1 = null;
b4j.example.bananomysql._mysqlresultset _gr = null;
 //BA.debugLineNum = 29;BA.debugLine="Sub GetResultSet(query As String, res As String) A";
 //BA.debugLineNum = 30;BA.debugLine="Dim tt As List";
_tt = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 31;BA.debugLine="tt.Initialize";
_tt.Initialize();
 //BA.debugLineNum = 32;BA.debugLine="Dim aa As List";
_aa = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 33;BA.debugLine="aa.Initialize";
_aa.Initialize();
 //BA.debugLineNum = 34;BA.debugLine="Dim dataList As List";
_datalist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 35;BA.debugLine="dataList.Initialize";
_datalist.Initialize();
 //BA.debugLineNum = 36;BA.debugLine="Dim resmap As Map = Json2Map(query)";
_resmap = new anywheresoftware.b4a.objects.collections.Map();
_resmap = _json2map(_query);
 //BA.debugLineNum = 37;BA.debugLine="Dim scommand As String = resmap.GetDefault(\"comma";
_scommand = BA.ObjectToString(_resmap.GetDefault((Object)("command"),(Object)("")));
 //BA.debugLineNum = 38;BA.debugLine="Dim stypes As List = resmap.GetDefault(\"types\", t";
_stypes = new anywheresoftware.b4a.objects.collections.List();
_stypes.setObject((java.util.List)(_resmap.GetDefault((Object)("types"),(Object)(_tt.getObject()))));
 //BA.debugLineNum = 39;BA.debugLine="Dim sargs As List = resmap.GetDefault(\"args\", aa)";
_sargs = new anywheresoftware.b4a.objects.collections.List();
_sargs.setObject((java.util.List)(_resmap.GetDefault((Object)("args"),(Object)(_aa.getObject()))));
 //BA.debugLineNum = 40;BA.debugLine="Dim ssql As String = resmap.GetDefault(\"sql\",\"\")";
_ssql = BA.ObjectToString(_resmap.GetDefault((Object)("sql"),(Object)("")));
 //BA.debugLineNum = 42;BA.debugLine="Dim resmap1 As Map = Json2Map(res)";
_resmap1 = new anywheresoftware.b4a.objects.collections.Map();
_resmap1 = _json2map(_res);
 //BA.debugLineNum = 43;BA.debugLine="Dim gr As MySQLResultSet";
_gr = new b4j.example.bananomysql._mysqlresultset();
 //BA.debugLineNum = 44;BA.debugLine="gr.Initialize";
_gr.Initialize();
 //BA.debugLineNum = 45;BA.debugLine="gr.query = ssql";
_gr.query /*String*/  = _ssql;
 //BA.debugLineNum = 46;BA.debugLine="gr.args = sargs";
_gr.args /*anywheresoftware.b4a.objects.collections.List*/  = _sargs;
 //BA.debugLineNum = 47;BA.debugLine="gr.command = scommand";
_gr.command /*String*/  = _scommand;
 //BA.debugLineNum = 48;BA.debugLine="gr.types = stypes";
_gr.types /*anywheresoftware.b4a.objects.collections.List*/  = _stypes;
 //BA.debugLineNum = 49;BA.debugLine="gr.response = resmap1.GetDefault(\"response\",\"\")";
_gr.response /*String*/  = BA.ObjectToString(_resmap1.GetDefault((Object)("response"),(Object)("")));
 //BA.debugLineNum = 50;BA.debugLine="gr.result = resmap1.GetDefault(\"data\", dataList)";
_gr.result /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(_resmap1.GetDefault((Object)("data"),(Object)(_datalist.getObject()))));
 //BA.debugLineNum = 51;BA.debugLine="Return gr";
if (true) return _gr;
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 22;BA.debugLine="Public Sub Initialize() As BANanoMySQL";
 //BA.debugLineNum = 23;BA.debugLine="recType.Initialize";
_rectype.Initialize();
 //BA.debugLineNum = 24;BA.debugLine="AddIntegers(Array(\"id\"))";
_addintegers(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
 //BA.debugLineNum = 25;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 277;BA.debugLine="Sub Insert(tblName As String, tblFields As Map) As";
 //BA.debugLineNum = 278;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 279;BA.debugLine="Dim columns As StringBuilder";
_columns = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 280;BA.debugLine="Dim values As StringBuilder";
_values = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 281;BA.debugLine="Dim listOfValues As List = GetMapValues(tblFields";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = _getmapvalues(_tblfields);
 //BA.debugLineNum = 282;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblFields)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = _getmaptypes(_tblfields);
 //BA.debugLineNum = 283;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
 //BA.debugLineNum = 284;BA.debugLine="Dim iTot As Int";
_itot = 0;
 //BA.debugLineNum = 285;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 286;BA.debugLine="columns.Initialize";
_columns.Initialize();
 //BA.debugLineNum = 287;BA.debugLine="values.Initialize";
_values.Initialize();
 //BA.debugLineNum = 288;BA.debugLine="sb.Append($\"INSERT INTO ${EscapeField(tblName)} (";
_sb.Append(("INSERT INTO "+__c.SmartStringFormatter("",(Object)(_escapefield(_tblname)))+" ("));
 //BA.debugLineNum = 289;BA.debugLine="iTot = tblFields.Size - 1";
_itot = (int) (_tblfields.getSize()-1);
 //BA.debugLineNum = 290;BA.debugLine="For iCnt = 0 To iTot";
{
final int step13 = 1;
final int limit13 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit13 ;_icnt = _icnt + step13 ) {
 //BA.debugLineNum = 291;BA.debugLine="Dim col As String = tblFields.GetKeyAt(iCnt)";
_col = BA.ObjectToString(_tblfields.GetKeyAt(_icnt));
 //BA.debugLineNum = 292;BA.debugLine="If iCnt > 0 Then";
if (_icnt>0) { 
 //BA.debugLineNum = 293;BA.debugLine="columns.Append(\", \")";
_columns.Append(", ");
 //BA.debugLineNum = 294;BA.debugLine="values.Append(\", \")";
_values.Append(", ");
 };
 //BA.debugLineNum = 296;BA.debugLine="columns.Append(EscapeField(col))";
_columns.Append(_escapefield(_col));
 //BA.debugLineNum = 297;BA.debugLine="values.Append(\"?\")";
_values.Append("?");
 }
};
 //BA.debugLineNum = 299;BA.debugLine="sb.Append(columns.ToString)";
_sb.Append(_columns.ToString());
 //BA.debugLineNum = 300;BA.debugLine="sb.Append(\") VALUES (\")";
_sb.Append(") VALUES (");
 //BA.debugLineNum = 301;BA.debugLine="sb.Append(values.ToString)";
_sb.Append(_values.ToString());
 //BA.debugLineNum = 302;BA.debugLine="sb.Append(\")\")";
_sb.Append(")");
 //BA.debugLineNum = 303;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 304;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 305;BA.debugLine="m.Put(\"sql\", sb.ToString)";
_m.Put((Object)("sql"),(Object)(_sb.ToString()));
 //BA.debugLineNum = 306;BA.debugLine="m.Put(\"args\", listOfValues)";
_m.Put((Object)("args"),(Object)(_listofvalues.getObject()));
 //BA.debugLineNum = 307;BA.debugLine="m.Put(\"types\", listOfTypes)";
_m.Put((Object)("types"),(Object)(_listoftypes.getObject()));
 //BA.debugLineNum = 308;BA.debugLine="m.Put(\"command\", \"insert\")";
_m.Put((Object)("command"),(Object)("insert"));
 //BA.debugLineNum = 309;BA.debugLine="Dim res As String = Map2Json(m)";
_res = _map2json(_m);
 //BA.debugLineNum = 310;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 311;BA.debugLine="End Sub";
return "";
}
public String  _join(String _delimiter,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
int _i = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _fld = "";
 //BA.debugLineNum = 331;BA.debugLine="private Sub Join(delimiter As String, lst As List)";
 //BA.debugLineNum = 332;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 333;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 334;BA.debugLine="Dim fld As String";
_fld = "";
 //BA.debugLineNum = 335;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 336;BA.debugLine="fld = lst.Get(0)";
_fld = BA.ObjectToString(_lst.Get((int) (0)));
 //BA.debugLineNum = 337;BA.debugLine="sb.Append(fld)";
_sb.Append(_fld);
 //BA.debugLineNum = 338;BA.debugLine="For i = 1 To lst.size - 1";
{
final int step7 = 1;
final int limit7 = (int) (_lst.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
 //BA.debugLineNum = 339;BA.debugLine="Dim fld As String = lst.Get(i)";
_fld = BA.ObjectToString(_lst.Get(_i));
 //BA.debugLineNum = 340;BA.debugLine="sb.Append(delimiter).Append(fld)";
_sb.Append(_delimiter).Append(_fld);
 }
};
 //BA.debugLineNum = 342;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 343;BA.debugLine="End Sub";
return "";
}
public String  _joinfields(String _delimiter,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
int _i = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _fld = "";
 //BA.debugLineNum = 314;BA.debugLine="private Sub JoinFields(delimiter As String, lst As";
 //BA.debugLineNum = 315;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 316;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 317;BA.debugLine="Dim fld As String";
_fld = "";
 //BA.debugLineNum = 318;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 319;BA.debugLine="fld = lst.Get(0)";
_fld = BA.ObjectToString(_lst.Get((int) (0)));
 //BA.debugLineNum = 320;BA.debugLine="fld = EscapeField(fld)";
_fld = _escapefield(_fld);
 //BA.debugLineNum = 321;BA.debugLine="sb.Append(fld)";
_sb.Append(_fld);
 //BA.debugLineNum = 322;BA.debugLine="For i = 1 To lst.size - 1";
{
final int step8 = 1;
final int limit8 = (int) (_lst.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
 //BA.debugLineNum = 323;BA.debugLine="Dim fld As String = lst.Get(i)";
_fld = BA.ObjectToString(_lst.Get(_i));
 //BA.debugLineNum = 324;BA.debugLine="fld = EscapeField(fld)";
_fld = _escapefield(_fld);
 //BA.debugLineNum = 325;BA.debugLine="sb.Append(delimiter).Append(fld)";
_sb.Append(_delimiter).Append(_fld);
 }
};
 //BA.debugLineNum = 327;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 328;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _json2map(String _strjson) throws Exception{
com.ab.banano.BANanoJSONParser _json = null;
anywheresoftware.b4a.objects.collections.Map _map1 = null;
 //BA.debugLineNum = 55;BA.debugLine="Sub Json2Map(strJSON As String) As Map";
 //BA.debugLineNum = 56;BA.debugLine="Dim json As BANanoJSONParser";
_json = new com.ab.banano.BANanoJSONParser();
 //BA.debugLineNum = 57;BA.debugLine="Dim Map1 As Map";
_map1 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 58;BA.debugLine="Map1.Initialize";
_map1.Initialize();
 //BA.debugLineNum = 59;BA.debugLine="Map1.clear";
_map1.Clear();
 //BA.debugLineNum = 60;BA.debugLine="Try";
try { //BA.debugLineNum = 61;BA.debugLine="If strJSON.length > 0 Then";
if (_strjson.length()>0) { 
 //BA.debugLineNum = 62;BA.debugLine="json.Initialize(strJSON)";
_json.Initialize(_strjson);
 //BA.debugLineNum = 63;BA.debugLine="Map1 = json.NextObject";
_map1 = _json.NextObject();
 };
 //BA.debugLineNum = 65;BA.debugLine="Return Map1";
if (true) return _map1;
 } 
       catch (Exception e12) {
			ba.setLastException(e12); //BA.debugLineNum = 67;BA.debugLine="Return Map1";
if (true) return _map1;
 };
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public String  _map2json(anywheresoftware.b4a.objects.collections.Map _mp) throws Exception{
com.ab.banano.BANanoJSONGenerator _json = null;
 //BA.debugLineNum = 72;BA.debugLine="Sub Map2Json(mp As Map) As String";
 //BA.debugLineNum = 73;BA.debugLine="Dim JSON As BANanoJSONGenerator";
_json = new com.ab.banano.BANanoJSONGenerator();
 //BA.debugLineNum = 74;BA.debugLine="JSON.Initialize(mp)";
_json.Initialize(_mp);
 //BA.debugLineNum = 75;BA.debugLine="Return JSON.ToString";
if (true) return _json.ToString();
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return "";
}
public String  _read(String _tblname,String _primarykey,String _primaryvalue) throws Exception{
anywheresoftware.b4a.objects.collections.Map _qw = null;
String _qry = "";
 //BA.debugLineNum = 346;BA.debugLine="Sub Read(tblName As String, primaryKey As String,";
 //BA.debugLineNum = 347;BA.debugLine="Dim qw As Map = CreateMap()";
_qw = new anywheresoftware.b4a.objects.collections.Map();
_qw = __c.createMap(new Object[] {});
 //BA.debugLineNum = 348;BA.debugLine="qw.Put(primaryKey, primaryValue)";
_qw.Put((Object)(_primarykey),(Object)(_primaryvalue));
 //BA.debugLineNum = 349;BA.debugLine="Dim qry As String = SelectWhere(tblName, Array(\"*";
_qry = _selectwhere(_tblname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("*")}),_qw,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_primarykey)}));
 //BA.debugLineNum = 350;BA.debugLine="Return qry";
if (true) return _qry;
 //BA.debugLineNum = 351;BA.debugLine="End Sub";
return "";
}
public String  _selectall(String _tblname,anywheresoftware.b4a.objects.collections.List _tblfields,anywheresoftware.b4a.objects.collections.List _orderby) throws Exception{
String _fld1 = "";
String _selfields = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _stro = "";
anywheresoftware.b4a.objects.collections.Map _m = null;
String _res = "";
 //BA.debugLineNum = 446;BA.debugLine="Sub SelectAll(tblName As String, tblfields As List";
 //BA.debugLineNum = 448;BA.debugLine="Dim fld1 As String = tblfields.Get(0)";
_fld1 = BA.ObjectToString(_tblfields.Get((int) (0)));
 //BA.debugLineNum = 449;BA.debugLine="Dim selFIelds As String = \"\"";
_selfields = "";
 //BA.debugLineNum = 450;BA.debugLine="Select Case fld1";
switch (BA.switchObjectToInt(_fld1,"*")) {
case 0: {
 //BA.debugLineNum = 452;BA.debugLine="selFIelds = \"*\"";
_selfields = "*";
 break; }
default: {
 //BA.debugLineNum = 454;BA.debugLine="selFIelds = JoinFields(\",\", tblfields)";
_selfields = _joinfields(",",_tblfields);
 break; }
}
;
 //BA.debugLineNum = 456;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 457;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 458;BA.debugLine="sb.Append($\"SELECT ${selFIelds} FROM ${EscapeFiel";
_sb.Append(("SELECT "+__c.SmartStringFormatter("",(Object)(_selfields))+" FROM "+__c.SmartStringFormatter("",(Object)(_escapefield(_tblname)))+""));
 //BA.debugLineNum = 459;BA.debugLine="If orderBy <> Null Then";
if (_orderby!= null) { 
 //BA.debugLineNum = 461;BA.debugLine="Dim stro As String = JoinFields(\",\", orderBy)";
_stro = _joinfields(",",_orderby);
 //BA.debugLineNum = 462;BA.debugLine="If stro.Length > 0 Then";
if (_stro.length()>0) { 
 //BA.debugLineNum = 463;BA.debugLine="sb.Append(\" ORDER BY \").Append(stro)";
_sb.Append(" ORDER BY ").Append(_stro);
 };
 };
 //BA.debugLineNum = 466;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 467;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 468;BA.debugLine="m.Put(\"sql\", sb.tostring)";
_m.Put((Object)("sql"),(Object)(_sb.ToString()));
 //BA.debugLineNum = 469;BA.debugLine="m.Put(\"args\", Null)";
_m.Put((Object)("args"),__c.Null);
 //BA.debugLineNum = 470;BA.debugLine="m.Put(\"types\", Null)";
_m.Put((Object)("types"),__c.Null);
 //BA.debugLineNum = 471;BA.debugLine="m.Put(\"command\", \"select\")";
_m.Put((Object)("command"),(Object)("select"));
 //BA.debugLineNum = 472;BA.debugLine="Dim res As String = Map2Json(m)";
_res = _map2json(_m);
 //BA.debugLineNum = 473;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 474;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 362;BA.debugLine="Sub SelectWhere(tblName As String, tblfields As Li";
 //BA.debugLineNum = 363;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblWhere)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = _getmaptypes(_tblwhere);
 //BA.debugLineNum = 364;BA.debugLine="Dim listOfValues As List = GetMapValues(tblWhere)";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = _getmapvalues(_tblwhere);
 //BA.debugLineNum = 366;BA.debugLine="Dim fld1 As String = tblfields.Get(0)";
_fld1 = BA.ObjectToString(_tblfields.Get((int) (0)));
 //BA.debugLineNum = 367;BA.debugLine="Dim selFIelds As String = \"\"";
_selfields = "";
 //BA.debugLineNum = 368;BA.debugLine="Select Case fld1";
switch (BA.switchObjectToInt(_fld1,"*")) {
case 0: {
 //BA.debugLineNum = 370;BA.debugLine="selFIelds = \"*\"";
_selfields = "*";
 break; }
default: {
 //BA.debugLineNum = 372;BA.debugLine="selFIelds = JoinFields(\",\", tblfields)";
_selfields = _joinfields(",",_tblfields);
 break; }
}
;
 //BA.debugLineNum = 374;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 375;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 376;BA.debugLine="sb.Append($\"SELECT ${selFIelds} FROM ${EscapeFiel";
_sb.Append(("SELECT "+__c.SmartStringFormatter("",(Object)(_selfields))+" FROM "+__c.SmartStringFormatter("",(Object)(_escapefield(_tblname)))+" WHERE "));
 //BA.debugLineNum = 377;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 378;BA.debugLine="Dim iWhere As Int = tblWhere.Size - 1";
_iwhere = (int) (_tblwhere.getSize()-1);
 //BA.debugLineNum = 379;BA.debugLine="For i = 0 To iWhere";
{
final int step16 = 1;
final int limit16 = _iwhere;
_i = (int) (0) ;
for (;_i <= limit16 ;_i = _i + step16 ) {
 //BA.debugLineNum = 380;BA.debugLine="If i > 0 Then";
if (_i>0) { 
 //BA.debugLineNum = 381;BA.debugLine="sb.Append(\" AND \")";
_sb.Append(" AND ");
 };
 //BA.debugLineNum = 383;BA.debugLine="Dim col As String = tblWhere.GetKeyAt(i)";
_col = BA.ObjectToString(_tblwhere.GetKeyAt(_i));
 //BA.debugLineNum = 384;BA.debugLine="sb.Append(EscapeField(col))";
_sb.Append(_escapefield(_col));
 //BA.debugLineNum = 385;BA.debugLine="sb.Append(\" = ?\")";
_sb.Append(" = ?");
 }
};
 //BA.debugLineNum = 387;BA.debugLine="If orderBy <> Null Then";
if (_orderby!= null) { 
 //BA.debugLineNum = 389;BA.debugLine="Dim stro As String = JoinFields(\",\", orderBy)";
_stro = _joinfields(",",_orderby);
 //BA.debugLineNum = 390;BA.debugLine="If stro.Length > 0 Then";
if (_stro.length()>0) { 
 //BA.debugLineNum = 391;BA.debugLine="sb.Append(\" ORDER BY \").Append(stro)";
_sb.Append(" ORDER BY ").Append(_stro);
 };
 };
 //BA.debugLineNum = 394;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 395;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 396;BA.debugLine="m.Put(\"sql\", sb.tostring)";
_m.Put((Object)("sql"),(Object)(_sb.ToString()));
 //BA.debugLineNum = 397;BA.debugLine="m.Put(\"args\", listOfValues)";
_m.Put((Object)("args"),(Object)(_listofvalues.getObject()));
 //BA.debugLineNum = 398;BA.debugLine="m.Put(\"types\", listOfTypes)";
_m.Put((Object)("types"),(Object)(_listoftypes.getObject()));
 //BA.debugLineNum = 399;BA.debugLine="m.Put(\"command\", \"selectwhere\")";
_m.Put((Object)("command"),(Object)("selectwhere"));
 //BA.debugLineNum = 400;BA.debugLine="Dim res As String = Map2Json(m)";
_res = _map2json(_m);
 //BA.debugLineNum = 401;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 402;BA.debugLine="End Sub";
return "";
}
public String  _testconnection() throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
String _res = "";
 //BA.debugLineNum = 116;BA.debugLine="Sub TestConnection() As String";
 //BA.debugLineNum = 117;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 118;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 119;BA.debugLine="m.Put(\"sql\", \"\")";
_m.Put((Object)("sql"),(Object)(""));
 //BA.debugLineNum = 120;BA.debugLine="m.Put(\"args\", Null)";
_m.Put((Object)("args"),__c.Null);
 //BA.debugLineNum = 121;BA.debugLine="m.Put(\"types\", Null)";
_m.Put((Object)("types"),__c.Null);
 //BA.debugLineNum = 122;BA.debugLine="m.Put(\"command\", \"connection\")";
_m.Put((Object)("command"),(Object)("connection"));
 //BA.debugLineNum = 123;BA.debugLine="Dim res As String = Map2Json(m)";
_res = _map2json(_m);
 //BA.debugLineNum = 124;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 520;BA.debugLine="Sub UpdateAll(tblName As String, tblFields As Map)";
 //BA.debugLineNum = 521;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblFields)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = _getmaptypes(_tblfields);
 //BA.debugLineNum = 522;BA.debugLine="Dim args As List = GetMapValues(tblFields)";
_args = new anywheresoftware.b4a.objects.collections.List();
_args = _getmapvalues(_tblfields);
 //BA.debugLineNum = 523;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 524;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 525;BA.debugLine="sb.Append($\"UPDATE ${EscapeField(tblName)} SET \"$";
_sb.Append(("UPDATE "+__c.SmartStringFormatter("",(Object)(_escapefield(_tblname)))+" SET "));
 //BA.debugLineNum = 526;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 527;BA.debugLine="Dim iTot As Int = tblFields.Size - 1";
_itot = (int) (_tblfields.getSize()-1);
 //BA.debugLineNum = 528;BA.debugLine="For i = 0 To iTot";
{
final int step8 = 1;
final int limit8 = _itot;
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
 //BA.debugLineNum = 529;BA.debugLine="Dim col As String = tblFields.GetKeyAt(i)";
_col = BA.ObjectToString(_tblfields.GetKeyAt(_i));
 //BA.debugLineNum = 530;BA.debugLine="sb.Append(col)";
_sb.Append(_col);
 //BA.debugLineNum = 531;BA.debugLine="If i <> iTot Then";
if (_i!=_itot) { 
 //BA.debugLineNum = 532;BA.debugLine="sb.Append(\" = ?,\")";
_sb.Append(" = ?,");
 }else {
 //BA.debugLineNum = 534;BA.debugLine="sb.Append(\" = ?\")";
_sb.Append(" = ?");
 };
 }
};
 //BA.debugLineNum = 537;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 538;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 539;BA.debugLine="m.Put(\"sql\", sb.tostring)";
_m.Put((Object)("sql"),(Object)(_sb.ToString()));
 //BA.debugLineNum = 540;BA.debugLine="m.Put(\"args\", args)";
_m.Put((Object)("args"),(Object)(_args.getObject()));
 //BA.debugLineNum = 541;BA.debugLine="m.Put(\"types\", listOfTypes)";
_m.Put((Object)("types"),(Object)(_listoftypes.getObject()));
 //BA.debugLineNum = 542;BA.debugLine="m.Put(\"command\", \"update\")";
_m.Put((Object)("command"),(Object)("update"));
 //BA.debugLineNum = 543;BA.debugLine="Dim res As String = Map2Json(m)";
_res = _map2json(_m);
 //BA.debugLineNum = 544;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 545;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 477;BA.debugLine="Sub UpdateWhere(tblName As String, tblfields As Ma";
 //BA.debugLineNum = 478;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblfields)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = _getmaptypes(_tblfields);
 //BA.debugLineNum = 479;BA.debugLine="Dim listOfTypes1 As List = GetMapTypes(tblWhere)";
_listoftypes1 = new anywheresoftware.b4a.objects.collections.List();
_listoftypes1 = _getmaptypes(_tblwhere);
 //BA.debugLineNum = 480;BA.debugLine="listOfTypes.AddAll(listOfTypes1)";
_listoftypes.AddAll(_listoftypes1);
 //BA.debugLineNum = 481;BA.debugLine="Dim listOfValues As List = GetMapValues(tblfields";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = _getmapvalues(_tblfields);
 //BA.debugLineNum = 482;BA.debugLine="Dim listOfValues1 As List = GetMapValues(tblWhere";
_listofvalues1 = new anywheresoftware.b4a.objects.collections.List();
_listofvalues1 = _getmapvalues(_tblwhere);
 //BA.debugLineNum = 483;BA.debugLine="listOfValues.AddAll(listOfValues1)";
_listofvalues.AddAll(_listofvalues1);
 //BA.debugLineNum = 484;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 485;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 486;BA.debugLine="sb.Append($\"UPDATE ${EscapeField(tblName)} SET \"$";
_sb.Append(("UPDATE "+__c.SmartStringFormatter("",(Object)(_escapefield(_tblname)))+" SET "));
 //BA.debugLineNum = 487;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 488;BA.debugLine="Dim iTot As Int = tblfields.Size - 1";
_itot = (int) (_tblfields.getSize()-1);
 //BA.debugLineNum = 489;BA.debugLine="For i = 0 To iTot";
{
final int step12 = 1;
final int limit12 = _itot;
_i = (int) (0) ;
for (;_i <= limit12 ;_i = _i + step12 ) {
 //BA.debugLineNum = 490;BA.debugLine="Dim col As String = tblfields.GetKeyAt(i)";
_col = BA.ObjectToString(_tblfields.GetKeyAt(_i));
 //BA.debugLineNum = 491;BA.debugLine="sb.Append(EscapeField(col))";
_sb.Append(_escapefield(_col));
 //BA.debugLineNum = 492;BA.debugLine="If i <> iTot Then";
if (_i!=_itot) { 
 //BA.debugLineNum = 493;BA.debugLine="sb.Append(\"= ?,\")";
_sb.Append("= ?,");
 }else {
 //BA.debugLineNum = 495;BA.debugLine="sb.Append(\"= ?\")";
_sb.Append("= ?");
 };
 }
};
 //BA.debugLineNum = 498;BA.debugLine="sb.Append($\" WHERE \"$)";
_sb.Append((" WHERE "));
 //BA.debugLineNum = 499;BA.debugLine="Dim iWhere As Int = tblWhere.Size - 1";
_iwhere = (int) (_tblwhere.getSize()-1);
 //BA.debugLineNum = 500;BA.debugLine="For i = 0 To iWhere";
{
final int step23 = 1;
final int limit23 = _iwhere;
_i = (int) (0) ;
for (;_i <= limit23 ;_i = _i + step23 ) {
 //BA.debugLineNum = 501;BA.debugLine="If i > 0 Then";
if (_i>0) { 
 //BA.debugLineNum = 502;BA.debugLine="sb.Append(\" AND \")";
_sb.Append(" AND ");
 };
 //BA.debugLineNum = 504;BA.debugLine="Dim col As String = tblWhere.GetKeyAt(i)";
_col = BA.ObjectToString(_tblwhere.GetKeyAt(_i));
 //BA.debugLineNum = 505;BA.debugLine="sb.Append(EscapeField(col))";
_sb.Append(_escapefield(_col));
 //BA.debugLineNum = 506;BA.debugLine="sb.Append(\" = ?\")";
_sb.Append(" = ?");
 }
};
 //BA.debugLineNum = 508;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 509;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 510;BA.debugLine="m.Put(\"sql\", sb.tostring)";
_m.Put((Object)("sql"),(Object)(_sb.ToString()));
 //BA.debugLineNum = 511;BA.debugLine="m.Put(\"args\", listOfValues)";
_m.Put((Object)("args"),(Object)(_listofvalues.getObject()));
 //BA.debugLineNum = 512;BA.debugLine="m.Put(\"types\", listOfTypes)";
_m.Put((Object)("types"),(Object)(_listoftypes.getObject()));
 //BA.debugLineNum = 513;BA.debugLine="m.Put(\"command\", \"updatewhere\")";
_m.Put((Object)("command"),(Object)("updatewhere"));
 //BA.debugLineNum = 514;BA.debugLine="Dim res As String = Map2Json(m)";
_res = _map2json(_m);
 //BA.debugLineNum = 515;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 516;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
