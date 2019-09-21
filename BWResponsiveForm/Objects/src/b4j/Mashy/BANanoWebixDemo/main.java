package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;

public class main extends javafx.application.Application{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.Mashy.BANanoWebixDemo.main", ba);
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
public static b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public static b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public static b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public static b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public static b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
 //BA.debugLineNum = 57;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return false;
}
public static String  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
String _version = "";
String _appfile = "";
 //BA.debugLineNum = 11;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
 //BA.debugLineNum = 12;BA.debugLine="Publish = \"C:\\xampp\\htdocs\"";
_publish = "C:\\xampp\\htdocs";
 //BA.debugLineNum = 13;BA.debugLine="Publish = \"c:\\laragon\\www\"";
_publish = "c:\\laragon\\www";
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
 //BA.debugLineNum = 21;BA.debugLine="BANano.Header.AddCSSFile(\"materialdesignicons.min";
_banano.Header.AddCSSFile("materialdesignicons.min.css");
 //BA.debugLineNum = 22;BA.debugLine="BANano.Header.AddCSSFile(\"webix.min.css\")";
_banano.Header.AddCSSFile("webix.min.css");
 //BA.debugLineNum = 23;BA.debugLine="BANano.Header.AddCSSFile(\"hint.css\")";
_banano.Header.AddCSSFile("hint.css");
 //BA.debugLineNum = 26;BA.debugLine="BANano.Header.AddCSSFile(\"material.min.css\")";
_banano.Header.AddCSSFile("material.min.css");
 //BA.debugLineNum = 31;BA.debugLine="BANano.Header.AddJavascriptFile(\"webix.min.js\")";
_banano.Header.AddJavascriptFile("webix.min.js");
 //BA.debugLineNum = 32;BA.debugLine="BANano.Header.AddJavascriptFile(\"hint.js\")";
_banano.Header.AddJavascriptFile("hint.js");
 //BA.debugLineNum = 38;BA.debugLine="BANano.TranspilerOptions.UseServiceWorker = False";
_banano.TranspilerOptions.setUseServiceWorker(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 39;BA.debugLine="BANano.Build(Publish)";
_banano.Build(_publish);
 //BA.debugLineNum = 41;BA.debugLine="BP.Initialize";
_bp._initialize(ba);
 //BA.debugLineNum = 42;BA.debugLine="BP.PublishPath = Publish";
_bp._publishpath = _publish;
 //BA.debugLineNum = 43;BA.debugLine="BP.ShortName = AppName";
_bp._shortname = _appname;
 //BA.debugLineNum = 44;BA.debugLine="BP.AssetsPath = BANano.ASSETS_FOLDER";
_bp._assetspath = _banano.ASSETS_FOLDER;
 //BA.debugLineNum = 45;BA.debugLine="BP.ScriptsPath = BANano.SCRIPTS_FOLDER";
_bp._scriptspath = _banano.SCRIPTS_FOLDER;
 //BA.debugLineNum = 46;BA.debugLine="BP.StylesPath = BANano.STYLES_FOLDER";
_bp._stylespath = _banano.STYLES_FOLDER;
 //BA.debugLineNum = 47;BA.debugLine="BP.ScriptFile = BANano.JAVASCRIPT_NAME";
_bp._scriptfile = _banano.JAVASCRIPT_NAME;
 //BA.debugLineNum = 48;BA.debugLine="BP.UnzipFonts";
_bp._unzipfonts();
 //BA.debugLineNum = 49;BA.debugLine="BP.UnzipFile(\"extras.zip\")";
_bp._unzipfile("extras.zip");
 //BA.debugLineNum = 50;BA.debugLine="BP.CopyConfig";
_bp._copyconfig();
 //BA.debugLineNum = 51;BA.debugLine="BP.Open(True)";
_bp._open(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 52;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return "";
}
public static String  _banano_ready() throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub BANano_Ready()";
 //BA.debugLineNum = 63;BA.debugLine="pgIndex.init(\"body\")";
_pgindex._init /*String*/ ("body");
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return "";
}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main._process_globals();
modsidebar._process_globals();
pgindex._process_globals();
modarchivi._process_globals();
modclient._process_globals();
modwebix._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 4;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Public BANano As BANano 'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 6;BA.debugLine="Public AppName As String = \"ResponsiveForm\"";
_appname = "ResponsiveForm";
 //BA.debugLineNum = 7;BA.debugLine="Private Publish As String";
_publish = "";
 //BA.debugLineNum = 8;BA.debugLine="Private BP As BANanoPostProcessor";
_bp = new b4j.example.bananopostprocessor();
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
}
