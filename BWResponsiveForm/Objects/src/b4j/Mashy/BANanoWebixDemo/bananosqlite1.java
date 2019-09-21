package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class bananosqlite1 extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.bananosqlite1", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.bananosqlite1.class).invoke(this, new Object[] {null});
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
public com.ab.banano.BANano _banano = null;
public String _dbname = "";
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public static class _sqliteresultset1{
public boolean IsInitialized;
public anywheresoftware.b4a.objects.collections.List result;
public String command;
public anywheresoftware.b4a.objects.collections.List types;
public anywheresoftware.b4a.objects.collections.List args;
public String query;
public void Initialize() {
IsInitialized = true;
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
public b4j.Mashy.BANanoWebixDemo.bananosqlite1  _addblobs(anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
String _strfld = "";
 //BA.debugLineNum = 369;BA.debugLine="Sub AddBlobs(fieldNames As List) As BANanoSQLite1";
 //BA.debugLineNum = 370;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 371;BA.debugLine="recType.Put(strfld,\"BLOB\")";
_rectype.Put((Object)(_strfld),(Object)("BLOB"));
 }
};
 //BA.debugLineNum = 373;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.bananosqlite1)(this);
 //BA.debugLineNum = 374;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.bananosqlite1  _addbooleans(anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
String _strfld = "";
 //BA.debugLineNum = 361;BA.debugLine="Sub AddBooleans(fieldNames As List) As BANanoSQLit";
 //BA.debugLineNum = 362;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 363;BA.debugLine="recType.Put(strfld,\"BOOL\")";
_rectype.Put((Object)(_strfld),(Object)("BOOL"));
 }
};
 //BA.debugLineNum = 365;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.bananosqlite1)(this);
 //BA.debugLineNum = 366;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.bananosqlite1  _adddoubles(anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
String _strfld = "";
 //BA.debugLineNum = 353;BA.debugLine="Sub AddDoubles(fieldNames As List) As BANanoSQLite";
 //BA.debugLineNum = 354;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 355;BA.debugLine="recType.Put(strfld,\"DOUBLE\")";
_rectype.Put((Object)(_strfld),(Object)("DOUBLE"));
 }
};
 //BA.debugLineNum = 357;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.bananosqlite1)(this);
 //BA.debugLineNum = 358;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.bananosqlite1  _addintegers(anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
String _strfld = "";
 //BA.debugLineNum = 345;BA.debugLine="Sub AddIntegers(fieldNames As List) As BANanoSQLit";
 //BA.debugLineNum = 346;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 347;BA.debugLine="recType.Put(strfld,\"INT\")";
_rectype.Put((Object)(_strfld),(Object)("INT"));
 }
};
 //BA.debugLineNum = 349;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.bananosqlite1)(this);
 //BA.debugLineNum = 350;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.bananosqlite1  _addstrings(anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
String _strfld = "";
 //BA.debugLineNum = 337;BA.debugLine="Sub AddStrings(fieldNames As List) As BANanoSQLite";
 //BA.debugLineNum = 338;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 339;BA.debugLine="recType.Put(strfld,\"STRING\")";
_rectype.Put((Object)(_strfld),(Object)("STRING"));
 }
};
 //BA.debugLineNum = 341;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.bananosqlite1)(this);
 //BA.debugLineNum = 342;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _build(b4j.Mashy.BANanoWebixDemo.bananosqlite1._sqliteresultset1 _rslt) throws Exception{
anywheresoftware.b4a.objects.collections.Map _b = null;
 //BA.debugLineNum = 586;BA.debugLine="Sub Build(rslt As SQLiteResultSet1) As Map";
 //BA.debugLineNum = 587;BA.debugLine="Dim b As Map = CreateMap()";
_b = new anywheresoftware.b4a.objects.collections.Map();
_b = __c.createMap(new Object[] {});
 //BA.debugLineNum = 588;BA.debugLine="b.Put(\"dbname\", dbName)";
_b.Put((Object)("dbname"),(Object)(_dbname));
 //BA.debugLineNum = 589;BA.debugLine="b.Put(\"command\", rslt.command)";
_b.Put((Object)("command"),(Object)(_rslt.command /*String*/ ));
 //BA.debugLineNum = 590;BA.debugLine="b.Put(\"query\", rslt.query)";
_b.Put((Object)("query"),(Object)(_rslt.query /*String*/ ));
 //BA.debugLineNum = 591;BA.debugLine="b.Put(\"args\", rslt.args)";
_b.Put((Object)("args"),(Object)(_rslt.args /*anywheresoftware.b4a.objects.collections.List*/ .getObject()));
 //BA.debugLineNum = 592;BA.debugLine="b.Put(\"types\", rslt.types)";
_b.Put((Object)("types"),(Object)(_rslt.types /*anywheresoftware.b4a.objects.collections.List*/ .getObject()));
 //BA.debugLineNum = 593;BA.debugLine="Return b";
if (true) return _b;
 //BA.debugLineNum = 594;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 9;BA.debugLine="Public const DB_INT As String = \"INTEGER\"";
_db_int = "INTEGER";
 //BA.debugLineNum = 10;BA.debugLine="Public const DB_INT As String = \"TEXT\"";
_db_int = "TEXT";
 //BA.debugLineNum = 12;BA.debugLine="Private recType As Map";
_rectype = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 13;BA.debugLine="Type SQLiteResultSet1(result As List, command As";
;
 //BA.debugLineNum = 14;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 15;BA.debugLine="Private dbName As String";
