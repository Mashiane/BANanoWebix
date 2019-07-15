package b4j.example;


import anywheresoftware.b4a.BA;

public class dbutton extends Object{
public static dbutton mostCurrent = new dbutton();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.dbutton", null);
		ba.loadHtSubs(dbutton.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.dbutton", ba);
		}
	}
    public static Class<?> getObject() {
		return dbutton.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static b4j.example.main _main = null;
public static b4j.example.pgformdesigner _pgformdesigner = null;
public static b4j.example.modcenter _modcenter = null;
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
public static String  _buildbag(b4j.example.wixpage _page,b4j.example.wixproperty _bag) throws Exception{
anywheresoftware.b4a.objects.collections.List _align = null;
anywheresoftware.b4a.objects.collections.List _pos = null;
anywheresoftware.b4a.objects.collections.List _btype = null;
anywheresoftware.b4a.objects.collections.List _css = null;
anywheresoftware.b4a.objects.collections.List _act = null;
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
 //BA.debugLineNum = 14;BA.debugLine="Dim bType As List";
_btype = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 15;BA.debugLine="bType.Initialize";
_btype.Initialize();
 //BA.debugLineNum = 16;BA.debugLine="bType.AddAll(Array(\"\",\"icon\", \"iconTop\",\"image\",";
_btype.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(""),(Object)("icon"),(Object)("iconTop"),(Object)("image"),(Object)("imageTop")}));
 //BA.debugLineNum = 18;BA.debugLine="Dim css As List";
_css = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 19;BA.debugLine="css.Initialize";
_css.Initialize();
 //BA.debugLineNum = 20;BA.debugLine="css.addall(Array(\"\",\"webix_secondary\",\"webix_prim";
_css.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(""),(Object)("webix_secondary"),(Object)("webix_primary"),(Object)("webix_danger"),(Object)("webix_transparent")}));
 //BA.debugLineNum = 22;BA.debugLine="Dim act As List";
_act = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 23;BA.debugLine="act.Initialize";
_act.Initialize();
 //BA.debugLineNum = 24;BA.debugLine="act.addall(Array(\"\",\"new\",\"insert\",\"read\", \"updat";
_act.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(""),(Object)("new"),(Object)("insert"),(Object)("read"),(Object)("update"),(Object)("delete")}));
 //BA.debugLineNum = 26;BA.debugLine="Bag.Clear";
_bag._clear /*String*/ ();
 //BA.debugLineNum = 27;BA.debugLine="Bag.AddTextBox(\"id\", \"ID\",\"button1\")";
_bag._addtextbox /*String*/ ("id","ID","button1");
 //BA.debugLineNum = 28;BA.debugLine="Bag.AddTextBox(\"localId\", \"Local ID\", \"button1\")";
_bag._addtextbox /*String*/ ("localId","Local ID","button1");
 //BA.debugLineNum = 29;BA.debugLine="Bag.AddLabel(\"Parent\")";
_bag._addlabel /*String*/ ("Parent");
 //BA.debugLineNum = 30;BA.debugLine="Bag.AddTextBox(\"parentid\",\"Parent\", \"form\")";
_bag._addtextbox /*String*/ ("parentid","Parent","form");
 //BA.debugLineNum = 31;BA.debugLine="Bag.AddCombo(\"addingmethod\",\"Adding Method\",\"AddR";
_bag._addcombo /*String*/ ("addingmethod","Adding Method","AddRows",_pgformdesigner._addingmethod /*anywheresoftware.b4a.objects.collections.List*/ );
 //BA.debugLineNum = 32;BA.debugLine="Bag.AddTextBox(\"tabindex\", \"Tab Index\", \"0\")";
_bag._addtextbox /*String*/ ("tabindex","Tab Index","0");
 //BA.debugLineNum = 33;BA.debugLine="Bag.AddLabel(\"View\")";
_bag._addlabel /*String*/ ("View");
 //BA.debugLineNum = 34;BA.debugLine="Bag.AddCombo(\"view\",\"View\", \"Button\", Page.Views)";
_bag._addcombo /*String*/ ("view","View","Button",_page._views /*anywheresoftware.b4a.objects.collections.List*/ );
 //BA.debugLineNum = 35;BA.debugLine="Bag.AddCombo(\"type\",\"Type\",\"\", bType)";
_bag._addcombo /*String*/ ("type","Type","",_btype);
 //BA.debugLineNum = 36;BA.debugLine="Bag.AddCombo(\"action\",\"Action\",\"\", act)";
