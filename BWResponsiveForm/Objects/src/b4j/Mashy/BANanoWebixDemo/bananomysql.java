package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class bananomysql extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.bananomysql", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.bananomysql.class).invoke(this, new Object[] {null});
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
public com.ab.banano.BANano _banano = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
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
public b4j.Mashy.BANanoWebixDemo.bananomysql  _addblobs(anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
String _strfld = "";
 //BA.debugLineNum = 147;BA.debugLine="Sub AddBlobs(fieldNames As List) As BANanoMySQL";
 //BA.debugLineNum = 148;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 149;BA.debugLine="recType.Put(strfld,\"BLOB\")";
_rectype.Put((Object)(_strfld),(Object)("BLOB"));
 }
};
 //BA.debugLineNum = 151;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.bananomysql)(this);
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.bananomysql  _adddoubles(anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
String _strfld = "";
 //BA.debugLineNum = 139;BA.debugLine="Sub AddDoubles(fieldNames As List) As BANanoMySQL";
 //BA.debugLineNum = 140;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 141;BA.debugLine="recType.Put(strfld,\"DOUBLE\")";
_rectype.Put((Object)(_strfld),(Object)("DOUBLE"));
 }
};
 //BA.debugLineNum = 143;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.bananomysql)(this);
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.bananomysql  _addintegers(anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
String _strfld = "";
 //BA.debugLineNum = 131;BA.debugLine="Sub AddIntegers(fieldNames As List) As BANanoMySQL";
 //BA.debugLineNum = 132;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 133;BA.debugLine="recType.Put(strfld,\"INT\")";
_rectype.Put((Object)(_strfld),(Object)("INT"));
 }
};
 //BA.debugLineNum = 135;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.bananomysql)(this);
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.bananomysql  _addstrings(anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
String _strfld = "";
 //BA.debugLineNum = 123;BA.debugLine="Sub AddStrings(fieldNames As List) As BANanoMySQL";
 //BA.debugLineNum = 124;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 125;BA.debugLine="recType.Put(strfld,\"STRING\")";
_rectype.Put((Object)(_strfld),(Object)("STRING"));
 }
};
 //BA.debugLineNum = 127;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.bananomysql)(this);
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 18;BA.debugLine="Public const DB_INT As String = \"INTEGER\"";
_db_int = "INTEGER";
 //BA.debugLineNum = 19;BA.debugLine="Public const DB_INT As String = \"TEXT\"";
_db_int = "TEXT";
 //BA.debugLineNum = 20;BA.debugLine="Type MySQLResultSet(response As String, result As";
;
 //BA.debugLineNum = 21;BA.debugLine="Private BANano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return "";
}
public String  _createdatabase(String _dbname) throws Exception{
String _sql = "";
anywheresoftware.b4a.objects.collections.Map _m = null;
String _res = "";
 //BA.debugLineNum = 172;BA.debugLine="Sub CreateDatabase(dbName As String) As String";
 //BA.debugLineNum = 173;BA.debugLine="Dim SQL As String = $\"CREATE DATABASE IF NOT EXIS";
_sql = ("CREATE DATABASE IF NOT EXISTS "+__c.SmartStringFormatter("",(Object)(_escapefield(_dbname)))+" DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci");
 //BA.debugLineNum = 174;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 175;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 176;BA.debugLine="m.Put(\"sql\", SQL)";
_m.Put((Object)("sql"),(Object)(_sql));
 //BA.debugLineNum = 177;BA.debugLine="m.Put(\"args\", Null)";
_m.Put((Object)("args"),__c.Null);
 //BA.debugLineNum = 178;BA.debugLine="m.Put(\"types\", Null)";
_m.Put((Object)("types"),__c.Null);
 //BA.debugLineNum = 179;BA.debugLine="m.Put(\"command\", \"createdb\")";
_m.Put((Object)("command"),(Object)("createdb"));
 //BA.debugLineNum = 180;BA.debugLine="Dim res As String = Map2Json(m)";
_res = _map2json(_m);
 //BA.debugLineNum = 181;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 210;BA.debugLine="public Sub CreateTable(tblName As String, tblField";
 //BA.debugLineNum = 211;BA.debugLine="Dim fldName As String";
_fldname = "";
 //BA.debugLineNum = 212;BA.debugLine="Dim fldType As String";
_fldtype = "";
 //BA.debugLineNum = 213;BA.debugLine="Dim fldTot As Int";
_fldtot = 0;
 //BA.debugLineNum = 214;BA.debugLine="Dim fldCnt As Int";
_fldcnt = 0;
 //BA.debugLineNum = 215;BA.debugLine="fldTot = tblFields.Size - 1";
_fldtot = (int) (_tblfields.getSize()-1);
 //BA.debugLineNum = 216;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 217;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 218;BA.debugLine="sb.Append(\"(\")";
_sb.Append("(");
 //BA.debugLineNum = 219;BA.debugLine="For fldCnt = 0 To fldTot";
{
final int step9 = 1;
final int limit9 = _fldtot;
_fldcnt = (int) (0) ;
for (;_fldcnt <= limit9 ;_fldcnt = _fldcnt + step9 ) {
 //BA.debugLineNum = 220;BA.debugLine="fldName = tblFields.GetKeyAt(fldCnt)";
_fldname = BA.ObjectToString(_tblfields.GetKeyAt(_fldcnt));
 //BA.debugLineNum = 221;BA.debugLine="fldType = tblFields.Get(fldName)";
_fldtype = BA.ObjectToString(_tblfields.Get((Object)(_fldname)));
 //BA.debugLineNum = 222;BA.debugLine="If fldCnt > 0 Then";
if (_fldcnt>0) { 
 //BA.debugLineNum = 223;BA.debugLine="sb.Append(\", \")";
_sb.Append(", ");
 };
 //BA.debugLineNum = 225;BA.debugLine="sb.Append(EscapeField(fldName))";
_sb.Append(_escapefield(_fldname));
 //BA.debugLineNum = 226;BA.debugLine="sb.Append(\" \")";
_sb.Append(" ");
 //BA.debugLineNum = 227;BA.debugLine="sb.Append(fldType)";
_sb.Append(_fldtype);
 //BA.debugLineNum = 228;BA.debugLine="If fldName.EqualsIgnoreCase(PK) Then";
if (_fldname.equalsIgnoreCase(_pk)) { 
 //BA.debugLineNum = 229;BA.debugLine="sb.Append(\" NOT NULL PRIMARY KEY\")";
_sb.Append(" NOT NULL PRIMARY KEY");
 };
 //BA.debugLineNum = 231;BA.debugLine="If fldName.EqualsIgnoreCase(Auto) Then";
if (_fldname.equalsIgnoreCase(_auto)) { 
 //BA.debugLineNum = 232;BA.debugLine="sb.Append(\" AUTO_INCREMENT\")";
_sb.Append(" AUTO_INCREMENT");
 };
 }
};
 //BA.debugLineNum = 235;BA.debugLine="sb.Append(\")\")";
_sb.Append(")");
 //BA.debugLineNum = 237;BA.debugLine="Dim query As String = \"CREATE TABLE IF NOT EXISTS";
_query = "CREATE TABLE IF NOT EXISTS "+_escapefield(_tblname)+" "+_sb.ToString();
 //BA.debugLineNum = 238;BA.debugLine="query = query & \" ENGINE=MyISAM CHARACTER SET utf";
_query = _query+" ENGINE=MyISAM CHARACTER SET utf8 COLLATE utf8_unicode_ci";
 //BA.debugLineNum = 239;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 240;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 241;BA.debugLine="m.Put(\"sql\", query)";
_m.Put((Object)("sql"),(Object)(_query));
 //BA.debugLineNum = 242;BA.debugLine="m.Put(\"args\", Null)";
_m.Put((Object)("args"),__c.Null);
 //BA.debugLineNum = 243;BA.debugLine="m.Put(\"types\", Null)";
_m.Put((Object)("types"),__c.Null);
 //BA.debugLineNum = 244;BA.debugLine="m.Put(\"command\", \"createtable\")";
_m.Put((Object)("command"),(Object)("createtable"));
 //BA.debugLineNum = 245;BA.debugLine="Dim res As String = Map2Json(m)";
_res = _map2json(_m);
 //BA.debugLineNum = 246;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 247;BA.debugLine="End Sub";
return "";
}
public String  _cstr(Object _o) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub CStr(o As Object) As String";
 //BA.debugLineNum = 61;BA.debugLine="Return \"\" & o";