_dbname = "";
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.bananosqlite1._sqliteresultset1  _createtable(String _tblname,anywheresoftware.b4a.objects.collections.Map _tblfields,String _pk,String _auto) throws Exception{
String _fldname = "";
String _fldtype = "";
int _fldtot = 0;
int _fldcnt = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _query = "";
b4j.Mashy.BANanoWebixDemo.bananosqlite1._sqliteresultset1 _gr = null;
 //BA.debugLineNum = 382;BA.debugLine="public Sub CreateTable(tblName As String, tblField";
 //BA.debugLineNum = 383;BA.debugLine="Dim fldName As String";
_fldname = "";
 //BA.debugLineNum = 384;BA.debugLine="Dim fldType As String";
_fldtype = "";
 //BA.debugLineNum = 385;BA.debugLine="Dim fldTot As Int";
_fldtot = 0;
 //BA.debugLineNum = 386;BA.debugLine="Dim fldCnt As Int";
_fldcnt = 0;
 //BA.debugLineNum = 387;BA.debugLine="fldTot = tblFields.Size - 1";
_fldtot = (int) (_tblfields.getSize()-1);
 //BA.debugLineNum = 388;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 389;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 390;BA.debugLine="sb.Append(\"(\")";
_sb.Append("(");
 //BA.debugLineNum = 391;BA.debugLine="For fldCnt = 0 To fldTot";
{
final int step9 = 1;
final int limit9 = _fldtot;
_fldcnt = (int) (0) ;
for (;_fldcnt <= limit9 ;_fldcnt = _fldcnt + step9 ) {
 //BA.debugLineNum = 392;BA.debugLine="fldName = tblFields.GetKeyAt(fldCnt)";
_fldname = BA.ObjectToString(_tblfields.GetKeyAt(_fldcnt));
 //BA.debugLineNum = 393;BA.debugLine="fldType = tblFields.Get(fldName)";
_fldtype = BA.ObjectToString(_tblfields.Get((Object)(_fldname)));
 //BA.debugLineNum = 394;BA.debugLine="fldType = fldType.Replace(\"STRING\", \"TEXT\")";
_fldtype = _fldtype.replace("STRING","TEXT");
 //BA.debugLineNum = 395;BA.debugLine="If fldCnt > 0 Then";
if (_fldcnt>0) { 
 //BA.debugLineNum = 396;BA.debugLine="sb.Append(\", \")";
_sb.Append(", ");
 };
 //BA.debugLineNum = 398;BA.debugLine="sb.Append(EscapeField(fldName))";
_sb.Append(_escapefield(_fldname));
 //BA.debugLineNum = 399;BA.debugLine="sb.Append(\" \")";
_sb.Append(" ");
 //BA.debugLineNum = 400;BA.debugLine="sb.Append(fldType)";
_sb.Append(_fldtype);
 //BA.debugLineNum = 401;BA.debugLine="Select Case fldType";
switch (BA.switchObjectToInt(_fldtype,"STRING","TEXT")) {
case 0: 
case 1: {
 //BA.debugLineNum = 403;BA.debugLine="sb.Append(\" COLLATE NOCASE\")";
_sb.Append(" COLLATE NOCASE");
 break; }
}
;
 //BA.debugLineNum = 405;BA.debugLine="If fldName.EqualsIgnoreCase(PK) Then";
if (_fldname.equalsIgnoreCase(_pk)) { 
 //BA.debugLineNum = 406;BA.debugLine="sb.Append(\" PRIMARY KEY\")";
_sb.Append(" PRIMARY KEY");
 };
 //BA.debugLineNum = 408;BA.debugLine="If fldName.EqualsIgnoreCase(Auto) Then";
if (_fldname.equalsIgnoreCase(_auto)) { 
 //BA.debugLineNum = 409;BA.debugLine="sb.Append(\" AUTOINCREMENT\")";
_sb.Append(" AUTOINCREMENT");
 };
 }
};
 //BA.debugLineNum = 412;BA.debugLine="sb.Append(\")\")";
_sb.Append(")");
 //BA.debugLineNum = 414;BA.debugLine="Dim query As String = \"CREATE TABLE IF NOT EXISTS";
_query = "CREATE TABLE IF NOT EXISTS "+_escapefield(_tblname)+" "+_sb.ToString();
 //BA.debugLineNum = 415;BA.debugLine="Dim gr As SQLiteResultSet1";
_gr = new b4j.Mashy.BANanoWebixDemo.bananosqlite1._sqliteresultset1();
 //BA.debugLineNum = 416;BA.debugLine="gr.Initialize";
_gr.Initialize();
 //BA.debugLineNum = 417;BA.debugLine="gr.query = query";
_gr.query /*String*/  = _query;
 //BA.debugLineNum = 418;BA.debugLine="gr.args = Null";
_gr.args /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
 //BA.debugLineNum = 419;BA.debugLine="gr.command = \"createtable\"";
_gr.command /*String*/  = "createtable";
 //BA.debugLineNum = 420;BA.debugLine="gr.types = Null";
_gr.types /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
 //BA.debugLineNum = 421;BA.debugLine="gr.result = Null";
_gr.result /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
 //BA.debugLineNum = 422;BA.debugLine="Return gr";
if (true) return _gr;
 //BA.debugLineNum = 423;BA.debugLine="End Sub";
return null;
}
public String  _cstr(Object _o) throws Exception{
 //BA.debugLineNum = 614;BA.debugLine="Sub CStr(o As Object) As String";
 //BA.debugLineNum = 615;BA.debugLine="Return \"\" & o";
if (true) return ""+BA.ObjectToString(_o);
 //BA.debugLineNum = 616;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.bananosqlite1._sqliteresultset1  _deleteall(String _tblname) throws Exception{
String _sb = "";
b4j.Mashy.BANanoWebixDemo.bananosqlite1._sqliteresultset1 _gr = null;
 //BA.debugLineNum = 74;BA.debugLine="Sub DeleteAll(tblName As String) As SQLiteResultSe";
 //BA.debugLineNum = 75;BA.debugLine="Dim sb As String = $\"DELETE FROM ${EscapeField(tb";
_sb = ("DELETE FROM "+__c.SmartStringFormatter("",(Object)(_escapefield(_tblname)))+"");
 //BA.debugLineNum = 76;BA.debugLine="Dim gr As SQLiteResultSet1";
_gr = new b4j.Mashy.BANanoWebixDemo.bananosqlite1._sqliteresultset1();
 //BA.debugLineNum = 77;BA.debugLine="gr.Initialize";
_gr.Initialize();
 //BA.debugLineNum = 78;BA.debugLine="gr.query = sb";
_gr.query /*String*/  = _sb;
 //BA.debugLineNum = 79;BA.debugLine="gr.args = Null";
_gr.args /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
 //BA.debugLineNum = 80;BA.debugLine="gr.command = \"delete\"";
_gr.command /*String*/  = "delete";
 //BA.debugLineNum = 81;BA.debugLine="gr.types = Null";
_gr.types /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
 //BA.debugLineNum = 82;BA.debugLine="gr.result = Null";
_gr.result /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
 //BA.debugLineNum = 83;BA.debugLine="Return gr";
if (true) return _gr;
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.bananosqlite1._sqliteresultset1  _deletewhere(String _tblname,anywheresoftware.b4a.objects.collections.Map _tblwhere) throws Exception{
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
int _iwhere = 0;
String _col = "";
b4j.Mashy.BANanoWebixDemo.bananosqlite1._sqliteresultset1 _gr = null;
 //BA.debugLineNum = 549;BA.debugLine="Sub DeleteWhere(tblName As String, tblWhere As Map";
 //BA.debugLineNum = 550;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblWhere)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = _getmaptypes(_tblwhere);
 //BA.debugLineNum = 551;BA.debugLine="Dim listOfValues As List = GetMapValues(tblWhere)";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = _getmapvalues(_tblwhere);
 //BA.debugLineNum = 552;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 553;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 554;BA.debugLine="sb.Append($\"DELETE FROM ${EscapeField(tblName)} W";
_sb.Append(("DELETE FROM "+__c.SmartStringFormatter("",(Object)(_escapefield(_tblname)))+" WHERE "));
 //BA.debugLineNum = 555;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 556;BA.debugLine="Dim iWhere As Int = tblWhere.Size - 1";
_iwhere = (int) (_tblwhere.getSize()-1);
 //BA.debugLineNum = 557;BA.debugLine="For i = 0 To iWhere";
{
final int step8 = 1;
final int limit8 = _iwhere;
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
 //BA.debugLineNum = 558;BA.debugLine="If i > 0 Then";
if (_i>0) { 
 //BA.debugLineNum = 559;BA.debugLine="sb.Append(\" AND \")";
_sb.Append(" AND ");
 };
 //BA.debugLineNum = 561;BA.debugLine="Dim col As String = tblWhere.GetKeyAt(i)";
_col = BA.ObjectToString(_tblwhere.GetKeyAt(_i));
 //BA.debugLineNum = 562;BA.debugLine="sb.Append(col)";
_sb.Append(_col);
 //BA.debugLineNum = 563;BA.debugLine="sb.Append(\" = ?\")";
_sb.Append(" = ?");
 }
};
 //BA.debugLineNum = 565;BA.debugLine="Dim gr As SQLiteResultSet1";
_gr = new b4j.Mashy.BANanoWebixDemo.bananosqlite1._sqliteresultset1();
 //BA.debugLineNum = 566;BA.debugLine="gr.Initialize";
_gr.Initialize();
 //BA.debugLineNum = 567;BA.debugLine="gr.query = sb.tostring";
_gr.query /*String*/  = _sb.ToString();
 //BA.debugLineNum = 568;BA.debugLine="gr.args = listOfValues";
_gr.args /*anywheresoftware.b4a.objects.collections.List*/  = _listofvalues;
 //BA.debugLineNum = 569;BA.debugLine="gr.command = \"delete\"";
_gr.command /*String*/  = "delete";
 //BA.debugLineNum = 570;BA.debugLine="gr.types = listOfTypes";
_gr.types /*anywheresoftware.b4a.objects.collections.List*/  = _listoftypes;
 //BA.debugLineNum = 571;BA.debugLine="gr.result = Null";
_gr.result /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
 //BA.debugLineNum = 572;BA.debugLine="Return gr";
if (true) return _gr;
 //BA.debugLineNum = 573;BA.debugLine="End Sub";
return null;
}
public String  _escapefield(String _f) throws Exception{
 //BA.debugLineNum = 377;BA.debugLine="Private Sub EscapeField(f As String) As String";
 //BA.debugLineNum = 378;BA.debugLine="Return $\"[${f}]\"$";
if (true) return ("["+__c.SmartStringFormatter("",(Object)(_f))+"]");
 //BA.debugLineNum = 379;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.bananosqlite1._sqliteresultset1  _execute(String _strsql) throws Exception{
b4j.Mashy.BANanoWebixDemo.bananosqlite1._sqliteresultset1 _gr = null;
 //BA.debugLineNum = 575;BA.debugLine="Sub Execute(strSQL As String) As SQLiteResultSet1";
 //BA.debugLineNum = 576;BA.debugLine="Dim gr As SQLiteResultSet1";
_gr = new b4j.Mashy.BANanoWebixDemo.bananosqlite1._sqliteresultset1();
 //BA.debugLineNum = 577;BA.debugLine="gr.Initialize";
_gr.Initialize();
 //BA.debugLineNum = 578;BA.debugLine="gr.query = strSQL";
_gr.query /*String*/  = _strsql;
 //BA.debugLineNum = 579;BA.debugLine="gr.args = Null";
_gr.args /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
 //BA.debugLineNum = 580;BA.debugLine="gr.command = \"execute\"";
_gr.command /*String*/  = "execute";
 //BA.debugLineNum = 581;BA.debugLine="gr.types = Null";
_gr.types /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
 //BA.debugLineNum = 582;BA.debugLine="gr.result = Null";
_gr.result /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
 //BA.debugLineNum = 583;BA.debugLine="Return gr";
if (true) return _gr;
 //BA.debugLineNum = 584;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.bananosqlite1._sqliteresultset1  _exists(String _tblname,String _primarykey,String _primaryvalue) throws Exception{
anywheresoftware.b4a.objects.collections.Map _qw = null;
b4j.Mashy.BANanoWebixDemo.bananosqlite1._sqliteresultset1 _gr = null;
 //BA.debugLineNum = 186;BA.debugLine="Sub Exists(tblName As String, primaryKey As String";
 //BA.debugLineNum = 187;BA.debugLine="Dim qw As Map = CreateMap()";
_qw = new anywheresoftware.b4a.objects.collections.Map();
_qw = __c.createMap(new Object[] {});
 //BA.debugLineNum = 188;BA.debugLine="qw.Put(primaryKey, primaryValue)";
_qw.Put((Object)(_primarykey),(Object)(_primaryvalue));
 //BA.debugLineNum = 189;BA.debugLine="Dim gr As SQLiteResultSet1 = SelectWhere(tblName,";
_gr = _selectwhere(_tblname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_primarykey)}),_qw,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_primarykey)}));
 //BA.debugLineNum = 190;BA.debugLine="Return gr";