_bag._addcombo /*String*/ ("action","Action","",_act);
 //BA.debugLineNum = 37;BA.debugLine="Bag.AddLabel(\"Label\")";
_bag._addlabel /*String*/ ("Label");
 //BA.debugLineNum = 38;BA.debugLine="Bag.AddTextBox(\"label\",\"Text\",\"Button 1\")";
_bag._addtextbox /*String*/ ("label","Text","Button 1");
 //BA.debugLineNum = 39;BA.debugLine="Bag.AddTextBox(\"labelWidth\",\"Width\",\"\")";
_bag._addtextbox /*String*/ ("labelWidth","Width","");
 //BA.debugLineNum = 40;BA.debugLine="Bag.AddTextBox(\"labelHeight\",\"Height\",\"\")";
_bag._addtextbox /*String*/ ("labelHeight","Height","");
 //BA.debugLineNum = 41;BA.debugLine="Bag.AddCombo(\"labelAlign\",\"Align\",\"\",align)";
_bag._addcombo /*String*/ ("labelAlign","Align","",_align);
 //BA.debugLineNum = 42;BA.debugLine="Bag.AddCombo(\"labelPosition\",\"Position\",\"\",pos)";
_bag._addcombo /*String*/ ("labelPosition","Position","",_pos);
 //BA.debugLineNum = 43;BA.debugLine="Bag.AddLabel(\"Details\")";
_bag._addlabel /*String*/ ("Details");
 //BA.debugLineNum = 44;BA.debugLine="Bag.AddTextBox(\"value\", \"Value\",\"\")";
_bag._addtextbox /*String*/ ("value","Value","");
 //BA.debugLineNum = 45;BA.debugLine="Bag.AddTextBox(\"name\", \"Name\",\"\")";
_bag._addtextbox /*String*/ ("name","Name","");
 //BA.debugLineNum = 46;BA.debugLine="Bag.AddTextBox(\"tooltip\", \"Tooltip\",\"\")";
_bag._addtextbox /*String*/ ("tooltip","Tooltip","");
 //BA.debugLineNum = 47;BA.debugLine="Bag.AddTextBox(\"icon\", \"Icon\",\"\")";
_bag._addtextbox /*String*/ ("icon","Icon","");
 //BA.debugLineNum = 48;BA.debugLine="Bag.AddTextBox(\"image\", \"Image\",\"\")";
_bag._addtextbox /*String*/ ("image","Image","");
 //BA.debugLineNum = 49;BA.debugLine="Bag.AddTextBox(\"batch\", \"Batch\",\"\")";
_bag._addtextbox /*String*/ ("batch","Batch","");
 //BA.debugLineNum = 50;BA.debugLine="Bag.AddTextBox(\"popup\", \"PopUp\",\"\")";
_bag._addtextbox /*String*/ ("popup","PopUp","");
 //BA.debugLineNum = 51;BA.debugLine="Bag.AddTextBox(\"badge\", \"Badge\",\"\")";
_bag._addtextbox /*String*/ ("badge","Badge","");
 //BA.debugLineNum = 52;BA.debugLine="Bag.AddCheckBox(\"autowidth\", \"Auto width \",\"\")";
_bag._addcheckbox /*String*/ ("autowidth","Auto width ","");
 //BA.debugLineNum = 53;BA.debugLine="Bag.AddCombo(\"css\", \"CSS\",\"\", css)";
_bag._addcombo /*String*/ ("css","CSS","",_css);
 //BA.debugLineNum = 54;BA.debugLine="Bag.AddLabel(\"Size\")";
_bag._addlabel /*String*/ ("Size");
 //BA.debugLineNum = 55;BA.debugLine="Bag.AddTextBox(\"width\",\"Width\",\"100\")";
_bag._addtextbox /*String*/ ("width","Width","100");
 //BA.debugLineNum = 56;BA.debugLine="Bag.AddTextBox(\"height\",\"Height\",\"\")";
_bag._addtextbox /*String*/ ("height","Height","");
 //BA.debugLineNum = 57;BA.debugLine="Bag.AddLabel(\"Event\")";
_bag._addlabel /*String*/ ("Event");
 //BA.debugLineNum = 58;BA.debugLine="Bag.AddTextBox(\"click\",\"On Click\",\"BANano.CallBac";
_bag._addtextbox /*String*/ ("click","On Click","BANano.CallBack(Me,button1_click,Null)");
 //BA.debugLineNum = 59;BA.debugLine="Bag.Refresh(Page)";
_bag._refresh /*String*/ (_page);
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="End Sub";
return "";
}
}
