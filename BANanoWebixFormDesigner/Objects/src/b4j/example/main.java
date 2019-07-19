package b4j.example;


import anywheresoftware.b4a.BA;

public class main extends javafx.application.Application{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.main", ba);
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}

 
    public static void main(String[] args) {
    	launch(args);
    }
    public void start (javafx.stage.Stage stage) {
        try {
            if (!false)
                System.setProperty("prism.lcdtext", "false");
            anywheresoftware.b4j.objects.FxBA.application = this;
		    anywheresoftware.b4a.keywords.Common.setDensity(javafx.stage.Screen.getPrimary().getDpi());
            anywheresoftware.b4a.keywords.Common.LogDebug("Program started.");
            initializeProcessGlobals();
            anywheresoftware.b4j.objects.Form frm = new anywheresoftware.b4j.objects.Form();
            frm.initWithStage(ba, stage, 500, 500);
            ba.raiseEvent(null, "appstart", frm, (String[])getParameters().getRaw().toArray(new String[0]));
        } catch (Throwable t) {
            BA.printException(t, true);
            System.exit(1);
        }
    }
public static anywheresoftware.b4a.keywords.Common __c = null;
public static com.ab.banano.BANano _banano = null;
public static String _appname = "";
public static String _publish = "";
public static b4j.example.bananopostprocessor _bp = null;
public static String _dbname = "";
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
public static b4j.example.dconnection _dconnection = null;
public static b4j.example.dtable _dtable = null;
public static b4j.example.dfield _dfield = null;
public static b4j.example.modwebix _modwebix = null;
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
 //BA.debugLineNum = 68;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return false;
}
public static String  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
String _version = "";
String _appfile = "";
 //BA.debugLineNum = 12;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
 //BA.debugLineNum = 13;BA.debugLine="Publish = \"C:\\xampp\\htdocs\"";
_publish = "C:\\xampp\\htdocs";
 //BA.debugLineNum = 14;BA.debugLine="Dim version As String = DateTime.now";
_version = BA.NumberToString(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
 //BA.debugLineNum = 15;BA.debugLine="Dim appFile As String = $\"app${version}.js\"$";
_appfile = ("app"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_version))+".js");
 //BA.debugLineNum = 16;BA.debugLine="BANano.Initialize(\"BANano\", AppName,1)";
_banano.Initialize("BANano",_appname,(long) (1));
 //BA.debugLineNum = 17;BA.debugLine="BANano.HTML_NAME = \"index.html\"";
_banano.HTML_NAME = "index.html";
 //BA.debugLineNum = 18;BA.debugLine="BANano.Header.Title = AppName";
_banano.Header.Title = _appname;
 //BA.debugLineNum = 19;BA.debugLine="BANano.JAVASCRIPT_NAME = appFile";
_banano.JAVASCRIPT_NAME = _appfile;
 //BA.debugLineNum = 20;BA.debugLine="BANano.Header.addcssfile(\"all.min.css\")";
_banano.Header.AddCSSFile("all.min.css");
 //BA.debugLineNum = 21;BA.debugLine="BANano.Header.AddCSSFile(\"materialdesignicons.min";
_banano.Header.AddCSSFile("materialdesignicons.min.css");
 //BA.debugLineNum = 22;BA.debugLine="BANano.Header.AddCSSFile(\"webix.min.css\")";
_banano.Header.AddCSSFile("webix.min.css");
 //BA.debugLineNum = 24;BA.debugLine="BANano.Header.AddCSSFile(\"material.min.css\")";
_banano.Header.AddCSSFile("material.min.css");
 //BA.debugLineNum = 29;BA.debugLine="BANano.Header.AddJavascriptFile(\"webix.min.js\")";
_banano.Header.AddJavascriptFile("webix.min.js");
 //BA.debugLineNum = 30;BA.debugLine="BANano.Header.AddCSSFile(\"hint.css\")";
_banano.Header.AddCSSFile("hint.css");
 //BA.debugLineNum = 31;BA.debugLine="BANano.Header.AddJavascriptFile(\"hint.js\")";
_banano.Header.AddJavascriptFile("hint.js");
 //BA.debugLineNum = 33;BA.debugLine="BANano.Header.AddJavascriptFile(\"Blob.min.js\")";
_banano.Header.AddJavascriptFile("Blob.min.js");
 //BA.debugLineNum = 34;BA.debugLine="BANano.Header.AddJavascriptFile(\"FileSaver.min.js";