if (true) return _gr;
 //BA.debugLineNum = 191;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.bananosqlite1._sqliteresultset1  _foreignkeys(String _tblname) throws Exception{
String _sb = "";
b4j.Mashy.BANanoWebixDemo.bananosqlite1._sqliteresultset1 _gr = null;
 //BA.debugLineNum = 48;BA.debugLine="Sub ForeignKeys(tblName As String) As SQLiteResult";
 //BA.debugLineNum = 49;BA.debugLine="Dim sb As String = $\"PRAGMA foreign_key_list('${t";
_sb = ("PRAGMA foreign_key_list('"+__c.SmartStringFormatter("",(Object)(_tblname))+"')");
 //BA.debugLineNum = 50;BA.debugLine="Dim gr As SQLiteResultSet1";
_gr = new b4j.Mashy.BANanoWebixDemo.bananosqlite1._sqliteresultset1();
 //BA.debugLineNum = 51;BA.debugLine="gr.Initialize";
_gr.Initialize();
 //BA.debugLineNum = 52;BA.debugLine="gr.query = sb";
_gr.query /*String*/  = _sb;
 //BA.debugLineNum = 53;BA.debugLine="gr.args = Null";
_gr.args /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
 //BA.debugLineNum = 54;BA.debugLine="gr.command = \"foreignkeys\"";
_gr.command /*String*/  = "foreignkeys";
 //BA.debugLineNum = 55;BA.debugLine="gr.types = Null";
_gr.types /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
 //BA.debugLineNum = 56;BA.debugLine="gr.result = Null";
_gr.result /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
 //BA.debugLineNum = 57;BA.debugLine="Return gr";
if (true) return _gr;
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getmapkeys(anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
int _icnt = 0;
int _itot = 0;
String _value = "";
 //BA.debugLineNum = 323;BA.debugLine="private Sub GetMapKeys(sourceMap As Map) As List";
 //BA.debugLineNum = 324;BA.debugLine="Dim listOfValues As List";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 325;BA.debugLine="listOfValues.Initialize";
_listofvalues.Initialize();
 //BA.debugLineNum = 326;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
 //BA.debugLineNum = 327;BA.debugLine="Dim iTot As Int";
_itot = 0;
 //BA.debugLineNum = 328;BA.debugLine="iTot = sourceMap.Size - 1";
_itot = (int) (_sourcemap.getSize()-1);
 //BA.debugLineNum = 329;BA.debugLine="For iCnt = 0 To iTot";
{
final int step6 = 1;
final int limit6 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit6 ;_icnt = _icnt + step6 ) {
 //BA.debugLineNum = 330;BA.debugLine="Dim value As String = sourceMap.GetKeyAt(iCnt)";
_value = BA.ObjectToString(_sourcemap.GetKeyAt(_icnt));
 //BA.debugLineNum = 331;BA.debugLine="listOfValues.Add(value)";
_listofvalues.Add((Object)(_value));
 }
};
 //BA.debugLineNum = 333;BA.debugLine="Return listOfValues";
if (true) return _listofvalues;
 //BA.debugLineNum = 334;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getmaptypes(anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
int _icnt = 0;
int _itot = 0;
String _col = "";
String _coltype = "";
 //BA.debugLineNum = 279;BA.debugLine="private Sub GetMapTypes(sourceMap As Map) As List";
 //BA.debugLineNum = 280;BA.debugLine="Dim listOfTypes As List";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 281;BA.debugLine="listOfTypes.Initialize";
_listoftypes.Initialize();
 //BA.debugLineNum = 282;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
 //BA.debugLineNum = 283;BA.debugLine="Dim iTot As Int";
_itot = 0;
 //BA.debugLineNum = 284;BA.debugLine="iTot = sourceMap.Size - 1";
_itot = (int) (_sourcemap.getSize()-1);
 //BA.debugLineNum = 285;BA.debugLine="For iCnt = 0 To iTot";
{
final int step6 = 1;
final int limit6 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit6 ;_icnt = _icnt + step6 ) {
 //BA.debugLineNum = 286;BA.debugLine="Dim col As String = sourceMap.GetKeyAt(iCnt)";
_col = BA.ObjectToString(_sourcemap.GetKeyAt(_icnt));
 //BA.debugLineNum = 287;BA.debugLine="Dim colType As String = recType.GetDefault(col,\"";
_coltype = BA.ObjectToString(_rectype.GetDefault((Object)(_col),(Object)("STRING")));
 //BA.debugLineNum = 288;BA.debugLine="Select Case colType";
switch (BA.switchObjectToInt(_coltype,"VARCHAR(20)","VARCHAR(10)","VARCHAR(30)","VARCHAR(40)","VARCHAR(50)","VARCHAR(100)","VARCHAR(255)","STRING","VARCHAR","TEXT","DATE","DATETIME","NVARCHAR","INTEGER","INT","BOOL","BOOLEAN","BLOB","REAL","FLOAT","DOUBLE")) {
case 0: 
case 1: 
case 2: 
case 3: {
 //BA.debugLineNum = 290;BA.debugLine="listOfTypes.add(\"s\")";
_listoftypes.Add((Object)("s"));
 break; }
case 4: 
case 5: 
case 6: {
 //BA.debugLineNum = 292;BA.debugLine="listOfTypes.add(\"s\")";
_listoftypes.Add((Object)("s"));
 break; }
case 7: 
case 8: 
case 9: 
case 10: 
case 11: 
case 12: {
 //BA.debugLineNum = 294;BA.debugLine="listOfTypes.add(\"s\")";
_listoftypes.Add((Object)("s"));
 break; }
case 13: 
case 14: 
case 15: 
case 16: {
 //BA.debugLineNum = 296;BA.debugLine="listOfTypes.add(\"i\")";
_listoftypes.Add((Object)("i"));
 break; }
case 17: {
 //BA.debugLineNum = 298;BA.debugLine="listOfTypes.add(\"b\")";
_listoftypes.Add((Object)("b"));
 break; }
case 18: 
case 19: 
case 20: {
 //BA.debugLineNum = 300;BA.debugLine="listOfTypes.add(\"d\")";
_listoftypes.Add((Object)("d"));
 break; }
default: {
 //BA.debugLineNum = 302;BA.debugLine="listOfTypes.add(\"s\")";
_listoftypes.Add((Object)("s"));
 break; }
}
;
 }
};
 //BA.debugLineNum = 305;BA.debugLine="Return listOfTypes";
