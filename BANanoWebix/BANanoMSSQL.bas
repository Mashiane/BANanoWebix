B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Private recType As Map
	Public DB_STRING As String = "TEXT"
	Public DB_INT As String = "INT"
	Public DB_FLOAT As String = "FLOAT"
	Public DB_BLOB As String = "BLOB"
	Public DB_BOOL As String = "BOOL"
	Public DB_REAL As String = "REAL"
	Public DB_DATE As String = "DATE"
	Type MSSQLResultSet(result As List, command As String, types As List, args As List, query As String)
	Private BANano As BANano   'ignore
	Public MethodName As String
End Sub

'used when creating a new query
Sub ResetTypes As BANanoMSSQL
	recType.Initialize
	Return Me
End Sub

'return a sql to get the max value of a particular field
Sub GetMax(tblName As String, fldName As String) As MSSQLResultSet
	Dim sb As String = $"SELECT MAX(${fldName}) As ${fldName} FROM ${EscapeField(tblName)}"$
	Dim m As MSSQLResultSet
	m.Initialize
	m.query = sb
	m.args = Null
	m.types = Null
	m.command = "getmax"
	Return m
End Sub

'get the nextid from a field returned with GetMax
Sub GetNextID(fld As String, rsl As List) As String
	Dim nextid As Int
	Dim strid As String
	
	If rsl.Size = 0 Then
		nextid = 0
	Else
		Dim nr As Map = rsl.Get(0)
		Dim ni As String = nr.GetDefault(fld,"0")
		nextid = BANano.parseInt(ni)
	End If
	nextid = nextid + 1
	strid = CStr(nextid)
	Return strid
End Sub

'convert object to string
private Sub CStr(o As Object) As String
	Return "" & o
End Sub

'initialize the class and pass the PHP sub name to call
Sub Initialize() As BANanoMSSQL
	recType.Initialize
	MethodName = "BANanoMSSQL"
	Return Me
End Sub

'convert a json string to a map
private Sub Json2Map(strJSON As String) As Map
	Dim json As BANanoJSONParser
	Dim Map1 As Map
	Map1.Initialize
	Map1.clear
	Try
		If strJSON.length > 0 Then
			json.Initialize(strJSON)
			Map1 = json.NextObject
		End If
		Return Map1
	Catch
		Return Map1
	End Try
End Sub

'convert a map to a json string using BANanoJSONGenerator
private Sub Map2Json(mp As Map) As String
	Dim json As BANanoJSONGenerator
	json.Initialize(mp)
	Return json.ToString
End Sub

'specify strings field types, this is default for all strings
Sub AddStrings(fieldNames As List) As BANanoMSSQL
	For Each strfld As String In fieldNames
		recType.Put(strfld,"STRING")
	Next
	Return Me
End Sub

'specify integer field types
Sub AddIntegers(fieldNames As List) As BANanoMSSQL
	For Each strfld As String In fieldNames
		recType.Put(strfld,"INT")
	Next
	Return Me
End Sub

'specify double field types
Sub AddDoubles(fieldNames As List) As BANanoMSSQL
	For Each strfld As String In fieldNames
		recType.Put(strfld,"DOUBLE")
	Next
	Return Me
End Sub

'specify blob field types
Sub AddBlobs(fieldNames As List) As BANanoMSSQL
	For Each strfld As String In fieldNames
		recType.Put(strfld,"BLOB")
	Next
	Return Me
End Sub

'escape fields with []
Private Sub EscapeField(f As String) As String
	Return $"[${f}]"$
End Sub

'execute own query
Sub Execute(strSQL As String) As MSSQLResultSet
	Dim m As MSSQLResultSet
	m.Initialize
	m.query = strSQL
	m.args = Null
	m.types = Null
	m.command = "execute"
	Return m
End Sub