if (true) return ""+BA.ObjectToString(_o);
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return "";
}
public String  _deleteall(String _tblname) throws Exception{
String _sb = "";
anywheresoftware.b4a.objects.collections.Map _m = null;
String _res = "";
 //BA.debugLineNum = 451;BA.debugLine="Sub DeleteAll(tblName As String) As String";
 //BA.debugLineNum = 452;BA.debugLine="Dim sb As String = $\"DELETE FROM ${EscapeField(tb";
_sb = ("DELETE FROM "+__c.SmartStringFormatter("",(Object)(_escapefield(_tblname)))+"");
 //BA.debugLineNum = 453;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 454;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 455;BA.debugLine="m.Put(\"sql\", sb)";
_m.Put((Object)("sql"),(Object)(_sb));
 //BA.debugLineNum = 456;BA.debugLine="m.Put(\"args\", Null)";
_m.Put((Object)("args"),__c.Null);
 //BA.debugLineNum = 457;BA.debugLine="m.Put(\"types\", Null)";
_m.Put((Object)("types"),__c.Null);
 //BA.debugLineNum = 458;BA.debugLine="m.Put(\"command\", \"delete\")";
_m.Put((Object)("command"),(Object)("delete"));
 //BA.debugLineNum = 459;BA.debugLine="Dim res As String = Map2Json(m)";
_res = _map2json(_m);
 //BA.debugLineNum = 460;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 461;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 464;BA.debugLine="Sub DeleteWhere(tblName As String, tblWhere As Map";
 //BA.debugLineNum = 465;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblWhere)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = _getmaptypes(_tblwhere);
 //BA.debugLineNum = 466;BA.debugLine="Dim listOfValues As List = GetMapValues(tblWhere)";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = _getmapvalues(_tblwhere);
 //BA.debugLineNum = 467;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 468;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 469;BA.debugLine="sb.Append($\"DELETE FROM ${EscapeField(tblName)} W";
_sb.Append(("DELETE FROM "+__c.SmartStringFormatter("",(Object)(_escapefield(_tblname)))+" WHERE "));
 //BA.debugLineNum = 470;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 471;BA.debugLine="Dim iWhere As Int = tblWhere.Size - 1";
_iwhere = (int) (_tblwhere.getSize()-1);
 //BA.debugLineNum = 472;BA.debugLine="For i = 0 To iWhere";
{
final int step8 = 1;
final int limit8 = _iwhere;
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
 //BA.debugLineNum = 473;BA.debugLine="If i > 0 Then";
if (_i>0) { 
 //BA.debugLineNum = 474;BA.debugLine="sb.Append(\" AND \")";
_sb.Append(" AND ");
 };
 //BA.debugLineNum = 476;BA.debugLine="Dim col As String = tblWhere.GetKeyAt(i)";
_col = BA.ObjectToString(_tblwhere.GetKeyAt(_i));
 //BA.debugLineNum = 477;BA.debugLine="sb.Append(EscapeField(col))";
_sb.Append(_escapefield(_col));
 //BA.debugLineNum = 478;BA.debugLine="sb.Append(\" = ?\")";
_sb.Append(" = ?");
 }
};
 //BA.debugLineNum = 480;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 481;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 482;BA.debugLine="m.Put(\"sql\", sb.tostring)";
_m.Put((Object)("sql"),(Object)(_sb.ToString()));
 //BA.debugLineNum = 483;BA.debugLine="m.Put(\"args\", listOfValues)";
_m.Put((Object)("args"),(Object)(_listofvalues.getObject()));
 //BA.debugLineNum = 484;BA.debugLine="m.Put(\"types\", listOfTypes)";
_m.Put((Object)("types"),(Object)(_listoftypes.getObject()));
 //BA.debugLineNum = 485;BA.debugLine="m.Put(\"command\", \"deletewhere\")";
_m.Put((Object)("command"),(Object)("deletewhere"));
 //BA.debugLineNum = 486;BA.debugLine="Dim res As String = Map2Json(m)";
_res = _map2json(_m);
 //BA.debugLineNum = 487;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 488;BA.debugLine="End Sub";
return "";
}
public String  _dropdatabase(String _dbname) throws Exception{
String _sql = "";
anywheresoftware.b4a.objects.collections.Map _m = null;
String _res = "";
 //BA.debugLineNum = 185;BA.debugLine="Sub DropDataBase(dbName As String) As String";
 //BA.debugLineNum = 186;BA.debugLine="Dim SQL As String = $\"DROP DATABASE ${EscapeField";
_sql = ("DROP DATABASE "+__c.SmartStringFormatter("",(Object)(_escapefield(_dbname)))+"");
 //BA.debugLineNum = 187;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 188;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 189;BA.debugLine="m.Put(\"sql\", SQL)";
_m.Put((Object)("sql"),(Object)(_sql));
 //BA.debugLineNum = 190;BA.debugLine="m.Put(\"args\", Null)";
_m.Put((Object)("args"),__c.Null);
 //BA.debugLineNum = 191;BA.debugLine="m.Put(\"types\", Null)";
_m.Put((Object)("types"),__c.Null);
 //BA.debugLineNum = 192;BA.debugLine="m.Put(\"command\", \"dropdb\")";
_m.Put((Object)("command"),(Object)("dropdb"));
 //BA.debugLineNum = 193;BA.debugLine="Dim res As String = Map2Json(m)";
_res = _map2json(_m);
 //BA.debugLineNum = 194;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 195;BA.debugLine="End Sub";
return "";
}
public String  _droptable(String _tblname) throws Exception{
String _query = "";
anywheresoftware.b4a.objects.collections.Map _m = null;
String _res = "";
 //BA.debugLineNum = 250;BA.debugLine="public Sub DropTable(tblName As String) As String";
 //BA.debugLineNum = 252;BA.debugLine="Dim query As String = \"DROP TABLE \" & EscapeField";
_query = "DROP TABLE "+_escapefield(_tblname);
 //BA.debugLineNum = 253;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 254;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 255;BA.debugLine="m.Put(\"sql\", query)";
_m.Put((Object)("sql"),(Object)(_query));
 //BA.debugLineNum = 256;BA.debugLine="m.Put(\"args\", Null)";
_m.Put((Object)("args"),__c.Null);
 //BA.debugLineNum = 257;BA.debugLine="m.Put(\"types\", Null)";
_m.Put((Object)("types"),__c.Null);
 //BA.debugLineNum = 258;BA.debugLine="m.Put(\"command\", \"droptable\")";
_m.Put((Object)("command"),(Object)("droptable"));
 //BA.debugLineNum = 259;BA.debugLine="Dim res As String = Map2Json(m)";
_res = _map2json(_m);
 //BA.debugLineNum = 260;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 261;BA.debugLine="End Sub";
return "";
}
public String  _escapefield(String _f) throws Exception{
 //BA.debugLineNum = 155;BA.debugLine="Private Sub EscapeField(f As String) As String";
 //BA.debugLineNum = 156;BA.debugLine="Return $\"`${f}`\"$";
if (true) return ("`"+__c.SmartStringFormatter("",(Object)(_f))+"`");
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return "";
}
public String  _execute(String _strsql) throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
String _res = "";
 //BA.debugLineNum = 198;BA.debugLine="Sub Execute(strSQL As String) As String";
 //BA.debugLineNum = 199;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 200;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 201;BA.debugLine="m.Put(\"sql\", strSQL)";
