B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Private recType As Map
	Public DB_VARCHAR_20 As String = "VARCHAR(20)"
	Public DB_VARCHAR_10 As String = "VARCHAR(10)"
	Public DB_VARCHAR_30 As String = "VARCHAR(30)"
	Public DB_VARCHAR_40 As String = "VARCHAR(40)"
	Public DB_VARCHAR_50 As String = "VARCHAR(50)"
	Public DB_VARCHAR_100 As String = "VARCHAR(100)"
	Public DB_VARCHAR_255 As String = "VARCHAR(255)"
	Public DB_STRING As String = "TEXT"
	Public DB_INT As String = "INT"
	Public DB_FLOAT As String = "FLOAT"
	Public DB_BLOB As String = "BLOB"
	Public DB_BOOL As String = "BOOL"
	Public DB_REAL As String = "REAL"
	Public DB_DATE As String = "DATE"
	Type MySQLResultSet1(result As List, command As String, types As List, args As List, query As String)
	Private BANano As BANano   'ignore
	Public MethodName As String
End Sub

Sub ResetTypes As BANanoMySQL1
	recType.Initialize
	MethodName = "BANanoMySQL1"
	Return Me
End Sub

'return a sql to delete record of table where one exists
Sub GetMax(tblName As String, fldName As String) As MySQLResultSet1
	Dim sb As String = $"SELECT MAX(${fldName}) As ${fldName} FROM ${EscapeField(tblName)}"$
	Dim m As MySQLResultSet1
	m.Initialize
	m.query = sb
	m.args = Null
	m.types = Null
	m.command = "getmax"
	Return m
End Sub


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


Sub CStr(o As Object) As String
	Return "" & o
End Sub


'initialize the class, a field named "id" is assumed to be an integer
Public Sub Initialize() As BANanoMySQL1
	recType.Initialize
	Return Me
End Sub

'convert a json string to a map
Sub Json2Map(strJSON As String) As Map
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
Sub Map2Json(mp As Map) As String
	Dim JSON As BANanoJSONGenerator
	JSON.Initialize(mp)
	Return JSON.ToString
End Sub

'specify strings field types, this is default for all strings
Sub AddStrings(fieldNames As List) As BANanoMySQL1
	For Each strfld As String In fieldNames
		recType.Put(strfld,"STRING")
	Next
	Return Me
End Sub

'specify integer field types
Sub AddIntegers(fieldNames As List) As BANanoMySQL1
	For Each strfld As String In fieldNames
		recType.Put(strfld,"INT")
	Next
	Return Me
End Sub

'specify double field types
Sub AddDoubles(fieldNames As List) As BANanoMySQL1
	For Each strfld As String In fieldNames
		recType.Put(strfld,"DOUBLE")
	Next
	Return Me
End Sub

'specify blob field types
Sub AddBlobs(fieldNames As List) As BANanoMySQL1
	For Each strfld As String In fieldNames
		recType.Put(strfld,"BLOB")
	Next
	Return Me
End Sub

'excape fields with ``
Private Sub EscapeField(f As String) As String
	Return $"`${f}`"$
End Sub

'return string for test connection operation
Sub Connection() As MySQLResultSet1
	Dim m As MySQLResultSet1
	m.Initialize
	m.query = ""
	m.args = Null
	m.types = Null
	m.command = "connection"
	Return m
End Sub

' return string to create database
Sub CreateDatabase(dbName As String) As MySQLResultSet1
	Dim sSQL As String = $"CREATE DATABASE IF NOT EXISTS ${EscapeField(dbName)}"$
	Dim m As MySQLResultSet1
	m.Initialize
	m.query = sSQL
	m.args = Null
	m.types = Null
	m.command = "createdb"
	Return m
End Sub

'drop the database
Sub DropDataBase(dbName As String) As MySQLResultSet1
	Dim sSQL As String = $"DROP DATABASE ${EscapeField(dbName)}"$
	Dim m As MySQLResultSet1
	m.Initialize
	m.query = sSQL
	m.args = Null
	m.types = Null
	m.command = "dropdb"
	Return m
