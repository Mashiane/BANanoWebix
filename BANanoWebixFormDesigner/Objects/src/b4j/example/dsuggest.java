package b4j.example;


import anywheresoftware.b4a.BA;

public class dsuggest extends Object{
public static dsuggest mostCurrent = new dsuggest();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.dsuggest", null);
		ba.loadHtSubs(dsuggest.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.dsuggest", ba);
		}
	}
    public static Class<?> getObject() {
		return dsuggest.class;
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
public static b4j.example.dcolumn _dcolumn = null;
public static b4j.example.modpropertybag _modpropertybag = null;
public static b4j.example.ddesignerproperty _ddesignerproperty = null;
public static b4j.example.dconnection _dconnection = null;
public static b4j.example.dtable _dtable = null;
public static b4j.example.dfield _dfield = null;
public static b4j.example.modwebix _modwebix = null;
public static String  _buildbag(b4j.example.wixpage _page,b4j.example.wixproperty _bag) throws Exception{
anywheresoftware.b4a.objects.collections.List _align = null;
anywheresoftware.b4a.objects.collections.List _pos = null;
anywheresoftware.b4a.objects.collections.List _rel = null;
 //BA.debugLineNum = 5;BA.debugLine="Sub BuildBag(Page As WixPage, Bag As WixProperty)";
 //BA.debugLineNum = 6;BA.debugLine="Dim align As List";
_align = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 7;BA.debugLine="align.Initialize";
_align.Initialize();
 //BA.debugLineNum = 8;BA.debugLine="align.AddAll(Array(\"\",\"left\",\"right\"))";
_align.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(""),(Object)("left"),(Object)("right")}));
 //BA.debugLineNum = 10;BA.debugLine="Dim pos As List";
_pos = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 11;BA.debugLine="pos.Initialize";
_pos.Initialize();
 //BA.debugLineNum = 12;BA.debugLine="pos.AddAll(Array(\"\",\"left\",\"top\"))";
_pos.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(""),(Object)("left"),(Object)("top")}));
 //BA.debugLineNum = 14;BA.debugLine="Dim rel As List";
_rel = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 15;BA.debugLine="rel.Initialize";
_rel.Initialize();
 //BA.debugLineNum = 16;BA.debugLine="rel.AddAll(Array(\"\",\"top\",\"left\",\"right\"))";
_rel.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(""),(Object)("top"),(Object)("left"),(Object)("right")}));
 //BA.debugLineNum = 17;BA.debugLine="Bag.Clear";
_bag._clear /*b4j.example.wixproperty*/ ();
 //BA.debugLineNum = 18;BA.debugLine="Bag.AddTextBox(\"id\", \"ID\",\"suggest1\")";
_bag._addtextbox /*b4j.example.wixproperty*/ ("id","ID","suggest1");
 //BA.debugLineNum = 19;BA.debugLine="Bag.AddTextBox(\"localId\", \"Local ID\", \"\")";
_bag._addtextbox /*b4j.example.wixproperty*/ ("localId","Local ID","");
 //BA.debugLineNum = 20;BA.debugLine="Bag.AddLabel(\"Parent\")";
_bag._addlabel /*b4j.example.wixproperty*/ ("Parent");
 //BA.debugLineNum = 21;BA.debugLine="Bag.AddTextBox(\"parentid\",\"Parent\", \"form\")";
_bag._addtextbox /*b4j.example.wixproperty*/ ("parentid","Parent","form");
 //BA.debugLineNum = 22;BA.debugLine="Bag.AddCombo(\"addingmethod\",\"Adding Method\",\"AddR";
_bag._addcombo /*b4j.example.wixproperty*/ ("addingmethod","Adding Method","AddRows",_pgformdesigner._addingmethod /*anywheresoftware.b4a.objects.collections.List*/ );
 //BA.debugLineNum = 23;BA.debugLine="Bag.AddTextBox(\"tabindex\", \"Tab Index\", \"0\")";
_bag._addtextbox /*b4j.example.wixproperty*/ ("tabindex","Tab Index","0");
 //BA.debugLineNum = 24;BA.debugLine="Bag.AddLabel(\"View\")";
_bag._addlabel /*b4j.example.wixproperty*/ ("View");
 //BA.debugLineNum = 25;BA.debugLine="Bag.AddCombo(\"view\",\"View\", \"suggest\", Page.views";
_bag._addcombo /*b4j.example.wixproperty*/ ("view","View","suggest",_page._views /*anywheresoftware.b4a.objects.collections.List*/ );
 //BA.debugLineNum = 26;BA.debugLine="Bag.AddLabel(\"Details\")";
_bag._addlabel /*b4j.example.wixproperty*/ ("Details");
 //BA.debugLineNum = 27;BA.debugLine="Bag.AddTextBox(\"name\", \"Name\",\"\")";
_bag._addtextbox /*b4j.example.wixproperty*/ ("name","Name","");
 //BA.debugLineNum = 28;BA.debugLine="Bag.AddCombo(\"relative\",\"Relative\",\"\",rel)";
_bag._addcombo /*b4j.example.wixproperty*/ ("relative","Relative","",_rel);
 //BA.debugLineNum = 29;BA.debugLine="Bag.AddCheckBox(\"fitMaster\",\"Fit Master\",\"\")";
_bag._addcheckbox /*b4j.example.wixproperty*/ ("fitMaster","Fit Master","");
 //BA.debugLineNum = 30;BA.debugLine="Bag.AddTextBox(\"yCount\",\"Y Count\",\"\")";
_bag._addtextbox /*b4j.example.wixproperty*/ ("yCount","Y Count","");
 //BA.debugLineNum = 31;BA.debugLine="Bag.AddLabel(\"Options\")";
_bag._addlabel /*b4j.example.wixproperty*/ ("Options");
 //BA.debugLineNum = 32;BA.debugLine="Bag.AddTextBox(\"optionsid\",\"IDs\", \"1,2,3\")";
_bag._addtextbox /*b4j.example.wixproperty*/ ("optionsid","IDs","1,2,3");
 //BA.debugLineNum = 33;BA.debugLine="Bag.AddTextBox(\"optionstext\",\"Values\", \"One,Two,T";
_bag._addtextbox /*b4j.example.wixproperty*/ ("optionstext","Values","One,Two,Three");
 //BA.debugLineNum = 34;BA.debugLine="Bag.Refresh(Page)";
_bag._refresh /*String*/ (_page);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="End Sub";
return "";
}
}