if (true) return _listoftypes;
 //BA.debugLineNum = 306;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getmapvalues(anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
int _icnt = 0;
int _itot = 0;
String _value = "";
 //BA.debugLineNum = 309;BA.debugLine="private Sub GetMapValues(sourceMap As Map) As List";
 //BA.debugLineNum = 310;BA.debugLine="Dim listOfValues As List";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 311;BA.debugLine="listOfValues.Initialize";
_listofvalues.Initialize();
 //BA.debugLineNum = 312;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
 //BA.debugLineNum = 313;BA.debugLine="Dim iTot As Int";
_itot = 0;
 //BA.debugLineNum = 314;BA.debugLine="iTot = sourceMap.Size - 1";
_itot = (int) (_sourcemap.getSize()-1);
 //BA.debugLineNum = 315;BA.debugLine="For iCnt = 0 To iTot";
{
final int step6 = 1;
final int limit6 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit6 ;_icnt = _icnt + step6 ) {
 //BA.debugLineNum = 316;BA.debugLine="Dim value As String = sourceMap.GetValueAt(iCnt)";
_value = BA.ObjectToString(_sourcemap.GetValueAt(_icnt));
 //BA.debugLineNum = 317;BA.debugLine="listOfValues.Add(value)";
_listofvalues.Add((Object)(_value));
 }
};
 //BA.debugLineNum = 319;BA.debugLine="Return listOfValues";
if (true) return _listofvalues;
 //BA.debugLineNum = 320;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.bananosqlite1._sqliteresultset1  _getmax(String _tblname,String _fldname) throws Exception{
String _sb = "";
b4j.Mashy.BANanoWebixDemo.bananosqlite1._sqliteresultset1 _gr = null;
 //BA.debugLineNum = 87;BA.debugLine="Sub GetMax(tblName As String, fldName As String) A";
 //BA.debugLineNum = 88;BA.debugLine="Dim sb As String = $\"SELECT MAX(${fldName}) As ${";
_sb = ("SELECT MAX("+__c.SmartStringFormatter("",(Object)(_fldname))+") As "+__c.SmartStringFormatter("",(Object)(_fldname))+" FROM "+__c.SmartStringFormatter("",(Object)(_escapefield(_tblname)))+"");
 //BA.debugLineNum = 89;BA.debugLine="Dim gr As SQLiteResultSet1";
_gr = new b4j.Mashy.BANanoWebixDemo.bananosqlite1._sqliteresultset1();
 //BA.debugLineNum = 90;BA.debugLine="gr.Initialize";
_gr.Initialize();
 //BA.debugLineNum = 91;BA.debugLine="gr.query = sb";
_gr.query /*String*/  = _sb;
 //BA.debugLineNum = 92;BA.debugLine="gr.args = Null";
_gr.args /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
 //BA.debugLineNum = 93;BA.debugLine="gr.command = \"getmax\"";
_gr.command /*String*/  = "getmax";
 //BA.debugLineNum = 94;BA.debugLine="gr.types = Null";
_gr.types /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
 //BA.debugLineNum = 95;BA.debugLine="gr.result = Null";
_gr.result /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
 //BA.debugLineNum = 96;BA.debugLine="Return gr";
if (true) return _gr;
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return null;
}
public String  _getnextid(String _fld,anywheresoftware.b4a.objects.collections.List _rsl) throws Exception{
int _nextid = 0;
String _strid = "";
anywheresoftware.b4a.objects.collections.Map _nr = null;
String _ni = "";
 //BA.debugLineNum = 597;BA.debugLine="Sub GetNextID(fld As String, rsl As List) As Strin";
 //BA.debugLineNum = 598;BA.debugLine="Dim nextid As Int";
_nextid = 0;
 //BA.debugLineNum = 599;BA.debugLine="Dim strid As String";
_strid = "";
 //BA.debugLineNum = 601;BA.debugLine="If rsl.Size = 0 Then";
if (_rsl.getSize()==0) { 
 //BA.debugLineNum = 602;BA.debugLine="nextid = 0";
_nextid = (int) (0);
 }else {
 //BA.debugLineNum = 604;BA.debugLine="Dim nr As Map = rsl.Get(0)";
_nr = new anywheresoftware.b4a.objects.collections.Map();
_nr.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_rsl.Get((int) (0))));
 //BA.debugLineNum = 605;BA.debugLine="Dim ni As String = nr.Getdefault(fld,\"0\")";
_ni = BA.ObjectToString(_nr.GetDefault((Object)(_fld),(Object)("0")));
 //BA.debugLineNum = 606;BA.debugLine="nextid = BANano.parseInt(ni)";
_nextid = _banano.parseInt((Object)(_ni));
 };
 //BA.debugLineNum = 608;BA.debugLine="nextid = nextid + 1";
_nextid = (int) (_nextid+1);
 //BA.debugLineNum = 609;BA.debugLine="strid = CStr(nextid)";
_strid = _cstr((Object)(_nextid));
 //BA.debugLineNum = 610;BA.debugLine="Return strid";
if (true) return _strid;
 //BA.debugLineNum = 611;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.bananosqlite1  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 19;BA.debugLine="Public Sub Initialize As BANanoSQLite1";
 //BA.debugLineNum = 20;BA.debugLine="recType.Initialize";
_rectype.Initialize();
 //BA.debugLineNum = 21;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.bananosqlite1)(this);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.bananosqlite1._sqliteresultset1  _insert(String _tblname,anywheresoftware.b4a.objects.collections.Map _tblfields) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _columns = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _values = null;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
int _icnt = 0;
int _itot = 0;
String _col = "";
b4j.Mashy.BANanoWebixDemo.bananosqlite1._sqliteresultset1 _gr = null;
 //BA.debugLineNum = 426;BA.debugLine="Sub Insert(tblName As String, tblFields As Map) As";
 //BA.debugLineNum = 427;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 428;BA.debugLine="Dim columns As StringBuilder";
_columns = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 429;BA.debugLine="Dim values As StringBuilder";
_values = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 430;BA.debugLine="Dim listOfValues As List = GetMapValues(tblFields";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = _getmapvalues(_tblfields);
 //BA.debugLineNum = 431;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblFields)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = _getmaptypes(_tblfields);
 //BA.debugLineNum = 432;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
 //BA.debugLineNum = 433;BA.debugLine="Dim iTot As Int";
_itot = 0;
 //BA.debugLineNum = 434;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 435;BA.debugLine="columns.Initialize";
_columns.Initialize();
 //BA.debugLineNum = 436;BA.debugLine="values.Initialize";
_values.Initialize();
 //BA.debugLineNum = 437;BA.debugLine="sb.Append($\"INSERT INTO ${EscapeField(tblName)} (";
_sb.Append(("INSERT INTO "+__c.SmartStringFormatter("",(Object)(_escapefield(_tblname)))+" ("));
 //BA.debugLineNum = 438;BA.debugLine="iTot = tblFields.Size - 1";
_itot = (int) (_tblfields.getSize()-1);
 //BA.debugLineNum = 439;BA.debugLine="For iCnt = 0 To iTot";
{
final int step13 = 1;
final int limit13 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit13 ;_icnt = _icnt + step13 ) {
 //BA.debugLineNum = 440;BA.debugLine="Dim col As String = tblFields.GetKeyAt(iCnt)";
_col = BA.ObjectToString(_tblfields.GetKeyAt(_icnt));
 //BA.debugLineNum = 441;BA.debugLine="If iCnt > 0 Then";
if (_icnt>0) { 
 //BA.debugLineNum = 442;BA.debugLine="columns.Append(\", \")";
_columns.Append(", ");
 //BA.debugLineNum = 443;BA.debugLine="values.Append(\", \")";
_values.Append(", ");
 };
 //BA.debugLineNum = 445;BA.debugLine="columns.Append(EscapeField(col))";
_columns.Append(_escapefield(_col));
 //BA.debugLineNum = 446;BA.debugLine="values.Append(\"?\")";
_values.Append("?");
 }
};
 //BA.debugLineNum = 448;BA.debugLine="sb.Append(columns.ToString)";
_sb.Append(_columns.ToString());
 //BA.debugLineNum = 449;BA.debugLine="sb.Append(\") VALUES (\")";