'get the list of types
private Sub GetMapTypes(sourceMap As Map) As List
	Dim listOfTypes As List
	listOfTypes.Initialize
	Dim iCnt As Int
	Dim iTot As Int
	iTot = sourceMap.Size - 1
	For iCnt = 0 To iTot
		Dim col As String = sourceMap.GetKeyAt(iCnt)
		Dim colType As String = recType.GetDefault(col,"STRING")
		Select Case colType
			Case "STRING","VARCHAR","TEXT","DATE","DATETIME","NVARCHAR"
				listOfTypes.add("s")
			Case "INTEGER", "INT", "BOOL","BOOLEAN"
				listOfTypes.add("i")
			Case "REAL","FLOAT","DOUBLE"
				listOfTypes.add("d")
			Case "BLOB"
				listOfTypes.Add("b")
			Case Else
				listOfTypes.add("s")
		End Select
	Next
	Return listOfTypes
End Sub

'get map values
private Sub GetMapValues(sourceMap As Map) As List
	Dim listOfValues As List
	listOfValues.Initialize
	Dim iCnt As Int
	Dim iTot As Int
	iTot = sourceMap.Size - 1
	For iCnt = 0 To iTot
		Dim value As String = sourceMap.GetValueAt(iCnt)
		listOfValues.Add(value)
	Next
	Return listOfValues
End Sub

'get map keys
private Sub GetMapKeys(sourceMap As Map) As List
	Dim listOfValues As List
	listOfValues.Initialize
	Dim iCnt As Int
	Dim iTot As Int
	iTot = sourceMap.Size - 1
	For iCnt = 0 To iTot
		Dim value As String = sourceMap.GetKeyAt(iCnt)
		listOfValues.Add(value)
	Next
	Return listOfValues
End Sub


'return a sql insert statement
Sub Insert(tblName As String, tblFields As Map) As MSSQLResultSet
	Dim sb As StringBuilder
	Dim columns As StringBuilder
	Dim values As StringBuilder
	Dim listOfValues As List = GetMapValues(tblFields)
	Dim listOfTypes As List = GetMapTypes(tblFields)
	Dim iCnt As Int
	Dim iTot As Int
	sb.Initialize
	columns.Initialize
	values.Initialize
	sb.Append($"INSERT INTO ${EscapeField(tblName)} ("$)
	iTot = tblFields.Size - 1
	For iCnt = 0 To iTot
		Dim col As String = tblFields.GetKeyAt(iCnt)
		If iCnt > 0 Then
			columns.Append(", ")
			values.Append(", ")
		End If
		columns.Append(EscapeField(col))
		values.Append("?")
	Next
	sb.Append(columns.ToString)
	sb.Append(") VALUES (")
	sb.Append(values.ToString)
	sb.Append(")")
	Dim m As MSSQLResultSet
	m.Initialize
	m.query = sb.ToString
	m.args = listOfValues
	m.types = listOfTypes
	m.command = "insert"
	Return m
End Sub

'join list to multi value string
private Sub JoinFields(delimiter As String, lst As List) As String
	Dim i As Int
	Dim sb As StringBuilder
	Dim fld As String
	sb.Initialize
	fld = lst.Get(0)
	fld = EscapeField(fld)
	sb.Append(fld)
	For i = 1 To lst.size - 1
		Dim fld As String = lst.Get(i)
		fld = EscapeField(fld)
		sb.Append(delimiter).Append(fld)
	Next
	Return sb.ToString
End Sub

'join list to mv string
private Sub Join(delimiter As String, lst As List) As String
	Dim i As Int
	Dim sb As StringBuilder
	Dim fld As String
	sb.Initialize
	fld = lst.Get(0)
	sb.Append(fld)
	For i = 1 To lst.size - 1
		Dim fld As String = lst.Get(i)
		sb.Append(delimiter).Append(fld)
	Next
	Return sb.ToString
End Sub


'read statemen of a single record
Sub Read(tblName As String, primaryKey As String, primaryValue As String) As MSSQLResultSet
	Dim qw As Map = CreateMap()
	qw.Put(primaryKey, primaryValue)
	Dim qry As MSSQLResultSet = SelectWhere(tblName, Array("*"), qw,Array(primaryKey))
	Return qry
End Sub

Sub Delete(tblName As String, primaryKey As String, primaryValue As String) As MSSQLResultSet
	Dim qw As Map = CreateMap()
	qw.Put(primaryKey, primaryValue)
	Dim qry As MSSQLResultSet = DeleteWhere(tblName, qw)
	Return qry