_m.Put((Object)("sql"),(Object)(_strsql));
 //BA.debugLineNum = 202;BA.debugLine="m.Put(\"args\", Null)";
_m.Put((Object)("args"),__c.Null);
 //BA.debugLineNum = 203;BA.debugLine="m.Put(\"types\", Null)";
_m.Put((Object)("types"),__c.Null);
 //BA.debugLineNum = 204;BA.debugLine="m.Put(\"command\", \"execute\")";
_m.Put((Object)("command"),(Object)("execute"));
 //BA.debugLineNum = 205;BA.debugLine="Dim res As String = Map2Json(m)";
_res = _map2json(_m);
 //BA.debugLineNum = 206;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 207;BA.debugLine="End Sub";
return "";
}
public String  _exists(String _tblname,String _primarykey,String _primaryvalue) throws Exception{
anywheresoftware.b4a.objects.collections.Map _qw = null;
String _qry = "";
 //BA.debugLineNum = 400;BA.debugLine="Sub Exists(tblName As String, primaryKey As String";
 //BA.debugLineNum = 401;BA.debugLine="Dim qw As Map = CreateMap()";
_qw = new anywheresoftware.b4a.objects.collections.Map();
_qw = __c.createMap(new Object[] {});
 //BA.debugLineNum = 402;BA.debugLine="qw.Put(primaryKey, primaryValue)";
_qw.Put((Object)(_primarykey),(Object)(_primaryvalue));
 //BA.debugLineNum = 403;BA.debugLine="Dim qry As String = SelectWhere(tblName, Array(pr";
_qry = _selectwhere(_tblname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_primarykey)}),_qw,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_primarykey)}));
 //BA.debugLineNum = 404;BA.debugLine="Return qry";
if (true) return _qry;
 //BA.debugLineNum = 405;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _getmapkeys(anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
int _icnt = 0;
int _itot = 0;
String _value = "";
 //BA.debugLineNum = 308;BA.debugLine="private Sub GetMapKeys(sourceMap As Map) As List";
 //BA.debugLineNum = 309;BA.debugLine="Dim listOfValues As List";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 310;BA.debugLine="listOfValues.Initialize";
_listofvalues.Initialize();
 //BA.debugLineNum = 311;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
 //BA.debugLineNum = 312;BA.debugLine="Dim iTot As Int";
_itot = 0;
 //BA.debugLineNum = 313;BA.debugLine="iTot = sourceMap.Size - 1";
_itot = (int) (_sourcemap.getSize()-1);
 //BA.debugLineNum = 314;BA.debugLine="For iCnt = 0 To iTot";
{
final int step6 = 1;
final int limit6 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit6 ;_icnt = _icnt + step6 ) {
 //BA.debugLineNum = 315;BA.debugLine="Dim value As String = sourceMap.GetKeyAt(iCnt)";
_value = BA.ObjectToString(_sourcemap.GetKeyAt(_icnt));
 //BA.debugLineNum = 316;BA.debugLine="listOfValues.Add(value)";
_listofvalues.Add((Object)(_value));
 }
};
 //BA.debugLineNum = 318;BA.debugLine="Return listOfValues";
if (true) return _listofvalues;
 //BA.debugLineNum = 319;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getmaptypes(anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
int _icnt = 0;
int _itot = 0;
String _col = "";
String _coltype = "";
 //BA.debugLineNum = 264;BA.debugLine="private Sub GetMapTypes(sourceMap As Map) As List";
 //BA.debugLineNum = 265;BA.debugLine="Dim listOfTypes As List";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 266;BA.debugLine="listOfTypes.Initialize";
_listoftypes.Initialize();
 //BA.debugLineNum = 267;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
 //BA.debugLineNum = 268;BA.debugLine="Dim iTot As Int";
_itot = 0;
 //BA.debugLineNum = 269;BA.debugLine="iTot = sourceMap.Size - 1";
_itot = (int) (_sourcemap.getSize()-1);
 //BA.debugLineNum = 270;BA.debugLine="For iCnt = 0 To iTot";
{
final int step6 = 1;
final int limit6 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit6 ;_icnt = _icnt + step6 ) {
 //BA.debugLineNum = 271;BA.debugLine="Dim col As String = sourceMap.GetKeyAt(iCnt)";
_col = BA.ObjectToString(_sourcemap.GetKeyAt(_icnt));
 //BA.debugLineNum = 272;BA.debugLine="Dim colType As String = recType.GetDefault(col,\"";
_coltype = BA.ObjectToString(_rectype.GetDefault((Object)(_col),(Object)("STRING")));
 //BA.debugLineNum = 273;BA.debugLine="Select Case colType";
switch (BA.switchObjectToInt(_coltype,"VARCHAR(20)","VARCHAR(10)","VARCHAR(30)","VARCHAR(40)","VARCHAR(50)","VARCHAR(100)","VARCHAR(255)","STRING","VARCHAR","TEXT","DATE","DATETIME","NVARCHAR","INTEGER","INT","BOOL","BOOLEAN","REAL","FLOAT","DOUBLE","BLOB")) {
case 0: 
case 1: 
case 2: 
case 3: {
 //BA.debugLineNum = 275;BA.debugLine="listOfTypes.add(\"s\")";
_listoftypes.Add((Object)("s"));
 break; }
case 4: 
case 5: 
case 6: {
 //BA.debugLineNum = 277;BA.debugLine="listOfTypes.add(\"s\")";
_listoftypes.Add((Object)("s"));
 break; }
case 7: 
case 8: 
case 9: 
case 10: 
case 11: 
case 12: {
 //BA.debugLineNum = 279;BA.debugLine="listOfTypes.add(\"s\")";
_listoftypes.Add((Object)("s"));
 break; }
case 13: 
case 14: 
case 15: 
case 16: {
 //BA.debugLineNum = 281;BA.debugLine="listOfTypes.add(\"i\")";
_listoftypes.Add((Object)("i"));
 break; }
case 17: 
case 18: 
case 19: {
 //BA.debugLineNum = 283;BA.debugLine="listOfTypes.add(\"d\")";
_listoftypes.Add((Object)("d"));
 break; }
case 20: {
 //BA.debugLineNum = 285;BA.debugLine="listOfTypes.Add(\"b\")";
_listoftypes.Add((Object)("b"));
 break; }
default: {
 //BA.debugLineNum = 287;BA.debugLine="listOfTypes.add(\"s\")";
_listoftypes.Add((Object)("s"));
 break; }
}
;
 }
};
 //BA.debugLineNum = 290;BA.debugLine="Return listOfTypes";