_sb.Append(") VALUES (");
 //BA.debugLineNum = 450;BA.debugLine="sb.Append(values.ToString)";
_sb.Append(_values.ToString());
 //BA.debugLineNum = 451;BA.debugLine="sb.Append(\")\")";
_sb.Append(")");
 //BA.debugLineNum = 452;BA.debugLine="Dim gr As SQLiteResultSet1";
_gr = new b4j.Mashy.BANanoWebixDemo.bananosqlite1._sqliteresultset1();
 //BA.debugLineNum = 453;BA.debugLine="gr.Initialize";
_gr.Initialize();
 //BA.debugLineNum = 454;BA.debugLine="gr.query = sb.tostring";
_gr.query /*String*/  = _sb.ToString();
 //BA.debugLineNum = 455;BA.debugLine="gr.args = listOfValues";
_gr.args /*anywheresoftware.b4a.objects.collections.List*/  = _listofvalues;
 //BA.debugLineNum = 456;BA.debugLine="gr.command = \"insert\"";
_gr.command /*String*/  = "insert";
 //BA.debugLineNum = 457;BA.debugLine="gr.types = listOfTypes";
_gr.types /*anywheresoftware.b4a.objects.collections.List*/  = _listoftypes;
 //BA.debugLineNum = 458;BA.debugLine="gr.result = Null";
_gr.result /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
 //BA.debugLineNum = 459;BA.debugLine="Return gr";
if (true) return _gr;
 //BA.debugLineNum = 460;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.bananosqlite1._sqliteresultset1  _insertreplace(String _tblname,anywheresoftware.b4a.objects.collections.Map _tblfields) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _columns = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _values = null;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
int _icnt = 0;
int _itot = 0;
String _col = "";
b4j.Mashy.BANanoWebixDemo.bananosqlite1._sqliteresultset1 _gr = null;
 //BA.debugLineNum = 463;BA.debugLine="Sub InsertReplace(tblName As String, tblFields As";
 //BA.debugLineNum = 464;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 465;BA.debugLine="Dim columns As StringBuilder";
_columns = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 466;BA.debugLine="Dim values As StringBuilder";
_values = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 467;BA.debugLine="Dim listOfValues As List = GetMapValues(tblFields";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = _getmapvalues(_tblfields);
 //BA.debugLineNum = 468;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblFields)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = _getmaptypes(_tblfields);
 //BA.debugLineNum = 469;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
 //BA.debugLineNum = 470;BA.debugLine="Dim iTot As Int";
_itot = 0;
 //BA.debugLineNum = 471;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 472;BA.debugLine="columns.Initialize";
_columns.Initialize();
 //BA.debugLineNum = 473;BA.debugLine="values.Initialize";
_values.Initialize();
 //BA.debugLineNum = 474;BA.debugLine="sb.Append($\"REPLACE INTO ${EscapeField(tblName)}";
_sb.Append(("REPLACE INTO "+__c.SmartStringFormatter("",(Object)(_escapefield(_tblname)))+" ("));
 //BA.debugLineNum = 475;BA.debugLine="iTot = tblFields.Size - 1";
_itot = (int) (_tblfields.getSize()-1);
 //BA.debugLineNum = 476;BA.debugLine="For iCnt = 0 To iTot";
{
final int step13 = 1;
final int limit13 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit13 ;_icnt = _icnt + step13 ) {
 //BA.debugLineNum = 477;BA.debugLine="Dim col As String = tblFields.GetKeyAt(iCnt)";
_col = BA.ObjectToString(_tblfields.GetKeyAt(_icnt));
 //BA.debugLineNum = 478;BA.debugLine="If iCnt > 0 Then";
if (_icnt>0) { 
 //BA.debugLineNum = 479;BA.debugLine="columns.Append(\", \")";
_columns.Append(", ");
 //BA.debugLineNum = 480;BA.debugLine="values.Append(\", \")";
_values.Append(", ");
 };
 //BA.debugLineNum = 482;BA.debugLine="columns.Append(EscapeField(col))";
_columns.Append(_escapefield(_col));
 //BA.debugLineNum = 483;BA.debugLine="values.Append(\"?\")";
_values.Append("?");
 }
};
 //BA.debugLineNum = 485;BA.debugLine="sb.Append(columns.ToString)";
_sb.Append(_columns.ToString());
 //BA.debugLineNum = 486;BA.debugLine="sb.Append(\") VALUES (\")";
_sb.Append(") VALUES (");
 //BA.debugLineNum = 487;BA.debugLine="sb.Append(values.ToString)";
_sb.Append(_values.ToString());
 //BA.debugLineNum = 488;BA.debugLine="sb.Append(\")\")";
_sb.Append(")");
 //BA.debugLineNum = 489;BA.debugLine="Dim gr As SQLiteResultSet1";
_gr = new b4j.Mashy.BANanoWebixDemo.bananosqlite1._sqliteresultset1();
 //BA.debugLineNum = 490;BA.debugLine="gr.Initialize";
_gr.Initialize();
 //BA.debugLineNum = 491;BA.debugLine="gr.query = sb.tostring";
_gr.query /*String*/  = _sb.ToString();
 //BA.debugLineNum = 492;BA.debugLine="gr.args = listOfValues";
_gr.args /*anywheresoftware.b4a.objects.collections.List*/  = _listofvalues;
 //BA.debugLineNum = 493;BA.debugLine="gr.command = \"replace\"";
_gr.command /*String*/  = "replace";
 //BA.debugLineNum = 494;BA.debugLine="gr.types = listOfTypes";
_gr.types /*anywheresoftware.b4a.objects.collections.List*/  = _listoftypes;
 //BA.debugLineNum = 495;BA.debugLine="gr.result = Null";
_gr.result /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
 //BA.debugLineNum = 496;BA.debugLine="Return gr";
if (true) return _gr;
 //BA.debugLineNum = 497;BA.debugLine="End Sub";
