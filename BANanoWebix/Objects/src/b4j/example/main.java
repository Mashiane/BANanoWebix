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
public static b4j.example.pgforms1 _pgforms1 = null;
public static b4j.example.pgforms _pgforms = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.pgdatatable _pgdatatable = null;
public static b4j.example.pglayout _pglayout = null;
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
 //BA.debugLineNum = 43;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return false;
}
public static String  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
String _version = "";
String _appfile = "";
 //BA.debugLineNum = 11;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
 //BA.debugLineNum = 12;BA.debugLine="Publish = \"C:\\xampp\\htdocs\"";
_publish = "C:\\xampp\\htdocs";
 //BA.debugLineNum = 13;BA.debugLine="Dim version As String = DateTime.now";
_version = BA.NumberToString(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
 //BA.debugLineNum = 14;BA.debugLine="Dim appFile As String = $\"app${version}.js\"$";
_appfile = ("app"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_version))+".js");
 //BA.debugLineNum = 15;BA.debugLine="BANano.Initialize(\"BANano\", AppName,1)";
_banano.Initialize("BANano",_appname,(long) (1));
 //BA.debugLineNum = 16;BA.debugLine="BANano.HTML_NAME = \"index.html\"";
_banano.HTML_NAME = "index.html";
 //BA.debugLineNum = 17;BA.debugLine="BANano.UseServiceWorker = False";
_banano.setUseServiceWorker(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 18;BA.debugLine="BANano.Header.Title = AppName";
_banano.Header.Title = _appname;
 //BA.debugLineNum = 19;BA.debugLine="BANano.JAVASCRIPT_NAME = appFile";
_banano.JAVASCRIPT_NAME = _appfile;
 //BA.debugLineNum = 20;BA.debugLine="BANano.Header.AddCSSFile(\"webix.min.css\")";
_banano.Header.AddCSSFile("webix.min.css");
 //BA.debugLineNum = 21;BA.debugLine="BANano.Header.AddJavascriptFile(\"webix.min.js\")";
_banano.Header.AddJavascriptFile("webix.min.js");
 //BA.debugLineNum = 27;BA.debugLine="BANano.Build(Publish)";
_banano.Build(_publish);
 //BA.debugLineNum = 29;BA.debugLine="BP.Initialize";
_bp._initialize(ba);
 //BA.debugLineNum = 30;BA.debugLine="BP.PublishPath = Publish";
_bp._publishpath = _publish;
 //BA.debugLineNum = 31;BA.debugLine="BP.ShortName = AppName";
_bp._shortname = _appname;
 //BA.debugLineNum = 32;BA.debugLine="BP.AssetsPath = BANano.ASSETS_FOLDER";
_bp._assetspath = _banano.ASSETS_FOLDER;
 //BA.debugLineNum = 33;BA.debugLine="BP.ScriptsPath = BANano.SCRIPTS_FOLDER";
_bp._scriptspath = _banano.SCRIPTS_FOLDER;
 //BA.debugLineNum = 34;BA.debugLine="BP.StylesPath = BANano.STYLES_FOLDER";
_bp._stylespath = _banano.STYLES_FOLDER;
 //BA.debugLineNum = 35;BA.debugLine="BP.ScriptFile = BANano.JAVASCRIPT_NAME";
_bp._scriptfile = _banano.JAVASCRIPT_NAME;
 //BA.debugLineNum = 36;BA.debugLine="BP.UnzipFonts";
_bp._unzipfonts();
 //BA.debugLineNum = 37;BA.debugLine="BP.Open(True)";
_bp._open(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 38;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return "";
}
public static String  _banano_ready() throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub BANano_Ready()";
 //BA.debugLineNum = 47;BA.debugLine="pgLayout.init";
_pglayout._init /*String*/ ();
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return "";
}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main._process_globals();
pgforms1._process_globals();
pgforms._process_globals();
pgindex._process_globals();
pgdatatable._process_globals();
pglayout._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 4;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Public BANano As BANano 'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 6;BA.debugLine="Public AppName As String = \"Webix\"";
_appname = "Webix";
 //BA.debugLineNum = 7;BA.debugLine="Private Publish As String";
_publish = "";
 //BA.debugLineNum = 8;BA.debugLine="Private BP As BANanoPostProcessor";
_bp = new b4j.example.bananopostprocessor();
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
}