if (true) return _listoftypes;
 //BA.debugLineNum = 291;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getmapvalues(anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
int _icnt = 0;
int _itot = 0;
String _value = "";
 //BA.debugLineNum = 294;BA.debugLine="private Sub GetMapValues(sourceMap As Map) As List";
 //BA.debugLineNum = 295;BA.debugLine="Dim listOfValues As List";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 296;BA.debugLine="listOfValues.Initialize";
_listofvalues.Initialize();
 //BA.debugLineNum = 297;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
 //BA.debugLineNum = 298;BA.debugLine="Dim iTot As Int";
_itot = 0;
 //BA.debugLineNum = 299;BA.debugLine="iTot = sourceMap.Size - 1";
_itot = (int) (_sourcemap.getSize()-1);
 //BA.debugLineNum = 300;BA.debugLine="For iCnt = 0 To iTot";
{
final int step6 = 1;
final int limit6 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit6 ;_icnt = _icnt + step6 ) {
 //BA.debugLineNum = 301;BA.debugLine="Dim value As String = sourceMap.GetValueAt(iCnt)";
_value = BA.ObjectToString(_sourcemap.GetValueAt(_icnt));
 //BA.debugLineNum = 302;BA.debugLine="listOfValues.Add(value)";
_listofvalues.Add((Object)(_value));
 }
};
 //BA.debugLineNum = 304;BA.debugLine="Return listOfValues";
if (true) return _listofvalues;
 //BA.debugLineNum = 305;BA.debugLine="End Sub";
return null;
}
public String  _getmax(String _tblname,String _fldname) throws Exception{
String _sb = "";
anywheresoftware.b4a.objects.collections.Map _m = null;
String _res = "";
 //BA.debugLineNum = 30;BA.debugLine="Sub GetMax(tblName As String, fldName As String) A";
 //BA.debugLineNum = 31;BA.debugLine="Dim sb As String = $\"SELECT MAX(${fldName}) As ${";
_sb = ("SELECT MAX("+__c.SmartStringFormatter("",(Object)(_fldname))+") As "+__c.SmartStringFormatter("",(Object)(_fldname))+" FROM "+__c.SmartStringFormatter("",(Object)(_escapefield(_tblname)))+"");
 //BA.debugLineNum = 32;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 33;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 34;BA.debugLine="m.Put(\"sql\", sb)";
_m.Put((Object)("sql"),(Object)(_sb));
 //BA.debugLineNum = 35;BA.debugLine="m.Put(\"args\", Null)";
_m.Put((Object)("args"),__c.Null);
 //BA.debugLineNum = 36;BA.debugLine="m.Put(\"types\", Null)";
_m.Put((Object)("types"),__c.Null);
 //BA.debugLineNum = 37;BA.debugLine="m.Put(\"command\", \"getmax\")";
_m.Put((Object)("command"),(Object)("getmax"));
 //BA.debugLineNum = 38;BA.debugLine="Dim res As String = Map2Json(m)";
_res = _map2json(_m);
 //BA.debugLineNum = 39;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return "";
}
public String  _getnextid(String _fld,anywheresoftware.b4a.objects.collections.List _rsl) throws Exception{
int _nextid = 0;
String _strid = "";
anywheresoftware.b4a.objects.collections.Map _nr = null;
String _ni = "";
 //BA.debugLineNum = 43;BA.debugLine="Sub GetNextID(fld As String, rsl As List) As Strin";
 //BA.debugLineNum = 44;BA.debugLine="Dim nextid As Int";
_nextid = 0;
 //BA.debugLineNum = 45;BA.debugLine="Dim strid As String";
_strid = "";
 //BA.debugLineNum = 47;BA.debugLine="If rsl.Size = 0 Then";
if (_rsl.getSize()==0) { 
 //BA.debugLineNum = 48;BA.debugLine="nextid = 0";
_nextid = (int) (0);
 }else {
 //BA.debugLineNum = 50;BA.debugLine="Dim nr As Map = rsl.Get(0)";
_nr = new anywheresoftware.b4a.objects.collections.Map();
_nr.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_rsl.Get((int) (0))));
 //BA.debugLineNum = 51;BA.debugLine="Dim ni As String = nr.GetDefault(fld,\"0\")";
_ni = BA.ObjectToString(_nr.GetDefault((Object)(_fld),(Object)("0")));
 //BA.debugLineNum = 52;BA.debugLine="nextid = BANano.parseInt(ni)";
_nextid = _banano.parseInt((Object)(_ni));
 };
 //BA.debugLineNum = 54;BA.debugLine="nextid = nextid + 1";
_nextid = (int) (_nextid+1);
 //BA.debugLineNum = 55;BA.debugLine="strid = CStr(nextid)";
_strid = _cstr((Object)(_nextid));
 //BA.debugLineNum = 56;BA.debugLine="Return strid";