return null;
}
public String  _joinfields(String _delimiter,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
int _i = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _fld = "";
 //BA.debugLineNum = 500;BA.debugLine="private Sub JoinFields(delimiter As String, lst As";
 //BA.debugLineNum = 501;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 502;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 503;BA.debugLine="Dim fld As String";
_fld = "";
 //BA.debugLineNum = 504;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 505;BA.debugLine="fld = lst.Get(0)";
_fld = BA.ObjectToString(_lst.Get((int) (0)));
 //BA.debugLineNum = 506;BA.debugLine="fld = EscapeField(fld)";
_fld = _escapefield(_fld);
 //BA.debugLineNum = 507;BA.debugLine="sb.Append(fld)";
_sb.Append(_fld);
 //BA.debugLineNum = 508;BA.debugLine="For i = 1 To lst.size - 1";
{
final int step8 = 1;
final int limit8 = (int) (_lst.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
 //BA.debugLineNum = 509;BA.debugLine="Dim fld As String = lst.Get(i)";
_fld = BA.ObjectToString(_lst.Get(_i));
 //BA.debugLineNum = 510;BA.debugLine="fld = EscapeField(fld)";
_fld = _escapefield(_fld);
 //BA.debugLineNum = 511;BA.debugLine="sb.Append(delimiter).Append(fld)";
_sb.Append(_delimiter).Append(_fld);
 }
};
 //BA.debugLineNum = 513;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 514;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _json2list(String _strvalue) throws Exception{
anywheresoftware.b4a.objects.collections.List _lst = null;
com.ab.banano.BANanoJSONParser _parser = null;
 //BA.debugLineNum = 132;BA.debugLine="Sub Json2List(strValue As String) As List";
 //BA.debugLineNum = 133;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 134;BA.debugLine="lst.Initialize";
_lst.Initialize();
 //BA.debugLineNum = 135;BA.debugLine="lst.clear";
_lst.Clear();
 //BA.debugLineNum = 136;BA.debugLine="If strValue.Length = 0 Then";
if (_strvalue.length()==0) { 
 //BA.debugLineNum = 137;BA.debugLine="Return lst";
if (true) return _lst;
 };
 //BA.debugLineNum = 139;BA.debugLine="Try";
try { //BA.debugLineNum = 140;BA.debugLine="Dim parser As BANanoJSONParser";
_parser = new com.ab.banano.BANanoJSONParser();
 //BA.debugLineNum = 141;BA.debugLine="parser.Initialize(strValue)";
_parser.Initialize(_strvalue);
 //BA.debugLineNum = 142;BA.debugLine="Return parser.NextArray";
if (true) return _parser.NextArray();
 } 
       catch (Exception e12) {
			ba.setLastException(e12); //BA.debugLineNum = 144;BA.debugLine="Return lst";
if (true) return _lst;
 };
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _json2map(String _strjson) throws Exception{
com.ab.banano.BANanoJSONParser _json = null;
anywheresoftware.b4a.objects.collections.Map _map1 = null;
 //BA.debugLineNum = 115;BA.debugLine="Sub Json2Map(strJSON As String) As Map";
 //BA.debugLineNum = 116;BA.debugLine="Dim json As BANanoJSONParser";
_json = new com.ab.banano.BANanoJSONParser();
 //BA.debugLineNum = 117;BA.debugLine="Dim Map1 As Map";
_map1 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 118;BA.debugLine="Map1.Initialize";
_map1.Initialize();
 //BA.debugLineNum = 119;BA.debugLine="Map1.clear";
_map1.Clear();
 //BA.debugLineNum = 120;BA.debugLine="Try";
try { //BA.debugLineNum = 121;BA.debugLine="If strJSON.length > 0 Then";
if (_strjson.length()>0) { 
 //BA.debugLineNum = 122;BA.debugLine="json.Initialize(strJSON)";
_json.Initialize(_strjson);
 //BA.debugLineNum = 123;BA.debugLine="Map1 = json.NextObject";
_map1 = _json.NextObject();
 };
 //BA.debugLineNum = 125;BA.debugLine="Return Map1";
if (true) return _map1;
 } 
       catch (Exception e12) {
			ba.setLastException(e12); //BA.debugLineNum = 127;BA.debugLine="Return Map1";
if (true) return _map1;
 };
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return null;
}
public String  _list2json(anywheresoftware.b4a.objects.collections.List _mp) throws Exception{
com.ab.banano.BANanoJSONGenerator _json = null;
 //BA.debugLineNum = 107;BA.debugLine="Sub List2Json(mp As List) As String";
 //BA.debugLineNum = 108;BA.debugLine="Dim JSON As BANanoJSONGenerator";
_json = new com.ab.banano.BANanoJSONGenerator();
 //BA.debugLineNum = 109;BA.debugLine="JSON.Initialize2(mp)";
_json.Initialize2(_mp);
 //BA.debugLineNum = 110;BA.debugLine="Return JSON.ToString";
if (true) return _json.ToString();
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return "";
}
public String  _map2json(anywheresoftware.b4a.objects.collections.Map _mp) throws Exception{
com.ab.banano.BANanoJSONGenerator _json = null;
 //BA.debugLineNum = 100;BA.debugLine="Sub Map2Json(mp As Map) As String";
 //BA.debugLineNum = 101;BA.debugLine="Dim JSON As BANanoJSONGenerator";
_json = new com.ab.banano.BANanoJSONGenerator();
 //BA.debugLineNum = 102;BA.debugLine="JSON.Initialize(mp)";
_json.Initialize(_mp);
 //BA.debugLineNum = 103;BA.debugLine="Return JSON.ToString";
if (true) return _json.ToString();
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.bananosqlite1._sqliteresultset1  _pragma(String _tblname) throws Exception{
String _sb = "";
b4j.Mashy.BANanoWebixDemo.bananosqlite1._sqliteresultset1 _gr = null;
 //BA.debugLineNum = 35;BA.debugLine="Sub Pragma(tblName As String) As SQLiteResultSet1";
 //BA.debugLineNum = 36;BA.debugLine="Dim sb As String = $\"PRAGMA table_info('${tblName";
_sb = ("PRAGMA table_info('"+__c.SmartStringFormatter("",(Object)(_tblname))+"')");
 //BA.debugLineNum = 37;BA.debugLine="Dim gr As SQLiteResultSet1";
_gr = new b4j.Mashy.BANanoWebixDemo.bananosqlite1._sqliteresultset1();
 //BA.debugLineNum = 38;BA.debugLine="gr.Initialize";
_gr.Initialize();
 //BA.debugLineNum = 39;BA.debugLine="gr.query = sb";
_gr.query /*String*/  = _sb;
 //BA.debugLineNum = 40;BA.debugLine="gr.args = Null";
_gr.args /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
 //BA.debugLineNum = 41;BA.debugLine="gr.command = \"pragma\"";
_gr.command /*String*/  = "pragma";
 //BA.debugLineNum = 42;BA.debugLine="gr.types = Null";
_gr.types /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
 //BA.debugLineNum = 43;BA.debugLine="gr.result = Null";
_gr.result /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
 //BA.debugLineNum = 44;BA.debugLine="Return gr";
if (true) return _gr;
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.bananosqlite1._sqliteresultset1  _read(String _tblname,String _primarykey,String _primaryvalue) throws Exception{
anywheresoftware.b4a.objects.collections.Map _qw = null;
b4j.Mashy.BANanoWebixDemo.bananosqlite1._sqliteresultset1 _gr = null;
 //BA.debugLineNum = 177;BA.debugLine="Sub Read(tblName As String, primaryKey As String,";
 //BA.debugLineNum = 178;BA.debugLine="Dim qw As Map = CreateMap()";
_qw = new anywheresoftware.b4a.objects.collections.Map();
_qw = __c.createMap(new Object[] {});
 //BA.debugLineNum = 179;BA.debugLine="qw.Put(primaryKey, primaryValue)";
_qw.Put((Object)(_primarykey),(Object)(_primaryvalue));
 //BA.debugLineNum = 180;BA.debugLine="Dim gr As SQLiteResultSet1 = SelectWhere(tblName,";
_gr = _selectwhere(_tblname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("*")}),_qw,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_primarykey)}));
 //BA.debugLineNum = 181;BA.debugLine="Return gr";
if (true) return _gr;
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.bananosqlite1  _resettypes() throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Sub ResetTypes As BANanoSQLite1";
 //BA.debugLineNum = 30;BA.debugLine="recType.Initialize";
