package b4j.example;


import anywheresoftware.b4a.BA;

public class drow extends Object{
public static drow mostCurrent = new drow();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.drow", null);
		ba.loadHtSubs(drow.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.drow", ba);
		}
	}
    public static Class<?> getObject() {
		return drow.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static b4j.example.main _main = null;
public static b4j.example.pgformdesigner _pgformdesigner = null;
public static b4j.example.dbutton _dbutton = null;
public static b4j.example.modcenter _modcenter = null;
public static b4j.example.modsidebar _modsidebar = null;
public static b4j.example.modtoolbar _modtoolbar = null;
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
public static String  _buildbag(b4j.example.wixpage _page,b4j.example.wixproperty _bag) throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub BuildBag(Page As WixPage, Bag As WixProperty)";
 //BA.debugLineNum = 6;BA.debugLine="Bag.Clear";
_bag._clear /*String*/ ();
 //BA.debugLineNum = 7;BA.debugLine="Bag.AddTextBox(\"id\", \"ID\",\"r1\")";
_bag._addtextbox /*String*/ ("id","ID","r1");
 //BA.debugLineNum = 8;BA.debugLine="Bag.AddTextBox(\"localId\", \"Local ID\", \"r1\")";
_bag._addtextbox /*String*/ ("localId","Local ID","r1");
 //BA.debugLineNum = 9;BA.debugLine="Bag.AddLabel(\"Parent\")";
_bag._addlabel /*String*/ ("Parent");
 //BA.debugLineNum = 10;BA.debugLine="Bag.AddTextBox(\"parentid\",\"Parent\", \"form\")";
_bag._addtextbox /*String*/ ("parentid","Parent","form");
 //BA.debugLineNum = 11;BA.debugLine="Bag.AddCombo(\"addingmethod\",\"Adding Method\",\"AddR";
_bag._addcombo /*String*/ ("addingmethod","Adding Method","AddRows",_pgformdesigner._addingmethod /*anywheresoftware.b4a.objects.collections.List*/ );
 //BA.debugLineNum = 12;BA.debugLine="Bag.AddTextBox(\"tabindex\", \"Tab Index\", \"0\")";
_bag._addtextbox /*String*/ ("tabindex","Tab Index","0");
 //BA.debugLineNum = 13;BA.debugLine="Bag.AddLabel(\"View\")";
_bag._addlabel /*String*/ ("View");
 //BA.debugLineNum = 14;BA.debugLine="Bag.AddCombo(\"view\",\"View\", \"row\", Page.views)";
_bag._addcombo /*String*/ ("view","View","row",_page._views /*anywheresoftware.b4a.objects.collections.List*/ );
 //BA.debugLineNum = 15;BA.debugLine="Bag.AddTextBox(\"type\",\"Type\",\"\")";
_bag._addtextbox /*String*/ ("type","Type","");
 //BA.debugLineNum = 16;BA.debugLine="Bag.AddLabel(\"Details\")";
_bag._addlabel /*String*/ ("Details");
 //BA.debugLineNum = 17;BA.debugLine="Bag.AddTextBox(\"value\", \"Value\",\"\")";
_bag._addtextbox /*String*/ ("value","Value","");
 //BA.debugLineNum = 18;BA.debugLine="Bag.AddTextBox(\"name\", \"Name\",\"\")";
_bag._addtextbox /*String*/ ("name","Name","");
 //BA.debugLineNum = 19;BA.debugLine="Bag.AddTextBox(\"template\",\"Template\",\"r1\")";
_bag._addtextbox /*String*/ ("template","Template","r1");
 //BA.debugLineNum = 20;BA.debugLine="Bag.AddTextBox(\"batch\", \"Batch\",\"\")";
_bag._addtextbox /*String*/ ("batch","Batch","");
 //BA.debugLineNum = 21;BA.debugLine="Bag.AddCheckBox(\"autoWidth\", \"Auto width \",\"\")";
_bag._addcheckbox /*String*/ ("autoWidth","Auto width ","");
 //BA.debugLineNum = 22;BA.debugLine="Bag.AddCheckBox(\"autoHeight\", \"Auto Height \",\"\")";
_bag._addcheckbox /*String*/ ("autoHeight","Auto Height ","");
 //BA.debugLineNum = 23;BA.debugLine="Bag.AddLabel(\"Style\")";
_bag._addlabel /*String*/ ("Style");
 //BA.debugLineNum = 24;BA.debugLine="Bag.AddTextBox(\"css\", \"CSS\",\"\")";
_bag._addtextbox /*String*/ ("css","CSS","");
 //BA.debugLineNum = 25;BA.debugLine="Bag.AddColor(\"style.color\", \"Color\",\"\")";
_bag._addcolor /*String*/ ("style.color","Color","");
 //BA.debugLineNum = 26;BA.debugLine="Bag.AddColor(\"style.background\", \"Background\",\"#C";
_bag._addcolor /*String*/ ("style.background","Background","#C0C0C0");
 //BA.debugLineNum = 27;BA.debugLine="Bag.AddLabel(\"Size\")";
_bag._addlabel /*String*/ ("Size");
 //BA.debugLineNum = 28;BA.debugLine="Bag.AddTextBox(\"width\",\"Width\",\"\")";
_bag._addtextbox /*String*/ ("width","Width","");
 //BA.debugLineNum = 29;BA.debugLine="Bag.AddTextBox(\"height\",\"Height\",\"\")";
_bag._addtextbox /*String*/ ("height","Height","");
 //BA.debugLineNum = 30;BA.debugLine="Bag.Refresh(Page)";
_bag._refresh /*String*/ (_page);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="End Sub";
return "";
}
}