if (true) return _strid;
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.bananomysql._mysqlresultset  _getresultset(String _query,String _res) throws Exception{
anywheresoftware.b4a.objects.collections.List _tt = null;
anywheresoftware.b4a.objects.collections.List _aa = null;
anywheresoftware.b4a.objects.collections.List _datalist = null;
anywheresoftware.b4a.objects.collections.Map _resmap = null;
String _scommand = "";
anywheresoftware.b4a.objects.collections.List _stypes = null;
anywheresoftware.b4a.objects.collections.List _sargs = null;
String _ssql = "";
anywheresoftware.b4a.objects.collections.Map _resmap1 = null;
b4j.Mashy.BANanoWebixDemo.bananomysql._mysqlresultset _gr = null;
 //BA.debugLineNum = 73;BA.debugLine="Sub GetResultSet(query As String, res As String) A";
 //BA.debugLineNum = 74;BA.debugLine="Dim tt As List";
_tt = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 75;BA.debugLine="tt.Initialize";
_tt.Initialize();
 //BA.debugLineNum = 76;BA.debugLine="Dim aa As List";
_aa = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 77;BA.debugLine="aa.Initialize";
_aa.Initialize();
 //BA.debugLineNum = 78;BA.debugLine="Dim dataList As List";
_datalist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 79;BA.debugLine="dataList.Initialize";
_datalist.Initialize();
 //BA.debugLineNum = 80;BA.debugLine="Dim resmap As Map = Json2Map(query)";
_resmap = new anywheresoftware.b4a.objects.collections.Map();
_resmap = _json2map(_query);
 //BA.debugLineNum = 81;BA.debugLine="Dim scommand As String = resmap.GetDefault(\"comma";
_scommand = BA.ObjectToString(_resmap.GetDefault((Object)("command"),(Object)("")));
 //BA.debugLineNum = 82;BA.debugLine="Dim stypes As List = resmap.GetDefault(\"types\", t";
_stypes = new anywheresoftware.b4a.objects.collections.List();
_stypes.setObject((java.util.List)(_resmap.GetDefault((Object)("types"),(Object)(_tt.getObject()))));
 //BA.debugLineNum = 83;BA.debugLine="Dim sargs As List = resmap.GetDefault(\"args\", aa)";
_sargs = new anywheresoftware.b4a.objects.collections.List();
_sargs.setObject((java.util.List)(_resmap.GetDefault((Object)("args"),(Object)(_aa.getObject()))));
 //BA.debugLineNum = 84;BA.debugLine="Dim ssql As String = resmap.GetDefault(\"sql\",\"\")";
_ssql = BA.ObjectToString(_resmap.GetDefault((Object)("sql"),(Object)("")));
 //BA.debugLineNum = 86;BA.debugLine="Dim resmap1 As Map = Json2Map(res)";
_resmap1 = new anywheresoftware.b4a.objects.collections.Map();
_resmap1 = _json2map(_res);
 //BA.debugLineNum = 87;BA.debugLine="Dim gr As MySQLResultSet";
_gr = new b4j.Mashy.BANanoWebixDemo.bananomysql._mysqlresultset();
 //BA.debugLineNum = 88;BA.debugLine="gr.Initialize";
_gr.Initialize();
 //BA.debugLineNum = 89;BA.debugLine="gr.query = ssql";
_gr.query /*String*/  = _ssql;
 //BA.debugLineNum = 90;BA.debugLine="gr.args = sargs";
_gr.args /*anywheresoftware.b4a.objects.collections.List*/  = _sargs;
 //BA.debugLineNum = 91;BA.debugLine="gr.command = scommand";
_gr.command /*String*/  = _scommand;
 //BA.debugLineNum = 92;BA.debugLine="gr.types = stypes";
_gr.types /*anywheresoftware.b4a.objects.collections.List*/  = _stypes;
 //BA.debugLineNum = 93;BA.debugLine="gr.response = resmap1.GetDefault(\"response\",\"\")";
_gr.response /*String*/  = BA.ObjectToString(_resmap1.GetDefault((Object)("response"),(Object)("")));
 //BA.debugLineNum = 94;BA.debugLine="gr.result = resmap1.GetDefault(\"data\", dataList)";
_gr.result /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(_resmap1.GetDefault((Object)("data"),(Object)(_datalist.getObject()))));
 //BA.debugLineNum = 95;BA.debugLine="Return gr";
if (true) return _gr;
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.bananomysql  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 66;BA.debugLine="Public Sub Initialize() As BANanoMySQL";
 //BA.debugLineNum = 67;BA.debugLine="recType.Initialize";
_rectype.Initialize();
 //BA.debugLineNum = 68;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.bananomysql)(this);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 323;BA.debugLine="Sub Insert(tblName As String, tblFields As Map) As";
 //BA.debugLineNum = 324;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 325;BA.debugLine="Dim columns As StringBuilder";
_columns = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 326;BA.debugLine="Dim values As StringBuilder";
_values = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 327;BA.debugLine="Dim listOfValues As List = GetMapValues(tblFields";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = _getmapvalues(_tblfields);
 //BA.debugLineNum = 328;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblFields)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = _getmaptypes(_tblfields);
 //BA.debugLineNum = 329;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
 //BA.debugLineNum = 330;BA.debugLine="Dim iTot As Int";
_itot = 0;
 //BA.debugLineNum = 331;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 332;BA.debugLine="columns.Initialize";
_columns.Initialize();
 //BA.debugLineNum = 333;BA.debugLine="values.Initialize";
_values.Initialize();
 //BA.debugLineNum = 334;BA.debugLine="sb.Append($\"INSERT INTO ${EscapeField(tblName)} (";
_sb.Append(("INSERT INTO "+__c.SmartStringFormatter("",(Object)(_escapefield(_tblname)))+" ("));
 //BA.debugLineNum = 335;BA.debugLine="iTot = tblFields.Size - 1";
_itot = (int) (_tblfields.getSize()-1);
 //BA.debugLineNum = 336;BA.debugLine="For iCnt = 0 To iTot";
{
final int step13 = 1;
final int limit13 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit13 ;_icnt = _icnt + step13 ) {
 //BA.debugLineNum = 337;BA.debugLine="Dim col As String = tblFields.GetKeyAt(iCnt)";
_col = BA.ObjectToString(_tblfields.GetKeyAt(_icnt));
 //BA.debugLineNum = 338;BA.debugLine="If iCnt > 0 Then";
if (_icnt>0) { 
 //BA.debugLineNum = 339;BA.debugLine="columns.Append(\", \")";
_columns.Append(", ");
 //BA.debugLineNum = 340;BA.debugLine="values.Append(\", \")";
_values.Append(", ");
 };
 //BA.debugLineNum = 342;BA.debugLine="columns.Append(EscapeField(col))";
_columns.Append(_escapefield(_col));
 //BA.debugLineNum = 343;BA.debugLine="values.Append(\"?\")";
_values.Append("?");
 }
};
 //BA.debugLineNum = 345;BA.debugLine="sb.Append(columns.ToString)";
_sb.Append(_columns.ToString());
 //BA.debugLineNum = 346;BA.debugLine="sb.Append(\") VALUES (\")";
_sb.Append(") VALUES (");
 //BA.debugLineNum = 347;BA.debugLine="sb.Append(values.ToString)";
_sb.Append(_values.ToString());
 //BA.debugLineNum = 348;BA.debugLine="sb.Append(\")\")";
_sb.Append(")");
 //BA.debugLineNum = 349;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 350;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 351;BA.debugLine="m.Put(\"sql\", sb.ToString)";
_m.Put((Object)("sql"),(Object)(_sb.ToString()));
 //BA.debugLineNum = 352;BA.debugLine="m.Put(\"args\", listOfValues)";
_m.Put((Object)("args"),(Object)(_listofvalues.getObject()));
 //BA.debugLineNum = 353;BA.debugLine="m.Put(\"types\", listOfTypes)";
_m.Put((Object)("types"),(Object)(_listoftypes.getObject()));
 //BA.debugLineNum = 354;BA.debugLine="m.Put(\"command\", \"insert\")";
_m.Put((Object)("command"),(Object)("insert"));
 //BA.debugLineNum = 355;BA.debugLine="Dim res As String = Map2Json(m)";
_res = _map2json(_m);
 //BA.debugLineNum = 356;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 357;BA.debugLine="End Sub";