End Sub

'exists statement for a single record returns the primary key field specified
Sub Exists(tblName As String, primaryKey As String, primaryValue As String) As MSSQLResultSet
	Dim qw As Map = CreateMap()
	qw.Put(primaryKey, primaryValue)
	Dim qry As MSSQLResultSet = SelectWhere(tblName, Array(primaryKey), qw,Array(primaryKey))
	Return qry
End Sub

'return a sql to select record of table where one exists
Sub SelectWhere(tblName As String, tblfields As List, tblWhere As Map, orderBy As List) As MSSQLResultSet
	Dim listOfTypes As List = GetMapTypes(tblWhere)
	Dim listOfValues As List = GetMapValues(tblWhere)
	'are we selecting all fields or just some
	Dim fld1 As String = tblfields.Get(0)
	Dim selFIelds As String = ""
	Select Case fld1
		Case "*"
			selFIelds = "*"
		Case Else
			selFIelds = JoinFields(",", tblfields)
	End Select
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append($"SELECT ${selFIelds} FROM ${EscapeField(tblName)} WHERE "$)
	Dim i As Int
	Dim iWhere As Int = tblWhere.Size - 1
	For i = 0 To iWhere
		If i > 0 Then
			sb.Append(" AND ")
		End If
		Dim col As String = tblWhere.GetKeyAt(i)
		sb.Append(EscapeField(col))
		sb.Append(" = ?")
	Next
	If orderBy <> Null Then
		'order by
		Dim stro As String = JoinFields(",", orderBy)
		If stro.Length > 0 Then
			sb.Append(" ORDER BY ").Append(stro)
		End If
	End If
	Dim m As MSSQLResultSet
	m.Initialize
	m.query = sb.tostring
	m.args = listOfValues
	m.types = listOfTypes
	m.command = "select"
	Return m
End Sub

'return a sql to delete record of table where one exists
Sub DeleteAll(tblName As String) As MSSQLResultSet
	Dim sb As String = $"DELETE FROM ${EscapeField(tblName)}"$
	Dim m As MSSQLResultSet
	m.Initialize
	m.query = sb
	m.args = Null
	m.types = Null
	m.command = "delete"
	Return m
End Sub

'return a sql to delete record of table where one exists
Sub DeleteWhere(tblName As String, tblWhere As Map) As MSSQLResultSet
	Dim listOfTypes As List = GetMapTypes(tblWhere)
	Dim listOfValues As List = GetMapValues(tblWhere)
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append($"DELETE FROM ${EscapeField(tblName)} WHERE "$)
	Dim i As Int
	Dim iWhere As Int = tblWhere.Size - 1
	For i = 0 To iWhere
		If i > 0 Then
			sb.Append(" AND ")
		End If
		Dim col As String = tblWhere.GetKeyAt(i)
		sb.Append(EscapeField(col))
		sb.Append(" = ?")
	Next
	Dim m As MSSQLResultSet
	m.Initialize
	m.query = sb.tostring
	m.args = listOfValues
	m.types = listOfTypes
	m.command = "delete"
	Return m
End Sub


'return a sql to select record of table where one exists
Sub SelectAll(tblName As String, tblfields As List, orderBy As List) As MSSQLResultSet
	'are we selecting all fields or just some
	Dim fld1 As String = tblfields.Get(0)
	Dim selFIelds As String = ""
	Select Case fld1
		Case "*"
			selFIelds = "*"
		Case Else
			selFIelds = JoinFields(",", tblfields)
	End Select
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append($"SELECT ${selFIelds} FROM ${EscapeField(tblName)}"$)
	If orderBy <> Null Then
		'order by
		Dim stro As String = JoinFields(",", orderBy)
		If stro.Length > 0 Then
			sb.Append(" ORDER BY ").Append(stro)
		End If
	End If
	Dim m As MSSQLResultSet
	m.Initialize
	m.query = sb.tostring
	m.args = Null
	m.types = Null
	m.command =  "select"
	Return m
End Sub

