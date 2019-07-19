package b4j.example;


import anywheresoftware.b4a.BA;

public class dconnection extends Object{
public static dconnection mostCurrent = new dconnection();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.dconnection", null);
		ba.loadHtSubs(dconnection.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.dconnection", ba);
		}
	}
    public static Class<?> getObject() {
		return dconnection.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static b4j.example.main _main = null;
public static b4j.example.pgformdesigner _pgformdesigner = null;
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
public static b4j.example.dtable _dtable = null;
public static b4j.example.dfield _dfield = null;
public static b4j.example.modwebix _modwebix = null;
public static String  _buildbag(b4j.example.wixpage _page,b4j.example.wixproperty _bag) throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub BuildBag(Page As WixPage, Bag As WixProperty)";
 //BA.debugLineNum = 6;BA.debugLine="Bag.Clear";
_bag._clear /*b4j.example.wixproperty*/ ();
 //BA.debugLineNum = 7;BA.debugLine="Bag.AddTextBox(\"id\", \"ID\",\"connection\")";
_bag._addtextbox /*b4j.example.wixproperty*/ ("id","ID","connection");
 //BA.debugLineNum = 8;BA.debugLine="Bag.AddCombo(\"dbtype\",\"Database Type\",\"BANanoSQL\"";
_bag._addcombo /*b4j.example.wixproperty*/ ("dbtype","Database Type","BANanoSQL",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(""),(Object)("BANanoSQL"),(Object)("BANanoSQLite"),(Object)("BANanoMySQL")}));
 //BA.debugLineNum = 9;BA.debugLine="Bag.AddTextBox(\"dbname\",\"Database Name\", \"db\")";
_bag._addtextbox /*b4j.example.wixproperty*/ ("dbname","Database Name","db");
 //BA.debugLineNum = 10;BA.debugLine="Bag.AddTextBox(\"host\", \"Host\", \"localhost\")";
_bag._addtextbox /*b4j.example.wixproperty*/ ("host","Host","localhost");
 //BA.debugLineNum = 11;BA.debugLine="Bag.AddTextBox(\"port\", \"Server Port\", \"3306\")";
_bag._addtextbox /*b4j.example.wixproperty*/ ("port","Server Port","3306");
 //BA.debugLineNum = 12;BA.debugLine="Bag.AddLabel(\"Credentials\")";
_bag._addlabel /*b4j.example.wixproperty*/ ("Credentials");
 //BA.debugLineNum = 13;BA.debugLine="Bag.AddTextBox(\"username\",\"User Name\",\"root\")";
_bag._addtextbox /*b4j.example.wixproperty*/ ("username","User Name","root");
 //BA.debugLineNum = 14;BA.debugLine="Bag.AddPassword(\"password\", \"Password\",\"\")";
_bag._addpassword /*b4j.example.wixproperty*/ ("password","Password","");
 //BA.debugLineNum = 15;BA.debugLine="Bag.Refresh(Page)";