End Sub


Sub Execute(strSQL As String) As MySQLResultSet1
	Dim m As MySQLResultSet1
	m.Initialize
	m.query = strSQL
	m.args = Null
	m.types = Null
	m.command = "execute"
	Return m
End Sub

'return a sql command to create the table
public Sub CreateTable(tblName As String, tblFields As Map, PK As String, Auto As String) As MySQLResultSet1
	Dim fldName As String
	Dim fldType As String
	Dim fldTot As Int
	Dim fldCnt As Int
	fldTot = tblFields.Size - 1
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append("(")
	For fldCnt = 0 To fldTot
		fldName = tblFields.GetKeyAt(fldCnt)
		fldType = tblFields.Get(fldName)
		fldType = fldType.Replace("STRING", "TEXT")
		If fldCnt > 0 Then
			sb.Append(", ")
		End If
		sb.Append(EscapeField(fldName))
		sb.Append(" ")
		sb.Append(fldType)
		If fldName.EqualsIgnoreCase(PK) Then
			sb.Append(" NOT NULL PRIMARY KEY")
		End If
		If fldName.EqualsIgnoreCase(Auto) Then
			sb.Append(" AUTO_INCREMENT")
		End If
	Next
	sb.Append(")")
	'define the qry to execute
	Dim query As String = "CREATE TABLE IF NOT EXISTS " & EscapeField(tblName) & " " & sb.ToString
	Dim m As MySQLResultSet1
	m.Initialize
	m.query = query
	m.args = Null
	m.types = Null
	m.command = "createtable"
	Return m
End Sub

'return sql command to drop a table
public Sub DropTable(tblName As String) As MySQLResultSet1
	'define the qry to execute
	Dim query As String = "DROP TABLE " & EscapeField(tblName)
	Dim m As MySQLResultSet1
	m.Initialize
	m.query = query
	m.args = Null
	m.types = Null
	m.command = "droptable"
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
			Case "VARCHAR(20)", "VARCHAR(10)", "VARCHAR(30)", "VARCHAR(40)"
				listOfTypes.add("s")
			Case "VARCHAR(50)", "VARCHAR(100)", "VARCHAR(255)"
				listOfTypes.add("s")
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
Sub Insert(tblName As String, tblFields As Map) As MySQLResultSet1
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
	Dim m As MySQLResultSet1
	m.Initialize
	m.query = sb.ToString
	m.args = listOfValues
	m.types = listOfTypes
	m.command = "insert"
	Return m
End Sub


'return a sql insert statement
Sub InsertReplace(tblName As String, tblFields As Map) As MySQLResultSet1
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
	sb.Append($"REPLACE INTO ${EscapeField(tblName)} ("$)
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
	Dim m As MySQLResultSet1
	m.Initialize
	m.query = sb.ToString
	m.args = listOfValues
	m.types = listOfTypes
	m.command = "replace"
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


'read
Sub Read(tblName As String, primaryKey As String, primaryValue As String) As MySQLResultSet1
	Dim qw As Map = CreateMap()
	qw.Put(primaryKey, primaryValue)
	Dim qry As MySQLResultSet1 = SelectWhere(tblName, Array("*"), qw,Array(primaryKey))
	Return qry
End Sub

'exists
Sub Exists(tblName As String, primaryKey As String, primaryValue As String) As MySQLResultSet1
	Dim qw As Map = CreateMap()
	qw.Put(primaryKey, primaryValue)
	Dim qry As MySQLResultSet1 = SelectWhere(tblName, Array(primaryKey), qw,Array(primaryKey))
	Return qry
End Sub

'return a sql to select record of table where one exists
Sub SelectWhere(tblName As String, tblfields As List, tblWhere As Map, orderBy As List) As MySQLResultSet1
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
	Dim m As MySQLResultSet1
	m.Initialize
	m.query = sb.tostring
	m.args = listOfValues
	m.types = listOfTypes
	m.command = "select"
	Return m
End Sub