'build the map to pass to php from statement
Sub Build(rslt As MSSQLResultSet) As Map
	Dim b As Map = CreateMap()
	b.Put("command", rslt.command)
	b.Put("query", rslt.query)
	b.Put("args", rslt.args)
	b.Put("types", rslt.types)
	Return b
End Sub

'return a sql to update records of table where one exists
Sub UpdateWhere(tblName As String, tblfields As Map, tblWhere As Map) As MSSQLResultSet
	Dim listOfTypes As List = GetMapTypes(tblfields)
	Dim listOfTypes1 As List = GetMapTypes(tblWhere)
	listOfTypes.AddAll(listOfTypes1)
	Dim listOfValues As List = GetMapValues(tblfields)
	Dim listOfValues1 As List = GetMapValues(tblWhere)
	listOfValues.AddAll(listOfValues1)
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append($"UPDATE ${EscapeField(tblName)} SET "$)
	Dim i As Int
	Dim iTot As Int = tblfields.Size - 1
	For i = 0 To iTot
		Dim col As String = tblfields.GetKeyAt(i)
		sb.Append(EscapeField(col))
		If i <> iTot Then
			sb.Append("= ?,")
		Else
			sb.Append("= ?")
		End If
	Next
	sb.Append($" WHERE "$)
	Dim iWhere As Int = tblWhere.Size - 1
	For i = 0 To iWhere
		If i > 0 Then
			sb.Append(" AND ")
		End If
		Dim col As String = tblWhere.GetKeyAt(i)
		sb.Append(EscapeField(col))
		sb.Append(" = ?")
	Next
	Dim m As MSSQLResultSet
	m.Initialize
	m.query = sb.tostring
	m.args = listOfValues
	m.types = listOfTypes
	m.command = "update"
	Return m
End Sub


'return a sql to update all records of table
Sub UpdateAll(tblName As String, tblFields As Map) As MSSQLResultSet
	Dim listOfTypes As List = GetMapTypes(tblFields)
	Dim args As List = GetMapValues(tblFields)
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append($"UPDATE ${EscapeField(tblName)} SET "$)
	Dim i As Int
	Dim iTot As Int = tblFields.Size - 1
	For i = 0 To iTot
		Dim col As String = tblFields.GetKeyAt(i)
		sb.Append(col)
		If i <> iTot Then
			sb.Append(" = ?,")
		Else
			sb.Append(" = ?")
		End If
	Next
	Dim m As MSSQLResultSet
	m.Initialize
	m.query = sb.tostring
	m.args = args
	m.types = listOfTypes
	m.command = "update"
	Return m
End Sub

#if php
function BANanoMSSQL($command, $query, $args, $types){
	header('Access-Control-Allow-Origin: *');
	header('content-type: application/json; charset=utf-8');
	require_once './assets/config.php';
	$serverName = DB_HOST;
	$uid = DB_USER;
	$pwd = DB_PASS;
	$database = DB_NAME;
	try {
		$conn = new PDO("sqlsrv:server=$serverName;database=$database", $uid, $pwd);
 		$conn->setAttribute(PDO::ATTR_EMULATE_PREPARES, false);
		$conn->setAttribute(PDO::ATTR_DEFAULT_FETCH_MODE, PDO::FETCH_ASSOC);
		$conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION );
		$conn->setAttribute(PDO::SQLSRV_ATTR_DIRECT_QUERY, true);
		
    	$commands = array('delete', 'update', 'replace', 'insert', 'connection', 'createdb', 'dropdb', 'createtable', 'droptable');
    	if (in_array($command, $commands)) {
        	$command = 'changes';
    	}
		switch ($command) {
    	case "changes":
        	$stmt = $conn->prepare($query);
			$stmt->execute($args);
			$affRows = $stmt->rowCount();
			$output = json_encode(array($affRows));
        	break;
    	default:
			$stmt = $conn->prepare($query);
			$stmt->execute($args);
			$rows = $stmt->fetchAll();
        	$output = json_encode($rows);
        	break;
		}
    	echo ($output);
		// Free statement and connection resources.
		$stmt = null;
		$conn = null;
	} catch( PDOException $e ) {
		$response = $e->getMessage();
        $output = json_encode(array($response));
        die($output);
	}
}
#End If