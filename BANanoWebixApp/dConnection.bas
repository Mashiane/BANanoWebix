B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.51
@EndOfDesignText@
'Static code module
Sub Process_Globals
End Sub

Sub BuildBag(Page As WixPage, Bag As WixProperty)
	Bag.Clear
	Bag.AddTextBox("id", "ID","connection")
	Bag.AddCombo("dbtype","Database Type","BANanoSQL", Array("","BANanoSQL", "BANanoSQLite", "BANanoMySQL", "BANanoMSSQL"))
	Bag.AddTextBox("dbname","Database Name", "db")
	Bag.AddTextBox("language","Language", "en")
	Bag.AddTextBox("host", "Host", "localhost")
	Bag.AddTextBox("port", "Server Port", "3306")
	Bag.AddLabel("Credentials")
	Bag.AddTextBox("username","User Name","root")
	Bag.AddPassword("password", "Password","")
	Bag.Refresh(Page)
End Sub

Sub ConnectionCode(cm As Map) As String
	Dim dbtype As String = cm.Get("dbtype")
	Dim dbname As String = cm.Get("dbname")
	Dim port As String = cm.get("port")
	Dim username As String = cm.Get("username")
	Dim password As String = cm.Get("password")
	Dim host As String = cm.Get("host")
	
	'bananosql
	Dim sb As StringBuilder
	sb.Initialize
	Select Case dbtype
		Case "BANanoSQL"
			sb.append("'STEP 1: Copy and paste the following code in Process_Globals of each module you will access the Database including Main").Append(CRLF).Append(CRLF)
			sb.Append($"Private ${dbname} As BANanoSQL"$).Append(CRLF).append(CRLF)
			sb.append("'STEP 2: On the Initialize sub for your code module, copy and paste the following code before everything else").Append(CRLF).Append(CRLF)
			sb.Append($"${dbname}.OpenWait("${dbname}", "${dbname}")"$).Append(CRLF).append(CRLF)
			sb.append("'STEP 3: On Main.BANano_Ready, copy and paste the following code before everything else").append(CRLF).Append(CRLF)
			sb.Append($"${dbname}.OpenWait("${dbname}", "${dbname}")"$).Append(CRLF).Append(CRLF)
		Case "BANanoSQLite"
			sb.append("'STEP 1: In Main.AppStart, include the code after initializing BANano").Append(CRLF).Append(CRLF)
			sb.append($"BANano.PHP_NAME = "app.php""$).Append(CRLF)
			sb.Append($"BANano.PHPHost = "http://www.yourserver.com/app/""$).Append(CRLF)
			sb.Append($"BANano.PHPAddHeader("Access-Control-Allow-Origin: *")"$).Append(CRLF).Append(CRLF)
			sb.append("Ensure you update your .PHPHost to point to the right location of your app.").Append(CRLF).Append(CRLF)
		Case "BANanoMySQL", "BANanoMSSQL"
			sb.Append("'STEP 1: Update the config.php file on the 'assets' with your connection details.").Append(CRLF).append(CRLF)
			sb.append($"const DB_HOST = '${host}';"$).Append(CRLF)
			sb.Append($"const DB_USER = '${username}';"$).Append(CRLF)
			sb.Append($"const DB_PASS = '${password}';"$).append(CRLF)
			sb.Append($"const DB_NAME = '${dbname}';"$).Append(CRLF).Append(CRLF)
			sb.append("'STEP 2: In Main.AppStart, include the code after initializing BANano. Update 'app' to be your WebApp Name").Append(CRLF).Append(CRLF)
			sb.append($"BANano.PHP_NAME = "app.php"$).Append(CRLF)
			sb.append($"BANano.PHPHost = "http://www.yourserver.com/app/"$).append(CRLF)
			sb.append($"BANano.PHPAddHeader("Access-Control-Allow-Origin: *")"$).Append(CRLF)
			sb.append("Ensure you update your .PHPHost to point to the right location of your app.").Append(CRLF)
	End Select
	Return sb.tostring
End Sub