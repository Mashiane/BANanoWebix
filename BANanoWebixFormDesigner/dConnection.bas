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
	Bag.AddCombo("dbtype","Database Type","BANanoSQL", Array("","BANanoSQL", "BANanoSQLite", "BANanoMySQL"))
	Bag.AddTextBox("dbname","Database Name", "db")
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
			sb.append("'STEP 1: Copy and paste the following code in Process_Globals of each module you will access the Database including Main\r\n\r\n")
			sb.Append($"Private ${dbname} As BANanoSQL\r\n\r\n"$)
			sb.append("'STEP 2: On the Initialize sub for your code module, copy and paste the following code before everything else\r\n\r\n")
			sb.Append($"${dbname}.OpenWait("${dbname}", "${dbname}")\r\n\r\n"$)
			sb.append("'STEP 3: On Main.BANano_Ready, copy and paste the following code before everything else\r\n\r\n")
			sb.Append($"${dbname}.OpenWait("${dbname}", "${dbname}")\r\n\r\n"$)
		Case "BANanoSQLite"
			sb.append("'STEP 1: In Main.AppStart, include the code after initializing BANano\r\n\r\n")
			sb.append($"BANano.PHP_NAME = "app.php"\r\nBANano.PHPHost = "http://www.yourserver.com/app/"\r\nBANano.PHPAddHeader("Access-Control-Allow-Origin: *")\r\n\r\n"$)
			sb.append("Ensure you update your .PHPHost to point to the right location of your app.\r\n\r\n")
		Case "BANanoMySQL"
			sb.Append("'STEP 1: Copy the config.php file from the 'assets' folder to your root folder and update it\r\n\r\n")
			sb.append($"const DB_HOST = '${host}';\r\nconst DB_USER = '${username}';\r\nconst DB_PASS = '${password}';\r\nconst DB_NAME = '${dbname}';\r\n\r\n"$)
			sb.append("'STEP 2: In Main.AppStart, include the code after initializing BANano\r\n\r\n")
			sb.append($"BANano.PHP_NAME = "app.php"\r\nBANano.PHPHost = "http://www.yourserver.com/app/"\r\nBANano.PHPAddHeader("Access-Control-Allow-Origin: *")\r\n\r\n"$)
			sb.append("Ensure you update your .PHPHost to point to the right location of your app.\r\n\r\n")
	End Select
	Return sb.tostring
End Sub