_banano.Header.AddJavascriptFile("FileSaver.min.js");
 //BA.debugLineNum = 36;BA.debugLine="BANano.Header.AddJavascriptFile(\"https://together";
_banano.Header.AddJavascriptFile("https://togetherjs.com/togetherjs-min.js");
 //BA.debugLineNum = 42;BA.debugLine="BANano.TranspilerOptions.UseServiceWorker = False";
_banano.TranspilerOptions.setUseServiceWorker(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 43;BA.debugLine="BANano.TranspilerOptions.MergeAllCSSFiles = True";
_banano.TranspilerOptions.setMergeAllCSSFiles(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 44;BA.debugLine="BANano.TranspilerOptions.MergeAllJavascriptFiles";
_banano.TranspilerOptions.setMergeAllJavascriptFiles(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 47;BA.debugLine="BANano.PHP_NAME = \"bananowebixfd.php\"";
_banano.PHP_NAME = "bananowebixfd.php";
 //BA.debugLineNum = 48;BA.debugLine="BANano.PHPHost = $\"http://localhost/${AppName}/\"$";
_banano.PHPHost = ("http://localhost/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_appname))+"/");
 //BA.debugLineNum = 49;BA.debugLine="BANano.PHPAddHeader(\"Access-Control-Allow-Origin:";
_banano.PHPAddHeader("Access-Control-Allow-Origin: *");
 //BA.debugLineNum = 51;BA.debugLine="BANano.Build(Publish)";
_banano.Build(_publish);
 //BA.debugLineNum = 53;BA.debugLine="BP.Initialize";
_bp._initialize(ba);
 //BA.debugLineNum = 54;BA.debugLine="BP.PublishPath = Publish";
_bp._publishpath = _publish;
 //BA.debugLineNum = 55;BA.debugLine="BP.ShortName = AppName";
_bp._shortname = _appname;
 //BA.debugLineNum = 56;BA.debugLine="BP.AssetsPath = BANano.ASSETS_FOLDER";
_bp._assetspath = _banano.ASSETS_FOLDER;
 //BA.debugLineNum = 57;BA.debugLine="BP.ScriptsPath = BANano.SCRIPTS_FOLDER";
_bp._scriptspath = _banano.SCRIPTS_FOLDER;
 //BA.debugLineNum = 58;BA.debugLine="BP.StylesPath = BANano.STYLES_FOLDER";
_bp._stylespath = _banano.STYLES_FOLDER;
 //BA.debugLineNum = 59;BA.debugLine="BP.ScriptFile = BANano.JAVASCRIPT_NAME";
_bp._scriptfile = _banano.JAVASCRIPT_NAME;
 //BA.debugLineNum = 60;BA.debugLine="BP.UnzipFonts";
_bp._unzipfonts();
 //BA.debugLineNum = 61;BA.debugLine="BP.UnzipFile(\"extras.zip\")";
_bp._unzipfile("extras.zip");
 //BA.debugLineNum = 62;BA.debugLine="BP.Open(True)";
_bp._open(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 63;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return "";
}
public static String  _banano_ready() throws Exception{
b4j.example.bananosqlite _sqlite = null;
anywheresoftware.b4a.objects.collections.Map _tbl = null;
String _qry = "";
String _res = "";
b4j.example.bananosqlite._sqliteresultset _rs = null;
anywheresoftware.b4a.objects.collections.Map _c = null;
anywheresoftware.b4a.objects.collections.Map _f = null;
anywheresoftware.b4a.objects.collections.Map _els = null;
 //BA.debugLineNum = 71;BA.debugLine="Sub BANano_Ready()";
 //BA.debugLineNum = 72;BA.debugLine="Dim sqlite As BANanoSQLite";
_sqlite = new b4j.example.bananosqlite();
 //BA.debugLineNum = 73;BA.debugLine="sqlite.Initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 74;BA.debugLine="dbName = $\"${AppName}.db\"$";
_dbname = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_appname))+".db");
 //BA.debugLineNum = 76;BA.debugLine="Dim tbl As Map = CreateMap()";
_tbl = new anywheresoftware.b4a.objects.collections.Map();
_tbl = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {});
 //BA.debugLineNum = 77;BA.debugLine="tbl.Put(\"id\", sqlite.DB_STRING)";
_tbl.Put((Object)("id"),(Object)(_sqlite._db_string /*String*/ ));
 //BA.debugLineNum = 78;BA.debugLine="tbl.Put(\"value\", sqlite.DB_STRING)";
_tbl.Put((Object)("value"),(Object)(_sqlite._db_string /*String*/ ));
 //BA.debugLineNum = 79;BA.debugLine="tbl.Put(\"json\", sqlite.DB_STRING)";
_tbl.Put((Object)("json"),(Object)(_sqlite._db_string /*String*/ ));
 //BA.debugLineNum = 80;BA.debugLine="tbl.put(\"parentid\", sqlite.DB_STRING)";
_tbl.Put((Object)("parentid"),(Object)(_sqlite._db_string /*String*/ ));
 //BA.debugLineNum = 81;BA.debugLine="Dim qry As String = sqlite.CreateTable(\"forms\", t";
_qry = _sqlite._createtable /*String*/ ("forms",_tbl,"id");
 //BA.debugLineNum = 82;BA.debugLine="Dim res As String = BANano.CallInlinePHPWait(\"BAN";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 83;BA.debugLine="Dim rs As SQLiteResultSet = sqlite.GetResultSet(q";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 85;BA.debugLine="sqlite.Initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 86;BA.debugLine="Dim c As Map = CreateMap()";
_c = new anywheresoftware.b4a.objects.collections.Map();
_c = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {});
 //BA.debugLineNum = 87;BA.debugLine="c.Put(\"id\", sqlite.DB_STRING)";