return "";
}
public String  _join(String _delimiter,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
int _i = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _fld = "";
 //BA.debugLineNum = 377;BA.debugLine="private Sub Join(delimiter As String, lst As List)";
 //BA.debugLineNum = 378;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 379;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 380;BA.debugLine="Dim fld As String";
_fld = "";
 //BA.debugLineNum = 381;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 382;BA.debugLine="fld = lst.Get(0)";
_fld = BA.ObjectToString(_lst.Get((int) (0)));
 //BA.debugLineNum = 383;BA.debugLine="sb.Append(fld)";
_sb.Append(_fld);
 //BA.debugLineNum = 384;BA.debugLine="For i = 1 To lst.size - 1";
{
final int step7 = 1;
final int limit7 = (int) (_lst.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
 //BA.debugLineNum = 385;BA.debugLine="Dim fld As String = lst.Get(i)";
_fld = BA.ObjectToString(_lst.Get(_i));
 //BA.debugLineNum = 386;BA.debugLine="sb.Append(delimiter).Append(fld)";
_sb.Append(_delimiter).Append(_fld);
 }
};
 //BA.debugLineNum = 388;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 389;BA.debugLine="End Sub";
return "";
}
public String  _joinfields(String _delimiter,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
int _i = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _fld = "";
 //BA.debugLineNum = 360;BA.debugLine="private Sub JoinFields(delimiter As String, lst As";
 //BA.debugLineNum = 361;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 362;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 363;BA.debugLine="Dim fld As String";
_fld = "";
 //BA.debugLineNum = 364;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 365;BA.debugLine="fld = lst.Get(0)";
_fld = BA.ObjectToString(_lst.Get((int) (0)));
 //BA.debugLineNum = 366;BA.debugLine="fld = EscapeField(fld)";
_fld = _escapefield(_fld);
 //BA.debugLineNum = 367;BA.debugLine="sb.Append(fld)";
_sb.Append(_fld);
 //BA.debugLineNum = 368;BA.debugLine="For i = 1 To lst.size - 1";
{
final int step8 = 1;
final int limit8 = (int) (_lst.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
 //BA.debugLineNum = 369;BA.debugLine="Dim fld As String = lst.Get(i)";
_fld = BA.ObjectToString(_lst.Get(_i));
 //BA.debugLineNum = 370;BA.debugLine="fld = EscapeField(fld)";
_fld = _escapefield(_fld);
 //BA.debugLineNum = 371;BA.debugLine="sb.Append(delimiter).Append(fld)";
_sb.Append(_delimiter).Append(_fld);
 }
};
 //BA.debugLineNum = 373;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 374;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _json2map(String _strjson) throws Exception{
com.ab.banano.BANanoJSONParser _json = null;
anywheresoftware.b4a.objects.collections.Map _map1 = null;
 //BA.debugLineNum = 99;BA.debugLine="Sub Json2Map(strJSON As String) As Map";
 //BA.debugLineNum = 100;BA.debugLine="Dim json As BANanoJSONParser";
_json = new com.ab.banano.BANanoJSONParser();
 //BA.debugLineNum = 101;BA.debugLine="Dim Map1 As Map";
_map1 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 102;BA.debugLine="Map1.Initialize";
_map1.Initialize();
 //BA.debugLineNum = 103;BA.debugLine="Map1.clear";
_map1.Clear();
 //BA.debugLineNum = 104;BA.debugLine="Try";
try { //BA.debugLineNum = 105;BA.debugLine="If strJSON.length > 0 Then";
if (_strjson.length()>0) { 
 //BA.debugLineNum = 106;BA.debugLine="json.Initialize(strJSON)";
_json.Initialize(_strjson);
 //BA.debugLineNum = 107;BA.debugLine="Map1 = json.NextObject";
_map1 = _json.NextObject();
 };
 //BA.debugLineNum = 109;BA.debugLine="Return Map1";
if (true) return _map1;
 } 
       catch (Exception e12) {
			ba.setLastException(e12); //BA.debugLineNum = 111;BA.debugLine="Return Map1";
if (true) return _map1;
 };
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return null;
}
public String  _map2json(anywheresoftware.b4a.objects.collections.Map _mp) throws Exception{
com.ab.banano.BANanoJSONGenerator _json = null;
 //BA.debugLineNum = 116;BA.debugLine="Sub Map2Json(mp As Map) As String";
 //BA.debugLineNum = 117;BA.debugLine="Dim JSON As BANanoJSONGenerator";
_json = new com.ab.banano.BANanoJSONGenerator();
 //BA.debugLineNum = 118;BA.debugLine="JSON.Initialize(mp)";
_json.Initialize(_mp);
 //BA.debugLineNum = 119;BA.debugLine="Return JSON.ToString";
if (true) return _json.ToString();
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return "";
}
public String  _read(String _tblname,String _primarykey,String _primaryvalue) throws Exception{
anywheresoftware.b4a.objects.collections.Map _qw = null;
String _qry = "";
 //BA.debugLineNum = 392;BA.debugLine="Sub Read(tblName As String, primaryKey As String,";
 //BA.debugLineNum = 393;BA.debugLine="Dim qw As Map = CreateMap()";
_qw = new anywheresoftware.b4a.objects.collections.Map();
_qw = __c.createMap(new Object[] {});
 //BA.debugLineNum = 394;BA.debugLine="qw.Put(primaryKey, primaryValue)";
_qw.Put((Object)(_primarykey),(Object)(_primaryvalue));
 //BA.debugLineNum = 395;BA.debugLine="Dim qry As String = SelectWhere(tblName, Array(\"*";
_qry = _selectwhere(_tblname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("*")}),_qw,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_primarykey)}));
 //BA.debugLineNum = 396;BA.debugLine="Return qry";
if (true) return _qry;
 //BA.debugLineNum = 397;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.bananomysql  _resettypes() throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub ResetTypes As BANanoMySQL";
 //BA.debugLineNum = 25;BA.debugLine="recType.Initialize";
_rectype.Initialize();
 //BA.debugLineNum = 26;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.bananomysql)(this);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public String  _selectall(String _tblname,anywheresoftware.b4a.objects.collections.List _tblfields,anywheresoftware.b4a.objects.collections.List _orderby) throws Exception{
String _fld1 = "";
String _selfields = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _stro = "";
anywheresoftware.b4a.objects.collections.Map _m = null;
String _res = "";
 //BA.debugLineNum = 492;BA.debugLine="Sub SelectAll(tblName As String, tblfields As List";
 //BA.debugLineNum = 494;BA.debugLine="Dim fld1 As String = tblfields.Get(0)";
_fld1 = BA.ObjectToString(_tblfields.Get((int) (0)));
 //BA.debugLineNum = 495;BA.debugLine="Dim selFIelds As String = \"\"";
_selfields = "";
 //BA.debugLineNum = 496;BA.debugLine="Select Case fld1";
switch (BA.switchObjectToInt(_fld1,"*")) {
case 0: {
 //BA.debugLineNum = 498;BA.debugLine="selFIelds = \"*\"";
_selfields = "*";
 break; }
default: {
 //BA.debugLineNum = 500;BA.debugLine="selFIelds = JoinFields(\",\", tblfields)";
_selfields = _joinfields(",",_tblfields);
 break; }
}
;
 //BA.debugLineNum = 502;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 503;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 504;BA.debugLine="sb.Append($\"SELECT ${selFIelds} FROM ${EscapeFiel";