_bag._refresh /*String*/ (_page);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return "";
}
public static String  _connectioncode(anywheresoftware.b4a.objects.collections.Map _cm) throws Exception{
String _dbtype = "";
String _dbname = "";
String _port = "";
String _username = "";
String _password = "";
String _host = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
 //BA.debugLineNum = 18;BA.debugLine="Sub ConnectionCode(cm As Map) As String";
 //BA.debugLineNum = 19;BA.debugLine="Dim dbtype As String = cm.Get(\"dbtype\")";
_dbtype = BA.ObjectToString(_cm.Get((Object)("dbtype")));
 //BA.debugLineNum = 20;BA.debugLine="Dim dbname As String = cm.Get(\"dbname\")";
_dbname = BA.ObjectToString(_cm.Get((Object)("dbname")));
 //BA.debugLineNum = 21;BA.debugLine="Dim port As String = cm.get(\"port\")";
_port = BA.ObjectToString(_cm.Get((Object)("port")));
 //BA.debugLineNum = 22;BA.debugLine="Dim username As String = cm.Get(\"username\")";
_username = BA.ObjectToString(_cm.Get((Object)("username")));
 //BA.debugLineNum = 23;BA.debugLine="Dim password As String = cm.Get(\"password\")";
_password = BA.ObjectToString(_cm.Get((Object)("password")));
 //BA.debugLineNum = 24;BA.debugLine="Dim host As String = cm.Get(\"host\")";
_host = BA.ObjectToString(_cm.Get((Object)("host")));
 //BA.debugLineNum = 27;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 28;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 29;BA.debugLine="Select Case dbtype";
switch (BA.switchObjectToInt(_dbtype,"BANanoSQL","BANanoSQLite","BANanoMySQL")) {
case 0: {
 //BA.debugLineNum = 31;BA.debugLine="sb.append(\"'STEP 1: Copy and paste the followin";
_sb.Append("'STEP 1: Copy and paste the following code in Process_Globals of each module you will access the Database including Main").Append(anywheresoftware.b4a.keywords.Common.CRLF).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 32;BA.debugLine="sb.Append($\"Private ${dbname} As BANanoSQL\"$).A";
_sb.Append(("Private "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_dbname))+" As BANanoSQL")).Append(anywheresoftware.b4a.keywords.Common.CRLF).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 33;BA.debugLine="sb.append(\"'STEP 2: On the Initialize sub for y";
_sb.Append("'STEP 2: On the Initialize sub for your code module, copy and paste the following code before everything else").Append(anywheresoftware.b4a.keywords.Common.CRLF).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 34;BA.debugLine="sb.Append($\"${dbname}.OpenWait(\"${dbname}\", \"${";
_sb.Append((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_dbname))+".OpenWait(\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_dbname))+"\", \""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_dbname))+"\")")).Append(anywheresoftware.b4a.keywords.Common.CRLF).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 35;BA.debugLine="sb.append(\"'STEP 3: On Main.BANano_Ready, copy";
_sb.Append("'STEP 3: On Main.BANano_Ready, copy and paste the following code before everything else").Append(anywheresoftware.b4a.keywords.Common.CRLF).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 36;BA.debugLine="sb.Append($\"${dbname}.OpenWait(\"${dbname}\", \"${";
_sb.Append((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_dbname))+".OpenWait(\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_dbname))+"\", \""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_dbname))+"\")")).Append(anywheresoftware.b4a.keywords.Common.CRLF).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 break; }
case 1: {
 //BA.debugLineNum = 38;BA.debugLine="sb.append(\"'STEP 1: In Main.AppStart, include t";
_sb.Append("'STEP 1: In Main.AppStart, include the code after initializing BANano").Append(anywheresoftware.b4a.keywords.Common.CRLF).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 39;BA.debugLine="sb.append($\"BANano.PHP_NAME = \"app.php\"\"$).Appe";
_sb.Append(("BANano.PHP_NAME = \"app.php\"")).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 40;BA.debugLine="sb.Append($\"BANano.PHPHost = \"http://www.yourse";
_sb.Append(("BANano.PHPHost = \"http://www.yourserver.com/app/\"")).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 41;BA.debugLine="sb.Append($\"BANano.PHPAddHeader(\"Access-Control";
_sb.Append(("BANano.PHPAddHeader(\"Access-Control-Allow-Origin: *\")")).Append(anywheresoftware.b4a.keywords.Common.CRLF).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 42;BA.debugLine="sb.append(\"Ensure you update your .PHPHost to p";
_sb.Append("Ensure you update your .PHPHost to point to the right location of your app.").Append(anywheresoftware.b4a.keywords.Common.CRLF).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 break; }
case 2: {
 //BA.debugLineNum = 44;BA.debugLine="sb.Append(\"'STEP 1: Copy the config.php file fr";
_sb.Append("'STEP 1: Copy the config.php file from the 'assets' folder to your root folder and update it").Append(anywheresoftware.b4a.keywords.Common.CRLF).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 45;BA.debugLine="sb.append($\"const DB_HOST = '${host}';\"$).Appen";
_sb.Append(("const DB_HOST = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_host))+"';")).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 46;BA.debugLine="sb.Append($\"const DB_USER = '${username}';\"$).A";
_sb.Append(("const DB_USER = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_username))+"';")).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 47;BA.debugLine="sb.Append($\"const DB_PASS = '${password}';\"$).a";
_sb.Append(("const DB_PASS = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_password))+"';")).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 48;BA.debugLine="sb.Append($\"const DB_NAME = '${dbname}';\"$).App";
_sb.Append(("const DB_NAME = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_dbname))+"';")).Append(anywheresoftware.b4a.keywords.Common.CRLF).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 49;BA.debugLine="sb.append(\"'STEP 2: In Main.AppStart, include t";
_sb.Append("'STEP 2: In Main.AppStart, include the code after initializing BANano").Append(anywheresoftware.b4a.keywords.Common.CRLF).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 50;BA.debugLine="sb.append($\"BANano.PHP_NAME = \"app.php\"$).Appen";
_sb.Append(("BANano.PHP_NAME = \"app.php")).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 51;BA.debugLine="sb.append($\"BANano.PHPHost = \"http://www.yourse";
_sb.Append(("BANano.PHPHost = \"http://www.yourserver.com/app/")).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 52;BA.debugLine="sb.append($\"BANano.PHPAddHeader(\"Access-Control";
_sb.Append(("BANano.PHPAddHeader(\"Access-Control-Allow-Origin: *\")")).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 53;BA.debugLine="sb.append(\"Ensure you update your .PHPHost to p";
_sb.Append("Ensure you update your .PHPHost to point to the right location of your app.").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 break; }
}
;
 //BA.debugLineNum = 55;BA.debugLine="Return sb.tostring";
if (true) return _sb.ToString();
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="End Sub";
return "";
}
}