_c.Put((Object)("id"),(Object)(_sqlite._db_string /*String*/ ));
 //BA.debugLineNum = 88;BA.debugLine="c.Put(\"json\", sqlite.DB_STRING)";
_c.Put((Object)("json"),(Object)(_sqlite._db_string /*String*/ ));
 //BA.debugLineNum = 89;BA.debugLine="Dim qry As String = sqlite.CreateTable(\"connect\",";
_qry = _sqlite._createtable /*String*/ ("connect",_c,"id");
 //BA.debugLineNum = 90;BA.debugLine="Dim res As String = BANano.CallInlinePHPWait(\"BAN";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 91;BA.debugLine="Dim rs As SQLiteResultSet = sqlite.GetResultSet(q";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 93;BA.debugLine="sqlite.Initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 94;BA.debugLine="Dim c As Map = CreateMap()";
_c = new anywheresoftware.b4a.objects.collections.Map();
_c = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {});
 //BA.debugLineNum = 95;BA.debugLine="c.Put(\"key\", sqlite.DB_STRING)";
_c.Put((Object)("key"),(Object)(_sqlite._db_string /*String*/ ));
 //BA.debugLineNum = 96;BA.debugLine="c.Put(\"id\", sqlite.DB_STRING)";
_c.Put((Object)("id"),(Object)(_sqlite._db_string /*String*/ ));
 //BA.debugLineNum = 97;BA.debugLine="c.Put(\"value\", sqlite.DB_STRING)";
_c.Put((Object)("value"),(Object)(_sqlite._db_string /*String*/ ));
 //BA.debugLineNum = 98;BA.debugLine="c.Put(\"json\", sqlite.DB_STRING)";
_c.Put((Object)("json"),(Object)(_sqlite._db_string /*String*/ ));
 //BA.debugLineNum = 99;BA.debugLine="Dim qry As String = sqlite.CreateTable(\"tables\",";
_qry = _sqlite._createtable /*String*/ ("tables",_c,"key");
 //BA.debugLineNum = 100;BA.debugLine="Dim res As String = BANano.CallInlinePHPWait(\"BAN";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 101;BA.debugLine="Dim rs As SQLiteResultSet = sqlite.GetResultSet(q";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 104;BA.debugLine="sqlite.Initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 105;BA.debugLine="Dim f As Map = CreateMap()";
_f = new anywheresoftware.b4a.objects.collections.Map();
_f = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {});
 //BA.debugLineNum = 106;BA.debugLine="f.Put(\"key\", sqlite.DB_STRING)";
_f.Put((Object)("key"),(Object)(_sqlite._db_string /*String*/ ));
 //BA.debugLineNum = 107;BA.debugLine="f.Put(\"id\", sqlite.DB_STRING)";
_f.Put((Object)("id"),(Object)(_sqlite._db_string /*String*/ ));
 //BA.debugLineNum = 108;BA.debugLine="f.Put(\"tablename\", sqlite.DB_STRING)";
_f.Put((Object)("tablename"),(Object)(_sqlite._db_string /*String*/ ));
 //BA.debugLineNum = 109;BA.debugLine="f.Put(\"value\", sqlite.DB_STRING)";