_rectype.Initialize();
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.bananosqlite1)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.bananosqlite1._sqliteresultset1  _selectall(String _tblname,anywheresoftware.b4a.objects.collections.List _tblfields,anywheresoftware.b4a.objects.collections.List _orderby) throws Exception{
String _fld1 = "";
String _selfields = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _stro = "";
b4j.Mashy.BANanoWebixDemo.bananosqlite1._sqliteresultset1 _gr = null;
 //BA.debugLineNum = 518;BA.debugLine="Sub SelectAll(tblName As String, tblfields As List";
 //BA.debugLineNum = 520;BA.debugLine="Dim fld1 As String = tblfields.Get(0)";
_fld1 = BA.ObjectToString(_tblfields.Get((int) (0)));
 //BA.debugLineNum = 521;BA.debugLine="Dim selFIelds As String = \"\"";
_selfields = "";
 //BA.debugLineNum = 522;BA.debugLine="Select Case fld1";
switch (BA.switchObjectToInt(_fld1,"*")) {
case 0: {
 //BA.debugLineNum = 524;BA.debugLine="selFIelds = \"*\"";
_selfields = "*";
 break; }
default: {
 //BA.debugLineNum = 526;BA.debugLine="selFIelds = JoinFields(\",\", tblfields)";
_selfields = _joinfields(",",_tblfields);
 break; }
}
;
 //BA.debugLineNum = 528;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 529;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 530;BA.debugLine="sb.Append($\"SELECT ${selFIelds} FROM ${EscapeFiel";
_sb.Append(("SELECT "+__c.SmartStringFormatter("",(Object)(_selfields))+" FROM "+__c.SmartStringFormatter("",(Object)(_escapefield(_tblname)))+""));
 //BA.debugLineNum = 531;BA.debugLine="If orderBy <> Null Then";
if (_orderby!= null) { 
 //BA.debugLineNum = 533;BA.debugLine="Dim stro As String = JoinFields(\",\", orderBy)";
_stro = _joinfields(",",_orderby);
 //BA.debugLineNum = 534;BA.debugLine="If stro.Length > 0 Then";
if (_stro.length()>0) { 
 //BA.debugLineNum = 535;BA.debugLine="sb.Append(\" ORDER BY \").Append(stro)";
_sb.Append(" ORDER BY ").Append(_stro);
 };
 };
 //BA.debugLineNum = 538;BA.debugLine="Dim gr As SQLiteResultSet1";
_gr = new b4j.Mashy.BANanoWebixDemo.bananosqlite1._sqliteresultset1();
 //BA.debugLineNum = 539;BA.debugLine="gr.Initialize";
_gr.Initialize();
 //BA.debugLineNum = 540;BA.debugLine="gr.query = sb.tostring";
_gr.query /*String*/  = _sb.ToString();
 //BA.debugLineNum = 541;BA.debugLine="gr.args = Null";
_gr.args /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
 //BA.debugLineNum = 542;BA.debugLine="gr.command = \"select\"";
_gr.command /*String*/  = "select";
 //BA.debugLineNum = 543;BA.debugLine="gr.types = Null";
_gr.types /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
 //BA.debugLineNum = 544;BA.debugLine="gr.result = Null";
_gr.result /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
 //BA.debugLineNum = 545;BA.debugLine="Return gr";
if (true) return _gr;
 //BA.debugLineNum = 546;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.bananosqlite1._sqliteresultset1  _selectwhere(String _tblname,anywheresoftware.b4a.objects.collections.List _tblfields,anywheresoftware.b4a.objects.collections.Map _tblwhere,anywheresoftware.b4a.objects.collections.List _orderby) throws Exception{
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
String _fld1 = "";
String _selfields = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
int _iwhere = 0;
String _col = "";
String _stro = "";
b4j.Mashy.BANanoWebixDemo.bananosqlite1._sqliteresultset1 _gr = null;
 //BA.debugLineNum = 194;BA.debugLine="Sub SelectWhere(tblName As String, tblfields As Li";
 //BA.debugLineNum = 195;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblWhere)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = _getmaptypes(_tblwhere);
 //BA.debugLineNum = 196;BA.debugLine="Dim listOfValues As List = GetMapValues(tblWhere)";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = _getmapvalues(_tblwhere);
 //BA.debugLineNum = 198;BA.debugLine="Dim fld1 As String = tblfields.Get(0)";
_fld1 = BA.ObjectToString(_tblfields.Get((int) (0)));
 //BA.debugLineNum = 199;BA.debugLine="Dim selFIelds As String = \"\"";
_selfields = "";
 //BA.debugLineNum = 200;BA.debugLine="Select Case fld1";
switch (BA.switchObjectToInt(_fld1,"*")) {
case 0: {
 //BA.debugLineNum = 202;BA.debugLine="selFIelds = \"*\"";
_selfields = "*";
 break; }
default: {
 //BA.debugLineNum = 204;BA.debugLine="selFIelds = JoinFields(\",\", tblfields)";
_selfields = _joinfields(",",_tblfields);
 break; }
}
;
 //BA.debugLineNum = 206;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 207;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 208;BA.debugLine="sb.Append($\"SELECT ${selFIelds} FROM ${EscapeFiel";
_sb.Append(("SELECT "+__c.SmartStringFormatter("",(Object)(_selfields))+" FROM "+__c.SmartStringFormatter("",(Object)(_escapefield(_tblname)))+" WHERE "));
 //BA.debugLineNum = 209;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 210;BA.debugLine="Dim iWhere As Int = tblWhere.Size - 1";
_iwhere = (int) (_tblwhere.getSize()-1);
 //BA.debugLineNum = 211;BA.debugLine="For i = 0 To iWhere";
{
final int step16 = 1;
final int limit16 = _iwhere;
_i = (int) (0) ;
for (;_i <= limit16 ;_i = _i + step16 ) {
 //BA.debugLineNum = 212;BA.debugLine="If i > 0 Then";
if (_i>0) { 
 //BA.debugLineNum = 213;BA.debugLine="sb.Append(\" AND \")";
_sb.Append(" AND ");
 };
 //BA.debugLineNum = 215;BA.debugLine="Dim col As String = tblWhere.GetKeyAt(i)";
_col = BA.ObjectToString(_tblwhere.GetKeyAt(_i));
 //BA.debugLineNum = 216;BA.debugLine="sb.Append(col)";
_sb.Append(_col);
 //BA.debugLineNum = 217;BA.debugLine="sb.Append(\" = ?\")";
_sb.Append(" = ?");
 }
};
 //BA.debugLineNum = 219;BA.debugLine="If orderBy <> Null Then";
if (_orderby!= null) { 
 //BA.debugLineNum = 221;BA.debugLine="Dim stro As String = JoinFields(\",\", orderBy)";
_stro = _joinfields(",",_orderby);
 //BA.debugLineNum = 222;BA.debugLine="If stro.Length > 0 Then";
if (_stro.length()>0) { 
 //BA.debugLineNum = 223;BA.debugLine="sb.Append(\" ORDER BY \").Append(stro)";
_sb.Append(" ORDER BY ").Append(_stro);
 };
 };
 //BA.debugLineNum = 226;BA.debugLine="Dim gr As SQLiteResultSet1";
_gr = new b4j.Mashy.BANanoWebixDemo.bananosqlite1._sqliteresultset1();
 //BA.debugLineNum = 227;BA.debugLine="gr.Initialize";
_gr.Initialize();
 //BA.debugLineNum = 228;BA.debugLine="gr.query = sb.tostring";
_gr.query /*String*/  = _sb.ToString();
 //BA.debugLineNum = 229;BA.debugLine="gr.args = listOfValues";
_gr.args /*anywheresoftware.b4a.objects.collections.List*/  = _listofvalues;
 //BA.debugLineNum = 230;BA.debugLine="gr.command = \"select\"";
_gr.command /*String*/  = "select";
 //BA.debugLineNum = 231;BA.debugLine="gr.types = listOfTypes";
_gr.types /*anywheresoftware.b4a.objects.collections.List*/  = _listoftypes;
 //BA.debugLineNum = 232;BA.debugLine="gr.result = Null";
_gr.result /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
 //BA.debugLineNum = 233;BA.debugLine="Return gr";
if (true) return _gr;
 //BA.debugLineNum = 234;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.bananosqlite1  _setdb(String _db) throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub SetDB(db As String) As BANanoSQLite1";
 //BA.debugLineNum = 25;BA.debugLine="dbName = db";
_dbname = _db;
 //BA.debugLineNum = 26;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.bananosqlite1)(this);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.bananosqlite1._sqliteresultset1  _tablenames() throws Exception{
String _sb = "";
b4j.Mashy.BANanoWebixDemo.bananosqlite1._sqliteresultset1 _gr = null;
 //BA.debugLineNum = 61;BA.debugLine="Sub TableNames() As SQLiteResultSet1";
 //BA.debugLineNum = 62;BA.debugLine="Dim sb As String = $\"SELECT name FROM sqlite_mast";
_sb = ("SELECT name FROM sqlite_master WHERE type ='table' AND name NOT LIKE 'sqlite_%'");
 //BA.debugLineNum = 63;BA.debugLine="Dim gr As SQLiteResultSet1";
_gr = new b4j.Mashy.BANanoWebixDemo.bananosqlite1._sqliteresultset1();
 //BA.debugLineNum = 64;BA.debugLine="gr.Initialize";
_gr.Initialize();
 //BA.debugLineNum = 65;BA.debugLine="gr.query = sb";
_gr.query /*String*/  = _sb;
 //BA.debugLineNum = 66;BA.debugLine="gr.args = Null";
_gr.args /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
 //BA.debugLineNum = 67;BA.debugLine="gr.command = \"tables\"";
_gr.command /*String*/  = "tables";
 //BA.debugLineNum = 68;BA.debugLine="gr.types = Null";
_gr.types /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
 //BA.debugLineNum = 69;BA.debugLine="gr.result = Null";
_gr.result /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
 //BA.debugLineNum = 70;BA.debugLine="Return gr";
if (true) return _gr;
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.bananosqlite1._sqliteresultset1  _updateall(String _tblname,anywheresoftware.b4a.objects.collections.Map _tblfields) throws Exception{
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
anywheresoftware.b4a.objects.collections.List _args = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
int _itot = 0;
String _col = "";
b4j.Mashy.BANanoWebixDemo.bananosqlite1._sqliteresultset1 _gr = null;
 //BA.debugLineNum = 149;BA.debugLine="Sub UpdateAll(tblName As String, tblFields As Map)";
 //BA.debugLineNum = 150;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblFields)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = _getmaptypes(_tblfields);
 //BA.debugLineNum = 151;BA.debugLine="Dim args As List = GetMapValues(tblFields)";
_args = new anywheresoftware.b4a.objects.collections.List();
_args = _getmapvalues(_tblfields);
 //BA.debugLineNum = 152;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 153;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 154;BA.debugLine="sb.Append($\"UPDATE ${EscapeField(tblName)} SET \"$";
_sb.Append(("UPDATE "+__c.SmartStringFormatter("",(Object)(_escapefield(_tblname)))+" SET "));
 //BA.debugLineNum = 155;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 156;BA.debugLine="Dim iTot As Int = tblFields.Size - 1";
_itot = (int) (_tblfields.getSize()-1);
 //BA.debugLineNum = 157;BA.debugLine="For i = 0 To iTot";
{
final int step8 = 1;
final int limit8 = _itot;
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
 //BA.debugLineNum = 158;BA.debugLine="Dim col As String = tblFields.GetKeyAt(i)";
_col = BA.ObjectToString(_tblfields.GetKeyAt(_i));
 //BA.debugLineNum = 159;BA.debugLine="sb.Append(col)";
_sb.Append(_col);
 //BA.debugLineNum = 160;BA.debugLine="If i <> iTot Then";
if (_i!=_itot) { 
 //BA.debugLineNum = 161;BA.debugLine="sb.Append(\" = ?,\")";
_sb.Append(" = ?,");
 }else {
 //BA.debugLineNum = 163;BA.debugLine="sb.Append(\" = ?\")";
_sb.Append(" = ?");
 };
 }
};
 //BA.debugLineNum = 166;BA.debugLine="Dim gr As SQLiteResultSet1";
_gr = new b4j.Mashy.BANanoWebixDemo.bananosqlite1._sqliteresultset1();
 //BA.debugLineNum = 167;BA.debugLine="gr.Initialize";
_gr.Initialize();
 //BA.debugLineNum = 168;BA.debugLine="gr.query = sb.tostring";
_gr.query /*String*/  = _sb.ToString();
 //BA.debugLineNum = 169;BA.debugLine="gr.args = args";
_gr.args /*anywheresoftware.b4a.objects.collections.List*/  = _args;
 //BA.debugLineNum = 170;BA.debugLine="gr.command = \"update\"";
_gr.command /*String*/  = "update";
 //BA.debugLineNum = 171;BA.debugLine="gr.types = listOfTypes";
_gr.types /*anywheresoftware.b4a.objects.collections.List*/  = _listoftypes;
 //BA.debugLineNum = 172;BA.debugLine="gr.result = Null";
_gr.result /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
 //BA.debugLineNum = 173;BA.debugLine="Return gr";
if (true) return _gr;
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.bananosqlite1._sqliteresultset1  _updatewhere(String _tblname,anywheresoftware.b4a.objects.collections.Map _tblfields,anywheresoftware.b4a.objects.collections.Map _tblwhere) throws Exception{
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
anywheresoftware.b4a.objects.collections.List _listoftypes1 = null;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
anywheresoftware.b4a.objects.collections.List _listofvalues1 = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
int _itot = 0;
String _col = "";
int _iwhere = 0;
b4j.Mashy.BANanoWebixDemo.bananosqlite1._sqliteresultset1 _gr = null;
 //BA.debugLineNum = 237;BA.debugLine="Sub UpdateWhere(tblName As String, tblfields As Ma";
 //BA.debugLineNum = 238;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblfields)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = _getmaptypes(_tblfields);
 //BA.debugLineNum = 239;BA.debugLine="Dim listOfTypes1 As List = GetMapTypes(tblWhere)";
_listoftypes1 = new anywheresoftware.b4a.objects.collections.List();
_listoftypes1 = _getmaptypes(_tblwhere);
 //BA.debugLineNum = 240;BA.debugLine="listOfTypes.AddAll(listOfTypes1)";
_listoftypes.AddAll(_listoftypes1);
 //BA.debugLineNum = 241;BA.debugLine="Dim listOfValues As List = GetMapValues(tblfields";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = _getmapvalues(_tblfields);
 //BA.debugLineNum = 242;BA.debugLine="Dim listOfValues1 As List = GetMapValues(tblWhere";
_listofvalues1 = new anywheresoftware.b4a.objects.collections.List();
_listofvalues1 = _getmapvalues(_tblwhere);
 //BA.debugLineNum = 243;BA.debugLine="listOfValues.AddAll(listOfValues1)";
_listofvalues.AddAll(_listofvalues1);
 //BA.debugLineNum = 244;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 245;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 246;BA.debugLine="sb.Append($\"UPDATE ${EscapeField(tblName)} SET \"$";
_sb.Append(("UPDATE "+__c.SmartStringFormatter("",(Object)(_escapefield(_tblname)))+" SET "));
 //BA.debugLineNum = 247;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 248;BA.debugLine="Dim iTot As Int = tblfields.Size - 1";
_itot = (int) (_tblfields.getSize()-1);
 //BA.debugLineNum = 249;BA.debugLine="For i = 0 To iTot";
{
final int step12 = 1;
final int limit12 = _itot;
_i = (int) (0) ;
for (;_i <= limit12 ;_i = _i + step12 ) {
 //BA.debugLineNum = 250;BA.debugLine="Dim col As String = tblfields.GetKeyAt(i)";
_col = BA.ObjectToString(_tblfields.GetKeyAt(_i));
 //BA.debugLineNum = 251;BA.debugLine="sb.Append(EscapeField(col))";
_sb.Append(_escapefield(_col));
 //BA.debugLineNum = 252;BA.debugLine="If i <> iTot Then";
if (_i!=_itot) { 
 //BA.debugLineNum = 253;BA.debugLine="sb.Append(\"= ?,\")";
_sb.Append("= ?,");
 }else {
 //BA.debugLineNum = 255;BA.debugLine="sb.Append(\"= ?\")";
_sb.Append("= ?");
 };
 }
};
 //BA.debugLineNum = 258;BA.debugLine="sb.Append($\" WHERE \"$)";
_sb.Append((" WHERE "));
 //BA.debugLineNum = 259;BA.debugLine="Dim iWhere As Int = tblWhere.Size - 1";
_iwhere = (int) (_tblwhere.getSize()-1);
 //BA.debugLineNum = 260;BA.debugLine="For i = 0 To iWhere";
{
final int step23 = 1;
final int limit23 = _iwhere;
_i = (int) (0) ;
for (;_i <= limit23 ;_i = _i + step23 ) {
 //BA.debugLineNum = 261;BA.debugLine="If i > 0 Then";
if (_i>0) { 
 //BA.debugLineNum = 262;BA.debugLine="sb.Append(\" AND \")";
_sb.Append(" AND ");
 };
 //BA.debugLineNum = 264;BA.debugLine="Dim col As String = tblWhere.GetKeyAt(i)";
_col = BA.ObjectToString(_tblwhere.GetKeyAt(_i));
 //BA.debugLineNum = 265;BA.debugLine="sb.Append(EscapeField(col))";
_sb.Append(_escapefield(_col));
 //BA.debugLineNum = 266;BA.debugLine="sb.Append(\" = ?\")";
_sb.Append(" = ?");
 }
};
 //BA.debugLineNum = 268;BA.debugLine="Dim gr As SQLiteResultSet1";
_gr = new b4j.Mashy.BANanoWebixDemo.bananosqlite1._sqliteresultset1();
 //BA.debugLineNum = 269;BA.debugLine="gr.Initialize";
_gr.Initialize();
 //BA.debugLineNum = 270;BA.debugLine="gr.query = sb.tostring";
_gr.query /*String*/  = _sb.ToString();
 //BA.debugLineNum = 271;BA.debugLine="gr.args = listOfValues";
_gr.args /*anywheresoftware.b4a.objects.collections.List*/  = _listofvalues;
 //BA.debugLineNum = 272;BA.debugLine="gr.command = \"update\"";
_gr.command /*String*/  = "update";
 //BA.debugLineNum = 273;BA.debugLine="gr.types = listOfTypes";
_gr.types /*anywheresoftware.b4a.objects.collections.List*/  = _listoftypes;
 //BA.debugLineNum = 274;BA.debugLine="gr.result = Null";
_gr.result /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
 //BA.debugLineNum = 275;BA.debugLine="Return gr";
if (true) return _gr;
 //BA.debugLineNum = 276;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