_sb.Append(("SELECT "+__c.SmartStringFormatter("",(Object)(_selfields))+" FROM "+__c.SmartStringFormatter("",(Object)(_escapefield(_tblname)))+""));
 //BA.debugLineNum = 505;BA.debugLine="If orderBy <> Null Then";
if (_orderby!= null) { 
 //BA.debugLineNum = 507;BA.debugLine="Dim stro As String = JoinFields(\",\", orderBy)";
_stro = _joinfields(",",_orderby);
 //BA.debugLineNum = 508;BA.debugLine="If stro.Length > 0 Then";
if (_stro.length()>0) { 
 //BA.debugLineNum = 509;BA.debugLine="sb.Append(\" ORDER BY \").Append(stro)";
_sb.Append(" ORDER BY ").Append(_stro);
 };
 };
 //BA.debugLineNum = 512;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 513;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 514;BA.debugLine="m.Put(\"sql\", sb.tostring)";
_m.Put((Object)("sql"),(Object)(_sb.ToString()));
 //BA.debugLineNum = 515;BA.debugLine="m.Put(\"args\", Null)";
_m.Put((Object)("args"),__c.Null);
 //BA.debugLineNum = 516;BA.debugLine="m.Put(\"types\", Null)";
_m.Put((Object)("types"),__c.Null);
 //BA.debugLineNum = 517;BA.debugLine="m.Put(\"command\", \"select\")";
_m.Put((Object)("command"),(Object)("select"));
 //BA.debugLineNum = 518;BA.debugLine="Dim res As String = Map2Json(m)";
_res = _map2json(_m);
 //BA.debugLineNum = 519;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 520;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 408;BA.debugLine="Sub SelectWhere(tblName As String, tblfields As Li";
 //BA.debugLineNum = 409;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblWhere)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = _getmaptypes(_tblwhere);
 //BA.debugLineNum = 410;BA.debugLine="Dim listOfValues As List = GetMapValues(tblWhere)";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = _getmapvalues(_tblwhere);
 //BA.debugLineNum = 412;BA.debugLine="Dim fld1 As String = tblfields.Get(0)";
_fld1 = BA.ObjectToString(_tblfields.Get((int) (0)));
 //BA.debugLineNum = 413;BA.debugLine="Dim selFIelds As String = \"\"";
_selfields = "";
 //BA.debugLineNum = 414;BA.debugLine="Select Case fld1";
switch (BA.switchObjectToInt(_fld1,"*")) {
case 0: {
 //BA.debugLineNum = 416;BA.debugLine="selFIelds = \"*\"";
_selfields = "*";
 break; }
default: {
 //BA.debugLineNum = 418;BA.debugLine="selFIelds = JoinFields(\",\", tblfields)";
_selfields = _joinfields(",",_tblfields);
 break; }
}
;
 //BA.debugLineNum = 420;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 421;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 422;BA.debugLine="sb.Append($\"SELECT ${selFIelds} FROM ${EscapeFiel";
_sb.Append(("SELECT "+__c.SmartStringFormatter("",(Object)(_selfields))+" FROM "+__c.SmartStringFormatter("",(Object)(_escapefield(_tblname)))+" WHERE "));
 //BA.debugLineNum = 423;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 424;BA.debugLine="Dim iWhere As Int = tblWhere.Size - 1";
_iwhere = (int) (_tblwhere.getSize()-1);
 //BA.debugLineNum = 425;BA.debugLine="For i = 0 To iWhere";
{
final int step16 = 1;
final int limit16 = _iwhere;
_i = (int) (0) ;
for (;_i <= limit16 ;_i = _i + step16 ) {
 //BA.debugLineNum = 426;BA.debugLine="If i > 0 Then";
if (_i>0) { 
 //BA.debugLineNum = 427;BA.debugLine="sb.Append(\" AND \")";
_sb.Append(" AND ");
 };
 //BA.debugLineNum = 429;BA.debugLine="Dim col As String = tblWhere.GetKeyAt(i)";
_col = BA.ObjectToString(_tblwhere.GetKeyAt(_i));
 //BA.debugLineNum = 430;BA.debugLine="sb.Append(EscapeField(col))";
_sb.Append(_escapefield(_col));
 //BA.debugLineNum = 431;BA.debugLine="sb.Append(\" = ?\")";
_sb.Append(" = ?");
 }
};
 //BA.debugLineNum = 433;BA.debugLine="If orderBy <> Null Then";
if (_orderby!= null) { 
 //BA.debugLineNum = 435;BA.debugLine="Dim stro As String = JoinFields(\",\", orderBy)";
_stro = _joinfields(",",_orderby);
 //BA.debugLineNum = 436;BA.debugLine="If stro.Length > 0 Then";
if (_stro.length()>0) { 
 //BA.debugLineNum = 437;BA.debugLine="sb.Append(\" ORDER BY \").Append(stro)";
_sb.Append(" ORDER BY ").Append(_stro);
 };
 };
 //BA.debugLineNum = 440;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 441;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 442;BA.debugLine="m.Put(\"sql\", sb.tostring)";
_m.Put((Object)("sql"),(Object)(_sb.ToString()));
 //BA.debugLineNum = 443;BA.debugLine="m.Put(\"args\", listOfValues)";
_m.Put((Object)("args"),(Object)(_listofvalues.getObject()));
 //BA.debugLineNum = 444;BA.debugLine="m.Put(\"types\", listOfTypes)";
_m.Put((Object)("types"),(Object)(_listoftypes.getObject()));
 //BA.debugLineNum = 445;BA.debugLine="m.Put(\"command\", \"selectwhere\")";
_m.Put((Object)("command"),(Object)("selectwhere"));
 //BA.debugLineNum = 446;BA.debugLine="Dim res As String = Map2Json(m)";
_res = _map2json(_m);
 //BA.debugLineNum = 447;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 448;BA.debugLine="End Sub";
return "";
}
public String  _testconnection() throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
String _res = "";
 //BA.debugLineNum = 160;BA.debugLine="Sub TestConnection() As String";
 //BA.debugLineNum = 161;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 162;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 163;BA.debugLine="m.Put(\"sql\", \"\")";
_m.Put((Object)("sql"),(Object)(""));
 //BA.debugLineNum = 164;BA.debugLine="m.Put(\"args\", Null)";
_m.Put((Object)("args"),__c.Null);
 //BA.debugLineNum = 165;BA.debugLine="m.Put(\"types\", Null)";
_m.Put((Object)("types"),__c.Null);
 //BA.debugLineNum = 166;BA.debugLine="m.Put(\"command\", \"connection\")";
_m.Put((Object)("command"),(Object)("connection"));
 //BA.debugLineNum = 167;BA.debugLine="Dim res As String = Map2Json(m)";
_res = _map2json(_m);
 //BA.debugLineNum = 168;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 566;BA.debugLine="Sub UpdateAll(tblName As String, tblFields As Map)";
 //BA.debugLineNum = 567;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblFields)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = _getmaptypes(_tblfields);
 //BA.debugLineNum = 568;BA.debugLine="Dim args As List = GetMapValues(tblFields)";