_f.Put((Object)("value"),(Object)(_sqlite._db_string /*String*/ ));
 //BA.debugLineNum = 110;BA.debugLine="f.Put(\"json\", sqlite.DB_STRING)";
_f.Put((Object)("json"),(Object)(_sqlite._db_string /*String*/ ));
 //BA.debugLineNum = 111;BA.debugLine="Dim qry As String = sqlite.CreateTable(\"fields\",";
_qry = _sqlite._createtable /*String*/ ("fields",_f,"key");
 //BA.debugLineNum = 112;BA.debugLine="Dim res As String = BANano.CallInlinePHPWait(\"BAN";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 113;BA.debugLine="Dim rs As SQLiteResultSet = sqlite.GetResultSet(q";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 116;BA.debugLine="sqlite.Initialize";
_sqlite._initialize /*b4j.example.bananosqlite*/ (ba);
 //BA.debugLineNum = 117;BA.debugLine="Dim els As Map = CreateMap()";
_els = new anywheresoftware.b4a.objects.collections.Map();
_els = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {});
 //BA.debugLineNum = 118;BA.debugLine="els.Put(\"id\", sqlite.DB_STRING)";
_els.Put((Object)("id"),(Object)(_sqlite._db_string /*String*/ ));
 //BA.debugLineNum = 119;BA.debugLine="els.Put(\"json\", sqlite.DB_STRING)";
_els.Put((Object)("json"),(Object)(_sqlite._db_string /*String*/ ));
 //BA.debugLineNum = 120;BA.debugLine="els.Put(\"tabindex\", sqlite.DB_STRING)";
_els.Put((Object)("tabindex"),(Object)(_sqlite._db_string /*String*/ ));
 //BA.debugLineNum = 121;BA.debugLine="els.put(\"parentid\", sqlite.DB_STRING)";
_els.Put((Object)("parentid"),(Object)(_sqlite._db_string /*String*/ ));
 //BA.debugLineNum = 122;BA.debugLine="Dim qry As String = sqlite.CreateTable(\"items\", e";
_qry = _sqlite._createtable /*String*/ ("items",_els,"id");
 //BA.debugLineNum = 123;BA.debugLine="Dim res As String = BANano.CallInlinePHPWait(\"BAN";
_res = BA.ObjectToString(_banano.CallInlinePHPWait("BANanoSQLite",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("dbname"),(Object)(_dbname),(Object)("data"),(Object)(_qry)})));
 //BA.debugLineNum = 124;BA.debugLine="Dim rs As SQLiteResultSet = sqlite.GetResultSet(q";
_rs = _sqlite._getresultset /*b4j.example.bananosqlite._sqliteresultset*/ (_qry,_res);
 //BA.debugLineNum = 125;BA.debugLine="pgFormDesigner.init";
_pgformdesigner._init /*String*/ ();
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return "";
}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main._process_globals();
pgformdesigner._process_globals();
modcenter._process_globals();
dbutton._process_globals();
modsidebar._process_globals();
modtoolbar._process_globals();
drow._process_globals();
dpager._process_globals();
ddbllist._process_globals();
dform._process_globals();
dcheckbox._process_globals();
dcolorpicker._process_globals();
dcombo._process_globals();
dcounter._process_globals();
ddatepicker._process_globals();
dicon._process_globals();
dlabel._process_globals();
dradio._process_globals();
drichselect._process_globals();
dsearch._process_globals();
dselect._process_globals();
dsegmented._process_globals();
dslider._process_globals();
dswitch._process_globals();
dtabbar._process_globals();
dtext._process_globals();
dtextarea._process_globals();
dtoggle._process_globals();
duploader._process_globals();
dfieldset._process_globals();
dsuggest._process_globals();
dcolumn._process_globals();
modpropertybag._process_globals();
ddesignerproperty._process_globals();
dconnection._process_globals();
dtable._process_globals();
dfield._process_globals();
modwebix._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 4;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Public BANano As BANano 'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 6;BA.debugLine="Public AppName As String = \"FormDesigner\"";
_appname = "FormDesigner";
 //BA.debugLineNum = 7;BA.debugLine="Private Publish As String";
_publish = "";
 //BA.debugLineNum = 8;BA.debugLine="Private BP As BANanoPostProcessor";
_bp = new b4j.example.bananopostprocessor();
 //BA.debugLineNum = 9;BA.debugLine="Public dbName As String";
_dbname = "";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
}
