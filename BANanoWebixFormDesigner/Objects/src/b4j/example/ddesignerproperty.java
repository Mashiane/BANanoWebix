package b4j.example;


import anywheresoftware.b4a.BA;

public class ddesignerproperty extends Object{
public static ddesignerproperty mostCurrent = new ddesignerproperty();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.ddesignerproperty", null);
		ba.loadHtSubs(ddesignerproperty.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.ddesignerproperty", ba);
		}
	}
    public static Class<?> getObject() {
		return ddesignerproperty.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static b4j.example.main _main = null;
public static b4j.example.pgformdesigner _pgformdesigner = null;
public static b4j.example.dbutton _dbutton = null;
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
public static b4j.example.dconnection _dconnection = null;
public static b4j.example.dtable _dtable = null;
public static b4j.example.dfield _dfield = null;
public static b4j.example.modwebix _modwebix = null;
public static String  _buildbag(b4j.example.wixpage _page,b4j.example.wixproperty _bag) throws Exception{
anywheresoftware.b4a.objects.collections.List _ft = null;
 //BA.debugLineNum = 6;BA.debugLine="Sub BuildBag(Page As WixPage, Bag As WixProperty)";
 //BA.debugLineNum = 7;BA.debugLine="Dim ft As List";
_ft = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 8;BA.debugLine="ft.Initialize";
_ft.Initialize();
 //BA.debugLineNum = 9;BA.debugLine="ft.AddAll(Array(\"\",\"Boolean\",\"Int\", \"String\",\"Col";
_ft.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(""),(Object)("Boolean"),(Object)("Int"),(Object)("String"),(Object)("Color")}));
 //BA.debugLineNum = 11;BA.debugLine="Bag.Clear";
_bag._clear /*String*/ ();
 //BA.debugLineNum = 12;BA.debugLine="Bag.AddTextBox(\"Key\", \"Key\",\"\")";
_bag._addtextbox /*String*/ ("Key","Key","");
 //BA.debugLineNum = 13;BA.debugLine="Bag.AddLabel(\"Parent\")";
_bag._addlabel /*String*/ ("Parent");
 //BA.debugLineNum = 14;BA.debugLine="Bag.AddTextBox(\"parentid\",\"Parent\", \"form\")";
_bag._addtextbox /*String*/ ("parentid","Parent","form");
 //BA.debugLineNum = 15;BA.debugLine="Bag.AddLabel(\"Designer Property\")";
_bag._addlabel /*String*/ ("Designer Property");
 //BA.debugLineNum = 16;BA.debugLine="Bag.AddTextBox(\"DisplayName\",\"Display Name\", \"\")";
_bag._addtextbox /*String*/ ("DisplayName","Display Name","");
 //BA.debugLineNum = 17;BA.debugLine="Bag.AddCombo(\"FieldType\",\"Field Type\",\"AddRows\",";
_bag._addcombo /*String*/ ("FieldType","Field Type","AddRows",_ft);
 //BA.debugLineNum = 18;BA.debugLine="Bag.AddTextBox(\"DefaultValue\", \"Default Value\", \"";
_bag._addtextbox /*String*/ ("DefaultValue","Default Value","");
 //BA.debugLineNum = 19;BA.debugLine="Bag.AddTextBox(\"MinRange\",\"Min Range\", \"0\")";
_bag._addtextbox /*String*/ ("MinRange","Min Range","0");
 //BA.debugLineNum = 20;BA.debugLine="Bag.AddTextBox(\"MaxRange\", \"Max Range\", \"100\")";
_bag._addtextbox /*String*/ ("MaxRange","Max Range","100");
 //BA.debugLineNum = 21;BA.debugLine="Bag.AddTextBox(\"List\", \"List\",\"Sunday|Monday|Tues";
_bag._addtextbox /*String*/ ("List","List","Sunday|Monday|Tuesday");
 //BA.debugLineNum = 22;BA.debugLine="Bag.AddTextBox(\"Description\", \"Description\",\"\")";
_bag._addtextbox /*String*/ ("Description","Description","");
 //BA.debugLineNum = 23;BA.debugLine="Bag.AddCheckBox(\"hasSet\", \"Can Set\", True)";
_bag._addcheckbox /*String*/ ("hasSet","Can Set",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.True));
 //BA.debugLineNum = 24;BA.debugLine="Bag.AddCheckBox(\"hasGet\", \"Can Get\", True)";
_bag._addcheckbox /*String*/ ("hasGet","Can Get",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.True));
 //BA.debugLineNum = 25;BA.debugLine="Bag.AddLabel(\"Links\")";
_bag._addlabel /*String*/ ("Links");
 //BA.debugLineNum = 26;BA.debugLine="Bag.AddTextBox(\"attributeName\", \"Attribute\",\"\")";
_bag._addtextbox /*String*/ ("attributeName","Attribute","");
 //BA.debugLineNum = 27;BA.debugLine="Bag.AddTextBox(\"className\", \"Class\",\"\")";
_bag._addtextbox /*String*/ ("className","Class","");
 //BA.debugLineNum = 28;BA.debugLine="Bag.AddCheckBox(\"conditional\", \"Conditional\", Tru";
_bag._addcheckbox /*String*/ ("conditional","Conditional",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.True));
 //BA.debugLineNum = 29;BA.debugLine="Bag.Refresh(Page)";
_bag._refresh /*String*/ (_page);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return "";
}
}