_args = new anywheresoftware.b4a.objects.collections.List();
_args = _getmapvalues(_tblfields);
 //BA.debugLineNum = 569;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 570;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 571;BA.debugLine="sb.Append($\"UPDATE ${EscapeField(tblName)} SET \"$";
_sb.Append(("UPDATE "+__c.SmartStringFormatter("",(Object)(_escapefield(_tblname)))+" SET "));
 //BA.debugLineNum = 572;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 573;BA.debugLine="Dim iTot As Int = tblFields.Size - 1";
_itot = (int) (_tblfields.getSize()-1);
 //BA.debugLineNum = 574;BA.debugLine="For i = 0 To iTot";
{
final int step8 = 1;
final int limit8 = _itot;
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
 //BA.debugLineNum = 575;BA.debugLine="Dim col As String = tblFields.GetKeyAt(i)";
_col = BA.ObjectToString(_tblfields.GetKeyAt(_i));
 //BA.debugLineNum = 576;BA.debugLine="sb.Append(col)";
_sb.Append(_col);
 //BA.debugLineNum = 577;BA.debugLine="If i <> iTot Then";
if (_i!=_itot) { 
 //BA.debugLineNum = 578;BA.debugLine="sb.Append(\" = ?,\")";
_sb.Append(" = ?,");
 }else {
 //BA.debugLineNum = 580;BA.debugLine="sb.Append(\" = ?\")";
_sb.Append(" = ?");
 };
 }
};
 //BA.debugLineNum = 583;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 584;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 585;BA.debugLine="m.Put(\"sql\", sb.tostring)";
_m.Put((Object)("sql"),(Object)(_sb.ToString()));
 //BA.debugLineNum = 586;BA.debugLine="m.Put(\"args\", args)";
_m.Put((Object)("args"),(Object)(_args.getObject()));
 //BA.debugLineNum = 587;BA.debugLine="m.Put(\"types\", listOfTypes)";
_m.Put((Object)("types"),(Object)(_listoftypes.getObject()));
 //BA.debugLineNum = 588;BA.debugLine="m.Put(\"command\", \"update\")";
_m.Put((Object)("command"),(Object)("update"));
 //BA.debugLineNum = 589;BA.debugLine="Dim res As String = Map2Json(m)";
_res = _map2json(_m);
 //BA.debugLineNum = 590;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 591;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 523;BA.debugLine="Sub UpdateWhere(tblName As String, tblfields As Ma";
 //BA.debugLineNum = 524;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblfields)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = _getmaptypes(_tblfields);
 //BA.debugLineNum = 525;BA.debugLine="Dim listOfTypes1 As List = GetMapTypes(tblWhere)";
_listoftypes1 = new anywheresoftware.b4a.objects.collections.List();
_listoftypes1 = _getmaptypes(_tblwhere);
 //BA.debugLineNum = 526;BA.debugLine="listOfTypes.AddAll(listOfTypes1)";
_listoftypes.AddAll(_listoftypes1);
 //BA.debugLineNum = 527;BA.debugLine="Dim listOfValues As List = GetMapValues(tblfields";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = _getmapvalues(_tblfields);
 //BA.debugLineNum = 528;BA.debugLine="Dim listOfValues1 As List = GetMapValues(tblWhere";
_listofvalues1 = new anywheresoftware.b4a.objects.collections.List();
_listofvalues1 = _getmapvalues(_tblwhere);
 //BA.debugLineNum = 529;BA.debugLine="listOfValues.AddAll(listOfValues1)";
_listofvalues.AddAll(_listofvalues1);
 //BA.debugLineNum = 530;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 531;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 532;BA.debugLine="sb.Append($\"UPDATE ${EscapeField(tblName)} SET \"$";
_sb.Append(("UPDATE "+__c.SmartStringFormatter("",(Object)(_escapefield(_tblname)))+" SET "));
 //BA.debugLineNum = 533;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 534;BA.debugLine="Dim iTot As Int = tblfields.Size - 1";
_itot = (int) (_tblfields.getSize()-1);
 //BA.debugLineNum = 535;BA.debugLine="For i = 0 To iTot";
{
final int step12 = 1;
final int limit12 = _itot;
_i = (int) (0) ;
for (;_i <= limit12 ;_i = _i + step12 ) {
 //BA.debugLineNum = 536;BA.debugLine="Dim col As String = tblfields.GetKeyAt(i)";
_col = BA.ObjectToString(_tblfields.GetKeyAt(_i));
 //BA.debugLineNum = 537;BA.debugLine="sb.Append(EscapeField(col))";
_sb.Append(_escapefield(_col));
 //BA.debugLineNum = 538;BA.debugLine="If i <> iTot Then";
if (_i!=_itot) { 
 //BA.debugLineNum = 539;BA.debugLine="sb.Append(\"= ?,\")";
_sb.Append("= ?,");
 }else {
 //BA.debugLineNum = 541;BA.debugLine="sb.Append(\"= ?\")";
_sb.Append("= ?");
 };
 }
};
 //BA.debugLineNum = 544;BA.debugLine="sb.Append($\" WHERE \"$)";
_sb.Append((" WHERE "));
 //BA.debugLineNum = 545;BA.debugLine="Dim iWhere As Int = tblWhere.Size - 1";
_iwhere = (int) (_tblwhere.getSize()-1);
 //BA.debugLineNum = 546;BA.debugLine="For i = 0 To iWhere";
{
final int step23 = 1;
final int limit23 = _iwhere;
_i = (int) (0) ;
for (;_i <= limit23 ;_i = _i + step23 ) {
 //BA.debugLineNum = 547;BA.debugLine="If i > 0 Then";
if (_i>0) { 
 //BA.debugLineNum = 548;BA.debugLine="sb.Append(\" AND \")";
_sb.Append(" AND ");
 };
 //BA.debugLineNum = 550;BA.debugLine="Dim col As String = tblWhere.GetKeyAt(i)";
_col = BA.ObjectToString(_tblwhere.GetKeyAt(_i));
 //BA.debugLineNum = 551;BA.debugLine="sb.Append(EscapeField(col))";
_sb.Append(_escapefield(_col));
 //BA.debugLineNum = 552;BA.debugLine="sb.Append(\" = ?\")";
_sb.Append(" = ?");
 }
};
 //BA.debugLineNum = 554;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 555;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 556;BA.debugLine="m.Put(\"sql\", sb.tostring)";
_m.Put((Object)("sql"),(Object)(_sb.ToString()));
 //BA.debugLineNum = 557;BA.debugLine="m.Put(\"args\", listOfValues)";
_m.Put((Object)("args"),(Object)(_listofvalues.getObject()));
 //BA.debugLineNum = 558;BA.debugLine="m.Put(\"types\", listOfTypes)";
_m.Put((Object)("types"),(Object)(_listoftypes.getObject()));
 //BA.debugLineNum = 559;BA.debugLine="m.Put(\"command\", \"updatewhere\")";
_m.Put((Object)("command"),(Object)("updatewhere"));
 //BA.debugLineNum = 560;BA.debugLine="Dim res As String = Map2Json(m)";
_res = _map2json(_m);
 //BA.debugLineNum = 561;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 562;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