'return a sql to delete record of table where one exists
Sub DeleteAll(tblName As String) As MySQLResultSet1
	Dim sb As String = $"DELETE FROM ${EscapeField(tblName)}"$
	Dim m As MySQLResultSet1
	m.Initialize
	m.query = sb
	m.args = Null
	m.types = Null
	m.command = "delete"
	Return m
End Sub

'return a sql to delete record of table where one exists
Sub DeleteWhere(tblName As String, tblWhere As Map) As MySQLResultSet1
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
	Dim m As MySQLResultSet1
	m.Initialize
	m.query = sb.tostring
	m.args = listOfValues
	m.types = listOfTypes
	m.command = "delete"
	Return m
End Sub


'return a sql to select record of table where one exists
Sub SelectAll(tblName As String, tblfields As List, orderBy As List) As MySQLResultSet1
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
	Dim m As MySQLResultSet1
	m.Initialize
	m.query = sb.tostring
	m.args = Null
	m.types = Null
	m.command =  "select"
	Return m
End Sub

Sub Build(rslt As MySQLResultSet1) As Map
	Dim b As Map = CreateMap()
	b.Put("command", rslt.command)
	b.Put("query", rslt.query)
	b.Put("args", rslt.args)
	b.Put("types", rslt.types)
	Return b
End Sub

'return a sql to update records of table where one exists
Sub UpdateWhere(tblName As String, tblfields As Map, tblWhere As Map) As MySQLResultSet1
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
	Dim m As MySQLResultSet1
	m.Initialize
	m.query = sb.tostring
	m.args = listOfValues
	m.types = listOfTypes
	m.command = "update"
	Return m
End Sub


'return a sql to update all records of table
Sub UpdateAll(tblName As String, tblFields As Map) As MySQLResultSet1
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
	Dim m As MySQLResultSet1
	m.Initialize
	m.query = sb.tostring
	m.args = args
	m.types = listOfTypes
	m.command = "update"
	Return m
End Sub

#if PHP
function prepareStatement1($conn, $query, $types, $args) {
	//paramater types to execute
	/* Bind parameters. Types: s = string, i = integer, d = double,  b = blob */
	$stmt = $conn->prepare($query);
	if(is_array($types)){
		$a_params = array();
		$param_type = '';
		$n = count($types);
		for($i = 0; $i < $n; $i++) {
			$param_type .= $types[$i];
		}
		$a_params[] = & $param_type;
		//values to execute
		for($i = 0; $i < $n; $i++) {
			$a_params[] = & $args[$i];
		}
		call_user_func_array(array($stmt, 'bind_param'), $a_params);
	}
	return $stmt;
}

function BANanoMySQL1($command, $query, $args, $types) {
	header('Access-Control-Allow-Origin: *');
	header('content-type: application/json; charset=utf-8');
	require_once './assets/config.php';
    //connect To MySQL
    $conn = new mysqli(DB_HOST, DB_USER, DB_PASS, DB_NAME);
    //we cannot connect Return an error
    if ($conn->connect_error) {
        $response = $conn->connect_error;
        $output = json_encode(array($response));
        die($output);
    }
    mysqli_set_charset($conn, 'utf8');
    $query = mysqli_real_escape_string($conn, $query);
    $commands = array('delete', 'update', 'replace', 'insert', 'connection', 'createdb', 'dropdb', 'createtable', 'droptable');
    if (in_array($command, $commands)) {
        $command = 'changes';
    }
    switch ($command) {
    case "changes":
        $stmt = prepareStatement1($conn, $query, $types, $args);
        $result = $stmt->execute();
        $affRows = $conn->affected_rows;
        $output = json_encode(array($affRows));
        break;
    default:
        $stmt = prepareStatement1($conn, $query, $types, $args);
        $result = $stmt->execute();
	    $result = $stmt->get_result();
        $rows = array();
        while ($row = $result->fetch_assoc()) {
            $rows[] = $row;
        }
        $output = json_encode($rows);
        break;
	}
    echo ($output);
    $conn->close();
}
#end if