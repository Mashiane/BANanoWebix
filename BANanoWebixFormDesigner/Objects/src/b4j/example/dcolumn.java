package b4j.example;


import anywheresoftware.b4a.BA;

public class dcolumn extends Object{
public static dcolumn mostCurrent = new dcolumn();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.dcolumn", null);
		ba.loadHtSubs(dcolumn.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.dcolumn", ba);
		}
	}
    public static Class<?> getObject() {
		return dcolumn.class;
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
public static b4j.example.modpropertybag _modpropertybag = null;
public static b4j.example.ddesignerproperty _ddesignerproperty = null;
public static b4j.example.dconnection _dconnection = null;
public static b4j.example.dtable _dtable = null;
public static b4j.example.dfield _dfield = null;
public static b4j.example.modwebix _modwebix = null;
public static String  _buildbag(b4j.example.wixpage _page,b4j.example.wixproperty _bag) throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub BuildBag(Page As WixPage, Bag As WixProperty)";
 //BA.debugLineNum = 7;BA.debugLine="Bag.Clear";
_bag._clear /*b4j.example.wixproperty*/ ();
 //BA.debugLineNum = 8;BA.debugLine="Bag.AddTextBox(\"id\", \"ID\",\"r1c1\")";
_bag._addtextbox /*b4j.example.wixproperty*/ ("id","ID","r1c1");
 //BA.debugLineNum = 9;BA.debugLine="Bag.AddTextBox(\"localId\", \"Local ID\", \"\")";
_bag._addtextbox /*b4j.example.wixproperty*/ ("localId","Local ID","");
 //BA.debugLineNum = 10;BA.debugLine="Bag.AddLabel(\"Parent\")";
_bag._addlabel /*b4j.example.wixproperty*/ ("Parent");
 //BA.debugLineNum = 11;BA.debugLine="Bag.AddTextBox(\"parentid\",\"Parent\", \"r1\")";
_bag._addtextbox /*b4j.example.wixproperty*/ ("parentid","Parent","r1");
 //BA.debugLineNum = 12;BA.debugLine="Bag.AddCombo(\"addingmethod\",\"Adding Method\",\"AddC";
_bag._addcombo /*b4j.example.wixproperty*/ ("addingmethod","Adding Method","AddColumns",_pgformdesigner._addingmethod /*anywheresoftware.b4a.objects.collections.List*/ );
 //BA.debugLineNum = 13;BA.debugLine="Bag.AddTextBox(\"tabindex\", \"Tab Index\", \"0\")";
_bag._addtextbox /*b4j.example.wixproperty*/ ("tabindex","Tab Index","0");
 //BA.debugLineNum = 14;BA.debugLine="Bag.AddLabel(\"View\")";
_bag._addlabel /*b4j.example.wixproperty*/ ("View");
 //BA.debugLineNum = 15;BA.debugLine="Bag.AddCombo(\"view\",\"View\", \"column\", Page.views)";
_bag._addcombo /*b4j.example.wixproperty*/ ("view","View","column",_page._views /*anywheresoftware.b4a.objects.collections.List*/ );
 //BA.debugLineNum = 16;BA.debugLine="Bag.AddTextBox(\"type\",\"Type\",\"\")";
_bag._addtextbox /*b4j.example.wixproperty*/ ("type","Type","");
 //BA.debugLineNum = 17;BA.debugLine="Bag.AddLabel(\"Details\")";
_bag._addlabel /*b4j.example.wixproperty*/ ("Details");
 //BA.debugLineNum = 18;BA.debugLine="Bag.AddTextBox(\"value\", \"Value\",\"\")";
_bag._addtextbox /*b4j.example.wixproperty*/ ("value","Value","");
 //BA.debugLineNum = 19;BA.debugLine="Bag.AddTextBox(\"name\", \"Name\",\"\")";
_bag._addtextbox /*b4j.example.wixproperty*/ ("name","Name","");
 //BA.debugLineNum = 20;BA.debugLine="Bag.AddTextBox(\"gravity\", \"Gravity\",\"\")";
_bag._addtextbox /*b4j.example.wixproperty*/ ("gravity","Gravity","");
 //BA.debugLineNum = 21;BA.debugLine="Bag.AddTextBox(\"template\",\"Template\",\"r1c1\")";
_bag._addtextbox /*b4j.example.wixproperty*/ ("template","Template","r1c1");
 //BA.debugLineNum = 22;BA.debugLine="Bag.AddTextBox(\"batch\", \"Batch\",\"\")";
_bag._addtextbox /*b4j.example.wixproperty*/ ("batch","Batch","");
 //BA.debugLineNum = 23;BA.debugLine="Bag.AddCheckBox(\"autoWidth\", \"Auto width \",\"\")";
_bag._addcheckbox /*b4j.example.wixproperty*/ ("autoWidth","Auto width ","");
 //BA.debugLineNum = 24;BA.debugLine="Bag.AddCheckBox(\"autoHeight\", \"Auto Height \",\"\")";
_bag._addcheckbox /*b4j.example.wixproperty*/ ("autoHeight","Auto Height ","");
 //BA.debugLineNum = 25;BA.debugLine="Bag.AddLabel(\"Style\")";
_bag._addlabel /*b4j.example.wixproperty*/ ("Style");
 //BA.debugLineNum = 26;BA.debugLine="Bag.AddTextBox(\"css\", \"CSS\",\"\")";
_bag._addtextbox /*b4j.example.wixproperty*/ ("css","CSS","");
 //BA.debugLineNum = 27;BA.debugLine="Bag.AddColor(\"style.color\", \"Color\",\"\")";
_bag._addcolor /*b4j.example.wixproperty*/ ("style.color","Color","");
 //BA.debugLineNum = 28;BA.debugLine="Bag.AddColor(\"style.background\", \"Background\",\"\")";
_bag._addcolor /*b4j.example.wixproperty*/ ("style.background","Background","");
 //BA.debugLineNum = 29;BA.debugLine="Bag.AddLabel(\"Size\")";
_bag._addlabel /*b4j.example.wixproperty*/ ("Size");
 //BA.debugLineNum = 30;BA.debugLine="Bag.AddTextBox(\"width\",\"Width\",\"\")";
_bag._addtextbox /*b4j.example.wixproperty*/ ("width","Width","");
 //BA.debugLineNum = 31;BA.debugLine="Bag.AddTextBox(\"height\",\"Height\",\"\")";
_bag._addtextbox /*b4j.example.wixproperty*/ ("height","Height","");
 //BA.debugLineNum = 32;BA.debugLine="Bag.Refresh(Page)";
_bag._refresh /*String*/ (_page);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="End Sub";
return "";
}
}
